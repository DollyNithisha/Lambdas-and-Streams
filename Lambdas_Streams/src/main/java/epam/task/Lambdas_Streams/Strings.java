package epam.task.Lambdas_Streams;
import java.util.*;
import java.util.stream.*;

public class Strings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of strings:");
		int n = s.nextInt();
		List<String> strngs = new ArrayList<String>();
		System.out.println("Enter "+n+" number of strings:");
		s.nextLine();
		for(int i = 0;i < n;i++){
			String s1 = s.nextLine();
			strngs.add(s1);
		}
		List<String> result = strngs.stream().filter(String->(String.length() == 3) && String.charAt(0) == 'a')
				.collect(Collectors.toList());
		if(!result.isEmpty())
		{
			System.out.println("The strings that are starting with letter 'a' and have length 3 are ");
			result.forEach(x->System.out.println(x));
		}
		else {
				System.out.println("There are no such strings that start with letter 'a' and having length 3 in the given list of strings ");
			}
	}

}
