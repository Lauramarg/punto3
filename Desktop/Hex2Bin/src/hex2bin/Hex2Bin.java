/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex2bin;

import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class Hex2Bin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadenaHex;
        System.out.println("ingrese un numero del 0 a la f");
        Scanner r=new Scanner(System.in);
        cadenaHex=r.nextLine();
        byte cadenaBin[]=new byte[16];
        int cadI=Integer.parseInt(cadenaHex,16);
        
        cadenaHex=Integer.toBinaryString(cadI);
        
        System.out.println("binario es "+cadenaHex);
    }
    
}
