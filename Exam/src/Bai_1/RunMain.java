package Bai_1;

import java.util.Scanner;

public class RunMain {

    static Scanner input = new Scanner(System.in);
       
    public static void main(String[] args) {
        System.out.println("Enter the string you want: ");
        String str = input.nextLine();
        int sum = 0, count = 0, volume = 1;
        for(int i = 0; i < str.length(); i++) {
            if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                sum += Character.getNumericValue(str.charAt(i));
                ++ count;
            }
        }

        for(int i = 0; i < str.length(); i++) {
            if('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                if(sum % Character.getNumericValue(str.charAt(i)) == 0){
                    volume *= Character.getNumericValue(str.charAt(i));
                }
            }
        }
        if(count == 0){
            System.out.println("Don't has the number in string!");
        }
        else{
            System.out.printf("Have %d numbers in String!\n", count);
            System.out.println("Mutiplication are: " + volume);
        }
    }
}
