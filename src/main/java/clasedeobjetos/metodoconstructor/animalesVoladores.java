/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.metodoconstructor;

/**
 *
 * @author angel
 */
public class animalesVoladores {
    
    private String especie = "";
    private int edad = 0;
    private boolean macho = false;
    
    public animalesVoladores (String especie, int edad, boolean macho){
        this.especie = especie;
        this.edad = edad;
        this.macho = macho;
    }
    
    public animalesVoladores(int edad,String especie){
        this.edad = edad;
        this.especie = especie;
    }
    
    public animalesVoladores(String especie, boolean macho){
        this.especie = especie;
        this.macho = macho;
    }
 
}
 