package exercise2;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String c, boolean f){
        setColor(c);
        setFilled(f);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "A Shape with color of " + color + " And " + filled + "]";
    }
}
