package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOrganizationHierarchy {
  @Test public void it_models_a_hierarchy () {
    PartyType operatingUnit = new PartyType ("operating unit");
    PartyType region = new PartyType ("region");
    PartyType division = new PartyType ("division");
    PartyType salesOffice = new PartyType ("sales office");

    LeveledAccountabilityType acm_hierarchy = new LeveledAccountabilityType ("the ACM hierarchy");
    acm_hierarchy.setLevels(Arrays.asList( operatingUnit, region, division, salesOffice ));

    Organization op = new Organization ("some operating unit", operatingUnit);
    Organization reg = new Organization ("some regionnal unit", region);
    Organization div = new Organization ("some division", division);
    Organization office = new Organization ("some office", salesOffice);

    Accountability.create(op, reg, acm_hierarchy);
    Accountability.create(reg, div, acm_hierarchy);
    Accountability.create(div, office, acm_hierarchy);
  }
}

// vim:ts=2:sw=2
