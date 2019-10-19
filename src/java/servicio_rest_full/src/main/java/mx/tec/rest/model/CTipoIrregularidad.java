package mx.tec.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CTipoIrregularidad")
@XmlAccessorType(XmlAccessType.FIELD)
public class CTipoIrregularidad {
    @XmlElement
    private int idTipoIrregularidad;
    @XmlElement
    private String nombre;

    @Override
    public String toString() {
        return "CTipoIrregularidad{" +
                "idTipoIrregularidad=" + idTipoIrregularidad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getIdTipoIrregularidad() {
        return idTipoIrregularidad;
    }

    public void setIdTipoIrregularidad(int idTipoIrregularidad) {
        this.idTipoIrregularidad = idTipoIrregularidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
