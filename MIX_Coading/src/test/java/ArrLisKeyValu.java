import java.util.Map;
import java.util.TreeMap;

public class ArrLisKeyValu {

	public static void main(String[] args) {

		TreeMap<Integer, String> ss = new TreeMap<Integer, String>();

		ss.put(0, "Shujon");
		ss.put(1, "Nazmul Huda");
		ss.put(2, "Trump");
		ss.put(3, "Apple News");
		ss.put(4, "Fox News");
		ss.put(5, "Sony News");

		System.out.println(ss); // print everything
		System.out.println(ss.get(1)); // print only specific

		for (Map.Entry vv : ss.entrySet()) {

			System.out.println(vv.getKey() + "=" + vv.getValue());

		}

	}

}
