package com.huaweicloud.sdk.dataartsstudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteTemplatesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteTemplatesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchOfflineRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchOfflineResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchPublishRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchPublishResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchSyncMetadataRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchSyncMetadataResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryEnvRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryEnvResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateManagerWorkSpaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateManagerWorkSpaceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateAssetResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityLevelFromEntityRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeleteSecurityLevelFromEntityResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteTaskActionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteTaskActionResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiToInstanceResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchDwByTypeRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchDwByTypeResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataProfileRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataProfileResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataSetsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataSetsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataconnectionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowDataconnectionResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactorySupplementDataRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowFactorySupplementDataResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowGlossaryListRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowGlossaryListResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceLogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceLogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowInstanceResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMessageDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMessageDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMetricAssetsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMetricAssetsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMetricTreeRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowMetricTreeResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowPathByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowPathByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowPathObjectByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowPathObjectByIdResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowQualityTaskDetailRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowQualityTaskDetailResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowRelationByIdRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ShowRelationByIdResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDirectoryRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateDirectoryResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameResponse;
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
     * 标签关联到资产
     *
     * 标签关联到资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddTagToAssetRequest 请求对象
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
     * @param AddTagToAssetRequest 请求对象
     * @return SyncInvoker<AddTagToAssetRequest, AddTagToAssetResponse>
     */
    public SyncInvoker<AddTagToAssetRequest, AddTagToAssetResponse> addTagToAssetInvoker(AddTagToAssetRequest request) {
        return new SyncInvoker<AddTagToAssetRequest, AddTagToAssetResponse>(request, DataArtsStudioMeta.addTagToAsset,
            hcClient);
    }

    /**
     * 添加工作空间用户
     *
     * 添加工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddWorkSpaceUsersRequest 请求对象
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
     * @param AddWorkSpaceUsersRequest 请求对象
     * @return SyncInvoker<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse>
     */
    public SyncInvoker<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse> addWorkSpaceUsersInvoker(
        AddWorkSpaceUsersRequest request) {
        return new SyncInvoker<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse>(request,
            DataArtsStudioMeta.addWorkSpaceUsers, hcClient);
    }

    /**
     * 资产关联分类
     *
     * 将一个分类关联到一个或多个指定guid的资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateClassificationToEntityRequest 请求对象
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
     * @param AssociateClassificationToEntityRequest 请求对象
     * @return SyncInvoker<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse>
     */
    public SyncInvoker<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse> associateClassificationToEntityInvoker(
        AssociateClassificationToEntityRequest request) {
        return new SyncInvoker<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse>(request,
            DataArtsStudioMeta.associateClassificationToEntity, hcClient);
    }

    /**
     * 资产关联密级
     *
     * 关联资产到密级，资产关联指定密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSecurityLevelToEntitieRequest 请求对象
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
     * @param AssociateSecurityLevelToEntitieRequest 请求对象
     * @return SyncInvoker<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse>
     */
    public SyncInvoker<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse> associateSecurityLevelToEntitieInvoker(
        AssociateSecurityLevelToEntitieRequest request) {
        return new SyncInvoker<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse>(request,
            DataArtsStudioMeta.associateSecurityLevelToEntitie, hcClient);
    }

    /**
     * 审核申请
     *
     * 审核申请
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchApproveApplyRequest 请求对象
     * @return BatchApproveApplyResponse
     */
    public BatchApproveApplyResponse batchApproveApply(BatchApproveApplyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchApproveApply);
    }

    /**
     * 审核申请
     *
     * 审核申请
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchApproveApplyRequest 请求对象
     * @return SyncInvoker<BatchApproveApplyRequest, BatchApproveApplyResponse>
     */
    public SyncInvoker<BatchApproveApplyRequest, BatchApproveApplyResponse> batchApproveApplyInvoker(
        BatchApproveApplyRequest request) {
        return new SyncInvoker<BatchApproveApplyRequest, BatchApproveApplyResponse>(request,
            DataArtsStudioMeta.batchApproveApply, hcClient);
    }

    /**
     * 批量资产关联分类
     *
     * 批量资产关联分类：只支持对数据表的列和OBS对象添加分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAssociateClassificationToEntitiesRequest 请求对象
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
     * @param BatchAssociateClassificationToEntitiesRequest 请求对象
     * @return SyncInvoker<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse>
     */
    public SyncInvoker<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse> batchAssociateClassificationToEntitiesInvoker(
        BatchAssociateClassificationToEntitiesRequest request) {
        return new SyncInvoker<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse>(
            request, DataArtsStudioMeta.batchAssociateClassificationToEntities, hcClient);
    }

    /**
     * 批量资产关联密级
     *
     * 批量资产关联密级：单个密级关联到多个资产上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAssociateSecurityLevelToEntitiesRequest 请求对象
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
     * @param BatchAssociateSecurityLevelToEntitiesRequest 请求对象
     * @return SyncInvoker<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse>
     */
    public SyncInvoker<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse> batchAssociateSecurityLevelToEntitiesInvoker(
        BatchAssociateSecurityLevelToEntitiesRequest request) {
        return new SyncInvoker<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse>(
            request, DataArtsStudioMeta.batchAssociateSecurityLevelToEntities, hcClient);
    }

    /**
     * 批量删除规则模板
     *
     * 批量删除规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTemplatesRequest 请求对象
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
     * @param BatchDeleteTemplatesRequest 请求对象
     * @return SyncInvoker<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse>
     */
    public SyncInvoker<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse> batchDeleteTemplatesInvoker(
        BatchDeleteTemplatesRequest request) {
        return new SyncInvoker<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse>(request,
            DataArtsStudioMeta.batchDeleteTemplates, hcClient);
    }

    /**
     * 批量下线
     *
     * 批量下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchOfflineRequest 请求对象
     * @return BatchOfflineResponse
     */
    public BatchOfflineResponse batchOffline(BatchOfflineRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchOffline);
    }

    /**
     * 批量下线
     *
     * 批量下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchOfflineRequest 请求对象
     * @return SyncInvoker<BatchOfflineRequest, BatchOfflineResponse>
     */
    public SyncInvoker<BatchOfflineRequest, BatchOfflineResponse> batchOfflineInvoker(BatchOfflineRequest request) {
        return new SyncInvoker<BatchOfflineRequest, BatchOfflineResponse>(request, DataArtsStudioMeta.batchOffline,
            hcClient);
    }

    /**
     * 批量发布
     *
     * 批量发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchPublishRequest 请求对象
     * @return BatchPublishResponse
     */
    public BatchPublishResponse batchPublish(BatchPublishRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.batchPublish);
    }

    /**
     * 批量发布
     *
     * 批量发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchPublishRequest 请求对象
     * @return SyncInvoker<BatchPublishRequest, BatchPublishResponse>
     */
    public SyncInvoker<BatchPublishRequest, BatchPublishResponse> batchPublishInvoker(BatchPublishRequest request) {
        return new SyncInvoker<BatchPublishRequest, BatchPublishResponse>(request, DataArtsStudioMeta.batchPublish,
            hcClient);
    }

    /**
     * 元数据实时同步接口(邀测)
     *
     * 元数据实时同步接口，支持批量。该接口功能处于邀测阶段，后续将随功能公测将逐步开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchSyncMetadataRequest 请求对象
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
     * @param BatchSyncMetadataRequest 请求对象
     * @return SyncInvoker<BatchSyncMetadataRequest, BatchSyncMetadataResponse>
     */
    public SyncInvoker<BatchSyncMetadataRequest, BatchSyncMetadataResponse> batchSyncMetadataInvoker(
        BatchSyncMetadataRequest request) {
        return new SyncInvoker<BatchSyncMetadataRequest, BatchSyncMetadataResponse>(request,
            DataArtsStudioMeta.batchSyncMetadata, hcClient);
    }

    /**
     * 修改流程架构
     *
     * 修改流程架构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeCatalogRequest 请求对象
     * @return ChangeCatalogResponse
     */
    public ChangeCatalogResponse changeCatalog(ChangeCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.changeCatalog);
    }

    /**
     * 修改流程架构
     *
     * 修改流程架构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeCatalogRequest 请求对象
     * @return SyncInvoker<ChangeCatalogRequest, ChangeCatalogResponse>
     */
    public SyncInvoker<ChangeCatalogRequest, ChangeCatalogResponse> changeCatalogInvoker(ChangeCatalogRequest request) {
        return new SyncInvoker<ChangeCatalogRequest, ChangeCatalogResponse>(request, DataArtsStudioMeta.changeCatalog,
            hcClient);
    }

    /**
     * 规格变更接口
     *
     * 规格变更接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeResourceRequest 请求对象
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
     * @param ChangeResourceRequest 请求对象
     * @return SyncInvoker<ChangeResourceRequest, ChangeResourceResponse>
     */
    public SyncInvoker<ChangeResourceRequest, ChangeResourceResponse> changeResourceInvoker(
        ChangeResourceRequest request) {
        return new SyncInvoker<ChangeResourceRequest, ChangeResourceResponse>(request,
            DataArtsStudioMeta.changeResource, hcClient);
    }

    /**
     * 修改或删除主题层级
     *
     * 修改或删除主题层级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeSubjectsRequest 请求对象
     * @return ChangeSubjectsResponse
     */
    public ChangeSubjectsResponse changeSubjects(ChangeSubjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.changeSubjects);
    }

    /**
     * 修改或删除主题层级
     *
     * 修改或删除主题层级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeSubjectsRequest 请求对象
     * @return SyncInvoker<ChangeSubjectsRequest, ChangeSubjectsResponse>
     */
    public SyncInvoker<ChangeSubjectsRequest, ChangeSubjectsResponse> changeSubjectsInvoker(
        ChangeSubjectsRequest request) {
        return new SyncInvoker<ChangeSubjectsRequest, ChangeSubjectsResponse>(request,
            DataArtsStudioMeta.changeSubjects, hcClient);
    }

    /**
     * 查看逆向维度表任务
     *
     * 查看逆向维度表任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDimensionStatusRequest 请求对象
     * @return CheckDimensionStatusResponse
     */
    public CheckDimensionStatusResponse checkDimensionStatus(CheckDimensionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.checkDimensionStatus);
    }

    /**
     * 查看逆向维度表任务
     *
     * 查看逆向维度表任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDimensionStatusRequest 请求对象
     * @return SyncInvoker<CheckDimensionStatusRequest, CheckDimensionStatusResponse>
     */
    public SyncInvoker<CheckDimensionStatusRequest, CheckDimensionStatusResponse> checkDimensionStatusInvoker(
        CheckDimensionStatusRequest request) {
        return new SyncInvoker<CheckDimensionStatusRequest, CheckDimensionStatusResponse>(request,
            DataArtsStudioMeta.checkDimensionStatus, hcClient);
    }

    /**
     * 查看逆向事实表任务
     *
     * 查看逆向事实表任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckFactLogicTableStatusRequest 请求对象
     * @return CheckFactLogicTableStatusResponse
     */
    public CheckFactLogicTableStatusResponse checkFactLogicTableStatus(CheckFactLogicTableStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.checkFactLogicTableStatus);
    }

    /**
     * 查看逆向事实表任务
     *
     * 查看逆向事实表任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckFactLogicTableStatusRequest 请求对象
     * @return SyncInvoker<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse>
     */
    public SyncInvoker<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse> checkFactLogicTableStatusInvoker(
        CheckFactLogicTableStatusRequest request) {
        return new SyncInvoker<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse>(request,
            DataArtsStudioMeta.checkFactLogicTableStatus, hcClient);
    }

    /**
     * 审批单处理
     *
     * 审批驳回/通过，单个或多个 action-id&#x3D;reject/resolve
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmApprovalsRequest 请求对象
     * @return ConfirmApprovalsResponse
     */
    public ConfirmApprovalsResponse confirmApprovals(ConfirmApprovalsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.confirmApprovals);
    }

    /**
     * 审批单处理
     *
     * 审批驳回/通过，单个或多个 action-id&#x3D;reject/resolve
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmApprovalsRequest 请求对象
     * @return SyncInvoker<ConfirmApprovalsRequest, ConfirmApprovalsResponse>
     */
    public SyncInvoker<ConfirmApprovalsRequest, ConfirmApprovalsResponse> confirmApprovalsInvoker(
        ConfirmApprovalsRequest request) {
        return new SyncInvoker<ConfirmApprovalsRequest, ConfirmApprovalsResponse>(request,
            DataArtsStudioMeta.confirmApprovals, hcClient);
    }

    /**
     * 处理消息
     *
     * 处理消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmMessageRequest 请求对象
     * @return ConfirmMessageResponse
     */
    public ConfirmMessageResponse confirmMessage(ConfirmMessageRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.confirmMessage);
    }

    /**
     * 处理消息
     *
     * 处理消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmMessageRequest 请求对象
     * @return SyncInvoker<ConfirmMessageRequest, ConfirmMessageResponse>
     */
    public SyncInvoker<ConfirmMessageRequest, ConfirmMessageResponse> confirmMessageInvoker(
        ConfirmMessageRequest request) {
        return new SyncInvoker<ConfirmMessageRequest, ConfirmMessageResponse>(request,
            DataArtsStudioMeta.confirmMessage, hcClient);
    }

    /**
     * 关系建模统计信息
     *
     * 关系建模统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountAllModelsRequest 请求对象
     * @return CountAllModelsResponse
     */
    public CountAllModelsResponse countAllModels(CountAllModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.countAllModels);
    }

    /**
     * 关系建模统计信息
     *
     * 关系建模统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountAllModelsRequest 请求对象
     * @return SyncInvoker<CountAllModelsRequest, CountAllModelsResponse>
     */
    public SyncInvoker<CountAllModelsRequest, CountAllModelsResponse> countAllModelsInvoker(
        CountAllModelsRequest request) {
        return new SyncInvoker<CountAllModelsRequest, CountAllModelsResponse>(request,
            DataArtsStudioMeta.countAllModels, hcClient);
    }

    /**
     * 总览统计信息
     *
     * 总览统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountOverviewsRequest 请求对象
     * @return CountOverviewsResponse
     */
    public CountOverviewsResponse countOverviews(CountOverviewsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.countOverviews);
    }

    /**
     * 总览统计信息
     *
     * 总览统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountOverviewsRequest 请求对象
     * @return SyncInvoker<CountOverviewsRequest, CountOverviewsResponse>
     */
    public SyncInvoker<CountOverviewsRequest, CountOverviewsResponse> countOverviewsInvoker(
        CountOverviewsRequest request) {
        return new SyncInvoker<CountOverviewsRequest, CountOverviewsResponse>(request,
            DataArtsStudioMeta.countOverviews, hcClient);
    }

    /**
     * 标准覆盖率统计信息
     *
     * 标准覆盖率统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountStandardsRequest 请求对象
     * @return CountStandardsResponse
     */
    public CountStandardsResponse countStandards(CountStandardsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.countStandards);
    }

    /**
     * 标准覆盖率统计信息
     *
     * 标准覆盖率统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountStandardsRequest 请求对象
     * @return SyncInvoker<CountStandardsRequest, CountStandardsResponse>
     */
    public SyncInvoker<CountStandardsRequest, CountStandardsResponse> countStandardsInvoker(
        CountStandardsRequest request) {
        return new SyncInvoker<CountStandardsRequest, CountStandardsResponse>(request,
            DataArtsStudioMeta.countStandards, hcClient);
    }

    /**
     * 模型统计信息
     *
     * 模型统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountTableModelsRequest 请求对象
     * @return CountTableModelsResponse
     */
    public CountTableModelsResponse countTableModels(CountTableModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.countTableModels);
    }

    /**
     * 模型统计信息
     *
     * 模型统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountTableModelsRequest 请求对象
     * @return SyncInvoker<CountTableModelsRequest, CountTableModelsResponse>
     */
    public SyncInvoker<CountTableModelsRequest, CountTableModelsResponse> countTableModelsInvoker(
        CountTableModelsRequest request) {
        return new SyncInvoker<CountTableModelsRequest, CountTableModelsResponse>(request,
            DataArtsStudioMeta.countTableModels, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, DataArtsStudioMeta.createApp, hcClient);
    }

    /**
     * 创建审批人
     *
     * 创建审批人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApproverRequest 请求对象
     * @return CreateApproverResponse
     */
    public CreateApproverResponse createApprover(CreateApproverRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createApprover);
    }

    /**
     * 创建审批人
     *
     * 创建审批人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApproverRequest 请求对象
     * @return SyncInvoker<CreateApproverRequest, CreateApproverResponse>
     */
    public SyncInvoker<CreateApproverRequest, CreateApproverResponse> createApproverInvoker(
        CreateApproverRequest request) {
        return new SyncInvoker<CreateApproverRequest, CreateApproverResponse>(request,
            DataArtsStudioMeta.createApprover, hcClient);
    }

    /**
     * 创建业务指标
     *
     * 创建业务指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBizMetricRequest 请求对象
     * @return CreateBizMetricResponse
     */
    public CreateBizMetricResponse createBizMetric(CreateBizMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createBizMetric);
    }

    /**
     * 创建业务指标
     *
     * 创建业务指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBizMetricRequest 请求对象
     * @return SyncInvoker<CreateBizMetricRequest, CreateBizMetricResponse>
     */
    public SyncInvoker<CreateBizMetricRequest, CreateBizMetricResponse> createBizMetricInvoker(
        CreateBizMetricRequest request) {
        return new SyncInvoker<CreateBizMetricRequest, CreateBizMetricResponse>(request,
            DataArtsStudioMeta.createBizMetric, hcClient);
    }

    /**
     * 创建流程架构
     *
     * 创建流程架构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return CreateCatalogResponse
     */
    public CreateCatalogResponse createCatalog(CreateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createCatalog);
    }

    /**
     * 创建流程架构
     *
     * 创建流程架构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return SyncInvoker<CreateCatalogRequest, CreateCatalogResponse>
     */
    public SyncInvoker<CreateCatalogRequest, CreateCatalogResponse> createCatalogInvoker(CreateCatalogRequest request) {
        return new SyncInvoker<CreateCatalogRequest, CreateCatalogResponse>(request, DataArtsStudioMeta.createCatalog,
            hcClient);
    }

    /**
     * 创建码表
     *
     * 创建码表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCodeTableRequest 请求对象
     * @return CreateCodeTableResponse
     */
    public CreateCodeTableResponse createCodeTable(CreateCodeTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createCodeTable);
    }

    /**
     * 创建码表
     *
     * 创建码表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCodeTableRequest 请求对象
     * @return SyncInvoker<CreateCodeTableRequest, CreateCodeTableResponse>
     */
    public SyncInvoker<CreateCodeTableRequest, CreateCodeTableResponse> createCodeTableInvoker(
        CreateCodeTableRequest request) {
        return new SyncInvoker<CreateCodeTableRequest, CreateCodeTableResponse>(request,
            DataArtsStudioMeta.createCodeTable, hcClient);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionsRequest 请求对象
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
     * @param CreateConnectionsRequest 请求对象
     * @return SyncInvoker<CreateConnectionsRequest, CreateConnectionsResponse>
     */
    public SyncInvoker<CreateConnectionsRequest, CreateConnectionsResponse> createConnectionsInvoker(
        CreateConnectionsRequest request) {
        return new SyncInvoker<CreateConnectionsRequest, CreateConnectionsResponse>(request,
            DataArtsStudioMeta.createConnections, hcClient);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDirectoryRequest 请求对象
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectory(CreateDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createDirectory);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDirectoryRequest 请求对象
     * @return SyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse>
     */
    public SyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse> createDirectoryInvoker(
        CreateDirectoryRequest request) {
        return new SyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse>(request,
            DataArtsStudioMeta.createDirectory, hcClient);
    }

    /**
     * 创建环境变量
     *
     * 创建环境变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFactoryEnvRequest 请求对象
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
     * @param CreateFactoryEnvRequest 请求对象
     * @return SyncInvoker<CreateFactoryEnvRequest, CreateFactoryEnvResponse>
     */
    public SyncInvoker<CreateFactoryEnvRequest, CreateFactoryEnvResponse> createFactoryEnvInvoker(
        CreateFactoryEnvRequest request) {
        return new SyncInvoker<CreateFactoryEnvRequest, CreateFactoryEnvResponse>(request,
            DataArtsStudioMeta.createFactoryEnv, hcClient);
    }

    /**
     * 创建补数据实例的接口
     *
     * 创建一个补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFactorySupplementDataInstanceRequest 请求对象
     * @return CreateFactorySupplementDataInstanceResponse
     */
    public CreateFactorySupplementDataInstanceResponse createFactorySupplementDataInstance(
        CreateFactorySupplementDataInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createFactorySupplementDataInstance);
    }

    /**
     * 创建补数据实例的接口
     *
     * 创建一个补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFactorySupplementDataInstanceRequest 请求对象
     * @return SyncInvoker<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse>
     */
    public SyncInvoker<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse> createFactorySupplementDataInstanceInvoker(
        CreateFactorySupplementDataInstanceRequest request) {
        return new SyncInvoker<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse>(
            request, DataArtsStudioMeta.createFactorySupplementDataInstance, hcClient);
    }

    /**
     * 创建工作空间
     *
     * 创建工作空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateManagerWorkSpaceRequest 请求对象
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
     * @param CreateManagerWorkSpaceRequest 请求对象
     * @return SyncInvoker<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse>
     */
    public SyncInvoker<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse> createManagerWorkSpaceInvoker(
        CreateManagerWorkSpaceRequest request) {
        return new SyncInvoker<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse>(request,
            DataArtsStudioMeta.createManagerWorkSpace, hcClient);
    }

    /**
     * 添加或修改资产
     *
     * 添加或修改资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrUpdateAssetRequest 请求对象
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
     * @param CreateOrUpdateAssetRequest 请求对象
     * @return SyncInvoker<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse>
     */
    public SyncInvoker<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse> createOrUpdateAssetInvoker(
        CreateOrUpdateAssetRequest request) {
        return new SyncInvoker<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse>(request,
            DataArtsStudioMeta.createOrUpdateAsset, hcClient);
    }

    /**
     * 创建服务目录
     *
     * 创建服务目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceCatalogRequest 请求对象
     * @return CreateServiceCatalogResponse
     */
    public CreateServiceCatalogResponse createServiceCatalog(CreateServiceCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createServiceCatalog);
    }

    /**
     * 创建服务目录
     *
     * 创建服务目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceCatalogRequest 请求对象
     * @return SyncInvoker<CreateServiceCatalogRequest, CreateServiceCatalogResponse>
     */
    public SyncInvoker<CreateServiceCatalogRequest, CreateServiceCatalogResponse> createServiceCatalogInvoker(
        CreateServiceCatalogRequest request) {
        return new SyncInvoker<CreateServiceCatalogRequest, CreateServiceCatalogResponse>(request,
            DataArtsStudioMeta.createServiceCatalog, hcClient);
    }

    /**
     * 创建数据标准
     *
     * 创建数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStandardRequest 请求对象
     * @return CreateStandardResponse
     */
    public CreateStandardResponse createStandard(CreateStandardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createStandard);
    }

    /**
     * 创建数据标准
     *
     * 创建数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStandardRequest 请求对象
     * @return SyncInvoker<CreateStandardRequest, CreateStandardResponse>
     */
    public SyncInvoker<CreateStandardRequest, CreateStandardResponse> createStandardInvoker(
        CreateStandardRequest request) {
        return new SyncInvoker<CreateStandardRequest, CreateStandardResponse>(request,
            DataArtsStudioMeta.createStandard, hcClient);
    }

    /**
     * 创建数据标准模板
     *
     * 创建数据标准模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStandardTemplateRequest 请求对象
     * @return CreateStandardTemplateResponse
     */
    public CreateStandardTemplateResponse createStandardTemplate(CreateStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createStandardTemplate);
    }

    /**
     * 创建数据标准模板
     *
     * 创建数据标准模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStandardTemplateRequest 请求对象
     * @return SyncInvoker<CreateStandardTemplateRequest, CreateStandardTemplateResponse>
     */
    public SyncInvoker<CreateStandardTemplateRequest, CreateStandardTemplateResponse> createStandardTemplateInvoker(
        CreateStandardTemplateRequest request) {
        return new SyncInvoker<CreateStandardTemplateRequest, CreateStandardTemplateResponse>(request,
            DataArtsStudioMeta.createStandardTemplate, hcClient);
    }

    /**
     * 创建主题
     *
     * 创建主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubjectRequest 请求对象
     * @return CreateSubjectResponse
     */
    public CreateSubjectResponse createSubject(CreateSubjectRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSubject);
    }

    /**
     * 创建主题
     *
     * 创建主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubjectRequest 请求对象
     * @return SyncInvoker<CreateSubjectRequest, CreateSubjectResponse>
     */
    public SyncInvoker<CreateSubjectRequest, CreateSubjectResponse> createSubjectInvoker(CreateSubjectRequest request) {
        return new SyncInvoker<CreateSubjectRequest, CreateSubjectResponse>(request, DataArtsStudioMeta.createSubject,
            hcClient);
    }

    /**
     * 创建主题(新)
     *
     * 创建主题(新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubjectNewRequest 请求对象
     * @return CreateSubjectNewResponse
     */
    public CreateSubjectNewResponse createSubjectNew(CreateSubjectNewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createSubjectNew);
    }

    /**
     * 创建主题(新)
     *
     * 创建主题(新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubjectNewRequest 请求对象
     * @return SyncInvoker<CreateSubjectNewRequest, CreateSubjectNewResponse>
     */
    public SyncInvoker<CreateSubjectNewRequest, CreateSubjectNewResponse> createSubjectNewInvoker(
        CreateSubjectNewRequest request) {
        return new SyncInvoker<CreateSubjectNewRequest, CreateSubjectNewResponse>(request,
            DataArtsStudioMeta.createSubjectNew, hcClient);
    }

    /**
     * 创建模型实体
     *
     * 创建一个模型实体，包括逻辑实体或物理数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableModelRequest 请求对象
     * @return CreateTableModelResponse
     */
    public CreateTableModelResponse createTableModel(CreateTableModelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createTableModel);
    }

    /**
     * 创建模型实体
     *
     * 创建一个模型实体，包括逻辑实体或物理数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableModelRequest 请求对象
     * @return SyncInvoker<CreateTableModelRequest, CreateTableModelResponse>
     */
    public SyncInvoker<CreateTableModelRequest, CreateTableModelResponse> createTableModelInvoker(
        CreateTableModelRequest request) {
        return new SyncInvoker<CreateTableModelRequest, CreateTableModelResponse>(request,
            DataArtsStudioMeta.createTableModel, hcClient);
    }

    /**
     * 创建采集任务
     *
     * 创建采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
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
     * @param CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, DataArtsStudioMeta.createTask, hcClient);
    }

    /**
     * 创建规则模板
     *
     * 创建规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
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
     * @param CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request,
            DataArtsStudioMeta.createTemplate, hcClient);
    }

    /**
     * 新建模型工作区
     *
     * 新建模型工作区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkspaceRequest 请求对象
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createWorkspace);
    }

    /**
     * 新建模型工作区
     *
     * 新建模型工作区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceInvoker(
        CreateWorkspaceRequest request) {
        return new SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>(request,
            DataArtsStudioMeta.createWorkspace, hcClient);
    }

    /**
     * 测试创建数据连接
     *
     * 测试创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugDataconnectionRequest 请求对象
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
     * @param DebugDataconnectionRequest 请求对象
     * @return SyncInvoker<DebugDataconnectionRequest, DebugDataconnectionResponse>
     */
    public SyncInvoker<DebugDataconnectionRequest, DebugDataconnectionResponse> debugDataconnectionInvoker(
        DebugDataconnectionRequest request) {
        return new SyncInvoker<DebugDataconnectionRequest, DebugDataconnectionResponse>(request,
            DataArtsStudioMeta.debugDataconnection, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, DataArtsStudioMeta.deleteApp, hcClient);
    }

    /**
     * 删除审批人
     *
     * 删除审批人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApproverRequest 请求对象
     * @return DeleteApproverResponse
     */
    public DeleteApproverResponse deleteApprover(DeleteApproverRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteApprover);
    }

    /**
     * 删除审批人
     *
     * 删除审批人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApproverRequest 请求对象
     * @return SyncInvoker<DeleteApproverRequest, DeleteApproverResponse>
     */
    public SyncInvoker<DeleteApproverRequest, DeleteApproverResponse> deleteApproverInvoker(
        DeleteApproverRequest request) {
        return new SyncInvoker<DeleteApproverRequest, DeleteApproverResponse>(request,
            DataArtsStudioMeta.deleteApprover, hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetRequest 请求对象
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
     * @param DeleteAssetRequest 请求对象
     * @return SyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public SyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetInvoker(DeleteAssetRequest request) {
        return new SyncInvoker<DeleteAssetRequest, DeleteAssetResponse>(request, DataArtsStudioMeta.deleteAsset,
            hcClient);
    }

    /**
     * 删除业务指标
     *
     * 删除业务指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBizMetricRequest 请求对象
     * @return DeleteBizMetricResponse
     */
    public DeleteBizMetricResponse deleteBizMetric(DeleteBizMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteBizMetric);
    }

    /**
     * 删除业务指标
     *
     * 删除业务指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBizMetricRequest 请求对象
     * @return SyncInvoker<DeleteBizMetricRequest, DeleteBizMetricResponse>
     */
    public SyncInvoker<DeleteBizMetricRequest, DeleteBizMetricResponse> deleteBizMetricInvoker(
        DeleteBizMetricRequest request) {
        return new SyncInvoker<DeleteBizMetricRequest, DeleteBizMetricResponse>(request,
            DataArtsStudioMeta.deleteBizMetric, hcClient);
    }

    /**
     * 删除流程架构
     *
     * 删除流程架构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return DeleteCatalogResponse
     */
    public DeleteCatalogResponse deleteCatalog(DeleteCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteCatalog);
    }

    /**
     * 删除流程架构
     *
     * 删除流程架构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>
     */
    public SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalogInvoker(DeleteCatalogRequest request) {
        return new SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>(request, DataArtsStudioMeta.deleteCatalog,
            hcClient);
    }

    /**
     * 移除资产关联的分类
     *
     * 移除资产关联分类：
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClassificationFromEntitiesRequest 请求对象
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
     * @param DeleteClassificationFromEntitiesRequest 请求对象
     * @return SyncInvoker<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse>
     */
    public SyncInvoker<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse> deleteClassificationFromEntitiesInvoker(
        DeleteClassificationFromEntitiesRequest request) {
        return new SyncInvoker<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse>(
            request, DataArtsStudioMeta.deleteClassificationFromEntities, hcClient);
    }

    /**
     * 删除码表
     *
     * 删除码表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCodeTableRequest 请求对象
     * @return DeleteCodeTableResponse
     */
    public DeleteCodeTableResponse deleteCodeTable(DeleteCodeTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteCodeTable);
    }

    /**
     * 删除码表
     *
     * 删除码表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCodeTableRequest 请求对象
     * @return SyncInvoker<DeleteCodeTableRequest, DeleteCodeTableResponse>
     */
    public SyncInvoker<DeleteCodeTableRequest, DeleteCodeTableResponse> deleteCodeTableInvoker(
        DeleteCodeTableRequest request) {
        return new SyncInvoker<DeleteCodeTableRequest, DeleteCodeTableResponse>(request,
            DataArtsStudioMeta.deleteCodeTable, hcClient);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataconnectionRequest 请求对象
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
     * @param DeleteDataconnectionRequest 请求对象
     * @return SyncInvoker<DeleteDataconnectionRequest, DeleteDataconnectionResponse>
     */
    public SyncInvoker<DeleteDataconnectionRequest, DeleteDataconnectionResponse> deleteDataconnectionInvoker(
        DeleteDataconnectionRequest request) {
        return new SyncInvoker<DeleteDataconnectionRequest, DeleteDataconnectionResponse>(request,
            DataArtsStudioMeta.deleteDataconnection, hcClient);
    }

    /**
     * 删除目录
     *
     * 删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDirectoryRequest 请求对象
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteDirectory);
    }

    /**
     * 删除目录
     *
     * 删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDirectoryRequest 请求对象
     * @return SyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse>
     */
    public SyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectoryInvoker(
        DeleteDirectoryRequest request) {
        return new SyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse>(request,
            DataArtsStudioMeta.deleteDirectory, hcClient);
    }

    /**
     * 移除资产关联密级
     *
     * 移除资产关联密级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityLevelFromEntityRequest 请求对象
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
     * @param DeleteSecurityLevelFromEntityRequest 请求对象
     * @return SyncInvoker<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse>
     */
    public SyncInvoker<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse> deleteSecurityLevelFromEntityInvoker(
        DeleteSecurityLevelFromEntityRequest request) {
        return new SyncInvoker<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse>(request,
            DataArtsStudioMeta.deleteSecurityLevelFromEntity, hcClient);
    }

    /**
     * 批量删除目录
     *
     * 批量删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceCatalogRequest 请求对象
     * @return DeleteServiceCatalogResponse
     */
    public DeleteServiceCatalogResponse deleteServiceCatalog(DeleteServiceCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteServiceCatalog);
    }

    /**
     * 批量删除目录
     *
     * 批量删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceCatalogRequest 请求对象
     * @return SyncInvoker<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse>
     */
    public SyncInvoker<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> deleteServiceCatalogInvoker(
        DeleteServiceCatalogRequest request) {
        return new SyncInvoker<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse>(request,
            DataArtsStudioMeta.deleteServiceCatalog, hcClient);
    }

    /**
     * 删除数据标准
     *
     * 删除数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStandardRequest 请求对象
     * @return DeleteStandardResponse
     */
    public DeleteStandardResponse deleteStandard(DeleteStandardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteStandard);
    }

    /**
     * 删除数据标准
     *
     * 删除数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStandardRequest 请求对象
     * @return SyncInvoker<DeleteStandardRequest, DeleteStandardResponse>
     */
    public SyncInvoker<DeleteStandardRequest, DeleteStandardResponse> deleteStandardInvoker(
        DeleteStandardRequest request) {
        return new SyncInvoker<DeleteStandardRequest, DeleteStandardResponse>(request,
            DataArtsStudioMeta.deleteStandard, hcClient);
    }

    /**
     * 删除数据标准模板
     *
     * 删除数据标准模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStandardTemplateRequest 请求对象
     * @return DeleteStandardTemplateResponse
     */
    public DeleteStandardTemplateResponse deleteStandardTemplate(DeleteStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteStandardTemplate);
    }

    /**
     * 删除数据标准模板
     *
     * 删除数据标准模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStandardTemplateRequest 请求对象
     * @return SyncInvoker<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse>
     */
    public SyncInvoker<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse> deleteStandardTemplateInvoker(
        DeleteStandardTemplateRequest request) {
        return new SyncInvoker<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse>(request,
            DataArtsStudioMeta.deleteStandardTemplate, hcClient);
    }

    /**
     * 删除主题
     *
     * 删除主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubjectRequest 请求对象
     * @return DeleteSubjectResponse
     */
    public DeleteSubjectResponse deleteSubject(DeleteSubjectRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSubject);
    }

    /**
     * 删除主题
     *
     * 删除主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubjectRequest 请求对象
     * @return SyncInvoker<DeleteSubjectRequest, DeleteSubjectResponse>
     */
    public SyncInvoker<DeleteSubjectRequest, DeleteSubjectResponse> deleteSubjectInvoker(DeleteSubjectRequest request) {
        return new SyncInvoker<DeleteSubjectRequest, DeleteSubjectResponse>(request, DataArtsStudioMeta.deleteSubject,
            hcClient);
    }

    /**
     * 删除主题(新)
     *
     * 删除主题(新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubjectNewRequest 请求对象
     * @return DeleteSubjectNewResponse
     */
    public DeleteSubjectNewResponse deleteSubjectNew(DeleteSubjectNewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteSubjectNew);
    }

    /**
     * 删除主题(新)
     *
     * 删除主题(新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubjectNewRequest 请求对象
     * @return SyncInvoker<DeleteSubjectNewRequest, DeleteSubjectNewResponse>
     */
    public SyncInvoker<DeleteSubjectNewRequest, DeleteSubjectNewResponse> deleteSubjectNewInvoker(
        DeleteSubjectNewRequest request) {
        return new SyncInvoker<DeleteSubjectNewRequest, DeleteSubjectNewResponse>(request,
            DataArtsStudioMeta.deleteSubjectNew, hcClient);
    }

    /**
     * 删除模型实体
     *
     * 删除一个模型实体，包括逻辑实体或物理数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableModelRequest 请求对象
     * @return DeleteTableModelResponse
     */
    public DeleteTableModelResponse deleteTableModel(DeleteTableModelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteTableModel);
    }

    /**
     * 删除模型实体
     *
     * 删除一个模型实体，包括逻辑实体或物理数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableModelRequest 请求对象
     * @return SyncInvoker<DeleteTableModelRequest, DeleteTableModelResponse>
     */
    public SyncInvoker<DeleteTableModelRequest, DeleteTableModelResponse> deleteTableModelInvoker(
        DeleteTableModelRequest request) {
        return new SyncInvoker<DeleteTableModelRequest, DeleteTableModelResponse>(request,
            DataArtsStudioMeta.deleteTableModel, hcClient);
    }

    /**
     * 删除单个采集任务
     *
     * 删除单个采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskInfoRequest 请求对象
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
     * @param DeleteTaskInfoRequest 请求对象
     * @return SyncInvoker<DeleteTaskInfoRequest, DeleteTaskInfoResponse>
     */
    public SyncInvoker<DeleteTaskInfoRequest, DeleteTaskInfoResponse> deleteTaskInfoInvoker(
        DeleteTaskInfoRequest request) {
        return new SyncInvoker<DeleteTaskInfoRequest, DeleteTaskInfoResponse>(request,
            DataArtsStudioMeta.deleteTaskInfo, hcClient);
    }

    /**
     * 删除模型工作区
     *
     * 删除模型工作区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkspacesRequest 请求对象
     * @return DeleteWorkspacesResponse
     */
    public DeleteWorkspacesResponse deleteWorkspaces(DeleteWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteWorkspaces);
    }

    /**
     * 删除模型工作区
     *
     * 删除模型工作区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkspacesRequest 请求对象
     * @return SyncInvoker<DeleteWorkspacesRequest, DeleteWorkspacesResponse>
     */
    public SyncInvoker<DeleteWorkspacesRequest, DeleteWorkspacesResponse> deleteWorkspacesInvoker(
        DeleteWorkspacesRequest request) {
        return new SyncInvoker<DeleteWorkspacesRequest, DeleteWorkspacesResponse>(request,
            DataArtsStudioMeta.deleteWorkspaces, hcClient);
    }

    /**
     * 删除工作空间用户
     *
     * 删除工作空间用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkspaceusersRequest 请求对象
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
     * @param DeleteWorkspaceusersRequest 请求对象
     * @return SyncInvoker<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse>
     */
    public SyncInvoker<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse> deleteWorkspaceusersInvoker(
        DeleteWorkspaceusersRequest request) {
        return new SyncInvoker<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse>(request,
            DataArtsStudioMeta.deleteWorkspaceusers, hcClient);
    }

    /**
     * 启动、调度、停止采集任务
     *
     * 启动、调度、停止采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteTaskActionRequest 请求对象
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
     * @param ExecuteTaskActionRequest 请求对象
     * @return SyncInvoker<ExecuteTaskActionRequest, ExecuteTaskActionResponse>
     */
    public SyncInvoker<ExecuteTaskActionRequest, ExecuteTaskActionResponse> executeTaskActionInvoker(
        ExecuteTaskActionRequest request) {
        return new SyncInvoker<ExecuteTaskActionRequest, ExecuteTaskActionResponse>(request,
            DataArtsStudioMeta.executeTaskAction, hcClient);
    }

    /**
     * 查询导入结果
     *
     * 查询导入excel的处理结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportResultRequest 请求对象
     * @return ImportResultResponse
     */
    public ImportResultResponse importResult(ImportResultRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.importResult);
    }

    /**
     * 查询导入结果
     *
     * 查询导入excel的处理结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportResultRequest 请求对象
     * @return SyncInvoker<ImportResultRequest, ImportResultResponse>
     */
    public SyncInvoker<ImportResultRequest, ImportResultResponse> importResultInvoker(ImportResultRequest request) {
        return new SyncInvoker<ImportResultRequest, ImportResultResponse>(request, DataArtsStudioMeta.importResult,
            hcClient);
    }

    /**
     * 初始化数据标准模板
     *
     * 初始化模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InitializeStandardTemplateRequest 请求对象
     * @return InitializeStandardTemplateResponse
     */
    public InitializeStandardTemplateResponse initializeStandardTemplate(InitializeStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.initializeStandardTemplate);
    }

    /**
     * 初始化数据标准模板
     *
     * 初始化模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InitializeStandardTemplateRequest 请求对象
     * @return SyncInvoker<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse>
     */
    public SyncInvoker<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse> initializeStandardTemplateInvoker(
        InitializeStandardTemplateRequest request) {
        return new SyncInvoker<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse>(request,
            DataArtsStudioMeta.initializeStandardTemplate, hcClient);
    }

    /**
     * 查找汇总表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找汇总表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAggregationLogicTablesRequest 请求对象
     * @return ListAggregationLogicTablesResponse
     */
    public ListAggregationLogicTablesResponse listAggregationLogicTables(ListAggregationLogicTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAggregationLogicTables);
    }

    /**
     * 查找汇总表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找汇总表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAggregationLogicTablesRequest 请求对象
     * @return SyncInvoker<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse>
     */
    public SyncInvoker<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse> listAggregationLogicTablesInvoker(
        ListAggregationLogicTablesRequest request) {
        return new SyncInvoker<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse>(request,
            DataArtsStudioMeta.listAggregationLogicTables, hcClient);
    }

    /**
     * 获取当前目录下的所有类型列表
     *
     * 获取当前目录下的所有类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllCatalogListRequest 请求对象
     * @return ListAllCatalogListResponse
     */
    public ListAllCatalogListResponse listAllCatalogList(ListAllCatalogListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAllCatalogList);
    }

    /**
     * 获取当前目录下的所有类型列表
     *
     * 获取当前目录下的所有类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllCatalogListRequest 请求对象
     * @return SyncInvoker<ListAllCatalogListRequest, ListAllCatalogListResponse>
     */
    public SyncInvoker<ListAllCatalogListRequest, ListAllCatalogListResponse> listAllCatalogListInvoker(
        ListAllCatalogListRequest request) {
        return new SyncInvoker<ListAllCatalogListRequest, ListAllCatalogListResponse>(request,
            DataArtsStudioMeta.listAllCatalogList, hcClient);
    }

    /**
     * 获取数据标准
     *
     * 获取数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllStandardsRequest 请求对象
     * @return ListAllStandardsResponse
     */
    public ListAllStandardsResponse listAllStandards(ListAllStandardsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAllStandards);
    }

    /**
     * 获取数据标准
     *
     * 获取数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllStandardsRequest 请求对象
     * @return SyncInvoker<ListAllStandardsRequest, ListAllStandardsResponse>
     */
    public SyncInvoker<ListAllStandardsRequest, ListAllStandardsResponse> listAllStandardsInvoker(
        ListAllStandardsRequest request) {
        return new SyncInvoker<ListAllStandardsRequest, ListAllStandardsResponse>(request,
            DataArtsStudioMeta.listAllStandards, hcClient);
    }

    /**
     * 获取当前目录下的api列表
     *
     * 获取当前目录下的api列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiCatalogListRequest 请求对象
     * @return ListApiCatalogListResponse
     */
    public ListApiCatalogListResponse listApiCatalogList(ListApiCatalogListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApiCatalogList);
    }

    /**
     * 获取当前目录下的api列表
     *
     * 获取当前目录下的api列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiCatalogListRequest 请求对象
     * @return SyncInvoker<ListApiCatalogListRequest, ListApiCatalogListResponse>
     */
    public SyncInvoker<ListApiCatalogListRequest, ListApiCatalogListResponse> listApiCatalogListInvoker(
        ListApiCatalogListRequest request) {
        return new SyncInvoker<ListApiCatalogListRequest, ListApiCatalogListResponse>(request,
            DataArtsStudioMeta.listApiCatalogList, hcClient);
    }

    /**
     * 查询指定api 应用调用topN
     *
     * 查询指定api 应用调用topN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiTopNRequest 请求对象
     * @return ListApiTopNResponse
     */
    public ListApiTopNResponse listApiTopN(ListApiTopNRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApiTopN);
    }

    /**
     * 查询指定api 应用调用topN
     *
     * 查询指定api 应用调用topN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiTopNRequest 请求对象
     * @return SyncInvoker<ListApiTopNRequest, ListApiTopNResponse>
     */
    public SyncInvoker<ListApiTopNRequest, ListApiTopNResponse> listApiTopNInvoker(ListApiTopNRequest request) {
        return new SyncInvoker<ListApiTopNRequest, ListApiTopNResponse>(request, DataArtsStudioMeta.listApiTopN,
            hcClient);
    }

    /**
     * 获取网关分组
     *
     * 获取网关分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApicGroupsRequest 请求对象
     * @return ListApicGroupsResponse
     */
    public ListApicGroupsResponse listApicGroups(ListApicGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApicGroups);
    }

    /**
     * 获取网关分组
     *
     * 获取网关分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApicGroupsRequest 请求对象
     * @return SyncInvoker<ListApicGroupsRequest, ListApicGroupsResponse>
     */
    public SyncInvoker<ListApicGroupsRequest, ListApicGroupsResponse> listApicGroupsInvoker(
        ListApicGroupsRequest request) {
        return new SyncInvoker<ListApicGroupsRequest, ListApicGroupsResponse>(request,
            DataArtsStudioMeta.listApicGroups, hcClient);
    }

    /**
     * 获取网关实例
     *
     * 获取网关实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApicInstancesRequest 请求对象
     * @return ListApicInstancesResponse
     */
    public ListApicInstancesResponse listApicInstances(ListApicInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApicInstances);
    }

    /**
     * 获取网关实例
     *
     * 获取网关实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApicInstancesRequest 请求对象
     * @return SyncInvoker<ListApicInstancesRequest, ListApicInstancesResponse>
     */
    public SyncInvoker<ListApicInstancesRequest, ListApicInstancesResponse> listApicInstancesInvoker(
        ListApicInstancesRequest request) {
        return new SyncInvoker<ListApicInstancesRequest, ListApicInstancesResponse>(request,
            DataArtsStudioMeta.listApicInstances, hcClient);
    }

    /**
     * 查询api 服务调用topN
     *
     * 查询api 服务调用topN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisTopRequest 请求对象
     * @return ListApisTopResponse
     */
    public ListApisTopResponse listApisTop(ListApisTopRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApisTop);
    }

    /**
     * 查询api 服务调用topN
     *
     * 查询api 服务调用topN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisTopRequest 请求对象
     * @return SyncInvoker<ListApisTopRequest, ListApisTopResponse>
     */
    public SyncInvoker<ListApisTopRequest, ListApisTopResponse> listApisTopInvoker(ListApisTopRequest request) {
        return new SyncInvoker<ListApisTopRequest, ListApisTopResponse>(request, DataArtsStudioMeta.listApisTop,
            hcClient);
    }

    /**
     * 查询申请列表
     *
     * 查询申请列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApplyRequest 请求对象
     * @return ListApplyResponse
     */
    public ListApplyResponse listApply(ListApplyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApply);
    }

    /**
     * 查询申请列表
     *
     * 查询申请列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApplyRequest 请求对象
     * @return SyncInvoker<ListApplyRequest, ListApplyResponse>
     */
    public SyncInvoker<ListApplyRequest, ListApplyResponse> listApplyInvoker(ListApplyRequest request) {
        return new SyncInvoker<ListApplyRequest, ListApplyResponse>(request, DataArtsStudioMeta.listApply, hcClient);
    }

    /**
     * 查询审批人列表
     *
     * 查询审批人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApproversRequest 请求对象
     * @return ListApproversResponse
     */
    public ListApproversResponse listApprovers(ListApproversRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApprovers);
    }

    /**
     * 查询审批人列表
     *
     * 查询审批人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApproversRequest 请求对象
     * @return SyncInvoker<ListApproversRequest, ListApproversResponse>
     */
    public SyncInvoker<ListApproversRequest, ListApproversResponse> listApproversInvoker(ListApproversRequest request) {
        return new SyncInvoker<ListApproversRequest, ListApproversResponse>(request, DataArtsStudioMeta.listApprovers,
            hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApps);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<ListAppsRequest, ListAppsResponse>(request, DataArtsStudioMeta.listApps, hcClient);
    }

    /**
     * 查询app 服务使用topN
     *
     * 查询app 服务使用topN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsTopRequest 请求对象
     * @return ListAppsTopResponse
     */
    public ListAppsTopResponse listAppsTop(ListAppsTopRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listAppsTop);
    }

    /**
     * 查询app 服务使用topN
     *
     * 查询app 服务使用topN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsTopRequest 请求对象
     * @return SyncInvoker<ListAppsTopRequest, ListAppsTopResponse>
     */
    public SyncInvoker<ListAppsTopRequest, ListAppsTopResponse> listAppsTopInvoker(ListAppsTopRequest request) {
        return new SyncInvoker<ListAppsTopRequest, ListAppsTopResponse>(request, DataArtsStudioMeta.listAppsTop,
            hcClient);
    }

    /**
     * 查看指标维度信息
     *
     * 查看指标维度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBizMetricDimensionsRequest 请求对象
     * @return ListBizMetricDimensionsResponse
     */
    public ListBizMetricDimensionsResponse listBizMetricDimensions(ListBizMetricDimensionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listBizMetricDimensions);
    }

    /**
     * 查看指标维度信息
     *
     * 查看指标维度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBizMetricDimensionsRequest 请求对象
     * @return SyncInvoker<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse>
     */
    public SyncInvoker<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse> listBizMetricDimensionsInvoker(
        ListBizMetricDimensionsRequest request) {
        return new SyncInvoker<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse>(request,
            DataArtsStudioMeta.listBizMetricDimensions, hcClient);
    }

    /**
     * 查看指标指标责任人信息
     *
     * 查看指标指标责任人信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBizMetricOwnersRequest 请求对象
     * @return ListBizMetricOwnersResponse
     */
    public ListBizMetricOwnersResponse listBizMetricOwners(ListBizMetricOwnersRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listBizMetricOwners);
    }

    /**
     * 查看指标指标责任人信息
     *
     * 查看指标指标责任人信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBizMetricOwnersRequest 请求对象
     * @return SyncInvoker<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse>
     */
    public SyncInvoker<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse> listBizMetricOwnersInvoker(
        ListBizMetricOwnersRequest request) {
        return new SyncInvoker<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse>(request,
            DataArtsStudioMeta.listBizMetricOwners, hcClient);
    }

    /**
     * 查询业务指标信息
     *
     * 通过名称、创建者、修改时间分页查找业务指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBizMetricsRequest 请求对象
     * @return ListBizMetricsResponse
     */
    public ListBizMetricsResponse listBizMetrics(ListBizMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listBizMetrics);
    }

    /**
     * 查询业务指标信息
     *
     * 通过名称、创建者、修改时间分页查找业务指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBizMetricsRequest 请求对象
     * @return SyncInvoker<ListBizMetricsRequest, ListBizMetricsResponse>
     */
    public SyncInvoker<ListBizMetricsRequest, ListBizMetricsResponse> listBizMetricsInvoker(
        ListBizMetricsRequest request) {
        return new SyncInvoker<ListBizMetricsRequest, ListBizMetricsResponse>(request,
            DataArtsStudioMeta.listBizMetrics, hcClient);
    }

    /**
     * 获取主题树信息
     *
     * 获取数据资产主题树信息l1，l2，l3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessRequest 请求对象
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listBusiness);
    }

    /**
     * 获取主题树信息
     *
     * 获取数据资产主题树信息l1，l2，l3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessRequest 请求对象
     * @return SyncInvoker<ListBusinessRequest, ListBusinessResponse>
     */
    public SyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessInvoker(ListBusinessRequest request) {
        return new SyncInvoker<ListBusinessRequest, ListBusinessResponse>(request, DataArtsStudioMeta.listBusiness,
            hcClient);
    }

    /**
     * 获取当前目录下的目录列表（全量）
     *
     * 获取当前目录下的目录列表（全量）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogListRequest 请求对象
     * @return ListCatalogListResponse
     */
    public ListCatalogListResponse listCatalogList(ListCatalogListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCatalogList);
    }

    /**
     * 获取当前目录下的目录列表（全量）
     *
     * 获取当前目录下的目录列表（全量）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogListRequest 请求对象
     * @return SyncInvoker<ListCatalogListRequest, ListCatalogListResponse>
     */
    public SyncInvoker<ListCatalogListRequest, ListCatalogListResponse> listCatalogListInvoker(
        ListCatalogListRequest request) {
        return new SyncInvoker<ListCatalogListRequest, ListCatalogListResponse>(request,
            DataArtsStudioMeta.listCatalogList, hcClient);
    }

    /**
     * 获取所有流程架构目录树
     *
     * 获取所有目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogTreeRequest 请求对象
     * @return ListCatalogTreeResponse
     */
    public ListCatalogTreeResponse listCatalogTree(ListCatalogTreeRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCatalogTree);
    }

    /**
     * 获取所有流程架构目录树
     *
     * 获取所有目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogTreeRequest 请求对象
     * @return SyncInvoker<ListCatalogTreeRequest, ListCatalogTreeResponse>
     */
    public SyncInvoker<ListCatalogTreeRequest, ListCatalogTreeResponse> listCatalogTreeInvoker(
        ListCatalogTreeRequest request) {
        return new SyncInvoker<ListCatalogTreeRequest, ListCatalogTreeResponse>(request,
            DataArtsStudioMeta.listCatalogTree, hcClient);
    }

    /**
     * 获取作业目录
     *
     * 获取作业目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCategoryRequest 请求对象
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
     * @param ListCategoryRequest 请求对象
     * @return SyncInvoker<ListCategoryRequest, ListCategoryResponse>
     */
    public SyncInvoker<ListCategoryRequest, ListCategoryResponse> listCategoryInvoker(ListCategoryRequest request) {
        return new SyncInvoker<ListCategoryRequest, ListCategoryResponse>(request, DataArtsStudioMeta.listCategory,
            hcClient);
    }

    /**
     * 获取数据源中表的字段
     *
     * 获取数据源中表的字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListColumnsRequest 请求对象
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
     * @param ListColumnsRequest 请求对象
     * @return SyncInvoker<ListColumnsRequest, ListColumnsResponse>
     */
    public SyncInvoker<ListColumnsRequest, ListColumnsResponse> listColumnsInvoker(ListColumnsRequest request) {
        return new SyncInvoker<ListColumnsRequest, ListColumnsResponse>(request, DataArtsStudioMeta.listColumns,
            hcClient);
    }

    /**
     * 查找复合指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找复合指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCompoundMetricsRequest 请求对象
     * @return ListCompoundMetricsResponse
     */
    public ListCompoundMetricsResponse listCompoundMetrics(ListCompoundMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCompoundMetrics);
    }

    /**
     * 查找复合指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找复合指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCompoundMetricsRequest 请求对象
     * @return SyncInvoker<ListCompoundMetricsRequest, ListCompoundMetricsResponse>
     */
    public SyncInvoker<ListCompoundMetricsRequest, ListCompoundMetricsResponse> listCompoundMetricsInvoker(
        ListCompoundMetricsRequest request) {
        return new SyncInvoker<ListCompoundMetricsRequest, ListCompoundMetricsResponse>(request,
            DataArtsStudioMeta.listCompoundMetrics, hcClient);
    }

    /**
     * 查找业务限定
     *
     * 通过中英文名称、描述、创建者、审核人、限定分组id、修改时间状态分页查找限定信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConditionRequest 请求对象
     * @return ListConditionResponse
     */
    public ListConditionResponse listCondition(ListConditionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listCondition);
    }

    /**
     * 查找业务限定
     *
     * 通过中英文名称、描述、创建者、审核人、限定分组id、修改时间状态分页查找限定信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConditionRequest 请求对象
     * @return SyncInvoker<ListConditionRequest, ListConditionResponse>
     */
    public SyncInvoker<ListConditionRequest, ListConditionResponse> listConditionInvoker(ListConditionRequest request) {
        return new SyncInvoker<ListConditionRequest, ListConditionResponse>(request, DataArtsStudioMeta.listCondition,
            hcClient);
    }

    /**
     * 获取对账作业列表
     *
     * 获取对账作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConsistencyTaskRequest 请求对象
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
     * @param ListConsistencyTaskRequest 请求对象
     * @return SyncInvoker<ListConsistencyTaskRequest, ListConsistencyTaskResponse>
     */
    public SyncInvoker<ListConsistencyTaskRequest, ListConsistencyTaskResponse> listConsistencyTaskInvoker(
        ListConsistencyTaskRequest request) {
        return new SyncInvoker<ListConsistencyTaskRequest, ListConsistencyTaskResponse>(request,
            DataArtsStudioMeta.listConsistencyTask, hcClient);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataArtsStudioInstancesRequest 请求对象
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
     * @param ListDataArtsStudioInstancesRequest 请求对象
     * @return SyncInvoker<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse>
     */
    public SyncInvoker<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse> listDataArtsStudioInstancesInvoker(
        ListDataArtsStudioInstancesRequest request) {
        return new SyncInvoker<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse>(request,
            DataArtsStudioMeta.listDataArtsStudioInstances, hcClient);
    }

    /**
     * 获取数据源中的表
     *
     * 获取数据源中的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataTablesRequest 请求对象
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
     * @param ListDataTablesRequest 请求对象
     * @return SyncInvoker<ListDataTablesRequest, ListDataTablesResponse>
     */
    public SyncInvoker<ListDataTablesRequest, ListDataTablesResponse> listDataTablesInvoker(
        ListDataTablesRequest request) {
        return new SyncInvoker<ListDataTablesRequest, ListDataTablesResponse>(request,
            DataArtsStudioMeta.listDataTables, hcClient);
    }

    /**
     * 获取数据库列表
     *
     * 获取数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
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
     * @param ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, DataArtsStudioMeta.listDatabases,
            hcClient);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataconnectionsRequest 请求对象
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
     * @param ListDataconnectionsRequest 请求对象
     * @return SyncInvoker<ListDataconnectionsRequest, ListDataconnectionsResponse>
     */
    public SyncInvoker<ListDataconnectionsRequest, ListDataconnectionsResponse> listDataconnectionsInvoker(
        ListDataconnectionsRequest request) {
        return new SyncInvoker<ListDataconnectionsRequest, ListDataconnectionsResponse>(request,
            DataArtsStudioMeta.listDataconnections, hcClient);
    }

    /**
     * 查找衍生指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找衍生指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDerivativeIndexesRequest 请求对象
     * @return ListDerivativeIndexesResponse
     */
    public ListDerivativeIndexesResponse listDerivativeIndexes(ListDerivativeIndexesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDerivativeIndexes);
    }

    /**
     * 查找衍生指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间、l3Id分页查找衍生指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDerivativeIndexesRequest 请求对象
     * @return SyncInvoker<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse>
     */
    public SyncInvoker<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse> listDerivativeIndexesInvoker(
        ListDerivativeIndexesRequest request) {
        return new SyncInvoker<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse>(request,
            DataArtsStudioMeta.listDerivativeIndexes, hcClient);
    }

    /**
     * 查看维度颗粒度
     *
     * 查询维度颗粒度, 依据tableId查询涉及所有维度，不传tableId查询所有维度组颗粒度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDimensionGroupsRequest 请求对象
     * @return ListDimensionGroupsResponse
     */
    public ListDimensionGroupsResponse listDimensionGroups(ListDimensionGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDimensionGroups);
    }

    /**
     * 查看维度颗粒度
     *
     * 查询维度颗粒度, 依据tableId查询涉及所有维度，不传tableId查询所有维度组颗粒度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDimensionGroupsRequest 请求对象
     * @return SyncInvoker<ListDimensionGroupsRequest, ListDimensionGroupsResponse>
     */
    public SyncInvoker<ListDimensionGroupsRequest, ListDimensionGroupsResponse> listDimensionGroupsInvoker(
        ListDimensionGroupsRequest request) {
        return new SyncInvoker<ListDimensionGroupsRequest, ListDimensionGroupsResponse>(request,
            DataArtsStudioMeta.listDimensionGroups, hcClient);
    }

    /**
     * 查找维度表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找维度表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDimensionLogicTablesRequest 请求对象
     * @return ListDimensionLogicTablesResponse
     */
    public ListDimensionLogicTablesResponse listDimensionLogicTables(ListDimensionLogicTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDimensionLogicTables);
    }

    /**
     * 查找维度表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找维度表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDimensionLogicTablesRequest 请求对象
     * @return SyncInvoker<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse>
     */
    public SyncInvoker<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse> listDimensionLogicTablesInvoker(
        ListDimensionLogicTablesRequest request) {
        return new SyncInvoker<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse>(request,
            DataArtsStudioMeta.listDimensionLogicTables, hcClient);
    }

    /**
     * 查找维度
     *
     * 通过中英文名称、描述、创建者、审核人、状态、l3Id、派生指标idList、修改时间分页查找维度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDimensionsRequest 请求对象
     * @return ListDimensionsResponse
     */
    public ListDimensionsResponse listDimensions(ListDimensionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDimensions);
    }

    /**
     * 查找维度
     *
     * 通过中英文名称、描述、创建者、审核人、状态、l3Id、派生指标idList、修改时间分页查找维度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDimensionsRequest 请求对象
     * @return SyncInvoker<ListDimensionsRequest, ListDimensionsResponse>
     */
    public SyncInvoker<ListDimensionsRequest, ListDimensionsResponse> listDimensionsInvoker(
        ListDimensionsRequest request) {
        return new SyncInvoker<ListDimensionsRequest, ListDimensionsResponse>(request,
            DataArtsStudioMeta.listDimensions, hcClient);
    }

    /**
     * 获取所有目录
     *
     * 获取所有目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDirectoriesRequest 请求对象
     * @return ListDirectoriesResponse
     */
    public ListDirectoriesResponse listDirectories(ListDirectoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listDirectories);
    }

    /**
     * 获取所有目录
     *
     * 获取所有目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDirectoriesRequest 请求对象
     * @return SyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse>
     */
    public SyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse> listDirectoriesInvoker(
        ListDirectoriesRequest request) {
        return new SyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse>(request,
            DataArtsStudioMeta.listDirectories, hcClient);
    }

    /**
     * 查找事实表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找事实表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFactLogicTablesRequest 请求对象
     * @return ListFactLogicTablesResponse
     */
    public ListFactLogicTablesResponse listFactLogicTables(ListFactLogicTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listFactLogicTables);
    }

    /**
     * 查找事实表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找事实表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFactLogicTablesRequest 请求对象
     * @return SyncInvoker<ListFactLogicTablesRequest, ListFactLogicTablesResponse>
     */
    public SyncInvoker<ListFactLogicTablesRequest, ListFactLogicTablesResponse> listFactLogicTablesInvoker(
        ListFactLogicTablesRequest request) {
        return new SyncInvoker<ListFactLogicTablesRequest, ListFactLogicTablesResponse>(request,
            DataArtsStudioMeta.listFactLogicTables, hcClient);
    }

    /**
     * 获取任务执行结果列表
     *
     * 获取任务执行结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
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
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, DataArtsStudioMeta.listInstances,
            hcClient);
    }

    /**
     * 获取工作空间列表
     *
     * 获取工作空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListManagerWorkSpacesRequest 请求对象
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
     * @param ListManagerWorkSpacesRequest 请求对象
     * @return SyncInvoker<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse>
     */
    public SyncInvoker<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse> listManagerWorkSpacesInvoker(
        ListManagerWorkSpacesRequest request) {
        return new SyncInvoker<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse>(request,
            DataArtsStudioMeta.listManagerWorkSpaces, hcClient);
    }

    /**
     * 查询消息列表
     *
     * 查询消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessageRequest 请求对象
     * @return ListMessageResponse
     */
    public ListMessageResponse listMessage(ListMessageRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listMessage);
    }

    /**
     * 查询消息列表
     *
     * 查询消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessageRequest 请求对象
     * @return SyncInvoker<ListMessageRequest, ListMessageResponse>
     */
    public SyncInvoker<ListMessageRequest, ListMessageResponse> listMessageInvoker(ListMessageRequest request) {
        return new SyncInvoker<ListMessageRequest, ListMessageResponse>(request, DataArtsStudioMeta.listMessage,
            hcClient);
    }

    /**
     * 获取指标关联信息
     *
     * 获取当前指标图谱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetricRelationsRequest 请求对象
     * @return ListMetricRelationsResponse
     */
    public ListMetricRelationsResponse listMetricRelations(ListMetricRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listMetricRelations);
    }

    /**
     * 获取指标关联信息
     *
     * 获取当前指标图谱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetricRelationsRequest 请求对象
     * @return SyncInvoker<ListMetricRelationsRequest, ListMetricRelationsResponse>
     */
    public SyncInvoker<ListMetricRelationsRequest, ListMetricRelationsResponse> listMetricRelationsInvoker(
        ListMetricRelationsRequest request) {
        return new SyncInvoker<ListMetricRelationsRequest, ListMetricRelationsResponse>(request,
            DataArtsStudioMeta.listMetricRelations, hcClient);
    }

    /**
     * 获取质量作业列表
     *
     * 获取质量作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQualityTaskRequest 请求对象
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
     * @param ListQualityTaskRequest 请求对象
     * @return SyncInvoker<ListQualityTaskRequest, ListQualityTaskResponse>
     */
    public SyncInvoker<ListQualityTaskRequest, ListQualityTaskResponse> listQualityTaskInvoker(
        ListQualityTaskRequest request) {
        return new SyncInvoker<ListQualityTaskRequest, ListQualityTaskResponse>(request,
            DataArtsStudioMeta.listQualityTask, hcClient);
    }

    /**
     * 获取质量作业列表V1
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQualityTaskListsRequest 请求对象
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
     * @param ListQualityTaskListsRequest 请求对象
     * @return SyncInvoker<ListQualityTaskListsRequest, ListQualityTaskListsResponse>
     */
    public SyncInvoker<ListQualityTaskListsRequest, ListQualityTaskListsResponse> listQualityTaskListsInvoker(
        ListQualityTaskListsRequest request) {
        return new SyncInvoker<ListQualityTaskListsRequest, ListQualityTaskListsResponse>(request,
            DataArtsStudioMeta.listQualityTaskLists, hcClient);
    }

    /**
     * 获取规则模板列表
     *
     * 分页获取规则模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQualityTemplatesRequest 请求对象
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
     * @param ListQualityTemplatesRequest 请求对象
     * @return SyncInvoker<ListQualityTemplatesRequest, ListQualityTemplatesResponse>
     */
    public SyncInvoker<ListQualityTemplatesRequest, ListQualityTemplatesResponse> listQualityTemplatesInvoker(
        ListQualityTemplatesRequest request) {
        return new SyncInvoker<ListQualityTemplatesRequest, ListQualityTemplatesResponse>(request,
            DataArtsStudioMeta.listQualityTemplates, hcClient);
    }

    /**
     * 关系
     *
     * 通过名称、等分页查找关系信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationsRequest 请求对象
     * @return ListRelationsResponse
     */
    public ListRelationsResponse listRelations(ListRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listRelations);
    }

    /**
     * 关系
     *
     * 通过名称、等分页查找关系信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelationsRequest 请求对象
     * @return SyncInvoker<ListRelationsRequest, ListRelationsResponse>
     */
    public SyncInvoker<ListRelationsRequest, ListRelationsResponse> listRelationsInvoker(ListRelationsRequest request) {
        return new SyncInvoker<ListRelationsRequest, ListRelationsResponse>(request, DataArtsStudioMeta.listRelations,
            hcClient);
    }

    /**
     * 获取schemas
     *
     * 获取schemas,目前只有DWS和采用postgresql驱动的RDS数据源支持schema,请在调用前确认该数据源是否支持schema字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSchemasRequest 请求对象
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
     * @param ListSchemasRequest 请求对象
     * @return SyncInvoker<ListSchemasRequest, ListSchemasResponse>
     */
    public SyncInvoker<ListSchemasRequest, ListSchemasResponse> listSchemasInvoker(ListSchemasRequest request) {
        return new SyncInvoker<ListSchemasRequest, ListSchemasResponse>(request, DataArtsStudioMeta.listSchemas,
            hcClient);
    }

    /**
     * 获取主题层级
     *
     * 获取主题层级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubjectLevelsRequest 请求对象
     * @return ListSubjectLevelsResponse
     */
    public ListSubjectLevelsResponse listSubjectLevels(ListSubjectLevelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listSubjectLevels);
    }

    /**
     * 获取主题层级
     *
     * 获取主题层级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubjectLevelsRequest 请求对象
     * @return SyncInvoker<ListSubjectLevelsRequest, ListSubjectLevelsResponse>
     */
    public SyncInvoker<ListSubjectLevelsRequest, ListSubjectLevelsResponse> listSubjectLevelsInvoker(
        ListSubjectLevelsRequest request) {
        return new SyncInvoker<ListSubjectLevelsRequest, ListSubjectLevelsResponse>(request,
            DataArtsStudioMeta.listSubjectLevels, hcClient);
    }

    /**
     * 查询模型下所有关系
     *
     * 查询模型下所有关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableModelRelationsRequest 请求对象
     * @return ListTableModelRelationsResponse
     */
    public ListTableModelRelationsResponse listTableModelRelations(ListTableModelRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listTableModelRelations);
    }

    /**
     * 查询模型下所有关系
     *
     * 查询模型下所有关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableModelRelationsRequest 请求对象
     * @return SyncInvoker<ListTableModelRelationsRequest, ListTableModelRelationsResponse>
     */
    public SyncInvoker<ListTableModelRelationsRequest, ListTableModelRelationsResponse> listTableModelRelationsInvoker(
        ListTableModelRelationsRequest request) {
        return new SyncInvoker<ListTableModelRelationsRequest, ListTableModelRelationsResponse>(request,
            DataArtsStudioMeta.listTableModelRelations, hcClient);
    }

    /**
     * 查找模型实体列表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找模型实体信息，包含逻辑实体、表或属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableModelsRequest 请求对象
     * @return ListTableModelsResponse
     */
    public ListTableModelsResponse listTableModels(ListTableModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listTableModels);
    }

    /**
     * 查找模型实体列表
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找模型实体信息，包含逻辑实体、表或属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableModelsRequest 请求对象
     * @return SyncInvoker<ListTableModelsRequest, ListTableModelsResponse>
     */
    public SyncInvoker<ListTableModelsRequest, ListTableModelsResponse> listTableModelsInvoker(
        ListTableModelsRequest request) {
        return new SyncInvoker<ListTableModelsRequest, ListTableModelsResponse>(request,
            DataArtsStudioMeta.listTableModels, hcClient);
    }

    /**
     * 获取工作空间用户角色
     *
     * 获取工作空间用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspaceRolesRequest 请求对象
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
     * @param ListWorkspaceRolesRequest 请求对象
     * @return SyncInvoker<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse>
     */
    public SyncInvoker<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse> listWorkspaceRolesInvoker(
        ListWorkspaceRolesRequest request) {
        return new SyncInvoker<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse>(request,
            DataArtsStudioMeta.listWorkspaceRoles, hcClient);
    }

    /**
     * 获取模型
     *
     * 获取模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listWorkspaces);
    }

    /**
     * 获取模型
     *
     * 获取模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>(request,
            DataArtsStudioMeta.listWorkspaces, hcClient);
    }

    /**
     * 获取工作空间用户信息
     *
     * 获取工作空间用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspaceusersRequest 请求对象
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
     * @param ListWorkspaceusersRequest 请求对象
     * @return SyncInvoker<ListWorkspaceusersRequest, ListWorkspaceusersResponse>
     */
    public SyncInvoker<ListWorkspaceusersRequest, ListWorkspaceusersResponse> listWorkspaceusersInvoker(
        ListWorkspaceusersRequest request) {
        return new SyncInvoker<ListWorkspaceusersRequest, ListWorkspaceusersResponse>(request,
            DataArtsStudioMeta.listWorkspaceusers, hcClient);
    }

    /**
     * 批量移动api至新目录
     *
     * 批量移动api至新目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateApiRequest 请求对象
     * @return MigrateApiResponse
     */
    public MigrateApiResponse migrateApi(MigrateApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.migrateApi);
    }

    /**
     * 批量移动api至新目录
     *
     * 批量移动api至新目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateApiRequest 请求对象
     * @return SyncInvoker<MigrateApiRequest, MigrateApiResponse>
     */
    public SyncInvoker<MigrateApiRequest, MigrateApiResponse> migrateApiInvoker(MigrateApiRequest request) {
        return new SyncInvoker<MigrateApiRequest, MigrateApiResponse>(request, DataArtsStudioMeta.migrateApi, hcClient);
    }

    /**
     * 移动当前目录至新目录
     *
     * 移动当前目录至新目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateCatalogRequest 请求对象
     * @return MigrateCatalogResponse
     */
    public MigrateCatalogResponse migrateCatalog(MigrateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.migrateCatalog);
    }

    /**
     * 移动当前目录至新目录
     *
     * 移动当前目录至新目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateCatalogRequest 请求对象
     * @return SyncInvoker<MigrateCatalogRequest, MigrateCatalogResponse>
     */
    public SyncInvoker<MigrateCatalogRequest, MigrateCatalogResponse> migrateCatalogInvoker(
        MigrateCatalogRequest request) {
        return new SyncInvoker<MigrateCatalogRequest, MigrateCatalogResponse>(request,
            DataArtsStudioMeta.migrateCatalog, hcClient);
    }

    /**
     * 修改自定义项
     *
     * 修改自定义项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyCustomizedFieldsRequest 请求对象
     * @return ModifyCustomizedFieldsResponse
     */
    public ModifyCustomizedFieldsResponse modifyCustomizedFields(ModifyCustomizedFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.modifyCustomizedFields);
    }

    /**
     * 修改自定义项
     *
     * 修改自定义项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyCustomizedFieldsRequest 请求对象
     * @return SyncInvoker<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse>
     */
    public SyncInvoker<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse> modifyCustomizedFieldsInvoker(
        ModifyCustomizedFieldsRequest request) {
        return new SyncInvoker<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse>(request,
            DataArtsStudioMeta.modifyCustomizedFields, hcClient);
    }

    /**
     * 用户行为分析
     *
     * 用户行为分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ParseUserBehaviorRequest 请求对象
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
     * @param ParseUserBehaviorRequest 请求对象
     * @return SyncInvoker<ParseUserBehaviorRequest, ParseUserBehaviorResponse>
     */
    public SyncInvoker<ParseUserBehaviorRequest, ParseUserBehaviorResponse> parseUserBehaviorInvoker(
        ParseUserBehaviorRequest request) {
        return new SyncInvoker<ParseUserBehaviorRequest, ParseUserBehaviorResponse>(request,
            DataArtsStudioMeta.parseUserBehavior, hcClient);
    }

    /**
     * DataArtsStudio实例一键购买接口
     *
     * DataArtsStudio实例一键购买接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PayForDgcOneKeyRequest 请求对象
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
     * @param PayForDgcOneKeyRequest 请求对象
     * @return SyncInvoker<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse>
     */
    public SyncInvoker<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse> payForDgcOneKeyInvoker(
        PayForDgcOneKeyRequest request) {
        return new SyncInvoker<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse>(request,
            DataArtsStudioMeta.payForDgcOneKey, hcClient);
    }

    /**
     * 关联属性与数据标准
     *
     * 关联属性与数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetLinkAttributeAndStandardRequest 请求对象
     * @return ResetLinkAttributeAndStandardResponse
     */
    public ResetLinkAttributeAndStandardResponse resetLinkAttributeAndStandard(
        ResetLinkAttributeAndStandardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.resetLinkAttributeAndStandard);
    }

    /**
     * 关联属性与数据标准
     *
     * 关联属性与数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetLinkAttributeAndStandardRequest 请求对象
     * @return SyncInvoker<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse>
     */
    public SyncInvoker<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse> resetLinkAttributeAndStandardInvoker(
        ResetLinkAttributeAndStandardRequest request) {
        return new SyncInvoker<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse>(request,
            DataArtsStudioMeta.resetLinkAttributeAndStandard, hcClient);
    }

    /**
     * 撤回审批单
     *
     * 撤回审批单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackApprovalRequest 请求对象
     * @return RollbackApprovalResponse
     */
    public RollbackApprovalResponse rollbackApproval(RollbackApprovalRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.rollbackApproval);
    }

    /**
     * 撤回审批单
     *
     * 撤回审批单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackApprovalRequest 请求对象
     * @return SyncInvoker<RollbackApprovalRequest, RollbackApprovalResponse>
     */
    public SyncInvoker<RollbackApprovalRequest, RollbackApprovalResponse> rollbackApprovalInvoker(
        RollbackApprovalRequest request) {
        return new SyncInvoker<RollbackApprovalRequest, RollbackApprovalResponse>(request,
            DataArtsStudioMeta.rollbackApproval, hcClient);
    }

    /**
     * 获取审批单
     *
     * 获取审批单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchApprovalsRequest 请求对象
     * @return SearchApprovalsResponse
     */
    public SearchApprovalsResponse searchApprovals(SearchApprovalsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchApprovals);
    }

    /**
     * 获取审批单
     *
     * 获取审批单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchApprovalsRequest 请求对象
     * @return SyncInvoker<SearchApprovalsRequest, SearchApprovalsResponse>
     */
    public SyncInvoker<SearchApprovalsRequest, SearchApprovalsResponse> searchApprovalsInvoker(
        SearchApprovalsRequest request) {
        return new SyncInvoker<SearchApprovalsRequest, SearchApprovalsResponse>(request,
            DataArtsStudioMeta.searchApprovals, hcClient);
    }

    /**
     * 查找原子指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找原子指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchAtomicIndexesRequest 请求对象
     * @return SearchAtomicIndexesResponse
     */
    public SearchAtomicIndexesResponse searchAtomicIndexes(SearchAtomicIndexesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchAtomicIndexes);
    }

    /**
     * 查找原子指标
     *
     * 通过中英文名称、创建者、审核人、状态、修改时间分页查找原子指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchAtomicIndexesRequest 请求对象
     * @return SyncInvoker<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse>
     */
    public SyncInvoker<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse> searchAtomicIndexesInvoker(
        SearchAtomicIndexesRequest request) {
        return new SyncInvoker<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse>(request,
            DataArtsStudioMeta.searchAtomicIndexes, hcClient);
    }

    /**
     * 查询API已授权的APP
     *
     * 查询API已授权的APP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchAuthorizeAppRequest 请求对象
     * @return SearchAuthorizeAppResponse
     */
    public SearchAuthorizeAppResponse searchAuthorizeApp(SearchAuthorizeAppRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchAuthorizeApp);
    }

    /**
     * 查询API已授权的APP
     *
     * 查询API已授权的APP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchAuthorizeAppRequest 请求对象
     * @return SyncInvoker<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse>
     */
    public SyncInvoker<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse> searchAuthorizeAppInvoker(
        SearchAuthorizeAppRequest request) {
        return new SyncInvoker<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse>(request,
            DataArtsStudioMeta.searchAuthorizeApp, hcClient);
    }

    /**
     * 查询APP已拥有授权的API
     *
     * 查询APP已拥有授权的API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchBindApiRequest 请求对象
     * @return SearchBindApiResponse
     */
    public SearchBindApiResponse searchBindApi(SearchBindApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchBindApi);
    }

    /**
     * 查询APP已拥有授权的API
     *
     * 查询APP已拥有授权的API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchBindApiRequest 请求对象
     * @return SyncInvoker<SearchBindApiRequest, SearchBindApiResponse>
     */
    public SyncInvoker<SearchBindApiRequest, SearchBindApiResponse> searchBindApiInvoker(SearchBindApiRequest request) {
        return new SyncInvoker<SearchBindApiRequest, SearchBindApiResponse>(request, DataArtsStudioMeta.searchBindApi,
            hcClient);
    }

    /**
     * 查询流程架构列表
     *
     * 查询流程架构列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchCatalogsRequest 请求对象
     * @return SearchCatalogsResponse
     */
    public SearchCatalogsResponse searchCatalogs(SearchCatalogsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchCatalogs);
    }

    /**
     * 查询流程架构列表
     *
     * 查询流程架构列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchCatalogsRequest 请求对象
     * @return SyncInvoker<SearchCatalogsRequest, SearchCatalogsResponse>
     */
    public SyncInvoker<SearchCatalogsRequest, SearchCatalogsResponse> searchCatalogsInvoker(
        SearchCatalogsRequest request) {
        return new SyncInvoker<SearchCatalogsRequest, SearchCatalogsResponse>(request,
            DataArtsStudioMeta.searchCatalogs, hcClient);
    }

    /**
     * 查看码表字段值
     *
     * 查看码表字段值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchCodeTableValuesRequest 请求对象
     * @return SearchCodeTableValuesResponse
     */
    public SearchCodeTableValuesResponse searchCodeTableValues(SearchCodeTableValuesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchCodeTableValues);
    }

    /**
     * 查看码表字段值
     *
     * 查看码表字段值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchCodeTableValuesRequest 请求对象
     * @return SyncInvoker<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse>
     */
    public SyncInvoker<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse> searchCodeTableValuesInvoker(
        SearchCodeTableValuesRequest request) {
        return new SyncInvoker<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse>(request,
            DataArtsStudioMeta.searchCodeTableValues, hcClient);
    }

    /**
     * 查询码表列表
     *
     * 查询码表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchCodeTablesRequest 请求对象
     * @return SearchCodeTablesResponse
     */
    public SearchCodeTablesResponse searchCodeTables(SearchCodeTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchCodeTables);
    }

    /**
     * 查询码表列表
     *
     * 查询码表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchCodeTablesRequest 请求对象
     * @return SyncInvoker<SearchCodeTablesRequest, SearchCodeTablesResponse>
     */
    public SyncInvoker<SearchCodeTablesRequest, SearchCodeTablesResponse> searchCodeTablesInvoker(
        SearchCodeTablesRequest request) {
        return new SyncInvoker<SearchCodeTablesRequest, SearchCodeTablesResponse>(request,
            DataArtsStudioMeta.searchCodeTables, hcClient);
    }

    /**
     * 查询自定义项
     *
     * 查询自定义项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchCustomizedFieldsRequest 请求对象
     * @return SearchCustomizedFieldsResponse
     */
    public SearchCustomizedFieldsResponse searchCustomizedFields(SearchCustomizedFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchCustomizedFields);
    }

    /**
     * 查询自定义项
     *
     * 查询自定义项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchCustomizedFieldsRequest 请求对象
     * @return SyncInvoker<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse>
     */
    public SyncInvoker<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse> searchCustomizedFieldsInvoker(
        SearchCustomizedFieldsRequest request) {
        return new SyncInvoker<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse>(request,
            DataArtsStudioMeta.searchCustomizedFields, hcClient);
    }

    /**
     * 获取数据连接信息
     *
     * 获取指定类型下的数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDwByTypeRequest 请求对象
     * @return SearchDwByTypeResponse
     */
    public SearchDwByTypeResponse searchDwByType(SearchDwByTypeRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchDwByType);
    }

    /**
     * 获取数据连接信息
     *
     * 获取指定类型下的数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDwByTypeRequest 请求对象
     * @return SyncInvoker<SearchDwByTypeRequest, SearchDwByTypeResponse>
     */
    public SyncInvoker<SearchDwByTypeRequest, SearchDwByTypeResponse> searchDwByTypeInvoker(
        SearchDwByTypeRequest request) {
        return new SyncInvoker<SearchDwByTypeRequest, SearchDwByTypeResponse>(request,
            DataArtsStudioMeta.searchDwByType, hcClient);
    }

    /**
     * 通过路径获取id
     *
     * 通过路径获取id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchIdByPathRequest 请求对象
     * @return SearchIdByPathResponse
     */
    public SearchIdByPathResponse searchIdByPath(SearchIdByPathRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchIdByPath);
    }

    /**
     * 通过路径获取id
     *
     * 通过路径获取id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchIdByPathRequest 请求对象
     * @return SyncInvoker<SearchIdByPathRequest, SearchIdByPathResponse>
     */
    public SyncInvoker<SearchIdByPathRequest, SearchIdByPathResponse> searchIdByPathInvoker(
        SearchIdByPathRequest request) {
        return new SyncInvoker<SearchIdByPathRequest, SearchIdByPathResponse>(request,
            DataArtsStudioMeta.searchIdByPath, hcClient);
    }

    /**
     * 查找主题列表
     *
     * 通过名称、创建者、责任人、状态、修改时间分页查找主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchSubjectRequest 请求对象
     * @return SearchSubjectResponse
     */
    public SearchSubjectResponse searchSubject(SearchSubjectRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchSubject);
    }

    /**
     * 查找主题列表
     *
     * 通过名称、创建者、责任人、状态、修改时间分页查找主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchSubjectRequest 请求对象
     * @return SyncInvoker<SearchSubjectRequest, SearchSubjectResponse>
     */
    public SyncInvoker<SearchSubjectRequest, SearchSubjectResponse> searchSubjectInvoker(SearchSubjectRequest request) {
        return new SyncInvoker<SearchSubjectRequest, SearchSubjectResponse>(request, DataArtsStudioMeta.searchSubject,
            hcClient);
    }

    /**
     * 查找主题列表(新)
     *
     * 查找主题(新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchSubjectNewRequest 请求对象
     * @return SearchSubjectNewResponse
     */
    public SearchSubjectNewResponse searchSubjectNew(SearchSubjectNewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchSubjectNew);
    }

    /**
     * 查找主题列表(新)
     *
     * 查找主题(新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchSubjectNewRequest 请求对象
     * @return SyncInvoker<SearchSubjectNewRequest, SearchSubjectNewResponse>
     */
    public SyncInvoker<SearchSubjectNewRequest, SearchSubjectNewResponse> searchSubjectNewInvoker(
        SearchSubjectNewRequest request) {
        return new SyncInvoker<SearchSubjectNewRequest, SearchSubjectNewResponse>(request,
            DataArtsStudioMeta.searchSubjectNew, hcClient);
    }

    /**
     * 查找版本信息
     *
     * 通过名称、创建者、修改时间查找版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchVersionsRequest 请求对象
     * @return SearchVersionsResponse
     */
    public SearchVersionsResponse searchVersions(SearchVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchVersions);
    }

    /**
     * 查找版本信息
     *
     * 通过名称、创建者、修改时间查找版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchVersionsRequest 请求对象
     * @return SyncInvoker<SearchVersionsRequest, SearchVersionsResponse>
     */
    public SyncInvoker<SearchVersionsRequest, SearchVersionsResponse> searchVersionsInvoker(
        SearchVersionsRequest request) {
        return new SyncInvoker<SearchVersionsRequest, SearchVersionsResponse>(request,
            DataArtsStudioMeta.searchVersions, hcClient);
    }

    /**
     * 查看汇总表详情
     *
     * 通过id查看汇总表的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregationLogicTableByIdRequest 请求对象
     * @return ShowAggregationLogicTableByIdResponse
     */
    public ShowAggregationLogicTableByIdResponse showAggregationLogicTableById(
        ShowAggregationLogicTableByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAggregationLogicTableById);
    }

    /**
     * 查看汇总表详情
     *
     * 通过id查看汇总表的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregationLogicTableByIdRequest 请求对象
     * @return SyncInvoker<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse>
     */
    public SyncInvoker<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse> showAggregationLogicTableByIdInvoker(
        ShowAggregationLogicTableByIdRequest request) {
        return new SyncInvoker<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse>(request,
            DataArtsStudioMeta.showAggregationLogicTableById, hcClient);
    }

    /**
     * 查询指定api 仪表板数据详情
     *
     * 查询指定api 仪表板数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiDashboardRequest 请求对象
     * @return ShowApiDashboardResponse
     */
    public ShowApiDashboardResponse showApiDashboard(ShowApiDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApiDashboard);
    }

    /**
     * 查询指定api 仪表板数据详情
     *
     * 查询指定api 仪表板数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiDashboardRequest 请求对象
     * @return SyncInvoker<ShowApiDashboardRequest, ShowApiDashboardResponse>
     */
    public SyncInvoker<ShowApiDashboardRequest, ShowApiDashboardResponse> showApiDashboardInvoker(
        ShowApiDashboardRequest request) {
        return new SyncInvoker<ShowApiDashboardRequest, ShowApiDashboardResponse>(request,
            DataArtsStudioMeta.showApiDashboard, hcClient);
    }

    /**
     * 查询api 仪表板数据详情
     *
     * 查询api 仪表板数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApisDashboardRequest 请求对象
     * @return ShowApisDashboardResponse
     */
    public ShowApisDashboardResponse showApisDashboard(ShowApisDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApisDashboard);
    }

    /**
     * 查询api 仪表板数据详情
     *
     * 查询api 仪表板数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApisDashboardRequest 请求对象
     * @return SyncInvoker<ShowApisDashboardRequest, ShowApisDashboardResponse>
     */
    public SyncInvoker<ShowApisDashboardRequest, ShowApisDashboardResponse> showApisDashboardInvoker(
        ShowApisDashboardRequest request) {
        return new SyncInvoker<ShowApisDashboardRequest, ShowApisDashboardResponse>(request,
            DataArtsStudioMeta.showApisDashboard, hcClient);
    }

    /**
     * 查询api 统计数据详情
     *
     * 查询api 统计数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApisDetailRequest 请求对象
     * @return ShowApisDetailResponse
     */
    public ShowApisDetailResponse showApisDetail(ShowApisDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApisDetail);
    }

    /**
     * 查询api 统计数据详情
     *
     * 查询api 统计数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApisDetailRequest 请求对象
     * @return SyncInvoker<ShowApisDetailRequest, ShowApisDetailResponse>
     */
    public SyncInvoker<ShowApisDetailRequest, ShowApisDetailResponse> showApisDetailInvoker(
        ShowApisDetailRequest request) {
        return new SyncInvoker<ShowApisDetailRequest, ShowApisDetailResponse>(request,
            DataArtsStudioMeta.showApisDetail, hcClient);
    }

    /**
     * 查询统计用户相关的总览开发指标
     *
     * 查询统计用户相关的总览开发指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApisOverviewRequest 请求对象
     * @return ShowApisOverviewResponse
     */
    public ShowApisOverviewResponse showApisOverview(ShowApisOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApisOverview);
    }

    /**
     * 查询统计用户相关的总览开发指标
     *
     * 查询统计用户相关的总览开发指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApisOverviewRequest 请求对象
     * @return SyncInvoker<ShowApisOverviewRequest, ShowApisOverviewResponse>
     */
    public SyncInvoker<ShowApisOverviewRequest, ShowApisOverviewResponse> showApisOverviewInvoker(
        ShowApisOverviewRequest request) {
        return new SyncInvoker<ShowApisOverviewRequest, ShowApisOverviewResponse>(request,
            DataArtsStudioMeta.showApisOverview, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppInfoRequest 请求对象
     * @return ShowAppInfoResponse
     */
    public ShowAppInfoResponse showAppInfo(ShowAppInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAppInfo);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppInfoRequest 请求对象
     * @return SyncInvoker<ShowAppInfoRequest, ShowAppInfoResponse>
     */
    public SyncInvoker<ShowAppInfoRequest, ShowAppInfoResponse> showAppInfoInvoker(ShowAppInfoRequest request) {
        return new SyncInvoker<ShowAppInfoRequest, ShowAppInfoResponse>(request, DataArtsStudioMeta.showAppInfo,
            hcClient);
    }

    /**
     * 获取申请详情
     *
     * 获取申请详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplyDetailRequest 请求对象
     * @return ShowApplyDetailResponse
     */
    public ShowApplyDetailResponse showApplyDetail(ShowApplyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApplyDetail);
    }

    /**
     * 获取申请详情
     *
     * 获取申请详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplyDetailRequest 请求对象
     * @return SyncInvoker<ShowApplyDetailRequest, ShowApplyDetailResponse>
     */
    public SyncInvoker<ShowApplyDetailRequest, ShowApplyDetailResponse> showApplyDetailInvoker(
        ShowApplyDetailRequest request) {
        return new SyncInvoker<ShowApplyDetailRequest, ShowApplyDetailResponse>(request,
            DataArtsStudioMeta.showApplyDetail, hcClient);
    }

    /**
     * 查询app 仪表板数据详情
     *
     * 查询app 仪表板数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppsDashboardRequest 请求对象
     * @return ShowAppsDashboardResponse
     */
    public ShowAppsDashboardResponse showAppsDashboard(ShowAppsDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAppsDashboard);
    }

    /**
     * 查询app 仪表板数据详情
     *
     * 查询app 仪表板数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppsDashboardRequest 请求对象
     * @return SyncInvoker<ShowAppsDashboardRequest, ShowAppsDashboardResponse>
     */
    public SyncInvoker<ShowAppsDashboardRequest, ShowAppsDashboardResponse> showAppsDashboardInvoker(
        ShowAppsDashboardRequest request) {
        return new SyncInvoker<ShowAppsDashboardRequest, ShowAppsDashboardResponse>(request,
            DataArtsStudioMeta.showAppsDashboard, hcClient);
    }

    /**
     * 查询app 统计数据详情
     *
     * 查询app 统计数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppsDetailRequest 请求对象
     * @return ShowAppsDetailResponse
     */
    public ShowAppsDetailResponse showAppsDetail(ShowAppsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAppsDetail);
    }

    /**
     * 查询app 统计数据详情
     *
     * 查询app 统计数据详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppsDetailRequest 请求对象
     * @return SyncInvoker<ShowAppsDetailRequest, ShowAppsDetailResponse>
     */
    public SyncInvoker<ShowAppsDetailRequest, ShowAppsDetailResponse> showAppsDetailInvoker(
        ShowAppsDetailRequest request) {
        return new SyncInvoker<ShowAppsDetailRequest, ShowAppsDetailResponse>(request,
            DataArtsStudioMeta.showAppsDetail, hcClient);
    }

    /**
     * 查询统计用户相关的总览调用指标
     *
     * 查询统计用户相关的总览调用指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppsOverviewRequest 请求对象
     * @return ShowAppsOverviewResponse
     */
    public ShowAppsOverviewResponse showAppsOverview(ShowAppsOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAppsOverview);
    }

    /**
     * 查询统计用户相关的总览调用指标
     *
     * 查询统计用户相关的总览调用指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppsOverviewRequest 请求对象
     * @return SyncInvoker<ShowAppsOverviewRequest, ShowAppsOverviewResponse>
     */
    public SyncInvoker<ShowAppsOverviewRequest, ShowAppsOverviewResponse> showAppsOverviewInvoker(
        ShowAppsOverviewRequest request) {
        return new SyncInvoker<ShowAppsOverviewRequest, ShowAppsOverviewResponse>(request,
            DataArtsStudioMeta.showAppsOverview, hcClient);
    }

    /**
     * 查看原子指标详情
     *
     * 通过id获取指标详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAtomicIndexByIdRequest 请求对象
     * @return ShowAtomicIndexByIdResponse
     */
    public ShowAtomicIndexByIdResponse showAtomicIndexById(ShowAtomicIndexByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showAtomicIndexById);
    }

    /**
     * 查看原子指标详情
     *
     * 通过id获取指标详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAtomicIndexByIdRequest 请求对象
     * @return SyncInvoker<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse>
     */
    public SyncInvoker<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse> showAtomicIndexByIdInvoker(
        ShowAtomicIndexByIdRequest request) {
        return new SyncInvoker<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse>(request,
            DataArtsStudioMeta.showAtomicIndexById, hcClient);
    }

    /**
     * 查找流程架构详情
     *
     * 查找流程架构详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBizCatalogDetailRequest 请求对象
     * @return ShowBizCatalogDetailResponse
     */
    public ShowBizCatalogDetailResponse showBizCatalogDetail(ShowBizCatalogDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showBizCatalogDetail);
    }

    /**
     * 查找流程架构详情
     *
     * 查找流程架构详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBizCatalogDetailRequest 请求对象
     * @return SyncInvoker<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse>
     */
    public SyncInvoker<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse> showBizCatalogDetailInvoker(
        ShowBizCatalogDetailRequest request) {
        return new SyncInvoker<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse>(request,
            DataArtsStudioMeta.showBizCatalogDetail, hcClient);
    }

    /**
     * 查看指标详情
     *
     * 通过id查看指标的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBizMetricByIdRequest 请求对象
     * @return ShowBizMetricByIdResponse
     */
    public ShowBizMetricByIdResponse showBizMetricById(ShowBizMetricByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showBizMetricById);
    }

    /**
     * 查看指标详情
     *
     * 通过id查看指标的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBizMetricByIdRequest 请求对象
     * @return SyncInvoker<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse>
     */
    public SyncInvoker<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse> showBizMetricByIdInvoker(
        ShowBizMetricByIdRequest request) {
        return new SyncInvoker<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse>(request,
            DataArtsStudioMeta.showBizMetricById, hcClient);
    }

    /**
     * 查询业务资产
     *
     * 业务资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBusinessAssetsRequest 请求对象
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
     * @param ShowBusinessAssetsRequest 请求对象
     * @return SyncInvoker<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse>
     */
    public SyncInvoker<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse> showBusinessAssetsInvoker(
        ShowBusinessAssetsRequest request) {
        return new SyncInvoker<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse>(request,
            DataArtsStudioMeta.showBusinessAssets, hcClient);
    }

    /**
     * 获取业务资产统计信息
     *
     * 获取业务资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBusinessAssetsStatisticRequest 请求对象
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
     * @param ShowBusinessAssetsStatisticRequest 请求对象
     * @return SyncInvoker<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse>
     */
    public SyncInvoker<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse> showBusinessAssetsStatisticInvoker(
        ShowBusinessAssetsStatisticRequest request) {
        return new SyncInvoker<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse>(request,
            DataArtsStudioMeta.showBusinessAssetsStatistic, hcClient);
    }

    /**
     * 查询服务目录
     *
     * 查询服务目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogDetailRequest 请求对象
     * @return ShowCatalogDetailResponse
     */
    public ShowCatalogDetailResponse showCatalogDetail(ShowCatalogDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showCatalogDetail);
    }

    /**
     * 查询服务目录
     *
     * 查询服务目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogDetailRequest 请求对象
     * @return SyncInvoker<ShowCatalogDetailRequest, ShowCatalogDetailResponse>
     */
    public SyncInvoker<ShowCatalogDetailRequest, ShowCatalogDetailResponse> showCatalogDetailInvoker(
        ShowCatalogDetailRequest request) {
        return new SyncInvoker<ShowCatalogDetailRequest, ShowCatalogDetailResponse>(request,
            DataArtsStudioMeta.showCatalogDetail, hcClient);
    }

    /**
     * 查看码表详情
     *
     * 通过id查看码表的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCodeTableByIdRequest 请求对象
     * @return ShowCodeTableByIdResponse
     */
    public ShowCodeTableByIdResponse showCodeTableById(ShowCodeTableByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showCodeTableById);
    }

    /**
     * 查看码表详情
     *
     * 通过id查看码表的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCodeTableByIdRequest 请求对象
     * @return SyncInvoker<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse>
     */
    public SyncInvoker<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse> showCodeTableByIdInvoker(
        ShowCodeTableByIdRequest request) {
        return new SyncInvoker<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse>(request,
            DataArtsStudioMeta.showCodeTableById, hcClient);
    }

    /**
     * 查看复合指标详情
     *
     * 通过id获取复合指标详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCompoundMetricByIdRequest 请求对象
     * @return ShowCompoundMetricByIdResponse
     */
    public ShowCompoundMetricByIdResponse showCompoundMetricById(ShowCompoundMetricByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showCompoundMetricById);
    }

    /**
     * 查看复合指标详情
     *
     * 通过id获取复合指标详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCompoundMetricByIdRequest 请求对象
     * @return SyncInvoker<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse>
     */
    public SyncInvoker<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse> showCompoundMetricByIdInvoker(
        ShowCompoundMetricByIdRequest request) {
        return new SyncInvoker<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse>(request,
            DataArtsStudioMeta.showCompoundMetricById, hcClient);
    }

    /**
     * 查看限定详情
     *
     * 通过id查看限定详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConditionByIdRequest 请求对象
     * @return ShowConditionByIdResponse
     */
    public ShowConditionByIdResponse showConditionById(ShowConditionByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showConditionById);
    }

    /**
     * 查看限定详情
     *
     * 通过id查看限定详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConditionByIdRequest 请求对象
     * @return SyncInvoker<ShowConditionByIdRequest, ShowConditionByIdResponse>
     */
    public SyncInvoker<ShowConditionByIdRequest, ShowConditionByIdResponse> showConditionByIdInvoker(
        ShowConditionByIdRequest request) {
        return new SyncInvoker<ShowConditionByIdRequest, ShowConditionByIdResponse>(request,
            DataArtsStudioMeta.showConditionById, hcClient);
    }

    /**
     * 获取对账作业详情
     *
     * 获取对账作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConsistencyTaskDetailRequest 请求对象
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
     * @param ShowConsistencyTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse>
     */
    public SyncInvoker<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse> showConsistencyTaskDetailInvoker(
        ShowConsistencyTaskDetailRequest request) {
        return new SyncInvoker<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse>(request,
            DataArtsStudioMeta.showConsistencyTaskDetail, hcClient);
    }

    /**
     * 资产信息
     *
     * 查询概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataProfileRequest 请求对象
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
     * @param ShowDataProfileRequest 请求对象
     * @return SyncInvoker<ShowDataProfileRequest, ShowDataProfileResponse>
     */
    public SyncInvoker<ShowDataProfileRequest, ShowDataProfileResponse> showDataProfileInvoker(
        ShowDataProfileRequest request) {
        return new SyncInvoker<ShowDataProfileRequest, ShowDataProfileResponse>(request,
            DataArtsStudioMeta.showDataProfile, hcClient);
    }

    /**
     * 资产搜索
     *
     * 资产搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataSetsRequest 请求对象
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
     * @param ShowDataSetsRequest 请求对象
     * @return SyncInvoker<ShowDataSetsRequest, ShowDataSetsResponse>
     */
    public SyncInvoker<ShowDataSetsRequest, ShowDataSetsResponse> showDataSetsInvoker(ShowDataSetsRequest request) {
        return new SyncInvoker<ShowDataSetsRequest, ShowDataSetsResponse>(request, DataArtsStudioMeta.showDataSets,
            hcClient);
    }

    /**
     * 查询单个数据连接信息
     *
     * 查询单个数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataconnectionRequest 请求对象
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
     * @param ShowDataconnectionRequest 请求对象
     * @return SyncInvoker<ShowDataconnectionRequest, ShowDataconnectionResponse>
     */
    public SyncInvoker<ShowDataconnectionRequest, ShowDataconnectionResponse> showDataconnectionInvoker(
        ShowDataconnectionRequest request) {
        return new SyncInvoker<ShowDataconnectionRequest, ShowDataconnectionResponse>(request,
            DataArtsStudioMeta.showDataconnection, hcClient);
    }

    /**
     * 查看衍生指标详情
     *
     * 通过id获取衍生详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDerivativeIndexByIdRequest 请求对象
     * @return ShowDerivativeIndexByIdResponse
     */
    public ShowDerivativeIndexByIdResponse showDerivativeIndexById(ShowDerivativeIndexByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDerivativeIndexById);
    }

    /**
     * 查看衍生指标详情
     *
     * 通过id获取衍生详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDerivativeIndexByIdRequest 请求对象
     * @return SyncInvoker<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse>
     */
    public SyncInvoker<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse> showDerivativeIndexByIdInvoker(
        ShowDerivativeIndexByIdRequest request) {
        return new SyncInvoker<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse>(request,
            DataArtsStudioMeta.showDerivativeIndexById, hcClient);
    }

    /**
     * 查看维度详情
     *
     * 通过id查看维度详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDimensionByIdRequest 请求对象
     * @return ShowDimensionByIdResponse
     */
    public ShowDimensionByIdResponse showDimensionById(ShowDimensionByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDimensionById);
    }

    /**
     * 查看维度详情
     *
     * 通过id查看维度详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDimensionByIdRequest 请求对象
     * @return SyncInvoker<ShowDimensionByIdRequest, ShowDimensionByIdResponse>
     */
    public SyncInvoker<ShowDimensionByIdRequest, ShowDimensionByIdResponse> showDimensionByIdInvoker(
        ShowDimensionByIdRequest request) {
        return new SyncInvoker<ShowDimensionByIdRequest, ShowDimensionByIdResponse>(request,
            DataArtsStudioMeta.showDimensionById, hcClient);
    }

    /**
     * 查看维度表详情
     *
     * 通过id查看维度表的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDimensionLogicTableByIdRequest 请求对象
     * @return ShowDimensionLogicTableByIdResponse
     */
    public ShowDimensionLogicTableByIdResponse showDimensionLogicTableById(ShowDimensionLogicTableByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showDimensionLogicTableById);
    }

    /**
     * 查看维度表详情
     *
     * 通过id查看维度表的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDimensionLogicTableByIdRequest 请求对象
     * @return SyncInvoker<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse>
     */
    public SyncInvoker<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse> showDimensionLogicTableByIdInvoker(
        ShowDimensionLogicTableByIdRequest request) {
        return new SyncInvoker<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse>(request,
            DataArtsStudioMeta.showDimensionLogicTableById, hcClient);
    }

    /**
     * 查询技术资产
     *
     * 查询技术资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEntitiesRequest 请求对象
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
     * @param ShowEntitiesRequest 请求对象
     * @return SyncInvoker<ShowEntitiesRequest, ShowEntitiesResponse>
     */
    public SyncInvoker<ShowEntitiesRequest, ShowEntitiesResponse> showEntitiesInvoker(ShowEntitiesRequest request) {
        return new SyncInvoker<ShowEntitiesRequest, ShowEntitiesResponse>(request, DataArtsStudioMeta.showEntities,
            hcClient);
    }

    /**
     * 根据guid获取资产详情
     *
     * 根据表guid可以获取表的详情信息，表的详情信息包含column的信息，也可以根据column的guid直接获取column的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEntityInfoByGuidRequest 请求对象
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
     * @param ShowEntityInfoByGuidRequest 请求对象
     * @return SyncInvoker<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse>
     */
    public SyncInvoker<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse> showEntityInfoByGuidInvoker(
        ShowEntityInfoByGuidRequest request) {
        return new SyncInvoker<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse>(request,
            DataArtsStudioMeta.showEntityInfoByGuid, hcClient);
    }

    /**
     * 查看事实表详情
     *
     * 通过id查看事实表的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFactLogicTableByIdRequest 请求对象
     * @return ShowFactLogicTableByIdResponse
     */
    public ShowFactLogicTableByIdResponse showFactLogicTableById(ShowFactLogicTableByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showFactLogicTableById);
    }

    /**
     * 查看事实表详情
     *
     * 通过id查看事实表的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFactLogicTableByIdRequest 请求对象
     * @return SyncInvoker<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse>
     */
    public SyncInvoker<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse> showFactLogicTableByIdInvoker(
        ShowFactLogicTableByIdRequest request) {
        return new SyncInvoker<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse>(request,
            DataArtsStudioMeta.showFactLogicTableById, hcClient);
    }

    /**
     * 查询环境变量信息
     *
     * 查询环境变量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFactoryEnvRequest 请求对象
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
     * @param ShowFactoryEnvRequest 请求对象
     * @return SyncInvoker<ShowFactoryEnvRequest, ShowFactoryEnvResponse>
     */
    public SyncInvoker<ShowFactoryEnvRequest, ShowFactoryEnvResponse> showFactoryEnvInvoker(
        ShowFactoryEnvRequest request) {
        return new SyncInvoker<ShowFactoryEnvRequest, ShowFactoryEnvResponse>(request,
            DataArtsStudioMeta.showFactoryEnv, hcClient);
    }

    /**
     * 查询所有的补数据实例
     *
     * 查询所有的补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFactorySupplementDataRequest 请求对象
     * @return ShowFactorySupplementDataResponse
     */
    public ShowFactorySupplementDataResponse showFactorySupplementData(ShowFactorySupplementDataRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showFactorySupplementData);
    }

    /**
     * 查询所有的补数据实例
     *
     * 查询所有的补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFactorySupplementDataRequest 请求对象
     * @return SyncInvoker<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse>
     */
    public SyncInvoker<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse> showFactorySupplementDataInvoker(
        ShowFactorySupplementDataRequest request) {
        return new SyncInvoker<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse>(request,
            DataArtsStudioMeta.showFactorySupplementData, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGlossaryListRequest 请求对象
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
     * @param ShowGlossaryListRequest 请求对象
     * @return SyncInvoker<ShowGlossaryListRequest, ShowGlossaryListResponse>
     */
    public SyncInvoker<ShowGlossaryListRequest, ShowGlossaryListResponse> showGlossaryListInvoker(
        ShowGlossaryListRequest request) {
        return new SyncInvoker<ShowGlossaryListRequest, ShowGlossaryListResponse>(request,
            DataArtsStudioMeta.showGlossaryList, hcClient);
    }

    /**
     * 获取任务日志
     *
     * 获取任务日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceLogRequest 请求对象
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
     * @param ShowInstanceLogRequest 请求对象
     * @return SyncInvoker<ShowInstanceLogRequest, ShowInstanceLogResponse>
     */
    public SyncInvoker<ShowInstanceLogRequest, ShowInstanceLogResponse> showInstanceLogInvoker(
        ShowInstanceLogRequest request) {
        return new SyncInvoker<ShowInstanceLogRequest, ShowInstanceLogResponse>(request,
            DataArtsStudioMeta.showInstanceLog, hcClient);
    }

    /**
     * 获取实例结果
     *
     * 获取实例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceResultRequest 请求对象
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
     * @param ShowInstanceResultRequest 请求对象
     * @return SyncInvoker<ShowInstanceResultRequest, ShowInstanceResultResponse>
     */
    public SyncInvoker<ShowInstanceResultRequest, ShowInstanceResultResponse> showInstanceResultInvoker(
        ShowInstanceResultRequest request) {
        return new SyncInvoker<ShowInstanceResultRequest, ShowInstanceResultResponse>(request,
            DataArtsStudioMeta.showInstanceResult, hcClient);
    }

    /**
     * 获取消息详情
     *
     * 获取消息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageDetailRequest 请求对象
     * @return ShowMessageDetailResponse
     */
    public ShowMessageDetailResponse showMessageDetail(ShowMessageDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showMessageDetail);
    }

    /**
     * 获取消息详情
     *
     * 获取消息详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageDetailRequest 请求对象
     * @return SyncInvoker<ShowMessageDetailRequest, ShowMessageDetailResponse>
     */
    public SyncInvoker<ShowMessageDetailRequest, ShowMessageDetailResponse> showMessageDetailInvoker(
        ShowMessageDetailRequest request) {
        return new SyncInvoker<ShowMessageDetailRequest, ShowMessageDetailResponse>(request,
            DataArtsStudioMeta.showMessageDetail, hcClient);
    }

    /**
     * 查询指标资产
     *
     * 指标资产查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMetricAssetsRequest 请求对象
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
     * @param ShowMetricAssetsRequest 请求对象
     * @return SyncInvoker<ShowMetricAssetsRequest, ShowMetricAssetsResponse>
     */
    public SyncInvoker<ShowMetricAssetsRequest, ShowMetricAssetsResponse> showMetricAssetsInvoker(
        ShowMetricAssetsRequest request) {
        return new SyncInvoker<ShowMetricAssetsRequest, ShowMetricAssetsResponse>(request,
            DataArtsStudioMeta.showMetricAssets, hcClient);
    }

    /**
     * 查询指标资产目录树
     *
     * 查询指标资产目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMetricTreeRequest 请求对象
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
     * @param ShowMetricTreeRequest 请求对象
     * @return SyncInvoker<ShowMetricTreeRequest, ShowMetricTreeResponse>
     */
    public SyncInvoker<ShowMetricTreeRequest, ShowMetricTreeResponse> showMetricTreeInvoker(
        ShowMetricTreeRequest request) {
        return new SyncInvoker<ShowMetricTreeRequest, ShowMetricTreeResponse>(request,
            DataArtsStudioMeta.showMetricTree, hcClient);
    }

    /**
     * 通过id获取路径
     *
     * 通过id获取路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPathByIdRequest 请求对象
     * @return ShowPathByIdResponse
     */
    public ShowPathByIdResponse showPathById(ShowPathByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showPathById);
    }

    /**
     * 通过id获取路径
     *
     * 通过id获取路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPathByIdRequest 请求对象
     * @return SyncInvoker<ShowPathByIdRequest, ShowPathByIdResponse>
     */
    public SyncInvoker<ShowPathByIdRequest, ShowPathByIdResponse> showPathByIdInvoker(ShowPathByIdRequest request) {
        return new SyncInvoker<ShowPathByIdRequest, ShowPathByIdResponse>(request, DataArtsStudioMeta.showPathById,
            hcClient);
    }

    /**
     * 通过id获取路径对象
     *
     * 通过id获取路径对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPathObjectByIdRequest 请求对象
     * @return ShowPathObjectByIdResponse
     */
    public ShowPathObjectByIdResponse showPathObjectById(ShowPathObjectByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showPathObjectById);
    }

    /**
     * 通过id获取路径对象
     *
     * 通过id获取路径对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPathObjectByIdRequest 请求对象
     * @return SyncInvoker<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse>
     */
    public SyncInvoker<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse> showPathObjectByIdInvoker(
        ShowPathObjectByIdRequest request) {
        return new SyncInvoker<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse>(request,
            DataArtsStudioMeta.showPathObjectById, hcClient);
    }

    /**
     * 获取质量作业详情
     *
     * 获取质量作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQualityTaskDetailRequest 请求对象
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
     * @param ShowQualityTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse>
     */
    public SyncInvoker<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse> showQualityTaskDetailInvoker(
        ShowQualityTaskDetailRequest request) {
        return new SyncInvoker<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse>(request,
            DataArtsStudioMeta.showQualityTaskDetail, hcClient);
    }

    /**
     * 查看关系详情
     *
     * 通过id获取关系详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRelationByIdRequest 请求对象
     * @return ShowRelationByIdResponse
     */
    public ShowRelationByIdResponse showRelationById(ShowRelationByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showRelationById);
    }

    /**
     * 查看关系详情
     *
     * 通过id获取关系详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRelationByIdRequest 请求对象
     * @return SyncInvoker<ShowRelationByIdRequest, ShowRelationByIdResponse>
     */
    public SyncInvoker<ShowRelationByIdRequest, ShowRelationByIdResponse> showRelationByIdInvoker(
        ShowRelationByIdRequest request) {
        return new SyncInvoker<ShowRelationByIdRequest, ShowRelationByIdResponse>(request,
            DataArtsStudioMeta.showRelationById, hcClient);
    }

    /**
     * 查看数据标准详情
     *
     * 通过id获取数据标准详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStandardByIdRequest 请求对象
     * @return ShowStandardByIdResponse
     */
    public ShowStandardByIdResponse showStandardById(ShowStandardByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showStandardById);
    }

    /**
     * 查看数据标准详情
     *
     * 通过id获取数据标准详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStandardByIdRequest 请求对象
     * @return SyncInvoker<ShowStandardByIdRequest, ShowStandardByIdResponse>
     */
    public SyncInvoker<ShowStandardByIdRequest, ShowStandardByIdResponse> showStandardByIdInvoker(
        ShowStandardByIdRequest request) {
        return new SyncInvoker<ShowStandardByIdRequest, ShowStandardByIdResponse>(request,
            DataArtsStudioMeta.showStandardById, hcClient);
    }

    /**
     * 查询数据标准模板
     *
     * 查询数据标准模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStandardTemplateRequest 请求对象
     * @return ShowStandardTemplateResponse
     */
    public ShowStandardTemplateResponse showStandardTemplate(ShowStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showStandardTemplate);
    }

    /**
     * 查询数据标准模板
     *
     * 查询数据标准模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStandardTemplateRequest 请求对象
     * @return SyncInvoker<ShowStandardTemplateRequest, ShowStandardTemplateResponse>
     */
    public SyncInvoker<ShowStandardTemplateRequest, ShowStandardTemplateResponse> showStandardTemplateInvoker(
        ShowStandardTemplateRequest request) {
        return new SyncInvoker<ShowStandardTemplateRequest, ShowStandardTemplateResponse>(request,
            DataArtsStudioMeta.showStandardTemplate, hcClient);
    }

    /**
     * 查看表模型详情
     *
     * 通过id获取模型表详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableModelByIdRequest 请求对象
     * @return ShowTableModelByIdResponse
     */
    public ShowTableModelByIdResponse showTableModelById(ShowTableModelByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showTableModelById);
    }

    /**
     * 查看表模型详情
     *
     * 通过id获取模型表详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableModelByIdRequest 请求对象
     * @return SyncInvoker<ShowTableModelByIdRequest, ShowTableModelByIdResponse>
     */
    public SyncInvoker<ShowTableModelByIdRequest, ShowTableModelByIdResponse> showTableModelByIdInvoker(
        ShowTableModelByIdRequest request) {
        return new SyncInvoker<ShowTableModelByIdRequest, ShowTableModelByIdResponse>(request,
            DataArtsStudioMeta.showTableModelById, hcClient);
    }

    /**
     * 搜索查询标签分页展示
     *
     * 搜索查询标签分页展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagsRequest 请求对象
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
     * @param ShowTagsRequest 请求对象
     * @return SyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public SyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsInvoker(ShowTagsRequest request) {
        return new SyncInvoker<ShowTagsRequest, ShowTagsResponse>(request, DataArtsStudioMeta.showTags, hcClient);
    }

    /**
     * 查询采集任务详情
     *
     * 查询采集任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInfoRequest 请求对象
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
     * @param ShowTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse>
     */
    public SyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse> showTaskInfoInvoker(ShowTaskInfoRequest request) {
        return new SyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse>(request, DataArtsStudioMeta.showTaskInfo,
            hcClient);
    }

    /**
     * 查询采集任务列表
     *
     * 查询采集任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskListRequest 请求对象
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
     * @param ShowTaskListRequest 请求对象
     * @return SyncInvoker<ShowTaskListRequest, ShowTaskListResponse>
     */
    public SyncInvoker<ShowTaskListRequest, ShowTaskListResponse> showTaskListInvoker(ShowTaskListRequest request) {
        return new SyncInvoker<ShowTaskListRequest, ShowTaskListResponse>(request, DataArtsStudioMeta.showTaskList,
            hcClient);
    }

    /**
     * 获取技术资产统计信息
     *
     * 获取技术资产统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTechnicalAssetsStatisticRequest 请求对象
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
     * @param ShowTechnicalAssetsStatisticRequest 请求对象
     * @return SyncInvoker<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse>
     */
    public SyncInvoker<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse> showTechnicalAssetsStatisticInvoker(
        ShowTechnicalAssetsStatisticRequest request) {
        return new SyncInvoker<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse>(request,
            DataArtsStudioMeta.showTechnicalAssetsStatistic, hcClient);
    }

    /**
     * 获取规则模板详情
     *
     * 获取规则模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplatesDetailRequest 请求对象
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
     * @param ShowTemplatesDetailRequest 请求对象
     * @return SyncInvoker<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse>
     */
    public SyncInvoker<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse> showTemplatesDetailInvoker(
        ShowTemplatesDetailRequest request) {
        return new SyncInvoker<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse>(request,
            DataArtsStudioMeta.showTemplatesDetail, hcClient);
    }

    /**
     * 无血缘关系表查询
     *
     * 无血缘关系表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUnrelatedTableRequest 请求对象
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
     * @param ShowUnrelatedTableRequest 请求对象
     * @return SyncInvoker<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse>
     */
    public SyncInvoker<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse> showUnrelatedTableInvoker(
        ShowUnrelatedTableRequest request) {
        return new SyncInvoker<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse>(request,
            DataArtsStudioMeta.showUnrelatedTable, hcClient);
    }

    /**
     * 获取单个工作空间信息
     *
     * 获取单个工作空间信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkSpaceRequest 请求对象
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
     * @param ShowWorkSpaceRequest 请求对象
     * @return SyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse>
     */
    public SyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpaceInvoker(ShowWorkSpaceRequest request) {
        return new SyncInvoker<ShowWorkSpaceRequest, ShowWorkSpaceResponse>(request, DataArtsStudioMeta.showWorkSpace,
            hcClient);
    }

    /**
     * 查询模型详情
     *
     * 查询物理模型或逻辑模型的工作区空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkspaceDetailByIdRequest 请求对象
     * @return ShowWorkspaceDetailByIdResponse
     */
    public ShowWorkspaceDetailByIdResponse showWorkspaceDetailById(ShowWorkspaceDetailByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showWorkspaceDetailById);
    }

    /**
     * 查询模型详情
     *
     * 查询物理模型或逻辑模型的工作区空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkspaceDetailByIdRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse>
     */
    public SyncInvoker<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse> showWorkspaceDetailByIdInvoker(
        ShowWorkspaceDetailByIdRequest request) {
        return new SyncInvoker<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse>(request,
            DataArtsStudioMeta.showWorkspaceDetailById, hcClient);
    }

    /**
     * 停止一个补数据实例
     *
     * 停止一个补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopFactorySupplementDataInstanceRequest 请求对象
     * @return StopFactorySupplementDataInstanceResponse
     */
    public StopFactorySupplementDataInstanceResponse stopFactorySupplementDataInstance(
        StopFactorySupplementDataInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.stopFactorySupplementDataInstance);
    }

    /**
     * 停止一个补数据实例
     *
     * 停止一个补数据实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopFactorySupplementDataInstanceRequest 请求对象
     * @return SyncInvoker<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse>
     */
    public SyncInvoker<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse> stopFactorySupplementDataInstanceInvoker(
        StopFactorySupplementDataInstanceRequest request) {
        return new SyncInvoker<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse>(
            request, DataArtsStudioMeta.stopFactorySupplementDataInstance, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateApp);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, DataArtsStudioMeta.updateApp, hcClient);
    }

    /**
     * 更新业务指标
     *
     * 更新业务指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBizMetricRequest 请求对象
     * @return UpdateBizMetricResponse
     */
    public UpdateBizMetricResponse updateBizMetric(UpdateBizMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateBizMetric);
    }

    /**
     * 更新业务指标
     *
     * 更新业务指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBizMetricRequest 请求对象
     * @return SyncInvoker<UpdateBizMetricRequest, UpdateBizMetricResponse>
     */
    public SyncInvoker<UpdateBizMetricRequest, UpdateBizMetricResponse> updateBizMetricInvoker(
        UpdateBizMetricRequest request) {
        return new SyncInvoker<UpdateBizMetricRequest, UpdateBizMetricResponse>(request,
            DataArtsStudioMeta.updateBizMetric, hcClient);
    }

    /**
     * 更新服务目录
     *
     * 更新服务目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return UpdateCatalogResponse
     */
    public UpdateCatalogResponse updateCatalog(UpdateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateCatalog);
    }

    /**
     * 更新服务目录
     *
     * 更新服务目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>
     */
    public SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalogInvoker(UpdateCatalogRequest request) {
        return new SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>(request, DataArtsStudioMeta.updateCatalog,
            hcClient);
    }

    /**
     * 修改码表
     *
     * 修改码表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCodeTableRequest 请求对象
     * @return UpdateCodeTableResponse
     */
    public UpdateCodeTableResponse updateCodeTable(UpdateCodeTableRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateCodeTable);
    }

    /**
     * 修改码表
     *
     * 修改码表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCodeTableRequest 请求对象
     * @return SyncInvoker<UpdateCodeTableRequest, UpdateCodeTableResponse>
     */
    public SyncInvoker<UpdateCodeTableRequest, UpdateCodeTableResponse> updateCodeTableInvoker(
        UpdateCodeTableRequest request) {
        return new SyncInvoker<UpdateCodeTableRequest, UpdateCodeTableResponse>(request,
            DataArtsStudioMeta.updateCodeTable, hcClient);
    }

    /**
     * 编辑码表字段值
     *
     * 编辑码表字段值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCodeTableValuesRequest 请求对象
     * @return UpdateCodeTableValuesResponse
     */
    public UpdateCodeTableValuesResponse updateCodeTableValues(UpdateCodeTableValuesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateCodeTableValues);
    }

    /**
     * 编辑码表字段值
     *
     * 编辑码表字段值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCodeTableValuesRequest 请求对象
     * @return SyncInvoker<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse>
     */
    public SyncInvoker<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse> updateCodeTableValuesInvoker(
        UpdateCodeTableValuesRequest request) {
        return new SyncInvoker<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse>(request,
            DataArtsStudioMeta.updateCodeTableValues, hcClient);
    }

    /**
     * 更新数据连接信息
     *
     * 更新数据连接信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataconnectionRequest 请求对象
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
     * @param UpdateDataconnectionRequest 请求对象
     * @return SyncInvoker<UpdateDataconnectionRequest, UpdateDataconnectionResponse>
     */
    public SyncInvoker<UpdateDataconnectionRequest, UpdateDataconnectionResponse> updateDataconnectionInvoker(
        UpdateDataconnectionRequest request) {
        return new SyncInvoker<UpdateDataconnectionRequest, UpdateDataconnectionResponse>(request,
            DataArtsStudioMeta.updateDataconnection, hcClient);
    }

    /**
     * 修改目录
     *
     * 修改目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDirectoryRequest 请求对象
     * @return UpdateDirectoryResponse
     */
    public UpdateDirectoryResponse updateDirectory(UpdateDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateDirectory);
    }

    /**
     * 修改目录
     *
     * 修改目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDirectoryRequest 请求对象
     * @return SyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse>
     */
    public SyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectoryInvoker(
        UpdateDirectoryRequest request) {
        return new SyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse>(request,
            DataArtsStudioMeta.updateDirectory, hcClient);
    }

    /**
     * 修改作业名称
     *
     * 修改作业名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFactoryJobNameRequest 请求对象
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
     * @param UpdateFactoryJobNameRequest 请求对象
     * @return SyncInvoker<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse>
     */
    public SyncInvoker<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse> updateFactoryJobNameInvoker(
        UpdateFactoryJobNameRequest request) {
        return new SyncInvoker<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse>(request,
            DataArtsStudioMeta.updateFactoryJobName, hcClient);
    }

    /**
     * 修改数据标准
     *
     * 修改数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStandardRequest 请求对象
     * @return UpdateStandardResponse
     */
    public UpdateStandardResponse updateStandard(UpdateStandardRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateStandard);
    }

    /**
     * 修改数据标准
     *
     * 修改数据标准
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStandardRequest 请求对象
     * @return SyncInvoker<UpdateStandardRequest, UpdateStandardResponse>
     */
    public SyncInvoker<UpdateStandardRequest, UpdateStandardResponse> updateStandardInvoker(
        UpdateStandardRequest request) {
        return new SyncInvoker<UpdateStandardRequest, UpdateStandardResponse>(request,
            DataArtsStudioMeta.updateStandard, hcClient);
    }

    /**
     * 修改数据标准模板
     *
     * 修改数据标准模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStandardTemplateRequest 请求对象
     * @return UpdateStandardTemplateResponse
     */
    public UpdateStandardTemplateResponse updateStandardTemplate(UpdateStandardTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateStandardTemplate);
    }

    /**
     * 修改数据标准模板
     *
     * 修改数据标准模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStandardTemplateRequest 请求对象
     * @return SyncInvoker<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse>
     */
    public SyncInvoker<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse> updateStandardTemplateInvoker(
        UpdateStandardTemplateRequest request) {
        return new SyncInvoker<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse>(request,
            DataArtsStudioMeta.updateStandardTemplate, hcClient);
    }

    /**
     * 修改主题
     *
     * 修改主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubjectRequest 请求对象
     * @return UpdateSubjectResponse
     */
    public UpdateSubjectResponse updateSubject(UpdateSubjectRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSubject);
    }

    /**
     * 修改主题
     *
     * 修改主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubjectRequest 请求对象
     * @return SyncInvoker<UpdateSubjectRequest, UpdateSubjectResponse>
     */
    public SyncInvoker<UpdateSubjectRequest, UpdateSubjectResponse> updateSubjectInvoker(UpdateSubjectRequest request) {
        return new SyncInvoker<UpdateSubjectRequest, UpdateSubjectResponse>(request, DataArtsStudioMeta.updateSubject,
            hcClient);
    }

    /**
     * 修改主题(新)
     *
     * 修改主题(新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubjectNewRequest 请求对象
     * @return UpdateSubjectNewResponse
     */
    public UpdateSubjectNewResponse updateSubjectNew(UpdateSubjectNewRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateSubjectNew);
    }

    /**
     * 修改主题(新)
     *
     * 修改主题(新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubjectNewRequest 请求对象
     * @return SyncInvoker<UpdateSubjectNewRequest, UpdateSubjectNewResponse>
     */
    public SyncInvoker<UpdateSubjectNewRequest, UpdateSubjectNewResponse> updateSubjectNewInvoker(
        UpdateSubjectNewRequest request) {
        return new SyncInvoker<UpdateSubjectNewRequest, UpdateSubjectNewResponse>(request,
            DataArtsStudioMeta.updateSubjectNew, hcClient);
    }

    /**
     * 更新模型实体
     *
     * 更新一个模型实体，包括逻辑实体或物理数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableModelRequest 请求对象
     * @return UpdateTableModelResponse
     */
    public UpdateTableModelResponse updateTableModel(UpdateTableModelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateTableModel);
    }

    /**
     * 更新模型实体
     *
     * 更新一个模型实体，包括逻辑实体或物理数据表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableModelRequest 请求对象
     * @return SyncInvoker<UpdateTableModelRequest, UpdateTableModelResponse>
     */
    public SyncInvoker<UpdateTableModelRequest, UpdateTableModelResponse> updateTableModelInvoker(
        UpdateTableModelRequest request) {
        return new SyncInvoker<UpdateTableModelRequest, UpdateTableModelResponse>(request,
            DataArtsStudioMeta.updateTableModel, hcClient);
    }

    /**
     * 编辑采集任务
     *
     * 编辑采集任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskInfoRequest 请求对象
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
     * @param UpdateTaskInfoRequest 请求对象
     * @return SyncInvoker<UpdateTaskInfoRequest, UpdateTaskInfoResponse>
     */
    public SyncInvoker<UpdateTaskInfoRequest, UpdateTaskInfoResponse> updateTaskInfoInvoker(
        UpdateTaskInfoRequest request) {
        return new SyncInvoker<UpdateTaskInfoRequest, UpdateTaskInfoResponse>(request,
            DataArtsStudioMeta.updateTaskInfo, hcClient);
    }

    /**
     * 更新规则模板
     *
     * 更新规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateRequest 请求对象
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
     * @param UpdateTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateInvoker(
        UpdateTemplateRequest request) {
        return new SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>(request,
            DataArtsStudioMeta.updateTemplate, hcClient);
    }

    /**
     * 编辑工作空间用户或用户组
     *
     * 编辑工作空间用户或用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkSpaceUserOrGroupRequest 请求对象
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
     * @param UpdateWorkSpaceUserOrGroupRequest 请求对象
     * @return SyncInvoker<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse>
     */
    public SyncInvoker<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse> updateWorkSpaceUserOrGroupInvoker(
        UpdateWorkSpaceUserOrGroupRequest request) {
        return new SyncInvoker<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse>(request,
            DataArtsStudioMeta.updateWorkSpaceUserOrGroup, hcClient);
    }

    /**
     * 更新模型工作区
     *
     * 更新模型工作区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateWorkspace);
    }

    /**
     * 更新模型工作区
     *
     * 更新模型工作区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>(request,
            DataArtsStudioMeta.updateWorkspace, hcClient);
    }

    /**
     * API授权操作(授权/取消授权/申请/续约)
     *
     * API授权操作(授权/取消授权/申请/续约)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeActionApiToInstanceRequest 请求对象
     * @return AuthorizeActionApiToInstanceResponse
     */
    public AuthorizeActionApiToInstanceResponse authorizeActionApiToInstance(
        AuthorizeActionApiToInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.authorizeActionApiToInstance);
    }

    /**
     * API授权操作(授权/取消授权/申请/续约)
     *
     * API授权操作(授权/取消授权/申请/续约)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeActionApiToInstanceRequest 请求对象
     * @return SyncInvoker<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse>
     */
    public SyncInvoker<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse> authorizeActionApiToInstanceInvoker(
        AuthorizeActionApiToInstanceRequest request) {
        return new SyncInvoker<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse>(request,
            DataArtsStudioMeta.authorizeActionApiToInstance, hcClient);
    }

    /**
     * 批量授权API
     *
     * 批量授权API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeApiToInstanceRequest 请求对象
     * @return AuthorizeApiToInstanceResponse
     */
    public AuthorizeApiToInstanceResponse authorizeApiToInstance(AuthorizeApiToInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.authorizeApiToInstance);
    }

    /**
     * 批量授权API
     *
     * 批量授权API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeApiToInstanceRequest 请求对象
     * @return SyncInvoker<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse>
     */
    public SyncInvoker<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse> authorizeApiToInstanceInvoker(
        AuthorizeApiToInstanceRequest request) {
        return new SyncInvoker<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse>(request,
            DataArtsStudioMeta.authorizeApiToInstance, hcClient);
    }

    /**
     * 创建API
     *
     * 创建API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiRequest 请求对象
     * @return CreateApiResponse
     */
    public CreateApiResponse createApi(CreateApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.createApi);
    }

    /**
     * 创建API
     *
     * 创建API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiRequest 请求对象
     * @return SyncInvoker<CreateApiRequest, CreateApiResponse>
     */
    public SyncInvoker<CreateApiRequest, CreateApiResponse> createApiInvoker(CreateApiRequest request) {
        return new SyncInvoker<CreateApiRequest, CreateApiResponse>(request, DataArtsStudioMeta.createApi, hcClient);
    }

    /**
     * 调试API
     *
     * 调试API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugApiRequest 请求对象
     * @return DebugApiResponse
     */
    public DebugApiResponse debugApi(DebugApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.debugApi);
    }

    /**
     * 调试API
     *
     * 调试API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugApiRequest 请求对象
     * @return SyncInvoker<DebugApiRequest, DebugApiResponse>
     */
    public SyncInvoker<DebugApiRequest, DebugApiResponse> debugApiInvoker(DebugApiRequest request) {
        return new SyncInvoker<DebugApiRequest, DebugApiResponse>(request, DataArtsStudioMeta.debugApi, hcClient);
    }

    /**
     * 批量删除API
     *
     * 批量删除API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApiRequest 请求对象
     * @return DeleteApiResponse
     */
    public DeleteApiResponse deleteApi(DeleteApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.deleteApi);
    }

    /**
     * 批量删除API
     *
     * 批量删除API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApiRequest 请求对象
     * @return SyncInvoker<DeleteApiRequest, DeleteApiResponse>
     */
    public SyncInvoker<DeleteApiRequest, DeleteApiResponse> deleteApiInvoker(DeleteApiRequest request) {
        return new SyncInvoker<DeleteApiRequest, DeleteApiResponse>(request, DataArtsStudioMeta.deleteApi, hcClient);
    }

    /**
     * API操作(下线/停用/恢复)
     *
     * API操作(下线/停用/恢复)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteApiToInstanceRequest 请求对象
     * @return ExecuteApiToInstanceResponse
     */
    public ExecuteApiToInstanceResponse executeApiToInstance(ExecuteApiToInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.executeApiToInstance);
    }

    /**
     * API操作(下线/停用/恢复)
     *
     * API操作(下线/停用/恢复)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteApiToInstanceRequest 请求对象
     * @return SyncInvoker<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse>
     */
    public SyncInvoker<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse> executeApiToInstanceInvoker(
        ExecuteApiToInstanceRequest request) {
        return new SyncInvoker<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse>(request,
            DataArtsStudioMeta.executeApiToInstance, hcClient);
    }

    /**
     * 查询API列表
     *
     * 查询API列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisRequest 请求对象
     * @return ListApisResponse
     */
    public ListApisResponse listApis(ListApisRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listApis);
    }

    /**
     * 查询API列表
     *
     * 查询API列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisRequest 请求对象
     * @return SyncInvoker<ListApisRequest, ListApisResponse>
     */
    public SyncInvoker<ListApisRequest, ListApisResponse> listApisInvoker(ListApisRequest request) {
        return new SyncInvoker<ListApisRequest, ListApisResponse>(request, DataArtsStudioMeta.listApis, hcClient);
    }

    /**
     * 查看API不同操作对应的实例信息
     *
     * 查看API不同操作对应的实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceListRequest 请求对象
     * @return ListInstanceListResponse
     */
    public ListInstanceListResponse listInstanceList(ListInstanceListRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.listInstanceList);
    }

    /**
     * 查看API不同操作对应的实例信息
     *
     * 查看API不同操作对应的实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceListRequest 请求对象
     * @return SyncInvoker<ListInstanceListRequest, ListInstanceListResponse>
     */
    public SyncInvoker<ListInstanceListRequest, ListInstanceListResponse> listInstanceListInvoker(
        ListInstanceListRequest request) {
        return new SyncInvoker<ListInstanceListRequest, ListInstanceListResponse>(request,
            DataArtsStudioMeta.listInstanceList, hcClient);
    }

    /**
     * 发布/下线/停用/恢复API
     *
     * 发布/下线/停用/恢复API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishApiRequest 请求对象
     * @return PublishApiResponse
     */
    public PublishApiResponse publishApi(PublishApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.publishApi);
    }

    /**
     * 发布/下线/停用/恢复API
     *
     * 发布/下线/停用/恢复API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishApiRequest 请求对象
     * @return SyncInvoker<PublishApiRequest, PublishApiResponse>
     */
    public SyncInvoker<PublishApiRequest, PublishApiResponse> publishApiInvoker(PublishApiRequest request) {
        return new SyncInvoker<PublishApiRequest, PublishApiResponse>(request, DataArtsStudioMeta.publishApi, hcClient);
    }

    /**
     * 发布API
     *
     * 发布API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishApiToInstanceRequest 请求对象
     * @return PublishApiToInstanceResponse
     */
    public PublishApiToInstanceResponse publishApiToInstance(PublishApiToInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.publishApiToInstance);
    }

    /**
     * 发布API
     *
     * 发布API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishApiToInstanceRequest 请求对象
     * @return SyncInvoker<PublishApiToInstanceRequest, PublishApiToInstanceResponse>
     */
    public SyncInvoker<PublishApiToInstanceRequest, PublishApiToInstanceResponse> publishApiToInstanceInvoker(
        PublishApiToInstanceRequest request) {
        return new SyncInvoker<PublishApiToInstanceRequest, PublishApiToInstanceResponse>(request,
            DataArtsStudioMeta.publishApiToInstance, hcClient);
    }

    /**
     * 查看API调试信息
     *
     * 查看API调试信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDebugInfoRequest 请求对象
     * @return SearchDebugInfoResponse
     */
    public SearchDebugInfoResponse searchDebugInfo(SearchDebugInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchDebugInfo);
    }

    /**
     * 查看API调试信息
     *
     * 查看API调试信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchDebugInfoRequest 请求对象
     * @return SyncInvoker<SearchDebugInfoRequest, SearchDebugInfoResponse>
     */
    public SyncInvoker<SearchDebugInfoRequest, SearchDebugInfoResponse> searchDebugInfoInvoker(
        SearchDebugInfoRequest request) {
        return new SyncInvoker<SearchDebugInfoRequest, SearchDebugInfoResponse>(request,
            DataArtsStudioMeta.searchDebugInfo, hcClient);
    }

    /**
     * 查看API发布信息
     *
     * 查看API发布信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchPublishInfoRequest 请求对象
     * @return SearchPublishInfoResponse
     */
    public SearchPublishInfoResponse searchPublishInfo(SearchPublishInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.searchPublishInfo);
    }

    /**
     * 查看API发布信息
     *
     * 查看API发布信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchPublishInfoRequest 请求对象
     * @return SyncInvoker<SearchPublishInfoRequest, SearchPublishInfoResponse>
     */
    public SyncInvoker<SearchPublishInfoRequest, SearchPublishInfoResponse> searchPublishInfoInvoker(
        SearchPublishInfoRequest request) {
        return new SyncInvoker<SearchPublishInfoRequest, SearchPublishInfoResponse>(request,
            DataArtsStudioMeta.searchPublishInfo, hcClient);
    }

    /**
     * 查询API信息
     *
     * 查询API信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiRequest 请求对象
     * @return ShowApiResponse
     */
    public ShowApiResponse showApi(ShowApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.showApi);
    }

    /**
     * 查询API信息
     *
     * 查询API信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiRequest 请求对象
     * @return SyncInvoker<ShowApiRequest, ShowApiResponse>
     */
    public SyncInvoker<ShowApiRequest, ShowApiResponse> showApiInvoker(ShowApiRequest request) {
        return new SyncInvoker<ShowApiRequest, ShowApiResponse>(request, DataArtsStudioMeta.showApi, hcClient);
    }

    /**
     * 更新API
     *
     * 更新API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateApiRequest 请求对象
     * @return UpdateApiResponse
     */
    public UpdateApiResponse updateApi(UpdateApiRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsStudioMeta.updateApi);
    }

    /**
     * 更新API
     *
     * 更新API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateApiRequest 请求对象
     * @return SyncInvoker<UpdateApiRequest, UpdateApiResponse>
     */
    public SyncInvoker<UpdateApiRequest, UpdateApiResponse> updateApiInvoker(UpdateApiRequest request) {
        return new SyncInvoker<UpdateApiRequest, UpdateApiResponse>(request, DataArtsStudioMeta.updateApi, hcClient);
    }

}
