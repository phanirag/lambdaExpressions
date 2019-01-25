
package methodReferencing;

import java.util.Arrays;
import java.util.List;

interface A{
	int sum(int i,int j);
}

interface B{
	void show(int i,int k);
}

class Xyz{
	int add(int a,int b){
		return a+b;
	}
}
public class methodReferencing {

	public static void main(String[] args) {
		A a=new Xyz()::add; // method referencing for instance class
		System.out.println(a.sum(10, 20));

		B b = (i,k) -> System.out.println("Hello : "+i+" Second param : "+k );
		b.show(9,10);	
																																
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		values.forEach(i ->System.out.println(i)); // Counsumer Interface
	}

}
