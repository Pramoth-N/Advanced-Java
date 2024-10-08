import java.util.*;

class DatabaseUser {
    public String userType;
    
    public DatabaseUser(String userType) {
        this.userType = userType;
    }
    
    public String performOperation(String operation) {
        if (operation.equals("Create") || operation.equals("Read") || operation.equals("Update") || operation.equals("Delete")) {
            return "Performing " + operation + " operation";
        } else {
            return "Invalid input";
        }
    }
}

class AdminUser extends DatabaseUser {
    public AdminUser(String userType) {
        super(userType);
    }
    
    @Override
    public String performOperation(String operation) {
        return super.performOperation(operation);
    }
}

class RegularUser extends DatabaseUser {
    public RegularUser(String userType) {
        super(userType);
    }
    
    @Override
    public String performOperation(String operation) {
        if (operation.equals("Read") || operation.equals("Update")) {
            return super.performOperation(operation);
        } else {
            return "Operation not allowed";
        }
    }
}

class GuestUser extends DatabaseUser {
    public GuestUser(String userType) {
        super(userType);
    }
    
    @Override
    public String performOperation(String operation) {
        if (operation.equals("Read")) {
            return super.performOperation(operation);
        } else {
            return "Operation not allowed";
        }
    }
}

public class DatabaseOperations {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String userType = sc.nextLine();
        String operation = sc.nextLine();
        if("Create Read Update Delete".indexOf(operation) == -1){
            System.out.println("Invalid input");
            return;
        }
        DatabaseUser user = null;
        
        if (userType.equals("Admin")) {
            user = new AdminUser(userType);
        } else if (userType.equals("Regular")) {
            user = new RegularUser(userType);
        } else if (userType.equals("Guest")) {
            user = new GuestUser(userType);
        } else {
            System.out.println("Invalid input");
            return;
        }
        
        System.out.println(user.performOperation(operation));
    }
}