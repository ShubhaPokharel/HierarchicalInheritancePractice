class A{   //parent class
	void money(){
		System.out.println("1 million dollars"); 
	}	
}
class B extends A{  //child class
	void clothes(){
		System.out.println("The child gets clothes");
	}

}

class C extends A{
	void bunny(){
		System.out.println("Bunny");
	}
}

class D extends A{
	public static void main(String[] args){
		 A a = new A();
		 a.money(); 
		System.out.println("*******************************");
		 D d = new D();
		 d.money();


	}
}