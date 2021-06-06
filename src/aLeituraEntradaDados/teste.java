package aLeituraEntradaDados;

class test {
    static int i = 1;

    public static void main(String args[]) {
        System.out.println(i +" , ");
        m(i);
        System.out.println(i);
    }

    public static void m(int i) {
        i += 2;
    }
}