import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Thor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        int thorX = initialTx;
        int thorY = initialTy;
        // game loop
        while (true) {

            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
              String mouvementX="";
            String mouvementY="";
            if (thorX > lightX) {
                mouvementX="W";
                thorX = thorX - 1;
            } else if (thorX < lightX) {
                mouvementX = "E";
                thorX = thorX + 1;
            }
            
            if (thorY > lightY) {
                mouvementY = "N";
                thorY = thorY - 1;
            } else if (thorY < lightY) {
                mouvementY = "S";
                thorY = thorY + 1;
            }
            
            System.out.println(mouvementY + mouvementX);
        }
    }
}