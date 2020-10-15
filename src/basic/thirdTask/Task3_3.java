package basic.thirdTask;

/*Найти сумму квадратов первых ста чисел.

 */
public class Task3_3 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i++)  {
            sum += Math.pow(i, 2);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
