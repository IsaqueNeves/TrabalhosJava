
import java.sql.SQLOutput;
import java.util.Scanner;

public class Menus {

    public static void menuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Menu Principal==========");
        System.out.println("1 = Cadastrar novo cliente");
        System.out.println("2 = Fazer novo pedido ");
        System.out.println("3 = Cadastar produto");
        System.out.println("4 = Sair do menu\n");
        System.out.print("opcao: ");
        int opc = scanner.nextInt();
        System.out.println("==================================");

    }
    public static void menuCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Menu CLiente============");
        System.out.println("Nome cliente: ");
        String nome = scanner.next();
        System.out.println("Email cliente: ");
        String email = scanner.next();
        System.out.println("Telefone cliente :");
        String fone = scanner.next();
        System.out.println("Codigo cliente: ");
        String codigoCliente = scanner.next();
        System.out.println("==================================");
    }
    public static void menuPedido(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Menu Pedido============");
        System.out.println("Cliente :");
        int nomeCliente = scanner.nextInt();
        System.out.println("Codigo pedido: ");
        int codPedido = scanner.nextInt();

        System.out.println("Status do pedido: ");
        String statusPedido = scanner.next();
        System.out.println("==================================");
    }
    public static void menuProduto(){
        Scanner scnaner = new Scanner(System.in);
        System.out.println("==========Menu Produto============");
        System.out.println("Nome produto: ");
        String nomeProduto = scnaner.next();
        System.out.println("Codigo produto: ");
        int codProduto = scnaner.nextInt();
        System.out.println("Preco produto :");
        double precoProduto = scnaner.nextDouble();
        System.out.println("Estoque produto: ");
        int estoqueProduto = scnaner.nextInt();
        System.out.println("==================================");
    }

}
