package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceReportRecord
 */
public class CRBusinessDevelopmentStrategyRetrieveInputModelBusinessDevelopmentStrategyInstanceReportRecord   {
  private String businessDevelopmentStrategyInstanceReportReference = null;

  private String businessDevelopmentStrategyInstanceReportType = null;

  private String businessDevelopmentStrategyInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return businessDevelopmentStrategyInstanceReportReference
  **/

  public String getBusinessDevelopmentStrategyInstanceReportReference() {
    return businessDevelopmentStrategyInstanceReportReference;
  }

  public void setBusinessDevelopmentStrategyInstanceReportReference(String businessDevelopmentStrategyInstanceReportReference) {
    this.businessDevelopmentStrategyInstanceReportReference = businessDevelopmentStrategyInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return businessDevelopmentStrategyInstanceReportType
  **/

  public String getBusinessDevelopmentStrategyInstanceReportType() {
    return businessDevelopmentStrategyInstanceReportType;
  }

  public void setBusinessDevelopmentStrategyInstanceReportType(String businessDevelopmentStrategyInstanceReportType) {
    this.businessDevelopmentStrategyInstanceReportType = businessDevelopmentStrategyInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return businessDevelopmentStrategyInstanceReportParameters
  **/

  public String getBusinessDevelopmentStrategyInstanceReportParameters() {
    return businessDevelopmentStrategyInstanceReportParameters;
  }

  public void setBusinessDevelopmentStrategyInstanceReportParameters(String businessDevelopmentStrategyInstanceReportParameters) {
    this.businessDevelopmentStrategyInstanceReportParameters = businessDevelopmentStrategyInstanceReportParameters;
  }


}

