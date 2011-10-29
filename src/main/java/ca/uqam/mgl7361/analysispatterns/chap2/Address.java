package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;

public class Address {
  // home | office | school | billing | shipping
  private String type;
  private List lines = new ArrayList<String>();
  // validity period
  private Date from;
  private Date to; // can be null

  public Address (String type, List<String> lines) {
    this(type, lines, new Date());
  }
  public Address (String type, List<String> lines, Date from) {
    this.type = type;
    this.lines.addAll(lines);
    this.from = new Date(from.getTime());
  }

  // getters and setters...
}

// vim:ts=2:sw=2

