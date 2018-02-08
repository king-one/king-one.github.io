public class DataStructure{
  public static void main(String[] args){
	  // 字符型
      char char1 = '这'; //单引号包裹
	  char char2 = '是';
	  System.out.println("网站的名字是：" + char1 + "---"+char2);

	  //整型
	  short a = 22;
	  int b = 022;
	  long c = 0x22L;
	  System.out.println("转化成十进制:x=" + a + ",y=" + b +",z=" + c);

	  // 浮点型

	  float m = 22.45f;
	  double n = 10;
	  System.out.println("计算乘积" + m + "*" + n +"=" + m*n);

	  // 布尔型
	  boolean q = 100 > 99;
	  System.out.println("100>99="+ q);

	  //类型转换

	    int x;
        double y;
        x = (int)34.56 + (int)11.2;  // 丢失精度
        y = (double)x + (double)10 + 1;  // 提高精度
        System.out.println("x=" + x);
        System.out.println("y=" + y);

}
}