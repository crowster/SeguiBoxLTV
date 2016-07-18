/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguriboxltv.backing;

import com.seguriboxltv.core.domain.Area;
import com.seguriboxltv.core.service.AreaService;
import com.seguriboxltv.model.AreaBeanModel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author IngGerman
 */
@Component
@ManagedBean
@RequestScoped
public class AreaBean {

    @Autowired
    private AreaService areaService;

    @Autowired
    private AreaBeanModel area;

    List<Area> list = null;

    private boolean isEdit;

    public AreaBean() {
    }

    public boolean isIsEdit() {
        return isEdit;
    }

    public void setIsEdit(boolean isEdit) {
        this.isEdit = isEdit;
    }

    public AreaBeanModel getArea() {
        return area;
    }

    public void setArea(AreaBeanModel area) {
        this.area = area;
    }

    public void create() {

        //System.out.println("hola+:" + area.getArea().getAreaName());
        try {

            int id = areaService.Save(area.getArea(), GetIp(), "gerhl92");
            
            System.out.println("EL VALOR DEL NAME ES:" + area.getArea().getAreaName());

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El area  : " + area.getArea().getAreaName() + " fue agregado satisfactoriamente"));
            area.setArea(new Area());
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.getMessage()));

        }

    }

    public List<Area> getAreas() {

        try {
            list = areaService.Get(0);
            System.out.println("lista:" + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void delete(Area area) {

        System.out.println("entro a delete "+area.toString());
        try {
            areaService.Delete(area.getAreaId(), GetIp(), "gerhl92");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info","El registro fue borrado satisfactoriamente"));

        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.getMessage()));

        }

    }

    public String goToArea(Area area) {

        this.area.setArea(area);
        this.isEdit = true;
        return "AdminArea";
    }

    private String GetIp() {

        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }

        return ipAddress;
    }
}
