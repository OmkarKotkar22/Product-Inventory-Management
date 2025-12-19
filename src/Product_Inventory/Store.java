package Product_Inventory;

import java.util.*;
public class Store {
	private Product p[] = new Product[50];
	private int count = 0;
	private Scanner sc = new Scanner(System.in);
	
	public void addProduct()
	{
		if(count < p.length)
		{
			p[count] = new Product();
			
			System.out.println("Enter the Product Name: ");
			p[count].setName(sc.next());
			
			sc.nextLine();
			System.out.println("Enter the Product Category: ");
			p[count].setCategory(sc.next());
			
			System.out.println("Enter the Product Price: ");
			p[count].setPrice(sc.nextInt());
			
			System.out.println("Enter the Product Quantity: ");
			p[count].setQuantity(sc.nextInt());
			
			count++;
		}
		else
		{
		System.out.println("There is no Product Details Added");
		}
	}
	
	public void displayProduct()
	{
		if(count == 0)
		{
			System.out.println("No Data is Available");
		}
		
		System.out.printf("%-5s %-10s %-10s %-10s %-5s %n", "Id", "Name", "Category", "Price", "Quantity");
		for(int i = 0; i < count; i++)
		{
			p[i].display();
		}
	}
	
	public void searchProduct()
	{
		int choice;
		do 
		{
			System.out.println("Search Product by using Id: ");
			System.out.println("Search Product by using Name: ");
			System.out.println("Enter the Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Id:");
					int id = sc.nextInt();
					boolean found = true;
					for(int i = 0; i < count; i++)
					{
						if(p[i].getId() == id)
						{
							p[i].display();
							found = false;
						}
					}
					if(found)
					{
						System.out.println("No Item is found by this Id");
					}
					break;
					
				case 2:
					System.out.println("Enter the Product Name:");
					String name = sc.next();
					boolean flag = true;
					for(int i = 0; i < count; i++)
					{
						if(p[i].getName().equalsIgnoreCase(name))
						{
							p[i].display();
							flag = false;
						}
					}
					if(flag)
					{
						System.out.println("No Item is found by this Name");
					}
					break;
					
				default: 
					System.out.println("Invalid Choice");
					break;
			}
			
		}while(choice != 2);
	}
	
	public void updateProduct()
	{
		int choice;
		do
		{
			System.out.println("By using Id Update Product Quantity: ");
			System.out.println("By using Name Update Product Price: ");
			System.out.println("Enter the Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Product Id: ");
					int id = sc.nextInt();
					boolean flag = true;
					for(int i = 0; i < count; i++)
					{
						if(p[i].getId() == id)
						{
							flag = false;
							System.out.println("Enter the Quantity: ");
							p[i].setQuantity(sc.nextInt());
						}
					}
					if(flag)
					{
						System.out.println("No Id is match");
					}
					break;
					
				case 2:
					System.out.println("Enter the Product Name: ");
					String  name = sc.next();
					boolean flaged = true;
					for(int i = 0; i <  count; i++)
					{
						if(p[i].getName().equalsIgnoreCase(name))
						{
							System.out.println("Enter the Product Price: ");
							p[i].setPrice(sc.nextInt());
							flaged = false;
						}
					}
					if(flaged)
					{
						System.out.println("No product name match");
					}
					break;
					
					default: 
						System.out.println("Invalid Choice");
						break;
			}
			
		}
		while(choice != 2);
	}
	
	public void deleteProduct()
	{
		int choice;
		do
		{
			System.out.println("Delete product by using Id");
			System.out.println("Delete product by using name: ");
			System.out.println("Enter the Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
					System.out.println("Enter the present product id: ");
					int id = sc.nextInt();
					boolean found = true;
					for(int i = 0; i < count; i++)
					{
						if(p[i].getId() == id)
						{
							for(int j = i; j < count; j++)
							{
								p[j] = p[j+1];
							}
							count--;
							found = false;
							System.out.println("Product Deleted");
							break;
						}
					}
					if(found)
					{
						System.out.println("Product Deleted Successfully");
					}
					break;
					
				case 2:
					System.out.println("Enter the present product Name: ");
					String name = sc.next();
					boolean founded = true;
					for(int i = 0; i < count; i++)
					{
						if(p[i].getName().equalsIgnoreCase(name))
						{
							for(int j = i; j < count; j++)
							{
								p[j] = p[j+1];
							}
							count--;
							found = false;
							System.out.println("Product Deleted");
							break;
						}
					}
					if(founded)
					{
						System.out.println("Product Deleted Successfully");
					}
			}
		}
		while(choice != 2);
	}
	
	public void sortProduct()
	{
		int choice;
		do
		{
			System.out.println("By id ascending");
			System.out.println("By price descending");
			System.out.println("Enter the Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
					for(int i = 0; i < count; i++)
					{
						for(int j = i; j < count; j++)
						{
							if(p[i].getId() > p[j].getId())
							{
								Product temp = p[i];
								p[i] = p[j];
								p[j] = temp;
							}
						}
					}
					System.out.println("Sorted by using id: ");
					displayProduct();
					break;
					
				case 2:
					for(int i = 0; i < count; i++)
					{
						for(int j = 0; j < count; j++)
						{
							if(p[i].getPrice() < p[j].getPrice())
							{
								Product temp = p[i];
								p[i] = p[j];
								p[j] = temp;
							}
						}
					}
					System.out.println("Sorted by using Price in decending form");
					displayProduct();
					break;
			}
		}
		while(choice != 2);	
	}
	
	public void expensiveProduct()
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < count; i++)
		{
			if(p[i].getPrice() > max)
			{
				max = p[i].getPrice();
			}
		}
		
		boolean found =true;
		for(int i = 0; i < count; i++)
		{
			if(p[i].getPrice() == max)
			{
				p[i].display();
				found = false;
				break;
			}
		}
		if(found)
		{
			System.out.println("No Expensive Product found");
		}
	}
	
	public void rangeProd1000to5000()
	{
		boolean flag = true;
		for(int i = 0; i < count; i++)
		{
			if(p[i].getPrice() > 1000 && p[i].getPrice() < 5000)
			{
				p[i].display();
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("No Product found in range 1000 to 5000");
		}
	}
}
