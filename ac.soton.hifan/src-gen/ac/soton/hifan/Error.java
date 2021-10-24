/**
 * Copyright (c) 2021, 2021 University of Southampton.
 *  
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *  University of Southampton - initial API and implementation
 * 
 */
package ac.soton.hifan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.hifan.Error#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.hifan.Error#getFailure <em>Failure</em>}</li>
 *   <li>{@link ac.soton.hifan.Error#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @see ac.soton.hifan.HifanPackage#getError()
 * @model
 * @generated
 */
public interface Error extends LabeledElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ac.soton.hifan.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ac.soton.hifan.ErrorType
	 * @see #setType(ErrorType)
	 * @see ac.soton.hifan.HifanPackage#getError_Type()
	 * @model
	 * @generated
	 */
	ErrorType getType();

	/**
	 * Sets the value of the '{@link ac.soton.hifan.Error#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ac.soton.hifan.ErrorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ErrorType value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' reference.
	 * @see #setFailure(Failure)
	 * @see ac.soton.hifan.HifanPackage#getError_Failure()
	 * @model
	 * @generated
	 */
	Failure getFailure();

	/**
	 * Sets the value of the '{@link ac.soton.hifan.Error#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Failure value);

	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.hifan.Mitigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigation</em>' containment reference list.
	 * @see ac.soton.hifan.HifanPackage#getError_Mitigation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mitigation> getMitigation();

} // Error
