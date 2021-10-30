package Bai_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Person Ps1 = new Person("Thioacetone", 19, "Nam", "Art");
        System.out.println("Person 1 is: " + Ps1.toString());

        Scanner hi = new Scanner(System.in);

        Person Ps_2 = new Person();
        System.out.print("\nEnter your name: ");
        String text = hi.nextLine();
        Ps_2.setName(text);

        System.out.print("Enter your age: ");
        int x = hi.nextInt();
        Ps_2.setAge(x);

        System.out.print("Enter your gender: ");
        text = hi.nextLine();
        text = hi.nextLine();
        Ps_2.setGender(text);

        System.out.print("Enter your hobby: ");
        text = hi.next();
        Ps_2.setHobby(text);

        System.out.println("Person 2:");
        System.out.println("Name: " + Ps_2.getName());
        System.out.println("Age: " + Ps_2.getAge());
        System.out.println("Gender: " + Ps_2.getGender());
        System.out.println("Hobby: " + Ps_2.getHobby());

        


    }
}
