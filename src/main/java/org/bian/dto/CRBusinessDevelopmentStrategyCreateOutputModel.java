package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyCreateOutputModel
 */
public class CRBusinessDevelopmentStrategyCreateOutputModel   {
  private String businessDevelopmentStrategyInstanceReference = null;

  private String businessDevelopmentStrategyCreateActionReference = null;

  private Object businessDevelopmentStrategyCreateActionRecord = null;

  private String businessDevelopmentStrategyInstanceStatus = null;

  private CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return businessDevelopmentStrategyCreateActionReference
  **/

  public String getBusinessDevelopmentStrategyCreateActionReference() {
    return businessDevelopmentStrategyCreateActionReference;
  }

  public void setBusinessDevelopmentStrategyCreateActionReference(String businessDevelopmentStrategyCreateActionReference) {
    this.businessDevelopmentStrategyCreateActionReference = businessDevelopmentStrategyCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return businessDevelopmentStrategyCreateActionRecord
  **/

  public Object getBusinessDevelopmentStrategyCreateActionRecord() {
    return businessDevelopmentStrategyCreateActionRecord;
  }

  public void setBusinessDevelopmentStrategyCreateActionRecord(Object businessDevelopmentStrategyCreateActionRecord) {
    this.businessDevelopmentStrategyCreateActionRecord = businessDevelopmentStrategyCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Business Development Strategy instance (e.g. initialised, pending, active) 
   * @return businessDevelopmentStrategyInstanceStatus
  **/

  public String getBusinessDevelopmentStrategyInstanceStatus() {
    return businessDevelopmentStrategyInstanceStatus;
  }

  public void setBusinessDevelopmentStrategyInstanceStatus(String businessDevelopmentStrategyInstanceStatus) {
    this.businessDevelopmentStrategyInstanceStatus = businessDevelopmentStrategyInstanceStatus;
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


}

