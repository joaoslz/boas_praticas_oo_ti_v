public class TestePagamentos {


    public static void main(String[] args) {
        Pagamentos pagamentos = new Pagamentos();

        Pagamento pagamento = new Pagamento();
        pagamento.setPagador("Joao" );
        pagamento.setCnpjPagador(new Cnpj("1233532543534"));
        pagamento.setValor(1000 );

        pagamentos.registra(pagamento );
        pagamentos.add(pagamento );

        pagamentos.clear();

    }
}
