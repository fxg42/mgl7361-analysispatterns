package cq.uqam.mgl7361.analysispatterns.chap2;

import org.junit.*;
import static org.junit.Assert.*;

public class TestOrganizationHierarchy {

  @Test public void it_builds_hierarchies () {
    Organization region = new Organization("region");
    Organization division = new Organization("division", region);
    Organization bureau = new Organization("bureau", division);

    assertEquals(division, bureau.getParent());
    assertEquals(region, division.getParent());
    assertNull(region.getParent());
  }

  @Test(expected=IllegalArgumentException.class) public void it_ensures_dag () {
    Organization region = new Organization("region");
    Organization division = new Organization("division", region);
    Organization bureau = new Organization("bureau", division);
    region.setParent(bureau);
  }
}

// vim:ts=2:sw=2
