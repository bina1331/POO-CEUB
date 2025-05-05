public class Cliente extends Pessoa {
    private String cadastroCliente;
    private double qtdCompras;

    public Cliente(String cpfPessoa, String nomePessoa, String enderecoPessoa, String telefonePessoa,
                   String cadastroCliente, double qtdCompras) {
        super(cpfPessoa, nomePessoa, enderecoPessoa, telefonePessoa);
        this.cadastroCliente = cadastroCliente;
        this.qtdCompras = qtdCompras;
    }
}
