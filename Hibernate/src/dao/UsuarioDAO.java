package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Usuario;

public class UsuarioDAO {
	private SessionFactory sessionFactory;

	public UsuarioDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public void add(Usuario usuario) {
		Session sesion = sessionFactory.openSession();
		sesion.beginTransaction();
		sesion.save(usuario);
		sesion.getTransaction().commit();
		sesion.close();
		
		
	}
	

}
