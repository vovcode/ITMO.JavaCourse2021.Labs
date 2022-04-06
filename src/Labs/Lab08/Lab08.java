package Labs.Lab08;


import Labs.Lab08.Ex1BoxShape.Box;
import Labs.Lab08.Ex1BoxShape.*;
import Labs.Lab08.Ex2CallCenter.*;
import Labs.Lab08.Ex3Parking.Car;
import Labs.Lab08.Ex3Parking.Minibus;
import Labs.Lab08.Ex3Parking.Motorbike;
import Labs.Lab08.Ex3Parking.Parking;


public class Lab08 {
    public static void main(String[] args) {
        //ЗАДАНИЕ 01: Изменить иерархию shapes (использовать абстрактные и
        // интерфейсы классы, где это возможно)
        System.out.println("\n1. Фигуры через Интерфейсы");
        //shapeInterface();

        //ЗАДАНИЕ 02: (Из книги "Карьера программиста" стр 122, задача 7.2)
        //Имеется центр обработки звонков с тремя уровнями сотрудников: оператор,
        //менеджер и директор. Входящий телефонный звонок адресуется свободному
        //оператору. Если оператор не может обработать звонок, он автоматически
        //перенаправляется менеджеру. Если менеджер занят, то звонок перенаправляется
        //директору. Разработайте классы и структуры данных для этой задачи.
        //Реализуйте метод dispatchCall(), который перенаправляет звонок первому
        //свободному сотруднику.
        System.out.println("\n2. Кол-центр");
        callCenter();

        //ЗАДАНИЕ 03:(Из книги "Карьера программиста" стр 122, задача 7.4)
        // Разработайте модель автостоянки, используя принципы ООП.
        System.out.println("\n3. ПАРКОВКА");
        parkingLots();
    }
    public static void shapeInterface(){
        System.out.println("\nBOX");
        Box box = new Box(200);
        System.out.println(box);
        Pyramid pyramid1 = new Pyramid(45,12,5);
        box.add(pyramid1);
        pyramid1.print();
        IShape ball = new Ball(12,9);
        box.add(ball);
        box.add(new Cylinder(172,29,42));
        box.add(new Pyramid(38,12,5));
        box.add(new Ball(24,9));
        box.add(new Cylinder(71,9,12));
        System.out.println(box);
        System.out.println(" - - - - ");
        box.print();
    }

    public static void callCenter(){
        OfficeCallCenter officeCallCenter = new OfficeCallCenter();
        officeCallCenter.add(new Director("Евгений Викторович"));
        officeCallCenter.add(new Director("Петя"));
        officeCallCenter.add(new Manager("Денис", "по продажам"));
        officeCallCenter.add(new Manager("Елена", "по контролю качества"));
        officeCallCenter.add(new Manager("Артур", "по тех обеспечению"));
        officeCallCenter.add(new Operator("Виталий"));
        officeCallCenter.add(new Operator("Юлия"));
        officeCallCenter.add(new Operator("Виталина"));
        officeCallCenter.add(new Operator("Екатерина"));
        officeCallCenter.add(new Operator("Максим"));
        officeCallCenter.add(new Operator("Геннадий"));
        officeCallCenter.print();

        for (int i = 0; i < 12; i++) {
            officeCallCenter.dispatchCall();
        }
    }

    public static void parkingLots(){
        Parking parking = new Parking(8);
        parking.addCar(new Car("Ваз", 90));
        parking.addCar(new Car("Nissan", 180));
        parking.addCar(new Car("Opel", 45));
        parking.addCar(new Motorbike("Ява", 30));
        parking.addCar(new Motorbike("Урал", 190));
        parking.addCar(new Motorbike("Восход", 45));
        parking.addCar(new Minibus("Газель", 120));
        parking.addCar(new Minibus("Opel", 210));
        parking.addCar(new Minibus("Буханка", 75));

        parking.printParkingCar();

    }

}