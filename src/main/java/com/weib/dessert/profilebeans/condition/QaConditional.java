/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.dessert.profilebeans.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 *
 * @author WeibHOME
 */
public class QaConditional implements Condition {

    @Override
    public boolean matches(ConditionContext cc, AnnotatedTypeMetadata atm) {
        return cc.getEnvironment().containsProperty("spring.allow.qa");
    }
    
}
