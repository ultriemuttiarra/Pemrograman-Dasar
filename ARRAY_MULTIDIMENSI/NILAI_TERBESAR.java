package ARRAY_MULTIDIMENSI;

public class NILAI_TERBESAR {
    public static void main(String[] args) {
        int[][] matriks = {
            {10, 25, 30},
            {45, 15, 20},
            {35, 50, 40}
        };
        
        int terbesar = matriks[0][0];
        int baris = 0;
        int kolom = 0;
        
        for(int i = 0; i < matriks.length; i++) {
            for(int j = 0; j < matriks[i].length; j++) {
                if(matriks[i][j] > terbesar) {
                    terbesar = matriks[i][j];
                    baris = i;
                    kolom = j;
                }
            }
        }
        
         System.out.println("Matriks : ");
         for (int i = 0; i < matriks.length; i++) {
             for (int j = 0; j < matriks[i].length; j++) {
                 System.out.print(matriks[i][j] + "\t");
             }
             System.out.println();
         }
         
         System.out.println("Nilai Terbesar : " + terbesar);
         System.out.println("Posisi Baris   : " + (baris + 1));
         System.out.println("Posisi Kolom   : " + (kolom + 1));
    }
}
