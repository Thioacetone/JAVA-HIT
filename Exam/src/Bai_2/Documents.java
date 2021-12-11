package Exam.src.Bai_2;

import java.util.Scanner;

public class Documents {
    private String id, name, publisher;
    private float price;

    Scanner input = new Scanner(System.in);
    public void Nhap(){
        System.out.print("Enter the id: ");
        id = input.nextLine();
        System.out.print("Enter the name: ");
        name = input.nextLine();
        System.out.print("Enter the publisher: ");
        publisher = input.nextLine();
        System.out.print("Enter the prices: ");
        price = input.nextFloat();
    }

    public void Xuat(){
        System.out.printf("%-15s %-20s %-20s %-15f", id, name, publisher, price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

}
