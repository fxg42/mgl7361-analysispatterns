package cq.uqam.mgl7361.analysispatterns.chap2;

public class ProtocolScope extends OperatingScope {
  private int amount;
  private String description;

  public ProtocolScope (int amount, String description, String location) {
    super(location);
    this.amount = amount;
    this.description = description;
  }
}

// vim:ts=2:sw=2:
