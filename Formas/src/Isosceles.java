public class Isosceles extends Triangulo{

    public Isosceles(double[] lados) {
        super(lados);
    }

    public double calcArea() {
    double area = resultados()[0] * resultados()[1]/2;
    return area;
    }

    public double[] resultados(){
        double[] resultados = new double[2];
        double ladoD;
        double altura;
        if(lados[0] > lados[1] && lados[0] > lados[2]){
          ladoD = lados[0];
          altura = Math.sqrt(lados[1]*lados[1] - ((lados[0]-lados[2])* (lados[0] - lados[2]))/4);
        } else if(lados[1] > lados[0] && lados[1] > lados[2]){
            ladoD = lados[1];
            altura = Math.sqrt(lados[0]*lados[0] - ((lados[1]-lados[2])* (lados[1] - lados[2]))/4);
        }else{
            ladoD = lados[2];
            altura = Math.sqrt(lados[0]*lados[0] - ((lados[2]-lados[1])* (lados[2] - lados[1]))/4);
        }
        resultados[0] = ladoD;
        resultados[1] = altura;
       return resultados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
