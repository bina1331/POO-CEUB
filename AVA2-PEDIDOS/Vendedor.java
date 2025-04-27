public class Vendedor {
    private String nomeVendedor;
    private String matriculaVendedor;

    public Vendedor(String nomeVendedor, String matriculaVendedor) {
        this.nomeVendedor = nomeVendedor;
        this.matriculaVendedor = matriculaVendedor;
    }
    
    public String getNomeVendedor(){
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor){
        this.nomeVendedor = nomeVendedor;
    }

    public String getMatriculaVendedor(){
        return matriculaVendedor;
    }

    public void setMatriculaVendedor(String matriculaVendedor){
        this.matriculaVendedor = matriculaVendedor;
    }
}