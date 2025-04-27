public class ItemPedido {
    private String codigoPedido;
    private String descricaoPedido;
    private int qtdPedido;
    private double precoUnitario;

    public ItemPedido(String codigoPedido, String descricaoPedido, int qtdPedido, double precoUnitario){
        this.codigoPedido = codigoPedido;
        this.descricaoPedido = descricaoPedido;
        this.qtdPedido = qtdPedido;
        this.precoUnitario = precoUnitario;
    }

    public String getCodigoPedido(){
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido){
        this.codigoPedido = codigoPedido;
    }

    public String getDescricaoPedido(){
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido){
        this.descricaoPedido = descricaoPedido;
    }

    public int getQtdPedido(){
        return qtdPedido;
    }

    public void setQtdPedido(int qtdPedido){
        this.qtdPedido = qtdPedido; 
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }
}