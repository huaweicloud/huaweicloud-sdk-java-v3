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
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteBaseDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteRulesBaseDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BatchDeleteSecrecyLevelDTO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.BehaviorRestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BizCatalogVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BizMetricVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BulkSecurityLevel;
import com.huaweicloud.sdk.dataartsstudio.v1.model.BusinessAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CancelFactoryPackagesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CancelFactoryPackagesRequestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CancelFactoryPackagesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CatalogInfo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CatalogLevelVOList;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CatalogMetaDataEventRequest;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryEnvRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryEnvResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryJobRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactoryJobResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceRequestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateFactorySupplementDataInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateManagerWorkSpaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateManagerWorkSpaceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateAssetRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateAssetResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateEntitiesRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateOrUpdateEntitiesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateSecrecyLevelDTO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateWorkspaceParams;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.CustomizedFieldsVOList;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DataClassificationRuleEnableDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DataClassificationRuleOperateDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DataEntityWithExtInfo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DataProfileRO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeployFactoryPackagesRequestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DeployFactoryPackagesResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.DirectoryVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.EntityWithExtInfo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.EnvRequestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteTaskActionRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ExecuteTaskActionResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.GatewayDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.IdsParam;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportCatalogsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportCatalogsRequestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportCatalogsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportLineageRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportLineageResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportModelsRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportModelsRequestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportModelsResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportResultRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ImportResultResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.InitializeStandardTemplateRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.InitializeStandardTemplateResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.JobAndNodeInfo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.JobInfoRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.JobLogRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.LinkAttributeAndElementVO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListReleasePackagesRequestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSchemasRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ListSchemasResponse;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.ObjectIdInfo;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenApiParaForCheckMessage;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenApiParaForPublish;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenApplyIdsForApproveApply;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenBulkClassifications;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenClassification;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OpenEntitySearchRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.OrderReq;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ParseUserBehaviorRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ParseUserBehaviorResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PayForDgcOneKeyRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PayForDgcOneKeyResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PermissionSetCreateDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PermissionSetMemberCreateDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PermissionSetPermissionCreateDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PermissionSetPermissionUpdateDTO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiToInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.PublishApiToInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.QueryTaskRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RenewDataProfileRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RenewDataProfileResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ResetLinkAttributeAndStandardRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.ResetLinkAttributeAndStandardResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.RoleActionQueryDTO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchParameter;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SearchParametersExt;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.SetJobTagsRequestBody;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.StandElementFieldVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.StandElementFieldVOList;
import com.huaweicloud.sdk.dataartsstudio.v1.model.StandElementValueVOList;
import com.huaweicloud.sdk.dataartsstudio.v1.model.StopFactorySupplementDataInstanceRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.StopFactorySupplementDataInstanceResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.SubjectParamsVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.TableLineage;
import com.huaweicloud.sdk.dataartsstudio.v1.model.TableModelUpdateVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.TableModelVO;
import com.huaweicloud.sdk.dataartsstudio.v1.model.TagRequest;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameRequest;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameRequestBody;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateFactoryJobNameResponse;
import com.huaweicloud.sdk.dataartsstudio.v1.model.UpdateSecrecyLevelDTO;
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
import com.huaweicloud.sdk.dataartsstudio.v1.model.WorkspaceVO;

import java.math.BigDecimal;
import java.util.List;

@SuppressWarnings("unchecked")
public class DataArtsStudioMeta {

    public static final HttpRequestDef<AddTagToAssetRequest, AddTagToAssetResponse> addTagToAsset =
        genForAddTagToAsset();

    private static HttpRequestDef<AddTagToAssetRequest, AddTagToAssetResponse> genForAddTagToAsset() {
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
            f -> f.withMarshaller(AddTagToAssetRequest::getTermGuid, AddTagToAssetRequest::setTermGuid));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTagToAssetRequest::getWorkspace, AddTagToAssetRequest::setWorkspace));
        builder.<CatalogInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogInfo.class),
            f -> f.withMarshaller(AddTagToAssetRequest::getBody, AddTagToAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse> addWorkSpaceUsers =
        genForAddWorkSpaceUsers();

    private static HttpRequestDef<AddWorkSpaceUsersRequest, AddWorkSpaceUsersResponse> genForAddWorkSpaceUsers() {
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
            f -> f.withMarshaller(AddWorkSpaceUsersRequest::getWorkspaceId, AddWorkSpaceUsersRequest::setWorkspaceId));
        builder.<ApigWorkspaceUserDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigWorkspaceUserDto.class),
            f -> f.withMarshaller(AddWorkSpaceUsersRequest::getBody, AddWorkSpaceUsersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse> associateClassificationToEntity =
        genForAssociateClassificationToEntity();

    private static HttpRequestDef<AssociateClassificationToEntityRequest, AssociateClassificationToEntityResponse> genForAssociateClassificationToEntity() {
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
            f -> f.withMarshaller(AssociateClassificationToEntityRequest::getGuid,
                AssociateClassificationToEntityRequest::setGuid));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateClassificationToEntityRequest::getWorkspace,
                AssociateClassificationToEntityRequest::setWorkspace));
        builder.<OpenClassification>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenClassification.class),
            f -> f.withMarshaller(AssociateClassificationToEntityRequest::getBody,
                AssociateClassificationToEntityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse> associateSecurityLevelToEntitie =
        genForAssociateSecurityLevelToEntitie();

    private static HttpRequestDef<AssociateSecurityLevelToEntitieRequest, AssociateSecurityLevelToEntitieResponse> genForAssociateSecurityLevelToEntitie() {
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
            f -> f.withMarshaller(AssociateSecurityLevelToEntitieRequest::getGuid,
                AssociateSecurityLevelToEntitieRequest::setGuid));
        builder.<String>withRequestField("security-level",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSecurityLevelToEntitieRequest::getSecurityLevel,
                AssociateSecurityLevelToEntitieRequest::setSecurityLevel));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSecurityLevelToEntitieRequest::getWorkspace,
                AssociateSecurityLevelToEntitieRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchApproveApplyRequest, BatchApproveApplyResponse> batchApproveApply =
        genForBatchApproveApply();

    private static HttpRequestDef<BatchApproveApplyRequest, BatchApproveApplyResponse> genForBatchApproveApply() {
        // basic
        HttpRequestDef.Builder<BatchApproveApplyRequest, BatchApproveApplyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchApproveApplyRequest.class, BatchApproveApplyResponse.class)
                .withName("BatchApproveApply")
                .withUri("/v1/{project_id}/service/applys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchApproveApplyRequest::getWorkspace, BatchApproveApplyRequest::setWorkspace));
        builder.<BatchApproveApplyRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchApproveApplyRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(BatchApproveApplyRequest::getDlmType, BatchApproveApplyRequest::setDlmType));
        builder.<OpenApplyIdsForApproveApply>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenApplyIdsForApproveApply.class),
            f -> f.withMarshaller(BatchApproveApplyRequest::getBody, BatchApproveApplyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse> batchAssociateClassificationToEntities =
        genForBatchAssociateClassificationToEntities();

    private static HttpRequestDef<BatchAssociateClassificationToEntitiesRequest, BatchAssociateClassificationToEntitiesResponse> genForBatchAssociateClassificationToEntities() {
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
            f -> f.withMarshaller(BatchAssociateClassificationToEntitiesRequest::getWorkspace,
                BatchAssociateClassificationToEntitiesRequest::setWorkspace));
        builder.<OpenBulkClassifications>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenBulkClassifications.class),
            f -> f.withMarshaller(BatchAssociateClassificationToEntitiesRequest::getBody,
                BatchAssociateClassificationToEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse> batchAssociateSecurityLevelToEntities =
        genForBatchAssociateSecurityLevelToEntities();

    private static HttpRequestDef<BatchAssociateSecurityLevelToEntitiesRequest, BatchAssociateSecurityLevelToEntitiesResponse> genForBatchAssociateSecurityLevelToEntities() {
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
            f -> f.withMarshaller(BatchAssociateSecurityLevelToEntitiesRequest::getWorkspace,
                BatchAssociateSecurityLevelToEntitiesRequest::setWorkspace));
        builder.<BulkSecurityLevel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BulkSecurityLevel.class),
            f -> f.withMarshaller(BatchAssociateSecurityLevelToEntitiesRequest::getBody,
                BatchAssociateSecurityLevelToEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSecurityDataClassificationRuleRequest, BatchDeleteSecurityDataClassificationRuleResponse> batchDeleteSecurityDataClassificationRule =
        genForBatchDeleteSecurityDataClassificationRule();

    private static HttpRequestDef<BatchDeleteSecurityDataClassificationRuleRequest, BatchDeleteSecurityDataClassificationRuleResponse> genForBatchDeleteSecurityDataClassificationRule() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSecurityDataClassificationRuleRequest, BatchDeleteSecurityDataClassificationRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteSecurityDataClassificationRuleRequest.class,
                    BatchDeleteSecurityDataClassificationRuleResponse.class)
                .withName("BatchDeleteSecurityDataClassificationRule")
                .withUri("/v1/{project_id}/security/data-classification/rule/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSecurityDataClassificationRuleRequest::getWorkspace,
                BatchDeleteSecurityDataClassificationRuleRequest::setWorkspace));
        builder.<BatchDeleteRulesBaseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteRulesBaseDTO.class),
            f -> f.withMarshaller(BatchDeleteSecurityDataClassificationRuleRequest::getBody,
                BatchDeleteSecurityDataClassificationRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSecurityPermissionSetMembersRequest, BatchDeleteSecurityPermissionSetMembersResponse> batchDeleteSecurityPermissionSetMembers =
        genForBatchDeleteSecurityPermissionSetMembers();

    private static HttpRequestDef<BatchDeleteSecurityPermissionSetMembersRequest, BatchDeleteSecurityPermissionSetMembersResponse> genForBatchDeleteSecurityPermissionSetMembers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSecurityPermissionSetMembersRequest, BatchDeleteSecurityPermissionSetMembersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteSecurityPermissionSetMembersRequest.class,
                    BatchDeleteSecurityPermissionSetMembersResponse.class)
                .withName("BatchDeleteSecurityPermissionSetMembers")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}/members/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSecurityPermissionSetMembersRequest::getPermissionSetId,
                BatchDeleteSecurityPermissionSetMembersRequest::setPermissionSetId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSecurityPermissionSetMembersRequest::getWorkspace,
                BatchDeleteSecurityPermissionSetMembersRequest::setWorkspace));
        builder.<BatchDeleteBaseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBaseDTO.class),
            f -> f.withMarshaller(BatchDeleteSecurityPermissionSetMembersRequest::getBody,
                BatchDeleteSecurityPermissionSetMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSecurityPermissionSetPermissionsRequest, BatchDeleteSecurityPermissionSetPermissionsResponse> batchDeleteSecurityPermissionSetPermissions =
        genForBatchDeleteSecurityPermissionSetPermissions();

    private static HttpRequestDef<BatchDeleteSecurityPermissionSetPermissionsRequest, BatchDeleteSecurityPermissionSetPermissionsResponse> genForBatchDeleteSecurityPermissionSetPermissions() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSecurityPermissionSetPermissionsRequest, BatchDeleteSecurityPermissionSetPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteSecurityPermissionSetPermissionsRequest.class,
                    BatchDeleteSecurityPermissionSetPermissionsResponse.class)
                .withName("BatchDeleteSecurityPermissionSetPermissions")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}/permissions/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSecurityPermissionSetPermissionsRequest::getPermissionSetId,
                BatchDeleteSecurityPermissionSetPermissionsRequest::setPermissionSetId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSecurityPermissionSetPermissionsRequest::getWorkspace,
                BatchDeleteSecurityPermissionSetPermissionsRequest::setWorkspace));
        builder.<BatchDeleteBaseDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBaseDTO.class),
            f -> f.withMarshaller(BatchDeleteSecurityPermissionSetPermissionsRequest::getBody,
                BatchDeleteSecurityPermissionSetPermissionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSecuritySecrecyLevelsRequest, BatchDeleteSecuritySecrecyLevelsResponse> batchDeleteSecuritySecrecyLevels =
        genForBatchDeleteSecuritySecrecyLevels();

    private static HttpRequestDef<BatchDeleteSecuritySecrecyLevelsRequest, BatchDeleteSecuritySecrecyLevelsResponse> genForBatchDeleteSecuritySecrecyLevels() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSecuritySecrecyLevelsRequest, BatchDeleteSecuritySecrecyLevelsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteSecuritySecrecyLevelsRequest.class,
                    BatchDeleteSecuritySecrecyLevelsResponse.class)
                .withName("BatchDeleteSecuritySecrecyLevels")
                .withUri("/v1/{project_id}/dls/data-classification/secrecy-level/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSecuritySecrecyLevelsRequest::getWorkspace,
                BatchDeleteSecuritySecrecyLevelsRequest::setWorkspace));
        builder.<BatchDeleteSecrecyLevelDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteSecrecyLevelDTO.class),
            f -> f.withMarshaller(BatchDeleteSecuritySecrecyLevelsRequest::getBody,
                BatchDeleteSecuritySecrecyLevelsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse> batchDeleteTemplates =
        genForBatchDeleteTemplates();

    private static HttpRequestDef<BatchDeleteTemplatesRequest, BatchDeleteTemplatesResponse> genForBatchDeleteTemplates() {
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
            f -> f.withMarshaller(BatchDeleteTemplatesRequest::getWorkspace,
                BatchDeleteTemplatesRequest::setWorkspace));
        builder.<TemplateListRO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateListRO.class),
            f -> f.withMarshaller(BatchDeleteTemplatesRequest::getBody, BatchDeleteTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchOfflineRequest, BatchOfflineResponse> batchOffline = genForBatchOffline();

    private static HttpRequestDef<BatchOfflineRequest, BatchOfflineResponse> genForBatchOffline() {
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
            f -> f.withMarshaller(BatchOfflineRequest::getWorkspace, BatchOfflineRequest::setWorkspace));
        builder.<ApprovalBatchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApprovalBatchParam.class),
            f -> f.withMarshaller(BatchOfflineRequest::getBody, BatchOfflineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchPublishRequest, BatchPublishResponse> batchPublish = genForBatchPublish();

    private static HttpRequestDef<BatchPublishRequest, BatchPublishResponse> genForBatchPublish() {
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
            f -> f.withMarshaller(BatchPublishRequest::getWorkspace, BatchPublishRequest::setWorkspace));
        builder.<ApprovalBatchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApprovalBatchParam.class),
            f -> f.withMarshaller(BatchPublishRequest::getBody, BatchPublishRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSyncMetadataRequest, BatchSyncMetadataResponse> batchSyncMetadata =
        genForBatchSyncMetadata();

    private static HttpRequestDef<BatchSyncMetadataRequest, BatchSyncMetadataResponse> genForBatchSyncMetadata() {
        // basic
        HttpRequestDef.Builder<BatchSyncMetadataRequest, BatchSyncMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSyncMetadataRequest.class, BatchSyncMetadataResponse.class)
                .withName("BatchSyncMetadata")
                .withUri("/v1/{project_id}/metadata/async-bulk")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CatalogMetaDataEventRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogMetaDataEventRequest.class),
            f -> f.withMarshaller(BatchSyncMetadataRequest::getBody, BatchSyncMetadataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelFactoryPackagesRequest, CancelFactoryPackagesResponse> cancelFactoryPackages =
        genForCancelFactoryPackages();

    private static HttpRequestDef<CancelFactoryPackagesRequest, CancelFactoryPackagesResponse> genForCancelFactoryPackages() {
        // basic
        HttpRequestDef.Builder<CancelFactoryPackagesRequest, CancelFactoryPackagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelFactoryPackagesRequest.class, CancelFactoryPackagesResponse.class)
            .withName("CancelFactoryPackages")
            .withUri("/v2/{project_id}/factory/release-packages/unpack")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelFactoryPackagesRequest::getWorkspace,
                CancelFactoryPackagesRequest::setWorkspace));
        builder.<CancelFactoryPackagesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CancelFactoryPackagesRequestBody.class),
            f -> f.withMarshaller(CancelFactoryPackagesRequest::getBody, CancelFactoryPackagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeCatalogRequest, ChangeCatalogResponse> changeCatalog =
        genForChangeCatalog();

    private static HttpRequestDef<ChangeCatalogRequest, ChangeCatalogResponse> genForChangeCatalog() {
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
            f -> f.withMarshaller(ChangeCatalogRequest::getWorkspace, ChangeCatalogRequest::setWorkspace));
        builder.<BizCatalogVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizCatalogVO.class),
            f -> f.withMarshaller(ChangeCatalogRequest::getBody, ChangeCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeResourceRequest, ChangeResourceResponse> changeResource =
        genForChangeResource();

    private static HttpRequestDef<ChangeResourceRequest, ChangeResourceResponse> genForChangeResource() {
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
            f -> f.withMarshaller(ChangeResourceRequest::getBody, ChangeResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSubjectsRequest, ChangeSubjectsResponse> changeSubjects =
        genForChangeSubjects();

    private static HttpRequestDef<ChangeSubjectsRequest, ChangeSubjectsResponse> genForChangeSubjects() {
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
            f -> f.withMarshaller(ChangeSubjectsRequest::getWorkspace, ChangeSubjectsRequest::setWorkspace));
        builder.<CatalogLevelVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogLevelVOList.class),
            f -> f.withMarshaller(ChangeSubjectsRequest::getBody, ChangeSubjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDimensionStatusRequest, CheckDimensionStatusResponse> checkDimensionStatus =
        genForCheckDimensionStatus();

    private static HttpRequestDef<CheckDimensionStatusRequest, CheckDimensionStatusResponse> genForCheckDimensionStatus() {
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
            f -> f.withMarshaller(CheckDimensionStatusRequest::getWorkspace,
                CheckDimensionStatusRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse> checkFactLogicTableStatus =
        genForCheckFactLogicTableStatus();

    private static HttpRequestDef<CheckFactLogicTableStatusRequest, CheckFactLogicTableStatusResponse> genForCheckFactLogicTableStatus() {
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
            f -> f.withMarshaller(CheckFactLogicTableStatusRequest::getWorkspace,
                CheckFactLogicTableStatusRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmApprovalsRequest, ConfirmApprovalsResponse> confirmApprovals =
        genForConfirmApprovals();

    private static HttpRequestDef<ConfirmApprovalsRequest, ConfirmApprovalsResponse> genForConfirmApprovals() {
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
            f -> f.withMarshaller(ConfirmApprovalsRequest::getActionId, ConfirmApprovalsRequest::setActionId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmApprovalsRequest::getWorkspace, ConfirmApprovalsRequest::setWorkspace));
        builder.<ApprovalInfoParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApprovalInfoParam.class),
            f -> f.withMarshaller(ConfirmApprovalsRequest::getBody, ConfirmApprovalsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmMessageRequest, ConfirmMessageResponse> confirmMessage =
        genForConfirmMessage();

    private static HttpRequestDef<ConfirmMessageRequest, ConfirmMessageResponse> genForConfirmMessage() {
        // basic
        HttpRequestDef.Builder<ConfirmMessageRequest, ConfirmMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmMessageRequest.class, ConfirmMessageResponse.class)
                .withName("ConfirmMessage")
                .withUri("/v1/{project_id}/service/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmMessageRequest::getWorkspace, ConfirmMessageRequest::setWorkspace));
        builder.<ConfirmMessageRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConfirmMessageRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ConfirmMessageRequest::getDlmType, ConfirmMessageRequest::setDlmType));
        builder.<OpenApiParaForCheckMessage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenApiParaForCheckMessage.class),
            f -> f.withMarshaller(ConfirmMessageRequest::getBody, ConfirmMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountAllModelsRequest, CountAllModelsResponse> countAllModels =
        genForCountAllModels();

    private static HttpRequestDef<CountAllModelsRequest, CountAllModelsResponse> genForCountAllModels() {
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
            f -> f.withMarshaller(CountAllModelsRequest::getWorkspace, CountAllModelsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountOverviewsRequest, CountOverviewsResponse> countOverviews =
        genForCountOverviews();

    private static HttpRequestDef<CountOverviewsRequest, CountOverviewsResponse> genForCountOverviews() {
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
            f -> f.withMarshaller(CountOverviewsRequest::getWorkspace, CountOverviewsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountStandardsRequest, CountStandardsResponse> countStandards =
        genForCountStandards();

    private static HttpRequestDef<CountStandardsRequest, CountStandardsResponse> genForCountStandards() {
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
            f -> f.withMarshaller(CountStandardsRequest::getId, CountStandardsRequest::setId));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountStandardsRequest::getBizType, CountStandardsRequest::setBizType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountStandardsRequest::getWorkspace, CountStandardsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountTableModelsRequest, CountTableModelsResponse> countTableModels =
        genForCountTableModels();

    private static HttpRequestDef<CountTableModelsRequest, CountTableModelsResponse> genForCountTableModels() {
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
            f -> f.withMarshaller(CountTableModelsRequest::getModelId, CountTableModelsRequest::setModelId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTableModelsRequest::getWorkspace, CountTableModelsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v1/{project_id}/service/apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getWorkspace, CreateAppRequest::setWorkspace));
        builder.<CreateAppRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAppRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(CreateAppRequest::getDlmType, CreateAppRequest::setDlmType));
        builder.<AppRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AppRequestDTO.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApproverRequest, CreateApproverResponse> createApprover =
        genForCreateApprover();

    private static HttpRequestDef<CreateApproverRequest, CreateApproverResponse> genForCreateApprover() {
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
            f -> f.withMarshaller(CreateApproverRequest::getWorkspace, CreateApproverRequest::setWorkspace));
        builder.<ApproverParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApproverParam.class),
            f -> f.withMarshaller(CreateApproverRequest::getBody, CreateApproverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBizMetricRequest, CreateBizMetricResponse> createBizMetric =
        genForCreateBizMetric();

    private static HttpRequestDef<CreateBizMetricRequest, CreateBizMetricResponse> genForCreateBizMetric() {
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
            f -> f.withMarshaller(CreateBizMetricRequest::getWorkspace, CreateBizMetricRequest::setWorkspace));
        builder.<BizMetricVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizMetricVO.class),
            f -> f.withMarshaller(CreateBizMetricRequest::getBody, CreateBizMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCatalogRequest, CreateCatalogResponse> createCatalog =
        genForCreateCatalog();

    private static HttpRequestDef<CreateCatalogRequest, CreateCatalogResponse> genForCreateCatalog() {
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
            f -> f.withMarshaller(CreateCatalogRequest::getWorkspace, CreateCatalogRequest::setWorkspace));
        builder.<BizCatalogVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizCatalogVO.class),
            f -> f.withMarshaller(CreateCatalogRequest::getBody, CreateCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCodeTableRequest, CreateCodeTableResponse> createCodeTable =
        genForCreateCodeTable();

    private static HttpRequestDef<CreateCodeTableRequest, CreateCodeTableResponse> genForCreateCodeTable() {
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
            f -> f.withMarshaller(CreateCodeTableRequest::getWorkspace, CreateCodeTableRequest::setWorkspace));
        builder.<CodeTableVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeTableVO.class),
            f -> f.withMarshaller(CreateCodeTableRequest::getBody, CreateCodeTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionsRequest, CreateConnectionsResponse> createConnections =
        genForCreateConnections();

    private static HttpRequestDef<CreateConnectionsRequest, CreateConnectionsResponse> genForCreateConnections() {
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
            f -> f.withMarshaller(CreateConnectionsRequest::getWorkspace, CreateConnectionsRequest::setWorkspace));
        builder.<ApigDataSourcesVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigDataSourcesVo.class),
            f -> f.withMarshaller(CreateConnectionsRequest::getBody, CreateConnectionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDirectoryRequest, CreateDirectoryResponse> createDirectory =
        genForCreateDirectory();

    private static HttpRequestDef<CreateDirectoryRequest, CreateDirectoryResponse> genForCreateDirectory() {
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
            f -> f.withMarshaller(CreateDirectoryRequest::getWorkspace, CreateDirectoryRequest::setWorkspace));
        builder.<DirectoryVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DirectoryVO.class),
            f -> f.withMarshaller(CreateDirectoryRequest::getBody, CreateDirectoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFactoryEnvRequest, CreateFactoryEnvResponse> createFactoryEnv =
        genForCreateFactoryEnv();

    private static HttpRequestDef<CreateFactoryEnvRequest, CreateFactoryEnvResponse> genForCreateFactoryEnv() {
        // basic
        HttpRequestDef.Builder<CreateFactoryEnvRequest, CreateFactoryEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateFactoryEnvRequest.class, CreateFactoryEnvResponse.class)
                .withName("CreateFactoryEnv")
                .withUri("/v2/{project_id}/factory/env")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFactoryEnvRequest::getWorkspace, CreateFactoryEnvRequest::setWorkspace));
        builder.<EnvRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvRequestBody.class),
            f -> f.withMarshaller(CreateFactoryEnvRequest::getBody, CreateFactoryEnvRequest::setBody));

        // response

        builder.<Integer>withResponseField("status_code",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateFactoryEnvResponse::getStatusCode, CreateFactoryEnvResponse::setStatusCode));
        builder.<Boolean>withResponseField("is_success",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(CreateFactoryEnvResponse::getIsSuccess, CreateFactoryEnvResponse::setIsSuccess));
        return builder.build();
    }

    public static final HttpRequestDef<CreateFactoryJobRequest, CreateFactoryJobResponse> createFactoryJob =
        genForCreateFactoryJob();

    private static HttpRequestDef<CreateFactoryJobRequest, CreateFactoryJobResponse> genForCreateFactoryJob() {
        // basic
        HttpRequestDef.Builder<CreateFactoryJobRequest, CreateFactoryJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFactoryJobRequest.class, CreateFactoryJobResponse.class)
                .withName("CreateFactoryJob")
                .withUri("/v2/{project_id}/factory/jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFactoryJobRequest::getWorkspace, CreateFactoryJobRequest::setWorkspace));
        builder.<JobInfoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobInfoRequest.class),
            f -> f.withMarshaller(CreateFactoryJobRequest::getBody, CreateFactoryJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse> createFactorySupplementDataInstance =
        genForCreateFactorySupplementDataInstance();

    private static HttpRequestDef<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse> genForCreateFactorySupplementDataInstance() {
        // basic
        HttpRequestDef.Builder<CreateFactorySupplementDataInstanceRequest, CreateFactorySupplementDataInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateFactorySupplementDataInstanceRequest.class,
                    CreateFactorySupplementDataInstanceResponse.class)
                .withName("CreateFactorySupplementDataInstance")
                .withUri("/v2/{project_id}/factory/supplement-data")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFactorySupplementDataInstanceRequest::getWorkspace,
                CreateFactorySupplementDataInstanceRequest::setWorkspace));
        builder.<CreateFactorySupplementDataInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFactorySupplementDataInstanceRequestBody.class),
            f -> f.withMarshaller(CreateFactorySupplementDataInstanceRequest::getBody,
                CreateFactorySupplementDataInstanceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateFactorySupplementDataInstanceResponse::getXRequestId,
                CreateFactorySupplementDataInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse> createManagerWorkSpace =
        genForCreateManagerWorkSpace();

    private static HttpRequestDef<CreateManagerWorkSpaceRequest, CreateManagerWorkSpaceResponse> genForCreateManagerWorkSpace() {
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
            f -> f.withMarshaller(CreateManagerWorkSpaceRequest::getInstanceId,
                CreateManagerWorkSpaceRequest::setInstanceId));
        builder.<CreateWorkspaceParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkspaceParams.class),
            f -> f.withMarshaller(CreateManagerWorkSpaceRequest::getBody, CreateManagerWorkSpaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse> createOrUpdateAsset =
        genForCreateOrUpdateAsset();

    private static HttpRequestDef<CreateOrUpdateAssetRequest, CreateOrUpdateAssetResponse> genForCreateOrUpdateAsset() {
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
            f -> f.withMarshaller(CreateOrUpdateAssetRequest::getWorkspace, CreateOrUpdateAssetRequest::setWorkspace));
        builder.<EntityWithExtInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EntityWithExtInfo.class),
            f -> f.withMarshaller(CreateOrUpdateAssetRequest::getBody, CreateOrUpdateAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrUpdateEntitiesRequest, CreateOrUpdateEntitiesResponse> createOrUpdateEntities =
        genForCreateOrUpdateEntities();

    private static HttpRequestDef<CreateOrUpdateEntitiesRequest, CreateOrUpdateEntitiesResponse> genForCreateOrUpdateEntities() {
        // basic
        HttpRequestDef.Builder<CreateOrUpdateEntitiesRequest, CreateOrUpdateEntitiesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateOrUpdateEntitiesRequest.class, CreateOrUpdateEntitiesResponse.class)
            .withName("CreateOrUpdateEntities")
            .withUri("/v1/{project_id}/datamap/entities")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrUpdateEntitiesRequest::getInstance,
                CreateOrUpdateEntitiesRequest::setInstance));
        builder.<DataEntityWithExtInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataEntityWithExtInfo.class),
            f -> f.withMarshaller(CreateOrUpdateEntitiesRequest::getBody, CreateOrUpdateEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityDataClassificationRuleRequest, CreateSecurityDataClassificationRuleResponse> createSecurityDataClassificationRule =
        genForCreateSecurityDataClassificationRule();

    private static HttpRequestDef<CreateSecurityDataClassificationRuleRequest, CreateSecurityDataClassificationRuleResponse> genForCreateSecurityDataClassificationRule() {
        // basic
        HttpRequestDef.Builder<CreateSecurityDataClassificationRuleRequest, CreateSecurityDataClassificationRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSecurityDataClassificationRuleRequest.class,
                    CreateSecurityDataClassificationRuleResponse.class)
                .withName("CreateSecurityDataClassificationRule")
                .withUri("/v1/{project_id}/security/data-classification/rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityDataClassificationRuleRequest::getWorkspace,
                CreateSecurityDataClassificationRuleRequest::setWorkspace));
        builder.<DataClassificationRuleOperateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataClassificationRuleOperateDTO.class),
            f -> f.withMarshaller(CreateSecurityDataClassificationRuleRequest::getBody,
                CreateSecurityDataClassificationRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityPermissionSetRequest, CreateSecurityPermissionSetResponse> createSecurityPermissionSet =
        genForCreateSecurityPermissionSet();

    private static HttpRequestDef<CreateSecurityPermissionSetRequest, CreateSecurityPermissionSetResponse> genForCreateSecurityPermissionSet() {
        // basic
        HttpRequestDef.Builder<CreateSecurityPermissionSetRequest, CreateSecurityPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSecurityPermissionSetRequest.class,
                    CreateSecurityPermissionSetResponse.class)
                .withName("CreateSecurityPermissionSet")
                .withUri("/v1/{project_id}/security/permission-sets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityPermissionSetRequest::getWorkspace,
                CreateSecurityPermissionSetRequest::setWorkspace));
        builder.<PermissionSetCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PermissionSetCreateDTO.class),
            f -> f.withMarshaller(CreateSecurityPermissionSetRequest::getBody,
                CreateSecurityPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityPermissionSetMemberRequest, CreateSecurityPermissionSetMemberResponse> createSecurityPermissionSetMember =
        genForCreateSecurityPermissionSetMember();

    private static HttpRequestDef<CreateSecurityPermissionSetMemberRequest, CreateSecurityPermissionSetMemberResponse> genForCreateSecurityPermissionSetMember() {
        // basic
        HttpRequestDef.Builder<CreateSecurityPermissionSetMemberRequest, CreateSecurityPermissionSetMemberResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSecurityPermissionSetMemberRequest.class,
                    CreateSecurityPermissionSetMemberResponse.class)
                .withName("CreateSecurityPermissionSetMember")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityPermissionSetMemberRequest::getPermissionSetId,
                CreateSecurityPermissionSetMemberRequest::setPermissionSetId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityPermissionSetMemberRequest::getWorkspace,
                CreateSecurityPermissionSetMemberRequest::setWorkspace));
        builder.<PermissionSetMemberCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PermissionSetMemberCreateDTO.class),
            f -> f.withMarshaller(CreateSecurityPermissionSetMemberRequest::getBody,
                CreateSecurityPermissionSetMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityPermissionSetPermissionRequest, CreateSecurityPermissionSetPermissionResponse> createSecurityPermissionSetPermission =
        genForCreateSecurityPermissionSetPermission();

    private static HttpRequestDef<CreateSecurityPermissionSetPermissionRequest, CreateSecurityPermissionSetPermissionResponse> genForCreateSecurityPermissionSetPermission() {
        // basic
        HttpRequestDef.Builder<CreateSecurityPermissionSetPermissionRequest, CreateSecurityPermissionSetPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSecurityPermissionSetPermissionRequest.class,
                    CreateSecurityPermissionSetPermissionResponse.class)
                .withName("CreateSecurityPermissionSetPermission")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}/permissions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityPermissionSetPermissionRequest::getPermissionSetId,
                CreateSecurityPermissionSetPermissionRequest::setPermissionSetId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityPermissionSetPermissionRequest::getWorkspace,
                CreateSecurityPermissionSetPermissionRequest::setWorkspace));
        builder.<PermissionSetPermissionCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PermissionSetPermissionCreateDTO.class),
            f -> f.withMarshaller(CreateSecurityPermissionSetPermissionRequest::getBody,
                CreateSecurityPermissionSetPermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecuritySecrecyLevelRequest, CreateSecuritySecrecyLevelResponse> createSecuritySecrecyLevel =
        genForCreateSecuritySecrecyLevel();

    private static HttpRequestDef<CreateSecuritySecrecyLevelRequest, CreateSecuritySecrecyLevelResponse> genForCreateSecuritySecrecyLevel() {
        // basic
        HttpRequestDef.Builder<CreateSecuritySecrecyLevelRequest, CreateSecuritySecrecyLevelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSecuritySecrecyLevelRequest.class,
                    CreateSecuritySecrecyLevelResponse.class)
                .withName("CreateSecuritySecrecyLevel")
                .withUri("/v1/{project_id}/security/data-classification/secrecy-level")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecuritySecrecyLevelRequest::getWorkspace,
                CreateSecuritySecrecyLevelRequest::setWorkspace));
        builder.<CreateSecrecyLevelDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecrecyLevelDTO.class),
            f -> f.withMarshaller(CreateSecuritySecrecyLevelRequest::getBody,
                CreateSecuritySecrecyLevelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceCatalogRequest, CreateServiceCatalogResponse> createServiceCatalog =
        genForCreateServiceCatalog();

    private static HttpRequestDef<CreateServiceCatalogRequest, CreateServiceCatalogResponse> genForCreateServiceCatalog() {
        // basic
        HttpRequestDef.Builder<CreateServiceCatalogRequest, CreateServiceCatalogResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateServiceCatalogRequest.class, CreateServiceCatalogResponse.class)
            .withName("CreateServiceCatalog")
            .withUri("/v1/{project_id}/service/servicecatalogs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateServiceCatalogRequest::getWorkspace,
                CreateServiceCatalogRequest::setWorkspace));
        builder.<CreateServiceCatalogRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateServiceCatalogRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(CreateServiceCatalogRequest::getDlmType, CreateServiceCatalogRequest::setDlmType));
        builder.<ApiCatalogCreateParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCatalogCreateParaDTO.class),
            f -> f.withMarshaller(CreateServiceCatalogRequest::getBody, CreateServiceCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStandardRequest, CreateStandardResponse> createStandard =
        genForCreateStandard();

    private static HttpRequestDef<CreateStandardRequest, CreateStandardResponse> genForCreateStandard() {
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
            f -> f.withMarshaller(CreateStandardRequest::getWorkspace, CreateStandardRequest::setWorkspace));
        builder.<StandElementValueVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementValueVOList.class),
            f -> f.withMarshaller(CreateStandardRequest::getBody, CreateStandardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStandardTemplateRequest, CreateStandardTemplateResponse> createStandardTemplate =
        genForCreateStandardTemplate();

    private static HttpRequestDef<CreateStandardTemplateRequest, CreateStandardTemplateResponse> genForCreateStandardTemplate() {
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
            f -> f.withMarshaller(CreateStandardTemplateRequest::getWorkspace,
                CreateStandardTemplateRequest::setWorkspace));
        builder.<StandElementFieldVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementFieldVO.class),
            f -> f.withMarshaller(CreateStandardTemplateRequest::getBody, CreateStandardTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubjectRequest, CreateSubjectResponse> createSubject =
        genForCreateSubject();

    private static HttpRequestDef<CreateSubjectRequest, CreateSubjectResponse> genForCreateSubject() {
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
            f -> f.withMarshaller(CreateSubjectRequest::getWorkspace, CreateSubjectRequest::setWorkspace));
        builder.<CatalogParamsVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogParamsVO.class),
            f -> f.withMarshaller(CreateSubjectRequest::getBody, CreateSubjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubjectNewRequest, CreateSubjectNewResponse> createSubjectNew =
        genForCreateSubjectNew();

    private static HttpRequestDef<CreateSubjectNewRequest, CreateSubjectNewResponse> genForCreateSubjectNew() {
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
            f -> f.withMarshaller(CreateSubjectNewRequest::getWorkspace, CreateSubjectNewRequest::setWorkspace));
        builder.<SubjectParamsVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubjectParamsVO.class),
            f -> f.withMarshaller(CreateSubjectNewRequest::getBody, CreateSubjectNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableModelRequest, CreateTableModelResponse> createTableModel =
        genForCreateTableModel();

    private static HttpRequestDef<CreateTableModelRequest, CreateTableModelResponse> genForCreateTableModel() {
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
            f -> f.withMarshaller(CreateTableModelRequest::getWorkspace, CreateTableModelRequest::setWorkspace));
        builder.<TableModelVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableModelVO.class),
            f -> f.withMarshaller(CreateTableModelRequest::getBody, CreateTableModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
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
            f -> f.withMarshaller(CreateTaskRequest::getWorkspace, CreateTaskRequest::setWorkspace));
        builder.<MetadataCollectionTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetadataCollectionTask.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForCreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForCreateTemplate() {
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
            f -> f.withMarshaller(CreateTemplateRequest::getWorkspace, CreateTemplateRequest::setWorkspace));
        builder.<TemplateRO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateRO.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, CreateTemplateRequest::setBody));

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
                .withUri("/v2/{project_id}/design/workspaces")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getWorkspace, CreateWorkspaceRequest::setWorkspace));
        builder.<WorkspaceVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkspaceVO.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, CreateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugDataconnectionRequest, DebugDataconnectionResponse> debugDataconnection =
        genForDebugDataconnection();

    private static HttpRequestDef<DebugDataconnectionRequest, DebugDataconnectionResponse> genForDebugDataconnection() {
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
            f -> f.withMarshaller(DebugDataconnectionRequest::getWorkspace, DebugDataconnectionRequest::setWorkspace));
        builder.<ApigDataSourceVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigDataSourceVo.class),
            f -> f.withMarshaller(DebugDataconnectionRequest::getBody, DebugDataconnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
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
            f -> f.withMarshaller(DeleteAppRequest::getAppId, DeleteAppRequest::setAppId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getWorkspace, DeleteAppRequest::setWorkspace));
        builder.<DeleteAppRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteAppRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(DeleteAppRequest::getDlmType, DeleteAppRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApproverRequest, DeleteApproverResponse> deleteApprover =
        genForDeleteApprover();

    private static HttpRequestDef<DeleteApproverRequest, DeleteApproverResponse> genForDeleteApprover() {
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
            f -> f.withMarshaller(DeleteApproverRequest::getApproverIds, DeleteApproverRequest::setApproverIds));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApproverRequest::getWorkspace, DeleteApproverRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> deleteAsset = genForDeleteAsset();

    private static HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> genForDeleteAsset() {
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
            f -> f.withMarshaller(DeleteAssetRequest::getGuid, DeleteAssetRequest::setGuid));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getWorkspace, DeleteAssetRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBizMetricRequest, DeleteBizMetricResponse> deleteBizMetric =
        genForDeleteBizMetric();

    private static HttpRequestDef<DeleteBizMetricRequest, DeleteBizMetricResponse> genForDeleteBizMetric() {
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
            f -> f.withMarshaller(DeleteBizMetricRequest::getWorkspace, DeleteBizMetricRequest::setWorkspace));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteBizMetricRequest::getBody, DeleteBizMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalog =
        genForDeleteCatalog();

    private static HttpRequestDef<DeleteCatalogRequest, DeleteCatalogResponse> genForDeleteCatalog() {
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
            f -> f.withMarshaller(DeleteCatalogRequest::getWorkspace, DeleteCatalogRequest::setWorkspace));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteCatalogRequest::getBody, DeleteCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse> deleteClassificationFromEntities =
        genForDeleteClassificationFromEntities();

    private static HttpRequestDef<DeleteClassificationFromEntitiesRequest, DeleteClassificationFromEntitiesResponse> genForDeleteClassificationFromEntities() {
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
            f -> f.withMarshaller(DeleteClassificationFromEntitiesRequest::getGuid,
                DeleteClassificationFromEntitiesRequest::setGuid));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClassificationFromEntitiesRequest::getWorkspace,
                DeleteClassificationFromEntitiesRequest::setWorkspace));
        builder.<OpenClassification>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenClassification.class),
            f -> f.withMarshaller(DeleteClassificationFromEntitiesRequest::getBody,
                DeleteClassificationFromEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCodeTableRequest, DeleteCodeTableResponse> deleteCodeTable =
        genForDeleteCodeTable();

    private static HttpRequestDef<DeleteCodeTableRequest, DeleteCodeTableResponse> genForDeleteCodeTable() {
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
            f -> f.withMarshaller(DeleteCodeTableRequest::getWorkspace, DeleteCodeTableRequest::setWorkspace));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteCodeTableRequest::getBody, DeleteCodeTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataconnectionRequest, DeleteDataconnectionResponse> deleteDataconnection =
        genForDeleteDataconnection();

    private static HttpRequestDef<DeleteDataconnectionRequest, DeleteDataconnectionResponse> genForDeleteDataconnection() {
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
            f -> f.withMarshaller(DeleteDataconnectionRequest::getDataConnectionId,
                DeleteDataconnectionRequest::setDataConnectionId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataconnectionRequest::getWorkspace,
                DeleteDataconnectionRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectory =
        genForDeleteDirectory();

    private static HttpRequestDef<DeleteDirectoryRequest, DeleteDirectoryResponse> genForDeleteDirectory() {
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
            f -> f.withMarshaller(DeleteDirectoryRequest::getIds, DeleteDirectoryRequest::setIds));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDirectoryRequest::getWorkspace, DeleteDirectoryRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityDataClassificationRuleRequest, DeleteSecurityDataClassificationRuleResponse> deleteSecurityDataClassificationRule =
        genForDeleteSecurityDataClassificationRule();

    private static HttpRequestDef<DeleteSecurityDataClassificationRuleRequest, DeleteSecurityDataClassificationRuleResponse> genForDeleteSecurityDataClassificationRule() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityDataClassificationRuleRequest, DeleteSecurityDataClassificationRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSecurityDataClassificationRuleRequest.class,
                    DeleteSecurityDataClassificationRuleResponse.class)
                .withName("DeleteSecurityDataClassificationRule")
                .withUri("/v1/{project_id}/security/data-classification/rule/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityDataClassificationRuleRequest::getId,
                DeleteSecurityDataClassificationRuleRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityDataClassificationRuleRequest::getWorkspace,
                DeleteSecurityDataClassificationRuleRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse> deleteSecurityLevelFromEntity =
        genForDeleteSecurityLevelFromEntity();

    private static HttpRequestDef<DeleteSecurityLevelFromEntityRequest, DeleteSecurityLevelFromEntityResponse> genForDeleteSecurityLevelFromEntity() {
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
            f -> f.withMarshaller(DeleteSecurityLevelFromEntityRequest::getGuid,
                DeleteSecurityLevelFromEntityRequest::setGuid));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityLevelFromEntityRequest::getWorkspace,
                DeleteSecurityLevelFromEntityRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityPermissionSetRequest, DeleteSecurityPermissionSetResponse> deleteSecurityPermissionSet =
        genForDeleteSecurityPermissionSet();

    private static HttpRequestDef<DeleteSecurityPermissionSetRequest, DeleteSecurityPermissionSetResponse> genForDeleteSecurityPermissionSet() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityPermissionSetRequest, DeleteSecurityPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSecurityPermissionSetRequest.class,
                    DeleteSecurityPermissionSetResponse.class)
                .withName("DeleteSecurityPermissionSet")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityPermissionSetRequest::getPermissionSetId,
                DeleteSecurityPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityPermissionSetRequest::getWorkspace,
                DeleteSecurityPermissionSetRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecuritySecrecyLevelRequest, DeleteSecuritySecrecyLevelResponse> deleteSecuritySecrecyLevel =
        genForDeleteSecuritySecrecyLevel();

    private static HttpRequestDef<DeleteSecuritySecrecyLevelRequest, DeleteSecuritySecrecyLevelResponse> genForDeleteSecuritySecrecyLevel() {
        // basic
        HttpRequestDef.Builder<DeleteSecuritySecrecyLevelRequest, DeleteSecuritySecrecyLevelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSecuritySecrecyLevelRequest.class,
                    DeleteSecuritySecrecyLevelResponse.class)
                .withName("DeleteSecuritySecrecyLevel")
                .withUri("/v1/{project_id}/security/data-classification/secrecy-level/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecuritySecrecyLevelRequest::getId, DeleteSecuritySecrecyLevelRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecuritySecrecyLevelRequest::getWorkspace,
                DeleteSecuritySecrecyLevelRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> deleteServiceCatalog =
        genForDeleteServiceCatalog();

    private static HttpRequestDef<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> genForDeleteServiceCatalog() {
        // basic
        HttpRequestDef.Builder<DeleteServiceCatalogRequest, DeleteServiceCatalogResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteServiceCatalogRequest.class, DeleteServiceCatalogResponse.class)
            .withName("DeleteServiceCatalog")
            .withUri("/v1/{project_id}/service/servicecatalogs/batch-delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceCatalogRequest::getWorkspace,
                DeleteServiceCatalogRequest::setWorkspace));
        builder.<DeleteServiceCatalogRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteServiceCatalogRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(DeleteServiceCatalogRequest::getDlmType, DeleteServiceCatalogRequest::setDlmType));
        builder.<ApiCatalogDeleteParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCatalogDeleteParaDTO.class),
            f -> f.withMarshaller(DeleteServiceCatalogRequest::getBody, DeleteServiceCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStandardRequest, DeleteStandardResponse> deleteStandard =
        genForDeleteStandard();

    private static HttpRequestDef<DeleteStandardRequest, DeleteStandardResponse> genForDeleteStandard() {
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
            f -> f.withMarshaller(DeleteStandardRequest::getWorkspace, DeleteStandardRequest::setWorkspace));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteStandardRequest::getBody, DeleteStandardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse> deleteStandardTemplate =
        genForDeleteStandardTemplate();

    private static HttpRequestDef<DeleteStandardTemplateRequest, DeleteStandardTemplateResponse> genForDeleteStandardTemplate() {
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
            f -> f.withMarshaller(DeleteStandardTemplateRequest::getIds, DeleteStandardTemplateRequest::setIds));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStandardTemplateRequest::getWorkspace,
                DeleteStandardTemplateRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubjectRequest, DeleteSubjectResponse> deleteSubject =
        genForDeleteSubject();

    private static HttpRequestDef<DeleteSubjectRequest, DeleteSubjectResponse> genForDeleteSubject() {
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
            f -> f.withMarshaller(DeleteSubjectRequest::getWorkspace, DeleteSubjectRequest::setWorkspace));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteSubjectRequest::getBody, DeleteSubjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubjectNewRequest, DeleteSubjectNewResponse> deleteSubjectNew =
        genForDeleteSubjectNew();

    private static HttpRequestDef<DeleteSubjectNewRequest, DeleteSubjectNewResponse> genForDeleteSubjectNew() {
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
            f -> f.withMarshaller(DeleteSubjectNewRequest::getWorkspace, DeleteSubjectNewRequest::setWorkspace));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteSubjectNewRequest::getBody, DeleteSubjectNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableModelRequest, DeleteTableModelResponse> deleteTableModel =
        genForDeleteTableModel();

    private static HttpRequestDef<DeleteTableModelRequest, DeleteTableModelResponse> genForDeleteTableModel() {
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
            f -> f.withMarshaller(DeleteTableModelRequest::getWorkspace, DeleteTableModelRequest::setWorkspace));
        builder.<IdsParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdsParam.class),
            f -> f.withMarshaller(DeleteTableModelRequest::getBody, DeleteTableModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskInfoRequest, DeleteTaskInfoResponse> deleteTaskInfo =
        genForDeleteTaskInfo();

    private static HttpRequestDef<DeleteTaskInfoRequest, DeleteTaskInfoResponse> genForDeleteTaskInfo() {
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
            f -> f.withMarshaller(DeleteTaskInfoRequest::getTaskId, DeleteTaskInfoRequest::setTaskId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskInfoRequest::getWorkspace, DeleteTaskInfoRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspacesRequest, DeleteWorkspacesResponse> deleteWorkspaces =
        genForDeleteWorkspaces();

    private static HttpRequestDef<DeleteWorkspacesRequest, DeleteWorkspacesResponse> genForDeleteWorkspaces() {
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
            f -> f.withMarshaller(DeleteWorkspacesRequest::getIds, DeleteWorkspacesRequest::setIds));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspacesRequest::getWorkspace, DeleteWorkspacesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse> deleteWorkspaceusers =
        genForDeleteWorkspaceusers();

    private static HttpRequestDef<DeleteWorkspaceusersRequest, DeleteWorkspaceusersResponse> genForDeleteWorkspaceusers() {
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
            f -> f.withMarshaller(DeleteWorkspaceusersRequest::getWorkspaceId,
                DeleteWorkspaceusersRequest::setWorkspaceId));
        builder.<ApigDelUserParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigDelUserParams.class),
            f -> f.withMarshaller(DeleteWorkspaceusersRequest::getBody, DeleteWorkspaceusersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployFactoryPackagesRequest, DeployFactoryPackagesResponse> deployFactoryPackages =
        genForDeployFactoryPackages();

    private static HttpRequestDef<DeployFactoryPackagesRequest, DeployFactoryPackagesResponse> genForDeployFactoryPackages() {
        // basic
        HttpRequestDef.Builder<DeployFactoryPackagesRequest, DeployFactoryPackagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeployFactoryPackagesRequest.class, DeployFactoryPackagesResponse.class)
            .withName("DeployFactoryPackages")
            .withUri("/v2/{project_id}/factory/release-packages/deploy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployFactoryPackagesRequest::getWorkspace,
                DeployFactoryPackagesRequest::setWorkspace));
        builder.<DeployFactoryPackagesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeployFactoryPackagesRequestBody.class),
            f -> f.withMarshaller(DeployFactoryPackagesRequest::getBody, DeployFactoryPackagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteTaskActionRequest, ExecuteTaskActionResponse> executeTaskAction =
        genForExecuteTaskAction();

    private static HttpRequestDef<ExecuteTaskActionRequest, ExecuteTaskActionResponse> genForExecuteTaskAction() {
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
            f -> f.withMarshaller(ExecuteTaskActionRequest::getTaskId, ExecuteTaskActionRequest::setTaskId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteTaskActionRequest::getAction, ExecuteTaskActionRequest::setAction));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteTaskActionRequest::getWorkspace, ExecuteTaskActionRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportCatalogsRequest, ImportCatalogsResponse> importCatalogs =
        genForImportCatalogs();

    private static HttpRequestDef<ImportCatalogsRequest, ImportCatalogsResponse> genForImportCatalogs() {
        // basic
        HttpRequestDef.Builder<ImportCatalogsRequest, ImportCatalogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportCatalogsRequest.class, ImportCatalogsResponse.class)
                .withName("ImportCatalogs")
                .withUri("/v2/{project_id}/design/catalogs/action")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("action-id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportCatalogsRequest::getActionId, ImportCatalogsRequest::setActionId));
        builder.<Boolean>withRequestField("skip-exist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ImportCatalogsRequest::getSkipExist, ImportCatalogsRequest::setSkipExist));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportCatalogsRequest::getWorkspace, ImportCatalogsRequest::setWorkspace));
        builder.<ImportCatalogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportCatalogsRequestBody.class),
            f -> f.withMarshaller(ImportCatalogsRequest::getBody, ImportCatalogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportLineageRequest, ImportLineageResponse> importLineage =
        genForImportLineage();

    private static HttpRequestDef<ImportLineageRequest, ImportLineageResponse> genForImportLineage() {
        // basic
        HttpRequestDef.Builder<ImportLineageRequest, ImportLineageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportLineageRequest.class, ImportLineageResponse.class)
                .withName("ImportLineage")
                .withUri("/v3/{project_id}/lineage/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportLineageRequest::getWorkspace, ImportLineageRequest::setWorkspace));
        builder.<List<TableLineage>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ImportLineageRequest::getBody, ImportLineageRequest::setBody)
                .withInnerContainerType(TableLineage.class));

        // response
        builder.<List<ObjectIdInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ImportLineageResponse::getBody, ImportLineageResponse::setBody)
                .withInnerContainerType(ObjectIdInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ImportModelsRequest, ImportModelsResponse> importModels = genForImportModels();

    private static HttpRequestDef<ImportModelsRequest, ImportModelsResponse> genForImportModels() {
        // basic
        HttpRequestDef.Builder<ImportModelsRequest, ImportModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportModelsRequest.class, ImportModelsResponse.class)
                .withName("ImportModels")
                .withUri("/v2/{project_id}/design/models/action")
                .withContentType("multipart/form-data");

        // requests
        builder.<ImportModelsRequest.ActionIdEnum>withRequestField("action-id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportModelsRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ImportModelsRequest::getActionId, ImportModelsRequest::setActionId));
        builder.<String>withRequestField("model_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportModelsRequest::getModelId, ImportModelsRequest::setModelId));
        builder.<String>withRequestField("directory_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportModelsRequest::getDirectoryId, ImportModelsRequest::setDirectoryId));
        builder.<Boolean>withRequestField("skip-exist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ImportModelsRequest::getSkipExist, ImportModelsRequest::setSkipExist));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportModelsRequest::getWorkspace, ImportModelsRequest::setWorkspace));
        builder.<ImportModelsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportModelsRequestBody.class),
            f -> f.withMarshaller(ImportModelsRequest::getBody, ImportModelsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportResultRequest, ImportResultResponse> importResult = genForImportResult();

    private static HttpRequestDef<ImportResultRequest, ImportResultResponse> genForImportResult() {
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
            f -> f.withMarshaller(ImportResultRequest::getUuid, ImportResultRequest::setUuid));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportResultRequest::getWorkspace, ImportResultRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse> initializeStandardTemplate =
        genForInitializeStandardTemplate();

    private static HttpRequestDef<InitializeStandardTemplateRequest, InitializeStandardTemplateResponse> genForInitializeStandardTemplate() {
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
            f -> f.withMarshaller(InitializeStandardTemplateRequest::getActionId,
                InitializeStandardTemplateRequest::setActionId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InitializeStandardTemplateRequest::getWorkspace,
                InitializeStandardTemplateRequest::setWorkspace));
        builder.<StandElementFieldVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementFieldVOList.class),
            f -> f.withMarshaller(InitializeStandardTemplateRequest::getBody,
                InitializeStandardTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse> listAggregationLogicTables =
        genForListAggregationLogicTables();

    private static HttpRequestDef<ListAggregationLogicTablesRequest, ListAggregationLogicTablesResponse> genForListAggregationLogicTables() {
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
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getName,
                ListAggregationLogicTablesRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getCreateBy,
                ListAggregationLogicTablesRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getApprover,
                ListAggregationLogicTablesRequest::setApprover));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getOwner,
                ListAggregationLogicTablesRequest::setOwner));
        builder.<ListAggregationLogicTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAggregationLogicTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getStatus,
                ListAggregationLogicTablesRequest::setStatus));
        builder.<ListAggregationLogicTablesRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAggregationLogicTablesRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getSyncStatus,
                ListAggregationLogicTablesRequest::setSyncStatus));
        builder.<List<ListAggregationLogicTablesRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getSyncKey,
                ListAggregationLogicTablesRequest::setSyncKey));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getL3Id,
                ListAggregationLogicTablesRequest::setL3Id));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getBeginTime,
                ListAggregationLogicTablesRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getEndTime,
                ListAggregationLogicTablesRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getLimit,
                ListAggregationLogicTablesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getOffset,
                ListAggregationLogicTablesRequest::setOffset));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getBizCatalogId,
                ListAggregationLogicTablesRequest::setBizCatalogId));
        builder.<Boolean>withRequestField("auto_generate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getAutoGenerate,
                ListAggregationLogicTablesRequest::setAutoGenerate));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationLogicTablesRequest::getWorkspace,
                ListAggregationLogicTablesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllCatalogListRequest, ListAllCatalogListResponse> listAllCatalogList =
        genForListAllCatalogList();

    private static HttpRequestDef<ListAllCatalogListRequest, ListAllCatalogListResponse> genForListAllCatalogList() {
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
            f -> f.withMarshaller(ListAllCatalogListRequest::getCatalogId, ListAllCatalogListRequest::setCatalogId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllCatalogListRequest::getOffset, ListAllCatalogListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllCatalogListRequest::getLimit, ListAllCatalogListRequest::setLimit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllCatalogListRequest::getWorkspace, ListAllCatalogListRequest::setWorkspace));
        builder.<ListAllCatalogListRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllCatalogListRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListAllCatalogListRequest::getDlmType, ListAllCatalogListRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllStandardsRequest, ListAllStandardsResponse> listAllStandards =
        genForListAllStandards();

    private static HttpRequestDef<ListAllStandardsRequest, ListAllStandardsResponse> genForListAllStandards() {
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
            f -> f.withMarshaller(ListAllStandardsRequest::getDirectoryId, ListAllStandardsRequest::setDirectoryId));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getBeginTime, ListAllStandardsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getEndTime, ListAllStandardsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getLimit, ListAllStandardsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getOffset, ListAllStandardsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllStandardsRequest::getWorkspace, ListAllStandardsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTablesRequest, ListAllTablesResponse> listAllTables =
        genForListAllTables();

    private static HttpRequestDef<ListAllTablesRequest, ListAllTablesResponse> genForListAllTables() {
        // basic
        HttpRequestDef.Builder<ListAllTablesRequest, ListAllTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllTablesRequest.class, ListAllTablesResponse.class)
                .withName("ListAllTables")
                .withUri("/v2/{project_id}/design/all-tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getName, ListAllTablesRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getCreateBy, ListAllTablesRequest::setCreateBy));
        builder.<ListAllTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAllTablesRequest::getStatus, ListAllTablesRequest::setStatus));
        builder.<ListAllTablesRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllTablesRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListAllTablesRequest::getSyncStatus, ListAllTablesRequest::setSyncStatus));
        builder.<List<ListAllTablesRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllTablesRequest::getSyncKey, ListAllTablesRequest::setSyncKey));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getBizCatalogId, ListAllTablesRequest::setBizCatalogId));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getBeginTime, ListAllTablesRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getEndTime, ListAllTablesRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTablesRequest::getLimit, ListAllTablesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTablesRequest::getOffset, ListAllTablesRequest::setOffset));
        builder.<List<Long>>withRequestField("biz_catalog_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllTablesRequest::getBizCatalogIdList,
                ListAllTablesRequest::setBizCatalogIdList));
        builder.<List<ListAllTablesRequest.BizTypeListEnum>>withRequestField("biz_type_list",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllTablesRequest::getBizTypeList, ListAllTablesRequest::setBizTypeList));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getWorkspace, ListAllTablesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiCatalogListRequest, ListApiCatalogListResponse> listApiCatalogList =
        genForListApiCatalogList();

    private static HttpRequestDef<ListApiCatalogListRequest, ListApiCatalogListResponse> genForListApiCatalogList() {
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
            f -> f.withMarshaller(ListApiCatalogListRequest::getCatalogId, ListApiCatalogListRequest::setCatalogId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiCatalogListRequest::getOffset, ListApiCatalogListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiCatalogListRequest::getLimit, ListApiCatalogListRequest::setLimit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiCatalogListRequest::getWorkspace, ListApiCatalogListRequest::setWorkspace));
        builder.<ListApiCatalogListRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApiCatalogListRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApiCatalogListRequest::getDlmType, ListApiCatalogListRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiTopNRequest, ListApiTopNResponse> listApiTopN = genForListApiTopN();

    private static HttpRequestDef<ListApiTopNRequest, ListApiTopNResponse> genForListApiTopN() {
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
            f -> f.withMarshaller(ListApiTopNRequest::getApiId, ListApiTopNRequest::setApiId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiTopNRequest::getInstanceId, ListApiTopNRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiTopNRequest::getStartTime, ListApiTopNRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiTopNRequest::getEndTime, ListApiTopNRequest::setEndTime));
        builder.<ListApiTopNRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApiTopNRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ListApiTopNRequest::getTimeUnit, ListApiTopNRequest::setTimeUnit));
        builder.<Integer>withRequestField("top_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiTopNRequest::getTopNum, ListApiTopNRequest::setTopNum));
        builder.<ListApiTopNRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApiTopNRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListApiTopNRequest::getOrderBy, ListApiTopNRequest::setOrderBy));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiTopNRequest::getWorkspace, ListApiTopNRequest::setWorkspace));
        builder.<ListApiTopNRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApiTopNRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApiTopNRequest::getDlmType, ListApiTopNRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApicGroupsRequest, ListApicGroupsResponse> listApicGroups =
        genForListApicGroups();

    private static HttpRequestDef<ListApicGroupsRequest, ListApicGroupsResponse> genForListApicGroups() {
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
            f -> f.withMarshaller(ListApicGroupsRequest::getApigInstanceId, ListApicGroupsRequest::setApigInstanceId));
        builder.<ListApicGroupsRequest.ApigTypeEnum>withRequestField("apig_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApicGroupsRequest.ApigTypeEnum.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getApigType, ListApicGroupsRequest::setApigType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getLimit, ListApicGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getOffset, ListApicGroupsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getWorkspace, ListApicGroupsRequest::setWorkspace));
        builder.<ListApicGroupsRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApicGroupsRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApicGroupsRequest::getDlmType, ListApicGroupsRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApicInstancesRequest, ListApicInstancesResponse> listApicInstances =
        genForListApicInstances();

    private static HttpRequestDef<ListApicInstancesRequest, ListApicInstancesResponse> genForListApicInstances() {
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
            f -> f.withMarshaller(ListApicInstancesRequest::getApigType, ListApicInstancesRequest::setApigType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getLimit, ListApicInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getOffset, ListApicInstancesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getWorkspace, ListApicInstancesRequest::setWorkspace));
        builder.<ListApicInstancesRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApicInstancesRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApicInstancesRequest::getDlmType, ListApicInstancesRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisTopRequest, ListApisTopResponse> listApisTop = genForListApisTop();

    private static HttpRequestDef<ListApisTopRequest, ListApisTopResponse> genForListApisTop() {
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
            f -> f.withMarshaller(ListApisTopRequest::getInstanceId, ListApisTopRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisTopRequest::getStartTime, ListApisTopRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisTopRequest::getEndTime, ListApisTopRequest::setEndTime));
        builder.<ListApisTopRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApisTopRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ListApisTopRequest::getTimeUnit, ListApisTopRequest::setTimeUnit));
        builder.<Integer>withRequestField("top_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisTopRequest::getTopNum, ListApisTopRequest::setTopNum));
        builder.<ListApisTopRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApisTopRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListApisTopRequest::getOrderBy, ListApisTopRequest::setOrderBy));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisTopRequest::getWorkspace, ListApisTopRequest::setWorkspace));
        builder.<ListApisTopRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApisTopRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApisTopRequest::getDlmType, ListApisTopRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplyRequest, ListApplyResponse> listApply = genForListApply();

    private static HttpRequestDef<ListApplyRequest, ListApplyResponse> genForListApply() {
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
            f -> f.withMarshaller(ListApplyRequest::getOffset, ListApplyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplyRequest::getLimit, ListApplyRequest::setLimit));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplyRequest::getApiName, ListApplyRequest::setApiName));
        builder.<Integer>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplyRequest::getQueryType, ListApplyRequest::setQueryType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplyRequest::getWorkspace, ListApplyRequest::setWorkspace));
        builder.<ListApplyRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApplyRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApplyRequest::getDlmType, ListApplyRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApproversRequest, ListApproversResponse> listApprovers =
        genForListApprovers();

    private static HttpRequestDef<ListApproversRequest, ListApproversResponse> genForListApprovers() {
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
            f -> f.withMarshaller(ListApproversRequest::getApproverName, ListApproversRequest::setApproverName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApproversRequest::getLimit, ListApproversRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApproversRequest::getOffset, ListApproversRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApproversRequest::getWorkspace, ListApproversRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForListApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForListApps() {
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
            f -> f.withMarshaller(ListAppsRequest::getLimit, ListAppsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, ListAppsRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getName, ListAppsRequest::setName));
        builder.<ListAppsRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAppsRequest.AppTypeEnum.class),
            f -> f.withMarshaller(ListAppsRequest::getAppType, ListAppsRequest::setAppType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getWorkspace, ListAppsRequest::setWorkspace));
        builder.<ListAppsRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAppsRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListAppsRequest::getDlmType, ListAppsRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsTopRequest, ListAppsTopResponse> listAppsTop = genForListAppsTop();

    private static HttpRequestDef<ListAppsTopRequest, ListAppsTopResponse> genForListAppsTop() {
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
            f -> f.withMarshaller(ListAppsTopRequest::getStartTime, ListAppsTopRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsTopRequest::getEndTime, ListAppsTopRequest::setEndTime));
        builder.<ListAppsTopRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppsTopRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ListAppsTopRequest::getTimeUnit, ListAppsTopRequest::setTimeUnit));
        builder.<Integer>withRequestField("top_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsTopRequest::getTopNum, ListAppsTopRequest::setTopNum));
        builder.<ListAppsTopRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppsTopRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListAppsTopRequest::getOrderBy, ListAppsTopRequest::setOrderBy));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsTopRequest::getWorkspace, ListAppsTopRequest::setWorkspace));
        builder.<ListAppsTopRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAppsTopRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListAppsTopRequest::getDlmType, ListAppsTopRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse> listBizMetricDimensions =
        genForListBizMetricDimensions();

    private static HttpRequestDef<ListBizMetricDimensionsRequest, ListBizMetricDimensionsResponse> genForListBizMetricDimensions() {
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
            f -> f.withMarshaller(ListBizMetricDimensionsRequest::getLimit, ListBizMetricDimensionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricDimensionsRequest::getOffset,
                ListBizMetricDimensionsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricDimensionsRequest::getWorkspace,
                ListBizMetricDimensionsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse> listBizMetricOwners =
        genForListBizMetricOwners();

    private static HttpRequestDef<ListBizMetricOwnersRequest, ListBizMetricOwnersResponse> genForListBizMetricOwners() {
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
            f -> f.withMarshaller(ListBizMetricOwnersRequest::getLimit, ListBizMetricOwnersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricOwnersRequest::getOffset, ListBizMetricOwnersRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricOwnersRequest::getWorkspace, ListBizMetricOwnersRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBizMetricsRequest, ListBizMetricsResponse> listBizMetrics =
        genForListBizMetrics();

    private static HttpRequestDef<ListBizMetricsRequest, ListBizMetricsResponse> genForListBizMetrics() {
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
            f -> f.withMarshaller(ListBizMetricsRequest::getName, ListBizMetricsRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getCreateBy, ListBizMetricsRequest::setCreateBy));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getOwner, ListBizMetricsRequest::setOwner));
        builder.<ListBizMetricsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBizMetricsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getStatus, ListBizMetricsRequest::setStatus));
        builder.<ListBizMetricsRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBizMetricsRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getSyncStatus, ListBizMetricsRequest::setSyncStatus));
        builder.<List<ListBizMetricsRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getSyncKey, ListBizMetricsRequest::setSyncKey));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getBizCatalogId, ListBizMetricsRequest::setBizCatalogId));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getBeginTime, ListBizMetricsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getEndTime, ListBizMetricsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getLimit, ListBizMetricsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getOffset, ListBizMetricsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBizMetricsRequest::getWorkspace, ListBizMetricsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBusinessRequest, ListBusinessResponse> listBusiness = genForListBusiness();

    private static HttpRequestDef<ListBusinessRequest, ListBusinessResponse> genForListBusiness() {
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
            f -> f.withMarshaller(ListBusinessRequest::getLimit, ListBusinessRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBusinessRequest::getOffset, ListBusinessRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBusinessRequest::getWorkspace, ListBusinessRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogListRequest, ListCatalogListResponse> listCatalogList =
        genForListCatalogList();

    private static HttpRequestDef<ListCatalogListRequest, ListCatalogListResponse> genForListCatalogList() {
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
            f -> f.withMarshaller(ListCatalogListRequest::getCatalogId, ListCatalogListRequest::setCatalogId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogListRequest::getLimit, ListCatalogListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogListRequest::getOffset, ListCatalogListRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCatalogListRequest::getWorkspace, ListCatalogListRequest::setWorkspace));
        builder.<ListCatalogListRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCatalogListRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListCatalogListRequest::getDlmType, ListCatalogListRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogTreeRequest, ListCatalogTreeResponse> listCatalogTree =
        genForListCatalogTree();

    private static HttpRequestDef<ListCatalogTreeRequest, ListCatalogTreeResponse> genForListCatalogTree() {
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
            f -> f.withMarshaller(ListCatalogTreeRequest::getWorkspace, ListCatalogTreeRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCategoryRequest, ListCategoryResponse> listCategory = genForListCategory();

    private static HttpRequestDef<ListCategoryRequest, ListCategoryResponse> genForListCategory() {
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
            f -> f.withMarshaller(ListCategoryRequest::getLimit, ListCategoryRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCategoryRequest::getOffset, ListCategoryRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCategoryRequest::getWorkspace, ListCategoryRequest::setWorkspace));
        builder.<String>withRequestField("accept",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCategoryRequest::getAccept, ListCategoryRequest::setAccept));

        // response
        builder.<List<CategoryDetailVO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCategoryResponse::getBody, ListCategoryResponse::setBody)
                .withInnerContainerType(CategoryDetailVO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListColumnsRequest, ListColumnsResponse> listColumns = genForListColumns();

    private static HttpRequestDef<ListColumnsRequest, ListColumnsResponse> genForListColumns() {
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
            f -> f.withMarshaller(ListColumnsRequest::getConnectionId, ListColumnsRequest::setConnectionId));
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getTableId, ListColumnsRequest::setTableId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getLimit, ListColumnsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getOffset, ListColumnsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListColumnsRequest::getWorkspace, ListColumnsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCompoundMetricsRequest, ListCompoundMetricsResponse> listCompoundMetrics =
        genForListCompoundMetrics();

    private static HttpRequestDef<ListCompoundMetricsRequest, ListCompoundMetricsResponse> genForListCompoundMetrics() {
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
            f -> f.withMarshaller(ListCompoundMetricsRequest::getName, ListCompoundMetricsRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getCreateBy, ListCompoundMetricsRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getApprover, ListCompoundMetricsRequest::setApprover));
        builder.<ListCompoundMetricsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCompoundMetricsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getStatus, ListCompoundMetricsRequest::setStatus));
        builder.<String>withRequestField("dimension_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getDimensionGroup,
                ListCompoundMetricsRequest::setDimensionGroup));
        builder.<Long>withRequestField("atomic_index_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getAtomicIndexId,
                ListCompoundMetricsRequest::setAtomicIndexId));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getL3Id, ListCompoundMetricsRequest::setL3Id));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getBeginTime, ListCompoundMetricsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getEndTime, ListCompoundMetricsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getLimit, ListCompoundMetricsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getOffset, ListCompoundMetricsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompoundMetricsRequest::getWorkspace, ListCompoundMetricsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConditionRequest, ListConditionResponse> listCondition =
        genForListCondition();

    private static HttpRequestDef<ListConditionRequest, ListConditionResponse> genForListCondition() {
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
            f -> f.withMarshaller(ListConditionRequest::getName, ListConditionRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getCreateBy, ListConditionRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getApprover, ListConditionRequest::setApprover));
        builder.<ListConditionRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConditionRequest.StatusEnum.class),
            f -> f.withMarshaller(ListConditionRequest::getStatus, ListConditionRequest::setStatus));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getBeginTime, ListConditionRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getEndTime, ListConditionRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConditionRequest::getLimit, ListConditionRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConditionRequest::getOffset, ListConditionRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConditionRequest::getWorkspace, ListConditionRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsistencyTaskRequest, ListConsistencyTaskResponse> listConsistencyTask =
        genForListConsistencyTask();

    private static HttpRequestDef<ListConsistencyTaskRequest, ListConsistencyTaskResponse> genForListConsistencyTask() {
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
            f -> f.withMarshaller(ListConsistencyTaskRequest::getCategoryId,
                ListConsistencyTaskRequest::setCategoryId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getName, ListConsistencyTaskRequest::setName));
        builder.<ListConsistencyTaskRequest.ScheduleStatusEnum>withRequestField("schedule_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConsistencyTaskRequest.ScheduleStatusEnum.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getScheduleStatus,
                ListConsistencyTaskRequest::setScheduleStatus));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getStartTime, ListConsistencyTaskRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getEndTime, ListConsistencyTaskRequest::setEndTime));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getCreator, ListConsistencyTaskRequest::setCreator));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getLimit, ListConsistencyTaskRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getOffset, ListConsistencyTaskRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsistencyTaskRequest::getWorkspace, ListConsistencyTaskRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse> listDataArtsStudioInstances =
        genForListDataArtsStudioInstances();

    private static HttpRequestDef<ListDataArtsStudioInstancesRequest, ListDataArtsStudioInstancesResponse> genForListDataArtsStudioInstances() {
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
            f -> f.withMarshaller(ListDataArtsStudioInstancesRequest::getLimit,
                ListDataArtsStudioInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataArtsStudioInstancesRequest::getOffset,
                ListDataArtsStudioInstancesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataTablesRequest, ListDataTablesResponse> listDataTables =
        genForListDataTables();

    private static HttpRequestDef<ListDataTablesRequest, ListDataTablesResponse> genForListDataTables() {
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
            f -> f.withMarshaller(ListDataTablesRequest::getConnectionId, ListDataTablesRequest::setConnectionId));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getDatabaseName, ListDataTablesRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getTableName, ListDataTablesRequest::setTableName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getLimit, ListDataTablesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getOffset, ListDataTablesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataTablesRequest::getWorkspace, ListDataTablesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForListDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForListDatabases() {
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
            f -> f.withMarshaller(ListDatabasesRequest::getConnectionId, ListDatabasesRequest::setConnectionId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, ListDatabasesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getOffset, ListDatabasesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getWorkspace, ListDatabasesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataconnectionsRequest, ListDataconnectionsResponse> listDataconnections =
        genForListDataconnections();

    private static HttpRequestDef<ListDataconnectionsRequest, ListDataconnectionsResponse> genForListDataconnections() {
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
            f -> f.withMarshaller(ListDataconnectionsRequest::getName, ListDataconnectionsRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getType, ListDataconnectionsRequest::setType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getLimit, ListDataconnectionsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getOffset, ListDataconnectionsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataconnectionsRequest::getWorkspace, ListDataconnectionsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse> listDerivativeIndexes =
        genForListDerivativeIndexes();

    private static HttpRequestDef<ListDerivativeIndexesRequest, ListDerivativeIndexesResponse> genForListDerivativeIndexes() {
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
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getName, ListDerivativeIndexesRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getCreateBy,
                ListDerivativeIndexesRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getApprover,
                ListDerivativeIndexesRequest::setApprover));
        builder.<ListDerivativeIndexesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDerivativeIndexesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getStatus, ListDerivativeIndexesRequest::setStatus));
        builder.<Long>withRequestField("dimension_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getDimensionId,
                ListDerivativeIndexesRequest::setDimensionId));
        builder.<String>withRequestField("dimension_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getDimensionGroup,
                ListDerivativeIndexesRequest::setDimensionGroup));
        builder.<Long>withRequestField("atomic_index_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getAtomicIndexId,
                ListDerivativeIndexesRequest::setAtomicIndexId));
        builder.<Boolean>withRequestField("all_metrics",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getAllMetrics,
                ListDerivativeIndexesRequest::setAllMetrics));
        builder.<String>withRequestField("dw_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getDwType, ListDerivativeIndexesRequest::setDwType));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getL3Id, ListDerivativeIndexesRequest::setL3Id));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getBeginTime,
                ListDerivativeIndexesRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getEndTime, ListDerivativeIndexesRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getLimit, ListDerivativeIndexesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getOffset, ListDerivativeIndexesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDerivativeIndexesRequest::getWorkspace,
                ListDerivativeIndexesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDimensionGroupsRequest, ListDimensionGroupsResponse> listDimensionGroups =
        genForListDimensionGroups();

    private static HttpRequestDef<ListDimensionGroupsRequest, ListDimensionGroupsResponse> genForListDimensionGroups() {
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
            f -> f.withMarshaller(ListDimensionGroupsRequest::getTableId, ListDimensionGroupsRequest::setTableId));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getBizType, ListDimensionGroupsRequest::setBizType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getLimit, ListDimensionGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getOffset, ListDimensionGroupsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionGroupsRequest::getWorkspace, ListDimensionGroupsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse> listDimensionLogicTables =
        genForListDimensionLogicTables();

    private static HttpRequestDef<ListDimensionLogicTablesRequest, ListDimensionLogicTablesResponse> genForListDimensionLogicTables() {
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
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getName, ListDimensionLogicTablesRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getCreateBy,
                ListDimensionLogicTablesRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getApprover,
                ListDimensionLogicTablesRequest::setApprover));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getOwner,
                ListDimensionLogicTablesRequest::setOwner));
        builder.<ListDimensionLogicTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionLogicTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getStatus,
                ListDimensionLogicTablesRequest::setStatus));
        builder.<ListDimensionLogicTablesRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionLogicTablesRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getSyncStatus,
                ListDimensionLogicTablesRequest::setSyncStatus));
        builder.<List<ListDimensionLogicTablesRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getSyncKey,
                ListDimensionLogicTablesRequest::setSyncKey));
        builder.<Long>withRequestField("l2_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getL2Id, ListDimensionLogicTablesRequest::setL2Id));
        builder.<Long>withRequestField("dimension_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getDimensionId,
                ListDimensionLogicTablesRequest::setDimensionId));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getBeginTime,
                ListDimensionLogicTablesRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getEndTime,
                ListDimensionLogicTablesRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getLimit,
                ListDimensionLogicTablesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getOffset,
                ListDimensionLogicTablesRequest::setOffset));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getBizCatalogId,
                ListDimensionLogicTablesRequest::setBizCatalogId));
        builder.<ListDimensionLogicTablesRequest.DimensionTypeEnum>withRequestField("dimension_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionLogicTablesRequest.DimensionTypeEnum.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getDimensionType,
                ListDimensionLogicTablesRequest::setDimensionType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionLogicTablesRequest::getWorkspace,
                ListDimensionLogicTablesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDimensionsRequest, ListDimensionsResponse> listDimensions =
        genForListDimensions();

    private static HttpRequestDef<ListDimensionsRequest, ListDimensionsResponse> genForListDimensions() {
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
            f -> f.withMarshaller(ListDimensionsRequest::getName, ListDimensionsRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getCreateBy, ListDimensionsRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getApprover, ListDimensionsRequest::setApprover));
        builder.<ListDimensionsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListDimensionsRequest::getStatus, ListDimensionsRequest::setStatus));
        builder.<Long>withRequestField("l2_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionsRequest::getL2Id, ListDimensionsRequest::setL2Id));
        builder.<List<Long>>withRequestField("derivative_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDimensionsRequest::getDerivativeIds, ListDimensionsRequest::setDerivativeIds));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getBeginTime, ListDimensionsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getEndTime, ListDimensionsRequest::setEndTime));
        builder.<Long>withRequestField("fact_logic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDimensionsRequest::getFactLogicId, ListDimensionsRequest::setFactLogicId));
        builder.<ListDimensionsRequest.DimensionTypeEnum>withRequestField("dimension_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDimensionsRequest.DimensionTypeEnum.class),
            f -> f.withMarshaller(ListDimensionsRequest::getDimensionType, ListDimensionsRequest::setDimensionType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionsRequest::getLimit, ListDimensionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDimensionsRequest::getOffset, ListDimensionsRequest::setOffset));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getBizCatalogId, ListDimensionsRequest::setBizCatalogId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDimensionsRequest::getWorkspace, ListDimensionsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectoriesRequest, ListDirectoriesResponse> listDirectories =
        genForListDirectories();

    private static HttpRequestDef<ListDirectoriesRequest, ListDirectoriesResponse> genForListDirectories() {
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
            f -> f.withMarshaller(ListDirectoriesRequest::getLimit, ListDirectoriesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getOffset, ListDirectoriesRequest::setOffset));
        builder.<ListDirectoriesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDirectoriesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getType, ListDirectoriesRequest::setType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectoriesRequest::getWorkspace, ListDirectoriesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFactLogicTablesRequest, ListFactLogicTablesResponse> listFactLogicTables =
        genForListFactLogicTables();

    private static HttpRequestDef<ListFactLogicTablesRequest, ListFactLogicTablesResponse> genForListFactLogicTables() {
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
            f -> f.withMarshaller(ListFactLogicTablesRequest::getName, ListFactLogicTablesRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getCreateBy, ListFactLogicTablesRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getApprover, ListFactLogicTablesRequest::setApprover));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getOwner, ListFactLogicTablesRequest::setOwner));
        builder.<ListFactLogicTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFactLogicTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getStatus, ListFactLogicTablesRequest::setStatus));
        builder.<ListFactLogicTablesRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFactLogicTablesRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getSyncStatus,
                ListFactLogicTablesRequest::setSyncStatus));
        builder.<List<ListFactLogicTablesRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getSyncKey, ListFactLogicTablesRequest::setSyncKey));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getL3Id, ListFactLogicTablesRequest::setL3Id));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getBeginTime, ListFactLogicTablesRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getEndTime, ListFactLogicTablesRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getLimit, ListFactLogicTablesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getOffset, ListFactLogicTablesRequest::setOffset));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getBizCatalogId,
                ListFactLogicTablesRequest::setBizCatalogId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactLogicTablesRequest::getWorkspace, ListFactLogicTablesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFactoryAlarmInfoRequest, ListFactoryAlarmInfoResponse> listFactoryAlarmInfo =
        genForListFactoryAlarmInfo();

    private static HttpRequestDef<ListFactoryAlarmInfoRequest, ListFactoryAlarmInfoResponse> genForListFactoryAlarmInfo() {
        // basic
        HttpRequestDef.Builder<ListFactoryAlarmInfoRequest, ListFactoryAlarmInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFactoryAlarmInfoRequest.class, ListFactoryAlarmInfoResponse.class)
            .withName("ListFactoryAlarmInfo")
            .withUri("/v2/{project_id}/factory/alarm-info")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFactoryAlarmInfoRequest::getStartTime,
                ListFactoryAlarmInfoRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFactoryAlarmInfoRequest::getEndTime, ListFactoryAlarmInfoRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactoryAlarmInfoRequest::getOffset, ListFactoryAlarmInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactoryAlarmInfoRequest::getLimit, ListFactoryAlarmInfoRequest::setLimit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryAlarmInfoRequest::getWorkspace,
                ListFactoryAlarmInfoRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFactoryJobInstancesByNameRequest, ListFactoryJobInstancesByNameResponse> listFactoryJobInstancesByName =
        genForListFactoryJobInstancesByName();

    private static HttpRequestDef<ListFactoryJobInstancesByNameRequest, ListFactoryJobInstancesByNameResponse> genForListFactoryJobInstancesByName() {
        // basic
        HttpRequestDef.Builder<ListFactoryJobInstancesByNameRequest, ListFactoryJobInstancesByNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListFactoryJobInstancesByNameRequest.class,
                    ListFactoryJobInstancesByNameResponse.class)
                .withName("ListFactoryJobInstancesByName")
                .withUri("/v2/{project_id}/factory/jobs/{job_name}/instances/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getJobName,
                ListFactoryJobInstancesByNameRequest::setJobName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getLimit,
                ListFactoryJobInstancesByNameRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getOffset,
                ListFactoryJobInstancesByNameRequest::setOffset));
        builder.<Long>withRequestField("min_plan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getMinPlanTime,
                ListFactoryJobInstancesByNameRequest::setMinPlanTime));
        builder.<Long>withRequestField("max_plan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getMaxPlanTime,
                ListFactoryJobInstancesByNameRequest::setMaxPlanTime));
        builder.<ListFactoryJobInstancesByNameRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFactoryJobInstancesByNameRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getStatus,
                ListFactoryJobInstancesByNameRequest::setStatus));
        builder.<Boolean>withRequestField("force_success",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getForceSuccess,
                ListFactoryJobInstancesByNameRequest::setForceSuccess));
        builder.<Boolean>withRequestField("ignore_success",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getIgnoreSuccess,
                ListFactoryJobInstancesByNameRequest::setIgnoreSuccess));
        builder.<String>withRequestField("instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getInstanceType,
                ListFactoryJobInstancesByNameRequest::setInstanceType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryJobInstancesByNameRequest::getWorkspace,
                ListFactoryJobInstancesByNameRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFactoryJobsRequest, ListFactoryJobsResponse> listFactoryJobs =
        genForListFactoryJobs();

    private static HttpRequestDef<ListFactoryJobsRequest, ListFactoryJobsResponse> genForListFactoryJobs() {
        // basic
        HttpRequestDef.Builder<ListFactoryJobsRequest, ListFactoryJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFactoryJobsRequest.class, ListFactoryJobsResponse.class)
                .withName("ListFactoryJobs")
                .withUri("/v2/{project_id}/factory/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactoryJobsRequest::getLimit, ListFactoryJobsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFactoryJobsRequest::getOffset, ListFactoryJobsRequest::setOffset));
        builder.<ListFactoryJobsRequest.JobTypeEnum>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFactoryJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListFactoryJobsRequest::getJobType, ListFactoryJobsRequest::setJobType));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryJobsRequest::getJobName, ListFactoryJobsRequest::setJobName));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryJobsRequest::getTags, ListFactoryJobsRequest::setTags));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryJobsRequest::getWorkspace, ListFactoryJobsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFactoryReleasePackagesRequest, ListFactoryReleasePackagesResponse> listFactoryReleasePackages =
        genForListFactoryReleasePackages();

    private static HttpRequestDef<ListFactoryReleasePackagesRequest, ListFactoryReleasePackagesResponse> genForListFactoryReleasePackages() {
        // basic
        HttpRequestDef.Builder<ListFactoryReleasePackagesRequest, ListFactoryReleasePackagesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListFactoryReleasePackagesRequest.class,
                    ListFactoryReleasePackagesResponse.class)
                .withName("ListFactoryReleasePackages")
                .withUri("/v2/{project_id}/factory/release-packages")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryReleasePackagesRequest::getWorkspace,
                ListFactoryReleasePackagesRequest::setWorkspace));
        builder.<ListReleasePackagesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListReleasePackagesRequestBody.class),
            f -> f.withMarshaller(ListFactoryReleasePackagesRequest::getBody,
                ListFactoryReleasePackagesRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFactoryReleasePackagesResponse::getXRequestId,
                ListFactoryReleasePackagesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFactoryTaskCompletionRequest, ListFactoryTaskCompletionResponse> listFactoryTaskCompletion =
        genForListFactoryTaskCompletion();

    private static HttpRequestDef<ListFactoryTaskCompletionRequest, ListFactoryTaskCompletionResponse> genForListFactoryTaskCompletion() {
        // basic
        HttpRequestDef.Builder<ListFactoryTaskCompletionRequest, ListFactoryTaskCompletionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListFactoryTaskCompletionRequest.class,
                    ListFactoryTaskCompletionResponse.class)
                .withName("ListFactoryTaskCompletion")
                .withUri("/v2/{project_id}/factory/monitor/task-completion-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryTaskCompletionRequest::getType,
                ListFactoryTaskCompletionRequest::setType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryTaskCompletionRequest::getWorkspace,
                ListFactoryTaskCompletionRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFactoryTaskOverviewRequest, ListFactoryTaskOverviewResponse> listFactoryTaskOverview =
        genForListFactoryTaskOverview();

    private static HttpRequestDef<ListFactoryTaskOverviewRequest, ListFactoryTaskOverviewResponse> genForListFactoryTaskOverview() {
        // basic
        HttpRequestDef.Builder<ListFactoryTaskOverviewRequest, ListFactoryTaskOverviewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFactoryTaskOverviewRequest.class, ListFactoryTaskOverviewResponse.class)
            .withName("ListFactoryTaskOverview")
            .withUri("/v2/{project_id}/factory/monitor/task-statistics-overview")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("is_own",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryTaskOverviewRequest::getIsOwn, ListFactoryTaskOverviewRequest::setIsOwn));
        builder.<String>withRequestField("query_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryTaskOverviewRequest::getQueryDays,
                ListFactoryTaskOverviewRequest::setQueryDays));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFactoryTaskOverviewRequest::getWorkspace,
                ListFactoryTaskOverviewRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
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
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<ListInstancesRequest.TaskTypeEnum>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.TaskTypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getTaskType, ListInstancesRequest::setTaskType));
        builder.<ListInstancesRequest.RunStatusEnum>withRequestField("run_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.RunStatusEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getRunStatus, ListInstancesRequest::setRunStatus));
        builder.<ListInstancesRequest.NotifyStatusEnum>withRequestField("notify_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.NotifyStatusEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getNotifyStatus, ListInstancesRequest::setNotifyStatus));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getStartTime, ListInstancesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getEndTime, ListInstancesRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getWorkspace, ListInstancesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse> listManagerWorkSpaces =
        genForListManagerWorkSpaces();

    private static HttpRequestDef<ListManagerWorkSpacesRequest, ListManagerWorkSpacesResponse> genForListManagerWorkSpaces() {
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
            f -> f.withMarshaller(ListManagerWorkSpacesRequest::getInstanceId,
                ListManagerWorkSpacesRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagerWorkSpacesRequest::getLimit, ListManagerWorkSpacesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagerWorkSpacesRequest::getOffset, ListManagerWorkSpacesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageRequest, ListMessageResponse> listMessage = genForListMessage();

    private static HttpRequestDef<ListMessageRequest, ListMessageResponse> genForListMessage() {
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
            f -> f.withMarshaller(ListMessageRequest::getOffset, ListMessageRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getLimit, ListMessageRequest::setLimit));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getApiName, ListMessageRequest::setApiName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getWorkspace, ListMessageRequest::setWorkspace));
        builder.<ListMessageRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMessageRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListMessageRequest::getDlmType, ListMessageRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricRelationsRequest, ListMetricRelationsResponse> listMetricRelations =
        genForListMetricRelations();

    private static HttpRequestDef<ListMetricRelationsRequest, ListMetricRelationsResponse> genForListMetricRelations() {
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
            f -> f.withMarshaller(ListMetricRelationsRequest::getId, ListMetricRelationsRequest::setId));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricRelationsRequest::getBizType, ListMetricRelationsRequest::setBizType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricRelationsRequest::getWorkspace, ListMetricRelationsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQualityTaskRequest, ListQualityTaskResponse> listQualityTask =
        genForListQualityTask();

    private static HttpRequestDef<ListQualityTaskRequest, ListQualityTaskResponse> genForListQualityTask() {
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
            f -> f.withMarshaller(ListQualityTaskRequest::getCategoryId, ListQualityTaskRequest::setCategoryId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getName, ListQualityTaskRequest::setName));
        builder.<ListQualityTaskRequest.ScheduleStatusEnum>withRequestField("schedule_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListQualityTaskRequest.ScheduleStatusEnum.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getScheduleStatus,
                ListQualityTaskRequest::setScheduleStatus));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getStartTime, ListQualityTaskRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getEndTime, ListQualityTaskRequest::setEndTime));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getCreator, ListQualityTaskRequest::setCreator));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getLimit, ListQualityTaskRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getOffset, ListQualityTaskRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskRequest::getWorkspace, ListQualityTaskRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQualityTaskListsRequest, ListQualityTaskListsResponse> listQualityTaskLists =
        genForListQualityTaskLists();

    private static HttpRequestDef<ListQualityTaskListsRequest, ListQualityTaskListsResponse> genForListQualityTaskLists() {
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
            f -> f.withMarshaller(ListQualityTaskListsRequest::getStart, ListQualityTaskListsRequest::setStart));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getPageSize, ListQualityTaskListsRequest::setPageSize));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getOffset, ListQualityTaskListsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getLimit, ListQualityTaskListsRequest::setLimit));
        builder.<Long>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getCategoryId,
                ListQualityTaskListsRequest::setCategoryId));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getRuleName, ListQualityTaskListsRequest::setRuleName));
        builder.<Integer>withRequestField("schedule_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getScheduleStatus,
                ListQualityTaskListsRequest::setScheduleStatus));
        builder.<Integer>withRequestField("schedule_period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getSchedulePeriod,
                ListQualityTaskListsRequest::setSchedulePeriod));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getStartTime,
                ListQualityTaskListsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getEndTime, ListQualityTaskListsRequest::setEndTime));
        builder.<Integer>withRequestField("result_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getResultStatus,
                ListQualityTaskListsRequest::setResultStatus));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getSort, ListQualityTaskListsRequest::setSort));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTaskListsRequest::getOrder, ListQualityTaskListsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQualityTemplatesRequest, ListQualityTemplatesResponse> listQualityTemplates =
        genForListQualityTemplates();

    private static HttpRequestDef<ListQualityTemplatesRequest, ListQualityTemplatesResponse> genForListQualityTemplates() {
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
            f -> f.withMarshaller(ListQualityTemplatesRequest::getCategoryId,
                ListQualityTemplatesRequest::setCategoryId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getName, ListQualityTemplatesRequest::setName));
        builder.<Boolean>withRequestField("system_template",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getSystemTemplate,
                ListQualityTemplatesRequest::setSystemTemplate));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getCreator, ListQualityTemplatesRequest::setCreator));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getLimit, ListQualityTemplatesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getOffset, ListQualityTemplatesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQualityTemplatesRequest::getWorkspace,
                ListQualityTemplatesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationsRequest, ListRelationsResponse> listRelations =
        genForListRelations();

    private static HttpRequestDef<ListRelationsRequest, ListRelationsResponse> genForListRelations() {
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
            f -> f.withMarshaller(ListRelationsRequest::getName, ListRelationsRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getCreateBy, ListRelationsRequest::setCreateBy));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getBeginTime, ListRelationsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getEndTime, ListRelationsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationsRequest::getLimit, ListRelationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationsRequest::getOffset, ListRelationsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationsRequest::getWorkspace, ListRelationsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSchemasRequest, ListSchemasResponse> listSchemas = genForListSchemas();

    private static HttpRequestDef<ListSchemasRequest, ListSchemasResponse> genForListSchemas() {
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
            f -> f.withMarshaller(ListSchemasRequest::getConnectionId, ListSchemasRequest::setConnectionId));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getDatabaseName, ListSchemasRequest::setDatabaseName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getLimit, ListSchemasRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getOffset, ListSchemasRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getWorkspace, ListSchemasRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityDataClassificationRuleGroupsRequest, ListSecurityDataClassificationRuleGroupsResponse> listSecurityDataClassificationRuleGroups =
        genForListSecurityDataClassificationRuleGroups();

    private static HttpRequestDef<ListSecurityDataClassificationRuleGroupsRequest, ListSecurityDataClassificationRuleGroupsResponse> genForListSecurityDataClassificationRuleGroups() {
        // basic
        HttpRequestDef.Builder<ListSecurityDataClassificationRuleGroupsRequest, ListSecurityDataClassificationRuleGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityDataClassificationRuleGroupsRequest.class,
                    ListSecurityDataClassificationRuleGroupsResponse.class)
                .withName("ListSecurityDataClassificationRuleGroups")
                .withUri("/v1/{project_id}/security/data-classification/rule/group")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRuleGroupsRequest::getLimit,
                ListSecurityDataClassificationRuleGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRuleGroupsRequest::getOffset,
                ListSecurityDataClassificationRuleGroupsRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRuleGroupsRequest::getName,
                ListSecurityDataClassificationRuleGroupsRequest::setName));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRuleGroupsRequest::getCreator,
                ListSecurityDataClassificationRuleGroupsRequest::setCreator));
        builder.<ListSecurityDataClassificationRuleGroupsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityDataClassificationRuleGroupsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRuleGroupsRequest::getOrderBy,
                ListSecurityDataClassificationRuleGroupsRequest::setOrderBy));
        builder.<Boolean>withRequestField("desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRuleGroupsRequest::getDesc,
                ListSecurityDataClassificationRuleGroupsRequest::setDesc));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRuleGroupsRequest::getWorkspace,
                ListSecurityDataClassificationRuleGroupsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityDataClassificationRulesRequest, ListSecurityDataClassificationRulesResponse> listSecurityDataClassificationRules =
        genForListSecurityDataClassificationRules();

    private static HttpRequestDef<ListSecurityDataClassificationRulesRequest, ListSecurityDataClassificationRulesResponse> genForListSecurityDataClassificationRules() {
        // basic
        HttpRequestDef.Builder<ListSecurityDataClassificationRulesRequest, ListSecurityDataClassificationRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityDataClassificationRulesRequest.class,
                    ListSecurityDataClassificationRulesResponse.class)
                .withName("ListSecurityDataClassificationRules")
                .withUri("/v1/{project_id}/security/data-classification/rule")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getOffset,
                ListSecurityDataClassificationRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getLimit,
                ListSecurityDataClassificationRulesRequest::setLimit));
        builder.<String>withRequestField("secrecy_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getSecrecyLevel,
                ListSecurityDataClassificationRulesRequest::setSecrecyLevel));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getName,
                ListSecurityDataClassificationRulesRequest::setName));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getCreator,
                ListSecurityDataClassificationRulesRequest::setCreator));
        builder.<Boolean>withRequestField("enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getEnable,
                ListSecurityDataClassificationRulesRequest::setEnable));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getStartTime,
                ListSecurityDataClassificationRulesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getEndTime,
                ListSecurityDataClassificationRulesRequest::setEndTime));
        builder.<ListSecurityDataClassificationRulesRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityDataClassificationRulesRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getOrderBy,
                ListSecurityDataClassificationRulesRequest::setOrderBy));
        builder.<Boolean>withRequestField("desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getDesc,
                ListSecurityDataClassificationRulesRequest::setDesc));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDataClassificationRulesRequest::getWorkspace,
                ListSecurityDataClassificationRulesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityDatasourceActionsRequest, ListSecurityDatasourceActionsResponse> listSecurityDatasourceActions =
        genForListSecurityDatasourceActions();

    private static HttpRequestDef<ListSecurityDatasourceActionsRequest, ListSecurityDatasourceActionsResponse> genForListSecurityDatasourceActions() {
        // basic
        HttpRequestDef.Builder<ListSecurityDatasourceActionsRequest, ListSecurityDatasourceActionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityDatasourceActionsRequest.class,
                    ListSecurityDatasourceActionsResponse.class)
                .withName("ListSecurityDatasourceActions")
                .withUri("/v1/{project_id}/security/permission-sets/datasource/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parent_permission_set_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getParentPermissionSetId,
                ListSecurityDatasourceActionsRequest::setParentPermissionSetId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getClusterId,
                ListSecurityDatasourceActionsRequest::setClusterId));
        builder.<ListSecurityDatasourceActionsRequest.DatasourceTypeEnum>withRequestField("datasource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSecurityDatasourceActionsRequest.DatasourceTypeEnum.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getDatasourceType,
                ListSecurityDatasourceActionsRequest::setDatasourceType));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getDatabaseName,
                ListSecurityDatasourceActionsRequest::setDatabaseName));
        builder.<String>withRequestField("schema_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getSchemaName,
                ListSecurityDatasourceActionsRequest::setSchemaName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getTableName,
                ListSecurityDatasourceActionsRequest::setTableName));
        builder.<String>withRequestField("column_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getColumnName,
                ListSecurityDatasourceActionsRequest::setColumnName));
        builder.<String>withRequestField("url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getUrl,
                ListSecurityDatasourceActionsRequest::setUrl));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceActionsRequest::getWorkspace,
                ListSecurityDatasourceActionsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityDatasourceConfigurationsRequest, ListSecurityDatasourceConfigurationsResponse> listSecurityDatasourceConfigurations =
        genForListSecurityDatasourceConfigurations();

    private static HttpRequestDef<ListSecurityDatasourceConfigurationsRequest, ListSecurityDatasourceConfigurationsResponse> genForListSecurityDatasourceConfigurations() {
        // basic
        HttpRequestDef.Builder<ListSecurityDatasourceConfigurationsRequest, ListSecurityDatasourceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityDatasourceConfigurationsRequest.class,
                    ListSecurityDatasourceConfigurationsResponse.class)
                .withName("ListSecurityDatasourceConfigurations")
                .withUri("/v1/{project_id}/security/permission-sets/datasource/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceConfigurationsRequest::getWorkspace,
                ListSecurityDatasourceConfigurationsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityDatasourceUrlsRequest, ListSecurityDatasourceUrlsResponse> listSecurityDatasourceUrls =
        genForListSecurityDatasourceUrls();

    private static HttpRequestDef<ListSecurityDatasourceUrlsRequest, ListSecurityDatasourceUrlsResponse> genForListSecurityDatasourceUrls() {
        // basic
        HttpRequestDef.Builder<ListSecurityDatasourceUrlsRequest, ListSecurityDatasourceUrlsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityDatasourceUrlsRequest.class,
                    ListSecurityDatasourceUrlsResponse.class)
                .withName("ListSecurityDatasourceUrls")
                .withUri("/v1/{project_id}/security/permission-sets/datasource/urls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceUrlsRequest::getClusterId,
                ListSecurityDatasourceUrlsRequest::setClusterId));
        builder.<ListSecurityDatasourceUrlsRequest.DatasourceTypeEnum>withRequestField("datasource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityDatasourceUrlsRequest.DatasourceTypeEnum.class),
            f -> f.withMarshaller(ListSecurityDatasourceUrlsRequest::getDatasourceType,
                ListSecurityDatasourceUrlsRequest::setDatasourceType));
        builder.<String>withRequestField("parent_permission_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceUrlsRequest::getParentPermissionSetId,
                ListSecurityDatasourceUrlsRequest::setParentPermissionSetId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityDatasourceUrlsRequest::getWorkspace,
                ListSecurityDatasourceUrlsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityPermissionSetMembersRequest, ListSecurityPermissionSetMembersResponse> listSecurityPermissionSetMembers =
        genForListSecurityPermissionSetMembers();

    private static HttpRequestDef<ListSecurityPermissionSetMembersRequest, ListSecurityPermissionSetMembersResponse> genForListSecurityPermissionSetMembers() {
        // basic
        HttpRequestDef.Builder<ListSecurityPermissionSetMembersRequest, ListSecurityPermissionSetMembersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityPermissionSetMembersRequest.class,
                    ListSecurityPermissionSetMembersResponse.class)
                .withName("ListSecurityPermissionSetMembers")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetMembersRequest::getPermissionSetId,
                ListSecurityPermissionSetMembersRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityPermissionSetMembersRequest::getLimit,
                ListSecurityPermissionSetMembersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityPermissionSetMembersRequest::getOffset,
                ListSecurityPermissionSetMembersRequest::setOffset));
        builder.<String>withRequestField("member_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetMembersRequest::getMemberName,
                ListSecurityPermissionSetMembersRequest::setMemberName));
        builder.<ListSecurityPermissionSetMembersRequest.MemberTypeEnum>withRequestField("member_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetMembersRequest.MemberTypeEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetMembersRequest::getMemberType,
                ListSecurityPermissionSetMembersRequest::setMemberType));
        builder.<Boolean>withRequestField("order_by_asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityPermissionSetMembersRequest::getOrderByAsc,
                ListSecurityPermissionSetMembersRequest::setOrderByAsc));
        builder.<ListSecurityPermissionSetMembersRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetMembersRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetMembersRequest::getOrderBy,
                ListSecurityPermissionSetMembersRequest::setOrderBy));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetMembersRequest::getWorkspace,
                ListSecurityPermissionSetMembersRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityPermissionSetPermissionsRequest, ListSecurityPermissionSetPermissionsResponse> listSecurityPermissionSetPermissions =
        genForListSecurityPermissionSetPermissions();

    private static HttpRequestDef<ListSecurityPermissionSetPermissionsRequest, ListSecurityPermissionSetPermissionsResponse> genForListSecurityPermissionSetPermissions() {
        // basic
        HttpRequestDef.Builder<ListSecurityPermissionSetPermissionsRequest, ListSecurityPermissionSetPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityPermissionSetPermissionsRequest.class,
                    ListSecurityPermissionSetPermissionsResponse.class)
                .withName("ListSecurityPermissionSetPermissions")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getPermissionSetId,
                ListSecurityPermissionSetPermissionsRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getLimit,
                ListSecurityPermissionSetPermissionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getOffset,
                ListSecurityPermissionSetPermissionsRequest::setOffset));
        builder.<ListSecurityPermissionSetPermissionsRequest.PermissionTypeEnum>withRequestField("permission_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetPermissionsRequest.PermissionTypeEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getPermissionType,
                ListSecurityPermissionSetPermissionsRequest::setPermissionType));
        builder.<ListSecurityPermissionSetPermissionsRequest.PermissionActionEnum>withRequestField("permission_action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetPermissionsRequest.PermissionActionEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getPermissionAction,
                ListSecurityPermissionSetPermissionsRequest::setPermissionAction));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getClusterId,
                ListSecurityPermissionSetPermissionsRequest::setClusterId));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getClusterName,
                ListSecurityPermissionSetPermissionsRequest::setClusterName));
        builder.<ListSecurityPermissionSetPermissionsRequest.DatasourceTypeEnum>withRequestField("datasource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetPermissionsRequest.DatasourceTypeEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getDatasourceType,
                ListSecurityPermissionSetPermissionsRequest::setDatasourceType));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getDatabaseName,
                ListSecurityPermissionSetPermissionsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getTableName,
                ListSecurityPermissionSetPermissionsRequest::setTableName));
        builder.<String>withRequestField("column_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getColumnName,
                ListSecurityPermissionSetPermissionsRequest::setColumnName));
        builder.<ListSecurityPermissionSetPermissionsRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetPermissionsRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getSyncStatus,
                ListSecurityPermissionSetPermissionsRequest::setSyncStatus));
        builder.<ListSecurityPermissionSetPermissionsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetPermissionsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getOrderBy,
                ListSecurityPermissionSetPermissionsRequest::setOrderBy));
        builder.<Boolean>withRequestField("order_by_asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getOrderByAsc,
                ListSecurityPermissionSetPermissionsRequest::setOrderByAsc));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetPermissionsRequest::getWorkspace,
                ListSecurityPermissionSetPermissionsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityPermissionSetsRequest, ListSecurityPermissionSetsResponse> listSecurityPermissionSets =
        genForListSecurityPermissionSets();

    private static HttpRequestDef<ListSecurityPermissionSetsRequest, ListSecurityPermissionSetsResponse> genForListSecurityPermissionSets() {
        // basic
        HttpRequestDef.Builder<ListSecurityPermissionSetsRequest, ListSecurityPermissionSetsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityPermissionSetsRequest.class,
                    ListSecurityPermissionSetsResponse.class)
                .withName("ListSecurityPermissionSets")
                .withUri("/v1/{project_id}/security/permission-sets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getLimit,
                ListSecurityPermissionSetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getOffset,
                ListSecurityPermissionSetsRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getName,
                ListSecurityPermissionSetsRequest::setName));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getParentId,
                ListSecurityPermissionSetsRequest::setParentId));
        builder.<ListSecurityPermissionSetsRequest.TypeFilterEnum>withRequestField("type_filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetsRequest.TypeFilterEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getTypeFilter,
                ListSecurityPermissionSetsRequest::setTypeFilter));
        builder.<String>withRequestField("manager_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getManagerId,
                ListSecurityPermissionSetsRequest::setManagerId));
        builder.<String>withRequestField("manager_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getManagerName,
                ListSecurityPermissionSetsRequest::setManagerName));
        builder.<ListSecurityPermissionSetsRequest.ManagerTypeEnum>withRequestField("manager_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetsRequest.ManagerTypeEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getManagerType,
                ListSecurityPermissionSetsRequest::setManagerType));
        builder.<ListSecurityPermissionSetsRequest.DatasourceTypeEnum>withRequestField("datasource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetsRequest.DatasourceTypeEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getDatasourceType,
                ListSecurityPermissionSetsRequest::setDatasourceType));
        builder.<ListSecurityPermissionSetsRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetsRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getSyncStatus,
                ListSecurityPermissionSetsRequest::setSyncStatus));
        builder.<ListSecurityPermissionSetsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecurityPermissionSetsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getOrderBy,
                ListSecurityPermissionSetsRequest::setOrderBy));
        builder.<Boolean>withRequestField("order_by_asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getOrderByAsc,
                ListSecurityPermissionSetsRequest::setOrderByAsc));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityPermissionSetsRequest::getWorkspace,
                ListSecurityPermissionSetsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityRoleActionsRequest, ListSecurityRoleActionsResponse> listSecurityRoleActions =
        genForListSecurityRoleActions();

    private static HttpRequestDef<ListSecurityRoleActionsRequest, ListSecurityRoleActionsResponse> genForListSecurityRoleActions() {
        // basic
        HttpRequestDef.Builder<ListSecurityRoleActionsRequest, ListSecurityRoleActionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListSecurityRoleActionsRequest.class, ListSecurityRoleActionsResponse.class)
            .withName("ListSecurityRoleActions")
            .withUri("/v1/{project_id}/security/permission-sets/datasource/role/batch-actions")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityRoleActionsRequest::getWorkspace,
                ListSecurityRoleActionsRequest::setWorkspace));
        builder.<RoleActionQueryDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoleActionQueryDTO.class),
            f -> f.withMarshaller(ListSecurityRoleActionsRequest::getBody, ListSecurityRoleActionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecuritySecrecyLevelsRequest, ListSecuritySecrecyLevelsResponse> listSecuritySecrecyLevels =
        genForListSecuritySecrecyLevels();

    private static HttpRequestDef<ListSecuritySecrecyLevelsRequest, ListSecuritySecrecyLevelsResponse> genForListSecuritySecrecyLevels() {
        // basic
        HttpRequestDef.Builder<ListSecuritySecrecyLevelsRequest, ListSecuritySecrecyLevelsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecuritySecrecyLevelsRequest.class,
                    ListSecuritySecrecyLevelsResponse.class)
                .withName("ListSecuritySecrecyLevels")
                .withUri("/v1/{project_id}/security/data-classification/secrecy-level")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecuritySecrecyLevelsRequest::getOffset,
                ListSecuritySecrecyLevelsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecuritySecrecyLevelsRequest::getLimit,
                ListSecuritySecrecyLevelsRequest::setLimit));
        builder.<ListSecuritySecrecyLevelsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecuritySecrecyLevelsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListSecuritySecrecyLevelsRequest::getOrderBy,
                ListSecuritySecrecyLevelsRequest::setOrderBy));
        builder.<Boolean>withRequestField("desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecuritySecrecyLevelsRequest::getDesc,
                ListSecuritySecrecyLevelsRequest::setDesc));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecuritySecrecyLevelsRequest::getWorkspace,
                ListSecuritySecrecyLevelsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubjectLevelsRequest, ListSubjectLevelsResponse> listSubjectLevels =
        genForListSubjectLevels();

    private static HttpRequestDef<ListSubjectLevelsRequest, ListSubjectLevelsResponse> genForListSubjectLevels() {
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
            f -> f.withMarshaller(ListSubjectLevelsRequest::getLimit, ListSubjectLevelsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubjectLevelsRequest::getOffset, ListSubjectLevelsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubjectLevelsRequest::getWorkspace, ListSubjectLevelsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableModelRelationsRequest, ListTableModelRelationsResponse> listTableModelRelations =
        genForListTableModelRelations();

    private static HttpRequestDef<ListTableModelRelationsRequest, ListTableModelRelationsResponse> genForListTableModelRelations() {
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
            f -> f.withMarshaller(ListTableModelRelationsRequest::getModelId,
                ListTableModelRelationsRequest::setModelId));
        builder.<String>withRequestField("table_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getTableIds,
                ListTableModelRelationsRequest::setTableIds));
        builder.<ListTableModelRelationsRequest.BizTypeEnum>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTableModelRelationsRequest.BizTypeEnum.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getBizType,
                ListTableModelRelationsRequest::setBizType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getLimit, ListTableModelRelationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getOffset,
                ListTableModelRelationsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelRelationsRequest::getWorkspace,
                ListTableModelRelationsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableModelsRequest, ListTableModelsResponse> listTableModels =
        genForListTableModels();

    private static HttpRequestDef<ListTableModelsRequest, ListTableModelsResponse> genForListTableModels() {
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
            f -> f.withMarshaller(ListTableModelsRequest::getName, ListTableModelsRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getCreateBy, ListTableModelsRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getApprover, ListTableModelsRequest::setApprover));
        builder.<ListTableModelsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTableModelsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListTableModelsRequest::getStatus, ListTableModelsRequest::setStatus));
        builder.<ListTableModelsRequest.SyncStatusEnum>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTableModelsRequest.SyncStatusEnum.class),
            f -> f.withMarshaller(ListTableModelsRequest::getSyncStatus, ListTableModelsRequest::setSyncStatus));
        builder.<List<ListTableModelsRequest.SyncKeyEnum>>withRequestField("sync_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTableModelsRequest::getSyncKey, ListTableModelsRequest::setSyncKey));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getBeginTime, ListTableModelsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getEndTime, ListTableModelsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableModelsRequest::getLimit, ListTableModelsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTableModelsRequest::getOffset, ListTableModelsRequest::setOffset));
        builder.<String>withRequestField("model_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getModelId, ListTableModelsRequest::setModelId));
        builder.<String>withRequestField("biz_catalog_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getBizCatalogId, ListTableModelsRequest::setBizCatalogId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableModelsRequest::getWorkspace, ListTableModelsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse> listWorkspaceRoles =
        genForListWorkspaceRoles();

    private static HttpRequestDef<ListWorkspaceRolesRequest, ListWorkspaceRolesResponse> genForListWorkspaceRoles() {
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
            f -> f.withMarshaller(ListWorkspaceRolesRequest::getInstanceId, ListWorkspaceRolesRequest::setInstanceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRolesRequest::getWorkspaceId,
                ListWorkspaceRolesRequest::setWorkspaceId));

        // response
        builder.<List<ApigRoleVo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListWorkspaceRolesResponse::getBody, ListWorkspaceRolesResponse::setBody)
                .withInnerContainerType(ApigRoleVo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForListWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForListWorkspaces() {
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
            f -> f.withMarshaller(ListWorkspacesRequest::getWorkspaceType, ListWorkspacesRequest::setWorkspaceType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getLimit, ListWorkspacesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getOffset, ListWorkspacesRequest::setOffset));
        builder.<String>withRequestField("dw_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getDwType, ListWorkspacesRequest::setDwType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getWorkspace, ListWorkspacesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspaceusersRequest, ListWorkspaceusersResponse> listWorkspaceusers =
        genForListWorkspaceusers();

    private static HttpRequestDef<ListWorkspaceusersRequest, ListWorkspaceusersResponse> genForListWorkspaceusers() {
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
            f -> f.withMarshaller(ListWorkspaceusersRequest::getWorkspaceId,
                ListWorkspaceusersRequest::setWorkspaceId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceusersRequest::getLimit, ListWorkspaceusersRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceusersRequest::getOffset, ListWorkspaceusersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateApiRequest, MigrateApiResponse> migrateApi = genForMigrateApi();

    private static HttpRequestDef<MigrateApiRequest, MigrateApiResponse> genForMigrateApi() {
        // basic
        HttpRequestDef.Builder<MigrateApiRequest, MigrateApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateApiRequest.class, MigrateApiResponse.class)
                .withName("MigrateApi")
                .withUri("/v1/{project_id}/service/servicecatalogs/apis/batch-move")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateApiRequest::getWorkspace, MigrateApiRequest::setWorkspace));
        builder.<MigrateApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigrateApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(MigrateApiRequest::getDlmType, MigrateApiRequest::setDlmType));
        builder.<ApiMoveParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiMoveParaDTO.class),
            f -> f.withMarshaller(MigrateApiRequest::getBody, MigrateApiRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateCatalogRequest, MigrateCatalogResponse> migrateCatalog =
        genForMigrateCatalog();

    private static HttpRequestDef<MigrateCatalogRequest, MigrateCatalogResponse> genForMigrateCatalog() {
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
            f -> f.withMarshaller(MigrateCatalogRequest::getCatalogId, MigrateCatalogRequest::setCatalogId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCatalogRequest::getWorkspace, MigrateCatalogRequest::setWorkspace));
        builder.<MigrateCatalogRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigrateCatalogRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(MigrateCatalogRequest::getDlmType, MigrateCatalogRequest::setDlmType));
        builder.<CatalogMoveParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogMoveParaDTO.class),
            f -> f.withMarshaller(MigrateCatalogRequest::getBody, MigrateCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse> modifyCustomizedFields =
        genForModifyCustomizedFields();

    private static HttpRequestDef<ModifyCustomizedFieldsRequest, ModifyCustomizedFieldsResponse> genForModifyCustomizedFields() {
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
            f -> f.withMarshaller(ModifyCustomizedFieldsRequest::getWorkspace,
                ModifyCustomizedFieldsRequest::setWorkspace));
        builder.<CustomizedFieldsVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomizedFieldsVOList.class),
            f -> f.withMarshaller(ModifyCustomizedFieldsRequest::getBody, ModifyCustomizedFieldsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseUserBehaviorRequest, ParseUserBehaviorResponse> parseUserBehavior =
        genForParseUserBehavior();

    private static HttpRequestDef<ParseUserBehaviorRequest, ParseUserBehaviorResponse> genForParseUserBehavior() {
        // basic
        HttpRequestDef.Builder<ParseUserBehaviorRequest, ParseUserBehaviorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ParseUserBehaviorRequest.class, ParseUserBehaviorResponse.class)
                .withName("ParseUserBehavior")
                .withUri("/v3/{project_id}/datamap/uba")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ParseUserBehaviorRequest::getInstance, ParseUserBehaviorRequest::setInstance));
        builder.<BehaviorRestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BehaviorRestBody.class),
            f -> f.withMarshaller(ParseUserBehaviorRequest::getBody, ParseUserBehaviorRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ParseUserBehaviorResponse::getBody, ParseUserBehaviorResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse> payForDgcOneKey =
        genForPayForDgcOneKey();

    private static HttpRequestDef<PayForDgcOneKeyRequest, PayForDgcOneKeyResponse> genForPayForDgcOneKey() {
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
            f -> f.withMarshaller(PayForDgcOneKeyRequest::getBody, PayForDgcOneKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenewDataProfileRequest, RenewDataProfileResponse> renewDataProfile =
        genForRenewDataProfile();

    private static HttpRequestDef<RenewDataProfileRequest, RenewDataProfileResponse> genForRenewDataProfile() {
        // basic
        HttpRequestDef.Builder<RenewDataProfileRequest, RenewDataProfileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RenewDataProfileRequest.class, RenewDataProfileResponse.class)
                .withName("RenewDataProfile")
                .withUri("/v3/{project_id}/asset/profile/columns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenewDataProfileRequest::getWorkspace, RenewDataProfileRequest::setWorkspace));
        builder.<DataProfileRO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataProfileRO.class),
            f -> f.withMarshaller(RenewDataProfileRequest::getBody, RenewDataProfileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse> resetLinkAttributeAndStandard =
        genForResetLinkAttributeAndStandard();

    private static HttpRequestDef<ResetLinkAttributeAndStandardRequest, ResetLinkAttributeAndStandardResponse> genForResetLinkAttributeAndStandard() {
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
            f -> f.withMarshaller(ResetLinkAttributeAndStandardRequest::getWorkspace,
                ResetLinkAttributeAndStandardRequest::setWorkspace));
        builder.<LinkAttributeAndElementVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LinkAttributeAndElementVO.class),
            f -> f.withMarshaller(ResetLinkAttributeAndStandardRequest::getBody,
                ResetLinkAttributeAndStandardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackApprovalRequest, RollbackApprovalResponse> rollbackApproval =
        genForRollbackApproval();

    private static HttpRequestDef<RollbackApprovalRequest, RollbackApprovalResponse> genForRollbackApproval() {
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
            f -> f.withMarshaller(RollbackApprovalRequest::getIds, RollbackApprovalRequest::setIds));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackApprovalRequest::getWorkspace, RollbackApprovalRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchApprovalsRequest, SearchApprovalsResponse> searchApprovals =
        genForSearchApprovals();

    private static HttpRequestDef<SearchApprovalsRequest, SearchApprovalsResponse> genForSearchApprovals() {
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
            f -> f.withMarshaller(SearchApprovalsRequest::getBizId, SearchApprovalsRequest::setBizId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getName, SearchApprovalsRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getCreateBy, SearchApprovalsRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getApprover, SearchApprovalsRequest::setApprover));
        builder.<SearchApprovalsRequest.ApprovalStatusEnum>withRequestField("approval_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchApprovalsRequest.ApprovalStatusEnum.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getApprovalStatus,
                SearchApprovalsRequest::setApprovalStatus));
        builder.<SearchApprovalsRequest.ApprovalStatusDetailEnum>withRequestField("approval_status_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchApprovalsRequest.ApprovalStatusDetailEnum.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getApprovalStatusDetail,
                SearchApprovalsRequest::setApprovalStatusDetail));
        builder.<SearchApprovalsRequest.ApprovalTypeEnum>withRequestField("approval_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchApprovalsRequest.ApprovalTypeEnum.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getApprovalType, SearchApprovalsRequest::setApprovalType));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getBizType, SearchApprovalsRequest::setBizType));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getBeginTime, SearchApprovalsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getEndTime, SearchApprovalsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getLimit, SearchApprovalsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getOffset, SearchApprovalsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchApprovalsRequest::getWorkspace, SearchApprovalsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse> searchAtomicIndexes =
        genForSearchAtomicIndexes();

    private static HttpRequestDef<SearchAtomicIndexesRequest, SearchAtomicIndexesResponse> genForSearchAtomicIndexes() {
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
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getName, SearchAtomicIndexesRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getCreateBy, SearchAtomicIndexesRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getApprover, SearchAtomicIndexesRequest::setApprover));
        builder.<SearchAtomicIndexesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchAtomicIndexesRequest.StatusEnum.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getStatus, SearchAtomicIndexesRequest::setStatus));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getBeginTime, SearchAtomicIndexesRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getEndTime, SearchAtomicIndexesRequest::setEndTime));
        builder.<Long>withRequestField("l3_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getL3Id, SearchAtomicIndexesRequest::setL3Id));
        builder.<Long>withRequestField("table_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getTableId, SearchAtomicIndexesRequest::setTableId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getLimit, SearchAtomicIndexesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getOffset, SearchAtomicIndexesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAtomicIndexesRequest::getWorkspace, SearchAtomicIndexesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse> searchAuthorizeApp =
        genForSearchAuthorizeApp();

    private static HttpRequestDef<SearchAuthorizeAppRequest, SearchAuthorizeAppResponse> genForSearchAuthorizeApp() {
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
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getApiId, SearchAuthorizeAppRequest::setApiId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getOffset, SearchAuthorizeAppRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getLimit, SearchAuthorizeAppRequest::setLimit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getWorkspace, SearchAuthorizeAppRequest::setWorkspace));
        builder.<SearchAuthorizeAppRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchAuthorizeAppRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(SearchAuthorizeAppRequest::getDlmType, SearchAuthorizeAppRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchBindApiRequest, SearchBindApiResponse> searchBindApi =
        genForSearchBindApi();

    private static HttpRequestDef<SearchBindApiRequest, SearchBindApiResponse> genForSearchBindApi() {
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
            f -> f.withMarshaller(SearchBindApiRequest::getAppId, SearchBindApiRequest::setAppId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchBindApiRequest::getOffset, SearchBindApiRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchBindApiRequest::getLimit, SearchBindApiRequest::setLimit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchBindApiRequest::getWorkspace, SearchBindApiRequest::setWorkspace));
        builder.<SearchBindApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchBindApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(SearchBindApiRequest::getDlmType, SearchBindApiRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCatalogsRequest, SearchCatalogsResponse> searchCatalogs =
        genForSearchCatalogs();

    private static HttpRequestDef<SearchCatalogsRequest, SearchCatalogsResponse> genForSearchCatalogs() {
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
            f -> f.withMarshaller(SearchCatalogsRequest::getName, SearchCatalogsRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getCreateBy, SearchCatalogsRequest::setCreateBy));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getOwner, SearchCatalogsRequest::setOwner));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getBeginTime, SearchCatalogsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getEndTime, SearchCatalogsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getLimit, SearchCatalogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getOffset, SearchCatalogsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCatalogsRequest::getWorkspace, SearchCatalogsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse> searchCodeTableValues =
        genForSearchCodeTableValues();

    private static HttpRequestDef<SearchCodeTableValuesRequest, SearchCodeTableValuesResponse> genForSearchCodeTableValues() {
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
            f -> f.withMarshaller(SearchCodeTableValuesRequest::getId, SearchCodeTableValuesRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCodeTableValuesRequest::getLimit, SearchCodeTableValuesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCodeTableValuesRequest::getOffset, SearchCodeTableValuesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTableValuesRequest::getWorkspace,
                SearchCodeTableValuesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCodeTablesRequest, SearchCodeTablesResponse> searchCodeTables =
        genForSearchCodeTables();

    private static HttpRequestDef<SearchCodeTablesRequest, SearchCodeTablesResponse> genForSearchCodeTables() {
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
            f -> f.withMarshaller(SearchCodeTablesRequest::getName, SearchCodeTablesRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getCreateBy, SearchCodeTablesRequest::setCreateBy));
        builder.<String>withRequestField("approver",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getApprover, SearchCodeTablesRequest::setApprover));
        builder.<Long>withRequestField("directory_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getDirectoryId, SearchCodeTablesRequest::setDirectoryId));
        builder.<SearchCodeTablesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchCodeTablesRequest.StatusEnum.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getStatus, SearchCodeTablesRequest::setStatus));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getBeginTime, SearchCodeTablesRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getEndTime, SearchCodeTablesRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getLimit, SearchCodeTablesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getOffset, SearchCodeTablesRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCodeTablesRequest::getWorkspace, SearchCodeTablesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse> searchCustomizedFields =
        genForSearchCustomizedFields();

    private static HttpRequestDef<SearchCustomizedFieldsRequest, SearchCustomizedFieldsResponse> genForSearchCustomizedFields() {
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
            f -> f.withMarshaller(SearchCustomizedFieldsRequest::getLimit, SearchCustomizedFieldsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCustomizedFieldsRequest::getOffset, SearchCustomizedFieldsRequest::setOffset));
        builder.<SearchCustomizedFieldsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchCustomizedFieldsRequest.TypeEnum.class),
            f -> f.withMarshaller(SearchCustomizedFieldsRequest::getType, SearchCustomizedFieldsRequest::setType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCustomizedFieldsRequest::getWorkspace,
                SearchCustomizedFieldsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDwByTypeRequest, SearchDwByTypeResponse> searchDwByType =
        genForSearchDwByType();

    private static HttpRequestDef<SearchDwByTypeRequest, SearchDwByTypeResponse> genForSearchDwByType() {
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
            f -> f.withMarshaller(SearchDwByTypeRequest::getForceRefresh, SearchDwByTypeRequest::setForceRefresh));
        builder.<String>withRequestField("dw_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getDwType, SearchDwByTypeRequest::setDwType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getLimit, SearchDwByTypeRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getOffset, SearchDwByTypeRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDwByTypeRequest::getWorkspace, SearchDwByTypeRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchIdByPathRequest, SearchIdByPathResponse> searchIdByPath =
        genForSearchIdByPath();

    private static HttpRequestDef<SearchIdByPathRequest, SearchIdByPathResponse> genForSearchIdByPath() {
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
            f -> f.withMarshaller(SearchIdByPathRequest::getPath, SearchIdByPathRequest::setPath));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchIdByPathRequest::getLimit, SearchIdByPathRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchIdByPathRequest::getOffset, SearchIdByPathRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchIdByPathRequest::getWorkspace, SearchIdByPathRequest::setWorkspace));
        builder.<SearchIdByPathRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchIdByPathRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(SearchIdByPathRequest::getDlmType, SearchIdByPathRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchSubjectRequest, SearchSubjectResponse> searchSubject =
        genForSearchSubject();

    private static HttpRequestDef<SearchSubjectRequest, SearchSubjectResponse> genForSearchSubject() {
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
            f -> f.withMarshaller(SearchSubjectRequest::getName, SearchSubjectRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getCreateBy, SearchSubjectRequest::setCreateBy));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getOwner, SearchSubjectRequest::setOwner));
        builder.<SearchSubjectRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchSubjectRequest.StatusEnum.class),
            f -> f.withMarshaller(SearchSubjectRequest::getStatus, SearchSubjectRequest::setStatus));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getBeginTime, SearchSubjectRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getEndTime, SearchSubjectRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchSubjectRequest::getLimit, SearchSubjectRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchSubjectRequest::getOffset, SearchSubjectRequest::setOffset));
        builder.<Long>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchSubjectRequest::getParentId, SearchSubjectRequest::setParentId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectRequest::getWorkspace, SearchSubjectRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchSubjectNewRequest, SearchSubjectNewResponse> searchSubjectNew =
        genForSearchSubjectNew();

    private static HttpRequestDef<SearchSubjectNewRequest, SearchSubjectNewResponse> genForSearchSubjectNew() {
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
            f -> f.withMarshaller(SearchSubjectNewRequest::getName, SearchSubjectNewRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getCreateBy, SearchSubjectNewRequest::setCreateBy));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getOwner, SearchSubjectNewRequest::setOwner));
        builder.<SearchSubjectNewRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchSubjectNewRequest.StatusEnum.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getStatus, SearchSubjectNewRequest::setStatus));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getBeginTime, SearchSubjectNewRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getEndTime, SearchSubjectNewRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getLimit, SearchSubjectNewRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getOffset, SearchSubjectNewRequest::setOffset));
        builder.<Long>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getParentId, SearchSubjectNewRequest::setParentId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchSubjectNewRequest::getWorkspace, SearchSubjectNewRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchVersionsRequest, SearchVersionsResponse> searchVersions =
        genForSearchVersions();

    private static HttpRequestDef<SearchVersionsRequest, SearchVersionsResponse> genForSearchVersions() {
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
            f -> f.withMarshaller(SearchVersionsRequest::getName, SearchVersionsRequest::setName));
        builder.<String>withRequestField("create_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getCreateBy, SearchVersionsRequest::setCreateBy));
        builder.<Long>withRequestField("biz_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchVersionsRequest::getBizId, SearchVersionsRequest::setBizId));
        builder.<String>withRequestField("biz_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getBizType, SearchVersionsRequest::setBizType));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getBeginTime, SearchVersionsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getEndTime, SearchVersionsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchVersionsRequest::getLimit, SearchVersionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchVersionsRequest::getOffset, SearchVersionsRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVersionsRequest::getWorkspace, SearchVersionsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetFactoryJobTagsRequest, SetFactoryJobTagsResponse> setFactoryJobTags =
        genForSetFactoryJobTags();

    private static HttpRequestDef<SetFactoryJobTagsRequest, SetFactoryJobTagsResponse> genForSetFactoryJobTags() {
        // basic
        HttpRequestDef.Builder<SetFactoryJobTagsRequest, SetFactoryJobTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetFactoryJobTagsRequest.class, SetFactoryJobTagsResponse.class)
                .withName("SetFactoryJobTags")
                .withUri("/v2/{project_id}/factory/jobs/{job_name}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetFactoryJobTagsRequest::getJobName, SetFactoryJobTagsRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetFactoryJobTagsRequest::getWorkspace, SetFactoryJobTagsRequest::setWorkspace));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetFactoryJobTagsRequest::getAuthorization,
                SetFactoryJobTagsRequest::setAuthorization));
        builder.<String>withRequestField("Host",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetFactoryJobTagsRequest::getHost, SetFactoryJobTagsRequest::setHost));
        builder.<SetJobTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetJobTagsRequestBody.class),
            f -> f.withMarshaller(SetFactoryJobTagsRequest::getBody, SetFactoryJobTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse> showAggregationLogicTableById =
        genForShowAggregationLogicTableById();

    private static HttpRequestDef<ShowAggregationLogicTableByIdRequest, ShowAggregationLogicTableByIdResponse> genForShowAggregationLogicTableById() {
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
            f -> f.withMarshaller(ShowAggregationLogicTableByIdRequest::getId,
                ShowAggregationLogicTableByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAggregationLogicTableByIdRequest::getLatest,
                ShowAggregationLogicTableByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAggregationLogicTableByIdRequest::getWorkspace,
                ShowAggregationLogicTableByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiDashboardRequest, ShowApiDashboardResponse> showApiDashboard =
        genForShowApiDashboard();

    private static HttpRequestDef<ShowApiDashboardRequest, ShowApiDashboardResponse> genForShowApiDashboard() {
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
            f -> f.withMarshaller(ShowApiDashboardRequest::getApiId, ShowApiDashboardRequest::setApiId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getInstanceId, ShowApiDashboardRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getStartTime, ShowApiDashboardRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getEndTime, ShowApiDashboardRequest::setEndTime));
        builder.<ShowApiDashboardRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApiDashboardRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getTimeUnit, ShowApiDashboardRequest::setTimeUnit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getWorkspace, ShowApiDashboardRequest::setWorkspace));
        builder.<ShowApiDashboardRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApiDashboardRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApiDashboardRequest::getDlmType, ShowApiDashboardRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApisDashboardRequest, ShowApisDashboardResponse> showApisDashboard =
        genForShowApisDashboard();

    private static HttpRequestDef<ShowApisDashboardRequest, ShowApisDashboardResponse> genForShowApisDashboard() {
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
            f -> f.withMarshaller(ShowApisDashboardRequest::getInstanceId, ShowApisDashboardRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getStartTime, ShowApisDashboardRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getEndTime, ShowApisDashboardRequest::setEndTime));
        builder.<ShowApisDashboardRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisDashboardRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getTimeUnit, ShowApisDashboardRequest::setTimeUnit));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getLimit, ShowApisDashboardRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getOffset, ShowApisDashboardRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getWorkspace, ShowApisDashboardRequest::setWorkspace));
        builder.<ShowApisDashboardRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApisDashboardRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApisDashboardRequest::getDlmType, ShowApisDashboardRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApisDetailRequest, ShowApisDetailResponse> showApisDetail =
        genForShowApisDetail();

    private static HttpRequestDef<ShowApisDetailRequest, ShowApisDetailResponse> genForShowApisDetail() {
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
            f -> f.withMarshaller(ShowApisDetailRequest::getApiId, ShowApisDetailRequest::setApiId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getInstanceId, ShowApisDetailRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getStartTime, ShowApisDetailRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getEndTime, ShowApisDetailRequest::setEndTime));
        builder.<ShowApisDetailRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisDetailRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getTimeUnit, ShowApisDetailRequest::setTimeUnit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getWorkspace, ShowApisDetailRequest::setWorkspace));
        builder.<ShowApisDetailRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApisDetailRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApisDetailRequest::getDlmType, ShowApisDetailRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApisOverviewRequest, ShowApisOverviewResponse> showApisOverview =
        genForShowApisOverview();

    private static HttpRequestDef<ShowApisOverviewRequest, ShowApisOverviewResponse> genForShowApisOverview() {
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
            f -> f.withMarshaller(ShowApisOverviewRequest::getStartTime, ShowApisOverviewRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getEndTime, ShowApisOverviewRequest::setEndTime));
        builder.<ShowApisOverviewRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApisOverviewRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getTimeUnit, ShowApisOverviewRequest::setTimeUnit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getWorkspace, ShowApisOverviewRequest::setWorkspace));
        builder.<ShowApisOverviewRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApisOverviewRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApisOverviewRequest::getDlmType, ShowApisOverviewRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppInfoRequest, ShowAppInfoResponse> showAppInfo = genForShowAppInfo();

    private static HttpRequestDef<ShowAppInfoRequest, ShowAppInfoResponse> genForShowAppInfo() {
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
            f -> f.withMarshaller(ShowAppInfoRequest::getAppId, ShowAppInfoRequest::setAppId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppInfoRequest::getWorkspace, ShowAppInfoRequest::setWorkspace));
        builder.<ShowAppInfoRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAppInfoRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowAppInfoRequest::getDlmType, ShowAppInfoRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplyDetailRequest, ShowApplyDetailResponse> showApplyDetail =
        genForShowApplyDetail();

    private static HttpRequestDef<ShowApplyDetailRequest, ShowApplyDetailResponse> genForShowApplyDetail() {
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
            f -> f.withMarshaller(ShowApplyDetailRequest::getApplyId, ShowApplyDetailRequest::setApplyId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplyDetailRequest::getWorkspace, ShowApplyDetailRequest::setWorkspace));
        builder.<ShowApplyDetailRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplyDetailRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApplyDetailRequest::getDlmType, ShowApplyDetailRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppsDashboardRequest, ShowAppsDashboardResponse> showAppsDashboard =
        genForShowAppsDashboard();

    private static HttpRequestDef<ShowAppsDashboardRequest, ShowAppsDashboardResponse> genForShowAppsDashboard() {
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
            f -> f.withMarshaller(ShowAppsDashboardRequest::getStartTime, ShowAppsDashboardRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getEndTime, ShowAppsDashboardRequest::setEndTime));
        builder.<ShowAppsDashboardRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsDashboardRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getTimeUnit, ShowAppsDashboardRequest::setTimeUnit));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getLimit, ShowAppsDashboardRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getOffset, ShowAppsDashboardRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getWorkspace, ShowAppsDashboardRequest::setWorkspace));
        builder.<ShowAppsDashboardRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAppsDashboardRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowAppsDashboardRequest::getDlmType, ShowAppsDashboardRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppsDetailRequest, ShowAppsDetailResponse> showAppsDetail =
        genForShowAppsDetail();

    private static HttpRequestDef<ShowAppsDetailRequest, ShowAppsDetailResponse> genForShowAppsDetail() {
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
            f -> f.withMarshaller(ShowAppsDetailRequest::getAppId, ShowAppsDetailRequest::setAppId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getStartTime, ShowAppsDetailRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getEndTime, ShowAppsDetailRequest::setEndTime));
        builder.<ShowAppsDetailRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsDetailRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getTimeUnit, ShowAppsDetailRequest::setTimeUnit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getWorkspace, ShowAppsDetailRequest::setWorkspace));
        builder.<ShowAppsDetailRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAppsDetailRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowAppsDetailRequest::getDlmType, ShowAppsDetailRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppsOverviewRequest, ShowAppsOverviewResponse> showAppsOverview =
        genForShowAppsOverview();

    private static HttpRequestDef<ShowAppsOverviewRequest, ShowAppsOverviewResponse> genForShowAppsOverview() {
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
            f -> f.withMarshaller(ShowAppsOverviewRequest::getStartTime, ShowAppsOverviewRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getEndTime, ShowAppsOverviewRequest::setEndTime));
        builder.<ShowAppsOverviewRequest.TimeUnitEnum>withRequestField("time_unit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAppsOverviewRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getTimeUnit, ShowAppsOverviewRequest::setTimeUnit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getWorkspace, ShowAppsOverviewRequest::setWorkspace));
        builder.<ShowAppsOverviewRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAppsOverviewRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowAppsOverviewRequest::getDlmType, ShowAppsOverviewRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse> showAtomicIndexById =
        genForShowAtomicIndexById();

    private static HttpRequestDef<ShowAtomicIndexByIdRequest, ShowAtomicIndexByIdResponse> genForShowAtomicIndexById() {
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
            f -> f.withMarshaller(ShowAtomicIndexByIdRequest::getId, ShowAtomicIndexByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAtomicIndexByIdRequest::getLatest, ShowAtomicIndexByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAtomicIndexByIdRequest::getWorkspace, ShowAtomicIndexByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse> showBizCatalogDetail =
        genForShowBizCatalogDetail();

    private static HttpRequestDef<ShowBizCatalogDetailRequest, ShowBizCatalogDetailResponse> genForShowBizCatalogDetail() {
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
            f -> f.withMarshaller(ShowBizCatalogDetailRequest::getId, ShowBizCatalogDetailRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBizCatalogDetailRequest::getWorkspace,
                ShowBizCatalogDetailRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse> showBizMetricById =
        genForShowBizMetricById();

    private static HttpRequestDef<ShowBizMetricByIdRequest, ShowBizMetricByIdResponse> genForShowBizMetricById() {
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
            f -> f.withMarshaller(ShowBizMetricByIdRequest::getId, ShowBizMetricByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowBizMetricByIdRequest::getLatest, ShowBizMetricByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBizMetricByIdRequest::getWorkspace, ShowBizMetricByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse> showBusinessAssets =
        genForShowBusinessAssets();

    private static HttpRequestDef<ShowBusinessAssetsRequest, ShowBusinessAssetsResponse> genForShowBusinessAssets() {
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
            f -> f.withMarshaller(ShowBusinessAssetsRequest::getWorkspace, ShowBusinessAssetsRequest::setWorkspace));
        builder.<BusinessAssetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessAssetRequest.class),
            f -> f.withMarshaller(ShowBusinessAssetsRequest::getBody, ShowBusinessAssetsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse> showBusinessAssetsStatistic =
        genForShowBusinessAssetsStatistic();

    private static HttpRequestDef<ShowBusinessAssetsStatisticRequest, ShowBusinessAssetsStatisticResponse> genForShowBusinessAssetsStatistic() {
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
            f -> f.withMarshaller(ShowBusinessAssetsStatisticRequest::getOffset,
                ShowBusinessAssetsStatisticRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBusinessAssetsStatisticRequest::getLimit,
                ShowBusinessAssetsStatisticRequest::setLimit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBusinessAssetsStatisticRequest::getWorkspace,
                ShowBusinessAssetsStatisticRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBusinessAssetsTreeRequest, ShowBusinessAssetsTreeResponse> showBusinessAssetsTree =
        genForShowBusinessAssetsTree();

    private static HttpRequestDef<ShowBusinessAssetsTreeRequest, ShowBusinessAssetsTreeResponse> genForShowBusinessAssetsTree() {
        // basic
        HttpRequestDef.Builder<ShowBusinessAssetsTreeRequest, ShowBusinessAssetsTreeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBusinessAssetsTreeRequest.class, ShowBusinessAssetsTreeResponse.class)
            .withName("ShowBusinessAssetsTree")
            .withUri("/v3/{project_id}/business-assets/tree/subnode")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBusinessAssetsTreeRequest::getGuid, ShowBusinessAssetsTreeRequest::setGuid));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBusinessAssetsTreeRequest::getWorkspace,
                ShowBusinessAssetsTreeRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCatalogDetailRequest, ShowCatalogDetailResponse> showCatalogDetail =
        genForShowCatalogDetail();

    private static HttpRequestDef<ShowCatalogDetailRequest, ShowCatalogDetailResponse> genForShowCatalogDetail() {
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
            f -> f.withMarshaller(ShowCatalogDetailRequest::getCatalogId, ShowCatalogDetailRequest::setCatalogId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCatalogDetailRequest::getWorkspace, ShowCatalogDetailRequest::setWorkspace));
        builder.<ShowCatalogDetailRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCatalogDetailRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowCatalogDetailRequest::getDlmType, ShowCatalogDetailRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse> showCodeTableById =
        genForShowCodeTableById();

    private static HttpRequestDef<ShowCodeTableByIdRequest, ShowCodeTableByIdResponse> genForShowCodeTableById() {
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
            f -> f.withMarshaller(ShowCodeTableByIdRequest::getId, ShowCodeTableByIdRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCodeTableByIdRequest::getWorkspace, ShowCodeTableByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse> showCompoundMetricById =
        genForShowCompoundMetricById();

    private static HttpRequestDef<ShowCompoundMetricByIdRequest, ShowCompoundMetricByIdResponse> genForShowCompoundMetricById() {
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
            f -> f.withMarshaller(ShowCompoundMetricByIdRequest::getId, ShowCompoundMetricByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowCompoundMetricByIdRequest::getLatest, ShowCompoundMetricByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompoundMetricByIdRequest::getWorkspace,
                ShowCompoundMetricByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConditionByIdRequest, ShowConditionByIdResponse> showConditionById =
        genForShowConditionById();

    private static HttpRequestDef<ShowConditionByIdRequest, ShowConditionByIdResponse> genForShowConditionById() {
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
            f -> f.withMarshaller(ShowConditionByIdRequest::getId, ShowConditionByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowConditionByIdRequest::getLatest, ShowConditionByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConditionByIdRequest::getWorkspace, ShowConditionByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse> showConsistencyTaskDetail =
        genForShowConsistencyTaskDetail();

    private static HttpRequestDef<ShowConsistencyTaskDetailRequest, ShowConsistencyTaskDetailResponse> genForShowConsistencyTaskDetail() {
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
            f -> f.withMarshaller(ShowConsistencyTaskDetailRequest::getId, ShowConsistencyTaskDetailRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsistencyTaskDetailRequest::getWorkspace,
                ShowConsistencyTaskDetailRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataDetailRequest, ShowDataDetailResponse> showDataDetail =
        genForShowDataDetail();

    private static HttpRequestDef<ShowDataDetailRequest, ShowDataDetailResponse> genForShowDataDetail() {
        // basic
        HttpRequestDef.Builder<ShowDataDetailRequest, ShowDataDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataDetailRequest.class, ShowDataDetailResponse.class)
                .withName("ShowDataDetail")
                .withUri("/v1/{project_id}/datamap/entities/guid/{guid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataDetailRequest::getGuid, ShowDataDetailRequest::setGuid));
        builder.<Boolean>withRequestField("ignore_relationships",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDataDetailRequest::getIgnoreRelationships,
                ShowDataDetailRequest::setIgnoreRelationships));
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataDetailRequest::getInstance, ShowDataDetailRequest::setInstance));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataProfileRequest, ShowDataProfileResponse> showDataProfile =
        genForShowDataProfile();

    private static HttpRequestDef<ShowDataProfileRequest, ShowDataProfileResponse> genForShowDataProfile() {
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
            f -> f.withMarshaller(ShowDataProfileRequest::getDwId, ShowDataProfileRequest::setDwId));
        builder.<String>withRequestField("db_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getDbType, ShowDataProfileRequest::setDbType));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getDatabaseName, ShowDataProfileRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getTableName, ShowDataProfileRequest::setTableName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataProfileRequest::getWorkspace, ShowDataProfileRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataSetsRequest, ShowDataSetsResponse> showDataSets = genForShowDataSets();

    private static HttpRequestDef<ShowDataSetsRequest, ShowDataSetsResponse> genForShowDataSets() {
        // basic
        HttpRequestDef.Builder<ShowDataSetsRequest, ShowDataSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDataSetsRequest.class, ShowDataSetsResponse.class)
                .withName("ShowDataSets")
                .withUri("/v3/{project_id}/datamap/entities/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataSetsRequest::getInstance, ShowDataSetsRequest::setInstance));
        builder.<SearchParameter>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchParameter.class),
            f -> f.withMarshaller(ShowDataSetsRequest::getBody, ShowDataSetsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataconnectionRequest, ShowDataconnectionResponse> showDataconnection =
        genForShowDataconnection();

    private static HttpRequestDef<ShowDataconnectionRequest, ShowDataconnectionResponse> genForShowDataconnection() {
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
            f -> f.withMarshaller(ShowDataconnectionRequest::getDataConnectionId,
                ShowDataconnectionRequest::setDataConnectionId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataconnectionRequest::getWorkspace, ShowDataconnectionRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatamapLineageRequest, ShowDatamapLineageResponse> showDatamapLineage =
        genForShowDatamapLineage();

    private static HttpRequestDef<ShowDatamapLineageRequest, ShowDatamapLineageResponse> genForShowDatamapLineage() {
        // basic
        HttpRequestDef.Builder<ShowDatamapLineageRequest, ShowDatamapLineageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDatamapLineageRequest.class, ShowDatamapLineageResponse.class)
                .withName("ShowDatamapLineage")
                .withUri("/v2/{project_id}/datamap/lineage/guid/{guid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatamapLineageRequest::getGuid, ShowDatamapLineageRequest::setGuid));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatamapLineageRequest::getDirection, ShowDatamapLineageRequest::setDirection));
        builder.<List<String>>withRequestField("relationship_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDatamapLineageRequest::getRelationshipTypes,
                ShowDatamapLineageRequest::setRelationshipTypes));
        builder.<List<String>>withRequestField("relationship_type_categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDatamapLineageRequest::getRelationshipTypeCategories,
                ShowDatamapLineageRequest::setRelationshipTypeCategories));
        builder.<List<String>>withRequestField("related_entity_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDatamapLineageRequest::getRelatedEntityTypes,
                ShowDatamapLineageRequest::setRelatedEntityTypes));
        builder.<Boolean>withRequestField("extend_process_data_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDatamapLineageRequest::getExtendProcessDataFlow,
                ShowDatamapLineageRequest::setExtendProcessDataFlow));
        builder.<Boolean>withRequestField("include_parent_entity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDatamapLineageRequest::getIncludeParentEntity,
                ShowDatamapLineageRequest::setIncludeParentEntity));
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatamapLineageRequest::getInstance, ShowDatamapLineageRequest::setInstance));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse> showDerivativeIndexById =
        genForShowDerivativeIndexById();

    private static HttpRequestDef<ShowDerivativeIndexByIdRequest, ShowDerivativeIndexByIdResponse> genForShowDerivativeIndexById() {
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
            f -> f.withMarshaller(ShowDerivativeIndexByIdRequest::getId, ShowDerivativeIndexByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDerivativeIndexByIdRequest::getLatest,
                ShowDerivativeIndexByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDerivativeIndexByIdRequest::getWorkspace,
                ShowDerivativeIndexByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDimensionByIdRequest, ShowDimensionByIdResponse> showDimensionById =
        genForShowDimensionById();

    private static HttpRequestDef<ShowDimensionByIdRequest, ShowDimensionByIdResponse> genForShowDimensionById() {
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
            f -> f.withMarshaller(ShowDimensionByIdRequest::getId, ShowDimensionByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDimensionByIdRequest::getLatest, ShowDimensionByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDimensionByIdRequest::getWorkspace, ShowDimensionByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse> showDimensionLogicTableById =
        genForShowDimensionLogicTableById();

    private static HttpRequestDef<ShowDimensionLogicTableByIdRequest, ShowDimensionLogicTableByIdResponse> genForShowDimensionLogicTableById() {
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
            f -> f.withMarshaller(ShowDimensionLogicTableByIdRequest::getId,
                ShowDimensionLogicTableByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDimensionLogicTableByIdRequest::getLatest,
                ShowDimensionLogicTableByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDimensionLogicTableByIdRequest::getWorkspace,
                ShowDimensionLogicTableByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEntitiesRequest, ShowEntitiesResponse> showEntities = genForShowEntities();

    private static HttpRequestDef<ShowEntitiesRequest, ShowEntitiesResponse> genForShowEntities() {
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
            f -> f.withMarshaller(ShowEntitiesRequest::getWorkspace, ShowEntitiesRequest::setWorkspace));
        builder.<OpenEntitySearchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenEntitySearchRequest.class),
            f -> f.withMarshaller(ShowEntitiesRequest::getBody, ShowEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse> showEntityInfoByGuid =
        genForShowEntityInfoByGuid();

    private static HttpRequestDef<ShowEntityInfoByGuidRequest, ShowEntityInfoByGuidResponse> genForShowEntityInfoByGuid() {
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
            f -> f.withMarshaller(ShowEntityInfoByGuidRequest::getGuid, ShowEntityInfoByGuidRequest::setGuid));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEntityInfoByGuidRequest::getWorkspace,
                ShowEntityInfoByGuidRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse> showFactLogicTableById =
        genForShowFactLogicTableById();

    private static HttpRequestDef<ShowFactLogicTableByIdRequest, ShowFactLogicTableByIdResponse> genForShowFactLogicTableById() {
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
            f -> f.withMarshaller(ShowFactLogicTableByIdRequest::getId, ShowFactLogicTableByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowFactLogicTableByIdRequest::getLatest, ShowFactLogicTableByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactLogicTableByIdRequest::getWorkspace,
                ShowFactLogicTableByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFactoryEnvRequest, ShowFactoryEnvResponse> showFactoryEnv =
        genForShowFactoryEnv();

    private static HttpRequestDef<ShowFactoryEnvRequest, ShowFactoryEnvResponse> genForShowFactoryEnv() {
        // basic
        HttpRequestDef.Builder<ShowFactoryEnvRequest, ShowFactoryEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFactoryEnvRequest.class, ShowFactoryEnvResponse.class)
                .withName("ShowFactoryEnv")
                .withUri("/v2/{project_id}/factory/env")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactoryEnvRequest::getWorkspace, ShowFactoryEnvRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFactoryPackageDetailRequest, ShowFactoryPackageDetailResponse> showFactoryPackageDetail =
        genForShowFactoryPackageDetail();

    private static HttpRequestDef<ShowFactoryPackageDetailRequest, ShowFactoryPackageDetailResponse> genForShowFactoryPackageDetail() {
        // basic
        HttpRequestDef.Builder<ShowFactoryPackageDetailRequest, ShowFactoryPackageDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowFactoryPackageDetailRequest.class, ShowFactoryPackageDetailResponse.class)
                .withName("ShowFactoryPackageDetail")
                .withUri("/v2/{project_id}/factory/release-packages/{package_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactoryPackageDetailRequest::getPackageId,
                ShowFactoryPackageDetailRequest::setPackageId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactoryPackageDetailRequest::getWorkspace,
                ShowFactoryPackageDetailRequest::setWorkspace));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowFactoryPackageDetailResponse::getXRequestId,
                ShowFactoryPackageDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse> showFactorySupplementData =
        genForShowFactorySupplementData();

    private static HttpRequestDef<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse> genForShowFactorySupplementData() {
        // basic
        HttpRequestDef.Builder<ShowFactorySupplementDataRequest, ShowFactorySupplementDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowFactorySupplementDataRequest.class,
                    ShowFactorySupplementDataResponse.class)
                .withName("ShowFactorySupplementData")
                .withUri("/v2/{project_id}/factory/supplement-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getSort,
                ShowFactorySupplementDataRequest::setSort));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getPage,
                ShowFactorySupplementDataRequest::setPage));
        builder.<String>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getSize,
                ShowFactorySupplementDataRequest::setSize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getName,
                ShowFactorySupplementDataRequest::setName));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getUserName,
                ShowFactorySupplementDataRequest::setUserName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getStatus,
                ShowFactorySupplementDataRequest::setStatus));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getStartDate,
                ShowFactorySupplementDataRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getEndDate,
                ShowFactorySupplementDataRequest::setEndDate));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorySupplementDataRequest::getWorkspace,
                ShowFactorySupplementDataRequest::setWorkspace));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowFactorySupplementDataResponse::getXRequestId,
                ShowFactorySupplementDataResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowGlossaryListRequest, ShowGlossaryListResponse> showGlossaryList =
        genForShowGlossaryList();

    private static HttpRequestDef<ShowGlossaryListRequest, ShowGlossaryListResponse> genForShowGlossaryList() {
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
            f -> f.withMarshaller(ShowGlossaryListRequest::getType, ShowGlossaryListRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getName, ShowGlossaryListRequest::setName));
        builder.<String>withRequestField("create_user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getCreateUser, ShowGlossaryListRequest::setCreateUser));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getStart, ShowGlossaryListRequest::setStart));
        builder.<String>withRequestField("end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getEnd, ShowGlossaryListRequest::setEnd));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getLimit, ShowGlossaryListRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getOffset, ShowGlossaryListRequest::setOffset));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getSortBy, ShowGlossaryListRequest::setSortBy));
        builder.<String>withRequestField("sort_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getSortOrder, ShowGlossaryListRequest::setSortOrder));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGlossaryListRequest::getWorkspace, ShowGlossaryListRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceInfosRequest, ShowInstanceInfosResponse> showInstanceInfos =
        genForShowInstanceInfos();

    private static HttpRequestDef<ShowInstanceInfosRequest, ShowInstanceInfosResponse> genForShowInstanceInfos() {
        // basic
        HttpRequestDef.Builder<ShowInstanceInfosRequest, ShowInstanceInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceInfosRequest.class, ShowInstanceInfosResponse.class)
                .withName("ShowInstanceInfos")
                .withUri("/v1/{project_id}/datamap/node/{task_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceInfosRequest::getTaskId, ShowInstanceInfosRequest::setTaskId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceInfosRequest::getWorkspaceId, ShowInstanceInfosRequest::setWorkspaceId));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceInfosRequest::getJobName, ShowInstanceInfosRequest::setJobName));
        builder.<BigDecimal>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ShowInstanceInfosRequest::getStartTime, ShowInstanceInfosRequest::setStartTime));
        builder.<BigDecimal>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ShowInstanceInfosRequest::getEndTime, ShowInstanceInfosRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceInfosRequest::getOffset, ShowInstanceInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceInfosRequest::getLimit, ShowInstanceInfosRequest::setLimit));
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceInfosRequest::getInstance, ShowInstanceInfosRequest::setInstance));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceLogRequest, ShowInstanceLogResponse> showInstanceLog =
        genForShowInstanceLog();

    private static HttpRequestDef<ShowInstanceLogRequest, ShowInstanceLogResponse> genForShowInstanceLog() {
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
            f -> f.withMarshaller(ShowInstanceLogRequest::getTaskId, ShowInstanceLogRequest::setTaskId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceLogRequest::getInstanceId, ShowInstanceLogRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceLogRequest::getWorkspace, ShowInstanceLogRequest::setWorkspace));
        builder.<JobLogRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobLogRequest.class),
            f -> f.withMarshaller(ShowInstanceLogRequest::getBody, ShowInstanceLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceResultRequest, ShowInstanceResultResponse> showInstanceResult =
        genForShowInstanceResult();

    private static HttpRequestDef<ShowInstanceResultRequest, ShowInstanceResultResponse> genForShowInstanceResult() {
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
            f -> f.withMarshaller(ShowInstanceResultRequest::getInstanceId, ShowInstanceResultRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceResultRequest::getWorkspace, ShowInstanceResultRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLineageRequest, ShowLineageResponse> showLineage = genForShowLineage();

    private static HttpRequestDef<ShowLineageRequest, ShowLineageResponse> genForShowLineage() {
        // basic
        HttpRequestDef.Builder<ShowLineageRequest, ShowLineageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLineageRequest.class, ShowLineageResponse.class)
                .withName("ShowLineage")
                .withUri("/v3/{project_id}/entities/{guid}/lineage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLineageRequest::getGuid, ShowLineageRequest::setGuid));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLineageRequest::getDirection, ShowLineageRequest::setDirection));
        builder.<Integer>withRequestField("depth",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLineageRequest::getDepth, ShowLineageRequest::setDepth));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLineageRequest::getWorkspace, ShowLineageRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLineageBulkRequest, ShowLineageBulkResponse> showLineageBulk =
        genForShowLineageBulk();

    private static HttpRequestDef<ShowLineageBulkRequest, ShowLineageBulkResponse> genForShowLineageBulk() {
        // basic
        HttpRequestDef.Builder<ShowLineageBulkRequest, ShowLineageBulkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLineageBulkRequest.class, ShowLineageBulkResponse.class)
                .withName("ShowLineageBulk")
                .withUri("/v1/{project_id}/datamap/lineage/bulk")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLineageBulkRequest::getOffset, ShowLineageBulkRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLineageBulkRequest::getLimit, ShowLineageBulkRequest::setLimit));
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLineageBulkRequest::getInstance, ShowLineageBulkRequest::setInstance));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessageDetailRequest, ShowMessageDetailResponse> showMessageDetail =
        genForShowMessageDetail();

    private static HttpRequestDef<ShowMessageDetailRequest, ShowMessageDetailResponse> genForShowMessageDetail() {
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
            f -> f.withMarshaller(ShowMessageDetailRequest::getMessageId, ShowMessageDetailRequest::setMessageId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessageDetailRequest::getWorkspace, ShowMessageDetailRequest::setWorkspace));
        builder.<ShowMessageDetailRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMessageDetailRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowMessageDetailRequest::getDlmType, ShowMessageDetailRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricAssetsRequest, ShowMetricAssetsResponse> showMetricAssets =
        genForShowMetricAssets();

    private static HttpRequestDef<ShowMetricAssetsRequest, ShowMetricAssetsResponse> genForShowMetricAssets() {
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
            f -> f.withMarshaller(ShowMetricAssetsRequest::getWorkspace, ShowMetricAssetsRequest::setWorkspace));
        builder.<MetricOpenSearchParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricOpenSearchParams.class),
            f -> f.withMarshaller(ShowMetricAssetsRequest::getBody, ShowMetricAssetsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricTreeRequest, ShowMetricTreeResponse> showMetricTree =
        genForShowMetricTree();

    private static HttpRequestDef<ShowMetricTreeRequest, ShowMetricTreeResponse> genForShowMetricTree() {
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
            f -> f.withMarshaller(ShowMetricTreeRequest::getWorkspace, ShowMetricTreeRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodesRequest, ShowNodesResponse> showNodes = genForShowNodes();

    private static HttpRequestDef<ShowNodesRequest, ShowNodesResponse> genForShowNodes() {
        // basic
        HttpRequestDef.Builder<ShowNodesRequest, ShowNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodesRequest.class, ShowNodesResponse.class)
                .withName("ShowNodes")
                .withUri("/v1/{project_id}/datamap/table/{guid}/node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("guid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getGuid, ShowNodesRequest::setGuid));
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getInstance, ShowNodesRequest::setInstance));

        // response
        builder.<List<JobAndNodeInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowNodesResponse::getBody, ShowNodesResponse::setBody)
                .withInnerContainerType(JobAndNodeInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPathByIdRequest, ShowPathByIdResponse> showPathById = genForShowPathById();

    private static HttpRequestDef<ShowPathByIdRequest, ShowPathByIdResponse> genForShowPathById() {
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
            f -> f.withMarshaller(ShowPathByIdRequest::getCatalogId, ShowPathByIdRequest::setCatalogId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPathByIdRequest::getLimit, ShowPathByIdRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPathByIdRequest::getOffset, ShowPathByIdRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPathByIdRequest::getWorkspace, ShowPathByIdRequest::setWorkspace));
        builder.<ShowPathByIdRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPathByIdRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowPathByIdRequest::getDlmType, ShowPathByIdRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse> showPathObjectById =
        genForShowPathObjectById();

    private static HttpRequestDef<ShowPathObjectByIdRequest, ShowPathObjectByIdResponse> genForShowPathObjectById() {
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
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getCatalogId, ShowPathObjectByIdRequest::setCatalogId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getLimit, ShowPathObjectByIdRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getOffset, ShowPathObjectByIdRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getWorkspace, ShowPathObjectByIdRequest::setWorkspace));
        builder.<ShowPathObjectByIdRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPathObjectByIdRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowPathObjectByIdRequest::getDlmType, ShowPathObjectByIdRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse> showQualityTaskDetail =
        genForShowQualityTaskDetail();

    private static HttpRequestDef<ShowQualityTaskDetailRequest, ShowQualityTaskDetailResponse> genForShowQualityTaskDetail() {
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
            f -> f.withMarshaller(ShowQualityTaskDetailRequest::getId, ShowQualityTaskDetailRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQualityTaskDetailRequest::getWorkspace,
                ShowQualityTaskDetailRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRelationByIdRequest, ShowRelationByIdResponse> showRelationById =
        genForShowRelationById();

    private static HttpRequestDef<ShowRelationByIdRequest, ShowRelationByIdResponse> genForShowRelationById() {
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
            f -> f.withMarshaller(ShowRelationByIdRequest::getId, ShowRelationByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRelationByIdRequest::getLatest, ShowRelationByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRelationByIdRequest::getWorkspace, ShowRelationByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityDataClassificationRuleRequest, ShowSecurityDataClassificationRuleResponse> showSecurityDataClassificationRule =
        genForShowSecurityDataClassificationRule();

    private static HttpRequestDef<ShowSecurityDataClassificationRuleRequest, ShowSecurityDataClassificationRuleResponse> genForShowSecurityDataClassificationRule() {
        // basic
        HttpRequestDef.Builder<ShowSecurityDataClassificationRuleRequest, ShowSecurityDataClassificationRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSecurityDataClassificationRuleRequest.class,
                    ShowSecurityDataClassificationRuleResponse.class)
                .withName("ShowSecurityDataClassificationRule")
                .withUri("/v1/{project_id}/security/data-classification/rule/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityDataClassificationRuleRequest::getId,
                ShowSecurityDataClassificationRuleRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityDataClassificationRuleRequest::getWorkspace,
                ShowSecurityDataClassificationRuleRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityDataClassificationRuleGroupRequest, ShowSecurityDataClassificationRuleGroupResponse> showSecurityDataClassificationRuleGroup =
        genForShowSecurityDataClassificationRuleGroup();

    private static HttpRequestDef<ShowSecurityDataClassificationRuleGroupRequest, ShowSecurityDataClassificationRuleGroupResponse> genForShowSecurityDataClassificationRuleGroup() {
        // basic
        HttpRequestDef.Builder<ShowSecurityDataClassificationRuleGroupRequest, ShowSecurityDataClassificationRuleGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSecurityDataClassificationRuleGroupRequest.class,
                    ShowSecurityDataClassificationRuleGroupResponse.class)
                .withName("ShowSecurityDataClassificationRuleGroup")
                .withUri("/v1/{project_id}/security/data-classification/rule/group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityDataClassificationRuleGroupRequest::getId,
                ShowSecurityDataClassificationRuleGroupRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityDataClassificationRuleGroupRequest::getWorkspace,
                ShowSecurityDataClassificationRuleGroupRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityPermissionSetRequest, ShowSecurityPermissionSetResponse> showSecurityPermissionSet =
        genForShowSecurityPermissionSet();

    private static HttpRequestDef<ShowSecurityPermissionSetRequest, ShowSecurityPermissionSetResponse> genForShowSecurityPermissionSet() {
        // basic
        HttpRequestDef.Builder<ShowSecurityPermissionSetRequest, ShowSecurityPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSecurityPermissionSetRequest.class,
                    ShowSecurityPermissionSetResponse.class)
                .withName("ShowSecurityPermissionSet")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityPermissionSetRequest::getPermissionSetId,
                ShowSecurityPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityPermissionSetRequest::getWorkspace,
                ShowSecurityPermissionSetRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecuritySecrecyLevelRequest, ShowSecuritySecrecyLevelResponse> showSecuritySecrecyLevel =
        genForShowSecuritySecrecyLevel();

    private static HttpRequestDef<ShowSecuritySecrecyLevelRequest, ShowSecuritySecrecyLevelResponse> genForShowSecuritySecrecyLevel() {
        // basic
        HttpRequestDef.Builder<ShowSecuritySecrecyLevelRequest, ShowSecuritySecrecyLevelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowSecuritySecrecyLevelRequest.class, ShowSecuritySecrecyLevelResponse.class)
                .withName("ShowSecuritySecrecyLevel")
                .withUri("/v1/{project_id}/security/data-classification/secrecy-level/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecuritySecrecyLevelRequest::getId, ShowSecuritySecrecyLevelRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecuritySecrecyLevelRequest::getWorkspace,
                ShowSecuritySecrecyLevelRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStandardByIdRequest, ShowStandardByIdResponse> showStandardById =
        genForShowStandardById();

    private static HttpRequestDef<ShowStandardByIdRequest, ShowStandardByIdResponse> genForShowStandardById() {
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
            f -> f.withMarshaller(ShowStandardByIdRequest::getId, ShowStandardByIdRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStandardByIdRequest::getWorkspace, ShowStandardByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStandardTemplateRequest, ShowStandardTemplateResponse> showStandardTemplate =
        genForShowStandardTemplate();

    private static HttpRequestDef<ShowStandardTemplateRequest, ShowStandardTemplateResponse> genForShowStandardTemplate() {
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
            f -> f.withMarshaller(ShowStandardTemplateRequest::getLimit, ShowStandardTemplateRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStandardTemplateRequest::getOffset, ShowStandardTemplateRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStandardTemplateRequest::getWorkspace,
                ShowStandardTemplateRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableModelByIdRequest, ShowTableModelByIdResponse> showTableModelById =
        genForShowTableModelById();

    private static HttpRequestDef<ShowTableModelByIdRequest, ShowTableModelByIdResponse> genForShowTableModelById() {
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
            f -> f.withMarshaller(ShowTableModelByIdRequest::getId, ShowTableModelByIdRequest::setId));
        builder.<Boolean>withRequestField("latest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTableModelByIdRequest::getLatest, ShowTableModelByIdRequest::setLatest));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableModelByIdRequest::getWorkspace, ShowTableModelByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagsRequest, ShowTagsResponse> showTags = genForShowTags();

    private static HttpRequestDef<ShowTagsRequest, ShowTagsResponse> genForShowTags() {
        // basic
        HttpRequestDef.Builder<ShowTagsRequest, ShowTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowTagsRequest.class, ShowTagsResponse.class)
                .withName("ShowTags")
                .withUri("/v3/{project_id}/datamap/tags/search")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagsRequest::getInstance, ShowTagsRequest::setInstance));
        builder.<TagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagRequest.class),
            f -> f.withMarshaller(ShowTagsRequest::getBody, ShowTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInfoRequest, ShowTaskInfoResponse> showTaskInfo = genForShowTaskInfo();

    private static HttpRequestDef<ShowTaskInfoRequest, ShowTaskInfoResponse> genForShowTaskInfo() {
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
            f -> f.withMarshaller(ShowTaskInfoRequest::getTaskId, ShowTaskInfoRequest::setTaskId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInfoRequest::getWorkspace, ShowTaskInfoRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskListRequest, ShowTaskListResponse> showTaskList = genForShowTaskList();

    private static HttpRequestDef<ShowTaskListRequest, ShowTaskListResponse> genForShowTaskList() {
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
            f -> f.withMarshaller(ShowTaskListRequest::getWorkspace, ShowTaskListRequest::setWorkspace));
        builder.<QueryTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTaskRequest.class),
            f -> f.withMarshaller(ShowTaskListRequest::getBody, ShowTaskListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse> showTechnicalAssetsStatistic =
        genForShowTechnicalAssetsStatistic();

    private static HttpRequestDef<ShowTechnicalAssetsStatisticRequest, ShowTechnicalAssetsStatisticResponse> genForShowTechnicalAssetsStatistic() {
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
            f -> f.withMarshaller(ShowTechnicalAssetsStatisticRequest::getTag,
                ShowTechnicalAssetsStatisticRequest::setTag));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTechnicalAssetsStatisticRequest::getOffset,
                ShowTechnicalAssetsStatisticRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTechnicalAssetsStatisticRequest::getLimit,
                ShowTechnicalAssetsStatisticRequest::setLimit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTechnicalAssetsStatisticRequest::getWorkspace,
                ShowTechnicalAssetsStatisticRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse> showTemplatesDetail =
        genForShowTemplatesDetail();

    private static HttpRequestDef<ShowTemplatesDetailRequest, ShowTemplatesDetailResponse> genForShowTemplatesDetail() {
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
            f -> f.withMarshaller(ShowTemplatesDetailRequest::getId, ShowTemplatesDetailRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplatesDetailRequest::getWorkspace, ShowTemplatesDetailRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse> showUnrelatedTable =
        genForShowUnrelatedTable();

    private static HttpRequestDef<ShowUnrelatedTableRequest, ShowUnrelatedTableResponse> genForShowUnrelatedTable() {
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
            f -> f.withMarshaller(ShowUnrelatedTableRequest::getWorkspace, ShowUnrelatedTableRequest::setWorkspace));
        builder.<SearchParametersExt>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchParametersExt.class),
            f -> f.withMarshaller(ShowUnrelatedTableRequest::getBody, ShowUnrelatedTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpace =
        genForShowWorkSpace();

    private static HttpRequestDef<ShowWorkSpaceRequest, ShowWorkSpaceResponse> genForShowWorkSpace() {
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
            f -> f.withMarshaller(ShowWorkSpaceRequest::getInstanceId, ShowWorkSpaceRequest::setInstanceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkSpaceRequest::getWorkspaceId, ShowWorkSpaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse> showWorkspaceDetailById =
        genForShowWorkspaceDetailById();

    private static HttpRequestDef<ShowWorkspaceDetailByIdRequest, ShowWorkspaceDetailByIdResponse> genForShowWorkspaceDetailById() {
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
            f -> f.withMarshaller(ShowWorkspaceDetailByIdRequest::getModelId,
                ShowWorkspaceDetailByIdRequest::setModelId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkspaceDetailByIdRequest::getWorkspace,
                ShowWorkspaceDetailByIdRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse> stopFactorySupplementDataInstance =
        genForStopFactorySupplementDataInstance();

    private static HttpRequestDef<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse> genForStopFactorySupplementDataInstance() {
        // basic
        HttpRequestDef.Builder<StopFactorySupplementDataInstanceRequest, StopFactorySupplementDataInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StopFactorySupplementDataInstanceRequest.class,
                    StopFactorySupplementDataInstanceResponse.class)
                .withName("StopFactorySupplementDataInstance")
                .withUri("/v2/{project_id}/factory/supplement-data/{instance_name}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopFactorySupplementDataInstanceRequest::getInstanceName,
                StopFactorySupplementDataInstanceRequest::setInstanceName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopFactorySupplementDataInstanceRequest::getWorkspace,
                StopFactorySupplementDataInstanceRequest::setWorkspace));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopFactorySupplementDataInstanceResponse::getXRequestId,
                StopFactorySupplementDataInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForUpdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForUpdateApp() {
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
            f -> f.withMarshaller(UpdateAppRequest::getAppId, UpdateAppRequest::setAppId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getWorkspace, UpdateAppRequest::setWorkspace));
        builder.<UpdateAppRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAppRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(UpdateAppRequest::getDlmType, UpdateAppRequest::setDlmType));
        builder.<AppUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AppUpdateDTO.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, UpdateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBizMetricRequest, UpdateBizMetricResponse> updateBizMetric =
        genForUpdateBizMetric();

    private static HttpRequestDef<UpdateBizMetricRequest, UpdateBizMetricResponse> genForUpdateBizMetric() {
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
            f -> f.withMarshaller(UpdateBizMetricRequest::getWorkspace, UpdateBizMetricRequest::setWorkspace));
        builder.<BizMetricVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizMetricVO.class),
            f -> f.withMarshaller(UpdateBizMetricRequest::getBody, UpdateBizMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalog =
        genForUpdateCatalog();

    private static HttpRequestDef<UpdateCatalogRequest, UpdateCatalogResponse> genForUpdateCatalog() {
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
            f -> f.withMarshaller(UpdateCatalogRequest::getCatalogId, UpdateCatalogRequest::setCatalogId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getWorkspace, UpdateCatalogRequest::setWorkspace));
        builder.<UpdateCatalogRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCatalogRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getDlmType, UpdateCatalogRequest::setDlmType));
        builder.<ApiCatalogUpdateParaDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCatalogUpdateParaDTO.class),
            f -> f.withMarshaller(UpdateCatalogRequest::getBody, UpdateCatalogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCodeTableRequest, UpdateCodeTableResponse> updateCodeTable =
        genForUpdateCodeTable();

    private static HttpRequestDef<UpdateCodeTableRequest, UpdateCodeTableResponse> genForUpdateCodeTable() {
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
            f -> f.withMarshaller(UpdateCodeTableRequest::getId, UpdateCodeTableRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCodeTableRequest::getWorkspace, UpdateCodeTableRequest::setWorkspace));
        builder.<CodeTableVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeTableVO.class),
            f -> f.withMarshaller(UpdateCodeTableRequest::getBody, UpdateCodeTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse> updateCodeTableValues =
        genForUpdateCodeTableValues();

    private static HttpRequestDef<UpdateCodeTableValuesRequest, UpdateCodeTableValuesResponse> genForUpdateCodeTableValues() {
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
            f -> f.withMarshaller(UpdateCodeTableValuesRequest::getId, UpdateCodeTableValuesRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCodeTableValuesRequest::getWorkspace,
                UpdateCodeTableValuesRequest::setWorkspace));
        builder.<CodeTableFieldValueUpdateVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeTableFieldValueUpdateVO.class),
            f -> f.withMarshaller(UpdateCodeTableValuesRequest::getBody, UpdateCodeTableValuesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataconnectionRequest, UpdateDataconnectionResponse> updateDataconnection =
        genForUpdateDataconnection();

    private static HttpRequestDef<UpdateDataconnectionRequest, UpdateDataconnectionResponse> genForUpdateDataconnection() {
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
            f -> f.withMarshaller(UpdateDataconnectionRequest::getDataConnectionId,
                UpdateDataconnectionRequest::setDataConnectionId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataconnectionRequest::getWorkspace,
                UpdateDataconnectionRequest::setWorkspace));
        builder.<ApigDataSourcesVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigDataSourcesVo.class),
            f -> f.withMarshaller(UpdateDataconnectionRequest::getBody, UpdateDataconnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectory =
        genForUpdateDirectory();

    private static HttpRequestDef<UpdateDirectoryRequest, UpdateDirectoryResponse> genForUpdateDirectory() {
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
            f -> f.withMarshaller(UpdateDirectoryRequest::getWorkspace, UpdateDirectoryRequest::setWorkspace));
        builder.<DirectoryVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DirectoryVO.class),
            f -> f.withMarshaller(UpdateDirectoryRequest::getBody, UpdateDirectoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse> updateFactoryJobName =
        genForUpdateFactoryJobName();

    private static HttpRequestDef<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse> genForUpdateFactoryJobName() {
        // basic
        HttpRequestDef.Builder<UpdateFactoryJobNameRequest, UpdateFactoryJobNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateFactoryJobNameRequest.class, UpdateFactoryJobNameResponse.class)
            .withName("UpdateFactoryJobName")
            .withUri("/v2/{project_id}/factory/jobs/{job_name}/rename")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFactoryJobNameRequest::getJobName, UpdateFactoryJobNameRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFactoryJobNameRequest::getWorkspace,
                UpdateFactoryJobNameRequest::setWorkspace));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFactoryJobNameRequest::getAuthorization,
                UpdateFactoryJobNameRequest::setAuthorization));
        builder.<String>withRequestField("Host",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFactoryJobNameRequest::getHost, UpdateFactoryJobNameRequest::setHost));
        builder.<UpdateFactoryJobNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFactoryJobNameRequestBody.class),
            f -> f.withMarshaller(UpdateFactoryJobNameRequest::getBody, UpdateFactoryJobNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityDataClassificationRuleRequest, UpdateSecurityDataClassificationRuleResponse> updateSecurityDataClassificationRule =
        genForUpdateSecurityDataClassificationRule();

    private static HttpRequestDef<UpdateSecurityDataClassificationRuleRequest, UpdateSecurityDataClassificationRuleResponse> genForUpdateSecurityDataClassificationRule() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityDataClassificationRuleRequest, UpdateSecurityDataClassificationRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSecurityDataClassificationRuleRequest.class,
                    UpdateSecurityDataClassificationRuleResponse.class)
                .withName("UpdateSecurityDataClassificationRule")
                .withUri("/v1/{project_id}/security/data-classification/rule/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityDataClassificationRuleRequest::getId,
                UpdateSecurityDataClassificationRuleRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityDataClassificationRuleRequest::getWorkspace,
                UpdateSecurityDataClassificationRuleRequest::setWorkspace));
        builder.<DataClassificationRuleOperateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataClassificationRuleOperateDTO.class),
            f -> f.withMarshaller(UpdateSecurityDataClassificationRuleRequest::getBody,
                UpdateSecurityDataClassificationRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityPermissionSetRequest, UpdateSecurityPermissionSetResponse> updateSecurityPermissionSet =
        genForUpdateSecurityPermissionSet();

    private static HttpRequestDef<UpdateSecurityPermissionSetRequest, UpdateSecurityPermissionSetResponse> genForUpdateSecurityPermissionSet() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityPermissionSetRequest, UpdateSecurityPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSecurityPermissionSetRequest.class,
                    UpdateSecurityPermissionSetResponse.class)
                .withName("UpdateSecurityPermissionSet")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityPermissionSetRequest::getPermissionSetId,
                UpdateSecurityPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityPermissionSetRequest::getWorkspace,
                UpdateSecurityPermissionSetRequest::setWorkspace));
        builder.<PermissionSetCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PermissionSetCreateDTO.class),
            f -> f.withMarshaller(UpdateSecurityPermissionSetRequest::getBody,
                UpdateSecurityPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityPermissionSetPermissionRequest, UpdateSecurityPermissionSetPermissionResponse> updateSecurityPermissionSetPermission =
        genForUpdateSecurityPermissionSetPermission();

    private static HttpRequestDef<UpdateSecurityPermissionSetPermissionRequest, UpdateSecurityPermissionSetPermissionResponse> genForUpdateSecurityPermissionSetPermission() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityPermissionSetPermissionRequest, UpdateSecurityPermissionSetPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSecurityPermissionSetPermissionRequest.class,
                    UpdateSecurityPermissionSetPermissionResponse.class)
                .withName("UpdateSecurityPermissionSetPermission")
                .withUri("/v1/{project_id}/security/permission-sets/{permission_set_id}/permissions/{permission_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityPermissionSetPermissionRequest::getPermissionSetId,
                UpdateSecurityPermissionSetPermissionRequest::setPermissionSetId));
        builder.<String>withRequestField("permission_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityPermissionSetPermissionRequest::getPermissionId,
                UpdateSecurityPermissionSetPermissionRequest::setPermissionId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityPermissionSetPermissionRequest::getWorkspace,
                UpdateSecurityPermissionSetPermissionRequest::setWorkspace));
        builder.<PermissionSetPermissionUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PermissionSetPermissionUpdateDTO.class),
            f -> f.withMarshaller(UpdateSecurityPermissionSetPermissionRequest::getBody,
                UpdateSecurityPermissionSetPermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityRuleEnableStatusRequest, UpdateSecurityRuleEnableStatusResponse> updateSecurityRuleEnableStatus =
        genForUpdateSecurityRuleEnableStatus();

    private static HttpRequestDef<UpdateSecurityRuleEnableStatusRequest, UpdateSecurityRuleEnableStatusResponse> genForUpdateSecurityRuleEnableStatus() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityRuleEnableStatusRequest, UpdateSecurityRuleEnableStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSecurityRuleEnableStatusRequest.class,
                    UpdateSecurityRuleEnableStatusResponse.class)
                .withName("UpdateSecurityRuleEnableStatus")
                .withUri("/v1/{project_id}/security/data-classification/rule/switch-status/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityRuleEnableStatusRequest::getId,
                UpdateSecurityRuleEnableStatusRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityRuleEnableStatusRequest::getWorkspace,
                UpdateSecurityRuleEnableStatusRequest::setWorkspace));
        builder.<DataClassificationRuleEnableDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataClassificationRuleEnableDTO.class),
            f -> f.withMarshaller(UpdateSecurityRuleEnableStatusRequest::getBody,
                UpdateSecurityRuleEnableStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecuritySecrecyLevelRequest, UpdateSecuritySecrecyLevelResponse> updateSecuritySecrecyLevel =
        genForUpdateSecuritySecrecyLevel();

    private static HttpRequestDef<UpdateSecuritySecrecyLevelRequest, UpdateSecuritySecrecyLevelResponse> genForUpdateSecuritySecrecyLevel() {
        // basic
        HttpRequestDef.Builder<UpdateSecuritySecrecyLevelRequest, UpdateSecuritySecrecyLevelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSecuritySecrecyLevelRequest.class,
                    UpdateSecuritySecrecyLevelResponse.class)
                .withName("UpdateSecuritySecrecyLevel")
                .withUri("/v1/{project_id}/security/data-classification/secrecy-level/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecuritySecrecyLevelRequest::getId, UpdateSecuritySecrecyLevelRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecuritySecrecyLevelRequest::getWorkspace,
                UpdateSecuritySecrecyLevelRequest::setWorkspace));
        builder.<UpdateSecrecyLevelDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecrecyLevelDTO.class),
            f -> f.withMarshaller(UpdateSecuritySecrecyLevelRequest::getBody,
                UpdateSecuritySecrecyLevelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStandardRequest, UpdateStandardResponse> updateStandard =
        genForUpdateStandard();

    private static HttpRequestDef<UpdateStandardRequest, UpdateStandardResponse> genForUpdateStandard() {
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
            f -> f.withMarshaller(UpdateStandardRequest::getId, UpdateStandardRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStandardRequest::getWorkspace, UpdateStandardRequest::setWorkspace));
        builder.<StandElementValueVOList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementValueVOList.class),
            f -> f.withMarshaller(UpdateStandardRequest::getBody, UpdateStandardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse> updateStandardTemplate =
        genForUpdateStandardTemplate();

    private static HttpRequestDef<UpdateStandardTemplateRequest, UpdateStandardTemplateResponse> genForUpdateStandardTemplate() {
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
            f -> f.withMarshaller(UpdateStandardTemplateRequest::getWorkspace,
                UpdateStandardTemplateRequest::setWorkspace));
        builder.<StandElementFieldVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StandElementFieldVO.class),
            f -> f.withMarshaller(UpdateStandardTemplateRequest::getBody, UpdateStandardTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubjectRequest, UpdateSubjectResponse> updateSubject =
        genForUpdateSubject();

    private static HttpRequestDef<UpdateSubjectRequest, UpdateSubjectResponse> genForUpdateSubject() {
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
            f -> f.withMarshaller(UpdateSubjectRequest::getWorkspace, UpdateSubjectRequest::setWorkspace));
        builder.<CatalogParamsVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CatalogParamsVO.class),
            f -> f.withMarshaller(UpdateSubjectRequest::getBody, UpdateSubjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubjectNewRequest, UpdateSubjectNewResponse> updateSubjectNew =
        genForUpdateSubjectNew();

    private static HttpRequestDef<UpdateSubjectNewRequest, UpdateSubjectNewResponse> genForUpdateSubjectNew() {
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
            f -> f.withMarshaller(UpdateSubjectNewRequest::getWorkspace, UpdateSubjectNewRequest::setWorkspace));
        builder.<SubjectParamsVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubjectParamsVO.class),
            f -> f.withMarshaller(UpdateSubjectNewRequest::getBody, UpdateSubjectNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTableModelRequest, UpdateTableModelResponse> updateTableModel =
        genForUpdateTableModel();

    private static HttpRequestDef<UpdateTableModelRequest, UpdateTableModelResponse> genForUpdateTableModel() {
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
            f -> f.withMarshaller(UpdateTableModelRequest::getWorkspace, UpdateTableModelRequest::setWorkspace));
        builder.<TableModelUpdateVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableModelUpdateVO.class),
            f -> f.withMarshaller(UpdateTableModelRequest::getBody, UpdateTableModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskInfoRequest, UpdateTaskInfoResponse> updateTaskInfo =
        genForUpdateTaskInfo();

    private static HttpRequestDef<UpdateTaskInfoRequest, UpdateTaskInfoResponse> genForUpdateTaskInfo() {
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
            f -> f.withMarshaller(UpdateTaskInfoRequest::getTaskId, UpdateTaskInfoRequest::setTaskId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskInfoRequest::getWorkspace, UpdateTaskInfoRequest::setWorkspace));
        builder.<MetadataCollectionTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetadataCollectionTask.class),
            f -> f.withMarshaller(UpdateTaskInfoRequest::getBody, UpdateTaskInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate =
        genForUpdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForUpdateTemplate() {
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
            f -> f.withMarshaller(UpdateTemplateRequest::getId, UpdateTemplateRequest::setId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getWorkspace, UpdateTemplateRequest::setWorkspace));
        builder.<TemplateRO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateRO.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, UpdateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse> updateWorkSpaceUserOrGroup =
        genForUpdateWorkSpaceUserOrGroup();

    private static HttpRequestDef<UpdateWorkSpaceUserOrGroupRequest, UpdateWorkSpaceUserOrGroupResponse> genForUpdateWorkSpaceUserOrGroup() {
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
            f -> f.withMarshaller(UpdateWorkSpaceUserOrGroupRequest::getWorkspaceId,
                UpdateWorkSpaceUserOrGroupRequest::setWorkspaceId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkSpaceUserOrGroupRequest::getUserId,
                UpdateWorkSpaceUserOrGroupRequest::setUserId));
        builder.<ApigWorkspaceUserDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApigWorkspaceUserDto.class),
            f -> f.withMarshaller(UpdateWorkSpaceUserOrGroupRequest::getBody,
                UpdateWorkSpaceUserOrGroupRequest::setBody));

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
                .withUri("/v2/{project_id}/design/workspaces")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getWorkspace, UpdateWorkspaceRequest::setWorkspace));
        builder.<WorkspaceVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkspaceVO.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, UpdateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse> authorizeActionApiToInstance =
        genForAuthorizeActionApiToInstance();

    private static HttpRequestDef<AuthorizeActionApiToInstanceRequest, AuthorizeActionApiToInstanceResponse> genForAuthorizeActionApiToInstance() {
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
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizeActionApiToInstanceRequest::getWorkspace,
                AuthorizeActionApiToInstanceRequest::setWorkspace));
        builder.<AuthorizeActionApiToInstanceRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AuthorizeActionApiToInstanceRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(AuthorizeActionApiToInstanceRequest::getDlmType,
                AuthorizeActionApiToInstanceRequest::setDlmType));
        builder.<ApiParaForAuthToInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiParaForAuthToInstance.class),
            f -> f.withMarshaller(AuthorizeActionApiToInstanceRequest::getBody,
                AuthorizeActionApiToInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse> authorizeApiToInstance =
        genForAuthorizeApiToInstance();

    private static HttpRequestDef<AuthorizeApiToInstanceRequest, AuthorizeApiToInstanceResponse> genForAuthorizeApiToInstance() {
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
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getApiId, AuthorizeApiToInstanceRequest::setApiId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getInstanceId,
                AuthorizeApiToInstanceRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getWorkspace,
                AuthorizeApiToInstanceRequest::setWorkspace));
        builder.<AuthorizeApiToInstanceRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AuthorizeApiToInstanceRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getDlmType,
                AuthorizeApiToInstanceRequest::setDlmType));
        builder.<ApiParaForAuthorizeToInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiParaForAuthorizeToInstance.class),
            f -> f.withMarshaller(AuthorizeApiToInstanceRequest::getBody, AuthorizeApiToInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiRequest, CreateApiResponse> createApi = genForCreateApi();

    private static HttpRequestDef<CreateApiRequest, CreateApiResponse> genForCreateApi() {
        // basic
        HttpRequestDef.Builder<CreateApiRequest, CreateApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiRequest.class, CreateApiResponse.class)
                .withName("CreateApi")
                .withUri("/v1/{project_id}/service/apis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiRequest::getWorkspace, CreateApiRequest::setWorkspace));
        builder.<CreateApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(CreateApiRequest::getDlmType, CreateApiRequest::setDlmType));
        builder.<Api>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Api.class),
            f -> f.withMarshaller(CreateApiRequest::getBody, CreateApiRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugApiRequest, DebugApiResponse> debugApi = genForDebugApi();

    private static HttpRequestDef<DebugApiRequest, DebugApiResponse> genForDebugApi() {
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
            f -> f.withMarshaller(DebugApiRequest::getApiId, DebugApiRequest::setApiId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiRequest::getInstanceId, DebugApiRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiRequest::getWorkspace, DebugApiRequest::setWorkspace));
        builder.<DebugApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DebugApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(DebugApiRequest::getDlmType, DebugApiRequest::setDlmType));
        builder.<ApiTestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiTestDTO.class),
            f -> f.withMarshaller(DebugApiRequest::getBody, DebugApiRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiRequest, DeleteApiResponse> deleteApi = genForDeleteApi();

    private static HttpRequestDef<DeleteApiRequest, DeleteApiResponse> genForDeleteApi() {
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
            f -> f.withMarshaller(DeleteApiRequest::getWorkspace, DeleteApiRequest::setWorkspace));
        builder.<DeleteApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(DeleteApiRequest::getDlmType, DeleteApiRequest::setDlmType));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteApiRequest::getBody, DeleteApiRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse> executeApiToInstance =
        genForExecuteApiToInstance();

    private static HttpRequestDef<ExecuteApiToInstanceRequest, ExecuteApiToInstanceResponse> genForExecuteApiToInstance() {
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
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getApiId, ExecuteApiToInstanceRequest::setApiId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getInstanceId,
                ExecuteApiToInstanceRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getWorkspace,
                ExecuteApiToInstanceRequest::setWorkspace));
        builder.<ExecuteApiToInstanceRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteApiToInstanceRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getDlmType, ExecuteApiToInstanceRequest::setDlmType));
        builder.<ApiActionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiActionDTO.class),
            f -> f.withMarshaller(ExecuteApiToInstanceRequest::getBody, ExecuteApiToInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisRequest, ListApisResponse> listApis = genForListApis();

    private static HttpRequestDef<ListApisRequest, ListApisResponse> genForListApis() {
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
            f -> f.withMarshaller(ListApisRequest::getOffset, ListApisRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisRequest::getLimit, ListApisRequest::setLimit));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisRequest::getWorkspace, ListApisRequest::setWorkspace));
        builder.<ListApisRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApisRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListApisRequest::getDlmType, ListApisRequest::setDlmType));
        builder.<String>withRequestField("x-return-publish-messages",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisRequest::getXReturnPublishMessages,
                ListApisRequest::setXReturnPublishMessages));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceListRequest, ListInstanceListResponse> listInstanceList =
        genForListInstanceList();

    private static HttpRequestDef<ListInstanceListRequest, ListInstanceListResponse> genForListInstanceList() {
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
            f -> f.withMarshaller(ListInstanceListRequest::getApiId, ListInstanceListRequest::setApiId));
        builder.<ListInstanceListRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceListRequest.ActionEnum.class),
            f -> f.withMarshaller(ListInstanceListRequest::getAction, ListInstanceListRequest::setAction));
        builder.<Boolean>withRequestField("show_all",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstanceListRequest::getShowAll, ListInstanceListRequest::setShowAll));
        builder.<Boolean>withRequestField("check_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstanceListRequest::getCheckStatus, ListInstanceListRequest::setCheckStatus));
        builder.<Boolean>withRequestField("check_debug",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstanceListRequest::getCheckDebug, ListInstanceListRequest::setCheckDebug));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceListRequest::getAppId, ListInstanceListRequest::setAppId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceListRequest::getLimit, ListInstanceListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceListRequest::getOffset, ListInstanceListRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceListRequest::getWorkspace, ListInstanceListRequest::setWorkspace));
        builder.<ListInstanceListRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceListRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ListInstanceListRequest::getDlmType, ListInstanceListRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishApiRequest, PublishApiResponse> publishApi = genForPublishApi();

    private static HttpRequestDef<PublishApiRequest, PublishApiResponse> genForPublishApi() {
        // basic
        HttpRequestDef.Builder<PublishApiRequest, PublishApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishApiRequest.class, PublishApiResponse.class)
                .withName("PublishApi")
                .withUri("/v1/{project_id}/service/apis/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApiRequest::getWorkspace, PublishApiRequest::setWorkspace));
        builder.<PublishApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(PublishApiRequest::getDlmType, PublishApiRequest::setDlmType));
        builder.<OpenApiParaForPublish>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenApiParaForPublish.class),
            f -> f.withMarshaller(PublishApiRequest::getBody, PublishApiRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishApiToInstanceRequest, PublishApiToInstanceResponse> publishApiToInstance =
        genForPublishApiToInstance();

    private static HttpRequestDef<PublishApiToInstanceRequest, PublishApiToInstanceResponse> genForPublishApiToInstance() {
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
            f -> f.withMarshaller(PublishApiToInstanceRequest::getApiId, PublishApiToInstanceRequest::setApiId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getInstanceId,
                PublishApiToInstanceRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getWorkspace,
                PublishApiToInstanceRequest::setWorkspace));
        builder.<PublishApiToInstanceRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishApiToInstanceRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getDlmType, PublishApiToInstanceRequest::setDlmType));
        builder.<GatewayDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GatewayDTO.class),
            f -> f.withMarshaller(PublishApiToInstanceRequest::getBody, PublishApiToInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDebugInfoRequest, SearchDebugInfoResponse> searchDebugInfo =
        genForSearchDebugInfo();

    private static HttpRequestDef<SearchDebugInfoRequest, SearchDebugInfoResponse> genForSearchDebugInfo() {
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
            f -> f.withMarshaller(SearchDebugInfoRequest::getApiId, SearchDebugInfoRequest::setApiId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getLimit, SearchDebugInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getOffset, SearchDebugInfoRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getWorkspace, SearchDebugInfoRequest::setWorkspace));
        builder.<SearchDebugInfoRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchDebugInfoRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(SearchDebugInfoRequest::getDlmType, SearchDebugInfoRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchPublishInfoRequest, SearchPublishInfoResponse> searchPublishInfo =
        genForSearchPublishInfo();

    private static HttpRequestDef<SearchPublishInfoRequest, SearchPublishInfoResponse> genForSearchPublishInfo() {
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
            f -> f.withMarshaller(SearchPublishInfoRequest::getApiId, SearchPublishInfoRequest::setApiId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getLimit, SearchPublishInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getOffset, SearchPublishInfoRequest::setOffset));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getWorkspace, SearchPublishInfoRequest::setWorkspace));
        builder.<SearchPublishInfoRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchPublishInfoRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(SearchPublishInfoRequest::getDlmType, SearchPublishInfoRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiRequest, ShowApiResponse> showApi = genForShowApi();

    private static HttpRequestDef<ShowApiRequest, ShowApiResponse> genForShowApi() {
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
            f -> f.withMarshaller(ShowApiRequest::getApiId, ShowApiRequest::setApiId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiRequest::getWorkspace, ShowApiRequest::setWorkspace));
        builder.<ShowApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(ShowApiRequest::getDlmType, ShowApiRequest::setDlmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiRequest, UpdateApiResponse> updateApi = genForUpdateApi();

    private static HttpRequestDef<UpdateApiRequest, UpdateApiResponse> genForUpdateApi() {
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
            f -> f.withMarshaller(UpdateApiRequest::getApiId, UpdateApiRequest::setApiId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiRequest::getWorkspace, UpdateApiRequest::setWorkspace));
        builder.<UpdateApiRequest.DlmTypeEnum>withRequestField("Dlm-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateApiRequest.DlmTypeEnum.class),
            f -> f.withMarshaller(UpdateApiRequest::getDlmType, UpdateApiRequest::setDlmType));
        builder.<Api>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Api.class),
            f -> f.withMarshaller(UpdateApiRequest::getBody, UpdateApiRequest::setBody));

        // response

        return builder.build();
    }

}
