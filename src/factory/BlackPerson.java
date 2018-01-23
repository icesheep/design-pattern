package factory;

public class BlackPerson implements Human{
	
	private String port;
	private int num;
	
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void getColor() {
		System.out.println("i'm black!");
	}

}
