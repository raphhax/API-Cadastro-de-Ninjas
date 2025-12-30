package dev.raphhax.CadastroDeNinja.Ninjas;

import dev.raphhax.CadastroDeNinja.Missoes.Missoes;
import jakarta.persistence.*;
import java.util.List;

// jakarta = JPA = Java Persistence API
// Essa classe Ninja vira uma entidade do meu banco de dados através do entity
@Entity
@Table(name = "tb_cadastro") // tb = table = boa pratica para nomear tabelas
public class NinjaModel {

    @Id // para informar que a variavel logo abaixo (id) será o "Id" do Banco de Dados.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para falar como(qual a estratégia) o ID será gerado automaticamente
    // As variaveis abaixo sao colunas da nossa tabela tb_cadastro
    private Long id; // Gerado como numeros sequenciais por conta do @GeneratedValue
    private String nome;
    private String email;
    private int idade;
    private List<Missoes> missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}
