package java_4_Professionall.lesson_5.task_3;

public class User {
protected int age;
public String name;
private long id;
public User() {
}
public User(int age, String name, long id) {
	this.age = age;
	this.name = name;
	this.id = id;
}
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

}
