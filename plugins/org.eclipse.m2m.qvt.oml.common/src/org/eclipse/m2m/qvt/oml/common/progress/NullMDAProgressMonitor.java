/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.qvt.oml.common.progress;

/**
 * @author strizhkin
 */
public class NullMDAProgressMonitor implements IMDAProgressMonitor{
    
    public void beginTask(String name, int totalWork) {
    }
    
    public void done() {
    }
    
    public void subTask(String subtaskName) {
    }
    
    public void worked(int steps) {
    }
}
