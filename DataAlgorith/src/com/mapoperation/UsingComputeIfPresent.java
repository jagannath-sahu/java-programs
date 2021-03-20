package com.mapoperation;

import java.util.HashMap;
import java.util.Map;

public class UsingComputeIfPresent {

  public static void main(String[] args) {
    Map<Integer, String> cityMap = new HashMap<>();
    cityMap.put(101, "Varanasi");
    cityMap.put(102, "Prayag");

    String newValue = cityMap.computeIfPresent(102, (k, v) -> v != null ? v.concat("raj") : null);

    System.out.println(newValue);
    System.out.println(cityMap);
  }

}
