package com.design;

import java.io.UnsupportedEncodingException;
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

  //those who will extend Brain1, they can override and implement
  public void initBrain() {
    throw new UnsupportedOperationException("Current operation is not supported for this object");
  }

  //those who will extend Brain1, they can override and implement
  public Object get(String key) {
    throw new UnsupportedOperationException("Current operation is not supported for this object");
  }
}
