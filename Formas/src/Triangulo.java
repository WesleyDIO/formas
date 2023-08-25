public abstract class Triangulo extends Forma {

    public double [] lados;

    public Triangulo(double[] lados) {
        this.lados = lados;
    }



    @Override
    public double calcPerimetro() {
        return lados[0] + lados [1] + lados [2];
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
