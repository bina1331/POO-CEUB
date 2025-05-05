public abstract class Pessoa {
    private String cpfPessoa;
    private char nomePessoa;
    private String enderecoPessoa;
    private String telefonePessoa;

    public Pessoa(String cpfPessoa, String nomePessoa, String enderecoPessoa, String telefonePessoa) {
        this.cpfPessoa = cpfPessoa;
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.telefonePessoa = telefonePessoa;
    }
    public boolean identificarPessoa() {
        return true;
}
}







