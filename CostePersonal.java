public class CostePersonal {
 
	static float CosteDelPersonal(Trabajador trabajadores[]) {
		float costeFinal = 0;
		Trabajador trabajador;
		for (Trabajador trabajador: trabajadores){
			switch(trabajador.getTipo()){
				case DIRECTOR: costeFinal+= trabajador.getNomina();
						break;
				case SUBDIRECTOR: costeFinal+= trabajador.getNomina();
						break;
				default: costeFinal+= trabajador.getNomina()+(trabajador.getHorasExtras()*20);
		}
		return costeFinal;
	}
}
