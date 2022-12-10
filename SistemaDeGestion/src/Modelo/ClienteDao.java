/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Lana
 */
public class ClienteDao {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
public boolean RegistrarCliente(Cliente cl){
String  sql= "INSERT INTO clientes (dni,nombre,telefono,direccion,razon) VALUES (?,?,?,?,?)";
try { 
    con=cn.getConnection();
    ps=con.prepareStatement(sql);
    ps.setInt(1, cl.getDni());
    ps.setString(2, cl.getNombre());
    ps.setInt(3, cl.getTelefono());
    ps.setString(4, cl.getDireccion());
    ps.setString(5, cl.getRazon());
    
}
} catch(Exception e){

}
}
