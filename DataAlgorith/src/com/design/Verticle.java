package com.design;

public abstract class Verticle {

  /**
   * default init behavior for a BAVRD Verticle : save help, init bavrd module (see {{@link BavrdVerticle#startBavrd()}}), log loading
   */
  public abstract void start();

}
