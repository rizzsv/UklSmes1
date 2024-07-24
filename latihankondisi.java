import java.util.Scanner;

public class latihankondisi {
   static Scanner user = new Scanner(System.in);
   public static void main(String[] args) {
      
     String[] NamaPelanggan = {"ali", "budi", "dani", "edi", "umar"};
     int[] golongan = {1,2,3,4,5};
     int id, pemakaian = 0;
     
     boolean lanjut = true;

     while(lanjut){
      System.out.print("Masukan Id Pelanggan: ");
      id = user.nextInt();
      if (id >= 1 || id <= 4){
         System.out.println("Id: " + id);
         System.out.println("Nama: " + NamaPelanggan[id - 1]);

         System.out.print("Masukan Pemakaian: ");
         pemakaian = user.nextInt();
      }else{
         System.out.println("Program Tidak Dapat Diakses!");
      }
      System.out.println("Tagihan Anda Adalah : " + Tagihan(id, golongan, pemakaian));
      System.out.println("apakah anda ingin melanjutkan? (yes/no)");
            user.nextLine();
            String jawaban = user.nextLine();

            if(!jawaban.equals("yes")){
                lanjut = false;
            }
     }
   } 
   public static int Tagihan  (int id, int[]golongan, int pemakaian){
      
      int[] tarifPerm3 = {2000, 3000, 4000, 5000};
      int golonganUser = golongan[id - 1];

      if(pemakaian < 10){
         pemakaian =10;
      }else if(pemakaian > 40){
         pemakaian = 40;
      }
      int tarif = tarifPerm3[(pemakaian -  1)/10];
      int biayaAdmin = 10000;
      int totalTagihan = (tarif * pemakaian)+biayaAdmin;
      return totalTagihan;
   }
}


