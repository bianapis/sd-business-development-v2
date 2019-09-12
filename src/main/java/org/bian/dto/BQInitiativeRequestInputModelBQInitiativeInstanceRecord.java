package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeCreateInputModelBQInitiativeInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQInitiativeRequestInputModelBQInitiativeInstanceRecord
 */
public class BQInitiativeRequestInputModelBQInitiativeInstanceRecord   {
  private String businessDevelopmentInitiativeBusinessUnitReference = null;

  private String businessDevelopmentInitiativeType = null;

  private String businessDevelopmentInitiativeDescription = null;

  private String businessDevelopmentInitiativeSchedule = null;

  private String businessDevelopmentInitiativeWorkProducts = null;

  private String businessDevelopmentInitiativeResult = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String correspondenceInstanceReference = null;

  private BQInitiativeCreateInputModelBQInitiativeInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit responsible for implementing a specific initiative supporting the business development strategy 
   * @return businessDevelopmentInitiativeBusinessUnitReference
  **/

  public String getBusinessDevelopmentInitiativeBusinessUnitReference() {
    return businessDevelopmentInitiativeBusinessUnitReference;
  }

  public void setBusinessDevelopmentInitiativeBusinessUnitReference(String businessDevelopmentInitiativeBusinessUnitReference) {
    this.businessDevelopmentInitiativeBusinessUnitReference = businessDevelopmentInitiativeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of initiative (e.g. development project, acquisition, campaign, media communications) 
   * @return businessDevelopmentInitiativeType
  **/

  public String getBusinessDevelopmentInitiativeType() {
    return businessDevelopmentInitiativeType;
  }

  public void setBusinessDevelopmentInitiativeType(String businessDevelopmentInitiativeType) {
    this.businessDevelopmentInitiativeType = businessDevelopmentInitiativeType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the initiative, including planned actions, deliverables and intended outcomes 
   * @return businessDevelopmentInitiativeDescription
  **/

  public String getBusinessDevelopmentInitiativeDescription() {
    return businessDevelopmentInitiativeDescription;
  }

  public void setBusinessDevelopmentInitiativeDescription(String businessDevelopmentInitiativeDescription) {
    this.businessDevelopmentInitiativeDescription = businessDevelopmentInitiativeDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Planned and actual dates for activities making up the initiative. Any necessary details describing the purpose or reference properties of the transaction 
   * @return businessDevelopmentInitiativeSchedule
  **/

  public String getBusinessDevelopmentInitiativeSchedule() {
    return businessDevelopmentInitiativeSchedule;
  }

  public void setBusinessDevelopmentInitiativeSchedule(String businessDevelopmentInitiativeSchedule) {
    this.businessDevelopmentInitiativeSchedule = businessDevelopmentInitiativeSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, assessments etc. arising from the work 
   * @return businessDevelopmentInitiativeWorkProducts
  **/

  public String getBusinessDevelopmentInitiativeWorkProducts() {
    return businessDevelopmentInitiativeWorkProducts;
  }

  public void setBusinessDevelopmentInitiativeWorkProducts(String businessDevelopmentInitiativeWorkProducts) {
    this.businessDevelopmentInitiativeWorkProducts = businessDevelopmentInitiativeWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An assessment of the results/impact of the business development initiative 
   * @return businessDevelopmentInitiativeResult
  **/

  public String getBusinessDevelopmentInitiativeResult() {
    return businessDevelopmentInitiativeResult;
  }

  public void setBusinessDevelopmentInitiativeResult(String businessDevelopmentInitiativeResult) {
    this.businessDevelopmentInitiativeResult = businessDevelopmentInitiativeResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents (when appropriate) 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondence generated by the initiative 
   * @return correspondenceInstanceReference
  **/

  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public BQInitiativeCreateInputModelBQInitiativeInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(BQInitiativeCreateInputModelBQInitiativeInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

