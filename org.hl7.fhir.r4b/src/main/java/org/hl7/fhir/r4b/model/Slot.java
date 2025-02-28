package org.hl7.fhir.r4b.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Mon, Jun 13, 2022 17:19+0300 for FHIR v4.3.0

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r4b.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * A slot of time on a schedule that may be available for booking appointments.
 */
@ResourceDef(name = "Slot", profile = "http://hl7.org/fhir/StructureDefinition/Slot")
public class Slot extends DomainResource {

  public enum SlotStatus {
    /**
     * Indicates that the time interval is busy because one or more events have been
     * scheduled for that interval.
     */
    BUSY,
    /**
     * Indicates that the time interval is free for scheduling.
     */
    FREE,
    /**
     * Indicates that the time interval is busy and that the interval cannot be
     * scheduled.
     */
    BUSYUNAVAILABLE,
    /**
     * Indicates that the time interval is busy because one or more events have been
     * tentatively scheduled for that interval.
     */
    BUSYTENTATIVE,
    /**
     * This instance should not have been part of this patient's medical record.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static SlotStatus fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("busy".equals(codeString))
        return BUSY;
      if ("free".equals(codeString))
        return FREE;
      if ("busy-unavailable".equals(codeString))
        return BUSYUNAVAILABLE;
      if ("busy-tentative".equals(codeString))
        return BUSYTENTATIVE;
      if ("entered-in-error".equals(codeString))
        return ENTEREDINERROR;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown SlotStatus code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case BUSY:
        return "busy";
      case FREE:
        return "free";
      case BUSYUNAVAILABLE:
        return "busy-unavailable";
      case BUSYTENTATIVE:
        return "busy-tentative";
      case ENTEREDINERROR:
        return "entered-in-error";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case BUSY:
        return "http://hl7.org/fhir/slotstatus";
      case FREE:
        return "http://hl7.org/fhir/slotstatus";
      case BUSYUNAVAILABLE:
        return "http://hl7.org/fhir/slotstatus";
      case BUSYTENTATIVE:
        return "http://hl7.org/fhir/slotstatus";
      case ENTEREDINERROR:
        return "http://hl7.org/fhir/slotstatus";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case BUSY:
        return "Indicates that the time interval is busy because one  or more events have been scheduled for that interval.";
      case FREE:
        return "Indicates that the time interval is free for scheduling.";
      case BUSYUNAVAILABLE:
        return "Indicates that the time interval is busy and that the interval cannot be scheduled.";
      case BUSYTENTATIVE:
        return "Indicates that the time interval is busy because one or more events have been tentatively scheduled for that interval.";
      case ENTEREDINERROR:
        return "This instance should not have been part of this patient's medical record.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case BUSY:
        return "Busy";
      case FREE:
        return "Free";
      case BUSYUNAVAILABLE:
        return "Busy (Unavailable)";
      case BUSYTENTATIVE:
        return "Busy (Tentative)";
      case ENTEREDINERROR:
        return "Entered in error";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class SlotStatusEnumFactory implements EnumFactory<SlotStatus> {
    public SlotStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("busy".equals(codeString))
        return SlotStatus.BUSY;
      if ("free".equals(codeString))
        return SlotStatus.FREE;
      if ("busy-unavailable".equals(codeString))
        return SlotStatus.BUSYUNAVAILABLE;
      if ("busy-tentative".equals(codeString))
        return SlotStatus.BUSYTENTATIVE;
      if ("entered-in-error".equals(codeString))
        return SlotStatus.ENTEREDINERROR;
      throw new IllegalArgumentException("Unknown SlotStatus code '" + codeString + "'");
    }

    public Enumeration<SlotStatus> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<SlotStatus>(this, SlotStatus.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<SlotStatus>(this, SlotStatus.NULL, code);
      if ("busy".equals(codeString))
        return new Enumeration<SlotStatus>(this, SlotStatus.BUSY, code);
      if ("free".equals(codeString))
        return new Enumeration<SlotStatus>(this, SlotStatus.FREE, code);
      if ("busy-unavailable".equals(codeString))
        return new Enumeration<SlotStatus>(this, SlotStatus.BUSYUNAVAILABLE, code);
      if ("busy-tentative".equals(codeString))
        return new Enumeration<SlotStatus>(this, SlotStatus.BUSYTENTATIVE, code);
      if ("entered-in-error".equals(codeString))
        return new Enumeration<SlotStatus>(this, SlotStatus.ENTEREDINERROR, code);
      throw new FHIRException("Unknown SlotStatus code '" + codeString + "'");
    }

    public String toCode(SlotStatus code) {
      if (code == SlotStatus.BUSY)
        return "busy";
      if (code == SlotStatus.FREE)
        return "free";
      if (code == SlotStatus.BUSYUNAVAILABLE)
        return "busy-unavailable";
      if (code == SlotStatus.BUSYTENTATIVE)
        return "busy-tentative";
      if (code == SlotStatus.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
    }

    public String toSystem(SlotStatus code) {
      return code.getSystem();
    }
  }

  /**
   * External Ids for this item.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "External Ids for this item", formalDefinition = "External Ids for this item.")
  protected List<Identifier> identifier;

  /**
   * A broad categorization of the service that is to be performed during this
   * appointment.
   */
  @Child(name = "serviceCategory", type = {
      CodeableConcept.class }, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "A broad categorization of the service that is to be performed during this appointment", formalDefinition = "A broad categorization of the service that is to be performed during this appointment.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-category")
  protected List<CodeableConcept> serviceCategory;

  /**
   * The type of appointments that can be booked into this slot (ideally this
   * would be an identifiable service - which is at a location, rather than the
   * location itself). If provided then this overrides the value provided on the
   * availability resource.
   */
  @Child(name = "serviceType", type = {
      CodeableConcept.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource", formalDefinition = "The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-type")
  protected List<CodeableConcept> serviceType;

  /**
   * The specialty of a practitioner that would be required to perform the service
   * requested in this appointment.
   */
  @Child(name = "specialty", type = {
      CodeableConcept.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "The specialty of a practitioner that would be required to perform the service requested in this appointment", formalDefinition = "The specialty of a practitioner that would be required to perform the service requested in this appointment.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/c80-practice-codes")
  protected List<CodeableConcept> specialty;

  /**
   * The style of appointment or patient that may be booked in the slot (not
   * service type).
   */
  @Child(name = "appointmentType", type = {
      CodeableConcept.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "The style of appointment or patient that may be booked in the slot (not service type)", formalDefinition = "The style of appointment or patient that may be booked in the slot (not service type).")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-0276")
  protected CodeableConcept appointmentType;

  /**
   * The schedule resource that this slot defines an interval of status
   * information.
   */
  @Child(name = "schedule", type = { Schedule.class }, order = 5, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "The schedule resource that this slot defines an interval of status information", formalDefinition = "The schedule resource that this slot defines an interval of status information.")
  protected Reference schedule;

  /**
   * busy | free | busy-unavailable | busy-tentative | entered-in-error.
   */
  @Child(name = "status", type = { CodeType.class }, order = 6, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "busy | free | busy-unavailable | busy-tentative | entered-in-error", formalDefinition = "busy | free | busy-unavailable | busy-tentative | entered-in-error.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/slotstatus")
  protected Enumeration<SlotStatus> status;

  /**
   * Date/Time that the slot is to begin.
   */
  @Child(name = "start", type = { InstantType.class }, order = 7, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Date/Time that the slot is to begin", formalDefinition = "Date/Time that the slot is to begin.")
  protected InstantType start;

  /**
   * Date/Time that the slot is to conclude.
   */
  @Child(name = "end", type = { InstantType.class }, order = 8, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Date/Time that the slot is to conclude", formalDefinition = "Date/Time that the slot is to conclude.")
  protected InstantType end;

  /**
   * This slot has already been overbooked, appointments are unlikely to be
   * accepted for this time.
   */
  @Child(name = "overbooked", type = {
      BooleanType.class }, order = 9, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "This slot has already been overbooked, appointments are unlikely to be accepted for this time", formalDefinition = "This slot has already been overbooked, appointments are unlikely to be accepted for this time.")
  protected BooleanType overbooked;

  /**
   * Comments on the slot to describe any extended information. Such as custom
   * constraints on the slot.
   */
  @Child(name = "comment", type = { StringType.class }, order = 10, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Comments on the slot to describe any extended information. Such as custom constraints on the slot", formalDefinition = "Comments on the slot to describe any extended information. Such as custom constraints on the slot.")
  protected StringType comment;

  private static final long serialVersionUID = -426965191L;

  /**
   * Constructor
   */
  public Slot() {
    super();
  }

  /**
   * Constructor
   */
  public Slot(Reference schedule, SlotStatus status, Date start, Date end) {
    super();
    this.setSchedule(schedule);
    this.setStatus(status);
    this.setStart(start);
    this.setEnd(end);
  }

  /**
   * @return {@link #identifier} (External Ids for this item.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Slot setIdentifier(List<Identifier> theIdentifier) {
    this.identifier = theIdentifier;
    return this;
  }

  public boolean hasIdentifier() {
    if (this.identifier == null)
      return false;
    for (Identifier item : this.identifier)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Identifier addIdentifier() { // 3
    Identifier t = new Identifier();
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return t;
  }

  public Slot addIdentifier(Identifier t) { // 3
    if (t == null)
      return this;
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #identifier}, creating
   *         it if it does not already exist {3}
   */
  public Identifier getIdentifierFirstRep() {
    if (getIdentifier().isEmpty()) {
      addIdentifier();
    }
    return getIdentifier().get(0);
  }

  /**
   * @return {@link #serviceCategory} (A broad categorization of the service that
   *         is to be performed during this appointment.)
   */
  public List<CodeableConcept> getServiceCategory() {
    if (this.serviceCategory == null)
      this.serviceCategory = new ArrayList<CodeableConcept>();
    return this.serviceCategory;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Slot setServiceCategory(List<CodeableConcept> theServiceCategory) {
    this.serviceCategory = theServiceCategory;
    return this;
  }

  public boolean hasServiceCategory() {
    if (this.serviceCategory == null)
      return false;
    for (CodeableConcept item : this.serviceCategory)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addServiceCategory() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.serviceCategory == null)
      this.serviceCategory = new ArrayList<CodeableConcept>();
    this.serviceCategory.add(t);
    return t;
  }

  public Slot addServiceCategory(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.serviceCategory == null)
      this.serviceCategory = new ArrayList<CodeableConcept>();
    this.serviceCategory.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #serviceCategory},
   *         creating it if it does not already exist {3}
   */
  public CodeableConcept getServiceCategoryFirstRep() {
    if (getServiceCategory().isEmpty()) {
      addServiceCategory();
    }
    return getServiceCategory().get(0);
  }

  /**
   * @return {@link #serviceType} (The type of appointments that can be booked
   *         into this slot (ideally this would be an identifiable service - which
   *         is at a location, rather than the location itself). If provided then
   *         this overrides the value provided on the availability resource.)
   */
  public List<CodeableConcept> getServiceType() {
    if (this.serviceType == null)
      this.serviceType = new ArrayList<CodeableConcept>();
    return this.serviceType;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Slot setServiceType(List<CodeableConcept> theServiceType) {
    this.serviceType = theServiceType;
    return this;
  }

  public boolean hasServiceType() {
    if (this.serviceType == null)
      return false;
    for (CodeableConcept item : this.serviceType)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addServiceType() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.serviceType == null)
      this.serviceType = new ArrayList<CodeableConcept>();
    this.serviceType.add(t);
    return t;
  }

  public Slot addServiceType(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.serviceType == null)
      this.serviceType = new ArrayList<CodeableConcept>();
    this.serviceType.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #serviceType},
   *         creating it if it does not already exist {3}
   */
  public CodeableConcept getServiceTypeFirstRep() {
    if (getServiceType().isEmpty()) {
      addServiceType();
    }
    return getServiceType().get(0);
  }

  /**
   * @return {@link #specialty} (The specialty of a practitioner that would be
   *         required to perform the service requested in this appointment.)
   */
  public List<CodeableConcept> getSpecialty() {
    if (this.specialty == null)
      this.specialty = new ArrayList<CodeableConcept>();
    return this.specialty;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Slot setSpecialty(List<CodeableConcept> theSpecialty) {
    this.specialty = theSpecialty;
    return this;
  }

  public boolean hasSpecialty() {
    if (this.specialty == null)
      return false;
    for (CodeableConcept item : this.specialty)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addSpecialty() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.specialty == null)
      this.specialty = new ArrayList<CodeableConcept>();
    this.specialty.add(t);
    return t;
  }

  public Slot addSpecialty(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.specialty == null)
      this.specialty = new ArrayList<CodeableConcept>();
    this.specialty.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #specialty}, creating
   *         it if it does not already exist {3}
   */
  public CodeableConcept getSpecialtyFirstRep() {
    if (getSpecialty().isEmpty()) {
      addSpecialty();
    }
    return getSpecialty().get(0);
  }

  /**
   * @return {@link #appointmentType} (The style of appointment or patient that
   *         may be booked in the slot (not service type).)
   */
  public CodeableConcept getAppointmentType() {
    if (this.appointmentType == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Slot.appointmentType");
      else if (Configuration.doAutoCreate())
        this.appointmentType = new CodeableConcept(); // cc
    return this.appointmentType;
  }

  public boolean hasAppointmentType() {
    return this.appointmentType != null && !this.appointmentType.isEmpty();
  }

  /**
   * @param value {@link #appointmentType} (The style of appointment or patient
   *              that may be booked in the slot (not service type).)
   */
  public Slot setAppointmentType(CodeableConcept value) {
    this.appointmentType = value;
    return this;
  }

  /**
   * @return {@link #schedule} (The schedule resource that this slot defines an
   *         interval of status information.)
   */
  public Reference getSchedule() {
    if (this.schedule == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Slot.schedule");
      else if (Configuration.doAutoCreate())
        this.schedule = new Reference(); // cc
    return this.schedule;
  }

  public boolean hasSchedule() {
    return this.schedule != null && !this.schedule.isEmpty();
  }

  /**
   * @param value {@link #schedule} (The schedule resource that this slot defines
   *              an interval of status information.)
   */
  public Slot setSchedule(Reference value) {
    this.schedule = value;
    return this;
  }

  /**
   * @return {@link #status} (busy | free | busy-unavailable | busy-tentative |
   *         entered-in-error.). This is the underlying object with id, value and
   *         extensions. The accessor "getStatus" gives direct access to the value
   */
  public Enumeration<SlotStatus> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Slot.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<SlotStatus>(new SlotStatusEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (busy | free | busy-unavailable | busy-tentative
   *              | entered-in-error.). This is the underlying object with id,
   *              value and extensions. The accessor "getStatus" gives direct
   *              access to the value
   */
  public Slot setStatusElement(Enumeration<SlotStatus> value) {
    this.status = value;
    return this;
  }

  /**
   * @return busy | free | busy-unavailable | busy-tentative | entered-in-error.
   */
  public SlotStatus getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value busy | free | busy-unavailable | busy-tentative |
   *              entered-in-error.
   */
  public Slot setStatus(SlotStatus value) {
    if (this.status == null)
      this.status = new Enumeration<SlotStatus>(new SlotStatusEnumFactory());
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #start} (Date/Time that the slot is to begin.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getStart" gives direct access to the value
   */
  public InstantType getStartElement() {
    if (this.start == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Slot.start");
      else if (Configuration.doAutoCreate())
        this.start = new InstantType(); // bb
    return this.start;
  }

  public boolean hasStartElement() {
    return this.start != null && !this.start.isEmpty();
  }

  public boolean hasStart() {
    return this.start != null && !this.start.isEmpty();
  }

  /**
   * @param value {@link #start} (Date/Time that the slot is to begin.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getStart" gives direct access to the value
   */
  public Slot setStartElement(InstantType value) {
    this.start = value;
    return this;
  }

  /**
   * @return Date/Time that the slot is to begin.
   */
  public Date getStart() {
    return this.start == null ? null : this.start.getValue();
  }

  /**
   * @param value Date/Time that the slot is to begin.
   */
  public Slot setStart(Date value) {
    if (this.start == null)
      this.start = new InstantType();
    this.start.setValue(value);
    return this;
  }

  /**
   * @return {@link #end} (Date/Time that the slot is to conclude.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getEnd" gives direct access to the value
   */
  public InstantType getEndElement() {
    if (this.end == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Slot.end");
      else if (Configuration.doAutoCreate())
        this.end = new InstantType(); // bb
    return this.end;
  }

  public boolean hasEndElement() {
    return this.end != null && !this.end.isEmpty();
  }

  public boolean hasEnd() {
    return this.end != null && !this.end.isEmpty();
  }

  /**
   * @param value {@link #end} (Date/Time that the slot is to conclude.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getEnd" gives direct access to the value
   */
  public Slot setEndElement(InstantType value) {
    this.end = value;
    return this;
  }

  /**
   * @return Date/Time that the slot is to conclude.
   */
  public Date getEnd() {
    return this.end == null ? null : this.end.getValue();
  }

  /**
   * @param value Date/Time that the slot is to conclude.
   */
  public Slot setEnd(Date value) {
    if (this.end == null)
      this.end = new InstantType();
    this.end.setValue(value);
    return this;
  }

  /**
   * @return {@link #overbooked} (This slot has already been overbooked,
   *         appointments are unlikely to be accepted for this time.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getOverbooked" gives direct access to the value
   */
  public BooleanType getOverbookedElement() {
    if (this.overbooked == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Slot.overbooked");
      else if (Configuration.doAutoCreate())
        this.overbooked = new BooleanType(); // bb
    return this.overbooked;
  }

  public boolean hasOverbookedElement() {
    return this.overbooked != null && !this.overbooked.isEmpty();
  }

  public boolean hasOverbooked() {
    return this.overbooked != null && !this.overbooked.isEmpty();
  }

  /**
   * @param value {@link #overbooked} (This slot has already been overbooked,
   *              appointments are unlikely to be accepted for this time.). This
   *              is the underlying object with id, value and extensions. The
   *              accessor "getOverbooked" gives direct access to the value
   */
  public Slot setOverbookedElement(BooleanType value) {
    this.overbooked = value;
    return this;
  }

  /**
   * @return This slot has already been overbooked, appointments are unlikely to
   *         be accepted for this time.
   */
  public boolean getOverbooked() {
    return this.overbooked == null || this.overbooked.isEmpty() ? false : this.overbooked.getValue();
  }

  /**
   * @param value This slot has already been overbooked, appointments are unlikely
   *              to be accepted for this time.
   */
  public Slot setOverbooked(boolean value) {
    if (this.overbooked == null)
      this.overbooked = new BooleanType();
    this.overbooked.setValue(value);
    return this;
  }

  /**
   * @return {@link #comment} (Comments on the slot to describe any extended
   *         information. Such as custom constraints on the slot.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getComment" gives direct access to the value
   */
  public StringType getCommentElement() {
    if (this.comment == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Slot.comment");
      else if (Configuration.doAutoCreate())
        this.comment = new StringType(); // bb
    return this.comment;
  }

  public boolean hasCommentElement() {
    return this.comment != null && !this.comment.isEmpty();
  }

  public boolean hasComment() {
    return this.comment != null && !this.comment.isEmpty();
  }

  /**
   * @param value {@link #comment} (Comments on the slot to describe any extended
   *              information. Such as custom constraints on the slot.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getComment" gives direct access to the value
   */
  public Slot setCommentElement(StringType value) {
    this.comment = value;
    return this;
  }

  /**
   * @return Comments on the slot to describe any extended information. Such as
   *         custom constraints on the slot.
   */
  public String getComment() {
    return this.comment == null ? null : this.comment.getValue();
  }

  /**
   * @param value Comments on the slot to describe any extended information. Such
   *              as custom constraints on the slot.
   */
  public Slot setComment(String value) {
    if (Utilities.noString(value))
      this.comment = null;
    else {
      if (this.comment == null)
        this.comment = new StringType();
      this.comment.setValue(value);
    }
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier", "External Ids for this item.", 0, java.lang.Integer.MAX_VALUE,
        identifier));
    children.add(new Property("serviceCategory", "CodeableConcept",
        "A broad categorization of the service that is to be performed during this appointment.", 0,
        java.lang.Integer.MAX_VALUE, serviceCategory));
    children.add(new Property("serviceType", "CodeableConcept",
        "The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.",
        0, java.lang.Integer.MAX_VALUE, serviceType));
    children.add(new Property("specialty", "CodeableConcept",
        "The specialty of a practitioner that would be required to perform the service requested in this appointment.",
        0, java.lang.Integer.MAX_VALUE, specialty));
    children.add(new Property("appointmentType", "CodeableConcept",
        "The style of appointment or patient that may be booked in the slot (not service type).", 0, 1,
        appointmentType));
    children.add(new Property("schedule", "Reference(Schedule)",
        "The schedule resource that this slot defines an interval of status information.", 0, 1, schedule));
    children.add(new Property("status", "code", "busy | free | busy-unavailable | busy-tentative | entered-in-error.",
        0, 1, status));
    children.add(new Property("start", "instant", "Date/Time that the slot is to begin.", 0, 1, start));
    children.add(new Property("end", "instant", "Date/Time that the slot is to conclude.", 0, 1, end));
    children.add(new Property("overbooked", "boolean",
        "This slot has already been overbooked, appointments are unlikely to be accepted for this time.", 0, 1,
        overbooked));
    children.add(new Property("comment", "string",
        "Comments on the slot to describe any extended information. Such as custom constraints on the slot.", 0, 1,
        comment));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier", "External Ids for this item.", 0,
          java.lang.Integer.MAX_VALUE, identifier);
    case 1281188563:
      /* serviceCategory */ return new Property("serviceCategory", "CodeableConcept",
          "A broad categorization of the service that is to be performed during this appointment.", 0,
          java.lang.Integer.MAX_VALUE, serviceCategory);
    case -1928370289:
      /* serviceType */ return new Property("serviceType", "CodeableConcept",
          "The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.",
          0, java.lang.Integer.MAX_VALUE, serviceType);
    case -1694759682:
      /* specialty */ return new Property("specialty", "CodeableConcept",
          "The specialty of a practitioner that would be required to perform the service requested in this appointment.",
          0, java.lang.Integer.MAX_VALUE, specialty);
    case -1596426375:
      /* appointmentType */ return new Property("appointmentType", "CodeableConcept",
          "The style of appointment or patient that may be booked in the slot (not service type).", 0, 1,
          appointmentType);
    case -697920873:
      /* schedule */ return new Property("schedule", "Reference(Schedule)",
          "The schedule resource that this slot defines an interval of status information.", 0, 1, schedule);
    case -892481550:
      /* status */ return new Property("status", "code",
          "busy | free | busy-unavailable | busy-tentative | entered-in-error.", 0, 1, status);
    case 109757538:
      /* start */ return new Property("start", "instant", "Date/Time that the slot is to begin.", 0, 1, start);
    case 100571:
      /* end */ return new Property("end", "instant", "Date/Time that the slot is to conclude.", 0, 1, end);
    case 2068545308:
      /* overbooked */ return new Property("overbooked", "boolean",
          "This slot has already been overbooked, appointments are unlikely to be accepted for this time.", 0, 1,
          overbooked);
    case 950398559:
      /* comment */ return new Property("comment", "string",
          "Comments on the slot to describe any extended information. Such as custom constraints on the slot.", 0, 1,
          comment);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return this.identifier == null ? new Base[0]
          : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
    case 1281188563:
      /* serviceCategory */ return this.serviceCategory == null ? new Base[0]
          : this.serviceCategory.toArray(new Base[this.serviceCategory.size()]); // CodeableConcept
    case -1928370289:
      /* serviceType */ return this.serviceType == null ? new Base[0]
          : this.serviceType.toArray(new Base[this.serviceType.size()]); // CodeableConcept
    case -1694759682:
      /* specialty */ return this.specialty == null ? new Base[0]
          : this.specialty.toArray(new Base[this.specialty.size()]); // CodeableConcept
    case -1596426375:
      /* appointmentType */ return this.appointmentType == null ? new Base[0] : new Base[] { this.appointmentType }; // CodeableConcept
    case -697920873:
      /* schedule */ return this.schedule == null ? new Base[0] : new Base[] { this.schedule }; // Reference
    case -892481550:
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<SlotStatus>
    case 109757538:
      /* start */ return this.start == null ? new Base[0] : new Base[] { this.start }; // InstantType
    case 100571:
      /* end */ return this.end == null ? new Base[0] : new Base[] { this.end }; // InstantType
    case 2068545308:
      /* overbooked */ return this.overbooked == null ? new Base[0] : new Base[] { this.overbooked }; // BooleanType
    case 950398559:
      /* comment */ return this.comment == null ? new Base[0] : new Base[] { this.comment }; // StringType
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case -1618432855: // identifier
      this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
      return value;
    case 1281188563: // serviceCategory
      this.getServiceCategory().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1928370289: // serviceType
      this.getServiceType().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1694759682: // specialty
      this.getSpecialty().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1596426375: // appointmentType
      this.appointmentType = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      return value;
    case -697920873: // schedule
      this.schedule = TypeConvertor.castToReference(value); // Reference
      return value;
    case -892481550: // status
      value = new SlotStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
      this.status = (Enumeration) value; // Enumeration<SlotStatus>
      return value;
    case 109757538: // start
      this.start = TypeConvertor.castToInstant(value); // InstantType
      return value;
    case 100571: // end
      this.end = TypeConvertor.castToInstant(value); // InstantType
      return value;
    case 2068545308: // overbooked
      this.overbooked = TypeConvertor.castToBoolean(value); // BooleanType
      return value;
    case 950398559: // comment
      this.comment = TypeConvertor.castToString(value); // StringType
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
    } else if (name.equals("serviceCategory")) {
      this.getServiceCategory().add(TypeConvertor.castToCodeableConcept(value));
    } else if (name.equals("serviceType")) {
      this.getServiceType().add(TypeConvertor.castToCodeableConcept(value));
    } else if (name.equals("specialty")) {
      this.getSpecialty().add(TypeConvertor.castToCodeableConcept(value));
    } else if (name.equals("appointmentType")) {
      this.appointmentType = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("schedule")) {
      this.schedule = TypeConvertor.castToReference(value); // Reference
    } else if (name.equals("status")) {
      value = new SlotStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
      this.status = (Enumeration) value; // Enumeration<SlotStatus>
    } else if (name.equals("start")) {
      this.start = TypeConvertor.castToInstant(value); // InstantType
    } else if (name.equals("end")) {
      this.end = TypeConvertor.castToInstant(value); // InstantType
    } else if (name.equals("overbooked")) {
      this.overbooked = TypeConvertor.castToBoolean(value); // BooleanType
    } else if (name.equals("comment")) {
      this.comment = TypeConvertor.castToString(value); // StringType
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      return addIdentifier();
    case 1281188563:
      return addServiceCategory();
    case -1928370289:
      return addServiceType();
    case -1694759682:
      return addSpecialty();
    case -1596426375:
      return getAppointmentType();
    case -697920873:
      return getSchedule();
    case -892481550:
      return getStatusElement();
    case 109757538:
      return getStartElement();
    case 100571:
      return getEndElement();
    case 2068545308:
      return getOverbookedElement();
    case 950398559:
      return getCommentElement();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return new String[] { "Identifier" };
    case 1281188563:
      /* serviceCategory */ return new String[] { "CodeableConcept" };
    case -1928370289:
      /* serviceType */ return new String[] { "CodeableConcept" };
    case -1694759682:
      /* specialty */ return new String[] { "CodeableConcept" };
    case -1596426375:
      /* appointmentType */ return new String[] { "CodeableConcept" };
    case -697920873:
      /* schedule */ return new String[] { "Reference" };
    case -892481550:
      /* status */ return new String[] { "code" };
    case 109757538:
      /* start */ return new String[] { "instant" };
    case 100571:
      /* end */ return new String[] { "instant" };
    case 2068545308:
      /* overbooked */ return new String[] { "boolean" };
    case 950398559:
      /* comment */ return new String[] { "string" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("serviceCategory")) {
      return addServiceCategory();
    } else if (name.equals("serviceType")) {
      return addServiceType();
    } else if (name.equals("specialty")) {
      return addSpecialty();
    } else if (name.equals("appointmentType")) {
      this.appointmentType = new CodeableConcept();
      return this.appointmentType;
    } else if (name.equals("schedule")) {
      this.schedule = new Reference();
      return this.schedule;
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property Slot.status");
    } else if (name.equals("start")) {
      throw new FHIRException("Cannot call addChild on a singleton property Slot.start");
    } else if (name.equals("end")) {
      throw new FHIRException("Cannot call addChild on a singleton property Slot.end");
    } else if (name.equals("overbooked")) {
      throw new FHIRException("Cannot call addChild on a singleton property Slot.overbooked");
    } else if (name.equals("comment")) {
      throw new FHIRException("Cannot call addChild on a singleton property Slot.comment");
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "Slot";

  }

  public Slot copy() {
    Slot dst = new Slot();
    copyValues(dst);
    return dst;
  }

  public void copyValues(Slot dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    if (serviceCategory != null) {
      dst.serviceCategory = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : serviceCategory)
        dst.serviceCategory.add(i.copy());
    }
    ;
    if (serviceType != null) {
      dst.serviceType = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : serviceType)
        dst.serviceType.add(i.copy());
    }
    ;
    if (specialty != null) {
      dst.specialty = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : specialty)
        dst.specialty.add(i.copy());
    }
    ;
    dst.appointmentType = appointmentType == null ? null : appointmentType.copy();
    dst.schedule = schedule == null ? null : schedule.copy();
    dst.status = status == null ? null : status.copy();
    dst.start = start == null ? null : start.copy();
    dst.end = end == null ? null : end.copy();
    dst.overbooked = overbooked == null ? null : overbooked.copy();
    dst.comment = comment == null ? null : comment.copy();
  }

  protected Slot typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof Slot))
      return false;
    Slot o = (Slot) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(serviceCategory, o.serviceCategory, true)
        && compareDeep(serviceType, o.serviceType, true) && compareDeep(specialty, o.specialty, true)
        && compareDeep(appointmentType, o.appointmentType, true) && compareDeep(schedule, o.schedule, true)
        && compareDeep(status, o.status, true) && compareDeep(start, o.start, true) && compareDeep(end, o.end, true)
        && compareDeep(overbooked, o.overbooked, true) && compareDeep(comment, o.comment, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof Slot))
      return false;
    Slot o = (Slot) other_;
    return compareValues(status, o.status, true) && compareValues(start, o.start, true)
        && compareValues(end, o.end, true) && compareValues(overbooked, o.overbooked, true)
        && compareValues(comment, o.comment, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, serviceCategory, serviceType, specialty,
        appointmentType, schedule, status, start, end, overbooked, comment);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Slot;
  }

  /**
   * Search parameter: <b>appointment-type</b>
   * <p>
   * Description: <b>The style of appointment or patient that may be booked in the
   * slot (not service type)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.appointmentType</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "appointment-type", path = "Slot.appointmentType", description = "The style of appointment or patient that may be booked in the slot (not service type)", type = "token")
  public static final String SP_APPOINTMENT_TYPE = "appointment-type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>appointment-type</b>
   * <p>
   * Description: <b>The style of appointment or patient that may be booked in the
   * slot (not service type)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.appointmentType</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam APPOINTMENT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_APPOINTMENT_TYPE);

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>A Slot Identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "Slot.identifier", description = "A Slot Identifier", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>A Slot Identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>schedule</b>
   * <p>
   * Description: <b>The Schedule Resource that we are seeking a slot
   * within</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Slot.schedule</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "schedule", path = "Slot.schedule", description = "The Schedule Resource that we are seeking a slot within", type = "reference", target = {
      Schedule.class })
  public static final String SP_SCHEDULE = "schedule";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>schedule</b>
   * <p>
   * Description: <b>The Schedule Resource that we are seeking a slot
   * within</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Slot.schedule</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SCHEDULE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_SCHEDULE);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Slot:schedule</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SCHEDULE = new ca.uhn.fhir.model.api.Include(
      "Slot:schedule").toLocked();

  /**
   * Search parameter: <b>service-category</b>
   * <p>
   * Description: <b>A broad categorization of the service that is to be performed
   * during this appointment</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.serviceCategory</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "service-category", path = "Slot.serviceCategory", description = "A broad categorization of the service that is to be performed during this appointment", type = "token")
  public static final String SP_SERVICE_CATEGORY = "service-category";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>service-category</b>
   * <p>
   * Description: <b>A broad categorization of the service that is to be performed
   * during this appointment</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.serviceCategory</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SERVICE_CATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_SERVICE_CATEGORY);

  /**
   * Search parameter: <b>service-type</b>
   * <p>
   * Description: <b>The type of appointments that can be booked into the
   * slot</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.serviceType</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "service-type", path = "Slot.serviceType", description = "The type of appointments that can be booked into the slot", type = "token")
  public static final String SP_SERVICE_TYPE = "service-type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>service-type</b>
   * <p>
   * Description: <b>The type of appointments that can be booked into the
   * slot</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.serviceType</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SERVICE_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_SERVICE_TYPE);

  /**
   * Search parameter: <b>specialty</b>
   * <p>
   * Description: <b>The specialty of a practitioner that would be required to
   * perform the service requested in this appointment</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.specialty</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "specialty", path = "Slot.specialty", description = "The specialty of a practitioner that would be required to perform the service requested in this appointment", type = "token")
  public static final String SP_SPECIALTY = "specialty";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>specialty</b>
   * <p>
   * Description: <b>The specialty of a practitioner that would be required to
   * perform the service requested in this appointment</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.specialty</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SPECIALTY = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_SPECIALTY);

  /**
   * Search parameter: <b>start</b>
   * <p>
   * Description: <b>Appointment date/time.</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Slot.start</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "start", path = "Slot.start", description = "Appointment date/time.", type = "date")
  public static final String SP_START = "start";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>start</b>
   * <p>
   * Description: <b>Appointment date/time.</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Slot.start</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam START = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_START);

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The free/busy status of the appointment</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "Slot.status", description = "The free/busy status of the appointment", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The free/busy status of the appointment</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Slot.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

}
