package Inheritence;

public class InherTest {

	public static void main(String[] args) {
		// this is called static poly  or compile time poly bcaz we can inherit parent class object with child class object
		Inher2 B = new Inher2();
		B.car();
		B.car1();
		B.car3();
		B.Bcar2();
		B.Bcar3();
		B.Bcar4();

	
     Inher1 C = new Inher1();
      C.car();
     C.car1();
      C.car3();
      
      Inher1 D= new Inher2();
      //child object can be reffered by parent class refference variable . This is called dynamic polymorphism or runtime polymor
      // Top Casting
      
      D.car();
      D.car1();
      D.car3();
      
      //Inher2 E= Inher1(); Is not possible. This is called Down casting
}
}