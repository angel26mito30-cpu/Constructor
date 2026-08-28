/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clasedeobjetos.metodoconstructor;

/**
 *
 * @author angel
 */
public class MetodoConstructor {

    public static void main(String[] args) {
        animalesVoladores volador1 = new animalesVoladores("agila", true);
        animalesVoladores volador2 = new animalesVoladores("colibri", false);
        animalesVoladores volador3 = new animalesVoladores(23, "paloma");
        animalesVoladores volador4 = new animalesVoladores(65, "Loro");
        animalesVoladores volador5 = new animalesVoladores("buho", 50, true);
        animalesVoladores volador6 = new animalesVoladores("murcielago", 20, false);
        animalesVoladores volador7 = new animalesVoladores("abeja", true);
        animalesVoladores volador8 = new animalesVoladores("mariposa", 10, false);
        
        animalesTerrestres terrestre1 = new animalesTerrestres("leon", true);
        animalesTerrestres terrestre2 = new animalesTerrestres("jirafa", false);
        animalesTerrestres terrestre3 = new animalesTerrestres("avestruz", true);
        animalesTerrestres terrestre4 = new animalesTerrestres("araña", 57, false);
        animalesTerrestres terrestre5 = new animalesTerrestres("hormiga", 5, false);
        
        
                
                
                
    }
}
