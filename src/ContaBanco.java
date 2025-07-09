import java.util.Scanner;

public class ContaBanco {
    Scanner sc = new Scanner(System.in);
    //Atributos
    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    //Variable
    double valorSaque;
    double valorDeposito;
    String tipoConta;
    //Metodos
    public void abirConta() {
        System.out.println("======================================================================");
        System.out.println("Por favor selecione/digite a conta que deseja abir: ");
        System.out.println("CC = Conta Corrente");
        System.out.println("CP = Conta Poupanca");
        tipoConta = sc.nextLine();
        if (tipoConta.equals("CC")) {
            System.out.println("Conta corrente criada com sucesso");
            System.out.println("Voce recebeu um bonus de R$50 no seu saldo");
            setsaldo(50);
                this.setStatus(true);
                this.setTipo("Conta Corrente");
        }
        else if (tipoConta.equals("CP")) {
            System.out.println("Conta poupanca criada com sucesso");
            System.out.println("Voce recebeu um bonus de R$150 no seu saldo");
            setsaldo(150);
                this.setStatus(true);
            this.setTipo("Conta Poupanca");
        }
        else {
            System.out.println("Digite uma forma de conta valida");
        }
        System.out.println("======================================================================");
    }

    public void fecharConta(){
        while (this.saldo >0){
            System.out.println("Saque todo o dinheiro da sua conta antes de fecha-la!");
            sacar();
        }

    }

    public void depoisitar(){
        System.out.println("Digite o valor que deseja depositar: ");

            System.out.println("R$ "); valorDeposito = sc.nextDouble();
        if (valorDeposito > 0){
            this.saldo += valorDeposito;
            System.out.println("Saldo em conta: R$ "+this.saldo);
        }
        else {
            System.out.println("Digite um valour valido!");
        }
    }

    public void sacar(){
        System.out.println("Digite a valor do saque : ");
        System.out.print("R$ ");valorSaque = sc.nextDouble();
            if (valorSaque <= this.saldo){
            this.saldo -= valorSaque;
            }
            else  {
                System.out.println("Voce nao tem esse saldo em conta!");
            }
        System.out.println("Saldo em conta: R$ " +this.saldo);
    }

    public void pagarMensalidade(){
        this.saldo -= 50;
        System.out.println("Voce pagou a mensalidade no valor de R$ 50");
    }

    //Metodos especiais

    public String getNumConta(){
        return this.numConta;
    }
    public void setNumConta(String numConta){
        this.numConta = numConta;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }


    public double getsaldo(){
        return this.saldo;
    }
    public void setsaldo(double saldo){
        this.saldo = saldo;
    }


    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipoConta){
        this.setTipo(tipoConta);
    }

    //Construtuor

    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }



}
