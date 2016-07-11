/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.configuration;

import com.weib.dessert.profilebeans.ProfileBean;
import com.weib.dessert.profilebeans.QaProfileBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author zhangjingwei
 */
@Configuration
@Profile("qa")
public class QaProfileConfig {
    
    @Bean
    public ProfileBean profileBean(){
        return new QaProfileBean();
    }
}
