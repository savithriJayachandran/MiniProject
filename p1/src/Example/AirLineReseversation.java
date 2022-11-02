package Example;
import java.util.Scanner;
 class AmountException extends Exception{
	 AmountException(String str)
	 {
	 super(str);
	 }
 }
public class AirLineReseversation {
//Array of seats
	boolean[] flightSeats = new boolean[11];
	Scanner input = new Scanner(System.in);
	String name,address,dateofbirth,date;
	int firstclassAmount=4500;
	int economicclassSpare=3000;
	int idno;
	long phonenumber;
	
	public void start() throws AmountException
		{
		System.out.println("  *****WELCOME TO THE  AIRLINE RESERVATION SYSTEM!! *****" );
		System.out.println("Enter the number '1' for seat Booking '2' for cancellation and '3' is to exit the page ");
		int a=input.nextInt();
		switch(a)
		{
		case 1:
		{
			bookSeat();
			break;
		}
		case 2:
		{
			Cancellation();
			break;
		}
		case 3:
		{
			Exit();
			break;
			
		}
		default:
		{
			System.out.println("please enter the valuable input");		
		}
		}   
		}
		
	// Function for booking a seat in reservation system
	public void bookSeat() throws AmountException
	{
	//Asks user for his preferred class to travel
	System.out.println("CHENNAI to BANGALORE");
	System.out.println("Firstclass: "+ firstclassAmount);
	System.out.println("Economicclass: "+ economicclassSpare);
	System.out.println("ArrivalTime : 10 am");
	System.out.println("DepartureTime : 11.30 am");
	
	System.out.println("Choose Your preference : type '1' for First Class or '2' for Economy Class:");
	int pessangerClass = input.nextInt();
	if ( pessangerClass == 1 )
	{
	firstClassBooking();
	}
	else 
	{
	economyClassBooking();
	}
	}
	public void Cancellation() throws AmountException 
	{	
		String cname,cdate;
		int cidno;
		System.out.println(name + idno + date);
		System.out.println("Enter the cName : " );
	    cname=input.next();
		System.out.println("Enter the cidno : " );
		cidno=input.nextInt();
		System.out.println("Enter the cdate : " );
        cdate=input.next();
        if(name.equals(cname)) 
        {
        
        }
		if(date.equals(cdate)) {
			
		}
		if ( idno==cidno)
		{
			System.out.println("your succesfully cancelled: " );	
		}
		
	
		else 
		{
	    System.out.println("you are unable to cancelled the ticket now your inputs are not matched: " );
		}
		
		System.out.println("Thank you !!! " );
		start();
	}

		/*if(cname.equals(name)&& cidno==(idno) && cdate.equals(date));
		{
			System.out.println("your successfully cancelled: " );
		}*/
	public void Exit()
	{
		System.out.println("please log out whether you need to exit from this site#");
		System.out.println("Visit again for your needs....");
		System.out.println("Thanks for your visiting to this site!!!!");
		System.out.println("**Have a good day** ");
	}

	// Check and book for first class seating
	public void firstClassBooking() throws AmountException
	{
		
	for ( int cnt = 1; cnt <= 5; cnt++ )
	{
	//check if seat is available to allocate to user booking.
	if ( flightSeats[cnt] == false )
	{
	//book seat
		System.out.println("Enter the Name : " );
		name=input.next();
		
		System.out.println("Enter the idno : " );
		idno=input.nextInt();
		
		System.out.println("Enter the address : " );
		address=input.next();
		
		System.out.println("Enter the phonenumber : " );
		phonenumber=input.nextLong();
	    
		System.out.println("Enter the date : " );
		date=input.next();
		
		System.out.println("Enter the dateofbirth : " );
		dateofbirth=input.next();
	
	flightSeats[cnt] = true;
	System.out.println("Enter the amount");
	int c=input.nextInt();
	try {
		
	
	if(c==firstclassAmount) {
		System.out.printf("First Class Seat Booking: Seat# %d\n", cnt);
		break;
	}
	else {
		throw new AmountException("amount invalid");
	}}
	catch(AmountException e) {
		System.out.println(	" Amount mismatched");
		break;
	}
	}
	else if ( flightSeats[5] == true )
	{
	if ( flightSeats[10] == true)
	{
	//if both classes are fully booked
	System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
	}
	else
	{
	// provide passenger another available class option
	System.out.println("Sorry,First Class bookings are over. Would you like to opt for Economy class ? select '1' for Yes and '2' for No");
	int selection = input.nextInt();
	if ( selection == 1 )
	{
	economyClassBooking();
	start();
	}
	else
	{
	System.out.println("Next flight is scheduled in '3' hours.");
	System.exit(0);
	}
	}
	}
	}
	System.out.println("enter the number '1' to come back to the home page: ");
	int b=input.nextInt();
	if(b==1) {
		start();
	}
	}   

	// Check and book for economy class seating
	public void economyClassBooking() throws AmountException // assign an economy seat
	{
		
	for ( int cnt = 6; cnt <= 10; cnt++ )
	{
	if ( flightSeats[cnt] == false )
	{
		System.out.println("Enter the Name : " );
		name=input.next();
		
		System.out.println("Enter the idno : " );
		idno=input.nextInt();
		
		System.out.println("Enter the address : " );
		address=input.next();
		
		System.out.println("Enter the phonenumber : " );
		phonenumber=input.nextLong();
	
	    System.out.println("Enter the date : " );
		date=input.next();
		
		System.out.println("Enter the dateofbirth : " );
		dateofbirth=input.next();
	
	flightSeats[cnt] = true;
	System.out.println("Enter the amount");
	int c=input.nextInt();
	try {
	if(c==firstclassAmount) {
	System.out.printf("economy class seat booking :# %d\n", cnt);
	break;
	}
	else {
		throw new AmountException ("Amount invalid");
		
	}}
	catch(AmountException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		break;
	}}
	else if ( flightSeats[10] == true )
	{
	if ( flightSeats[5] == true)
	{
	System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
	System.exit(0);
	}
	else
	{
	System.out.println("Sorry, Economy Class seat bookings are over. Would you like to opt for first Class seat? press '1' for Yes and '2' for No");
	
	int selection = input.nextInt();
	if ( selection == 1 )
	{
	firstClassBooking();
	start();
	}
	else
	{
	System.out.println("Next flight is scheduled in 3 hours");
	System.exit(0);
	}
	}
	}
	}
	System.out.println("enter the number '1' to come back home page: ");
	int b=input.nextInt();
	if(b==1) {
		start();
	}
	}
	
	public static void main(String[] args) throws AmountException {
		// TODO Auto-generated method stub
		AirLineReseversation a=new AirLineReseversation();
	
	a.start();
}}
