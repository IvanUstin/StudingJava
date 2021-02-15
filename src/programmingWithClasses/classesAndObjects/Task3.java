package programmingWithClasses.classesAndObjects;
/*Создайте класс с именем Student, содержащий поля:
фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов,
имеющих оценки, равные только 9 или 10.
 */
public class Task3 {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 8; i++) {
            students[i] = new Student();
        }
        int[] excellent = {9, 10, 10, 9, 9};
        students[8] = new Student("John",5292,excellent);
        students[9] = new Student("Mary",5292,excellent);
        System.out.println("All students:");
        for (Student s : students) {
            System.out.println("\n" + s);
        }
        System.out.println("\nExcellent:");
        System.out.println(Student.excellent(students));
    }
}
