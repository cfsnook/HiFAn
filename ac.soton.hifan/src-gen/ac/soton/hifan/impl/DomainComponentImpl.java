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
package ac.soton.hifan.impl;

import ac.soton.hifan.DomainComponent;
import ac.soton.hifan.Entity;
import ac.soton.hifan.Failure;
import ac.soton.hifan.HifanPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.hifan.impl.DomainComponentImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link ac.soton.hifan.impl.DomainComponentImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainComponentImpl extends ComponentImpl implements DomainComponent {
	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<Failure> failure;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HifanPackage.Literals.DOMAIN_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Failure> getFailure() {
		if (failure == null) {
			failure = new EObjectContainmentEList<Failure>(Failure.class, this, HifanPackage.DOMAIN_COMPONENT__FAILURE);
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, HifanPackage.DOMAIN_COMPONENT__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HifanPackage.DOMAIN_COMPONENT__FAILURE:
			return ((InternalEList<?>) getFailure()).basicRemove(otherEnd, msgs);
		case HifanPackage.DOMAIN_COMPONENT__ENTITIES:
			return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
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
		case HifanPackage.DOMAIN_COMPONENT__FAILURE:
			return getFailure();
		case HifanPackage.DOMAIN_COMPONENT__ENTITIES:
			return getEntities();
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
		case HifanPackage.DOMAIN_COMPONENT__FAILURE:
			getFailure().clear();
			getFailure().addAll((Collection<? extends Failure>) newValue);
			return;
		case HifanPackage.DOMAIN_COMPONENT__ENTITIES:
			getEntities().clear();
			getEntities().addAll((Collection<? extends Entity>) newValue);
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
		case HifanPackage.DOMAIN_COMPONENT__FAILURE:
			getFailure().clear();
			return;
		case HifanPackage.DOMAIN_COMPONENT__ENTITIES:
			getEntities().clear();
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
		case HifanPackage.DOMAIN_COMPONENT__FAILURE:
			return failure != null && !failure.isEmpty();
		case HifanPackage.DOMAIN_COMPONENT__ENTITIES:
			return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainComponentImpl
