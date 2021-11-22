package Exam.src.Cau_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = 0;
        int sum = 0;
        int tich = 1;
        String s = input.nextLine();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                d++;
                sum += (int)s.charAt(i);
            }
        }
        if(d > 0){
            System.out.println("Co " + d + " chu so !");
            for(int i = 0; i <s.length(); ++ i){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    if(sum % (int)s.charAt(i) == 0){
                        tich *= (int)s.charAt(i);
                    }
                }
            }
            System.out.println("Tich: " + tich);
        }
        else{
            System.out.println("Khong co so trong chuoi!");
        }
    }
}
