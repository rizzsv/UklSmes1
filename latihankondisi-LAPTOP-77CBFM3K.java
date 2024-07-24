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
      Tagihan(pemakaian);
         System.out.println("apakah anda ingin melanjutkan? (yes/no)");
               user.nextLine();
               String jawaban = user.nextLine();

               if(!jawaban.equals("yes")){
                  lanjut = false;
               }
      }
      } 
      public static void Tagihan  (int pemakaian){
         int total = 0;
         
         if(pemakaian % 10 != 0){
            pemakaian = (int) Math.ceil((double) pemakaian / 10) * 10;
         }
         while (pemakaian != 0) {
            if (pemakaian > 30) {
               total += 5000;
            } else if (pemakaian == 30) {
               total += 4000;
            } else if (pemakaian == 20) {
               total += 3000;
            } else  {
               total += 2000;
            }

            pemakaian -= 10;
         }

      System.out.println("total : " + (total + 10000));
      }
   }


