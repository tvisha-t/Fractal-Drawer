//Written by Tvisha Talwar, talwa029
package CSCI1933P1;

import java.util.Scanner;
public class FractalProgram {
    //TODO:
    // Main should ask user for shape input, and then draw the corresponding fractal.
    // This method should print area of fractal, after the fractal is done drawing.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose circle, triangle, or rectangle (c, t, r): ");
        String shapeChoice = scanner.nextLine();
        FractalDrawer fractalDrawer = new FractalDrawer();

        double totalArea = fractalDrawer.drawFractal(shapeChoice);

        System.out.println("The total area is "+totalArea);
        scanner.close();






        
    }
}
