/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.configuration.profile;

import com.weib.dessert.beans.profile.ProfileBean;
import com.weib.dessert.beans.profile.QaProfileBean;
import com.weib.dessert.beans.profile.condition.QaConditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author zhangjingwei
 */
@Configuration
@Profile("qa")
@Conditional(QaConditional.class) //条件成立时载入该config
public class QaProfileConfig {
    
    @Bean
    public ProfileBean profileBean(){
        return new QaProfileBean();
    }
}
