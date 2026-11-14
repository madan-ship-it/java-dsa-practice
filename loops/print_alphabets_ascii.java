package loops;

public class print_alphabets_ascii {
    public static void main(String[] args) {
        System.out.println("Write a Java program to print all alphabets with their corresponding ASCII values.");
        for(char ch='A';ch<='Z';ch++){
System.out.println(ch+"="+(int)ch);
        }
          for(char ch='a';ch<='z';ch++){
System.out.println(ch+"="+(int)ch);

        }
    }
}
