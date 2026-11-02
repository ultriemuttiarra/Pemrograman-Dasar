package METHOD;

public class REKURSIF_JUMLAHDERET {
    public static int jumlahDeret(int n) {
        if (n == 0) {
            return 0;
        }
        return n + jumlahDeret(n - 1);
    }
    
    public static int jumlahDeretLoop(int n) {
        int total = 0;
        
        for(int i = 1; i <= n; i ++) {
            total += i;
        }
        return total;
    }
    
     public static void main(String[] args) {
         int n = 5;
         int hasilRekursif = jumlahDeret(n);
         int hasilPerulangan = jumlahDeretLoop(n);
         
         System.out.println("Jumlah Deret 1 sampai " + n);
         System.out.println("Hasil Rekursif = " + hasilRekursif);
         System.out.println("Hasil Perulangan = " + hasilPerulangan);
     }
}
