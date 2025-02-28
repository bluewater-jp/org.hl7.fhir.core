package org.hl7.fhir.r4.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.utilities.Utilities;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;

/**
 * Details for all kinds of technology mediated contact points for a person or
 * organization, including telephone, email, etc.
 */
@DatatypeDef(name = "ContactPoint")
public class ContactPoint extends Type implements ICompositeType {

  public enum ContactPointSystem {
    /**
     * The value is a telephone number used for voice calls. Use of full
     * international numbers starting with + is recommended to enable automatic
     * dialing support but not required.
     */
    PHONE,
    /**
     * The value is a fax machine. Use of full international numbers starting with +
     * is recommended to enable automatic dialing support but not required.
     */
    FAX,
    /**
     * The value is an email address.
     */
    EMAIL,
    /**
     * The value is a pager number. These may be local pager numbers that are only
     * usable on a particular pager system.
     */
    PAGER,
    /**
     * A contact that is not a phone, fax, pager or email address and is expressed
     * as a URL. This is intended for various institutional or personal contacts
     * including web sites, blogs, Skype, Twitter, Facebook, etc. Do not use for
     * email addresses.
     */
    URL,
    /**
     * A contact that can be used for sending an sms message (e.g. mobile phones,
     * some landlines).
     */
    SMS,
    /**
     * A contact that is not a phone, fax, page or email address and is not
     * expressible as a URL. E.g. Internal mail address. This SHOULD NOT be used for
     * contacts that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)
     * Extensions may be used to distinguish "other" contact types.
     */
    OTHER,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static ContactPointSystem fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("phone".equals(codeString))
        return PHONE;
      if ("fax".equals(codeString))
        return FAX;
      if ("email".equals(codeString))
        return EMAIL;
      if ("pager".equals(codeString))
        return PAGER;
      if ("url".equals(codeString))
        return URL;
      if ("sms".equals(codeString))
        return SMS;
      if ("other".equals(codeString))
        return OTHER;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown ContactPointSystem code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case PHONE:
        return "phone";
      case FAX:
        return "fax";
      case EMAIL:
        return "email";
      case PAGER:
        return "pager";
      case URL:
        return "url";
      case SMS:
        return "sms";
      case OTHER:
        return "other";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case PHONE:
        return "http://hl7.org/fhir/contact-point-system";
      case FAX:
        return "http://hl7.org/fhir/contact-point-system";
      case EMAIL:
        return "http://hl7.org/fhir/contact-point-system";
      case PAGER:
        return "http://hl7.org/fhir/contact-point-system";
      case URL:
        return "http://hl7.org/fhir/contact-point-system";
      case SMS:
        return "http://hl7.org/fhir/contact-point-system";
      case OTHER:
        return "http://hl7.org/fhir/contact-point-system";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case PHONE:
        return "The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.";
      case FAX:
        return "The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.";
      case EMAIL:
        return "The value is an email address.";
      case PAGER:
        return "The value is a pager number. These may be local pager numbers that are only usable on a particular pager system.";
      case URL:
        return "A contact that is not a phone, fax, pager or email address and is expressed as a URL.  This is intended for various institutional or personal contacts including web sites, blogs, Skype, Twitter, Facebook, etc. Do not use for email addresses.";
      case SMS:
        return "A contact that can be used for sending an sms message (e.g. mobile phones, some landlines).";
      case OTHER:
        return "A contact that is not a phone, fax, page or email address and is not expressible as a URL.  E.g. Internal mail address.  This SHOULD NOT be used for contacts that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)  Extensions may be used to distinguish \"other\" contact types.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case PHONE:
        return "Phone";
      case FAX:
        return "Fax";
      case EMAIL:
        return "Email";
      case PAGER:
        return "Pager";
      case URL:
        return "URL";
      case SMS:
        return "SMS";
      case OTHER:
        return "Other";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class ContactPointSystemEnumFactory implements EnumFactory<ContactPointSystem> {
    public ContactPointSystem fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("phone".equals(codeString))
        return ContactPointSystem.PHONE;
      if ("fax".equals(codeString))
        return ContactPointSystem.FAX;
      if ("email".equals(codeString))
        return ContactPointSystem.EMAIL;
      if ("pager".equals(codeString))
        return ContactPointSystem.PAGER;
      if ("url".equals(codeString))
        return ContactPointSystem.URL;
      if ("sms".equals(codeString))
        return ContactPointSystem.SMS;
      if ("other".equals(codeString))
        return ContactPointSystem.OTHER;
      throw new IllegalArgumentException("Unknown ContactPointSystem code '" + codeString + "'");
    }

    public Enumeration<ContactPointSystem> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.NULL, code);
      if ("phone".equals(codeString))
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.PHONE, code);
      if ("fax".equals(codeString))
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.FAX, code);
      if ("email".equals(codeString))
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.EMAIL, code);
      if ("pager".equals(codeString))
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.PAGER, code);
      if ("url".equals(codeString))
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.URL, code);
      if ("sms".equals(codeString))
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.SMS, code);
      if ("other".equals(codeString))
        return new Enumeration<ContactPointSystem>(this, ContactPointSystem.OTHER, code);
      throw new FHIRException("Unknown ContactPointSystem code '" + codeString + "'");
    }

    public String toCode(ContactPointSystem code) {
      if (code == ContactPointSystem.PHONE)
        return "phone";
      if (code == ContactPointSystem.FAX)
        return "fax";
      if (code == ContactPointSystem.EMAIL)
        return "email";
      if (code == ContactPointSystem.PAGER)
        return "pager";
      if (code == ContactPointSystem.URL)
        return "url";
      if (code == ContactPointSystem.SMS)
        return "sms";
      if (code == ContactPointSystem.OTHER)
        return "other";
      return "?";
    }

    public String toSystem(ContactPointSystem code) {
      return code.getSystem();
    }
  }

  public enum ContactPointUse {
    /**
     * A communication contact point at a home; attempted contacts for business
     * purposes might intrude privacy and chances are one will contact family or
     * other household members instead of the person one wishes to call. Typically
     * used with urgent cases, or if no other contacts are available.
     */
    HOME,
    /**
     * An office contact point. First choice for business related contacts during
     * business hours.
     */
    WORK,
    /**
     * A temporary contact point. The period can provide more detailed information.
     */
    TEMP,
    /**
     * This contact point is no longer in use (or was never correct, but retained
     * for records).
     */
    OLD,
    /**
     * A telecommunication device that moves and stays with its owner. May have
     * characteristics of all other use codes, suitable for urgent matters, not the
     * first choice for routine business.
     */
    MOBILE,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static ContactPointUse fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("home".equals(codeString))
        return HOME;
      if ("work".equals(codeString))
        return WORK;
      if ("temp".equals(codeString))
        return TEMP;
      if ("old".equals(codeString))
        return OLD;
      if ("mobile".equals(codeString))
        return MOBILE;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown ContactPointUse code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case HOME:
        return "home";
      case WORK:
        return "work";
      case TEMP:
        return "temp";
      case OLD:
        return "old";
      case MOBILE:
        return "mobile";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case HOME:
        return "http://hl7.org/fhir/contact-point-use";
      case WORK:
        return "http://hl7.org/fhir/contact-point-use";
      case TEMP:
        return "http://hl7.org/fhir/contact-point-use";
      case OLD:
        return "http://hl7.org/fhir/contact-point-use";
      case MOBILE:
        return "http://hl7.org/fhir/contact-point-use";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case HOME:
        return "A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.";
      case WORK:
        return "An office contact point. First choice for business related contacts during business hours.";
      case TEMP:
        return "A temporary contact point. The period can provide more detailed information.";
      case OLD:
        return "This contact point is no longer in use (or was never correct, but retained for records).";
      case MOBILE:
        return "A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case HOME:
        return "Home";
      case WORK:
        return "Work";
      case TEMP:
        return "Temp";
      case OLD:
        return "Old";
      case MOBILE:
        return "Mobile";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class ContactPointUseEnumFactory implements EnumFactory<ContactPointUse> {
    public ContactPointUse fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("home".equals(codeString))
        return ContactPointUse.HOME;
      if ("work".equals(codeString))
        return ContactPointUse.WORK;
      if ("temp".equals(codeString))
        return ContactPointUse.TEMP;
      if ("old".equals(codeString))
        return ContactPointUse.OLD;
      if ("mobile".equals(codeString))
        return ContactPointUse.MOBILE;
      throw new IllegalArgumentException("Unknown ContactPointUse code '" + codeString + "'");
    }

    public Enumeration<ContactPointUse> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<ContactPointUse>(this, ContactPointUse.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<ContactPointUse>(this, ContactPointUse.NULL, code);
      if ("home".equals(codeString))
        return new Enumeration<ContactPointUse>(this, ContactPointUse.HOME, code);
      if ("work".equals(codeString))
        return new Enumeration<ContactPointUse>(this, ContactPointUse.WORK, code);
      if ("temp".equals(codeString))
        return new Enumeration<ContactPointUse>(this, ContactPointUse.TEMP, code);
      if ("old".equals(codeString))
        return new Enumeration<ContactPointUse>(this, ContactPointUse.OLD, code);
      if ("mobile".equals(codeString))
        return new Enumeration<ContactPointUse>(this, ContactPointUse.MOBILE, code);
      throw new FHIRException("Unknown ContactPointUse code '" + codeString + "'");
    }

    public String toCode(ContactPointUse code) {
      if (code == ContactPointUse.HOME)
        return "home";
      if (code == ContactPointUse.WORK)
        return "work";
      if (code == ContactPointUse.TEMP)
        return "temp";
      if (code == ContactPointUse.OLD)
        return "old";
      if (code == ContactPointUse.MOBILE)
        return "mobile";
      return "?";
    }

    public String toSystem(ContactPointUse code) {
      return code.getSystem();
    }
  }

  /**
   * Telecommunications form for contact point - what communications system is
   * required to make use of the contact.
   */
  @Child(name = "system", type = { CodeType.class }, order = 0, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "phone | fax | email | pager | url | sms | other", formalDefinition = "Telecommunications form for contact point - what communications system is required to make use of the contact.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/contact-point-system")
  protected Enumeration<ContactPointSystem> system;

  /**
   * The actual contact point details, in a form that is meaningful to the
   * designated communication system (i.e. phone number or email address).
   */
  @Child(name = "value", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "The actual contact point details", formalDefinition = "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).")
  protected StringType value;

  /**
   * Identifies the purpose for the contact point.
   */
  @Child(name = "use", type = { CodeType.class }, order = 2, min = 0, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "home | work | temp | old | mobile - purpose of this contact point", formalDefinition = "Identifies the purpose for the contact point.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/contact-point-use")
  protected Enumeration<ContactPointUse> use;

  /**
   * Specifies a preferred order in which to use a set of contacts. ContactPoints
   * with lower rank values are more preferred than those with higher rank values.
   */
  @Child(name = "rank", type = { PositiveIntType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Specify preferred order of use (1 = highest)", formalDefinition = "Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred than those with higher rank values.")
  protected PositiveIntType rank;

  /**
   * Time period when the contact point was/is in use.
   */
  @Child(name = "period", type = { Period.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Time period when the contact point was/is in use", formalDefinition = "Time period when the contact point was/is in use.")
  protected Period period;

  private static final long serialVersionUID = 1509610874L;

  /**
   * Constructor
   */
  public ContactPoint() {
    super();
  }

  /**
   * @return {@link #system} (Telecommunications form for contact point - what
   *         communications system is required to make use of the contact.). This
   *         is the underlying object with id, value and extensions. The accessor
   *         "getSystem" gives direct access to the value
   */
  public Enumeration<ContactPointSystem> getSystemElement() {
    if (this.system == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.system");
      else if (Configuration.doAutoCreate())
        this.system = new Enumeration<ContactPointSystem>(new ContactPointSystemEnumFactory()); // bb
    return this.system;
  }

  public boolean hasSystemElement() {
    return this.system != null && !this.system.isEmpty();
  }

  public boolean hasSystem() {
    return this.system != null && !this.system.isEmpty();
  }

  /**
   * @param value {@link #system} (Telecommunications form for contact point -
   *              what communications system is required to make use of the
   *              contact.). This is the underlying object with id, value and
   *              extensions. The accessor "getSystem" gives direct access to the
   *              value
   */
  public ContactPoint setSystemElement(Enumeration<ContactPointSystem> value) {
    this.system = value;
    return this;
  }

  /**
   * @return Telecommunications form for contact point - what communications
   *         system is required to make use of the contact.
   */
  public ContactPointSystem getSystem() {
    return this.system == null ? null : this.system.getValue();
  }

  /**
   * @param value Telecommunications form for contact point - what communications
   *              system is required to make use of the contact.
   */
  public ContactPoint setSystem(ContactPointSystem value) {
    if (value == null)
      this.system = null;
    else {
      if (this.system == null)
        this.system = new Enumeration<ContactPointSystem>(new ContactPointSystemEnumFactory());
      this.system.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #value} (The actual contact point details, in a form that is
   *         meaningful to the designated communication system (i.e. phone number
   *         or email address).). This is the underlying object with id, value and
   *         extensions. The accessor "getValue" gives direct access to the value
   */
  public StringType getValueElement() {
    if (this.value == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.value");
      else if (Configuration.doAutoCreate())
        this.value = new StringType(); // bb
    return this.value;
  }

  public boolean hasValueElement() {
    return this.value != null && !this.value.isEmpty();
  }

  public boolean hasValue() {
    return this.value != null && !this.value.isEmpty();
  }

  /**
   * @param value {@link #value} (The actual contact point details, in a form that
   *              is meaningful to the designated communication system (i.e. phone
   *              number or email address).). This is the underlying object with
   *              id, value and extensions. The accessor "getValue" gives direct
   *              access to the value
   */
  public ContactPoint setValueElement(StringType value) {
    this.value = value;
    return this;
  }

  /**
   * @return The actual contact point details, in a form that is meaningful to the
   *         designated communication system (i.e. phone number or email address).
   */
  public String getValue() {
    return this.value == null ? null : this.value.getValue();
  }

  /**
   * @param value The actual contact point details, in a form that is meaningful
   *              to the designated communication system (i.e. phone number or
   *              email address).
   */
  public ContactPoint setValue(String value) {
    if (Utilities.noString(value))
      this.value = null;
    else {
      if (this.value == null)
        this.value = new StringType();
      this.value.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #use} (Identifies the purpose for the contact point.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getUse" gives direct access to the value
   */
  public Enumeration<ContactPointUse> getUseElement() {
    if (this.use == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.use");
      else if (Configuration.doAutoCreate())
        this.use = new Enumeration<ContactPointUse>(new ContactPointUseEnumFactory()); // bb
    return this.use;
  }

  public boolean hasUseElement() {
    return this.use != null && !this.use.isEmpty();
  }

  public boolean hasUse() {
    return this.use != null && !this.use.isEmpty();
  }

  /**
   * @param value {@link #use} (Identifies the purpose for the contact point.).
   *              This is the underlying object with id, value and extensions. The
   *              accessor "getUse" gives direct access to the value
   */
  public ContactPoint setUseElement(Enumeration<ContactPointUse> value) {
    this.use = value;
    return this;
  }

  /**
   * @return Identifies the purpose for the contact point.
   */
  public ContactPointUse getUse() {
    return this.use == null ? null : this.use.getValue();
  }

  /**
   * @param value Identifies the purpose for the contact point.
   */
  public ContactPoint setUse(ContactPointUse value) {
    if (value == null)
      this.use = null;
    else {
      if (this.use == null)
        this.use = new Enumeration<ContactPointUse>(new ContactPointUseEnumFactory());
      this.use.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #rank} (Specifies a preferred order in which to use a set of
   *         contacts. ContactPoints with lower rank values are more preferred
   *         than those with higher rank values.). This is the underlying object
   *         with id, value and extensions. The accessor "getRank" gives direct
   *         access to the value
   */
  public PositiveIntType getRankElement() {
    if (this.rank == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.rank");
      else if (Configuration.doAutoCreate())
        this.rank = new PositiveIntType(); // bb
    return this.rank;
  }

  public boolean hasRankElement() {
    return this.rank != null && !this.rank.isEmpty();
  }

  public boolean hasRank() {
    return this.rank != null && !this.rank.isEmpty();
  }

  /**
   * @param value {@link #rank} (Specifies a preferred order in which to use a set
   *              of contacts. ContactPoints with lower rank values are more
   *              preferred than those with higher rank values.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getRank" gives direct access to the value
   */
  public ContactPoint setRankElement(PositiveIntType value) {
    this.rank = value;
    return this;
  }

  /**
   * @return Specifies a preferred order in which to use a set of contacts.
   *         ContactPoints with lower rank values are more preferred than those
   *         with higher rank values.
   */
  public int getRank() {
    return this.rank == null || this.rank.isEmpty() ? 0 : this.rank.getValue();
  }

  /**
   * @param value Specifies a preferred order in which to use a set of contacts.
   *              ContactPoints with lower rank values are more preferred than
   *              those with higher rank values.
   */
  public ContactPoint setRank(int value) {
    if (this.rank == null)
      this.rank = new PositiveIntType();
    this.rank.setValue(value);
    return this;
  }

  /**
   * @return {@link #period} (Time period when the contact point was/is in use.)
   */
  public Period getPeriod() {
    if (this.period == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.period");
      else if (Configuration.doAutoCreate())
        this.period = new Period(); // cc
    return this.period;
  }

  public boolean hasPeriod() {
    return this.period != null && !this.period.isEmpty();
  }

  /**
   * @param value {@link #period} (Time period when the contact point was/is in
   *              use.)
   */
  public ContactPoint setPeriod(Period value) {
    this.period = value;
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("system", "code",
        "Telecommunications form for contact point - what communications system is required to make use of the contact.",
        0, 1, system));
    children.add(new Property("value", "string",
        "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).",
        0, 1, value));
    children.add(new Property("use", "code", "Identifies the purpose for the contact point.", 0, 1, use));
    children.add(new Property("rank", "positiveInt",
        "Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred than those with higher rank values.",
        0, 1, rank));
    children.add(new Property("period", "Period", "Time period when the contact point was/is in use.", 0, 1, period));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -887328209:
      /* system */ return new Property("system", "code",
          "Telecommunications form for contact point - what communications system is required to make use of the contact.",
          0, 1, system);
    case 111972721:
      /* value */ return new Property("value", "string",
          "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).",
          0, 1, value);
    case 116103:
      /* use */ return new Property("use", "code", "Identifies the purpose for the contact point.", 0, 1, use);
    case 3492908:
      /* rank */ return new Property("rank", "positiveInt",
          "Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred than those with higher rank values.",
          0, 1, rank);
    case -991726143:
      /* period */ return new Property("period", "Period", "Time period when the contact point was/is in use.", 0, 1,
          period);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case -887328209:
      /* system */ return this.system == null ? new Base[0] : new Base[] { this.system }; // Enumeration<ContactPointSystem>
    case 111972721:
      /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // StringType
    case 116103:
      /* use */ return this.use == null ? new Base[0] : new Base[] { this.use }; // Enumeration<ContactPointUse>
    case 3492908:
      /* rank */ return this.rank == null ? new Base[0] : new Base[] { this.rank }; // PositiveIntType
    case -991726143:
      /* period */ return this.period == null ? new Base[0] : new Base[] { this.period }; // Period
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case -887328209: // system
      value = new ContactPointSystemEnumFactory().fromType(castToCode(value));
      this.system = (Enumeration) value; // Enumeration<ContactPointSystem>
      return value;
    case 111972721: // value
      this.value = castToString(value); // StringType
      return value;
    case 116103: // use
      value = new ContactPointUseEnumFactory().fromType(castToCode(value));
      this.use = (Enumeration) value; // Enumeration<ContactPointUse>
      return value;
    case 3492908: // rank
      this.rank = castToPositiveInt(value); // PositiveIntType
      return value;
    case -991726143: // period
      this.period = castToPeriod(value); // Period
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("system")) {
      value = new ContactPointSystemEnumFactory().fromType(castToCode(value));
      this.system = (Enumeration) value; // Enumeration<ContactPointSystem>
    } else if (name.equals("value")) {
      this.value = castToString(value); // StringType
    } else if (name.equals("use")) {
      value = new ContactPointUseEnumFactory().fromType(castToCode(value));
      this.use = (Enumeration) value; // Enumeration<ContactPointUse>
    } else if (name.equals("rank")) {
      this.rank = castToPositiveInt(value); // PositiveIntType
    } else if (name.equals("period")) {
      this.period = castToPeriod(value); // Period
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -887328209:
      return getSystemElement();
    case 111972721:
      return getValueElement();
    case 116103:
      return getUseElement();
    case 3492908:
      return getRankElement();
    case -991726143:
      return getPeriod();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -887328209:
      /* system */ return new String[] { "code" };
    case 111972721:
      /* value */ return new String[] { "string" };
    case 116103:
      /* use */ return new String[] { "code" };
    case 3492908:
      /* rank */ return new String[] { "positiveInt" };
    case -991726143:
      /* period */ return new String[] { "Period" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("system")) {
      throw new FHIRException("Cannot call addChild on a singleton property ContactPoint.system");
    } else if (name.equals("value")) {
      throw new FHIRException("Cannot call addChild on a singleton property ContactPoint.value");
    } else if (name.equals("use")) {
      throw new FHIRException("Cannot call addChild on a singleton property ContactPoint.use");
    } else if (name.equals("rank")) {
      throw new FHIRException("Cannot call addChild on a singleton property ContactPoint.rank");
    } else if (name.equals("period")) {
      this.period = new Period();
      return this.period;
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "ContactPoint";

  }

  public ContactPoint copy() {
    ContactPoint dst = new ContactPoint();
    copyValues(dst);
    return dst;
  }

  public void copyValues(ContactPoint dst) {
    super.copyValues(dst);
    dst.system = system == null ? null : system.copy();
    dst.value = value == null ? null : value.copy();
    dst.use = use == null ? null : use.copy();
    dst.rank = rank == null ? null : rank.copy();
    dst.period = period == null ? null : period.copy();
  }

  protected ContactPoint typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof ContactPoint))
      return false;
    ContactPoint o = (ContactPoint) other_;
    return compareDeep(system, o.system, true) && compareDeep(value, o.value, true) && compareDeep(use, o.use, true)
        && compareDeep(rank, o.rank, true) && compareDeep(period, o.period, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof ContactPoint))
      return false;
    ContactPoint o = (ContactPoint) other_;
    return compareValues(system, o.system, true) && compareValues(value, o.value, true)
        && compareValues(use, o.use, true) && compareValues(rank, o.rank, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(system, value, use, rank, period);
  }

}
