package dev.raphhax.CadastroDeNinja.Missoes;

import dev.raphhax.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity //tudo abaixo eh uma entidade
@Table(name = "tb_missoes")
public class Missoes {

    @Id
    // o @Id fica sem ponto e virgula pq ela fecha no primeiro ponto e virgula, que no caso eh logo depois de id,
    // por isso ela entende que a variavel id eh a que deve estar relacionada com a anotacao @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o id automaticamente
    private Long id;
    private String nomeMissao;
    private DificuldadeMissoes dificuldadeMissoes;
    private NinjaModel ninja;
    public Missoes() {
    }


}
