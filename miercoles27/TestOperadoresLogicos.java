public class TestOperadoresLogicos {

    public static void main(String[] args) {

        boolean a = false;
        boolean b = false;

        //AND da true si ambos son true, de lo contrario da false.
        System.out.println("AND " + (a && b));
        //OR da true si por lo menos algun valor es true.
        System.out.println("OR " + (a || b));
        //NOT cambia a true si el valor es false y viceversa.
        System.out.println("NOT "+(!a));
        //Exclusive OR da true si ambos son diferentes.
        System.out.println("Exclusive "+(a^b));

    }

}
