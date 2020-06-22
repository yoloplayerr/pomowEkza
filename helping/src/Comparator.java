import helping.Person;

public class Comparator implements java.util.Comparator<Person> {
	//Сравниваются возраста людей,пусть возраст первого
	@Override
	public int compare(Person o1, Person o2) {	
		return o1.getAge()-o2.getAge();
	}

}