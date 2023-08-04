/**
 * 
 */
package com.goca.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.goca.projectjsf.dto.UsuarioDTO;

/**
 * @author angel
 * Clase que se encarga de mantener informacion del usuario que entra al aplicativo en sesion.
 */
@ManagedBean
@SessionScoped
public class SessionController {
	
	/*
	 * Usuario que se mantendra en sesion.
	 */
	private UsuarioDTO usuarioDTO;
	
	/*
	 *Inicializa la sesion del usuario. 
	 */
		@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion...");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
