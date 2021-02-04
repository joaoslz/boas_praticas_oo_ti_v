import java.util.HashMap;

public class BalancoEmpresa {
  private HashMap<String, Divida> dividas = new HashMap<String,
                                                        Divida>();
 
  public void registraDivida(String credor, String cnpjCredor, double valor) {
    Divida divida = new Divida();
    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(new Cnpj(cnpjCredor));
    dividas.put(cnpjCredor, divida);
  }

  public void pagaDivida(String cnpjCredor, double valor, String pagador, String cnpjPagador) {
    Divida divida = dividas.get(cnpjCredor);
    if (divida != null) {

      Pagamento pagamento = new Pagamento();
      pagamento.setPagador(pagador );
      pagamento.setCnpjPagador(cnpjPagador);
      pagamento.setValor(valor );

      divida.registra(pagamento );
    }
  }




}
