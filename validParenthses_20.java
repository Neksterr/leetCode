package leetCode;

import java.util.ArrayDeque;
import java.util.Scanner;

public class validParenthses_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Solution solution = new Solution();
        solution.isValid(text);

    }


    static class Solution {

        public boolean isValid(String s) {
            if(s.length() % 2 != 0) return false;

            ArrayDeque<Character> stack = new ArrayDeque<>();
            for(char c : s.toCharArray()){
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }
                else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
                else {

                    return false;
                }

            }
            return stack.isEmpty();
        }
    }
}
