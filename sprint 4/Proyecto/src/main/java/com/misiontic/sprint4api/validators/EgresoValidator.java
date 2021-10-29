package com.misiontic.sprint4api.validators;

import com.misiontic.sprint4api.entity.Egreso;

public class EgresoValidator {

	public static void save (Egreso egreso) {
		if (egreso.getTipoEgreso()==null  || egreso.getTipoEgreso().trim().isEmpty()) {
			throw new RuntimeException("El tipo de ingreso es obligatorio");
		}
		if (egreso.getTipoEgreso().length() > 100) {
			throw new RuntimeException("El tipo de ingreso no puede ser mayor a 100 caracteres");
		}
	}
}
