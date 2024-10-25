//Written by Tvisha Talwar, talwa029
package CSCI1933P1;

// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // constructor




    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas can = new Canvas(4000,4000);

//code for making the original (middle) shape
        if (type.equals("c")){
            drawCircleFractal (125, 700, 400, Color.LIGHT_GRAY, can, 7 );

        }

        if (type.equals("t")){
            drawTriangleFractal (250.0, 250.0, 500.0, 600.0, Color.BLACK, can, 7);


        } else if (type.equals("r")){
            drawRectangleFractal (200, 200, 500, 300, Color.BLACK, can, 7);



    }
        return totalArea;



    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Triangle myTriangle = new Triangle(x, y, width, height);
        myTriangle.setColor(c);
        if (level == 0){
            can.drawShape(myTriangle); //base case
        } else {

            double halfHeight = 0.5*height; //the height and width of the smaller triangles are half of the original
            double halfWidth = 0.5*width;



            Triangle myTriangle1 = new Triangle(x- 0.5* height, y, halfWidth, halfHeight);//these two make the "side" triangles
            Triangle myTriangle2 = new Triangle(x -0.5 * width, y, halfWidth, halfHeight);
            Triangle myTriangle3 = new Triangle(x+ 0.5*width, y-height, halfWidth, halfHeight);//makes top triangle

//using height and width to manipulate x and y position, as they both get smaller and smaller

            drawTriangleFractal(halfWidth, halfHeight, x- 0.5*width,y, Color.PINK, can, level-1);
            drawTriangleFractal(halfWidth, halfHeight, x  +width, y, Color.ORANGE, can, level-1);
            drawTriangleFractal(halfWidth, halfHeight, x + 0.5*halfWidth, y-height, Color.CYAN, can, level-1);

            can.drawShape(myTriangle);

            //calculating fractal area
            totalArea = myTriangle1.calculateArea() + myTriangle2.calculateArea() + myTriangle3.calculateArea();

        }



    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle myCircle = new Circle(x, y, radius);
        myCircle.setColor(c);
        if(level == 0){
            can.drawShape(myCircle); // base case
        } else{



            double R = radius;
            double r = R / 2;  // the radius of the smaller circles are half of the original circle


//using radius to manipulate x and y positions, all the while the radius gets smaller and smaller
            Circle myCircle1 = new Circle( x - 3*r, y, r);
            Circle myCircle2 = new Circle(x + 3*r, y , r);
            Circle myCircle3 = new Circle(x, y - 3*r, r);
            Circle myCircle4 = new Circle(x, y + 3*r, r);

            drawCircleFractal(r, x - 3*r, y , Color.YELLOW, can, level-1);
            drawCircleFractal(r, x + 3*r, y, Color.CYAN, can, level-1);
            drawCircleFractal(r, x, y - 3*r, Color.PINK, can, level-1);
            drawCircleFractal(r, x, y + 3*r, Color.ORANGE, can, level-1);

            can.drawShape(myCircle);


            //calculating fractal area

            totalArea = myCircle.calculateArea() + myCircle1.calculateArea()+ myCircle2.calculateArea()+myCircle3.calculateArea()+myCircle4.calculateArea();


        }



    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle newRectangle = new Rectangle(x, y, width, height);
        newRectangle.setColor(c);
        if(level == 0){
            can.drawShape(newRectangle); //base case
        }
        else{

            double halfHeight = 0.5*height; //the height and width of the smaller rectangles are half of the original (as they get smaller)
            double halfWidth = 0.5*width;

//instantiating rectangle objects
            Rectangle newRectangle1 = new Rectangle(x, y, width, height);
            Rectangle newRectangle2 = new Rectangle(x, y, width, height);
            Rectangle newRectangle3 = new Rectangle(x, y, width, height);
            Rectangle newRectangle4 = new Rectangle(x, y, width, height);


//As length and width get smaller, I use the length and width to manipulate x and y positions
            drawRectangleFractal(halfWidth, halfHeight, x - (halfWidth), y-(halfWidth), Color.PINK, can, level - 1);
            drawRectangleFractal(halfWidth, halfHeight, x - (halfWidth), y + (width), Color.ORANGE, can, level - 1);
            drawRectangleFractal(halfWidth, halfHeight, x + (width), y - (halfWidth), Color.CYAN, can, level - 1);
            drawRectangleFractal(halfWidth, halfHeight, x + (width), y + (width), Color.GREEN, can, level - 1);

            can.drawShape(newRectangle);
            //calculating fractal area
            totalArea = newRectangle.calculateArea() + newRectangle1.calculateArea() + newRectangle2.calculateArea() + newRectangle3.calculateArea() + newRectangle4.calculateArea();
        }


    }





}
