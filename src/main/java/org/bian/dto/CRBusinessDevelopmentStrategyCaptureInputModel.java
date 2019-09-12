package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCaptureInputModelBusinessDevelopmentStrategyInstanceRecord;
import org.bian.dto.CRBusinessDevelopmentStrategyCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyCaptureInputModel
 */
public class CRBusinessDevelopmentStrategyCaptureInputModel   {
  private String businessDevelopmentServicingSessionReference = null;

  private String businessDevelopmentStrategyInstanceReference = null;

  private CRBusinessDevelopmentStrategyCaptureInputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;

  private Object businessDevelopmentStrategyCaptureActionTaskRecord = null;

  private CRBusinessDevelopmentStrategyCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return businessDevelopmentServicingSessionReference
  **/

  public String getBusinessDevelopmentServicingSessionReference() {
    return businessDevelopmentServicingSessionReference;
  }

  public void setBusinessDevelopmentServicingSessionReference(String businessDevelopmentServicingSessionReference) {
    this.businessDevelopmentServicingSessionReference = businessDevelopmentServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Business Development Strategy instance 
   * @return businessDevelopmentStrategyInstanceReference
  **/

  public String getBusinessDevelopmentStrategyInstanceReference() {
    return businessDevelopmentStrategyInstanceReference;
  }

  public void setBusinessDevelopmentStrategyInstanceReference(String businessDevelopmentStrategyInstanceReference) {
    this.businessDevelopmentStrategyInstanceReference = businessDevelopmentStrategyInstanceReference;
  }


  /**
   * Get businessDevelopmentStrategyInstanceRecord
   * @return businessDevelopmentStrategyInstanceRecord
  **/

  public CRBusinessDevelopmentStrategyCaptureInputModelBusinessDevelopmentStrategyInstanceRecord getBusinessDevelopmentStrategyInstanceRecord() {
    return businessDevelopmentStrategyInstanceRecord;
  }

  public void setBusinessDevelopmentStrategyInstanceRecord(CRBusinessDevelopmentStrategyCaptureInputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord) {
    this.businessDevelopmentStrategyInstanceRecord = businessDevelopmentStrategyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return businessDevelopmentStrategyCaptureActionTaskRecord
  **/

  public Object getBusinessDevelopmentStrategyCaptureActionTaskRecord() {
    return businessDevelopmentStrategyCaptureActionTaskRecord;
  }

  public void setBusinessDevelopmentStrategyCaptureActionTaskRecord(Object businessDevelopmentStrategyCaptureActionTaskRecord) {
    this.businessDevelopmentStrategyCaptureActionTaskRecord = businessDevelopmentStrategyCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRBusinessDevelopmentStrategyCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRBusinessDevelopmentStrategyCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

