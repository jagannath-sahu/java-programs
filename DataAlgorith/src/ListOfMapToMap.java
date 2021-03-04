import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfMapToMap {

    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();

        map.put("Apple", 2L);
        map.put("Banana", 2L);

        Map<String, Long> map1 = new HashMap<>();

        map1.put("Apple", 2L);
        map1.put("Orange", 2L);

        Map<String, Long> map2 = new HashMap<>();

        map1.put("Banana", 2L);
        map1.put("Guava", 2L);

        List<Map<String, Long>> mapList = new ArrayList<>();

        mapList.add(map);
        mapList.add(map1);
        mapList.add(map2);

        final Optional<Map<String, Long>> reduce = mapList.stream().reduce((firstMap, secondMap) -> {
                return Stream.concat(firstMap.entrySet().stream(), secondMap.entrySet().stream())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (countInFirstMap, countInSecondMap) -> countInFirstMap + countInSecondMap));
        });

        System.out.println(reduce.get());
    }
}