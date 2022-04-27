import java.util.Scanner;

public class TestSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\t 1) Opcion A" +
                "\n\t 2) Opcion B" +
                "\n\t 3) Opcion C" +
                "\n\t 4) Opcion D");

        System.out.println("=> ");
        int response =Integer.parseInt(entrada.nextLine());

        switch (response){
            case 1 -> {
                System.out.println("Soy la opcion A");
            }
            case 2 -> {
                System.out.println("Soy la opcion B");
            }
            case 3 -> {
                System.out.println("Soy la opcion C");
            }
            case 4 -> {
                System.out.println("Soy la opcion D");
            }
            default -> {
                System.out.println("Soy una opcion no contemplada");
            }
        }

    }

}
