/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Code;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GuidanceResponseRelatedAction;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response Related Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseRelatedActionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseRelatedActionImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseRelatedActionImpl#getOffsetDuration <em>Offset Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseRelatedActionImpl#getOffsetRange <em>Offset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseRelatedActionImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceResponseRelatedActionImpl extends BackboneElementImpl implements GuidanceResponseRelatedAction {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Code relationship;

	/**
	 * The cached value of the '{@link #getOffsetDuration() <em>Offset Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration offsetDuration;

	/**
	 * The cached value of the '{@link #getOffsetRange() <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetRange()
	 * @generated
	 * @ordered
	 */
	protected Range offsetRange;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected Code anchor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceResponseRelatedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGuidanceResponseRelatedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionIdentifier(Identifier newActionIdentifier, NotificationChain msgs) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, newActionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		if (newActionIdentifier != actionIdentifier) {
			NotificationChain msgs = null;
			if (actionIdentifier != null)
				msgs = ((InternalEObject)actionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER, null, msgs);
			if (newActionIdentifier != null)
				msgs = ((InternalEObject)newActionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER, null, msgs);
			msgs = basicSetActionIdentifier(newActionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER, newActionIdentifier, newActionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Code newRelationship, NotificationChain msgs) {
		Code oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Code newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getOffsetDuration() {
		return offsetDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetDuration(Duration newOffsetDuration, NotificationChain msgs) {
		Duration oldOffsetDuration = offsetDuration;
		offsetDuration = newOffsetDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION, oldOffsetDuration, newOffsetDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetDuration(Duration newOffsetDuration) {
		if (newOffsetDuration != offsetDuration) {
			NotificationChain msgs = null;
			if (offsetDuration != null)
				msgs = ((InternalEObject)offsetDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION, null, msgs);
			if (newOffsetDuration != null)
				msgs = ((InternalEObject)newOffsetDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION, null, msgs);
			msgs = basicSetOffsetDuration(newOffsetDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION, newOffsetDuration, newOffsetDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getOffsetRange() {
		return offsetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetRange(Range newOffsetRange, NotificationChain msgs) {
		Range oldOffsetRange = offsetRange;
		offsetRange = newOffsetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE, oldOffsetRange, newOffsetRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetRange(Range newOffsetRange) {
		if (newOffsetRange != offsetRange) {
			NotificationChain msgs = null;
			if (offsetRange != null)
				msgs = ((InternalEObject)offsetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE, null, msgs);
			if (newOffsetRange != null)
				msgs = ((InternalEObject)newOffsetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE, null, msgs);
			msgs = basicSetOffsetRange(newOffsetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE, newOffsetRange, newOffsetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAnchor() {
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchor(Code newAnchor, NotificationChain msgs) {
		Code oldAnchor = anchor;
		anchor = newAnchor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR, oldAnchor, newAnchor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchor(Code newAnchor) {
		if (newAnchor != anchor) {
			NotificationChain msgs = null;
			if (anchor != null)
				msgs = ((InternalEObject)anchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR, null, msgs);
			if (newAnchor != null)
				msgs = ((InternalEObject)newAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR, null, msgs);
			msgs = basicSetAnchor(newAnchor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR, newAnchor, newAnchor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER:
				return basicSetActionIdentifier(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION:
				return basicSetOffsetDuration(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE:
				return basicSetOffsetRange(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR:
				return basicSetAnchor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER:
				return getActionIdentifier();
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP:
				return getRelationship();
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION:
				return getOffsetDuration();
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE:
				return getOffsetRange();
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR:
				return getAnchor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP:
				setRelationship((Code)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION:
				setOffsetDuration((Duration)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE:
				setOffsetRange((Range)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR:
				setAnchor((Code)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP:
				setRelationship((Code)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION:
				setOffsetDuration((Duration)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE:
				setOffsetRange((Range)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR:
				setAnchor((Code)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__RELATIONSHIP:
				return relationship != null;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_DURATION:
				return offsetDuration != null;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__OFFSET_RANGE:
				return offsetRange != null;
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION__ANCHOR:
				return anchor != null;
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseRelatedActionImpl
