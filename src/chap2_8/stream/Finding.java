package chap2_8.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.*;

public class Finding {
    public static void main(String[] args) {

        // 요리 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 있는가>?
        boolean flag1 = menuList.stream()
                .filter(menu -> menu.getType() == DishType.MEAT)
                .anyMatch(menu -> menu.isVegetarian());

        System.out.println(flag1);


        System.out.println("=============================");

        // 요리 목록에서 모든 요리가 1000칼로리 미만입니까?

        boolean flag2 = menuList.stream()
                .allMatch(menu -> menu.getCalories() < 1000);

        System.out.println(flag2);

        System.out.println("=============================");

        // 요리 중에 첫번째 발견된 생선 요리를 찾기 : find

        Dish firstFishDishes = menuList.stream()
                .filter(m -> m.getType() == DishType.FISH)
                .findFirst()
                .get();

        System.out.println(firstFishDishes);


    }
}
