/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegadorjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author matheus.031097
 */
public class ConexaoBanco {

    public static Connection getConexao() {
        
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "root");
            System.out.println("Conectado com Sucesso");
        }catch (SQLException e){
            System.out.println("Erro ao Conectar");
        }
        return conn;
    }
    
    
       
}
