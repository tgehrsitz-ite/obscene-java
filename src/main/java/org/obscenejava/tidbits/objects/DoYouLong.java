package org.obscenejava.tidbits.objects;

public class DoYouLong {

    public static void main(String[] args) {

        Long smallFirst = 1L;
        Long smallSecond = 1L;

        Long bigFirst = 64738L;
        Long bigSecond = 64738L;

        System.out.println( smallFirst.equals(1L));
        System.out.println( smallFirst.equals(smallSecond));
        System.out.println( smallFirst == 1L);
        System.out.println( smallFirst == smallSecond);

        System.out.println( bigFirst.equals(64738L));
        System.out.println( bigFirst.equals(bigSecond));
        System.out.println( bigFirst == 64738L);
        System.out.println( bigFirst == bigSecond);
    }
}
