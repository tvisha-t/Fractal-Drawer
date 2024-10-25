//Written by Tvisha Talwar, talwa029
package CSCI1933P1;
import java.awt.Color;
public class Rectangle {

   Color color;
   double xPos;
   double yPos;
   double height;
    double width;

    public Rectangle (double xPos, double yPos, double width, double height){

        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;


    }

    public double calculatePerimeter(){
        return 2 * (width + height);

    }
    public double calculateArea(){
        return width * height;

    }

    public void setColor(Color color){
        this.color = color;
    }

    public void setPos(double x, double y){
        this.xPos = x;
        this.yPos = y;

    }

    public void setHeight(double height){
        this.height = height;

    }

    public void setWidth(double width){
        this.width = width;

    }


    public Color getColor(){
        return this.color;


    }

    public double getXPos(){
        return this.xPos;


    }

    public double getYPos(){
        return this.yPos;

    }

    public double getHeight(){
        return this.height;

    }

    public double getWidth(){
        return this.width;

    }





}
