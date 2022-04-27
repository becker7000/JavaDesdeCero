public class TestRectangulo {

    public static void main(String[] args) {

        //Instanciando un objeto de la clase Rectangulo.
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();

        r1.base=12.8;
        r1.altura=30.5;

        r2.base=20;
        r2.altura=5;

        //r1.mostrar();
        //r2.mostrar();

        //Metodo toString()
        System.out.println(r1);
        System.out.println(r2);

        final int contador=1;

        System.out.println(Math.PI);
    }

}
