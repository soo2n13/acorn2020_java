package test.main;
/*
 *   [ ������ ]
 *   
 *   3. �� ������
 *   
 *   ���� : ==, !=, >, >=, <, <=
 *   
 *   - �� ������ ����� boolean type ���� ��Ÿ����. 
 */
public class MainClass03 {
	public static void main(String[] args) {
		//���ʿ� �ִ� ���� ������ ��
		boolean result1 = 10 == 10; //true
		//���ʿ� �ִ� ���� �ٸ��� ��
		boolean result2 = 10 != 10; //false
		//���ʿ� �ִ� ���� ū�� ��
		boolean result3 = 10 > 100; //false;
		//���ʿ� �ִ� ���� ũ�ų� ������ ��
		boolean result4 = 10 >= 10; //true
		//���ʿ� �ִ� ���� ������ ��
		boolean result5 = 10 < 100; //true
		//���ʿ� �ִ� ���� �۰ų� ������ ��
		boolean result6 = 10 <= 10; //true	
		
		String name=null;
		
		boolean result7 = name == null; //true
		boolean result8 = name != null; //false
		
		String name1=new String("lee");
		String name2=new String("lee");
		boolean result9=name1==name2;
		boolean result10=new String("lee").equals(new String("lee"));
	}
}























