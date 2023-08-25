public class Professor {

    private String nome;
    private String senha;

    public Professor(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public void listarFormas(){
        System.out.println();
        for (Forma forma : Forma.listarFormas) {
            System.out.println("Tipo: " + forma.getClass().getSimpleName());
            System.out.println("Área: " + forma.calcArea());
            System.out.println("Perímetro: " + forma.calcPerimetro());
            if (forma instanceof Circulo) {
                System.out.println("Raio: " + ((Circulo) forma).getRaio());
                System.out.println("Diâmetro: " + ((Circulo) forma).getDiametro());
            } else if (forma instanceof Triangulo) {
                if (forma instanceof Escaleno) {
                    System.out.println("Calc semi perimetro: " + ((Escaleno) forma).calcSemiPerimetro());
                }
            } else if (forma instanceof Retangulo) {
                System.out.println("Lado 1: " + ((Retangulo) forma).getLado1());
                System.out.println("Lado 2: " + ((Retangulo) forma).getLado2());

            } else if (forma instanceof Quadrado) {
                System.out.println("Lado: " + ((Quadrado) forma).getLado());

            }
            System.out.println("============================");
        }

    }
}
