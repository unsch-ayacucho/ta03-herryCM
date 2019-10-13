
package arreglos;

import java.util.Random;
import java.util.Scanner;

public class ejercicio003 {
   
    public static void main(String[] args) {
        
        int [] grupo = new int[100];
        
        for (int a=0;a<100;a++){ 
            Random numero = new Random();
            grupo[a]=numero.nextInt(500);
        }
        
        for(int b=0;b<100;b++){
            System.out.print(grupo[b]+" ");
        }
        
        int menor,mayor;
        menor=grupo[0];
        mayor=grupo[0];
        
        for(int i=0;i<100;i++){
            if(grupo[i]>mayor){
                mayor=grupo[i];
            }
            if(grupo[i]<menor){
                menor=grupo[i];
            }
        }
        
        System.out.println("\n");
        
        Scanner valor=new Scanner(System.in);
        System.out.print("¿Que quiere destacar? (1 - minimo,2 - maximo): ");
        int numero=valor.nextInt();
        
        if(numero==1){
            for(int i=0;i<100;i++){
                if(grupo[i]==menor){
                System.out.print("\""+grupo[i]+"\" "); }
                else{
                    System.out.print(grupo[i]+" ");
                }
            }   
        }
        
        if(numero==2){
            for(int i=0;i<100;i++){
                if(grupo[i]==mayor){
                    System.out.print("\""+grupo[i]+"\" "); }
                else{
                    System.out.print(grupo[i]+" ");
                }
            }
        }
         
    }
    
}
