package Homework4;

public class Task31 {
    public static void main(String[] args) {
        long time1 = strConcat();
        long time2 = buldConcat();
        if (time1 > time2)
            System.out.println("Builder fast then String on " + (time1 - time2));
        else
            System.out.println("String fast then Builder on " + (time2 - time1));

    }

    public static long strConcat() {
        long start = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < 100_000; i++) {
            s1 = s1 + "aaabbbccc";
        }
        long start1 = System.currentTimeMillis() - start;
        System.out.println(start1);
        return start1;
    }

    public static long buldConcat() {
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            sb.append("aaabbbccc");
        }
        long start3 = System.currentTimeMillis() - start2;
        System.out.println(start3);
        return start3;
    }
}


