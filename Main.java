//import java.util.Scanner; // this is how we can get other tools that can help us make make what we want to
import java.util.Random;
import javax.swing.JOptionPane; // for makeing GUI pane I think ( keep this )
// link to what I am using to learn - https://youtu.be/xk4_1vDrzzo?si=1dAL7H_JxT_xeWfW 
public class Main {
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
		// switch
		String yes = "yes";
		switch(yes) {
			case "": System.out.println("yes");
			break;
		}
		/*
		to keep them apart 1
		*/
		/*
		String password = JOptionPane.showInputDialog("what is the password?"); //uses tool to open password window and stores input to password string
		System.out.println(password); // will show password typed by user in terminal 
		// if I want a int I do "int age = Integer.parseInt(JOptionPane.showInputDialog("enter your pin code"));"
		String openPass = "open";
		if(!password.equals(openPass)) {
		JOptionPane.showMessageDialog(null, "password you have entered is "+password+".\nyou are not welcomed in.");
		System.exit(0);
		}
		JOptionPane.showMessageDialog(null, "password you have entered is "+password+".\nyou are welcomed in.");
		*/
	}
}
