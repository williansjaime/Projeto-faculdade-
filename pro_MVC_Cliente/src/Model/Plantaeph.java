/*Willians 05/09/2018
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Plantaeph {
    private String Nome_da_Planta;
    public void setNome(String Var_Nome_da_Planta)
    {
        this.Nome_da_Planta= Var_Nome_da_Planta;
    }
    public String getNome_da_Planta()
    {
      return Nome_da_Planta;
    }
    private double Numero_PH;
    public void setNome(double Var_Numero_PH)
    {
        this.Numero_PH= Var_Numero_PH;
    }
    public double getNumero_PH()
    {
      return Numero_PH;
    }
    
}
