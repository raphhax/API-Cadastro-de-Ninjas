package dev.raphhax.CadastroDeNinja.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.raphhax.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity //tudo abaixo eh uma entidade
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    // o @Id fica sem ponto e virgula pq ela fecha no primeiro ponto e virgula, que no caso eh logo depois de id,
    // por isso ela entende que a variavel id eh a que deve estar relacionada com a anotacao @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o id automaticamente
    private Long id;
    private String nomeMissao;
    private DificuldadeMissoes dificuldadeMissoes;

    @OneToMany(mappedBy = "missoes") // Uma missao pode ter varios ninjas
    @JsonIgnore // ignorar possivel problema de lista infinita na serializacao
    private List<NinjaModel> ninjas;

}
