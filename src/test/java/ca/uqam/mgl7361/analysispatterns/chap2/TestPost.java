package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestPost {
  @Test public void it_models_an_employee_that_occupies_a_post () {
    PartyType employee = new PartyType ("employee");
    PartyType manager = new PartyType ("manager");
    PartyType departement = new PartyType ("departement");

    AccountabilityType appointment = new AccountabilityType ("appointment");
    AccountabilityType management = new AccountabilityType ("management");

    Party paul = new Person ("Paul Smith", employee);
    Party team = new Organization ("High-volume product development team", departement);
    Party head = new Post ("Head of the high-volume product development team", manager);

    Accountability.create(team, head, management);
    Accountability.create(head, paul, appointment);
  }

  @Test public void it_models_a_job_description () {
    PartyType surgeon = new PartyType ("surgeon");
    PartyType hospital = new PartyType ("hospital");
    AccountabilityType duties = new AccountabilityType ("duties");

    Post transplantSurgeon = new Post ("Transplant surgeon", surgeon);
    Organization stmarys = new Organization ("St. Mary's Hospital", hospital);
    Accountability jobDescription =
        Accountability.create(stmarys, transplantSurgeon, duties);

    OperatingScope liverTransplants = new ProtocolScope(20, "liver transplants", "St. Mary's");
    OperatingScope renalTransplants = new ProtocolScope(50, "renal transplants", "St. Mary's");
    jobDescription.addOperatingScope(renalTransplants);
    jobDescription.addOperatingScope(liverTransplants);
  }
}

// vim:ts=2:sw=2:

