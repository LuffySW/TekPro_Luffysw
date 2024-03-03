package exercise2;

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
    public String toString() {
        // TODO Auto-generated method stub
        return "A Square with side=" + getLength() +", which is a subclass of " + super.toString() ;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
}
