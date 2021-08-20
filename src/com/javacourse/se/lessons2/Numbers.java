package com.javacourse.se.lessons2;

public class Numbers {

    static byte a = 126;                     //2^8 = 256                         (от -128 до 127)
    static short b = 777;                    //2^16 = 65.538                     (от -32768 до 32767)
    static int c = 35_000;                   //2^32 = 4.294.967.296              (от -2147483648 до 2147483647)
    static long d = 1_000_000_000_000_000L;  //2^64 = 10.446.744.073.709.551.616 (от -9223372036054775808 до 9223372036054775807)

    static char e = 'c';                     //2^16 = 65.538                     (от 0 до 65537) Кодировка Unicode

    static float f = 7.1F;                   //2^32                              (от ~-1,4*10^45 до ~3,4*10^38)
    static double g = 6.3;                   //2^64                              (от ~-4,9*10-324 до ~1,8*10^308)

    static boolean h = true;                 //8 bit (в массивах) и 32 bit (не в массивах)

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
