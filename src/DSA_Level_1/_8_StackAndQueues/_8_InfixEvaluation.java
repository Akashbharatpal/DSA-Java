/*
* You are given an infix expression
* You are required to evaluate and print its value.
* Note:
*   1. Expression is balanced.
*   2. The only operator used are +, -, *, /
*   3. Opening and closing brackets are used to impact precedence of operations.
*   4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
*   5. In two operators of equal precedence give preference to the one on left.
*   6. All operands are single digit numbers.
* */
package DSA_Level_1._8_StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class _8_InfixEvaluation {
    private int precedence(char optr){
        return switch (optr){
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }
    private int operation(int v1, int v2, char optr){
        return switch (optr) {
            case '+' -> v1 + v2;
            case '-' -> v1 - v2;
            case '*' -> v1 * v2;
            case '/' -> v1 / v2;
            default -> 0;
        };
    }
    private int infixEvaluation(String str){
/*
*       rules:
*           operands = push inside operand stack
*           '(' = push into operator stack
*           ')' = pop every thing until finds '('
*           operator = pops until (st.isEmpty, or it doesn't find '(' or finds operator with lesser precedence.)
*       while evaluation follow this
*           [10, 20, 30] --> pop 2 operands (30, 20) then perform 20 op 30 strictly here note i used 20 first.
* */

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch == '(') operators.push(ch);
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(!operators.isEmpty() && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                    int v2 = operands.pop(), v1 = operands.pop();
                    char optr = operators.pop();
                    operands.push(operation(v1, v2, optr));
                }
                operators.push(ch);
            } else if(ch == ')'){
                while(operators.peek() != '('){
                    int v2 = operands.pop(), v1 = operands.pop();
                    char optr = operators.pop();
                    operands.push(operation(v1, v2, optr));
                }
                operators.pop();
            } else {
                operands.push(ch - '0');
            }
        }
        while(!operators.isEmpty()){
            int v2 = operands.pop(), v1 = operands.pop();
            char optr = operators.pop();
            operands.push(operation(v1, v2, optr));
        }
        return operands.pop();
    }
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int ans = infixEvaluation(str);

        System.out.println(ans);
    }
}
