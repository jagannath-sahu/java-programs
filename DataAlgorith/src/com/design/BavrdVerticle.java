package com.design;

import java.util.Map;


//extending Vertcle abstract class and adding new abstract methods
public abstract class BavrdVerticle extends Verticle {

  /**
   * default init behavior for a BAVRD Verticle : save help, init bavrd module
   */
  @Override
  public void start() {

    Map<String, String> helpMap = getHelp();

    if (!helpMap.isEmpty()) {
      System.out.println("not empty");
    } else {
      System.out.println("empty");
    }

    startBavrd();


  }

  /** init method for the concrete BAVRD Verticle */
  public abstract void startBavrd();

  /** @return the type of this module */
  public abstract BavrdComponent getType();

  /** @return a map of commands this module reacts to (command representation - command description) */
  public abstract Map<String, String> getHelp();
}