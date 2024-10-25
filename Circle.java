//Written by Tvisha Talwar, talwa029
package CSCI1933P1;
import java.awt.Color;

public class Circle {

    double xPos;
    double yPos;
    double radius;
    Color color;

    public Circle(double xPos, double yPos, double radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;

    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius; //using perimeter of circle formula (2 * PI * radius)

    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2); //formula for finding area of circle is pi * radius^2)

    }

    public void setColor(Color color){
        this.color = color;

    }

    public void setPos(double x, double y){
        this.xPos = x;
        this.yPos = y;


    }

    public void setRadius(double radius){
        this.radius = radius;

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

    public double getRadius(){

        return this.radius;

    }











}
