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
        
        // Assign a variable using '=' operator with a values
        varInt = 42;
        varString = "a";
        varBoolean = true;
        
        // Use a variable
        System.out.println("The value of varInt is " + varInt);
        System.out.println("The value of varString is " + varString);
        System.out.println("The value of varBoolean is " + varBoolean);
        
        // Variables can be declared and assigned at the same time
        int varInt2 = varInt + 58;
        System.out.println("The value of varInt2 is " + varInt2);
    }
}