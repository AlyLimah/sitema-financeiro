package sistema.banco.api.endereco;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sistema.banco.api.pessoa.DadosCadastroPessoa;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;



    public Endereco(@Valid DadosCadastroPessoa dados) {

    }

    public Endereco(DadosEndereco dados) {

        this.logradouro = dados.longadouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.cidade = dados.cidade();
    }

    }


