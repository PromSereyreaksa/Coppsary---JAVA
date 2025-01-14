public class Point {
    private int x, y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return this.y;
    }
    public double distance(){
        return distance(0, 0); 
    }
    public double distance(Point a) {
        return distance(a.x, a.y);
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)); // ? ?????
    }    
}