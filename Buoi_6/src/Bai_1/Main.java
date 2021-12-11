package Bai_1;

public class Main {
    public static void main(String[] args) {
        Person person_1 = new Employee("Trung", "HN", 300);
        Person person_2 = new Customer("Linh", "HN", 10400);
        person_1.display();
        person_2.display();
    }
}