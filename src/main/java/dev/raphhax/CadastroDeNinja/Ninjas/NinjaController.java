package dev.raphhax.CadastroDeNinja.Ninjas;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }


    @GetMapping ("/boasVindas")
    public String boasVindas(){
        return "Minha primeira mensagem.";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel){
        // Essa funcao pega o requestBody que exige um json, dai para salvar manda o json
        // Com todas as info do nosso ninja para o nosso obj ninjaService, nele chama o
        // Metodo salvar que ja salva automaticamente, pq tem a propriedade INSERT
        return ninjaService.criarNinja(ninjaModel);
    }


    // Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    // @PathVariable serve para pegar variavel do link da urll
    public NinjaModel mostrarTodosOsNinjasPorID(@PathVariable Long id){
        return ninjaService.mostrarTodosOsNinjasPorID(id);
    }

    // Atualizar Ninja por ID (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel editarNinjaPorID(@PathVariable Long id, @RequestBody NinjaModel ninjaModel){
        return ninjaService.editarNinjaPorID(id, ninjaModel);
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    //@PathVariable sempre usado para pegar um valor que o usuario vai passar
    public void deletarNinjaPorID(@PathVariable Long id) {
        ninjaService.deletarNinjaPorID(id);
    }

}