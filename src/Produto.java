public class Produto {
    private int codProduto;
    private String nomeProduto;
    private double preco;
    private int estoque;

    public void setCodProduto(int codProduto){
        this.codProduto = codProduto;
    }
    public int getCodProduto(){
        return this.codProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public int getEstoque(){
        return this.estoque;
    }


    public Produto(int codProduto, String nomeProduto,  double preco, int estoque){
        this.setCodProduto(codProduto);
        this.setNomeProduto(nomeProduto);
        this.setPreco(preco);
        this.setEstoque(estoque);
    }

    @Override
    public String toString() {
        return "Produto:" +
                "\nCodigo produto: " + this.getCodProduto() +
                "\nNome Produto: " + this.getNomeProduto() +
                "\nPreco produto: " + this.getPreco() +
                "\nEstoque produto: " + this.getEstoque();
    }
}
