/**
 * 
 */
package com.goca.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.goca.projectjsf.entity.Empleado;
import com.goca.projectjsf.services.EmpleadoService;

/**
 *@author angel
 *Clase controller que se encarga de procesar informacion de la pantalla principal.xhtml
 */


@ManagedBean // Esta notacion indica que esta clase o bean es un controlador de jsf
@ViewScoped // Nos permite mantener la informacion mientras esrtemos en la pantalla solicitada
public class PrincipalController {
	
	/*
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/*
	 * Servicio con los metodos que realizan la logica de negocio de empleados.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/*
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */	
	@PostConstruct // Invetigar sobre esta notacion
	public void init() {
		this.consultarEmpleados();
	}
	
	/*
	 * Metodo que consulta la lista de empleados.
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
		
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	

}
