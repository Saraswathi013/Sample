import java.util.*;
public class Test{
	public static void main(String[] args){
		Test test = () -> System.out.println("Math Opeartion.");
		test.mathOperation();
	}
}

@FunctionalInterface
interface Test{
	void mathOperation();
}