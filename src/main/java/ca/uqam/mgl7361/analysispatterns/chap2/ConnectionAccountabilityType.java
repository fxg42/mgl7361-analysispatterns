package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;

public class ConnectionAccountabilityType extends AccountabilityType {
  private Set<ConnectionRule> connectionRules = new HashSet<ConnectionRule>();

  public ConnectionAccountabilityType (String name) {
    super(name);
  }

  public void addConnectionRule (PartyType commissioner, PartyType responsible) {
    connectionRules.add(new ConnectionRule(commissioner, responsible));
  }

  @Override
  protected boolean areValidPartyTypes (Party commissioner, Party responsible) {
    for (ConnectionRule each : connectionRules)
      if (each.isValid(commissioner, responsible)) return true;
    return false;
  }
}

// vim:ts=2:sw=2:
