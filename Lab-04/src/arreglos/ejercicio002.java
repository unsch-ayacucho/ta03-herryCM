
package arreglos;

import java.util.Scanner;

public class ejercicio002 {
  
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int conjunto [] = new int[10]; 
        
        for(int i=0;i<10;i++){
            System.out.print("digite un numero: ");   
            conjunto[i]=entrada.nextInt();
        }
       
        for(int i=0;i<10;i++){  
            int b=conjunto[i];
            int c=0;
                
            for(int f=1;f<=b;f++){
                if (b%f==0){
                    c=c+1; }
            }
            
                if (c==2){
                    {System.out.println(b); }       
                }                  
        }
        
        for(int i=0;i<10;i++){
            int b=conjunto[i];
            int c=0;
        
            for(int f=1;f<=b;f++){
                if (b%f==0){
                    c=c+1; }       
            }
                if (c!=2){
                    {System.out.println(b); }   
                }
        }
    
    }
}    
          
    

       
               
          

        
        

    

