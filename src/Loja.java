import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Loja {

    static ArrayList<Item> listaDeItens = new ArrayList<>();
    static Item maca = new Item(0, "maçã", 2.50);
    static Item banana = new Item(1, "banana", 3.50);
    static Item alface = new Item(2, "alface", 1.70);
    static Item coentro = new Item(3, "coentro", 1.00);
    static Item pera = new Item(4, "pera", 3.50);
    static Item cebola = new Item(5, "cebola", 1.50);
    static Item melao = new Item(6, "melão", 5.50);

    static Scanner entrada = new Scanner(System.in);

    static Carrinho carrinhoDeCompras = new Carrinho();


    public static void main(String[] args) {

        listaDeItens.add(maca);
        listaDeItens.add(banana);
        listaDeItens.add(alface);
        listaDeItens.add(coentro);
        listaDeItens.add(pera);
        listaDeItens.add(cebola);
        listaDeItens.add(melao);
        menu();
    }

    public static void menu() {

        System.out.println("Ben vindo a FrutMania ");

        System.out.println("--------------------------");
        System.out.println("1-Comprar");
        System.out.println("2-Ver Carrinho");
        System.out.println("3-sair");
        System.out.println("--------------------------");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                comprar();
                break;
            case 2:
                carrinhoDeCompras.listar();
                menu();
                break;
            case 3:
                System.out.println("Obrigado por  comprar em nossa loja");
                entrada.close();
                break;
            default:
                System.out.println("Digite um valor valído!");
                menu();
        }

    }

    private static void comprar() {
        for (Item item : listaDeItens) {
            System.out.println(item.getId() + " " + item.getNome() + "  seu preço é R$ " + item.getPreco());
        }
        System.out.print("Digite o numero do item: ");
        int numeroItem = entrada.nextInt();
        System.out.print("\nDigite a quantidade: ");
        int quantidade = entrada.nextInt();

        carrinhoDeCompras.adicionarItem(listaDeItens.get(numeroItem), quantidade);
    menu();
    }
}