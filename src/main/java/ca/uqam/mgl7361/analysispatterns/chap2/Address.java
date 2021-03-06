package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;

public class Address {
  // home | office | school | billing | shipping
  private String type;
  private List<String> lines = new ArrayList<String>();
  // validity period
  private TimePeriod timePeriod;

  public Address (String type, List<String> lines) {
    this(type, lines, new TimePeriod());
  }
  public Address (String type, List<String> lines, TimePeriod timePeriod) {
    this.type = type;
    this.lines.addAll(lines);
    this.timePeriod = timePeriod;
  }
  // getters and setters...
}

// vim:ts=2:sw=2

