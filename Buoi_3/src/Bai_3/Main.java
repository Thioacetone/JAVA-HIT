package Bai_3;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Guns Diep = new Guns("M416", 40);
        Guns Doan = new Guns("M24", 40);

        int check_1 = 0, check_2 = 0;
        int i = 1;

        do{
            int x = (int) (Math.random()*10 + 1);
            int y = (int)(Math.random()*10 + 1);
            Diep.Shoot(x);
            Doan.Shoot(y);

            if(Diep.getAmmoNumber() < x && Doan.getAmmoNumber() < y){
                Diep.Load((int)(Math.random()*10 + 1));
                Doan.Load((int)(Math.random()*10 + 1));
            }
            else if(Diep.getAmmoNumber() < x)
                check_1 = 1;
            else if(Doan.getAmmoNumber() < y)
                check_2 = 1;
            System.out.println("Luot " + i + ":");
            System.out.println("Diep bắn " + x + " còn " + Diep.getAmmoNumber());
            System.out.println("Doan bắn " + y + " còn " + Doan.getAmmoNumber());
            ++i;
        }while(check_1 == 0 && check_2 == 0);

        if(check_1 == 1)
            System.out.println("Doan thang!");
        else
            System.out.println("Diep thang!");
    }
}
