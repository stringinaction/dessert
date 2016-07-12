/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.beans.profile;

import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
@Component
public class QaProfileBean implements ProfileBean{

    @Override
    public void output() {
        System.out.println("+++++++++++++++++++++++QaProfileBean");
    }
    
}
