package dev.raphhax.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // como isso eh uma classe de Service, usamos essa anotation
public class NinjaService {
    // service eh a camada responsavel pela logica

    // autowired serve para criar o construtor quando injetamos uma dependencia como NinjaRepository, porem
    // eh convencao usarmos os construtores explicitos diretamente aqui no Service
    // @Autowired
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
    }

    // Lista todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Lista ninja por ID
    public NinjaModel mostrarTodosOsNinjasPorID(Long id) {
        Optional<NinjaModel> ninjaDoId = ninjaRepository.findById(id);
        return ninjaDoId.orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    public NinjaModel editarNinjaPorID(Long id, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }

    // Deletar um ninja tem que ser void pq nao retorn nada
    public void deletarNinjaPorID(Long id){
        ninjaRepository.deleteById(id);
    }

}