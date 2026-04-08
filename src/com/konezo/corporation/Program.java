package com.konezo.corporation;


import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("how many students for course A? ");
        int numberCourseA = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberCourseA; i++) {
            int numbera = sc.nextInt();
            sc.nextLine();
            a.add(numbera);

        }
        System.out.println("how many students for course B? ");
        int numberCourseB = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberCourseB; i++) {
            int numberb = sc.nextInt();
            sc.nextLine();
            b.add(numberb);
        }
        System.out.println("how many students for course c? ");
        int numberCourseC = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberCourseC; i++) {
            int numberc = sc.nextInt();
            sc.nextLine();
            c.add(numberc);
        }
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("total: " + total.size());


        sc.close();


    }


}
