package Product_Inventory;

import java.util.*;
public class InventoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Store operation = new Store();
		
		int choice;
		do
		{
			System.out.println("\n====== College Menu ======");
            System.out.println("1. Add Product Details. ");
            System.out.println("2. Display All Product Details.");
            System.out.println("3. Search Product Using:\r\n"+ "	1.id\r\n"+ "	2.name");
            System.out.println("4. Update Product Using:\r\n" + "	1.id → update quantity.\r\n" + " 2.name → update price.");
            System.out.println("5. Delete Product Using:\r\n" + "	1.Category\r\n" + "	2.Price < 100.");
            System.out.println("6. Sort Product:\r\n" + "	1.By id ascending.\r\n" + "	2.By price descending.");
            System.out.println("7. Display the Most Expensive Product.");
            System.out.println("8. Display products with price range 1000–5000.");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();	
            
            switch(choice)
            {
            		case 1:
            			operation.addProduct();
            			break;
            			
            		case 2:
            			operation.displayProduct();
            			break;
            			
            		case 3:
            			operation.searchProduct();
            			break;
            			
            		case 4:
            			operation.updateProduct();
            			break;
            			
            		case 5:
            			operation.deleteProduct();
            			break;
            			
            		case 6:
            			operation.sortProduct();
            			break;
            			
            		case 7:
            			operation.expensiveProduct();
            			break;
            			
            		case 8:
            			operation.rangeProd1000to5000();
            			break;
            			
            		case 9:
            			System.out.println("Exit");
            			break;
            			
            		default:
            			System.out.println("Invalid choice");
            }
		}
		while(choice != 10);
	}

}
