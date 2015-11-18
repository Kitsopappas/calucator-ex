/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.util.Scanner;

/**
 *
 * @author Panos
 */
public class Calculator {

    public static final String type[] = {"add", "abstract", "product", "module"};

    public Calculator() {
    }

    public void add(int x, int y) {
        System.out.println("The sum is  " + (x + y));
    }

    public void abstrakt(int x, int y) {

        System.out.println("The result is  " + (x - y));
    }

    public void product(int x, int y) {

        System.out.println("The product is  " + (x * y));
    }

    public void modulo(int x, int y) {
        System.out.println("The modulo is  " + (x % y));
    }

    public void bubbleSort(int SRT[]) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < SRT.length - 1; j++) {
                if (SRT[j] < SRT[j + 1]) // change to > for ascending sort
                {
                    temp = SRT[j];                //swap elements
                    SRT[j] = SRT[j + 1];
                    SRT[j + 1] = temp;
                    flag = true;              //shows a swap occurred  
                }
            }
        }
        printArray(SRT);
    }
    
    public void printArray(int SRT[]){
        for (int i=0;i<SRT.length;i++){
            System.out.println(SRT[i]);
        
        }
            
    
    }

    public static void calC(int i, Calculator f, String A) {
        System.out.println("Give me to integers to " + A + " them");
        Scanner one = new Scanner(System.in);
        int x = one.nextInt();
        int y = one.nextInt();
        if (i == 1) {
            f.add(x, y);
        } else if (i == 2) {

            f.abstrakt(x, y);
        } else if (i == 3) {
            f.product(x, y);
        } else if (i == 4) {
            f.modulo(x, y);
        } else {
            System.out.println("Give a number between 1 and 4");
        }
    }

}
