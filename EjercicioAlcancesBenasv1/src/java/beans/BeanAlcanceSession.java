/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author IngGerman
 */
@ManagedBean(name = "sesion")
@SessionScoped
public class BeanAlcanceSession {

    /**
     * Creates a new instance of BeanAlcanceSession
     */
    public BeanAlcanceSession() {
    }

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
