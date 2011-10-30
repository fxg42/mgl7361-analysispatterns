package cq.uqam.mgl7361.analysispatterns.chap2;

public class ConnectionRule {
  private PartyType allowedCommissioner;
  private PartyType allowedResponsible;

  public ConnectionRule (PartyType commissioner, PartyType responsible) {
    this.allowedCommissioner = commissioner;
    this.allowedResponsible = responsible;
  }

  public boolean isValid (Party commissioner, Party responsible) {
    return commissioner.getType().equals(allowedCommissioner) &&
        responsible.getType().equals(allowedResponsible);
  }
}

// vim:ts=2:sw=2:
