/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.beans.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
@Component
@Primary      //首选
@Qualifier("cake")
public class Cake implements Dessert {

    @Override
    public void output() {
        System.out.println("##################Cake#############");
    }
    
}
