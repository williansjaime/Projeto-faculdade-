/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private String serverName = "localhost=3306";    //caminho do servidor do BD
    private String mydatabase = "BancodoPH";        //nome do seu banco de dados
    private String URL = "jdbc:mysql://" + serverName + "/" + mydatabase;
    private String USUARIO = "root";
    private String SENHA = "root";
    protected Connection conectaBD = null;
     //Construtor
    public Conexao() { //throws Exception
        try{
            try { 
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            conectaBD = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        catch (SQLException sqlException){
                sqlException.printStackTrace();
                System.exit(1);
        }   
    }

    public void close(){
        try{
            conectaBD.close();
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
            
}
