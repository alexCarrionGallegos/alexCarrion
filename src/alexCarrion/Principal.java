package alexCarrion;

public class Principal {

	private String argument = "Hello World!";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal p = new Principal();
		p.mostraArgument();
	}
	
	public String getArgument() {
		return argument;
	}
	
	public void setArgument(String argument) {
		this.argument = argument;
	}

	public void mostraArgument(){
		System.out.println(argument);
	}
	
}