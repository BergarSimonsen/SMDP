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
 *   <li>{@link Configurator.Parameter#getMaxChosenValues <em>Max Chosen Values</em>}</li>
 *   <li>{@link Configurator.Parameter#getMinChosenValues <em>Min Chosen Values</em>}</li>
 *   <li>{@link Configurator.Parameter#getChildren <em>Children</em>}</li>
 *   <li>{@link Configurator.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Configurator.ConfiguratorPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
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
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link Configurator.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see Configurator.ConfiguratorPackage#getParameter_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getChildren();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see Configurator.ConfiguratorPackage#getParameter_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link Configurator.Parameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
