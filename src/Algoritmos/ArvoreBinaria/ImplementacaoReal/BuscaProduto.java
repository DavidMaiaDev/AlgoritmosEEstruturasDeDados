package Algoritmos.ArvoreBinaria.ImplementacaoReal;

public class BuscaProduto {
    public static void main(String[] args) {
        Produto[] listaProdutos = {
                new Produto("Camiseta"),
                new Produto("Calça"),
                new Produto("Jaqueta"),
                new Produto("Meia"),
                new Produto("Sapato"),
                new Produto("Boné"),
                new Produto("Cinto")
        };

        String produtoBuscado = "Meia";
        int resultado = pesquisaBinaria(listaProdutos, produtoBuscado);

        if (resultado != -1) {
            System.out.println("Produto encontrado na posição: " + resultado);
        } else {
            System.out.println("Produto não encontrado na lista.");
        }
    }

    public static int pesquisaBinaria(Produto[] lista, String produto) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            String nomeMeio = lista[meio].getNome();

            int comparacao = nomeMeio.compareTo(produto);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }

        return -1; // Produto não encontrado
    }
}