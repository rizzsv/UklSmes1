
public class aritmatika2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4]; // Membuat matriks 3x4

        int nilai = 5; // Nilai awal dari deret angka
        for (int i = 0; i < 3; i++) { // Loop baris
            for (int j = 0; j < 4; j++) { // Loop kolom
                if (nilai <= 38) {
                    matrix[i][j] = nilai;
                    nilai += 3; // Melompat 3 angka ke depan
                } else {
                    matrix[i][j] = 0; // Jika deret angka habis, isi dengan 0
                }
            }
        }

        // Mencetak matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}




