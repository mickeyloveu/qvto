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
/**
 * 
 */
package org.eclipse.m2m.qvt.oml.common.parser;

public class TextNode extends Node {
    public TextNode(String text) {
        myText = text;
    }

    public String getText() { 
        return myText; 
    }

    @Override
	public String toString() {
        return getText();
    }

    final String myText;
}