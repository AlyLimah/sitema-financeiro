package sistema.banco.api.pessoa;

import java.math.BigDecimal;
import java.util.Date;

public record Lancamento(
        String descricao,
        Date dataVencimento,
        Date datePagamento,
        BigDecimal valor,
        String observacao,
        Categoria categoria)
{
}
