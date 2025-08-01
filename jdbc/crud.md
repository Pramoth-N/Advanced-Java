
```java
import java.util.*;
import java.sql.*;

class Main {
    final static String url = "jdbc:mysql://localhost/ri_db";
    final static String user = "test";
    final static String password = "test123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int type = Integer.parseInt(sc.nextLine().trim());

            Connection connection = DriverManager.getConnection(url, user, password);
            switch (type) {
                case 1:
                    insert(sc, connection);
                    break;
                case 2:
                    update(sc, connection);
                    break;
                case 3:
                    select(connection);
                    break;
                default:
                    System.out.println("Invalid operation number. Please try again.");
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void insert(Scanner sc, Connection connection) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
            "INSERT INTO customer VALUES (?, ?, ?, ?, ?)"
        );
        stmt.setInt(1, Integer.parseInt(sc.nextLine()));
        stmt.setString(2, sc.nextLine());
        stmt.setString(3, sc.nextLine());
        stmt.setString(4, sc.nextLine());
        stmt.setString(5, sc.nextLine());

        stmt.executeUpdate();
        System.out.println("Customer record inserted successfully.");
        select(connection);
    }

    private static void update(Scanner sc, Connection connection) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
            "UPDATE customer SET name = ?, contact_information = ?, subscription_plan = ?, payment_history = ? WHERE customer_id = ?"
        );
        stmt.setInt(5, Integer.parseInt(sc.nextLine()));
        stmt.setString(1, sc.nextLine());
        stmt.setString(2, sc.nextLine());
        stmt.setString(3, sc.nextLine());
        stmt.setString(4, sc.nextLine());

        stmt.executeUpdate();
        System.out.println("Customer record updated successfully.");
        select(connection);
    }

    private static void select(Connection connection) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM customer");

        while (rs.next()) {
            System.out.printf(
                "ID: %d, Name: %s, Contact Information: %s, Subscription Plan: %s, Payment History: %s\n",
                rs.getInt("customer_id"),
                rs.getString("name"),
                rs.getString("contact_information"),
                rs.getString("subscription_plan"),
                rs.getString("payment_history")
            );
        }
    }
}
```

---

### 📘 **Question Based on the Program**

**Question: JDBC CRUD Operations (MySQL)**
You are tasked with creating a Java application that interacts with a MySQL database using JDBC. The application should:

1. Establish a connection to the database `ri_db` using the JDBC URL, username, and password.
2. Based on user input, allow the following operations:

   * **Insert (1):** Add a new customer record into the `customer` table.
   * **Update (2):** Modify an existing customer record using their `customer_id`.
   * **Select (3):** Fetch and display all customer records from the `customer` table.

> The `customer` table has the following columns:

```sql
customer_id INT,
name VARCHAR(100),
contact_information VARCHAR(255),
subscription_plan VARCHAR(50),
payment_history VARCHAR(255)
```

**Input Format:**

* An integer indicating the operation (1/2/3).
* For insert/update: appropriate values in sequence as per the method.

**Example:**

```
1
101
Alice
alice@example.com
Premium
Paid
```

**Tasks:**

* Implement the code using `PreparedStatement` and `Statement`.
* Use `try-catch` blocks to handle `SQLException` and `NumberFormatException`.
* Format and print the selected customer records.

