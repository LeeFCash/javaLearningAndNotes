import java.util.Scanner; // this is how we can get other tools that can help us make make what we want to
import java.awt.Color; // color
import javax.swing.JFrame; // for GUI
import javax.swing.*; // for all GUI stuff I think
import java.io.FileWriter; // for file writer 
import java.io.File; // to find / check and delete files
import java.io.*;// import all in java.util
import java.util.InputMismatchException;
import java.io.IOException;// trackor I think 
//import java.util.ArrayList; // for arrayList 
//import java.util.Random;
import javax.swing.JOptionPane; // for makeing GUI pane I think ( keep this )
/*
The import java.util.*; statement in Java imports all the public classes, interfaces, and enums in the java.util package. This is a wildcard import that allows you to use any class from the java.util package without explicitly importing each one individually. However, it does not import subpackages (e.g., java.util.concurrent or java.util.function) or non-public members.
*/
// link to what I am using to learn - https://youtu.be/xk4_1vDrzzo?si=1dAL7H_JxT_xeWfW 
public class LearningMain {
//	main methud down what is runned when doing java Main.java command if I understand correctly
	public static void main(String[] args) {
		// a comment
		// down is the console.log("hello") of javascript in java
		//System.out.print("hello");
		//System.out.print("hello \nLeeCash");
		//the \n is a new line indacator putting what ever after in new line
		//System.out.println("hello");
		//System.out.print("LeeCash");
		// if typed "println" instead of "print" it will add new line after the text ends
		// \t will add a tab "like if you pressed the tab button"
		// \ can also make something like "" doable by doing \"\"
		/* like in javascript this type of comment works */
		//int x; //declaration
		//x = 123; //assignment 
		// both 2 lines up can be done in one line by "int x = 123;"
		//int x = 123; //initialization
		//System.out.println(x); // will display 123
		//System.out.println("A number is:\t"+x); // will display "A number is:		123"
		// long for longer int numbers "long x = 123456789;"
		// byte for smaller int numbers "byte x = 127;" 127 and below 
		//double y = 3.14;
		//System.out.println(y);
		//float y = 3.14f; // f is required 
		//System.out.println(y);
		// both float and double are used to store numbers like 1.1, 1.3434, 1233.343435
		//boolean z = false; // or true
		//System.out.println(z);
		//char symbol = '@'; // for symbol
		//String s = "something"; //for a string that is a word or words
		//String s = "water";
		//String x = "or no";
		//String z = s; //will be whatever s is
		//System.out.println(z);
		//Scanner askUser = new Scanner(System.in); // need "java.util.Scanner" to work
		//askUser.nextLine(); // may be needed to fix skipping of after input uses 
		//System.out.println("what is your name?");
		//String name = askUser.nextLine(); // will not ask user anything untill this line
		//System.out.println("hello "+name+".");
		//friends = friends - 2; // can be used to add, take away, time, divide a var/int also if you have "friends++" or "friends--" it will add or take one from int also if doing "frends = friends / 3" you may need "friends = (double) friends / 3" instead
		//
		/*
		double x = 3.14;
		double y = -10;
		double w = 10;
		double z = Math.min(x, y); // what ever is lower is z 
		double c = Math.sqrt(w);  
		double v = Math.round(x);  
		double b = Math.ceil(x); // same as round but it is up 
		double n = Math.floor(x); // same as round but it is down 
		System.out.println(z);
		System.out.println(c);
		System.out.println(v);
		System.out.println(b);
		System.out.println(n);
		*/
		/* import the Random util
		Random random = new Random();
		int x = random.nextInt(); // to get random number
		int w = random.nextInt(6)+1; // to get random number that is 1 to 6 but if you take away the "+1" it will be 0 to 5 
		double y = random.nextDouble(); // to get random number in 0 to 1 like 1.5555556
		boolean z = random.nextBoolean(); // to get random true or false 
		System.out.println(x);
		*/
		/*
		// var.equals(var) if you want to have it be not equal then add "!" at beginning 
		int age = 18;
			if(age>=18) {
			System.out.println("worked 1");
		} else {
			System.out.println("worked 2");
		}
		*/
		/* switch
		String yes = "yes";
		switch(yes) {
			case "": System.out.println("not yes");
			break;
			case "yes": System.out.println("is yes");
			break;
			case "no": System.out.println("not yes");
			break;
//			case "yes": System.out.println("yes I know"); // will error if more of same
//			break;
//			case "yes": System.out.println("no yes no");
//			break;
			default: System.out.println("not yes or no was found");
		}
		*/
		/*
		logical operators = used to connect 2 or more expressions
		&& = if blank and blank is true to work
		|| = one or the other needs to be true
		! = if it is used with equel than means not equel
		Scanner askUserSomething = new Scanner(System.in); // think about it and I think in is the input while the .out is the output 
		String name = "";
		// loop with isBlank
		while(name.isBlank()) {
		System.out.print("what is your name:\t");
		name = askUserSomething.nextLine();
		}
		if did 
		do{
		code
		}while(name.isBlank()); // it will do the code before checking if it should 
		// forloop
		for(int i=0; i<=10; i++) {
		code runs 11 time start at index of 0
		// i++ and i-- are the same but one adds to i 1 while other takes 1 (you may be able to do i+2 to add to)
		}
		*/
		//String[] names = {"Lee", "Franklin", "Cash"};
		//names[0] = "Name"; // will change index 0 from Lee to Name
		//System.out.println(names[0]);
		//String[] Names = new String[3]; // making 4 strings with null 
		//Names[0] = "Leeeeeeeeeeee";
		//System.out.println(Names[0]);
		//String[][] userNames = new String[3][3];
		//userNames[2][2] = "Lee";
		//System.out.println(userNames[2][2]);
		//System.out.println(userNames[1][1]);
		/*
		String[][] something = { 
						{"L", "E", "E"},
						{"F", "."},
						{"C", "A", "S", "H"},
					};
		for(int i=0; i<something.length; i++) {
			System.out.println();
			for(int j=0; j<something[i].length; j++) {
				System.out.print(something[i][j]+" ");
			}
			System.out.println();
		}
		*/
		/*
		String name = "bro";
		boolean resultBoolean = name.equals("Bro"); // is it the same
		char resultBoolean2 = name.charAt(0); // what is at index 0 
		int resultBoolean3 = name.indexOf("o"); // where is o in bro
		boolean resultBoolean4 = name.isEmpty(); // is there anything 
		// ".toLowerCase();" and "toUpperCase();"
		// ".trim(); removes all empty space"
		String resultBoolean5 = name.replace('b', 'B'); // did the b change to B in bro
		System.out.println(resultBoolean);
		System.out.println(resultBoolean2);
		System.out.println(resultBoolean3);
		System.out.println(resultBoolean4);
		System.out.println(resultBoolean5);
		*/
		/*
		when doing 
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "bro";
		then you can do 
		if(b=="@"){}
		I think if I understood correctly 
		*/
		/*
		ArrayList<String> food = new ArrayList<String>(); // need import java.util.ArrayList;
		food.add("pizza");
		food.add("hamburger");
		food.add("chicken");
		ArrayList<String> t = new ArrayList<String>(); // need import java.util.ArrayList;
		t.add("pork");
		t.add("beef");
		ArrayList<ArrayList<String>> f = new ArrayList();
		f.add(food);
		f.add(t);
		//food.set();
		//food.remove();
		//food.clear();
		for(int i=0; i<food.size(); i++){
			System.out.println(food.get(i)); // get allows you to get a letter from string or word from array
		}
		System.out.println(food);
		System.out.println(t);
		System.out.println(f);
		System.out.println(f.get(0).get(0));
		*/
		/*
		//String[] animals = {"cat", "dog", "rat", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		for(String i : animals){
			System.out.println(i);
		}
		*/
		// %d is for int 
		// %b to show boolean 
		// %c to show char
		// %f for Double
		// %10s is for putting 10 spaces if %-10s than it is after not before  
		// %.2f this will limit the 1000.00000000 to 1000.00
		// %20f is "                    1000.00000000"
		// %+f is "+1000.00000000" and %-f "-1000.00000000"
		// %,f is "1,000.00000000"
		//System.out.printf("this is a format string %d",123);
		//System.out.printf("this is a format string %d",123.2);
		//System.out.printf("this is a format string %d",123);
		//System.out.printf("this is a format string %d",123);
		//System.out.printf("this is a format string %d",123);
		//System.out.printf("this is a format string %d",123);
		//System.out.printf("this is a format string %d",123);
		//System.out.printf("this is a format string %d",123);
		// "final var" cannot be changed 
		/* // to get working in terminal(new .class files are needed) when using more than one file do javac on all files than do java Main "note no .java"
		// or make it to use Getters and only have the other file "Car.java" be compiled by javac Car.java to the output of "Car.class"
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		System.out.println(myCar1.getMake());
		System.out.println(myCar1.getModel());
		System.out.println();
		System.out.println(myCar2.getMake());
		System.out.println(myCar2.getModel());
		*/
		/*
		// In Java, if a constructor (or method) does not have an explicit access modifier (like public, private, etc.), it defaults to package-private (accessible only within the same package). whitch means you will need to do "javac Human.java" then "java Main" note without .java
		Human human1 = new Human("Lee",21,70);
		Human human2 = new Human("Cash",21,70);
		System.out.println(human1.name);
		System.out.println(human2.name);
		//
		human1.doing();
		human2.nothing();
		*/
		/* 
		//Human human1 = new Human("Lee",21,70);
		//Human human2 = new Human("F",21);
		//Human human3 = new Human("Cash");
		//Human test = new Human("some",21,70,"thing");
		//System.out.println(human1.name+" "+human1.age+" "+human1.weight);// has all
		//System.out.println(human2.name+" "+human2.age+" "+human2.weight);// has name and age but weight is 0.0 due to it not having one 
		//System.out.println(human3.name+" "+human3.age+" "+human3.weight);// has only name and due to that everything else is 0 or 0.0
		//
		//System.out.println(human2.toString());// only gives name
		//System.out.println(test.toStringCanDo());// only gives canDo
		Human[] arrayOfObjectsMaybeHuman = {
			new Human("Lee",21,70),
			new Human("F",21),
			new Human("Cash"),
			new Human("some",21,70,"thing")};
		//System.out.println(human1.name+" "+human1.age+" "+human1.weight);// has all
		System.out.println(arrayOfObjectsMaybeHuman[3].canDo);// gives thing from test
		//
		//human1.doing();
		//human2.nothing();
		*/
		/*
		encapsulation = attributes of a class will be hidden or private, can be accessed only through methods (getters and setters) (private if no reason )
		*/
		//Car car = new Car("car model","car model",2022);
		//Car car2 = new Car("car mol","car mo",20);
		//car2.copy(car); // from the Car file
		//Car car2 = new Car(car); // copy and make together need file Car
		//car = car2; // this acts like if you have 1 car but is shared by 2 vars ( same address )
		//System.out.println(car2.getYear());
		//Rabbit rabbit = new Rabbit();
		//Hawk hawk = new Hawk();
		//hawk.hunt();
		//rabbit.flee();
		// polymorphism = "greek word for poly - "many", morph - "form" the ability of an object to identify as more than one type "
		/*
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new boat();
		//
		Vehicle[] racers = {car,bicycle,boat};
		for(Vehicle x : racers) {
			x.go();// if the code was set up this would run .go(); for all in array racers that is a Vehicle
		}
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		System.out.println("pick 1 or 2");
		int choice = scanner.nextInt();
		if(choice==1) {
			animal = new Dog();
			animal.speak();
		}
		if(choice==2) {
			animal = new Cat();
			animal.speak();
		}
		if(choice != 1 && choice != 2) {
			animal = new Animal();
			animal.speak();
		}
		*/
		/*
		// exception = an event that occurs during  the execution of a profram that,
		//             disrupts the normal flow of instructions 
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("type 2 number but press enter after first : will be divided ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e){
		System.out.println("problem maybe try not entering 0");
		}
		catch(InputMismatchException e){// import java.util.InputMismatchException; needed
		System.out.println("problem maybe try not entering a word or letter");
		}
		catch(Exception e){
			System.out.println("error /?!{|}>,.<'gsoeuirfgf;laekrjdbga;eruej something");
		}
		finally {
			System.out.println("alwaysssssssssssssss");
		}
		*/
		/* // audio stuff not tested by me // need something like scanner 
		import javax.sound.sampled.*;
		public static void main(String[] args){
			File file = new File("Level_Up.wav");
			AudioInputStream audieStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			(audioStream);
			clip.start();
		}
		*//*
		try{
		File file = new File("testFile.txt");// path to file or same project dir 
		FileWriter fileW = new FileWriter("ttestFile.txt");// path to file or same project dir 
		FileReader reader = new FileReader("ttestFile.txt");// path to file or same project dir 
//		if(file.exists()){
//			System.out.println("WHAT I HAVE A TEST FILE");
//			System.out.println(file.getPath());
//			System.out.println(file.getAbsolutePath());
//			System.out.println(file.isFile());
//			file.delete();
//		}
		fileW.write("this is a test");
		fileW.write("\nthis is a test2");
		fileW.write("\nfor reader testing 123");
		//fileW.append("\nthis is a test3 was appended ");
		fileW.close();
		int data = reader.read();
		while(data != -1) {
			System.out.print((char)data);// puts what is in the file
			//System.out.print(data);// puts numbers or something
			data = reader.read();
		}
		reader.close();
		}
		catch(FileNotFoundException e){
		e.printStackTrace();
		}
		catch(IOException e){
		e.printStackTrace();
		}
		*/
		/*
		to keep them apart 1
		*/
		thePC(); //"acts like a function in javascript" by video linked at top this is a method not a function "in methud static void thePC(String name){this is what it will be like if I gave a var to it}" 
		//double x = add(1.0,2.0); // // overloaded methods = methods that share the same name but have different perameters 
	}
	static int add(int a, int b){
		System.out.println("this is overloadad method #1");
		return a + b;
	}
	static int add(int a, int b, int c){
		System.out.println("this is overloadad method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d){
		System.out.println("this is overloadad method #3");
		return a + b + c + d;
	}
	static double add(double a, double b){
		System.out.println("this is overloadad method #4");
		return a + b;
	}
	static double add(double a, double b, double c){
		System.out.println("this is overloadad method #5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d){
		System.out.println("this is overloadad method #6");
		return a + b + c + d;
	}
	static void thePC(){
		String password = JOptionPane.showInputDialog("what is the password?"); //uses tool to open password window and stores input to password string
		System.out.println(password); // will show password typed by user in terminal 
		// if I want a int I do "int age = Integer.parseInt(JOptionPane.showInputDialog("enter your pin code"));"
		String openPass = "open";
		if(!password.equals(openPass)) {
		JOptionPane.showMessageDialog(null, "password you have entered is "+password+".\nyou are not welcomed in.");
		System.exit(0);
		}
		JOptionPane.showMessageDialog(null, "password you have entered is "+password+".\nyou are welcomed in.");
		/*
		JFrame window = new JFrame();
		window.setTitle("PC app also for learning"); // when using window manager this does not show or at least on hyprland 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit=(close it), HIDE=(go to background), DO_NOTHING=(do nothing), DISPOSE_ON_CLOSE=(which disposes of the window (frees its resources) but may not terminate the application if other windows remain open.)
		window.setResizable(true);
		window.setSize(500,500);
		window.setVisible(true); // make window visible 
		//ImageIcon image = new ImageIcon("logo.png")// for icon change for window 
		//window.setIconImage(image.getImage()); // change icon 
		window.getContentPane().setBackground(new Color(0,0,0));// Color.BLACK
		*/
		MyWindow window = new MyWindow();
	}
}
