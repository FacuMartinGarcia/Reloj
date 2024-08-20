package reloj;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {

    private LocalDate dia;
    private LocalTime hora;
    private String modelo;
    private long numSerie;

    public Reloj(LocalDate dia, LocalTime hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public Reloj() {
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }


    public void incrementarDia(int dias) {
        dia=dia.plusDays(dias);
   
    }

    public void incrementarHora(int horas) {
        hora=hora.plusHours(horas);
    }

    public void limpiarPantalla() {
        System.out.println("Pantalla Limpia");
    }
}
