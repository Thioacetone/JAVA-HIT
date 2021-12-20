package bai_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        try {
            int n = input.nextInt();
            input.nextLine();
            for(int i = 0; i < n; ++ i) {
                Person x = new Person();
                System.out.print("Nhap id: "); x.setId(input.nextLine());
                System.out.print("Nhap ten: "); x.setName(input.nextLine());
                System.out.print("Nhap dia chi: "); x.setAddress(input.nextLine());
                people.add(x);
            }
        } catch (Exception e) {
            System.out.println("Loi du lieu!");
            return;
        }

        Collections.sort(people);
        System.out.println(people);
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int checkName = o1.getName().compareTo(o2.getName()),
                checkAdd = o1.getAddress().compareTo(o2.getAddress());
                return checkName !=0 ? checkName : checkAdd;
            }
        });
        System.out.println(people);
    }
}
