package prog;
import java.util.Scanner;

       class TicketBooking {
	    private String stageEvent;
	    private String customer;
	    private Integer noOfSeats;

	    // Default constructor
	    public TicketBooking() { }

	    // Parameterized constructor
	    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    public String getStageEvent() { return stageEvent; }
	    public void setStageEvent(String stageEvent) { this.stageEvent = stageEvent; }

	    public String getCustomer() { return customer; }
	    public void setCustomer(String customer) { this.customer = customer; }

	    public Integer getNoOfSeats() { return noOfSeats; }
	    public void setNoOfSeats(Integer noOfSeats) { this.noOfSeats = noOfSeats; }

	    // Cash payment
	    public void makePayment(Double amount) {
	        System.out.printf("Amount to be paid: %.1f (Cash)\n", amount);
	    }

	    // Wallet payment
	    public void makePayment(String walletNumber, Double amount) {
	        System.out.printf("Amount to be paid: %.1f (Wallet: %s)\n", amount, walletNumber);
	    }

	    // Credit Card payment
	    public void makePayment(String creditCard, String ccv, String name, Double amount) {
	        System.out.printf("Amount to be paid: %.1f (Credit Card: %s, Name: %s)\n", amount, creditCard, name);
	    }
	}

	public class mainn {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Stage Event:");
	        String stageEvent = sc.nextLine();

	        System.out.println("Enter Customer Name:");
	        String customer = sc.nextLine();

	        System.out.println("Enter Number of Seats:");
	        int noOfSeats = sc.nextInt();

	        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

	        System.out.println("Payment Method: 1.Cash 2.Wallet 3.Credit Card");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Enter Amount:");
	                double amount1 = sc.nextDouble();
	                booking.makePayment(amount1);
	                break;

	            case 2:
	                sc.nextLine(); // clear buffer
	                System.out.println("Enter Wallet Number:");
	                String walletNumber = sc.nextLine();
	                System.out.println("Enter Amount:");
	                double amount2 = sc.nextDouble();
	                booking.makePayment(walletNumber, amount2);
	                break;

	            case 3:
	                sc.nextLine(); // clear buffer
	                System.out.println("Enter Credit Card Number:");
	                String creditCard = sc.nextLine();
	                System.out.println("Enter CCV:");
	                String ccv = sc.nextLine();
	                System.out.println("Enter Card Holder Name:");
	                String name = sc.nextLine();
	                System.out.println("Enter Amount:");
	                double amount3 = sc.nextDouble();
	                booking.makePayment(creditCard, ccv, name, amount3);
	                break;

	            default:
	                System.out.println("Invalid choice");
	                break;
	        }

	        sc.close();
	    }
	}

