package ch9;

public class setPrivateMem {
    public static void main(String[] argv){
        circle c = new circle(3, 4, 5);

        Point p = c.getP();
        p.setX(5);
        System.out.println(c.toString());
    }   
}
class Point{
    private int x, y;
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
class circle{
    private Point p;
    private int r;
    circle(int x, int y, int r){
        p = new Point(x, y);
        this.r = r;
    }
    public String toString(){
        return "mid: " + p.toString() + ", r: " + r;
    }
    public Point getP(){
        return p;
    }
}
