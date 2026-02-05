package com.huaweicloud.sdk.secmaster.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.secmaster.v1.model.AlterResourceTagsInBatchesRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.AopInstanceEventData;
import com.huaweicloud.sdk.secmaster.v1.model.AopInstanceUpdateDataPojo;
import com.huaweicloud.sdk.secmaster.v1.model.AopworkflowVersionValidateRes;
import com.huaweicloud.sdk.secmaster.v1.model.ApprovePlaybookInfo;
import com.huaweicloud.sdk.secmaster.v1.model.AuditLogInfo;
import com.huaweicloud.sdk.secmaster.v1.model.AuthorizeHandlerRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCatalogueRequestPojo;
import com.huaweicloud.sdk.secmaster.v1.model.BatchChangeAlertRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDataobjectRelationsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDatapanelObjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDatapanelObjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchSearchMetricHitsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchSearchMetricHitsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.BatchSearchMetricHitsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchTagResourcesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchTagResourcesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchUntagResourcesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchUntagResourcesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchUpdateCatalogueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchUpdateCatalogueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CatalogueDeleteRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CatalogueRequestPojo;
import com.huaweicloud.sdk.secmaster.v1.model.CatalogueUpdateRequestPojo;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangePlaybookInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangePlaybookInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeResourceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeResourceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeResourceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CommonDataObjectExportRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ConfigResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ConfigurationInfoDto;
import com.huaweicloud.sdk.secmaster.v1.model.CopyMappingRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CopyMappingRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CopyMappingResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CopyPlaybookInfo;
import com.huaweicloud.sdk.secmaster.v1.model.CopyPlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CopyPlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CountResourceInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CountResourceInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAction;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleSimulationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleSimulationRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleSimulationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAnalysisRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowInfo;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionApprovelInfo;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionApprovelRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionApprovelResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionInfo;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAssetsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateBatchOrderAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateBatchOrderAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCatalogueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCatalogueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateChannelDto;
import com.huaweicloud.sdk.secmaster.v1.model.CreateClassifierRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateClassifierResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCloudLogResourceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectConfigRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectConfigResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectConfigV2RequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelGroupRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelGroupResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelOperationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelOperationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorFilesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorFilesRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorFilesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorParserRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorParserResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateComponentTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateComponentTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationApplicationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationApplicationRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationApplicationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationDictionariesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationDictionariesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConnectionDto;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataclassTypeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataclassTypeRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataclassTypeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectRelationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectRelationRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectRelationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataspaceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDictionaryRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDpeClassifyRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDpeMappingRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateIncidentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateIncidentRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateIncidentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateLayoutRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateLayoutResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateLayoutWizardRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateLayoutWizardResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateMapperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateMapperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateMetricRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateMetricRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateMetricResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateModuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateModuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateNoteRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateNoteRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateNoteResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateParserDto;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookApproveRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookApproveResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookInfo;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookVersionInfo;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePreProcessRulesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePreProcessRulesRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePreProcessRulesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateReportRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateReportRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateReportResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateResourceConfigRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateResourceConfigResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateRetryPolicyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateRetryPolicyRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateRetryPolicyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateRuleInfo;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchAnalysisRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchAnalysisResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchConditionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchConditionRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchConditionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateServiceAgencyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateServiceAgencyRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateServiceAgencyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperDelegateAuthRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperDelegateAuthRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperDelegateAuthResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSubscriptionOrderRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSubscriptionOrderResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateTemplateReq;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkflowInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkflowInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkspaceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DataObjectBatchCreateForm;
import com.huaweicloud.sdk.secmaster.v1.model.DataObjectBatchUpdateForm;
import com.huaweicloud.sdk.secmaster.v1.model.DataObjectCreateForm;
import com.huaweicloud.sdk.secmaster.v1.model.DataObjectCreateUpdateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DataObjectDeleteForm;
import com.huaweicloud.sdk.secmaster.v1.model.DataobjectSearch;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAlertRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAlertRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAlertResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAopWorkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAopWorkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAopWorkflowVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAopWorkflowVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCatalogueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCatalogueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteClassifierRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteClassifierResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCollectorChannelGroupRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCollectorChannelGroupResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCollectorChannelRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCollectorChannelResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCollectorConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCollectorConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCollectorParserRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteCollectorParserResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteComponentTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteComponentTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteConfigurationDictionariesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteConfigurationDictionariesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataclassTypeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataclassTypeRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataclassTypeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataobjectRelationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataobjectRelationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataobjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataobjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDictionaryRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIndicatorRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteLayoutWizardRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteLayoutWizardResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteLayoutsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteLayoutsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteLtsCloudLogRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteLtsCloudLogResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteMappingInfoRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteMappingInfoResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteMetricsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteMetricsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteModuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteModuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteNodeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteNodeRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteNodeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteNoteRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteNotesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteNotesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePipeConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePipeConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePipeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePipeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePoliciesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePoliciesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeletePolicyRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteRelationResource;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteReportRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteReportResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteResourceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteSearchConditionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteSearchConditionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteShipperRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteSingleMapperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteSingleMapperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteSubscriptionOrderRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteSubscriptionOrderResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteTagsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteTagsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DisableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DisableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadAlertTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadAlertTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadAttachmentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadAttachmentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadIncidentTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadIncidentTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadIndicatorTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadIndicatorTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadResourceTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadResourceTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadVulnerabilityTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DownloadVulnerabilityTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.EmailStatusInfo;
import com.huaweicloud.sdk.secmaster.v1.model.EnableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.EnableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.EnableConsumptionRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.EnableDataclassTypeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.EnableDataclassTypeRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.EnableDataclassTypeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteLayoutRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteLayoutRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteLayoutResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteReportActionInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteReportActionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteReportActionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAlertsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAopworkflowInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAopworkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAopworkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportCollectorParserRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportCollectorParserResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportDataobjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportDataobjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIncidentsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIndicatorsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIndicatorsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIndicatorsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportParserDto;
import com.huaweicloud.sdk.secmaster.v1.model.ExportPlaybook;
import com.huaweicloud.sdk.secmaster.v1.model.ExportPlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportPlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportResourcesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportResourcesRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ExportResourcesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportVulnerabilitiesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportVulnerabilitiesRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ExportVulnerabilitiesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.Group;
import com.huaweicloud.sdk.secmaster.v1.model.GroupDto;
import com.huaweicloud.sdk.secmaster.v1.model.HandleShipperAuthorizationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.HandleShipperAuthorizationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAlertsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAopworkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAopworkflowRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAopworkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportCollectorParserRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportCollectorParserRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportCollectorParserResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportDataobjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportDataobjectsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportDataobjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIncidentsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIndicatorsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIndicatorsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIndicatorsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportPlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportPlaybookRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportPlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportResourceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportResourceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportResourceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportVulnerabilitiesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportVulnerabilitiesRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ImportVulnerabilitiesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.IndicatorCreateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.IndicatorListSearchRequest;
import com.huaweicloud.sdk.secmaster.v1.model.LayoutCreateRequestPojo;
import com.huaweicloud.sdk.secmaster.v1.model.LayoutDeleteRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.LayoutSearch;
import com.huaweicloud.sdk.secmaster.v1.model.LayoutUpdateRequestPojo;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertRuleMetricsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertRuleMetricsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertRuleTemplateMetricsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertRuleTemplateMetricsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertRuleTemplatesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertRuleTemplatesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertRulesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertRulesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListAllSecondCatalogueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListAllSecondCatalogueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListAopWorkflowInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListAopWorkflowInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListAopWorkflowVersionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListAopWorkflowVersionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCatalogueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCatalogueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCloudLogAliasRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCloudLogAliasResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCloudLogManagesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCloudLogManagesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCloudLogPlatformRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCloudLogPlatformResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCloudLogResourcesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCloudLogResourcesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectConfigRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectConfigResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorChannelGroupRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorChannelGroupResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorChannelsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorChannelsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorConnectionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorConnectionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorInstancesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorInstancesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorModuleRestrictionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorModuleRestrictionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorModuleTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorModuleTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorNodeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorNodeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorParserTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorParserTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorParsersRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListCollectorParsersResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentActionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentActionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentConfigurationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentConfigurationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentTemplatesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentTemplatesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListComponentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListConfigurationDictionariesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListConfigurationDictionariesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListConnectionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListConnectionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataclassFieldsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataclassFieldsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataclassRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataclassResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataobjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataobjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListDatapanelObjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListDatapanelObjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataspacesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListDataspacesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListHistogramsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ListHistoryComponentConfigurationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListHistoryComponentConfigurationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListIndicatorsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListIndicatorsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListInstallationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListInstallationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListIsapComponentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListIsapComponentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListLayoutRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListLayoutResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListLayoutWizardsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListLayoutWizardsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListLogsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ListMetricsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListMetricsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListModulesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListModulesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListNodesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListNodesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListNotesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListNotesRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ListNotesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListPipesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListPipesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookActionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookActionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookApprovesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookApprovesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookAuditLogsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookAuditLogsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookInstancesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookInstancesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookVersionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybookVersionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybooksRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListPlaybooksResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListProjectTagRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListProjectTagResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListRecipientsStatusRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListRecipientsStatusRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ListRecipientsStatusResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListReportsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListReportsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListResourceInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListResourceInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListResourceTagRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListResourceTagResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListRunningNodesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListRunningNodesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListSearchConditionsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListSearchConditionsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListSearchHistogramsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListSearchHistogramsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListSearchLogsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListSearchLogsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListServiceAgencyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListServiceAgencyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListShipperAuthorizationsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListShipperAuthorizationsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListShippersRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListShippersResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListSubscriptionGlobalOrderRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListSubscriptionGlobalOrderResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListSubscriptionOrderRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListSubscriptionOrderResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListSubscriptionProductRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListSubscriptionProductResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListTasksRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListTasksResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListVpcEndpointServiceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListVpcEndpointServiceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListVulnerabilitiesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListVulnerabilitiesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListWorkflowsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListWorkflowsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ModifyActionInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ModifyAopWorkflowInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ModifyAopWorkflowVersionInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ModifyPlaybookInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ModifyPlaybookVersionInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ModifyRuleInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ModifyTaskInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ModuleCreateRequestPojo;
import com.huaweicloud.sdk.secmaster.v1.model.ModuleTemplateFieldDto;
import com.huaweicloud.sdk.secmaster.v1.model.ModuleUpdateRequestPojo;
import com.huaweicloud.sdk.secmaster.v1.model.NodeExpansionInfo;
import com.huaweicloud.sdk.secmaster.v1.model.OperationDto;
import com.huaweicloud.sdk.secmaster.v1.model.OperationPlaybookInfo;
import com.huaweicloud.sdk.secmaster.v1.model.OrderAlert;
import com.huaweicloud.sdk.secmaster.v1.model.OrderInfoReq;
import com.huaweicloud.sdk.secmaster.v1.model.PauseShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.PauseShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.QueryDpeMapperRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.QueryDpeRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.QueryResourceInstanceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ReportInfo;
import com.huaweicloud.sdk.secmaster.v1.model.ResourceDataobjectSearch;
import com.huaweicloud.sdk.secmaster.v1.model.ResumeShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ResumeShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.RetryShipperAuthorizationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.RetryShipperAuthorizationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.RetryShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.RetryShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.SearchInfo;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRecordByPolicyIdRequest;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRecordByPolicyIdResponse;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRecordRequest;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRecordResponse;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAlertRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAlertResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAlertRuleTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAlertRuleTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAopWorkflowInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAopWorkflowInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAopWorkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAopWorkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAopWorkflowVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAopWorkflowVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAttachmentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowAttachmentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowClassifierInfoRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowClassifierInfoResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowCloudLogTenantWhitelistRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowCloudLogTenantWhitelistResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowCollectorChannelRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowCollectorChannelResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowCollectorConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowCollectorConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowCollectorParserRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowCollectorParserResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowComponentActionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowComponentActionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowComponentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowComponentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowComponentTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowComponentTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowDataClassInfoRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowDataClassInfoResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowDataobjectRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowDataobjectResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowDatapanelObjectRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowDatapanelObjectResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowIncidentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowIncidentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowIndicatorDetailRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowIndicatorDetailResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowIsapComponentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowIsapComponentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowLayoutRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowLayoutResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowLayoutWizardByFieldRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowLayoutWizardByFieldResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowLayoutWizardRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowLayoutWizardResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMapperDetailRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMapperDetailResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMapperListRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMapperListResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMappingFunctionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMappingFunctionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMappingInfoListRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMappingInfoListResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMetricMetaDataRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMetricMetaDataResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMetricResultResponseBody;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMetricStatsRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ShowModuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowModuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMoniterMetricStatsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowMoniterMetricStatsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPipeConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPipeConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPipeIndexRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPipeIndexResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPipeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPipeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlatformManagedRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlatformManagedResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookMonitorsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookMonitorsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookStatisticsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookStatisticsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookTopologyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookTopologyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPreProcessRulesListRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPreProcessRulesListRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.ShowPreProcessRulesListResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowReportInfoRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowReportInfoResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowResourceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowResourceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowSearchConditionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowSearchConditionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowShipperDelegateAuthRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowShipperDelegateAuthResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowShipperParamRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowShipperParamResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowTaskRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowTaskResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowTemplateFields;
import com.huaweicloud.sdk.secmaster.v1.model.ShowVulnerabilityRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowVulnerabilityResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowWorkspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowWorkspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UnsubscribeParam;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateAlertRuleRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateAopWorkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateAopWorkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateAopWorkflowVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateAopWorkflowVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateCatalogueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateCatalogueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateClassifierRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateClassifierResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateCollectorChannelGroupRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateCollectorChannelGroupResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateCollectorChannelRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateCollectorChannelResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateCollectorConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateCollectorConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateComponentConfigurationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateComponentConfigurationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateComponentTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateComponentTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateConfigurationDictionariesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateConfigurationDictionariesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateConnectionDto;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataobjectRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataobjectResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataspaceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDpeInfoStatusRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateIndexRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateIndicatorRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateLayoutRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateLayoutResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateLayoutWizardsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateLayoutWizardsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateMapperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateMapperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateMappingInfoStatusRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateMappingInfoStatusResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateMetricsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateMetricsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateModuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateModuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateNodeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateNodeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateOrderInfoReq;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePipeIndexRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePipeIndexResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePipeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePipeRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePipeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateRecipientsEmailStatusRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateRecipientsEmailStatusResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateRecipientsStatusRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateReportRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateReportRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateReportResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSearchConditionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSearchConditionRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSearchConditionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSubscriptionOrderRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSubscriptionOrderResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTagValueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTagValueRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTagValueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTaskRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTaskResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateVpcEndpointServiceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateVpcEndpointServiceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateVpcEndpointServiceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkflowInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkflowInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkspaceRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UploadAttachmentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UploadAttachmentRequestBody;
import com.huaweicloud.sdk.secmaster.v1.model.UploadAttachmentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ValidateAopWorkflowVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ValidateAopWorkflowVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.VulnerabilityDataObjectSearch;
import com.huaweicloud.sdk.secmaster.v1.model.WizardCreateRequestPojo;
import com.huaweicloud.sdk.secmaster.v1.model.WizardUpdateRequestPojos;

import java.time.LocalDate;
import java.util.List;

@SuppressWarnings("unchecked")
public class SecMasterMeta {

    public static final HttpRequestDef<BatchCreateDataobjectRelationsRequest, BatchCreateDataobjectRelationsResponse> batchCreateDataobjectRelations =
        genForBatchCreateDataobjectRelations();

    private static HttpRequestDef<BatchCreateDataobjectRelationsRequest, BatchCreateDataobjectRelationsResponse> genForBatchCreateDataobjectRelations() {
        // basic
        HttpRequestDef.Builder<BatchCreateDataobjectRelationsRequest, BatchCreateDataobjectRelationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateDataobjectRelationsRequest.class,
                    BatchCreateDataobjectRelationsResponse.class)
                .withName("BatchCreateDataobjectRelations")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{related_dataclass_type}/batch-create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDataobjectRelationsRequest::getWorkspaceId,
                BatchCreateDataobjectRelationsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDataobjectRelationsRequest::getDataclassType,
                BatchCreateDataobjectRelationsRequest::setDataclassType));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDataobjectRelationsRequest::getRelatedDataclassType,
                BatchCreateDataobjectRelationsRequest::setRelatedDataclassType));
        builder.<BatchCreateDataobjectRelationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateDataobjectRelationsRequestBody.class),
            f -> f.withMarshaller(BatchCreateDataobjectRelationsRequest::getBody,
                BatchCreateDataobjectRelationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDatapanelObjectsRequest, BatchCreateDatapanelObjectsResponse> batchCreateDatapanelObjects =
        genForBatchCreateDatapanelObjects();

    private static HttpRequestDef<BatchCreateDatapanelObjectsRequest, BatchCreateDatapanelObjectsResponse> genForBatchCreateDatapanelObjects() {
        // basic
        HttpRequestDef.Builder<BatchCreateDatapanelObjectsRequest, BatchCreateDatapanelObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateDatapanelObjectsRequest.class,
                    BatchCreateDatapanelObjectsResponse.class)
                .withName("BatchCreateDatapanelObjects")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/datapanel/{dataclass}/data-objects/batch-create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDatapanelObjectsRequest::getWorkspaceId,
                BatchCreateDatapanelObjectsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDatapanelObjectsRequest::getDataclass,
                BatchCreateDatapanelObjectsRequest::setDataclass));
        builder.<DataObjectBatchCreateForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataObjectBatchCreateForm.class),
            f -> f.withMarshaller(BatchCreateDatapanelObjectsRequest::getBody,
                BatchCreateDatapanelObjectsRequest::setBody));

        // response
        builder.<List<DataObjectCreateUpdateResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(BatchCreateDatapanelObjectsResponse::getBody,
                    BatchCreateDatapanelObjectsResponse::setBody)
                .withInnerContainerType(DataObjectCreateUpdateResponse.class));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateDatapanelObjectsResponse::getXRequestId,
                BatchCreateDatapanelObjectsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse> batchSearchMetricHits =
        genForBatchSearchMetricHits();

    private static HttpRequestDef<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse> genForBatchSearchMetricHits() {
        // basic
        HttpRequestDef.Builder<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchSearchMetricHitsRequest.class, BatchSearchMetricHitsResponse.class)
            .withName("BatchSearchMetricHits")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/metrics/hits")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSearchMetricHitsRequest::getWorkspaceId,
                BatchSearchMetricHitsRequest::setWorkspaceId));
        builder.<String>withRequestField("timespan",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSearchMetricHitsRequest::getTimespan,
                BatchSearchMetricHitsRequest::setTimespan));
        builder.<Boolean>withRequestField("cache",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(BatchSearchMetricHitsRequest::getCache, BatchSearchMetricHitsRequest::setCache));
        builder.<BatchSearchMetricHitsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSearchMetricHitsRequestBody.class),
            f -> f.withMarshaller(BatchSearchMetricHitsRequest::getBody, BatchSearchMetricHitsRequest::setBody));

        // response
        builder.<List<ShowMetricResultResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchSearchMetricHitsResponse::getBody, BatchSearchMetricHitsResponse::setBody)
                .withInnerContainerType(ShowMetricResultResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagResourcesRequest, BatchTagResourcesResponse> batchTagResources =
        genForBatchTagResources();

    private static HttpRequestDef<BatchTagResourcesRequest, BatchTagResourcesResponse> genForBatchTagResources() {
        // basic
        HttpRequestDef.Builder<BatchTagResourcesRequest, BatchTagResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagResourcesRequest.class, BatchTagResourcesResponse.class)
                .withName("BatchTagResources")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagResourcesRequest::getResourceType,
                BatchTagResourcesRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagResourcesRequest::getResourceId, BatchTagResourcesRequest::setResourceId));
        builder.<AlterResourceTagsInBatchesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterResourceTagsInBatchesRequestBody.class),
            f -> f.withMarshaller(BatchTagResourcesRequest::getBody, BatchTagResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUntagResourcesRequest, BatchUntagResourcesResponse> batchUntagResources =
        genForBatchUntagResources();

    private static HttpRequestDef<BatchUntagResourcesRequest, BatchUntagResourcesResponse> genForBatchUntagResources() {
        // basic
        HttpRequestDef.Builder<BatchUntagResourcesRequest, BatchUntagResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchUntagResourcesRequest.class, BatchUntagResourcesResponse.class)
            .withName("BatchUntagResources")
            .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUntagResourcesRequest::getResourceType,
                BatchUntagResourcesRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUntagResourcesRequest::getResourceId,
                BatchUntagResourcesRequest::setResourceId));
        builder.<AlterResourceTagsInBatchesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterResourceTagsInBatchesRequestBody.class),
            f -> f.withMarshaller(BatchUntagResourcesRequest::getBody, BatchUntagResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateCatalogueRequest, BatchUpdateCatalogueResponse> batchUpdateCatalogue =
        genForBatchUpdateCatalogue();

    private static HttpRequestDef<BatchUpdateCatalogueRequest, BatchUpdateCatalogueResponse> genForBatchUpdateCatalogue() {
        // basic
        HttpRequestDef.Builder<BatchUpdateCatalogueRequest, BatchUpdateCatalogueResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateCatalogueRequest.class, BatchUpdateCatalogueResponse.class)
            .withName("BatchUpdateCatalogue")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/catalogues/batch-update")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateCatalogueRequest::getWorkspaceId,
                BatchUpdateCatalogueRequest::setWorkspaceId));
        builder.<BatchCatalogueRequestPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCatalogueRequestPojo.class),
            f -> f.withMarshaller(BatchUpdateCatalogueRequest::getBody, BatchUpdateCatalogueRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchUpdateCatalogueResponse::getXRequestId,
                BatchUpdateCatalogueResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeAlertRequest, ChangeAlertResponse> changeAlert = genForChangeAlert();

    private static HttpRequestDef<ChangeAlertRequest, ChangeAlertResponse> genForChangeAlert() {
        // basic
        HttpRequestDef.Builder<ChangeAlertRequest, ChangeAlertResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeAlertRequest.class, ChangeAlertResponse.class)
                .withName("ChangeAlert")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/{alert_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAlertRequest::getWorkspaceId, ChangeAlertRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAlertRequest::getAlertId, ChangeAlertRequest::setAlertId));
        builder.<ChangeAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeAlertRequestBody.class),
            f -> f.withMarshaller(ChangeAlertRequest::getBody, ChangeAlertRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeAlertResponse::getXRequestId, ChangeAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeAlertsRequest, ChangeAlertsResponse> changeAlerts = genForChangeAlerts();

    private static HttpRequestDef<ChangeAlertsRequest, ChangeAlertsResponse> genForChangeAlerts() {
        // basic
        HttpRequestDef.Builder<ChangeAlertsRequest, ChangeAlertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeAlertsRequest.class, ChangeAlertsResponse.class)
                .withName("ChangeAlerts")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/batch-update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAlertsRequest::getWorkspaceId, ChangeAlertsRequest::setWorkspaceId));
        builder.<BatchChangeAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchChangeAlertRequestBody.class),
            f -> f.withMarshaller(ChangeAlertsRequest::getBody, ChangeAlertsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIncidentRequest, ChangeIncidentResponse> changeIncident =
        genForChangeIncident();

    private static HttpRequestDef<ChangeIncidentRequest, ChangeIncidentResponse> genForChangeIncident() {
        // basic
        HttpRequestDef.Builder<ChangeIncidentRequest, ChangeIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeIncidentRequest.class, ChangeIncidentResponse.class)
                .withName("ChangeIncident")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/{incident_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIncidentRequest::getWorkspaceId, ChangeIncidentRequest::setWorkspaceId));
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIncidentRequest::getIncidentId, ChangeIncidentRequest::setIncidentId));
        builder.<ChangeIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeIncidentRequestBody.class),
            f -> f.withMarshaller(ChangeIncidentRequest::getBody, ChangeIncidentRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeIncidentResponse::getXRequestId, ChangeIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeIncidentsRequest, ChangeIncidentsResponse> changeIncidents =
        genForChangeIncidents();

    private static HttpRequestDef<ChangeIncidentsRequest, ChangeIncidentsResponse> genForChangeIncidents() {
        // basic
        HttpRequestDef.Builder<ChangeIncidentsRequest, ChangeIncidentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeIncidentsRequest.class, ChangeIncidentsResponse.class)
                .withName("ChangeIncidents")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/batch-update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIncidentsRequest::getWorkspaceId, ChangeIncidentsRequest::setWorkspaceId));
        builder.<ChangeIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeIncidentRequestBody.class),
            f -> f.withMarshaller(ChangeIncidentsRequest::getBody, ChangeIncidentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstance =
        genForChangePlaybookInstance();

    private static HttpRequestDef<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> genForChangePlaybookInstance() {
        // basic
        HttpRequestDef.Builder<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangePlaybookInstanceRequest.class, ChangePlaybookInstanceResponse.class)
            .withName("ChangePlaybookInstance")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances/{instance_id}/operation")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getWorkspaceId,
                ChangePlaybookInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getInstanceId,
                ChangePlaybookInstanceRequest::setInstanceId));
        builder.<OperationPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperationPlaybookInfo.class),
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getBody, ChangePlaybookInstanceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangePlaybookInstanceResponse::getXRequestId,
                ChangePlaybookInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeResourceRequest, ChangeResourceResponse> changeResource =
        genForChangeResource();

    private static HttpRequestDef<ChangeResourceRequest, ChangeResourceResponse> genForChangeResource() {
        // basic
        HttpRequestDef.Builder<ChangeResourceRequest, ChangeResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeResourceRequest.class, ChangeResourceResponse.class)
                .withName("ChangeResource")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/resources/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeResourceRequest::getWorkspaceId, ChangeResourceRequest::setWorkspaceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeResourceRequest::getId, ChangeResourceRequest::setId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeResourceRequest::getXLanguage, ChangeResourceRequest::setXLanguage));
        builder.<ChangeResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeResourceRequestBody.class),
            f -> f.withMarshaller(ChangeResourceRequest::getBody, ChangeResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyMappingRequest, CopyMappingResponse> copyMapping = genForCopyMapping();

    private static HttpRequestDef<CopyMappingRequest, CopyMappingResponse> genForCopyMapping() {
        // basic
        HttpRequestDef.Builder<CopyMappingRequest, CopyMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyMappingRequest.class, CopyMappingResponse.class)
                .withName("CopyMapping")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/{mapping_id}/clone")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("mapping_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyMappingRequest::getMappingId, CopyMappingRequest::setMappingId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyMappingRequest::getWorkspaceId, CopyMappingRequest::setWorkspaceId));
        builder.<CopyMappingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CopyMappingRequestBody.class),
            f -> f.withMarshaller(CopyMappingRequest::getBody, CopyMappingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersion =
        genForCopyPlaybookVersion();

    private static HttpRequestDef<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> genForCopyPlaybookVersion() {
        // basic
        HttpRequestDef.Builder<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyPlaybookVersionRequest.class, CopyPlaybookVersionResponse.class)
                .withName("CopyPlaybookVersion")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/clone")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getWorkspaceId,
                CopyPlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getVersionId, CopyPlaybookVersionRequest::setVersionId));
        builder.<CopyPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyPlaybookInfo.class),
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getBody, CopyPlaybookVersionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyPlaybookVersionResponse::getXRequestId,
                CopyPlaybookVersionResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyPlaybookVersionResponse::getXAPIDeprecationInfo,
                CopyPlaybookVersionResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyPlaybookVersionResponse::getXAPIDeprecationDate,
                CopyPlaybookVersionResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<CountResourceInstanceRequest, CountResourceInstanceResponse> countResourceInstance =
        genForCountResourceInstance();

    private static HttpRequestDef<CountResourceInstanceRequest, CountResourceInstanceResponse> genForCountResourceInstance() {
        // basic
        HttpRequestDef.Builder<CountResourceInstanceRequest, CountResourceInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountResourceInstanceRequest.class, CountResourceInstanceResponse.class)
            .withName("CountResourceInstance")
            .withUri("/v1/{project_id}/{resource_type}/resource-instances/count")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountResourceInstanceRequest::getResourceType,
                CountResourceInstanceRequest::setResourceType));
        builder.<QueryResourceInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourceInstanceRequestBody.class),
            f -> f.withMarshaller(CountResourceInstanceRequest::getBody, CountResourceInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRequest, CreateAlertResponse> createAlert = genForCreateAlert();

    private static HttpRequestDef<CreateAlertRequest, CreateAlertResponse> genForCreateAlert() {
        // basic
        HttpRequestDef.Builder<CreateAlertRequest, CreateAlertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlertRequest.class, CreateAlertResponse.class)
                .withName("CreateAlert")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertRequest::getWorkspaceId, CreateAlertRequest::setWorkspaceId));
        builder.<CreateAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRequestBody.class),
            f -> f.withMarshaller(CreateAlertRequest::getBody, CreateAlertRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAlertResponse::getXRequestId, CreateAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRule =
        genForCreateAlertRule();

    private static HttpRequestDef<CreateAlertRuleRequest, CreateAlertRuleResponse> genForCreateAlertRule() {
        // basic
        HttpRequestDef.Builder<CreateAlertRuleRequest, CreateAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlertRuleRequest.class, CreateAlertRuleResponse.class)
                .withName("CreateAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertRuleRequest::getWorkspaceId, CreateAlertRuleRequest::setWorkspaceId));
        builder.<CreateAlertRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRuleRequestBody.class),
            f -> f.withMarshaller(CreateAlertRuleRequest::getBody, CreateAlertRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAlertRuleResponse::getXRequestId, CreateAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulation =
        genForCreateAlertRuleSimulation();

    private static HttpRequestDef<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> genForCreateAlertRuleSimulation() {
        // basic
        HttpRequestDef.Builder<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAlertRuleSimulationRequest.class,
                    CreateAlertRuleSimulationResponse.class)
                .withName("CreateAlertRuleSimulation")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/simulation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertRuleSimulationRequest::getWorkspaceId,
                CreateAlertRuleSimulationRequest::setWorkspaceId));
        builder.<CreateAlertRuleSimulationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRuleSimulationRequestBody.class),
            f -> f.withMarshaller(CreateAlertRuleSimulationRequest::getBody,
                CreateAlertRuleSimulationRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAlertRuleSimulationResponse::getXRequestId,
                CreateAlertRuleSimulationResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAopWorkflowRequest, CreateAopWorkflowResponse> createAopWorkflow =
        genForCreateAopWorkflow();

    private static HttpRequestDef<CreateAopWorkflowRequest, CreateAopWorkflowResponse> genForCreateAopWorkflow() {
        // basic
        HttpRequestDef.Builder<CreateAopWorkflowRequest, CreateAopWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAopWorkflowRequest.class, CreateAopWorkflowResponse.class)
                .withName("CreateAopWorkflow")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAopWorkflowRequest::getWorkspaceId, CreateAopWorkflowRequest::setWorkspaceId));
        builder.<CreateAopWorkflowInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAopWorkflowInfo.class),
            f -> f.withMarshaller(CreateAopWorkflowRequest::getBody, CreateAopWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAopWorkflowVersionRequest, CreateAopWorkflowVersionResponse> createAopWorkflowVersion =
        genForCreateAopWorkflowVersion();

    private static HttpRequestDef<CreateAopWorkflowVersionRequest, CreateAopWorkflowVersionResponse> genForCreateAopWorkflowVersion() {
        // basic
        HttpRequestDef.Builder<CreateAopWorkflowVersionRequest, CreateAopWorkflowVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAopWorkflowVersionRequest.class, CreateAopWorkflowVersionResponse.class)
                .withName("CreateAopWorkflowVersion")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/{workflow_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAopWorkflowVersionRequest::getWorkspaceId,
                CreateAopWorkflowVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAopWorkflowVersionRequest::getWorkflowId,
                CreateAopWorkflowVersionRequest::setWorkflowId));
        builder.<CreateAopWorkflowVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAopWorkflowVersionInfo.class),
            f -> f.withMarshaller(CreateAopWorkflowVersionRequest::getBody, CreateAopWorkflowVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAopWorkflowVersionApprovelRequest, CreateAopWorkflowVersionApprovelResponse> createAopWorkflowVersionApprovel =
        genForCreateAopWorkflowVersionApprovel();

    private static HttpRequestDef<CreateAopWorkflowVersionApprovelRequest, CreateAopWorkflowVersionApprovelResponse> genForCreateAopWorkflowVersionApprovel() {
        // basic
        HttpRequestDef.Builder<CreateAopWorkflowVersionApprovelRequest, CreateAopWorkflowVersionApprovelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAopWorkflowVersionApprovelRequest.class,
                    CreateAopWorkflowVersionApprovelResponse.class)
                .withName("CreateAopWorkflowVersionApprovel")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/versions/{version_id}/approval")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAopWorkflowVersionApprovelRequest::getWorkspaceId,
                CreateAopWorkflowVersionApprovelRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAopWorkflowVersionApprovelRequest::getVersionId,
                CreateAopWorkflowVersionApprovelRequest::setVersionId));
        builder.<CreateAopWorkflowVersionApprovelInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAopWorkflowVersionApprovelInfo.class),
            f -> f.withMarshaller(CreateAopWorkflowVersionApprovelRequest::getBody,
                CreateAopWorkflowVersionApprovelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> createBatchOrderAlerts =
        genForCreateBatchOrderAlerts();

    private static HttpRequestDef<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> genForCreateBatchOrderAlerts() {
        // basic
        HttpRequestDef.Builder<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateBatchOrderAlertsRequest.class, CreateBatchOrderAlertsResponse.class)
            .withName("CreateBatchOrderAlerts")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/batch-order")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchOrderAlertsRequest::getWorkspaceId,
                CreateBatchOrderAlertsRequest::setWorkspaceId));
        builder.<OrderAlert>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrderAlert.class),
            f -> f.withMarshaller(CreateBatchOrderAlertsRequest::getBody, CreateBatchOrderAlertsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBatchOrderAlertsResponse::getXRequestId,
                CreateBatchOrderAlertsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateCatalogueRequest, CreateCatalogueResponse> createCatalogue =
        genForCreateCatalogue();

    private static HttpRequestDef<CreateCatalogueRequest, CreateCatalogueResponse> genForCreateCatalogue() {
        // basic
        HttpRequestDef.Builder<CreateCatalogueRequest, CreateCatalogueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCatalogueRequest.class, CreateCatalogueResponse.class)
                .withName("CreateCatalogue")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/catalogues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCatalogueRequest::getWorkspaceId, CreateCatalogueRequest::setWorkspaceId));
        builder.<CatalogueRequestPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CatalogueRequestPojo.class),
            f -> f.withMarshaller(CreateCatalogueRequest::getBody, CreateCatalogueRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCatalogueResponse::getXRequestId, CreateCatalogueResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateClassifierRequest, CreateClassifierResponse> createClassifier =
        genForCreateClassifier();

    private static HttpRequestDef<CreateClassifierRequest, CreateClassifierResponse> genForCreateClassifier() {
        // basic
        HttpRequestDef.Builder<CreateClassifierRequest, CreateClassifierResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClassifierRequest.class, CreateClassifierResponse.class)
                .withName("CreateClassifier")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/classifiers")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClassifierRequest::getWorkspaceId, CreateClassifierRequest::setWorkspaceId));
        builder.<CreateDpeClassifyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDpeClassifyRequestBody.class),
            f -> f.withMarshaller(CreateClassifierRequest::getBody, CreateClassifierRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCollectConfigRequest, CreateCollectConfigResponse> createCollectConfig =
        genForCreateCollectConfig();

    private static HttpRequestDef<CreateCollectConfigRequest, CreateCollectConfigResponse> genForCreateCollectConfig() {
        // basic
        HttpRequestDef.Builder<CreateCollectConfigRequest, CreateCollectConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCollectConfigRequest.class, CreateCollectConfigResponse.class)
                .withName("CreateCollectConfig")
                .withUri("/v1/{project_id}/collector/cloudlogs/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectConfigRequest::getRegionId, CreateCollectConfigRequest::setRegionId));
        builder.<CreateCollectConfigV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCollectConfigV2RequestBody.class),
            f -> f.withMarshaller(CreateCollectConfigRequest::getBody, CreateCollectConfigRequest::setBody));

        // response
        builder.<List<ConfigResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateCollectConfigResponse::getBody, CreateCollectConfigResponse::setBody)
                .withInnerContainerType(ConfigResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateCollectorChannelRequest, CreateCollectorChannelResponse> createCollectorChannel =
        genForCreateCollectorChannel();

    private static HttpRequestDef<CreateCollectorChannelRequest, CreateCollectorChannelResponse> genForCreateCollectorChannel() {
        // basic
        HttpRequestDef.Builder<CreateCollectorChannelRequest, CreateCollectorChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCollectorChannelRequest.class, CreateCollectorChannelResponse.class)
            .withName("CreateCollectorChannel")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectorChannelRequest::getWorkspaceId,
                CreateCollectorChannelRequest::setWorkspaceId));
        builder.<CreateChannelDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateChannelDto.class),
            f -> f.withMarshaller(CreateCollectorChannelRequest::getBody, CreateCollectorChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCollectorChannelGroupRequest, CreateCollectorChannelGroupResponse> createCollectorChannelGroup =
        genForCreateCollectorChannelGroup();

    private static HttpRequestDef<CreateCollectorChannelGroupRequest, CreateCollectorChannelGroupResponse> genForCreateCollectorChannelGroup() {
        // basic
        HttpRequestDef.Builder<CreateCollectorChannelGroupRequest, CreateCollectorChannelGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCollectorChannelGroupRequest.class,
                    CreateCollectorChannelGroupResponse.class)
                .withName("CreateCollectorChannelGroup")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectorChannelGroupRequest::getWorkspaceId,
                CreateCollectorChannelGroupRequest::setWorkspaceId));
        builder.<GroupDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GroupDto.class),
            f -> f.withMarshaller(CreateCollectorChannelGroupRequest::getBody,
                CreateCollectorChannelGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCollectorChannelOperationRequest, CreateCollectorChannelOperationResponse> createCollectorChannelOperation =
        genForCreateCollectorChannelOperation();

    private static HttpRequestDef<CreateCollectorChannelOperationRequest, CreateCollectorChannelOperationResponse> genForCreateCollectorChannelOperation() {
        // basic
        HttpRequestDef.Builder<CreateCollectorChannelOperationRequest, CreateCollectorChannelOperationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCollectorChannelOperationRequest.class,
                    CreateCollectorChannelOperationResponse.class)
                .withName("CreateCollectorChannelOperation")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/{channel_id}/operation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectorChannelOperationRequest::getWorkspaceId,
                CreateCollectorChannelOperationRequest::setWorkspaceId));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectorChannelOperationRequest::getChannelId,
                CreateCollectorChannelOperationRequest::setChannelId));
        builder.<OperationDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperationDto.class),
            f -> f.withMarshaller(CreateCollectorChannelOperationRequest::getBody,
                CreateCollectorChannelOperationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCollectorConnectionRequest, CreateCollectorConnectionResponse> createCollectorConnection =
        genForCreateCollectorConnection();

    private static HttpRequestDef<CreateCollectorConnectionRequest, CreateCollectorConnectionResponse> genForCreateCollectorConnection() {
        // basic
        HttpRequestDef.Builder<CreateCollectorConnectionRequest, CreateCollectorConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCollectorConnectionRequest.class,
                    CreateCollectorConnectionResponse.class)
                .withName("CreateCollectorConnection")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectorConnectionRequest::getWorkspaceId,
                CreateCollectorConnectionRequest::setWorkspaceId));
        builder.<CreateConnectionDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConnectionDto.class),
            f -> f.withMarshaller(CreateCollectorConnectionRequest::getBody,
                CreateCollectorConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCollectorFilesRequest, CreateCollectorFilesResponse> createCollectorFiles =
        genForCreateCollectorFiles();

    private static HttpRequestDef<CreateCollectorFilesRequest, CreateCollectorFilesResponse> genForCreateCollectorFiles() {
        // basic
        HttpRequestDef.Builder<CreateCollectorFilesRequest, CreateCollectorFilesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCollectorFilesRequest.class, CreateCollectorFilesResponse.class)
            .withName("CreateCollectorFiles")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/files")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectorFilesRequest::getWorkspaceId,
                CreateCollectorFilesRequest::setWorkspaceId));
        builder.<CreateCollectorFilesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateCollectorFilesRequestBody.class),
            f -> f.withMarshaller(CreateCollectorFilesRequest::getBody, CreateCollectorFilesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCollectorParserRequest, CreateCollectorParserResponse> createCollectorParser =
        genForCreateCollectorParser();

    private static HttpRequestDef<CreateCollectorParserRequest, CreateCollectorParserResponse> genForCreateCollectorParser() {
        // basic
        HttpRequestDef.Builder<CreateCollectorParserRequest, CreateCollectorParserResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCollectorParserRequest.class, CreateCollectorParserResponse.class)
            .withName("CreateCollectorParser")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/logstash/parsers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCollectorParserRequest::getWorkspaceId,
                CreateCollectorParserRequest::setWorkspaceId));
        builder.<CreateParserDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateParserDto.class),
            f -> f.withMarshaller(CreateCollectorParserRequest::getBody, CreateCollectorParserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentTemplateRequest, CreateComponentTemplateResponse> createComponentTemplate =
        genForCreateComponentTemplate();

    private static HttpRequestDef<CreateComponentTemplateRequest, CreateComponentTemplateResponse> genForCreateComponentTemplate() {
        // basic
        HttpRequestDef.Builder<CreateComponentTemplateRequest, CreateComponentTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateComponentTemplateRequest.class, CreateComponentTemplateResponse.class)
            .withName("CreateComponentTemplate")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components/template")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentTemplateRequest::getWorkspaceId,
                CreateComponentTemplateRequest::setWorkspaceId));
        builder.<CreateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateReq.class),
            f -> f.withMarshaller(CreateComponentTemplateRequest::getBody, CreateComponentTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationApplicationRequest, CreateConfigurationApplicationResponse> createConfigurationApplication =
        genForCreateConfigurationApplication();

    private static HttpRequestDef<CreateConfigurationApplicationRequest, CreateConfigurationApplicationResponse> genForCreateConfigurationApplication() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationApplicationRequest, CreateConfigurationApplicationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateConfigurationApplicationRequest.class,
                    CreateConfigurationApplicationResponse.class)
                .withName("CreateConfigurationApplication")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/components/{component_id}/configurations/application")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfigurationApplicationRequest::getWorkspaceId,
                CreateConfigurationApplicationRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfigurationApplicationRequest::getComponentId,
                CreateConfigurationApplicationRequest::setComponentId));
        builder.<CreateConfigurationApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationApplicationRequestBody.class),
            f -> f.withMarshaller(CreateConfigurationApplicationRequest::getBody,
                CreateConfigurationApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationDictionariesRequest, CreateConfigurationDictionariesResponse> createConfigurationDictionaries =
        genForCreateConfigurationDictionaries();

    private static HttpRequestDef<CreateConfigurationDictionariesRequest, CreateConfigurationDictionariesResponse> genForCreateConfigurationDictionaries() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationDictionariesRequest, CreateConfigurationDictionariesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateConfigurationDictionariesRequest.class,
                    CreateConfigurationDictionariesResponse.class)
                .withName("CreateConfigurationDictionaries")
                .withUri("/v1/{project_id}/configurations/dictionaries")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfigurationDictionariesRequest::getXLanguage,
                CreateConfigurationDictionariesRequest::setXLanguage));
        builder.<CreateDictionaryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDictionaryRequest.class),
            f -> f.withMarshaller(CreateConfigurationDictionariesRequest::getBody,
                CreateConfigurationDictionariesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection =
        genForCreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForCreateConnection() {
        // basic
        HttpRequestDef.Builder<CreateConnectionRequest, CreateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectionRequest.class, CreateConnectionResponse.class)
                .withName("CreateConnection")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/assetcredentials")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectionRequest::getWorkspaceId, CreateConnectionRequest::setWorkspaceId));
        builder.<CreateAssetsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAssetsRequestBody.class),
            f -> f.withMarshaller(CreateConnectionRequest::getBody, CreateConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataclassTypeRequest, CreateDataclassTypeResponse> createDataclassType =
        genForCreateDataclassType();

    private static HttpRequestDef<CreateDataclassTypeRequest, CreateDataclassTypeResponse> genForCreateDataclassType() {
        // basic
        HttpRequestDef.Builder<CreateDataclassTypeRequest, CreateDataclassTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataclassTypeRequest.class, CreateDataclassTypeResponse.class)
                .withName("CreateDataclassType")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/dataclasses/{dataclass_id}/types")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataclassTypeRequest::getWorkspaceId,
                CreateDataclassTypeRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataclassTypeRequest::getDataclassId,
                CreateDataclassTypeRequest::setDataclassId));
        builder.<CreateDataclassTypeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataclassTypeRequestBody.class),
            f -> f.withMarshaller(CreateDataclassTypeRequest::getBody, CreateDataclassTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataobjectRequest, CreateDataobjectResponse> createDataobject =
        genForCreateDataobject();

    private static HttpRequestDef<CreateDataobjectRequest, CreateDataobjectResponse> genForCreateDataobject() {
        // basic
        HttpRequestDef.Builder<CreateDataobjectRequest, CreateDataobjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataobjectRequest.class, CreateDataobjectResponse.class)
                .withName("CreateDataobject")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRequest::getWorkspaceId, CreateDataobjectRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRequest::getDataclassName,
                CreateDataobjectRequest::setDataclassName));
        builder.<DataObjectCreateForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataObjectCreateForm.class),
            f -> f.withMarshaller(CreateDataobjectRequest::getBody, CreateDataobjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> createDataobjectRelation =
        genForCreateDataobjectRelation();

    private static HttpRequestDef<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> genForCreateDataobjectRelation() {
        // basic
        HttpRequestDef.Builder<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateDataobjectRelationRequest.class, CreateDataobjectRelationResponse.class)
                .withName("CreateDataobjectRelation")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getWorkspaceId,
                CreateDataobjectRelationRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getDataclassType,
                CreateDataobjectRelationRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getDataObjectId,
                CreateDataobjectRelationRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getRelatedDataclassType,
                CreateDataobjectRelationRequest::setRelatedDataclassType));
        builder.<CreateDataobjectRelationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataobjectRelationRequestBody.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getBody, CreateDataobjectRelationRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDataobjectRelationResponse::getXRequestId,
                CreateDataobjectRelationResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDataspaceRequest, CreateDataspaceResponse> createDataspace =
        genForCreateDataspace();

    private static HttpRequestDef<CreateDataspaceRequest, CreateDataspaceResponse> genForCreateDataspace() {
        // basic
        HttpRequestDef.Builder<CreateDataspaceRequest, CreateDataspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataspaceRequest.class, CreateDataspaceResponse.class)
                .withName("CreateDataspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/dataspaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataspaceRequest::getWorkspaceId, CreateDataspaceRequest::setWorkspaceId));
        builder.<CreateDataspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataspaceRequestBody.class),
            f -> f.withMarshaller(CreateDataspaceRequest::getBody, CreateDataspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIncidentRequest, CreateIncidentResponse> createIncident =
        genForCreateIncident();

    private static HttpRequestDef<CreateIncidentRequest, CreateIncidentResponse> genForCreateIncident() {
        // basic
        HttpRequestDef.Builder<CreateIncidentRequest, CreateIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIncidentRequest.class, CreateIncidentResponse.class)
                .withName("CreateIncident")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIncidentRequest::getWorkspaceId, CreateIncidentRequest::setWorkspaceId));
        builder.<CreateIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIncidentRequestBody.class),
            f -> f.withMarshaller(CreateIncidentRequest::getBody, CreateIncidentRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIncidentResponse::getXRequestId, CreateIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateIndicatorRequest, CreateIndicatorResponse> createIndicator =
        genForCreateIndicator();

    private static HttpRequestDef<CreateIndicatorRequest, CreateIndicatorResponse> genForCreateIndicator() {
        // basic
        HttpRequestDef.Builder<CreateIndicatorRequest, CreateIndicatorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIndicatorRequest.class, CreateIndicatorResponse.class)
                .withName("CreateIndicator")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndicatorRequest::getWorkspaceId, CreateIndicatorRequest::setWorkspaceId));
        builder.<IndicatorCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndicatorCreateRequest.class),
            f -> f.withMarshaller(CreateIndicatorRequest::getBody, CreateIndicatorRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIndicatorResponse::getXRequestId, CreateIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateLayoutRequest, CreateLayoutResponse> createLayout = genForCreateLayout();

    private static HttpRequestDef<CreateLayoutRequest, CreateLayoutResponse> genForCreateLayout() {
        // basic
        HttpRequestDef.Builder<CreateLayoutRequest, CreateLayoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLayoutRequest.class, CreateLayoutResponse.class)
                .withName("CreateLayout")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLayoutRequest::getWorkspaceId, CreateLayoutRequest::setWorkspaceId));
        builder.<LayoutCreateRequestPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LayoutCreateRequestPojo.class),
            f -> f.withMarshaller(CreateLayoutRequest::getBody, CreateLayoutRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLayoutResponse::getXRequestId, CreateLayoutResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateLayoutWizardRequest, CreateLayoutWizardResponse> createLayoutWizard =
        genForCreateLayoutWizard();

    private static HttpRequestDef<CreateLayoutWizardRequest, CreateLayoutWizardResponse> genForCreateLayoutWizard() {
        // basic
        HttpRequestDef.Builder<CreateLayoutWizardRequest, CreateLayoutWizardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLayoutWizardRequest.class, CreateLayoutWizardResponse.class)
                .withName("CreateLayoutWizard")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/{layout_id}/wizards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLayoutWizardRequest::getWorkspaceId,
                CreateLayoutWizardRequest::setWorkspaceId));
        builder.<String>withRequestField("layout_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLayoutWizardRequest::getLayoutId, CreateLayoutWizardRequest::setLayoutId));
        builder.<WizardCreateRequestPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WizardCreateRequestPojo.class),
            f -> f.withMarshaller(CreateLayoutWizardRequest::getBody, CreateLayoutWizardRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLayoutWizardResponse::getXRequestId,
                CreateLayoutWizardResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateMapperRequest, CreateMapperResponse> createMapper = genForCreateMapper();

    private static HttpRequestDef<CreateMapperRequest, CreateMapperResponse> genForCreateMapper() {
        // basic
        HttpRequestDef.Builder<CreateMapperRequest, CreateMapperResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMapperRequest.class, CreateMapperResponse.class)
                .withName("CreateMapper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/mappers")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMapperRequest::getWorkspaceId, CreateMapperRequest::setWorkspaceId));
        builder.<CreateDpeMappingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDpeMappingRequestBody.class),
            f -> f.withMarshaller(CreateMapperRequest::getBody, CreateMapperRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMetricRequest, CreateMetricResponse> createMetric = genForCreateMetric();

    private static HttpRequestDef<CreateMetricRequest, CreateMetricResponse> genForCreateMetric() {
        // basic
        HttpRequestDef.Builder<CreateMetricRequest, CreateMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMetricRequest.class, CreateMetricResponse.class)
                .withName("CreateMetric")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMetricRequest::getWorkspaceId, CreateMetricRequest::setWorkspaceId));
        builder.<CreateMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateMetricRequestBody.class),
            f -> f.withMarshaller(CreateMetricRequest::getBody, CreateMetricRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMetricResponse::getXRequestId, CreateMetricResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateModuleRequest, CreateModuleResponse> createModule = genForCreateModule();

    private static HttpRequestDef<CreateModuleRequest, CreateModuleResponse> genForCreateModule() {
        // basic
        HttpRequestDef.Builder<CreateModuleRequest, CreateModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateModuleRequest.class, CreateModuleResponse.class)
                .withName("CreateModule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/modules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateModuleRequest::getWorkspaceId, CreateModuleRequest::setWorkspaceId));
        builder.<ModuleCreateRequestPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModuleCreateRequestPojo.class),
            f -> f.withMarshaller(CreateModuleRequest::getBody, CreateModuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateModuleResponse::getXRequestId, CreateModuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateNoteRequest, CreateNoteResponse> createNote = genForCreateNote();

    private static HttpRequestDef<CreateNoteRequest, CreateNoteResponse> genForCreateNote() {
        // basic
        HttpRequestDef.Builder<CreateNoteRequest, CreateNoteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNoteRequest.class, CreateNoteResponse.class)
                .withName("CreateNote")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/notes")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNoteRequest::getWorkspaceId, CreateNoteRequest::setWorkspaceId));
        builder.<CreateNoteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNoteRequestBody.class),
            f -> f.withMarshaller(CreateNoteRequest::getBody, CreateNoteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipeRequest, CreatePipeResponse> createPipe = genForCreatePipe();

    private static HttpRequestDef<CreatePipeRequest, CreatePipeResponse> genForCreatePipe() {
        // basic
        HttpRequestDef.Builder<CreatePipeRequest, CreatePipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePipeRequest.class, CreatePipeResponse.class)
                .withName("CreatePipe")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipeRequest::getWorkspaceId, CreatePipeRequest::setWorkspaceId));
        builder.<CreatePipeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePipeRequestBody.class),
            f -> f.withMarshaller(CreatePipeRequest::getBody, CreatePipeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePipeConsumptionRequest, CreatePipeConsumptionResponse> createPipeConsumption =
        genForCreatePipeConsumption();

    private static HttpRequestDef<CreatePipeConsumptionRequest, CreatePipeConsumptionResponse> genForCreatePipeConsumption() {
        // basic
        HttpRequestDef.Builder<CreatePipeConsumptionRequest, CreatePipeConsumptionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePipeConsumptionRequest.class, CreatePipeConsumptionResponse.class)
            .withName("CreatePipeConsumption")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}/consumption")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipeConsumptionRequest::getWorkspaceId,
                CreatePipeConsumptionRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipeConsumptionRequest::getPipeId, CreatePipeConsumptionRequest::setPipeId));
        builder.<EnableConsumptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnableConsumptionRequestBody.class),
            f -> f.withMarshaller(CreatePipeConsumptionRequest::getBody, CreatePipeConsumptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybook =
        genForCreatePlaybook();

    private static HttpRequestDef<CreatePlaybookRequest, CreatePlaybookResponse> genForCreatePlaybook() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookRequest, CreatePlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePlaybookRequest.class, CreatePlaybookResponse.class)
                .withName("CreatePlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookRequest::getWorkspaceId, CreatePlaybookRequest::setWorkspaceId));
        builder.<CreatePlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePlaybookInfo.class),
            f -> f.withMarshaller(CreatePlaybookRequest::getBody, CreatePlaybookRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookResponse::getXRequestId, CreatePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookAction =
        genForCreatePlaybookAction();

    private static HttpRequestDef<CreatePlaybookActionRequest, CreatePlaybookActionResponse> genForCreatePlaybookAction() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookActionRequest, CreatePlaybookActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePlaybookActionRequest.class, CreatePlaybookActionResponse.class)
            .withName("CreatePlaybookAction")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/actions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getWorkspaceId,
                CreatePlaybookActionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getVersionId,
                CreatePlaybookActionRequest::setVersionId));
        builder.<List<CreateAction>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getBody, CreatePlaybookActionRequest::setBody)
                .withInnerContainerType(CreateAction.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookActionResponse::getXRequestId,
                CreatePlaybookActionResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookActionResponse::getXAPIDeprecationInfo,
                CreatePlaybookActionResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookActionResponse::getXAPIDeprecationDate,
                CreatePlaybookActionResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApprove =
        genForCreatePlaybookApprove();

    private static HttpRequestDef<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> genForCreatePlaybookApprove() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePlaybookApproveRequest.class, CreatePlaybookApproveResponse.class)
            .withName("CreatePlaybookApprove")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/approval")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getWorkspaceId,
                CreatePlaybookApproveRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getVersionId,
                CreatePlaybookApproveRequest::setVersionId));
        builder.<ApprovePlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApprovePlaybookInfo.class),
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getBody, CreatePlaybookApproveRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookApproveResponse::getXRequestId,
                CreatePlaybookApproveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRule =
        genForCreatePlaybookRule();

    private static HttpRequestDef<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> genForCreatePlaybookRule() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePlaybookRuleRequest.class, CreatePlaybookRuleResponse.class)
                .withName("CreatePlaybookRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getWorkspaceId,
                CreatePlaybookRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getVersionId, CreatePlaybookRuleRequest::setVersionId));
        builder.<CreateRuleInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRuleInfo.class),
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getBody, CreatePlaybookRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookRuleResponse::getXRequestId,
                CreatePlaybookRuleResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookRuleResponse::getXAPIDeprecationInfo,
                CreatePlaybookRuleResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookRuleResponse::getXAPIDeprecationDate,
                CreatePlaybookRuleResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersion =
        genForCreatePlaybookVersion();

    private static HttpRequestDef<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> genForCreatePlaybookVersion() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePlaybookVersionRequest.class, CreatePlaybookVersionResponse.class)
            .withName("CreatePlaybookVersion")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getWorkspaceId,
                CreatePlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getPlaybookId,
                CreatePlaybookVersionRequest::setPlaybookId));
        builder.<CreatePlaybookVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePlaybookVersionInfo.class),
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getBody, CreatePlaybookVersionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookVersionResponse::getXRequestId,
                CreatePlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePreProcessRulesRequest, CreatePreProcessRulesResponse> createPreProcessRules =
        genForCreatePreProcessRules();

    private static HttpRequestDef<CreatePreProcessRulesRequest, CreatePreProcessRulesResponse> genForCreatePreProcessRules() {
        // basic
        HttpRequestDef.Builder<CreatePreProcessRulesRequest, CreatePreProcessRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePreProcessRulesRequest.class, CreatePreProcessRulesResponse.class)
            .withName("CreatePreProcessRules")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/preprocess-rules")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePreProcessRulesRequest::getWorkspaceId,
                CreatePreProcessRulesRequest::setWorkspaceId));
        builder.<CreatePreProcessRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePreProcessRulesRequestBody.class),
            f -> f.withMarshaller(CreatePreProcessRulesRequest::getBody, CreatePreProcessRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReportRequest, CreateReportResponse> createReport = genForCreateReport();

    private static HttpRequestDef<CreateReportRequest, CreateReportResponse> genForCreateReport() {
        // basic
        HttpRequestDef.Builder<CreateReportRequest, CreateReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReportRequest.class, CreateReportResponse.class)
                .withName("CreateReport")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/reports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportRequest::getWorkspaceId, CreateReportRequest::setWorkspaceId));
        builder.<String>withRequestField("Region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportRequest::getRegion, CreateReportRequest::setRegion));
        builder.<CreateReportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReportRequestBody.class),
            f -> f.withMarshaller(CreateReportRequest::getBody, CreateReportRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateReportResponse::getBody, CreateReportResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateReportResponse::getXRequestId, CreateReportResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceConfigRequest, CreateResourceConfigResponse> createResourceConfig =
        genForCreateResourceConfig();

    private static HttpRequestDef<CreateResourceConfigRequest, CreateResourceConfigResponse> genForCreateResourceConfig() {
        // basic
        HttpRequestDef.Builder<CreateResourceConfigRequest, CreateResourceConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateResourceConfigRequest.class, CreateResourceConfigResponse.class)
            .withName("CreateResourceConfig")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/cloud-logs/resource")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceConfigRequest::getWorkspaceId,
                CreateResourceConfigRequest::setWorkspaceId));
        builder.<CreateCloudLogResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudLogResourceRequestBody.class),
            f -> f.withMarshaller(CreateResourceConfigRequest::getBody, CreateResourceConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetryPolicyRequest, CreateRetryPolicyResponse> createRetryPolicy =
        genForCreateRetryPolicy();

    private static HttpRequestDef<CreateRetryPolicyRequest, CreateRetryPolicyResponse> genForCreateRetryPolicy() {
        // basic
        HttpRequestDef.Builder<CreateRetryPolicyRequest, CreateRetryPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRetryPolicyRequest.class, CreateRetryPolicyResponse.class)
                .withName("CreateRetryPolicy")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/policys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRetryPolicyRequest::getWorkspaceId, CreateRetryPolicyRequest::setWorkspaceId));
        builder.<CreateRetryPolicyRequest.ActionTypeEnum>withRequestField("action_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRetryPolicyRequest.ActionTypeEnum.class),
            f -> f.withMarshaller(CreateRetryPolicyRequest::getActionType, CreateRetryPolicyRequest::setActionType));
        builder.<String>withRequestField("X-Secmaster-Version",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRetryPolicyRequest::getXSecmasterVersion,
                CreateRetryPolicyRequest::setXSecmasterVersion));
        builder.<CreateRetryPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRetryPolicyRequestBody.class),
            f -> f.withMarshaller(CreateRetryPolicyRequest::getBody, CreateRetryPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSearchAnalysisRequest, CreateSearchAnalysisResponse> createSearchAnalysis =
        genForCreateSearchAnalysis();

    private static HttpRequestDef<CreateSearchAnalysisRequest, CreateSearchAnalysisResponse> genForCreateSearchAnalysis() {
        // basic
        HttpRequestDef.Builder<CreateSearchAnalysisRequest, CreateSearchAnalysisResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSearchAnalysisRequest.class, CreateSearchAnalysisResponse.class)
            .withName("CreateSearchAnalysis")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/search/analysis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSearchAnalysisRequest::getWorkspaceId,
                CreateSearchAnalysisRequest::setWorkspaceId));
        builder.<CreateAnalysisRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAnalysisRequestBody.class),
            f -> f.withMarshaller(CreateSearchAnalysisRequest::getBody, CreateSearchAnalysisRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSearchConditionRequest, CreateSearchConditionResponse> createSearchCondition =
        genForCreateSearchCondition();

    private static HttpRequestDef<CreateSearchConditionRequest, CreateSearchConditionResponse> genForCreateSearchCondition() {
        // basic
        HttpRequestDef.Builder<CreateSearchConditionRequest, CreateSearchConditionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSearchConditionRequest.class, CreateSearchConditionResponse.class)
            .withName("CreateSearchCondition")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/search/conditions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSearchConditionRequest::getWorkspaceId,
                CreateSearchConditionRequest::setWorkspaceId));
        builder.<CreateSearchConditionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSearchConditionRequestBody.class),
            f -> f.withMarshaller(CreateSearchConditionRequest::getBody, CreateSearchConditionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceAgencyRequest, CreateServiceAgencyResponse> createServiceAgency =
        genForCreateServiceAgency();

    private static HttpRequestDef<CreateServiceAgencyRequest, CreateServiceAgencyResponse> genForCreateServiceAgency() {
        // basic
        HttpRequestDef.Builder<CreateServiceAgencyRequest, CreateServiceAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServiceAgencyRequest.class, CreateServiceAgencyResponse.class)
                .withName("CreateServiceAgency")
                .withUri("/v1/{project_id}/agency")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateServiceAgencyRequest::getXLanguage, CreateServiceAgencyRequest::setXLanguage));
        builder.<CreateServiceAgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServiceAgencyRequestBody.class),
            f -> f.withMarshaller(CreateServiceAgencyRequest::getBody, CreateServiceAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShipperRequest, CreateShipperResponse> createShipper =
        genForCreateShipper();

    private static HttpRequestDef<CreateShipperRequest, CreateShipperResponse> genForCreateShipper() {
        // basic
        HttpRequestDef.Builder<CreateShipperRequest, CreateShipperResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateShipperRequest.class, CreateShipperResponse.class)
                .withName("CreateShipper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateShipperRequest::getWorkspaceId, CreateShipperRequest::setWorkspaceId));
        builder.<CreateShipperBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateShipperBody.class),
            f -> f.withMarshaller(CreateShipperRequest::getBody, CreateShipperRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShipperDelegateAuthRequest, CreateShipperDelegateAuthResponse> createShipperDelegateAuth =
        genForCreateShipperDelegateAuth();

    private static HttpRequestDef<CreateShipperDelegateAuthRequest, CreateShipperDelegateAuthResponse> genForCreateShipperDelegateAuth() {
        // basic
        HttpRequestDef.Builder<CreateShipperDelegateAuthRequest, CreateShipperDelegateAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateShipperDelegateAuthRequest.class,
                    CreateShipperDelegateAuthResponse.class)
                .withName("CreateShipperDelegateAuth")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/delegate/auth/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateShipperDelegateAuthRequest::getWorkspaceId,
                CreateShipperDelegateAuthRequest::setWorkspaceId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateShipperDelegateAuthRequest::getDomainId,
                CreateShipperDelegateAuthRequest::setDomainId));
        builder.<CreateShipperDelegateAuthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateShipperDelegateAuthRequestBody.class),
            f -> f.withMarshaller(CreateShipperDelegateAuthRequest::getBody,
                CreateShipperDelegateAuthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubscriptionOrderRequest, CreateSubscriptionOrderResponse> createSubscriptionOrder =
        genForCreateSubscriptionOrder();

    private static HttpRequestDef<CreateSubscriptionOrderRequest, CreateSubscriptionOrderResponse> genForCreateSubscriptionOrder() {
        // basic
        HttpRequestDef.Builder<CreateSubscriptionOrderRequest, CreateSubscriptionOrderResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSubscriptionOrderRequest.class, CreateSubscriptionOrderResponse.class)
            .withName("CreateSubscriptionOrder")
            .withUri("/v1/{project_id}/subscriptions/orders")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<CreateSubscriptionOrderRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubscriptionOrderRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateSubscriptionOrderRequest::getXLanguage,
                CreateSubscriptionOrderRequest::setXLanguage));
        builder.<OrderInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrderInfoReq.class),
            f -> f.withMarshaller(CreateSubscriptionOrderRequest::getBody, CreateSubscriptionOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowInstanceRequest, CreateWorkflowInstanceResponse> createWorkflowInstance =
        genForCreateWorkflowInstance();

    private static HttpRequestDef<CreateWorkflowInstanceRequest, CreateWorkflowInstanceResponse> genForCreateWorkflowInstance() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowInstanceRequest, CreateWorkflowInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWorkflowInstanceRequest.class, CreateWorkflowInstanceResponse.class)
            .withName("CreateWorkflowInstance")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/{workflow_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowInstanceRequest::getWorkspaceId,
                CreateWorkflowInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowInstanceRequest::getWorkflowId,
                CreateWorkflowInstanceRequest::setWorkflowId));
        builder.<AopInstanceEventData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AopInstanceEventData.class),
            f -> f.withMarshaller(CreateWorkflowInstanceRequest::getBody, CreateWorkflowInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspace =
        genForCreateWorkspace();

    private static HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> genForCreateWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateWorkspaceRequest, CreateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkspaceRequest.class, CreateWorkspaceResponse.class)
                .withName("CreateWorkspace")
                .withUri("/v1/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<CreateWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkspaceRequestBody.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, CreateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlertRequest, DeleteAlertResponse> deleteAlert = genForDeleteAlert();

    private static HttpRequestDef<DeleteAlertRequest, DeleteAlertResponse> genForDeleteAlert() {
        // basic
        HttpRequestDef.Builder<DeleteAlertRequest, DeleteAlertResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlertRequest.class, DeleteAlertResponse.class)
                .withName("DeleteAlert")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlertRequest::getWorkspaceId, DeleteAlertRequest::setWorkspaceId));
        builder.<DeleteAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAlertRequestBody.class),
            f -> f.withMarshaller(DeleteAlertRequest::getBody, DeleteAlertRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlertResponse::getXRequestId, DeleteAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRule =
        genForDeleteAlertRule();

    private static HttpRequestDef<DeleteAlertRuleRequest, DeleteAlertRuleResponse> genForDeleteAlertRule() {
        // basic
        HttpRequestDef.Builder<DeleteAlertRuleRequest, DeleteAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlertRuleRequest.class, DeleteAlertRuleResponse.class)
                .withName("DeleteAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlertRuleRequest::getWorkspaceId, DeleteAlertRuleRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteAlertRuleRequest::getBody, DeleteAlertRuleRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlertRuleResponse::getXRequestId, DeleteAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlertsRequest, DeleteAlertsResponse> deleteAlerts = genForDeleteAlerts();

    private static HttpRequestDef<DeleteAlertsRequest, DeleteAlertsResponse> genForDeleteAlerts() {
        // basic
        HttpRequestDef.Builder<DeleteAlertsRequest, DeleteAlertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteAlertsRequest.class, DeleteAlertsResponse.class)
                .withName("DeleteAlerts")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlertsRequest::getWorkspaceId, DeleteAlertsRequest::setWorkspaceId));
        builder.<DeleteAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAlertRequestBody.class),
            f -> f.withMarshaller(DeleteAlertsRequest::getBody, DeleteAlertsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAopWorkflowRequest, DeleteAopWorkflowResponse> deleteAopWorkflow =
        genForDeleteAopWorkflow();

    private static HttpRequestDef<DeleteAopWorkflowRequest, DeleteAopWorkflowResponse> genForDeleteAopWorkflow() {
        // basic
        HttpRequestDef.Builder<DeleteAopWorkflowRequest, DeleteAopWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAopWorkflowRequest.class, DeleteAopWorkflowResponse.class)
                .withName("DeleteAopWorkflow")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAopWorkflowRequest::getWorkspaceId, DeleteAopWorkflowRequest::setWorkspaceId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAopWorkflowRequest::getWorkflowId, DeleteAopWorkflowRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAopWorkflowVersionRequest, DeleteAopWorkflowVersionResponse> deleteAopWorkflowVersion =
        genForDeleteAopWorkflowVersion();

    private static HttpRequestDef<DeleteAopWorkflowVersionRequest, DeleteAopWorkflowVersionResponse> genForDeleteAopWorkflowVersion() {
        // basic
        HttpRequestDef.Builder<DeleteAopWorkflowVersionRequest, DeleteAopWorkflowVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAopWorkflowVersionRequest.class,
                    DeleteAopWorkflowVersionResponse.class)
                .withName("DeleteAopWorkflowVersion")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAopWorkflowVersionRequest::getWorkspaceId,
                DeleteAopWorkflowVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAopWorkflowVersionRequest::getVersionId,
                DeleteAopWorkflowVersionRequest::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCatalogueRequest, DeleteCatalogueResponse> deleteCatalogue =
        genForDeleteCatalogue();

    private static HttpRequestDef<DeleteCatalogueRequest, DeleteCatalogueResponse> genForDeleteCatalogue() {
        // basic
        HttpRequestDef.Builder<DeleteCatalogueRequest, DeleteCatalogueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCatalogueRequest.class, DeleteCatalogueResponse.class)
                .withName("DeleteCatalogue")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/catalogues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCatalogueRequest::getWorkspaceId, DeleteCatalogueRequest::setWorkspaceId));
        builder.<CatalogueDeleteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CatalogueDeleteRequestBody.class),
            f -> f.withMarshaller(DeleteCatalogueRequest::getBody, DeleteCatalogueRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCatalogueResponse::getXRequestId, DeleteCatalogueResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteClassifierRequest, DeleteClassifierResponse> deleteClassifier =
        genForDeleteClassifier();

    private static HttpRequestDef<DeleteClassifierRequest, DeleteClassifierResponse> genForDeleteClassifier() {
        // basic
        HttpRequestDef.Builder<DeleteClassifierRequest, DeleteClassifierResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClassifierRequest.class, DeleteClassifierResponse.class)
                .withName("DeleteClassifier")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/classifiers/{classifier_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClassifierRequest::getWorkspaceId, DeleteClassifierRequest::setWorkspaceId));
        builder.<String>withRequestField("classifier_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClassifierRequest::getClassifierId, DeleteClassifierRequest::setClassifierId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCollectorChannelRequest, DeleteCollectorChannelResponse> deleteCollectorChannel =
        genForDeleteCollectorChannel();

    private static HttpRequestDef<DeleteCollectorChannelRequest, DeleteCollectorChannelResponse> genForDeleteCollectorChannel() {
        // basic
        HttpRequestDef.Builder<DeleteCollectorChannelRequest, DeleteCollectorChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCollectorChannelRequest.class, DeleteCollectorChannelResponse.class)
            .withName("DeleteCollectorChannel")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/{channel_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCollectorChannelRequest::getWorkspaceId,
                DeleteCollectorChannelRequest::setWorkspaceId));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCollectorChannelRequest::getChannelId,
                DeleteCollectorChannelRequest::setChannelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCollectorChannelGroupRequest, DeleteCollectorChannelGroupResponse> deleteCollectorChannelGroup =
        genForDeleteCollectorChannelGroup();

    private static HttpRequestDef<DeleteCollectorChannelGroupRequest, DeleteCollectorChannelGroupResponse> genForDeleteCollectorChannelGroup() {
        // basic
        HttpRequestDef.Builder<DeleteCollectorChannelGroupRequest, DeleteCollectorChannelGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCollectorChannelGroupRequest.class,
                    DeleteCollectorChannelGroupResponse.class)
                .withName("DeleteCollectorChannelGroup")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCollectorChannelGroupRequest::getWorkspaceId,
                DeleteCollectorChannelGroupRequest::setWorkspaceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCollectorChannelGroupRequest::getGroupId,
                DeleteCollectorChannelGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCollectorConnectionRequest, DeleteCollectorConnectionResponse> deleteCollectorConnection =
        genForDeleteCollectorConnection();

    private static HttpRequestDef<DeleteCollectorConnectionRequest, DeleteCollectorConnectionResponse> genForDeleteCollectorConnection() {
        // basic
        HttpRequestDef.Builder<DeleteCollectorConnectionRequest, DeleteCollectorConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCollectorConnectionRequest.class,
                    DeleteCollectorConnectionResponse.class)
                .withName("DeleteCollectorConnection")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCollectorConnectionRequest::getWorkspaceId,
                DeleteCollectorConnectionRequest::setWorkspaceId));
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCollectorConnectionRequest::getConnectionId,
                DeleteCollectorConnectionRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCollectorParserRequest, DeleteCollectorParserResponse> deleteCollectorParser =
        genForDeleteCollectorParser();

    private static HttpRequestDef<DeleteCollectorParserRequest, DeleteCollectorParserResponse> genForDeleteCollectorParser() {
        // basic
        HttpRequestDef.Builder<DeleteCollectorParserRequest, DeleteCollectorParserResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCollectorParserRequest.class, DeleteCollectorParserResponse.class)
            .withName("DeleteCollectorParser")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/logstash/parsers/{parser_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCollectorParserRequest::getWorkspaceId,
                DeleteCollectorParserRequest::setWorkspaceId));
        builder.<String>withRequestField("parser_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCollectorParserRequest::getParserId,
                DeleteCollectorParserRequest::setParserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse> deleteComponentTemplate =
        genForDeleteComponentTemplate();

    private static HttpRequestDef<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse> genForDeleteComponentTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteComponentTemplateRequest.class, DeleteComponentTemplateResponse.class)
            .withName("DeleteComponentTemplate")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components/template/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentTemplateRequest::getWorkspaceId,
                DeleteComponentTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentTemplateRequest::getTemplateId,
                DeleteComponentTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationDictionariesRequest, DeleteConfigurationDictionariesResponse> deleteConfigurationDictionaries =
        genForDeleteConfigurationDictionaries();

    private static HttpRequestDef<DeleteConfigurationDictionariesRequest, DeleteConfigurationDictionariesResponse> genForDeleteConfigurationDictionaries() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationDictionariesRequest, DeleteConfigurationDictionariesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteConfigurationDictionariesRequest.class,
                    DeleteConfigurationDictionariesResponse.class)
                .withName("DeleteConfigurationDictionaries")
                .withUri("/v1/{project_id}/configurations/dictionaries")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationDictionariesRequest::getXLanguage,
                DeleteConfigurationDictionariesRequest::setXLanguage));
        builder.<DeleteDictionaryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDictionaryRequest.class),
            f -> f.withMarshaller(DeleteConfigurationDictionariesRequest::getBody,
                DeleteConfigurationDictionariesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnection =
        genForDeleteConnection();

    private static HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> genForDeleteConnection() {
        // basic
        HttpRequestDef.Builder<DeleteConnectionRequest, DeleteConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConnectionRequest.class, DeleteConnectionResponse.class)
                .withName("DeleteConnection")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/assetcredentials/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionRequest::getWorkspaceId, DeleteConnectionRequest::setWorkspaceId));
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionRequest::getAssetId, DeleteConnectionRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataclassTypeRequest, DeleteDataclassTypeResponse> deleteDataclassType =
        genForDeleteDataclassType();

    private static HttpRequestDef<DeleteDataclassTypeRequest, DeleteDataclassTypeResponse> genForDeleteDataclassType() {
        // basic
        HttpRequestDef.Builder<DeleteDataclassTypeRequest, DeleteDataclassTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDataclassTypeRequest.class, DeleteDataclassTypeResponse.class)
            .withName("DeleteDataclassType")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/dataclasses/{dataclass_id}/types")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataclassTypeRequest::getWorkspaceId,
                DeleteDataclassTypeRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataclassTypeRequest::getDataclassId,
                DeleteDataclassTypeRequest::setDataclassId));
        builder.<DeleteDataclassTypeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteDataclassTypeRequestBody.class),
            f -> f.withMarshaller(DeleteDataclassTypeRequest::getBody, DeleteDataclassTypeRequest::setBody));

        // response
        builder.<List<DeleteRelationResource>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteDataclassTypeResponse::getBody, DeleteDataclassTypeResponse::setBody)
                .withInnerContainerType(DeleteRelationResource.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> deleteDataobjectRelation =
        genForDeleteDataobjectRelation();

    private static HttpRequestDef<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> genForDeleteDataobjectRelation() {
        // basic
        HttpRequestDef.Builder<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDataobjectRelationRequest.class,
                    DeleteDataobjectRelationResponse.class)
                .withName("DeleteDataobjectRelation")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getWorkspaceId,
                DeleteDataobjectRelationRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getDataclassType,
                DeleteDataobjectRelationRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getDataObjectId,
                DeleteDataobjectRelationRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getRelatedDataclassType,
                DeleteDataobjectRelationRequest::setRelatedDataclassType));
        builder.<CreateDataobjectRelationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataobjectRelationRequestBody.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getBody, DeleteDataobjectRelationRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDataobjectRelationResponse::getXRequestId,
                DeleteDataobjectRelationResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataobjectsRequest, DeleteDataobjectsResponse> deleteDataobjects =
        genForDeleteDataobjects();

    private static HttpRequestDef<DeleteDataobjectsRequest, DeleteDataobjectsResponse> genForDeleteDataobjects() {
        // basic
        HttpRequestDef.Builder<DeleteDataobjectsRequest, DeleteDataobjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDataobjectsRequest.class, DeleteDataobjectsResponse.class)
                .withName("DeleteDataobjects")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectsRequest::getWorkspaceId, DeleteDataobjectsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectsRequest::getDataclassName,
                DeleteDataobjectsRequest::setDataclassName));
        builder.<DataObjectDeleteForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataObjectDeleteForm.class),
            f -> f.withMarshaller(DeleteDataobjectsRequest::getBody, DeleteDataobjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataspaceRequest, DeleteDataspaceResponse> deleteDataspace =
        genForDeleteDataspace();

    private static HttpRequestDef<DeleteDataspaceRequest, DeleteDataspaceResponse> genForDeleteDataspace() {
        // basic
        HttpRequestDef.Builder<DeleteDataspaceRequest, DeleteDataspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDataspaceRequest.class, DeleteDataspaceResponse.class)
                .withName("DeleteDataspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/dataspaces/{dataspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataspaceRequest::getWorkspaceId, DeleteDataspaceRequest::setWorkspaceId));
        builder.<String>withRequestField("dataspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataspaceRequest::getDataspaceId, DeleteDataspaceRequest::setDataspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncident =
        genForDeleteIncident();

    private static HttpRequestDef<DeleteIncidentRequest, DeleteIncidentResponse> genForDeleteIncident() {
        // basic
        HttpRequestDef.Builder<DeleteIncidentRequest, DeleteIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIncidentRequest.class, DeleteIncidentResponse.class)
                .withName("DeleteIncident")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIncidentRequest::getWorkspaceId, DeleteIncidentRequest::setWorkspaceId));
        builder.<DeleteIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIncidentRequestBody.class),
            f -> f.withMarshaller(DeleteIncidentRequest::getBody, DeleteIncidentRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIncidentResponse::getXRequestId, DeleteIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteIncidentsRequest, DeleteIncidentsResponse> deleteIncidents =
        genForDeleteIncidents();

    private static HttpRequestDef<DeleteIncidentsRequest, DeleteIncidentsResponse> genForDeleteIncidents() {
        // basic
        HttpRequestDef.Builder<DeleteIncidentsRequest, DeleteIncidentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteIncidentsRequest.class, DeleteIncidentsResponse.class)
                .withName("DeleteIncidents")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIncidentsRequest::getWorkspaceId, DeleteIncidentsRequest::setWorkspaceId));
        builder.<DeleteIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIncidentRequestBody.class),
            f -> f.withMarshaller(DeleteIncidentsRequest::getBody, DeleteIncidentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicator =
        genForDeleteIndicator();

    private static HttpRequestDef<DeleteIndicatorRequest, DeleteIndicatorResponse> genForDeleteIndicator() {
        // basic
        HttpRequestDef.Builder<DeleteIndicatorRequest, DeleteIndicatorResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIndicatorRequest.class, DeleteIndicatorResponse.class)
                .withName("DeleteIndicator")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIndicatorRequest::getWorkspaceId, DeleteIndicatorRequest::setWorkspaceId));
        builder.<DeleteIndicatorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIndicatorRequestBody.class),
            f -> f.withMarshaller(DeleteIndicatorRequest::getBody, DeleteIndicatorRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIndicatorResponse::getXRequestId, DeleteIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteLayoutWizardRequest, DeleteLayoutWizardResponse> deleteLayoutWizard =
        genForDeleteLayoutWizard();

    private static HttpRequestDef<DeleteLayoutWizardRequest, DeleteLayoutWizardResponse> genForDeleteLayoutWizard() {
        // basic
        HttpRequestDef.Builder<DeleteLayoutWizardRequest, DeleteLayoutWizardResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLayoutWizardRequest.class, DeleteLayoutWizardResponse.class)
                .withName("DeleteLayoutWizard")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/wizards/{wizard_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutWizardRequest::getWorkspaceId,
                DeleteLayoutWizardRequest::setWorkspaceId));
        builder.<String>withRequestField("wizard_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutWizardRequest::getWizardId, DeleteLayoutWizardRequest::setWizardId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLayoutWizardResponse::getXRequestId,
                DeleteLayoutWizardResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteLayoutsRequest, DeleteLayoutsResponse> deleteLayouts =
        genForDeleteLayouts();

    private static HttpRequestDef<DeleteLayoutsRequest, DeleteLayoutsResponse> genForDeleteLayouts() {
        // basic
        HttpRequestDef.Builder<DeleteLayoutsRequest, DeleteLayoutsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLayoutsRequest.class, DeleteLayoutsResponse.class)
                .withName("DeleteLayouts")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutsRequest::getWorkspaceId, DeleteLayoutsRequest::setWorkspaceId));
        builder.<LayoutDeleteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LayoutDeleteRequestBody.class),
            f -> f.withMarshaller(DeleteLayoutsRequest::getBody, DeleteLayoutsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLayoutsResponse::getXRequestId, DeleteLayoutsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteLtsCloudLogRequest, DeleteLtsCloudLogResponse> deleteLtsCloudLog =
        genForDeleteLtsCloudLog();

    private static HttpRequestDef<DeleteLtsCloudLogRequest, DeleteLtsCloudLogResponse> genForDeleteLtsCloudLog() {
        // basic
        HttpRequestDef.Builder<DeleteLtsCloudLogRequest, DeleteLtsCloudLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLtsCloudLogRequest.class, DeleteLtsCloudLogResponse.class)
                .withName("DeleteLtsCloudLog")
                .withUri("/v1/{project_id}/collector/cloudlogs/config/{csvc}/{source_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("csvc",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLtsCloudLogRequest::getCsvc, DeleteLtsCloudLogRequest::setCsvc));
        builder.<String>withRequestField("source_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLtsCloudLogRequest::getSourceName, DeleteLtsCloudLogRequest::setSourceName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMappingInfoRequest, DeleteMappingInfoResponse> deleteMappingInfo =
        genForDeleteMappingInfo();

    private static HttpRequestDef<DeleteMappingInfoRequest, DeleteMappingInfoResponse> genForDeleteMappingInfo() {
        // basic
        HttpRequestDef.Builder<DeleteMappingInfoRequest, DeleteMappingInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMappingInfoRequest.class, DeleteMappingInfoResponse.class)
                .withName("DeleteMappingInfo")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/{mapping_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mapping_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMappingInfoRequest::getMappingId, DeleteMappingInfoRequest::setMappingId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMappingInfoRequest::getWorkspaceId, DeleteMappingInfoRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMetricsRequest, DeleteMetricsResponse> deleteMetrics =
        genForDeleteMetrics();

    private static HttpRequestDef<DeleteMetricsRequest, DeleteMetricsResponse> genForDeleteMetrics() {
        // basic
        HttpRequestDef.Builder<DeleteMetricsRequest, DeleteMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMetricsRequest.class, DeleteMetricsResponse.class)
                .withName("DeleteMetrics")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/metrics/{metric_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMetricsRequest::getWorkspaceId, DeleteMetricsRequest::setWorkspaceId));
        builder.<String>withRequestField("metric_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMetricsRequest::getMetricId, DeleteMetricsRequest::setMetricId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteMetricsResponse::getXRequestId, DeleteMetricsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteModuleRequest, DeleteModuleResponse> deleteModule = genForDeleteModule();

    private static HttpRequestDef<DeleteModuleRequest, DeleteModuleResponse> genForDeleteModule() {
        // basic
        HttpRequestDef.Builder<DeleteModuleRequest, DeleteModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteModuleRequest.class, DeleteModuleResponse.class)
                .withName("DeleteModule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/modules/{module_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModuleRequest::getWorkspaceId, DeleteModuleRequest::setWorkspaceId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModuleRequest::getModuleId, DeleteModuleRequest::setModuleId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteModuleResponse::getXRequestId, DeleteModuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> deleteNode = genForDeleteNode();

    private static HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> genForDeleteNode() {
        // basic
        HttpRequestDef.Builder<DeleteNodeRequest, DeleteNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNodeRequest.class, DeleteNodeResponse.class)
                .withName("DeleteNode")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeRequest::getWorkspaceId, DeleteNodeRequest::setWorkspaceId));
        builder.<DeleteNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteNodeRequestBody.class),
            f -> f.withMarshaller(DeleteNodeRequest::getBody, DeleteNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotesRequest, DeleteNotesResponse> deleteNotes = genForDeleteNotes();

    private static HttpRequestDef<DeleteNotesRequest, DeleteNotesResponse> genForDeleteNotes() {
        // basic
        HttpRequestDef.Builder<DeleteNotesRequest, DeleteNotesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNotesRequest.class, DeleteNotesResponse.class)
                .withName("DeleteNotes")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/notes")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotesRequest::getWorkspaceId, DeleteNotesRequest::setWorkspaceId));
        builder.<DeleteNoteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteNoteRequestBody.class),
            f -> f.withMarshaller(DeleteNotesRequest::getBody, DeleteNotesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipeRequest, DeletePipeResponse> deletePipe = genForDeletePipe();

    private static HttpRequestDef<DeletePipeRequest, DeletePipeResponse> genForDeletePipe() {
        // basic
        HttpRequestDef.Builder<DeletePipeRequest, DeletePipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePipeRequest.class, DeletePipeResponse.class)
                .withName("DeletePipe")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipeRequest::getWorkspaceId, DeletePipeRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipeRequest::getPipeId, DeletePipeRequest::setPipeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePipeConsumptionRequest, DeletePipeConsumptionResponse> deletePipeConsumption =
        genForDeletePipeConsumption();

    private static HttpRequestDef<DeletePipeConsumptionRequest, DeletePipeConsumptionResponse> genForDeletePipeConsumption() {
        // basic
        HttpRequestDef.Builder<DeletePipeConsumptionRequest, DeletePipeConsumptionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePipeConsumptionRequest.class, DeletePipeConsumptionResponse.class)
            .withName("DeletePipeConsumption")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}/consumption")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipeConsumptionRequest::getWorkspaceId,
                DeletePipeConsumptionRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePipeConsumptionRequest::getPipeId, DeletePipeConsumptionRequest::setPipeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybook =
        genForDeletePlaybook();

    private static HttpRequestDef<DeletePlaybookRequest, DeletePlaybookResponse> genForDeletePlaybook() {
        // basic
        HttpRequestDef.Builder<DeletePlaybookRequest, DeletePlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePlaybookRequest.class, DeletePlaybookResponse.class)
                .withName("DeletePlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRequest::getWorkspaceId, DeletePlaybookRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRequest::getPlaybookId, DeletePlaybookRequest::setPlaybookId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookResponse::getXRequestId, DeletePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookAction =
        genForDeletePlaybookAction();

    private static HttpRequestDef<DeletePlaybookActionRequest, DeletePlaybookActionResponse> genForDeletePlaybookAction() {
        // basic
        HttpRequestDef.Builder<DeletePlaybookActionRequest, DeletePlaybookActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePlaybookActionRequest.class, DeletePlaybookActionResponse.class)
            .withName("DeletePlaybookAction")
            .withUri(
                "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/actions/{action_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookActionRequest::getWorkspaceId,
                DeletePlaybookActionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookActionRequest::getVersionId,
                DeletePlaybookActionRequest::setVersionId));
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookActionRequest::getActionId, DeletePlaybookActionRequest::setActionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookActionResponse::getXRequestId,
                DeletePlaybookActionResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookActionResponse::getXAPIDeprecationInfo,
                DeletePlaybookActionResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookActionResponse::getXAPIDeprecationDate,
                DeletePlaybookActionResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRule =
        genForDeletePlaybookRule();

    private static HttpRequestDef<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> genForDeletePlaybookRule() {
        // basic
        HttpRequestDef.Builder<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePlaybookRuleRequest.class, DeletePlaybookRuleResponse.class)
                .withName("DeletePlaybookRule")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getWorkspaceId,
                DeletePlaybookRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getVersionId, DeletePlaybookRuleRequest::setVersionId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getRuleId, DeletePlaybookRuleRequest::setRuleId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookRuleResponse::getXRequestId,
                DeletePlaybookRuleResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookRuleResponse::getXAPIDeprecationInfo,
                DeletePlaybookRuleResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookRuleResponse::getXAPIDeprecationDate,
                DeletePlaybookRuleResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersion =
        genForDeletePlaybookVersion();

    private static HttpRequestDef<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> genForDeletePlaybookVersion() {
        // basic
        HttpRequestDef.Builder<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePlaybookVersionRequest.class, DeletePlaybookVersionResponse.class)
            .withName("DeletePlaybookVersion")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookVersionRequest::getWorkspaceId,
                DeletePlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookVersionRequest::getVersionId,
                DeletePlaybookVersionRequest::setVersionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookVersionResponse::getXRequestId,
                DeletePlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePoliciesRequest, DeletePoliciesResponse> deletePolicies =
        genForDeletePolicies();

    private static HttpRequestDef<DeletePoliciesRequest, DeletePoliciesResponse> genForDeletePolicies() {
        // basic
        HttpRequestDef.Builder<DeletePoliciesRequest, DeletePoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeletePoliciesRequest.class, DeletePoliciesResponse.class)
                .withName("DeletePolicies")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/policys/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePoliciesRequest::getWorkspaceId, DeletePoliciesRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Secmaster-Version",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePoliciesRequest::getXSecmasterVersion,
                DeletePoliciesRequest::setXSecmasterVersion));
        builder.<DeletePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeletePolicyRequestBody.class),
            f -> f.withMarshaller(DeletePoliciesRequest::getBody, DeletePoliciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReportRequest, DeleteReportResponse> deleteReport = genForDeleteReport();

    private static HttpRequestDef<DeleteReportRequest, DeleteReportResponse> genForDeleteReport() {
        // basic
        HttpRequestDef.Builder<DeleteReportRequest, DeleteReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteReportRequest.class, DeleteReportResponse.class)
                .withName("DeleteReport")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/reports/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReportRequest::getWorkspaceId, DeleteReportRequest::setWorkspaceId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReportRequest::getReportId, DeleteReportRequest::setReportId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteReportResponse::getBody, DeleteReportResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteReportResponse::getXRequestId, DeleteReportResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource =
        genForDeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genForDeleteResource() {
        // basic
        HttpRequestDef.Builder<DeleteResourceRequest, DeleteResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceRequest.class, DeleteResourceResponse.class)
                .withName("DeleteResource")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getWorkspaceId, DeleteResourceRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getXLanguage, DeleteResourceRequest::setXLanguage));
        builder.<DeleteResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteResourceRequestBody.class),
            f -> f.withMarshaller(DeleteResourceRequest::getBody, DeleteResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSearchConditionRequest, DeleteSearchConditionResponse> deleteSearchCondition =
        genForDeleteSearchCondition();

    private static HttpRequestDef<DeleteSearchConditionRequest, DeleteSearchConditionResponse> genForDeleteSearchCondition() {
        // basic
        HttpRequestDef.Builder<DeleteSearchConditionRequest, DeleteSearchConditionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSearchConditionRequest.class, DeleteSearchConditionResponse.class)
            .withName("DeleteSearchCondition")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/search/conditions/{condition_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSearchConditionRequest::getWorkspaceId,
                DeleteSearchConditionRequest::setWorkspaceId));
        builder.<String>withRequestField("condition_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSearchConditionRequest::getConditionId,
                DeleteSearchConditionRequest::setConditionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteShipperRequest, DeleteShipperResponse> deleteShipper =
        genForDeleteShipper();

    private static HttpRequestDef<DeleteShipperRequest, DeleteShipperResponse> genForDeleteShipper() {
        // basic
        HttpRequestDef.Builder<DeleteShipperRequest, DeleteShipperResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteShipperRequest.class, DeleteShipperResponse.class)
                .withName("DeleteShipper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteShipperRequest::getWorkspaceId, DeleteShipperRequest::setWorkspaceId));
        builder.<DeleteShipperRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteShipperRequestBody.class),
            f -> f.withMarshaller(DeleteShipperRequest::getBody, DeleteShipperRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSingleMapperRequest, DeleteSingleMapperResponse> deleteSingleMapper =
        genForDeleteSingleMapper();

    private static HttpRequestDef<DeleteSingleMapperRequest, DeleteSingleMapperResponse> genForDeleteSingleMapper() {
        // basic
        HttpRequestDef.Builder<DeleteSingleMapperRequest, DeleteSingleMapperResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSingleMapperRequest.class, DeleteSingleMapperResponse.class)
                .withName("DeleteSingleMapper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/mappers/{mapper_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSingleMapperRequest::getWorkspaceId,
                DeleteSingleMapperRequest::setWorkspaceId));
        builder.<String>withRequestField("mapper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSingleMapperRequest::getMapperId, DeleteSingleMapperRequest::setMapperId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubscriptionOrderRequest, DeleteSubscriptionOrderResponse> deleteSubscriptionOrder =
        genForDeleteSubscriptionOrder();

    private static HttpRequestDef<DeleteSubscriptionOrderRequest, DeleteSubscriptionOrderResponse> genForDeleteSubscriptionOrder() {
        // basic
        HttpRequestDef.Builder<DeleteSubscriptionOrderRequest, DeleteSubscriptionOrderResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSubscriptionOrderRequest.class, DeleteSubscriptionOrderResponse.class)
            .withName("DeleteSubscriptionOrder")
            .withUri("/v1/{project_id}/subscriptions/orders")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubscriptionOrderRequest::getXLanguage,
                DeleteSubscriptionOrderRequest::setXLanguage));
        builder.<UnsubscribeParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnsubscribeParam.class),
            f -> f.withMarshaller(DeleteSubscriptionOrderRequest::getBody, DeleteSubscriptionOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagsRequest, DeleteTagsResponse> deleteTags = genForDeleteTags();

    private static HttpRequestDef<DeleteTagsRequest, DeleteTagsResponse> genForDeleteTags() {
        // basic
        HttpRequestDef.Builder<DeleteTagsRequest, DeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTagsRequest.class, DeleteTagsResponse.class)
                .withName("DeleteTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagsRequest::getResourceType, DeleteTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagsRequest::getResourceId, DeleteTagsRequest::setResourceId));
        builder.<AlterResourceTagsInBatchesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlterResourceTagsInBatchesRequestBody.class),
            f -> f.withMarshaller(DeleteTagsRequest::getBody, DeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspace =
        genForDeleteWorkspace();

    private static HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> genForDeleteWorkspace() {
        // basic
        HttpRequestDef.Builder<DeleteWorkspaceRequest, DeleteWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkspaceRequest.class, DeleteWorkspaceResponse.class)
                .withName("DeleteWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspaceRequest::getWorkspaceId, DeleteWorkspaceRequest::setWorkspaceId));
        builder.<Boolean>withRequestField("permanent_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteWorkspaceRequest::getPermanentDelete,
                DeleteWorkspaceRequest::setPermanentDelete));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRule =
        genForDisableAlertRule();

    private static HttpRequestDef<DisableAlertRuleRequest, DisableAlertRuleResponse> genForDisableAlertRule() {
        // basic
        HttpRequestDef.Builder<DisableAlertRuleRequest, DisableAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableAlertRuleRequest.class, DisableAlertRuleResponse.class)
                .withName("DisableAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableAlertRuleRequest::getWorkspaceId, DisableAlertRuleRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DisableAlertRuleRequest::getBody, DisableAlertRuleRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisableAlertRuleResponse::getXRequestId, DisableAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DownloadAlertTemplateRequest, DownloadAlertTemplateResponse> downloadAlertTemplate =
        genForDownloadAlertTemplate();

    private static HttpRequestDef<DownloadAlertTemplateRequest, DownloadAlertTemplateResponse> genForDownloadAlertTemplate() {
        // basic
        HttpRequestDef.Builder<DownloadAlertTemplateRequest, DownloadAlertTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadAlertTemplateRequest.class, DownloadAlertTemplateResponse.class)
            .withName("DownloadAlertTemplate")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/template/download")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAlertTemplateRequest::getWorkspaceId,
                DownloadAlertTemplateRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachment =
        genForDownloadAttachment();

    private static HttpRequestDef<DownloadAttachmentRequest, DownloadAttachmentResponse> genForDownloadAttachment() {
        // basic
        HttpRequestDef.Builder<DownloadAttachmentRequest, DownloadAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAttachmentRequest.class, DownloadAttachmentResponse.class)
                .withName("DownloadAttachment")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/attachment/{attach_id}/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getWorkspaceId,
                DownloadAttachmentRequest::setWorkspaceId));
        builder.<String>withRequestField("attach_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getAttachId, DownloadAttachmentRequest::setAttachId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadIncidentTemplateRequest, DownloadIncidentTemplateResponse> downloadIncidentTemplate =
        genForDownloadIncidentTemplate();

    private static HttpRequestDef<DownloadIncidentTemplateRequest, DownloadIncidentTemplateResponse> genForDownloadIncidentTemplate() {
        // basic
        HttpRequestDef.Builder<DownloadIncidentTemplateRequest, DownloadIncidentTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, DownloadIncidentTemplateRequest.class, DownloadIncidentTemplateResponse.class)
                .withName("DownloadIncidentTemplate")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/template/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadIncidentTemplateRequest::getWorkspaceId,
                DownloadIncidentTemplateRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadIndicatorTemplateRequest, DownloadIndicatorTemplateResponse> downloadIndicatorTemplate =
        genForDownloadIndicatorTemplate();

    private static HttpRequestDef<DownloadIndicatorTemplateRequest, DownloadIndicatorTemplateResponse> genForDownloadIndicatorTemplate() {
        // basic
        HttpRequestDef.Builder<DownloadIndicatorTemplateRequest, DownloadIndicatorTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DownloadIndicatorTemplateRequest.class,
                    DownloadIndicatorTemplateResponse.class)
                .withName("DownloadIndicatorTemplate")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/template/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadIndicatorTemplateRequest::getWorkspaceId,
                DownloadIndicatorTemplateRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadResourceTemplateRequest, DownloadResourceTemplateResponse> downloadResourceTemplate =
        genForDownloadResourceTemplate();

    private static HttpRequestDef<DownloadResourceTemplateRequest, DownloadResourceTemplateResponse> genForDownloadResourceTemplate() {
        // basic
        HttpRequestDef.Builder<DownloadResourceTemplateRequest, DownloadResourceTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, DownloadResourceTemplateRequest.class, DownloadResourceTemplateResponse.class)
                .withName("DownloadResourceTemplate")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/resources/template/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadResourceTemplateRequest::getWorkspaceId,
                DownloadResourceTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadResourceTemplateRequest::getType, DownloadResourceTemplateRequest::setType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadResourceTemplateRequest::getXLanguage,
                DownloadResourceTemplateRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadVulnerabilityTemplateRequest, DownloadVulnerabilityTemplateResponse> downloadVulnerabilityTemplate =
        genForDownloadVulnerabilityTemplate();

    private static HttpRequestDef<DownloadVulnerabilityTemplateRequest, DownloadVulnerabilityTemplateResponse> genForDownloadVulnerabilityTemplate() {
        // basic
        HttpRequestDef.Builder<DownloadVulnerabilityTemplateRequest, DownloadVulnerabilityTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DownloadVulnerabilityTemplateRequest.class,
                    DownloadVulnerabilityTemplateResponse.class)
                .withName("DownloadVulnerabilityTemplate")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/vulnerability/template/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadVulnerabilityTemplateRequest::getWorkspaceId,
                DownloadVulnerabilityTemplateRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRule =
        genForEnableAlertRule();

    private static HttpRequestDef<EnableAlertRuleRequest, EnableAlertRuleResponse> genForEnableAlertRule() {
        // basic
        HttpRequestDef.Builder<EnableAlertRuleRequest, EnableAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableAlertRuleRequest.class, EnableAlertRuleResponse.class)
                .withName("EnableAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableAlertRuleRequest::getWorkspaceId, EnableAlertRuleRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(EnableAlertRuleRequest::getBody, EnableAlertRuleRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnableAlertRuleResponse::getXRequestId, EnableAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<EnableDataclassTypeRequest, EnableDataclassTypeResponse> enableDataclassType =
        genForEnableDataclassType();

    private static HttpRequestDef<EnableDataclassTypeRequest, EnableDataclassTypeResponse> genForEnableDataclassType() {
        // basic
        HttpRequestDef.Builder<EnableDataclassTypeRequest, EnableDataclassTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableDataclassTypeRequest.class, EnableDataclassTypeResponse.class)
                .withName("EnableDataclassType")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/dataclasses/{dataclass_id}/types/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDataclassTypeRequest::getWorkspaceId,
                EnableDataclassTypeRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDataclassTypeRequest::getDataclassId,
                EnableDataclassTypeRequest::setDataclassId));
        builder.<EnableDataclassTypeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnableDataclassTypeRequestBody.class),
            f -> f.withMarshaller(EnableDataclassTypeRequest::getBody, EnableDataclassTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteLayoutRequest, ExecuteLayoutResponse> executeLayout =
        genForExecuteLayout();

    private static HttpRequestDef<ExecuteLayoutRequest, ExecuteLayoutResponse> genForExecuteLayout() {
        // basic
        HttpRequestDef.Builder<ExecuteLayoutRequest, ExecuteLayoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteLayoutRequest.class, ExecuteLayoutResponse.class)
                .withName("ExecuteLayout")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/action")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteLayoutRequest::getWorkspaceId, ExecuteLayoutRequest::setWorkspaceId));
        builder.<ExecuteLayoutRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteLayoutRequestBody.class),
            f -> f.withMarshaller(ExecuteLayoutRequest::getBody, ExecuteLayoutRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExecuteLayoutResponse::getXRequestId, ExecuteLayoutResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ExecuteReportActionRequest, ExecuteReportActionResponse> executeReportAction =
        genForExecuteReportAction();

    private static HttpRequestDef<ExecuteReportActionRequest, ExecuteReportActionResponse> genForExecuteReportAction() {
        // basic
        HttpRequestDef.Builder<ExecuteReportActionRequest, ExecuteReportActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteReportActionRequest.class, ExecuteReportActionResponse.class)
                .withName("ExecuteReportAction")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/reports/{report_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteReportActionRequest::getWorkspaceId,
                ExecuteReportActionRequest::setWorkspaceId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteReportActionRequest::getReportId, ExecuteReportActionRequest::setReportId));
        builder.<ExecuteReportActionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteReportActionInfo.class),
            f -> f.withMarshaller(ExecuteReportActionRequest::getBody, ExecuteReportActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportAlertsRequest, ExportAlertsResponse> exportAlerts = genForExportAlerts();

    private static HttpRequestDef<ExportAlertsRequest, ExportAlertsResponse> genForExportAlerts() {
        // basic
        HttpRequestDef.Builder<ExportAlertsRequest, ExportAlertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportAlertsRequest.class, ExportAlertsResponse.class)
                .withName("ExportAlerts")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAlertsRequest::getWorkspaceId, ExportAlertsRequest::setWorkspaceId));
        builder.<ExportAlertsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportAlertsRequestBody.class),
            f -> f.withMarshaller(ExportAlertsRequest::getBody, ExportAlertsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportAopworkflowRequest, ExportAopworkflowResponse> exportAopworkflow =
        genForExportAopworkflow();

    private static HttpRequestDef<ExportAopworkflowRequest, ExportAopworkflowResponse> genForExportAopworkflow() {
        // basic
        HttpRequestDef.Builder<ExportAopworkflowRequest, ExportAopworkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportAopworkflowRequest.class, ExportAopworkflowResponse.class)
                .withName("ExportAopworkflow")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAopworkflowRequest::getWorkspaceId, ExportAopworkflowRequest::setWorkspaceId));
        builder.<ExportAopworkflowInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportAopworkflowInfo.class),
            f -> f.withMarshaller(ExportAopworkflowRequest::getBody, ExportAopworkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCollectorParserRequest, ExportCollectorParserResponse> exportCollectorParser =
        genForExportCollectorParser();

    private static HttpRequestDef<ExportCollectorParserRequest, ExportCollectorParserResponse> genForExportCollectorParser() {
        // basic
        HttpRequestDef.Builder<ExportCollectorParserRequest, ExportCollectorParserResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportCollectorParserRequest.class, ExportCollectorParserResponse.class)
            .withName("ExportCollectorParser")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/logstash/parsers/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCollectorParserRequest::getWorkspaceId,
                ExportCollectorParserRequest::setWorkspaceId));
        builder.<ExportParserDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportParserDto.class),
            f -> f.withMarshaller(ExportCollectorParserRequest::getBody, ExportCollectorParserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDataobjectsRequest, ExportDataobjectsResponse> exportDataobjects =
        genForExportDataobjects();

    private static HttpRequestDef<ExportDataobjectsRequest, ExportDataobjectsResponse> genForExportDataobjects() {
        // basic
        HttpRequestDef.Builder<ExportDataobjectsRequest, ExportDataobjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportDataobjectsRequest.class, ExportDataobjectsResponse.class)
                .withName("ExportDataobjects")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_name}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDataobjectsRequest::getWorkspaceId, ExportDataobjectsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDataobjectsRequest::getDataclassName,
                ExportDataobjectsRequest::setDataclassName));
        builder.<CommonDataObjectExportRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommonDataObjectExportRequest.class),
            f -> f.withMarshaller(ExportDataobjectsRequest::getBody, ExportDataobjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportIncidentsRequest, ExportIncidentsResponse> exportIncidents =
        genForExportIncidents();

    private static HttpRequestDef<ExportIncidentsRequest, ExportIncidentsResponse> genForExportIncidents() {
        // basic
        HttpRequestDef.Builder<ExportIncidentsRequest, ExportIncidentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportIncidentsRequest.class, ExportIncidentsResponse.class)
                .withName("ExportIncidents")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportIncidentsRequest::getWorkspaceId, ExportIncidentsRequest::setWorkspaceId));
        builder.<ExportIncidentsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportIncidentsRequestBody.class),
            f -> f.withMarshaller(ExportIncidentsRequest::getBody, ExportIncidentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportIndicatorsRequest, ExportIndicatorsResponse> exportIndicators =
        genForExportIndicators();

    private static HttpRequestDef<ExportIndicatorsRequest, ExportIndicatorsResponse> genForExportIndicators() {
        // basic
        HttpRequestDef.Builder<ExportIndicatorsRequest, ExportIndicatorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportIndicatorsRequest.class, ExportIndicatorsResponse.class)
                .withName("ExportIndicators")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportIndicatorsRequest::getWorkspaceId, ExportIndicatorsRequest::setWorkspaceId));
        builder.<ExportIndicatorsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportIndicatorsRequestBody.class),
            f -> f.withMarshaller(ExportIndicatorsRequest::getBody, ExportIndicatorsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportPlaybookRequest, ExportPlaybookResponse> exportPlaybook =
        genForExportPlaybook();

    private static HttpRequestDef<ExportPlaybookRequest, ExportPlaybookResponse> genForExportPlaybook() {
        // basic
        HttpRequestDef.Builder<ExportPlaybookRequest, ExportPlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportPlaybookRequest.class, ExportPlaybookResponse.class)
                .withName("ExportPlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportPlaybookRequest::getWorkspaceId, ExportPlaybookRequest::setWorkspaceId));
        builder.<ExportPlaybook>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportPlaybook.class),
            f -> f.withMarshaller(ExportPlaybookRequest::getBody, ExportPlaybookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportResourcesRequest, ExportResourcesResponse> exportResources =
        genForExportResources();

    private static HttpRequestDef<ExportResourcesRequest, ExportResourcesResponse> genForExportResources() {
        // basic
        HttpRequestDef.Builder<ExportResourcesRequest, ExportResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportResourcesRequest.class, ExportResourcesResponse.class)
                .withName("ExportResources")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/resources/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportResourcesRequest::getWorkspaceId, ExportResourcesRequest::setWorkspaceId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportResourcesRequest::getType, ExportResourcesRequest::setType));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportResourcesRequest::getProvider, ExportResourcesRequest::setProvider));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportResourcesRequest::getXLanguage, ExportResourcesRequest::setXLanguage));
        builder.<ExportResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportResourcesRequestBody.class),
            f -> f.withMarshaller(ExportResourcesRequest::getBody, ExportResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportVulnerabilitiesRequest, ExportVulnerabilitiesResponse> exportVulnerabilities =
        genForExportVulnerabilities();

    private static HttpRequestDef<ExportVulnerabilitiesRequest, ExportVulnerabilitiesResponse> genForExportVulnerabilities() {
        // basic
        HttpRequestDef.Builder<ExportVulnerabilitiesRequest, ExportVulnerabilitiesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportVulnerabilitiesRequest.class, ExportVulnerabilitiesResponse.class)
            .withName("ExportVulnerabilities")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/vulnerability/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulnerabilitiesRequest::getWorkspaceId,
                ExportVulnerabilitiesRequest::setWorkspaceId));
        builder.<ExportVulnerabilitiesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportVulnerabilitiesRequestBody.class),
            f -> f.withMarshaller(ExportVulnerabilitiesRequest::getBody, ExportVulnerabilitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleShipperAuthorizationRequest, HandleShipperAuthorizationResponse> handleShipperAuthorization =
        genForHandleShipperAuthorization();

    private static HttpRequestDef<HandleShipperAuthorizationRequest, HandleShipperAuthorizationResponse> genForHandleShipperAuthorization() {
        // basic
        HttpRequestDef.Builder<HandleShipperAuthorizationRequest, HandleShipperAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    HandleShipperAuthorizationRequest.class,
                    HandleShipperAuthorizationResponse.class)
                .withName("HandleShipperAuthorization")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/authorizations/handle")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandleShipperAuthorizationRequest::getWorkspaceId,
                HandleShipperAuthorizationRequest::setWorkspaceId));
        builder.<AuthorizeHandlerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeHandlerRequestBody.class),
            f -> f.withMarshaller(HandleShipperAuthorizationRequest::getBody,
                HandleShipperAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportAlertsRequest, ImportAlertsResponse> importAlerts = genForImportAlerts();

    private static HttpRequestDef<ImportAlertsRequest, ImportAlertsResponse> genForImportAlerts() {
        // basic
        HttpRequestDef.Builder<ImportAlertsRequest, ImportAlertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportAlertsRequest.class, ImportAlertsResponse.class)
                .withName("ImportAlerts")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportAlertsRequest::getWorkspaceId, ImportAlertsRequest::setWorkspaceId));
        builder.<ImportAlertsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportAlertsRequestBody.class),
            f -> f.withMarshaller(ImportAlertsRequest::getBody, ImportAlertsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportAopworkflowRequest, ImportAopworkflowResponse> importAopworkflow =
        genForImportAopworkflow();

    private static HttpRequestDef<ImportAopworkflowRequest, ImportAopworkflowResponse> genForImportAopworkflow() {
        // basic
        HttpRequestDef.Builder<ImportAopworkflowRequest, ImportAopworkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportAopworkflowRequest.class, ImportAopworkflowResponse.class)
                .withName("ImportAopworkflow")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportAopworkflowRequest::getWorkspaceId, ImportAopworkflowRequest::setWorkspaceId));
        builder.<ImportAopworkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportAopworkflowRequestBody.class),
            f -> f.withMarshaller(ImportAopworkflowRequest::getBody, ImportAopworkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportCollectorParserRequest, ImportCollectorParserResponse> importCollectorParser =
        genForImportCollectorParser();

    private static HttpRequestDef<ImportCollectorParserRequest, ImportCollectorParserResponse> genForImportCollectorParser() {
        // basic
        HttpRequestDef.Builder<ImportCollectorParserRequest, ImportCollectorParserResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ImportCollectorParserRequest.class, ImportCollectorParserResponse.class)
            .withName("ImportCollectorParser")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/logstash/parsers/import")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportCollectorParserRequest::getWorkspaceId,
                ImportCollectorParserRequest::setWorkspaceId));
        builder.<ImportCollectorParserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportCollectorParserRequestBody.class),
            f -> f.withMarshaller(ImportCollectorParserRequest::getBody, ImportCollectorParserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDataobjectsRequest, ImportDataobjectsResponse> importDataobjects =
        genForImportDataobjects();

    private static HttpRequestDef<ImportDataobjectsRequest, ImportDataobjectsResponse> genForImportDataobjects() {
        // basic
        HttpRequestDef.Builder<ImportDataobjectsRequest, ImportDataobjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportDataobjectsRequest.class, ImportDataobjectsResponse.class)
                .withName("ImportDataobjects")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_name}/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDataobjectsRequest::getWorkspaceId, ImportDataobjectsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDataobjectsRequest::getDataclassName,
                ImportDataobjectsRequest::setDataclassName));
        builder.<ImportDataobjectsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportDataobjectsRequestBody.class),
            f -> f.withMarshaller(ImportDataobjectsRequest::getBody, ImportDataobjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportIncidentsRequest, ImportIncidentsResponse> importIncidents =
        genForImportIncidents();

    private static HttpRequestDef<ImportIncidentsRequest, ImportIncidentsResponse> genForImportIncidents() {
        // basic
        HttpRequestDef.Builder<ImportIncidentsRequest, ImportIncidentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportIncidentsRequest.class, ImportIncidentsResponse.class)
                .withName("ImportIncidents")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportIncidentsRequest::getWorkspaceId, ImportIncidentsRequest::setWorkspaceId));
        builder.<ImportIncidentsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportIncidentsRequestBody.class),
            f -> f.withMarshaller(ImportIncidentsRequest::getBody, ImportIncidentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportIndicatorsRequest, ImportIndicatorsResponse> importIndicators =
        genForImportIndicators();

    private static HttpRequestDef<ImportIndicatorsRequest, ImportIndicatorsResponse> genForImportIndicators() {
        // basic
        HttpRequestDef.Builder<ImportIndicatorsRequest, ImportIndicatorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportIndicatorsRequest.class, ImportIndicatorsResponse.class)
                .withName("ImportIndicators")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportIndicatorsRequest::getWorkspaceId, ImportIndicatorsRequest::setWorkspaceId));
        builder.<ImportIndicatorsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportIndicatorsRequestBody.class),
            f -> f.withMarshaller(ImportIndicatorsRequest::getBody, ImportIndicatorsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportPlaybookRequest, ImportPlaybookResponse> importPlaybook =
        genForImportPlaybook();

    private static HttpRequestDef<ImportPlaybookRequest, ImportPlaybookResponse> genForImportPlaybook() {
        // basic
        HttpRequestDef.Builder<ImportPlaybookRequest, ImportPlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportPlaybookRequest.class, ImportPlaybookResponse.class)
                .withName("ImportPlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportPlaybookRequest::getWorkspaceId, ImportPlaybookRequest::setWorkspaceId));
        builder.<ImportPlaybookRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportPlaybookRequestBody.class),
            f -> f.withMarshaller(ImportPlaybookRequest::getBody, ImportPlaybookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportResourceRequest, ImportResourceResponse> importResource =
        genForImportResource();

    private static HttpRequestDef<ImportResourceRequest, ImportResourceResponse> genForImportResource() {
        // basic
        HttpRequestDef.Builder<ImportResourceRequest, ImportResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportResourceRequest.class, ImportResourceResponse.class)
                .withName("ImportResource")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/resources/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportResourceRequest::getWorkspaceId, ImportResourceRequest::setWorkspaceId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportResourceRequest::getType, ImportResourceRequest::setType));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportResourceRequest::getProvider, ImportResourceRequest::setProvider));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportResourceRequest::getXLanguage, ImportResourceRequest::setXLanguage));
        builder.<ImportResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportResourceRequestBody.class),
            f -> f.withMarshaller(ImportResourceRequest::getBody, ImportResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportVulnerabilitiesRequest, ImportVulnerabilitiesResponse> importVulnerabilities =
        genForImportVulnerabilities();

    private static HttpRequestDef<ImportVulnerabilitiesRequest, ImportVulnerabilitiesResponse> genForImportVulnerabilities() {
        // basic
        HttpRequestDef.Builder<ImportVulnerabilitiesRequest, ImportVulnerabilitiesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ImportVulnerabilitiesRequest.class, ImportVulnerabilitiesResponse.class)
            .withName("ImportVulnerabilities")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/vulnerability/import")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportVulnerabilitiesRequest::getWorkspaceId,
                ImportVulnerabilitiesRequest::setWorkspaceId));
        builder.<ImportVulnerabilitiesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportVulnerabilitiesRequestBody.class),
            f -> f.withMarshaller(ImportVulnerabilitiesRequest::getBody, ImportVulnerabilitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetrics =
        genForListAlertRuleMetrics();

    private static HttpRequestDef<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> genForListAlertRuleMetrics() {
        // basic
        HttpRequestDef.Builder<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAlertRuleMetricsRequest.class, ListAlertRuleMetricsResponse.class)
            .withName("ListAlertRuleMetrics")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/metrics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleMetricsRequest::getWorkspaceId,
                ListAlertRuleMetricsRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertRuleMetricsResponse::getXRequestId,
                ListAlertRuleMetricsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> listAlertRuleTemplateMetrics =
        genForListAlertRuleTemplateMetrics();

    private static HttpRequestDef<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> genForListAlertRuleTemplateMetrics() {
        // basic
        HttpRequestDef.Builder<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAlertRuleTemplateMetricsRequest.class,
                    ListAlertRuleTemplateMetricsResponse.class)
                .withName("ListAlertRuleTemplateMetrics")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/templates/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplateMetricsRequest::getWorkspaceId,
                ListAlertRuleTemplateMetricsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplates =
        genForListAlertRuleTemplates();

    private static HttpRequestDef<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> genForListAlertRuleTemplates() {
        // basic
        HttpRequestDef.Builder<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAlertRuleTemplatesRequest.class, ListAlertRuleTemplatesResponse.class)
            .withName("ListAlertRuleTemplates")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getWorkspaceId,
                ListAlertRuleTemplatesRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getOffset, ListAlertRuleTemplatesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getLimit, ListAlertRuleTemplatesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSortKey,
                ListAlertRuleTemplatesRequest::setSortKey));
        builder.<ListAlertRuleTemplatesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlertRuleTemplatesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSortDir,
                ListAlertRuleTemplatesRequest::setSortDir));
        builder.<List<ListAlertRuleTemplatesRequest.SeverityEnum>>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSeverity,
                ListAlertRuleTemplatesRequest::setSeverity));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertRuleTemplatesResponse::getXRequestId,
                ListAlertRuleTemplatesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRules =
        genForListAlertRules();

    private static HttpRequestDef<ListAlertRulesRequest, ListAlertRulesResponse> genForListAlertRules() {
        // basic
        HttpRequestDef.Builder<ListAlertRulesRequest, ListAlertRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlertRulesRequest.class, ListAlertRulesResponse.class)
                .withName("ListAlertRules")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getWorkspaceId, ListAlertRulesRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getOffset, ListAlertRulesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getLimit, ListAlertRulesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSortKey, ListAlertRulesRequest::setSortKey));
        builder.<ListAlertRulesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlertRulesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSortDir, ListAlertRulesRequest::setSortDir));
        builder.<String>withRequestField("pipe_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getPipeId, ListAlertRulesRequest::setPipeId));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getRuleName, ListAlertRulesRequest::setRuleName));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getRuleId, ListAlertRulesRequest::setRuleId));
        builder.<List<ListAlertRulesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getStatus, ListAlertRulesRequest::setStatus));
        builder.<List<ListAlertRulesRequest.SeverityEnum>>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSeverity, ListAlertRulesRequest::setSeverity));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertRulesResponse::getXRequestId, ListAlertRulesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertsRequest, ListAlertsResponse> listAlerts = genForListAlerts();

    private static HttpRequestDef<ListAlertsRequest, ListAlertsResponse> genForListAlerts() {
        // basic
        HttpRequestDef.Builder<ListAlertsRequest, ListAlertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAlertsRequest.class, ListAlertsResponse.class)
                .withName("ListAlerts")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertsRequest::getWorkspaceId, ListAlertsRequest::setWorkspaceId));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListAlertsRequest::getBody, ListAlertsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertsResponse::getXRequestId, ListAlertsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAllSecondCatalogueRequest, ListAllSecondCatalogueResponse> listAllSecondCatalogue =
        genForListAllSecondCatalogue();

    private static HttpRequestDef<ListAllSecondCatalogueRequest, ListAllSecondCatalogueResponse> genForListAllSecondCatalogue() {
        // basic
        HttpRequestDef.Builder<ListAllSecondCatalogueRequest, ListAllSecondCatalogueResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAllSecondCatalogueRequest.class, ListAllSecondCatalogueResponse.class)
            .withName("ListAllSecondCatalogue")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/catalogues")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllSecondCatalogueRequest::getWorkspaceId,
                ListAllSecondCatalogueRequest::setWorkspaceId));
        builder.<String>withRequestField("catalogue_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllSecondCatalogueRequest::getCatalogueType,
                ListAllSecondCatalogueRequest::setCatalogueType));
        builder.<String>withRequestField("catalogue_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllSecondCatalogueRequest::getCatalogueCode,
                ListAllSecondCatalogueRequest::setCatalogueCode));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAllSecondCatalogueResponse::getXRequestId,
                ListAllSecondCatalogueResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAopWorkflowInstanceRequest, ListAopWorkflowInstanceResponse> listAopWorkflowInstance =
        genForListAopWorkflowInstance();

    private static HttpRequestDef<ListAopWorkflowInstanceRequest, ListAopWorkflowInstanceResponse> genForListAopWorkflowInstance() {
        // basic
        HttpRequestDef.Builder<ListAopWorkflowInstanceRequest, ListAopWorkflowInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAopWorkflowInstanceRequest.class, ListAopWorkflowInstanceResponse.class)
            .withName("ListAopWorkflowInstance")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getWorkspaceId,
                ListAopWorkflowInstanceRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getOffset,
                ListAopWorkflowInstanceRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getLimit, ListAopWorkflowInstanceRequest::setLimit));
        builder.<ListAopWorkflowInstanceRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAopWorkflowInstanceRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getSortKey,
                ListAopWorkflowInstanceRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getSortDir,
                ListAopWorkflowInstanceRequest::setSortDir));
        builder.<LocalDate>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LocalDate.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getFromDate,
                ListAopWorkflowInstanceRequest::setFromDate));
        builder.<LocalDate>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LocalDate.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getToDate,
                ListAopWorkflowInstanceRequest::setToDate));
        builder.<String>withRequestField("workflow_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getWorkflowId,
                ListAopWorkflowInstanceRequest::setWorkflowId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getId, ListAopWorkflowInstanceRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getName, ListAopWorkflowInstanceRequest::setName));
        builder.<String>withRequestField("dataobject_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getDataobjectId,
                ListAopWorkflowInstanceRequest::setDataobjectId));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getDataclassId,
                ListAopWorkflowInstanceRequest::setDataclassId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getPlaybookId,
                ListAopWorkflowInstanceRequest::setPlaybookId));
        builder.<String>withRequestField("defence_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getDefenceId,
                ListAopWorkflowInstanceRequest::setDefenceId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getStatus,
                ListAopWorkflowInstanceRequest::setStatus));
        builder.<String>withRequestField("trigger_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowInstanceRequest::getTriggerType,
                ListAopWorkflowInstanceRequest::setTriggerType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAopWorkflowVersionsRequest, ListAopWorkflowVersionsResponse> listAopWorkflowVersions =
        genForListAopWorkflowVersions();

    private static HttpRequestDef<ListAopWorkflowVersionsRequest, ListAopWorkflowVersionsResponse> genForListAopWorkflowVersions() {
        // basic
        HttpRequestDef.Builder<ListAopWorkflowVersionsRequest, ListAopWorkflowVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAopWorkflowVersionsRequest.class, ListAopWorkflowVersionsResponse.class)
            .withName("ListAopWorkflowVersions")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/{workflow_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowVersionsRequest::getWorkspaceId,
                ListAopWorkflowVersionsRequest::setWorkspaceId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowVersionsRequest::getWorkflowId,
                ListAopWorkflowVersionsRequest::setWorkflowId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAopWorkflowVersionsRequest::getStatus,
                ListAopWorkflowVersionsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogueRequest, ListCatalogueResponse> listCatalogue =
        genForListCatalogue();

    private static HttpRequestDef<ListCatalogueRequest, ListCatalogueResponse> genForListCatalogue() {
        // basic
        HttpRequestDef.Builder<ListCatalogueRequest, ListCatalogueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCatalogueRequest.class, ListCatalogueResponse.class)
                .withName("ListCatalogue")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/catalogues/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCatalogueRequest::getWorkspaceId, ListCatalogueRequest::setWorkspaceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogueRequest::getLimit, ListCatalogueRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogueRequest::getOffset, ListCatalogueRequest::setOffset));
        builder.<SearchInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchInfo.class),
            f -> f.withMarshaller(ListCatalogueRequest::getBody, ListCatalogueRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCatalogueResponse::getXRequestId, ListCatalogueResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListCloudLogAliasRequest, ListCloudLogAliasResponse> listCloudLogAlias =
        genForListCloudLogAlias();

    private static HttpRequestDef<ListCloudLogAliasRequest, ListCloudLogAliasResponse> genForListCloudLogAlias() {
        // basic
        HttpRequestDef.Builder<ListCloudLogAliasRequest, ListCloudLogAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCloudLogAliasRequest.class, ListCloudLogAliasResponse.class)
                .withName("ListCloudLogAlias")
                .withUri("/v1/{project_id}/collector/cloudlogs/alias")
                .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCloudLogAliasResponse::getBody, ListCloudLogAliasResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudLogManagesRequest, ListCloudLogManagesResponse> listCloudLogManages =
        genForListCloudLogManages();

    private static HttpRequestDef<ListCloudLogManagesRequest, ListCloudLogManagesResponse> genForListCloudLogManages() {
        // basic
        HttpRequestDef.Builder<ListCloudLogManagesRequest, ListCloudLogManagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCloudLogManagesRequest.class, ListCloudLogManagesResponse.class)
                .withName("ListCloudLogManages")
                .withUri("/v1/{project_id}/collector/cloudlogs/managers")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudLogPlatformRequest, ListCloudLogPlatformResponse> listCloudLogPlatform =
        genForListCloudLogPlatform();

    private static HttpRequestDef<ListCloudLogPlatformRequest, ListCloudLogPlatformResponse> genForListCloudLogPlatform() {
        // basic
        HttpRequestDef.Builder<ListCloudLogPlatformRequest, ListCloudLogPlatformResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudLogPlatformRequest.class, ListCloudLogPlatformResponse.class)
            .withName("ListCloudLogPlatform")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/cloud-logs/platform")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudLogPlatformRequest::getWorkspaceId,
                ListCloudLogPlatformRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudLogResourcesRequest, ListCloudLogResourcesResponse> listCloudLogResources =
        genForListCloudLogResources();

    private static HttpRequestDef<ListCloudLogResourcesRequest, ListCloudLogResourcesResponse> genForListCloudLogResources() {
        // basic
        HttpRequestDef.Builder<ListCloudLogResourcesRequest, ListCloudLogResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudLogResourcesRequest.class, ListCloudLogResourcesResponse.class)
            .withName("ListCloudLogResources")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/cloud-logs/resource")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudLogResourcesRequest::getWorkspaceId,
                ListCloudLogResourcesRequest::setWorkspaceId));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudLogResourcesRequest::getRegionId,
                ListCloudLogResourcesRequest::setRegionId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCloudLogResourcesRequest::getOffset, ListCloudLogResourcesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCloudLogResourcesRequest::getLimit, ListCloudLogResourcesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudLogResourcesRequest::getSortKey, ListCloudLogResourcesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudLogResourcesRequest::getSortDir, ListCloudLogResourcesRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectConfigRequest, ListCollectConfigResponse> listCollectConfig =
        genForListCollectConfig();

    private static HttpRequestDef<ListCollectConfigRequest, ListCollectConfigResponse> genForListCollectConfig() {
        // basic
        HttpRequestDef.Builder<ListCollectConfigRequest, ListCollectConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCollectConfigRequest.class, ListCollectConfigResponse.class)
                .withName("ListCollectConfig")
                .withUri("/v1/{project_id}/collector/cloudlogs/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getRegionId, ListCollectConfigRequest::setRegionId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getOffset, ListCollectConfigRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getLimit, ListCollectConfigRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getSortKey, ListCollectConfigRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getSortDir, ListCollectConfigRequest::setSortDir));
        builder.<String>withRequestField("csvc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getCsvc, ListCollectConfigRequest::setCsvc));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getDomainId, ListCollectConfigRequest::setDomainId));
        builder.<Boolean>withRequestField("query_statistics",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCollectConfigRequest::getQueryStatistics,
                ListCollectConfigRequest::setQueryStatistics));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorChannelGroupRequest, ListCollectorChannelGroupResponse> listCollectorChannelGroup =
        genForListCollectorChannelGroup();

    private static HttpRequestDef<ListCollectorChannelGroupRequest, ListCollectorChannelGroupResponse> genForListCollectorChannelGroup() {
        // basic
        HttpRequestDef.Builder<ListCollectorChannelGroupRequest, ListCollectorChannelGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCollectorChannelGroupRequest.class,
                    ListCollectorChannelGroupResponse.class)
                .withName("ListCollectorChannelGroup")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorChannelGroupRequest::getWorkspaceId,
                ListCollectorChannelGroupRequest::setWorkspaceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorChannelGroupRequest::getName,
                ListCollectorChannelGroupRequest::setName));

        // response
        builder.<List<Group>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListCollectorChannelGroupResponse::getBody, ListCollectorChannelGroupResponse::setBody)
                .withInnerContainerType(Group.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorChannelsRequest, ListCollectorChannelsResponse> listCollectorChannels =
        genForListCollectorChannels();

    private static HttpRequestDef<ListCollectorChannelsRequest, ListCollectorChannelsResponse> genForListCollectorChannels() {
        // basic
        HttpRequestDef.Builder<ListCollectorChannelsRequest, ListCollectorChannelsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCollectorChannelsRequest.class, ListCollectorChannelsResponse.class)
            .withName("ListCollectorChannels")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getWorkspaceId,
                ListCollectorChannelsRequest::setWorkspaceId));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getTitle, ListCollectorChannelsRequest::setTitle));
        builder.<String>withRequestField("connection_module_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getConnectionModuleId,
                ListCollectorChannelsRequest::setConnectionModuleId));
        builder.<String>withRequestField("parser_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getParserId,
                ListCollectorChannelsRequest::setParserId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getGroupId, ListCollectorChannelsRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getOffset, ListCollectorChannelsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getLimit, ListCollectorChannelsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getSortKey, ListCollectorChannelsRequest::setSortKey));
        builder.<ListCollectorChannelsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorChannelsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCollectorChannelsRequest::getSortDir, ListCollectorChannelsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorConnectionsRequest, ListCollectorConnectionsResponse> listCollectorConnections =
        genForListCollectorConnections();

    private static HttpRequestDef<ListCollectorConnectionsRequest, ListCollectorConnectionsResponse> genForListCollectorConnections() {
        // basic
        HttpRequestDef.Builder<ListCollectorConnectionsRequest, ListCollectorConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListCollectorConnectionsRequest.class, ListCollectorConnectionsResponse.class)
                .withName("ListCollectorConnections")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorConnectionsRequest::getWorkspaceId,
                ListCollectorConnectionsRequest::setWorkspaceId));
        builder.<ListCollectorConnectionsRequest.ConnectionTypeEnum>withRequestField("connection_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorConnectionsRequest.ConnectionTypeEnum.class),
            f -> f.withMarshaller(ListCollectorConnectionsRequest::getConnectionType,
                ListCollectorConnectionsRequest::setConnectionType));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorConnectionsRequest::getTitle,
                ListCollectorConnectionsRequest::setTitle));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorConnectionsRequest::getDescription,
                ListCollectorConnectionsRequest::setDescription));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCollectorConnectionsRequest::getOffset,
                ListCollectorConnectionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCollectorConnectionsRequest::getLimit,
                ListCollectorConnectionsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorConnectionsRequest::getSortKey,
                ListCollectorConnectionsRequest::setSortKey));
        builder.<ListCollectorConnectionsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorConnectionsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCollectorConnectionsRequest::getSortDir,
                ListCollectorConnectionsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorInstancesRequest, ListCollectorInstancesResponse> listCollectorInstances =
        genForListCollectorInstances();

    private static HttpRequestDef<ListCollectorInstancesRequest, ListCollectorInstancesResponse> genForListCollectorInstances() {
        // basic
        HttpRequestDef.Builder<ListCollectorInstancesRequest, ListCollectorInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCollectorInstancesRequest.class, ListCollectorInstancesResponse.class)
            .withName("ListCollectorInstances")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorInstancesRequest::getWorkspaceId,
                ListCollectorInstancesRequest::setWorkspaceId));
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorInstancesRequest::getChannelId,
                ListCollectorInstancesRequest::setChannelId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorInstancesRequest::getNodeId, ListCollectorInstancesRequest::setNodeId));
        builder.<String>withRequestField("node_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorInstancesRequest::getNodeName,
                ListCollectorInstancesRequest::setNodeName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCollectorInstancesRequest::getOffset, ListCollectorInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCollectorInstancesRequest::getLimit, ListCollectorInstancesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorInstancesRequest::getSortKey,
                ListCollectorInstancesRequest::setSortKey));
        builder.<ListCollectorInstancesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorInstancesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCollectorInstancesRequest::getSortDir,
                ListCollectorInstancesRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorModuleRestrictionsRequest, ListCollectorModuleRestrictionsResponse> listCollectorModuleRestrictions =
        genForListCollectorModuleRestrictions();

    private static HttpRequestDef<ListCollectorModuleRestrictionsRequest, ListCollectorModuleRestrictionsResponse> genForListCollectorModuleRestrictions() {
        // basic
        HttpRequestDef.Builder<ListCollectorModuleRestrictionsRequest, ListCollectorModuleRestrictionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCollectorModuleRestrictionsRequest.class,
                    ListCollectorModuleRestrictionsResponse.class)
                .withName("ListCollectorModuleRestrictions")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/module-templates/restriction")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorModuleRestrictionsRequest::getWorkspaceId,
                ListCollectorModuleRestrictionsRequest::setWorkspaceId));
        builder.<ModuleTemplateFieldDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModuleTemplateFieldDto.class),
            f -> f.withMarshaller(ListCollectorModuleRestrictionsRequest::getBody,
                ListCollectorModuleRestrictionsRequest::setBody));

        // response
        builder.<List<ShowTemplateFields>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListCollectorModuleRestrictionsResponse::getBody,
                    ListCollectorModuleRestrictionsResponse::setBody)
                .withInnerContainerType(ShowTemplateFields.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorModuleTemplateRequest, ListCollectorModuleTemplateResponse> listCollectorModuleTemplate =
        genForListCollectorModuleTemplate();

    private static HttpRequestDef<ListCollectorModuleTemplateRequest, ListCollectorModuleTemplateResponse> genForListCollectorModuleTemplate() {
        // basic
        HttpRequestDef.Builder<ListCollectorModuleTemplateRequest, ListCollectorModuleTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCollectorModuleTemplateRequest.class,
                    ListCollectorModuleTemplateResponse.class)
                .withName("ListCollectorModuleTemplate")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/module-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorModuleTemplateRequest::getWorkspaceId,
                ListCollectorModuleTemplateRequest::setWorkspaceId));
        builder.<ListCollectorModuleTemplateRequest.ParserTypeEnum>withRequestField("parser_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorModuleTemplateRequest.ParserTypeEnum.class),
            f -> f.withMarshaller(ListCollectorModuleTemplateRequest::getParserType,
                ListCollectorModuleTemplateRequest::setParserType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorNodeRequest, ListCollectorNodeResponse> listCollectorNode =
        genForListCollectorNode();

    private static HttpRequestDef<ListCollectorNodeRequest, ListCollectorNodeResponse> genForListCollectorNode() {
        // basic
        HttpRequestDef.Builder<ListCollectorNodeRequest, ListCollectorNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCollectorNodeRequest.class, ListCollectorNodeResponse.class)
                .withName("ListCollectorNode")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getWorkspaceId, ListCollectorNodeRequest::setWorkspaceId));
        builder.<ListCollectorNodeRequest.HealthStatusEnum>withRequestField("health_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorNodeRequest.HealthStatusEnum.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getHealthStatus,
                ListCollectorNodeRequest::setHealthStatus));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getRegion, ListCollectorNodeRequest::setRegion));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getNodeId, ListCollectorNodeRequest::setNodeId));
        builder.<String>withRequestField("node_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getNodeName, ListCollectorNodeRequest::setNodeName));
        builder.<String>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getIpAddress, ListCollectorNodeRequest::setIpAddress));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getOffset, ListCollectorNodeRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getLimit, ListCollectorNodeRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getSortKey, ListCollectorNodeRequest::setSortKey));
        builder.<ListCollectorNodeRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorNodeRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCollectorNodeRequest::getSortDir, ListCollectorNodeRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorParserTemplateRequest, ListCollectorParserTemplateResponse> listCollectorParserTemplate =
        genForListCollectorParserTemplate();

    private static HttpRequestDef<ListCollectorParserTemplateRequest, ListCollectorParserTemplateResponse> genForListCollectorParserTemplate() {
        // basic
        HttpRequestDef.Builder<ListCollectorParserTemplateRequest, ListCollectorParserTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCollectorParserTemplateRequest.class,
                    ListCollectorParserTemplateResponse.class)
                .withName("ListCollectorParserTemplate")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/logstash/parsers/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorParserTemplateRequest::getWorkspaceId,
                ListCollectorParserTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorParserTemplateRequest::getTitle,
                ListCollectorParserTemplateRequest::setTitle));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorParserTemplateRequest::getDescription,
                ListCollectorParserTemplateRequest::setDescription));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectorParserTemplateRequest::getOffset,
                ListCollectorParserTemplateRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectorParserTemplateRequest::getLimit,
                ListCollectorParserTemplateRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorParserTemplateRequest::getSortKey,
                ListCollectorParserTemplateRequest::setSortKey));
        builder.<ListCollectorParserTemplateRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorParserTemplateRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCollectorParserTemplateRequest::getSortDir,
                ListCollectorParserTemplateRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectorParsersRequest, ListCollectorParsersResponse> listCollectorParsers =
        genForListCollectorParsers();

    private static HttpRequestDef<ListCollectorParsersRequest, ListCollectorParsersResponse> genForListCollectorParsers() {
        // basic
        HttpRequestDef.Builder<ListCollectorParsersRequest, ListCollectorParsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCollectorParsersRequest.class, ListCollectorParsersResponse.class)
            .withName("ListCollectorParsers")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/logstash/parsers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorParsersRequest::getWorkspaceId,
                ListCollectorParsersRequest::setWorkspaceId));
        builder.<ListCollectorParsersRequest.QueryTypeEnum>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorParsersRequest.QueryTypeEnum.class),
            f -> f.withMarshaller(ListCollectorParsersRequest::getQueryType,
                ListCollectorParsersRequest::setQueryType));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorParsersRequest::getTitle, ListCollectorParsersRequest::setTitle));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCollectorParsersRequest::getDescription,
                ListCollectorParsersRequest::setDescription));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectorParsersRequest::getOffset, ListCollectorParsersRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectorParsersRequest::getLimit, ListCollectorParsersRequest::setLimit));
        builder.<Long>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCollectorParsersRequest::getSortKey, ListCollectorParsersRequest::setSortKey));
        builder.<ListCollectorParsersRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollectorParsersRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListCollectorParsersRequest::getSortDir, ListCollectorParsersRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentActionsRequest, ListComponentActionsResponse> listComponentActions =
        genForListComponentActions();

    private static HttpRequestDef<ListComponentActionsRequest, ListComponentActionsResponse> genForListComponentActions() {
        // basic
        HttpRequestDef.Builder<ListComponentActionsRequest, ListComponentActionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComponentActionsRequest.class, ListComponentActionsResponse.class)
            .withName("ListComponentActions")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components/{component_id}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentActionsRequest::getWorkspaceId,
                ListComponentActionsRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentActionsRequest::getComponentId,
                ListComponentActionsRequest::setComponentId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentActionsRequest::getOffset, ListComponentActionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentActionsRequest::getLimit, ListComponentActionsRequest::setLimit));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListComponentActionsRequest::getEnabled, ListComponentActionsRequest::setEnabled));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentConfigurationRequest, ListComponentConfigurationResponse> listComponentConfiguration =
        genForListComponentConfiguration();

    private static HttpRequestDef<ListComponentConfigurationRequest, ListComponentConfigurationResponse> genForListComponentConfiguration() {
        // basic
        HttpRequestDef.Builder<ListComponentConfigurationRequest, ListComponentConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListComponentConfigurationRequest.class,
                    ListComponentConfigurationResponse.class)
                .withName("ListComponentConfiguration")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/components/{component_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationRequest::getWorkspaceId,
                ListComponentConfigurationRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationRequest::getComponentId,
                ListComponentConfigurationRequest::setComponentId));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListComponentConfigurationRequest::getLimit,
                ListComponentConfigurationRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentConfigurationRequest::getOffset,
                ListComponentConfigurationRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationRequest::getSortKey,
                ListComponentConfigurationRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationRequest::getSortDir,
                ListComponentConfigurationRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentTemplateRequest, ListComponentTemplateResponse> listComponentTemplate =
        genForListComponentTemplate();

    private static HttpRequestDef<ListComponentTemplateRequest, ListComponentTemplateResponse> genForListComponentTemplate() {
        // basic
        HttpRequestDef.Builder<ListComponentTemplateRequest, ListComponentTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComponentTemplateRequest.class, ListComponentTemplateResponse.class)
            .withName("ListComponentTemplate")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/components/{component_id}/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentTemplateRequest::getWorkspaceId,
                ListComponentTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentTemplateRequest::getComponentId,
                ListComponentTemplateRequest::setComponentId));
        builder.<ListComponentTemplateRequest.FileTypeEnum>withRequestField("file_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListComponentTemplateRequest.FileTypeEnum.class),
            f -> f.withMarshaller(ListComponentTemplateRequest::getFileType,
                ListComponentTemplateRequest::setFileType));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListComponentTemplateRequest::getLimit, ListComponentTemplateRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentTemplateRequest::getOffset, ListComponentTemplateRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentTemplateRequest::getSortKey, ListComponentTemplateRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentTemplateRequest::getSortDir, ListComponentTemplateRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentTemplatesRequest, ListComponentTemplatesResponse> listComponentTemplates =
        genForListComponentTemplates();

    private static HttpRequestDef<ListComponentTemplatesRequest, ListComponentTemplatesResponse> genForListComponentTemplates() {
        // basic
        HttpRequestDef.Builder<ListComponentTemplatesRequest, ListComponentTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComponentTemplatesRequest.class, ListComponentTemplatesResponse.class)
            .withName("ListComponentTemplates")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components/template")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentTemplatesRequest::getWorkspaceId,
                ListComponentTemplatesRequest::setWorkspaceId));
        builder.<String>withRequestField("search_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentTemplatesRequest::getSearchValue,
                ListComponentTemplatesRequest::setSearchValue));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentTemplatesRequest::getOffset, ListComponentTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentTemplatesRequest::getLimit, ListComponentTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentsRequest, ListComponentsResponse> listComponents =
        genForListComponents();

    private static HttpRequestDef<ListComponentsRequest, ListComponentsResponse> genForListComponents() {
        // basic
        HttpRequestDef.Builder<ListComponentsRequest, ListComponentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListComponentsRequest.class, ListComponentsResponse.class)
                .withName("ListComponents")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getWorkspaceId, ListComponentsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentsRequest::getOffset, ListComponentsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentsRequest::getLimit, ListComponentsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationDictionariesRequest, ListConfigurationDictionariesResponse> listConfigurationDictionaries =
        genForListConfigurationDictionaries();

    private static HttpRequestDef<ListConfigurationDictionariesRequest, ListConfigurationDictionariesResponse> genForListConfigurationDictionaries() {
        // basic
        HttpRequestDef.Builder<ListConfigurationDictionariesRequest, ListConfigurationDictionariesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationDictionariesRequest.class,
                    ListConfigurationDictionariesResponse.class)
                .withName("ListConfigurationDictionaries")
                .withUri("/v1/{project_id}/configurations/dictionaries")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationDictionariesRequest::getScene,
                ListConfigurationDictionariesRequest::setScene));
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationDictionariesRequest::getLevel,
                ListConfigurationDictionariesRequest::setLevel));
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationDictionariesRequest::getScope,
                ListConfigurationDictionariesRequest::setScope));
        builder.<String>withRequestField("dict_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationDictionariesRequest::getDictKey,
                ListConfigurationDictionariesRequest::setDictKey));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListConfigurationDictionariesRequest::getIsBuiltIn,
                ListConfigurationDictionariesRequest::setIsBuiltIn));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationDictionariesRequest::getOffset,
                ListConfigurationDictionariesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationDictionariesRequest::getLimit,
                ListConfigurationDictionariesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationDictionariesRequest::getXLanguage,
                ListConfigurationDictionariesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections =
        genForListConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForListConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withName("ListConnections")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/assetcredentials")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getWorkspaceId, ListConnectionsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getOffset, ListConnectionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getLimit, ListConnectionsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getName, ListConnectionsRequest::setName));
        builder.<String>withRequestField("component_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getComponentName, ListConnectionsRequest::setComponentName));
        builder.<String>withRequestField("creator_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getCreatorName, ListConnectionsRequest::setCreatorName));
        builder.<String>withRequestField("modifier_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getModifierName, ListConnectionsRequest::setModifierName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getDescription, ListConnectionsRequest::setDescription));
        builder.<String>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getCreateStartTime,
                ListConnectionsRequest::setCreateStartTime));
        builder.<String>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getCreateEndTime, ListConnectionsRequest::setCreateEndTime));
        builder.<String>withRequestField("update_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getUpdateStartTime,
                ListConnectionsRequest::setUpdateStartTime));
        builder.<String>withRequestField("update_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getUpdateEndTime, ListConnectionsRequest::setUpdateEndTime));
        builder.<Boolean>withRequestField("is_defense_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListConnectionsRequest::getIsDefenseType, ListConnectionsRequest::setIsDefenseType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataclassRequest, ListDataclassResponse> listDataclass =
        genForListDataclass();

    private static HttpRequestDef<ListDataclassRequest, ListDataclassResponse> genForListDataclass() {
        // basic
        HttpRequestDef.Builder<ListDataclassRequest, ListDataclassResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataclassRequest.class, ListDataclassResponse.class)
                .withName("ListDataclass")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/dataclasses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getWorkspaceId, ListDataclassRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataclassRequest::getOffset, ListDataclassRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataclassRequest::getLimit, ListDataclassRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getName, ListDataclassRequest::setName));
        builder.<String>withRequestField("business_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getBusinessCode, ListDataclassRequest::setBusinessCode));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getDescription, ListDataclassRequest::setDescription));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassRequest::getIsBuiltIn, ListDataclassRequest::setIsBuiltIn));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDataclassResponse::getXRequestId, ListDataclassResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataclassFieldsRequest, ListDataclassFieldsResponse> listDataclassFields =
        genForListDataclassFields();

    private static HttpRequestDef<ListDataclassFieldsRequest, ListDataclassFieldsResponse> genForListDataclassFields() {
        // basic
        HttpRequestDef.Builder<ListDataclassFieldsRequest, ListDataclassFieldsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataclassFieldsRequest.class, ListDataclassFieldsResponse.class)
                .withName("ListDataclassFields")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/dataclasses/{dataclass_id}/fields")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getWorkspaceId,
                ListDataclassFieldsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getDataclassId,
                ListDataclassFieldsRequest::setDataclassId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getOffset, ListDataclassFieldsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getLimit, ListDataclassFieldsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getName, ListDataclassFieldsRequest::setName));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getIsBuiltIn, ListDataclassFieldsRequest::setIsBuiltIn));
        builder.<String>withRequestField("field_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getFieldCategory,
                ListDataclassFieldsRequest::setFieldCategory));
        builder.<Boolean>withRequestField("mapping",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getMapping, ListDataclassFieldsRequest::setMapping));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDataclassFieldsResponse::getXRequestId,
                ListDataclassFieldsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> listDataobjectRelations =
        genForListDataobjectRelations();

    private static HttpRequestDef<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> genForListDataobjectRelations() {
        // basic
        HttpRequestDef.Builder<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListDataobjectRelationsRequest.class, ListDataobjectRelationsResponse.class)
            .withName("ListDataobjectRelations")
            .withUri(
                "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}/search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getWorkspaceId,
                ListDataobjectRelationsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getDataclassType,
                ListDataobjectRelationsRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getDataObjectId,
                ListDataobjectRelationsRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getRelatedDataclassType,
                ListDataobjectRelationsRequest::setRelatedDataclassType));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getBody, ListDataobjectRelationsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDataobjectRelationsResponse::getXRequestId,
                ListDataobjectRelationsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataobjectsRequest, ListDataobjectsResponse> listDataobjects =
        genForListDataobjects();

    private static HttpRequestDef<ListDataobjectsRequest, ListDataobjectsResponse> genForListDataobjects() {
        // basic
        HttpRequestDef.Builder<ListDataobjectsRequest, ListDataobjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListDataobjectsRequest.class, ListDataobjectsResponse.class)
                .withName("ListDataobjects")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_name}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectsRequest::getWorkspaceId, ListDataobjectsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectsRequest::getDataclassName, ListDataobjectsRequest::setDataclassName));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListDataobjectsRequest::getBody, ListDataobjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatapanelObjectsRequest, ListDatapanelObjectsResponse> listDatapanelObjects =
        genForListDatapanelObjects();

    private static HttpRequestDef<ListDatapanelObjectsRequest, ListDatapanelObjectsResponse> genForListDatapanelObjects() {
        // basic
        HttpRequestDef.Builder<ListDatapanelObjectsRequest, ListDatapanelObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListDatapanelObjectsRequest.class, ListDatapanelObjectsResponse.class)
            .withName("ListDatapanelObjects")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/datapanel/{dataclass}/data-objects/search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatapanelObjectsRequest::getWorkspaceId,
                ListDatapanelObjectsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatapanelObjectsRequest::getDataclass,
                ListDatapanelObjectsRequest::setDataclass));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListDatapanelObjectsRequest::getBody, ListDatapanelObjectsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatapanelObjectsResponse::getXRequestId,
                ListDatapanelObjectsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataspacesRequest, ListDataspacesResponse> listDataspaces =
        genForListDataspaces();

    private static HttpRequestDef<ListDataspacesRequest, ListDataspacesResponse> genForListDataspaces() {
        // basic
        HttpRequestDef.Builder<ListDataspacesRequest, ListDataspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataspacesRequest.class, ListDataspacesResponse.class)
                .withName("ListDataspaces")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/dataspaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataspacesRequest::getWorkspaceId, ListDataspacesRequest::setWorkspaceId));
        builder.<String>withRequestField("dataspace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataspacesRequest::getDataspaceName, ListDataspacesRequest::setDataspaceName));
        builder.<String>withRequestField("dataspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataspacesRequest::getDataspaceId, ListDataspacesRequest::setDataspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataspacesRequest::getOffset, ListDataspacesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataspacesRequest::getLimit, ListDataspacesRequest::setLimit));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataspacesRequest::getSortDir, ListDataspacesRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataspacesRequest::getSortKey, ListDataspacesRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryComponentConfigurationRequest, ListHistoryComponentConfigurationResponse> listHistoryComponentConfiguration =
        genForListHistoryComponentConfiguration();

    private static HttpRequestDef<ListHistoryComponentConfigurationRequest, ListHistoryComponentConfigurationResponse> genForListHistoryComponentConfiguration() {
        // basic
        HttpRequestDef.Builder<ListHistoryComponentConfigurationRequest, ListHistoryComponentConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListHistoryComponentConfigurationRequest.class,
                    ListHistoryComponentConfigurationResponse.class)
                .withName("ListHistoryComponentConfiguration")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/components/{component_id}/configurations/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryComponentConfigurationRequest::getWorkspaceId,
                ListHistoryComponentConfigurationRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryComponentConfigurationRequest::getComponentId,
                ListHistoryComponentConfigurationRequest::setComponentId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHistoryComponentConfigurationRequest::getOffset,
                ListHistoryComponentConfigurationRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHistoryComponentConfigurationRequest::getLimit,
                ListHistoryComponentConfigurationRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryComponentConfigurationRequest::getSortKey,
                ListHistoryComponentConfigurationRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryComponentConfigurationRequest::getSortDir,
                ListHistoryComponentConfigurationRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIncidentsRequest, ListIncidentsResponse> listIncidents =
        genForListIncidents();

    private static HttpRequestDef<ListIncidentsRequest, ListIncidentsResponse> genForListIncidents() {
        // basic
        HttpRequestDef.Builder<ListIncidentsRequest, ListIncidentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIncidentsRequest.class, ListIncidentsResponse.class)
                .withName("ListIncidents")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentsRequest::getWorkspaceId, ListIncidentsRequest::setWorkspaceId));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListIncidentsRequest::getBody, ListIncidentsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIncidentsResponse::getXRequestId, ListIncidentsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListIndicatorsRequest, ListIndicatorsResponse> listIndicators =
        genForListIndicators();

    private static HttpRequestDef<ListIndicatorsRequest, ListIndicatorsResponse> genForListIndicators() {
        // basic
        HttpRequestDef.Builder<ListIndicatorsRequest, ListIndicatorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIndicatorsRequest.class, ListIndicatorsResponse.class)
                .withName("ListIndicators")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIndicatorsRequest::getWorkspaceId, ListIndicatorsRequest::setWorkspaceId));
        builder.<IndicatorListSearchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndicatorListSearchRequest.class),
            f -> f.withMarshaller(ListIndicatorsRequest::getBody, ListIndicatorsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIndicatorsResponse::getXRequestId, ListIndicatorsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInstallationRequest, ListInstallationResponse> listInstallation =
        genForListInstallation();

    private static HttpRequestDef<ListInstallationRequest, ListInstallationResponse> genForListInstallation() {
        // basic
        HttpRequestDef.Builder<ListInstallationRequest, ListInstallationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstallationRequest.class, ListInstallationResponse.class)
                .withName("ListInstallation")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/nodes/installation-scripts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstallationRequest::getWorkspaceId, ListInstallationRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIsapComponentsRequest, ListIsapComponentsResponse> listIsapComponents =
        genForListIsapComponents();

    private static HttpRequestDef<ListIsapComponentsRequest, ListIsapComponentsResponse> genForListIsapComponents() {
        // basic
        HttpRequestDef.Builder<ListIsapComponentsRequest, ListIsapComponentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIsapComponentsRequest.class, ListIsapComponentsResponse.class)
                .withName("ListIsapComponents")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsapComponentsRequest::getWorkspaceId,
                ListIsapComponentsRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLayoutRequest, ListLayoutResponse> listLayout = genForListLayout();

    private static HttpRequestDef<ListLayoutRequest, ListLayoutResponse> genForListLayout() {
        // basic
        HttpRequestDef.Builder<ListLayoutRequest, ListLayoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLayoutRequest.class, ListLayoutResponse.class)
                .withName("ListLayout")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLayoutRequest::getWorkspaceId, ListLayoutRequest::setWorkspaceId));
        builder.<LayoutSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LayoutSearch.class),
            f -> f.withMarshaller(ListLayoutRequest::getBody, ListLayoutRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLayoutResponse::getXRequestId, ListLayoutResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListLayoutWizardsRequest, ListLayoutWizardsResponse> listLayoutWizards =
        genForListLayoutWizards();

    private static HttpRequestDef<ListLayoutWizardsRequest, ListLayoutWizardsResponse> genForListLayoutWizards() {
        // basic
        HttpRequestDef.Builder<ListLayoutWizardsRequest, ListLayoutWizardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLayoutWizardsRequest.class, ListLayoutWizardsResponse.class)
                .withName("ListLayoutWizards")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/{layout_id}/wizards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLayoutWizardsRequest::getWorkspaceId, ListLayoutWizardsRequest::setWorkspaceId));
        builder.<String>withRequestField("layout_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLayoutWizardsRequest::getLayoutId, ListLayoutWizardsRequest::setLayoutId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLayoutWizardsRequest::getOffset, ListLayoutWizardsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLayoutWizardsRequest::getLimit, ListLayoutWizardsRequest::setLimit));
        builder.<ListLayoutWizardsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLayoutWizardsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListLayoutWizardsRequest::getSortKey, ListLayoutWizardsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLayoutWizardsRequest::getSortDir, ListLayoutWizardsRequest::setSortDir));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLayoutWizardsResponse::getXRequestId, ListLayoutWizardsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForListMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForListMetrics() {
        // basic
        HttpRequestDef.Builder<ListMetricsRequest, ListMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsRequest.class, ListMetricsResponse.class)
                .withName("ListMetrics")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getWorkspaceId, ListMetricsRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetricsResponse::getXRequestId, ListMetricsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListModulesRequest, ListModulesResponse> listModules = genForListModules();

    private static HttpRequestDef<ListModulesRequest, ListModulesResponse> genForListModules() {
        // basic
        HttpRequestDef.Builder<ListModulesRequest, ListModulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListModulesRequest.class, ListModulesResponse.class)
                .withName("ListModules")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/modules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModulesRequest::getWorkspaceId, ListModulesRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModulesRequest::getOffset, ListModulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModulesRequest::getLimit, ListModulesRequest::setLimit));
        builder.<ListModulesRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListModulesRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListModulesRequest::getSortKey, ListModulesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModulesRequest::getSortDir, ListModulesRequest::setSortDir));
        builder.<String>withRequestField("module_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModulesRequest::getModuleType, ListModulesRequest::setModuleType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListModulesResponse::getXRequestId, ListModulesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListNodesRequest, ListNodesResponse> listNodes = genForListNodes();

    private static HttpRequestDef<ListNodesRequest, ListNodesResponse> genForListNodes() {
        // basic
        HttpRequestDef.Builder<ListNodesRequest, ListNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodesRequest.class, ListNodesResponse.class)
                .withName("ListNodes")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodesRequest::getWorkspaceId, ListNodesRequest::setWorkspaceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodesRequest::getNodeId, ListNodesRequest::setNodeId));
        builder.<String>withRequestField("node_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodesRequest::getNodeName, ListNodesRequest::setNodeName));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNodesRequest::getOffset, ListNodesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNodesRequest::getLimit, ListNodesRequest::setLimit));
        builder.<Long>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListNodesRequest::getSortKey, ListNodesRequest::setSortKey));
        builder.<ListNodesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNodesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListNodesRequest::getSortDir, ListNodesRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotesRequest, ListNotesResponse> listNotes = genForListNotes();

    private static HttpRequestDef<ListNotesRequest, ListNotesResponse> genForListNotes() {
        // basic
        HttpRequestDef.Builder<ListNotesRequest, ListNotesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListNotesRequest.class, ListNotesResponse.class)
                .withName("ListNotes")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/notes/search")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotesRequest::getWorkspaceId, ListNotesRequest::setWorkspaceId));
        builder.<ListNotesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListNotesRequestBody.class),
            f -> f.withMarshaller(ListNotesRequest::getBody, ListNotesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipesRequest, ListPipesResponse> listPipes = genForListPipes();

    private static HttpRequestDef<ListPipesRequest, ListPipesResponse> genForListPipes() {
        // basic
        HttpRequestDef.Builder<ListPipesRequest, ListPipesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPipesRequest.class, ListPipesResponse.class)
                .withName("ListPipes")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getWorkspaceId, ListPipesRequest::setWorkspaceId));
        builder.<String>withRequestField("dataspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getDataspaceId, ListPipesRequest::setDataspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getPipeId, ListPipesRequest::setPipeId));
        builder.<String>withRequestField("pipe_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getPipeName, ListPipesRequest::setPipeName));
        builder.<ListPipesRequest.PipeTypeEnum>withRequestField("pipe_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPipesRequest.PipeTypeEnum.class),
            f -> f.withMarshaller(ListPipesRequest::getPipeType, ListPipesRequest::setPipeType));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPipesRequest::getOffset, ListPipesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPipesRequest::getLimit, ListPipesRequest::setLimit));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getSortDir, ListPipesRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipesRequest::getSortKey, ListPipesRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActions =
        genForListPlaybookActions();

    private static HttpRequestDef<ListPlaybookActionsRequest, ListPlaybookActionsResponse> genForListPlaybookActions() {
        // basic
        HttpRequestDef.Builder<ListPlaybookActionsRequest, ListPlaybookActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPlaybookActionsRequest.class, ListPlaybookActionsResponse.class)
                .withName("ListPlaybookActions")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getWorkspaceId,
                ListPlaybookActionsRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getVersionId, ListPlaybookActionsRequest::setVersionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getLimit, ListPlaybookActionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getOffset, ListPlaybookActionsRequest::setOffset));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookActionsResponse::getXRequestId,
                ListPlaybookActionsResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookActionsResponse::getXAPIDeprecationInfo,
                ListPlaybookActionsResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookActionsResponse::getXAPIDeprecationDate,
                ListPlaybookActionsResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApproves =
        genForListPlaybookApproves();

    private static HttpRequestDef<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> genForListPlaybookApproves() {
        // basic
        HttpRequestDef.Builder<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPlaybookApprovesRequest.class, ListPlaybookApprovesResponse.class)
            .withName("ListPlaybookApproves")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/approval")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getWorkspaceId,
                ListPlaybookApprovesRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getResourceId,
                ListPlaybookApprovesRequest::setResourceId));
        builder.<String>withRequestField("approve_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getApproveType,
                ListPlaybookApprovesRequest::setApproveType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookApprovesResponse::getXRequestId,
                ListPlaybookApprovesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogs =
        genForListPlaybookAuditLogs();

    private static HttpRequestDef<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> genForListPlaybookAuditLogs() {
        // basic
        HttpRequestDef.Builder<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListPlaybookAuditLogsRequest.class, ListPlaybookAuditLogsResponse.class)
            .withName("ListPlaybookAuditLogs")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances/auditlogs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getWorkspaceId,
                ListPlaybookAuditLogsRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getOffset, ListPlaybookAuditLogsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getLimit, ListPlaybookAuditLogsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getSortKey, ListPlaybookAuditLogsRequest::setSortKey));
        builder.<ListPlaybookAuditLogsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPlaybookAuditLogsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getSortDir, ListPlaybookAuditLogsRequest::setSortDir));
        builder.<AuditLogInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AuditLogInfo.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getBody, ListPlaybookAuditLogsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookAuditLogsResponse::getXRequestId,
                ListPlaybookAuditLogsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstances =
        genForListPlaybookInstances();

    private static HttpRequestDef<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> genForListPlaybookInstances() {
        // basic
        HttpRequestDef.Builder<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPlaybookInstancesRequest.class, ListPlaybookInstancesResponse.class)
            .withName("ListPlaybookInstances")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getWorkspaceId,
                ListPlaybookInstancesRequest::setWorkspaceId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getStatus, ListPlaybookInstancesRequest::setStatus));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getName, ListPlaybookInstancesRequest::setName));
        builder.<String>withRequestField("playbook_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getPlaybookName,
                ListPlaybookInstancesRequest::setPlaybookName));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getDataclassName,
                ListPlaybookInstancesRequest::setDataclassName));
        builder.<String>withRequestField("dataobject_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getDataobjectName,
                ListPlaybookInstancesRequest::setDataobjectName));
        builder.<String>withRequestField("trigger_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getTriggerType,
                ListPlaybookInstancesRequest::setTriggerType));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getFromDate,
                ListPlaybookInstancesRequest::setFromDate));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getToDate, ListPlaybookInstancesRequest::setToDate));
        builder.<String>withRequestField("date_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getDateType,
                ListPlaybookInstancesRequest::setDateType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getLimit, ListPlaybookInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getOffset, ListPlaybookInstancesRequest::setOffset));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookInstancesResponse::getXRequestId,
                ListPlaybookInstancesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersions =
        genForListPlaybookVersions();

    private static HttpRequestDef<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> genForListPlaybookVersions() {
        // basic
        HttpRequestDef.Builder<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPlaybookVersionsRequest.class, ListPlaybookVersionsResponse.class)
            .withName("ListPlaybookVersions")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getWorkspaceId,
                ListPlaybookVersionsRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getPlaybookId,
                ListPlaybookVersionsRequest::setPlaybookId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getStatus, ListPlaybookVersionsRequest::setStatus));
        builder.<Integer>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getEnabled, ListPlaybookVersionsRequest::setEnabled));
        builder.<Integer>withRequestField("version_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getVersionType,
                ListPlaybookVersionsRequest::setVersionType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getOffset, ListPlaybookVersionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getLimit, ListPlaybookVersionsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookVersionsResponse::getXRequestId,
                ListPlaybookVersionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooks =
        genForListPlaybooks();

    private static HttpRequestDef<ListPlaybooksRequest, ListPlaybooksResponse> genForListPlaybooks() {
        // basic
        HttpRequestDef.Builder<ListPlaybooksRequest, ListPlaybooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPlaybooksRequest.class, ListPlaybooksResponse.class)
                .withName("ListPlaybooks")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getWorkspaceId, ListPlaybooksRequest::setWorkspaceId));
        builder.<String>withRequestField("search_txt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getSearchTxt, ListPlaybooksRequest::setSearchTxt));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getEnabled, ListPlaybooksRequest::setEnabled));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getOffset, ListPlaybooksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getLimit, ListPlaybooksRequest::setLimit));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getDescription, ListPlaybooksRequest::setDescription));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getDataclassName, ListPlaybooksRequest::setDataclassName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getName, ListPlaybooksRequest::setName));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybooksResponse::getXRequestId, ListPlaybooksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagRequest, ListProjectTagResponse> listProjectTag =
        genForListProjectTag();

    private static HttpRequestDef<ListProjectTagRequest, ListProjectTagResponse> genForListProjectTag() {
        // basic
        HttpRequestDef.Builder<ListProjectTagRequest, ListProjectTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagRequest.class, ListProjectTagResponse.class)
                .withName("ListProjectTag")
                .withUri("/v1/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagRequest::getResourceType, ListProjectTagRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecipientsStatusRequest, ListRecipientsStatusResponse> listRecipientsStatus =
        genForListRecipientsStatus();

    private static HttpRequestDef<ListRecipientsStatusRequest, ListRecipientsStatusResponse> genForListRecipientsStatus() {
        // basic
        HttpRequestDef.Builder<ListRecipientsStatusRequest, ListRecipientsStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListRecipientsStatusRequest.class, ListRecipientsStatusResponse.class)
            .withName("ListRecipientsStatus")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/reports/emails/search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecipientsStatusRequest::getWorkspaceId,
                ListRecipientsStatusRequest::setWorkspaceId));
        builder.<ListRecipientsStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRecipientsStatusRequestBody.class),
            f -> f.withMarshaller(ListRecipientsStatusRequest::getBody, ListRecipientsStatusRequest::setBody));

        // response
        builder.<List<EmailStatusInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecipientsStatusResponse::getBody, ListRecipientsStatusResponse::setBody)
                .withInnerContainerType(EmailStatusInfo.class));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecipientsStatusResponse::getXRequestId,
                ListRecipientsStatusResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForListRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForListRegions() {
        // basic
        HttpRequestDef.Builder<ListRegionsRequest, ListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRegionsRequest.class, ListRegionsResponse.class)
                .withName("ListRegions")
                .withUri("/v1/{project_id}/collector/cloudlogs/regions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReportsRequest, ListReportsResponse> listReports = genForListReports();

    private static HttpRequestDef<ListReportsRequest, ListReportsResponse> genForListReports() {
        // basic
        HttpRequestDef.Builder<ListReportsRequest, ListReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReportsRequest.class, ListReportsResponse.class)
                .withName("ListReports")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/reports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getWorkspaceId, ListReportsRequest::setWorkspaceId));
        builder.<String>withRequestField("report_period",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getReportPeriod, ListReportsRequest::setReportPeriod));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getStatus, ListReportsRequest::setStatus));

        // response
        builder.<List<ReportInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListReportsResponse::getBody, ListReportsResponse::setBody)
                .withInnerContainerType(ReportInfo.class));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListReportsResponse::getXRequestId, ListReportsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstanceRequest, ListResourceInstanceResponse> listResourceInstance =
        genForListResourceInstance();

    private static HttpRequestDef<ListResourceInstanceRequest, ListResourceInstanceResponse> genForListResourceInstance() {
        // basic
        HttpRequestDef.Builder<ListResourceInstanceRequest, ListResourceInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstanceRequest.class, ListResourceInstanceResponse.class)
            .withName("ListResourceInstance")
            .withUri("/v1/{project_id}/{resource_type}/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstanceRequest::getResourceType,
                ListResourceInstanceRequest::setResourceType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstanceRequest::getLimit, ListResourceInstanceRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstanceRequest::getOffset, ListResourceInstanceRequest::setOffset));
        builder.<QueryResourceInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourceInstanceRequestBody.class),
            f -> f.withMarshaller(ListResourceInstanceRequest::getBody, ListResourceInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagRequest, ListResourceTagResponse> listResourceTag =
        genForListResourceTag();

    private static HttpRequestDef<ListResourceTagRequest, ListResourceTagResponse> genForListResourceTag() {
        // basic
        HttpRequestDef.Builder<ListResourceTagRequest, ListResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTagRequest.class, ListResourceTagResponse.class)
                .withName("ListResourceTag")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagRequest::getResourceType, ListResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagRequest::getResourceId, ListResourceTagRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesRequest, ListResourcesResponse> listResources =
        genForListResources();

    private static HttpRequestDef<ListResourcesRequest, ListResourcesResponse> genForListResources() {
        // basic
        HttpRequestDef.Builder<ListResourcesRequest, ListResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourcesRequest.class, ListResourcesResponse.class)
                .withName("ListResources")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/resources/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getWorkspaceId, ListResourcesRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getXLanguage, ListResourcesRequest::setXLanguage));
        builder.<ResourceDataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceDataobjectSearch.class),
            f -> f.withMarshaller(ListResourcesRequest::getBody, ListResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRunningNodesRequest, ListRunningNodesResponse> listRunningNodes =
        genForListRunningNodes();

    private static HttpRequestDef<ListRunningNodesRequest, ListRunningNodesResponse> genForListRunningNodes() {
        // basic
        HttpRequestDef.Builder<ListRunningNodesRequest, ListRunningNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRunningNodesRequest.class, ListRunningNodesResponse.class)
                .withName("ListRunningNodes")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/components/{component_id}/running-nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunningNodesRequest::getWorkspaceId, ListRunningNodesRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunningNodesRequest::getComponentId, ListRunningNodesRequest::setComponentId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunningNodesRequest::getNodeId, ListRunningNodesRequest::setNodeId));
        builder.<String>withRequestField("node_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunningNodesRequest::getNodeName, ListRunningNodesRequest::setNodeName));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRunningNodesRequest::getLimit, ListRunningNodesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRunningNodesRequest::getOffset, ListRunningNodesRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunningNodesRequest::getSortKey, ListRunningNodesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRunningNodesRequest::getSortDir, ListRunningNodesRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSearchConditionsRequest, ListSearchConditionsResponse> listSearchConditions =
        genForListSearchConditions();

    private static HttpRequestDef<ListSearchConditionsRequest, ListSearchConditionsResponse> genForListSearchConditions() {
        // basic
        HttpRequestDef.Builder<ListSearchConditionsRequest, ListSearchConditionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSearchConditionsRequest.class, ListSearchConditionsResponse.class)
            .withName("ListSearchConditions")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/search/conditions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSearchConditionsRequest::getWorkspaceId,
                ListSearchConditionsRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSearchConditionsRequest::getPipeId, ListSearchConditionsRequest::setPipeId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSearchConditionsRequest::getOffset, ListSearchConditionsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSearchConditionsRequest::getLimit, ListSearchConditionsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSearchConditionsRequest::getSortKey, ListSearchConditionsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSearchConditionsRequest::getSortDir, ListSearchConditionsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSearchHistogramsRequest, ListSearchHistogramsResponse> listSearchHistograms =
        genForListSearchHistograms();

    private static HttpRequestDef<ListSearchHistogramsRequest, ListSearchHistogramsResponse> genForListSearchHistograms() {
        // basic
        HttpRequestDef.Builder<ListSearchHistogramsRequest, ListSearchHistogramsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListSearchHistogramsRequest.class, ListSearchHistogramsResponse.class)
            .withName("ListSearchHistograms")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/search/histograms")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSearchHistogramsRequest::getWorkspaceId,
                ListSearchHistogramsRequest::setWorkspaceId));
        builder.<ListHistogramsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListHistogramsRequestBody.class),
            f -> f.withMarshaller(ListSearchHistogramsRequest::getBody, ListSearchHistogramsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSearchLogsRequest, ListSearchLogsResponse> listSearchLogs =
        genForListSearchLogs();

    private static HttpRequestDef<ListSearchLogsRequest, ListSearchLogsResponse> genForListSearchLogs() {
        // basic
        HttpRequestDef.Builder<ListSearchLogsRequest, ListSearchLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSearchLogsRequest.class, ListSearchLogsResponse.class)
                .withName("ListSearchLogs")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/search/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSearchLogsRequest::getWorkspaceId, ListSearchLogsRequest::setWorkspaceId));
        builder.<ListLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLogsRequestBody.class),
            f -> f.withMarshaller(ListSearchLogsRequest::getBody, ListSearchLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceAgencyRequest, ListServiceAgencyResponse> listServiceAgency =
        genForListServiceAgency();

    private static HttpRequestDef<ListServiceAgencyRequest, ListServiceAgencyResponse> genForListServiceAgency() {
        // basic
        HttpRequestDef.Builder<ListServiceAgencyRequest, ListServiceAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceAgencyRequest.class, ListServiceAgencyResponse.class)
                .withName("ListServiceAgency")
                .withUri("/v1/{project_id}/agency")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceAgencyRequest::getXLanguage, ListServiceAgencyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShipperAuthorizationsRequest, ListShipperAuthorizationsResponse> listShipperAuthorizations =
        genForListShipperAuthorizations();

    private static HttpRequestDef<ListShipperAuthorizationsRequest, ListShipperAuthorizationsResponse> genForListShipperAuthorizations() {
        // basic
        HttpRequestDef.Builder<ListShipperAuthorizationsRequest, ListShipperAuthorizationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListShipperAuthorizationsRequest.class,
                    ListShipperAuthorizationsResponse.class)
                .withName("ListShipperAuthorizations")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/authorizations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShipperAuthorizationsRequest::getWorkspaceId,
                ListShipperAuthorizationsRequest::setWorkspaceId));
        builder.<String>withRequestField("source_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShipperAuthorizationsRequest::getSourceRegion,
                ListShipperAuthorizationsRequest::setSourceRegion));
        builder.<String>withRequestField("destination_shipper_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShipperAuthorizationsRequest::getDestinationShipperType,
                ListShipperAuthorizationsRequest::setDestinationShipperType));
        builder.<String>withRequestField("shipper_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShipperAuthorizationsRequest::getShipperStatus,
                ListShipperAuthorizationsRequest::setShipperStatus));
        builder.<String>withRequestField("auth_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShipperAuthorizationsRequest::getAuthStatus,
                ListShipperAuthorizationsRequest::setAuthStatus));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListShipperAuthorizationsRequest::getLimit,
                ListShipperAuthorizationsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListShipperAuthorizationsRequest::getOffset,
                ListShipperAuthorizationsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShippersRequest, ListShippersResponse> listShippers = genForListShippers();

    private static HttpRequestDef<ListShippersRequest, ListShippersResponse> genForListShippers() {
        // basic
        HttpRequestDef.Builder<ListShippersRequest, ListShippersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListShippersRequest.class, ListShippersResponse.class)
                .withName("ListShippers")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getWorkspaceId, ListShippersRequest::setWorkspaceId));
        builder.<String>withRequestField("dataspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getDataspaceId, ListShippersRequest::setDataspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getPipeId, ListShippersRequest::setPipeId));
        builder.<String>withRequestField("shipper_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getShipperName, ListShippersRequest::setShipperName));
        builder.<String>withRequestField("shipper_source_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getShipperSourceRegion,
                ListShippersRequest::setShipperSourceRegion));
        builder.<String>withRequestField("shipper_source_strategy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getShipperSourceStrategy,
                ListShippersRequest::setShipperSourceStrategy));
        builder.<String>withRequestField("shipper_consumption_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getShipperConsumptionType,
                ListShippersRequest::setShipperConsumptionType));
        builder.<String>withRequestField("destination_shipper_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getDestinationShipperType,
                ListShippersRequest::setDestinationShipperType));
        builder.<String>withRequestField("shipper_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getShipperStatus, ListShippersRequest::setShipperStatus));
        builder.<String>withRequestField("create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShippersRequest::getCreateTime, ListShippersRequest::setCreateTime));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListShippersRequest::getLimit, ListShippersRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListShippersRequest::getOffset, ListShippersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionGlobalOrderRequest, ListSubscriptionGlobalOrderResponse> listSubscriptionGlobalOrder =
        genForListSubscriptionGlobalOrder();

    private static HttpRequestDef<ListSubscriptionGlobalOrderRequest, ListSubscriptionGlobalOrderResponse> genForListSubscriptionGlobalOrder() {
        // basic
        HttpRequestDef.Builder<ListSubscriptionGlobalOrderRequest, ListSubscriptionGlobalOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSubscriptionGlobalOrderRequest.class,
                    ListSubscriptionGlobalOrderResponse.class)
                .withName("ListSubscriptionGlobalOrder")
                .withUri("/v1/subscriptions/orders")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionGlobalOrderRequest::getXLanguage,
                ListSubscriptionGlobalOrderRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionOrderRequest, ListSubscriptionOrderResponse> listSubscriptionOrder =
        genForListSubscriptionOrder();

    private static HttpRequestDef<ListSubscriptionOrderRequest, ListSubscriptionOrderResponse> genForListSubscriptionOrder() {
        // basic
        HttpRequestDef.Builder<ListSubscriptionOrderRequest, ListSubscriptionOrderResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSubscriptionOrderRequest.class, ListSubscriptionOrderResponse.class)
            .withName("ListSubscriptionOrder")
            .withUri("/v1/{project_id}/subscriptions/orders")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionOrderRequest::getOffset, ListSubscriptionOrderRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionOrderRequest::getLimit, ListSubscriptionOrderRequest::setLimit));
        builder.<ListSubscriptionOrderRequest.PageEnum>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSubscriptionOrderRequest.PageEnum.class),
            f -> f.withMarshaller(ListSubscriptionOrderRequest::getPage, ListSubscriptionOrderRequest::setPage));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionOrderRequest::getXLanguage,
                ListSubscriptionOrderRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionProductRequest, ListSubscriptionProductResponse> listSubscriptionProduct =
        genForListSubscriptionProduct();

    private static HttpRequestDef<ListSubscriptionProductRequest, ListSubscriptionProductResponse> genForListSubscriptionProduct() {
        // basic
        HttpRequestDef.Builder<ListSubscriptionProductRequest, ListSubscriptionProductResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSubscriptionProductRequest.class, ListSubscriptionProductResponse.class)
            .withName("ListSubscriptionProduct")
            .withUri("/v1/{project_id}/subscriptions/products")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionProductRequest::getXLanguage,
                ListSubscriptionProductRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getWorkspaceId, ListTasksRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, ListTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, ListTasksRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getSortKey, ListTasksRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getSortDir, ListTasksRequest::setSortDir));
        builder.<String>withRequestField("note",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getNote, ListTasksRequest::setNote));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getName, ListTasksRequest::setName));
        builder.<ListTasksRequest.BusinessTypeEnum>withRequestField("business_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.BusinessTypeEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getBusinessType, ListTasksRequest::setBusinessType));
        builder.<String>withRequestField("creator_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getCreatorName, ListTasksRequest::setCreatorName));
        builder.<ListTasksRequest.QueryTypeEnum>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.QueryTypeEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getQueryType, ListTasksRequest::setQueryType));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getFromDate, ListTasksRequest::setFromDate));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getToDate, ListTasksRequest::setToDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcEndpointServiceRequest, ListVpcEndpointServiceResponse> listVpcEndpointService =
        genForListVpcEndpointService();

    private static HttpRequestDef<ListVpcEndpointServiceRequest, ListVpcEndpointServiceResponse> genForListVpcEndpointService() {
        // basic
        HttpRequestDef.Builder<ListVpcEndpointServiceRequest, ListVpcEndpointServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVpcEndpointServiceRequest.class, ListVpcEndpointServiceResponse.class)
            .withName("ListVpcEndpointService")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/nodes/vpc-endpoint-services")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcEndpointServiceRequest::getWorkspaceId,
                ListVpcEndpointServiceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilities =
        genForListVulnerabilities();

    private static HttpRequestDef<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> genForListVulnerabilities() {
        // basic
        HttpRequestDef.Builder<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListVulnerabilitiesRequest.class, ListVulnerabilitiesResponse.class)
                .withName("ListVulnerabilities")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/vulnerability/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getWorkspaceId,
                ListVulnerabilitiesRequest::setWorkspaceId));
        builder.<VulnerabilityDataObjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(VulnerabilityDataObjectSearch.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getBody, ListVulnerabilitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflows =
        genForListWorkflows();

    private static HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> genForListWorkflows() {
        // basic
        HttpRequestDef.Builder<ListWorkflowsRequest, ListWorkflowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowsRequest.class, ListWorkflowsResponse.class)
                .withName("ListWorkflows")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getWorkspaceId, ListWorkflowsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOffset, ListWorkflowsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLimit, ListWorkflowsRequest::setLimit));
        builder.<ListWorkflowsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOrder, ListWorkflowsRequest::setOrder));
        builder.<ListWorkflowsRequest.SortbyEnum>withRequestField("sortby",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowsRequest.SortbyEnum.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getSortby, ListWorkflowsRequest::setSortby));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getEnabled, ListWorkflowsRequest::setEnabled));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getName, ListWorkflowsRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDescription, ListWorkflowsRequest::setDescription));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDataclassId, ListWorkflowsRequest::setDataclassId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDataclassName, ListWorkflowsRequest::setDataclassName));
        builder.<ListWorkflowsRequest.AopTypeEnum>withRequestField("aop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowsRequest.AopTypeEnum.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getAopType, ListWorkflowsRequest::setAopType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowsResponse::getXRequestId, ListWorkflowsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForListWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForListWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListWorkspacesRequest, ListWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspacesRequest.class, ListWorkspacesResponse.class)
                .withName("ListWorkspaces")
                .withUri("/v1/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getOffset, ListWorkspacesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getLimit, ListWorkspacesRequest::setLimit));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getRegionId, ListWorkspacesRequest::setRegionId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getName, ListWorkspacesRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getDescription, ListWorkspacesRequest::setDescription));
        builder.<String>withRequestField("view_bind_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getViewBindId, ListWorkspacesRequest::setViewBindId));
        builder.<String>withRequestField("view_bind_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getViewBindName, ListWorkspacesRequest::setViewBindName));
        builder.<String>withRequestField("create_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getCreateTimeStart,
                ListWorkspacesRequest::setCreateTimeStart));
        builder.<String>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getCreateTimeEnd, ListWorkspacesRequest::setCreateTimeEnd));
        builder.<Boolean>withRequestField("is_view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getIsView, ListWorkspacesRequest::setIsView));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getIds, ListWorkspacesRequest::setIds));
        builder.<String>withRequestField("normal_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getNormalProjectId,
                ListWorkspacesRequest::setNormalProjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getEnterpriseProjectId,
                ListWorkspacesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseShipperRequest, PauseShipperResponse> pauseShipper = genForPauseShipper();

    private static HttpRequestDef<PauseShipperRequest, PauseShipperResponse> genForPauseShipper() {
        // basic
        HttpRequestDef.Builder<PauseShipperRequest, PauseShipperResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PauseShipperRequest.class, PauseShipperResponse.class)
                .withName("PauseShipper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/{shipper_id}/pause")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseShipperRequest::getWorkspaceId, PauseShipperRequest::setWorkspaceId));
        builder.<String>withRequestField("shipper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseShipperRequest::getShipperId, PauseShipperRequest::setShipperId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResumeShipperRequest, ResumeShipperResponse> resumeShipper =
        genForResumeShipper();

    private static HttpRequestDef<ResumeShipperRequest, ResumeShipperResponse> genForResumeShipper() {
        // basic
        HttpRequestDef.Builder<ResumeShipperRequest, ResumeShipperResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResumeShipperRequest.class, ResumeShipperResponse.class)
                .withName("ResumeShipper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/{shipper_id}/resume")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeShipperRequest::getWorkspaceId, ResumeShipperRequest::setWorkspaceId));
        builder.<String>withRequestField("shipper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeShipperRequest::getShipperId, ResumeShipperRequest::setShipperId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryShipperRequest, RetryShipperResponse> retryShipper = genForRetryShipper();

    private static HttpRequestDef<RetryShipperRequest, RetryShipperResponse> genForRetryShipper() {
        // basic
        HttpRequestDef.Builder<RetryShipperRequest, RetryShipperResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryShipperRequest.class, RetryShipperResponse.class)
                .withName("RetryShipper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/{shipper_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryShipperRequest::getWorkspaceId, RetryShipperRequest::setWorkspaceId));
        builder.<String>withRequestField("shipper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryShipperRequest::getShipperId, RetryShipperRequest::setShipperId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryShipperAuthorizationRequest, RetryShipperAuthorizationResponse> retryShipperAuthorization =
        genForRetryShipperAuthorization();

    private static HttpRequestDef<RetryShipperAuthorizationRequest, RetryShipperAuthorizationResponse> genForRetryShipperAuthorization() {
        // basic
        HttpRequestDef.Builder<RetryShipperAuthorizationRequest, RetryShipperAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RetryShipperAuthorizationRequest.class,
                    RetryShipperAuthorizationResponse.class)
                .withName("RetryShipperAuthorization")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/{shipper_id}/authorization/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryShipperAuthorizationRequest::getWorkspaceId,
                RetryShipperAuthorizationRequest::setWorkspaceId));
        builder.<String>withRequestField("shipper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryShipperAuthorizationRequest::getShipperId,
                RetryShipperAuthorizationRequest::setShipperId));
        builder.<String>withRequestField("param",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryShipperAuthorizationRequest::getParam,
                RetryShipperAuthorizationRequest::setParam));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchPolicyRequest, SearchPolicyResponse> searchPolicy = genForSearchPolicy();

    private static HttpRequestDef<SearchPolicyRequest, SearchPolicyResponse> genForSearchPolicy() {
        // basic
        HttpRequestDef.Builder<SearchPolicyRequest, SearchPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchPolicyRequest.class, SearchPolicyResponse.class)
                .withName("SearchPolicy")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/policys/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPolicyRequest::getWorkspaceId, SearchPolicyRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Secmaster-Version",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPolicyRequest::getXSecmasterVersion,
                SearchPolicyRequest::setXSecmasterVersion));
        builder.<SearchPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchPolicyRequestBody.class),
            f -> f.withMarshaller(SearchPolicyRequest::getBody, SearchPolicyRequest::setBody));

        // response

        builder.<String>withResponseField("content-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchPolicyResponse::getContentType, SearchPolicyResponse::setContentType));
        return builder.build();
    }

    public static final HttpRequestDef<SearchPolicyRecordRequest, SearchPolicyRecordResponse> searchPolicyRecord =
        genForSearchPolicyRecord();

    private static HttpRequestDef<SearchPolicyRecordRequest, SearchPolicyRecordResponse> genForSearchPolicyRecord() {
        // basic
        HttpRequestDef.Builder<SearchPolicyRecordRequest, SearchPolicyRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchPolicyRecordRequest.class, SearchPolicyRecordResponse.class)
                .withName("SearchPolicyRecord")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/policy-records/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPolicyRecordRequest::getWorkspaceId,
                SearchPolicyRecordRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Secmaster-Version",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPolicyRecordRequest::getXSecmasterVersion,
                SearchPolicyRecordRequest::setXSecmasterVersion));
        builder.<SearchPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchPolicyRequestBody.class),
            f -> f.withMarshaller(SearchPolicyRecordRequest::getBody, SearchPolicyRecordRequest::setBody));

        // response

        builder.<String>withResponseField("content-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchPolicyRecordResponse::getContentType,
                SearchPolicyRecordResponse::setContentType));
        return builder.build();
    }

    public static final HttpRequestDef<SearchPolicyRecordByPolicyIdRequest, SearchPolicyRecordByPolicyIdResponse> searchPolicyRecordByPolicyId =
        genForSearchPolicyRecordByPolicyId();

    private static HttpRequestDef<SearchPolicyRecordByPolicyIdRequest, SearchPolicyRecordByPolicyIdResponse> genForSearchPolicyRecordByPolicyId() {
        // basic
        HttpRequestDef.Builder<SearchPolicyRecordByPolicyIdRequest, SearchPolicyRecordByPolicyIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SearchPolicyRecordByPolicyIdRequest.class,
                    SearchPolicyRecordByPolicyIdResponse.class)
                .withName("SearchPolicyRecordByPolicyId")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/policy-records/{policy_id}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPolicyRecordByPolicyIdRequest::getWorkspaceId,
                SearchPolicyRecordByPolicyIdRequest::setWorkspaceId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPolicyRecordByPolicyIdRequest::getPolicyId,
                SearchPolicyRecordByPolicyIdRequest::setPolicyId));
        builder.<String>withRequestField("X-Secmaster-Version",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPolicyRecordByPolicyIdRequest::getXSecmasterVersion,
                SearchPolicyRecordByPolicyIdRequest::setXSecmasterVersion));
        builder.<SearchPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchPolicyRequestBody.class),
            f -> f.withMarshaller(SearchPolicyRecordByPolicyIdRequest::getBody,
                SearchPolicyRecordByPolicyIdRequest::setBody));

        // response

        builder.<String>withResponseField("content-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SearchPolicyRecordByPolicyIdResponse::getContentType,
                SearchPolicyRecordByPolicyIdResponse::setContentType));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRequest, ShowAlertResponse> showAlert = genForShowAlert();

    private static HttpRequestDef<ShowAlertRequest, ShowAlertResponse> genForShowAlert() {
        // basic
        HttpRequestDef.Builder<ShowAlertRequest, ShowAlertResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlertRequest.class, ShowAlertResponse.class)
                .withName("ShowAlert")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/{alert_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRequest::getWorkspaceId, ShowAlertRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRequest::getAlertId, ShowAlertRequest::setAlertId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertResponse::getXRequestId, ShowAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRule =
        genForShowAlertRule();

    private static HttpRequestDef<ShowAlertRuleRequest, ShowAlertRuleResponse> genForShowAlertRule() {
        // basic
        HttpRequestDef.Builder<ShowAlertRuleRequest, ShowAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlertRuleRequest.class, ShowAlertRuleResponse.class)
                .withName("ShowAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleRequest::getWorkspaceId, ShowAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleRequest::getRuleId, ShowAlertRuleRequest::setRuleId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertRuleResponse::getXRequestId, ShowAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplate =
        genForShowAlertRuleTemplate();

    private static HttpRequestDef<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> genForShowAlertRuleTemplate() {
        // basic
        HttpRequestDef.Builder<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAlertRuleTemplateRequest.class, ShowAlertRuleTemplateResponse.class)
            .withName("ShowAlertRuleTemplate")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleTemplateRequest::getWorkspaceId,
                ShowAlertRuleTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleTemplateRequest::getTemplateId,
                ShowAlertRuleTemplateRequest::setTemplateId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertRuleTemplateResponse::getXRequestId,
                ShowAlertRuleTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAopWorkflowRequest, ShowAopWorkflowResponse> showAopWorkflow =
        genForShowAopWorkflow();

    private static HttpRequestDef<ShowAopWorkflowRequest, ShowAopWorkflowResponse> genForShowAopWorkflow() {
        // basic
        HttpRequestDef.Builder<ShowAopWorkflowRequest, ShowAopWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAopWorkflowRequest.class, ShowAopWorkflowResponse.class)
                .withName("ShowAopWorkflow")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAopWorkflowRequest::getWorkspaceId, ShowAopWorkflowRequest::setWorkspaceId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAopWorkflowRequest::getWorkflowId, ShowAopWorkflowRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAopWorkflowInstanceRequest, ShowAopWorkflowInstanceResponse> showAopWorkflowInstance =
        genForShowAopWorkflowInstance();

    private static HttpRequestDef<ShowAopWorkflowInstanceRequest, ShowAopWorkflowInstanceResponse> genForShowAopWorkflowInstance() {
        // basic
        HttpRequestDef.Builder<ShowAopWorkflowInstanceRequest, ShowAopWorkflowInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAopWorkflowInstanceRequest.class, ShowAopWorkflowInstanceResponse.class)
            .withName("ShowAopWorkflowInstance")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAopWorkflowInstanceRequest::getWorkspaceId,
                ShowAopWorkflowInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAopWorkflowInstanceRequest::getInstanceId,
                ShowAopWorkflowInstanceRequest::setInstanceId));
        builder.<Boolean>withRequestField("show_topology",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAopWorkflowInstanceRequest::getShowTopology,
                ShowAopWorkflowInstanceRequest::setShowTopology));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAopWorkflowVersionRequest, ShowAopWorkflowVersionResponse> showAopWorkflowVersion =
        genForShowAopWorkflowVersion();

    private static HttpRequestDef<ShowAopWorkflowVersionRequest, ShowAopWorkflowVersionResponse> genForShowAopWorkflowVersion() {
        // basic
        HttpRequestDef.Builder<ShowAopWorkflowVersionRequest, ShowAopWorkflowVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAopWorkflowVersionRequest.class, ShowAopWorkflowVersionResponse.class)
            .withName("ShowAopWorkflowVersion")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAopWorkflowVersionRequest::getWorkspaceId,
                ShowAopWorkflowVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAopWorkflowVersionRequest::getVersionId,
                ShowAopWorkflowVersionRequest::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAttachmentRequest, ShowAttachmentResponse> showAttachment =
        genForShowAttachment();

    private static HttpRequestDef<ShowAttachmentRequest, ShowAttachmentResponse> genForShowAttachment() {
        // basic
        HttpRequestDef.Builder<ShowAttachmentRequest, ShowAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAttachmentRequest.class, ShowAttachmentResponse.class)
                .withName("ShowAttachment")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/attachment/{attach_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAttachmentRequest::getWorkspaceId, ShowAttachmentRequest::setWorkspaceId));
        builder.<String>withRequestField("attach_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAttachmentRequest::getAttachId, ShowAttachmentRequest::setAttachId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClassifierInfoRequest, ShowClassifierInfoResponse> showClassifierInfo =
        genForShowClassifierInfo();

    private static HttpRequestDef<ShowClassifierInfoRequest, ShowClassifierInfoResponse> genForShowClassifierInfo() {
        // basic
        HttpRequestDef.Builder<ShowClassifierInfoRequest, ShowClassifierInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClassifierInfoRequest.class, ShowClassifierInfoResponse.class)
                .withName("ShowClassifierInfo")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/classifiers/{classifier_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClassifierInfoRequest::getWorkspaceId,
                ShowClassifierInfoRequest::setWorkspaceId));
        builder.<String>withRequestField("classifier_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClassifierInfoRequest::getClassifierId,
                ShowClassifierInfoRequest::setClassifierId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudLogTenantWhitelistRequest, ShowCloudLogTenantWhitelistResponse> showCloudLogTenantWhitelist =
        genForShowCloudLogTenantWhitelist();

    private static HttpRequestDef<ShowCloudLogTenantWhitelistRequest, ShowCloudLogTenantWhitelistResponse> genForShowCloudLogTenantWhitelist() {
        // basic
        HttpRequestDef.Builder<ShowCloudLogTenantWhitelistRequest, ShowCloudLogTenantWhitelistResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCloudLogTenantWhitelistRequest.class,
                    ShowCloudLogTenantWhitelistResponse.class)
                .withName("ShowCloudLogTenantWhitelist")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/cloud-logs/tenant/whitelist")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudLogTenantWhitelistRequest::getWorkspaceId,
                ShowCloudLogTenantWhitelistRequest::setWorkspaceId));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudLogTenantWhitelistRequest::getDomainId,
                ShowCloudLogTenantWhitelistRequest::setDomainId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowCloudLogTenantWhitelistRequest::getOffset,
                ShowCloudLogTenantWhitelistRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowCloudLogTenantWhitelistRequest::getLimit,
                ShowCloudLogTenantWhitelistRequest::setLimit));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudLogTenantWhitelistRequest::getSortDir,
                ShowCloudLogTenantWhitelistRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudLogTenantWhitelistRequest::getSortKey,
                ShowCloudLogTenantWhitelistRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCollectorChannelRequest, ShowCollectorChannelResponse> showCollectorChannel =
        genForShowCollectorChannel();

    private static HttpRequestDef<ShowCollectorChannelRequest, ShowCollectorChannelResponse> genForShowCollectorChannel() {
        // basic
        HttpRequestDef.Builder<ShowCollectorChannelRequest, ShowCollectorChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCollectorChannelRequest.class, ShowCollectorChannelResponse.class)
            .withName("ShowCollectorChannel")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/{channel_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCollectorChannelRequest::getWorkspaceId,
                ShowCollectorChannelRequest::setWorkspaceId));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCollectorChannelRequest::getChannelId,
                ShowCollectorChannelRequest::setChannelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCollectorConnectionRequest, ShowCollectorConnectionResponse> showCollectorConnection =
        genForShowCollectorConnection();

    private static HttpRequestDef<ShowCollectorConnectionRequest, ShowCollectorConnectionResponse> genForShowCollectorConnection() {
        // basic
        HttpRequestDef.Builder<ShowCollectorConnectionRequest, ShowCollectorConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCollectorConnectionRequest.class, ShowCollectorConnectionResponse.class)
            .withName("ShowCollectorConnection")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/connections/{connection_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCollectorConnectionRequest::getWorkspaceId,
                ShowCollectorConnectionRequest::setWorkspaceId));
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCollectorConnectionRequest::getConnectionId,
                ShowCollectorConnectionRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCollectorParserRequest, ShowCollectorParserResponse> showCollectorParser =
        genForShowCollectorParser();

    private static HttpRequestDef<ShowCollectorParserRequest, ShowCollectorParserResponse> genForShowCollectorParser() {
        // basic
        HttpRequestDef.Builder<ShowCollectorParserRequest, ShowCollectorParserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCollectorParserRequest.class, ShowCollectorParserResponse.class)
                .withName("ShowCollectorParser")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/logstash/parsers/{parser_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCollectorParserRequest::getWorkspaceId,
                ShowCollectorParserRequest::setWorkspaceId));
        builder.<String>withRequestField("parser_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCollectorParserRequest::getParserId, ShowCollectorParserRequest::setParserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentRequest, ShowComponentResponse> showComponent =
        genForShowComponent();

    private static HttpRequestDef<ShowComponentRequest, ShowComponentResponse> genForShowComponent() {
        // basic
        HttpRequestDef.Builder<ShowComponentRequest, ShowComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComponentRequest.class, ShowComponentResponse.class)
                .withName("ShowComponent")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getWorkspaceId, ShowComponentRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getComponentId, ShowComponentRequest::setComponentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentActionRequest, ShowComponentActionResponse> showComponentAction =
        genForShowComponentAction();

    private static HttpRequestDef<ShowComponentActionRequest, ShowComponentActionResponse> genForShowComponentAction() {
        // basic
        HttpRequestDef.Builder<ShowComponentActionRequest, ShowComponentActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComponentActionRequest.class, ShowComponentActionResponse.class)
                .withName("ShowComponentAction")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components/{component_id}/action/{action_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentActionRequest::getWorkspaceId,
                ShowComponentActionRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentActionRequest::getComponentId,
                ShowComponentActionRequest::setComponentId));
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentActionRequest::getActionId, ShowComponentActionRequest::setActionId));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowComponentActionRequest::getEnabled, ShowComponentActionRequest::setEnabled));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentTemplateRequest, ShowComponentTemplateResponse> showComponentTemplate =
        genForShowComponentTemplate();

    private static HttpRequestDef<ShowComponentTemplateRequest, ShowComponentTemplateResponse> genForShowComponentTemplate() {
        // basic
        HttpRequestDef.Builder<ShowComponentTemplateRequest, ShowComponentTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowComponentTemplateRequest.class, ShowComponentTemplateResponse.class)
            .withName("ShowComponentTemplate")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components/template/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentTemplateRequest::getWorkspaceId,
                ShowComponentTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentTemplateRequest::getTemplateId,
                ShowComponentTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> showConnection =
        genForShowConnection();

    private static HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> genForShowConnection() {
        // basic
        HttpRequestDef.Builder<ShowConnectionRequest, ShowConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectionRequest.class, ShowConnectionResponse.class)
                .withName("ShowConnection")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/assetcredentials/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionRequest::getWorkspaceId, ShowConnectionRequest::setWorkspaceId));
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionRequest::getAssetId, ShowConnectionRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataClassInfoRequest, ShowDataClassInfoResponse> showDataClassInfo =
        genForShowDataClassInfo();

    private static HttpRequestDef<ShowDataClassInfoRequest, ShowDataClassInfoResponse> genForShowDataClassInfo() {
        // basic
        HttpRequestDef.Builder<ShowDataClassInfoRequest, ShowDataClassInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataClassInfoRequest.class, ShowDataClassInfoResponse.class)
                .withName("ShowDataClassInfo")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/dataclasses/{dataclass_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataClassInfoRequest::getWorkspaceId, ShowDataClassInfoRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataClassInfoRequest::getDataclassId, ShowDataClassInfoRequest::setDataclassId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataobjectRequest, ShowDataobjectResponse> showDataobject =
        genForShowDataobject();

    private static HttpRequestDef<ShowDataobjectRequest, ShowDataobjectResponse> genForShowDataobject() {
        // basic
        HttpRequestDef.Builder<ShowDataobjectRequest, ShowDataobjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataobjectRequest.class, ShowDataobjectResponse.class)
                .withName("ShowDataobject")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_name}/{data_object_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataobjectRequest::getWorkspaceId, ShowDataobjectRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataobjectRequest::getDataclassName, ShowDataobjectRequest::setDataclassName));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataobjectRequest::getDataObjectId, ShowDataobjectRequest::setDataObjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatapanelObjectRequest, ShowDatapanelObjectResponse> showDatapanelObject =
        genForShowDatapanelObject();

    private static HttpRequestDef<ShowDatapanelObjectRequest, ShowDatapanelObjectResponse> genForShowDatapanelObject() {
        // basic
        HttpRequestDef.Builder<ShowDatapanelObjectRequest, ShowDatapanelObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDatapanelObjectRequest.class, ShowDatapanelObjectResponse.class)
                .withName("ShowDatapanelObject")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/datapanel/{dataclass}/data-objects/{dataobject_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatapanelObjectRequest::getWorkspaceId,
                ShowDatapanelObjectRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatapanelObjectRequest::getDataclass, ShowDatapanelObjectRequest::setDataclass));
        builder.<String>withRequestField("dataobject_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatapanelObjectRequest::getDataobjectId,
                ShowDatapanelObjectRequest::setDataobjectId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDatapanelObjectResponse::getXRequestId,
                ShowDatapanelObjectResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDataspaceRequest, ShowDataspaceResponse> showDataspace =
        genForShowDataspace();

    private static HttpRequestDef<ShowDataspaceRequest, ShowDataspaceResponse> genForShowDataspace() {
        // basic
        HttpRequestDef.Builder<ShowDataspaceRequest, ShowDataspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataspaceRequest.class, ShowDataspaceResponse.class)
                .withName("ShowDataspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/dataspaces/{dataspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataspaceRequest::getWorkspaceId, ShowDataspaceRequest::setWorkspaceId));
        builder.<String>withRequestField("dataspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataspaceRequest::getDataspaceId, ShowDataspaceRequest::setDataspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIncidentRequest, ShowIncidentResponse> showIncident = genForShowIncident();

    private static HttpRequestDef<ShowIncidentRequest, ShowIncidentResponse> genForShowIncident() {
        // basic
        HttpRequestDef.Builder<ShowIncidentRequest, ShowIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIncidentRequest.class, ShowIncidentResponse.class)
                .withName("ShowIncident")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/{incident_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIncidentRequest::getWorkspaceId, ShowIncidentRequest::setWorkspaceId));
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIncidentRequest::getIncidentId, ShowIncidentRequest::setIncidentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetail =
        genForShowIndicatorDetail();

    private static HttpRequestDef<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> genForShowIndicatorDetail() {
        // basic
        HttpRequestDef.Builder<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIndicatorDetailRequest.class, ShowIndicatorDetailResponse.class)
                .withName("ShowIndicatorDetail")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/{indicator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndicatorDetailRequest::getWorkspaceId,
                ShowIndicatorDetailRequest::setWorkspaceId));
        builder.<String>withRequestField("indicator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndicatorDetailRequest::getIndicatorId,
                ShowIndicatorDetailRequest::setIndicatorId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIndicatorDetailResponse::getXRequestId,
                ShowIndicatorDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowIsapComponentRequest, ShowIsapComponentResponse> showIsapComponent =
        genForShowIsapComponent();

    private static HttpRequestDef<ShowIsapComponentRequest, ShowIsapComponentResponse> genForShowIsapComponent() {
        // basic
        HttpRequestDef.Builder<ShowIsapComponentRequest, ShowIsapComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIsapComponentRequest.class, ShowIsapComponentResponse.class)
                .withName("ShowIsapComponent")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIsapComponentRequest::getWorkspaceId, ShowIsapComponentRequest::setWorkspaceId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIsapComponentRequest::getComponentId, ShowIsapComponentRequest::setComponentId));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowIsapComponentRequest::getLimit, ShowIsapComponentRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIsapComponentRequest::getOffset, ShowIsapComponentRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIsapComponentRequest::getSortKey, ShowIsapComponentRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIsapComponentRequest::getSortDir, ShowIsapComponentRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLayoutRequest, ShowLayoutResponse> showLayout = genForShowLayout();

    private static HttpRequestDef<ShowLayoutRequest, ShowLayoutResponse> genForShowLayout() {
        // basic
        HttpRequestDef.Builder<ShowLayoutRequest, ShowLayoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLayoutRequest.class, ShowLayoutResponse.class)
                .withName("ShowLayout")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/{layout_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutRequest::getWorkspaceId, ShowLayoutRequest::setWorkspaceId));
        builder.<String>withRequestField("layout_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutRequest::getLayoutId, ShowLayoutRequest::setLayoutId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowLayoutResponse::getXRequestId, ShowLayoutResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLayoutWizardRequest, ShowLayoutWizardResponse> showLayoutWizard =
        genForShowLayoutWizard();

    private static HttpRequestDef<ShowLayoutWizardRequest, ShowLayoutWizardResponse> genForShowLayoutWizard() {
        // basic
        HttpRequestDef.Builder<ShowLayoutWizardRequest, ShowLayoutWizardResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLayoutWizardRequest.class, ShowLayoutWizardResponse.class)
                .withName("ShowLayoutWizard")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/wizards/{wizard_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutWizardRequest::getWorkspaceId, ShowLayoutWizardRequest::setWorkspaceId));
        builder.<String>withRequestField("wizard_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutWizardRequest::getWizardId, ShowLayoutWizardRequest::setWizardId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowLayoutWizardResponse::getXRequestId, ShowLayoutWizardResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLayoutWizardByFieldRequest, ShowLayoutWizardByFieldResponse> showLayoutWizardByField =
        genForShowLayoutWizardByField();

    private static HttpRequestDef<ShowLayoutWizardByFieldRequest, ShowLayoutWizardByFieldResponse> genForShowLayoutWizardByField() {
        // basic
        HttpRequestDef.Builder<ShowLayoutWizardByFieldRequest, ShowLayoutWizardByFieldResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLayoutWizardByFieldRequest.class, ShowLayoutWizardByFieldResponse.class)
            .withName("ShowLayoutWizardByField")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/wizards")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutWizardByFieldRequest::getWorkspaceId,
                ShowLayoutWizardByFieldRequest::setWorkspaceId));
        builder.<String>withRequestField("layout_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutWizardByFieldRequest::getLayoutId,
                ShowLayoutWizardByFieldRequest::setLayoutId));
        builder.<String>withRequestField("field_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutWizardByFieldRequest::getFieldId,
                ShowLayoutWizardByFieldRequest::setFieldId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowLayoutWizardByFieldResponse::getXRequestId,
                ShowLayoutWizardByFieldResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowMapperDetailRequest, ShowMapperDetailResponse> showMapperDetail =
        genForShowMapperDetail();

    private static HttpRequestDef<ShowMapperDetailRequest, ShowMapperDetailResponse> genForShowMapperDetail() {
        // basic
        HttpRequestDef.Builder<ShowMapperDetailRequest, ShowMapperDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMapperDetailRequest.class, ShowMapperDetailResponse.class)
                .withName("ShowMapperDetail")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/mappers/{mapper_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMapperDetailRequest::getWorkspaceId, ShowMapperDetailRequest::setWorkspaceId));
        builder.<String>withRequestField("mapper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMapperDetailRequest::getMapperId, ShowMapperDetailRequest::setMapperId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMapperListRequest, ShowMapperListResponse> showMapperList =
        genForShowMapperList();

    private static HttpRequestDef<ShowMapperListRequest, ShowMapperListResponse> genForShowMapperList() {
        // basic
        HttpRequestDef.Builder<ShowMapperListRequest, ShowMapperListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMapperListRequest.class, ShowMapperListResponse.class)
                .withName("ShowMapperList")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/mappers/search")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMapperListRequest::getWorkspaceId, ShowMapperListRequest::setWorkspaceId));
        builder.<QueryDpeMapperRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryDpeMapperRequestBody.class),
            f -> f.withMarshaller(ShowMapperListRequest::getBody, ShowMapperListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMappingFunctionRequest, ShowMappingFunctionResponse> showMappingFunction =
        genForShowMappingFunction();

    private static HttpRequestDef<ShowMappingFunctionRequest, ShowMappingFunctionResponse> genForShowMappingFunction() {
        // basic
        HttpRequestDef.Builder<ShowMappingFunctionRequest, ShowMappingFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMappingFunctionRequest.class, ShowMappingFunctionResponse.class)
                .withName("ShowMappingFunction")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/functions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMappingFunctionRequest::getWorkspaceId,
                ShowMappingFunctionRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMappingInfoListRequest, ShowMappingInfoListResponse> showMappingInfoList =
        genForShowMappingInfoList();

    private static HttpRequestDef<ShowMappingInfoListRequest, ShowMappingInfoListResponse> genForShowMappingInfoList() {
        // basic
        HttpRequestDef.Builder<ShowMappingInfoListRequest, ShowMappingInfoListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMappingInfoListRequest.class, ShowMappingInfoListResponse.class)
                .withName("ShowMappingInfoList")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/search")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMappingInfoListRequest::getWorkspaceId,
                ShowMappingInfoListRequest::setWorkspaceId));
        builder.<QueryDpeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryDpeRequestBody.class),
            f -> f.withMarshaller(ShowMappingInfoListRequest::getBody, ShowMappingInfoListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricMetaDataRequest, ShowMetricMetaDataResponse> showMetricMetaData =
        genForShowMetricMetaData();

    private static HttpRequestDef<ShowMetricMetaDataRequest, ShowMetricMetaDataResponse> genForShowMetricMetaData() {
        // basic
        HttpRequestDef.Builder<ShowMetricMetaDataRequest, ShowMetricMetaDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetricMetaDataRequest.class, ShowMetricMetaDataResponse.class)
                .withName("ShowMetricMetaData")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/metrics/{metric_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricMetaDataRequest::getWorkspaceId,
                ShowMetricMetaDataRequest::setWorkspaceId));
        builder.<String>withRequestField("metric_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricMetaDataRequest::getMetricId, ShowMetricMetaDataRequest::setMetricId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMetricMetaDataResponse::getXRequestId,
                ShowMetricMetaDataResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowModuleRequest, ShowModuleResponse> showModule = genForShowModule();

    private static HttpRequestDef<ShowModuleRequest, ShowModuleResponse> genForShowModule() {
        // basic
        HttpRequestDef.Builder<ShowModuleRequest, ShowModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowModuleRequest.class, ShowModuleResponse.class)
                .withName("ShowModule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/modules/{module_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModuleRequest::getWorkspaceId, ShowModuleRequest::setWorkspaceId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModuleRequest::getModuleId, ShowModuleRequest::setModuleId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowModuleResponse::getXRequestId, ShowModuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowMoniterMetricStatsRequest, ShowMoniterMetricStatsResponse> showMoniterMetricStats =
        genForShowMoniterMetricStats();

    private static HttpRequestDef<ShowMoniterMetricStatsRequest, ShowMoniterMetricStatsResponse> genForShowMoniterMetricStats() {
        // basic
        HttpRequestDef.Builder<ShowMoniterMetricStatsRequest, ShowMoniterMetricStatsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowMoniterMetricStatsRequest.class, ShowMoniterMetricStatsResponse.class)
            .withName("ShowMoniterMetricStats")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/moniter/metric/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMoniterMetricStatsRequest::getWorkspaceId,
                ShowMoniterMetricStatsRequest::setWorkspaceId));
        builder.<ShowMetricStatsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowMetricStatsRequestBody.class),
            f -> f.withMarshaller(ShowMoniterMetricStatsRequest::getBody, ShowMoniterMetricStatsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipeRequest, ShowPipeResponse> showPipe = genForShowPipe();

    private static HttpRequestDef<ShowPipeRequest, ShowPipeResponse> genForShowPipe() {
        // basic
        HttpRequestDef.Builder<ShowPipeRequest, ShowPipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPipeRequest.class, ShowPipeResponse.class)
                .withName("ShowPipe")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipeRequest::getWorkspaceId, ShowPipeRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipeRequest::getPipeId, ShowPipeRequest::setPipeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipeConsumptionRequest, ShowPipeConsumptionResponse> showPipeConsumption =
        genForShowPipeConsumption();

    private static HttpRequestDef<ShowPipeConsumptionRequest, ShowPipeConsumptionResponse> genForShowPipeConsumption() {
        // basic
        HttpRequestDef.Builder<ShowPipeConsumptionRequest, ShowPipeConsumptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPipeConsumptionRequest.class, ShowPipeConsumptionResponse.class)
                .withName("ShowPipeConsumption")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}/consumption")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipeConsumptionRequest::getWorkspaceId,
                ShowPipeConsumptionRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipeConsumptionRequest::getPipeId, ShowPipeConsumptionRequest::setPipeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipeIndexRequest, ShowPipeIndexResponse> showPipeIndex =
        genForShowPipeIndex();

    private static HttpRequestDef<ShowPipeIndexRequest, ShowPipeIndexResponse> genForShowPipeIndex() {
        // basic
        HttpRequestDef.Builder<ShowPipeIndexRequest, ShowPipeIndexResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPipeIndexRequest.class, ShowPipeIndexResponse.class)
                .withName("ShowPipeIndex")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}/index")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipeIndexRequest::getWorkspaceId, ShowPipeIndexRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipeIndexRequest::getPipeId, ShowPipeIndexRequest::setPipeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlatformManagedRequest, ShowPlatformManagedResponse> showPlatformManaged =
        genForShowPlatformManaged();

    private static HttpRequestDef<ShowPlatformManagedRequest, ShowPlatformManagedResponse> genForShowPlatformManaged() {
        // basic
        HttpRequestDef.Builder<ShowPlatformManagedRequest, ShowPlatformManagedResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlatformManagedRequest.class, ShowPlatformManagedResponse.class)
                .withName("ShowPlatformManaged")
                .withUri("/v1/{project_id}/siem/cloud-logs/managers")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybook = genForShowPlaybook();

    private static HttpRequestDef<ShowPlaybookRequest, ShowPlaybookResponse> genForShowPlaybook() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookRequest, ShowPlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlaybookRequest.class, ShowPlaybookResponse.class)
                .withName("ShowPlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRequest::getWorkspaceId, ShowPlaybookRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRequest::getPlaybookId, ShowPlaybookRequest::setPlaybookId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookResponse::getXRequestId, ShowPlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstance =
        genForShowPlaybookInstance();

    private static HttpRequestDef<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> genForShowPlaybookInstance() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPlaybookInstanceRequest.class, ShowPlaybookInstanceResponse.class)
            .withName("ShowPlaybookInstance")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookInstanceRequest::getWorkspaceId,
                ShowPlaybookInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookInstanceRequest::getInstanceId,
                ShowPlaybookInstanceRequest::setInstanceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookInstanceResponse::getXRequestId,
                ShowPlaybookInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> showPlaybookMonitors =
        genForShowPlaybookMonitors();

    private static HttpRequestDef<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> genForShowPlaybookMonitors() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPlaybookMonitorsRequest.class, ShowPlaybookMonitorsResponse.class)
            .withName("ShowPlaybookMonitors")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}/monitor")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getWorkspaceId,
                ShowPlaybookMonitorsRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getPlaybookId,
                ShowPlaybookMonitorsRequest::setPlaybookId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getStartTime,
                ShowPlaybookMonitorsRequest::setStartTime));
        builder.<ShowPlaybookMonitorsRequest.VersionQueryTypeEnum>withRequestField("version_query_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowPlaybookMonitorsRequest.VersionQueryTypeEnum.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getVersionQueryType,
                ShowPlaybookMonitorsRequest::setVersionQueryType));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getEndTime, ShowPlaybookMonitorsRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookMonitorsResponse::getXRequestId,
                ShowPlaybookMonitorsResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookMonitorsResponse::getXAPIDeprecationInfo,
                ShowPlaybookMonitorsResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookMonitorsResponse::getXAPIDeprecationDate,
                ShowPlaybookMonitorsResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRule =
        genForShowPlaybookRule();

    private static HttpRequestDef<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> genForShowPlaybookRule() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlaybookRuleRequest.class, ShowPlaybookRuleResponse.class)
                .withName("ShowPlaybookRule")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getWorkspaceId, ShowPlaybookRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getVersionId, ShowPlaybookRuleRequest::setVersionId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getRuleId, ShowPlaybookRuleRequest::setRuleId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookRuleResponse::getXRequestId, ShowPlaybookRuleResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookRuleResponse::getXAPIDeprecationInfo,
                ShowPlaybookRuleResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookRuleResponse::getXAPIDeprecationDate,
                ShowPlaybookRuleResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatistics =
        genForShowPlaybookStatistics();

    private static HttpRequestDef<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> genForShowPlaybookStatistics() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPlaybookStatisticsRequest.class, ShowPlaybookStatisticsResponse.class)
            .withName("ShowPlaybookStatistics")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookStatisticsRequest::getWorkspaceId,
                ShowPlaybookStatisticsRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookStatisticsResponse::getXRequestId,
                ShowPlaybookStatisticsResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookStatisticsResponse::getXAPIDeprecationInfo,
                ShowPlaybookStatisticsResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookStatisticsResponse::getXAPIDeprecationDate,
                ShowPlaybookStatisticsResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopology =
        genForShowPlaybookTopology();

    private static HttpRequestDef<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> genForShowPlaybookTopology() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPlaybookTopologyRequest.class, ShowPlaybookTopologyResponse.class)
            .withName("ShowPlaybookTopology")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances/{instance_id}/topology")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookTopologyRequest::getWorkspaceId,
                ShowPlaybookTopologyRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookTopologyRequest::getInstanceId,
                ShowPlaybookTopologyRequest::setInstanceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookTopologyResponse::getXRequestId,
                ShowPlaybookTopologyResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> showPlaybookVersion =
        genForShowPlaybookVersion();

    private static HttpRequestDef<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> genForShowPlaybookVersion() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlaybookVersionRequest.class, ShowPlaybookVersionResponse.class)
                .withName("ShowPlaybookVersion")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookVersionRequest::getWorkspaceId,
                ShowPlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookVersionRequest::getVersionId, ShowPlaybookVersionRequest::setVersionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookVersionResponse::getXRequestId,
                ShowPlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForShowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForShowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/policys/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getWorkspaceId, ShowPolicyRequest::setWorkspaceId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, ShowPolicyRequest::setPolicyId));
        builder.<String>withRequestField("X-Secmaster-Version",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getXSecmasterVersion, ShowPolicyRequest::setXSecmasterVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPreProcessRulesListRequest, ShowPreProcessRulesListResponse> showPreProcessRulesList =
        genForShowPreProcessRulesList();

    private static HttpRequestDef<ShowPreProcessRulesListRequest, ShowPreProcessRulesListResponse> genForShowPreProcessRulesList() {
        // basic
        HttpRequestDef.Builder<ShowPreProcessRulesListRequest, ShowPreProcessRulesListResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowPreProcessRulesListRequest.class, ShowPreProcessRulesListResponse.class)
            .withName("ShowPreProcessRulesList")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/preprocess-rules/search")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPreProcessRulesListRequest::getWorkspaceId,
                ShowPreProcessRulesListRequest::setWorkspaceId));
        builder.<ShowPreProcessRulesListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPreProcessRulesListRequestBody.class),
            f -> f.withMarshaller(ShowPreProcessRulesListRequest::getBody, ShowPreProcessRulesListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportInfoRequest, ShowReportInfoResponse> showReportInfo =
        genForShowReportInfo();

    private static HttpRequestDef<ShowReportInfoRequest, ShowReportInfoResponse> genForShowReportInfo() {
        // basic
        HttpRequestDef.Builder<ShowReportInfoRequest, ShowReportInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReportInfoRequest.class, ShowReportInfoResponse.class)
                .withName("ShowReportInfo")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/reports/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportInfoRequest::getWorkspaceId, ShowReportInfoRequest::setWorkspaceId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportInfoRequest::getReportId, ShowReportInfoRequest::setReportId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowReportInfoResponse::getXRequestId, ShowReportInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRequest, ShowResourceResponse> showResource = genForShowResource();

    private static HttpRequestDef<ShowResourceRequest, ShowResourceResponse> genForShowResource() {
        // basic
        HttpRequestDef.Builder<ShowResourceRequest, ShowResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceRequest.class, ShowResourceResponse.class)
                .withName("ShowResource")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/resources/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRequest::getWorkspaceId, ShowResourceRequest::setWorkspaceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRequest::getId, ShowResourceRequest::setId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRequest::getXLanguage, ShowResourceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSearchConditionRequest, ShowSearchConditionResponse> showSearchCondition =
        genForShowSearchCondition();

    private static HttpRequestDef<ShowSearchConditionRequest, ShowSearchConditionResponse> genForShowSearchCondition() {
        // basic
        HttpRequestDef.Builder<ShowSearchConditionRequest, ShowSearchConditionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSearchConditionRequest.class, ShowSearchConditionResponse.class)
                .withName("ShowSearchCondition")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/search/conditions/{condition_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSearchConditionRequest::getWorkspaceId,
                ShowSearchConditionRequest::setWorkspaceId));
        builder.<String>withRequestField("condition_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSearchConditionRequest::getConditionId,
                ShowSearchConditionRequest::setConditionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShipperRequest, ShowShipperResponse> showShipper = genForShowShipper();

    private static HttpRequestDef<ShowShipperRequest, ShowShipperResponse> genForShowShipper() {
        // basic
        HttpRequestDef.Builder<ShowShipperRequest, ShowShipperResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowShipperRequest.class, ShowShipperResponse.class)
                .withName("ShowShipper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/{shipper_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShipperRequest::getWorkspaceId, ShowShipperRequest::setWorkspaceId));
        builder.<String>withRequestField("shipper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShipperRequest::getShipperId, ShowShipperRequest::setShipperId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShipperDelegateAuthRequest, ShowShipperDelegateAuthResponse> showShipperDelegateAuth =
        genForShowShipperDelegateAuth();

    private static HttpRequestDef<ShowShipperDelegateAuthRequest, ShowShipperDelegateAuthResponse> genForShowShipperDelegateAuth() {
        // basic
        HttpRequestDef.Builder<ShowShipperDelegateAuthRequest, ShowShipperDelegateAuthResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowShipperDelegateAuthRequest.class, ShowShipperDelegateAuthResponse.class)
            .withName("ShowShipperDelegateAuth")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/delegate/auth/{domain_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShipperDelegateAuthRequest::getWorkspaceId,
                ShowShipperDelegateAuthRequest::setWorkspaceId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShipperDelegateAuthRequest::getDomainId,
                ShowShipperDelegateAuthRequest::setDomainId));
        builder.<String>withRequestField("agency_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShipperDelegateAuthRequest::getAgencyName,
                ShowShipperDelegateAuthRequest::setAgencyName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShipperParamRequest, ShowShipperParamResponse> showShipperParam =
        genForShowShipperParam();

    private static HttpRequestDef<ShowShipperParamRequest, ShowShipperParamResponse> genForShowShipperParam() {
        // basic
        HttpRequestDef.Builder<ShowShipperParamRequest, ShowShipperParamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowShipperParamRequest.class, ShowShipperParamResponse.class)
                .withName("ShowShipperParam")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/shippers/params/{param_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShipperParamRequest::getWorkspaceId, ShowShipperParamRequest::setWorkspaceId));
        builder.<String>withRequestField("param_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShipperParamRequest::getParamType, ShowShipperParamRequest::setParamType));
        builder.<String>withRequestField("param",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShipperParamRequest::getParam, ShowShipperParamRequest::setParam));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getWorkspaceId, ShowTaskRequest::setWorkspaceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVulnerabilityRequest, ShowVulnerabilityResponse> showVulnerability =
        genForShowVulnerability();

    private static HttpRequestDef<ShowVulnerabilityRequest, ShowVulnerabilityResponse> genForShowVulnerability() {
        // basic
        HttpRequestDef.Builder<ShowVulnerabilityRequest, ShowVulnerabilityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVulnerabilityRequest.class, ShowVulnerabilityResponse.class)
                .withName("ShowVulnerability")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/vulnerability/{vul_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVulnerabilityRequest::getWorkspaceId, ShowVulnerabilityRequest::setWorkspaceId));
        builder.<String>withRequestField("vul_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVulnerabilityRequest::getVulId, ShowVulnerabilityRequest::setVulId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceRequest, ShowWorkspaceResponse> showWorkspace =
        genForShowWorkspace();

    private static HttpRequestDef<ShowWorkspaceRequest, ShowWorkspaceResponse> genForShowWorkspace() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceRequest, ShowWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkspaceRequest.class, ShowWorkspaceResponse.class)
                .withName("ShowWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkspaceRequest::getWorkspaceId, ShowWorkspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRule =
        genForUpdateAlertRule();

    private static HttpRequestDef<UpdateAlertRuleRequest, UpdateAlertRuleResponse> genForUpdateAlertRule() {
        // basic
        HttpRequestDef.Builder<UpdateAlertRuleRequest, UpdateAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlertRuleRequest.class, UpdateAlertRuleResponse.class)
                .withName("UpdateAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getWorkspaceId, UpdateAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getRuleId, UpdateAlertRuleRequest::setRuleId));
        builder.<UpdateAlertRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlertRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getBody, UpdateAlertRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAlertRuleResponse::getXRequestId, UpdateAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateAopWorkflowRequest, UpdateAopWorkflowResponse> updateAopWorkflow =
        genForUpdateAopWorkflow();

    private static HttpRequestDef<UpdateAopWorkflowRequest, UpdateAopWorkflowResponse> genForUpdateAopWorkflow() {
        // basic
        HttpRequestDef.Builder<UpdateAopWorkflowRequest, UpdateAopWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAopWorkflowRequest.class, UpdateAopWorkflowResponse.class)
                .withName("UpdateAopWorkflow")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAopWorkflowRequest::getWorkspaceId, UpdateAopWorkflowRequest::setWorkspaceId));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAopWorkflowRequest::getWorkflowId, UpdateAopWorkflowRequest::setWorkflowId));
        builder.<ModifyAopWorkflowInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyAopWorkflowInfo.class),
            f -> f.withMarshaller(UpdateAopWorkflowRequest::getBody, UpdateAopWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAopWorkflowVersionRequest, UpdateAopWorkflowVersionResponse> updateAopWorkflowVersion =
        genForUpdateAopWorkflowVersion();

    private static HttpRequestDef<UpdateAopWorkflowVersionRequest, UpdateAopWorkflowVersionResponse> genForUpdateAopWorkflowVersion() {
        // basic
        HttpRequestDef.Builder<UpdateAopWorkflowVersionRequest, UpdateAopWorkflowVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateAopWorkflowVersionRequest.class, UpdateAopWorkflowVersionResponse.class)
                .withName("UpdateAopWorkflowVersion")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAopWorkflowVersionRequest::getWorkspaceId,
                UpdateAopWorkflowVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAopWorkflowVersionRequest::getVersionId,
                UpdateAopWorkflowVersionRequest::setVersionId));
        builder.<ModifyAopWorkflowVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyAopWorkflowVersionInfo.class),
            f -> f.withMarshaller(UpdateAopWorkflowVersionRequest::getBody, UpdateAopWorkflowVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCatalogueRequest, UpdateCatalogueResponse> updateCatalogue =
        genForUpdateCatalogue();

    private static HttpRequestDef<UpdateCatalogueRequest, UpdateCatalogueResponse> genForUpdateCatalogue() {
        // basic
        HttpRequestDef.Builder<UpdateCatalogueRequest, UpdateCatalogueResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCatalogueRequest.class, UpdateCatalogueResponse.class)
                .withName("UpdateCatalogue")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/catalogues/{catalogue_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCatalogueRequest::getWorkspaceId, UpdateCatalogueRequest::setWorkspaceId));
        builder.<String>withRequestField("catalogue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCatalogueRequest::getCatalogueId, UpdateCatalogueRequest::setCatalogueId));
        builder.<CatalogueUpdateRequestPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CatalogueUpdateRequestPojo.class),
            f -> f.withMarshaller(UpdateCatalogueRequest::getBody, UpdateCatalogueRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateCatalogueResponse::getXRequestId, UpdateCatalogueResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateClassifierRequest, UpdateClassifierResponse> updateClassifier =
        genForUpdateClassifier();

    private static HttpRequestDef<UpdateClassifierRequest, UpdateClassifierResponse> genForUpdateClassifier() {
        // basic
        HttpRequestDef.Builder<UpdateClassifierRequest, UpdateClassifierResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClassifierRequest.class, UpdateClassifierResponse.class)
                .withName("UpdateClassifier")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/classifiers/{classifier_id}")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClassifierRequest::getWorkspaceId, UpdateClassifierRequest::setWorkspaceId));
        builder.<String>withRequestField("classifier_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClassifierRequest::getClassifierId, UpdateClassifierRequest::setClassifierId));
        builder.<CreateDpeClassifyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDpeClassifyRequestBody.class),
            f -> f.withMarshaller(UpdateClassifierRequest::getBody, UpdateClassifierRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCollectorChannelRequest, UpdateCollectorChannelResponse> updateCollectorChannel =
        genForUpdateCollectorChannel();

    private static HttpRequestDef<UpdateCollectorChannelRequest, UpdateCollectorChannelResponse> genForUpdateCollectorChannel() {
        // basic
        HttpRequestDef.Builder<UpdateCollectorChannelRequest, UpdateCollectorChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCollectorChannelRequest.class, UpdateCollectorChannelResponse.class)
            .withName("UpdateCollectorChannel")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/{channel_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCollectorChannelRequest::getWorkspaceId,
                UpdateCollectorChannelRequest::setWorkspaceId));
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCollectorChannelRequest::getChannelId,
                UpdateCollectorChannelRequest::setChannelId));
        builder.<CreateChannelDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateChannelDto.class),
            f -> f.withMarshaller(UpdateCollectorChannelRequest::getBody, UpdateCollectorChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCollectorChannelGroupRequest, UpdateCollectorChannelGroupResponse> updateCollectorChannelGroup =
        genForUpdateCollectorChannelGroup();

    private static HttpRequestDef<UpdateCollectorChannelGroupRequest, UpdateCollectorChannelGroupResponse> genForUpdateCollectorChannelGroup() {
        // basic
        HttpRequestDef.Builder<UpdateCollectorChannelGroupRequest, UpdateCollectorChannelGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateCollectorChannelGroupRequest.class,
                    UpdateCollectorChannelGroupResponse.class)
                .withName("UpdateCollectorChannelGroup")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/channels/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCollectorChannelGroupRequest::getWorkspaceId,
                UpdateCollectorChannelGroupRequest::setWorkspaceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCollectorChannelGroupRequest::getGroupId,
                UpdateCollectorChannelGroupRequest::setGroupId));
        builder.<GroupDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GroupDto.class),
            f -> f.withMarshaller(UpdateCollectorChannelGroupRequest::getBody,
                UpdateCollectorChannelGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCollectorConnectionRequest, UpdateCollectorConnectionResponse> updateCollectorConnection =
        genForUpdateCollectorConnection();

    private static HttpRequestDef<UpdateCollectorConnectionRequest, UpdateCollectorConnectionResponse> genForUpdateCollectorConnection() {
        // basic
        HttpRequestDef.Builder<UpdateCollectorConnectionRequest, UpdateCollectorConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateCollectorConnectionRequest.class,
                    UpdateCollectorConnectionResponse.class)
                .withName("UpdateCollectorConnection")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/collector/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCollectorConnectionRequest::getWorkspaceId,
                UpdateCollectorConnectionRequest::setWorkspaceId));
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCollectorConnectionRequest::getConnectionId,
                UpdateCollectorConnectionRequest::setConnectionId));
        builder.<UpdateConnectionDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConnectionDto.class),
            f -> f.withMarshaller(UpdateCollectorConnectionRequest::getBody,
                UpdateCollectorConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResponse> updateComponentConfiguration =
        genForUpdateComponentConfiguration();

    private static HttpRequestDef<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResponse> genForUpdateComponentConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateComponentConfigurationRequest.class,
                    UpdateComponentConfigurationResponse.class)
                .withName("UpdateComponentConfiguration")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/components/{component_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentConfigurationRequest::getComponentId,
                UpdateComponentConfigurationRequest::setComponentId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentConfigurationRequest::getWorkspaceId,
                UpdateComponentConfigurationRequest::setWorkspaceId));
        builder.<ConfigurationInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationInfoDto.class),
            f -> f.withMarshaller(UpdateComponentConfigurationRequest::getBody,
                UpdateComponentConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateComponentTemplateRequest, UpdateComponentTemplateResponse> updateComponentTemplate =
        genForUpdateComponentTemplate();

    private static HttpRequestDef<UpdateComponentTemplateRequest, UpdateComponentTemplateResponse> genForUpdateComponentTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateComponentTemplateRequest, UpdateComponentTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateComponentTemplateRequest.class, UpdateComponentTemplateResponse.class)
            .withName("UpdateComponentTemplate")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/components/template/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentTemplateRequest::getWorkspaceId,
                UpdateComponentTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentTemplateRequest::getTemplateId,
                UpdateComponentTemplateRequest::setTemplateId));
        builder.<CreateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateReq.class),
            f -> f.withMarshaller(UpdateComponentTemplateRequest::getBody, UpdateComponentTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationDictionariesRequest, UpdateConfigurationDictionariesResponse> updateConfigurationDictionaries =
        genForUpdateConfigurationDictionaries();

    private static HttpRequestDef<UpdateConfigurationDictionariesRequest, UpdateConfigurationDictionariesResponse> genForUpdateConfigurationDictionaries() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationDictionariesRequest, UpdateConfigurationDictionariesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateConfigurationDictionariesRequest.class,
                    UpdateConfigurationDictionariesResponse.class)
                .withName("UpdateConfigurationDictionaries")
                .withUri("/v1/{project_id}/configurations/dictionaries")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationDictionariesRequest::getXLanguage,
                UpdateConfigurationDictionariesRequest::setXLanguage));
        builder.<CreateDictionaryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDictionaryRequest.class),
            f -> f.withMarshaller(UpdateConfigurationDictionariesRequest::getBody,
                UpdateConfigurationDictionariesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> updateConnection =
        genForUpdateConnection();

    private static HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> genForUpdateConnection() {
        // basic
        HttpRequestDef.Builder<UpdateConnectionRequest, UpdateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConnectionRequest.class, UpdateConnectionResponse.class)
                .withName("UpdateConnection")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/assetcredentials/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getWorkspaceId, UpdateConnectionRequest::setWorkspaceId));
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getAssetId, UpdateConnectionRequest::setAssetId));
        builder.<CreateAssetsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAssetsRequestBody.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getBody, UpdateConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataobjectRequest, UpdateDataobjectResponse> updateDataobject =
        genForUpdateDataobject();

    private static HttpRequestDef<UpdateDataobjectRequest, UpdateDataobjectResponse> genForUpdateDataobject() {
        // basic
        HttpRequestDef.Builder<UpdateDataobjectRequest, UpdateDataobjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataobjectRequest.class, UpdateDataobjectResponse.class)
                .withName("UpdateDataobject")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_name}/{data_object_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataobjectRequest::getWorkspaceId, UpdateDataobjectRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataobjectRequest::getDataclassName,
                UpdateDataobjectRequest::setDataclassName));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataobjectRequest::getDataObjectId, UpdateDataobjectRequest::setDataObjectId));
        builder.<DataObjectBatchUpdateForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataObjectBatchUpdateForm.class),
            f -> f.withMarshaller(UpdateDataobjectRequest::getBody, UpdateDataobjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataspaceRequest, UpdateDataspaceResponse> updateDataspace =
        genForUpdateDataspace();

    private static HttpRequestDef<UpdateDataspaceRequest, UpdateDataspaceResponse> genForUpdateDataspace() {
        // basic
        HttpRequestDef.Builder<UpdateDataspaceRequest, UpdateDataspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataspaceRequest.class, UpdateDataspaceResponse.class)
                .withName("UpdateDataspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/dataspaces/{dataspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataspaceRequest::getWorkspaceId, UpdateDataspaceRequest::setWorkspaceId));
        builder.<String>withRequestField("dataspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataspaceRequest::getDataspaceId, UpdateDataspaceRequest::setDataspaceId));
        builder.<UpdateDataspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDataspaceRequestBody.class),
            f -> f.withMarshaller(UpdateDataspaceRequest::getBody, UpdateDataspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicator =
        genForUpdateIndicator();

    private static HttpRequestDef<UpdateIndicatorRequest, UpdateIndicatorResponse> genForUpdateIndicator() {
        // basic
        HttpRequestDef.Builder<UpdateIndicatorRequest, UpdateIndicatorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIndicatorRequest.class, UpdateIndicatorResponse.class)
                .withName("UpdateIndicator")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/{indicator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndicatorRequest::getWorkspaceId, UpdateIndicatorRequest::setWorkspaceId));
        builder.<String>withRequestField("indicator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndicatorRequest::getIndicatorId, UpdateIndicatorRequest::setIndicatorId));
        builder.<UpdateIndicatorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIndicatorRequestBody.class),
            f -> f.withMarshaller(UpdateIndicatorRequest::getBody, UpdateIndicatorRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateIndicatorResponse::getXRequestId, UpdateIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateLayoutRequest, UpdateLayoutResponse> updateLayout = genForUpdateLayout();

    private static HttpRequestDef<UpdateLayoutRequest, UpdateLayoutResponse> genForUpdateLayout() {
        // basic
        HttpRequestDef.Builder<UpdateLayoutRequest, UpdateLayoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLayoutRequest.class, UpdateLayoutResponse.class)
                .withName("UpdateLayout")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/{layout_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLayoutRequest::getWorkspaceId, UpdateLayoutRequest::setWorkspaceId));
        builder.<String>withRequestField("layout_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLayoutRequest::getLayoutId, UpdateLayoutRequest::setLayoutId));
        builder.<LayoutUpdateRequestPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LayoutUpdateRequestPojo.class),
            f -> f.withMarshaller(UpdateLayoutRequest::getBody, UpdateLayoutRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLayoutResponse::getXRequestId, UpdateLayoutResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateLayoutWizardsRequest, UpdateLayoutWizardsResponse> updateLayoutWizards =
        genForUpdateLayoutWizards();

    private static HttpRequestDef<UpdateLayoutWizardsRequest, UpdateLayoutWizardsResponse> genForUpdateLayoutWizards() {
        // basic
        HttpRequestDef.Builder<UpdateLayoutWizardsRequest, UpdateLayoutWizardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLayoutWizardsRequest.class, UpdateLayoutWizardsResponse.class)
                .withName("UpdateLayoutWizards")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/layouts/wizards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLayoutWizardsRequest::getWorkspaceId,
                UpdateLayoutWizardsRequest::setWorkspaceId));
        builder.<WizardUpdateRequestPojos>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WizardUpdateRequestPojos.class),
            f -> f.withMarshaller(UpdateLayoutWizardsRequest::getBody, UpdateLayoutWizardsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLayoutWizardsResponse::getXRequestId,
                UpdateLayoutWizardsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateMapperRequest, UpdateMapperResponse> updateMapper = genForUpdateMapper();

    private static HttpRequestDef<UpdateMapperRequest, UpdateMapperResponse> genForUpdateMapper() {
        // basic
        HttpRequestDef.Builder<UpdateMapperRequest, UpdateMapperResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMapperRequest.class, UpdateMapperResponse.class)
                .withName("UpdateMapper")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/mappers/{mapper_id}")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMapperRequest::getWorkspaceId, UpdateMapperRequest::setWorkspaceId));
        builder.<String>withRequestField("mapper_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMapperRequest::getMapperId, UpdateMapperRequest::setMapperId));
        builder.<CreateDpeMappingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDpeMappingRequestBody.class),
            f -> f.withMarshaller(UpdateMapperRequest::getBody, UpdateMapperRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMappingInfoStatusRequest, UpdateMappingInfoStatusResponse> updateMappingInfoStatus =
        genForUpdateMappingInfoStatus();

    private static HttpRequestDef<UpdateMappingInfoStatusRequest, UpdateMappingInfoStatusResponse> genForUpdateMappingInfoStatus() {
        // basic
        HttpRequestDef.Builder<UpdateMappingInfoStatusRequest, UpdateMappingInfoStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMappingInfoStatusRequest.class, UpdateMappingInfoStatusResponse.class)
            .withName("UpdateMappingInfoStatus")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/mappings/{mapping_id}/status")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMappingInfoStatusRequest::getWorkspaceId,
                UpdateMappingInfoStatusRequest::setWorkspaceId));
        builder.<String>withRequestField("mapping_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMappingInfoStatusRequest::getMappingId,
                UpdateMappingInfoStatusRequest::setMappingId));
        builder.<UpdateDpeInfoStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDpeInfoStatusRequestBody.class),
            f -> f.withMarshaller(UpdateMappingInfoStatusRequest::getBody, UpdateMappingInfoStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMetricsRequest, UpdateMetricsResponse> updateMetrics =
        genForUpdateMetrics();

    private static HttpRequestDef<UpdateMetricsRequest, UpdateMetricsResponse> genForUpdateMetrics() {
        // basic
        HttpRequestDef.Builder<UpdateMetricsRequest, UpdateMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMetricsRequest.class, UpdateMetricsResponse.class)
                .withName("UpdateMetrics")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/metrics/{metric_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMetricsRequest::getWorkspaceId, UpdateMetricsRequest::setWorkspaceId));
        builder.<String>withRequestField("metric_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMetricsRequest::getMetricId, UpdateMetricsRequest::setMetricId));
        builder.<CreateMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMetricRequestBody.class),
            f -> f.withMarshaller(UpdateMetricsRequest::getBody, UpdateMetricsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMetricsResponse::getXRequestId, UpdateMetricsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateModuleRequest, UpdateModuleResponse> updateModule = genForUpdateModule();

    private static HttpRequestDef<UpdateModuleRequest, UpdateModuleResponse> genForUpdateModule() {
        // basic
        HttpRequestDef.Builder<UpdateModuleRequest, UpdateModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateModuleRequest.class, UpdateModuleResponse.class)
                .withName("UpdateModule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/modules/{module_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleRequest::getWorkspaceId, UpdateModuleRequest::setWorkspaceId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleRequest::getModuleId, UpdateModuleRequest::setModuleId));
        builder.<ModuleUpdateRequestPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModuleUpdateRequestPojo.class),
            f -> f.withMarshaller(UpdateModuleRequest::getBody, UpdateModuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateModuleResponse::getXRequestId, UpdateModuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> updateNode = genForUpdateNode();

    private static HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> genForUpdateNode() {
        // basic
        HttpRequestDef.Builder<UpdateNodeRequest, UpdateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodeRequest.class, UpdateNodeResponse.class)
                .withName("UpdateNode")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeRequest::getWorkspaceId, UpdateNodeRequest::setWorkspaceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeRequest::getNodeId, UpdateNodeRequest::setNodeId));
        builder.<NodeExpansionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeExpansionInfo.class),
            f -> f.withMarshaller(UpdateNodeRequest::getBody, UpdateNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipeRequest, UpdatePipeResponse> updatePipe = genForUpdatePipe();

    private static HttpRequestDef<UpdatePipeRequest, UpdatePipeResponse> genForUpdatePipe() {
        // basic
        HttpRequestDef.Builder<UpdatePipeRequest, UpdatePipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePipeRequest.class, UpdatePipeResponse.class)
                .withName("UpdatePipe")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipeRequest::getWorkspaceId, UpdatePipeRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipeRequest::getPipeId, UpdatePipeRequest::setPipeId));
        builder.<UpdatePipeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePipeRequestBody.class),
            f -> f.withMarshaller(UpdatePipeRequest::getBody, UpdatePipeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePipeIndexRequest, UpdatePipeIndexResponse> updatePipeIndex =
        genForUpdatePipeIndex();

    private static HttpRequestDef<UpdatePipeIndexRequest, UpdatePipeIndexResponse> genForUpdatePipeIndex() {
        // basic
        HttpRequestDef.Builder<UpdatePipeIndexRequest, UpdatePipeIndexResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePipeIndexRequest.class, UpdatePipeIndexResponse.class)
                .withName("UpdatePipeIndex")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes/{pipe_id}/index")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipeIndexRequest::getWorkspaceId, UpdatePipeIndexRequest::setWorkspaceId));
        builder.<String>withRequestField("pipe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePipeIndexRequest::getPipeId, UpdatePipeIndexRequest::setPipeId));
        builder.<UpdateIndexRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIndexRequestBody.class),
            f -> f.withMarshaller(UpdatePipeIndexRequest::getBody, UpdatePipeIndexRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybook =
        genForUpdatePlaybook();

    private static HttpRequestDef<UpdatePlaybookRequest, UpdatePlaybookResponse> genForUpdatePlaybook() {
        // basic
        HttpRequestDef.Builder<UpdatePlaybookRequest, UpdatePlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePlaybookRequest.class, UpdatePlaybookResponse.class)
                .withName("UpdatePlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRequest::getWorkspaceId, UpdatePlaybookRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRequest::getPlaybookId, UpdatePlaybookRequest::setPlaybookId));
        builder.<ModifyPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyPlaybookInfo.class),
            f -> f.withMarshaller(UpdatePlaybookRequest::getBody, UpdatePlaybookRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookResponse::getXRequestId, UpdatePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookAction =
        genForUpdatePlaybookAction();

    private static HttpRequestDef<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> genForUpdatePlaybookAction() {
        // basic
        HttpRequestDef.Builder<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePlaybookActionRequest.class, UpdatePlaybookActionResponse.class)
            .withName("UpdatePlaybookAction")
            .withUri(
                "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/actions/{action_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getWorkspaceId,
                UpdatePlaybookActionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getVersionId,
                UpdatePlaybookActionRequest::setVersionId));
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getActionId, UpdatePlaybookActionRequest::setActionId));
        builder.<ModifyActionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyActionInfo.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getBody, UpdatePlaybookActionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookActionResponse::getXRequestId,
                UpdatePlaybookActionResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookActionResponse::getXAPIDeprecationInfo,
                UpdatePlaybookActionResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookActionResponse::getXAPIDeprecationDate,
                UpdatePlaybookActionResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRule =
        genForUpdatePlaybookRule();

    private static HttpRequestDef<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> genForUpdatePlaybookRule() {
        // basic
        HttpRequestDef.Builder<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePlaybookRuleRequest.class, UpdatePlaybookRuleResponse.class)
                .withName("UpdatePlaybookRule")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getWorkspaceId,
                UpdatePlaybookRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getVersionId, UpdatePlaybookRuleRequest::setVersionId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getRuleId, UpdatePlaybookRuleRequest::setRuleId));
        builder.<ModifyRuleInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyRuleInfo.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getBody, UpdatePlaybookRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookRuleResponse::getXRequestId,
                UpdatePlaybookRuleResponse::setXRequestId));
        builder.<String>withResponseField("X-API-Deprecation-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookRuleResponse::getXAPIDeprecationInfo,
                UpdatePlaybookRuleResponse::setXAPIDeprecationInfo));
        builder.<String>withResponseField("X-API-Deprecation-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookRuleResponse::getXAPIDeprecationDate,
                UpdatePlaybookRuleResponse::setXAPIDeprecationDate));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersion =
        genForUpdatePlaybookVersion();

    private static HttpRequestDef<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> genForUpdatePlaybookVersion() {
        // basic
        HttpRequestDef.Builder<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePlaybookVersionRequest.class, UpdatePlaybookVersionResponse.class)
            .withName("UpdatePlaybookVersion")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getWorkspaceId,
                UpdatePlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getVersionId,
                UpdatePlaybookVersionRequest::setVersionId));
        builder.<ModifyPlaybookVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyPlaybookVersionInfo.class),
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getBody, UpdatePlaybookVersionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookVersionResponse::getXRequestId,
                UpdatePlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecipientsEmailStatusRequest, UpdateRecipientsEmailStatusResponse> updateRecipientsEmailStatus =
        genForUpdateRecipientsEmailStatus();

    private static HttpRequestDef<UpdateRecipientsEmailStatusRequest, UpdateRecipientsEmailStatusResponse> genForUpdateRecipientsEmailStatus() {
        // basic
        HttpRequestDef.Builder<UpdateRecipientsEmailStatusRequest, UpdateRecipientsEmailStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRecipientsEmailStatusRequest.class,
                    UpdateRecipientsEmailStatusResponse.class)
                .withName("UpdateRecipientsEmailStatus")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/reports/emails")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecipientsEmailStatusRequest::getWorkspaceId,
                UpdateRecipientsEmailStatusRequest::setWorkspaceId));
        builder.<UpdateRecipientsStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRecipientsStatusRequestBody.class),
            f -> f.withMarshaller(UpdateRecipientsEmailStatusRequest::getBody,
                UpdateRecipientsEmailStatusRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRecipientsEmailStatusResponse::getBody,
                UpdateRecipientsEmailStatusResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRecipientsEmailStatusResponse::getXRequestId,
                UpdateRecipientsEmailStatusResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateReportRequest, UpdateReportResponse> updateReport = genForUpdateReport();

    private static HttpRequestDef<UpdateReportRequest, UpdateReportResponse> genForUpdateReport() {
        // basic
        HttpRequestDef.Builder<UpdateReportRequest, UpdateReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateReportRequest.class, UpdateReportResponse.class)
                .withName("UpdateReport")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/reports/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReportRequest::getWorkspaceId, UpdateReportRequest::setWorkspaceId));
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReportRequest::getReportId, UpdateReportRequest::setReportId));
        builder.<UpdateReportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReportRequestBody.class),
            f -> f.withMarshaller(UpdateReportRequest::getBody, UpdateReportRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateReportResponse::getBody, UpdateReportResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateReportResponse::getXRequestId, UpdateReportResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateSearchConditionRequest, UpdateSearchConditionResponse> updateSearchCondition =
        genForUpdateSearchCondition();

    private static HttpRequestDef<UpdateSearchConditionRequest, UpdateSearchConditionResponse> genForUpdateSearchCondition() {
        // basic
        HttpRequestDef.Builder<UpdateSearchConditionRequest, UpdateSearchConditionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSearchConditionRequest.class, UpdateSearchConditionResponse.class)
            .withName("UpdateSearchCondition")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/search/conditions/{condition_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSearchConditionRequest::getWorkspaceId,
                UpdateSearchConditionRequest::setWorkspaceId));
        builder.<String>withRequestField("condition_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSearchConditionRequest::getConditionId,
                UpdateSearchConditionRequest::setConditionId));
        builder.<UpdateSearchConditionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSearchConditionRequestBody.class),
            f -> f.withMarshaller(UpdateSearchConditionRequest::getBody, UpdateSearchConditionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubscriptionOrderRequest, UpdateSubscriptionOrderResponse> updateSubscriptionOrder =
        genForUpdateSubscriptionOrder();

    private static HttpRequestDef<UpdateSubscriptionOrderRequest, UpdateSubscriptionOrderResponse> genForUpdateSubscriptionOrder() {
        // basic
        HttpRequestDef.Builder<UpdateSubscriptionOrderRequest, UpdateSubscriptionOrderResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSubscriptionOrderRequest.class, UpdateSubscriptionOrderResponse.class)
            .withName("UpdateSubscriptionOrder")
            .withUri("/v1/{project_id}/subscriptions/orders")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionOrderRequest::getXLanguage,
                UpdateSubscriptionOrderRequest::setXLanguage));
        builder.<UpdateOrderInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOrderInfoReq.class),
            f -> f.withMarshaller(UpdateSubscriptionOrderRequest::getBody, UpdateSubscriptionOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTagValueRequest, UpdateTagValueResponse> updateTagValue =
        genForUpdateTagValue();

    private static HttpRequestDef<UpdateTagValueRequest, UpdateTagValueResponse> genForUpdateTagValue() {
        // basic
        HttpRequestDef.Builder<UpdateTagValueRequest, UpdateTagValueResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTagValueRequest.class, UpdateTagValueResponse.class)
                .withName("UpdateTagValue")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/{key}/tags/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTagValueRequest::getResourceType, UpdateTagValueRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTagValueRequest::getResourceId, UpdateTagValueRequest::setResourceId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTagValueRequest::getKey, UpdateTagValueRequest::setKey));
        builder.<UpdateTagValueRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTagValueRequestBody.class),
            f -> f.withMarshaller(UpdateTagValueRequest::getBody, UpdateTagValueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForUpdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForUpdateTask() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRequest, UpdateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskRequest.class, UpdateTaskResponse.class)
                .withName("UpdateTask")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getWorkspaceId, UpdateTaskRequest::setWorkspaceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, UpdateTaskRequest::setTaskId));
        builder.<ModifyTaskInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyTaskInfo.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, UpdateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcEndpointServiceRequest, UpdateVpcEndpointServiceResponse> updateVpcEndpointService =
        genForUpdateVpcEndpointService();

    private static HttpRequestDef<UpdateVpcEndpointServiceRequest, UpdateVpcEndpointServiceResponse> genForUpdateVpcEndpointService() {
        // basic
        HttpRequestDef.Builder<UpdateVpcEndpointServiceRequest, UpdateVpcEndpointServiceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdateVpcEndpointServiceRequest.class, UpdateVpcEndpointServiceResponse.class)
                .withName("UpdateVpcEndpointService")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/nodes/vpc-endpoint-services")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcEndpointServiceRequest::getWorkspaceId,
                UpdateVpcEndpointServiceRequest::setWorkspaceId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcEndpointServiceRequest::getVpcId,
                UpdateVpcEndpointServiceRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcEndpointServiceRequest::getSubnetId,
                UpdateVpcEndpointServiceRequest::setSubnetId));
        builder.<UpdateVpcEndpointServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcEndpointServiceRequestBody.class),
            f -> f.withMarshaller(UpdateVpcEndpointServiceRequest::getBody, UpdateVpcEndpointServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowInstanceRequest, UpdateWorkflowInstanceResponse> updateWorkflowInstance =
        genForUpdateWorkflowInstance();

    private static HttpRequestDef<UpdateWorkflowInstanceRequest, UpdateWorkflowInstanceResponse> genForUpdateWorkflowInstance() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowInstanceRequest, UpdateWorkflowInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWorkflowInstanceRequest.class, UpdateWorkflowInstanceResponse.class)
            .withName("UpdateWorkflowInstance")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowInstanceRequest::getWorkspaceId,
                UpdateWorkflowInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowInstanceRequest::getInstanceId,
                UpdateWorkflowInstanceRequest::setInstanceId));
        builder.<AopInstanceUpdateDataPojo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AopInstanceUpdateDataPojo.class),
            f -> f.withMarshaller(UpdateWorkflowInstanceRequest::getBody, UpdateWorkflowInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForUpdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForUpdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getWorkspaceId, UpdateWorkspaceRequest::setWorkspaceId));
        builder.<UpdateWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkspaceRequestBody.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, UpdateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAttachmentRequest, UploadAttachmentResponse> uploadAttachment =
        genForUploadAttachment();

    private static HttpRequestDef<UploadAttachmentRequest, UploadAttachmentResponse> genForUploadAttachment() {
        // basic
        HttpRequestDef.Builder<UploadAttachmentRequest, UploadAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadAttachmentRequest.class, UploadAttachmentResponse.class)
                .withName("UploadAttachment")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/attachment/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAttachmentRequest::getWorkspaceId, UploadAttachmentRequest::setWorkspaceId));
        builder.<UploadAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAttachmentRequestBody.class),
            f -> f.withMarshaller(UploadAttachmentRequest::getBody, UploadAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateAopWorkflowVersionRequest, ValidateAopWorkflowVersionResponse> validateAopWorkflowVersion =
        genForValidateAopWorkflowVersion();

    private static HttpRequestDef<ValidateAopWorkflowVersionRequest, ValidateAopWorkflowVersionResponse> genForValidateAopWorkflowVersion() {
        // basic
        HttpRequestDef.Builder<ValidateAopWorkflowVersionRequest, ValidateAopWorkflowVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ValidateAopWorkflowVersionRequest.class,
                    ValidateAopWorkflowVersionResponse.class)
                .withName("ValidateAopWorkflowVersion")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows/validation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateAopWorkflowVersionRequest::getWorkspaceId,
                ValidateAopWorkflowVersionRequest::setWorkspaceId));
        builder.<AopworkflowVersionValidateRes>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AopworkflowVersionValidateRes.class),
            f -> f.withMarshaller(ValidateAopWorkflowVersionRequest::getBody,
                ValidateAopWorkflowVersionRequest::setBody));

        // response

        return builder.build();
    }

}
