import java.util.Date;
import java.text.SimpleDateFormat;

public class Aluno extends Pessoa {
    private String cpfPessoaFisica;
    private Date dataNascimento;


public Aluno(String nomePessoa, String cpfPessoaFisica, Date dataNascimento){
    super(nomePessoa);
    this.cpfPessoaFisica = cpfPessoaFisica;
    this.dataNascimento = dataNascimento;
}

@Override

public void entrarPessoa(){
    SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
    System.out.println("Pessoa Fisica: "+nomePessoa);
    System.out.println("CPF: "+cpfPessoaFisica);
    System.out.println("Data de Nascimento: "+formato.format(dataNascimento));
}

public Double calcularDesconto(Double percentual, Double vlrMensalidade){
    return vlrMensalidade * (1 - percentual); 
}


}