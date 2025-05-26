import java.util.Date;
import java.text.SimpleDateFormat;

public class EscolarWin {
 public static void main(String[] args) {
        
    try{ 
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse("24/01/2006");
        
        Aluno aluno = new Aluno("Sabrina Cardoso", "123.456.789-10",dataNascimento);
        aluno.entrarPessoa();
        System.out.println("Desconto para alunos: "+aluno.calcularDesconto(0.1, 3000.0));

        System.out.println("\n--------------------\n");
    
        Empresa empresa = new Empresa("Bina's Tech", "12.345.678/9101-11", "987654321");
        empresa.entrarPessoa();
        System.out.println("Desconto para empresas: "+empresa.calcularDesconto(0.05, 20, 3000.0));
        
       } catch (Exception e) {
        System.out.println("Erro ao converter a data: "+ e.getMessage());
        } finally {
    System.out.println("Processo de cálculo de descontos finalizado!");
    }
 }
}