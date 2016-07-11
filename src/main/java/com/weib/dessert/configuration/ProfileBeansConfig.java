/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Import和将三个Bean都定义到同一个Config文件中的操作是相同的
 * 同样可以通过 
 *      ProfileBean profileBean = (ProfileBean) context.getBean(ProfileBean.class);
 * 来获取到相应的Bean
 * @author zhangjingwei
 */
@Configuration
//@ComponentScan(basePackageClasses={DevProfileBean.class, ProProfileBean.class, QaProfileBean.class})
@Import({ProProfileConfig.class, QaProfileConfig.class, DevProfileConfig.class})
public class ProfileBeansConfig {
    
//    @Bean
//    @Profile("dev")
//    public ProfileBean devProfileBean(){
//        return new DevProfileBean();
//    }
//    
//    @Bean
//    @Profile("pro")
//    public ProfileBean proProfileBean(){
//        return new ProProfileBean();
//    }
//    
//    @Bean
//    @Profile("qa")
//    public ProfileBean qaProfileBean(){
//        return new QaProfileBean();
//    }
    
}
