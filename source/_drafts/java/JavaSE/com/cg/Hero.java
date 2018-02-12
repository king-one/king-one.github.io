package com.cg;
class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	public static void main(String[] args){
		Hero garen = new Hero();
//		garen.name = "gailun";
//		garen.hp = 616.34f;
//		garen.armor = 27.545f;
		garen.moveSpeed = 480;
		Hero garen1 = new Hero();
//		garen1.name = "gailun";
//		garen1.hp = 616.34f;
//		garen1.armor = 27.545f;
		garen1.moveSpeed = 480;
		System.out.println(garen.toString());
		System.out.println(garen);
		System.out.println(garen == garen1);

	}
}