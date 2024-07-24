import java.util.Scanner;
import java.text.DecimalFormat;

public class variasidua{
    static Scanner user = new Scanner(System.in);
    public static DecimalFormat df = new DecimalFormat("#,###,###");
    public static void main(String[] args) {
        String[] nama = {"Mira", "Nina" , "Oemar", "Pena"};
        String[] jalurMasuk = {"SBMPTN", "SNMPTN", "MANDIRI", "SBMPTN"};
        int id, pendapatanOT, spp;

        boolean lanjut = true;

        while(lanjut){
            System.out.println("Masukan Id Mahasiswa: ");
            id = user.nextInt();
            System.out.println("Masukan Jumlah Pendapatan Orang Tua: ");
            pendapatanOT = user.nextInt();

            if(id >= 1 || id <= 4){
                System.out.println("id: " + id);
                System.out.println("Nama: " + nama[id - 1]);
                System.out.println("Jalur Masuk: " + jalurMasuk[id - 1]);


                System.out.println("Apakah Anda Ingin Melanjutkan? (true/false): ");
                lanjut = user.nextBoolean();
            }else {
                System.out.println("ID TIDAK VALID");
            }
        }
    }
    public static void Pendapatan (char golongan, String[] jalurmasuk, int id, int bulan){
        int spp, dsp;

        switch (jalurmasuk[id - 1]) {
            case "SBMPTN":
        switch (golongan) {
            case 'A':
            spp = 5000000;
            dsp = 50000000;
            System.out.println("DSP : " + df.format(dsp)); 
            System.out.println("SPP : " + df.format(spp)); 
            System.out.println("TOTAL : " + df.format(bulan * spp) + dsp);             
            break;

            case 'B':
            spp = 1000000;
            dsp = 15000000;
            System.out.println("DSP: " + df.format(dsp));
            System.out.println("SPP: " + df.format(spp));
            System.out.println("TOTAL: " + df.format((bulan * spp) + dsp));
            break;

            case 'c':
            spp = 2000000;
            dsp = 30000000;
            System.out.println("DSP: " + df.format(dsp));
            System.out.println("SPP: " + df.format(spp));
            break;
            
            default:
            System.out.println("\nKESALAHAN PROGRAM");
        }        
            break;

            case "SNMPTN":
        switch (golongan) {
            case 'A':
            spp = 5000000;
            dsp = 50000000;
            System.out.println("DSP : " + df.format(dsp)); 
            System.out.println("SPP : " + df.format(spp)); 
            System.out.println("TOTAL : " + df.format(bulan * spp) + dsp);             
            break;

            case 'B':
            spp = 1000000;
            dsp = 15000000;
            System.out.println("DSP: " + df.format(dsp));
            System.out.println("SPP: " + df.format(spp));
            System.out.println("TOTAL: " + df.format((bulan * spp) + dsp));
            break;

            case 'c':
            spp = 2000000;
            dsp = 30000000;
            System.out.println("DSP: " + df.format(dsp));
            System.out.println("SPP: " + df.format(spp));
            break;

        
            default:
                break;
        }
    }
 }
}
