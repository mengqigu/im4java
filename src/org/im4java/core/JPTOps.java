/**************************************************************************
/* This class adds all the JPT methods to an Operation.
/*
/* Copyright (c) 2009 by Bernhard Bablok (mail@bablokb.de)
/*
/* This program is free software; you can redistribute it and/or modify
/* it under the terms of the GNU Library General Public License as published
/* by  the Free Software Foundation; either version 2 of the License or
/* (at your option) any later version.
/*
/* This program is distributed in the hope that it will be useful, but
/* WITHOUT ANY WARRANTY; without even the implied warranty of
/* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
/* GNU Library General Public License for more details.
/*
/* You should have received a copy of the GNU Library General Public License
/* along with this program; see the file COPYING.LIB.  If not, write to
/* the Free Software Foundation Inc., 59 Temple Place - Suite 330,
/* Boston, MA  02111-1307 USA
/**************************************************************************/

package org.im4java.core;

/**
   This class subclasses Operation and adds methods for all commandline
   options of jpegtran.

   <p>This class is automatically generated by the source-code generator of
   im4java.</p>

   @version $Revision: 1.14 $
   @author  $Author: bablokb $
*/

public class JPTOps extends Operation {

  //////////////////////////////////////////////////////////////////////////////

  /**
     The protected Constructor. You should only use subclasses of JPTOps.
  */

  protected JPTOps() {
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -copy to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps copy(String pCopyType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-copy");

    if (pCopyType != null) {
      buf.append(pCopyType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -optimize to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps optimize() {

    iCmdArgs.add("-optimize");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -progressive to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps progressive() {

    iCmdArgs.add("-progressive");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -crop to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps crop(Integer pWidth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-crop");

    if (pWidth != null) {
      buf.append(pWidth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -grayscale to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps grayscale() {

    iCmdArgs.add("-grayscale");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -flip to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps flip(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-flip");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -perfect to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps perfect() {

    iCmdArgs.add("-perfect");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -rotate to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps rotate(Double pDegrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-rotate");

    if (pDegrees != null) {
      buf.append(pDegrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -transpose to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps transpose() {

    iCmdArgs.add("-transpose");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -transverse to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps transverse() {

    iCmdArgs.add("-transverse");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -trim to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps trim() {

    iCmdArgs.add("-trim");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -restart to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps restart(Integer pNumber) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-restart");

    if (pNumber != null) {
      buf.append(pNumber.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -maxmemory to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps maxmemory(Integer pSize) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-maxmemory");

    if (pSize != null) {
      buf.append(pSize.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -outfile to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps outfile(String pFilename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-outfile");

    if (pFilename != null) {
      buf.append(pFilename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -verbose to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps verbose() {

    iCmdArgs.add("-verbose");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -debug to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps debug() {

    iCmdArgs.add("-debug");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -arithmetic to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps arithmetic() {

    iCmdArgs.add("-arithmetic");

    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -scans to the jpegtran commandline
     (see the documentation of jpegtran for details).
  */

  public JPTOps scans(String pFilename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-scans");

    if (pFilename != null) {
      buf.append(pFilename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }


}
