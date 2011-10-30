package cq.uqam.mgl7361.analysispatterns.chap2;

import org.junit.*;
import static org.junit.Assert.*;

public class TestOperatingScope {
  @Test public void it_models_an_operating_scope () {
    PartyType surgeon = new PartyType ("surgeon");
    PartyType hospital = new PartyType ("hospital");
    AccountabilityType employment = new AccountabilityType ("employment");

    Person john = new Person ("John Smith", surgeon);
    Organization stmarys = new Organization ("St. Mary's Hospital", hospital);
    Accountability anEmployment = Accountability.create(stmarys, john, employment);

    OperatingScope liverTransplants = new ProtocolScope(20, "liver transplants", "southeast London");
    anEmployment.addOperatingScope(liverTransplants);
  }
}

// vim:ts=2:sw=2:
