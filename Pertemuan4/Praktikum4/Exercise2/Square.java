package Praktikum4.Exercise2;

public class Square extends Rectangle{
    public Square(){
        super();
    }   

    public Square(double side) {    
        super(side, side);  // Call superclass Rectangle(double, double) 
    } 

    public Square(double side, String c, boolean f){
        super(side,side);
        setFilled(f);
        setColor(c);
    }

    @Override
    

}
