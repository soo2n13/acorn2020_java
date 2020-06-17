package test.main;

import test.mypac.Weapon;

public class MainClass08 {
	static Weapon w1=new Weapon() {
		
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("수중 공격");
			
		}
	};
	public static void main(String[] args) {
		
		useWeapon(w1);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
