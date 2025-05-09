package sistema.banco.api.pessoa;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public record Categoria(String nome) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
}
