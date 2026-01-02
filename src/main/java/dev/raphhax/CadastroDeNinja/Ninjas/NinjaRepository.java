package dev.raphhax.CadastroDeNinja.Ninjas;

// JPA tem um compilado de metodos pra eu chamar depois pro usuario usar, tipo salvar, adicionar, etc do bd
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
