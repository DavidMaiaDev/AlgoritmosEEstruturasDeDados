package Algoritmos.ArvoreBinaria;

public class ArvoreBinaria {

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int item = 15;
        int resultado = pesquisaBinaria(lista, item);

        if (resultado != -1) {
            System.out.println("Item encontrado na posição: " + resultado);
        } else {
            System.out.println("Não foi possível encontrar o item na lista.");
        }
    }

    public static int pesquisaBinaria(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if (chute == item) {
                return meio;
            } else if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }
}