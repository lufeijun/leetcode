package base.demo01;

/**
 * 展示整数的 32 位二进制
 */

public class demo01 {

    public static void print(int num) {
        for (int i = 31 ; i >= 0; i --) {
            // << 左移
            System.out.print( ( num & (1 << i) ) == 0 ? "0" : "1" );
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        print(4);

//        负数：第一位 0 ，剩下是取反加一
//        print(-1);

        // 取反操作
        // 最小值取反 = 最小值
        int min = Integer.MIN_VALUE;
        int minf = ~min + 1;
        print(min);
        print(minf);
        System.out.println("======");

        int max = Integer.MAX_VALUE;
        int maxf = ~max + 1;
        print(max);
        print(maxf);
        System.out.println(maxf);
        System.out.println("======");

        // 0 取反后，还等于 0
        int zero = 0;
        int zerof = ~zero + 1;
        print(zero);
        print(zerof);
        System.out.println(zerof);
        System.out.println("======");
    }
}
