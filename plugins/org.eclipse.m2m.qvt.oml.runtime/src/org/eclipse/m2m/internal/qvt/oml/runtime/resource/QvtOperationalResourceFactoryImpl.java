/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2m.internal.qvt.oml.runtime.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author sboyko
 *
 */
public class QvtOperationalResourceFactoryImpl implements Resource.Factory {
	
	public Resource createResource(URI uri) {
		Resource resource = new QvtOperationalResourceImpl(uri);
        return resource;
	}

}
