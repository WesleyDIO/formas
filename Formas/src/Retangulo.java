public class Retangulo extends Forma {

    private double [] lados;

    public Retangulo(double[] lados) {
        this.lados = lados;
    }

    @Override
    public double calcPerimetro() {
        return 2 * (lados[0] + lados[1]);
    }

    @Override
    public double calcArea() {
        return lados[0] * lados[1];
    }


    public double getLado1() {
        return lados[0];

    }

    public double getLado2() {
        return lados[1];

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
