package uff.ic.lleme.tcc00328.exercicios

public class TabelaCampeonato {
    
    public static final int PG = 0;
    public static final int J = 1;
    public static final int V = 2;
    public static final int SG = 3;
    public static final int GP = 4;

    public static void main(String[] args) {
        int[][] tabela = {
            {10, 8, 3, -4, 12},
            {17, 8, 5, 10, 19},
            {10, 8, 3, -5, 11},
            {11, 8, 3, -1, 15},
            {19, 8, 6, 13, 23},
            
        };

        int numeroDoLider = encontrarLider(tabela);
        System.out.println("O lider do campeonato e o time " + numeroDoLider);
    }

    public static int encontrarLider(int[][] tabela) {
        int lider = -1;
        int maiorPontuacao = -1;
        int maiorVitorias = -1;
        int maiorSaldoGols = -1;
        int maiorGolsPro = -1;

        for (int i = 0; i < tabela.length; i++) {
            int pontos = tabela[i][PG];
            int vitorias = tabela[i][V];
            int saldoGols = tabela[i][SG];
            int golsPro = tabela[i][GP];

            if (pontos > maiorPontuacao ||
                (pontos == maiorPontuacao && vitorias > maiorVitorias) ||
                (pontos == maiorPontuacao && vitorias == maiorVitorias && saldoGols > maiorSaldoGols) ||
                (pontos == maiorPontuacao && vitorias == maiorVitorias && saldoGols == maiorSaldoGols && golsPro > maiorGolsPro)) {
                lider = i;
                maiorPontuacao = pontos;
                maiorVitorias = vitorias;
                maiorSaldoGols = saldoGols;
                maiorGolsPro = golsPro;
            }
        }

        return lider + 1;
    }
}

        return lider + 1; // Adicione 1 porque os times são numerados a partir de 1, não de 0.
    }
}
