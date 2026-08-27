/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.metodoconstructor;

/**
 *
 * @author angel
 */
public class animalesTerrestres {
    
    private String especieT = "";
    private int numeroPatas = 0;
    private boolean carnivoro = false;
    
    public animalesTerrestres (String especieT, int numeroPatas, boolean carnivoro){
        this.especieT = especieT;
        this.numeroPatas = numeroPatas;
        this.carnivoro = carnivoro;
    }
    
    public animalesTerrestres(String especieT,int numeroPatas){
        this.especieT = especieT;
        this.numeroPatas = numeroPatas;
    }
    
    public animalesTerrestres(String especieT,boolean carnivoro){
        this.especieT = especieT;
        this.carnivoro = carnivoro;
    }
}
