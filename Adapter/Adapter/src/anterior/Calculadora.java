/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anterior;

import interfac.JurosSimples;

/**
 *
 * @author diogo
 */
public class Calculadora implements JurosSimples {
    
    private double montante;
    public double montanteJurosSimples(double valor, double taxa, int meses){
         montante = valor + (valor * (taxa/100) * meses);
        return montante;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }
    
    
}
