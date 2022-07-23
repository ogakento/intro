//ババ抜きのことを英語では Old maid と言うらしいです
import java.util.Scanner;
import java.util.Random;

class OldMaid2{
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] cards = {"J","\u2662A","\u2661A"};
        int money = 1000;
        int R = -1;
        int L = -1;
        int cR = -1;
        int cL = -1;
        char comchoose = ' ';
        do {
            System.out.println("所持金: "+money);
            int bet;
            do {
                System.out.print("掛け金: ");
                bet = sc.nextInt();
            } while(bet > money);
            money -= bet;
            do {
                int com = rand.nextInt(2);
                if (com == 0) {
                    R = 0;
                    L = 1;
                } else {
                    R = 1;
                    L = 0;
                }
                System.out.println();
                System.out.println("あなたの手札は("+cards[2]+")です");
                System.out.println("相手の手札は("+cards[0]+" "+cards[1]+")です");
                System.out.print("どちらのカードを選択しますか(r:右 l:左)？:");
                char pick = sc.next().charAt(0);
                if (pick == 'r' && R == 0 || pick == 'l' && L == 0) {
                    System.out.println();
                    System.out.println("あなたが引いたカードは("+cards[1]+")です");
                    System.out.println("あなたの手札は("+cards[1]+" "+cards[2]+")です");
                    System.out.println("相手の手札は("+cards[0]+")です");
                    System.out.println("結果:あなたの勝ち");
                    System.out.println("===============================================================");
                    System.out.println();
                    bet *= 2;
                    System.out.println("現在の掛け金: "+bet);
                    System.out.print("勝負を続けますか(y:はい n:いいえ)？:");
                    char c = sc.next().charAt(0);
                    if (c == 'y') {
                        continue;
                    } else {
                        money += bet;
                        break;
                    }
                } else {
                    System.out.println();
                    System.out.println("あなたが引いたカードは("+cards[0]+")です");
                    System.out.println("あなたの手札は("+cards[0]+" "+cards[2]+")です");
                    System.out.println("相手の手札は("+cards[1]+")です");
                    System.out.print("(J)をどちらに置きますか(r:右 l:左)？:");
                    char place = sc.next().charAt(0);
                    int comc = rand.nextInt(2);
                    try {
                        System.out.print("com:考え中");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(1000);
                        }
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    System.out.println();
                    if (comc == 0) {
                        cR = 0;
                        cL = 1;
                        comchoose = 'r';
                    } else {
                        cR = 1;
                        cL = 0;
                        comchoose = 'l';
                    }
                    if (place == 'r' && cR == 0 || place == 'l' && cL == 0) {
                        System.out.println();
                        System.out.println("com:"+comchoose);
                        System.out.println("相手が引いたカードは("+cards[0]+")です");
                        R = -1;
                        L = -1;
                        cR = -1;
                        cL = -1;
                    } else {
                        System.out.println();
                        System.out.println("com:"+comchoose);
                        System.out.println("相手が引いたカードは("+cards[2]+")です");
                        System.out.println();
                        System.out.println("あなたの手札は("+cards[0]+")です");
                        System.out.println("相手の手札は("+cards[1]+" "+cards[2]+")です");
                        System.out.println("結果:相手の勝ち");
                        System.out.println("===============================================================");
                        System.out.println();
                        break;
                    }
                }
            } while(true);
        }while (money != 0);
    }
}
