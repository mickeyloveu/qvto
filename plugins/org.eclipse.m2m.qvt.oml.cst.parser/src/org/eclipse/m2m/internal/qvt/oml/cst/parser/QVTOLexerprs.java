/**
* Essential OCL Lexer
* <copyright>
*
* Copyright (c) 2005, 2009 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Lexer and Parser refactoring to support extensibility and flexible error handling
*   Borland - Bug 242880
*   E.D.Willink - Bug 292112
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias) - LPG v 2.0.17 adoption (242153)
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias) - Introducing new LPG templates (299396)
*
* </copyright>
*
* $Id: QVTOLexerprs.java,v 1.6 2010/01/24 13:58:43 sboyko Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006-2008 Borland Inc.
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
*/
/**
* <copyright>
*
* Copyright (c) 2006-2008 Borland Inc.
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
*/

package org.eclipse.m2m.internal.qvt.oml.cst.parser;

public class QVTOLexerprs implements lpg.runtime.ParseTable, QVTOLexersym {
    public final static int ERROR_SYMBOL = 0;
    public final int getErrorSymbol() { return ERROR_SYMBOL; }

    public final static int SCOPE_UBOUND = 0;
    public final int getScopeUbound() { return SCOPE_UBOUND; }

    public final static int SCOPE_SIZE = 0;
    public final int getScopeSize() { return SCOPE_SIZE; }

    public final static int MAX_NAME_LENGTH = 0;
    public final int getMaxNameLength() { return MAX_NAME_LENGTH; }

    public final static int NUM_STATES = 46;
    public final int getNumStates() { return NUM_STATES; }

    public final static int NT_OFFSET = 103;
    public final int getNtOffset() { return NT_OFFSET; }

    public final static int LA_STATE_OFFSET = 739;
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }

    public final static int MAX_LA = 2;
    public final int getMaxLa() { return MAX_LA; }

    public final static int NUM_RULES = 283;
    public final int getNumRules() { return NUM_RULES; }

    public final static int NUM_NONTERMINALS = 36;
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }

    public final static int NUM_SYMBOLS = 139;
    public final int getNumSymbols() { return NUM_SYMBOLS; }

    public final static int SEGMENT_SIZE = 8192;
    public final int getSegmentSize() { return SEGMENT_SIZE; }

    public final static int START_STATE = 284;
    public final int getStartState() { return START_STATE; }

    public final static int IDENTIFIER_SYMBOL = 0;
    public final int getIdentifier_SYMBOL() { return IDENTIFIER_SYMBOL; }

    public final static int EOFT_SYMBOL = 102;
    public final int getEoftSymbol() { return EOFT_SYMBOL; }

    public final static int EOLT_SYMBOL = 104;
    public final int getEoltSymbol() { return EOLT_SYMBOL; }

    public final static int ACCEPT_ACTION = 455;
    public final int getAcceptAction() { return ACCEPT_ACTION; }

    public final static int ERROR_ACTION = 456;
    public final int getErrorAction() { return ERROR_ACTION; }

    public final static boolean BACKTRACK = false;
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int getStartSymbol() { return lhs(0); }
    public final boolean isValidForParser() { return QVTOLexersym.isValidForParser; }


    public interface IsNullable {
        public final static byte isNullable[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,1,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,1,0,
            0,0,0,0,0,0,0,1,0
        };
    };
    public final static byte isNullable[] = IsNullable.isNullable;
    public final boolean isNullable(int index) { return isNullable[index] != 0; }

    public interface ProsthesesIndex {
        public final static byte prosthesesIndex[] = {0,
            18,21,22,23,26,31,13,20,28,33,
            4,35,6,7,15,16,19,25,27,32,
            2,3,5,8,9,10,11,12,14,17,
            24,29,30,34,36,1
        };
    };
    public final static byte prosthesesIndex[] = ProsthesesIndex.prosthesesIndex;
    public final int prosthesesIndex(int index) { return prosthesesIndex[index]; }

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            1,3,3,3,1,2,2,1,1,5,
            1,1,1,1,1,1,1,1,1,1,
            2,2,2,1,1,1,1,2,1,1,
            1,2,1,1,1,1,2,1,1,2,
            2,3,2,2,0,1,2,2,2,1,
            2,3,2,3,3,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,2,
            1,2,2,2,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,2,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,2,1,2,
            0,1,2,2,1,2,1,3,1,1,
            1,1,1,1,1,3,0,1,2,2,
            2,3,1
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            21,21,21,21,21,21,21,21,21,21,
            21,21,21,21,21,21,21,21,21,21,
            21,21,21,21,21,21,21,21,21,21,
            21,21,21,21,21,13,21,14,23,24,
            24,24,26,26,26,26,27,27,25,25,
            7,7,29,15,15,15,8,8,8,8,
            8,2,2,2,2,3,3,3,3,3,
            3,3,3,3,3,3,3,3,3,3,
            3,3,3,3,3,3,3,3,3,3,
            3,4,4,4,4,4,4,4,4,4,
            4,4,4,4,4,4,4,4,4,4,
            4,4,4,4,4,4,4,1,1,1,
            1,1,1,1,1,1,1,17,17,28,
            28,22,22,22,22,31,31,31,31,31,
            31,31,31,31,31,31,31,31,31,31,
            31,31,31,31,31,31,31,31,31,31,
            31,31,31,31,31,18,18,18,18,18,
            18,18,18,18,18,18,18,18,18,18,
            18,18,18,18,18,18,18,18,18,18,
            18,18,18,18,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,19,19,9,9,32,32,32,32,
            6,16,16,16,16,30,30,30,30,30,
            30,30,30,33,33,33,33,20,20,20,
            20,20,10,10,10,10,10,34,34,12,
            12,11,11,21,21,21,21,21,21,21,
            10,10,10,20,20,20,21,35,35,25,
            21,21,21,21,807,449,446,446,446,996,
            293,422,451,1046,51,296,293,34,36,909,
            133,132,132,132,800,304,299,310,8,417,
            1113,1109,385,425,307,452,452,452,452,452,
            452,388,1105,6,7,1103,407,453,453,453,
            453,453,453,452,452,453,453,435,374,1057,
            51,407,453,453,453,453,453,453,367,413,
            453,453,436,374,407,453,453,453,453,453,
            453,1069,51,453,453,441,374,507,258,258,
            258,258,258,258,607,260,260,260,260,260,
            260,1080,51,260,260,1102,258,258,1,44,
            44,44,44,130,1104,1112,44,707,230,230,
            230,230,230,1117,44,905,44,1106,102,42,
            42,42,42,1110,1124,408,42,203,49,49,
            49,49,981,51,42,890,42,1013,339,230,
            230,1024,361,1126,339,383,583,41,361,289,
            40,1108,289,1035,381,1127,906,49,49,1009,
            381,1128,1130,1107,456,456
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,22,23,24,25,26,27,28,29,
            30,31,32,33,34,35,36,37,38,39,
            40,41,42,43,44,45,46,47,48,49,
            50,51,52,53,54,55,56,57,58,59,
            60,61,62,63,64,65,66,67,68,69,
            70,71,72,73,74,75,76,77,78,79,
            80,81,82,83,84,85,86,87,88,89,
            90,91,92,93,94,95,96,97,98,99,
            100,0,1,2,3,4,5,6,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,24,25,26,27,28,
            29,30,31,32,33,34,35,36,37,38,
            39,40,41,42,43,44,45,46,47,48,
            49,50,51,52,53,54,55,56,57,58,
            59,60,61,62,63,64,65,66,67,68,
            69,70,71,72,73,74,75,76,77,78,
            79,80,81,82,83,84,85,86,87,88,
            89,90,91,92,93,94,95,96,97,98,
            99,100,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,73,74,75,76,77,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,91,92,0,0,95,96,97,
            98,99,100,0,0,103,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,0,77,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,93,
            94,95,96,97,98,99,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,76,101,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,93,
            94,95,96,97,98,99,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,0,77,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,93,
            94,95,96,97,98,99,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,76,101,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,93,
            94,95,96,97,98,99,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,0,76,77,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,0,
            0,95,96,97,98,99,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,76,77,78,79,80,81,82,0,
            84,85,86,87,88,89,90,91,92,93,
            94,102,13,14,0,0,100,101,0,1,
            2,3,4,5,6,7,8,9,10,0,
            0,13,14,0,0,17,18,19,20,21,
            22,23,24,25,26,27,28,29,30,31,
            32,33,34,35,36,37,38,39,40,41,
            42,43,44,45,46,47,48,49,50,51,
            52,53,54,55,56,57,58,59,60,61,
            62,63,64,65,66,67,68,73,74,0,
            0,1,2,3,4,5,6,7,8,9,
            10,83,12,13,14,0,1,2,3,4,
            5,6,7,8,9,10,0,102,0,0,
            0,16,0,1,2,3,4,5,6,7,
            8,9,10,0,1,2,3,4,5,6,
            7,8,9,10,0,1,2,3,4,5,
            6,7,8,9,10,0,1,2,3,4,
            5,6,7,8,9,10,0,1,2,3,
            4,5,6,7,8,9,10,72,0,1,
            2,3,4,5,6,7,8,9,10,0,
            1,2,3,4,5,6,7,8,9,10,
            0,1,2,3,4,5,6,7,8,9,
            10,0,0,0,0,0,0,0,0,0,
            102,0,0,11,11,11,0,15,15,11,
            15,16,11,0,12,0,0,0,12,0,
            0,0,0,0,11,0,0,12,12,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            69,0,0,71,70,0,75,0,0,0,
            0,0,0,77,77,76,0,0,0,0,
            0,0,0,0,93,94,0,0,0,0,
            0,100,0,0,0,76,0,101,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,102,
            0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            456,500,500,500,500,500,500,500,500,500,
            500,500,500,500,500,500,500,500,500,500,
            500,500,500,500,500,500,500,500,500,500,
            500,500,500,500,500,500,500,500,500,500,
            500,500,500,500,500,500,500,500,500,500,
            500,500,500,500,500,500,500,500,500,500,
            500,500,500,500,500,500,500,500,500,500,
            500,500,500,499,408,500,500,500,500,500,
            500,500,500,500,500,500,500,500,500,500,
            500,500,500,500,500,500,500,500,500,500,
            500,456,498,498,498,498,498,498,498,498,
            498,498,498,498,498,498,498,498,498,498,
            498,498,498,498,498,498,498,498,498,498,
            498,498,498,498,498,498,498,498,498,498,
            498,498,498,498,498,498,498,498,498,498,
            498,498,498,498,498,498,498,498,498,498,
            498,498,498,498,498,498,498,498,498,498,
            498,498,498,498,466,503,498,498,498,498,
            498,498,498,498,498,498,498,498,498,498,
            498,498,498,498,498,498,498,498,498,498,
            498,498,9,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,45,456,505,505,505,
            505,505,505,456,456,505,277,452,452,452,
            452,452,452,452,452,452,452,452,452,452,
            452,452,452,452,452,452,452,452,452,452,
            452,452,452,452,452,452,452,452,452,452,
            452,452,452,452,452,452,452,452,452,452,
            452,452,452,452,452,452,452,452,452,452,
            452,452,452,452,452,452,452,452,452,452,
            452,452,452,452,452,452,452,452,452,452,
            452,452,456,452,452,452,452,452,452,452,
            452,452,452,452,452,452,452,452,452,452,
            452,452,452,452,452,397,261,453,453,453,
            453,453,453,453,453,453,453,453,453,453,
            453,453,453,453,453,453,453,453,453,453,
            453,453,453,453,453,453,453,453,453,453,
            453,453,453,453,453,453,453,453,453,453,
            453,453,453,453,453,453,453,453,453,453,
            453,453,453,453,453,453,453,453,453,453,
            453,453,453,453,453,453,453,453,453,453,
            453,453,453,460,453,453,453,453,453,453,
            453,453,453,453,453,453,453,453,453,453,
            453,453,453,453,453,397,278,714,714,714,
            714,714,714,714,714,714,714,714,714,714,
            714,714,714,714,714,714,714,714,714,714,
            714,714,714,714,714,714,714,714,714,714,
            714,714,714,714,714,714,714,714,714,714,
            714,714,714,714,714,714,714,714,714,714,
            714,714,714,714,714,714,714,714,714,714,
            714,714,714,714,714,714,714,714,714,714,
            714,714,456,714,714,714,714,714,714,714,
            714,714,714,714,714,714,714,714,714,714,
            714,714,714,714,714,397,262,716,716,716,
            716,716,716,716,716,716,716,716,716,716,
            716,716,716,716,716,716,716,716,716,716,
            716,716,716,716,716,716,716,716,716,716,
            716,716,716,716,716,716,716,716,716,716,
            716,716,716,716,716,716,716,716,716,716,
            716,716,716,716,716,716,716,716,716,716,
            716,716,716,716,716,716,716,716,716,716,
            716,716,716,459,716,716,716,716,716,716,
            716,716,716,716,716,716,716,716,716,716,
            716,716,716,716,716,397,456,686,686,686,
            686,686,686,686,686,686,686,686,686,686,
            686,686,686,686,686,686,686,686,686,686,
            686,686,686,686,686,686,686,686,686,686,
            686,686,686,686,686,686,686,686,686,686,
            686,686,686,686,686,686,686,686,686,686,
            686,686,686,686,686,686,686,686,686,686,
            686,686,686,686,686,686,686,686,686,686,
            686,456,686,686,686,686,686,686,686,686,
            686,686,686,686,686,686,686,686,686,456,
            456,686,686,686,686,686,456,449,449,449,
            449,449,449,449,449,449,449,476,403,446,
            446,394,407,446,446,446,446,446,446,446,
            446,446,446,446,446,446,446,446,446,446,
            446,446,446,446,446,446,446,446,446,446,
            446,446,446,446,446,446,446,446,446,446,
            446,446,446,446,446,446,446,446,446,446,
            446,446,446,446,446,451,322,325,395,405,
            470,451,314,354,485,311,723,326,739,8,
            489,482,483,480,481,725,486,472,473,451,
            451,455,289,289,15,131,451,341,1,589,
            589,589,589,589,589,589,589,589,589,456,
            456,588,588,456,456,588,588,588,588,588,
            588,588,588,588,588,588,588,588,588,588,
            588,588,588,588,588,588,588,588,588,588,
            588,588,588,588,588,588,588,588,588,588,
            588,588,588,588,588,588,588,588,588,588,
            588,588,588,588,588,588,588,735,295,456,
            38,507,507,507,507,507,507,507,507,507,
            507,590,1830,289,289,456,293,293,293,293,
            293,293,293,293,293,293,456,1,50,456,
            456,443,456,339,339,339,339,339,339,339,
            339,339,339,456,361,361,361,361,361,361,
            361,361,361,361,456,381,381,381,381,381,
            381,381,381,381,381,53,507,507,507,507,
            507,507,507,507,507,507,52,507,507,507,
            507,507,507,507,507,507,507,431,55,507,
            507,507,507,507,507,507,507,507,507,54,
            507,507,507,507,507,507,507,507,507,507,
            38,427,427,427,427,427,427,427,427,427,
            427,11,19,18,31,13,259,456,265,456,
            38,12,5,478,477,719,35,479,737,722,
            484,504,720,32,433,35,37,129,445,257,
            456,456,456,456,724,456,456,493,738,456,
            456,456,456,456,456,456,456,456,456,456,
            456,456,456,456,456,456,456,456,456,456,
            456,456,456,456,456,456,456,456,456,456,
            586,456,456,736,414,456,586,456,456,456,
            456,456,456,262,458,732,456,456,456,456,
            456,456,456,456,586,586,456,456,456,456,
            456,586,456,456,456,278,456,262,456,456,
            456,456,456,456,456,456,456,456,456,456,
            456,456,456,456,456,456,456,456,456,11
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }
    public final int asb(int index) { return 0; }
    public final int asr(int index) { return 0; }
    public final int nasb(int index) { return 0; }
    public final int nasr(int index) { return 0; }
    public final int terminalIndex(int index) { return 0; }
    public final int nonterminalIndex(int index) { return 0; }
    public final int scopePrefix(int index) { return 0;}
    public final int scopeSuffix(int index) { return 0;}
    public final int scopeLhs(int index) { return 0;}
    public final int scopeLa(int index) { return 0;}
    public final int scopeStateSet(int index) { return 0;}
    public final int scopeRhs(int index) { return 0;}
    public final int scopeState(int index) { return 0;}
    public final int inSymb(int index) { return 0;}
    public final String name(int index) { return null; }
    public final int originalState(int state) { return 0; }
    public final int asi(int state) { return 0; }
    public final int nasi(int state) { return 0; }
    public final int inSymbol(int state) { return 0; }

    /**
     * assert(! goto_default);
     */
    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    /**
     * assert(! shift_default);
     */
    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}
