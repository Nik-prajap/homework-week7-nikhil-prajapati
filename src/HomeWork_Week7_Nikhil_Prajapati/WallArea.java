package HomeWork_Week7_Nikhil_Prajapati;

public class WallArea {
    private double width;
    private double height;

    // First constructor (no-arg constructor)
    public WallArea() {
        this.width = 0.0;
        this.height = 0.0;
    }

    // Second constructor with parameters for width and height
    public WallArea(double width, double height) {
        if (width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        WallArea wa = new WallArea(5, 4);
        System.out.println("area= " + wa.getArea());

        wa.setHeight(-1.5);
        System.out.println("width= " + wa.getWidth());
        System.out.println("height= " + wa.getHeight());
        System.out.println("area= " + wa.getArea());
    }
}
