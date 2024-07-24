import java.net.SocketTimeoutException;
import java.util.Scanner;

public class variasisatu {
    static Scanner user = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String[] Nama = {"galuh", "indro", "akmal", "luky"};
        int[] Golongan = {1, 3, 2, 3};
        String[] alamat = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        int id, tagihan = 0; 
        boolean lanjut = true;
        
        while(lanjut){
            System.out.print("Masukan Id Pelanggan: ");
            id = user.nextInt();
            if (id >= 1 || id <= 4) {
                System.out.println("id: " + id);
                System.out.println("Nama: " + Nama[id - 1]);
                System.out.println("Golongan: " + Golongan[id - 1]);
                System.out.println("Alamat: " + alamat[id - 1]);

                System.out.print("Masukan Tagihan: ");
                tagihan = user.nextInt();
            }else{
                System.out.println("Program Tidak Dapat Diakses");
            }
            System.out.println("Tagihan Anda Adalah : " + Tagihan(id, Golongan, tagihan));

            System.out.println("apakah anda ingin melanjutkan? (yes/no)");
            user.nextLine();
            String jawaban = user.nextLine();

            if(!jawaban.equals("yes")){
                lanjut = false;
            }
        }
    }  
    public static int Tagihan (int id, int[]golongan, int pemakaian){
        int total = 0;
        int hasil = 0;

        int golonganUser = golongan[id - 1];

        switch (golonganUser) {
            case 1: 
            total += (pemakaian * 1000) + 13000;
            hasil = (total < 50000)? 50000 : total;
            break;
            case 2: 
            total += (pemakaian * 1300) + 13000;
            hasil = (total < 50000)? 50000 : total;
            break;
            case 3: 
            total += (pemakaian * 1500) + 13000;
            hasil = (total < 50000)? 50000 : total;
            break;
            default:
            System.out.println("Tidak Ditemukan");
            hasil = 0;
        }
        return hasil;
    }   
}

