package test.main;
/*
 *  4. 논리연산자 테스트
 */
public class MainClass04 {
	public static void main(String[] args) {
<<<<<<< HEAD
		//or ����
		boolean result1 = false || false; //false // �� �κ��� �ϳ��� true�� true ����(or ������ (�̰ų�))
=======
		// or 연산 
		boolean result1 = false || false; //false
>>>>>>> refs/remotes/upstream/master
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
<<<<<<< HEAD
		
		//and ����
		boolean result5 = false && false; //false  // �� �κд� true�� true ����(and ������ (�̸�))
=======
		// and 연산
		boolean result5 = false && false; //false
>>>>>>> refs/remotes/upstream/master
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
<<<<<<< HEAD
		
		//not ����
		boolean result9 = !true; //!true(true�� �ƴ�= false)
=======
		// not 연산
		boolean result9 = !true; //false
>>>>>>> refs/remotes/upstream/master
		boolean result19 = !false; //true
		
		boolean isRun=false;
		if(isRun != true){
			System.out.println("달리지 않아요");
		}
		
		if(!isRun){
			System.out.println("달리지 않아요2");
		}
	}	
}




















