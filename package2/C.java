package package2;
import package1.*;

public class C {
	public String publicMessage = "This is public"; // public
	private String privateMessage = "This is private"; // private only in this class can it be used.
	protected String protectedMessage = "This is public p" // only for sub classes no one else 
	String defaultMessage = "this is the default"; // no modifier I think 
	/*
	|Modifier   |Class|Package|SubClass|Word|
	|public     |Y    |Y      |Y       |Y   |
	|protected  |Y    |Y      |Y       |N   |
	|no Modifier|Y    |Y      |N       |N   |
	|private    |Y    |N      |N       |N   |
	*/
}
