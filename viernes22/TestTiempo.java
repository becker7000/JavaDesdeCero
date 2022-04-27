import java.util.Scanner;

public class TestTiempo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Datos de entrada:
        System.out.print("\n\t Escribe una cantidad de segundos: ");
        int segundos = entrada.nextInt(); entrada.nextLine();
        // 500 -> 500/60 = 8 y sobra 20

        //Calculos:
        System.out.print("\n\t "+segundos+" segundos equivalen a ");
        int minutos = segundos/60; // minutos = 8
        segundos=segundos%60; //segundos = 20

        //Salidas:
        System.out.print(minutos + " minutos ");
        System.out.println("con "+segundos+" segundos");

        entrada.close();

    }

}