import java.util.HashMap;

public class BalancoEmpresa {

  private HashMap<Cnpj, Divida> dividas = new HashMap<>();
 
  public void registraDivida(String credor, Cnpj cnpjCredor, double valor) {
    Divida divida = new Divida();
    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(cnpjCredor );
    dividas.put(cnpjCredor, divida);
  }

  public void pagaDivida(Cnpj cnpjCredor, double valor, String pagador, Cnpj cnpjPagador) {
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
