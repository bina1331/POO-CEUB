public class Pessoa {
    protected String nomePessoa;

    public Pessoa (String nomePessoa){
        this.nomePessoa = nomePessoa;
    }

    public void entrarPessoa(){
        System.out.println("Pessoa: "+ nomePessoa); 
    }
}