import java.util.Scanner;
public class test {
    public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in);

     note myNote = new note();
     myNote.addPage("This my note........");  
     
     System.out.println("Please enter your note: ");
     myNote.addPage(input.nextLine());

     System.out.println("Please enter your note: ");
     myNote.addPage(input.nextLine());

     myNote.printAllNote();

     System.out.println("Time for edit, please enter you new note ");
     String s = input.nextLine();
     
     myNote.editPage(0, s);


     myNote.printAllNote();

    }
}
