package ARRAY_MULTIDIMENSI;

public class MataKuliah {
    public static void main(String[] args) {
        double[][] nilai = {
            {85, 78, 89, 90},
            {90, 88, 80, 77},
            {80, 76, 90, 85}
        };
        
        System.out.println("RATA-RATA NILAI");
        for(int i = 0; i < nilai.length; i++) {
            double total = 0;
            for(int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            
            double rataRata = total / nilai[i].length;
            System.out.println("Mahasiswa ke-" + (i + 1) + " = " + rataRata);
        }
    }
}



