# Dimensiones constantes para las matrices 
FIL = 2
COL = 3

# Pide al usuario los valores de las matrices
def completar_matrices(matriz):
    for f in range(FIL):
        for c in range(COL):
            matriz[f][c] = int(input(f"Ingrese el dato para la posicion [{f}][{c}]:"))

# Suma elemento por elemento de las dos matrices de la misma dimension
def suma_matriz(matriz1, matriz2, resultado):
    for f in range(FIL):
        for c in range(COL):
            resultado[f][c] = matriz1[f][c] + matriz2[f][c]

# Resta elemento por elemento de las dos matrices de la misma dimension
def resta_matriz(matriz1, matriz2, resultado):
    for f in range(FIL):
        for c in range(COL):
            resultado[f][c] = matriz1[f][c] - matriz2[f][c]

# Multiplicacion de elemento por elemento de las dos matrices de la misma dimension
def multiplicacion_matriz(matriz1, matriz2, resultado):
    for f in range(FIL):
        for c in range(COL):
            resultado[f][c] = matriz1[f][c] * matriz2[f][c]

# Muestra en pantalla la matriz en formato tabla con corchetes y tabulaciones
def mostrar_resultado(matriz):
    for f in range(FIL):
        for c in range(COL):
            print(f"[{matriz[f][c]}]", end="\t")
        print()


def main():
    matrizC = [[0] * COL for _ in range(FIL)]
    matrizD = [[0] * COL for _ in range(FIL)]
    suma = [[0] * COL for _ in range(FIL)]
    resta = [[0] * COL for _ in range(FIL)]
    multiplicacion = [[0] * COL for _ in range(FIL)]

    # Encabezado principal de mi programa
    print("--------------------------------------------", end="")
    print("\n OPERACIONES CON MATRICES DE 2 x 3:")
    print("--------------------------------------------", end="")

    # Lectura de datos introducidos por el usuario
    print("\nMostrando los datos de la matriz C:")
    completar_matrices(matrizC)

    print("\nMostrando los datos de la matriz D:")
    completar_matrices(matrizD)

    # Imprime las matrices ingresadas
    print("---------------------")
    print("MATRIZ C:")
    mostrar_resultado(matrizC)
    print("---------------------")

    print("MATRIZ D:")
    mostrar_resultado(matrizD)
    print("---------------------")

    # Ejecucion de las operaciones aritmeticas
    suma_matriz(matrizC, matrizD, suma)
    resta_matriz(matrizC, matrizD, resta)
    multiplicacion_matriz(matrizC, matrizD, multiplicacion)

    # Impresion del resultado de la suma
    print("--------------------------------------------", end="")
    print("\nResultado de la suma:")
    mostrar_resultado(suma)
    print("--------------------------------------------")

    # Impresion del resultado de la resta
    print("--------------------------------------------", end="")
    print("\nResultado de la resta:")
    mostrar_resultado(resta)
    print("--------------------------------------------")

    # Impresion del resultadon de la multiplicacion
    print("--------------------------------------------", end="")
    print("\nResultado de la multiplicacion:")
    mostrar_resultado(multiplicacion)
    print("--------------------------------------------")

# Punto de entrada del script
if __name__ == "__main__":
    main()
