package test.main;
/*
 *  6. 3항 연산자 테스트
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=false;
<<<<<<< HEAD
		String result = isWait ? "��ٷ�" : "��ٸ�����"; // ���� ������ (���ǹ�?true ��: false ��)
=======
		// isWait 이 true 면 "기다려요" 가 대입되고 false 면 "기다리지 않아요" 가 대입된다.
		String result = isWait ? "기다려요" : "기다리지 않아요";
		
>>>>>>> refs/remotes/upstream/master
		System.out.println(result);
		
		//위의 3항 연산자는 아래와 같이 if ~ else 문과 같은 로직이다. 
		String result2=null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
	}
}











