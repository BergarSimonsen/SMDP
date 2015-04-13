/**
 */
package Configurator.impl;

import Configurator.ConfiguratorPackage;
import Configurator.Literal;
import Configurator.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Configurator.impl.ParameterImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getMaxChosenValues <em>Max Chosen Values</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getEnumValue <em>Enum Value</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getMinChosenValues <em>Min Chosen Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
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
	 * The cached value of the '{@link #getLiteralValue() <em>Literal Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> literalValue;

	/**
	 * The cached value of the '{@link #getEnumValue() <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValue()
	 * @generated
	 * @ordered
	 */
	protected Configurator.Enum enumValue;

	/**
	 * The default value of the '{@link #getMinChosenValues() <em>Min Chosen Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinChosenValues()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CHOSEN_VALUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinChosenValues() <em>Min Chosen Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinChosenValues()
	 * @generated
	 * @ordered
	 */
	protected int minChosenValues = MIN_CHOSEN_VALUES_EDEFAULT;

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
	public EList<Literal> getLiteralValue() {
		if (literalValue == null) {
			literalValue = new EObjectContainmentEList<Literal>(Literal.class, this, ConfiguratorPackage.PARAMETER__LITERAL_VALUE);
		}
		return literalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configurator.Enum getEnumValue() {
		if (enumValue != null && enumValue.eIsProxy()) {
			InternalEObject oldEnumValue = (InternalEObject)enumValue;
			enumValue = (Configurator.Enum)eResolveProxy(oldEnumValue);
			if (enumValue != oldEnumValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfiguratorPackage.PARAMETER__ENUM_VALUE, oldEnumValue, enumValue));
			}
		}
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configurator.Enum basicGetEnumValue() {
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumValue(Configurator.Enum newEnumValue) {
		Configurator.Enum oldEnumValue = enumValue;
		enumValue = newEnumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__ENUM_VALUE, oldEnumValue, enumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinChosenValues() {
		return minChosenValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinChosenValues(int newMinChosenValues) {
		int oldMinChosenValues = minChosenValues;
		minChosenValues = newMinChosenValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES, oldMinChosenValues, minChosenValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorPackage.PARAMETER__LITERAL_VALUE:
				return ((InternalEList<?>)getLiteralValue()).basicRemove(otherEnd, msgs);
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
			case ConfiguratorPackage.PARAMETER__REQUIRED:
				return isRequired();
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				return getMaxChosenValues();
			case ConfiguratorPackage.PARAMETER__LITERAL_VALUE:
				return getLiteralValue();
			case ConfiguratorPackage.PARAMETER__ENUM_VALUE:
				if (resolve) return getEnumValue();
				return basicGetEnumValue();
			case ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES:
				return getMinChosenValues();
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
			case ConfiguratorPackage.PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				setMaxChosenValues((Integer)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__LITERAL_VALUE:
				getLiteralValue().clear();
				getLiteralValue().addAll((Collection<? extends Literal>)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__ENUM_VALUE:
				setEnumValue((Configurator.Enum)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES:
				setMinChosenValues((Integer)newValue);
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
			case ConfiguratorPackage.PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				setMaxChosenValues(MAX_CHOSEN_VALUES_EDEFAULT);
				return;
			case ConfiguratorPackage.PARAMETER__LITERAL_VALUE:
				getLiteralValue().clear();
				return;
			case ConfiguratorPackage.PARAMETER__ENUM_VALUE:
				setEnumValue((Configurator.Enum)null);
				return;
			case ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES:
				setMinChosenValues(MIN_CHOSEN_VALUES_EDEFAULT);
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
			case ConfiguratorPackage.PARAMETER__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				return maxChosenValues != MAX_CHOSEN_VALUES_EDEFAULT;
			case ConfiguratorPackage.PARAMETER__LITERAL_VALUE:
				return literalValue != null && !literalValue.isEmpty();
			case ConfiguratorPackage.PARAMETER__ENUM_VALUE:
				return enumValue != null;
			case ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES:
				return minChosenValues != MIN_CHOSEN_VALUES_EDEFAULT;
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
		result.append(" (required: ");
		result.append(required);
		result.append(", maxChosenValues: ");
		result.append(maxChosenValues);
		result.append(", minChosenValues: ");
		result.append(minChosenValues);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
