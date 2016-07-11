/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert;

import com.weib.dessert.configuration.DessertConfig;
import com.weib.dessert.profilebeans.ProfileBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author zhangjingwei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DessertConfig.class)
@ActiveProfiles("dev")
public class DessertTest extends AbstractJUnit4SpringContextTests {
    
    @Test
    public void testProfile(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DessertConfig.class);
        
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        //ctx.getEnvironment().addActiveProfile("dev");
        String[] ap = ctx.getEnvironment().getActiveProfiles();
        System.out.println("###################");
        for(String s : ap){
            System.out.println(s);
        }
        ProfileBean profileBean = (ProfileBean) context.getBean(ProfileBean.class);
        profileBean.output();
    }
}
