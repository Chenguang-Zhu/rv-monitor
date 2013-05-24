/* Generated By:JavaCC: Do not edit this line. PDAParserTokenManager.java */
package rvmonitor.logicpluginshells.java.pda.parser;

/** Token Manager. */
public class PDAParserTokenManager implements PDAParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x40c00L) != 0L)
         {
            jjmatchedKind = 12;
            return 24;
         }
         return -1;
      case 1:
         if ((active0 & 0x40c00L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
            return 24;
         }
         return -1;
      case 2:
         if ((active0 & 0x40c00L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 2;
            return 24;
         }
         return -1;
      case 3:
         if ((active0 & 0x400L) != 0L)
            return 24;
         if ((active0 & 0x40800L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 3;
            return 24;
         }
         return -1;
      case 4:
         if ((active0 & 0x800L) != 0L)
            return 24;
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 4;
            return 24;
         }
         return -1;
      case 5:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 5;
            return 24;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 42:
         return jjStopAtPos(0, 20);
      case 44:
         return jjStopAtPos(0, 17);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 91:
         return jjStopAtPos(0, 15);
      case 93:
         return jjStopAtPos(0, 19);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x400L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 24);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 24);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 27;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     jjCheckNAdd(26);
                  }
                  else if (curChar == 33)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  else if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 2:
                  if (curChar == 47 && kind > 5)
                     kind = 5;
                  break;
               case 10:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 38 && kind > 6)
                     kind = 6;
                  break;
               case 12:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 43 && kind > 7)
                     kind = 7;
                  break;
               case 14:
                  if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 19:
                  if (curChar == 33)
                     kind = 8;
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(26);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                     jjCheckNAdd(24);
                  }
                  else if (curChar == 94)
                  {
                     if (kind > 7)
                        kind = 7;
                  }
                  else if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 4;
                  else if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 2;
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 114 && kind > 5)
                     kind = 5;
                  break;
               case 3:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if (curChar == 124 && kind > 5)
                     kind = 5;
                  break;
               case 5:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 100 && kind > 6)
                     kind = 6;
                  break;
               case 7:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 92 && kind > 6)
                     kind = 6;
                  break;
               case 15:
                  if (curChar == 114 && kind > 7)
                     kind = 7;
                  break;
               case 16:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 94)
                     kind = 7;
                  break;
               case 20:
                  if (curChar == 116 && kind > 8)
                     kind = 8;
                  break;
               case 21:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
               case 24:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(24);
                  break;
               case 25:
                  if ((0x7fffffe07fffffeL & l) != 0L && kind > 14)
                     kind = 14;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 27 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, "\164\162\165\145", 
"\146\141\154\163\145", null, null, null, "\133", "\55\76", "\54", "\144\145\146\141\165\154\164", 
"\135", "\52", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[27];
private final int[] jjstateSet = new int[54];
protected char curChar;
/** Constructor. */
public PDAParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public PDAParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 27; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}