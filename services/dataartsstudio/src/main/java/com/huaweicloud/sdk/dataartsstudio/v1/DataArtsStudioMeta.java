package com.huaweicloud.sdk.dataartsstudio.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddTagToAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddTagToAssetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddWorkSpaceUsersRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AddWorkSpaceUsersResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.Api;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApiActionDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApiCatalogCreateParaDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApiCatalogDeleteParaDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApiCatalogUpdateParaDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApiMoveParaDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApiParaForAuthToInstance;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApiParaForAuthorizeToInstance;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApiTestDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApigChangeResourceReq;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApigDataSourceVo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApigDataSourcesVo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApigDelUserParams;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApigRoleVo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApigWorkspaceUserDto;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AppRequestDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.AppUpdateDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApprovalBatchParam;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApprovalInfoParam;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ApproverParam;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.BizCatalogVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BizMetricVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BulkSecurityLevel;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BusinessAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CatalogInfo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CatalogLevelVOList;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CatalogMoveParaDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CatalogParamsVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CategoryDetailVO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.CodeTableFieldValueUpdateVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CodeTableVO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateWorkspaceParams;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CustomizedFieldsVOList;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.DirectoryVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.EntityWithExtInfo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteTaskActionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteTaskActionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.GatewayDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.IdsParam;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.InitializeStandardTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.InitializeStandardTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.JobLogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.LinkAttributeAndElementVO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.MetadataCollectionTask;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MetricOpenSearchParams;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MigrateApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MigrateApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MigrateCatalogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.MigrateCatalogResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ModifyCustomizedFieldsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ModifyCustomizedFieldsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenApiParaForCheckMessage;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenApiParaForPublish;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenApplyIdsForApproveApply;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenBulkClassifications;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenClassification;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenEntitySearchRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OrderReq;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PayForDgcOneKeyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PayForDgcOneKeyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.QueryTaskRequest;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchParametersExt;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.StandElementFieldVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.StandElementFieldVOList;
import com.huaweicloud.sdk.dataartsstudio.v1.model.StandElementValueVOList;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SubjectParamsVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.TableModelUpdateVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.TableModelVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.TemplateListRO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.TemplateRO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.WorkspaceVO;

import java.util.List;

@SuppressWarnings("unchecked")
public class DataArtsStudioMeta {

    public static final HttpRequestDef<AddTagToAssetRequest, AddTagToAssetResponse> addTagToAsset =
        genForaddTagToAsset();

    private static HttpRequestDef<AddTagToAssetRequest, AddTagToAssetResponse> genForaddTagToAsset() {
        // basic
        HttpRequestDef.Builder<AddTagToAssetRequest, AddTagToAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddTagToAssetRequest.class, AddTagToAssetResponse.class)
                .withName("AddTagToAsset")
                .withUri("/v3/{project_id}/tags/{term_guid}/assignedentities")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("term_guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTagToAssetRequest::getTermGuid, (req, v) -> {
                req.setTermGuid(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTagToAssetRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CatalogInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogInfo.class),
            f -> f.withMarshaller(AddTagToAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse> addWorkSpaceUsers =
        genForaddWorkSpaceUsers();

    private static HttpRequestDef<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse> genForaddWorkSpaceUsers() {
        // basic
        HttpRequestDef.Builder<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddWorkSpaceUsersRequest.class, AddWorkSpaceUsersResponse.class)
                .withName("AddWorkSpaceUsers")
                .withUri("/v2/{project_id}/{workspace_id}/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddWorkSpaceUsersRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<ApigWorkspaceUserDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigWorkspaceUserDto.class),
            f -> f.withMarshaller(AddWorkSpaceUsersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse> associateClassificationToEntity =
        genForassociateClassificationToEntity();

    private static HttpRequestDef<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse> genForassociateClassificationToEntity() {
        // basic
        HttpRequestDef.Builder<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateClassificationToEntityRequest.class,
                    AssociateClassificationToEntityResponse.class)
                .withName("AssociateClassificationToEntity")
                .withUri("/v3/{project_id}/asset/entities/guid/{guid}/classification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateClassificationToEntityRequest::getGuid, (req, v) -> {
                req.setGuid(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateClassificationToEntityRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<OpenClassification>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenClassification.class),
            f -> f.withMarshaller(AssociateClassificationToEntityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse> associateSecurityLevelToEntitie =
        genForassociateSecurityLevelToEntitie();

    private static HttpRequestDef<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse> genForassociateSecurityLevelToEntitie() {
        // basic
        HttpRequestDef.Builder<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AssociateSecurityLevelToEntitieRequest.class,
                    AssociateSecurityLevelToEntitieResponse.class)
                .withName("AssociateSecurityLevelToEntitie")
                .withUri("/v3/{project_id}/asset/entities/guid/{guid}/security-level")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSecurityLevelToEntitieRequest::getGuid, (req, v) -> {
                req.setGuid(v);
            }));
        builder.<String>withRequestField("security-level",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSecurityLevelToEntitieRequest::getSecurityLevel, (req, v) -> {
                req.setSecurityLevel(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSecurityLevelToEntitieRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchApproveApplyRequest, BatchApproveApplyResponse> batchApproveApply =
        genForbatchApproveApply();

    private static HttpRequestDef<BatchApproveApplyRequest, BatchApproveApplyResponse> genForbatchApproveApply() {
        // basic
        HttpRequestDef.Builder<BatchApproveApplyRequest, BatchApproveApplyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchApproveApplyRequest.class, BatchApproveApplyResponse.class)
                .withName("BatchApproveApply")
                .withUri("/v1/{project_id}/service/applys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchApproveApplyRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<OpenApplyIdsForApproveApply>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenApplyIdsForApproveApply.class),
            f -> f.withMarshaller(BatchApproveApplyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse> batchAssociateClassificationToEntities =
        genForbatchAssociateClassificationToEntities();

    private static HttpRequestDef<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse> genForbatchAssociateClassificationToEntities() {
        // basic
        HttpRequestDef.Builder<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAssociateClassificationToEntitiesRequest.class,
                    BatchAssociateClassificationToEntitiesResponse.class)
                .withName("BatchAssociateClassificationToEntities")
                .withUri("/v3/{project_id}/asset/entities/classification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateClassificationToEntitiesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<OpenBulkClassifications>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenBulkClassifications.class),
            f -> f.withMarshaller(BatchAssociateClassificationToEntitiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse> batchAssociateSecurityLevelToEntities =
        genForbatchAssociateSecurityLevelToEntities();

    private static HttpRequestDef<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse> genForbatchAssociateSecurityLevelToEntities() {
        // basic
        HttpRequestDef.Builder<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchAssociateSecurityLevelToEntitiesRequest.class,
                    BatchAssociateSecurityLevelToEntitiesResponse.class)
                .withName("BatchAssociateSecurityLevelToEntities")
                .withUri("/v3/{project_id}/asset/entities/security-level")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateSecurityLevelToEntitiesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<BulkSecurityLevel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BulkSecurityLevel.class),
            f -> f.withMarshaller(BatchAssociateSecurityLevelToEntitiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse> batchDeleteTemplates =
        genForbatchDeleteTemplates();

    private static HttpRequestDef<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse> genForbatchDeleteTemplates() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteTemplatesRequest.class, BatchDeleteTemplatesResponse.class)
            .withName("BatchDeleteTemplates")
            .withUri("/v2/{project_id}/quality/rule-templates/batch-delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTemplatesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<TemplateListRO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateListRO.class),
            f -> f.withMarshaller(BatchDeleteTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchOfflineRequest, BatchOfflineResponse> batchOffline = genForbatchOffline();

    private static HttpRequestDef<BatchOfflineRequest, BatchOfflineResponse> genForbatchOffline() {
        // basic
        HttpRequestDef.Builder<BatchOfflineRequest, BatchOfflineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchOfflineRequest.class, BatchOfflineResponse.class)
                .withName("BatchOffline")
                .withUri("/v2/{project_id}/design/approvals/batch-offline")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchOfflineRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApprovalBatchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApprovalBatchParam.class),
            f -> f.withMarshaller(BatchOfflineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchPublishRequest, BatchPublishResponse> batchPublish = genForbatchPublish();

    private static HttpRequestDef<BatchPublishRequest, BatchPublishResponse> genForbatchPublish() {
        // basic
        HttpRequestDef.Builder<BatchPublishRequest, BatchPublishResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchPublishRequest.class, BatchPublishResponse.class)
                .withName("BatchPublish")
                .withUri("/v2/{project_id}/design/approvals/batch-publish")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchPublishRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApprovalBatchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApprovalBatchParam.class),
            f -> f.withMarshaller(BatchPublishRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeCatalogRequest, ChangeCatalogResponse> changeCatalog =
        genForchangeCatalog();

    private static HttpRequestDef<ChangeCatalogRequest, ChangeCatalogResponse> genForchangeCatalog() {
        // basic
        HttpRequestDef.Builder<ChangeCatalogRequest, ChangeCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeCatalogRequest.class, ChangeCatalogResponse.class)
                .withName("ChangeCatalog")
                .withUri("/v2/{project_id}/design/biz/catalogs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeCatalogRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<BizCatalogVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizCatalogVO.class),
            f -> f.withMarshaller(ChangeCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeResourceRequest, ChangeResourceResponse> changeResource =
        genForchangeResource();

    private static HttpRequestDef<ChangeResourceRequest, ChangeResourceResponse> genForchangeResource() {
        // basic
        HttpRequestDef.Builder<ChangeResourceRequest, ChangeResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeResourceRequest.class, ChangeResourceResponse.class)
                .withName("ChangeResource")
                .withUri("/v1/{project_id}/change-resource")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ApigChangeResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigChangeResourceReq.class),
            f -> f.withMarshaller(ChangeResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSubjectsRequest, ChangeSubjectsResponse> changeSubjects =
        genForchangeSubjects();

    private static HttpRequestDef<ChangeSubjectsRequest, ChangeSubjectsResponse> genForchangeSubjects() {
        // basic
        HttpRequestDef.Builder<ChangeSubjectsRequest, ChangeSubjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeSubjectsRequest.class, ChangeSubjectsResponse.class)
                .withName("ChangeSubjects")
                .withUri("/v2/{project_id}/design/subject-levels")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeSubjectsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CatalogLevelVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogLevelVOList.class),
            f -> f.withMarshaller(ChangeSubjectsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDimensionStatusRequest, CheckDimensionStatusResponse> checkDimensionStatus =
        genForcheckDimensionStatus();

    private static HttpRequestDef<CheckDimensionStatusRequest, CheckDimensionStatusResponse> genForcheckDimensionStatus() {
        // basic
        HttpRequestDef.Builder<CheckDimensionStatusRequest, CheckDimensionStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckDimensionStatusRequest.class, CheckDimensionStatusResponse.class)
            .withName("CheckDimensionStatus")
            .withUri("/v2/{project_id}/design/dimension/database")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDimensionStatusRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse> checkFactLogicTableStatus =
        genForcheckFactLogicTableStatus();

    private static HttpRequestDef<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse> genForcheckFactLogicTableStatus() {
        // basic
        HttpRequestDef.Builder<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CheckFactLogicTableStatusRequest.class,
                    CheckFactLogicTableStatusResponse.class)
                .withName("CheckFactLogicTableStatus")
                .withUri("/v2/{project_id}/design/fact-logic-tables/database")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckFactLogicTableStatusRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmApprovalsRequest, ConfirmApprovalsResponse> confirmApprovals =
        genForconfirmApprovals();

    private static HttpRequestDef<ConfirmApprovalsRequest, ConfirmApprovalsResponse> genForconfirmApprovals() {
        // basic
        HttpRequestDef.Builder<ConfirmApprovalsRequest, ConfirmApprovalsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ConfirmApprovalsRequest.class, ConfirmApprovalsResponse.class)
                .withName("ConfirmApprovals")
                .withUri("/v2/{project_id}/design/approvals/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ConfirmApprovalsRequest.ActionIdEnum>withRequestField("action-id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmApprovalsRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ConfirmApprovalsRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmApprovalsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApprovalInfoParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApprovalInfoParam.class),
            f -> f.withMarshaller(ConfirmApprovalsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmMessageRequest, ConfirmMessageResponse> confirmMessage =
        genForconfirmMessage();

    private static HttpRequestDef<ConfirmMessageRequest, ConfirmMessageResponse> genForconfirmMessage() {
        // basic
        HttpRequestDef.Builder<ConfirmMessageRequest, ConfirmMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmMessageRequest.class, ConfirmMessageResponse.class)
                .withName("ConfirmMessage")
                .withUri("/v1/{project_id}/service/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmMessageRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<OpenApiParaForCheckMessage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenApiParaForCheckMessage.class),
            f -> f.withMarshaller(ConfirmMessageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountAllModelsRequest, CountAllModelsResponse> countAllModels =
        genForcountAllModels();

    private static HttpRequestDef<CountAllModelsRequest, CountAllModelsResponse> genForcountAllModels() {
        // basic
        HttpRequestDef.Builder<CountAllModelsRequest, CountAllModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountAllModelsRequest.class, CountAllModelsResponse.class)
                .withName("CountAllModels")
                .withUri("/v2/{project_id}/design/models/statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAllModelsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountOverviewsRequest, CountOverviewsResponse> countOverviews =
        genForcountOverviews();

    private static HttpRequestDef<CountOverviewsRequest, CountOverviewsResponse> genForcountOverviews() {
        // basic
        HttpRequestDef.Builder<CountOverviewsRequest, CountOverviewsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountOverviewsRequest.class, CountOverviewsResponse.class)
                .withName("CountOverviews")
                .withUri("/v2/{project_id}/design/definitions/statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountOverviewsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountStandardsRequest, CountStandardsResponse> countStandards =
        genForcountStandards();

    private static HttpRequestDef<CountStandardsRequest, CountStandardsResponse> genForcountStandards() {
        // basic
        HttpRequestDef.Builder<CountStandardsRequest, CountStandardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountStandardsRequest.class, CountStandardsResponse.class)
                .withName("CountStandards")
                .withUri("/v2/{project_id}/design/definitions/statistic/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountStandardsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountStandardsRequest::getBizType, (req, v) -> {
                req.setBizType(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountStandardsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountTableModelsRequest, CountTableModelsResponse> countTableModels =
        genForcountTableModels();

    private static HttpRequestDef<CountTableModelsRequest, CountTableModelsResponse> genForcountTableModels() {
        // basic
        HttpRequestDef.Builder<CountTableModelsRequest, CountTableModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountTableModelsRequest.class, CountTableModelsResponse.class)
                .withName("CountTableModels")
                .withUri("/v2/{project_id}/design/table-models/statistic")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("model_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(CountTableModelsRequest::getModelId, (req, v) -> {
                req.setModelId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTableModelsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v1/{project_id}/service/apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CreateAppRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(CreateAppRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<AppRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AppRequestDTO.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApproverRequest, CreateApproverResponse> createApprover =
        genForcreateApprover();

    private static HttpRequestDef<CreateApproverRequest, CreateApproverResponse> genForcreateApprover() {
        // basic
        HttpRequestDef.Builder<CreateApproverRequest, CreateApproverResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApproverRequest.class, CreateApproverResponse.class)
                .withName("CreateApprover")
                .withUri("/v2/{project_id}/design/approvals/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApproverRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApproverParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApproverParam.class),
            f -> f.withMarshaller(CreateApproverRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBizMetricRequest, CreateBizMetricResponse> createBizMetric =
        genForcreateBizMetric();

    private static HttpRequestDef<CreateBizMetricRequest, CreateBizMetricResponse> genForcreateBizMetric() {
        // basic
        HttpRequestDef.Builder<CreateBizMetricRequest, CreateBizMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBizMetricRequest.class, CreateBizMetricResponse.class)
                .withName("CreateBizMetric")
                .withUri("/v2/{project_id}/design/biz-metrics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBizMetricRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<BizMetricVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizMetricVO.class),
            f -> f.withMarshaller(CreateBizMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCatalogRequest, CreateCatalogResponse> createCatalog =
        genForcreateCatalog();

    private static HttpRequestDef<CreateCatalogRequest, CreateCatalogResponse> genForcreateCatalog() {
        // basic
        HttpRequestDef.Builder<CreateCatalogRequest, CreateCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCatalogRequest.class, CreateCatalogResponse.class)
                .withName("CreateCatalog")
                .withUri("/v2/{project_id}/design/biz/catalogs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCatalogRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<BizCatalogVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizCatalogVO.class),
            f -> f.withMarshaller(CreateCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCodeTableRequest, CreateCodeTableResponse> createCodeTable =
        genForcreateCodeTable();

    private static HttpRequestDef<CreateCodeTableRequest, CreateCodeTableResponse> genForcreateCodeTable() {
        // basic
        HttpRequestDef.Builder<CreateCodeTableRequest, CreateCodeTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCodeTableRequest.class, CreateCodeTableResponse.class)
                .withName("CreateCodeTable")
                .withUri("/v2/{project_id}/design/code-tables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCodeTableRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CodeTableVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeTableVO.class),
            f -> f.withMarshaller(CreateCodeTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionsRequest, CreateConnectionsResponse> createConnections =
        genForcreateConnections();

    private static HttpRequestDef<CreateConnectionsRequest, CreateConnectionsResponse> genForcreateConnections() {
        // basic
        HttpRequestDef.Builder<CreateConnectionsRequest, CreateConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectionsRequest.class, CreateConnectionsResponse.class)
                .withName("CreateConnections")
                .withUri("/v1/{project_id}/data-connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectionsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApigDataSourcesVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigDataSourcesVo.class),
            f -> f.withMarshaller(CreateConnectionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDirectoryRequest, CreateDirectoryResponse> createDirectory =
        genForcreateDirectory();

    private static HttpRequestDef<CreateDirectoryRequest, CreateDirectoryResponse> genForcreateDirectory() {
        // basic
        HttpRequestDef.Builder<CreateDirectoryRequest, CreateDirectoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDirectoryRequest.class, CreateDirectoryResponse.class)
                .withName("CreateDirectory")
                .withUri("/v2/{project_id}/design/directorys")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDirectoryRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<DirectoryVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DirectoryVO.class),
            f -> f.withMarshaller(CreateDirectoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse> createManagerWorkSpace =
        genForcreateManagerWorkSpace();

    private static HttpRequestDef<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse> genForcreateManagerWorkSpace() {
        // basic
        HttpRequestDef.Builder<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateManagerWorkSpaceRequest.class, CreateManagerWorkSpaceResponse.class)
            .withName("CreateManagerWorkSpace")
            .withUri("/v1/{project_id}/workspaces/{instance_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateManagerWorkSpaceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateWorkspaceParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkspaceParams.class),
            f -> f.withMarshaller(CreateManagerWorkSpaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse> createOrUpdateAsset =
        genForcreateOrUpdateAsset();

    private static HttpRequestDef<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse> genForcreateOrUpdateAsset() {
        // basic
        HttpRequestDef.Builder<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrUpdateAssetRequest.class, CreateOrUpdateAssetResponse.class)
                .withName("CreateOrUpdateAsset")
                .withUri("/v3/{project_id}/asset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrUpdateAssetRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<EntityWithExtInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EntityWithExtInfo.class),
            f -> f.withMarshaller(CreateOrUpdateAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceCatalogRequest, CreateServiceCatalogResponse> createServiceCatalog =
        genForcreateServiceCatalog();

    private static HttpRequestDef<CreateServiceCatalogRequest, CreateServiceCatalogResponse> genForcreateServiceCatalog() {
        // basic
        HttpRequestDef.Builder<CreateServiceCatalogRequest, CreateServiceCatalogResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateServiceCatalogRequest.class, CreateServiceCatalogResponse.class)
            .withName("CreateServiceCatalog")
            .withUri("/v1/{project_id}/service/servicecatalogs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateServiceCatalogRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApiCatalogCreateParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCatalogCreateParaDTO.class),
            f -> f.withMarshaller(CreateServiceCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStandardRequest, CreateStandardResponse> createStandard =
        genForcreateStandard();

    private static HttpRequestDef<CreateStandardRequest, CreateStandardResponse> genForcreateStandard() {
        // basic
        HttpRequestDef.Builder<CreateStandardRequest, CreateStandardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStandardRequest.class, CreateStandardResponse.class)
                .withName("CreateStandard")
                .withUri("/v2/{project_id}/design/standards")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStandardRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<StandElementValueVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementValueVOList.class),
            f -> f.withMarshaller(CreateStandardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStandardTemplateRequest, CreateStandardTemplateResponse> createStandardTemplate =
        genForcreateStandardTemplate();

    private static HttpRequestDef<CreateStandardTemplateRequest, CreateStandardTemplateResponse> genForcreateStandardTemplate() {
        // basic
        HttpRequestDef.Builder<CreateStandardTemplateRequest, CreateStandardTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateStandardTemplateRequest.class, CreateStandardTemplateResponse.class)
            .withName("CreateStandardTemplate")
            .withUri("/v2/{project_id}/design/standards/templates")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStandardTemplateRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<StandElementFieldVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementFieldVO.class),
            f -> f.withMarshaller(CreateStandardTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubjectRequest, CreateSubjectResponse> createSubject =
        genForcreateSubject();

    private static HttpRequestDef<CreateSubjectRequest, CreateSubjectResponse> genForcreateSubject() {
        // basic
        HttpRequestDef.Builder<CreateSubjectRequest, CreateSubjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubjectRequest.class, CreateSubjectResponse.class)
                .withName("CreateSubject")
                .withUri("/v2/{project_id}/design/subjects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubjectRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CatalogParamsVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogParamsVO.class),
            f -> f.withMarshaller(CreateSubjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubjectNewRequest, CreateSubjectNewResponse> createSubjectNew =
        genForcreateSubjectNew();

    private static HttpRequestDef<CreateSubjectNewRequest, CreateSubjectNewResponse> genForcreateSubjectNew() {
        // basic
        HttpRequestDef.Builder<CreateSubjectNewRequest, CreateSubjectNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubjectNewRequest.class, CreateSubjectNewResponse.class)
                .withName("CreateSubjectNew")
                .withUri("/v3/{project_id}/design/subjects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubjectNewRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<SubjectParamsVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubjectParamsVO.class),
            f -> f.withMarshaller(CreateSubjectNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableModelRequest, CreateTableModelResponse> createTableModel =
        genForcreateTableModel();

    private static HttpRequestDef<CreateTableModelRequest, CreateTableModelResponse> genForcreateTableModel() {
        // basic
        HttpRequestDef.Builder<CreateTableModelRequest, CreateTableModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTableModelRequest.class, CreateTableModelResponse.class)
                .withName("CreateTableModel")
                .withUri("/v2/{project_id}/design/table-model")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableModelRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<TableModelVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableModelVO.class),
            f -> f.withMarshaller(CreateTableModelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v3/{project_id}/metadata/tasks/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<MetadataCollectionTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetadataCollectionTask.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForcreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForcreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v2/{project_id}/quality/rule-templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTemplateRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<TemplateRO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateRO.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspace =
        genForcreateWorkspace();

    private static HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> genForcreateWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateWorkspaceRequest, CreateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkspaceRequest.class, CreateWorkspaceResponse.class)
                .withName("CreateWorkspace")
                .withUri("/v2/{project_id}/design/workspaces")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<WorkspaceVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkspaceVO.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugDataconnectionRequest, DebugDataconnectionResponse> debugDataconnection =
        genFordebugDataconnection();

    private static HttpRequestDef<DebugDataconnectionRequest, DebugDataconnectionResponse> genFordebugDataconnection() {
        // basic
        HttpRequestDef.Builder<DebugDataconnectionRequest, DebugDataconnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugDataconnectionRequest.class, DebugDataconnectionResponse.class)
                .withName("DebugDataconnection")
                .withUri("/v1/{project_id}/data-connections/validation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugDataconnectionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApigDataSourceVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigDataSourceVo.class),
            f -> f.withMarshaller(DebugDataconnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genFordeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genFordeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v1/{project_id}/service/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<DeleteAppRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAppRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(DeleteAppRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApproverRequest, DeleteApproverResponse> deleteApprover =
        genFordeleteApprover();

    private static HttpRequestDef<DeleteApproverRequest, DeleteApproverResponse> genFordeleteApprover() {
        // basic
        HttpRequestDef.Builder<DeleteApproverRequest, DeleteApproverResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApproverRequest.class, DeleteApproverResponse.class)
                .withName("DeleteApprover")
                .withUri("/v2/{project_id}/design/approvals/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("approver_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApproverRequest::getApproverIds, (req, v) -> {
                req.setApproverIds(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApproverRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> deleteAsset = genFordeleteAsset();

    private static HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> genFordeleteAsset() {
        // basic
        HttpRequestDef.Builder<DeleteAssetRequest, DeleteAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetRequest.class, DeleteAssetResponse.class)
                .withName("DeleteAsset")
                .withUri("/v3/{project_id}/asset/{guid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getGuid, (req, v) -> {
                req.setGuid(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBizMetricRequest, DeleteBizMetricResponse> deleteBizMetric =
        genFordeleteBizMetric();

    private static HttpRequestDef<DeleteBizMetricRequest, DeleteBizMetricResponse> genFordeleteBizMetric() {
        // basic
        HttpRequestDef.Builder<DeleteBizMetricRequest, DeleteBizMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBizMetricRequest.class, DeleteBizMetricResponse.class)
                .withName("DeleteBizMetric")
                .withUri("/v2/{project_id}/design/biz-metrics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBizMetricRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteBizMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalog =
        genFordeleteCatalog();

    private static HttpRequestDef<DeleteCatalogRequest, DeleteCatalogResponse> genFordeleteCatalog() {
        // basic
        HttpRequestDef.Builder<DeleteCatalogRequest, DeleteCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCatalogRequest.class, DeleteCatalogResponse.class)
                .withName("DeleteCatalog")
                .withUri("/v2/{project_id}/design/biz/catalogs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCatalogRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse> deleteClassificationFromEntities =
        genFordeleteClassificationFromEntities();

    private static HttpRequestDef<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse> genFordeleteClassificationFromEntities() {
        // basic
        HttpRequestDef.Builder<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    DeleteClassificationFromEntitiesRequest.class,
                    DeleteClassificationFromEntitiesResponse.class)
                .withName("DeleteClassificationFromEntities")
                .withUri("/v3/{project_id}/asset/entities/guid/{guid}/classification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClassificationFromEntitiesRequest::getGuid, (req, v) -> {
                req.setGuid(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClassificationFromEntitiesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<OpenClassification>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenClassification.class),
            f -> f.withMarshaller(DeleteClassificationFromEntitiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCodeTableRequest, DeleteCodeTableResponse> deleteCodeTable =
        genFordeleteCodeTable();

    private static HttpRequestDef<DeleteCodeTableRequest, DeleteCodeTableResponse> genFordeleteCodeTable() {
        // basic
        HttpRequestDef.Builder<DeleteCodeTableRequest, DeleteCodeTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCodeTableRequest.class, DeleteCodeTableResponse.class)
                .withName("DeleteCodeTable")
                .withUri("/v2/{project_id}/design/code-tables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCodeTableRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteCodeTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataconnectionRequest, DeleteDataconnectionResponse> deleteDataconnection =
        genFordeleteDataconnection();

    private static HttpRequestDef<DeleteDataconnectionRequest, DeleteDataconnectionResponse> genFordeleteDataconnection() {
        // basic
        HttpRequestDef.Builder<DeleteDataconnectionRequest, DeleteDataconnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDataconnectionRequest.class, DeleteDataconnectionResponse.class)
            .withName("DeleteDataconnection")
            .withUri("/v1/{project_id}/data-connections/{data_connection_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataconnectionRequest::getDataConnectionId, (req, v) -> {
                req.setDataConnectionId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataconnectionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectory =
        genFordeleteDirectory();

    private static HttpRequestDef<DeleteDirectoryRequest, DeleteDirectoryResponse> genFordeleteDirectory() {
        // basic
        HttpRequestDef.Builder<DeleteDirectoryRequest, DeleteDirectoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDirectoryRequest.class, DeleteDirectoryResponse.class)
                .withName("DeleteDirectory")
                .withUri("/v2/{project_id}/design/directorys")
                .withContentType("application/json");

        // requests
        builder.<List<Long>>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteDirectoryRequest::getIds, (req, v) -> {
                req.setIds(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDirectoryRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse> deleteSecurityLevelFromEntity =
        genFordeleteSecurityLevelFromEntity();

    private static HttpRequestDef<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse> genFordeleteSecurityLevelFromEntity() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSecurityLevelFromEntityRequest.class,
                    DeleteSecurityLevelFromEntityResponse.class)
                .withName("DeleteSecurityLevelFromEntity")
                .withUri("/v3/{project_id}/asset/entities/guid/{guid}/security-level")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityLevelFromEntityRequest::getGuid, (req, v) -> {
                req.setGuid(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityLevelFromEntityRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> deleteServiceCatalog =
        genFordeleteServiceCatalog();

    private static HttpRequestDef<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> genFordeleteServiceCatalog() {
        // basic
        HttpRequestDef.Builder<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteServiceCatalogRequest.class, DeleteServiceCatalogResponse.class)
            .withName("DeleteServiceCatalog")
            .withUri("/v1/{project_id}/service/servicecatalogs/batch-delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceCatalogRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApiCatalogDeleteParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCatalogDeleteParaDTO.class),
            f -> f.withMarshaller(DeleteServiceCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStandardRequest, DeleteStandardResponse> deleteStandard =
        genFordeleteStandard();

    private static HttpRequestDef<DeleteStandardRequest, DeleteStandardResponse> genFordeleteStandard() {
        // basic
        HttpRequestDef.Builder<DeleteStandardRequest, DeleteStandardResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStandardRequest.class, DeleteStandardResponse.class)
                .withName("DeleteStandard")
                .withUri("/v2/{project_id}/design/standards")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStandardRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteStandardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse> deleteStandardTemplate =
        genFordeleteStandardTemplate();

    private static HttpRequestDef<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse> genFordeleteStandardTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStandardTemplateRequest.class, DeleteStandardTemplateResponse.class)
            .withName("DeleteStandardTemplate")
            .withUri("/v2/{project_id}/design/standards/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStandardTemplateRequest::getIds, (req, v) -> {
                req.setIds(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStandardTemplateRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubjectRequest, DeleteSubjectResponse> deleteSubject =
        genFordeleteSubject();

    private static HttpRequestDef<DeleteSubjectRequest, DeleteSubjectResponse> genFordeleteSubject() {
        // basic
        HttpRequestDef.Builder<DeleteSubjectRequest, DeleteSubjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubjectRequest.class, DeleteSubjectResponse.class)
                .withName("DeleteSubject")
                .withUri("/v2/{project_id}/design/subjects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubjectRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteSubjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubjectNewRequest, DeleteSubjectNewResponse> deleteSubjectNew =
        genFordeleteSubjectNew();

    private static HttpRequestDef<DeleteSubjectNewRequest, DeleteSubjectNewResponse> genFordeleteSubjectNew() {
        // basic
        HttpRequestDef.Builder<DeleteSubjectNewRequest, DeleteSubjectNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubjectNewRequest.class, DeleteSubjectNewResponse.class)
                .withName("DeleteSubjectNew")
                .withUri("/v3/{project_id}/design/subjects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubjectNewRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteSubjectNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableModelRequest, DeleteTableModelResponse> deleteTableModel =
        genFordeleteTableModel();

    private static HttpRequestDef<DeleteTableModelRequest, DeleteTableModelResponse> genFordeleteTableModel() {
        // basic
        HttpRequestDef.Builder<DeleteTableModelRequest, DeleteTableModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTableModelRequest.class, DeleteTableModelResponse.class)
                .withName("DeleteTableModel")
                .withUri("/v2/{project_id}/design/table-model")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableModelRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteTableModelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskInfoRequest, DeleteTaskInfoResponse> deleteTaskInfo =
        genFordeleteTaskInfo();

    private static HttpRequestDef<DeleteTaskInfoRequest, DeleteTaskInfoResponse> genFordeleteTaskInfo() {
        // basic
        HttpRequestDef.Builder<DeleteTaskInfoRequest, DeleteTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskInfoRequest.class, DeleteTaskInfoResponse.class)
                .withName("DeleteTaskInfo")
                .withUri("/v3/{project_id}/metadata/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskInfoRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskInfoRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspacesRequest, DeleteWorkspacesResponse> deleteWorkspaces =
        genFordeleteWorkspaces();

    private static HttpRequestDef<DeleteWorkspacesRequest, DeleteWorkspacesResponse> genFordeleteWorkspaces() {
        // basic
        HttpRequestDef.Builder<DeleteWorkspacesRequest, DeleteWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkspacesRequest.class, DeleteWorkspacesResponse.class)
                .withName("DeleteWorkspaces")
                .withUri("/v2/{project_id}/design/workspaces")
                .withContentType("application/json");

        // requests
        builder.<List<Long>>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteWorkspacesRequest::getIds, (req, v) -> {
                req.setIds(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspacesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse> deleteWorkspaceusers =
        genFordeleteWorkspaceusers();

    private static HttpRequestDef<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse> genFordeleteWorkspaceusers() {
        // basic
        HttpRequestDef.Builder<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteWorkspaceusersRequest.class, DeleteWorkspaceusersResponse.class)
            .withName("DeleteWorkspaceusers")
            .withUri("/v2/{project_id}/{workspace_id}/delete-users")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspaceusersRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<ApigDelUserParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigDelUserParams.class),
            f -> f.withMarshaller(DeleteWorkspaceusersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteTaskActionRequest, ExecuteTaskActionResponse> executeTaskAction =
        genForexecuteTaskAction();

    private static HttpRequestDef<ExecuteTaskActionRequest, ExecuteTaskActionResponse> genForexecuteTaskAction() {
        // basic
        HttpRequestDef.Builder<ExecuteTaskActionRequest, ExecuteTaskActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteTaskActionRequest.class, ExecuteTaskActionResponse.class)
                .withName("ExecuteTaskAction")
                .withUri("/v3/{project_id}/metadata/tasks/{task_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteTaskActionRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteTaskActionRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteTaskActionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportResultRequest, ImportResultResponse> importResult = genForimportResult();

    private static HttpRequestDef<ImportResultRequest, ImportResultResponse> genForimportResult() {
        // basic
        HttpRequestDef.Builder<ImportResultRequest, ImportResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ImportResultRequest.class, ImportResultResponse.class)
                .withName("ImportResult")
                .withUri("/v2/{project_id}/design/catelogs/process-import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportResultRequest::getUuid, (req, v) -> {
                req.setUuid(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportResultRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse> initializeStandardTemplate =
        genForinitializeStandardTemplate();

    private static HttpRequestDef<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse> genForinitializeStandardTemplate() {
        // basic
        HttpRequestDef.Builder<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    InitializeStandardTemplateRequest.class,
                    InitializeStandardTemplateResponse.class)
                .withName("InitializeStandardTemplate")
                .withUri("/v2/{project_id}/design/standards/templates/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("action-id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InitializeStandardTemplateRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InitializeStandardTemplateRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<StandElementFieldVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementFieldVOList.class),
            f -> f.withMarshaller(InitializeStandardTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse> listAggregationLogicTables =
        genForlistAggregationLogicTables();

    private static HttpRequestDef<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse> genForlistAggregationLogicTables() {
        // basic
        HttpRequestDef.Builder<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAggregationLogicTablesRequest.class,
                    ListAggregationLogicTablesResponse.class)
                .withName("ListAggregationLogicTables")
                .withUri("/v2/{project_id}/design/aggregation-logic-tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<ListAggregationLogicTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAggregationLogicTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListAggregationLogicTablesRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAggregationLogicTablesRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getSyncStatus, (req, v) -> {
                req.setSyncStatus(v);
            }));
        builder.<List<ListAggregationLogicTablesRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getSyncKey, (req, v) -> {
                req.setSyncKey(v);
            }));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getL3Id, (req, v) -> {
                req.setL3Id(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getBizCatalogId, (req, v) -> {
                req.setBizCatalogId(v);
            }));
        builder.<Boolean>withRequestField("auto_generate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getAutoGenerate, (req, v) -> {
                req.setAutoGenerate(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllCatalogListRequest, ListAllCatalogListResponse> listAllCatalogList =
        genForlistAllCatalogList();

    private static HttpRequestDef<ListAllCatalogListRequest, ListAllCatalogListResponse> genForlistAllCatalogList() {
        // basic
        HttpRequestDef.Builder<ListAllCatalogListRequest, ListAllCatalogListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllCatalogListRequest.class, ListAllCatalogListResponse.class)
                .withName("ListAllCatalogList")
                .withUri("/v1/{project_id}/service/servicecatalogs/{catalog_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("catalog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllCatalogListRequest::getCatalogId, (req, v) -> {
                req.setCatalogId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllCatalogListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllCatalogListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllCatalogListRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllStandardsRequest, ListAllStandardsResponse> listAllStandards =
        genForlistAllStandards();

    private static HttpRequestDef<ListAllStandardsRequest, ListAllStandardsResponse> genForlistAllStandards() {
        // basic
        HttpRequestDef.Builder<ListAllStandardsRequest, ListAllStandardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllStandardsRequest.class, ListAllStandardsResponse.class)
                .withName("ListAllStandards")
                .withUri("/v2/{project_id}/design/standards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("directory_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getDirectoryId, (req, v) -> {
                req.setDirectoryId(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiCatalogListRequest, ListApiCatalogListResponse> listApiCatalogList =
        genForlistApiCatalogList();

    private static HttpRequestDef<ListApiCatalogListRequest, ListApiCatalogListResponse> genForlistApiCatalogList() {
        // basic
        HttpRequestDef.Builder<ListApiCatalogListRequest, ListApiCatalogListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiCatalogListRequest.class, ListApiCatalogListResponse.class)
                .withName("ListApiCatalogList")
                .withUri("/v1/{project_id}/service/servicecatalogs/{catalog_id}/apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("catalog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiCatalogListRequest::getCatalogId, (req, v) -> {
                req.setCatalogId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiCatalogListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiCatalogListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiCatalogListRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiTopNRequest, ListApiTopNResponse> listApiTopN = genForlistApiTopN();

    private static HttpRequestDef<ListApiTopNRequest, ListApiTopNResponse> genForlistApiTopN() {
        // basic
        HttpRequestDef.Builder<ListApiTopNRequest, ListApiTopNResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiTopNRequest.class, ListApiTopNResponse.class)
                .withName("ListApiTopN")
                .withUri("/v1/{project_id}/service/statistic/apis-top-n/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiTopNRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiTopNRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiTopNRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiTopNRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ListApiTopNRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApiTopNRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ListApiTopNRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<Integer>withRequestField("top_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiTopNRequest::getTopNum, (req, v) -> {
                req.setTopNum(v);
            }));
        builder.<ListApiTopNRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApiTopNRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListApiTopNRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiTopNRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ListApiTopNRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApiTopNRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApiTopNRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApicGroupsRequest, ListApicGroupsResponse> listApicGroups =
        genForlistApicGroups();

    private static HttpRequestDef<ListApicGroupsRequest, ListApicGroupsResponse> genForlistApicGroups() {
        // basic
        HttpRequestDef.Builder<ListApicGroupsRequest, ListApicGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApicGroupsRequest.class, ListApicGroupsResponse.class)
                .withName("ListApicGroups")
                .withUri("/v1/{project_id}/service/apigw/instances/{apig_instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("apig_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getApigInstanceId, (req, v) -> {
                req.setApigInstanceId(v);
            }));
        builder.<ListApicGroupsRequest.ApigTypeEnum>withRequestField("apig_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApicGroupsRequest.ApigTypeEnum.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getApigType, (req, v) -> {
                req.setApigType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ListApicGroupsRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApicGroupsRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApicInstancesRequest, ListApicInstancesResponse> listApicInstances =
        genForlistApicInstances();

    private static HttpRequestDef<ListApicInstancesRequest, ListApicInstancesResponse> genForlistApicInstances() {
        // basic
        HttpRequestDef.Builder<ListApicInstancesRequest, ListApicInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApicInstancesRequest.class, ListApicInstancesResponse.class)
                .withName("ListApicInstances")
                .withUri("/v1/{project_id}/service/apigw/instances")
                .withContentType("application/json");

        // requests
        builder.<ListApicInstancesRequest.ApigTypeEnum>withRequestField("apig_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApicInstancesRequest.ApigTypeEnum.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getApigType, (req, v) -> {
                req.setApigType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ListApicInstancesRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApicInstancesRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisTopRequest, ListApisTopResponse> listApisTop = genForlistApisTop();

    private static HttpRequestDef<ListApisTopRequest, ListApisTopResponse> genForlistApisTop() {
        // basic
        HttpRequestDef.Builder<ListApisTopRequest, ListApisTopResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisTopRequest.class, ListApisTopResponse.class)
                .withName("ListApisTop")
                .withUri("/v1/{project_id}/service/statistic/apis-top-n")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisTopRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisTopRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisTopRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ListApisTopRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApisTopRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ListApisTopRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<Integer>withRequestField("top_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisTopRequest::getTopNum, (req, v) -> {
                req.setTopNum(v);
            }));
        builder.<ListApisTopRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApisTopRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListApisTopRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisTopRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ListApisTopRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApisTopRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApisTopRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplyRequest, ListApplyResponse> listApply = genForlistApply();

    private static HttpRequestDef<ListApplyRequest, ListApplyResponse> genForlistApply() {
        // basic
        HttpRequestDef.Builder<ListApplyRequest, ListApplyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplyRequest.class, ListApplyResponse.class)
                .withName("ListApply")
                .withUri("/v1/{project_id}/service/applys")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplyRequest::getApiName, (req, v) -> {
                req.setApiName(v);
            }));
        builder.<Integer>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplyRequest::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplyRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApproversRequest, ListApproversResponse> listApprovers =
        genForlistApprovers();

    private static HttpRequestDef<ListApproversRequest, ListApproversResponse> genForlistApprovers() {
        // basic
        HttpRequestDef.Builder<ListApproversRequest, ListApproversResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApproversRequest.class, ListApproversResponse.class)
                .withName("ListApprovers")
                .withUri("/v2/{project_id}/design/approvals/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("approver_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApproversRequest::getApproverName, (req, v) -> {
                req.setApproverName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApproversRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApproversRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApproversRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForlistApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForlistApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v1/{project_id}/service/apps")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListAppsRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAppsRequest.AppTypeEnum.class),
            f -> f.withMarshaller(ListAppsRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ListAppsRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppsRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListAppsRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsTopRequest, ListAppsTopResponse> listAppsTop = genForlistAppsTop();

    private static HttpRequestDef<ListAppsTopRequest, ListAppsTopResponse> genForlistAppsTop() {
        // basic
        HttpRequestDef.Builder<ListAppsTopRequest, ListAppsTopResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsTopRequest.class, ListAppsTopResponse.class)
                .withName("ListAppsTop")
                .withUri("/v1/{project_id}/service/statistic/apps-top-n")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsTopRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsTopRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ListAppsTopRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppsTopRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ListAppsTopRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<Integer>withRequestField("top_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsTopRequest::getTopNum, (req, v) -> {
                req.setTopNum(v);
            }));
        builder.<ListAppsTopRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppsTopRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListAppsTopRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsTopRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ListAppsTopRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppsTopRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListAppsTopRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse> listBizMetricDimensions =
        genForlistBizMetricDimensions();

    private static HttpRequestDef<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse> genForlistBizMetricDimensions() {
        // basic
        HttpRequestDef.Builder<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBizMetricDimensionsRequest.class, ListBizMetricDimensionsResponse.class)
            .withName("ListBizMetricDimensions")
            .withUri("/v2/{project_id}/design/biz-metrics/dimensions")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricDimensionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricDimensionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricDimensionsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse> listBizMetricOwners =
        genForlistBizMetricOwners();

    private static HttpRequestDef<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse> genForlistBizMetricOwners() {
        // basic
        HttpRequestDef.Builder<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBizMetricOwnersRequest.class, ListBizMetricOwnersResponse.class)
                .withName("ListBizMetricOwners")
                .withUri("/v2/{project_id}/design/biz-metrics/owners")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricOwnersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricOwnersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricOwnersRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBizMetricsRequest, ListBizMetricsResponse> listBizMetrics =
        genForlistBizMetrics();

    private static HttpRequestDef<ListBizMetricsRequest, ListBizMetricsResponse> genForlistBizMetrics() {
        // basic
        HttpRequestDef.Builder<ListBizMetricsRequest, ListBizMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBizMetricsRequest.class, ListBizMetricsResponse.class)
                .withName("ListBizMetrics")
                .withUri("/v2/{project_id}/design/biz-metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<ListBizMetricsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBizMetricsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListBizMetricsRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBizMetricsRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getSyncStatus, (req, v) -> {
                req.setSyncStatus(v);
            }));
        builder.<List<ListBizMetricsRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getSyncKey, (req, v) -> {
                req.setSyncKey(v);
            }));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getBizCatalogId, (req, v) -> {
                req.setBizCatalogId(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBusinessRequest, ListBusinessResponse> listBusiness = genForlistBusiness();

    private static HttpRequestDef<ListBusinessRequest, ListBusinessResponse> genForlistBusiness() {
        // basic
        HttpRequestDef.Builder<ListBusinessRequest, ListBusinessResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBusinessRequest.class, ListBusinessResponse.class)
                .withName("ListBusiness")
                .withUri("/v2/{project_id}/design/subjects/business")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBusinessRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBusinessRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBusinessRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogListRequest, ListCatalogListResponse> listCatalogList =
        genForlistCatalogList();

    private static HttpRequestDef<ListCatalogListRequest, ListCatalogListResponse> genForlistCatalogList() {
        // basic
        HttpRequestDef.Builder<ListCatalogListRequest, ListCatalogListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCatalogListRequest.class, ListCatalogListResponse.class)
                .withName("ListCatalogList")
                .withUri("/v1/{project_id}/service/servicecatalogs/{catalog_id}/catalogs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("catalog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCatalogListRequest::getCatalogId, (req, v) -> {
                req.setCatalogId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCatalogListRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogTreeRequest, ListCatalogTreeResponse> listCatalogTree =
        genForlistCatalogTree();

    private static HttpRequestDef<ListCatalogTreeRequest, ListCatalogTreeResponse> genForlistCatalogTree() {
        // basic
        HttpRequestDef.Builder<ListCatalogTreeRequest, ListCatalogTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCatalogTreeRequest.class, ListCatalogTreeResponse.class)
                .withName("ListCatalogTree")
                .withUri("/v2/{project_id}/design/biz/catalogs/tree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCatalogTreeRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCategoryRequest, ListCategoryResponse> listCategory = genForlistCategory();

    private static HttpRequestDef<ListCategoryRequest, ListCategoryResponse> genForlistCategory() {
        // basic
        HttpRequestDef.Builder<ListCategoryRequest, ListCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCategoryRequest.class, ListCategoryResponse.class)
                .withName("ListCategory")
                .withUri("/v2/{project_id}/quality/categories")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCategoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCategoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCategoryRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<String>withRequestField("accept",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCategoryRequest::getAccept, (req, v) -> {
                req.setAccept(v);
            }));

        // response
        builder.<List<CategoryDetailVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCategoryResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CategoryDetailVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListColumnsRequest, ListColumnsResponse> listColumns = genForlistColumns();

    private static HttpRequestDef<ListColumnsRequest, ListColumnsResponse> genForlistColumns() {
        // basic
        HttpRequestDef.Builder<ListColumnsRequest, ListColumnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListColumnsRequest.class, ListColumnsResponse.class)
                .withName("ListColumns")
                .withUri("/v2/{project_id}/{connection_id}/datatables/{table_id}/columns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getTableId, (req, v) -> {
                req.setTableId(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCompoundMetricsRequest, ListCompoundMetricsResponse> listCompoundMetrics =
        genForlistCompoundMetrics();

    private static HttpRequestDef<ListCompoundMetricsRequest, ListCompoundMetricsResponse> genForlistCompoundMetrics() {
        // basic
        HttpRequestDef.Builder<ListCompoundMetricsRequest, ListCompoundMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCompoundMetricsRequest.class, ListCompoundMetricsResponse.class)
                .withName("ListCompoundMetrics")
                .withUri("/v2/{project_id}/design/compound-metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<ListCompoundMetricsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCompoundMetricsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("dimension_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getDimensionGroup, (req, v) -> {
                req.setDimensionGroup(v);
            }));
        builder.<Long>withRequestField("atomic_index_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getAtomicIndexId, (req, v) -> {
                req.setAtomicIndexId(v);
            }));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getL3Id, (req, v) -> {
                req.setL3Id(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConditionRequest, ListConditionResponse> listCondition =
        genForlistCondition();

    private static HttpRequestDef<ListConditionRequest, ListConditionResponse> genForlistCondition() {
        // basic
        HttpRequestDef.Builder<ListConditionRequest, ListConditionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConditionRequest.class, ListConditionResponse.class)
                .withName("ListCondition")
                .withUri("/v2/{project_id}/design/conditions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<ListConditionRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConditionRequest.StatusEnum.class),
            f -> f.withMarshaller(ListConditionRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConditionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConditionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsistencyTaskRequest, ListConsistencyTaskResponse> listConsistencyTask =
        genForlistConsistencyTask();

    private static HttpRequestDef<ListConsistencyTaskRequest, ListConsistencyTaskResponse> genForlistConsistencyTask() {
        // basic
        HttpRequestDef.Builder<ListConsistencyTaskRequest, ListConsistencyTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConsistencyTaskRequest.class, ListConsistencyTaskResponse.class)
                .withName("ListConsistencyTask")
                .withUri("/v2/{project_id}/quality/consistency-tasks")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getCategoryId, (req, v) -> {
                req.setCategoryId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListConsistencyTaskRequest.ScheduleStatusEnum>withRequestField("schedule_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConsistencyTaskRequest.ScheduleStatusEnum.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getScheduleStatus, (req, v) -> {
                req.setScheduleStatus(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getCreator, (req, v) -> {
                req.setCreator(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse> listDataArtsStudioInstances =
        genForlistDataArtsStudioInstances();

    private static HttpRequestDef<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse> genForlistDataArtsStudioInstances() {
        // basic
        HttpRequestDef.Builder<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDataArtsStudioInstancesRequest.class,
                    ListDataArtsStudioInstancesResponse.class)
                .withName("ListDataArtsStudioInstances")
                .withUri("/v1/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataArtsStudioInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataArtsStudioInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataTablesRequest, ListDataTablesResponse> listDataTables =
        genForlistDataTables();

    private static HttpRequestDef<ListDataTablesRequest, ListDataTablesResponse> genForlistDataTables() {
        // basic
        HttpRequestDef.Builder<ListDataTablesRequest, ListDataTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataTablesRequest.class, ListDataTablesResponse.class)
                .withName("ListDataTables")
                .withUri("/v2/{project_id}/{connection_id}/datatables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForlistDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForlistDatabases() {
        // basic
        HttpRequestDef.Builder<ListDatabasesRequest, ListDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabasesRequest.class, ListDatabasesResponse.class)
                .withName("ListDatabases")
                .withUri("/v2/{project_id}/{connection_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataconnectionsRequest, ListDataconnectionsResponse> listDataconnections =
        genForlistDataconnections();

    private static HttpRequestDef<ListDataconnectionsRequest, ListDataconnectionsResponse> genForlistDataconnections() {
        // basic
        HttpRequestDef.Builder<ListDataconnectionsRequest, ListDataconnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataconnectionsRequest.class, ListDataconnectionsResponse.class)
                .withName("ListDataconnections")
                .withUri("/v1/{project_id}/data-connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse> listDerivativeIndexes =
        genForlistDerivativeIndexes();

    private static HttpRequestDef<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse> genForlistDerivativeIndexes() {
        // basic
        HttpRequestDef.Builder<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDerivativeIndexesRequest.class, ListDerivativeIndexesResponse.class)
            .withName("ListDerivativeIndexes")
            .withUri("/v2/{project_id}/design/derivative-indexs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<ListDerivativeIndexesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDerivativeIndexesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Long>withRequestField("dimension_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getDimensionId, (req, v) -> {
                req.setDimensionId(v);
            }));
        builder.<String>withRequestField("dimension_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getDimensionGroup, (req, v) -> {
                req.setDimensionGroup(v);
            }));
        builder.<Long>withRequestField("atomic_index_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getAtomicIndexId, (req, v) -> {
                req.setAtomicIndexId(v);
            }));
        builder.<Boolean>withRequestField("all_metrics",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getAllMetrics, (req, v) -> {
                req.setAllMetrics(v);
            }));
        builder.<String>withRequestField("dw_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getDwType, (req, v) -> {
                req.setDwType(v);
            }));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getL3Id, (req, v) -> {
                req.setL3Id(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDimensionGroupsRequest, ListDimensionGroupsResponse> listDimensionGroups =
        genForlistDimensionGroups();

    private static HttpRequestDef<ListDimensionGroupsRequest, ListDimensionGroupsResponse> genForlistDimensionGroups() {
        // basic
        HttpRequestDef.Builder<ListDimensionGroupsRequest, ListDimensionGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDimensionGroupsRequest.class, ListDimensionGroupsResponse.class)
                .withName("ListDimensionGroups")
                .withUri("/v2/{project_id}/design/dimension/groups")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("table_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getTableId, (req, v) -> {
                req.setTableId(v);
            }));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getBizType, (req, v) -> {
                req.setBizType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse> listDimensionLogicTables =
        genForlistDimensionLogicTables();

    private static HttpRequestDef<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse> genForlistDimensionLogicTables() {
        // basic
        HttpRequestDef.Builder<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListDimensionLogicTablesRequest.class, ListDimensionLogicTablesResponse.class)
                .withName("ListDimensionLogicTables")
                .withUri("/v2/{project_id}/design/dimension-logic-tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<ListDimensionLogicTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionLogicTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListDimensionLogicTablesRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionLogicTablesRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getSyncStatus, (req, v) -> {
                req.setSyncStatus(v);
            }));
        builder.<List<ListDimensionLogicTablesRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getSyncKey, (req, v) -> {
                req.setSyncKey(v);
            }));
        builder.<Long>withRequestField("l2_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getL2Id, (req, v) -> {
                req.setL2Id(v);
            }));
        builder.<Long>withRequestField("dimension_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getDimensionId, (req, v) -> {
                req.setDimensionId(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getBizCatalogId, (req, v) -> {
                req.setBizCatalogId(v);
            }));
        builder.<ListDimensionLogicTablesRequest.DimensionTypeEnum>withRequestField("dimension_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionLogicTablesRequest.DimensionTypeEnum.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getDimensionType, (req, v) -> {
                req.setDimensionType(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDimensionsRequest, ListDimensionsResponse> listDimensions =
        genForlistDimensions();

    private static HttpRequestDef<ListDimensionsRequest, ListDimensionsResponse> genForlistDimensions() {
        // basic
        HttpRequestDef.Builder<ListDimensionsRequest, ListDimensionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDimensionsRequest.class, ListDimensionsResponse.class)
                .withName("ListDimensions")
                .withUri("/v2/{project_id}/design/dimensions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<ListDimensionsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListDimensionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Long>withRequestField("l2_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionsRequest::getL2Id, (req, v) -> {
                req.setL2Id(v);
            }));
        builder.<List<Long>>withRequestField("derivative_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDimensionsRequest::getDerivativeIds, (req, v) -> {
                req.setDerivativeIds(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Long>withRequestField("fact_logic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionsRequest::getFactLogicId, (req, v) -> {
                req.setFactLogicId(v);
            }));
        builder.<ListDimensionsRequest.DimensionTypeEnum>withRequestField("dimension_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionsRequest.DimensionTypeEnum.class),
            f -> f.withMarshaller(ListDimensionsRequest::getDimensionType, (req, v) -> {
                req.setDimensionType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getBizCatalogId, (req, v) -> {
                req.setBizCatalogId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectoriesRequest, ListDirectoriesResponse> listDirectories =
        genForlistDirectories();

    private static HttpRequestDef<ListDirectoriesRequest, ListDirectoriesResponse> genForlistDirectories() {
        // basic
        HttpRequestDef.Builder<ListDirectoriesRequest, ListDirectoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDirectoriesRequest.class, ListDirectoriesResponse.class)
                .withName("ListDirectories")
                .withUri("/v2/{project_id}/design/directorys")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListDirectoriesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDirectoriesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFactLogicTablesRequest, ListFactLogicTablesResponse> listFactLogicTables =
        genForlistFactLogicTables();

    private static HttpRequestDef<ListFactLogicTablesRequest, ListFactLogicTablesResponse> genForlistFactLogicTables() {
        // basic
        HttpRequestDef.Builder<ListFactLogicTablesRequest, ListFactLogicTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFactLogicTablesRequest.class, ListFactLogicTablesResponse.class)
                .withName("ListFactLogicTables")
                .withUri("/v2/{project_id}/design/fact-logic-tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<ListFactLogicTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFactLogicTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListFactLogicTablesRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFactLogicTablesRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getSyncStatus, (req, v) -> {
                req.setSyncStatus(v);
            }));
        builder.<List<ListFactLogicTablesRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getSyncKey, (req, v) -> {
                req.setSyncKey(v);
            }));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getL3Id, (req, v) -> {
                req.setL3Id(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getBizCatalogId, (req, v) -> {
                req.setBizCatalogId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/quality/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListInstancesRequest.TaskTypeEnum>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.TaskTypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getTaskType, (req, v) -> {
                req.setTaskType(v);
            }));
        builder.<ListInstancesRequest.RunStatusEnum>withRequestField("run_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.RunStatusEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getRunStatus, (req, v) -> {
                req.setRunStatus(v);
            }));
        builder.<ListInstancesRequest.NotifyStatusEnum>withRequestField("notify_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.NotifyStatusEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getNotifyStatus, (req, v) -> {
                req.setNotifyStatus(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse> listManagerWorkSpaces =
        genForlistManagerWorkSpaces();

    private static HttpRequestDef<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse> genForlistManagerWorkSpaces() {
        // basic
        HttpRequestDef.Builder<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListManagerWorkSpacesRequest.class, ListManagerWorkSpacesResponse.class)
            .withName("ListManagerWorkSpaces")
            .withUri("/v1/{project_id}/workspaces/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagerWorkSpacesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagerWorkSpacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagerWorkSpacesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageRequest, ListMessageResponse> listMessage = genForlistMessage();

    private static HttpRequestDef<ListMessageRequest, ListMessageResponse> genForlistMessage() {
        // basic
        HttpRequestDef.Builder<ListMessageRequest, ListMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessageRequest.class, ListMessageResponse.class)
                .withName("ListMessage")
                .withUri("/v1/{project_id}/service/messages")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getApiName, (req, v) -> {
                req.setApiName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricRelationsRequest, ListMetricRelationsResponse> listMetricRelations =
        genForlistMetricRelations();

    private static HttpRequestDef<ListMetricRelationsRequest, ListMetricRelationsResponse> genForlistMetricRelations() {
        // basic
        HttpRequestDef.Builder<ListMetricRelationsRequest, ListMetricRelationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricRelationsRequest.class, ListMetricRelationsResponse.class)
                .withName("ListMetricRelations")
                .withUri("/v2/{project_id}/design/metric-relations/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricRelationsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricRelationsRequest::getBizType, (req, v) -> {
                req.setBizType(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricRelationsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQualityTaskRequest, ListQualityTaskResponse> listQualityTask =
        genForlistQualityTask();

    private static HttpRequestDef<ListQualityTaskRequest, ListQualityTaskResponse> genForlistQualityTask() {
        // basic
        HttpRequestDef.Builder<ListQualityTaskRequest, ListQualityTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQualityTaskRequest.class, ListQualityTaskResponse.class)
                .withName("ListQualityTask")
                .withUri("/v2/{project_id}/quality/quality-tasks")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getCategoryId, (req, v) -> {
                req.setCategoryId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListQualityTaskRequest.ScheduleStatusEnum>withRequestField("schedule_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListQualityTaskRequest.ScheduleStatusEnum.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getScheduleStatus, (req, v) -> {
                req.setScheduleStatus(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getCreator, (req, v) -> {
                req.setCreator(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQualityTaskListsRequest, ListQualityTaskListsResponse> listQualityTaskLists =
        genForlistQualityTaskLists();

    private static HttpRequestDef<ListQualityTaskListsRequest, ListQualityTaskListsResponse> genForlistQualityTaskLists() {
        // basic
        HttpRequestDef.Builder<ListQualityTaskListsRequest, ListQualityTaskListsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListQualityTaskListsRequest.class, ListQualityTaskListsResponse.class)
            .withName("ListQualityTaskLists")
            .withUri("/v1/{project_id}/quality/rules")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getCategoryId, (req, v) -> {
                req.setCategoryId(v);
            }));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getRuleName, (req, v) -> {
                req.setRuleName(v);
            }));
        builder.<Integer>withRequestField("schedule_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getScheduleStatus, (req, v) -> {
                req.setScheduleStatus(v);
            }));
        builder.<Integer>withRequestField("schedule_period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getSchedulePeriod, (req, v) -> {
                req.setSchedulePeriod(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("result_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getResultStatus, (req, v) -> {
                req.setResultStatus(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQualityTemplatesRequest, ListQualityTemplatesResponse> listQualityTemplates =
        genForlistQualityTemplates();

    private static HttpRequestDef<ListQualityTemplatesRequest, ListQualityTemplatesResponse> genForlistQualityTemplates() {
        // basic
        HttpRequestDef.Builder<ListQualityTemplatesRequest, ListQualityTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListQualityTemplatesRequest.class, ListQualityTemplatesResponse.class)
            .withName("ListQualityTemplates")
            .withUri("/v2/{project_id}/quality/rule-templates")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getCategoryId, (req, v) -> {
                req.setCategoryId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("system_template",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getSystemTemplate, (req, v) -> {
                req.setSystemTemplate(v);
            }));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getCreator, (req, v) -> {
                req.setCreator(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationsRequest, ListRelationsResponse> listRelations =
        genForlistRelations();

    private static HttpRequestDef<ListRelationsRequest, ListRelationsResponse> genForlistRelations() {
        // basic
        HttpRequestDef.Builder<ListRelationsRequest, ListRelationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelationsRequest.class, ListRelationsResponse.class)
                .withName("ListRelations")
                .withUri("/v2/{project_id}/design/relation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSchemasRequest, ListSchemasResponse> listSchemas = genForlistSchemas();

    private static HttpRequestDef<ListSchemasRequest, ListSchemasResponse> genForlistSchemas() {
        // basic
        HttpRequestDef.Builder<ListSchemasRequest, ListSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSchemasRequest.class, ListSchemasResponse.class)
                .withName("ListSchemas")
                .withUri("/v2/{project_id}/{connection_id}/schemas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubjectLevelsRequest, ListSubjectLevelsResponse> listSubjectLevels =
        genForlistSubjectLevels();

    private static HttpRequestDef<ListSubjectLevelsRequest, ListSubjectLevelsResponse> genForlistSubjectLevels() {
        // basic
        HttpRequestDef.Builder<ListSubjectLevelsRequest, ListSubjectLevelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubjectLevelsRequest.class, ListSubjectLevelsResponse.class)
                .withName("ListSubjectLevels")
                .withUri("/v2/{project_id}/design/subject-levels")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubjectLevelsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubjectLevelsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubjectLevelsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableModelRelationsRequest, ListTableModelRelationsResponse> listTableModelRelations =
        genForlistTableModelRelations();

    private static HttpRequestDef<ListTableModelRelationsRequest, ListTableModelRelationsResponse> genForlistTableModelRelations() {
        // basic
        HttpRequestDef.Builder<ListTableModelRelationsRequest, ListTableModelRelationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTableModelRelationsRequest.class, ListTableModelRelationsResponse.class)
            .withName("ListTableModelRelations")
            .withUri("/v2/{project_id}/design/{model_id}/table-model/relation")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getModelId, (req, v) -> {
                req.setModelId(v);
            }));
        builder.<String>withRequestField("table_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getTableIds, (req, v) -> {
                req.setTableIds(v);
            }));
        builder.<ListTableModelRelationsRequest.BizTypeEnum>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTableModelRelationsRequest.BizTypeEnum.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getBizType, (req, v) -> {
                req.setBizType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableModelsRequest, ListTableModelsResponse> listTableModels =
        genForlistTableModels();

    private static HttpRequestDef<ListTableModelsRequest, ListTableModelsResponse> genForlistTableModels() {
        // basic
        HttpRequestDef.Builder<ListTableModelsRequest, ListTableModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTableModelsRequest.class, ListTableModelsResponse.class)
                .withName("ListTableModels")
                .withUri("/v2/{project_id}/design/table-model")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<ListTableModelsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTableModelsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListTableModelsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListTableModelsRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTableModelsRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListTableModelsRequest::getSyncStatus, (req, v) -> {
                req.setSyncStatus(v);
            }));
        builder.<List<ListTableModelsRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTableModelsRequest::getSyncKey, (req, v) -> {
                req.setSyncKey(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableModelsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableModelsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("model_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getModelId, (req, v) -> {
                req.setModelId(v);
            }));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getBizCatalogId, (req, v) -> {
                req.setBizCatalogId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse> listWorkspaceRoles =
        genForlistWorkspaceRoles();

    private static HttpRequestDef<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse> genForlistWorkspaceRoles() {
        // basic
        HttpRequestDef.Builder<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspaceRolesRequest.class, ListWorkspaceRolesResponse.class)
                .withName("ListWorkspaceRoles")
                .withUri("/v2/{project_id}/users/role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRolesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRolesRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response
        builder.<List<ApigRoleVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListWorkspaceRolesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ApigRoleVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForlistWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForlistWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListWorkspacesRequest, ListWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspacesRequest.class, ListWorkspacesResponse.class)
                .withName("ListWorkspaces")
                .withUri("/v2/{project_id}/design/workspaces")
                .withContentType("application/json");

        // requests
        builder.<ListWorkspacesRequest.WorkspaceTypeEnum>withRequestField("workspace_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkspacesRequest.WorkspaceTypeEnum.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getWorkspaceType, (req, v) -> {
                req.setWorkspaceType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("dw_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getDwType, (req, v) -> {
                req.setDwType(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspaceusersRequest, ListWorkspaceusersResponse> listWorkspaceusers =
        genForlistWorkspaceusers();

    private static HttpRequestDef<ListWorkspaceusersRequest, ListWorkspaceusersResponse> genForlistWorkspaceusers() {
        // basic
        HttpRequestDef.Builder<ListWorkspaceusersRequest, ListWorkspaceusersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspaceusersRequest.class, ListWorkspaceusersResponse.class)
                .withName("ListWorkspaceusers")
                .withUri("/v2/{project_id}/{workspace_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceusersRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceusersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceusersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateApiRequest, MigrateApiResponse> migrateApi = genFormigrateApi();

    private static HttpRequestDef<MigrateApiRequest, MigrateApiResponse> genFormigrateApi() {
        // basic
        HttpRequestDef.Builder<MigrateApiRequest, MigrateApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateApiRequest.class, MigrateApiResponse.class)
                .withName("MigrateApi")
                .withUri("/v1/{project_id}/service/servicecatalogs/apis/batch-move")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateApiRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApiMoveParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiMoveParaDTO.class),
            f -> f.withMarshaller(MigrateApiRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateCatalogRequest, MigrateCatalogResponse> migrateCatalog =
        genFormigrateCatalog();

    private static HttpRequestDef<MigrateCatalogRequest, MigrateCatalogResponse> genFormigrateCatalog() {
        // basic
        HttpRequestDef.Builder<MigrateCatalogRequest, MigrateCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateCatalogRequest.class, MigrateCatalogResponse.class)
                .withName("MigrateCatalog")
                .withUri("/v1/{project_id}/service/servicecatalogs/{catalog_id}/move")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("catalog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCatalogRequest::getCatalogId, (req, v) -> {
                req.setCatalogId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCatalogRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CatalogMoveParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogMoveParaDTO.class),
            f -> f.withMarshaller(MigrateCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse> modifyCustomizedFields =
        genFormodifyCustomizedFields();

    private static HttpRequestDef<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse> genFormodifyCustomizedFields() {
        // basic
        HttpRequestDef.Builder<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ModifyCustomizedFieldsRequest.class, ModifyCustomizedFieldsResponse.class)
            .withName("ModifyCustomizedFields")
            .withUri("/v2/{project_id}/design/customized-fields")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyCustomizedFieldsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CustomizedFieldsVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomizedFieldsVOList.class),
            f -> f.withMarshaller(ModifyCustomizedFieldsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse> payForDgcOneKey =
        genForpayForDgcOneKey();

    private static HttpRequestDef<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse> genForpayForDgcOneKey() {
        // basic
        HttpRequestDef.Builder<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PayForDgcOneKeyRequest.class, PayForDgcOneKeyResponse.class)
                .withName("PayForDgcOneKey")
                .withUri("/v1/{project_id}/instances/onekey-purchase")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OrderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrderReq.class),
            f -> f.withMarshaller(PayForDgcOneKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse> resetLinkAttributeAndStandard =
        genForresetLinkAttributeAndStandard();

    private static HttpRequestDef<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse> genForresetLinkAttributeAndStandard() {
        // basic
        HttpRequestDef.Builder<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ResetLinkAttributeAndStandardRequest.class,
                    ResetLinkAttributeAndStandardResponse.class)
                .withName("ResetLinkAttributeAndStandard")
                .withUri("/v2/{project_id}/design/standards/attribute")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetLinkAttributeAndStandardRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<LinkAttributeAndElementVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LinkAttributeAndElementVO.class),
            f -> f.withMarshaller(ResetLinkAttributeAndStandardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackApprovalRequest, RollbackApprovalResponse> rollbackApproval =
        genForrollbackApproval();

    private static HttpRequestDef<RollbackApprovalRequest, RollbackApprovalResponse> genForrollbackApproval() {
        // basic
        HttpRequestDef.Builder<RollbackApprovalRequest, RollbackApprovalResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RollbackApprovalRequest.class, RollbackApprovalResponse.class)
                .withName("RollbackApproval")
                .withUri("/v2/{project_id}/design/approvals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackApprovalRequest::getIds, (req, v) -> {
                req.setIds(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackApprovalRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchApprovalsRequest, SearchApprovalsResponse> searchApprovals =
        genForsearchApprovals();

    private static HttpRequestDef<SearchApprovalsRequest, SearchApprovalsResponse> genForsearchApprovals() {
        // basic
        HttpRequestDef.Builder<SearchApprovalsRequest, SearchApprovalsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchApprovalsRequest.class, SearchApprovalsResponse.class)
                .withName("SearchApprovals")
                .withUri("/v2/{project_id}/design/approvals")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("biz_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getBizId, (req, v) -> {
                req.setBizId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<SearchApprovalsRequest.ApprovalStatusEnum>withRequestField("approval_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchApprovalsRequest.ApprovalStatusEnum.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getApprovalStatus, (req, v) -> {
                req.setApprovalStatus(v);
            }));
        builder.<SearchApprovalsRequest.ApprovalStatusDetailEnum>withRequestField("approval_status_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchApprovalsRequest.ApprovalStatusDetailEnum.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getApprovalStatusDetail, (req, v) -> {
                req.setApprovalStatusDetail(v);
            }));
        builder.<SearchApprovalsRequest.ApprovalTypeEnum>withRequestField("approval_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchApprovalsRequest.ApprovalTypeEnum.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getApprovalType, (req, v) -> {
                req.setApprovalType(v);
            }));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getBizType, (req, v) -> {
                req.setBizType(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse> searchAtomicIndexes =
        genForsearchAtomicIndexes();

    private static HttpRequestDef<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse> genForsearchAtomicIndexes() {
        // basic
        HttpRequestDef.Builder<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchAtomicIndexesRequest.class, SearchAtomicIndexesResponse.class)
                .withName("SearchAtomicIndexes")
                .withUri("/v2/{project_id}/design/atomic-indexs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<SearchAtomicIndexesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchAtomicIndexesRequest.StatusEnum.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getL3Id, (req, v) -> {
                req.setL3Id(v);
            }));
        builder.<Long>withRequestField("table_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getTableId, (req, v) -> {
                req.setTableId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse> searchAuthorizeApp =
        genForsearchAuthorizeApp();

    private static HttpRequestDef<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse> genForsearchAuthorizeApp() {
        // basic
        HttpRequestDef.Builder<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchAuthorizeAppRequest.class, SearchAuthorizeAppResponse.class)
                .withName("SearchAuthorizeApp")
                .withUri("/v1/{project_id}/service/authorize/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchBindApiRequest, SearchBindApiResponse> searchBindApi =
        genForsearchBindApi();

    private static HttpRequestDef<SearchBindApiRequest, SearchBindApiResponse> genForsearchBindApi() {
        // basic
        HttpRequestDef.Builder<SearchBindApiRequest, SearchBindApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchBindApiRequest.class, SearchBindApiResponse.class)
                .withName("SearchBindApi")
                .withUri("/v1/{project_id}/service/authorize/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchBindApiRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchBindApiRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchBindApiRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchBindApiRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCatalogsRequest, SearchCatalogsResponse> searchCatalogs =
        genForsearchCatalogs();

    private static HttpRequestDef<SearchCatalogsRequest, SearchCatalogsResponse> genForsearchCatalogs() {
        // basic
        HttpRequestDef.Builder<SearchCatalogsRequest, SearchCatalogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCatalogsRequest.class, SearchCatalogsResponse.class)
                .withName("SearchCatalogs")
                .withUri("/v2/{project_id}/design/biz/catalogs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse> searchCodeTableValues =
        genForsearchCodeTableValues();

    private static HttpRequestDef<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse> genForsearchCodeTableValues() {
        // basic
        HttpRequestDef.Builder<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchCodeTableValuesRequest.class, SearchCodeTableValuesResponse.class)
            .withName("SearchCodeTableValues")
            .withUri("/v2/{project_id}/design/code-tables/{id}/values")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTableValuesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCodeTableValuesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCodeTableValuesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTableValuesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCodeTablesRequest, SearchCodeTablesResponse> searchCodeTables =
        genForsearchCodeTables();

    private static HttpRequestDef<SearchCodeTablesRequest, SearchCodeTablesResponse> genForsearchCodeTables() {
        // basic
        HttpRequestDef.Builder<SearchCodeTablesRequest, SearchCodeTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCodeTablesRequest.class, SearchCodeTablesResponse.class)
                .withName("SearchCodeTables")
                .withUri("/v2/{project_id}/design/code-tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getApprover, (req, v) -> {
                req.setApprover(v);
            }));
        builder.<Long>withRequestField("directory_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getDirectoryId, (req, v) -> {
                req.setDirectoryId(v);
            }));
        builder.<SearchCodeTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchCodeTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse> searchCustomizedFields =
        genForsearchCustomizedFields();

    private static HttpRequestDef<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse> genForsearchCustomizedFields() {
        // basic
        HttpRequestDef.Builder<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchCustomizedFieldsRequest.class, SearchCustomizedFieldsResponse.class)
            .withName("SearchCustomizedFields")
            .withUri("/v2/{project_id}/design/customized-fields")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCustomizedFieldsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCustomizedFieldsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<SearchCustomizedFieldsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchCustomizedFieldsRequest.TypeEnum.class),
            f -> f.withMarshaller(SearchCustomizedFieldsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCustomizedFieldsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDwByTypeRequest, SearchDwByTypeResponse> searchDwByType =
        genForsearchDwByType();

    private static HttpRequestDef<SearchDwByTypeRequest, SearchDwByTypeResponse> genForsearchDwByType() {
        // basic
        HttpRequestDef.Builder<SearchDwByTypeRequest, SearchDwByTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchDwByTypeRequest.class, SearchDwByTypeResponse.class)
                .withName("SearchDwByType")
                .withUri("/v2/{project_id}/design/atlas/data-warehouses")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("force_refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getForceRefresh, (req, v) -> {
                req.setForceRefresh(v);
            }));
        builder.<String>withRequestField("dw_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getDwType, (req, v) -> {
                req.setDwType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchIdByPathRequest, SearchIdByPathResponse> searchIdByPath =
        genForsearchIdByPath();

    private static HttpRequestDef<SearchIdByPathRequest, SearchIdByPathResponse> genForsearchIdByPath() {
        // basic
        HttpRequestDef.Builder<SearchIdByPathRequest, SearchIdByPathResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchIdByPathRequest.class, SearchIdByPathResponse.class)
                .withName("SearchIdByPath")
                .withUri("/v1/{project_id}/service/servicecatalogs/ids")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchIdByPathRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchIdByPathRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchIdByPathRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchIdByPathRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchSubjectRequest, SearchSubjectResponse> searchSubject =
        genForsearchSubject();

    private static HttpRequestDef<SearchSubjectRequest, SearchSubjectResponse> genForsearchSubject() {
        // basic
        HttpRequestDef.Builder<SearchSubjectRequest, SearchSubjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchSubjectRequest.class, SearchSubjectResponse.class)
                .withName("SearchSubject")
                .withUri("/v2/{project_id}/design/subjects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<SearchSubjectRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchSubjectRequest.StatusEnum.class),
            f -> f.withMarshaller(SearchSubjectRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchSubjectRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchSubjectRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchSubjectRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchSubjectNewRequest, SearchSubjectNewResponse> searchSubjectNew =
        genForsearchSubjectNew();

    private static HttpRequestDef<SearchSubjectNewRequest, SearchSubjectNewResponse> genForsearchSubjectNew() {
        // basic
        HttpRequestDef.Builder<SearchSubjectNewRequest, SearchSubjectNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchSubjectNewRequest.class, SearchSubjectNewResponse.class)
                .withName("SearchSubjectNew")
                .withUri("/v3/{project_id}/design/subjects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<SearchSubjectNewRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchSubjectNewRequest.StatusEnum.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchVersionsRequest, SearchVersionsResponse> searchVersions =
        genForsearchVersions();

    private static HttpRequestDef<SearchVersionsRequest, SearchVersionsResponse> genForsearchVersions() {
        // basic
        HttpRequestDef.Builder<SearchVersionsRequest, SearchVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchVersionsRequest.class, SearchVersionsResponse.class)
                .withName("SearchVersions")
                .withUri("/v2/{project_id}/design/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getCreateBy, (req, v) -> {
                req.setCreateBy(v);
            }));
        builder.<Long>withRequestField("biz_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchVersionsRequest::getBizId, (req, v) -> {
                req.setBizId(v);
            }));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getBizType, (req, v) -> {
                req.setBizType(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchVersionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchVersionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse> showAggregationLogicTableById =
        genForshowAggregationLogicTableById();

    private static HttpRequestDef<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse> genForshowAggregationLogicTableById() {
        // basic
        HttpRequestDef.Builder<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAggregationLogicTableByIdRequest.class,
                    ShowAggregationLogicTableByIdResponse.class)
                .withName("ShowAggregationLogicTableById")
                .withUri("/v2/{project_id}/design/aggregation-logic-tables/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAggregationLogicTableByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAggregationLogicTableByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAggregationLogicTableByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiDashboardRequest, ShowApiDashboardResponse> showApiDashboard =
        genForshowApiDashboard();

    private static HttpRequestDef<ShowApiDashboardRequest, ShowApiDashboardResponse> genForshowApiDashboard() {
        // basic
        HttpRequestDef.Builder<ShowApiDashboardRequest, ShowApiDashboardResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiDashboardRequest.class, ShowApiDashboardResponse.class)
                .withName("ShowApiDashboard")
                .withUri("/v1/{project_id}/service/statistic/apis-dashboards/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowApiDashboardRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApiDashboardRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ShowApiDashboardRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApiDashboardRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApisDashboardRequest, ShowApisDashboardResponse> showApisDashboard =
        genForshowApisDashboard();

    private static HttpRequestDef<ShowApisDashboardRequest, ShowApisDashboardResponse> genForshowApisDashboard() {
        // basic
        HttpRequestDef.Builder<ShowApisDashboardRequest, ShowApisDashboardResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApisDashboardRequest.class, ShowApisDashboardResponse.class)
                .withName("ShowApisDashboard")
                .withUri("/v1/{project_id}/service/statistic/apis-dashboards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowApisDashboardRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisDashboardRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ShowApisDashboardRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisDashboardRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApisDetailRequest, ShowApisDetailResponse> showApisDetail =
        genForshowApisDetail();

    private static HttpRequestDef<ShowApisDetailRequest, ShowApisDetailResponse> genForshowApisDetail() {
        // basic
        HttpRequestDef.Builder<ShowApisDetailRequest, ShowApisDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApisDetailRequest.class, ShowApisDetailResponse.class)
                .withName("ShowApisDetail")
                .withUri("/v1/{project_id}/service/statistic/apis-detail/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowApisDetailRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisDetailRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ShowApisDetailRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisDetailRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApisOverviewRequest, ShowApisOverviewResponse> showApisOverview =
        genForshowApisOverview();

    private static HttpRequestDef<ShowApisOverviewRequest, ShowApisOverviewResponse> genForshowApisOverview() {
        // basic
        HttpRequestDef.Builder<ShowApisOverviewRequest, ShowApisOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApisOverviewRequest.class, ShowApisOverviewResponse.class)
                .withName("ShowApisOverview")
                .withUri("/v1/{project_id}/service/statistic/apis-overview")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowApisOverviewRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisOverviewRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ShowApisOverviewRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisOverviewRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppInfoRequest, ShowAppInfoResponse> showAppInfo = genForshowAppInfo();

    private static HttpRequestDef<ShowAppInfoRequest, ShowAppInfoResponse> genForshowAppInfo() {
        // basic
        HttpRequestDef.Builder<ShowAppInfoRequest, ShowAppInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppInfoRequest.class, ShowAppInfoResponse.class)
                .withName("ShowAppInfo")
                .withUri("/v1/{project_id}/service/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppInfoRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppInfoRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ShowAppInfoRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppInfoRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowAppInfoRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplyDetailRequest, ShowApplyDetailResponse> showApplyDetail =
        genForshowApplyDetail();

    private static HttpRequestDef<ShowApplyDetailRequest, ShowApplyDetailResponse> genForshowApplyDetail() {
        // basic
        HttpRequestDef.Builder<ShowApplyDetailRequest, ShowApplyDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplyDetailRequest.class, ShowApplyDetailResponse.class)
                .withName("ShowApplyDetail")
                .withUri("/v1/{project_id}/service/applys/{apply_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("apply_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplyDetailRequest::getApplyId, (req, v) -> {
                req.setApplyId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplyDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppsDashboardRequest, ShowAppsDashboardResponse> showAppsDashboard =
        genForshowAppsDashboard();

    private static HttpRequestDef<ShowAppsDashboardRequest, ShowAppsDashboardResponse> genForshowAppsDashboard() {
        // basic
        HttpRequestDef.Builder<ShowAppsDashboardRequest, ShowAppsDashboardResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppsDashboardRequest.class, ShowAppsDashboardResponse.class)
                .withName("ShowAppsDashboard")
                .withUri("/v1/{project_id}/service/statistic/apps-dashboards")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowAppsDashboardRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsDashboardRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ShowAppsDashboardRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsDashboardRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppsDetailRequest, ShowAppsDetailResponse> showAppsDetail =
        genForshowAppsDetail();

    private static HttpRequestDef<ShowAppsDetailRequest, ShowAppsDetailResponse> genForshowAppsDetail() {
        // basic
        HttpRequestDef.Builder<ShowAppsDetailRequest, ShowAppsDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppsDetailRequest.class, ShowAppsDetailResponse.class)
                .withName("ShowAppsDetail")
                .withUri("/v1/{project_id}/service/statistic/apps-detail/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowAppsDetailRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsDetailRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ShowAppsDetailRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsDetailRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppsOverviewRequest, ShowAppsOverviewResponse> showAppsOverview =
        genForshowAppsOverview();

    private static HttpRequestDef<ShowAppsOverviewRequest, ShowAppsOverviewResponse> genForshowAppsOverview() {
        // basic
        HttpRequestDef.Builder<ShowAppsOverviewRequest, ShowAppsOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppsOverviewRequest.class, ShowAppsOverviewResponse.class)
                .withName("ShowAppsOverview")
                .withUri("/v1/{project_id}/service/statistic/apps-overview")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ShowAppsOverviewRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsOverviewRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ShowAppsOverviewRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsOverviewRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse> showAtomicIndexById =
        genForshowAtomicIndexById();

    private static HttpRequestDef<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse> genForshowAtomicIndexById() {
        // basic
        HttpRequestDef.Builder<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAtomicIndexByIdRequest.class, ShowAtomicIndexByIdResponse.class)
                .withName("ShowAtomicIndexById")
                .withUri("/v2/{project_id}/design/atomic-indexs/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAtomicIndexByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAtomicIndexByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAtomicIndexByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse> showBizCatalogDetail =
        genForshowBizCatalogDetail();

    private static HttpRequestDef<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse> genForshowBizCatalogDetail() {
        // basic
        HttpRequestDef.Builder<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBizCatalogDetailRequest.class, ShowBizCatalogDetailResponse.class)
            .withName("ShowBizCatalogDetail")
            .withUri("/v2/{project_id}/design/biz/catalogs/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBizCatalogDetailRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBizCatalogDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse> showBizMetricById =
        genForshowBizMetricById();

    private static HttpRequestDef<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse> genForshowBizMetricById() {
        // basic
        HttpRequestDef.Builder<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBizMetricByIdRequest.class, ShowBizMetricByIdResponse.class)
                .withName("ShowBizMetricById")
                .withUri("/v2/{project_id}/design/biz-metrics/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBizMetricByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowBizMetricByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBizMetricByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse> showBusinessAssets =
        genForshowBusinessAssets();

    private static HttpRequestDef<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse> genForshowBusinessAssets() {
        // basic
        HttpRequestDef.Builder<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowBusinessAssetsRequest.class, ShowBusinessAssetsResponse.class)
                .withName("ShowBusinessAssets")
                .withUri("/v3/{project_id}/asset/business-assets/search")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBusinessAssetsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<BusinessAssetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessAssetRequest.class),
            f -> f.withMarshaller(ShowBusinessAssetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse> showBusinessAssetsStatistic =
        genForshowBusinessAssetsStatistic();

    private static HttpRequestDef<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse> genForshowBusinessAssetsStatistic() {
        // basic
        HttpRequestDef.Builder<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBusinessAssetsStatisticRequest.class,
                    ShowBusinessAssetsStatisticResponse.class)
                .withName("ShowBusinessAssetsStatistic")
                .withUri("/v3/{project_id}/asset/statistic/assets/business-assets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBusinessAssetsStatisticRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBusinessAssetsStatisticRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBusinessAssetsStatisticRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCatalogDetailRequest, ShowCatalogDetailResponse> showCatalogDetail =
        genForshowCatalogDetail();

    private static HttpRequestDef<ShowCatalogDetailRequest, ShowCatalogDetailResponse> genForshowCatalogDetail() {
        // basic
        HttpRequestDef.Builder<ShowCatalogDetailRequest, ShowCatalogDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCatalogDetailRequest.class, ShowCatalogDetailResponse.class)
                .withName("ShowCatalogDetail")
                .withUri("/v1/{project_id}/service/servicecatalogs/{catalog_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("catalog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCatalogDetailRequest::getCatalogId, (req, v) -> {
                req.setCatalogId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCatalogDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse> showCodeTableById =
        genForshowCodeTableById();

    private static HttpRequestDef<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse> genForshowCodeTableById() {
        // basic
        HttpRequestDef.Builder<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCodeTableByIdRequest.class, ShowCodeTableByIdResponse.class)
                .withName("ShowCodeTableById")
                .withUri("/v2/{project_id}/design/code-tables/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCodeTableByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCodeTableByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse> showCompoundMetricById =
        genForshowCompoundMetricById();

    private static HttpRequestDef<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse> genForshowCompoundMetricById() {
        // basic
        HttpRequestDef.Builder<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCompoundMetricByIdRequest.class, ShowCompoundMetricByIdResponse.class)
            .withName("ShowCompoundMetricById")
            .withUri("/v2/{project_id}/design/compound-metrics/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompoundMetricByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowCompoundMetricByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompoundMetricByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConditionByIdRequest, ShowConditionByIdResponse> showConditionById =
        genForshowConditionById();

    private static HttpRequestDef<ShowConditionByIdRequest, ShowConditionByIdResponse> genForshowConditionById() {
        // basic
        HttpRequestDef.Builder<ShowConditionByIdRequest, ShowConditionByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConditionByIdRequest.class, ShowConditionByIdResponse.class)
                .withName("ShowConditionById")
                .withUri("/v2/{project_id}/design/conditions/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConditionByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowConditionByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConditionByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse> showConsistencyTaskDetail =
        genForshowConsistencyTaskDetail();

    private static HttpRequestDef<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse> genForshowConsistencyTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConsistencyTaskDetailRequest.class,
                    ShowConsistencyTaskDetailResponse.class)
                .withName("ShowConsistencyTaskDetail")
                .withUri("/v2/{project_id}/quality/consistency-tasks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsistencyTaskDetailRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsistencyTaskDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataProfileRequest, ShowDataProfileResponse> showDataProfile =
        genForshowDataProfile();

    private static HttpRequestDef<ShowDataProfileRequest, ShowDataProfileResponse> genForshowDataProfile() {
        // basic
        HttpRequestDef.Builder<ShowDataProfileRequest, ShowDataProfileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataProfileRequest.class, ShowDataProfileResponse.class)
                .withName("ShowDataProfile")
                .withUri("/v3/{project_id}/asset/profile")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dw_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getDwId, (req, v) -> {
                req.setDwId(v);
            }));
        builder.<String>withRequestField("db_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getDbType, (req, v) -> {
                req.setDbType(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataconnectionRequest, ShowDataconnectionResponse> showDataconnection =
        genForshowDataconnection();

    private static HttpRequestDef<ShowDataconnectionRequest, ShowDataconnectionResponse> genForshowDataconnection() {
        // basic
        HttpRequestDef.Builder<ShowDataconnectionRequest, ShowDataconnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataconnectionRequest.class, ShowDataconnectionResponse.class)
                .withName("ShowDataconnection")
                .withUri("/v1/{project_id}/data-connections/{data_connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataconnectionRequest::getDataConnectionId, (req, v) -> {
                req.setDataConnectionId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataconnectionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse> showDerivativeIndexById =
        genForshowDerivativeIndexById();

    private static HttpRequestDef<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse> genForshowDerivativeIndexById() {
        // basic
        HttpRequestDef.Builder<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDerivativeIndexByIdRequest.class, ShowDerivativeIndexByIdResponse.class)
            .withName("ShowDerivativeIndexById")
            .withUri("/v2/{project_id}/design/derivative-indexs/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDerivativeIndexByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDerivativeIndexByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDerivativeIndexByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDimensionByIdRequest, ShowDimensionByIdResponse> showDimensionById =
        genForshowDimensionById();

    private static HttpRequestDef<ShowDimensionByIdRequest, ShowDimensionByIdResponse> genForshowDimensionById() {
        // basic
        HttpRequestDef.Builder<ShowDimensionByIdRequest, ShowDimensionByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDimensionByIdRequest.class, ShowDimensionByIdResponse.class)
                .withName("ShowDimensionById")
                .withUri("/v2/{project_id}/design/dimensions/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDimensionByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDimensionByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDimensionByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse> showDimensionLogicTableById =
        genForshowDimensionLogicTableById();

    private static HttpRequestDef<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse> genForshowDimensionLogicTableById() {
        // basic
        HttpRequestDef.Builder<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDimensionLogicTableByIdRequest.class,
                    ShowDimensionLogicTableByIdResponse.class)
                .withName("ShowDimensionLogicTableById")
                .withUri("/v2/{project_id}/design/dimension-logic-tables/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDimensionLogicTableByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDimensionLogicTableByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDimensionLogicTableByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEntitiesRequest, ShowEntitiesResponse> showEntities = genForshowEntities();

    private static HttpRequestDef<ShowEntitiesRequest, ShowEntitiesResponse> genForshowEntities() {
        // basic
        HttpRequestDef.Builder<ShowEntitiesRequest, ShowEntitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowEntitiesRequest.class, ShowEntitiesResponse.class)
                .withName("ShowEntities")
                .withUri("/v3/{project_id}/asset/entities/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEntitiesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<OpenEntitySearchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenEntitySearchRequest.class),
            f -> f.withMarshaller(ShowEntitiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse> showEntityInfoByGuid =
        genForshowEntityInfoByGuid();

    private static HttpRequestDef<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse> genForshowEntityInfoByGuid() {
        // basic
        HttpRequestDef.Builder<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEntityInfoByGuidRequest.class, ShowEntityInfoByGuidResponse.class)
            .withName("ShowEntityInfoByGuid")
            .withUri("/v3/{project_id}/asset/entities/{guid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEntityInfoByGuidRequest::getGuid, (req, v) -> {
                req.setGuid(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEntityInfoByGuidRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse> showFactLogicTableById =
        genForshowFactLogicTableById();

    private static HttpRequestDef<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse> genForshowFactLogicTableById() {
        // basic
        HttpRequestDef.Builder<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowFactLogicTableByIdRequest.class, ShowFactLogicTableByIdResponse.class)
            .withName("ShowFactLogicTableById")
            .withUri("/v2/{project_id}/design/fact-logic-tables/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactLogicTableByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowFactLogicTableByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactLogicTableByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGlossaryListRequest, ShowGlossaryListResponse> showGlossaryList =
        genForshowGlossaryList();

    private static HttpRequestDef<ShowGlossaryListRequest, ShowGlossaryListResponse> genForshowGlossaryList() {
        // basic
        HttpRequestDef.Builder<ShowGlossaryListRequest, ShowGlossaryListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGlossaryListRequest.class, ShowGlossaryListResponse.class)
                .withName("ShowGlossaryList")
                .withUri("/v3/{project_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("create_user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getCreateUser, (req, v) -> {
                req.setCreateUser(v);
            }));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<String>withRequestField("end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getEnd, (req, v) -> {
                req.setEnd(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getSortBy, (req, v) -> {
                req.setSortBy(v);
            }));
        builder.<String>withRequestField("sort_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getSortOrder, (req, v) -> {
                req.setSortOrder(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceLogRequest, ShowInstanceLogResponse> showInstanceLog =
        genForshowInstanceLog();

    private static HttpRequestDef<ShowInstanceLogRequest, ShowInstanceLogResponse> genForshowInstanceLog() {
        // basic
        HttpRequestDef.Builder<ShowInstanceLogRequest, ShowInstanceLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowInstanceLogRequest.class, ShowInstanceLogResponse.class)
                .withName("ShowInstanceLog")
                .withUri("/v3/{project_id}/metadata/tasks/{task_id}/{instance_id}/log")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceLogRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceLogRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<JobLogRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobLogRequest.class),
            f -> f.withMarshaller(ShowInstanceLogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceResultRequest, ShowInstanceResultResponse> showInstanceResult =
        genForshowInstanceResult();

    private static HttpRequestDef<ShowInstanceResultRequest, ShowInstanceResultResponse> genForshowInstanceResult() {
        // basic
        HttpRequestDef.Builder<ShowInstanceResultRequest, ShowInstanceResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceResultRequest.class, ShowInstanceResultResponse.class)
                .withName("ShowInstanceResult")
                .withUri("/v2/{project_id}/quality/instances/{instance_id}/result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceResultRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceResultRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessageDetailRequest, ShowMessageDetailResponse> showMessageDetail =
        genForshowMessageDetail();

    private static HttpRequestDef<ShowMessageDetailRequest, ShowMessageDetailResponse> genForshowMessageDetail() {
        // basic
        HttpRequestDef.Builder<ShowMessageDetailRequest, ShowMessageDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMessageDetailRequest.class, ShowMessageDetailResponse.class)
                .withName("ShowMessageDetail")
                .withUri("/v1/{project_id}/service/messages/{message_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("message_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessageDetailRequest::getMessageId, (req, v) -> {
                req.setMessageId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessageDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricAssetsRequest, ShowMetricAssetsResponse> showMetricAssets =
        genForshowMetricAssets();

    private static HttpRequestDef<ShowMetricAssetsRequest, ShowMetricAssetsResponse> genForshowMetricAssets() {
        // basic
        HttpRequestDef.Builder<ShowMetricAssetsRequest, ShowMetricAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMetricAssetsRequest.class, ShowMetricAssetsResponse.class)
                .withName("ShowMetricAssets")
                .withUri("/v3/{project_id}/asset/metric-assets/search")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricAssetsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<MetricOpenSearchParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricOpenSearchParams.class),
            f -> f.withMarshaller(ShowMetricAssetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricTreeRequest, ShowMetricTreeResponse> showMetricTree =
        genForshowMetricTree();

    private static HttpRequestDef<ShowMetricTreeRequest, ShowMetricTreeResponse> genForshowMetricTree() {
        // basic
        HttpRequestDef.Builder<ShowMetricTreeRequest, ShowMetricTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetricTreeRequest.class, ShowMetricTreeResponse.class)
                .withName("ShowMetricTree")
                .withUri("/v3/{project_id}/asset/metric-tree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricTreeRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPathByIdRequest, ShowPathByIdResponse> showPathById = genForshowPathById();

    private static HttpRequestDef<ShowPathByIdRequest, ShowPathByIdResponse> genForshowPathById() {
        // basic
        HttpRequestDef.Builder<ShowPathByIdRequest, ShowPathByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPathByIdRequest.class, ShowPathByIdResponse.class)
                .withName("ShowPathById")
                .withUri("/v1/{project_id}/service/servicecatalogs/{catalog_id}/paths")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("catalog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPathByIdRequest::getCatalogId, (req, v) -> {
                req.setCatalogId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPathByIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPathByIdRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPathByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse> showPathObjectById =
        genForshowPathObjectById();

    private static HttpRequestDef<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse> genForshowPathObjectById() {
        // basic
        HttpRequestDef.Builder<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPathObjectByIdRequest.class, ShowPathObjectByIdResponse.class)
                .withName("ShowPathObjectById")
                .withUri("/v1/{project_id}/service/servicecatalogs/{catalog_id}/layerpaths")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("catalog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getCatalogId, (req, v) -> {
                req.setCatalogId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse> showQualityTaskDetail =
        genForshowQualityTaskDetail();

    private static HttpRequestDef<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse> genForshowQualityTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowQualityTaskDetailRequest.class, ShowQualityTaskDetailResponse.class)
            .withName("ShowQualityTaskDetail")
            .withUri("/v2/{project_id}/quality/quality-tasks/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQualityTaskDetailRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQualityTaskDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRelationByIdRequest, ShowRelationByIdResponse> showRelationById =
        genForshowRelationById();

    private static HttpRequestDef<ShowRelationByIdRequest, ShowRelationByIdResponse> genForshowRelationById() {
        // basic
        HttpRequestDef.Builder<ShowRelationByIdRequest, ShowRelationByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRelationByIdRequest.class, ShowRelationByIdResponse.class)
                .withName("ShowRelationById")
                .withUri("/v2/{project_id}/design/relation/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRelationByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRelationByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRelationByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStandardByIdRequest, ShowStandardByIdResponse> showStandardById =
        genForshowStandardById();

    private static HttpRequestDef<ShowStandardByIdRequest, ShowStandardByIdResponse> genForshowStandardById() {
        // basic
        HttpRequestDef.Builder<ShowStandardByIdRequest, ShowStandardByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStandardByIdRequest.class, ShowStandardByIdResponse.class)
                .withName("ShowStandardById")
                .withUri("/v2/{project_id}/design/standards/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStandardByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStandardByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStandardTemplateRequest, ShowStandardTemplateResponse> showStandardTemplate =
        genForshowStandardTemplate();

    private static HttpRequestDef<ShowStandardTemplateRequest, ShowStandardTemplateResponse> genForshowStandardTemplate() {
        // basic
        HttpRequestDef.Builder<ShowStandardTemplateRequest, ShowStandardTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowStandardTemplateRequest.class, ShowStandardTemplateResponse.class)
            .withName("ShowStandardTemplate")
            .withUri("/v2/{project_id}/design/standards/templates")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStandardTemplateRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStandardTemplateRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStandardTemplateRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableModelByIdRequest, ShowTableModelByIdResponse> showTableModelById =
        genForshowTableModelById();

    private static HttpRequestDef<ShowTableModelByIdRequest, ShowTableModelByIdResponse> genForshowTableModelById() {
        // basic
        HttpRequestDef.Builder<ShowTableModelByIdRequest, ShowTableModelByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTableModelByIdRequest.class, ShowTableModelByIdResponse.class)
                .withName("ShowTableModelById")
                .withUri("/v2/{project_id}/design/table-model/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableModelByIdRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTableModelByIdRequest::getLatest, (req, v) -> {
                req.setLatest(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableModelByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInfoRequest, ShowTaskInfoResponse> showTaskInfo = genForshowTaskInfo();

    private static HttpRequestDef<ShowTaskInfoRequest, ShowTaskInfoResponse> genForshowTaskInfo() {
        // basic
        HttpRequestDef.Builder<ShowTaskInfoRequest, ShowTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskInfoRequest.class, ShowTaskInfoResponse.class)
                .withName("ShowTaskInfo")
                .withUri("/v3/{project_id}/metadata/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInfoRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInfoRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskListRequest, ShowTaskListResponse> showTaskList = genForshowTaskList();

    private static HttpRequestDef<ShowTaskListRequest, ShowTaskListResponse> genForshowTaskList() {
        // basic
        HttpRequestDef.Builder<ShowTaskListRequest, ShowTaskListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowTaskListRequest.class, ShowTaskListResponse.class)
                .withName("ShowTaskList")
                .withUri("/v3/{project_id}/metadata/tasks/search")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskListRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<QueryTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTaskRequest.class),
            f -> f.withMarshaller(ShowTaskListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse> showTechnicalAssetsStatistic =
        genForshowTechnicalAssetsStatistic();

    private static HttpRequestDef<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse> genForshowTechnicalAssetsStatistic() {
        // basic
        HttpRequestDef.Builder<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTechnicalAssetsStatisticRequest.class,
                    ShowTechnicalAssetsStatisticResponse.class)
                .withName("ShowTechnicalAssetsStatistic")
                .withUri("/v3/{project_id}/asset/statistic/assets/technical-assets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTechnicalAssetsStatisticRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTechnicalAssetsStatisticRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTechnicalAssetsStatisticRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTechnicalAssetsStatisticRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse> showTemplatesDetail =
        genForshowTemplatesDetail();

    private static HttpRequestDef<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse> genForshowTemplatesDetail() {
        // basic
        HttpRequestDef.Builder<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplatesDetailRequest.class, ShowTemplatesDetailResponse.class)
                .withName("ShowTemplatesDetail")
                .withUri("/v2/{project_id}/quality/rule-templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTemplatesDetailRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplatesDetailRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse> showUnrelatedTable =
        genForshowUnrelatedTable();

    private static HttpRequestDef<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse> genForshowUnrelatedTable() {
        // basic
        HttpRequestDef.Builder<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowUnrelatedTableRequest.class, ShowUnrelatedTableResponse.class)
                .withName("ShowUnrelatedTable")
                .withUri("/v3/{project_id}/lineage/search/unrelated/table")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUnrelatedTableRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<SearchParametersExt>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchParametersExt.class),
            f -> f.withMarshaller(ShowUnrelatedTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpace =
        genForshowWorkSpace();

    private static HttpRequestDef<ShowWorkSpaceRequest, ShowWorkSpaceResponse> genForshowWorkSpace() {
        // basic
        HttpRequestDef.Builder<ShowWorkSpaceRequest, ShowWorkSpaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkSpaceRequest.class, ShowWorkSpaceResponse.class)
                .withName("ShowWorkSpace")
                .withUri("/v1/{project_id}/workspaces/{instance_id}/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkSpaceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkSpaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse> showWorkspaceDetailById =
        genForshowWorkspaceDetailById();

    private static HttpRequestDef<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse> genForshowWorkspaceDetailById() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkspaceDetailByIdRequest.class, ShowWorkspaceDetailByIdResponse.class)
            .withName("ShowWorkspaceDetailById")
            .withUri("/v2/{project_id}/design/workspaces/{model_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkspaceDetailByIdRequest::getModelId, (req, v) -> {
                req.setModelId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkspaceDetailByIdRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForupdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForupdateApp() {
        // basic
        HttpRequestDef.Builder<UpdateAppRequest, UpdateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppRequest.class, UpdateAppResponse.class)
                .withName("UpdateApp")
                .withUri("/v1/{project_id}/service/apps/{app_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<UpdateAppRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(UpdateAppRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<AppUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AppUpdateDTO.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBizMetricRequest, UpdateBizMetricResponse> updateBizMetric =
        genForupdateBizMetric();

    private static HttpRequestDef<UpdateBizMetricRequest, UpdateBizMetricResponse> genForupdateBizMetric() {
        // basic
        HttpRequestDef.Builder<UpdateBizMetricRequest, UpdateBizMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBizMetricRequest.class, UpdateBizMetricResponse.class)
                .withName("UpdateBizMetric")
                .withUri("/v2/{project_id}/design/biz-metrics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBizMetricRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<BizMetricVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizMetricVO.class),
            f -> f.withMarshaller(UpdateBizMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalog =
        genForupdateCatalog();

    private static HttpRequestDef<UpdateCatalogRequest, UpdateCatalogResponse> genForupdateCatalog() {
        // basic
        HttpRequestDef.Builder<UpdateCatalogRequest, UpdateCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCatalogRequest.class, UpdateCatalogResponse.class)
                .withName("UpdateCatalog")
                .withUri("/v1/{project_id}/service/servicecatalogs/{catalog_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("catalog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getCatalogId, (req, v) -> {
                req.setCatalogId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApiCatalogUpdateParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCatalogUpdateParaDTO.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCodeTableRequest, UpdateCodeTableResponse> updateCodeTable =
        genForupdateCodeTable();

    private static HttpRequestDef<UpdateCodeTableRequest, UpdateCodeTableResponse> genForupdateCodeTable() {
        // basic
        HttpRequestDef.Builder<UpdateCodeTableRequest, UpdateCodeTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCodeTableRequest.class, UpdateCodeTableResponse.class)
                .withName("UpdateCodeTable")
                .withUri("/v2/{project_id}/design/code-tables/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCodeTableRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCodeTableRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CodeTableVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeTableVO.class),
            f -> f.withMarshaller(UpdateCodeTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse> updateCodeTableValues =
        genForupdateCodeTableValues();

    private static HttpRequestDef<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse> genForupdateCodeTableValues() {
        // basic
        HttpRequestDef.Builder<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCodeTableValuesRequest.class, UpdateCodeTableValuesResponse.class)
            .withName("UpdateCodeTableValues")
            .withUri("/v2/{project_id}/design/code-tables/{id}/values")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCodeTableValuesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCodeTableValuesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CodeTableFieldValueUpdateVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeTableFieldValueUpdateVO.class),
            f -> f.withMarshaller(UpdateCodeTableValuesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataconnectionRequest, UpdateDataconnectionResponse> updateDataconnection =
        genForupdateDataconnection();

    private static HttpRequestDef<UpdateDataconnectionRequest, UpdateDataconnectionResponse> genForupdateDataconnection() {
        // basic
        HttpRequestDef.Builder<UpdateDataconnectionRequest, UpdateDataconnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDataconnectionRequest.class, UpdateDataconnectionResponse.class)
            .withName("UpdateDataconnection")
            .withUri("/v1/{project_id}/data-connections/{data_connection_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataconnectionRequest::getDataConnectionId, (req, v) -> {
                req.setDataConnectionId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataconnectionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ApigDataSourcesVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigDataSourcesVo.class),
            f -> f.withMarshaller(UpdateDataconnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectory =
        genForupdateDirectory();

    private static HttpRequestDef<UpdateDirectoryRequest, UpdateDirectoryResponse> genForupdateDirectory() {
        // basic
        HttpRequestDef.Builder<UpdateDirectoryRequest, UpdateDirectoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDirectoryRequest.class, UpdateDirectoryResponse.class)
                .withName("UpdateDirectory")
                .withUri("/v2/{project_id}/design/directorys")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDirectoryRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<DirectoryVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DirectoryVO.class),
            f -> f.withMarshaller(UpdateDirectoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStandardRequest, UpdateStandardResponse> updateStandard =
        genForupdateStandard();

    private static HttpRequestDef<UpdateStandardRequest, UpdateStandardResponse> genForupdateStandard() {
        // basic
        HttpRequestDef.Builder<UpdateStandardRequest, UpdateStandardResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStandardRequest.class, UpdateStandardResponse.class)
                .withName("UpdateStandard")
                .withUri("/v2/{project_id}/design/standards/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStandardRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStandardRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<StandElementValueVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementValueVOList.class),
            f -> f.withMarshaller(UpdateStandardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse> updateStandardTemplate =
        genForupdateStandardTemplate();

    private static HttpRequestDef<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse> genForupdateStandardTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStandardTemplateRequest.class, UpdateStandardTemplateResponse.class)
            .withName("UpdateStandardTemplate")
            .withUri("/v2/{project_id}/design/standards/templates")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStandardTemplateRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<StandElementFieldVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementFieldVO.class),
            f -> f.withMarshaller(UpdateStandardTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubjectRequest, UpdateSubjectResponse> updateSubject =
        genForupdateSubject();

    private static HttpRequestDef<UpdateSubjectRequest, UpdateSubjectResponse> genForupdateSubject() {
        // basic
        HttpRequestDef.Builder<UpdateSubjectRequest, UpdateSubjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubjectRequest.class, UpdateSubjectResponse.class)
                .withName("UpdateSubject")
                .withUri("/v2/{project_id}/design/subjects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubjectRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CatalogParamsVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogParamsVO.class),
            f -> f.withMarshaller(UpdateSubjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubjectNewRequest, UpdateSubjectNewResponse> updateSubjectNew =
        genForupdateSubjectNew();

    private static HttpRequestDef<UpdateSubjectNewRequest, UpdateSubjectNewResponse> genForupdateSubjectNew() {
        // basic
        HttpRequestDef.Builder<UpdateSubjectNewRequest, UpdateSubjectNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubjectNewRequest.class, UpdateSubjectNewResponse.class)
                .withName("UpdateSubjectNew")
                .withUri("/v3/{project_id}/design/subjects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubjectNewRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<SubjectParamsVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubjectParamsVO.class),
            f -> f.withMarshaller(UpdateSubjectNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTableModelRequest, UpdateTableModelResponse> updateTableModel =
        genForupdateTableModel();

    private static HttpRequestDef<UpdateTableModelRequest, UpdateTableModelResponse> genForupdateTableModel() {
        // basic
        HttpRequestDef.Builder<UpdateTableModelRequest, UpdateTableModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTableModelRequest.class, UpdateTableModelResponse.class)
                .withName("UpdateTableModel")
                .withUri("/v2/{project_id}/design/table-model")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableModelRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<TableModelUpdateVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableModelUpdateVO.class),
            f -> f.withMarshaller(UpdateTableModelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskInfoRequest, UpdateTaskInfoResponse> updateTaskInfo =
        genForupdateTaskInfo();

    private static HttpRequestDef<UpdateTaskInfoRequest, UpdateTaskInfoResponse> genForupdateTaskInfo() {
        // basic
        HttpRequestDef.Builder<UpdateTaskInfoRequest, UpdateTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskInfoRequest.class, UpdateTaskInfoResponse.class)
                .withName("UpdateTaskInfo")
                .withUri("/v3/{project_id}/metadata/tasks/{task_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskInfoRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskInfoRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<MetadataCollectionTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetadataCollectionTask.class),
            f -> f.withMarshaller(UpdateTaskInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate =
        genForupdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForupdateTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateRequest, UpdateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateRequest.class, UpdateTemplateResponse.class)
                .withName("UpdateTemplate")
                .withUri("/v2/{project_id}/quality/rule-templates/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<TemplateRO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateRO.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse> updateWorkSpaceUserOrGroup =
        genForupdateWorkSpaceUserOrGroup();

    private static HttpRequestDef<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse> genForupdateWorkSpaceUserOrGroup() {
        // basic
        HttpRequestDef.Builder<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateWorkSpaceUserOrGroupRequest.class,
                    UpdateWorkSpaceUserOrGroupResponse.class)
                .withName("UpdateWorkSpaceUserOrGroup")
                .withUri("/v2/{project_id}/{workspace_id}/users/{user_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkSpaceUserOrGroupRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkSpaceUserOrGroupRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<ApigWorkspaceUserDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigWorkspaceUserDto.class),
            f -> f.withMarshaller(UpdateWorkSpaceUserOrGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForupdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForupdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v2/{project_id}/design/workspaces")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<WorkspaceVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkspaceVO.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse> authorizeActionApiToInstance =
        genForauthorizeActionApiToInstance();

    private static HttpRequestDef<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse> genForauthorizeActionApiToInstance() {
        // basic
        HttpRequestDef.Builder<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AuthorizeActionApiToInstanceRequest.class,
                    AuthorizeActionApiToInstanceResponse.class)
                .withName("AuthorizeActionApiToInstance")
                .withUri("/v1/{project_id}/service/apis/authorize/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizeActionApiToInstanceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<AuthorizeActionApiToInstanceRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeActionApiToInstanceRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(AuthorizeActionApiToInstanceRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<ApiParaForAuthToInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiParaForAuthToInstance.class),
            f -> f.withMarshaller(AuthorizeActionApiToInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse> authorizeApiToInstance =
        genForauthorizeApiToInstance();

    private static HttpRequestDef<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse> genForauthorizeApiToInstance() {
        // basic
        HttpRequestDef.Builder<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AuthorizeApiToInstanceRequest.class, AuthorizeApiToInstanceResponse.class)
            .withName("AuthorizeApiToInstance")
            .withUri("/v1/{project_id}/service/apis/{api_id}/instances/{instance_id}/authorize")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<AuthorizeApiToInstanceRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeApiToInstanceRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<ApiParaForAuthorizeToInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiParaForAuthorizeToInstance.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiRequest, CreateApiResponse> createApi = genForcreateApi();

    private static HttpRequestDef<CreateApiRequest, CreateApiResponse> genForcreateApi() {
        // basic
        HttpRequestDef.Builder<CreateApiRequest, CreateApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiRequest.class, CreateApiResponse.class)
                .withName("CreateApi")
                .withUri("/v1/{project_id}/service/apis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<CreateApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(CreateApiRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<Api>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Api.class),
            f -> f.withMarshaller(CreateApiRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugApiRequest, DebugApiResponse> debugApi = genFordebugApi();

    private static HttpRequestDef<DebugApiRequest, DebugApiResponse> genFordebugApi() {
        // basic
        HttpRequestDef.Builder<DebugApiRequest, DebugApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugApiRequest.class, DebugApiResponse.class)
                .withName("DebugApi")
                .withUri("/v1/{project_id}/service/apis/{api_id}/instances/{instance_id}/test")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<DebugApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DebugApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(DebugApiRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<ApiTestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiTestDTO.class),
            f -> f.withMarshaller(DebugApiRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiRequest, DeleteApiResponse> deleteApi = genFordeleteApi();

    private static HttpRequestDef<DeleteApiRequest, DeleteApiResponse> genFordeleteApi() {
        // basic
        HttpRequestDef.Builder<DeleteApiRequest, DeleteApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteApiRequest.class, DeleteApiResponse.class)
                .withName("DeleteApi")
                .withUri("/v1/{project_id}/service/apis/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<DeleteApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(DeleteApiRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteApiRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse> executeApiToInstance =
        genForexecuteApiToInstance();

    private static HttpRequestDef<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse> genForexecuteApiToInstance() {
        // basic
        HttpRequestDef.Builder<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteApiToInstanceRequest.class, ExecuteApiToInstanceResponse.class)
            .withName("ExecuteApiToInstance")
            .withUri("/v1/{project_id}/service/apis/{api_id}/instances/{instance_id}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ExecuteApiToInstanceRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteApiToInstanceRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<ApiActionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiActionDTO.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisRequest, ListApisResponse> listApis = genForlistApis();

    private static HttpRequestDef<ListApisRequest, ListApisResponse> genForlistApis() {
        // basic
        HttpRequestDef.Builder<ListApisRequest, ListApisResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisRequest.class, ListApisResponse.class)
                .withName("ListApis")
                .withUri("/v1/{project_id}/service/apis")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceListRequest, ListInstanceListResponse> listInstanceList =
        genForlistInstanceList();

    private static HttpRequestDef<ListInstanceListRequest, ListInstanceListResponse> genForlistInstanceList() {
        // basic
        HttpRequestDef.Builder<ListInstanceListRequest, ListInstanceListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceListRequest.class, ListInstanceListResponse.class)
                .withName("ListInstanceList")
                .withUri("/v1/{project_id}/service/apis/{api_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceListRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<ListInstanceListRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceListRequest.ActionEnum.class),
            f -> f.withMarshaller(ListInstanceListRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<Boolean>withRequestField("show_all",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstanceListRequest::getShowAll, (req, v) -> {
                req.setShowAll(v);
            }));
        builder.<Boolean>withRequestField("check_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstanceListRequest::getCheckStatus, (req, v) -> {
                req.setCheckStatus(v);
            }));
        builder.<Boolean>withRequestField("check_debug",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstanceListRequest::getCheckDebug, (req, v) -> {
                req.setCheckDebug(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceListRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceListRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ListInstanceListRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceListRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListInstanceListRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishApiRequest, PublishApiResponse> publishApi = genForpublishApi();

    private static HttpRequestDef<PublishApiRequest, PublishApiResponse> genForpublishApi() {
        // basic
        HttpRequestDef.Builder<PublishApiRequest, PublishApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishApiRequest.class, PublishApiResponse.class)
                .withName("PublishApi")
                .withUri("/v1/{project_id}/service/apis/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApiRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<OpenApiParaForPublish>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenApiParaForPublish.class),
            f -> f.withMarshaller(PublishApiRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishApiToInstanceRequest, PublishApiToInstanceResponse> publishApiToInstance =
        genForpublishApiToInstance();

    private static HttpRequestDef<PublishApiToInstanceRequest, PublishApiToInstanceResponse> genForpublishApiToInstance() {
        // basic
        HttpRequestDef.Builder<PublishApiToInstanceRequest, PublishApiToInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, PublishApiToInstanceRequest.class, PublishApiToInstanceResponse.class)
            .withName("PublishApiToInstance")
            .withUri("/v1/{project_id}/service/apis/{api_id}/instances/{instance_id}/publish")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<PublishApiToInstanceRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishApiToInstanceRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));
        builder.<GatewayDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GatewayDTO.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDebugInfoRequest, SearchDebugInfoResponse> searchDebugInfo =
        genForsearchDebugInfo();

    private static HttpRequestDef<SearchDebugInfoRequest, SearchDebugInfoResponse> genForsearchDebugInfo() {
        // basic
        HttpRequestDef.Builder<SearchDebugInfoRequest, SearchDebugInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchDebugInfoRequest.class, SearchDebugInfoResponse.class)
                .withName("SearchDebugInfo")
                .withUri("/v1/{project_id}/service/apis/{api_id}/debug-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<SearchDebugInfoRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchDebugInfoRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchPublishInfoRequest, SearchPublishInfoResponse> searchPublishInfo =
        genForsearchPublishInfo();

    private static HttpRequestDef<SearchPublishInfoRequest, SearchPublishInfoResponse> genForsearchPublishInfo() {
        // basic
        HttpRequestDef.Builder<SearchPublishInfoRequest, SearchPublishInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchPublishInfoRequest.class, SearchPublishInfoResponse.class)
                .withName("SearchPublishInfo")
                .withUri("/v1/{project_id}/service/apis/{api_id}/publish-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<SearchPublishInfoRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchPublishInfoRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getDlmType, (req, v) -> {
                req.setDlmType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiRequest, ShowApiResponse> showApi = genForshowApi();

    private static HttpRequestDef<ShowApiRequest, ShowApiResponse> genForshowApi() {
        // basic
        HttpRequestDef.Builder<ShowApiRequest, ShowApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiRequest.class, ShowApiResponse.class)
                .withName("ShowApi")
                .withUri("/v1/{project_id}/service/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiRequest, UpdateApiResponse> updateApi = genForupdateApi();

    private static HttpRequestDef<UpdateApiRequest, UpdateApiResponse> genForupdateApi() {
        // basic
        HttpRequestDef.Builder<UpdateApiRequest, UpdateApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiRequest.class, UpdateApiResponse.class)
                .withName("UpdateApi")
                .withUri("/v1/{project_id}/service/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<Api>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Api.class),
            f -> f.withMarshaller(UpdateApiRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
