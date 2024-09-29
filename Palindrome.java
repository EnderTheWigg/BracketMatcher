public class Palindrome
{
    public static void main(String[] args)
    {
        
    }
    
    public static boolean isPalindrome(String str)
    {
        Stack<String> s = new MyStack<String>();
        Queue<String> q = new MyQueue<String>();
        String letter = "";
        String legal = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String upperCaseLetter = "";
        String unformated = "";
        String pop = "";
        String remove = "";
        for(int i = 0; i < str.length(); i++){
            letter = str.substring(i, i+1);
            upperCaseLetter = letter.toUpperCase();
            if((legal.indexOf(upperCaseLetter) > -1)){
                unformated += upperCaseLetter;
                s.push(upperCaseLetter);
                q.add(upperCaseLetter);
            }
        }
        for(int i = 0; i < unformated.length(); i++){
            pop = s.pop();
            remove = q.remove();
            if(!(pop.equals(remove)))
               return false;
        }
        return true;
    }
}