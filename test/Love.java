import java.util.Random;

public class Love {
    static public void main(String args[]) {
        String[] dodosuko = { "ドド", "スコ" };
        Random rnd = new Random();
        int dodo = 0;
        int suko = 0;
        do {
            int rnd_num = rnd.nextInt(2);
            System.out.print(dodosuko[rnd_num]);
            if (rnd_num == 0) {
                if (dodo == 0 && suko == 0) {
                    dodo += 1;
                    continue;
                } else if (dodo == 1 && suko == 3) {
                    dodo += 1;
                    continue;
                } else if (dodo == 2 && suko == 6) {
                    dodo += 1;
                    continue;
                } else {
                    dodo = 1;
                    suko = 0;
                    continue;
                }
            } else if (rnd_num == 1) {
                if (dodo == 1) {
                    if (suko == 0) {
                        suko += 1;
                        continue;
                    } else if (suko == 1) {
                        suko += 1;
                        continue;
                    } else if (suko == 2) {
                        suko += 1;
                        continue;
                    } else {
                        dodo = 0;
                        suko = 0;
                        continue;
                    }
                } else if (dodo == 2) {
                    if (suko == 3) {
                        suko += 1;
                        continue;
                    } else if (suko == 4) {
                        suko += 1;
                        continue;
                    } else if (suko == 5) {
                        suko += 1;
                        continue;
                    } else {
                        dodo = 0;
                        suko = 0;
                        continue;
                    }
                } else if (dodo == 3) {
                    if (suko == 6) {
                        suko += 1;
                        continue;
                    } else if (suko == 7) {
                        suko += 1;
                        continue;
                    } else if (suko == 8) {
                        break;
                    } else {
                        dodo = 0;
                        suko = 0;
                        continue;
                    }
                }
            }
        } while (true);
        System.out.println("ラブ注入～");
    }
}