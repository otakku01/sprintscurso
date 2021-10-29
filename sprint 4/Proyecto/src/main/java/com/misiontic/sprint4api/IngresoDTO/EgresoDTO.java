package com.misiontic.sprint4api.IngresoDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@Builder
public class EgresoDTO {

    private Long id;
	private String tipoEgreso;
	private Float valorEgreso;
}
