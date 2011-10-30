package cq.uqam.mgl7361.analysispatterns.chap2;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestAccountability {
  @Test public void it_models_employment () {
    PartyType employer = new PartyType ("employer");
    PartyType employee = new PartyType ("employee");
    AccountabilityType employment = new AccountabilityType ("employment");

    Person john = new Person ("John Smith", employee);
    Organization acm = new Organization ("ACM", employer);
    Accountability.create(acm, john, employment);
  }

  @Test public void it_models_management () {
    PartyType branch = new PartyType ("branch");
    PartyType employee = new PartyType ("employee");
    AccountabilityType manager = new AccountabilityType ("manager");

    Person john = new Person ("John Smith", employee);
    Organization serviceTeam = new Organization ("Boston 2176 service team", branch);
    Accountability.create(serviceTeam, john, manager);
  }

  @Test public void it_models_registration () {
    PartyType professionalOrder = new PartyType ("professional order");
    PartyType professional = new PartyType ("professional");
    ConnectionAccountabilityType registration = new ConnectionAccountabilityType ("professional registration");
    registration.addConnectionRule(professionalOrder, professional);

    Person mark = new Person ("Mark Thursz", professional);
    Organization college = new Organization ("Royal College of Physicians", professionalOrder);
    Accountability.create(college, mark, registration);
  }

  @Test public void it_models_contracts () {
    PartyType clinic = new PartyType ("clinic");
    PartyType hospital = new PartyType ("hospital");
    ConnectionAccountabilityType endoscopyService = new ConnectionAccountabilityType ("endoscopy service");
    endoscopyService.addConnectionRule(clinic, hospital);

    Organization stmary = new Organization ("St. Mary's Hospital", hospital);
    Organization parkside = new Organization ("Parkside District Health Authority", clinic);
    TimePeriod allOf1996and1997 = new TimePeriod(
        new GregorianCalendar(1996, Calendar.JANUARY, 1),
        new GregorianCalendar(1997, Calendar.DECEMBER, 31));

    Accountability.create(parkside, stmary, endoscopyService)
        .setTimePeriod(allOf1996and1997);
  }

  @Test public void it_models_patient_consent () {
    PartyType patient = new PartyType ("patient");
    PartyType doctor = new PartyType ("doctor");
    ConnectionAccountabilityType patientConsent = new ConnectionAccountabilityType ("patient consent");
    patientConsent.addConnectionRule(patient, doctor);
  }
}

// vim:ts=2:sw=2

