package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceReportRecord
 */
public class CRBusinessDevelopmentStrategyRetrieveOutputModelBusinessDevelopmentStrategyInstanceReportRecord   {
  private String businessDevelopmentStrategyInstanceReportData = null;

  private String businessDevelopmentStrategyInstanceReportType = null;

  private Object businessDevelopmentStrategyInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return businessDevelopmentStrategyInstanceReportData
  **/

  public String getBusinessDevelopmentStrategyInstanceReportData() {
    return businessDevelopmentStrategyInstanceReportData;
  }

  public void setBusinessDevelopmentStrategyInstanceReportData(String businessDevelopmentStrategyInstanceReportData) {
    this.businessDevelopmentStrategyInstanceReportData = businessDevelopmentStrategyInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return businessDevelopmentStrategyInstanceReport
  **/

  public Object getBusinessDevelopmentStrategyInstanceReport() {
    return businessDevelopmentStrategyInstanceReport;
  }

  public void setBusinessDevelopmentStrategyInstanceReport(Object businessDevelopmentStrategyInstanceReport) {
    this.businessDevelopmentStrategyInstanceReport = businessDevelopmentStrategyInstanceReport;
  }


}

