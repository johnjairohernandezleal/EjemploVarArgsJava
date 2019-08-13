/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovarargs;

/**
 *
 * @author john hernandez
 */
public class EjemploVarArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        imprimirNumeros(15,20,3,61,75,18,10);
        System.out.println("imprimiendo con foreach");
        imprimirNumerosForEach(15,20,3);
        System.out.println("imprimiendo desde la funcion varios parametros");
        variosParametros("juan", true, 15,10,14);
    }
    /**
     * metodo imprimir numeros metodos variables
     * @param numeros 
     */
    public static void imprimirNumeros(int... numeros){
        /**
         * recorremos cada elemento
         */
        int elemento;
        for(int i=0; i< numeros.length; i++){
            /**
             * asignamos el valor del arreglo numeros a la variable elemento
             */
            elemento= numeros[i];
            System.out.println("Elemento = " + elemento);
        }
    }
    
    
    public static void imprimirNumerosForEach(int... numeros){
        for(int numero : numeros){
            System.out.println("el numero es : = " +  numero );
        }
    }
    
    
    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println("Nombre = " + nombre);
        System.out.println("Valido = " + valido);
        
        /**
         * usamos forEach
         */
        
        for(int numero: numeros){
            System.out.println("el numero es : = " + numero );
        }
    }
    
   
}
