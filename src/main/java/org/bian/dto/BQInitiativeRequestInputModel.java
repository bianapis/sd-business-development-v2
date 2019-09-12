package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeRequestInputModelBQInitiativeInstanceRecord;
import org.bian.dto.CRBusinessDevelopmentStrategyRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQInitiativeRequestInputModel
 */
public class BQInitiativeRequestInputModel   {
  private String businessDevelopmentStrategyInstanceReference = null;

  private String initiativeInstanceReference = null;

  private BQInitiativeRequestInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;

  private Object initiativeRequestActionTaskRecord = null;

  private CRBusinessDevelopmentStrategyRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  public BQInitiativeRequestInputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeRequestInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return initiativeRequestActionTaskRecord
  **/

  public Object getInitiativeRequestActionTaskRecord() {
    return initiativeRequestActionTaskRecord;
  }

  public void setInitiativeRequestActionTaskRecord(Object initiativeRequestActionTaskRecord) {
    this.initiativeRequestActionTaskRecord = initiativeRequestActionTaskRecord;
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

