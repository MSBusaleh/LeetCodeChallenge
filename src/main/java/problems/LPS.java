package problems;

/*
Problem Statement:
    Given a string s, return the longest palindromic substring in s.
    A palindromic string is a string that can be read either from
    left to right or from right to left. e.g. SOS

    ### Medium level problem ###

Constraints:
    - 1 <= s.length <= 1000
    - s consist of only digits and English letters.

Approach:
    The solution will be using Dynamic Programming and 2D array.

Complexity:
    Time complexity = O(n^3) (3 nested loops each is O(n))
    Space complexity = O(n^2) (2D array of size n*n)
 */

public class LPS {
    public String findLongestPal(String s) {
        String solution = "";
       int[][] solArr = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) { //O(n)
            for (int j = 0; j < s.length(); j++) { //O(n)
                if (s.charAt(i) != s.charAt(j)) {
                    solArr[i][j] = 0;
                } else {
                    solArr[i][j] = 1;
                    if (
                            j > 0
                    ) {
                        if (
                                i > 0 //not first letter (to avoid index out of range)
                                        && j < s.length() - 1
                                        && solArr[i - 1][j - 1] == 1
                                        && solArr[i - 1][j + 1] == 1 //left and right are symmetric
                        ) {//i.e. even Pal found

                            String Pal = "" + s.charAt(i);
                            int k = 1;
                            while ( //O(n)
                                    i - k >= 0 && i + k < s.length()
                                            && j - k >= 0 && j + k < s.length()
                                            && solArr[i - k][j - k] == 1
                                            && solArr[i - k][j + k] == 1
                            ) {
                                Pal = s.charAt(i - k) + Pal + s.charAt(i - k);
                                k++;
                            }
                            if (Pal.length() > solution.length())
                                solution = Pal;

                        } else if (solArr[i][j-1] == 1) {//i.e. odd Pal found
                            String Pal = "" + s.charAt(i) + s.charAt(i);
                            int k = 1;
                            while (
                                    i - k >= 0 && i + k < s.length()
                                            && j-1-k >= 0 && j+k < s.length()
                                            && solArr[i - k][j - 1 - k] == 1
                                            && solArr[i - k][j + k] == 1
                            ) {
                                Pal = s.charAt(i - k) + Pal + s.charAt(i - k);
                                k++;
                            }
                            if (Pal.length() > solution.length())
                                solution = Pal;

                        }
                    }
                }
            }
        }
        return solution;
    }
}
