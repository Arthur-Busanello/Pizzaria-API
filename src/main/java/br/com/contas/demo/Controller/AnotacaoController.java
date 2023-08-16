package br.com.contas.demo.Controller;

import br.com.contas.demo.Service.AnotacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/anotacao")
public class AnotacaoController {

    @Autowired
    private AnotacoesService service;


    @PostMapping
    public ResponseEntity<Anotacao> create_anotation (@RequestBody AnotacaoDTO anotacaoDTO, @PathVariable String name) {
        return service.Create(anotacaoDTO, name);
    };


}
