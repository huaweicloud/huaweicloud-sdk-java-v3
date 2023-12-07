package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dli.v1.model.AssociateConnectionQueueReq;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolRequestBody;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.AuthorizeResourceRequestBody;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteSqlJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteSqlJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchJobInfo;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.CancelSparkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CancelSparkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CancelSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CancelSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.ChangeAuthorizationRequest;
import com.huaweicloud.sdk.dli.v1.model.ChangeAuthorizationResponse;
import com.huaweicloud.sdk.dli.v1.model.ChangeFlinkJobStatusReportRequest;
import com.huaweicloud.sdk.dli.v1.model.ChangeFlinkJobStatusReportResponse;
import com.huaweicloud.sdk.dli.v1.model.ChangeQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.ChangeQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.CheckSqlRequest;
import com.huaweicloud.sdk.dli.v1.model.CheckSqlRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CheckSqlResponse;
import com.huaweicloud.sdk.dli.v1.model.CommonResp;
import com.huaweicloud.sdk.dli.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoReq;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateConnectivityTaskRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateConnectivityTaskResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDatabaseRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDatasourceConnectionReq;
import com.huaweicloud.sdk.dli.v1.model.CreateDatasourceConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDatasourceConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDliAgencyRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDliAgencyResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateElasticResourcePoolRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRoutesRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRoutesResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionsReq;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobGraphRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobGraphResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkTemplateRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalValueReq;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalVariableRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalVariableResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelReq;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateJobAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateJobAuthInfoRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateJobAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateJobTemplatesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueReq;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateRouteRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlTemplatesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateTableReq;
import com.huaweicloud.sdk.dli.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteDatasourceConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteDatasourceConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteEnhancedConnectionRoutesRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteEnhancedConnectionRoutesResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteFlinkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteFlinkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteFlinkSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteFlinkSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteGlobalVariableRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteGlobalVariableResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteJobAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteJobAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePropertiesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteSqlTemplatesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteTableResponse;
import com.huaweicloud.sdk.dli.v1.model.DisassociateConnectionQueueReq;
import com.huaweicloud.sdk.dli.v1.model.DisassociateQueueFromEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.DisassociateQueueFromEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlResultRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ExportTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportTableRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ExportTableResponse;
import com.huaweicloud.sdk.dli.v1.model.GenStreamGraphReq;
import com.huaweicloud.sdk.dli.v1.model.GrantDataPermissionReq;
import com.huaweicloud.sdk.dli.v1.model.GrantQueuePermissionReq;
import com.huaweicloud.sdk.dli.v1.model.IefFlinkJobMessagesReq;
import com.huaweicloud.sdk.dli.v1.model.IefFlinkJobStatusReportReq;
import com.huaweicloud.sdk.dli.v1.model.IefSystemEventsReq;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ImportTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportTableRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ImportTableResponse;
import com.huaweicloud.sdk.dli.v1.model.InsertQueuePropertyRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ListAllTablesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListAllTablesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.ListAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.ListAuthorizationPrivilegesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListAuthorizationPrivilegesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListDatabaseUsersRequest;
import com.huaweicloud.sdk.dli.v1.model.ListDatabaseUsersResponse;
import com.huaweicloud.sdk.dli.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListDatasourceConnectionsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListDatasourceConnectionsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListElasticResourcePoolQueuesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListElasticResourcePoolQueuesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListElasticResourcePoolScaleRecordsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListElasticResourcePoolScaleRecordsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListElasticResourcePoolsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListElasticResourcePoolsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListEnhancedConnectionsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListEnhancedConnectionsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListFlinkSqlJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListFlinkSqlJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListGlobalVariablesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListGlobalVariablesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListJobAuthInfosRequest;
import com.huaweicloud.sdk.dli.v1.model.ListJobAuthInfosResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePlansRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePlansResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePropertiesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePropertiesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueueUsersRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueueUsersResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueuesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueuesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSparkJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSparkJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSparkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSparkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListTablePrivilegesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListTablePrivilegesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListTableUsersRequest;
import com.huaweicloud.sdk.dli.v1.model.ListTableUsersResponse;
import com.huaweicloud.sdk.dli.v1.model.ObsBuckets;
import com.huaweicloud.sdk.dli.v1.model.PreviewSqlJobResultRequest;
import com.huaweicloud.sdk.dli.v1.model.PreviewSqlJobResultResponse;
import com.huaweicloud.sdk.dli.v1.model.QueuePlanIds;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketRequest;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketResponse;
import com.huaweicloud.sdk.dli.v1.model.RunAuthorizationActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunAuthorizationActionResponse;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackRequest;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackResponse;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionReq;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionResponse;
import com.huaweicloud.sdk.dli.v1.model.SetQueuePlanReq;
import com.huaweicloud.sdk.dli.v1.model.ShowBatchLogRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowBatchLogResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowConnectivityTaskRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowConnectivityTaskResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowDatasourceConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowDatasourceConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowDescribeTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowDescribeTableResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowDliAgencyRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowDliAgencyResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowEnhancedConnectionPrivilegeRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowEnhancedConnectionPrivilegeResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkJobExecutionGraphRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkJobExecutionGraphResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkMetricRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkMetricResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowJobMonitorInfoReq;
import com.huaweicloud.sdk.dli.v1.model.ShowPartitionsRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowPartitionsResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowResourceInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowResourceInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSparkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSparkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSparkJobStatusRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSparkJobStatusResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSparkJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSparkJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobDetailRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobDetailResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobProgressRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobProgressResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobStatusRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobStatusResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlSampleTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlSampleTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowTableContentRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowTableContentResponse;
import com.huaweicloud.sdk.dli.v1.model.StopFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.StopFlinkJobsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.StopFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateDatabaseOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateDatabaseOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueScalingPolicyInfo;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarJobRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarJobResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkTemplateRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalValueReq;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalVariableRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalVariableResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateGroupOrResourceOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateGroupOrResourceOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateHostMassageReq;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobAuthInfoRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobTemplatesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateOwnerRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrReq;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePropertyRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateResourceOwner;
import com.huaweicloud.sdk.dli.v1.model.UpdateSparkJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateSparkJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlTemplatesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateTableOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateTableOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadFilesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadFilesResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadGroupPackageReq;
import com.huaweicloud.sdk.dli.v1.model.UploadJarsRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadJarsResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadPackageGroupReq;
import com.huaweicloud.sdk.dli.v1.model.UploadPythonFilesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadPythonFilesResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadResourcesResponse;
import com.huaweicloud.sdk.dli.v1.model.VerityConnectivityReq;

import java.util.List;

@SuppressWarnings("unchecked")
public class DliMeta {

    public static final HttpRequestDef<BatchDeleteSqlJobTemplatesRequest, BatchDeleteSqlJobTemplatesResponse> batchDeleteSqlJobTemplates =
        genForbatchDeleteSqlJobTemplates();

    private static HttpRequestDef<BatchDeleteSqlJobTemplatesRequest, BatchDeleteSqlJobTemplatesResponse> genForbatchDeleteSqlJobTemplates() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSqlJobTemplatesRequest, BatchDeleteSqlJobTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteSqlJobTemplatesRequest.class,
                    BatchDeleteSqlJobTemplatesResponse.class)
                .withName("BatchDeleteSqlJobTemplates")
                .withUri("/v1.0/{project_id}/sqls-deletion")
                .withContentType("application/json");

        // requests
        builder.<DeleteSqlTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSqlTemplatesRequestBody.class),
            f -> f.withMarshaller(BatchDeleteSqlJobTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse> createSparkJobTemplate =
        genForcreateSparkJobTemplate();

    private static HttpRequestDef<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse> genForcreateSparkJobTemplate() {
        // basic
        HttpRequestDef.Builder<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSparkJobTemplateRequest.class, CreateSparkJobTemplateResponse.class)
            .withName("CreateSparkJobTemplate")
            .withUri("/v3/{project_id}/templates")
            .withContentType("application/json");

        // requests
        builder.<CreateJobTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateJobTemplatesRequestBody.class),
            f -> f.withMarshaller(CreateSparkJobTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse> createSqlJobTemplate =
        genForcreateSqlJobTemplate();

    private static HttpRequestDef<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse> genForcreateSqlJobTemplate() {
        // basic
        HttpRequestDef.Builder<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSqlJobTemplateRequest.class, CreateSqlJobTemplateResponse.class)
            .withName("CreateSqlJobTemplate")
            .withUri("/v1.0/{project_id}/sqls")
            .withContentType("application/json");

        // requests
        builder.<CreateSqlTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlTemplatesRequestBody.class),
            f -> f.withMarshaller(CreateSqlJobTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSparkJobTemplatesRequest, ListSparkJobTemplatesResponse> listSparkJobTemplates =
        genForlistSparkJobTemplates();

    private static HttpRequestDef<ListSparkJobTemplatesRequest, ListSparkJobTemplatesResponse> genForlistSparkJobTemplates() {
        // basic
        HttpRequestDef.Builder<ListSparkJobTemplatesRequest, ListSparkJobTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSparkJobTemplatesRequest.class, ListSparkJobTemplatesResponse.class)
            .withName("ListSparkJobTemplates")
            .withUri("/v3/{project_id}/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobTemplatesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobTemplatesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("current-page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobTemplatesRequest::getCurrentPage, (req, v) -> {
                req.setCurrentPage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlJobTemplatesRequest, ListSqlJobTemplatesResponse> listSqlJobTemplates =
        genForlistSqlJobTemplates();

    private static HttpRequestDef<ListSqlJobTemplatesRequest, ListSqlJobTemplatesResponse> genForlistSqlJobTemplates() {
        // basic
        HttpRequestDef.Builder<ListSqlJobTemplatesRequest, ListSqlJobTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlJobTemplatesRequest.class, ListSqlJobTemplatesResponse.class)
                .withName("ListSqlJobTemplates")
                .withUri("/v1.0/{project_id}/sqls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobTemplatesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobTemplateRequest, ShowSparkJobTemplateResponse> showSparkJobTemplate =
        genForshowSparkJobTemplate();

    private static HttpRequestDef<ShowSparkJobTemplateRequest, ShowSparkJobTemplateResponse> genForshowSparkJobTemplate() {
        // basic
        HttpRequestDef.Builder<ShowSparkJobTemplateRequest, ShowSparkJobTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSparkJobTemplateRequest.class, ShowSparkJobTemplateResponse.class)
            .withName("ShowSparkJobTemplate")
            .withUri("/v3/{project_id}/templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse> showSqlSampleTemplates =
        genForshowSqlSampleTemplates();

    private static HttpRequestDef<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse> genForshowSqlSampleTemplates() {
        // basic
        HttpRequestDef.Builder<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSqlSampleTemplatesRequest.class, ShowSqlSampleTemplatesResponse.class)
            .withName("ShowSqlSampleTemplates")
            .withUri("/v1.0/{project_id}/sqls/sample")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSparkJobTemplateRequest, UpdateSparkJobTemplateResponse> updateSparkJobTemplate =
        genForupdateSparkJobTemplate();

    private static HttpRequestDef<UpdateSparkJobTemplateRequest, UpdateSparkJobTemplateResponse> genForupdateSparkJobTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateSparkJobTemplateRequest, UpdateSparkJobTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSparkJobTemplateRequest.class, UpdateSparkJobTemplateResponse.class)
            .withName("UpdateSparkJobTemplate")
            .withUri("/v3/{project_id}/templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSparkJobTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<UpdateJobTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateJobTemplatesRequestBody.class),
            f -> f.withMarshaller(UpdateSparkJobTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlJobTemplateRequest, UpdateSqlJobTemplateResponse> updateSqlJobTemplate =
        genForupdateSqlJobTemplate();

    private static HttpRequestDef<UpdateSqlJobTemplateRequest, UpdateSqlJobTemplateResponse> genForupdateSqlJobTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateSqlJobTemplateRequest, UpdateSqlJobTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSqlJobTemplateRequest.class, UpdateSqlJobTemplateResponse.class)
            .withName("UpdateSqlJobTemplate")
            .withUri("/v1.0/{project_id}/sqls/{sql_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sql_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlJobTemplateRequest::getSqlId, (req, v) -> {
                req.setSqlId(v);
            }));
        builder.<UpdateSqlTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSqlTemplatesRequestBody.class),
            f -> f.withMarshaller(UpdateSqlJobTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> associateQueueToElasticResourcePool =
        genForassociateQueueToElasticResourcePool();

    private static HttpRequestDef<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> genForassociateQueueToElasticResourcePool() {
        // basic
        HttpRequestDef.Builder<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateQueueToElasticResourcePoolRequest.class,
                    AssociateQueueToElasticResourcePoolResponse.class)
                .withName("AssociateQueueToElasticResourcePool")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateQueueToElasticResourcePoolRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<AssociateQueueToElasticResourcePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateQueueToElasticResourcePoolRequestBody.class),
            f -> f.withMarshaller(AssociateQueueToElasticResourcePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateQueueToEnhancedConnectionRequest, AssociateQueueToEnhancedConnectionResponse> associateQueueToEnhancedConnection =
        genForassociateQueueToEnhancedConnection();

    private static HttpRequestDef<AssociateQueueToEnhancedConnectionRequest, AssociateQueueToEnhancedConnectionResponse> genForassociateQueueToEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<AssociateQueueToEnhancedConnectionRequest, AssociateQueueToEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateQueueToEnhancedConnectionRequest.class,
                    AssociateQueueToEnhancedConnectionResponse.class)
                .withName("AssociateQueueToEnhancedConnection")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}/associate-queue")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateQueueToEnhancedConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<AssociateConnectionQueueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateConnectionQueueReq.class),
            f -> f.withMarshaller(AssociateQueueToEnhancedConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> batchDeleteQueuePlans =
        genForbatchDeleteQueuePlans();

    private static HttpRequestDef<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> genForbatchDeleteQueuePlans() {
        // basic
        HttpRequestDef.Builder<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteQueuePlansRequest.class, BatchDeleteQueuePlansResponse.class)
            .withName("BatchDeleteQueuePlans")
            .withUri("/v1/{project_id}/queues/{queue_name}/plans/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteQueuePlansRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<QueuePlanIds>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueuePlanIds.class),
            f -> f.withMarshaller(BatchDeleteQueuePlansRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAuthorizationRequest, ChangeAuthorizationResponse> changeAuthorization =
        genForchangeAuthorization();

    private static HttpRequestDef<ChangeAuthorizationRequest, ChangeAuthorizationResponse> genForchangeAuthorization() {
        // basic
        HttpRequestDef.Builder<ChangeAuthorizationRequest, ChangeAuthorizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeAuthorizationRequest.class, ChangeAuthorizationResponse.class)
                .withName("ChangeAuthorization")
                .withUri("/v1.0/{project_id}/user-authorization")
                .withContentType("application/json");

        // requests
        builder.<GrantDataPermissionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantDataPermissionReq.class),
            f -> f.withMarshaller(ChangeAuthorizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeQueuePlanRequest, ChangeQueuePlanResponse> changeQueuePlan =
        genForchangeQueuePlan();

    private static HttpRequestDef<ChangeQueuePlanRequest, ChangeQueuePlanResponse> genForchangeQueuePlan() {
        // basic
        HttpRequestDef.Builder<ChangeQueuePlanRequest, ChangeQueuePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeQueuePlanRequest.class, ChangeQueuePlanResponse.class)
                .withName("ChangeQueuePlan")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeQueuePlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeQueuePlanRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<SetQueuePlanReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetQueuePlanReq.class),
            f -> f.withMarshaller(ChangeQueuePlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthInfoRequest, CreateAuthInfoResponse> createAuthInfo =
        genForcreateAuthInfo();

    private static HttpRequestDef<CreateAuthInfoRequest, CreateAuthInfoResponse> genForcreateAuthInfo() {
        // basic
        HttpRequestDef.Builder<CreateAuthInfoRequest, CreateAuthInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuthInfoRequest.class, CreateAuthInfoResponse.class)
                .withName("CreateAuthInfo")
                .withUri("/v2.0/{project_id}/datasource/auth-infos")
                .withContentType("application/json");

        // requests
        builder.<CreateAuthInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAuthInfoReq.class),
            f -> f.withMarshaller(CreateAuthInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectivityTaskRequest, CreateConnectivityTaskResponse> createConnectivityTask =
        genForcreateConnectivityTask();

    private static HttpRequestDef<CreateConnectivityTaskRequest, CreateConnectivityTaskResponse> genForcreateConnectivityTask() {
        // basic
        HttpRequestDef.Builder<CreateConnectivityTaskRequest, CreateConnectivityTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateConnectivityTaskRequest.class, CreateConnectivityTaskResponse.class)
            .withName("CreateConnectivityTask")
            .withUri("/v1.0/{project_id}/queues/{queue_name}/connection-test")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectivityTaskRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<VerityConnectivityReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerityConnectivityReq.class),
            f -> f.withMarshaller(CreateConnectivityTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> createDatasourceConnection =
        genForcreateDatasourceConnection();

    private static HttpRequestDef<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> genForcreateDatasourceConnection() {
        // basic
        HttpRequestDef.Builder<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDatasourceConnectionRequest.class,
                    CreateDatasourceConnectionResponse.class)
                .withName("CreateDatasourceConnection")
                .withUri("/v2.0/{project_id}/datasource-connection")
                .withContentType("application/json");

        // requests
        builder.<CreateDatasourceConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatasourceConnectionReq.class),
            f -> f.withMarshaller(CreateDatasourceConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDliAgencyRequest, CreateDliAgencyResponse> createDliAgency =
        genForcreateDliAgency();

    private static HttpRequestDef<CreateDliAgencyRequest, CreateDliAgencyResponse> genForcreateDliAgency() {
        // basic
        HttpRequestDef.Builder<CreateDliAgencyRequest, CreateDliAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDliAgencyRequest.class, CreateDliAgencyResponse.class)
                .withName("CreateDliAgency")
                .withUri("/v2/{project_id}/agency")
                .withContentType("application/json");

        // requests
        builder.<CreateAgencyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAgencyRequest.class),
            f -> f.withMarshaller(CreateDliAgencyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> createElasticResourcePool =
        genForcreateElasticResourcePool();

    private static HttpRequestDef<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> genForcreateElasticResourcePool() {
        // basic
        HttpRequestDef.Builder<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateElasticResourcePoolRequest.class,
                    CreateElasticResourcePoolResponse.class)
                .withName("CreateElasticResourcePool")
                .withUri("/v3/{project_id}/elastic-resource-pools")
                .withContentType("application/json");

        // requests
        builder.<CreateElasticResourcePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateElasticResourcePoolRequestBody.class),
            f -> f.withMarshaller(CreateElasticResourcePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> createEnhancedConnection =
        genForcreateEnhancedConnection();

    private static HttpRequestDef<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> genForcreateEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateEnhancedConnectionRequest.class, CreateEnhancedConnectionResponse.class)
                .withName("CreateEnhancedConnection")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections")
                .withContentType("application/json");

        // requests
        builder.<CreateEnhancedConnectionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEnhancedConnectionsReq.class),
            f -> f.withMarshaller(CreateEnhancedConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse> createEnhancedConnectionRoutes =
        genForcreateEnhancedConnectionRoutes();

    private static HttpRequestDef<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse> genForcreateEnhancedConnectionRoutes() {
        // basic
        HttpRequestDef.Builder<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateEnhancedConnectionRoutesRequest.class,
                    CreateEnhancedConnectionRoutesResponse.class)
                .withName("CreateEnhancedConnectionRoutes")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}/routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEnhancedConnectionRoutesRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<CreateRouteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRouteRequestBody.class),
            f -> f.withMarshaller(CreateEnhancedConnectionRoutesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGlobalVariableRequest, CreateGlobalVariableResponse> createGlobalVariable =
        genForcreateGlobalVariable();

    private static HttpRequestDef<CreateGlobalVariableRequest, CreateGlobalVariableResponse> genForcreateGlobalVariable() {
        // basic
        HttpRequestDef.Builder<CreateGlobalVariableRequest, CreateGlobalVariableResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGlobalVariableRequest.class, CreateGlobalVariableResponse.class)
            .withName("CreateGlobalVariable")
            .withUri("/v1.0/{project_id}/variables")
            .withContentType("application/json");

        // requests
        builder.<CreateGlobalValueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGlobalValueReq.class),
            f -> f.withMarshaller(CreateGlobalVariableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobAuthInfoRequest, CreateJobAuthInfoResponse> createJobAuthInfo =
        genForcreateJobAuthInfo();

    private static HttpRequestDef<CreateJobAuthInfoRequest, CreateJobAuthInfoResponse> genForcreateJobAuthInfo() {
        // basic
        HttpRequestDef.Builder<CreateJobAuthInfoRequest, CreateJobAuthInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateJobAuthInfoRequest.class, CreateJobAuthInfoResponse.class)
                .withName("CreateJobAuthInfo")
                .withUri("/v3/{project_id}/datasource/auth-infos")
                .withContentType("application/json");

        // requests
        builder.<CreateJobAuthInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateJobAuthInfoRequestBody.class),
            f -> f.withMarshaller(CreateJobAuthInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueueRequest, CreateQueueResponse> createQueue = genForcreateQueue();

    private static HttpRequestDef<CreateQueueRequest, CreateQueueResponse> genForcreateQueue() {
        // basic
        HttpRequestDef.Builder<CreateQueueRequest, CreateQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQueueRequest.class, CreateQueueResponse.class)
                .withName("CreateQueue")
                .withUri("/v1.0/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.<CreateQueueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateQueueReq.class),
            f -> f.withMarshaller(CreateQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueuePlanRequest, CreateQueuePlanResponse> createQueuePlan =
        genForcreateQueuePlan();

    private static HttpRequestDef<CreateQueuePlanRequest, CreateQueuePlanResponse> genForcreateQueuePlan() {
        // basic
        HttpRequestDef.Builder<CreateQueuePlanRequest, CreateQueuePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQueuePlanRequest.class, CreateQueuePlanResponse.class)
                .withName("CreateQueuePlan")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQueuePlanRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<SetQueuePlanReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetQueuePlanReq.class),
            f -> f.withMarshaller(CreateQueuePlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueuePropertyRequest, CreateQueuePropertyResponse> createQueueProperty =
        genForcreateQueueProperty();

    private static HttpRequestDef<CreateQueuePropertyRequest, CreateQueuePropertyResponse> genForcreateQueueProperty() {
        // basic
        HttpRequestDef.Builder<CreateQueuePropertyRequest, CreateQueuePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQueuePropertyRequest.class, CreateQueuePropertyResponse.class)
                .withName("CreateQueueProperty")
                .withUri("/v3/{project_id}/queues/{queue_name}/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQueuePropertyRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<InsertQueuePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InsertQueuePropertyRequestBody.class),
            f -> f.withMarshaller(CreateQueuePropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuthInfoRequest, DeleteAuthInfoResponse> deleteAuthInfo =
        genFordeleteAuthInfo();

    private static HttpRequestDef<DeleteAuthInfoRequest, DeleteAuthInfoResponse> genFordeleteAuthInfo() {
        // basic
        HttpRequestDef.Builder<DeleteAuthInfoRequest, DeleteAuthInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuthInfoRequest.class, DeleteAuthInfoResponse.class)
                .withName("DeleteAuthInfo")
                .withUri("/v2.0/{project_id}/datasource/auth-infos/{auth_info_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auth_info_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuthInfoRequest::getAuthInfoName, (req, v) -> {
                req.setAuthInfoName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> deleteDatasourceConnection =
        genFordeleteDatasourceConnection();

    private static HttpRequestDef<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> genFordeleteDatasourceConnection() {
        // basic
        HttpRequestDef.Builder<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDatasourceConnectionRequest.class,
                    DeleteDatasourceConnectionResponse.class)
                .withName("DeleteDatasourceConnection")
                .withUri("/v2.0/{project_id}/datasource-connection/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatasourceConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> deleteElasticResourcePool =
        genFordeleteElasticResourcePool();

    private static HttpRequestDef<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> genFordeleteElasticResourcePool() {
        // basic
        HttpRequestDef.Builder<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteElasticResourcePoolRequest.class,
                    DeleteElasticResourcePoolResponse.class)
                .withName("DeleteElasticResourcePool")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteElasticResourcePoolRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> deleteEnhancedConnection =
        genFordeleteEnhancedConnection();

    private static HttpRequestDef<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> genFordeleteEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEnhancedConnectionRequest.class,
                    DeleteEnhancedConnectionResponse.class)
                .withName("DeleteEnhancedConnection")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnhancedConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse> deleteEnhancedConnectionRoutes =
        genFordeleteEnhancedConnectionRoutes();

    private static HttpRequestDef<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse> genFordeleteEnhancedConnectionRoutes() {
        // basic
        HttpRequestDef.Builder<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEnhancedConnectionRoutesRequest.class,
                    DeleteEnhancedConnectionRoutesResponse.class)
                .withName("DeleteEnhancedConnectionRoutes")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}/routes/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnhancedConnectionRoutesRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnhancedConnectionRoutesRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGlobalVariableRequest, DeleteGlobalVariableResponse> deleteGlobalVariable =
        genFordeleteGlobalVariable();

    private static HttpRequestDef<DeleteGlobalVariableRequest, DeleteGlobalVariableResponse> genFordeleteGlobalVariable() {
        // basic
        HttpRequestDef.Builder<DeleteGlobalVariableRequest, DeleteGlobalVariableResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGlobalVariableRequest.class, DeleteGlobalVariableResponse.class)
            .withName("DeleteGlobalVariable")
            .withUri("/v1.0/{project_id}/variables/{var_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("var_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGlobalVariableRequest::getVarName, (req, v) -> {
                req.setVarName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobAuthInfoRequest, DeleteJobAuthInfoResponse> deleteJobAuthInfo =
        genFordeleteJobAuthInfo();

    private static HttpRequestDef<DeleteJobAuthInfoRequest, DeleteJobAuthInfoResponse> genFordeleteJobAuthInfo() {
        // basic
        HttpRequestDef.Builder<DeleteJobAuthInfoRequest, DeleteJobAuthInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobAuthInfoRequest.class, DeleteJobAuthInfoResponse.class)
                .withName("DeleteJobAuthInfo")
                .withUri("/v3/{project_id}/datasource/auth-infos/{auth_info_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auth_info_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobAuthInfoRequest::getAuthInfoName, (req, v) -> {
                req.setAuthInfoName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> deleteQueue = genFordeleteQueue();

    private static HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> genFordeleteQueue() {
        // basic
        HttpRequestDef.Builder<DeleteQueueRequest, DeleteQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueueRequest.class, DeleteQueueResponse.class)
                .withName("DeleteQueue")
                .withUri("/v1.0/{project_id}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueuePlanRequest, DeleteQueuePlanResponse> deleteQueuePlan =
        genFordeleteQueuePlan();

    private static HttpRequestDef<DeleteQueuePlanRequest, DeleteQueuePlanResponse> genFordeleteQueuePlan() {
        // basic
        HttpRequestDef.Builder<DeleteQueuePlanRequest, DeleteQueuePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueuePlanRequest.class, DeleteQueuePlanResponse.class)
                .withName("DeleteQueuePlan")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteQueuePlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueuePlanRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueuePropertyRequest, DeleteQueuePropertyResponse> deleteQueueProperty =
        genFordeleteQueueProperty();

    private static HttpRequestDef<DeleteQueuePropertyRequest, DeleteQueuePropertyResponse> genFordeleteQueueProperty() {
        // basic
        HttpRequestDef.Builder<DeleteQueuePropertyRequest, DeleteQueuePropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteQueuePropertyRequest.class, DeleteQueuePropertyResponse.class)
            .withName("DeleteQueueProperty")
            .withUri("/v3/{project_id}/queues/{queue_name}/properties")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueuePropertyRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<DeleteQueuePropertiesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteQueuePropertiesRequestBody.class),
            f -> f.withMarshaller(DeleteQueuePropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource =
        genFordeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genFordeleteResource() {
        // basic
        HttpRequestDef.Builder<DeleteResourceRequest, DeleteResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceRequest.class, DeleteResourceResponse.class)
                .withName("DeleteResource")
                .withUri("/v2.0/{project_id}/resources/{resource_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateQueueFromEnhancedConnectionRequest, DisassociateQueueFromEnhancedConnectionResponse> disassociateQueueFromEnhancedConnection =
        genFordisassociateQueueFromEnhancedConnection();

    private static HttpRequestDef<DisassociateQueueFromEnhancedConnectionRequest, DisassociateQueueFromEnhancedConnectionResponse> genFordisassociateQueueFromEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<DisassociateQueueFromEnhancedConnectionRequest, DisassociateQueueFromEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateQueueFromEnhancedConnectionRequest.class,
                    DisassociateQueueFromEnhancedConnectionResponse.class)
                .withName("DisassociateQueueFromEnhancedConnection")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}/disassociate-queue")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateQueueFromEnhancedConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<DisassociateConnectionQueueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateConnectionQueueReq.class),
            f -> f.withMarshaller(DisassociateQueueFromEnhancedConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthInfoRequest, ListAuthInfoResponse> listAuthInfo = genForlistAuthInfo();

    private static HttpRequestDef<ListAuthInfoRequest, ListAuthInfoResponse> genForlistAuthInfo() {
        // basic
        HttpRequestDef.Builder<ListAuthInfoRequest, ListAuthInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthInfoRequest.class, ListAuthInfoResponse.class)
                .withName("ListAuthInfo")
                .withUri("/v2.0/{project_id}/datasource/auth-infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auth_info_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthInfoRequest::getAuthInfoName, (req, v) -> {
                req.setAuthInfoName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizationPrivilegesRequest, ListAuthorizationPrivilegesResponse> listAuthorizationPrivileges =
        genForlistAuthorizationPrivileges();

    private static HttpRequestDef<ListAuthorizationPrivilegesRequest, ListAuthorizationPrivilegesResponse> genForlistAuthorizationPrivileges() {
        // basic
        HttpRequestDef.Builder<ListAuthorizationPrivilegesRequest, ListAuthorizationPrivilegesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAuthorizationPrivilegesRequest.class,
                    ListAuthorizationPrivilegesResponse.class)
                .withName("ListAuthorizationPrivileges")
                .withUri("/v1.0/{project_id}/authorization/privileges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationPrivilegesRequest::getObject, (req, v) -> {
                req.setObject(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsers =
        genForlistDatabaseUsers();

    private static HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> genForlistDatabaseUsers() {
        // basic
        HttpRequestDef.Builder<ListDatabaseUsersRequest, ListDatabaseUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseUsersRequest.class, ListDatabaseUsersResponse.class)
                .withName("ListDatabaseUsers")
                .withUri("/v1.0/{project_id}/databases/{database_name}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> listDatasourceConnections =
        genForlistDatasourceConnections();

    private static HttpRequestDef<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> genForlistDatasourceConnections() {
        // basic
        HttpRequestDef.Builder<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDatasourceConnectionsRequest.class,
                    ListDatasourceConnectionsResponse.class)
                .withName("ListDatasourceConnections")
                .withUri("/v2.0/{project_id}/datasource-connection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceConnectionsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> listElasticResourcePoolQueues =
        genForlistElasticResourcePoolQueues();

    private static HttpRequestDef<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> genForlistElasticResourcePoolQueues() {
        // basic
        HttpRequestDef.Builder<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListElasticResourcePoolQueuesRequest.class,
                    ListElasticResourcePoolQueuesResponse.class)
                .withName("ListElasticResourcePoolQueues")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse> listElasticResourcePoolScaleRecords =
        genForlistElasticResourcePoolScaleRecords();

    private static HttpRequestDef<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse> genForlistElasticResourcePoolScaleRecords() {
        // basic
        HttpRequestDef.Builder<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListElasticResourcePoolScaleRecordsRequest.class,
                    ListElasticResourcePoolScaleRecordsResponse.class)
                .withName("ListElasticResourcePoolScaleRecords")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}/scale-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ListElasticResourcePoolScaleRecordsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListElasticResourcePoolScaleRecordsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        builder.<String>withResponseField("X-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsResponse::getXAuthToken,
                ListElasticResourcePoolScaleRecordsResponse::setXAuthToken));
        return builder.build();
    }

    public static final HttpRequestDef<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> listElasticResourcePools =
        genForlistElasticResourcePools();

    private static HttpRequestDef<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> genForlistElasticResourcePools() {
        // basic
        HttpRequestDef.Builder<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListElasticResourcePoolsRequest.class, ListElasticResourcePoolsResponse.class)
                .withName("ListElasticResourcePools")
                .withUri("/v3/{project_id}/elastic-resource-pools")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListElasticResourcePoolsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListElasticResourcePoolsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> listEnhancedConnections =
        genForlistEnhancedConnections();

    private static HttpRequestDef<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> genForlistEnhancedConnections() {
        // basic
        HttpRequestDef.Builder<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEnhancedConnectionsRequest.class, ListEnhancedConnectionsResponse.class)
            .withName("ListEnhancedConnections")
            .withUri("/v2.0/{project_id}/datasource/enhanced-connections")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalVariablesRequest, ListGlobalVariablesResponse> listGlobalVariables =
        genForlistGlobalVariables();

    private static HttpRequestDef<ListGlobalVariablesRequest, ListGlobalVariablesResponse> genForlistGlobalVariables() {
        // basic
        HttpRequestDef.Builder<ListGlobalVariablesRequest, ListGlobalVariablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGlobalVariablesRequest.class, ListGlobalVariablesResponse.class)
                .withName("ListGlobalVariables")
                .withUri("/v1.0/{project_id}/variables")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalVariablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalVariablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobAuthInfosRequest, ListJobAuthInfosResponse> listJobAuthInfos =
        genForlistJobAuthInfos();

    private static HttpRequestDef<ListJobAuthInfosRequest, ListJobAuthInfosResponse> genForlistJobAuthInfos() {
        // basic
        HttpRequestDef.Builder<ListJobAuthInfosRequest, ListJobAuthInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobAuthInfosRequest.class, ListJobAuthInfosResponse.class)
                .withName("ListJobAuthInfos")
                .withUri("/v3/{project_id}/datasource/auth-infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auth_info_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobAuthInfosRequest::getAuthInfoName, (req, v) -> {
                req.setAuthInfoName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobAuthInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobAuthInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuePlansRequest, ListQueuePlansResponse> listQueuePlans =
        genForlistQueuePlans();

    private static HttpRequestDef<ListQueuePlansRequest, ListQueuePlansResponse> genForlistQueuePlans() {
        // basic
        HttpRequestDef.Builder<ListQueuePlansRequest, ListQueuePlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueuePlansRequest.class, ListQueuePlansResponse.class)
                .withName("ListQueuePlans")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuePlansRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuePropertiesRequest, ListQueuePropertiesResponse> listQueueProperties =
        genForlistQueueProperties();

    private static HttpRequestDef<ListQueuePropertiesRequest, ListQueuePropertiesResponse> genForlistQueueProperties() {
        // basic
        HttpRequestDef.Builder<ListQueuePropertiesRequest, ListQueuePropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueuePropertiesRequest.class, ListQueuePropertiesResponse.class)
                .withName("ListQueueProperties")
                .withUri("/v3/{project_id}/queues/{queue_name}/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuePropertiesRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueuePropertiesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueuePropertiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueueUsersRequest, ListQueueUsersResponse> listQueueUsers =
        genForlistQueueUsers();

    private static HttpRequestDef<ListQueueUsersRequest, ListQueueUsersResponse> genForlistQueueUsers() {
        // basic
        HttpRequestDef.Builder<ListQueueUsersRequest, ListQueueUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueueUsersRequest.class, ListQueueUsersResponse.class)
                .withName("ListQueueUsers")
                .withUri("/v1.0/{project_id}/queues/{queue_name}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueueUsersRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuesRequest, ListQueuesResponse> listQueues = genForlistQueues();

    private static HttpRequestDef<ListQueuesRequest, ListQueuesResponse> genForlistQueues() {
        // basic
        HttpRequestDef.Builder<ListQueuesRequest, ListQueuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueuesRequest.class, ListQueuesResponse.class)
                .withName("ListQueues")
                .withUri("/v1.0/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuesRequest::getQueueType, (req, v) -> {
                req.setQueueType(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<Boolean>withRequestField("with-charge-info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListQueuesRequest::getWithChargeInfo, (req, v) -> {
                req.setWithChargeInfo(v);
            }));
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListQueuesRequest::getWithPriv, (req, v) -> {
                req.setWithPriv(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesRequest, ListResourcesResponse> listResources =
        genForlistResources();

    private static HttpRequestDef<ListResourcesRequest, ListResourcesResponse> genForlistResources() {
        // basic
        HttpRequestDef.Builder<ListResourcesRequest, ListResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcesRequest.class, ListResourcesResponse.class)
                .withName("ListResources")
                .withUri("/v2.0/{project_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getKind, (req, v) -> {
                req.setKind(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablePrivilegesRequest, ListTablePrivilegesResponse> listTablePrivileges =
        genForlistTablePrivileges();

    private static HttpRequestDef<ListTablePrivilegesRequest, ListTablePrivilegesResponse> genForlistTablePrivileges() {
        // basic
        HttpRequestDef.Builder<ListTablePrivilegesRequest, ListTablePrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTablePrivilegesRequest.class, ListTablePrivilegesResponse.class)
                .withName("ListTablePrivileges")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablePrivilegesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablePrivilegesRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablePrivilegesRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableUsersRequest, ListTableUsersResponse> listTableUsers =
        genForlistTableUsers();

    private static HttpRequestDef<ListTableUsersRequest, ListTableUsersResponse> genForlistTableUsers() {
        // basic
        HttpRequestDef.Builder<ListTableUsersRequest, ListTableUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTableUsersRequest.class, ListTableUsersResponse.class)
                .withName("ListTableUsers")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableUsersRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableUsersRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> registerAuthorizedQueue =
        genForregisterAuthorizedQueue();

    private static HttpRequestDef<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> genForregisterAuthorizedQueue() {
        // basic
        HttpRequestDef.Builder<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RegisterAuthorizedQueueRequest.class, RegisterAuthorizedQueueResponse.class)
            .withName("RegisterAuthorizedQueue")
            .withUri("/v1.0/{project_id}/queues/user-authorization")
            .withContentType("application/json");

        // requests
        builder.<GrantQueuePermissionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantQueuePermissionReq.class),
            f -> f.withMarshaller(RegisterAuthorizedQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunAuthorizationActionRequest, RunAuthorizationActionResponse> runAuthorizationAction =
        genForrunAuthorizationAction();

    private static HttpRequestDef<RunAuthorizationActionRequest, RunAuthorizationActionResponse> genForrunAuthorizationAction() {
        // basic
        HttpRequestDef.Builder<RunAuthorizationActionRequest, RunAuthorizationActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RunAuthorizationActionRequest.class, RunAuthorizationActionResponse.class)
            .withName("RunAuthorizationAction")
            .withUri("/v1.0/{project_id}/authorization")
            .withContentType("application/json");

        // requests
        builder.<AuthorizeResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeResourceRequestBody.class),
            f -> f.withMarshaller(RunAuthorizationActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueueActionRequest, RunQueueActionResponse> runQueueAction =
        genForrunQueueAction();

    private static HttpRequestDef<RunQueueActionRequest, RunQueueActionResponse> genForrunQueueAction() {
        // basic
        HttpRequestDef.Builder<RunQueueActionRequest, RunQueueActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RunQueueActionRequest.class, RunQueueActionResponse.class)
                .withName("RunQueueAction")
                .withUri("/v1.0/{project_id}/queues/{queue_name}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunQueueActionRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<RunQueueActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunQueueActionReq.class),
            f -> f.withMarshaller(RunQueueActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectivityTaskRequest, ShowConnectivityTaskResponse> showConnectivityTask =
        genForshowConnectivityTask();

    private static HttpRequestDef<ShowConnectivityTaskRequest, ShowConnectivityTaskResponse> genForshowConnectivityTask() {
        // basic
        HttpRequestDef.Builder<ShowConnectivityTaskRequest, ShowConnectivityTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConnectivityTaskRequest.class, ShowConnectivityTaskResponse.class)
            .withName("ShowConnectivityTask")
            .withUri("/v1.0/{project_id}/queues/{queue_name}/connection-test/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectivityTaskRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectivityTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> showDatasourceConnection =
        genForshowDatasourceConnection();

    private static HttpRequestDef<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> genForshowDatasourceConnection() {
        // basic
        HttpRequestDef.Builder<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDatasourceConnectionRequest.class, ShowDatasourceConnectionResponse.class)
                .withName("ShowDatasourceConnection")
                .withUri("/v2.0/{project_id}/datasource-connection/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatasourceConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDliAgencyRequest, ShowDliAgencyResponse> showDliAgency =
        genForshowDliAgency();

    private static HttpRequestDef<ShowDliAgencyRequest, ShowDliAgencyResponse> genForshowDliAgency() {
        // basic
        HttpRequestDef.Builder<ShowDliAgencyRequest, ShowDliAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDliAgencyRequest.class, ShowDliAgencyResponse.class)
                .withName("ShowDliAgency")
                .withUri("/v2/{project_id}/agency")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> showEnhancedConnection =
        genForshowEnhancedConnection();

    private static HttpRequestDef<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> genForshowEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnhancedConnectionRequest.class, ShowEnhancedConnectionResponse.class)
            .withName("ShowEnhancedConnection")
            .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnhancedConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnhancedConnectionPrivilegeRequest, ShowEnhancedConnectionPrivilegeResponse> showEnhancedConnectionPrivilege =
        genForshowEnhancedConnectionPrivilege();

    private static HttpRequestDef<ShowEnhancedConnectionPrivilegeRequest, ShowEnhancedConnectionPrivilegeResponse> genForshowEnhancedConnectionPrivilege() {
        // basic
        HttpRequestDef.Builder<ShowEnhancedConnectionPrivilegeRequest, ShowEnhancedConnectionPrivilegeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEnhancedConnectionPrivilegeRequest.class,
                    ShowEnhancedConnectionPrivilegeResponse.class)
                .withName("ShowEnhancedConnectionPrivilege")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}/privileges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnhancedConnectionPrivilegeRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueRequest, ShowQueueResponse> showQueue = genForshowQueue();

    private static HttpRequestDef<ShowQueueRequest, ShowQueueResponse> genForshowQueue() {
        // basic
        HttpRequestDef.Builder<ShowQueueRequest, ShowQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueueRequest.class, ShowQueueResponse.class)
                .withName("ShowQueue")
                .withUri("/v1.0/{project_id}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForshowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForshowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceInfoRequest, ShowResourceInfoResponse> showResourceInfo =
        genForshowResourceInfo();

    private static HttpRequestDef<ShowResourceInfoRequest, ShowResourceInfoResponse> genForshowResourceInfo() {
        // basic
        HttpRequestDef.Builder<ShowResourceInfoRequest, ShowResourceInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceInfoRequest.class, ShowResourceInfoResponse.class)
                .withName("ShowResourceInfo")
                .withUri("/v2.0/{project_id}/resources/{resource_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceInfoRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceInfoRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthInfoRequest, UpdateAuthInfoResponse> updateAuthInfo =
        genForupdateAuthInfo();

    private static HttpRequestDef<UpdateAuthInfoRequest, UpdateAuthInfoResponse> genForupdateAuthInfo() {
        // basic
        HttpRequestDef.Builder<UpdateAuthInfoRequest, UpdateAuthInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAuthInfoRequest.class, UpdateAuthInfoResponse.class)
                .withName("UpdateAuthInfo")
                .withUri("/v2.0/{project_id}/datasource/auth-infos")
                .withContentType("application/json");

        // requests
        builder.<UpdateAuthInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuthInfoRequestBody.class),
            f -> f.withMarshaller(UpdateAuthInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> updateElasticResourcePool =
        genForupdateElasticResourcePool();

    private static HttpRequestDef<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> genForupdateElasticResourcePool() {
        // basic
        HttpRequestDef.Builder<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateElasticResourcePoolRequest.class,
                    UpdateElasticResourcePoolResponse.class)
                .withName("UpdateElasticResourcePool")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<UpdateElasticResourcePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateElasticResourcePoolRequestBody.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateElasticResourcePoolQueueRequest, UpdateElasticResourcePoolQueueResponse> updateElasticResourcePoolQueue =
        genForupdateElasticResourcePoolQueue();

    private static HttpRequestDef<UpdateElasticResourcePoolQueueRequest, UpdateElasticResourcePoolQueueResponse> genForupdateElasticResourcePoolQueue() {
        // basic
        HttpRequestDef.Builder<UpdateElasticResourcePoolQueueRequest, UpdateElasticResourcePoolQueueResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateElasticResourcePoolQueueRequest.class,
                    UpdateElasticResourcePoolQueueResponse.class)
                .withName("UpdateElasticResourcePoolQueue")
                .withUri("/v3/{project_id}/elastic-resource-pools/{elastic_resource_pool_name}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("elastic_resource_pool_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueRequest::getElasticResourcePoolName, (req, v) -> {
                req.setElasticResourcePoolName(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<UpdateElasticResourcePoolQueueScalingPolicyInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateElasticResourcePoolQueueScalingPolicyInfo.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnhancedConnectionRequest, UpdateEnhancedConnectionResponse> updateEnhancedConnection =
        genForupdateEnhancedConnection();

    private static HttpRequestDef<UpdateEnhancedConnectionRequest, UpdateEnhancedConnectionResponse> genForupdateEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<UpdateEnhancedConnectionRequest, UpdateEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateEnhancedConnectionRequest.class, UpdateEnhancedConnectionResponse.class)
                .withName("UpdateEnhancedConnection")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnhancedConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<UpdateHostMassageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHostMassageReq.class),
            f -> f.withMarshaller(UpdateEnhancedConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGlobalVariableRequest, UpdateGlobalVariableResponse> updateGlobalVariable =
        genForupdateGlobalVariable();

    private static HttpRequestDef<UpdateGlobalVariableRequest, UpdateGlobalVariableResponse> genForupdateGlobalVariable() {
        // basic
        HttpRequestDef.Builder<UpdateGlobalVariableRequest, UpdateGlobalVariableResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGlobalVariableRequest.class, UpdateGlobalVariableResponse.class)
            .withName("UpdateGlobalVariable")
            .withUri("/v1.0/{project_id}/variables/{var_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("var_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGlobalVariableRequest::getVarName, (req, v) -> {
                req.setVarName(v);
            }));
        builder.<UpdateGlobalValueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGlobalValueReq.class),
            f -> f.withMarshaller(UpdateGlobalVariableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> updateGroupOrResourceOwner =
        genForupdateGroupOrResourceOwner();

    private static HttpRequestDef<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> genForupdateGroupOrResourceOwner() {
        // basic
        HttpRequestDef.Builder<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGroupOrResourceOwnerRequest.class,
                    UpdateGroupOrResourceOwnerResponse.class)
                .withName("UpdateGroupOrResourceOwner")
                .withUri("/v2.0/{project_id}/resources/owner")
                .withContentType("application/json");

        // requests
        builder.<UpdateResourceOwner>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResourceOwner.class),
            f -> f.withMarshaller(UpdateGroupOrResourceOwnerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobAuthInfoRequest, UpdateJobAuthInfoResponse> updateJobAuthInfo =
        genForupdateJobAuthInfo();

    private static HttpRequestDef<UpdateJobAuthInfoRequest, UpdateJobAuthInfoResponse> genForupdateJobAuthInfo() {
        // basic
        HttpRequestDef.Builder<UpdateJobAuthInfoRequest, UpdateJobAuthInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobAuthInfoRequest.class, UpdateJobAuthInfoResponse.class)
                .withName("UpdateJobAuthInfo")
                .withUri("/v3/{project_id}/datasource/auth-infos")
                .withContentType("application/json");

        // requests
        builder.<UpdateJobAuthInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateJobAuthInfoRequestBody.class),
            f -> f.withMarshaller(UpdateJobAuthInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateQueueCidrRequest, UpdateQueueCidrResponse> updateQueueCidr =
        genForupdateQueueCidr();

    private static HttpRequestDef<UpdateQueueCidrRequest, UpdateQueueCidrResponse> genForupdateQueueCidr() {
        // basic
        HttpRequestDef.Builder<UpdateQueueCidrRequest, UpdateQueueCidrResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateQueueCidrRequest.class, UpdateQueueCidrResponse.class)
                .withName("UpdateQueueCidr")
                .withUri("/v1.0/{project_id}/queues/{queue_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateQueueCidrRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<UpdateQueueCidrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateQueueCidrReq.class),
            f -> f.withMarshaller(UpdateQueueCidrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateQueuePropertyRequest, UpdateQueuePropertyResponse> updateQueueProperty =
        genForupdateQueueProperty();

    private static HttpRequestDef<UpdateQueuePropertyRequest, UpdateQueuePropertyResponse> genForupdateQueueProperty() {
        // basic
        HttpRequestDef.Builder<UpdateQueuePropertyRequest, UpdateQueuePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateQueuePropertyRequest.class, UpdateQueuePropertyResponse.class)
                .withName("UpdateQueueProperty")
                .withUri("/v3/{project_id}/queues/{queue_name}/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateQueuePropertyRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<UpdateQueuePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateQueuePropertyRequestBody.class),
            f -> f.withMarshaller(UpdateQueuePropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFilesRequest, UploadFilesResponse> uploadFiles = genForuploadFiles();

    private static HttpRequestDef<UploadFilesRequest, UploadFilesResponse> genForuploadFiles() {
        // basic
        HttpRequestDef.Builder<UploadFilesRequest, UploadFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadFilesRequest.class, UploadFilesResponse.class)
                .withName("UploadFiles")
                .withUri("/v2.0/{project_id}/resources/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadFilesRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UploadGroupPackageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadGroupPackageReq.class),
            f -> f.withMarshaller(UploadFilesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJarsRequest, UploadJarsResponse> uploadJars = genForuploadJars();

    private static HttpRequestDef<UploadJarsRequest, UploadJarsResponse> genForuploadJars() {
        // basic
        HttpRequestDef.Builder<UploadJarsRequest, UploadJarsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadJarsRequest.class, UploadJarsResponse.class)
                .withName("UploadJars")
                .withUri("/v2.0/{project_id}/resources/jars")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadJarsRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UploadGroupPackageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadGroupPackageReq.class),
            f -> f.withMarshaller(UploadJarsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadPythonFilesRequest, UploadPythonFilesResponse> uploadPythonFiles =
        genForuploadPythonFiles();

    private static HttpRequestDef<UploadPythonFilesRequest, UploadPythonFilesResponse> genForuploadPythonFiles() {
        // basic
        HttpRequestDef.Builder<UploadPythonFilesRequest, UploadPythonFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadPythonFilesRequest.class, UploadPythonFilesResponse.class)
                .withName("UploadPythonFiles")
                .withUri("/v2.0/{project_id}/resources/pyfiles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPythonFilesRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UploadGroupPackageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadGroupPackageReq.class),
            f -> f.withMarshaller(UploadPythonFilesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadResourcesRequest, UploadResourcesResponse> uploadResources =
        genForuploadResources();

    private static HttpRequestDef<UploadResourcesRequest, UploadResourcesResponse> genForuploadResources() {
        // basic
        HttpRequestDef.Builder<UploadResourcesRequest, UploadResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadResourcesRequest.class, UploadResourcesResponse.class)
                .withName("UploadResources")
                .withUri("/v2.0/{project_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadResourcesRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UploadPackageGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadPackageGroupReq.class),
            f -> f.withMarshaller(UploadResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse> batchDeleteFlinkJobs =
        genForbatchDeleteFlinkJobs();

    private static HttpRequestDef<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse> genForbatchDeleteFlinkJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteFlinkJobsRequest.class, BatchDeleteFlinkJobsResponse.class)
            .withName("BatchDeleteFlinkJobs")
            .withUri("/v1.0/{project_id}/streaming/jobs/delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteFlinkJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteFlinkJobsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteFlinkJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse> batchRunFlinkJobs =
        genForbatchRunFlinkJobs();

    private static HttpRequestDef<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse> genForbatchRunFlinkJobs() {
        // basic
        HttpRequestDef.Builder<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRunFlinkJobsRequest.class, BatchRunFlinkJobsResponse.class)
                .withName("BatchRunFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs/run")
                .withContentType("application/json");

        // requests
        builder.<BatchRunFlinkJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRunFlinkJobsRequestBody.class),
            f -> f.withMarshaller(BatchRunFlinkJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<CommonResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchRunFlinkJobsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CommonResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> changeFlinkJobStatusReport =
        genForchangeFlinkJobStatusReport();

    private static HttpRequestDef<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> genForchangeFlinkJobStatusReport() {
        // basic
        HttpRequestDef.Builder<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeFlinkJobStatusReportRequest.class,
                    ChangeFlinkJobStatusReportResponse.class)
                .withName("ChangeFlinkJobStatusReport")
                .withUri("/v1/{project_id}/edgesrv/job-report")
                .withContentType("application/json");

        // requests
        builder.<IefFlinkJobStatusReportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IefFlinkJobStatusReportReq.class),
            f -> f.withMarshaller(ChangeFlinkJobStatusReportRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse> createFlinkJarJob =
        genForcreateFlinkJarJob();

    private static HttpRequestDef<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse> genForcreateFlinkJarJob() {
        // basic
        HttpRequestDef.Builder<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlinkJarJobRequest.class, CreateFlinkJarJobResponse.class)
                .withName("CreateFlinkJarJob")
                .withUri("/v1.0/{project_id}/streaming/flink-jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateFlinkJarRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkJarRequestBody.class),
            f -> f.withMarshaller(CreateFlinkJarJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse> createFlinkSqlJob =
        genForcreateFlinkSqlJob();

    private static HttpRequestDef<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse> genForcreateFlinkSqlJob() {
        // basic
        HttpRequestDef.Builder<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlinkSqlJobRequest.class, CreateFlinkSqlJobResponse.class)
                .withName("CreateFlinkSqlJob")
                .withUri("/v1.0/{project_id}/streaming/sql-jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateFlinkSqlJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkSqlJobRequestBody.class),
            f -> f.withMarshaller(CreateFlinkSqlJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSqlJobGraphRequest, CreateFlinkSqlJobGraphResponse> createFlinkSqlJobGraph =
        genForcreateFlinkSqlJobGraph();

    private static HttpRequestDef<CreateFlinkSqlJobGraphRequest, CreateFlinkSqlJobGraphResponse> genForcreateFlinkSqlJobGraph() {
        // basic
        HttpRequestDef.Builder<CreateFlinkSqlJobGraphRequest, CreateFlinkSqlJobGraphResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFlinkSqlJobGraphRequest.class, CreateFlinkSqlJobGraphResponse.class)
            .withName("CreateFlinkSqlJobGraph")
            .withUri("/v3/{project_id}/streaming/jobs/{job_id}/gen-graph")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlinkSqlJobGraphRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<GenStreamGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenStreamGraphReq.class),
            f -> f.withMarshaller(CreateFlinkSqlJobGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSqlJobTemplateRequest, CreateFlinkSqlJobTemplateResponse> createFlinkSqlJobTemplate =
        genForcreateFlinkSqlJobTemplate();

    private static HttpRequestDef<CreateFlinkSqlJobTemplateRequest, CreateFlinkSqlJobTemplateResponse> genForcreateFlinkSqlJobTemplate() {
        // basic
        HttpRequestDef.Builder<CreateFlinkSqlJobTemplateRequest, CreateFlinkSqlJobTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateFlinkSqlJobTemplateRequest.class,
                    CreateFlinkSqlJobTemplateResponse.class)
                .withName("CreateFlinkSqlJobTemplate")
                .withUri("/v1.0/{project_id}/streaming/job-templates")
                .withContentType("application/json");

        // requests
        builder.<CreateFlinkTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkTemplateRequestBody.class),
            f -> f.withMarshaller(CreateFlinkSqlJobTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> createIefMessageChannel =
        genForcreateIefMessageChannel();

    private static HttpRequestDef<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> genForcreateIefMessageChannel() {
        // basic
        HttpRequestDef.Builder<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateIefMessageChannelRequest.class, CreateIefMessageChannelResponse.class)
            .withName("CreateIefMessageChannel")
            .withUri("/v1/{project_id}/edgesrv/message-channel")
            .withContentType("application/json");

        // requests
        builder.<CreateIefMessageChannelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIefMessageChannelReq.class),
            f -> f.withMarshaller(CreateIefMessageChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> createIefSystemEvents =
        genForcreateIefSystemEvents();

    private static HttpRequestDef<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> genForcreateIefSystemEvents() {
        // basic
        HttpRequestDef.Builder<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateIefSystemEventsRequest.class, CreateIefSystemEventsResponse.class)
            .withName("CreateIefSystemEvents")
            .withUri("/v1/{project_id}/edgesrv/system-events")
            .withContentType("application/json");

        // requests
        builder.<IefSystemEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IefSystemEventsReq.class),
            f -> f.withMarshaller(CreateIefSystemEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlinkJobRequest, DeleteFlinkJobResponse> deleteFlinkJob =
        genFordeleteFlinkJob();

    private static HttpRequestDef<DeleteFlinkJobRequest, DeleteFlinkJobResponse> genFordeleteFlinkJob() {
        // basic
        HttpRequestDef.Builder<DeleteFlinkJobRequest, DeleteFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFlinkJobRequest.class, DeleteFlinkJobResponse.class)
                .withName("DeleteFlinkJob")
                .withUri("/v1.0/{project_id}/streaming/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteFlinkJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlinkSqlJobTemplateRequest, DeleteFlinkSqlJobTemplateResponse> deleteFlinkSqlJobTemplate =
        genFordeleteFlinkSqlJobTemplate();

    private static HttpRequestDef<DeleteFlinkSqlJobTemplateRequest, DeleteFlinkSqlJobTemplateResponse> genFordeleteFlinkSqlJobTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteFlinkSqlJobTemplateRequest, DeleteFlinkSqlJobTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteFlinkSqlJobTemplateRequest.class,
                    DeleteFlinkSqlJobTemplateResponse.class)
                .withName("DeleteFlinkSqlJobTemplate")
                .withUri("/v1.0/{project_id}/streaming/job-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteFlinkSqlJobTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportFlinkJobsRequest, ExportFlinkJobsResponse> exportFlinkJobs =
        genForexportFlinkJobs();

    private static HttpRequestDef<ExportFlinkJobsRequest, ExportFlinkJobsResponse> genForexportFlinkJobs() {
        // basic
        HttpRequestDef.Builder<ExportFlinkJobsRequest, ExportFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportFlinkJobsRequest.class, ExportFlinkJobsResponse.class)
                .withName("ExportFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs/export")
                .withContentType("application/json");

        // requests
        builder.<ExportFlinkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportFlinkJobRequestBody.class),
            f -> f.withMarshaller(ExportFlinkJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportFlinkJobsRequest, ImportFlinkJobsResponse> importFlinkJobs =
        genForimportFlinkJobs();

    private static HttpRequestDef<ImportFlinkJobsRequest, ImportFlinkJobsResponse> genForimportFlinkJobs() {
        // basic
        HttpRequestDef.Builder<ImportFlinkJobsRequest, ImportFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportFlinkJobsRequest.class, ImportFlinkJobsResponse.class)
                .withName("ImportFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs/import")
                .withContentType("application/json");

        // requests
        builder.<ImportFlinkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportFlinkJobRequestBody.class),
            f -> f.withMarshaller(ImportFlinkJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobs =
        genForlistFlinkJobs();

    private static HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> genForlistFlinkJobs() {
        // basic
        HttpRequestDef.Builder<ListFlinkJobsRequest, ListFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkJobsRequest.class, ListFlinkJobsResponse.class)
                .withName("ListFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<Long>withRequestField("root_job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getRootJobId, (req, v) -> {
                req.setRootJobId(v);
            }));
        builder.<Boolean>withRequestField("show_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getShowDetail, (req, v) -> {
                req.setShowDetail(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("sys_enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getSysEnterpriseProjectName, (req, v) -> {
                req.setSysEnterpriseProjectName(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkSqlJobTemplatesRequest, ListFlinkSqlJobTemplatesResponse> listFlinkSqlJobTemplates =
        genForlistFlinkSqlJobTemplates();

    private static HttpRequestDef<ListFlinkSqlJobTemplatesRequest, ListFlinkSqlJobTemplatesResponse> genForlistFlinkSqlJobTemplates() {
        // basic
        HttpRequestDef.Builder<ListFlinkSqlJobTemplatesRequest, ListFlinkSqlJobTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListFlinkSqlJobTemplatesRequest.class, ListFlinkSqlJobTemplatesResponse.class)
                .withName("ListFlinkSqlJobTemplates")
                .withUri("/v1.0/{project_id}/streaming/job-templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterBucketRequest, RegisterBucketResponse> registerBucket =
        genForregisterBucket();

    private static HttpRequestDef<RegisterBucketRequest, RegisterBucketResponse> genForregisterBucket() {
        // basic
        HttpRequestDef.Builder<RegisterBucketRequest, RegisterBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterBucketRequest.class, RegisterBucketResponse.class)
                .withName("RegisterBucket")
                .withUri("/v1.0/{project_id}/dli/obs-authorize")
                .withContentType("application/json");

        // requests
        builder.<ObsBuckets>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ObsBuckets.class),
            f -> f.withMarshaller(RegisterBucketRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> runIefJobActionCallBack =
        genForrunIefJobActionCallBack();

    private static HttpRequestDef<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> genForrunIefJobActionCallBack() {
        // basic
        HttpRequestDef.Builder<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunIefJobActionCallBackRequest.class, RunIefJobActionCallBackResponse.class)
            .withName("RunIefJobActionCallBack")
            .withUri("/v1/{project_id}/edgesrv/messages")
            .withContentType("application/json");

        // requests
        builder.<IefFlinkJobMessagesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IefFlinkJobMessagesReq.class),
            f -> f.withMarshaller(RunIefJobActionCallBackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJob = genForshowFlinkJob();

    private static HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> genForshowFlinkJob() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobRequest, ShowFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlinkJobRequest.class, ShowFlinkJobResponse.class)
                .withName("ShowFlinkJob")
                .withUri("/v1.0/{project_id}/streaming/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowFlinkJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobExecutionGraphRequest, ShowFlinkJobExecutionGraphResponse> showFlinkJobExecutionGraph =
        genForshowFlinkJobExecutionGraph();

    private static HttpRequestDef<ShowFlinkJobExecutionGraphRequest, ShowFlinkJobExecutionGraphResponse> genForshowFlinkJobExecutionGraph() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobExecutionGraphRequest, ShowFlinkJobExecutionGraphResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowFlinkJobExecutionGraphRequest.class,
                    ShowFlinkJobExecutionGraphResponse.class)
                .withName("ShowFlinkJobExecutionGraph")
                .withUri("/v1.0/{project_id}/streaming/jobs/{job_id}/execute-graph")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowFlinkJobExecutionGraphRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkMetricRequest, ShowFlinkMetricResponse> showFlinkMetric =
        genForshowFlinkMetric();

    private static HttpRequestDef<ShowFlinkMetricRequest, ShowFlinkMetricResponse> genForshowFlinkMetric() {
        // basic
        HttpRequestDef.Builder<ShowFlinkMetricRequest, ShowFlinkMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFlinkMetricRequest.class, ShowFlinkMetricResponse.class)
                .withName("ShowFlinkMetric")
                .withUri("/v1.0/{project_id}/streaming/jobs/metrics")
                .withContentType("application/json");

        // requests
        builder.<ShowJobMonitorInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowJobMonitorInfoReq.class),
            f -> f.withMarshaller(ShowFlinkMetricRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopFlinkJobsRequest, StopFlinkJobsResponse> stopFlinkJobs =
        genForstopFlinkJobs();

    private static HttpRequestDef<StopFlinkJobsRequest, StopFlinkJobsResponse> genForstopFlinkJobs() {
        // basic
        HttpRequestDef.Builder<StopFlinkJobsRequest, StopFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopFlinkJobsRequest.class, StopFlinkJobsResponse.class)
                .withName("StopFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs/stop")
                .withContentType("application/json");

        // requests
        builder.<StopFlinkJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopFlinkJobsRequestBody.class),
            f -> f.withMarshaller(StopFlinkJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<CommonResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(StopFlinkJobsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CommonResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkJarJobRequest, UpdateFlinkJarJobResponse> updateFlinkJarJob =
        genForupdateFlinkJarJob();

    private static HttpRequestDef<UpdateFlinkJarJobRequest, UpdateFlinkJarJobResponse> genForupdateFlinkJarJob() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkJarJobRequest, UpdateFlinkJarJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFlinkJarJobRequest.class, UpdateFlinkJarJobResponse.class)
                .withName("UpdateFlinkJarJob")
                .withUri("/v1.0/{project_id}/streaming/flink-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateFlinkJarJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateFlinkJarRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkJarRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkJarJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkSqlJobRequest, UpdateFlinkSqlJobResponse> updateFlinkSqlJob =
        genForupdateFlinkSqlJob();

    private static HttpRequestDef<UpdateFlinkSqlJobRequest, UpdateFlinkSqlJobResponse> genForupdateFlinkSqlJob() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkSqlJobRequest, UpdateFlinkSqlJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFlinkSqlJobRequest.class, UpdateFlinkSqlJobResponse.class)
                .withName("UpdateFlinkSqlJob")
                .withUri("/v1.0/{project_id}/streaming/sql-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateFlinkSqlJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateFlinkSqlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkSqlRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkSqlJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkSqlJobTemplateRequest, UpdateFlinkSqlJobTemplateResponse> updateFlinkSqlJobTemplate =
        genForupdateFlinkSqlJobTemplate();

    private static HttpRequestDef<UpdateFlinkSqlJobTemplateRequest, UpdateFlinkSqlJobTemplateResponse> genForupdateFlinkSqlJobTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkSqlJobTemplateRequest, UpdateFlinkSqlJobTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateFlinkSqlJobTemplateRequest.class,
                    UpdateFlinkSqlJobTemplateResponse.class)
                .withName("UpdateFlinkSqlJobTemplate")
                .withUri("/v1.0/{project_id}/streaming/job-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateFlinkSqlJobTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<UpdateFlinkTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkSqlJobTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSparkJobRequest, CancelSparkJobResponse> cancelSparkJob =
        genForcancelSparkJob();

    private static HttpRequestDef<CancelSparkJobRequest, CancelSparkJobResponse> genForcancelSparkJob() {
        // basic
        HttpRequestDef.Builder<CancelSparkJobRequest, CancelSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelSparkJobRequest.class, CancelSparkJobResponse.class)
                .withName("CancelSparkJob")
                .withUri("/v2.0/{project_id}/batches/{batch_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkJobRequest::getBatchId, (req, v) -> {
                req.setBatchId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSparkJobRequest, CreateSparkJobResponse> createSparkJob =
        genForcreateSparkJob();

    private static HttpRequestDef<CreateSparkJobRequest, CreateSparkJobResponse> genForcreateSparkJob() {
        // basic
        HttpRequestDef.Builder<CreateSparkJobRequest, CreateSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSparkJobRequest.class, CreateSparkJobResponse.class)
                .withName("CreateSparkJob")
                .withUri("/v2.0/{project_id}/batches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSparkJobRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<BatchJobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchJobInfo.class),
            f -> f.withMarshaller(CreateSparkJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSparkJobsRequest, ListSparkJobsResponse> listSparkJobs =
        genForlistSparkJobs();

    private static HttpRequestDef<ListSparkJobsRequest, ListSparkJobsResponse> genForlistSparkJobs() {
        // basic
        HttpRequestDef.Builder<ListSparkJobsRequest, ListSparkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSparkJobsRequest.class, ListSparkJobsResponse.class)
                .withName("ListSparkJobs")
                .withUri("/v2.0/{project_id}/batches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getClusterName, (req, v) -> {
                req.setClusterName(v);
            }));
        builder.<Long>withRequestField("end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getEnd, (req, v) -> {
                req.setEnd(v);
            }));
        builder.<Integer>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<String>withRequestField("job-name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("job-id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<Long>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getState, (req, v) -> {
                req.setState(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchLogRequest, ShowBatchLogResponse> showBatchLog = genForshowBatchLog();

    private static HttpRequestDef<ShowBatchLogRequest, ShowBatchLogResponse> genForshowBatchLog() {
        // basic
        HttpRequestDef.Builder<ShowBatchLogRequest, ShowBatchLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchLogRequest.class, ShowBatchLogResponse.class)
                .withName("ShowBatchLog")
                .withUri("/v2.0/{project_id}/batches/{batch_id}/log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getBatchId, (req, v) -> {
                req.setBatchId(v);
            }));
        builder.<Integer>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<Integer>withRequestField("index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getIndex, (req, v) -> {
                req.setIndex(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchLogRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobRequest, ShowSparkJobResponse> showSparkJob = genForshowSparkJob();

    private static HttpRequestDef<ShowSparkJobRequest, ShowSparkJobResponse> genForshowSparkJob() {
        // basic
        HttpRequestDef.Builder<ShowSparkJobRequest, ShowSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkJobRequest.class, ShowSparkJobResponse.class)
                .withName("ShowSparkJob")
                .withUri("/v2.0/{project_id}/batches/{batch_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobRequest::getBatchId, (req, v) -> {
                req.setBatchId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobStatusRequest, ShowSparkJobStatusResponse> showSparkJobStatus =
        genForshowSparkJobStatus();

    private static HttpRequestDef<ShowSparkJobStatusRequest, ShowSparkJobStatusResponse> genForshowSparkJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowSparkJobStatusRequest, ShowSparkJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkJobStatusRequest.class, ShowSparkJobStatusResponse.class)
                .withName("ShowSparkJobStatus")
                .withUri("/v2.0/{project_id}/batches/{batch_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobStatusRequest::getBatchId, (req, v) -> {
                req.setBatchId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSqlJobRequest, CancelSqlJobResponse> cancelSqlJob = genForcancelSqlJob();

    private static HttpRequestDef<CancelSqlJobRequest, CancelSqlJobResponse> genForcancelSqlJob() {
        // basic
        HttpRequestDef.Builder<CancelSqlJobRequest, CancelSqlJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelSqlJobRequest.class, CancelSqlJobResponse.class)
                .withName("CancelSqlJob")
                .withUri("/v1.0/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSqlJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckSqlRequest, CheckSqlResponse> checkSql = genForcheckSql();

    private static HttpRequestDef<CheckSqlRequest, CheckSqlResponse> genForcheckSql() {
        // basic
        HttpRequestDef.Builder<CheckSqlRequest, CheckSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckSqlRequest.class, CheckSqlResponse.class)
                .withName("CheckSql")
                .withUri("/v1.0/{project_id}/jobs/check-sql")
                .withContentType("application/json");

        // requests
        builder.<CheckSqlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckSqlRequestBody.class),
            f -> f.withMarshaller(CheckSqlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase =
        genForcreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForcreateDatabase() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseRequest, CreateDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseRequest.class, CreateDatabaseResponse.class)
                .withName("CreateDatabase")
                .withUri("/v1.0/{project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<CreateDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseRequestBody.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlJobRequest, CreateSqlJobResponse> createSqlJob = genForcreateSqlJob();

    private static HttpRequestDef<CreateSqlJobRequest, CreateSqlJobResponse> genForcreateSqlJob() {
        // basic
        HttpRequestDef.Builder<CreateSqlJobRequest, CreateSqlJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlJobRequest.class, CreateSqlJobResponse.class)
                .withName("CreateSqlJob")
                .withUri("/v1.0/{project_id}/jobs/submit-job")
                .withContentType("application/json");

        // requests
        builder.<CreateSqlJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlJobRequestBody.class),
            f -> f.withMarshaller(CreateSqlJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableRequest, CreateTableResponse> createTable = genForcreateTable();

    private static HttpRequestDef<CreateTableRequest, CreateTableResponse> genForcreateTable() {
        // basic
        HttpRequestDef.Builder<CreateTableRequest, CreateTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTableRequest.class, CreateTableResponse.class)
                .withName("CreateTable")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<CreateTableReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTableReq.class),
            f -> f.withMarshaller(CreateTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase =
        genFordeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genFordeleteDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseRequest, DeleteDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseRequest.class, DeleteDatabaseResponse.class)
                .withName("DeleteDatabase")
                .withUri("/v1.0/{project_id}/databases/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<Boolean>withRequestField("async",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getAsync, (req, v) -> {
                req.setAsync(v);
            }));
        builder.<Boolean>withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getCascade, (req, v) -> {
                req.setCascade(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableRequest, DeleteTableResponse> deleteTable = genFordeleteTable();

    private static HttpRequestDef<DeleteTableRequest, DeleteTableResponse> genFordeleteTable() {
        // basic
        HttpRequestDef.Builder<DeleteTableRequest, DeleteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTableRequest.class, DeleteTableResponse.class)
                .withName("DeleteTable")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<Boolean>withRequestField("async",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteTableRequest::getAsync, (req, v) -> {
                req.setAsync(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSqlJobResultRequest, ExportSqlJobResultResponse> exportSqlJobResult =
        genForexportSqlJobResult();

    private static HttpRequestDef<ExportSqlJobResultRequest, ExportSqlJobResultResponse> genForexportSqlJobResult() {
        // basic
        HttpRequestDef.Builder<ExportSqlJobResultRequest, ExportSqlJobResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportSqlJobResultRequest.class, ExportSqlJobResultResponse.class)
                .withName("ExportSqlJobResult")
                .withUri("/v1.0/{project_id}/jobs/{job_id}/export-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSqlJobResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ExportSqlResultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportSqlResultRequestBody.class),
            f -> f.withMarshaller(ExportSqlJobResultRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTableRequest, ExportTableResponse> exportTable = genForexportTable();

    private static HttpRequestDef<ExportTableRequest, ExportTableResponse> genForexportTable() {
        // basic
        HttpRequestDef.Builder<ExportTableRequest, ExportTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportTableRequest.class, ExportTableResponse.class)
                .withName("ExportTable")
                .withUri("/v1.0/{project_id}/jobs/export-table")
                .withContentType("application/json");

        // requests
        builder.<ExportTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportTableRequestBody.class),
            f -> f.withMarshaller(ExportTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportTableRequest, ImportTableResponse> importTable = genForimportTable();

    private static HttpRequestDef<ImportTableRequest, ImportTableResponse> genForimportTable() {
        // basic
        HttpRequestDef.Builder<ImportTableRequest, ImportTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportTableRequest.class, ImportTableResponse.class)
                .withName("ImportTable")
                .withUri("/v1.0/{project_id}/jobs/import-table")
                .withContentType("application/json");

        // requests
        builder.<ImportTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportTableRequestBody.class),
            f -> f.withMarshaller(ImportTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTablesRequest, ListAllTablesResponse> listAllTables =
        genForlistAllTables();

    private static HttpRequestDef<ListAllTablesRequest, ListAllTablesResponse> genForlistAllTables() {
        // basic
        HttpRequestDef.Builder<ListAllTablesRequest, ListAllTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllTablesRequest.class, ListAllTablesResponse.class)
                .withName("ListAllTables")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<Integer>withRequestField("current-page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTablesRequest::getCurrentPage, (req, v) -> {
                req.setCurrentPage(v);
            }));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTablesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("table-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTablesRequest::getTableType, (req, v) -> {
                req.setTableType(v);
            }));
        builder.<Boolean>withRequestField("with-detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllTablesRequest::getWithDetail, (req, v) -> {
                req.setWithDetail(v);
            }));
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllTablesRequest::getWithPriv, (req, v) -> {
                req.setWithPriv(v);
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
                .withUri("/v1.0/{project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDatabasesRequest::getWithPriv, (req, v) -> {
                req.setWithPriv(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlJobsRequest, ListSqlJobsResponse> listSqlJobs = genForlistSqlJobs();

    private static HttpRequestDef<ListSqlJobsRequest, ListSqlJobsResponse> genForlistSqlJobs() {
        // basic
        HttpRequestDef.Builder<ListSqlJobsRequest, ListSqlJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlJobsRequest.class, ListSqlJobsResponse.class)
                .withName("ListSqlJobs")
                .withUri("/v1.0/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("current-page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getCurrentPage, (req, v) -> {
                req.setCurrentPage(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<Long>withRequestField("end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getEnd, (req, v) -> {
                req.setEnd(v);
            }));
        builder.<String>withRequestField("engine-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getEngineType, (req, v) -> {
                req.setEngineType(v);
            }));
        builder.<String>withRequestField("job-status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getJobStatus, (req, v) -> {
                req.setJobStatus(v);
            }));
        builder.<ListSqlJobsRequest.JobTypeEnum>withRequestField("job-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSqlJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<ListSqlJobsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSqlJobsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            }));
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));
        builder.<String>withRequestField("sql_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getSqlPattern, (req, v) -> {
                req.setSqlPattern(v);
            }));
        builder.<Long>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PreviewSqlJobResultRequest, PreviewSqlJobResultResponse> previewSqlJobResult =
        genForpreviewSqlJobResult();

    private static HttpRequestDef<PreviewSqlJobResultRequest, PreviewSqlJobResultResponse> genForpreviewSqlJobResult() {
        // basic
        HttpRequestDef.Builder<PreviewSqlJobResultRequest, PreviewSqlJobResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, PreviewSqlJobResultRequest.class, PreviewSqlJobResultResponse.class)
                .withName("PreviewSqlJobResult")
                .withUri("/v1.0/{project_id}/jobs/{job_id}/preview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewSqlJobResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("queue-name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewSqlJobResultRequest::getQueueName, (req, v) -> {
                req.setQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDescribeTableRequest, ShowDescribeTableResponse> showDescribeTable =
        genForshowDescribeTable();

    private static HttpRequestDef<ShowDescribeTableRequest, ShowDescribeTableResponse> genForshowDescribeTable() {
        // basic
        HttpRequestDef.Builder<ShowDescribeTableRequest, ShowDescribeTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDescribeTableRequest.class, ShowDescribeTableResponse.class)
                .withName("ShowDescribeTable")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDescribeTableRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDescribeTableRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionsRequest, ShowPartitionsResponse> showPartitions =
        genForshowPartitions();

    private static HttpRequestDef<ShowPartitionsRequest, ShowPartitionsResponse> genForshowPartitions() {
        // basic
        HttpRequestDef.Builder<ShowPartitionsRequest, ShowPartitionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartitionsRequest.class, ShowPartitionsResponse.class)
                .withName("ShowPartitions")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/partitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionsRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse> showSqlJobDetail =
        genForshowSqlJobDetail();

    private static HttpRequestDef<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse> genForshowSqlJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlJobDetailRequest.class, ShowSqlJobDetailResponse.class)
                .withName("ShowSqlJobDetail")
                .withUri("/v1.0/{project_id}/jobs/{job_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlJobDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlJobProgressRequest, ShowSqlJobProgressResponse> showSqlJobProgress =
        genForshowSqlJobProgress();

    private static HttpRequestDef<ShowSqlJobProgressRequest, ShowSqlJobProgressResponse> genForshowSqlJobProgress() {
        // basic
        HttpRequestDef.Builder<ShowSqlJobProgressRequest, ShowSqlJobProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlJobProgressRequest.class, ShowSqlJobProgressResponse.class)
                .withName("ShowSqlJobProgress")
                .withUri("/v1/{project_id}/jobs/{job_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlJobProgressRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse> showSqlJobStatus =
        genForshowSqlJobStatus();

    private static HttpRequestDef<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse> genForshowSqlJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlJobStatusRequest.class, ShowSqlJobStatusResponse.class)
                .withName("ShowSqlJobStatus")
                .withUri("/v1.0/{project_id}/jobs/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlJobStatusRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableContentRequest, ShowTableContentResponse> showTableContent =
        genForshowTableContent();

    private static HttpRequestDef<ShowTableContentRequest, ShowTableContentResponse> genForshowTableContent() {
        // basic
        HttpRequestDef.Builder<ShowTableContentRequest, ShowTableContentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTableContentRequest.class, ShowTableContentResponse.class)
                .withName("ShowTableContent")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/preview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableContentRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableContentRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableContentRequest::getMode, (req, v) -> {
                req.setMode(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> updateDatabaseOwner =
        genForupdateDatabaseOwner();

    private static HttpRequestDef<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> genForupdateDatabaseOwner() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDatabaseOwnerRequest.class, UpdateDatabaseOwnerResponse.class)
                .withName("UpdateDatabaseOwner")
                .withUri("/v1.0/{project_id}/databases/{database_name}/owner")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseOwnerRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<UpdateOwnerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOwnerRequestBody.class),
            f -> f.withMarshaller(UpdateDatabaseOwnerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTableOwnerRequest, UpdateTableOwnerResponse> updateTableOwner =
        genForupdateTableOwner();

    private static HttpRequestDef<UpdateTableOwnerRequest, UpdateTableOwnerResponse> genForupdateTableOwner() {
        // basic
        HttpRequestDef.Builder<UpdateTableOwnerRequest, UpdateTableOwnerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTableOwnerRequest.class, UpdateTableOwnerResponse.class)
                .withName("UpdateTableOwner")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/owner")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableOwnerRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableOwnerRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<UpdateOwnerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOwnerRequestBody.class),
            f -> f.withMarshaller(UpdateTableOwnerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
