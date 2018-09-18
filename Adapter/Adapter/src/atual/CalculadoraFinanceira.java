/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atual;

/**
 *
 * @author diogo
 */
public class CalculadoraFinanceira{
   
    
    public double[] calculaMontante(int periodo, double valor, double taxa){
        //[0] motante simples - [1] montante compostos
        
        double[] montante = new double[2];  
        
        //Calculo montante simples
        montante[0] = valor + (valor * (taxa/100) * periodo);
                
        //Calculo montante compostos
        montante[1] = valor + (valor * (taxa/100) * periodo);
        
        return montante;
    }
    
}
