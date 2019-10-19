package mx.tec.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Usuario")
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {
    @XmlElement
    private int idUsuario;
    @XmlElement
    private String usuario;
    @XmlElement
    private String contraseña;
    @XmlElement
    private String correo;
    @XmlElement
    private int reportes;

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", correo='" + correo + '\'' +
                ", reportes=" + reportes +
                '}';
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getReportes() {
        return reportes;
    }

    public void setReportes(int reportes) {
        this.reportes = reportes;
    }
}
