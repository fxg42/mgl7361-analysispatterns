package cq.uqam.mgl7361.analysispatterns.chap2;

import org.junit.*;
import static org.junit.Assert.*;

public class TestOrganizationHierarchy {

  @Test public void regions_are_divided_into_divisions () {
    PartyType region = new PartyType ("region");
    PartyType division = new PartyType ("division");
    ConnectionAccountabilityType region_into_division =
        new ConnectionAccountabilityType ("regions into divisions");
    region_into_division.addConnectionRule(region, division);
  }
}

// vim:ts=2:sw=2
