/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.beans.menu;

import com.weib.dessert.beans.dessert.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
@Component
@Primary
public class DinnerMenu implements Menu {

    private Dessert dessert;
    
    @Autowired
    @Qualifier("iceCream")
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }
    
    @Override
    public void desert() {
        dessert.output();
    }
    
}
