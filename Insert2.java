import java.util.Random;

public class Insert2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] before = new int[10];
        int[] after = new int[10];

        for (int i = 0; i < before.length; i++) {
            before[i] = rand.nextInt(100) + 1;
            System.out.print(before[i] + " ");
        }

        System.out.println();

        after[0] = before[0];
        before[0] = -1;

        for(int i = 1; i < before.length; i++) {
            for(int j = 1; j < after.length; j++) {
                if(before[i] > after[j - 1]) {
                    //　ここで、配列の要素をひとつづつ前にずらす
                    for(int k = after.length - 1; k > j - 1; k--) {
                        after[k] = after[k - 1];
                    }
                    after[j - 1] = before[i];
                    before[i]= -1;

                    //　配列の要素をずらしたことを確認するための出力
                    System.out.println(after[j - 1] + "を" + (j - 1) + "番目に挿入しました。");
                    for (int l = 0; l < after.length; l++) {
                        System.out.print(after[l] + " ");
                    }
                    System.out.println(" ");
                }

            }
        }

        if (after[after.length - 1] == 0) {
            after[after.length -1] = before[before.length - 1];
        }

        for (int i = 0; i < after.length; i++) {
            System.out.print(after[i] + " ");
        }
        System.out.println(" ");

    }
}
