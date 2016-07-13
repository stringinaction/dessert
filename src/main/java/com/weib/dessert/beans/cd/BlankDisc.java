/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.beans.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
@Component
@PropertySource("classpath:app.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BlankDisc implements CD {

    private String title;
    private String artist;
    
    @Autowired
    public void setTitle(
            @Value("${disc.title}") String title,
            @Value("#{'test'}") String artist){
        this.title = title;
        this.artist = artist;
    }
    
    @Override
    public void play() {
        System.out.println("#############play " + title + " by " + artist + "###########");
    }
    
}
