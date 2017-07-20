/*
    This program demonstrates how variables are:
        - declared
        - assigned values
        - used
*/

class Variables {
    public static void main(String args[]) {
        // Declare a variable by stating the datatype and the variable name
        int varInt;
        String varString;
        boolean varBoolean;
        
        // Multiple variables CAN be declared on the same line
        int a, b, c;
        
        // Assign a variable using '=' operator with a values
        varInt = 42;
        varString = "a";
        varBoolean = true;
        
        // Multiple variables CANNOT be assigned on the same line
        // ERROR: a, b, c = 1, 2, 3;
        a = 1;
        b = 2;
        c = 3;
        
        // Use a variable
        System.out.println("The value of varInt is " + varInt);
        System.out.println("The value of varString is " + varString);
        System.out.println("The value of varBoolean is " + varBoolean);
        
        // Variables can be declared and assigned at the same time
        int varInt2 = varInt + 58;
        System.out.println("The value of varInt2 is " + varInt2);
        
        System.out.println("The value of a, b, and c are " +
                            a + ", " + b + ", " + c);
    }
}