#include <stdio.h>

const int FIL = 2;
const int COL = 3;

void completarMatrices(int matriz[FIL][COL]){

    for (int f = 0; f < FIL; f++){ 
        for (int c = 0; c < COL; c++){  
            printf("Ingrese el dato para la posicion [%i][%i]:", f, c);
            scanf("%i", &matriz[f][c]);
        }
    }
}

void sumaMatriz(int matriz1[FIL][COL], int matriz2[FIL][COL], int resultado[FIL][COL]){
    for (int f = 0; f < FIL; f++){     
        for (int c = 0; c < COL; c++){
            resultado[f][c] = matriz1[f][c] + matriz2[f][c];
        }
    }
}
void restaMatriz(int matriz1[FIL][COL], int matriz2[FIL][COL], int resultado[FIL][COL]){
    for (int f = 0; f < FIL; f++){     
        for (int c = 0; c < COL; c++){
            resultado[f][c] = matriz1[f][c] - matriz2[f][c];
        }
    }
}
void multiplicacionMatriz(int matriz1[FIL][COL], int matriz2[FIL][COL], int resultado[FIL][COL]){
    for (int f = 0; f < FIL; f++){     
        for (int c = 0; c < COL; c++){
            resultado[f][c] = matriz1[f][c] * matriz2[f][c];
        }
    }
}
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
    printf("--------------------------------------------");
    printf("\n OPERACIONES CON MATRICES DE 2 x 3:\n");
    printf("--------------------------------------------");
    
    printf("\nMostrando los datos de la matriz C:\n");
    completarMatrices(matrizC);

    printf("\nMostrando los datos de la matriz D:\n");
    completarMatrices(matrizD);

    printf("---------------------\n");
    printf("MATRIZ A:\n");
    mostrarResultado(matrizC);
    printf("---------------------\n");
    
    printf("MATRIZ D:\n");
    mostrarResultado(matrizD);
    printf("---------------------\n");

    sumaMatriz(matrizC, matrizD, suma);
    restaMatriz(matrizC, matrizD, resta);
    multiplicacionMatriz(matrizC, matrizD, multiplicacion);
    
    printf("--------------------------------------------");
    printf("\nResultado de la suma:\n");
    mostrarResultado(suma);
    printf("--------------------------------------------\n");
    
    printf("--------------------------------------------");
    printf("\nResultado de la resta:\n");
    mostrarResultado(resta);
    printf("--------------------------------------------\n");
    
    printf("--------------------------------------------");
    printf("\nResultado de la multiplicacion:\n");
    mostrarResultado(multiplicacion);
    printf("--------------------------------------------\n");
    
    return 0;
}