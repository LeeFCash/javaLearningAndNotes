public class Human {
	String name;
	String canDo;
	int age;
	double weight;
	/*
	 public String name;
	 static String name;
	 private String name;
	 */
	/*
	 abstract class  cannnot be instantiated but can have subclass
	 abstract void go(); # does not have a body 
	# Need to override is 
	void go() {# body done this way if I understand right 
	}
	*/
	/* I think this will auto give's what is in Human to car 
public class Car extends Human{
	...
}
	 */
	/*
	 supper();// means perant class 
	 supper(name,age);// I think makes "this.name = name;..." be done in other file
	when toString()    return super.toString()+this.name  // I think 
	 */
	// constructors listed like this is "overloaded constructors" 
	Human(String name,int age,double weight,String canDo){// constructor
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.canDo = canDo;
	}
	Human(String name,int age,double weight){// constructor
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	Human(String name,int age){// constructor
		this.name = name;
		this.age = age;
	}
	Human(String name){// constructor
		this.name = name;
	}
	//
	public String toString() {// can be used to make toString() work
		String stringName = name;
		return stringName;
	}
	public String toStringCanDo() {// name of what to call to get the canDo as string which is toStringCanDo()
		String stringCanDo = canDo;
		return stringCanDo;
	}
	//
	void doing() {
		System.out.println(this.name+" doing something");
	}
	void nothing() {
		System.out.println(this.name+" doing nothing");
	}
}
