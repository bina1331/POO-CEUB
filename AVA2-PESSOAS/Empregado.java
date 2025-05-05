public class Empregado extends Pessoa {
    private int idEmpregado;
    private String setorEmpregado;

    public Empregado(String cpfPessoa, char nomePessoa, String enderecoPessoa, String telefonePessoa,
                     int idEmpregado, String setorEmpregado) {
        super(cpfPessoa, nomePessoa, enderecoPessoa, telefonePessoa);
        this.idEmpregado = idEmpregado;
        this.setorEmpregado = setorEmpregado;
    }
}
