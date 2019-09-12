package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecordBusinessDevelopmentGoalRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyCaptureInputModelBusinessDevelopmentStrategyInstanceRecord
 */
public class CRBusinessDevelopmentStrategyCaptureInputModelBusinessDevelopmentStrategyInstanceRecord   {
  private String businessDevelopmentStrategyOrganization = null;

  private String businessDevelopmentStrategyBudget = null;

  private String businessDevelopmentStrategySchedule = null;

  private CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecordBusinessDevelopmentGoalRecord businessDevelopmentGoalRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Roles and responsibilities for the oversight of implementation of the strategy 
   * @return businessDevelopmentStrategyOrganization
  **/

  public String getBusinessDevelopmentStrategyOrganization() {
    return businessDevelopmentStrategyOrganization;
  }

  public void setBusinessDevelopmentStrategyOrganization(String businessDevelopmentStrategyOrganization) {
    this.businessDevelopmentStrategyOrganization = businessDevelopmentStrategyOrganization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target and actual financial budget for the strategy 
   * @return businessDevelopmentStrategyBudget
  **/

  public String getBusinessDevelopmentStrategyBudget() {
    return businessDevelopmentStrategyBudget;
  }

  public void setBusinessDevelopmentStrategyBudget(String businessDevelopmentStrategyBudget) {
    this.businessDevelopmentStrategyBudget = businessDevelopmentStrategyBudget;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual strategy implementation schedule - recording planned and actual initiatives associated with the realization of the strategy 
   * @return businessDevelopmentStrategySchedule
  **/

  public String getBusinessDevelopmentStrategySchedule() {
    return businessDevelopmentStrategySchedule;
  }

  public void setBusinessDevelopmentStrategySchedule(String businessDevelopmentStrategySchedule) {
    this.businessDevelopmentStrategySchedule = businessDevelopmentStrategySchedule;
  }


  /**
   * Get businessDevelopmentGoalRecord
   * @return businessDevelopmentGoalRecord
  **/

  public CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecordBusinessDevelopmentGoalRecord getBusinessDevelopmentGoalRecord() {
    return businessDevelopmentGoalRecord;
  }

  public void setBusinessDevelopmentGoalRecord(CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecordBusinessDevelopmentGoalRecord businessDevelopmentGoalRecord) {
    this.businessDevelopmentGoalRecord = businessDevelopmentGoalRecord;
  }


}

