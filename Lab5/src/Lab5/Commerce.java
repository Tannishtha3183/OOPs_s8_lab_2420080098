package Lab5;
import java.util.*;
public class Commerce
{
	public static void main(String[] args)
	{
		OnlineOrder onlineOrder = new OnlineOrder();
				        onlineOrder.printDetails();
				    }
				}

				class Order
				{
				    void printDetails() 
				    {
				        System.out.println("Order ID: 12345");
				        System.out.println("Order Date: 2025-08-23");
				    }
				}

				class OnlineOrder extends Order 
				{
				    void printDetails() 
				    {
				        super.printDetails();
				        System.out.println("Delivery Address: 456 E-Commerce St.");
				        System.out.println("Expected Delivery: 2025-08-28");
				    }
				}