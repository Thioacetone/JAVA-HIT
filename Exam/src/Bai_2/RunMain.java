package Exam.src.Bai_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList <Book> A = new ArrayList<Book>();
        int choose = 0;
        String spam;
        while(choose != 7){
            System.out.println("=======Menu=======");
            System.out.println("1. Add book\n" + 
                                "2. Edit book by id\n" + 
                                "3. Delete book by id\n" + 
                                "4. Sort books by name (Ascending)\n" + 
                                "5. Sort books by price (descending)\n" + 
                                "6. Show all books \n"+
                                "7. Exit");
            System.out.print("Enter your choose: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    A.add(Add());
                    break;
                case 2:
                    System.out.println("Enter id you want edit: ");
                    spam = input.nextLine();
                    for(int i = 0; i < A.size(); ++ i){
                        if(A.get(i).getId().compareTo(spam) == 0){
                            System.out.println("1. Id \n" + 
                                                "2. name \n" + 
                                                "3. publisher \n" + 
                                                "4. price \n" + 
                                                "5. numberOfPages\n" + 
                                                "6. author");
                            System.out.println("Enter your choose: ");
                            int x = input.nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Enter id: ");
                                    A.get(i).setId(input.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Enter name: ");
                                    A.get(i).setName(input.nextLine());
                                    break;
                                case 3:
                                    System.out.println("Enter publisher: ");
                                    A.get(i).setPublisher(input.nextLine());
                                    break;
                                case 4:
                                    System.out.println("Enter price: ");
                                    A.get(i).setPrice(input.nextFloat());
                                    break;
                                case 5:
                                    System.out.println("Enter number of page: ");
                                    A.get(i).setNumberOfPages(input.nextInt());
                                    break;
                                case 6:
                                    System.out.println("Enter author: ");
                                    A.get(i).setAuthor(input.nextLine());
                                    break;
                            }
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter id of book you want edit: ");
                    spam = input.nextLine();
                    for(int i = 0; i < A.size(); ++ i){
                        if(A.get(i).getId().compareTo(spam) == 0){
                            A.remove(i);
                        }
                    }
                    break;
                case 4:
                    for(int i = 0; i < A.size(); ++ i){
                        for(int j = i + 1; j < A.size(); ++ j){
                            if(A.get(i).getName().compareTo(A.get(j).getName()) > 0){
                                Collections.swap(A, i, j);
                            }
                        }
                    }
                    break;
                case 5:
                    for(int i = 0; i < A.size(); i++){
                        for(int j = i + 1; j < A.size(); j++){
                            if(A.get(i).getPrice() < A.get(j).getPrice()){
                                Collections.swap(A, i, j);
                            }
                        }
                    }
                    break;
                case 6:
                System.out.printf("%-15s %-20s %-20s %-15s %-20s %-20s\n", "ID", "Name", 
                "Publisher", "Price", "Number Of Pages", "Author");
                    A.forEach(i -> {
                        i.Xuat();
                    });
                    break;
                case 7:
                    break;
            }
        }

    }
    static Book Add(){
        Book b = new Book();
        System.out.println("Enter the book you want add: ");
        b.Nhap();
        return b;
    }
}
