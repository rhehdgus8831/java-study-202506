package chap2_8.stream;

import chap1_6.modi.pac2.C;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static chap2_8.stream.DishType.*;
import static chap2_8.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalorieMeats = menuList.stream()
                .filter(m -> m.getType() == MEAT)
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList());

        lowCalorieMeats.forEach(System.out::println);

        System.out.println("=============================");

        // 메뉴들을 이름 내림차로 정렬 (zyx순)

        List<Dish> lowMenuName = menuList.stream()
                .sorted(comparing(Dish::getName).reversed())
                .collect(toList());

        lowMenuName.forEach(System.out::println);



        System.out.println("=============================");

        // 300칼로리 이상인 요리 중 칼로리가 낮은 탑 3 요리를 필터링

        menuList.stream()
                .filter(m -> m.getCalories() >= 300)
                .sorted(comparing(Dish::getCalories))
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);





    }



}
