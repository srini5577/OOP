package Interface;

public class Bank2Class implements Bank1,MainBank{ // WE ARE ACHIVING MULTIPULE INHERITENCE. IS-A RELASHIONSHIP)
	
	public void credit() {
System.out.println("Bank1 credit");

	}
	public void debit() {
		System.out.println("Bank2 debit");

			}
	public void transfer() {
		System.out.println("Bank3 transfer");

			}
	// above 3 methods are OVERRIDING from Bank1 Interface
	
	public void Forex() {
		System.out.println("MainBank Method called");
		
		
		
	}
	public void forex2() {
		System.out.println("MainBank method called");
			
	}
	
	// Above 2 Methods OVERRIDING are from MainBank Interface
	
	
	public void credit1() {
		System.out.println("Bank2 credit");
	}
		public void credit2() {
			System.out.println("Bank2 credit");

				}
		// Above 2 Methods are Bank2 class methods



			}



