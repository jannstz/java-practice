/*
    This program demonstrates the use of conditionals.
*/

class Conditionals {
    public static void main(String args[]) {
        // A conditional executes if a boolean check returns true
        int a, b, c;
        a = 1;
        b = 5;
        c = a - b; // a negative number
        
        // A conditional can be done in one line
        if (a < b) System.out.println("a is less than b");
        
        // A conditional can include a block of code
        if (b > c) {
            c = c + b;
            a = 4;
            System.out.println("a and c have changed");
        }
        
        // A conditional can include instructions if the check is false
        if ((a == b) && (a == c)) {
            System.out.println("a equals b and c");
        }
        else {
            System.out.println("b and c are not equal");
        }
    }
}