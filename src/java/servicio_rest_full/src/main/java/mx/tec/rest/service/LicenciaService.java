package mx.tec.rest.service;

import mx.tec.rest.model.Licencia;
import mx.tec.rest.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LicenciaService implements ILicenciaService{
    @Override
    public List<Licencia> findLicencias() {
        String sql = "SELECT * FROM Licencia";
        List<Licencia> licencias = new ArrayList<>();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Licencia licencia = new Licencia();
                licencia.setIdLicencia(resultSet.getInt("idLicencia"));
                licencia.setRazonSocial(resultSet.getString("razonSocial"));
                licencia.setColonia(resultSet.getString("colonia"));
                licencia.setNumero(resultSet.getString("numero"));
                licencia.setCalle(resultSet.getString("calle"));
                licencia.setGiro(resultSet.getString("giro"));
                licencia.setFechaRefrendo(resultSet.getString("fechaRefrendo"));
                licencia.setActividadPrincipal(resultSet.getString("actividadPrincipal"));
                licencia.setActividadAdicional(resultSet.getString("actividadAdicional"));
                licencias.add(licencia);
            }
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return licencias;
    }

    @Override
    public Licencia findLicenciaById(int idLicencia) {
        String sql = "SELECT * FROM Licencia WHERE idLicencia = ?";
        Licencia licencia = new Licencia();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idLicencia);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            licencia.setIdLicencia(resultSet.getInt("idLicencia"));
            licencia.setRazonSocial(resultSet.getString("razonSocial"));
            licencia.setColonia(resultSet.getString("colonia"));
            licencia.setNumero(resultSet.getString("numero"));
            licencia.setCalle(resultSet.getString("calle"));
            licencia.setGiro(resultSet.getString("giro"));
            licencia.setFechaRefrendo(resultSet.getString("fechaRefrendo"));
            licencia.setActividadPrincipal(resultSet.getString("actividadPrincipal"));
            licencia.setActividadAdicional(resultSet.getString("actividadAdicional"));
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return licencia;
    }

    @Override
    public boolean deleteLicencia(int idLicencia) {
        String sql = "DELETE FROM Licencia WHERE idLicencia = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idLicencia);
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean saveLicencia(Licencia licencia) {
        String sql = "INSERT INTO Licencia(razonSocial, colonia, numero, calle, giro, fechaRefrendo, actividadPrincipal, " +
                "actividadAdicional) VALUES(?,?,?,?,?,?,?,?)";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, licencia.getRazonSocial());
            preparedStatement.setString(2, licencia.getColonia());
            preparedStatement.setString(3, licencia.getNumero());
            preparedStatement.setString(4, licencia.getCalle());
            preparedStatement.setString(5, licencia.getGiro());
            preparedStatement.setString(6, licencia.getFechaRefrendo());
            preparedStatement.setString(7, licencia.getActividadPrincipal());
            preparedStatement.setString(8, licencia.getActividadAdicional());
            preparedStatement.execute();
            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean editLicencia(Licencia licencia) {
        String sql = "UPDATE Licencia SET razonSocial=?, colonia=?, numero=?, calle=?, giro=?, fechaRefrendo=?, " +
                "actividadPrincipal=?, actividadAdicional=? WHERE idLicencia = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, licencia.getRazonSocial());
            preparedStatement.setString(2, licencia.getColonia());
            preparedStatement.setString(3, licencia.getNumero());
            preparedStatement.setString(4, licencia.getCalle());
            preparedStatement.setString(5, licencia.getGiro());
            preparedStatement.setString(6, licencia.getFechaRefrendo());
            preparedStatement.setString(7, licencia.getActividadPrincipal());
            preparedStatement.setString(8, licencia.getActividadAdicional());
            preparedStatement.setInt(9, licencia.getIdLicencia());
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }
}
