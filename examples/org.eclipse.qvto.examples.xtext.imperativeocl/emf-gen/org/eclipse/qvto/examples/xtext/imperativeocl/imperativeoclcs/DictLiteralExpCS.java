/**
 */
package org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Dict Literal Exp CS</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DictLiteralExpCS#getOwnedParts <em>Owned Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ImperativeOCLCSPackage#getDictLiteralExpCS()
 * @model
 * @generated
 */
public interface DictLiteralExpCS
		extends ExpCS {

	/**
	 * Returns the value of the '<em><b>Owned Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DictLiteralPartCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parts</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parts</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ImperativeOCLCSPackage#getDictLiteralExpCS_OwnedParts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DictLiteralPartCS> getOwnedParts();

} // DictLiteralExpCS
