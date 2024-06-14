package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolRequestBody;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToEnhancedConnectionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansRequestBody;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteSqlJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteSqlJobTemplatesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteSqlJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchStopFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchStopFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.CancelSparkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CancelSparkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CancelSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CancelSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.ChangeFlinkJobStatusReportRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CheckSqlRequest;
import com.huaweicloud.sdk.dli.v1.model.CheckSqlRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CheckSqlResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateConnectivityTaskRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateConnectivityTaskRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateConnectivityTaskResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDatabaseRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDatasourceConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDatasourceConnectionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateDatasourceConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDliAgencyRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDliAgencyRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateDliAgencyResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateElasticResourcePoolRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRoutesRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRoutesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRoutesResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobGraphRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobGraphRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobGraphResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobTemplateRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalVariableRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalVariableRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalVariableResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateJobAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateJobAuthInfoRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateJobAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePropertyRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateRouteToEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateRouteToEnhancedConnectionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateRouteToEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobTemplateRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobTemplateRequestBody;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateTableRequestBody;
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
import com.huaweicloud.sdk.dli.v1.model.DeleteJobResourceRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteJobResourceResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePropertyRequestBody;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteRouteFromEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteRouteFromEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteTableResponse;
import com.huaweicloud.sdk.dli.v1.model.DisassociateQueueFromEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.DisassociateQueueFromEnhancedConnectionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.DisassociateQueueFromEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.ExecuteFlinkJobSavepointRequest;
import com.huaweicloud.sdk.dli.v1.model.ExecuteFlinkJobSavepointRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ExecuteFlinkJobSavepointResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportTableRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ExportTableResponse;
import com.huaweicloud.sdk.dli.v1.model.FlinkSuccessResponse;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobSavepointRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobSavepointRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobSavepointResponse;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ImportTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportTableRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ImportTableResponse;
import com.huaweicloud.sdk.dli.v1.model.ListAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.ListAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.ListAuthorizationPrivilegesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListAuthorizationPrivilegesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListCatalogsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListCatalogsResponse;
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
import com.huaweicloud.sdk.dli.v1.model.ListJobResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListJobResourcesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListPartitionsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListPartitionsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePlansRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePlansResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePropertiesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePropertiesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueueUsersRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueueUsersResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueuesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueuesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSparkJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSparkJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSparkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSparkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSqlSampleTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSqlSampleTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListTablePrivilegesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListTablePrivilegesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListTableUsersRequest;
import com.huaweicloud.sdk.dli.v1.model.ListTableUsersResponse;
import com.huaweicloud.sdk.dli.v1.model.ListTablesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListTablesResponse;
import com.huaweicloud.sdk.dli.v1.model.PreviewSqlJobResultRequest;
import com.huaweicloud.sdk.dli.v1.model.PreviewSqlJobResultResponse;
import com.huaweicloud.sdk.dli.v1.model.PreviewTableRequest;
import com.huaweicloud.sdk.dli.v1.model.PreviewTableResponse;
import com.huaweicloud.sdk.dli.v1.model.QueuePlanRequestBody;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueRequestBody;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketRequest;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketRequestBody;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketResponse;
import com.huaweicloud.sdk.dli.v1.model.RunAuthorizationActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunAuthorizationActionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.RunAuthorizationActionResponse;
import com.huaweicloud.sdk.dli.v1.model.RunCatalogActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunCatalogActionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.RunCatalogActionResponse;
import com.huaweicloud.sdk.dli.v1.model.RunDataAuthorizationActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunDataAuthorizationActionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.RunDataAuthorizationActionResponse;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackRequest;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackRequestBody;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackResponse;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowCatalogRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowCatalogResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowConnectivityTaskRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowConnectivityTaskResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowDatasourceConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowDatasourceConnectionResponse;
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
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkMetricRequestBody;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkMetricResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowJobResourceRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowJobResourceResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSparkJobLogRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSparkJobLogResponse;
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
import com.huaweicloud.sdk.dli.v1.model.ShowTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowTableResponse;
import com.huaweicloud.sdk.dli.v1.model.StopFlinkJobsRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateDatabaseOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateDatabaseOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateEnhancedConnectionRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarJobRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarJobResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJobStatusReportRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJobStatusReportResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobTemplateRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalVariableRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalVariableRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalVariableResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobAuthInfoRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobResourceOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobResourceOwnerRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobResourceOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateOwnerRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePropertyRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateSparkJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateSparkJobTemplateRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateSparkJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlJobTemplateRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateTableOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateTableOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadFileJobResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadFileJobResourcesResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadJarJobResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadJarJobResourcesResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadJobResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadJobResourcesRequestBody;
import com.huaweicloud.sdk.dli.v1.model.UploadJobResourcesResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadPythonFileJobResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadPythonFileJobResourcesResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadResourcesRequestBody;

import java.util.List;

@SuppressWarnings("unchecked")
public class DliMeta {

    public static final HttpRequestDef<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> associateQueueToElasticResourcePool =
        genForAssociateQueueToElasticResourcePool();

    private static HttpRequestDef<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> genForAssociateQueueToElasticResourcePool() {
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
            f -> f.withMarshaller(AssociateQueueToElasticResourcePoolRequest::getElasticResourcePoolName,
                AssociateQueueToElasticResourcePoolRequest::setElasticResourcePoolName));
        builder.<AssociateQueueToElasticResourcePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateQueueToElasticResourcePoolRequestBody.class),
            f -> f.withMarshaller(AssociateQueueToElasticResourcePoolRequest::getBody,
                AssociateQueueToElasticResourcePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateQueueToEnhancedConnectionRequest, AssociateQueueToEnhancedConnectionResponse> associateQueueToEnhancedConnection =
        genForAssociateQueueToEnhancedConnection();

    private static HttpRequestDef<AssociateQueueToEnhancedConnectionRequest, AssociateQueueToEnhancedConnectionResponse> genForAssociateQueueToEnhancedConnection() {
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
            f -> f.withMarshaller(AssociateQueueToEnhancedConnectionRequest::getConnectionId,
                AssociateQueueToEnhancedConnectionRequest::setConnectionId));
        builder.<AssociateQueueToEnhancedConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateQueueToEnhancedConnectionRequestBody.class),
            f -> f.withMarshaller(AssociateQueueToEnhancedConnectionRequest::getBody,
                AssociateQueueToEnhancedConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> batchDeleteQueuePlans =
        genForBatchDeleteQueuePlans();

    private static HttpRequestDef<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> genForBatchDeleteQueuePlans() {
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
            f -> f.withMarshaller(BatchDeleteQueuePlansRequest::getQueueName,
                BatchDeleteQueuePlansRequest::setQueueName));
        builder.<BatchDeleteQueuePlansRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteQueuePlansRequestBody.class),
            f -> f.withMarshaller(BatchDeleteQueuePlansRequest::getBody, BatchDeleteQueuePlansRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthInfoRequest, CreateAuthInfoResponse> createAuthInfo =
        genForCreateAuthInfo();

    private static HttpRequestDef<CreateAuthInfoRequest, CreateAuthInfoResponse> genForCreateAuthInfo() {
        // basic
        HttpRequestDef.Builder<CreateAuthInfoRequest, CreateAuthInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuthInfoRequest.class, CreateAuthInfoResponse.class)
                .withName("CreateAuthInfo")
                .withUri("/v2.0/{project_id}/datasource/auth-infos")
                .withContentType("application/json");

        // requests
        builder.<CreateAuthInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAuthInfoRequestBody.class),
            f -> f.withMarshaller(CreateAuthInfoRequest::getBody, CreateAuthInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectivityTaskRequest, CreateConnectivityTaskResponse> createConnectivityTask =
        genForCreateConnectivityTask();

    private static HttpRequestDef<CreateConnectivityTaskRequest, CreateConnectivityTaskResponse> genForCreateConnectivityTask() {
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
            f -> f.withMarshaller(CreateConnectivityTaskRequest::getQueueName,
                CreateConnectivityTaskRequest::setQueueName));
        builder.<CreateConnectivityTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConnectivityTaskRequestBody.class),
            f -> f.withMarshaller(CreateConnectivityTaskRequest::getBody, CreateConnectivityTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> createDatasourceConnection =
        genForCreateDatasourceConnection();

    private static HttpRequestDef<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> genForCreateDatasourceConnection() {
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
        builder.<CreateDatasourceConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatasourceConnectionRequestBody.class),
            f -> f.withMarshaller(CreateDatasourceConnectionRequest::getBody,
                CreateDatasourceConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDliAgencyRequest, CreateDliAgencyResponse> createDliAgency =
        genForCreateDliAgency();

    private static HttpRequestDef<CreateDliAgencyRequest, CreateDliAgencyResponse> genForCreateDliAgency() {
        // basic
        HttpRequestDef.Builder<CreateDliAgencyRequest, CreateDliAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDliAgencyRequest.class, CreateDliAgencyResponse.class)
                .withName("CreateDliAgency")
                .withUri("/v2/{project_id}/agency")
                .withContentType("application/json");

        // requests
        builder.<CreateDliAgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDliAgencyRequestBody.class),
            f -> f.withMarshaller(CreateDliAgencyRequest::getBody, CreateDliAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> createElasticResourcePool =
        genForCreateElasticResourcePool();

    private static HttpRequestDef<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> genForCreateElasticResourcePool() {
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
            f -> f.withMarshaller(CreateElasticResourcePoolRequest::getBody,
                CreateElasticResourcePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> createEnhancedConnection =
        genForCreateEnhancedConnection();

    private static HttpRequestDef<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> genForCreateEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateEnhancedConnectionRequest.class, CreateEnhancedConnectionResponse.class)
                .withName("CreateEnhancedConnection")
                .withUri("/v2.0/{project_id}/datasource/enhanced-connections")
                .withContentType("application/json");

        // requests
        builder.<CreateEnhancedConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEnhancedConnectionRequestBody.class),
            f -> f.withMarshaller(CreateEnhancedConnectionRequest::getBody, CreateEnhancedConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse> createEnhancedConnectionRoutes =
        genForCreateEnhancedConnectionRoutes();

    private static HttpRequestDef<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse> genForCreateEnhancedConnectionRoutes() {
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
            f -> f.withMarshaller(CreateEnhancedConnectionRoutesRequest::getConnectionId,
                CreateEnhancedConnectionRoutesRequest::setConnectionId));
        builder.<CreateEnhancedConnectionRoutesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateEnhancedConnectionRoutesRequestBody.class),
            f -> f.withMarshaller(CreateEnhancedConnectionRoutesRequest::getBody,
                CreateEnhancedConnectionRoutesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGlobalVariableRequest, CreateGlobalVariableResponse> createGlobalVariable =
        genForCreateGlobalVariable();

    private static HttpRequestDef<CreateGlobalVariableRequest, CreateGlobalVariableResponse> genForCreateGlobalVariable() {
        // basic
        HttpRequestDef.Builder<CreateGlobalVariableRequest, CreateGlobalVariableResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGlobalVariableRequest.class, CreateGlobalVariableResponse.class)
            .withName("CreateGlobalVariable")
            .withUri("/v1.0/{project_id}/variables")
            .withContentType("application/json");

        // requests
        builder.<CreateGlobalVariableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGlobalVariableRequestBody.class),
            f -> f.withMarshaller(CreateGlobalVariableRequest::getBody, CreateGlobalVariableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobAuthInfoRequest, CreateJobAuthInfoResponse> createJobAuthInfo =
        genForCreateJobAuthInfo();

    private static HttpRequestDef<CreateJobAuthInfoRequest, CreateJobAuthInfoResponse> genForCreateJobAuthInfo() {
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
            f -> f.withMarshaller(CreateJobAuthInfoRequest::getBody, CreateJobAuthInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueueRequest, CreateQueueResponse> createQueue = genForCreateQueue();

    private static HttpRequestDef<CreateQueueRequest, CreateQueueResponse> genForCreateQueue() {
        // basic
        HttpRequestDef.Builder<CreateQueueRequest, CreateQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQueueRequest.class, CreateQueueResponse.class)
                .withName("CreateQueue")
                .withUri("/v1.0/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.<CreateQueueRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateQueueRequestBody.class),
            f -> f.withMarshaller(CreateQueueRequest::getBody, CreateQueueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueuePlanRequest, CreateQueuePlanResponse> createQueuePlan =
        genForCreateQueuePlan();

    private static HttpRequestDef<CreateQueuePlanRequest, CreateQueuePlanResponse> genForCreateQueuePlan() {
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
            f -> f.withMarshaller(CreateQueuePlanRequest::getQueueName, CreateQueuePlanRequest::setQueueName));
        builder.<QueuePlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueuePlanRequestBody.class),
            f -> f.withMarshaller(CreateQueuePlanRequest::getBody, CreateQueuePlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueuePropertyRequest, CreateQueuePropertyResponse> createQueueProperty =
        genForCreateQueueProperty();

    private static HttpRequestDef<CreateQueuePropertyRequest, CreateQueuePropertyResponse> genForCreateQueueProperty() {
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
            f -> f.withMarshaller(CreateQueuePropertyRequest::getQueueName, CreateQueuePropertyRequest::setQueueName));
        builder.<CreateQueuePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateQueuePropertyRequestBody.class),
            f -> f.withMarshaller(CreateQueuePropertyRequest::getBody, CreateQueuePropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRouteToEnhancedConnectionRequest, CreateRouteToEnhancedConnectionResponse> createRouteToEnhancedConnection =
        genForCreateRouteToEnhancedConnection();

    private static HttpRequestDef<CreateRouteToEnhancedConnectionRequest, CreateRouteToEnhancedConnectionResponse> genForCreateRouteToEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<CreateRouteToEnhancedConnectionRequest, CreateRouteToEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRouteToEnhancedConnectionRequest.class,
                    CreateRouteToEnhancedConnectionResponse.class)
                .withName("CreateRouteToEnhancedConnection")
                .withUri("/v3/{project_id}/datasource/enhanced-connections/{connection_id}/routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRouteToEnhancedConnectionRequest::getConnectionId,
                CreateRouteToEnhancedConnectionRequest::setConnectionId));
        builder.<CreateRouteToEnhancedConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRouteToEnhancedConnectionRequestBody.class),
            f -> f.withMarshaller(CreateRouteToEnhancedConnectionRequest::getBody,
                CreateRouteToEnhancedConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuthInfoRequest, DeleteAuthInfoResponse> deleteAuthInfo =
        genForDeleteAuthInfo();

    private static HttpRequestDef<DeleteAuthInfoRequest, DeleteAuthInfoResponse> genForDeleteAuthInfo() {
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
            f -> f.withMarshaller(DeleteAuthInfoRequest::getAuthInfoName, DeleteAuthInfoRequest::setAuthInfoName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> deleteDatasourceConnection =
        genForDeleteDatasourceConnection();

    private static HttpRequestDef<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> genForDeleteDatasourceConnection() {
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
            f -> f.withMarshaller(DeleteDatasourceConnectionRequest::getConnectionId,
                DeleteDatasourceConnectionRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> deleteElasticResourcePool =
        genForDeleteElasticResourcePool();

    private static HttpRequestDef<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> genForDeleteElasticResourcePool() {
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
            f -> f.withMarshaller(DeleteElasticResourcePoolRequest::getElasticResourcePoolName,
                DeleteElasticResourcePoolRequest::setElasticResourcePoolName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> deleteEnhancedConnection =
        genForDeleteEnhancedConnection();

    private static HttpRequestDef<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> genForDeleteEnhancedConnection() {
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
            f -> f.withMarshaller(DeleteEnhancedConnectionRequest::getConnectionId,
                DeleteEnhancedConnectionRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse> deleteEnhancedConnectionRoutes =
        genForDeleteEnhancedConnectionRoutes();

    private static HttpRequestDef<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse> genForDeleteEnhancedConnectionRoutes() {
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
            f -> f.withMarshaller(DeleteEnhancedConnectionRoutesRequest::getConnectionId,
                DeleteEnhancedConnectionRoutesRequest::setConnectionId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnhancedConnectionRoutesRequest::getName,
                DeleteEnhancedConnectionRoutesRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGlobalVariableRequest, DeleteGlobalVariableResponse> deleteGlobalVariable =
        genForDeleteGlobalVariable();

    private static HttpRequestDef<DeleteGlobalVariableRequest, DeleteGlobalVariableResponse> genForDeleteGlobalVariable() {
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
            f -> f.withMarshaller(DeleteGlobalVariableRequest::getVarName, DeleteGlobalVariableRequest::setVarName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobAuthInfoRequest, DeleteJobAuthInfoResponse> deleteJobAuthInfo =
        genForDeleteJobAuthInfo();

    private static HttpRequestDef<DeleteJobAuthInfoRequest, DeleteJobAuthInfoResponse> genForDeleteJobAuthInfo() {
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
            f -> f.withMarshaller(DeleteJobAuthInfoRequest::getAuthInfoName,
                DeleteJobAuthInfoRequest::setAuthInfoName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobResourceRequest, DeleteJobResourceResponse> deleteJobResource =
        genForDeleteJobResource();

    private static HttpRequestDef<DeleteJobResourceRequest, DeleteJobResourceResponse> genForDeleteJobResource() {
        // basic
        HttpRequestDef.Builder<DeleteJobResourceRequest, DeleteJobResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobResourceRequest.class, DeleteJobResourceResponse.class)
                .withName("DeleteJobResource")
                .withUri("/v2.0/{project_id}/resources/{resource_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobResourceRequest::getResourceName,
                DeleteJobResourceRequest::setResourceName));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobResourceRequest::getGroup, DeleteJobResourceRequest::setGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> deleteQueue = genForDeleteQueue();

    private static HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> genForDeleteQueue() {
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
            f -> f.withMarshaller(DeleteQueueRequest::getQueueName, DeleteQueueRequest::setQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueuePlanRequest, DeleteQueuePlanResponse> deleteQueuePlan =
        genForDeleteQueuePlan();

    private static HttpRequestDef<DeleteQueuePlanRequest, DeleteQueuePlanResponse> genForDeleteQueuePlan() {
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
            f -> f.withMarshaller(DeleteQueuePlanRequest::getPlanId, DeleteQueuePlanRequest::setPlanId));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueuePlanRequest::getQueueName, DeleteQueuePlanRequest::setQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueuePropertyRequest, DeleteQueuePropertyResponse> deleteQueueProperty =
        genForDeleteQueueProperty();

    private static HttpRequestDef<DeleteQueuePropertyRequest, DeleteQueuePropertyResponse> genForDeleteQueueProperty() {
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
            f -> f.withMarshaller(DeleteQueuePropertyRequest::getQueueName, DeleteQueuePropertyRequest::setQueueName));
        builder.<DeleteQueuePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteQueuePropertyRequestBody.class),
            f -> f.withMarshaller(DeleteQueuePropertyRequest::getBody, DeleteQueuePropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRouteFromEnhancedConnectionRequest, DeleteRouteFromEnhancedConnectionResponse> deleteRouteFromEnhancedConnection =
        genForDeleteRouteFromEnhancedConnection();

    private static HttpRequestDef<DeleteRouteFromEnhancedConnectionRequest, DeleteRouteFromEnhancedConnectionResponse> genForDeleteRouteFromEnhancedConnection() {
        // basic
        HttpRequestDef.Builder<DeleteRouteFromEnhancedConnectionRequest, DeleteRouteFromEnhancedConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRouteFromEnhancedConnectionRequest.class,
                    DeleteRouteFromEnhancedConnectionResponse.class)
                .withName("DeleteRouteFromEnhancedConnection")
                .withUri("/v3/{project_id}/datasource/enhanced-connections/{connection_id}/routes/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRouteFromEnhancedConnectionRequest::getConnectionId,
                DeleteRouteFromEnhancedConnectionRequest::setConnectionId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRouteFromEnhancedConnectionRequest::getName,
                DeleteRouteFromEnhancedConnectionRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateQueueFromEnhancedConnectionRequest, DisassociateQueueFromEnhancedConnectionResponse> disassociateQueueFromEnhancedConnection =
        genForDisassociateQueueFromEnhancedConnection();

    private static HttpRequestDef<DisassociateQueueFromEnhancedConnectionRequest, DisassociateQueueFromEnhancedConnectionResponse> genForDisassociateQueueFromEnhancedConnection() {
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
            f -> f.withMarshaller(DisassociateQueueFromEnhancedConnectionRequest::getConnectionId,
                DisassociateQueueFromEnhancedConnectionRequest::setConnectionId));
        builder.<DisassociateQueueFromEnhancedConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateQueueFromEnhancedConnectionRequestBody.class),
            f -> f.withMarshaller(DisassociateQueueFromEnhancedConnectionRequest::getBody,
                DisassociateQueueFromEnhancedConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthInfoRequest, ListAuthInfoResponse> listAuthInfo = genForListAuthInfo();

    private static HttpRequestDef<ListAuthInfoRequest, ListAuthInfoResponse> genForListAuthInfo() {
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
            f -> f.withMarshaller(ListAuthInfoRequest::getAuthInfoName, ListAuthInfoRequest::setAuthInfoName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthInfoRequest::getOffset, ListAuthInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthInfoRequest::getLimit, ListAuthInfoRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizationPrivilegesRequest, ListAuthorizationPrivilegesResponse> listAuthorizationPrivileges =
        genForListAuthorizationPrivileges();

    private static HttpRequestDef<ListAuthorizationPrivilegesRequest, ListAuthorizationPrivilegesResponse> genForListAuthorizationPrivileges() {
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
            f -> f.withMarshaller(ListAuthorizationPrivilegesRequest::getObject,
                ListAuthorizationPrivilegesRequest::setObject));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogsRequest, ListCatalogsResponse> listCatalogs = genForListCatalogs();

    private static HttpRequestDef<ListCatalogsRequest, ListCatalogsResponse> genForListCatalogs() {
        // basic
        HttpRequestDef.Builder<ListCatalogsRequest, ListCatalogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCatalogsRequest.class, ListCatalogsResponse.class)
                .withName("ListCatalogs")
                .withUri("/v3/{project_id}/catalogs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogsRequest::getOffset, ListCatalogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogsRequest::getLimit, ListCatalogsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsers =
        genForListDatabaseUsers();

    private static HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> genForListDatabaseUsers() {
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
            f -> f.withMarshaller(ListDatabaseUsersRequest::getDatabaseName,
                ListDatabaseUsersRequest::setDatabaseName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> listDatasourceConnections =
        genForListDatasourceConnections();

    private static HttpRequestDef<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> genForListDatasourceConnections() {
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
            f -> f.withMarshaller(ListDatasourceConnectionsRequest::getTags,
                ListDatasourceConnectionsRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> listElasticResourcePoolQueues =
        genForListElasticResourcePoolQueues();

    private static HttpRequestDef<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> genForListElasticResourcePoolQueues() {
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
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getElasticResourcePoolName,
                ListElasticResourcePoolQueuesRequest::setElasticResourcePoolName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getLimit,
                ListElasticResourcePoolQueuesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getOffset,
                ListElasticResourcePoolQueuesRequest::setOffset));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolQueuesRequest::getQueueName,
                ListElasticResourcePoolQueuesRequest::setQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse> listElasticResourcePoolScaleRecords =
        genForListElasticResourcePoolScaleRecords();

    private static HttpRequestDef<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse> genForListElasticResourcePoolScaleRecords() {
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
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getElasticResourcePoolName,
                ListElasticResourcePoolScaleRecordsRequest::setElasticResourcePoolName));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getStartTime,
                ListElasticResourcePoolScaleRecordsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getEndTime,
                ListElasticResourcePoolScaleRecordsRequest::setEndTime));
        builder.<ListElasticResourcePoolScaleRecordsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListElasticResourcePoolScaleRecordsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getStatus,
                ListElasticResourcePoolScaleRecordsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getOffset,
                ListElasticResourcePoolScaleRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolScaleRecordsRequest::getLimit,
                ListElasticResourcePoolScaleRecordsRequest::setLimit));

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
        genForListElasticResourcePools();

    private static HttpRequestDef<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> genForListElasticResourcePools() {
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
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getLimit,
                ListElasticResourcePoolsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getName, ListElasticResourcePoolsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getOffset,
                ListElasticResourcePoolsRequest::setOffset));
        builder.<ListElasticResourcePoolsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListElasticResourcePoolsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getStatus,
                ListElasticResourcePoolsRequest::setStatus));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElasticResourcePoolsRequest::getTags, ListElasticResourcePoolsRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> listEnhancedConnections =
        genForListEnhancedConnections();

    private static HttpRequestDef<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> genForListEnhancedConnections() {
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
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getLimit, ListEnhancedConnectionsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getName, ListEnhancedConnectionsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getOffset,
                ListEnhancedConnectionsRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getStatus,
                ListEnhancedConnectionsRequest::setStatus));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnhancedConnectionsRequest::getTags, ListEnhancedConnectionsRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalVariablesRequest, ListGlobalVariablesResponse> listGlobalVariables =
        genForListGlobalVariables();

    private static HttpRequestDef<ListGlobalVariablesRequest, ListGlobalVariablesResponse> genForListGlobalVariables() {
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
            f -> f.withMarshaller(ListGlobalVariablesRequest::getLimit, ListGlobalVariablesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGlobalVariablesRequest::getOffset, ListGlobalVariablesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobAuthInfosRequest, ListJobAuthInfosResponse> listJobAuthInfos =
        genForListJobAuthInfos();

    private static HttpRequestDef<ListJobAuthInfosRequest, ListJobAuthInfosResponse> genForListJobAuthInfos() {
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
            f -> f.withMarshaller(ListJobAuthInfosRequest::getAuthInfoName, ListJobAuthInfosRequest::setAuthInfoName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobAuthInfosRequest::getOffset, ListJobAuthInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobAuthInfosRequest::getLimit, ListJobAuthInfosRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobResourcesRequest, ListJobResourcesResponse> listJobResources =
        genForListJobResources();

    private static HttpRequestDef<ListJobResourcesRequest, ListJobResourcesResponse> genForListJobResources() {
        // basic
        HttpRequestDef.Builder<ListJobResourcesRequest, ListJobResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobResourcesRequest.class, ListJobResourcesResponse.class)
                .withName("ListJobResources")
                .withUri("/v2.0/{project_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobResourcesRequest::getKind, ListJobResourcesRequest::setKind));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobResourcesRequest::getTags, ListJobResourcesRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuePlansRequest, ListQueuePlansResponse> listQueuePlans =
        genForListQueuePlans();

    private static HttpRequestDef<ListQueuePlansRequest, ListQueuePlansResponse> genForListQueuePlans() {
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
            f -> f.withMarshaller(ListQueuePlansRequest::getQueueName, ListQueuePlansRequest::setQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuePropertiesRequest, ListQueuePropertiesResponse> listQueueProperties =
        genForListQueueProperties();

    private static HttpRequestDef<ListQueuePropertiesRequest, ListQueuePropertiesResponse> genForListQueueProperties() {
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
            f -> f.withMarshaller(ListQueuePropertiesRequest::getQueueName, ListQueuePropertiesRequest::setQueueName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueuePropertiesRequest::getOffset, ListQueuePropertiesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueuePropertiesRequest::getLimit, ListQueuePropertiesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueueUsersRequest, ListQueueUsersResponse> listQueueUsers =
        genForListQueueUsers();

    private static HttpRequestDef<ListQueueUsersRequest, ListQueueUsersResponse> genForListQueueUsers() {
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
            f -> f.withMarshaller(ListQueueUsersRequest::getQueueName, ListQueueUsersRequest::setQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuesRequest, ListQueuesResponse> listQueues = genForListQueues();

    private static HttpRequestDef<ListQueuesRequest, ListQueuesResponse> genForListQueues() {
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
            f -> f.withMarshaller(ListQueuesRequest::getQueueType, ListQueuesRequest::setQueueType));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuesRequest::getTags, ListQueuesRequest::setTags));
        builder.<Boolean>withRequestField("with-charge-info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListQueuesRequest::getWithChargeInfo, ListQueuesRequest::setWithChargeInfo));
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListQueuesRequest::getWithPriv, ListQueuesRequest::setWithPriv));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablePrivilegesRequest, ListTablePrivilegesResponse> listTablePrivileges =
        genForListTablePrivileges();

    private static HttpRequestDef<ListTablePrivilegesRequest, ListTablePrivilegesResponse> genForListTablePrivileges() {
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
            f -> f.withMarshaller(ListTablePrivilegesRequest::getDatabaseName,
                ListTablePrivilegesRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablePrivilegesRequest::getTableName, ListTablePrivilegesRequest::setTableName));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablePrivilegesRequest::getUserName, ListTablePrivilegesRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTableUsersRequest, ListTableUsersResponse> listTableUsers =
        genForListTableUsers();

    private static HttpRequestDef<ListTableUsersRequest, ListTableUsersResponse> genForListTableUsers() {
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
            f -> f.withMarshaller(ListTableUsersRequest::getDatabaseName, ListTableUsersRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTableUsersRequest::getTableName, ListTableUsersRequest::setTableName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> registerAuthorizedQueue =
        genForRegisterAuthorizedQueue();

    private static HttpRequestDef<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> genForRegisterAuthorizedQueue() {
        // basic
        HttpRequestDef.Builder<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RegisterAuthorizedQueueRequest.class, RegisterAuthorizedQueueResponse.class)
            .withName("RegisterAuthorizedQueue")
            .withUri("/v1.0/{project_id}/queues/user-authorization")
            .withContentType("application/json");

        // requests
        builder.<RegisterAuthorizedQueueRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterAuthorizedQueueRequestBody.class),
            f -> f.withMarshaller(RegisterAuthorizedQueueRequest::getBody, RegisterAuthorizedQueueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunAuthorizationActionRequest, RunAuthorizationActionResponse> runAuthorizationAction =
        genForRunAuthorizationAction();

    private static HttpRequestDef<RunAuthorizationActionRequest, RunAuthorizationActionResponse> genForRunAuthorizationAction() {
        // basic
        HttpRequestDef.Builder<RunAuthorizationActionRequest, RunAuthorizationActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RunAuthorizationActionRequest.class, RunAuthorizationActionResponse.class)
            .withName("RunAuthorizationAction")
            .withUri("/v1.0/{project_id}/authorization")
            .withContentType("application/json");

        // requests
        builder.<RunAuthorizationActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunAuthorizationActionRequestBody.class),
            f -> f.withMarshaller(RunAuthorizationActionRequest::getBody, RunAuthorizationActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCatalogActionRequest, RunCatalogActionResponse> runCatalogAction =
        genForRunCatalogAction();

    private static HttpRequestDef<RunCatalogActionRequest, RunCatalogActionResponse> genForRunCatalogAction() {
        // basic
        HttpRequestDef.Builder<RunCatalogActionRequest, RunCatalogActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunCatalogActionRequest.class, RunCatalogActionResponse.class)
                .withName("RunCatalogAction")
                .withUri("/v3/{project_id}/catalogs/action")
                .withContentType("application/json");

        // requests
        builder.<RunCatalogActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunCatalogActionRequestBody.class),
            f -> f.withMarshaller(RunCatalogActionRequest::getBody, RunCatalogActionRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RunCatalogActionResponse::getBody, RunCatalogActionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<RunDataAuthorizationActionRequest, RunDataAuthorizationActionResponse> runDataAuthorizationAction =
        genForRunDataAuthorizationAction();

    private static HttpRequestDef<RunDataAuthorizationActionRequest, RunDataAuthorizationActionResponse> genForRunDataAuthorizationAction() {
        // basic
        HttpRequestDef.Builder<RunDataAuthorizationActionRequest, RunDataAuthorizationActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    RunDataAuthorizationActionRequest.class,
                    RunDataAuthorizationActionResponse.class)
                .withName("RunDataAuthorizationAction")
                .withUri("/v1.0/{project_id}/user-authorization")
                .withContentType("application/json");

        // requests
        builder.<RunDataAuthorizationActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunDataAuthorizationActionRequestBody.class),
            f -> f.withMarshaller(RunDataAuthorizationActionRequest::getBody,
                RunDataAuthorizationActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueueActionRequest, RunQueueActionResponse> runQueueAction =
        genForRunQueueAction();

    private static HttpRequestDef<RunQueueActionRequest, RunQueueActionResponse> genForRunQueueAction() {
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
            f -> f.withMarshaller(RunQueueActionRequest::getQueueName, RunQueueActionRequest::setQueueName));
        builder.<RunQueueActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunQueueActionRequestBody.class),
            f -> f.withMarshaller(RunQueueActionRequest::getBody, RunQueueActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCatalogRequest, ShowCatalogResponse> showCatalog = genForShowCatalog();

    private static HttpRequestDef<ShowCatalogRequest, ShowCatalogResponse> genForShowCatalog() {
        // basic
        HttpRequestDef.Builder<ShowCatalogRequest, ShowCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCatalogRequest.class, ShowCatalogResponse.class)
                .withName("ShowCatalog")
                .withUri("/v3/{project_id}/catalogs/{catalog_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("catalog_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCatalogRequest::getCatalogName, ShowCatalogRequest::setCatalogName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectivityTaskRequest, ShowConnectivityTaskResponse> showConnectivityTask =
        genForShowConnectivityTask();

    private static HttpRequestDef<ShowConnectivityTaskRequest, ShowConnectivityTaskResponse> genForShowConnectivityTask() {
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
            f -> f.withMarshaller(ShowConnectivityTaskRequest::getQueueName,
                ShowConnectivityTaskRequest::setQueueName));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectivityTaskRequest::getTaskId, ShowConnectivityTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> showDatasourceConnection =
        genForShowDatasourceConnection();

    private static HttpRequestDef<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> genForShowDatasourceConnection() {
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
            f -> f.withMarshaller(ShowDatasourceConnectionRequest::getConnectionId,
                ShowDatasourceConnectionRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDliAgencyRequest, ShowDliAgencyResponse> showDliAgency =
        genForShowDliAgency();

    private static HttpRequestDef<ShowDliAgencyRequest, ShowDliAgencyResponse> genForShowDliAgency() {
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
        genForShowEnhancedConnection();

    private static HttpRequestDef<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> genForShowEnhancedConnection() {
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
            f -> f.withMarshaller(ShowEnhancedConnectionRequest::getConnectionId,
                ShowEnhancedConnectionRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnhancedConnectionPrivilegeRequest, ShowEnhancedConnectionPrivilegeResponse> showEnhancedConnectionPrivilege =
        genForShowEnhancedConnectionPrivilege();

    private static HttpRequestDef<ShowEnhancedConnectionPrivilegeRequest, ShowEnhancedConnectionPrivilegeResponse> genForShowEnhancedConnectionPrivilege() {
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
            f -> f.withMarshaller(ShowEnhancedConnectionPrivilegeRequest::getConnectionId,
                ShowEnhancedConnectionPrivilegeRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobResourceRequest, ShowJobResourceResponse> showJobResource =
        genForShowJobResource();

    private static HttpRequestDef<ShowJobResourceRequest, ShowJobResourceResponse> genForShowJobResource() {
        // basic
        HttpRequestDef.Builder<ShowJobResourceRequest, ShowJobResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobResourceRequest.class, ShowJobResourceResponse.class)
                .withName("ShowJobResource")
                .withUri("/v2.0/{project_id}/resources/{resource_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobResourceRequest::getResourceName, ShowJobResourceRequest::setResourceName));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobResourceRequest::getGroup, ShowJobResourceRequest::setGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueRequest, ShowQueueResponse> showQueue = genForShowQueue();

    private static HttpRequestDef<ShowQueueRequest, ShowQueueResponse> genForShowQueue() {
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
            f -> f.withMarshaller(ShowQueueRequest::getQueueName, ShowQueueRequest::setQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForShowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForShowQuota() {
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

    public static final HttpRequestDef<UpdateAuthInfoRequest, UpdateAuthInfoResponse> updateAuthInfo =
        genForUpdateAuthInfo();

    private static HttpRequestDef<UpdateAuthInfoRequest, UpdateAuthInfoResponse> genForUpdateAuthInfo() {
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
            f -> f.withMarshaller(UpdateAuthInfoRequest::getBody, UpdateAuthInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> updateElasticResourcePool =
        genForUpdateElasticResourcePool();

    private static HttpRequestDef<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> genForUpdateElasticResourcePool() {
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
            f -> f.withMarshaller(UpdateElasticResourcePoolRequest::getElasticResourcePoolName,
                UpdateElasticResourcePoolRequest::setElasticResourcePoolName));
        builder.<UpdateElasticResourcePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateElasticResourcePoolRequestBody.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolRequest::getBody,
                UpdateElasticResourcePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateElasticResourcePoolQueueRequest, UpdateElasticResourcePoolQueueResponse> updateElasticResourcePoolQueue =
        genForUpdateElasticResourcePoolQueue();

    private static HttpRequestDef<UpdateElasticResourcePoolQueueRequest, UpdateElasticResourcePoolQueueResponse> genForUpdateElasticResourcePoolQueue() {
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
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueRequest::getElasticResourcePoolName,
                UpdateElasticResourcePoolQueueRequest::setElasticResourcePoolName));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueRequest::getQueueName,
                UpdateElasticResourcePoolQueueRequest::setQueueName));
        builder.<UpdateElasticResourcePoolQueueRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateElasticResourcePoolQueueRequestBody.class),
            f -> f.withMarshaller(UpdateElasticResourcePoolQueueRequest::getBody,
                UpdateElasticResourcePoolQueueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnhancedConnectionRequest, UpdateEnhancedConnectionResponse> updateEnhancedConnection =
        genForUpdateEnhancedConnection();

    private static HttpRequestDef<UpdateEnhancedConnectionRequest, UpdateEnhancedConnectionResponse> genForUpdateEnhancedConnection() {
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
            f -> f.withMarshaller(UpdateEnhancedConnectionRequest::getConnectionId,
                UpdateEnhancedConnectionRequest::setConnectionId));
        builder.<UpdateEnhancedConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEnhancedConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateEnhancedConnectionRequest::getBody, UpdateEnhancedConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGlobalVariableRequest, UpdateGlobalVariableResponse> updateGlobalVariable =
        genForUpdateGlobalVariable();

    private static HttpRequestDef<UpdateGlobalVariableRequest, UpdateGlobalVariableResponse> genForUpdateGlobalVariable() {
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
            f -> f.withMarshaller(UpdateGlobalVariableRequest::getVarName, UpdateGlobalVariableRequest::setVarName));
        builder.<UpdateGlobalVariableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGlobalVariableRequestBody.class),
            f -> f.withMarshaller(UpdateGlobalVariableRequest::getBody, UpdateGlobalVariableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobAuthInfoRequest, UpdateJobAuthInfoResponse> updateJobAuthInfo =
        genForUpdateJobAuthInfo();

    private static HttpRequestDef<UpdateJobAuthInfoRequest, UpdateJobAuthInfoResponse> genForUpdateJobAuthInfo() {
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
            f -> f.withMarshaller(UpdateJobAuthInfoRequest::getBody, UpdateJobAuthInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobResourceOwnerRequest, UpdateJobResourceOwnerResponse> updateJobResourceOwner =
        genForUpdateJobResourceOwner();

    private static HttpRequestDef<UpdateJobResourceOwnerRequest, UpdateJobResourceOwnerResponse> genForUpdateJobResourceOwner() {
        // basic
        HttpRequestDef.Builder<UpdateJobResourceOwnerRequest, UpdateJobResourceOwnerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateJobResourceOwnerRequest.class, UpdateJobResourceOwnerResponse.class)
            .withName("UpdateJobResourceOwner")
            .withUri("/v2.0/{project_id}/resources/owner")
            .withContentType("application/json");

        // requests
        builder.<UpdateJobResourceOwnerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateJobResourceOwnerRequestBody.class),
            f -> f.withMarshaller(UpdateJobResourceOwnerRequest::getBody, UpdateJobResourceOwnerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateQueueCidrRequest, UpdateQueueCidrResponse> updateQueueCidr =
        genForUpdateQueueCidr();

    private static HttpRequestDef<UpdateQueueCidrRequest, UpdateQueueCidrResponse> genForUpdateQueueCidr() {
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
            f -> f.withMarshaller(UpdateQueueCidrRequest::getQueueName, UpdateQueueCidrRequest::setQueueName));
        builder.<UpdateQueueCidrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateQueueCidrRequestBody.class),
            f -> f.withMarshaller(UpdateQueueCidrRequest::getBody, UpdateQueueCidrRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateQueuePlanRequest, UpdateQueuePlanResponse> updateQueuePlan =
        genForUpdateQueuePlan();

    private static HttpRequestDef<UpdateQueuePlanRequest, UpdateQueuePlanResponse> genForUpdateQueuePlan() {
        // basic
        HttpRequestDef.Builder<UpdateQueuePlanRequest, UpdateQueuePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateQueuePlanRequest.class, UpdateQueuePlanResponse.class)
                .withName("UpdateQueuePlan")
                .withUri("/v1/{project_id}/queues/{queue_name}/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateQueuePlanRequest::getPlanId, UpdateQueuePlanRequest::setPlanId));
        builder.<String>withRequestField("queue_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateQueuePlanRequest::getQueueName, UpdateQueuePlanRequest::setQueueName));
        builder.<QueuePlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueuePlanRequestBody.class),
            f -> f.withMarshaller(UpdateQueuePlanRequest::getBody, UpdateQueuePlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateQueuePropertyRequest, UpdateQueuePropertyResponse> updateQueueProperty =
        genForUpdateQueueProperty();

    private static HttpRequestDef<UpdateQueuePropertyRequest, UpdateQueuePropertyResponse> genForUpdateQueueProperty() {
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
            f -> f.withMarshaller(UpdateQueuePropertyRequest::getQueueName, UpdateQueuePropertyRequest::setQueueName));
        builder.<UpdateQueuePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateQueuePropertyRequestBody.class),
            f -> f.withMarshaller(UpdateQueuePropertyRequest::getBody, UpdateQueuePropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFileJobResourcesRequest, UploadFileJobResourcesResponse> uploadFileJobResources =
        genForUploadFileJobResources();

    private static HttpRequestDef<UploadFileJobResourcesRequest, UploadFileJobResourcesResponse> genForUploadFileJobResources() {
        // basic
        HttpRequestDef.Builder<UploadFileJobResourcesRequest, UploadFileJobResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UploadFileJobResourcesRequest.class, UploadFileJobResourcesResponse.class)
            .withName("UploadFileJobResources")
            .withUri("/v2.0/{project_id}/resources/files")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadFileJobResourcesRequest::getUserId, UploadFileJobResourcesRequest::setUserId));
        builder.<UploadResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadResourcesRequestBody.class),
            f -> f.withMarshaller(UploadFileJobResourcesRequest::getBody, UploadFileJobResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJarJobResourcesRequest, UploadJarJobResourcesResponse> uploadJarJobResources =
        genForUploadJarJobResources();

    private static HttpRequestDef<UploadJarJobResourcesRequest, UploadJarJobResourcesResponse> genForUploadJarJobResources() {
        // basic
        HttpRequestDef.Builder<UploadJarJobResourcesRequest, UploadJarJobResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UploadJarJobResourcesRequest.class, UploadJarJobResourcesResponse.class)
            .withName("UploadJarJobResources")
            .withUri("/v2.0/{project_id}/resources/jars")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadJarJobResourcesRequest::getUserId, UploadJarJobResourcesRequest::setUserId));
        builder.<UploadResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadResourcesRequestBody.class),
            f -> f.withMarshaller(UploadJarJobResourcesRequest::getBody, UploadJarJobResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJobResourcesRequest, UploadJobResourcesResponse> uploadJobResources =
        genForUploadJobResources();

    private static HttpRequestDef<UploadJobResourcesRequest, UploadJobResourcesResponse> genForUploadJobResources() {
        // basic
        HttpRequestDef.Builder<UploadJobResourcesRequest, UploadJobResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadJobResourcesRequest.class, UploadJobResourcesResponse.class)
                .withName("UploadJobResources")
                .withUri("/v2.0/{project_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadJobResourcesRequest::getUserId, UploadJobResourcesRequest::setUserId));
        builder.<UploadJobResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadJobResourcesRequestBody.class),
            f -> f.withMarshaller(UploadJobResourcesRequest::getBody, UploadJobResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadPythonFileJobResourcesRequest, UploadPythonFileJobResourcesResponse> uploadPythonFileJobResources =
        genForUploadPythonFileJobResources();

    private static HttpRequestDef<UploadPythonFileJobResourcesRequest, UploadPythonFileJobResourcesResponse> genForUploadPythonFileJobResources() {
        // basic
        HttpRequestDef.Builder<UploadPythonFileJobResourcesRequest, UploadPythonFileJobResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UploadPythonFileJobResourcesRequest.class,
                    UploadPythonFileJobResourcesResponse.class)
                .withName("UploadPythonFileJobResources")
                .withUri("/v2.0/{project_id}/resources/pyfiles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("USER-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadPythonFileJobResourcesRequest::getUserId,
                UploadPythonFileJobResourcesRequest::setUserId));
        builder.<UploadResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadResourcesRequestBody.class),
            f -> f.withMarshaller(UploadPythonFileJobResourcesRequest::getBody,
                UploadPythonFileJobResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse> batchDeleteFlinkJobs =
        genForBatchDeleteFlinkJobs();

    private static HttpRequestDef<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse> genForBatchDeleteFlinkJobs() {
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
            f -> f.withMarshaller(BatchDeleteFlinkJobsRequest::getBody, BatchDeleteFlinkJobsRequest::setBody));

        // response
        builder.<List<FlinkSuccessResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteFlinkJobsResponse::getBody, BatchDeleteFlinkJobsResponse::setBody)
                .withInnerContainerType(FlinkSuccessResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse> batchRunFlinkJobs =
        genForBatchRunFlinkJobs();

    private static HttpRequestDef<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse> genForBatchRunFlinkJobs() {
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
            f -> f.withMarshaller(BatchRunFlinkJobsRequest::getBody, BatchRunFlinkJobsRequest::setBody));

        // response
        builder.<List<FlinkSuccessResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchRunFlinkJobsResponse::getBody, BatchRunFlinkJobsResponse::setBody)
                .withInnerContainerType(FlinkSuccessResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopFlinkJobsRequest, BatchStopFlinkJobsResponse> batchStopFlinkJobs =
        genForBatchStopFlinkJobs();

    private static HttpRequestDef<BatchStopFlinkJobsRequest, BatchStopFlinkJobsResponse> genForBatchStopFlinkJobs() {
        // basic
        HttpRequestDef.Builder<BatchStopFlinkJobsRequest, BatchStopFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopFlinkJobsRequest.class, BatchStopFlinkJobsResponse.class)
                .withName("BatchStopFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs/stop")
                .withContentType("application/json");

        // requests
        builder.<StopFlinkJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopFlinkJobsRequestBody.class),
            f -> f.withMarshaller(BatchStopFlinkJobsRequest::getBody, BatchStopFlinkJobsRequest::setBody));

        // response
        builder.<List<FlinkSuccessResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchStopFlinkJobsResponse::getBody, BatchStopFlinkJobsResponse::setBody)
                .withInnerContainerType(FlinkSuccessResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse> createFlinkJarJob =
        genForCreateFlinkJarJob();

    private static HttpRequestDef<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse> genForCreateFlinkJarJob() {
        // basic
        HttpRequestDef.Builder<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlinkJarJobRequest.class, CreateFlinkJarJobResponse.class)
                .withName("CreateFlinkJarJob")
                .withUri("/v1.0/{project_id}/streaming/flink-jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateFlinkJarJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkJarJobRequestBody.class),
            f -> f.withMarshaller(CreateFlinkJarJobRequest::getBody, CreateFlinkJarJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse> createFlinkSqlJob =
        genForCreateFlinkSqlJob();

    private static HttpRequestDef<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse> genForCreateFlinkSqlJob() {
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
            f -> f.withMarshaller(CreateFlinkSqlJobRequest::getBody, CreateFlinkSqlJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSqlJobGraphRequest, CreateFlinkSqlJobGraphResponse> createFlinkSqlJobGraph =
        genForCreateFlinkSqlJobGraph();

    private static HttpRequestDef<CreateFlinkSqlJobGraphRequest, CreateFlinkSqlJobGraphResponse> genForCreateFlinkSqlJobGraph() {
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
            f -> f.withMarshaller(CreateFlinkSqlJobGraphRequest::getJobId, CreateFlinkSqlJobGraphRequest::setJobId));
        builder.<CreateFlinkSqlJobGraphRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkSqlJobGraphRequestBody.class),
            f -> f.withMarshaller(CreateFlinkSqlJobGraphRequest::getBody, CreateFlinkSqlJobGraphRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSqlJobTemplateRequest, CreateFlinkSqlJobTemplateResponse> createFlinkSqlJobTemplate =
        genForCreateFlinkSqlJobTemplate();

    private static HttpRequestDef<CreateFlinkSqlJobTemplateRequest, CreateFlinkSqlJobTemplateResponse> genForCreateFlinkSqlJobTemplate() {
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
        builder.<CreateFlinkSqlJobTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkSqlJobTemplateRequestBody.class),
            f -> f.withMarshaller(CreateFlinkSqlJobTemplateRequest::getBody,
                CreateFlinkSqlJobTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> createIefMessageChannel =
        genForCreateIefMessageChannel();

    private static HttpRequestDef<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> genForCreateIefMessageChannel() {
        // basic
        HttpRequestDef.Builder<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateIefMessageChannelRequest.class, CreateIefMessageChannelResponse.class)
            .withName("CreateIefMessageChannel")
            .withUri("/v1/{project_id}/edgesrv/message-channel")
            .withContentType("application/json");

        // requests
        builder.<CreateIefMessageChannelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIefMessageChannelRequestBody.class),
            f -> f.withMarshaller(CreateIefMessageChannelRequest::getBody, CreateIefMessageChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> createIefSystemEvents =
        genForCreateIefSystemEvents();

    private static HttpRequestDef<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> genForCreateIefSystemEvents() {
        // basic
        HttpRequestDef.Builder<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateIefSystemEventsRequest.class, CreateIefSystemEventsResponse.class)
            .withName("CreateIefSystemEvents")
            .withUri("/v1/{project_id}/edgesrv/system-events")
            .withContentType("application/json");

        // requests
        builder.<CreateIefSystemEventsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIefSystemEventsRequestBody.class),
            f -> f.withMarshaller(CreateIefSystemEventsRequest::getBody, CreateIefSystemEventsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlinkJobRequest, DeleteFlinkJobResponse> deleteFlinkJob =
        genForDeleteFlinkJob();

    private static HttpRequestDef<DeleteFlinkJobRequest, DeleteFlinkJobResponse> genForDeleteFlinkJob() {
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
            f -> f.withMarshaller(DeleteFlinkJobRequest::getJobId, DeleteFlinkJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlinkSqlJobTemplateRequest, DeleteFlinkSqlJobTemplateResponse> deleteFlinkSqlJobTemplate =
        genForDeleteFlinkSqlJobTemplate();

    private static HttpRequestDef<DeleteFlinkSqlJobTemplateRequest, DeleteFlinkSqlJobTemplateResponse> genForDeleteFlinkSqlJobTemplate() {
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
            f -> f.withMarshaller(DeleteFlinkSqlJobTemplateRequest::getTemplateId,
                DeleteFlinkSqlJobTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteFlinkJobSavepointRequest, ExecuteFlinkJobSavepointResponse> executeFlinkJobSavepoint =
        genForExecuteFlinkJobSavepoint();

    private static HttpRequestDef<ExecuteFlinkJobSavepointRequest, ExecuteFlinkJobSavepointResponse> genForExecuteFlinkJobSavepoint() {
        // basic
        HttpRequestDef.Builder<ExecuteFlinkJobSavepointRequest, ExecuteFlinkJobSavepointResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExecuteFlinkJobSavepointRequest.class, ExecuteFlinkJobSavepointResponse.class)
                .withName("ExecuteFlinkJobSavepoint")
                .withUri("/v1.0/{project_id}/streaming/jobs/{job_id}/savepoint")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteFlinkJobSavepointRequest::getJobId,
                ExecuteFlinkJobSavepointRequest::setJobId));
        builder.<ExecuteFlinkJobSavepointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteFlinkJobSavepointRequestBody.class),
            f -> f.withMarshaller(ExecuteFlinkJobSavepointRequest::getBody, ExecuteFlinkJobSavepointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportFlinkJobsRequest, ExportFlinkJobsResponse> exportFlinkJobs =
        genForExportFlinkJobs();

    private static HttpRequestDef<ExportFlinkJobsRequest, ExportFlinkJobsResponse> genForExportFlinkJobs() {
        // basic
        HttpRequestDef.Builder<ExportFlinkJobsRequest, ExportFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportFlinkJobsRequest.class, ExportFlinkJobsResponse.class)
                .withName("ExportFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs/export")
                .withContentType("application/json");

        // requests
        builder.<ExportFlinkJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportFlinkJobsRequestBody.class),
            f -> f.withMarshaller(ExportFlinkJobsRequest::getBody, ExportFlinkJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportFlinkJobSavepointRequest, ImportFlinkJobSavepointResponse> importFlinkJobSavepoint =
        genForImportFlinkJobSavepoint();

    private static HttpRequestDef<ImportFlinkJobSavepointRequest, ImportFlinkJobSavepointResponse> genForImportFlinkJobSavepoint() {
        // basic
        HttpRequestDef.Builder<ImportFlinkJobSavepointRequest, ImportFlinkJobSavepointResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ImportFlinkJobSavepointRequest.class, ImportFlinkJobSavepointResponse.class)
            .withName("ImportFlinkJobSavepoint")
            .withUri("/v1.0/{project_id}/streaming/jobs/{job_id}/import-savepoint")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportFlinkJobSavepointRequest::getJobId, ImportFlinkJobSavepointRequest::setJobId));
        builder.<ImportFlinkJobSavepointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportFlinkJobSavepointRequestBody.class),
            f -> f.withMarshaller(ImportFlinkJobSavepointRequest::getBody, ImportFlinkJobSavepointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportFlinkJobsRequest, ImportFlinkJobsResponse> importFlinkJobs =
        genForImportFlinkJobs();

    private static HttpRequestDef<ImportFlinkJobsRequest, ImportFlinkJobsResponse> genForImportFlinkJobs() {
        // basic
        HttpRequestDef.Builder<ImportFlinkJobsRequest, ImportFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportFlinkJobsRequest.class, ImportFlinkJobsResponse.class)
                .withName("ImportFlinkJobs")
                .withUri("/v1.0/{project_id}/streaming/jobs/import")
                .withContentType("application/json");

        // requests
        builder.<ImportFlinkJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportFlinkJobsRequestBody.class),
            f -> f.withMarshaller(ImportFlinkJobsRequest::getBody, ImportFlinkJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobs =
        genForListFlinkJobs();

    private static HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> genForListFlinkJobs() {
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
            f -> f.withMarshaller(ListFlinkJobsRequest::getJobType, ListFlinkJobsRequest::setJobType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getLimit, ListFlinkJobsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getName, ListFlinkJobsRequest::setName));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getOffset, ListFlinkJobsRequest::setOffset));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getOrder, ListFlinkJobsRequest::setOrder));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getQueueName, ListFlinkJobsRequest::setQueueName));
        builder.<Long>withRequestField("root_job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getRootJobId, ListFlinkJobsRequest::setRootJobId));
        builder.<Boolean>withRequestField("show_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getShowDetail, ListFlinkJobsRequest::setShowDetail));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getStatus, ListFlinkJobsRequest::setStatus));
        builder.<String>withRequestField("sys_enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getSysEnterpriseProjectName,
                ListFlinkJobsRequest::setSysEnterpriseProjectName));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getTags, ListFlinkJobsRequest::setTags));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getUserName, ListFlinkJobsRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkSqlJobTemplatesRequest, ListFlinkSqlJobTemplatesResponse> listFlinkSqlJobTemplates =
        genForListFlinkSqlJobTemplates();

    private static HttpRequestDef<ListFlinkSqlJobTemplatesRequest, ListFlinkSqlJobTemplatesResponse> genForListFlinkSqlJobTemplates() {
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
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getLimit,
                ListFlinkSqlJobTemplatesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getName, ListFlinkSqlJobTemplatesRequest::setName));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getOffset,
                ListFlinkSqlJobTemplatesRequest::setOffset));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getOrder,
                ListFlinkSqlJobTemplatesRequest::setOrder));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSqlJobTemplatesRequest::getTags, ListFlinkSqlJobTemplatesRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterBucketRequest, RegisterBucketResponse> registerBucket =
        genForRegisterBucket();

    private static HttpRequestDef<RegisterBucketRequest, RegisterBucketResponse> genForRegisterBucket() {
        // basic
        HttpRequestDef.Builder<RegisterBucketRequest, RegisterBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterBucketRequest.class, RegisterBucketResponse.class)
                .withName("RegisterBucket")
                .withUri("/v1.0/{project_id}/dli/obs-authorize")
                .withContentType("application/json");

        // requests
        builder.<RegisterBucketRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterBucketRequestBody.class),
            f -> f.withMarshaller(RegisterBucketRequest::getBody, RegisterBucketRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> runIefJobActionCallBack =
        genForRunIefJobActionCallBack();

    private static HttpRequestDef<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> genForRunIefJobActionCallBack() {
        // basic
        HttpRequestDef.Builder<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunIefJobActionCallBackRequest.class, RunIefJobActionCallBackResponse.class)
            .withName("RunIefJobActionCallBack")
            .withUri("/v1/{project_id}/edgesrv/messages")
            .withContentType("application/json");

        // requests
        builder.<RunIefJobActionCallBackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunIefJobActionCallBackRequestBody.class),
            f -> f.withMarshaller(RunIefJobActionCallBackRequest::getBody, RunIefJobActionCallBackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJob = genForShowFlinkJob();

    private static HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> genForShowFlinkJob() {
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
            f -> f.withMarshaller(ShowFlinkJobRequest::getJobId, ShowFlinkJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobExecutionGraphRequest, ShowFlinkJobExecutionGraphResponse> showFlinkJobExecutionGraph =
        genForShowFlinkJobExecutionGraph();

    private static HttpRequestDef<ShowFlinkJobExecutionGraphRequest, ShowFlinkJobExecutionGraphResponse> genForShowFlinkJobExecutionGraph() {
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
            f -> f.withMarshaller(ShowFlinkJobExecutionGraphRequest::getJobId,
                ShowFlinkJobExecutionGraphRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkMetricRequest, ShowFlinkMetricResponse> showFlinkMetric =
        genForShowFlinkMetric();

    private static HttpRequestDef<ShowFlinkMetricRequest, ShowFlinkMetricResponse> genForShowFlinkMetric() {
        // basic
        HttpRequestDef.Builder<ShowFlinkMetricRequest, ShowFlinkMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFlinkMetricRequest.class, ShowFlinkMetricResponse.class)
                .withName("ShowFlinkMetric")
                .withUri("/v1.0/{project_id}/streaming/jobs/metrics")
                .withContentType("application/json");

        // requests
        builder.<ShowFlinkMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowFlinkMetricRequestBody.class),
            f -> f.withMarshaller(ShowFlinkMetricRequest::getBody, ShowFlinkMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkJarJobRequest, UpdateFlinkJarJobResponse> updateFlinkJarJob =
        genForUpdateFlinkJarJob();

    private static HttpRequestDef<UpdateFlinkJarJobRequest, UpdateFlinkJarJobResponse> genForUpdateFlinkJarJob() {
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
            f -> f.withMarshaller(UpdateFlinkJarJobRequest::getJobId, UpdateFlinkJarJobRequest::setJobId));
        builder.<UpdateFlinkJarJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkJarJobRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkJarJobRequest::getBody, UpdateFlinkJarJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkJobStatusReportRequest, UpdateFlinkJobStatusReportResponse> updateFlinkJobStatusReport =
        genForUpdateFlinkJobStatusReport();

    private static HttpRequestDef<UpdateFlinkJobStatusReportRequest, UpdateFlinkJobStatusReportResponse> genForUpdateFlinkJobStatusReport() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkJobStatusReportRequest, UpdateFlinkJobStatusReportResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateFlinkJobStatusReportRequest.class,
                    UpdateFlinkJobStatusReportResponse.class)
                .withName("UpdateFlinkJobStatusReport")
                .withUri("/v1/{project_id}/edgesrv/job-report")
                .withContentType("application/json");

        // requests
        builder.<ChangeFlinkJobStatusReportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeFlinkJobStatusReportRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkJobStatusReportRequest::getBody,
                UpdateFlinkJobStatusReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkSqlJobRequest, UpdateFlinkSqlJobResponse> updateFlinkSqlJob =
        genForUpdateFlinkSqlJob();

    private static HttpRequestDef<UpdateFlinkSqlJobRequest, UpdateFlinkSqlJobResponse> genForUpdateFlinkSqlJob() {
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
            f -> f.withMarshaller(UpdateFlinkSqlJobRequest::getJobId, UpdateFlinkSqlJobRequest::setJobId));
        builder.<UpdateFlinkSqlJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkSqlJobRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkSqlJobRequest::getBody, UpdateFlinkSqlJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkSqlJobTemplateRequest, UpdateFlinkSqlJobTemplateResponse> updateFlinkSqlJobTemplate =
        genForUpdateFlinkSqlJobTemplate();

    private static HttpRequestDef<UpdateFlinkSqlJobTemplateRequest, UpdateFlinkSqlJobTemplateResponse> genForUpdateFlinkSqlJobTemplate() {
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
            f -> f.withMarshaller(UpdateFlinkSqlJobTemplateRequest::getTemplateId,
                UpdateFlinkSqlJobTemplateRequest::setTemplateId));
        builder.<UpdateFlinkSqlJobTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkSqlJobTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkSqlJobTemplateRequest::getBody,
                UpdateFlinkSqlJobTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSparkJobRequest, CancelSparkJobResponse> cancelSparkJob =
        genForCancelSparkJob();

    private static HttpRequestDef<CancelSparkJobRequest, CancelSparkJobResponse> genForCancelSparkJob() {
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
            f -> f.withMarshaller(CancelSparkJobRequest::getBatchId, CancelSparkJobRequest::setBatchId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSparkJobRequest, CreateSparkJobResponse> createSparkJob =
        genForCreateSparkJob();

    private static HttpRequestDef<CreateSparkJobRequest, CreateSparkJobResponse> genForCreateSparkJob() {
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
            f -> f.withMarshaller(CreateSparkJobRequest::getUserId, CreateSparkJobRequest::setUserId));
        builder.<CreateSparkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSparkJobRequestBody.class),
            f -> f.withMarshaller(CreateSparkJobRequest::getBody, CreateSparkJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse> createSparkJobTemplate =
        genForCreateSparkJobTemplate();

    private static HttpRequestDef<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse> genForCreateSparkJobTemplate() {
        // basic
        HttpRequestDef.Builder<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSparkJobTemplateRequest.class, CreateSparkJobTemplateResponse.class)
            .withName("CreateSparkJobTemplate")
            .withUri("/v3/{project_id}/templates")
            .withContentType("application/json");

        // requests
        builder.<CreateSparkJobTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSparkJobTemplateRequestBody.class),
            f -> f.withMarshaller(CreateSparkJobTemplateRequest::getBody, CreateSparkJobTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSparkJobTemplatesRequest, ListSparkJobTemplatesResponse> listSparkJobTemplates =
        genForListSparkJobTemplates();

    private static HttpRequestDef<ListSparkJobTemplatesRequest, ListSparkJobTemplatesResponse> genForListSparkJobTemplates() {
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
            f -> f.withMarshaller(ListSparkJobTemplatesRequest::getType, ListSparkJobTemplatesRequest::setType));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobTemplatesRequest::getKeyword, ListSparkJobTemplatesRequest::setKeyword));
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobTemplatesRequest::getPageSize,
                ListSparkJobTemplatesRequest::setPageSize));
        builder.<Integer>withRequestField("current-page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobTemplatesRequest::getCurrentPage,
                ListSparkJobTemplatesRequest::setCurrentPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSparkJobsRequest, ListSparkJobsResponse> listSparkJobs =
        genForListSparkJobs();

    private static HttpRequestDef<ListSparkJobsRequest, ListSparkJobsResponse> genForListSparkJobs() {
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
            f -> f.withMarshaller(ListSparkJobsRequest::getClusterName, ListSparkJobsRequest::setClusterName));
        builder.<Long>withRequestField("end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getEnd, ListSparkJobsRequest::setEnd));
        builder.<Integer>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getFrom, ListSparkJobsRequest::setFrom));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getJobName, ListSparkJobsRequest::setJobName));
        builder.<String>withRequestField("job-id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getJobId, ListSparkJobsRequest::setJobId));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getOrder, ListSparkJobsRequest::setOrder));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getQueueName, ListSparkJobsRequest::setQueueName));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getSize, ListSparkJobsRequest::setSize));
        builder.<Long>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getStart, ListSparkJobsRequest::setStart));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getState, ListSparkJobsRequest::setState));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobRequest, ShowSparkJobResponse> showSparkJob = genForShowSparkJob();

    private static HttpRequestDef<ShowSparkJobRequest, ShowSparkJobResponse> genForShowSparkJob() {
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
            f -> f.withMarshaller(ShowSparkJobRequest::getBatchId, ShowSparkJobRequest::setBatchId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobLogRequest, ShowSparkJobLogResponse> showSparkJobLog =
        genForShowSparkJobLog();

    private static HttpRequestDef<ShowSparkJobLogRequest, ShowSparkJobLogResponse> genForShowSparkJobLog() {
        // basic
        HttpRequestDef.Builder<ShowSparkJobLogRequest, ShowSparkJobLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkJobLogRequest.class, ShowSparkJobLogResponse.class)
                .withName("ShowSparkJobLog")
                .withUri("/v2.0/{project_id}/batches/{batch_id}/log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobLogRequest::getBatchId, ShowSparkJobLogRequest::setBatchId));
        builder.<Integer>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSparkJobLogRequest::getFrom, ShowSparkJobLogRequest::setFrom));
        builder.<Integer>withRequestField("index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSparkJobLogRequest::getIndex, ShowSparkJobLogRequest::setIndex));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSparkJobLogRequest::getSize, ShowSparkJobLogRequest::setSize));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobLogRequest::getType, ShowSparkJobLogRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobStatusRequest, ShowSparkJobStatusResponse> showSparkJobStatus =
        genForShowSparkJobStatus();

    private static HttpRequestDef<ShowSparkJobStatusRequest, ShowSparkJobStatusResponse> genForShowSparkJobStatus() {
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
            f -> f.withMarshaller(ShowSparkJobStatusRequest::getBatchId, ShowSparkJobStatusRequest::setBatchId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobTemplateRequest, ShowSparkJobTemplateResponse> showSparkJobTemplate =
        genForShowSparkJobTemplate();

    private static HttpRequestDef<ShowSparkJobTemplateRequest, ShowSparkJobTemplateResponse> genForShowSparkJobTemplate() {
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
            f -> f.withMarshaller(ShowSparkJobTemplateRequest::getTemplateId,
                ShowSparkJobTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSparkJobTemplateRequest, UpdateSparkJobTemplateResponse> updateSparkJobTemplate =
        genForUpdateSparkJobTemplate();

    private static HttpRequestDef<UpdateSparkJobTemplateRequest, UpdateSparkJobTemplateResponse> genForUpdateSparkJobTemplate() {
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
            f -> f.withMarshaller(UpdateSparkJobTemplateRequest::getTemplateId,
                UpdateSparkJobTemplateRequest::setTemplateId));
        builder.<UpdateSparkJobTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSparkJobTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateSparkJobTemplateRequest::getBody, UpdateSparkJobTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSqlJobTemplatesRequest, BatchDeleteSqlJobTemplatesResponse> batchDeleteSqlJobTemplates =
        genForBatchDeleteSqlJobTemplates();

    private static HttpRequestDef<BatchDeleteSqlJobTemplatesRequest, BatchDeleteSqlJobTemplatesResponse> genForBatchDeleteSqlJobTemplates() {
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
        builder.<BatchDeleteSqlJobTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteSqlJobTemplatesRequestBody.class),
            f -> f.withMarshaller(BatchDeleteSqlJobTemplatesRequest::getBody,
                BatchDeleteSqlJobTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSqlJobRequest, CancelSqlJobResponse> cancelSqlJob = genForCancelSqlJob();

    private static HttpRequestDef<CancelSqlJobRequest, CancelSqlJobResponse> genForCancelSqlJob() {
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
            f -> f.withMarshaller(CancelSqlJobRequest::getJobId, CancelSqlJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckSqlRequest, CheckSqlResponse> checkSql = genForCheckSql();

    private static HttpRequestDef<CheckSqlRequest, CheckSqlResponse> genForCheckSql() {
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
            f -> f.withMarshaller(CheckSqlRequest::getBody, CheckSqlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlJobRequest, CreateSqlJobResponse> createSqlJob = genForCreateSqlJob();

    private static HttpRequestDef<CreateSqlJobRequest, CreateSqlJobResponse> genForCreateSqlJob() {
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
            f -> f.withMarshaller(CreateSqlJobRequest::getBody, CreateSqlJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse> createSqlJobTemplate =
        genForCreateSqlJobTemplate();

    private static HttpRequestDef<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse> genForCreateSqlJobTemplate() {
        // basic
        HttpRequestDef.Builder<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSqlJobTemplateRequest.class, CreateSqlJobTemplateResponse.class)
            .withName("CreateSqlJobTemplate")
            .withUri("/v1.0/{project_id}/sqls")
            .withContentType("application/json");

        // requests
        builder.<CreateSqlJobTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlJobTemplateRequestBody.class),
            f -> f.withMarshaller(CreateSqlJobTemplateRequest::getBody, CreateSqlJobTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSqlJobResultRequest, ExportSqlJobResultResponse> exportSqlJobResult =
        genForExportSqlJobResult();

    private static HttpRequestDef<ExportSqlJobResultRequest, ExportSqlJobResultResponse> genForExportSqlJobResult() {
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
            f -> f.withMarshaller(ExportSqlJobResultRequest::getJobId, ExportSqlJobResultRequest::setJobId));
        builder.<ExportSqlJobResultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportSqlJobResultRequestBody.class),
            f -> f.withMarshaller(ExportSqlJobResultRequest::getBody, ExportSqlJobResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlJobTemplatesRequest, ListSqlJobTemplatesResponse> listSqlJobTemplates =
        genForListSqlJobTemplates();

    private static HttpRequestDef<ListSqlJobTemplatesRequest, ListSqlJobTemplatesResponse> genForListSqlJobTemplates() {
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
            f -> f.withMarshaller(ListSqlJobTemplatesRequest::getKeyword, ListSqlJobTemplatesRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlJobsRequest, ListSqlJobsResponse> listSqlJobs = genForListSqlJobs();

    private static HttpRequestDef<ListSqlJobsRequest, ListSqlJobsResponse> genForListSqlJobs() {
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
            f -> f.withMarshaller(ListSqlJobsRequest::getCurrentPage, ListSqlJobsRequest::setCurrentPage));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getDbName, ListSqlJobsRequest::setDbName));
        builder.<Long>withRequestField("end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getEnd, ListSqlJobsRequest::setEnd));
        builder.<String>withRequestField("engine-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getEngineType, ListSqlJobsRequest::setEngineType));
        builder.<String>withRequestField("job-status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getJobStatus, ListSqlJobsRequest::setJobStatus));
        builder.<ListSqlJobsRequest.JobTypeEnum>withRequestField("job-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSqlJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getJobType, ListSqlJobsRequest::setJobType));
        builder.<ListSqlJobsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSqlJobsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getOrder, ListSqlJobsRequest::setOrder));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getOwner, ListSqlJobsRequest::setOwner));
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getPageSize, ListSqlJobsRequest::setPageSize));
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getQueueName, ListSqlJobsRequest::setQueueName));
        builder.<String>withRequestField("sql_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getSqlPattern, ListSqlJobsRequest::setSqlPattern));
        builder.<Long>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getStart, ListSqlJobsRequest::setStart));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getTableName, ListSqlJobsRequest::setTableName));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlJobsRequest::getTags, ListSqlJobsRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PreviewSqlJobResultRequest, PreviewSqlJobResultResponse> previewSqlJobResult =
        genForPreviewSqlJobResult();

    private static HttpRequestDef<PreviewSqlJobResultRequest, PreviewSqlJobResultResponse> genForPreviewSqlJobResult() {
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
            f -> f.withMarshaller(PreviewSqlJobResultRequest::getJobId, PreviewSqlJobResultRequest::setJobId));
        builder.<String>withRequestField("queue-name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewSqlJobResultRequest::getQueueName, PreviewSqlJobResultRequest::setQueueName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse> showSqlJobDetail =
        genForShowSqlJobDetail();

    private static HttpRequestDef<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse> genForShowSqlJobDetail() {
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
            f -> f.withMarshaller(ShowSqlJobDetailRequest::getJobId, ShowSqlJobDetailRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlJobProgressRequest, ShowSqlJobProgressResponse> showSqlJobProgress =
        genForShowSqlJobProgress();

    private static HttpRequestDef<ShowSqlJobProgressRequest, ShowSqlJobProgressResponse> genForShowSqlJobProgress() {
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
            f -> f.withMarshaller(ShowSqlJobProgressRequest::getJobId, ShowSqlJobProgressRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse> showSqlJobStatus =
        genForShowSqlJobStatus();

    private static HttpRequestDef<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse> genForShowSqlJobStatus() {
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
            f -> f.withMarshaller(ShowSqlJobStatusRequest::getJobId, ShowSqlJobStatusRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlJobTemplateRequest, UpdateSqlJobTemplateResponse> updateSqlJobTemplate =
        genForUpdateSqlJobTemplate();

    private static HttpRequestDef<UpdateSqlJobTemplateRequest, UpdateSqlJobTemplateResponse> genForUpdateSqlJobTemplate() {
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
            f -> f.withMarshaller(UpdateSqlJobTemplateRequest::getSqlId, UpdateSqlJobTemplateRequest::setSqlId));
        builder.<UpdateSqlJobTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSqlJobTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateSqlJobTemplateRequest::getBody, UpdateSqlJobTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase =
        genForCreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForCreateDatabase() {
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
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, CreateDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTableRequest, CreateTableResponse> createTable = genForCreateTable();

    private static HttpRequestDef<CreateTableRequest, CreateTableResponse> genForCreateTable() {
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
            f -> f.withMarshaller(CreateTableRequest::getDatabaseName, CreateTableRequest::setDatabaseName));
        builder.<CreateTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTableRequestBody.class),
            f -> f.withMarshaller(CreateTableRequest::getBody, CreateTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase =
        genForDeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genForDeleteDatabase() {
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
            f -> f.withMarshaller(DeleteDatabaseRequest::getDatabaseName, DeleteDatabaseRequest::setDatabaseName));
        builder.<Boolean>withRequestField("async",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getAsync, DeleteDatabaseRequest::setAsync));
        builder.<Boolean>withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getCascade, DeleteDatabaseRequest::setCascade));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTableRequest, DeleteTableResponse> deleteTable = genForDeleteTable();

    private static HttpRequestDef<DeleteTableRequest, DeleteTableResponse> genForDeleteTable() {
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
            f -> f.withMarshaller(DeleteTableRequest::getDatabaseName, DeleteTableRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTableRequest::getTableName, DeleteTableRequest::setTableName));
        builder.<Boolean>withRequestField("async",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteTableRequest::getAsync, DeleteTableRequest::setAsync));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTableRequest, ExportTableResponse> exportTable = genForExportTable();

    private static HttpRequestDef<ExportTableRequest, ExportTableResponse> genForExportTable() {
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
            f -> f.withMarshaller(ExportTableRequest::getBody, ExportTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportTableRequest, ImportTableResponse> importTable = genForImportTable();

    private static HttpRequestDef<ImportTableRequest, ImportTableResponse> genForImportTable() {
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
            f -> f.withMarshaller(ImportTableRequest::getBody, ImportTableRequest::setBody));

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
                .withUri("/v1.0/{project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getKeyword, ListDatabasesRequest::setKeyword));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, ListDatabasesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getOffset, ListDatabasesRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getTags, ListDatabasesRequest::setTags));
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDatabasesRequest::getWithPriv, ListDatabasesRequest::setWithPriv));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> listPartitions =
        genForListPartitions();

    private static HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> genForListPartitions() {
        // basic
        HttpRequestDef.Builder<ListPartitionsRequest, ListPartitionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPartitionsRequest.class, ListPartitionsResponse.class)
                .withName("ListPartitions")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/partitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getDatabaseName, ListPartitionsRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getTableName, ListPartitionsRequest::setTableName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartitionsRequest::getLimit, ListPartitionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPartitionsRequest::getOffset, ListPartitionsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlSampleTemplatesRequest, ListSqlSampleTemplatesResponse> listSqlSampleTemplates =
        genForListSqlSampleTemplates();

    private static HttpRequestDef<ListSqlSampleTemplatesRequest, ListSqlSampleTemplatesResponse> genForListSqlSampleTemplates() {
        // basic
        HttpRequestDef.Builder<ListSqlSampleTemplatesRequest, ListSqlSampleTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSqlSampleTemplatesRequest.class, ListSqlSampleTemplatesResponse.class)
            .withName("ListSqlSampleTemplates")
            .withUri("/v1.0/{project_id}/sqls/sample")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTablesRequest, ListTablesResponse> listTables = genForListTables();

    private static HttpRequestDef<ListTablesRequest, ListTablesResponse> genForListTables() {
        // basic
        HttpRequestDef.Builder<ListTablesRequest, ListTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTablesRequest.class, ListTablesResponse.class)
                .withName("ListTables")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getDatabaseName, ListTablesRequest::setDatabaseName));
        builder.<Integer>withRequestField("current-page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getCurrentPage, ListTablesRequest::setCurrentPage));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getKeyword, ListTablesRequest::setKeyword));
        builder.<Integer>withRequestField("page-size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTablesRequest::getPageSize, ListTablesRequest::setPageSize));
        builder.<String>withRequestField("table-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTablesRequest::getTableType, ListTablesRequest::setTableType));
        builder.<Boolean>withRequestField("with-detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTablesRequest::getWithDetail, ListTablesRequest::setWithDetail));
        builder.<Boolean>withRequestField("with-priv",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTablesRequest::getWithPriv, ListTablesRequest::setWithPriv));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PreviewTableRequest, PreviewTableResponse> previewTable = genForPreviewTable();

    private static HttpRequestDef<PreviewTableRequest, PreviewTableResponse> genForPreviewTable() {
        // basic
        HttpRequestDef.Builder<PreviewTableRequest, PreviewTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, PreviewTableRequest.class, PreviewTableResponse.class)
                .withName("PreviewTable")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}/preview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewTableRequest::getDatabaseName, PreviewTableRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewTableRequest::getTableName, PreviewTableRequest::setTableName));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewTableRequest::getMode, PreviewTableRequest::setMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTableRequest, ShowTableResponse> showTable = genForShowTable();

    private static HttpRequestDef<ShowTableRequest, ShowTableResponse> genForShowTable() {
        // basic
        HttpRequestDef.Builder<ShowTableRequest, ShowTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTableRequest.class, ShowTableResponse.class)
                .withName("ShowTable")
                .withUri("/v1.0/{project_id}/databases/{database_name}/tables/{table_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getDatabaseName, ShowTableRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTableRequest::getTableName, ShowTableRequest::setTableName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> updateDatabaseOwner =
        genForUpdateDatabaseOwner();

    private static HttpRequestDef<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> genForUpdateDatabaseOwner() {
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
            f -> f.withMarshaller(UpdateDatabaseOwnerRequest::getDatabaseName,
                UpdateDatabaseOwnerRequest::setDatabaseName));
        builder.<UpdateOwnerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOwnerRequestBody.class),
            f -> f.withMarshaller(UpdateDatabaseOwnerRequest::getBody, UpdateDatabaseOwnerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTableOwnerRequest, UpdateTableOwnerResponse> updateTableOwner =
        genForUpdateTableOwner();

    private static HttpRequestDef<UpdateTableOwnerRequest, UpdateTableOwnerResponse> genForUpdateTableOwner() {
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
            f -> f.withMarshaller(UpdateTableOwnerRequest::getDatabaseName, UpdateTableOwnerRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTableOwnerRequest::getTableName, UpdateTableOwnerRequest::setTableName));
        builder.<UpdateOwnerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOwnerRequestBody.class),
            f -> f.withMarshaller(UpdateTableOwnerRequest::getBody, UpdateTableOwnerRequest::setBody));

        // response

        return builder.build();
    }

}
