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
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * Base StructureDefinition for CodeableConcept Type: A concept that may be
 * defined by a formal reference to a terminology or ontology or may be provided
 * by text.
 */
@DatatypeDef(name = "CodeableConcept")
public class CodeableConcept extends DataType implements ICompositeType {

  /**
   * A reference to a code defined by a terminology system.
   */
  @Child(name = "coding", type = {
      Coding.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Code defined by a terminology system", formalDefinition = "A reference to a code defined by a terminology system.")
  protected List<Coding> coding;

  /**
   * A human language representation of the concept as seen/selected/uttered by
   * the user who entered the data and/or which represents the intended meaning of
   * the user.
   */
  @Child(name = "text", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Plain text representation of the concept", formalDefinition = "A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user.")
  protected StringType text;

  private static final long serialVersionUID = 760353246L;

  /**
   * Constructor
   */
  public CodeableConcept() {
    super();
  }

  /**
   * @return {@link #coding} (A reference to a code defined by a terminology
   *         system.)
   */
  public List<Coding> getCoding() {
    if (this.coding == null)
      this.coding = new ArrayList<Coding>();
    return this.coding;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public CodeableConcept setCoding(List<Coding> theCoding) {
    this.coding = theCoding;
    return this;
  }

  public boolean hasCoding() {
    if (this.coding == null)
      return false;
    for (Coding item : this.coding)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Coding addCoding() { // 3
    Coding t = new Coding();
    if (this.coding == null)
      this.coding = new ArrayList<Coding>();
    this.coding.add(t);
    return t;
  }

  public CodeableConcept addCoding(Coding t) { // 3
    if (t == null)
      return this;
    if (this.coding == null)
      this.coding = new ArrayList<Coding>();
    this.coding.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #coding}, creating it
   *         if it does not already exist {3}
   */
  public Coding getCodingFirstRep() {
    if (getCoding().isEmpty()) {
      addCoding();
    }
    return getCoding().get(0);
  }

  /**
   * @return {@link #text} (A human language representation of the concept as
   *         seen/selected/uttered by the user who entered the data and/or which
   *         represents the intended meaning of the user.). This is the underlying
   *         object with id, value and extensions. The accessor "getText" gives
   *         direct access to the value
   */
  public StringType getTextElement() {
    if (this.text == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create CodeableConcept.text");
      else if (Configuration.doAutoCreate())
        this.text = new StringType(); // bb
    return this.text;
  }

  public boolean hasTextElement() {
    return this.text != null && !this.text.isEmpty();
  }

  public boolean hasText() {
    return this.text != null && !this.text.isEmpty();
  }

  /**
   * @param value {@link #text} (A human language representation of the concept as
   *              seen/selected/uttered by the user who entered the data and/or
   *              which represents the intended meaning of the user.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getText" gives direct access to the value
   */
  public CodeableConcept setTextElement(StringType value) {
    this.text = value;
    return this;
  }

  /**
   * @return A human language representation of the concept as
   *         seen/selected/uttered by the user who entered the data and/or which
   *         represents the intended meaning of the user.
   */
  public String getText() {
    return this.text == null ? null : this.text.getValue();
  }

  /**
   * @param value A human language representation of the concept as
   *              seen/selected/uttered by the user who entered the data and/or
   *              which represents the intended meaning of the user.
   */
  public CodeableConcept setText(String value) {
    if (Utilities.noString(value))
      this.text = null;
    else {
      if (this.text == null)
        this.text = new StringType();
      this.text.setValue(value);
    }
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("coding", "Coding", "A reference to a code defined by a terminology system.", 0,
        java.lang.Integer.MAX_VALUE, coding));
    children.add(new Property("text", "string",
        "A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user.",
        0, 1, text));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1355086998:
      /* coding */ return new Property("coding", "Coding", "A reference to a code defined by a terminology system.", 0,
          java.lang.Integer.MAX_VALUE, coding);
    case 3556653:
      /* text */ return new Property("text", "string",
          "A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which represents the intended meaning of the user.",
          0, 1, text);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case -1355086998:
      /* coding */ return this.coding == null ? new Base[0] : this.coding.toArray(new Base[this.coding.size()]); // Coding
    case 3556653:
      /* text */ return this.text == null ? new Base[0] : new Base[] { this.text }; // StringType
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case -1355086998: // coding
      this.getCoding().add(TypeConvertor.castToCoding(value)); // Coding
      return value;
    case 3556653: // text
      this.text = TypeConvertor.castToString(value); // StringType
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("coding")) {
      this.getCoding().add(TypeConvertor.castToCoding(value));
    } else if (name.equals("text")) {
      this.text = TypeConvertor.castToString(value); // StringType
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1355086998:
      return addCoding();
    case 3556653:
      return getTextElement();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1355086998:
      /* coding */ return new String[] { "Coding" };
    case 3556653:
      /* text */ return new String[] { "string" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("coding")) {
      return addCoding();
    } else if (name.equals("text")) {
      throw new FHIRException("Cannot call addChild on a singleton property CodeableConcept.text");
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "CodeableConcept";

  }

  public CodeableConcept copy() {
    CodeableConcept dst = new CodeableConcept();
    copyValues(dst);
    return dst;
  }

  public void copyValues(CodeableConcept dst) {
    super.copyValues(dst);
    if (coding != null) {
      dst.coding = new ArrayList<Coding>();
      for (Coding i : coding)
        dst.coding.add(i.copy());
    }
    ;
    dst.text = text == null ? null : text.copy();
  }

  protected CodeableConcept typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof CodeableConcept))
      return false;
    CodeableConcept o = (CodeableConcept) other_;
    return compareDeep(coding, o.coding, true) && compareDeep(text, o.text, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof CodeableConcept))
      return false;
    CodeableConcept o = (CodeableConcept) other_;
    return compareValues(text, o.text, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(coding, text);
  }

// Manual code (from Configuration.txt):
  public boolean hasCoding(String system, String code) {
    for (Coding c : getCoding()) {
      if (system.equals(c.getSystem()) && code.equals(c.getCode()))
        return true;
    }
    return false;
  }

  public CodeableConcept(Coding code) {
    super();
    addCoding(code);
  }

  public boolean matches(CodeableConcept other) {
    for (Coding c : other.getCoding()) {
      if (hasCoding(c.getSystem(), c.getCode())) {
        return true;
      }
    }
    return false;
  }

  public boolean hasCoding(Coding coding) {
    return hasCoding(coding.getSystem(), coding.getCode());
  }

  public boolean hasCoding(String system) {
    for (Coding c : getCoding()) {
      if (system.equals(c.getSystem())) {
        return true;
      }
    }
    return false;
  }

  public String getCode(String system) {
    for (Coding c : getCoding()) {
      if (system.equals(c.getSystem())) {
        return c.getCode();
      }
    }
    return null;
  }

  public static CodeableConcept merge(CodeableConcept l, CodeableConcept r) {
    CodeableConcept res = new CodeableConcept();
    List<Coding> handled = new ArrayList<>();
    for (Coding c : l.getCoding()) {
      boolean done = false;
      for (Coding t : r.getCoding()) {
        if (t.matches(c)) {
          handled.add(t);
          res.getCoding().add(Coding.merge(c, t));
          done = true;
          break;
        }
      }
      if (!done) {
        res.getCoding().add(c.copy());
      }
    }
    for (Coding c : r.getCoding()) {
      if (!handled.contains(c)) {
        res.getCoding().add(c);
      }
    }
    if (l.hasText()) {
      res.setText(l.getText());
    } else {
      res.setText(r.getText());
    }
    return res;
  }

  public static CodeableConcept intersect(CodeableConcept l, CodeableConcept r) {
    CodeableConcept res = new CodeableConcept();
    for (Coding c : l.getCoding()) {
      for (Coding t : r.getCoding()) {
        if (t.matches(c)) {
          res.getCoding().add(Coding.intersect(c, t));
          break;
        }
      }
    }
    if (l.hasText() && r.hasText() && l.getText().equals(r.getText())) {
      res.setText(l.getText());
    }
    return res;
  }

  public void addCoding(String system, String code, String display) {
    getCoding().add(new Coding(system, code, display));
  }

// end addition

}
