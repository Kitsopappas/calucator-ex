/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import java.util.Vector;

/**
 *
 * @author Χριστόδουλος
 */

public class main {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(1);
        v.addElement(2);
        v.addElement(4);
        v.addElement(5);
        v.addElement(1);
        v.addElement(3);
        System.out.println("length " + v.size());
        v.addElement(5);
        v.addElement(1);
        v.addElement(3);
        System.out.println("length " + v.size());
        for (int i=0;i<=v.size();i++){
            System.out.println("BLA");
        
        
        }

    }
}
