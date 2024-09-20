/*
 * You are tasked with implementing a Customer Feedback System. The system should be able to handle customer feedback input and provide appropriate feedback messages based on whether a feedback message is provided or not.
Input Format
The input consists of multiple lines:
• The first set of lines contains the customer name and feedback message, each on a new line.
• The second set of lines contains only the customer name (for cases where no feedback message is provided).
Output Format
• Print the customer name and feedback message for each feedback entry. Each output should be separated by a newline.
• If only the customer name is provided, the feedback message should default to "No feedback provided."
Constraints
• 1 <= customerName.length <= 100
• 0 <= feedbackMessage.length <= 500
 */

 import java.util.*;

class FeedBack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        boolean feedback = false;
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
            feedback = !feedback;
        }
        if(feedback){
            System.out.println("No feedback provided.");
        }
    }
}