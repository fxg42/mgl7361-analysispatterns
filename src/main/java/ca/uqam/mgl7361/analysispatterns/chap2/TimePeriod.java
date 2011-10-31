package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;

public class TimePeriod {
  private Calendar from;
  private Calendar to;

  public TimePeriod () {
    this(Calendar.getInstance());
  }
  public TimePeriod (Calendar from) {
    this.from = from;
  }
  public TimePeriod (Calendar from, Calendar to) {
    if (from.after(to))
      throw new IllegalArgumentException("invalid calendar range");
    this.from = from;
    this.to = to;
  }
}

// vim:ts=2:sw=2:
