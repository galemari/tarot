package cl.tarot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Reserva implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "horarios_disponibles")
    private LocalDateTime horariosDisponibles;
    @ManyToOne
    private Tarotista tarotista;
    @ManyToOne
    private Cliente cliente;

    public Reserva() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void setHorariosDisponibles(LocalDateTime horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }

    public Tarotista getTarotista() {
        return tarotista;
    }

    public void setTarotista(Tarotista tarotista) {
        this.tarotista = tarotista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva)) return false;
        Reserva reserva = (Reserva) o;
        return id.equals(reserva.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", horariosDisponibles=" + horariosDisponibles +
                ", tarotista=" + tarotista +
                ", cliente=" + cliente +
                '}';
    }
}
