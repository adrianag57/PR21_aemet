package pr21_aemet;

import java.util.Comparator;

public class ComparadorDias implements Comparator<EstacionMeteorologica> {
	
	private int comoOrdenar;
	public static final int TEMPERATURA = 1;
	public static final int HUMEDAD = 2;

	public int ordenarTemperatura(EstacionMeteorologica t1, EstacionMeteorologica t2) {
		
		int devolver;

		devolver = t1.getTemperatura() - t2.getTemperatura();

		return devolver;
	}

	public int ordenarHumedad(EstacionMeteorologica t1, EstacionMeteorologica t2) {
		
		int devolver;

		devolver = t1.getHumedad() - t2.getHumedad();

		return devolver;
	}
	
	public ComparadorDias() {

		comoOrdenar = TEMPERATURA;
	}

	@Override
	public int compare(EstacionMeteorologica t1, EstacionMeteorologica t2) {

		int devolver;
		
		if (comoOrdenar == TEMPERATURA) {
			
			devolver = t1.getTemperatura() - t2.getTemperatura();
		} else devolver = t1.getHumedad() - t2.getHumedad();
		
		return devolver;
	}

}
