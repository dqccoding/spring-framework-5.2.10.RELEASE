public class Person {
	String name;
	Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {

		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public void init(){
		this.age = 20;
		this.name= "zhangsan";
	}
	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
