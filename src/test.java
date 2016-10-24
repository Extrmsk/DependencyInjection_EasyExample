
public class test {

	public static void main(String[] args) {
		Writer hello = new HelloSpeachWriter();
		Writer go = new GoSpeachWriter();
		Speaker sp1 = new Speaker(hello);
		Speaker sp2 = new Speaker(go);
		
		sp1.speak();
		sp2.speak();
	}

}
