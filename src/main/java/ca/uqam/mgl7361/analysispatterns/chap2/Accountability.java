package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;

public class Accountability {
  private Party commissioner;
  private Party responsible;
  private AccountabilityType type;
  private TimePeriod timePeriod;
  private Set<OperatingScope> operatingScopes = new HashSet<OperatingScope>();

  private Accountability (Party commissioner, Party responsible, AccountabilityType type) {
    this.commissioner = commissioner;
    this.responsible = responsible;
    this.type = type;
    commissioner.addResponsible(this);
    responsible.addCommissioner(this);
  }

  static Accountability create (Party commissioner, Party responsible, AccountabilityType type) {
    if (!canCreate(commissioner, responsible, type))
      throw new IllegalArgumentException ("invalid accountability");
    else return new Accountability (commissioner, responsible, type);
  }

  static boolean canCreate (Party commissioner, Party responsible, AccountabilityType type) {
    if (commissioner.equals(responsible)) return false;
    if (commissioner.commissionersInclude(responsible, type)) return false;
    return type.canCreateAccountability(commissioner, responsible);
  }

  public Party getCommissioner () {
    return commissioner;
  }
  public Party getReponsible () {
    return responsible;
  }
  public AccountabilityType getType () {
    return type;
  }
  public void setTimePeriod (TimePeriod timePeriod) {
    this.timePeriod = timePeriod;
  }
  public void addOperatingScope (OperatingScope scope) {
    this.operatingScopes.add(scope);
  }
}

// vim:ts=2:sw=2:
