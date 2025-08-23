package Lab5;
import java.util.*;
public class Transportation {
	public static void main(String[] args)
	{
		Transport t1 = new Bus();
		Transport t2 = new Train();
		t1.ticketPrice();
		t2.ticketPrice();
		}
	}
class Transport 
{
	void ticketPrice()
	{
		System.out.println("Ticket price for transport");
		}
	}
class Bus extends Transport 
{
	void ticketPrice() 
	{
		System.out.println("Bus ticket price is $2");
		}
	}
class Train extends Transport
{
	void ticketPrice() 
	{
		System.out.println("Train ticket price is $5");
		}
	}
