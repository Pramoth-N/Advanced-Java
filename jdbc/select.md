
**Question:**
You are working on a Java application that connects to a MySQL database called `ri_db`. The database contains a table named `department` with the following structure:

| Column Name      | Data Type    |
| ---------------- | ------------ |
| Department\_ID   | INT          |
| Department\_Name | VARCHAR(100) |

Write a Java program to:

> **Connect to the database and retrieve all `Department_Name` values from the `department` table and print them in lowercase**, each on a new line.

**Requirements:**

* Use JDBC to connect to the MySQL database.
* Use `Class.forName()` to load the MySQL driver.
* Handle any potential exceptions (e.g., `SQLException`, `ClassNotFoundException`).
* Convert each department name to lowercase before printing.
* Print only the names (no extra messages or formatting).

---

### ✅ Sample Output (Assuming table data):

If the table contains:

| Department\_ID | Department\_Name |
| -------------- | ---------------- |
| 1              | Computer Science |
| 2              | Electrical       |
| 3              | Mechanical       |

Your program should output:

```
computer science
electrical
mechanical
```

---

``` java []

// You are using Java
import java.sql.*;

class Main{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost/ri_db";
        String user = "test";
        String password = "test123";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection(url , user , password);
            
            Statement st = connection.createStatement();
            ResultSet res = st.executeQuery("SELECT Department_Name FROM department");
            while(res.next()){
                System.out.println(res.getString("Department_Name"));
            }
        } catch(SQLException | ClassNotFoundException e){
            //
        }
    }
}

```