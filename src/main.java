import java.util.Scanner;
public class main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        double capital = 0;
        double ganancia = 0;

        System.out.println("-------------------- TP 0 ------------------------- ");
        System.out.print("Problemas secuenciales:\n" +
                "1 - Ejercicio 1\n" +
                "2 - Ejercicio 2\n" +
                "3 - Ejercicio 2\n" +
                "Problemas Condicionales Selectivos Simples\n" +
                "4 - Ejercicio 1\n" +
                "5 - Ejercicio 2\n" +
                "6 - Ejercicio 3\n" +
                "7 - Ejercicio 4\n" +
                "8 - Ejercicio 5\n" +
                "Problemas Condicionales Selectivos Compuestos (si anidados o en cascada): \n" +
                "9 - Ejercicio 1\n" +
                "10 - Ejercicio 2\n" +
                "Problemas con repeticiones:\n" +
                "11 - Ejercicio 1\n" +
                "12 - Ejercicio 2\n" +
                "13 - Ejercicio 3\n" +
                "14 - Ejercicio 4\n" +
                "15 - Ejercicio 5\n" +
                "16 - Ejercicio 6\n");
        System.out.print("INGRESE UNA OPCION:");
        opcion = scan.nextInt();




        System.out.print("Ingrese el capital a invertir: ");
        capital = scan.nextFloat();
        ganancia = capital * 0.02;
        System.out.println("GANANCIA = " + ganancia);








    }
}
