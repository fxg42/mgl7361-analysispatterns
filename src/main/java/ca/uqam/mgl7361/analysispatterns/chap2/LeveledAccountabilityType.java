package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;

public class LeveledAccountabilityType extends AccountabilityType {
  private List<PartyType> levels = new ArrayList<PartyType>();

  public LeveledAccountabilityType (String name) {
    super(name);
  }

  public void setLevels (List<PartyType> levels) {
    this.levels.addAll(levels);
  }

  @Override
  protected boolean areValidPartyTypes (Party commissioner, Party responsible) {
    for (int i=0; i < levels.size()-1; i++)
      if (commissioner.getType().equals(levels.get(i)))
        return responsible.getType().equals(levels.get(i+1));
    return false;
  }
}

// vim:ts=2:sw=2:
