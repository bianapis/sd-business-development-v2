/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BusinessDevelopmentApiServiceImpl implements BusinessDevelopmentApiService {

	public SDBusinessDevelopmentActivateOutputModel activate(SDBusinessDevelopmentActivateInputModel request){
		return JsonReader.read("activate-SDBusinessDevelopmentActivateOutputModel.json",new TypeReference<SDBusinessDevelopmentActivateOutputModel>(){});
	}
	
	public BQInitiativeCaptureOutputModel captureInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeCaptureInputModel request){
		return JsonReader.read("capture-BQInitiativeCaptureOutputModel.json",new TypeReference<BQInitiativeCaptureOutputModel>(){});
	}
	
	public CRBusinessDevelopmentStrategyCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyCaptureInputModel request){
		return JsonReader.read("capture-CRBusinessDevelopmentStrategyCaptureOutputModel.json",new TypeReference<CRBusinessDevelopmentStrategyCaptureOutputModel>(){});
	}
	
	public SDBusinessDevelopmentConfigureOutputModel configure(String sdReferenceId, SDBusinessDevelopmentConfigureInputModel request){
		return JsonReader.read("configure-SDBusinessDevelopmentConfigureOutputModel.json",new TypeReference<SDBusinessDevelopmentConfigureOutputModel>(){});
	}
	
	public CRBusinessDevelopmentStrategyCreateOutputModel create(String sdReferenceId, CRBusinessDevelopmentStrategyCreateInputModel request){
		return JsonReader.read("create-CRBusinessDevelopmentStrategyCreateOutputModel.json",new TypeReference<CRBusinessDevelopmentStrategyCreateOutputModel>(){});
	}
	
	public BQInitiativeCreateOutputModel createInitiative(String sdReferenceId, String crReferenceId, BQInitiativeCreateInputModel request){
		return JsonReader.read("create-BQInitiativeCreateOutputModel.json",new TypeReference<BQInitiativeCreateOutputModel>(){});
	}
	
	public BQInitiativeExchangeOutputModel exchangeInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeExchangeInputModel request){
		return JsonReader.read("exchange-BQInitiativeExchangeOutputModel.json",new TypeReference<BQInitiativeExchangeOutputModel>(){});
	}
	
	public CRBusinessDevelopmentStrategyExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyExchangeInputModel request){
		return JsonReader.read("exchange-CRBusinessDevelopmentStrategyExchangeOutputModel.json",new TypeReference<CRBusinessDevelopmentStrategyExchangeOutputModel>(){});
	}
	
	public SDBusinessDevelopmentFeedbackOutputModel feedback(String sdReferenceId, SDBusinessDevelopmentFeedbackInputModel request){
		return JsonReader.read("feedback-SDBusinessDevelopmentFeedbackOutputModel.json",new TypeReference<SDBusinessDevelopmentFeedbackOutputModel>(){});
	}
	
	public CRBusinessDevelopmentStrategyGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyGrantInputModel request){
		return JsonReader.read("grant-CRBusinessDevelopmentStrategyGrantOutputModel.json",new TypeReference<CRBusinessDevelopmentStrategyGrantOutputModel>(){});
	}
	
	public BQInitiativeRequestOutputModel requestInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeRequestInputModel request){
		return JsonReader.read("request-BQInitiativeRequestOutputModel.json",new TypeReference<BQInitiativeRequestOutputModel>(){});
	}
	
	public CRBusinessDevelopmentStrategyRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyRequestInputModel request){
		return JsonReader.read("request-CRBusinessDevelopmentStrategyRequestOutputModel.json",new TypeReference<CRBusinessDevelopmentStrategyRequestOutputModel>(){});
	}
	
	public CRBusinessDevelopmentStrategyRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBusinessDevelopmentStrategyRetrieveOutputModel.json",new TypeReference<CRBusinessDevelopmentStrategyRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQInitiativeRetrieveOutputModel retrieveInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInitiativeRetrieveOutputModel.json",new TypeReference<BQInitiativeRetrieveOutputModel>(){});
	}
	
	public SDBusinessDevelopmentRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDBusinessDevelopmentRetrieveOutputModel.json",new TypeReference<SDBusinessDevelopmentRetrieveOutputModel>(){});
	}
	
	public CRBusinessDevelopmentStrategyUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBusinessDevelopmentStrategyUpdateInputModel request){
		return JsonReader.read("update-CRBusinessDevelopmentStrategyUpdateOutputModel.json",new TypeReference<CRBusinessDevelopmentStrategyUpdateOutputModel>(){});
	}
	
	public BQInitiativeUpdateOutputModel updateInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeUpdateInputModel request){
		return JsonReader.read("update-BQInitiativeUpdateOutputModel.json",new TypeReference<BQInitiativeUpdateOutputModel>(){});
	}
	
}
