import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class SolutionEncoding {





    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

        String message = "";
        for (char ch: MESSAGE.toCharArray()) {
            String text = Integer.toBinaryString((int)ch);
            while (text.length()%7!=0) {
                text = "0"+text;
            }
            message += text;
        }
        
        String answer = "";
        char currentSerie='\0';
        for (char ch: message.toCharArray()) {
            
            if (currentSerie=='\0') {
                currentSerie = ch;
                if (ch=='0') {
                    answer += "00 0";
                } else {
                    answer += "0 0";
                }
            } else if (currentSerie == ch){
                answer += "0";
            } else {
                currentSerie = ch;
                if (ch=='0') {
                    answer += " 00 0";
                } else {
                    answer += " 0 0";
                }
            }
        }

        System.out.println(answer);
    }
}