package com.tlglearning.shuffler;

import java.util.Random;

public class Shuffler {

  private final Random rng;

  //Constructor
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  //Definition of Shuffle method
  public void shuffle(int[] data) {
    for (int i = data.length - 1; i >= 1; i--) {
      int t = rng.nextInt(i + 1);
      if (t != i) {
        //TODO swap! swap logic below
        int temp = data[t];
        data[t] = data[i];
        data[i] = temp;
      }
    }
  }

}
