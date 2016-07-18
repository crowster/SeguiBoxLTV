/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author IngGerman
 */
@ManagedBean(name="peticion")
@RequestScoped
public class BeanAlcancePet {

    /**
     * Creates a new instance of BeanAlcancePet
     */
    public BeanAlcancePet() {
    }
    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
