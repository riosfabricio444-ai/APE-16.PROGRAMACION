#include <stdio.h>

// Definición de las dimensiones constantes de las matrices (2 filas x 3 columnas)
const int FIL = 2;
const int COL = 3;

// Pide al usuario que ingrese los valores para cada matriz.
void completarMatrices(int matriz[FIL][COL]){

    for (int f = 0; f < FIL; f++){ 
        for (int c = 0; c < COL; c++){  
            printf("Ingrese el dato para la posicion [%i][%i]:", f, c);
            scanf("%i", &matriz[f][c]);
        }
    }
}

// Suma elemento a elemento dos matrices de dimensiones 2x3.
void sumaMatriz(int matriz1[FIL][COL], int matriz2[FIL][COL], int resultado[FIL][COL]){
    for (int f = 0; f < FIL; f++){     
        for (int c = 0; c < COL; c++){
            resultado[f][c] = matriz1[f][c] + matriz2[f][c];
        }
    }
}

// Resta elemento a elemento dos matrices de dimensiones 2x3.
void restaMatriz(int matriz1[FIL][COL], int matriz2[FIL][COL], int resultado[FIL][COL]){
    for (int f = 0; f < FIL; f++){     
        for (int c = 0; c < COL; c++){
            resultado[f][c] = matriz1[f][c] - matriz2[f][c];
        }
    }
}

// Realiza la multiplicación elemento a elemento entre dos matrices.
void multiplicacionMatriz(int matriz1[FIL][COL], int matriz2[FIL][COL], int resultado[FIL][COL]){
    for (int f = 0; f < FIL; f++){     
        for (int c = 0; c < COL; c++){
            resultado[f][c] = matriz1[f][c] * matriz2[f][c];
        }
    }
}

// Imprime en consola el contenido de una matriz dada, organizándolo en formato de filas y columnas con corchetes y tabulaciones.
void mostrarResultado(int matriz[FIL][COL]){
    for (int f = 0; f < FIL; f++){     
        for (int c = 0; c < COL; c++){
            printf("[%i]\t", matriz[f][c]);
        }
    printf("\n");
    }
}

int main() {
    int matrizC[FIL][COL], matrizD[FIL][COL];
    int suma[FIL][COL], resta[FIL][COL], multiplicacion[FIL][COL];
    int a, b;

    //Encabezado de mi programa
    printf("--------------------------------------------");
    printf("\n OPERACIONES CON MATRICES DE 2 x 3:\n");
    printf("--------------------------------------------");

    // Lectura de valores por consola para matrizC y matrizD
    printf("\nMostrando los datos de la matriz C:\n");
    completarMatrices(matrizC);

    printf("\nMostrando los datos de la matriz D:\n");
    completarMatrices(matrizD);

    // Muestra en pantalla de las matrices ingresadas
    printf("---------------------\n");
    printf("MATRIZ A:\n");
    mostrarResultado(matrizC);
    printf("---------------------\n");
    
    printf("MATRIZ D:\n");
    mostrarResultado(matrizD);
    printf("---------------------\n");

    // Ejecución de las operaciones matriciales
    sumaMatriz(matrizC, matrizD, suma);
    restaMatriz(matrizC, matrizD, resta);
    multiplicacionMatriz(matrizC, matrizD, multiplicacion);

    //Resultado de la suma
    printf("--------------------------------------------");
    printf("\nResultado de la suma:\n");
    mostrarResultado(suma);
    printf("--------------------------------------------\n");

    //Resultado de la resta
    printf("--------------------------------------------");
    printf("\nResultado de la resta:\n");
    mostrarResultado(resta);
    printf("--------------------------------------------\n");

    //Resultado de la multiplicacion
    printf("--------------------------------------------");
    printf("\nResultado de la multiplicacion:\n");
    mostrarResultado(multiplicacion);
    printf("--------------------------------------------\n");
    
    return 0;
}
