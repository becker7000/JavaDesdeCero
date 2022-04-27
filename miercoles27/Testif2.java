import java.util.Scanner;

public class Testif2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String password = "1234abcd";

        System.out.println("Escribe la contraseña: ");
        String dato = entrada.nextLine();

        //Comparacion de dos cadenas diferentes.
        if(dato.equals(password))
            System.out.println("La constraseña es correcta.");
        else
            System.out.println("Contraseña incorrecta.");

    }

}
