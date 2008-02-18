/**
* <copyright>
*
* Copyright (c) 2007 Borland Software Corporation
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     Borland Software Corporation - initial API and implementation
*
* </copyright>
*
* $Id: LightweightParsersym.java,v 1.15 2008/02/18 15:33:47 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: LightweightParsersym.java,v 1.15 2008/02/18 15:33:47 aigdalov Exp $
*/

package org.eclipse.m2m.qvt.oml.editor.ui.completion.cst.parser;

public interface LightweightParsersym {
    public final static int
      TK_NUMERIC_OPERATION = 67,
      TK_STRING_LITERAL = 46,
      TK_INTEGER_LITERAL = 68,
      TK_REAL_LITERAL = 69,
      TK_PLUS = 51,
      TK_MINUS = 52,
      TK_MULTIPLY = 27,
      TK_DIVIDE = 28,
      TK_GREATER = 21,
      TK_LESS = 22,
      TK_EQUAL = 5,
      TK_GREATER_EQUAL = 23,
      TK_LESS_EQUAL = 24,
      TK_NOT_EQUAL = 25,
      TK_LPAREN = 1,
      TK_RPAREN = 4,
      TK_LBRACE = 86,
      TK_RBRACE = 85,
      TK_LBRACKET = 103,
      TK_RBRACKET = 117,
      TK_ARROW = 130,
      TK_BAR = 91,
      TK_COMMA = 87,
      TK_COLON = 88,
      TK_COLONCOLON = 89,
      TK_SEMICOLON = 84,
      TK_DOT = 104,
      TK_DOTDOT = 131,
      TK_ATPRE = 118,
      TK_CARET = 132,
      TK_CARETCARET = 133,
      TK_QUESTIONMARK = 119,
      TK_QUOTE_STRING_LITERAL = 134,
      TK_ADD_ASSIGN = 125,
      TK_RESET_ASSIGN = 95,
      TK_AT_SIGN = 138,
      TK_EXCLAMATION_MARK = 120,
      TK_NOT_EQUAL_EXEQ = 112,
      TK_self = 29,
      TK_inv = 150,
      TK_pre = 151,
      TK_post = 152,
      TK_endpackage = 153,
      TK_def = 154,
      TK_if = 70,
      TK_then = 135,
      TK_else = 126,
      TK_endif = 127,
      TK_and = 47,
      TK_or = 48,
      TK_xor = 49,
      TK_not = 54,
      TK_implies = 136,
      TK_let = 75,
      TK_in = 93,
      TK_true = 71,
      TK_false = 72,
      TK_body = 30,
      TK_derive = 31,
      TK_init = 26,
      TK_null = 53,
      TK_attr = 155,
      TK_oper = 156,
      TK_Set = 6,
      TK_Bag = 7,
      TK_Sequence = 8,
      TK_Collection = 9,
      TK_OrderedSet = 10,
      TK_iterate = 32,
      TK_forAll = 33,
      TK_exists = 34,
      TK_isUnique = 35,
      TK_any = 36,
      TK_one = 37,
      TK_collect = 38,
      TK_select = 39,
      TK_reject = 40,
      TK_collectNested = 41,
      TK_sortedBy = 42,
      TK_closure = 43,
      TK_oclIsKindOf = 55,
      TK_oclIsTypeOf = 56,
      TK_oclAsType = 57,
      TK_oclIsNew = 58,
      TK_oclIsUndefined = 59,
      TK_oclIsInvalid = 60,
      TK_oclIsInState = 61,
      TK_allInstances = 44,
      TK_String = 11,
      TK_Integer = 12,
      TK_UnlimitedNatural = 13,
      TK_Real = 14,
      TK_Boolean = 15,
      TK_Tuple = 20,
      TK_OclAny = 16,
      TK_OclVoid = 17,
      TK_Invalid = 18,
      TK_OclMessage = 19,
      TK_OclInvalid = 73,
      TK_end = 121,
      TK_while = 74,
      TK_out = 106,
      TK_object = 64,
      TK_transformation = 113,
      TK_import = 122,
      TK_library = 107,
      TK_metamodel = 108,
      TK_mapping = 96,
      TK_query = 97,
      TK_helper = 98,
      TK_inout = 109,
      TK_when = 137,
      TK_var = 99,
      TK_configuration = 105,
      TK_property = 100,
      TK_population = 139,
      TK_map = 62,
      TK_xmap = 63,
      TK_late = 65,
      TK_log = 94,
      TK_assert = 101,
      TK_with = 140,
      TK_resolve = 76,
      TK_resolveone = 77,
      TK_resolveIn = 78,
      TK_resolveoneIn = 79,
      TK_invresolve = 80,
      TK_invresolveone = 81,
      TK_invresolveIn = 82,
      TK_invresolveoneIn = 83,
      TK_modeltype = 110,
      TK_uses = 141,
      TK_where = 142,
      TK_refines = 128,
      TK_enforcing = 143,
      TK_access = 123,
      TK_extends = 124,
      TK_blackbox = 114,
      TK_abstract = 115,
      TK_static = 116,
      TK_result = 45,
      TK_main = 90,
      TK_this = 50,
      TK_switch = 66,
      TK_xselect = 144,
      TK_xcollect = 145,
      TK_selectOne = 146,
      TK_collectOne = 147,
      TK_collectselect = 148,
      TK_collectselectOne = 149,
      TK_return = 102,
      TK_rename = 111,
      TK_IDENTIFIER = 3,
      TK_ERROR_TOKEN = 2,
      TK_INTEGER_RANGE_START = 129,
      TK_EOF_TOKEN = 92;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "LPAREN",
                 "ERROR_TOKEN",
                 "IDENTIFIER",
                 "RPAREN",
                 "EQUAL",
                 "Set",
                 "Bag",
                 "Sequence",
                 "Collection",
                 "OrderedSet",
                 "String",
                 "Integer",
                 "UnlimitedNatural",
                 "Real",
                 "Boolean",
                 "OclAny",
                 "OclVoid",
                 "Invalid",
                 "OclMessage",
                 "Tuple",
                 "GREATER",
                 "LESS",
                 "GREATER_EQUAL",
                 "LESS_EQUAL",
                 "NOT_EQUAL",
                 "init",
                 "MULTIPLY",
                 "DIVIDE",
                 "self",
                 "body",
                 "derive",
                 "iterate",
                 "forAll",
                 "exists",
                 "isUnique",
                 "any",
                 "one",
                 "collect",
                 "select",
                 "reject",
                 "collectNested",
                 "sortedBy",
                 "closure",
                 "allInstances",
                 "result",
                 "STRING_LITERAL",
                 "and",
                 "or",
                 "xor",
                 "this",
                 "PLUS",
                 "MINUS",
                 "null",
                 "not",
                 "oclIsKindOf",
                 "oclIsTypeOf",
                 "oclAsType",
                 "oclIsNew",
                 "oclIsUndefined",
                 "oclIsInvalid",
                 "oclIsInState",
                 "map",
                 "xmap",
                 "object",
                 "late",
                 "switch",
                 "NUMERIC_OPERATION",
                 "INTEGER_LITERAL",
                 "REAL_LITERAL",
                 "if",
                 "true",
                 "false",
                 "OclInvalid",
                 "while",
                 "let",
                 "resolve",
                 "resolveone",
                 "resolveIn",
                 "resolveoneIn",
                 "invresolve",
                 "invresolveone",
                 "invresolveIn",
                 "invresolveoneIn",
                 "SEMICOLON",
                 "RBRACE",
                 "LBRACE",
                 "COMMA",
                 "COLON",
                 "COLONCOLON",
                 "main",
                 "BAR",
                 "EOF_TOKEN",
                 "in",
                 "log",
                 "RESET_ASSIGN",
                 "mapping",
                 "query",
                 "helper",
                 "var",
                 "property",
                 "assert",
                 "return",
                 "LBRACKET",
                 "DOT",
                 "configuration",
                 "out",
                 "library",
                 "metamodel",
                 "inout",
                 "modeltype",
                 "rename",
                 "NOT_EQUAL_EXEQ",
                 "transformation",
                 "blackbox",
                 "abstract",
                 "static",
                 "RBRACKET",
                 "ATPRE",
                 "QUESTIONMARK",
                 "EXCLAMATION_MARK",
                 "end",
                 "import",
                 "access",
                 "extends",
                 "ADD_ASSIGN",
                 "else",
                 "endif",
                 "refines",
                 "INTEGER_RANGE_START",
                 "ARROW",
                 "DOTDOT",
                 "CARET",
                 "CARETCARET",
                 "QUOTE_STRING_LITERAL",
                 "then",
                 "implies",
                 "when",
                 "AT_SIGN",
                 "population",
                 "with",
                 "uses",
                 "where",
                 "enforcing",
                 "xselect",
                 "xcollect",
                 "selectOne",
                 "collectOne",
                 "collectselect",
                 "collectselectOne",
                 "inv",
                 "pre",
                 "post",
                 "endpackage",
                 "def",
                 "attr",
                 "oper"
             };

    public final static boolean isValidForParser = true;
}
