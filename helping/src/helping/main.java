package helping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
import fileWorks.FileWorks;

public class main {

	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person(21, 20));
		list.add(new Person(21, 22));
		list.add(new Person(21, 19));
		list.add(new Person(21, 10));
		LinkedList lk=new LinkedList();
		for(Person p: list){
			lk.addLast(p);
		}
		lk.log();
		
		
		
			
	}

}
