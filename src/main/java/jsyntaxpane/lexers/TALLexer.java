/* The following code was generated by JFlex 1.4.3 on 14-3-27 ����10:25 */

/*
 * Copyright 2008 Ayman Al-Sairafi ayman.alsairafi@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License
 *       at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsyntaxpane.lexers;


import jsyntaxpane.Token;
import jsyntaxpane.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 14-3-27 ����10:25 from the specification file
 * <tt>F:/Workspace/r095/jsyntaxpane/src/main/jflex/jsyntaxpane/lexers/tal.flex</tt>
 */
public final class TALLexer extends DefaultJFlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\4\1\33"+
    "\2\0\1\15\1\0\1\34\1\46\1\47\1\51\1\51\1\51\1\5"+
    "\1\51\1\51\1\10\1\17\1\41\1\16\4\20\2\11\1\55\1\51"+
    "\1\54\1\52\1\53\1\44\1\0\1\31\1\14\1\23\1\21\1\22"+
    "\1\32\1\27\1\40\1\24\2\6\1\13\1\6\1\25\1\42\1\45"+
    "\1\6\1\30\1\36\1\26\1\37\1\6\1\43\1\12\1\50\1\6"+
    "\1\51\1\35\1\51\1\7\1\6\1\0\1\31\1\14\1\23\1\21"+
    "\1\22\1\32\1\27\1\40\1\24\2\6\1\13\1\6\1\25\1\42"+
    "\1\45\1\6\1\30\1\36\1\26\1\37\1\6\1\43\1\12\1\50"+
    "\1\6\1\51\1\0\1\51\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\3\1\2\2\1\3\2\4\2\3\1\1\4\3"+
    "\2\1\2\3\5\2\1\0\3\5\4\0\3\3\2\4"+
    "\1\3\1\6\5\3\4\0\3\3\2\0\3\4\1\0"+
    "\3\3\1\4\1\3\1\7\4\3\1\10\1\0\3\3"+
    "\2\0\1\4\1\0\2\3\1\7\1\4\1\3\1\0"+
    "\10\3\2\0\1\4\1\0\1\3\1\4\1\3\1\0"+
    "\5\3\1\0\1\6\1\4\1\0\1\3\1\4\1\3"+
    "\1\0\1\3\1\6\1\0\1\4\1\0\1\4\1\3"+
    "\1\7\1\3\1\0\1\4\1\0\1\4\2\3\1\4"+
    "\1\0\1\4\1\3\1\4\1\0\1\4\1\3\2\0"+
    "\1\4\1\3\2\0\1\4\1\3\2\0\1\4\1\3"+
    "\2\0\1\4\1\3\2\0\1\4\1\3\2\0\1\3"+
    "\2\0\1\3\2\0\1\4\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\u0142"+
    "\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284\0\u02b2"+
    "\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\56\0\u03c6\0\u03f4"+
    "\0\u0422\0\270\0\u0450\0\56\0\u047e\0\u04ac\0\u04da\0\u0508"+
    "\0\u0536\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0114"+
    "\0\u0678\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba"+
    "\0\u07e8\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\56\0\u08fc"+
    "\0\u092a\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c"+
    "\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\56\0\u0b52\0\u0b80\0\u0bae"+
    "\0\u0bdc\0\u0c0a\0\u0c38\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0\0\u0114"+
    "\0\u0d1e\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0e32\0\u0e60"+
    "\0\u0e8e\0\u0ebc\0\u0eea\0\u0f18\0\u0f46\0\u0f74\0\u0fa2\0\u0fd0"+
    "\0\u0ffe\0\u102c\0\u105a\0\u1088\0\u10b6\0\u10e4\0\u1112\0\u1140"+
    "\0\u116e\0\56\0\u119c\0\u11ca\0\u11f8\0\u1226\0\u1254\0\u1282"+
    "\0\u12b0\0\u12de\0\u130c\0\u133a\0\u1368\0\u1396\0\u13c4\0\56"+
    "\0\u13f2\0\u1420\0\u144e\0\u147c\0\u14aa\0\u14d8\0\u1506\0\u1534"+
    "\0\u1562\0\u1590\0\u15be\0\u15ec\0\u161a\0\u1648\0\u1676\0\u16a4"+
    "\0\u16d2\0\u1700\0\u172e\0\u175c\0\u178a\0\u17b8\0\u17e6\0\u1814"+
    "\0\u1842\0\u1870\0\u189e\0\u18cc\0\u18fa\0\u1928\0\u1956\0\u1984"+
    "\0\u19b2\0\u19e0\0\u1a0e\0\u1a3c\0\u1a6a\0\u1a98\0\u1ac6\0\u1af4"+
    "\0\u1b22\0\u1b50\0\u1b7e\0\u0114\0\u1bac\0\u1bda\0\u1c08";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\2"+
    "\1\10\1\11\1\7\1\12\1\13\1\14\3\11\1\15"+
    "\1\16\1\7\1\17\5\7\1\20\1\21\1\22\1\2"+
    "\1\23\2\7\1\11\1\7\1\24\1\25\1\7\2\26"+
    "\1\7\2\26\1\27\1\30\1\31\60\0\1\2\56\0"+
    "\1\4\52\0\1\32\1\33\1\34\1\32\1\34\51\32"+
    "\5\0\1\35\56\0\7\7\1\0\15\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\7\15\0\1\36\1\0\1\37"+
    "\3\0\1\40\1\41\1\40\20\0\1\40\24\0\2\11"+
    "\4\0\3\11\20\0\1\11\22\0\7\7\1\0\6\7"+
    "\1\42\6\7\3\0\6\7\1\0\1\7\2\0\1\7"+
    "\13\0\7\7\1\0\4\7\1\43\10\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\44\15\0\1\45\5\0\2\46"+
    "\1\45\20\0\1\46\22\0\7\7\1\0\4\7\1\47"+
    "\10\7\3\0\4\7\1\50\1\7\1\0\1\7\2\0"+
    "\1\7\13\0\7\7\1\0\7\7\1\51\5\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\7\7\1\52\5\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\13\0\5\7\1\53\1\7\1\0\6\7\1\54"+
    "\6\7\3\0\4\7\1\55\1\7\1\0\1\7\2\0"+
    "\1\7\5\0\1\56\2\0\30\56\1\0\1\56\1\0"+
    "\20\56\1\57\2\0\31\57\2\0\14\57\1\60\2\57"+
    "\1\61\6\0\7\7\1\0\10\7\1\62\4\7\3\0"+
    "\2\7\1\63\3\7\1\0\1\7\2\0\1\7\13\0"+
    "\7\7\1\0\15\7\3\0\2\7\1\64\3\7\1\0"+
    "\1\7\2\0\1\7\43\0\1\65\6\0\1\66\63\0"+
    "\1\26\55\0\2\26\53\0\1\26\5\0\1\34\53\0"+
    "\1\35\1\33\1\34\53\35\10\0\1\36\2\0\1\67"+
    "\2\0\1\40\1\41\1\40\20\0\1\40\24\0\1\70"+
    "\1\71\2\0\1\71\1\0\6\71\5\0\2\71\6\0"+
    "\1\71\24\0\1\72\2\0\1\67\2\0\3\72\20\0"+
    "\1\72\24\0\1\40\2\0\1\67\2\0\3\40\20\0"+
    "\1\40\22\0\7\7\1\0\10\7\1\73\4\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\11\7\1\74\3\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\13\0\7\7\1\0\10\7\1\75\4\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\15\0\1\76\5\0"+
    "\3\76\20\0\1\76\24\0\1\45\5\0\3\45\20\0"+
    "\1\45\22\0\7\7\1\0\5\7\1\77\7\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\3\7\1\50\11\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\13\0\7\7\1\0\10\7\1\100\4\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\15\7\3\0\4\7\1\101\1\7\1\0\1\7\2\0"+
    "\1\7\13\0\4\7\1\102\1\103\1\7\1\0\4\7"+
    "\1\104\10\7\3\0\6\7\1\0\1\7\2\0\1\7"+
    "\13\0\7\7\1\0\12\7\1\50\2\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\7\5\0\1\56\2\0\30\56"+
    "\1\105\1\56\1\0\20\56\34\0\1\105\55\0\1\105"+
    "\20\0\1\106\34\0\1\105\15\0\1\106\11\0\7\7"+
    "\1\0\12\7\1\107\2\7\3\0\6\7\1\0\1\7"+
    "\2\0\1\7\13\0\7\7\1\0\13\7\1\110\1\7"+
    "\3\0\6\7\1\0\1\7\2\0\1\7\13\0\7\7"+
    "\1\0\6\7\1\111\6\7\3\0\6\7\1\0\1\7"+
    "\2\0\1\7\27\0\1\112\64\0\1\113\34\0\1\70"+
    "\1\71\1\0\1\67\1\71\1\0\6\71\5\0\2\71"+
    "\6\0\1\71\24\0\2\114\1\0\1\67\1\114\1\0"+
    "\6\114\5\0\2\114\6\0\1\114\24\0\1\115\2\0"+
    "\1\67\2\0\3\115\20\0\1\115\22\0\7\7\1\0"+
    "\4\7\1\116\10\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\13\0\7\7\1\0\6\7\1\117\6\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\4\7\1\120\10\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\15\0\1\121\5\0\3\121\20\0\1\121\22\0"+
    "\7\7\1\0\6\7\1\122\6\7\3\0\6\7\1\0"+
    "\1\7\2\0\1\7\13\0\7\7\1\0\15\7\3\0"+
    "\6\7\1\0\1\7\1\123\1\0\1\7\13\0\7\7"+
    "\1\0\13\7\1\124\1\7\3\0\6\7\1\0\1\7"+
    "\2\0\1\7\13\0\7\7\1\0\4\7\1\125\10\7"+
    "\3\0\6\7\1\0\1\7\2\0\1\7\13\0\5\7"+
    "\1\126\1\7\1\0\15\7\3\0\6\7\1\0\1\7"+
    "\2\0\1\7\13\0\5\7\1\127\1\7\1\0\15\7"+
    "\3\0\6\7\1\0\1\7\2\0\1\7\41\0\1\26"+
    "\27\0\7\7\1\0\6\7\1\130\6\7\3\0\1\7"+
    "\1\131\4\7\1\0\1\7\2\0\1\7\13\0\7\7"+
    "\1\0\12\7\1\132\2\7\3\0\6\7\1\0\1\7"+
    "\2\0\1\7\13\0\5\7\1\133\1\7\1\0\15\7"+
    "\3\0\6\7\1\0\1\7\2\0\1\7\30\0\1\134"+
    "\61\0\1\135\36\0\2\136\1\0\1\67\1\136\1\0"+
    "\6\136\5\0\2\136\6\0\1\136\24\0\1\137\2\0"+
    "\1\67\2\0\3\137\20\0\1\137\22\0\7\7\1\0"+
    "\12\7\1\140\2\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\13\0\7\7\1\0\7\7\1\50\5\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\15\0\1\141\5\0"+
    "\3\141\20\0\1\141\22\0\7\7\1\0\7\7\1\142"+
    "\5\7\3\0\6\7\1\0\1\7\2\0\1\7\23\0"+
    "\1\143\45\0\7\7\1\0\10\7\1\120\4\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\3\7\1\120\11\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\13\0\7\7\1\0\4\7\1\144\10\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\3\7\1\145\11\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\13\0\7\7\1\0\7\7\1\146\5\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\5\7\1\147\7\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\13\0\7\7\1\0\4\7\1\150\10\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\4\7\1\50\10\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\33\0\1\151\51\0\1\152\43\0\2\153\1\0"+
    "\1\67\1\153\1\0\6\153\5\0\2\153\6\0\1\153"+
    "\24\0\1\154\2\0\1\67\2\0\3\154\20\0\1\154"+
    "\22\0\7\7\1\0\13\7\1\155\1\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\7\15\0\1\156\5\0\3\156"+
    "\20\0\1\156\22\0\7\7\1\0\10\7\1\157\4\7"+
    "\3\0\6\7\1\0\1\7\2\0\1\7\46\0\1\160"+
    "\22\0\7\7\1\0\12\7\1\120\2\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\7\13\0\7\7\1\0\13\7"+
    "\1\161\1\7\3\0\6\7\1\0\1\7\2\0\1\7"+
    "\13\0\7\7\1\0\11\7\1\120\3\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\7\13\0\7\7\1\0\10\7"+
    "\1\50\4\7\3\0\6\7\1\0\1\7\2\0\1\7"+
    "\13\0\7\7\1\0\3\7\1\162\11\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\7\31\0\1\163\41\0\2\164"+
    "\1\0\1\67\1\164\1\0\6\164\5\0\2\164\6\0"+
    "\1\164\24\0\1\165\2\0\1\67\2\0\3\165\20\0"+
    "\1\165\22\0\5\7\1\50\1\7\1\0\15\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\15\0\1\166\5\0"+
    "\3\166\20\0\1\166\22\0\7\7\1\0\4\7\1\167"+
    "\10\7\3\0\6\7\1\0\1\7\2\0\1\7\54\0"+
    "\1\170\14\0\5\7\1\171\1\7\1\0\15\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\13\0\7\7\1\0"+
    "\15\7\3\0\3\7\1\50\2\7\1\0\1\7\2\0"+
    "\1\7\47\0\1\172\23\0\2\173\1\0\1\67\1\173"+
    "\1\0\6\173\5\0\2\173\6\0\1\173\24\0\1\174"+
    "\2\0\1\67\2\0\3\174\20\0\1\174\24\0\1\175"+
    "\5\0\3\175\20\0\1\175\22\0\7\7\1\0\11\7"+
    "\1\176\3\7\3\0\6\7\1\0\1\7\2\0\1\7"+
    "\13\0\7\7\1\0\6\7\1\177\6\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\7\32\0\1\152\40\0\2\200"+
    "\1\0\1\67\1\200\1\0\6\200\5\0\2\200\6\0"+
    "\1\200\24\0\1\201\2\0\1\67\2\0\3\201\20\0"+
    "\1\201\24\0\1\202\5\0\3\202\20\0\1\202\22\0"+
    "\7\7\1\0\4\7\1\203\10\7\3\0\6\7\1\0"+
    "\1\7\2\0\1\7\13\0\7\7\1\0\11\7\1\117"+
    "\3\7\3\0\6\7\1\0\1\7\2\0\1\7\15\0"+
    "\2\204\1\0\1\67\1\204\1\0\6\204\5\0\2\204"+
    "\6\0\1\204\24\0\1\205\2\0\1\67\2\0\3\205"+
    "\20\0\1\205\24\0\1\206\5\0\3\206\20\0\1\206"+
    "\22\0\7\7\1\0\12\7\1\207\2\7\3\0\6\7"+
    "\1\0\1\7\2\0\1\7\15\0\2\210\1\0\1\67"+
    "\1\210\1\0\6\210\5\0\2\210\6\0\1\210\24\0"+
    "\1\211\2\0\1\67\2\0\3\211\20\0\1\211\24\0"+
    "\1\212\5\0\3\212\20\0\1\212\22\0\5\7\1\213"+
    "\1\7\1\0\15\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\15\0\2\214\1\0\1\67\1\214\1\0\6\214"+
    "\5\0\2\214\6\0\1\214\24\0\1\215\2\0\1\67"+
    "\2\0\3\215\20\0\1\215\24\0\1\216\5\0\3\216"+
    "\20\0\1\216\22\0\7\7\1\0\6\7\1\217\6\7"+
    "\3\0\6\7\1\0\1\7\2\0\1\7\15\0\2\220"+
    "\1\0\1\67\1\220\1\0\6\220\5\0\2\220\6\0"+
    "\1\220\24\0\1\221\2\0\1\67\2\0\3\221\20\0"+
    "\1\221\24\0\1\222\5\0\3\222\20\0\1\222\22\0"+
    "\7\7\1\0\10\7\1\223\4\7\3\0\6\7\1\0"+
    "\1\7\2\0\1\7\15\0\2\224\1\0\1\67\1\224"+
    "\1\0\6\224\5\0\2\224\6\0\1\224\24\0\1\225"+
    "\2\0\1\67\2\0\3\225\20\0\1\225\24\0\1\226"+
    "\5\0\3\226\20\0\1\226\22\0\7\7\1\0\4\7"+
    "\1\227\10\7\3\0\6\7\1\0\1\7\2\0\1\7"+
    "\15\0\2\230\1\0\1\67\1\230\1\0\6\230\5\0"+
    "\2\230\6\0\1\230\24\0\1\231\2\0\1\67\2\0"+
    "\3\231\20\0\1\231\24\0\1\232\5\0\3\232\20\0"+
    "\1\232\22\0\7\7\1\0\12\7\1\233\2\7\3\0"+
    "\6\7\1\0\1\7\2\0\1\7\15\0\2\234\1\0"+
    "\1\67\1\234\1\0\6\234\5\0\2\234\6\0\1\234"+
    "\24\0\1\235\2\0\1\67\2\0\3\235\20\0\1\235"+
    "\24\0\1\67\5\0\3\67\20\0\1\67\22\0\7\7"+
    "\1\0\13\7\1\236\1\7\3\0\6\7\1\0\1\7"+
    "\2\0\1\7\15\0\2\237\1\0\1\67\1\237\1\0"+
    "\6\237\5\0\2\237\6\0\1\237\24\0\1\240\2\0"+
    "\1\67\2\0\3\240\20\0\1\240\22\0\5\7\1\241"+
    "\1\7\1\0\15\7\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\15\0\2\242\1\0\1\67\1\242\1\0\6\242"+
    "\5\0\2\242\6\0\1\242\24\0\1\243\2\0\1\67"+
    "\2\0\3\243\20\0\1\243\22\0\7\7\1\0\3\7"+
    "\1\244\10\7\1\244\3\0\6\7\1\0\1\7\2\0"+
    "\1\7\20\0\1\67\52\0\1\245\2\0\1\67\2\0"+
    "\3\245\20\0\1\245\24\0\1\246\2\0\1\67\2\0"+
    "\3\246\20\0\1\246\24\0\1\247\2\0\1\67\2\0"+
    "\3\247\20\0\1\247\24\0\1\242\2\0\1\67\2\0"+
    "\3\242\20\0\1\242\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7222];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\23\1\1\11\3\1\1\0\1\1\1\11"+
    "\1\1\4\0\14\1\4\0\3\1\2\0\1\11\2\1"+
    "\1\0\12\1\1\11\1\0\3\1\2\0\1\1\1\0"+
    "\5\1\1\0\10\1\2\0\1\1\1\0\3\1\1\0"+
    "\5\1\1\0\1\11\1\1\1\0\3\1\1\0\2\1"+
    "\1\0\1\1\1\0\2\1\1\11\1\1\1\0\1\1"+
    "\1\0\4\1\1\0\3\1\1\0\2\1\2\0\2\1"+
    "\2\0\2\1\2\0\2\1\2\0\2\1\2\0\2\1"+
    "\2\0\1\1\2\0\1\1\2\0\1\1\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    /**
     * Create an empty lexer, yyrset will be called later to reset and assign
     * the reader
     */
    public TALLexer() {
        super();
    }

    @Override
    public int yychar() {
        return yychar;
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public TALLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public TALLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 190) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return token(TokenType.STRING);
          }
        case 9: break;
        case 6: 
          { return token(TokenType.KEYWORD);
          }
        case 10: break;
        case 7: 
          { return token(TokenType.TYPE);
          }
        case 11: break;
        case 2: 
          { return token(TokenType.OPERATOR);
          }
        case 12: break;
        case 4: 
          { return token(TokenType.NUMBER);
          }
        case 13: break;
        case 3: 
          { return token(TokenType.IDENTIFIER);
          }
        case 14: break;
        case 5: 
          { return token(TokenType.COMMENT);
          }
        case 15: break;
        case 1: 
          { 
          }
        case 16: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return null;
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
