package com.huaweicloud.sdk.dataartsstudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddDesignEntityTagsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddDesignEntityTagsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddTagToAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddTagToAssetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddWorkSpaceUsersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddWorkSpaceUsersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AssociateClassificationToEntityRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AssociateClassificationToEntityResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AssociateSecurityLevelToEntitieRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AssociateSecurityLevelToEntitieResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeActionApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeActionApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AuthorizeApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchApproveApplyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchApproveApplyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchAssociateClassificationToEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchAssociateClassificationToEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchAssociateSecurityLevelToEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchAssociateSecurityLevelToEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityPermissionSetMembersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityPermissionSetMembersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityPermissionSetPermissionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecurityPermissionSetPermissionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecuritySecrecyLevelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecuritySecrecyLevelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteTemplatesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteTemplatesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchOfflineRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchOfflineResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchPublishRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchPublishResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchSyncMetadataRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchSyncMetadataResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryEnvRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryEnvResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryJobRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryJobResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateManagerWorkSpaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateManagerWorkSpaceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateAssetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityAssignedQueueRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityAssignedQueueResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetMemberRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetMemberResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetPermissionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetPermissionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecurityPermissionSetResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignLatestApprovalRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDesignLatestApprovalResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityAssignedQueueRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityAssignedQueueResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataTablesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataTablesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataconnectionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDataconnectionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDerivativeIndexesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListDerivativeIndexesResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryReleasePackagesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListFactoryReleasePackagesResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityAssignedQueuesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityAssignedQueuesResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityMemberSyncTasksRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityMemberSyncTasksResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetMembersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetMembersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetPermissionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetPermissionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityPermissionSetsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityRoleActionsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecurityRoleActionsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecuritySecrecyLevelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecuritySecrecyLevelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecuritySensitiveDataOverviewsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSecuritySensitiveDataOverviewsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSubjectLevelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSubjectLevelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListTableModelRelationsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListTableModelRelationsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListTableModelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListTableModelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspaceRolesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListWorkspaceRolesResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataProfileRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataProfileResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataSetsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataSetsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataconnectionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataconnectionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDatamapLineageRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDatamapLineageResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDerivativeIndexByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDerivativeIndexByIdResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowRelationByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowRelationByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDataClassificationRuleGroupRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDataClassificationRuleGroupResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityMemberSyncTaskRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityMemberSyncTaskResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityPermissionSetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecurityPermissionSetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecuritySecrecyLevelRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowSecuritySecrecyLevelResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowStandardByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowStandardByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowStandardTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowStandardTemplateResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDataconnectionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDataconnectionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignAggregationLogicTableRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignAggregationLogicTableResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignAtomicIndexRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignAtomicIndexResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignTableQualityRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDesignTableQualityResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityAssignedQueueRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityAssignedQueueResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDataClassificationRuleRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityDataClassificationRuleResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityPermissionSetPermissionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityPermissionSetPermissionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityPermissionSetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecurityPermissionSetResponse;
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

import java.util.concurrent.CompletableFuture;

public class DataArtsStudioAsyncClient {

    protected HcClient hcClient;

    public DataArtsStudioAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DataArtsStudioAsyncClient> newBuilder() {
        ClientBuilder<DataArtsStudioAsyncClient> clientBuilder = new ClientBuilder<>(DataArtsStudioAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 添加标签
     *
     * 根据资产（表或属性）的ID给资产打上标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesignEntityTagsRequest 请求对象
     * @return CompletableFuture<AddDesignEntityTagsResponse>
     */
    public CompletableFuture<AddDesignEntityTagsResponse> addDesignEntityTagsAsync(AddDesignEntityTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.addDesignEntityTags);
    }

    /**
     * 添加标签
     *
     * 根据资产（表或属性）的ID给资产打上标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesignEntityTagsRequest 请求对象
     * @return AsyncInvoker<AddDesignEntityTagsRequest, AddDesignEntityTagsResponse>
     */
    public AsyncInvoker<AddDesignEntityTagsRequest, AddDesignEntityTagsResponse> addDesignEntityTagsAsyncInvoker(
        AddDesignEntityTagsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.addDesignEntityTags, hcClient);
    }

    /**
     * 标签关联到资产
     *
     * 标签关联到资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagToAssetRequest 请求对象
     * @return CompletableFuture<AddTagToAssetResponse>
     */
    public CompletableFuture<AddTagToAssetResponse> addTagToAssetAsync(AddTagToAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.addTagToAsset);
    }

    /**
     * 标签关联到资产
     *
     * 标签关联到资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagToAssetRequest 请求对象
     * @return AsyncInvoker<AddTagToAssetRequest, AddTagToAssetResponse>
     */
    public AsyncInvoker<AddTagToAssetRequest, AddTagToAssetResponse> addTagToAssetAsyncInvoker(
        AddTagToAssetRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.addTagToAsset, hcClient);
    }

    /**
     * 添加工作空间用户
     *
     * 添加工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkSpaceUsersRequest 请求对象
     * @return CompletableFuture<AddWorkSpaceUsersResponse>
     */
    public CompletableFuture<AddWorkSpaceUsersResponse> addWorkSpaceUsersAsync(AddWorkSpaceUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.addWorkSpaceUsers);
    }

    /**
     * 添加工作空间用户
     *
     * 添加工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddWorkSpaceUsersRequest 请求对象
     * @return AsyncInvoker<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse>
     */
    public AsyncInvoker<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse> addWorkSpaceUsersAsyncInvoker(
        AddWorkSpaceUsersRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.addWorkSpaceUsers, hcClient);
    }

    /**
     * 资产关联分类
     *
     * 将一个分类关联到一个或多个指定guid的资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateClassificationToEntityRequest 请求对象
     * @return CompletableFuture<AssociateClassificationToEntityResponse>
     */
    public CompletableFuture<AssociateClassificationToEntityResponse> associateClassificationToEntityAsync(
        AssociateClassificationToEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.associateClassificationToEntity);
    }

    /**
     * 资产关联分类
     *
     * 将一个分类关联到一个或多个指定guid的资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateClassificationToEntityRequest 请求对象
     * @return AsyncInvoker<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse>
     */
    public AsyncInvoker<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse> associateClassificationToEntityAsyncInvoker(
        AssociateClassificationToEntityRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.associateClassificationToEntity, hcClient);
    }

    /**
     * 资产关联密级
     *
     * 关联资产到密级，资产关联指定密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSecurityLevelToEntitieRequest 请求对象
     * @return CompletableFuture<AssociateSecurityLevelToEntitieResponse>
     */
    public CompletableFuture<AssociateSecurityLevelToEntitieResponse> associateSecurityLevelToEntitieAsync(
        AssociateSecurityLevelToEntitieRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.associateSecurityLevelToEntitie);
    }

    /**
     * 资产关联密级
     *
     * 关联资产到密级，资产关联指定密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSecurityLevelToEntitieRequest 请求对象
     * @return AsyncInvoker<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse>
     */
    public AsyncInvoker<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse> associateSecurityLevelToEntitieAsyncInvoker(
        AssociateSecurityLevelToEntitieRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.associateSecurityLevelToEntitie, hcClient);
    }

    /**
     * 审核申请
     *
     * 审核申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchApproveApplyRequest 请求对象
     * @return CompletableFuture<BatchApproveApplyResponse>
     */
    public CompletableFuture<BatchApproveApplyResponse> batchApproveApplyAsync(BatchApproveApplyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchApproveApply);
    }

    /**
     * 审核申请
     *
     * 审核申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchApproveApplyRequest 请求对象
     * @return AsyncInvoker<BatchApproveApplyRequest, BatchApproveApplyResponse>
     */
    public AsyncInvoker<BatchApproveApplyRequest, BatchApproveApplyResponse> batchApproveApplyAsyncInvoker(
        BatchApproveApplyRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchApproveApply, hcClient);
    }

    /**
     * 批量资产关联分类
     *
     * 批量资产关联分类：只支持对数据表的列和OBS对象添加分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateClassificationToEntitiesRequest 请求对象
     * @return CompletableFuture<BatchAssociateClassificationToEntitiesResponse>
     */
    public CompletableFuture<BatchAssociateClassificationToEntitiesResponse> batchAssociateClassificationToEntitiesAsync(
        BatchAssociateClassificationToEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchAssociateClassificationToEntities);
    }

    /**
     * 批量资产关联分类
     *
     * 批量资产关联分类：只支持对数据表的列和OBS对象添加分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateClassificationToEntitiesRequest 请求对象
     * @return AsyncInvoker<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse>
     */
    public AsyncInvoker<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse> batchAssociateClassificationToEntitiesAsyncInvoker(
        BatchAssociateClassificationToEntitiesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchAssociateClassificationToEntities, hcClient);
    }

    /**
     * 批量资产关联密级
     *
     * 批量资产关联密级：单个密级关联到多个资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateSecurityLevelToEntitiesRequest 请求对象
     * @return CompletableFuture<BatchAssociateSecurityLevelToEntitiesResponse>
     */
    public CompletableFuture<BatchAssociateSecurityLevelToEntitiesResponse> batchAssociateSecurityLevelToEntitiesAsync(
        BatchAssociateSecurityLevelToEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchAssociateSecurityLevelToEntities);
    }

    /**
     * 批量资产关联密级
     *
     * 批量资产关联密级：单个密级关联到多个资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateSecurityLevelToEntitiesRequest 请求对象
     * @return AsyncInvoker<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse>
     */
    public AsyncInvoker<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse> batchAssociateSecurityLevelToEntitiesAsyncInvoker(
        BatchAssociateSecurityLevelToEntitiesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchAssociateSecurityLevelToEntities, hcClient);
    }

    /**
     * 批量删除识别规则接口
     *
     * 批量删除识别规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityDataClassificationRuleRequest 请求对象
     * @return CompletableFuture<BatchDeleteSecurityDataClassificationRuleResponse>
     */
    public CompletableFuture<BatchDeleteSecurityDataClassificationRuleResponse> batchDeleteSecurityDataClassificationRuleAsync(
        BatchDeleteSecurityDataClassificationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecurityDataClassificationRule);
    }

    /**
     * 批量删除识别规则接口
     *
     * 批量删除识别规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityDataClassificationRuleRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSecurityDataClassificationRuleRequest, BatchDeleteSecurityDataClassificationRuleResponse>
     */
    public AsyncInvoker<BatchDeleteSecurityDataClassificationRuleRequest, BatchDeleteSecurityDataClassificationRuleResponse> batchDeleteSecurityDataClassificationRuleAsyncInvoker(
        BatchDeleteSecurityDataClassificationRuleRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecurityDataClassificationRule, hcClient);
    }

    /**
     * 批量删除权限集成员
     *
     * 批量删除权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityPermissionSetMembersRequest 请求对象
     * @return CompletableFuture<BatchDeleteSecurityPermissionSetMembersResponse>
     */
    public CompletableFuture<BatchDeleteSecurityPermissionSetMembersResponse> batchDeleteSecurityPermissionSetMembersAsync(
        BatchDeleteSecurityPermissionSetMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecurityPermissionSetMembers);
    }

    /**
     * 批量删除权限集成员
     *
     * 批量删除权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityPermissionSetMembersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSecurityPermissionSetMembersRequest, BatchDeleteSecurityPermissionSetMembersResponse>
     */
    public AsyncInvoker<BatchDeleteSecurityPermissionSetMembersRequest, BatchDeleteSecurityPermissionSetMembersResponse> batchDeleteSecurityPermissionSetMembersAsyncInvoker(
        BatchDeleteSecurityPermissionSetMembersRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecurityPermissionSetMembers, hcClient);
    }

    /**
     * 删除权限集的权限
     *
     * 删除权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityPermissionSetPermissionsRequest 请求对象
     * @return CompletableFuture<BatchDeleteSecurityPermissionSetPermissionsResponse>
     */
    public CompletableFuture<BatchDeleteSecurityPermissionSetPermissionsResponse> batchDeleteSecurityPermissionSetPermissionsAsync(
        BatchDeleteSecurityPermissionSetPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecurityPermissionSetPermissions);
    }

    /**
     * 删除权限集的权限
     *
     * 删除权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecurityPermissionSetPermissionsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSecurityPermissionSetPermissionsRequest, BatchDeleteSecurityPermissionSetPermissionsResponse>
     */
    public AsyncInvoker<BatchDeleteSecurityPermissionSetPermissionsRequest, BatchDeleteSecurityPermissionSetPermissionsResponse> batchDeleteSecurityPermissionSetPermissionsAsyncInvoker(
        BatchDeleteSecurityPermissionSetPermissionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecurityPermissionSetPermissions, hcClient);
    }

    /**
     * 批量删除密级
     *
     * 批量删除密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecuritySecrecyLevelsRequest 请求对象
     * @return CompletableFuture<BatchDeleteSecuritySecrecyLevelsResponse>
     */
    public CompletableFuture<BatchDeleteSecuritySecrecyLevelsResponse> batchDeleteSecuritySecrecyLevelsAsync(
        BatchDeleteSecuritySecrecyLevelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchDeleteSecuritySecrecyLevels);
    }

    /**
     * 批量删除密级
     *
     * 批量删除密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSecuritySecrecyLevelsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSecuritySecrecyLevelsRequest, BatchDeleteSecuritySecrecyLevelsResponse>
     */
    public AsyncInvoker<BatchDeleteSecuritySecrecyLevelsRequest, BatchDeleteSecuritySecrecyLevelsResponse> batchDeleteSecuritySecrecyLevelsAsyncInvoker(
        BatchDeleteSecuritySecrecyLevelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchDeleteSecuritySecrecyLevels, hcClient);
    }

    /**
     * 批量删除规则模板
     *
     * 批量删除规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTemplatesRequest 请求对象
     * @return CompletableFuture<BatchDeleteTemplatesResponse>
     */
    public CompletableFuture<BatchDeleteTemplatesResponse> batchDeleteTemplatesAsync(
        BatchDeleteTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchDeleteTemplates);
    }

    /**
     * 批量删除规则模板
     *
     * 批量删除规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTemplatesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse>
     */
    public AsyncInvoker<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse> batchDeleteTemplatesAsyncInvoker(
        BatchDeleteTemplatesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchDeleteTemplates, hcClient);
    }

    /**
     * 批量下线
     *
     * 批量下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchOfflineRequest 请求对象
     * @return CompletableFuture<BatchOfflineResponse>
     */
    public CompletableFuture<BatchOfflineResponse> batchOfflineAsync(BatchOfflineRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchOffline);
    }

    /**
     * 批量下线
     *
     * 批量下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchOfflineRequest 请求对象
     * @return AsyncInvoker<BatchOfflineRequest, BatchOfflineResponse>
     */
    public AsyncInvoker<BatchOfflineRequest, BatchOfflineResponse> batchOfflineAsyncInvoker(
        BatchOfflineRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchOffline, hcClient);
    }

    /**
     * 批量发布
     *
     * 批量发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishRequest 请求对象
     * @return CompletableFuture<BatchPublishResponse>
     */
    public CompletableFuture<BatchPublishResponse> batchPublishAsync(BatchPublishRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchPublish);
    }

    /**
     * 批量发布
     *
     * 批量发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishRequest 请求对象
     * @return AsyncInvoker<BatchPublishRequest, BatchPublishResponse>
     */
    public AsyncInvoker<BatchPublishRequest, BatchPublishResponse> batchPublishAsyncInvoker(
        BatchPublishRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchPublish, hcClient);
    }

    /**
     * 元数据实时同步接口(邀测)
     *
     * 元数据实时同步接口，支持批量。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSyncMetadataRequest 请求对象
     * @return CompletableFuture<BatchSyncMetadataResponse>
     */
    public CompletableFuture<BatchSyncMetadataResponse> batchSyncMetadataAsync(BatchSyncMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchSyncMetadata);
    }

    /**
     * 元数据实时同步接口(邀测)
     *
     * 元数据实时同步接口，支持批量。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSyncMetadataRequest 请求对象
     * @return AsyncInvoker<BatchSyncMetadataRequest, BatchSyncMetadataResponse>
     */
    public AsyncInvoker<BatchSyncMetadataRequest, BatchSyncMetadataResponse> batchSyncMetadataAsyncInvoker(
        BatchSyncMetadataRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchSyncMetadata, hcClient);
    }

    /**
     * 批量更新数据开发连接细粒度认证状态
     *
     * 批量更新数据开发连接细粒度认证状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateSecurityDlfDataWareHousesRequest 请求对象
     * @return CompletableFuture<BatchUpdateSecurityDlfDataWareHousesResponse>
     */
    public CompletableFuture<BatchUpdateSecurityDlfDataWareHousesResponse> batchUpdateSecurityDlfDataWareHousesAsync(
        BatchUpdateSecurityDlfDataWareHousesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.batchUpdateSecurityDlfDataWareHouses);
    }

    /**
     * 批量更新数据开发连接细粒度认证状态
     *
     * 批量更新数据开发连接细粒度认证状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateSecurityDlfDataWareHousesRequest 请求对象
     * @return AsyncInvoker<BatchUpdateSecurityDlfDataWareHousesRequest, BatchUpdateSecurityDlfDataWareHousesResponse>
     */
    public AsyncInvoker<BatchUpdateSecurityDlfDataWareHousesRequest, BatchUpdateSecurityDlfDataWareHousesResponse> batchUpdateSecurityDlfDataWareHousesAsyncInvoker(
        BatchUpdateSecurityDlfDataWareHousesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.batchUpdateSecurityDlfDataWareHouses, hcClient);
    }

    /**
     * 撤销任务包
     *
     * 撤销任务包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelFactoryPackagesRequest 请求对象
     * @return CompletableFuture<CancelFactoryPackagesResponse>
     */
    public CompletableFuture<CancelFactoryPackagesResponse> cancelFactoryPackagesAsync(
        CancelFactoryPackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.cancelFactoryPackages);
    }

    /**
     * 撤销任务包
     *
     * 撤销任务包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelFactoryPackagesRequest 请求对象
     * @return AsyncInvoker<CancelFactoryPackagesRequest, CancelFactoryPackagesResponse>
     */
    public AsyncInvoker<CancelFactoryPackagesRequest, CancelFactoryPackagesResponse> cancelFactoryPackagesAsyncInvoker(
        CancelFactoryPackagesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.cancelFactoryPackages, hcClient);
    }

    /**
     * 修改流程架构
     *
     * 修改流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCatalogRequest 请求对象
     * @return CompletableFuture<ChangeCatalogResponse>
     */
    public CompletableFuture<ChangeCatalogResponse> changeCatalogAsync(ChangeCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.changeCatalog);
    }

    /**
     * 修改流程架构
     *
     * 修改流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCatalogRequest 请求对象
     * @return AsyncInvoker<ChangeCatalogRequest, ChangeCatalogResponse>
     */
    public AsyncInvoker<ChangeCatalogRequest, ChangeCatalogResponse> changeCatalogAsyncInvoker(
        ChangeCatalogRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.changeCatalog, hcClient);
    }

    /**
     * 规格变更接口
     *
     * 规格变更接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceRequest 请求对象
     * @return CompletableFuture<ChangeResourceResponse>
     */
    public CompletableFuture<ChangeResourceResponse> changeResourceAsync(ChangeResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.changeResource);
    }

    /**
     * 规格变更接口
     *
     * 规格变更接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceRequest 请求对象
     * @return AsyncInvoker<ChangeResourceRequest, ChangeResourceResponse>
     */
    public AsyncInvoker<ChangeResourceRequest, ChangeResourceResponse> changeResourceAsyncInvoker(
        ChangeResourceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.changeResource, hcClient);
    }

    /**
     * 修改或删除主题层级
     *
     * 修改或删除主题层级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSubjectsRequest 请求对象
     * @return CompletableFuture<ChangeSubjectsResponse>
     */
    public CompletableFuture<ChangeSubjectsResponse> changeSubjectsAsync(ChangeSubjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.changeSubjects);
    }

    /**
     * 修改或删除主题层级
     *
     * 修改或删除主题层级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSubjectsRequest 请求对象
     * @return AsyncInvoker<ChangeSubjectsRequest, ChangeSubjectsResponse>
     */
    public AsyncInvoker<ChangeSubjectsRequest, ChangeSubjectsResponse> changeSubjectsAsyncInvoker(
        ChangeSubjectsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.changeSubjects, hcClient);
    }

    /**
     * 查看逆向维度表任务
     *
     * 查看逆向维度表任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDimensionStatusRequest 请求对象
     * @return CompletableFuture<CheckDimensionStatusResponse>
     */
    public CompletableFuture<CheckDimensionStatusResponse> checkDimensionStatusAsync(
        CheckDimensionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.checkDimensionStatus);
    }

    /**
     * 查看逆向维度表任务
     *
     * 查看逆向维度表任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDimensionStatusRequest 请求对象
     * @return AsyncInvoker<CheckDimensionStatusRequest, CheckDimensionStatusResponse>
     */
    public AsyncInvoker<CheckDimensionStatusRequest, CheckDimensionStatusResponse> checkDimensionStatusAsyncInvoker(
        CheckDimensionStatusRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.checkDimensionStatus, hcClient);
    }

    /**
     * 查看逆向事实表任务
     *
     * 查看逆向事实表任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckFactLogicTableStatusRequest 请求对象
     * @return CompletableFuture<CheckFactLogicTableStatusResponse>
     */
    public CompletableFuture<CheckFactLogicTableStatusResponse> checkFactLogicTableStatusAsync(
        CheckFactLogicTableStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.checkFactLogicTableStatus);
    }

    /**
     * 查看逆向事实表任务
     *
     * 查看逆向事实表任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckFactLogicTableStatusRequest 请求对象
     * @return AsyncInvoker<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse>
     */
    public AsyncInvoker<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse> checkFactLogicTableStatusAsyncInvoker(
        CheckFactLogicTableStatusRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.checkFactLogicTableStatus, hcClient);
    }

    /**
     * 审批单处理
     *
     * 审批驳回/通过，单个或多个action-id&#x3D;reject/resolve。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmApprovalsRequest 请求对象
     * @return CompletableFuture<ConfirmApprovalsResponse>
     */
    public CompletableFuture<ConfirmApprovalsResponse> confirmApprovalsAsync(ConfirmApprovalsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.confirmApprovals);
    }

    /**
     * 审批单处理
     *
     * 审批驳回/通过，单个或多个action-id&#x3D;reject/resolve。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmApprovalsRequest 请求对象
     * @return AsyncInvoker<ConfirmApprovalsRequest, ConfirmApprovalsResponse>
     */
    public AsyncInvoker<ConfirmApprovalsRequest, ConfirmApprovalsResponse> confirmApprovalsAsyncInvoker(
        ConfirmApprovalsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.confirmApprovals, hcClient);
    }

    /**
     * 处理消息
     *
     * 对收到的通知消息进行确认，可以在指定的时间范围内选择何时进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmMessageRequest 请求对象
     * @return CompletableFuture<ConfirmMessageResponse>
     */
    public CompletableFuture<ConfirmMessageResponse> confirmMessageAsync(ConfirmMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.confirmMessage);
    }

    /**
     * 处理消息
     *
     * 对收到的通知消息进行确认，可以在指定的时间范围内选择何时进行处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmMessageRequest 请求对象
     * @return AsyncInvoker<ConfirmMessageRequest, ConfirmMessageResponse>
     */
    public AsyncInvoker<ConfirmMessageRequest, ConfirmMessageResponse> confirmMessageAsyncInvoker(
        ConfirmMessageRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.confirmMessage, hcClient);
    }

    /**
     * 关系建模统计信息
     *
     * 关系建模统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllModelsRequest 请求对象
     * @return CompletableFuture<CountAllModelsResponse>
     */
    public CompletableFuture<CountAllModelsResponse> countAllModelsAsync(CountAllModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.countAllModels);
    }

    /**
     * 关系建模统计信息
     *
     * 关系建模统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllModelsRequest 请求对象
     * @return AsyncInvoker<CountAllModelsRequest, CountAllModelsResponse>
     */
    public AsyncInvoker<CountAllModelsRequest, CountAllModelsResponse> countAllModelsAsyncInvoker(
        CountAllModelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.countAllModels, hcClient);
    }

    /**
     * 总览统计信息
     *
     * 总览统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOverviewsRequest 请求对象
     * @return CompletableFuture<CountOverviewsResponse>
     */
    public CompletableFuture<CountOverviewsResponse> countOverviewsAsync(CountOverviewsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.countOverviews);
    }

    /**
     * 总览统计信息
     *
     * 总览统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOverviewsRequest 请求对象
     * @return AsyncInvoker<CountOverviewsRequest, CountOverviewsResponse>
     */
    public AsyncInvoker<CountOverviewsRequest, CountOverviewsResponse> countOverviewsAsyncInvoker(
        CountOverviewsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.countOverviews, hcClient);
    }

    /**
     * 标准覆盖率统计信息
     *
     * 标准覆盖率统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountStandardsRequest 请求对象
     * @return CompletableFuture<CountStandardsResponse>
     */
    public CompletableFuture<CountStandardsResponse> countStandardsAsync(CountStandardsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.countStandards);
    }

    /**
     * 标准覆盖率统计信息
     *
     * 标准覆盖率统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountStandardsRequest 请求对象
     * @return AsyncInvoker<CountStandardsRequest, CountStandardsResponse>
     */
    public AsyncInvoker<CountStandardsRequest, CountStandardsResponse> countStandardsAsyncInvoker(
        CountStandardsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.countStandards, hcClient);
    }

    /**
     * 模型统计信息
     *
     * 模型统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTableModelsRequest 请求对象
     * @return CompletableFuture<CountTableModelsResponse>
     */
    public CompletableFuture<CountTableModelsResponse> countTableModelsAsync(CountTableModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.countTableModels);
    }

    /**
     * 模型统计信息
     *
     * 模型统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTableModelsRequest 请求对象
     * @return AsyncInvoker<CountTableModelsRequest, CountTableModelsResponse>
     */
    public AsyncInvoker<CountTableModelsRequest, CountTableModelsResponse> countTableModelsAsyncInvoker(
        CountTableModelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.countTableModels, hcClient);
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
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createApp);
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
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createApp, hcClient);
    }

    /**
     * 创建审批人
     *
     * 创建审批人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApproverRequest 请求对象
     * @return CompletableFuture<CreateApproverResponse>
     */
    public CompletableFuture<CreateApproverResponse> createApproverAsync(CreateApproverRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createApprover);
    }

    /**
     * 创建审批人
     *
     * 创建审批人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApproverRequest 请求对象
     * @return AsyncInvoker<CreateApproverRequest, CreateApproverResponse>
     */
    public AsyncInvoker<CreateApproverRequest, CreateApproverResponse> createApproverAsyncInvoker(
        CreateApproverRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createApprover, hcClient);
    }

    /**
     * 创建业务指标
     *
     * 创建业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBizMetricRequest 请求对象
     * @return CompletableFuture<CreateBizMetricResponse>
     */
    public CompletableFuture<CreateBizMetricResponse> createBizMetricAsync(CreateBizMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createBizMetric);
    }

    /**
     * 创建业务指标
     *
     * 创建业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBizMetricRequest 请求对象
     * @return AsyncInvoker<CreateBizMetricRequest, CreateBizMetricResponse>
     */
    public AsyncInvoker<CreateBizMetricRequest, CreateBizMetricResponse> createBizMetricAsyncInvoker(
        CreateBizMetricRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createBizMetric, hcClient);
    }

    /**
     * 创建流程架构
     *
     * 创建流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCatalogRequest 请求对象
     * @return CompletableFuture<CreateCatalogResponse>
     */
    public CompletableFuture<CreateCatalogResponse> createCatalogAsync(CreateCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createCatalog);
    }

    /**
     * 创建流程架构
     *
     * 创建流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCatalogRequest 请求对象
     * @return AsyncInvoker<CreateCatalogRequest, CreateCatalogResponse>
     */
    public AsyncInvoker<CreateCatalogRequest, CreateCatalogResponse> createCatalogAsyncInvoker(
        CreateCatalogRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createCatalog, hcClient);
    }

    /**
     * 创建码表
     *
     * 创建码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeTableRequest 请求对象
     * @return CompletableFuture<CreateCodeTableResponse>
     */
    public CompletableFuture<CreateCodeTableResponse> createCodeTableAsync(CreateCodeTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createCodeTable);
    }

    /**
     * 创建码表
     *
     * 创建码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeTableRequest 请求对象
     * @return AsyncInvoker<CreateCodeTableRequest, CreateCodeTableResponse>
     */
    public AsyncInvoker<CreateCodeTableRequest, CreateCodeTableResponse> createCodeTableAsyncInvoker(
        CreateCodeTableRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createCodeTable, hcClient);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionsRequest 请求对象
     * @return CompletableFuture<CreateConnectionsResponse>
     */
    public CompletableFuture<CreateConnectionsResponse> createConnectionsAsync(CreateConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createConnections);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionsRequest 请求对象
     * @return AsyncInvoker<CreateConnectionsRequest, CreateConnectionsResponse>
     */
    public AsyncInvoker<CreateConnectionsRequest, CreateConnectionsResponse> createConnectionsAsyncInvoker(
        CreateConnectionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createConnections, hcClient);
    }

    /**
     * 新建汇总表
     *
     * 新建汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignAggregationLogicTableRequest 请求对象
     * @return CompletableFuture<CreateDesignAggregationLogicTableResponse>
     */
    public CompletableFuture<CreateDesignAggregationLogicTableResponse> createDesignAggregationLogicTableAsync(
        CreateDesignAggregationLogicTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createDesignAggregationLogicTable);
    }

    /**
     * 新建汇总表
     *
     * 新建汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignAggregationLogicTableRequest 请求对象
     * @return AsyncInvoker<CreateDesignAggregationLogicTableRequest, CreateDesignAggregationLogicTableResponse>
     */
    public AsyncInvoker<CreateDesignAggregationLogicTableRequest, CreateDesignAggregationLogicTableResponse> createDesignAggregationLogicTableAsyncInvoker(
        CreateDesignAggregationLogicTableRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createDesignAggregationLogicTable, hcClient);
    }

    /**
     * 新建原子指标
     *
     * 新建单个原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignAtomicIndexRequest 请求对象
     * @return CompletableFuture<CreateDesignAtomicIndexResponse>
     */
    public CompletableFuture<CreateDesignAtomicIndexResponse> createDesignAtomicIndexAsync(
        CreateDesignAtomicIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createDesignAtomicIndex);
    }

    /**
     * 新建原子指标
     *
     * 新建单个原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesignAtomicIndexRequest 请求对象
     * @return AsyncInvoker<CreateDesignAtomicIndexRequest, CreateDesignAtomicIndexResponse>
     */
    public AsyncInvoker<CreateDesignAtomicIndexRequest, CreateDesignAtomicIndexResponse> createDesignAtomicIndexAsyncInvoker(
        CreateDesignAtomicIndexRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createDesignAtomicIndex, hcClient);
    }

    /**
     * 创建目录
     *
     * 创建目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirectoryRequest 请求对象
     * @return CompletableFuture<CreateDirectoryResponse>
     */
    public CompletableFuture<CreateDirectoryResponse> createDirectoryAsync(CreateDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createDirectory);
    }

    /**
     * 创建目录
     *
     * 创建目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirectoryRequest 请求对象
     * @return AsyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse>
     */
    public AsyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse> createDirectoryAsyncInvoker(
        CreateDirectoryRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createDirectory, hcClient);
    }

    /**
     * 创建环境变量
     *
     * 创建环境变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryEnvRequest 请求对象
     * @return CompletableFuture<CreateFactoryEnvResponse>
     */
    public CompletableFuture<CreateFactoryEnvResponse> createFactoryEnvAsync(CreateFactoryEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createFactoryEnv);
    }

    /**
     * 创建环境变量
     *
     * 创建环境变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryEnvRequest 请求对象
     * @return AsyncInvoker<CreateFactoryEnvRequest, CreateFactoryEnvResponse>
     */
    public AsyncInvoker<CreateFactoryEnvRequest, CreateFactoryEnvResponse> createFactoryEnvAsyncInvoker(
        CreateFactoryEnvRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createFactoryEnv, hcClient);
    }

    /**
     * 创建作业
     *
     * 创建作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryJobRequest 请求对象
     * @return CompletableFuture<CreateFactoryJobResponse>
     */
    public CompletableFuture<CreateFactoryJobResponse> createFactoryJobAsync(CreateFactoryJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createFactoryJob);
    }

    /**
     * 创建作业
     *
     * 创建作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactoryJobRequest 请求对象
     * @return AsyncInvoker<CreateFactoryJobRequest, CreateFactoryJobResponse>
     */
    public AsyncInvoker<CreateFactoryJobRequest, CreateFactoryJobResponse> createFactoryJobAsyncInvoker(
        CreateFactoryJobRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createFactoryJob, hcClient);
    }

    /**
     * 创建补数据实例
     *
     * 创建补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactorySupplementDataInstanceRequest 请求对象
     * @return CompletableFuture<CreateFactorySupplementDataInstanceResponse>
     */
    public CompletableFuture<CreateFactorySupplementDataInstanceResponse> createFactorySupplementDataInstanceAsync(
        CreateFactorySupplementDataInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createFactorySupplementDataInstance);
    }

    /**
     * 创建补数据实例
     *
     * 创建补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFactorySupplementDataInstanceRequest 请求对象
     * @return AsyncInvoker<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse>
     */
    public AsyncInvoker<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse> createFactorySupplementDataInstanceAsyncInvoker(
        CreateFactorySupplementDataInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createFactorySupplementDataInstance, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManagerWorkSpaceRequest 请求对象
     * @return CompletableFuture<CreateManagerWorkSpaceResponse>
     */
    public CompletableFuture<CreateManagerWorkSpaceResponse> createManagerWorkSpaceAsync(
        CreateManagerWorkSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createManagerWorkSpace);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManagerWorkSpaceRequest 请求对象
     * @return AsyncInvoker<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse>
     */
    public AsyncInvoker<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse> createManagerWorkSpaceAsyncInvoker(
        CreateManagerWorkSpaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createManagerWorkSpace, hcClient);
    }

    /**
     * 添加或修改资产
     *
     * 添加或修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateAssetRequest 请求对象
     * @return CompletableFuture<CreateOrUpdateAssetResponse>
     */
    public CompletableFuture<CreateOrUpdateAssetResponse> createOrUpdateAssetAsync(CreateOrUpdateAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createOrUpdateAsset);
    }

    /**
     * 添加或修改资产
     *
     * 添加或修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateAssetRequest 请求对象
     * @return AsyncInvoker<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse>
     */
    public AsyncInvoker<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse> createOrUpdateAssetAsyncInvoker(
        CreateOrUpdateAssetRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createOrUpdateAsset, hcClient);
    }

    /**
     * 创建或修改资产(邀测)
     *
     * 创建或修改资产，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateEntitiesRequest 请求对象
     * @return CompletableFuture<CreateOrUpdateEntitiesResponse>
     */
    public CompletableFuture<CreateOrUpdateEntitiesResponse> createOrUpdateEntitiesAsync(
        CreateOrUpdateEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createOrUpdateEntities);
    }

    /**
     * 创建或修改资产(邀测)
     *
     * 创建或修改资产，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateEntitiesRequest 请求对象
     * @return AsyncInvoker<CreateOrUpdateEntitiesRequest, CreateOrUpdateEntitiesResponse>
     */
    public AsyncInvoker<CreateOrUpdateEntitiesRequest, CreateOrUpdateEntitiesResponse> createOrUpdateEntitiesAsyncInvoker(
        CreateOrUpdateEntitiesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createOrUpdateEntities, hcClient);
    }

    /**
     * 分配队列资源给指定空间
     *
     * 分配队列资源给指定空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityAssignedQueueRequest 请求对象
     * @return CompletableFuture<CreateSecurityAssignedQueueResponse>
     */
    public CompletableFuture<CreateSecurityAssignedQueueResponse> createSecurityAssignedQueueAsync(
        CreateSecurityAssignedQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createSecurityAssignedQueue);
    }

    /**
     * 分配队列资源给指定空间
     *
     * 分配队列资源给指定空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityAssignedQueueRequest 请求对象
     * @return AsyncInvoker<CreateSecurityAssignedQueueRequest, CreateSecurityAssignedQueueResponse>
     */
    public AsyncInvoker<CreateSecurityAssignedQueueRequest, CreateSecurityAssignedQueueResponse> createSecurityAssignedQueueAsyncInvoker(
        CreateSecurityAssignedQueueRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createSecurityAssignedQueue, hcClient);
    }

    /**
     * 创建识别规则
     *
     * 创建识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDataClassificationRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityDataClassificationRuleResponse>
     */
    public CompletableFuture<CreateSecurityDataClassificationRuleResponse> createSecurityDataClassificationRuleAsync(
        CreateSecurityDataClassificationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createSecurityDataClassificationRule);
    }

    /**
     * 创建识别规则
     *
     * 创建识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityDataClassificationRuleRequest 请求对象
     * @return AsyncInvoker<CreateSecurityDataClassificationRuleRequest, CreateSecurityDataClassificationRuleResponse>
     */
    public AsyncInvoker<CreateSecurityDataClassificationRuleRequest, CreateSecurityDataClassificationRuleResponse> createSecurityDataClassificationRuleAsyncInvoker(
        CreateSecurityDataClassificationRuleRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createSecurityDataClassificationRule, hcClient);
    }

    /**
     * 创建权限集
     *
     * 创建权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetRequest 请求对象
     * @return CompletableFuture<CreateSecurityPermissionSetResponse>
     */
    public CompletableFuture<CreateSecurityPermissionSetResponse> createSecurityPermissionSetAsync(
        CreateSecurityPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createSecurityPermissionSet);
    }

    /**
     * 创建权限集
     *
     * 创建权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetRequest 请求对象
     * @return AsyncInvoker<CreateSecurityPermissionSetRequest, CreateSecurityPermissionSetResponse>
     */
    public AsyncInvoker<CreateSecurityPermissionSetRequest, CreateSecurityPermissionSetResponse> createSecurityPermissionSetAsyncInvoker(
        CreateSecurityPermissionSetRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createSecurityPermissionSet, hcClient);
    }

    /**
     * 添加权限集成员
     *
     * 添加权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetMemberRequest 请求对象
     * @return CompletableFuture<CreateSecurityPermissionSetMemberResponse>
     */
    public CompletableFuture<CreateSecurityPermissionSetMemberResponse> createSecurityPermissionSetMemberAsync(
        CreateSecurityPermissionSetMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createSecurityPermissionSetMember);
    }

    /**
     * 添加权限集成员
     *
     * 添加权限集成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetMemberRequest 请求对象
     * @return AsyncInvoker<CreateSecurityPermissionSetMemberRequest, CreateSecurityPermissionSetMemberResponse>
     */
    public AsyncInvoker<CreateSecurityPermissionSetMemberRequest, CreateSecurityPermissionSetMemberResponse> createSecurityPermissionSetMemberAsyncInvoker(
        CreateSecurityPermissionSetMemberRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createSecurityPermissionSetMember, hcClient);
    }

    /**
     * 添加权限集的权限
     *
     * 添加权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetPermissionRequest 请求对象
     * @return CompletableFuture<CreateSecurityPermissionSetPermissionResponse>
     */
    public CompletableFuture<CreateSecurityPermissionSetPermissionResponse> createSecurityPermissionSetPermissionAsync(
        CreateSecurityPermissionSetPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createSecurityPermissionSetPermission);
    }

    /**
     * 添加权限集的权限
     *
     * 添加权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPermissionSetPermissionRequest 请求对象
     * @return AsyncInvoker<CreateSecurityPermissionSetPermissionRequest, CreateSecurityPermissionSetPermissionResponse>
     */
    public AsyncInvoker<CreateSecurityPermissionSetPermissionRequest, CreateSecurityPermissionSetPermissionResponse> createSecurityPermissionSetPermissionAsyncInvoker(
        CreateSecurityPermissionSetPermissionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createSecurityPermissionSetPermission, hcClient);
    }

    /**
     * 创建密级
     *
     * 创建密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecuritySecrecyLevelRequest 请求对象
     * @return CompletableFuture<CreateSecuritySecrecyLevelResponse>
     */
    public CompletableFuture<CreateSecuritySecrecyLevelResponse> createSecuritySecrecyLevelAsync(
        CreateSecuritySecrecyLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createSecuritySecrecyLevel);
    }

    /**
     * 创建密级
     *
     * 创建密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecuritySecrecyLevelRequest 请求对象
     * @return AsyncInvoker<CreateSecuritySecrecyLevelRequest, CreateSecuritySecrecyLevelResponse>
     */
    public AsyncInvoker<CreateSecuritySecrecyLevelRequest, CreateSecuritySecrecyLevelResponse> createSecuritySecrecyLevelAsyncInvoker(
        CreateSecuritySecrecyLevelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createSecuritySecrecyLevel, hcClient);
    }

    /**
     * 创建服务目录
     *
     * 创建服务目录。 根目录编号为0。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceCatalogRequest 请求对象
     * @return CompletableFuture<CreateServiceCatalogResponse>
     */
    public CompletableFuture<CreateServiceCatalogResponse> createServiceCatalogAsync(
        CreateServiceCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createServiceCatalog);
    }

    /**
     * 创建服务目录
     *
     * 创建服务目录。 根目录编号为0。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceCatalogRequest 请求对象
     * @return AsyncInvoker<CreateServiceCatalogRequest, CreateServiceCatalogResponse>
     */
    public AsyncInvoker<CreateServiceCatalogRequest, CreateServiceCatalogResponse> createServiceCatalogAsyncInvoker(
        CreateServiceCatalogRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createServiceCatalog, hcClient);
    }

    /**
     * 创建数据标准
     *
     * 创建数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardRequest 请求对象
     * @return CompletableFuture<CreateStandardResponse>
     */
    public CompletableFuture<CreateStandardResponse> createStandardAsync(CreateStandardRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createStandard);
    }

    /**
     * 创建数据标准
     *
     * 创建数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardRequest 请求对象
     * @return AsyncInvoker<CreateStandardRequest, CreateStandardResponse>
     */
    public AsyncInvoker<CreateStandardRequest, CreateStandardResponse> createStandardAsyncInvoker(
        CreateStandardRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createStandard, hcClient);
    }

    /**
     * 创建数据标准模板
     *
     * 创建数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardTemplateRequest 请求对象
     * @return CompletableFuture<CreateStandardTemplateResponse>
     */
    public CompletableFuture<CreateStandardTemplateResponse> createStandardTemplateAsync(
        CreateStandardTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createStandardTemplate);
    }

    /**
     * 创建数据标准模板
     *
     * 创建数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardTemplateRequest 请求对象
     * @return AsyncInvoker<CreateStandardTemplateRequest, CreateStandardTemplateResponse>
     */
    public AsyncInvoker<CreateStandardTemplateRequest, CreateStandardTemplateResponse> createStandardTemplateAsyncInvoker(
        CreateStandardTemplateRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createStandardTemplate, hcClient);
    }

    /**
     * 创建主题
     *
     * 创建主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubjectRequest 请求对象
     * @return CompletableFuture<CreateSubjectResponse>
     */
    public CompletableFuture<CreateSubjectResponse> createSubjectAsync(CreateSubjectRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createSubject);
    }

    /**
     * 创建主题
     *
     * 创建主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubjectRequest 请求对象
     * @return AsyncInvoker<CreateSubjectRequest, CreateSubjectResponse>
     */
    public AsyncInvoker<CreateSubjectRequest, CreateSubjectResponse> createSubjectAsyncInvoker(
        CreateSubjectRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createSubject, hcClient);
    }

    /**
     * 创建主题(新)
     *
     * 创建主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubjectNewRequest 请求对象
     * @return CompletableFuture<CreateSubjectNewResponse>
     */
    public CompletableFuture<CreateSubjectNewResponse> createSubjectNewAsync(CreateSubjectNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createSubjectNew);
    }

    /**
     * 创建主题(新)
     *
     * 创建主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubjectNewRequest 请求对象
     * @return AsyncInvoker<CreateSubjectNewRequest, CreateSubjectNewResponse>
     */
    public AsyncInvoker<CreateSubjectNewRequest, CreateSubjectNewResponse> createSubjectNewAsyncInvoker(
        CreateSubjectNewRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createSubjectNew, hcClient);
    }

    /**
     * 创建表模型
     *
     * 在关系建模中创建一个表模型，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableModelRequest 请求对象
     * @return CompletableFuture<CreateTableModelResponse>
     */
    public CompletableFuture<CreateTableModelResponse> createTableModelAsync(CreateTableModelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createTableModel);
    }

    /**
     * 创建表模型
     *
     * 在关系建模中创建一个表模型，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableModelRequest 请求对象
     * @return AsyncInvoker<CreateTableModelRequest, CreateTableModelResponse>
     */
    public AsyncInvoker<CreateTableModelRequest, CreateTableModelResponse> createTableModelAsyncInvoker(
        CreateTableModelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createTableModel, hcClient);
    }

    /**
     * 创建采集任务
     *
     * 创建采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createTask);
    }

    /**
     * 创建采集任务
     *
     * 创建采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createTask, hcClient);
    }

    /**
     * 创建规则模板
     *
     * 创建规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CompletableFuture<CreateTemplateResponse>
     */
    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createTemplate);
    }

    /**
     * 创建规则模板
     *
     * 创建规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createTemplate, hcClient);
    }

    /**
     * 新建模型工作区
     *
     * 新建模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CompletableFuture<CreateWorkspaceResponse>
     */
    public CompletableFuture<CreateWorkspaceResponse> createWorkspaceAsync(CreateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createWorkspace);
    }

    /**
     * 新建模型工作区
     *
     * 新建模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceAsyncInvoker(
        CreateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createWorkspace, hcClient);
    }

    /**
     * 测试创建数据连接
     *
     * 测试创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugDataconnectionRequest 请求对象
     * @return CompletableFuture<DebugDataconnectionResponse>
     */
    public CompletableFuture<DebugDataconnectionResponse> debugDataconnectionAsync(DebugDataconnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.debugDataconnection);
    }

    /**
     * 测试创建数据连接
     *
     * 测试创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugDataconnectionRequest 请求对象
     * @return AsyncInvoker<DebugDataconnectionRequest, DebugDataconnectionResponse>
     */
    public AsyncInvoker<DebugDataconnectionRequest, DebugDataconnectionResponse> debugDataconnectionAsyncInvoker(
        DebugDataconnectionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.debugDataconnection, hcClient);
    }

    /**
     * 测试数据开发连接细粒度连通性
     *
     * 测试数据开发连接细粒度连通性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugSecurityDlfDataWareHousesRequest 请求对象
     * @return CompletableFuture<DebugSecurityDlfDataWareHousesResponse>
     */
    public CompletableFuture<DebugSecurityDlfDataWareHousesResponse> debugSecurityDlfDataWareHousesAsync(
        DebugSecurityDlfDataWareHousesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.debugSecurityDlfDataWareHouses);
    }

    /**
     * 测试数据开发连接细粒度连通性
     *
     * 测试数据开发连接细粒度连通性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugSecurityDlfDataWareHousesRequest 请求对象
     * @return AsyncInvoker<DebugSecurityDlfDataWareHousesRequest, DebugSecurityDlfDataWareHousesResponse>
     */
    public AsyncInvoker<DebugSecurityDlfDataWareHousesRequest, DebugSecurityDlfDataWareHousesResponse> debugSecurityDlfDataWareHousesAsyncInvoker(
        DebugSecurityDlfDataWareHousesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.debugSecurityDlfDataWareHouses, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteApp, hcClient);
    }

    /**
     * 删除审批人
     *
     * 删除审批人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApproverRequest 请求对象
     * @return CompletableFuture<DeleteApproverResponse>
     */
    public CompletableFuture<DeleteApproverResponse> deleteApproverAsync(DeleteApproverRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteApprover);
    }

    /**
     * 删除审批人
     *
     * 删除审批人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApproverRequest 请求对象
     * @return AsyncInvoker<DeleteApproverRequest, DeleteApproverResponse>
     */
    public AsyncInvoker<DeleteApproverRequest, DeleteApproverResponse> deleteApproverAsyncInvoker(
        DeleteApproverRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteApprover, hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return CompletableFuture<DeleteAssetResponse>
     */
    public CompletableFuture<DeleteAssetResponse> deleteAssetAsync(DeleteAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteAsset);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetAsyncInvoker(DeleteAssetRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteAsset, hcClient);
    }

    /**
     * 删除业务指标
     *
     * 删除业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBizMetricRequest 请求对象
     * @return CompletableFuture<DeleteBizMetricResponse>
     */
    public CompletableFuture<DeleteBizMetricResponse> deleteBizMetricAsync(DeleteBizMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteBizMetric);
    }

    /**
     * 删除业务指标
     *
     * 删除业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBizMetricRequest 请求对象
     * @return AsyncInvoker<DeleteBizMetricRequest, DeleteBizMetricResponse>
     */
    public AsyncInvoker<DeleteBizMetricRequest, DeleteBizMetricResponse> deleteBizMetricAsyncInvoker(
        DeleteBizMetricRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteBizMetric, hcClient);
    }

    /**
     * 删除流程架构
     *
     * 删除流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCatalogRequest 请求对象
     * @return CompletableFuture<DeleteCatalogResponse>
     */
    public CompletableFuture<DeleteCatalogResponse> deleteCatalogAsync(DeleteCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteCatalog);
    }

    /**
     * 删除流程架构
     *
     * 删除流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCatalogRequest 请求对象
     * @return AsyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>
     */
    public AsyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalogAsyncInvoker(
        DeleteCatalogRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteCatalog, hcClient);
    }

    /**
     * 移除资产关联的分类
     *
     * 移除资产关联分类：
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClassificationFromEntitiesRequest 请求对象
     * @return CompletableFuture<DeleteClassificationFromEntitiesResponse>
     */
    public CompletableFuture<DeleteClassificationFromEntitiesResponse> deleteClassificationFromEntitiesAsync(
        DeleteClassificationFromEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteClassificationFromEntities);
    }

    /**
     * 移除资产关联的分类
     *
     * 移除资产关联分类：
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClassificationFromEntitiesRequest 请求对象
     * @return AsyncInvoker<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse>
     */
    public AsyncInvoker<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse> deleteClassificationFromEntitiesAsyncInvoker(
        DeleteClassificationFromEntitiesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteClassificationFromEntities, hcClient);
    }

    /**
     * 删除码表
     *
     * 删除码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCodeTableRequest 请求对象
     * @return CompletableFuture<DeleteCodeTableResponse>
     */
    public CompletableFuture<DeleteCodeTableResponse> deleteCodeTableAsync(DeleteCodeTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteCodeTable);
    }

    /**
     * 删除码表
     *
     * 删除码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCodeTableRequest 请求对象
     * @return AsyncInvoker<DeleteCodeTableRequest, DeleteCodeTableResponse>
     */
    public AsyncInvoker<DeleteCodeTableRequest, DeleteCodeTableResponse> deleteCodeTableAsyncInvoker(
        DeleteCodeTableRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteCodeTable, hcClient);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataconnectionRequest 请求对象
     * @return CompletableFuture<DeleteDataconnectionResponse>
     */
    public CompletableFuture<DeleteDataconnectionResponse> deleteDataconnectionAsync(
        DeleteDataconnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteDataconnection);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataconnectionRequest 请求对象
     * @return AsyncInvoker<DeleteDataconnectionRequest, DeleteDataconnectionResponse>
     */
    public AsyncInvoker<DeleteDataconnectionRequest, DeleteDataconnectionResponse> deleteDataconnectionAsyncInvoker(
        DeleteDataconnectionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteDataconnection, hcClient);
    }

    /**
     * 删除汇总表
     *
     * 批量删除汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignAggregationLogicTableRequest 请求对象
     * @return CompletableFuture<DeleteDesignAggregationLogicTableResponse>
     */
    public CompletableFuture<DeleteDesignAggregationLogicTableResponse> deleteDesignAggregationLogicTableAsync(
        DeleteDesignAggregationLogicTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteDesignAggregationLogicTable);
    }

    /**
     * 删除汇总表
     *
     * 批量删除汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignAggregationLogicTableRequest 请求对象
     * @return AsyncInvoker<DeleteDesignAggregationLogicTableRequest, DeleteDesignAggregationLogicTableResponse>
     */
    public AsyncInvoker<DeleteDesignAggregationLogicTableRequest, DeleteDesignAggregationLogicTableResponse> deleteDesignAggregationLogicTableAsyncInvoker(
        DeleteDesignAggregationLogicTableRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteDesignAggregationLogicTable, hcClient);
    }

    /**
     * 删除原子指标
     *
     * 批量删除原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignAtomicIndexRequest 请求对象
     * @return CompletableFuture<DeleteDesignAtomicIndexResponse>
     */
    public CompletableFuture<DeleteDesignAtomicIndexResponse> deleteDesignAtomicIndexAsync(
        DeleteDesignAtomicIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteDesignAtomicIndex);
    }

    /**
     * 删除原子指标
     *
     * 批量删除原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignAtomicIndexRequest 请求对象
     * @return AsyncInvoker<DeleteDesignAtomicIndexRequest, DeleteDesignAtomicIndexResponse>
     */
    public AsyncInvoker<DeleteDesignAtomicIndexRequest, DeleteDesignAtomicIndexResponse> deleteDesignAtomicIndexAsyncInvoker(
        DeleteDesignAtomicIndexRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteDesignAtomicIndex, hcClient);
    }

    /**
     * 删除实体下展
     *
     * 当已发布的实体被编辑时，其会生成下展，该接口用于删除实体的下展信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignLatestApprovalRequest 请求对象
     * @return CompletableFuture<DeleteDesignLatestApprovalResponse>
     */
    public CompletableFuture<DeleteDesignLatestApprovalResponse> deleteDesignLatestApprovalAsync(
        DeleteDesignLatestApprovalRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteDesignLatestApproval);
    }

    /**
     * 删除实体下展
     *
     * 当已发布的实体被编辑时，其会生成下展，该接口用于删除实体的下展信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesignLatestApprovalRequest 请求对象
     * @return AsyncInvoker<DeleteDesignLatestApprovalRequest, DeleteDesignLatestApprovalResponse>
     */
    public AsyncInvoker<DeleteDesignLatestApprovalRequest, DeleteDesignLatestApprovalResponse> deleteDesignLatestApprovalAsyncInvoker(
        DeleteDesignLatestApprovalRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteDesignLatestApproval, hcClient);
    }

    /**
     * 删除目录
     *
     * 删除目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectoryRequest 请求对象
     * @return CompletableFuture<DeleteDirectoryResponse>
     */
    public CompletableFuture<DeleteDirectoryResponse> deleteDirectoryAsync(DeleteDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteDirectory);
    }

    /**
     * 删除目录
     *
     * 删除目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectoryRequest 请求对象
     * @return AsyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse>
     */
    public AsyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectoryAsyncInvoker(
        DeleteDirectoryRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteDirectory, hcClient);
    }

    /**
     * 删除当前空间下分配的队列资源
     *
     * 删除当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityAssignedQueueRequest 请求对象
     * @return CompletableFuture<DeleteSecurityAssignedQueueResponse>
     */
    public CompletableFuture<DeleteSecurityAssignedQueueResponse> deleteSecurityAssignedQueueAsync(
        DeleteSecurityAssignedQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityAssignedQueue);
    }

    /**
     * 删除当前空间下分配的队列资源
     *
     * 删除当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityAssignedQueueRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityAssignedQueueRequest, DeleteSecurityAssignedQueueResponse>
     */
    public AsyncInvoker<DeleteSecurityAssignedQueueRequest, DeleteSecurityAssignedQueueResponse> deleteSecurityAssignedQueueAsyncInvoker(
        DeleteSecurityAssignedQueueRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityAssignedQueue, hcClient);
    }

    /**
     * 删除识别规则
     *
     * 删除识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityDataClassificationRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityDataClassificationRuleResponse>
     */
    public CompletableFuture<DeleteSecurityDataClassificationRuleResponse> deleteSecurityDataClassificationRuleAsync(
        DeleteSecurityDataClassificationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityDataClassificationRule);
    }

    /**
     * 删除识别规则
     *
     * 删除识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityDataClassificationRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityDataClassificationRuleRequest, DeleteSecurityDataClassificationRuleResponse>
     */
    public AsyncInvoker<DeleteSecurityDataClassificationRuleRequest, DeleteSecurityDataClassificationRuleResponse> deleteSecurityDataClassificationRuleAsyncInvoker(
        DeleteSecurityDataClassificationRuleRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityDataClassificationRule, hcClient);
    }

    /**
     * 移除资产关联密级
     *
     * 移除资产关联密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityLevelFromEntityRequest 请求对象
     * @return CompletableFuture<DeleteSecurityLevelFromEntityResponse>
     */
    public CompletableFuture<DeleteSecurityLevelFromEntityResponse> deleteSecurityLevelFromEntityAsync(
        DeleteSecurityLevelFromEntityRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityLevelFromEntity);
    }

    /**
     * 移除资产关联密级
     *
     * 移除资产关联密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityLevelFromEntityRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse>
     */
    public AsyncInvoker<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse> deleteSecurityLevelFromEntityAsyncInvoker(
        DeleteSecurityLevelFromEntityRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityLevelFromEntity, hcClient);
    }

    /**
     * 删除权限集
     *
     * 删除权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityPermissionSetRequest 请求对象
     * @return CompletableFuture<DeleteSecurityPermissionSetResponse>
     */
    public CompletableFuture<DeleteSecurityPermissionSetResponse> deleteSecurityPermissionSetAsync(
        DeleteSecurityPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteSecurityPermissionSet);
    }

    /**
     * 删除权限集
     *
     * 删除权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityPermissionSetRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityPermissionSetRequest, DeleteSecurityPermissionSetResponse>
     */
    public AsyncInvoker<DeleteSecurityPermissionSetRequest, DeleteSecurityPermissionSetResponse> deleteSecurityPermissionSetAsyncInvoker(
        DeleteSecurityPermissionSetRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteSecurityPermissionSet, hcClient);
    }

    /**
     * 删除指定的id的密级
     *
     * 删除指定的id的密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecuritySecrecyLevelRequest 请求对象
     * @return CompletableFuture<DeleteSecuritySecrecyLevelResponse>
     */
    public CompletableFuture<DeleteSecuritySecrecyLevelResponse> deleteSecuritySecrecyLevelAsync(
        DeleteSecuritySecrecyLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteSecuritySecrecyLevel);
    }

    /**
     * 删除指定的id的密级
     *
     * 删除指定的id的密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecuritySecrecyLevelRequest 请求对象
     * @return AsyncInvoker<DeleteSecuritySecrecyLevelRequest, DeleteSecuritySecrecyLevelResponse>
     */
    public AsyncInvoker<DeleteSecuritySecrecyLevelRequest, DeleteSecuritySecrecyLevelResponse> deleteSecuritySecrecyLevelAsyncInvoker(
        DeleteSecuritySecrecyLevelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteSecuritySecrecyLevel, hcClient);
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
     * @return CompletableFuture<DeleteServiceCatalogResponse>
     */
    public CompletableFuture<DeleteServiceCatalogResponse> deleteServiceCatalogAsync(
        DeleteServiceCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteServiceCatalog);
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
     * @return AsyncInvoker<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse>
     */
    public AsyncInvoker<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> deleteServiceCatalogAsyncInvoker(
        DeleteServiceCatalogRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteServiceCatalog, hcClient);
    }

    /**
     * 删除数据标准
     *
     * 删除数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardRequest 请求对象
     * @return CompletableFuture<DeleteStandardResponse>
     */
    public CompletableFuture<DeleteStandardResponse> deleteStandardAsync(DeleteStandardRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteStandard);
    }

    /**
     * 删除数据标准
     *
     * 删除数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardRequest 请求对象
     * @return AsyncInvoker<DeleteStandardRequest, DeleteStandardResponse>
     */
    public AsyncInvoker<DeleteStandardRequest, DeleteStandardResponse> deleteStandardAsyncInvoker(
        DeleteStandardRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteStandard, hcClient);
    }

    /**
     * 删除数据标准模板
     *
     * 删除数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardTemplateRequest 请求对象
     * @return CompletableFuture<DeleteStandardTemplateResponse>
     */
    public CompletableFuture<DeleteStandardTemplateResponse> deleteStandardTemplateAsync(
        DeleteStandardTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteStandardTemplate);
    }

    /**
     * 删除数据标准模板
     *
     * 删除数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse>
     */
    public AsyncInvoker<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse> deleteStandardTemplateAsyncInvoker(
        DeleteStandardTemplateRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteStandardTemplate, hcClient);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubjectRequest 请求对象
     * @return CompletableFuture<DeleteSubjectResponse>
     */
    public CompletableFuture<DeleteSubjectResponse> deleteSubjectAsync(DeleteSubjectRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteSubject);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubjectRequest 请求对象
     * @return AsyncInvoker<DeleteSubjectRequest, DeleteSubjectResponse>
     */
    public AsyncInvoker<DeleteSubjectRequest, DeleteSubjectResponse> deleteSubjectAsyncInvoker(
        DeleteSubjectRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteSubject, hcClient);
    }

    /**
     * 删除主题(新)
     *
     * 删除主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubjectNewRequest 请求对象
     * @return CompletableFuture<DeleteSubjectNewResponse>
     */
    public CompletableFuture<DeleteSubjectNewResponse> deleteSubjectNewAsync(DeleteSubjectNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteSubjectNew);
    }

    /**
     * 删除主题(新)
     *
     * 删除主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubjectNewRequest 请求对象
     * @return AsyncInvoker<DeleteSubjectNewRequest, DeleteSubjectNewResponse>
     */
    public AsyncInvoker<DeleteSubjectNewRequest, DeleteSubjectNewResponse> deleteSubjectNewAsyncInvoker(
        DeleteSubjectNewRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteSubjectNew, hcClient);
    }

    /**
     * 删除表模型
     *
     * 在关系建模中删除一个表模型及其属性，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTableModelRequest 请求对象
     * @return CompletableFuture<DeleteTableModelResponse>
     */
    public CompletableFuture<DeleteTableModelResponse> deleteTableModelAsync(DeleteTableModelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteTableModel);
    }

    /**
     * 删除表模型
     *
     * 在关系建模中删除一个表模型及其属性，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTableModelRequest 请求对象
     * @return AsyncInvoker<DeleteTableModelRequest, DeleteTableModelResponse>
     */
    public AsyncInvoker<DeleteTableModelRequest, DeleteTableModelResponse> deleteTableModelAsyncInvoker(
        DeleteTableModelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteTableModel, hcClient);
    }

    /**
     * 删除单个采集任务
     *
     * 删除单个采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskInfoRequest 请求对象
     * @return CompletableFuture<DeleteTaskInfoResponse>
     */
    public CompletableFuture<DeleteTaskInfoResponse> deleteTaskInfoAsync(DeleteTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteTaskInfo);
    }

    /**
     * 删除单个采集任务
     *
     * 删除单个采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskInfoRequest 请求对象
     * @return AsyncInvoker<DeleteTaskInfoRequest, DeleteTaskInfoResponse>
     */
    public AsyncInvoker<DeleteTaskInfoRequest, DeleteTaskInfoResponse> deleteTaskInfoAsyncInvoker(
        DeleteTaskInfoRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteTaskInfo, hcClient);
    }

    /**
     * 删除模型工作区
     *
     * 删除模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspacesRequest 请求对象
     * @return CompletableFuture<DeleteWorkspacesResponse>
     */
    public CompletableFuture<DeleteWorkspacesResponse> deleteWorkspacesAsync(DeleteWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteWorkspaces);
    }

    /**
     * 删除模型工作区
     *
     * 删除模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspacesRequest 请求对象
     * @return AsyncInvoker<DeleteWorkspacesRequest, DeleteWorkspacesResponse>
     */
    public AsyncInvoker<DeleteWorkspacesRequest, DeleteWorkspacesResponse> deleteWorkspacesAsyncInvoker(
        DeleteWorkspacesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteWorkspaces, hcClient);
    }

    /**
     * 删除工作空间用户
     *
     * 删除工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceusersRequest 请求对象
     * @return CompletableFuture<DeleteWorkspaceusersResponse>
     */
    public CompletableFuture<DeleteWorkspaceusersResponse> deleteWorkspaceusersAsync(
        DeleteWorkspaceusersRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteWorkspaceusers);
    }

    /**
     * 删除工作空间用户
     *
     * 删除工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceusersRequest 请求对象
     * @return AsyncInvoker<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse>
     */
    public AsyncInvoker<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse> deleteWorkspaceusersAsyncInvoker(
        DeleteWorkspaceusersRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteWorkspaceusers, hcClient);
    }

    /**
     * 发布任务包
     *
     * 发布任务包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployFactoryPackagesRequest 请求对象
     * @return CompletableFuture<DeployFactoryPackagesResponse>
     */
    public CompletableFuture<DeployFactoryPackagesResponse> deployFactoryPackagesAsync(
        DeployFactoryPackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deployFactoryPackages);
    }

    /**
     * 发布任务包
     *
     * 发布任务包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployFactoryPackagesRequest 请求对象
     * @return AsyncInvoker<DeployFactoryPackagesRequest, DeployFactoryPackagesResponse>
     */
    public AsyncInvoker<DeployFactoryPackagesRequest, DeployFactoryPackagesResponse> deployFactoryPackagesAsyncInvoker(
        DeployFactoryPackagesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deployFactoryPackages, hcClient);
    }

    /**
     * 启动、调度、停止采集任务
     *
     * 启动、调度、停止采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTaskActionRequest 请求对象
     * @return CompletableFuture<ExecuteTaskActionResponse>
     */
    public CompletableFuture<ExecuteTaskActionResponse> executeTaskActionAsync(ExecuteTaskActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.executeTaskAction);
    }

    /**
     * 启动、调度、停止采集任务
     *
     * 启动、调度、停止采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTaskActionRequest 请求对象
     * @return AsyncInvoker<ExecuteTaskActionRequest, ExecuteTaskActionResponse>
     */
    public AsyncInvoker<ExecuteTaskActionRequest, ExecuteTaskActionResponse> executeTaskActionAsyncInvoker(
        ExecuteTaskActionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.executeTaskAction, hcClient);
    }

    /**
     * 导出模型中表的DDL语句
     *
     * 根据模型ID导出指定表的DDL语句。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignModelTableDdlRequest 请求对象
     * @return CompletableFuture<ExportDesignModelTableDdlResponse>
     */
    public CompletableFuture<ExportDesignModelTableDdlResponse> exportDesignModelTableDdlAsync(
        ExportDesignModelTableDdlRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.exportDesignModelTableDdl);
    }

    /**
     * 导出模型中表的DDL语句
     *
     * 根据模型ID导出指定表的DDL语句。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignModelTableDdlRequest 请求对象
     * @return AsyncInvoker<ExportDesignModelTableDdlRequest, ExportDesignModelTableDdlResponse>
     */
    public AsyncInvoker<ExportDesignModelTableDdlRequest, ExportDesignModelTableDdlResponse> exportDesignModelTableDdlAsyncInvoker(
        ExportDesignModelTableDdlRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.exportDesignModelTableDdl, hcClient);
    }

    /**
     * 导出业务数据
     *
     * 根据请求参数，导出业务数据，可以导出：码表、数据标准、原子指标、衍生指标、复合指标、汇总表、业务指标、主题、流程、逻辑模型、物理模型、维度、事实表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignModelsRequest 请求对象
     * @return CompletableFuture<ExportDesignModelsResponse>
     */
    public CompletableFuture<ExportDesignModelsResponse> exportDesignModelsAsync(ExportDesignModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.exportDesignModels);
    }

    /**
     * 导出业务数据
     *
     * 根据请求参数，导出业务数据，可以导出：码表、数据标准、原子指标、衍生指标、复合指标、汇总表、业务指标、主题、流程、逻辑模型、物理模型、维度、事实表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignModelsRequest 请求对象
     * @return AsyncInvoker<ExportDesignModelsRequest, ExportDesignModelsResponse>
     */
    public AsyncInvoker<ExportDesignModelsRequest, ExportDesignModelsResponse> exportDesignModelsAsyncInvoker(
        ExportDesignModelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.exportDesignModels, hcClient);
    }

    /**
     * 获取excel导出结果
     *
     * 根据请求导出接口（/export-model）时返回的uuid，获取excel导出结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignResultRequest 请求对象
     * @return CompletableFuture<ExportDesignResultResponse>
     */
    public CompletableFuture<ExportDesignResultResponse> exportDesignResultAsync(ExportDesignResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.exportDesignResult);
    }

    /**
     * 获取excel导出结果
     *
     * 根据请求导出接口（/export-model）时返回的uuid，获取excel导出结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesignResultRequest 请求对象
     * @return AsyncInvoker<ExportDesignResultRequest, ExportDesignResultResponse>
     */
    public AsyncInvoker<ExportDesignResultRequest, ExportDesignResultResponse> exportDesignResultAsyncInvoker(
        ExportDesignResultRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.exportDesignResult, hcClient);
    }

    /**
     * 导入主题
     *
     * 用于导入主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCatalogsRequest 请求对象
     * @return CompletableFuture<ImportCatalogsResponse>
     */
    public CompletableFuture<ImportCatalogsResponse> importCatalogsAsync(ImportCatalogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.importCatalogs);
    }

    /**
     * 导入主题
     *
     * 用于导入主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCatalogsRequest 请求对象
     * @return AsyncInvoker<ImportCatalogsRequest, ImportCatalogsResponse>
     */
    public AsyncInvoker<ImportCatalogsRequest, ImportCatalogsResponse> importCatalogsAsyncInvoker(
        ImportCatalogsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.importCatalogs, hcClient);
    }

    /**
     * 血缘导入
     *
     * 血缘查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportLineageRequest 请求对象
     * @return CompletableFuture<ImportLineageResponse>
     */
    public CompletableFuture<ImportLineageResponse> importLineageAsync(ImportLineageRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.importLineage);
    }

    /**
     * 血缘导入
     *
     * 血缘查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportLineageRequest 请求对象
     * @return AsyncInvoker<ImportLineageRequest, ImportLineageResponse>
     */
    public AsyncInvoker<ImportLineageRequest, ImportLineageResponse> importLineageAsyncInvoker(
        ImportLineageRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.importLineage, hcClient);
    }

    /**
     * 导入模型，关系建模，维度建模，码表，业务指标以及流程架构
     *
     * 导入模型，关系建模，维度建模，码表，业务指标以及流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportModelsRequest 请求对象
     * @return CompletableFuture<ImportModelsResponse>
     */
    public CompletableFuture<ImportModelsResponse> importModelsAsync(ImportModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.importModels);
    }

    /**
     * 导入模型，关系建模，维度建模，码表，业务指标以及流程架构
     *
     * 导入模型，关系建模，维度建模，码表，业务指标以及流程架构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportModelsRequest 请求对象
     * @return AsyncInvoker<ImportModelsRequest, ImportModelsResponse>
     */
    public AsyncInvoker<ImportModelsRequest, ImportModelsResponse> importModelsAsyncInvoker(
        ImportModelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.importModels, hcClient);
    }

    /**
     * 查询导入结果
     *
     * 查询导入excel的处理结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportResultRequest 请求对象
     * @return CompletableFuture<ImportResultResponse>
     */
    public CompletableFuture<ImportResultResponse> importResultAsync(ImportResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.importResult);
    }

    /**
     * 查询导入结果
     *
     * 查询导入excel的处理结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportResultRequest 请求对象
     * @return AsyncInvoker<ImportResultRequest, ImportResultResponse>
     */
    public AsyncInvoker<ImportResultRequest, ImportResultResponse> importResultAsyncInvoker(
        ImportResultRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.importResult, hcClient);
    }

    /**
     * 初始化数据标准模板
     *
     * 初始化数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializeStandardTemplateRequest 请求对象
     * @return CompletableFuture<InitializeStandardTemplateResponse>
     */
    public CompletableFuture<InitializeStandardTemplateResponse> initializeStandardTemplateAsync(
        InitializeStandardTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.initializeStandardTemplate);
    }

    /**
     * 初始化数据标准模板
     *
     * 初始化数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializeStandardTemplateRequest 请求对象
     * @return AsyncInvoker<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse>
     */
    public AsyncInvoker<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse> initializeStandardTemplateAsyncInvoker(
        InitializeStandardTemplateRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.initializeStandardTemplate, hcClient);
    }

    /**
     * 查找汇总表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找汇总表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregationLogicTablesRequest 请求对象
     * @return CompletableFuture<ListAggregationLogicTablesResponse>
     */
    public CompletableFuture<ListAggregationLogicTablesResponse> listAggregationLogicTablesAsync(
        ListAggregationLogicTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listAggregationLogicTables);
    }

    /**
     * 查找汇总表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找汇总表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregationLogicTablesRequest 请求对象
     * @return AsyncInvoker<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse>
     */
    public AsyncInvoker<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse> listAggregationLogicTablesAsyncInvoker(
        ListAggregationLogicTablesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listAggregationLogicTables, hcClient);
    }

    /**
     * 获取当前目录下的所有类型列表
     *
     * 获取当前目录下所有类型列表（包括api和目录，均以目录的数据格式形式展示）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllCatalogListRequest 请求对象
     * @return CompletableFuture<ListAllCatalogListResponse>
     */
    public CompletableFuture<ListAllCatalogListResponse> listAllCatalogListAsync(ListAllCatalogListRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listAllCatalogList);
    }

    /**
     * 获取当前目录下的所有类型列表
     *
     * 获取当前目录下所有类型列表（包括api和目录，均以目录的数据格式形式展示）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllCatalogListRequest 请求对象
     * @return AsyncInvoker<ListAllCatalogListRequest, ListAllCatalogListResponse>
     */
    public AsyncInvoker<ListAllCatalogListRequest, ListAllCatalogListResponse> listAllCatalogListAsyncInvoker(
        ListAllCatalogListRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listAllCatalogList, hcClient);
    }

    /**
     * 获取数据标准集合
     *
     * 根据查询条件分页获取数据标准集合，按修改时间降序排序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllStandardsRequest 请求对象
     * @return CompletableFuture<ListAllStandardsResponse>
     */
    public CompletableFuture<ListAllStandardsResponse> listAllStandardsAsync(ListAllStandardsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listAllStandards);
    }

    /**
     * 获取数据标准集合
     *
     * 根据查询条件分页获取数据标准集合，按修改时间降序排序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllStandardsRequest 请求对象
     * @return AsyncInvoker<ListAllStandardsRequest, ListAllStandardsResponse>
     */
    public AsyncInvoker<ListAllStandardsRequest, ListAllStandardsResponse> listAllStandardsAsyncInvoker(
        ListAllStandardsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listAllStandards, hcClient);
    }

    /**
     * 查询多种类型的表信息
     *
     * 从信息架构中查询多种类型的表信息，包括逻辑实体、物理表、维度表、事实表、汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTablesRequest 请求对象
     * @return CompletableFuture<ListAllTablesResponse>
     */
    public CompletableFuture<ListAllTablesResponse> listAllTablesAsync(ListAllTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listAllTables);
    }

    /**
     * 查询多种类型的表信息
     *
     * 从信息架构中查询多种类型的表信息，包括逻辑实体、物理表、维度表、事实表、汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTablesRequest 请求对象
     * @return AsyncInvoker<ListAllTablesRequest, ListAllTablesResponse>
     */
    public AsyncInvoker<ListAllTablesRequest, ListAllTablesResponse> listAllTablesAsyncInvoker(
        ListAllTablesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listAllTables, hcClient);
    }

    /**
     * 获取当前目录下的api列表
     *
     * 获取当前目录下的api列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiCatalogListRequest 请求对象
     * @return CompletableFuture<ListApiCatalogListResponse>
     */
    public CompletableFuture<ListApiCatalogListResponse> listApiCatalogListAsync(ListApiCatalogListRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApiCatalogList);
    }

    /**
     * 获取当前目录下的api列表
     *
     * 获取当前目录下的api列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiCatalogListRequest 请求对象
     * @return AsyncInvoker<ListApiCatalogListRequest, ListApiCatalogListResponse>
     */
    public AsyncInvoker<ListApiCatalogListRequest, ListApiCatalogListResponse> listApiCatalogListAsyncInvoker(
        ListApiCatalogListRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApiCatalogList, hcClient);
    }

    /**
     * 查询指定api 应用调用topN
     *
     * 查询指定api 应用调用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiTopNRequest 请求对象
     * @return CompletableFuture<ListApiTopNResponse>
     */
    public CompletableFuture<ListApiTopNResponse> listApiTopNAsync(ListApiTopNRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApiTopN);
    }

    /**
     * 查询指定api 应用调用topN
     *
     * 查询指定api 应用调用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiTopNRequest 请求对象
     * @return AsyncInvoker<ListApiTopNRequest, ListApiTopNResponse>
     */
    public AsyncInvoker<ListApiTopNRequest, ListApiTopNResponse> listApiTopNAsyncInvoker(ListApiTopNRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApiTopN, hcClient);
    }

    /**
     * 获取网关分组
     *
     * 获取网关分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApicGroupsRequest 请求对象
     * @return CompletableFuture<ListApicGroupsResponse>
     */
    public CompletableFuture<ListApicGroupsResponse> listApicGroupsAsync(ListApicGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApicGroups);
    }

    /**
     * 获取网关分组
     *
     * 获取网关分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApicGroupsRequest 请求对象
     * @return AsyncInvoker<ListApicGroupsRequest, ListApicGroupsResponse>
     */
    public AsyncInvoker<ListApicGroupsRequest, ListApicGroupsResponse> listApicGroupsAsyncInvoker(
        ListApicGroupsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApicGroups, hcClient);
    }

    /**
     * 获取网关实例(专享版)
     *
     * 获取网关实例(专享版)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApicInstancesRequest 请求对象
     * @return CompletableFuture<ListApicInstancesResponse>
     */
    public CompletableFuture<ListApicInstancesResponse> listApicInstancesAsync(ListApicInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApicInstances);
    }

    /**
     * 获取网关实例(专享版)
     *
     * 获取网关实例(专享版)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApicInstancesRequest 请求对象
     * @return AsyncInvoker<ListApicInstancesRequest, ListApicInstancesResponse>
     */
    public AsyncInvoker<ListApicInstancesRequest, ListApicInstancesResponse> listApicInstancesAsyncInvoker(
        ListApicInstancesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApicInstances, hcClient);
    }

    /**
     * 查询api 服务调用topN
     *
     * 查询api 服务调用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisTopRequest 请求对象
     * @return CompletableFuture<ListApisTopResponse>
     */
    public CompletableFuture<ListApisTopResponse> listApisTopAsync(ListApisTopRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApisTop);
    }

    /**
     * 查询api 服务调用topN
     *
     * 查询api 服务调用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisTopRequest 请求对象
     * @return AsyncInvoker<ListApisTopRequest, ListApisTopResponse>
     */
    public AsyncInvoker<ListApisTopRequest, ListApisTopResponse> listApisTopAsyncInvoker(ListApisTopRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApisTop, hcClient);
    }

    /**
     * 查询申请列表
     *
     * 查询申请列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplyRequest 请求对象
     * @return CompletableFuture<ListApplyResponse>
     */
    public CompletableFuture<ListApplyResponse> listApplyAsync(ListApplyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApply);
    }

    /**
     * 查询申请列表
     *
     * 查询申请列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplyRequest 请求对象
     * @return AsyncInvoker<ListApplyRequest, ListApplyResponse>
     */
    public AsyncInvoker<ListApplyRequest, ListApplyResponse> listApplyAsyncInvoker(ListApplyRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApply, hcClient);
    }

    /**
     * 查询审批人列表
     *
     * 查询审批人列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApproversRequest 请求对象
     * @return CompletableFuture<ListApproversResponse>
     */
    public CompletableFuture<ListApproversResponse> listApproversAsync(ListApproversRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApprovers);
    }

    /**
     * 查询审批人列表
     *
     * 查询审批人列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApproversRequest 请求对象
     * @return AsyncInvoker<ListApproversRequest, ListApproversResponse>
     */
    public AsyncInvoker<ListApproversRequest, ListApproversResponse> listApproversAsyncInvoker(
        ListApproversRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApprovers, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApps);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApps, hcClient);
    }

    /**
     * 查询app 服务使用topN
     *
     * 查询app 服务使用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsTopRequest 请求对象
     * @return CompletableFuture<ListAppsTopResponse>
     */
    public CompletableFuture<ListAppsTopResponse> listAppsTopAsync(ListAppsTopRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listAppsTop);
    }

    /**
     * 查询app 服务使用topN
     *
     * 查询app 服务使用topN。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsTopRequest 请求对象
     * @return AsyncInvoker<ListAppsTopRequest, ListAppsTopResponse>
     */
    public AsyncInvoker<ListAppsTopRequest, ListAppsTopResponse> listAppsTopAsyncInvoker(ListAppsTopRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listAppsTop, hcClient);
    }

    /**
     * 查看指标维度信息
     *
     * 查看指标维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricDimensionsRequest 请求对象
     * @return CompletableFuture<ListBizMetricDimensionsResponse>
     */
    public CompletableFuture<ListBizMetricDimensionsResponse> listBizMetricDimensionsAsync(
        ListBizMetricDimensionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listBizMetricDimensions);
    }

    /**
     * 查看指标维度信息
     *
     * 查看指标维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricDimensionsRequest 请求对象
     * @return AsyncInvoker<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse>
     */
    public AsyncInvoker<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse> listBizMetricDimensionsAsyncInvoker(
        ListBizMetricDimensionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listBizMetricDimensions, hcClient);
    }

    /**
     * 查看指标指标责任人信息
     *
     * 查看指标指标责任人信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricOwnersRequest 请求对象
     * @return CompletableFuture<ListBizMetricOwnersResponse>
     */
    public CompletableFuture<ListBizMetricOwnersResponse> listBizMetricOwnersAsync(ListBizMetricOwnersRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listBizMetricOwners);
    }

    /**
     * 查看指标指标责任人信息
     *
     * 查看指标指标责任人信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricOwnersRequest 请求对象
     * @return AsyncInvoker<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse>
     */
    public AsyncInvoker<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse> listBizMetricOwnersAsyncInvoker(
        ListBizMetricOwnersRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listBizMetricOwners, hcClient);
    }

    /**
     * 查询业务指标信息
     *
     * 通过名称、创建者、修改时间分页查找业务指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricsRequest 请求对象
     * @return CompletableFuture<ListBizMetricsResponse>
     */
    public CompletableFuture<ListBizMetricsResponse> listBizMetricsAsync(ListBizMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listBizMetrics);
    }

    /**
     * 查询业务指标信息
     *
     * 通过名称、创建者、修改时间分页查找业务指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBizMetricsRequest 请求对象
     * @return AsyncInvoker<ListBizMetricsRequest, ListBizMetricsResponse>
     */
    public AsyncInvoker<ListBizMetricsRequest, ListBizMetricsResponse> listBizMetricsAsyncInvoker(
        ListBizMetricsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listBizMetrics, hcClient);
    }

    /**
     * 获取主题树信息
     *
     * 获取数据资产主题树信息l1，l2，l3。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessRequest 请求对象
     * @return CompletableFuture<ListBusinessResponse>
     */
    public CompletableFuture<ListBusinessResponse> listBusinessAsync(ListBusinessRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listBusiness);
    }

    /**
     * 获取主题树信息
     *
     * 获取数据资产主题树信息l1，l2，l3。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessRequest 请求对象
     * @return AsyncInvoker<ListBusinessRequest, ListBusinessResponse>
     */
    public AsyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessAsyncInvoker(
        ListBusinessRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listBusiness, hcClient);
    }

    /**
     * 获取当前目录下的目录列表（全量）
     *
     * 获取当前目录下的目录列表（全量数据，不分页，推荐仅用于生成目录树等无法分页的场景）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogListRequest 请求对象
     * @return CompletableFuture<ListCatalogListResponse>
     */
    public CompletableFuture<ListCatalogListResponse> listCatalogListAsync(ListCatalogListRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listCatalogList);
    }

    /**
     * 获取当前目录下的目录列表（全量）
     *
     * 获取当前目录下的目录列表（全量数据，不分页，推荐仅用于生成目录树等无法分页的场景）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogListRequest 请求对象
     * @return AsyncInvoker<ListCatalogListRequest, ListCatalogListResponse>
     */
    public AsyncInvoker<ListCatalogListRequest, ListCatalogListResponse> listCatalogListAsyncInvoker(
        ListCatalogListRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listCatalogList, hcClient);
    }

    /**
     * 获取所有流程架构目录树
     *
     * 获取所有目录树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogTreeRequest 请求对象
     * @return CompletableFuture<ListCatalogTreeResponse>
     */
    public CompletableFuture<ListCatalogTreeResponse> listCatalogTreeAsync(ListCatalogTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listCatalogTree);
    }

    /**
     * 获取所有流程架构目录树
     *
     * 获取所有目录树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogTreeRequest 请求对象
     * @return AsyncInvoker<ListCatalogTreeRequest, ListCatalogTreeResponse>
     */
    public AsyncInvoker<ListCatalogTreeRequest, ListCatalogTreeResponse> listCatalogTreeAsyncInvoker(
        ListCatalogTreeRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listCatalogTree, hcClient);
    }

    /**
     * 获取作业目录
     *
     * 获取作业目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCategoryRequest 请求对象
     * @return CompletableFuture<ListCategoryResponse>
     */
    public CompletableFuture<ListCategoryResponse> listCategoryAsync(ListCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listCategory);
    }

    /**
     * 获取作业目录
     *
     * 获取作业目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCategoryRequest 请求对象
     * @return AsyncInvoker<ListCategoryRequest, ListCategoryResponse>
     */
    public AsyncInvoker<ListCategoryRequest, ListCategoryResponse> listCategoryAsyncInvoker(
        ListCategoryRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listCategory, hcClient);
    }

    /**
     * 获取数据源中表的字段
     *
     * 获取数据源中表的字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListColumnsRequest 请求对象
     * @return CompletableFuture<ListColumnsResponse>
     */
    public CompletableFuture<ListColumnsResponse> listColumnsAsync(ListColumnsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listColumns);
    }

    /**
     * 获取数据源中表的字段
     *
     * 获取数据源中表的字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListColumnsRequest 请求对象
     * @return AsyncInvoker<ListColumnsRequest, ListColumnsResponse>
     */
    public AsyncInvoker<ListColumnsRequest, ListColumnsResponse> listColumnsAsyncInvoker(ListColumnsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listColumns, hcClient);
    }

    /**
     * 查找复合指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找复合指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompoundMetricsRequest 请求对象
     * @return CompletableFuture<ListCompoundMetricsResponse>
     */
    public CompletableFuture<ListCompoundMetricsResponse> listCompoundMetricsAsync(ListCompoundMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listCompoundMetrics);
    }

    /**
     * 查找复合指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找复合指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompoundMetricsRequest 请求对象
     * @return AsyncInvoker<ListCompoundMetricsRequest, ListCompoundMetricsResponse>
     */
    public AsyncInvoker<ListCompoundMetricsRequest, ListCompoundMetricsResponse> listCompoundMetricsAsyncInvoker(
        ListCompoundMetricsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listCompoundMetrics, hcClient);
    }

    /**
     * 查找业务限定
     *
     * 通过中英文名称、描述、创建者、审核人、限定分组id、修改时间状态分页查找限定信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConditionRequest 请求对象
     * @return CompletableFuture<ListConditionResponse>
     */
    public CompletableFuture<ListConditionResponse> listConditionAsync(ListConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listCondition);
    }

    /**
     * 查找业务限定
     *
     * 通过中英文名称、描述、创建者、审核人、限定分组id、修改时间状态分页查找限定信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConditionRequest 请求对象
     * @return AsyncInvoker<ListConditionRequest, ListConditionResponse>
     */
    public AsyncInvoker<ListConditionRequest, ListConditionResponse> listConditionAsyncInvoker(
        ListConditionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listCondition, hcClient);
    }

    /**
     * 获取对账作业列表
     *
     * 获取对账作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsistencyTaskRequest 请求对象
     * @return CompletableFuture<ListConsistencyTaskResponse>
     */
    public CompletableFuture<ListConsistencyTaskResponse> listConsistencyTaskAsync(ListConsistencyTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listConsistencyTask);
    }

    /**
     * 获取对账作业列表
     *
     * 获取对账作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsistencyTaskRequest 请求对象
     * @return AsyncInvoker<ListConsistencyTaskRequest, ListConsistencyTaskResponse>
     */
    public AsyncInvoker<ListConsistencyTaskRequest, ListConsistencyTaskResponse> listConsistencyTaskAsyncInvoker(
        ListConsistencyTaskRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listConsistencyTask, hcClient);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataArtsStudioInstancesRequest 请求对象
     * @return CompletableFuture<ListDataArtsStudioInstancesResponse>
     */
    public CompletableFuture<ListDataArtsStudioInstancesResponse> listDataArtsStudioInstancesAsync(
        ListDataArtsStudioInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDataArtsStudioInstances);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataArtsStudioInstancesRequest 请求对象
     * @return AsyncInvoker<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse>
     */
    public AsyncInvoker<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse> listDataArtsStudioInstancesAsyncInvoker(
        ListDataArtsStudioInstancesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDataArtsStudioInstances, hcClient);
    }

    /**
     * 获取数据源中的表
     *
     * 获取数据源中的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTablesRequest 请求对象
     * @return CompletableFuture<ListDataTablesResponse>
     */
    public CompletableFuture<ListDataTablesResponse> listDataTablesAsync(ListDataTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDataTables);
    }

    /**
     * 获取数据源中的表
     *
     * 获取数据源中的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTablesRequest 请求对象
     * @return AsyncInvoker<ListDataTablesRequest, ListDataTablesResponse>
     */
    public AsyncInvoker<ListDataTablesRequest, ListDataTablesResponse> listDataTablesAsyncInvoker(
        ListDataTablesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDataTables, hcClient);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDatabases);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataconnectionsRequest 请求对象
     * @return CompletableFuture<ListDataconnectionsResponse>
     */
    public CompletableFuture<ListDataconnectionsResponse> listDataconnectionsAsync(ListDataconnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDataconnections);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataconnectionsRequest 请求对象
     * @return AsyncInvoker<ListDataconnectionsRequest, ListDataconnectionsResponse>
     */
    public AsyncInvoker<ListDataconnectionsRequest, ListDataconnectionsResponse> listDataconnectionsAsyncInvoker(
        ListDataconnectionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDataconnections, hcClient);
    }

    /**
     * 查找衍生指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找衍生指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDerivativeIndexesRequest 请求对象
     * @return CompletableFuture<ListDerivativeIndexesResponse>
     */
    public CompletableFuture<ListDerivativeIndexesResponse> listDerivativeIndexesAsync(
        ListDerivativeIndexesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDerivativeIndexes);
    }

    /**
     * 查找衍生指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找衍生指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDerivativeIndexesRequest 请求对象
     * @return AsyncInvoker<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse>
     */
    public AsyncInvoker<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse> listDerivativeIndexesAsyncInvoker(
        ListDerivativeIndexesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDerivativeIndexes, hcClient);
    }

    /**
     * 查看维度颗粒度
     *
     * 查询维度颗粒度，依据tableId查询涉及所有维度，不传tableId查询所有维度组颗粒度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionGroupsRequest 请求对象
     * @return CompletableFuture<ListDimensionGroupsResponse>
     */
    public CompletableFuture<ListDimensionGroupsResponse> listDimensionGroupsAsync(ListDimensionGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDimensionGroups);
    }

    /**
     * 查看维度颗粒度
     *
     * 查询维度颗粒度，依据tableId查询涉及所有维度，不传tableId查询所有维度组颗粒度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionGroupsRequest 请求对象
     * @return AsyncInvoker<ListDimensionGroupsRequest, ListDimensionGroupsResponse>
     */
    public AsyncInvoker<ListDimensionGroupsRequest, ListDimensionGroupsResponse> listDimensionGroupsAsyncInvoker(
        ListDimensionGroupsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDimensionGroups, hcClient);
    }

    /**
     * 查找维度表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找维度表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionLogicTablesRequest 请求对象
     * @return CompletableFuture<ListDimensionLogicTablesResponse>
     */
    public CompletableFuture<ListDimensionLogicTablesResponse> listDimensionLogicTablesAsync(
        ListDimensionLogicTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDimensionLogicTables);
    }

    /**
     * 查找维度表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找维度表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionLogicTablesRequest 请求对象
     * @return AsyncInvoker<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse>
     */
    public AsyncInvoker<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse> listDimensionLogicTablesAsyncInvoker(
        ListDimensionLogicTablesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDimensionLogicTables, hcClient);
    }

    /**
     * 查找维度
     *
     * 通过中英文名称、描述、创建者、审核人、状态、l3Id、衍生指标idList、修改时间分页查找维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionsRequest 请求对象
     * @return CompletableFuture<ListDimensionsResponse>
     */
    public CompletableFuture<ListDimensionsResponse> listDimensionsAsync(ListDimensionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDimensions);
    }

    /**
     * 查找维度
     *
     * 通过中英文名称、描述、创建者、审核人、状态、l3Id、衍生指标idList、修改时间分页查找维度信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDimensionsRequest 请求对象
     * @return AsyncInvoker<ListDimensionsRequest, ListDimensionsResponse>
     */
    public AsyncInvoker<ListDimensionsRequest, ListDimensionsResponse> listDimensionsAsyncInvoker(
        ListDimensionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDimensions, hcClient);
    }

    /**
     * 获取所有目录
     *
     * 获取所有目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoriesRequest 请求对象
     * @return CompletableFuture<ListDirectoriesResponse>
     */
    public CompletableFuture<ListDirectoriesResponse> listDirectoriesAsync(ListDirectoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listDirectories);
    }

    /**
     * 获取所有目录
     *
     * 获取所有目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoriesRequest 请求对象
     * @return AsyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse>
     */
    public AsyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse> listDirectoriesAsyncInvoker(
        ListDirectoriesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listDirectories, hcClient);
    }

    /**
     * 查找事实表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找事实表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactLogicTablesRequest 请求对象
     * @return CompletableFuture<ListFactLogicTablesResponse>
     */
    public CompletableFuture<ListFactLogicTablesResponse> listFactLogicTablesAsync(ListFactLogicTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listFactLogicTables);
    }

    /**
     * 查找事实表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找事实表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactLogicTablesRequest 请求对象
     * @return AsyncInvoker<ListFactLogicTablesRequest, ListFactLogicTablesResponse>
     */
    public AsyncInvoker<ListFactLogicTablesRequest, ListFactLogicTablesResponse> listFactLogicTablesAsyncInvoker(
        ListFactLogicTablesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listFactLogicTables, hcClient);
    }

    /**
     * 查询告警通知记录
     *
     * 查询告警通知记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryAlarmInfoRequest 请求对象
     * @return CompletableFuture<ListFactoryAlarmInfoResponse>
     */
    public CompletableFuture<ListFactoryAlarmInfoResponse> listFactoryAlarmInfoAsync(
        ListFactoryAlarmInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listFactoryAlarmInfo);
    }

    /**
     * 查询告警通知记录
     *
     * 查询告警通知记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryAlarmInfoRequest 请求对象
     * @return AsyncInvoker<ListFactoryAlarmInfoRequest, ListFactoryAlarmInfoResponse>
     */
    public AsyncInvoker<ListFactoryAlarmInfoRequest, ListFactoryAlarmInfoResponse> listFactoryAlarmInfoAsyncInvoker(
        ListFactoryAlarmInfoRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listFactoryAlarmInfo, hcClient);
    }

    /**
     * 查询指定作业的实例列表
     *
     * 查询指定作业的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryJobInstancesByNameRequest 请求对象
     * @return CompletableFuture<ListFactoryJobInstancesByNameResponse>
     */
    public CompletableFuture<ListFactoryJobInstancesByNameResponse> listFactoryJobInstancesByNameAsync(
        ListFactoryJobInstancesByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listFactoryJobInstancesByName);
    }

    /**
     * 查询指定作业的实例列表
     *
     * 查询指定作业的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryJobInstancesByNameRequest 请求对象
     * @return AsyncInvoker<ListFactoryJobInstancesByNameRequest, ListFactoryJobInstancesByNameResponse>
     */
    public AsyncInvoker<ListFactoryJobInstancesByNameRequest, ListFactoryJobInstancesByNameResponse> listFactoryJobInstancesByNameAsyncInvoker(
        ListFactoryJobInstancesByNameRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listFactoryJobInstancesByName, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryJobsRequest 请求对象
     * @return CompletableFuture<ListFactoryJobsResponse>
     */
    public CompletableFuture<ListFactoryJobsResponse> listFactoryJobsAsync(ListFactoryJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listFactoryJobs);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryJobsRequest 请求对象
     * @return AsyncInvoker<ListFactoryJobsRequest, ListFactoryJobsResponse>
     */
    public AsyncInvoker<ListFactoryJobsRequest, ListFactoryJobsResponse> listFactoryJobsAsyncInvoker(
        ListFactoryJobsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listFactoryJobs, hcClient);
    }

    /**
     * 查询发布包列表
     *
     * 查询发布包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryReleasePackagesRequest 请求对象
     * @return CompletableFuture<ListFactoryReleasePackagesResponse>
     */
    public CompletableFuture<ListFactoryReleasePackagesResponse> listFactoryReleasePackagesAsync(
        ListFactoryReleasePackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listFactoryReleasePackages);
    }

    /**
     * 查询发布包列表
     *
     * 查询发布包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryReleasePackagesRequest 请求对象
     * @return AsyncInvoker<ListFactoryReleasePackagesRequest, ListFactoryReleasePackagesResponse>
     */
    public AsyncInvoker<ListFactoryReleasePackagesRequest, ListFactoryReleasePackagesResponse> listFactoryReleasePackagesAsyncInvoker(
        ListFactoryReleasePackagesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listFactoryReleasePackages, hcClient);
    }

    /**
     * 查询任务完成情况
     *
     * 查询任务完成情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryTaskCompletionRequest 请求对象
     * @return CompletableFuture<ListFactoryTaskCompletionResponse>
     */
    public CompletableFuture<ListFactoryTaskCompletionResponse> listFactoryTaskCompletionAsync(
        ListFactoryTaskCompletionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listFactoryTaskCompletion);
    }

    /**
     * 查询任务完成情况
     *
     * 查询任务完成情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryTaskCompletionRequest 请求对象
     * @return AsyncInvoker<ListFactoryTaskCompletionRequest, ListFactoryTaskCompletionResponse>
     */
    public AsyncInvoker<ListFactoryTaskCompletionRequest, ListFactoryTaskCompletionResponse> listFactoryTaskCompletionAsyncInvoker(
        ListFactoryTaskCompletionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listFactoryTaskCompletion, hcClient);
    }

    /**
     * 查询实例运行状态
     *
     * 查询实例运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryTaskOverviewRequest 请求对象
     * @return CompletableFuture<ListFactoryTaskOverviewResponse>
     */
    public CompletableFuture<ListFactoryTaskOverviewResponse> listFactoryTaskOverviewAsync(
        ListFactoryTaskOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listFactoryTaskOverview);
    }

    /**
     * 查询实例运行状态
     *
     * 查询实例运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFactoryTaskOverviewRequest 请求对象
     * @return AsyncInvoker<ListFactoryTaskOverviewRequest, ListFactoryTaskOverviewResponse>
     */
    public AsyncInvoker<ListFactoryTaskOverviewRequest, ListFactoryTaskOverviewResponse> listFactoryTaskOverviewAsyncInvoker(
        ListFactoryTaskOverviewRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listFactoryTaskOverview, hcClient);
    }

    /**
     * 获取任务执行结果列表
     *
     * 获取任务执行结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listInstances);
    }

    /**
     * 获取任务执行结果列表
     *
     * 获取任务执行结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listInstances, hcClient);
    }

    /**
     * 获取工作空间列表
     *
     * 获取工作空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagerWorkSpacesRequest 请求对象
     * @return CompletableFuture<ListManagerWorkSpacesResponse>
     */
    public CompletableFuture<ListManagerWorkSpacesResponse> listManagerWorkSpacesAsync(
        ListManagerWorkSpacesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listManagerWorkSpaces);
    }

    /**
     * 获取工作空间列表
     *
     * 获取工作空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagerWorkSpacesRequest 请求对象
     * @return AsyncInvoker<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse>
     */
    public AsyncInvoker<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse> listManagerWorkSpacesAsyncInvoker(
        ListManagerWorkSpacesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listManagerWorkSpaces, hcClient);
    }

    /**
     * 查询消息列表
     *
     * 查询审核中心的通知消息列表。与申请不同，通知类消息，无法驳回，仅能在指定的时间范围内作出处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageRequest 请求对象
     * @return CompletableFuture<ListMessageResponse>
     */
    public CompletableFuture<ListMessageResponse> listMessageAsync(ListMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listMessage);
    }

    /**
     * 查询消息列表
     *
     * 查询审核中心的通知消息列表。与申请不同，通知类消息，无法驳回，仅能在指定的时间范围内作出处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageRequest 请求对象
     * @return AsyncInvoker<ListMessageRequest, ListMessageResponse>
     */
    public AsyncInvoker<ListMessageRequest, ListMessageResponse> listMessageAsyncInvoker(ListMessageRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listMessage, hcClient);
    }

    /**
     * 获取指标关联信息
     *
     * 获取当前指标图谱。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricRelationsRequest 请求对象
     * @return CompletableFuture<ListMetricRelationsResponse>
     */
    public CompletableFuture<ListMetricRelationsResponse> listMetricRelationsAsync(ListMetricRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listMetricRelations);
    }

    /**
     * 获取指标关联信息
     *
     * 获取当前指标图谱。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricRelationsRequest 请求对象
     * @return AsyncInvoker<ListMetricRelationsRequest, ListMetricRelationsResponse>
     */
    public AsyncInvoker<ListMetricRelationsRequest, ListMetricRelationsResponse> listMetricRelationsAsyncInvoker(
        ListMetricRelationsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listMetricRelations, hcClient);
    }

    /**
     * 获取质量作业列表
     *
     * 获取质量作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTaskRequest 请求对象
     * @return CompletableFuture<ListQualityTaskResponse>
     */
    public CompletableFuture<ListQualityTaskResponse> listQualityTaskAsync(ListQualityTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listQualityTask);
    }

    /**
     * 获取质量作业列表
     *
     * 获取质量作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTaskRequest 请求对象
     * @return AsyncInvoker<ListQualityTaskRequest, ListQualityTaskResponse>
     */
    public AsyncInvoker<ListQualityTaskRequest, ListQualityTaskResponse> listQualityTaskAsyncInvoker(
        ListQualityTaskRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listQualityTask, hcClient);
    }

    /**
     * 获取质量作业列表V1
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTaskListsRequest 请求对象
     * @return CompletableFuture<ListQualityTaskListsResponse>
     */
    public CompletableFuture<ListQualityTaskListsResponse> listQualityTaskListsAsync(
        ListQualityTaskListsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listQualityTaskLists);
    }

    /**
     * 获取质量作业列表V1
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTaskListsRequest 请求对象
     * @return AsyncInvoker<ListQualityTaskListsRequest, ListQualityTaskListsResponse>
     */
    public AsyncInvoker<ListQualityTaskListsRequest, ListQualityTaskListsResponse> listQualityTaskListsAsyncInvoker(
        ListQualityTaskListsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listQualityTaskLists, hcClient);
    }

    /**
     * 获取规则模板列表
     *
     * 分页获取规则模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTemplatesRequest 请求对象
     * @return CompletableFuture<ListQualityTemplatesResponse>
     */
    public CompletableFuture<ListQualityTemplatesResponse> listQualityTemplatesAsync(
        ListQualityTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listQualityTemplates);
    }

    /**
     * 获取规则模板列表
     *
     * 分页获取规则模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityTemplatesRequest 请求对象
     * @return AsyncInvoker<ListQualityTemplatesRequest, ListQualityTemplatesResponse>
     */
    public AsyncInvoker<ListQualityTemplatesRequest, ListQualityTemplatesResponse> listQualityTemplatesAsyncInvoker(
        ListQualityTemplatesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listQualityTemplates, hcClient);
    }

    /**
     * 关系
     *
     * 通过名称、等分页查找关系信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelationsRequest 请求对象
     * @return CompletableFuture<ListRelationsResponse>
     */
    public CompletableFuture<ListRelationsResponse> listRelationsAsync(ListRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listRelations);
    }

    /**
     * 关系
     *
     * 通过名称、等分页查找关系信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelationsRequest 请求对象
     * @return AsyncInvoker<ListRelationsRequest, ListRelationsResponse>
     */
    public AsyncInvoker<ListRelationsRequest, ListRelationsResponse> listRelationsAsyncInvoker(
        ListRelationsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listRelations, hcClient);
    }

    /**
     * 获取schemas
     *
     * 获取schemas,目前只有DWS和采用postgresql驱动的RDS数据源支持schema,请在调用前确认该数据源是否支持schema字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return CompletableFuture<ListSchemasResponse>
     */
    public CompletableFuture<ListSchemasResponse> listSchemasAsync(ListSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSchemas);
    }

    /**
     * 获取schemas
     *
     * 获取schemas,目前只有DWS和采用postgresql驱动的RDS数据源支持schema,请在调用前确认该数据源是否支持schema字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return AsyncInvoker<ListSchemasRequest, ListSchemasResponse>
     */
    public AsyncInvoker<ListSchemasRequest, ListSchemasResponse> listSchemasAsyncInvoker(ListSchemasRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSchemas, hcClient);
    }

    /**
     * 查询当前空间下分配的队列资源
     *
     * 查询当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityAssignedQueuesRequest 请求对象
     * @return CompletableFuture<ListSecurityAssignedQueuesResponse>
     */
    public CompletableFuture<ListSecurityAssignedQueuesResponse> listSecurityAssignedQueuesAsync(
        ListSecurityAssignedQueuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityAssignedQueues);
    }

    /**
     * 查询当前空间下分配的队列资源
     *
     * 查询当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityAssignedQueuesRequest 请求对象
     * @return AsyncInvoker<ListSecurityAssignedQueuesRequest, ListSecurityAssignedQueuesResponse>
     */
    public AsyncInvoker<ListSecurityAssignedQueuesRequest, ListSecurityAssignedQueuesResponse> listSecurityAssignedQueuesAsyncInvoker(
        ListSecurityAssignedQueuesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityAssignedQueues, hcClient);
    }

    /**
     * 查询规则组列表
     *
     * 查询规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataClassificationRuleGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityDataClassificationRuleGroupsResponse>
     */
    public CompletableFuture<ListSecurityDataClassificationRuleGroupsResponse> listSecurityDataClassificationRuleGroupsAsync(
        ListSecurityDataClassificationRuleGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityDataClassificationRuleGroups);
    }

    /**
     * 查询规则组列表
     *
     * 查询规则组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataClassificationRuleGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityDataClassificationRuleGroupsRequest, ListSecurityDataClassificationRuleGroupsResponse>
     */
    public AsyncInvoker<ListSecurityDataClassificationRuleGroupsRequest, ListSecurityDataClassificationRuleGroupsResponse> listSecurityDataClassificationRuleGroupsAsyncInvoker(
        ListSecurityDataClassificationRuleGroupsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityDataClassificationRuleGroups, hcClient);
    }

    /**
     * 查询识别规则列表
     *
     * 查询识别规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataClassificationRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityDataClassificationRulesResponse>
     */
    public CompletableFuture<ListSecurityDataClassificationRulesResponse> listSecurityDataClassificationRulesAsync(
        ListSecurityDataClassificationRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityDataClassificationRules);
    }

    /**
     * 查询识别规则列表
     *
     * 查询识别规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDataClassificationRulesRequest 请求对象
     * @return AsyncInvoker<ListSecurityDataClassificationRulesRequest, ListSecurityDataClassificationRulesResponse>
     */
    public AsyncInvoker<ListSecurityDataClassificationRulesRequest, ListSecurityDataClassificationRulesResponse> listSecurityDataClassificationRulesAsyncInvoker(
        ListSecurityDataClassificationRulesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityDataClassificationRules, hcClient);
    }

    /**
     * 查询数据操作信息
     *
     * 查询数据操作信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceActionsRequest 请求对象
     * @return CompletableFuture<ListSecurityDatasourceActionsResponse>
     */
    public CompletableFuture<ListSecurityDatasourceActionsResponse> listSecurityDatasourceActionsAsync(
        ListSecurityDatasourceActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityDatasourceActions);
    }

    /**
     * 查询数据操作信息
     *
     * 查询数据操作信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceActionsRequest 请求对象
     * @return AsyncInvoker<ListSecurityDatasourceActionsRequest, ListSecurityDatasourceActionsResponse>
     */
    public AsyncInvoker<ListSecurityDatasourceActionsRequest, ListSecurityDatasourceActionsResponse> listSecurityDatasourceActionsAsyncInvoker(
        ListSecurityDatasourceActionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityDatasourceActions, hcClient);
    }

    /**
     * 查询数据源可配置权限
     *
     * 查询数据源可配置权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceConfigurationsRequest 请求对象
     * @return CompletableFuture<ListSecurityDatasourceConfigurationsResponse>
     */
    public CompletableFuture<ListSecurityDatasourceConfigurationsResponse> listSecurityDatasourceConfigurationsAsync(
        ListSecurityDatasourceConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityDatasourceConfigurations);
    }

    /**
     * 查询数据源可配置权限
     *
     * 查询数据源可配置权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListSecurityDatasourceConfigurationsRequest, ListSecurityDatasourceConfigurationsResponse>
     */
    public AsyncInvoker<ListSecurityDatasourceConfigurationsRequest, ListSecurityDatasourceConfigurationsResponse> listSecurityDatasourceConfigurationsAsyncInvoker(
        ListSecurityDatasourceConfigurationsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityDatasourceConfigurations, hcClient);
    }

    /**
     * 查询url信息
     *
     * 查询url信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceUrlsRequest 请求对象
     * @return CompletableFuture<ListSecurityDatasourceUrlsResponse>
     */
    public CompletableFuture<ListSecurityDatasourceUrlsResponse> listSecurityDatasourceUrlsAsync(
        ListSecurityDatasourceUrlsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityDatasourceUrls);
    }

    /**
     * 查询url信息
     *
     * 查询url信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDatasourceUrlsRequest 请求对象
     * @return AsyncInvoker<ListSecurityDatasourceUrlsRequest, ListSecurityDatasourceUrlsResponse>
     */
    public AsyncInvoker<ListSecurityDatasourceUrlsRequest, ListSecurityDatasourceUrlsResponse> listSecurityDatasourceUrlsAsyncInvoker(
        ListSecurityDatasourceUrlsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityDatasourceUrls, hcClient);
    }

    /**
     * 查询数据开发细粒度连接列表（全量）
     *
     * 查询数据开发细粒度连接列表（全量）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDlfDataWareHousesRequest 请求对象
     * @return CompletableFuture<ListSecurityDlfDataWareHousesResponse>
     */
    public CompletableFuture<ListSecurityDlfDataWareHousesResponse> listSecurityDlfDataWareHousesAsync(
        ListSecurityDlfDataWareHousesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityDlfDataWareHouses);
    }

    /**
     * 查询数据开发细粒度连接列表（全量）
     *
     * 查询数据开发细粒度连接列表（全量）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityDlfDataWareHousesRequest 请求对象
     * @return AsyncInvoker<ListSecurityDlfDataWareHousesRequest, ListSecurityDlfDataWareHousesResponse>
     */
    public AsyncInvoker<ListSecurityDlfDataWareHousesRequest, ListSecurityDlfDataWareHousesResponse> listSecurityDlfDataWareHousesAsyncInvoker(
        ListSecurityDlfDataWareHousesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityDlfDataWareHouses, hcClient);
    }

    /**
     * 查询用户同步列表
     *
     * 查询用户同步列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityMemberSyncTasksRequest 请求对象
     * @return CompletableFuture<ListSecurityMemberSyncTasksResponse>
     */
    public CompletableFuture<ListSecurityMemberSyncTasksResponse> listSecurityMemberSyncTasksAsync(
        ListSecurityMemberSyncTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityMemberSyncTasks);
    }

    /**
     * 查询用户同步列表
     *
     * 查询用户同步列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityMemberSyncTasksRequest 请求对象
     * @return AsyncInvoker<ListSecurityMemberSyncTasksRequest, ListSecurityMemberSyncTasksResponse>
     */
    public AsyncInvoker<ListSecurityMemberSyncTasksRequest, ListSecurityMemberSyncTasksResponse> listSecurityMemberSyncTasksAsyncInvoker(
        ListSecurityMemberSyncTasksRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityMemberSyncTasks, hcClient);
    }

    /**
     * 查询权限集成员列表
     *
     * 查询权限集成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetMembersRequest 请求对象
     * @return CompletableFuture<ListSecurityPermissionSetMembersResponse>
     */
    public CompletableFuture<ListSecurityPermissionSetMembersResponse> listSecurityPermissionSetMembersAsync(
        ListSecurityPermissionSetMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityPermissionSetMembers);
    }

    /**
     * 查询权限集成员列表
     *
     * 查询权限集成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetMembersRequest 请求对象
     * @return AsyncInvoker<ListSecurityPermissionSetMembersRequest, ListSecurityPermissionSetMembersResponse>
     */
    public AsyncInvoker<ListSecurityPermissionSetMembersRequest, ListSecurityPermissionSetMembersResponse> listSecurityPermissionSetMembersAsyncInvoker(
        ListSecurityPermissionSetMembersRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityPermissionSetMembers, hcClient);
    }

    /**
     * 查询权限集的权限列表
     *
     * 查询权限集的权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetPermissionsRequest 请求对象
     * @return CompletableFuture<ListSecurityPermissionSetPermissionsResponse>
     */
    public CompletableFuture<ListSecurityPermissionSetPermissionsResponse> listSecurityPermissionSetPermissionsAsync(
        ListSecurityPermissionSetPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityPermissionSetPermissions);
    }

    /**
     * 查询权限集的权限列表
     *
     * 查询权限集的权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetPermissionsRequest 请求对象
     * @return AsyncInvoker<ListSecurityPermissionSetPermissionsRequest, ListSecurityPermissionSetPermissionsResponse>
     */
    public AsyncInvoker<ListSecurityPermissionSetPermissionsRequest, ListSecurityPermissionSetPermissionsResponse> listSecurityPermissionSetPermissionsAsyncInvoker(
        ListSecurityPermissionSetPermissionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityPermissionSetPermissions, hcClient);
    }

    /**
     * 查询权限集列表
     *
     * 查询权限集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetsRequest 请求对象
     * @return CompletableFuture<ListSecurityPermissionSetsResponse>
     */
    public CompletableFuture<ListSecurityPermissionSetsResponse> listSecurityPermissionSetsAsync(
        ListSecurityPermissionSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityPermissionSets);
    }

    /**
     * 查询权限集列表
     *
     * 查询权限集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPermissionSetsRequest 请求对象
     * @return AsyncInvoker<ListSecurityPermissionSetsRequest, ListSecurityPermissionSetsResponse>
     */
    public AsyncInvoker<ListSecurityPermissionSetsRequest, ListSecurityPermissionSetsResponse> listSecurityPermissionSetsAsyncInvoker(
        ListSecurityPermissionSetsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityPermissionSets, hcClient);
    }

    /**
     * 查询角色对一组库、表的权限交集
     *
     * 查询角色对一组库、表的权限交集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRoleActionsRequest 请求对象
     * @return CompletableFuture<ListSecurityRoleActionsResponse>
     */
    public CompletableFuture<ListSecurityRoleActionsResponse> listSecurityRoleActionsAsync(
        ListSecurityRoleActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecurityRoleActions);
    }

    /**
     * 查询角色对一组库、表的权限交集
     *
     * 查询角色对一组库、表的权限交集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRoleActionsRequest 请求对象
     * @return AsyncInvoker<ListSecurityRoleActionsRequest, ListSecurityRoleActionsResponse>
     */
    public AsyncInvoker<ListSecurityRoleActionsRequest, ListSecurityRoleActionsResponse> listSecurityRoleActionsAsyncInvoker(
        ListSecurityRoleActionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecurityRoleActions, hcClient);
    }

    /**
     * 获取密级
     *
     * 获取密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecuritySecrecyLevelsRequest 请求对象
     * @return CompletableFuture<ListSecuritySecrecyLevelsResponse>
     */
    public CompletableFuture<ListSecuritySecrecyLevelsResponse> listSecuritySecrecyLevelsAsync(
        ListSecuritySecrecyLevelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecuritySecrecyLevels);
    }

    /**
     * 获取密级
     *
     * 获取密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecuritySecrecyLevelsRequest 请求对象
     * @return AsyncInvoker<ListSecuritySecrecyLevelsRequest, ListSecuritySecrecyLevelsResponse>
     */
    public AsyncInvoker<ListSecuritySecrecyLevelsRequest, ListSecuritySecrecyLevelsResponse> listSecuritySecrecyLevelsAsyncInvoker(
        ListSecuritySecrecyLevelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecuritySecrecyLevels, hcClient);
    }

    /**
     * 查询敏感数据发现概览结果(以分类和密级为单位)
     *
     * 查询敏感数据发现概览结果(以分类和密级为单位)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecuritySensitiveDataOverviewsRequest 请求对象
     * @return CompletableFuture<ListSecuritySensitiveDataOverviewsResponse>
     */
    public CompletableFuture<ListSecuritySensitiveDataOverviewsResponse> listSecuritySensitiveDataOverviewsAsync(
        ListSecuritySensitiveDataOverviewsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSecuritySensitiveDataOverviews);
    }

    /**
     * 查询敏感数据发现概览结果(以分类和密级为单位)
     *
     * 查询敏感数据发现概览结果(以分类和密级为单位)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecuritySensitiveDataOverviewsRequest 请求对象
     * @return AsyncInvoker<ListSecuritySensitiveDataOverviewsRequest, ListSecuritySensitiveDataOverviewsResponse>
     */
    public AsyncInvoker<ListSecuritySensitiveDataOverviewsRequest, ListSecuritySensitiveDataOverviewsResponse> listSecuritySensitiveDataOverviewsAsyncInvoker(
        ListSecuritySensitiveDataOverviewsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSecuritySensitiveDataOverviews, hcClient);
    }

    /**
     * 获取主题层级
     *
     * 获取主题层级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubjectLevelsRequest 请求对象
     * @return CompletableFuture<ListSubjectLevelsResponse>
     */
    public CompletableFuture<ListSubjectLevelsResponse> listSubjectLevelsAsync(ListSubjectLevelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listSubjectLevels);
    }

    /**
     * 获取主题层级
     *
     * 获取主题层级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubjectLevelsRequest 请求对象
     * @return AsyncInvoker<ListSubjectLevelsRequest, ListSubjectLevelsResponse>
     */
    public AsyncInvoker<ListSubjectLevelsRequest, ListSubjectLevelsResponse> listSubjectLevelsAsyncInvoker(
        ListSubjectLevelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listSubjectLevels, hcClient);
    }

    /**
     * 查询模型下所有关系
     *
     * 查询模型下所有关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableModelRelationsRequest 请求对象
     * @return CompletableFuture<ListTableModelRelationsResponse>
     */
    public CompletableFuture<ListTableModelRelationsResponse> listTableModelRelationsAsync(
        ListTableModelRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listTableModelRelations);
    }

    /**
     * 查询模型下所有关系
     *
     * 查询模型下所有关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableModelRelationsRequest 请求对象
     * @return AsyncInvoker<ListTableModelRelationsRequest, ListTableModelRelationsResponse>
     */
    public AsyncInvoker<ListTableModelRelationsRequest, ListTableModelRelationsResponse> listTableModelRelationsAsyncInvoker(
        ListTableModelRelationsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listTableModelRelations, hcClient);
    }

    /**
     * 查找表模型列表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找关系建模中的表模型信息，包括逻辑实体、物理表和其属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableModelsRequest 请求对象
     * @return CompletableFuture<ListTableModelsResponse>
     */
    public CompletableFuture<ListTableModelsResponse> listTableModelsAsync(ListTableModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listTableModels);
    }

    /**
     * 查找表模型列表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找关系建模中的表模型信息，包括逻辑实体、物理表和其属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableModelsRequest 请求对象
     * @return AsyncInvoker<ListTableModelsRequest, ListTableModelsResponse>
     */
    public AsyncInvoker<ListTableModelsRequest, ListTableModelsResponse> listTableModelsAsyncInvoker(
        ListTableModelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listTableModels, hcClient);
    }

    /**
     * 获取工作空间用户角色
     *
     * 获取工作空间用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceRolesRequest 请求对象
     * @return CompletableFuture<ListWorkspaceRolesResponse>
     */
    public CompletableFuture<ListWorkspaceRolesResponse> listWorkspaceRolesAsync(ListWorkspaceRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listWorkspaceRoles);
    }

    /**
     * 获取工作空间用户角色
     *
     * 获取工作空间用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceRolesRequest 请求对象
     * @return AsyncInvoker<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse>
     */
    public AsyncInvoker<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse> listWorkspaceRolesAsyncInvoker(
        ListWorkspaceRolesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listWorkspaceRoles, hcClient);
    }

    /**
     * 获取模型
     *
     * 获取模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return CompletableFuture<ListWorkspacesResponse>
     */
    public CompletableFuture<ListWorkspacesResponse> listWorkspacesAsync(ListWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listWorkspaces);
    }

    /**
     * 获取模型
     *
     * 获取模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesAsyncInvoker(
        ListWorkspacesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listWorkspaces, hcClient);
    }

    /**
     * 获取工作空间用户信息
     *
     * 获取工作空间用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceusersRequest 请求对象
     * @return CompletableFuture<ListWorkspaceusersResponse>
     */
    public CompletableFuture<ListWorkspaceusersResponse> listWorkspaceusersAsync(ListWorkspaceusersRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listWorkspaceusers);
    }

    /**
     * 获取工作空间用户信息
     *
     * 获取工作空间用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspaceusersRequest 请求对象
     * @return AsyncInvoker<ListWorkspaceusersRequest, ListWorkspaceusersResponse>
     */
    public AsyncInvoker<ListWorkspaceusersRequest, ListWorkspaceusersResponse> listWorkspaceusersAsyncInvoker(
        ListWorkspaceusersRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listWorkspaceusers, hcClient);
    }

    /**
     * 批量移动api至新目录
     *
     * 批量移动api至新目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateApiRequest 请求对象
     * @return CompletableFuture<MigrateApiResponse>
     */
    public CompletableFuture<MigrateApiResponse> migrateApiAsync(MigrateApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.migrateApi);
    }

    /**
     * 批量移动api至新目录
     *
     * 批量移动api至新目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateApiRequest 请求对象
     * @return AsyncInvoker<MigrateApiRequest, MigrateApiResponse>
     */
    public AsyncInvoker<MigrateApiRequest, MigrateApiResponse> migrateApiAsyncInvoker(MigrateApiRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.migrateApi, hcClient);
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
     * @return CompletableFuture<MigrateCatalogResponse>
     */
    public CompletableFuture<MigrateCatalogResponse> migrateCatalogAsync(MigrateCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.migrateCatalog);
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
     * @return AsyncInvoker<MigrateCatalogRequest, MigrateCatalogResponse>
     */
    public AsyncInvoker<MigrateCatalogRequest, MigrateCatalogResponse> migrateCatalogAsyncInvoker(
        MigrateCatalogRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.migrateCatalog, hcClient);
    }

    /**
     * 修改自定义项
     *
     * 修改自定义项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCustomizedFieldsRequest 请求对象
     * @return CompletableFuture<ModifyCustomizedFieldsResponse>
     */
    public CompletableFuture<ModifyCustomizedFieldsResponse> modifyCustomizedFieldsAsync(
        ModifyCustomizedFieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.modifyCustomizedFields);
    }

    /**
     * 修改自定义项
     *
     * 修改自定义项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCustomizedFieldsRequest 请求对象
     * @return AsyncInvoker<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse>
     */
    public AsyncInvoker<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse> modifyCustomizedFieldsAsyncInvoker(
        ModifyCustomizedFieldsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.modifyCustomizedFields, hcClient);
    }

    /**
     * 用户行为分析
     *
     * 用户行为分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseUserBehaviorRequest 请求对象
     * @return CompletableFuture<ParseUserBehaviorResponse>
     */
    public CompletableFuture<ParseUserBehaviorResponse> parseUserBehaviorAsync(ParseUserBehaviorRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.parseUserBehavior);
    }

    /**
     * 用户行为分析
     *
     * 用户行为分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseUserBehaviorRequest 请求对象
     * @return AsyncInvoker<ParseUserBehaviorRequest, ParseUserBehaviorResponse>
     */
    public AsyncInvoker<ParseUserBehaviorRequest, ParseUserBehaviorResponse> parseUserBehaviorAsyncInvoker(
        ParseUserBehaviorRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.parseUserBehavior, hcClient);
    }

    /**
     * DataArtsStudio实例一键购买接口
     *
     * DataArtsStudio实例一键购买接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PayForDgcOneKeyRequest 请求对象
     * @return CompletableFuture<PayForDgcOneKeyResponse>
     */
    public CompletableFuture<PayForDgcOneKeyResponse> payForDgcOneKeyAsync(PayForDgcOneKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.payForDgcOneKey);
    }

    /**
     * DataArtsStudio实例一键购买接口
     *
     * DataArtsStudio实例一键购买接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PayForDgcOneKeyRequest 请求对象
     * @return AsyncInvoker<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse>
     */
    public AsyncInvoker<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse> payForDgcOneKeyAsyncInvoker(
        PayForDgcOneKeyRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.payForDgcOneKey, hcClient);
    }

    /**
     * 删除标签
     *
     * 根据资产（表或属性）的ID删除资产标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDesignEntityTagsRequest 请求对象
     * @return CompletableFuture<RemoveDesignEntityTagsResponse>
     */
    public CompletableFuture<RemoveDesignEntityTagsResponse> removeDesignEntityTagsAsync(
        RemoveDesignEntityTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.removeDesignEntityTags);
    }

    /**
     * 删除标签
     *
     * 根据资产（表或属性）的ID删除资产标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDesignEntityTagsRequest 请求对象
     * @return AsyncInvoker<RemoveDesignEntityTagsRequest, RemoveDesignEntityTagsResponse>
     */
    public AsyncInvoker<RemoveDesignEntityTagsRequest, RemoveDesignEntityTagsResponse> removeDesignEntityTagsAsyncInvoker(
        RemoveDesignEntityTagsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.removeDesignEntityTags, hcClient);
    }

    /**
     * 清空质量规则
     *
     * 清空表的质量规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDesignQualityInfosRequest 请求对象
     * @return CompletableFuture<RemoveDesignQualityInfosResponse>
     */
    public CompletableFuture<RemoveDesignQualityInfosResponse> removeDesignQualityInfosAsync(
        RemoveDesignQualityInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.removeDesignQualityInfos);
    }

    /**
     * 清空质量规则
     *
     * 清空表的质量规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDesignQualityInfosRequest 请求对象
     * @return AsyncInvoker<RemoveDesignQualityInfosRequest, RemoveDesignQualityInfosResponse>
     */
    public AsyncInvoker<RemoveDesignQualityInfosRequest, RemoveDesignQualityInfosResponse> removeDesignQualityInfosAsyncInvoker(
        RemoveDesignQualityInfosRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.removeDesignQualityInfos, hcClient);
    }

    /**
     * 指定字段采集概要
     *
     * 指定字段采集概要信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenewDataProfileRequest 请求对象
     * @return CompletableFuture<RenewDataProfileResponse>
     */
    public CompletableFuture<RenewDataProfileResponse> renewDataProfileAsync(RenewDataProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.renewDataProfile);
    }

    /**
     * 指定字段采集概要
     *
     * 指定字段采集概要信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenewDataProfileRequest 请求对象
     * @return AsyncInvoker<RenewDataProfileRequest, RenewDataProfileResponse>
     */
    public AsyncInvoker<RenewDataProfileRequest, RenewDataProfileResponse> renewDataProfileAsyncInvoker(
        RenewDataProfileRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.renewDataProfile, hcClient);
    }

    /**
     * 关联属性与数据标准
     *
     * 关联属性与数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetLinkAttributeAndStandardRequest 请求对象
     * @return CompletableFuture<ResetLinkAttributeAndStandardResponse>
     */
    public CompletableFuture<ResetLinkAttributeAndStandardResponse> resetLinkAttributeAndStandardAsync(
        ResetLinkAttributeAndStandardRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.resetLinkAttributeAndStandard);
    }

    /**
     * 关联属性与数据标准
     *
     * 关联属性与数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetLinkAttributeAndStandardRequest 请求对象
     * @return AsyncInvoker<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse>
     */
    public AsyncInvoker<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse> resetLinkAttributeAndStandardAsyncInvoker(
        ResetLinkAttributeAndStandardRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.resetLinkAttributeAndStandard, hcClient);
    }

    /**
     * 撤回审批单
     *
     * 撤回审批单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackApprovalRequest 请求对象
     * @return CompletableFuture<RollbackApprovalResponse>
     */
    public CompletableFuture<RollbackApprovalResponse> rollbackApprovalAsync(RollbackApprovalRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.rollbackApproval);
    }

    /**
     * 撤回审批单
     *
     * 撤回审批单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackApprovalRequest 请求对象
     * @return AsyncInvoker<RollbackApprovalRequest, RollbackApprovalResponse>
     */
    public AsyncInvoker<RollbackApprovalRequest, RollbackApprovalResponse> rollbackApprovalAsyncInvoker(
        RollbackApprovalRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.rollbackApproval, hcClient);
    }

    /**
     * 获取审批单
     *
     * 获取审批单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchApprovalsRequest 请求对象
     * @return CompletableFuture<SearchApprovalsResponse>
     */
    public CompletableFuture<SearchApprovalsResponse> searchApprovalsAsync(SearchApprovalsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchApprovals);
    }

    /**
     * 获取审批单
     *
     * 获取审批单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchApprovalsRequest 请求对象
     * @return AsyncInvoker<SearchApprovalsRequest, SearchApprovalsResponse>
     */
    public AsyncInvoker<SearchApprovalsRequest, SearchApprovalsResponse> searchApprovalsAsyncInvoker(
        SearchApprovalsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchApprovals, hcClient);
    }

    /**
     * 查找原子指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找原子指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAtomicIndexesRequest 请求对象
     * @return CompletableFuture<SearchAtomicIndexesResponse>
     */
    public CompletableFuture<SearchAtomicIndexesResponse> searchAtomicIndexesAsync(SearchAtomicIndexesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchAtomicIndexes);
    }

    /**
     * 查找原子指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找原子指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAtomicIndexesRequest 请求对象
     * @return AsyncInvoker<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse>
     */
    public AsyncInvoker<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse> searchAtomicIndexesAsyncInvoker(
        SearchAtomicIndexesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchAtomicIndexes, hcClient);
    }

    /**
     * 查询API已授权的APP
     *
     * 查询API已授权的APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAuthorizeAppRequest 请求对象
     * @return CompletableFuture<SearchAuthorizeAppResponse>
     */
    public CompletableFuture<SearchAuthorizeAppResponse> searchAuthorizeAppAsync(SearchAuthorizeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchAuthorizeApp);
    }

    /**
     * 查询API已授权的APP
     *
     * 查询API已授权的APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAuthorizeAppRequest 请求对象
     * @return AsyncInvoker<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse>
     */
    public AsyncInvoker<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse> searchAuthorizeAppAsyncInvoker(
        SearchAuthorizeAppRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchAuthorizeApp, hcClient);
    }

    /**
     * 查询APP已拥有授权的API
     *
     * 查询APP已拥有授权的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBindApiRequest 请求对象
     * @return CompletableFuture<SearchBindApiResponse>
     */
    public CompletableFuture<SearchBindApiResponse> searchBindApiAsync(SearchBindApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchBindApi);
    }

    /**
     * 查询APP已拥有授权的API
     *
     * 查询APP已拥有授权的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBindApiRequest 请求对象
     * @return AsyncInvoker<SearchBindApiRequest, SearchBindApiResponse>
     */
    public AsyncInvoker<SearchBindApiRequest, SearchBindApiResponse> searchBindApiAsyncInvoker(
        SearchBindApiRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchBindApi, hcClient);
    }

    /**
     * 查询流程架构列表
     *
     * 查询流程架构列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCatalogsRequest 请求对象
     * @return CompletableFuture<SearchCatalogsResponse>
     */
    public CompletableFuture<SearchCatalogsResponse> searchCatalogsAsync(SearchCatalogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchCatalogs);
    }

    /**
     * 查询流程架构列表
     *
     * 查询流程架构列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCatalogsRequest 请求对象
     * @return AsyncInvoker<SearchCatalogsRequest, SearchCatalogsResponse>
     */
    public AsyncInvoker<SearchCatalogsRequest, SearchCatalogsResponse> searchCatalogsAsyncInvoker(
        SearchCatalogsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchCatalogs, hcClient);
    }

    /**
     * 查看码表字段值
     *
     * 查看码表字段值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCodeTableValuesRequest 请求对象
     * @return CompletableFuture<SearchCodeTableValuesResponse>
     */
    public CompletableFuture<SearchCodeTableValuesResponse> searchCodeTableValuesAsync(
        SearchCodeTableValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchCodeTableValues);
    }

    /**
     * 查看码表字段值
     *
     * 查看码表字段值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCodeTableValuesRequest 请求对象
     * @return AsyncInvoker<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse>
     */
    public AsyncInvoker<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse> searchCodeTableValuesAsyncInvoker(
        SearchCodeTableValuesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchCodeTableValues, hcClient);
    }

    /**
     * 查询码表列表
     *
     * 查询码表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCodeTablesRequest 请求对象
     * @return CompletableFuture<SearchCodeTablesResponse>
     */
    public CompletableFuture<SearchCodeTablesResponse> searchCodeTablesAsync(SearchCodeTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchCodeTables);
    }

    /**
     * 查询码表列表
     *
     * 查询码表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCodeTablesRequest 请求对象
     * @return AsyncInvoker<SearchCodeTablesRequest, SearchCodeTablesResponse>
     */
    public AsyncInvoker<SearchCodeTablesRequest, SearchCodeTablesResponse> searchCodeTablesAsyncInvoker(
        SearchCodeTablesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchCodeTables, hcClient);
    }

    /**
     * 查询自定义项
     *
     * 查询自定义项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCustomizedFieldsRequest 请求对象
     * @return CompletableFuture<SearchCustomizedFieldsResponse>
     */
    public CompletableFuture<SearchCustomizedFieldsResponse> searchCustomizedFieldsAsync(
        SearchCustomizedFieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchCustomizedFields);
    }

    /**
     * 查询自定义项
     *
     * 查询自定义项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCustomizedFieldsRequest 请求对象
     * @return AsyncInvoker<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse>
     */
    public AsyncInvoker<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse> searchCustomizedFieldsAsyncInvoker(
        SearchCustomizedFieldsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchCustomizedFields, hcClient);
    }

    /**
     * 获取下展信息与已发布实体的差异
     *
     * 当已发布的实体被编辑时，其会生成下展，该接口用于获取下展信息与已发布实体的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDesignLatestApprovalDiffRequest 请求对象
     * @return CompletableFuture<SearchDesignLatestApprovalDiffResponse>
     */
    public CompletableFuture<SearchDesignLatestApprovalDiffResponse> searchDesignLatestApprovalDiffAsync(
        SearchDesignLatestApprovalDiffRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchDesignLatestApprovalDiff);
    }

    /**
     * 获取下展信息与已发布实体的差异
     *
     * 当已发布的实体被编辑时，其会生成下展，该接口用于获取下展信息与已发布实体的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDesignLatestApprovalDiffRequest 请求对象
     * @return AsyncInvoker<SearchDesignLatestApprovalDiffRequest, SearchDesignLatestApprovalDiffResponse>
     */
    public AsyncInvoker<SearchDesignLatestApprovalDiffRequest, SearchDesignLatestApprovalDiffResponse> searchDesignLatestApprovalDiffAsyncInvoker(
        SearchDesignLatestApprovalDiffRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchDesignLatestApprovalDiff, hcClient);
    }

    /**
     * 获取数据连接信息
     *
     * 获取指定类型下的数据连接信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDwByTypeRequest 请求对象
     * @return CompletableFuture<SearchDwByTypeResponse>
     */
    public CompletableFuture<SearchDwByTypeResponse> searchDwByTypeAsync(SearchDwByTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchDwByType);
    }

    /**
     * 获取数据连接信息
     *
     * 获取指定类型下的数据连接信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDwByTypeRequest 请求对象
     * @return AsyncInvoker<SearchDwByTypeRequest, SearchDwByTypeResponse>
     */
    public AsyncInvoker<SearchDwByTypeRequest, SearchDwByTypeResponse> searchDwByTypeAsyncInvoker(
        SearchDwByTypeRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchDwByType, hcClient);
    }

    /**
     * 查询目的表和字段(待下线)
     *
     * 查询目的表和字段(待下线)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFieldsForRelationRequest 请求对象
     * @return CompletableFuture<SearchFieldsForRelationResponse>
     */
    public CompletableFuture<SearchFieldsForRelationResponse> searchFieldsForRelationAsync(
        SearchFieldsForRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchFieldsForRelation);
    }

    /**
     * 查询目的表和字段(待下线)
     *
     * 查询目的表和字段(待下线)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFieldsForRelationRequest 请求对象
     * @return AsyncInvoker<SearchFieldsForRelationRequest, SearchFieldsForRelationResponse>
     */
    public AsyncInvoker<SearchFieldsForRelationRequest, SearchFieldsForRelationResponse> searchFieldsForRelationAsyncInvoker(
        SearchFieldsForRelationRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchFieldsForRelation, hcClient);
    }

    /**
     * 通过路径获取id
     *
     * 通过路径获取id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchIdByPathRequest 请求对象
     * @return CompletableFuture<SearchIdByPathResponse>
     */
    public CompletableFuture<SearchIdByPathResponse> searchIdByPathAsync(SearchIdByPathRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchIdByPath);
    }

    /**
     * 通过路径获取id
     *
     * 通过路径获取id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchIdByPathRequest 请求对象
     * @return AsyncInvoker<SearchIdByPathRequest, SearchIdByPathResponse>
     */
    public AsyncInvoker<SearchIdByPathRequest, SearchIdByPathResponse> searchIdByPathAsyncInvoker(
        SearchIdByPathRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchIdByPath, hcClient);
    }

    /**
     * 查找主题列表
     *
     * 通过名称、创建者、责任人、状态、修改时间分页查找主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSubjectRequest 请求对象
     * @return CompletableFuture<SearchSubjectResponse>
     */
    public CompletableFuture<SearchSubjectResponse> searchSubjectAsync(SearchSubjectRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchSubject);
    }

    /**
     * 查找主题列表
     *
     * 通过名称、创建者、责任人、状态、修改时间分页查找主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSubjectRequest 请求对象
     * @return AsyncInvoker<SearchSubjectRequest, SearchSubjectResponse>
     */
    public AsyncInvoker<SearchSubjectRequest, SearchSubjectResponse> searchSubjectAsyncInvoker(
        SearchSubjectRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchSubject, hcClient);
    }

    /**
     * 查找主题列表(新)
     *
     * 查找主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSubjectNewRequest 请求对象
     * @return CompletableFuture<SearchSubjectNewResponse>
     */
    public CompletableFuture<SearchSubjectNewResponse> searchSubjectNewAsync(SearchSubjectNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchSubjectNew);
    }

    /**
     * 查找主题列表(新)
     *
     * 查找主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchSubjectNewRequest 请求对象
     * @return AsyncInvoker<SearchSubjectNewRequest, SearchSubjectNewResponse>
     */
    public AsyncInvoker<SearchSubjectNewRequest, SearchSubjectNewResponse> searchSubjectNewAsyncInvoker(
        SearchSubjectNewRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchSubjectNew, hcClient);
    }

    /**
     * 查找版本信息
     *
     * 通过名称、创建者、修改时间查找版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchVersionsRequest 请求对象
     * @return CompletableFuture<SearchVersionsResponse>
     */
    public CompletableFuture<SearchVersionsResponse> searchVersionsAsync(SearchVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchVersions);
    }

    /**
     * 查找版本信息
     *
     * 通过名称、创建者、修改时间查找版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchVersionsRequest 请求对象
     * @return AsyncInvoker<SearchVersionsRequest, SearchVersionsResponse>
     */
    public AsyncInvoker<SearchVersionsRequest, SearchVersionsResponse> searchVersionsAsyncInvoker(
        SearchVersionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchVersions, hcClient);
    }

    /**
     * 设置作业标签
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetFactoryJobTagsRequest 请求对象
     * @return CompletableFuture<SetFactoryJobTagsResponse>
     */
    public CompletableFuture<SetFactoryJobTagsResponse> setFactoryJobTagsAsync(SetFactoryJobTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.setFactoryJobTags);
    }

    /**
     * 设置作业标签
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetFactoryJobTagsRequest 请求对象
     * @return AsyncInvoker<SetFactoryJobTagsRequest, SetFactoryJobTagsResponse>
     */
    public AsyncInvoker<SetFactoryJobTagsRequest, SetFactoryJobTagsResponse> setFactoryJobTagsAsyncInvoker(
        SetFactoryJobTagsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.setFactoryJobTags, hcClient);
    }

    /**
     * 查看汇总表详情
     *
     * 通过ID查看汇总表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregationLogicTableByIdRequest 请求对象
     * @return CompletableFuture<ShowAggregationLogicTableByIdResponse>
     */
    public CompletableFuture<ShowAggregationLogicTableByIdResponse> showAggregationLogicTableByIdAsync(
        ShowAggregationLogicTableByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showAggregationLogicTableById);
    }

    /**
     * 查看汇总表详情
     *
     * 通过ID查看汇总表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregationLogicTableByIdRequest 请求对象
     * @return AsyncInvoker<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse>
     */
    public AsyncInvoker<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse> showAggregationLogicTableByIdAsyncInvoker(
        ShowAggregationLogicTableByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showAggregationLogicTableById, hcClient);
    }

    /**
     * 查询指定api 仪表板数据详情
     *
     * 查询指定api 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiDashboardRequest 请求对象
     * @return CompletableFuture<ShowApiDashboardResponse>
     */
    public CompletableFuture<ShowApiDashboardResponse> showApiDashboardAsync(ShowApiDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showApiDashboard);
    }

    /**
     * 查询指定api 仪表板数据详情
     *
     * 查询指定api 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiDashboardRequest 请求对象
     * @return AsyncInvoker<ShowApiDashboardRequest, ShowApiDashboardResponse>
     */
    public AsyncInvoker<ShowApiDashboardRequest, ShowApiDashboardResponse> showApiDashboardAsyncInvoker(
        ShowApiDashboardRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showApiDashboard, hcClient);
    }

    /**
     * 查询api 仪表板数据详情
     *
     * 查询api 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisDashboardRequest 请求对象
     * @return CompletableFuture<ShowApisDashboardResponse>
     */
    public CompletableFuture<ShowApisDashboardResponse> showApisDashboardAsync(ShowApisDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showApisDashboard);
    }

    /**
     * 查询api 仪表板数据详情
     *
     * 查询api 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisDashboardRequest 请求对象
     * @return AsyncInvoker<ShowApisDashboardRequest, ShowApisDashboardResponse>
     */
    public AsyncInvoker<ShowApisDashboardRequest, ShowApisDashboardResponse> showApisDashboardAsyncInvoker(
        ShowApisDashboardRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showApisDashboard, hcClient);
    }

    /**
     * 查询api 统计数据详情
     *
     * 查询api 统计数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisDetailRequest 请求对象
     * @return CompletableFuture<ShowApisDetailResponse>
     */
    public CompletableFuture<ShowApisDetailResponse> showApisDetailAsync(ShowApisDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showApisDetail);
    }

    /**
     * 查询api 统计数据详情
     *
     * 查询api 统计数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisDetailRequest 请求对象
     * @return AsyncInvoker<ShowApisDetailRequest, ShowApisDetailResponse>
     */
    public AsyncInvoker<ShowApisDetailRequest, ShowApisDetailResponse> showApisDetailAsyncInvoker(
        ShowApisDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showApisDetail, hcClient);
    }

    /**
     * 查询统计用户相关的总览开发指标
     *
     * 查询统计用户相关的总览开发指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisOverviewRequest 请求对象
     * @return CompletableFuture<ShowApisOverviewResponse>
     */
    public CompletableFuture<ShowApisOverviewResponse> showApisOverviewAsync(ShowApisOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showApisOverview);
    }

    /**
     * 查询统计用户相关的总览开发指标
     *
     * 查询统计用户相关的总览开发指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApisOverviewRequest 请求对象
     * @return AsyncInvoker<ShowApisOverviewRequest, ShowApisOverviewResponse>
     */
    public AsyncInvoker<ShowApisOverviewRequest, ShowApisOverviewResponse> showApisOverviewAsyncInvoker(
        ShowApisOverviewRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showApisOverview, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppInfoRequest 请求对象
     * @return CompletableFuture<ShowAppInfoResponse>
     */
    public CompletableFuture<ShowAppInfoResponse> showAppInfoAsync(ShowAppInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showAppInfo);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppInfoRequest 请求对象
     * @return AsyncInvoker<ShowAppInfoRequest, ShowAppInfoResponse>
     */
    public AsyncInvoker<ShowAppInfoRequest, ShowAppInfoResponse> showAppInfoAsyncInvoker(ShowAppInfoRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showAppInfo, hcClient);
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
     * @return CompletableFuture<ShowApplyDetailResponse>
     */
    public CompletableFuture<ShowApplyDetailResponse> showApplyDetailAsync(ShowApplyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showApplyDetail);
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
     * @return AsyncInvoker<ShowApplyDetailRequest, ShowApplyDetailResponse>
     */
    public AsyncInvoker<ShowApplyDetailRequest, ShowApplyDetailResponse> showApplyDetailAsyncInvoker(
        ShowApplyDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showApplyDetail, hcClient);
    }

    /**
     * 查询app 仪表板数据详情
     *
     * 查询app 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsDashboardRequest 请求对象
     * @return CompletableFuture<ShowAppsDashboardResponse>
     */
    public CompletableFuture<ShowAppsDashboardResponse> showAppsDashboardAsync(ShowAppsDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showAppsDashboard);
    }

    /**
     * 查询app 仪表板数据详情
     *
     * 查询app 仪表板数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsDashboardRequest 请求对象
     * @return AsyncInvoker<ShowAppsDashboardRequest, ShowAppsDashboardResponse>
     */
    public AsyncInvoker<ShowAppsDashboardRequest, ShowAppsDashboardResponse> showAppsDashboardAsyncInvoker(
        ShowAppsDashboardRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showAppsDashboard, hcClient);
    }

    /**
     * 查询app 统计数据详情
     *
     * 查询app 统计数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsDetailRequest 请求对象
     * @return CompletableFuture<ShowAppsDetailResponse>
     */
    public CompletableFuture<ShowAppsDetailResponse> showAppsDetailAsync(ShowAppsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showAppsDetail);
    }

    /**
     * 查询app 统计数据详情
     *
     * 查询app 统计数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsDetailRequest 请求对象
     * @return AsyncInvoker<ShowAppsDetailRequest, ShowAppsDetailResponse>
     */
    public AsyncInvoker<ShowAppsDetailRequest, ShowAppsDetailResponse> showAppsDetailAsyncInvoker(
        ShowAppsDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showAppsDetail, hcClient);
    }

    /**
     * 查询统计用户相关的总览调用指标
     *
     * 查询统计用户相关的总览调用指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsOverviewRequest 请求对象
     * @return CompletableFuture<ShowAppsOverviewResponse>
     */
    public CompletableFuture<ShowAppsOverviewResponse> showAppsOverviewAsync(ShowAppsOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showAppsOverview);
    }

    /**
     * 查询统计用户相关的总览调用指标
     *
     * 查询统计用户相关的总览调用指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppsOverviewRequest 请求对象
     * @return AsyncInvoker<ShowAppsOverviewRequest, ShowAppsOverviewResponse>
     */
    public AsyncInvoker<ShowAppsOverviewRequest, ShowAppsOverviewResponse> showAppsOverviewAsyncInvoker(
        ShowAppsOverviewRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showAppsOverview, hcClient);
    }

    /**
     * 查看原子指标详情
     *
     * 通过ID获取指标详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAtomicIndexByIdRequest 请求对象
     * @return CompletableFuture<ShowAtomicIndexByIdResponse>
     */
    public CompletableFuture<ShowAtomicIndexByIdResponse> showAtomicIndexByIdAsync(ShowAtomicIndexByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showAtomicIndexById);
    }

    /**
     * 查看原子指标详情
     *
     * 通过ID获取指标详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAtomicIndexByIdRequest 请求对象
     * @return AsyncInvoker<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse>
     */
    public AsyncInvoker<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse> showAtomicIndexByIdAsyncInvoker(
        ShowAtomicIndexByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showAtomicIndexById, hcClient);
    }

    /**
     * 查找流程架构详情
     *
     * 查找流程架构详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBizCatalogDetailRequest 请求对象
     * @return CompletableFuture<ShowBizCatalogDetailResponse>
     */
    public CompletableFuture<ShowBizCatalogDetailResponse> showBizCatalogDetailAsync(
        ShowBizCatalogDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showBizCatalogDetail);
    }

    /**
     * 查找流程架构详情
     *
     * 查找流程架构详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBizCatalogDetailRequest 请求对象
     * @return AsyncInvoker<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse>
     */
    public AsyncInvoker<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse> showBizCatalogDetailAsyncInvoker(
        ShowBizCatalogDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showBizCatalogDetail, hcClient);
    }

    /**
     * 查看指标详情
     *
     * 通过ID查看指标的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBizMetricByIdRequest 请求对象
     * @return CompletableFuture<ShowBizMetricByIdResponse>
     */
    public CompletableFuture<ShowBizMetricByIdResponse> showBizMetricByIdAsync(ShowBizMetricByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showBizMetricById);
    }

    /**
     * 查看指标详情
     *
     * 通过ID查看指标的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBizMetricByIdRequest 请求对象
     * @return AsyncInvoker<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse>
     */
    public AsyncInvoker<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse> showBizMetricByIdAsyncInvoker(
        ShowBizMetricByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showBizMetricById, hcClient);
    }

    /**
     * 查询业务资产
     *
     * 业务资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsRequest 请求对象
     * @return CompletableFuture<ShowBusinessAssetsResponse>
     */
    public CompletableFuture<ShowBusinessAssetsResponse> showBusinessAssetsAsync(ShowBusinessAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showBusinessAssets);
    }

    /**
     * 查询业务资产
     *
     * 业务资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsRequest 请求对象
     * @return AsyncInvoker<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse>
     */
    public AsyncInvoker<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse> showBusinessAssetsAsyncInvoker(
        ShowBusinessAssetsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showBusinessAssets, hcClient);
    }

    /**
     * 获取业务资产统计信息
     *
     * 获取业务资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsStatisticRequest 请求对象
     * @return CompletableFuture<ShowBusinessAssetsStatisticResponse>
     */
    public CompletableFuture<ShowBusinessAssetsStatisticResponse> showBusinessAssetsStatisticAsync(
        ShowBusinessAssetsStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showBusinessAssetsStatistic);
    }

    /**
     * 获取业务资产统计信息
     *
     * 获取业务资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsStatisticRequest 请求对象
     * @return AsyncInvoker<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse>
     */
    public AsyncInvoker<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse> showBusinessAssetsStatisticAsyncInvoker(
        ShowBusinessAssetsStatisticRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showBusinessAssetsStatistic, hcClient);
    }

    /**
     * 查询业务资产目录树
     *
     * 逐级查询业务资产目录树,包含数据规范同步过来的业务对象和逻辑实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsTreeRequest 请求对象
     * @return CompletableFuture<ShowBusinessAssetsTreeResponse>
     */
    public CompletableFuture<ShowBusinessAssetsTreeResponse> showBusinessAssetsTreeAsync(
        ShowBusinessAssetsTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showBusinessAssetsTree);
    }

    /**
     * 查询业务资产目录树
     *
     * 逐级查询业务资产目录树,包含数据规范同步过来的业务对象和逻辑实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessAssetsTreeRequest 请求对象
     * @return AsyncInvoker<ShowBusinessAssetsTreeRequest, ShowBusinessAssetsTreeResponse>
     */
    public AsyncInvoker<ShowBusinessAssetsTreeRequest, ShowBusinessAssetsTreeResponse> showBusinessAssetsTreeAsyncInvoker(
        ShowBusinessAssetsTreeRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showBusinessAssetsTree, hcClient);
    }

    /**
     * 查询服务目录
     *
     * 查询服务目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCatalogDetailRequest 请求对象
     * @return CompletableFuture<ShowCatalogDetailResponse>
     */
    public CompletableFuture<ShowCatalogDetailResponse> showCatalogDetailAsync(ShowCatalogDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showCatalogDetail);
    }

    /**
     * 查询服务目录
     *
     * 查询服务目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCatalogDetailRequest 请求对象
     * @return AsyncInvoker<ShowCatalogDetailRequest, ShowCatalogDetailResponse>
     */
    public AsyncInvoker<ShowCatalogDetailRequest, ShowCatalogDetailResponse> showCatalogDetailAsyncInvoker(
        ShowCatalogDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showCatalogDetail, hcClient);
    }

    /**
     * 查看码表详情
     *
     * 通过ID查看码表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCodeTableByIdRequest 请求对象
     * @return CompletableFuture<ShowCodeTableByIdResponse>
     */
    public CompletableFuture<ShowCodeTableByIdResponse> showCodeTableByIdAsync(ShowCodeTableByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showCodeTableById);
    }

    /**
     * 查看码表详情
     *
     * 通过ID查看码表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCodeTableByIdRequest 请求对象
     * @return AsyncInvoker<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse>
     */
    public AsyncInvoker<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse> showCodeTableByIdAsyncInvoker(
        ShowCodeTableByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showCodeTableById, hcClient);
    }

    /**
     * 查看复合指标详情
     *
     * 通过ID获取复合指标详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompoundMetricByIdRequest 请求对象
     * @return CompletableFuture<ShowCompoundMetricByIdResponse>
     */
    public CompletableFuture<ShowCompoundMetricByIdResponse> showCompoundMetricByIdAsync(
        ShowCompoundMetricByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showCompoundMetricById);
    }

    /**
     * 查看复合指标详情
     *
     * 通过ID获取复合指标详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompoundMetricByIdRequest 请求对象
     * @return AsyncInvoker<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse>
     */
    public AsyncInvoker<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse> showCompoundMetricByIdAsyncInvoker(
        ShowCompoundMetricByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showCompoundMetricById, hcClient);
    }

    /**
     * 查看限定详情
     *
     * 通过ID查看限定详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConditionByIdRequest 请求对象
     * @return CompletableFuture<ShowConditionByIdResponse>
     */
    public CompletableFuture<ShowConditionByIdResponse> showConditionByIdAsync(ShowConditionByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showConditionById);
    }

    /**
     * 查看限定详情
     *
     * 通过ID查看限定详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConditionByIdRequest 请求对象
     * @return AsyncInvoker<ShowConditionByIdRequest, ShowConditionByIdResponse>
     */
    public AsyncInvoker<ShowConditionByIdRequest, ShowConditionByIdResponse> showConditionByIdAsyncInvoker(
        ShowConditionByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showConditionById, hcClient);
    }

    /**
     * 获取对账作业详情
     *
     * 获取对账作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsistencyTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowConsistencyTaskDetailResponse>
     */
    public CompletableFuture<ShowConsistencyTaskDetailResponse> showConsistencyTaskDetailAsync(
        ShowConsistencyTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showConsistencyTaskDetail);
    }

    /**
     * 获取对账作业详情
     *
     * 获取对账作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsistencyTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse>
     */
    public AsyncInvoker<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse> showConsistencyTaskDetailAsyncInvoker(
        ShowConsistencyTaskDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showConsistencyTaskDetail, hcClient);
    }

    /**
     * 资产详情(邀测)
     *
     * 资产详情接口，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataDetailRequest 请求对象
     * @return CompletableFuture<ShowDataDetailResponse>
     */
    public CompletableFuture<ShowDataDetailResponse> showDataDetailAsync(ShowDataDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showDataDetail);
    }

    /**
     * 资产详情(邀测)
     *
     * 资产详情接口，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataDetailRequest 请求对象
     * @return AsyncInvoker<ShowDataDetailRequest, ShowDataDetailResponse>
     */
    public AsyncInvoker<ShowDataDetailRequest, ShowDataDetailResponse> showDataDetailAsyncInvoker(
        ShowDataDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showDataDetail, hcClient);
    }

    /**
     * 资产信息
     *
     * 查询概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProfileRequest 请求对象
     * @return CompletableFuture<ShowDataProfileResponse>
     */
    public CompletableFuture<ShowDataProfileResponse> showDataProfileAsync(ShowDataProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showDataProfile);
    }

    /**
     * 资产信息
     *
     * 查询概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProfileRequest 请求对象
     * @return AsyncInvoker<ShowDataProfileRequest, ShowDataProfileResponse>
     */
    public AsyncInvoker<ShowDataProfileRequest, ShowDataProfileResponse> showDataProfileAsyncInvoker(
        ShowDataProfileRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showDataProfile, hcClient);
    }

    /**
     * 资产搜索
     *
     * 资产搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataSetsRequest 请求对象
     * @return CompletableFuture<ShowDataSetsResponse>
     */
    public CompletableFuture<ShowDataSetsResponse> showDataSetsAsync(ShowDataSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showDataSets);
    }

    /**
     * 资产搜索
     *
     * 资产搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataSetsRequest 请求对象
     * @return AsyncInvoker<ShowDataSetsRequest, ShowDataSetsResponse>
     */
    public AsyncInvoker<ShowDataSetsRequest, ShowDataSetsResponse> showDataSetsAsyncInvoker(
        ShowDataSetsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showDataSets, hcClient);
    }

    /**
     * 查询单个数据连接信息
     *
     * 查询单个数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataconnectionRequest 请求对象
     * @return CompletableFuture<ShowDataconnectionResponse>
     */
    public CompletableFuture<ShowDataconnectionResponse> showDataconnectionAsync(ShowDataconnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showDataconnection);
    }

    /**
     * 查询单个数据连接信息
     *
     * 查询单个数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataconnectionRequest 请求对象
     * @return AsyncInvoker<ShowDataconnectionRequest, ShowDataconnectionResponse>
     */
    public AsyncInvoker<ShowDataconnectionRequest, ShowDataconnectionResponse> showDataconnectionAsyncInvoker(
        ShowDataconnectionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showDataconnection, hcClient);
    }

    /**
     * 资产血缘(邀测)
     *
     * 资产血缘接口，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatamapLineageRequest 请求对象
     * @return CompletableFuture<ShowDatamapLineageResponse>
     */
    public CompletableFuture<ShowDatamapLineageResponse> showDatamapLineageAsync(ShowDatamapLineageRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showDatamapLineage);
    }

    /**
     * 资产血缘(邀测)
     *
     * 资产血缘接口，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatamapLineageRequest 请求对象
     * @return AsyncInvoker<ShowDatamapLineageRequest, ShowDatamapLineageResponse>
     */
    public AsyncInvoker<ShowDatamapLineageRequest, ShowDatamapLineageResponse> showDatamapLineageAsyncInvoker(
        ShowDatamapLineageRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showDatamapLineage, hcClient);
    }

    /**
     * 查看衍生指标详情
     *
     * 通过ID获取衍生详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDerivativeIndexByIdRequest 请求对象
     * @return CompletableFuture<ShowDerivativeIndexByIdResponse>
     */
    public CompletableFuture<ShowDerivativeIndexByIdResponse> showDerivativeIndexByIdAsync(
        ShowDerivativeIndexByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showDerivativeIndexById);
    }

    /**
     * 查看衍生指标详情
     *
     * 通过ID获取衍生详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDerivativeIndexByIdRequest 请求对象
     * @return AsyncInvoker<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse>
     */
    public AsyncInvoker<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse> showDerivativeIndexByIdAsyncInvoker(
        ShowDerivativeIndexByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showDerivativeIndexById, hcClient);
    }

    /**
     * 查看维度详情
     *
     * 通过ID查看维度详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDimensionByIdRequest 请求对象
     * @return CompletableFuture<ShowDimensionByIdResponse>
     */
    public CompletableFuture<ShowDimensionByIdResponse> showDimensionByIdAsync(ShowDimensionByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showDimensionById);
    }

    /**
     * 查看维度详情
     *
     * 通过ID查看维度详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDimensionByIdRequest 请求对象
     * @return AsyncInvoker<ShowDimensionByIdRequest, ShowDimensionByIdResponse>
     */
    public AsyncInvoker<ShowDimensionByIdRequest, ShowDimensionByIdResponse> showDimensionByIdAsyncInvoker(
        ShowDimensionByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showDimensionById, hcClient);
    }

    /**
     * 查看维度表详情
     *
     * 通过ID查看维度表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDimensionLogicTableByIdRequest 请求对象
     * @return CompletableFuture<ShowDimensionLogicTableByIdResponse>
     */
    public CompletableFuture<ShowDimensionLogicTableByIdResponse> showDimensionLogicTableByIdAsync(
        ShowDimensionLogicTableByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showDimensionLogicTableById);
    }

    /**
     * 查看维度表详情
     *
     * 通过ID查看维度表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDimensionLogicTableByIdRequest 请求对象
     * @return AsyncInvoker<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse>
     */
    public AsyncInvoker<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse> showDimensionLogicTableByIdAsyncInvoker(
        ShowDimensionLogicTableByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showDimensionLogicTableById, hcClient);
    }

    /**
     * 查询技术资产
     *
     * 查询技术资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntitiesRequest 请求对象
     * @return CompletableFuture<ShowEntitiesResponse>
     */
    public CompletableFuture<ShowEntitiesResponse> showEntitiesAsync(ShowEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showEntities);
    }

    /**
     * 查询技术资产
     *
     * 查询技术资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntitiesRequest 请求对象
     * @return AsyncInvoker<ShowEntitiesRequest, ShowEntitiesResponse>
     */
    public AsyncInvoker<ShowEntitiesRequest, ShowEntitiesResponse> showEntitiesAsyncInvoker(
        ShowEntitiesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showEntities, hcClient);
    }

    /**
     * 根据guid获取资产详情
     *
     * 根据表guid可以获取表的详情信息，表的详情信息包含column的信息，也可以根据column的guid直接获取column的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntityInfoByGuidRequest 请求对象
     * @return CompletableFuture<ShowEntityInfoByGuidResponse>
     */
    public CompletableFuture<ShowEntityInfoByGuidResponse> showEntityInfoByGuidAsync(
        ShowEntityInfoByGuidRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showEntityInfoByGuid);
    }

    /**
     * 根据guid获取资产详情
     *
     * 根据表guid可以获取表的详情信息，表的详情信息包含column的信息，也可以根据column的guid直接获取column的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntityInfoByGuidRequest 请求对象
     * @return AsyncInvoker<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse>
     */
    public AsyncInvoker<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse> showEntityInfoByGuidAsyncInvoker(
        ShowEntityInfoByGuidRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showEntityInfoByGuid, hcClient);
    }

    /**
     * 查看事实表详情
     *
     * 通过ID查看事实表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactLogicTableByIdRequest 请求对象
     * @return CompletableFuture<ShowFactLogicTableByIdResponse>
     */
    public CompletableFuture<ShowFactLogicTableByIdResponse> showFactLogicTableByIdAsync(
        ShowFactLogicTableByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showFactLogicTableById);
    }

    /**
     * 查看事实表详情
     *
     * 通过ID查看事实表的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactLogicTableByIdRequest 请求对象
     * @return AsyncInvoker<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse>
     */
    public AsyncInvoker<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse> showFactLogicTableByIdAsyncInvoker(
        ShowFactLogicTableByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showFactLogicTableById, hcClient);
    }

    /**
     * 查询环境变量信息
     *
     * 查询环境变量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryEnvRequest 请求对象
     * @return CompletableFuture<ShowFactoryEnvResponse>
     */
    public CompletableFuture<ShowFactoryEnvResponse> showFactoryEnvAsync(ShowFactoryEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showFactoryEnv);
    }

    /**
     * 查询环境变量信息
     *
     * 查询环境变量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryEnvRequest 请求对象
     * @return AsyncInvoker<ShowFactoryEnvRequest, ShowFactoryEnvResponse>
     */
    public AsyncInvoker<ShowFactoryEnvRequest, ShowFactoryEnvResponse> showFactoryEnvAsyncInvoker(
        ShowFactoryEnvRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showFactoryEnv, hcClient);
    }

    /**
     * 查询指定发布包详情
     *
     * 查询指定发布包详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryPackageDetailRequest 请求对象
     * @return CompletableFuture<ShowFactoryPackageDetailResponse>
     */
    public CompletableFuture<ShowFactoryPackageDetailResponse> showFactoryPackageDetailAsync(
        ShowFactoryPackageDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showFactoryPackageDetail);
    }

    /**
     * 查询指定发布包详情
     *
     * 查询指定发布包详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactoryPackageDetailRequest 请求对象
     * @return AsyncInvoker<ShowFactoryPackageDetailRequest, ShowFactoryPackageDetailResponse>
     */
    public AsyncInvoker<ShowFactoryPackageDetailRequest, ShowFactoryPackageDetailResponse> showFactoryPackageDetailAsyncInvoker(
        ShowFactoryPackageDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showFactoryPackageDetail, hcClient);
    }

    /**
     * 查询补数据实例
     *
     * 查询补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorySupplementDataRequest 请求对象
     * @return CompletableFuture<ShowFactorySupplementDataResponse>
     */
    public CompletableFuture<ShowFactorySupplementDataResponse> showFactorySupplementDataAsync(
        ShowFactorySupplementDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showFactorySupplementData);
    }

    /**
     * 查询补数据实例
     *
     * 查询补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorySupplementDataRequest 请求对象
     * @return AsyncInvoker<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse>
     */
    public AsyncInvoker<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse> showFactorySupplementDataAsyncInvoker(
        ShowFactorySupplementDataRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showFactorySupplementData, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlossaryListRequest 请求对象
     * @return CompletableFuture<ShowGlossaryListResponse>
     */
    public CompletableFuture<ShowGlossaryListResponse> showGlossaryListAsync(ShowGlossaryListRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showGlossaryList);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlossaryListRequest 请求对象
     * @return AsyncInvoker<ShowGlossaryListRequest, ShowGlossaryListResponse>
     */
    public AsyncInvoker<ShowGlossaryListRequest, ShowGlossaryListResponse> showGlossaryListAsyncInvoker(
        ShowGlossaryListRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showGlossaryList, hcClient);
    }

    /**
     * 产出信息(邀测)
     *
     * 查询表相关的作业算子运行实例信息，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInfosRequest 请求对象
     * @return CompletableFuture<ShowInstanceInfosResponse>
     */
    public CompletableFuture<ShowInstanceInfosResponse> showInstanceInfosAsync(ShowInstanceInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showInstanceInfos);
    }

    /**
     * 产出信息(邀测)
     *
     * 查询表相关的作业算子运行实例信息，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInfosRequest 请求对象
     * @return AsyncInvoker<ShowInstanceInfosRequest, ShowInstanceInfosResponse>
     */
    public AsyncInvoker<ShowInstanceInfosRequest, ShowInstanceInfosResponse> showInstanceInfosAsyncInvoker(
        ShowInstanceInfosRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showInstanceInfos, hcClient);
    }

    /**
     * 获取任务日志
     *
     * 获取任务日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceLogRequest 请求对象
     * @return CompletableFuture<ShowInstanceLogResponse>
     */
    public CompletableFuture<ShowInstanceLogResponse> showInstanceLogAsync(ShowInstanceLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showInstanceLog);
    }

    /**
     * 获取任务日志
     *
     * 获取任务日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceLogRequest 请求对象
     * @return AsyncInvoker<ShowInstanceLogRequest, ShowInstanceLogResponse>
     */
    public AsyncInvoker<ShowInstanceLogRequest, ShowInstanceLogResponse> showInstanceLogAsyncInvoker(
        ShowInstanceLogRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showInstanceLog, hcClient);
    }

    /**
     * 获取实例结果
     *
     * 获取实例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceResultRequest 请求对象
     * @return CompletableFuture<ShowInstanceResultResponse>
     */
    public CompletableFuture<ShowInstanceResultResponse> showInstanceResultAsync(ShowInstanceResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showInstanceResult);
    }

    /**
     * 获取实例结果
     *
     * 获取实例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceResultRequest 请求对象
     * @return AsyncInvoker<ShowInstanceResultRequest, ShowInstanceResultResponse>
     */
    public AsyncInvoker<ShowInstanceResultRequest, ShowInstanceResultResponse> showInstanceResultAsyncInvoker(
        ShowInstanceResultRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showInstanceResult, hcClient);
    }

    /**
     * 血缘查询
     *
     * 血缘查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineageRequest 请求对象
     * @return CompletableFuture<ShowLineageResponse>
     */
    public CompletableFuture<ShowLineageResponse> showLineageAsync(ShowLineageRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showLineage);
    }

    /**
     * 血缘查询
     *
     * 血缘查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineageRequest 请求对象
     * @return AsyncInvoker<ShowLineageRequest, ShowLineageResponse>
     */
    public AsyncInvoker<ShowLineageRequest, ShowLineageResponse> showLineageAsyncInvoker(ShowLineageRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showLineage, hcClient);
    }

    /**
     * 批量血缘(邀测)
     *
     * 批量血缘接口，根据作业算子分页批量查询血缘。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineageBulkRequest 请求对象
     * @return CompletableFuture<ShowLineageBulkResponse>
     */
    public CompletableFuture<ShowLineageBulkResponse> showLineageBulkAsync(ShowLineageBulkRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showLineageBulk);
    }

    /**
     * 批量血缘(邀测)
     *
     * 批量血缘接口，根据作业算子分页批量查询血缘。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineageBulkRequest 请求对象
     * @return AsyncInvoker<ShowLineageBulkRequest, ShowLineageBulkResponse>
     */
    public AsyncInvoker<ShowLineageBulkRequest, ShowLineageBulkResponse> showLineageBulkAsyncInvoker(
        ShowLineageBulkRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showLineageBulk, hcClient);
    }

    /**
     * 获取消息详情
     *
     * 获取消息详情。此功能仅用作信息详情展示，不用做业务处理，因此不展示编号等后台参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageDetailRequest 请求对象
     * @return CompletableFuture<ShowMessageDetailResponse>
     */
    public CompletableFuture<ShowMessageDetailResponse> showMessageDetailAsync(ShowMessageDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showMessageDetail);
    }

    /**
     * 获取消息详情
     *
     * 获取消息详情。此功能仅用作信息详情展示，不用做业务处理，因此不展示编号等后台参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMessageDetailRequest 请求对象
     * @return AsyncInvoker<ShowMessageDetailRequest, ShowMessageDetailResponse>
     */
    public AsyncInvoker<ShowMessageDetailRequest, ShowMessageDetailResponse> showMessageDetailAsyncInvoker(
        ShowMessageDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showMessageDetail, hcClient);
    }

    /**
     * 查询指标资产
     *
     * 指标资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricAssetsRequest 请求对象
     * @return CompletableFuture<ShowMetricAssetsResponse>
     */
    public CompletableFuture<ShowMetricAssetsResponse> showMetricAssetsAsync(ShowMetricAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showMetricAssets);
    }

    /**
     * 查询指标资产
     *
     * 指标资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricAssetsRequest 请求对象
     * @return AsyncInvoker<ShowMetricAssetsRequest, ShowMetricAssetsResponse>
     */
    public AsyncInvoker<ShowMetricAssetsRequest, ShowMetricAssetsResponse> showMetricAssetsAsyncInvoker(
        ShowMetricAssetsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showMetricAssets, hcClient);
    }

    /**
     * 查询指标资产目录树
     *
     * 查询指标资产目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricTreeRequest 请求对象
     * @return CompletableFuture<ShowMetricTreeResponse>
     */
    public CompletableFuture<ShowMetricTreeResponse> showMetricTreeAsync(ShowMetricTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showMetricTree);
    }

    /**
     * 查询指标资产目录树
     *
     * 查询指标资产目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricTreeRequest 请求对象
     * @return AsyncInvoker<ShowMetricTreeRequest, ShowMetricTreeResponse>
     */
    public AsyncInvoker<ShowMetricTreeRequest, ShowMetricTreeResponse> showMetricTreeAsyncInvoker(
        ShowMetricTreeRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showMetricTree, hcClient);
    }

    /**
     * 表关联作业算子列表(邀测)
     *
     * 查询表相关的作业算子列表，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodesRequest 请求对象
     * @return CompletableFuture<ShowNodesResponse>
     */
    public CompletableFuture<ShowNodesResponse> showNodesAsync(ShowNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showNodes);
    }

    /**
     * 表关联作业算子列表(邀测)
     *
     * 查询表相关的作业算子列表，该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodesRequest 请求对象
     * @return AsyncInvoker<ShowNodesRequest, ShowNodesResponse>
     */
    public AsyncInvoker<ShowNodesRequest, ShowNodesResponse> showNodesAsyncInvoker(ShowNodesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showNodes, hcClient);
    }

    /**
     * 通过id获取路径
     *
     * 通过id获取路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPathByIdRequest 请求对象
     * @return CompletableFuture<ShowPathByIdResponse>
     */
    public CompletableFuture<ShowPathByIdResponse> showPathByIdAsync(ShowPathByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showPathById);
    }

    /**
     * 通过id获取路径
     *
     * 通过id获取路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPathByIdRequest 请求对象
     * @return AsyncInvoker<ShowPathByIdRequest, ShowPathByIdResponse>
     */
    public AsyncInvoker<ShowPathByIdRequest, ShowPathByIdResponse> showPathByIdAsyncInvoker(
        ShowPathByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showPathById, hcClient);
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
     * @return CompletableFuture<ShowPathObjectByIdResponse>
     */
    public CompletableFuture<ShowPathObjectByIdResponse> showPathObjectByIdAsync(ShowPathObjectByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showPathObjectById);
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
     * @return AsyncInvoker<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse>
     */
    public AsyncInvoker<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse> showPathObjectByIdAsyncInvoker(
        ShowPathObjectByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showPathObjectById, hcClient);
    }

    /**
     * 获取质量作业详情
     *
     * 获取质量作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQualityTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowQualityTaskDetailResponse>
     */
    public CompletableFuture<ShowQualityTaskDetailResponse> showQualityTaskDetailAsync(
        ShowQualityTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showQualityTaskDetail);
    }

    /**
     * 获取质量作业详情
     *
     * 获取质量作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQualityTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse>
     */
    public AsyncInvoker<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse> showQualityTaskDetailAsyncInvoker(
        ShowQualityTaskDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showQualityTaskDetail, hcClient);
    }

    /**
     * 查看关系详情
     *
     * 通过ID获取关系详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelationByIdRequest 请求对象
     * @return CompletableFuture<ShowRelationByIdResponse>
     */
    public CompletableFuture<ShowRelationByIdResponse> showRelationByIdAsync(ShowRelationByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showRelationById);
    }

    /**
     * 查看关系详情
     *
     * 通过ID获取关系详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelationByIdRequest 请求对象
     * @return AsyncInvoker<ShowRelationByIdRequest, ShowRelationByIdResponse>
     */
    public AsyncInvoker<ShowRelationByIdRequest, ShowRelationByIdResponse> showRelationByIdAsyncInvoker(
        ShowRelationByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showRelationById, hcClient);
    }

    /**
     * 查询特定识别规则
     *
     * 查询特定识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDataClassificationRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityDataClassificationRuleResponse>
     */
    public CompletableFuture<ShowSecurityDataClassificationRuleResponse> showSecurityDataClassificationRuleAsync(
        ShowSecurityDataClassificationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showSecurityDataClassificationRule);
    }

    /**
     * 查询特定识别规则
     *
     * 查询特定识别规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDataClassificationRuleRequest 请求对象
     * @return AsyncInvoker<ShowSecurityDataClassificationRuleRequest, ShowSecurityDataClassificationRuleResponse>
     */
    public AsyncInvoker<ShowSecurityDataClassificationRuleRequest, ShowSecurityDataClassificationRuleResponse> showSecurityDataClassificationRuleAsyncInvoker(
        ShowSecurityDataClassificationRuleRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showSecurityDataClassificationRule, hcClient);
    }

    /**
     * 查询规则组
     *
     * 查询规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDataClassificationRuleGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityDataClassificationRuleGroupResponse>
     */
    public CompletableFuture<ShowSecurityDataClassificationRuleGroupResponse> showSecurityDataClassificationRuleGroupAsync(
        ShowSecurityDataClassificationRuleGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showSecurityDataClassificationRuleGroup);
    }

    /**
     * 查询规则组
     *
     * 查询规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityDataClassificationRuleGroupRequest 请求对象
     * @return AsyncInvoker<ShowSecurityDataClassificationRuleGroupRequest, ShowSecurityDataClassificationRuleGroupResponse>
     */
    public AsyncInvoker<ShowSecurityDataClassificationRuleGroupRequest, ShowSecurityDataClassificationRuleGroupResponse> showSecurityDataClassificationRuleGroupAsyncInvoker(
        ShowSecurityDataClassificationRuleGroupRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showSecurityDataClassificationRuleGroup, hcClient);
    }

    /**
     * 查询单个用户同步任务
     *
     * 查询单个用户同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityMemberSyncTaskRequest 请求对象
     * @return CompletableFuture<ShowSecurityMemberSyncTaskResponse>
     */
    public CompletableFuture<ShowSecurityMemberSyncTaskResponse> showSecurityMemberSyncTaskAsync(
        ShowSecurityMemberSyncTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showSecurityMemberSyncTask);
    }

    /**
     * 查询单个用户同步任务
     *
     * 查询单个用户同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityMemberSyncTaskRequest 请求对象
     * @return AsyncInvoker<ShowSecurityMemberSyncTaskRequest, ShowSecurityMemberSyncTaskResponse>
     */
    public AsyncInvoker<ShowSecurityMemberSyncTaskRequest, ShowSecurityMemberSyncTaskResponse> showSecurityMemberSyncTaskAsyncInvoker(
        ShowSecurityMemberSyncTaskRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showSecurityMemberSyncTask, hcClient);
    }

    /**
     * 查询权限集
     *
     * 查询权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPermissionSetRequest 请求对象
     * @return CompletableFuture<ShowSecurityPermissionSetResponse>
     */
    public CompletableFuture<ShowSecurityPermissionSetResponse> showSecurityPermissionSetAsync(
        ShowSecurityPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showSecurityPermissionSet);
    }

    /**
     * 查询权限集
     *
     * 查询权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPermissionSetRequest 请求对象
     * @return AsyncInvoker<ShowSecurityPermissionSetRequest, ShowSecurityPermissionSetResponse>
     */
    public AsyncInvoker<ShowSecurityPermissionSetRequest, ShowSecurityPermissionSetResponse> showSecurityPermissionSetAsyncInvoker(
        ShowSecurityPermissionSetRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showSecurityPermissionSet, hcClient);
    }

    /**
     * 根据指定的id查询密级
     *
     * 根据指定的id查询密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecuritySecrecyLevelRequest 请求对象
     * @return CompletableFuture<ShowSecuritySecrecyLevelResponse>
     */
    public CompletableFuture<ShowSecuritySecrecyLevelResponse> showSecuritySecrecyLevelAsync(
        ShowSecuritySecrecyLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showSecuritySecrecyLevel);
    }

    /**
     * 根据指定的id查询密级
     *
     * 根据指定的id查询密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecuritySecrecyLevelRequest 请求对象
     * @return AsyncInvoker<ShowSecuritySecrecyLevelRequest, ShowSecuritySecrecyLevelResponse>
     */
    public AsyncInvoker<ShowSecuritySecrecyLevelRequest, ShowSecuritySecrecyLevelResponse> showSecuritySecrecyLevelAsyncInvoker(
        ShowSecuritySecrecyLevelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showSecuritySecrecyLevel, hcClient);
    }

    /**
     * 查看数据标准详情
     *
     * 通过ID获取数据标准详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardByIdRequest 请求对象
     * @return CompletableFuture<ShowStandardByIdResponse>
     */
    public CompletableFuture<ShowStandardByIdResponse> showStandardByIdAsync(ShowStandardByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showStandardById);
    }

    /**
     * 查看数据标准详情
     *
     * 通过ID获取数据标准详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardByIdRequest 请求对象
     * @return AsyncInvoker<ShowStandardByIdRequest, ShowStandardByIdResponse>
     */
    public AsyncInvoker<ShowStandardByIdRequest, ShowStandardByIdResponse> showStandardByIdAsyncInvoker(
        ShowStandardByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showStandardById, hcClient);
    }

    /**
     * 查询数据标准模板
     *
     * 查询数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardTemplateRequest 请求对象
     * @return CompletableFuture<ShowStandardTemplateResponse>
     */
    public CompletableFuture<ShowStandardTemplateResponse> showStandardTemplateAsync(
        ShowStandardTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showStandardTemplate);
    }

    /**
     * 查询数据标准模板
     *
     * 查询数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardTemplateRequest 请求对象
     * @return AsyncInvoker<ShowStandardTemplateRequest, ShowStandardTemplateResponse>
     */
    public AsyncInvoker<ShowStandardTemplateRequest, ShowStandardTemplateResponse> showStandardTemplateAsyncInvoker(
        ShowStandardTemplateRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showStandardTemplate, hcClient);
    }

    /**
     * 查看表模型详情
     *
     * 通过ID获取模型表详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableModelByIdRequest 请求对象
     * @return CompletableFuture<ShowTableModelByIdResponse>
     */
    public CompletableFuture<ShowTableModelByIdResponse> showTableModelByIdAsync(ShowTableModelByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showTableModelById);
    }

    /**
     * 查看表模型详情
     *
     * 通过ID获取模型表详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableModelByIdRequest 请求对象
     * @return AsyncInvoker<ShowTableModelByIdRequest, ShowTableModelByIdResponse>
     */
    public AsyncInvoker<ShowTableModelByIdRequest, ShowTableModelByIdResponse> showTableModelByIdAsyncInvoker(
        ShowTableModelByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showTableModelById, hcClient);
    }

    /**
     * 搜索查询标签分页展示
     *
     * 搜索查询标签分页展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return CompletableFuture<ShowTagsResponse>
     */
    public CompletableFuture<ShowTagsResponse> showTagsAsync(ShowTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showTags);
    }

    /**
     * 搜索查询标签分页展示
     *
     * 搜索查询标签分页展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return AsyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public AsyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsAsyncInvoker(ShowTagsRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showTags, hcClient);
    }

    /**
     * 查询采集任务详情
     *
     * 查询采集任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowTaskInfoResponse>
     */
    public CompletableFuture<ShowTaskInfoResponse> showTaskInfoAsync(ShowTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showTaskInfo);
    }

    /**
     * 查询采集任务详情
     *
     * 查询采集任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse>
     */
    public AsyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse> showTaskInfoAsyncInvoker(
        ShowTaskInfoRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showTaskInfo, hcClient);
    }

    /**
     * 查询采集任务列表
     *
     * 查询采集任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskListRequest 请求对象
     * @return CompletableFuture<ShowTaskListResponse>
     */
    public CompletableFuture<ShowTaskListResponse> showTaskListAsync(ShowTaskListRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showTaskList);
    }

    /**
     * 查询采集任务列表
     *
     * 查询采集任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskListRequest 请求对象
     * @return AsyncInvoker<ShowTaskListRequest, ShowTaskListResponse>
     */
    public AsyncInvoker<ShowTaskListRequest, ShowTaskListResponse> showTaskListAsyncInvoker(
        ShowTaskListRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showTaskList, hcClient);
    }

    /**
     * 获取技术资产统计信息
     *
     * 获取技术资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTechnicalAssetsStatisticRequest 请求对象
     * @return CompletableFuture<ShowTechnicalAssetsStatisticResponse>
     */
    public CompletableFuture<ShowTechnicalAssetsStatisticResponse> showTechnicalAssetsStatisticAsync(
        ShowTechnicalAssetsStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showTechnicalAssetsStatistic);
    }

    /**
     * 获取技术资产统计信息
     *
     * 获取技术资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTechnicalAssetsStatisticRequest 请求对象
     * @return AsyncInvoker<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse>
     */
    public AsyncInvoker<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse> showTechnicalAssetsStatisticAsyncInvoker(
        ShowTechnicalAssetsStatisticRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showTechnicalAssetsStatistic, hcClient);
    }

    /**
     * 获取规则模板详情
     *
     * 获取规则模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplatesDetailRequest 请求对象
     * @return CompletableFuture<ShowTemplatesDetailResponse>
     */
    public CompletableFuture<ShowTemplatesDetailResponse> showTemplatesDetailAsync(ShowTemplatesDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showTemplatesDetail);
    }

    /**
     * 获取规则模板详情
     *
     * 获取规则模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplatesDetailRequest 请求对象
     * @return AsyncInvoker<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse>
     */
    public AsyncInvoker<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse> showTemplatesDetailAsyncInvoker(
        ShowTemplatesDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showTemplatesDetail, hcClient);
    }

    /**
     * 无血缘关系表查询
     *
     * 无血缘关系表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUnrelatedTableRequest 请求对象
     * @return CompletableFuture<ShowUnrelatedTableResponse>
     */
    public CompletableFuture<ShowUnrelatedTableResponse> showUnrelatedTableAsync(ShowUnrelatedTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showUnrelatedTable);
    }

    /**
     * 无血缘关系表查询
     *
     * 无血缘关系表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUnrelatedTableRequest 请求对象
     * @return AsyncInvoker<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse>
     */
    public AsyncInvoker<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse> showUnrelatedTableAsyncInvoker(
        ShowUnrelatedTableRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showUnrelatedTable, hcClient);
    }

    /**
     * 获取单个工作空间信息
     *
     * 获取单个工作空间信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkSpaceRequest 请求对象
     * @return CompletableFuture<ShowWorkSpaceResponse>
     */
    public CompletableFuture<ShowWorkSpaceResponse> showWorkSpaceAsync(ShowWorkSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showWorkSpace);
    }

    /**
     * 获取单个工作空间信息
     *
     * 获取单个工作空间信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkSpaceRequest 请求对象
     * @return AsyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse>
     */
    public AsyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpaceAsyncInvoker(
        ShowWorkSpaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showWorkSpace, hcClient);
    }

    /**
     * 查询模型详情
     *
     * 查询物理模型或逻辑模型的工作区空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceDetailByIdRequest 请求对象
     * @return CompletableFuture<ShowWorkspaceDetailByIdResponse>
     */
    public CompletableFuture<ShowWorkspaceDetailByIdResponse> showWorkspaceDetailByIdAsync(
        ShowWorkspaceDetailByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showWorkspaceDetailById);
    }

    /**
     * 查询模型详情
     *
     * 查询物理模型或逻辑模型的工作区空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceDetailByIdRequest 请求对象
     * @return AsyncInvoker<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse>
     */
    public AsyncInvoker<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse> showWorkspaceDetailByIdAsyncInvoker(
        ShowWorkspaceDetailByIdRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showWorkspaceDetailById, hcClient);
    }

    /**
     * 停止补数据实例
     *
     * 停止补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFactorySupplementDataInstanceRequest 请求对象
     * @return CompletableFuture<StopFactorySupplementDataInstanceResponse>
     */
    public CompletableFuture<StopFactorySupplementDataInstanceResponse> stopFactorySupplementDataInstanceAsync(
        StopFactorySupplementDataInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.stopFactorySupplementDataInstance);
    }

    /**
     * 停止补数据实例
     *
     * 停止补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFactorySupplementDataInstanceRequest 请求对象
     * @return AsyncInvoker<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse>
     */
    public AsyncInvoker<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse> stopFactorySupplementDataInstanceAsyncInvoker(
        StopFactorySupplementDataInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.stopFactorySupplementDataInstance, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateApp);
    }

    /**
     * 更新应用
     *
     * 更新应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateApp, hcClient);
    }

    /**
     * 更新业务指标
     *
     * 更新业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBizMetricRequest 请求对象
     * @return CompletableFuture<UpdateBizMetricResponse>
     */
    public CompletableFuture<UpdateBizMetricResponse> updateBizMetricAsync(UpdateBizMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateBizMetric);
    }

    /**
     * 更新业务指标
     *
     * 更新业务指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBizMetricRequest 请求对象
     * @return AsyncInvoker<UpdateBizMetricRequest, UpdateBizMetricResponse>
     */
    public AsyncInvoker<UpdateBizMetricRequest, UpdateBizMetricResponse> updateBizMetricAsyncInvoker(
        UpdateBizMetricRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateBizMetric, hcClient);
    }

    /**
     * 更新服务目录
     *
     * 更新服务目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCatalogRequest 请求对象
     * @return CompletableFuture<UpdateCatalogResponse>
     */
    public CompletableFuture<UpdateCatalogResponse> updateCatalogAsync(UpdateCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateCatalog);
    }

    /**
     * 更新服务目录
     *
     * 更新服务目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCatalogRequest 请求对象
     * @return AsyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>
     */
    public AsyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalogAsyncInvoker(
        UpdateCatalogRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateCatalog, hcClient);
    }

    /**
     * 修改码表
     *
     * 修改码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeTableRequest 请求对象
     * @return CompletableFuture<UpdateCodeTableResponse>
     */
    public CompletableFuture<UpdateCodeTableResponse> updateCodeTableAsync(UpdateCodeTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateCodeTable);
    }

    /**
     * 修改码表
     *
     * 修改码表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeTableRequest 请求对象
     * @return AsyncInvoker<UpdateCodeTableRequest, UpdateCodeTableResponse>
     */
    public AsyncInvoker<UpdateCodeTableRequest, UpdateCodeTableResponse> updateCodeTableAsyncInvoker(
        UpdateCodeTableRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateCodeTable, hcClient);
    }

    /**
     * 编辑码表字段值
     *
     * 编辑码表字段值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeTableValuesRequest 请求对象
     * @return CompletableFuture<UpdateCodeTableValuesResponse>
     */
    public CompletableFuture<UpdateCodeTableValuesResponse> updateCodeTableValuesAsync(
        UpdateCodeTableValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateCodeTableValues);
    }

    /**
     * 编辑码表字段值
     *
     * 编辑码表字段值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeTableValuesRequest 请求对象
     * @return AsyncInvoker<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse>
     */
    public AsyncInvoker<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse> updateCodeTableValuesAsyncInvoker(
        UpdateCodeTableValuesRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateCodeTableValues, hcClient);
    }

    /**
     * 更新数据连接信息
     *
     * 更新数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataconnectionRequest 请求对象
     * @return CompletableFuture<UpdateDataconnectionResponse>
     */
    public CompletableFuture<UpdateDataconnectionResponse> updateDataconnectionAsync(
        UpdateDataconnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateDataconnection);
    }

    /**
     * 更新数据连接信息
     *
     * 更新数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataconnectionRequest 请求对象
     * @return AsyncInvoker<UpdateDataconnectionRequest, UpdateDataconnectionResponse>
     */
    public AsyncInvoker<UpdateDataconnectionRequest, UpdateDataconnectionResponse> updateDataconnectionAsyncInvoker(
        UpdateDataconnectionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateDataconnection, hcClient);
    }

    /**
     * 更新汇总表
     *
     * 更新汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignAggregationLogicTableRequest 请求对象
     * @return CompletableFuture<UpdateDesignAggregationLogicTableResponse>
     */
    public CompletableFuture<UpdateDesignAggregationLogicTableResponse> updateDesignAggregationLogicTableAsync(
        UpdateDesignAggregationLogicTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateDesignAggregationLogicTable);
    }

    /**
     * 更新汇总表
     *
     * 更新汇总表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignAggregationLogicTableRequest 请求对象
     * @return AsyncInvoker<UpdateDesignAggregationLogicTableRequest, UpdateDesignAggregationLogicTableResponse>
     */
    public AsyncInvoker<UpdateDesignAggregationLogicTableRequest, UpdateDesignAggregationLogicTableResponse> updateDesignAggregationLogicTableAsyncInvoker(
        UpdateDesignAggregationLogicTableRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateDesignAggregationLogicTable, hcClient);
    }

    /**
     * 更新原子指标
     *
     * 更新单个原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignAtomicIndexRequest 请求对象
     * @return CompletableFuture<UpdateDesignAtomicIndexResponse>
     */
    public CompletableFuture<UpdateDesignAtomicIndexResponse> updateDesignAtomicIndexAsync(
        UpdateDesignAtomicIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateDesignAtomicIndex);
    }

    /**
     * 更新原子指标
     *
     * 更新单个原子指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignAtomicIndexRequest 请求对象
     * @return AsyncInvoker<UpdateDesignAtomicIndexRequest, UpdateDesignAtomicIndexResponse>
     */
    public AsyncInvoker<UpdateDesignAtomicIndexRequest, UpdateDesignAtomicIndexResponse> updateDesignAtomicIndexAsyncInvoker(
        UpdateDesignAtomicIndexRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateDesignAtomicIndex, hcClient);
    }

    /**
     * 更新表的异常数据输出配置
     *
     * 更新表的异常数据输出配置，包括是否生成异常数据、设置异常数据数据库或Schema、设置异常表表前缀/表后缀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignTableQualityRequest 请求对象
     * @return CompletableFuture<UpdateDesignTableQualityResponse>
     */
    public CompletableFuture<UpdateDesignTableQualityResponse> updateDesignTableQualityAsync(
        UpdateDesignTableQualityRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateDesignTableQuality);
    }

    /**
     * 更新表的异常数据输出配置
     *
     * 更新表的异常数据输出配置，包括是否生成异常数据、设置异常数据数据库或Schema、设置异常表表前缀/表后缀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesignTableQualityRequest 请求对象
     * @return AsyncInvoker<UpdateDesignTableQualityRequest, UpdateDesignTableQualityResponse>
     */
    public AsyncInvoker<UpdateDesignTableQualityRequest, UpdateDesignTableQualityResponse> updateDesignTableQualityAsyncInvoker(
        UpdateDesignTableQualityRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateDesignTableQuality, hcClient);
    }

    /**
     * 修改目录
     *
     * 修改目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectoryRequest 请求对象
     * @return CompletableFuture<UpdateDirectoryResponse>
     */
    public CompletableFuture<UpdateDirectoryResponse> updateDirectoryAsync(UpdateDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateDirectory);
    }

    /**
     * 修改目录
     *
     * 修改目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectoryRequest 请求对象
     * @return AsyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse>
     */
    public AsyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectoryAsyncInvoker(
        UpdateDirectoryRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateDirectory, hcClient);
    }

    /**
     * 修改作业名称
     *
     * 修改作业名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFactoryJobNameRequest 请求对象
     * @return CompletableFuture<UpdateFactoryJobNameResponse>
     */
    public CompletableFuture<UpdateFactoryJobNameResponse> updateFactoryJobNameAsync(
        UpdateFactoryJobNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateFactoryJobName);
    }

    /**
     * 修改作业名称
     *
     * 修改作业名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFactoryJobNameRequest 请求对象
     * @return AsyncInvoker<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse>
     */
    public AsyncInvoker<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse> updateFactoryJobNameAsyncInvoker(
        UpdateFactoryJobNameRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateFactoryJobName, hcClient);
    }

    /**
     * 修改当前空间下分配的队列资源
     *
     * 修改当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityAssignedQueueRequest 请求对象
     * @return CompletableFuture<UpdateSecurityAssignedQueueResponse>
     */
    public CompletableFuture<UpdateSecurityAssignedQueueResponse> updateSecurityAssignedQueueAsync(
        UpdateSecurityAssignedQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateSecurityAssignedQueue);
    }

    /**
     * 修改当前空间下分配的队列资源
     *
     * 修改当前空间下分配的队列资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityAssignedQueueRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityAssignedQueueRequest, UpdateSecurityAssignedQueueResponse>
     */
    public AsyncInvoker<UpdateSecurityAssignedQueueRequest, UpdateSecurityAssignedQueueResponse> updateSecurityAssignedQueueAsyncInvoker(
        UpdateSecurityAssignedQueueRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateSecurityAssignedQueue, hcClient);
    }

    /**
     * 修改识别规则接口
     *
     * 修改识别规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDataClassificationRuleRequest 请求对象
     * @return CompletableFuture<UpdateSecurityDataClassificationRuleResponse>
     */
    public CompletableFuture<UpdateSecurityDataClassificationRuleResponse> updateSecurityDataClassificationRuleAsync(
        UpdateSecurityDataClassificationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateSecurityDataClassificationRule);
    }

    /**
     * 修改识别规则接口
     *
     * 修改识别规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityDataClassificationRuleRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityDataClassificationRuleRequest, UpdateSecurityDataClassificationRuleResponse>
     */
    public AsyncInvoker<UpdateSecurityDataClassificationRuleRequest, UpdateSecurityDataClassificationRuleResponse> updateSecurityDataClassificationRuleAsyncInvoker(
        UpdateSecurityDataClassificationRuleRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateSecurityDataClassificationRule, hcClient);
    }

    /**
     * 更新权限集
     *
     * 更新权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPermissionSetRequest 请求对象
     * @return CompletableFuture<UpdateSecurityPermissionSetResponse>
     */
    public CompletableFuture<UpdateSecurityPermissionSetResponse> updateSecurityPermissionSetAsync(
        UpdateSecurityPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateSecurityPermissionSet);
    }

    /**
     * 更新权限集
     *
     * 更新权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPermissionSetRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityPermissionSetRequest, UpdateSecurityPermissionSetResponse>
     */
    public AsyncInvoker<UpdateSecurityPermissionSetRequest, UpdateSecurityPermissionSetResponse> updateSecurityPermissionSetAsyncInvoker(
        UpdateSecurityPermissionSetRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateSecurityPermissionSet, hcClient);
    }

    /**
     * 更新权限集的权限
     *
     * 更新权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPermissionSetPermissionRequest 请求对象
     * @return CompletableFuture<UpdateSecurityPermissionSetPermissionResponse>
     */
    public CompletableFuture<UpdateSecurityPermissionSetPermissionResponse> updateSecurityPermissionSetPermissionAsync(
        UpdateSecurityPermissionSetPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateSecurityPermissionSetPermission);
    }

    /**
     * 更新权限集的权限
     *
     * 更新权限集的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPermissionSetPermissionRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityPermissionSetPermissionRequest, UpdateSecurityPermissionSetPermissionResponse>
     */
    public AsyncInvoker<UpdateSecurityPermissionSetPermissionRequest, UpdateSecurityPermissionSetPermissionResponse> updateSecurityPermissionSetPermissionAsyncInvoker(
        UpdateSecurityPermissionSetPermissionRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateSecurityPermissionSetPermission, hcClient);
    }

    /**
     * 修改识别规则状态接口
     *
     * 修改识别规则状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityRuleEnableStatusRequest 请求对象
     * @return CompletableFuture<UpdateSecurityRuleEnableStatusResponse>
     */
    public CompletableFuture<UpdateSecurityRuleEnableStatusResponse> updateSecurityRuleEnableStatusAsync(
        UpdateSecurityRuleEnableStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateSecurityRuleEnableStatus);
    }

    /**
     * 修改识别规则状态接口
     *
     * 修改识别规则状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityRuleEnableStatusRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityRuleEnableStatusRequest, UpdateSecurityRuleEnableStatusResponse>
     */
    public AsyncInvoker<UpdateSecurityRuleEnableStatusRequest, UpdateSecurityRuleEnableStatusResponse> updateSecurityRuleEnableStatusAsyncInvoker(
        UpdateSecurityRuleEnableStatusRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateSecurityRuleEnableStatus, hcClient);
    }

    /**
     * 根据指定的id修改密级
     *
     * 根据指定的id修改密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecuritySecrecyLevelRequest 请求对象
     * @return CompletableFuture<UpdateSecuritySecrecyLevelResponse>
     */
    public CompletableFuture<UpdateSecuritySecrecyLevelResponse> updateSecuritySecrecyLevelAsync(
        UpdateSecuritySecrecyLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateSecuritySecrecyLevel);
    }

    /**
     * 根据指定的id修改密级
     *
     * 根据指定的id修改密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecuritySecrecyLevelRequest 请求对象
     * @return AsyncInvoker<UpdateSecuritySecrecyLevelRequest, UpdateSecuritySecrecyLevelResponse>
     */
    public AsyncInvoker<UpdateSecuritySecrecyLevelRequest, UpdateSecuritySecrecyLevelResponse> updateSecuritySecrecyLevelAsyncInvoker(
        UpdateSecuritySecrecyLevelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateSecuritySecrecyLevel, hcClient);
    }

    /**
     * 修改数据标准
     *
     * 修改数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardRequest 请求对象
     * @return CompletableFuture<UpdateStandardResponse>
     */
    public CompletableFuture<UpdateStandardResponse> updateStandardAsync(UpdateStandardRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateStandard);
    }

    /**
     * 修改数据标准
     *
     * 修改数据标准。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardRequest 请求对象
     * @return AsyncInvoker<UpdateStandardRequest, UpdateStandardResponse>
     */
    public AsyncInvoker<UpdateStandardRequest, UpdateStandardResponse> updateStandardAsyncInvoker(
        UpdateStandardRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateStandard, hcClient);
    }

    /**
     * 修改数据标准模板
     *
     * 修改数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardTemplateRequest 请求对象
     * @return CompletableFuture<UpdateStandardTemplateResponse>
     */
    public CompletableFuture<UpdateStandardTemplateResponse> updateStandardTemplateAsync(
        UpdateStandardTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateStandardTemplate);
    }

    /**
     * 修改数据标准模板
     *
     * 修改数据标准模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse>
     */
    public AsyncInvoker<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse> updateStandardTemplateAsyncInvoker(
        UpdateStandardTemplateRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateStandardTemplate, hcClient);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubjectRequest 请求对象
     * @return CompletableFuture<UpdateSubjectResponse>
     */
    public CompletableFuture<UpdateSubjectResponse> updateSubjectAsync(UpdateSubjectRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateSubject);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubjectRequest 请求对象
     * @return AsyncInvoker<UpdateSubjectRequest, UpdateSubjectResponse>
     */
    public AsyncInvoker<UpdateSubjectRequest, UpdateSubjectResponse> updateSubjectAsyncInvoker(
        UpdateSubjectRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateSubject, hcClient);
    }

    /**
     * 修改主题(新)
     *
     * 修改主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubjectNewRequest 请求对象
     * @return CompletableFuture<UpdateSubjectNewResponse>
     */
    public CompletableFuture<UpdateSubjectNewResponse> updateSubjectNewAsync(UpdateSubjectNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateSubjectNew);
    }

    /**
     * 修改主题(新)
     *
     * 修改主题(新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubjectNewRequest 请求对象
     * @return AsyncInvoker<UpdateSubjectNewRequest, UpdateSubjectNewResponse>
     */
    public AsyncInvoker<UpdateSubjectNewRequest, UpdateSubjectNewResponse> updateSubjectNewAsyncInvoker(
        UpdateSubjectNewRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateSubjectNew, hcClient);
    }

    /**
     * 更新表模型
     *
     * 在关系建模中更新一个表模型及其属性，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableModelRequest 请求对象
     * @return CompletableFuture<UpdateTableModelResponse>
     */
    public CompletableFuture<UpdateTableModelResponse> updateTableModelAsync(UpdateTableModelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateTableModel);
    }

    /**
     * 更新表模型
     *
     * 在关系建模中更新一个表模型及其属性，包括逻辑实体和物理表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableModelRequest 请求对象
     * @return AsyncInvoker<UpdateTableModelRequest, UpdateTableModelResponse>
     */
    public AsyncInvoker<UpdateTableModelRequest, UpdateTableModelResponse> updateTableModelAsyncInvoker(
        UpdateTableModelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateTableModel, hcClient);
    }

    /**
     * 编辑采集任务
     *
     * 编辑采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskInfoRequest 请求对象
     * @return CompletableFuture<UpdateTaskInfoResponse>
     */
    public CompletableFuture<UpdateTaskInfoResponse> updateTaskInfoAsync(UpdateTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateTaskInfo);
    }

    /**
     * 编辑采集任务
     *
     * 编辑采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskInfoRequest 请求对象
     * @return AsyncInvoker<UpdateTaskInfoRequest, UpdateTaskInfoResponse>
     */
    public AsyncInvoker<UpdateTaskInfoRequest, UpdateTaskInfoResponse> updateTaskInfoAsyncInvoker(
        UpdateTaskInfoRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateTaskInfo, hcClient);
    }

    /**
     * 更新规则模板
     *
     * 更新规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return CompletableFuture<UpdateTemplateResponse>
     */
    public CompletableFuture<UpdateTemplateResponse> updateTemplateAsync(UpdateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateTemplate);
    }

    /**
     * 更新规则模板
     *
     * 更新规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateAsyncInvoker(
        UpdateTemplateRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateTemplate, hcClient);
    }

    /**
     * 编辑工作空间用户或用户组
     *
     * 编辑工作空间用户或用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkSpaceUserOrGroupRequest 请求对象
     * @return CompletableFuture<UpdateWorkSpaceUserOrGroupResponse>
     */
    public CompletableFuture<UpdateWorkSpaceUserOrGroupResponse> updateWorkSpaceUserOrGroupAsync(
        UpdateWorkSpaceUserOrGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateWorkSpaceUserOrGroup);
    }

    /**
     * 编辑工作空间用户或用户组
     *
     * 编辑工作空间用户或用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkSpaceUserOrGroupRequest 请求对象
     * @return AsyncInvoker<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse>
     */
    public AsyncInvoker<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse> updateWorkSpaceUserOrGroupAsyncInvoker(
        UpdateWorkSpaceUserOrGroupRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateWorkSpaceUserOrGroup, hcClient);
    }

    /**
     * 更新模型工作区
     *
     * 更新模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateWorkspace);
    }

    /**
     * 更新模型工作区
     *
     * 更新模型工作区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateWorkspace, hcClient);
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
     * @return CompletableFuture<AuthorizeActionApiToInstanceResponse>
     */
    public CompletableFuture<AuthorizeActionApiToInstanceResponse> authorizeActionApiToInstanceAsync(
        AuthorizeActionApiToInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.authorizeActionApiToInstance);
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
     * @return AsyncInvoker<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse>
     */
    public AsyncInvoker<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse> authorizeActionApiToInstanceAsyncInvoker(
        AuthorizeActionApiToInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.authorizeActionApiToInstance, hcClient);
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
     * @return CompletableFuture<AuthorizeApiToInstanceResponse>
     */
    public CompletableFuture<AuthorizeApiToInstanceResponse> authorizeApiToInstanceAsync(
        AuthorizeApiToInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.authorizeApiToInstance);
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
     * @return AsyncInvoker<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse>
     */
    public AsyncInvoker<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse> authorizeApiToInstanceAsyncInvoker(
        AuthorizeApiToInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.authorizeApiToInstance, hcClient);
    }

    /**
     * 创建API
     *
     * 创建API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiRequest 请求对象
     * @return CompletableFuture<CreateApiResponse>
     */
    public CompletableFuture<CreateApiResponse> createApiAsync(CreateApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.createApi);
    }

    /**
     * 创建API
     *
     * 创建API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiRequest 请求对象
     * @return AsyncInvoker<CreateApiRequest, CreateApiResponse>
     */
    public AsyncInvoker<CreateApiRequest, CreateApiResponse> createApiAsyncInvoker(CreateApiRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.createApi, hcClient);
    }

    /**
     * 调试API
     *
     * 调试API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugApiRequest 请求对象
     * @return CompletableFuture<DebugApiResponse>
     */
    public CompletableFuture<DebugApiResponse> debugApiAsync(DebugApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.debugApi);
    }

    /**
     * 调试API
     *
     * 调试API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugApiRequest 请求对象
     * @return AsyncInvoker<DebugApiRequest, DebugApiResponse>
     */
    public AsyncInvoker<DebugApiRequest, DebugApiResponse> debugApiAsyncInvoker(DebugApiRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.debugApi, hcClient);
    }

    /**
     * 批量删除API
     *
     * 批量删除API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiRequest 请求对象
     * @return CompletableFuture<DeleteApiResponse>
     */
    public CompletableFuture<DeleteApiResponse> deleteApiAsync(DeleteApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.deleteApi);
    }

    /**
     * 批量删除API
     *
     * 批量删除API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiRequest 请求对象
     * @return AsyncInvoker<DeleteApiRequest, DeleteApiResponse>
     */
    public AsyncInvoker<DeleteApiRequest, DeleteApiResponse> deleteApiAsyncInvoker(DeleteApiRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.deleteApi, hcClient);
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
     * @return CompletableFuture<ExecuteApiToInstanceResponse>
     */
    public CompletableFuture<ExecuteApiToInstanceResponse> executeApiToInstanceAsync(
        ExecuteApiToInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.executeApiToInstance);
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
     * @return AsyncInvoker<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse>
     */
    public AsyncInvoker<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse> executeApiToInstanceAsyncInvoker(
        ExecuteApiToInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.executeApiToInstance, hcClient);
    }

    /**
     * 导出包含API信息的excel文件
     *
     * 导出包含API信息的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceExcelRequest 请求对象
     * @return CompletableFuture<ExportDataServiceExcelResponse>
     */
    public CompletableFuture<ExportDataServiceExcelResponse> exportDataServiceExcelAsync(
        ExportDataServiceExcelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.exportDataServiceExcel);
    }

    /**
     * 导出包含API信息的excel文件
     *
     * 导出包含API信息的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceExcelRequest 请求对象
     * @return AsyncInvoker<ExportDataServiceExcelRequest, ExportDataServiceExcelResponse>
     */
    public AsyncInvoker<ExportDataServiceExcelRequest, ExportDataServiceExcelResponse> exportDataServiceExcelAsyncInvoker(
        ExportDataServiceExcelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.exportDataServiceExcel, hcClient);
    }

    /**
     * 下载excel模板
     *
     * 下载excel模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceExcelTemplateRequest 请求对象
     * @return CompletableFuture<ExportDataServiceExcelTemplateResponse>
     */
    public CompletableFuture<ExportDataServiceExcelTemplateResponse> exportDataServiceExcelTemplateAsync(
        ExportDataServiceExcelTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.exportDataServiceExcelTemplate);
    }

    /**
     * 下载excel模板
     *
     * 下载excel模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceExcelTemplateRequest 请求对象
     * @return AsyncInvoker<ExportDataServiceExcelTemplateRequest, ExportDataServiceExcelTemplateResponse>
     */
    public AsyncInvoker<ExportDataServiceExcelTemplateRequest, ExportDataServiceExcelTemplateResponse> exportDataServiceExcelTemplateAsyncInvoker(
        ExportDataServiceExcelTemplateRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.exportDataServiceExcelTemplate, hcClient);
    }

    /**
     * 全量导出包含API的excel压缩文件
     *
     * 全量导出包含API的excel压缩文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceZipRequest 请求对象
     * @return CompletableFuture<ExportDataServiceZipResponse>
     */
    public CompletableFuture<ExportDataServiceZipResponse> exportDataServiceZipAsync(
        ExportDataServiceZipRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.exportDataServiceZip);
    }

    /**
     * 全量导出包含API的excel压缩文件
     *
     * 全量导出包含API的excel压缩文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDataServiceZipRequest 请求对象
     * @return AsyncInvoker<ExportDataServiceZipRequest, ExportDataServiceZipResponse>
     */
    public AsyncInvoker<ExportDataServiceZipRequest, ExportDataServiceZipResponse> exportDataServiceZipAsyncInvoker(
        ExportDataServiceZipRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.exportDataServiceZip, hcClient);
    }

    /**
     * 导入包含API信息的excel文件
     *
     * 导入包含API信息的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataServiceExcelRequest 请求对象
     * @return CompletableFuture<ImportDataServiceExcelResponse>
     */
    public CompletableFuture<ImportDataServiceExcelResponse> importDataServiceExcelAsync(
        ImportDataServiceExcelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.importDataServiceExcel);
    }

    /**
     * 导入包含API信息的excel文件
     *
     * 导入包含API信息的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportDataServiceExcelRequest 请求对象
     * @return AsyncInvoker<ImportDataServiceExcelRequest, ImportDataServiceExcelResponse>
     */
    public AsyncInvoker<ImportDataServiceExcelRequest, ImportDataServiceExcelResponse> importDataServiceExcelAsyncInvoker(
        ImportDataServiceExcelRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.importDataServiceExcel, hcClient);
    }

    /**
     * 查询API列表
     *
     * 查询API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisRequest 请求对象
     * @return CompletableFuture<ListApisResponse>
     */
    public CompletableFuture<ListApisResponse> listApisAsync(ListApisRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listApis);
    }

    /**
     * 查询API列表
     *
     * 查询API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisRequest 请求对象
     * @return AsyncInvoker<ListApisRequest, ListApisResponse>
     */
    public AsyncInvoker<ListApisRequest, ListApisResponse> listApisAsyncInvoker(ListApisRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listApis, hcClient);
    }

    /**
     * 查看API不同操作对应的实例信息(专享版)
     *
     * 查看API不同操作对应的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceListRequest 请求对象
     * @return CompletableFuture<ListInstanceListResponse>
     */
    public CompletableFuture<ListInstanceListResponse> listInstanceListAsync(ListInstanceListRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.listInstanceList);
    }

    /**
     * 查看API不同操作对应的实例信息(专享版)
     *
     * 查看API不同操作对应的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceListRequest 请求对象
     * @return AsyncInvoker<ListInstanceListRequest, ListInstanceListResponse>
     */
    public AsyncInvoker<ListInstanceListRequest, ListInstanceListResponse> listInstanceListAsyncInvoker(
        ListInstanceListRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.listInstanceList, hcClient);
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
     * @return CompletableFuture<PublishApiToInstanceResponse>
     */
    public CompletableFuture<PublishApiToInstanceResponse> publishApiToInstanceAsync(
        PublishApiToInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.publishApiToInstance);
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
     * @return AsyncInvoker<PublishApiToInstanceRequest, PublishApiToInstanceResponse>
     */
    public AsyncInvoker<PublishApiToInstanceRequest, PublishApiToInstanceResponse> publishApiToInstanceAsyncInvoker(
        PublishApiToInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.publishApiToInstance, hcClient);
    }

    /**
     * 查看API调试信息(专享版)
     *
     * 查看API在不同集群上的调试信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDebugInfoRequest 请求对象
     * @return CompletableFuture<SearchDebugInfoResponse>
     */
    public CompletableFuture<SearchDebugInfoResponse> searchDebugInfoAsync(SearchDebugInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchDebugInfo);
    }

    /**
     * 查看API调试信息(专享版)
     *
     * 查看API在不同集群上的调试信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDebugInfoRequest 请求对象
     * @return AsyncInvoker<SearchDebugInfoRequest, SearchDebugInfoResponse>
     */
    public AsyncInvoker<SearchDebugInfoRequest, SearchDebugInfoResponse> searchDebugInfoAsyncInvoker(
        SearchDebugInfoRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchDebugInfo, hcClient);
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
     * @return CompletableFuture<SearchPublishInfoResponse>
     */
    public CompletableFuture<SearchPublishInfoResponse> searchPublishInfoAsync(SearchPublishInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.searchPublishInfo);
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
     * @return AsyncInvoker<SearchPublishInfoRequest, SearchPublishInfoResponse>
     */
    public AsyncInvoker<SearchPublishInfoRequest, SearchPublishInfoResponse> searchPublishInfoAsyncInvoker(
        SearchPublishInfoRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.searchPublishInfo, hcClient);
    }

    /**
     * 查询API信息
     *
     * 查询API信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiRequest 请求对象
     * @return CompletableFuture<ShowApiResponse>
     */
    public CompletableFuture<ShowApiResponse> showApiAsync(ShowApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.showApi);
    }

    /**
     * 查询API信息
     *
     * 查询API信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiRequest 请求对象
     * @return AsyncInvoker<ShowApiRequest, ShowApiResponse>
     */
    public AsyncInvoker<ShowApiRequest, ShowApiResponse> showApiAsyncInvoker(ShowApiRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.showApi, hcClient);
    }

    /**
     * 更新API
     *
     * 更新API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiRequest 请求对象
     * @return CompletableFuture<UpdateApiResponse>
     */
    public CompletableFuture<UpdateApiResponse> updateApiAsync(UpdateApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsStudioMeta.updateApi);
    }

    /**
     * 更新API
     *
     * 更新API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiRequest 请求对象
     * @return AsyncInvoker<UpdateApiRequest, UpdateApiResponse>
     */
    public AsyncInvoker<UpdateApiRequest, UpdateApiResponse> updateApiAsyncInvoker(UpdateApiRequest request) {
        return new AsyncInvoker<>(request, DataArtsStudioMeta.updateApi, hcClient);
    }

}
