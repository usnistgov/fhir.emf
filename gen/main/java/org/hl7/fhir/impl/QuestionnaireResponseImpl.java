/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getAuthored <em>Authored</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireResponseImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireResponseImpl extends DomainResourceImpl implements QuestionnaireResponse {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> parent;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Reference questionnaire;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireResponseStatus status;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getAuthored() <em>Authored</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthored()
	 * @generated
	 * @ordered
	 */
	protected DateTime authored;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireResponseItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuestionnaireResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.QUESTIONNAIRE_RESPONSE__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getParent() {
		if (parent == null) {
			parent = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.QUESTIONNAIRE_RESPONSE__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Reference newQuestionnaire, NotificationChain msgs) {
		Reference oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, oldQuestionnaire, newQuestionnaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Reference newQuestionnaire) {
		if (newQuestionnaire != questionnaire) {
			NotificationChain msgs = null;
			if (questionnaire != null)
				msgs = ((InternalEObject)questionnaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, null, msgs);
			if (newQuestionnaire != null)
				msgs = ((InternalEObject)newQuestionnaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, null, msgs);
			msgs = basicSetQuestionnaire(newQuestionnaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, newQuestionnaire, newQuestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(QuestionnaireResponseStatus newStatus, NotificationChain msgs) {
		QuestionnaireResponseStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(QuestionnaireResponseStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthored() {
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthored(DateTime newAuthored, NotificationChain msgs) {
		DateTime oldAuthored = authored;
		authored = newAuthored;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, oldAuthored, newAuthored);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthored(DateTime newAuthored) {
		if (newAuthored != authored) {
			NotificationChain msgs = null;
			if (authored != null)
				msgs = ((InternalEObject)authored).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, null, msgs);
			if (newAuthored != null)
				msgs = ((InternalEObject)newAuthored).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, null, msgs);
			msgs = basicSetAuthored(newAuthored, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, newAuthored, newAuthored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireResponseItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<QuestionnaireResponseItem>(QuestionnaireResponseItem.class, this, FhirPackage.QUESTIONNAIRE_RESPONSE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				return ((InternalEList<?>)getParent()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				return basicSetAuthored(null, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				return getBasedOn();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				return getParent();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return getQuestionnaire();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				return getStatus();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				return getSubject();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				return getContext();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				return getAuthor();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				return getAuthored();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				return getSource();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				return getItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Reference)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				setStatus((QuestionnaireResponseStatus)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				setAuthored((DateTime)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				setSource((Reference)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends QuestionnaireResponseItem>)newValue);
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
			case FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				getParent().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Reference)null);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				setStatus((QuestionnaireResponseStatus)null);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				setAuthored((DateTime)null);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				setSource((Reference)null);
				return;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				getItem().clear();
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
			case FhirPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				return parent != null && !parent.isEmpty();
			case FhirPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return questionnaire != null;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				return status != null;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				return subject != null;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				return context != null;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				return author != null;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				return authored != null;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				return source != null;
			case FhirPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseImpl
