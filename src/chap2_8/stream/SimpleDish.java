package chap2_8.stream;

import java.util.Objects;

public class SimpleDish {


    private String menuName;
    private int calories;





    public SimpleDish(Dish menu) {
        menuName = menu.getName();
        calories = menu.getCalories();
    }

    public SimpleDish(String menuName, int calories) {
        this.menuName = menuName;
        this.calories = calories;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "{" +
                "menuName='" + menuName + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SimpleDish that)) return false;
        return calories == that.calories && Objects.equals(menuName, that.menuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuName, calories);
    }
}
