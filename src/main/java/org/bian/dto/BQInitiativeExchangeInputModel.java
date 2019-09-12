package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyExchangeInputModelBusinessDevelopmentStrategyExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQInitiativeExchangeInputModel
 */
public class BQInitiativeExchangeInputModel   {
  private String businessDevelopmentStrategyInstanceReference = null;

  private String initiativeInstanceReference = null;

  private Object initiativeExchangeActionTaskRecord = null;

  private CRBusinessDevelopmentStrategyExchangeInputModelBusinessDevelopmentStrategyExchangeActionRequest initiativeExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Business Development Strategy instance 
   * @return businessDevelopmentStrategyInstanceReference
  **/

  public String getBusinessDevelopmentStrategyInstanceReference() {
    return businessDevelopmentStrategyInstanceReference;
  }

  public void setBusinessDevelopmentStrategyInstanceReference(String businessDevelopmentStrategyInstanceReference) {
    this.businessDevelopmentStrategyInstanceReference = businessDevelopmentStrategyInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Initiative instance 
   * @return initiativeInstanceReference
  **/

  public String getInitiativeInstanceReference() {
    return initiativeInstanceReference;
  }

  public void setInitiativeInstanceReference(String initiativeInstanceReference) {
    this.initiativeInstanceReference = initiativeInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return initiativeExchangeActionTaskRecord
  **/

  public Object getInitiativeExchangeActionTaskRecord() {
    return initiativeExchangeActionTaskRecord;
  }

  public void setInitiativeExchangeActionTaskRecord(Object initiativeExchangeActionTaskRecord) {
    this.initiativeExchangeActionTaskRecord = initiativeExchangeActionTaskRecord;
  }


  /**
   * Get initiativeExchangeActionRequest
   * @return initiativeExchangeActionRequest
  **/

  public CRBusinessDevelopmentStrategyExchangeInputModelBusinessDevelopmentStrategyExchangeActionRequest getInitiativeExchangeActionRequest() {
    return initiativeExchangeActionRequest;
  }

  public void setInitiativeExchangeActionRequest(CRBusinessDevelopmentStrategyExchangeInputModelBusinessDevelopmentStrategyExchangeActionRequest initiativeExchangeActionRequest) {
    this.initiativeExchangeActionRequest = initiativeExchangeActionRequest;
  }


}

