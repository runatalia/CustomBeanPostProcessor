package com.springbeans;


import org.springframework.context.support.ClassPathXmlApplicationContext;



 
public class Application {
public static void main(String[] args){
    ClassPathXmlApplicationContext classPathXMLApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    FightClub fightClub = classPathXMLApplicationContext.getBean(FightClub.class);
    fightClub.fight();
}
    
}
