package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateInputModelBusinessDevelopmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyCreateInputModel
 */
public class CRBusinessDevelopmentStrategyCreateInputModel   {
  private String businessDevelopmentServicingSessionReference = null;

  private Object businessDevelopmentStrategyCreateActionRecord = null;

  private String businessDevelopmentStrategyInstanceStatus = null;

  private CRBusinessDevelopmentStrategyCreateInputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;


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

  public CRBusinessDevelopmentStrategyCreateInputModelBusinessDevelopmentStrategyInstanceRecord getBusinessDevelopmentStrategyInstanceRecord() {
    return businessDevelopmentStrategyInstanceRecord;
  }

  public void setBusinessDevelopmentStrategyInstanceRecord(CRBusinessDevelopmentStrategyCreateInputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord) {
    this.businessDevelopmentStrategyInstanceRecord = businessDevelopmentStrategyInstanceRecord;
  }


}

