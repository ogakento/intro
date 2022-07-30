// FizzBuzz
// 3で割り切れるときに，Fizz
// 5で割り切れるときに，Buzz
// 3と5両方で割り切れるときに，FizzBuzz
// それ以外のときはそのまま数字
// を出力する

class FizzBuzz {
    static public void main(String[] argv) {
        for (int i=1; i<100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
