import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private LocalDateTime dataHora;
    private Vendedor vendedor;
    private Cliente cliente;
    private String statusPedido;
    private List<ItemPedido> itemPedido;
    private Double valorTotal;

    public Pedido(int idPedido, Vendedor vendedor, Cliente cliente){
    this.idPedido = idPedido;
    this.vendedor = vendedor;
    this.cliente = cliente;
    this.dataHora = LocalDateTime.now();
    this.statusPedido = "Em Processamento";
    this.itemPedido = new ArrayList<>();
    this.valorTotal = valorTotal = 0.0;
    }
    public void adicionarItem(ItemPedido item){
    itemPedido.add(item);
    calcularValor();
    }

    public void removerItem(ItemPedido item){
    itemPedido.remove(item);
    calcularValor();
    }

    public void atualizarStatus(String novoStatus){
    this.statusPedido = novoStatus;
    }

    public void aplicarDesconto(Double percentualDesconto){
    Double desconto = valorTotal * (percentualDesconto / 100);
    valorTotal -= desconto;
    }

    private void calcularValor(){
     valorTotal = 0.0;
    for (ItemPedido item : itemPedido){
        valorTotal += item.getPrecoUnitario() * item.getQtdPedido();
        }
    }
     
    public int getIdPedido(){
        return idPedido;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public Vendedor getVendedor(){
        return vendedor;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String getStatusPedido(){
        return statusPedido;
    }

    public List<ItemPedido> getItemPedido(){
        return itemPedido;
    }

    public double getValorTotal(){
        return valorTotal;
    }
}