package Labs.Lab07.Ex2BoxShape;

import java.util.Arrays;

public class Box extends Shape{

    private Shape[] shapes;

    public Box(double maxVolume) {
        super(maxVolume);
        shapes = new Shape[0];
    }

    private boolean isCanAdd(Shape shape){
        double newCurFilling = getCurrFilling() + shape.getVolume();
        if(newCurFilling < this.getVolume())
            return true;
        else return false;
    }
    private double getCurrFilling(){
        double currVolume = 0;
        for (int i = 0; i < shapes.length; i++)
            currVolume += shapes[i].getVolume();
        return currVolume;
    }

    public boolean add(Shape shape){
        if(isCanAdd( shape)){
            Shape[] newShapes = new Shape[shapes.length +1];
            for (int i = 0; i < shapes.length; i++) {
                newShapes[i] = shapes[i];
            }
            newShapes[shapes.length] = shape;
            shapes = newShapes;
            return true;
        }
        else {
            System.out.println("Не достаточно места для фигуры " + shape);
            return false;
        }
    }

    @Override
    public String toString() {
        String str = "Коробка с фигурами " +
                "Заполнение " +getCurrFilling() + " из " + this.getVolume();
        for (int i = 0; i < shapes.length; i++) {
            str += "\n\t"+ i + ")";
            str += shapes[i];
        }
        return str;
    }
}
