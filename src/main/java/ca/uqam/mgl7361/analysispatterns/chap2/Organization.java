package cq.uqam.mgl7361.analysispatterns.chap2;

public class Organization extends Party {
  private String name;
  private Organization parent;

  public Organization (String name) {
    this(name, null);
  }
  public Organization (String name, Organization parent) {
    super();
    this.name = name;
    this.parent = parent;
  }
}

// vim:ts=2:sw=2


