/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQueryMaxOrderVolumeWithPriceField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQueryMaxOrderVolumeWithPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQueryMaxOrderVolumeWithPriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQueryMaxOrderVolumeWithPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag_get(swigCPtr, this);
  }

  public void setMaxVolume(int value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume_set(swigCPtr, this, value);
  }

  public int getMaxVolume() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Price_get(swigCPtr, this);
  }

  public CThostFtdcQueryMaxOrderVolumeWithPriceField() {
    this(thostmdapiJNI.new_CThostFtdcQueryMaxOrderVolumeWithPriceField(), true);
  }

}
