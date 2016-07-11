/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert;

import com.weib.dessert.configuration.DessertConfig;
import com.weib.dessert.profilebeans.ProfileBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author zhangjingwei
 */
//@ActiveProfiles("dev")  没有生效，但是在编译选项中加上 -Dspring.profiles.active="pro" 后可以生效
public class DessertMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DessertConfig.class);
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        String[] ap = ctx.getEnvironment().getActiveProfiles();
        for(String s : ap){
            System.out.println(s);
        }
        ProfileBean profileBean = (ProfileBean) context.getBean(ProfileBean.class);
        profileBean.output();
    }
}
