import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner word = new Scanner(System.in);
    String WordChosen;
    
    System.out.println("Enter a word:");
    WordChosen = word.nextLine();

    System.out.println("\n" + "The length of your word is: " + WordChosen.length());
     //Your code will return the length of the entered String
  }
}
