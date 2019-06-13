import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testing{
	public static void main(String args[]){ 
		String [] data= {"A","B","C","D","A","B"};
		List<String> list=Arrays.asList(data);
		Set<String> set=new HashSet<String>(list);
		String [] result = new String[set.size()];
		set.toArray(result);
		for(String s:result) {
			System.out.print(s+",");
		}

	}  
}




