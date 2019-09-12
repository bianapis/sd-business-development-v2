package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecordBusinessDevelopmentGoalRecord
 */
public class CRBusinessDevelopmentStrategyCreateOutputModelBusinessDevelopmentStrategyInstanceRecordBusinessDevelopmentGoalRecord   {
  private String businessDevelopmentGoalType = null;

  private String businessDevelopmentGoalDefinition = null;

  private String businessDevelopmentGoalOrganization = null;

  private String businessDevelopmentGoalResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of goal (e.g. market share, new business, relationship performance) 
   * @return businessDevelopmentGoalType
  **/

  public String getBusinessDevelopmentGoalType() {
    return businessDevelopmentGoalType;
  }

  public void setBusinessDevelopmentGoalType(String businessDevelopmentGoalType) {
    this.businessDevelopmentGoalType = businessDevelopmentGoalType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A definition of the goal, including the intended actions required to achieve the goal 
   * @return businessDevelopmentGoalDefinition
  **/

  public String getBusinessDevelopmentGoalDefinition() {
    return businessDevelopmentGoalDefinition;
  }

  public void setBusinessDevelopmentGoalDefinition(String businessDevelopmentGoalDefinition) {
    this.businessDevelopmentGoalDefinition = businessDevelopmentGoalDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Identifies the interested parties and their roles and responsibilities for the specific actions supporting the achievement of the goal 
   * @return businessDevelopmentGoalOrganization
  **/

  public String getBusinessDevelopmentGoalOrganization() {
    return businessDevelopmentGoalOrganization;
  }

  public void setBusinessDevelopmentGoalOrganization(String businessDevelopmentGoalOrganization) {
    this.businessDevelopmentGoalOrganization = businessDevelopmentGoalOrganization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Assessment of how the work is progressing towards achieving the goal, including projections of likely outcomes 
   * @return businessDevelopmentGoalResult
  **/

  public String getBusinessDevelopmentGoalResult() {
    return businessDevelopmentGoalResult;
  }

  public void setBusinessDevelopmentGoalResult(String businessDevelopmentGoalResult) {
    this.businessDevelopmentGoalResult = businessDevelopmentGoalResult;
  }


}

