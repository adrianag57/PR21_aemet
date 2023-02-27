package pr21_aemet;

public class EstacionMeteorologica {

	private int dias;
	private int temperatura;
	private int humedad;

	public EstacionMeteorologica(int dias) {

		this.dias = dias;
		this.temperatura = (int) (Math.random() * 30 - 10);
		this.humedad = (int) (Math.random() * 99 + 1);
	}
	
	public void Datos(int temperatura, int humedad) {
		
		this.temperatura = (int) (Math.random() * -10 + 20);
		this.humedad = (int) (Math.random() * 99 + 1);
	}

	public int getDias() {
		return dias;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public int getHumedad() {
		return humedad;
	}

	@Override
	public String toString() {
		return "Este mes tiene " + dias + " dias " + " Temperaturas y humedades:" + "[" + temperatura + " / " + humedad
				+ "]";
	}

}
