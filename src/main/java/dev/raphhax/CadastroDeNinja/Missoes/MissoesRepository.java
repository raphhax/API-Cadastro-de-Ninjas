package dev.raphhax.CadastroDeNinja.Missoes;


import org.springframework.data.jpa.repository.JpaRepository;


// JPA eh responsavel por escanear automaticamente os dados que colocamos no nosso Model e os adicionar na tabela do BD,
// dai ele usa ORM(mapeamento de objeto relacional) para ficar fazendo a leitura toda hora o dia inteiro sozinho.

// Eu passo 2 argumentos abaixo para mostrar qual eh o arquivo que eu quero que ele fique escaneando automaticamnete, e
// o Long eh o tipo do Id que esta no nosso MissoesModel

// ORM eh a traducao do que escrevemos em java na classe model para a linguagem do JPA/BD, pq ele nao entende String por
// ex, ele entende como varchar(255), dai ele pega ela classe, le e mapeia tudo para como o BD entende.
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
