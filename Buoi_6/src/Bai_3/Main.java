package Bai_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        ArrayList<News> listNews = new ArrayList<>();

        while(true) {
            System.out.println("======Menu======\n" + 
            "1. Insert news\n" +
            "2. View list news\n" +
            "3. Average rate \n" +
            "4. Exit\n");
            do {
                System.out.println("Enter your choose: ");
                choose = input.nextInt();
            } while(choose < 1 || choose > 4);

            switch(choose) {
                case 1:
                    input.nextLine();
                    News temp = new News();
                    System.out.print("Enter title: "); temp.setTitle(input.nextLine());
                    System.out.print("Enter publish date: "); temp.setPublishDate(input.nextLine());
                    System.out.print("Enter author: "); temp.setAuthor(input.nextLine());
                    System.out.print("Enter content: "); temp.setContent(input.nextLine());
                    System.out.print("Enter three rate: "); temp.setRateList(
                        input.nextInt(), input.nextInt(), input.nextInt()
                    );
                    listNews.add(temp);
                    break;
                case 2:
                    for(News i: listNews) {
                        System.out.println("=========");
                        i.Display();
                    }
                    break;
                case 3:
                    for(News i: listNews) {
                        i.Calculate();
                        System.out.println("========");
                        i.Display();
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
