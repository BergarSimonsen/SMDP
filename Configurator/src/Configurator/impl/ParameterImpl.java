/**
 */
package Configurator.impl;

import Configurator.ConfiguratorPackage;
import Configurator.Parameter;
import Configurator.Type;
import java.lang.Integer;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Configurator.impl.ParameterImpl#getMaxChosenValues <em>Max Chosen Values</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getMinChosenValues <em>Min Chosen Values</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link Configurator.impl.ParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends NamedElementImpl implements Parameter {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> children;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

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
	public EList<Parameter> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Parameter>(Parameter.class, this, ConfiguratorPackage.PARAMETER__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorPackage.PARAMETER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorPackage.PARAMETER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.PARAMETER__TYPE, newType, newType));
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
			case ConfiguratorPackage.PARAMETER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ConfiguratorPackage.PARAMETER__TYPE:
				return basicSetType(null, msgs);
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
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				return getMaxChosenValues();
			case ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES:
				return getMinChosenValues();
			case ConfiguratorPackage.PARAMETER__CHILDREN:
				return getChildren();
			case ConfiguratorPackage.PARAMETER__TYPE:
				return getType();
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
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				setMaxChosenValues((Integer)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES:
				setMinChosenValues((Integer)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ConfiguratorPackage.PARAMETER__TYPE:
				setType((Type)newValue);
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
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				setMaxChosenValues(MAX_CHOSEN_VALUES_EDEFAULT);
				return;
			case ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES:
				setMinChosenValues(MIN_CHOSEN_VALUES_EDEFAULT);
				return;
			case ConfiguratorPackage.PARAMETER__CHILDREN:
				getChildren().clear();
				return;
			case ConfiguratorPackage.PARAMETER__TYPE:
				setType((Type)null);
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
			case ConfiguratorPackage.PARAMETER__MAX_CHOSEN_VALUES:
				return maxChosenValues != MAX_CHOSEN_VALUES_EDEFAULT;
			case ConfiguratorPackage.PARAMETER__MIN_CHOSEN_VALUES:
				return minChosenValues != MIN_CHOSEN_VALUES_EDEFAULT;
			case ConfiguratorPackage.PARAMETER__CHILDREN:
				return children != null && !children.isEmpty();
			case ConfiguratorPackage.PARAMETER__TYPE:
				return type != null;
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
		result.append(" (maxChosenValues: ");
		result.append(maxChosenValues);
		result.append(", minChosenValues: ");
		result.append(minChosenValues);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
