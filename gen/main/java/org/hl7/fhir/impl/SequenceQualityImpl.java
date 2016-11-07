/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.SequenceQuality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getStandardSequence <em>Standard Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getTruthTP <em>Truth TP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getQueryTP <em>Query TP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getTruthFN <em>Truth FN</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getQueryFP <em>Query FP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getGtFP <em>Gt FP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getRecall <em>Recall</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceQualityImpl#getFScore <em>FScore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceQualityImpl extends BackboneElementImpl implements SequenceQuality {
	/**
	 * The cached value of the '{@link #getStandardSequence() <em>Standard Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSequence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept standardSequence;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer end;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Quantity score;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getTruthTP() <em>Truth TP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthTP()
	 * @generated
	 * @ordered
	 */
	protected Decimal truthTP;

	/**
	 * The cached value of the '{@link #getQueryTP() <em>Query TP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryTP()
	 * @generated
	 * @ordered
	 */
	protected Decimal queryTP;

	/**
	 * The cached value of the '{@link #getTruthFN() <em>Truth FN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthFN()
	 * @generated
	 * @ordered
	 */
	protected Decimal truthFN;

	/**
	 * The cached value of the '{@link #getQueryFP() <em>Query FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryFP()
	 * @generated
	 * @ordered
	 */
	protected Decimal queryFP;

	/**
	 * The cached value of the '{@link #getGtFP() <em>Gt FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGtFP()
	 * @generated
	 * @ordered
	 */
	protected Decimal gtFP;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Decimal precision;

	/**
	 * The cached value of the '{@link #getRecall() <em>Recall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecall()
	 * @generated
	 * @ordered
	 */
	protected Decimal recall;

	/**
	 * The cached value of the '{@link #getFScore() <em>FScore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal fScore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceQualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequenceQuality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStandardSequence() {
		return standardSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardSequence(CodeableConcept newStandardSequence, NotificationChain msgs) {
		CodeableConcept oldStandardSequence = standardSequence;
		standardSequence = newStandardSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE, oldStandardSequence, newStandardSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardSequence(CodeableConcept newStandardSequence) {
		if (newStandardSequence != standardSequence) {
			NotificationChain msgs = null;
			if (standardSequence != null)
				msgs = ((InternalEObject)standardSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE, null, msgs);
			if (newStandardSequence != null)
				msgs = ((InternalEObject)newStandardSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE, null, msgs);
			msgs = basicSetStandardSequence(newStandardSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE, newStandardSequence, newStandardSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(org.hl7.fhir.Integer newStart, NotificationChain msgs) {
		org.hl7.fhir.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(org.hl7.fhir.Integer newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(org.hl7.fhir.Integer newEnd, NotificationChain msgs) {
		org.hl7.fhir.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(org.hl7.fhir.Integer newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Quantity newScore, NotificationChain msgs) {
		Quantity oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__SCORE, oldScore, newScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(Quantity newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getTruthTP() {
		return truthTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruthTP(Decimal newTruthTP, NotificationChain msgs) {
		Decimal oldTruthTP = truthTP;
		truthTP = newTruthTP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__TRUTH_TP, oldTruthTP, newTruthTP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruthTP(Decimal newTruthTP) {
		if (newTruthTP != truthTP) {
			NotificationChain msgs = null;
			if (truthTP != null)
				msgs = ((InternalEObject)truthTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__TRUTH_TP, null, msgs);
			if (newTruthTP != null)
				msgs = ((InternalEObject)newTruthTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__TRUTH_TP, null, msgs);
			msgs = basicSetTruthTP(newTruthTP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__TRUTH_TP, newTruthTP, newTruthTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getQueryTP() {
		return queryTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryTP(Decimal newQueryTP, NotificationChain msgs) {
		Decimal oldQueryTP = queryTP;
		queryTP = newQueryTP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__QUERY_TP, oldQueryTP, newQueryTP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryTP(Decimal newQueryTP) {
		if (newQueryTP != queryTP) {
			NotificationChain msgs = null;
			if (queryTP != null)
				msgs = ((InternalEObject)queryTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__QUERY_TP, null, msgs);
			if (newQueryTP != null)
				msgs = ((InternalEObject)newQueryTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__QUERY_TP, null, msgs);
			msgs = basicSetQueryTP(newQueryTP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__QUERY_TP, newQueryTP, newQueryTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getTruthFN() {
		return truthFN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruthFN(Decimal newTruthFN, NotificationChain msgs) {
		Decimal oldTruthFN = truthFN;
		truthFN = newTruthFN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__TRUTH_FN, oldTruthFN, newTruthFN);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruthFN(Decimal newTruthFN) {
		if (newTruthFN != truthFN) {
			NotificationChain msgs = null;
			if (truthFN != null)
				msgs = ((InternalEObject)truthFN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__TRUTH_FN, null, msgs);
			if (newTruthFN != null)
				msgs = ((InternalEObject)newTruthFN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__TRUTH_FN, null, msgs);
			msgs = basicSetTruthFN(newTruthFN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__TRUTH_FN, newTruthFN, newTruthFN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getQueryFP() {
		return queryFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryFP(Decimal newQueryFP, NotificationChain msgs) {
		Decimal oldQueryFP = queryFP;
		queryFP = newQueryFP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__QUERY_FP, oldQueryFP, newQueryFP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryFP(Decimal newQueryFP) {
		if (newQueryFP != queryFP) {
			NotificationChain msgs = null;
			if (queryFP != null)
				msgs = ((InternalEObject)queryFP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__QUERY_FP, null, msgs);
			if (newQueryFP != null)
				msgs = ((InternalEObject)newQueryFP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__QUERY_FP, null, msgs);
			msgs = basicSetQueryFP(newQueryFP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__QUERY_FP, newQueryFP, newQueryFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getGtFP() {
		return gtFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGtFP(Decimal newGtFP, NotificationChain msgs) {
		Decimal oldGtFP = gtFP;
		gtFP = newGtFP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__GT_FP, oldGtFP, newGtFP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGtFP(Decimal newGtFP) {
		if (newGtFP != gtFP) {
			NotificationChain msgs = null;
			if (gtFP != null)
				msgs = ((InternalEObject)gtFP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__GT_FP, null, msgs);
			if (newGtFP != null)
				msgs = ((InternalEObject)newGtFP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__GT_FP, null, msgs);
			msgs = basicSetGtFP(newGtFP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__GT_FP, newGtFP, newGtFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecision(Decimal newPrecision, NotificationChain msgs) {
		Decimal oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__PRECISION, oldPrecision, newPrecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Decimal newPrecision) {
		if (newPrecision != precision) {
			NotificationChain msgs = null;
			if (precision != null)
				msgs = ((InternalEObject)precision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__PRECISION, null, msgs);
			if (newPrecision != null)
				msgs = ((InternalEObject)newPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__PRECISION, null, msgs);
			msgs = basicSetPrecision(newPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__PRECISION, newPrecision, newPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getRecall() {
		return recall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecall(Decimal newRecall, NotificationChain msgs) {
		Decimal oldRecall = recall;
		recall = newRecall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__RECALL, oldRecall, newRecall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecall(Decimal newRecall) {
		if (newRecall != recall) {
			NotificationChain msgs = null;
			if (recall != null)
				msgs = ((InternalEObject)recall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__RECALL, null, msgs);
			if (newRecall != null)
				msgs = ((InternalEObject)newRecall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__RECALL, null, msgs);
			msgs = basicSetRecall(newRecall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__RECALL, newRecall, newRecall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFScore() {
		return fScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFScore(Decimal newFScore, NotificationChain msgs) {
		Decimal oldFScore = fScore;
		fScore = newFScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__FSCORE, oldFScore, newFScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFScore(Decimal newFScore) {
		if (newFScore != fScore) {
			NotificationChain msgs = null;
			if (fScore != null)
				msgs = ((InternalEObject)fScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__FSCORE, null, msgs);
			if (newFScore != null)
				msgs = ((InternalEObject)newFScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_QUALITY__FSCORE, null, msgs);
			msgs = basicSetFScore(newFScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_QUALITY__FSCORE, newFScore, newFScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return basicSetStandardSequence(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__START:
				return basicSetStart(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__SCORE:
				return basicSetScore(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_TP:
				return basicSetTruthTP(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__QUERY_TP:
				return basicSetQueryTP(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_FN:
				return basicSetTruthFN(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__QUERY_FP:
				return basicSetQueryFP(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__GT_FP:
				return basicSetGtFP(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__PRECISION:
				return basicSetPrecision(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__RECALL:
				return basicSetRecall(null, msgs);
			case FhirPackage.SEQUENCE_QUALITY__FSCORE:
				return basicSetFScore(null, msgs);
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
			case FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return getStandardSequence();
			case FhirPackage.SEQUENCE_QUALITY__START:
				return getStart();
			case FhirPackage.SEQUENCE_QUALITY__END:
				return getEnd();
			case FhirPackage.SEQUENCE_QUALITY__SCORE:
				return getScore();
			case FhirPackage.SEQUENCE_QUALITY__METHOD:
				return getMethod();
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_TP:
				return getTruthTP();
			case FhirPackage.SEQUENCE_QUALITY__QUERY_TP:
				return getQueryTP();
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_FN:
				return getTruthFN();
			case FhirPackage.SEQUENCE_QUALITY__QUERY_FP:
				return getQueryFP();
			case FhirPackage.SEQUENCE_QUALITY__GT_FP:
				return getGtFP();
			case FhirPackage.SEQUENCE_QUALITY__PRECISION:
				return getPrecision();
			case FhirPackage.SEQUENCE_QUALITY__RECALL:
				return getRecall();
			case FhirPackage.SEQUENCE_QUALITY__FSCORE:
				return getFScore();
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
			case FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				setStandardSequence((CodeableConcept)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__START:
				setStart((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__END:
				setEnd((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__SCORE:
				setScore((Quantity)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_TP:
				setTruthTP((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__QUERY_TP:
				setQueryTP((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_FN:
				setTruthFN((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__QUERY_FP:
				setQueryFP((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__GT_FP:
				setGtFP((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__PRECISION:
				setPrecision((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__RECALL:
				setRecall((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE_QUALITY__FSCORE:
				setFScore((Decimal)newValue);
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
			case FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				setStandardSequence((CodeableConcept)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__START:
				setStart((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__END:
				setEnd((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__SCORE:
				setScore((Quantity)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_TP:
				setTruthTP((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__QUERY_TP:
				setQueryTP((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_FN:
				setTruthFN((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__QUERY_FP:
				setQueryFP((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__GT_FP:
				setGtFP((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__PRECISION:
				setPrecision((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__RECALL:
				setRecall((Decimal)null);
				return;
			case FhirPackage.SEQUENCE_QUALITY__FSCORE:
				setFScore((Decimal)null);
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
			case FhirPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return standardSequence != null;
			case FhirPackage.SEQUENCE_QUALITY__START:
				return start != null;
			case FhirPackage.SEQUENCE_QUALITY__END:
				return end != null;
			case FhirPackage.SEQUENCE_QUALITY__SCORE:
				return score != null;
			case FhirPackage.SEQUENCE_QUALITY__METHOD:
				return method != null;
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_TP:
				return truthTP != null;
			case FhirPackage.SEQUENCE_QUALITY__QUERY_TP:
				return queryTP != null;
			case FhirPackage.SEQUENCE_QUALITY__TRUTH_FN:
				return truthFN != null;
			case FhirPackage.SEQUENCE_QUALITY__QUERY_FP:
				return queryFP != null;
			case FhirPackage.SEQUENCE_QUALITY__GT_FP:
				return gtFP != null;
			case FhirPackage.SEQUENCE_QUALITY__PRECISION:
				return precision != null;
			case FhirPackage.SEQUENCE_QUALITY__RECALL:
				return recall != null;
			case FhirPackage.SEQUENCE_QUALITY__FSCORE:
				return fScore != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceQualityImpl
