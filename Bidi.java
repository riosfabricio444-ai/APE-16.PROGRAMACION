import java.util.Scanner;

//definicion de las dimensiones constantes de las matrices (2 filas x 3 columnas)
public class Bidi {
    static final int FIL = 2;
    static final int COL = 3;
    static Scanner sc = new Scanner(System.in);

    //Pide al usuario los valores numericos para rellenar la matriz, recorre celda por celda
    public static void completarMatrices(int[][] matriz) {
        for (int f = 0; f < FIL; f++) {
            for (int c = 0; c < COL; c++) {
                System.out.print("Ingrese el dato para la posicion [" + f + "][" + c + "]:");
                matriz[f][c] = sc.nextInt();
            }
        }
    }

    //Suma elemento por elemento de las dos matrices
    public static void sumaMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int f = 0; f < FIL; f++)
            for (int c = 0; c < COL; c++)
                resultado[f][c] = matriz1[f][c] + matriz2[f][c];
    }

    //Resta elemento por elemento de las dos matrices del mismo tamaño
    public static void restaMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int f = 0; f < FIL; f++)
            for (int c = 0; c < COL; c++)
                resultado[f][c] = matriz1[f][c] - matriz2[f][c];
    }

    //Multiplica elemento por elemento de las dos matrices
    public static void multiplicacionMatriz(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int f = 0; f < FIL; f++)
            for (int c = 0; c < COL; c++)
                resultado[f][c] = matriz1[f][c] * matriz2[f][c];
    }

    //Imprime en pantalla el contenido de una matriz de forma estructurada en filas y columnas
    public static void mostrarResultado(int[][] matriz) {
        for (int f = 0; f < FIL; f++) {
            for (int c = 0; c < COL; c++) {
                System.out.print("[" + matriz[f][c] + "]\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Declaracion e inicializacion de las matrices de entrada y resultados
        int[][] matrizC = new int[FIL][COL];
        int[][] matrizD = new int[FIL][COL];
        int[][] suma = new int[FIL][COL];
        int[][] resta = new int[FIL][COL];
        int[][] multiplicacion = new int[FIL][COL];
        
        // Encabezado de mi programa
        System.out.print("--------------------------------------------");
        System.out.println("\n OPERACIONES CON MATRICES DE 2 x 3:");
        System.out.print("--------------------------------------------");

        //Lectura de datos introducidos por el usuario para las dos matrices
        System.out.println("\nMostrando los datos de la matriz C:");
        completarMatrices(matrizC);

        System.out.println("\nMostrando los datos de la matriz D:");
        completarMatrices(matrizD);

        //Muestra la matriz C ingresada
        System.out.println("---------------------");
        System.out.println("MATRIZ C:");
        mostrarResultado(matrizC);
        System.out.println("---------------------");

        //Muestra la segunda matriz D ingresada
        System.out.println("MATRIZ D:");
        mostrarResultado(matrizD);
        System.out.println("---------------------");

        //Ejecucion de las operaciones aritmeticas entre las dos matrices ingresadas
        sumaMatriz(matrizC, matrizD, suma);
        restaMatriz(matrizC, matrizD, resta);
        multiplicacionMatriz(matrizC, matrizD, multiplicacion);

        //Resultado de la suma de las dos matrices
        System.out.print("--------------------------------------------");
        System.out.println("\nResultado de la suma:");
        mostrarResultado(suma);
        System.out.println("--------------------------------------------");

        //Resultado de la resta de las dos matrices
        System.out.print("--------------------------------------------");
        System.out.println("\nResultado de la resta:");
        mostrarResultado(resta);
        System.out.println("--------------------------------------------");

        //Resultado de la multiplicacion de las dos matrices
        System.out.print("--------------------------------------------");
        System.out.println("\nResultado de la multiplicacion:");
        mostrarResultado(multiplicacion);
        System.out.println("--------------------------------------------");

        sc.close();
    }
}
