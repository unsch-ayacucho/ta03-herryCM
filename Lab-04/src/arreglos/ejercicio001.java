
package arreglos;

import java.util.Random;
import java.util.Scanner;

public class ejercicio001 {

    public static void main(String[] args) {
    
        int [] grupo = new int[101];
        
        for (int a=0;a<100;a++){ 
            Random numero = new Random();
            
            grupo[a]=numero.nextInt(20);
        }
        
        for(int b=0;b<=100;b++){
            System.out.print(grupo[b]+" ");
        }
        
        System.out.println("\n");
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("digite un numero: ");
        int c1=entrada1.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("ingrese el segundo numero: ");
        int c2=entrada2.nextInt();
        
        System.out.print("\n");
        
        for (int i=0;i<100;i++){
            if(grupo[i]==c1){
                grupo[i]=c2;
                System.out.print("\""+grupo[i]+"\" ");
            }
            else{
            System.out.print(grupo[i]+" "); }    
        }
        
    }
    
}
