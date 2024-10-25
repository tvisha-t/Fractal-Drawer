//Written by Tvisha Talwar, talwa029
package CSCI1933P1;
import java.awt.Color;

public class Triangle {
    Color color;
    double xPos;
    double yPos;
    double width;
    double height;


    public Triangle (double xPos, double yPos, double width, double height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;



    }

    public double calculatePerimeter(){
        return (this.width + (Math.sqrt(Math.pow(this.width, 2.0) + (4.0 * Math.pow(this.height, 2.0))))); //formula for perimeter of triangle




    }


    public double calculateArea(){
        return (this.width * this.height) / 2; //
    }

    public void setColor(Color color){

        this.color = color;
    }


    public void setPos(double x, double y){
        this.xPos = x;
        this.yPos = y;
    }

    public void setHeight (double height){
        this.height = height;
    }
    public void setWidth (double width){
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
