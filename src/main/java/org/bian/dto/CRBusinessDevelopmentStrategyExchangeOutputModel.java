package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyExchangeOutputModel
 */
public class CRBusinessDevelopmentStrategyExchangeOutputModel   {
  private String businessDevelopmentStrategyExchangeActionTaskReference = null;

  private Object businessDevelopmentStrategyExchangeActionTaskRecord = null;

  private String businessDevelopmentStrategyExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Development Strategy instance exchange service call 
   * @return businessDevelopmentStrategyExchangeActionTaskReference
  **/

  public String getBusinessDevelopmentStrategyExchangeActionTaskReference() {
    return businessDevelopmentStrategyExchangeActionTaskReference;
  }

  public void setBusinessDevelopmentStrategyExchangeActionTaskReference(String businessDevelopmentStrategyExchangeActionTaskReference) {
    this.businessDevelopmentStrategyExchangeActionTaskReference = businessDevelopmentStrategyExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return businessDevelopmentStrategyExchangeActionResponse
  **/

  public String getBusinessDevelopmentStrategyExchangeActionResponse() {
    return businessDevelopmentStrategyExchangeActionResponse;
  }

  public void setBusinessDevelopmentStrategyExchangeActionResponse(String businessDevelopmentStrategyExchangeActionResponse) {
    this.businessDevelopmentStrategyExchangeActionResponse = businessDevelopmentStrategyExchangeActionResponse;
  }


}

