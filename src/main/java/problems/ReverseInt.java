package problems;
/*
Problem Statement:
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer
    range [-231, 231 - 1], then return 0.

    ### Medium level problem ###

Constraints:
    - Assume the environment does not allow you to store
    64-bit integers (signed or unsigned).

Approach:
    Simple while loop and arithmetic operations, with
    a check for maximum value.

Complexity:
    Time = O(n)
    Space = O(1)
*/

public class ReverseInt {
    public int reverse(int n){
        try {
            int sol = 0;
            int digit = 0;

            while(n!=0){
                digit = n%10;

                if(
                       sol > Integer.MAX_VALUE/10 ||
                       sol < Integer.MIN_VALUE/10
                ){
                    throw new ArithmeticException(
                            "Overflow or Underflow detected");
                }

                sol = sol*10 + digit;
                n = n/10;
            }

            return sol;

        } catch (Exception e) {
            return 0;
        }
    }
}
