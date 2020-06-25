package epam.task.Lambdas_Streams;
import java.util.*; 
import java.util.stream.IntStream; 

public class Average {

	public static void main(String[] args) {
		System.out.println("The list of numbers are: 45,78,36,84,65,98,81");
		IntStream stream = IntStream.of(45,78,36,84,65,98,81); 
		OptionalDouble obj = stream.average(); 
		if (obj.isPresent()) { 
            System.out.println("Average = "+obj.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 

	}

}
