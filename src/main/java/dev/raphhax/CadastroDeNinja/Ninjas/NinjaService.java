package dev.raphhax.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

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
}