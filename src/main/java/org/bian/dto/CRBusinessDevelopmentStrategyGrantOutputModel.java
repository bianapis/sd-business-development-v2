package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyGrantOutputModel
 */
public class CRBusinessDevelopmentStrategyGrantOutputModel   {
  private String businessDevelopmentStrategyGrantActionTaskReference = null;

  private Object businessDevelopmentStrategyGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRBusinessDevelopmentStrategyGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Development Strategy instance grant service call 
   * @return businessDevelopmentStrategyGrantActionTaskReference
  **/

  public String getBusinessDevelopmentStrategyGrantActionTaskReference() {
    return businessDevelopmentStrategyGrantActionTaskReference;
  }

  public void setBusinessDevelopmentStrategyGrantActionTaskReference(String businessDevelopmentStrategyGrantActionTaskReference) {
    this.businessDevelopmentStrategyGrantActionTaskReference = businessDevelopmentStrategyGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRBusinessDevelopmentStrategyGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRBusinessDevelopmentStrategyGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

