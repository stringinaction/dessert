/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.configuration;

import com.weib.dessert.configuration.profile.ProfileBeansConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author zhangjingwei
 */
@Configuration
@Import(ProfileBeansConfig.class)
@ComponentScan(basePackages={"com.weib.dessert.beans"})  //会自动装配该包下的所有Bean（定义了@Component）
public class DessertConfig {
}
