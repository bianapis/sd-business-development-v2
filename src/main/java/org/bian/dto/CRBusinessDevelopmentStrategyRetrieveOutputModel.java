package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord;
import org.bian.dto.CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceAnalysis;
import org.bian.dto.CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyRetrieveOutputModel
 */
public class CRBusinessDevelopmentStrategyRetrieveOutputModel   {
  private CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecord businessDevelopmentStrategyInstanceRecord = null;

  private String businessDevelopmentStrategyRetrieveActionTaskReference = null;

  private Object businessDevelopmentStrategyRetrieveActionTaskRecord = null;

  private String businessDevelopmentStrategyRetrieveActionResponse = null;

  private CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceReportRecord businessDevelopmentStrategyInstanceReportRecord = null;

  private CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceAnalysis businessDevelopmentStrategyInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Development Strategy instance retrieve service call 
   * @return businessDevelopmentStrategyRetrieveActionTaskReference
  **/

  public String getBusinessDevelopmentStrategyRetrieveActionTaskReference() {
    return businessDevelopmentStrategyRetrieveActionTaskReference;
  }

  public void setBusinessDevelopmentStrategyRetrieveActionTaskReference(String businessDevelopmentStrategyRetrieveActionTaskReference) {
    this.businessDevelopmentStrategyRetrieveActionTaskReference = businessDevelopmentStrategyRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return businessDevelopmentStrategyRetrieveActionTaskRecord
  **/

  public Object getBusinessDevelopmentStrategyRetrieveActionTaskRecord() {
    return businessDevelopmentStrategyRetrieveActionTaskRecord;
  }

  public void setBusinessDevelopmentStrategyRetrieveActionTaskRecord(Object businessDevelopmentStrategyRetrieveActionTaskRecord) {
    this.businessDevelopmentStrategyRetrieveActionTaskRecord = businessDevelopmentStrategyRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return businessDevelopmentStrategyRetrieveActionResponse
  **/

  public String getBusinessDevelopmentStrategyRetrieveActionResponse() {
    return businessDevelopmentStrategyRetrieveActionResponse;
  }

  public void setBusinessDevelopmentStrategyRetrieveActionResponse(String businessDevelopmentStrategyRetrieveActionResponse) {
    this.businessDevelopmentStrategyRetrieveActionResponse = businessDevelopmentStrategyRetrieveActionResponse;
  }


  /**
   * Get businessDevelopmentStrategyInstanceReportRecord
   * @return businessDevelopmentStrategyInstanceReportRecord
  **/

  public CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceReportRecord getBusinessDevelopmentStrategyInstanceReportRecord() {
    return businessDevelopmentStrategyInstanceReportRecord;
  }

  public void setBusinessDevelopmentStrategyInstanceReportRecord(CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceReportRecord businessDevelopmentStrategyInstanceReportRecord) {
    this.businessDevelopmentStrategyInstanceReportRecord = businessDevelopmentStrategyInstanceReportRecord;
  }


  /**
   * Get businessDevelopmentStrategyInstanceAnalysis
   * @return businessDevelopmentStrategyInstanceAnalysis
  **/

  public CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceAnalysis getBusinessDevelopmentStrategyInstanceAnalysis() {
    return businessDevelopmentStrategyInstanceAnalysis;
  }

  public void setBusinessDevelopmentStrategyInstanceAnalysis(CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceAnalysis businessDevelopmentStrategyInstanceAnalysis) {
    this.businessDevelopmentStrategyInstanceAnalysis = businessDevelopmentStrategyInstanceAnalysis;
  }


}

