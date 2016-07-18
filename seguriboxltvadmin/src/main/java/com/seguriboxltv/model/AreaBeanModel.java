/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguriboxltv.model;

import com.seguriboxltv.core.domain.Area;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Component;

/**
 *
 * @author IngGerman
 */
@Component
@ManagedBean
@RequestScoped
public class AreaBeanModel {

    /**
     * Creates a new instance of AreaBeanModel
     */
    private Area area = new Area();

    public AreaBeanModel() {
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    
}
