package com.springbeans;


import java.lang.reflect.Field;
import java.util.Random;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;



public class CatCalculateStrengthPostProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for(Field field:fields){
        CalculateCatStrength annotation = field.getAnnotation(CalculateCatStrength.class);
        if(annotation!=null){
        field.setAccessible(true);
        int minStrenght = annotation.minStrenght();
        int maxStrenght = annotation.maxStrenght();
        Random random = new Random();
        int result = minStrenght + random.nextInt(maxStrenght-minStrenght);
        ReflectionUtils.setField(field, bean, result);
        }
        }
        return bean;
    }

    
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
    
}
