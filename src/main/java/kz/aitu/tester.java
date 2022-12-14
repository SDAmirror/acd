package kz.aitu;
import kz.aitu.week6.tree.Node;
public class tester {
    public static int log(int num) {
        int p = 0;
        for (int i = num; i >1; i /= 2) {
            p++;
        }


        return p;
    }
    public static void main(String[] args) {
        String a="dwadw";

        System.out.println(a.codePointAt(0));

    }

}
