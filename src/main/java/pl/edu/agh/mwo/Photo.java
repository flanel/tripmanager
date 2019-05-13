package pl.edu.agh.mwo;
import java.util.Scanner;

public class Photo {
    String comment = "";
    public void Photo (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Add your comment");
        String comment = scan.nextLine();
        System.out.println("Your comment is:" + comment);
    }
}
