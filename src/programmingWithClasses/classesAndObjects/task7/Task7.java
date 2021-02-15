package programmingWithClasses.classesAndObjects.task7;

/**
 * Задача: Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов, вычисления площади,
 * периметра и точки пересечения медиан.
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(new Triangle(3, 3, 3, 4, 5, 6));
        System.out.println(TriangleService.area(new Triangle(0,1,0,0,2,0))); // 1.0
        System.out.println(TriangleService.perimeter(new Triangle (0,0,0,3,4,0))); //12.0
        System.out.println(TriangleService.crossingMedians(new Triangle (0,3,0,0,3,0))); //Dot{x=1.0, y=1.0}
    }
}
