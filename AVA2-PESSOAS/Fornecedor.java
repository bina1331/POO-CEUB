public class Fornecedor extends Pessoa {
    private String cnpjFornecedor;
    private String produtosFornecedor;

    public Fornecedor(String cpfPessoa, char nomePessoa, String enderecoPessoa, String telefonePessoa,
                      String cnpjFornecedor, String produtosFornecedor) {
        super(cpfPessoa, nomePessoa, enderecoPessoa, telefonePessoa);
        this.cnpjFornecedor = cnpjFornecedor;
        this.produtosFornecedor = produtosFornecedor;
    }
}
