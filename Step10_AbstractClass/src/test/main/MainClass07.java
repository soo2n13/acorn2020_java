package test.main;

import test.mypac.Weapon;

public class MainClass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("아무나 공격해요");
			}
		};

		useWeapon(w1);
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("한번만 공격");
			}
		});
	}	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}
