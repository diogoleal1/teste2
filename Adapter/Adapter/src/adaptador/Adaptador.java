/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import atual.CalculadoraFinanceira;
import interfac.JurosSimples;

/**
 *
 * @author diogo
 */
public class Adaptador implements JurosSimples{

    @Override
    public double montanteJurosSimples(double valor, double taxa, int meses) {
        double[] montante = new double[2]; 
        
        CalculadoraFinanceira cf = new CalculadoraFinanceira();
        
        montante = cf.calculaMontante(meses, valor, taxa);
        
        
        return montante[0];
    }
    
    
}
