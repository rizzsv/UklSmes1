import java.util.Scanner;
public class array2 {
    static Scanner scan = new Scanner(System.in);
    
    public static void displayMatrix(int[][] dataMatrix) {
        for (int i = 0; i < dataMatrix.length; i++) 
        {
            System.out.print("[");
            for (int j = 0; j < dataMatrix[0].length; j++) 
            {
                System.out.print(dataMatrix[i][j]);
                if (j < (dataMatrix[0].length - 1)) 
                {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    
    public static void perkalianMatrix(int[][] matrixA, int[][] matrixB) {
        int kolom_Matrix_A = matrixA[0].length;
        int baris_Matrix_B = matrixB.length;
        int[][] hasil;
        int hasilPerElemen;
        
        if (kolom_Matrix_A == baris_Matrix_B) {
            hasil = new int[matrixA.length][matrixB[0].length];
            
            for (int i = 0; i < hasil.length; i++) {
                for (int j = 0; j < hasil[i].length; j++) {
                    hasilPerElemen = 0;
                    for (int k = 0; k < matrixA[i].length; k++) {
                        hasilPerElemen += (matrixA[i][k] * matrixB[k][j]);
                    }
                    
                    hasil[i][j] = hasilPerElemen;
                }
            }
            
            displayMatrix(hasil);
        }else {
            System.out.println("kolom matrix A tidak sama dengan baris matrix B");
        }
    }
    
    public static void main(String[] args) {
        int baris, kolom;
        int[][] matrix_A;
        matrix_A = new int[][]{
            {6, 3},
            {4, 8},
        };
        int[][] matrix_B;
        matrix_B = new int[][]{
            {1},
            {2},
        };

        
        System.out.println("Mastrix A : ");
        displayMatrix(matrix_A);
        System.out.println("Dikali Matrix B : ");
        displayMatrix(matrix_B);
        System.out.println("Sama dengan : ");
        perkalianMatrix(matrix_A, matrix_B);
    }
}
