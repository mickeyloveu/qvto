/*
 * «codeGenHelper.getCopyright(' * ')»
 *************************************************************************
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 */

package org.eclipse.qvto.examples.xtext.qvtoperational.cs2as;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainPackage;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.ids.ClassId;
import org.eclipse.ocl.examples.domain.ids.CollectionTypeId;
import org.eclipse.ocl.examples.domain.ids.IdManager;
import org.eclipse.ocl.examples.domain.ids.NsURIPackageId;
import org.eclipse.ocl.examples.domain.ids.TypeId;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Root;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.basecs.BaseCSPackage;
import org.eclipse.ocl.examples.xtext.base.basecs.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.basecs.OperationCS;
import org.eclipse.ocl.examples.xtext.base.basecs.PackageCS;
import org.eclipse.ocl.examples.xtext.base.basecs.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.basecs.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;
import org.eclipse.qvto.examples.pivot.qvtoperational.MappingOperation;
import org.eclipse.qvto.examples.pivot.qvtoperational.OperationalTransformation;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalFactory;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.VarParameter;
import org.eclipse.qvto.examples.xtext.imperativeocl.cs2as.NewImperativeOCLCSContainmentVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ClassifierDefCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ClassifierProperty2CS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ClassifierPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.CompleteSignatureCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ConfigPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ConstructorCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ContextualPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ElementWithBody;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ExceptionCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ImperativeOperationCallExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.InitPartCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.LibraryImportCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.LocalPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingBodyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingCallExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingEndCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingExtensionCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingInitCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingMethodCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingModuleCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingQueryCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingRuleCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingSectionCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingSectionsCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MetamodelCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModelTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModuleKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModulePropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModuleRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModuleUsageCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MultiplicityDefCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ObjectExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.OperationParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.OperationSimpleSignatureCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.OppositePropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.PackageRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.PrimitiveTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToClassCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToImportCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToLibraryCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.RenameCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ResolveExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ResolveInExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ResolveOpArgsExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ScopedNameCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.SimpleSignatureCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.StereotypeQualifierCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TagCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TopLevelCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationRefineCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TypeSpecCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.UnitCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.util.QVTOperationalCSVisitor;

public class AutoQVTOperationalCSContainmentVisitor
	extends NewImperativeOCLCSContainmentVisitor
	implements QVTOperationalCSVisitor<Continuation<?>>
{
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_BaseCST = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/3.1.0/BaseCST", "basecs", BaseCSPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_Pivot = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/3.1.0/Pivot", "ocl", PivotPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/QVTOperational", "qvtoperational", QVTOperationalPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS", "qvtoperationalcs", QVTOperationalCSPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Class = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_Pivot.getClassId("Class", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ClassifierCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_BaseCST.getClassId("ClassifierCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ClassifierPropertyCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("ClassifierPropertyCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_MappingOperation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingOperation", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_MappingOperationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("MappingOperationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_MetamodelCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("MetamodelCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Operation = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_Pivot.getClassId("Operation", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_OperationCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_BaseCST.getClassId("OperationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_OperationParameterDeclarationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("OperationParameterDeclarationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_OperationalTransformation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("OperationalTransformation", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Package = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_Pivot.getClassId("Package", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_PackageCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_BaseCST.getClassId("PackageCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Parameter = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_Pivot.getClassId("Parameter", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ParameterCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_BaseCST.getClassId("ParameterCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Property = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_Pivot.getClassId("Property", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_QVToClassCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("QVToClassCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Root = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_Pivot.getClassId("Root", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_StructuralFeatureCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_BaseCST.getClassId("StructuralFeatureCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_TopLevelCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("TopLevelCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_TransformationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("TransformationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Type = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_3_1_0_s_Pivot.getClassId("Type", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_VarParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("VarParameter", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_composite = "composite";
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ClassifierCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ClassifierCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Operation = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Operation);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_OperationCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_OperationCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PackageCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_PackageCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Parameter);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ParameterCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ParameterCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Property = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Property);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_StructuralFeatureCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_StructuralFeatureCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Operation = TypeId.SEQUENCE.getSpecializedId(CLSSid_Operation);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Package = TypeId.SEQUENCE.getSpecializedId(CLSSid_Package);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Parameter = TypeId.SEQUENCE.getSpecializedId(CLSSid_Parameter);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Property = TypeId.SEQUENCE.getSpecializedId(CLSSid_Property);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Type = TypeId.SEQUENCE.getSpecializedId(CLSSid_Type);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Package = TypeId.SET.getSpecializedId(CLSSid_Package);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Type = TypeId.SET.getSpecializedId(CLSSid_Type);
    
    protected final /*@NonNull*/ CS2Pivot converter;
    protected final /*@NonNull*/ IdResolver idResolver;
    
    /**
     * Initializes me with an initial value for my result.
     * 
     * @param context my initial result value
     */
    public AutoQVTOperationalCSContainmentVisitor(/*@NonNull*/ CS2PivotConversion context) {
        super(context);
        this.converter = context.getConverter();
        this.idResolver = converter.getMetaModelManager().getIdResolver();
    }
    
    public /*@Nullable*/ Continuation<?> visitClassifierKind(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitClassifierKind is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitFeatureKey(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitFeatureKey is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitInitOp(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitInitOp is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMetamodelKind(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitMetamodelKind is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitTopLevelCS(/*@NonNull*/ TopLevelCS self) {
        //
        // Root
        //
        Root result;
        Element element = converter.getPivotElement(self);
        if ((element != null) && (element.getClass() == Root.class)) {
            result = (Root)element;
        }
        else {
            result = PivotFactory.eINSTANCE.createRoot();
            assert result != null;
            converter.installPivotDefinition(self, result);
        }
        //
        // Package::nestedPackage
        //
        final /*@Nullable*/ /*@Thrown*/ List<PackageCS> ownedNestedPackage = self.getOwnedNestedPackage();
        assert ownedNestedPackage != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedNestedPackage = idResolver.createOrderedSetOfAll(ORD_CLSSid_PackageCS, ownedNestedPackage);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Package);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedNestedPackage.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ PackageCS _1 = (PackageCS)ITERATOR__1.next();
            /**
             * ast()
             */
            if (_1 == null) {
                throw new InvalidValueException("Null source for \'null\'");
            }
            final /*@Nullable*/ /*@Thrown*/ DomainPackage ast = (DomainPackage)_1.getPivot();
            //
            accumulator.add(ast);
        }
        final List<? extends Package> UNBOXED_collect = collect.asEcoreObjects(idResolver, Package.class);
        assert UNBOXED_collect != null;
        context.refreshList(result.getNestedPackage(), UNBOXED_collect);
        // AS element comments update;
        context.refreshComments(result, self);
        return null;
    }
    
    public /*@Nullable*/ Continuation<?> visitQVToClassCS(/*@NonNull*/ QVToClassCS self) {
        //
        // Class
        //
        Class result;
        Element element = converter.getPivotElement(self);
        if ((element != null) && (element.getClass() == Class.class)) {
            result = (Class)element;
        }
        else {
            result = PivotFactory.eINSTANCE.createClass();
            assert result != null;
            converter.installPivotDefinition(self, result);
        }
        //
        // NamedElement::name
        //
        final /*@Nullable*/ /*@Thrown*/ String name = self.getName();
        if ((name != result.getName()) && (name == null || !name.equals(result.getName()))) {
            result.setName(name);
        }
        //
        // Type::ownedAttribute
        //
        final /*@Nullable*/ /*@Thrown*/ List<StructuralFeatureCS> ownedProperty = self.getOwnedProperty();
        assert ownedProperty != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedProperty = idResolver.createOrderedSetOfAll(ORD_CLSSid_StructuralFeatureCS, ownedProperty);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Property);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedProperty.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ StructuralFeatureCS _1 = (StructuralFeatureCS)ITERATOR__1.next();
            /**
             * ast()
             */
            if (_1 == null) {
                throw new InvalidValueException("Null source for \'null\'");
            }
            final /*@Nullable*/ /*@Thrown*/ DomainProperty ast = (DomainProperty)_1.getPivot();
            //
            accumulator.add(ast);
        }
        final List<? extends Property> UNBOXED_collect = collect.asEcoreObjects(idResolver, Property.class);
        assert UNBOXED_collect != null;
        context.refreshList(result.getOwnedAttribute(), UNBOXED_collect);
        //
        // Type::ownedOperation
        //
        final /*@Nullable*/ /*@Thrown*/ List<OperationCS> ownedOperation = self.getOwnedOperation();
        assert ownedOperation != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedOperation = idResolver.createOrderedSetOfAll(ORD_CLSSid_OperationCS, ownedOperation);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Operation);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = BOXED_ownedOperation.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect_0 = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ OperationCS _1_0 = (OperationCS)ITERATOR__1_0.next();
            /**
             * ast()
             */
            if (_1_0 == null) {
                throw new InvalidValueException("Null source for \'null\'");
            }
            final /*@Nullable*/ /*@Thrown*/ DomainOperation ast_0 = (DomainOperation)_1_0.getPivot();
            //
            accumulator_0.add(ast_0);
        }
        final List<? extends Operation> UNBOXED_collect_0 = collect_0.asEcoreObjects(idResolver, Operation.class);
        assert UNBOXED_collect_0 != null;
        context.refreshList(result.getOwnedOperation(), UNBOXED_collect_0);
        // AS element comments update;
        context.refreshComments(result, self);
        return null;
    }
    
    public /*@Nullable*/ Continuation<?> visitQVToImportCS(/*@NonNull*/ QVToImportCS self) {
        throw new UnsupportedOperationException("visitQVToImportCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitQVToLibraryCS(/*@NonNull*/ QVToLibraryCS self) {
        throw new UnsupportedOperationException("visitQVToLibraryCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitQVToOperationCS(/*@NonNull*/ QVToOperationCS self) {
        throw new UnsupportedOperationException("visitQVToOperationCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitOperationParameterDeclarationCS(/*@NonNull*/ OperationParameterDeclarationCS self) {
        //
        // VarParameter
        //
        VarParameter result;
        Element element = converter.getPivotElement(self);
        if ((element != null) && (element.getClass() == VarParameter.class)) {
            result = (VarParameter)element;
        }
        else {
            result = QVTOperationalFactory.eINSTANCE.createVarParameter();
            assert result != null;
            converter.installPivotDefinition(self, result);
        }
        //
        // NamedElement::name
        //
        final /*@Nullable*/ /*@Thrown*/ String name = self.getName();
        if ((name != result.getName()) && (name == null || !name.equals(result.getName()))) {
            result.setName(name);
        }
        // AS element comments update;
        context.refreshComments(result, self);
        return null;
    }
    
    public /*@Nullable*/ Continuation<?> visitOperationSimpleSignatureCS(/*@NonNull*/ OperationSimpleSignatureCS self) {
        throw new UnsupportedOperationException("visitOperationSimpleSignatureCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitInitPartCS(/*@NonNull*/ InitPartCS self) {
        throw new UnsupportedOperationException("visitInitPartCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMetamodelCS(/*@NonNull*/ MetamodelCS self) {
        final /*@Nullable*/ /*@Thrown*/ String name_1 = self.getName();
        //
        // Package
        //
        Package result;
        Element element = converter.getPivotElement(self);
        if ((element != null) && (element.getClass() == Package.class)) {
            result = (Package)element;
        }
        else {
            result = PivotFactory.eINSTANCE.createPackage();
            assert result != null;
            converter.installPivotDefinition(self, result);
        }
        //
        // NamedElement::name
        //
        if ((name_1 != result.getName()) && (name_1 == null || !name_1.equals(result.getName()))) {
            result.setName(name_1);
        }
        //
        // Package::nsPrefix
        //
        if ((name_1 != result.getNsPrefix()) && (name_1 == null || !name_1.equals(result.getNsPrefix()))) {
            result.setNsPrefix(name_1);
        }
        //
        // Package::nsURI
        //
        if ((name_1 != result.getNsURI()) && (name_1 == null || !name_1.equals(result.getNsURI()))) {
            result.setNsURI(name_1);
        }
        //
        // Package::ownedType
        //
        final /*@Nullable*/ /*@Thrown*/ List<ClassifierCS> ownedType = self.getOwnedType();
        assert ownedType != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedType = idResolver.createOrderedSetOfAll(ORD_CLSSid_ClassifierCS, ownedType);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Type);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedType.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ ClassifierCS _1 = (ClassifierCS)ITERATOR__1.next();
            /**
             * ast()
             */
            if (_1 == null) {
                throw new InvalidValueException("Null source for \'null\'");
            }
            final /*@Nullable*/ /*@Thrown*/ DomainType ast = (DomainType)_1.getPivot();
            //
            accumulator.add(ast);
        }
        final List<? extends Type> UNBOXED_collect = collect.asEcoreObjects(idResolver, Type.class);
        assert UNBOXED_collect != null;
        context.refreshList(result.getOwnedType(), UNBOXED_collect);
        // AS element comments update;
        context.refreshComments(result, self);
        return null;
    }
    
    public /*@Nullable*/ Continuation<?> visitPrimitiveTypeCS(/*@NonNull*/ PrimitiveTypeCS self) {
        throw new UnsupportedOperationException("visitPrimitiveTypeCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitClassifierPropertyCS(/*@NonNull*/ ClassifierPropertyCS self) {
        //
        // Property
        //
        Property result;
        Element element = converter.getPivotElement(self);
        if ((element != null) && (element.getClass() == Property.class)) {
            result = (Property)element;
        }
        else {
            result = PivotFactory.eINSTANCE.createProperty();
            assert result != null;
            converter.installPivotDefinition(self, result);
        }
        //
        // NamedElement::name
        //
        final /*@Nullable*/ /*@Thrown*/ String name = self.getName();
        if ((name != result.getName()) && (name == null || !name.equals(result.getName()))) {
            result.setName(name);
        }
        //
        // Property::isComposite
        //
        final /*@Nullable*/ /*@Thrown*/ List<String> qualifier = self.getQualifier();
        assert qualifier != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_qualifier = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, qualifier);
        /*@NonNull*/ /*@Thrown*/ Object accumulator = ValuesUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_qualifier.iterator();
        /*@Thrown*/ Boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValuesUtil.FALSE_VALUE) {
                    exists = (Boolean)accumulator;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ String x = (String)ITERATOR_x.next();
            /**
             * x = 'composite'
             */
            final /*@NonInvalid*/ boolean eq = STR_composite.equals(x);
            //
            if (eq == ValuesUtil.TRUE_VALUE) {					// Normal successful body evaluation result
                exists = ValuesUtil.TRUE_VALUE;
                break;														// Stop immediately 
            }
            else if (eq == ValuesUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
                ;															// Carry on
            }
            else {															// Impossible badly typed result
                accumulator = new InvalidValueException(EvaluatorMessages.NonBooleanBody, "exists");
            }
        }
        if ((exists != result.isComposite()) && (exists == null || !exists.equals(result.isComposite()))) {
            result.setIsComposite(exists);
        }
        // AS element comments update;
        context.refreshComments(result, self);
        return null;
    }
    
    public /*@Nullable*/ Continuation<?> visitStereotypeQualifierCS(/*@NonNull*/ StereotypeQualifierCS self) {
        throw new UnsupportedOperationException("visitStereotypeQualifierCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitTagCS(/*@NonNull*/ TagCS self) {
        throw new UnsupportedOperationException("visitTagCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitExceptionCS(/*@NonNull*/ ExceptionCS self) {
        throw new UnsupportedOperationException("visitExceptionCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitClassifierDefCS(/*@NonNull*/ ClassifierDefCS self) {
        throw new UnsupportedOperationException("visitClassifierDefCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitClassifierProperty2CS(/*@NonNull*/ ClassifierProperty2CS self) {
        throw new UnsupportedOperationException("visitClassifierProperty2CS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitCompleteSignatureCS(/*@NonNull*/ CompleteSignatureCS self) {
        throw new UnsupportedOperationException("visitCompleteSignatureCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitConfigPropertyCS(/*@NonNull*/ ConfigPropertyCS self) {
        throw new UnsupportedOperationException("visitConfigPropertyCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitConstructorCS(/*@NonNull*/ ConstructorCS self) {
        throw new UnsupportedOperationException("visitConstructorCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitContextualPropertyCS(/*@NonNull*/ ContextualPropertyCS self) {
        throw new UnsupportedOperationException("visitContextualPropertyCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitDirectionKindCS(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitDirectionKindCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitElementWithBody(/*@NonNull*/ ElementWithBody self) {
        throw new UnsupportedOperationException("visitElementWithBody is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitImperativeOperationCallExpCS(/*@NonNull*/ ImperativeOperationCallExpCS self) {
        throw new UnsupportedOperationException("visitImperativeOperationCallExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitImportKindEnum(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitImportKindEnum is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitLibraryImportCS(/*@NonNull*/ LibraryImportCS self) {
        throw new UnsupportedOperationException("visitLibraryImportCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitLocalPropertyCS(/*@NonNull*/ LocalPropertyCS self) {
        throw new UnsupportedOperationException("visitLocalPropertyCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingBodyCS(/*@NonNull*/ MappingBodyCS self) {
        throw new UnsupportedOperationException("visitMappingBodyCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingCallExpCS(/*@NonNull*/ MappingCallExpCS self) {
        throw new UnsupportedOperationException("visitMappingCallExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingOperationCS(/*@NonNull*/ MappingOperationCS self) {
        //
        // MappingOperation
        //
        MappingOperation result;
        Element element = converter.getPivotElement(self);
        if ((element != null) && (element.getClass() == MappingOperation.class)) {
            result = (MappingOperation)element;
        }
        else {
            result = QVTOperationalFactory.eINSTANCE.createMappingOperation();
            assert result != null;
            converter.installPivotDefinition(self, result);
        }
        //
        // NamedElement::name
        //
        final /*@Nullable*/ /*@Thrown*/ String name = self.getName();
        if ((name != result.getName()) && (name == null || !name.equals(result.getName()))) {
            result.setName(name);
        }
        //
        // Operation::ownedParameter
        //
        final /*@Nullable*/ /*@Thrown*/ List<ParameterCS> ownedParameter = self.getOwnedParameter();
        assert ownedParameter != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedParameter = idResolver.createOrderedSetOfAll(ORD_CLSSid_ParameterCS, ownedParameter);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Parameter);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedParameter.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ ParameterCS _1 = (ParameterCS)ITERATOR__1.next();
            /**
             * ast()
             */
            if (_1 == null) {
                throw new InvalidValueException("Null source for \'null\'");
            }
            final /*@Nullable*/ /*@Thrown*/ DomainTypedElement ast = (DomainTypedElement)_1.getPivot();
            //
            accumulator.add(ast);
        }
        final List<? extends Parameter> UNBOXED_collect = collect.asEcoreObjects(idResolver, Parameter.class);
        assert UNBOXED_collect != null;
        context.refreshList(result.getOwnedParameter(), UNBOXED_collect);
        // AS element comments update;
        context.refreshComments(result, self);
        return null;
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingEndCS(/*@NonNull*/ MappingEndCS self) {
        throw new UnsupportedOperationException("visitMappingEndCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingExtensionCS(/*@NonNull*/ MappingExtensionCS self) {
        throw new UnsupportedOperationException("visitMappingExtensionCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingExtensionKindCS(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitMappingExtensionKindCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingInitCS(/*@NonNull*/ MappingInitCS self) {
        throw new UnsupportedOperationException("visitMappingInitCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingMethodCS(/*@NonNull*/ MappingMethodCS self) {
        throw new UnsupportedOperationException("visitMappingMethodCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingModuleCS(/*@NonNull*/ MappingModuleCS self) {
        throw new UnsupportedOperationException("visitMappingModuleCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingQueryCS(/*@NonNull*/ MappingQueryCS self) {
        throw new UnsupportedOperationException("visitMappingQueryCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingRuleCS(/*@NonNull*/ MappingRuleCS self) {
        throw new UnsupportedOperationException("visitMappingRuleCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingSectionCS(/*@NonNull*/ MappingSectionCS self) {
        throw new UnsupportedOperationException("visitMappingSectionCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMappingSectionsCS(/*@NonNull*/ MappingSectionsCS self) {
        throw new UnsupportedOperationException("visitMappingSectionsCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitModuleKindCS(/*@NonNull*/ ModuleKindCS self) {
        throw new UnsupportedOperationException("visitModuleKindCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitModuleKindEnum(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitModuleKindEnum is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitModuleRefCS(/*@NonNull*/ ModuleRefCS self) {
        throw new UnsupportedOperationException("visitModuleRefCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitModelTypeCS(/*@NonNull*/ ModelTypeCS self) {
        throw new UnsupportedOperationException("visitModelTypeCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitModulePropertyCS(/*@NonNull*/ ModulePropertyCS self) {
        throw new UnsupportedOperationException("visitModulePropertyCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitModuleUsageCS(/*@NonNull*/ ModuleUsageCS self) {
        throw new UnsupportedOperationException("visitModuleUsageCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitMultiplicityDefCS(/*@NonNull*/ MultiplicityDefCS self) {
        throw new UnsupportedOperationException("visitMultiplicityDefCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitObjectExpCS(/*@NonNull*/ ObjectExpCS self) {
        throw new UnsupportedOperationException("visitObjectExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitOppositePropertyCS(/*@NonNull*/ OppositePropertyCS self) {
        throw new UnsupportedOperationException("visitOppositePropertyCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitQualifierKindCS(/*@NonNull*/ Enumerator self) {
        throw new UnsupportedOperationException("visitQualifierKindCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitParameterDeclarationCS(/*@NonNull*/ ParameterDeclarationCS self) {
        throw new UnsupportedOperationException("visitParameterDeclarationCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitRenameCS(/*@NonNull*/ RenameCS self) {
        throw new UnsupportedOperationException("visitRenameCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitResolveOpArgsExpCS(/*@NonNull*/ ResolveOpArgsExpCS self) {
        throw new UnsupportedOperationException("visitResolveOpArgsExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitPackageRefCS(/*@NonNull*/ PackageRefCS self) {
        throw new UnsupportedOperationException("visitPackageRefCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitScopedNameCS(/*@NonNull*/ ScopedNameCS self) {
        throw new UnsupportedOperationException("visitScopedNameCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitSimpleSignatureCS(/*@NonNull*/ SimpleSignatureCS self) {
        throw new UnsupportedOperationException("visitSimpleSignatureCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitTransformationCS(/*@NonNull*/ TransformationCS self) {
        final /*@Nullable*/ /*@Thrown*/ String name_1 = self.getName();
        //
        // OperationalTransformation
        //
        OperationalTransformation result;
        Element element = converter.getPivotElement(self);
        if ((element != null) && (element.getClass() == OperationalTransformation.class)) {
            result = (OperationalTransformation)element;
        }
        else {
            result = QVTOperationalFactory.eINSTANCE.createOperationalTransformation();
            assert result != null;
            converter.installPivotDefinition(self, result);
        }
        //
        // NamedElement::name
        //
        if ((name_1 != result.getName()) && (name_1 == null || !name_1.equals(result.getName()))) {
            result.setName(name_1);
        }
        //
        // Package::nsPrefix
        //
        if ((name_1 != result.getNsPrefix()) && (name_1 == null || !name_1.equals(result.getNsPrefix()))) {
            result.setNsPrefix(name_1);
        }
        //
        // Package::nsURI
        //
        if ((name_1 != result.getNsURI()) && (name_1 == null || !name_1.equals(result.getNsURI()))) {
            result.setNsURI(name_1);
        }
        //
        // Package::nestedPackage
        //
        final /*@Nullable*/ /*@Thrown*/ List<PackageCS> ownedNestedPackage = self.getOwnedNestedPackage();
        assert ownedNestedPackage != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedNestedPackage = idResolver.createOrderedSetOfAll(ORD_CLSSid_PackageCS, ownedNestedPackage);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Package);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedNestedPackage.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ PackageCS _1 = (PackageCS)ITERATOR__1.next();
            /**
             * ast()
             */
            if (_1 == null) {
                throw new InvalidValueException("Null source for \'null\'");
            }
            final /*@Nullable*/ /*@Thrown*/ DomainPackage ast = (DomainPackage)_1.getPivot();
            //
            accumulator.add(ast);
        }
        final List<? extends Package> UNBOXED_collect = collect.asEcoreObjects(idResolver, Package.class);
        assert UNBOXED_collect != null;
        context.refreshList(result.getNestedPackage(), UNBOXED_collect);
        //
        // Package::ownedType
        //
        final /*@Nullable*/ /*@Thrown*/ List<ClassifierCS> ownedType = self.getOwnedType();
        assert ownedType != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedType = idResolver.createOrderedSetOfAll(ORD_CLSSid_ClassifierCS, ownedType);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Type);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = BOXED_ownedType.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect_0 = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ ClassifierCS _1_0 = (ClassifierCS)ITERATOR__1_0.next();
            /**
             * ast()
             */
            if (_1_0 == null) {
                throw new InvalidValueException("Null source for \'null\'");
            }
            final /*@Nullable*/ /*@Thrown*/ DomainType ast_0 = (DomainType)_1_0.getPivot();
            //
            accumulator_0.add(ast_0);
        }
        final List<? extends Type> UNBOXED_collect_0 = collect_0.asEcoreObjects(idResolver, Type.class);
        assert UNBOXED_collect_0 != null;
        context.refreshList(result.getOwnedType(), UNBOXED_collect_0);
        //
        // Type::ownedOperation
        //
        final /*@Nullable*/ /*@Thrown*/ List<OperationCS> ownedOperation = self.getOwnedOperation();
        assert ownedOperation != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedOperation = idResolver.createOrderedSetOfAll(ORD_CLSSid_OperationCS, ownedOperation);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValuesUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Operation);
        /*@Nullable*/ Iterator<?> ITERATOR__1_1 = BOXED_ownedOperation.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_1;
        while (true) {
            if (!ITERATOR__1_1.hasNext()) {
                collect_1 = accumulator_1;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ OperationCS _1_1 = (OperationCS)ITERATOR__1_1.next();
            /**
             * ast()
             */
            if (_1_1 == null) {
                throw new InvalidValueException("Null source for \'null\'");
            }
            final /*@Nullable*/ /*@Thrown*/ DomainOperation ast_1 = (DomainOperation)_1_1.getPivot();
            //
            accumulator_1.add(ast_1);
        }
        final List<? extends Operation> UNBOXED_collect_1 = collect_1.asEcoreObjects(idResolver, Operation.class);
        assert UNBOXED_collect_1 != null;
        context.refreshList(result.getOwnedOperation(), UNBOXED_collect_1);
        // AS element comments update;
        context.refreshComments(result, self);
        return null;
    }
    
    public /*@Nullable*/ Continuation<?> visitTransformationRefineCS(/*@NonNull*/ TransformationRefineCS self) {
        throw new UnsupportedOperationException("visitTransformationRefineCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitTypeSpecCS(/*@NonNull*/ TypeSpecCS self) {
        throw new UnsupportedOperationException("visitTypeSpecCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitUnitCS(/*@NonNull*/ UnitCS self) {
        throw new UnsupportedOperationException("visitUnitCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitResolveExpCS(/*@NonNull*/ ResolveExpCS self) {
        throw new UnsupportedOperationException("visitResolveExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitResolveInExpCS(/*@NonNull*/ ResolveInExpCS self) {
        throw new UnsupportedOperationException("visitResolveInExpCS is not supported by " + getClass().getName());
    }
}
