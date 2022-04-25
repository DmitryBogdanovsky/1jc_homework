package Homework4;

public class Task31 {
    public static void main(String[] args) {
        long time1 = strConcat();
        long time2 = buldConcat();
        if (time1 > time2)
            System.out.println("Builder fast then String on "+ (time1 - time2));
        else
            System.out.println("String fast then Builder on "+ (time2 - time1));

    }

    public static long strConcat() {
        long start = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < 1_000_000; i++) {
            s1 = s1 + "aaabbbccc";
        }
        System.out.println(System.currentTimeMillis() - start);
        long start1 = System.currentTimeMillis() - start;
        return start1;
    }

    public static long buldConcat() {
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("aaabbbccc");
        }
        System.out.println(System.currentTimeMillis() - start2);
        long start3 = System.currentTimeMillis() - start2;
        return start3;
    }
}


