/*
    This program demonstrates a for loop.
    
    Format for a simple for loop:
        for(<initialization>; <condition>; <iteration>) statement;
        
    Format for a for loop with a code block:
        for(<initialization>; <condition>; <iteration>) {
            statement1;
            statement2;
        }
*/

class ForLoop {
    public static void main(String args[]) {
        int count;
        
        // A simple for loop
        for(count = 0; count < 5; count ++)
            // count = 0 is the control variable
            // count < 5 is the condition test -- the loop will continue each
            //    time this condition is met
            // count ++ (aka: count = count + 1) -- determines how the control
            //    variable is changed with each iteration
            System.out.println("Iteration value: " + count);
            // Note this for loop ends with a semicolon
            
        System.out.println("Simple for loop completed.");
        System.out.println();
        
        // A for loop with a code block
        int lineCount = 0; // initialize a line counter variable
        for(count = 4; count > 0; count --) {
            lineCount ++;
            System.out.println("Iteration value: " + count +
                                ", line number " + lineCount);
        }
        // Note this for loop ends with a closed curly bracket
        System.out.println("For loop with code block completed.");
    }
}