package entity;

public class People {
	private String name;
	private int age;
	
	public void talk(){
		System.out.println("this is a demo of git...");
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
}
