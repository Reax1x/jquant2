/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcExchangeCombActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcExchangeCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDirection(char value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_Direction_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_Volume_get(swigCPtr, this);
  }

  public void setCombDirection(char value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_CombDirection_set(swigCPtr, this, value);
  }

  public char getCombDirection() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_CombDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionStatus(char value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_ActionStatus_set(swigCPtr, this, value);
  }

  public char getActionStatus() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_ActionStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_SettlementID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_SequenceNo_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttradeapiJNI.CThostFtdcExchangeCombActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttradeapiJNI.CThostFtdcExchangeCombActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeCombActionField() {
    this(thosttradeapiJNI.new_CThostFtdcExchangeCombActionField(), true);
  }

}