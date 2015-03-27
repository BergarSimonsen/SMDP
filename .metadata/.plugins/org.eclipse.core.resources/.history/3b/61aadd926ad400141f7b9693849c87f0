/**
 */
package Configurator.impl;

import Configurator.ConfiguratorPackage;
import Configurator.Parameter;
import Configurator.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Configurator.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getMaxChosenValues <em>Max Chosen Values</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getParamType <em>Param Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxChosenValues() <em>Max Chosen Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxChosenValues()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CHOSEN_VALUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxChosenValues() <em>Max Chosen Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxChosenValues()
	 * @generated
	 * @ordered
	 */
	protected int maxChosenValues = MAX_CHOSEN_VALUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParamType() <em>Param Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamType()
	 * @generated
	 * @ordered
	 */
	protected Type paramType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxChosenValues() {
		return maxChosenValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxChosenValues(int newMaxChosenValues) {
		int oldMaxChosenValues = maxChosenValues;
		maxChosenValues = newMaxChosenValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES, oldMaxChosenValues, maxChosenValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getParamType() {
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamType(Type newParamType, NotificationChain msgs) {
		Type oldParamType = paramType;
		paramType = newParamType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__PARAM_TYPE, oldParamType, newParamType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamType(Type newParamType) {
		if (newParamType != paramType) {
			NotificationChain msgs = null;
			if (paramType != null)
				msgs = ((InternalEObject)paramType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorPackage.PARAMETER__PARAM_TYPE, null, msgs);
			if (newParamType != null)
				msgs = ((InternalEObject)newParamType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorPackage.PARAMETER__PARAM_TYPE, null, msgs);
			msgs = basicSetParamType(newParamType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__PARAM_TYPE, newParamType, newParamType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorPackage.PARAMETER__PARAM_TYPE:
				return basicSetParamType(null, msgs);
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
			case ConfiguratorPackage.PARAMETER__NAME:
				return getName();
			case ConfiguratorPackage.PARAMETER__REQUIRED:
				return isRequired();
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				return getMaxChosenValues();
			case ConfiguratorPackage.PARAMETER__PARAM_TYPE:
				return getParamType();
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
			case ConfiguratorPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				setMaxChosenValues((Integer)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__PARAM_TYPE:
				setParamType((Type)newValue);
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
			case ConfiguratorPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfiguratorPackage.PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				setMaxChosenValues(MAX_CHOSEN_VALUES_EDEFAULT);
				return;
			case ConfiguratorPackage.PARAMETER__PARAM_TYPE:
				setParamType((Type)null);
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
			case ConfiguratorPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfiguratorPackage.PARAMETER__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				return maxChosenValues != MAX_CHOSEN_VALUES_EDEFAULT;
			case ConfiguratorPackage.PARAMETER__PARAM_TYPE:
				return paramType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", required: ");
		result.append(required);
		result.append(", maxChosenValues: ");
		result.append(maxChosenValues);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
