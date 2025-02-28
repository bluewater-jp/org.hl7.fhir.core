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
import java.math.*;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r4b.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * Base StructureDefinition for Quantity Type: A measured amount (or an amount
 * that can potentially be measured). Note that measured amounts include amounts
 * that are not precisely quantified, including amounts involving arbitrary
 * units and floating currencies.
 */
@DatatypeDef(name = "Quantity")
public class Quantity extends DataType implements ICompositeType, ICoding {

  /**
   * The value of the measured amount. The value includes an implicit precision in
   * the presentation of the value.
   */
  @Child(name = "value", type = { DecimalType.class }, order = 0, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Numerical value (with implicit precision)", formalDefinition = "The value of the measured amount. The value includes an implicit precision in the presentation of the value.")
  protected DecimalType value;

  /**
   * How the value should be understood and represented - whether the actual value
   * is greater or less than the stated value due to measurement issues; e.g. if
   * the comparator is "<" , then the real value is < stated value.
   */
  @Child(name = "comparator", type = { CodeType.class }, order = 1, min = 0, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "< | <= | >= | > - how to understand the value", formalDefinition = "How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is \"<\" , then the real value is < stated value.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/quantity-comparator")
  protected Enumeration<QuantityComparator> comparator;

  /**
   * A human-readable form of the unit.
   */
  @Child(name = "unit", type = { StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Unit representation", formalDefinition = "A human-readable form of the unit.")
  protected StringType unit;

  /**
   * The identification of the system that provides the coded form of the unit.
   */
  @Child(name = "system", type = { UriType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "System that defines coded unit form", formalDefinition = "The identification of the system that provides the coded form of the unit.")
  protected UriType system;

  /**
   * A computer processable form of the unit in some unit representation system.
   */
  @Child(name = "code", type = { CodeType.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Coded form of the unit", formalDefinition = "A computer processable form of the unit in some unit representation system.")
  protected CodeType code;

  private static final long serialVersionUID = 1069574054L;

  /**
   * Constructor
   */
  public Quantity() {
    super();
  }

  /**
   * Convenience constructor
   * 
   * @param theValue The {@link #setValue(double) value}
   */
  public Quantity(double theValue) {
    setValue(theValue);
  }

  /**
   * Convenience constructor
   * 
   * @param theValue The {@link #setValue(long) value}
   */
  public Quantity(long theValue) {
    setValue(theValue);
  }

  /**
   * Convenience constructor
   * 
   * @param theComparator The {@link #setComparator(QuantityComparator)
   *                      comparator}
   * @param theValue      The {@link #setValue(BigDecimal) value}
   * @param theSystem     The {@link #setSystem(String)} (the code system for the
   *                      units}
   * @param theCode       The {@link #setCode(String)} (the code for the units}
   * @param theUnit       The {@link #setUnit(String)} (the human readable display
   *                      name for the units}
   */
  public Quantity(QuantityComparator theComparator, double theValue, String theSystem, String theCode, String theUnit) {
    setValue(theValue);
    setComparator(theComparator);
    setSystem(theSystem);
    setCode(theCode);
    setUnit(theUnit);
  }

  /**
   * Convenience constructor
   * 
   * @param theComparator The {@link #setComparator(QuantityComparator)
   *                      comparator}
   * @param theValue      The {@link #setValue(BigDecimal) value}
   * @param theSystem     The {@link #setSystem(String)} (the code system for the
   *                      units}
   * @param theCode       The {@link #setCode(String)} (the code for the units}
   * @param theUnit       The {@link #setUnit(String)} (the human readable display
   *                      name for the units}
   */
  public Quantity(QuantityComparator theComparator, long theValue, String theSystem, String theCode, String theUnit) {
    setValue(theValue);
    setComparator(theComparator);
    setSystem(theSystem);
    setCode(theCode);
    setUnit(theUnit);
  }

  /**
   * @return {@link #value} (The value of the measured amount. The value includes
   *         an implicit precision in the presentation of the value.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getValue" gives direct access to the value
   */
  public DecimalType getValueElement() {
    if (this.value == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Quantity.value");
      else if (Configuration.doAutoCreate())
        this.value = new DecimalType(); // bb
    return this.value;
  }

  public boolean hasValueElement() {
    return this.value != null && !this.value.isEmpty();
  }

  public boolean hasValue() {
    return this.value != null && !this.value.isEmpty();
  }

  /**
   * @param value {@link #value} (The value of the measured amount. The value
   *              includes an implicit precision in the presentation of the
   *              value.). This is the underlying object with id, value and
   *              extensions. The accessor "getValue" gives direct access to the
   *              value
   */
  public Quantity setValueElement(DecimalType value) {
    this.value = value;
    return this;
  }

  /**
   * @return The value of the measured amount. The value includes an implicit
   *         precision in the presentation of the value.
   */
  public BigDecimal getValue() {
    return this.value == null ? null : this.value.getValue();
  }

  /**
   * @param value The value of the measured amount. The value includes an implicit
   *              precision in the presentation of the value.
   */
  public Quantity setValue(BigDecimal value) {
    if (value == null)
      this.value = null;
    else {
      if (this.value == null)
        this.value = new DecimalType();
      this.value.setValue(value);
    }
    return this;
  }

  /**
   * @param value The value of the measured amount. The value includes an implicit
   *              precision in the presentation of the value.
   */
  public Quantity setValue(long value) {
    this.value = new DecimalType();
    this.value.setValue(value);
    return this;
  }

  /**
   * @param value The value of the measured amount. The value includes an implicit
   *              precision in the presentation of the value.
   */
  public Quantity setValue(double value) {
    this.value = new DecimalType();
    this.value.setValue(value);
    return this;
  }

  /**
   * @return {@link #comparator} (How the value should be understood and
   *         represented - whether the actual value is greater or less than the
   *         stated value due to measurement issues; e.g. if the comparator is "<"
   *         , then the real value is < stated value.). This is the underlying
   *         object with id, value and extensions. The accessor "getComparator"
   *         gives direct access to the value
   */
  public Enumeration<QuantityComparator> getComparatorElement() {
    if (this.comparator == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Quantity.comparator");
      else if (Configuration.doAutoCreate())
        this.comparator = new Enumeration<QuantityComparator>(new QuantityComparatorEnumFactory()); // bb
    return this.comparator;
  }

  public boolean hasComparatorElement() {
    return this.comparator != null && !this.comparator.isEmpty();
  }

  public boolean hasComparator() {
    return this.comparator != null && !this.comparator.isEmpty();
  }

  /**
   * @param value {@link #comparator} (How the value should be understood and
   *              represented - whether the actual value is greater or less than
   *              the stated value due to measurement issues; e.g. if the
   *              comparator is "<" , then the real value is < stated value.).
   *              This is the underlying object with id, value and extensions. The
   *              accessor "getComparator" gives direct access to the value
   */
  public Quantity setComparatorElement(Enumeration<QuantityComparator> value) {
    this.comparator = value;
    return this;
  }

  /**
   * @return How the value should be understood and represented - whether the
   *         actual value is greater or less than the stated value due to
   *         measurement issues; e.g. if the comparator is "<" , then the real
   *         value is < stated value.
   */
  public QuantityComparator getComparator() {
    return this.comparator == null ? null : this.comparator.getValue();
  }

  /**
   * @param value How the value should be understood and represented - whether the
   *              actual value is greater or less than the stated value due to
   *              measurement issues; e.g. if the comparator is "<" , then the
   *              real value is < stated value.
   */
  public Quantity setComparator(QuantityComparator value) {
    if (value == null)
      this.comparator = null;
    else {
      if (this.comparator == null)
        this.comparator = new Enumeration<QuantityComparator>(new QuantityComparatorEnumFactory());
      this.comparator.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #unit} (A human-readable form of the unit.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getUnit" gives direct access to the value
   */
  public StringType getUnitElement() {
    if (this.unit == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Quantity.unit");
      else if (Configuration.doAutoCreate())
        this.unit = new StringType(); // bb
    return this.unit;
  }

  public boolean hasUnitElement() {
    return this.unit != null && !this.unit.isEmpty();
  }

  public boolean hasUnit() {
    return this.unit != null && !this.unit.isEmpty();
  }

  /**
   * @param value {@link #unit} (A human-readable form of the unit.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getUnit" gives direct access to the value
   */
  public Quantity setUnitElement(StringType value) {
    this.unit = value;
    return this;
  }

  /**
   * @return A human-readable form of the unit.
   */
  public String getUnit() {
    return this.unit == null ? null : this.unit.getValue();
  }

  /**
   * @param value A human-readable form of the unit.
   */
  public Quantity setUnit(String value) {
    if (Utilities.noString(value))
      this.unit = null;
    else {
      if (this.unit == null)
        this.unit = new StringType();
      this.unit.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #system} (The identification of the system that provides the
   *         coded form of the unit.). This is the underlying object with id,
   *         value and extensions. The accessor "getSystem" gives direct access to
   *         the value
   */
  public UriType getSystemElement() {
    if (this.system == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Quantity.system");
      else if (Configuration.doAutoCreate())
        this.system = new UriType(); // bb
    return this.system;
  }

  public boolean hasSystemElement() {
    return this.system != null && !this.system.isEmpty();
  }

  public boolean hasSystem() {
    return this.system != null && !this.system.isEmpty();
  }

  /**
   * @param value {@link #system} (The identification of the system that provides
   *              the coded form of the unit.). This is the underlying object with
   *              id, value and extensions. The accessor "getSystem" gives direct
   *              access to the value
   */
  public Quantity setSystemElement(UriType value) {
    this.system = value;
    return this;
  }

  /**
   * @return The identification of the system that provides the coded form of the
   *         unit.
   */
  public String getSystem() {
    return this.system == null ? null : this.system.getValue();
  }

  /**
   * @param value The identification of the system that provides the coded form of
   *              the unit.
   */
  public Quantity setSystem(String value) {
    if (Utilities.noString(value))
      this.system = null;
    else {
      if (this.system == null)
        this.system = new UriType();
      this.system.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #code} (A computer processable form of the unit in some unit
   *         representation system.). This is the underlying object with id, value
   *         and extensions. The accessor "getCode" gives direct access to the
   *         value
   */
  public CodeType getCodeElement() {
    if (this.code == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Quantity.code");
      else if (Configuration.doAutoCreate())
        this.code = new CodeType(); // bb
    return this.code;
  }

  public boolean hasCodeElement() {
    return this.code != null && !this.code.isEmpty();
  }

  public boolean hasCode() {
    return this.code != null && !this.code.isEmpty();
  }

  /**
   * @param value {@link #code} (A computer processable form of the unit in some
   *              unit representation system.). This is the underlying object with
   *              id, value and extensions. The accessor "getCode" gives direct
   *              access to the value
   */
  public Quantity setCodeElement(CodeType value) {
    this.code = value;
    return this;
  }

  /**
   * @return A computer processable form of the unit in some unit representation
   *         system.
   */
  public String getCode() {
    return this.code == null ? null : this.code.getValue();
  }

  /**
   * @param value A computer processable form of the unit in some unit
   *              representation system.
   */
  public Quantity setCode(String value) {
    if (Utilities.noString(value))
      this.code = null;
    else {
      if (this.code == null)
        this.code = new CodeType();
      this.code.setValue(value);
    }
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("value", "decimal",
        "The value of the measured amount. The value includes an implicit precision in the presentation of the value.",
        0, 1, value));
    children.add(new Property("comparator", "code",
        "How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is \"<\" , then the real value is < stated value.",
        0, 1, comparator));
    children.add(new Property("unit", "string", "A human-readable form of the unit.", 0, 1, unit));
    children.add(new Property("system", "uri",
        "The identification of the system that provides the coded form of the unit.", 0, 1, system));
    children.add(new Property("code", "code",
        "A computer processable form of the unit in some unit representation system.", 0, 1, code));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case 111972721:
      /* value */ return new Property("value", "decimal",
          "The value of the measured amount. The value includes an implicit precision in the presentation of the value.",
          0, 1, value);
    case -844673834:
      /* comparator */ return new Property("comparator", "code",
          "How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is \"<\" , then the real value is < stated value.",
          0, 1, comparator);
    case 3594628:
      /* unit */ return new Property("unit", "string", "A human-readable form of the unit.", 0, 1, unit);
    case -887328209:
      /* system */ return new Property("system", "uri",
          "The identification of the system that provides the coded form of the unit.", 0, 1, system);
    case 3059181:
      /* code */ return new Property("code", "code",
          "A computer processable form of the unit in some unit representation system.", 0, 1, code);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case 111972721:
      /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // DecimalType
    case -844673834:
      /* comparator */ return this.comparator == null ? new Base[0] : new Base[] { this.comparator }; // Enumeration<QuantityComparator>
    case 3594628:
      /* unit */ return this.unit == null ? new Base[0] : new Base[] { this.unit }; // StringType
    case -887328209:
      /* system */ return this.system == null ? new Base[0] : new Base[] { this.system }; // UriType
    case 3059181:
      /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // CodeType
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case 111972721: // value
      this.value = TypeConvertor.castToDecimal(value); // DecimalType
      return value;
    case -844673834: // comparator
      value = new QuantityComparatorEnumFactory().fromType(TypeConvertor.castToCode(value));
      this.comparator = (Enumeration) value; // Enumeration<QuantityComparator>
      return value;
    case 3594628: // unit
      this.unit = TypeConvertor.castToString(value); // StringType
      return value;
    case -887328209: // system
      this.system = TypeConvertor.castToUri(value); // UriType
      return value;
    case 3059181: // code
      this.code = TypeConvertor.castToCode(value); // CodeType
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("value")) {
      this.value = TypeConvertor.castToDecimal(value); // DecimalType
    } else if (name.equals("comparator")) {
      value = new QuantityComparatorEnumFactory().fromType(TypeConvertor.castToCode(value));
      this.comparator = (Enumeration) value; // Enumeration<QuantityComparator>
    } else if (name.equals("unit")) {
      this.unit = TypeConvertor.castToString(value); // StringType
    } else if (name.equals("system")) {
      this.system = TypeConvertor.castToUri(value); // UriType
    } else if (name.equals("code")) {
      this.code = TypeConvertor.castToCode(value); // CodeType
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 111972721:
      return getValueElement();
    case -844673834:
      return getComparatorElement();
    case 3594628:
      return getUnitElement();
    case -887328209:
      return getSystemElement();
    case 3059181:
      return getCodeElement();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 111972721:
      /* value */ return new String[] { "decimal" };
    case -844673834:
      /* comparator */ return new String[] { "code" };
    case 3594628:
      /* unit */ return new String[] { "string" };
    case -887328209:
      /* system */ return new String[] { "uri" };
    case 3059181:
      /* code */ return new String[] { "code" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("value")) {
      throw new FHIRException("Cannot call addChild on a singleton property Quantity.value");
    } else if (name.equals("comparator")) {
      throw new FHIRException("Cannot call addChild on a singleton property Quantity.comparator");
    } else if (name.equals("unit")) {
      throw new FHIRException("Cannot call addChild on a singleton property Quantity.unit");
    } else if (name.equals("system")) {
      throw new FHIRException("Cannot call addChild on a singleton property Quantity.system");
    } else if (name.equals("code")) {
      throw new FHIRException("Cannot call addChild on a singleton property Quantity.code");
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "Quantity";

  }

  public Quantity copy() {
    Quantity dst = new Quantity();
    copyValues(dst);
    return dst;
  }

  public void copyValues(Quantity dst) {
    super.copyValues(dst);
    dst.value = value == null ? null : value.copy();
    dst.comparator = comparator == null ? null : comparator.copy();
    dst.unit = unit == null ? null : unit.copy();
    dst.system = system == null ? null : system.copy();
    dst.code = code == null ? null : code.copy();
  }

  protected Quantity typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof Quantity))
      return false;
    Quantity o = (Quantity) other_;
    return compareDeep(value, o.value, true) && compareDeep(comparator, o.comparator, true)
        && compareDeep(unit, o.unit, true) && compareDeep(system, o.system, true) && compareDeep(code, o.code, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof Quantity))
      return false;
    Quantity o = (Quantity) other_;
    return compareValues(value, o.value, true) && compareValues(comparator, o.comparator, true)
        && compareValues(unit, o.unit, true) && compareValues(system, o.system, true)
        && compareValues(code, o.code, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(value, comparator, unit, system, code);
  }

// Manual code (from Configuration.txt):
  @Override
  public String getVersion() {
    return null;
  }

  @Override
  public boolean hasVersion() {
    return false;
  }

  @Override
  public boolean supportsVersion() {
    return false;
  }

  @Override
  public String getDisplay() {
    return null;
  }

  @Override
  public boolean hasDisplay() {
    return false;
  }

  @Override
  public boolean supportsDisplay() {
    return false;
  }

  public static Quantity fromUcum(String v, String code) {
    Quantity res = new Quantity();
    res.setValue(new BigDecimal(v));
    res.setSystem("http://unitsofmeasure.org");
    res.setCode(code);
    return res;
  }
// end addition

}
