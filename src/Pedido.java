import java.time.LocalDateTime;

public class Pedido {

    private String codPedido;
    private LocalDateTime dataPedido;
    private String statusPedido;
    private String cliente;

   

    public void setCodPedido(String codPedido){
        this.codPedido = codPedido;
    }
    public String getCodPedido(){
        return this.codPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido){
        this.dataPedido = this.dataPedido;
    }
    public LocalDateTime getDataPedido(){
        return this.dataPedido;
    }

    public void setStatusPedido(String statusPedido){
        this.statusPedido = statusPedido;
    }
    public String getStatusPedido(){
        return this.statusPedido;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public String getCliente(){
        return this.cliente;
    }


    public Pedido(String codPedido, String statusPedido, String cliente){
         this.setCodPedido(codPedido);
         this.setStatusPedido(statusPedido);
         this.setCliente(cliente);
    }


    @Override
    public String toString() {
        return "Pedido:" +
                "\nCodigo Pedido: " + this.getCodPedido() +
                "\nData Pedido: " + this.getDataPedido() +
                "\nStatus Pedido: " + this.getStatusPedido() +
                "\nCliente pedido: " + this.getCliente();
    }
}
