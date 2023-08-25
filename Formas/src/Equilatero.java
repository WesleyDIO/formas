public class Equilatero extends Triangulo{

    public Equilatero(double[] lados) {
      super(lados);
    }

    public double calcArea() {
        return Math.sqrt(3)/4*(lados[0]*lados[0]);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
