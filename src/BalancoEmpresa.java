import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {

    private Map<Cnpj, Divida> dividasCNPJ = new HashMap<>();
    private Map<Cpf, Divida> dividasCPF = new HashMap<>();

    public void registraDivida(String credor, Cnpj cnpjCredor, double valor) {
        Divida divida = new Divida();
        divida.setTotal(valor);
        divida.setCredor(credor);
        divida.setCnpjCredor(cnpjCredor);
        dividasCNPJ.put(cnpjCredor, divida);
    }

    public void registraDivida(String credor, Cpf cpfCredor, double valor) {
        Divida divida = new Divida();
        divida.setTotal(valor);
        divida.setCredor(credor);
        divida.setCpfCredor(cpfCredor);
        dividasCPF.put(cpfCredor, divida);
    }

    public void pagaDivida(Cnpj cnpjCredor, double valor, String pagador, Cnpj cnpjPagador) {
        Divida divida = dividasCNPJ.get(cnpjCredor);
        if (divida != null) {

            Pagamento pagamento = new Pagamento();
            pagamento.setPagador(pagador);
            pagamento.setCnpjPagador(cnpjPagador);
            pagamento.setValor(valor);

            divida.registra(pagamento);
        }
    }

    public void pagaDivida2(Cpf cpfCredor, double valor, String pagador, Cnpj cnpjPagador) {
        Divida divida = dividasCPF.get(cpfCredor);
        if (divida != null) {

            Pagamento pagamento = new Pagamento();
            pagamento.setPagador(pagador);
            pagamento.setCnpjPagador(cnpjPagador);
            pagamento.setValor(valor);

            divida.registra(pagamento);

        }
    }
}

