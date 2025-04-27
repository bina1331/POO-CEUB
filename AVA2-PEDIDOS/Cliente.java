public class Cliente { // criando a classe cliente 
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private String telefoneCliente;

    public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente, String telefoneCliente) { // criando o construtor cliente
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public String getNomeCliente(){ // Getters = ler/pegar
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente){ // Setters = alterar
    this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente(){
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente){
        this.cpfCliente = cpfCliente;
    }

    public String getEnderecoCliente(){
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente){
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente(){
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente){
        this.telefoneCliente = telefoneCliente;
    }
}
