/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.configuration.profile;

import com.weib.dessert.beans.profile.DevProfileBean;
import com.weib.dessert.beans.profile.ProfileBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author zhangjingwei
 */
@Configuration
@Profile("dev")
public class DevProfileConfig {
    @Bean
    public ProfileBean profileBean(){
        return new DevProfileBean();
    }
}
