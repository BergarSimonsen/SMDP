/**
 */
package Configurator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Configurator.Constraint#getIf <em>If</em>}</li>
 *   <li>{@link Configurator.Constraint#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see Configurator.ConfiguratorPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(BinaryExpression)
	 * @see Configurator.ConfiguratorPackage#getConstraint_If()
	 * @model containment="true"
	 * @generated
	 */
	BinaryExpression getIf();

	/**
	 * Sets the value of the '{@link Configurator.Constraint#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(BinaryExpression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(BinaryExpression)
	 * @see Configurator.ConfiguratorPackage#getConstraint_Then()
	 * @model containment="true"
	 * @generated
	 */
	BinaryExpression getThen();

	/**
	 * Sets the value of the '{@link Configurator.Constraint#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(BinaryExpression value);
} // Constraint
