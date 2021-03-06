package org.eclipse.qvto.examples.xtext.qvtoperational.cs2as;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TypeSpecCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.util.AbstractQVTOperationalCSPostOrderVisitor;

public class QVTOperationalCSPostOrderVisitor
		extends AbstractQVTOperationalCSPostOrderVisitor {

	protected QVTOperationalCSPostOrderVisitor(CS2PivotConversion context) {
		super(context);
	}

	@Override
	public @Nullable
	Continuation<?> visitTypeSpecCS(@NonNull
	TypeSpecCS csElement) {
		// FIXME this is to temporarily avoid thrown exception
		return null;
	}
}