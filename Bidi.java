import java.util.Scanner;

public class Bidi {
    static final int FIL = 2;
    static final int COL = 3;
    static Scanner sc = new Scanner(System.in);

    public static void completarMatrices(int[][] matriz) {
        for (int f = 0; f < FIL; f++) {
            for (int c = 0; c < COL; c++) {
                System.out.print("Ingrese el dato para la posicion [" + f + "][" + c + "]:");
                matriz[f][c] = sc.nextInt();
            }
        }
    }

    public static void sumaMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int f = 0; f < FIL; f++)
            for (int c = 0; c < COL; c++)
                resultado[f][c] = matriz1[f][c] + matriz2[f][c];
    }

    public static void restaMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int f = 0; f < FIL; f++)
            for (int c = 0; c < COL; c++)
                resultado[f][c] = matriz1[f][c] - matriz2[f][c];
    }

    public static void multiplicacionMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int f = 0; f < FIL; f++)
            for (int c = 0; c < COL; c++)
                resultado[f][c] = matriz1[f][c] * matriz2[f][c];
    }

    public static void mostrarResultado(int[][] matriz) {
        for (int f = 0; f < FIL; f++) {
            for (int c = 0; c < COL; c++) {
                System.out.print("[" + matriz[f][c] + "]\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrizC = new int[FIL][COL];
        int[][] matrizD = new int[FIL][COL];
        int[][] suma = new int[FIL][COL];
        int[][] resta = new int[FIL][COL];
        int[][] multiplicacion = new int[FIL][COL];

        System.out.print("--------------------------------------------");
        System.out.println("\n OPERACIONES CON MATRICES DE 2 x 3:");
        System.out.print("--------------------------------------------");

        System.out.println("\nMostrando los datos de la matriz C:");
        completarMatrices(matrizC);

        System.out.println("\nMostrando los datos de la matriz D:");
        completarMatrices(matrizD);

        System.out.println("---------------------");
        System.out.println("MATRIZ C:");
        mostrarResultado(matrizC);
        System.out.println("---------------------");

        System.out.println("MATRIZ D:");
        mostrarResultado(matrizD);
        System.out.println("---------------------");

        sumaMatriz(matrizC, matrizD, suma);
        restaMatriz(matrizC, matrizD, resta);
        multiplicacionMatriz(matrizC, matrizD, multiplicacion);

        System.out.print("--------------------------------------------");
        System.out.println("\nResultado de la suma:");
        mostrarResultado(suma);
        System.out.println("--------------------------------------------");

        System.out.print("--------------------------------------------");
        System.out.println("\nResultado de la resta:");
        mostrarResultado(resta);
        System.out.println("--------------------------------------------");

        System.out.print("--------------------------------------------");
        System.out.println("\nResultado de la multiplicacion:");
        mostrarResultado(multiplicacion);
        System.out.println("--------------------------------------------");

        sc.close();
    }
}