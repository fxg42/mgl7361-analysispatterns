package cq.uqam.mgl7361.analysispatterns.chap2;

public class AccountabilityType {
  private String name;

  public AccountabilityType (String name) {
    this.name = name;
  }

  public String getName () {
    return name;
  }

  public boolean canCreateAccountability (Party commissioner, Party responsible) {
    return areValidPartyTypes(commissioner, responsible);
  }

  protected boolean areValidPartyTypes (Party commissioner, Party responsible) {
    return true;
  }
}

// vim:ts=2:sw=2:
