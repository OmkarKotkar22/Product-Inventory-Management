package Product_Inventory;

public class Product {
	private static int counter = 0;
	private int id;
	private String name;
	private String category;
	private int price;
	private int quantity;
	
	public Product()
	{
		counter++;
		id = counter;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setCategory(String c)
	{
		category = c;
	}
	public String getCategory()
	{
		return category;
	}
	
	public void setPrice(int p)
	{
		price = p;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setQuantity(int q)
	{
		quantity = q;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public void display()
	{
		System.out.printf("%-5d %-10s %-10s %-10d %-5d %n", id, name, category, price, quantity);
	}
}
