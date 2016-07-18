package beans.backing;

import beans.model.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author IngGerman
 */

@ManagedBean
@SessionScoped
public class UserLogin {

    /**
     * Creates a new instance of UserLogin
     */
    @ManagedProperty(value = "#{user}")
    private User user;

    public UserLogin() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String validaUser() {
        System.out.println("validaUser() nombre= " + this.user.getName());
        System.out.println("validaUser() apellido= " + this.user.getApellidoP());
        System.out.println("validaUser() username= " + this.user.getUserName());
        if (this.user.getUserName().equals("pepe") && this.user.getContrasena().equals("pepe")) {

            return "bienvenida";

        } else {
            return "Pagina2";
        }

    }

}
