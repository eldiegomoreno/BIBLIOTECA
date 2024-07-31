import java.util.HashMap;

public class GestorUsuarios {
    private HashMap<String, Usuario> usuarios = new HashMap<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public void actualizarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public Usuario consultarUsuario(String numeroIdentificacion) {
        return usuarios.get(numeroIdentificacion);
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios.values()) {
            System.out.println(usuario);
        }
    }
}
