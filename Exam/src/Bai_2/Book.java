package Bai_2;

import java.util.Scanner;

public class Book extends Documents{
    private int numberOfPages;
    private String author;

    Scanner input = new Scanner(System.in);
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Enter the values of number of page: ");
        numberOfPages = input.nextInt();
        input.nextLine();
        System.out.print("Enter the author: ");
        author = input.nextLine();
    }

    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf(" %-20s %-20s\n", numberOfPages, author);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

}
