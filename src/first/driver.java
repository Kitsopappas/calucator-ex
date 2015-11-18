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
public class driver {

    public static void main(String[] args) {
        Calculator f = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your action.\nPress\n 1 for add \n 2 for abstract \n 3 for product and \n 4 for modulo ");
        int i = sc.nextInt();
        while (i!=0){
            switch (i){
            case 1:
                Calculator.calC(i, f,Calculator.type[i-1]);
                break;
            case 2:
                Calculator.calC(i, f,Calculator.type[i-1]);
                break;
            case 3:
                Calculator.calC(i, f,Calculator.type[i-1]);
                break;
            case 4:
                Calculator.calC(i, f,Calculator.type[i-1]);
                break;
            default:
                System.out.println("Give me a number between 1 and 4");
            }
            
        System.out.println("Choose your action.\nPress\n 1 for add \n 2 for abstract \n 3 for product and \n 4 for modulo ");
        i = sc.nextInt();
        }
        int W[] = {2,7,45,78,6,3,24,8,11,24,9};
        f.bubbleSort(W);
}
}
