/*
* You are given an infix expression
* You are required to convert it to prefix and print it
* You are required to convert it to postfix and print it
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class _9_InfixToPrefixAndPostfix {
    private int precedence(char op){
        return switch (op){
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }
    private void infixToPrefix(String exp){
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for(char ch: exp.toCharArray()){
            if(ch == '(') operator.push(ch);
            else if(ch == ')'){
                while(operator.peek() != '('){
                    char op = operator.pop();
                    String ch2 = prefix.pop(), ch1 = prefix.pop();
                    prefix.push(op + ch1 + ch2);
                }
                operator.pop();
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(!operator.isEmpty() && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())){
                    char op = operator.pop();
                    String ch2 = prefix.pop(), ch1 = prefix.pop();
                    prefix.push(op + ch1 + ch2);
                }
                operator.push(ch);
            } else {
                prefix.push(String.valueOf(ch));
            }
        }
        while (!operator.isEmpty()){
            char op = operator.pop();
            String ch2 = prefix.pop(), ch1 = prefix.pop();
            prefix.push(op + ch1 + ch2);
        }
        System.out.println("prefix -> " + prefix.pop());
    }
    private void infixToPostfix(String exp){
        Stack<Character> operator = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for(char ch: exp.toCharArray()){
            if(ch == '(') operator.push('(');
            else if(ch == ')'){
                while(operator.peek() != '('){
                    char op = operator.pop();
                    String ch2 = postfix.pop(), ch1 = postfix.pop();
                    postfix.push(ch1 + ch2 + op);
                }
                operator.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (!operator.isEmpty() && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())){
                    char op = operator.pop();
                    String ch2 = postfix.pop(), ch1 = postfix.pop();
                    postfix.push(ch1 + ch2 + op);
                }
                operator.push(ch);
            }else postfix.push(String.valueOf(ch));
        }
        while (!operator.isEmpty()){
            char op = operator.pop();
            String ch2 = postfix.pop(), ch1 = postfix.pop();
            postfix.push(ch1 + ch2 + op);
        }
        System.out.println("Postfix -> " + postfix.pop());
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        infixToPrefix(exp);
        infixToPostfix(exp);
    }
}
