/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getDiagnosisLinkId <em>Diagnosis Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getLocationCoding <em>Location Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getSubSite <em>Sub Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimItem#getProsthesis <em>Prosthesis</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimItem()
 * @model extendedMetaData="name='Claim.Item' kind='elementOnly'"
 * @generated
 */
public interface ClaimItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimCareTeam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_CareTeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careTeam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimCareTeam> getCareTeam();

	/**
	 * Returns the value of the '<em><b>Diagnosis Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnosis applicable for this service or product line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_DiagnosisLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getDiagnosisLinkId();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of reveneu or cost center providing the product and/or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revenue</em>' containment reference.
	 * @see #setRevenue(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Revenue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revenue' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRevenue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getRevenue <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' containment reference.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(Coding value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Health Care Service Type Codes  to identify the classification of service or benefits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Coding value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Coding value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of repetitions of a service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_UnitPrice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' containment reference.
	 * @see #setPoints(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Points()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='points' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPoints();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getPoints <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' containment reference.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(Decimal value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Unique Device Identifiers associated with this line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Udi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udi' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUdi();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical service site on the patient (limb, tooth, etc).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(Coding value);

	/**
	 * Returns the value of the '<em><b>Sub Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region or surface of the site, eg. limb region or tooth surface(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_SubSite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subSite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSubSite();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getModifier();

	/**
	 * Returns the value of the '<em><b>Program Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_ProgramCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='programCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getProgramCode();

	/**
	 * Returns the value of the '<em><b>Serviced Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or dates when the enclosed suite of services were performed or completed. (choose any one of serviced*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serviced Date</em>' containment reference.
	 * @see #setServicedDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_ServicedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getServicedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getServicedDate <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Date</em>' containment reference.
	 * @see #getServicedDate()
	 * @generated
	 */
	void setServicedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Serviced Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or dates when the enclosed suite of services were performed or completed. (choose any one of serviced*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serviced Period</em>' containment reference.
	 * @see #setServicedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_ServicedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getServicedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getServicedPeriod <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Period</em>' containment reference.
	 * @see #getServicedPeriod()
	 * @generated
	 */
	void setServicedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Location Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the service was provided. (choose any one of location*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Coding</em>' containment reference.
	 * @see #setLocationCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_LocationCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getLocationCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getLocationCoding <em>Location Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Coding</em>' containment reference.
	 * @see #getLocationCoding()
	 * @generated
	 */
	void setLocationCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Location Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the service was provided. (choose any one of location*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Address</em>' containment reference.
	 * @see #setLocationAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_LocationAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getLocationAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getLocationAddress <em>Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Address</em>' containment reference.
	 * @see #getLocationAddress()
	 * @generated
	 */
	void setLocationAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Location Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the service was provided. (choose any one of location*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Reference</em>' containment reference.
	 * @see #setLocationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_LocationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getLocationReference <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Reference</em>' containment reference.
	 * @see #getLocationReference()
	 * @generated
	 */
	void setLocationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Second tier of goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimDetail> getDetail();

	/**
	 * Returns the value of the '<em><b>Prosthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The materials and placement date of prior fixed prosthesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prosthesis</em>' containment reference.
	 * @see #setProsthesis(ClaimProsthesis)
	 * @see org.hl7.fhir.FhirPackage#getClaimItem_Prosthesis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prosthesis' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimProsthesis getProsthesis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimItem#getProsthesis <em>Prosthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prosthesis</em>' containment reference.
	 * @see #getProsthesis()
	 * @generated
	 */
	void setProsthesis(ClaimProsthesis value);

} // ClaimItem
