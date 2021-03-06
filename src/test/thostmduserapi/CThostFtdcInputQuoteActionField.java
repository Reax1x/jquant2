/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcInputQuoteActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInputQuoteActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputQuoteActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcInputQuoteActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_InvestorID_get(swigCPtr, this);
  }

  public void setQuoteActionRef(int value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_QuoteActionRef_set(swigCPtr, this, value);
  }

  public int getQuoteActionRef() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_QuoteActionRef_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_QuoteRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_QuoteSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmdapiJNI.CThostFtdcInputQuoteActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmdapiJNI.CThostFtdcInputQuoteActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputQuoteActionField() {
    this(thostmdapiJNI.new_CThostFtdcInputQuoteActionField(), true);
  }

}
