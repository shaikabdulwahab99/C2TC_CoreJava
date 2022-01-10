package Oops;


public class Static_Finalex {
		// instance or class variable
	     final static int a = 1024; 
		 int b;

		void func1() {
			final int c=10;
			System.out.println("class variables " + a + "" + b);
			System.out.println("local variable " + c);
			
			b = 56;
			System.out.println("class variables " + a + " " + b);

		}

		void func2() {
			System.out.println("class variables " + a + " " + b);
		}

		public static void main(String[] args) { 
			Static_Finalex obj = new Static_Finalex();
			System.out.println(obj.b);
			System.out.println(Static_Finalex.a);
			
			

	}

}
