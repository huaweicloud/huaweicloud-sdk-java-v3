package com.huaweicloud.sdk.secmaster.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class SecMasterClient {

    protected HcClient hcClient;

    public SecMasterClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SecMasterClient> newBuilder() {
        ClientBuilder<SecMasterClient> clientBuilder = new ClientBuilder<>(SecMasterClient::new);
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
     * @return BatchCreateDataobjectRelationsResponse
     */
    public BatchCreateDataobjectRelationsResponse batchCreateDataobjectRelations(
        BatchCreateDataobjectRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.batchCreateDataobjectRelations);
    }

    /**
     * 批量关联数据对象
     *
     * 批量关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDataobjectRelationsRequest 请求对象
     * @return SyncInvoker<BatchCreateDataobjectRelationsRequest, BatchCreateDataobjectRelationsResponse>
     */
    public SyncInvoker<BatchCreateDataobjectRelationsRequest, BatchCreateDataobjectRelationsResponse> batchCreateDataobjectRelationsInvoker(
        BatchCreateDataobjectRelationsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.batchCreateDataobjectRelations, hcClient);
    }

    /**
     * 批量创建数据对象
     *
     * 数据面批量创建数据类纳管的数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDatapanelObjectsRequest 请求对象
     * @return BatchCreateDatapanelObjectsResponse
     */
    public BatchCreateDatapanelObjectsResponse batchCreateDatapanelObjects(BatchCreateDatapanelObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.batchCreateDatapanelObjects);
    }

    /**
     * 批量创建数据对象
     *
     * 数据面批量创建数据类纳管的数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDatapanelObjectsRequest 请求对象
     * @return SyncInvoker<BatchCreateDatapanelObjectsRequest, BatchCreateDatapanelObjectsResponse>
     */
    public SyncInvoker<BatchCreateDatapanelObjectsRequest, BatchCreateDatapanelObjectsResponse> batchCreateDatapanelObjectsInvoker(
        BatchCreateDatapanelObjectsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.batchCreateDatapanelObjects, hcClient);
    }

    /**
     * 批量查询指标结果
     *
     * 批量查询指标结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSearchMetricHitsRequest 请求对象
     * @return BatchSearchMetricHitsResponse
     */
    public BatchSearchMetricHitsResponse batchSearchMetricHits(BatchSearchMetricHitsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.batchSearchMetricHits);
    }

    /**
     * 批量查询指标结果
     *
     * 批量查询指标结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSearchMetricHitsRequest 请求对象
     * @return SyncInvoker<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse>
     */
    public SyncInvoker<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse> batchSearchMetricHitsInvoker(
        BatchSearchMetricHitsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.batchSearchMetricHits, hcClient);
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
     * @return BatchTagResourcesResponse
     */
    public BatchTagResourcesResponse batchTagResources(BatchTagResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.batchTagResources);
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
     * @return SyncInvoker<BatchTagResourcesRequest, BatchTagResourcesResponse>
     */
    public SyncInvoker<BatchTagResourcesRequest, BatchTagResourcesResponse> batchTagResourcesInvoker(
        BatchTagResourcesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.batchTagResources, hcClient);
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
     * @return BatchUntagResourcesResponse
     */
    public BatchUntagResourcesResponse batchUntagResources(BatchUntagResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.batchUntagResources);
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
     * @return SyncInvoker<BatchUntagResourcesRequest, BatchUntagResourcesResponse>
     */
    public SyncInvoker<BatchUntagResourcesRequest, BatchUntagResourcesResponse> batchUntagResourcesInvoker(
        BatchUntagResourcesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.batchUntagResources, hcClient);
    }

    /**
     * 批量修改目录
     *
     * 批量修改自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCatalogueRequest 请求对象
     * @return BatchUpdateCatalogueResponse
     */
    public BatchUpdateCatalogueResponse batchUpdateCatalogue(BatchUpdateCatalogueRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.batchUpdateCatalogue);
    }

    /**
     * 批量修改目录
     *
     * 批量修改自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateCatalogueRequest 请求对象
     * @return SyncInvoker<BatchUpdateCatalogueRequest, BatchUpdateCatalogueResponse>
     */
    public SyncInvoker<BatchUpdateCatalogueRequest, BatchUpdateCatalogueResponse> batchUpdateCatalogueInvoker(
        BatchUpdateCatalogueRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.batchUpdateCatalogue, hcClient);
    }

    /**
     * 更新告警
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertRequest 请求对象
     * @return ChangeAlertResponse
     */
    public ChangeAlertResponse changeAlert(ChangeAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changeAlert);
    }

    /**
     * 更新告警
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertRequest 请求对象
     * @return SyncInvoker<ChangeAlertRequest, ChangeAlertResponse>
     */
    public SyncInvoker<ChangeAlertRequest, ChangeAlertResponse> changeAlertInvoker(ChangeAlertRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.changeAlert, hcClient);
    }

    /**
     * 批量更新告警
     *
     * 批量更新告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertsRequest 请求对象
     * @return ChangeAlertsResponse
     */
    public ChangeAlertsResponse changeAlerts(ChangeAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changeAlerts);
    }

    /**
     * 批量更新告警
     *
     * 批量更新告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertsRequest 请求对象
     * @return SyncInvoker<ChangeAlertsRequest, ChangeAlertsResponse>
     */
    public SyncInvoker<ChangeAlertsRequest, ChangeAlertsResponse> changeAlertsInvoker(ChangeAlertsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.changeAlerts, hcClient);
    }

    /**
     * 更新事件
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentRequest 请求对象
     * @return ChangeIncidentResponse
     */
    public ChangeIncidentResponse changeIncident(ChangeIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changeIncident);
    }

    /**
     * 更新事件
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentRequest 请求对象
     * @return SyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>
     */
    public SyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse> changeIncidentInvoker(
        ChangeIncidentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.changeIncident, hcClient);
    }

    /**
     * 批量更新事件
     *
     * 更新事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentsRequest 请求对象
     * @return ChangeIncidentsResponse
     */
    public ChangeIncidentsResponse changeIncidents(ChangeIncidentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changeIncidents);
    }

    /**
     * 批量更新事件
     *
     * 更新事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentsRequest 请求对象
     * @return SyncInvoker<ChangeIncidentsRequest, ChangeIncidentsResponse>
     */
    public SyncInvoker<ChangeIncidentsRequest, ChangeIncidentsResponse> changeIncidentsInvoker(
        ChangeIncidentsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.changeIncidents, hcClient);
    }

    /**
     * 操作剧本实例
     *
     * 操作剧本实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePlaybookInstanceRequest 请求对象
     * @return ChangePlaybookInstanceResponse
     */
    public ChangePlaybookInstanceResponse changePlaybookInstance(ChangePlaybookInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changePlaybookInstance);
    }

    /**
     * 操作剧本实例
     *
     * 操作剧本实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePlaybookInstanceRequest 请求对象
     * @return SyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>
     */
    public SyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstanceInvoker(
        ChangePlaybookInstanceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.changePlaybookInstance, hcClient);
    }

    /**
     * 更新资产信息
     *
     * 编辑资产，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceRequest 请求对象
     * @return ChangeResourceResponse
     */
    public ChangeResourceResponse changeResource(ChangeResourceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changeResource);
    }

    /**
     * 更新资产信息
     *
     * 编辑资产，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceRequest 请求对象
     * @return SyncInvoker<ChangeResourceRequest, ChangeResourceResponse>
     */
    public SyncInvoker<ChangeResourceRequest, ChangeResourceResponse> changeResourceInvoker(
        ChangeResourceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.changeResource, hcClient);
    }

    /**
     * 复制映射
     *
     * 复制映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyMappingRequest 请求对象
     * @return CopyMappingResponse
     */
    public CopyMappingResponse copyMapping(CopyMappingRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.copyMapping);
    }

    /**
     * 复制映射
     *
     * 复制映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyMappingRequest 请求对象
     * @return SyncInvoker<CopyMappingRequest, CopyMappingResponse>
     */
    public SyncInvoker<CopyMappingRequest, CopyMappingResponse> copyMappingInvoker(CopyMappingRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.copyMapping, hcClient);
    }

    /**
     * 克隆剧本及版本
     *
     * 克隆剧本及版本（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPlaybookVersionRequest 请求对象
     * @return CopyPlaybookVersionResponse
     */
    public CopyPlaybookVersionResponse copyPlaybookVersion(CopyPlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.copyPlaybookVersion);
    }

    /**
     * 克隆剧本及版本
     *
     * 克隆剧本及版本（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPlaybookVersionRequest 请求对象
     * @return SyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>
     */
    public SyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersionInvoker(
        CopyPlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.copyPlaybookVersion, hcClient);
    }

    /**
     * 查询资源实例数量
     *
     * 使用标签过滤实例，查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceRequest 请求对象
     * @return CountResourceInstanceResponse
     */
    public CountResourceInstanceResponse countResourceInstance(CountResourceInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.countResourceInstance);
    }

    /**
     * 查询资源实例数量
     *
     * 使用标签过滤实例，查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceRequest 请求对象
     * @return SyncInvoker<CountResourceInstanceRequest, CountResourceInstanceResponse>
     */
    public SyncInvoker<CountResourceInstanceRequest, CountResourceInstanceResponse> countResourceInstanceInvoker(
        CountResourceInstanceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.countResourceInstance, hcClient);
    }

    /**
     * 创建告警
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRequest 请求对象
     * @return CreateAlertResponse
     */
    public CreateAlertResponse createAlert(CreateAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAlert);
    }

    /**
     * 创建告警
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRequest 请求对象
     * @return SyncInvoker<CreateAlertRequest, CreateAlertResponse>
     */
    public SyncInvoker<CreateAlertRequest, CreateAlertResponse> createAlertInvoker(CreateAlertRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAlert, hcClient);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return CreateAlertRuleResponse
     */
    public CreateAlertRuleResponse createAlertRule(CreateAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAlertRule);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>
     */
    public SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRuleInvoker(
        CreateAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAlertRule, hcClient);
    }

    /**
     * 模拟告警规则
     *
     * 模拟告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleSimulationRequest 请求对象
     * @return CreateAlertRuleSimulationResponse
     */
    public CreateAlertRuleSimulationResponse createAlertRuleSimulation(CreateAlertRuleSimulationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAlertRuleSimulation);
    }

    /**
     * 模拟告警规则
     *
     * 模拟告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleSimulationRequest 请求对象
     * @return SyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse>
     */
    public SyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulationInvoker(
        CreateAlertRuleSimulationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAlertRuleSimulation, hcClient);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowRequest 请求对象
     * @return CreateAopWorkflowResponse
     */
    public CreateAopWorkflowResponse createAopWorkflow(CreateAopWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAopWorkflow);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowRequest 请求对象
     * @return SyncInvoker<CreateAopWorkflowRequest, CreateAopWorkflowResponse>
     */
    public SyncInvoker<CreateAopWorkflowRequest, CreateAopWorkflowResponse> createAopWorkflowInvoker(
        CreateAopWorkflowRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAopWorkflow, hcClient);
    }

    /**
     * 创建流程版本
     *
     * 创建流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowVersionRequest 请求对象
     * @return CreateAopWorkflowVersionResponse
     */
    public CreateAopWorkflowVersionResponse createAopWorkflowVersion(CreateAopWorkflowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAopWorkflowVersion);
    }

    /**
     * 创建流程版本
     *
     * 创建流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowVersionRequest 请求对象
     * @return SyncInvoker<CreateAopWorkflowVersionRequest, CreateAopWorkflowVersionResponse>
     */
    public SyncInvoker<CreateAopWorkflowVersionRequest, CreateAopWorkflowVersionResponse> createAopWorkflowVersionInvoker(
        CreateAopWorkflowVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAopWorkflowVersion, hcClient);
    }

    /**
     * 审核流程版本的发布
     *
     * 审核流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowVersionApprovelRequest 请求对象
     * @return CreateAopWorkflowVersionApprovelResponse
     */
    public CreateAopWorkflowVersionApprovelResponse createAopWorkflowVersionApprovel(
        CreateAopWorkflowVersionApprovelRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAopWorkflowVersionApprovel);
    }

    /**
     * 审核流程版本的发布
     *
     * 审核流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAopWorkflowVersionApprovelRequest 请求对象
     * @return SyncInvoker<CreateAopWorkflowVersionApprovelRequest, CreateAopWorkflowVersionApprovelResponse>
     */
    public SyncInvoker<CreateAopWorkflowVersionApprovelRequest, CreateAopWorkflowVersionApprovelResponse> createAopWorkflowVersionApprovelInvoker(
        CreateAopWorkflowVersionApprovelRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAopWorkflowVersionApprovel, hcClient);
    }

    /**
     * 告警转事件
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchOrderAlertsRequest 请求对象
     * @return CreateBatchOrderAlertsResponse
     */
    public CreateBatchOrderAlertsResponse createBatchOrderAlerts(CreateBatchOrderAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createBatchOrderAlerts);
    }

    /**
     * 告警转事件
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchOrderAlertsRequest 请求对象
     * @return SyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse>
     */
    public SyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> createBatchOrderAlertsInvoker(
        CreateBatchOrderAlertsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createBatchOrderAlerts, hcClient);
    }

    /**
     * 创建自定义目录
     *
     * 新增自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCatalogueRequest 请求对象
     * @return CreateCatalogueResponse
     */
    public CreateCatalogueResponse createCatalogue(CreateCatalogueRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCatalogue);
    }

    /**
     * 创建自定义目录
     *
     * 新增自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCatalogueRequest 请求对象
     * @return SyncInvoker<CreateCatalogueRequest, CreateCatalogueResponse>
     */
    public SyncInvoker<CreateCatalogueRequest, CreateCatalogueResponse> createCatalogueInvoker(
        CreateCatalogueRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCatalogue, hcClient);
    }

    /**
     * 新增分类
     *
     * 新增分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClassifierRequest 请求对象
     * @return CreateClassifierResponse
     */
    public CreateClassifierResponse createClassifier(CreateClassifierRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createClassifier);
    }

    /**
     * 新增分类
     *
     * 新增分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClassifierRequest 请求对象
     * @return SyncInvoker<CreateClassifierRequest, CreateClassifierResponse>
     */
    public SyncInvoker<CreateClassifierRequest, CreateClassifierResponse> createClassifierInvoker(
        CreateClassifierRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createClassifier, hcClient);
    }

    /**
     * 保存云服务采集配置
     *
     * 保存云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectConfigRequest 请求对象
     * @return CreateCollectConfigResponse
     */
    public CreateCollectConfigResponse createCollectConfig(CreateCollectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCollectConfig);
    }

    /**
     * 保存云服务采集配置
     *
     * 保存云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectConfigRequest 请求对象
     * @return SyncInvoker<CreateCollectConfigRequest, CreateCollectConfigResponse>
     */
    public SyncInvoker<CreateCollectConfigRequest, CreateCollectConfigResponse> createCollectConfigInvoker(
        CreateCollectConfigRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCollectConfig, hcClient);
    }

    /**
     * 创建采集通道
     *
     * 创建采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelRequest 请求对象
     * @return CreateCollectorChannelResponse
     */
    public CreateCollectorChannelResponse createCollectorChannel(CreateCollectorChannelRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCollectorChannel);
    }

    /**
     * 创建采集通道
     *
     * 创建采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelRequest 请求对象
     * @return SyncInvoker<CreateCollectorChannelRequest, CreateCollectorChannelResponse>
     */
    public SyncInvoker<CreateCollectorChannelRequest, CreateCollectorChannelResponse> createCollectorChannelInvoker(
        CreateCollectorChannelRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCollectorChannel, hcClient);
    }

    /**
     * 创建采集通道分组
     *
     * 创建采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelGroupRequest 请求对象
     * @return CreateCollectorChannelGroupResponse
     */
    public CreateCollectorChannelGroupResponse createCollectorChannelGroup(CreateCollectorChannelGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCollectorChannelGroup);
    }

    /**
     * 创建采集通道分组
     *
     * 创建采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelGroupRequest 请求对象
     * @return SyncInvoker<CreateCollectorChannelGroupRequest, CreateCollectorChannelGroupResponse>
     */
    public SyncInvoker<CreateCollectorChannelGroupRequest, CreateCollectorChannelGroupResponse> createCollectorChannelGroupInvoker(
        CreateCollectorChannelGroupRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCollectorChannelGroup, hcClient);
    }

    /**
     * 执行采集通道操作
     *
     * 执行采集通道操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelOperationRequest 请求对象
     * @return CreateCollectorChannelOperationResponse
     */
    public CreateCollectorChannelOperationResponse createCollectorChannelOperation(
        CreateCollectorChannelOperationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCollectorChannelOperation);
    }

    /**
     * 执行采集通道操作
     *
     * 执行采集通道操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorChannelOperationRequest 请求对象
     * @return SyncInvoker<CreateCollectorChannelOperationRequest, CreateCollectorChannelOperationResponse>
     */
    public SyncInvoker<CreateCollectorChannelOperationRequest, CreateCollectorChannelOperationResponse> createCollectorChannelOperationInvoker(
        CreateCollectorChannelOperationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCollectorChannelOperation, hcClient);
    }

    /**
     * 创建采集连接
     *
     * 创建采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorConnectionRequest 请求对象
     * @return CreateCollectorConnectionResponse
     */
    public CreateCollectorConnectionResponse createCollectorConnection(CreateCollectorConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCollectorConnection);
    }

    /**
     * 创建采集连接
     *
     * 创建采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorConnectionRequest 请求对象
     * @return SyncInvoker<CreateCollectorConnectionRequest, CreateCollectorConnectionResponse>
     */
    public SyncInvoker<CreateCollectorConnectionRequest, CreateCollectorConnectionResponse> createCollectorConnectionInvoker(
        CreateCollectorConnectionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCollectorConnection, hcClient);
    }

    /**
     * 安装采集通道文件
     *
     * 安装采集通道文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorFilesRequest 请求对象
     * @return CreateCollectorFilesResponse
     */
    public CreateCollectorFilesResponse createCollectorFiles(CreateCollectorFilesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCollectorFiles);
    }

    /**
     * 安装采集通道文件
     *
     * 安装采集通道文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorFilesRequest 请求对象
     * @return SyncInvoker<CreateCollectorFilesRequest, CreateCollectorFilesResponse>
     */
    public SyncInvoker<CreateCollectorFilesRequest, CreateCollectorFilesResponse> createCollectorFilesInvoker(
        CreateCollectorFilesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCollectorFiles, hcClient);
    }

    /**
     * 创建采集解析器
     *
     * 创建采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorParserRequest 请求对象
     * @return CreateCollectorParserResponse
     */
    public CreateCollectorParserResponse createCollectorParser(CreateCollectorParserRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCollectorParser);
    }

    /**
     * 创建采集解析器
     *
     * 创建采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectorParserRequest 请求对象
     * @return SyncInvoker<CreateCollectorParserRequest, CreateCollectorParserResponse>
     */
    public SyncInvoker<CreateCollectorParserRequest, CreateCollectorParserResponse> createCollectorParserInvoker(
        CreateCollectorParserRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCollectorParser, hcClient);
    }

    /**
     * 创建插件配置模板
     *
     * 创建在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentTemplateRequest 请求对象
     * @return CreateComponentTemplateResponse
     */
    public CreateComponentTemplateResponse createComponentTemplate(CreateComponentTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createComponentTemplate);
    }

    /**
     * 创建插件配置模板
     *
     * 创建在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentTemplateRequest 请求对象
     * @return SyncInvoker<CreateComponentTemplateRequest, CreateComponentTemplateResponse>
     */
    public SyncInvoker<CreateComponentTemplateRequest, CreateComponentTemplateResponse> createComponentTemplateInvoker(
        CreateComponentTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createComponentTemplate, hcClient);
    }

    /**
     * 创建配置应用
     *
     * 创建配置应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationApplicationRequest 请求对象
     * @return CreateConfigurationApplicationResponse
     */
    public CreateConfigurationApplicationResponse createConfigurationApplication(
        CreateConfigurationApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createConfigurationApplication);
    }

    /**
     * 创建配置应用
     *
     * 创建配置应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationApplicationRequest 请求对象
     * @return SyncInvoker<CreateConfigurationApplicationRequest, CreateConfigurationApplicationResponse>
     */
    public SyncInvoker<CreateConfigurationApplicationRequest, CreateConfigurationApplicationResponse> createConfigurationApplicationInvoker(
        CreateConfigurationApplicationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createConfigurationApplication, hcClient);
    }

    /**
     * 创建字典
     *
     * 创建字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationDictionariesRequest 请求对象
     * @return CreateConfigurationDictionariesResponse
     */
    public CreateConfigurationDictionariesResponse createConfigurationDictionaries(
        CreateConfigurationDictionariesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createConfigurationDictionaries);
    }

    /**
     * 创建字典
     *
     * 创建字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationDictionariesRequest 请求对象
     * @return SyncInvoker<CreateConfigurationDictionariesRequest, CreateConfigurationDictionariesResponse>
     */
    public SyncInvoker<CreateConfigurationDictionariesRequest, CreateConfigurationDictionariesResponse> createConfigurationDictionariesInvoker(
        CreateConfigurationDictionariesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createConfigurationDictionaries, hcClient);
    }

    /**
     * 新建操作连接
     *
     * 新建操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createConnection);
    }

    /**
     * 新建操作连接
     *
     * 新建操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public SyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionInvoker(
        CreateConnectionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createConnection, hcClient);
    }

    /**
     * 数据类类型新增
     *
     * 新增数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataclassTypeRequest 请求对象
     * @return CreateDataclassTypeResponse
     */
    public CreateDataclassTypeResponse createDataclassType(CreateDataclassTypeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createDataclassType);
    }

    /**
     * 数据类类型新增
     *
     * 新增数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataclassTypeRequest 请求对象
     * @return SyncInvoker<CreateDataclassTypeRequest, CreateDataclassTypeResponse>
     */
    public SyncInvoker<CreateDataclassTypeRequest, CreateDataclassTypeResponse> createDataclassTypeInvoker(
        CreateDataclassTypeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createDataclassType, hcClient);
    }

    /**
     * 创建数据对象
     *
     * 创建数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRequest 请求对象
     * @return CreateDataobjectResponse
     */
    public CreateDataobjectResponse createDataobject(CreateDataobjectRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createDataobject);
    }

    /**
     * 创建数据对象
     *
     * 创建数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRequest 请求对象
     * @return SyncInvoker<CreateDataobjectRequest, CreateDataobjectResponse>
     */
    public SyncInvoker<CreateDataobjectRequest, CreateDataobjectResponse> createDataobjectInvoker(
        CreateDataobjectRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createDataobject, hcClient);
    }

    /**
     * 关联数据对象
     *
     * 关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRelationRequest 请求对象
     * @return CreateDataobjectRelationResponse
     */
    public CreateDataobjectRelationResponse createDataobjectRelation(CreateDataobjectRelationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createDataobjectRelation);
    }

    /**
     * 关联数据对象
     *
     * 关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRelationRequest 请求对象
     * @return SyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse>
     */
    public SyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> createDataobjectRelationInvoker(
        CreateDataobjectRelationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createDataobjectRelation, hcClient);
    }

    /**
     * 创建数据空间
     *
     * 创建数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataspaceRequest 请求对象
     * @return CreateDataspaceResponse
     */
    public CreateDataspaceResponse createDataspace(CreateDataspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createDataspace);
    }

    /**
     * 创建数据空间
     *
     * 创建数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataspaceRequest 请求对象
     * @return SyncInvoker<CreateDataspaceRequest, CreateDataspaceResponse>
     */
    public SyncInvoker<CreateDataspaceRequest, CreateDataspaceResponse> createDataspaceInvoker(
        CreateDataspaceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createDataspace, hcClient);
    }

    /**
     * 创建事件
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIncidentRequest 请求对象
     * @return CreateIncidentResponse
     */
    public CreateIncidentResponse createIncident(CreateIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createIncident);
    }

    /**
     * 创建事件
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIncidentRequest 请求对象
     * @return SyncInvoker<CreateIncidentRequest, CreateIncidentResponse>
     */
    public SyncInvoker<CreateIncidentRequest, CreateIncidentResponse> createIncidentInvoker(
        CreateIncidentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createIncident, hcClient);
    }

    /**
     * 创建威胁情报
     *
     * 创建威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndicatorRequest 请求对象
     * @return CreateIndicatorResponse
     */
    public CreateIndicatorResponse createIndicator(CreateIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createIndicator);
    }

    /**
     * 创建威胁情报
     *
     * 创建威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndicatorRequest 请求对象
     * @return SyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>
     */
    public SyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse> createIndicatorInvoker(
        CreateIndicatorRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createIndicator, hcClient);
    }

    /**
     * 创建布局
     *
     * 创建布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutRequest 请求对象
     * @return CreateLayoutResponse
     */
    public CreateLayoutResponse createLayout(CreateLayoutRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createLayout);
    }

    /**
     * 创建布局
     *
     * 创建布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutRequest 请求对象
     * @return SyncInvoker<CreateLayoutRequest, CreateLayoutResponse>
     */
    public SyncInvoker<CreateLayoutRequest, CreateLayoutResponse> createLayoutInvoker(CreateLayoutRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createLayout, hcClient);
    }

    /**
     * 新建布局页面
     *
     * 创建页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutWizardRequest 请求对象
     * @return CreateLayoutWizardResponse
     */
    public CreateLayoutWizardResponse createLayoutWizard(CreateLayoutWizardRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createLayoutWizard);
    }

    /**
     * 新建布局页面
     *
     * 创建页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutWizardRequest 请求对象
     * @return SyncInvoker<CreateLayoutWizardRequest, CreateLayoutWizardResponse>
     */
    public SyncInvoker<CreateLayoutWizardRequest, CreateLayoutWizardResponse> createLayoutWizardInvoker(
        CreateLayoutWizardRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createLayoutWizard, hcClient);
    }

    /**
     * 新增映射
     *
     * 新增映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMapperRequest 请求对象
     * @return CreateMapperResponse
     */
    public CreateMapperResponse createMapper(CreateMapperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createMapper);
    }

    /**
     * 新增映射
     *
     * 新增映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMapperRequest 请求对象
     * @return SyncInvoker<CreateMapperRequest, CreateMapperResponse>
     */
    public SyncInvoker<CreateMapperRequest, CreateMapperResponse> createMapperInvoker(CreateMapperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createMapper, hcClient);
    }

    /**
     * 创建指标
     *
     * 创建指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetricRequest 请求对象
     * @return CreateMetricResponse
     */
    public CreateMetricResponse createMetric(CreateMetricRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createMetric);
    }

    /**
     * 创建指标
     *
     * 创建指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetricRequest 请求对象
     * @return SyncInvoker<CreateMetricRequest, CreateMetricResponse>
     */
    public SyncInvoker<CreateMetricRequest, CreateMetricResponse> createMetricInvoker(CreateMetricRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createMetric, hcClient);
    }

    /**
     * 新建模块
     *
     * 创建模块.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModuleRequest 请求对象
     * @return CreateModuleResponse
     */
    public CreateModuleResponse createModule(CreateModuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createModule);
    }

    /**
     * 新建模块
     *
     * 创建模块.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModuleRequest 请求对象
     * @return SyncInvoker<CreateModuleRequest, CreateModuleResponse>
     */
    public SyncInvoker<CreateModuleRequest, CreateModuleResponse> createModuleInvoker(CreateModuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createModule, hcClient);
    }

    /**
     * 创建评论
     *
     * 创建评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNoteRequest 请求对象
     * @return CreateNoteResponse
     */
    public CreateNoteResponse createNote(CreateNoteRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createNote);
    }

    /**
     * 创建评论
     *
     * 创建评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNoteRequest 请求对象
     * @return SyncInvoker<CreateNoteRequest, CreateNoteResponse>
     */
    public SyncInvoker<CreateNoteRequest, CreateNoteResponse> createNoteInvoker(CreateNoteRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createNote, hcClient);
    }

    /**
     * 创建数据管道
     *
     * 创建数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeRequest 请求对象
     * @return CreatePipeResponse
     */
    public CreatePipeResponse createPipe(CreatePipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPipe);
    }

    /**
     * 创建数据管道
     *
     * 创建数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeRequest 请求对象
     * @return SyncInvoker<CreatePipeRequest, CreatePipeResponse>
     */
    public SyncInvoker<CreatePipeRequest, CreatePipeResponse> createPipeInvoker(CreatePipeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPipe, hcClient);
    }

    /**
     * 开启实时消费
     *
     * 开启实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeConsumptionRequest 请求对象
     * @return CreatePipeConsumptionResponse
     */
    public CreatePipeConsumptionResponse createPipeConsumption(CreatePipeConsumptionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPipeConsumption);
    }

    /**
     * 开启实时消费
     *
     * 开启实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeConsumptionRequest 请求对象
     * @return SyncInvoker<CreatePipeConsumptionRequest, CreatePipeConsumptionResponse>
     */
    public SyncInvoker<CreatePipeConsumptionRequest, CreatePipeConsumptionResponse> createPipeConsumptionInvoker(
        CreatePipeConsumptionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPipeConsumption, hcClient);
    }

    /**
     * 创建剧本
     *
     * 创建剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRequest 请求对象
     * @return CreatePlaybookResponse
     */
    public CreatePlaybookResponse createPlaybook(CreatePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybook);
    }

    /**
     * 创建剧本
     *
     * 创建剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRequest 请求对象
     * @return SyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>
     */
    public SyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybookInvoker(
        CreatePlaybookRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPlaybook, hcClient);
    }

    /**
     * 创建剧本动作
     *
     * 创建剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookActionRequest 请求对象
     * @return CreatePlaybookActionResponse
     */
    public CreatePlaybookActionResponse createPlaybookAction(CreatePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybookAction);
    }

    /**
     * 创建剧本动作
     *
     * 创建剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookActionRequest 请求对象
     * @return SyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>
     */
    public SyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookActionInvoker(
        CreatePlaybookActionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPlaybookAction, hcClient);
    }

    /**
     * 审核剧本
     *
     * 审核剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookApproveRequest 请求对象
     * @return CreatePlaybookApproveResponse
     */
    public CreatePlaybookApproveResponse createPlaybookApprove(CreatePlaybookApproveRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybookApprove);
    }

    /**
     * 审核剧本
     *
     * 审核剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookApproveRequest 请求对象
     * @return SyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>
     */
    public SyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApproveInvoker(
        CreatePlaybookApproveRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPlaybookApprove, hcClient);
    }

    /**
     * 创建剧本规则
     *
     * 创建剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRuleRequest 请求对象
     * @return CreatePlaybookRuleResponse
     */
    public CreatePlaybookRuleResponse createPlaybookRule(CreatePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybookRule);
    }

    /**
     * 创建剧本规则
     *
     * 创建剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRuleRequest 请求对象
     * @return SyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>
     */
    public SyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRuleInvoker(
        CreatePlaybookRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPlaybookRule, hcClient);
    }

    /**
     * 创建剧本版本
     *
     * 创建剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookVersionRequest 请求对象
     * @return CreatePlaybookVersionResponse
     */
    public CreatePlaybookVersionResponse createPlaybookVersion(CreatePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybookVersion);
    }

    /**
     * 创建剧本版本
     *
     * 创建剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookVersionRequest 请求对象
     * @return SyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>
     */
    public SyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersionInvoker(
        CreatePlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPlaybookVersion, hcClient);
    }

    /**
     * 创建预处理规则
     *
     * 创建预处理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreProcessRulesRequest 请求对象
     * @return CreatePreProcessRulesResponse
     */
    public CreatePreProcessRulesResponse createPreProcessRules(CreatePreProcessRulesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPreProcessRules);
    }

    /**
     * 创建预处理规则
     *
     * 创建预处理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreProcessRulesRequest 请求对象
     * @return SyncInvoker<CreatePreProcessRulesRequest, CreatePreProcessRulesResponse>
     */
    public SyncInvoker<CreatePreProcessRulesRequest, CreatePreProcessRulesResponse> createPreProcessRulesInvoker(
        CreatePreProcessRulesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPreProcessRules, hcClient);
    }

    /**
     * 创建安全报告
     *
     * 创建安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return CreateReportResponse
     */
    public CreateReportResponse createReport(CreateReportRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createReport);
    }

    /**
     * 创建安全报告
     *
     * 创建安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return SyncInvoker<CreateReportRequest, CreateReportResponse>
     */
    public SyncInvoker<CreateReportRequest, CreateReportResponse> createReportInvoker(CreateReportRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createReport, hcClient);
    }

    /**
     * 创建云日志资源
     *
     * 创建云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceConfigRequest 请求对象
     * @return CreateResourceConfigResponse
     */
    public CreateResourceConfigResponse createResourceConfig(CreateResourceConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createResourceConfig);
    }

    /**
     * 创建云日志资源
     *
     * 创建云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceConfigRequest 请求对象
     * @return SyncInvoker<CreateResourceConfigRequest, CreateResourceConfigResponse>
     */
    public SyncInvoker<CreateResourceConfigRequest, CreateResourceConfigResponse> createResourceConfigInvoker(
        CreateResourceConfigRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createResourceConfig, hcClient);
    }

    /**
     * 创建重试应急策略
     *
     * 创建重试应急策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetryPolicyRequest 请求对象
     * @return CreateRetryPolicyResponse
     */
    public CreateRetryPolicyResponse createRetryPolicy(CreateRetryPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createRetryPolicy);
    }

    /**
     * 创建重试应急策略
     *
     * 创建重试应急策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetryPolicyRequest 请求对象
     * @return SyncInvoker<CreateRetryPolicyRequest, CreateRetryPolicyResponse>
     */
    public SyncInvoker<CreateRetryPolicyRequest, CreateRetryPolicyResponse> createRetryPolicyInvoker(
        CreateRetryPolicyRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createRetryPolicy, hcClient);
    }

    /**
     * 执行分析
     *
     * 执行分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchAnalysisRequest 请求对象
     * @return CreateSearchAnalysisResponse
     */
    public CreateSearchAnalysisResponse createSearchAnalysis(CreateSearchAnalysisRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createSearchAnalysis);
    }

    /**
     * 执行分析
     *
     * 执行分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchAnalysisRequest 请求对象
     * @return SyncInvoker<CreateSearchAnalysisRequest, CreateSearchAnalysisResponse>
     */
    public SyncInvoker<CreateSearchAnalysisRequest, CreateSearchAnalysisResponse> createSearchAnalysisInvoker(
        CreateSearchAnalysisRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createSearchAnalysis, hcClient);
    }

    /**
     * 创建检索条件
     *
     * 创建检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchConditionRequest 请求对象
     * @return CreateSearchConditionResponse
     */
    public CreateSearchConditionResponse createSearchCondition(CreateSearchConditionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createSearchCondition);
    }

    /**
     * 创建检索条件
     *
     * 创建检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSearchConditionRequest 请求对象
     * @return SyncInvoker<CreateSearchConditionRequest, CreateSearchConditionResponse>
     */
    public SyncInvoker<CreateSearchConditionRequest, CreateSearchConditionResponse> createSearchConditionInvoker(
        CreateSearchConditionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createSearchCondition, hcClient);
    }

    /**
     * 创建委托并授权
     *
     * 根据body体中的角色和作用范围，创建委托，并将策略赋予给委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceAgencyRequest 请求对象
     * @return CreateServiceAgencyResponse
     */
    public CreateServiceAgencyResponse createServiceAgency(CreateServiceAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createServiceAgency);
    }

    /**
     * 创建委托并授权
     *
     * 根据body体中的角色和作用范围，创建委托，并将策略赋予给委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceAgencyRequest 请求对象
     * @return SyncInvoker<CreateServiceAgencyRequest, CreateServiceAgencyResponse>
     */
    public SyncInvoker<CreateServiceAgencyRequest, CreateServiceAgencyResponse> createServiceAgencyInvoker(
        CreateServiceAgencyRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createServiceAgency, hcClient);
    }

    /**
     * 创建数据投递
     *
     * 创建数据投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShipperRequest 请求对象
     * @return CreateShipperResponse
     */
    public CreateShipperResponse createShipper(CreateShipperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createShipper);
    }

    /**
     * 创建数据投递
     *
     * 创建数据投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShipperRequest 请求对象
     * @return SyncInvoker<CreateShipperRequest, CreateShipperResponse>
     */
    public SyncInvoker<CreateShipperRequest, CreateShipperResponse> createShipperInvoker(CreateShipperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createShipper, hcClient);
    }

    /**
     * 创建委托权限
     *
     * 创建委托权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShipperDelegateAuthRequest 请求对象
     * @return CreateShipperDelegateAuthResponse
     */
    public CreateShipperDelegateAuthResponse createShipperDelegateAuth(CreateShipperDelegateAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createShipperDelegateAuth);
    }

    /**
     * 创建委托权限
     *
     * 创建委托权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShipperDelegateAuthRequest 请求对象
     * @return SyncInvoker<CreateShipperDelegateAuthRequest, CreateShipperDelegateAuthResponse>
     */
    public SyncInvoker<CreateShipperDelegateAuthRequest, CreateShipperDelegateAuthResponse> createShipperDelegateAuthInvoker(
        CreateShipperDelegateAuthRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createShipperDelegateAuth, hcClient);
    }

    /**
     * 开通或配置安全云脑订阅
     *
     * 安全云脑开通与配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionOrderRequest 请求对象
     * @return CreateSubscriptionOrderResponse
     */
    public CreateSubscriptionOrderResponse createSubscriptionOrder(CreateSubscriptionOrderRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createSubscriptionOrder);
    }

    /**
     * 开通或配置安全云脑订阅
     *
     * 安全云脑开通与配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionOrderRequest 请求对象
     * @return SyncInvoker<CreateSubscriptionOrderRequest, CreateSubscriptionOrderResponse>
     */
    public SyncInvoker<CreateSubscriptionOrderRequest, CreateSubscriptionOrderResponse> createSubscriptionOrderInvoker(
        CreateSubscriptionOrderRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createSubscriptionOrder, hcClient);
    }

    /**
     * 创建流程实例
     *
     * 创建流程实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowInstanceRequest 请求对象
     * @return CreateWorkflowInstanceResponse
     */
    public CreateWorkflowInstanceResponse createWorkflowInstance(CreateWorkflowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createWorkflowInstance);
    }

    /**
     * 创建流程实例
     *
     * 创建流程实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowInstanceRequest 请求对象
     * @return SyncInvoker<CreateWorkflowInstanceRequest, CreateWorkflowInstanceResponse>
     */
    public SyncInvoker<CreateWorkflowInstanceRequest, CreateWorkflowInstanceResponse> createWorkflowInstanceInvoker(
        CreateWorkflowInstanceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createWorkflowInstance, hcClient);
    }

    /**
     * 新建工作空间
     *
     * 在使用安全云脑的基线检查、告警管理、安全分析、安全编排等功能前，需要创建工作空间，它可以将资源划分为各个不同的工作场景，避免资源冗余查找不便，影响日常使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createWorkspace);
    }

    /**
     * 新建工作空间
     *
     * 在使用安全云脑的基线检查、告警管理、安全分析、安全编排等功能前，需要创建工作空间，它可以将资源划分为各个不同的工作场景，避免资源冗余查找不便，影响日常使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceInvoker(
        CreateWorkspaceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createWorkspace, hcClient);
    }

    /**
     * 删除告警
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRequest 请求对象
     * @return DeleteAlertResponse
     */
    public DeleteAlertResponse deleteAlert(DeleteAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAlert);
    }

    /**
     * 删除告警
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRequest 请求对象
     * @return SyncInvoker<DeleteAlertRequest, DeleteAlertResponse>
     */
    public SyncInvoker<DeleteAlertRequest, DeleteAlertResponse> deleteAlertInvoker(DeleteAlertRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteAlert, hcClient);
    }

    /**
     * 删除告警规则
     *
     * 删除告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return DeleteAlertRuleResponse
     */
    public DeleteAlertRuleResponse deleteAlertRule(DeleteAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAlertRule);
    }

    /**
     * 删除告警规则
     *
     * 删除告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
     */
    public SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRuleInvoker(
        DeleteAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteAlertRule, hcClient);
    }

    /**
     * 批量删除告警
     *
     * 批量删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertsRequest 请求对象
     * @return DeleteAlertsResponse
     */
    public DeleteAlertsResponse deleteAlerts(DeleteAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAlerts);
    }

    /**
     * 批量删除告警
     *
     * 批量删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertsRequest 请求对象
     * @return SyncInvoker<DeleteAlertsRequest, DeleteAlertsResponse>
     */
    public SyncInvoker<DeleteAlertsRequest, DeleteAlertsResponse> deleteAlertsInvoker(DeleteAlertsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteAlerts, hcClient);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAopWorkflowRequest 请求对象
     * @return DeleteAopWorkflowResponse
     */
    public DeleteAopWorkflowResponse deleteAopWorkflow(DeleteAopWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAopWorkflow);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAopWorkflowRequest 请求对象
     * @return SyncInvoker<DeleteAopWorkflowRequest, DeleteAopWorkflowResponse>
     */
    public SyncInvoker<DeleteAopWorkflowRequest, DeleteAopWorkflowResponse> deleteAopWorkflowInvoker(
        DeleteAopWorkflowRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteAopWorkflow, hcClient);
    }

    /**
     * 删除流程版本
     *
     * 删除流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAopWorkflowVersionRequest 请求对象
     * @return DeleteAopWorkflowVersionResponse
     */
    public DeleteAopWorkflowVersionResponse deleteAopWorkflowVersion(DeleteAopWorkflowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAopWorkflowVersion);
    }

    /**
     * 删除流程版本
     *
     * 删除流程版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAopWorkflowVersionRequest 请求对象
     * @return SyncInvoker<DeleteAopWorkflowVersionRequest, DeleteAopWorkflowVersionResponse>
     */
    public SyncInvoker<DeleteAopWorkflowVersionRequest, DeleteAopWorkflowVersionResponse> deleteAopWorkflowVersionInvoker(
        DeleteAopWorkflowVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteAopWorkflowVersion, hcClient);
    }

    /**
     * 批量删除目录
     *
     * 批量删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCatalogueRequest 请求对象
     * @return DeleteCatalogueResponse
     */
    public DeleteCatalogueResponse deleteCatalogue(DeleteCatalogueRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteCatalogue);
    }

    /**
     * 批量删除目录
     *
     * 批量删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCatalogueRequest 请求对象
     * @return SyncInvoker<DeleteCatalogueRequest, DeleteCatalogueResponse>
     */
    public SyncInvoker<DeleteCatalogueRequest, DeleteCatalogueResponse> deleteCatalogueInvoker(
        DeleteCatalogueRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteCatalogue, hcClient);
    }

    /**
     * 删除分类
     *
     * 删除分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClassifierRequest 请求对象
     * @return DeleteClassifierResponse
     */
    public DeleteClassifierResponse deleteClassifier(DeleteClassifierRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteClassifier);
    }

    /**
     * 删除分类
     *
     * 删除分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClassifierRequest 请求对象
     * @return SyncInvoker<DeleteClassifierRequest, DeleteClassifierResponse>
     */
    public SyncInvoker<DeleteClassifierRequest, DeleteClassifierResponse> deleteClassifierInvoker(
        DeleteClassifierRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteClassifier, hcClient);
    }

    /**
     * 删除采集通道
     *
     * 删除采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorChannelRequest 请求对象
     * @return DeleteCollectorChannelResponse
     */
    public DeleteCollectorChannelResponse deleteCollectorChannel(DeleteCollectorChannelRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteCollectorChannel);
    }

    /**
     * 删除采集通道
     *
     * 删除采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorChannelRequest 请求对象
     * @return SyncInvoker<DeleteCollectorChannelRequest, DeleteCollectorChannelResponse>
     */
    public SyncInvoker<DeleteCollectorChannelRequest, DeleteCollectorChannelResponse> deleteCollectorChannelInvoker(
        DeleteCollectorChannelRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteCollectorChannel, hcClient);
    }

    /**
     * 删除采集通道分组
     *
     * 删除采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorChannelGroupRequest 请求对象
     * @return DeleteCollectorChannelGroupResponse
     */
    public DeleteCollectorChannelGroupResponse deleteCollectorChannelGroup(DeleteCollectorChannelGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteCollectorChannelGroup);
    }

    /**
     * 删除采集通道分组
     *
     * 删除采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorChannelGroupRequest 请求对象
     * @return SyncInvoker<DeleteCollectorChannelGroupRequest, DeleteCollectorChannelGroupResponse>
     */
    public SyncInvoker<DeleteCollectorChannelGroupRequest, DeleteCollectorChannelGroupResponse> deleteCollectorChannelGroupInvoker(
        DeleteCollectorChannelGroupRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteCollectorChannelGroup, hcClient);
    }

    /**
     * 删除采集连接
     *
     * 删除采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorConnectionRequest 请求对象
     * @return DeleteCollectorConnectionResponse
     */
    public DeleteCollectorConnectionResponse deleteCollectorConnection(DeleteCollectorConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteCollectorConnection);
    }

    /**
     * 删除采集连接
     *
     * 删除采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorConnectionRequest 请求对象
     * @return SyncInvoker<DeleteCollectorConnectionRequest, DeleteCollectorConnectionResponse>
     */
    public SyncInvoker<DeleteCollectorConnectionRequest, DeleteCollectorConnectionResponse> deleteCollectorConnectionInvoker(
        DeleteCollectorConnectionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteCollectorConnection, hcClient);
    }

    /**
     * 删除采集解析器
     *
     * 删除采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorParserRequest 请求对象
     * @return DeleteCollectorParserResponse
     */
    public DeleteCollectorParserResponse deleteCollectorParser(DeleteCollectorParserRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteCollectorParser);
    }

    /**
     * 删除采集解析器
     *
     * 删除采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectorParserRequest 请求对象
     * @return SyncInvoker<DeleteCollectorParserRequest, DeleteCollectorParserResponse>
     */
    public SyncInvoker<DeleteCollectorParserRequest, DeleteCollectorParserResponse> deleteCollectorParserInvoker(
        DeleteCollectorParserRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteCollectorParser, hcClient);
    }

    /**
     * 删除插件配置模板
     *
     * 删除某个在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentTemplateRequest 请求对象
     * @return DeleteComponentTemplateResponse
     */
    public DeleteComponentTemplateResponse deleteComponentTemplate(DeleteComponentTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteComponentTemplate);
    }

    /**
     * 删除插件配置模板
     *
     * 删除某个在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentTemplateRequest 请求对象
     * @return SyncInvoker<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse>
     */
    public SyncInvoker<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse> deleteComponentTemplateInvoker(
        DeleteComponentTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteComponentTemplate, hcClient);
    }

    /**
     * 删除字典
     *
     * 删除字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationDictionariesRequest 请求对象
     * @return DeleteConfigurationDictionariesResponse
     */
    public DeleteConfigurationDictionariesResponse deleteConfigurationDictionaries(
        DeleteConfigurationDictionariesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteConfigurationDictionaries);
    }

    /**
     * 删除字典
     *
     * 删除字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationDictionariesRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationDictionariesRequest, DeleteConfigurationDictionariesResponse>
     */
    public SyncInvoker<DeleteConfigurationDictionariesRequest, DeleteConfigurationDictionariesResponse> deleteConfigurationDictionariesInvoker(
        DeleteConfigurationDictionariesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteConfigurationDictionaries, hcClient);
    }

    /**
     * 删除操作连接
     *
     * 删除操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteConnection);
    }

    /**
     * 删除操作连接
     *
     * 删除操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionInvoker(
        DeleteConnectionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteConnection, hcClient);
    }

    /**
     * 数据类类型删除
     *
     * 删除数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataclassTypeRequest 请求对象
     * @return DeleteDataclassTypeResponse
     */
    public DeleteDataclassTypeResponse deleteDataclassType(DeleteDataclassTypeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteDataclassType);
    }

    /**
     * 数据类类型删除
     *
     * 删除数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataclassTypeRequest 请求对象
     * @return SyncInvoker<DeleteDataclassTypeRequest, DeleteDataclassTypeResponse>
     */
    public SyncInvoker<DeleteDataclassTypeRequest, DeleteDataclassTypeResponse> deleteDataclassTypeInvoker(
        DeleteDataclassTypeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteDataclassType, hcClient);
    }

    /**
     * 取消关联数据对象
     *
     * 取消关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectRelationRequest 请求对象
     * @return DeleteDataobjectRelationResponse
     */
    public DeleteDataobjectRelationResponse deleteDataobjectRelation(DeleteDataobjectRelationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteDataobjectRelation);
    }

    /**
     * 取消关联数据对象
     *
     * 取消关联数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectRelationRequest 请求对象
     * @return SyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse>
     */
    public SyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> deleteDataobjectRelationInvoker(
        DeleteDataobjectRelationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteDataobjectRelation, hcClient);
    }

    /**
     * 批量删除数据对象
     *
     * 批量删除数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectsRequest 请求对象
     * @return DeleteDataobjectsResponse
     */
    public DeleteDataobjectsResponse deleteDataobjects(DeleteDataobjectsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteDataobjects);
    }

    /**
     * 批量删除数据对象
     *
     * 批量删除数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectsRequest 请求对象
     * @return SyncInvoker<DeleteDataobjectsRequest, DeleteDataobjectsResponse>
     */
    public SyncInvoker<DeleteDataobjectsRequest, DeleteDataobjectsResponse> deleteDataobjectsInvoker(
        DeleteDataobjectsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteDataobjects, hcClient);
    }

    /**
     * 删除数据空间
     *
     * 删除数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataspaceRequest 请求对象
     * @return DeleteDataspaceResponse
     */
    public DeleteDataspaceResponse deleteDataspace(DeleteDataspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteDataspace);
    }

    /**
     * 删除数据空间
     *
     * 删除数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataspaceRequest 请求对象
     * @return SyncInvoker<DeleteDataspaceRequest, DeleteDataspaceResponse>
     */
    public SyncInvoker<DeleteDataspaceRequest, DeleteDataspaceResponse> deleteDataspaceInvoker(
        DeleteDataspaceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteDataspace, hcClient);
    }

    /**
     * 删除事件
     *
     * 删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentRequest 请求对象
     * @return DeleteIncidentResponse
     */
    public DeleteIncidentResponse deleteIncident(DeleteIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteIncident);
    }

    /**
     * 删除事件
     *
     * 删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentRequest 请求对象
     * @return SyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>
     */
    public SyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncidentInvoker(
        DeleteIncidentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteIncident, hcClient);
    }

    /**
     * 批量删除事件
     *
     * 批量删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentsRequest 请求对象
     * @return DeleteIncidentsResponse
     */
    public DeleteIncidentsResponse deleteIncidents(DeleteIncidentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteIncidents);
    }

    /**
     * 批量删除事件
     *
     * 批量删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentsRequest 请求对象
     * @return SyncInvoker<DeleteIncidentsRequest, DeleteIncidentsResponse>
     */
    public SyncInvoker<DeleteIncidentsRequest, DeleteIncidentsResponse> deleteIncidentsInvoker(
        DeleteIncidentsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteIncidents, hcClient);
    }

    /**
     * 删除威胁情报
     *
     * 删除威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndicatorRequest 请求对象
     * @return DeleteIndicatorResponse
     */
    public DeleteIndicatorResponse deleteIndicator(DeleteIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteIndicator);
    }

    /**
     * 删除威胁情报
     *
     * 删除威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndicatorRequest 请求对象
     * @return SyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>
     */
    public SyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicatorInvoker(
        DeleteIndicatorRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteIndicator, hcClient);
    }

    /**
     * 删除布局页面
     *
     * 删除页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutWizardRequest 请求对象
     * @return DeleteLayoutWizardResponse
     */
    public DeleteLayoutWizardResponse deleteLayoutWizard(DeleteLayoutWizardRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteLayoutWizard);
    }

    /**
     * 删除布局页面
     *
     * 删除页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutWizardRequest 请求对象
     * @return SyncInvoker<DeleteLayoutWizardRequest, DeleteLayoutWizardResponse>
     */
    public SyncInvoker<DeleteLayoutWizardRequest, DeleteLayoutWizardResponse> deleteLayoutWizardInvoker(
        DeleteLayoutWizardRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteLayoutWizard, hcClient);
    }

    /**
     * 删除布局
     *
     * 删除布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutsRequest 请求对象
     * @return DeleteLayoutsResponse
     */
    public DeleteLayoutsResponse deleteLayouts(DeleteLayoutsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteLayouts);
    }

    /**
     * 删除布局
     *
     * 删除布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutsRequest 请求对象
     * @return SyncInvoker<DeleteLayoutsRequest, DeleteLayoutsResponse>
     */
    public SyncInvoker<DeleteLayoutsRequest, DeleteLayoutsResponse> deleteLayoutsInvoker(DeleteLayoutsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteLayouts, hcClient);
    }

    /**
     * 删除lts日志订阅
     *
     * 删除云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsCloudLogRequest 请求对象
     * @return DeleteLtsCloudLogResponse
     */
    public DeleteLtsCloudLogResponse deleteLtsCloudLog(DeleteLtsCloudLogRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteLtsCloudLog);
    }

    /**
     * 删除lts日志订阅
     *
     * 删除云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsCloudLogRequest 请求对象
     * @return SyncInvoker<DeleteLtsCloudLogRequest, DeleteLtsCloudLogResponse>
     */
    public SyncInvoker<DeleteLtsCloudLogRequest, DeleteLtsCloudLogResponse> deleteLtsCloudLogInvoker(
        DeleteLtsCloudLogRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteLtsCloudLog, hcClient);
    }

    /**
     * 删除映射信息
     *
     * 删除映射信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMappingInfoRequest 请求对象
     * @return DeleteMappingInfoResponse
     */
    public DeleteMappingInfoResponse deleteMappingInfo(DeleteMappingInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteMappingInfo);
    }

    /**
     * 删除映射信息
     *
     * 删除映射信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMappingInfoRequest 请求对象
     * @return SyncInvoker<DeleteMappingInfoRequest, DeleteMappingInfoResponse>
     */
    public SyncInvoker<DeleteMappingInfoRequest, DeleteMappingInfoResponse> deleteMappingInfoInvoker(
        DeleteMappingInfoRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteMappingInfo, hcClient);
    }

    /**
     * 删除指标
     *
     * 删除指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricsRequest 请求对象
     * @return DeleteMetricsResponse
     */
    public DeleteMetricsResponse deleteMetrics(DeleteMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteMetrics);
    }

    /**
     * 删除指标
     *
     * 删除指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricsRequest 请求对象
     * @return SyncInvoker<DeleteMetricsRequest, DeleteMetricsResponse>
     */
    public SyncInvoker<DeleteMetricsRequest, DeleteMetricsResponse> deleteMetricsInvoker(DeleteMetricsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteMetrics, hcClient);
    }

    /**
     * 删除模块
     *
     * 删除模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModuleRequest 请求对象
     * @return DeleteModuleResponse
     */
    public DeleteModuleResponse deleteModule(DeleteModuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteModule);
    }

    /**
     * 删除模块
     *
     * 删除模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModuleRequest 请求对象
     * @return SyncInvoker<DeleteModuleRequest, DeleteModuleResponse>
     */
    public SyncInvoker<DeleteModuleRequest, DeleteModuleResponse> deleteModuleInvoker(DeleteModuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteModule, hcClient);
    }

    /**
     * 通过节点id删除节点
     *
     * 删除节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodeRequest 请求对象
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteNode);
    }

    /**
     * 通过节点id删除节点
     *
     * 删除节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodeRequest 请求对象
     * @return SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>
     */
    public SyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeInvoker(DeleteNodeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteNode, hcClient);
    }

    /**
     * 删除评论
     *
     * 删除评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotesRequest 请求对象
     * @return DeleteNotesResponse
     */
    public DeleteNotesResponse deleteNotes(DeleteNotesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteNotes);
    }

    /**
     * 删除评论
     *
     * 删除评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotesRequest 请求对象
     * @return SyncInvoker<DeleteNotesRequest, DeleteNotesResponse>
     */
    public SyncInvoker<DeleteNotesRequest, DeleteNotesResponse> deleteNotesInvoker(DeleteNotesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteNotes, hcClient);
    }

    /**
     * 删除数据管道
     *
     * 删除数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeRequest 请求对象
     * @return DeletePipeResponse
     */
    public DeletePipeResponse deletePipe(DeletePipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePipe);
    }

    /**
     * 删除数据管道
     *
     * 删除数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeRequest 请求对象
     * @return SyncInvoker<DeletePipeRequest, DeletePipeResponse>
     */
    public SyncInvoker<DeletePipeRequest, DeletePipeResponse> deletePipeInvoker(DeletePipeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deletePipe, hcClient);
    }

    /**
     * 关闭实时消费
     *
     * 关闭实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeConsumptionRequest 请求对象
     * @return DeletePipeConsumptionResponse
     */
    public DeletePipeConsumptionResponse deletePipeConsumption(DeletePipeConsumptionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePipeConsumption);
    }

    /**
     * 关闭实时消费
     *
     * 关闭实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeConsumptionRequest 请求对象
     * @return SyncInvoker<DeletePipeConsumptionRequest, DeletePipeConsumptionResponse>
     */
    public SyncInvoker<DeletePipeConsumptionRequest, DeletePipeConsumptionResponse> deletePipeConsumptionInvoker(
        DeletePipeConsumptionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deletePipeConsumption, hcClient);
    }

    /**
     * 删除剧本
     *
     * 删除剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRequest 请求对象
     * @return DeletePlaybookResponse
     */
    public DeletePlaybookResponse deletePlaybook(DeletePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePlaybook);
    }

    /**
     * 删除剧本
     *
     * 删除剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRequest 请求对象
     * @return SyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>
     */
    public SyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybookInvoker(
        DeletePlaybookRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deletePlaybook, hcClient);
    }

    /**
     * 删除剧本动作
     *
     * 删除剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookActionRequest 请求对象
     * @return DeletePlaybookActionResponse
     */
    public DeletePlaybookActionResponse deletePlaybookAction(DeletePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePlaybookAction);
    }

    /**
     * 删除剧本动作
     *
     * 删除剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookActionRequest 请求对象
     * @return SyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>
     */
    public SyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookActionInvoker(
        DeletePlaybookActionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deletePlaybookAction, hcClient);
    }

    /**
     * 删除剧本规则
     *
     * 删除剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRuleRequest 请求对象
     * @return DeletePlaybookRuleResponse
     */
    public DeletePlaybookRuleResponse deletePlaybookRule(DeletePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePlaybookRule);
    }

    /**
     * 删除剧本规则
     *
     * 删除剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRuleRequest 请求对象
     * @return SyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>
     */
    public SyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRuleInvoker(
        DeletePlaybookRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deletePlaybookRule, hcClient);
    }

    /**
     * 删除剧本版本
     *
     * 删除剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookVersionRequest 请求对象
     * @return DeletePlaybookVersionResponse
     */
    public DeletePlaybookVersionResponse deletePlaybookVersion(DeletePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePlaybookVersion);
    }

    /**
     * 删除剧本版本
     *
     * 删除剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookVersionRequest 请求对象
     * @return SyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>
     */
    public SyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersionInvoker(
        DeletePlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deletePlaybookVersion, hcClient);
    }

    /**
     * 批量删除应急策略
     *
     * 批量删除应急策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoliciesRequest 请求对象
     * @return DeletePoliciesResponse
     */
    public DeletePoliciesResponse deletePolicies(DeletePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePolicies);
    }

    /**
     * 批量删除应急策略
     *
     * 批量删除应急策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoliciesRequest 请求对象
     * @return SyncInvoker<DeletePoliciesRequest, DeletePoliciesResponse>
     */
    public SyncInvoker<DeletePoliciesRequest, DeletePoliciesResponse> deletePoliciesInvoker(
        DeletePoliciesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deletePolicies, hcClient);
    }

    /**
     * 删除报告
     *
     * 删除报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportRequest 请求对象
     * @return DeleteReportResponse
     */
    public DeleteReportResponse deleteReport(DeleteReportRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteReport);
    }

    /**
     * 删除报告
     *
     * 删除报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportRequest 请求对象
     * @return SyncInvoker<DeleteReportRequest, DeleteReportResponse>
     */
    public SyncInvoker<DeleteReportRequest, DeleteReportResponse> deleteReportInvoker(DeleteReportRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteReport, hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteResource);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public SyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceInvoker(
        DeleteResourceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteResource, hcClient);
    }

    /**
     * 删除检索条件
     *
     * 删除检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSearchConditionRequest 请求对象
     * @return DeleteSearchConditionResponse
     */
    public DeleteSearchConditionResponse deleteSearchCondition(DeleteSearchConditionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteSearchCondition);
    }

    /**
     * 删除检索条件
     *
     * 删除检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSearchConditionRequest 请求对象
     * @return SyncInvoker<DeleteSearchConditionRequest, DeleteSearchConditionResponse>
     */
    public SyncInvoker<DeleteSearchConditionRequest, DeleteSearchConditionResponse> deleteSearchConditionInvoker(
        DeleteSearchConditionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteSearchCondition, hcClient);
    }

    /**
     * 删除投递信息
     *
     * 删除投递信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShipperRequest 请求对象
     * @return DeleteShipperResponse
     */
    public DeleteShipperResponse deleteShipper(DeleteShipperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteShipper);
    }

    /**
     * 删除投递信息
     *
     * 删除投递信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShipperRequest 请求对象
     * @return SyncInvoker<DeleteShipperRequest, DeleteShipperResponse>
     */
    public SyncInvoker<DeleteShipperRequest, DeleteShipperResponse> deleteShipperInvoker(DeleteShipperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteShipper, hcClient);
    }

    /**
     * 删除单个映射
     *
     * 删除单个映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSingleMapperRequest 请求对象
     * @return DeleteSingleMapperResponse
     */
    public DeleteSingleMapperResponse deleteSingleMapper(DeleteSingleMapperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteSingleMapper);
    }

    /**
     * 删除单个映射
     *
     * 删除单个映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSingleMapperRequest 请求对象
     * @return SyncInvoker<DeleteSingleMapperRequest, DeleteSingleMapperResponse>
     */
    public SyncInvoker<DeleteSingleMapperRequest, DeleteSingleMapperResponse> deleteSingleMapperInvoker(
        DeleteSingleMapperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteSingleMapper, hcClient);
    }

    /**
     * 取消订阅资源
     *
     * 安全云脑退订服务接口，目前仅支持按需场景
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionOrderRequest 请求对象
     * @return DeleteSubscriptionOrderResponse
     */
    public DeleteSubscriptionOrderResponse deleteSubscriptionOrder(DeleteSubscriptionOrderRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteSubscriptionOrder);
    }

    /**
     * 取消订阅资源
     *
     * 安全云脑退订服务接口，目前仅支持按需场景
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionOrderRequest 请求对象
     * @return SyncInvoker<DeleteSubscriptionOrderRequest, DeleteSubscriptionOrderResponse>
     */
    public SyncInvoker<DeleteSubscriptionOrderRequest, DeleteSubscriptionOrderResponse> deleteSubscriptionOrderInvoker(
        DeleteSubscriptionOrderRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteSubscriptionOrder, hcClient);
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
     * @return DeleteTagsResponse
     */
    public DeleteTagsResponse deleteTags(DeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteTags);
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
     * @return SyncInvoker<DeleteTagsRequest, DeleteTagsResponse>
     */
    public SyncInvoker<DeleteTagsRequest, DeleteTagsResponse> deleteTagsInvoker(DeleteTagsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteTags, hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteWorkspace);
    }

    /**
     * 删除工作空间
     *
     * 删除工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceInvoker(
        DeleteWorkspaceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteWorkspace, hcClient);
    }

    /**
     * 停用告警规则
     *
     * 停用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return DisableAlertRuleResponse
     */
    public DisableAlertRuleResponse disableAlertRule(DisableAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.disableAlertRule);
    }

    /**
     * 停用告警规则
     *
     * 停用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>
     */
    public SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRuleInvoker(
        DisableAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.disableAlertRule, hcClient);
    }

    /**
     * 下载告警导入模板
     *
     * 下载告警导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的告警样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAlertTemplateRequest 请求对象
     * @return DownloadAlertTemplateResponse
     */
    public DownloadAlertTemplateResponse downloadAlertTemplate(DownloadAlertTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.downloadAlertTemplate);
    }

    /**
     * 下载告警导入模板
     *
     * 下载告警导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的告警样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAlertTemplateRequest 请求对象
     * @return SyncInvoker<DownloadAlertTemplateRequest, DownloadAlertTemplateResponse>
     */
    public SyncInvoker<DownloadAlertTemplateRequest, DownloadAlertTemplateResponse> downloadAlertTemplateInvoker(
        DownloadAlertTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.downloadAlertTemplate, hcClient);
    }

    /**
     * 下载附件
     *
     * 从OBS下载附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return DownloadAttachmentResponse
     */
    public DownloadAttachmentResponse downloadAttachment(DownloadAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.downloadAttachment);
    }

    /**
     * 下载附件
     *
     * 从OBS下载附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return SyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse>
     */
    public SyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachmentInvoker(
        DownloadAttachmentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.downloadAttachment, hcClient);
    }

    /**
     * 下载事件导入模板
     *
     * 下载事件导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的事件样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIncidentTemplateRequest 请求对象
     * @return DownloadIncidentTemplateResponse
     */
    public DownloadIncidentTemplateResponse downloadIncidentTemplate(DownloadIncidentTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.downloadIncidentTemplate);
    }

    /**
     * 下载事件导入模板
     *
     * 下载事件导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的事件样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIncidentTemplateRequest 请求对象
     * @return SyncInvoker<DownloadIncidentTemplateRequest, DownloadIncidentTemplateResponse>
     */
    public SyncInvoker<DownloadIncidentTemplateRequest, DownloadIncidentTemplateResponse> downloadIncidentTemplateInvoker(
        DownloadIncidentTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.downloadIncidentTemplate, hcClient);
    }

    /**
     * 下载情报模板
     *
     * 下载情报导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的情报样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIndicatorTemplateRequest 请求对象
     * @return DownloadIndicatorTemplateResponse
     */
    public DownloadIndicatorTemplateResponse downloadIndicatorTemplate(DownloadIndicatorTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.downloadIndicatorTemplate);
    }

    /**
     * 下载情报模板
     *
     * 下载情报导入模板，模板根据标准的dataclass字段属性来组织，下载时需要实现默认的情报样例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIndicatorTemplateRequest 请求对象
     * @return SyncInvoker<DownloadIndicatorTemplateRequest, DownloadIndicatorTemplateResponse>
     */
    public SyncInvoker<DownloadIndicatorTemplateRequest, DownloadIndicatorTemplateResponse> downloadIndicatorTemplateInvoker(
        DownloadIndicatorTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.downloadIndicatorTemplate, hcClient);
    }

    /**
     * 下载资产导入模板
     *
     * 下载资产导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadResourceTemplateRequest 请求对象
     * @return DownloadResourceTemplateResponse
     */
    public DownloadResourceTemplateResponse downloadResourceTemplate(DownloadResourceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.downloadResourceTemplate);
    }

    /**
     * 下载资产导入模板
     *
     * 下载资产导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadResourceTemplateRequest 请求对象
     * @return SyncInvoker<DownloadResourceTemplateRequest, DownloadResourceTemplateResponse>
     */
    public SyncInvoker<DownloadResourceTemplateRequest, DownloadResourceTemplateResponse> downloadResourceTemplateInvoker(
        DownloadResourceTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.downloadResourceTemplate, hcClient);
    }

    /**
     * 下载漏洞导入模板
     *
     * 下载漏洞导入模板，模板根据标准的dataclass字段属性来组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadVulnerabilityTemplateRequest 请求对象
     * @return DownloadVulnerabilityTemplateResponse
     */
    public DownloadVulnerabilityTemplateResponse downloadVulnerabilityTemplate(
        DownloadVulnerabilityTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.downloadVulnerabilityTemplate);
    }

    /**
     * 下载漏洞导入模板
     *
     * 下载漏洞导入模板，模板根据标准的dataclass字段属性来组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadVulnerabilityTemplateRequest 请求对象
     * @return SyncInvoker<DownloadVulnerabilityTemplateRequest, DownloadVulnerabilityTemplateResponse>
     */
    public SyncInvoker<DownloadVulnerabilityTemplateRequest, DownloadVulnerabilityTemplateResponse> downloadVulnerabilityTemplateInvoker(
        DownloadVulnerabilityTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.downloadVulnerabilityTemplate, hcClient);
    }

    /**
     * 启用告警规则
     *
     * 启用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return EnableAlertRuleResponse
     */
    public EnableAlertRuleResponse enableAlertRule(EnableAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.enableAlertRule);
    }

    /**
     * 启用告警规则
     *
     * 启用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>
     */
    public SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRuleInvoker(
        EnableAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.enableAlertRule, hcClient);
    }

    /**
     * 数据类类型启用/禁用
     *
     * 禁用/启用数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataclassTypeRequest 请求对象
     * @return EnableDataclassTypeResponse
     */
    public EnableDataclassTypeResponse enableDataclassType(EnableDataclassTypeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.enableDataclassType);
    }

    /**
     * 数据类类型启用/禁用
     *
     * 禁用/启用数据类类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataclassTypeRequest 请求对象
     * @return SyncInvoker<EnableDataclassTypeRequest, EnableDataclassTypeResponse>
     */
    public SyncInvoker<EnableDataclassTypeRequest, EnableDataclassTypeResponse> enableDataclassTypeInvoker(
        EnableDataclassTypeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.enableDataclassType, hcClient);
    }

    /**
     * 操作布局
     *
     * 操作布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteLayoutRequest 请求对象
     * @return ExecuteLayoutResponse
     */
    public ExecuteLayoutResponse executeLayout(ExecuteLayoutRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.executeLayout);
    }

    /**
     * 操作布局
     *
     * 操作布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteLayoutRequest 请求对象
     * @return SyncInvoker<ExecuteLayoutRequest, ExecuteLayoutResponse>
     */
    public SyncInvoker<ExecuteLayoutRequest, ExecuteLayoutResponse> executeLayoutInvoker(ExecuteLayoutRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.executeLayout, hcClient);
    }

    /**
     * 操作安全报告
     *
     * 操作安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteReportActionRequest 请求对象
     * @return ExecuteReportActionResponse
     */
    public ExecuteReportActionResponse executeReportAction(ExecuteReportActionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.executeReportAction);
    }

    /**
     * 操作安全报告
     *
     * 操作安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteReportActionRequest 请求对象
     * @return SyncInvoker<ExecuteReportActionRequest, ExecuteReportActionResponse>
     */
    public SyncInvoker<ExecuteReportActionRequest, ExecuteReportActionResponse> executeReportActionInvoker(
        ExecuteReportActionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.executeReportAction, hcClient);
    }

    /**
     * 导出告警
     *
     * 导出告警,若字段是object类型，则将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAlertsRequest 请求对象
     * @return ExportAlertsResponse
     */
    public ExportAlertsResponse exportAlerts(ExportAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportAlerts);
    }

    /**
     * 导出告警
     *
     * 导出告警,若字段是object类型，则将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAlertsRequest 请求对象
     * @return SyncInvoker<ExportAlertsRequest, ExportAlertsResponse>
     */
    public SyncInvoker<ExportAlertsRequest, ExportAlertsResponse> exportAlertsInvoker(ExportAlertsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportAlerts, hcClient);
    }

    /**
     * 导出流程
     *
     * 导出流程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAopworkflowRequest 请求对象
     * @return ExportAopworkflowResponse
     */
    public ExportAopworkflowResponse exportAopworkflow(ExportAopworkflowRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportAopworkflow);
    }

    /**
     * 导出流程
     *
     * 导出流程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAopworkflowRequest 请求对象
     * @return SyncInvoker<ExportAopworkflowRequest, ExportAopworkflowResponse>
     */
    public SyncInvoker<ExportAopworkflowRequest, ExportAopworkflowResponse> exportAopworkflowInvoker(
        ExportAopworkflowRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportAopworkflow, hcClient);
    }

    /**
     * 导出采集解析器
     *
     * 导出采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCollectorParserRequest 请求对象
     * @return ExportCollectorParserResponse
     */
    public ExportCollectorParserResponse exportCollectorParser(ExportCollectorParserRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportCollectorParser);
    }

    /**
     * 导出采集解析器
     *
     * 导出采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCollectorParserRequest 请求对象
     * @return SyncInvoker<ExportCollectorParserRequest, ExportCollectorParserResponse>
     */
    public SyncInvoker<ExportCollectorParserRequest, ExportCollectorParserResponse> exportCollectorParserInvoker(
        ExportCollectorParserRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportCollectorParser, hcClient);
    }

    /**
     * 导出数据对象
     *
     * 导出数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataobjectsRequest 请求对象
     * @return ExportDataobjectsResponse
     */
    public ExportDataobjectsResponse exportDataobjects(ExportDataobjectsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportDataobjects);
    }

    /**
     * 导出数据对象
     *
     * 导出数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataobjectsRequest 请求对象
     * @return SyncInvoker<ExportDataobjectsRequest, ExportDataobjectsResponse>
     */
    public SyncInvoker<ExportDataobjectsRequest, ExportDataobjectsResponse> exportDataobjectsInvoker(
        ExportDataobjectsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportDataobjects, hcClient);
    }

    /**
     * 导出事件
     *
     * 导出事件列表,若字段是object类型，需要将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIncidentsRequest 请求对象
     * @return ExportIncidentsResponse
     */
    public ExportIncidentsResponse exportIncidents(ExportIncidentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportIncidents);
    }

    /**
     * 导出事件
     *
     * 导出事件列表,若字段是object类型，需要将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIncidentsRequest 请求对象
     * @return SyncInvoker<ExportIncidentsRequest, ExportIncidentsResponse>
     */
    public SyncInvoker<ExportIncidentsRequest, ExportIncidentsResponse> exportIncidentsInvoker(
        ExportIncidentsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportIncidents, hcClient);
    }

    /**
     * 导出情报
     *
     * 导出情报,若字段是object类型，则将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIndicatorsRequest 请求对象
     * @return ExportIndicatorsResponse
     */
    public ExportIndicatorsResponse exportIndicators(ExportIndicatorsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportIndicators);
    }

    /**
     * 导出情报
     *
     * 导出情报,若字段是object类型，则将整个子对象的内容导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIndicatorsRequest 请求对象
     * @return SyncInvoker<ExportIndicatorsRequest, ExportIndicatorsResponse>
     */
    public SyncInvoker<ExportIndicatorsRequest, ExportIndicatorsResponse> exportIndicatorsInvoker(
        ExportIndicatorsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportIndicators, hcClient);
    }

    /**
     * 导出剧本信息
     *
     * 导出剧本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPlaybookRequest 请求对象
     * @return ExportPlaybookResponse
     */
    public ExportPlaybookResponse exportPlaybook(ExportPlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportPlaybook);
    }

    /**
     * 导出剧本信息
     *
     * 导出剧本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPlaybookRequest 请求对象
     * @return SyncInvoker<ExportPlaybookRequest, ExportPlaybookResponse>
     */
    public SyncInvoker<ExportPlaybookRequest, ExportPlaybookResponse> exportPlaybookInvoker(
        ExportPlaybookRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportPlaybook, hcClient);
    }

    /**
     * 导出资产列表
     *
     * 导出资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportResourcesRequest 请求对象
     * @return ExportResourcesResponse
     */
    public ExportResourcesResponse exportResources(ExportResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportResources);
    }

    /**
     * 导出资产列表
     *
     * 导出资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportResourcesRequest 请求对象
     * @return SyncInvoker<ExportResourcesRequest, ExportResourcesResponse>
     */
    public SyncInvoker<ExportResourcesRequest, ExportResourcesResponse> exportResourcesInvoker(
        ExportResourcesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportResources, hcClient);
    }

    /**
     * 导出漏洞
     *
     * 导出详细漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulnerabilitiesRequest 请求对象
     * @return ExportVulnerabilitiesResponse
     */
    public ExportVulnerabilitiesResponse exportVulnerabilities(ExportVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.exportVulnerabilities);
    }

    /**
     * 导出漏洞
     *
     * 导出详细漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ExportVulnerabilitiesRequest, ExportVulnerabilitiesResponse>
     */
    public SyncInvoker<ExportVulnerabilitiesRequest, ExportVulnerabilitiesResponse> exportVulnerabilitiesInvoker(
        ExportVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.exportVulnerabilities, hcClient);
    }

    /**
     * 授权处理
     *
     * 授权处理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleShipperAuthorizationRequest 请求对象
     * @return HandleShipperAuthorizationResponse
     */
    public HandleShipperAuthorizationResponse handleShipperAuthorization(HandleShipperAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.handleShipperAuthorization);
    }

    /**
     * 授权处理
     *
     * 授权处理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleShipperAuthorizationRequest 请求对象
     * @return SyncInvoker<HandleShipperAuthorizationRequest, HandleShipperAuthorizationResponse>
     */
    public SyncInvoker<HandleShipperAuthorizationRequest, HandleShipperAuthorizationResponse> handleShipperAuthorizationInvoker(
        HandleShipperAuthorizationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.handleShipperAuthorization, hcClient);
    }

    /**
     * 导入告警
     *
     * 批量导入告警，根据template下载的模板填写告警，告警的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAlertsRequest 请求对象
     * @return ImportAlertsResponse
     */
    public ImportAlertsResponse importAlerts(ImportAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importAlerts);
    }

    /**
     * 导入告警
     *
     * 批量导入告警，根据template下载的模板填写告警，告警的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAlertsRequest 请求对象
     * @return SyncInvoker<ImportAlertsRequest, ImportAlertsResponse>
     */
    public SyncInvoker<ImportAlertsRequest, ImportAlertsResponse> importAlertsInvoker(ImportAlertsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importAlerts, hcClient);
    }

    /**
     * 导入流程信息
     *
     * 导入流程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAopworkflowRequest 请求对象
     * @return ImportAopworkflowResponse
     */
    public ImportAopworkflowResponse importAopworkflow(ImportAopworkflowRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importAopworkflow);
    }

    /**
     * 导入流程信息
     *
     * 导入流程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAopworkflowRequest 请求对象
     * @return SyncInvoker<ImportAopworkflowRequest, ImportAopworkflowResponse>
     */
    public SyncInvoker<ImportAopworkflowRequest, ImportAopworkflowResponse> importAopworkflowInvoker(
        ImportAopworkflowRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importAopworkflow, hcClient);
    }

    /**
     * 导入采集解析器
     *
     * 导入采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCollectorParserRequest 请求对象
     * @return ImportCollectorParserResponse
     */
    public ImportCollectorParserResponse importCollectorParser(ImportCollectorParserRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importCollectorParser);
    }

    /**
     * 导入采集解析器
     *
     * 导入采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCollectorParserRequest 请求对象
     * @return SyncInvoker<ImportCollectorParserRequest, ImportCollectorParserResponse>
     */
    public SyncInvoker<ImportCollectorParserRequest, ImportCollectorParserResponse> importCollectorParserInvoker(
        ImportCollectorParserRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importCollectorParser, hcClient);
    }

    /**
     * 导入数据对象
     *
     * 导入数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataobjectsRequest 请求对象
     * @return ImportDataobjectsResponse
     */
    public ImportDataobjectsResponse importDataobjects(ImportDataobjectsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importDataobjects);
    }

    /**
     * 导入数据对象
     *
     * 导入数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataobjectsRequest 请求对象
     * @return SyncInvoker<ImportDataobjectsRequest, ImportDataobjectsResponse>
     */
    public SyncInvoker<ImportDataobjectsRequest, ImportDataobjectsResponse> importDataobjectsInvoker(
        ImportDataobjectsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importDataobjects, hcClient);
    }

    /**
     * 导入事件
     *
     * 导入事件，根据template下载的模板填写事件，事件的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIncidentsRequest 请求对象
     * @return ImportIncidentsResponse
     */
    public ImportIncidentsResponse importIncidents(ImportIncidentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importIncidents);
    }

    /**
     * 导入事件
     *
     * 导入事件，根据template下载的模板填写事件，事件的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIncidentsRequest 请求对象
     * @return SyncInvoker<ImportIncidentsRequest, ImportIncidentsResponse>
     */
    public SyncInvoker<ImportIncidentsRequest, ImportIncidentsResponse> importIncidentsInvoker(
        ImportIncidentsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importIncidents, hcClient);
    }

    /**
     * 导入情报
     *
     * 批量导入情报，根据template下载的模板填写情报，告警的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIndicatorsRequest 请求对象
     * @return ImportIndicatorsResponse
     */
    public ImportIndicatorsResponse importIndicators(ImportIndicatorsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importIndicators);
    }

    /**
     * 导入情报
     *
     * 批量导入情报，根据template下载的模板填写情报，告警的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIndicatorsRequest 请求对象
     * @return SyncInvoker<ImportIndicatorsRequest, ImportIndicatorsResponse>
     */
    public SyncInvoker<ImportIndicatorsRequest, ImportIndicatorsResponse> importIndicatorsInvoker(
        ImportIndicatorsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importIndicators, hcClient);
    }

    /**
     * 导入剧本信息
     *
     * 导入剧本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPlaybookRequest 请求对象
     * @return ImportPlaybookResponse
     */
    public ImportPlaybookResponse importPlaybook(ImportPlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importPlaybook);
    }

    /**
     * 导入剧本信息
     *
     * 导入剧本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPlaybookRequest 请求对象
     * @return SyncInvoker<ImportPlaybookRequest, ImportPlaybookResponse>
     */
    public SyncInvoker<ImportPlaybookRequest, ImportPlaybookResponse> importPlaybookInvoker(
        ImportPlaybookRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importPlaybook, hcClient);
    }

    /**
     * 导入资产
     *
     * 导入资产，根据下载的模板填写资产，资产的所有字段根据是否必填来限制，参照:资产对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportResourceRequest 请求对象
     * @return ImportResourceResponse
     */
    public ImportResourceResponse importResource(ImportResourceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importResource);
    }

    /**
     * 导入资产
     *
     * 导入资产，根据下载的模板填写资产，资产的所有字段根据是否必填来限制，参照:资产对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportResourceRequest 请求对象
     * @return SyncInvoker<ImportResourceRequest, ImportResourceResponse>
     */
    public SyncInvoker<ImportResourceRequest, ImportResourceResponse> importResourceInvoker(
        ImportResourceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importResource, hcClient);
    }

    /**
     * 导入漏洞
     *
     * 批量导入漏洞，根据template下载的模板填写漏洞，漏洞的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportVulnerabilitiesRequest 请求对象
     * @return ImportVulnerabilitiesResponse
     */
    public ImportVulnerabilitiesResponse importVulnerabilities(ImportVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.importVulnerabilities);
    }

    /**
     * 导入漏洞
     *
     * 批量导入漏洞，根据template下载的模板填写漏洞，漏洞的所有字段根据是否必填来限制，参照:安全事件数据对象定义中的类型和说明来确定, 后台实现时需要校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ImportVulnerabilitiesRequest, ImportVulnerabilitiesResponse>
     */
    public SyncInvoker<ImportVulnerabilitiesRequest, ImportVulnerabilitiesResponse> importVulnerabilitiesInvoker(
        ImportVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.importVulnerabilities, hcClient);
    }

    /**
     * 告警规则总览
     *
     * 告警规则总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return ListAlertRuleMetricsResponse
     */
    public ListAlertRuleMetricsResponse listAlertRuleMetrics(ListAlertRuleMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRuleMetrics);
    }

    /**
     * 告警规则总览
     *
     * 告警规则总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>
     */
    public SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetricsInvoker(
        ListAlertRuleMetricsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlertRuleMetrics, hcClient);
    }

    /**
     * 告警模板总览
     *
     * 告警模板总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplateMetricsRequest 请求对象
     * @return ListAlertRuleTemplateMetricsResponse
     */
    public ListAlertRuleTemplateMetricsResponse listAlertRuleTemplateMetrics(
        ListAlertRuleTemplateMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplateMetrics);
    }

    /**
     * 告警模板总览
     *
     * 告警模板总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplateMetricsRequest 请求对象
     * @return SyncInvoker<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse>
     */
    public SyncInvoker<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> listAlertRuleTemplateMetricsInvoker(
        ListAlertRuleTemplateMetricsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlertRuleTemplateMetrics, hcClient);
    }

    /**
     * 列出告警规则模板
     *
     * 列出告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return ListAlertRuleTemplatesResponse
     */
    public ListAlertRuleTemplatesResponse listAlertRuleTemplates(ListAlertRuleTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplates);
    }

    /**
     * 列出告警规则模板
     *
     * 列出告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>
     */
    public SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplatesInvoker(
        ListAlertRuleTemplatesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlertRuleTemplates, hcClient);
    }

    /**
     * 列出告警规则
     *
     * 列出告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return ListAlertRulesResponse
     */
    public ListAlertRulesResponse listAlertRules(ListAlertRulesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRules);
    }

    /**
     * 列出告警规则
     *
     * 列出告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>
     */
    public SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRulesInvoker(
        ListAlertRulesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlertRules, hcClient);
    }

    /**
     * 搜索告警列表
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertsRequest 请求对象
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlerts(ListAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlerts);
    }

    /**
     * 搜索告警列表
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertsRequest 请求对象
     * @return SyncInvoker<ListAlertsRequest, ListAlertsResponse>
     */
    public SyncInvoker<ListAlertsRequest, ListAlertsResponse> listAlertsInvoker(ListAlertsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlerts, hcClient);
    }

    /**
     * 获取目录全量列表
     *
     * 获取目录全量列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllSecondCatalogueRequest 请求对象
     * @return ListAllSecondCatalogueResponse
     */
    public ListAllSecondCatalogueResponse listAllSecondCatalogue(ListAllSecondCatalogueRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAllSecondCatalogue);
    }

    /**
     * 获取目录全量列表
     *
     * 获取目录全量列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllSecondCatalogueRequest 请求对象
     * @return SyncInvoker<ListAllSecondCatalogueRequest, ListAllSecondCatalogueResponse>
     */
    public SyncInvoker<ListAllSecondCatalogueRequest, ListAllSecondCatalogueResponse> listAllSecondCatalogueInvoker(
        ListAllSecondCatalogueRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAllSecondCatalogue, hcClient);
    }

    /**
     * 查询流程实例的列表
     *
     * 查询流程实例的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAopWorkflowInstanceRequest 请求对象
     * @return ListAopWorkflowInstanceResponse
     */
    public ListAopWorkflowInstanceResponse listAopWorkflowInstance(ListAopWorkflowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAopWorkflowInstance);
    }

    /**
     * 查询流程实例的列表
     *
     * 查询流程实例的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAopWorkflowInstanceRequest 请求对象
     * @return SyncInvoker<ListAopWorkflowInstanceRequest, ListAopWorkflowInstanceResponse>
     */
    public SyncInvoker<ListAopWorkflowInstanceRequest, ListAopWorkflowInstanceResponse> listAopWorkflowInstanceInvoker(
        ListAopWorkflowInstanceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAopWorkflowInstance, hcClient);
    }

    /**
     * 查询流程版本列表
     *
     * 查询流程版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAopWorkflowVersionsRequest 请求对象
     * @return ListAopWorkflowVersionsResponse
     */
    public ListAopWorkflowVersionsResponse listAopWorkflowVersions(ListAopWorkflowVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAopWorkflowVersions);
    }

    /**
     * 查询流程版本列表
     *
     * 查询流程版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAopWorkflowVersionsRequest 请求对象
     * @return SyncInvoker<ListAopWorkflowVersionsRequest, ListAopWorkflowVersionsResponse>
     */
    public SyncInvoker<ListAopWorkflowVersionsRequest, ListAopWorkflowVersionsResponse> listAopWorkflowVersionsInvoker(
        ListAopWorkflowVersionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAopWorkflowVersions, hcClient);
    }

    /**
     * 目录列表查询
     *
     * 目录列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogueRequest 请求对象
     * @return ListCatalogueResponse
     */
    public ListCatalogueResponse listCatalogue(ListCatalogueRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCatalogue);
    }

    /**
     * 目录列表查询
     *
     * 目录列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogueRequest 请求对象
     * @return SyncInvoker<ListCatalogueRequest, ListCatalogueResponse>
     */
    public SyncInvoker<ListCatalogueRequest, ListCatalogueResponse> listCatalogueInvoker(ListCatalogueRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCatalogue, hcClient);
    }

    /**
     * 列出管道alias
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogAliasRequest 请求对象
     * @return ListCloudLogAliasResponse
     */
    public ListCloudLogAliasResponse listCloudLogAlias(ListCloudLogAliasRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCloudLogAlias);
    }

    /**
     * 列出管道alias
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogAliasRequest 请求对象
     * @return SyncInvoker<ListCloudLogAliasRequest, ListCloudLogAliasResponse>
     */
    public SyncInvoker<ListCloudLogAliasRequest, ListCloudLogAliasResponse> listCloudLogAliasInvoker(
        ListCloudLogAliasRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCloudLogAlias, hcClient);
    }

    /**
     * 列出行管账户信息
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogManagesRequest 请求对象
     * @return ListCloudLogManagesResponse
     */
    public ListCloudLogManagesResponse listCloudLogManages(ListCloudLogManagesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCloudLogManages);
    }

    /**
     * 列出行管账户信息
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogManagesRequest 请求对象
     * @return SyncInvoker<ListCloudLogManagesRequest, ListCloudLogManagesResponse>
     */
    public SyncInvoker<ListCloudLogManagesRequest, ListCloudLogManagesResponse> listCloudLogManagesInvoker(
        ListCloudLogManagesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCloudLogManages, hcClient);
    }

    /**
     * 列出平台行管账户信息
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogPlatformRequest 请求对象
     * @return ListCloudLogPlatformResponse
     */
    public ListCloudLogPlatformResponse listCloudLogPlatform(ListCloudLogPlatformRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCloudLogPlatform);
    }

    /**
     * 列出平台行管账户信息
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogPlatformRequest 请求对象
     * @return SyncInvoker<ListCloudLogPlatformRequest, ListCloudLogPlatformResponse>
     */
    public SyncInvoker<ListCloudLogPlatformRequest, ListCloudLogPlatformResponse> listCloudLogPlatformInvoker(
        ListCloudLogPlatformRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCloudLogPlatform, hcClient);
    }

    /**
     * 列出云日志资源
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogResourcesRequest 请求对象
     * @return ListCloudLogResourcesResponse
     */
    public ListCloudLogResourcesResponse listCloudLogResources(ListCloudLogResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCloudLogResources);
    }

    /**
     * 列出云日志资源
     *
     * 列出云日志资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudLogResourcesRequest 请求对象
     * @return SyncInvoker<ListCloudLogResourcesRequest, ListCloudLogResourcesResponse>
     */
    public SyncInvoker<ListCloudLogResourcesRequest, ListCloudLogResourcesResponse> listCloudLogResourcesInvoker(
        ListCloudLogResourcesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCloudLogResources, hcClient);
    }

    /**
     * 获取云服务采集配置
     *
     * 获取云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectConfigRequest 请求对象
     * @return ListCollectConfigResponse
     */
    public ListCollectConfigResponse listCollectConfig(ListCollectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectConfig);
    }

    /**
     * 获取云服务采集配置
     *
     * 获取云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectConfigRequest 请求对象
     * @return SyncInvoker<ListCollectConfigRequest, ListCollectConfigResponse>
     */
    public SyncInvoker<ListCollectConfigRequest, ListCollectConfigResponse> listCollectConfigInvoker(
        ListCollectConfigRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectConfig, hcClient);
    }

    /**
     * 列出采集通道分组
     *
     * 列出采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorChannelGroupRequest 请求对象
     * @return ListCollectorChannelGroupResponse
     */
    public ListCollectorChannelGroupResponse listCollectorChannelGroup(ListCollectorChannelGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorChannelGroup);
    }

    /**
     * 列出采集通道分组
     *
     * 列出采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorChannelGroupRequest 请求对象
     * @return SyncInvoker<ListCollectorChannelGroupRequest, ListCollectorChannelGroupResponse>
     */
    public SyncInvoker<ListCollectorChannelGroupRequest, ListCollectorChannelGroupResponse> listCollectorChannelGroupInvoker(
        ListCollectorChannelGroupRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorChannelGroup, hcClient);
    }

    /**
     * 列出采集通道列表
     *
     * 列出采集通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorChannelsRequest 请求对象
     * @return ListCollectorChannelsResponse
     */
    public ListCollectorChannelsResponse listCollectorChannels(ListCollectorChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorChannels);
    }

    /**
     * 列出采集通道列表
     *
     * 列出采集通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorChannelsRequest 请求对象
     * @return SyncInvoker<ListCollectorChannelsRequest, ListCollectorChannelsResponse>
     */
    public SyncInvoker<ListCollectorChannelsRequest, ListCollectorChannelsResponse> listCollectorChannelsInvoker(
        ListCollectorChannelsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorChannels, hcClient);
    }

    /**
     * 列表采集连接
     *
     * 列表采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorConnectionsRequest 请求对象
     * @return ListCollectorConnectionsResponse
     */
    public ListCollectorConnectionsResponse listCollectorConnections(ListCollectorConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorConnections);
    }

    /**
     * 列表采集连接
     *
     * 列表采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorConnectionsRequest 请求对象
     * @return SyncInvoker<ListCollectorConnectionsRequest, ListCollectorConnectionsResponse>
     */
    public SyncInvoker<ListCollectorConnectionsRequest, ListCollectorConnectionsResponse> listCollectorConnectionsInvoker(
        ListCollectorConnectionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorConnections, hcClient);
    }

    /**
     * 列出采集通道实例
     *
     * 列出采集通道实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorInstancesRequest 请求对象
     * @return ListCollectorInstancesResponse
     */
    public ListCollectorInstancesResponse listCollectorInstances(ListCollectorInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorInstances);
    }

    /**
     * 列出采集通道实例
     *
     * 列出采集通道实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorInstancesRequest 请求对象
     * @return SyncInvoker<ListCollectorInstancesRequest, ListCollectorInstancesResponse>
     */
    public SyncInvoker<ListCollectorInstancesRequest, ListCollectorInstancesResponse> listCollectorInstancesInvoker(
        ListCollectorInstancesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorInstances, hcClient);
    }

    /**
     * 列出采集模块规则
     *
     * 列出采集模块规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorModuleRestrictionsRequest 请求对象
     * @return ListCollectorModuleRestrictionsResponse
     */
    public ListCollectorModuleRestrictionsResponse listCollectorModuleRestrictions(
        ListCollectorModuleRestrictionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorModuleRestrictions);
    }

    /**
     * 列出采集模块规则
     *
     * 列出采集模块规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorModuleRestrictionsRequest 请求对象
     * @return SyncInvoker<ListCollectorModuleRestrictionsRequest, ListCollectorModuleRestrictionsResponse>
     */
    public SyncInvoker<ListCollectorModuleRestrictionsRequest, ListCollectorModuleRestrictionsResponse> listCollectorModuleRestrictionsInvoker(
        ListCollectorModuleRestrictionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorModuleRestrictions, hcClient);
    }

    /**
     * 列出采集模块
     *
     * 列出采集模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorModuleTemplateRequest 请求对象
     * @return ListCollectorModuleTemplateResponse
     */
    public ListCollectorModuleTemplateResponse listCollectorModuleTemplate(ListCollectorModuleTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorModuleTemplate);
    }

    /**
     * 列出采集模块
     *
     * 列出采集模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorModuleTemplateRequest 请求对象
     * @return SyncInvoker<ListCollectorModuleTemplateRequest, ListCollectorModuleTemplateResponse>
     */
    public SyncInvoker<ListCollectorModuleTemplateRequest, ListCollectorModuleTemplateResponse> listCollectorModuleTemplateInvoker(
        ListCollectorModuleTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorModuleTemplate, hcClient);
    }

    /**
     * 列出采集节点
     *
     * 列出采集节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorNodeRequest 请求对象
     * @return ListCollectorNodeResponse
     */
    public ListCollectorNodeResponse listCollectorNode(ListCollectorNodeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorNode);
    }

    /**
     * 列出采集节点
     *
     * 列出采集节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorNodeRequest 请求对象
     * @return SyncInvoker<ListCollectorNodeRequest, ListCollectorNodeResponse>
     */
    public SyncInvoker<ListCollectorNodeRequest, ListCollectorNodeResponse> listCollectorNodeInvoker(
        ListCollectorNodeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorNode, hcClient);
    }

    /**
     * 列出采集解析器模板
     *
     * 列出采集解析器模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorParserTemplateRequest 请求对象
     * @return ListCollectorParserTemplateResponse
     */
    public ListCollectorParserTemplateResponse listCollectorParserTemplate(ListCollectorParserTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorParserTemplate);
    }

    /**
     * 列出采集解析器模板
     *
     * 列出采集解析器模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorParserTemplateRequest 请求对象
     * @return SyncInvoker<ListCollectorParserTemplateRequest, ListCollectorParserTemplateResponse>
     */
    public SyncInvoker<ListCollectorParserTemplateRequest, ListCollectorParserTemplateResponse> listCollectorParserTemplateInvoker(
        ListCollectorParserTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorParserTemplate, hcClient);
    }

    /**
     * 列出采集解析器
     *
     * 列出采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorParsersRequest 请求对象
     * @return ListCollectorParsersResponse
     */
    public ListCollectorParsersResponse listCollectorParsers(ListCollectorParsersRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectorParsers);
    }

    /**
     * 列出采集解析器
     *
     * 列出采集解析器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectorParsersRequest 请求对象
     * @return SyncInvoker<ListCollectorParsersRequest, ListCollectorParsersResponse>
     */
    public SyncInvoker<ListCollectorParsersRequest, ListCollectorParsersResponse> listCollectorParsersInvoker(
        ListCollectorParsersRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectorParsers, hcClient);
    }

    /**
     * 查询插件Action列表
     *
     * 查询插件的函数、连接器和管理器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentActionsRequest 请求对象
     * @return ListComponentActionsResponse
     */
    public ListComponentActionsResponse listComponentActions(ListComponentActionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listComponentActions);
    }

    /**
     * 查询插件Action列表
     *
     * 查询插件的函数、连接器和管理器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentActionsRequest 请求对象
     * @return SyncInvoker<ListComponentActionsRequest, ListComponentActionsResponse>
     */
    public SyncInvoker<ListComponentActionsRequest, ListComponentActionsResponse> listComponentActionsInvoker(
        ListComponentActionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listComponentActions, hcClient);
    }

    /**
     * 列出组件配置
     *
     * 列出组件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentConfigurationRequest 请求对象
     * @return ListComponentConfigurationResponse
     */
    public ListComponentConfigurationResponse listComponentConfiguration(ListComponentConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listComponentConfiguration);
    }

    /**
     * 列出组件配置
     *
     * 列出组件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentConfigurationRequest 请求对象
     * @return SyncInvoker<ListComponentConfigurationRequest, ListComponentConfigurationResponse>
     */
    public SyncInvoker<ListComponentConfigurationRequest, ListComponentConfigurationResponse> listComponentConfigurationInvoker(
        ListComponentConfigurationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listComponentConfiguration, hcClient);
    }

    /**
     * 列出组件模板
     *
     * 列出组件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentTemplateRequest 请求对象
     * @return ListComponentTemplateResponse
     */
    public ListComponentTemplateResponse listComponentTemplate(ListComponentTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listComponentTemplate);
    }

    /**
     * 列出组件模板
     *
     * 列出组件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentTemplateRequest 请求对象
     * @return SyncInvoker<ListComponentTemplateRequest, ListComponentTemplateResponse>
     */
    public SyncInvoker<ListComponentTemplateRequest, ListComponentTemplateResponse> listComponentTemplateInvoker(
        ListComponentTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listComponentTemplate, hcClient);
    }

    /**
     * 查询插件配置模板列表
     *
     * 查询在配置流程时的插件配置模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentTemplatesRequest 请求对象
     * @return ListComponentTemplatesResponse
     */
    public ListComponentTemplatesResponse listComponentTemplates(ListComponentTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listComponentTemplates);
    }

    /**
     * 查询插件配置模板列表
     *
     * 查询在配置流程时的插件配置模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentTemplatesRequest 请求对象
     * @return SyncInvoker<ListComponentTemplatesRequest, ListComponentTemplatesResponse>
     */
    public SyncInvoker<ListComponentTemplatesRequest, ListComponentTemplatesResponse> listComponentTemplatesInvoker(
        ListComponentTemplatesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listComponentTemplates, hcClient);
    }

    /**
     * 查询插件定义列表
     *
     * 查询插件定义列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentsRequest 请求对象
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponents(ListComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listComponents);
    }

    /**
     * 查询插件定义列表
     *
     * 查询插件定义列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentsRequest 请求对象
     * @return SyncInvoker<ListComponentsRequest, ListComponentsResponse>
     */
    public SyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsInvoker(
        ListComponentsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listComponents, hcClient);
    }

    /**
     * 获取字典信息
     *
     * 获取字典信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationDictionariesRequest 请求对象
     * @return ListConfigurationDictionariesResponse
     */
    public ListConfigurationDictionariesResponse listConfigurationDictionaries(
        ListConfigurationDictionariesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listConfigurationDictionaries);
    }

    /**
     * 获取字典信息
     *
     * 获取字典信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationDictionariesRequest 请求对象
     * @return SyncInvoker<ListConfigurationDictionariesRequest, ListConfigurationDictionariesResponse>
     */
    public SyncInvoker<ListConfigurationDictionariesRequest, ListConfigurationDictionariesResponse> listConfigurationDictionariesInvoker(
        ListConfigurationDictionariesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listConfigurationDictionaries, hcClient);
    }

    /**
     * 操作连接列表查询接口
     *
     * 操作连接列表查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listConnections);
    }

    /**
     * 操作连接列表查询接口
     *
     * 操作连接列表查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public SyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsInvoker(
        ListConnectionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listConnections, hcClient);
    }

    /**
     * 查询数据类列表
     *
     * 查询数据类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataclassRequest 请求对象
     * @return ListDataclassResponse
     */
    public ListDataclassResponse listDataclass(ListDataclassRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataclass);
    }

    /**
     * 查询数据类列表
     *
     * 查询数据类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataclassRequest 请求对象
     * @return SyncInvoker<ListDataclassRequest, ListDataclassResponse>
     */
    public SyncInvoker<ListDataclassRequest, ListDataclassResponse> listDataclassInvoker(ListDataclassRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDataclass, hcClient);
    }

    /**
     * 查询字段列表
     *
     * 查询字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataclassFieldsRequest 请求对象
     * @return ListDataclassFieldsResponse
     */
    public ListDataclassFieldsResponse listDataclassFields(ListDataclassFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataclassFields);
    }

    /**
     * 查询字段列表
     *
     * 查询字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataclassFieldsRequest 请求对象
     * @return SyncInvoker<ListDataclassFieldsRequest, ListDataclassFieldsResponse>
     */
    public SyncInvoker<ListDataclassFieldsRequest, ListDataclassFieldsResponse> listDataclassFieldsInvoker(
        ListDataclassFieldsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDataclassFields, hcClient);
    }

    /**
     * 查询关联数据对象列表
     *
     * 查询关联数据对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectRelationsRequest 请求对象
     * @return ListDataobjectRelationsResponse
     */
    public ListDataobjectRelationsResponse listDataobjectRelations(ListDataobjectRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataobjectRelations);
    }

    /**
     * 查询关联数据对象列表
     *
     * 查询关联数据对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectRelationsRequest 请求对象
     * @return SyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse>
     */
    public SyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> listDataobjectRelationsInvoker(
        ListDataobjectRelationsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDataobjectRelations, hcClient);
    }

    /**
     * 列出所有数据对象
     *
     * 列出所有数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectsRequest 请求对象
     * @return ListDataobjectsResponse
     */
    public ListDataobjectsResponse listDataobjects(ListDataobjectsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataobjects);
    }

    /**
     * 列出所有数据对象
     *
     * 列出所有数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectsRequest 请求对象
     * @return SyncInvoker<ListDataobjectsRequest, ListDataobjectsResponse>
     */
    public SyncInvoker<ListDataobjectsRequest, ListDataobjectsResponse> listDataobjectsInvoker(
        ListDataobjectsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDataobjects, hcClient);
    }

    /**
     * 查询数据对象列表
     *
     * 数据面查询数据类纳管的数据对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatapanelObjectsRequest 请求对象
     * @return ListDatapanelObjectsResponse
     */
    public ListDatapanelObjectsResponse listDatapanelObjects(ListDatapanelObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDatapanelObjects);
    }

    /**
     * 查询数据对象列表
     *
     * 数据面查询数据类纳管的数据对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatapanelObjectsRequest 请求对象
     * @return SyncInvoker<ListDatapanelObjectsRequest, ListDatapanelObjectsResponse>
     */
    public SyncInvoker<ListDatapanelObjectsRequest, ListDatapanelObjectsResponse> listDatapanelObjectsInvoker(
        ListDatapanelObjectsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDatapanelObjects, hcClient);
    }

    /**
     * 获取数据空间列表
     *
     * 获取数据空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataspacesRequest 请求对象
     * @return ListDataspacesResponse
     */
    public ListDataspacesResponse listDataspaces(ListDataspacesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataspaces);
    }

    /**
     * 获取数据空间列表
     *
     * 获取数据空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataspacesRequest 请求对象
     * @return SyncInvoker<ListDataspacesRequest, ListDataspacesResponse>
     */
    public SyncInvoker<ListDataspacesRequest, ListDataspacesResponse> listDataspacesInvoker(
        ListDataspacesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDataspaces, hcClient);
    }

    /**
     * 获取组件历史版本的配置数据
     *
     * 获取组件历史版本的配置数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryComponentConfigurationRequest 请求对象
     * @return ListHistoryComponentConfigurationResponse
     */
    public ListHistoryComponentConfigurationResponse listHistoryComponentConfiguration(
        ListHistoryComponentConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listHistoryComponentConfiguration);
    }

    /**
     * 获取组件历史版本的配置数据
     *
     * 获取组件历史版本的配置数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryComponentConfigurationRequest 请求对象
     * @return SyncInvoker<ListHistoryComponentConfigurationRequest, ListHistoryComponentConfigurationResponse>
     */
    public SyncInvoker<ListHistoryComponentConfigurationRequest, ListHistoryComponentConfigurationResponse> listHistoryComponentConfigurationInvoker(
        ListHistoryComponentConfigurationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listHistoryComponentConfiguration, hcClient);
    }

    /**
     * 搜索事件列表
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidents(ListIncidentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listIncidents);
    }

    /**
     * 搜索事件列表
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return SyncInvoker<ListIncidentsRequest, ListIncidentsResponse>
     */
    public SyncInvoker<ListIncidentsRequest, ListIncidentsResponse> listIncidentsInvoker(ListIncidentsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listIncidents, hcClient);
    }

    /**
     * 查询威胁情报列表
     *
     * 查询威胁情报列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIndicatorsRequest 请求对象
     * @return ListIndicatorsResponse
     */
    public ListIndicatorsResponse listIndicators(ListIndicatorsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listIndicators);
    }

    /**
     * 查询威胁情报列表
     *
     * 查询威胁情报列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIndicatorsRequest 请求对象
     * @return SyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>
     */
    public SyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse> listIndicatorsInvoker(
        ListIndicatorsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listIndicators, hcClient);
    }

    /**
     * 查询安装脚本列表
     *
     * 查询安装脚本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstallationRequest 请求对象
     * @return ListInstallationResponse
     */
    public ListInstallationResponse listInstallation(ListInstallationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listInstallation);
    }

    /**
     * 查询安装脚本列表
     *
     * 查询安装脚本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstallationRequest 请求对象
     * @return SyncInvoker<ListInstallationRequest, ListInstallationResponse>
     */
    public SyncInvoker<ListInstallationRequest, ListInstallationResponse> listInstallationInvoker(
        ListInstallationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listInstallation, hcClient);
    }

    /**
     * 列出组件
     *
     * 列出组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIsapComponentsRequest 请求对象
     * @return ListIsapComponentsResponse
     */
    public ListIsapComponentsResponse listIsapComponents(ListIsapComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listIsapComponents);
    }

    /**
     * 列出组件
     *
     * 列出组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIsapComponentsRequest 请求对象
     * @return SyncInvoker<ListIsapComponentsRequest, ListIsapComponentsResponse>
     */
    public SyncInvoker<ListIsapComponentsRequest, ListIsapComponentsResponse> listIsapComponentsInvoker(
        ListIsapComponentsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listIsapComponents, hcClient);
    }

    /**
     * 查询布局列表
     *
     * 查询布局列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutRequest 请求对象
     * @return ListLayoutResponse
     */
    public ListLayoutResponse listLayout(ListLayoutRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listLayout);
    }

    /**
     * 查询布局列表
     *
     * 查询布局列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutRequest 请求对象
     * @return SyncInvoker<ListLayoutRequest, ListLayoutResponse>
     */
    public SyncInvoker<ListLayoutRequest, ListLayoutResponse> listLayoutInvoker(ListLayoutRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listLayout, hcClient);
    }

    /**
     * 查询布局页面列表
     *
     * 查询所有页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutWizardsRequest 请求对象
     * @return ListLayoutWizardsResponse
     */
    public ListLayoutWizardsResponse listLayoutWizards(ListLayoutWizardsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listLayoutWizards);
    }

    /**
     * 查询布局页面列表
     *
     * 查询所有页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutWizardsRequest 请求对象
     * @return SyncInvoker<ListLayoutWizardsRequest, ListLayoutWizardsResponse>
     */
    public SyncInvoker<ListLayoutWizardsRequest, ListLayoutWizardsResponse> listLayoutWizardsInvoker(
        ListLayoutWizardsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listLayoutWizards, hcClient);
    }

    /**
     * 获取指标列表
     *
     * 获取指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return ListMetricsResponse
     */
    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listMetrics);
    }

    /**
     * 获取指标列表
     *
     * 获取指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return SyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public SyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsInvoker(ListMetricsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listMetrics, hcClient);
    }

    /**
     * 查询模块列表
     *
     * 查询所有模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModulesRequest 请求对象
     * @return ListModulesResponse
     */
    public ListModulesResponse listModules(ListModulesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listModules);
    }

    /**
     * 查询模块列表
     *
     * 查询所有模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModulesRequest 请求对象
     * @return SyncInvoker<ListModulesRequest, ListModulesResponse>
     */
    public SyncInvoker<ListModulesRequest, ListModulesResponse> listModulesInvoker(ListModulesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listModules, hcClient);
    }

    /**
     * 通过节点id查询组件信息
     *
     * 查询节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listNodes);
    }

    /**
     * 通过节点id查询组件信息
     *
     * 查询节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listNodes, hcClient);
    }

    /**
     * 搜索评论列表
     *
     * 搜索评论列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotesRequest 请求对象
     * @return ListNotesResponse
     */
    public ListNotesResponse listNotes(ListNotesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listNotes);
    }

    /**
     * 搜索评论列表
     *
     * 搜索评论列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotesRequest 请求对象
     * @return SyncInvoker<ListNotesRequest, ListNotesResponse>
     */
    public SyncInvoker<ListNotesRequest, ListNotesResponse> listNotesInvoker(ListNotesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listNotes, hcClient);
    }

    /**
     * 获取数据管道列表
     *
     * 获取数据管道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipesRequest 请求对象
     * @return ListPipesResponse
     */
    public ListPipesResponse listPipes(ListPipesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPipes);
    }

    /**
     * 获取数据管道列表
     *
     * 获取数据管道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipesRequest 请求对象
     * @return SyncInvoker<ListPipesRequest, ListPipesResponse>
     */
    public SyncInvoker<ListPipesRequest, ListPipesResponse> listPipesInvoker(ListPipesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listPipes, hcClient);
    }

    /**
     * 查询剧本动作
     *
     * 查询剧本动作列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookActionsRequest 请求对象
     * @return ListPlaybookActionsResponse
     */
    public ListPlaybookActionsResponse listPlaybookActions(ListPlaybookActionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookActions);
    }

    /**
     * 查询剧本动作
     *
     * 查询剧本动作列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookActionsRequest 请求对象
     * @return SyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>
     */
    public SyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActionsInvoker(
        ListPlaybookActionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listPlaybookActions, hcClient);
    }

    /**
     * 查询剧本审核结果
     *
     * 查询剧本审核结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookApprovesRequest 请求对象
     * @return ListPlaybookApprovesResponse
     */
    public ListPlaybookApprovesResponse listPlaybookApproves(ListPlaybookApprovesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookApproves);
    }

    /**
     * 查询剧本审核结果
     *
     * 查询剧本审核结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookApprovesRequest 请求对象
     * @return SyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>
     */
    public SyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApprovesInvoker(
        ListPlaybookApprovesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listPlaybookApproves, hcClient);
    }

    /**
     * 查询剧本实例审计日志
     *
     * 查询剧本实例审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookAuditLogsRequest 请求对象
     * @return ListPlaybookAuditLogsResponse
     */
    public ListPlaybookAuditLogsResponse listPlaybookAuditLogs(ListPlaybookAuditLogsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookAuditLogs);
    }

    /**
     * 查询剧本实例审计日志
     *
     * 查询剧本实例审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookAuditLogsRequest 请求对象
     * @return SyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>
     */
    public SyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogsInvoker(
        ListPlaybookAuditLogsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listPlaybookAuditLogs, hcClient);
    }

    /**
     * 查询剧本实例列表
     *
     * 查询剧本实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookInstancesRequest 请求对象
     * @return ListPlaybookInstancesResponse
     */
    public ListPlaybookInstancesResponse listPlaybookInstances(ListPlaybookInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookInstances);
    }

    /**
     * 查询剧本实例列表
     *
     * 查询剧本实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookInstancesRequest 请求对象
     * @return SyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>
     */
    public SyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstancesInvoker(
        ListPlaybookInstancesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listPlaybookInstances, hcClient);
    }

    /**
     * 查询剧本版本列表
     *
     * 查询剧本版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookVersionsRequest 请求对象
     * @return ListPlaybookVersionsResponse
     */
    public ListPlaybookVersionsResponse listPlaybookVersions(ListPlaybookVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookVersions);
    }

    /**
     * 查询剧本版本列表
     *
     * 查询剧本版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookVersionsRequest 请求对象
     * @return SyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>
     */
    public SyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersionsInvoker(
        ListPlaybookVersionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listPlaybookVersions, hcClient);
    }

    /**
     * 查询剧本列表
     *
     * 查询剧本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybooksRequest 请求对象
     * @return ListPlaybooksResponse
     */
    public ListPlaybooksResponse listPlaybooks(ListPlaybooksRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybooks);
    }

    /**
     * 查询剧本列表
     *
     * 查询剧本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybooksRequest 请求对象
     * @return SyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>
     */
    public SyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooksInvoker(ListPlaybooksRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listPlaybooks, hcClient);
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
     * @return ListProjectTagResponse
     */
    public ListProjectTagResponse listProjectTag(ListProjectTagRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listProjectTag);
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
     * @return SyncInvoker<ListProjectTagRequest, ListProjectTagResponse>
     */
    public SyncInvoker<ListProjectTagRequest, ListProjectTagResponse> listProjectTagInvoker(
        ListProjectTagRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listProjectTag, hcClient);
    }

    /**
     * 查询收件人状态
     *
     * 查询收件人状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecipientsStatusRequest 请求对象
     * @return ListRecipientsStatusResponse
     */
    public ListRecipientsStatusResponse listRecipientsStatus(ListRecipientsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listRecipientsStatus);
    }

    /**
     * 查询收件人状态
     *
     * 查询收件人状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecipientsStatusRequest 请求对象
     * @return SyncInvoker<ListRecipientsStatusRequest, ListRecipientsStatusResponse>
     */
    public SyncInvoker<ListRecipientsStatusRequest, ListRecipientsStatusResponse> listRecipientsStatusInvoker(
        ListRecipientsStatusRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listRecipientsStatus, hcClient);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listRegions);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listRegions, hcClient);
    }

    /**
     * 获取报告列表
     *
     * 获取报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return ListReportsResponse
     */
    public ListReportsResponse listReports(ListReportsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listReports);
    }

    /**
     * 获取报告列表
     *
     * 获取报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return SyncInvoker<ListReportsRequest, ListReportsResponse>
     */
    public SyncInvoker<ListReportsRequest, ListReportsResponse> listReportsInvoker(ListReportsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listReports, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 使用标签过滤实例，查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceRequest 请求对象
     * @return ListResourceInstanceResponse
     */
    public ListResourceInstanceResponse listResourceInstance(ListResourceInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listResourceInstance);
    }

    /**
     * 查询资源实例列表
     *
     * 使用标签过滤实例，查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceRequest 请求对象
     * @return SyncInvoker<ListResourceInstanceRequest, ListResourceInstanceResponse>
     */
    public SyncInvoker<ListResourceInstanceRequest, ListResourceInstanceResponse> listResourceInstanceInvoker(
        ListResourceInstanceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listResourceInstance, hcClient);
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
     * @return ListResourceTagResponse
     */
    public ListResourceTagResponse listResourceTag(ListResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listResourceTag);
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
     * @return SyncInvoker<ListResourceTagRequest, ListResourceTagResponse>
     */
    public SyncInvoker<ListResourceTagRequest, ListResourceTagResponse> listResourceTagInvoker(
        ListResourceTagRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listResourceTag, hcClient);
    }

    /**
     * 搜索资产列表
     *
     * 搜索资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listResources);
    }

    /**
     * 搜索资产列表
     *
     * 搜索资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listResources, hcClient);
    }

    /**
     * 列出运行中节点
     *
     * 列出运行中节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunningNodesRequest 请求对象
     * @return ListRunningNodesResponse
     */
    public ListRunningNodesResponse listRunningNodes(ListRunningNodesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listRunningNodes);
    }

    /**
     * 列出运行中节点
     *
     * 列出运行中节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunningNodesRequest 请求对象
     * @return SyncInvoker<ListRunningNodesRequest, ListRunningNodesResponse>
     */
    public SyncInvoker<ListRunningNodesRequest, ListRunningNodesResponse> listRunningNodesInvoker(
        ListRunningNodesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listRunningNodes, hcClient);
    }

    /**
     * 获取检索条件列表
     *
     * 获取检索条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchConditionsRequest 请求对象
     * @return ListSearchConditionsResponse
     */
    public ListSearchConditionsResponse listSearchConditions(ListSearchConditionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listSearchConditions);
    }

    /**
     * 获取检索条件列表
     *
     * 获取检索条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchConditionsRequest 请求对象
     * @return SyncInvoker<ListSearchConditionsRequest, ListSearchConditionsResponse>
     */
    public SyncInvoker<ListSearchConditionsRequest, ListSearchConditionsResponse> listSearchConditionsInvoker(
        ListSearchConditionsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listSearchConditions, hcClient);
    }

    /**
     * 获取数据分布直方图
     *
     * 获取数据分布直方图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchHistogramsRequest 请求对象
     * @return ListSearchHistogramsResponse
     */
    public ListSearchHistogramsResponse listSearchHistograms(ListSearchHistogramsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listSearchHistograms);
    }

    /**
     * 获取数据分布直方图
     *
     * 获取数据分布直方图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchHistogramsRequest 请求对象
     * @return SyncInvoker<ListSearchHistogramsRequest, ListSearchHistogramsResponse>
     */
    public SyncInvoker<ListSearchHistogramsRequest, ListSearchHistogramsResponse> listSearchHistogramsInvoker(
        ListSearchHistogramsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listSearchHistograms, hcClient);
    }

    /**
     * 获取检索数据
     *
     * 获取检索数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchLogsRequest 请求对象
     * @return ListSearchLogsResponse
     */
    public ListSearchLogsResponse listSearchLogs(ListSearchLogsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listSearchLogs);
    }

    /**
     * 获取检索数据
     *
     * 获取检索数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSearchLogsRequest 请求对象
     * @return SyncInvoker<ListSearchLogsRequest, ListSearchLogsResponse>
     */
    public SyncInvoker<ListSearchLogsRequest, ListSearchLogsResponse> listSearchLogsInvoker(
        ListSearchLogsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listSearchLogs, hcClient);
    }

    /**
     * 查看委托信息
     *
     * check service linked agency
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceAgencyRequest 请求对象
     * @return ListServiceAgencyResponse
     */
    public ListServiceAgencyResponse listServiceAgency(ListServiceAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listServiceAgency);
    }

    /**
     * 查看委托信息
     *
     * check service linked agency
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceAgencyRequest 请求对象
     * @return SyncInvoker<ListServiceAgencyRequest, ListServiceAgencyResponse>
     */
    public SyncInvoker<ListServiceAgencyRequest, ListServiceAgencyResponse> listServiceAgencyInvoker(
        ListServiceAgencyRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listServiceAgency, hcClient);
    }

    /**
     * 获取投递授权信息列表
     *
     * 获取投递授权信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShipperAuthorizationsRequest 请求对象
     * @return ListShipperAuthorizationsResponse
     */
    public ListShipperAuthorizationsResponse listShipperAuthorizations(ListShipperAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listShipperAuthorizations);
    }

    /**
     * 获取投递授权信息列表
     *
     * 获取投递授权信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShipperAuthorizationsRequest 请求对象
     * @return SyncInvoker<ListShipperAuthorizationsRequest, ListShipperAuthorizationsResponse>
     */
    public SyncInvoker<ListShipperAuthorizationsRequest, ListShipperAuthorizationsResponse> listShipperAuthorizationsInvoker(
        ListShipperAuthorizationsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listShipperAuthorizations, hcClient);
    }

    /**
     * 查询投递信息
     *
     * 查询投递信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShippersRequest 请求对象
     * @return ListShippersResponse
     */
    public ListShippersResponse listShippers(ListShippersRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listShippers);
    }

    /**
     * 查询投递信息
     *
     * 查询投递信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShippersRequest 请求对象
     * @return SyncInvoker<ListShippersRequest, ListShippersResponse>
     */
    public SyncInvoker<ListShippersRequest, ListShippersResponse> listShippersInvoker(ListShippersRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listShippers, hcClient);
    }

    /**
     * 查询已购资源清单
     *
     * 查询已购资源清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionGlobalOrderRequest 请求对象
     * @return ListSubscriptionGlobalOrderResponse
     */
    public ListSubscriptionGlobalOrderResponse listSubscriptionGlobalOrder(ListSubscriptionGlobalOrderRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listSubscriptionGlobalOrder);
    }

    /**
     * 查询已购资源清单
     *
     * 查询已购资源清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionGlobalOrderRequest 请求对象
     * @return SyncInvoker<ListSubscriptionGlobalOrderRequest, ListSubscriptionGlobalOrderResponse>
     */
    public SyncInvoker<ListSubscriptionGlobalOrderRequest, ListSubscriptionGlobalOrderResponse> listSubscriptionGlobalOrderInvoker(
        ListSubscriptionGlobalOrderRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listSubscriptionGlobalOrder, hcClient);
    }

    /**
     * 查询租户订阅资源
     *
     * 查询租户版本信息，注意：目前其中参数purchase、usage、smn互斥，同时只能有一个请求参数被命中，优先级为：smn &gt; usage &gt; purchase
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionOrderRequest 请求对象
     * @return ListSubscriptionOrderResponse
     */
    public ListSubscriptionOrderResponse listSubscriptionOrder(ListSubscriptionOrderRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listSubscriptionOrder);
    }

    /**
     * 查询租户订阅资源
     *
     * 查询租户版本信息，注意：目前其中参数purchase、usage、smn互斥，同时只能有一个请求参数被命中，优先级为：smn &gt; usage &gt; purchase
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionOrderRequest 请求对象
     * @return SyncInvoker<ListSubscriptionOrderRequest, ListSubscriptionOrderResponse>
     */
    public SyncInvoker<ListSubscriptionOrderRequest, ListSubscriptionOrderResponse> listSubscriptionOrderInvoker(
        ListSubscriptionOrderRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listSubscriptionOrder, hcClient);
    }

    /**
     * 查询当前站点支持的商品清单
     *
     * 查询当前站点SecMaster支持的商品清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionProductRequest 请求对象
     * @return ListSubscriptionProductResponse
     */
    public ListSubscriptionProductResponse listSubscriptionProduct(ListSubscriptionProductRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listSubscriptionProduct);
    }

    /**
     * 查询当前站点支持的商品清单
     *
     * 查询当前站点SecMaster支持的商品清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionProductRequest 请求对象
     * @return SyncInvoker<ListSubscriptionProductRequest, ListSubscriptionProductResponse>
     */
    public SyncInvoker<ListSubscriptionProductRequest, ListSubscriptionProductResponse> listSubscriptionProductInvoker(
        ListSubscriptionProductRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listSubscriptionProduct, hcClient);
    }

    /**
     * 查询待办列表
     *
     * 查询待办列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listTasks);
    }

    /**
     * 查询待办列表
     *
     * 查询待办列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listTasks, hcClient);
    }

    /**
     * 列出VPC终端节点服务
     *
     * 列出VPC终端节点服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcEndpointServiceRequest 请求对象
     * @return ListVpcEndpointServiceResponse
     */
    public ListVpcEndpointServiceResponse listVpcEndpointService(ListVpcEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listVpcEndpointService);
    }

    /**
     * 列出VPC终端节点服务
     *
     * 列出VPC终端节点服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcEndpointServiceRequest 请求对象
     * @return SyncInvoker<ListVpcEndpointServiceRequest, ListVpcEndpointServiceResponse>
     */
    public SyncInvoker<ListVpcEndpointServiceRequest, ListVpcEndpointServiceResponse> listVpcEndpointServiceInvoker(
        ListVpcEndpointServiceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listVpcEndpointService, hcClient);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilitiesRequest 请求对象
     * @return ListVulnerabilitiesResponse
     */
    public ListVulnerabilitiesResponse listVulnerabilities(ListVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listVulnerabilities);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
     */
    public SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilitiesInvoker(
        ListVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listVulnerabilities, hcClient);
    }

    /**
     * 查询流程列表
     *
     * 查询流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(ListWorkflowsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listWorkflows);
    }

    /**
     * 查询流程列表
     *
     * 查询流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowsRequest 请求对象
     * @return SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsInvoker(ListWorkflowsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listWorkflows, hcClient);
    }

    /**
     * 查询工作空间列表
     *
     * 可通过工作空间名称、工作空间描述、创建时间等条件对租户的工作空间进行筛选。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listWorkspaces);
    }

    /**
     * 查询工作空间列表
     *
     * 可通过工作空间名称、工作空间描述、创建时间等条件对租户的工作空间进行筛选。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listWorkspaces, hcClient);
    }

    /**
     * 投递挂起
     *
     * 投递挂起
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseShipperRequest 请求对象
     * @return PauseShipperResponse
     */
    public PauseShipperResponse pauseShipper(PauseShipperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.pauseShipper);
    }

    /**
     * 投递挂起
     *
     * 投递挂起
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseShipperRequest 请求对象
     * @return SyncInvoker<PauseShipperRequest, PauseShipperResponse>
     */
    public SyncInvoker<PauseShipperRequest, PauseShipperResponse> pauseShipperInvoker(PauseShipperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.pauseShipper, hcClient);
    }

    /**
     * 启动投递
     *
     * 启动投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeShipperRequest 请求对象
     * @return ResumeShipperResponse
     */
    public ResumeShipperResponse resumeShipper(ResumeShipperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.resumeShipper);
    }

    /**
     * 启动投递
     *
     * 启动投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeShipperRequest 请求对象
     * @return SyncInvoker<ResumeShipperRequest, ResumeShipperResponse>
     */
    public SyncInvoker<ResumeShipperRequest, ResumeShipperResponse> resumeShipperInvoker(ResumeShipperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.resumeShipper, hcClient);
    }

    /**
     * 重新投递
     *
     * 重新投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryShipperRequest 请求对象
     * @return RetryShipperResponse
     */
    public RetryShipperResponse retryShipper(RetryShipperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.retryShipper);
    }

    /**
     * 重新投递
     *
     * 重新投递
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryShipperRequest 请求对象
     * @return SyncInvoker<RetryShipperRequest, RetryShipperResponse>
     */
    public SyncInvoker<RetryShipperRequest, RetryShipperResponse> retryShipperInvoker(RetryShipperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.retryShipper, hcClient);
    }

    /**
     * 重新授权
     *
     * 重新授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryShipperAuthorizationRequest 请求对象
     * @return RetryShipperAuthorizationResponse
     */
    public RetryShipperAuthorizationResponse retryShipperAuthorization(RetryShipperAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.retryShipperAuthorization);
    }

    /**
     * 重新授权
     *
     * 重新授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryShipperAuthorizationRequest 请求对象
     * @return SyncInvoker<RetryShipperAuthorizationRequest, RetryShipperAuthorizationResponse>
     */
    public SyncInvoker<RetryShipperAuthorizationRequest, RetryShipperAuthorizationResponse> retryShipperAuthorizationInvoker(
        RetryShipperAuthorizationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.retryShipperAuthorization, hcClient);
    }

    /**
     * 查询策略视图列表
     *
     * 查询策略视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRequest 请求对象
     * @return SearchPolicyResponse
     */
    public SearchPolicyResponse searchPolicy(SearchPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.searchPolicy);
    }

    /**
     * 查询策略视图列表
     *
     * 查询策略视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRequest 请求对象
     * @return SyncInvoker<SearchPolicyRequest, SearchPolicyResponse>
     */
    public SyncInvoker<SearchPolicyRequest, SearchPolicyResponse> searchPolicyInvoker(SearchPolicyRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.searchPolicy, hcClient);
    }

    /**
     * 查询任务视图列表
     *
     * 查询任务视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRecordRequest 请求对象
     * @return SearchPolicyRecordResponse
     */
    public SearchPolicyRecordResponse searchPolicyRecord(SearchPolicyRecordRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.searchPolicyRecord);
    }

    /**
     * 查询任务视图列表
     *
     * 查询任务视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRecordRequest 请求对象
     * @return SyncInvoker<SearchPolicyRecordRequest, SearchPolicyRecordResponse>
     */
    public SyncInvoker<SearchPolicyRecordRequest, SearchPolicyRecordResponse> searchPolicyRecordInvoker(
        SearchPolicyRecordRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.searchPolicyRecord, hcClient);
    }

    /**
     * 根据策略ID查询历史记录列表
     *
     * 根据策略ID查询历史记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRecordByPolicyIdRequest 请求对象
     * @return SearchPolicyRecordByPolicyIdResponse
     */
    public SearchPolicyRecordByPolicyIdResponse searchPolicyRecordByPolicyId(
        SearchPolicyRecordByPolicyIdRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.searchPolicyRecordByPolicyId);
    }

    /**
     * 根据策略ID查询历史记录列表
     *
     * 根据策略ID查询历史记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPolicyRecordByPolicyIdRequest 请求对象
     * @return SyncInvoker<SearchPolicyRecordByPolicyIdRequest, SearchPolicyRecordByPolicyIdResponse>
     */
    public SyncInvoker<SearchPolicyRecordByPolicyIdRequest, SearchPolicyRecordByPolicyIdResponse> searchPolicyRecordByPolicyIdInvoker(
        SearchPolicyRecordByPolicyIdRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.searchPolicyRecordByPolicyId, hcClient);
    }

    /**
     * 获取告警详情
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRequest 请求对象
     * @return ShowAlertResponse
     */
    public ShowAlertResponse showAlert(ShowAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAlert);
    }

    /**
     * 获取告警详情
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRequest 请求对象
     * @return SyncInvoker<ShowAlertRequest, ShowAlertResponse>
     */
    public SyncInvoker<ShowAlertRequest, ShowAlertResponse> showAlertInvoker(ShowAlertRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAlert, hcClient);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return ShowAlertRuleResponse
     */
    public ShowAlertRuleResponse showAlertRule(ShowAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAlertRule);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleInvoker(ShowAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAlertRule, hcClient);
    }

    /**
     * 查看告警规则模板
     *
     * 查看告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return ShowAlertRuleTemplateResponse
     */
    public ShowAlertRuleTemplateResponse showAlertRuleTemplate(ShowAlertRuleTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAlertRuleTemplate);
    }

    /**
     * 查看告警规则模板
     *
     * 查看告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>
     */
    public SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplateInvoker(
        ShowAlertRuleTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAlertRuleTemplate, hcClient);
    }

    /**
     * 查询流程详情
     *
     * 查询流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowRequest 请求对象
     * @return ShowAopWorkflowResponse
     */
    public ShowAopWorkflowResponse showAopWorkflow(ShowAopWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAopWorkflow);
    }

    /**
     * 查询流程详情
     *
     * 查询流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowRequest 请求对象
     * @return SyncInvoker<ShowAopWorkflowRequest, ShowAopWorkflowResponse>
     */
    public SyncInvoker<ShowAopWorkflowRequest, ShowAopWorkflowResponse> showAopWorkflowInvoker(
        ShowAopWorkflowRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAopWorkflow, hcClient);
    }

    /**
     * 查询流程实例的详情
     *
     * 查询流程实例的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowInstanceRequest 请求对象
     * @return ShowAopWorkflowInstanceResponse
     */
    public ShowAopWorkflowInstanceResponse showAopWorkflowInstance(ShowAopWorkflowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAopWorkflowInstance);
    }

    /**
     * 查询流程实例的详情
     *
     * 查询流程实例的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowInstanceRequest 请求对象
     * @return SyncInvoker<ShowAopWorkflowInstanceRequest, ShowAopWorkflowInstanceResponse>
     */
    public SyncInvoker<ShowAopWorkflowInstanceRequest, ShowAopWorkflowInstanceResponse> showAopWorkflowInstanceInvoker(
        ShowAopWorkflowInstanceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAopWorkflowInstance, hcClient);
    }

    /**
     * 查询流程版本的详细信息
     *
     * 查询流程版本的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowVersionRequest 请求对象
     * @return ShowAopWorkflowVersionResponse
     */
    public ShowAopWorkflowVersionResponse showAopWorkflowVersion(ShowAopWorkflowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAopWorkflowVersion);
    }

    /**
     * 查询流程版本的详细信息
     *
     * 查询流程版本的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAopWorkflowVersionRequest 请求对象
     * @return SyncInvoker<ShowAopWorkflowVersionRequest, ShowAopWorkflowVersionResponse>
     */
    public SyncInvoker<ShowAopWorkflowVersionRequest, ShowAopWorkflowVersionResponse> showAopWorkflowVersionInvoker(
        ShowAopWorkflowVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAopWorkflowVersion, hcClient);
    }

    /**
     * 获取附件详情
     *
     * 获取附件详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttachmentRequest 请求对象
     * @return ShowAttachmentResponse
     */
    public ShowAttachmentResponse showAttachment(ShowAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAttachment);
    }

    /**
     * 获取附件详情
     *
     * 获取附件详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttachmentRequest 请求对象
     * @return SyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse>
     */
    public SyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse> showAttachmentInvoker(
        ShowAttachmentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAttachment, hcClient);
    }

    /**
     * 查询分类详情
     *
     * 查询分类详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClassifierInfoRequest 请求对象
     * @return ShowClassifierInfoResponse
     */
    public ShowClassifierInfoResponse showClassifierInfo(ShowClassifierInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showClassifierInfo);
    }

    /**
     * 查询分类详情
     *
     * 查询分类详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClassifierInfoRequest 请求对象
     * @return SyncInvoker<ShowClassifierInfoRequest, ShowClassifierInfoResponse>
     */
    public SyncInvoker<ShowClassifierInfoRequest, ShowClassifierInfoResponse> showClassifierInfoInvoker(
        ShowClassifierInfoRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showClassifierInfo, hcClient);
    }

    /**
     * 获取是否开启行管
     *
     * 获取是否开启行管
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudLogTenantWhitelistRequest 请求对象
     * @return ShowCloudLogTenantWhitelistResponse
     */
    public ShowCloudLogTenantWhitelistResponse showCloudLogTenantWhitelist(ShowCloudLogTenantWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showCloudLogTenantWhitelist);
    }

    /**
     * 获取是否开启行管
     *
     * 获取是否开启行管
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudLogTenantWhitelistRequest 请求对象
     * @return SyncInvoker<ShowCloudLogTenantWhitelistRequest, ShowCloudLogTenantWhitelistResponse>
     */
    public SyncInvoker<ShowCloudLogTenantWhitelistRequest, ShowCloudLogTenantWhitelistResponse> showCloudLogTenantWhitelistInvoker(
        ShowCloudLogTenantWhitelistRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showCloudLogTenantWhitelist, hcClient);
    }

    /**
     * 展示采集通道
     *
     * 展示采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorChannelRequest 请求对象
     * @return ShowCollectorChannelResponse
     */
    public ShowCollectorChannelResponse showCollectorChannel(ShowCollectorChannelRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showCollectorChannel);
    }

    /**
     * 展示采集通道
     *
     * 展示采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorChannelRequest 请求对象
     * @return SyncInvoker<ShowCollectorChannelRequest, ShowCollectorChannelResponse>
     */
    public SyncInvoker<ShowCollectorChannelRequest, ShowCollectorChannelResponse> showCollectorChannelInvoker(
        ShowCollectorChannelRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showCollectorChannel, hcClient);
    }

    /**
     * 展示采集连接详情
     *
     * 展示采集连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorConnectionRequest 请求对象
     * @return ShowCollectorConnectionResponse
     */
    public ShowCollectorConnectionResponse showCollectorConnection(ShowCollectorConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showCollectorConnection);
    }

    /**
     * 展示采集连接详情
     *
     * 展示采集连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorConnectionRequest 请求对象
     * @return SyncInvoker<ShowCollectorConnectionRequest, ShowCollectorConnectionResponse>
     */
    public SyncInvoker<ShowCollectorConnectionRequest, ShowCollectorConnectionResponse> showCollectorConnectionInvoker(
        ShowCollectorConnectionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showCollectorConnection, hcClient);
    }

    /**
     * 获取采集解析器详情
     *
     * 获取采集解析器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorParserRequest 请求对象
     * @return ShowCollectorParserResponse
     */
    public ShowCollectorParserResponse showCollectorParser(ShowCollectorParserRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showCollectorParser);
    }

    /**
     * 获取采集解析器详情
     *
     * 获取采集解析器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCollectorParserRequest 请求对象
     * @return SyncInvoker<ShowCollectorParserRequest, ShowCollectorParserResponse>
     */
    public SyncInvoker<ShowCollectorParserRequest, ShowCollectorParserResponse> showCollectorParserInvoker(
        ShowCollectorParserRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showCollectorParser, hcClient);
    }

    /**
     * 查询插件详细信息
     *
     * 查询插件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
     * @return ShowComponentResponse
     */
    public ShowComponentResponse showComponent(ShowComponentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showComponent);
    }

    /**
     * 查询插件详细信息
     *
     * 查询插件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
     * @return SyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public SyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentInvoker(ShowComponentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showComponent, hcClient);
    }

    /**
     * 查询插件Action详情
     *
     * 查询插件的action详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentActionRequest 请求对象
     * @return ShowComponentActionResponse
     */
    public ShowComponentActionResponse showComponentAction(ShowComponentActionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showComponentAction);
    }

    /**
     * 查询插件Action详情
     *
     * 查询插件的action详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentActionRequest 请求对象
     * @return SyncInvoker<ShowComponentActionRequest, ShowComponentActionResponse>
     */
    public SyncInvoker<ShowComponentActionRequest, ShowComponentActionResponse> showComponentActionInvoker(
        ShowComponentActionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showComponentAction, hcClient);
    }

    /**
     * 查询插件配置模板详情
     *
     * 查询在配置流程时的插件配置模板详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentTemplateRequest 请求对象
     * @return ShowComponentTemplateResponse
     */
    public ShowComponentTemplateResponse showComponentTemplate(ShowComponentTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showComponentTemplate);
    }

    /**
     * 查询插件配置模板详情
     *
     * 查询在配置流程时的插件配置模板详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentTemplateRequest 请求对象
     * @return SyncInvoker<ShowComponentTemplateRequest, ShowComponentTemplateResponse>
     */
    public SyncInvoker<ShowComponentTemplateRequest, ShowComponentTemplateResponse> showComponentTemplateInvoker(
        ShowComponentTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showComponentTemplate, hcClient);
    }

    /**
     * 查询操作连接详情
     *
     * 查询操作连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return ShowConnectionResponse
     */
    public ShowConnectionResponse showConnection(ShowConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showConnection);
    }

    /**
     * 查询操作连接详情
     *
     * 查询操作连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return SyncInvoker<ShowConnectionRequest, ShowConnectionResponse>
     */
    public SyncInvoker<ShowConnectionRequest, ShowConnectionResponse> showConnectionInvoker(
        ShowConnectionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showConnection, hcClient);
    }

    /**
     * 展示数据类详情
     *
     * 展示数据类详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataClassInfoRequest 请求对象
     * @return ShowDataClassInfoResponse
     */
    public ShowDataClassInfoResponse showDataClassInfo(ShowDataClassInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showDataClassInfo);
    }

    /**
     * 展示数据类详情
     *
     * 展示数据类详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataClassInfoRequest 请求对象
     * @return SyncInvoker<ShowDataClassInfoRequest, ShowDataClassInfoResponse>
     */
    public SyncInvoker<ShowDataClassInfoRequest, ShowDataClassInfoResponse> showDataClassInfoInvoker(
        ShowDataClassInfoRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showDataClassInfo, hcClient);
    }

    /**
     * 查询数据对象
     *
     * 查询数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataobjectRequest 请求对象
     * @return ShowDataobjectResponse
     */
    public ShowDataobjectResponse showDataobject(ShowDataobjectRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showDataobject);
    }

    /**
     * 查询数据对象
     *
     * 查询数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataobjectRequest 请求对象
     * @return SyncInvoker<ShowDataobjectRequest, ShowDataobjectResponse>
     */
    public SyncInvoker<ShowDataobjectRequest, ShowDataobjectResponse> showDataobjectInvoker(
        ShowDataobjectRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showDataobject, hcClient);
    }

    /**
     * 查询数据面对象
     *
     * 数据面查询数据类纳管的数据对象详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatapanelObjectRequest 请求对象
     * @return ShowDatapanelObjectResponse
     */
    public ShowDatapanelObjectResponse showDatapanelObject(ShowDatapanelObjectRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showDatapanelObject);
    }

    /**
     * 查询数据面对象
     *
     * 数据面查询数据类纳管的数据对象详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatapanelObjectRequest 请求对象
     * @return SyncInvoker<ShowDatapanelObjectRequest, ShowDatapanelObjectResponse>
     */
    public SyncInvoker<ShowDatapanelObjectRequest, ShowDatapanelObjectResponse> showDatapanelObjectInvoker(
        ShowDatapanelObjectRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showDatapanelObject, hcClient);
    }

    /**
     * 获取数据空间详情
     *
     * 获取数据空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataspaceRequest 请求对象
     * @return ShowDataspaceResponse
     */
    public ShowDataspaceResponse showDataspace(ShowDataspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showDataspace);
    }

    /**
     * 获取数据空间详情
     *
     * 获取数据空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataspaceRequest 请求对象
     * @return SyncInvoker<ShowDataspaceRequest, ShowDataspaceResponse>
     */
    public SyncInvoker<ShowDataspaceRequest, ShowDataspaceResponse> showDataspaceInvoker(ShowDataspaceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showDataspace, hcClient);
    }

    /**
     * 获取事件详情
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentRequest 请求对象
     * @return ShowIncidentResponse
     */
    public ShowIncidentResponse showIncident(ShowIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showIncident);
    }

    /**
     * 获取事件详情
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentRequest 请求对象
     * @return SyncInvoker<ShowIncidentRequest, ShowIncidentResponse>
     */
    public SyncInvoker<ShowIncidentRequest, ShowIncidentResponse> showIncidentInvoker(ShowIncidentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showIncident, hcClient);
    }

    /**
     * 查询威胁情报详情
     *
     * 查询威胁情报详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndicatorDetailRequest 请求对象
     * @return ShowIndicatorDetailResponse
     */
    public ShowIndicatorDetailResponse showIndicatorDetail(ShowIndicatorDetailRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showIndicatorDetail);
    }

    /**
     * 查询威胁情报详情
     *
     * 查询威胁情报详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndicatorDetailRequest 请求对象
     * @return SyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>
     */
    public SyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetailInvoker(
        ShowIndicatorDetailRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showIndicatorDetail, hcClient);
    }

    /**
     * 展示组件详情
     *
     * 展示组件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIsapComponentRequest 请求对象
     * @return ShowIsapComponentResponse
     */
    public ShowIsapComponentResponse showIsapComponent(ShowIsapComponentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showIsapComponent);
    }

    /**
     * 展示组件详情
     *
     * 展示组件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIsapComponentRequest 请求对象
     * @return SyncInvoker<ShowIsapComponentRequest, ShowIsapComponentResponse>
     */
    public SyncInvoker<ShowIsapComponentRequest, ShowIsapComponentResponse> showIsapComponentInvoker(
        ShowIsapComponentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showIsapComponent, hcClient);
    }

    /**
     * 查询布局详情
     *
     * 查询布局详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutRequest 请求对象
     * @return ShowLayoutResponse
     */
    public ShowLayoutResponse showLayout(ShowLayoutRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showLayout);
    }

    /**
     * 查询布局详情
     *
     * 查询布局详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutRequest 请求对象
     * @return SyncInvoker<ShowLayoutRequest, ShowLayoutResponse>
     */
    public SyncInvoker<ShowLayoutRequest, ShowLayoutResponse> showLayoutInvoker(ShowLayoutRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showLayout, hcClient);
    }

    /**
     * 查询布局页面
     *
     * 查询布局页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutWizardRequest 请求对象
     * @return ShowLayoutWizardResponse
     */
    public ShowLayoutWizardResponse showLayoutWizard(ShowLayoutWizardRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showLayoutWizard);
    }

    /**
     * 查询布局页面
     *
     * 查询布局页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutWizardRequest 请求对象
     * @return SyncInvoker<ShowLayoutWizardRequest, ShowLayoutWizardResponse>
     */
    public SyncInvoker<ShowLayoutWizardRequest, ShowLayoutWizardResponse> showLayoutWizardInvoker(
        ShowLayoutWizardRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showLayoutWizard, hcClient);
    }

    /**
     * 查询布局页面详情
     *
     * 查询布局页面详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutWizardByFieldRequest 请求对象
     * @return ShowLayoutWizardByFieldResponse
     */
    public ShowLayoutWizardByFieldResponse showLayoutWizardByField(ShowLayoutWizardByFieldRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showLayoutWizardByField);
    }

    /**
     * 查询布局页面详情
     *
     * 查询布局页面详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutWizardByFieldRequest 请求对象
     * @return SyncInvoker<ShowLayoutWizardByFieldRequest, ShowLayoutWizardByFieldResponse>
     */
    public SyncInvoker<ShowLayoutWizardByFieldRequest, ShowLayoutWizardByFieldResponse> showLayoutWizardByFieldInvoker(
        ShowLayoutWizardByFieldRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showLayoutWizardByField, hcClient);
    }

    /**
     * 查询映射详情
     *
     * 查询映射详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMapperDetailRequest 请求对象
     * @return ShowMapperDetailResponse
     */
    public ShowMapperDetailResponse showMapperDetail(ShowMapperDetailRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showMapperDetail);
    }

    /**
     * 查询映射详情
     *
     * 查询映射详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMapperDetailRequest 请求对象
     * @return SyncInvoker<ShowMapperDetailRequest, ShowMapperDetailResponse>
     */
    public SyncInvoker<ShowMapperDetailRequest, ShowMapperDetailResponse> showMapperDetailInvoker(
        ShowMapperDetailRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showMapperDetail, hcClient);
    }

    /**
     * 查询映射列表
     *
     * 查询映射列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMapperListRequest 请求对象
     * @return ShowMapperListResponse
     */
    public ShowMapperListResponse showMapperList(ShowMapperListRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showMapperList);
    }

    /**
     * 查询映射列表
     *
     * 查询映射列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMapperListRequest 请求对象
     * @return SyncInvoker<ShowMapperListRequest, ShowMapperListResponse>
     */
    public SyncInvoker<ShowMapperListRequest, ShowMapperListResponse> showMapperListInvoker(
        ShowMapperListRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showMapperList, hcClient);
    }

    /**
     * 查询分类映射函数
     *
     * 查询分类映射函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMappingFunctionRequest 请求对象
     * @return ShowMappingFunctionResponse
     */
    public ShowMappingFunctionResponse showMappingFunction(ShowMappingFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showMappingFunction);
    }

    /**
     * 查询分类映射函数
     *
     * 查询分类映射函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMappingFunctionRequest 请求对象
     * @return SyncInvoker<ShowMappingFunctionRequest, ShowMappingFunctionResponse>
     */
    public SyncInvoker<ShowMappingFunctionRequest, ShowMappingFunctionResponse> showMappingFunctionInvoker(
        ShowMappingFunctionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showMappingFunction, hcClient);
    }

    /**
     * 查询分类映射列表
     *
     * 查询分类映射列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMappingInfoListRequest 请求对象
     * @return ShowMappingInfoListResponse
     */
    public ShowMappingInfoListResponse showMappingInfoList(ShowMappingInfoListRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showMappingInfoList);
    }

    /**
     * 查询分类映射列表
     *
     * 查询分类映射列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMappingInfoListRequest 请求对象
     * @return SyncInvoker<ShowMappingInfoListRequest, ShowMappingInfoListResponse>
     */
    public SyncInvoker<ShowMappingInfoListRequest, ShowMappingInfoListResponse> showMappingInfoListInvoker(
        ShowMappingInfoListRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showMappingInfoList, hcClient);
    }

    /**
     * 获取指标元数据
     *
     * 获取指标元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricMetaDataRequest 请求对象
     * @return ShowMetricMetaDataResponse
     */
    public ShowMetricMetaDataResponse showMetricMetaData(ShowMetricMetaDataRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showMetricMetaData);
    }

    /**
     * 获取指标元数据
     *
     * 获取指标元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricMetaDataRequest 请求对象
     * @return SyncInvoker<ShowMetricMetaDataRequest, ShowMetricMetaDataResponse>
     */
    public SyncInvoker<ShowMetricMetaDataRequest, ShowMetricMetaDataResponse> showMetricMetaDataInvoker(
        ShowMetricMetaDataRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showMetricMetaData, hcClient);
    }

    /**
     * 查询模块详情
     *
     * 查询模块详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModuleRequest 请求对象
     * @return ShowModuleResponse
     */
    public ShowModuleResponse showModule(ShowModuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showModule);
    }

    /**
     * 查询模块详情
     *
     * 查询模块详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModuleRequest 请求对象
     * @return SyncInvoker<ShowModuleRequest, ShowModuleResponse>
     */
    public SyncInvoker<ShowModuleRequest, ShowModuleResponse> showModuleInvoker(ShowModuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showModule, hcClient);
    }

    /**
     * 获取指标统计数据
     *
     * 获取指标统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMoniterMetricStatsRequest 请求对象
     * @return ShowMoniterMetricStatsResponse
     */
    public ShowMoniterMetricStatsResponse showMoniterMetricStats(ShowMoniterMetricStatsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showMoniterMetricStats);
    }

    /**
     * 获取指标统计数据
     *
     * 获取指标统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMoniterMetricStatsRequest 请求对象
     * @return SyncInvoker<ShowMoniterMetricStatsRequest, ShowMoniterMetricStatsResponse>
     */
    public SyncInvoker<ShowMoniterMetricStatsRequest, ShowMoniterMetricStatsResponse> showMoniterMetricStatsInvoker(
        ShowMoniterMetricStatsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showMoniterMetricStats, hcClient);
    }

    /**
     * 获取数据管道详情
     *
     * 获取数据管道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeRequest 请求对象
     * @return ShowPipeResponse
     */
    public ShowPipeResponse showPipe(ShowPipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPipe);
    }

    /**
     * 获取数据管道详情
     *
     * 获取数据管道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeRequest 请求对象
     * @return SyncInvoker<ShowPipeRequest, ShowPipeResponse>
     */
    public SyncInvoker<ShowPipeRequest, ShowPipeResponse> showPipeInvoker(ShowPipeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPipe, hcClient);
    }

    /**
     * 获取实时消费配置
     *
     * 获取实时消费配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeConsumptionRequest 请求对象
     * @return ShowPipeConsumptionResponse
     */
    public ShowPipeConsumptionResponse showPipeConsumption(ShowPipeConsumptionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPipeConsumption);
    }

    /**
     * 获取实时消费配置
     *
     * 获取实时消费配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeConsumptionRequest 请求对象
     * @return SyncInvoker<ShowPipeConsumptionRequest, ShowPipeConsumptionResponse>
     */
    public SyncInvoker<ShowPipeConsumptionRequest, ShowPipeConsumptionResponse> showPipeConsumptionInvoker(
        ShowPipeConsumptionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPipeConsumption, hcClient);
    }

    /**
     * 获取索引信息
     *
     * 获取索引信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeIndexRequest 请求对象
     * @return ShowPipeIndexResponse
     */
    public ShowPipeIndexResponse showPipeIndex(ShowPipeIndexRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPipeIndex);
    }

    /**
     * 获取索引信息
     *
     * 获取索引信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeIndexRequest 请求对象
     * @return SyncInvoker<ShowPipeIndexRequest, ShowPipeIndexResponse>
     */
    public SyncInvoker<ShowPipeIndexRequest, ShowPipeIndexResponse> showPipeIndexInvoker(ShowPipeIndexRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPipeIndex, hcClient);
    }

    /**
     * 获取行管信息
     *
     * 获取行管信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlatformManagedRequest 请求对象
     * @return ShowPlatformManagedResponse
     */
    public ShowPlatformManagedResponse showPlatformManaged(ShowPlatformManagedRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlatformManaged);
    }

    /**
     * 获取行管信息
     *
     * 获取行管信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlatformManagedRequest 请求对象
     * @return SyncInvoker<ShowPlatformManagedRequest, ShowPlatformManagedResponse>
     */
    public SyncInvoker<ShowPlatformManagedRequest, ShowPlatformManagedResponse> showPlatformManagedInvoker(
        ShowPlatformManagedRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPlatformManaged, hcClient);
    }

    /**
     * 查询剧本详情
     *
     * 查询剧本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRequest 请求对象
     * @return ShowPlaybookResponse
     */
    public ShowPlaybookResponse showPlaybook(ShowPlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybook);
    }

    /**
     * 查询剧本详情
     *
     * 查询剧本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRequest 请求对象
     * @return SyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>
     */
    public SyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybookInvoker(ShowPlaybookRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPlaybook, hcClient);
    }

    /**
     * 查询剧本实例详情
     *
     * 查询剧本实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookInstanceRequest 请求对象
     * @return ShowPlaybookInstanceResponse
     */
    public ShowPlaybookInstanceResponse showPlaybookInstance(ShowPlaybookInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookInstance);
    }

    /**
     * 查询剧本实例详情
     *
     * 查询剧本实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookInstanceRequest 请求对象
     * @return SyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse>
     */
    public SyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstanceInvoker(
        ShowPlaybookInstanceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPlaybookInstance, hcClient);
    }

    /**
     * 剧本运行监控
     *
     * 剧本运行监控（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookMonitorsRequest 请求对象
     * @return ShowPlaybookMonitorsResponse
     */
    public ShowPlaybookMonitorsResponse showPlaybookMonitors(ShowPlaybookMonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookMonitors);
    }

    /**
     * 剧本运行监控
     *
     * 剧本运行监控（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookMonitorsRequest 请求对象
     * @return SyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse>
     */
    public SyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> showPlaybookMonitorsInvoker(
        ShowPlaybookMonitorsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPlaybookMonitors, hcClient);
    }

    /**
     * 查询剧本规则详情
     *
     * 查询剧本规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRuleRequest 请求对象
     * @return ShowPlaybookRuleResponse
     */
    public ShowPlaybookRuleResponse showPlaybookRule(ShowPlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookRule);
    }

    /**
     * 查询剧本规则详情
     *
     * 查询剧本规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRuleRequest 请求对象
     * @return SyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>
     */
    public SyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRuleInvoker(
        ShowPlaybookRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPlaybookRule, hcClient);
    }

    /**
     * 剧本数据统计
     *
     * 剧本统计数据（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookStatisticsRequest 请求对象
     * @return ShowPlaybookStatisticsResponse
     */
    public ShowPlaybookStatisticsResponse showPlaybookStatistics(ShowPlaybookStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookStatistics);
    }

    /**
     * 剧本数据统计
     *
     * 剧本统计数据（待下线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookStatisticsRequest 请求对象
     * @return SyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse>
     */
    public SyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatisticsInvoker(
        ShowPlaybookStatisticsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPlaybookStatistics, hcClient);
    }

    /**
     * 查询剧本拓扑关系
     *
     * 查询剧本拓扑关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookTopologyRequest 请求对象
     * @return ShowPlaybookTopologyResponse
     */
    public ShowPlaybookTopologyResponse showPlaybookTopology(ShowPlaybookTopologyRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookTopology);
    }

    /**
     * 查询剧本拓扑关系
     *
     * 查询剧本拓扑关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookTopologyRequest 请求对象
     * @return SyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>
     */
    public SyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopologyInvoker(
        ShowPlaybookTopologyRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPlaybookTopology, hcClient);
    }

    /**
     * 查询剧本版本详情
     *
     * 查询剧本版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookVersionRequest 请求对象
     * @return ShowPlaybookVersionResponse
     */
    public ShowPlaybookVersionResponse showPlaybookVersion(ShowPlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookVersion);
    }

    /**
     * 查询剧本版本详情
     *
     * 查询剧本版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookVersionRequest 请求对象
     * @return SyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse>
     */
    public SyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> showPlaybookVersionInvoker(
        ShowPlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPlaybookVersion, hcClient);
    }

    /**
     * 查询策略视图对象
     *
     * 查询策略视图对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPolicy);
    }

    /**
     * 查询策略视图对象
     *
     * 查询策略视图对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPolicy, hcClient);
    }

    /**
     * 查询预处理规则列表
     *
     * 查询预处理规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPreProcessRulesListRequest 请求对象
     * @return ShowPreProcessRulesListResponse
     */
    public ShowPreProcessRulesListResponse showPreProcessRulesList(ShowPreProcessRulesListRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPreProcessRulesList);
    }

    /**
     * 查询预处理规则列表
     *
     * 查询预处理规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPreProcessRulesListRequest 请求对象
     * @return SyncInvoker<ShowPreProcessRulesListRequest, ShowPreProcessRulesListResponse>
     */
    public SyncInvoker<ShowPreProcessRulesListRequest, ShowPreProcessRulesListResponse> showPreProcessRulesListInvoker(
        ShowPreProcessRulesListRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPreProcessRulesList, hcClient);
    }

    /**
     * 获取报告详情
     *
     * 获取报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportInfoRequest 请求对象
     * @return ShowReportInfoResponse
     */
    public ShowReportInfoResponse showReportInfo(ShowReportInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showReportInfo);
    }

    /**
     * 获取报告详情
     *
     * 获取报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportInfoRequest 请求对象
     * @return SyncInvoker<ShowReportInfoRequest, ShowReportInfoResponse>
     */
    public SyncInvoker<ShowReportInfoRequest, ShowReportInfoResponse> showReportInfoInvoker(
        ShowReportInfoRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showReportInfo, hcClient);
    }

    /**
     * 获取资产详情
     *
     * 获取资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRequest 请求对象
     * @return ShowResourceResponse
     */
    public ShowResourceResponse showResource(ShowResourceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showResource);
    }

    /**
     * 获取资产详情
     *
     * 获取资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRequest 请求对象
     * @return SyncInvoker<ShowResourceRequest, ShowResourceResponse>
     */
    public SyncInvoker<ShowResourceRequest, ShowResourceResponse> showResourceInvoker(ShowResourceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showResource, hcClient);
    }

    /**
     * 获取检索条件详情
     *
     * 获取检索条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchConditionRequest 请求对象
     * @return ShowSearchConditionResponse
     */
    public ShowSearchConditionResponse showSearchCondition(ShowSearchConditionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showSearchCondition);
    }

    /**
     * 获取检索条件详情
     *
     * 获取检索条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSearchConditionRequest 请求对象
     * @return SyncInvoker<ShowSearchConditionRequest, ShowSearchConditionResponse>
     */
    public SyncInvoker<ShowSearchConditionRequest, ShowSearchConditionResponse> showSearchConditionInvoker(
        ShowSearchConditionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showSearchCondition, hcClient);
    }

    /**
     * 投递规则详情
     *
     * 投递规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperRequest 请求对象
     * @return ShowShipperResponse
     */
    public ShowShipperResponse showShipper(ShowShipperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showShipper);
    }

    /**
     * 投递规则详情
     *
     * 投递规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperRequest 请求对象
     * @return SyncInvoker<ShowShipperRequest, ShowShipperResponse>
     */
    public SyncInvoker<ShowShipperRequest, ShowShipperResponse> showShipperInvoker(ShowShipperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showShipper, hcClient);
    }

    /**
     * 获取委托权限
     *
     * 获取委托权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperDelegateAuthRequest 请求对象
     * @return ShowShipperDelegateAuthResponse
     */
    public ShowShipperDelegateAuthResponse showShipperDelegateAuth(ShowShipperDelegateAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showShipperDelegateAuth);
    }

    /**
     * 获取委托权限
     *
     * 获取委托权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperDelegateAuthRequest 请求对象
     * @return SyncInvoker<ShowShipperDelegateAuthRequest, ShowShipperDelegateAuthResponse>
     */
    public SyncInvoker<ShowShipperDelegateAuthRequest, ShowShipperDelegateAuthResponse> showShipperDelegateAuthInvoker(
        ShowShipperDelegateAuthRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showShipperDelegateAuth, hcClient);
    }

    /**
     * 参数查询
     *
     * 参数查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperParamRequest 请求对象
     * @return ShowShipperParamResponse
     */
    public ShowShipperParamResponse showShipperParam(ShowShipperParamRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showShipperParam);
    }

    /**
     * 参数查询
     *
     * 参数查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShipperParamRequest 请求对象
     * @return SyncInvoker<ShowShipperParamRequest, ShowShipperParamResponse>
     */
    public SyncInvoker<ShowShipperParamRequest, ShowShipperParamResponse> showShipperParamInvoker(
        ShowShipperParamRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showShipperParam, hcClient);
    }

    /**
     * 查询待办的详情
     *
     * 查询待办的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showTask);
    }

    /**
     * 查询待办的详情
     *
     * 查询待办的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showTask, hcClient);
    }

    /**
     * 获取漏洞详情
     *
     * 获取漏洞详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulnerabilityRequest 请求对象
     * @return ShowVulnerabilityResponse
     */
    public ShowVulnerabilityResponse showVulnerability(ShowVulnerabilityRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showVulnerability);
    }

    /**
     * 获取漏洞详情
     *
     * 获取漏洞详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulnerabilityRequest 请求对象
     * @return SyncInvoker<ShowVulnerabilityRequest, ShowVulnerabilityResponse>
     */
    public SyncInvoker<ShowVulnerabilityRequest, ShowVulnerabilityResponse> showVulnerabilityInvoker(
        ShowVulnerabilityRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showVulnerability, hcClient);
    }

    /**
     * 查询工作空间详情
     *
     * 查询工作空间名称、描述等详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceRequest 请求对象
     * @return ShowWorkspaceResponse
     */
    public ShowWorkspaceResponse showWorkspace(ShowWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showWorkspace);
    }

    /**
     * 查询工作空间详情
     *
     * 查询工作空间名称、描述等详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceRequest, ShowWorkspaceResponse>
     */
    public SyncInvoker<ShowWorkspaceRequest, ShowWorkspaceResponse> showWorkspaceInvoker(ShowWorkspaceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showWorkspace, hcClient);
    }

    /**
     * 更新告警规则
     *
     * 更新告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return UpdateAlertRuleResponse
     */
    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateAlertRule);
    }

    /**
     * 更新告警规则
     *
     * 更新告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
     */
    public SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRuleInvoker(
        UpdateAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateAlertRule, hcClient);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAopWorkflowRequest 请求对象
     * @return UpdateAopWorkflowResponse
     */
    public UpdateAopWorkflowResponse updateAopWorkflow(UpdateAopWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateAopWorkflow);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAopWorkflowRequest 请求对象
     * @return SyncInvoker<UpdateAopWorkflowRequest, UpdateAopWorkflowResponse>
     */
    public SyncInvoker<UpdateAopWorkflowRequest, UpdateAopWorkflowResponse> updateAopWorkflowInvoker(
        UpdateAopWorkflowRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateAopWorkflow, hcClient);
    }

    /**
     * 更新流程版本信息
     *
     * 更新流程版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAopWorkflowVersionRequest 请求对象
     * @return UpdateAopWorkflowVersionResponse
     */
    public UpdateAopWorkflowVersionResponse updateAopWorkflowVersion(UpdateAopWorkflowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateAopWorkflowVersion);
    }

    /**
     * 更新流程版本信息
     *
     * 更新流程版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAopWorkflowVersionRequest 请求对象
     * @return SyncInvoker<UpdateAopWorkflowVersionRequest, UpdateAopWorkflowVersionResponse>
     */
    public SyncInvoker<UpdateAopWorkflowVersionRequest, UpdateAopWorkflowVersionResponse> updateAopWorkflowVersionInvoker(
        UpdateAopWorkflowVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateAopWorkflowVersion, hcClient);
    }

    /**
     * 修改目录
     *
     * 修改自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCatalogueRequest 请求对象
     * @return UpdateCatalogueResponse
     */
    public UpdateCatalogueResponse updateCatalogue(UpdateCatalogueRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateCatalogue);
    }

    /**
     * 修改目录
     *
     * 修改自定义目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCatalogueRequest 请求对象
     * @return SyncInvoker<UpdateCatalogueRequest, UpdateCatalogueResponse>
     */
    public SyncInvoker<UpdateCatalogueRequest, UpdateCatalogueResponse> updateCatalogueInvoker(
        UpdateCatalogueRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateCatalogue, hcClient);
    }

    /**
     * 修改分类
     *
     * 修改分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClassifierRequest 请求对象
     * @return UpdateClassifierResponse
     */
    public UpdateClassifierResponse updateClassifier(UpdateClassifierRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateClassifier);
    }

    /**
     * 修改分类
     *
     * 修改分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClassifierRequest 请求对象
     * @return SyncInvoker<UpdateClassifierRequest, UpdateClassifierResponse>
     */
    public SyncInvoker<UpdateClassifierRequest, UpdateClassifierResponse> updateClassifierInvoker(
        UpdateClassifierRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateClassifier, hcClient);
    }

    /**
     * 更改采集通道
     *
     * 更改采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorChannelRequest 请求对象
     * @return UpdateCollectorChannelResponse
     */
    public UpdateCollectorChannelResponse updateCollectorChannel(UpdateCollectorChannelRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateCollectorChannel);
    }

    /**
     * 更改采集通道
     *
     * 更改采集通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorChannelRequest 请求对象
     * @return SyncInvoker<UpdateCollectorChannelRequest, UpdateCollectorChannelResponse>
     */
    public SyncInvoker<UpdateCollectorChannelRequest, UpdateCollectorChannelResponse> updateCollectorChannelInvoker(
        UpdateCollectorChannelRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateCollectorChannel, hcClient);
    }

    /**
     * 更新采集通道分组
     *
     * 更新采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorChannelGroupRequest 请求对象
     * @return UpdateCollectorChannelGroupResponse
     */
    public UpdateCollectorChannelGroupResponse updateCollectorChannelGroup(UpdateCollectorChannelGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateCollectorChannelGroup);
    }

    /**
     * 更新采集通道分组
     *
     * 更新采集通道分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorChannelGroupRequest 请求对象
     * @return SyncInvoker<UpdateCollectorChannelGroupRequest, UpdateCollectorChannelGroupResponse>
     */
    public SyncInvoker<UpdateCollectorChannelGroupRequest, UpdateCollectorChannelGroupResponse> updateCollectorChannelGroupInvoker(
        UpdateCollectorChannelGroupRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateCollectorChannelGroup, hcClient);
    }

    /**
     * 更新采集连接
     *
     * 更新采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorConnectionRequest 请求对象
     * @return UpdateCollectorConnectionResponse
     */
    public UpdateCollectorConnectionResponse updateCollectorConnection(UpdateCollectorConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateCollectorConnection);
    }

    /**
     * 更新采集连接
     *
     * 更新采集连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCollectorConnectionRequest 请求对象
     * @return SyncInvoker<UpdateCollectorConnectionRequest, UpdateCollectorConnectionResponse>
     */
    public SyncInvoker<UpdateCollectorConnectionRequest, UpdateCollectorConnectionResponse> updateCollectorConnectionInvoker(
        UpdateCollectorConnectionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateCollectorConnection, hcClient);
    }

    /**
     * 点击保存按钮
     *
     * 点击保存按钮
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentConfigurationRequest 请求对象
     * @return UpdateComponentConfigurationResponse
     */
    public UpdateComponentConfigurationResponse updateComponentConfiguration(
        UpdateComponentConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateComponentConfiguration);
    }

    /**
     * 点击保存按钮
     *
     * 点击保存按钮
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResponse>
     */
    public SyncInvoker<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResponse> updateComponentConfigurationInvoker(
        UpdateComponentConfigurationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateComponentConfiguration, hcClient);
    }

    /**
     * 更新插件配置模板
     *
     * 更新某个在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentTemplateRequest 请求对象
     * @return UpdateComponentTemplateResponse
     */
    public UpdateComponentTemplateResponse updateComponentTemplate(UpdateComponentTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateComponentTemplate);
    }

    /**
     * 更新插件配置模板
     *
     * 更新某个在配置流程时的插件配置模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentTemplateRequest 请求对象
     * @return SyncInvoker<UpdateComponentTemplateRequest, UpdateComponentTemplateResponse>
     */
    public SyncInvoker<UpdateComponentTemplateRequest, UpdateComponentTemplateResponse> updateComponentTemplateInvoker(
        UpdateComponentTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateComponentTemplate, hcClient);
    }

    /**
     * 更新字典
     *
     * 更新字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationDictionariesRequest 请求对象
     * @return UpdateConfigurationDictionariesResponse
     */
    public UpdateConfigurationDictionariesResponse updateConfigurationDictionaries(
        UpdateConfigurationDictionariesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateConfigurationDictionaries);
    }

    /**
     * 更新字典
     *
     * 更新字典数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationDictionariesRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationDictionariesRequest, UpdateConfigurationDictionariesResponse>
     */
    public SyncInvoker<UpdateConfigurationDictionariesRequest, UpdateConfigurationDictionariesResponse> updateConfigurationDictionariesInvoker(
        UpdateConfigurationDictionariesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateConfigurationDictionaries, hcClient);
    }

    /**
     * 更新操作连接
     *
     * 更新操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateConnection);
    }

    /**
     * 更新操作连接
     *
     * 更新操作连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionInvoker(
        UpdateConnectionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateConnection, hcClient);
    }

    /**
     * 编辑数据对象
     *
     * 编辑数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataobjectRequest 请求对象
     * @return UpdateDataobjectResponse
     */
    public UpdateDataobjectResponse updateDataobject(UpdateDataobjectRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateDataobject);
    }

    /**
     * 编辑数据对象
     *
     * 编辑数据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataobjectRequest 请求对象
     * @return SyncInvoker<UpdateDataobjectRequest, UpdateDataobjectResponse>
     */
    public SyncInvoker<UpdateDataobjectRequest, UpdateDataobjectResponse> updateDataobjectInvoker(
        UpdateDataobjectRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateDataobject, hcClient);
    }

    /**
     * 修改数据空间
     *
     * 修改数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataspaceRequest 请求对象
     * @return UpdateDataspaceResponse
     */
    public UpdateDataspaceResponse updateDataspace(UpdateDataspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateDataspace);
    }

    /**
     * 修改数据空间
     *
     * 修改数据空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataspaceRequest 请求对象
     * @return SyncInvoker<UpdateDataspaceRequest, UpdateDataspaceResponse>
     */
    public SyncInvoker<UpdateDataspaceRequest, UpdateDataspaceResponse> updateDataspaceInvoker(
        UpdateDataspaceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateDataspace, hcClient);
    }

    /**
     * 更新威胁情报
     *
     * 更新威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndicatorRequest 请求对象
     * @return UpdateIndicatorResponse
     */
    public UpdateIndicatorResponse updateIndicator(UpdateIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateIndicator);
    }

    /**
     * 更新威胁情报
     *
     * 更新威胁情报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndicatorRequest 请求对象
     * @return SyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>
     */
    public SyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicatorInvoker(
        UpdateIndicatorRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateIndicator, hcClient);
    }

    /**
     * 修改布局
     *
     * 修改布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutRequest 请求对象
     * @return UpdateLayoutResponse
     */
    public UpdateLayoutResponse updateLayout(UpdateLayoutRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateLayout);
    }

    /**
     * 修改布局
     *
     * 修改布局
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutRequest 请求对象
     * @return SyncInvoker<UpdateLayoutRequest, UpdateLayoutResponse>
     */
    public SyncInvoker<UpdateLayoutRequest, UpdateLayoutResponse> updateLayoutInvoker(UpdateLayoutRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateLayout, hcClient);
    }

    /**
     * 批量更新布局页面
     *
     * 更新页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutWizardsRequest 请求对象
     * @return UpdateLayoutWizardsResponse
     */
    public UpdateLayoutWizardsResponse updateLayoutWizards(UpdateLayoutWizardsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateLayoutWizards);
    }

    /**
     * 批量更新布局页面
     *
     * 更新页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutWizardsRequest 请求对象
     * @return SyncInvoker<UpdateLayoutWizardsRequest, UpdateLayoutWizardsResponse>
     */
    public SyncInvoker<UpdateLayoutWizardsRequest, UpdateLayoutWizardsResponse> updateLayoutWizardsInvoker(
        UpdateLayoutWizardsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateLayoutWizards, hcClient);
    }

    /**
     * 修改单个映射
     *
     * 修改单个映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMapperRequest 请求对象
     * @return UpdateMapperResponse
     */
    public UpdateMapperResponse updateMapper(UpdateMapperRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateMapper);
    }

    /**
     * 修改单个映射
     *
     * 修改单个映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMapperRequest 请求对象
     * @return SyncInvoker<UpdateMapperRequest, UpdateMapperResponse>
     */
    public SyncInvoker<UpdateMapperRequest, UpdateMapperResponse> updateMapperInvoker(UpdateMapperRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateMapper, hcClient);
    }

    /**
     * 修分类映射启用禁用状态
     *
     * 修分类映射启用禁用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMappingInfoStatusRequest 请求对象
     * @return UpdateMappingInfoStatusResponse
     */
    public UpdateMappingInfoStatusResponse updateMappingInfoStatus(UpdateMappingInfoStatusRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateMappingInfoStatus);
    }

    /**
     * 修分类映射启用禁用状态
     *
     * 修分类映射启用禁用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMappingInfoStatusRequest 请求对象
     * @return SyncInvoker<UpdateMappingInfoStatusRequest, UpdateMappingInfoStatusResponse>
     */
    public SyncInvoker<UpdateMappingInfoStatusRequest, UpdateMappingInfoStatusResponse> updateMappingInfoStatusInvoker(
        UpdateMappingInfoStatusRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateMappingInfoStatus, hcClient);
    }

    /**
     * 更新指标定义
     *
     * 更新指标定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricsRequest 请求对象
     * @return UpdateMetricsResponse
     */
    public UpdateMetricsResponse updateMetrics(UpdateMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateMetrics);
    }

    /**
     * 更新指标定义
     *
     * 更新指标定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricsRequest 请求对象
     * @return SyncInvoker<UpdateMetricsRequest, UpdateMetricsResponse>
     */
    public SyncInvoker<UpdateMetricsRequest, UpdateMetricsResponse> updateMetricsInvoker(UpdateMetricsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateMetrics, hcClient);
    }

    /**
     * 更新布局模块
     *
     * 更新模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleRequest 请求对象
     * @return UpdateModuleResponse
     */
    public UpdateModuleResponse updateModule(UpdateModuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateModule);
    }

    /**
     * 更新布局模块
     *
     * 更新模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModuleRequest 请求对象
     * @return SyncInvoker<UpdateModuleRequest, UpdateModuleResponse>
     */
    public SyncInvoker<UpdateModuleRequest, UpdateModuleResponse> updateModuleInvoker(UpdateModuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateModule, hcClient);
    }

    /**
     * 更新节点补充信息
     *
     * 更新节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNodeRequest 请求对象
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNode(UpdateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateNode);
    }

    /**
     * 更新节点补充信息
     *
     * 更新节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNodeRequest 请求对象
     * @return SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>
     */
    public SyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeInvoker(UpdateNodeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateNode, hcClient);
    }

    /**
     * 修改数据管道
     *
     * 修改数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeRequest 请求对象
     * @return UpdatePipeResponse
     */
    public UpdatePipeResponse updatePipe(UpdatePipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePipe);
    }

    /**
     * 修改数据管道
     *
     * 修改数据管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeRequest 请求对象
     * @return SyncInvoker<UpdatePipeRequest, UpdatePipeResponse>
     */
    public SyncInvoker<UpdatePipeRequest, UpdatePipeResponse> updatePipeInvoker(UpdatePipeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updatePipe, hcClient);
    }

    /**
     * 修改索引
     *
     * 修改索引
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeIndexRequest 请求对象
     * @return UpdatePipeIndexResponse
     */
    public UpdatePipeIndexResponse updatePipeIndex(UpdatePipeIndexRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePipeIndex);
    }

    /**
     * 修改索引
     *
     * 修改索引
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeIndexRequest 请求对象
     * @return SyncInvoker<UpdatePipeIndexRequest, UpdatePipeIndexResponse>
     */
    public SyncInvoker<UpdatePipeIndexRequest, UpdatePipeIndexResponse> updatePipeIndexInvoker(
        UpdatePipeIndexRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updatePipeIndex, hcClient);
    }

    /**
     * 修改剧本
     *
     * 修改剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRequest 请求对象
     * @return UpdatePlaybookResponse
     */
    public UpdatePlaybookResponse updatePlaybook(UpdatePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePlaybook);
    }

    /**
     * 修改剧本
     *
     * 修改剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>
     */
    public SyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybookInvoker(
        UpdatePlaybookRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updatePlaybook, hcClient);
    }

    /**
     * 更新剧本动作
     *
     * 更新剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookActionRequest 请求对象
     * @return UpdatePlaybookActionResponse
     */
    public UpdatePlaybookActionResponse updatePlaybookAction(UpdatePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePlaybookAction);
    }

    /**
     * 更新剧本动作
     *
     * 更新剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookActionRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>
     */
    public SyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookActionInvoker(
        UpdatePlaybookActionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updatePlaybookAction, hcClient);
    }

    /**
     * 更新剧本规则
     *
     * 更新剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRuleRequest 请求对象
     * @return UpdatePlaybookRuleResponse
     */
    public UpdatePlaybookRuleResponse updatePlaybookRule(UpdatePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePlaybookRule);
    }

    /**
     * 更新剧本规则
     *
     * 更新剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRuleRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>
     */
    public SyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRuleInvoker(
        UpdatePlaybookRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updatePlaybookRule, hcClient);
    }

    /**
     * 更新剧本版本
     *
     * 更新剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookVersionRequest 请求对象
     * @return UpdatePlaybookVersionResponse
     */
    public UpdatePlaybookVersionResponse updatePlaybookVersion(UpdatePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePlaybookVersion);
    }

    /**
     * 更新剧本版本
     *
     * 更新剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookVersionRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>
     */
    public SyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersionInvoker(
        UpdatePlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updatePlaybookVersion, hcClient);
    }

    /**
     * 更新收件人邮箱状态
     *
     * 更新收件人邮箱状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecipientsEmailStatusRequest 请求对象
     * @return UpdateRecipientsEmailStatusResponse
     */
    public UpdateRecipientsEmailStatusResponse updateRecipientsEmailStatus(UpdateRecipientsEmailStatusRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateRecipientsEmailStatus);
    }

    /**
     * 更新收件人邮箱状态
     *
     * 更新收件人邮箱状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecipientsEmailStatusRequest 请求对象
     * @return SyncInvoker<UpdateRecipientsEmailStatusRequest, UpdateRecipientsEmailStatusResponse>
     */
    public SyncInvoker<UpdateRecipientsEmailStatusRequest, UpdateRecipientsEmailStatusResponse> updateRecipientsEmailStatusInvoker(
        UpdateRecipientsEmailStatusRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateRecipientsEmailStatus, hcClient);
    }

    /**
     * 更新报告
     *
     * 更新报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportRequest 请求对象
     * @return UpdateReportResponse
     */
    public UpdateReportResponse updateReport(UpdateReportRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateReport);
    }

    /**
     * 更新报告
     *
     * 更新报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportRequest 请求对象
     * @return SyncInvoker<UpdateReportRequest, UpdateReportResponse>
     */
    public SyncInvoker<UpdateReportRequest, UpdateReportResponse> updateReportInvoker(UpdateReportRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateReport, hcClient);
    }

    /**
     * 修改检索条件
     *
     * 修改检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSearchConditionRequest 请求对象
     * @return UpdateSearchConditionResponse
     */
    public UpdateSearchConditionResponse updateSearchCondition(UpdateSearchConditionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateSearchCondition);
    }

    /**
     * 修改检索条件
     *
     * 修改检索条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSearchConditionRequest 请求对象
     * @return SyncInvoker<UpdateSearchConditionRequest, UpdateSearchConditionResponse>
     */
    public SyncInvoker<UpdateSearchConditionRequest, UpdateSearchConditionResponse> updateSearchConditionInvoker(
        UpdateSearchConditionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateSearchCondition, hcClient);
    }

    /**
     * 更新订阅资源
     *
     * 更新订阅资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionOrderRequest 请求对象
     * @return UpdateSubscriptionOrderResponse
     */
    public UpdateSubscriptionOrderResponse updateSubscriptionOrder(UpdateSubscriptionOrderRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateSubscriptionOrder);
    }

    /**
     * 更新订阅资源
     *
     * 更新订阅资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionOrderRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionOrderRequest, UpdateSubscriptionOrderResponse>
     */
    public SyncInvoker<UpdateSubscriptionOrderRequest, UpdateSubscriptionOrderResponse> updateSubscriptionOrderInvoker(
        UpdateSubscriptionOrderRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateSubscriptionOrder, hcClient);
    }

    /**
     * 更新标签值
     *
     * 更新标签值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTagValueRequest 请求对象
     * @return UpdateTagValueResponse
     */
    public UpdateTagValueResponse updateTagValue(UpdateTagValueRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateTagValue);
    }

    /**
     * 更新标签值
     *
     * 更新标签值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTagValueRequest 请求对象
     * @return SyncInvoker<UpdateTagValueRequest, UpdateTagValueResponse>
     */
    public SyncInvoker<UpdateTagValueRequest, UpdateTagValueResponse> updateTagValueInvoker(
        UpdateTagValueRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateTagValue, hcClient);
    }

    /**
     * 更新待办的信息
     *
     * 更新待办的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateTask);
    }

    /**
     * 更新待办的信息
     *
     * 更新待办的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateTask, hcClient);
    }

    /**
     * 更新VPC终端节点服务
     *
     * 更新VPC终端节点服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcEndpointServiceRequest 请求对象
     * @return UpdateVpcEndpointServiceResponse
     */
    public UpdateVpcEndpointServiceResponse updateVpcEndpointService(UpdateVpcEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateVpcEndpointService);
    }

    /**
     * 更新VPC终端节点服务
     *
     * 更新VPC终端节点服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcEndpointServiceRequest 请求对象
     * @return SyncInvoker<UpdateVpcEndpointServiceRequest, UpdateVpcEndpointServiceResponse>
     */
    public SyncInvoker<UpdateVpcEndpointServiceRequest, UpdateVpcEndpointServiceResponse> updateVpcEndpointServiceInvoker(
        UpdateVpcEndpointServiceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateVpcEndpointService, hcClient);
    }

    /**
     * 更新流程实例
     *
     * 更新流程实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowInstanceRequest 请求对象
     * @return UpdateWorkflowInstanceResponse
     */
    public UpdateWorkflowInstanceResponse updateWorkflowInstance(UpdateWorkflowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateWorkflowInstance);
    }

    /**
     * 更新流程实例
     *
     * 更新流程实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowInstanceRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowInstanceRequest, UpdateWorkflowInstanceResponse>
     */
    public SyncInvoker<UpdateWorkflowInstanceRequest, UpdateWorkflowInstanceResponse> updateWorkflowInstanceInvoker(
        UpdateWorkflowInstanceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateWorkflowInstance, hcClient);
    }

    /**
     * 更新工作空间
     *
     * 更新工作空间名称、描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateWorkspace);
    }

    /**
     * 更新工作空间
     *
     * 更新工作空间名称、描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateWorkspace, hcClient);
    }

    /**
     * 上传附件
     *
     * 上传附件至OBS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAttachmentRequest 请求对象
     * @return UploadAttachmentResponse
     */
    public UploadAttachmentResponse uploadAttachment(UploadAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.uploadAttachment);
    }

    /**
     * 上传附件
     *
     * 上传附件至OBS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAttachmentRequest 请求对象
     * @return SyncInvoker<UploadAttachmentRequest, UploadAttachmentResponse>
     */
    public SyncInvoker<UploadAttachmentRequest, UploadAttachmentResponse> uploadAttachmentInvoker(
        UploadAttachmentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.uploadAttachment, hcClient);
    }

    /**
     * 校验流程版本
     *
     * 校验流程版本.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAopWorkflowVersionRequest 请求对象
     * @return ValidateAopWorkflowVersionResponse
     */
    public ValidateAopWorkflowVersionResponse validateAopWorkflowVersion(ValidateAopWorkflowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.validateAopWorkflowVersion);
    }

    /**
     * 校验流程版本
     *
     * 校验流程版本.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAopWorkflowVersionRequest 请求对象
     * @return SyncInvoker<ValidateAopWorkflowVersionRequest, ValidateAopWorkflowVersionResponse>
     */
    public SyncInvoker<ValidateAopWorkflowVersionRequest, ValidateAopWorkflowVersionResponse> validateAopWorkflowVersionInvoker(
        ValidateAopWorkflowVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.validateAopWorkflowVersion, hcClient);
    }

}
