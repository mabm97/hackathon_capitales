package mx.tec.rest.controller;

import mx.tec.rest.model.*;
import mx.tec.rest.service.*;

import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.List;

@Path("/service")
public class Directorio {

    @GET
    @Path("/usuario")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios;
        usuarios = new UsuarioService().findUsuarios();
        return usuarios;
    }

    @GET
    @Path("/validarUsuario")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean validUsuario(@WebParam String usuario) {
        return new UsuarioService().validarUsuario(usuario);
    }

    @POST
    @Path("/validarSesion")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean validSesion(@WebParam Usuario usuario) {
        return new UsuarioService().validarSesion(usuario);
    }

    @GET
    @Path("/usuario/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getUsuario(@PathParam("id") int idUsuario) {
        Usuario usuario = new UsuarioService().findUsuarioById(idUsuario);
        return usuario;
    }

    @DELETE
    @Path("/usuario/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteUsuario(@PathParam("id") int idUsuario) {
        return new UsuarioService().deleteUsuario(idUsuario);
    }

    @POST
    @Path("/usuario")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean saveUsuario(@WebParam Usuario usuario) {
        return new UsuarioService().saveUsuario(usuario);
    }

    @PUT
    @Path("/usuario")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean editUsuario(@WebParam Usuario usuario) {
        return new UsuarioService().editUsuario(usuario);
    }

    @GET
    @Path("/licencia")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Licencia> getLicencias() {
        List<Licencia> licencias;
        licencias = new LicenciaService().findLicencias();
        return licencias;
    }

    @GET
    @Path("/licencia/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Licencia getLicencia(@PathParam("id") int idLicencia) {
        Licencia licencia = new LicenciaService().findLicenciaById(idLicencia);
        return licencia;
    }

    @DELETE
    @Path("/licencia/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteLicencia(@PathParam("id") int idLicencia) {
        return new LicenciaService().deleteLicencia(idLicencia);
    }

    @POST
    @Path("/licencia")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean saveLicencia(@WebParam Licencia licencia) {
        return new LicenciaService().saveLicencia(licencia);
    }

    @PUT
    @Path("/licencia")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean editLicencia(@WebParam Licencia licencia) {
        return new LicenciaService().editLicencia(licencia);
    }

    @GET
    @Path("/reporteIrregularidad")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ReporteIrregularidad> getReporteIrregularidad() {
        List<ReporteIrregularidad> reporteIrregularidad;
        reporteIrregularidad = new ReporteIrregularidadService().findReporteIrregularidads();
        return reporteIrregularidad;
    }

    @GET
    @Path("/reporteIrregularidad/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ReporteIrregularidad getReporteIrregularidad(@PathParam("id") int idReporteIrregularidad) {
        ReporteIrregularidad reporteIrregularidad = new ReporteIrregularidadService().findReporteIrregularidadById(idReporteIrregularidad);
        return reporteIrregularidad;
    }

    @DELETE
    @Path("/reporteIrregularidad/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteReporteIrregularidad(@PathParam("id") int idReporteIrregularidad) {
        return new ReporteIrregularidadService().deleteReporteIrregularidad(idReporteIrregularidad);
    }

    @POST
    @Path("/reporteIrregularidad")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean saveReporteIrregularidad(@WebParam ReporteIrregularidad reporteIrregularidad) {
        return new ReporteIrregularidadService().saveReporteIrregularidad(reporteIrregularidad);
    }

    @PUT
    @Path("/reporteIrregularidad")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean editReporteIrregularidad(@WebParam ReporteIrregularidad reporteIrregularidad) {
        return new ReporteIrregularidadService().editReporteIrregularidad(reporteIrregularidad);
    }

    @GET
    @Path("/tipoIrregularidad")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CTipoIrregularidad> getTipoIrregularidad() {
        List<CTipoIrregularidad> tipoIrregularidad;
        tipoIrregularidad = new TipoIrregularidadService().findCTipoIrregularidads();
        return tipoIrregularidad;
    }

    @GET
    @Path("/tipoIrregularidad/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CTipoIrregularidad getTipoIrregularidad(@PathParam("id") int idTipoIrregularidad) {
        CTipoIrregularidad tipoIrregularidad = new TipoIrregularidadService().findTipoIrregularidadById(idTipoIrregularidad);
        return tipoIrregularidad;
    }

    @DELETE
    @Path("/tipoIrregularidad/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteTipoIrregularidad(@PathParam("id") int idTipoIrregularidad) {
        return new TipoIrregularidadService().deleteTipoIrregularidad(idTipoIrregularidad);
    }

    @POST
    @Path("/tipoIrregularidad")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean saveTipoIrregularidad(@WebParam CTipoIrregularidad tipoIrregularidad) {
        return new TipoIrregularidadService().saveTipoIrregularidad(tipoIrregularidad);
    }

    @PUT
    @Path("/tipoIrregularidad")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean editTipoIrregularidad(@WebParam CTipoIrregularidad tipoIrregularidad) {
        return new TipoIrregularidadService().editTipoIrregularidad(tipoIrregularidad);
    }

}