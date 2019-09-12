package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyExchangeInputModelBusinessDevelopmentStrategyExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyExchangeInputModel
 */
public class CRBusinessDevelopmentStrategyExchangeInputModel   {
  private String businessDevelopmentServicingSessionReference = null;

  private String businessDevelopmentStrategyInstanceReference = null;

  private Object businessDevelopmentStrategyExchangeActionTaskRecord = null;

  private CRBusinessDevelopmentStrategyExchangeInputModelBusinessDevelopmentStrategyExchangeActionRequest businessDevelopmentStrategyExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return businessDevelopmentStrategyExchangeActionTaskRecord
  **/

  public Object getBusinessDevelopmentStrategyExchangeActionTaskRecord() {
    return businessDevelopmentStrategyExchangeActionTaskRecord;
  }

  public void setBusinessDevelopmentStrategyExchangeActionTaskRecord(Object businessDevelopmentStrategyExchangeActionTaskRecord) {
    this.businessDevelopmentStrategyExchangeActionTaskRecord = businessDevelopmentStrategyExchangeActionTaskRecord;
  }


  /**
   * Get businessDevelopmentStrategyExchangeActionRequest
   * @return businessDevelopmentStrategyExchangeActionRequest
  **/

  public CRBusinessDevelopmentStrategyExchangeInputModelBusinessDevelopmentStrategyExchangeActionRequest getBusinessDevelopmentStrategyExchangeActionRequest() {
    return businessDevelopmentStrategyExchangeActionRequest;
  }

  public void setBusinessDevelopmentStrategyExchangeActionRequest(CRBusinessDevelopmentStrategyExchangeInputModelBusinessDevelopmentStrategyExchangeActionRequest businessDevelopmentStrategyExchangeActionRequest) {
    this.businessDevelopmentStrategyExchangeActionRequest = businessDevelopmentStrategyExchangeActionRequest;
  }


}

