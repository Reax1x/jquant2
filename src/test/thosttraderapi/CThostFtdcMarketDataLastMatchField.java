/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcMarketDataLastMatchField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMarketDataLastMatchField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataLastMatchField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcMarketDataLastMatchField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLastPrice(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataLastMatchField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return thosttradeapiJNI.CThostFtdcMarketDataLastMatchField_LastPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttradeapiJNI.CThostFtdcMarketDataLastMatchField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttradeapiJNI.CThostFtdcMarketDataLastMatchField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataLastMatchField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return thosttradeapiJNI.CThostFtdcMarketDataLastMatchField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataLastMatchField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return thosttradeapiJNI.CThostFtdcMarketDataLastMatchField_OpenInterest_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataLastMatchField() {
    this(thosttradeapiJNI.new_CThostFtdcMarketDataLastMatchField(), true);
  }

}
