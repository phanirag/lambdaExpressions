package methodReferencing;

interface C{ // fucntional interface ( interface which has one abstract class)
	void show();
}
/*1) We can implement the interface and override the method  
class H implements C{

	@Override
	public void show() {
		System.out.println("Hello");
	}
}*/

public class methodreferanceFlow {

	public static void main(String[] args) {
		
		/*1) We can create of object of the class and run the method
		 C u = new H();
		u.show();*/
		
		/*2) We can create a Annonymous Inner class which implemets interface 
		 C c = new C() {
			public void show(){
				System.out.println("Hello");
			}
			c.show();
		};*/
		/*3) We can wirte the class as this form also
		C c = () -> {
			System.out.println("Hello");
		};
		c.show();
		*/
		C c = () -> System.out.println("Hello");
		c.show();
		
	}
}
