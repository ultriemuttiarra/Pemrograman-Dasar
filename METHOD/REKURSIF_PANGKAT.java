package METHOD;

public class REKURSIF_PANGKAT {
    public static int pangkat(int basis, int eksponen) {
        if (eksponen == 0) {
            return 1;
        }
        return basis * pangkat(basis, eksponen - 1);
    }
    
    public static void main(String[] args) {
        int basis = 2;
        int eksponen = 3;
        int hasil = pangkat(basis, eksponen);
        
        System.out.println("Basis = " + basis);
        System.out.println("Eksponen = " + eksponen);
        System.out.println("Hasil Pangkat = " + hasil);
    }
}
