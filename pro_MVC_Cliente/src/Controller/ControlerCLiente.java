/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.ClienteDAO;
import Model.Plantaeph;


public class ControlerCLiente {
    public String inserirCliente(String nomeClienne){
      Plantaeph cliente = new Plantaeph();
      cliente.setNome(nomeClienne);
      ClienteDAO obj_ClienteDAO = new ClienteDAO();
      int resultado = obj_ClienteDAO.inserir(cliente);
      String resultadoS;
      if(resultado==1)
       resultadoS = "Cliente Adicionado no Banco de Dados!";
      else
          resultadoS = "Cliente Não Adicionado!";
      return resultadoS;
          
       }
    }
    

