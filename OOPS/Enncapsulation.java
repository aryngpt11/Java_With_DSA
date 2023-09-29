package OOPS;

public class Enncapsulation {
    public static void main(String[] args) {
        Penn p = new Penn();

        p.setColor("blue");
        System.out.println(p.getColor());
        p.setTip(5);
        System.out.println(p.getTip());
    }
}

class Penn {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
