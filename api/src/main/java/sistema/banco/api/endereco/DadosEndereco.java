package sistema.banco.api.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosEndereco(

        String longadouro,
        String numero,
        String complemento,
        String bairro,
        String cep,
        String cidade,
        String estado) {



}
