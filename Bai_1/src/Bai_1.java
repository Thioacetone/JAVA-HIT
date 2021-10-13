public class Bai_1 {
    public static void main(String ...args){
        int m = 7, n = 5;
        for(int i = 0;i < n;++ i){
            for(int j = 0; j < m; ++ j){
                if(i == 0 || i == n - 1){
                    System.out.print("*");
                }
                else{
                    if(j == 0 || j == m - 1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
