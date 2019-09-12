/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface BusinessDevelopmentApiService {

	SDBusinessDevelopmentActivateOutputModel activate(SDBusinessDevelopmentActivateInputModel request);
	
	BQInitiativeCaptureOutputModel captureInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeCaptureInputModel request);
	
	CRBusinessDevelopmentStrategyCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyCaptureInputModel request);
	
	SDBusinessDevelopmentConfigureOutputModel configure(String sdReferenceId, SDBusinessDevelopmentConfigureInputModel request);
	
	CRBusinessDevelopmentStrategyCreateOutputModel create(String sdReferenceId, CRBusinessDevelopmentStrategyCreateInputModel request);
	
	BQInitiativeCreateOutputModel createInitiative(String sdReferenceId, String crReferenceId, BQInitiativeCreateInputModel request);
	
	BQInitiativeExchangeOutputModel exchangeInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeExchangeInputModel request);
	
	CRBusinessDevelopmentStrategyExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyExchangeInputModel request);
	
	SDBusinessDevelopmentFeedbackOutputModel feedback(String sdReferenceId, SDBusinessDevelopmentFeedbackInputModel request);
	
	CRBusinessDevelopmentStrategyGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyGrantInputModel request);
	
	BQInitiativeRequestOutputModel requestInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeRequestInputModel request);
	
	CRBusinessDevelopmentStrategyRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyRequestInputModel request);
	
	CRBusinessDevelopmentStrategyRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQInitiativeRetrieveOutputModel retrieveInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDBusinessDevelopmentRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRBusinessDevelopmentStrategyUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyUpdateInputModel request);
	
	BQInitiativeUpdateOutputModel updateInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeUpdateInputModel request);
	
}
