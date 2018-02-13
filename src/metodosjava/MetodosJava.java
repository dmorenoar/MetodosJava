/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosjava;

import java.util.ArrayList;

/**
 *
 * @author dmorenoar
 */
public class MetodosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<String> arrayPollos = new ArrayList<>();
       
        arrayPollos.add("Pollo1");
        arrayPollos.add("PollitoPio");
        
        ArrayList<String> arrayPatos = new ArrayList<>();
        
        recorreArray(arrayPollos);
        
        arrayPatos = addPollo(arrayPollos);
        
        
        
        recorreArray(arrayPatos);
        
        //Llamada al método que no recibe ni devuelve
        getUsuarioName();
        
        //Llamada al método que devuelve pero no recibe
        String nombre = getUsuarioNombreConRetorno();
        System.out.println("El nombre es:" + nombre);
        System.out.println("El nombre es:" + getUsuarioNombreConRetorno());
        
        //Llamada al método que recibe y no devuelve
        setNombreUsuario("Alfredo");
        
        //Llamada al método que devuelve y recibe
        String nom = modNombreUsuario("Fran");
        System.out.println("El nombre modificado es:" + modNombreUsuario("Fran"));
    
        int edad = 15;
        if(validarEdad(edad)){
            System.out.println("Entra pa' dentro");
        }
    }
    
    /*No retorna ni recibe nada
    1 param - Tipo de metodo -> public, private, protected
    2 param - Retorno -> void, String, int, char...
    3 param - Nombre del método
    */
    public static void getUsuarioName(){
        String nombre = "Julio";
        System.out.println("El nombre es: " + nombre);            
    }
    /*No recibe nada pero devuelve
    */
    public static String getUsuarioNombreConRetorno(){
        String nombre = "Marta";
        return nombre;
    }
    
    /*No devuelve pero si recibe*/
    public static void setNombreUsuario(String nombre){
        String nombreAux = nombre;
        System.out.println("El nombre es:" + nombre); 
    }
    
    /*Devuelve y recibe*/
    public static String modNombreUsuario(String nombre){
        String aux = "!!!";
        nombre += aux;
        
        nombre += "!!!";
        
        return nombre + "!!!";
    }
    public static void recorreArray(ArrayList<String> array){
        for (String val : array) {
            System.out.println(val.toString());
        }
    }
    public static ArrayList<String> addPollo(ArrayList<String> array){
        array.add("PollitoEnano");
        return array;
    }
    public static boolean validarEdad(int edad){
        boolean valor = false;
        
        if(edad > 21){
            valor = true;
        }else{
            valor = false;
        }
        return valor;
        //return edad > 18;
    }
}
