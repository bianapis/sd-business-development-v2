package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCaptureInputModelBusinessDevelopmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyCaptureOutputModel
 */
public class CRBusinessDevelopmentStrategyCaptureOutputModel   {
  private CRBusinessDevelopmentStrategyCaptureInputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;

  private String businessDevelopmentStrategyCaptureActionTaskReference = null;

  private Object businessDevelopmentStrategyCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Development Strategy instance capture service call 
   * @return businessDevelopmentStrategyCaptureActionTaskReference
  **/

  public String getBusinessDevelopmentStrategyCaptureActionTaskReference() {
    return businessDevelopmentStrategyCaptureActionTaskReference;
  }

  public void setBusinessDevelopmentStrategyCaptureActionTaskReference(String businessDevelopmentStrategyCaptureActionTaskReference) {
    this.businessDevelopmentStrategyCaptureActionTaskReference = businessDevelopmentStrategyCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

