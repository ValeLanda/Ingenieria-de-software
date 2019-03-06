/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import com.mycompany.mapita.Usuario;
import com.mycompany.mapita.UsuarioDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author angela
 */
public class EliminaUsuario {
    private int idusuario;

    public int getIduser() {
        return idusuario;
    }

    public void setIduser(int idusuario) {
        this.idusuario = idusuario;
    }

    public void eliminaUsuario(){
        
        UsuarioDAO udb = new UsuarioDAO();
        Usuario usuario = udb.find(idusuario);
        udb.delete(usuario);
    }
   
}