package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteSqlJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteSqlJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsRequest;
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
import com.huaweicloud.sdk.dli.v1.model.CheckSqlResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateConnectivityTaskRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateConnectivityTaskResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDatasourceConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDatasourceConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateDliAgencyRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateDliAgencyResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRoutesRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateEnhancedConnectionRoutesResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobGraphRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobGraphResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalVariableRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalVariableResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateJobAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateJobAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSparkJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobTemplateResponse;
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
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteTableResponse;
import com.huaweicloud.sdk.dli.v1.model.DisassociateQueueFromEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.DisassociateQueueFromEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportTableResponse;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ImportTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportTableResponse;
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
import com.huaweicloud.sdk.dli.v1.model.PreviewSqlJobResultRequest;
import com.huaweicloud.sdk.dli.v1.model.PreviewSqlJobResultResponse;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketRequest;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketResponse;
import com.huaweicloud.sdk.dli.v1.model.RunAuthorizationActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunAuthorizationActionResponse;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackRequest;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackResponse;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionResponse;
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
import com.huaweicloud.sdk.dli.v1.model.StopFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateDatabaseOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateDatabaseOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarJobRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarJobResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalVariableRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalVariableResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateGroupOrResourceOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateGroupOrResourceOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePropertyRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueuePropertyResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateSparkJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateSparkJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateTableOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateTableOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadFilesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadFilesResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadJarsRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadJarsResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadPythonFilesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadPythonFilesResponse;
import com.huaweicloud.sdk.dli.v1.model.UploadResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.UploadResourcesResponse;

import java.util.concurrent.CompletableFuture;

public class DliAsyncClient {

    protected HcClient hcClient;

    public DliAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DliAsyncClient> newBuilder() {
        ClientBuilder<DliAsyncClient> clientBuilder = new ClientBuilder<>(DliAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量删除SQL模板
     *
     * 该API用于批量删除SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteSqlJobTemplatesRequest 请求对象
     * @return CompletableFuture<BatchDeleteSqlJobTemplatesResponse>
     */
    public CompletableFuture<BatchDeleteSqlJobTemplatesResponse> batchDeleteSqlJobTemplatesAsync(
        BatchDeleteSqlJobTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.batchDeleteSqlJobTemplates);
    }

    /**
     * 批量删除SQL模板
     *
     * 该API用于批量删除SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteSqlJobTemplatesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSqlJobTemplatesRequest, BatchDeleteSqlJobTemplatesResponse>
     */
    public AsyncInvoker<BatchDeleteSqlJobTemplatesRequest, BatchDeleteSqlJobTemplatesResponse> batchDeleteSqlJobTemplatesAsyncInvoker(
        BatchDeleteSqlJobTemplatesRequest request) {
        return new AsyncInvoker<BatchDeleteSqlJobTemplatesRequest, BatchDeleteSqlJobTemplatesResponse>(request,
            DliMeta.batchDeleteSqlJobTemplates, hcClient);
    }

    /**
     * 创建作业模板
     *
     * 该API用于创建作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSparkJobTemplateRequest 请求对象
     * @return CompletableFuture<CreateSparkJobTemplateResponse>
     */
    public CompletableFuture<CreateSparkJobTemplateResponse> createSparkJobTemplateAsync(
        CreateSparkJobTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createSparkJobTemplate);
    }

    /**
     * 创建作业模板
     *
     * 该API用于创建作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSparkJobTemplateRequest 请求对象
     * @return AsyncInvoker<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse>
     */
    public AsyncInvoker<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse> createSparkJobTemplateAsyncInvoker(
        CreateSparkJobTemplateRequest request) {
        return new AsyncInvoker<CreateSparkJobTemplateRequest, CreateSparkJobTemplateResponse>(request,
            DliMeta.createSparkJobTemplate, hcClient);
    }

    /**
     * 存储指定SQL语句
     *
     * 该API用于存储指定的SQL语句，后续可以重复使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlJobTemplateRequest 请求对象
     * @return CompletableFuture<CreateSqlJobTemplateResponse>
     */
    public CompletableFuture<CreateSqlJobTemplateResponse> createSqlJobTemplateAsync(
        CreateSqlJobTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createSqlJobTemplate);
    }

    /**
     * 存储指定SQL语句
     *
     * 该API用于存储指定的SQL语句，后续可以重复使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlJobTemplateRequest 请求对象
     * @return AsyncInvoker<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse>
     */
    public AsyncInvoker<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse> createSqlJobTemplateAsyncInvoker(
        CreateSqlJobTemplateRequest request) {
        return new AsyncInvoker<CreateSqlJobTemplateRequest, CreateSqlJobTemplateResponse>(request,
            DliMeta.createSqlJobTemplate, hcClient);
    }

    /**
     * 查询作业模板列表
     *
     * 该API用于查询作业模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSparkJobTemplatesRequest 请求对象
     * @return CompletableFuture<ListSparkJobTemplatesResponse>
     */
    public CompletableFuture<ListSparkJobTemplatesResponse> listSparkJobTemplatesAsync(
        ListSparkJobTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listSparkJobTemplates);
    }

    /**
     * 查询作业模板列表
     *
     * 该API用于查询作业模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSparkJobTemplatesRequest 请求对象
     * @return AsyncInvoker<ListSparkJobTemplatesRequest, ListSparkJobTemplatesResponse>
     */
    public AsyncInvoker<ListSparkJobTemplatesRequest, ListSparkJobTemplatesResponse> listSparkJobTemplatesAsyncInvoker(
        ListSparkJobTemplatesRequest request) {
        return new AsyncInvoker<ListSparkJobTemplatesRequest, ListSparkJobTemplatesResponse>(request,
            DliMeta.listSparkJobTemplates, hcClient);
    }

    /**
     * 查看所有SQL模板
     *
     * 该API用查看用户保存的所有SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlJobTemplatesRequest 请求对象
     * @return CompletableFuture<ListSqlJobTemplatesResponse>
     */
    public CompletableFuture<ListSqlJobTemplatesResponse> listSqlJobTemplatesAsync(ListSqlJobTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listSqlJobTemplates);
    }

    /**
     * 查看所有SQL模板
     *
     * 该API用查看用户保存的所有SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlJobTemplatesRequest 请求对象
     * @return AsyncInvoker<ListSqlJobTemplatesRequest, ListSqlJobTemplatesResponse>
     */
    public AsyncInvoker<ListSqlJobTemplatesRequest, ListSqlJobTemplatesResponse> listSqlJobTemplatesAsyncInvoker(
        ListSqlJobTemplatesRequest request) {
        return new AsyncInvoker<ListSqlJobTemplatesRequest, ListSqlJobTemplatesResponse>(request,
            DliMeta.listSqlJobTemplates, hcClient);
    }

    /**
     * 获取作业模板
     *
     * 该API用于获取作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSparkJobTemplateRequest 请求对象
     * @return CompletableFuture<ShowSparkJobTemplateResponse>
     */
    public CompletableFuture<ShowSparkJobTemplateResponse> showSparkJobTemplateAsync(
        ShowSparkJobTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showSparkJobTemplate);
    }

    /**
     * 获取作业模板
     *
     * 该API用于获取作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSparkJobTemplateRequest 请求对象
     * @return AsyncInvoker<ShowSparkJobTemplateRequest, ShowSparkJobTemplateResponse>
     */
    public AsyncInvoker<ShowSparkJobTemplateRequest, ShowSparkJobTemplateResponse> showSparkJobTemplateAsyncInvoker(
        ShowSparkJobTemplateRequest request) {
        return new AsyncInvoker<ShowSparkJobTemplateRequest, ShowSparkJobTemplateResponse>(request,
            DliMeta.showSparkJobTemplate, hcClient);
    }

    /**
     * 查询所有SQL样例模板
     *
     * 该API用于查询所有SQL样例模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlSampleTemplatesRequest 请求对象
     * @return CompletableFuture<ShowSqlSampleTemplatesResponse>
     */
    @Deprecated
    public CompletableFuture<ShowSqlSampleTemplatesResponse> showSqlSampleTemplatesAsync(
        ShowSqlSampleTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showSqlSampleTemplates);
    }

    /**
     * 查询所有SQL样例模板
     *
     * 该API用于查询所有SQL样例模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlSampleTemplatesRequest 请求对象
     * @return AsyncInvoker<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse> showSqlSampleTemplatesAsyncInvoker(
        ShowSqlSampleTemplatesRequest request) {
        return new AsyncInvoker<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse>(request,
            DliMeta.showSqlSampleTemplates, hcClient);
    }

    /**
     * 修改作业模板
     *
     * 该API用于修改作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSparkJobTemplateRequest 请求对象
     * @return CompletableFuture<UpdateSparkJobTemplateResponse>
     */
    public CompletableFuture<UpdateSparkJobTemplateResponse> updateSparkJobTemplateAsync(
        UpdateSparkJobTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateSparkJobTemplate);
    }

    /**
     * 修改作业模板
     *
     * 该API用于修改作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSparkJobTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateSparkJobTemplateRequest, UpdateSparkJobTemplateResponse>
     */
    public AsyncInvoker<UpdateSparkJobTemplateRequest, UpdateSparkJobTemplateResponse> updateSparkJobTemplateAsyncInvoker(
        UpdateSparkJobTemplateRequest request) {
        return new AsyncInvoker<UpdateSparkJobTemplateRequest, UpdateSparkJobTemplateResponse>(request,
            DliMeta.updateSparkJobTemplate, hcClient);
    }

    /**
     * 更新SQL模板
     *
     * 该API用于更新SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlJobTemplateRequest 请求对象
     * @return CompletableFuture<UpdateSqlJobTemplateResponse>
     */
    public CompletableFuture<UpdateSqlJobTemplateResponse> updateSqlJobTemplateAsync(
        UpdateSqlJobTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateSqlJobTemplate);
    }

    /**
     * 更新SQL模板
     *
     * 该API用于更新SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlJobTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateSqlJobTemplateRequest, UpdateSqlJobTemplateResponse>
     */
    public AsyncInvoker<UpdateSqlJobTemplateRequest, UpdateSqlJobTemplateResponse> updateSqlJobTemplateAsyncInvoker(
        UpdateSqlJobTemplateRequest request) {
        return new AsyncInvoker<UpdateSqlJobTemplateRequest, UpdateSqlJobTemplateResponse>(request,
            DliMeta.updateSqlJobTemplate, hcClient);
    }

    /**
     * 关联队列到弹性资源池
     *
     * 关联队列到弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateQueueToElasticResourcePoolRequest 请求对象
     * @return CompletableFuture<AssociateQueueToElasticResourcePoolResponse>
     */
    public CompletableFuture<AssociateQueueToElasticResourcePoolResponse> associateQueueToElasticResourcePoolAsync(
        AssociateQueueToElasticResourcePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.associateQueueToElasticResourcePool);
    }

    /**
     * 关联队列到弹性资源池
     *
     * 关联队列到弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateQueueToElasticResourcePoolRequest 请求对象
     * @return AsyncInvoker<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse>
     */
    public AsyncInvoker<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> associateQueueToElasticResourcePoolAsyncInvoker(
        AssociateQueueToElasticResourcePoolRequest request) {
        return new AsyncInvoker<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse>(
            request, DliMeta.associateQueueToElasticResourcePool, hcClient);
    }

    /**
     * 绑定队列
     *
     * 该API用于在已创建的增强型跨源中绑定队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateQueueToEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<AssociateQueueToEnhancedConnectionResponse>
     */
    public CompletableFuture<AssociateQueueToEnhancedConnectionResponse> associateQueueToEnhancedConnectionAsync(
        AssociateQueueToEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.associateQueueToEnhancedConnection);
    }

    /**
     * 绑定队列
     *
     * 该API用于在已创建的增强型跨源中绑定队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateQueueToEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<AssociateQueueToEnhancedConnectionRequest, AssociateQueueToEnhancedConnectionResponse>
     */
    public AsyncInvoker<AssociateQueueToEnhancedConnectionRequest, AssociateQueueToEnhancedConnectionResponse> associateQueueToEnhancedConnectionAsyncInvoker(
        AssociateQueueToEnhancedConnectionRequest request) {
        return new AsyncInvoker<AssociateQueueToEnhancedConnectionRequest, AssociateQueueToEnhancedConnectionResponse>(
            request, DliMeta.associateQueueToEnhancedConnection, hcClient);
    }

    /**
     * 批量删除队列定时扩缩容计划
     *
     * 该API用于批量删除队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteQueuePlansRequest 请求对象
     * @return CompletableFuture<BatchDeleteQueuePlansResponse>
     */
    @Deprecated
    public CompletableFuture<BatchDeleteQueuePlansResponse> batchDeleteQueuePlansAsync(
        BatchDeleteQueuePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.batchDeleteQueuePlans);
    }

    /**
     * 批量删除队列定时扩缩容计划
     *
     * 该API用于批量删除队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteQueuePlansRequest 请求对象
     * @return AsyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse>
     */
    @Deprecated
    public AsyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> batchDeleteQueuePlansAsyncInvoker(
        BatchDeleteQueuePlansRequest request) {
        return new AsyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse>(request,
            DliMeta.batchDeleteQueuePlans, hcClient);
    }

    /**
     * 数据赋权（用户）
     *
     * 该API用于将数据库或数据表的数据权限赋给指定的其他用户。
     * 说明：
     * 被赋权用户所在用户组的所属区域需具有Tenant Guest权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAuthorizationRequest 请求对象
     * @return CompletableFuture<ChangeAuthorizationResponse>
     */
    @Deprecated
    public CompletableFuture<ChangeAuthorizationResponse> changeAuthorizationAsync(ChangeAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.changeAuthorization);
    }

    /**
     * 数据赋权（用户）
     *
     * 该API用于将数据库或数据表的数据权限赋给指定的其他用户。
     * 说明：
     * 被赋权用户所在用户组的所属区域需具有Tenant Guest权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAuthorizationRequest 请求对象
     * @return AsyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse>
     */
    @Deprecated
    public AsyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse> changeAuthorizationAsyncInvoker(
        ChangeAuthorizationRequest request) {
        return new AsyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse>(request,
            DliMeta.changeAuthorization, hcClient);
    }

    /**
     * 修改队列定时扩缩容计划
     *
     * 该API用于修改指定ID的队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeQueuePlanRequest 请求对象
     * @return CompletableFuture<ChangeQueuePlanResponse>
     */
    @Deprecated
    public CompletableFuture<ChangeQueuePlanResponse> changeQueuePlanAsync(ChangeQueuePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.changeQueuePlan);
    }

    /**
     * 修改队列定时扩缩容计划
     *
     * 该API用于修改指定ID的队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeQueuePlanRequest 请求对象
     * @return AsyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse>
     */
    @Deprecated
    public AsyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse> changeQueuePlanAsyncInvoker(
        ChangeQueuePlanRequest request) {
        return new AsyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse>(request, DliMeta.changeQueuePlan,
            hcClient);
    }

    /**
     * 创建跨源认证
     *
     * 该API用于创建跨源认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthInfoRequest 请求对象
     * @return CompletableFuture<CreateAuthInfoResponse>
     */
    @Deprecated
    public CompletableFuture<CreateAuthInfoResponse> createAuthInfoAsync(CreateAuthInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createAuthInfo);
    }

    /**
     * 创建跨源认证
     *
     * 该API用于创建跨源认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthInfoRequest 请求对象
     * @return AsyncInvoker<CreateAuthInfoRequest, CreateAuthInfoResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateAuthInfoRequest, CreateAuthInfoResponse> createAuthInfoAsyncInvoker(
        CreateAuthInfoRequest request) {
        return new AsyncInvoker<CreateAuthInfoRequest, CreateAuthInfoResponse>(request, DliMeta.createAuthInfo,
            hcClient);
    }

    /**
     * 创建地址连通性请求
     *
     * 创建地址连通性请求API接口，往指定集群发送地址连通性测试请求，并将测试地址插入表内
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectivityTaskRequest 请求对象
     * @return CompletableFuture<CreateConnectivityTaskResponse>
     */
    public CompletableFuture<CreateConnectivityTaskResponse> createConnectivityTaskAsync(
        CreateConnectivityTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createConnectivityTask);
    }

    /**
     * 创建地址连通性请求
     *
     * 创建地址连通性请求API接口，往指定集群发送地址连通性测试请求，并将测试地址插入表内
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectivityTaskRequest 请求对象
     * @return AsyncInvoker<CreateConnectivityTaskRequest, CreateConnectivityTaskResponse>
     */
    public AsyncInvoker<CreateConnectivityTaskRequest, CreateConnectivityTaskResponse> createConnectivityTaskAsyncInvoker(
        CreateConnectivityTaskRequest request) {
        return new AsyncInvoker<CreateConnectivityTaskRequest, CreateConnectivityTaskResponse>(request,
            DliMeta.createConnectivityTask, hcClient);
    }

    /**
     * 创建经典型跨源连接
     *
     * 该API用于创建与其他服务的经典型跨源连接。
     * 说明：
     * 如果需要了解Console界面的使用方法，可参考经典型跨源连接。
     * 系统default队列不支持创建跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatasourceConnectionRequest 请求对象
     * @return CompletableFuture<CreateDatasourceConnectionResponse>
     */
    @Deprecated
    public CompletableFuture<CreateDatasourceConnectionResponse> createDatasourceConnectionAsync(
        CreateDatasourceConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createDatasourceConnection);
    }

    /**
     * 创建经典型跨源连接
     *
     * 该API用于创建与其他服务的经典型跨源连接。
     * 说明：
     * 如果需要了解Console界面的使用方法，可参考经典型跨源连接。
     * 系统default队列不支持创建跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatasourceConnectionRequest 请求对象
     * @return AsyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> createDatasourceConnectionAsyncInvoker(
        CreateDatasourceConnectionRequest request) {
        return new AsyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse>(request,
            DliMeta.createDatasourceConnection, hcClient);
    }

    /**
     * 创建DLI委托
     *
     * 创建DLI委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDliAgencyRequest 请求对象
     * @return CompletableFuture<CreateDliAgencyResponse>
     */
    @Deprecated
    public CompletableFuture<CreateDliAgencyResponse> createDliAgencyAsync(CreateDliAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createDliAgency);
    }

    /**
     * 创建DLI委托
     *
     * 创建DLI委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDliAgencyRequest 请求对象
     * @return AsyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse> createDliAgencyAsyncInvoker(
        CreateDliAgencyRequest request) {
        return new AsyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse>(request, DliMeta.createDliAgency,
            hcClient);
    }

    /**
     * 创建弹性资源池
     *
     * 创建弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateElasticResourcePoolRequest 请求对象
     * @return CompletableFuture<CreateElasticResourcePoolResponse>
     */
    public CompletableFuture<CreateElasticResourcePoolResponse> createElasticResourcePoolAsync(
        CreateElasticResourcePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createElasticResourcePool);
    }

    /**
     * 创建弹性资源池
     *
     * 创建弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateElasticResourcePoolRequest 请求对象
     * @return AsyncInvoker<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse>
     */
    public AsyncInvoker<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> createElasticResourcePoolAsyncInvoker(
        CreateElasticResourcePoolRequest request) {
        return new AsyncInvoker<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse>(request,
            DliMeta.createElasticResourcePool, hcClient);
    }

    /**
     * 创建增强型跨源连接
     *
     * 该API用于创建与其他服务的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<CreateEnhancedConnectionResponse>
     */
    public CompletableFuture<CreateEnhancedConnectionResponse> createEnhancedConnectionAsync(
        CreateEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createEnhancedConnection);
    }

    /**
     * 创建增强型跨源连接
     *
     * 该API用于创建与其他服务的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse>
     */
    public AsyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> createEnhancedConnectionAsyncInvoker(
        CreateEnhancedConnectionRequest request) {
        return new AsyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse>(request,
            DliMeta.createEnhancedConnection, hcClient);
    }

    /**
     * 创建路由
     *
     * 该API用于创建跨源需要的路由。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnhancedConnectionRoutesRequest 请求对象
     * @return CompletableFuture<CreateEnhancedConnectionRoutesResponse>
     */
    @Deprecated
    public CompletableFuture<CreateEnhancedConnectionRoutesResponse> createEnhancedConnectionRoutesAsync(
        CreateEnhancedConnectionRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createEnhancedConnectionRoutes);
    }

    /**
     * 创建路由
     *
     * 该API用于创建跨源需要的路由。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnhancedConnectionRoutesRequest 请求对象
     * @return AsyncInvoker<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse> createEnhancedConnectionRoutesAsyncInvoker(
        CreateEnhancedConnectionRoutesRequest request) {
        return new AsyncInvoker<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse>(request,
            DliMeta.createEnhancedConnectionRoutes, hcClient);
    }

    /**
     * 创建DLI全局变量
     *
     * 创建全局变量。全局变量用于替换SQL作业中的敏感数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGlobalVariableRequest 请求对象
     * @return CompletableFuture<CreateGlobalVariableResponse>
     */
    public CompletableFuture<CreateGlobalVariableResponse> createGlobalVariableAsync(
        CreateGlobalVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createGlobalVariable);
    }

    /**
     * 创建DLI全局变量
     *
     * 创建全局变量。全局变量用于替换SQL作业中的敏感数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGlobalVariableRequest 请求对象
     * @return AsyncInvoker<CreateGlobalVariableRequest, CreateGlobalVariableResponse>
     */
    public AsyncInvoker<CreateGlobalVariableRequest, CreateGlobalVariableResponse> createGlobalVariableAsyncInvoker(
        CreateGlobalVariableRequest request) {
        return new AsyncInvoker<CreateGlobalVariableRequest, CreateGlobalVariableResponse>(request,
            DliMeta.createGlobalVariable, hcClient);
    }

    /**
     * 创建跨源认证
     *
     * 该API用于创建跨源认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobAuthInfoRequest 请求对象
     * @return CompletableFuture<CreateJobAuthInfoResponse>
     */
    public CompletableFuture<CreateJobAuthInfoResponse> createJobAuthInfoAsync(CreateJobAuthInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createJobAuthInfo);
    }

    /**
     * 创建跨源认证
     *
     * 该API用于创建跨源认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobAuthInfoRequest 请求对象
     * @return AsyncInvoker<CreateJobAuthInfoRequest, CreateJobAuthInfoResponse>
     */
    public AsyncInvoker<CreateJobAuthInfoRequest, CreateJobAuthInfoResponse> createJobAuthInfoAsyncInvoker(
        CreateJobAuthInfoRequest request) {
        return new AsyncInvoker<CreateJobAuthInfoRequest, CreateJobAuthInfoResponse>(request, DliMeta.createJobAuthInfo,
            hcClient);
    }

    /**
     * 创建队列
     *
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueueRequest 请求对象
     * @return CompletableFuture<CreateQueueResponse>
     */
    public CompletableFuture<CreateQueueResponse> createQueueAsync(CreateQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createQueue);
    }

    /**
     * 创建队列
     *
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueueRequest 请求对象
     * @return AsyncInvoker<CreateQueueRequest, CreateQueueResponse>
     */
    public AsyncInvoker<CreateQueueRequest, CreateQueueResponse> createQueueAsyncInvoker(CreateQueueRequest request) {
        return new AsyncInvoker<CreateQueueRequest, CreateQueueResponse>(request, DliMeta.createQueue, hcClient);
    }

    /**
     * 创建队列定时扩缩容计划
     *
     * 创建队列定时扩缩容计划接口，对指定的队列创建定时规格变更计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueuePlanRequest 请求对象
     * @return CompletableFuture<CreateQueuePlanResponse>
     */
    @Deprecated
    public CompletableFuture<CreateQueuePlanResponse> createQueuePlanAsync(CreateQueuePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createQueuePlan);
    }

    /**
     * 创建队列定时扩缩容计划
     *
     * 创建队列定时扩缩容计划接口，对指定的队列创建定时规格变更计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueuePlanRequest 请求对象
     * @return AsyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse> createQueuePlanAsyncInvoker(
        CreateQueuePlanRequest request) {
        return new AsyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse>(request, DliMeta.createQueuePlan,
            hcClient);
    }

    /**
     * 新增队列属性
     *
     * 该接口用于增加队列属性, 一次可增加多个属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueuePropertyRequest 请求对象
     * @return CompletableFuture<CreateQueuePropertyResponse>
     */
    public CompletableFuture<CreateQueuePropertyResponse> createQueuePropertyAsync(CreateQueuePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createQueueProperty);
    }

    /**
     * 新增队列属性
     *
     * 该接口用于增加队列属性, 一次可增加多个属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueuePropertyRequest 请求对象
     * @return AsyncInvoker<CreateQueuePropertyRequest, CreateQueuePropertyResponse>
     */
    public AsyncInvoker<CreateQueuePropertyRequest, CreateQueuePropertyResponse> createQueuePropertyAsyncInvoker(
        CreateQueuePropertyRequest request) {
        return new AsyncInvoker<CreateQueuePropertyRequest, CreateQueuePropertyResponse>(request,
            DliMeta.createQueueProperty, hcClient);
    }

    /**
     * 删除跨源认证
     *
     * 该API用于删除跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuthInfoRequest 请求对象
     * @return CompletableFuture<DeleteAuthInfoResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteAuthInfoResponse> deleteAuthInfoAsync(DeleteAuthInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteAuthInfo);
    }

    /**
     * 删除跨源认证
     *
     * 该API用于删除跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuthInfoRequest 请求对象
     * @return AsyncInvoker<DeleteAuthInfoRequest, DeleteAuthInfoResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteAuthInfoRequest, DeleteAuthInfoResponse> deleteAuthInfoAsyncInvoker(
        DeleteAuthInfoRequest request) {
        return new AsyncInvoker<DeleteAuthInfoRequest, DeleteAuthInfoResponse>(request, DliMeta.deleteAuthInfo,
            hcClient);
    }

    /**
     * 删除经典型跨源连接
     *
     * 该API用于删除已创建的经典型跨源连接。
     * 说明：
     * 创建中的连接，无法删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatasourceConnectionRequest 请求对象
     * @return CompletableFuture<DeleteDatasourceConnectionResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteDatasourceConnectionResponse> deleteDatasourceConnectionAsync(
        DeleteDatasourceConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteDatasourceConnection);
    }

    /**
     * 删除经典型跨源连接
     *
     * 该API用于删除已创建的经典型跨源连接。
     * 说明：
     * 创建中的连接，无法删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatasourceConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> deleteDatasourceConnectionAsyncInvoker(
        DeleteDatasourceConnectionRequest request) {
        return new AsyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse>(request,
            DliMeta.deleteDatasourceConnection, hcClient);
    }

    /**
     * 删除弹性资源池
     *
     * 删除弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteElasticResourcePoolRequest 请求对象
     * @return CompletableFuture<DeleteElasticResourcePoolResponse>
     */
    public CompletableFuture<DeleteElasticResourcePoolResponse> deleteElasticResourcePoolAsync(
        DeleteElasticResourcePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteElasticResourcePool);
    }

    /**
     * 删除弹性资源池
     *
     * 删除弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteElasticResourcePoolRequest 请求对象
     * @return AsyncInvoker<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse>
     */
    public AsyncInvoker<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> deleteElasticResourcePoolAsyncInvoker(
        DeleteElasticResourcePoolRequest request) {
        return new AsyncInvoker<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse>(request,
            DliMeta.deleteElasticResourcePool, hcClient);
    }

    /**
     * 删除增强型跨源连接
     *
     * 该API用于删除已创建的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<DeleteEnhancedConnectionResponse>
     */
    public CompletableFuture<DeleteEnhancedConnectionResponse> deleteEnhancedConnectionAsync(
        DeleteEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteEnhancedConnection);
    }

    /**
     * 删除增强型跨源连接
     *
     * 该API用于删除已创建的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse>
     */
    public AsyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> deleteEnhancedConnectionAsyncInvoker(
        DeleteEnhancedConnectionRequest request) {
        return new AsyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse>(request,
            DliMeta.deleteEnhancedConnection, hcClient);
    }

    /**
     * 删除路由
     *
     * 该API用于删除跨源需要的路由。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnhancedConnectionRoutesRequest 请求对象
     * @return CompletableFuture<DeleteEnhancedConnectionRoutesResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteEnhancedConnectionRoutesResponse> deleteEnhancedConnectionRoutesAsync(
        DeleteEnhancedConnectionRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteEnhancedConnectionRoutes);
    }

    /**
     * 删除路由
     *
     * 该API用于删除跨源需要的路由。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnhancedConnectionRoutesRequest 请求对象
     * @return AsyncInvoker<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse> deleteEnhancedConnectionRoutesAsyncInvoker(
        DeleteEnhancedConnectionRoutesRequest request) {
        return new AsyncInvoker<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse>(request,
            DliMeta.deleteEnhancedConnectionRoutes, hcClient);
    }

    /**
     * 删除DLI全局变量
     *
     * 删除全局变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGlobalVariableRequest 请求对象
     * @return CompletableFuture<DeleteGlobalVariableResponse>
     */
    public CompletableFuture<DeleteGlobalVariableResponse> deleteGlobalVariableAsync(
        DeleteGlobalVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteGlobalVariable);
    }

    /**
     * 删除DLI全局变量
     *
     * 删除全局变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGlobalVariableRequest 请求对象
     * @return AsyncInvoker<DeleteGlobalVariableRequest, DeleteGlobalVariableResponse>
     */
    public AsyncInvoker<DeleteGlobalVariableRequest, DeleteGlobalVariableResponse> deleteGlobalVariableAsyncInvoker(
        DeleteGlobalVariableRequest request) {
        return new AsyncInvoker<DeleteGlobalVariableRequest, DeleteGlobalVariableResponse>(request,
            DliMeta.deleteGlobalVariable, hcClient);
    }

    /**
     * 删除跨源认证
     *
     * 该API用于删除跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobAuthInfoRequest 请求对象
     * @return CompletableFuture<DeleteJobAuthInfoResponse>
     */
    public CompletableFuture<DeleteJobAuthInfoResponse> deleteJobAuthInfoAsync(DeleteJobAuthInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteJobAuthInfo);
    }

    /**
     * 删除跨源认证
     *
     * 该API用于删除跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobAuthInfoRequest 请求对象
     * @return AsyncInvoker<DeleteJobAuthInfoRequest, DeleteJobAuthInfoResponse>
     */
    public AsyncInvoker<DeleteJobAuthInfoRequest, DeleteJobAuthInfoResponse> deleteJobAuthInfoAsyncInvoker(
        DeleteJobAuthInfoRequest request) {
        return new AsyncInvoker<DeleteJobAuthInfoRequest, DeleteJobAuthInfoResponse>(request, DliMeta.deleteJobAuthInfo,
            hcClient);
    }

    /**
     * 删除队列
     *
     * 该API用于删除指定队列。
     * 说明：
     * 若指定队列正在执行任务，则不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueueRequest 请求对象
     * @return CompletableFuture<DeleteQueueResponse>
     */
    public CompletableFuture<DeleteQueueResponse> deleteQueueAsync(DeleteQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteQueue);
    }

    /**
     * 删除队列
     *
     * 该API用于删除指定队列。
     * 说明：
     * 若指定队列正在执行任务，则不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueueRequest 请求对象
     * @return AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse>
     */
    public AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueAsyncInvoker(DeleteQueueRequest request) {
        return new AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse>(request, DliMeta.deleteQueue, hcClient);
    }

    /**
     * 单个删除队列定时扩缩容计划
     *
     * 该API用于删除指定ID的队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueuePlanRequest 请求对象
     * @return CompletableFuture<DeleteQueuePlanResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteQueuePlanResponse> deleteQueuePlanAsync(DeleteQueuePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteQueuePlan);
    }

    /**
     * 单个删除队列定时扩缩容计划
     *
     * 该API用于删除指定ID的队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueuePlanRequest 请求对象
     * @return AsyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse> deleteQueuePlanAsyncInvoker(
        DeleteQueuePlanRequest request) {
        return new AsyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse>(request, DliMeta.deleteQueuePlan,
            hcClient);
    }

    /**
     * 删除队列的属性
     *
     * 该接口用于删除队列的属性，一次可删除多个属性值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueuePropertyRequest 请求对象
     * @return CompletableFuture<DeleteQueuePropertyResponse>
     */
    public CompletableFuture<DeleteQueuePropertyResponse> deleteQueuePropertyAsync(DeleteQueuePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteQueueProperty);
    }

    /**
     * 删除队列的属性
     *
     * 该接口用于删除队列的属性，一次可删除多个属性值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueuePropertyRequest 请求对象
     * @return AsyncInvoker<DeleteQueuePropertyRequest, DeleteQueuePropertyResponse>
     */
    public AsyncInvoker<DeleteQueuePropertyRequest, DeleteQueuePropertyResponse> deleteQueuePropertyAsyncInvoker(
        DeleteQueuePropertyRequest request) {
        return new AsyncInvoker<DeleteQueuePropertyRequest, DeleteQueuePropertyResponse>(request,
            DliMeta.deleteQueueProperty, hcClient);
    }

    /**
     * 删除组内资源包
     *
     * 该API用于删除某个project某个分组下的资源包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteResource);
    }

    /**
     * 删除组内资源包
     *
     * 该API用于删除某个project某个分组下的资源包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceAsyncInvoker(
        DeleteResourceRequest request) {
        return new AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>(request, DliMeta.deleteResource,
            hcClient);
    }

    /**
     * 解绑队列
     *
     * 该API用于在增强型跨源中解绑已绑定的队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateQueueFromEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<DisassociateQueueFromEnhancedConnectionResponse>
     */
    public CompletableFuture<DisassociateQueueFromEnhancedConnectionResponse> disassociateQueueFromEnhancedConnectionAsync(
        DisassociateQueueFromEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.disassociateQueueFromEnhancedConnection);
    }

    /**
     * 解绑队列
     *
     * 该API用于在增强型跨源中解绑已绑定的队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateQueueFromEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<DisassociateQueueFromEnhancedConnectionRequest, DisassociateQueueFromEnhancedConnectionResponse>
     */
    public AsyncInvoker<DisassociateQueueFromEnhancedConnectionRequest, DisassociateQueueFromEnhancedConnectionResponse> disassociateQueueFromEnhancedConnectionAsyncInvoker(
        DisassociateQueueFromEnhancedConnectionRequest request) {
        return new AsyncInvoker<DisassociateQueueFromEnhancedConnectionRequest, DisassociateQueueFromEnhancedConnectionResponse>(
            request, DliMeta.disassociateQueueFromEnhancedConnection, hcClient);
    }

    /**
     * 获取跨源认证列表
     *
     * 该API用于查询跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthInfoRequest 请求对象
     * @return CompletableFuture<ListAuthInfoResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuthInfoResponse> listAuthInfoAsync(ListAuthInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listAuthInfo);
    }

    /**
     * 获取跨源认证列表
     *
     * 该API用于查询跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthInfoRequest 请求对象
     * @return AsyncInvoker<ListAuthInfoRequest, ListAuthInfoResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuthInfoRequest, ListAuthInfoResponse> listAuthInfoAsyncInvoker(
        ListAuthInfoRequest request) {
        return new AsyncInvoker<ListAuthInfoRequest, ListAuthInfoResponse>(request, DliMeta.listAuthInfo, hcClient);
    }

    /**
     * 查看赋权对象的用者权限信息
     *
     * 获取对象赋权用户的权限信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorizationPrivilegesRequest 请求对象
     * @return CompletableFuture<ListAuthorizationPrivilegesResponse>
     */
    public CompletableFuture<ListAuthorizationPrivilegesResponse> listAuthorizationPrivilegesAsync(
        ListAuthorizationPrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listAuthorizationPrivileges);
    }

    /**
     * 查看赋权对象的用者权限信息
     *
     * 获取对象赋权用户的权限信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthorizationPrivilegesRequest 请求对象
     * @return AsyncInvoker<ListAuthorizationPrivilegesRequest, ListAuthorizationPrivilegesResponse>
     */
    public AsyncInvoker<ListAuthorizationPrivilegesRequest, ListAuthorizationPrivilegesResponse> listAuthorizationPrivilegesAsyncInvoker(
        ListAuthorizationPrivilegesRequest request) {
        return new AsyncInvoker<ListAuthorizationPrivilegesRequest, ListAuthorizationPrivilegesResponse>(request,
            DliMeta.listAuthorizationPrivileges, hcClient);
    }

    /**
     * 查看数据库的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return CompletableFuture<ListDatabaseUsersResponse>
     */
    @Deprecated
    public CompletableFuture<ListDatabaseUsersResponse> listDatabaseUsersAsync(ListDatabaseUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listDatabaseUsers);
    }

    /**
     * 查看数据库的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    @Deprecated
    public AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersAsyncInvoker(
        ListDatabaseUsersRequest request) {
        return new AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>(request, DliMeta.listDatabaseUsers,
            hcClient);
    }

    /**
     * 查询经典型跨源连接列表
     *
     * 该API用于查询该用户已创建的经典型跨源连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourceConnectionsRequest 请求对象
     * @return CompletableFuture<ListDatasourceConnectionsResponse>
     */
    @Deprecated
    public CompletableFuture<ListDatasourceConnectionsResponse> listDatasourceConnectionsAsync(
        ListDatasourceConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listDatasourceConnections);
    }

    /**
     * 查询经典型跨源连接列表
     *
     * 该API用于查询该用户已创建的经典型跨源连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourceConnectionsRequest 请求对象
     * @return AsyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> listDatasourceConnectionsAsyncInvoker(
        ListDatasourceConnectionsRequest request) {
        return new AsyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse>(request,
            DliMeta.listDatasourceConnections, hcClient);
    }

    /**
     * 查询弹性资源池所属队列
     *
     * 查询弹性资源池所属队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolQueuesRequest 请求对象
     * @return CompletableFuture<ListElasticResourcePoolQueuesResponse>
     */
    public CompletableFuture<ListElasticResourcePoolQueuesResponse> listElasticResourcePoolQueuesAsync(
        ListElasticResourcePoolQueuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listElasticResourcePoolQueues);
    }

    /**
     * 查询弹性资源池所属队列
     *
     * 查询弹性资源池所属队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolQueuesRequest 请求对象
     * @return AsyncInvoker<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse>
     */
    public AsyncInvoker<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> listElasticResourcePoolQueuesAsyncInvoker(
        ListElasticResourcePoolQueuesRequest request) {
        return new AsyncInvoker<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse>(request,
            DliMeta.listElasticResourcePoolQueues, hcClient);
    }

    /**
     * 弹性资源池扩缩容历史记录
     *
     * 查询当前弹性资源池扩缩容历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolScaleRecordsRequest 请求对象
     * @return CompletableFuture<ListElasticResourcePoolScaleRecordsResponse>
     */
    public CompletableFuture<ListElasticResourcePoolScaleRecordsResponse> listElasticResourcePoolScaleRecordsAsync(
        ListElasticResourcePoolScaleRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listElasticResourcePoolScaleRecords);
    }

    /**
     * 弹性资源池扩缩容历史记录
     *
     * 查询当前弹性资源池扩缩容历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolScaleRecordsRequest 请求对象
     * @return AsyncInvoker<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse>
     */
    public AsyncInvoker<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse> listElasticResourcePoolScaleRecordsAsyncInvoker(
        ListElasticResourcePoolScaleRecordsRequest request) {
        return new AsyncInvoker<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse>(
            request, DliMeta.listElasticResourcePoolScaleRecords, hcClient);
    }

    /**
     * 查询所有弹性资源池
     *
     * 查询所有弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolsRequest 请求对象
     * @return CompletableFuture<ListElasticResourcePoolsResponse>
     */
    public CompletableFuture<ListElasticResourcePoolsResponse> listElasticResourcePoolsAsync(
        ListElasticResourcePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listElasticResourcePools);
    }

    /**
     * 查询所有弹性资源池
     *
     * 查询所有弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolsRequest 请求对象
     * @return AsyncInvoker<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse>
     */
    public AsyncInvoker<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> listElasticResourcePoolsAsyncInvoker(
        ListElasticResourcePoolsRequest request) {
        return new AsyncInvoker<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse>(request,
            DliMeta.listElasticResourcePools, hcClient);
    }

    /**
     * 查询增强型跨源连接列表
     *
     * 该API用于查询该用户已创建的增强型跨源连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnhancedConnectionsRequest 请求对象
     * @return CompletableFuture<ListEnhancedConnectionsResponse>
     */
    public CompletableFuture<ListEnhancedConnectionsResponse> listEnhancedConnectionsAsync(
        ListEnhancedConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listEnhancedConnections);
    }

    /**
     * 查询增强型跨源连接列表
     *
     * 该API用于查询该用户已创建的增强型跨源连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnhancedConnectionsRequest 请求对象
     * @return AsyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse>
     */
    public AsyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> listEnhancedConnectionsAsyncInvoker(
        ListEnhancedConnectionsRequest request) {
        return new AsyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse>(request,
            DliMeta.listEnhancedConnections, hcClient);
    }

    /**
     * 查询DLI全局变量列表
     *
     * 查询全局变量列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGlobalVariablesRequest 请求对象
     * @return CompletableFuture<ListGlobalVariablesResponse>
     */
    public CompletableFuture<ListGlobalVariablesResponse> listGlobalVariablesAsync(ListGlobalVariablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listGlobalVariables);
    }

    /**
     * 查询DLI全局变量列表
     *
     * 查询全局变量列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGlobalVariablesRequest 请求对象
     * @return AsyncInvoker<ListGlobalVariablesRequest, ListGlobalVariablesResponse>
     */
    public AsyncInvoker<ListGlobalVariablesRequest, ListGlobalVariablesResponse> listGlobalVariablesAsyncInvoker(
        ListGlobalVariablesRequest request) {
        return new AsyncInvoker<ListGlobalVariablesRequest, ListGlobalVariablesResponse>(request,
            DliMeta.listGlobalVariables, hcClient);
    }

    /**
     * 查询增强型跨源授权信息
     *
     * 该API用于查询跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobAuthInfosRequest 请求对象
     * @return CompletableFuture<ListJobAuthInfosResponse>
     */
    public CompletableFuture<ListJobAuthInfosResponse> listJobAuthInfosAsync(ListJobAuthInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listJobAuthInfos);
    }

    /**
     * 查询增强型跨源授权信息
     *
     * 该API用于查询跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobAuthInfosRequest 请求对象
     * @return AsyncInvoker<ListJobAuthInfosRequest, ListJobAuthInfosResponse>
     */
    public AsyncInvoker<ListJobAuthInfosRequest, ListJobAuthInfosResponse> listJobAuthInfosAsyncInvoker(
        ListJobAuthInfosRequest request) {
        return new AsyncInvoker<ListJobAuthInfosRequest, ListJobAuthInfosResponse>(request, DliMeta.listJobAuthInfos,
            hcClient);
    }

    /**
     * 查看队列定时扩缩容计划
     *
     * 查看队列定时扩缩容计划接口，列出指定队列定时规格变更计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueuePlansRequest 请求对象
     * @return CompletableFuture<ListQueuePlansResponse>
     */
    @Deprecated
    public CompletableFuture<ListQueuePlansResponse> listQueuePlansAsync(ListQueuePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listQueuePlans);
    }

    /**
     * 查看队列定时扩缩容计划
     *
     * 查看队列定时扩缩容计划接口，列出指定队列定时规格变更计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueuePlansRequest 请求对象
     * @return AsyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse>
     */
    @Deprecated
    public AsyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse> listQueuePlansAsyncInvoker(
        ListQueuePlansRequest request) {
        return new AsyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse>(request, DliMeta.listQueuePlans,
            hcClient);
    }

    /**
     * 获取队列属性
     *
     * 获取队列配置的属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueuePropertiesRequest 请求对象
     * @return CompletableFuture<ListQueuePropertiesResponse>
     */
    public CompletableFuture<ListQueuePropertiesResponse> listQueuePropertiesAsync(ListQueuePropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listQueueProperties);
    }

    /**
     * 获取队列属性
     *
     * 获取队列配置的属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueuePropertiesRequest 请求对象
     * @return AsyncInvoker<ListQueuePropertiesRequest, ListQueuePropertiesResponse>
     */
    public AsyncInvoker<ListQueuePropertiesRequest, ListQueuePropertiesResponse> listQueuePropertiesAsyncInvoker(
        ListQueuePropertiesRequest request) {
        return new AsyncInvoker<ListQueuePropertiesRequest, ListQueuePropertiesResponse>(request,
            DliMeta.listQueueProperties, hcClient);
    }

    /**
     * 查看队列的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueueUsersRequest 请求对象
     * @return CompletableFuture<ListQueueUsersResponse>
     */
    @Deprecated
    public CompletableFuture<ListQueueUsersResponse> listQueueUsersAsync(ListQueueUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listQueueUsers);
    }

    /**
     * 查看队列的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueueUsersRequest 请求对象
     * @return AsyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse>
     */
    @Deprecated
    public AsyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse> listQueueUsersAsyncInvoker(
        ListQueueUsersRequest request) {
        return new AsyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse>(request, DliMeta.listQueueUsers,
            hcClient);
    }

    /**
     * 查询所有队列
     *
     * 该API用于列出该project下所有的队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueuesRequest 请求对象
     * @return CompletableFuture<ListQueuesResponse>
     */
    public CompletableFuture<ListQueuesResponse> listQueuesAsync(ListQueuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listQueues);
    }

    /**
     * 查询所有队列
     *
     * 该API用于列出该project下所有的队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueuesRequest 请求对象
     * @return AsyncInvoker<ListQueuesRequest, ListQueuesResponse>
     */
    public AsyncInvoker<ListQueuesRequest, ListQueuesResponse> listQueuesAsyncInvoker(ListQueuesRequest request) {
        return new AsyncInvoker<ListQueuesRequest, ListQueuesResponse>(request, DliMeta.listQueues, hcClient);
    }

    /**
     * 查看分组资源列表
     *
     * 该API用于查看某个project下的所有资源，其中包含Group。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    @Deprecated
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listResources);
    }

    /**
     * 查看分组资源列表
     *
     * 该API用于查看某个project下的所有资源，其中包含Group。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, DliMeta.listResources, hcClient);
    }

    /**
     * 查看表的用户权限
     *
     * 该API用于查询指定用户在表上的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablePrivilegesRequest 请求对象
     * @return CompletableFuture<ListTablePrivilegesResponse>
     */
    @Deprecated
    public CompletableFuture<ListTablePrivilegesResponse> listTablePrivilegesAsync(ListTablePrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listTablePrivileges);
    }

    /**
     * 查看表的用户权限
     *
     * 该API用于查询指定用户在表上的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablePrivilegesRequest 请求对象
     * @return AsyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse> listTablePrivilegesAsyncInvoker(
        ListTablePrivilegesRequest request) {
        return new AsyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse>(request,
            DliMeta.listTablePrivileges, hcClient);
    }

    /**
     * 查看表的使用者
     *
     * 该API用于查看有权访问指定表或表的列的所有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableUsersRequest 请求对象
     * @return CompletableFuture<ListTableUsersResponse>
     */
    @Deprecated
    public CompletableFuture<ListTableUsersResponse> listTableUsersAsync(ListTableUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listTableUsers);
    }

    /**
     * 查看表的使用者
     *
     * 该API用于查看有权访问指定表或表的列的所有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableUsersRequest 请求对象
     * @return AsyncInvoker<ListTableUsersRequest, ListTableUsersResponse>
     */
    @Deprecated
    public AsyncInvoker<ListTableUsersRequest, ListTableUsersResponse> listTableUsersAsyncInvoker(
        ListTableUsersRequest request) {
        return new AsyncInvoker<ListTableUsersRequest, ListTableUsersResponse>(request, DliMeta.listTableUsers,
            hcClient);
    }

    /**
     * 队列赋权
     *
     * 该API用于与其他用户共享指定的队列，可以给用户赋使用指定的队列的权限或者收回使用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterAuthorizedQueueRequest 请求对象
     * @return CompletableFuture<RegisterAuthorizedQueueResponse>
     */
    @Deprecated
    public CompletableFuture<RegisterAuthorizedQueueResponse> registerAuthorizedQueueAsync(
        RegisterAuthorizedQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.registerAuthorizedQueue);
    }

    /**
     * 队列赋权
     *
     * 该API用于与其他用户共享指定的队列，可以给用户赋使用指定的队列的权限或者收回使用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterAuthorizedQueueRequest 请求对象
     * @return AsyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse>
     */
    @Deprecated
    public AsyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> registerAuthorizedQueueAsyncInvoker(
        RegisterAuthorizedQueueRequest request) {
        return new AsyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse>(request,
            DliMeta.registerAuthorizedQueue, hcClient);
    }

    /**
     * 数据赋权（用户、项目）
     *
     * 该API用于将DLI资源权限赋给、回收、更新指定的其他用户或项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAuthorizationActionRequest 请求对象
     * @return CompletableFuture<RunAuthorizationActionResponse>
     */
    public CompletableFuture<RunAuthorizationActionResponse> runAuthorizationActionAsync(
        RunAuthorizationActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.runAuthorizationAction);
    }

    /**
     * 数据赋权（用户、项目）
     *
     * 该API用于将DLI资源权限赋给、回收、更新指定的其他用户或项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAuthorizationActionRequest 请求对象
     * @return AsyncInvoker<RunAuthorizationActionRequest, RunAuthorizationActionResponse>
     */
    public AsyncInvoker<RunAuthorizationActionRequest, RunAuthorizationActionResponse> runAuthorizationActionAsyncInvoker(
        RunAuthorizationActionRequest request) {
        return new AsyncInvoker<RunAuthorizationActionRequest, RunAuthorizationActionResponse>(request,
            DliMeta.runAuthorizationAction, hcClient);
    }

    /**
     * 重启/扩容/缩容队列
     *
     * 该功能用于重新启动队列、扩容队列、缩容队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueueActionRequest 请求对象
     * @return CompletableFuture<RunQueueActionResponse>
     */
    public CompletableFuture<RunQueueActionResponse> runQueueActionAsync(RunQueueActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.runQueueAction);
    }

    /**
     * 重启/扩容/缩容队列
     *
     * 该功能用于重新启动队列、扩容队列、缩容队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueueActionRequest 请求对象
     * @return AsyncInvoker<RunQueueActionRequest, RunQueueActionResponse>
     */
    public AsyncInvoker<RunQueueActionRequest, RunQueueActionResponse> runQueueActionAsyncInvoker(
        RunQueueActionRequest request) {
        return new AsyncInvoker<RunQueueActionRequest, RunQueueActionResponse>(request, DliMeta.runQueueAction,
            hcClient);
    }

    /**
     * 查询指定地址连通性测试详情
     *
     * 该API用于在连通性测试提交后查询连通性结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectivityTaskRequest 请求对象
     * @return CompletableFuture<ShowConnectivityTaskResponse>
     */
    public CompletableFuture<ShowConnectivityTaskResponse> showConnectivityTaskAsync(
        ShowConnectivityTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showConnectivityTask);
    }

    /**
     * 查询指定地址连通性测试详情
     *
     * 该API用于在连通性测试提交后查询连通性结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectivityTaskRequest 请求对象
     * @return AsyncInvoker<ShowConnectivityTaskRequest, ShowConnectivityTaskResponse>
     */
    public AsyncInvoker<ShowConnectivityTaskRequest, ShowConnectivityTaskResponse> showConnectivityTaskAsyncInvoker(
        ShowConnectivityTaskRequest request) {
        return new AsyncInvoker<ShowConnectivityTaskRequest, ShowConnectivityTaskResponse>(request,
            DliMeta.showConnectivityTask, hcClient);
    }

    /**
     * 查询经典型跨源连接
     *
     * 该API用于查询该用户指定的已创建的经典型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasourceConnectionRequest 请求对象
     * @return CompletableFuture<ShowDatasourceConnectionResponse>
     */
    @Deprecated
    public CompletableFuture<ShowDatasourceConnectionResponse> showDatasourceConnectionAsync(
        ShowDatasourceConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showDatasourceConnection);
    }

    /**
     * 查询经典型跨源连接
     *
     * 该API用于查询该用户指定的已创建的经典型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasourceConnectionRequest 请求对象
     * @return AsyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> showDatasourceConnectionAsyncInvoker(
        ShowDatasourceConnectionRequest request) {
        return new AsyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse>(request,
            DliMeta.showDatasourceConnection, hcClient);
    }

    /**
     * 获取dli委托信息
     *
     * 获取dli委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDliAgencyRequest 请求对象
     * @return CompletableFuture<ShowDliAgencyResponse>
     */
    @Deprecated
    public CompletableFuture<ShowDliAgencyResponse> showDliAgencyAsync(ShowDliAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showDliAgency);
    }

    /**
     * 获取dli委托信息
     *
     * 获取dli委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDliAgencyRequest 请求对象
     * @return AsyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse> showDliAgencyAsyncInvoker(
        ShowDliAgencyRequest request) {
        return new AsyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse>(request, DliMeta.showDliAgency, hcClient);
    }

    /**
     * 查询增强型跨源连接
     *
     * 该API用于查询该用户指定的已创建的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<ShowEnhancedConnectionResponse>
     */
    public CompletableFuture<ShowEnhancedConnectionResponse> showEnhancedConnectionAsync(
        ShowEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showEnhancedConnection);
    }

    /**
     * 查询增强型跨源连接
     *
     * 该API用于查询该用户指定的已创建的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse>
     */
    public AsyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> showEnhancedConnectionAsyncInvoker(
        ShowEnhancedConnectionRequest request) {
        return new AsyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse>(request,
            DliMeta.showEnhancedConnection, hcClient);
    }

    /**
     * 查询增强型跨源授权信息
     *
     * 该API用于查询增强型跨源连接授权的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnhancedConnectionPrivilegeRequest 请求对象
     * @return CompletableFuture<ShowEnhancedConnectionPrivilegeResponse>
     */
    public CompletableFuture<ShowEnhancedConnectionPrivilegeResponse> showEnhancedConnectionPrivilegeAsync(
        ShowEnhancedConnectionPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showEnhancedConnectionPrivilege);
    }

    /**
     * 查询增强型跨源授权信息
     *
     * 该API用于查询增强型跨源连接授权的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnhancedConnectionPrivilegeRequest 请求对象
     * @return AsyncInvoker<ShowEnhancedConnectionPrivilegeRequest, ShowEnhancedConnectionPrivilegeResponse>
     */
    public AsyncInvoker<ShowEnhancedConnectionPrivilegeRequest, ShowEnhancedConnectionPrivilegeResponse> showEnhancedConnectionPrivilegeAsyncInvoker(
        ShowEnhancedConnectionPrivilegeRequest request) {
        return new AsyncInvoker<ShowEnhancedConnectionPrivilegeRequest, ShowEnhancedConnectionPrivilegeResponse>(
            request, DliMeta.showEnhancedConnectionPrivilege, hcClient);
    }

    /**
     * 查询队列详情
     *
     * 该API用于列出该project下指定的队列详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQueueRequest 请求对象
     * @return CompletableFuture<ShowQueueResponse>
     */
    public CompletableFuture<ShowQueueResponse> showQueueAsync(ShowQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showQueue);
    }

    /**
     * 查询队列详情
     *
     * 该API用于列出该project下指定的队列详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQueueRequest 请求对象
     * @return AsyncInvoker<ShowQueueRequest, ShowQueueResponse>
     */
    public AsyncInvoker<ShowQueueRequest, ShowQueueResponse> showQueueAsyncInvoker(ShowQueueRequest request) {
        return new AsyncInvoker<ShowQueueRequest, ShowQueueResponse>(request, DliMeta.showQueue, hcClient);
    }

    /**
     * 查询配额
     *
     * 该API用于获取用户配额信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showQuota);
    }

    /**
     * 查询配额
     *
     * 该API用于获取用户配额信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, DliMeta.showQuota, hcClient);
    }

    /**
     * 查看组内资源包
     *
     * 该API用于查看某个project某个分组下的具体资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceInfoRequest 请求对象
     * @return CompletableFuture<ShowResourceInfoResponse>
     */
    @Deprecated
    public CompletableFuture<ShowResourceInfoResponse> showResourceInfoAsync(ShowResourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showResourceInfo);
    }

    /**
     * 查看组内资源包
     *
     * 该API用于查看某个project某个分组下的具体资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceInfoRequest 请求对象
     * @return AsyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse> showResourceInfoAsyncInvoker(
        ShowResourceInfoRequest request) {
        return new AsyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse>(request, DliMeta.showResourceInfo,
            hcClient);
    }

    /**
     * 更新跨源认证
     *
     * 该API用于更新跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuthInfoRequest 请求对象
     * @return CompletableFuture<UpdateAuthInfoResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateAuthInfoResponse> updateAuthInfoAsync(UpdateAuthInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateAuthInfo);
    }

    /**
     * 更新跨源认证
     *
     * 该API用于更新跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuthInfoRequest 请求对象
     * @return AsyncInvoker<UpdateAuthInfoRequest, UpdateAuthInfoResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateAuthInfoRequest, UpdateAuthInfoResponse> updateAuthInfoAsyncInvoker(
        UpdateAuthInfoRequest request) {
        return new AsyncInvoker<UpdateAuthInfoRequest, UpdateAuthInfoResponse>(request, DliMeta.updateAuthInfo,
            hcClient);
    }

    /**
     * 修改弹性资源池信息
     *
     * 修改弹性资源池信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateElasticResourcePoolRequest 请求对象
     * @return CompletableFuture<UpdateElasticResourcePoolResponse>
     */
    public CompletableFuture<UpdateElasticResourcePoolResponse> updateElasticResourcePoolAsync(
        UpdateElasticResourcePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateElasticResourcePool);
    }

    /**
     * 修改弹性资源池信息
     *
     * 修改弹性资源池信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateElasticResourcePoolRequest 请求对象
     * @return AsyncInvoker<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse>
     */
    public AsyncInvoker<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> updateElasticResourcePoolAsyncInvoker(
        UpdateElasticResourcePoolRequest request) {
        return new AsyncInvoker<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse>(request,
            DliMeta.updateElasticResourcePool, hcClient);
    }

    /**
     * 修改弹性资源池关联的队列优先级
     *
     * 设置弹性资源池指定队列的扩缩容策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateElasticResourcePoolQueueRequest 请求对象
     * @return CompletableFuture<UpdateElasticResourcePoolQueueResponse>
     */
    public CompletableFuture<UpdateElasticResourcePoolQueueResponse> updateElasticResourcePoolQueueAsync(
        UpdateElasticResourcePoolQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateElasticResourcePoolQueue);
    }

    /**
     * 修改弹性资源池关联的队列优先级
     *
     * 设置弹性资源池指定队列的扩缩容策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateElasticResourcePoolQueueRequest 请求对象
     * @return AsyncInvoker<UpdateElasticResourcePoolQueueRequest, UpdateElasticResourcePoolQueueResponse>
     */
    public AsyncInvoker<UpdateElasticResourcePoolQueueRequest, UpdateElasticResourcePoolQueueResponse> updateElasticResourcePoolQueueAsyncInvoker(
        UpdateElasticResourcePoolQueueRequest request) {
        return new AsyncInvoker<UpdateElasticResourcePoolQueueRequest, UpdateElasticResourcePoolQueueResponse>(request,
            DliMeta.updateElasticResourcePoolQueue, hcClient);
    }

    /**
     * 修改增强型跨源主机信息
     *
     * 该API用于在跨源中修改数据源主机信息，仅支持全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<UpdateEnhancedConnectionResponse>
     */
    public CompletableFuture<UpdateEnhancedConnectionResponse> updateEnhancedConnectionAsync(
        UpdateEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateEnhancedConnection);
    }

    /**
     * 修改增强型跨源主机信息
     *
     * 该API用于在跨源中修改数据源主机信息，仅支持全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateEnhancedConnectionRequest, UpdateEnhancedConnectionResponse>
     */
    public AsyncInvoker<UpdateEnhancedConnectionRequest, UpdateEnhancedConnectionResponse> updateEnhancedConnectionAsyncInvoker(
        UpdateEnhancedConnectionRequest request) {
        return new AsyncInvoker<UpdateEnhancedConnectionRequest, UpdateEnhancedConnectionResponse>(request,
            DliMeta.updateEnhancedConnection, hcClient);
    }

    /**
     * 修改DLI全局变量
     *
     * 修改全局变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGlobalVariableRequest 请求对象
     * @return CompletableFuture<UpdateGlobalVariableResponse>
     */
    public CompletableFuture<UpdateGlobalVariableResponse> updateGlobalVariableAsync(
        UpdateGlobalVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateGlobalVariable);
    }

    /**
     * 修改DLI全局变量
     *
     * 修改全局变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGlobalVariableRequest 请求对象
     * @return AsyncInvoker<UpdateGlobalVariableRequest, UpdateGlobalVariableResponse>
     */
    public AsyncInvoker<UpdateGlobalVariableRequest, UpdateGlobalVariableResponse> updateGlobalVariableAsyncInvoker(
        UpdateGlobalVariableRequest request) {
        return new AsyncInvoker<UpdateGlobalVariableRequest, UpdateGlobalVariableResponse>(request,
            DliMeta.updateGlobalVariable, hcClient);
    }

    /**
     * 修改组或者资源包拥有者
     *
     * 用于修改程序包的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGroupOrResourceOwnerRequest 请求对象
     * @return CompletableFuture<UpdateGroupOrResourceOwnerResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateGroupOrResourceOwnerResponse> updateGroupOrResourceOwnerAsync(
        UpdateGroupOrResourceOwnerRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateGroupOrResourceOwner);
    }

    /**
     * 修改组或者资源包拥有者
     *
     * 用于修改程序包的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGroupOrResourceOwnerRequest 请求对象
     * @return AsyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> updateGroupOrResourceOwnerAsyncInvoker(
        UpdateGroupOrResourceOwnerRequest request) {
        return new AsyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse>(request,
            DliMeta.updateGroupOrResourceOwner, hcClient);
    }

    /**
     * 更新跨源认证
     *
     * 该API用于更新跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobAuthInfoRequest 请求对象
     * @return CompletableFuture<UpdateJobAuthInfoResponse>
     */
    public CompletableFuture<UpdateJobAuthInfoResponse> updateJobAuthInfoAsync(UpdateJobAuthInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateJobAuthInfo);
    }

    /**
     * 更新跨源认证
     *
     * 该API用于更新跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobAuthInfoRequest 请求对象
     * @return AsyncInvoker<UpdateJobAuthInfoRequest, UpdateJobAuthInfoResponse>
     */
    public AsyncInvoker<UpdateJobAuthInfoRequest, UpdateJobAuthInfoResponse> updateJobAuthInfoAsyncInvoker(
        UpdateJobAuthInfoRequest request) {
        return new AsyncInvoker<UpdateJobAuthInfoRequest, UpdateJobAuthInfoResponse>(request, DliMeta.updateJobAuthInfo,
            hcClient);
    }

    /**
     * 修改队列网段
     *
     * 该功能用于修改包年包月队列网段。
     * 说明：
     * 如果待修改网段的队列中有正在提交或正在运行的作业，或者改队列已经绑定了增强型跨源，将不支持修改网段操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateQueueCidrRequest 请求对象
     * @return CompletableFuture<UpdateQueueCidrResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateQueueCidrResponse> updateQueueCidrAsync(UpdateQueueCidrRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateQueueCidr);
    }

    /**
     * 修改队列网段
     *
     * 该功能用于修改包年包月队列网段。
     * 说明：
     * 如果待修改网段的队列中有正在提交或正在运行的作业，或者改队列已经绑定了增强型跨源，将不支持修改网段操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateQueueCidrRequest 请求对象
     * @return AsyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse> updateQueueCidrAsyncInvoker(
        UpdateQueueCidrRequest request) {
        return new AsyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse>(request, DliMeta.updateQueueCidr,
            hcClient);
    }

    /**
     * 更新队列属性
     *
     * 更新队列属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateQueuePropertyRequest 请求对象
     * @return CompletableFuture<UpdateQueuePropertyResponse>
     */
    public CompletableFuture<UpdateQueuePropertyResponse> updateQueuePropertyAsync(UpdateQueuePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateQueueProperty);
    }

    /**
     * 更新队列属性
     *
     * 更新队列属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateQueuePropertyRequest 请求对象
     * @return AsyncInvoker<UpdateQueuePropertyRequest, UpdateQueuePropertyResponse>
     */
    public AsyncInvoker<UpdateQueuePropertyRequest, UpdateQueuePropertyResponse> updateQueuePropertyAsyncInvoker(
        UpdateQueuePropertyRequest request) {
        return new AsyncInvoker<UpdateQueuePropertyRequest, UpdateQueuePropertyResponse>(request,
            DliMeta.updateQueueProperty, hcClient);
    }

    /**
     * 上传file类型分组资源
     *
     * 该API用于在project下上传file类型模块。
     * 说明： 上传同名file模块时，新模块将会覆盖旧模块。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadFilesRequest 请求对象
     * @return CompletableFuture<UploadFilesResponse>
     */
    @Deprecated
    public CompletableFuture<UploadFilesResponse> uploadFilesAsync(UploadFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.uploadFiles);
    }

    /**
     * 上传file类型分组资源
     *
     * 该API用于在project下上传file类型模块。
     * 说明： 上传同名file模块时，新模块将会覆盖旧模块。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadFilesRequest 请求对象
     * @return AsyncInvoker<UploadFilesRequest, UploadFilesResponse>
     */
    @Deprecated
    public AsyncInvoker<UploadFilesRequest, UploadFilesResponse> uploadFilesAsyncInvoker(UploadFilesRequest request) {
        return new AsyncInvoker<UploadFilesRequest, UploadFilesResponse>(request, DliMeta.uploadFiles, hcClient);
    }

    /**
     * 上传jar类型分组资源
     *
     * 该API用于在project下上传jar类型分组资源。
     * 说明：上传同名资源模块时，新模块将会覆盖旧模块。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadJarsRequest 请求对象
     * @return CompletableFuture<UploadJarsResponse>
     */
    @Deprecated
    public CompletableFuture<UploadJarsResponse> uploadJarsAsync(UploadJarsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.uploadJars);
    }

    /**
     * 上传jar类型分组资源
     *
     * 该API用于在project下上传jar类型分组资源。
     * 说明：上传同名资源模块时，新模块将会覆盖旧模块。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadJarsRequest 请求对象
     * @return AsyncInvoker<UploadJarsRequest, UploadJarsResponse>
     */
    @Deprecated
    public AsyncInvoker<UploadJarsRequest, UploadJarsResponse> uploadJarsAsyncInvoker(UploadJarsRequest request) {
        return new AsyncInvoker<UploadJarsRequest, UploadJarsResponse>(request, DliMeta.uploadJars, hcClient);
    }

    /**
     * 上传pyfile类型分组资源
     *
     * 该API用于在project下的上传pyfile类型模块。
     * 说明： 上传同名pyfile类型模块时，新模块将会覆盖旧模块。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadPythonFilesRequest 请求对象
     * @return CompletableFuture<UploadPythonFilesResponse>
     */
    @Deprecated
    public CompletableFuture<UploadPythonFilesResponse> uploadPythonFilesAsync(UploadPythonFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.uploadPythonFiles);
    }

    /**
     * 上传pyfile类型分组资源
     *
     * 该API用于在project下的上传pyfile类型模块。
     * 说明： 上传同名pyfile类型模块时，新模块将会覆盖旧模块。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadPythonFilesRequest 请求对象
     * @return AsyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse>
     */
    @Deprecated
    public AsyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse> uploadPythonFilesAsyncInvoker(
        UploadPythonFilesRequest request) {
        return new AsyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse>(request, DliMeta.uploadPythonFiles,
            hcClient);
    }

    /**
     * 上传分组资源
     *
     * 该API用于上传分组资源到某个project下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadResourcesRequest 请求对象
     * @return CompletableFuture<UploadResourcesResponse>
     */
    @Deprecated
    public CompletableFuture<UploadResourcesResponse> uploadResourcesAsync(UploadResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.uploadResources);
    }

    /**
     * 上传分组资源
     *
     * 该API用于上传分组资源到某个project下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadResourcesRequest 请求对象
     * @return AsyncInvoker<UploadResourcesRequest, UploadResourcesResponse>
     */
    @Deprecated
    public AsyncInvoker<UploadResourcesRequest, UploadResourcesResponse> uploadResourcesAsyncInvoker(
        UploadResourcesRequest request) {
        return new AsyncInvoker<UploadResourcesRequest, UploadResourcesResponse>(request, DliMeta.uploadResources,
            hcClient);
    }

    /**
     * 批量删除Flink作业
     *
     * 批量删除任何状态的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteFlinkJobsRequest 请求对象
     * @return CompletableFuture<BatchDeleteFlinkJobsResponse>
     */
    public CompletableFuture<BatchDeleteFlinkJobsResponse> batchDeleteFlinkJobsAsync(
        BatchDeleteFlinkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.batchDeleteFlinkJobs);
    }

    /**
     * 批量删除Flink作业
     *
     * 批量删除任何状态的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteFlinkJobsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse>
     */
    public AsyncInvoker<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse> batchDeleteFlinkJobsAsyncInvoker(
        BatchDeleteFlinkJobsRequest request) {
        return new AsyncInvoker<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse>(request,
            DliMeta.batchDeleteFlinkJobs, hcClient);
    }

    /**
     * 批量运行Flink作业
     *
     * 触发批量运行Flink作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRunFlinkJobsRequest 请求对象
     * @return CompletableFuture<BatchRunFlinkJobsResponse>
     */
    public CompletableFuture<BatchRunFlinkJobsResponse> batchRunFlinkJobsAsync(BatchRunFlinkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.batchRunFlinkJobs);
    }

    /**
     * 批量运行Flink作业
     *
     * 触发批量运行Flink作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRunFlinkJobsRequest 请求对象
     * @return AsyncInvoker<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse>
     */
    public AsyncInvoker<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse> batchRunFlinkJobsAsyncInvoker(
        BatchRunFlinkJobsRequest request) {
        return new AsyncInvoker<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse>(request, DliMeta.batchRunFlinkJobs,
            hcClient);
    }

    /**
     * 边缘Flink作业状态信息上报
     *
     * 该API用于处理边缘Flink作业状态上报信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeFlinkJobStatusReportRequest 请求对象
     * @return CompletableFuture<ChangeFlinkJobStatusReportResponse>
     */
    @Deprecated
    public CompletableFuture<ChangeFlinkJobStatusReportResponse> changeFlinkJobStatusReportAsync(
        ChangeFlinkJobStatusReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.changeFlinkJobStatusReport);
    }

    /**
     * 边缘Flink作业状态信息上报
     *
     * 该API用于处理边缘Flink作业状态上报信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeFlinkJobStatusReportRequest 请求对象
     * @return AsyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse>
     */
    @Deprecated
    public AsyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> changeFlinkJobStatusReportAsyncInvoker(
        ChangeFlinkJobStatusReportRequest request) {
        return new AsyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse>(request,
            DliMeta.changeFlinkJobStatusReport, hcClient);
    }

    /**
     * 新建Flink Jar作业
     *
     * 用户自定义作业目前支持jar格式，运行在独享集群中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkJarJobRequest 请求对象
     * @return CompletableFuture<CreateFlinkJarJobResponse>
     */
    public CompletableFuture<CreateFlinkJarJobResponse> createFlinkJarJobAsync(CreateFlinkJarJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createFlinkJarJob);
    }

    /**
     * 新建Flink Jar作业
     *
     * 用户自定义作业目前支持jar格式，运行在独享集群中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkJarJobRequest 请求对象
     * @return AsyncInvoker<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse>
     */
    public AsyncInvoker<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse> createFlinkJarJobAsyncInvoker(
        CreateFlinkJarJobRequest request) {
        return new AsyncInvoker<CreateFlinkJarJobRequest, CreateFlinkJarJobResponse>(request, DliMeta.createFlinkJarJob,
            hcClient);
    }

    /**
     * 新建Flink SQL作业
     *
     * 通过POST方式，提交流式SQL作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkSqlJobRequest 请求对象
     * @return CompletableFuture<CreateFlinkSqlJobResponse>
     */
    public CompletableFuture<CreateFlinkSqlJobResponse> createFlinkSqlJobAsync(CreateFlinkSqlJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createFlinkSqlJob);
    }

    /**
     * 新建Flink SQL作业
     *
     * 通过POST方式，提交流式SQL作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkSqlJobRequest 请求对象
     * @return AsyncInvoker<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse>
     */
    public AsyncInvoker<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse> createFlinkSqlJobAsyncInvoker(
        CreateFlinkSqlJobRequest request) {
        return new AsyncInvoker<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse>(request, DliMeta.createFlinkSqlJob,
            hcClient);
    }

    /**
     * 生成flink SQL作业的静态流图
     *
     * 生成flink SQL作业的静态流图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkSqlJobGraphRequest 请求对象
     * @return CompletableFuture<CreateFlinkSqlJobGraphResponse>
     */
    public CompletableFuture<CreateFlinkSqlJobGraphResponse> createFlinkSqlJobGraphAsync(
        CreateFlinkSqlJobGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createFlinkSqlJobGraph);
    }

    /**
     * 生成flink SQL作业的静态流图
     *
     * 生成flink SQL作业的静态流图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkSqlJobGraphRequest 请求对象
     * @return AsyncInvoker<CreateFlinkSqlJobGraphRequest, CreateFlinkSqlJobGraphResponse>
     */
    public AsyncInvoker<CreateFlinkSqlJobGraphRequest, CreateFlinkSqlJobGraphResponse> createFlinkSqlJobGraphAsyncInvoker(
        CreateFlinkSqlJobGraphRequest request) {
        return new AsyncInvoker<CreateFlinkSqlJobGraphRequest, CreateFlinkSqlJobGraphResponse>(request,
            DliMeta.createFlinkSqlJobGraph, hcClient);
    }

    /**
     * 新建Flink作业模板
     *
     * 在DLI服务中新建一个Flink作业模板，最多100个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkSqlJobTemplateRequest 请求对象
     * @return CompletableFuture<CreateFlinkSqlJobTemplateResponse>
     */
    public CompletableFuture<CreateFlinkSqlJobTemplateResponse> createFlinkSqlJobTemplateAsync(
        CreateFlinkSqlJobTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createFlinkSqlJobTemplate);
    }

    /**
     * 新建Flink作业模板
     *
     * 在DLI服务中新建一个Flink作业模板，最多100个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkSqlJobTemplateRequest 请求对象
     * @return AsyncInvoker<CreateFlinkSqlJobTemplateRequest, CreateFlinkSqlJobTemplateResponse>
     */
    public AsyncInvoker<CreateFlinkSqlJobTemplateRequest, CreateFlinkSqlJobTemplateResponse> createFlinkSqlJobTemplateAsyncInvoker(
        CreateFlinkSqlJobTemplateRequest request) {
        return new AsyncInvoker<CreateFlinkSqlJobTemplateRequest, CreateFlinkSqlJobTemplateResponse>(request,
            DliMeta.createFlinkSqlJobTemplate, hcClient);
    }

    /**
     * 创建IEF消息通道
     *
     * 该API用于创建IEF消息通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIefMessageChannelRequest 请求对象
     * @return CompletableFuture<CreateIefMessageChannelResponse>
     */
    @Deprecated
    public CompletableFuture<CreateIefMessageChannelResponse> createIefMessageChannelAsync(
        CreateIefMessageChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createIefMessageChannel);
    }

    /**
     * 创建IEF消息通道
     *
     * 该API用于创建IEF消息通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIefMessageChannelRequest 请求对象
     * @return AsyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> createIefMessageChannelAsyncInvoker(
        CreateIefMessageChannelRequest request) {
        return new AsyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse>(request,
            DliMeta.createIefMessageChannel, hcClient);
    }

    /**
     * IEF系统事件上报
     *
     * 该API用于处理IEF系统事件上报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIefSystemEventsRequest 请求对象
     * @return CompletableFuture<CreateIefSystemEventsResponse>
     */
    @Deprecated
    public CompletableFuture<CreateIefSystemEventsResponse> createIefSystemEventsAsync(
        CreateIefSystemEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createIefSystemEvents);
    }

    /**
     * IEF系统事件上报
     *
     * 该API用于处理IEF系统事件上报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIefSystemEventsRequest 请求对象
     * @return AsyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> createIefSystemEventsAsyncInvoker(
        CreateIefSystemEventsRequest request) {
        return new AsyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse>(request,
            DliMeta.createIefSystemEvents, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除任何状态的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlinkJobRequest 请求对象
     * @return CompletableFuture<DeleteFlinkJobResponse>
     */
    public CompletableFuture<DeleteFlinkJobResponse> deleteFlinkJobAsync(DeleteFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteFlinkJob);
    }

    /**
     * 删除作业
     *
     * 删除任何状态的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlinkJobRequest 请求对象
     * @return AsyncInvoker<DeleteFlinkJobRequest, DeleteFlinkJobResponse>
     */
    public AsyncInvoker<DeleteFlinkJobRequest, DeleteFlinkJobResponse> deleteFlinkJobAsyncInvoker(
        DeleteFlinkJobRequest request) {
        return new AsyncInvoker<DeleteFlinkJobRequest, DeleteFlinkJobResponse>(request, DliMeta.deleteFlinkJob,
            hcClient);
    }

    /**
     * 删除Flink作业模板
     *
     * 删除一个Flink作业模板，即使当前模板正在被作业使用，也允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlinkSqlJobTemplateRequest 请求对象
     * @return CompletableFuture<DeleteFlinkSqlJobTemplateResponse>
     */
    public CompletableFuture<DeleteFlinkSqlJobTemplateResponse> deleteFlinkSqlJobTemplateAsync(
        DeleteFlinkSqlJobTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteFlinkSqlJobTemplate);
    }

    /**
     * 删除Flink作业模板
     *
     * 删除一个Flink作业模板，即使当前模板正在被作业使用，也允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlinkSqlJobTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteFlinkSqlJobTemplateRequest, DeleteFlinkSqlJobTemplateResponse>
     */
    public AsyncInvoker<DeleteFlinkSqlJobTemplateRequest, DeleteFlinkSqlJobTemplateResponse> deleteFlinkSqlJobTemplateAsyncInvoker(
        DeleteFlinkSqlJobTemplateRequest request) {
        return new AsyncInvoker<DeleteFlinkSqlJobTemplateRequest, DeleteFlinkSqlJobTemplateResponse>(request,
            DliMeta.deleteFlinkSqlJobTemplate, hcClient);
    }

    /**
     * flink作业导出
     *
     * 通过POST方式，导出flink作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportFlinkJobsRequest 请求对象
     * @return CompletableFuture<ExportFlinkJobsResponse>
     */
    public CompletableFuture<ExportFlinkJobsResponse> exportFlinkJobsAsync(ExportFlinkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.exportFlinkJobs);
    }

    /**
     * flink作业导出
     *
     * 通过POST方式，导出flink作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportFlinkJobsRequest 请求对象
     * @return AsyncInvoker<ExportFlinkJobsRequest, ExportFlinkJobsResponse>
     */
    public AsyncInvoker<ExportFlinkJobsRequest, ExportFlinkJobsResponse> exportFlinkJobsAsyncInvoker(
        ExportFlinkJobsRequest request) {
        return new AsyncInvoker<ExportFlinkJobsRequest, ExportFlinkJobsResponse>(request, DliMeta.exportFlinkJobs,
            hcClient);
    }

    /**
     * flink作业导入
     *
     * 通过POST方式，导入flink作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportFlinkJobsRequest 请求对象
     * @return CompletableFuture<ImportFlinkJobsResponse>
     */
    public CompletableFuture<ImportFlinkJobsResponse> importFlinkJobsAsync(ImportFlinkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.importFlinkJobs);
    }

    /**
     * flink作业导入
     *
     * 通过POST方式，导入flink作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportFlinkJobsRequest 请求对象
     * @return AsyncInvoker<ImportFlinkJobsRequest, ImportFlinkJobsResponse>
     */
    public AsyncInvoker<ImportFlinkJobsRequest, ImportFlinkJobsResponse> importFlinkJobsAsyncInvoker(
        ImportFlinkJobsRequest request) {
        return new AsyncInvoker<ImportFlinkJobsRequest, ImportFlinkJobsResponse>(request, DliMeta.importFlinkJobs,
            hcClient);
    }

    /**
     * 查询Flink作业列表
     *
     * 查询当前用户的作业列表，可以根据作业ID作为ID，查询大于ID或小于ID的限定条数的作业，默认查询全部状态的作业，也可以设定运行中或其他状态条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlinkJobsRequest 请求对象
     * @return CompletableFuture<ListFlinkJobsResponse>
     */
    public CompletableFuture<ListFlinkJobsResponse> listFlinkJobsAsync(ListFlinkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listFlinkJobs);
    }

    /**
     * 查询Flink作业列表
     *
     * 查询当前用户的作业列表，可以根据作业ID作为ID，查询大于ID或小于ID的限定条数的作业，默认查询全部状态的作业，也可以设定运行中或其他状态条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlinkJobsRequest 请求对象
     * @return AsyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse>
     */
    public AsyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobsAsyncInvoker(
        ListFlinkJobsRequest request) {
        return new AsyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse>(request, DliMeta.listFlinkJobs, hcClient);
    }

    /**
     * 查询Flink作业模板列表
     *
     * 查询Flink作业模板列表。当前只支持查询用户自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlinkSqlJobTemplatesRequest 请求对象
     * @return CompletableFuture<ListFlinkSqlJobTemplatesResponse>
     */
    public CompletableFuture<ListFlinkSqlJobTemplatesResponse> listFlinkSqlJobTemplatesAsync(
        ListFlinkSqlJobTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listFlinkSqlJobTemplates);
    }

    /**
     * 查询Flink作业模板列表
     *
     * 查询Flink作业模板列表。当前只支持查询用户自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlinkSqlJobTemplatesRequest 请求对象
     * @return AsyncInvoker<ListFlinkSqlJobTemplatesRequest, ListFlinkSqlJobTemplatesResponse>
     */
    public AsyncInvoker<ListFlinkSqlJobTemplatesRequest, ListFlinkSqlJobTemplatesResponse> listFlinkSqlJobTemplatesAsyncInvoker(
        ListFlinkSqlJobTemplatesRequest request) {
        return new AsyncInvoker<ListFlinkSqlJobTemplatesRequest, ListFlinkSqlJobTemplatesResponse>(request,
            DliMeta.listFlinkSqlJobTemplates, hcClient);
    }

    /**
     * OBS授权给DLI服务
     *
     * 用户主动授权OBS桶的操作权限给DLI服务, 用于保存用户作业的checkpoint、作业的运行日志等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterBucketRequest 请求对象
     * @return CompletableFuture<RegisterBucketResponse>
     */
    @Deprecated
    public CompletableFuture<RegisterBucketResponse> registerBucketAsync(RegisterBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.registerBucket);
    }

    /**
     * OBS授权给DLI服务
     *
     * 用户主动授权OBS桶的操作权限给DLI服务, 用于保存用户作业的checkpoint、作业的运行日志等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterBucketRequest 请求对象
     * @return AsyncInvoker<RegisterBucketRequest, RegisterBucketResponse>
     */
    @Deprecated
    public AsyncInvoker<RegisterBucketRequest, RegisterBucketResponse> registerBucketAsyncInvoker(
        RegisterBucketRequest request) {
        return new AsyncInvoker<RegisterBucketRequest, RegisterBucketResponse>(request, DliMeta.registerBucket,
            hcClient);
    }

    /**
     * 边缘Flink作业Action状态回调
     *
     * 该API用于处理IEF Flink作业action回调信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunIefJobActionCallBackRequest 请求对象
     * @return CompletableFuture<RunIefJobActionCallBackResponse>
     */
    @Deprecated
    public CompletableFuture<RunIefJobActionCallBackResponse> runIefJobActionCallBackAsync(
        RunIefJobActionCallBackRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.runIefJobActionCallBack);
    }

    /**
     * 边缘Flink作业Action状态回调
     *
     * 该API用于处理IEF Flink作业action回调信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunIefJobActionCallBackRequest 请求对象
     * @return AsyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse>
     */
    @Deprecated
    public AsyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> runIefJobActionCallBackAsyncInvoker(
        RunIefJobActionCallBackRequest request) {
        return new AsyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse>(request,
            DliMeta.runIefJobActionCallBack, hcClient);
    }

    /**
     * 查询Flink作业详情
     *
     * 查看一个Flink作业的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkJobRequest 请求对象
     * @return CompletableFuture<ShowFlinkJobResponse>
     */
    public CompletableFuture<ShowFlinkJobResponse> showFlinkJobAsync(ShowFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showFlinkJob);
    }

    /**
     * 查询Flink作业详情
     *
     * 查看一个Flink作业的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkJobRequest 请求对象
     * @return AsyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse>
     */
    public AsyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJobAsyncInvoker(
        ShowFlinkJobRequest request) {
        return new AsyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse>(request, DliMeta.showFlinkJob, hcClient);
    }

    /**
     * 查询Flink作业执行计划
     *
     * 查询Flink作业执行计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkJobExecutionGraphRequest 请求对象
     * @return CompletableFuture<ShowFlinkJobExecutionGraphResponse>
     */
    public CompletableFuture<ShowFlinkJobExecutionGraphResponse> showFlinkJobExecutionGraphAsync(
        ShowFlinkJobExecutionGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showFlinkJobExecutionGraph);
    }

    /**
     * 查询Flink作业执行计划
     *
     * 查询Flink作业执行计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkJobExecutionGraphRequest 请求对象
     * @return AsyncInvoker<ShowFlinkJobExecutionGraphRequest, ShowFlinkJobExecutionGraphResponse>
     */
    public AsyncInvoker<ShowFlinkJobExecutionGraphRequest, ShowFlinkJobExecutionGraphResponse> showFlinkJobExecutionGraphAsyncInvoker(
        ShowFlinkJobExecutionGraphRequest request) {
        return new AsyncInvoker<ShowFlinkJobExecutionGraphRequest, ShowFlinkJobExecutionGraphResponse>(request,
            DliMeta.showFlinkJobExecutionGraph, hcClient);
    }

    /**
     * 查询Flink作业监控信息
     *
     * 查询Flink作业监控信息, 支持同时查询多个Flink作业的监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkMetricRequest 请求对象
     * @return CompletableFuture<ShowFlinkMetricResponse>
     */
    @Deprecated
    public CompletableFuture<ShowFlinkMetricResponse> showFlinkMetricAsync(ShowFlinkMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showFlinkMetric);
    }

    /**
     * 查询Flink作业监控信息
     *
     * 查询Flink作业监控信息, 支持同时查询多个Flink作业的监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkMetricRequest 请求对象
     * @return AsyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse> showFlinkMetricAsyncInvoker(
        ShowFlinkMetricRequest request) {
        return new AsyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse>(request, DliMeta.showFlinkMetric,
            hcClient);
    }

    /**
     * 批量停止Flink作业
     *
     * 批量停止正在运行的Flink作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopFlinkJobsRequest 请求对象
     * @return CompletableFuture<StopFlinkJobsResponse>
     */
    public CompletableFuture<StopFlinkJobsResponse> stopFlinkJobsAsync(StopFlinkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.stopFlinkJobs);
    }

    /**
     * 批量停止Flink作业
     *
     * 批量停止正在运行的Flink作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopFlinkJobsRequest 请求对象
     * @return AsyncInvoker<StopFlinkJobsRequest, StopFlinkJobsResponse>
     */
    public AsyncInvoker<StopFlinkJobsRequest, StopFlinkJobsResponse> stopFlinkJobsAsyncInvoker(
        StopFlinkJobsRequest request) {
        return new AsyncInvoker<StopFlinkJobsRequest, StopFlinkJobsResponse>(request, DliMeta.stopFlinkJobs, hcClient);
    }

    /**
     * 更新Flink Jar作业
     *
     * 更新用户自定义作业，目前支持jar格式，运行在独享集群中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkJarJobRequest 请求对象
     * @return CompletableFuture<UpdateFlinkJarJobResponse>
     */
    public CompletableFuture<UpdateFlinkJarJobResponse> updateFlinkJarJobAsync(UpdateFlinkJarJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateFlinkJarJob);
    }

    /**
     * 更新Flink Jar作业
     *
     * 更新用户自定义作业，目前支持jar格式，运行在独享集群中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkJarJobRequest 请求对象
     * @return AsyncInvoker<UpdateFlinkJarJobRequest, UpdateFlinkJarJobResponse>
     */
    public AsyncInvoker<UpdateFlinkJarJobRequest, UpdateFlinkJarJobResponse> updateFlinkJarJobAsyncInvoker(
        UpdateFlinkJarJobRequest request) {
        return new AsyncInvoker<UpdateFlinkJarJobRequest, UpdateFlinkJarJobResponse>(request, DliMeta.updateFlinkJarJob,
            hcClient);
    }

    /**
     * 更新Flink SQL作业
     *
     * Stream SQL的语法扩展了Apache Flink SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkSqlJobRequest 请求对象
     * @return CompletableFuture<UpdateFlinkSqlJobResponse>
     */
    public CompletableFuture<UpdateFlinkSqlJobResponse> updateFlinkSqlJobAsync(UpdateFlinkSqlJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateFlinkSqlJob);
    }

    /**
     * 更新Flink SQL作业
     *
     * Stream SQL的语法扩展了Apache Flink SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkSqlJobRequest 请求对象
     * @return AsyncInvoker<UpdateFlinkSqlJobRequest, UpdateFlinkSqlJobResponse>
     */
    public AsyncInvoker<UpdateFlinkSqlJobRequest, UpdateFlinkSqlJobResponse> updateFlinkSqlJobAsyncInvoker(
        UpdateFlinkSqlJobRequest request) {
        return new AsyncInvoker<UpdateFlinkSqlJobRequest, UpdateFlinkSqlJobResponse>(request, DliMeta.updateFlinkSqlJob,
            hcClient);
    }

    /**
     * 更新Flink作业模板
     *
     * 对DLI服务中已有的Flink作业模板进行更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkSqlJobTemplateRequest 请求对象
     * @return CompletableFuture<UpdateFlinkSqlJobTemplateResponse>
     */
    public CompletableFuture<UpdateFlinkSqlJobTemplateResponse> updateFlinkSqlJobTemplateAsync(
        UpdateFlinkSqlJobTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateFlinkSqlJobTemplate);
    }

    /**
     * 更新Flink作业模板
     *
     * 对DLI服务中已有的Flink作业模板进行更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkSqlJobTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateFlinkSqlJobTemplateRequest, UpdateFlinkSqlJobTemplateResponse>
     */
    public AsyncInvoker<UpdateFlinkSqlJobTemplateRequest, UpdateFlinkSqlJobTemplateResponse> updateFlinkSqlJobTemplateAsyncInvoker(
        UpdateFlinkSqlJobTemplateRequest request) {
        return new AsyncInvoker<UpdateFlinkSqlJobTemplateRequest, UpdateFlinkSqlJobTemplateResponse>(request,
            DliMeta.updateFlinkSqlJobTemplate, hcClient);
    }

    /**
     * 取消批处理作业
     *
     * 该API用于取消批处理作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelSparkJobRequest 请求对象
     * @return CompletableFuture<CancelSparkJobResponse>
     */
    public CompletableFuture<CancelSparkJobResponse> cancelSparkJobAsync(CancelSparkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.cancelSparkJob);
    }

    /**
     * 取消批处理作业
     *
     * 该API用于取消批处理作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelSparkJobRequest 请求对象
     * @return AsyncInvoker<CancelSparkJobRequest, CancelSparkJobResponse>
     */
    public AsyncInvoker<CancelSparkJobRequest, CancelSparkJobResponse> cancelSparkJobAsyncInvoker(
        CancelSparkJobRequest request) {
        return new AsyncInvoker<CancelSparkJobRequest, CancelSparkJobResponse>(request, DliMeta.cancelSparkJob,
            hcClient);
    }

    /**
     * 创建批处理作业
     *
     * 该API用于在某个队列上创建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSparkJobRequest 请求对象
     * @return CompletableFuture<CreateSparkJobResponse>
     */
    public CompletableFuture<CreateSparkJobResponse> createSparkJobAsync(CreateSparkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createSparkJob);
    }

    /**
     * 创建批处理作业
     *
     * 该API用于在某个队列上创建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSparkJobRequest 请求对象
     * @return AsyncInvoker<CreateSparkJobRequest, CreateSparkJobResponse>
     */
    public AsyncInvoker<CreateSparkJobRequest, CreateSparkJobResponse> createSparkJobAsyncInvoker(
        CreateSparkJobRequest request) {
        return new AsyncInvoker<CreateSparkJobRequest, CreateSparkJobResponse>(request, DliMeta.createSparkJob,
            hcClient);
    }

    /**
     * 查询批处理作业列表
     *
     * 该API用于查询Project下某队列批处理作业的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSparkJobsRequest 请求对象
     * @return CompletableFuture<ListSparkJobsResponse>
     */
    public CompletableFuture<ListSparkJobsResponse> listSparkJobsAsync(ListSparkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listSparkJobs);
    }

    /**
     * 查询批处理作业列表
     *
     * 该API用于查询Project下某队列批处理作业的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSparkJobsRequest 请求对象
     * @return AsyncInvoker<ListSparkJobsRequest, ListSparkJobsResponse>
     */
    public AsyncInvoker<ListSparkJobsRequest, ListSparkJobsResponse> listSparkJobsAsyncInvoker(
        ListSparkJobsRequest request) {
        return new AsyncInvoker<ListSparkJobsRequest, ListSparkJobsResponse>(request, DliMeta.listSparkJobs, hcClient);
    }

    /**
     * 查询批处理作业日志
     *
     * 该API用于查询批处理作业的后台日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchLogRequest 请求对象
     * @return CompletableFuture<ShowBatchLogResponse>
     */
    @Deprecated
    public CompletableFuture<ShowBatchLogResponse> showBatchLogAsync(ShowBatchLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showBatchLog);
    }

    /**
     * 查询批处理作业日志
     *
     * 该API用于查询批处理作业的后台日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchLogRequest 请求对象
     * @return AsyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse> showBatchLogAsyncInvoker(
        ShowBatchLogRequest request) {
        return new AsyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse>(request, DliMeta.showBatchLog, hcClient);
    }

    /**
     * 查询批处理作业详情
     *
     * 该API用于根据批处理作业的id查询作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSparkJobRequest 请求对象
     * @return CompletableFuture<ShowSparkJobResponse>
     */
    public CompletableFuture<ShowSparkJobResponse> showSparkJobAsync(ShowSparkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showSparkJob);
    }

    /**
     * 查询批处理作业详情
     *
     * 该API用于根据批处理作业的id查询作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSparkJobRequest 请求对象
     * @return AsyncInvoker<ShowSparkJobRequest, ShowSparkJobResponse>
     */
    public AsyncInvoker<ShowSparkJobRequest, ShowSparkJobResponse> showSparkJobAsyncInvoker(
        ShowSparkJobRequest request) {
        return new AsyncInvoker<ShowSparkJobRequest, ShowSparkJobResponse>(request, DliMeta.showSparkJob, hcClient);
    }

    /**
     * 查询批处理作业状态
     *
     * 该API用于查询批处理作业的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSparkJobStatusRequest 请求对象
     * @return CompletableFuture<ShowSparkJobStatusResponse>
     */
    public CompletableFuture<ShowSparkJobStatusResponse> showSparkJobStatusAsync(ShowSparkJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showSparkJobStatus);
    }

    /**
     * 查询批处理作业状态
     *
     * 该API用于查询批处理作业的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSparkJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowSparkJobStatusRequest, ShowSparkJobStatusResponse>
     */
    public AsyncInvoker<ShowSparkJobStatusRequest, ShowSparkJobStatusResponse> showSparkJobStatusAsyncInvoker(
        ShowSparkJobStatusRequest request) {
        return new AsyncInvoker<ShowSparkJobStatusRequest, ShowSparkJobStatusResponse>(request,
            DliMeta.showSparkJobStatus, hcClient);
    }

    /**
     * 取消作业
     *
     * 该API用于取消已经提交的作业，若作业已经执行结束或失败则无法取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelSqlJobRequest 请求对象
     * @return CompletableFuture<CancelSqlJobResponse>
     */
    public CompletableFuture<CancelSqlJobResponse> cancelSqlJobAsync(CancelSqlJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.cancelSqlJob);
    }

    /**
     * 取消作业
     *
     * 该API用于取消已经提交的作业，若作业已经执行结束或失败则无法取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelSqlJobRequest 请求对象
     * @return AsyncInvoker<CancelSqlJobRequest, CancelSqlJobResponse>
     */
    public AsyncInvoker<CancelSqlJobRequest, CancelSqlJobResponse> cancelSqlJobAsyncInvoker(
        CancelSqlJobRequest request) {
        return new AsyncInvoker<CancelSqlJobRequest, CancelSqlJobResponse>(request, DliMeta.cancelSqlJob, hcClient);
    }

    /**
     * 检查SQL语法
     *
     * 该API用于检查SQL语法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckSqlRequest 请求对象
     * @return CompletableFuture<CheckSqlResponse>
     */
    public CompletableFuture<CheckSqlResponse> checkSqlAsync(CheckSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.checkSql);
    }

    /**
     * 检查SQL语法
     *
     * 该API用于检查SQL语法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckSqlRequest 请求对象
     * @return AsyncInvoker<CheckSqlRequest, CheckSqlResponse>
     */
    public AsyncInvoker<CheckSqlRequest, CheckSqlResponse> checkSqlAsyncInvoker(CheckSqlRequest request) {
        return new AsyncInvoker<CheckSqlRequest, CheckSqlResponse>(request, DliMeta.checkSql, hcClient);
    }

    /**
     * 创建数据库
     *
     * 该API用于新增数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    @Deprecated
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 该API用于新增数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, DliMeta.createDatabase,
            hcClient);
    }

    /**
     * 提交SQL作业
     *
     * 该API用于通过执行SQL语句的方式向队列提交作业。
     * 
     * 作业包含以下类型：DDL、DCL、IMPORT、QUERY和INSERT。其中，IMPORT与导入数据的功能一致，区别仅在于实现方式不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlJobRequest 请求对象
     * @return CompletableFuture<CreateSqlJobResponse>
     */
    public CompletableFuture<CreateSqlJobResponse> createSqlJobAsync(CreateSqlJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createSqlJob);
    }

    /**
     * 提交SQL作业
     *
     * 该API用于通过执行SQL语句的方式向队列提交作业。
     * 
     * 作业包含以下类型：DDL、DCL、IMPORT、QUERY和INSERT。其中，IMPORT与导入数据的功能一致，区别仅在于实现方式不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlJobRequest 请求对象
     * @return AsyncInvoker<CreateSqlJobRequest, CreateSqlJobResponse>
     */
    public AsyncInvoker<CreateSqlJobRequest, CreateSqlJobResponse> createSqlJobAsyncInvoker(
        CreateSqlJobRequest request) {
        return new AsyncInvoker<CreateSqlJobRequest, CreateSqlJobResponse>(request, DliMeta.createSqlJob, hcClient);
    }

    /**
     * 创建表
     *
     * 该API用于创建新的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CompletableFuture<CreateTableResponse>
     */
    @Deprecated
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createTable);
    }

    /**
     * 创建表
     *
     * 该API用于创建新的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return AsyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return new AsyncInvoker<CreateTableRequest, CreateTableResponse>(request, DliMeta.createTable, hcClient);
    }

    /**
     * 删除数据库
     *
     * 该API用于删除空数据库，若待删除的数据库中存在表，则需先删除其中的所有表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 该API用于删除空数据库，若待删除的数据库中存在表，则需先删除其中的所有表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, DliMeta.deleteDatabase,
            hcClient);
    }

    /**
     * 删除表
     *
     * 该API用于删除指定的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return CompletableFuture<DeleteTableResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteTableResponse> deleteTableAsync(DeleteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 该API用于删除指定的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return AsyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableAsyncInvoker(DeleteTableRequest request) {
        return new AsyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, DliMeta.deleteTable, hcClient);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportSqlJobResultRequest 请求对象
     * @return CompletableFuture<ExportSqlJobResultResponse>
     */
    @Deprecated
    public CompletableFuture<ExportSqlJobResultResponse> exportSqlJobResultAsync(ExportSqlJobResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.exportSqlJobResult);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportSqlJobResultRequest 请求对象
     * @return AsyncInvoker<ExportSqlJobResultRequest, ExportSqlJobResultResponse>
     */
    @Deprecated
    public AsyncInvoker<ExportSqlJobResultRequest, ExportSqlJobResultResponse> exportSqlJobResultAsyncInvoker(
        ExportSqlJobResultRequest request) {
        return new AsyncInvoker<ExportSqlJobResultRequest, ExportSqlJobResultResponse>(request,
            DliMeta.exportSqlJobResult, hcClient);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportTableRequest 请求对象
     * @return CompletableFuture<ExportTableResponse>
     */
    @Deprecated
    public CompletableFuture<ExportTableResponse> exportTableAsync(ExportTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.exportTable);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportTableRequest 请求对象
     * @return AsyncInvoker<ExportTableRequest, ExportTableResponse>
     */
    @Deprecated
    public AsyncInvoker<ExportTableRequest, ExportTableResponse> exportTableAsyncInvoker(ExportTableRequest request) {
        return new AsyncInvoker<ExportTableRequest, ExportTableResponse>(request, DliMeta.exportTable, hcClient);
    }

    /**
     * 导入数据
     *
     * 该API用于将数据从文件导入DLI或OBS表，目前仅支持将OBS上的数据导入DLI或OBS中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTableRequest 请求对象
     * @return CompletableFuture<ImportTableResponse>
     */
    @Deprecated
    public CompletableFuture<ImportTableResponse> importTableAsync(ImportTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.importTable);
    }

    /**
     * 导入数据
     *
     * 该API用于将数据从文件导入DLI或OBS表，目前仅支持将OBS上的数据导入DLI或OBS中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTableRequest 请求对象
     * @return AsyncInvoker<ImportTableRequest, ImportTableResponse>
     */
    @Deprecated
    public AsyncInvoker<ImportTableRequest, ImportTableResponse> importTableAsyncInvoker(ImportTableRequest request) {
        return new AsyncInvoker<ImportTableRequest, ImportTableResponse>(request, DliMeta.importTable, hcClient);
    }

    /**
     * 查询所有表
     *
     * 该API用于查询指定数据库下符合过滤条件的或所有的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllTablesRequest 请求对象
     * @return CompletableFuture<ListAllTablesResponse>
     */
    @Deprecated
    public CompletableFuture<ListAllTablesResponse> listAllTablesAsync(ListAllTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listAllTables);
    }

    /**
     * 查询所有表
     *
     * 该API用于查询指定数据库下符合过滤条件的或所有的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllTablesRequest 请求对象
     * @return AsyncInvoker<ListAllTablesRequest, ListAllTablesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAllTablesRequest, ListAllTablesResponse> listAllTablesAsyncInvoker(
        ListAllTablesRequest request) {
        return new AsyncInvoker<ListAllTablesRequest, ListAllTablesResponse>(request, DliMeta.listAllTables, hcClient);
    }

    /**
     * 查询所有数据库
     *
     * 该API用于查询出所有的数据库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    @Deprecated
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listDatabases);
    }

    /**
     * 查询所有数据库
     *
     * 该API用于查询出所有的数据库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, DliMeta.listDatabases, hcClient);
    }

    /**
     * 查询所有作业
     *
     * 该API用于查询当前工程下面的所有作业的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlJobsRequest 请求对象
     * @return CompletableFuture<ListSqlJobsResponse>
     */
    public CompletableFuture<ListSqlJobsResponse> listSqlJobsAsync(ListSqlJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listSqlJobs);
    }

    /**
     * 查询所有作业
     *
     * 该API用于查询当前工程下面的所有作业的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlJobsRequest 请求对象
     * @return AsyncInvoker<ListSqlJobsRequest, ListSqlJobsResponse>
     */
    public AsyncInvoker<ListSqlJobsRequest, ListSqlJobsResponse> listSqlJobsAsyncInvoker(ListSqlJobsRequest request) {
        return new AsyncInvoker<ListSqlJobsRequest, ListSqlJobsResponse>(request, DliMeta.listSqlJobs, hcClient);
    }

    /**
     * 预览SQL作业查询结果
     *
     * 该API用于在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。
     * 该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PreviewSqlJobResultRequest 请求对象
     * @return CompletableFuture<PreviewSqlJobResultResponse>
     */
    public CompletableFuture<PreviewSqlJobResultResponse> previewSqlJobResultAsync(PreviewSqlJobResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.previewSqlJobResult);
    }

    /**
     * 预览SQL作业查询结果
     *
     * 该API用于在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。
     * 该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PreviewSqlJobResultRequest 请求对象
     * @return AsyncInvoker<PreviewSqlJobResultRequest, PreviewSqlJobResultResponse>
     */
    public AsyncInvoker<PreviewSqlJobResultRequest, PreviewSqlJobResultResponse> previewSqlJobResultAsyncInvoker(
        PreviewSqlJobResultRequest request) {
        return new AsyncInvoker<PreviewSqlJobResultRequest, PreviewSqlJobResultResponse>(request,
            DliMeta.previewSqlJobResult, hcClient);
    }

    /**
     * 描述表信息
     *
     * 该API用于描述指定表的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDescribeTableRequest 请求对象
     * @return CompletableFuture<ShowDescribeTableResponse>
     */
    @Deprecated
    public CompletableFuture<ShowDescribeTableResponse> showDescribeTableAsync(ShowDescribeTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showDescribeTable);
    }

    /**
     * 描述表信息
     *
     * 该API用于描述指定表的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDescribeTableRequest 请求对象
     * @return AsyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse> showDescribeTableAsyncInvoker(
        ShowDescribeTableRequest request) {
        return new AsyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse>(request, DliMeta.showDescribeTable,
            hcClient);
    }

    /**
     * 获取分区信息列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionsRequest 请求对象
     * @return CompletableFuture<ShowPartitionsResponse>
     */
    @Deprecated
    public CompletableFuture<ShowPartitionsResponse> showPartitionsAsync(ShowPartitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showPartitions);
    }

    /**
     * 获取分区信息列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionsRequest 请求对象
     * @return AsyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse> showPartitionsAsyncInvoker(
        ShowPartitionsRequest request) {
        return new AsyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse>(request, DliMeta.showPartitions,
            hcClient);
    }

    /**
     * 查询作业详细信息
     *
     * 该API用于查询作业的详细信息，如作业的databasename、tablename、file size和export mode等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobDetailRequest 请求对象
     * @return CompletableFuture<ShowSqlJobDetailResponse>
     */
    public CompletableFuture<ShowSqlJobDetailResponse> showSqlJobDetailAsync(ShowSqlJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showSqlJobDetail);
    }

    /**
     * 查询作业详细信息
     *
     * 该API用于查询作业的详细信息，如作业的databasename、tablename、file size和export mode等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse>
     */
    public AsyncInvoker<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse> showSqlJobDetailAsyncInvoker(
        ShowSqlJobDetailRequest request) {
        return new AsyncInvoker<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse>(request, DliMeta.showSqlJobDetail,
            hcClient);
    }

    /**
     * 查询作业执行进度信息
     *
     * 该API用于获取作业执行进度信息，如果作业正在执行，可以获取到子作业的信息，如果作业刚开始或者已经结束，不可以获取到子作业信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobProgressRequest 请求对象
     * @return CompletableFuture<ShowSqlJobProgressResponse>
     */
    public CompletableFuture<ShowSqlJobProgressResponse> showSqlJobProgressAsync(ShowSqlJobProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showSqlJobProgress);
    }

    /**
     * 查询作业执行进度信息
     *
     * 该API用于获取作业执行进度信息，如果作业正在执行，可以获取到子作业的信息，如果作业刚开始或者已经结束，不可以获取到子作业信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobProgressRequest 请求对象
     * @return AsyncInvoker<ShowSqlJobProgressRequest, ShowSqlJobProgressResponse>
     */
    public AsyncInvoker<ShowSqlJobProgressRequest, ShowSqlJobProgressResponse> showSqlJobProgressAsyncInvoker(
        ShowSqlJobProgressRequest request) {
        return new AsyncInvoker<ShowSqlJobProgressRequest, ShowSqlJobProgressResponse>(request,
            DliMeta.showSqlJobProgress, hcClient);
    }

    /**
     * 查询作业状态
     *
     * 该API用于在作业提交后查询作业状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobStatusRequest 请求对象
     * @return CompletableFuture<ShowSqlJobStatusResponse>
     */
    public CompletableFuture<ShowSqlJobStatusResponse> showSqlJobStatusAsync(ShowSqlJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showSqlJobStatus);
    }

    /**
     * 查询作业状态
     *
     * 该API用于在作业提交后查询作业状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse>
     */
    public AsyncInvoker<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse> showSqlJobStatusAsyncInvoker(
        ShowSqlJobStatusRequest request) {
        return new AsyncInvoker<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse>(request, DliMeta.showSqlJobStatus,
            hcClient);
    }

    /**
     * 预览表内容
     *
     * 该API用于用于预览表中前10行的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableContentRequest 请求对象
     * @return CompletableFuture<ShowTableContentResponse>
     */
    @Deprecated
    public CompletableFuture<ShowTableContentResponse> showTableContentAsync(ShowTableContentRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showTableContent);
    }

    /**
     * 预览表内容
     *
     * 该API用于用于预览表中前10行的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableContentRequest 请求对象
     * @return AsyncInvoker<ShowTableContentRequest, ShowTableContentResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowTableContentRequest, ShowTableContentResponse> showTableContentAsyncInvoker(
        ShowTableContentRequest request) {
        return new AsyncInvoker<ShowTableContentRequest, ShowTableContentResponse>(request, DliMeta.showTableContent,
            hcClient);
    }

    /**
     * 修改数据库用户
     *
     * 用于修改数据库的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseOwnerRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseOwnerResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateDatabaseOwnerResponse> updateDatabaseOwnerAsync(UpdateDatabaseOwnerRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateDatabaseOwner);
    }

    /**
     * 修改数据库用户
     *
     * 用于修改数据库的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseOwnerRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> updateDatabaseOwnerAsyncInvoker(
        UpdateDatabaseOwnerRequest request) {
        return new AsyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse>(request,
            DliMeta.updateDatabaseOwner, hcClient);
    }

    /**
     * 修改表用户
     *
     * 用于修改表的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableOwnerRequest 请求对象
     * @return CompletableFuture<UpdateTableOwnerResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateTableOwnerResponse> updateTableOwnerAsync(UpdateTableOwnerRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateTableOwner);
    }

    /**
     * 修改表用户
     *
     * 用于修改表的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableOwnerRequest 请求对象
     * @return AsyncInvoker<UpdateTableOwnerRequest, UpdateTableOwnerResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateTableOwnerRequest, UpdateTableOwnerResponse> updateTableOwnerAsyncInvoker(
        UpdateTableOwnerRequest request) {
        return new AsyncInvoker<UpdateTableOwnerRequest, UpdateTableOwnerResponse>(request, DliMeta.updateTableOwner,
            hcClient);
    }

}
