import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {
 
  //private Divida divida;

    public void geraRelatorio(Divida divida,  NumberFormat formatadorDeNumero) {
     System.out.println("Credor: " + divida.getCredor());
     System.out.println("Cnpj credor: " + divida.getCnpjCredor());
 
 /*   NumberFormat formatadorDeNumero = NumberFormat.getCurrencyInstance(
                                  new Locale("pt", "BR"));
 */
    // agora utilizamos uma instância da classe NumberFormat
    // para fazer a exibição dos valores      
      System.out.println("Valor a pagar: " + 
                 formatadorDeNumero.format(divida.valorAPagar()) );
      System.out.println("Valor total: " + 
                 formatadorDeNumero.format(divida.getTotal()));
    }

    public static void main(String[] args) {
        Divida divida = new Divida();
        divida.setCredor("Credor 1");
        divida.setCnpjCredor(new Cnpj("00.000.000/0001-01"));
        divida.setTotal(3000);
        divida.getHistoricoPagamentos();

        NumberFormat formatadorDeNumero =
                NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

// passamos o formatadorDeNumero como argumento na chamada do método que gera o relatório
        new RelatorioDeDivida().geraRelatorio(divida, formatadorDeNumero);

    }
}
