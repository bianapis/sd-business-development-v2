package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyRequestOutputModel
 */
public class CRBusinessDevelopmentStrategyRequestOutputModel   {
  private CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;

  private String businessDevelopmentStrategyRequestActionTaskReference = null;

  private Object businessDevelopmentStrategyRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get businessDevelopmentStrategyInstanceRecord
   * @return businessDevelopmentStrategyInstanceRecord
  **/

  public CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord getBusinessDevelopmentStrategyInstanceRecord() {
    return businessDevelopmentStrategyInstanceRecord;
  }

  public void setBusinessDevelopmentStrategyInstanceRecord(CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord) {
    this.businessDevelopmentStrategyInstanceRecord = businessDevelopmentStrategyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Development Strategy instance request service call 
   * @return businessDevelopmentStrategyRequestActionTaskReference
  **/

  public String getBusinessDevelopmentStrategyRequestActionTaskReference() {
    return businessDevelopmentStrategyRequestActionTaskReference;
  }

  public void setBusinessDevelopmentStrategyRequestActionTaskReference(String businessDevelopmentStrategyRequestActionTaskReference) {
    this.businessDevelopmentStrategyRequestActionTaskReference = businessDevelopmentStrategyRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return businessDevelopmentStrategyRequestActionTaskRecord
  **/

  public Object getBusinessDevelopmentStrategyRequestActionTaskRecord() {
    return businessDevelopmentStrategyRequestActionTaskRecord;
  }

  public void setBusinessDevelopmentStrategyRequestActionTaskRecord(Object businessDevelopmentStrategyRequestActionTaskRecord) {
    this.businessDevelopmentStrategyRequestActionTaskRecord = businessDevelopmentStrategyRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

