package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceAnalysis
 */
public class CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceAnalysis   {
  private String businessDevelopmentStrategyInstanceAnalysisReference = null;

  private String businessDevelopmentStrategyInstanceAnalysisReportType = null;

  private String businessDevelopmentStrategyInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return businessDevelopmentStrategyInstanceAnalysisReference
  **/

  public String getBusinessDevelopmentStrategyInstanceAnalysisReference() {
    return businessDevelopmentStrategyInstanceAnalysisReference;
  }

  public void setBusinessDevelopmentStrategyInstanceAnalysisReference(String businessDevelopmentStrategyInstanceAnalysisReference) {
    this.businessDevelopmentStrategyInstanceAnalysisReference = businessDevelopmentStrategyInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return businessDevelopmentStrategyInstanceAnalysisParameters
  **/

  public String getBusinessDevelopmentStrategyInstanceAnalysisParameters() {
    return businessDevelopmentStrategyInstanceAnalysisParameters;
  }

  public void setBusinessDevelopmentStrategyInstanceAnalysisParameters(String businessDevelopmentStrategyInstanceAnalysisParameters) {
    this.businessDevelopmentStrategyInstanceAnalysisParameters = businessDevelopmentStrategyInstanceAnalysisParameters;
  }


}

