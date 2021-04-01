public class TestParenthesis {
    public static void parenthesisChecker(String s){
        Stack stack = new Stack();
        for (char st : s.toCharArray()){
            if (st == '(' || st == '{'){
                stack.push(st);
            }
            else {
                char top = (Character) stack.peek();
                if (st == ')' && top == '(' || st == '{' && top == '}'){
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("Valid parenthesis");
        }
        else System.out.println("Invalid parenthesis");
    }
    public static void main(String[] args) {
        parenthesisChecker("()()");
        parenthesisChecker("()(");
        parenthesisChecker("(())");
    }
}
