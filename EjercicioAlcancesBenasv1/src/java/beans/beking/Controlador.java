/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.beking;

import beans.BeanAlcancePet;
import beans.BeanAlcanceSession;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.ActionEvent;

/**
 *
 * @author IngGerman
 */
@ManagedBean
@RequestScoped
public class Controlador {

    /**
     * Creates a new instance of Controlador
     */
    public Controlador() {
    }
    
    @ManagedProperty(value="#{peticion}")
    private BeanAlcancePet peticion;
    
    @ManagedProperty(value="#{sesion}")
    private BeanAlcanceSession sesion;
    

    public BeanAlcancePet getPeticion() {
        return peticion;
    }

    public void setPeticion(BeanAlcancePet peticion) {
        this.peticion = peticion;
    }

    public BeanAlcanceSession getSesion() {
        return sesion;
    }

    public void setSesion(BeanAlcanceSession sesion) {
        this.sesion = sesion;
    }
    
    
    
    public void cambiaValores(ActionEvent e){
    
        System.out.println("Valores Almacenados en cada modelBean");
        System.out.println("Valor  alcance request: "+peticion.getValor());
    }
    
    public String cambiarPagina(){
    
        System.out.println("Cambio de Pagina");
        
        return "despliega";
    }
    
}
