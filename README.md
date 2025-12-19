# 📦 Product Inventory Management – Java OOP Project  

![Java](https://img.shields.io/badge/🖥_Language-Java_17-orange?logo=openjdk)
![IDE](https://img.shields.io/badge/💻_IDE-Eclipse-blue?logo=eclipse)
![Application](https://img.shields.io/badge/📦_Application-Console-green)
![Concepts](https://img.shields.io/badge/📚_Concepts-OOP_Classes%2C_Objects%2C_Encapsulation-red)
![Status](https://img.shields.io/badge/✅_Status-Completed-brightgreen)
![Last Commit](https://img.shields.io/badge/🕒_Last_Commit-19/12/2025-yellow)

---

## 🌟 Project Highlights  

* ✅ Implements **core Java Object-Oriented Programming (OOP)** concepts  
* ✅ Demonstrates **real-world inventory and product management logic**  
* ✅ Simple and clean **console-based Java application**  
* ✅ Suitable for **college projects, viva, and Java fundamentals practice**  
* ✅ Organized using **Eclipse standard project structure**  

---

## 📌 Project Overview  

The **Product Inventory Management** project is a **Core Java console application** designed to simulate how a basic inventory system works in retail stores or warehouses. It focuses on managing **products**, storing them inside a **store**, and executing inventory-related operations through a main application class.  

The project is intentionally kept **simple and beginner-friendly**, while still following **industry-style separation of concerns**. Each class has a clear responsibility, making the code easy to understand, maintain, and extend in the future.  

This type of structure is commonly used in **backend systems** before integrating databases, user interfaces, or web frameworks.  

---

## 🎯 Real-Life Context  

Inventory management systems are used daily by to track available products, manage stock, and control store operations.  

In real systems:  

* A **Product** represents an item sold in the store  
* A **Store** manages multiple products  
* An **Application class** controls program execution  

This project follows the same conceptual design, but at a **learning level**.  

---

## 📂 Project Structure  

```text
Product-Inventory-Management
│
├── src
│   └── Product_Inventory
│       ├── InventoryApp.java
│       ├── Product.java
│       └── Store.java
│
├── bin
│   └── Product_Inventory
│       ├── InventoryApp.class
│       ├── Product.class
│       └── Store.class
│
├── .settings
├── .classpath
└── .project
```

---

## 🧠 OOP Concepts Demonstrated  

| Concept                   | How It Is Used                        | Real-Life Mapping                     |
| ------------------------- | ------------------------------------- | ------------------------------------- |
| 🧬 Class & Object         | Product, Store, InventoryApp classes  | Products and stores in retail systems |
| 🛡️ Encapsulation         | Private variables with public methods | Secure handling of inventory data     |
| 🧱 Separation of Concerns | Model, logic, and execution separated | Used in enterprise applications       |
| 🔁 Reusability            | Product objects reused in store       | Same item model reused across systems |

---

## 📝 Class Responsibilities  

### 🔹 Product.java (Model Class)  

* Stores product details such as name and price  
* Represents a **single product entity**  
* Acts as a data holder with controlled access  

**Industry Example:**  
Represents a product record in inventory databases or ERP systems.  

---

### 🔹 Store.java (Management Class)  

* Manages product-related operations  
* Stores and displays product information  
* Acts as an inventory container  

**Industry Example:**  
Similar to store or warehouse service layers that manage product collections.  

---

### 🔹 InventoryApp.java (Main Application Class)  

* Entry point of the program  
* Creates objects and executes logic  
* Controls overall program flow  

**Industry Example:**  
Equivalent to a backend controller or service runner.  

---

## 🖥️ Sample Output (Console)  

```
------ Product Inventory System ------
Product Name : Laptop
Price        : 50000
-------------------------------------
```

*(Output may vary depending on implementation logic)*  

---

## ▶️ How to Run the Project  

1. Clone or download the repository  
2. Open **Eclipse IDE**  
3. Import as **Existing Java Project**  
4. Navigate to:  

   ```
   src → Product_Inventory → InventoryApp.java
   ```
5. Right-click → **Run As → Java Application**  

---

## 🚀 Future Enhancements  

📌 Add multiple product handling using arrays or ArrayList  
📌 Accept user input using Scanner  
📌 Add stock quantity and availability status  
📌 Store inventory data using files or databases  
📌 Develop GUI using JavaFX or Swing  
📌 Extend project to a web-based inventory system  

---

## 🎓 Learning Outcomes

* Strong understanding of **Java OOP fundamentals**  
* Clear idea of **model and management classes**  
* Exposure to **real-world inventory system design**  
* Ability to design structured Java applications
* Confidence to extend projects further
