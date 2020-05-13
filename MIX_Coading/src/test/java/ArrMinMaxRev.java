import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrMinMaxRev {

	public static void main(String[] args) {
		
		
		List<Integer> num=new ArrayList<>();
		
		num.add(33);
		num.add(43);
		num.add(55);
		num.add(65);
		num.add(95);
		
		System.out.println(num);
		System.out.println(num.size());
		
		int minumumNumber=Collections.min(num);
		System.out.println("Minium Number = "+minumumNumber);
		
		int maxNumber=Collections.max(num);
		System.out.println("Maximum Number = "+maxNumber);
		
		Collections.reverse(num);
		System.out.println("Reverse order Number = "+num);
		

	}

}
