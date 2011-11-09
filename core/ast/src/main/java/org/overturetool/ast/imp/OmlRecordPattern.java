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
import java.util.*;
import org.overturetool.ast.itf.*;
@SuppressWarnings("all") 
// ***** VDMTOOLS END Name=imports



public class OmlRecordPattern extends OmlPattern implements IOmlRecordPattern {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivName KEEP=NO
  private IOmlName ivName = null;
// ***** VDMTOOLS END Name=ivName

// ***** VDMTOOLS START Name=ivPatternList KEEP=NO
  private Vector ivPatternList = null;
// ***** VDMTOOLS END Name=ivPatternList


// ***** VDMTOOLS START Name=OmlRecordPattern KEEP=NO
  public OmlRecordPattern () throws CGException {
    try {

      ivName = null;
      ivPatternList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlRecordPattern


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("RecordPattern");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitRecordPattern((IOmlRecordPattern) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlRecordPattern KEEP=NO
  public OmlRecordPattern (final IOmlName p1, final Vector p2) throws CGException {

    try {

      ivName = null;
      ivPatternList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setName((IOmlName) p1);
      setPatternList(p2);
    }
  }
// ***** VDMTOOLS END Name=OmlRecordPattern


// ***** VDMTOOLS START Name=OmlRecordPattern KEEP=NO
  public OmlRecordPattern (final IOmlName p1, final Vector p2, final Long line, final Long column) throws CGException {

    try {

      ivName = null;
      ivPatternList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setName((IOmlName) p1);
      setPatternList(p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlRecordPattern


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("name");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setName((IOmlName) data.get(fname));
    }
    {

      String fname = new String("pattern_list");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setPatternList((Vector) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getName KEEP=NO
  public IOmlName getName () throws CGException {
    return (IOmlName) ivName;
  }
// ***** VDMTOOLS END Name=getName


// ***** VDMTOOLS START Name=setName KEEP=NO
  public void setName (final IOmlName parg) throws CGException {
    ivName = (IOmlName) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setName


// ***** VDMTOOLS START Name=getPatternList KEEP=NO
  public Vector getPatternList () throws CGException {
    return ivPatternList;
  }
// ***** VDMTOOLS END Name=getPatternList


// ***** VDMTOOLS START Name=setPatternList KEEP=NO
  public void setPatternList (final Vector parg) throws CGException {
    ivPatternList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setPatternList


// ***** VDMTOOLS START Name=addPatternList KEEP=NO
  public void addPatternList (final IOmlNode parg) throws CGException {
    ivPatternList.add(parg);
  }
// ***** VDMTOOLS END Name=addPatternList

}
;
