/**
* <copyright>
*
* Copyright (c) 2005, 2007 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Lexer and Parser refactoring to support extensibility and flexible error handling
*
* </copyright>
*
* $Id: QvtOpLexersym.java,v 1.76 2009/05/12 22:30:58 aigdalov Exp $
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
* $Id: QvtOpLexersym.java,v 1.76 2009/05/12 22:30:58 aigdalov Exp $
*/

package org.eclipse.m2m.internal.qvt.oml.cst.parser;

public interface QvtOpLexersym {
    public final static int
      Char_CtlCharNotWS = 103,
      Char_LF = 93,
      Char_CR = 94,
      Char_HT = 77,
      Char_FF = 100,
      Char_a = 18,
      Char_b = 19,
      Char_c = 20,
      Char_d = 21,
      Char_e = 12,
      Char_f = 22,
      Char_g = 23,
      Char_h = 24,
      Char_i = 25,
      Char_j = 26,
      Char_k = 27,
      Char_l = 28,
      Char_m = 29,
      Char_n = 30,
      Char_o = 31,
      Char_p = 14,
      Char_q = 32,
      Char_r = 15,
      Char_s = 33,
      Char_t = 34,
      Char_u = 35,
      Char_v = 36,
      Char_w = 37,
      Char_x = 38,
      Char_y = 39,
      Char_z = 40,
      Char__ = 41,
      Char_A = 42,
      Char_B = 43,
      Char_C = 44,
      Char_D = 45,
      Char_E = 13,
      Char_F = 46,
      Char_G = 47,
      Char_H = 48,
      Char_I = 49,
      Char_J = 50,
      Char_K = 51,
      Char_L = 52,
      Char_M = 53,
      Char_N = 54,
      Char_O = 55,
      Char_P = 56,
      Char_Q = 57,
      Char_R = 58,
      Char_S = 59,
      Char_T = 60,
      Char_U = 61,
      Char_V = 62,
      Char_W = 63,
      Char_X = 64,
      Char_Y = 65,
      Char_Z = 66,
      Char_0 = 1,
      Char_1 = 2,
      Char_2 = 3,
      Char_3 = 4,
      Char_4 = 5,
      Char_5 = 6,
      Char_6 = 7,
      Char_7 = 8,
      Char_8 = 9,
      Char_9 = 10,
      Char_AfterASCIINotAcute = 67,
      Char_Space = 73,
      Char_DoubleQuote = 78,
      Char_SingleQuote = 99,
      Char_Percent = 95,
      Char_VerticalBar = 79,
      Char_Exclamation = 80,
      Char_AtSign = 81,
      Char_BackQuote = 82,
      Char_Acute = 101,
      Char_Tilde = 83,
      Char_Sharp = 96,
      Char_DollarSign = 74,
      Char_Ampersand = 97,
      Char_Caret = 75,
      Char_Colon = 76,
      Char_SemiColon = 84,
      Char_BackSlash = 98,
      Char_LeftBrace = 85,
      Char_RightBrace = 86,
      Char_LeftBracket = 87,
      Char_RightBracket = 88,
      Char_QuestionMark = 89,
      Char_Comma = 90,
      Char_Dot = 16,
      Char_LessThan = 69,
      Char_GreaterThan = 17,
      Char_Plus = 70,
      Char_Minus = 68,
      Char_Slash = 71,
      Char_Star = 72,
      Char_LeftParen = 91,
      Char_RightParen = 92,
      Char_Equal = 11,
      Char_EOF = 102;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "0",
                 "1",
                 "2",
                 "3",
                 "4",
                 "5",
                 "6",
                 "7",
                 "8",
                 "9",
                 "Equal",
                 "e",
                 "E",
                 "p",
                 "r",
                 "Dot",
                 "GreaterThan",
                 "a",
                 "b",
                 "c",
                 "d",
                 "f",
                 "g",
                 "h",
                 "i",
                 "j",
                 "k",
                 "l",
                 "m",
                 "n",
                 "o",
                 "q",
                 "s",
                 "t",
                 "u",
                 "v",
                 "w",
                 "x",
                 "y",
                 "z",
                 "_",
                 "A",
                 "B",
                 "C",
                 "D",
                 "F",
                 "G",
                 "H",
                 "I",
                 "J",
                 "K",
                 "L",
                 "M",
                 "N",
                 "O",
                 "P",
                 "Q",
                 "R",
                 "S",
                 "T",
                 "U",
                 "V",
                 "W",
                 "X",
                 "Y",
                 "Z",
                 "AfterASCIINotAcute",
                 "Minus",
                 "LessThan",
                 "Plus",
                 "Slash",
                 "Star",
                 "Space",
                 "DollarSign",
                 "Caret",
                 "Colon",
                 "HT",
                 "DoubleQuote",
                 "VerticalBar",
                 "Exclamation",
                 "AtSign",
                 "BackQuote",
                 "Tilde",
                 "SemiColon",
                 "LeftBrace",
                 "RightBrace",
                 "LeftBracket",
                 "RightBracket",
                 "QuestionMark",
                 "Comma",
                 "LeftParen",
                 "RightParen",
                 "LF",
                 "CR",
                 "Percent",
                 "Sharp",
                 "Ampersand",
                 "BackSlash",
                 "SingleQuote",
                 "FF",
                 "Acute",
                 "EOF",
                 "CtlCharNotWS"
             };

    public final static boolean isValidForParser = true;
}
