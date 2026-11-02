package ARRAY_MULTIDIMENSI;

public class DIAGONAL_UTAMA {
    public static void main(String[] args) {

        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int total = 0;
        System.out.println("Matriks : ");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        
        for (int i = 0; i < matriks.length; i++) {
            total += matriks[i][i];
        }
        System.out.println("\nJumlah diagonal utama: " + total);
    }
}