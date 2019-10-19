package mx.tec.rest.service;

import mx.tec.rest.model.Usuario;
import mx.tec.rest.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService implements IUsuarioService {

    @Override
    public List<Usuario> findUsuarios() {
        String sql = "SELECT * FROM Usuario";
        List<Usuario> usuarios = new ArrayList<>();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                usuario.setUsuario(resultSet.getString("usuario"));
                usuario.setContraseña(resultSet.getString("contraseña"));
                usuario.setCorreo(resultSet.getString("correo"));
                usuario.setReportes(resultSet.getInt("reportes"));

                usuarios.add(usuario);
            }
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return usuarios;
    }

    @Override
    public Usuario findUsuarioById(int idUsuario) {
        String sql = "SELECT * FROM Usuario WHERE idUsuario = ?";
        Usuario usuario = new Usuario();
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idUsuario);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            usuario.setIdUsuario(resultSet.getInt("idUsuario"));
            usuario.setUsuario(resultSet.getString("usuario"));
            usuario.setContraseña(resultSet.getString("contraseña"));
            usuario.setCorreo(resultSet.getString("correo"));
            usuario.setReportes(resultSet.getInt("reportes"));

        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return usuario;
    }

    @Override
    public boolean validarUsuario(String usuario) {
        String sql = "SELECT * FROM Usuario WHERE usuario = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, usuario);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
                return false;

        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return true;
    }

    @Override
    public boolean validarSesion(Usuario usuario) {
        String sql = "SELECT * FROM Usuario WHERE usuario = ? AND cotnrasañe=?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getUsuario());
            preparedStatement.setString(2, usuario.getContraseña());
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
                return true;

        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteUsuario(int idUsuario) {
        String sql = "DELETE FROM Usuario WHERE idUsuario = ?";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idUsuario);
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean saveUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuario(usuario, contraseña, correo, reportes) VALUES(?,?,?,?)";
        try{
            Connection conexion = Conexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getUsuario());
            preparedStatement.setString(2, usuario.getContraseña());
            preparedStatement.setString(3, usuario.getCorreo());
            preparedStatement.setInt(4, usuario.getReportes());
            preparedStatement.execute();

            return true;
        }catch(Exception ex)
        {
            System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
        }
        return false;
    }
    @Override
    public boolean editUsuario(Usuario usuario) {
            String sql = "UPDATE Usuario SET usuario=?, contraseña=?, correo=?, reportes=? WHERE idUsuario = ?";
            try{
                Connection conexion = Conexion.getConexion();
                PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                preparedStatement.setString(1, usuario.getUsuario());
                preparedStatement.setString(2, usuario.getContraseña());
                preparedStatement.setString(3, usuario.getCorreo());
                preparedStatement.setInt(4, usuario.getReportes());
                preparedStatement.setInt(5, usuario.getIdUsuario());
                preparedStatement.execute();

                return true;
            }catch(Exception ex)
            {
                System.out.println(this.getClass().getCanonicalName() + " " + ex.getMessage());
            }
            return false;
    }
}
