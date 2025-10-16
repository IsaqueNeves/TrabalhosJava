public class ItemPedido {

    private int codItem;
    private Produto produto;
    private String pedido;
    private int quantidade;
    private double precoItem;

    public void setCodItem(int codItem){
        this.codItem = codItem;
    }
    public int getCodItem(){
        return this.codItem;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public Produto getProduto(){
        return this.produto;
    }

    public void setPedido(String pedido){
        this.pedido = pedido;
    }
    public String getPedido(){
        return this.pedido;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    public void setPrecoItem(double precoItem){
        this.precoItem = precoItem;
    }
    public double getPrecoItem(){
        return this.precoItem;
    }

    public ItemPedido(int codItem, Produto produto, String pedido, int quantidade, double precoItem){
        this.setCodItem(codItem);
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQuantidade(quantidade);
        this.setPrecoItem(precoItem);
    }

    @Override
    public String toString() {
        return "Item Pedido:" +
                "\nCodigo item: " + this.getCodItem() +
                "\nProduto: " + this.getProduto().getNomeProduto() +
                "\nNumero Pedido: " + this.getPedido() +
                "\nQuatidade:  " + this.getQuantidade() +
                "\nPreco Item: " + this.getPrecoItem();
    }
}
