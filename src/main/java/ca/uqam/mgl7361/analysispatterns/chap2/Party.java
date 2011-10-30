package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;

public class Party {
  private String name;
  // In order of preference
  private List addresses = new ArrayList<Address>();
  private List emailAddresses = new ArrayList<String>();
  // Accountabilities
  private Set<Accountability> commissionerAccountabilities = new HashSet<Accountability>();
  private Set<Accountability> responsibleAccountabilities = new HashSet<Accountability>();

  public Party (String name) {
    this.name = name;
  }

  boolean commissionersInclude (Party sample, AccountabilityType type) {
    for (Party each : getCommissioners(type))
      if (each.equals(sample) || each.commissionersInclude(sample, type))
        return true;
    return false;
  }

  Set<Party> getCommissioners (AccountabilityType type) {
    Set<Party> result = new HashSet<Party>();
    for (Accountability each : commissionerAccountabilities)
      if (each.getType().equals(type))
        result.add(each.getCommissioner());
    return result;
  }

  void addCommissioner (Accountability commissioner) {
    commissionerAccountabilities.add(commissioner);
  }

  void addResponsible (Accountability responsible) {
    responsibleAccountabilities.add(responsible);
  }
}

// vim:ts=2:sw=2
