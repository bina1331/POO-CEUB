public class Vendedor extends Pessoa {
    private String matriculaVendedor;
    private String vendasMensais;
    private double comissaoMensal;

    public Vendedor(String cpfPessoa, char nomePessoa, String enderecoPessoa, String telefonePessoa,
                    String matriculaVendedor, String vendasMensais, double comissaoMensal) {
        super(cpfPessoa, nomePessoa, enderecoPessoa, telefonePessoa);
        this.matriculaVendedor = matriculaVendedor;
        this.vendasMensais = vendasMensais;
        this.comissaoMensal = comissaoMensal;
    }
}
