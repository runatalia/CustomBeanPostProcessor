package com.springbeans;

 
public class CombatCat {
    private String name;
    
    @CalculateCatStrength(minStrenght = 4, maxStrenght = 14)
    private Integer strenght;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrenght() {
        return strenght;
    }

    public void setStrenght(Integer strenght) {
        this.strenght = strenght;
    }

    @Override
    public String toString() {
        return "CombatCat{" + "name=" + name + ", strenght=" + strenght + '}';
    }
    
    
}
