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
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.hifan.Action#getCondition <em>Condition</em>}</li>
 *   <li>{@link ac.soton.hifan.Action#getTarget <em>Target</em>}</li>
 *   <li>{@link ac.soton.hifan.Action#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see ac.soton.hifan.HifanPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends LabeledElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.hifan.Condition}.
	 * It is bidirectional and its opposite is '{@link ac.soton.hifan.Condition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see ac.soton.hifan.HifanPackage#getAction_Condition()
	 * @see ac.soton.hifan.Condition#getAction
	 * @model opposite="action"
	 * @generated
	 */
	EList<Condition> getCondition();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Component)
	 * @see ac.soton.hifan.HifanPackage#getAction_Target()
	 * @model required="true"
	 * @generated
	 */
	Component getTarget();

	/**
	 * Sets the value of the '{@link ac.soton.hifan.Action#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Component value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.hifan.Error}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see ac.soton.hifan.HifanPackage#getAction_Error()
	 * @model containment="true"
	 * @generated
	 */
	EList<ac.soton.hifan.Error> getError();

} // Action
