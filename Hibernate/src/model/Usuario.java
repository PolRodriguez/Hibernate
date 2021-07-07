package model;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@Column(name = "idusuario")
	private String idUsuario;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Email")
	private String email;

	public Usuario() {
		super();
	}

	public Usuario(String idUsuario, String password, String email) {
		super();
		this.idUsuario = idUsuario;
		this.password = password;
		this.email = email;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", password=" + password + ", email=" + email + "]";
	}
	
	
	

}
