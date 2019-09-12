package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceAnalysis;
import org.bian.dto.CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyRetrieveInputModel
 */
public class CRBusinessDevelopmentStrategyRetrieveInputModel   {
  private Object businessDevelopmentStrategyRetrieveActionTaskRecord = null;

  private String businessDevelopmentStrategyRetrieveActionRequest = null;

  private CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceReportRecord businessDevelopmentStrategyInstanceReportRecord = null;

  private CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceAnalysis businessDevelopmentStrategyInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return businessDevelopmentStrategyRetrieveActionRequest
  **/

  public String getBusinessDevelopmentStrategyRetrieveActionRequest() {
    return businessDevelopmentStrategyRetrieveActionRequest;
  }

  public void setBusinessDevelopmentStrategyRetrieveActionRequest(String businessDevelopmentStrategyRetrieveActionRequest) {
    this.businessDevelopmentStrategyRetrieveActionRequest = businessDevelopmentStrategyRetrieveActionRequest;
  }


  /**
   * Get businessDevelopmentStrategyInstanceReportRecord
   * @return businessDevelopmentStrategyInstanceReportRecord
  **/

  public CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceReportRecord getBusinessDevelopmentStrategyInstanceReportRecord() {
    return businessDevelopmentStrategyInstanceReportRecord;
  }

  public void setBusinessDevelopmentStrategyInstanceReportRecord(CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceReportRecord businessDevelopmentStrategyInstanceReportRecord) {
    this.businessDevelopmentStrategyInstanceReportRecord = businessDevelopmentStrategyInstanceReportRecord;
  }


  /**
   * Get businessDevelopmentStrategyInstanceAnalysis
   * @return businessDevelopmentStrategyInstanceAnalysis
  **/

  public CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceAnalysis getBusinessDevelopmentStrategyInstanceAnalysis() {
    return businessDevelopmentStrategyInstanceAnalysis;
  }

  public void setBusinessDevelopmentStrategyInstanceAnalysis(CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceAnalysis businessDevelopmentStrategyInstanceAnalysis) {
    this.businessDevelopmentStrategyInstanceAnalysis = businessDevelopmentStrategyInstanceAnalysis;
  }


}

