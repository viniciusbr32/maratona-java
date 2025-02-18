package estudos.maratonajava.javacore.Kunum.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1),
    PESSOA_FISICA(2);

    private final int TipoPessoaInt;

    TipoCliente(int tipoPessoaInt) {
        TipoPessoaInt = tipoPessoaInt;
    }

    public int getTipoPessoaInt() {
        return TipoPessoaInt;
    }
}
