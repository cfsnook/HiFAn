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
 * A representation of the model object '<em><b>Domain Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.hifan.DomainComponent#getFailure <em>Failure</em>}</li>
 *   <li>{@link ac.soton.hifan.DomainComponent#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see ac.soton.hifan.HifanPackage#getDomainComponent()
 * @model
 * @generated
 */
public interface DomainComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.hifan.Failure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference list.
	 * @see ac.soton.hifan.HifanPackage#getDomainComponent_Failure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Failure> getFailure();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.hifan.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see ac.soton.hifan.HifanPackage#getDomainComponent_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

} // DomainComponent
