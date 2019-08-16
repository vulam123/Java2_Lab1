package exercise3;

import java.util.Scanner;

public class Person implements PersonExample {
	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	protected String id;
	protected String name;
	protected int age;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("id: ");
		this.id = sc.next();
		System.out.print("name: ");
		this.name = sc.next();
		System.out.print("age: ");
		this.age = sc.nextInt();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print(toString());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
