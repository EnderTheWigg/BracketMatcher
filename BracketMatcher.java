public class BracketMatcher
{

public static void main(String[] args)
{
        
}
    
public static String matchBrackets(String str)
{
    Stack<Character> s = new MyStack<Character>();
    for(int i = 0; i < str.length(); i++){
        char c = str.charAt(i);
        if(c == '[' || c == '{' || c == '('){
            s.push(c);
        }else if(c == ']' || c == '}' || c == ')'){
            if(s.isEmpty()){
                return "Too many closing brackets";
            }else if(!bracketAid(s.pop(), c)){
                return "Bracket mismatch";
            }
        }
    }
    if(s.isEmpty()){
        return "Balanced";
    }else{
        return "Not enough closing brackets";
    }
}
public static boolean bracketAid(char c1, char c2)
{
    switch(c1){
        case '[':
            return ']' == c2;
        case '(':
            return ')' == c2;
        case '{':
            return '}' == c2;
        default:
            return false;
        
    }
}
}