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
package org.eclipse.m2m.qvt.oml.common.launch;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.m2m.qvt.oml.common.launch.BaseProcess.IRunnable;


public class SafeRunner {
    public static interface IRunner {
        public void run(BaseProcess.IRunnable r) throws Exception;
    }
    
    public static BaseProcess.IRunnable getSafeRunnable(EClass[] classes, final BaseProcess.IRunnable r) {
        final IRunner runner = getSafeRunner(classes);
        return new BaseProcess.IRunnable() {
            public void run() throws Exception {
                runner.run(r);
            }
        };
    }

    public static IRunner getSafeRunner(EClass[] classes) {
        return SameThreadRunner.INSTANCE;
    }
    
    static class SameThreadRunner implements IRunner {
        public void run(IRunnable r) throws Exception {
            r.run();
        }
        
        static IRunner INSTANCE = new SameThreadRunner();
    }
}