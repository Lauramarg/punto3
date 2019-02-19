package perfectnumberlist;

import java.util.Scanner;



public class PerfectNumberLIst {

private static boolean isPerfect(int n){
        int suma=0;
        for(int i=1 ; i<n ; i++)
           if(n%i == 0)
               suma +=  i;
           
       
        return suma == n;
        
    }

private static boolean isDeficient(int num){
        int suma=0;
        for(int i=1 ; i<num ; i++)
           if(num%i == 0)
               suma +=  i;
           
       
        return suma > num;
}

    public static void main(String[] args) {
       int icont,n;
       int numP = 0,contador = 0;
       boolean x,y;
       
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese el numero: ");
        n = sc.nextInt();
        System.out.println("Estos números son Perfectos: ");
        for(icont=1 ; icont<=n ; icont++){
            x = PerfectNumberLIst.isPerfect(icont);
            if(x == true){
                System.out.print(" "+icont);
                numP++;
            }
        }

        System.out.println("Se ah encontrado "+numP+ " numeros perfectos  ");

        for(icont=1 ; icont<=n ; icont++){
            x = PerfectNumberLIst.isPerfect(icont);
            y = PerfectNumberLIst.isDeficient(icont);
            if(!x && !y ){
                System.out.print(" "+icont);
                contador++;
            }
            
        }
        System.out.println("Se  han encontrado "+contador);              
    }
    
}