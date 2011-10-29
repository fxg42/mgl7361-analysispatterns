package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;

public class Address {
  // home | office | school | billing | shipping
  private String type;
  private List lines = new ArrayList<String>();
  // validity period
  private Date from;
  private Date to; // can be null
}

// vim:ts=2:sw=2

