import java.util.Scanner;
public class AnimalPicker {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean loopActive = true;
    while(loopActive){
        System.out.println("Would you like to see a dog or cat? (Use 'cat' for cat and 'dog' for dog)");
        String choice = scan.nextLine().toLowerCase();
        switch(choice){
            case("cat"): System.out.println("Cat ACII art here");
            break;
            case("dog"): System.out.println("Dog ACII art here");
            break;
            default: System.out.println("ERROR: Please enter a correct value");
        }
    }
    
  }
}