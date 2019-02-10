/*
 * 
 */
package DAO;

import Model.Plantaeph;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class ClienteDAO extends Conexao{
    private PreparedStatement psInsertCliente = null;
    public int inserir(Plantaeph cliente)
    {
     int resultado= 0;
     try{
         psInsertCliente = conectaBD.prepareStatement("INSERT INTO cliente (Nome) Values (?)");
         psInsertCliente.setString(1, cliente.getNome_da_Planta());
         resultado = psInsertCliente .executeUpdate();
     }
     catch (SQLException sqlException){
          sqlException.printStackTrace();
          this.close();
     }
     return resultado;
     
    }
    
}
