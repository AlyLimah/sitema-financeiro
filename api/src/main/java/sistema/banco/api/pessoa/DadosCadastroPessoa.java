package sistema.banco.api.pessoa;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import sistema.banco.api.endereco.DadosEndereco;

public record DadosCadastroPessoa(
                                  @NotBlank
                                  String nome,
                                  @NotBlank
                                  @Email
                                  String Email,

                                  @NotBlank
                                  String Telefone,

                                  @NotNull @Valid DadosEndereco endereco) {






}
