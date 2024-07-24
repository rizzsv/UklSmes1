import java.text.DecimalFormat;
import java.util.Scanner;

public class pembayaranSPP {
  public static Scanner input = new Scanner(System.in);
  public static DecimalFormat df = new DecimalFormat("#,###,###");

  public static void main(String[] args) {
    String[] nama = { "Mira", "Nina", "Oemar", "Pena" };
    String[] jalurMasuk = { "SBMPTN", "SNMPTN", "MANDIRI", "SBMPTN" };
    String[] Alamat = { "Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo" };
    int id, pendapatanOrtu, Spp;

    boolean lagi = true;
    boolean ulangi;
    char GolonganPendapatan = '-';

    while (lagi) {

      // MEMASUKAN ID
      outerloop1: while (true) {
        try {
          System.out.print("\nMASUKAN ID MAHASISWA : ");
          id = input.nextInt();
          if (id <= 0 || id > 4) {
            System.err.println("\n!!! ID MAHASISWA TIDAK DI TEMUKAN !!!");
            ulangi = getYesOrNo();
            if (ulangi == false) {
              System.exit(0);
            } else {
              continue outerloop1;
            }
          }
          break;
        } catch (Exception e) {
          System.err.println("\n!!! ANDA HARUS MEMASUKAN ANGKA !!!");
          ulangi = getYesOrNo();
          if (ulangi == true) {
            input.nextLine();
            continue outerloop1;
          } else {
            System.exit(0);
          }
        }
      }

      // MEMASUKAN PENGHASILAN
      outerloop2: while (true) {
        try {
          System.out.print("\nMASUKAN PEDAPATAN ORANG TUA : ");
          pendapatanOrtu = input.nextInt();
          if (pendapatanOrtu <= 0) {
            System.err.println("\n!!! PENDAPATAN ORANG TUA TIDAK BOLEH 0 ATAU KURANG !!!");
            ulangi = getYesOrNo();
            if (ulangi == false) {
              System.exit(0);
            } else {
              continue outerloop2;
            }
          }
          GolonganPendapatan = Golongan(pendapatanOrtu);
          break;
        } catch (Exception e) {
          System.err.println("\n!!! ANDA HARUS MEMASUKAN ANGKA BULAT !!!");
          ulangi = getYesOrNo();
          if (ulangi == true) {
            input.nextLine();
            continue outerloop2;
          } else {
            System.exit(0);
          }
        }
      }

      // MEMASUKAN SPP
      outerloop3: while (true) {
        try {
          System.out.print("\nMASUKAN JUMLAH BULAN SPP YANG AKAN DI BAYAR : ");
          Spp = input.nextInt();
          if (Spp <= 0) {
            System.err.println("\n!!! TIDAK BOLEH KURANG DARI 1 !!!");
            ulangi = getYesOrNo();
            if (ulangi == false) {
              System.exit(0);
            } else {
              continue outerloop3;
            }
          }
          break;
        } catch (Exception e) {
          System.err.println("\n!!! ANDA HARUS MEMASUKAN ANGKA BULAT !!!");
          ulangi = getYesOrNo();
          if (ulangi == true) {
            continue outerloop3;
          } else {
            System.exit(0);
          }
        }
      }

      System.out.println("\nID MAHASISWA : " + id);
      System.out.println("NAMA MAHASISWA : " + nama[id - 1]);
      System.out.println("JALUR MASUK : " + jalurMasuk[id - 1]);
      System.out.println("ALAMAT : " + Alamat[id - 1]);
      System.out.println("PENDAPATAN ORANG TUA : " + df.format(pendapatanOrtu));
      System.out.println("GOLONGAN : " + GolonganPendapatan);
      System.out.println("JUMLAH BULAN SPP DIBAYAR : " + Spp);
      Biaya(GolonganPendapatan, jalurMasuk, id, Spp);
      lagi = getYesOrNo();
    }
    input.close();

  }

  public static boolean getYesOrNo() {
    String jawaban;
    input.nextLine();
    System.out.print("\nAPAKAH ANDA INGIN MELANJUTKAN ? (Y/N) : ");
    jawaban = input.next();

    while (!jawaban.equalsIgnoreCase("y") && !jawaban.equalsIgnoreCase("n")) {
      System.err.println("\n!!! PASTIKAN JAWABAN ANDA BENAR !!!");
      System.out.print("\nAPAKAH ANDA INGIN MELANJUTKAN ? (Y/N) : ");
      jawaban = input.next();
    }
    return jawaban.equalsIgnoreCase("y");
  }

  public static void Biaya(char golongan, String jalur[], int id, int bulan) {
    int SPP, DSP;
    switch (jalur[id - 1]) {
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
