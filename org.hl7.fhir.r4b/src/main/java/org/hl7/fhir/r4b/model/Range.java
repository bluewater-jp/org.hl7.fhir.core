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
 * Base StructureDefinition for Range Type: A set of ordered Quantities defined
 * by a low and high limit.
 */
@DatatypeDef(name = "Range")
public class Range extends DataType implements ICompositeType {

  /**
   * The low limit. The boundary is inclusive.
   */
  @Child(name = "low", type = { Quantity.class }, order = 0, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Low limit", formalDefinition = "The low limit. The boundary is inclusive.")
  protected Quantity low;

  /**
   * The high limit. The boundary is inclusive.
   */
  @Child(name = "high", type = { Quantity.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "High limit", formalDefinition = "The high limit. The boundary is inclusive.")
  protected Quantity high;

  private static final long serialVersionUID = -474933350L;

  /**
   * Constructor
   */
  public Range() {
    super();
  }

  /**
   * @return {@link #low} (The low limit. The boundary is inclusive.)
   */
  public Quantity getLow() {
    if (this.low == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Range.low");
      else if (Configuration.doAutoCreate())
        this.low = new Quantity(); // cc
    return this.low;
  }

  public boolean hasLow() {
    return this.low != null && !this.low.isEmpty();
  }

  /**
   * @param value {@link #low} (The low limit. The boundary is inclusive.)
   */
  public Range setLow(Quantity value) {
    this.low = value;
    return this;
  }

  /**
   * @return {@link #high} (The high limit. The boundary is inclusive.)
   */
  public Quantity getHigh() {
    if (this.high == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Range.high");
      else if (Configuration.doAutoCreate())
        this.high = new Quantity(); // cc
    return this.high;
  }

  public boolean hasHigh() {
    return this.high != null && !this.high.isEmpty();
  }

  /**
   * @param value {@link #high} (The high limit. The boundary is inclusive.)
   */
  public Range setHigh(Quantity value) {
    this.high = value;
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("low", "Quantity", "The low limit. The boundary is inclusive.", 0, 1, low));
    children.add(new Property("high", "Quantity", "The high limit. The boundary is inclusive.", 0, 1, high));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case 107348:
      /* low */ return new Property("low", "Quantity", "The low limit. The boundary is inclusive.", 0, 1, low);
    case 3202466:
      /* high */ return new Property("high", "Quantity", "The high limit. The boundary is inclusive.", 0, 1, high);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case 107348:
      /* low */ return this.low == null ? new Base[0] : new Base[] { this.low }; // Quantity
    case 3202466:
      /* high */ return this.high == null ? new Base[0] : new Base[] { this.high }; // Quantity
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case 107348: // low
      this.low = TypeConvertor.castToQuantity(value); // Quantity
      return value;
    case 3202466: // high
      this.high = TypeConvertor.castToQuantity(value); // Quantity
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("low")) {
      this.low = TypeConvertor.castToQuantity(value); // Quantity
    } else if (name.equals("high")) {
      this.high = TypeConvertor.castToQuantity(value); // Quantity
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 107348:
      return getLow();
    case 3202466:
      return getHigh();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 107348:
      /* low */ return new String[] { "Quantity" };
    case 3202466:
      /* high */ return new String[] { "Quantity" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("low")) {
      this.low = new Quantity();
      return this.low;
    } else if (name.equals("high")) {
      this.high = new Quantity();
      return this.high;
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "Range";

  }

  public Range copy() {
    Range dst = new Range();
    copyValues(dst);
    return dst;
  }

  public void copyValues(Range dst) {
    super.copyValues(dst);
    dst.low = low == null ? null : low.copy();
    dst.high = high == null ? null : high.copy();
  }

  protected Range typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof Range))
      return false;
    Range o = (Range) other_;
    return compareDeep(low, o.low, true) && compareDeep(high, o.high, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof Range))
      return false;
    Range o = (Range) other_;
    return true;
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(low, high);
  }

}
