package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(5);
        integerList.add(9);


        System.out.println(map(integerList, s -> s + 5));
    }

    public static List<Integer> map(List<Integer> list, IntUnaryOperator intUnaryOperator){
        List<Integer>  newList = new ArrayList<>();
        for (Integer integer : list) {
            newList.add(intUnaryOperator.applyAsInt(integer));
        }
        return newList;
    }
}
