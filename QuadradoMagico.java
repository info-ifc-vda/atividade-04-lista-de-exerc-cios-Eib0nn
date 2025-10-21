public class QuadradoMagico {

    public static boolean eQuadradoMagico(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) return false;
        }

        int somaEsperada = 0;
        for (int j = 0; j < n; j++) {
            somaEsperada += matriz[0][j];
        }

        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) somaLinha += matriz[i][j];
            if (somaLinha != somaEsperada) return false;
        }

        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) somaColuna += matriz[i][j];
            if (somaColuna != somaEsperada) return false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matriz[i][i];
            diag2 += matriz[i][n - i - 1];
        }
        if (diag1 != somaEsperada || diag2 != somaEsperada) return false;

        java.util.Set<Integer> elementos = new java.util.HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!elementos.add(matriz[i][j])) return false;
            }
        }

        return true;
    }
}
