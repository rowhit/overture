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



public class OmlFieldSelect extends OmlExpression implements IOmlFieldSelect {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression

// ***** VDMTOOLS START Name=ivName KEEP=NO
  private IOmlName ivName = null;
// ***** VDMTOOLS END Name=ivName


// ***** VDMTOOLS START Name=OmlFieldSelect KEEP=NO
  public OmlFieldSelect () throws CGException {
    try {

      ivExpression = null;
      ivName = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlFieldSelect


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("FieldSelect");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitFieldSelect((IOmlFieldSelect) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlFieldSelect KEEP=NO
  public OmlFieldSelect (final IOmlExpression p1, final IOmlName p2) throws CGException {

    try {

      ivExpression = null;
      ivName = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setExpression((IOmlExpression) p1);
      setName((IOmlName) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlFieldSelect


// ***** VDMTOOLS START Name=OmlFieldSelect KEEP=NO
  public OmlFieldSelect (final IOmlExpression p1, final IOmlName p2, final Long line, final Long column) throws CGException {

    try {

      ivExpression = null;
      ivName = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setExpression((IOmlExpression) p1);
      setName((IOmlName) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlFieldSelect


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("expression");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("name");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setName((IOmlName) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getExpression KEEP=NO
  public IOmlExpression getExpression () throws CGException {
    return (IOmlExpression) ivExpression;
  }
// ***** VDMTOOLS END Name=getExpression


// ***** VDMTOOLS START Name=setExpression KEEP=NO
  public void setExpression (final IOmlExpression parg) throws CGException {
    ivExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setExpression


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

}
;
