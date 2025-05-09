package sistema.banco.api.pessoa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sistema.banco.api.endereco.DadosEndereco;
import sistema.banco.api.endereco.Endereco;

@Table(name = "pessoa")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "nome")
public class Pessoa {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String email;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private TipoLancamento tipoLancamento;

    @Embedded
    private DadosEndereco endereco;

    public Pessoa(DadosCadastroPessoa dados) {
    }
}
