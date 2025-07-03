package prog;

public class switchDemo {

	public static void main(String[] args) {
		char x='L';
		switch(x) {
		
		case 'l':
			System.out.println("This code contain letter");
		    break;
		case 'd':
			System.out.println("This code contain digits");
			break;
			
		case 's':
			System.out.println("This code contain symbols");
			break;
		
		case 'w':
			System.out.println("This code contain whitespace");
			break;
		
		default:
			System.out.println("This code doesnt contain symbols,digit,letters,whitespace");
			break;
			
		}
	}

}
