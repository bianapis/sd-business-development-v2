package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyGrantInputModel
 */
public class CRBusinessDevelopmentStrategyGrantInputModel   {
  private String businessDevelopmentServicingSessionReference = null;

  private String businessDevelopmentStrategyInstanceReference = null;

  private Object businessDevelopmentStrategyGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRBusinessDevelopmentStrategyGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return businessDevelopmentStrategyGrantActionTaskRecord
  **/

  public Object getBusinessDevelopmentStrategyGrantActionTaskRecord() {
    return businessDevelopmentStrategyGrantActionTaskRecord;
  }

  public void setBusinessDevelopmentStrategyGrantActionTaskRecord(Object businessDevelopmentStrategyGrantActionTaskRecord) {
    this.businessDevelopmentStrategyGrantActionTaskRecord = businessDevelopmentStrategyGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRBusinessDevelopmentStrategyGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRBusinessDevelopmentStrategyGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

