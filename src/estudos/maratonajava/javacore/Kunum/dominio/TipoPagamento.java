package estudos.maratonajava.javacore.Kunum.dominio;

public enum TipoPagamento {
    PIX(1, "Pix") {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.2;
        }
    }, DEBITO(2, "Debito") {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO(3, "Credito") {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    private final int tipoPagamentoInt;
    private final String TipoPagamentoString;

     TipoPagamento(int tipoPagamentoInt, String tipoPagamentoString) {
        this.tipoPagamentoInt = tipoPagamentoInt;
        this.TipoPagamentoString = tipoPagamentoString;
    }

   public static TipoPagamento tipoPagamentoPorIndice(int indice) {
         for (TipoPagamento tipo : values()) {
             if (tipo.getTipoPagamentoInt() == indice) {
                 return tipo;
             }
         }

       return null;
   }

    public abstract double calcularDesconto(double valor);


    public int getTipoPagamentoInt() {
        return tipoPagamentoInt;
    }

    public String getTipoPagamentoString() {
        return TipoPagamentoString;
    }
}
