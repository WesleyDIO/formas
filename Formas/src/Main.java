import java.util.Scanner;

public class Main {
    static Professor professor = new Professor("Romario", "123");
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menuInicial();
    }
    private static int menuInicial(){
        int opcao;
        do {
            System.out.println("""
                    1 - Login
                    2 - Sair
                    """);
            opcao = Main.sc.nextInt();
            switch (opcao) {
                case 1:
                    login();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Opção invalida");
            }
        }while(opcao!=1 && opcao!=2);
        return opcao;
    }

    private static void login(){
        for (int i = 2; i >= 0; i--) {
            System.out.println("Digite seu nome:");
            String nome = sc.next();
            System.out.println("Digite sua senha:");
            String senha = sc.next();
            if (senha.equals(professor.getSenha()) && nome.equals((professor.getNome()))) {
                menu();
                i = 2;
                break;
            } else {
                System.out.println("VOCE ERROU " + i);
            }
        }
    }

    private static void menu(){
        int opcao;
        do {
            System.out.println("""
                    1 - Circulo
                    2 - Retangulo
                    3 - Quadrado
                    4 - Triangulo
                    5 - Mostrar resultados
                    6 - Logout
                    """);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> cadastrarCirculo();
                case 2 -> cadastrarRetangulo();
                case 3 -> cadastrarQuadrado();
                case 4 -> cadastrarTriangulo();
                case 5 -> professor.listarFormas();
                case 6 -> logout();
                default -> System.out.println("Opção invalida");
            }
        }while(opcao >0 && opcao <=5);

    }

    private static void cadastrarRetangulo(){

        System.out.println("Digite o lado1 do retangulo:");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o lado2 do retangulo:");
        double valor2 = sc.nextDouble();
        new Retangulo(new double[]{valor1, valor2});

    }

    private static void cadastrarCirculo(){
        System.out.println("Digite o valor do raio:");
        new Circulo(sc.nextDouble());
    }

    private static void cadastrarQuadrado(){
        System.out.println("Digite o lado do quadrado");
        new Quadrado(sc.nextDouble());
    }

    private static void cadastrarTriangulo(){
        System.out.println("Digite o lado1 do seu triangulo:");
        double valor4 = sc.nextDouble();
        System.out.println("Digite o lado2 do seu triangulo:");
        double valor5 = sc.nextDouble();
        System.out.println("Digite o lado3 do seu triangulo:");
        double valor6 = sc.nextDouble();
        Forma.cadastrarTriangulo(valor4,valor5,valor6);
    }

    private  static void logout(){
        System.exit(0);
        System.out.println("Logout realizado com sucesso!");
    }
}
