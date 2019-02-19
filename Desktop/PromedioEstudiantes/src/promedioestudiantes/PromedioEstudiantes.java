/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioestudiantes;
import java.util.Scanner;
/**
 *
 * @author duvan
 */
public class PromedioEstudiantes {



    
 
  
    
    public static void main(String[] args) {

        System.out.println("Digite el numero de estudiates");
        Scanner r=new Scanner(System.in);
        int n= r.nextInt();
        int vec[]=new int[n];
        int x=0;
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("dijite la nota del estudiante "+(i+1));
           
   
            
            while(x>100 || x<0){
                System.out.println("error dijitastes una nota erronea dijite la nota del estudiante "+n);
              
                x=r.nextInt();
            }
            vec[i]=r.nextInt();
            
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=vec[i];
        }
        float pro=(sum/n);
        System.out.println("el Promedio es de "+pro);
        
    }
}
