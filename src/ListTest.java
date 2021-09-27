import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<>();
		list.add(new Person("jack", 20));
		list.add(new Person("mike", 25));
		list.add(new Person("tom", 30));
		
		list=list.stream().skip(2).collect(Collectors.toList());
		for(Person p:list) {
			System.out.println(p);
		}
	}

}
