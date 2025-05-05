public class LoginUsuario extends Pessoa {
    private String usuario;
    private String senha;

    public LoginUsuario(String cpfPessoa, char nomePessoa, String enderecoPessoa, String telefonePessoa,
                        String usuario, String senha) {
        super(cpfPessoa, nomePessoa, enderecoPessoa, telefonePessoa);
        this.usuario = usuario;
        this.senha = senha;
    }

    public void identificarLogin() {
        System.out.println("Login identificado.");
    }
}
