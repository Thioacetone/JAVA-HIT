////////////////////////////////////////////////////////////////////////////
///////////// Code tâm linh, đức phật phù hộ code không bug ////////////////
//                                   _
//                                 oo0oo
//                               o8888888o
//                               88” . “88
//                               (| - - |)
//                               O\  =  /O
//                             ___/'---'\___
//                          .'  \\|     |// '.
//                         /  \\|||  :  |||//  \
//                        /   ||||| -:- |||||   \
//                        |   | \\\  -  /'| |   |
//                        | \_|  `\`---'//  |_/ |
//                        \  .-\__ `-. -'__/-.  /
//                      ___. .'  /--.--\  . . '___
//                   ."" '<  `.___\_<|>_/___.'  _> \"".
//                  | | :  - \. ;`. _/; .'/  /  .' ; |
//                  \  \ -.   \_\_. _.' _/_/  -' _.' /
//===================`-.`___`-.__\ \___   /__.-'.'.-'===================//
//                              Thioacetone

package Buoi_4.src.Bai_5;
public class main{
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(5.6));
    }
    static boolean isPrime(int n){
        if(n < 2) 
            return false;
        for(int i = 2; i * i <= n; ++ i){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    static boolean isPrime(long n){
        if(n < 2) 
            return false;
        for(long i = 2; i * i <= n; ++ i){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    static boolean isPrime(float n){
        return false;
    }
    static boolean isPrime(double n){
        return false;
    }
}