package com.mapoperation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class WithoutComputeIfPresent {

  public static void main(String[] args) {
    Map<Integer, String> cityMap = new HashMap<>();
    cityMap.put(101, "Varanasi");
    cityMap.put(102, "Prayag");

    BiFunction<Integer, String, String> remappingFunction = (k, v) -> v != null ? v.concat("raj") : null;
    int key = 102;
    String oldValue = cityMap.get(key);
    String newValue = remappingFunction.apply(key, oldValue);

    System.out.println(cityMap);

    if (cityMap.get(key) != null) {
      if (newValue != null)
        cityMap.put(key, newValue);
      else
        cityMap.remove(key);
    }

    System.out.println(newValue);
    System.out.println(cityMap);
  }

}
