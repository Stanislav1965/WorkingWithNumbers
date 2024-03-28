import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteringInt = new ArrayList<>();
        for (Integer varA : intList) {
            if (varA > 0 && varA % 2 == 0) {
                filteringInt.add(varA);
            }
        }
        filteringInt.sort(Comparator.naturalOrder());
        for (Integer fltInt : filteringInt ){
            System.out.printf("%d ",fltInt);
        }
    }
}