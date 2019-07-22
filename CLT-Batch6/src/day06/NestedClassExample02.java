package day06;

public class NestedClassExample02 {
	
	class MyInnerClass1 { // non-static inner class
		void myMethod1a() {
			System.out.println("I am in MyInnerClass1 --> myMethod1a");
		}
//		static void myMethod1b() { // compilation error, we can't write static method in non-static inner class
//			
//		}
	}
	
	static class MyInnerClass2 { // static inner class
		void myMethod2a() {
			System.out.println("I am in MyInnerClass2 --> myMethod2a");
		}
		static void myMethod2b() {
			System.out.println("I am in MyInnerClass2 --> myMethod2b");
		}
	}
	
	void access() {		
		class MyInnerClass3 { // method local inner class
			void myMethod3a() {
				System.out.println("I am in access --> MyInnerClass3 --> myMethod3a");
			}
//			static void myMethod3b() { // compilation error, we can't write static method inside non-static inner class
//				
//			}			
		}
		MyInnerClass3 RefMyInnerClass3 = new MyInnerClass3();
		RefMyInnerClass3.myMethod3a();
	}
	
	void accessAll() {
		MyInnerClass1 RefMyInnerClass1 = new MyInnerClass1();
		RefMyInnerClass1.myMethod1a();
		
		MyInnerClass2 RefMyInnerClass2 = new MyInnerClass2();
		RefMyInnerClass2.myMethod2a();
		MyInnerClass2.myMethod2b();
	}

	public static void main(String[] args) {
		
		NestedClassExample02 RefNestedClassExample02 = new NestedClassExample02();
		RefNestedClassExample02.accessAll();
		RefNestedClassExample02.access();

	}

}
