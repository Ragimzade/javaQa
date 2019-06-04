package ru.stqa.pft.sandbox;

public class Cycle {
    public static void main(String[] args) {
        //    for (int i = 0; i < 10; i++){
        //        System.out.println("i = " + i);
        //      }
        //  }


        //       for (int i = 0; i < 10; i+=3) {
        //         System.out.println("i = " + i);
        //     }


        //  int i = 0;
        // for (; i < 15; i++) {
        //    System.out.println("i = " + i);
        // }


        //   int i = 0;
        //  do {
        //     i++;

        // } while (i > 13);
        //System.out.println("i = " + i);

        for (int j = 0; j < 100; j++) {
            System.out.println("j ==" + j);
            if (j == 35) {
                break;
            }
        }


    }
}