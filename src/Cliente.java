import java.util.Scanner;

public class Cliente {
    Scanner sc = new Scanner(System.in);
    //atributos da classse cliente

    private String codCliente;
    private String nomeCliente;
    private String emailCliente;
    private String foneCliente;

    //Metodos Getters e Setters

            public String getNomeCliente() {
                return this.nomeCliente;
            }
            public void setNomeCliente(String nomeCliente){
                this.nomeCliente = nomeCliente;
            }

            public String getEmailCliente(){
                return this.emailCliente;
            }
            public void setEmailCliente(String emailCliente){
                this.emailCliente = emailCliente;
            }

            public String getCodCliente(){
                return this.codCliente;
            }
            public void setCodCliente(String codCliente){
                this.codCliente = codCliente;
            }

            public String getFoneCliente(){
                return this.foneCliente;
            }
            public void setFoneCliente(String foneCliente){
                this.foneCliente = foneCliente;
            }
    //Metodo construtor
            public Cliente(String nomeCliente, String codCliente,String emailCliente,String foneCliente){
                this.setNomeCliente(nomeCliente);
                this.setCodCliente(codCliente);
                this.setEmailCliente(emailCliente);
                this.setFoneCliente(foneCliente);
            }

    @Override
    public String toString() {
        return  "\nNome: " + nomeCliente +
                "\nCodigo cliente: " + this.codCliente +
                "\nEmail cliente: " + this.emailCliente +
                "\nTelefone cliente: " + this.foneCliente;
    }
}
