import java.util.*;

class Calculator{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double ans =0;
        if(operator =='/'){
            if(b==0)
            {
                System.out.print("Cannot divide by zero");
                return;
            }
            ans = a/b;
        }
        else if(operator == '+')
        ans = a+b;
        else if(operator == '-')
        ans = a-b;
        else if(operator == '*')
        ans = a*b;
        else
        {
            System.out.print("Invalid operation");
            return;
        }
            System.out.print(ans);
        
    }
}

