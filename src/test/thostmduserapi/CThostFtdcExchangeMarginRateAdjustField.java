/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcExchangeMarginRateAdjustField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeMarginRateAdjustField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcExchangeMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByMoney() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByVolume() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByMoney() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByVolume() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByMoney() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByVolume() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByMoney() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByVolume() {
    return thostmdapiJNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcExchangeMarginRateAdjustField() {
    this(thostmdapiJNI.new_CThostFtdcExchangeMarginRateAdjustField(), true);
  }

}