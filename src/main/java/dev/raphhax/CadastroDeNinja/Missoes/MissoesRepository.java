package dev.raphhax.CadastroDeNinja.Missoes;


import org.springframework.data.jpa.repository.JpaRepository;


// JPA eh responsavel por escanear automaticamente os dados que colocamos no nosso Model e os adicionar na tabela do BD,
// dai ele usa ORM para ficar fazendo a leitura toda hora o dia inteiro sozinho.
// Eu passo 2 argumentos abaixo para mostrar qual eh o arquivo que eu quero que ele fique escaniando automaticamnete, e
// o Long eh o tipo do Id que esta no nosso MissoesModel
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
