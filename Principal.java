import java.time.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        fechaHoraActual();
    }

    public static void fechaHoraActual() {
		String reloj = "";
		String dia = ((LocalDate.now().getDayOfMonth() < 10) ? "0" : "") + LocalDate.now().getDayOfMonth();
		String mes = ((LocalDate.now().getMonthValue() < 10) ? "0" : "") + LocalDate.now().getMonthValue();
		String anio = "" + LocalDate.now().getYear();
		String horas = ((LocalTime.now().getHour() < 10) ? "0" : "") + LocalTime.now().getHour();
		String minutos = ((LocalTime.now().getMinute() < 10) ? "0" : "") + LocalTime.now().getMinute();
		String segundos = ((LocalTime.now().getSecond() < 10) ? "0" : "") + LocalTime.now().getSecond();
		reloj = dia + "/" + mes + "/" + anio + " " + horas + ":" + minutos + ":" + segundos;
        System.out.println(reloj);
	}
}