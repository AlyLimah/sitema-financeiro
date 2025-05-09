package sistema.banco.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import sistema.banco.api.endereco.Endereco;
import sistema.banco.api.pessoa.*;

@RestController
@RequestMapping("cadastro")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoa dados) {
        var pessoa = new Pessoa(dados);;
        repository.save(pessoa);
    }


