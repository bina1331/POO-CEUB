public class Empresa extends Pessoa {
    private String cnpjPessoaJuridica;
    private String inscricaoEstadual;

    public Empresa( String nomePessoa, String cnpjPessoaJuridica, String inscricaoEstadual) {
        super(nomePessoa);
        this.cnpjPessoaJuridica = cnpjPessoaJuridica;
        this.inscricaoEstadual = inscricaoEstadual;

    }
    
    @Override
    
    public void entrarPessoa(){
        System.out.println("Pessoa Juridica: "+ nomePessoa);
        System.out.println("CNPJ: "+cnpjPessoaJuridica);
        System.out.println("Inscricao Estadual: "+inscricaoEstadual);
    }
    public Double calcularDesconto(Double percentual, int qtdColaboradores, Double vlrMensalidade) {
        return vlrMensalidade * (percentual * qtdColaboradores);


    }


}


