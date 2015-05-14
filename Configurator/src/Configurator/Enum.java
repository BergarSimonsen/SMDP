/**
 */
package Configurator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Configurator.Enum#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see Configurator.ConfiguratorPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Type {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link Configurator.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see Configurator.ConfiguratorPackage#getEnum_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getValues();

} // Enum
