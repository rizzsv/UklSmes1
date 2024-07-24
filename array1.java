public class array1 {

    public void pengurangan_Matriks(int[][] matriks_A, int[][] matriks_B) {
        int[][] hasil;
        hasil = new int[matriks_A.length][matriks_A[0].length];

        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                hasil[i][j] = matriks_A[i][j] - matriks_B[i][j];
            }
        }

        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[]     args) {
        array1 obj = new array1();
        
        int[][] matriks_A;
        matriks_A = new int[][]{
            {-7, 5},
            {4, 8},
        };

        int[][] matriks_B;
        matriks_B = new int[][]{
            {1, 1},
            {-4, 9},
        };

        obj.pengurangan_Matriks(matriks_A, matriks_B);
    }
}
