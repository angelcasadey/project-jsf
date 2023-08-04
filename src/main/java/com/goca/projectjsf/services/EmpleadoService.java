/**
 * 
 */
package com.goca.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.goca.projectjsf.entity.Empleado;

/**
 * @author angel Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {

	/*
	 * Metodo que
	 */

	public List<Empleado> consultarEmpleados() {

		// Genera lista de empleados a consultar.
		List<Empleado> empleados = new ArrayList<Empleado>();

		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		// Segundo bloque de empleados
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoPraxis = new Empleado();

		empleadoIBM.setNombre("Angel");
		empleadoIBM.setPrimerApellido("Godinez");
		empleadoIBM.setSegundoApellido("Casadey");
		empleadoIBM.setPuesto("Progrmador Inter");
		empleadoIBM.setEstatus(true);

		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("Vivia");
		empleadoMicrosoft.setSegundoApellido("Morales");
		empleadoMicrosoft.setPuesto("Data Base Inter");
		empleadoMicrosoft.setEstatus(false);

		empleadoApple.setNombre("Uriel");
		empleadoApple.setPrimerApellido("Mestas");
		empleadoApple.setSegundoApellido("Estrada");
		empleadoApple.setPuesto("Senior Dev");
		empleadoApple.setEstatus(true);
		// -----------------------------------------
		empleadoNetflix.setNombre("Miriam");
		empleadoNetflix.setPrimerApellido("Gonzalez");
		empleadoNetflix.setSegundoApellido("Marinez");
		empleadoNetflix.setPuesto("Programador Arquitec");
		empleadoNetflix.setEstatus(true);

		empleadoOracle.setNombre("Mario");
		empleadoOracle.setPrimerApellido("Neta");
		empleadoOracle.setSegundoApellido("Juarez");
		empleadoOracle.setPuesto("Analista");
		empleadoOracle.setEstatus(false);

		empleadoPraxis.setNombre("Pedro");
		empleadoPraxis.setPrimerApellido("Paramo");
		empleadoPraxis.setSegundoApellido("Sosa");
		empleadoPraxis.setPuesto("Diseñador");
		empleadoPraxis.setEstatus(true);

		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoOracle);
		empleados.add(empleadoPraxis);

		return empleados;

	}

}
