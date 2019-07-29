package Interface;

public class TestBank {

	public static void main(String[] args) {
		// In this cant create object to the Bank1
		// We can create object to the Bank2Class
		
		// if a class implemeting interface, its mandetory to overirde all methods of interface
		
		// if we have to access variable from Bank1 interface then we have to use class name and variable name
		
		System.out.println(Bank1.abc);
		
		
		
		Bank2Class G = new Bank2Class();
		G.credit();
		G.debit();
		G.transfer();
		
		//Above 3 methods are calling from Bank1 Interface
		
		G.credit1();
		G.credit2();
		// Above 2 methods are calling from Bank2Class 
		
		G.Forex();
		G.forex2();
		// Above 2 methods are calling from MainBank Interface
		
		
		Bank1 F= new Bank2Class();
		F.credit();
		F.debit();
		F.transfer();
		
		MainBank J = new Bank2Class();
		J.Forex();
		J.forex2();
		
	}

}
