package Strings;

public class TextProcessor {
    static void main(String[] args) {

        countWords("I love Java");
        reverseString("potS");
    }

    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("The number of words in the text is: %d", numberOfWords);
        System.out.println(message);

        for(String word : words){
            System.out.println(word);
        }
    }

    public static void reverseString(String text){
        for(int i = text.length()-1; i >=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
