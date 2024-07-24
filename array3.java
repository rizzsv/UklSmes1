import java.util.Scanner;

/**
 *
 * @author lenovo1
 */
public class array3 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] deret;
        int sukuPertama, selisih, jumlahYangDitampilkan, jumlahDeret = 0;
        boolean lagi = true;
        String jawaban;
        
        while (lagi == true) {
            System.out.print("Masukkan suku pertama : ");
            sukuPertama = scan.nextInt();
            System.out.print("Masukkan selisih : ");
            selisih = scan.nextInt();
            System.out.print("Masukkan jumlah angka yang ingin ditampilkan : ");
            jumlahYangDitampilkan = scan.nextInt();
            deret = new int[jumlahYangDitampilkan];
            System.out.println(jumlahYangDitampilkan + " suku pertama yang akan ditampilkan adalah : ");
            
            for (int i = 0; i < jumlahYangDitampilkan; i++) {
                System.out.print(sukuPertama + " ");
                deret[i] = sukuPertama;
                sukuPertama += selisih;
            }
            System.out.print("\n\n");
            
            int baris = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < baris; j++) {
                    System.out.print(deret[j] + " ");
                }
                System.out.print("\n");
                baris++;
            }
            
            baris = 2;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < baris; j++) {
                    System.out.print(deret[j] + " ");
                }
                System.out.print("\n");
                baris--;
            }
            
            System.out.print("\nIngin membuat deret lagi? (ya/tidak) : ");
            scan.nextLine();
            jawaban = scan.nextLine();
            if (!jawaban.equalsIgnoreCase("ya")) {
                lagi = false;
            }
        }
    }
}
