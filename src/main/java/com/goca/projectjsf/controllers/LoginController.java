/**
 * 
 */
package com.goca.projectjsf.controllers;


import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.goca.projectjsf.dto.UsuarioDTO;

/**
 * @author Angel
 * Clase que permite controlar el funcionamiento con la pantalla de login.xhtml.
 */
@ManagedBean
public class LoginController {
	/**
	 * Usuario que ingresan en el login.
	 */
	private String usuario;
	/**
	 * Contraseña ingresada en el login.
	 */
	private String password;
	
	/*
	 * Bean que mantiene la informacion en sesion.
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessioncontroller;
	
	
	/**
	 * Metodo que permite ingresar a la pantalla principal del proyecto.
	 */
	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		
		if (usuario.equals("angel") && password.equals("12345")) {

			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				this.sessioncontroller.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
				e.printStackTrace();
			}
		
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the sessioncontroller
	 */
	public SessionController getSessioncontroller() {
		return sessioncontroller;
	}

	/**
	 * @param sessioncontroller the sessioncontroller to set
	 */
	public void setSessioncontroller(SessionController sessioncontroller) {
		this.sessioncontroller = sessioncontroller;
	}
}
