import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderingMap {

//  The HashMap cannot be used to store orderedData because it does not guarantee ordering of its keys,
//  so LinkedHashMap should be used which maintains insertion order.

//  Ordering by the data presented in orderSequence using streams may be implemented in two modes,
//  Keep only the values available in nonOrderedData

  public static void main(String[] args) {
    Map<String, Integer> nonOrderedData = Map.of(
        "b", 1, "e", 4, "a", 0, "o", 5, "d", 7
    );
    List<String> orderSequence = Arrays.asList(
        "a", "e", "i", "o", "u", "b", "c", "d"
    );

    Map<String, Integer> reordered = orderSequence
        .stream()
        .filter(nonOrderedData::containsKey)
        .collect(Collectors.toMap(
            key -> key, nonOrderedData::get,
            (v1, v2) -> v1, LinkedHashMap::new
        ));

    System.out.println(reordered);

  }

}
