package dev.raphhax.CadastroDeNinja.Ninjas;

import dev.raphhax.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// jakarta = JPA = Java Persistence API
// Essa classe Ninja vira uma entidade do meu banco de dados através do entity
@Entity
@Table(name = "tb_cadastro") // tb = table = boa pratica para nomear tabelas
@Data // Annotation de Criacao automatica de getters e setters
@NoArgsConstructor // Criacao automatica de construtor vazio
@AllArgsConstructor // Criacao automatica de construtores completos
public class NinjaModel {

    @Id // para informar que a variavel logo abaixo (id) será o "Id" do Banco de Dados.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para falar como(qual a estratégia) o ID será gerado automaticamente
    // As variaveis abaixo sao colunas da nossa tabela tb_cadastro
    @Column(name = "id")
    private long id; // Gerado como numeros sequenciais por conta do @GeneratedValue

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "idade")
    private int idade;

    @ManyToOne // Um ninja tem uma UNICA missao dentre as varias missoes disponiveis
    @JoinColumn(name = "missoes_id") // Foreing Key ou Chave Estrangeira -> Serve meio que pra juntar o que vem de
    // uma tabela com oq vem de outra, dai missoes_id vira uma nova coluna que terá a chave estrangeira, que pegará
    // informacoes de pelo menos duas tabelas
    private MissoesModel missoes;

}
