import java.util.Scanner;
import java.text.DecimalFormat;

public class variasidua {
    static Scanner user = new Scanner(System.in);
    public static DecimalFormat df = new DecimalFormat("#,###,###");
    public static void main(String[] args) {
        String[] nama = {"Mira", "Nina", "Oemar", "Pena"};
        String[] JalurMasuk = {"SBMPTN","SNMPTN","Mandiri","SBMPTN"};
        int id, PendapatanOt, spp;

        boolean lanjut = true;

        while(lanjut){
            System.out.print("Masukan Id Mahasiswa: ");
            id = user.nextInt();
            System.out.print("Masukan Jumlah Pendapatan Orang Tua: ");
            int pendapatanOT = user.nextInt();

            if(id >= 1 || id <= 4){
                System.out.println("id: " + id);
                System.out.println("Nama: " + nama[id - 1]);
                System.out.println("Jalur Masuk: " + JalurMasuk[id - 1]);

                Pendapatan(Golongan(pendapatanOT), JalurMasuk, id, 12); // asumsi 12 bulan untuk perhitungan total

                System.out.print("Apakah Anda ingin melanjutkan? (true/false): ");
                lanjut = user.nextBoolean();
            } else {
                System.out.println("ID tidak valid");
         
            }
                
        }
    }
    public static void Pendapatan (char golongan, String[] JalurMasuk, int id, int bulan){
        int SPP, DSP;

        switch (JalurMasuk[id - 1]) {
            case "SBMPTN":
              switch (golongan) {
                case 'A':
                  SPP = 500000;
                  DSP = 5000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                case 'B':
                  SPP = 1000000;
                  DSP = 15000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                case 'C':
                  SPP = 2000000;
                  DSP = 30000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                default:
                  System.out.println("\nSOMETHING WENT WRONG");
              }
              break;
            case "SNMPTN":
              switch (golongan) {
                case 'A':
                  SPP = 500000;
                  DSP = 7000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                case 'B':
                  SPP = 1000000;
                  DSP = 17000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                case 'C':
                  SPP = 2000000;
                  DSP = 35000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                default:
                  System.out.println("\nSOMETHING WENT WRONG");
              }
              break;
            case "MANDIRI":
              switch (golongan) {
                case 'A':
                  SPP = 1000000;
                  DSP = 10000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                case 'B':
                  SPP = 2000000;
                  DSP = 25000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                case 'C':
                  SPP = 3000000;
                  DSP = 50000000;
                  System.out.println("DSP : " + df.format(DSP));
                  System.out.println("SPP : " + df.format(SPP));
                  System.out.println("TOTAL : " + df.format((bulan * SPP) + DSP));
                  break;
                default:
                  System.out.println("\nSOMETHING WENT WRONG");
              }
              break;
            default:
              System.out.println("\nSOMETHING WENT WRONG");
          }
        }
      
        public static char Golongan(int pendapatan) {
          char golongan = '-';
          if (pendapatan < 2000000) {
            golongan = 'A';
          } else if (pendapatan > 2000000 && pendapatan < 10000000) {
            golongan = 'B';
          } else {
            golongan = 'C';
          }
      
          return golongan;

    }
}
