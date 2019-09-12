/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Direct;

@BianRestController
public class BusinessDevelopmentApiController {

	@Autowired
	BusinessDevelopmentApiService service;
	
	@Direct.Activate
	public BianResponse<SDBusinessDevelopmentActivateOutputModel> activate(@RequestBody BianRequest<SDBusinessDevelopmentActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("initiative")
	@Direct.Capture
	public BianResponse<BQInitiativeCaptureOutputModel> captureInitiative(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInitiativeCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureInitiative(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Direct.Capture
	public BianResponse<CRBusinessDevelopmentStrategyCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessDevelopmentStrategyCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Direct.Configure
	public BianResponse<SDBusinessDevelopmentConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBusinessDevelopmentConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Direct.Create
	public BianResponse<CRBusinessDevelopmentStrategyCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRBusinessDevelopmentStrategyCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("initiative")
	@Direct.Create
	public BianResponse<BQInitiativeCreateOutputModel> createInitiative(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQInitiativeCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createInitiative(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("initiative")
	@Direct.Exchange
	public BianResponse<BQInitiativeExchangeOutputModel> exchangeInitiative(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInitiativeExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeInitiative(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Direct.Exchange
	public BianResponse<CRBusinessDevelopmentStrategyExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessDevelopmentStrategyExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Direct.Feedback
	public BianResponse<SDBusinessDevelopmentFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBusinessDevelopmentFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Direct.Grant
	public BianResponse<CRBusinessDevelopmentStrategyGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessDevelopmentStrategyGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("initiative")
	@Direct.Request
	public BianResponse<BQInitiativeRequestOutputModel> requestInitiative(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInitiativeRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestInitiative(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Direct.Request
	public BianResponse<CRBusinessDevelopmentStrategyRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessDevelopmentStrategyRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Direct.Retrieve
	public BianResponse<CRBusinessDevelopmentStrategyRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Direct.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Direct.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Direct.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("initiative")
	@Direct.Retrieve
	public BianResponse<BQInitiativeRetrieveOutputModel> retrieveInitiative(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInitiative(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Direct.RetrieveSD
	public BianResponse<SDBusinessDevelopmentRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Direct.Update
	public BianResponse<CRBusinessDevelopmentStrategyUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBusinessDevelopmentStrategyUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("initiative")
	@Direct.Update
	public BianResponse<BQInitiativeUpdateOutputModel> updateInitiative(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInitiativeUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInitiative(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
