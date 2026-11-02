package ARRAY_MULTIDIMENSI;

public class Tranpose_Matriks {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] transpose = new int [3][3];
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    transpose[j][i] = matriks[i][j];
                }
            }
            System.out.println("Matriks Awal : ");
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(matriks[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Transpose : ");
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(transpose[i][j] + "\t");
                }
                System.out.println();
            }
    }  
}
