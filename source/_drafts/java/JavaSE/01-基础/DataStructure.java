public class DataStructure{
  public static void main(String[] args){
	  // �ַ���
      char char1 = '��'; //�����Ű���
	  char char2 = '��';
	  System.out.println("��վ�������ǣ�" + char1 + "---"+char2);

	  //����
	  short a = 22;
	  int b = 022;
	  long c = 0x22L;
	  System.out.println("ת����ʮ����:x=" + a + ",y=" + b +",z=" + c);

	  // ������

	  float m = 22.45f;
	  double n = 10;
	  System.out.println("����˻�" + m + "*" + n +"=" + m*n);

	  // ������
	  boolean q = 100 > 99;
	  System.out.println("100>99="+ q);

	  //����ת��

	    int x;
        double y;
        x = (int)34.56 + (int)11.2;  // ��ʧ����
        y = (double)x + (double)10 + 1;  // ��߾���
        System.out.println("x=" + x);
        System.out.println("y=" + y);

}
}