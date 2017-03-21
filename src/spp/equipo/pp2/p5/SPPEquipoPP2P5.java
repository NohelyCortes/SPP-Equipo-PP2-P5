/*Ángel Ávalos Ortega A01410325
Alberto Isaac Gómez Jiménez A01410769
Jorge Daniel Bombardier
Miguel Ángel Méndez 
Nohely Cortés del Ángel A01410768 the template in the editor.
 */
package spp.equipo.pp2.p5;
import java.util.*;
/**
 *
 * @author Nohely C
 */
public class SPPEquipoPP2P5 {

   public static void main(String[] args) {
            int tamaño=solicitarEntero("el tamaño del arreglo: ");
        // Definir los valores dentro de la matriz
        int [][] a=crearMatriz("A",tamaño);
        sumarFila(a);
     
    }
   //Método para pedir valores del arreglo
     public static int solicitarEntero(String mensaje){
        Scanner kb = new Scanner (System.in);
        int Entero = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca el valor de " + mensaje);
        try{
        Entero = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Su valor es incorrecto " );
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return Entero;
     }
//Método para crear Matriz
public static int [][]crearMatriz(String mensaje, int tamaño){
     System.out.println("\nIntroduzca el contenido de la matriz "+mensaje);
        int[][] Matriz=new int[tamaño][tamaño];
        System.out.println("Tamaño de la matriz: "+Matriz.length);
        for (int i=0; i<Matriz.length; i++){
            for (int j=0; j<Matriz[i].length; j++){
            Matriz[i][j]=solicitarEntero("el valor ("+i+","+j+"): ");
            }
        }
        return Matriz;
        }

//Método para sumar FIla
public static void sumarFila(int [][] a){
    int sumaFila;
         int[][]r=new int[a.length][a.length];
    for (int i = 0; i < a.length; i++) {  
        sumaFila=0;  
        for (int j = 0; j < a[i].length; j++) {  
          sumaFila=sumaFila+a[i][j];  
        }  
        System.out.println("La suma de la fila es "+(i+1)+" es: "+sumaFila);  
      }  
      System.out.println(""); 
    
    }
    
}
