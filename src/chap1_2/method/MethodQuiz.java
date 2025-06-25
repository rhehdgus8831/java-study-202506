package chap1_2.method;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};

    public static void main(String[] args) {

        printFoods();

        push("라면");
        push("김치찌개");

        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);


        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);


        pop();

      /*  remove("치킨");
        remove(0);*/

        printFoods();

/*
        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(1, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();

*/


    } // end main

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    };

    static void push(String newData) {
        String[] newFoods = Arrays.copyOf(foods, foods.length + 1);
        newFoods[newFoods.length - 1] = newData;
        foods = newFoods;
    }

    static int indexOf(String food) {
        for (int i = 0; i < foods.length; i++) {
            if (food.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    static String pop() {
        // 삭제할 데이터
        String deleteFoods = foods[foods.length - 1];
        // 기존 배열보다 하나 작은거
        String[] temp = new String[foods.length - 1];

        for (int i = 0; i < temp.length ; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
        temp = null;

        return Arrays.toString(foods);
    }
/*

    static String remove(String food) {
        int index = indexOf(food);
        for (int i = index; i < foods.length -1; i++) {
            foods[i] = foods[i + 1];
        }
        return Arrays.toString(foods);
    }

    static int remove(int index){
        int index2 = index;
        for (int i = index2; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        return Arrays.toString(foods);
    }
*/

}
