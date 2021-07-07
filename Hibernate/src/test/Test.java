package test;

import org.hibernate.SessionFactory;

import dao.UsuarioDAO;
import model.Usuario;
import util.Conexion;

public class Test {
	
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		SessionFactory sessionFactory = conexion.conectar();
		System.out.println("conectado");
		UsuarioDAO usuarioDao = new UsuarioDAO(sessionFactory);
		usuarioDao.add(new Usuario("ana","pass1","ana@gmail,com"));
	}
	

}
