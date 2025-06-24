package chap1_2.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        String[] pets = {"멍멍이", " 야옹이", "짹짹이"};
        //String[] petsCopy = pets; // 주소가 복사되기에  x
        //String[] petsCopy = new String[pets.length]; // 배열 객체 복사
        //for (int i = 0; i < pets.length ; i++) { // 배열 값 복사
        //    petsCopy[i] = pets[i];
        //}

        //                  array 카피   (array, array의 length)
        String[] petsCopy = Arrays.copyOf(pets, pets.length);


        System.out.println("원본 주소 = " + pets);
        System.out.println("사본 주소 = " + petsCopy);

        petsCopy[1] = "어흥이";

        System.out.println("원본 = " + Arrays.toString(pets));
        System.out.println("사본 = " + Arrays.toString(petsCopy));



    }
}
