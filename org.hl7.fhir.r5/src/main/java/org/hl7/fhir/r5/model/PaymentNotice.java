package org.hl7.fhir.r5.model;


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

// Generated on Thu, Mar 23, 2023 19:59+1100 for FHIR v5.0.0

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
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
 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
 */
@ResourceDef(name="PaymentNotice", profile="http://hl7.org/fhir/StructureDefinition/PaymentNotice")
public class PaymentNotice extends DomainResource {

    /**
     * A unique identifier assigned to this payment notice.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Business Identifier for the payment notice", formalDefinition="A unique identifier assigned to this payment notice." )
    protected List<Identifier> identifier;

    /**
     * The status of the resource instance.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="active | cancelled | draft | entered-in-error", formalDefinition="The status of the resource instance." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/fm-status")
    protected Enumeration<FinancialResourceStatusCodes> status;

    /**
     * Reference of resource for which payment is being made.
     */
    @Child(name = "request", type = {Reference.class}, order=2, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Request reference", formalDefinition="Reference of resource for which payment is being made." )
    protected Reference request;

    /**
     * Reference of response to resource for which payment is being made.
     */
    @Child(name = "response", type = {Reference.class}, order=3, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Response reference", formalDefinition="Reference of response to resource for which payment is being made." )
    protected Reference response;

    /**
     * The date when this resource was created.
     */
    @Child(name = "created", type = {DateTimeType.class}, order=4, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Creation date", formalDefinition="The date when this resource was created." )
    protected DateTimeType created;

    /**
     * The party who reports the payment notice.
     */
    @Child(name = "reporter", type = {Practitioner.class, PractitionerRole.class, Organization.class}, order=5, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Responsible practitioner", formalDefinition="The party who reports the payment notice." )
    protected Reference reporter;

    /**
     * A reference to the payment which is the subject of this notice.
     */
    @Child(name = "payment", type = {PaymentReconciliation.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Payment reference", formalDefinition="A reference to the payment which is the subject of this notice." )
    protected Reference payment;

    /**
     * The date when the above payment action occurred.
     */
    @Child(name = "paymentDate", type = {DateType.class}, order=7, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Payment or clearing date", formalDefinition="The date when the above payment action occurred." )
    protected DateType paymentDate;

    /**
     * The party who will receive or has received payment that is the subject of this notification.
     */
    @Child(name = "payee", type = {Practitioner.class, PractitionerRole.class, Organization.class}, order=8, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Party being paid", formalDefinition="The party who will receive or has received payment that is the subject of this notification." )
    protected Reference payee;

    /**
     * The party who is notified of the payment status.
     */
    @Child(name = "recipient", type = {Organization.class}, order=9, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Party being notified", formalDefinition="The party who is notified of the payment status." )
    protected Reference recipient;

    /**
     * The amount sent to the payee.
     */
    @Child(name = "amount", type = {Money.class}, order=10, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Monetary amount of the payment", formalDefinition="The amount sent to the payee." )
    protected Money amount;

    /**
     * A code indicating whether payment has been sent or cleared.
     */
    @Child(name = "paymentStatus", type = {CodeableConcept.class}, order=11, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Issued or cleared Status of the payment", formalDefinition="A code indicating whether payment has been sent or cleared." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/payment-status")
    protected CodeableConcept paymentStatus;

    private static final long serialVersionUID = 1568561168L;

  /**
   * Constructor
   */
    public PaymentNotice() {
      super();
    }

  /**
   * Constructor
   */
    public PaymentNotice(FinancialResourceStatusCodes status, Date created, Reference recipient, Money amount) {
      super();
      this.setStatus(status);
      this.setCreated(created);
      this.setRecipient(recipient);
      this.setAmount(amount);
    }

    /**
     * @return {@link #identifier} (A unique identifier assigned to this payment notice.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public PaymentNotice setIdentifier(List<Identifier> theIdentifier) { 
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

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public PaymentNotice addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<FinancialResourceStatusCodes> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<FinancialResourceStatusCodes>(new FinancialResourceStatusCodesEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public PaymentNotice setStatusElement(Enumeration<FinancialResourceStatusCodes> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of the resource instance.
     */
    public FinancialResourceStatusCodes getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the resource instance.
     */
    public PaymentNotice setStatus(FinancialResourceStatusCodes value) { 
        if (this.status == null)
          this.status = new Enumeration<FinancialResourceStatusCodes>(new FinancialResourceStatusCodesEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #request} (Reference of resource for which payment is being made.)
     */
    public Reference getRequest() { 
      if (this.request == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.request");
        else if (Configuration.doAutoCreate())
          this.request = new Reference(); // cc
      return this.request;
    }

    public boolean hasRequest() { 
      return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Reference of resource for which payment is being made.)
     */
    public PaymentNotice setRequest(Reference value) { 
      this.request = value;
      return this;
    }

    /**
     * @return {@link #response} (Reference of response to resource for which payment is being made.)
     */
    public Reference getResponse() { 
      if (this.response == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.response");
        else if (Configuration.doAutoCreate())
          this.response = new Reference(); // cc
      return this.response;
    }

    public boolean hasResponse() { 
      return this.response != null && !this.response.isEmpty();
    }

    /**
     * @param value {@link #response} (Reference of response to resource for which payment is being made.)
     */
    public PaymentNotice setResponse(Reference value) { 
      this.response = value;
      return this;
    }

    /**
     * @return {@link #created} (The date when this resource was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() { 
      if (this.created == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.created");
        else if (Configuration.doAutoCreate())
          this.created = new DateTimeType(); // bb
      return this.created;
    }

    public boolean hasCreatedElement() { 
      return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() { 
      return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (The date when this resource was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public PaymentNotice setCreatedElement(DateTimeType value) { 
      this.created = value;
      return this;
    }

    /**
     * @return The date when this resource was created.
     */
    public Date getCreated() { 
      return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when this resource was created.
     */
    public PaymentNotice setCreated(Date value) { 
        if (this.created == null)
          this.created = new DateTimeType();
        this.created.setValue(value);
      return this;
    }

    /**
     * @return {@link #reporter} (The party who reports the payment notice.)
     */
    public Reference getReporter() { 
      if (this.reporter == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.reporter");
        else if (Configuration.doAutoCreate())
          this.reporter = new Reference(); // cc
      return this.reporter;
    }

    public boolean hasReporter() { 
      return this.reporter != null && !this.reporter.isEmpty();
    }

    /**
     * @param value {@link #reporter} (The party who reports the payment notice.)
     */
    public PaymentNotice setReporter(Reference value) { 
      this.reporter = value;
      return this;
    }

    /**
     * @return {@link #payment} (A reference to the payment which is the subject of this notice.)
     */
    public Reference getPayment() { 
      if (this.payment == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.payment");
        else if (Configuration.doAutoCreate())
          this.payment = new Reference(); // cc
      return this.payment;
    }

    public boolean hasPayment() { 
      return this.payment != null && !this.payment.isEmpty();
    }

    /**
     * @param value {@link #payment} (A reference to the payment which is the subject of this notice.)
     */
    public PaymentNotice setPayment(Reference value) { 
      this.payment = value;
      return this;
    }

    /**
     * @return {@link #paymentDate} (The date when the above payment action occurred.). This is the underlying object with id, value and extensions. The accessor "getPaymentDate" gives direct access to the value
     */
    public DateType getPaymentDateElement() { 
      if (this.paymentDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.paymentDate");
        else if (Configuration.doAutoCreate())
          this.paymentDate = new DateType(); // bb
      return this.paymentDate;
    }

    public boolean hasPaymentDateElement() { 
      return this.paymentDate != null && !this.paymentDate.isEmpty();
    }

    public boolean hasPaymentDate() { 
      return this.paymentDate != null && !this.paymentDate.isEmpty();
    }

    /**
     * @param value {@link #paymentDate} (The date when the above payment action occurred.). This is the underlying object with id, value and extensions. The accessor "getPaymentDate" gives direct access to the value
     */
    public PaymentNotice setPaymentDateElement(DateType value) { 
      this.paymentDate = value;
      return this;
    }

    /**
     * @return The date when the above payment action occurred.
     */
    public Date getPaymentDate() { 
      return this.paymentDate == null ? null : this.paymentDate.getValue();
    }

    /**
     * @param value The date when the above payment action occurred.
     */
    public PaymentNotice setPaymentDate(Date value) { 
      if (value == null)
        this.paymentDate = null;
      else {
        if (this.paymentDate == null)
          this.paymentDate = new DateType();
        this.paymentDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #payee} (The party who will receive or has received payment that is the subject of this notification.)
     */
    public Reference getPayee() { 
      if (this.payee == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.payee");
        else if (Configuration.doAutoCreate())
          this.payee = new Reference(); // cc
      return this.payee;
    }

    public boolean hasPayee() { 
      return this.payee != null && !this.payee.isEmpty();
    }

    /**
     * @param value {@link #payee} (The party who will receive or has received payment that is the subject of this notification.)
     */
    public PaymentNotice setPayee(Reference value) { 
      this.payee = value;
      return this;
    }

    /**
     * @return {@link #recipient} (The party who is notified of the payment status.)
     */
    public Reference getRecipient() { 
      if (this.recipient == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.recipient");
        else if (Configuration.doAutoCreate())
          this.recipient = new Reference(); // cc
      return this.recipient;
    }

    public boolean hasRecipient() { 
      return this.recipient != null && !this.recipient.isEmpty();
    }

    /**
     * @param value {@link #recipient} (The party who is notified of the payment status.)
     */
    public PaymentNotice setRecipient(Reference value) { 
      this.recipient = value;
      return this;
    }

    /**
     * @return {@link #amount} (The amount sent to the payee.)
     */
    public Money getAmount() { 
      if (this.amount == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.amount");
        else if (Configuration.doAutoCreate())
          this.amount = new Money(); // cc
      return this.amount;
    }

    public boolean hasAmount() { 
      return this.amount != null && !this.amount.isEmpty();
    }

    /**
     * @param value {@link #amount} (The amount sent to the payee.)
     */
    public PaymentNotice setAmount(Money value) { 
      this.amount = value;
      return this;
    }

    /**
     * @return {@link #paymentStatus} (A code indicating whether payment has been sent or cleared.)
     */
    public CodeableConcept getPaymentStatus() { 
      if (this.paymentStatus == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PaymentNotice.paymentStatus");
        else if (Configuration.doAutoCreate())
          this.paymentStatus = new CodeableConcept(); // cc
      return this.paymentStatus;
    }

    public boolean hasPaymentStatus() { 
      return this.paymentStatus != null && !this.paymentStatus.isEmpty();
    }

    /**
     * @param value {@link #paymentStatus} (A code indicating whether payment has been sent or cleared.)
     */
    public PaymentNotice setPaymentStatus(CodeableConcept value) { 
      this.paymentStatus = value;
      return this;
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A unique identifier assigned to this payment notice.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("status", "code", "The status of the resource instance.", 0, 1, status));
        children.add(new Property("request", "Reference(Any)", "Reference of resource for which payment is being made.", 0, 1, request));
        children.add(new Property("response", "Reference(Any)", "Reference of response to resource for which payment is being made.", 0, 1, response));
        children.add(new Property("created", "dateTime", "The date when this resource was created.", 0, 1, created));
        children.add(new Property("reporter", "Reference(Practitioner|PractitionerRole|Organization)", "The party who reports the payment notice.", 0, 1, reporter));
        children.add(new Property("payment", "Reference(PaymentReconciliation)", "A reference to the payment which is the subject of this notice.", 0, 1, payment));
        children.add(new Property("paymentDate", "date", "The date when the above payment action occurred.", 0, 1, paymentDate));
        children.add(new Property("payee", "Reference(Practitioner|PractitionerRole|Organization)", "The party who will receive or has received payment that is the subject of this notification.", 0, 1, payee));
        children.add(new Property("recipient", "Reference(Organization)", "The party who is notified of the payment status.", 0, 1, recipient));
        children.add(new Property("amount", "Money", "The amount sent to the payee.", 0, 1, amount));
        children.add(new Property("paymentStatus", "CodeableConcept", "A code indicating whether payment has been sent or cleared.", 0, 1, paymentStatus));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A unique identifier assigned to this payment notice.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -892481550: /*status*/  return new Property("status", "code", "The status of the resource instance.", 0, 1, status);
        case 1095692943: /*request*/  return new Property("request", "Reference(Any)", "Reference of resource for which payment is being made.", 0, 1, request);
        case -340323263: /*response*/  return new Property("response", "Reference(Any)", "Reference of response to resource for which payment is being made.", 0, 1, response);
        case 1028554472: /*created*/  return new Property("created", "dateTime", "The date when this resource was created.", 0, 1, created);
        case -427039519: /*reporter*/  return new Property("reporter", "Reference(Practitioner|PractitionerRole|Organization)", "The party who reports the payment notice.", 0, 1, reporter);
        case -786681338: /*payment*/  return new Property("payment", "Reference(PaymentReconciliation)", "A reference to the payment which is the subject of this notice.", 0, 1, payment);
        case -1540873516: /*paymentDate*/  return new Property("paymentDate", "date", "The date when the above payment action occurred.", 0, 1, paymentDate);
        case 106443592: /*payee*/  return new Property("payee", "Reference(Practitioner|PractitionerRole|Organization)", "The party who will receive or has received payment that is the subject of this notification.", 0, 1, payee);
        case 820081177: /*recipient*/  return new Property("recipient", "Reference(Organization)", "The party who is notified of the payment status.", 0, 1, recipient);
        case -1413853096: /*amount*/  return new Property("amount", "Money", "The amount sent to the payee.", 0, 1, amount);
        case 1430704536: /*paymentStatus*/  return new Property("paymentStatus", "CodeableConcept", "A code indicating whether payment has been sent or cleared.", 0, 1, paymentStatus);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<FinancialResourceStatusCodes>
        case 1095692943: /*request*/ return this.request == null ? new Base[0] : new Base[] {this.request}; // Reference
        case -340323263: /*response*/ return this.response == null ? new Base[0] : new Base[] {this.response}; // Reference
        case 1028554472: /*created*/ return this.created == null ? new Base[0] : new Base[] {this.created}; // DateTimeType
        case -427039519: /*reporter*/ return this.reporter == null ? new Base[0] : new Base[] {this.reporter}; // Reference
        case -786681338: /*payment*/ return this.payment == null ? new Base[0] : new Base[] {this.payment}; // Reference
        case -1540873516: /*paymentDate*/ return this.paymentDate == null ? new Base[0] : new Base[] {this.paymentDate}; // DateType
        case 106443592: /*payee*/ return this.payee == null ? new Base[0] : new Base[] {this.payee}; // Reference
        case 820081177: /*recipient*/ return this.recipient == null ? new Base[0] : new Base[] {this.recipient}; // Reference
        case -1413853096: /*amount*/ return this.amount == null ? new Base[0] : new Base[] {this.amount}; // Money
        case 1430704536: /*paymentStatus*/ return this.paymentStatus == null ? new Base[0] : new Base[] {this.paymentStatus}; // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -892481550: // status
          value = new FinancialResourceStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<FinancialResourceStatusCodes>
          return value;
        case 1095692943: // request
          this.request = TypeConvertor.castToReference(value); // Reference
          return value;
        case -340323263: // response
          this.response = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1028554472: // created
          this.created = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -427039519: // reporter
          this.reporter = TypeConvertor.castToReference(value); // Reference
          return value;
        case -786681338: // payment
          this.payment = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1540873516: // paymentDate
          this.paymentDate = TypeConvertor.castToDate(value); // DateType
          return value;
        case 106443592: // payee
          this.payee = TypeConvertor.castToReference(value); // Reference
          return value;
        case 820081177: // recipient
          this.recipient = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1413853096: // amount
          this.amount = TypeConvertor.castToMoney(value); // Money
          return value;
        case 1430704536: // paymentStatus
          this.paymentStatus = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("status")) {
          value = new FinancialResourceStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<FinancialResourceStatusCodes>
        } else if (name.equals("request")) {
          this.request = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("response")) {
          this.response = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("created")) {
          this.created = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("reporter")) {
          this.reporter = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("payment")) {
          this.payment = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("paymentDate")) {
          this.paymentDate = TypeConvertor.castToDate(value); // DateType
        } else if (name.equals("payee")) {
          this.payee = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("recipient")) {
          this.recipient = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("amount")) {
          this.amount = TypeConvertor.castToMoney(value); // Money
        } else if (name.equals("paymentStatus")) {
          this.paymentStatus = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -892481550:  return getStatusElement();
        case 1095692943:  return getRequest();
        case -340323263:  return getResponse();
        case 1028554472:  return getCreatedElement();
        case -427039519:  return getReporter();
        case -786681338:  return getPayment();
        case -1540873516:  return getPaymentDateElement();
        case 106443592:  return getPayee();
        case 820081177:  return getRecipient();
        case -1413853096:  return getAmount();
        case 1430704536:  return getPaymentStatus();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 1095692943: /*request*/ return new String[] {"Reference"};
        case -340323263: /*response*/ return new String[] {"Reference"};
        case 1028554472: /*created*/ return new String[] {"dateTime"};
        case -427039519: /*reporter*/ return new String[] {"Reference"};
        case -786681338: /*payment*/ return new String[] {"Reference"};
        case -1540873516: /*paymentDate*/ return new String[] {"date"};
        case 106443592: /*payee*/ return new String[] {"Reference"};
        case 820081177: /*recipient*/ return new String[] {"Reference"};
        case -1413853096: /*amount*/ return new String[] {"Money"};
        case 1430704536: /*paymentStatus*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a singleton property PaymentNotice.status");
        }
        else if (name.equals("request")) {
          this.request = new Reference();
          return this.request;
        }
        else if (name.equals("response")) {
          this.response = new Reference();
          return this.response;
        }
        else if (name.equals("created")) {
          throw new FHIRException("Cannot call addChild on a singleton property PaymentNotice.created");
        }
        else if (name.equals("reporter")) {
          this.reporter = new Reference();
          return this.reporter;
        }
        else if (name.equals("payment")) {
          this.payment = new Reference();
          return this.payment;
        }
        else if (name.equals("paymentDate")) {
          throw new FHIRException("Cannot call addChild on a singleton property PaymentNotice.paymentDate");
        }
        else if (name.equals("payee")) {
          this.payee = new Reference();
          return this.payee;
        }
        else if (name.equals("recipient")) {
          this.recipient = new Reference();
          return this.recipient;
        }
        else if (name.equals("amount")) {
          this.amount = new Money();
          return this.amount;
        }
        else if (name.equals("paymentStatus")) {
          this.paymentStatus = new CodeableConcept();
          return this.paymentStatus;
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "PaymentNotice";

  }

      public PaymentNotice copy() {
        PaymentNotice dst = new PaymentNotice();
        copyValues(dst);
        return dst;
      }

      public void copyValues(PaymentNotice dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.request = request == null ? null : request.copy();
        dst.response = response == null ? null : response.copy();
        dst.created = created == null ? null : created.copy();
        dst.reporter = reporter == null ? null : reporter.copy();
        dst.payment = payment == null ? null : payment.copy();
        dst.paymentDate = paymentDate == null ? null : paymentDate.copy();
        dst.payee = payee == null ? null : payee.copy();
        dst.recipient = recipient == null ? null : recipient.copy();
        dst.amount = amount == null ? null : amount.copy();
        dst.paymentStatus = paymentStatus == null ? null : paymentStatus.copy();
      }

      protected PaymentNotice typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof PaymentNotice))
          return false;
        PaymentNotice o = (PaymentNotice) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(request, o.request, true)
           && compareDeep(response, o.response, true) && compareDeep(created, o.created, true) && compareDeep(reporter, o.reporter, true)
           && compareDeep(payment, o.payment, true) && compareDeep(paymentDate, o.paymentDate, true) && compareDeep(payee, o.payee, true)
           && compareDeep(recipient, o.recipient, true) && compareDeep(amount, o.amount, true) && compareDeep(paymentStatus, o.paymentStatus, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof PaymentNotice))
          return false;
        PaymentNotice o = (PaymentNotice) other_;
        return compareValues(status, o.status, true) && compareValues(created, o.created, true) && compareValues(paymentDate, o.paymentDate, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, request
          , response, created, reporter, payment, paymentDate, payee, recipient, amount
          , paymentStatus);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.PaymentNotice;
   }

 /**
   * Search parameter: <b>created</b>
   * <p>
   * Description: <b>Creation date for the notice</b><br>
   * Type: <b>date</b><br>
   * Path: <b>PaymentNotice.created</b><br>
   * </p>
   */
  @SearchParamDefinition(name="created", path="PaymentNotice.created", description="Creation date for the notice", type="date" )
  public static final String SP_CREATED = "created";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>created</b>
   * <p>
   * Description: <b>Creation date for the notice</b><br>
   * Type: <b>date</b><br>
   * Path: <b>PaymentNotice.created</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam CREATED = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_CREATED);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The business identifier of the notice</b><br>
   * Type: <b>token</b><br>
   * Path: <b>PaymentNotice.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="PaymentNotice.identifier", description="The business identifier of the notice", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The business identifier of the notice</b><br>
   * Type: <b>token</b><br>
   * Path: <b>PaymentNotice.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>payment-status</b>
   * <p>
   * Description: <b>The type of payment notice</b><br>
   * Type: <b>token</b><br>
   * Path: <b>PaymentNotice.paymentStatus</b><br>
   * </p>
   */
  @SearchParamDefinition(name="payment-status", path="PaymentNotice.paymentStatus", description="The type of payment notice", type="token" )
  public static final String SP_PAYMENT_STATUS = "payment-status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>payment-status</b>
   * <p>
   * Description: <b>The type of payment notice</b><br>
   * Type: <b>token</b><br>
   * Path: <b>PaymentNotice.paymentStatus</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PAYMENT_STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PAYMENT_STATUS);

 /**
   * Search parameter: <b>reporter</b>
   * <p>
   * Description: <b>The reference to the reporter</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>PaymentNotice.reporter</b><br>
   * </p>
   */
  @SearchParamDefinition(name="reporter", path="PaymentNotice.reporter", description="The reference to the reporter", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner") }, target={Organization.class, Practitioner.class, PractitionerRole.class } )
  public static final String SP_REPORTER = "reporter";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>reporter</b>
   * <p>
   * Description: <b>The reference to the reporter</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>PaymentNotice.reporter</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REPORTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REPORTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>PaymentNotice:reporter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REPORTER = new ca.uhn.fhir.model.api.Include("PaymentNotice:reporter").toLocked();

 /**
   * Search parameter: <b>request</b>
   * <p>
   * Description: <b>The Claim</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>PaymentNotice.request</b><br>
   * </p>
   */
  @SearchParamDefinition(name="request", path="PaymentNotice.request", description="The Claim", type="reference", target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BiologicallyDerivedProductDispense.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAssociation.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, EncounterHistory.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, FormularyItem.class, GenomicStudy.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryItem.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestPlan.class, TestReport.class, TestScript.class, Transport.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_REQUEST = "request";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>request</b>
   * <p>
   * Description: <b>The Claim</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>PaymentNotice.request</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUEST = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REQUEST);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>PaymentNotice:request</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUEST = new ca.uhn.fhir.model.api.Include("PaymentNotice:request").toLocked();

 /**
   * Search parameter: <b>response</b>
   * <p>
   * Description: <b>The ClaimResponse</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>PaymentNotice.response</b><br>
   * </p>
   */
  @SearchParamDefinition(name="response", path="PaymentNotice.response", description="The ClaimResponse", type="reference", target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BiologicallyDerivedProductDispense.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAssociation.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, EncounterHistory.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, FormularyItem.class, GenomicStudy.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryItem.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestPlan.class, TestReport.class, TestScript.class, Transport.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_RESPONSE = "response";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>response</b>
   * <p>
   * Description: <b>The ClaimResponse</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>PaymentNotice.response</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam RESPONSE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_RESPONSE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>PaymentNotice:response</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_RESPONSE = new ca.uhn.fhir.model.api.Include("PaymentNotice:response").toLocked();

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The status of the payment notice</b><br>
   * Type: <b>token</b><br>
   * Path: <b>PaymentNotice.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="PaymentNotice.status", description="The status of the payment notice", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The status of the payment notice</b><br>
   * Type: <b>token</b><br>
   * Path: <b>PaymentNotice.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);


}

