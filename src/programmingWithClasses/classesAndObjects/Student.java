package programmingWithClasses.classesAndObjects;

import java.util.Arrays;

public class Student {
    private static int nextStudent;
    private String name;
    private int group;
    private int[] progress;

    public Student() {
        nextStudent++;
        progress = randomProgress();
        group = 5292;
        name = "Student " + nextStudent;
    }

    public Student(String name, int group, int[] progress) {
        this.name = name;
        this.group = group;
        this.progress = progress;
    }

    public static int[] randomProgress () {
        int[] progress = new int[5];
        for (int i = 0; i < 5; i++) {
            progress[i] = (int) (Math.random() * 10 + 1);
        }
        return progress;
    }

    @Override
    public String toString() {
        return String.format("name %s\ngroup %d\nmarks %s",name,group, Arrays.toString(progress));
    }

    public static String excellent(Student[] students) {
        StringBuilder excellent = new StringBuilder();
        for (Student s : students) {
            for (int i = 0; i < 5; i++) {
                if (s.progress[i] < 9) break;
                if (i == 4) excellent.append("name ").append(s.name).append("\ngroup ").append(s.group).append("\n\n");
            }
        }
        return excellent.toString();
    }
}
