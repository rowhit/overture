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



public class OmlOperationDefinition extends OmlNode implements IOmlOperationDefinition {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivAccess KEEP=NO
  private IOmlAccessDefinition ivAccess = null;
// ***** VDMTOOLS END Name=ivAccess

// ***** VDMTOOLS START Name=ivShape KEEP=NO
  private IOmlOperationShape ivShape = null;
// ***** VDMTOOLS END Name=ivShape


// ***** VDMTOOLS START Name=OmlOperationDefinition KEEP=NO
  public OmlOperationDefinition () throws CGException {
    try {

      ivAccess = null;
      ivShape = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlOperationDefinition


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("OperationDefinition");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitOperationDefinition((IOmlOperationDefinition) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlOperationDefinition KEEP=NO
  public OmlOperationDefinition (final IOmlAccessDefinition p1, final IOmlOperationShape p2) throws CGException {

    try {

      ivAccess = null;
      ivShape = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setAccess((IOmlAccessDefinition) p1);
      setShape((IOmlOperationShape) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlOperationDefinition


// ***** VDMTOOLS START Name=OmlOperationDefinition KEEP=NO
  public OmlOperationDefinition (final IOmlAccessDefinition p1, final IOmlOperationShape p2, final Long line, final Long column) throws CGException {

    try {

      ivAccess = null;
      ivShape = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setAccess((IOmlAccessDefinition) p1);
      setShape((IOmlOperationShape) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlOperationDefinition


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("access");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setAccess((IOmlAccessDefinition) data.get(fname));
    }
    {

      String fname = new String("shape");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setShape((IOmlOperationShape) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getAccess KEEP=NO
  public IOmlAccessDefinition getAccess () throws CGException {
    return (IOmlAccessDefinition) ivAccess;
  }
// ***** VDMTOOLS END Name=getAccess


// ***** VDMTOOLS START Name=setAccess KEEP=NO
  public void setAccess (final IOmlAccessDefinition parg) throws CGException {
    ivAccess = (IOmlAccessDefinition) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setAccess


// ***** VDMTOOLS START Name=getShape KEEP=NO
  public IOmlOperationShape getShape () throws CGException {
    return (IOmlOperationShape) ivShape;
  }
// ***** VDMTOOLS END Name=getShape


// ***** VDMTOOLS START Name=setShape KEEP=NO
  public void setShape (final IOmlOperationShape parg) throws CGException {
    ivShape = (IOmlOperationShape) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setShape

}
;
