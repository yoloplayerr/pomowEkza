package helping;

public class Person{
	int weigth;
	int age;

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public Person(int weigth, int age) {
		super();
		this.weigth = weigth;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [weigth=" + weigth + ", age=" + age + "]";
	}

}
