
public class Speaker {
	
	private Writer writer;
	
	public Speaker(Writer writer) {
		this.writer = writer;
	}
	
	public void speak() {
		System.out.println(writer.getSpeach());
	}

}
