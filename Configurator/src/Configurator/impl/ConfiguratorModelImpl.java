/**
 */
package Configurator.impl;

import Configurator.ConfiguratorModel;
import Configurator.ConfiguratorPackage;
import Configurator.Constraint;
import Configurator.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Configurator.impl.ConfiguratorModelImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link Configurator.impl.ConfiguratorModelImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link Configurator.impl.ConfiguratorModelImpl#getEnums <em>Enums</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfiguratorModelImpl extends NamedElementImpl implements ConfiguratorModel {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<Configurator.Enum> enums;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguratorModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorPackage.Literals.CONFIGURATOR_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ConfiguratorPackage.CONFIGURATOR_MODEL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ConfiguratorPackage.CONFIGURATOR_MODEL__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configurator.Enum> getEnums() {
		if (enums == null) {
			enums = new EObjectContainmentEList<Configurator.Enum>(Configurator.Enum.class, this, ConfiguratorPackage.CONFIGURATOR_MODEL__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorPackage.CONFIGURATOR_MODEL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ConfiguratorPackage.CONFIGURATOR_MODEL__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case ConfiguratorPackage.CONFIGURATOR_MODEL__ENUMS:
				return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
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
			case ConfiguratorPackage.CONFIGURATOR_MODEL__PARAMETERS:
				return getParameters();
			case ConfiguratorPackage.CONFIGURATOR_MODEL__CONSTRAINTS:
				return getConstraints();
			case ConfiguratorPackage.CONFIGURATOR_MODEL__ENUMS:
				return getEnums();
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
			case ConfiguratorPackage.CONFIGURATOR_MODEL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ConfiguratorPackage.CONFIGURATOR_MODEL__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ConfiguratorPackage.CONFIGURATOR_MODEL__ENUMS:
				getEnums().clear();
				getEnums().addAll((Collection<? extends Configurator.Enum>)newValue);
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
			case ConfiguratorPackage.CONFIGURATOR_MODEL__PARAMETERS:
				getParameters().clear();
				return;
			case ConfiguratorPackage.CONFIGURATOR_MODEL__CONSTRAINTS:
				getConstraints().clear();
				return;
			case ConfiguratorPackage.CONFIGURATOR_MODEL__ENUMS:
				getEnums().clear();
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
			case ConfiguratorPackage.CONFIGURATOR_MODEL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ConfiguratorPackage.CONFIGURATOR_MODEL__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case ConfiguratorPackage.CONFIGURATOR_MODEL__ENUMS:
				return enums != null && !enums.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfiguratorModelImpl
