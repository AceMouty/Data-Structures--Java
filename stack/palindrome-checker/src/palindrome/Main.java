package palindrome;

public class Main
{
    public static void main(String[] args) {
        String input = "A man a plan a cat a ham a yak a yam a hat a canal Panama";
        String str = input.replaceAll(" ", "");
        String answer = solution(str);
        boolean isPalindrome = str.equalsIgnoreCase(answer);

        System.out.println("The word " + input + " is a palindrom: " + isPalindrome);
    }

    public static String solution(String str)
    {
        LinkedStack stack = new LinkedStack();
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            stack.push(Character.toLowerCase(str.charAt(i)));
        }

        while(!stack.isEmpty())
        {
            result = result + stack.pop();
        }

        return result;
    }
}