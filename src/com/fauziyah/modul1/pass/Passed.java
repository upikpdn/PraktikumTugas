package com.fauziyah.modul1.pass;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        testpass pass;
        pass = new testpass(50, 100); // deklarasi object
        nomer1 = 10;
        nomer2 = 20;

        //pass by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomer1 = " + nomer1);
        System.out.println("Nomer2 = " + nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai sesudah passed by value : ");
        System.out.println("Nomer1 = " + nomer1);
        System.out.println("Nomer2 = " + nomer2);

        //passed by reference
        System.out.println();
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("Nomer1 = " + pass.nomer1);
        System.out.println("Nomer2 = " + pass.nomer2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference : ");
        System.out.println("Nomer1 = " + pass.nomer1);
        System.out.println("Nomer2 = " + pass.nomer2);
    }
}
