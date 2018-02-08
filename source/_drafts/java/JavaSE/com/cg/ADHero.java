package com.cg;
public class ADHero extends Hero implements AD{
	 // @override
     public void physicAttack(){
	 System.out.println("physicAttack!");
	}
     public static void main(String[] args){
     ADHero adHero = new ADHero();
     adHero.physicAttack();
 }
}