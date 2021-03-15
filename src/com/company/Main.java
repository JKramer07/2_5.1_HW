package com.company;

import java.util.*;

public class Main {

    public static void print(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static class LengthCompare implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("List A");
        ArrayList<String> arrA = new ArrayList<>(5);
        System.out.println("Enter 5 cities:");
        arrA.add(scanner.next());
        arrA.add(scanner.next());
        arrA.add(scanner.next());
        arrA.add(scanner.next());
        arrA.add(scanner.next());
        System.out.println("--------------------");
        print(arrA);

        System.out.println("--------------------");
        System.out.println("List B");
        ArrayList<String> arrB = new ArrayList<>(5);
        System.out.println("Enter 5 countries:");
        arrB.add(scanner.next());
        arrB.add(scanner.next());
        arrB.add(scanner.next());
        arrB.add(scanner.next());
        arrB.add(scanner.next());
        System.out.println("--------------------");
        print(arrB);

        System.out.println("--------------------");
        System.out.println("List C");
        ArrayList<String> arrC = new ArrayList<>();

        arrC.addAll(arrA);
        Collections.sort(arrC);
        arrC.addAll(arrB);
        Collections.reverse(arrC);

        Iterator<?> iterator = arrA.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator = arrB.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }

        print(arrC);
        Collections.sort(arrC, new LengthCompare());
        print(arrC);

    }

}
