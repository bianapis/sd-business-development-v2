package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeCreateOutputModelBQInitiativeInstanceRecord;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInitiativeCreateOutputModel
 */
public class BQInitiativeCreateOutputModel   {
  private CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;

  private String initiativeInstanceReference = null;

  private String initiativeInitiateActionReference = null;

  private Object initiativeInitiateActionRecord = null;

  private String initiativeInstanceStatus = null;

  private BQInitiativeCreateOutputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return initiativeInitiateActionReference
  **/

  public String getInitiativeInitiateActionReference() {
    return initiativeInitiateActionReference;
  }

  public void setInitiativeInitiateActionReference(String initiativeInitiateActionReference) {
    this.initiativeInitiateActionReference = initiativeInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return initiativeInitiateActionRecord
  **/

  public Object getInitiativeInitiateActionRecord() {
    return initiativeInitiateActionRecord;
  }

  public void setInitiativeInitiateActionRecord(Object initiativeInitiateActionRecord) {
    this.initiativeInitiateActionRecord = initiativeInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Initiative instance (e.g. initialised, pending, active) 
   * @return initiativeInstanceStatus
  **/

  public String getInitiativeInstanceStatus() {
    return initiativeInstanceStatus;
  }

  public void setInitiativeInstanceStatus(String initiativeInstanceStatus) {
    this.initiativeInstanceStatus = initiativeInstanceStatus;
  }


  /**
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  public BQInitiativeCreateOutputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }
  @JsonProperty("bQInitiativeInstanceRecord")
  public void setBQInitiativeInstanceRecord(BQInitiativeCreateOutputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


}

