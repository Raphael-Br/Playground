package streams;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

	String name;
	Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String sayHi() {
		return "Hello from " + this.getName();
	}

	@Override
	public String toString() {
		return Person.class.getSimpleName() +
				"{name='" + name + '\'' +
				", age=" + age +
				'}';
	}

}
