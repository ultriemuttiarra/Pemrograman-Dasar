package ARRAY_MULTIDIMENSI;

public class arraymultidimensi {
    public static void main(String[] args) {
        String[][][] dataMahasiswa = {
            {
                {"Andi", "Beta", "Cece", "Dede", "Echa"},
                {"Aca", "Bila", "Cipa", "Dani", "Ebel"},
                {"Alam", "Beti", "Capo", "Doni", "Ela"}
            },
            {
                {"Abe", "Bala", "Cica", "Dedi", "Eko"},
                {"Ali", "Bebel", "Caca", "Didi", "Eki"},
                {"Aci", "Bea", "Cici", "Dodo", "Eki"}
            },
            {
                {"Ara", "Bibi", "Copi", "Danu", "Esa"},
                {"Apoy", "Bite", "Citra", "Dika", "Eci"},
                {"Ade", "Biya", "Chika", "Danis", "Epi"}
            }
        };
        for(int i = 0; i < 3; i++) {
            System.out.println("Prodi" + (i + 1));
            for(int j = 0; j < 3; j++) {
                System.out.print("Kelas" + (j + 1) + " ");
                for(int k = 0; k < 5; k++) {
                    System.out.print(dataMahasiswa[i][j][k] + " ");
                }
                System.out.println();
            }
        } 
    }
}