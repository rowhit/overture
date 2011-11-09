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



public class OmlName extends OmlExpression implements IOmlName {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivClassIdentifier KEEP=NO
  private String ivClassIdentifier = null;
// ***** VDMTOOLS END Name=ivClassIdentifier

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier


// ***** VDMTOOLS START Name=OmlName KEEP=NO
  public OmlName () throws CGException {
    try {

      ivClassIdentifier = null;
      ivIdentifier = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlName


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("Name");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitName((IOmlName) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlName KEEP=NO
  public OmlName (final String p1, final String p2) throws CGException {

    try {

      ivClassIdentifier = null;
      ivIdentifier = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setClassIdentifier(p1);
      setIdentifier(p2);
    }
  }
// ***** VDMTOOLS END Name=OmlName


// ***** VDMTOOLS START Name=OmlName KEEP=NO
  public OmlName (final String p1, final String p2, final Long line, final Long column) throws CGException {

    try {

      ivClassIdentifier = null;
      ivIdentifier = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setClassIdentifier(p1);
      setIdentifier(p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlName


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("class_identifier");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setClassIdentifier(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("identifier");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setIdentifier(UTIL.ConvertToString(data.get(fname)));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getClassIdentifier KEEP=NO
  public String getClassIdentifier () throws CGException {

    if (!this.pre_getClassIdentifier().booleanValue()) 
      UTIL.RunTime("Run-Time Error:Precondition failure in getClassIdentifier");
    return ivClassIdentifier;
  }
// ***** VDMTOOLS END Name=getClassIdentifier


// ***** VDMTOOLS START Name=pre_getClassIdentifier KEEP=NO
  public Boolean pre_getClassIdentifier () throws CGException {
    return hasClassIdentifier();
  }
// ***** VDMTOOLS END Name=pre_getClassIdentifier


// ***** VDMTOOLS START Name=hasClassIdentifier KEEP=NO
  public Boolean hasClassIdentifier () throws CGException {
    return new Boolean(!UTIL.equals(ivClassIdentifier, null));
  }
// ***** VDMTOOLS END Name=hasClassIdentifier


// ***** VDMTOOLS START Name=setClassIdentifier KEEP=NO
  public void setClassIdentifier (final String parg) throws CGException {
    ivClassIdentifier = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setClassIdentifier


// ***** VDMTOOLS START Name=getIdentifier KEEP=NO
  public String getIdentifier () throws CGException {
    return ivIdentifier;
  }
// ***** VDMTOOLS END Name=getIdentifier


// ***** VDMTOOLS START Name=setIdentifier KEEP=NO
  public void setIdentifier (final String parg) throws CGException {
    ivIdentifier = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setIdentifier

}
;
