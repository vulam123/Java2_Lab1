package exercise3;

import java.util.Scanner;

public class Student extends Person {
	private double mark;
	private String grade;

	public Student(String id, String name, int age, double mark) {
		super(id, name, age);
		this.mark = mark;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (this.mark >= 8) {
			this.grade = "distinction";
		} else if (this.mark >= 7) {
			this.grade = "credit";
		} else if (this.mark >= 5) {
			this.grade = "pass";
		} else if (this.mark >= 0) {
			this.grade = "failed";
		}
	}

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
		System.out.print("mark: ");
		this.mark = sc.nextInt();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print(toString());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", mark=" + mark + ", grade=" + grade + "]";

	}

}
