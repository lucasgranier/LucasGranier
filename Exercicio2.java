package uff.ic.lleme.tcc00328.exercicios

public class TabelaCampeonato {
    // Constantes simbólicas
    public static final int PG = 0;
    public static final int J = 1;
    public static final int V = 2;
    public static final int SG = 3;
    public static final int GP = 4;

    public static void main(String[] args) {
        int[][] tabela = {
            {30, 10, 8, 15, 25},
            {28, 10, 7, 12, 28},
            {30, 10, 9, 14, 30},
            {25, 10, 6, 8, 20},
            // Adicione mais times à matriz conforme necessário
        };

        int numeroDoLider = encontrarLider(tabela);
        System.out.println("O líder do campeonato é o time #" + numeroDoLider);
    }

    public static int encontrarLider(int[][] tabela) {
        int lider = -1;
        int maiorPontuacao = -1;
        int maiorVitorias = -1;
        int maiorSaldoGols = -1;
        int maiorGolsProprios = -1;

        for (int i = 0; i < tabela.length; i++) {
            int pontos = tabela[i][PG];
            int vitorias = tabela[i][V];
            int saldoGols = tabela[i][SG];
            int golsProprios = tabela[i][GP];

            if (pontos > maiorPontuacao ||
                (pontos == maiorPontuacao && vitorias > maiorVitorias) ||
                (pontos == maiorPontuacao && vitorias == maiorVitorias && saldoGols > maiorSaldoGols) ||
                (pontos == maiorPontuacao && vitorias == maiorVitorias && saldoGols == maiorSaldoGols && golsProprios > maiorGolsProprios)) {
                lider = i;
                maiorPontuacao = pontos;
                maiorVitorias = vitorias;
                maiorSaldoGols = saldoGols;
                maiorGolsProprios = golsProprios;
            }
        }

        return lider + 1; // Adicione 1 porque os times são numerados a partir de 1, não de 0.
    }
}
