class PlusMethod {
    static public int plus(int x, int y) {
        int pr = x + y;
        return pr;
    }
    
    static public void main(String[] args) {
        int a=3;
        int b=5;
        int c = plus(a, b);
        System.out.println(a+"+"+b+"="+c);
    }
}
