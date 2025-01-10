public class Wall{
    private double width, height;
    public Wall(){
        this.width = 0;
        this.height = 0;
    }
    public Wall(double width, double height){
        this.height = (height < 0) ? 0 : height;
        this.width = (width < 0) ? 0 : width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }
    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height; 
    }
    public double getArea() {
        return width * height;
    }
}