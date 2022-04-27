import java.util.Scanner;

public class TestIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        /**
         * Los datos que son primitivos se guardan una seccion memoria
         * llamada Stack y los tipos de datos objeto se guardan
         * en una seccion de la memoria llamda Heap.
         *
         * Los tipos de datos wrapper envuelven a los primitivos como objetos.
         */
        System.out.print("Escribe un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());

        if(numero%2==0)
            System.out.print("\n\t El numero es par.");
        else
            System.out.println("\n\t El numero es impar.");


    }

}
