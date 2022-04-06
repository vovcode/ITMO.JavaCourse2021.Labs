package Labs.Lab05;

public class Lab05 {
    public static void main(String[] args) {

        // 1. В конструктор передаются координаты в качестве параметров
        Vector vector = new Vector(8,4,7);
        System.out.println("Вектор " + vector);
        // 2. Расчет длины вектора
        System.out.println("Длина вектора " +vector +" = "
                + vector.lengthVector(3));
        // 3. Расчет скалярного произведения
        Vector vector2 = new Vector(5,10,2 );
        System.out.println("Скалярное произведение векторов "+ vector
                +" и "+ vector2+" = "
                + vector.scalarProduct(vector2,3));
        // 4. Вычисление векторного произведения
        System.out.println("Векторное произведение векторов "+ vector
                +" и "+ vector2+" = "
                + vector.vectorProduct(vector2));

        // 5. Вычисление угла меду векторами
        System.out.println("Угол между векторами "+ vector
                +" и "+ vector2+": "
                + vector.cornerVectors(vector2, 3));
        // 6. Сумма и разность векторов
        System.out.println("Сложение векторов "+ vector
                +" и "+ vector2+" = "
                + vector.vectorAddition(vector2));
        System.out.println("Вычитание векторов "+ vector
                +" и "+ vector2+" = "
                + vector.vectorSubtract(vector2));

        //7: Генерация векторного массива при помощи Math.random()222
        Vector[] vectors = generateArrayVectors(6,0,10);
        System.out.println("\nМассив векторов: ");
        for (Vector value : vectors) {
            System.out.println("Вектор: " + value);
        }
    }

    public static Vector[] generateArrayVectors(int valueSize, int Begin, int End){
        // Статический метод для генерации массива векторов
        // со случайным значениями
        Vector[] vectors = new Vector[valueSize];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(
                    ((int) (Math.random() * End) + Begin),
                    ((int) (Math.random() * End) + Begin),
                    ((int) (Math.random() * End) + Begin)
            );
        }
        return vectors;
    }
}