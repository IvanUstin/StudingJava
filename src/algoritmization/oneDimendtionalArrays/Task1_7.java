package algoritmization.oneDimendtionalArrays;

/*Даны действительные числа а1 ,а2 ,..., аn. Найти
max(a1 + an, a2 + (an-1), an + (an +1))
 */
public class Task1_7 {
    public static void main(String[] args) {

        //create a double array
        double[] array = MethodsFirstTask.createDoubleArray(10,0,10);

        //transform array according to condition
        array = MethodsFirstTask.edgeAmount(array);

        //find max
        double max = MethodsFirstTask.maxOfArray(array);
        System.out.println("Max is " + max);
    }
}
