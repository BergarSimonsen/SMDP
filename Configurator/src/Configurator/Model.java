/**
 */
package Configurator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Configurator.Model#getConfiguratorModels <em>Configurator Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see Configurator.ConfiguratorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Configurator Models</b></em>' containment reference list.
	 * The list contents are of type {@link Configurator.ConfiguratorModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurator Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurator Models</em>' containment reference list.
	 * @see Configurator.ConfiguratorPackage#getModel_ConfiguratorModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConfiguratorModel> getConfiguratorModels();

} // Model
