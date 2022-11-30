package cl.tarot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tarotista {

    @Id
    private Integer id;
    private String nombre;
    @Column(name = "tipo_lectura")
    private String tipoLectura;
    private String modalidad;
    private String idioma;
    @Column(name = "tarifa_hora")
    private int tarifaHora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoLectura() {
        return tipoLectura;
    }

    public void setTipoLectura(String tipoLectura) {
        this.tipoLectura = tipoLectura;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(int tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarotista)) return false;
        Tarotista tarotista = (Tarotista) o;
        return Objects.equals(id, tarotista.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Tarotista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoLectura='" + tipoLectura + '\'' +
                ", modalidad='" + modalidad + '\'' +
                ", idioma='" + idioma + '\'' +
                ", tarifaHora=" + tarifaHora +
                '}';
    }
}
