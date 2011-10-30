package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;
import org.junit.*;
import static java.util.Calendar.*;
import static org.junit.Assert.*;

public class TestAccountability {
  @Test public void it_models_employment () {
    Person john = new Person ("John Smith");
    Organization acm = new Organization ("ACM");
    AccountabilityType employment = new AccountabilityType ("employment");

    Accountability.create(acm, john, employment);
  }

  @Test public void it_models_management () {
    Person john = new Person ("John Smith");
    Organization serviceTeam = new Organization ("Boston 2176 service team");
    AccountabilityType manager = new AccountabilityType ("manager");

    Accountability.create(serviceTeam, john, manager);
  }

  @Test public void it_models_registration () {
    Person mark = new Person ("Mark Thursz");
    Organization college = new Organization ("Royal College of Physicians");
    AccountabilityType registration = new AccountabilityType ("professional registration");

    Accountability.create(college, mark, registration);
  }

  @Test public void it_models_contracts () {
    Organization stmary = new Organization ("St. Mary's Hospital");
    Organization parkside = new Organization ("Parkside District Health Authority");
    AccountabilityType endoscopyService = new AccountabilityType ("endoscopy service");
    TimePeriod allOf1996and1997 = new TimePeriod(
        new GregorianCalendar(1996, JANUARY, 01),
        new GregorianCalendar(1997, DECEMBER, 31));

    Accountability.create(parkside, stmary, endoscopyService)
        .setTimePeriod(allOf1996and1997);
  }
}

// vim:ts=2:sw=2

