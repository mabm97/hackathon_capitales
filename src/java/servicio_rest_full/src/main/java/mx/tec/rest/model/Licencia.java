package mx.tec.rest.model;

import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;

@XmlRootElement(name = "Licencia")
@XmlAccessorType(XmlAccessType.FIELD)
public class Licencia {
    @XmlElement
    private int idLicencia;
    @XmlElement
    private String razonSocial;
    @XmlElement
    private String colonia;
    @XmlElement
    private String numero;
    @XmlElement
    private String calle;
    @XmlElement
    private String giro;
    @XmlElement
    private String fechaRefrendo;
    @XmlElement
    private String actividadPrincipal;
    @XmlElement
    private String actividadAdicional;

    public int getIdLicencia() {
        return idLicencia;
    }

    @Override
    public String toString() {
        return "Licencia{" +
                "idLicencia=" + idLicencia +
                ", razonSocial='" + razonSocial + '\'' +
                ", colonia='" + colonia + '\'' +
                ", numero=" + numero +
                ", calle='" + calle + '\'' +
                ", giro='" + giro + '\'' +
                ", fechaRefrendo=" + fechaRefrendo +
                ", actividadPrincipal='" + actividadPrincipal + '\'' +
                ", actividadAdicional='" + actividadAdicional + '\'' +
                '}';
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getFechaRefrendo() {
        return fechaRefrendo;
    }

    public void setFechaRefrendo(String fechaRefrendo) {
        this.fechaRefrendo = fechaRefrendo;
    }

    public String getActividadPrincipal() {
        return actividadPrincipal;
    }

    public void setActividadPrincipal(String actividadPrincipal) {
        this.actividadPrincipal = actividadPrincipal;
    }

    public String getActividadAdicional() {
        return actividadAdicional;
    }

    public void setActividadAdicional(String actividadAdicional) {this.actividadAdicional = actividadAdicional;}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}