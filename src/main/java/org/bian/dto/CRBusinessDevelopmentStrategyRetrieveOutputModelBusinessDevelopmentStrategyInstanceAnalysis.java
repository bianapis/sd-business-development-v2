package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceAnalysis
 */
public class CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceAnalysis   {
  private String businessDevelopmentStrategyInstanceAnalysisData = null;

  private String businessDevelopmentStrategyInstanceAnalysisReportType = null;

  private Object businessDevelopmentStrategyInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return businessDevelopmentStrategyInstanceAnalysisData
  **/

  public String getBusinessDevelopmentStrategyInstanceAnalysisData() {
    return businessDevelopmentStrategyInstanceAnalysisData;
  }

  public void setBusinessDevelopmentStrategyInstanceAnalysisData(String businessDevelopmentStrategyInstanceAnalysisData) {
    this.businessDevelopmentStrategyInstanceAnalysisData = businessDevelopmentStrategyInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return businessDevelopmentStrategyInstanceAnalysisReportType
  **/

  public String getBusinessDevelopmentStrategyInstanceAnalysisReportType() {
    return businessDevelopmentStrategyInstanceAnalysisReportType;
  }

  public void setBusinessDevelopmentStrategyInstanceAnalysisReportType(String businessDevelopmentStrategyInstanceAnalysisReportType) {
    this.businessDevelopmentStrategyInstanceAnalysisReportType = businessDevelopmentStrategyInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return businessDevelopmentStrategyInstanceAnalysisReport
  **/

  public Object getBusinessDevelopmentStrategyInstanceAnalysisReport() {
    return businessDevelopmentStrategyInstanceAnalysisReport;
  }

  public void setBusinessDevelopmentStrategyInstanceAnalysisReport(Object businessDevelopmentStrategyInstanceAnalysisReport) {
    this.businessDevelopmentStrategyInstanceAnalysisReport = businessDevelopmentStrategyInstanceAnalysisReport;
  }


}

