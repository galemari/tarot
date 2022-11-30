package cl.tarot.vo;

import java.io.Serializable;

public class ReservaRequest implements Serializable {
    private int idCliente;
    private int idTarotista;
    private String fechaReserva;

    public ReservaRequest(){

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTarotista() {
        return idTarotista;
    }

    public void setIdTarotista(int idTarotista) {
        this.idTarotista = idTarotista;
    }


    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "ReservaRequest{" +
                "idCliente=" + idCliente +
                ", idTarotista=" + idTarotista +
                ", fechaHora='" + fechaReserva + '\'' +
                '}';
    }
}
