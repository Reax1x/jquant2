/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryCFMMCTradingAccountKeyField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryCFMMCTradingAccountKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryCFMMCTradingAccountKeyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryCFMMCTradingAccountKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQryCFMMCTradingAccountKeyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQryCFMMCTradingAccountKeyField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcQryCFMMCTradingAccountKeyField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcQryCFMMCTradingAccountKeyField_InvestorID_get(swigCPtr, this);
  }

  public CThostFtdcQryCFMMCTradingAccountKeyField() {
    this(thostmdapiJNI.new_CThostFtdcQryCFMMCTradingAccountKeyField(), true);
  }

}