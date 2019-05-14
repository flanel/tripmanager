package pl.edu.agh.mwo;
import java.util.Scanner;

public class Photo {

    private String comment = "";

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Photo(String arg_Comment){
        comment = arg_Comment;
        System.out.println("Comment has been added " + comment);
    }
}