import java.util.Scanner;
public class AnimalPicker {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean loopActive = true;
    while(loopActive){
        System.out.println("Would you like to see a dog , cat, fish or cow? (Use 'cat' for cat, 'dog' for dog, 'fish' for fish, 'cow' for cow)))");
        String choice = scan.nextLine().toLowerCase();
        switch(choice){
            case("cat"): System.out.println("          _       \n   ___ __ _| |_ ___ \n  / __/ _` | __/ __|\n | (_| (_| | |_\\__ \\\n  \\___\\__,_|\\__|___/");
            break;
            case("dog"): System.out.println("     _                 \n   __| | ___   __ _ ___ \n  / _` |/ _ \\ / _` / __|\n | (_| | (_) | (_| \\__ \\\n  \\__,_|\\___/ \\__, |___/\n              |___/     ");
            break;
            case("fish"): System.out.println("   __ _     _     \n  / _(_)___| |__  \n | |_| / __| \'_ \\ \n |  _| \\__ \\ | | |\n |_| |_|___/_| |_|");
            break;
            case("cow"): System.out.println("          __n__n__\n    .------`-\\00/-\'\n   /  ##  ## (oo)\n  / \\## __   ./\n     |//YY \\|/\nsnd  |||   |||");
            default: System.out.println("ERROR: Please enter a correct value");
            break;

        }
    }
    
  }
}