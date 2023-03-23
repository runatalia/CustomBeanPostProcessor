package com.springbeans;



public class FightClubImpl implements FightClub{
    
private CombatCat loryCat;
private CombatCat baxterCat;

    @Override
    public void fight() {
       System.out.println(loryCat.toString());
       System.out.println(baxterCat.toString());
       if(loryCat.getStrenght()>baxterCat.getStrenght()){
           System.out.println("loryCat win, Streinght "+loryCat.getStrenght());
           System.out.println("baxterCat, Streinght "+baxterCat.getStrenght());
       } else if (loryCat.getStrenght()<baxterCat.getStrenght()) {
           System.out.println("baxterCat win, Streinght "+baxterCat.getStrenght());
           System.out.println("loryCat , Streinght "+loryCat.getStrenght());
       } else {
           System.out.println("baxterCat , Streinght "+baxterCat.getStrenght());
           System.out.println("loryCat , Streinght "+loryCat.getStrenght());
       }
       
    }

    public void setLoryCat(CombatCat loryCat) {
        this.loryCat = loryCat;
    }

    public void setBaxterCat(CombatCat baxterCat) {
        this.baxterCat = baxterCat;
    }
}
