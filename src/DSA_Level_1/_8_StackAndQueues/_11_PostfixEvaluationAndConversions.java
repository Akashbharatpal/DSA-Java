/*
* You are given a postfix expression.
* You are required to evaluate it and print its value.
* You are required to convert it to infix and print it.
* You are required to convert it to prefix and print it.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Stack;

public class _11_PostfixEvaluationAndConversions {
    private int operation(int v1, int v2, char ch){
        return switch (ch){
            case '+' -> v1 + v2;
            case '-' -> v1 - v2;
            case '*' -> v1 * v2;
            case '/' -> v1 / v2;
            default -> 0;
        };
    }
    // 264*8/+3-
    public void main(String[] args){
        String exp = "264*8/+3-";
        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for(char ch: exp.toCharArray()){
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = value.pop(), v1 = value.pop();
                value.push(operation(v1, v2, ch));
                String i2 = infix.pop(), i1 = infix.pop();
                infix.push("(" + i1 + ch + i2 + ")");
                String p2 = prefix.pop(), p1 = prefix.pop();
                prefix.push(ch + p1 + p2);
            }else{
                value.push(ch - '0');
                infix.push(String.valueOf(ch));
                prefix.push(String.valueOf(ch));
            }
        }
        System.out.println("Evaluation: " + value.pop());
        System.out.println("Infix: " + infix.pop());
        System.out.println("Prefix: " + prefix.pop());
    }
}
