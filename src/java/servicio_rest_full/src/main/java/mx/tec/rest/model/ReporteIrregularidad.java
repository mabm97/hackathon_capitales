package mx.tec.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;

@XmlRootElement(name = "ReporteIrregularidad")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReporteIrregularidad {
    @XmlElement
    private int idReporteIrregularidad;
    @XmlElement
    private int idUsuario;
    @XmlElement
    private int idTipoIrregularidad;
    @XmlElement
    private int idLicencia;
    @XmlElement
    private Date fecha;

    @Override
    public String toString() {
        return "ReporteIrregularidad{" +
                "idReporteIrregularidad=" + idReporteIrregularidad +
                ", idUsuario=" + idUsuario +
                ", idTipoIrregularidad=" + idTipoIrregularidad +
                ", idLicencia=" + idLicencia +
                ", fecha=" + fecha +
                '}';
    }

    public int getIdReporteIrregularidad() {
        return idReporteIrregularidad;
    }

    public void setIdReporteIrregularidad(int idReporteIrregularidad) {
        this.idReporteIrregularidad = idReporteIrregularidad;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoIrregularidad() {
        return idTipoIrregularidad;
    }

    public void setIdTipoIrregularidad(int idTipoIrregularidad) {
        this.idTipoIrregularidad = idTipoIrregularidad;
    }

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
