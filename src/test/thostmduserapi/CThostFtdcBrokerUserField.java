/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcBrokerUserField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcBrokerUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcBrokerUserField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcBrokerUserField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcBrokerUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcBrokerUserField_UserID_get(swigCPtr, this);
  }

  public void setUserName(String value) {
    thostmdapiJNI.CThostFtdcBrokerUserField_UserName_set(swigCPtr, this, value);
  }

  public String getUserName() {
    return thostmdapiJNI.CThostFtdcBrokerUserField_UserName_get(swigCPtr, this);
  }

  public void setUserType(char value) {
    thostmdapiJNI.CThostFtdcBrokerUserField_UserType_set(swigCPtr, this, value);
  }

  public char getUserType() {
    return thostmdapiJNI.CThostFtdcBrokerUserField_UserType_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thostmdapiJNI.CThostFtdcBrokerUserField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thostmdapiJNI.CThostFtdcBrokerUserField_IsActive_get(swigCPtr, this);
  }

  public void setIsUsingOTP(int value) {
    thostmdapiJNI.CThostFtdcBrokerUserField_IsUsingOTP_set(swigCPtr, this, value);
  }

  public int getIsUsingOTP() {
    return thostmdapiJNI.CThostFtdcBrokerUserField_IsUsingOTP_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserField() {
    this(thostmdapiJNI.new_CThostFtdcBrokerUserField(), true);
  }

}