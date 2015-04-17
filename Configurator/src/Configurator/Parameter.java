/**
 */
package Configurator;


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
 *   <li>{@link Configurator.Parameter#getLiteralValue <em>Literal Value</em>}</li>
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
	 * Returns the value of the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' containment reference.
	 * @see #setLiteralValue(Literal)
	 * @see Configurator.ConfiguratorPackage#getParameter_LiteralValue()
	 * @model containment="true"
	 * @generated
	 */
	Literal getLiteralValue();

	/**
	 * Sets the value of the '{@link Configurator.Parameter#getLiteralValue <em>Literal Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Value</em>' containment reference.
	 * @see #getLiteralValue()
	 * @generated
	 */
	void setLiteralValue(Literal value);

	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value</em>' reference.
	 * @see #setEnumValue(Configurator.Enum)
	 * @see Configurator.ConfiguratorPackage#getParameter_EnumValue()
	 * @model
	 * @generated
	 */
	Configurator.Enum getEnumValue();

	/**
	 * Sets the value of the '{@link Configurator.Parameter#getEnumValue <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value</em>' reference.
	 * @see #getEnumValue()
	 * @generated
	 */
	void setEnumValue(Configurator.Enum value);

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
