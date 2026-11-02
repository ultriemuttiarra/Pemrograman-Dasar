package METHOD;

public class REKURSIF_CETAKBINER {
    public static void cetakBiner(int n) {
        if (n > 1) {
            cetakBiner(n / 2);
        }
        System.out.print(n % 2);
    }
    
    public static void main(String[] args) {
        int angka = 10;
        
        System.out.println("Bilangan Desimal : " + angka);
        System.out.print("Bilangan Biner : ");
        cetakBiner(angka);
        System.out.println();
    }
}
