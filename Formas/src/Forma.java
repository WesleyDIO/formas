import java.util.ArrayList;

public abstract class Forma {


    public abstract double calcPerimetro();
    public abstract double calcArea();

    public static ArrayList<Forma> listarFormas =  new ArrayList<>();

    public Forma() {
        listarFormas.add(this);
    }

    public static void cadastrarTriangulo(double valor4, double valor5, double valor6) {

        if (valor4 == valor5 && valor5 == valor6){
            new Equilatero(new double[]{valor4, valor5, valor6});

        }
        else if (valor4 == valor5 || valor4 == valor6){
           new Isosceles(new double[]{valor4, valor5, valor6});

        }else{
            new Escaleno(new double[]{valor4, valor5, valor6});
        }
    }

}
