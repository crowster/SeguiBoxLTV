/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguriboxltv.backing;

import com.seguriboxltv.core.domain.Group;
import com.seguriboxltv.core.service.GroupService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
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
public class GroupBean {

    @Autowired
    private GroupService groupService;

    private Group group = new Group();
    private HtmlDataTable tabla;

    private int id;
    private String groupName;
    private String description;
    private boolean isActive;
    private boolean isEdit;

    public boolean isIsEdit() {
        return isEdit;
    }

    public void setIsEdit(boolean isEdit) {
        this.isEdit = isEdit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public HtmlDataTable getTabla() {
        return tabla;
    }

    public void setTabla(HtmlDataTable tabla) {
        this.tabla = tabla;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String delete(Group group) {
        System.out.println("no tengo ni idea" + group.getGroupId());

        try {
            groupService.Delete(group.getGroupId(), GetIp(), "gerhl92");
        } catch (Exception e) {

            e.printStackTrace();
        }
        return null;
    }

    public void save() {
        System.out.println("valores de grupos " + group.toString());
        System.out.println("valores de ip " + GetIp());
        try {
            groupService.Save(group, GetIp(), "gerhl92");
            if (this.isEdit == true) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El Grupo " + group.getGroupName() + " fue ACTUALIZADO satisfactoriamente"));

            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El Grupo " + group.getGroupName() + " fue agregado satisfactoriamente"));

            }
            group = new Group();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "error", e.getMessage()));
            e.printStackTrace();
        }
    }

    public List<Group> getGroups() {
        List<Group> list = null;
        try {
            list = groupService.Get(0);
        } catch (Exception e) {
            //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El area fue agregado satisfactoriamente"));

        }
        return list;
    }

    public String goToEdit(Group group) {

        this.group = group;
        this.isEdit = true;
        return "adminGroup";

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
