import java.util.Random;

public class Love {
    static public void main(String args[]) {
        String[] dodosuko = { "ドド", "スコ" };
        Random rnd = new Random();
        int a = 0;
        int b = 0;
        do {
            int rnd_num = rnd.nextInt(2);
            System.out.print(dodosuko[rnd_num]);
            if (rnd_num == 0) {
                if (a == 0 && b == 0) {
                    a = 1;
                    continue;
                } else if (a == 1 && b == 3) {
                    a = 2;
                    continue;
                } else if (a == 2 && b == 6) {
                    a = 3;
                    continue;
                } else {
                    a = 0;
                    b = 0;
                    continue;
                }
            } else if (rnd_num == 1) {
                if (a == 1) {
                    if (b == 0) {
                        b += 1;
                        continue;
                    } else if (b == 1) {
                        b += 1;
                        continue;
                    } else if (b == 2) {
                        b += 1;
                        continue;
                    } else {
                        a = 0;
                        b = 0;
                        continue;
                    }
                } else if (a == 2) {
                    if (b == 3) {
                        b += 1;
                        continue;
                    } else if (b == 4) {
                        b += 1;
                        continue;
                    } else if (b == 5) {
                        b += 1;
                        continue;
                    } else {
                        a = 0;
                        b = 0;
                        continue;
                    }
                } else if (a == 3) {
                    if (b == 6) {
                        b += 1;
                        continue;
                    } else if (b == 7) {
                        b += 1;
                        continue;
                    } else if (b == 8) {
                        break;
                    } else {
                        a = 0;
                        b = 0;
                        continue;
                    }
                }
            }
        } while (true);
        System.out.println("ラブ注入～");
    }
}