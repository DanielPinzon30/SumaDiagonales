
package sumadiagonales;

import java.util.Scanner;


public class SumaDiagonales {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);       
       int matriz[][],fil,y=0,x=0;       
        System.out.println("Digite el numero de filas y columnas (nxn): ");
        fil=entrada.nextInt();             
        matriz=new int[fil][fil];      
        System.out.println("Ingrese los valores de la matriz");
        for(int i=0;i<fil;i++){
            for(int j=0;j<fil;j++){
                System.out.print("valor["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();  
                    if(i==j){
                    y+=matriz[i][j];
                    }    
                    if(i+j==fil-1){
                        x+=matriz[i][j];
                    }
                }
            }        
        System.out.println("La matriz ingresada es: ");
        for(int i=0;i<fil;i++){
            for(int j=0;j<fil;j++){            
                System.out.print(matriz[i][j]);
                }
                System.out.println("");
            }  
        System.out.println("la suma de la digonal principal es: "+y);
        System.out.println("la suma de la digonal secundaria es: "+x);
    }
    
}
