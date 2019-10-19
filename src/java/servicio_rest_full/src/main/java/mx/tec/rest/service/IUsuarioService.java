package mx.tec.rest.service;

import mx.tec.rest.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> findUsuarios();
    Usuario findUsuarioById(int idUsuario);
    boolean validarUsuario(String usuario);
    boolean validarSesion(Usuario usuario);
    boolean deleteUsuario(int idUsuario);
    boolean saveUsuario(Usuario usuario);
    boolean editUsuario(Usuario usuario);
}
