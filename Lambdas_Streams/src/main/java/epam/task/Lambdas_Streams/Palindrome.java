package epam.task.Lambdas_Streams;
import java.util.*; 
import java.util.stream.IntStream; 

public class Palindrome {

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
		ArrayList<String> result=new ArrayList<String>();
        for(String i:strngs)
        {
        	String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                result.add(i);
        }
        if(!result.isEmpty()) {
            System.out.println("The strings that are palindrome are::");
            for(String i:result)
                System.out.println(i);
            }
            else
            	System.out.println("There are no palindrome strings in the given list of strings");
            	
        }

	}


