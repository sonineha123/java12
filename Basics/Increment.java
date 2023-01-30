package in.co.rays.Basics;

public class Increment {
	public static void main(String[]args) {
		int a=10;
		System.out.println(a);//10
		int b=++a;//pre increment
		System.out.println(a);//11
		System.out.println(b);//11
		int c=10;
		System.out.println(c);//10
		int d=a++;//post increment
		System.out.println(c);//11
		System.out.println(d);//11
		
	}

}
