/**
 */
package Configurator;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Configurator.Parameter#isRequired <em>Required</em>}</li>
 *   <li>{@link Configurator.Parameter#getMaxChosenValues <em>Max Chosen Values</em>}</li>
 *   <li>{@link Configurator.Parameter#getLiteralValues <em>Literal Values</em>}</li>
 *   <li>{@link Configurator.Parameter#getEnumValue <em>Enum Value</em>}</li>
 *   <li>{@link Configurator.Parameter#getMinChosenValues <em>Min Chosen Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see Configurator.ConfiguratorPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see Configurator.ConfiguratorPackage#getParameter_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link Configurator.Parameter#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Chosen Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Chosen Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Chosen Values</em>' attribute.
	 * @see #setMaxChosenValues(int)
	 * @see Configurator.ConfiguratorPackage#getParameter_MaxChosenValues()
	 * @model
	 * @generated
	 */
	int getMaxChosenValues();

	/**
	 * Sets the value of the '{@link Configurator.Parameter#getMaxChosenValues <em>Max Chosen Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Chosen Values</em>' attribute.
	 * @see #getMaxChosenValues()
	 * @generated
	 */
	void setMaxChosenValues(int value);

	/**
	 * Returns the value of the '<em><b>Literal Values</b></em>' containment reference list.
	 * The list contents are of type {@link Configurator.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Values</em>' containment reference list.
	 * @see Configurator.ConfiguratorPackage#getParameter_LiteralValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Literal> getLiteralValues();

	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' reference list.
	 * The list contents are of type {@link Configurator.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value</em>' reference list.
	 * @see Configurator.ConfiguratorPackage#getParameter_EnumValue()
	 * @model
	 * @generated
	 */
	EList<Configurator.Enum> getEnumValue();

	/**
	 * Returns the value of the '<em><b>Min Chosen Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Chosen Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Chosen Values</em>' attribute.
	 * @see #setMinChosenValues(int)
	 * @see Configurator.ConfiguratorPackage#getParameter_MinChosenValues()
	 * @model
	 * @generated
	 */
	int getMinChosenValues();

	/**
	 * Sets the value of the '{@link Configurator.Parameter#getMinChosenValues <em>Min Chosen Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Chosen Values</em>' attribute.
	 * @see #getMinChosenValues()
	 * @generated
	 */
	void setMinChosenValues(int value);

} // Parameter
