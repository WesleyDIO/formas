public class Circulo extends Forma {
    private double raio;
    private double diametro;

    public Circulo(double raio) {
        this.raio = raio;
        this.diametro = raio * 2;

    }

    public double calcPerimetro() {
        return 3.14 * (raio * raio);
    }


    public double calcArea() {
        return  2 * 3.14 * raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getDiametro() {
        return diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", diametro=" + diametro +
                '}';
    }
}
