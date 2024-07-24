public class latihantiga {
    public static void main(String[] args) {
        int satu = 5;
        
        
        for(int c = 5; c>= 1; c--){
            for(int d = 1; d<= c; d++){
                System.out.print(satu + "\t");
                satu += 3;
            }System.out.println();
        }
    }
}
