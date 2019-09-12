package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyUpdateOutputModel
 */
public class CRBusinessDevelopmentStrategyUpdateOutputModel   {
  private CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;

  private String businessDevelopmentStrategyUpdateActionTaskReference = null;

  private Object businessDevelopmentStrategyUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return businessDevelopmentStrategyUpdateActionTaskReference
  **/

  public String getBusinessDevelopmentStrategyUpdateActionTaskReference() {
    return businessDevelopmentStrategyUpdateActionTaskReference;
  }

  public void setBusinessDevelopmentStrategyUpdateActionTaskReference(String businessDevelopmentStrategyUpdateActionTaskReference) {
    this.businessDevelopmentStrategyUpdateActionTaskReference = businessDevelopmentStrategyUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return businessDevelopmentStrategyUpdateActionTaskRecord
  **/

  public Object getBusinessDevelopmentStrategyUpdateActionTaskRecord() {
    return businessDevelopmentStrategyUpdateActionTaskRecord;
  }

  public void setBusinessDevelopmentStrategyUpdateActionTaskRecord(Object businessDevelopmentStrategyUpdateActionTaskRecord) {
    this.businessDevelopmentStrategyUpdateActionTaskRecord = businessDevelopmentStrategyUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

