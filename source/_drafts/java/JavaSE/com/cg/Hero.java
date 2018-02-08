package com.cg;
class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	public static void main(String[] args){
		Hero garen = new Hero();
		garen.name = "gailun";
		garen.hp = 616.34f;
		garen.armor = 27.545f;
		garen.moveSpeed = 480;
		System.out.println("Hero Class");
	}
}