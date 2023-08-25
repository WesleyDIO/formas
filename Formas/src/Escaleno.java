public class Escaleno extends Triangulo{

    public Escaleno(double[] lados) {
        super(lados);
    }

    public double calcArea() {
        double p = calcSemiPerimetro();
        return Math.sqrt(p * (p - lados [0]) * (p - lados [1]) * (p - lados [2]));
    }

    public double calcSemiPerimetro(){
        double p = lados[0] + lados [1] + lados [2] / 2;
        return p;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
