package com.huaweicloud.sdk.dataartsstudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AcceptSecurityApplicationRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AcceptSecurityApplicationResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddDesignEntityTagsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddDesignEntityTagsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddTagToAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddTagToAssetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddWorkSpaceUsersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddWorkSpaceUsersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApplySecurityTableAuthorityRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApplySecurityTableAuthorityResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AssociateClassificationToEntityRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AssociateClassificationToEntityResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AssociateSecurityLevelToEntitieRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AssociateSecurityLevelToEntitieResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeActionApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeActionApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeDataConnectionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeDataConnectionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchApproveApplyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchApproveApplyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchApproveSecurityApplicationsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchApproveSecurityApplicationsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchAssociateClassificationToEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchAssociateClassificationToEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchAssociateSecurityLevelToEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchAssociateSecurityLevelToEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchCreateDesignTableModelsFromLogicRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchCreateDesignTableModelsFromLogicResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchCreateSecurityPermissionSetMembersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchCreateSecurityPermissionSetMembersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchCreateSecurityPermissionSetPermissionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchCreateSecurityPermissionSetPermissionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityDynamicMaskingPoliciesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityDynamicMaskingPoliciesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityPermissionSetMembersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityPermissionSetMembersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityPermissionSetPermissionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityPermissionSetPermissionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityResourcePermissionPoliciesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityResourcePermissionPoliciesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecuritySecrecyLevelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecuritySecrecyLevelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteTemplatesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteTemplatesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchOfflineRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchOfflineResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchPublishRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchPublishResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchRejectSecurityApplicationsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchRejectSecurityApplicationsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchSyncMetadataRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchSyncMetadataResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchTagRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchTagResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchUpdateSecurityDlfDataWareHousesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchUpdateSecurityDlfDataWareHousesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CancelFactoryPackagesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CancelFactoryPackagesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ChangeCatalogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ChangeCatalogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ChangeResourceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ChangeResourceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ChangeSubjectsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ChangeSubjectsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CheckDimensionStatusRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CheckDimensionStatusResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CheckFactLogicTableStatusRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CheckFactLogicTableStatusResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CheckSecurityDataClassificationCombineRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CheckSecurityDataClassificationCombineRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CompareDesignVersionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CompareDesignVersionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ConfirmApprovalsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ConfirmApprovalsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ConfirmMessageRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ConfirmMessageResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CountAllModelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CountAllModelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CountOverviewsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CountOverviewsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CountStandardsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CountStandardsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CountTableModelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CountTableModelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateApproverRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateApproverResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateBizMetricRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateBizMetricResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateCatalogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateCatalogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateCodeTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateCodeTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateConnectionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateConnectionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignAggregationLogicTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignAggregationLogicTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignAtomicIndexRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignAtomicIndexResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignCompoundMetricRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignCompoundMetricResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignDerivativeIndexRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignDerivativeIndexResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignDimensionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDesignDimensionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryEnvRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryEnvResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryJobRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryJobResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryPendingItemsPackageRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryPendingItemsPackageResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateLineageInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateLineageInfoResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateManagerWorkSpaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateManagerWorkSpaceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateAssetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityAssignedQueueRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityAssignedQueueResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDataClassificationCombineRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDataClassificationCombineRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDataClassificationRuleGroupRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDataClassificationRuleGroupResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDynamicMaskingPolicyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDynamicMaskingPolicyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetMemberRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetMemberResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetPermissionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetPermissionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityResourcePermissionPolicyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityResourcePermissionPolicyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecuritySecrecyLevelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecuritySecrecyLevelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateServiceCatalogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateServiceCatalogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateStandardRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateStandardResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateStandardTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateStandardTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSubjectNewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSubjectNewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSubjectRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSubjectResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateTableModelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateTableModelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DebugApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DebugApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DebugDataconnectionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DebugDataconnectionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DebugSecurityDlfDataWareHousesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DebugSecurityDlfDataWareHousesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeclineSecurityApplicationRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeclineSecurityApplicationResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteApproverRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteApproverResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteBizMetricRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteBizMetricResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteCatalogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteCatalogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteClassificationFromEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteClassificationFromEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteCodeTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteCodeTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDataconnectionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDataconnectionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignAggregationLogicTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignAggregationLogicTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignAtomicIndexRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignAtomicIndexResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignCompoundMetricRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignCompoundMetricResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignDerivativeIndexRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignDerivativeIndexResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignDimensionLogicTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignDimensionLogicTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignDimensionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignDimensionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignFactLogicTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignFactLogicTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignLatestApprovalRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignLatestApprovalResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteEntityRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteEntityResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityAssignedQueueRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityAssignedQueueResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityDataClassificationRuleGroupRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityDataClassificationRuleGroupResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityLevelFromEntityRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityLevelFromEntityResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityPermissionSetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityPermissionSetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecuritySecrecyLevelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecuritySecrecyLevelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteServiceCatalogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteServiceCatalogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteStandardRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteStandardResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteStandardTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteStandardTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSubjectNewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSubjectNewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSubjectRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSubjectResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteTableModelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteTableModelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteTaskInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteTaskInfoResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteWorkspacesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteWorkspacesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteWorkspaceusersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteWorkspaceusersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeployFactoryPackagesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeployFactoryPackagesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteSecurityDiagnoseRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteSecurityDiagnoseResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteTaskActionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteTaskActionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDataServiceExcelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDataServiceExcelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDataServiceExcelTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDataServiceExcelTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDataServiceZipRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDataServiceZipResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDesignModelTableDdlRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDesignModelTableDdlResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDesignModelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDesignModelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDesignResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExportDesignResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportCatalogsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportCatalogsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportDataServiceExcelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportDataServiceExcelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportLineageRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportLineageResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportModelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportModelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportSecurityBuiltinCategoryGroupsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportSecurityBuiltinCategoryGroupsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.InitializeStandardTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.InitializeStandardTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAggregationLogicTablesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAggregationLogicTablesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAllCatalogListRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAllCatalogListResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAllStandardsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAllStandardsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAllTablesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAllTablesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApiCatalogListRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApiCatalogListResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApiTopNRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApiTopNResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApicGroupsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApicGroupsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApicInstancesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApicInstancesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApisRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApisResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApisTopRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApisTopResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApplyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApplyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApproversRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListApproversResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAppsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAppsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAppsTopRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListAppsTopResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListBizMetricDimensionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListBizMetricDimensionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListBizMetricOwnersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListBizMetricOwnersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListBizMetricsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListBizMetricsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListBusinessRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListBusinessResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListCatalogListRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListCatalogListResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListCatalogTreeRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListCatalogTreeResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListCategoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListCategoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListColumnsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListColumnsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListCompoundMetricsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListCompoundMetricsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListConditionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListConditionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListConsistencyTaskRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListConsistencyTaskResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataArtsStudioInstancesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataArtsStudioInstancesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataServiceInstanceAccesslogsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataServiceInstanceAccesslogsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataServiceInstancesDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataServiceInstancesDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataServiceInstancesOverviewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataServiceInstancesOverviewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataServiceMarketApisRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataServiceMarketApisResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataTablesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataTablesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataconnectionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataconnectionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDerivativeIndexesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDerivativeIndexesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDesignDataLayersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDesignDataLayersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDimensionGroupsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDimensionGroupsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDimensionLogicTablesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDimensionLogicTablesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDimensionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDimensionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDirectoriesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDirectoriesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactLogicTablesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactLogicTablesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryAlarmInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryAlarmInfoResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryJobInstancesByNameRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryJobInstancesByNameResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryJobsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryJobsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryPendingItemsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryPendingItemsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryReleasePackagesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryReleasePackagesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryScriptsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryScriptsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryTaskCompletionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryTaskCompletionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryTaskOverviewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryTaskOverviewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListInstanceListRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListInstanceListResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListManagerWorkSpacesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListManagerWorkSpacesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListMessageRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListMessageResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListMetricRelationsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListMetricRelationsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListQualityTaskListsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListQualityTaskListsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListQualityTaskRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListQualityTaskResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListQualityTemplatesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListQualityTemplatesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListRelationsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListRelationsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSchemasRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSchemasResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityApprovalsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityApprovalsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityAssignedQueuesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityAssignedQueuesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDataCategoriesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDataCategoriesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDataClassificationRuleGroupsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDataClassificationRuleGroupsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDataClassificationRulesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDataClassificationRulesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDatasourceActionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDatasourceActionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDatasourceConfigurationsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDatasourceConfigurationsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDatasourceUrlsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDatasourceUrlsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDlfDataWareHousesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDlfDataWareHousesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDynamicMaskingPoliciesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityDynamicMaskingPoliciesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityMemberPermissionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityMemberPermissionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityMemberSyncTasksRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityMemberSyncTasksResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityMemberTablePermissionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityMemberTablePermissionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetMembersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetMembersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetPermissionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetPermissionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityResourcePermissionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityResourcePermissionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityRoleActionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityRoleActionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecuritySecrecyLevelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecuritySecrecyLevelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecuritySensitiveDataOverviewsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecuritySensitiveDataOverviewsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityTableApproversRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityTableApproversResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityUnreasonablePermissionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityUnreasonablePermissionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityUserTablePermissionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityUserTablePermissionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSubjectLevelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSubjectLevelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListTableModelRelationsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListTableModelRelationsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListTableModelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListTableModelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspaceRolesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspaceRolesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspacesForUserRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspacesForUserResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspaceusersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspaceusersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MigrateApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MigrateApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MigrateCatalogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MigrateCatalogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ModifyCustomizedFieldsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ModifyCustomizedFieldsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ModifySecurityAdminRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ModifySecurityAdminResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ParseUserBehaviorRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ParseUserBehaviorResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PayForDgcOneKeyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PayForDgcOneKeyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RemoveDesignEntityTagsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RemoveDesignEntityTagsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RemoveDesignQualityInfosRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RemoveDesignQualityInfosResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RenewDataProfileRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RenewDataProfileResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ResetLinkAttributeAndStandardRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ResetLinkAttributeAndStandardResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RetryFactoryJobInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RetryFactoryJobInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RollbackApprovalRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RollbackApprovalResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchApprovalsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchApprovalsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchAtomicIndexesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchAtomicIndexesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchAuthorizeAppRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchAuthorizeAppResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchBindApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchBindApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchCatalogsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchCatalogsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchCodeTableValuesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchCodeTableValuesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchCodeTablesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchCodeTablesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchCustomizedFieldsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchCustomizedFieldsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchDebugInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchDebugInfoResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchDesignLatestApprovalDiffRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchDesignLatestApprovalDiffResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchDwByTypeRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchDwByTypeResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchFieldsForRelationRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchFieldsForRelationResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchIdByPathRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchIdByPathResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchPublishInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchPublishInfoResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchSgcComputeDimensionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchSgcComputeDimensionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchSubjectNewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchSubjectNewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchSubjectRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchSubjectResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchVersionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchVersionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SetFactoryJobTagsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SetFactoryJobTagsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAggregationLogicTableByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAggregationLogicTableByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApiDashboardRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApiDashboardResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApisDashboardRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApisDashboardResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApisDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApisDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApisOverviewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApisOverviewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAppInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAppInfoResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApplyDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowApplyDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAppsDashboardRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAppsDashboardResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAppsDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAppsDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAppsOverviewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAppsOverviewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAtomicIndexByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowAtomicIndexByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBizCatalogDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBizCatalogDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBizMetricByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBizMetricByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBusinessAssetsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBusinessAssetsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBusinessAssetsStatisticRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBusinessAssetsStatisticResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBusinessAssetsTreeRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowBusinessAssetsTreeResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowCatalogDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowCatalogDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowCodeTableByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowCodeTableByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowCompoundMetricByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowCompoundMetricByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowConditionByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowConditionByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowConsistencyTaskDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowConsistencyTaskDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataPreviewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataPreviewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataProfileRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataProfileResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataServiceInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataSetsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataSetsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataconnectionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataconnectionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDatamapLineageRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDatamapLineageResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDerivativeIndexByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDerivativeIndexByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDesignOperationResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDesignOperationResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDimensionByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDimensionByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDimensionLogicTableByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDimensionLogicTableByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowEntityInfoByGuidRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowEntityInfoByGuidResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactLogicTableByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactLogicTableByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactoryEnvRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactoryEnvResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactoryFullTextRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactoryFullTextResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactoryPackageDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactoryPackageDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactorySupplementDataRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactorySupplementDataResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowGlossaryListRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowGlossaryListResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceInfosRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceInfosResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceLogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceLogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowLineageBulkRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowLineageBulkResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowLineageRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowLineageResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMessageDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMessageDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMetricAssetsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMetricAssetsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMetricTreeRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMetricTreeResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowNodesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowNodesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowPathByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowPathByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowPathObjectByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowPathObjectByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowQualityTaskDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowQualityTaskDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowQueuesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowQueuesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowRelationByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowRelationByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityAdminRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityAdminResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDataClassificationRuleGroupRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDataClassificationRuleGroupResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDatasourceProtectionDiagnoseResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDatasourceProtectionDiagnoseResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDynamicMaskingPolicyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDynamicMaskingPolicyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityMemberSyncTaskRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityMemberSyncTaskResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityNoMaskingTableResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityNoMaskingTableResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityPermissionManagementDiagnoseResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityPermissionManagementDiagnoseResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityPermissionSetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityPermissionSetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityResourcePermissionPolicyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityResourcePermissionPolicyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecuritySecrecyLevelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecuritySecrecyLevelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecuritySensitiveDataDiagnoseResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecuritySensitiveDataDiagnoseResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowStandardByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowStandardByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowStandardTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowStandardTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTableDataRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTableDataResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTableModelByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTableModelByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTagsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTagsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTaskInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTaskInfoResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTaskListRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTaskListResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTechnicalAssetsStatisticRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTechnicalAssetsStatisticResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTemplatesDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowTemplatesDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowUnrelatedTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowUnrelatedTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowWorkSpaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowWorkSpaceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowWorkspaceDetailByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowWorkspaceDetailByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.StopFactorySupplementDataInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.StopFactorySupplementDataInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UnpublishSecurityApplicationRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UnpublishSecurityApplicationResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateBizMetricRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateBizMetricResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateCatalogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateCatalogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateCodeTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateCodeTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateCodeTableValuesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateCodeTableValuesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDataServiceInstanceLtsLogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDataServiceInstanceLtsLogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDataServiceInstanceObsLogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDataServiceInstanceObsLogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDataconnectionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDataconnectionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignAggregationLogicTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignAggregationLogicTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignAtomicIndexRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignAtomicIndexResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignCompoundMetricRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignCompoundMetricResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignDataLayersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignDataLayersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignDerivativeIndexRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignDerivativeIndexResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignDimensionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignDimensionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignTableQualityRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignTableQualityResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityAssignedQueueRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityAssignedQueueResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDataClassificationCombineRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDataClassificationCombineRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDataClassificationRuleGroupRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDataClassificationRuleGroupResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDynamicMaskingPolicyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDynamicMaskingPolicyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityMemberPermissionExpireTimeRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityMemberPermissionExpireTimeResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityPermissionSetPermissionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityPermissionSetPermissionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityPermissionSetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityPermissionSetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityResourcePermissionPolicyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityResourcePermissionPolicyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityRuleEnableStatusRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityRuleEnableStatusResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecuritySecrecyLevelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecuritySecrecyLevelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateStandardRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateStandardResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateStandardTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateStandardTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSubjectNewRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSubjectNewResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSubjectRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSubjectResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateTableModelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateTableModelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateTaskInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateTaskInfoResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateWorkSpaceUserOrGroupRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateWorkSpaceUserOrGroupResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateWorkspaceResponse;

public class DataArtsStudioClient {

    protected HcClient hcClient;

    public DataArtsStudioClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DataArtsStudioClient> newBuilder() {
        ClientBuilder<DataArtsStudioClient> clientBuilder = new ClientBuilder<>(DataArtsStudioClient::new);
        return clientBuilder;
    }

    /**
     * 审批通过工单
     *
     * 审批通过工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptSecurityApplicationRequest 请求对象
     * @return AcceptSecurityApplicationResponse
     */
    public AcceptSecurityApplicationResponse acceptSecurityApplication(AcceptSecurityApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.acceptSecurityApplication);
    }

    /**
     * 审批通过工单
     *
     * 审批通过工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptSecurityApplicationRequest 请求对象
     * @return SyncInvoker<AcceptSecurityApplicationRequest, AcceptSecurityApplicationResponse>
     */
    public SyncInvoker<AcceptSecurityApplicationRequest, AcceptSecurityApplicationResponse> acceptSecurityApplicationInvoker(
        AcceptSecurityApplicationRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.acceptSecurityApplication, hcClient);
    }

    /**
     * 添加标签
     *
     * 根据资产（表或属性）的ID给资产打上标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesignEntityTagsRequest 请求对象
     * @return AddDesignEntityTagsResponse
     */
    public AddDesignEntityTagsResponse addDesignEntityTags(AddDesignEntityTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.addDesignEntityTags);
    }

    /**
     * 添加标签
     *
     * 根据资产（表或属性）的ID给资产打上标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesignEntityTagsRequest 请求对象
     * @return SyncInvoker<AddDesignEntityTagsRequest, AddDesignEntityTagsResponse>
     */
    public SyncInvoker<AddDesignEntityTagsRequest, AddDesignEntityTagsResponse> addDesignEntityTagsInvoker(
        AddDesignEntityTagsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.addDesignEntityTags, hcClient);
    }

    /**
     * 标签关联到资产
     *
     * 标签关联到资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagToAssetRequest 请求对象
     * @return AddTagToAssetResponse
     */
    public AddTagToAssetResponse addTagToAsset(AddTagToAssetRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.addTagToAsset);
    }

    /**
     * 标签关联到资产
     *
     * 标签关联到资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagToAssetRequest 请求对象
     * @return SyncInvoker<AddTagToAssetRequest, AddTagToAssetResponse>
     */
    public SyncInvoker<AddTagToAssetRequest, AddTagToAssetResponse> addTagToAssetInvoker(AddTagToAssetRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.addTagToAsset, hcClient);
    }

    /**
     * 添加工作空间用户
     *
     * 添加工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkSpaceUsersRequest 请求对象
     * @return AddWorkSpaceUsersResponse
     */
    public AddWorkSpaceUsersResponse addWorkSpaceUsers(AddWorkSpaceUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.addWorkSpaceUsers);
    }

    /**
     * 添加工作空间用户
     *
     * 添加工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkSpaceUsersRequest 请求对象
     * @return SyncInvoker<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse>
     */
    public SyncInvoker<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse> addWorkSpaceUsersInvoker(
        AddWorkSpaceUsersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.addWorkSpaceUsers, hcClient);
    }

    /**
     * 提交表权限申请
     *
     * 提交表权限申请
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplySecurityTableAuthorityRequest 请求对象
     * @return ApplySecurityTableAuthorityResponse
     */
    public ApplySecurityTableAuthorityResponse applySecurityTableAuthority(ApplySecurityTableAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.applySecurityTableAuthority);
    }

    /**
     * 提交表权限申请
     *
     * 提交表权限申请
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplySecurityTableAuthorityRequest 请求对象
     * @return SyncInvoker<ApplySecurityTableAuthorityRequest, ApplySecurityTableAuthorityResponse>
     */
    public SyncInvoker<ApplySecurityTableAuthorityRequest, ApplySecurityTableAuthorityResponse> applySecurityTableAuthorityInvoker(
        ApplySecurityTableAuthorityRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.applySecurityTableAuthority, hcClient);
    }

    /**
     * 资产关联分类
     *
     * 将一个分类关联到一个或多个指定guid的资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateClassificationToEntityRequest 请求对象
     * @return AssociateClassificationToEntityResponse
     */
    public AssociateClassificationToEntityResponse associateClassificationToEntity(
        AssociateClassificationToEntityRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.associateClassificationToEntity);
    }

    /**
     * 资产关联分类
     *
     * 将一个分类关联到一个或多个指定guid的资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateClassificationToEntityRequest 请求对象
     * @return SyncInvoker<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse>
     */
    public SyncInvoker<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse> associateClassificationToEntityInvoker(
        AssociateClassificationToEntityRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.associateClassificationToEntity, hcClient);
    }

    /**
     * 资产关联密级
     *
     * 关联资产到密级，资产关联指定密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSecurityLevelToEntitieRequest 请求对象
     * @return AssociateSecurityLevelToEntitieResponse
     */
    public AssociateSecurityLevelToEntitieResponse associateSecurityLevelToEntitie(
        AssociateSecurityLevelToEntitieRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.associateSecurityLevelToEntitie);
    }

    /**
     * 资产关联密级
     *
     * 关联资产到密级，资产关联指定密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSecurityLevelToEntitieRequest 请求对象
     * @return SyncInvoker<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse>
     */
    public SyncInvoker<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse> associateSecurityLevelToEntitieInvoker(
        AssociateSecurityLevelToEntitieRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.associateSecurityLevelToEntitie, hcClient);
    }

    /**
     * 数据连接跨空间授权
     *
     * 数据连接跨空间授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeDataConnectionRequest 请求对象
     * @return AuthorizeDataConnectionResponse
     */
    public AuthorizeDataConnectionResponse authorizeDataConnection(AuthorizeDataConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.authorizeDataConnection);
    }

    /**
     * 数据连接跨空间授权
     *
     * 数据连接跨空间授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeDataConnectionRequest 请求对象
     * @return SyncInvoker<AuthorizeDataConnectionRequest, AuthorizeDataConnectionResponse>
     */
    public SyncInvoker<AuthorizeDataConnectionRequest, AuthorizeDataConnectionResponse> authorizeDataConnectionInvoker(
        AuthorizeDataConnectionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.authorizeDataConnection, hcClient);
    }

    /**
     * 审核申请
     *
     * 审核申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchApproveApplyRequest 请求对象
     * @return BatchApproveApplyResponse
     */
    public BatchApproveApplyResponse batchApproveApply(BatchApproveApplyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchApproveApply);
    }

    /**
     * 审核申请
     *
     * 审核申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchApproveApplyRequest 请求对象
     * @return SyncInvoker<BatchApproveApplyRequest, BatchApproveApplyResponse>
     */
    public SyncInvoker<BatchApproveApplyRequest, BatchApproveApplyResponse> batchApproveApplyInvoker(
        BatchApproveApplyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchApproveApply, hcClient);
    }

    /**
     * 批量审批通过工单
     *
     * 批量审批通过工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchApproveSecurityApplicationsRequest 请求对象
     * @return BatchApproveSecurityApplicationsResponse
     */
    public BatchApproveSecurityApplicationsResponse batchApproveSecurityApplications(
        BatchApproveSecurityApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchApproveSecurityApplications);
    }

    /**
     * 批量审批通过工单
     *
     * 批量审批通过工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchApproveSecurityApplicationsRequest 请求对象
     * @return SyncInvoker<BatchApproveSecurityApplicationsRequest, BatchApproveSecurityApplicationsResponse>
     */
    public SyncInvoker<BatchApproveSecurityApplicationsRequest, BatchApproveSecurityApplicationsResponse> batchApproveSecurityApplicationsInvoker(
        BatchApproveSecurityApplicationsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchApproveSecurityApplications, hcClient);
    }

    /**
     * 批量资产关联分类
     *
     * 批量资产关联分类：只支持对数据表的列和OBS对象添加分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateClassificationToEntitiesRequest 请求对象
     * @return BatchAssociateClassificationToEntitiesResponse
     */
    public BatchAssociateClassificationToEntitiesResponse batchAssociateClassificationToEntities(
        BatchAssociateClassificationToEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchAssociateClassificationToEntities);
    }

    /**
     * 批量资产关联分类
     *
     * 批量资产关联分类：只支持对数据表的列和OBS对象添加分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateClassificationToEntitiesRequest 请求对象
     * @return SyncInvoker<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse>
     */
    public SyncInvoker<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse> batchAssociateClassificationToEntitiesInvoker(
        BatchAssociateClassificationToEntitiesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchAssociateClassificationToEntities, hcClient);
    }

    /**
     * 批量资产关联密级
     *
     * 批量资产关联密级：单个密级关联到多个资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateSecurityLevelToEntitiesRequest 请求对象
     * @return BatchAssociateSecurityLevelToEntitiesResponse
     */
    public BatchAssociateSecurityLevelToEntitiesResponse batchAssociateSecurityLevelToEntities(
        BatchAssociateSecurityLevelToEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchAssociateSecurityLevelToEntities);
    }

    /**
     * 批量资产关联密级
     *
     * 批量资产关联密级：单个密级关联到多个资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateSecurityLevelToEntitiesRequest 请求对象
     * @return SyncInvoker<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse>
     */
    public SyncInvoker<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse> batchAssociateSecurityLevelToEntitiesInvoker(
        BatchAssociateSecurityLevelToEntitiesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchAssociateSecurityLevelToEntities, hcClient);
    }

    /**
     * 转换逻辑模型为物理模型
     *
     * 转换逻辑模型为物理模型，转换成功则显示转换后的目标模型信息。
     * 异常：目标模型信息的“id”等属性为null时，则需要调用《获取操作结果》接口查看具体报错信息：GET https://{endpoint}/v1/{project_id}/design/operation-results?operation_type&#x3D;TRANSFORM_LOGIC_MODEL&amp;operation_id&#x3D;{model_id}，其中{model_id}为本接口的路径参数。
     * 约束与限制：
     *   1、target_model_id与target_model_name不对应时，target_model_id优先级高于target_model_name。
     *   2、target_model_id与dw_type不对应时，会找不到模型，提示：模型不存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDesignTableModelsFromLogicRequest 请求对象
     * @return BatchCreateDesignTableModelsFromLogicResponse
     */
    public BatchCreateDesignTableModelsFromLogicResponse batchCreateDesignTableModelsFromLogic(
        BatchCreateDesignTableModelsFromLogicRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchCreateDesignTableModelsFromLogic);
    }

    /**
     * 转换逻辑模型为物理模型
     *
     * 转换逻辑模型为物理模型，转换成功则显示转换后的目标模型信息。
     * 异常：目标模型信息的“id”等属性为null时，则需要调用《获取操作结果》接口查看具体报错信息：GET https://{endpoint}/v1/{project_id}/design/operation-results?operation_type&#x3D;TRANSFORM_LOGIC_MODEL&amp;operation_id&#x3D;{model_id}，其中{model_id}为本接口的路径参数。
     * 约束与限制：
     *   1、target_model_id与target_model_name不对应时，target_model_id优先级高于target_model_name。
     *   2、target_model_id与dw_type不对应时，会找不到模型，提示：模型不存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDesignTableModelsFromLogicRequest 请求对象
     * @return SyncInvoker<BatchCreateDesignTableModelsFromLogicRequest, BatchCreateDesignTableModelsFromLogicResponse>
     */
    public SyncInvoker<BatchCreateDesignTableModelsFromLogicRequest, BatchCreateDesignTableModelsFromLogicResponse> batchCreateDesignTableModelsFromLogicInvoker(
        BatchCreateDesignTableModelsFromLogicRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchCreateDesignTableModelsFromLogic, hcClient);
    }

    /**
     * 批量添加权限集成员
     *
     * 批量添加权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityPermissionSetMembersRequest 请求对象
     * @return BatchCreateSecurityPermissionSetMembersResponse
     */
    public BatchCreateSecurityPermissionSetMembersResponse batchCreateSecurityPermissionSetMembers(
        BatchCreateSecurityPermissionSetMembersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchCreateSecurityPermissionSetMembers);
    }

    /**
     * 批量添加权限集成员
     *
     * 批量添加权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityPermissionSetMembersRequest 请求对象
     * @return SyncInvoker<BatchCreateSecurityPermissionSetMembersRequest, BatchCreateSecurityPermissionSetMembersResponse>
     */
    public SyncInvoker<BatchCreateSecurityPermissionSetMembersRequest, BatchCreateSecurityPermissionSetMembersResponse> batchCreateSecurityPermissionSetMembersInvoker(
        BatchCreateSecurityPermissionSetMembersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchCreateSecurityPermissionSetMembers, hcClient);
    }

    /**
     * 批量添加权限集的权限
     *
     * 批量添加权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityPermissionSetPermissionsRequest 请求对象
     * @return BatchCreateSecurityPermissionSetPermissionsResponse
     */
    public BatchCreateSecurityPermissionSetPermissionsResponse batchCreateSecurityPermissionSetPermissions(
        BatchCreateSecurityPermissionSetPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchCreateSecurityPermissionSetPermissions);
    }

    /**
     * 批量添加权限集的权限
     *
     * 批量添加权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityPermissionSetPermissionsRequest 请求对象
     * @return SyncInvoker<BatchCreateSecurityPermissionSetPermissionsRequest, BatchCreateSecurityPermissionSetPermissionsResponse>
     */
    public SyncInvoker<BatchCreateSecurityPermissionSetPermissionsRequest, BatchCreateSecurityPermissionSetPermissionsResponse> batchCreateSecurityPermissionSetPermissionsInvoker(
        BatchCreateSecurityPermissionSetPermissionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchCreateSecurityPermissionSetPermissions, hcClient);
    }

    /**
     * 批量删除识别规则接口
     *
     * 批量删除识别规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityDataClassificationRuleRequest 请求对象
     * @return BatchDeleteSecurityDataClassificationRuleResponse
     */
    public BatchDeleteSecurityDataClassificationRuleResponse batchDeleteSecurityDataClassificationRule(
        BatchDeleteSecurityDataClassificationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecurityDataClassificationRule);
    }

    /**
     * 批量删除识别规则接口
     *
     * 批量删除识别规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityDataClassificationRuleRequest 请求对象
     * @return SyncInvoker<BatchDeleteSecurityDataClassificationRuleRequest, BatchDeleteSecurityDataClassificationRuleResponse>
     */
    public SyncInvoker<BatchDeleteSecurityDataClassificationRuleRequest, BatchDeleteSecurityDataClassificationRuleResponse> batchDeleteSecurityDataClassificationRuleInvoker(
        BatchDeleteSecurityDataClassificationRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecurityDataClassificationRule, hcClient);
    }

    /**
     * 批量删除动态脱敏策略
     *
     * 批量删除动态脱敏策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityDynamicMaskingPoliciesRequest 请求对象
     * @return BatchDeleteSecurityDynamicMaskingPoliciesResponse
     */
    public BatchDeleteSecurityDynamicMaskingPoliciesResponse batchDeleteSecurityDynamicMaskingPolicies(
        BatchDeleteSecurityDynamicMaskingPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecurityDynamicMaskingPolicies);
    }

    /**
     * 批量删除动态脱敏策略
     *
     * 批量删除动态脱敏策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityDynamicMaskingPoliciesRequest 请求对象
     * @return SyncInvoker<BatchDeleteSecurityDynamicMaskingPoliciesRequest, BatchDeleteSecurityDynamicMaskingPoliciesResponse>
     */
    public SyncInvoker<BatchDeleteSecurityDynamicMaskingPoliciesRequest, BatchDeleteSecurityDynamicMaskingPoliciesResponse> batchDeleteSecurityDynamicMaskingPoliciesInvoker(
        BatchDeleteSecurityDynamicMaskingPoliciesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecurityDynamicMaskingPolicies, hcClient);
    }

    /**
     * 批量删除权限集成员
     *
     * 批量删除权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityPermissionSetMembersRequest 请求对象
     * @return BatchDeleteSecurityPermissionSetMembersResponse
     */
    public BatchDeleteSecurityPermissionSetMembersResponse batchDeleteSecurityPermissionSetMembers(
        BatchDeleteSecurityPermissionSetMembersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecurityPermissionSetMembers);
    }

    /**
     * 批量删除权限集成员
     *
     * 批量删除权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityPermissionSetMembersRequest 请求对象
     * @return SyncInvoker<BatchDeleteSecurityPermissionSetMembersRequest, BatchDeleteSecurityPermissionSetMembersResponse>
     */
    public SyncInvoker<BatchDeleteSecurityPermissionSetMembersRequest, BatchDeleteSecurityPermissionSetMembersResponse> batchDeleteSecurityPermissionSetMembersInvoker(
        BatchDeleteSecurityPermissionSetMembersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecurityPermissionSetMembers, hcClient);
    }

    /**
     * 删除权限集的权限
     *
     * 删除权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityPermissionSetPermissionsRequest 请求对象
     * @return BatchDeleteSecurityPermissionSetPermissionsResponse
     */
    public BatchDeleteSecurityPermissionSetPermissionsResponse batchDeleteSecurityPermissionSetPermissions(
        BatchDeleteSecurityPermissionSetPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecurityPermissionSetPermissions);
    }

    /**
     * 删除权限集的权限
     *
     * 删除权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityPermissionSetPermissionsRequest 请求对象
     * @return SyncInvoker<BatchDeleteSecurityPermissionSetPermissionsRequest, BatchDeleteSecurityPermissionSetPermissionsResponse>
     */
    public SyncInvoker<BatchDeleteSecurityPermissionSetPermissionsRequest, BatchDeleteSecurityPermissionSetPermissionsResponse> batchDeleteSecurityPermissionSetPermissionsInvoker(
        BatchDeleteSecurityPermissionSetPermissionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecurityPermissionSetPermissions, hcClient);
    }

    /**
     * 批量删除资源权限策略
     *
     * 批量删除资源权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityResourcePermissionPoliciesRequest 请求对象
     * @return BatchDeleteSecurityResourcePermissionPoliciesResponse
     */
    public BatchDeleteSecurityResourcePermissionPoliciesResponse batchDeleteSecurityResourcePermissionPolicies(
        BatchDeleteSecurityResourcePermissionPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecurityResourcePermissionPolicies);
    }

    /**
     * 批量删除资源权限策略
     *
     * 批量删除资源权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityResourcePermissionPoliciesRequest 请求对象
     * @return SyncInvoker<BatchDeleteSecurityResourcePermissionPoliciesRequest, BatchDeleteSecurityResourcePermissionPoliciesResponse>
     */
    public SyncInvoker<BatchDeleteSecurityResourcePermissionPoliciesRequest, BatchDeleteSecurityResourcePermissionPoliciesResponse> batchDeleteSecurityResourcePermissionPoliciesInvoker(
        BatchDeleteSecurityResourcePermissionPoliciesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecurityResourcePermissionPolicies, hcClient);
    }

    /**
     * 批量删除密级
     *
     * 批量删除密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecuritySecrecyLevelsRequest 请求对象
     * @return BatchDeleteSecuritySecrecyLevelsResponse
     */
    public BatchDeleteSecuritySecrecyLevelsResponse batchDeleteSecuritySecrecyLevels(
        BatchDeleteSecuritySecrecyLevelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecuritySecrecyLevels);
    }

    /**
     * 批量删除密级
     *
     * 批量删除密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecuritySecrecyLevelsRequest 请求对象
     * @return SyncInvoker<BatchDeleteSecuritySecrecyLevelsRequest, BatchDeleteSecuritySecrecyLevelsResponse>
     */
    public SyncInvoker<BatchDeleteSecuritySecrecyLevelsRequest, BatchDeleteSecuritySecrecyLevelsResponse> batchDeleteSecuritySecrecyLevelsInvoker(
        BatchDeleteSecuritySecrecyLevelsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecuritySecrecyLevels, hcClient);
    }

    /**
     * 批量删除规则模板
     *
     * 批量删除规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTemplatesRequest 请求对象
     * @return BatchDeleteTemplatesResponse
     */
    public BatchDeleteTemplatesResponse batchDeleteTemplates(BatchDeleteTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchDeleteTemplates);
    }

    /**
     * 批量删除规则模板
     *
     * 批量删除规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTemplatesRequest 请求对象
     * @return SyncInvoker<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse>
     */
    public SyncInvoker<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse> batchDeleteTemplatesInvoker(
        BatchDeleteTemplatesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchDeleteTemplates, hcClient);
    }

    /**
     * 批量下线
     *
     * 批量下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchOfflineRequest 请求对象
     * @return BatchOfflineResponse
     */
    public BatchOfflineResponse batchOffline(BatchOfflineRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchOffline);
    }

    /**
     * 批量下线
     *
     * 批量下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchOfflineRequest 请求对象
     * @return SyncInvoker<BatchOfflineRequest, BatchOfflineResponse>
     */
    public SyncInvoker<BatchOfflineRequest, BatchOfflineResponse> batchOfflineInvoker(BatchOfflineRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchOffline, hcClient);
    }

    /**
     * 批量发布
     *
     * 批量发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishRequest 请求对象
     * @return BatchPublishResponse
     */
    public BatchPublishResponse batchPublish(BatchPublishRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchPublish);
    }

    /**
     * 批量发布
     *
     * 批量发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishRequest 请求对象
     * @return SyncInvoker<BatchPublishRequest, BatchPublishResponse>
     */
    public SyncInvoker<BatchPublishRequest, BatchPublishResponse> batchPublishInvoker(BatchPublishRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchPublish, hcClient);
    }

    /**
     * 批量驳回工单
     *
     * 批量驳回工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRejectSecurityApplicationsRequest 请求对象
     * @return BatchRejectSecurityApplicationsResponse
     */
    public BatchRejectSecurityApplicationsResponse batchRejectSecurityApplications(
        BatchRejectSecurityApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchRejectSecurityApplications);
    }

    /**
     * 批量驳回工单
     *
     * 批量驳回工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRejectSecurityApplicationsRequest 请求对象
     * @return SyncInvoker<BatchRejectSecurityApplicationsRequest, BatchRejectSecurityApplicationsResponse>
     */
    public SyncInvoker<BatchRejectSecurityApplicationsRequest, BatchRejectSecurityApplicationsResponse> batchRejectSecurityApplicationsInvoker(
        BatchRejectSecurityApplicationsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchRejectSecurityApplications, hcClient);
    }

    /**
     * 元数据实时同步接口(邀测)
     *
     * 元数据实时同步接口，支持批量。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSyncMetadataRequest 请求对象
     * @return BatchSyncMetadataResponse
     */
    public BatchSyncMetadataResponse batchSyncMetadata(BatchSyncMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchSyncMetadata);
    }

    /**
     * 元数据实时同步接口(邀测)
     *
     * 元数据实时同步接口，支持批量。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSyncMetadataRequest 请求对象
     * @return SyncInvoker<BatchSyncMetadataRequest, BatchSyncMetadataResponse>
     */
    public SyncInvoker<BatchSyncMetadataRequest, BatchSyncMetadataResponse> batchSyncMetadataInvoker(
        BatchSyncMetadataRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchSyncMetadata, hcClient);
    }

    /**
     * 批量打标签(邀测)
     *
     * 批量给资产打标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagRequest 请求对象
     * @return BatchTagResponse
     */
    public BatchTagResponse batchTag(BatchTagRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchTag);
    }

    /**
     * 批量打标签(邀测)
     *
     * 批量给资产打标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagRequest 请求对象
     * @return SyncInvoker<BatchTagRequest, BatchTagResponse>
     */
    public SyncInvoker<BatchTagRequest, BatchTagResponse> batchTagInvoker(BatchTagRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchTag, hcClient);
    }

    /**
     * 批量更新数据开发连接细粒度认证状态
     *
     * 批量更新数据开发连接细粒度认证状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateSecurityDlfDataWareHousesRequest 请求对象
     * @return BatchUpdateSecurityDlfDataWareHousesResponse
     */
    public BatchUpdateSecurityDlfDataWareHousesResponse batchUpdateSecurityDlfDataWareHouses(
        BatchUpdateSecurityDlfDataWareHousesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchUpdateSecurityDlfDataWareHouses);
    }

    /**
     * 批量更新数据开发连接细粒度认证状态
     *
     * 批量更新数据开发连接细粒度认证状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateSecurityDlfDataWareHousesRequest 请求对象
     * @return SyncInvoker<BatchUpdateSecurityDlfDataWareHousesRequest, BatchUpdateSecurityDlfDataWareHousesResponse>
     */
    public SyncInvoker<BatchUpdateSecurityDlfDataWareHousesRequest, BatchUpdateSecurityDlfDataWareHousesResponse> batchUpdateSecurityDlfDataWareHousesInvoker(
        BatchUpdateSecurityDlfDataWareHousesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.batchUpdateSecurityDlfDataWareHouses, hcClient);
    }

    /**
     * 撤销任务包
     *
     * 撤销任务包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelFactoryPackagesRequest 请求对象
     * @return CancelFactoryPackagesResponse
     */
    public CancelFactoryPackagesResponse cancelFactoryPackages(CancelFactoryPackagesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.cancelFactoryPackages);
    }

    /**
     * 撤销任务包
     *
     * 撤销任务包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelFactoryPackagesRequest 请求对象
     * @return SyncInvoker<CancelFactoryPackagesRequest, CancelFactoryPackagesResponse>
     */
    public SyncInvoker<CancelFactoryPackagesRequest, CancelFactoryPackagesResponse> cancelFactoryPackagesInvoker(
        CancelFactoryPackagesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.cancelFactoryPackages, hcClient);
    }

    /**
     * 修改流程架构
     *
     * 修改流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCatalogRequest 请求对象
     * @return ChangeCatalogResponse
     */
    public ChangeCatalogResponse changeCatalog(ChangeCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.changeCatalog);
    }

    /**
     * 修改流程架构
     *
     * 修改流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCatalogRequest 请求对象
     * @return SyncInvoker<ChangeCatalogRequest, ChangeCatalogResponse>
     */
    public SyncInvoker<ChangeCatalogRequest, ChangeCatalogResponse> changeCatalogInvoker(ChangeCatalogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.changeCatalog, hcClient);
    }

    /**
     * 规格变更接口
     *
     * 规格变更接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceRequest 请求对象
     * @return ChangeResourceResponse
     */
    public ChangeResourceResponse changeResource(ChangeResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.changeResource);
    }

    /**
     * 规格变更接口
     *
     * 规格变更接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceRequest 请求对象
     * @return SyncInvoker<ChangeResourceRequest, ChangeResourceResponse>
     */
    public SyncInvoker<ChangeResourceRequest, ChangeResourceResponse> changeResourceInvoker(
        ChangeResourceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.changeResource, hcClient);
    }

    /**
     * 修改或删除主题层级
     *
     * 修改或删除主题层级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSubjectsRequest 请求对象
     * @return ChangeSubjectsResponse
     */
    public ChangeSubjectsResponse changeSubjects(ChangeSubjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.changeSubjects);
    }

    /**
     * 修改或删除主题层级
     *
     * 修改或删除主题层级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSubjectsRequest 请求对象
     * @return SyncInvoker<ChangeSubjectsRequest, ChangeSubjectsResponse>
     */
    public SyncInvoker<ChangeSubjectsRequest, ChangeSubjectsResponse> changeSubjectsInvoker(
        ChangeSubjectsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.changeSubjects, hcClient);
    }

    /**
     * 查看逆向维度表任务
     *
     * 查看逆向维度表任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDimensionStatusRequest 请求对象
     * @return CheckDimensionStatusResponse
     */
    public CheckDimensionStatusResponse checkDimensionStatus(CheckDimensionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.checkDimensionStatus);
    }

    /**
     * 查看逆向维度表任务
     *
     * 查看逆向维度表任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDimensionStatusRequest 请求对象
     * @return SyncInvoker<CheckDimensionStatusRequest, CheckDimensionStatusResponse>
     */
    public SyncInvoker<CheckDimensionStatusRequest, CheckDimensionStatusResponse> checkDimensionStatusInvoker(
        CheckDimensionStatusRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.checkDimensionStatus, hcClient);
    }

    /**
     * 查看逆向事实表任务
     *
     * 查看逆向事实表任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckFactLogicTableStatusRequest 请求对象
     * @return CheckFactLogicTableStatusResponse
     */
    public CheckFactLogicTableStatusResponse checkFactLogicTableStatus(CheckFactLogicTableStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.checkFactLogicTableStatus);
    }

    /**
     * 查看逆向事实表任务
     *
     * 查看逆向事实表任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckFactLogicTableStatusRequest 请求对象
     * @return SyncInvoker<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse>
     */
    public SyncInvoker<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse> checkFactLogicTableStatusInvoker(
        CheckFactLogicTableStatusRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.checkFactLogicTableStatus, hcClient);
    }

    /**
     * 组合识别规则测试
     *
     * 组合识别规则测试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSecurityDataClassificationCombineRuleRequest 请求对象
     * @return CheckSecurityDataClassificationCombineRuleResponse
     */
    public CheckSecurityDataClassificationCombineRuleResponse checkSecurityDataClassificationCombineRule(
        CheckSecurityDataClassificationCombineRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.checkSecurityDataClassificationCombineRule);
    }

    /**
     * 组合识别规则测试
     *
     * 组合识别规则测试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSecurityDataClassificationCombineRuleRequest 请求对象
     * @return SyncInvoker<CheckSecurityDataClassificationCombineRuleRequest, CheckSecurityDataClassificationCombineRuleResponse>
     */
    public SyncInvoker<CheckSecurityDataClassificationCombineRuleRequest, CheckSecurityDataClassificationCombineRuleResponse> checkSecurityDataClassificationCombineRuleInvoker(
        CheckSecurityDataClassificationCombineRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.checkSecurityDataClassificationCombineRule, hcClient);
    }

    /**
     * 比较版本信息
     *
     * 通过两个版本id，比较两者差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareDesignVersionsRequest 请求对象
     * @return CompareDesignVersionsResponse
     */
    public CompareDesignVersionsResponse compareDesignVersions(CompareDesignVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.compareDesignVersions);
    }

    /**
     * 比较版本信息
     *
     * 通过两个版本id，比较两者差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareDesignVersionsRequest 请求对象
     * @return SyncInvoker<CompareDesignVersionsRequest, CompareDesignVersionsResponse>
     */
    public SyncInvoker<CompareDesignVersionsRequest, CompareDesignVersionsResponse> compareDesignVersionsInvoker(
        CompareDesignVersionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.compareDesignVersions, hcClient);
    }

    /**
     * 审批单处理
     *
     * 审批驳回/通过，单个或多个action-id&#x3D;reject/resolve。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmApprovalsRequest 请求对象
     * @return ConfirmApprovalsResponse
     */
    public ConfirmApprovalsResponse confirmApprovals(ConfirmApprovalsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.confirmApprovals);
    }

    /**
     * 审批单处理
     *
     * 审批驳回/通过，单个或多个action-id&#x3D;reject/resolve。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmApprovalsRequest 请求对象
     * @return SyncInvoker<ConfirmApprovalsRequest, ConfirmApprovalsResponse>
     */
    public SyncInvoker<ConfirmApprovalsRequest, ConfirmApprovalsResponse> confirmApprovalsInvoker(
        ConfirmApprovalsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.confirmApprovals, hcClient);
    }

    /**
     * 处理消息
     *
     * 对收到的通知消息进行确认，可以在指定的时间范围内选择何时进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmMessageRequest 请求对象
     * @return ConfirmMessageResponse
     */
    public ConfirmMessageResponse confirmMessage(ConfirmMessageRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.confirmMessage);
    }

    /**
     * 处理消息
     *
     * 对收到的通知消息进行确认，可以在指定的时间范围内选择何时进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmMessageRequest 请求对象
     * @return SyncInvoker<ConfirmMessageRequest, ConfirmMessageResponse>
     */
    public SyncInvoker<ConfirmMessageRequest, ConfirmMessageResponse> confirmMessageInvoker(
        ConfirmMessageRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.confirmMessage, hcClient);
    }

    /**
     * 关系建模统计信息
     *
     * 关系建模页面，外层的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllModelsRequest 请求对象
     * @return CountAllModelsResponse
     */
    public CountAllModelsResponse countAllModels(CountAllModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.countAllModels);
    }

    /**
     * 关系建模统计信息
     *
     * 关系建模页面，外层的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllModelsRequest 请求对象
     * @return SyncInvoker<CountAllModelsRequest, CountAllModelsResponse>
     */
    public SyncInvoker<CountAllModelsRequest, CountAllModelsResponse> countAllModelsInvoker(
        CountAllModelsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.countAllModels, hcClient);
    }

    /**
     * 总览统计信息
     *
     * 总览统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOverviewsRequest 请求对象
     * @return CountOverviewsResponse
     */
    public CountOverviewsResponse countOverviews(CountOverviewsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.countOverviews);
    }

    /**
     * 总览统计信息
     *
     * 总览统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOverviewsRequest 请求对象
     * @return SyncInvoker<CountOverviewsRequest, CountOverviewsResponse>
     */
    public SyncInvoker<CountOverviewsRequest, CountOverviewsResponse> countOverviewsInvoker(
        CountOverviewsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.countOverviews, hcClient);
    }

    /**
     * 标准覆盖率统计信息
     *
     * 查看某个数据标准在所有模型字段中的覆盖率，即使用该标准的字段占总字段的百分比。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountStandardsRequest 请求对象
     * @return CountStandardsResponse
     */
    public CountStandardsResponse countStandards(CountStandardsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.countStandards);
    }

    /**
     * 标准覆盖率统计信息
     *
     * 查看某个数据标准在所有模型字段中的覆盖率，即使用该标准的字段占总字段的百分比。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountStandardsRequest 请求对象
     * @return SyncInvoker<CountStandardsRequest, CountStandardsResponse>
     */
    public SyncInvoker<CountStandardsRequest, CountStandardsResponse> countStandardsInvoker(
        CountStandardsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.countStandards, hcClient);
    }

    /**
     * 模型统计信息
     *
     * 单个模型中的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTableModelsRequest 请求对象
     * @return CountTableModelsResponse
     */
    public CountTableModelsResponse countTableModels(CountTableModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.countTableModels);
    }

    /**
     * 模型统计信息
     *
     * 单个模型中的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTableModelsRequest 请求对象
     * @return SyncInvoker<CountTableModelsRequest, CountTableModelsResponse>
     */
    public SyncInvoker<CountTableModelsRequest, CountTableModelsResponse> countTableModelsInvoker(
        CountTableModelsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.countTableModels, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用。  
     * 支持创建APP， IAM应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 创建应用。  
     * 支持创建APP， IAM应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createApp, hcClient);
    }

    /**
     * 创建审批人
     *
     * 创建审批人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApproverRequest 请求对象
     * @return CreateApproverResponse
     */
    public CreateApproverResponse createApprover(CreateApproverRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createApprover);
    }

    /**
     * 创建审批人
     *
     * 创建审批人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApproverRequest 请求对象
     * @return SyncInvoker<CreateApproverRequest, CreateApproverResponse>
     */
    public SyncInvoker<CreateApproverRequest, CreateApproverResponse> createApproverInvoker(
        CreateApproverRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createApprover, hcClient);
    }

    /**
     * 创建业务指标
     *
     * 创建业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBizMetricRequest 请求对象
     * @return CreateBizMetricResponse
     */
    public CreateBizMetricResponse createBizMetric(CreateBizMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createBizMetric);
    }

    /**
     * 创建业务指标
     *
     * 创建业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBizMetricRequest 请求对象
     * @return SyncInvoker<CreateBizMetricRequest, CreateBizMetricResponse>
     */
    public SyncInvoker<CreateBizMetricRequest, CreateBizMetricResponse> createBizMetricInvoker(
        CreateBizMetricRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createBizMetric, hcClient);
    }

    /**
     * 创建流程架构
     *
     * 创建流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCatalogRequest 请求对象
     * @return CreateCatalogResponse
     */
    public CreateCatalogResponse createCatalog(CreateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createCatalog);
    }

    /**
     * 创建流程架构
     *
     * 创建流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCatalogRequest 请求对象
     * @return SyncInvoker<CreateCatalogRequest, CreateCatalogResponse>
     */
    public SyncInvoker<CreateCatalogRequest, CreateCatalogResponse> createCatalogInvoker(CreateCatalogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createCatalog, hcClient);
    }

    /**
     * 创建码表
     *
     * 创建码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeTableRequest 请求对象
     * @return CreateCodeTableResponse
     */
    public CreateCodeTableResponse createCodeTable(CreateCodeTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createCodeTable);
    }

    /**
     * 创建码表
     *
     * 创建码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeTableRequest 请求对象
     * @return SyncInvoker<CreateCodeTableRequest, CreateCodeTableResponse>
     */
    public SyncInvoker<CreateCodeTableRequest, CreateCodeTableResponse> createCodeTableInvoker(
        CreateCodeTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createCodeTable, hcClient);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionsRequest 请求对象
     * @return CreateConnectionsResponse
     */
    public CreateConnectionsResponse createConnections(CreateConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createConnections);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionsRequest 请求对象
     * @return SyncInvoker<CreateConnectionsRequest, CreateConnectionsResponse>
     */
    public SyncInvoker<CreateConnectionsRequest, CreateConnectionsResponse> createConnectionsInvoker(
        CreateConnectionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createConnections, hcClient);
    }

    /**
     * 新建汇总表
     *
     * 根据入参，手动创建汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignAggregationLogicTableRequest 请求对象
     * @return CreateDesignAggregationLogicTableResponse
     */
    public CreateDesignAggregationLogicTableResponse createDesignAggregationLogicTable(
        CreateDesignAggregationLogicTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createDesignAggregationLogicTable);
    }

    /**
     * 新建汇总表
     *
     * 根据入参，手动创建汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignAggregationLogicTableRequest 请求对象
     * @return SyncInvoker<CreateDesignAggregationLogicTableRequest, CreateDesignAggregationLogicTableResponse>
     */
    public SyncInvoker<CreateDesignAggregationLogicTableRequest, CreateDesignAggregationLogicTableResponse> createDesignAggregationLogicTableInvoker(
        CreateDesignAggregationLogicTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createDesignAggregationLogicTable, hcClient);
    }

    /**
     * 新建原子指标
     *
     * 新建单个原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignAtomicIndexRequest 请求对象
     * @return CreateDesignAtomicIndexResponse
     */
    public CreateDesignAtomicIndexResponse createDesignAtomicIndex(CreateDesignAtomicIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createDesignAtomicIndex);
    }

    /**
     * 新建原子指标
     *
     * 新建单个原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignAtomicIndexRequest 请求对象
     * @return SyncInvoker<CreateDesignAtomicIndexRequest, CreateDesignAtomicIndexResponse>
     */
    public SyncInvoker<CreateDesignAtomicIndexRequest, CreateDesignAtomicIndexResponse> createDesignAtomicIndexInvoker(
        CreateDesignAtomicIndexRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createDesignAtomicIndex, hcClient);
    }

    /**
     * 新建复合指标
     *
     * 根据参数，新建复合指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignCompoundMetricRequest 请求对象
     * @return CreateDesignCompoundMetricResponse
     */
    public CreateDesignCompoundMetricResponse createDesignCompoundMetric(CreateDesignCompoundMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createDesignCompoundMetric);
    }

    /**
     * 新建复合指标
     *
     * 根据参数，新建复合指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignCompoundMetricRequest 请求对象
     * @return SyncInvoker<CreateDesignCompoundMetricRequest, CreateDesignCompoundMetricResponse>
     */
    public SyncInvoker<CreateDesignCompoundMetricRequest, CreateDesignCompoundMetricResponse> createDesignCompoundMetricInvoker(
        CreateDesignCompoundMetricRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createDesignCompoundMetric, hcClient);
    }

    /**
     * 新建衍生指标
     *
     * 根据参数，新建衍生指标指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignDerivativeIndexRequest 请求对象
     * @return CreateDesignDerivativeIndexResponse
     */
    public CreateDesignDerivativeIndexResponse createDesignDerivativeIndex(CreateDesignDerivativeIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createDesignDerivativeIndex);
    }

    /**
     * 新建衍生指标
     *
     * 根据参数，新建衍生指标指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignDerivativeIndexRequest 请求对象
     * @return SyncInvoker<CreateDesignDerivativeIndexRequest, CreateDesignDerivativeIndexResponse>
     */
    public SyncInvoker<CreateDesignDerivativeIndexRequest, CreateDesignDerivativeIndexResponse> createDesignDerivativeIndexInvoker(
        CreateDesignDerivativeIndexRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createDesignDerivativeIndex, hcClient);
    }

    /**
     * 新建维度
     *
     * 根据参数新建维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignDimensionRequest 请求对象
     * @return CreateDesignDimensionResponse
     */
    public CreateDesignDimensionResponse createDesignDimension(CreateDesignDimensionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createDesignDimension);
    }

    /**
     * 新建维度
     *
     * 根据参数新建维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignDimensionRequest 请求对象
     * @return SyncInvoker<CreateDesignDimensionRequest, CreateDesignDimensionResponse>
     */
    public SyncInvoker<CreateDesignDimensionRequest, CreateDesignDimensionResponse> createDesignDimensionInvoker(
        CreateDesignDimensionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createDesignDimension, hcClient);
    }

    /**
     * 创建目录
     *
     * 创建目录（数据标准、码表）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirectoryRequest 请求对象
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectory(CreateDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createDirectory);
    }

    /**
     * 创建目录
     *
     * 创建目录（数据标准、码表）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirectoryRequest 请求对象
     * @return SyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse>
     */
    public SyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse> createDirectoryInvoker(
        CreateDirectoryRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createDirectory, hcClient);
    }

    /**
     * 创建环境变量
     *
     * 创建环境变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryEnvRequest 请求对象
     * @return CreateFactoryEnvResponse
     */
    public CreateFactoryEnvResponse createFactoryEnv(CreateFactoryEnvRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createFactoryEnv);
    }

    /**
     * 创建环境变量
     *
     * 创建环境变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryEnvRequest 请求对象
     * @return SyncInvoker<CreateFactoryEnvRequest, CreateFactoryEnvResponse>
     */
    public SyncInvoker<CreateFactoryEnvRequest, CreateFactoryEnvResponse> createFactoryEnvInvoker(
        CreateFactoryEnvRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createFactoryEnv, hcClient);
    }

    /**
     * 创建作业
     *
     * 创建作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryJobRequest 请求对象
     * @return CreateFactoryJobResponse
     */
    public CreateFactoryJobResponse createFactoryJob(CreateFactoryJobRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createFactoryJob);
    }

    /**
     * 创建作业
     *
     * 创建作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryJobRequest 请求对象
     * @return SyncInvoker<CreateFactoryJobRequest, CreateFactoryJobResponse>
     */
    public SyncInvoker<CreateFactoryJobRequest, CreateFactoryJobResponse> createFactoryJobInvoker(
        CreateFactoryJobRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createFactoryJob, hcClient);
    }

    /**
     * 待发布包发布
     *
     * 待发布包发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryPendingItemsPackageRequest 请求对象
     * @return CreateFactoryPendingItemsPackageResponse
     */
    public CreateFactoryPendingItemsPackageResponse createFactoryPendingItemsPackage(
        CreateFactoryPendingItemsPackageRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createFactoryPendingItemsPackage);
    }

    /**
     * 待发布包发布
     *
     * 待发布包发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryPendingItemsPackageRequest 请求对象
     * @return SyncInvoker<CreateFactoryPendingItemsPackageRequest, CreateFactoryPendingItemsPackageResponse>
     */
    public SyncInvoker<CreateFactoryPendingItemsPackageRequest, CreateFactoryPendingItemsPackageResponse> createFactoryPendingItemsPackageInvoker(
        CreateFactoryPendingItemsPackageRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createFactoryPendingItemsPackage, hcClient);
    }

    /**
     * 创建补数据实例
     *
     * 创建补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactorySupplementDataInstanceRequest 请求对象
     * @return CreateFactorySupplementDataInstanceResponse
     */
    public CreateFactorySupplementDataInstanceResponse createFactorySupplementDataInstance(
        CreateFactorySupplementDataInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createFactorySupplementDataInstance);
    }

    /**
     * 创建补数据实例
     *
     * 创建补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactorySupplementDataInstanceRequest 请求对象
     * @return SyncInvoker<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse>
     */
    public SyncInvoker<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse> createFactorySupplementDataInstanceInvoker(
        CreateFactorySupplementDataInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createFactorySupplementDataInstance, hcClient);
    }

    /**
     * 创建血缘信息
     *
     * 创建血缘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLineageInfoRequest 请求对象
     * @return CreateLineageInfoResponse
     */
    public CreateLineageInfoResponse createLineageInfo(CreateLineageInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createLineageInfo);
    }

    /**
     * 创建血缘信息
     *
     * 创建血缘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLineageInfoRequest 请求对象
     * @return SyncInvoker<CreateLineageInfoRequest, CreateLineageInfoResponse>
     */
    public SyncInvoker<CreateLineageInfoRequest, CreateLineageInfoResponse> createLineageInfoInvoker(
        CreateLineageInfoRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createLineageInfo, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManagerWorkSpaceRequest 请求对象
     * @return CreateManagerWorkSpaceResponse
     */
    public CreateManagerWorkSpaceResponse createManagerWorkSpace(CreateManagerWorkSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createManagerWorkSpace);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManagerWorkSpaceRequest 请求对象
     * @return SyncInvoker<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse>
     */
    public SyncInvoker<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse> createManagerWorkSpaceInvoker(
        CreateManagerWorkSpaceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createManagerWorkSpace, hcClient);
    }

    /**
     * 添加或修改资产
     *
     * 添加或修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateAssetRequest 请求对象
     * @return CreateOrUpdateAssetResponse
     */
    public CreateOrUpdateAssetResponse createOrUpdateAsset(CreateOrUpdateAssetRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createOrUpdateAsset);
    }

    /**
     * 添加或修改资产
     *
     * 添加或修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateAssetRequest 请求对象
     * @return SyncInvoker<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse>
     */
    public SyncInvoker<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse> createOrUpdateAssetInvoker(
        CreateOrUpdateAssetRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createOrUpdateAsset, hcClient);
    }

    /**
     * 创建或修改资产(邀测)
     *
     * 创建或修改资产，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateEntitiesRequest 请求对象
     * @return CreateOrUpdateEntitiesResponse
     */
    public CreateOrUpdateEntitiesResponse createOrUpdateEntities(CreateOrUpdateEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createOrUpdateEntities);
    }

    /**
     * 创建或修改资产(邀测)
     *
     * 创建或修改资产，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateEntitiesRequest 请求对象
     * @return SyncInvoker<CreateOrUpdateEntitiesRequest, CreateOrUpdateEntitiesResponse>
     */
    public SyncInvoker<CreateOrUpdateEntitiesRequest, CreateOrUpdateEntitiesResponse> createOrUpdateEntitiesInvoker(
        CreateOrUpdateEntitiesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createOrUpdateEntities, hcClient);
    }

    /**
     * 分配队列资源给指定空间
     *
     * 分配队列资源给指定空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityAssignedQueueRequest 请求对象
     * @return CreateSecurityAssignedQueueResponse
     */
    public CreateSecurityAssignedQueueResponse createSecurityAssignedQueue(CreateSecurityAssignedQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityAssignedQueue);
    }

    /**
     * 分配队列资源给指定空间
     *
     * 分配队列资源给指定空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityAssignedQueueRequest 请求对象
     * @return SyncInvoker<CreateSecurityAssignedQueueRequest, CreateSecurityAssignedQueueResponse>
     */
    public SyncInvoker<CreateSecurityAssignedQueueRequest, CreateSecurityAssignedQueueResponse> createSecurityAssignedQueueInvoker(
        CreateSecurityAssignedQueueRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityAssignedQueue, hcClient);
    }

    /**
     * 创建组合识别规则
     *
     * 创建组合识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDataClassificationCombineRuleRequest 请求对象
     * @return CreateSecurityDataClassificationCombineRuleResponse
     */
    public CreateSecurityDataClassificationCombineRuleResponse createSecurityDataClassificationCombineRule(
        CreateSecurityDataClassificationCombineRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityDataClassificationCombineRule);
    }

    /**
     * 创建组合识别规则
     *
     * 创建组合识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDataClassificationCombineRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityDataClassificationCombineRuleRequest, CreateSecurityDataClassificationCombineRuleResponse>
     */
    public SyncInvoker<CreateSecurityDataClassificationCombineRuleRequest, CreateSecurityDataClassificationCombineRuleResponse> createSecurityDataClassificationCombineRuleInvoker(
        CreateSecurityDataClassificationCombineRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityDataClassificationCombineRule, hcClient);
    }

    /**
     * 创建识别规则
     *
     * 创建识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDataClassificationRuleRequest 请求对象
     * @return CreateSecurityDataClassificationRuleResponse
     */
    public CreateSecurityDataClassificationRuleResponse createSecurityDataClassificationRule(
        CreateSecurityDataClassificationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityDataClassificationRule);
    }

    /**
     * 创建识别规则
     *
     * 创建识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDataClassificationRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityDataClassificationRuleRequest, CreateSecurityDataClassificationRuleResponse>
     */
    public SyncInvoker<CreateSecurityDataClassificationRuleRequest, CreateSecurityDataClassificationRuleResponse> createSecurityDataClassificationRuleInvoker(
        CreateSecurityDataClassificationRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityDataClassificationRule, hcClient);
    }

    /**
     * 创建规则分组接口
     *
     * 创建规则分组接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDataClassificationRuleGroupRequest 请求对象
     * @return CreateSecurityDataClassificationRuleGroupResponse
     */
    public CreateSecurityDataClassificationRuleGroupResponse createSecurityDataClassificationRuleGroup(
        CreateSecurityDataClassificationRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityDataClassificationRuleGroup);
    }

    /**
     * 创建规则分组接口
     *
     * 创建规则分组接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDataClassificationRuleGroupRequest 请求对象
     * @return SyncInvoker<CreateSecurityDataClassificationRuleGroupRequest, CreateSecurityDataClassificationRuleGroupResponse>
     */
    public SyncInvoker<CreateSecurityDataClassificationRuleGroupRequest, CreateSecurityDataClassificationRuleGroupResponse> createSecurityDataClassificationRuleGroupInvoker(
        CreateSecurityDataClassificationRuleGroupRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityDataClassificationRuleGroup, hcClient);
    }

    /**
     * 创建数据脱敏策略
     *
     * 创建动态数据脱敏策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDynamicMaskingPolicyRequest 请求对象
     * @return CreateSecurityDynamicMaskingPolicyResponse
     */
    public CreateSecurityDynamicMaskingPolicyResponse createSecurityDynamicMaskingPolicy(
        CreateSecurityDynamicMaskingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityDynamicMaskingPolicy);
    }

    /**
     * 创建数据脱敏策略
     *
     * 创建动态数据脱敏策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDynamicMaskingPolicyRequest 请求对象
     * @return SyncInvoker<CreateSecurityDynamicMaskingPolicyRequest, CreateSecurityDynamicMaskingPolicyResponse>
     */
    public SyncInvoker<CreateSecurityDynamicMaskingPolicyRequest, CreateSecurityDynamicMaskingPolicyResponse> createSecurityDynamicMaskingPolicyInvoker(
        CreateSecurityDynamicMaskingPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityDynamicMaskingPolicy, hcClient);
    }

    /**
     * 创建权限集
     *
     * 创建权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetRequest 请求对象
     * @return CreateSecurityPermissionSetResponse
     */
    public CreateSecurityPermissionSetResponse createSecurityPermissionSet(CreateSecurityPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityPermissionSet);
    }

    /**
     * 创建权限集
     *
     * 创建权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetRequest 请求对象
     * @return SyncInvoker<CreateSecurityPermissionSetRequest, CreateSecurityPermissionSetResponse>
     */
    public SyncInvoker<CreateSecurityPermissionSetRequest, CreateSecurityPermissionSetResponse> createSecurityPermissionSetInvoker(
        CreateSecurityPermissionSetRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityPermissionSet, hcClient);
    }

    /**
     * 添加权限集成员
     *
     * 添加权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetMemberRequest 请求对象
     * @return CreateSecurityPermissionSetMemberResponse
     */
    public CreateSecurityPermissionSetMemberResponse createSecurityPermissionSetMember(
        CreateSecurityPermissionSetMemberRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityPermissionSetMember);
    }

    /**
     * 添加权限集成员
     *
     * 添加权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetMemberRequest 请求对象
     * @return SyncInvoker<CreateSecurityPermissionSetMemberRequest, CreateSecurityPermissionSetMemberResponse>
     */
    public SyncInvoker<CreateSecurityPermissionSetMemberRequest, CreateSecurityPermissionSetMemberResponse> createSecurityPermissionSetMemberInvoker(
        CreateSecurityPermissionSetMemberRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityPermissionSetMember, hcClient);
    }

    /**
     * 添加权限集的权限
     *
     * 添加权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetPermissionRequest 请求对象
     * @return CreateSecurityPermissionSetPermissionResponse
     */
    public CreateSecurityPermissionSetPermissionResponse createSecurityPermissionSetPermission(
        CreateSecurityPermissionSetPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityPermissionSetPermission);
    }

    /**
     * 添加权限集的权限
     *
     * 添加权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetPermissionRequest 请求对象
     * @return SyncInvoker<CreateSecurityPermissionSetPermissionRequest, CreateSecurityPermissionSetPermissionResponse>
     */
    public SyncInvoker<CreateSecurityPermissionSetPermissionRequest, CreateSecurityPermissionSetPermissionResponse> createSecurityPermissionSetPermissionInvoker(
        CreateSecurityPermissionSetPermissionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityPermissionSetPermission, hcClient);
    }

    /**
     * 创建空间资源权限策略
     *
     * 创建空间资源权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityResourcePermissionPolicyRequest 请求对象
     * @return CreateSecurityResourcePermissionPolicyResponse
     */
    public CreateSecurityResourcePermissionPolicyResponse createSecurityResourcePermissionPolicy(
        CreateSecurityResourcePermissionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecurityResourcePermissionPolicy);
    }

    /**
     * 创建空间资源权限策略
     *
     * 创建空间资源权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityResourcePermissionPolicyRequest 请求对象
     * @return SyncInvoker<CreateSecurityResourcePermissionPolicyRequest, CreateSecurityResourcePermissionPolicyResponse>
     */
    public SyncInvoker<CreateSecurityResourcePermissionPolicyRequest, CreateSecurityResourcePermissionPolicyResponse> createSecurityResourcePermissionPolicyInvoker(
        CreateSecurityResourcePermissionPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecurityResourcePermissionPolicy, hcClient);
    }

    /**
     * 创建密级
     *
     * 创建密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecuritySecrecyLevelRequest 请求对象
     * @return CreateSecuritySecrecyLevelResponse
     */
    public CreateSecuritySecrecyLevelResponse createSecuritySecrecyLevel(CreateSecuritySecrecyLevelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSecuritySecrecyLevel);
    }

    /**
     * 创建密级
     *
     * 创建密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecuritySecrecyLevelRequest 请求对象
     * @return SyncInvoker<CreateSecuritySecrecyLevelRequest, CreateSecuritySecrecyLevelResponse>
     */
    public SyncInvoker<CreateSecuritySecrecyLevelRequest, CreateSecuritySecrecyLevelResponse> createSecuritySecrecyLevelInvoker(
        CreateSecuritySecrecyLevelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSecuritySecrecyLevel, hcClient);
    }

    /**
     * 创建服务目录
     *
     * 创建服务目录。 根目录编号为0。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceCatalogRequest 请求对象
     * @return CreateServiceCatalogResponse
     */
    public CreateServiceCatalogResponse createServiceCatalog(CreateServiceCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createServiceCatalog);
    }

    /**
     * 创建服务目录
     *
     * 创建服务目录。 根目录编号为0。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceCatalogRequest 请求对象
     * @return SyncInvoker<CreateServiceCatalogRequest, CreateServiceCatalogResponse>
     */
    public SyncInvoker<CreateServiceCatalogRequest, CreateServiceCatalogResponse> createServiceCatalogInvoker(
        CreateServiceCatalogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createServiceCatalog, hcClient);
    }

    /**
     * 创建数据标准
     *
     * 创建数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardRequest 请求对象
     * @return CreateStandardResponse
     */
    public CreateStandardResponse createStandard(CreateStandardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createStandard);
    }

    /**
     * 创建数据标准
     *
     * 创建数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardRequest 请求对象
     * @return SyncInvoker<CreateStandardRequest, CreateStandardResponse>
     */
    public SyncInvoker<CreateStandardRequest, CreateStandardResponse> createStandardInvoker(
        CreateStandardRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createStandard, hcClient);
    }

    /**
     * 创建数据标准模板
     *
     * 创建当前工作空间下的数据标准模板自定义项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardTemplateRequest 请求对象
     * @return CreateStandardTemplateResponse
     */
    public CreateStandardTemplateResponse createStandardTemplate(CreateStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createStandardTemplate);
    }

    /**
     * 创建数据标准模板
     *
     * 创建当前工作空间下的数据标准模板自定义项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardTemplateRequest 请求对象
     * @return SyncInvoker<CreateStandardTemplateRequest, CreateStandardTemplateResponse>
     */
    public SyncInvoker<CreateStandardTemplateRequest, CreateStandardTemplateResponse> createStandardTemplateInvoker(
        CreateStandardTemplateRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createStandardTemplate, hcClient);
    }

    /**
     * 创建主题
     *
     * 创建主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubjectRequest 请求对象
     * @return CreateSubjectResponse
     */
    public CreateSubjectResponse createSubject(CreateSubjectRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSubject);
    }

    /**
     * 创建主题
     *
     * 创建主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubjectRequest 请求对象
     * @return SyncInvoker<CreateSubjectRequest, CreateSubjectResponse>
     */
    public SyncInvoker<CreateSubjectRequest, CreateSubjectResponse> createSubjectInvoker(CreateSubjectRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSubject, hcClient);
    }

    /**
     * 创建主题(新)
     *
     * 创建主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubjectNewRequest 请求对象
     * @return CreateSubjectNewResponse
     */
    public CreateSubjectNewResponse createSubjectNew(CreateSubjectNewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSubjectNew);
    }

    /**
     * 创建主题(新)
     *
     * 创建主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubjectNewRequest 请求对象
     * @return SyncInvoker<CreateSubjectNewRequest, CreateSubjectNewResponse>
     */
    public SyncInvoker<CreateSubjectNewRequest, CreateSubjectNewResponse> createSubjectNewInvoker(
        CreateSubjectNewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createSubjectNew, hcClient);
    }

    /**
     * 创建表模型
     *
     * 在关系建模中创建一个表模型，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableModelRequest 请求对象
     * @return CreateTableModelResponse
     */
    public CreateTableModelResponse createTableModel(CreateTableModelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createTableModel);
    }

    /**
     * 创建表模型
     *
     * 在关系建模中创建一个表模型，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableModelRequest 请求对象
     * @return SyncInvoker<CreateTableModelRequest, CreateTableModelResponse>
     */
    public SyncInvoker<CreateTableModelRequest, CreateTableModelResponse> createTableModelInvoker(
        CreateTableModelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createTableModel, hcClient);
    }

    /**
     * 创建采集任务
     *
     * 创建采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createTask);
    }

    /**
     * 创建采集任务
     *
     * 创建采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createTask, hcClient);
    }

    /**
     * 创建规则模板
     *
     * 创建规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createTemplate);
    }

    /**
     * 创建规则模板
     *
     * 创建规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createTemplate, hcClient);
    }

    /**
     * 新建模型工作区
     *
     * 新建模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createWorkspace);
    }

    /**
     * 新建模型工作区
     *
     * 新建模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceInvoker(
        CreateWorkspaceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createWorkspace, hcClient);
    }

    /**
     * 测试创建数据连接
     *
     * 测试创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugDataconnectionRequest 请求对象
     * @return DebugDataconnectionResponse
     */
    public DebugDataconnectionResponse debugDataconnection(DebugDataconnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.debugDataconnection);
    }

    /**
     * 测试创建数据连接
     *
     * 测试创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugDataconnectionRequest 请求对象
     * @return SyncInvoker<DebugDataconnectionRequest, DebugDataconnectionResponse>
     */
    public SyncInvoker<DebugDataconnectionRequest, DebugDataconnectionResponse> debugDataconnectionInvoker(
        DebugDataconnectionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.debugDataconnection, hcClient);
    }

    /**
     * 测试数据开发连接细粒度连通性
     *
     * 测试数据开发连接细粒度连通性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugSecurityDlfDataWareHousesRequest 请求对象
     * @return DebugSecurityDlfDataWareHousesResponse
     */
    public DebugSecurityDlfDataWareHousesResponse debugSecurityDlfDataWareHouses(
        DebugSecurityDlfDataWareHousesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.debugSecurityDlfDataWareHouses);
    }

    /**
     * 测试数据开发连接细粒度连通性
     *
     * 测试数据开发连接细粒度连通性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugSecurityDlfDataWareHousesRequest 请求对象
     * @return SyncInvoker<DebugSecurityDlfDataWareHousesRequest, DebugSecurityDlfDataWareHousesResponse>
     */
    public SyncInvoker<DebugSecurityDlfDataWareHousesRequest, DebugSecurityDlfDataWareHousesResponse> debugSecurityDlfDataWareHousesInvoker(
        DebugSecurityDlfDataWareHousesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.debugSecurityDlfDataWareHouses, hcClient);
    }

    /**
     * 驳回工单
     *
     * 驳回工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeclineSecurityApplicationRequest 请求对象
     * @return DeclineSecurityApplicationResponse
     */
    public DeclineSecurityApplicationResponse declineSecurityApplication(DeclineSecurityApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.declineSecurityApplication);
    }

    /**
     * 驳回工单
     *
     * 驳回工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeclineSecurityApplicationRequest 请求对象
     * @return SyncInvoker<DeclineSecurityApplicationRequest, DeclineSecurityApplicationResponse>
     */
    public SyncInvoker<DeclineSecurityApplicationRequest, DeclineSecurityApplicationResponse> declineSecurityApplicationInvoker(
        DeclineSecurityApplicationRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.declineSecurityApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteApp, hcClient);
    }

    /**
     * 删除审批人
     *
     * 删除审批人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApproverRequest 请求对象
     * @return DeleteApproverResponse
     */
    public DeleteApproverResponse deleteApprover(DeleteApproverRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteApprover);
    }

    /**
     * 删除审批人
     *
     * 删除审批人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApproverRequest 请求对象
     * @return SyncInvoker<DeleteApproverRequest, DeleteApproverResponse>
     */
    public SyncInvoker<DeleteApproverRequest, DeleteApproverResponse> deleteApproverInvoker(
        DeleteApproverRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteApprover, hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return DeleteAssetResponse
     */
    public DeleteAssetResponse deleteAsset(DeleteAssetRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteAsset);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return SyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public SyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetInvoker(DeleteAssetRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteAsset, hcClient);
    }

    /**
     * 删除业务指标
     *
     * 删除业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBizMetricRequest 请求对象
     * @return DeleteBizMetricResponse
     */
    public DeleteBizMetricResponse deleteBizMetric(DeleteBizMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteBizMetric);
    }

    /**
     * 删除业务指标
     *
     * 删除业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBizMetricRequest 请求对象
     * @return SyncInvoker<DeleteBizMetricRequest, DeleteBizMetricResponse>
     */
    public SyncInvoker<DeleteBizMetricRequest, DeleteBizMetricResponse> deleteBizMetricInvoker(
        DeleteBizMetricRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteBizMetric, hcClient);
    }

    /**
     * 删除流程架构
     *
     * 删除流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCatalogRequest 请求对象
     * @return DeleteCatalogResponse
     */
    public DeleteCatalogResponse deleteCatalog(DeleteCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteCatalog);
    }

    /**
     * 删除流程架构
     *
     * 删除流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCatalogRequest 请求对象
     * @return SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>
     */
    public SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalogInvoker(DeleteCatalogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteCatalog, hcClient);
    }

    /**
     * 移除资产关联的分类
     *
     * 移除资产关联分类：
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClassificationFromEntitiesRequest 请求对象
     * @return DeleteClassificationFromEntitiesResponse
     */
    public DeleteClassificationFromEntitiesResponse deleteClassificationFromEntities(
        DeleteClassificationFromEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteClassificationFromEntities);
    }

    /**
     * 移除资产关联的分类
     *
     * 移除资产关联分类：
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClassificationFromEntitiesRequest 请求对象
     * @return SyncInvoker<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse>
     */
    public SyncInvoker<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse> deleteClassificationFromEntitiesInvoker(
        DeleteClassificationFromEntitiesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteClassificationFromEntities, hcClient);
    }

    /**
     * 删除码表
     *
     * 删除码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCodeTableRequest 请求对象
     * @return DeleteCodeTableResponse
     */
    public DeleteCodeTableResponse deleteCodeTable(DeleteCodeTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteCodeTable);
    }

    /**
     * 删除码表
     *
     * 删除码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCodeTableRequest 请求对象
     * @return SyncInvoker<DeleteCodeTableRequest, DeleteCodeTableResponse>
     */
    public SyncInvoker<DeleteCodeTableRequest, DeleteCodeTableResponse> deleteCodeTableInvoker(
        DeleteCodeTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteCodeTable, hcClient);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataconnectionRequest 请求对象
     * @return DeleteDataconnectionResponse
     */
    public DeleteDataconnectionResponse deleteDataconnection(DeleteDataconnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDataconnection);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataconnectionRequest 请求对象
     * @return SyncInvoker<DeleteDataconnectionRequest, DeleteDataconnectionResponse>
     */
    public SyncInvoker<DeleteDataconnectionRequest, DeleteDataconnectionResponse> deleteDataconnectionInvoker(
        DeleteDataconnectionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDataconnection, hcClient);
    }

    /**
     * 删除汇总表
     *
     * 批量删除汇总表，只能删除状态为草稿、已线下、已驳回的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignAggregationLogicTableRequest 请求对象
     * @return DeleteDesignAggregationLogicTableResponse
     */
    public DeleteDesignAggregationLogicTableResponse deleteDesignAggregationLogicTable(
        DeleteDesignAggregationLogicTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDesignAggregationLogicTable);
    }

    /**
     * 删除汇总表
     *
     * 批量删除汇总表，只能删除状态为草稿、已线下、已驳回的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignAggregationLogicTableRequest 请求对象
     * @return SyncInvoker<DeleteDesignAggregationLogicTableRequest, DeleteDesignAggregationLogicTableResponse>
     */
    public SyncInvoker<DeleteDesignAggregationLogicTableRequest, DeleteDesignAggregationLogicTableResponse> deleteDesignAggregationLogicTableInvoker(
        DeleteDesignAggregationLogicTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDesignAggregationLogicTable, hcClient);
    }

    /**
     * 删除原子指标
     *
     * 批量删除原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignAtomicIndexRequest 请求对象
     * @return DeleteDesignAtomicIndexResponse
     */
    public DeleteDesignAtomicIndexResponse deleteDesignAtomicIndex(DeleteDesignAtomicIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDesignAtomicIndex);
    }

    /**
     * 删除原子指标
     *
     * 批量删除原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignAtomicIndexRequest 请求对象
     * @return SyncInvoker<DeleteDesignAtomicIndexRequest, DeleteDesignAtomicIndexResponse>
     */
    public SyncInvoker<DeleteDesignAtomicIndexRequest, DeleteDesignAtomicIndexResponse> deleteDesignAtomicIndexInvoker(
        DeleteDesignAtomicIndexRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDesignAtomicIndex, hcClient);
    }

    /**
     * 删除复合指标
     *
     * 根据ID集合删除复合指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignCompoundMetricRequest 请求对象
     * @return DeleteDesignCompoundMetricResponse
     */
    public DeleteDesignCompoundMetricResponse deleteDesignCompoundMetric(DeleteDesignCompoundMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDesignCompoundMetric);
    }

    /**
     * 删除复合指标
     *
     * 根据ID集合删除复合指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignCompoundMetricRequest 请求对象
     * @return SyncInvoker<DeleteDesignCompoundMetricRequest, DeleteDesignCompoundMetricResponse>
     */
    public SyncInvoker<DeleteDesignCompoundMetricRequest, DeleteDesignCompoundMetricResponse> deleteDesignCompoundMetricInvoker(
        DeleteDesignCompoundMetricRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDesignCompoundMetric, hcClient);
    }

    /**
     * 删除衍生指标
     *
     * 根据衍生指标ID，删除衍生指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignDerivativeIndexRequest 请求对象
     * @return DeleteDesignDerivativeIndexResponse
     */
    public DeleteDesignDerivativeIndexResponse deleteDesignDerivativeIndex(DeleteDesignDerivativeIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDesignDerivativeIndex);
    }

    /**
     * 删除衍生指标
     *
     * 根据衍生指标ID，删除衍生指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignDerivativeIndexRequest 请求对象
     * @return SyncInvoker<DeleteDesignDerivativeIndexRequest, DeleteDesignDerivativeIndexResponse>
     */
    public SyncInvoker<DeleteDesignDerivativeIndexRequest, DeleteDesignDerivativeIndexResponse> deleteDesignDerivativeIndexInvoker(
        DeleteDesignDerivativeIndexRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDesignDerivativeIndex, hcClient);
    }

    /**
     * 删除维度
     *
     * 根据传入的维度ID，删除维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignDimensionRequest 请求对象
     * @return DeleteDesignDimensionResponse
     */
    public DeleteDesignDimensionResponse deleteDesignDimension(DeleteDesignDimensionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDesignDimension);
    }

    /**
     * 删除维度
     *
     * 根据传入的维度ID，删除维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignDimensionRequest 请求对象
     * @return SyncInvoker<DeleteDesignDimensionRequest, DeleteDesignDimensionResponse>
     */
    public SyncInvoker<DeleteDesignDimensionRequest, DeleteDesignDimensionResponse> deleteDesignDimensionInvoker(
        DeleteDesignDimensionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDesignDimension, hcClient);
    }

    /**
     * 删除维度表
     *
     * 根据维度表ID，删除维度表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignDimensionLogicTableRequest 请求对象
     * @return DeleteDesignDimensionLogicTableResponse
     */
    public DeleteDesignDimensionLogicTableResponse deleteDesignDimensionLogicTable(
        DeleteDesignDimensionLogicTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDesignDimensionLogicTable);
    }

    /**
     * 删除维度表
     *
     * 根据维度表ID，删除维度表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignDimensionLogicTableRequest 请求对象
     * @return SyncInvoker<DeleteDesignDimensionLogicTableRequest, DeleteDesignDimensionLogicTableResponse>
     */
    public SyncInvoker<DeleteDesignDimensionLogicTableRequest, DeleteDesignDimensionLogicTableResponse> deleteDesignDimensionLogicTableInvoker(
        DeleteDesignDimensionLogicTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDesignDimensionLogicTable, hcClient);
    }

    /**
     * 删除事实表
     *
     * 根据ID集合删除事实表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignFactLogicTableRequest 请求对象
     * @return DeleteDesignFactLogicTableResponse
     */
    public DeleteDesignFactLogicTableResponse deleteDesignFactLogicTable(DeleteDesignFactLogicTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDesignFactLogicTable);
    }

    /**
     * 删除事实表
     *
     * 根据ID集合删除事实表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignFactLogicTableRequest 请求对象
     * @return SyncInvoker<DeleteDesignFactLogicTableRequest, DeleteDesignFactLogicTableResponse>
     */
    public SyncInvoker<DeleteDesignFactLogicTableRequest, DeleteDesignFactLogicTableResponse> deleteDesignFactLogicTableInvoker(
        DeleteDesignFactLogicTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDesignFactLogicTable, hcClient);
    }

    /**
     * 删除实体下展
     *
     * 当已发布的实体被编辑时，其会生成下展，该接口用于删除实体的下展信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignLatestApprovalRequest 请求对象
     * @return DeleteDesignLatestApprovalResponse
     */
    public DeleteDesignLatestApprovalResponse deleteDesignLatestApproval(DeleteDesignLatestApprovalRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDesignLatestApproval);
    }

    /**
     * 删除实体下展
     *
     * 当已发布的实体被编辑时，其会生成下展，该接口用于删除实体的下展信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignLatestApprovalRequest 请求对象
     * @return SyncInvoker<DeleteDesignLatestApprovalRequest, DeleteDesignLatestApprovalResponse>
     */
    public SyncInvoker<DeleteDesignLatestApprovalRequest, DeleteDesignLatestApprovalResponse> deleteDesignLatestApprovalInvoker(
        DeleteDesignLatestApprovalRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDesignLatestApproval, hcClient);
    }

    /**
     * 删除目录
     *
     * 删除目录（数据标准、码表）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectoryRequest 请求对象
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDirectory);
    }

    /**
     * 删除目录
     *
     * 删除目录（数据标准、码表）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectoryRequest 请求对象
     * @return SyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse>
     */
    public SyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectoryInvoker(
        DeleteDirectoryRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteDirectory, hcClient);
    }

    /**
     * 删除资产(邀测)
     *
     * 根据guid删除资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEntityRequest 请求对象
     * @return DeleteEntityResponse
     */
    public DeleteEntityResponse deleteEntity(DeleteEntityRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteEntity);
    }

    /**
     * 删除资产(邀测)
     *
     * 根据guid删除资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEntityRequest 请求对象
     * @return SyncInvoker<DeleteEntityRequest, DeleteEntityResponse>
     */
    public SyncInvoker<DeleteEntityRequest, DeleteEntityResponse> deleteEntityInvoker(DeleteEntityRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteEntity, hcClient);
    }

    /**
     * 删除当前空间下分配的队列资源
     *
     * 删除当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityAssignedQueueRequest 请求对象
     * @return DeleteSecurityAssignedQueueResponse
     */
    public DeleteSecurityAssignedQueueResponse deleteSecurityAssignedQueue(DeleteSecurityAssignedQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityAssignedQueue);
    }

    /**
     * 删除当前空间下分配的队列资源
     *
     * 删除当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityAssignedQueueRequest 请求对象
     * @return SyncInvoker<DeleteSecurityAssignedQueueRequest, DeleteSecurityAssignedQueueResponse>
     */
    public SyncInvoker<DeleteSecurityAssignedQueueRequest, DeleteSecurityAssignedQueueResponse> deleteSecurityAssignedQueueInvoker(
        DeleteSecurityAssignedQueueRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityAssignedQueue, hcClient);
    }

    /**
     * 删除识别规则
     *
     * 删除识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityDataClassificationRuleRequest 请求对象
     * @return DeleteSecurityDataClassificationRuleResponse
     */
    public DeleteSecurityDataClassificationRuleResponse deleteSecurityDataClassificationRule(
        DeleteSecurityDataClassificationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityDataClassificationRule);
    }

    /**
     * 删除识别规则
     *
     * 删除识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityDataClassificationRuleRequest 请求对象
     * @return SyncInvoker<DeleteSecurityDataClassificationRuleRequest, DeleteSecurityDataClassificationRuleResponse>
     */
    public SyncInvoker<DeleteSecurityDataClassificationRuleRequest, DeleteSecurityDataClassificationRuleResponse> deleteSecurityDataClassificationRuleInvoker(
        DeleteSecurityDataClassificationRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityDataClassificationRule, hcClient);
    }

    /**
     * 删除规则分组接口
     *
     * 删除规则分组接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityDataClassificationRuleGroupRequest 请求对象
     * @return DeleteSecurityDataClassificationRuleGroupResponse
     */
    public DeleteSecurityDataClassificationRuleGroupResponse deleteSecurityDataClassificationRuleGroup(
        DeleteSecurityDataClassificationRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityDataClassificationRuleGroup);
    }

    /**
     * 删除规则分组接口
     *
     * 删除规则分组接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityDataClassificationRuleGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityDataClassificationRuleGroupRequest, DeleteSecurityDataClassificationRuleGroupResponse>
     */
    public SyncInvoker<DeleteSecurityDataClassificationRuleGroupRequest, DeleteSecurityDataClassificationRuleGroupResponse> deleteSecurityDataClassificationRuleGroupInvoker(
        DeleteSecurityDataClassificationRuleGroupRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityDataClassificationRuleGroup, hcClient);
    }

    /**
     * 移除资产关联密级
     *
     * 移除资产关联密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityLevelFromEntityRequest 请求对象
     * @return DeleteSecurityLevelFromEntityResponse
     */
    public DeleteSecurityLevelFromEntityResponse deleteSecurityLevelFromEntity(
        DeleteSecurityLevelFromEntityRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityLevelFromEntity);
    }

    /**
     * 移除资产关联密级
     *
     * 移除资产关联密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityLevelFromEntityRequest 请求对象
     * @return SyncInvoker<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse>
     */
    public SyncInvoker<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse> deleteSecurityLevelFromEntityInvoker(
        DeleteSecurityLevelFromEntityRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityLevelFromEntity, hcClient);
    }

    /**
     * 删除权限集
     *
     * 删除权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityPermissionSetRequest 请求对象
     * @return DeleteSecurityPermissionSetResponse
     */
    public DeleteSecurityPermissionSetResponse deleteSecurityPermissionSet(DeleteSecurityPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityPermissionSet);
    }

    /**
     * 删除权限集
     *
     * 删除权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityPermissionSetRequest 请求对象
     * @return SyncInvoker<DeleteSecurityPermissionSetRequest, DeleteSecurityPermissionSetResponse>
     */
    public SyncInvoker<DeleteSecurityPermissionSetRequest, DeleteSecurityPermissionSetResponse> deleteSecurityPermissionSetInvoker(
        DeleteSecurityPermissionSetRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityPermissionSet, hcClient);
    }

    /**
     * 删除指定的id的密级
     *
     * 删除指定的id的密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecuritySecrecyLevelRequest 请求对象
     * @return DeleteSecuritySecrecyLevelResponse
     */
    public DeleteSecuritySecrecyLevelResponse deleteSecuritySecrecyLevel(DeleteSecuritySecrecyLevelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSecuritySecrecyLevel);
    }

    /**
     * 删除指定的id的密级
     *
     * 删除指定的id的密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecuritySecrecyLevelRequest 请求对象
     * @return SyncInvoker<DeleteSecuritySecrecyLevelRequest, DeleteSecuritySecrecyLevelResponse>
     */
    public SyncInvoker<DeleteSecuritySecrecyLevelRequest, DeleteSecuritySecrecyLevelResponse> deleteSecuritySecrecyLevelInvoker(
        DeleteSecuritySecrecyLevelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteSecuritySecrecyLevel, hcClient);
    }

    /**
     * 批量删除目录
     *
     * 批量删除服务目录。  
     * 删除目录的同时会删除其下的所有子目录，不支持删除带有API的目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceCatalogRequest 请求对象
     * @return DeleteServiceCatalogResponse
     */
    public DeleteServiceCatalogResponse deleteServiceCatalog(DeleteServiceCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteServiceCatalog);
    }

    /**
     * 批量删除目录
     *
     * 批量删除服务目录。  
     * 删除目录的同时会删除其下的所有子目录，不支持删除带有API的目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceCatalogRequest 请求对象
     * @return SyncInvoker<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse>
     */
    public SyncInvoker<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> deleteServiceCatalogInvoker(
        DeleteServiceCatalogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteServiceCatalog, hcClient);
    }

    /**
     * 删除数据标准
     *
     * 删除数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardRequest 请求对象
     * @return DeleteStandardResponse
     */
    public DeleteStandardResponse deleteStandard(DeleteStandardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteStandard);
    }

    /**
     * 删除数据标准
     *
     * 删除数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardRequest 请求对象
     * @return SyncInvoker<DeleteStandardRequest, DeleteStandardResponse>
     */
    public SyncInvoker<DeleteStandardRequest, DeleteStandardResponse> deleteStandardInvoker(
        DeleteStandardRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteStandard, hcClient);
    }

    /**
     * 删除数据标准模板
     *
     * 删除数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardTemplateRequest 请求对象
     * @return DeleteStandardTemplateResponse
     */
    public DeleteStandardTemplateResponse deleteStandardTemplate(DeleteStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteStandardTemplate);
    }

    /**
     * 删除数据标准模板
     *
     * 删除数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardTemplateRequest 请求对象
     * @return SyncInvoker<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse>
     */
    public SyncInvoker<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse> deleteStandardTemplateInvoker(
        DeleteStandardTemplateRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteStandardTemplate, hcClient);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubjectRequest 请求对象
     * @return DeleteSubjectResponse
     */
    public DeleteSubjectResponse deleteSubject(DeleteSubjectRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSubject);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubjectRequest 请求对象
     * @return SyncInvoker<DeleteSubjectRequest, DeleteSubjectResponse>
     */
    public SyncInvoker<DeleteSubjectRequest, DeleteSubjectResponse> deleteSubjectInvoker(DeleteSubjectRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteSubject, hcClient);
    }

    /**
     * 删除主题(新)
     *
     * 删除主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubjectNewRequest 请求对象
     * @return DeleteSubjectNewResponse
     */
    public DeleteSubjectNewResponse deleteSubjectNew(DeleteSubjectNewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSubjectNew);
    }

    /**
     * 删除主题(新)
     *
     * 删除主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubjectNewRequest 请求对象
     * @return SyncInvoker<DeleteSubjectNewRequest, DeleteSubjectNewResponse>
     */
    public SyncInvoker<DeleteSubjectNewRequest, DeleteSubjectNewResponse> deleteSubjectNewInvoker(
        DeleteSubjectNewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteSubjectNew, hcClient);
    }

    /**
     * 删除表模型
     *
     * 在关系建模中删除一个表模型及其属性，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTableModelRequest 请求对象
     * @return DeleteTableModelResponse
     */
    public DeleteTableModelResponse deleteTableModel(DeleteTableModelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteTableModel);
    }

    /**
     * 删除表模型
     *
     * 在关系建模中删除一个表模型及其属性，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTableModelRequest 请求对象
     * @return SyncInvoker<DeleteTableModelRequest, DeleteTableModelResponse>
     */
    public SyncInvoker<DeleteTableModelRequest, DeleteTableModelResponse> deleteTableModelInvoker(
        DeleteTableModelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteTableModel, hcClient);
    }

    /**
     * 删除单个采集任务
     *
     * 删除单个采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskInfoRequest 请求对象
     * @return DeleteTaskInfoResponse
     */
    public DeleteTaskInfoResponse deleteTaskInfo(DeleteTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteTaskInfo);
    }

    /**
     * 删除单个采集任务
     *
     * 删除单个采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskInfoRequest 请求对象
     * @return SyncInvoker<DeleteTaskInfoRequest, DeleteTaskInfoResponse>
     */
    public SyncInvoker<DeleteTaskInfoRequest, DeleteTaskInfoResponse> deleteTaskInfoInvoker(
        DeleteTaskInfoRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteTaskInfo, hcClient);
    }

    /**
     * 删除模型工作区
     *
     * 删除模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspacesRequest 请求对象
     * @return DeleteWorkspacesResponse
     */
    public DeleteWorkspacesResponse deleteWorkspaces(DeleteWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteWorkspaces);
    }

    /**
     * 删除模型工作区
     *
     * 删除模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspacesRequest 请求对象
     * @return SyncInvoker<DeleteWorkspacesRequest, DeleteWorkspacesResponse>
     */
    public SyncInvoker<DeleteWorkspacesRequest, DeleteWorkspacesResponse> deleteWorkspacesInvoker(
        DeleteWorkspacesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteWorkspaces, hcClient);
    }

    /**
     * 删除工作空间用户
     *
     * 删除工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceusersRequest 请求对象
     * @return DeleteWorkspaceusersResponse
     */
    public DeleteWorkspaceusersResponse deleteWorkspaceusers(DeleteWorkspaceusersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteWorkspaceusers);
    }

    /**
     * 删除工作空间用户
     *
     * 删除工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceusersRequest 请求对象
     * @return SyncInvoker<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse>
     */
    public SyncInvoker<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse> deleteWorkspaceusersInvoker(
        DeleteWorkspaceusersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteWorkspaceusers, hcClient);
    }

    /**
     * 发布任务包
     *
     * 发布任务包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployFactoryPackagesRequest 请求对象
     * @return DeployFactoryPackagesResponse
     */
    public DeployFactoryPackagesResponse deployFactoryPackages(DeployFactoryPackagesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deployFactoryPackages);
    }

    /**
     * 发布任务包
     *
     * 发布任务包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployFactoryPackagesRequest 请求对象
     * @return SyncInvoker<DeployFactoryPackagesRequest, DeployFactoryPackagesResponse>
     */
    public SyncInvoker<DeployFactoryPackagesRequest, DeployFactoryPackagesResponse> deployFactoryPackagesInvoker(
        DeployFactoryPackagesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deployFactoryPackages, hcClient);
    }

    /**
     * 执行数据安全诊断
     *
     * 执行数据安全诊断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSecurityDiagnoseRequest 请求对象
     * @return ExecuteSecurityDiagnoseResponse
     */
    public ExecuteSecurityDiagnoseResponse executeSecurityDiagnose(ExecuteSecurityDiagnoseRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.executeSecurityDiagnose);
    }

    /**
     * 执行数据安全诊断
     *
     * 执行数据安全诊断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSecurityDiagnoseRequest 请求对象
     * @return SyncInvoker<ExecuteSecurityDiagnoseRequest, ExecuteSecurityDiagnoseResponse>
     */
    public SyncInvoker<ExecuteSecurityDiagnoseRequest, ExecuteSecurityDiagnoseResponse> executeSecurityDiagnoseInvoker(
        ExecuteSecurityDiagnoseRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.executeSecurityDiagnose, hcClient);
    }

    /**
     * 启动、调度、停止采集任务
     *
     * 启动、调度、停止采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTaskActionRequest 请求对象
     * @return ExecuteTaskActionResponse
     */
    public ExecuteTaskActionResponse executeTaskAction(ExecuteTaskActionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.executeTaskAction);
    }

    /**
     * 启动、调度、停止采集任务
     *
     * 启动、调度、停止采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTaskActionRequest 请求对象
     * @return SyncInvoker<ExecuteTaskActionRequest, ExecuteTaskActionResponse>
     */
    public SyncInvoker<ExecuteTaskActionRequest, ExecuteTaskActionResponse> executeTaskActionInvoker(
        ExecuteTaskActionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.executeTaskAction, hcClient);
    }

    /**
     * 导出模型中表的DDL语句
     *
     * 根据模型ID导出指定表的DDL语句。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignModelTableDdlRequest 请求对象
     * @return ExportDesignModelTableDdlResponse
     */
    public ExportDesignModelTableDdlResponse exportDesignModelTableDdl(ExportDesignModelTableDdlRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.exportDesignModelTableDdl);
    }

    /**
     * 导出模型中表的DDL语句
     *
     * 根据模型ID导出指定表的DDL语句。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignModelTableDdlRequest 请求对象
     * @return SyncInvoker<ExportDesignModelTableDdlRequest, ExportDesignModelTableDdlResponse>
     */
    public SyncInvoker<ExportDesignModelTableDdlRequest, ExportDesignModelTableDdlResponse> exportDesignModelTableDdlInvoker(
        ExportDesignModelTableDdlRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.exportDesignModelTableDdl, hcClient);
    }

    /**
     * 导出业务数据
     *
     * 根据请求参数，导出业务数据，可以导出：码表、数据标准、原子指标、衍生指标、复合指标、汇总表、业务指标、主题、流程、逻辑模型、物理模型、维度、事实表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignModelsRequest 请求对象
     * @return ExportDesignModelsResponse
     */
    public ExportDesignModelsResponse exportDesignModels(ExportDesignModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.exportDesignModels);
    }

    /**
     * 导出业务数据
     *
     * 根据请求参数，导出业务数据，可以导出：码表、数据标准、原子指标、衍生指标、复合指标、汇总表、业务指标、主题、流程、逻辑模型、物理模型、维度、事实表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignModelsRequest 请求对象
     * @return SyncInvoker<ExportDesignModelsRequest, ExportDesignModelsResponse>
     */
    public SyncInvoker<ExportDesignModelsRequest, ExportDesignModelsResponse> exportDesignModelsInvoker(
        ExportDesignModelsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.exportDesignModels, hcClient);
    }

    /**
     * 获取excel导出结果
     *
     * 根据请求导出业务数据（/export-model）时返回的uuid，获取excel导出结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignResultRequest 请求对象
     * @return ExportDesignResultResponse
     */
    public ExportDesignResultResponse exportDesignResult(ExportDesignResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.exportDesignResult);
    }

    /**
     * 获取excel导出结果
     *
     * 根据请求导出业务数据（/export-model）时返回的uuid，获取excel导出结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignResultRequest 请求对象
     * @return SyncInvoker<ExportDesignResultRequest, ExportDesignResultResponse>
     */
    public SyncInvoker<ExportDesignResultRequest, ExportDesignResultResponse> exportDesignResultInvoker(
        ExportDesignResultRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.exportDesignResult, hcClient);
    }

    /**
     * 导入主题
     *
     * 用于导入主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCatalogsRequest 请求对象
     * @return ImportCatalogsResponse
     */
    public ImportCatalogsResponse importCatalogs(ImportCatalogsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.importCatalogs);
    }

    /**
     * 导入主题
     *
     * 用于导入主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCatalogsRequest 请求对象
     * @return SyncInvoker<ImportCatalogsRequest, ImportCatalogsResponse>
     */
    public SyncInvoker<ImportCatalogsRequest, ImportCatalogsResponse> importCatalogsInvoker(
        ImportCatalogsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.importCatalogs, hcClient);
    }

    /**
     * 血缘导入
     *
     * 血缘查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportLineageRequest 请求对象
     * @return ImportLineageResponse
     */
    public ImportLineageResponse importLineage(ImportLineageRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.importLineage);
    }

    /**
     * 血缘导入
     *
     * 血缘查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportLineageRequest 请求对象
     * @return SyncInvoker<ImportLineageRequest, ImportLineageResponse>
     */
    public SyncInvoker<ImportLineageRequest, ImportLineageResponse> importLineageInvoker(ImportLineageRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.importLineage, hcClient);
    }

    /**
     * 导入模型，关系建模，维度建模，码表，业务指标以及流程架构
     *
     * 导入模型，关系建模，维度建模，码表，业务指标以及流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportModelsRequest 请求对象
     * @return ImportModelsResponse
     */
    public ImportModelsResponse importModels(ImportModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.importModels);
    }

    /**
     * 导入模型，关系建模，维度建模，码表，业务指标以及流程架构
     *
     * 导入模型，关系建模，维度建模，码表，业务指标以及流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportModelsRequest 请求对象
     * @return SyncInvoker<ImportModelsRequest, ImportModelsResponse>
     */
    public SyncInvoker<ImportModelsRequest, ImportModelsResponse> importModelsInvoker(ImportModelsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.importModels, hcClient);
    }

    /**
     * 查询导入结果
     *
     * 查询导入excel的处理结果（其中参数uuid获取为：/design/models/action或/design/catalogs/action接口返回结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportResultRequest 请求对象
     * @return ImportResultResponse
     */
    public ImportResultResponse importResult(ImportResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.importResult);
    }

    /**
     * 查询导入结果
     *
     * 查询导入excel的处理结果（其中参数uuid获取为：/design/models/action或/design/catalogs/action接口返回结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportResultRequest 请求对象
     * @return SyncInvoker<ImportResultRequest, ImportResultResponse>
     */
    public SyncInvoker<ImportResultRequest, ImportResultResponse> importResultInvoker(ImportResultRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.importResult, hcClient);
    }

    /**
     * 导入预置分类
     *
     * 导入预置分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportSecurityBuiltinCategoryGroupsRequest 请求对象
     * @return ImportSecurityBuiltinCategoryGroupsResponse
     */
    public ImportSecurityBuiltinCategoryGroupsResponse importSecurityBuiltinCategoryGroups(
        ImportSecurityBuiltinCategoryGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.importSecurityBuiltinCategoryGroups);
    }

    /**
     * 导入预置分类
     *
     * 导入预置分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportSecurityBuiltinCategoryGroupsRequest 请求对象
     * @return SyncInvoker<ImportSecurityBuiltinCategoryGroupsRequest, ImportSecurityBuiltinCategoryGroupsResponse>
     */
    public SyncInvoker<ImportSecurityBuiltinCategoryGroupsRequest, ImportSecurityBuiltinCategoryGroupsResponse> importSecurityBuiltinCategoryGroupsInvoker(
        ImportSecurityBuiltinCategoryGroupsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.importSecurityBuiltinCategoryGroups, hcClient);
    }

    /**
     * 初始化数据标准模板
     *
     * 初始化数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializeStandardTemplateRequest 请求对象
     * @return InitializeStandardTemplateResponse
     */
    public InitializeStandardTemplateResponse initializeStandardTemplate(InitializeStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.initializeStandardTemplate);
    }

    /**
     * 初始化数据标准模板
     *
     * 初始化数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializeStandardTemplateRequest 请求对象
     * @return SyncInvoker<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse>
     */
    public SyncInvoker<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse> initializeStandardTemplateInvoker(
        InitializeStandardTemplateRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.initializeStandardTemplate, hcClient);
    }

    /**
     * 查找汇总表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找汇总表信息，中英文名称支持模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregationLogicTablesRequest 请求对象
     * @return ListAggregationLogicTablesResponse
     */
    public ListAggregationLogicTablesResponse listAggregationLogicTables(ListAggregationLogicTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAggregationLogicTables);
    }

    /**
     * 查找汇总表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找汇总表信息，中英文名称支持模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregationLogicTablesRequest 请求对象
     * @return SyncInvoker<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse>
     */
    public SyncInvoker<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse> listAggregationLogicTablesInvoker(
        ListAggregationLogicTablesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listAggregationLogicTables, hcClient);
    }

    /**
     * 获取当前目录下的所有类型列表
     *
     * 获取当前目录下所有类型列表（包括api和目录，均以目录的数据格式形式展示）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllCatalogListRequest 请求对象
     * @return ListAllCatalogListResponse
     */
    public ListAllCatalogListResponse listAllCatalogList(ListAllCatalogListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAllCatalogList);
    }

    /**
     * 获取当前目录下的所有类型列表
     *
     * 获取当前目录下所有类型列表（包括api和目录，均以目录的数据格式形式展示）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllCatalogListRequest 请求对象
     * @return SyncInvoker<ListAllCatalogListRequest, ListAllCatalogListResponse>
     */
    public SyncInvoker<ListAllCatalogListRequest, ListAllCatalogListResponse> listAllCatalogListInvoker(
        ListAllCatalogListRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listAllCatalogList, hcClient);
    }

    /**
     * 获取数据标准集合
     *
     * 根据查询条件分页获取数据标准集合，按修改时间降序排序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllStandardsRequest 请求对象
     * @return ListAllStandardsResponse
     */
    public ListAllStandardsResponse listAllStandards(ListAllStandardsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAllStandards);
    }

    /**
     * 获取数据标准集合
     *
     * 根据查询条件分页获取数据标准集合，按修改时间降序排序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllStandardsRequest 请求对象
     * @return SyncInvoker<ListAllStandardsRequest, ListAllStandardsResponse>
     */
    public SyncInvoker<ListAllStandardsRequest, ListAllStandardsResponse> listAllStandardsInvoker(
        ListAllStandardsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listAllStandards, hcClient);
    }

    /**
     * 查询多种类型的表信息
     *
     * 从信息架构中查询多种类型的表信息，包括逻辑实体、物理表、维度表、事实表、汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTablesRequest 请求对象
     * @return ListAllTablesResponse
     */
    public ListAllTablesResponse listAllTables(ListAllTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAllTables);
    }

    /**
     * 查询多种类型的表信息
     *
     * 从信息架构中查询多种类型的表信息，包括逻辑实体、物理表、维度表、事实表、汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTablesRequest 请求对象
     * @return SyncInvoker<ListAllTablesRequest, ListAllTablesResponse>
     */
    public SyncInvoker<ListAllTablesRequest, ListAllTablesResponse> listAllTablesInvoker(ListAllTablesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listAllTables, hcClient);
    }

    /**
     * 获取当前目录下的api列表
     *
     * 获取当前目录下的api列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiCatalogListRequest 请求对象
     * @return ListApiCatalogListResponse
     */
    public ListApiCatalogListResponse listApiCatalogList(ListApiCatalogListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApiCatalogList);
    }

    /**
     * 获取当前目录下的api列表
     *
     * 获取当前目录下的api列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiCatalogListRequest 请求对象
     * @return SyncInvoker<ListApiCatalogListRequest, ListApiCatalogListResponse>
     */
    public SyncInvoker<ListApiCatalogListRequest, ListApiCatalogListResponse> listApiCatalogListInvoker(
        ListApiCatalogListRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApiCatalogList, hcClient);
    }

    /**
     * 查询指定api 应用调用topN
     *
     * 查询指定api 应用调用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiTopNRequest 请求对象
     * @return ListApiTopNResponse
     */
    public ListApiTopNResponse listApiTopN(ListApiTopNRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApiTopN);
    }

    /**
     * 查询指定api 应用调用topN
     *
     * 查询指定api 应用调用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiTopNRequest 请求对象
     * @return SyncInvoker<ListApiTopNRequest, ListApiTopNResponse>
     */
    public SyncInvoker<ListApiTopNRequest, ListApiTopNResponse> listApiTopNInvoker(ListApiTopNRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApiTopN, hcClient);
    }

    /**
     * 获取网关分组
     *
     * 获取网关分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApicGroupsRequest 请求对象
     * @return ListApicGroupsResponse
     */
    public ListApicGroupsResponse listApicGroups(ListApicGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApicGroups);
    }

    /**
     * 获取网关分组
     *
     * 获取网关分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApicGroupsRequest 请求对象
     * @return SyncInvoker<ListApicGroupsRequest, ListApicGroupsResponse>
     */
    public SyncInvoker<ListApicGroupsRequest, ListApicGroupsResponse> listApicGroupsInvoker(
        ListApicGroupsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApicGroups, hcClient);
    }

    /**
     * 获取网关实例(专享版)
     *
     * 获取网关实例(专享版)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApicInstancesRequest 请求对象
     * @return ListApicInstancesResponse
     */
    public ListApicInstancesResponse listApicInstances(ListApicInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApicInstances);
    }

    /**
     * 获取网关实例(专享版)
     *
     * 获取网关实例(专享版)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApicInstancesRequest 请求对象
     * @return SyncInvoker<ListApicInstancesRequest, ListApicInstancesResponse>
     */
    public SyncInvoker<ListApicInstancesRequest, ListApicInstancesResponse> listApicInstancesInvoker(
        ListApicInstancesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApicInstances, hcClient);
    }

    /**
     * 查询api 服务调用topN
     *
     * 查询api 服务调用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisTopRequest 请求对象
     * @return ListApisTopResponse
     */
    public ListApisTopResponse listApisTop(ListApisTopRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApisTop);
    }

    /**
     * 查询api 服务调用topN
     *
     * 查询api 服务调用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisTopRequest 请求对象
     * @return SyncInvoker<ListApisTopRequest, ListApisTopResponse>
     */
    public SyncInvoker<ListApisTopRequest, ListApisTopResponse> listApisTopInvoker(ListApisTopRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApisTop, hcClient);
    }

    /**
     * 查询申请列表
     *
     * 查询申请列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplyRequest 请求对象
     * @return ListApplyResponse
     */
    public ListApplyResponse listApply(ListApplyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApply);
    }

    /**
     * 查询申请列表
     *
     * 查询申请列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplyRequest 请求对象
     * @return SyncInvoker<ListApplyRequest, ListApplyResponse>
     */
    public SyncInvoker<ListApplyRequest, ListApplyResponse> listApplyInvoker(ListApplyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApply, hcClient);
    }

    /**
     * 查询审批人列表
     *
     * 查询审批人列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApproversRequest 请求对象
     * @return ListApproversResponse
     */
    public ListApproversResponse listApprovers(ListApproversRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApprovers);
    }

    /**
     * 查询审批人列表
     *
     * 查询审批人列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApproversRequest 请求对象
     * @return SyncInvoker<ListApproversRequest, ListApproversResponse>
     */
    public SyncInvoker<ListApproversRequest, ListApproversResponse> listApproversInvoker(ListApproversRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApprovers, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApps);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApps, hcClient);
    }

    /**
     * 查询app 服务使用topN
     *
     * 查询app 服务使用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsTopRequest 请求对象
     * @return ListAppsTopResponse
     */
    public ListAppsTopResponse listAppsTop(ListAppsTopRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAppsTop);
    }

    /**
     * 查询app 服务使用topN
     *
     * 查询app 服务使用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsTopRequest 请求对象
     * @return SyncInvoker<ListAppsTopRequest, ListAppsTopResponse>
     */
    public SyncInvoker<ListAppsTopRequest, ListAppsTopResponse> listAppsTopInvoker(ListAppsTopRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listAppsTop, hcClient);
    }

    /**
     * 查看指标维度信息
     *
     * 查看指标维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricDimensionsRequest 请求对象
     * @return ListBizMetricDimensionsResponse
     */
    public ListBizMetricDimensionsResponse listBizMetricDimensions(ListBizMetricDimensionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listBizMetricDimensions);
    }

    /**
     * 查看指标维度信息
     *
     * 查看指标维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricDimensionsRequest 请求对象
     * @return SyncInvoker<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse>
     */
    public SyncInvoker<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse> listBizMetricDimensionsInvoker(
        ListBizMetricDimensionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listBizMetricDimensions, hcClient);
    }

    /**
     * 查看指标责任人信息
     *
     * 查看指标责任人信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricOwnersRequest 请求对象
     * @return ListBizMetricOwnersResponse
     */
    public ListBizMetricOwnersResponse listBizMetricOwners(ListBizMetricOwnersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listBizMetricOwners);
    }

    /**
     * 查看指标责任人信息
     *
     * 查看指标责任人信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricOwnersRequest 请求对象
     * @return SyncInvoker<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse>
     */
    public SyncInvoker<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse> listBizMetricOwnersInvoker(
        ListBizMetricOwnersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listBizMetricOwners, hcClient);
    }

    /**
     * 查询业务指标信息
     *
     * 通过名称、创建者、修改时间分页查找业务指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricsRequest 请求对象
     * @return ListBizMetricsResponse
     */
    public ListBizMetricsResponse listBizMetrics(ListBizMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listBizMetrics);
    }

    /**
     * 查询业务指标信息
     *
     * 通过名称、创建者、修改时间分页查找业务指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricsRequest 请求对象
     * @return SyncInvoker<ListBizMetricsRequest, ListBizMetricsResponse>
     */
    public SyncInvoker<ListBizMetricsRequest, ListBizMetricsResponse> listBizMetricsInvoker(
        ListBizMetricsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listBizMetrics, hcClient);
    }

    /**
     * 获取主题树信息
     *
     * 获取数据资产主题树信息l1，l2，l3。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessRequest 请求对象
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listBusiness);
    }

    /**
     * 获取主题树信息
     *
     * 获取数据资产主题树信息l1，l2，l3。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessRequest 请求对象
     * @return SyncInvoker<ListBusinessRequest, ListBusinessResponse>
     */
    public SyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessInvoker(ListBusinessRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listBusiness, hcClient);
    }

    /**
     * 获取当前目录下的目录列表（全量）
     *
     * 获取当前目录下的目录列表（全量数据，不分页，推荐仅用于生成目录树等无法分页的场景）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogListRequest 请求对象
     * @return ListCatalogListResponse
     */
    public ListCatalogListResponse listCatalogList(ListCatalogListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCatalogList);
    }

    /**
     * 获取当前目录下的目录列表（全量）
     *
     * 获取当前目录下的目录列表（全量数据，不分页，推荐仅用于生成目录树等无法分页的场景）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogListRequest 请求对象
     * @return SyncInvoker<ListCatalogListRequest, ListCatalogListResponse>
     */
    public SyncInvoker<ListCatalogListRequest, ListCatalogListResponse> listCatalogListInvoker(
        ListCatalogListRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listCatalogList, hcClient);
    }

    /**
     * 获取所有流程架构目录树
     *
     * 获取所有目录树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogTreeRequest 请求对象
     * @return ListCatalogTreeResponse
     */
    public ListCatalogTreeResponse listCatalogTree(ListCatalogTreeRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCatalogTree);
    }

    /**
     * 获取所有流程架构目录树
     *
     * 获取所有目录树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogTreeRequest 请求对象
     * @return SyncInvoker<ListCatalogTreeRequest, ListCatalogTreeResponse>
     */
    public SyncInvoker<ListCatalogTreeRequest, ListCatalogTreeResponse> listCatalogTreeInvoker(
        ListCatalogTreeRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listCatalogTree, hcClient);
    }

    /**
     * 获取作业目录
     *
     * 获取作业目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCategoryRequest 请求对象
     * @return ListCategoryResponse
     */
    public ListCategoryResponse listCategory(ListCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCategory);
    }

    /**
     * 获取作业目录
     *
     * 获取作业目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCategoryRequest 请求对象
     * @return SyncInvoker<ListCategoryRequest, ListCategoryResponse>
     */
    public SyncInvoker<ListCategoryRequest, ListCategoryResponse> listCategoryInvoker(ListCategoryRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listCategory, hcClient);
    }

    /**
     * 获取数据源中表的字段
     *
     * 获取数据源中表的字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListColumnsRequest 请求对象
     * @return ListColumnsResponse
     */
    public ListColumnsResponse listColumns(ListColumnsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listColumns);
    }

    /**
     * 获取数据源中表的字段
     *
     * 获取数据源中表的字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListColumnsRequest 请求对象
     * @return SyncInvoker<ListColumnsRequest, ListColumnsResponse>
     */
    public SyncInvoker<ListColumnsRequest, ListColumnsResponse> listColumnsInvoker(ListColumnsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listColumns, hcClient);
    }

    /**
     * 查找复合指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找复合指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompoundMetricsRequest 请求对象
     * @return ListCompoundMetricsResponse
     */
    public ListCompoundMetricsResponse listCompoundMetrics(ListCompoundMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCompoundMetrics);
    }

    /**
     * 查找复合指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找复合指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompoundMetricsRequest 请求对象
     * @return SyncInvoker<ListCompoundMetricsRequest, ListCompoundMetricsResponse>
     */
    public SyncInvoker<ListCompoundMetricsRequest, ListCompoundMetricsResponse> listCompoundMetricsInvoker(
        ListCompoundMetricsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listCompoundMetrics, hcClient);
    }

    /**
     * 查找业务限定
     *
     * 通过中英文名称、描述、创建者、审核人、限定分组id、修改时间状态分页查找限定信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConditionRequest 请求对象
     * @return ListConditionResponse
     */
    public ListConditionResponse listCondition(ListConditionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCondition);
    }

    /**
     * 查找业务限定
     *
     * 通过中英文名称、描述、创建者、审核人、限定分组id、修改时间状态分页查找限定信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConditionRequest 请求对象
     * @return SyncInvoker<ListConditionRequest, ListConditionResponse>
     */
    public SyncInvoker<ListConditionRequest, ListConditionResponse> listConditionInvoker(ListConditionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listCondition, hcClient);
    }

    /**
     * 获取对账作业列表
     *
     * 获取对账作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsistencyTaskRequest 请求对象
     * @return ListConsistencyTaskResponse
     */
    public ListConsistencyTaskResponse listConsistencyTask(ListConsistencyTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listConsistencyTask);
    }

    /**
     * 获取对账作业列表
     *
     * 获取对账作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsistencyTaskRequest 请求对象
     * @return SyncInvoker<ListConsistencyTaskRequest, ListConsistencyTaskResponse>
     */
    public SyncInvoker<ListConsistencyTaskRequest, ListConsistencyTaskResponse> listConsistencyTaskInvoker(
        ListConsistencyTaskRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listConsistencyTask, hcClient);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataArtsStudioInstancesRequest 请求对象
     * @return ListDataArtsStudioInstancesResponse
     */
    public ListDataArtsStudioInstancesResponse listDataArtsStudioInstances(ListDataArtsStudioInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDataArtsStudioInstances);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataArtsStudioInstancesRequest 请求对象
     * @return SyncInvoker<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse>
     */
    public SyncInvoker<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse> listDataArtsStudioInstancesInvoker(
        ListDataArtsStudioInstancesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDataArtsStudioInstances, hcClient);
    }

    /**
     * 查询数据服务集群访问日志列表
     *
     * 查询数据服务集群访问日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataServiceInstanceAccesslogsRequest 请求对象
     * @return ListDataServiceInstanceAccesslogsResponse
     */
    public ListDataServiceInstanceAccesslogsResponse listDataServiceInstanceAccesslogs(
        ListDataServiceInstanceAccesslogsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDataServiceInstanceAccesslogs);
    }

    /**
     * 查询数据服务集群访问日志列表
     *
     * 查询数据服务集群访问日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataServiceInstanceAccesslogsRequest 请求对象
     * @return SyncInvoker<ListDataServiceInstanceAccesslogsRequest, ListDataServiceInstanceAccesslogsResponse>
     */
    public SyncInvoker<ListDataServiceInstanceAccesslogsRequest, ListDataServiceInstanceAccesslogsResponse> listDataServiceInstanceAccesslogsInvoker(
        ListDataServiceInstanceAccesslogsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDataServiceInstanceAccesslogs, hcClient);
    }

    /**
     * 查询集群详情信息列表
     *
     * 查询集群详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataServiceInstancesDetailRequest 请求对象
     * @return ListDataServiceInstancesDetailResponse
     */
    public ListDataServiceInstancesDetailResponse listDataServiceInstancesDetail(
        ListDataServiceInstancesDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDataServiceInstancesDetail);
    }

    /**
     * 查询集群详情信息列表
     *
     * 查询集群详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataServiceInstancesDetailRequest 请求对象
     * @return SyncInvoker<ListDataServiceInstancesDetailRequest, ListDataServiceInstancesDetailResponse>
     */
    public SyncInvoker<ListDataServiceInstancesDetailRequest, ListDataServiceInstancesDetailResponse> listDataServiceInstancesDetailInvoker(
        ListDataServiceInstancesDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDataServiceInstancesDetail, hcClient);
    }

    /**
     * 查询集群概览信息列表
     *
     * 查询集群概览信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataServiceInstancesOverviewRequest 请求对象
     * @return ListDataServiceInstancesOverviewResponse
     */
    public ListDataServiceInstancesOverviewResponse listDataServiceInstancesOverview(
        ListDataServiceInstancesOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDataServiceInstancesOverview);
    }

    /**
     * 查询集群概览信息列表
     *
     * 查询集群概览信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataServiceInstancesOverviewRequest 请求对象
     * @return SyncInvoker<ListDataServiceInstancesOverviewRequest, ListDataServiceInstancesOverviewResponse>
     */
    public SyncInvoker<ListDataServiceInstancesOverviewRequest, ListDataServiceInstancesOverviewResponse> listDataServiceInstancesOverviewInvoker(
        ListDataServiceInstancesOverviewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDataServiceInstancesOverview, hcClient);
    }

    /**
     * 查询服务目录API列表
     *
     * 查询服务目录API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataServiceMarketApisRequest 请求对象
     * @return ListDataServiceMarketApisResponse
     */
    public ListDataServiceMarketApisResponse listDataServiceMarketApis(ListDataServiceMarketApisRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDataServiceMarketApis);
    }

    /**
     * 查询服务目录API列表
     *
     * 查询服务目录API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataServiceMarketApisRequest 请求对象
     * @return SyncInvoker<ListDataServiceMarketApisRequest, ListDataServiceMarketApisResponse>
     */
    public SyncInvoker<ListDataServiceMarketApisRequest, ListDataServiceMarketApisResponse> listDataServiceMarketApisInvoker(
        ListDataServiceMarketApisRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDataServiceMarketApis, hcClient);
    }

    /**
     * 获取数据源中的表
     *
     * 获取数据源中的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTablesRequest 请求对象
     * @return ListDataTablesResponse
     */
    public ListDataTablesResponse listDataTables(ListDataTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDataTables);
    }

    /**
     * 获取数据源中的表
     *
     * 获取数据源中的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTablesRequest 请求对象
     * @return SyncInvoker<ListDataTablesRequest, ListDataTablesResponse>
     */
    public SyncInvoker<ListDataTablesRequest, ListDataTablesResponse> listDataTablesInvoker(
        ListDataTablesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDataTables, hcClient);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDatabases);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataconnectionsRequest 请求对象
     * @return ListDataconnectionsResponse
     */
    public ListDataconnectionsResponse listDataconnections(ListDataconnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDataconnections);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataconnectionsRequest 请求对象
     * @return SyncInvoker<ListDataconnectionsRequest, ListDataconnectionsResponse>
     */
    public SyncInvoker<ListDataconnectionsRequest, ListDataconnectionsResponse> listDataconnectionsInvoker(
        ListDataconnectionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDataconnections, hcClient);
    }

    /**
     * 查找衍生指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找衍生指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDerivativeIndexesRequest 请求对象
     * @return ListDerivativeIndexesResponse
     */
    public ListDerivativeIndexesResponse listDerivativeIndexes(ListDerivativeIndexesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDerivativeIndexes);
    }

    /**
     * 查找衍生指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找衍生指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDerivativeIndexesRequest 请求对象
     * @return SyncInvoker<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse>
     */
    public SyncInvoker<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse> listDerivativeIndexesInvoker(
        ListDerivativeIndexesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDerivativeIndexes, hcClient);
    }

    /**
     * 获取数仓分层信息
     *
     * 获取数仓分层信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesignDataLayersRequest 请求对象
     * @return ListDesignDataLayersResponse
     */
    public ListDesignDataLayersResponse listDesignDataLayers(ListDesignDataLayersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDesignDataLayers);
    }

    /**
     * 获取数仓分层信息
     *
     * 获取数仓分层信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesignDataLayersRequest 请求对象
     * @return SyncInvoker<ListDesignDataLayersRequest, ListDesignDataLayersResponse>
     */
    public SyncInvoker<ListDesignDataLayersRequest, ListDesignDataLayersResponse> listDesignDataLayersInvoker(
        ListDesignDataLayersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDesignDataLayers, hcClient);
    }

    /**
     * 查看维度颗粒度
     *
     * 查询维度颗粒度，依据tableId查询涉及所有维度，不传tableId查询所有维度组颗粒度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionGroupsRequest 请求对象
     * @return ListDimensionGroupsResponse
     */
    public ListDimensionGroupsResponse listDimensionGroups(ListDimensionGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDimensionGroups);
    }

    /**
     * 查看维度颗粒度
     *
     * 查询维度颗粒度，依据tableId查询涉及所有维度，不传tableId查询所有维度组颗粒度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionGroupsRequest 请求对象
     * @return SyncInvoker<ListDimensionGroupsRequest, ListDimensionGroupsResponse>
     */
    public SyncInvoker<ListDimensionGroupsRequest, ListDimensionGroupsResponse> listDimensionGroupsInvoker(
        ListDimensionGroupsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDimensionGroups, hcClient);
    }

    /**
     * 查找维度表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找维度表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionLogicTablesRequest 请求对象
     * @return ListDimensionLogicTablesResponse
     */
    public ListDimensionLogicTablesResponse listDimensionLogicTables(ListDimensionLogicTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDimensionLogicTables);
    }

    /**
     * 查找维度表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找维度表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionLogicTablesRequest 请求对象
     * @return SyncInvoker<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse>
     */
    public SyncInvoker<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse> listDimensionLogicTablesInvoker(
        ListDimensionLogicTablesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDimensionLogicTables, hcClient);
    }

    /**
     * 查找维度
     *
     * 通过中英文名称、描述、创建者、审核人、状态、l3Id、衍生指标idList、修改时间分页查找维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionsRequest 请求对象
     * @return ListDimensionsResponse
     */
    public ListDimensionsResponse listDimensions(ListDimensionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDimensions);
    }

    /**
     * 查找维度
     *
     * 通过中英文名称、描述、创建者、审核人、状态、l3Id、衍生指标idList、修改时间分页查找维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionsRequest 请求对象
     * @return SyncInvoker<ListDimensionsRequest, ListDimensionsResponse>
     */
    public SyncInvoker<ListDimensionsRequest, ListDimensionsResponse> listDimensionsInvoker(
        ListDimensionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDimensions, hcClient);
    }

    /**
     * 获取所有目录
     *
     * 获取所有目录(数据标准、码表)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoriesRequest 请求对象
     * @return ListDirectoriesResponse
     */
    public ListDirectoriesResponse listDirectories(ListDirectoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDirectories);
    }

    /**
     * 获取所有目录
     *
     * 获取所有目录(数据标准、码表)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoriesRequest 请求对象
     * @return SyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse>
     */
    public SyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse> listDirectoriesInvoker(
        ListDirectoriesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listDirectories, hcClient);
    }

    /**
     * 查找事实表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找事实表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactLogicTablesRequest 请求对象
     * @return ListFactLogicTablesResponse
     */
    public ListFactLogicTablesResponse listFactLogicTables(ListFactLogicTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactLogicTables);
    }

    /**
     * 查找事实表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找事实表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactLogicTablesRequest 请求对象
     * @return SyncInvoker<ListFactLogicTablesRequest, ListFactLogicTablesResponse>
     */
    public SyncInvoker<ListFactLogicTablesRequest, ListFactLogicTablesResponse> listFactLogicTablesInvoker(
        ListFactLogicTablesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactLogicTables, hcClient);
    }

    /**
     * 查询告警通知记录
     *
     * 查询告警通知记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryAlarmInfoRequest 请求对象
     * @return ListFactoryAlarmInfoResponse
     */
    public ListFactoryAlarmInfoResponse listFactoryAlarmInfo(ListFactoryAlarmInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactoryAlarmInfo);
    }

    /**
     * 查询告警通知记录
     *
     * 查询告警通知记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryAlarmInfoRequest 请求对象
     * @return SyncInvoker<ListFactoryAlarmInfoRequest, ListFactoryAlarmInfoResponse>
     */
    public SyncInvoker<ListFactoryAlarmInfoRequest, ListFactoryAlarmInfoResponse> listFactoryAlarmInfoInvoker(
        ListFactoryAlarmInfoRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactoryAlarmInfo, hcClient);
    }

    /**
     * 查询指定作业的实例列表
     *
     * 查询指定作业的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryJobInstancesByNameRequest 请求对象
     * @return ListFactoryJobInstancesByNameResponse
     */
    public ListFactoryJobInstancesByNameResponse listFactoryJobInstancesByName(
        ListFactoryJobInstancesByNameRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactoryJobInstancesByName);
    }

    /**
     * 查询指定作业的实例列表
     *
     * 查询指定作业的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryJobInstancesByNameRequest 请求对象
     * @return SyncInvoker<ListFactoryJobInstancesByNameRequest, ListFactoryJobInstancesByNameResponse>
     */
    public SyncInvoker<ListFactoryJobInstancesByNameRequest, ListFactoryJobInstancesByNameResponse> listFactoryJobInstancesByNameInvoker(
        ListFactoryJobInstancesByNameRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactoryJobInstancesByName, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryJobsRequest 请求对象
     * @return ListFactoryJobsResponse
     */
    public ListFactoryJobsResponse listFactoryJobs(ListFactoryJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactoryJobs);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryJobsRequest 请求对象
     * @return SyncInvoker<ListFactoryJobsRequest, ListFactoryJobsResponse>
     */
    public SyncInvoker<ListFactoryJobsRequest, ListFactoryJobsResponse> listFactoryJobsInvoker(
        ListFactoryJobsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactoryJobs, hcClient);
    }

    /**
     * 查询待发布包列表
     *
     * 查询待发布包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryPendingItemsRequest 请求对象
     * @return ListFactoryPendingItemsResponse
     */
    public ListFactoryPendingItemsResponse listFactoryPendingItems(ListFactoryPendingItemsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactoryPendingItems);
    }

    /**
     * 查询待发布包列表
     *
     * 查询待发布包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryPendingItemsRequest 请求对象
     * @return SyncInvoker<ListFactoryPendingItemsRequest, ListFactoryPendingItemsResponse>
     */
    public SyncInvoker<ListFactoryPendingItemsRequest, ListFactoryPendingItemsResponse> listFactoryPendingItemsInvoker(
        ListFactoryPendingItemsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactoryPendingItems, hcClient);
    }

    /**
     * 查询发布包列表
     *
     * 查询发布包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryReleasePackagesRequest 请求对象
     * @return ListFactoryReleasePackagesResponse
     */
    public ListFactoryReleasePackagesResponse listFactoryReleasePackages(ListFactoryReleasePackagesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactoryReleasePackages);
    }

    /**
     * 查询发布包列表
     *
     * 查询发布包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryReleasePackagesRequest 请求对象
     * @return SyncInvoker<ListFactoryReleasePackagesRequest, ListFactoryReleasePackagesResponse>
     */
    public SyncInvoker<ListFactoryReleasePackagesRequest, ListFactoryReleasePackagesResponse> listFactoryReleasePackagesInvoker(
        ListFactoryReleasePackagesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactoryReleasePackages, hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 此接口用来查询脚本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryScriptsRequest 请求对象
     * @return ListFactoryScriptsResponse
     */
    public ListFactoryScriptsResponse listFactoryScripts(ListFactoryScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactoryScripts);
    }

    /**
     * 查询脚本列表
     *
     * 此接口用来查询脚本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryScriptsRequest 请求对象
     * @return SyncInvoker<ListFactoryScriptsRequest, ListFactoryScriptsResponse>
     */
    public SyncInvoker<ListFactoryScriptsRequest, ListFactoryScriptsResponse> listFactoryScriptsInvoker(
        ListFactoryScriptsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactoryScripts, hcClient);
    }

    /**
     * 查询任务完成情况
     *
     * 查询任务完成情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryTaskCompletionRequest 请求对象
     * @return ListFactoryTaskCompletionResponse
     */
    public ListFactoryTaskCompletionResponse listFactoryTaskCompletion(ListFactoryTaskCompletionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactoryTaskCompletion);
    }

    /**
     * 查询任务完成情况
     *
     * 查询任务完成情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryTaskCompletionRequest 请求对象
     * @return SyncInvoker<ListFactoryTaskCompletionRequest, ListFactoryTaskCompletionResponse>
     */
    public SyncInvoker<ListFactoryTaskCompletionRequest, ListFactoryTaskCompletionResponse> listFactoryTaskCompletionInvoker(
        ListFactoryTaskCompletionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactoryTaskCompletion, hcClient);
    }

    /**
     * 查询实例运行状态
     *
     * 查询实例运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryTaskOverviewRequest 请求对象
     * @return ListFactoryTaskOverviewResponse
     */
    public ListFactoryTaskOverviewResponse listFactoryTaskOverview(ListFactoryTaskOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactoryTaskOverview);
    }

    /**
     * 查询实例运行状态
     *
     * 查询实例运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryTaskOverviewRequest 请求对象
     * @return SyncInvoker<ListFactoryTaskOverviewRequest, ListFactoryTaskOverviewResponse>
     */
    public SyncInvoker<ListFactoryTaskOverviewRequest, ListFactoryTaskOverviewResponse> listFactoryTaskOverviewInvoker(
        ListFactoryTaskOverviewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listFactoryTaskOverview, hcClient);
    }

    /**
     * 获取任务执行结果列表
     *
     * 获取任务执行结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listInstances);
    }

    /**
     * 获取任务执行结果列表
     *
     * 获取任务执行结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listInstances, hcClient);
    }

    /**
     * 获取工作空间列表
     *
     * 获取工作空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagerWorkSpacesRequest 请求对象
     * @return ListManagerWorkSpacesResponse
     */
    public ListManagerWorkSpacesResponse listManagerWorkSpaces(ListManagerWorkSpacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listManagerWorkSpaces);
    }

    /**
     * 获取工作空间列表
     *
     * 获取工作空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagerWorkSpacesRequest 请求对象
     * @return SyncInvoker<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse>
     */
    public SyncInvoker<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse> listManagerWorkSpacesInvoker(
        ListManagerWorkSpacesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listManagerWorkSpaces, hcClient);
    }

    /**
     * 查询消息列表
     *
     * 查询审核中心的通知消息列表。与申请不同，通知类消息，无法驳回，仅能在指定的时间范围内作出处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageRequest 请求对象
     * @return ListMessageResponse
     */
    public ListMessageResponse listMessage(ListMessageRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listMessage);
    }

    /**
     * 查询消息列表
     *
     * 查询审核中心的通知消息列表。与申请不同，通知类消息，无法驳回，仅能在指定的时间范围内作出处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageRequest 请求对象
     * @return SyncInvoker<ListMessageRequest, ListMessageResponse>
     */
    public SyncInvoker<ListMessageRequest, ListMessageResponse> listMessageInvoker(ListMessageRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listMessage, hcClient);
    }

    /**
     * 获取指标关联信息
     *
     * 获取当前指标图谱。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricRelationsRequest 请求对象
     * @return ListMetricRelationsResponse
     */
    public ListMetricRelationsResponse listMetricRelations(ListMetricRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listMetricRelations);
    }

    /**
     * 获取指标关联信息
     *
     * 获取当前指标图谱。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricRelationsRequest 请求对象
     * @return SyncInvoker<ListMetricRelationsRequest, ListMetricRelationsResponse>
     */
    public SyncInvoker<ListMetricRelationsRequest, ListMetricRelationsResponse> listMetricRelationsInvoker(
        ListMetricRelationsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listMetricRelations, hcClient);
    }

    /**
     * 获取质量作业列表
     *
     * 获取质量作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTaskRequest 请求对象
     * @return ListQualityTaskResponse
     */
    public ListQualityTaskResponse listQualityTask(ListQualityTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listQualityTask);
    }

    /**
     * 获取质量作业列表
     *
     * 获取质量作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTaskRequest 请求对象
     * @return SyncInvoker<ListQualityTaskRequest, ListQualityTaskResponse>
     */
    public SyncInvoker<ListQualityTaskRequest, ListQualityTaskResponse> listQualityTaskInvoker(
        ListQualityTaskRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listQualityTask, hcClient);
    }

    /**
     * 获取质量作业列表V1
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTaskListsRequest 请求对象
     * @return ListQualityTaskListsResponse
     */
    public ListQualityTaskListsResponse listQualityTaskLists(ListQualityTaskListsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listQualityTaskLists);
    }

    /**
     * 获取质量作业列表V1
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTaskListsRequest 请求对象
     * @return SyncInvoker<ListQualityTaskListsRequest, ListQualityTaskListsResponse>
     */
    public SyncInvoker<ListQualityTaskListsRequest, ListQualityTaskListsResponse> listQualityTaskListsInvoker(
        ListQualityTaskListsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listQualityTaskLists, hcClient);
    }

    /**
     * 获取规则模板列表
     *
     * 分页获取规则模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTemplatesRequest 请求对象
     * @return ListQualityTemplatesResponse
     */
    public ListQualityTemplatesResponse listQualityTemplates(ListQualityTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listQualityTemplates);
    }

    /**
     * 获取规则模板列表
     *
     * 分页获取规则模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTemplatesRequest 请求对象
     * @return SyncInvoker<ListQualityTemplatesRequest, ListQualityTemplatesResponse>
     */
    public SyncInvoker<ListQualityTemplatesRequest, ListQualityTemplatesResponse> listQualityTemplatesInvoker(
        ListQualityTemplatesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listQualityTemplates, hcClient);
    }

    /**
     * 查询关系
     *
     * 通过关系名称(支持模糊查询)、创建人、开始时间、结束时间等分页查找关系信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelationsRequest 请求对象
     * @return ListRelationsResponse
     */
    public ListRelationsResponse listRelations(ListRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listRelations);
    }

    /**
     * 查询关系
     *
     * 通过关系名称(支持模糊查询)、创建人、开始时间、结束时间等分页查找关系信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelationsRequest 请求对象
     * @return SyncInvoker<ListRelationsRequest, ListRelationsResponse>
     */
    public SyncInvoker<ListRelationsRequest, ListRelationsResponse> listRelationsInvoker(ListRelationsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listRelations, hcClient);
    }

    /**
     * 获取schemas
     *
     * 获取schemas,目前只有DWS和采用postgresql驱动的RDS数据源支持schema,请在调用前确认该数据源是否支持schema字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return ListSchemasResponse
     */
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSchemas);
    }

    /**
     * 获取schemas
     *
     * 获取schemas,目前只有DWS和采用postgresql驱动的RDS数据源支持schema,请在调用前确认该数据源是否支持schema字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return SyncInvoker<ListSchemasRequest, ListSchemasResponse>
     */
    public SyncInvoker<ListSchemasRequest, ListSchemasResponse> listSchemasInvoker(ListSchemasRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSchemas, hcClient);
    }

    /**
     * 获取工单列表
     *
     * 获取工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityApprovalsRequest 请求对象
     * @return ListSecurityApprovalsResponse
     */
    public ListSecurityApprovalsResponse listSecurityApprovals(ListSecurityApprovalsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityApprovals);
    }

    /**
     * 获取工单列表
     *
     * 获取工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityApprovalsRequest 请求对象
     * @return SyncInvoker<ListSecurityApprovalsRequest, ListSecurityApprovalsResponse>
     */
    public SyncInvoker<ListSecurityApprovalsRequest, ListSecurityApprovalsResponse> listSecurityApprovalsInvoker(
        ListSecurityApprovalsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityApprovals, hcClient);
    }

    /**
     * 查询当前空间下分配的队列资源
     *
     * 查询当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityAssignedQueuesRequest 请求对象
     * @return ListSecurityAssignedQueuesResponse
     */
    public ListSecurityAssignedQueuesResponse listSecurityAssignedQueues(ListSecurityAssignedQueuesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityAssignedQueues);
    }

    /**
     * 查询当前空间下分配的队列资源
     *
     * 查询当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityAssignedQueuesRequest 请求对象
     * @return SyncInvoker<ListSecurityAssignedQueuesRequest, ListSecurityAssignedQueuesResponse>
     */
    public SyncInvoker<ListSecurityAssignedQueuesRequest, ListSecurityAssignedQueuesResponse> listSecurityAssignedQueuesInvoker(
        ListSecurityAssignedQueuesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityAssignedQueues, hcClient);
    }

    /**
     * 查询数据分类列表
     *
     * 查询数据分类列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataCategoriesRequest 请求对象
     * @return ListSecurityDataCategoriesResponse
     */
    public ListSecurityDataCategoriesResponse listSecurityDataCategories(ListSecurityDataCategoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityDataCategories);
    }

    /**
     * 查询数据分类列表
     *
     * 查询数据分类列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataCategoriesRequest 请求对象
     * @return SyncInvoker<ListSecurityDataCategoriesRequest, ListSecurityDataCategoriesResponse>
     */
    public SyncInvoker<ListSecurityDataCategoriesRequest, ListSecurityDataCategoriesResponse> listSecurityDataCategoriesInvoker(
        ListSecurityDataCategoriesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityDataCategories, hcClient);
    }

    /**
     * 查询规则组列表
     *
     * 查询规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataClassificationRuleGroupsRequest 请求对象
     * @return ListSecurityDataClassificationRuleGroupsResponse
     */
    public ListSecurityDataClassificationRuleGroupsResponse listSecurityDataClassificationRuleGroups(
        ListSecurityDataClassificationRuleGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityDataClassificationRuleGroups);
    }

    /**
     * 查询规则组列表
     *
     * 查询规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataClassificationRuleGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityDataClassificationRuleGroupsRequest, ListSecurityDataClassificationRuleGroupsResponse>
     */
    public SyncInvoker<ListSecurityDataClassificationRuleGroupsRequest, ListSecurityDataClassificationRuleGroupsResponse> listSecurityDataClassificationRuleGroupsInvoker(
        ListSecurityDataClassificationRuleGroupsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityDataClassificationRuleGroups, hcClient);
    }

    /**
     * 查询识别规则列表
     *
     * 查询识别规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataClassificationRulesRequest 请求对象
     * @return ListSecurityDataClassificationRulesResponse
     */
    public ListSecurityDataClassificationRulesResponse listSecurityDataClassificationRules(
        ListSecurityDataClassificationRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityDataClassificationRules);
    }

    /**
     * 查询识别规则列表
     *
     * 查询识别规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataClassificationRulesRequest 请求对象
     * @return SyncInvoker<ListSecurityDataClassificationRulesRequest, ListSecurityDataClassificationRulesResponse>
     */
    public SyncInvoker<ListSecurityDataClassificationRulesRequest, ListSecurityDataClassificationRulesResponse> listSecurityDataClassificationRulesInvoker(
        ListSecurityDataClassificationRulesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityDataClassificationRules, hcClient);
    }

    /**
     * 查询数据操作信息
     *
     * 查询数据操作信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceActionsRequest 请求对象
     * @return ListSecurityDatasourceActionsResponse
     */
    public ListSecurityDatasourceActionsResponse listSecurityDatasourceActions(
        ListSecurityDatasourceActionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityDatasourceActions);
    }

    /**
     * 查询数据操作信息
     *
     * 查询数据操作信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceActionsRequest 请求对象
     * @return SyncInvoker<ListSecurityDatasourceActionsRequest, ListSecurityDatasourceActionsResponse>
     */
    public SyncInvoker<ListSecurityDatasourceActionsRequest, ListSecurityDatasourceActionsResponse> listSecurityDatasourceActionsInvoker(
        ListSecurityDatasourceActionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityDatasourceActions, hcClient);
    }

    /**
     * 查询数据源可配置权限
     *
     * 查询数据源可配置权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceConfigurationsRequest 请求对象
     * @return ListSecurityDatasourceConfigurationsResponse
     */
    public ListSecurityDatasourceConfigurationsResponse listSecurityDatasourceConfigurations(
        ListSecurityDatasourceConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityDatasourceConfigurations);
    }

    /**
     * 查询数据源可配置权限
     *
     * 查询数据源可配置权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceConfigurationsRequest 请求对象
     * @return SyncInvoker<ListSecurityDatasourceConfigurationsRequest, ListSecurityDatasourceConfigurationsResponse>
     */
    public SyncInvoker<ListSecurityDatasourceConfigurationsRequest, ListSecurityDatasourceConfigurationsResponse> listSecurityDatasourceConfigurationsInvoker(
        ListSecurityDatasourceConfigurationsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityDatasourceConfigurations, hcClient);
    }

    /**
     * 查询url信息
     *
     * 查询url信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceUrlsRequest 请求对象
     * @return ListSecurityDatasourceUrlsResponse
     */
    public ListSecurityDatasourceUrlsResponse listSecurityDatasourceUrls(ListSecurityDatasourceUrlsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityDatasourceUrls);
    }

    /**
     * 查询url信息
     *
     * 查询url信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceUrlsRequest 请求对象
     * @return SyncInvoker<ListSecurityDatasourceUrlsRequest, ListSecurityDatasourceUrlsResponse>
     */
    public SyncInvoker<ListSecurityDatasourceUrlsRequest, ListSecurityDatasourceUrlsResponse> listSecurityDatasourceUrlsInvoker(
        ListSecurityDatasourceUrlsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityDatasourceUrls, hcClient);
    }

    /**
     * 查询数据开发细粒度连接列表（全量）
     *
     * 查询数据开发细粒度连接列表（全量）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDlfDataWareHousesRequest 请求对象
     * @return ListSecurityDlfDataWareHousesResponse
     */
    public ListSecurityDlfDataWareHousesResponse listSecurityDlfDataWareHouses(
        ListSecurityDlfDataWareHousesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityDlfDataWareHouses);
    }

    /**
     * 查询数据开发细粒度连接列表（全量）
     *
     * 查询数据开发细粒度连接列表（全量）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDlfDataWareHousesRequest 请求对象
     * @return SyncInvoker<ListSecurityDlfDataWareHousesRequest, ListSecurityDlfDataWareHousesResponse>
     */
    public SyncInvoker<ListSecurityDlfDataWareHousesRequest, ListSecurityDlfDataWareHousesResponse> listSecurityDlfDataWareHousesInvoker(
        ListSecurityDlfDataWareHousesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityDlfDataWareHouses, hcClient);
    }

    /**
     * 查询动态数据脱敏策略列表
     *
     * 查询动态数据脱敏策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDynamicMaskingPoliciesRequest 请求对象
     * @return ListSecurityDynamicMaskingPoliciesResponse
     */
    public ListSecurityDynamicMaskingPoliciesResponse listSecurityDynamicMaskingPolicies(
        ListSecurityDynamicMaskingPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityDynamicMaskingPolicies);
    }

    /**
     * 查询动态数据脱敏策略列表
     *
     * 查询动态数据脱敏策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDynamicMaskingPoliciesRequest 请求对象
     * @return SyncInvoker<ListSecurityDynamicMaskingPoliciesRequest, ListSecurityDynamicMaskingPoliciesResponse>
     */
    public SyncInvoker<ListSecurityDynamicMaskingPoliciesRequest, ListSecurityDynamicMaskingPoliciesResponse> listSecurityDynamicMaskingPoliciesInvoker(
        ListSecurityDynamicMaskingPoliciesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityDynamicMaskingPolicies, hcClient);
    }

    /**
     * 查询我的权限
     *
     * 查询我的权限、空间账号权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityMemberPermissionRequest 请求对象
     * @return ListSecurityMemberPermissionResponse
     */
    public ListSecurityMemberPermissionResponse listSecurityMemberPermission(
        ListSecurityMemberPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityMemberPermission);
    }

    /**
     * 查询我的权限
     *
     * 查询我的权限、空间账号权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityMemberPermissionRequest 请求对象
     * @return SyncInvoker<ListSecurityMemberPermissionRequest, ListSecurityMemberPermissionResponse>
     */
    public SyncInvoker<ListSecurityMemberPermissionRequest, ListSecurityMemberPermissionResponse> listSecurityMemberPermissionInvoker(
        ListSecurityMemberPermissionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityMemberPermission, hcClient);
    }

    /**
     * 查询用户同步列表
     *
     * 查询用户同步列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityMemberSyncTasksRequest 请求对象
     * @return ListSecurityMemberSyncTasksResponse
     */
    public ListSecurityMemberSyncTasksResponse listSecurityMemberSyncTasks(ListSecurityMemberSyncTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityMemberSyncTasks);
    }

    /**
     * 查询用户同步列表
     *
     * 查询用户同步列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityMemberSyncTasksRequest 请求对象
     * @return SyncInvoker<ListSecurityMemberSyncTasksRequest, ListSecurityMemberSyncTasksResponse>
     */
    public SyncInvoker<ListSecurityMemberSyncTasksRequest, ListSecurityMemberSyncTasksResponse> listSecurityMemberSyncTasksInvoker(
        ListSecurityMemberSyncTasksRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityMemberSyncTasks, hcClient);
    }

    /**
     * 查询用户表权限清单
     *
     * 查询用户表权限清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityMemberTablePermissionRequest 请求对象
     * @return ListSecurityMemberTablePermissionResponse
     */
    public ListSecurityMemberTablePermissionResponse listSecurityMemberTablePermission(
        ListSecurityMemberTablePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityMemberTablePermission);
    }

    /**
     * 查询用户表权限清单
     *
     * 查询用户表权限清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityMemberTablePermissionRequest 请求对象
     * @return SyncInvoker<ListSecurityMemberTablePermissionRequest, ListSecurityMemberTablePermissionResponse>
     */
    public SyncInvoker<ListSecurityMemberTablePermissionRequest, ListSecurityMemberTablePermissionResponse> listSecurityMemberTablePermissionInvoker(
        ListSecurityMemberTablePermissionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityMemberTablePermission, hcClient);
    }

    /**
     * 查询权限集成员列表
     *
     * 查询权限集成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetMembersRequest 请求对象
     * @return ListSecurityPermissionSetMembersResponse
     */
    public ListSecurityPermissionSetMembersResponse listSecurityPermissionSetMembers(
        ListSecurityPermissionSetMembersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityPermissionSetMembers);
    }

    /**
     * 查询权限集成员列表
     *
     * 查询权限集成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetMembersRequest 请求对象
     * @return SyncInvoker<ListSecurityPermissionSetMembersRequest, ListSecurityPermissionSetMembersResponse>
     */
    public SyncInvoker<ListSecurityPermissionSetMembersRequest, ListSecurityPermissionSetMembersResponse> listSecurityPermissionSetMembersInvoker(
        ListSecurityPermissionSetMembersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityPermissionSetMembers, hcClient);
    }

    /**
     * 查询权限集的权限列表
     *
     * 查询权限集的权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetPermissionsRequest 请求对象
     * @return ListSecurityPermissionSetPermissionsResponse
     */
    public ListSecurityPermissionSetPermissionsResponse listSecurityPermissionSetPermissions(
        ListSecurityPermissionSetPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityPermissionSetPermissions);
    }

    /**
     * 查询权限集的权限列表
     *
     * 查询权限集的权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetPermissionsRequest 请求对象
     * @return SyncInvoker<ListSecurityPermissionSetPermissionsRequest, ListSecurityPermissionSetPermissionsResponse>
     */
    public SyncInvoker<ListSecurityPermissionSetPermissionsRequest, ListSecurityPermissionSetPermissionsResponse> listSecurityPermissionSetPermissionsInvoker(
        ListSecurityPermissionSetPermissionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityPermissionSetPermissions, hcClient);
    }

    /**
     * 查询权限集列表
     *
     * 查询权限集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetsRequest 请求对象
     * @return ListSecurityPermissionSetsResponse
     */
    public ListSecurityPermissionSetsResponse listSecurityPermissionSets(ListSecurityPermissionSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityPermissionSets);
    }

    /**
     * 查询权限集列表
     *
     * 查询权限集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetsRequest 请求对象
     * @return SyncInvoker<ListSecurityPermissionSetsRequest, ListSecurityPermissionSetsResponse>
     */
    public SyncInvoker<ListSecurityPermissionSetsRequest, ListSecurityPermissionSetsResponse> listSecurityPermissionSetsInvoker(
        ListSecurityPermissionSetsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityPermissionSets, hcClient);
    }

    /**
     * 查询空间资源权限策略列表
     *
     * 查询空间资源权限策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityResourcePermissionsRequest 请求对象
     * @return ListSecurityResourcePermissionsResponse
     */
    public ListSecurityResourcePermissionsResponse listSecurityResourcePermissions(
        ListSecurityResourcePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityResourcePermissions);
    }

    /**
     * 查询空间资源权限策略列表
     *
     * 查询空间资源权限策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityResourcePermissionsRequest 请求对象
     * @return SyncInvoker<ListSecurityResourcePermissionsRequest, ListSecurityResourcePermissionsResponse>
     */
    public SyncInvoker<ListSecurityResourcePermissionsRequest, ListSecurityResourcePermissionsResponse> listSecurityResourcePermissionsInvoker(
        ListSecurityResourcePermissionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityResourcePermissions, hcClient);
    }

    /**
     * 查询角色对一组库、表的权限交集
     *
     * 查询角色对一组库、表的权限交集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRoleActionsRequest 请求对象
     * @return ListSecurityRoleActionsResponse
     */
    public ListSecurityRoleActionsResponse listSecurityRoleActions(ListSecurityRoleActionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityRoleActions);
    }

    /**
     * 查询角色对一组库、表的权限交集
     *
     * 查询角色对一组库、表的权限交集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRoleActionsRequest 请求对象
     * @return SyncInvoker<ListSecurityRoleActionsRequest, ListSecurityRoleActionsResponse>
     */
    public SyncInvoker<ListSecurityRoleActionsRequest, ListSecurityRoleActionsResponse> listSecurityRoleActionsInvoker(
        ListSecurityRoleActionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityRoleActions, hcClient);
    }

    /**
     * 获取密级
     *
     * 获取密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecuritySecrecyLevelsRequest 请求对象
     * @return ListSecuritySecrecyLevelsResponse
     */
    public ListSecuritySecrecyLevelsResponse listSecuritySecrecyLevels(ListSecuritySecrecyLevelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecuritySecrecyLevels);
    }

    /**
     * 获取密级
     *
     * 获取密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecuritySecrecyLevelsRequest 请求对象
     * @return SyncInvoker<ListSecuritySecrecyLevelsRequest, ListSecuritySecrecyLevelsResponse>
     */
    public SyncInvoker<ListSecuritySecrecyLevelsRequest, ListSecuritySecrecyLevelsResponse> listSecuritySecrecyLevelsInvoker(
        ListSecuritySecrecyLevelsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecuritySecrecyLevels, hcClient);
    }

    /**
     * 查询敏感数据发现概览结果(以分类和密级为单位)
     *
     * 查询敏感数据发现概览结果(以分类和密级为单位)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecuritySensitiveDataOverviewsRequest 请求对象
     * @return ListSecuritySensitiveDataOverviewsResponse
     */
    public ListSecuritySensitiveDataOverviewsResponse listSecuritySensitiveDataOverviews(
        ListSecuritySensitiveDataOverviewsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecuritySensitiveDataOverviews);
    }

    /**
     * 查询敏感数据发现概览结果(以分类和密级为单位)
     *
     * 查询敏感数据发现概览结果(以分类和密级为单位)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecuritySensitiveDataOverviewsRequest 请求对象
     * @return SyncInvoker<ListSecuritySensitiveDataOverviewsRequest, ListSecuritySensitiveDataOverviewsResponse>
     */
    public SyncInvoker<ListSecuritySensitiveDataOverviewsRequest, ListSecuritySensitiveDataOverviewsResponse> listSecuritySensitiveDataOverviewsInvoker(
        ListSecuritySensitiveDataOverviewsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecuritySensitiveDataOverviews, hcClient);
    }

    /**
     * 获取表权限审批人列表
     *
     * 获取表权限审批人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityTableApproversRequest 请求对象
     * @return ListSecurityTableApproversResponse
     */
    public ListSecurityTableApproversResponse listSecurityTableApprovers(ListSecurityTableApproversRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityTableApprovers);
    }

    /**
     * 获取表权限审批人列表
     *
     * 获取表权限审批人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityTableApproversRequest 请求对象
     * @return SyncInvoker<ListSecurityTableApproversRequest, ListSecurityTableApproversResponse>
     */
    public SyncInvoker<ListSecurityTableApproversRequest, ListSecurityTableApproversResponse> listSecurityTableApproversInvoker(
        ListSecurityTableApproversRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityTableApprovers, hcClient);
    }

    /**
     * 查询不合理的权限配置
     *
     * 查询不合理的权限配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityUnreasonablePermissionsRequest 请求对象
     * @return ListSecurityUnreasonablePermissionsResponse
     */
    public ListSecurityUnreasonablePermissionsResponse listSecurityUnreasonablePermissions(
        ListSecurityUnreasonablePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityUnreasonablePermissions);
    }

    /**
     * 查询不合理的权限配置
     *
     * 查询不合理的权限配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityUnreasonablePermissionsRequest 请求对象
     * @return SyncInvoker<ListSecurityUnreasonablePermissionsRequest, ListSecurityUnreasonablePermissionsResponse>
     */
    public SyncInvoker<ListSecurityUnreasonablePermissionsRequest, ListSecurityUnreasonablePermissionsResponse> listSecurityUnreasonablePermissionsInvoker(
        ListSecurityUnreasonablePermissionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityUnreasonablePermissions, hcClient);
    }

    /**
     * 查询用户对表的权限
     *
     * 查询用户对表的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityUserTablePermissionRequest 请求对象
     * @return ListSecurityUserTablePermissionResponse
     */
    public ListSecurityUserTablePermissionResponse listSecurityUserTablePermission(
        ListSecurityUserTablePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSecurityUserTablePermission);
    }

    /**
     * 查询用户对表的权限
     *
     * 查询用户对表的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityUserTablePermissionRequest 请求对象
     * @return SyncInvoker<ListSecurityUserTablePermissionRequest, ListSecurityUserTablePermissionResponse>
     */
    public SyncInvoker<ListSecurityUserTablePermissionRequest, ListSecurityUserTablePermissionResponse> listSecurityUserTablePermissionInvoker(
        ListSecurityUserTablePermissionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSecurityUserTablePermission, hcClient);
    }

    /**
     * 获取主题层级
     *
     * 获取主题层级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubjectLevelsRequest 请求对象
     * @return ListSubjectLevelsResponse
     */
    public ListSubjectLevelsResponse listSubjectLevels(ListSubjectLevelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSubjectLevels);
    }

    /**
     * 获取主题层级
     *
     * 获取主题层级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubjectLevelsRequest 请求对象
     * @return SyncInvoker<ListSubjectLevelsRequest, ListSubjectLevelsResponse>
     */
    public SyncInvoker<ListSubjectLevelsRequest, ListSubjectLevelsResponse> listSubjectLevelsInvoker(
        ListSubjectLevelsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listSubjectLevels, hcClient);
    }

    /**
     * 查询模型下所有关系
     *
     * 查询模型下所有关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableModelRelationsRequest 请求对象
     * @return ListTableModelRelationsResponse
     */
    public ListTableModelRelationsResponse listTableModelRelations(ListTableModelRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listTableModelRelations);
    }

    /**
     * 查询模型下所有关系
     *
     * 查询模型下所有关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableModelRelationsRequest 请求对象
     * @return SyncInvoker<ListTableModelRelationsRequest, ListTableModelRelationsResponse>
     */
    public SyncInvoker<ListTableModelRelationsRequest, ListTableModelRelationsResponse> listTableModelRelationsInvoker(
        ListTableModelRelationsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listTableModelRelations, hcClient);
    }

    /**
     * 查找表模型列表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找关系建模中的表模型信息，包括逻辑实体、物理表和其属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableModelsRequest 请求对象
     * @return ListTableModelsResponse
     */
    public ListTableModelsResponse listTableModels(ListTableModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listTableModels);
    }

    /**
     * 查找表模型列表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找关系建模中的表模型信息，包括逻辑实体、物理表和其属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableModelsRequest 请求对象
     * @return SyncInvoker<ListTableModelsRequest, ListTableModelsResponse>
     */
    public SyncInvoker<ListTableModelsRequest, ListTableModelsResponse> listTableModelsInvoker(
        ListTableModelsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listTableModels, hcClient);
    }

    /**
     * 获取工作空间用户角色
     *
     * 获取工作空间用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceRolesRequest 请求对象
     * @return ListWorkspaceRolesResponse
     */
    public ListWorkspaceRolesResponse listWorkspaceRoles(ListWorkspaceRolesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listWorkspaceRoles);
    }

    /**
     * 获取工作空间用户角色
     *
     * 获取工作空间用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceRolesRequest 请求对象
     * @return SyncInvoker<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse>
     */
    public SyncInvoker<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse> listWorkspaceRolesInvoker(
        ListWorkspaceRolesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listWorkspaceRoles, hcClient);
    }

    /**
     * 获取模型
     *
     * 获取当前空间下的全部模型信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listWorkspaces);
    }

    /**
     * 获取模型
     *
     * 获取当前空间下的全部模型信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listWorkspaces, hcClient);
    }

    /**
     * 获取指定用户所有的工作空间集合
     *
     * 获取指定用户所有的工作空间集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesForUserRequest 请求对象
     * @return ListWorkspacesForUserResponse
     */
    public ListWorkspacesForUserResponse listWorkspacesForUser(ListWorkspacesForUserRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listWorkspacesForUser);
    }

    /**
     * 获取指定用户所有的工作空间集合
     *
     * 获取指定用户所有的工作空间集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesForUserRequest 请求对象
     * @return SyncInvoker<ListWorkspacesForUserRequest, ListWorkspacesForUserResponse>
     */
    public SyncInvoker<ListWorkspacesForUserRequest, ListWorkspacesForUserResponse> listWorkspacesForUserInvoker(
        ListWorkspacesForUserRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listWorkspacesForUser, hcClient);
    }

    /**
     * 获取工作空间用户信息
     *
     * 获取工作空间用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceusersRequest 请求对象
     * @return ListWorkspaceusersResponse
     */
    public ListWorkspaceusersResponse listWorkspaceusers(ListWorkspaceusersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listWorkspaceusers);
    }

    /**
     * 获取工作空间用户信息
     *
     * 获取工作空间用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceusersRequest 请求对象
     * @return SyncInvoker<ListWorkspaceusersRequest, ListWorkspaceusersResponse>
     */
    public SyncInvoker<ListWorkspaceusersRequest, ListWorkspaceusersResponse> listWorkspaceusersInvoker(
        ListWorkspaceusersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listWorkspaceusers, hcClient);
    }

    /**
     * 批量移动api至新目录
     *
     * 批量移动api至新目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateApiRequest 请求对象
     * @return MigrateApiResponse
     */
    public MigrateApiResponse migrateApi(MigrateApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.migrateApi);
    }

    /**
     * 批量移动api至新目录
     *
     * 批量移动api至新目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateApiRequest 请求对象
     * @return SyncInvoker<MigrateApiRequest, MigrateApiResponse>
     */
    public SyncInvoker<MigrateApiRequest, MigrateApiResponse> migrateApiInvoker(MigrateApiRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.migrateApi, hcClient);
    }

    /**
     * 移动当前目录至新目录
     *
     * 移动当前目录至新目录。  
     * 移动目录的的同时会移动其下的所有子目录与api。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateCatalogRequest 请求对象
     * @return MigrateCatalogResponse
     */
    public MigrateCatalogResponse migrateCatalog(MigrateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.migrateCatalog);
    }

    /**
     * 移动当前目录至新目录
     *
     * 移动当前目录至新目录。  
     * 移动目录的的同时会移动其下的所有子目录与api。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateCatalogRequest 请求对象
     * @return SyncInvoker<MigrateCatalogRequest, MigrateCatalogResponse>
     */
    public SyncInvoker<MigrateCatalogRequest, MigrateCatalogResponse> migrateCatalogInvoker(
        MigrateCatalogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.migrateCatalog, hcClient);
    }

    /**
     * 修改自定义项
     *
     * 修改自定义项（包括表自定义项、属性自定义项、主题自定义项、业务指标自定义项）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCustomizedFieldsRequest 请求对象
     * @return ModifyCustomizedFieldsResponse
     */
    public ModifyCustomizedFieldsResponse modifyCustomizedFields(ModifyCustomizedFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.modifyCustomizedFields);
    }

    /**
     * 修改自定义项
     *
     * 修改自定义项（包括表自定义项、属性自定义项、主题自定义项、业务指标自定义项）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCustomizedFieldsRequest 请求对象
     * @return SyncInvoker<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse>
     */
    public SyncInvoker<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse> modifyCustomizedFieldsInvoker(
        ModifyCustomizedFieldsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.modifyCustomizedFields, hcClient);
    }

    /**
     * 创建或更新安全管理员
     *
     * 创建或更新安全管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifySecurityAdminRequest 请求对象
     * @return ModifySecurityAdminResponse
     */
    public ModifySecurityAdminResponse modifySecurityAdmin(ModifySecurityAdminRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.modifySecurityAdmin);
    }

    /**
     * 创建或更新安全管理员
     *
     * 创建或更新安全管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifySecurityAdminRequest 请求对象
     * @return SyncInvoker<ModifySecurityAdminRequest, ModifySecurityAdminResponse>
     */
    public SyncInvoker<ModifySecurityAdminRequest, ModifySecurityAdminResponse> modifySecurityAdminInvoker(
        ModifySecurityAdminRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.modifySecurityAdmin, hcClient);
    }

    /**
     * 用户行为分析
     *
     * 用户行为分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseUserBehaviorRequest 请求对象
     * @return ParseUserBehaviorResponse
     */
    public ParseUserBehaviorResponse parseUserBehavior(ParseUserBehaviorRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.parseUserBehavior);
    }

    /**
     * 用户行为分析
     *
     * 用户行为分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseUserBehaviorRequest 请求对象
     * @return SyncInvoker<ParseUserBehaviorRequest, ParseUserBehaviorResponse>
     */
    public SyncInvoker<ParseUserBehaviorRequest, ParseUserBehaviorResponse> parseUserBehaviorInvoker(
        ParseUserBehaviorRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.parseUserBehavior, hcClient);
    }

    /**
     * DataArtsStudio实例一键购买接口
     *
     * DataArtsStudio实例一键购买接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PayForDgcOneKeyRequest 请求对象
     * @return PayForDgcOneKeyResponse
     */
    public PayForDgcOneKeyResponse payForDgcOneKey(PayForDgcOneKeyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.payForDgcOneKey);
    }

    /**
     * DataArtsStudio实例一键购买接口
     *
     * DataArtsStudio实例一键购买接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PayForDgcOneKeyRequest 请求对象
     * @return SyncInvoker<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse>
     */
    public SyncInvoker<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse> payForDgcOneKeyInvoker(
        PayForDgcOneKeyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.payForDgcOneKey, hcClient);
    }

    /**
     * 删除标签
     *
     * 根据资产（表或属性）的ID删除资产标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDesignEntityTagsRequest 请求对象
     * @return RemoveDesignEntityTagsResponse
     */
    public RemoveDesignEntityTagsResponse removeDesignEntityTags(RemoveDesignEntityTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.removeDesignEntityTags);
    }

    /**
     * 删除标签
     *
     * 根据资产（表或属性）的ID删除资产标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDesignEntityTagsRequest 请求对象
     * @return SyncInvoker<RemoveDesignEntityTagsRequest, RemoveDesignEntityTagsResponse>
     */
    public SyncInvoker<RemoveDesignEntityTagsRequest, RemoveDesignEntityTagsResponse> removeDesignEntityTagsInvoker(
        RemoveDesignEntityTagsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.removeDesignEntityTags, hcClient);
    }

    /**
     * 清空质量规则
     *
     * 清空表的质量规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDesignQualityInfosRequest 请求对象
     * @return RemoveDesignQualityInfosResponse
     */
    public RemoveDesignQualityInfosResponse removeDesignQualityInfos(RemoveDesignQualityInfosRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.removeDesignQualityInfos);
    }

    /**
     * 清空质量规则
     *
     * 清空表的质量规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDesignQualityInfosRequest 请求对象
     * @return SyncInvoker<RemoveDesignQualityInfosRequest, RemoveDesignQualityInfosResponse>
     */
    public SyncInvoker<RemoveDesignQualityInfosRequest, RemoveDesignQualityInfosResponse> removeDesignQualityInfosInvoker(
        RemoveDesignQualityInfosRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.removeDesignQualityInfos, hcClient);
    }

    /**
     * 指定字段采集概要
     *
     * 指定字段采集概要信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenewDataProfileRequest 请求对象
     * @return RenewDataProfileResponse
     */
    public RenewDataProfileResponse renewDataProfile(RenewDataProfileRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.renewDataProfile);
    }

    /**
     * 指定字段采集概要
     *
     * 指定字段采集概要信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenewDataProfileRequest 请求对象
     * @return SyncInvoker<RenewDataProfileRequest, RenewDataProfileResponse>
     */
    public SyncInvoker<RenewDataProfileRequest, RenewDataProfileResponse> renewDataProfileInvoker(
        RenewDataProfileRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.renewDataProfile, hcClient);
    }

    /**
     * 关联属性与数据标准
     *
     * 关联属性与数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetLinkAttributeAndStandardRequest 请求对象
     * @return ResetLinkAttributeAndStandardResponse
     */
    public ResetLinkAttributeAndStandardResponse resetLinkAttributeAndStandard(
        ResetLinkAttributeAndStandardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.resetLinkAttributeAndStandard);
    }

    /**
     * 关联属性与数据标准
     *
     * 关联属性与数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetLinkAttributeAndStandardRequest 请求对象
     * @return SyncInvoker<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse>
     */
    public SyncInvoker<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse> resetLinkAttributeAndStandardInvoker(
        ResetLinkAttributeAndStandardRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.resetLinkAttributeAndStandard, hcClient);
    }

    /**
     * 重跑作业实例
     *
     * 支持重跑作业实例以及上下游的作业实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryFactoryJobInstanceRequest 请求对象
     * @return RetryFactoryJobInstanceResponse
     */
    public RetryFactoryJobInstanceResponse retryFactoryJobInstance(RetryFactoryJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.retryFactoryJobInstance);
    }

    /**
     * 重跑作业实例
     *
     * 支持重跑作业实例以及上下游的作业实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryFactoryJobInstanceRequest 请求对象
     * @return SyncInvoker<RetryFactoryJobInstanceRequest, RetryFactoryJobInstanceResponse>
     */
    public SyncInvoker<RetryFactoryJobInstanceRequest, RetryFactoryJobInstanceResponse> retryFactoryJobInstanceInvoker(
        RetryFactoryJobInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.retryFactoryJobInstance, hcClient);
    }

    /**
     * 撤回审批单
     *
     * 撤回审批单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackApprovalRequest 请求对象
     * @return RollbackApprovalResponse
     */
    public RollbackApprovalResponse rollbackApproval(RollbackApprovalRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.rollbackApproval);
    }

    /**
     * 撤回审批单
     *
     * 撤回审批单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackApprovalRequest 请求对象
     * @return SyncInvoker<RollbackApprovalRequest, RollbackApprovalResponse>
     */
    public SyncInvoker<RollbackApprovalRequest, RollbackApprovalResponse> rollbackApprovalInvoker(
        RollbackApprovalRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.rollbackApproval, hcClient);
    }

    /**
     * 获取审批单
     *
     * 获取审批单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchApprovalsRequest 请求对象
     * @return SearchApprovalsResponse
     */
    public SearchApprovalsResponse searchApprovals(SearchApprovalsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchApprovals);
    }

    /**
     * 获取审批单
     *
     * 获取审批单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchApprovalsRequest 请求对象
     * @return SyncInvoker<SearchApprovalsRequest, SearchApprovalsResponse>
     */
    public SyncInvoker<SearchApprovalsRequest, SearchApprovalsResponse> searchApprovalsInvoker(
        SearchApprovalsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchApprovals, hcClient);
    }

    /**
     * 查找原子指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找原子指标信息看，中英文名称支持模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAtomicIndexesRequest 请求对象
     * @return SearchAtomicIndexesResponse
     */
    public SearchAtomicIndexesResponse searchAtomicIndexes(SearchAtomicIndexesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchAtomicIndexes);
    }

    /**
     * 查找原子指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找原子指标信息看，中英文名称支持模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAtomicIndexesRequest 请求对象
     * @return SyncInvoker<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse>
     */
    public SyncInvoker<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse> searchAtomicIndexesInvoker(
        SearchAtomicIndexesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchAtomicIndexes, hcClient);
    }

    /**
     * 查询API已授权的APP
     *
     * 查询API已授权的APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAuthorizeAppRequest 请求对象
     * @return SearchAuthorizeAppResponse
     */
    public SearchAuthorizeAppResponse searchAuthorizeApp(SearchAuthorizeAppRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchAuthorizeApp);
    }

    /**
     * 查询API已授权的APP
     *
     * 查询API已授权的APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAuthorizeAppRequest 请求对象
     * @return SyncInvoker<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse>
     */
    public SyncInvoker<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse> searchAuthorizeAppInvoker(
        SearchAuthorizeAppRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchAuthorizeApp, hcClient);
    }

    /**
     * 查询APP已拥有授权的API
     *
     * 查询APP已拥有授权的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBindApiRequest 请求对象
     * @return SearchBindApiResponse
     */
    public SearchBindApiResponse searchBindApi(SearchBindApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchBindApi);
    }

    /**
     * 查询APP已拥有授权的API
     *
     * 查询APP已拥有授权的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBindApiRequest 请求对象
     * @return SyncInvoker<SearchBindApiRequest, SearchBindApiResponse>
     */
    public SyncInvoker<SearchBindApiRequest, SearchBindApiResponse> searchBindApiInvoker(SearchBindApiRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchBindApi, hcClient);
    }

    /**
     * 查询流程架构列表
     *
     * 查询流程架构列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCatalogsRequest 请求对象
     * @return SearchCatalogsResponse
     */
    public SearchCatalogsResponse searchCatalogs(SearchCatalogsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchCatalogs);
    }

    /**
     * 查询流程架构列表
     *
     * 查询流程架构列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCatalogsRequest 请求对象
     * @return SyncInvoker<SearchCatalogsRequest, SearchCatalogsResponse>
     */
    public SyncInvoker<SearchCatalogsRequest, SearchCatalogsResponse> searchCatalogsInvoker(
        SearchCatalogsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchCatalogs, hcClient);
    }

    /**
     * 查看码表字段值
     *
     * 查看码表字段值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCodeTableValuesRequest 请求对象
     * @return SearchCodeTableValuesResponse
     */
    public SearchCodeTableValuesResponse searchCodeTableValues(SearchCodeTableValuesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchCodeTableValues);
    }

    /**
     * 查看码表字段值
     *
     * 查看码表字段值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCodeTableValuesRequest 请求对象
     * @return SyncInvoker<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse>
     */
    public SyncInvoker<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse> searchCodeTableValuesInvoker(
        SearchCodeTableValuesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchCodeTableValues, hcClient);
    }

    /**
     * 查询码表列表
     *
     * 查询码表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCodeTablesRequest 请求对象
     * @return SearchCodeTablesResponse
     */
    public SearchCodeTablesResponse searchCodeTables(SearchCodeTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchCodeTables);
    }

    /**
     * 查询码表列表
     *
     * 查询码表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCodeTablesRequest 请求对象
     * @return SyncInvoker<SearchCodeTablesRequest, SearchCodeTablesResponse>
     */
    public SyncInvoker<SearchCodeTablesRequest, SearchCodeTablesResponse> searchCodeTablesInvoker(
        SearchCodeTablesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchCodeTables, hcClient);
    }

    /**
     * 查询自定义项
     *
     * 查询自定义项（包括表自定义项、属性自定义项、主题自定义项、业务指标自定义项）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCustomizedFieldsRequest 请求对象
     * @return SearchCustomizedFieldsResponse
     */
    public SearchCustomizedFieldsResponse searchCustomizedFields(SearchCustomizedFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchCustomizedFields);
    }

    /**
     * 查询自定义项
     *
     * 查询自定义项（包括表自定义项、属性自定义项、主题自定义项、业务指标自定义项）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCustomizedFieldsRequest 请求对象
     * @return SyncInvoker<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse>
     */
    public SyncInvoker<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse> searchCustomizedFieldsInvoker(
        SearchCustomizedFieldsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchCustomizedFields, hcClient);
    }

    /**
     * 获取下展信息与已发布实体的差异
     *
     * 当已发布的实体被编辑时，其会生成下展，该接口用于获取下展信息与已发布实体的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDesignLatestApprovalDiffRequest 请求对象
     * @return SearchDesignLatestApprovalDiffResponse
     */
    public SearchDesignLatestApprovalDiffResponse searchDesignLatestApprovalDiff(
        SearchDesignLatestApprovalDiffRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchDesignLatestApprovalDiff);
    }

    /**
     * 获取下展信息与已发布实体的差异
     *
     * 当已发布的实体被编辑时，其会生成下展，该接口用于获取下展信息与已发布实体的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDesignLatestApprovalDiffRequest 请求对象
     * @return SyncInvoker<SearchDesignLatestApprovalDiffRequest, SearchDesignLatestApprovalDiffResponse>
     */
    public SyncInvoker<SearchDesignLatestApprovalDiffRequest, SearchDesignLatestApprovalDiffResponse> searchDesignLatestApprovalDiffInvoker(
        SearchDesignLatestApprovalDiffRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchDesignLatestApprovalDiff, hcClient);
    }

    /**
     * 获取数据连接信息
     *
     * 获取指定类型下的数据连接信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDwByTypeRequest 请求对象
     * @return SearchDwByTypeResponse
     */
    public SearchDwByTypeResponse searchDwByType(SearchDwByTypeRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchDwByType);
    }

    /**
     * 获取数据连接信息
     *
     * 获取指定类型下的数据连接信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDwByTypeRequest 请求对象
     * @return SyncInvoker<SearchDwByTypeRequest, SearchDwByTypeResponse>
     */
    public SyncInvoker<SearchDwByTypeRequest, SearchDwByTypeResponse> searchDwByTypeInvoker(
        SearchDwByTypeRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchDwByType, hcClient);
    }

    /**
     * 查询目的表和字段(待下线)
     *
     * 查询目的表和字段(待下线)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFieldsForRelationRequest 请求对象
     * @return SearchFieldsForRelationResponse
     */
    public SearchFieldsForRelationResponse searchFieldsForRelation(SearchFieldsForRelationRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchFieldsForRelation);
    }

    /**
     * 查询目的表和字段(待下线)
     *
     * 查询目的表和字段(待下线)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFieldsForRelationRequest 请求对象
     * @return SyncInvoker<SearchFieldsForRelationRequest, SearchFieldsForRelationResponse>
     */
    public SyncInvoker<SearchFieldsForRelationRequest, SearchFieldsForRelationResponse> searchFieldsForRelationInvoker(
        SearchFieldsForRelationRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchFieldsForRelation, hcClient);
    }

    /**
     * 通过路径获取id
     *
     * 通过路径获取id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchIdByPathRequest 请求对象
     * @return SearchIdByPathResponse
     */
    public SearchIdByPathResponse searchIdByPath(SearchIdByPathRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchIdByPath);
    }

    /**
     * 通过路径获取id
     *
     * 通过路径获取id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchIdByPathRequest 请求对象
     * @return SyncInvoker<SearchIdByPathRequest, SearchIdByPathResponse>
     */
    public SyncInvoker<SearchIdByPathRequest, SearchIdByPathResponse> searchIdByPathInvoker(
        SearchIdByPathRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchIdByPath, hcClient);
    }

    /**
     * 获取计算维度成本列表信息
     *
     * 获取计算维度成本列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSgcComputeDimensionsRequest 请求对象
     * @return SearchSgcComputeDimensionsResponse
     */
    public SearchSgcComputeDimensionsResponse searchSgcComputeDimensions(SearchSgcComputeDimensionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchSgcComputeDimensions);
    }

    /**
     * 获取计算维度成本列表信息
     *
     * 获取计算维度成本列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSgcComputeDimensionsRequest 请求对象
     * @return SyncInvoker<SearchSgcComputeDimensionsRequest, SearchSgcComputeDimensionsResponse>
     */
    public SyncInvoker<SearchSgcComputeDimensionsRequest, SearchSgcComputeDimensionsResponse> searchSgcComputeDimensionsInvoker(
        SearchSgcComputeDimensionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchSgcComputeDimensions, hcClient);
    }

    /**
     * 查找主题列表
     *
     * 通过名称（支持模糊查询）、创建者、责任人、状态、修改时间分页查找主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSubjectRequest 请求对象
     * @return SearchSubjectResponse
     */
    public SearchSubjectResponse searchSubject(SearchSubjectRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchSubject);
    }

    /**
     * 查找主题列表
     *
     * 通过名称（支持模糊查询）、创建者、责任人、状态、修改时间分页查找主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSubjectRequest 请求对象
     * @return SyncInvoker<SearchSubjectRequest, SearchSubjectResponse>
     */
    public SyncInvoker<SearchSubjectRequest, SearchSubjectResponse> searchSubjectInvoker(SearchSubjectRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchSubject, hcClient);
    }

    /**
     * 查找主题列表(新)
     *
     * 查找主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSubjectNewRequest 请求对象
     * @return SearchSubjectNewResponse
     */
    public SearchSubjectNewResponse searchSubjectNew(SearchSubjectNewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchSubjectNew);
    }

    /**
     * 查找主题列表(新)
     *
     * 查找主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSubjectNewRequest 请求对象
     * @return SyncInvoker<SearchSubjectNewRequest, SearchSubjectNewResponse>
     */
    public SyncInvoker<SearchSubjectNewRequest, SearchSubjectNewResponse> searchSubjectNewInvoker(
        SearchSubjectNewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchSubjectNew, hcClient);
    }

    /**
     * 查找版本信息
     *
     * 通过名称、创建者、修改时间查找版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchVersionsRequest 请求对象
     * @return SearchVersionsResponse
     */
    public SearchVersionsResponse searchVersions(SearchVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchVersions);
    }

    /**
     * 查找版本信息
     *
     * 通过名称、创建者、修改时间查找版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchVersionsRequest 请求对象
     * @return SyncInvoker<SearchVersionsRequest, SearchVersionsResponse>
     */
    public SyncInvoker<SearchVersionsRequest, SearchVersionsResponse> searchVersionsInvoker(
        SearchVersionsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchVersions, hcClient);
    }

    /**
     * 设置作业标签
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetFactoryJobTagsRequest 请求对象
     * @return SetFactoryJobTagsResponse
     */
    public SetFactoryJobTagsResponse setFactoryJobTags(SetFactoryJobTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.setFactoryJobTags);
    }

    /**
     * 设置作业标签
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetFactoryJobTagsRequest 请求对象
     * @return SyncInvoker<SetFactoryJobTagsRequest, SetFactoryJobTagsResponse>
     */
    public SyncInvoker<SetFactoryJobTagsRequest, SetFactoryJobTagsResponse> setFactoryJobTagsInvoker(
        SetFactoryJobTagsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.setFactoryJobTags, hcClient);
    }

    /**
     * 查看汇总表详情
     *
     * 通过ID查看汇总表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregationLogicTableByIdRequest 请求对象
     * @return ShowAggregationLogicTableByIdResponse
     */
    public ShowAggregationLogicTableByIdResponse showAggregationLogicTableById(
        ShowAggregationLogicTableByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAggregationLogicTableById);
    }

    /**
     * 查看汇总表详情
     *
     * 通过ID查看汇总表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregationLogicTableByIdRequest 请求对象
     * @return SyncInvoker<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse>
     */
    public SyncInvoker<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse> showAggregationLogicTableByIdInvoker(
        ShowAggregationLogicTableByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showAggregationLogicTableById, hcClient);
    }

    /**
     * 查询指定api 仪表板数据详情
     *
     * 查询指定api 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiDashboardRequest 请求对象
     * @return ShowApiDashboardResponse
     */
    public ShowApiDashboardResponse showApiDashboard(ShowApiDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApiDashboard);
    }

    /**
     * 查询指定api 仪表板数据详情
     *
     * 查询指定api 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiDashboardRequest 请求对象
     * @return SyncInvoker<ShowApiDashboardRequest, ShowApiDashboardResponse>
     */
    public SyncInvoker<ShowApiDashboardRequest, ShowApiDashboardResponse> showApiDashboardInvoker(
        ShowApiDashboardRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showApiDashboard, hcClient);
    }

    /**
     * 查询api 仪表板数据详情
     *
     * 查询api 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisDashboardRequest 请求对象
     * @return ShowApisDashboardResponse
     */
    public ShowApisDashboardResponse showApisDashboard(ShowApisDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApisDashboard);
    }

    /**
     * 查询api 仪表板数据详情
     *
     * 查询api 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisDashboardRequest 请求对象
     * @return SyncInvoker<ShowApisDashboardRequest, ShowApisDashboardResponse>
     */
    public SyncInvoker<ShowApisDashboardRequest, ShowApisDashboardResponse> showApisDashboardInvoker(
        ShowApisDashboardRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showApisDashboard, hcClient);
    }

    /**
     * 查询api 统计数据详情
     *
     * 查询api 统计数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisDetailRequest 请求对象
     * @return ShowApisDetailResponse
     */
    public ShowApisDetailResponse showApisDetail(ShowApisDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApisDetail);
    }

    /**
     * 查询api 统计数据详情
     *
     * 查询api 统计数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisDetailRequest 请求对象
     * @return SyncInvoker<ShowApisDetailRequest, ShowApisDetailResponse>
     */
    public SyncInvoker<ShowApisDetailRequest, ShowApisDetailResponse> showApisDetailInvoker(
        ShowApisDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showApisDetail, hcClient);
    }

    /**
     * 查询统计用户相关的总览开发指标
     *
     * 查询统计用户相关的总览开发指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisOverviewRequest 请求对象
     * @return ShowApisOverviewResponse
     */
    public ShowApisOverviewResponse showApisOverview(ShowApisOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApisOverview);
    }

    /**
     * 查询统计用户相关的总览开发指标
     *
     * 查询统计用户相关的总览开发指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisOverviewRequest 请求对象
     * @return SyncInvoker<ShowApisOverviewRequest, ShowApisOverviewResponse>
     */
    public SyncInvoker<ShowApisOverviewRequest, ShowApisOverviewResponse> showApisOverviewInvoker(
        ShowApisOverviewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showApisOverview, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppInfoRequest 请求对象
     * @return ShowAppInfoResponse
     */
    public ShowAppInfoResponse showAppInfo(ShowAppInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAppInfo);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppInfoRequest 请求对象
     * @return SyncInvoker<ShowAppInfoRequest, ShowAppInfoResponse>
     */
    public SyncInvoker<ShowAppInfoRequest, ShowAppInfoResponse> showAppInfoInvoker(ShowAppInfoRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showAppInfo, hcClient);
    }

    /**
     * 获取申请详情
     *
     * 获取申请详情。  
     * 此功能仅用作信息详情展示，不用做业务处理，因此不展示编号等后台参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplyDetailRequest 请求对象
     * @return ShowApplyDetailResponse
     */
    public ShowApplyDetailResponse showApplyDetail(ShowApplyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApplyDetail);
    }

    /**
     * 获取申请详情
     *
     * 获取申请详情。  
     * 此功能仅用作信息详情展示，不用做业务处理，因此不展示编号等后台参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplyDetailRequest 请求对象
     * @return SyncInvoker<ShowApplyDetailRequest, ShowApplyDetailResponse>
     */
    public SyncInvoker<ShowApplyDetailRequest, ShowApplyDetailResponse> showApplyDetailInvoker(
        ShowApplyDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showApplyDetail, hcClient);
    }

    /**
     * 查询app 仪表板数据详情
     *
     * 查询app 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsDashboardRequest 请求对象
     * @return ShowAppsDashboardResponse
     */
    public ShowAppsDashboardResponse showAppsDashboard(ShowAppsDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAppsDashboard);
    }

    /**
     * 查询app 仪表板数据详情
     *
     * 查询app 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsDashboardRequest 请求对象
     * @return SyncInvoker<ShowAppsDashboardRequest, ShowAppsDashboardResponse>
     */
    public SyncInvoker<ShowAppsDashboardRequest, ShowAppsDashboardResponse> showAppsDashboardInvoker(
        ShowAppsDashboardRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showAppsDashboard, hcClient);
    }

    /**
     * 查询app 统计数据详情
     *
     * 查询app 统计数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsDetailRequest 请求对象
     * @return ShowAppsDetailResponse
     */
    public ShowAppsDetailResponse showAppsDetail(ShowAppsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAppsDetail);
    }

    /**
     * 查询app 统计数据详情
     *
     * 查询app 统计数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsDetailRequest 请求对象
     * @return SyncInvoker<ShowAppsDetailRequest, ShowAppsDetailResponse>
     */
    public SyncInvoker<ShowAppsDetailRequest, ShowAppsDetailResponse> showAppsDetailInvoker(
        ShowAppsDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showAppsDetail, hcClient);
    }

    /**
     * 查询统计用户相关的总览调用指标
     *
     * 查询统计用户相关的总览调用指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsOverviewRequest 请求对象
     * @return ShowAppsOverviewResponse
     */
    public ShowAppsOverviewResponse showAppsOverview(ShowAppsOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAppsOverview);
    }

    /**
     * 查询统计用户相关的总览调用指标
     *
     * 查询统计用户相关的总览调用指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsOverviewRequest 请求对象
     * @return SyncInvoker<ShowAppsOverviewRequest, ShowAppsOverviewResponse>
     */
    public SyncInvoker<ShowAppsOverviewRequest, ShowAppsOverviewResponse> showAppsOverviewInvoker(
        ShowAppsOverviewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showAppsOverview, hcClient);
    }

    /**
     * 查看原子指标详情
     *
     * 通过ID获取原子指标详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAtomicIndexByIdRequest 请求对象
     * @return ShowAtomicIndexByIdResponse
     */
    public ShowAtomicIndexByIdResponse showAtomicIndexById(ShowAtomicIndexByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAtomicIndexById);
    }

    /**
     * 查看原子指标详情
     *
     * 通过ID获取原子指标详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAtomicIndexByIdRequest 请求对象
     * @return SyncInvoker<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse>
     */
    public SyncInvoker<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse> showAtomicIndexByIdInvoker(
        ShowAtomicIndexByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showAtomicIndexById, hcClient);
    }

    /**
     * 查找流程架构详情
     *
     * 查找流程架构详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBizCatalogDetailRequest 请求对象
     * @return ShowBizCatalogDetailResponse
     */
    public ShowBizCatalogDetailResponse showBizCatalogDetail(ShowBizCatalogDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showBizCatalogDetail);
    }

    /**
     * 查找流程架构详情
     *
     * 查找流程架构详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBizCatalogDetailRequest 请求对象
     * @return SyncInvoker<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse>
     */
    public SyncInvoker<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse> showBizCatalogDetailInvoker(
        ShowBizCatalogDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showBizCatalogDetail, hcClient);
    }

    /**
     * 查看指标详情
     *
     * 通过ID查看指标的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBizMetricByIdRequest 请求对象
     * @return ShowBizMetricByIdResponse
     */
    public ShowBizMetricByIdResponse showBizMetricById(ShowBizMetricByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showBizMetricById);
    }

    /**
     * 查看指标详情
     *
     * 通过ID查看指标的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBizMetricByIdRequest 请求对象
     * @return SyncInvoker<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse>
     */
    public SyncInvoker<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse> showBizMetricByIdInvoker(
        ShowBizMetricByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showBizMetricById, hcClient);
    }

    /**
     * 查询业务资产
     *
     * 业务资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsRequest 请求对象
     * @return ShowBusinessAssetsResponse
     */
    public ShowBusinessAssetsResponse showBusinessAssets(ShowBusinessAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showBusinessAssets);
    }

    /**
     * 查询业务资产
     *
     * 业务资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsRequest 请求对象
     * @return SyncInvoker<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse>
     */
    public SyncInvoker<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse> showBusinessAssetsInvoker(
        ShowBusinessAssetsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showBusinessAssets, hcClient);
    }

    /**
     * 获取业务资产统计信息
     *
     * 获取业务资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsStatisticRequest 请求对象
     * @return ShowBusinessAssetsStatisticResponse
     */
    public ShowBusinessAssetsStatisticResponse showBusinessAssetsStatistic(ShowBusinessAssetsStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showBusinessAssetsStatistic);
    }

    /**
     * 获取业务资产统计信息
     *
     * 获取业务资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsStatisticRequest 请求对象
     * @return SyncInvoker<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse>
     */
    public SyncInvoker<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse> showBusinessAssetsStatisticInvoker(
        ShowBusinessAssetsStatisticRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showBusinessAssetsStatistic, hcClient);
    }

    /**
     * 查询业务资产目录树
     *
     * 逐级查询业务资产目录树,包含数据规范同步过来的业务对象和逻辑实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsTreeRequest 请求对象
     * @return ShowBusinessAssetsTreeResponse
     */
    public ShowBusinessAssetsTreeResponse showBusinessAssetsTree(ShowBusinessAssetsTreeRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showBusinessAssetsTree);
    }

    /**
     * 查询业务资产目录树
     *
     * 逐级查询业务资产目录树,包含数据规范同步过来的业务对象和逻辑实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsTreeRequest 请求对象
     * @return SyncInvoker<ShowBusinessAssetsTreeRequest, ShowBusinessAssetsTreeResponse>
     */
    public SyncInvoker<ShowBusinessAssetsTreeRequest, ShowBusinessAssetsTreeResponse> showBusinessAssetsTreeInvoker(
        ShowBusinessAssetsTreeRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showBusinessAssetsTree, hcClient);
    }

    /**
     * 查询服务目录
     *
     * 查询服务目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCatalogDetailRequest 请求对象
     * @return ShowCatalogDetailResponse
     */
    public ShowCatalogDetailResponse showCatalogDetail(ShowCatalogDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showCatalogDetail);
    }

    /**
     * 查询服务目录
     *
     * 查询服务目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCatalogDetailRequest 请求对象
     * @return SyncInvoker<ShowCatalogDetailRequest, ShowCatalogDetailResponse>
     */
    public SyncInvoker<ShowCatalogDetailRequest, ShowCatalogDetailResponse> showCatalogDetailInvoker(
        ShowCatalogDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showCatalogDetail, hcClient);
    }

    /**
     * 查看码表详情
     *
     * 通过ID查看码表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCodeTableByIdRequest 请求对象
     * @return ShowCodeTableByIdResponse
     */
    public ShowCodeTableByIdResponse showCodeTableById(ShowCodeTableByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showCodeTableById);
    }

    /**
     * 查看码表详情
     *
     * 通过ID查看码表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCodeTableByIdRequest 请求对象
     * @return SyncInvoker<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse>
     */
    public SyncInvoker<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse> showCodeTableByIdInvoker(
        ShowCodeTableByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showCodeTableById, hcClient);
    }

    /**
     * 查看复合指标详情
     *
     * 通过ID获取复合指标详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompoundMetricByIdRequest 请求对象
     * @return ShowCompoundMetricByIdResponse
     */
    public ShowCompoundMetricByIdResponse showCompoundMetricById(ShowCompoundMetricByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showCompoundMetricById);
    }

    /**
     * 查看复合指标详情
     *
     * 通过ID获取复合指标详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompoundMetricByIdRequest 请求对象
     * @return SyncInvoker<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse>
     */
    public SyncInvoker<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse> showCompoundMetricByIdInvoker(
        ShowCompoundMetricByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showCompoundMetricById, hcClient);
    }

    /**
     * 查看限定详情
     *
     * 通过ID查看限定详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConditionByIdRequest 请求对象
     * @return ShowConditionByIdResponse
     */
    public ShowConditionByIdResponse showConditionById(ShowConditionByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showConditionById);
    }

    /**
     * 查看限定详情
     *
     * 通过ID查看限定详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConditionByIdRequest 请求对象
     * @return SyncInvoker<ShowConditionByIdRequest, ShowConditionByIdResponse>
     */
    public SyncInvoker<ShowConditionByIdRequest, ShowConditionByIdResponse> showConditionByIdInvoker(
        ShowConditionByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showConditionById, hcClient);
    }

    /**
     * 获取对账作业详情
     *
     * 获取对账作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsistencyTaskDetailRequest 请求对象
     * @return ShowConsistencyTaskDetailResponse
     */
    public ShowConsistencyTaskDetailResponse showConsistencyTaskDetail(ShowConsistencyTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showConsistencyTaskDetail);
    }

    /**
     * 获取对账作业详情
     *
     * 获取对账作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsistencyTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse>
     */
    public SyncInvoker<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse> showConsistencyTaskDetailInvoker(
        ShowConsistencyTaskDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showConsistencyTaskDetail, hcClient);
    }

    /**
     * 资产详情(邀测)
     *
     * 资产详情接口，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataDetailRequest 请求对象
     * @return ShowDataDetailResponse
     */
    public ShowDataDetailResponse showDataDetail(ShowDataDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDataDetail);
    }

    /**
     * 资产详情(邀测)
     *
     * 资产详情接口，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataDetailRequest 请求对象
     * @return SyncInvoker<ShowDataDetailRequest, ShowDataDetailResponse>
     */
    public SyncInvoker<ShowDataDetailRequest, ShowDataDetailResponse> showDataDetailInvoker(
        ShowDataDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDataDetail, hcClient);
    }

    /**
     * 表数据预览
     *
     * 表数据预览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataPreviewRequest 请求对象
     * @return ShowDataPreviewResponse
     */
    public ShowDataPreviewResponse showDataPreview(ShowDataPreviewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDataPreview);
    }

    /**
     * 表数据预览
     *
     * 表数据预览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataPreviewRequest 请求对象
     * @return SyncInvoker<ShowDataPreviewRequest, ShowDataPreviewResponse>
     */
    public SyncInvoker<ShowDataPreviewRequest, ShowDataPreviewResponse> showDataPreviewInvoker(
        ShowDataPreviewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDataPreview, hcClient);
    }

    /**
     * 资产信息
     *
     * 查询概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProfileRequest 请求对象
     * @return ShowDataProfileResponse
     */
    public ShowDataProfileResponse showDataProfile(ShowDataProfileRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDataProfile);
    }

    /**
     * 资产信息
     *
     * 查询概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProfileRequest 请求对象
     * @return SyncInvoker<ShowDataProfileRequest, ShowDataProfileResponse>
     */
    public SyncInvoker<ShowDataProfileRequest, ShowDataProfileResponse> showDataProfileInvoker(
        ShowDataProfileRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDataProfile, hcClient);
    }

    /**
     * 查询集群详情信息
     *
     * 查询集群详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataServiceInstanceRequest 请求对象
     * @return ShowDataServiceInstanceResponse
     */
    public ShowDataServiceInstanceResponse showDataServiceInstance(ShowDataServiceInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDataServiceInstance);
    }

    /**
     * 查询集群详情信息
     *
     * 查询集群详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataServiceInstanceRequest 请求对象
     * @return SyncInvoker<ShowDataServiceInstanceRequest, ShowDataServiceInstanceResponse>
     */
    public SyncInvoker<ShowDataServiceInstanceRequest, ShowDataServiceInstanceResponse> showDataServiceInstanceInvoker(
        ShowDataServiceInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDataServiceInstance, hcClient);
    }

    /**
     * 资产搜索
     *
     * 资产搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataSetsRequest 请求对象
     * @return ShowDataSetsResponse
     */
    public ShowDataSetsResponse showDataSets(ShowDataSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDataSets);
    }

    /**
     * 资产搜索
     *
     * 资产搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataSetsRequest 请求对象
     * @return SyncInvoker<ShowDataSetsRequest, ShowDataSetsResponse>
     */
    public SyncInvoker<ShowDataSetsRequest, ShowDataSetsResponse> showDataSetsInvoker(ShowDataSetsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDataSets, hcClient);
    }

    /**
     * 查询单个数据连接信息
     *
     * 查询单个数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataconnectionRequest 请求对象
     * @return ShowDataconnectionResponse
     */
    public ShowDataconnectionResponse showDataconnection(ShowDataconnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDataconnection);
    }

    /**
     * 查询单个数据连接信息
     *
     * 查询单个数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataconnectionRequest 请求对象
     * @return SyncInvoker<ShowDataconnectionRequest, ShowDataconnectionResponse>
     */
    public SyncInvoker<ShowDataconnectionRequest, ShowDataconnectionResponse> showDataconnectionInvoker(
        ShowDataconnectionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDataconnection, hcClient);
    }

    /**
     * 资产血缘(邀测)
     *
     * 资产血缘接口，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatamapLineageRequest 请求对象
     * @return ShowDatamapLineageResponse
     */
    public ShowDatamapLineageResponse showDatamapLineage(ShowDatamapLineageRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDatamapLineage);
    }

    /**
     * 资产血缘(邀测)
     *
     * 资产血缘接口，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatamapLineageRequest 请求对象
     * @return SyncInvoker<ShowDatamapLineageRequest, ShowDatamapLineageResponse>
     */
    public SyncInvoker<ShowDatamapLineageRequest, ShowDatamapLineageResponse> showDatamapLineageInvoker(
        ShowDatamapLineageRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDatamapLineage, hcClient);
    }

    /**
     * 查看衍生指标详情
     *
     * 通过ID获取衍生详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDerivativeIndexByIdRequest 请求对象
     * @return ShowDerivativeIndexByIdResponse
     */
    public ShowDerivativeIndexByIdResponse showDerivativeIndexById(ShowDerivativeIndexByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDerivativeIndexById);
    }

    /**
     * 查看衍生指标详情
     *
     * 通过ID获取衍生详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDerivativeIndexByIdRequest 请求对象
     * @return SyncInvoker<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse>
     */
    public SyncInvoker<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse> showDerivativeIndexByIdInvoker(
        ShowDerivativeIndexByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDerivativeIndexById, hcClient);
    }

    /**
     * 获取操作结果
     *
     * 获取批量操作的结果，如逻辑模型转物理模型和逆向数据库操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesignOperationResultRequest 请求对象
     * @return ShowDesignOperationResultResponse
     */
    public ShowDesignOperationResultResponse showDesignOperationResult(ShowDesignOperationResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDesignOperationResult);
    }

    /**
     * 获取操作结果
     *
     * 获取批量操作的结果，如逻辑模型转物理模型和逆向数据库操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesignOperationResultRequest 请求对象
     * @return SyncInvoker<ShowDesignOperationResultRequest, ShowDesignOperationResultResponse>
     */
    public SyncInvoker<ShowDesignOperationResultRequest, ShowDesignOperationResultResponse> showDesignOperationResultInvoker(
        ShowDesignOperationResultRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDesignOperationResult, hcClient);
    }

    /**
     * 查看维度详情
     *
     * 通过ID查看维度详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDimensionByIdRequest 请求对象
     * @return ShowDimensionByIdResponse
     */
    public ShowDimensionByIdResponse showDimensionById(ShowDimensionByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDimensionById);
    }

    /**
     * 查看维度详情
     *
     * 通过ID查看维度详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDimensionByIdRequest 请求对象
     * @return SyncInvoker<ShowDimensionByIdRequest, ShowDimensionByIdResponse>
     */
    public SyncInvoker<ShowDimensionByIdRequest, ShowDimensionByIdResponse> showDimensionByIdInvoker(
        ShowDimensionByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDimensionById, hcClient);
    }

    /**
     * 查看维度表详情
     *
     * 通过ID查看维度表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDimensionLogicTableByIdRequest 请求对象
     * @return ShowDimensionLogicTableByIdResponse
     */
    public ShowDimensionLogicTableByIdResponse showDimensionLogicTableById(ShowDimensionLogicTableByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDimensionLogicTableById);
    }

    /**
     * 查看维度表详情
     *
     * 通过ID查看维度表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDimensionLogicTableByIdRequest 请求对象
     * @return SyncInvoker<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse>
     */
    public SyncInvoker<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse> showDimensionLogicTableByIdInvoker(
        ShowDimensionLogicTableByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showDimensionLogicTableById, hcClient);
    }

    /**
     * 查询技术资产
     *
     * 查询技术资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntitiesRequest 请求对象
     * @return ShowEntitiesResponse
     */
    public ShowEntitiesResponse showEntities(ShowEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showEntities);
    }

    /**
     * 查询技术资产
     *
     * 查询技术资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntitiesRequest 请求对象
     * @return SyncInvoker<ShowEntitiesRequest, ShowEntitiesResponse>
     */
    public SyncInvoker<ShowEntitiesRequest, ShowEntitiesResponse> showEntitiesInvoker(ShowEntitiesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showEntities, hcClient);
    }

    /**
     * 根据guid获取资产详情
     *
     * 根据表guid可以获取表的详情信息，表的详情信息包含column的信息，也可以根据column的guid直接获取column的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntityInfoByGuidRequest 请求对象
     * @return ShowEntityInfoByGuidResponse
     */
    public ShowEntityInfoByGuidResponse showEntityInfoByGuid(ShowEntityInfoByGuidRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showEntityInfoByGuid);
    }

    /**
     * 根据guid获取资产详情
     *
     * 根据表guid可以获取表的详情信息，表的详情信息包含column的信息，也可以根据column的guid直接获取column的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntityInfoByGuidRequest 请求对象
     * @return SyncInvoker<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse>
     */
    public SyncInvoker<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse> showEntityInfoByGuidInvoker(
        ShowEntityInfoByGuidRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showEntityInfoByGuid, hcClient);
    }

    /**
     * 查看事实表详情
     *
     * 通过ID查看事实表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactLogicTableByIdRequest 请求对象
     * @return ShowFactLogicTableByIdResponse
     */
    public ShowFactLogicTableByIdResponse showFactLogicTableById(ShowFactLogicTableByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showFactLogicTableById);
    }

    /**
     * 查看事实表详情
     *
     * 通过ID查看事实表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactLogicTableByIdRequest 请求对象
     * @return SyncInvoker<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse>
     */
    public SyncInvoker<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse> showFactLogicTableByIdInvoker(
        ShowFactLogicTableByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showFactLogicTableById, hcClient);
    }

    /**
     * 查询环境变量信息
     *
     * 查询环境变量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryEnvRequest 请求对象
     * @return ShowFactoryEnvResponse
     */
    public ShowFactoryEnvResponse showFactoryEnv(ShowFactoryEnvRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showFactoryEnv);
    }

    /**
     * 查询环境变量信息
     *
     * 查询环境变量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryEnvRequest 请求对象
     * @return SyncInvoker<ShowFactoryEnvRequest, ShowFactoryEnvResponse>
     */
    public SyncInvoker<ShowFactoryEnvRequest, ShowFactoryEnvResponse> showFactoryEnvInvoker(
        ShowFactoryEnvRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showFactoryEnv, hcClient);
    }

    /**
     * 全局搜索
     *
     * 全局搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryFullTextRequest 请求对象
     * @return ShowFactoryFullTextResponse
     */
    public ShowFactoryFullTextResponse showFactoryFullText(ShowFactoryFullTextRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showFactoryFullText);
    }

    /**
     * 全局搜索
     *
     * 全局搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryFullTextRequest 请求对象
     * @return SyncInvoker<ShowFactoryFullTextRequest, ShowFactoryFullTextResponse>
     */
    public SyncInvoker<ShowFactoryFullTextRequest, ShowFactoryFullTextResponse> showFactoryFullTextInvoker(
        ShowFactoryFullTextRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showFactoryFullText, hcClient);
    }

    /**
     * 查询指定发布包详情
     *
     * 查询指定发布包详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryPackageDetailRequest 请求对象
     * @return ShowFactoryPackageDetailResponse
     */
    public ShowFactoryPackageDetailResponse showFactoryPackageDetail(ShowFactoryPackageDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showFactoryPackageDetail);
    }

    /**
     * 查询指定发布包详情
     *
     * 查询指定发布包详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryPackageDetailRequest 请求对象
     * @return SyncInvoker<ShowFactoryPackageDetailRequest, ShowFactoryPackageDetailResponse>
     */
    public SyncInvoker<ShowFactoryPackageDetailRequest, ShowFactoryPackageDetailResponse> showFactoryPackageDetailInvoker(
        ShowFactoryPackageDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showFactoryPackageDetail, hcClient);
    }

    /**
     * 查询补数据实例
     *
     * 查询补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorySupplementDataRequest 请求对象
     * @return ShowFactorySupplementDataResponse
     */
    public ShowFactorySupplementDataResponse showFactorySupplementData(ShowFactorySupplementDataRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showFactorySupplementData);
    }

    /**
     * 查询补数据实例
     *
     * 查询补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorySupplementDataRequest 请求对象
     * @return SyncInvoker<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse>
     */
    public SyncInvoker<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse> showFactorySupplementDataInvoker(
        ShowFactorySupplementDataRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showFactorySupplementData, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlossaryListRequest 请求对象
     * @return ShowGlossaryListResponse
     */
    public ShowGlossaryListResponse showGlossaryList(ShowGlossaryListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showGlossaryList);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlossaryListRequest 请求对象
     * @return SyncInvoker<ShowGlossaryListRequest, ShowGlossaryListResponse>
     */
    public SyncInvoker<ShowGlossaryListRequest, ShowGlossaryListResponse> showGlossaryListInvoker(
        ShowGlossaryListRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showGlossaryList, hcClient);
    }

    /**
     * 产出信息(邀测)
     *
     * 查询表相关的作业算子运行实例信息，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInfosRequest 请求对象
     * @return ShowInstanceInfosResponse
     */
    public ShowInstanceInfosResponse showInstanceInfos(ShowInstanceInfosRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showInstanceInfos);
    }

    /**
     * 产出信息(邀测)
     *
     * 查询表相关的作业算子运行实例信息，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInfosRequest 请求对象
     * @return SyncInvoker<ShowInstanceInfosRequest, ShowInstanceInfosResponse>
     */
    public SyncInvoker<ShowInstanceInfosRequest, ShowInstanceInfosResponse> showInstanceInfosInvoker(
        ShowInstanceInfosRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showInstanceInfos, hcClient);
    }

    /**
     * 获取任务日志
     *
     * 获取任务日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceLogRequest 请求对象
     * @return ShowInstanceLogResponse
     */
    public ShowInstanceLogResponse showInstanceLog(ShowInstanceLogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showInstanceLog);
    }

    /**
     * 获取任务日志
     *
     * 获取任务日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceLogRequest 请求对象
     * @return SyncInvoker<ShowInstanceLogRequest, ShowInstanceLogResponse>
     */
    public SyncInvoker<ShowInstanceLogRequest, ShowInstanceLogResponse> showInstanceLogInvoker(
        ShowInstanceLogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showInstanceLog, hcClient);
    }

    /**
     * 获取实例结果
     *
     * 获取实例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceResultRequest 请求对象
     * @return ShowInstanceResultResponse
     */
    public ShowInstanceResultResponse showInstanceResult(ShowInstanceResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showInstanceResult);
    }

    /**
     * 获取实例结果
     *
     * 获取实例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceResultRequest 请求对象
     * @return SyncInvoker<ShowInstanceResultRequest, ShowInstanceResultResponse>
     */
    public SyncInvoker<ShowInstanceResultRequest, ShowInstanceResultResponse> showInstanceResultInvoker(
        ShowInstanceResultRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showInstanceResult, hcClient);
    }

    /**
     * 血缘查询
     *
     * 血缘查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineageRequest 请求对象
     * @return ShowLineageResponse
     */
    public ShowLineageResponse showLineage(ShowLineageRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showLineage);
    }

    /**
     * 血缘查询
     *
     * 血缘查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineageRequest 请求对象
     * @return SyncInvoker<ShowLineageRequest, ShowLineageResponse>
     */
    public SyncInvoker<ShowLineageRequest, ShowLineageResponse> showLineageInvoker(ShowLineageRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showLineage, hcClient);
    }

    /**
     * 批量血缘(邀测)
     *
     * 批量血缘接口，根据作业算子分页批量查询血缘。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineageBulkRequest 请求对象
     * @return ShowLineageBulkResponse
     */
    public ShowLineageBulkResponse showLineageBulk(ShowLineageBulkRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showLineageBulk);
    }

    /**
     * 批量血缘(邀测)
     *
     * 批量血缘接口，根据作业算子分页批量查询血缘。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineageBulkRequest 请求对象
     * @return SyncInvoker<ShowLineageBulkRequest, ShowLineageBulkResponse>
     */
    public SyncInvoker<ShowLineageBulkRequest, ShowLineageBulkResponse> showLineageBulkInvoker(
        ShowLineageBulkRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showLineageBulk, hcClient);
    }

    /**
     * 获取消息详情
     *
     * 获取消息详情。此功能仅用作信息详情展示，不用做业务处理，因此不展示编号等后台参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageDetailRequest 请求对象
     * @return ShowMessageDetailResponse
     */
    public ShowMessageDetailResponse showMessageDetail(ShowMessageDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showMessageDetail);
    }

    /**
     * 获取消息详情
     *
     * 获取消息详情。此功能仅用作信息详情展示，不用做业务处理，因此不展示编号等后台参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageDetailRequest 请求对象
     * @return SyncInvoker<ShowMessageDetailRequest, ShowMessageDetailResponse>
     */
    public SyncInvoker<ShowMessageDetailRequest, ShowMessageDetailResponse> showMessageDetailInvoker(
        ShowMessageDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showMessageDetail, hcClient);
    }

    /**
     * 查询指标资产
     *
     * 指标资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricAssetsRequest 请求对象
     * @return ShowMetricAssetsResponse
     */
    public ShowMetricAssetsResponse showMetricAssets(ShowMetricAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showMetricAssets);
    }

    /**
     * 查询指标资产
     *
     * 指标资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricAssetsRequest 请求对象
     * @return SyncInvoker<ShowMetricAssetsRequest, ShowMetricAssetsResponse>
     */
    public SyncInvoker<ShowMetricAssetsRequest, ShowMetricAssetsResponse> showMetricAssetsInvoker(
        ShowMetricAssetsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showMetricAssets, hcClient);
    }

    /**
     * 查询指标资产目录树
     *
     * 查询指标资产目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricTreeRequest 请求对象
     * @return ShowMetricTreeResponse
     */
    public ShowMetricTreeResponse showMetricTree(ShowMetricTreeRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showMetricTree);
    }

    /**
     * 查询指标资产目录树
     *
     * 查询指标资产目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricTreeRequest 请求对象
     * @return SyncInvoker<ShowMetricTreeRequest, ShowMetricTreeResponse>
     */
    public SyncInvoker<ShowMetricTreeRequest, ShowMetricTreeResponse> showMetricTreeInvoker(
        ShowMetricTreeRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showMetricTree, hcClient);
    }

    /**
     * 表关联作业算子列表(邀测)
     *
     * 查询表相关的作业算子列表，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodesRequest 请求对象
     * @return ShowNodesResponse
     */
    public ShowNodesResponse showNodes(ShowNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showNodes);
    }

    /**
     * 表关联作业算子列表(邀测)
     *
     * 查询表相关的作业算子列表，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodesRequest 请求对象
     * @return SyncInvoker<ShowNodesRequest, ShowNodesResponse>
     */
    public SyncInvoker<ShowNodesRequest, ShowNodesResponse> showNodesInvoker(ShowNodesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showNodes, hcClient);
    }

    /**
     * 通过id获取路径
     *
     * 通过id获取路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPathByIdRequest 请求对象
     * @return ShowPathByIdResponse
     */
    public ShowPathByIdResponse showPathById(ShowPathByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showPathById);
    }

    /**
     * 通过id获取路径
     *
     * 通过id获取路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPathByIdRequest 请求对象
     * @return SyncInvoker<ShowPathByIdRequest, ShowPathByIdResponse>
     */
    public SyncInvoker<ShowPathByIdRequest, ShowPathByIdResponse> showPathByIdInvoker(ShowPathByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showPathById, hcClient);
    }

    /**
     * 通过id获取路径对象
     *
     * 通过目录id获取路径对象。  
     * 通过目录id获取从根目录至当前目录链路上每一层的路径信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPathObjectByIdRequest 请求对象
     * @return ShowPathObjectByIdResponse
     */
    public ShowPathObjectByIdResponse showPathObjectById(ShowPathObjectByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showPathObjectById);
    }

    /**
     * 通过id获取路径对象
     *
     * 通过目录id获取路径对象。  
     * 通过目录id获取从根目录至当前目录链路上每一层的路径信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPathObjectByIdRequest 请求对象
     * @return SyncInvoker<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse>
     */
    public SyncInvoker<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse> showPathObjectByIdInvoker(
        ShowPathObjectByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showPathObjectById, hcClient);
    }

    /**
     * 获取质量作业详情
     *
     * 获取质量作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQualityTaskDetailRequest 请求对象
     * @return ShowQualityTaskDetailResponse
     */
    public ShowQualityTaskDetailResponse showQualityTaskDetail(ShowQualityTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showQualityTaskDetail);
    }

    /**
     * 获取质量作业详情
     *
     * 获取质量作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQualityTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse>
     */
    public SyncInvoker<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse> showQualityTaskDetailInvoker(
        ShowQualityTaskDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showQualityTaskDetail, hcClient);
    }

    /**
     * 获取队列(邀测)
     *
     * 队列列表，展示10条数据，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueuesRequest 请求对象
     * @return ShowQueuesResponse
     */
    public ShowQueuesResponse showQueues(ShowQueuesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showQueues);
    }

    /**
     * 获取队列(邀测)
     *
     * 队列列表，展示10条数据，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueuesRequest 请求对象
     * @return SyncInvoker<ShowQueuesRequest, ShowQueuesResponse>
     */
    public SyncInvoker<ShowQueuesRequest, ShowQueuesResponse> showQueuesInvoker(ShowQueuesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showQueues, hcClient);
    }

    /**
     * 查看关系详情
     *
     * 通过ID获取关系详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelationByIdRequest 请求对象
     * @return ShowRelationByIdResponse
     */
    public ShowRelationByIdResponse showRelationById(ShowRelationByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showRelationById);
    }

    /**
     * 查看关系详情
     *
     * 通过ID获取关系详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelationByIdRequest 请求对象
     * @return SyncInvoker<ShowRelationByIdRequest, ShowRelationByIdResponse>
     */
    public SyncInvoker<ShowRelationByIdRequest, ShowRelationByIdResponse> showRelationByIdInvoker(
        ShowRelationByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showRelationById, hcClient);
    }

    /**
     * 查看安全管理员
     *
     * 查看安全管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityAdminRequest 请求对象
     * @return ShowSecurityAdminResponse
     */
    public ShowSecurityAdminResponse showSecurityAdmin(ShowSecurityAdminRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityAdmin);
    }

    /**
     * 查看安全管理员
     *
     * 查看安全管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityAdminRequest 请求对象
     * @return SyncInvoker<ShowSecurityAdminRequest, ShowSecurityAdminResponse>
     */
    public SyncInvoker<ShowSecurityAdminRequest, ShowSecurityAdminResponse> showSecurityAdminInvoker(
        ShowSecurityAdminRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityAdmin, hcClient);
    }

    /**
     * 查询特定识别规则
     *
     * 查询特定识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDataClassificationRuleRequest 请求对象
     * @return ShowSecurityDataClassificationRuleResponse
     */
    public ShowSecurityDataClassificationRuleResponse showSecurityDataClassificationRule(
        ShowSecurityDataClassificationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityDataClassificationRule);
    }

    /**
     * 查询特定识别规则
     *
     * 查询特定识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDataClassificationRuleRequest 请求对象
     * @return SyncInvoker<ShowSecurityDataClassificationRuleRequest, ShowSecurityDataClassificationRuleResponse>
     */
    public SyncInvoker<ShowSecurityDataClassificationRuleRequest, ShowSecurityDataClassificationRuleResponse> showSecurityDataClassificationRuleInvoker(
        ShowSecurityDataClassificationRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityDataClassificationRule, hcClient);
    }

    /**
     * 查询规则组
     *
     * 查询规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDataClassificationRuleGroupRequest 请求对象
     * @return ShowSecurityDataClassificationRuleGroupResponse
     */
    public ShowSecurityDataClassificationRuleGroupResponse showSecurityDataClassificationRuleGroup(
        ShowSecurityDataClassificationRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityDataClassificationRuleGroup);
    }

    /**
     * 查询规则组
     *
     * 查询规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDataClassificationRuleGroupRequest 请求对象
     * @return SyncInvoker<ShowSecurityDataClassificationRuleGroupRequest, ShowSecurityDataClassificationRuleGroupResponse>
     */
    public SyncInvoker<ShowSecurityDataClassificationRuleGroupRequest, ShowSecurityDataClassificationRuleGroupResponse> showSecurityDataClassificationRuleGroupInvoker(
        ShowSecurityDataClassificationRuleGroupRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityDataClassificationRuleGroup, hcClient);
    }

    /**
     * 查询数据源防护模块诊断结果
     *
     * 查询数据源防护模块诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDatasourceProtectionDiagnoseResultRequest 请求对象
     * @return ShowSecurityDatasourceProtectionDiagnoseResultResponse
     */
    public ShowSecurityDatasourceProtectionDiagnoseResultResponse showSecurityDatasourceProtectionDiagnoseResult(
        ShowSecurityDatasourceProtectionDiagnoseResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityDatasourceProtectionDiagnoseResult);
    }

    /**
     * 查询数据源防护模块诊断结果
     *
     * 查询数据源防护模块诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDatasourceProtectionDiagnoseResultRequest 请求对象
     * @return SyncInvoker<ShowSecurityDatasourceProtectionDiagnoseResultRequest, ShowSecurityDatasourceProtectionDiagnoseResultResponse>
     */
    public SyncInvoker<ShowSecurityDatasourceProtectionDiagnoseResultRequest, ShowSecurityDatasourceProtectionDiagnoseResultResponse> showSecurityDatasourceProtectionDiagnoseResultInvoker(
        ShowSecurityDatasourceProtectionDiagnoseResultRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityDatasourceProtectionDiagnoseResult, hcClient);
    }

    /**
     * 查询某个脱敏策略的详细信息
     *
     * 查询某个脱敏策略的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDynamicMaskingPolicyRequest 请求对象
     * @return ShowSecurityDynamicMaskingPolicyResponse
     */
    public ShowSecurityDynamicMaskingPolicyResponse showSecurityDynamicMaskingPolicy(
        ShowSecurityDynamicMaskingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityDynamicMaskingPolicy);
    }

    /**
     * 查询某个脱敏策略的详细信息
     *
     * 查询某个脱敏策略的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDynamicMaskingPolicyRequest 请求对象
     * @return SyncInvoker<ShowSecurityDynamicMaskingPolicyRequest, ShowSecurityDynamicMaskingPolicyResponse>
     */
    public SyncInvoker<ShowSecurityDynamicMaskingPolicyRequest, ShowSecurityDynamicMaskingPolicyResponse> showSecurityDynamicMaskingPolicyInvoker(
        ShowSecurityDynamicMaskingPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityDynamicMaskingPolicy, hcClient);
    }

    /**
     * 查询单个用户同步任务
     *
     * 查询单个用户同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityMemberSyncTaskRequest 请求对象
     * @return ShowSecurityMemberSyncTaskResponse
     */
    public ShowSecurityMemberSyncTaskResponse showSecurityMemberSyncTask(ShowSecurityMemberSyncTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityMemberSyncTask);
    }

    /**
     * 查询单个用户同步任务
     *
     * 查询单个用户同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityMemberSyncTaskRequest 请求对象
     * @return SyncInvoker<ShowSecurityMemberSyncTaskRequest, ShowSecurityMemberSyncTaskResponse>
     */
    public SyncInvoker<ShowSecurityMemberSyncTaskRequest, ShowSecurityMemberSyncTaskResponse> showSecurityMemberSyncTaskInvoker(
        ShowSecurityMemberSyncTaskRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityMemberSyncTask, hcClient);
    }

    /**
     * 查询未进行静态脱敏任务的表信息
     *
     * 查询未进行静态脱敏任务的表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityNoMaskingTableResultRequest 请求对象
     * @return ShowSecurityNoMaskingTableResultResponse
     */
    public ShowSecurityNoMaskingTableResultResponse showSecurityNoMaskingTableResult(
        ShowSecurityNoMaskingTableResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityNoMaskingTableResult);
    }

    /**
     * 查询未进行静态脱敏任务的表信息
     *
     * 查询未进行静态脱敏任务的表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityNoMaskingTableResultRequest 请求对象
     * @return SyncInvoker<ShowSecurityNoMaskingTableResultRequest, ShowSecurityNoMaskingTableResultResponse>
     */
    public SyncInvoker<ShowSecurityNoMaskingTableResultRequest, ShowSecurityNoMaskingTableResultResponse> showSecurityNoMaskingTableResultInvoker(
        ShowSecurityNoMaskingTableResultRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityNoMaskingTableResult, hcClient);
    }

    /**
     * 查询数据权限控制模块诊断结果
     *
     * 查询数据权限控制模块诊断结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPermissionManagementDiagnoseResultRequest 请求对象
     * @return ShowSecurityPermissionManagementDiagnoseResultResponse
     */
    public ShowSecurityPermissionManagementDiagnoseResultResponse showSecurityPermissionManagementDiagnoseResult(
        ShowSecurityPermissionManagementDiagnoseResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityPermissionManagementDiagnoseResult);
    }

    /**
     * 查询数据权限控制模块诊断结果
     *
     * 查询数据权限控制模块诊断结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPermissionManagementDiagnoseResultRequest 请求对象
     * @return SyncInvoker<ShowSecurityPermissionManagementDiagnoseResultRequest, ShowSecurityPermissionManagementDiagnoseResultResponse>
     */
    public SyncInvoker<ShowSecurityPermissionManagementDiagnoseResultRequest, ShowSecurityPermissionManagementDiagnoseResultResponse> showSecurityPermissionManagementDiagnoseResultInvoker(
        ShowSecurityPermissionManagementDiagnoseResultRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityPermissionManagementDiagnoseResult, hcClient);
    }

    /**
     * 查询权限集
     *
     * 查询权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPermissionSetRequest 请求对象
     * @return ShowSecurityPermissionSetResponse
     */
    public ShowSecurityPermissionSetResponse showSecurityPermissionSet(ShowSecurityPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityPermissionSet);
    }

    /**
     * 查询权限集
     *
     * 查询权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPermissionSetRequest 请求对象
     * @return SyncInvoker<ShowSecurityPermissionSetRequest, ShowSecurityPermissionSetResponse>
     */
    public SyncInvoker<ShowSecurityPermissionSetRequest, ShowSecurityPermissionSetResponse> showSecurityPermissionSetInvoker(
        ShowSecurityPermissionSetRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityPermissionSet, hcClient);
    }

    /**
     * 查询单个资源权限策略
     *
     * 查询单个资源权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityResourcePermissionPolicyRequest 请求对象
     * @return ShowSecurityResourcePermissionPolicyResponse
     */
    public ShowSecurityResourcePermissionPolicyResponse showSecurityResourcePermissionPolicy(
        ShowSecurityResourcePermissionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecurityResourcePermissionPolicy);
    }

    /**
     * 查询单个资源权限策略
     *
     * 查询单个资源权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityResourcePermissionPolicyRequest 请求对象
     * @return SyncInvoker<ShowSecurityResourcePermissionPolicyRequest, ShowSecurityResourcePermissionPolicyResponse>
     */
    public SyncInvoker<ShowSecurityResourcePermissionPolicyRequest, ShowSecurityResourcePermissionPolicyResponse> showSecurityResourcePermissionPolicyInvoker(
        ShowSecurityResourcePermissionPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecurityResourcePermissionPolicy, hcClient);
    }

    /**
     * 根据指定的id查询密级
     *
     * 根据指定的id查询密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecuritySecrecyLevelRequest 请求对象
     * @return ShowSecuritySecrecyLevelResponse
     */
    public ShowSecuritySecrecyLevelResponse showSecuritySecrecyLevel(ShowSecuritySecrecyLevelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecuritySecrecyLevel);
    }

    /**
     * 根据指定的id查询密级
     *
     * 根据指定的id查询密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecuritySecrecyLevelRequest 请求对象
     * @return SyncInvoker<ShowSecuritySecrecyLevelRequest, ShowSecuritySecrecyLevelResponse>
     */
    public SyncInvoker<ShowSecuritySecrecyLevelRequest, ShowSecuritySecrecyLevelResponse> showSecuritySecrecyLevelInvoker(
        ShowSecuritySecrecyLevelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecuritySecrecyLevel, hcClient);
    }

    /**
     * 查询敏感数据保护模块诊断结果
     *
     * 查询敏感数据保护模块诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecuritySensitiveDataDiagnoseResultRequest 请求对象
     * @return ShowSecuritySensitiveDataDiagnoseResultResponse
     */
    public ShowSecuritySensitiveDataDiagnoseResultResponse showSecuritySensitiveDataDiagnoseResult(
        ShowSecuritySensitiveDataDiagnoseResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showSecuritySensitiveDataDiagnoseResult);
    }

    /**
     * 查询敏感数据保护模块诊断结果
     *
     * 查询敏感数据保护模块诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecuritySensitiveDataDiagnoseResultRequest 请求对象
     * @return SyncInvoker<ShowSecuritySensitiveDataDiagnoseResultRequest, ShowSecuritySensitiveDataDiagnoseResultResponse>
     */
    public SyncInvoker<ShowSecuritySensitiveDataDiagnoseResultRequest, ShowSecuritySensitiveDataDiagnoseResultResponse> showSecuritySensitiveDataDiagnoseResultInvoker(
        ShowSecuritySensitiveDataDiagnoseResultRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showSecuritySensitiveDataDiagnoseResult, hcClient);
    }

    /**
     * 查看数据标准详情
     *
     * 通过ID获取数据标准详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardByIdRequest 请求对象
     * @return ShowStandardByIdResponse
     */
    public ShowStandardByIdResponse showStandardById(ShowStandardByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showStandardById);
    }

    /**
     * 查看数据标准详情
     *
     * 通过ID获取数据标准详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardByIdRequest 请求对象
     * @return SyncInvoker<ShowStandardByIdRequest, ShowStandardByIdResponse>
     */
    public SyncInvoker<ShowStandardByIdRequest, ShowStandardByIdResponse> showStandardByIdInvoker(
        ShowStandardByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showStandardById, hcClient);
    }

    /**
     * 查询数据标准模板
     *
     * 查询当前工作空间下的数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardTemplateRequest 请求对象
     * @return ShowStandardTemplateResponse
     */
    public ShowStandardTemplateResponse showStandardTemplate(ShowStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showStandardTemplate);
    }

    /**
     * 查询数据标准模板
     *
     * 查询当前工作空间下的数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardTemplateRequest 请求对象
     * @return SyncInvoker<ShowStandardTemplateRequest, ShowStandardTemplateResponse>
     */
    public SyncInvoker<ShowStandardTemplateRequest, ShowStandardTemplateResponse> showStandardTemplateInvoker(
        ShowStandardTemplateRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showStandardTemplate, hcClient);
    }

    /**
     * 数据预览(邀测)
     *
     * 表数据预览，展示10条数据，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableDataRequest 请求对象
     * @return ShowTableDataResponse
     */
    public ShowTableDataResponse showTableData(ShowTableDataRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showTableData);
    }

    /**
     * 数据预览(邀测)
     *
     * 表数据预览，展示10条数据，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableDataRequest 请求对象
     * @return SyncInvoker<ShowTableDataRequest, ShowTableDataResponse>
     */
    public SyncInvoker<ShowTableDataRequest, ShowTableDataResponse> showTableDataInvoker(ShowTableDataRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showTableData, hcClient);
    }

    /**
     * 查看表模型详情
     *
     * 通过ID获取模型表详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableModelByIdRequest 请求对象
     * @return ShowTableModelByIdResponse
     */
    public ShowTableModelByIdResponse showTableModelById(ShowTableModelByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showTableModelById);
    }

    /**
     * 查看表模型详情
     *
     * 通过ID获取模型表详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableModelByIdRequest 请求对象
     * @return SyncInvoker<ShowTableModelByIdRequest, ShowTableModelByIdResponse>
     */
    public SyncInvoker<ShowTableModelByIdRequest, ShowTableModelByIdResponse> showTableModelByIdInvoker(
        ShowTableModelByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showTableModelById, hcClient);
    }

    /**
     * 搜索查询标签分页展示
     *
     * 搜索查询标签分页展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return ShowTagsResponse
     */
    public ShowTagsResponse showTags(ShowTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showTags);
    }

    /**
     * 搜索查询标签分页展示
     *
     * 搜索查询标签分页展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return SyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public SyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsInvoker(ShowTagsRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showTags, hcClient);
    }

    /**
     * 查询采集任务详情
     *
     * 查询采集任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInfoRequest 请求对象
     * @return ShowTaskInfoResponse
     */
    public ShowTaskInfoResponse showTaskInfo(ShowTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showTaskInfo);
    }

    /**
     * 查询采集任务详情
     *
     * 查询采集任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse>
     */
    public SyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse> showTaskInfoInvoker(ShowTaskInfoRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showTaskInfo, hcClient);
    }

    /**
     * 查询采集任务列表
     *
     * 查询采集任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskListRequest 请求对象
     * @return ShowTaskListResponse
     */
    public ShowTaskListResponse showTaskList(ShowTaskListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showTaskList);
    }

    /**
     * 查询采集任务列表
     *
     * 查询采集任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskListRequest 请求对象
     * @return SyncInvoker<ShowTaskListRequest, ShowTaskListResponse>
     */
    public SyncInvoker<ShowTaskListRequest, ShowTaskListResponse> showTaskListInvoker(ShowTaskListRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showTaskList, hcClient);
    }

    /**
     * 获取技术资产统计信息
     *
     * 获取技术资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTechnicalAssetsStatisticRequest 请求对象
     * @return ShowTechnicalAssetsStatisticResponse
     */
    public ShowTechnicalAssetsStatisticResponse showTechnicalAssetsStatistic(
        ShowTechnicalAssetsStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showTechnicalAssetsStatistic);
    }

    /**
     * 获取技术资产统计信息
     *
     * 获取技术资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTechnicalAssetsStatisticRequest 请求对象
     * @return SyncInvoker<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse>
     */
    public SyncInvoker<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse> showTechnicalAssetsStatisticInvoker(
        ShowTechnicalAssetsStatisticRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showTechnicalAssetsStatistic, hcClient);
    }

    /**
     * 获取规则模板详情
     *
     * 获取规则模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplatesDetailRequest 请求对象
     * @return ShowTemplatesDetailResponse
     */
    public ShowTemplatesDetailResponse showTemplatesDetail(ShowTemplatesDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showTemplatesDetail);
    }

    /**
     * 获取规则模板详情
     *
     * 获取规则模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplatesDetailRequest 请求对象
     * @return SyncInvoker<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse>
     */
    public SyncInvoker<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse> showTemplatesDetailInvoker(
        ShowTemplatesDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showTemplatesDetail, hcClient);
    }

    /**
     * 无血缘关系表查询
     *
     * 无血缘关系表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUnrelatedTableRequest 请求对象
     * @return ShowUnrelatedTableResponse
     */
    public ShowUnrelatedTableResponse showUnrelatedTable(ShowUnrelatedTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showUnrelatedTable);
    }

    /**
     * 无血缘关系表查询
     *
     * 无血缘关系表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUnrelatedTableRequest 请求对象
     * @return SyncInvoker<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse>
     */
    public SyncInvoker<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse> showUnrelatedTableInvoker(
        ShowUnrelatedTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showUnrelatedTable, hcClient);
    }

    /**
     * 获取单个工作空间信息
     *
     * 获取单个工作空间信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkSpaceRequest 请求对象
     * @return ShowWorkSpaceResponse
     */
    public ShowWorkSpaceResponse showWorkSpace(ShowWorkSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showWorkSpace);
    }

    /**
     * 获取单个工作空间信息
     *
     * 获取单个工作空间信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkSpaceRequest 请求对象
     * @return SyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse>
     */
    public SyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpaceInvoker(ShowWorkSpaceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showWorkSpace, hcClient);
    }

    /**
     * 查询模型详情
     *
     * 查询物理模型或逻辑模型的工作区空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceDetailByIdRequest 请求对象
     * @return ShowWorkspaceDetailByIdResponse
     */
    public ShowWorkspaceDetailByIdResponse showWorkspaceDetailById(ShowWorkspaceDetailByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showWorkspaceDetailById);
    }

    /**
     * 查询模型详情
     *
     * 查询物理模型或逻辑模型的工作区空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceDetailByIdRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse>
     */
    public SyncInvoker<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse> showWorkspaceDetailByIdInvoker(
        ShowWorkspaceDetailByIdRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showWorkspaceDetailById, hcClient);
    }

    /**
     * 停止补数据实例
     *
     * 停止补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFactorySupplementDataInstanceRequest 请求对象
     * @return StopFactorySupplementDataInstanceResponse
     */
    public StopFactorySupplementDataInstanceResponse stopFactorySupplementDataInstance(
        StopFactorySupplementDataInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.stopFactorySupplementDataInstance);
    }

    /**
     * 停止补数据实例
     *
     * 停止补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFactorySupplementDataInstanceRequest 请求对象
     * @return SyncInvoker<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse>
     */
    public SyncInvoker<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse> stopFactorySupplementDataInstanceInvoker(
        StopFactorySupplementDataInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.stopFactorySupplementDataInstance, hcClient);
    }

    /**
     * 撤回工单申请
     *
     * 撤回工单申请
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishSecurityApplicationRequest 请求对象
     * @return UnpublishSecurityApplicationResponse
     */
    public UnpublishSecurityApplicationResponse unpublishSecurityApplication(
        UnpublishSecurityApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.unpublishSecurityApplication);
    }

    /**
     * 撤回工单申请
     *
     * 撤回工单申请
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishSecurityApplicationRequest 请求对象
     * @return SyncInvoker<UnpublishSecurityApplicationRequest, UnpublishSecurityApplicationResponse>
     */
    public SyncInvoker<UnpublishSecurityApplicationRequest, UnpublishSecurityApplicationResponse> unpublishSecurityApplicationInvoker(
        UnpublishSecurityApplicationRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.unpublishSecurityApplication, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateApp);
    }

    /**
     * 更新应用
     *
     * 更新应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateApp, hcClient);
    }

    /**
     * 更新业务指标
     *
     * 更新业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBizMetricRequest 请求对象
     * @return UpdateBizMetricResponse
     */
    public UpdateBizMetricResponse updateBizMetric(UpdateBizMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateBizMetric);
    }

    /**
     * 更新业务指标
     *
     * 更新业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBizMetricRequest 请求对象
     * @return SyncInvoker<UpdateBizMetricRequest, UpdateBizMetricResponse>
     */
    public SyncInvoker<UpdateBizMetricRequest, UpdateBizMetricResponse> updateBizMetricInvoker(
        UpdateBizMetricRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateBizMetric, hcClient);
    }

    /**
     * 更新服务目录
     *
     * 更新服务目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCatalogRequest 请求对象
     * @return UpdateCatalogResponse
     */
    public UpdateCatalogResponse updateCatalog(UpdateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateCatalog);
    }

    /**
     * 更新服务目录
     *
     * 更新服务目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCatalogRequest 请求对象
     * @return SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>
     */
    public SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalogInvoker(UpdateCatalogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateCatalog, hcClient);
    }

    /**
     * 修改码表
     *
     * 修改码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeTableRequest 请求对象
     * @return UpdateCodeTableResponse
     */
    public UpdateCodeTableResponse updateCodeTable(UpdateCodeTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateCodeTable);
    }

    /**
     * 修改码表
     *
     * 修改码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeTableRequest 请求对象
     * @return SyncInvoker<UpdateCodeTableRequest, UpdateCodeTableResponse>
     */
    public SyncInvoker<UpdateCodeTableRequest, UpdateCodeTableResponse> updateCodeTableInvoker(
        UpdateCodeTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateCodeTable, hcClient);
    }

    /**
     * 编辑码表字段值
     *
     * 编辑码表字段值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeTableValuesRequest 请求对象
     * @return UpdateCodeTableValuesResponse
     */
    public UpdateCodeTableValuesResponse updateCodeTableValues(UpdateCodeTableValuesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateCodeTableValues);
    }

    /**
     * 编辑码表字段值
     *
     * 编辑码表字段值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeTableValuesRequest 请求对象
     * @return SyncInvoker<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse>
     */
    public SyncInvoker<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse> updateCodeTableValuesInvoker(
        UpdateCodeTableValuesRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateCodeTableValues, hcClient);
    }

    /**
     * 开启数据服务集群LTS日志转储
     *
     * 开启数据服务集群LTS日志转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataServiceInstanceLtsLogRequest 请求对象
     * @return UpdateDataServiceInstanceLtsLogResponse
     */
    public UpdateDataServiceInstanceLtsLogResponse updateDataServiceInstanceLtsLog(
        UpdateDataServiceInstanceLtsLogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDataServiceInstanceLtsLog);
    }

    /**
     * 开启数据服务集群LTS日志转储
     *
     * 开启数据服务集群LTS日志转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataServiceInstanceLtsLogRequest 请求对象
     * @return SyncInvoker<UpdateDataServiceInstanceLtsLogRequest, UpdateDataServiceInstanceLtsLogResponse>
     */
    public SyncInvoker<UpdateDataServiceInstanceLtsLogRequest, UpdateDataServiceInstanceLtsLogResponse> updateDataServiceInstanceLtsLogInvoker(
        UpdateDataServiceInstanceLtsLogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDataServiceInstanceLtsLog, hcClient);
    }

    /**
     * 开启数据服务集群OBS日志转储
     *
     * 开启数据服务集群OBS日志转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataServiceInstanceObsLogRequest 请求对象
     * @return UpdateDataServiceInstanceObsLogResponse
     */
    public UpdateDataServiceInstanceObsLogResponse updateDataServiceInstanceObsLog(
        UpdateDataServiceInstanceObsLogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDataServiceInstanceObsLog);
    }

    /**
     * 开启数据服务集群OBS日志转储
     *
     * 开启数据服务集群OBS日志转储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataServiceInstanceObsLogRequest 请求对象
     * @return SyncInvoker<UpdateDataServiceInstanceObsLogRequest, UpdateDataServiceInstanceObsLogResponse>
     */
    public SyncInvoker<UpdateDataServiceInstanceObsLogRequest, UpdateDataServiceInstanceObsLogResponse> updateDataServiceInstanceObsLogInvoker(
        UpdateDataServiceInstanceObsLogRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDataServiceInstanceObsLog, hcClient);
    }

    /**
     * 更新数据连接信息
     *
     * 更新数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataconnectionRequest 请求对象
     * @return UpdateDataconnectionResponse
     */
    public UpdateDataconnectionResponse updateDataconnection(UpdateDataconnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDataconnection);
    }

    /**
     * 更新数据连接信息
     *
     * 更新数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataconnectionRequest 请求对象
     * @return SyncInvoker<UpdateDataconnectionRequest, UpdateDataconnectionResponse>
     */
    public SyncInvoker<UpdateDataconnectionRequest, UpdateDataconnectionResponse> updateDataconnectionInvoker(
        UpdateDataconnectionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDataconnection, hcClient);
    }

    /**
     * 更新汇总表
     *
     * 更新汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignAggregationLogicTableRequest 请求对象
     * @return UpdateDesignAggregationLogicTableResponse
     */
    public UpdateDesignAggregationLogicTableResponse updateDesignAggregationLogicTable(
        UpdateDesignAggregationLogicTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDesignAggregationLogicTable);
    }

    /**
     * 更新汇总表
     *
     * 更新汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignAggregationLogicTableRequest 请求对象
     * @return SyncInvoker<UpdateDesignAggregationLogicTableRequest, UpdateDesignAggregationLogicTableResponse>
     */
    public SyncInvoker<UpdateDesignAggregationLogicTableRequest, UpdateDesignAggregationLogicTableResponse> updateDesignAggregationLogicTableInvoker(
        UpdateDesignAggregationLogicTableRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDesignAggregationLogicTable, hcClient);
    }

    /**
     * 更新原子指标
     *
     * 更新单个原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignAtomicIndexRequest 请求对象
     * @return UpdateDesignAtomicIndexResponse
     */
    public UpdateDesignAtomicIndexResponse updateDesignAtomicIndex(UpdateDesignAtomicIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDesignAtomicIndex);
    }

    /**
     * 更新原子指标
     *
     * 更新单个原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignAtomicIndexRequest 请求对象
     * @return SyncInvoker<UpdateDesignAtomicIndexRequest, UpdateDesignAtomicIndexResponse>
     */
    public SyncInvoker<UpdateDesignAtomicIndexRequest, UpdateDesignAtomicIndexResponse> updateDesignAtomicIndexInvoker(
        UpdateDesignAtomicIndexRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDesignAtomicIndex, hcClient);
    }

    /**
     * 更新复合指标
     *
     * 根据参数，更新复合指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignCompoundMetricRequest 请求对象
     * @return UpdateDesignCompoundMetricResponse
     */
    public UpdateDesignCompoundMetricResponse updateDesignCompoundMetric(UpdateDesignCompoundMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDesignCompoundMetric);
    }

    /**
     * 更新复合指标
     *
     * 根据参数，更新复合指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignCompoundMetricRequest 请求对象
     * @return SyncInvoker<UpdateDesignCompoundMetricRequest, UpdateDesignCompoundMetricResponse>
     */
    public SyncInvoker<UpdateDesignCompoundMetricRequest, UpdateDesignCompoundMetricResponse> updateDesignCompoundMetricInvoker(
        UpdateDesignCompoundMetricRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDesignCompoundMetric, hcClient);
    }

    /**
     * 修改或删除数仓分层
     *
     * 修改或删除数仓分层
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignDataLayersRequest 请求对象
     * @return UpdateDesignDataLayersResponse
     */
    public UpdateDesignDataLayersResponse updateDesignDataLayers(UpdateDesignDataLayersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDesignDataLayers);
    }

    /**
     * 修改或删除数仓分层
     *
     * 修改或删除数仓分层
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignDataLayersRequest 请求对象
     * @return SyncInvoker<UpdateDesignDataLayersRequest, UpdateDesignDataLayersResponse>
     */
    public SyncInvoker<UpdateDesignDataLayersRequest, UpdateDesignDataLayersResponse> updateDesignDataLayersInvoker(
        UpdateDesignDataLayersRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDesignDataLayers, hcClient);
    }

    /**
     * 更新衍生指标
     *
     * 根据传入参数，更新衍生指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignDerivativeIndexRequest 请求对象
     * @return UpdateDesignDerivativeIndexResponse
     */
    public UpdateDesignDerivativeIndexResponse updateDesignDerivativeIndex(UpdateDesignDerivativeIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDesignDerivativeIndex);
    }

    /**
     * 更新衍生指标
     *
     * 根据传入参数，更新衍生指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignDerivativeIndexRequest 请求对象
     * @return SyncInvoker<UpdateDesignDerivativeIndexRequest, UpdateDesignDerivativeIndexResponse>
     */
    public SyncInvoker<UpdateDesignDerivativeIndexRequest, UpdateDesignDerivativeIndexResponse> updateDesignDerivativeIndexInvoker(
        UpdateDesignDerivativeIndexRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDesignDerivativeIndex, hcClient);
    }

    /**
     * 更新维度
     *
     * 根据参数，更新维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignDimensionRequest 请求对象
     * @return UpdateDesignDimensionResponse
     */
    public UpdateDesignDimensionResponse updateDesignDimension(UpdateDesignDimensionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDesignDimension);
    }

    /**
     * 更新维度
     *
     * 根据参数，更新维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignDimensionRequest 请求对象
     * @return SyncInvoker<UpdateDesignDimensionRequest, UpdateDesignDimensionResponse>
     */
    public SyncInvoker<UpdateDesignDimensionRequest, UpdateDesignDimensionResponse> updateDesignDimensionInvoker(
        UpdateDesignDimensionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDesignDimension, hcClient);
    }

    /**
     * 更新表的异常数据输出配置
     *
     * 更新表的异常数据输出配置，包括是否生成异常数据、设置异常数据数据库或Schema、设置异常表表前缀/表后缀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignTableQualityRequest 请求对象
     * @return UpdateDesignTableQualityResponse
     */
    public UpdateDesignTableQualityResponse updateDesignTableQuality(UpdateDesignTableQualityRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDesignTableQuality);
    }

    /**
     * 更新表的异常数据输出配置
     *
     * 更新表的异常数据输出配置，包括是否生成异常数据、设置异常数据数据库或Schema、设置异常表表前缀/表后缀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignTableQualityRequest 请求对象
     * @return SyncInvoker<UpdateDesignTableQualityRequest, UpdateDesignTableQualityResponse>
     */
    public SyncInvoker<UpdateDesignTableQualityRequest, UpdateDesignTableQualityResponse> updateDesignTableQualityInvoker(
        UpdateDesignTableQualityRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDesignTableQuality, hcClient);
    }

    /**
     * 修改目录
     *
     * 修改目录（数据标准、码表）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectoryRequest 请求对象
     * @return UpdateDirectoryResponse
     */
    public UpdateDirectoryResponse updateDirectory(UpdateDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDirectory);
    }

    /**
     * 修改目录
     *
     * 修改目录（数据标准、码表）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectoryRequest 请求对象
     * @return SyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse>
     */
    public SyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectoryInvoker(
        UpdateDirectoryRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateDirectory, hcClient);
    }

    /**
     * 修改作业名称
     *
     * 修改作业名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFactoryJobNameRequest 请求对象
     * @return UpdateFactoryJobNameResponse
     */
    public UpdateFactoryJobNameResponse updateFactoryJobName(UpdateFactoryJobNameRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateFactoryJobName);
    }

    /**
     * 修改作业名称
     *
     * 修改作业名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFactoryJobNameRequest 请求对象
     * @return SyncInvoker<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse>
     */
    public SyncInvoker<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse> updateFactoryJobNameInvoker(
        UpdateFactoryJobNameRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateFactoryJobName, hcClient);
    }

    /**
     * 修改当前空间下分配的队列资源
     *
     * 修改当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityAssignedQueueRequest 请求对象
     * @return UpdateSecurityAssignedQueueResponse
     */
    public UpdateSecurityAssignedQueueResponse updateSecurityAssignedQueue(UpdateSecurityAssignedQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityAssignedQueue);
    }

    /**
     * 修改当前空间下分配的队列资源
     *
     * 修改当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityAssignedQueueRequest 请求对象
     * @return SyncInvoker<UpdateSecurityAssignedQueueRequest, UpdateSecurityAssignedQueueResponse>
     */
    public SyncInvoker<UpdateSecurityAssignedQueueRequest, UpdateSecurityAssignedQueueResponse> updateSecurityAssignedQueueInvoker(
        UpdateSecurityAssignedQueueRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityAssignedQueue, hcClient);
    }

    /**
     * 修改组合识别规则
     *
     * 修改组合识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDataClassificationCombineRuleRequest 请求对象
     * @return UpdateSecurityDataClassificationCombineRuleResponse
     */
    public UpdateSecurityDataClassificationCombineRuleResponse updateSecurityDataClassificationCombineRule(
        UpdateSecurityDataClassificationCombineRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityDataClassificationCombineRule);
    }

    /**
     * 修改组合识别规则
     *
     * 修改组合识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDataClassificationCombineRuleRequest 请求对象
     * @return SyncInvoker<UpdateSecurityDataClassificationCombineRuleRequest, UpdateSecurityDataClassificationCombineRuleResponse>
     */
    public SyncInvoker<UpdateSecurityDataClassificationCombineRuleRequest, UpdateSecurityDataClassificationCombineRuleResponse> updateSecurityDataClassificationCombineRuleInvoker(
        UpdateSecurityDataClassificationCombineRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityDataClassificationCombineRule, hcClient);
    }

    /**
     * 修改识别规则接口
     *
     * 修改识别规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDataClassificationRuleRequest 请求对象
     * @return UpdateSecurityDataClassificationRuleResponse
     */
    public UpdateSecurityDataClassificationRuleResponse updateSecurityDataClassificationRule(
        UpdateSecurityDataClassificationRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityDataClassificationRule);
    }

    /**
     * 修改识别规则接口
     *
     * 修改识别规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDataClassificationRuleRequest 请求对象
     * @return SyncInvoker<UpdateSecurityDataClassificationRuleRequest, UpdateSecurityDataClassificationRuleResponse>
     */
    public SyncInvoker<UpdateSecurityDataClassificationRuleRequest, UpdateSecurityDataClassificationRuleResponse> updateSecurityDataClassificationRuleInvoker(
        UpdateSecurityDataClassificationRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityDataClassificationRule, hcClient);
    }

    /**
     * 修改规则分组接口
     *
     * 修改规则分组接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDataClassificationRuleGroupRequest 请求对象
     * @return UpdateSecurityDataClassificationRuleGroupResponse
     */
    public UpdateSecurityDataClassificationRuleGroupResponse updateSecurityDataClassificationRuleGroup(
        UpdateSecurityDataClassificationRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityDataClassificationRuleGroup);
    }

    /**
     * 修改规则分组接口
     *
     * 修改规则分组接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDataClassificationRuleGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityDataClassificationRuleGroupRequest, UpdateSecurityDataClassificationRuleGroupResponse>
     */
    public SyncInvoker<UpdateSecurityDataClassificationRuleGroupRequest, UpdateSecurityDataClassificationRuleGroupResponse> updateSecurityDataClassificationRuleGroupInvoker(
        UpdateSecurityDataClassificationRuleGroupRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityDataClassificationRuleGroup, hcClient);
    }

    /**
     * 更新动态数据脱敏策略
     *
     * 更新动态数据脱敏策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDynamicMaskingPolicyRequest 请求对象
     * @return UpdateSecurityDynamicMaskingPolicyResponse
     */
    public UpdateSecurityDynamicMaskingPolicyResponse updateSecurityDynamicMaskingPolicy(
        UpdateSecurityDynamicMaskingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityDynamicMaskingPolicy);
    }

    /**
     * 更新动态数据脱敏策略
     *
     * 更新动态数据脱敏策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDynamicMaskingPolicyRequest 请求对象
     * @return SyncInvoker<UpdateSecurityDynamicMaskingPolicyRequest, UpdateSecurityDynamicMaskingPolicyResponse>
     */
    public SyncInvoker<UpdateSecurityDynamicMaskingPolicyRequest, UpdateSecurityDynamicMaskingPolicyResponse> updateSecurityDynamicMaskingPolicyInvoker(
        UpdateSecurityDynamicMaskingPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityDynamicMaskingPolicy, hcClient);
    }

    /**
     * 批量变更权限有效期
     *
     * 批量变更权限有效期
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityMemberPermissionExpireTimeRequest 请求对象
     * @return UpdateSecurityMemberPermissionExpireTimeResponse
     */
    public UpdateSecurityMemberPermissionExpireTimeResponse updateSecurityMemberPermissionExpireTime(
        UpdateSecurityMemberPermissionExpireTimeRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityMemberPermissionExpireTime);
    }

    /**
     * 批量变更权限有效期
     *
     * 批量变更权限有效期
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityMemberPermissionExpireTimeRequest 请求对象
     * @return SyncInvoker<UpdateSecurityMemberPermissionExpireTimeRequest, UpdateSecurityMemberPermissionExpireTimeResponse>
     */
    public SyncInvoker<UpdateSecurityMemberPermissionExpireTimeRequest, UpdateSecurityMemberPermissionExpireTimeResponse> updateSecurityMemberPermissionExpireTimeInvoker(
        UpdateSecurityMemberPermissionExpireTimeRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityMemberPermissionExpireTime, hcClient);
    }

    /**
     * 更新权限集
     *
     * 更新权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPermissionSetRequest 请求对象
     * @return UpdateSecurityPermissionSetResponse
     */
    public UpdateSecurityPermissionSetResponse updateSecurityPermissionSet(UpdateSecurityPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityPermissionSet);
    }

    /**
     * 更新权限集
     *
     * 更新权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPermissionSetRequest 请求对象
     * @return SyncInvoker<UpdateSecurityPermissionSetRequest, UpdateSecurityPermissionSetResponse>
     */
    public SyncInvoker<UpdateSecurityPermissionSetRequest, UpdateSecurityPermissionSetResponse> updateSecurityPermissionSetInvoker(
        UpdateSecurityPermissionSetRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityPermissionSet, hcClient);
    }

    /**
     * 更新权限集的权限
     *
     * 更新权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPermissionSetPermissionRequest 请求对象
     * @return UpdateSecurityPermissionSetPermissionResponse
     */
    public UpdateSecurityPermissionSetPermissionResponse updateSecurityPermissionSetPermission(
        UpdateSecurityPermissionSetPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityPermissionSetPermission);
    }

    /**
     * 更新权限集的权限
     *
     * 更新权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPermissionSetPermissionRequest 请求对象
     * @return SyncInvoker<UpdateSecurityPermissionSetPermissionRequest, UpdateSecurityPermissionSetPermissionResponse>
     */
    public SyncInvoker<UpdateSecurityPermissionSetPermissionRequest, UpdateSecurityPermissionSetPermissionResponse> updateSecurityPermissionSetPermissionInvoker(
        UpdateSecurityPermissionSetPermissionRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityPermissionSetPermission, hcClient);
    }

    /**
     * 更新空间资源权限策略
     *
     * 更新空间资源权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityResourcePermissionPolicyRequest 请求对象
     * @return UpdateSecurityResourcePermissionPolicyResponse
     */
    public UpdateSecurityResourcePermissionPolicyResponse updateSecurityResourcePermissionPolicy(
        UpdateSecurityResourcePermissionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityResourcePermissionPolicy);
    }

    /**
     * 更新空间资源权限策略
     *
     * 更新空间资源权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityResourcePermissionPolicyRequest 请求对象
     * @return SyncInvoker<UpdateSecurityResourcePermissionPolicyRequest, UpdateSecurityResourcePermissionPolicyResponse>
     */
    public SyncInvoker<UpdateSecurityResourcePermissionPolicyRequest, UpdateSecurityResourcePermissionPolicyResponse> updateSecurityResourcePermissionPolicyInvoker(
        UpdateSecurityResourcePermissionPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityResourcePermissionPolicy, hcClient);
    }

    /**
     * 修改识别规则状态接口
     *
     * 修改识别规则状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityRuleEnableStatusRequest 请求对象
     * @return UpdateSecurityRuleEnableStatusResponse
     */
    public UpdateSecurityRuleEnableStatusResponse updateSecurityRuleEnableStatus(
        UpdateSecurityRuleEnableStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecurityRuleEnableStatus);
    }

    /**
     * 修改识别规则状态接口
     *
     * 修改识别规则状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityRuleEnableStatusRequest 请求对象
     * @return SyncInvoker<UpdateSecurityRuleEnableStatusRequest, UpdateSecurityRuleEnableStatusResponse>
     */
    public SyncInvoker<UpdateSecurityRuleEnableStatusRequest, UpdateSecurityRuleEnableStatusResponse> updateSecurityRuleEnableStatusInvoker(
        UpdateSecurityRuleEnableStatusRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecurityRuleEnableStatus, hcClient);
    }

    /**
     * 根据指定的id修改密级
     *
     * 根据指定的id修改密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecuritySecrecyLevelRequest 请求对象
     * @return UpdateSecuritySecrecyLevelResponse
     */
    public UpdateSecuritySecrecyLevelResponse updateSecuritySecrecyLevel(UpdateSecuritySecrecyLevelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSecuritySecrecyLevel);
    }

    /**
     * 根据指定的id修改密级
     *
     * 根据指定的id修改密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecuritySecrecyLevelRequest 请求对象
     * @return SyncInvoker<UpdateSecuritySecrecyLevelRequest, UpdateSecuritySecrecyLevelResponse>
     */
    public SyncInvoker<UpdateSecuritySecrecyLevelRequest, UpdateSecuritySecrecyLevelResponse> updateSecuritySecrecyLevelInvoker(
        UpdateSecuritySecrecyLevelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSecuritySecrecyLevel, hcClient);
    }

    /**
     * 修改数据标准
     *
     * 修改数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardRequest 请求对象
     * @return UpdateStandardResponse
     */
    public UpdateStandardResponse updateStandard(UpdateStandardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateStandard);
    }

    /**
     * 修改数据标准
     *
     * 修改数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardRequest 请求对象
     * @return SyncInvoker<UpdateStandardRequest, UpdateStandardResponse>
     */
    public SyncInvoker<UpdateStandardRequest, UpdateStandardResponse> updateStandardInvoker(
        UpdateStandardRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateStandard, hcClient);
    }

    /**
     * 修改数据标准模板
     *
     * 修改数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardTemplateRequest 请求对象
     * @return UpdateStandardTemplateResponse
     */
    public UpdateStandardTemplateResponse updateStandardTemplate(UpdateStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateStandardTemplate);
    }

    /**
     * 修改数据标准模板
     *
     * 修改数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardTemplateRequest 请求对象
     * @return SyncInvoker<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse>
     */
    public SyncInvoker<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse> updateStandardTemplateInvoker(
        UpdateStandardTemplateRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateStandardTemplate, hcClient);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubjectRequest 请求对象
     * @return UpdateSubjectResponse
     */
    public UpdateSubjectResponse updateSubject(UpdateSubjectRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSubject);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubjectRequest 请求对象
     * @return SyncInvoker<UpdateSubjectRequest, UpdateSubjectResponse>
     */
    public SyncInvoker<UpdateSubjectRequest, UpdateSubjectResponse> updateSubjectInvoker(UpdateSubjectRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSubject, hcClient);
    }

    /**
     * 修改主题(新)
     *
     * 修改主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubjectNewRequest 请求对象
     * @return UpdateSubjectNewResponse
     */
    public UpdateSubjectNewResponse updateSubjectNew(UpdateSubjectNewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSubjectNew);
    }

    /**
     * 修改主题(新)
     *
     * 修改主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubjectNewRequest 请求对象
     * @return SyncInvoker<UpdateSubjectNewRequest, UpdateSubjectNewResponse>
     */
    public SyncInvoker<UpdateSubjectNewRequest, UpdateSubjectNewResponse> updateSubjectNewInvoker(
        UpdateSubjectNewRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateSubjectNew, hcClient);
    }

    /**
     * 更新表模型
     *
     * 在关系建模中更新一个表模型及其属性，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableModelRequest 请求对象
     * @return UpdateTableModelResponse
     */
    public UpdateTableModelResponse updateTableModel(UpdateTableModelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateTableModel);
    }

    /**
     * 更新表模型
     *
     * 在关系建模中更新一个表模型及其属性，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableModelRequest 请求对象
     * @return SyncInvoker<UpdateTableModelRequest, UpdateTableModelResponse>
     */
    public SyncInvoker<UpdateTableModelRequest, UpdateTableModelResponse> updateTableModelInvoker(
        UpdateTableModelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateTableModel, hcClient);
    }

    /**
     * 编辑采集任务
     *
     * 编辑采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskInfoRequest 请求对象
     * @return UpdateTaskInfoResponse
     */
    public UpdateTaskInfoResponse updateTaskInfo(UpdateTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateTaskInfo);
    }

    /**
     * 编辑采集任务
     *
     * 编辑采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskInfoRequest 请求对象
     * @return SyncInvoker<UpdateTaskInfoRequest, UpdateTaskInfoResponse>
     */
    public SyncInvoker<UpdateTaskInfoRequest, UpdateTaskInfoResponse> updateTaskInfoInvoker(
        UpdateTaskInfoRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateTaskInfo, hcClient);
    }

    /**
     * 更新规则模板
     *
     * 更新规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateTemplate);
    }

    /**
     * 更新规则模板
     *
     * 更新规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateInvoker(
        UpdateTemplateRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateTemplate, hcClient);
    }

    /**
     * 编辑工作空间用户或用户组
     *
     * 编辑工作空间用户或用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkSpaceUserOrGroupRequest 请求对象
     * @return UpdateWorkSpaceUserOrGroupResponse
     */
    public UpdateWorkSpaceUserOrGroupResponse updateWorkSpaceUserOrGroup(UpdateWorkSpaceUserOrGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateWorkSpaceUserOrGroup);
    }

    /**
     * 编辑工作空间用户或用户组
     *
     * 编辑工作空间用户或用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkSpaceUserOrGroupRequest 请求对象
     * @return SyncInvoker<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse>
     */
    public SyncInvoker<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse> updateWorkSpaceUserOrGroupInvoker(
        UpdateWorkSpaceUserOrGroupRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateWorkSpaceUserOrGroup, hcClient);
    }

    /**
     * 更新模型工作区
     *
     * 更新模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateWorkspace);
    }

    /**
     * 更新模型工作区
     *
     * 更新模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateWorkspace, hcClient);
    }

    /**
     * API授权操作(授权/取消授权/申请/续约)
     *
     * - API主动授权：  API审核人可发起，API主动授权成功后，在有效期内，APP即可访问该API。API授权包含授权和续约两部分功能。
     *     * 授权：授权会给予APP在有效期内访问API的权利。
     *     * 续约：续约会更新授权有效期，仅支持延长有效期，不能减少。
     * - API解除授权：  API审核人可发起，解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。API解除已授权的APP关系，需要为APP预留至少2天的准备时间。
     * - APP解除授权：  APP所有者可发起，解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。APP解除自己的授权关系，无需预留准备时间。
     * - APP申请授权：  APP所有者可发起，APP申请API后，待API的审核人完成审核，APP即可访问该API。授权会给予APP在有效期内访问API的权利，需要API审核。
     * - APP申请续约：  APP所有者可发起，续约会更新授权有效期，仅支持延长有效期，不能减少，需要API审核。
     * &gt; * 申请自己的API推荐采用API主动授权/续约，无需审核。
     * &gt; * 自己的应用推荐采用APP解除授权，无需预留准备时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeActionApiToInstanceRequest 请求对象
     * @return AuthorizeActionApiToInstanceResponse
     */
    public AuthorizeActionApiToInstanceResponse authorizeActionApiToInstance(
        AuthorizeActionApiToInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.authorizeActionApiToInstance);
    }

    /**
     * API授权操作(授权/取消授权/申请/续约)
     *
     * - API主动授权：  API审核人可发起，API主动授权成功后，在有效期内，APP即可访问该API。API授权包含授权和续约两部分功能。
     *     * 授权：授权会给予APP在有效期内访问API的权利。
     *     * 续约：续约会更新授权有效期，仅支持延长有效期，不能减少。
     * - API解除授权：  API审核人可发起，解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。API解除已授权的APP关系，需要为APP预留至少2天的准备时间。
     * - APP解除授权：  APP所有者可发起，解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。APP解除自己的授权关系，无需预留准备时间。
     * - APP申请授权：  APP所有者可发起，APP申请API后，待API的审核人完成审核，APP即可访问该API。授权会给予APP在有效期内访问API的权利，需要API审核。
     * - APP申请续约：  APP所有者可发起，续约会更新授权有效期，仅支持延长有效期，不能减少，需要API审核。
     * &gt; * 申请自己的API推荐采用API主动授权/续约，无需审核。
     * &gt; * 自己的应用推荐采用APP解除授权，无需预留准备时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeActionApiToInstanceRequest 请求对象
     * @return SyncInvoker<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse>
     */
    public SyncInvoker<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse> authorizeActionApiToInstanceInvoker(
        AuthorizeActionApiToInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.authorizeActionApiToInstance, hcClient);
    }

    /**
     * 批量授权API(专享版)
     *
     * APP创建成功后，还不能访问API，如果想要访问某个API，需要将该API授权给APP。API主动授权成功后，在有效期内，APP即可访问该API。  
     * API授权包含授权和续约两部分功能。  
     * - 授权：授权会给予APP在有效期内访问API的权利。
     * - 续约：续约会更新授权有效期，仅支持延长有效期，不能减少。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeApiToInstanceRequest 请求对象
     * @return AuthorizeApiToInstanceResponse
     */
    public AuthorizeApiToInstanceResponse authorizeApiToInstance(AuthorizeApiToInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.authorizeApiToInstance);
    }

    /**
     * 批量授权API(专享版)
     *
     * APP创建成功后，还不能访问API，如果想要访问某个API，需要将该API授权给APP。API主动授权成功后，在有效期内，APP即可访问该API。  
     * API授权包含授权和续约两部分功能。  
     * - 授权：授权会给予APP在有效期内访问API的权利。
     * - 续约：续约会更新授权有效期，仅支持延长有效期，不能减少。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeApiToInstanceRequest 请求对象
     * @return SyncInvoker<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse>
     */
    public SyncInvoker<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse> authorizeApiToInstanceInvoker(
        AuthorizeApiToInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.authorizeApiToInstance, hcClient);
    }

    /**
     * 创建API
     *
     * 创建API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiRequest 请求对象
     * @return CreateApiResponse
     */
    public CreateApiResponse createApi(CreateApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createApi);
    }

    /**
     * 创建API
     *
     * 创建API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiRequest 请求对象
     * @return SyncInvoker<CreateApiRequest, CreateApiResponse>
     */
    public SyncInvoker<CreateApiRequest, CreateApiResponse> createApiInvoker(CreateApiRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.createApi, hcClient);
    }

    /**
     * 调试API
     *
     * 调试API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugApiRequest 请求对象
     * @return DebugApiResponse
     */
    public DebugApiResponse debugApi(DebugApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.debugApi);
    }

    /**
     * 调试API
     *
     * 调试API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugApiRequest 请求对象
     * @return SyncInvoker<DebugApiRequest, DebugApiResponse>
     */
    public SyncInvoker<DebugApiRequest, DebugApiResponse> debugApiInvoker(DebugApiRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.debugApi, hcClient);
    }

    /**
     * 批量删除API
     *
     * 批量删除API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiRequest 请求对象
     * @return DeleteApiResponse
     */
    public DeleteApiResponse deleteApi(DeleteApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteApi);
    }

    /**
     * 批量删除API
     *
     * 批量删除API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiRequest 请求对象
     * @return SyncInvoker<DeleteApiRequest, DeleteApiResponse>
     */
    public SyncInvoker<DeleteApiRequest, DeleteApiResponse> deleteApiInvoker(DeleteApiRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.deleteApi, hcClient);
    }

    /**
     * API操作(下线/停用/恢复)
     *
     * - 下线API。将已发布的API下线。下线后，所有授权关系都会被解除，API将无法再被调用。
     * - 停用API。将已发布的API临时下线。下线后，授权关系会保留，停用期间API将无法再被调用。
     * - 恢复API。将已停用的API恢复使用。恢复后， API重新提供调用。
     * &gt; * 恢复请求的发起者若非审核人，需要API的审核人完成申请的审核。
     * &gt; * 下线/停用请求的发起者，必须为API的审核人。
     * &gt; * 下线/停用功能需要为已授权的应用预留充分的准备时间，需至少提前2天发起请求。若需要立即执行下线/停用，需要发起请求后，无有效的授权应用或是有效的授权应用均处理完消息（立即执行，或定期后完成执行）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteApiToInstanceRequest 请求对象
     * @return ExecuteApiToInstanceResponse
     */
    public ExecuteApiToInstanceResponse executeApiToInstance(ExecuteApiToInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.executeApiToInstance);
    }

    /**
     * API操作(下线/停用/恢复)
     *
     * - 下线API。将已发布的API下线。下线后，所有授权关系都会被解除，API将无法再被调用。
     * - 停用API。将已发布的API临时下线。下线后，授权关系会保留，停用期间API将无法再被调用。
     * - 恢复API。将已停用的API恢复使用。恢复后， API重新提供调用。
     * &gt; * 恢复请求的发起者若非审核人，需要API的审核人完成申请的审核。
     * &gt; * 下线/停用请求的发起者，必须为API的审核人。
     * &gt; * 下线/停用功能需要为已授权的应用预留充分的准备时间，需至少提前2天发起请求。若需要立即执行下线/停用，需要发起请求后，无有效的授权应用或是有效的授权应用均处理完消息（立即执行，或定期后完成执行）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteApiToInstanceRequest 请求对象
     * @return SyncInvoker<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse>
     */
    public SyncInvoker<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse> executeApiToInstanceInvoker(
        ExecuteApiToInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.executeApiToInstance, hcClient);
    }

    /**
     * 导出包含API信息的excel文件
     *
     * 导出包含API信息的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceExcelRequest 请求对象
     * @return ExportDataServiceExcelResponse
     */
    public ExportDataServiceExcelResponse exportDataServiceExcel(ExportDataServiceExcelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.exportDataServiceExcel);
    }

    /**
     * 导出包含API信息的excel文件
     *
     * 导出包含API信息的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceExcelRequest 请求对象
     * @return SyncInvoker<ExportDataServiceExcelRequest, ExportDataServiceExcelResponse>
     */
    public SyncInvoker<ExportDataServiceExcelRequest, ExportDataServiceExcelResponse> exportDataServiceExcelInvoker(
        ExportDataServiceExcelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.exportDataServiceExcel, hcClient);
    }

    /**
     * 下载excel模板
     *
     * 下载excel模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceExcelTemplateRequest 请求对象
     * @return ExportDataServiceExcelTemplateResponse
     */
    public ExportDataServiceExcelTemplateResponse exportDataServiceExcelTemplate(
        ExportDataServiceExcelTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.exportDataServiceExcelTemplate);
    }

    /**
     * 下载excel模板
     *
     * 下载excel模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceExcelTemplateRequest 请求对象
     * @return SyncInvoker<ExportDataServiceExcelTemplateRequest, ExportDataServiceExcelTemplateResponse>
     */
    public SyncInvoker<ExportDataServiceExcelTemplateRequest, ExportDataServiceExcelTemplateResponse> exportDataServiceExcelTemplateInvoker(
        ExportDataServiceExcelTemplateRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.exportDataServiceExcelTemplate, hcClient);
    }

    /**
     * 全量导出包含API的excel压缩文件
     *
     * 全量导出包含API的excel压缩文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceZipRequest 请求对象
     * @return ExportDataServiceZipResponse
     */
    public ExportDataServiceZipResponse exportDataServiceZip(ExportDataServiceZipRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.exportDataServiceZip);
    }

    /**
     * 全量导出包含API的excel压缩文件
     *
     * 全量导出包含API的excel压缩文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceZipRequest 请求对象
     * @return SyncInvoker<ExportDataServiceZipRequest, ExportDataServiceZipResponse>
     */
    public SyncInvoker<ExportDataServiceZipRequest, ExportDataServiceZipResponse> exportDataServiceZipInvoker(
        ExportDataServiceZipRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.exportDataServiceZip, hcClient);
    }

    /**
     * 导入包含API信息的excel文件
     *
     * 导入包含API信息的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataServiceExcelRequest 请求对象
     * @return ImportDataServiceExcelResponse
     */
    public ImportDataServiceExcelResponse importDataServiceExcel(ImportDataServiceExcelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.importDataServiceExcel);
    }

    /**
     * 导入包含API信息的excel文件
     *
     * 导入包含API信息的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataServiceExcelRequest 请求对象
     * @return SyncInvoker<ImportDataServiceExcelRequest, ImportDataServiceExcelResponse>
     */
    public SyncInvoker<ImportDataServiceExcelRequest, ImportDataServiceExcelResponse> importDataServiceExcelInvoker(
        ImportDataServiceExcelRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.importDataServiceExcel, hcClient);
    }

    /**
     * 查询API列表
     *
     * 查询API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisRequest 请求对象
     * @return ListApisResponse
     */
    public ListApisResponse listApis(ListApisRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApis);
    }

    /**
     * 查询API列表
     *
     * 查询API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisRequest 请求对象
     * @return SyncInvoker<ListApisRequest, ListApisResponse>
     */
    public SyncInvoker<ListApisRequest, ListApisResponse> listApisInvoker(ListApisRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listApis, hcClient);
    }

    /**
     * 查看API不同操作对应的实例信息(专享版)
     *
     * 查看API不同操作对应的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceListRequest 请求对象
     * @return ListInstanceListResponse
     */
    public ListInstanceListResponse listInstanceList(ListInstanceListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listInstanceList);
    }

    /**
     * 查看API不同操作对应的实例信息(专享版)
     *
     * 查看API不同操作对应的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceListRequest 请求对象
     * @return SyncInvoker<ListInstanceListRequest, ListInstanceListResponse>
     */
    public SyncInvoker<ListInstanceListRequest, ListInstanceListResponse> listInstanceListInvoker(
        ListInstanceListRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.listInstanceList, hcClient);
    }

    /**
     * 发布API
     *
     * 发布API。API只有发布后，才能够被调用。API发布时，可以将API发送至指定网关。
     * - 共享版，必须发送至API网关共享版。
     * - 专享版，可以依据自身需要，选择将API发送至API网关专享版、ROMA-APIC、或不发布网关。
     * &gt; 发布请求的发起者若非审核人，需要API的审核人完成申请的审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishApiToInstanceRequest 请求对象
     * @return PublishApiToInstanceResponse
     */
    public PublishApiToInstanceResponse publishApiToInstance(PublishApiToInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.publishApiToInstance);
    }

    /**
     * 发布API
     *
     * 发布API。API只有发布后，才能够被调用。API发布时，可以将API发送至指定网关。
     * - 共享版，必须发送至API网关共享版。
     * - 专享版，可以依据自身需要，选择将API发送至API网关专享版、ROMA-APIC、或不发布网关。
     * &gt; 发布请求的发起者若非审核人，需要API的审核人完成申请的审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishApiToInstanceRequest 请求对象
     * @return SyncInvoker<PublishApiToInstanceRequest, PublishApiToInstanceResponse>
     */
    public SyncInvoker<PublishApiToInstanceRequest, PublishApiToInstanceResponse> publishApiToInstanceInvoker(
        PublishApiToInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.publishApiToInstance, hcClient);
    }

    /**
     * 查看API调试信息(专享版)
     *
     * 查看API在不同集群上的调试信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDebugInfoRequest 请求对象
     * @return SearchDebugInfoResponse
     */
    public SearchDebugInfoResponse searchDebugInfo(SearchDebugInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchDebugInfo);
    }

    /**
     * 查看API调试信息(专享版)
     *
     * 查看API在不同集群上的调试信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDebugInfoRequest 请求对象
     * @return SyncInvoker<SearchDebugInfoRequest, SearchDebugInfoResponse>
     */
    public SyncInvoker<SearchDebugInfoRequest, SearchDebugInfoResponse> searchDebugInfoInvoker(
        SearchDebugInfoRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchDebugInfo, hcClient);
    }

    /**
     * 查看API发布信息(专享版)
     *
     * 查看API在不同集群上的发布信息。  
     * API在集群上进行过操作后会存在发布信息，例如调试、注册类发布等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPublishInfoRequest 请求对象
     * @return SearchPublishInfoResponse
     */
    public SearchPublishInfoResponse searchPublishInfo(SearchPublishInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchPublishInfo);
    }

    /**
     * 查看API发布信息(专享版)
     *
     * 查看API在不同集群上的发布信息。  
     * API在集群上进行过操作后会存在发布信息，例如调试、注册类发布等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPublishInfoRequest 请求对象
     * @return SyncInvoker<SearchPublishInfoRequest, SearchPublishInfoResponse>
     */
    public SyncInvoker<SearchPublishInfoRequest, SearchPublishInfoResponse> searchPublishInfoInvoker(
        SearchPublishInfoRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.searchPublishInfo, hcClient);
    }

    /**
     * 查询API信息
     *
     * 查询API信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiRequest 请求对象
     * @return ShowApiResponse
     */
    public ShowApiResponse showApi(ShowApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApi);
    }

    /**
     * 查询API信息
     *
     * 查询API信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiRequest 请求对象
     * @return SyncInvoker<ShowApiRequest, ShowApiResponse>
     */
    public SyncInvoker<ShowApiRequest, ShowApiResponse> showApiInvoker(ShowApiRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.showApi, hcClient);
    }

    /**
     * 更新API
     *
     * 更新API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiRequest 请求对象
     * @return UpdateApiResponse
     */
    public UpdateApiResponse updateApi(UpdateApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateApi);
    }

    /**
     * 更新API
     *
     * 更新API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiRequest 请求对象
     * @return SyncInvoker<UpdateApiRequest, UpdateApiResponse>
     */
    public SyncInvoker<UpdateApiRequest, UpdateApiResponse> updateApiInvoker(UpdateApiRequest request) {
        return new SyncInvoker<>(request, DataArtsStudioMeta.updateApi, hcClient);
    }

}
