FIL = 2
COL = 3


def completar_matrices(matriz):
    for f in range(FIL):
        for c in range(COL):
            matriz[f][c] = int(input(f"Ingrese el dato para la posicion [{f}][{c}]:"))


def suma_matriz(matriz1, matriz2, resultado):
    for f in range(FIL):
        for c in range(COL):
            resultado[f][c] = matriz1[f][c] + matriz2[f][c]


def resta_matriz(matriz1, matriz2, resultado):
    for f in range(FIL):
        for c in range(COL):
            resultado[f][c] = matriz1[f][c] - matriz2[f][c]


def multiplicacion_matriz(matriz1, matriz2, resultado):
    for f in range(FIL):
        for c in range(COL):
            resultado[f][c] = matriz1[f][c] * matriz2[f][c]


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

    print("--------------------------------------------", end="")
    print("\n OPERACIONES CON MATRICES DE 2 x 3:")
    print("--------------------------------------------", end="")

    print("\nMostrando los datos de la matriz C:")
    completar_matrices(matrizC)

    print("\nMostrando los datos de la matriz D:")
    completar_matrices(matrizD)

    print("---------------------")
    print("MATRIZ C:")
    mostrar_resultado(matrizC)
    print("---------------------")

    print("MATRIZ D:")
    mostrar_resultado(matrizD)
    print("---------------------")

    suma_matriz(matrizC, matrizD, suma)
    resta_matriz(matrizC, matrizD, resta)
    multiplicacion_matriz(matrizC, matrizD, multiplicacion)

    print("--------------------------------------------", end="")
    print("\nResultado de la suma:")
    mostrar_resultado(suma)
    print("--------------------------------------------")

    print("--------------------------------------------", end="")
    print("\nResultado de la resta:")
    mostrar_resultado(resta)
    print("--------------------------------------------")

    print("--------------------------------------------", end="")
    print("\nResultado de la multiplicacion:")
    mostrar_resultado(multiplicacion)
    print("--------------------------------------------")


if __name__ == "__main__":
    main()