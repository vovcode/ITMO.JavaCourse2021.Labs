package Labs.Lab07;

import Labs.Lab07.Ex1Car.Car;
import Labs.Lab07.Ex1Car.Truck;
import Labs.Lab07.Ex2BoxShape.Ball;
import Labs.Lab07.Ex2BoxShape.Box;
import Labs.Lab07.Ex2BoxShape.Cylinder;
import Labs.Lab07.Ex2BoxShape.Pyramid;

public class Lab07 {
    public static void main(String[] args) {
        //Здание 01: Класс грузовик, наследуется от класса Car
        Car car = new Car(3, "Жигули",'a', 90);
        car.outPut();
        Truck truck = new Truck(22,"Камаз", 'b', 70,
                6, 34);
        truck.outPut();
        System.out.println(truck);
        truck.newWheels(8);
        System.out.println(truck);

        //Задание 02: Реализовать иерархию классов в соответствии со схемой
        System.out.println("\nBOX");
        Box box = new Box(200);
        System.out.println(box);
        box.add(new Pyramid(45,12,5));
        box.add(new Ball(12,9));
        box.add(new Cylinder(172,29,42));
        box.add(new Pyramid(38,12,5));
        box.add(new Ball(24,9));
        box.add(new Cylinder(71,9,12));
        System.out.println(box);

        if(box.add(new Cylinder(83,12,22))){
            System.out.println("Фигура успешно добавлена");
        }
        else{
            System.out.println("Добавление фигуры не удалось");
        }

    }
}