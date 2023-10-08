import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample1.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            boolean proper=true;
            Stack<String> tags = new Stack<String>();

            while(in.hasNext() && proper == true){
                String tag = in.next();
                if(tag.indexOf("/") == -1){
                    tags.push(tag);
                }
                else{ //contains "\", so is an closing tag
                    if(!tags.pop().equals(tag.substring(0,tag.indexOf("/")) + tag.substring(tag.indexOf("/")+1)))
                        proper = false;
                }
            }
            if(proper)
                System.out.println("The HTML sequence is properly nested");
            else
                System.out.println("The HTML sequence is not properly nested");

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
