/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.Scanner;


/**
 *
 * @author Ana Karen
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int tope = 0, opt;
        char k = 'a';

        char pila[] = new char[27];
        System.out.println("elija una opción:");
        do{
           System.out.println("1 - Llenar\n"
           + "2 - Mostrar\n"
           + "3 - Eliminar\n"
           + "4 - Agregar\n"
           + "5 - Salir");
         switch (opt = sc.nextInt()){
             case 1:
                 
             if (tope == 0) {
                       
                        while (k <= 'z') {
                           
                            pila[tope] = k;
                            tope++;
                            k++;
                        }
                        System.out.println("pila llena");
                    } else {
                        k = 'a';
                        while (tope < 26) {

                            pila[tope] = k;
                            tope++;
                            k++;
                        }
                        System.out.println("Pila rellenada");
                    }
                    break;
                 
             case 2:
                 
                 if(tope>0){
                     System.out.println("Los elementos son:");
                     for (int i=0; i<27; i++){
                         System.out.println(" "+ pila[i]);
                         
                     }
                 }else{
                     System.out.println("Pila vacia");}
                 break;
             case 3:
                 if(tope !=0){
                     System.out.println("eliminando el ultimo valor");
                     tope--;
                    }else{
                     System.out.println("no hay elementos a eliminar");
                     break;
                 }
             case 4:
                  if (tope < 26) {
                        
                        System.out.println("Ingrese dato: ");
                        
                        k = sc.next().charAt(0);
                        pila[tope] = k;
                        k++;
                        tope++;
                    } else {
                        System.out.println("Pila llena");
                    }
                    break;
         
                 
        }
    } while (opt !=5);
        }
}
