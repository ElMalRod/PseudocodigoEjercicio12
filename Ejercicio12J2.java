import java.util.Scanner;

public class Ejercicio12J2 {

    public static void main(String[] args) {
        // variables a utilizar
        Scanner sc = new Scanner(System.in);
        int promedioAlturaH;
        int promedioAlturaM;
        int promedioEdades;
        int edades = 0;
        int alturasH = 0;
        int alturasM = 0;
        int contadorE = 0;
        int contadorH = 0;
        int contadorM = 0;
        int alturaIngresada = 0;

        do {
            int edadIngresada;
            String sexoIngresado;
            System.out.println("Ingrese su Sexo F si es mujer y M si es Hombre");
            sexoIngresado = sc.nextLine();
            System.out.print("Ingrese su altura. ");
            alturaIngresada = sc.nextInt();
            System.out.print("Ingrese su edad ");
            edadIngresada = sc.nextInt();

            edades += edadIngresada;
            contadorE++;

            if (sexoIngresado.equals("F")) {

                alturasM += alturaIngresada;
                contadorM++;

            }

            if (sexoIngresado.equals("M")) {

                alturasH += alturaIngresada;
                contadorH++;

            }

        } while ((alturaIngresada >= 0));

        promedioAlturaM = alturasM / contadorM;
        promedioAlturaH = alturasH / contadorH;
        promedioEdades = edades / contadorE;

        System.out.println("El promedio de la altura en mujeres es de :" + promedioAlturaM + " cm");
        System.out.println("El promedio de la altura en Hombres es de :" + promedioAlturaH + " cm");
        System.out.println("El promedio de edades es de: " + promedioEdades);

    }
}