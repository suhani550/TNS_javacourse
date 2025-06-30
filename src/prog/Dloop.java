package prog;

public class Dloop {

	public static void main(String[] args) {
	for(int i=10;i<=20;i++) {
		System.out.println("table of " +i+":");
		for(int j=1;j<=10;j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		}
		System.out.println();
	}

	}

}
