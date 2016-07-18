/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguriboxltv.backing;

import com.seguriboxltv.core.domain.AlgorithmAsymmetric;
import com.seguriboxltv.core.service.AlgorithmAsymmetricService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author IngGerman
 */
@Component
@ManagedBean
@RequestScoped
public class AlgorithmAsyBean extends AlgorithmAsyBeanBase {

    @Autowired
    private AlgorithmAsymmetricService algorithmAsymmetricService;

    public List<AlgorithmAsymmetric> getAllAsymetric() {
        List<AlgorithmAsymmetric> list = null;
        try {
            list = algorithmAsymmetricService.GetAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
