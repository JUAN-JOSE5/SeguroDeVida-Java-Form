/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segurodevida;

/**
 *
 * @author CBN
 */
public class Tabla {
    private String nombre,ValorInicial,ValorFinal;

    public Tabla(String nombre, String ValorInicial, String ValorFinal) {
        this.nombre = nombre;
        this.ValorInicial = ValorInicial;
        this.ValorFinal = ValorFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValorInicial() {
        return ValorInicial;
    }

    public String getValorFinal() {
        return ValorFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValorInicial(String ValorInicial) {
        this.ValorInicial = ValorInicial;
    }

    public void setValorFinal(String ValorFinal) {
        this.ValorFinal = ValorFinal;
    }
   


        
    
        
}
