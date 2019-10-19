package mx.tec.rest.service;

import mx.tec.rest.model.ReporteIrregularidad;
import mx.tec.rest.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReporteIrregularidadService implements IReporteIrregularidadService {
    @Override
    public List<ReporteIrregularidad> findReporteIrregularidads() {
        String sql = "SELECT * FROM ReporteIrregularidad";
        List<ReporteIrregularidad> reporteIrregularidads = new ArrayList<>();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                ReporteIrregularidad reporteIrregularidad = new ReporteIrregularidad();
                reporteIrregularidad.setIdReporteIrregularidad(resultSet.getInt("idReporteIrregularidad"));
                reporteIrregularidad.setIdUsuario(resultSet.getInt("idUsuario"));
                reporteIrregularidad.setIdTipoIrregularidad(resultSet.getInt("idTipoIrregularidad"));
                reporteIrregularidad.setIdLicencia(resultSet.getInt("idLicencia"));
                reporteIrregularidad.setFecha(resultSet.getDate("fecha"));

                reporteIrregularidads.add(reporteIrregularidad);
            }
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return reporteIrregularidads;
    }

    @Override
    public ReporteIrregularidad findReporteIrregularidadById(int idReporteIrregularidad) {
        String sql = "SELECT * FROM ReporteIrregularidad WHERE idReporteIrregularidad = ?";
        ReporteIrregularidad reporteIrregularidad = new ReporteIrregularidad();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idReporteIrregularidad);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            reporteIrregularidad.setIdReporteIrregularidad(resultSet.getInt("idReporteIrregularidad"));
            reporteIrregularidad.setIdUsuario(resultSet.getInt("idUsuario"));
            reporteIrregularidad.setIdTipoIrregularidad(resultSet.getInt("idTipoIrregularida"));
            reporteIrregularidad.setIdLicencia(resultSet.getInt("idLicencia"));
            reporteIrregularidad.setFecha(resultSet.getDate("fecha"));

        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return reporteIrregularidad;
    }

    @Override
    public boolean deleteReporteIrregularidad(int idReporteIrregularidad) {
        String sql = "DELETE FROM ReporteIrregularidad WHERE idReporteIrregularidad = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idReporteIrregularidad);
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean saveReporteIrregularidad(ReporteIrregularidad reporteIrregularidad) {
        String sql = "INSERT INTO ReporteIrregularidad(idUsuario, idTipoIrregularidad, idLicencia, fecha) " +
                "VALUES(?,?,?,?)";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, reporteIrregularidad.getIdUsuario());
            preparedStatement.setInt(2, reporteIrregularidad.getIdTipoIrregularidad());
            preparedStatement.setInt(3, reporteIrregularidad.getIdLicencia());
            preparedStatement.setDate(4, reporteIrregularidad.getFecha());
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean editReporteIrregularidad(ReporteIrregularidad reporteIrregularidad) {
        String sql = "UPDATE ReporteIrregularidad SET idUsuario=?, idTipoIrregularidad=?, idLicencia=?, " +
                "fecha=? WHERE idReporteIrregularidad = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, reporteIrregularidad.getIdUsuario());
            preparedStatement.setInt(2, reporteIrregularidad.getIdTipoIrregularidad());
            preparedStatement.setInt(3, reporteIrregularidad.getIdLicencia());
            preparedStatement.setDate(4, reporteIrregularidad.getFecha());
            preparedStatement.setInt(5, reporteIrregularidad.getIdReporteIrregularidad());
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }
}
