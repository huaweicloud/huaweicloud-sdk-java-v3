package com.huaweicloud.sdk.secmaster.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDatapanelObjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchCreateDatapanelObjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchSearchMetricHitsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchSearchMetricHitsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchTagResourcesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchTagResourcesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchUntagResourcesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchUntagResourcesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.BatchUpdateCatalogueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.BatchUpdateCatalogueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangePlaybookInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangePlaybookInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeResourceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ChangeResourceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CopyMappingRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CopyMappingResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CopyPlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CopyPlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CountResourceInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CountResourceInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleSimulationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAlertRuleSimulationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionApprovelRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionApprovelResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateAopWorkflowVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateBatchOrderAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateBatchOrderAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCatalogueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCatalogueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateClassifierRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateClassifierResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectConfigRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectConfigResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelGroupRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelGroupResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelOperationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelOperationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorChannelResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorFilesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorFilesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorParserRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateCollectorParserResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateComponentTemplateRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateComponentTemplateResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationApplicationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationApplicationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationDictionariesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConfigurationDictionariesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataclassTypeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataclassTypeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectRelationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectRelationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataobjectResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateIncidentRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.CreateMetricResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateModuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateModuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateNoteRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateNoteResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePipeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookApproveRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookApproveResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePreProcessRulesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreatePreProcessRulesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateReportRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateReportResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateResourceConfigRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateResourceConfigResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateRetryPolicyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateRetryPolicyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchAnalysisRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchAnalysisResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchConditionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSearchConditionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateServiceAgencyRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateServiceAgencyResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperDelegateAuthRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperDelegateAuthResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSubscriptionOrderRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateSubscriptionOrderResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkflowInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkflowInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteAlertRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataclassTypeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataobjectRelationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataobjectRelationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataobjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataobjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteIndicatorRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.DeleteNodeResponse;
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
import com.huaweicloud.sdk.secmaster.v1.model.DeleteReportRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteReportResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteSearchConditionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteSearchConditionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.DeleteShipperRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.EnableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v1.model.EnableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v1.model.EnableDataclassTypeRequest;
import com.huaweicloud.sdk.secmaster.v1.model.EnableDataclassTypeResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteLayoutRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteLayoutResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteReportActionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExecuteReportActionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAopworkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportAopworkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportCollectorParserRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportCollectorParserResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportDataobjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportDataobjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIndicatorsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportIndicatorsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportPlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportPlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportResourcesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportResourcesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ExportVulnerabilitiesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ExportVulnerabilitiesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.HandleShipperAuthorizationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.HandleShipperAuthorizationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAlertsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAlertsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAopworkflowRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportAopworkflowResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportCollectorParserRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportCollectorParserResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportDataobjectsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportDataobjectsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIndicatorsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportIndicatorsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportPlaybookRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportPlaybookResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportResourceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportResourceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ImportVulnerabilitiesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ImportVulnerabilitiesResponse;
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
import com.huaweicloud.sdk.secmaster.v1.model.ListMetricsRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListMetricsResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListModulesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListModulesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListNodesRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ListNodesResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ListNotesRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.PauseShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.PauseShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ResumeShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ResumeShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.RetryShipperAuthorizationRequest;
import com.huaweicloud.sdk.secmaster.v1.model.RetryShipperAuthorizationResponse;
import com.huaweicloud.sdk.secmaster.v1.model.RetryShipperRequest;
import com.huaweicloud.sdk.secmaster.v1.model.RetryShipperResponse;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRecordByPolicyIdRequest;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRecordByPolicyIdResponse;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRecordRequest;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRecordResponse;
import com.huaweicloud.sdk.secmaster.v1.model.SearchPolicyRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.ShowVulnerabilityRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowVulnerabilityResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ShowWorkspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ShowWorkspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateAlertRuleRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataobjectRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataobjectResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateIndicatorRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePipeIndexRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePipeIndexResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdatePipeRequest;
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
import com.huaweicloud.sdk.secmaster.v1.model.UpdateReportRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateReportResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSearchConditionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSearchConditionResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSubscriptionOrderRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateSubscriptionOrderResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTagValueRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTagValueResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTaskRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateTaskResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateVpcEndpointServiceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateVpcEndpointServiceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkflowInstanceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkflowInstanceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.secmaster.v1.model.UploadAttachmentRequest;
import com.huaweicloud.sdk.secmaster.v1.model.UploadAttachmentResponse;
import com.huaweicloud.sdk.secmaster.v1.model.ValidateAopWorkflowVersionRequest;
import com.huaweicloud.sdk.secmaster.v1.model.ValidateAopWorkflowVersionResponse;

import java.util.concurrent.CompletableFuture;

public class SecMasterAsyncClient {

    protected HcClient hcClient;

    public SecMasterAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SecMasterAsyncClient> newBuilder() {
        ClientBuilder<SecMasterAsyncClient> clientBuilder = new ClientBuilder<>(SecMasterAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量关联数据对象
     *
     * 批量关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDataobjectRelationsRequest 请求对象
     * @return CompletableFuture<BatchCreateDataobjectRelationsResponse>
     */
    public CompletableFuture<BatchCreateDataobjectRelationsResponse> batchCreateDataobjectRelationsAsync(
        BatchCreateDataobjectRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.batchCreateDataobjectRelations);
    }

    /**
     * 批量关联数据对象
     *
     * 批量关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDataobjectRelationsRequest 请求对象
     * @return AsyncInvoker<BatchCreateDataobjectRelationsRequest, BatchCreateDataobjectRelationsResponse>
     */
    public AsyncInvoker<BatchCreateDataobjectRelationsRequest, BatchCreateDataobjectRelationsResponse> batchCreateDataobjectRelationsAsyncInvoker(
        BatchCreateDataobjectRelationsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.batchCreateDataobjectRelations, hcClient);
    }

    /**
     * 批量创建数据对象
     *
     * 数据面批量创建数据类纳管的数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDatapanelObjectsRequest 请求对象
     * @return CompletableFuture<BatchCreateDatapanelObjectsResponse>
     */
    public CompletableFuture<BatchCreateDatapanelObjectsResponse> batchCreateDatapanelObjectsAsync(
        BatchCreateDatapanelObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.batchCreateDatapanelObjects);
    }

    /**
     * 批量创建数据对象
     *
     * 数据面批量创建数据类纳管的数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDatapanelObjectsRequest 请求对象
     * @return AsyncInvoker<BatchCreateDatapanelObjectsRequest, BatchCreateDatapanelObjectsResponse>
     */
    public AsyncInvoker<BatchCreateDatapanelObjectsRequest, BatchCreateDatapanelObjectsResponse> batchCreateDatapanelObjectsAsyncInvoker(
        BatchCreateDatapanelObjectsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.batchCreateDatapanelObjects, hcClient);
    }

    /**
     * 批量查询指标结果
     *
     * 批量查询指标结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSearchMetricHitsRequest 请求对象
     * @return CompletableFuture<BatchSearchMetricHitsResponse>
     */
    public CompletableFuture<BatchSearchMetricHitsResponse> batchSearchMetricHitsAsync(
        BatchSearchMetricHitsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.batchSearchMetricHits);
    }

    /**
     * 批量查询指标结果
     *
     * 批量查询指标结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSearchMetricHitsRequest 请求对象
     * @return AsyncInvoker<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse>
     */
    public AsyncInvoker<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse> batchSearchMetricHitsAsyncInvoker(
        BatchSearchMetricHitsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.batchSearchMetricHits, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 为指定实例批量添加标签
     * 标签管理服务需要使用该接口批量管理实例的标签。
     * 一个资源上最多有20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagResourcesRequest 请求对象
     * @return CompletableFuture<BatchTagResourcesResponse>
     */
    public CompletableFuture<BatchTagResourcesResponse> batchTagResourcesAsync(BatchTagResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.batchTagResources);
    }

    /**
     * 批量添加资源标签
     *
     * 为指定实例批量添加标签
     * 标签管理服务需要使用该接口批量管理实例的标签。
     * 一个资源上最多有20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagResourcesRequest 请求对象
     * @return AsyncInvoker<BatchTagResourcesRequest, BatchTagResourcesResponse>
     */
    public AsyncInvoker<BatchTagResourcesRequest, BatchTagResourcesResponse> batchTagResourcesAsyncInvoker(
        BatchTagResourcesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.batchTagResources, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签
     * 标签管理服务需要使用该接口批量管理实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUntagResourcesRequest 请求对象
     * @return CompletableFuture<BatchUntagResourcesResponse>
     */
    public CompletableFuture<BatchUntagResourcesResponse> batchUntagResourcesAsync(BatchUntagResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.batchUntagResources);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签
     * 标签管理服务需要使用该接口批量管理实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUntagResourcesRequest 请求对象
     * @return AsyncInvoker<BatchUntagResourcesRequest, BatchUntagResourcesResponse>
     */
    public AsyncInvoker<BatchUntagResourcesRequest, BatchUntagResourcesResponse> batchUntagResourcesAsyncInvoker(
        BatchUntagResourcesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.batchUntagResources, hcClient);
    }

    /**
     * 批量修改目录
     *
     * 批量修改自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCatalogueRequest 请求对象
     * @return CompletableFuture<BatchUpdateCatalogueResponse>
     */
    public CompletableFuture<BatchUpdateCatalogueResponse> batchUpdateCatalogueAsync(
        BatchUpdateCatalogueRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.batchUpdateCatalogue);
    }

    /**
     * 批量修改目录
     *
     * 批量修改自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCatalogueRequest 请求对象
     * @return AsyncInvoker<BatchUpdateCatalogueRequest, BatchUpdateCatalogueResponse>
     */
    public AsyncInvoker<BatchUpdateCatalogueRequest, BatchUpdateCatalogueResponse> batchUpdateCatalogueAsyncInvoker(
        BatchUpdateCatalogueRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.batchUpdateCatalogue, hcClient);
    }

    /**
     * 更新告警
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertRequest 请求对象
     * @return CompletableFuture<ChangeAlertResponse>
     */
    public CompletableFuture<ChangeAlertResponse> changeAlertAsync(ChangeAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changeAlert);
    }

    /**
     * 更新告警
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertRequest 请求对象
     * @return AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse>
     */
    public AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse> changeAlertAsyncInvoker(ChangeAlertRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.changeAlert, hcClient);
    }

    /**
     * 批量更新告警
     *
     * 批量更新告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertsRequest 请求对象
     * @return CompletableFuture<ChangeAlertsResponse>
     */
    public CompletableFuture<ChangeAlertsResponse> changeAlertsAsync(ChangeAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changeAlerts);
    }

    /**
     * 批量更新告警
     *
     * 批量更新告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertsRequest 请求对象
     * @return AsyncInvoker<ChangeAlertsRequest, ChangeAlertsResponse>
     */
    public AsyncInvoker<ChangeAlertsRequest, ChangeAlertsResponse> changeAlertsAsyncInvoker(
        ChangeAlertsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.changeAlerts, hcClient);
    }

    /**
     * 更新事件
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentRequest 请求对象
     * @return CompletableFuture<ChangeIncidentResponse>
     */
    public CompletableFuture<ChangeIncidentResponse> changeIncidentAsync(ChangeIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changeIncident);
    }

    /**
     * 更新事件
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentRequest 请求对象
     * @return AsyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>
     */
    public AsyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse> changeIncidentAsyncInvoker(
        ChangeIncidentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.changeIncident, hcClient);
    }

    /**
     * 批量更新事件
     *
     * 更新事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentsRequest 请求对象
     * @return CompletableFuture<ChangeIncidentsResponse>
     */
    public CompletableFuture<ChangeIncidentsResponse> changeIncidentsAsync(ChangeIncidentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changeIncidents);
    }

    /**
     * 批量更新事件
     *
     * 更新事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentsRequest 请求对象
     * @return AsyncInvoker<ChangeIncidentsRequest, ChangeIncidentsResponse>
     */
    public AsyncInvoker<ChangeIncidentsRequest, ChangeIncidentsResponse> changeIncidentsAsyncInvoker(
        ChangeIncidentsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.changeIncidents, hcClient);
    }

    /**
     * 操作剧本实例
     *
     * 操作剧本实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePlaybookInstanceRequest 请求对象
     * @return CompletableFuture<ChangePlaybookInstanceResponse>
     */
    public CompletableFuture<ChangePlaybookInstanceResponse> changePlaybookInstanceAsync(
        ChangePlaybookInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changePlaybookInstance);
    }

    /**
     * 操作剧本实例
     *
     * 操作剧本实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePlaybookInstanceRequest 请求对象
     * @return AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>
     */
    public AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstanceAsyncInvoker(
        ChangePlaybookInstanceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.changePlaybookInstance, hcClient);
    }

    /**
     * 更新资产信息
     *
     * 编辑资产，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceRequest 请求对象
     * @return CompletableFuture<ChangeResourceResponse>
     */
    public CompletableFuture<ChangeResourceResponse> changeResourceAsync(ChangeResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changeResource);
    }

    /**
     * 更新资产信息
     *
     * 编辑资产，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceRequest 请求对象
     * @return AsyncInvoker<ChangeResourceRequest, ChangeResourceResponse>
     */
    public AsyncInvoker<ChangeResourceRequest, ChangeResourceResponse> changeResourceAsyncInvoker(
        ChangeResourceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.changeResource, hcClient);
    }

    /**
     * 复制映射
     *
     * 复制映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyMappingRequest 请求对象
     * @return CompletableFuture<CopyMappingResponse>
     */
    public CompletableFuture<CopyMappingResponse> copyMappingAsync(CopyMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.copyMapping);
    }

    /**
     * 复制映射
     *
     * 复制映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyMappingRequest 请求对象
     * @return AsyncInvoker<CopyMappingRequest, CopyMappingResponse>
     */
    public AsyncInvoker<CopyMappingRequest, CopyMappingResponse> copyMappingAsyncInvoker(CopyMappingRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.copyMapping, hcClient);
    }

    /**
     * 克隆剧本及版本
     *
     * 克隆剧本及版本（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPlaybookVersionRequest 请求对象
     * @return CompletableFuture<CopyPlaybookVersionResponse>
     */
    public CompletableFuture<CopyPlaybookVersionResponse> copyPlaybookVersionAsync(CopyPlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.copyPlaybookVersion);
    }

    /**
     * 克隆剧本及版本
     *
     * 克隆剧本及版本（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPlaybookVersionRequest 请求对象
     * @return AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>
     */
    public AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersionAsyncInvoker(
        CopyPlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.copyPlaybookVersion, hcClient);
    }

    /**
     * 查询资源实例数量
     *
     * 使用标签过滤实例，查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceRequest 请求对象
     * @return CompletableFuture<CountResourceInstanceResponse>
     */
    public CompletableFuture<CountResourceInstanceResponse> countResourceInstanceAsync(
        CountResourceInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.countResourceInstance);
    }

    /**
     * 查询资源实例数量
     *
     * 使用标签过滤实例，查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceRequest 请求对象
     * @return AsyncInvoker<CountResourceInstanceRequest, CountResourceInstanceResponse>
     */
    public AsyncInvoker<CountResourceInstanceRequest, CountResourceInstanceResponse> countResourceInstanceAsyncInvoker(
        CountResourceInstanceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.countResourceInstance, hcClient);
    }

    /**
     * 创建告警
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRequest 请求对象
     * @return CompletableFuture<CreateAlertResponse>
     */
    public CompletableFuture<CreateAlertResponse> createAlertAsync(CreateAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAlert);
    }

    /**
     * 创建告警
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRequest 请求对象
     * @return AsyncInvoker<CreateAlertRequest, CreateAlertResponse>
     */
    public AsyncInvoker<CreateAlertRequest, CreateAlertResponse> createAlertAsyncInvoker(CreateAlertRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAlert, hcClient);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return CompletableFuture<CreateAlertRuleResponse>
     */
    public CompletableFuture<CreateAlertRuleResponse> createAlertRuleAsync(CreateAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAlertRule);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>
     */
    public AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRuleAsyncInvoker(
        CreateAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAlertRule, hcClient);
    }

    /**
     * 模拟告警规则
     *
     * 模拟告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleSimulationRequest 请求对象
     * @return CompletableFuture<CreateAlertRuleSimulationResponse>
     */
    public CompletableFuture<CreateAlertRuleSimulationResponse> createAlertRuleSimulationAsync(
        CreateAlertRuleSimulationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAlertRuleSimulation);
    }

    /**
     * 模拟告警规则
     *
     * 模拟告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleSimulationRequest 请求对象
     * @return AsyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse>
     */
    public AsyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulationAsyncInvoker(
        CreateAlertRuleSimulationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAlertRuleSimulation, hcClient);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowRequest 请求对象
     * @return CompletableFuture<CreateAopWorkflowResponse>
     */
    public CompletableFuture<CreateAopWorkflowResponse> createAopWorkflowAsync(CreateAopWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAopWorkflow);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowRequest 请求对象
     * @return AsyncInvoker<CreateAopWorkflowRequest, CreateAopWorkflowResponse>
     */
    public AsyncInvoker<CreateAopWorkflowRequest, CreateAopWorkflowResponse> createAopWorkflowAsyncInvoker(
        CreateAopWorkflowRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAopWorkflow, hcClient);
    }

    /**
     * 创建流程版本
     *
     * 创建流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowVersionRequest 请求对象
     * @return CompletableFuture<CreateAopWorkflowVersionResponse>
     */
    public CompletableFuture<CreateAopWorkflowVersionResponse> createAopWorkflowVersionAsync(
        CreateAopWorkflowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAopWorkflowVersion);
    }

    /**
     * 创建流程版本
     *
     * 创建流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowVersionRequest 请求对象
     * @return AsyncInvoker<CreateAopWorkflowVersionRequest, CreateAopWorkflowVersionResponse>
     */
    public AsyncInvoker<CreateAopWorkflowVersionRequest, CreateAopWorkflowVersionResponse> createAopWorkflowVersionAsyncInvoker(
        CreateAopWorkflowVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAopWorkflowVersion, hcClient);
    }

    /**
     * 审核流程版本的发布
     *
     * 审核流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowVersionApprovelRequest 请求对象
     * @return CompletableFuture<CreateAopWorkflowVersionApprovelResponse>
     */
    public CompletableFuture<CreateAopWorkflowVersionApprovelResponse> createAopWorkflowVersionApprovelAsync(
        CreateAopWorkflowVersionApprovelRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAopWorkflowVersionApprovel);
    }

    /**
     * 审核流程版本的发布
     *
     * 审核流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowVersionApprovelRequest 请求对象
     * @return AsyncInvoker<CreateAopWorkflowVersionApprovelRequest, CreateAopWorkflowVersionApprovelResponse>
     */
    public AsyncInvoker<CreateAopWorkflowVersionApprovelRequest, CreateAopWorkflowVersionApprovelResponse> createAopWorkflowVersionApprovelAsyncInvoker(
        CreateAopWorkflowVersionApprovelRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAopWorkflowVersionApprovel, hcClient);
    }

    /**
     * 告警转事件
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchOrderAlertsRequest 请求对象
     * @return CompletableFuture<CreateBatchOrderAlertsResponse>
     */
    public CompletableFuture<CreateBatchOrderAlertsResponse> createBatchOrderAlertsAsync(
        CreateBatchOrderAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createBatchOrderAlerts);
    }

    /**
     * 告警转事件
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchOrderAlertsRequest 请求对象
     * @return AsyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse>
     */
    public AsyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> createBatchOrderAlertsAsyncInvoker(
        CreateBatchOrderAlertsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createBatchOrderAlerts, hcClient);
    }

    /**
     * 创建自定义目录
     *
     * 新增自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCatalogueRequest 请求对象
     * @return CompletableFuture<CreateCatalogueResponse>
     */
    public CompletableFuture<CreateCatalogueResponse> createCatalogueAsync(CreateCatalogueRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCatalogue);
    }

    /**
     * 创建自定义目录
     *
     * 新增自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCatalogueRequest 请求对象
     * @return AsyncInvoker<CreateCatalogueRequest, CreateCatalogueResponse>
     */
    public AsyncInvoker<CreateCatalogueRequest, CreateCatalogueResponse> createCatalogueAsyncInvoker(
        CreateCatalogueRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCatalogue, hcClient);
    }

    /**
     * 新增分类
     *
     * 新增分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClassifierRequest 请求对象
     * @return CompletableFuture<CreateClassifierResponse>
     */
    public CompletableFuture<CreateClassifierResponse> createClassifierAsync(CreateClassifierRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createClassifier);
    }

    /**
     * 新增分类
     *
     * 新增分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClassifierRequest 请求对象
     * @return AsyncInvoker<CreateClassifierRequest, CreateClassifierResponse>
     */
    public AsyncInvoker<CreateClassifierRequest, CreateClassifierResponse> createClassifierAsyncInvoker(
        CreateClassifierRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createClassifier, hcClient);
    }

    /**
     * 保存云服务采集配置
     *
     * 保存云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectConfigRequest 请求对象
     * @return CompletableFuture<CreateCollectConfigResponse>
     */
    public CompletableFuture<CreateCollectConfigResponse> createCollectConfigAsync(CreateCollectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCollectConfig);
    }

    /**
     * 保存云服务采集配置
     *
     * 保存云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectConfigRequest 请求对象
     * @return AsyncInvoker<CreateCollectConfigRequest, CreateCollectConfigResponse>
     */
    public AsyncInvoker<CreateCollectConfigRequest, CreateCollectConfigResponse> createCollectConfigAsyncInvoker(
        CreateCollectConfigRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCollectConfig, hcClient);
    }

    /**
     * 创建采集通道
     *
     * 创建采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelRequest 请求对象
     * @return CompletableFuture<CreateCollectorChannelResponse>
     */
    public CompletableFuture<CreateCollectorChannelResponse> createCollectorChannelAsync(
        CreateCollectorChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCollectorChannel);
    }

    /**
     * 创建采集通道
     *
     * 创建采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelRequest 请求对象
     * @return AsyncInvoker<CreateCollectorChannelRequest, CreateCollectorChannelResponse>
     */
    public AsyncInvoker<CreateCollectorChannelRequest, CreateCollectorChannelResponse> createCollectorChannelAsyncInvoker(
        CreateCollectorChannelRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCollectorChannel, hcClient);
    }

    /**
     * 创建采集通道分组
     *
     * 创建采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelGroupRequest 请求对象
     * @return CompletableFuture<CreateCollectorChannelGroupResponse>
     */
    public CompletableFuture<CreateCollectorChannelGroupResponse> createCollectorChannelGroupAsync(
        CreateCollectorChannelGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCollectorChannelGroup);
    }

    /**
     * 创建采集通道分组
     *
     * 创建采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelGroupRequest 请求对象
     * @return AsyncInvoker<CreateCollectorChannelGroupRequest, CreateCollectorChannelGroupResponse>
     */
    public AsyncInvoker<CreateCollectorChannelGroupRequest, CreateCollectorChannelGroupResponse> createCollectorChannelGroupAsyncInvoker(
        CreateCollectorChannelGroupRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCollectorChannelGroup, hcClient);
    }

    /**
     * 执行采集通道操作
     *
     * 执行采集通道操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelOperationRequest 请求对象
     * @return CompletableFuture<CreateCollectorChannelOperationResponse>
     */
    public CompletableFuture<CreateCollectorChannelOperationResponse> createCollectorChannelOperationAsync(
        CreateCollectorChannelOperationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCollectorChannelOperation);
    }

    /**
     * 执行采集通道操作
     *
     * 执行采集通道操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelOperationRequest 请求对象
     * @return AsyncInvoker<CreateCollectorChannelOperationRequest, CreateCollectorChannelOperationResponse>
     */
    public AsyncInvoker<CreateCollectorChannelOperationRequest, CreateCollectorChannelOperationResponse> createCollectorChannelOperationAsyncInvoker(
        CreateCollectorChannelOperationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCollectorChannelOperation, hcClient);
    }

    /**
     * 创建采集连接
     *
     * 创建采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorConnectionRequest 请求对象
     * @return CompletableFuture<CreateCollectorConnectionResponse>
     */
    public CompletableFuture<CreateCollectorConnectionResponse> createCollectorConnectionAsync(
        CreateCollectorConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCollectorConnection);
    }

    /**
     * 创建采集连接
     *
     * 创建采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorConnectionRequest 请求对象
     * @return AsyncInvoker<CreateCollectorConnectionRequest, CreateCollectorConnectionResponse>
     */
    public AsyncInvoker<CreateCollectorConnectionRequest, CreateCollectorConnectionResponse> createCollectorConnectionAsyncInvoker(
        CreateCollectorConnectionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCollectorConnection, hcClient);
    }

    /**
     * 安装采集通道文件
     *
     * 安装采集通道文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorFilesRequest 请求对象
     * @return CompletableFuture<CreateCollectorFilesResponse>
     */
    public CompletableFuture<CreateCollectorFilesResponse> createCollectorFilesAsync(
        CreateCollectorFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCollectorFiles);
    }

    /**
     * 安装采集通道文件
     *
     * 安装采集通道文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorFilesRequest 请求对象
     * @return AsyncInvoker<CreateCollectorFilesRequest, CreateCollectorFilesResponse>
     */
    public AsyncInvoker<CreateCollectorFilesRequest, CreateCollectorFilesResponse> createCollectorFilesAsyncInvoker(
        CreateCollectorFilesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCollectorFiles, hcClient);
    }

    /**
     * 创建采集解析器
     *
     * 创建采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorParserRequest 请求对象
     * @return CompletableFuture<CreateCollectorParserResponse>
     */
    public CompletableFuture<CreateCollectorParserResponse> createCollectorParserAsync(
        CreateCollectorParserRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCollectorParser);
    }

    /**
     * 创建采集解析器
     *
     * 创建采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorParserRequest 请求对象
     * @return AsyncInvoker<CreateCollectorParserRequest, CreateCollectorParserResponse>
     */
    public AsyncInvoker<CreateCollectorParserRequest, CreateCollectorParserResponse> createCollectorParserAsyncInvoker(
        CreateCollectorParserRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCollectorParser, hcClient);
    }

    /**
     * 创建插件配置模板
     *
     * 创建在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentTemplateRequest 请求对象
     * @return CompletableFuture<CreateComponentTemplateResponse>
     */
    public CompletableFuture<CreateComponentTemplateResponse> createComponentTemplateAsync(
        CreateComponentTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createComponentTemplate);
    }

    /**
     * 创建插件配置模板
     *
     * 创建在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentTemplateRequest 请求对象
     * @return AsyncInvoker<CreateComponentTemplateRequest, CreateComponentTemplateResponse>
     */
    public AsyncInvoker<CreateComponentTemplateRequest, CreateComponentTemplateResponse> createComponentTemplateAsyncInvoker(
        CreateComponentTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createComponentTemplate, hcClient);
    }

    /**
     * 创建配置应用
     *
     * 创建配置应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationApplicationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationApplicationResponse>
     */
    public CompletableFuture<CreateConfigurationApplicationResponse> createConfigurationApplicationAsync(
        CreateConfigurationApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createConfigurationApplication);
    }

    /**
     * 创建配置应用
     *
     * 创建配置应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationApplicationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationApplicationRequest, CreateConfigurationApplicationResponse>
     */
    public AsyncInvoker<CreateConfigurationApplicationRequest, CreateConfigurationApplicationResponse> createConfigurationApplicationAsyncInvoker(
        CreateConfigurationApplicationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createConfigurationApplication, hcClient);
    }

    /**
     * 创建字典
     *
     * 创建字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationDictionariesRequest 请求对象
     * @return CompletableFuture<CreateConfigurationDictionariesResponse>
     */
    public CompletableFuture<CreateConfigurationDictionariesResponse> createConfigurationDictionariesAsync(
        CreateConfigurationDictionariesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createConfigurationDictionaries);
    }

    /**
     * 创建字典
     *
     * 创建字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationDictionariesRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationDictionariesRequest, CreateConfigurationDictionariesResponse>
     */
    public AsyncInvoker<CreateConfigurationDictionariesRequest, CreateConfigurationDictionariesResponse> createConfigurationDictionariesAsyncInvoker(
        CreateConfigurationDictionariesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createConfigurationDictionaries, hcClient);
    }

    /**
     * 新建操作连接
     *
     * 新建操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createConnection);
    }

    /**
     * 新建操作连接
     *
     * 新建操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionAsyncInvoker(
        CreateConnectionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createConnection, hcClient);
    }

    /**
     * 数据类类型新增
     *
     * 新增数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataclassTypeRequest 请求对象
     * @return CompletableFuture<CreateDataclassTypeResponse>
     */
    public CompletableFuture<CreateDataclassTypeResponse> createDataclassTypeAsync(CreateDataclassTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createDataclassType);
    }

    /**
     * 数据类类型新增
     *
     * 新增数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataclassTypeRequest 请求对象
     * @return AsyncInvoker<CreateDataclassTypeRequest, CreateDataclassTypeResponse>
     */
    public AsyncInvoker<CreateDataclassTypeRequest, CreateDataclassTypeResponse> createDataclassTypeAsyncInvoker(
        CreateDataclassTypeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createDataclassType, hcClient);
    }

    /**
     * 创建数据对象
     *
     * 创建数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRequest 请求对象
     * @return CompletableFuture<CreateDataobjectResponse>
     */
    public CompletableFuture<CreateDataobjectResponse> createDataobjectAsync(CreateDataobjectRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createDataobject);
    }

    /**
     * 创建数据对象
     *
     * 创建数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRequest 请求对象
     * @return AsyncInvoker<CreateDataobjectRequest, CreateDataobjectResponse>
     */
    public AsyncInvoker<CreateDataobjectRequest, CreateDataobjectResponse> createDataobjectAsyncInvoker(
        CreateDataobjectRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createDataobject, hcClient);
    }

    /**
     * 关联数据对象
     *
     * 关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRelationRequest 请求对象
     * @return CompletableFuture<CreateDataobjectRelationResponse>
     */
    public CompletableFuture<CreateDataobjectRelationResponse> createDataobjectRelationAsync(
        CreateDataobjectRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createDataobjectRelation);
    }

    /**
     * 关联数据对象
     *
     * 关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRelationRequest 请求对象
     * @return AsyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse>
     */
    public AsyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> createDataobjectRelationAsyncInvoker(
        CreateDataobjectRelationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createDataobjectRelation, hcClient);
    }

    /**
     * 创建数据空间
     *
     * 创建数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataspaceRequest 请求对象
     * @return CompletableFuture<CreateDataspaceResponse>
     */
    public CompletableFuture<CreateDataspaceResponse> createDataspaceAsync(CreateDataspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createDataspace);
    }

    /**
     * 创建数据空间
     *
     * 创建数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataspaceRequest 请求对象
     * @return AsyncInvoker<CreateDataspaceRequest, CreateDataspaceResponse>
     */
    public AsyncInvoker<CreateDataspaceRequest, CreateDataspaceResponse> createDataspaceAsyncInvoker(
        CreateDataspaceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createDataspace, hcClient);
    }

    /**
     * 创建事件
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIncidentRequest 请求对象
     * @return CompletableFuture<CreateIncidentResponse>
     */
    public CompletableFuture<CreateIncidentResponse> createIncidentAsync(CreateIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createIncident);
    }

    /**
     * 创建事件
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIncidentRequest 请求对象
     * @return AsyncInvoker<CreateIncidentRequest, CreateIncidentResponse>
     */
    public AsyncInvoker<CreateIncidentRequest, CreateIncidentResponse> createIncidentAsyncInvoker(
        CreateIncidentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createIncident, hcClient);
    }

    /**
     * 创建威胁情报
     *
     * 创建威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndicatorRequest 请求对象
     * @return CompletableFuture<CreateIndicatorResponse>
     */
    public CompletableFuture<CreateIndicatorResponse> createIndicatorAsync(CreateIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createIndicator);
    }

    /**
     * 创建威胁情报
     *
     * 创建威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndicatorRequest 请求对象
     * @return AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>
     */
    public AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse> createIndicatorAsyncInvoker(
        CreateIndicatorRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createIndicator, hcClient);
    }

    /**
     * 创建布局
     *
     * 创建布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutRequest 请求对象
     * @return CompletableFuture<CreateLayoutResponse>
     */
    public CompletableFuture<CreateLayoutResponse> createLayoutAsync(CreateLayoutRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createLayout);
    }

    /**
     * 创建布局
     *
     * 创建布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutRequest 请求对象
     * @return AsyncInvoker<CreateLayoutRequest, CreateLayoutResponse>
     */
    public AsyncInvoker<CreateLayoutRequest, CreateLayoutResponse> createLayoutAsyncInvoker(
        CreateLayoutRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createLayout, hcClient);
    }

    /**
     * 新建布局页面
     *
     * 创建页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutWizardRequest 请求对象
     * @return CompletableFuture<CreateLayoutWizardResponse>
     */
    public CompletableFuture<CreateLayoutWizardResponse> createLayoutWizardAsync(CreateLayoutWizardRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createLayoutWizard);
    }

    /**
     * 新建布局页面
     *
     * 创建页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutWizardRequest 请求对象
     * @return AsyncInvoker<CreateLayoutWizardRequest, CreateLayoutWizardResponse>
     */
    public AsyncInvoker<CreateLayoutWizardRequest, CreateLayoutWizardResponse> createLayoutWizardAsyncInvoker(
        CreateLayoutWizardRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createLayoutWizard, hcClient);
    }

    /**
     * 新增映射
     *
     * 新增映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMapperRequest 请求对象
     * @return CompletableFuture<CreateMapperResponse>
     */
    public CompletableFuture<CreateMapperResponse> createMapperAsync(CreateMapperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createMapper);
    }

    /**
     * 新增映射
     *
     * 新增映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMapperRequest 请求对象
     * @return AsyncInvoker<CreateMapperRequest, CreateMapperResponse>
     */
    public AsyncInvoker<CreateMapperRequest, CreateMapperResponse> createMapperAsyncInvoker(
        CreateMapperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createMapper, hcClient);
    }

    /**
     * 创建指标
     *
     * 创建指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetricRequest 请求对象
     * @return CompletableFuture<CreateMetricResponse>
     */
    public CompletableFuture<CreateMetricResponse> createMetricAsync(CreateMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createMetric);
    }

    /**
     * 创建指标
     *
     * 创建指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetricRequest 请求对象
     * @return AsyncInvoker<CreateMetricRequest, CreateMetricResponse>
     */
    public AsyncInvoker<CreateMetricRequest, CreateMetricResponse> createMetricAsyncInvoker(
        CreateMetricRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createMetric, hcClient);
    }

    /**
     * 新建模块
     *
     * 创建模块.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModuleRequest 请求对象
     * @return CompletableFuture<CreateModuleResponse>
     */
    public CompletableFuture<CreateModuleResponse> createModuleAsync(CreateModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createModule);
    }

    /**
     * 新建模块
     *
     * 创建模块.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModuleRequest 请求对象
     * @return AsyncInvoker<CreateModuleRequest, CreateModuleResponse>
     */
    public AsyncInvoker<CreateModuleRequest, CreateModuleResponse> createModuleAsyncInvoker(
        CreateModuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createModule, hcClient);
    }

    /**
     * 创建评论
     *
     * 创建评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNoteRequest 请求对象
     * @return CompletableFuture<CreateNoteResponse>
     */
    public CompletableFuture<CreateNoteResponse> createNoteAsync(CreateNoteRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createNote);
    }

    /**
     * 创建评论
     *
     * 创建评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNoteRequest 请求对象
     * @return AsyncInvoker<CreateNoteRequest, CreateNoteResponse>
     */
    public AsyncInvoker<CreateNoteRequest, CreateNoteResponse> createNoteAsyncInvoker(CreateNoteRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createNote, hcClient);
    }

    /**
     * 创建数据管道
     *
     * 创建数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeRequest 请求对象
     * @return CompletableFuture<CreatePipeResponse>
     */
    public CompletableFuture<CreatePipeResponse> createPipeAsync(CreatePipeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPipe);
    }

    /**
     * 创建数据管道
     *
     * 创建数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeRequest 请求对象
     * @return AsyncInvoker<CreatePipeRequest, CreatePipeResponse>
     */
    public AsyncInvoker<CreatePipeRequest, CreatePipeResponse> createPipeAsyncInvoker(CreatePipeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPipe, hcClient);
    }

    /**
     * 开启实时消费
     *
     * 开启实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeConsumptionRequest 请求对象
     * @return CompletableFuture<CreatePipeConsumptionResponse>
     */
    public CompletableFuture<CreatePipeConsumptionResponse> createPipeConsumptionAsync(
        CreatePipeConsumptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPipeConsumption);
    }

    /**
     * 开启实时消费
     *
     * 开启实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeConsumptionRequest 请求对象
     * @return AsyncInvoker<CreatePipeConsumptionRequest, CreatePipeConsumptionResponse>
     */
    public AsyncInvoker<CreatePipeConsumptionRequest, CreatePipeConsumptionResponse> createPipeConsumptionAsyncInvoker(
        CreatePipeConsumptionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPipeConsumption, hcClient);
    }

    /**
     * 创建剧本
     *
     * 创建剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRequest 请求对象
     * @return CompletableFuture<CreatePlaybookResponse>
     */
    public CompletableFuture<CreatePlaybookResponse> createPlaybookAsync(CreatePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybook);
    }

    /**
     * 创建剧本
     *
     * 创建剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>
     */
    public AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybookAsyncInvoker(
        CreatePlaybookRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPlaybook, hcClient);
    }

    /**
     * 创建剧本动作
     *
     * 创建剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookActionRequest 请求对象
     * @return CompletableFuture<CreatePlaybookActionResponse>
     */
    public CompletableFuture<CreatePlaybookActionResponse> createPlaybookActionAsync(
        CreatePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybookAction);
    }

    /**
     * 创建剧本动作
     *
     * 创建剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookActionRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>
     */
    public AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookActionAsyncInvoker(
        CreatePlaybookActionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPlaybookAction, hcClient);
    }

    /**
     * 审核剧本
     *
     * 审核剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookApproveRequest 请求对象
     * @return CompletableFuture<CreatePlaybookApproveResponse>
     */
    public CompletableFuture<CreatePlaybookApproveResponse> createPlaybookApproveAsync(
        CreatePlaybookApproveRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybookApprove);
    }

    /**
     * 审核剧本
     *
     * 审核剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookApproveRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>
     */
    public AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApproveAsyncInvoker(
        CreatePlaybookApproveRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPlaybookApprove, hcClient);
    }

    /**
     * 创建剧本规则
     *
     * 创建剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRuleRequest 请求对象
     * @return CompletableFuture<CreatePlaybookRuleResponse>
     */
    public CompletableFuture<CreatePlaybookRuleResponse> createPlaybookRuleAsync(CreatePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybookRule);
    }

    /**
     * 创建剧本规则
     *
     * 创建剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>
     */
    public AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRuleAsyncInvoker(
        CreatePlaybookRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPlaybookRule, hcClient);
    }

    /**
     * 创建剧本版本
     *
     * 创建剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookVersionRequest 请求对象
     * @return CompletableFuture<CreatePlaybookVersionResponse>
     */
    public CompletableFuture<CreatePlaybookVersionResponse> createPlaybookVersionAsync(
        CreatePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybookVersion);
    }

    /**
     * 创建剧本版本
     *
     * 创建剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>
     */
    public AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersionAsyncInvoker(
        CreatePlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPlaybookVersion, hcClient);
    }

    /**
     * 创建预处理规则
     *
     * 创建预处理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreProcessRulesRequest 请求对象
     * @return CompletableFuture<CreatePreProcessRulesResponse>
     */
    public CompletableFuture<CreatePreProcessRulesResponse> createPreProcessRulesAsync(
        CreatePreProcessRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPreProcessRules);
    }

    /**
     * 创建预处理规则
     *
     * 创建预处理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreProcessRulesRequest 请求对象
     * @return AsyncInvoker<CreatePreProcessRulesRequest, CreatePreProcessRulesResponse>
     */
    public AsyncInvoker<CreatePreProcessRulesRequest, CreatePreProcessRulesResponse> createPreProcessRulesAsyncInvoker(
        CreatePreProcessRulesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPreProcessRules, hcClient);
    }

    /**
     * 创建安全报告
     *
     * 创建安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return CompletableFuture<CreateReportResponse>
     */
    public CompletableFuture<CreateReportResponse> createReportAsync(CreateReportRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createReport);
    }

    /**
     * 创建安全报告
     *
     * 创建安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return AsyncInvoker<CreateReportRequest, CreateReportResponse>
     */
    public AsyncInvoker<CreateReportRequest, CreateReportResponse> createReportAsyncInvoker(
        CreateReportRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createReport, hcClient);
    }

    /**
     * 创建云日志资源
     *
     * 创建云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceConfigRequest 请求对象
     * @return CompletableFuture<CreateResourceConfigResponse>
     */
    public CompletableFuture<CreateResourceConfigResponse> createResourceConfigAsync(
        CreateResourceConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createResourceConfig);
    }

    /**
     * 创建云日志资源
     *
     * 创建云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceConfigRequest 请求对象
     * @return AsyncInvoker<CreateResourceConfigRequest, CreateResourceConfigResponse>
     */
    public AsyncInvoker<CreateResourceConfigRequest, CreateResourceConfigResponse> createResourceConfigAsyncInvoker(
        CreateResourceConfigRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createResourceConfig, hcClient);
    }

    /**
     * 创建重试应急策略
     *
     * 创建重试应急策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetryPolicyRequest 请求对象
     * @return CompletableFuture<CreateRetryPolicyResponse>
     */
    public CompletableFuture<CreateRetryPolicyResponse> createRetryPolicyAsync(CreateRetryPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createRetryPolicy);
    }

    /**
     * 创建重试应急策略
     *
     * 创建重试应急策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetryPolicyRequest 请求对象
     * @return AsyncInvoker<CreateRetryPolicyRequest, CreateRetryPolicyResponse>
     */
    public AsyncInvoker<CreateRetryPolicyRequest, CreateRetryPolicyResponse> createRetryPolicyAsyncInvoker(
        CreateRetryPolicyRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createRetryPolicy, hcClient);
    }

    /**
     * 执行分析
     *
     * 执行分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchAnalysisRequest 请求对象
     * @return CompletableFuture<CreateSearchAnalysisResponse>
     */
    public CompletableFuture<CreateSearchAnalysisResponse> createSearchAnalysisAsync(
        CreateSearchAnalysisRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createSearchAnalysis);
    }

    /**
     * 执行分析
     *
     * 执行分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchAnalysisRequest 请求对象
     * @return AsyncInvoker<CreateSearchAnalysisRequest, CreateSearchAnalysisResponse>
     */
    public AsyncInvoker<CreateSearchAnalysisRequest, CreateSearchAnalysisResponse> createSearchAnalysisAsyncInvoker(
        CreateSearchAnalysisRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createSearchAnalysis, hcClient);
    }

    /**
     * 创建检索条件
     *
     * 创建检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchConditionRequest 请求对象
     * @return CompletableFuture<CreateSearchConditionResponse>
     */
    public CompletableFuture<CreateSearchConditionResponse> createSearchConditionAsync(
        CreateSearchConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createSearchCondition);
    }

    /**
     * 创建检索条件
     *
     * 创建检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchConditionRequest 请求对象
     * @return AsyncInvoker<CreateSearchConditionRequest, CreateSearchConditionResponse>
     */
    public AsyncInvoker<CreateSearchConditionRequest, CreateSearchConditionResponse> createSearchConditionAsyncInvoker(
        CreateSearchConditionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createSearchCondition, hcClient);
    }

    /**
     * 创建委托并授权
     *
     * 根据body体中的角色和作用范围，创建委托，并将策略赋予给委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceAgencyRequest 请求对象
     * @return CompletableFuture<CreateServiceAgencyResponse>
     */
    public CompletableFuture<CreateServiceAgencyResponse> createServiceAgencyAsync(CreateServiceAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createServiceAgency);
    }

    /**
     * 创建委托并授权
     *
     * 根据body体中的角色和作用范围，创建委托，并将策略赋予给委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceAgencyRequest 请求对象
     * @return AsyncInvoker<CreateServiceAgencyRequest, CreateServiceAgencyResponse>
     */
    public AsyncInvoker<CreateServiceAgencyRequest, CreateServiceAgencyResponse> createServiceAgencyAsyncInvoker(
        CreateServiceAgencyRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createServiceAgency, hcClient);
    }

    /**
     * 创建数据投递
     *
     * 创建数据投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShipperRequest 请求对象
     * @return CompletableFuture<CreateShipperResponse>
     */
    public CompletableFuture<CreateShipperResponse> createShipperAsync(CreateShipperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createShipper);
    }

    /**
     * 创建数据投递
     *
     * 创建数据投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShipperRequest 请求对象
     * @return AsyncInvoker<CreateShipperRequest, CreateShipperResponse>
     */
    public AsyncInvoker<CreateShipperRequest, CreateShipperResponse> createShipperAsyncInvoker(
        CreateShipperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createShipper, hcClient);
    }

    /**
     * 创建委托权限
     *
     * 创建委托权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShipperDelegateAuthRequest 请求对象
     * @return CompletableFuture<CreateShipperDelegateAuthResponse>
     */
    public CompletableFuture<CreateShipperDelegateAuthResponse> createShipperDelegateAuthAsync(
        CreateShipperDelegateAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createShipperDelegateAuth);
    }

    /**
     * 创建委托权限
     *
     * 创建委托权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShipperDelegateAuthRequest 请求对象
     * @return AsyncInvoker<CreateShipperDelegateAuthRequest, CreateShipperDelegateAuthResponse>
     */
    public AsyncInvoker<CreateShipperDelegateAuthRequest, CreateShipperDelegateAuthResponse> createShipperDelegateAuthAsyncInvoker(
        CreateShipperDelegateAuthRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createShipperDelegateAuth, hcClient);
    }

    /**
     * 开通或配置安全云脑订阅
     *
     * 安全云脑开通与配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionOrderRequest 请求对象
     * @return CompletableFuture<CreateSubscriptionOrderResponse>
     */
    public CompletableFuture<CreateSubscriptionOrderResponse> createSubscriptionOrderAsync(
        CreateSubscriptionOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createSubscriptionOrder);
    }

    /**
     * 开通或配置安全云脑订阅
     *
     * 安全云脑开通与配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionOrderRequest 请求对象
     * @return AsyncInvoker<CreateSubscriptionOrderRequest, CreateSubscriptionOrderResponse>
     */
    public AsyncInvoker<CreateSubscriptionOrderRequest, CreateSubscriptionOrderResponse> createSubscriptionOrderAsyncInvoker(
        CreateSubscriptionOrderRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createSubscriptionOrder, hcClient);
    }

    /**
     * 创建流程实例
     *
     * 创建流程实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowInstanceRequest 请求对象
     * @return CompletableFuture<CreateWorkflowInstanceResponse>
     */
    public CompletableFuture<CreateWorkflowInstanceResponse> createWorkflowInstanceAsync(
        CreateWorkflowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createWorkflowInstance);
    }

    /**
     * 创建流程实例
     *
     * 创建流程实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowInstanceRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowInstanceRequest, CreateWorkflowInstanceResponse>
     */
    public AsyncInvoker<CreateWorkflowInstanceRequest, CreateWorkflowInstanceResponse> createWorkflowInstanceAsyncInvoker(
        CreateWorkflowInstanceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createWorkflowInstance, hcClient);
    }

    /**
     * 新建工作空间
     *
     * 在使用安全云脑的基线检查、告警管理、安全分析、安全编排等功能前，需要创建工作空间，它可以将资源划分为各个不同的工作场景，避免资源冗余查找不便，影响日常使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CompletableFuture<CreateWorkspaceResponse>
     */
    public CompletableFuture<CreateWorkspaceResponse> createWorkspaceAsync(CreateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createWorkspace);
    }

    /**
     * 新建工作空间
     *
     * 在使用安全云脑的基线检查、告警管理、安全分析、安全编排等功能前，需要创建工作空间，它可以将资源划分为各个不同的工作场景，避免资源冗余查找不便，影响日常使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceAsyncInvoker(
        CreateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createWorkspace, hcClient);
    }

    /**
     * 删除告警
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRequest 请求对象
     * @return CompletableFuture<DeleteAlertResponse>
     */
    public CompletableFuture<DeleteAlertResponse> deleteAlertAsync(DeleteAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAlert);
    }

    /**
     * 删除告警
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRequest 请求对象
     * @return AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse>
     */
    public AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse> deleteAlertAsyncInvoker(DeleteAlertRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteAlert, hcClient);
    }

    /**
     * 删除告警规则
     *
     * 删除告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return CompletableFuture<DeleteAlertRuleResponse>
     */
    public CompletableFuture<DeleteAlertRuleResponse> deleteAlertRuleAsync(DeleteAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAlertRule);
    }

    /**
     * 删除告警规则
     *
     * 删除告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
     */
    public AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRuleAsyncInvoker(
        DeleteAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteAlertRule, hcClient);
    }

    /**
     * 批量删除告警
     *
     * 批量删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertsRequest 请求对象
     * @return CompletableFuture<DeleteAlertsResponse>
     */
    public CompletableFuture<DeleteAlertsResponse> deleteAlertsAsync(DeleteAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAlerts);
    }

    /**
     * 批量删除告警
     *
     * 批量删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertsRequest 请求对象
     * @return AsyncInvoker<DeleteAlertsRequest, DeleteAlertsResponse>
     */
    public AsyncInvoker<DeleteAlertsRequest, DeleteAlertsResponse> deleteAlertsAsyncInvoker(
        DeleteAlertsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteAlerts, hcClient);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAopWorkflowRequest 请求对象
     * @return CompletableFuture<DeleteAopWorkflowResponse>
     */
    public CompletableFuture<DeleteAopWorkflowResponse> deleteAopWorkflowAsync(DeleteAopWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAopWorkflow);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAopWorkflowRequest 请求对象
     * @return AsyncInvoker<DeleteAopWorkflowRequest, DeleteAopWorkflowResponse>
     */
    public AsyncInvoker<DeleteAopWorkflowRequest, DeleteAopWorkflowResponse> deleteAopWorkflowAsyncInvoker(
        DeleteAopWorkflowRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteAopWorkflow, hcClient);
    }

    /**
     * 删除流程版本
     *
     * 删除流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAopWorkflowVersionRequest 请求对象
     * @return CompletableFuture<DeleteAopWorkflowVersionResponse>
     */
    public CompletableFuture<DeleteAopWorkflowVersionResponse> deleteAopWorkflowVersionAsync(
        DeleteAopWorkflowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAopWorkflowVersion);
    }

    /**
     * 删除流程版本
     *
     * 删除流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAopWorkflowVersionRequest 请求对象
     * @return AsyncInvoker<DeleteAopWorkflowVersionRequest, DeleteAopWorkflowVersionResponse>
     */
    public AsyncInvoker<DeleteAopWorkflowVersionRequest, DeleteAopWorkflowVersionResponse> deleteAopWorkflowVersionAsyncInvoker(
        DeleteAopWorkflowVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteAopWorkflowVersion, hcClient);
    }

    /**
     * 批量删除目录
     *
     * 批量删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCatalogueRequest 请求对象
     * @return CompletableFuture<DeleteCatalogueResponse>
     */
    public CompletableFuture<DeleteCatalogueResponse> deleteCatalogueAsync(DeleteCatalogueRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteCatalogue);
    }

    /**
     * 批量删除目录
     *
     * 批量删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCatalogueRequest 请求对象
     * @return AsyncInvoker<DeleteCatalogueRequest, DeleteCatalogueResponse>
     */
    public AsyncInvoker<DeleteCatalogueRequest, DeleteCatalogueResponse> deleteCatalogueAsyncInvoker(
        DeleteCatalogueRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteCatalogue, hcClient);
    }

    /**
     * 删除分类
     *
     * 删除分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClassifierRequest 请求对象
     * @return CompletableFuture<DeleteClassifierResponse>
     */
    public CompletableFuture<DeleteClassifierResponse> deleteClassifierAsync(DeleteClassifierRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteClassifier);
    }

    /**
     * 删除分类
     *
     * 删除分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClassifierRequest 请求对象
     * @return AsyncInvoker<DeleteClassifierRequest, DeleteClassifierResponse>
     */
    public AsyncInvoker<DeleteClassifierRequest, DeleteClassifierResponse> deleteClassifierAsyncInvoker(
        DeleteClassifierRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteClassifier, hcClient);
    }

    /**
     * 删除采集通道
     *
     * 删除采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorChannelRequest 请求对象
     * @return CompletableFuture<DeleteCollectorChannelResponse>
     */
    public CompletableFuture<DeleteCollectorChannelResponse> deleteCollectorChannelAsync(
        DeleteCollectorChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteCollectorChannel);
    }

    /**
     * 删除采集通道
     *
     * 删除采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorChannelRequest 请求对象
     * @return AsyncInvoker<DeleteCollectorChannelRequest, DeleteCollectorChannelResponse>
     */
    public AsyncInvoker<DeleteCollectorChannelRequest, DeleteCollectorChannelResponse> deleteCollectorChannelAsyncInvoker(
        DeleteCollectorChannelRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteCollectorChannel, hcClient);
    }

    /**
     * 删除采集通道分组
     *
     * 删除采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorChannelGroupRequest 请求对象
     * @return CompletableFuture<DeleteCollectorChannelGroupResponse>
     */
    public CompletableFuture<DeleteCollectorChannelGroupResponse> deleteCollectorChannelGroupAsync(
        DeleteCollectorChannelGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteCollectorChannelGroup);
    }

    /**
     * 删除采集通道分组
     *
     * 删除采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorChannelGroupRequest 请求对象
     * @return AsyncInvoker<DeleteCollectorChannelGroupRequest, DeleteCollectorChannelGroupResponse>
     */
    public AsyncInvoker<DeleteCollectorChannelGroupRequest, DeleteCollectorChannelGroupResponse> deleteCollectorChannelGroupAsyncInvoker(
        DeleteCollectorChannelGroupRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteCollectorChannelGroup, hcClient);
    }

    /**
     * 删除采集连接
     *
     * 删除采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorConnectionRequest 请求对象
     * @return CompletableFuture<DeleteCollectorConnectionResponse>
     */
    public CompletableFuture<DeleteCollectorConnectionResponse> deleteCollectorConnectionAsync(
        DeleteCollectorConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteCollectorConnection);
    }

    /**
     * 删除采集连接
     *
     * 删除采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteCollectorConnectionRequest, DeleteCollectorConnectionResponse>
     */
    public AsyncInvoker<DeleteCollectorConnectionRequest, DeleteCollectorConnectionResponse> deleteCollectorConnectionAsyncInvoker(
        DeleteCollectorConnectionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteCollectorConnection, hcClient);
    }

    /**
     * 删除采集解析器
     *
     * 删除采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorParserRequest 请求对象
     * @return CompletableFuture<DeleteCollectorParserResponse>
     */
    public CompletableFuture<DeleteCollectorParserResponse> deleteCollectorParserAsync(
        DeleteCollectorParserRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteCollectorParser);
    }

    /**
     * 删除采集解析器
     *
     * 删除采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorParserRequest 请求对象
     * @return AsyncInvoker<DeleteCollectorParserRequest, DeleteCollectorParserResponse>
     */
    public AsyncInvoker<DeleteCollectorParserRequest, DeleteCollectorParserResponse> deleteCollectorParserAsyncInvoker(
        DeleteCollectorParserRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteCollectorParser, hcClient);
    }

    /**
     * 删除插件配置模板
     *
     * 删除某个在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentTemplateRequest 请求对象
     * @return CompletableFuture<DeleteComponentTemplateResponse>
     */
    public CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplateAsync(
        DeleteComponentTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteComponentTemplate);
    }

    /**
     * 删除插件配置模板
     *
     * 删除某个在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse>
     */
    public AsyncInvoker<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse> deleteComponentTemplateAsyncInvoker(
        DeleteComponentTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteComponentTemplate, hcClient);
    }

    /**
     * 删除字典
     *
     * 删除字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationDictionariesRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationDictionariesResponse>
     */
    public CompletableFuture<DeleteConfigurationDictionariesResponse> deleteConfigurationDictionariesAsync(
        DeleteConfigurationDictionariesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteConfigurationDictionaries);
    }

    /**
     * 删除字典
     *
     * 删除字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationDictionariesRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationDictionariesRequest, DeleteConfigurationDictionariesResponse>
     */
    public AsyncInvoker<DeleteConfigurationDictionariesRequest, DeleteConfigurationDictionariesResponse> deleteConfigurationDictionariesAsyncInvoker(
        DeleteConfigurationDictionariesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteConfigurationDictionaries, hcClient);
    }

    /**
     * 删除操作连接
     *
     * 删除操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return CompletableFuture<DeleteConnectionResponse>
     */
    public CompletableFuture<DeleteConnectionResponse> deleteConnectionAsync(DeleteConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteConnection);
    }

    /**
     * 删除操作连接
     *
     * 删除操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionAsyncInvoker(
        DeleteConnectionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteConnection, hcClient);
    }

    /**
     * 数据类类型删除
     *
     * 删除数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataclassTypeRequest 请求对象
     * @return CompletableFuture<DeleteDataclassTypeResponse>
     */
    public CompletableFuture<DeleteDataclassTypeResponse> deleteDataclassTypeAsync(DeleteDataclassTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteDataclassType);
    }

    /**
     * 数据类类型删除
     *
     * 删除数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataclassTypeRequest 请求对象
     * @return AsyncInvoker<DeleteDataclassTypeRequest, DeleteDataclassTypeResponse>
     */
    public AsyncInvoker<DeleteDataclassTypeRequest, DeleteDataclassTypeResponse> deleteDataclassTypeAsyncInvoker(
        DeleteDataclassTypeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteDataclassType, hcClient);
    }

    /**
     * 取消关联数据对象
     *
     * 取消关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectRelationRequest 请求对象
     * @return CompletableFuture<DeleteDataobjectRelationResponse>
     */
    public CompletableFuture<DeleteDataobjectRelationResponse> deleteDataobjectRelationAsync(
        DeleteDataobjectRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteDataobjectRelation);
    }

    /**
     * 取消关联数据对象
     *
     * 取消关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectRelationRequest 请求对象
     * @return AsyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse>
     */
    public AsyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> deleteDataobjectRelationAsyncInvoker(
        DeleteDataobjectRelationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteDataobjectRelation, hcClient);
    }

    /**
     * 批量删除数据对象
     *
     * 批量删除数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectsRequest 请求对象
     * @return CompletableFuture<DeleteDataobjectsResponse>
     */
    public CompletableFuture<DeleteDataobjectsResponse> deleteDataobjectsAsync(DeleteDataobjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteDataobjects);
    }

    /**
     * 批量删除数据对象
     *
     * 批量删除数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectsRequest 请求对象
     * @return AsyncInvoker<DeleteDataobjectsRequest, DeleteDataobjectsResponse>
     */
    public AsyncInvoker<DeleteDataobjectsRequest, DeleteDataobjectsResponse> deleteDataobjectsAsyncInvoker(
        DeleteDataobjectsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteDataobjects, hcClient);
    }

    /**
     * 删除数据空间
     *
     * 删除数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataspaceRequest 请求对象
     * @return CompletableFuture<DeleteDataspaceResponse>
     */
    public CompletableFuture<DeleteDataspaceResponse> deleteDataspaceAsync(DeleteDataspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteDataspace);
    }

    /**
     * 删除数据空间
     *
     * 删除数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataspaceRequest 请求对象
     * @return AsyncInvoker<DeleteDataspaceRequest, DeleteDataspaceResponse>
     */
    public AsyncInvoker<DeleteDataspaceRequest, DeleteDataspaceResponse> deleteDataspaceAsyncInvoker(
        DeleteDataspaceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteDataspace, hcClient);
    }

    /**
     * 删除事件
     *
     * 删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentRequest 请求对象
     * @return CompletableFuture<DeleteIncidentResponse>
     */
    public CompletableFuture<DeleteIncidentResponse> deleteIncidentAsync(DeleteIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteIncident);
    }

    /**
     * 删除事件
     *
     * 删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentRequest 请求对象
     * @return AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>
     */
    public AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncidentAsyncInvoker(
        DeleteIncidentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteIncident, hcClient);
    }

    /**
     * 批量删除事件
     *
     * 批量删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentsRequest 请求对象
     * @return CompletableFuture<DeleteIncidentsResponse>
     */
    public CompletableFuture<DeleteIncidentsResponse> deleteIncidentsAsync(DeleteIncidentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteIncidents);
    }

    /**
     * 批量删除事件
     *
     * 批量删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentsRequest 请求对象
     * @return AsyncInvoker<DeleteIncidentsRequest, DeleteIncidentsResponse>
     */
    public AsyncInvoker<DeleteIncidentsRequest, DeleteIncidentsResponse> deleteIncidentsAsyncInvoker(
        DeleteIncidentsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteIncidents, hcClient);
    }

    /**
     * 删除威胁情报
     *
     * 删除威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndicatorRequest 请求对象
     * @return CompletableFuture<DeleteIndicatorResponse>
     */
    public CompletableFuture<DeleteIndicatorResponse> deleteIndicatorAsync(DeleteIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteIndicator);
    }

    /**
     * 删除威胁情报
     *
     * 删除威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndicatorRequest 请求对象
     * @return AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>
     */
    public AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicatorAsyncInvoker(
        DeleteIndicatorRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteIndicator, hcClient);
    }

    /**
     * 删除布局页面
     *
     * 删除页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutWizardRequest 请求对象
     * @return CompletableFuture<DeleteLayoutWizardResponse>
     */
    public CompletableFuture<DeleteLayoutWizardResponse> deleteLayoutWizardAsync(DeleteLayoutWizardRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteLayoutWizard);
    }

    /**
     * 删除布局页面
     *
     * 删除页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutWizardRequest 请求对象
     * @return AsyncInvoker<DeleteLayoutWizardRequest, DeleteLayoutWizardResponse>
     */
    public AsyncInvoker<DeleteLayoutWizardRequest, DeleteLayoutWizardResponse> deleteLayoutWizardAsyncInvoker(
        DeleteLayoutWizardRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteLayoutWizard, hcClient);
    }

    /**
     * 删除布局
     *
     * 删除布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutsRequest 请求对象
     * @return CompletableFuture<DeleteLayoutsResponse>
     */
    public CompletableFuture<DeleteLayoutsResponse> deleteLayoutsAsync(DeleteLayoutsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteLayouts);
    }

    /**
     * 删除布局
     *
     * 删除布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutsRequest 请求对象
     * @return AsyncInvoker<DeleteLayoutsRequest, DeleteLayoutsResponse>
     */
    public AsyncInvoker<DeleteLayoutsRequest, DeleteLayoutsResponse> deleteLayoutsAsyncInvoker(
        DeleteLayoutsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteLayouts, hcClient);
    }

    /**
     * 删除lts日志订阅
     *
     * 删除云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsCloudLogRequest 请求对象
     * @return CompletableFuture<DeleteLtsCloudLogResponse>
     */
    public CompletableFuture<DeleteLtsCloudLogResponse> deleteLtsCloudLogAsync(DeleteLtsCloudLogRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteLtsCloudLog);
    }

    /**
     * 删除lts日志订阅
     *
     * 删除云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsCloudLogRequest 请求对象
     * @return AsyncInvoker<DeleteLtsCloudLogRequest, DeleteLtsCloudLogResponse>
     */
    public AsyncInvoker<DeleteLtsCloudLogRequest, DeleteLtsCloudLogResponse> deleteLtsCloudLogAsyncInvoker(
        DeleteLtsCloudLogRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteLtsCloudLog, hcClient);
    }

    /**
     * 删除映射信息
     *
     * 删除映射信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMappingInfoRequest 请求对象
     * @return CompletableFuture<DeleteMappingInfoResponse>
     */
    public CompletableFuture<DeleteMappingInfoResponse> deleteMappingInfoAsync(DeleteMappingInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteMappingInfo);
    }

    /**
     * 删除映射信息
     *
     * 删除映射信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMappingInfoRequest 请求对象
     * @return AsyncInvoker<DeleteMappingInfoRequest, DeleteMappingInfoResponse>
     */
    public AsyncInvoker<DeleteMappingInfoRequest, DeleteMappingInfoResponse> deleteMappingInfoAsyncInvoker(
        DeleteMappingInfoRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteMappingInfo, hcClient);
    }

    /**
     * 删除指标
     *
     * 删除指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricsRequest 请求对象
     * @return CompletableFuture<DeleteMetricsResponse>
     */
    public CompletableFuture<DeleteMetricsResponse> deleteMetricsAsync(DeleteMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteMetrics);
    }

    /**
     * 删除指标
     *
     * 删除指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricsRequest 请求对象
     * @return AsyncInvoker<DeleteMetricsRequest, DeleteMetricsResponse>
     */
    public AsyncInvoker<DeleteMetricsRequest, DeleteMetricsResponse> deleteMetricsAsyncInvoker(
        DeleteMetricsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteMetrics, hcClient);
    }

    /**
     * 删除模块
     *
     * 删除模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModuleRequest 请求对象
     * @return CompletableFuture<DeleteModuleResponse>
     */
    public CompletableFuture<DeleteModuleResponse> deleteModuleAsync(DeleteModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteModule);
    }

    /**
     * 删除模块
     *
     * 删除模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModuleRequest 请求对象
     * @return AsyncInvoker<DeleteModuleRequest, DeleteModuleResponse>
     */
    public AsyncInvoker<DeleteModuleRequest, DeleteModuleResponse> deleteModuleAsyncInvoker(
        DeleteModuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteModule, hcClient);
    }

    /**
     * 通过节点id删除节点
     *
     * 删除节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodeRequest 请求对象
     * @return CompletableFuture<DeleteNodeResponse>
     */
    public CompletableFuture<DeleteNodeResponse> deleteNodeAsync(DeleteNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteNode);
    }

    /**
     * 通过节点id删除节点
     *
     * 删除节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodeRequest 请求对象
     * @return AsyncInvoker<DeleteNodeRequest, DeleteNodeResponse>
     */
    public AsyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeAsyncInvoker(DeleteNodeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteNode, hcClient);
    }

    /**
     * 删除评论
     *
     * 删除评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotesRequest 请求对象
     * @return CompletableFuture<DeleteNotesResponse>
     */
    public CompletableFuture<DeleteNotesResponse> deleteNotesAsync(DeleteNotesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteNotes);
    }

    /**
     * 删除评论
     *
     * 删除评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotesRequest 请求对象
     * @return AsyncInvoker<DeleteNotesRequest, DeleteNotesResponse>
     */
    public AsyncInvoker<DeleteNotesRequest, DeleteNotesResponse> deleteNotesAsyncInvoker(DeleteNotesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteNotes, hcClient);
    }

    /**
     * 删除数据管道
     *
     * 删除数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeRequest 请求对象
     * @return CompletableFuture<DeletePipeResponse>
     */
    public CompletableFuture<DeletePipeResponse> deletePipeAsync(DeletePipeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePipe);
    }

    /**
     * 删除数据管道
     *
     * 删除数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeRequest 请求对象
     * @return AsyncInvoker<DeletePipeRequest, DeletePipeResponse>
     */
    public AsyncInvoker<DeletePipeRequest, DeletePipeResponse> deletePipeAsyncInvoker(DeletePipeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deletePipe, hcClient);
    }

    /**
     * 关闭实时消费
     *
     * 关闭实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeConsumptionRequest 请求对象
     * @return CompletableFuture<DeletePipeConsumptionResponse>
     */
    public CompletableFuture<DeletePipeConsumptionResponse> deletePipeConsumptionAsync(
        DeletePipeConsumptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePipeConsumption);
    }

    /**
     * 关闭实时消费
     *
     * 关闭实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeConsumptionRequest 请求对象
     * @return AsyncInvoker<DeletePipeConsumptionRequest, DeletePipeConsumptionResponse>
     */
    public AsyncInvoker<DeletePipeConsumptionRequest, DeletePipeConsumptionResponse> deletePipeConsumptionAsyncInvoker(
        DeletePipeConsumptionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deletePipeConsumption, hcClient);
    }

    /**
     * 删除剧本
     *
     * 删除剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRequest 请求对象
     * @return CompletableFuture<DeletePlaybookResponse>
     */
    public CompletableFuture<DeletePlaybookResponse> deletePlaybookAsync(DeletePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePlaybook);
    }

    /**
     * 删除剧本
     *
     * 删除剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>
     */
    public AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybookAsyncInvoker(
        DeletePlaybookRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deletePlaybook, hcClient);
    }

    /**
     * 删除剧本动作
     *
     * 删除剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookActionRequest 请求对象
     * @return CompletableFuture<DeletePlaybookActionResponse>
     */
    public CompletableFuture<DeletePlaybookActionResponse> deletePlaybookActionAsync(
        DeletePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePlaybookAction);
    }

    /**
     * 删除剧本动作
     *
     * 删除剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookActionRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>
     */
    public AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookActionAsyncInvoker(
        DeletePlaybookActionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deletePlaybookAction, hcClient);
    }

    /**
     * 删除剧本规则
     *
     * 删除剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRuleRequest 请求对象
     * @return CompletableFuture<DeletePlaybookRuleResponse>
     */
    public CompletableFuture<DeletePlaybookRuleResponse> deletePlaybookRuleAsync(DeletePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePlaybookRule);
    }

    /**
     * 删除剧本规则
     *
     * 删除剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>
     */
    public AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRuleAsyncInvoker(
        DeletePlaybookRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deletePlaybookRule, hcClient);
    }

    /**
     * 删除剧本版本
     *
     * 删除剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookVersionRequest 请求对象
     * @return CompletableFuture<DeletePlaybookVersionResponse>
     */
    public CompletableFuture<DeletePlaybookVersionResponse> deletePlaybookVersionAsync(
        DeletePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePlaybookVersion);
    }

    /**
     * 删除剧本版本
     *
     * 删除剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>
     */
    public AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersionAsyncInvoker(
        DeletePlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deletePlaybookVersion, hcClient);
    }

    /**
     * 批量删除应急策略
     *
     * 批量删除应急策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoliciesRequest 请求对象
     * @return CompletableFuture<DeletePoliciesResponse>
     */
    public CompletableFuture<DeletePoliciesResponse> deletePoliciesAsync(DeletePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePolicies);
    }

    /**
     * 批量删除应急策略
     *
     * 批量删除应急策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoliciesRequest 请求对象
     * @return AsyncInvoker<DeletePoliciesRequest, DeletePoliciesResponse>
     */
    public AsyncInvoker<DeletePoliciesRequest, DeletePoliciesResponse> deletePoliciesAsyncInvoker(
        DeletePoliciesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deletePolicies, hcClient);
    }

    /**
     * 删除报告
     *
     * 删除报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportRequest 请求对象
     * @return CompletableFuture<DeleteReportResponse>
     */
    public CompletableFuture<DeleteReportResponse> deleteReportAsync(DeleteReportRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteReport);
    }

    /**
     * 删除报告
     *
     * 删除报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportRequest 请求对象
     * @return AsyncInvoker<DeleteReportRequest, DeleteReportResponse>
     */
    public AsyncInvoker<DeleteReportRequest, DeleteReportResponse> deleteReportAsyncInvoker(
        DeleteReportRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteReport, hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteResource);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceAsyncInvoker(
        DeleteResourceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteResource, hcClient);
    }

    /**
     * 删除检索条件
     *
     * 删除检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSearchConditionRequest 请求对象
     * @return CompletableFuture<DeleteSearchConditionResponse>
     */
    public CompletableFuture<DeleteSearchConditionResponse> deleteSearchConditionAsync(
        DeleteSearchConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteSearchCondition);
    }

    /**
     * 删除检索条件
     *
     * 删除检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSearchConditionRequest 请求对象
     * @return AsyncInvoker<DeleteSearchConditionRequest, DeleteSearchConditionResponse>
     */
    public AsyncInvoker<DeleteSearchConditionRequest, DeleteSearchConditionResponse> deleteSearchConditionAsyncInvoker(
        DeleteSearchConditionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteSearchCondition, hcClient);
    }

    /**
     * 删除投递信息
     *
     * 删除投递信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShipperRequest 请求对象
     * @return CompletableFuture<DeleteShipperResponse>
     */
    public CompletableFuture<DeleteShipperResponse> deleteShipperAsync(DeleteShipperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteShipper);
    }

    /**
     * 删除投递信息
     *
     * 删除投递信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShipperRequest 请求对象
     * @return AsyncInvoker<DeleteShipperRequest, DeleteShipperResponse>
     */
    public AsyncInvoker<DeleteShipperRequest, DeleteShipperResponse> deleteShipperAsyncInvoker(
        DeleteShipperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteShipper, hcClient);
    }

    /**
     * 删除单个映射
     *
     * 删除单个映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSingleMapperRequest 请求对象
     * @return CompletableFuture<DeleteSingleMapperResponse>
     */
    public CompletableFuture<DeleteSingleMapperResponse> deleteSingleMapperAsync(DeleteSingleMapperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteSingleMapper);
    }

    /**
     * 删除单个映射
     *
     * 删除单个映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSingleMapperRequest 请求对象
     * @return AsyncInvoker<DeleteSingleMapperRequest, DeleteSingleMapperResponse>
     */
    public AsyncInvoker<DeleteSingleMapperRequest, DeleteSingleMapperResponse> deleteSingleMapperAsyncInvoker(
        DeleteSingleMapperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteSingleMapper, hcClient);
    }

    /**
     * 取消订阅资源
     *
     * 安全云脑退订服务接口，目前仅支持按需场景
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionOrderRequest 请求对象
     * @return CompletableFuture<DeleteSubscriptionOrderResponse>
     */
    public CompletableFuture<DeleteSubscriptionOrderResponse> deleteSubscriptionOrderAsync(
        DeleteSubscriptionOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteSubscriptionOrder);
    }

    /**
     * 取消订阅资源
     *
     * 安全云脑退订服务接口，目前仅支持按需场景
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionOrderRequest 请求对象
     * @return AsyncInvoker<DeleteSubscriptionOrderRequest, DeleteSubscriptionOrderResponse>
     */
    public AsyncInvoker<DeleteSubscriptionOrderRequest, DeleteSubscriptionOrderResponse> deleteSubscriptionOrderAsyncInvoker(
        DeleteSubscriptionOrderRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteSubscriptionOrder, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 为指定实例批量删除标签
     * 标签管理服务需要使用该接口批量管理实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagsRequest 请求对象
     * @return CompletableFuture<DeleteTagsResponse>
     */
    public CompletableFuture<DeleteTagsResponse> deleteTagsAsync(DeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteTags);
    }

    /**
     * 删除资源标签
     *
     * 为指定实例批量删除标签
     * 标签管理服务需要使用该接口批量管理实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagsRequest 请求对象
     * @return AsyncInvoker<DeleteTagsRequest, DeleteTagsResponse>
     */
    public AsyncInvoker<DeleteTagsRequest, DeleteTagsResponse> deleteTagsAsyncInvoker(DeleteTagsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteTags, hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return CompletableFuture<DeleteWorkspaceResponse>
     */
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteWorkspace);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceAsyncInvoker(
        DeleteWorkspaceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteWorkspace, hcClient);
    }

    /**
     * 停用告警规则
     *
     * 停用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return CompletableFuture<DisableAlertRuleResponse>
     */
    public CompletableFuture<DisableAlertRuleResponse> disableAlertRuleAsync(DisableAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.disableAlertRule);
    }

    /**
     * 停用告警规则
     *
     * 停用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>
     */
    public AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRuleAsyncInvoker(
        DisableAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.disableAlertRule, hcClient);
    }

    /**
     * 下载告警导入模板
     *
     * 下载告警导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的告警样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAlertTemplateRequest 请求对象
     * @return CompletableFuture<DownloadAlertTemplateResponse>
     */
    public CompletableFuture<DownloadAlertTemplateResponse> downloadAlertTemplateAsync(
        DownloadAlertTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.downloadAlertTemplate);
    }

    /**
     * 下载告警导入模板
     *
     * 下载告警导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的告警样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAlertTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadAlertTemplateRequest, DownloadAlertTemplateResponse>
     */
    public AsyncInvoker<DownloadAlertTemplateRequest, DownloadAlertTemplateResponse> downloadAlertTemplateAsyncInvoker(
        DownloadAlertTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.downloadAlertTemplate, hcClient);
    }

    /**
     * 下载附件
     *
     * 从OBS下载附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return CompletableFuture<DownloadAttachmentResponse>
     */
    public CompletableFuture<DownloadAttachmentResponse> downloadAttachmentAsync(DownloadAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.downloadAttachment);
    }

    /**
     * 下载附件
     *
     * 从OBS下载附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return AsyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse>
     */
    public AsyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachmentAsyncInvoker(
        DownloadAttachmentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.downloadAttachment, hcClient);
    }

    /**
     * 下载事件导入模板
     *
     * 下载事件导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的事件样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIncidentTemplateRequest 请求对象
     * @return CompletableFuture<DownloadIncidentTemplateResponse>
     */
    public CompletableFuture<DownloadIncidentTemplateResponse> downloadIncidentTemplateAsync(
        DownloadIncidentTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.downloadIncidentTemplate);
    }

    /**
     * 下载事件导入模板
     *
     * 下载事件导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的事件样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIncidentTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadIncidentTemplateRequest, DownloadIncidentTemplateResponse>
     */
    public AsyncInvoker<DownloadIncidentTemplateRequest, DownloadIncidentTemplateResponse> downloadIncidentTemplateAsyncInvoker(
        DownloadIncidentTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.downloadIncidentTemplate, hcClient);
    }

    /**
     * 下载情报模板
     *
     * 下载情报导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的情报样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIndicatorTemplateRequest 请求对象
     * @return CompletableFuture<DownloadIndicatorTemplateResponse>
     */
    public CompletableFuture<DownloadIndicatorTemplateResponse> downloadIndicatorTemplateAsync(
        DownloadIndicatorTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.downloadIndicatorTemplate);
    }

    /**
     * 下载情报模板
     *
     * 下载情报导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的情报样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIndicatorTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadIndicatorTemplateRequest, DownloadIndicatorTemplateResponse>
     */
    public AsyncInvoker<DownloadIndicatorTemplateRequest, DownloadIndicatorTemplateResponse> downloadIndicatorTemplateAsyncInvoker(
        DownloadIndicatorTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.downloadIndicatorTemplate, hcClient);
    }

    /**
     * 下载资产导入模板
     *
     * 下载资产导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadResourceTemplateRequest 请求对象
     * @return CompletableFuture<DownloadResourceTemplateResponse>
     */
    public CompletableFuture<DownloadResourceTemplateResponse> downloadResourceTemplateAsync(
        DownloadResourceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.downloadResourceTemplate);
    }

    /**
     * 下载资产导入模板
     *
     * 下载资产导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadResourceTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadResourceTemplateRequest, DownloadResourceTemplateResponse>
     */
    public AsyncInvoker<DownloadResourceTemplateRequest, DownloadResourceTemplateResponse> downloadResourceTemplateAsyncInvoker(
        DownloadResourceTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.downloadResourceTemplate, hcClient);
    }

    /**
     * 下载漏洞导入模板
     *
     * 下载漏洞导入模板，模板根据标准的dataclass字段属性来组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadVulnerabilityTemplateRequest 请求对象
     * @return CompletableFuture<DownloadVulnerabilityTemplateResponse>
     */
    public CompletableFuture<DownloadVulnerabilityTemplateResponse> downloadVulnerabilityTemplateAsync(
        DownloadVulnerabilityTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.downloadVulnerabilityTemplate);
    }

    /**
     * 下载漏洞导入模板
     *
     * 下载漏洞导入模板，模板根据标准的dataclass字段属性来组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadVulnerabilityTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadVulnerabilityTemplateRequest, DownloadVulnerabilityTemplateResponse>
     */
    public AsyncInvoker<DownloadVulnerabilityTemplateRequest, DownloadVulnerabilityTemplateResponse> downloadVulnerabilityTemplateAsyncInvoker(
        DownloadVulnerabilityTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.downloadVulnerabilityTemplate, hcClient);
    }

    /**
     * 启用告警规则
     *
     * 启用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return CompletableFuture<EnableAlertRuleResponse>
     */
    public CompletableFuture<EnableAlertRuleResponse> enableAlertRuleAsync(EnableAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.enableAlertRule);
    }

    /**
     * 启用告警规则
     *
     * 启用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>
     */
    public AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRuleAsyncInvoker(
        EnableAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.enableAlertRule, hcClient);
    }

    /**
     * 数据类类型启用/禁用
     *
     * 禁用/启用数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataclassTypeRequest 请求对象
     * @return CompletableFuture<EnableDataclassTypeResponse>
     */
    public CompletableFuture<EnableDataclassTypeResponse> enableDataclassTypeAsync(EnableDataclassTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.enableDataclassType);
    }

    /**
     * 数据类类型启用/禁用
     *
     * 禁用/启用数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataclassTypeRequest 请求对象
     * @return AsyncInvoker<EnableDataclassTypeRequest, EnableDataclassTypeResponse>
     */
    public AsyncInvoker<EnableDataclassTypeRequest, EnableDataclassTypeResponse> enableDataclassTypeAsyncInvoker(
        EnableDataclassTypeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.enableDataclassType, hcClient);
    }

    /**
     * 操作布局
     *
     * 操作布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteLayoutRequest 请求对象
     * @return CompletableFuture<ExecuteLayoutResponse>
     */
    public CompletableFuture<ExecuteLayoutResponse> executeLayoutAsync(ExecuteLayoutRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.executeLayout);
    }

    /**
     * 操作布局
     *
     * 操作布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteLayoutRequest 请求对象
     * @return AsyncInvoker<ExecuteLayoutRequest, ExecuteLayoutResponse>
     */
    public AsyncInvoker<ExecuteLayoutRequest, ExecuteLayoutResponse> executeLayoutAsyncInvoker(
        ExecuteLayoutRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.executeLayout, hcClient);
    }

    /**
     * 操作安全报告
     *
     * 操作安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteReportActionRequest 请求对象
     * @return CompletableFuture<ExecuteReportActionResponse>
     */
    public CompletableFuture<ExecuteReportActionResponse> executeReportActionAsync(ExecuteReportActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.executeReportAction);
    }

    /**
     * 操作安全报告
     *
     * 操作安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteReportActionRequest 请求对象
     * @return AsyncInvoker<ExecuteReportActionRequest, ExecuteReportActionResponse>
     */
    public AsyncInvoker<ExecuteReportActionRequest, ExecuteReportActionResponse> executeReportActionAsyncInvoker(
        ExecuteReportActionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.executeReportAction, hcClient);
    }

    /**
     * 导出告警
     *
     * 导出告警,若字段是object类型，则将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAlertsRequest 请求对象
     * @return CompletableFuture<ExportAlertsResponse>
     */
    public CompletableFuture<ExportAlertsResponse> exportAlertsAsync(ExportAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportAlerts);
    }

    /**
     * 导出告警
     *
     * 导出告警,若字段是object类型，则将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAlertsRequest 请求对象
     * @return AsyncInvoker<ExportAlertsRequest, ExportAlertsResponse>
     */
    public AsyncInvoker<ExportAlertsRequest, ExportAlertsResponse> exportAlertsAsyncInvoker(
        ExportAlertsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportAlerts, hcClient);
    }

    /**
     * 导出流程
     *
     * 导出流程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAopworkflowRequest 请求对象
     * @return CompletableFuture<ExportAopworkflowResponse>
     */
    public CompletableFuture<ExportAopworkflowResponse> exportAopworkflowAsync(ExportAopworkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportAopworkflow);
    }

    /**
     * 导出流程
     *
     * 导出流程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAopworkflowRequest 请求对象
     * @return AsyncInvoker<ExportAopworkflowRequest, ExportAopworkflowResponse>
     */
    public AsyncInvoker<ExportAopworkflowRequest, ExportAopworkflowResponse> exportAopworkflowAsyncInvoker(
        ExportAopworkflowRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportAopworkflow, hcClient);
    }

    /**
     * 导出采集解析器
     *
     * 导出采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCollectorParserRequest 请求对象
     * @return CompletableFuture<ExportCollectorParserResponse>
     */
    public CompletableFuture<ExportCollectorParserResponse> exportCollectorParserAsync(
        ExportCollectorParserRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportCollectorParser);
    }

    /**
     * 导出采集解析器
     *
     * 导出采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCollectorParserRequest 请求对象
     * @return AsyncInvoker<ExportCollectorParserRequest, ExportCollectorParserResponse>
     */
    public AsyncInvoker<ExportCollectorParserRequest, ExportCollectorParserResponse> exportCollectorParserAsyncInvoker(
        ExportCollectorParserRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportCollectorParser, hcClient);
    }

    /**
     * 导出数据对象
     *
     * 导出数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataobjectsRequest 请求对象
     * @return CompletableFuture<ExportDataobjectsResponse>
     */
    public CompletableFuture<ExportDataobjectsResponse> exportDataobjectsAsync(ExportDataobjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportDataobjects);
    }

    /**
     * 导出数据对象
     *
     * 导出数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataobjectsRequest 请求对象
     * @return AsyncInvoker<ExportDataobjectsRequest, ExportDataobjectsResponse>
     */
    public AsyncInvoker<ExportDataobjectsRequest, ExportDataobjectsResponse> exportDataobjectsAsyncInvoker(
        ExportDataobjectsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportDataobjects, hcClient);
    }

    /**
     * 导出事件
     *
     * 导出事件列表,若字段是object类型，需要将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIncidentsRequest 请求对象
     * @return CompletableFuture<ExportIncidentsResponse>
     */
    public CompletableFuture<ExportIncidentsResponse> exportIncidentsAsync(ExportIncidentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportIncidents);
    }

    /**
     * 导出事件
     *
     * 导出事件列表,若字段是object类型，需要将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIncidentsRequest 请求对象
     * @return AsyncInvoker<ExportIncidentsRequest, ExportIncidentsResponse>
     */
    public AsyncInvoker<ExportIncidentsRequest, ExportIncidentsResponse> exportIncidentsAsyncInvoker(
        ExportIncidentsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportIncidents, hcClient);
    }

    /**
     * 导出情报
     *
     * 导出情报,若字段是object类型，则将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIndicatorsRequest 请求对象
     * @return CompletableFuture<ExportIndicatorsResponse>
     */
    public CompletableFuture<ExportIndicatorsResponse> exportIndicatorsAsync(ExportIndicatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportIndicators);
    }

    /**
     * 导出情报
     *
     * 导出情报,若字段是object类型，则将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIndicatorsRequest 请求对象
     * @return AsyncInvoker<ExportIndicatorsRequest, ExportIndicatorsResponse>
     */
    public AsyncInvoker<ExportIndicatorsRequest, ExportIndicatorsResponse> exportIndicatorsAsyncInvoker(
        ExportIndicatorsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportIndicators, hcClient);
    }

    /**
     * 导出剧本信息
     *
     * 导出剧本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPlaybookRequest 请求对象
     * @return CompletableFuture<ExportPlaybookResponse>
     */
    public CompletableFuture<ExportPlaybookResponse> exportPlaybookAsync(ExportPlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportPlaybook);
    }

    /**
     * 导出剧本信息
     *
     * 导出剧本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPlaybookRequest 请求对象
     * @return AsyncInvoker<ExportPlaybookRequest, ExportPlaybookResponse>
     */
    public AsyncInvoker<ExportPlaybookRequest, ExportPlaybookResponse> exportPlaybookAsyncInvoker(
        ExportPlaybookRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportPlaybook, hcClient);
    }

    /**
     * 导出资产列表
     *
     * 导出资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportResourcesRequest 请求对象
     * @return CompletableFuture<ExportResourcesResponse>
     */
    public CompletableFuture<ExportResourcesResponse> exportResourcesAsync(ExportResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportResources);
    }

    /**
     * 导出资产列表
     *
     * 导出资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportResourcesRequest 请求对象
     * @return AsyncInvoker<ExportResourcesRequest, ExportResourcesResponse>
     */
    public AsyncInvoker<ExportResourcesRequest, ExportResourcesResponse> exportResourcesAsyncInvoker(
        ExportResourcesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportResources, hcClient);
    }

    /**
     * 导出漏洞
     *
     * 导出详细漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ExportVulnerabilitiesResponse>
     */
    public CompletableFuture<ExportVulnerabilitiesResponse> exportVulnerabilitiesAsync(
        ExportVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.exportVulnerabilities);
    }

    /**
     * 导出漏洞
     *
     * 导出详细漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ExportVulnerabilitiesRequest, ExportVulnerabilitiesResponse>
     */
    public AsyncInvoker<ExportVulnerabilitiesRequest, ExportVulnerabilitiesResponse> exportVulnerabilitiesAsyncInvoker(
        ExportVulnerabilitiesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.exportVulnerabilities, hcClient);
    }

    /**
     * 授权处理
     *
     * 授权处理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleShipperAuthorizationRequest 请求对象
     * @return CompletableFuture<HandleShipperAuthorizationResponse>
     */
    public CompletableFuture<HandleShipperAuthorizationResponse> handleShipperAuthorizationAsync(
        HandleShipperAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.handleShipperAuthorization);
    }

    /**
     * 授权处理
     *
     * 授权处理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleShipperAuthorizationRequest 请求对象
     * @return AsyncInvoker<HandleShipperAuthorizationRequest, HandleShipperAuthorizationResponse>
     */
    public AsyncInvoker<HandleShipperAuthorizationRequest, HandleShipperAuthorizationResponse> handleShipperAuthorizationAsyncInvoker(
        HandleShipperAuthorizationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.handleShipperAuthorization, hcClient);
    }

    /**
     * 导入告警
     *
     * 批量导入告警，根据template下载的模板填写告警，告警的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAlertsRequest 请求对象
     * @return CompletableFuture<ImportAlertsResponse>
     */
    public CompletableFuture<ImportAlertsResponse> importAlertsAsync(ImportAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importAlerts);
    }

    /**
     * 导入告警
     *
     * 批量导入告警，根据template下载的模板填写告警，告警的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAlertsRequest 请求对象
     * @return AsyncInvoker<ImportAlertsRequest, ImportAlertsResponse>
     */
    public AsyncInvoker<ImportAlertsRequest, ImportAlertsResponse> importAlertsAsyncInvoker(
        ImportAlertsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importAlerts, hcClient);
    }

    /**
     * 导入流程信息
     *
     * 导入流程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAopworkflowRequest 请求对象
     * @return CompletableFuture<ImportAopworkflowResponse>
     */
    public CompletableFuture<ImportAopworkflowResponse> importAopworkflowAsync(ImportAopworkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importAopworkflow);
    }

    /**
     * 导入流程信息
     *
     * 导入流程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAopworkflowRequest 请求对象
     * @return AsyncInvoker<ImportAopworkflowRequest, ImportAopworkflowResponse>
     */
    public AsyncInvoker<ImportAopworkflowRequest, ImportAopworkflowResponse> importAopworkflowAsyncInvoker(
        ImportAopworkflowRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importAopworkflow, hcClient);
    }

    /**
     * 导入采集解析器
     *
     * 导入采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCollectorParserRequest 请求对象
     * @return CompletableFuture<ImportCollectorParserResponse>
     */
    public CompletableFuture<ImportCollectorParserResponse> importCollectorParserAsync(
        ImportCollectorParserRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importCollectorParser);
    }

    /**
     * 导入采集解析器
     *
     * 导入采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCollectorParserRequest 请求对象
     * @return AsyncInvoker<ImportCollectorParserRequest, ImportCollectorParserResponse>
     */
    public AsyncInvoker<ImportCollectorParserRequest, ImportCollectorParserResponse> importCollectorParserAsyncInvoker(
        ImportCollectorParserRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importCollectorParser, hcClient);
    }

    /**
     * 导入数据对象
     *
     * 导入数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataobjectsRequest 请求对象
     * @return CompletableFuture<ImportDataobjectsResponse>
     */
    public CompletableFuture<ImportDataobjectsResponse> importDataobjectsAsync(ImportDataobjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importDataobjects);
    }

    /**
     * 导入数据对象
     *
     * 导入数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataobjectsRequest 请求对象
     * @return AsyncInvoker<ImportDataobjectsRequest, ImportDataobjectsResponse>
     */
    public AsyncInvoker<ImportDataobjectsRequest, ImportDataobjectsResponse> importDataobjectsAsyncInvoker(
        ImportDataobjectsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importDataobjects, hcClient);
    }

    /**
     * 导入事件
     *
     * 导入事件，根据template下载的模板填写事件，事件的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIncidentsRequest 请求对象
     * @return CompletableFuture<ImportIncidentsResponse>
     */
    public CompletableFuture<ImportIncidentsResponse> importIncidentsAsync(ImportIncidentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importIncidents);
    }

    /**
     * 导入事件
     *
     * 导入事件，根据template下载的模板填写事件，事件的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIncidentsRequest 请求对象
     * @return AsyncInvoker<ImportIncidentsRequest, ImportIncidentsResponse>
     */
    public AsyncInvoker<ImportIncidentsRequest, ImportIncidentsResponse> importIncidentsAsyncInvoker(
        ImportIncidentsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importIncidents, hcClient);
    }

    /**
     * 导入情报
     *
     * 批量导入情报，根据template下载的模板填写情报，告警的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIndicatorsRequest 请求对象
     * @return CompletableFuture<ImportIndicatorsResponse>
     */
    public CompletableFuture<ImportIndicatorsResponse> importIndicatorsAsync(ImportIndicatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importIndicators);
    }

    /**
     * 导入情报
     *
     * 批量导入情报，根据template下载的模板填写情报，告警的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIndicatorsRequest 请求对象
     * @return AsyncInvoker<ImportIndicatorsRequest, ImportIndicatorsResponse>
     */
    public AsyncInvoker<ImportIndicatorsRequest, ImportIndicatorsResponse> importIndicatorsAsyncInvoker(
        ImportIndicatorsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importIndicators, hcClient);
    }

    /**
     * 导入剧本信息
     *
     * 导入剧本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPlaybookRequest 请求对象
     * @return CompletableFuture<ImportPlaybookResponse>
     */
    public CompletableFuture<ImportPlaybookResponse> importPlaybookAsync(ImportPlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importPlaybook);
    }

    /**
     * 导入剧本信息
     *
     * 导入剧本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPlaybookRequest 请求对象
     * @return AsyncInvoker<ImportPlaybookRequest, ImportPlaybookResponse>
     */
    public AsyncInvoker<ImportPlaybookRequest, ImportPlaybookResponse> importPlaybookAsyncInvoker(
        ImportPlaybookRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importPlaybook, hcClient);
    }

    /**
     * 导入资产
     *
     * 导入资产，根据下载的模板填写资产，资产的所有字段根据是否必填来限制，参照:资产对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportResourceRequest 请求对象
     * @return CompletableFuture<ImportResourceResponse>
     */
    public CompletableFuture<ImportResourceResponse> importResourceAsync(ImportResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importResource);
    }

    /**
     * 导入资产
     *
     * 导入资产，根据下载的模板填写资产，资产的所有字段根据是否必填来限制，参照:资产对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportResourceRequest 请求对象
     * @return AsyncInvoker<ImportResourceRequest, ImportResourceResponse>
     */
    public AsyncInvoker<ImportResourceRequest, ImportResourceResponse> importResourceAsyncInvoker(
        ImportResourceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importResource, hcClient);
    }

    /**
     * 导入漏洞
     *
     * 批量导入漏洞，根据template下载的模板填写漏洞，漏洞的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ImportVulnerabilitiesResponse>
     */
    public CompletableFuture<ImportVulnerabilitiesResponse> importVulnerabilitiesAsync(
        ImportVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.importVulnerabilities);
    }

    /**
     * 导入漏洞
     *
     * 批量导入漏洞，根据template下载的模板填写漏洞，漏洞的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ImportVulnerabilitiesRequest, ImportVulnerabilitiesResponse>
     */
    public AsyncInvoker<ImportVulnerabilitiesRequest, ImportVulnerabilitiesResponse> importVulnerabilitiesAsyncInvoker(
        ImportVulnerabilitiesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.importVulnerabilities, hcClient);
    }

    /**
     * 告警规则总览
     *
     * 告警规则总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return CompletableFuture<ListAlertRuleMetricsResponse>
     */
    public CompletableFuture<ListAlertRuleMetricsResponse> listAlertRuleMetricsAsync(
        ListAlertRuleMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRuleMetrics);
    }

    /**
     * 告警规则总览
     *
     * 告警规则总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>
     */
    public AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetricsAsyncInvoker(
        ListAlertRuleMetricsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlertRuleMetrics, hcClient);
    }

    /**
     * 告警模板总览
     *
     * 告警模板总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplateMetricsRequest 请求对象
     * @return CompletableFuture<ListAlertRuleTemplateMetricsResponse>
     */
    public CompletableFuture<ListAlertRuleTemplateMetricsResponse> listAlertRuleTemplateMetricsAsync(
        ListAlertRuleTemplateMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplateMetrics);
    }

    /**
     * 告警模板总览
     *
     * 告警模板总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplateMetricsRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse>
     */
    public AsyncInvoker<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> listAlertRuleTemplateMetricsAsyncInvoker(
        ListAlertRuleTemplateMetricsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlertRuleTemplateMetrics, hcClient);
    }

    /**
     * 列出告警规则模板
     *
     * 列出告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return CompletableFuture<ListAlertRuleTemplatesResponse>
     */
    public CompletableFuture<ListAlertRuleTemplatesResponse> listAlertRuleTemplatesAsync(
        ListAlertRuleTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplates);
    }

    /**
     * 列出告警规则模板
     *
     * 列出告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>
     */
    public AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplatesAsyncInvoker(
        ListAlertRuleTemplatesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlertRuleTemplates, hcClient);
    }

    /**
     * 列出告警规则
     *
     * 列出告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return CompletableFuture<ListAlertRulesResponse>
     */
    public CompletableFuture<ListAlertRulesResponse> listAlertRulesAsync(ListAlertRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRules);
    }

    /**
     * 列出告警规则
     *
     * 列出告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>
     */
    public AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRulesAsyncInvoker(
        ListAlertRulesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlertRules, hcClient);
    }

    /**
     * 搜索告警列表
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertsRequest 请求对象
     * @return CompletableFuture<ListAlertsResponse>
     */
    public CompletableFuture<ListAlertsResponse> listAlertsAsync(ListAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlerts);
    }

    /**
     * 搜索告警列表
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertsRequest 请求对象
     * @return AsyncInvoker<ListAlertsRequest, ListAlertsResponse>
     */
    public AsyncInvoker<ListAlertsRequest, ListAlertsResponse> listAlertsAsyncInvoker(ListAlertsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlerts, hcClient);
    }

    /**
     * 获取目录全量列表
     *
     * 获取目录全量列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllSecondCatalogueRequest 请求对象
     * @return CompletableFuture<ListAllSecondCatalogueResponse>
     */
    public CompletableFuture<ListAllSecondCatalogueResponse> listAllSecondCatalogueAsync(
        ListAllSecondCatalogueRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAllSecondCatalogue);
    }

    /**
     * 获取目录全量列表
     *
     * 获取目录全量列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllSecondCatalogueRequest 请求对象
     * @return AsyncInvoker<ListAllSecondCatalogueRequest, ListAllSecondCatalogueResponse>
     */
    public AsyncInvoker<ListAllSecondCatalogueRequest, ListAllSecondCatalogueResponse> listAllSecondCatalogueAsyncInvoker(
        ListAllSecondCatalogueRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAllSecondCatalogue, hcClient);
    }

    /**
     * 查询流程实例的列表
     *
     * 查询流程实例的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAopWorkflowInstanceRequest 请求对象
     * @return CompletableFuture<ListAopWorkflowInstanceResponse>
     */
    public CompletableFuture<ListAopWorkflowInstanceResponse> listAopWorkflowInstanceAsync(
        ListAopWorkflowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAopWorkflowInstance);
    }

    /**
     * 查询流程实例的列表
     *
     * 查询流程实例的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAopWorkflowInstanceRequest 请求对象
     * @return AsyncInvoker<ListAopWorkflowInstanceRequest, ListAopWorkflowInstanceResponse>
     */
    public AsyncInvoker<ListAopWorkflowInstanceRequest, ListAopWorkflowInstanceResponse> listAopWorkflowInstanceAsyncInvoker(
        ListAopWorkflowInstanceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAopWorkflowInstance, hcClient);
    }

    /**
     * 查询流程版本列表
     *
     * 查询流程版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAopWorkflowVersionsRequest 请求对象
     * @return CompletableFuture<ListAopWorkflowVersionsResponse>
     */
    public CompletableFuture<ListAopWorkflowVersionsResponse> listAopWorkflowVersionsAsync(
        ListAopWorkflowVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAopWorkflowVersions);
    }

    /**
     * 查询流程版本列表
     *
     * 查询流程版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAopWorkflowVersionsRequest 请求对象
     * @return AsyncInvoker<ListAopWorkflowVersionsRequest, ListAopWorkflowVersionsResponse>
     */
    public AsyncInvoker<ListAopWorkflowVersionsRequest, ListAopWorkflowVersionsResponse> listAopWorkflowVersionsAsyncInvoker(
        ListAopWorkflowVersionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAopWorkflowVersions, hcClient);
    }

    /**
     * 目录列表查询
     *
     * 目录列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogueRequest 请求对象
     * @return CompletableFuture<ListCatalogueResponse>
     */
    public CompletableFuture<ListCatalogueResponse> listCatalogueAsync(ListCatalogueRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCatalogue);
    }

    /**
     * 目录列表查询
     *
     * 目录列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogueRequest 请求对象
     * @return AsyncInvoker<ListCatalogueRequest, ListCatalogueResponse>
     */
    public AsyncInvoker<ListCatalogueRequest, ListCatalogueResponse> listCatalogueAsyncInvoker(
        ListCatalogueRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCatalogue, hcClient);
    }

    /**
     * 列出管道alias
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogAliasRequest 请求对象
     * @return CompletableFuture<ListCloudLogAliasResponse>
     */
    public CompletableFuture<ListCloudLogAliasResponse> listCloudLogAliasAsync(ListCloudLogAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCloudLogAlias);
    }

    /**
     * 列出管道alias
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogAliasRequest 请求对象
     * @return AsyncInvoker<ListCloudLogAliasRequest, ListCloudLogAliasResponse>
     */
    public AsyncInvoker<ListCloudLogAliasRequest, ListCloudLogAliasResponse> listCloudLogAliasAsyncInvoker(
        ListCloudLogAliasRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCloudLogAlias, hcClient);
    }

    /**
     * 列出行管账户信息
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogManagesRequest 请求对象
     * @return CompletableFuture<ListCloudLogManagesResponse>
     */
    public CompletableFuture<ListCloudLogManagesResponse> listCloudLogManagesAsync(ListCloudLogManagesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCloudLogManages);
    }

    /**
     * 列出行管账户信息
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogManagesRequest 请求对象
     * @return AsyncInvoker<ListCloudLogManagesRequest, ListCloudLogManagesResponse>
     */
    public AsyncInvoker<ListCloudLogManagesRequest, ListCloudLogManagesResponse> listCloudLogManagesAsyncInvoker(
        ListCloudLogManagesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCloudLogManages, hcClient);
    }

    /**
     * 列出平台行管账户信息
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogPlatformRequest 请求对象
     * @return CompletableFuture<ListCloudLogPlatformResponse>
     */
    public CompletableFuture<ListCloudLogPlatformResponse> listCloudLogPlatformAsync(
        ListCloudLogPlatformRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCloudLogPlatform);
    }

    /**
     * 列出平台行管账户信息
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogPlatformRequest 请求对象
     * @return AsyncInvoker<ListCloudLogPlatformRequest, ListCloudLogPlatformResponse>
     */
    public AsyncInvoker<ListCloudLogPlatformRequest, ListCloudLogPlatformResponse> listCloudLogPlatformAsyncInvoker(
        ListCloudLogPlatformRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCloudLogPlatform, hcClient);
    }

    /**
     * 列出云日志资源
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogResourcesRequest 请求对象
     * @return CompletableFuture<ListCloudLogResourcesResponse>
     */
    public CompletableFuture<ListCloudLogResourcesResponse> listCloudLogResourcesAsync(
        ListCloudLogResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCloudLogResources);
    }

    /**
     * 列出云日志资源
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogResourcesRequest 请求对象
     * @return AsyncInvoker<ListCloudLogResourcesRequest, ListCloudLogResourcesResponse>
     */
    public AsyncInvoker<ListCloudLogResourcesRequest, ListCloudLogResourcesResponse> listCloudLogResourcesAsyncInvoker(
        ListCloudLogResourcesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCloudLogResources, hcClient);
    }

    /**
     * 获取云服务采集配置
     *
     * 获取云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectConfigRequest 请求对象
     * @return CompletableFuture<ListCollectConfigResponse>
     */
    public CompletableFuture<ListCollectConfigResponse> listCollectConfigAsync(ListCollectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectConfig);
    }

    /**
     * 获取云服务采集配置
     *
     * 获取云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectConfigRequest 请求对象
     * @return AsyncInvoker<ListCollectConfigRequest, ListCollectConfigResponse>
     */
    public AsyncInvoker<ListCollectConfigRequest, ListCollectConfigResponse> listCollectConfigAsyncInvoker(
        ListCollectConfigRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectConfig, hcClient);
    }

    /**
     * 列出采集通道分组
     *
     * 列出采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorChannelGroupRequest 请求对象
     * @return CompletableFuture<ListCollectorChannelGroupResponse>
     */
    public CompletableFuture<ListCollectorChannelGroupResponse> listCollectorChannelGroupAsync(
        ListCollectorChannelGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorChannelGroup);
    }

    /**
     * 列出采集通道分组
     *
     * 列出采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorChannelGroupRequest 请求对象
     * @return AsyncInvoker<ListCollectorChannelGroupRequest, ListCollectorChannelGroupResponse>
     */
    public AsyncInvoker<ListCollectorChannelGroupRequest, ListCollectorChannelGroupResponse> listCollectorChannelGroupAsyncInvoker(
        ListCollectorChannelGroupRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorChannelGroup, hcClient);
    }

    /**
     * 列出采集通道列表
     *
     * 列出采集通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorChannelsRequest 请求对象
     * @return CompletableFuture<ListCollectorChannelsResponse>
     */
    public CompletableFuture<ListCollectorChannelsResponse> listCollectorChannelsAsync(
        ListCollectorChannelsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorChannels);
    }

    /**
     * 列出采集通道列表
     *
     * 列出采集通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorChannelsRequest 请求对象
     * @return AsyncInvoker<ListCollectorChannelsRequest, ListCollectorChannelsResponse>
     */
    public AsyncInvoker<ListCollectorChannelsRequest, ListCollectorChannelsResponse> listCollectorChannelsAsyncInvoker(
        ListCollectorChannelsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorChannels, hcClient);
    }

    /**
     * 列表采集连接
     *
     * 列表采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorConnectionsRequest 请求对象
     * @return CompletableFuture<ListCollectorConnectionsResponse>
     */
    public CompletableFuture<ListCollectorConnectionsResponse> listCollectorConnectionsAsync(
        ListCollectorConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorConnections);
    }

    /**
     * 列表采集连接
     *
     * 列表采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorConnectionsRequest 请求对象
     * @return AsyncInvoker<ListCollectorConnectionsRequest, ListCollectorConnectionsResponse>
     */
    public AsyncInvoker<ListCollectorConnectionsRequest, ListCollectorConnectionsResponse> listCollectorConnectionsAsyncInvoker(
        ListCollectorConnectionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorConnections, hcClient);
    }

    /**
     * 列出采集通道实例
     *
     * 列出采集通道实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorInstancesRequest 请求对象
     * @return CompletableFuture<ListCollectorInstancesResponse>
     */
    public CompletableFuture<ListCollectorInstancesResponse> listCollectorInstancesAsync(
        ListCollectorInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorInstances);
    }

    /**
     * 列出采集通道实例
     *
     * 列出采集通道实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorInstancesRequest 请求对象
     * @return AsyncInvoker<ListCollectorInstancesRequest, ListCollectorInstancesResponse>
     */
    public AsyncInvoker<ListCollectorInstancesRequest, ListCollectorInstancesResponse> listCollectorInstancesAsyncInvoker(
        ListCollectorInstancesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorInstances, hcClient);
    }

    /**
     * 列出采集模块规则
     *
     * 列出采集模块规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorModuleRestrictionsRequest 请求对象
     * @return CompletableFuture<ListCollectorModuleRestrictionsResponse>
     */
    public CompletableFuture<ListCollectorModuleRestrictionsResponse> listCollectorModuleRestrictionsAsync(
        ListCollectorModuleRestrictionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorModuleRestrictions);
    }

    /**
     * 列出采集模块规则
     *
     * 列出采集模块规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorModuleRestrictionsRequest 请求对象
     * @return AsyncInvoker<ListCollectorModuleRestrictionsRequest, ListCollectorModuleRestrictionsResponse>
     */
    public AsyncInvoker<ListCollectorModuleRestrictionsRequest, ListCollectorModuleRestrictionsResponse> listCollectorModuleRestrictionsAsyncInvoker(
        ListCollectorModuleRestrictionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorModuleRestrictions, hcClient);
    }

    /**
     * 列出采集模块
     *
     * 列出采集模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorModuleTemplateRequest 请求对象
     * @return CompletableFuture<ListCollectorModuleTemplateResponse>
     */
    public CompletableFuture<ListCollectorModuleTemplateResponse> listCollectorModuleTemplateAsync(
        ListCollectorModuleTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorModuleTemplate);
    }

    /**
     * 列出采集模块
     *
     * 列出采集模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorModuleTemplateRequest 请求对象
     * @return AsyncInvoker<ListCollectorModuleTemplateRequest, ListCollectorModuleTemplateResponse>
     */
    public AsyncInvoker<ListCollectorModuleTemplateRequest, ListCollectorModuleTemplateResponse> listCollectorModuleTemplateAsyncInvoker(
        ListCollectorModuleTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorModuleTemplate, hcClient);
    }

    /**
     * 列出采集节点
     *
     * 列出采集节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorNodeRequest 请求对象
     * @return CompletableFuture<ListCollectorNodeResponse>
     */
    public CompletableFuture<ListCollectorNodeResponse> listCollectorNodeAsync(ListCollectorNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorNode);
    }

    /**
     * 列出采集节点
     *
     * 列出采集节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorNodeRequest 请求对象
     * @return AsyncInvoker<ListCollectorNodeRequest, ListCollectorNodeResponse>
     */
    public AsyncInvoker<ListCollectorNodeRequest, ListCollectorNodeResponse> listCollectorNodeAsyncInvoker(
        ListCollectorNodeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorNode, hcClient);
    }

    /**
     * 列出采集解析器模板
     *
     * 列出采集解析器模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorParserTemplateRequest 请求对象
     * @return CompletableFuture<ListCollectorParserTemplateResponse>
     */
    public CompletableFuture<ListCollectorParserTemplateResponse> listCollectorParserTemplateAsync(
        ListCollectorParserTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorParserTemplate);
    }

    /**
     * 列出采集解析器模板
     *
     * 列出采集解析器模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorParserTemplateRequest 请求对象
     * @return AsyncInvoker<ListCollectorParserTemplateRequest, ListCollectorParserTemplateResponse>
     */
    public AsyncInvoker<ListCollectorParserTemplateRequest, ListCollectorParserTemplateResponse> listCollectorParserTemplateAsyncInvoker(
        ListCollectorParserTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorParserTemplate, hcClient);
    }

    /**
     * 列出采集解析器
     *
     * 列出采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorParsersRequest 请求对象
     * @return CompletableFuture<ListCollectorParsersResponse>
     */
    public CompletableFuture<ListCollectorParsersResponse> listCollectorParsersAsync(
        ListCollectorParsersRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectorParsers);
    }

    /**
     * 列出采集解析器
     *
     * 列出采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorParsersRequest 请求对象
     * @return AsyncInvoker<ListCollectorParsersRequest, ListCollectorParsersResponse>
     */
    public AsyncInvoker<ListCollectorParsersRequest, ListCollectorParsersResponse> listCollectorParsersAsyncInvoker(
        ListCollectorParsersRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectorParsers, hcClient);
    }

    /**
     * 查询插件Action列表
     *
     * 查询插件的函数、连接器和管理器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentActionsRequest 请求对象
     * @return CompletableFuture<ListComponentActionsResponse>
     */
    public CompletableFuture<ListComponentActionsResponse> listComponentActionsAsync(
        ListComponentActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listComponentActions);
    }

    /**
     * 查询插件Action列表
     *
     * 查询插件的函数、连接器和管理器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentActionsRequest 请求对象
     * @return AsyncInvoker<ListComponentActionsRequest, ListComponentActionsResponse>
     */
    public AsyncInvoker<ListComponentActionsRequest, ListComponentActionsResponse> listComponentActionsAsyncInvoker(
        ListComponentActionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listComponentActions, hcClient);
    }

    /**
     * 列出组件配置
     *
     * 列出组件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentConfigurationRequest 请求对象
     * @return CompletableFuture<ListComponentConfigurationResponse>
     */
    public CompletableFuture<ListComponentConfigurationResponse> listComponentConfigurationAsync(
        ListComponentConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listComponentConfiguration);
    }

    /**
     * 列出组件配置
     *
     * 列出组件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentConfigurationRequest 请求对象
     * @return AsyncInvoker<ListComponentConfigurationRequest, ListComponentConfigurationResponse>
     */
    public AsyncInvoker<ListComponentConfigurationRequest, ListComponentConfigurationResponse> listComponentConfigurationAsyncInvoker(
        ListComponentConfigurationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listComponentConfiguration, hcClient);
    }

    /**
     * 列出组件模板
     *
     * 列出组件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentTemplateRequest 请求对象
     * @return CompletableFuture<ListComponentTemplateResponse>
     */
    public CompletableFuture<ListComponentTemplateResponse> listComponentTemplateAsync(
        ListComponentTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listComponentTemplate);
    }

    /**
     * 列出组件模板
     *
     * 列出组件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentTemplateRequest 请求对象
     * @return AsyncInvoker<ListComponentTemplateRequest, ListComponentTemplateResponse>
     */
    public AsyncInvoker<ListComponentTemplateRequest, ListComponentTemplateResponse> listComponentTemplateAsyncInvoker(
        ListComponentTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listComponentTemplate, hcClient);
    }

    /**
     * 查询插件配置模板列表
     *
     * 查询在配置流程时的插件配置模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentTemplatesRequest 请求对象
     * @return CompletableFuture<ListComponentTemplatesResponse>
     */
    public CompletableFuture<ListComponentTemplatesResponse> listComponentTemplatesAsync(
        ListComponentTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listComponentTemplates);
    }

    /**
     * 查询插件配置模板列表
     *
     * 查询在配置流程时的插件配置模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentTemplatesRequest 请求对象
     * @return AsyncInvoker<ListComponentTemplatesRequest, ListComponentTemplatesResponse>
     */
    public AsyncInvoker<ListComponentTemplatesRequest, ListComponentTemplatesResponse> listComponentTemplatesAsyncInvoker(
        ListComponentTemplatesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listComponentTemplates, hcClient);
    }

    /**
     * 查询插件定义列表
     *
     * 查询插件定义列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentsRequest 请求对象
     * @return CompletableFuture<ListComponentsResponse>
     */
    public CompletableFuture<ListComponentsResponse> listComponentsAsync(ListComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listComponents);
    }

    /**
     * 查询插件定义列表
     *
     * 查询插件定义列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentsRequest 请求对象
     * @return AsyncInvoker<ListComponentsRequest, ListComponentsResponse>
     */
    public AsyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsAsyncInvoker(
        ListComponentsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listComponents, hcClient);
    }

    /**
     * 获取字典信息
     *
     * 获取字典信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationDictionariesRequest 请求对象
     * @return CompletableFuture<ListConfigurationDictionariesResponse>
     */
    public CompletableFuture<ListConfigurationDictionariesResponse> listConfigurationDictionariesAsync(
        ListConfigurationDictionariesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listConfigurationDictionaries);
    }

    /**
     * 获取字典信息
     *
     * 获取字典信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationDictionariesRequest 请求对象
     * @return AsyncInvoker<ListConfigurationDictionariesRequest, ListConfigurationDictionariesResponse>
     */
    public AsyncInvoker<ListConfigurationDictionariesRequest, ListConfigurationDictionariesResponse> listConfigurationDictionariesAsyncInvoker(
        ListConfigurationDictionariesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listConfigurationDictionaries, hcClient);
    }

    /**
     * 操作连接列表查询接口
     *
     * 操作连接列表查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listConnections);
    }

    /**
     * 操作连接列表查询接口
     *
     * 操作连接列表查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listConnections, hcClient);
    }

    /**
     * 查询数据类列表
     *
     * 查询数据类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataclassRequest 请求对象
     * @return CompletableFuture<ListDataclassResponse>
     */
    public CompletableFuture<ListDataclassResponse> listDataclassAsync(ListDataclassRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDataclass);
    }

    /**
     * 查询数据类列表
     *
     * 查询数据类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataclassRequest 请求对象
     * @return AsyncInvoker<ListDataclassRequest, ListDataclassResponse>
     */
    public AsyncInvoker<ListDataclassRequest, ListDataclassResponse> listDataclassAsyncInvoker(
        ListDataclassRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDataclass, hcClient);
    }

    /**
     * 查询字段列表
     *
     * 查询字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataclassFieldsRequest 请求对象
     * @return CompletableFuture<ListDataclassFieldsResponse>
     */
    public CompletableFuture<ListDataclassFieldsResponse> listDataclassFieldsAsync(ListDataclassFieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDataclassFields);
    }

    /**
     * 查询字段列表
     *
     * 查询字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataclassFieldsRequest 请求对象
     * @return AsyncInvoker<ListDataclassFieldsRequest, ListDataclassFieldsResponse>
     */
    public AsyncInvoker<ListDataclassFieldsRequest, ListDataclassFieldsResponse> listDataclassFieldsAsyncInvoker(
        ListDataclassFieldsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDataclassFields, hcClient);
    }

    /**
     * 查询关联数据对象列表
     *
     * 查询关联数据对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectRelationsRequest 请求对象
     * @return CompletableFuture<ListDataobjectRelationsResponse>
     */
    public CompletableFuture<ListDataobjectRelationsResponse> listDataobjectRelationsAsync(
        ListDataobjectRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDataobjectRelations);
    }

    /**
     * 查询关联数据对象列表
     *
     * 查询关联数据对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectRelationsRequest 请求对象
     * @return AsyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse>
     */
    public AsyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> listDataobjectRelationsAsyncInvoker(
        ListDataobjectRelationsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDataobjectRelations, hcClient);
    }

    /**
     * 列出所有数据对象
     *
     * 列出所有数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectsRequest 请求对象
     * @return CompletableFuture<ListDataobjectsResponse>
     */
    public CompletableFuture<ListDataobjectsResponse> listDataobjectsAsync(ListDataobjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDataobjects);
    }

    /**
     * 列出所有数据对象
     *
     * 列出所有数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectsRequest 请求对象
     * @return AsyncInvoker<ListDataobjectsRequest, ListDataobjectsResponse>
     */
    public AsyncInvoker<ListDataobjectsRequest, ListDataobjectsResponse> listDataobjectsAsyncInvoker(
        ListDataobjectsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDataobjects, hcClient);
    }

    /**
     * 查询数据对象列表
     *
     * 数据面查询数据类纳管的数据对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatapanelObjectsRequest 请求对象
     * @return CompletableFuture<ListDatapanelObjectsResponse>
     */
    public CompletableFuture<ListDatapanelObjectsResponse> listDatapanelObjectsAsync(
        ListDatapanelObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDatapanelObjects);
    }

    /**
     * 查询数据对象列表
     *
     * 数据面查询数据类纳管的数据对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatapanelObjectsRequest 请求对象
     * @return AsyncInvoker<ListDatapanelObjectsRequest, ListDatapanelObjectsResponse>
     */
    public AsyncInvoker<ListDatapanelObjectsRequest, ListDatapanelObjectsResponse> listDatapanelObjectsAsyncInvoker(
        ListDatapanelObjectsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDatapanelObjects, hcClient);
    }

    /**
     * 获取数据空间列表
     *
     * 获取数据空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataspacesRequest 请求对象
     * @return CompletableFuture<ListDataspacesResponse>
     */
    public CompletableFuture<ListDataspacesResponse> listDataspacesAsync(ListDataspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDataspaces);
    }

    /**
     * 获取数据空间列表
     *
     * 获取数据空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataspacesRequest 请求对象
     * @return AsyncInvoker<ListDataspacesRequest, ListDataspacesResponse>
     */
    public AsyncInvoker<ListDataspacesRequest, ListDataspacesResponse> listDataspacesAsyncInvoker(
        ListDataspacesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDataspaces, hcClient);
    }

    /**
     * 获取组件历史版本的配置数据
     *
     * 获取组件历史版本的配置数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryComponentConfigurationRequest 请求对象
     * @return CompletableFuture<ListHistoryComponentConfigurationResponse>
     */
    public CompletableFuture<ListHistoryComponentConfigurationResponse> listHistoryComponentConfigurationAsync(
        ListHistoryComponentConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listHistoryComponentConfiguration);
    }

    /**
     * 获取组件历史版本的配置数据
     *
     * 获取组件历史版本的配置数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryComponentConfigurationRequest 请求对象
     * @return AsyncInvoker<ListHistoryComponentConfigurationRequest, ListHistoryComponentConfigurationResponse>
     */
    public AsyncInvoker<ListHistoryComponentConfigurationRequest, ListHistoryComponentConfigurationResponse> listHistoryComponentConfigurationAsyncInvoker(
        ListHistoryComponentConfigurationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listHistoryComponentConfiguration, hcClient);
    }

    /**
     * 搜索事件列表
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return CompletableFuture<ListIncidentsResponse>
     */
    public CompletableFuture<ListIncidentsResponse> listIncidentsAsync(ListIncidentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listIncidents);
    }

    /**
     * 搜索事件列表
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse>
     */
    public AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse> listIncidentsAsyncInvoker(
        ListIncidentsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listIncidents, hcClient);
    }

    /**
     * 查询威胁情报列表
     *
     * 查询威胁情报列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIndicatorsRequest 请求对象
     * @return CompletableFuture<ListIndicatorsResponse>
     */
    public CompletableFuture<ListIndicatorsResponse> listIndicatorsAsync(ListIndicatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listIndicators);
    }

    /**
     * 查询威胁情报列表
     *
     * 查询威胁情报列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIndicatorsRequest 请求对象
     * @return AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>
     */
    public AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse> listIndicatorsAsyncInvoker(
        ListIndicatorsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listIndicators, hcClient);
    }

    /**
     * 查询安装脚本列表
     *
     * 查询安装脚本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstallationRequest 请求对象
     * @return CompletableFuture<ListInstallationResponse>
     */
    public CompletableFuture<ListInstallationResponse> listInstallationAsync(ListInstallationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listInstallation);
    }

    /**
     * 查询安装脚本列表
     *
     * 查询安装脚本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstallationRequest 请求对象
     * @return AsyncInvoker<ListInstallationRequest, ListInstallationResponse>
     */
    public AsyncInvoker<ListInstallationRequest, ListInstallationResponse> listInstallationAsyncInvoker(
        ListInstallationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listInstallation, hcClient);
    }

    /**
     * 列出组件
     *
     * 列出组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIsapComponentsRequest 请求对象
     * @return CompletableFuture<ListIsapComponentsResponse>
     */
    public CompletableFuture<ListIsapComponentsResponse> listIsapComponentsAsync(ListIsapComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listIsapComponents);
    }

    /**
     * 列出组件
     *
     * 列出组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIsapComponentsRequest 请求对象
     * @return AsyncInvoker<ListIsapComponentsRequest, ListIsapComponentsResponse>
     */
    public AsyncInvoker<ListIsapComponentsRequest, ListIsapComponentsResponse> listIsapComponentsAsyncInvoker(
        ListIsapComponentsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listIsapComponents, hcClient);
    }

    /**
     * 查询布局列表
     *
     * 查询布局列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutRequest 请求对象
     * @return CompletableFuture<ListLayoutResponse>
     */
    public CompletableFuture<ListLayoutResponse> listLayoutAsync(ListLayoutRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listLayout);
    }

    /**
     * 查询布局列表
     *
     * 查询布局列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutRequest 请求对象
     * @return AsyncInvoker<ListLayoutRequest, ListLayoutResponse>
     */
    public AsyncInvoker<ListLayoutRequest, ListLayoutResponse> listLayoutAsyncInvoker(ListLayoutRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listLayout, hcClient);
    }

    /**
     * 查询布局页面列表
     *
     * 查询所有页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutWizardsRequest 请求对象
     * @return CompletableFuture<ListLayoutWizardsResponse>
     */
    public CompletableFuture<ListLayoutWizardsResponse> listLayoutWizardsAsync(ListLayoutWizardsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listLayoutWizards);
    }

    /**
     * 查询布局页面列表
     *
     * 查询所有页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutWizardsRequest 请求对象
     * @return AsyncInvoker<ListLayoutWizardsRequest, ListLayoutWizardsResponse>
     */
    public AsyncInvoker<ListLayoutWizardsRequest, ListLayoutWizardsResponse> listLayoutWizardsAsyncInvoker(
        ListLayoutWizardsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listLayoutWizards, hcClient);
    }

    /**
     * 获取指标列表
     *
     * 获取指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return CompletableFuture<ListMetricsResponse>
     */
    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listMetrics);
    }

    /**
     * 获取指标列表
     *
     * 获取指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return AsyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public AsyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsAsyncInvoker(ListMetricsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listMetrics, hcClient);
    }

    /**
     * 查询模块列表
     *
     * 查询所有模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModulesRequest 请求对象
     * @return CompletableFuture<ListModulesResponse>
     */
    public CompletableFuture<ListModulesResponse> listModulesAsync(ListModulesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listModules);
    }

    /**
     * 查询模块列表
     *
     * 查询所有模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModulesRequest 请求对象
     * @return AsyncInvoker<ListModulesRequest, ListModulesResponse>
     */
    public AsyncInvoker<ListModulesRequest, ListModulesResponse> listModulesAsyncInvoker(ListModulesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listModules, hcClient);
    }

    /**
     * 通过节点id查询组件信息
     *
     * 查询节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return CompletableFuture<ListNodesResponse>
     */
    public CompletableFuture<ListNodesResponse> listNodesAsync(ListNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listNodes);
    }

    /**
     * 通过节点id查询组件信息
     *
     * 查询节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return AsyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public AsyncInvoker<ListNodesRequest, ListNodesResponse> listNodesAsyncInvoker(ListNodesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listNodes, hcClient);
    }

    /**
     * 搜索评论列表
     *
     * 搜索评论列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotesRequest 请求对象
     * @return CompletableFuture<ListNotesResponse>
     */
    public CompletableFuture<ListNotesResponse> listNotesAsync(ListNotesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listNotes);
    }

    /**
     * 搜索评论列表
     *
     * 搜索评论列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotesRequest 请求对象
     * @return AsyncInvoker<ListNotesRequest, ListNotesResponse>
     */
    public AsyncInvoker<ListNotesRequest, ListNotesResponse> listNotesAsyncInvoker(ListNotesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listNotes, hcClient);
    }

    /**
     * 获取数据管道列表
     *
     * 获取数据管道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipesRequest 请求对象
     * @return CompletableFuture<ListPipesResponse>
     */
    public CompletableFuture<ListPipesResponse> listPipesAsync(ListPipesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPipes);
    }

    /**
     * 获取数据管道列表
     *
     * 获取数据管道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipesRequest 请求对象
     * @return AsyncInvoker<ListPipesRequest, ListPipesResponse>
     */
    public AsyncInvoker<ListPipesRequest, ListPipesResponse> listPipesAsyncInvoker(ListPipesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listPipes, hcClient);
    }

    /**
     * 查询剧本动作
     *
     * 查询剧本动作列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookActionsRequest 请求对象
     * @return CompletableFuture<ListPlaybookActionsResponse>
     */
    public CompletableFuture<ListPlaybookActionsResponse> listPlaybookActionsAsync(ListPlaybookActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookActions);
    }

    /**
     * 查询剧本动作
     *
     * 查询剧本动作列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookActionsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>
     */
    public AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActionsAsyncInvoker(
        ListPlaybookActionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listPlaybookActions, hcClient);
    }

    /**
     * 查询剧本审核结果
     *
     * 查询剧本审核结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookApprovesRequest 请求对象
     * @return CompletableFuture<ListPlaybookApprovesResponse>
     */
    public CompletableFuture<ListPlaybookApprovesResponse> listPlaybookApprovesAsync(
        ListPlaybookApprovesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookApproves);
    }

    /**
     * 查询剧本审核结果
     *
     * 查询剧本审核结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookApprovesRequest 请求对象
     * @return AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>
     */
    public AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApprovesAsyncInvoker(
        ListPlaybookApprovesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listPlaybookApproves, hcClient);
    }

    /**
     * 查询剧本实例审计日志
     *
     * 查询剧本实例审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookAuditLogsRequest 请求对象
     * @return CompletableFuture<ListPlaybookAuditLogsResponse>
     */
    public CompletableFuture<ListPlaybookAuditLogsResponse> listPlaybookAuditLogsAsync(
        ListPlaybookAuditLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookAuditLogs);
    }

    /**
     * 查询剧本实例审计日志
     *
     * 查询剧本实例审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookAuditLogsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>
     */
    public AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogsAsyncInvoker(
        ListPlaybookAuditLogsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listPlaybookAuditLogs, hcClient);
    }

    /**
     * 查询剧本实例列表
     *
     * 查询剧本实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookInstancesRequest 请求对象
     * @return CompletableFuture<ListPlaybookInstancesResponse>
     */
    public CompletableFuture<ListPlaybookInstancesResponse> listPlaybookInstancesAsync(
        ListPlaybookInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookInstances);
    }

    /**
     * 查询剧本实例列表
     *
     * 查询剧本实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookInstancesRequest 请求对象
     * @return AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>
     */
    public AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstancesAsyncInvoker(
        ListPlaybookInstancesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listPlaybookInstances, hcClient);
    }

    /**
     * 查询剧本版本列表
     *
     * 查询剧本版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookVersionsRequest 请求对象
     * @return CompletableFuture<ListPlaybookVersionsResponse>
     */
    public CompletableFuture<ListPlaybookVersionsResponse> listPlaybookVersionsAsync(
        ListPlaybookVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookVersions);
    }

    /**
     * 查询剧本版本列表
     *
     * 查询剧本版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookVersionsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>
     */
    public AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersionsAsyncInvoker(
        ListPlaybookVersionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listPlaybookVersions, hcClient);
    }

    /**
     * 查询剧本列表
     *
     * 查询剧本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybooksRequest 请求对象
     * @return CompletableFuture<ListPlaybooksResponse>
     */
    public CompletableFuture<ListPlaybooksResponse> listPlaybooksAsync(ListPlaybooksRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybooks);
    }

    /**
     * 查询剧本列表
     *
     * 查询剧本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybooksRequest 请求对象
     * @return AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>
     */
    public AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooksAsyncInvoker(
        ListPlaybooksRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listPlaybooks, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 标签管理服务需要能够列出当前租户全部已使用的资源标签集合，为各服务Console打资源标签和过滤实例时提供标签联想功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagRequest 请求对象
     * @return CompletableFuture<ListProjectTagResponse>
     */
    public CompletableFuture<ListProjectTagResponse> listProjectTagAsync(ListProjectTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listProjectTag);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 标签管理服务需要能够列出当前租户全部已使用的资源标签集合，为各服务Console打资源标签和过滤实例时提供标签联想功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagRequest 请求对象
     * @return AsyncInvoker<ListProjectTagRequest, ListProjectTagResponse>
     */
    public AsyncInvoker<ListProjectTagRequest, ListProjectTagResponse> listProjectTagAsyncInvoker(
        ListProjectTagRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listProjectTag, hcClient);
    }

    /**
     * 查询收件人状态
     *
     * 查询收件人状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecipientsStatusRequest 请求对象
     * @return CompletableFuture<ListRecipientsStatusResponse>
     */
    public CompletableFuture<ListRecipientsStatusResponse> listRecipientsStatusAsync(
        ListRecipientsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listRecipientsStatus);
    }

    /**
     * 查询收件人状态
     *
     * 查询收件人状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecipientsStatusRequest 请求对象
     * @return AsyncInvoker<ListRecipientsStatusRequest, ListRecipientsStatusResponse>
     */
    public AsyncInvoker<ListRecipientsStatusRequest, ListRecipientsStatusResponse> listRecipientsStatusAsyncInvoker(
        ListRecipientsStatusRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listRecipientsStatus, hcClient);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse>
     */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listRegions);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return AsyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public AsyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsAsyncInvoker(ListRegionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listRegions, hcClient);
    }

    /**
     * 获取报告列表
     *
     * 获取报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return CompletableFuture<ListReportsResponse>
     */
    public CompletableFuture<ListReportsResponse> listReportsAsync(ListReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listReports);
    }

    /**
     * 获取报告列表
     *
     * 获取报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return AsyncInvoker<ListReportsRequest, ListReportsResponse>
     */
    public AsyncInvoker<ListReportsRequest, ListReportsResponse> listReportsAsyncInvoker(ListReportsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listReports, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 使用标签过滤实例，查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceRequest 请求对象
     * @return CompletableFuture<ListResourceInstanceResponse>
     */
    public CompletableFuture<ListResourceInstanceResponse> listResourceInstanceAsync(
        ListResourceInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listResourceInstance);
    }

    /**
     * 查询资源实例列表
     *
     * 使用标签过滤实例，查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceRequest 请求对象
     * @return AsyncInvoker<ListResourceInstanceRequest, ListResourceInstanceResponse>
     */
    public AsyncInvoker<ListResourceInstanceRequest, ListResourceInstanceResponse> listResourceInstanceAsyncInvoker(
        ListResourceInstanceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listResourceInstance, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息
     * 标签管理服务需要使用该接口查询指定实例的全部标签数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagRequest 请求对象
     * @return CompletableFuture<ListResourceTagResponse>
     */
    public CompletableFuture<ListResourceTagResponse> listResourceTagAsync(ListResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listResourceTag);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息
     * 标签管理服务需要使用该接口查询指定实例的全部标签数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagRequest 请求对象
     * @return AsyncInvoker<ListResourceTagRequest, ListResourceTagResponse>
     */
    public AsyncInvoker<ListResourceTagRequest, ListResourceTagResponse> listResourceTagAsyncInvoker(
        ListResourceTagRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listResourceTag, hcClient);
    }

    /**
     * 搜索资产列表
     *
     * 搜索资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listResources);
    }

    /**
     * 搜索资产列表
     *
     * 搜索资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listResources, hcClient);
    }

    /**
     * 列出运行中节点
     *
     * 列出运行中节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunningNodesRequest 请求对象
     * @return CompletableFuture<ListRunningNodesResponse>
     */
    public CompletableFuture<ListRunningNodesResponse> listRunningNodesAsync(ListRunningNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listRunningNodes);
    }

    /**
     * 列出运行中节点
     *
     * 列出运行中节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunningNodesRequest 请求对象
     * @return AsyncInvoker<ListRunningNodesRequest, ListRunningNodesResponse>
     */
    public AsyncInvoker<ListRunningNodesRequest, ListRunningNodesResponse> listRunningNodesAsyncInvoker(
        ListRunningNodesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listRunningNodes, hcClient);
    }

    /**
     * 获取检索条件列表
     *
     * 获取检索条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchConditionsRequest 请求对象
     * @return CompletableFuture<ListSearchConditionsResponse>
     */
    public CompletableFuture<ListSearchConditionsResponse> listSearchConditionsAsync(
        ListSearchConditionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listSearchConditions);
    }

    /**
     * 获取检索条件列表
     *
     * 获取检索条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchConditionsRequest 请求对象
     * @return AsyncInvoker<ListSearchConditionsRequest, ListSearchConditionsResponse>
     */
    public AsyncInvoker<ListSearchConditionsRequest, ListSearchConditionsResponse> listSearchConditionsAsyncInvoker(
        ListSearchConditionsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listSearchConditions, hcClient);
    }

    /**
     * 获取数据分布直方图
     *
     * 获取数据分布直方图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchHistogramsRequest 请求对象
     * @return CompletableFuture<ListSearchHistogramsResponse>
     */
    public CompletableFuture<ListSearchHistogramsResponse> listSearchHistogramsAsync(
        ListSearchHistogramsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listSearchHistograms);
    }

    /**
     * 获取数据分布直方图
     *
     * 获取数据分布直方图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchHistogramsRequest 请求对象
     * @return AsyncInvoker<ListSearchHistogramsRequest, ListSearchHistogramsResponse>
     */
    public AsyncInvoker<ListSearchHistogramsRequest, ListSearchHistogramsResponse> listSearchHistogramsAsyncInvoker(
        ListSearchHistogramsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listSearchHistograms, hcClient);
    }

    /**
     * 获取检索数据
     *
     * 获取检索数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchLogsRequest 请求对象
     * @return CompletableFuture<ListSearchLogsResponse>
     */
    public CompletableFuture<ListSearchLogsResponse> listSearchLogsAsync(ListSearchLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listSearchLogs);
    }

    /**
     * 获取检索数据
     *
     * 获取检索数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchLogsRequest 请求对象
     * @return AsyncInvoker<ListSearchLogsRequest, ListSearchLogsResponse>
     */
    public AsyncInvoker<ListSearchLogsRequest, ListSearchLogsResponse> listSearchLogsAsyncInvoker(
        ListSearchLogsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listSearchLogs, hcClient);
    }

    /**
     * 查看委托信息
     *
     * check service linked agency
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceAgencyRequest 请求对象
     * @return CompletableFuture<ListServiceAgencyResponse>
     */
    public CompletableFuture<ListServiceAgencyResponse> listServiceAgencyAsync(ListServiceAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listServiceAgency);
    }

    /**
     * 查看委托信息
     *
     * check service linked agency
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceAgencyRequest 请求对象
     * @return AsyncInvoker<ListServiceAgencyRequest, ListServiceAgencyResponse>
     */
    public AsyncInvoker<ListServiceAgencyRequest, ListServiceAgencyResponse> listServiceAgencyAsyncInvoker(
        ListServiceAgencyRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listServiceAgency, hcClient);
    }

    /**
     * 获取投递授权信息列表
     *
     * 获取投递授权信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShipperAuthorizationsRequest 请求对象
     * @return CompletableFuture<ListShipperAuthorizationsResponse>
     */
    public CompletableFuture<ListShipperAuthorizationsResponse> listShipperAuthorizationsAsync(
        ListShipperAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listShipperAuthorizations);
    }

    /**
     * 获取投递授权信息列表
     *
     * 获取投递授权信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShipperAuthorizationsRequest 请求对象
     * @return AsyncInvoker<ListShipperAuthorizationsRequest, ListShipperAuthorizationsResponse>
     */
    public AsyncInvoker<ListShipperAuthorizationsRequest, ListShipperAuthorizationsResponse> listShipperAuthorizationsAsyncInvoker(
        ListShipperAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listShipperAuthorizations, hcClient);
    }

    /**
     * 查询投递信息
     *
     * 查询投递信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShippersRequest 请求对象
     * @return CompletableFuture<ListShippersResponse>
     */
    public CompletableFuture<ListShippersResponse> listShippersAsync(ListShippersRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listShippers);
    }

    /**
     * 查询投递信息
     *
     * 查询投递信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShippersRequest 请求对象
     * @return AsyncInvoker<ListShippersRequest, ListShippersResponse>
     */
    public AsyncInvoker<ListShippersRequest, ListShippersResponse> listShippersAsyncInvoker(
        ListShippersRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listShippers, hcClient);
    }

    /**
     * 查询已购资源清单
     *
     * 查询已购资源清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionGlobalOrderRequest 请求对象
     * @return CompletableFuture<ListSubscriptionGlobalOrderResponse>
     */
    public CompletableFuture<ListSubscriptionGlobalOrderResponse> listSubscriptionGlobalOrderAsync(
        ListSubscriptionGlobalOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listSubscriptionGlobalOrder);
    }

    /**
     * 查询已购资源清单
     *
     * 查询已购资源清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionGlobalOrderRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionGlobalOrderRequest, ListSubscriptionGlobalOrderResponse>
     */
    public AsyncInvoker<ListSubscriptionGlobalOrderRequest, ListSubscriptionGlobalOrderResponse> listSubscriptionGlobalOrderAsyncInvoker(
        ListSubscriptionGlobalOrderRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listSubscriptionGlobalOrder, hcClient);
    }

    /**
     * 查询租户订阅资源
     *
     * 查询租户版本信息，注意：目前其中参数purchase、usage、smn互斥，同时只能有一个请求参数被命中，优先级为：smn &gt; usage &gt; purchase
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionOrderRequest 请求对象
     * @return CompletableFuture<ListSubscriptionOrderResponse>
     */
    public CompletableFuture<ListSubscriptionOrderResponse> listSubscriptionOrderAsync(
        ListSubscriptionOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listSubscriptionOrder);
    }

    /**
     * 查询租户订阅资源
     *
     * 查询租户版本信息，注意：目前其中参数purchase、usage、smn互斥，同时只能有一个请求参数被命中，优先级为：smn &gt; usage &gt; purchase
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionOrderRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionOrderRequest, ListSubscriptionOrderResponse>
     */
    public AsyncInvoker<ListSubscriptionOrderRequest, ListSubscriptionOrderResponse> listSubscriptionOrderAsyncInvoker(
        ListSubscriptionOrderRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listSubscriptionOrder, hcClient);
    }

    /**
     * 查询当前站点支持的商品清单
     *
     * 查询当前站点SecMaster支持的商品清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionProductRequest 请求对象
     * @return CompletableFuture<ListSubscriptionProductResponse>
     */
    public CompletableFuture<ListSubscriptionProductResponse> listSubscriptionProductAsync(
        ListSubscriptionProductRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listSubscriptionProduct);
    }

    /**
     * 查询当前站点支持的商品清单
     *
     * 查询当前站点SecMaster支持的商品清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionProductRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionProductRequest, ListSubscriptionProductResponse>
     */
    public AsyncInvoker<ListSubscriptionProductRequest, ListSubscriptionProductResponse> listSubscriptionProductAsyncInvoker(
        ListSubscriptionProductRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listSubscriptionProduct, hcClient);
    }

    /**
     * 查询待办列表
     *
     * 查询待办列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listTasks);
    }

    /**
     * 查询待办列表
     *
     * 查询待办列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listTasks, hcClient);
    }

    /**
     * 列出VPC终端节点服务
     *
     * 列出VPC终端节点服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcEndpointServiceRequest 请求对象
     * @return CompletableFuture<ListVpcEndpointServiceResponse>
     */
    public CompletableFuture<ListVpcEndpointServiceResponse> listVpcEndpointServiceAsync(
        ListVpcEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listVpcEndpointService);
    }

    /**
     * 列出VPC终端节点服务
     *
     * 列出VPC终端节点服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcEndpointServiceRequest 请求对象
     * @return AsyncInvoker<ListVpcEndpointServiceRequest, ListVpcEndpointServiceResponse>
     */
    public AsyncInvoker<ListVpcEndpointServiceRequest, ListVpcEndpointServiceResponse> listVpcEndpointServiceAsyncInvoker(
        ListVpcEndpointServiceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listVpcEndpointService, hcClient);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ListVulnerabilitiesResponse>
     */
    public CompletableFuture<ListVulnerabilitiesResponse> listVulnerabilitiesAsync(ListVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listVulnerabilities);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
     */
    public AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilitiesAsyncInvoker(
        ListVulnerabilitiesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listVulnerabilities, hcClient);
    }

    /**
     * 查询流程列表
     *
     * 查询流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return CompletableFuture<ListWorkflowsResponse>
     */
    public CompletableFuture<ListWorkflowsResponse> listWorkflowsAsync(ListWorkflowsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listWorkflows);
    }

    /**
     * 查询流程列表
     *
     * 查询流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsAsyncInvoker(
        ListWorkflowsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listWorkflows, hcClient);
    }

    /**
     * 查询工作空间列表
     *
     * 可通过工作空间名称、工作空间描述、创建时间等条件对租户的工作空间进行筛选。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return CompletableFuture<ListWorkspacesResponse>
     */
    public CompletableFuture<ListWorkspacesResponse> listWorkspacesAsync(ListWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listWorkspaces);
    }

    /**
     * 查询工作空间列表
     *
     * 可通过工作空间名称、工作空间描述、创建时间等条件对租户的工作空间进行筛选。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesAsyncInvoker(
        ListWorkspacesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listWorkspaces, hcClient);
    }

    /**
     * 投递挂起
     *
     * 投递挂起
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseShipperRequest 请求对象
     * @return CompletableFuture<PauseShipperResponse>
     */
    public CompletableFuture<PauseShipperResponse> pauseShipperAsync(PauseShipperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.pauseShipper);
    }

    /**
     * 投递挂起
     *
     * 投递挂起
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseShipperRequest 请求对象
     * @return AsyncInvoker<PauseShipperRequest, PauseShipperResponse>
     */
    public AsyncInvoker<PauseShipperRequest, PauseShipperResponse> pauseShipperAsyncInvoker(
        PauseShipperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.pauseShipper, hcClient);
    }

    /**
     * 启动投递
     *
     * 启动投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeShipperRequest 请求对象
     * @return CompletableFuture<ResumeShipperResponse>
     */
    public CompletableFuture<ResumeShipperResponse> resumeShipperAsync(ResumeShipperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.resumeShipper);
    }

    /**
     * 启动投递
     *
     * 启动投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeShipperRequest 请求对象
     * @return AsyncInvoker<ResumeShipperRequest, ResumeShipperResponse>
     */
    public AsyncInvoker<ResumeShipperRequest, ResumeShipperResponse> resumeShipperAsyncInvoker(
        ResumeShipperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.resumeShipper, hcClient);
    }

    /**
     * 重新投递
     *
     * 重新投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryShipperRequest 请求对象
     * @return CompletableFuture<RetryShipperResponse>
     */
    public CompletableFuture<RetryShipperResponse> retryShipperAsync(RetryShipperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.retryShipper);
    }

    /**
     * 重新投递
     *
     * 重新投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryShipperRequest 请求对象
     * @return AsyncInvoker<RetryShipperRequest, RetryShipperResponse>
     */
    public AsyncInvoker<RetryShipperRequest, RetryShipperResponse> retryShipperAsyncInvoker(
        RetryShipperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.retryShipper, hcClient);
    }

    /**
     * 重新授权
     *
     * 重新授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryShipperAuthorizationRequest 请求对象
     * @return CompletableFuture<RetryShipperAuthorizationResponse>
     */
    public CompletableFuture<RetryShipperAuthorizationResponse> retryShipperAuthorizationAsync(
        RetryShipperAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.retryShipperAuthorization);
    }

    /**
     * 重新授权
     *
     * 重新授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryShipperAuthorizationRequest 请求对象
     * @return AsyncInvoker<RetryShipperAuthorizationRequest, RetryShipperAuthorizationResponse>
     */
    public AsyncInvoker<RetryShipperAuthorizationRequest, RetryShipperAuthorizationResponse> retryShipperAuthorizationAsyncInvoker(
        RetryShipperAuthorizationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.retryShipperAuthorization, hcClient);
    }

    /**
     * 查询策略视图列表
     *
     * 查询策略视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRequest 请求对象
     * @return CompletableFuture<SearchPolicyResponse>
     */
    public CompletableFuture<SearchPolicyResponse> searchPolicyAsync(SearchPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.searchPolicy);
    }

    /**
     * 查询策略视图列表
     *
     * 查询策略视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRequest 请求对象
     * @return AsyncInvoker<SearchPolicyRequest, SearchPolicyResponse>
     */
    public AsyncInvoker<SearchPolicyRequest, SearchPolicyResponse> searchPolicyAsyncInvoker(
        SearchPolicyRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.searchPolicy, hcClient);
    }

    /**
     * 查询任务视图列表
     *
     * 查询任务视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRecordRequest 请求对象
     * @return CompletableFuture<SearchPolicyRecordResponse>
     */
    public CompletableFuture<SearchPolicyRecordResponse> searchPolicyRecordAsync(SearchPolicyRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.searchPolicyRecord);
    }

    /**
     * 查询任务视图列表
     *
     * 查询任务视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRecordRequest 请求对象
     * @return AsyncInvoker<SearchPolicyRecordRequest, SearchPolicyRecordResponse>
     */
    public AsyncInvoker<SearchPolicyRecordRequest, SearchPolicyRecordResponse> searchPolicyRecordAsyncInvoker(
        SearchPolicyRecordRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.searchPolicyRecord, hcClient);
    }

    /**
     * 根据策略ID查询历史记录列表
     *
     * 根据策略ID查询历史记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRecordByPolicyIdRequest 请求对象
     * @return CompletableFuture<SearchPolicyRecordByPolicyIdResponse>
     */
    public CompletableFuture<SearchPolicyRecordByPolicyIdResponse> searchPolicyRecordByPolicyIdAsync(
        SearchPolicyRecordByPolicyIdRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.searchPolicyRecordByPolicyId);
    }

    /**
     * 根据策略ID查询历史记录列表
     *
     * 根据策略ID查询历史记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRecordByPolicyIdRequest 请求对象
     * @return AsyncInvoker<SearchPolicyRecordByPolicyIdRequest, SearchPolicyRecordByPolicyIdResponse>
     */
    public AsyncInvoker<SearchPolicyRecordByPolicyIdRequest, SearchPolicyRecordByPolicyIdResponse> searchPolicyRecordByPolicyIdAsyncInvoker(
        SearchPolicyRecordByPolicyIdRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.searchPolicyRecordByPolicyId, hcClient);
    }

    /**
     * 获取告警详情
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRequest 请求对象
     * @return CompletableFuture<ShowAlertResponse>
     */
    public CompletableFuture<ShowAlertResponse> showAlertAsync(ShowAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAlert);
    }

    /**
     * 获取告警详情
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRequest 请求对象
     * @return AsyncInvoker<ShowAlertRequest, ShowAlertResponse>
     */
    public AsyncInvoker<ShowAlertRequest, ShowAlertResponse> showAlertAsyncInvoker(ShowAlertRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAlert, hcClient);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return CompletableFuture<ShowAlertRuleResponse>
     */
    public CompletableFuture<ShowAlertRuleResponse> showAlertRuleAsync(ShowAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAlertRule);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleAsyncInvoker(
        ShowAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAlertRule, hcClient);
    }

    /**
     * 查看告警规则模板
     *
     * 查看告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return CompletableFuture<ShowAlertRuleTemplateResponse>
     */
    public CompletableFuture<ShowAlertRuleTemplateResponse> showAlertRuleTemplateAsync(
        ShowAlertRuleTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAlertRuleTemplate);
    }

    /**
     * 查看告警规则模板
     *
     * 查看告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>
     */
    public AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplateAsyncInvoker(
        ShowAlertRuleTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAlertRuleTemplate, hcClient);
    }

    /**
     * 查询流程详情
     *
     * 查询流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowRequest 请求对象
     * @return CompletableFuture<ShowAopWorkflowResponse>
     */
    public CompletableFuture<ShowAopWorkflowResponse> showAopWorkflowAsync(ShowAopWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAopWorkflow);
    }

    /**
     * 查询流程详情
     *
     * 查询流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowRequest 请求对象
     * @return AsyncInvoker<ShowAopWorkflowRequest, ShowAopWorkflowResponse>
     */
    public AsyncInvoker<ShowAopWorkflowRequest, ShowAopWorkflowResponse> showAopWorkflowAsyncInvoker(
        ShowAopWorkflowRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAopWorkflow, hcClient);
    }

    /**
     * 查询流程实例的详情
     *
     * 查询流程实例的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowInstanceRequest 请求对象
     * @return CompletableFuture<ShowAopWorkflowInstanceResponse>
     */
    public CompletableFuture<ShowAopWorkflowInstanceResponse> showAopWorkflowInstanceAsync(
        ShowAopWorkflowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAopWorkflowInstance);
    }

    /**
     * 查询流程实例的详情
     *
     * 查询流程实例的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowAopWorkflowInstanceRequest, ShowAopWorkflowInstanceResponse>
     */
    public AsyncInvoker<ShowAopWorkflowInstanceRequest, ShowAopWorkflowInstanceResponse> showAopWorkflowInstanceAsyncInvoker(
        ShowAopWorkflowInstanceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAopWorkflowInstance, hcClient);
    }

    /**
     * 查询流程版本的详细信息
     *
     * 查询流程版本的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowVersionRequest 请求对象
     * @return CompletableFuture<ShowAopWorkflowVersionResponse>
     */
    public CompletableFuture<ShowAopWorkflowVersionResponse> showAopWorkflowVersionAsync(
        ShowAopWorkflowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAopWorkflowVersion);
    }

    /**
     * 查询流程版本的详细信息
     *
     * 查询流程版本的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowVersionRequest 请求对象
     * @return AsyncInvoker<ShowAopWorkflowVersionRequest, ShowAopWorkflowVersionResponse>
     */
    public AsyncInvoker<ShowAopWorkflowVersionRequest, ShowAopWorkflowVersionResponse> showAopWorkflowVersionAsyncInvoker(
        ShowAopWorkflowVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAopWorkflowVersion, hcClient);
    }

    /**
     * 获取附件详情
     *
     * 获取附件详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttachmentRequest 请求对象
     * @return CompletableFuture<ShowAttachmentResponse>
     */
    public CompletableFuture<ShowAttachmentResponse> showAttachmentAsync(ShowAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAttachment);
    }

    /**
     * 获取附件详情
     *
     * 获取附件详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttachmentRequest 请求对象
     * @return AsyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse>
     */
    public AsyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse> showAttachmentAsyncInvoker(
        ShowAttachmentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAttachment, hcClient);
    }

    /**
     * 查询分类详情
     *
     * 查询分类详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClassifierInfoRequest 请求对象
     * @return CompletableFuture<ShowClassifierInfoResponse>
     */
    public CompletableFuture<ShowClassifierInfoResponse> showClassifierInfoAsync(ShowClassifierInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showClassifierInfo);
    }

    /**
     * 查询分类详情
     *
     * 查询分类详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClassifierInfoRequest 请求对象
     * @return AsyncInvoker<ShowClassifierInfoRequest, ShowClassifierInfoResponse>
     */
    public AsyncInvoker<ShowClassifierInfoRequest, ShowClassifierInfoResponse> showClassifierInfoAsyncInvoker(
        ShowClassifierInfoRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showClassifierInfo, hcClient);
    }

    /**
     * 获取是否开启行管
     *
     * 获取是否开启行管
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudLogTenantWhitelistRequest 请求对象
     * @return CompletableFuture<ShowCloudLogTenantWhitelistResponse>
     */
    public CompletableFuture<ShowCloudLogTenantWhitelistResponse> showCloudLogTenantWhitelistAsync(
        ShowCloudLogTenantWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showCloudLogTenantWhitelist);
    }

    /**
     * 获取是否开启行管
     *
     * 获取是否开启行管
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudLogTenantWhitelistRequest 请求对象
     * @return AsyncInvoker<ShowCloudLogTenantWhitelistRequest, ShowCloudLogTenantWhitelistResponse>
     */
    public AsyncInvoker<ShowCloudLogTenantWhitelistRequest, ShowCloudLogTenantWhitelistResponse> showCloudLogTenantWhitelistAsyncInvoker(
        ShowCloudLogTenantWhitelistRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showCloudLogTenantWhitelist, hcClient);
    }

    /**
     * 展示采集通道
     *
     * 展示采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorChannelRequest 请求对象
     * @return CompletableFuture<ShowCollectorChannelResponse>
     */
    public CompletableFuture<ShowCollectorChannelResponse> showCollectorChannelAsync(
        ShowCollectorChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showCollectorChannel);
    }

    /**
     * 展示采集通道
     *
     * 展示采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorChannelRequest 请求对象
     * @return AsyncInvoker<ShowCollectorChannelRequest, ShowCollectorChannelResponse>
     */
    public AsyncInvoker<ShowCollectorChannelRequest, ShowCollectorChannelResponse> showCollectorChannelAsyncInvoker(
        ShowCollectorChannelRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showCollectorChannel, hcClient);
    }

    /**
     * 展示采集连接详情
     *
     * 展示采集连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorConnectionRequest 请求对象
     * @return CompletableFuture<ShowCollectorConnectionResponse>
     */
    public CompletableFuture<ShowCollectorConnectionResponse> showCollectorConnectionAsync(
        ShowCollectorConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showCollectorConnection);
    }

    /**
     * 展示采集连接详情
     *
     * 展示采集连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorConnectionRequest 请求对象
     * @return AsyncInvoker<ShowCollectorConnectionRequest, ShowCollectorConnectionResponse>
     */
    public AsyncInvoker<ShowCollectorConnectionRequest, ShowCollectorConnectionResponse> showCollectorConnectionAsyncInvoker(
        ShowCollectorConnectionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showCollectorConnection, hcClient);
    }

    /**
     * 获取采集解析器详情
     *
     * 获取采集解析器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorParserRequest 请求对象
     * @return CompletableFuture<ShowCollectorParserResponse>
     */
    public CompletableFuture<ShowCollectorParserResponse> showCollectorParserAsync(ShowCollectorParserRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showCollectorParser);
    }

    /**
     * 获取采集解析器详情
     *
     * 获取采集解析器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorParserRequest 请求对象
     * @return AsyncInvoker<ShowCollectorParserRequest, ShowCollectorParserResponse>
     */
    public AsyncInvoker<ShowCollectorParserRequest, ShowCollectorParserResponse> showCollectorParserAsyncInvoker(
        ShowCollectorParserRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showCollectorParser, hcClient);
    }

    /**
     * 查询插件详细信息
     *
     * 查询插件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
     * @return CompletableFuture<ShowComponentResponse>
     */
    public CompletableFuture<ShowComponentResponse> showComponentAsync(ShowComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showComponent);
    }

    /**
     * 查询插件详细信息
     *
     * 查询插件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
     * @return AsyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public AsyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentAsyncInvoker(
        ShowComponentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showComponent, hcClient);
    }

    /**
     * 查询插件Action详情
     *
     * 查询插件的action详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentActionRequest 请求对象
     * @return CompletableFuture<ShowComponentActionResponse>
     */
    public CompletableFuture<ShowComponentActionResponse> showComponentActionAsync(ShowComponentActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showComponentAction);
    }

    /**
     * 查询插件Action详情
     *
     * 查询插件的action详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentActionRequest 请求对象
     * @return AsyncInvoker<ShowComponentActionRequest, ShowComponentActionResponse>
     */
    public AsyncInvoker<ShowComponentActionRequest, ShowComponentActionResponse> showComponentActionAsyncInvoker(
        ShowComponentActionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showComponentAction, hcClient);
    }

    /**
     * 查询插件配置模板详情
     *
     * 查询在配置流程时的插件配置模板详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentTemplateRequest 请求对象
     * @return CompletableFuture<ShowComponentTemplateResponse>
     */
    public CompletableFuture<ShowComponentTemplateResponse> showComponentTemplateAsync(
        ShowComponentTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showComponentTemplate);
    }

    /**
     * 查询插件配置模板详情
     *
     * 查询在配置流程时的插件配置模板详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentTemplateRequest 请求对象
     * @return AsyncInvoker<ShowComponentTemplateRequest, ShowComponentTemplateResponse>
     */
    public AsyncInvoker<ShowComponentTemplateRequest, ShowComponentTemplateResponse> showComponentTemplateAsyncInvoker(
        ShowComponentTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showComponentTemplate, hcClient);
    }

    /**
     * 查询操作连接详情
     *
     * 查询操作连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return CompletableFuture<ShowConnectionResponse>
     */
    public CompletableFuture<ShowConnectionResponse> showConnectionAsync(ShowConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showConnection);
    }

    /**
     * 查询操作连接详情
     *
     * 查询操作连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse>
     */
    public AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse> showConnectionAsyncInvoker(
        ShowConnectionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showConnection, hcClient);
    }

    /**
     * 展示数据类详情
     *
     * 展示数据类详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataClassInfoRequest 请求对象
     * @return CompletableFuture<ShowDataClassInfoResponse>
     */
    public CompletableFuture<ShowDataClassInfoResponse> showDataClassInfoAsync(ShowDataClassInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showDataClassInfo);
    }

    /**
     * 展示数据类详情
     *
     * 展示数据类详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataClassInfoRequest 请求对象
     * @return AsyncInvoker<ShowDataClassInfoRequest, ShowDataClassInfoResponse>
     */
    public AsyncInvoker<ShowDataClassInfoRequest, ShowDataClassInfoResponse> showDataClassInfoAsyncInvoker(
        ShowDataClassInfoRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showDataClassInfo, hcClient);
    }

    /**
     * 查询数据对象
     *
     * 查询数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataobjectRequest 请求对象
     * @return CompletableFuture<ShowDataobjectResponse>
     */
    public CompletableFuture<ShowDataobjectResponse> showDataobjectAsync(ShowDataobjectRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showDataobject);
    }

    /**
     * 查询数据对象
     *
     * 查询数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataobjectRequest 请求对象
     * @return AsyncInvoker<ShowDataobjectRequest, ShowDataobjectResponse>
     */
    public AsyncInvoker<ShowDataobjectRequest, ShowDataobjectResponse> showDataobjectAsyncInvoker(
        ShowDataobjectRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showDataobject, hcClient);
    }

    /**
     * 查询数据面对象
     *
     * 数据面查询数据类纳管的数据对象详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatapanelObjectRequest 请求对象
     * @return CompletableFuture<ShowDatapanelObjectResponse>
     */
    public CompletableFuture<ShowDatapanelObjectResponse> showDatapanelObjectAsync(ShowDatapanelObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showDatapanelObject);
    }

    /**
     * 查询数据面对象
     *
     * 数据面查询数据类纳管的数据对象详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatapanelObjectRequest 请求对象
     * @return AsyncInvoker<ShowDatapanelObjectRequest, ShowDatapanelObjectResponse>
     */
    public AsyncInvoker<ShowDatapanelObjectRequest, ShowDatapanelObjectResponse> showDatapanelObjectAsyncInvoker(
        ShowDatapanelObjectRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showDatapanelObject, hcClient);
    }

    /**
     * 获取数据空间详情
     *
     * 获取数据空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataspaceRequest 请求对象
     * @return CompletableFuture<ShowDataspaceResponse>
     */
    public CompletableFuture<ShowDataspaceResponse> showDataspaceAsync(ShowDataspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showDataspace);
    }

    /**
     * 获取数据空间详情
     *
     * 获取数据空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataspaceRequest 请求对象
     * @return AsyncInvoker<ShowDataspaceRequest, ShowDataspaceResponse>
     */
    public AsyncInvoker<ShowDataspaceRequest, ShowDataspaceResponse> showDataspaceAsyncInvoker(
        ShowDataspaceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showDataspace, hcClient);
    }

    /**
     * 获取事件详情
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentRequest 请求对象
     * @return CompletableFuture<ShowIncidentResponse>
     */
    public CompletableFuture<ShowIncidentResponse> showIncidentAsync(ShowIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showIncident);
    }

    /**
     * 获取事件详情
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentRequest 请求对象
     * @return AsyncInvoker<ShowIncidentRequest, ShowIncidentResponse>
     */
    public AsyncInvoker<ShowIncidentRequest, ShowIncidentResponse> showIncidentAsyncInvoker(
        ShowIncidentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showIncident, hcClient);
    }

    /**
     * 查询威胁情报详情
     *
     * 查询威胁情报详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndicatorDetailRequest 请求对象
     * @return CompletableFuture<ShowIndicatorDetailResponse>
     */
    public CompletableFuture<ShowIndicatorDetailResponse> showIndicatorDetailAsync(ShowIndicatorDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showIndicatorDetail);
    }

    /**
     * 查询威胁情报详情
     *
     * 查询威胁情报详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndicatorDetailRequest 请求对象
     * @return AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>
     */
    public AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetailAsyncInvoker(
        ShowIndicatorDetailRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showIndicatorDetail, hcClient);
    }

    /**
     * 展示组件详情
     *
     * 展示组件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIsapComponentRequest 请求对象
     * @return CompletableFuture<ShowIsapComponentResponse>
     */
    public CompletableFuture<ShowIsapComponentResponse> showIsapComponentAsync(ShowIsapComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showIsapComponent);
    }

    /**
     * 展示组件详情
     *
     * 展示组件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIsapComponentRequest 请求对象
     * @return AsyncInvoker<ShowIsapComponentRequest, ShowIsapComponentResponse>
     */
    public AsyncInvoker<ShowIsapComponentRequest, ShowIsapComponentResponse> showIsapComponentAsyncInvoker(
        ShowIsapComponentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showIsapComponent, hcClient);
    }

    /**
     * 查询布局详情
     *
     * 查询布局详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutRequest 请求对象
     * @return CompletableFuture<ShowLayoutResponse>
     */
    public CompletableFuture<ShowLayoutResponse> showLayoutAsync(ShowLayoutRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showLayout);
    }

    /**
     * 查询布局详情
     *
     * 查询布局详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutRequest 请求对象
     * @return AsyncInvoker<ShowLayoutRequest, ShowLayoutResponse>
     */
    public AsyncInvoker<ShowLayoutRequest, ShowLayoutResponse> showLayoutAsyncInvoker(ShowLayoutRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showLayout, hcClient);
    }

    /**
     * 查询布局页面
     *
     * 查询布局页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutWizardRequest 请求对象
     * @return CompletableFuture<ShowLayoutWizardResponse>
     */
    public CompletableFuture<ShowLayoutWizardResponse> showLayoutWizardAsync(ShowLayoutWizardRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showLayoutWizard);
    }

    /**
     * 查询布局页面
     *
     * 查询布局页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutWizardRequest 请求对象
     * @return AsyncInvoker<ShowLayoutWizardRequest, ShowLayoutWizardResponse>
     */
    public AsyncInvoker<ShowLayoutWizardRequest, ShowLayoutWizardResponse> showLayoutWizardAsyncInvoker(
        ShowLayoutWizardRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showLayoutWizard, hcClient);
    }

    /**
     * 查询布局页面详情
     *
     * 查询布局页面详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutWizardByFieldRequest 请求对象
     * @return CompletableFuture<ShowLayoutWizardByFieldResponse>
     */
    public CompletableFuture<ShowLayoutWizardByFieldResponse> showLayoutWizardByFieldAsync(
        ShowLayoutWizardByFieldRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showLayoutWizardByField);
    }

    /**
     * 查询布局页面详情
     *
     * 查询布局页面详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutWizardByFieldRequest 请求对象
     * @return AsyncInvoker<ShowLayoutWizardByFieldRequest, ShowLayoutWizardByFieldResponse>
     */
    public AsyncInvoker<ShowLayoutWizardByFieldRequest, ShowLayoutWizardByFieldResponse> showLayoutWizardByFieldAsyncInvoker(
        ShowLayoutWizardByFieldRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showLayoutWizardByField, hcClient);
    }

    /**
     * 查询映射详情
     *
     * 查询映射详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMapperDetailRequest 请求对象
     * @return CompletableFuture<ShowMapperDetailResponse>
     */
    public CompletableFuture<ShowMapperDetailResponse> showMapperDetailAsync(ShowMapperDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showMapperDetail);
    }

    /**
     * 查询映射详情
     *
     * 查询映射详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMapperDetailRequest 请求对象
     * @return AsyncInvoker<ShowMapperDetailRequest, ShowMapperDetailResponse>
     */
    public AsyncInvoker<ShowMapperDetailRequest, ShowMapperDetailResponse> showMapperDetailAsyncInvoker(
        ShowMapperDetailRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showMapperDetail, hcClient);
    }

    /**
     * 查询映射列表
     *
     * 查询映射列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMapperListRequest 请求对象
     * @return CompletableFuture<ShowMapperListResponse>
     */
    public CompletableFuture<ShowMapperListResponse> showMapperListAsync(ShowMapperListRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showMapperList);
    }

    /**
     * 查询映射列表
     *
     * 查询映射列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMapperListRequest 请求对象
     * @return AsyncInvoker<ShowMapperListRequest, ShowMapperListResponse>
     */
    public AsyncInvoker<ShowMapperListRequest, ShowMapperListResponse> showMapperListAsyncInvoker(
        ShowMapperListRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showMapperList, hcClient);
    }

    /**
     * 查询分类映射函数
     *
     * 查询分类映射函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMappingFunctionRequest 请求对象
     * @return CompletableFuture<ShowMappingFunctionResponse>
     */
    public CompletableFuture<ShowMappingFunctionResponse> showMappingFunctionAsync(ShowMappingFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showMappingFunction);
    }

    /**
     * 查询分类映射函数
     *
     * 查询分类映射函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMappingFunctionRequest 请求对象
     * @return AsyncInvoker<ShowMappingFunctionRequest, ShowMappingFunctionResponse>
     */
    public AsyncInvoker<ShowMappingFunctionRequest, ShowMappingFunctionResponse> showMappingFunctionAsyncInvoker(
        ShowMappingFunctionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showMappingFunction, hcClient);
    }

    /**
     * 查询分类映射列表
     *
     * 查询分类映射列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMappingInfoListRequest 请求对象
     * @return CompletableFuture<ShowMappingInfoListResponse>
     */
    public CompletableFuture<ShowMappingInfoListResponse> showMappingInfoListAsync(ShowMappingInfoListRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showMappingInfoList);
    }

    /**
     * 查询分类映射列表
     *
     * 查询分类映射列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMappingInfoListRequest 请求对象
     * @return AsyncInvoker<ShowMappingInfoListRequest, ShowMappingInfoListResponse>
     */
    public AsyncInvoker<ShowMappingInfoListRequest, ShowMappingInfoListResponse> showMappingInfoListAsyncInvoker(
        ShowMappingInfoListRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showMappingInfoList, hcClient);
    }

    /**
     * 获取指标元数据
     *
     * 获取指标元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricMetaDataRequest 请求对象
     * @return CompletableFuture<ShowMetricMetaDataResponse>
     */
    public CompletableFuture<ShowMetricMetaDataResponse> showMetricMetaDataAsync(ShowMetricMetaDataRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showMetricMetaData);
    }

    /**
     * 获取指标元数据
     *
     * 获取指标元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricMetaDataRequest 请求对象
     * @return AsyncInvoker<ShowMetricMetaDataRequest, ShowMetricMetaDataResponse>
     */
    public AsyncInvoker<ShowMetricMetaDataRequest, ShowMetricMetaDataResponse> showMetricMetaDataAsyncInvoker(
        ShowMetricMetaDataRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showMetricMetaData, hcClient);
    }

    /**
     * 查询模块详情
     *
     * 查询模块详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModuleRequest 请求对象
     * @return CompletableFuture<ShowModuleResponse>
     */
    public CompletableFuture<ShowModuleResponse> showModuleAsync(ShowModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showModule);
    }

    /**
     * 查询模块详情
     *
     * 查询模块详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModuleRequest 请求对象
     * @return AsyncInvoker<ShowModuleRequest, ShowModuleResponse>
     */
    public AsyncInvoker<ShowModuleRequest, ShowModuleResponse> showModuleAsyncInvoker(ShowModuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showModule, hcClient);
    }

    /**
     * 获取指标统计数据
     *
     * 获取指标统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMoniterMetricStatsRequest 请求对象
     * @return CompletableFuture<ShowMoniterMetricStatsResponse>
     */
    public CompletableFuture<ShowMoniterMetricStatsResponse> showMoniterMetricStatsAsync(
        ShowMoniterMetricStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showMoniterMetricStats);
    }

    /**
     * 获取指标统计数据
     *
     * 获取指标统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMoniterMetricStatsRequest 请求对象
     * @return AsyncInvoker<ShowMoniterMetricStatsRequest, ShowMoniterMetricStatsResponse>
     */
    public AsyncInvoker<ShowMoniterMetricStatsRequest, ShowMoniterMetricStatsResponse> showMoniterMetricStatsAsyncInvoker(
        ShowMoniterMetricStatsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showMoniterMetricStats, hcClient);
    }

    /**
     * 获取数据管道详情
     *
     * 获取数据管道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeRequest 请求对象
     * @return CompletableFuture<ShowPipeResponse>
     */
    public CompletableFuture<ShowPipeResponse> showPipeAsync(ShowPipeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPipe);
    }

    /**
     * 获取数据管道详情
     *
     * 获取数据管道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeRequest 请求对象
     * @return AsyncInvoker<ShowPipeRequest, ShowPipeResponse>
     */
    public AsyncInvoker<ShowPipeRequest, ShowPipeResponse> showPipeAsyncInvoker(ShowPipeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPipe, hcClient);
    }

    /**
     * 获取实时消费配置
     *
     * 获取实时消费配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeConsumptionRequest 请求对象
     * @return CompletableFuture<ShowPipeConsumptionResponse>
     */
    public CompletableFuture<ShowPipeConsumptionResponse> showPipeConsumptionAsync(ShowPipeConsumptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPipeConsumption);
    }

    /**
     * 获取实时消费配置
     *
     * 获取实时消费配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeConsumptionRequest 请求对象
     * @return AsyncInvoker<ShowPipeConsumptionRequest, ShowPipeConsumptionResponse>
     */
    public AsyncInvoker<ShowPipeConsumptionRequest, ShowPipeConsumptionResponse> showPipeConsumptionAsyncInvoker(
        ShowPipeConsumptionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPipeConsumption, hcClient);
    }

    /**
     * 获取索引信息
     *
     * 获取索引信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeIndexRequest 请求对象
     * @return CompletableFuture<ShowPipeIndexResponse>
     */
    public CompletableFuture<ShowPipeIndexResponse> showPipeIndexAsync(ShowPipeIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPipeIndex);
    }

    /**
     * 获取索引信息
     *
     * 获取索引信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeIndexRequest 请求对象
     * @return AsyncInvoker<ShowPipeIndexRequest, ShowPipeIndexResponse>
     */
    public AsyncInvoker<ShowPipeIndexRequest, ShowPipeIndexResponse> showPipeIndexAsyncInvoker(
        ShowPipeIndexRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPipeIndex, hcClient);
    }

    /**
     * 获取行管信息
     *
     * 获取行管信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlatformManagedRequest 请求对象
     * @return CompletableFuture<ShowPlatformManagedResponse>
     */
    public CompletableFuture<ShowPlatformManagedResponse> showPlatformManagedAsync(ShowPlatformManagedRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlatformManaged);
    }

    /**
     * 获取行管信息
     *
     * 获取行管信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlatformManagedRequest 请求对象
     * @return AsyncInvoker<ShowPlatformManagedRequest, ShowPlatformManagedResponse>
     */
    public AsyncInvoker<ShowPlatformManagedRequest, ShowPlatformManagedResponse> showPlatformManagedAsyncInvoker(
        ShowPlatformManagedRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPlatformManaged, hcClient);
    }

    /**
     * 查询剧本详情
     *
     * 查询剧本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRequest 请求对象
     * @return CompletableFuture<ShowPlaybookResponse>
     */
    public CompletableFuture<ShowPlaybookResponse> showPlaybookAsync(ShowPlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybook);
    }

    /**
     * 查询剧本详情
     *
     * 查询剧本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>
     */
    public AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybookAsyncInvoker(
        ShowPlaybookRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPlaybook, hcClient);
    }

    /**
     * 查询剧本实例详情
     *
     * 查询剧本实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookInstanceRequest 请求对象
     * @return CompletableFuture<ShowPlaybookInstanceResponse>
     */
    public CompletableFuture<ShowPlaybookInstanceResponse> showPlaybookInstanceAsync(
        ShowPlaybookInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookInstance);
    }

    /**
     * 查询剧本实例详情
     *
     * 查询剧本实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookInstanceRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse>
     */
    public AsyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstanceAsyncInvoker(
        ShowPlaybookInstanceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPlaybookInstance, hcClient);
    }

    /**
     * 剧本运行监控
     *
     * 剧本运行监控（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookMonitorsRequest 请求对象
     * @return CompletableFuture<ShowPlaybookMonitorsResponse>
     */
    public CompletableFuture<ShowPlaybookMonitorsResponse> showPlaybookMonitorsAsync(
        ShowPlaybookMonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookMonitors);
    }

    /**
     * 剧本运行监控
     *
     * 剧本运行监控（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookMonitorsRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse>
     */
    public AsyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> showPlaybookMonitorsAsyncInvoker(
        ShowPlaybookMonitorsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPlaybookMonitors, hcClient);
    }

    /**
     * 查询剧本规则详情
     *
     * 查询剧本规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRuleRequest 请求对象
     * @return CompletableFuture<ShowPlaybookRuleResponse>
     */
    public CompletableFuture<ShowPlaybookRuleResponse> showPlaybookRuleAsync(ShowPlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookRule);
    }

    /**
     * 查询剧本规则详情
     *
     * 查询剧本规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRuleRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>
     */
    public AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRuleAsyncInvoker(
        ShowPlaybookRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPlaybookRule, hcClient);
    }

    /**
     * 剧本数据统计
     *
     * 剧本统计数据（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookStatisticsRequest 请求对象
     * @return CompletableFuture<ShowPlaybookStatisticsResponse>
     */
    public CompletableFuture<ShowPlaybookStatisticsResponse> showPlaybookStatisticsAsync(
        ShowPlaybookStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookStatistics);
    }

    /**
     * 剧本数据统计
     *
     * 剧本统计数据（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse>
     */
    public AsyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatisticsAsyncInvoker(
        ShowPlaybookStatisticsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPlaybookStatistics, hcClient);
    }

    /**
     * 查询剧本拓扑关系
     *
     * 查询剧本拓扑关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookTopologyRequest 请求对象
     * @return CompletableFuture<ShowPlaybookTopologyResponse>
     */
    public CompletableFuture<ShowPlaybookTopologyResponse> showPlaybookTopologyAsync(
        ShowPlaybookTopologyRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookTopology);
    }

    /**
     * 查询剧本拓扑关系
     *
     * 查询剧本拓扑关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookTopologyRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>
     */
    public AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopologyAsyncInvoker(
        ShowPlaybookTopologyRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPlaybookTopology, hcClient);
    }

    /**
     * 查询剧本版本详情
     *
     * 查询剧本版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookVersionRequest 请求对象
     * @return CompletableFuture<ShowPlaybookVersionResponse>
     */
    public CompletableFuture<ShowPlaybookVersionResponse> showPlaybookVersionAsync(ShowPlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookVersion);
    }

    /**
     * 查询剧本版本详情
     *
     * 查询剧本版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookVersionRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse>
     */
    public AsyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> showPlaybookVersionAsyncInvoker(
        ShowPlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPlaybookVersion, hcClient);
    }

    /**
     * 查询策略视图对象
     *
     * 查询策略视图对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return CompletableFuture<ShowPolicyResponse>
     */
    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPolicy);
    }

    /**
     * 查询策略视图对象
     *
     * 查询策略视图对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPolicy, hcClient);
    }

    /**
     * 查询预处理规则列表
     *
     * 查询预处理规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPreProcessRulesListRequest 请求对象
     * @return CompletableFuture<ShowPreProcessRulesListResponse>
     */
    public CompletableFuture<ShowPreProcessRulesListResponse> showPreProcessRulesListAsync(
        ShowPreProcessRulesListRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPreProcessRulesList);
    }

    /**
     * 查询预处理规则列表
     *
     * 查询预处理规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPreProcessRulesListRequest 请求对象
     * @return AsyncInvoker<ShowPreProcessRulesListRequest, ShowPreProcessRulesListResponse>
     */
    public AsyncInvoker<ShowPreProcessRulesListRequest, ShowPreProcessRulesListResponse> showPreProcessRulesListAsyncInvoker(
        ShowPreProcessRulesListRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPreProcessRulesList, hcClient);
    }

    /**
     * 获取报告详情
     *
     * 获取报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportInfoRequest 请求对象
     * @return CompletableFuture<ShowReportInfoResponse>
     */
    public CompletableFuture<ShowReportInfoResponse> showReportInfoAsync(ShowReportInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showReportInfo);
    }

    /**
     * 获取报告详情
     *
     * 获取报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportInfoRequest 请求对象
     * @return AsyncInvoker<ShowReportInfoRequest, ShowReportInfoResponse>
     */
    public AsyncInvoker<ShowReportInfoRequest, ShowReportInfoResponse> showReportInfoAsyncInvoker(
        ShowReportInfoRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showReportInfo, hcClient);
    }

    /**
     * 获取资产详情
     *
     * 获取资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRequest 请求对象
     * @return CompletableFuture<ShowResourceResponse>
     */
    public CompletableFuture<ShowResourceResponse> showResourceAsync(ShowResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showResource);
    }

    /**
     * 获取资产详情
     *
     * 获取资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRequest 请求对象
     * @return AsyncInvoker<ShowResourceRequest, ShowResourceResponse>
     */
    public AsyncInvoker<ShowResourceRequest, ShowResourceResponse> showResourceAsyncInvoker(
        ShowResourceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showResource, hcClient);
    }

    /**
     * 获取检索条件详情
     *
     * 获取检索条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchConditionRequest 请求对象
     * @return CompletableFuture<ShowSearchConditionResponse>
     */
    public CompletableFuture<ShowSearchConditionResponse> showSearchConditionAsync(ShowSearchConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showSearchCondition);
    }

    /**
     * 获取检索条件详情
     *
     * 获取检索条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchConditionRequest 请求对象
     * @return AsyncInvoker<ShowSearchConditionRequest, ShowSearchConditionResponse>
     */
    public AsyncInvoker<ShowSearchConditionRequest, ShowSearchConditionResponse> showSearchConditionAsyncInvoker(
        ShowSearchConditionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showSearchCondition, hcClient);
    }

    /**
     * 投递规则详情
     *
     * 投递规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperRequest 请求对象
     * @return CompletableFuture<ShowShipperResponse>
     */
    public CompletableFuture<ShowShipperResponse> showShipperAsync(ShowShipperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showShipper);
    }

    /**
     * 投递规则详情
     *
     * 投递规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperRequest 请求对象
     * @return AsyncInvoker<ShowShipperRequest, ShowShipperResponse>
     */
    public AsyncInvoker<ShowShipperRequest, ShowShipperResponse> showShipperAsyncInvoker(ShowShipperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showShipper, hcClient);
    }

    /**
     * 获取委托权限
     *
     * 获取委托权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperDelegateAuthRequest 请求对象
     * @return CompletableFuture<ShowShipperDelegateAuthResponse>
     */
    public CompletableFuture<ShowShipperDelegateAuthResponse> showShipperDelegateAuthAsync(
        ShowShipperDelegateAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showShipperDelegateAuth);
    }

    /**
     * 获取委托权限
     *
     * 获取委托权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperDelegateAuthRequest 请求对象
     * @return AsyncInvoker<ShowShipperDelegateAuthRequest, ShowShipperDelegateAuthResponse>
     */
    public AsyncInvoker<ShowShipperDelegateAuthRequest, ShowShipperDelegateAuthResponse> showShipperDelegateAuthAsyncInvoker(
        ShowShipperDelegateAuthRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showShipperDelegateAuth, hcClient);
    }

    /**
     * 参数查询
     *
     * 参数查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperParamRequest 请求对象
     * @return CompletableFuture<ShowShipperParamResponse>
     */
    public CompletableFuture<ShowShipperParamResponse> showShipperParamAsync(ShowShipperParamRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showShipperParam);
    }

    /**
     * 参数查询
     *
     * 参数查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperParamRequest 请求对象
     * @return AsyncInvoker<ShowShipperParamRequest, ShowShipperParamResponse>
     */
    public AsyncInvoker<ShowShipperParamRequest, ShowShipperParamResponse> showShipperParamAsyncInvoker(
        ShowShipperParamRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showShipperParam, hcClient);
    }

    /**
     * 查询待办的详情
     *
     * 查询待办的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showTask);
    }

    /**
     * 查询待办的详情
     *
     * 查询待办的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showTask, hcClient);
    }

    /**
     * 获取漏洞详情
     *
     * 获取漏洞详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulnerabilityRequest 请求对象
     * @return CompletableFuture<ShowVulnerabilityResponse>
     */
    public CompletableFuture<ShowVulnerabilityResponse> showVulnerabilityAsync(ShowVulnerabilityRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showVulnerability);
    }

    /**
     * 获取漏洞详情
     *
     * 获取漏洞详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulnerabilityRequest 请求对象
     * @return AsyncInvoker<ShowVulnerabilityRequest, ShowVulnerabilityResponse>
     */
    public AsyncInvoker<ShowVulnerabilityRequest, ShowVulnerabilityResponse> showVulnerabilityAsyncInvoker(
        ShowVulnerabilityRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showVulnerability, hcClient);
    }

    /**
     * 查询工作空间详情
     *
     * 查询工作空间名称、描述等详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceRequest 请求对象
     * @return CompletableFuture<ShowWorkspaceResponse>
     */
    public CompletableFuture<ShowWorkspaceResponse> showWorkspaceAsync(ShowWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showWorkspace);
    }

    /**
     * 查询工作空间详情
     *
     * 查询工作空间名称、描述等详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceRequest 请求对象
     * @return AsyncInvoker<ShowWorkspaceRequest, ShowWorkspaceResponse>
     */
    public AsyncInvoker<ShowWorkspaceRequest, ShowWorkspaceResponse> showWorkspaceAsyncInvoker(
        ShowWorkspaceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showWorkspace, hcClient);
    }

    /**
     * 更新告警规则
     *
     * 更新告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return CompletableFuture<UpdateAlertRuleResponse>
     */
    public CompletableFuture<UpdateAlertRuleResponse> updateAlertRuleAsync(UpdateAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateAlertRule);
    }

    /**
     * 更新告警规则
     *
     * 更新告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
     */
    public AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRuleAsyncInvoker(
        UpdateAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateAlertRule, hcClient);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAopWorkflowRequest 请求对象
     * @return CompletableFuture<UpdateAopWorkflowResponse>
     */
    public CompletableFuture<UpdateAopWorkflowResponse> updateAopWorkflowAsync(UpdateAopWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateAopWorkflow);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAopWorkflowRequest 请求对象
     * @return AsyncInvoker<UpdateAopWorkflowRequest, UpdateAopWorkflowResponse>
     */
    public AsyncInvoker<UpdateAopWorkflowRequest, UpdateAopWorkflowResponse> updateAopWorkflowAsyncInvoker(
        UpdateAopWorkflowRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateAopWorkflow, hcClient);
    }

    /**
     * 更新流程版本信息
     *
     * 更新流程版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAopWorkflowVersionRequest 请求对象
     * @return CompletableFuture<UpdateAopWorkflowVersionResponse>
     */
    public CompletableFuture<UpdateAopWorkflowVersionResponse> updateAopWorkflowVersionAsync(
        UpdateAopWorkflowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateAopWorkflowVersion);
    }

    /**
     * 更新流程版本信息
     *
     * 更新流程版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAopWorkflowVersionRequest 请求对象
     * @return AsyncInvoker<UpdateAopWorkflowVersionRequest, UpdateAopWorkflowVersionResponse>
     */
    public AsyncInvoker<UpdateAopWorkflowVersionRequest, UpdateAopWorkflowVersionResponse> updateAopWorkflowVersionAsyncInvoker(
        UpdateAopWorkflowVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateAopWorkflowVersion, hcClient);
    }

    /**
     * 修改目录
     *
     * 修改自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCatalogueRequest 请求对象
     * @return CompletableFuture<UpdateCatalogueResponse>
     */
    public CompletableFuture<UpdateCatalogueResponse> updateCatalogueAsync(UpdateCatalogueRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateCatalogue);
    }

    /**
     * 修改目录
     *
     * 修改自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCatalogueRequest 请求对象
     * @return AsyncInvoker<UpdateCatalogueRequest, UpdateCatalogueResponse>
     */
    public AsyncInvoker<UpdateCatalogueRequest, UpdateCatalogueResponse> updateCatalogueAsyncInvoker(
        UpdateCatalogueRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateCatalogue, hcClient);
    }

    /**
     * 修改分类
     *
     * 修改分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClassifierRequest 请求对象
     * @return CompletableFuture<UpdateClassifierResponse>
     */
    public CompletableFuture<UpdateClassifierResponse> updateClassifierAsync(UpdateClassifierRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateClassifier);
    }

    /**
     * 修改分类
     *
     * 修改分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClassifierRequest 请求对象
     * @return AsyncInvoker<UpdateClassifierRequest, UpdateClassifierResponse>
     */
    public AsyncInvoker<UpdateClassifierRequest, UpdateClassifierResponse> updateClassifierAsyncInvoker(
        UpdateClassifierRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateClassifier, hcClient);
    }

    /**
     * 更改采集通道
     *
     * 更改采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorChannelRequest 请求对象
     * @return CompletableFuture<UpdateCollectorChannelResponse>
     */
    public CompletableFuture<UpdateCollectorChannelResponse> updateCollectorChannelAsync(
        UpdateCollectorChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateCollectorChannel);
    }

    /**
     * 更改采集通道
     *
     * 更改采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorChannelRequest 请求对象
     * @return AsyncInvoker<UpdateCollectorChannelRequest, UpdateCollectorChannelResponse>
     */
    public AsyncInvoker<UpdateCollectorChannelRequest, UpdateCollectorChannelResponse> updateCollectorChannelAsyncInvoker(
        UpdateCollectorChannelRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateCollectorChannel, hcClient);
    }

    /**
     * 更新采集通道分组
     *
     * 更新采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorChannelGroupRequest 请求对象
     * @return CompletableFuture<UpdateCollectorChannelGroupResponse>
     */
    public CompletableFuture<UpdateCollectorChannelGroupResponse> updateCollectorChannelGroupAsync(
        UpdateCollectorChannelGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateCollectorChannelGroup);
    }

    /**
     * 更新采集通道分组
     *
     * 更新采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorChannelGroupRequest 请求对象
     * @return AsyncInvoker<UpdateCollectorChannelGroupRequest, UpdateCollectorChannelGroupResponse>
     */
    public AsyncInvoker<UpdateCollectorChannelGroupRequest, UpdateCollectorChannelGroupResponse> updateCollectorChannelGroupAsyncInvoker(
        UpdateCollectorChannelGroupRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateCollectorChannelGroup, hcClient);
    }

    /**
     * 更新采集连接
     *
     * 更新采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorConnectionRequest 请求对象
     * @return CompletableFuture<UpdateCollectorConnectionResponse>
     */
    public CompletableFuture<UpdateCollectorConnectionResponse> updateCollectorConnectionAsync(
        UpdateCollectorConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateCollectorConnection);
    }

    /**
     * 更新采集连接
     *
     * 更新采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateCollectorConnectionRequest, UpdateCollectorConnectionResponse>
     */
    public AsyncInvoker<UpdateCollectorConnectionRequest, UpdateCollectorConnectionResponse> updateCollectorConnectionAsyncInvoker(
        UpdateCollectorConnectionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateCollectorConnection, hcClient);
    }

    /**
     * 点击保存按钮
     *
     * 点击保存按钮
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateComponentConfigurationResponse>
     */
    public CompletableFuture<UpdateComponentConfigurationResponse> updateComponentConfigurationAsync(
        UpdateComponentConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateComponentConfiguration);
    }

    /**
     * 点击保存按钮
     *
     * 点击保存按钮
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResponse>
     */
    public AsyncInvoker<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResponse> updateComponentConfigurationAsyncInvoker(
        UpdateComponentConfigurationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateComponentConfiguration, hcClient);
    }

    /**
     * 更新插件配置模板
     *
     * 更新某个在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentTemplateRequest 请求对象
     * @return CompletableFuture<UpdateComponentTemplateResponse>
     */
    public CompletableFuture<UpdateComponentTemplateResponse> updateComponentTemplateAsync(
        UpdateComponentTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateComponentTemplate);
    }

    /**
     * 更新插件配置模板
     *
     * 更新某个在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateComponentTemplateRequest, UpdateComponentTemplateResponse>
     */
    public AsyncInvoker<UpdateComponentTemplateRequest, UpdateComponentTemplateResponse> updateComponentTemplateAsyncInvoker(
        UpdateComponentTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateComponentTemplate, hcClient);
    }

    /**
     * 更新字典
     *
     * 更新字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationDictionariesRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationDictionariesResponse>
     */
    public CompletableFuture<UpdateConfigurationDictionariesResponse> updateConfigurationDictionariesAsync(
        UpdateConfigurationDictionariesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateConfigurationDictionaries);
    }

    /**
     * 更新字典
     *
     * 更新字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationDictionariesRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationDictionariesRequest, UpdateConfigurationDictionariesResponse>
     */
    public AsyncInvoker<UpdateConfigurationDictionariesRequest, UpdateConfigurationDictionariesResponse> updateConfigurationDictionariesAsyncInvoker(
        UpdateConfigurationDictionariesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateConfigurationDictionaries, hcClient);
    }

    /**
     * 更新操作连接
     *
     * 更新操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return CompletableFuture<UpdateConnectionResponse>
     */
    public CompletableFuture<UpdateConnectionResponse> updateConnectionAsync(UpdateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateConnection);
    }

    /**
     * 更新操作连接
     *
     * 更新操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionAsyncInvoker(
        UpdateConnectionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateConnection, hcClient);
    }

    /**
     * 编辑数据对象
     *
     * 编辑数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataobjectRequest 请求对象
     * @return CompletableFuture<UpdateDataobjectResponse>
     */
    public CompletableFuture<UpdateDataobjectResponse> updateDataobjectAsync(UpdateDataobjectRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateDataobject);
    }

    /**
     * 编辑数据对象
     *
     * 编辑数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataobjectRequest 请求对象
     * @return AsyncInvoker<UpdateDataobjectRequest, UpdateDataobjectResponse>
     */
    public AsyncInvoker<UpdateDataobjectRequest, UpdateDataobjectResponse> updateDataobjectAsyncInvoker(
        UpdateDataobjectRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateDataobject, hcClient);
    }

    /**
     * 修改数据空间
     *
     * 修改数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataspaceRequest 请求对象
     * @return CompletableFuture<UpdateDataspaceResponse>
     */
    public CompletableFuture<UpdateDataspaceResponse> updateDataspaceAsync(UpdateDataspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateDataspace);
    }

    /**
     * 修改数据空间
     *
     * 修改数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataspaceRequest 请求对象
     * @return AsyncInvoker<UpdateDataspaceRequest, UpdateDataspaceResponse>
     */
    public AsyncInvoker<UpdateDataspaceRequest, UpdateDataspaceResponse> updateDataspaceAsyncInvoker(
        UpdateDataspaceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateDataspace, hcClient);
    }

    /**
     * 更新威胁情报
     *
     * 更新威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndicatorRequest 请求对象
     * @return CompletableFuture<UpdateIndicatorResponse>
     */
    public CompletableFuture<UpdateIndicatorResponse> updateIndicatorAsync(UpdateIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateIndicator);
    }

    /**
     * 更新威胁情报
     *
     * 更新威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndicatorRequest 请求对象
     * @return AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>
     */
    public AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicatorAsyncInvoker(
        UpdateIndicatorRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateIndicator, hcClient);
    }

    /**
     * 修改布局
     *
     * 修改布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutRequest 请求对象
     * @return CompletableFuture<UpdateLayoutResponse>
     */
    public CompletableFuture<UpdateLayoutResponse> updateLayoutAsync(UpdateLayoutRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateLayout);
    }

    /**
     * 修改布局
     *
     * 修改布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutRequest 请求对象
     * @return AsyncInvoker<UpdateLayoutRequest, UpdateLayoutResponse>
     */
    public AsyncInvoker<UpdateLayoutRequest, UpdateLayoutResponse> updateLayoutAsyncInvoker(
        UpdateLayoutRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateLayout, hcClient);
    }

    /**
     * 批量更新布局页面
     *
     * 更新页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutWizardsRequest 请求对象
     * @return CompletableFuture<UpdateLayoutWizardsResponse>
     */
    public CompletableFuture<UpdateLayoutWizardsResponse> updateLayoutWizardsAsync(UpdateLayoutWizardsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateLayoutWizards);
    }

    /**
     * 批量更新布局页面
     *
     * 更新页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutWizardsRequest 请求对象
     * @return AsyncInvoker<UpdateLayoutWizardsRequest, UpdateLayoutWizardsResponse>
     */
    public AsyncInvoker<UpdateLayoutWizardsRequest, UpdateLayoutWizardsResponse> updateLayoutWizardsAsyncInvoker(
        UpdateLayoutWizardsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateLayoutWizards, hcClient);
    }

    /**
     * 修改单个映射
     *
     * 修改单个映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMapperRequest 请求对象
     * @return CompletableFuture<UpdateMapperResponse>
     */
    public CompletableFuture<UpdateMapperResponse> updateMapperAsync(UpdateMapperRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateMapper);
    }

    /**
     * 修改单个映射
     *
     * 修改单个映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMapperRequest 请求对象
     * @return AsyncInvoker<UpdateMapperRequest, UpdateMapperResponse>
     */
    public AsyncInvoker<UpdateMapperRequest, UpdateMapperResponse> updateMapperAsyncInvoker(
        UpdateMapperRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateMapper, hcClient);
    }

    /**
     * 修分类映射启用禁用状态
     *
     * 修分类映射启用禁用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMappingInfoStatusRequest 请求对象
     * @return CompletableFuture<UpdateMappingInfoStatusResponse>
     */
    public CompletableFuture<UpdateMappingInfoStatusResponse> updateMappingInfoStatusAsync(
        UpdateMappingInfoStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateMappingInfoStatus);
    }

    /**
     * 修分类映射启用禁用状态
     *
     * 修分类映射启用禁用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMappingInfoStatusRequest 请求对象
     * @return AsyncInvoker<UpdateMappingInfoStatusRequest, UpdateMappingInfoStatusResponse>
     */
    public AsyncInvoker<UpdateMappingInfoStatusRequest, UpdateMappingInfoStatusResponse> updateMappingInfoStatusAsyncInvoker(
        UpdateMappingInfoStatusRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateMappingInfoStatus, hcClient);
    }

    /**
     * 更新指标定义
     *
     * 更新指标定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricsRequest 请求对象
     * @return CompletableFuture<UpdateMetricsResponse>
     */
    public CompletableFuture<UpdateMetricsResponse> updateMetricsAsync(UpdateMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateMetrics);
    }

    /**
     * 更新指标定义
     *
     * 更新指标定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricsRequest 请求对象
     * @return AsyncInvoker<UpdateMetricsRequest, UpdateMetricsResponse>
     */
    public AsyncInvoker<UpdateMetricsRequest, UpdateMetricsResponse> updateMetricsAsyncInvoker(
        UpdateMetricsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateMetrics, hcClient);
    }

    /**
     * 更新布局模块
     *
     * 更新模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleRequest 请求对象
     * @return CompletableFuture<UpdateModuleResponse>
     */
    public CompletableFuture<UpdateModuleResponse> updateModuleAsync(UpdateModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateModule);
    }

    /**
     * 更新布局模块
     *
     * 更新模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleRequest 请求对象
     * @return AsyncInvoker<UpdateModuleRequest, UpdateModuleResponse>
     */
    public AsyncInvoker<UpdateModuleRequest, UpdateModuleResponse> updateModuleAsyncInvoker(
        UpdateModuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateModule, hcClient);
    }

    /**
     * 更新节点补充信息
     *
     * 更新节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNodeRequest 请求对象
     * @return CompletableFuture<UpdateNodeResponse>
     */
    public CompletableFuture<UpdateNodeResponse> updateNodeAsync(UpdateNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateNode);
    }

    /**
     * 更新节点补充信息
     *
     * 更新节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNodeRequest 请求对象
     * @return AsyncInvoker<UpdateNodeRequest, UpdateNodeResponse>
     */
    public AsyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeAsyncInvoker(UpdateNodeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateNode, hcClient);
    }

    /**
     * 修改数据管道
     *
     * 修改数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeRequest 请求对象
     * @return CompletableFuture<UpdatePipeResponse>
     */
    public CompletableFuture<UpdatePipeResponse> updatePipeAsync(UpdatePipeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePipe);
    }

    /**
     * 修改数据管道
     *
     * 修改数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeRequest 请求对象
     * @return AsyncInvoker<UpdatePipeRequest, UpdatePipeResponse>
     */
    public AsyncInvoker<UpdatePipeRequest, UpdatePipeResponse> updatePipeAsyncInvoker(UpdatePipeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updatePipe, hcClient);
    }

    /**
     * 修改索引
     *
     * 修改索引
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeIndexRequest 请求对象
     * @return CompletableFuture<UpdatePipeIndexResponse>
     */
    public CompletableFuture<UpdatePipeIndexResponse> updatePipeIndexAsync(UpdatePipeIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePipeIndex);
    }

    /**
     * 修改索引
     *
     * 修改索引
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeIndexRequest 请求对象
     * @return AsyncInvoker<UpdatePipeIndexRequest, UpdatePipeIndexResponse>
     */
    public AsyncInvoker<UpdatePipeIndexRequest, UpdatePipeIndexResponse> updatePipeIndexAsyncInvoker(
        UpdatePipeIndexRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updatePipeIndex, hcClient);
    }

    /**
     * 修改剧本
     *
     * 修改剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookResponse>
     */
    public CompletableFuture<UpdatePlaybookResponse> updatePlaybookAsync(UpdatePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePlaybook);
    }

    /**
     * 修改剧本
     *
     * 修改剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>
     */
    public AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybookAsyncInvoker(
        UpdatePlaybookRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updatePlaybook, hcClient);
    }

    /**
     * 更新剧本动作
     *
     * 更新剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookActionRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookActionResponse>
     */
    public CompletableFuture<UpdatePlaybookActionResponse> updatePlaybookActionAsync(
        UpdatePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePlaybookAction);
    }

    /**
     * 更新剧本动作
     *
     * 更新剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookActionRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>
     */
    public AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookActionAsyncInvoker(
        UpdatePlaybookActionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updatePlaybookAction, hcClient);
    }

    /**
     * 更新剧本规则
     *
     * 更新剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRuleRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookRuleResponse>
     */
    public CompletableFuture<UpdatePlaybookRuleResponse> updatePlaybookRuleAsync(UpdatePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePlaybookRule);
    }

    /**
     * 更新剧本规则
     *
     * 更新剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>
     */
    public AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRuleAsyncInvoker(
        UpdatePlaybookRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updatePlaybookRule, hcClient);
    }

    /**
     * 更新剧本版本
     *
     * 更新剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookVersionRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookVersionResponse>
     */
    public CompletableFuture<UpdatePlaybookVersionResponse> updatePlaybookVersionAsync(
        UpdatePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePlaybookVersion);
    }

    /**
     * 更新剧本版本
     *
     * 更新剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>
     */
    public AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersionAsyncInvoker(
        UpdatePlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updatePlaybookVersion, hcClient);
    }

    /**
     * 更新收件人邮箱状态
     *
     * 更新收件人邮箱状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecipientsEmailStatusRequest 请求对象
     * @return CompletableFuture<UpdateRecipientsEmailStatusResponse>
     */
    public CompletableFuture<UpdateRecipientsEmailStatusResponse> updateRecipientsEmailStatusAsync(
        UpdateRecipientsEmailStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateRecipientsEmailStatus);
    }

    /**
     * 更新收件人邮箱状态
     *
     * 更新收件人邮箱状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecipientsEmailStatusRequest 请求对象
     * @return AsyncInvoker<UpdateRecipientsEmailStatusRequest, UpdateRecipientsEmailStatusResponse>
     */
    public AsyncInvoker<UpdateRecipientsEmailStatusRequest, UpdateRecipientsEmailStatusResponse> updateRecipientsEmailStatusAsyncInvoker(
        UpdateRecipientsEmailStatusRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateRecipientsEmailStatus, hcClient);
    }

    /**
     * 更新报告
     *
     * 更新报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportRequest 请求对象
     * @return CompletableFuture<UpdateReportResponse>
     */
    public CompletableFuture<UpdateReportResponse> updateReportAsync(UpdateReportRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateReport);
    }

    /**
     * 更新报告
     *
     * 更新报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportRequest 请求对象
     * @return AsyncInvoker<UpdateReportRequest, UpdateReportResponse>
     */
    public AsyncInvoker<UpdateReportRequest, UpdateReportResponse> updateReportAsyncInvoker(
        UpdateReportRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateReport, hcClient);
    }

    /**
     * 修改检索条件
     *
     * 修改检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSearchConditionRequest 请求对象
     * @return CompletableFuture<UpdateSearchConditionResponse>
     */
    public CompletableFuture<UpdateSearchConditionResponse> updateSearchConditionAsync(
        UpdateSearchConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateSearchCondition);
    }

    /**
     * 修改检索条件
     *
     * 修改检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSearchConditionRequest 请求对象
     * @return AsyncInvoker<UpdateSearchConditionRequest, UpdateSearchConditionResponse>
     */
    public AsyncInvoker<UpdateSearchConditionRequest, UpdateSearchConditionResponse> updateSearchConditionAsyncInvoker(
        UpdateSearchConditionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateSearchCondition, hcClient);
    }

    /**
     * 更新订阅资源
     *
     * 更新订阅资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionOrderRequest 请求对象
     * @return CompletableFuture<UpdateSubscriptionOrderResponse>
     */
    public CompletableFuture<UpdateSubscriptionOrderResponse> updateSubscriptionOrderAsync(
        UpdateSubscriptionOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateSubscriptionOrder);
    }

    /**
     * 更新订阅资源
     *
     * 更新订阅资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionOrderRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionOrderRequest, UpdateSubscriptionOrderResponse>
     */
    public AsyncInvoker<UpdateSubscriptionOrderRequest, UpdateSubscriptionOrderResponse> updateSubscriptionOrderAsyncInvoker(
        UpdateSubscriptionOrderRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateSubscriptionOrder, hcClient);
    }

    /**
     * 更新标签值
     *
     * 更新标签值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTagValueRequest 请求对象
     * @return CompletableFuture<UpdateTagValueResponse>
     */
    public CompletableFuture<UpdateTagValueResponse> updateTagValueAsync(UpdateTagValueRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateTagValue);
    }

    /**
     * 更新标签值
     *
     * 更新标签值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTagValueRequest 请求对象
     * @return AsyncInvoker<UpdateTagValueRequest, UpdateTagValueResponse>
     */
    public AsyncInvoker<UpdateTagValueRequest, UpdateTagValueResponse> updateTagValueAsyncInvoker(
        UpdateTagValueRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateTagValue, hcClient);
    }

    /**
     * 更新待办的信息
     *
     * 更新待办的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse>
     */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateTask);
    }

    /**
     * 更新待办的信息
     *
     * 更新待办的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateTask, hcClient);
    }

    /**
     * 更新VPC终端节点服务
     *
     * 更新VPC终端节点服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcEndpointServiceRequest 请求对象
     * @return CompletableFuture<UpdateVpcEndpointServiceResponse>
     */
    public CompletableFuture<UpdateVpcEndpointServiceResponse> updateVpcEndpointServiceAsync(
        UpdateVpcEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateVpcEndpointService);
    }

    /**
     * 更新VPC终端节点服务
     *
     * 更新VPC终端节点服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcEndpointServiceRequest 请求对象
     * @return AsyncInvoker<UpdateVpcEndpointServiceRequest, UpdateVpcEndpointServiceResponse>
     */
    public AsyncInvoker<UpdateVpcEndpointServiceRequest, UpdateVpcEndpointServiceResponse> updateVpcEndpointServiceAsyncInvoker(
        UpdateVpcEndpointServiceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateVpcEndpointService, hcClient);
    }

    /**
     * 更新流程实例
     *
     * 更新流程实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowInstanceRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowInstanceResponse>
     */
    public CompletableFuture<UpdateWorkflowInstanceResponse> updateWorkflowInstanceAsync(
        UpdateWorkflowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateWorkflowInstance);
    }

    /**
     * 更新流程实例
     *
     * 更新流程实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowInstanceRequest, UpdateWorkflowInstanceResponse>
     */
    public AsyncInvoker<UpdateWorkflowInstanceRequest, UpdateWorkflowInstanceResponse> updateWorkflowInstanceAsyncInvoker(
        UpdateWorkflowInstanceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateWorkflowInstance, hcClient);
    }

    /**
     * 更新工作空间
     *
     * 更新工作空间名称、描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateWorkspace);
    }

    /**
     * 更新工作空间
     *
     * 更新工作空间名称、描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateWorkspace, hcClient);
    }

    /**
     * 上传附件
     *
     * 上传附件至OBS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAttachmentRequest 请求对象
     * @return CompletableFuture<UploadAttachmentResponse>
     */
    public CompletableFuture<UploadAttachmentResponse> uploadAttachmentAsync(UploadAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.uploadAttachment);
    }

    /**
     * 上传附件
     *
     * 上传附件至OBS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAttachmentRequest 请求对象
     * @return AsyncInvoker<UploadAttachmentRequest, UploadAttachmentResponse>
     */
    public AsyncInvoker<UploadAttachmentRequest, UploadAttachmentResponse> uploadAttachmentAsyncInvoker(
        UploadAttachmentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.uploadAttachment, hcClient);
    }

    /**
     * 校验流程版本
     *
     * 校验流程版本.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAopWorkflowVersionRequest 请求对象
     * @return CompletableFuture<ValidateAopWorkflowVersionResponse>
     */
    public CompletableFuture<ValidateAopWorkflowVersionResponse> validateAopWorkflowVersionAsync(
        ValidateAopWorkflowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.validateAopWorkflowVersion);
    }

    /**
     * 校验流程版本
     *
     * 校验流程版本.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAopWorkflowVersionRequest 请求对象
     * @return AsyncInvoker<ValidateAopWorkflowVersionRequest, ValidateAopWorkflowVersionResponse>
     */
    public AsyncInvoker<ValidateAopWorkflowVersionRequest, ValidateAopWorkflowVersionResponse> validateAopWorkflowVersionAsyncInvoker(
        ValidateAopWorkflowVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.validateAopWorkflowVersion, hcClient);
    }

}
