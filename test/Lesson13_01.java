class Student {
    String name = "sato";

    public void calculateAvg(int math, int english, int japanese) {
        int sum = math + english + japanese;
        int avg = sum / 3;
        System.out.println(avg);
    }

    public String judge(double avg) {
        String result;
        if (avg >= 60) {
            result = "passed";
        } else {
            result = "failed";
        }
        return result;
    }
}

public class Lesson13_01 {
    public static void main(String[] args) {
        Student a001 = new Student();
        a001.name = "sato";

        System.out.println(a001.name);
        a001.calculateAvg(80, 90, 100);

        Student a002 = new Student();
        a002.name = "suzuki";
        System.out.println(a002.name);
        a002.calculateAvg(70, 80, 0);
    }
}