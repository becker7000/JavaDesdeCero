public class TestStringBuilder {

    public static void main(String[] args) {

        StringBuilder texto = new StringBuilder();

        //Entradas:
        String name="Pepe";
        float weight= 70.78f;
        float height=1.7f;

        //Procedimiento:
        texto.append("\n\t+-------------+");
        texto.append("\n\t| Nombre: ");
        texto.append(name);
        texto.append("\n\t| Peso: ");
        texto.append(weight);
        texto.append("\n\t| Altura: ");
        texto.append(height);
        texto.append("\n\t+------------+");

        int edad=20;
        texto.insert(texto.indexOf(String.valueOf("\n\t| Peso")),"\n\t| Edad: "+edad);

        //Salidas:
        System.out.println(texto);

    }

}
