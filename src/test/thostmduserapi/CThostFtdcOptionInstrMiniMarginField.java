/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcOptionInstrMiniMarginField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcOptionInstrMiniMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrMiniMarginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcOptionInstrMiniMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setMinMargin(double value) {
    thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_MinMargin_set(swigCPtr, this, value);
  }

  public double getMinMargin() {
    return thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_MinMargin_get(swigCPtr, this);
  }

  public void setValueMethod(char value) {
    thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_ValueMethod_set(swigCPtr, this, value);
  }

  public char getValueMethod() {
    return thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_ValueMethod_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return thostmdapiJNI.CThostFtdcOptionInstrMiniMarginField_IsRelative_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrMiniMarginField() {
    this(thostmdapiJNI.new_CThostFtdcOptionInstrMiniMarginField(), true);
  }

}