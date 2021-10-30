package Bai_2;

import javax.swing.*;
import java.awt.im.spi.InputMethodDescriptor;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();

        System.out.println("Enter array 1: ");
        arr1.InputData();

        System.out.println("Enter array 2: ");
        arr2.InputData();

        float avg_1;
        if(arr1.getN() == 0)
            avg_1 = 0;
        else
            avg_1 = (float)arr1.Sum() / arr1.getN();
        float avg_2;
        if(arr2.getN() == 0)
            avg_2 = 0;
        else
            avg_2 = (float)arr2.Sum() / arr2.getN();

        if(avg_1 > avg_2){
            System.out.println("Array 1!");
        }
        else if(avg_1 < avg_2)
            System.out.println("Array 2!");
        else
            System.out.println("Bye!");
    }
}
