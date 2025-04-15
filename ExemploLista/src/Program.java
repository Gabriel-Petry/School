import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Lo");
		list.add("Vida");
		list.add("Mozão");
		list.add("Petry");
		list.add(2, "Perfeição");
		list.add(3, "Meu tudo");
		list.add(4, "Razão do meu viver");
		list.add(4, "Meu universo");
		list.add(1, "Lindona");
		list.add(5, "Minha");
		
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		//list.remove(2);
		//list.removeIf(x -> x.charAt(0) == 'L');
		
		/*for (String x : list) {
			System.out.println(x);
		}*/
		
		System.out.println("------------------------");
		
		System.out.println("Index of Meu tudo : " + list.indexOf("Meu tudo"));
		System.out.println("Index of Meu tudo : " + list.indexOf("Letiele"));
		
		System.out.println("------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		
		System.out.println(name);
		
	}

}
