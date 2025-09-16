import java.util.HashMap;
import java.util.Map;

public class MapTask {

    public static <T>Map<T, Integer> arrToMap (T[] arr) {
        Map<T, Integer> testMap = new HashMap<>();
        for (T a : arr) {
            if(testMap.containsKey(a)) {
                testMap.put(a, testMap.get(a)+1);
            }else  {
                testMap.put(a,1);
            }
        }
        return testMap;
    }


    public static void main(String[] args) {

        String[] testArr1 = {"one","two","three","one","two","two","seven"};
        Integer[] testArr2 = {1,2,2,2,3,4,6,6,1,4};

        System.out.println(MapTask.arrToMap(testArr1)+"\n"+MapTask.arrToMap(testArr2));


    }


}
