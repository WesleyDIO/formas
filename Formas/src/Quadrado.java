public class Quadrado extends Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcPerimetro() {
          return 4 * lado;
    }

    @Override
    public double calcArea() {
        return lado * lado ;
    }

    public double getLado() {
        return lado;

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
