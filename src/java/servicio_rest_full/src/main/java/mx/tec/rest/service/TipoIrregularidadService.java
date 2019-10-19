package mx.tec.rest.service;

import mx.tec.rest.model.CTipoIrregularidad;
import mx.tec.rest.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoIrregularidadService implements ITipoIrregularidadService {
    @Override
    public List<CTipoIrregularidad> findCTipoIrregularidads() {
        String sql = "SELECT * FROM CTipoIrregularidad";
        List<CTipoIrregularidad> tipoIrregularidads = new ArrayList<>();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                CTipoIrregularidad tipoIrregularidad = new CTipoIrregularidad();
                tipoIrregularidad.setIdTipoIrregularidad(resultSet.getInt("idTipoIrregularidad"));
                tipoIrregularidad.setNombre(resultSet.getString("nombre"));
                tipoIrregularidads.add(tipoIrregularidad);
            }
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return tipoIrregularidads;
    }

    @Override
    public CTipoIrregularidad findTipoIrregularidadById(int idTipoIrregularidad) {
        String sql = "SELECT * FROM CTipoIrregularidad WHERE idTipoIrregularidad = ?";
        CTipoIrregularidad tipoIrregularidad = new CTipoIrregularidad();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idTipoIrregularidad);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            tipoIrregularidad.setIdTipoIrregularidad(resultSet.getInt("idTipoIrregularidad"));
            tipoIrregularidad.setNombre(resultSet.getString("nomobre"));

        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return tipoIrregularidad;
    }

    @Override
    public boolean deleteTipoIrregularidad(int idTipoIrregularidad) {
        String sql = "DELETE FROM CTipoIrregularidad WHERE idTipoIrregularidad = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idTipoIrregularidad);
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean saveTipoIrregularidad(CTipoIrregularidad tipoIrregularidad) {
        String sql = "INSERT INTO CTipoIrregularidad(nombre) VALUES(?)";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, tipoIrregularidad.getNombre());
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean editTipoIrregularidad(CTipoIrregularidad tipoIrregularidad) {
        String sql = "UPDATE CTipoIrregularidad SET nombre=? WHERE idTipoIrregularidad = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(2, tipoIrregularidad.getIdTipoIrregularidad());
            preparedStatement.setString(1, tipoIrregularidad.getNombre());
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

}
