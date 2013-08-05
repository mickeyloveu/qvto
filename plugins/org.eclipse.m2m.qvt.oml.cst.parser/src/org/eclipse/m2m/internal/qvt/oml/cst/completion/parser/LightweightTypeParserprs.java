/**
* Essential OCL Grammar
* <copyright>
*
* Copyright (c) 2005, 2010 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Elimination of some shift-reduce conflicts
*   E.D.Willink - Remove unnecessary warning suppression
*   E.D.Willink - Bugs 184048, 225493, 243976, 259818, 282882, 287993, 288040, 292112, 295166
*   Borland - Bug 242880
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias):
*        - 242153: LPG v 2.0.17 adoption.
*        - 299396: Introducing new LPG templates
*        - 300534: Removing the use of deprecated macros.
* </copyright>
*
* $Id: EssentialOCL.gi,v 1.5 2010/02/11 15:40:41 sboyko Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2013 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias) - LPG v 2.0.17 adoption (297966)
*   Alex Paperno - bugs 314443, 274105, 274505
*
* </copyright>
*
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
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias) - LPG v 2.0.17 adoption (297966)
*   Alex Paperno - bugs 392429
*
* </copyright>
*
*/

package org.eclipse.m2m.internal.qvt.oml.cst.completion.parser;

public class LightweightTypeParserprs implements lpg.runtime.ParseTable, LightweightTypeParsersym {
    public final static int ERROR_SYMBOL = 163;
    public final int getErrorSymbol() { return ERROR_SYMBOL; }

    public final static int SCOPE_UBOUND = 4;
    public final int getScopeUbound() { return SCOPE_UBOUND; }

    public final static int SCOPE_SIZE = 5;
    public final int getScopeSize() { return SCOPE_SIZE; }

    public final static int MAX_NAME_LENGTH = 28;
    public final int getMaxNameLength() { return MAX_NAME_LENGTH; }

    public final static int NUM_STATES = 25;
    public final int getNumStates() { return NUM_STATES; }

    public final static int NT_OFFSET = 163;
    public final int getNtOffset() { return NT_OFFSET; }

    public final static int LA_STATE_OFFSET = 1489;
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }

    public final static int MAX_LA = 1;
    public final int getMaxLa() { return MAX_LA; }

    public final static int NUM_RULES = 692;
    public final int getNumRules() { return NUM_RULES; }

    public final static int NUM_NONTERMINALS = 287;
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }

    public final static int NUM_SYMBOLS = 450;
    public final int getNumSymbols() { return NUM_SYMBOLS; }

    public final static int SEGMENT_SIZE = 8192;
    public final int getSegmentSize() { return SEGMENT_SIZE; }

    public final static int START_STATE = 693;
    public final int getStartState() { return START_STATE; }

    public final static int IDENTIFIER_SYMBOL = 1;
    public final int getIdentifier_SYMBOL() { return IDENTIFIER_SYMBOL; }

    public final static int EOFT_SYMBOL = 28;
    public final int getEoftSymbol() { return EOFT_SYMBOL; }

    public final static int EOLT_SYMBOL = 28;
    public final int getEoltSymbol() { return EOLT_SYMBOL; }

    public final static int ACCEPT_ACTION = 796;
    public final int getAcceptAction() { return ACCEPT_ACTION; }

    public final static int ERROR_ACTION = 797;
    public final int getErrorAction() { return ERROR_ACTION; }

    public final static boolean BACKTRACK = true;
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int getStartSymbol() { return lhs(0); }
    public final boolean isValidForParser() { return LightweightTypeParsersym.isValidForParser; }


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
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,1,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,1,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,1,1,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            1,0,0,0,0,0,1,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,1,0,0,0,0,0,0,0,0,
            0,0,1,0,0,0,0,0,0,1,
            0,0,1,0,1,0,0,0,0,0,
            0,0,0,1,0,1,0,0,0,1,
            1,0,0,1,1,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,1,0,0,0,1,0,1,
            0,0,0,0,0,1,1,0,0,0,
            0,0,1,0,0,1,0,1,0,1,
            0,0,0,0,0,0,1,1,0,0,
            0,1,1,1,1,1,1,0,0,0,
            1,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,1,0,0,0,1,
            0,1,1,1,0,0,0,0,0,1,
            1,1,0,0,0,1,0,0,0,0,
            1,1,1,0,0,1,0,0,0,0,
            0,0,0,1,0,1,0,0,0,0
        };
    };
    public final static byte isNullable[] = IsNullable.isNullable;
    public final boolean isNullable(int index) { return isNullable[index] != 0; }

    public interface ProsthesesIndex {
        public final static char prosthesesIndex[] = {0,
            12,13,9,10,15,16,17,18,93,95,
            21,2,6,8,14,19,20,263,1,3,
            4,5,7,11,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,73,74,75,76,77,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,91,92,94,96,97,98,99,
            100,101,102,103,104,105,106,107,108,109,
            110,111,112,113,114,115,116,117,118,119,
            120,121,122,123,124,125,126,127,128,129,
            130,131,132,133,134,135,136,137,138,139,
            140,141,142,143,144,145,146,147,148,149,
            150,151,152,153,154,155,156,157,158,159,
            160,161,162,163,164,165,166,167,168,169,
            170,171,172,173,174,175,176,177,178,179,
            180,181,182,183,184,185,186,187,188,189,
            190,191,192,193,194,195,196,197,198,199,
            200,201,202,203,204,205,206,207,208,209,
            210,211,212,213,214,215,216,217,218,219,
            220,221,222,223,224,225,226,227,228,229,
            230,231,232,233,234,235,236,237,238,239,
            240,241,242,243,244,245,246,247,248,249,
            250,251,252,253,254,255,256,257,258,259,
            260,261,262,264,265,266,267,268,269,270,
            271,272,273,274,275,276,277,278,279,280,
            281,282,283,284,285,286,287
        };
    };
    public final static char prosthesesIndex[] = ProsthesesIndex.prosthesesIndex;
    public final int prosthesesIndex(int index) { return prosthesesIndex[index]; }

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,1,1,0,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,0,0,0,0,1,1,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static short baseCheck[] = {0,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,2,1,1,1,
            3,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,4,4,
            0,1,1,3,1,3,3,5,1,1,
            1,1,1,1,1,1,1,1,1,4,
            0,1,1,3,1,1,3,1,1,1,
            1,1,1,1,4,1,3,1,1,1,
            2,1,1,1,1,1,1,1,1,1,
            1,1,1,8,10,10,8,10,1,1,
            1,5,6,8,8,7,7,5,6,9,
            1,4,6,4,0,0,1,1,3,1,
            1,1,1,1,1,1,1,1,3,1,
            3,1,1,1,3,1,3,1,1,1,
            3,1,3,1,1,1,3,1,3,1,
            1,1,3,3,1,3,3,1,1,1,
            3,3,3,3,1,3,3,3,3,1,
            1,1,3,3,1,3,3,1,1,1,
            3,3,1,3,3,1,1,1,2,2,
            1,2,2,1,1,1,1,1,1,3,
            4,1,3,1,1,1,1,4,4,1,
            6,4,1,1,1,3,1,0,1,3,
            2,1,2,1,0,1,2,4,4,1,
            2,4,4,2,3,3,5,5,3,3,
            3,3,1,1,1,1,3,3,3,3,
            1,7,7,5,3,5,1,3,1,1,
            1,3,0,2,2,6,2,1,1,1,
            1,1,1,7,5,6,4,2,1,2,
            1,1,3,8,7,2,4,4,2,1,
            2,5,5,0,1,2,2,1,1,2,
            1,0,5,1,1,1,0,2,1,0,
            6,5,1,3,1,1,1,1,1,1,
            1,1,4,4,2,1,3,5,5,1,
            3,0,1,2,0,1,6,3,1,5,
            1,1,1,1,1,3,5,5,3,1,
            0,0,1,2,1,1,3,2,3,2,
            2,2,1,6,4,2,4,4,1,1,
            3,1,2,1,2,0,1,1,1,1,
            1,1,1,1,1,2,1,1,1,2,
            5,1,1,2,5,5,0,1,1,1,
            1,2,4,1,2,0,1,1,1,2,
            0,1,1,1,3,3,0,1,1,1,
            1,3,2,2,2,0,1,1,1,1,
            1,1,2,1,7,1,2,0,1,2,
            1,3,2,1,4,1,0,1,1,1,
            8,0,2,1,3,2,0,2,1,3,
            2,9,1,0,2,0,3,1,3,2,
            0,2,2,1,1,1,1,1,0,3,
            1,1,3,3,3,3,1,0,0,4,
            1,0,6,6,7,5,5,6,8,1,
            1,1,3,2,2,1,1,2,2,4,
            3,1,1,4,2,2,3,1,1,2,
            2,2,3,4,0,2,1,1,2,5,
            3,2,6,5,3,2,0,1,2,1,
            1,1,1,0,5,2,3,0,1,2,
            2,0,1,1,2,2,0,1,2,2,
            0,1,1,1,1,1,3,3,3,5,
            5,7,7,5,5,0,2,2,0,2,
            0,1,3,1,1,1,1,0,1,5,
            5,3,2,1,1,1,1,7,5,7,
            5,4,3,1,1,3,3,1,3,3,
            1,1,1,1,1,3,4,4,3,3,
            3,4,3,1,7,0,2,1,1,1,
            0,2,2,0,1,3,0,1,3,3,
            1,1,4,2,0,1,1,1,1,1,
            3,1,1,1,1,1,3,3,1,1,
            1,3,3,1,3,2,1,3,3,2,
            1,1,-1,1,2,3,4,5,6,7,
            8,9,10,-2,12,-3,-4,-5,-6,-7,
            18,-10,1,2,3,4,5,6,7,8,
            9,10,-11,1,2,3,4,5,6,7,
            8,9,10,-13,1,2,3,4,5,6,
            7,8,9,10,-22,1,2,3,4,5,
            6,7,8,9,10,-23,1,2,3,4,
            5,6,7,8,9,10,-14,1,2,3,
            4,-12,1,2,-24,1,2,-8,-9,13,
            14,15,11,-15,-16,11,-17,16,17,-18,
            -19,-20,-21,-25,0,0,0,0,0,0,
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
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0
        };
    };
    public final static short baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static short rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            12,20,20,20,20,20,20,20,20,20,
            20,20,20,20,20,20,21,22,22,22,
            22,22,22,22,22,22,22,22,13,23,
            14,14,14,24,1,1,2,2,15,15,
            5,5,4,4,4,4,4,4,4,4,
            3,3,3,3,3,6,6,6,6,7,
            8,16,16,17,17,25,11,26,28,29,
            29,30,30,31,31,31,31,32,32,32,
            33,36,36,37,37,38,38,39,35,35,
            35,35,35,35,35,34,47,47,40,41,
            42,42,43,43,44,45,46,48,48,48,
            49,49,51,51,52,52,52,53,53,50,
            50,50,55,55,55,55,55,55,55,55,
            55,57,56,56,62,60,61,61,59,59,
            27,27,64,63,58,58,67,67,65,65,
            66,66,69,69,68,68,70,70,72,72,
            71,71,73,73,75,75,74,74,76,76,
            78,78,77,77,77,79,79,79,81,81,
            80,80,80,80,80,82,82,82,82,82,
            84,84,83,83,83,85,85,85,87,87,
            86,86,86,88,88,88,90,90,89,89,
            89,91,91,91,54,54,92,92,92,92,
            92,93,95,95,32,32,32,6,9,96,
            6,10,97,99,32,32,100,98,98,101,
            101,101,27,103,104,104,105,106,106,106,
            27,108,108,108,108,107,107,109,109,109,
            109,109,109,110,110,110,27,111,111,111,
            111,112,114,114,114,52,52,59,59,117,
            117,118,118,119,119,119,116,116,92,120,
            120,121,122,123,94,94,94,94,94,92,
            124,126,126,126,53,53,124,125,125,125,
            129,129,131,131,130,130,133,133,27,134,
            136,137,137,135,134,139,140,140,141,142,
            142,138,143,92,53,145,145,145,145,146,
            146,147,147,144,144,144,148,148,148,149,
            150,150,151,151,152,153,153,53,53,92,
            154,155,92,92,127,127,115,115,115,156,
            157,157,158,158,159,105,160,160,160,113,
            113,132,132,102,131,131,131,133,133,161,
            163,164,166,164,165,162,162,163,163,163,
            163,163,163,163,163,163,163,163,168,168,
            178,179,169,169,182,183,180,187,187,188,
            188,186,190,184,195,184,193,193,196,189,
            189,194,194,197,197,198,199,200,200,202,
            202,201,201,201,192,181,181,204,204,204,
            204,204,204,204,204,170,208,170,207,207,
            209,206,206,206,210,210,210,205,205,211,
            171,212,214,214,216,216,216,215,215,217,
            217,217,218,218,224,224,219,219,225,225,
            225,220,220,220,226,226,226,226,226,221,
            221,227,227,227,227,227,227,222,222,223,
            223,228,228,172,172,172,172,172,172,172,
            173,173,173,233,233,234,236,236,230,230,
            231,232,174,174,239,237,237,238,175,175,
            242,242,240,241,177,243,243,176,176,244,
            245,245,246,248,248,248,251,251,252,253,
            254,254,254,249,249,256,256,247,257,257,
            260,260,258,258,261,261,261,259,259,262,
            262,263,263,128,264,264,264,128,265,265,
            266,266,266,266,267,267,268,268,268,269,
            269,270,270,271,272,272,272,272,273,273,
            274,274,274,274,275,275,275,275,276,276,
            276,276,276,276,277,277,55,55,92,55,
            55,92,92,1,1,278,278,93,93,77,
            79,155,164,180,163,279,185,185,280,280,
            280,281,281,235,203,203,191,283,283,282,
            282,282,282,284,284,250,250,285,285,285,
            18,18,286,286,286,286,286,229,229,229,
            287,287,287,287,255,255,255,167,167,167,
            167,213,12,1,40,710,709,55,778,779,
            57,58,227,230,49,704,5,57,61,62,
            50,692,1,40,710,709,55,778,785,57,
            58,227,230,1,40,710,709,55,778,787,
            57,58,227,230,1,40,710,709,55,778,
            793,57,58,227,230,1,40,710,709,55,
            778,794,57,58,227,230,1,40,710,709,
            55,778,66,57,58,227,230,24,38,710,
            30,31,46,791,710,53,791,710,56,63,
            32,39,41,63,66,68,64,69,790,792,
            70,71,76,78,81,797,0
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static char termCheck[] = {0,
            0,1,2,0,0,5,6,3,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,0,0,1,2,26,27,5,6,
            0,8,9,10,11,12,13,14,15,16,
            17,18,19,20,21,0,1,2,0,0,
            5,6,0,1,2,0,0,5,6,3,
            0,0,0,3,3,0,1,0,0,0,
            0,22,4,4,7,0,28,0,0,24,
            0,4,7,0,4,0,0,25,0,0,
            0,0,0,23,0,0,0,0,0,0,
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
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0
        };
    };
    public final static char termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            797,831,833,797,797,1431,1430,712,848,850,
            851,849,847,708,839,840,841,842,843,844,
            845,846,797,797,831,833,706,707,1431,1430,
            797,848,850,851,849,847,825,839,840,841,
            842,843,844,845,846,61,831,833,797,35,
            1431,1430,797,831,833,56,797,1431,1430,723,
            797,797,670,772,734,797,1468,797,797,797,
            797,834,1025,857,745,62,796,797,797,767,
            797,856,775,797,1028,797,797,784,797,797,
            797,797,797,756
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }

    public interface Asb {
        public final static byte asb[] = {0,
            1,39,22,22,22,22,24,26,38,1,
            1,32,1,3,20,41,30,30,43,29,
            30,1,1,17,30
        };
    };
    public final static byte asb[] = Asb.asb;
    public final int asb(int index) { return asb[index]; }

    public interface Asr {
        public final static char asr[] = {0,
            27,26,13,14,15,16,17,18,19,20,
            21,12,8,11,9,10,6,5,2,1,
            0,3,0,23,22,25,28,24,7,4,
            0,4,1,6,5,2,0,25,28,0,
            7,0,23,0
        };
    };
    public final static char asr[] = Asr.asr;
    public final int asr(int index) { return asr[index]; }

    public interface Nasb {
        public final static byte nasb[] = {0,
            1,9,9,9,9,9,9,9,9,1,
            1,4,1,8,9,9,9,9,9,9,
            9,1,1,7,9
        };
    };
    public final static byte nasb[] = Nasb.nasb;
    public final int nasb(int index) { return nasb[index]; }

    public interface Nasr {
        public final static char nasr[] = {0,
            2,3,0,17,2,0,11,2,0
        };
    };
    public final static char nasr[] = Nasr.nasr;
    public final int nasr(int index) { return nasr[index]; }

    public interface TerminalIndex {
        public final static char terminalIndex[] = {0,
            163,37,11,12,134,136,19,59,60,61,
            62,63,64,65,66,67,68,69,70,71,
            72,40,20,21,35,73,74,164,38,39,
            1,2,3,4,5,6,7,8,9,10,
            13,14,15,16,17,18,22,23,24,25,
            26,27,28,29,41,42,30,31,32,33,
            34,43,44,45,46,47,48,49,50,51,
            52,53,54,55,56,57,58,75,76,77,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,91,92,93,94,95,96,97,
            98,99,100,101,102,103,104,105,106,107,
            108,109,110,111,112,113,114,115,116,117,
            118,119,120,121,122,123,124,125,126,127,
            128,129,130,131,132,133,135,137,138,139,
            140,141,142,143,144,145,146,147,148,149,
            150,151,152,153,154,155,156,157,158,159,
            160,161,162
        };
    };
    public final static char terminalIndex[] = TerminalIndex.terminalIndex;
    public final int terminalIndex(int index) { return terminalIndex[index]; }

    public interface NonterminalIndex {
        public final static char nonterminalIndex[] = {0,
            167,168,166,0,170,171,0,0,0,0,
            173,165,0,0,169,0,172,0,0,0,
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
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0
        };
    };
    public final static char nonterminalIndex[] = NonterminalIndex.nonterminalIndex;
    public final int nonterminalIndex(int index) { return nonterminalIndex[index]; }

    public interface ScopePrefix {
        public final static byte scopePrefix[] = {
            1,17,21,25,9
        };
    };
    public final static byte scopePrefix[] = ScopePrefix.scopePrefix;
    public final int scopePrefix(int index) { return scopePrefix[index]; }

    public interface ScopeSuffix {
        public final static byte scopeSuffix[] = {
            7,7,7,7,13
        };
    };
    public final static byte scopeSuffix[] = ScopeSuffix.scopeSuffix;
    public final int scopeSuffix(int index) { return scopeSuffix[index]; }

    public interface ScopeLhs {
        public final static char scopeLhs[] = {
            10,9,8,7,10
        };
    };
    public final static char scopeLhs[] = ScopeLhs.scopeLhs;
    public final int scopeLhs(int index) { return scopeLhs[index]; }

    public interface ScopeLa {
        public final static char scopeLa[] = {
            4,4,4,4,7
        };
    };
    public final static char scopeLa[] = ScopeLa.scopeLa;
    public final int scopeLa(int index) { return scopeLa[index]; }

    public interface ScopeStateSet {
        public final static byte scopeStateSet[] = {
            1,1,1,1,1
        };
    };
    public final static byte scopeStateSet[] = ScopeStateSet.scopeStateSet;
    public final int scopeStateSet(int index) { return scopeStateSet[index]; }

    public interface ScopeRhs {
        public final static char scopeRhs[] = {0,
            169,7,169,3,26,0,4,0,169,3,
            26,0,7,169,4,0,169,3,27,0,
            179,3,13,0,169,3,166,0
        };
    };
    public final static char scopeRhs[] = ScopeRhs.scopeRhs;
    public final int scopeRhs(int index) { return scopeRhs[index]; }

    public interface ScopeState {
        public final static char scopeState[] = {0,
            756,745,734,723,712,693,0
        };
    };
    public final static char scopeState[] = ScopeState.scopeState;
    public final int scopeState(int index) { return scopeState[index]; }

    public interface InSymb {
        public final static char inSymb[] = {0,
            0,175,26,27,13,166,165,168,169,3,
            3,3,3,24,25,169,169,179,164,180,
            169,7,23,7,169
        };
    };
    public final static char inSymb[] = InSymb.inSymb;
    public final int inSymb(int index) { return inSymb[index]; }

    public interface Name {
        public final static String name[] = {
            "", //$NON-NLS-1$
            "+", //$NON-NLS-1$
            "-", //$NON-NLS-1$
            "*", //$NON-NLS-1$
            "/", //$NON-NLS-1$
            ">", //$NON-NLS-1$
            "<", //$NON-NLS-1$
            "=", //$NON-NLS-1$
            ">=", //$NON-NLS-1$
            "<=", //$NON-NLS-1$
            "<>", //$NON-NLS-1$
            "(", //$NON-NLS-1$
            ")", //$NON-NLS-1$
            "{", //$NON-NLS-1$
            "}", //$NON-NLS-1$
            "[", //$NON-NLS-1$
            "]", //$NON-NLS-1$
            "->", //$NON-NLS-1$
            "|", //$NON-NLS-1$
            ",", //$NON-NLS-1$
            ":", //$NON-NLS-1$
            "::", //$NON-NLS-1$
            ";", //$NON-NLS-1$
            ".", //$NON-NLS-1$
            "..", //$NON-NLS-1$
            ":=", //$NON-NLS-1$
            "+=", //$NON-NLS-1$
            "!", //$NON-NLS-1$
            "::=", //$NON-NLS-1$
            "?", //$NON-NLS-1$
            "<<", //$NON-NLS-1$
            ">>", //$NON-NLS-1$
            "...", //$NON-NLS-1$
            "~", //$NON-NLS-1$
            "!=", //$NON-NLS-1$
            "@", //$NON-NLS-1$
            "$empty", //$NON-NLS-1$
            "QUOTED_IDENTIFIER", //$NON-NLS-1$
            "INTEGER_LITERAL", //$NON-NLS-1$
            "REAL_LITERAL", //$NON-NLS-1$
            "STRING_LITERAL", //$NON-NLS-1$
            "SINGLE_LINE_COMMENT", //$NON-NLS-1$
            "MULTI_LINE_COMMENT", //$NON-NLS-1$
            "and", //$NON-NLS-1$
            "implies", //$NON-NLS-1$
            "not", //$NON-NLS-1$
            "or", //$NON-NLS-1$
            "xor", //$NON-NLS-1$
            "if", //$NON-NLS-1$
            "then", //$NON-NLS-1$
            "else", //$NON-NLS-1$
            "endif", //$NON-NLS-1$
            "let", //$NON-NLS-1$
            "in", //$NON-NLS-1$
            "false", //$NON-NLS-1$
            "true", //$NON-NLS-1$
            "null", //$NON-NLS-1$
            "invalid", //$NON-NLS-1$
            "self", //$NON-NLS-1$
            "Bag", //$NON-NLS-1$
            "Collection", //$NON-NLS-1$
            "OrderedSet", //$NON-NLS-1$
            "Sequence", //$NON-NLS-1$
            "Set", //$NON-NLS-1$
            "Tuple", //$NON-NLS-1$
            "Boolean", //$NON-NLS-1$
            "Integer", //$NON-NLS-1$
            "Real", //$NON-NLS-1$
            "String", //$NON-NLS-1$
            "UnlimitedNatural", //$NON-NLS-1$
            "OclAny", //$NON-NLS-1$
            "OclInvalid", //$NON-NLS-1$
            "OclVoid", //$NON-NLS-1$
            "Dict", //$NON-NLS-1$
            "List", //$NON-NLS-1$
            "break", //$NON-NLS-1$
            "switch", //$NON-NLS-1$
            "case", //$NON-NLS-1$
            "xselect", //$NON-NLS-1$
            "xcollect", //$NON-NLS-1$
            "selectOne", //$NON-NLS-1$
            "collectOne", //$NON-NLS-1$
            "collectselect", //$NON-NLS-1$
            "collectselectOne", //$NON-NLS-1$
            "return", //$NON-NLS-1$
            "forEach", //$NON-NLS-1$
            "forOne", //$NON-NLS-1$
            "var", //$NON-NLS-1$
            "while", //$NON-NLS-1$
            "continue", //$NON-NLS-1$
            "log", //$NON-NLS-1$
            "assert", //$NON-NLS-1$
            "with", //$NON-NLS-1$
            "compute", //$NON-NLS-1$
            "new", //$NON-NLS-1$
            "init", //$NON-NLS-1$
            "static", //$NON-NLS-1$
            "end", //$NON-NLS-1$
            "out", //$NON-NLS-1$
            "object", //$NON-NLS-1$
            "transformation", //$NON-NLS-1$
            "import", //$NON-NLS-1$
            "library", //$NON-NLS-1$
            "metamodel", //$NON-NLS-1$
            "mapping", //$NON-NLS-1$
            "query", //$NON-NLS-1$
            "helper", //$NON-NLS-1$
            "inout", //$NON-NLS-1$
            "when", //$NON-NLS-1$
            "configuration", //$NON-NLS-1$
            "intermediate", //$NON-NLS-1$
            "property", //$NON-NLS-1$
            "opposites", //$NON-NLS-1$
            "class", //$NON-NLS-1$
            "population", //$NON-NLS-1$
            "map", //$NON-NLS-1$
            "xmap", //$NON-NLS-1$
            "late", //$NON-NLS-1$
            "resolve", //$NON-NLS-1$
            "resolveone", //$NON-NLS-1$
            "resolveIn", //$NON-NLS-1$
            "resolveoneIn", //$NON-NLS-1$
            "invresolve", //$NON-NLS-1$
            "invresolveone", //$NON-NLS-1$
            "invresolveIn", //$NON-NLS-1$
            "invresolveoneIn", //$NON-NLS-1$
            "modeltype", //$NON-NLS-1$
            "uses", //$NON-NLS-1$
            "where", //$NON-NLS-1$
            "refines", //$NON-NLS-1$
            "access", //$NON-NLS-1$
            "extends", //$NON-NLS-1$
            "blackbox", //$NON-NLS-1$
            "abstract", //$NON-NLS-1$
            "result", //$NON-NLS-1$
            "main", //$NON-NLS-1$
            "this", //$NON-NLS-1$
            "rename", //$NON-NLS-1$
            "disjuncts", //$NON-NLS-1$
            "merges", //$NON-NLS-1$
            "inherits", //$NON-NLS-1$
            "composes", //$NON-NLS-1$
            "constructor", //$NON-NLS-1$
            "datatype", //$NON-NLS-1$
            "default", //$NON-NLS-1$
            "derived", //$NON-NLS-1$
            "do", //$NON-NLS-1$
            "elif", //$NON-NLS-1$
            "enum", //$NON-NLS-1$
            "except", //$NON-NLS-1$
            "exception", //$NON-NLS-1$
            "from", //$NON-NLS-1$
            "literal", //$NON-NLS-1$
            "ordered", //$NON-NLS-1$
            "primitive", //$NON-NLS-1$
            "raise", //$NON-NLS-1$
            "readonly", //$NON-NLS-1$
            "references", //$NON-NLS-1$
            "tag", //$NON-NLS-1$
            "try", //$NON-NLS-1$
            "typedef", //$NON-NLS-1$
            "unlimited", //$NON-NLS-1$
            "ERROR_TOKEN", //$NON-NLS-1$
            "IDENTIFIER", //$NON-NLS-1$
            "EOF_TOKEN", //$NON-NLS-1$
            "QvtLwGoal", //$NON-NLS-1$
            "CollectionTypeIdentifierCS", //$NON-NLS-1$
            "simpleNameCS", //$NON-NLS-1$
            "QuotedSimpleNameCS", //$NON-NLS-1$
            "unreservedSimpleNameCS", //$NON-NLS-1$
            "pathNameCS", //$NON-NLS-1$
            "typeCS", //$NON-NLS-1$
            "tupleTypePartsCS", //$NON-NLS-1$
            "typedUninitializedVariableCS" //$NON-NLS-1$
        };
    };
    public final static String name[] = Name.name;
    public final String name(int index) { return name[index]; }

    public final int originalState(int state) {
        return -baseCheck[state];
    }
    public final int asi(int state) {
        return asb[originalState(state)];
    }
    public final int nasi(int state) {
        return nasb[originalState(state)];
    }
    public final int inSymbol(int state) {
        return inSymb[originalState(state)];
    }

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
