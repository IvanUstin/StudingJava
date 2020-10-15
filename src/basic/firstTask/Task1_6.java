package basic.firstTask;

public class Task1_6 {
    public static void main(String[] args) {
        Scope scope = new Scope();

        for (int i = 0; i < 10; i++) {
            scope.scope(Dot.test(10));
        }
    }
}
