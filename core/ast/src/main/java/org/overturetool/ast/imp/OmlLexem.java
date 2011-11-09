//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Sat 16-Aug-2008 by the VDM++ to JAVA Code Generator
// (v8.1.1b - Fri 06-Jun-2008 09:09:07)
//
// Supported compilers:
// jdk1.4
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package org.overturetool.ast.imp;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=YES

import jp.co.csk.vdm.toolbox.VDM.*;
import org.overturetool.ast.itf.*;
@SuppressWarnings("all") 
// ***** VDMTOOLS END Name=imports



public class OmlLexem implements IOmlLexem {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivLine KEEP=NO
  private Long ivLine = null;
// ***** VDMTOOLS END Name=ivLine

// ***** VDMTOOLS START Name=ivColumn KEEP=NO
  private Long ivColumn = null;
// ***** VDMTOOLS END Name=ivColumn

// ***** VDMTOOLS START Name=ivLexval KEEP=NO
  private Long ivLexval = null;
// ***** VDMTOOLS END Name=ivLexval

// ***** VDMTOOLS START Name=ivText KEEP=NO
  private String ivText = null;
// ***** VDMTOOLS END Name=ivText

// ***** VDMTOOLS START Name=ivType KEEP=NO
  private Long ivType = null;
// ***** VDMTOOLS END Name=ivType


// ***** VDMTOOLS START Name=OmlLexem KEEP=NO
  public OmlLexem () throws CGException {
    try {

      ivLine = new Long(0);
      ivColumn = new Long(0);
      ivLexval = new Long(0);
      ivText = UTIL.ConvertToString(new String());
      ivType = ILEXEMUNKNOWN;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlLexem


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitLexem((IOmlLexem) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=getLine KEEP=NO
  public Long getLine () throws CGException {
    return ivLine;
  }
// ***** VDMTOOLS END Name=getLine


// ***** VDMTOOLS START Name=setLine KEEP=NO
  public void setLine (final Long pline) throws CGException {
    ivLine = UTIL.NumberToLong(UTIL.clone(pline));
  }
// ***** VDMTOOLS END Name=setLine


// ***** VDMTOOLS START Name=getColumn KEEP=NO
  public Long getColumn () throws CGException {
    return ivColumn;
  }
// ***** VDMTOOLS END Name=getColumn


// ***** VDMTOOLS START Name=setColumn KEEP=NO
  public void setColumn (final Long pcolumn) throws CGException {
    ivColumn = UTIL.NumberToLong(UTIL.clone(pcolumn));
  }
// ***** VDMTOOLS END Name=setColumn


// ***** VDMTOOLS START Name=getLexval KEEP=NO
  public Long getLexval () throws CGException {
    return ivLexval;
  }
// ***** VDMTOOLS END Name=getLexval


// ***** VDMTOOLS START Name=setLexval KEEP=NO
  public void setLexval (final Long plexval) throws CGException {
    ivLexval = UTIL.NumberToLong(UTIL.clone(plexval));
  }
// ***** VDMTOOLS END Name=setLexval


// ***** VDMTOOLS START Name=getText KEEP=NO
  public String getText () throws CGException {
    return ivText;
  }
// ***** VDMTOOLS END Name=getText


// ***** VDMTOOLS START Name=setText KEEP=NO
  public void setText (final String ptext) throws CGException {
    ivText = UTIL.ConvertToString(UTIL.clone(ptext));
  }
// ***** VDMTOOLS END Name=setText


// ***** VDMTOOLS START Name=getType KEEP=NO
  public Long getType () throws CGException {
    return ivType;
  }
// ***** VDMTOOLS END Name=getType


// ***** VDMTOOLS START Name=isKeyword KEEP=NO
  public Boolean isKeyword () throws CGException {
    return new Boolean(ivType.intValue() == ILEXEMKEYWORD.intValue());
  }
// ***** VDMTOOLS END Name=isKeyword


// ***** VDMTOOLS START Name=isIdentifier KEEP=NO
  public Boolean isIdentifier () throws CGException {
    return new Boolean(ivType.intValue() == ILEXEMIDENTIFIER.intValue());
  }
// ***** VDMTOOLS END Name=isIdentifier


// ***** VDMTOOLS START Name=isComment KEEP=NO
  public Boolean isComment () throws CGException {

    Boolean rexpr_1 = null;
    {
      if (!(rexpr_1 = new Boolean(ivType.intValue() == ILEXEMLINECOMMENT.intValue())).booleanValue()) 
        rexpr_1 = new Boolean(ivType.intValue() == ILEXEMBLOCKCOMMENT.intValue());
    }
    return rexpr_1;
  }
// ***** VDMTOOLS END Name=isComment


// ***** VDMTOOLS START Name=isLineComment KEEP=NO
  public Boolean isLineComment () throws CGException {
    return new Boolean(ivType.intValue() == ILEXEMLINECOMMENT.intValue());
  }
// ***** VDMTOOLS END Name=isLineComment


// ***** VDMTOOLS START Name=isBlockComment KEEP=NO
  public Boolean isBlockComment () throws CGException {
    return new Boolean(ivType.intValue() == ILEXEMBLOCKCOMMENT.intValue());
  }
// ***** VDMTOOLS END Name=isBlockComment


// ***** VDMTOOLS START Name=OmlLexem KEEP=NO
  public OmlLexem (final Long pline, final Long pcolumn, final Long plexval, final String ptext, final Long ptype) throws CGException {

    try {

      ivLine = new Long(0);
      ivColumn = new Long(0);
      ivLexval = new Long(0);
      ivText = UTIL.ConvertToString(new String());
      ivType = ILEXEMUNKNOWN;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      ivLine = UTIL.NumberToLong(UTIL.clone(pline));
      ivColumn = UTIL.NumberToLong(UTIL.clone(pcolumn));
      ivLexval = UTIL.NumberToLong(UTIL.clone(plexval));
      ivText = UTIL.ConvertToString(UTIL.clone(ptext));
      ivType = UTIL.NumberToLong(UTIL.clone(ptype));
    }
  }
// ***** VDMTOOLS END Name=OmlLexem

}
;
