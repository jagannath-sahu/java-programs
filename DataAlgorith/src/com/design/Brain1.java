package com.design;

import java.util.Collections;
import java.util.Map;

public class Brain1 extends BavrdVerticle{

  @Override
  public void startBavrd() {
    System.out.println("start Bavrd");
  }

  @Override
  public BavrdComponent getType() {
    return BavrdComponent.BRAIN;
  }

  @Override
  public Map<String, String> getHelp() { return Collections.emptyMap(); }



}
