package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeCreateInputModelBQInitiativeInstanceRecord;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInitiativeCreateInputModel
 */
public class BQInitiativeCreateInputModel   {
  private CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;

  private String businessDevelopmentStrategyInstanceReference = null;

  private Object initiativeInitiateActionRecord = null;

  private BQInitiativeCreateInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;


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
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  public BQInitiativeCreateInputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeCreateInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


}

