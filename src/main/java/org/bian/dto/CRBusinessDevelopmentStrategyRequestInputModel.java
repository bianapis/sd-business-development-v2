package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord;
import org.bian.dto.CRBusinessDevelopmentStrategyRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyRequestInputModel
 */
public class CRBusinessDevelopmentStrategyRequestInputModel   {
  private String businessDevelopmentServicingSessionReference = null;

  private String businessDevelopmentStrategyInstanceReference = null;

  private CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;

  private Object businessDevelopmentStrategyRequestActionTaskRecord = null;

  private CRBusinessDevelopmentStrategyRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord getBusinessDevelopmentStrategyInstanceRecord() {
    return businessDevelopmentStrategyInstanceRecord;
  }

  public void setBusinessDevelopmentStrategyInstanceRecord(CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord) {
    this.businessDevelopmentStrategyInstanceRecord = businessDevelopmentStrategyInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRBusinessDevelopmentStrategyRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRBusinessDevelopmentStrategyRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

