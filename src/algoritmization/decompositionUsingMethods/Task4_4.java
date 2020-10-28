package algoritmization.decompositionUsingMethods;

import basic.firstTask.Dot;

import java.util.List;

/*На плоскости заданы своими координатами n точек.
Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание.
Координаты точек занести в массив.
 */
public class Task4_4 {
    public static void main(String[] args) {

        List<Dot> listOfDots = DecompositionMethods.listOfDots(5,10);
        DecompositionMethods.fareAwayDots(listOfDots);
    }
}
