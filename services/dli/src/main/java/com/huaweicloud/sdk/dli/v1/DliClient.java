package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dli.v1.model.AssociateConnectionQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.AssociateConnectionQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.AssociateQueueToElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.AuthorizeResourceRequest;
import com.huaweicloud.sdk.dli.v1.model.AuthorizeResourceResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchDeleteQueuePlansResponse;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.BatchRunFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.CancelBatchJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CancelBatchJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CancelSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CancelSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.ChangeAuthorizationRequest;
import com.huaweicloud.sdk.dli.v1.model.ChangeAuthorizationResponse;
import com.huaweicloud.sdk.dli.v1.model.ChangeFlinkJobStatusReportRequest;
import com.huaweicloud.sdk.dli.v1.model.ChangeFlinkJobStatusReportResponse;
import com.huaweicloud.sdk.dli.v1.model.ChangeQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.ChangeQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.CheckConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.CheckConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.CheckSqlRequest;
import com.huaweicloud.sdk.dli.v1.model.CheckSqlResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateBatchJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateBatchJobResponse;
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
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkJarResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateFlinkTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalValueRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateGlobalValueResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateIefMessageChannelResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateIefSystemEventsResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlJobResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateSqlTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.CreateStreamGraphRequest;
import com.huaweicloud.sdk.dli.v1.model.CreateStreamGraphResponse;
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
import com.huaweicloud.sdk.dli.v1.model.DeleteFlinkTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteFlinkTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteGlobalValueRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteGlobalValueResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePlanRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueuePlanResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteSqlTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteSqlTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.dli.v1.model.DeleteTableResponse;
import com.huaweicloud.sdk.dli.v1.model.DisassociateConnectionQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.DisassociateConnectionQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportFlinkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportSqlJobResultResponse;
import com.huaweicloud.sdk.dli.v1.model.ExportTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ExportTableResponse;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportFlinkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.ImportTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ImportTableResponse;
import com.huaweicloud.sdk.dli.v1.model.ListAllTablesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListAllTablesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.ListAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.ListBatchesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListBatchesResponse;
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
import com.huaweicloud.sdk.dli.v1.model.ListFlinkTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListFlinkTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListGlobalValuesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListGlobalValuesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePlansRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueuePlansResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueueUsersRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueueUsersResponse;
import com.huaweicloud.sdk.dli.v1.model.ListQueuesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListQueuesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.ListSqlJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.ListTablePrivilegesRequest;
import com.huaweicloud.sdk.dli.v1.model.ListTablePrivilegesResponse;
import com.huaweicloud.sdk.dli.v1.model.ListTableUsersRequest;
import com.huaweicloud.sdk.dli.v1.model.ListTableUsersResponse;
import com.huaweicloud.sdk.dli.v1.model.PreviewJobResultRequest;
import com.huaweicloud.sdk.dli.v1.model.PreviewJobResultResponse;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueRequest;
import com.huaweicloud.sdk.dli.v1.model.RegisterAuthorizedQueueResponse;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketRequest;
import com.huaweicloud.sdk.dli.v1.model.RegisterBucketResponse;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackRequest;
import com.huaweicloud.sdk.dli.v1.model.RunIefJobActionCallBackResponse;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionRequest;
import com.huaweicloud.sdk.dli.v1.model.RunQueueActionResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowBatchInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowBatchInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowBatchLogRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowBatchLogResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowBatchStateRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowBatchStateResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowDatasourceConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowDatasourceConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowDescribeTableRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowDescribeTableResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowDliAgencyRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowDliAgencyResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowEnhancedConnectionRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowEnhancedConnectionResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowEnhancedPrivilegeRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowEnhancedPrivilegeResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkExecuteGraphRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkExecuteGraphResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkJobRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkJobResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkMetricRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowFlinkMetricResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowJobProgressRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowJobProgressResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowJobTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowJobTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowNodeConnectivityRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowNodeConnectivityResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowObjectUserRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowObjectUserResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowPartitionsRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowPartitionsResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowQueueDetailRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowQueueDetailResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowResourceInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowResourceInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobDetailRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobDetailResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobStatusRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlJobStatusResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlSampleTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlSampleTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowSqlTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.ShowTableContentRequest;
import com.huaweicloud.sdk.dli.v1.model.ShowTableContentResponse;
import com.huaweicloud.sdk.dli.v1.model.StopFlinkJobsRequest;
import com.huaweicloud.sdk.dli.v1.model.StopFlinkJobsResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateAuthInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateDatabaseOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateDatabaseOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueInfoRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolQueueInfoResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateElasticResourcePoolResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkJarResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkSqlResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkTemplateRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateFlinkTemplateResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalValueRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateGlobalValueResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateGroupOrResourceOwnerRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateGroupOrResourceOwnerResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateHostMassageRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateHostMassageResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateJobTemplatesResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateQueueCidrResponse;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlTemplatesRequest;
import com.huaweicloud.sdk.dli.v1.model.UpdateSqlTemplatesResponse;
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

public class DliClient {

    protected HcClient hcClient;

    public DliClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DliClient> newBuilder() {
        ClientBuilder<DliClient> clientBuilder = new ClientBuilder<>(DliClient::new);
        return clientBuilder;
    }

    /**
     * 创建作业模板
     *
     * 该API用于创建作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobTemplatesRequest 请求对象
     * @return CreateJobTemplatesResponse
     */
    public CreateJobTemplatesResponse createJobTemplates(CreateJobTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createJobTemplates);
    }

    /**
     * 创建作业模板
     *
     * 该API用于创建作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobTemplatesRequest 请求对象
     * @return SyncInvoker<CreateJobTemplatesRequest, CreateJobTemplatesResponse>
     */
    public SyncInvoker<CreateJobTemplatesRequest, CreateJobTemplatesResponse> createJobTemplatesInvoker(
        CreateJobTemplatesRequest request) {
        return new SyncInvoker<CreateJobTemplatesRequest, CreateJobTemplatesResponse>(request,
            DliMeta.createJobTemplates, hcClient);
    }

    /**
     * 存储指定SQL语句
     *
     * 该API用于存储指定的SQL语句，后续可以重复使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlTemplatesRequest 请求对象
     * @return CreateSqlTemplatesResponse
     */
    public CreateSqlTemplatesResponse createSqlTemplates(CreateSqlTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createSqlTemplates);
    }

    /**
     * 存储指定SQL语句
     *
     * 该API用于存储指定的SQL语句，后续可以重复使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSqlTemplatesRequest 请求对象
     * @return SyncInvoker<CreateSqlTemplatesRequest, CreateSqlTemplatesResponse>
     */
    public SyncInvoker<CreateSqlTemplatesRequest, CreateSqlTemplatesResponse> createSqlTemplatesInvoker(
        CreateSqlTemplatesRequest request) {
        return new SyncInvoker<CreateSqlTemplatesRequest, CreateSqlTemplatesResponse>(request,
            DliMeta.createSqlTemplates, hcClient);
    }

    /**
     * 批量删除SQL模板
     *
     * 该API用于批量删除SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlTemplatesRequest 请求对象
     * @return DeleteSqlTemplatesResponse
     */
    public DeleteSqlTemplatesResponse deleteSqlTemplates(DeleteSqlTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteSqlTemplates);
    }

    /**
     * 批量删除SQL模板
     *
     * 该API用于批量删除SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlTemplatesRequest 请求对象
     * @return SyncInvoker<DeleteSqlTemplatesRequest, DeleteSqlTemplatesResponse>
     */
    public SyncInvoker<DeleteSqlTemplatesRequest, DeleteSqlTemplatesResponse> deleteSqlTemplatesInvoker(
        DeleteSqlTemplatesRequest request) {
        return new SyncInvoker<DeleteSqlTemplatesRequest, DeleteSqlTemplatesResponse>(request,
            DliMeta.deleteSqlTemplates, hcClient);
    }

    /**
     * 查询作业模板列表
     *
     * 该API用于查询作业模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobTemplatesRequest 请求对象
     * @return ListJobTemplatesResponse
     */
    public ListJobTemplatesResponse listJobTemplates(ListJobTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listJobTemplates);
    }

    /**
     * 查询作业模板列表
     *
     * 该API用于查询作业模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobTemplatesRequest 请求对象
     * @return SyncInvoker<ListJobTemplatesRequest, ListJobTemplatesResponse>
     */
    public SyncInvoker<ListJobTemplatesRequest, ListJobTemplatesResponse> listJobTemplatesInvoker(
        ListJobTemplatesRequest request) {
        return new SyncInvoker<ListJobTemplatesRequest, ListJobTemplatesResponse>(request, DliMeta.listJobTemplates,
            hcClient);
    }

    /**
     * 获取作业模板
     *
     * 该API用于获取作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobTemplateRequest 请求对象
     * @return ShowJobTemplateResponse
     */
    public ShowJobTemplateResponse showJobTemplate(ShowJobTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showJobTemplate);
    }

    /**
     * 获取作业模板
     *
     * 该API用于获取作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobTemplateRequest 请求对象
     * @return SyncInvoker<ShowJobTemplateRequest, ShowJobTemplateResponse>
     */
    public SyncInvoker<ShowJobTemplateRequest, ShowJobTemplateResponse> showJobTemplateInvoker(
        ShowJobTemplateRequest request) {
        return new SyncInvoker<ShowJobTemplateRequest, ShowJobTemplateResponse>(request, DliMeta.showJobTemplate,
            hcClient);
    }

    /**
     * 查询所有SQL样例模板
     *
     * 该API用于查询所有SQL样例模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlSampleTemplatesRequest 请求对象
     * @return ShowSqlSampleTemplatesResponse
     */
    public ShowSqlSampleTemplatesResponse showSqlSampleTemplates(ShowSqlSampleTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showSqlSampleTemplates);
    }

    /**
     * 查询所有SQL样例模板
     *
     * 该API用于查询所有SQL样例模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlSampleTemplatesRequest 请求对象
     * @return SyncInvoker<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse>
     */
    public SyncInvoker<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse> showSqlSampleTemplatesInvoker(
        ShowSqlSampleTemplatesRequest request) {
        return new SyncInvoker<ShowSqlSampleTemplatesRequest, ShowSqlSampleTemplatesResponse>(request,
            DliMeta.showSqlSampleTemplates, hcClient);
    }

    /**
     * 查看所有SQL模板
     *
     * 该API用查看用户保存的所有SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlTemplatesRequest 请求对象
     * @return ShowSqlTemplatesResponse
     */
    public ShowSqlTemplatesResponse showSqlTemplates(ShowSqlTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showSqlTemplates);
    }

    /**
     * 查看所有SQL模板
     *
     * 该API用查看用户保存的所有SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlTemplatesRequest 请求对象
     * @return SyncInvoker<ShowSqlTemplatesRequest, ShowSqlTemplatesResponse>
     */
    public SyncInvoker<ShowSqlTemplatesRequest, ShowSqlTemplatesResponse> showSqlTemplatesInvoker(
        ShowSqlTemplatesRequest request) {
        return new SyncInvoker<ShowSqlTemplatesRequest, ShowSqlTemplatesResponse>(request, DliMeta.showSqlTemplates,
            hcClient);
    }

    /**
     * 修改作业模板
     *
     * 该API用于修改作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobTemplatesRequest 请求对象
     * @return UpdateJobTemplatesResponse
     */
    public UpdateJobTemplatesResponse updateJobTemplates(UpdateJobTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateJobTemplates);
    }

    /**
     * 修改作业模板
     *
     * 该API用于修改作业模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobTemplatesRequest 请求对象
     * @return SyncInvoker<UpdateJobTemplatesRequest, UpdateJobTemplatesResponse>
     */
    public SyncInvoker<UpdateJobTemplatesRequest, UpdateJobTemplatesResponse> updateJobTemplatesInvoker(
        UpdateJobTemplatesRequest request) {
        return new SyncInvoker<UpdateJobTemplatesRequest, UpdateJobTemplatesResponse>(request,
            DliMeta.updateJobTemplates, hcClient);
    }

    /**
     * 更新SQL模板
     *
     * 该API用于更新SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlTemplatesRequest 请求对象
     * @return UpdateSqlTemplatesResponse
     */
    public UpdateSqlTemplatesResponse updateSqlTemplates(UpdateSqlTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateSqlTemplates);
    }

    /**
     * 更新SQL模板
     *
     * 该API用于更新SQL模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlTemplatesRequest 请求对象
     * @return SyncInvoker<UpdateSqlTemplatesRequest, UpdateSqlTemplatesResponse>
     */
    public SyncInvoker<UpdateSqlTemplatesRequest, UpdateSqlTemplatesResponse> updateSqlTemplatesInvoker(
        UpdateSqlTemplatesRequest request) {
        return new SyncInvoker<UpdateSqlTemplatesRequest, UpdateSqlTemplatesResponse>(request,
            DliMeta.updateSqlTemplates, hcClient);
    }

    /**
     * 绑定队列
     *
     * 该API用于在已创建的增强型跨源中绑定队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateConnectionQueueRequest 请求对象
     * @return AssociateConnectionQueueResponse
     */
    public AssociateConnectionQueueResponse associateConnectionQueue(AssociateConnectionQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.associateConnectionQueue);
    }

    /**
     * 绑定队列
     *
     * 该API用于在已创建的增强型跨源中绑定队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateConnectionQueueRequest 请求对象
     * @return SyncInvoker<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse>
     */
    public SyncInvoker<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse> associateConnectionQueueInvoker(
        AssociateConnectionQueueRequest request) {
        return new SyncInvoker<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse>(request,
            DliMeta.associateConnectionQueue, hcClient);
    }

    /**
     * 关联队列到弹性资源池
     *
     * 关联队列到弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateQueueToElasticResourcePoolRequest 请求对象
     * @return AssociateQueueToElasticResourcePoolResponse
     */
    public AssociateQueueToElasticResourcePoolResponse associateQueueToElasticResourcePool(
        AssociateQueueToElasticResourcePoolRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.associateQueueToElasticResourcePool);
    }

    /**
     * 关联队列到弹性资源池
     *
     * 关联队列到弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateQueueToElasticResourcePoolRequest 请求对象
     * @return SyncInvoker<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse>
     */
    public SyncInvoker<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse> associateQueueToElasticResourcePoolInvoker(
        AssociateQueueToElasticResourcePoolRequest request) {
        return new SyncInvoker<AssociateQueueToElasticResourcePoolRequest, AssociateQueueToElasticResourcePoolResponse>(
            request, DliMeta.associateQueueToElasticResourcePool, hcClient);
    }

    /**
     * 数据赋权（用户、项目）
     *
     * 该API用于将DLI资源权限赋给、回收、更新指定的其他用户或项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeResourceRequest 请求对象
     * @return AuthorizeResourceResponse
     */
    public AuthorizeResourceResponse authorizeResource(AuthorizeResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.authorizeResource);
    }

    /**
     * 数据赋权（用户、项目）
     *
     * 该API用于将DLI资源权限赋给、回收、更新指定的其他用户或项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeResourceRequest 请求对象
     * @return SyncInvoker<AuthorizeResourceRequest, AuthorizeResourceResponse>
     */
    public SyncInvoker<AuthorizeResourceRequest, AuthorizeResourceResponse> authorizeResourceInvoker(
        AuthorizeResourceRequest request) {
        return new SyncInvoker<AuthorizeResourceRequest, AuthorizeResourceResponse>(request, DliMeta.authorizeResource,
            hcClient);
    }

    /**
     * 批量删除队列定时扩缩容计划
     *
     * 该API用于批量删除队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteQueuePlansRequest 请求对象
     * @return BatchDeleteQueuePlansResponse
     */
    public BatchDeleteQueuePlansResponse batchDeleteQueuePlans(BatchDeleteQueuePlansRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.batchDeleteQueuePlans);
    }

    /**
     * 批量删除队列定时扩缩容计划
     *
     * 该API用于批量删除队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteQueuePlansRequest 请求对象
     * @return SyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse>
     */
    public SyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> batchDeleteQueuePlansInvoker(
        BatchDeleteQueuePlansRequest request) {
        return new SyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse>(request,
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
     * @return ChangeAuthorizationResponse
     */
    public ChangeAuthorizationResponse changeAuthorization(ChangeAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.changeAuthorization);
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
     * @return SyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse>
     */
    public SyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse> changeAuthorizationInvoker(
        ChangeAuthorizationRequest request) {
        return new SyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse>(request,
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
     * @return ChangeQueuePlanResponse
     */
    public ChangeQueuePlanResponse changeQueuePlan(ChangeQueuePlanRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.changeQueuePlan);
    }

    /**
     * 修改队列定时扩缩容计划
     *
     * 该API用于修改指定ID的队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeQueuePlanRequest 请求对象
     * @return SyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse>
     */
    public SyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse> changeQueuePlanInvoker(
        ChangeQueuePlanRequest request) {
        return new SyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse>(request, DliMeta.changeQueuePlan,
            hcClient);
    }

    /**
     * 创建地址连通性请求
     *
     * 创建地址连通性请求API接口，往指定集群发送地址连通性测试请求，并将测试地址插入表内
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckConnectionRequest 请求对象
     * @return CheckConnectionResponse
     */
    public CheckConnectionResponse checkConnection(CheckConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.checkConnection);
    }

    /**
     * 创建地址连通性请求
     *
     * 创建地址连通性请求API接口，往指定集群发送地址连通性测试请求，并将测试地址插入表内
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckConnectionRequest 请求对象
     * @return SyncInvoker<CheckConnectionRequest, CheckConnectionResponse>
     */
    public SyncInvoker<CheckConnectionRequest, CheckConnectionResponse> checkConnectionInvoker(
        CheckConnectionRequest request) {
        return new SyncInvoker<CheckConnectionRequest, CheckConnectionResponse>(request, DliMeta.checkConnection,
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
     * @return CreateAuthInfoResponse
     */
    public CreateAuthInfoResponse createAuthInfo(CreateAuthInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createAuthInfo);
    }

    /**
     * 创建跨源认证
     *
     * 该API用于创建跨源认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthInfoRequest 请求对象
     * @return SyncInvoker<CreateAuthInfoRequest, CreateAuthInfoResponse>
     */
    public SyncInvoker<CreateAuthInfoRequest, CreateAuthInfoResponse> createAuthInfoInvoker(
        CreateAuthInfoRequest request) {
        return new SyncInvoker<CreateAuthInfoRequest, CreateAuthInfoResponse>(request, DliMeta.createAuthInfo,
            hcClient);
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
     * @return CreateDatasourceConnectionResponse
     */
    public CreateDatasourceConnectionResponse createDatasourceConnection(CreateDatasourceConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createDatasourceConnection);
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
     * @return SyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse>
     */
    public SyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> createDatasourceConnectionInvoker(
        CreateDatasourceConnectionRequest request) {
        return new SyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse>(request,
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
     * @return CreateDliAgencyResponse
     */
    public CreateDliAgencyResponse createDliAgency(CreateDliAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createDliAgency);
    }

    /**
     * 创建DLI委托
     *
     * 创建DLI委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDliAgencyRequest 请求对象
     * @return SyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse>
     */
    public SyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse> createDliAgencyInvoker(
        CreateDliAgencyRequest request) {
        return new SyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse>(request, DliMeta.createDliAgency,
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
     * @return CreateElasticResourcePoolResponse
     */
    public CreateElasticResourcePoolResponse createElasticResourcePool(CreateElasticResourcePoolRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createElasticResourcePool);
    }

    /**
     * 创建弹性资源池
     *
     * 创建弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateElasticResourcePoolRequest 请求对象
     * @return SyncInvoker<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse>
     */
    public SyncInvoker<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse> createElasticResourcePoolInvoker(
        CreateElasticResourcePoolRequest request) {
        return new SyncInvoker<CreateElasticResourcePoolRequest, CreateElasticResourcePoolResponse>(request,
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
     * @return CreateEnhancedConnectionResponse
     */
    public CreateEnhancedConnectionResponse createEnhancedConnection(CreateEnhancedConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createEnhancedConnection);
    }

    /**
     * 创建增强型跨源连接
     *
     * 该API用于创建与其他服务的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnhancedConnectionRequest 请求对象
     * @return SyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse>
     */
    public SyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> createEnhancedConnectionInvoker(
        CreateEnhancedConnectionRequest request) {
        return new SyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse>(request,
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
     * @return CreateEnhancedConnectionRoutesResponse
     */
    public CreateEnhancedConnectionRoutesResponse createEnhancedConnectionRoutes(
        CreateEnhancedConnectionRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createEnhancedConnectionRoutes);
    }

    /**
     * 创建路由
     *
     * 该API用于创建跨源需要的路由。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnhancedConnectionRoutesRequest 请求对象
     * @return SyncInvoker<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse>
     */
    public SyncInvoker<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse> createEnhancedConnectionRoutesInvoker(
        CreateEnhancedConnectionRoutesRequest request) {
        return new SyncInvoker<CreateEnhancedConnectionRoutesRequest, CreateEnhancedConnectionRoutesResponse>(request,
            DliMeta.createEnhancedConnectionRoutes, hcClient);
    }

    /**
     * 创建DLI全局变量
     *
     * 创建全局变量。全局变量用于替换SQL作业中的敏感数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGlobalValueRequest 请求对象
     * @return CreateGlobalValueResponse
     */
    public CreateGlobalValueResponse createGlobalValue(CreateGlobalValueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createGlobalValue);
    }

    /**
     * 创建DLI全局变量
     *
     * 创建全局变量。全局变量用于替换SQL作业中的敏感数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGlobalValueRequest 请求对象
     * @return SyncInvoker<CreateGlobalValueRequest, CreateGlobalValueResponse>
     */
    public SyncInvoker<CreateGlobalValueRequest, CreateGlobalValueResponse> createGlobalValueInvoker(
        CreateGlobalValueRequest request) {
        return new SyncInvoker<CreateGlobalValueRequest, CreateGlobalValueResponse>(request, DliMeta.createGlobalValue,
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
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueue(CreateQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createQueue);
    }

    /**
     * 创建队列
     *
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueueRequest 请求对象
     * @return SyncInvoker<CreateQueueRequest, CreateQueueResponse>
     */
    public SyncInvoker<CreateQueueRequest, CreateQueueResponse> createQueueInvoker(CreateQueueRequest request) {
        return new SyncInvoker<CreateQueueRequest, CreateQueueResponse>(request, DliMeta.createQueue, hcClient);
    }

    /**
     * 创建队列定时扩缩容计划
     *
     * 创建队列定时扩缩容计划接口，对指定的队列创建定时规格变更计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueuePlanRequest 请求对象
     * @return CreateQueuePlanResponse
     */
    public CreateQueuePlanResponse createQueuePlan(CreateQueuePlanRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createQueuePlan);
    }

    /**
     * 创建队列定时扩缩容计划
     *
     * 创建队列定时扩缩容计划接口，对指定的队列创建定时规格变更计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQueuePlanRequest 请求对象
     * @return SyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse>
     */
    public SyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse> createQueuePlanInvoker(
        CreateQueuePlanRequest request) {
        return new SyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse>(request, DliMeta.createQueuePlan,
            hcClient);
    }

    /**
     * 删除跨源认证
     *
     * 该API用于删除跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuthInfoRequest 请求对象
     * @return DeleteAuthInfoResponse
     */
    public DeleteAuthInfoResponse deleteAuthInfo(DeleteAuthInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteAuthInfo);
    }

    /**
     * 删除跨源认证
     *
     * 该API用于删除跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuthInfoRequest 请求对象
     * @return SyncInvoker<DeleteAuthInfoRequest, DeleteAuthInfoResponse>
     */
    public SyncInvoker<DeleteAuthInfoRequest, DeleteAuthInfoResponse> deleteAuthInfoInvoker(
        DeleteAuthInfoRequest request) {
        return new SyncInvoker<DeleteAuthInfoRequest, DeleteAuthInfoResponse>(request, DliMeta.deleteAuthInfo,
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
     * @return DeleteDatasourceConnectionResponse
     */
    public DeleteDatasourceConnectionResponse deleteDatasourceConnection(DeleteDatasourceConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteDatasourceConnection);
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
     * @return SyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse>
     */
    public SyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> deleteDatasourceConnectionInvoker(
        DeleteDatasourceConnectionRequest request) {
        return new SyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse>(request,
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
     * @return DeleteElasticResourcePoolResponse
     */
    public DeleteElasticResourcePoolResponse deleteElasticResourcePool(DeleteElasticResourcePoolRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteElasticResourcePool);
    }

    /**
     * 删除弹性资源池
     *
     * 删除弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteElasticResourcePoolRequest 请求对象
     * @return SyncInvoker<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse>
     */
    public SyncInvoker<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse> deleteElasticResourcePoolInvoker(
        DeleteElasticResourcePoolRequest request) {
        return new SyncInvoker<DeleteElasticResourcePoolRequest, DeleteElasticResourcePoolResponse>(request,
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
     * @return DeleteEnhancedConnectionResponse
     */
    public DeleteEnhancedConnectionResponse deleteEnhancedConnection(DeleteEnhancedConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteEnhancedConnection);
    }

    /**
     * 删除增强型跨源连接
     *
     * 该API用于删除已创建的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnhancedConnectionRequest 请求对象
     * @return SyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse>
     */
    public SyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> deleteEnhancedConnectionInvoker(
        DeleteEnhancedConnectionRequest request) {
        return new SyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse>(request,
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
     * @return DeleteEnhancedConnectionRoutesResponse
     */
    public DeleteEnhancedConnectionRoutesResponse deleteEnhancedConnectionRoutes(
        DeleteEnhancedConnectionRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteEnhancedConnectionRoutes);
    }

    /**
     * 删除路由
     *
     * 该API用于删除跨源需要的路由。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnhancedConnectionRoutesRequest 请求对象
     * @return SyncInvoker<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse>
     */
    public SyncInvoker<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse> deleteEnhancedConnectionRoutesInvoker(
        DeleteEnhancedConnectionRoutesRequest request) {
        return new SyncInvoker<DeleteEnhancedConnectionRoutesRequest, DeleteEnhancedConnectionRoutesResponse>(request,
            DliMeta.deleteEnhancedConnectionRoutes, hcClient);
    }

    /**
     * 删除DLI全局变量
     *
     * 删除全局变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGlobalValueRequest 请求对象
     * @return DeleteGlobalValueResponse
     */
    public DeleteGlobalValueResponse deleteGlobalValue(DeleteGlobalValueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteGlobalValue);
    }

    /**
     * 删除DLI全局变量
     *
     * 删除全局变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGlobalValueRequest 请求对象
     * @return SyncInvoker<DeleteGlobalValueRequest, DeleteGlobalValueResponse>
     */
    public SyncInvoker<DeleteGlobalValueRequest, DeleteGlobalValueResponse> deleteGlobalValueInvoker(
        DeleteGlobalValueRequest request) {
        return new SyncInvoker<DeleteGlobalValueRequest, DeleteGlobalValueResponse>(request, DliMeta.deleteGlobalValue,
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
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteQueue);
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
     * @return SyncInvoker<DeleteQueueRequest, DeleteQueueResponse>
     */
    public SyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueInvoker(DeleteQueueRequest request) {
        return new SyncInvoker<DeleteQueueRequest, DeleteQueueResponse>(request, DliMeta.deleteQueue, hcClient);
    }

    /**
     * 单个删除队列定时扩缩容计划
     *
     * 该API用于删除指定ID的队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueuePlanRequest 请求对象
     * @return DeleteQueuePlanResponse
     */
    public DeleteQueuePlanResponse deleteQueuePlan(DeleteQueuePlanRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteQueuePlan);
    }

    /**
     * 单个删除队列定时扩缩容计划
     *
     * 该API用于删除指定ID的队列定时扩缩容计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQueuePlanRequest 请求对象
     * @return SyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse>
     */
    public SyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse> deleteQueuePlanInvoker(
        DeleteQueuePlanRequest request) {
        return new SyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse>(request, DliMeta.deleteQueuePlan,
            hcClient);
    }

    /**
     * 删除组内资源包
     *
     * 该API用于删除某个project某个分组下的资源包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteResource);
    }

    /**
     * 删除组内资源包
     *
     * 该API用于删除某个project某个分组下的资源包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public SyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceInvoker(
        DeleteResourceRequest request) {
        return new SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>(request, DliMeta.deleteResource,
            hcClient);
    }

    /**
     * 解绑队列
     *
     * 该API用于在增强型跨源中解绑已绑定的队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateConnectionQueueRequest 请求对象
     * @return DisassociateConnectionQueueResponse
     */
    public DisassociateConnectionQueueResponse disassociateConnectionQueue(DisassociateConnectionQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.disassociateConnectionQueue);
    }

    /**
     * 解绑队列
     *
     * 该API用于在增强型跨源中解绑已绑定的队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateConnectionQueueRequest 请求对象
     * @return SyncInvoker<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse>
     */
    public SyncInvoker<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse> disassociateConnectionQueueInvoker(
        DisassociateConnectionQueueRequest request) {
        return new SyncInvoker<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse>(request,
            DliMeta.disassociateConnectionQueue, hcClient);
    }

    /**
     * 获取跨源认证列表
     *
     * 该API用于查询跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthInfoRequest 请求对象
     * @return ListAuthInfoResponse
     */
    public ListAuthInfoResponse listAuthInfo(ListAuthInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listAuthInfo);
    }

    /**
     * 获取跨源认证列表
     *
     * 该API用于查询跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuthInfoRequest 请求对象
     * @return SyncInvoker<ListAuthInfoRequest, ListAuthInfoResponse>
     */
    public SyncInvoker<ListAuthInfoRequest, ListAuthInfoResponse> listAuthInfoInvoker(ListAuthInfoRequest request) {
        return new SyncInvoker<ListAuthInfoRequest, ListAuthInfoResponse>(request, DliMeta.listAuthInfo, hcClient);
    }

    /**
     * 查看数据库的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return ListDatabaseUsersResponse
     */
    public ListDatabaseUsersResponse listDatabaseUsers(ListDatabaseUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listDatabaseUsers);
    }

    /**
     * 查看数据库的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersInvoker(
        ListDatabaseUsersRequest request) {
        return new SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>(request, DliMeta.listDatabaseUsers,
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
     * @return ListDatasourceConnectionsResponse
     */
    public ListDatasourceConnectionsResponse listDatasourceConnections(ListDatasourceConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listDatasourceConnections);
    }

    /**
     * 查询经典型跨源连接列表
     *
     * 该API用于查询该用户已创建的经典型跨源连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourceConnectionsRequest 请求对象
     * @return SyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse>
     */
    public SyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> listDatasourceConnectionsInvoker(
        ListDatasourceConnectionsRequest request) {
        return new SyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse>(request,
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
     * @return ListElasticResourcePoolQueuesResponse
     */
    public ListElasticResourcePoolQueuesResponse listElasticResourcePoolQueues(
        ListElasticResourcePoolQueuesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listElasticResourcePoolQueues);
    }

    /**
     * 查询弹性资源池所属队列
     *
     * 查询弹性资源池所属队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolQueuesRequest 请求对象
     * @return SyncInvoker<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse>
     */
    public SyncInvoker<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse> listElasticResourcePoolQueuesInvoker(
        ListElasticResourcePoolQueuesRequest request) {
        return new SyncInvoker<ListElasticResourcePoolQueuesRequest, ListElasticResourcePoolQueuesResponse>(request,
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
     * @return ListElasticResourcePoolScaleRecordsResponse
     */
    public ListElasticResourcePoolScaleRecordsResponse listElasticResourcePoolScaleRecords(
        ListElasticResourcePoolScaleRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listElasticResourcePoolScaleRecords);
    }

    /**
     * 弹性资源池扩缩容历史记录
     *
     * 查询当前弹性资源池扩缩容历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolScaleRecordsRequest 请求对象
     * @return SyncInvoker<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse>
     */
    public SyncInvoker<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse> listElasticResourcePoolScaleRecordsInvoker(
        ListElasticResourcePoolScaleRecordsRequest request) {
        return new SyncInvoker<ListElasticResourcePoolScaleRecordsRequest, ListElasticResourcePoolScaleRecordsResponse>(
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
     * @return ListElasticResourcePoolsResponse
     */
    public ListElasticResourcePoolsResponse listElasticResourcePools(ListElasticResourcePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listElasticResourcePools);
    }

    /**
     * 查询所有弹性资源池
     *
     * 查询所有弹性资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElasticResourcePoolsRequest 请求对象
     * @return SyncInvoker<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse>
     */
    public SyncInvoker<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse> listElasticResourcePoolsInvoker(
        ListElasticResourcePoolsRequest request) {
        return new SyncInvoker<ListElasticResourcePoolsRequest, ListElasticResourcePoolsResponse>(request,
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
     * @return ListEnhancedConnectionsResponse
     */
    public ListEnhancedConnectionsResponse listEnhancedConnections(ListEnhancedConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listEnhancedConnections);
    }

    /**
     * 查询增强型跨源连接列表
     *
     * 该API用于查询该用户已创建的增强型跨源连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnhancedConnectionsRequest 请求对象
     * @return SyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse>
     */
    public SyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> listEnhancedConnectionsInvoker(
        ListEnhancedConnectionsRequest request) {
        return new SyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse>(request,
            DliMeta.listEnhancedConnections, hcClient);
    }

    /**
     * 查询DLI全局变量列表
     *
     * 查询全局变量列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGlobalValuesRequest 请求对象
     * @return ListGlobalValuesResponse
     */
    public ListGlobalValuesResponse listGlobalValues(ListGlobalValuesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listGlobalValues);
    }

    /**
     * 查询DLI全局变量列表
     *
     * 查询全局变量列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGlobalValuesRequest 请求对象
     * @return SyncInvoker<ListGlobalValuesRequest, ListGlobalValuesResponse>
     */
    public SyncInvoker<ListGlobalValuesRequest, ListGlobalValuesResponse> listGlobalValuesInvoker(
        ListGlobalValuesRequest request) {
        return new SyncInvoker<ListGlobalValuesRequest, ListGlobalValuesResponse>(request, DliMeta.listGlobalValues,
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
     * @return ListQueuePlansResponse
     */
    public ListQueuePlansResponse listQueuePlans(ListQueuePlansRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listQueuePlans);
    }

    /**
     * 查看队列定时扩缩容计划
     *
     * 查看队列定时扩缩容计划接口，列出指定队列定时规格变更计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueuePlansRequest 请求对象
     * @return SyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse>
     */
    public SyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse> listQueuePlansInvoker(
        ListQueuePlansRequest request) {
        return new SyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse>(request, DliMeta.listQueuePlans,
            hcClient);
    }

    /**
     * 查看队列的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueueUsersRequest 请求对象
     * @return ListQueueUsersResponse
     */
    public ListQueueUsersResponse listQueueUsers(ListQueueUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listQueueUsers);
    }

    /**
     * 查看队列的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueueUsersRequest 请求对象
     * @return SyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse>
     */
    public SyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse> listQueueUsersInvoker(
        ListQueueUsersRequest request) {
        return new SyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse>(request, DliMeta.listQueueUsers,
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
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueues(ListQueuesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listQueues);
    }

    /**
     * 查询所有队列
     *
     * 该API用于列出该project下所有的队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueuesRequest 请求对象
     * @return SyncInvoker<ListQueuesRequest, ListQueuesResponse>
     */
    public SyncInvoker<ListQueuesRequest, ListQueuesResponse> listQueuesInvoker(ListQueuesRequest request) {
        return new SyncInvoker<ListQueuesRequest, ListQueuesResponse>(request, DliMeta.listQueues, hcClient);
    }

    /**
     * 查看分组资源列表
     *
     * 该API用于查看某个project下的所有资源，其中包含Group。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listResources);
    }

    /**
     * 查看分组资源列表
     *
     * 该API用于查看某个project下的所有资源，其中包含Group。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, DliMeta.listResources, hcClient);
    }

    /**
     * 查看表的用户权限
     *
     * 该API用于查询指定用户在表上的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablePrivilegesRequest 请求对象
     * @return ListTablePrivilegesResponse
     */
    public ListTablePrivilegesResponse listTablePrivileges(ListTablePrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listTablePrivileges);
    }

    /**
     * 查看表的用户权限
     *
     * 该API用于查询指定用户在表上的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablePrivilegesRequest 请求对象
     * @return SyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse>
     */
    public SyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse> listTablePrivilegesInvoker(
        ListTablePrivilegesRequest request) {
        return new SyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse>(request,
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
     * @return ListTableUsersResponse
     */
    public ListTableUsersResponse listTableUsers(ListTableUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listTableUsers);
    }

    /**
     * 查看表的使用者
     *
     * 该API用于查看有权访问指定表或表的列的所有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableUsersRequest 请求对象
     * @return SyncInvoker<ListTableUsersRequest, ListTableUsersResponse>
     */
    public SyncInvoker<ListTableUsersRequest, ListTableUsersResponse> listTableUsersInvoker(
        ListTableUsersRequest request) {
        return new SyncInvoker<ListTableUsersRequest, ListTableUsersResponse>(request, DliMeta.listTableUsers,
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
     * @return RegisterAuthorizedQueueResponse
     */
    public RegisterAuthorizedQueueResponse registerAuthorizedQueue(RegisterAuthorizedQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.registerAuthorizedQueue);
    }

    /**
     * 队列赋权
     *
     * 该API用于与其他用户共享指定的队列，可以给用户赋使用指定的队列的权限或者收回使用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterAuthorizedQueueRequest 请求对象
     * @return SyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse>
     */
    public SyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> registerAuthorizedQueueInvoker(
        RegisterAuthorizedQueueRequest request) {
        return new SyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse>(request,
            DliMeta.registerAuthorizedQueue, hcClient);
    }

    /**
     * 重启/扩容/缩容队列
     *
     * 该功能用于重新启动队列、扩容队列、缩容队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueueActionRequest 请求对象
     * @return RunQueueActionResponse
     */
    public RunQueueActionResponse runQueueAction(RunQueueActionRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.runQueueAction);
    }

    /**
     * 重启/扩容/缩容队列
     *
     * 该功能用于重新启动队列、扩容队列、缩容队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueueActionRequest 请求对象
     * @return SyncInvoker<RunQueueActionRequest, RunQueueActionResponse>
     */
    public SyncInvoker<RunQueueActionRequest, RunQueueActionResponse> runQueueActionInvoker(
        RunQueueActionRequest request) {
        return new SyncInvoker<RunQueueActionRequest, RunQueueActionResponse>(request, DliMeta.runQueueAction,
            hcClient);
    }

    /**
     * 查询经典型跨源连接
     *
     * 该API用于查询该用户指定的已创建的经典型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasourceConnectionRequest 请求对象
     * @return ShowDatasourceConnectionResponse
     */
    public ShowDatasourceConnectionResponse showDatasourceConnection(ShowDatasourceConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showDatasourceConnection);
    }

    /**
     * 查询经典型跨源连接
     *
     * 该API用于查询该用户指定的已创建的经典型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatasourceConnectionRequest 请求对象
     * @return SyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse>
     */
    public SyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> showDatasourceConnectionInvoker(
        ShowDatasourceConnectionRequest request) {
        return new SyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse>(request,
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
     * @return ShowDliAgencyResponse
     */
    public ShowDliAgencyResponse showDliAgency(ShowDliAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showDliAgency);
    }

    /**
     * 获取dli委托信息
     *
     * 获取dli委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDliAgencyRequest 请求对象
     * @return SyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse>
     */
    public SyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse> showDliAgencyInvoker(ShowDliAgencyRequest request) {
        return new SyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse>(request, DliMeta.showDliAgency, hcClient);
    }

    /**
     * 查询增强型跨源连接
     *
     * 该API用于查询该用户指定的已创建的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnhancedConnectionRequest 请求对象
     * @return ShowEnhancedConnectionResponse
     */
    public ShowEnhancedConnectionResponse showEnhancedConnection(ShowEnhancedConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showEnhancedConnection);
    }

    /**
     * 查询增强型跨源连接
     *
     * 该API用于查询该用户指定的已创建的增强型跨源连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnhancedConnectionRequest 请求对象
     * @return SyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse>
     */
    public SyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> showEnhancedConnectionInvoker(
        ShowEnhancedConnectionRequest request) {
        return new SyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse>(request,
            DliMeta.showEnhancedConnection, hcClient);
    }

    /**
     * 查询增强型跨源授权信息
     *
     * 该API用于查询增强型跨源连接授权的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnhancedPrivilegeRequest 请求对象
     * @return ShowEnhancedPrivilegeResponse
     */
    public ShowEnhancedPrivilegeResponse showEnhancedPrivilege(ShowEnhancedPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showEnhancedPrivilege);
    }

    /**
     * 查询增强型跨源授权信息
     *
     * 该API用于查询增强型跨源连接授权的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnhancedPrivilegeRequest 请求对象
     * @return SyncInvoker<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse>
     */
    public SyncInvoker<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse> showEnhancedPrivilegeInvoker(
        ShowEnhancedPrivilegeRequest request) {
        return new SyncInvoker<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse>(request,
            DliMeta.showEnhancedPrivilege, hcClient);
    }

    /**
     * 查询指定地址连通性测试详情
     *
     * 该API用于在连通性测试提交后查询连通性结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeConnectivityRequest 请求对象
     * @return ShowNodeConnectivityResponse
     */
    public ShowNodeConnectivityResponse showNodeConnectivity(ShowNodeConnectivityRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showNodeConnectivity);
    }

    /**
     * 查询指定地址连通性测试详情
     *
     * 该API用于在连通性测试提交后查询连通性结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeConnectivityRequest 请求对象
     * @return SyncInvoker<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse>
     */
    public SyncInvoker<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse> showNodeConnectivityInvoker(
        ShowNodeConnectivityRequest request) {
        return new SyncInvoker<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse>(request,
            DliMeta.showNodeConnectivity, hcClient);
    }

    /**
     * 查看赋权对象的用者权限信息
     *
     * 获取对象赋权用户的权限信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowObjectUserRequest 请求对象
     * @return ShowObjectUserResponse
     */
    public ShowObjectUserResponse showObjectUser(ShowObjectUserRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showObjectUser);
    }

    /**
     * 查看赋权对象的用者权限信息
     *
     * 获取对象赋权用户的权限信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowObjectUserRequest 请求对象
     * @return SyncInvoker<ShowObjectUserRequest, ShowObjectUserResponse>
     */
    public SyncInvoker<ShowObjectUserRequest, ShowObjectUserResponse> showObjectUserInvoker(
        ShowObjectUserRequest request) {
        return new SyncInvoker<ShowObjectUserRequest, ShowObjectUserResponse>(request, DliMeta.showObjectUser,
            hcClient);
    }

    /**
     * 查询队列详情
     *
     * 该API用于列出该project下指定的队列详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQueueDetailRequest 请求对象
     * @return ShowQueueDetailResponse
     */
    public ShowQueueDetailResponse showQueueDetail(ShowQueueDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showQueueDetail);
    }

    /**
     * 查询队列详情
     *
     * 该API用于列出该project下指定的队列详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQueueDetailRequest 请求对象
     * @return SyncInvoker<ShowQueueDetailRequest, ShowQueueDetailResponse>
     */
    public SyncInvoker<ShowQueueDetailRequest, ShowQueueDetailResponse> showQueueDetailInvoker(
        ShowQueueDetailRequest request) {
        return new SyncInvoker<ShowQueueDetailRequest, ShowQueueDetailResponse>(request, DliMeta.showQueueDetail,
            hcClient);
    }

    /**
     * 查看组内资源包
     *
     * 该API用于查看某个project某个分组下的具体资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceInfoRequest 请求对象
     * @return ShowResourceInfoResponse
     */
    public ShowResourceInfoResponse showResourceInfo(ShowResourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showResourceInfo);
    }

    /**
     * 查看组内资源包
     *
     * 该API用于查看某个project某个分组下的具体资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceInfoRequest 请求对象
     * @return SyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse>
     */
    public SyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse> showResourceInfoInvoker(
        ShowResourceInfoRequest request) {
        return new SyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse>(request, DliMeta.showResourceInfo,
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
     * @return UpdateAuthInfoResponse
     */
    public UpdateAuthInfoResponse updateAuthInfo(UpdateAuthInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateAuthInfo);
    }

    /**
     * 更新跨源认证
     *
     * 该API用于更新跨源认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuthInfoRequest 请求对象
     * @return SyncInvoker<UpdateAuthInfoRequest, UpdateAuthInfoResponse>
     */
    public SyncInvoker<UpdateAuthInfoRequest, UpdateAuthInfoResponse> updateAuthInfoInvoker(
        UpdateAuthInfoRequest request) {
        return new SyncInvoker<UpdateAuthInfoRequest, UpdateAuthInfoResponse>(request, DliMeta.updateAuthInfo,
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
     * @return UpdateElasticResourcePoolResponse
     */
    public UpdateElasticResourcePoolResponse updateElasticResourcePool(UpdateElasticResourcePoolRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateElasticResourcePool);
    }

    /**
     * 修改弹性资源池信息
     *
     * 修改弹性资源池信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateElasticResourcePoolRequest 请求对象
     * @return SyncInvoker<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse>
     */
    public SyncInvoker<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse> updateElasticResourcePoolInvoker(
        UpdateElasticResourcePoolRequest request) {
        return new SyncInvoker<UpdateElasticResourcePoolRequest, UpdateElasticResourcePoolResponse>(request,
            DliMeta.updateElasticResourcePool, hcClient);
    }

    /**
     * 修改弹性资源池关联的队列优先级
     *
     * 设置弹性资源池指定队列的扩缩容策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateElasticResourcePoolQueueInfoRequest 请求对象
     * @return UpdateElasticResourcePoolQueueInfoResponse
     */
    public UpdateElasticResourcePoolQueueInfoResponse updateElasticResourcePoolQueueInfo(
        UpdateElasticResourcePoolQueueInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateElasticResourcePoolQueueInfo);
    }

    /**
     * 修改弹性资源池关联的队列优先级
     *
     * 设置弹性资源池指定队列的扩缩容策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateElasticResourcePoolQueueInfoRequest 请求对象
     * @return SyncInvoker<UpdateElasticResourcePoolQueueInfoRequest, UpdateElasticResourcePoolQueueInfoResponse>
     */
    public SyncInvoker<UpdateElasticResourcePoolQueueInfoRequest, UpdateElasticResourcePoolQueueInfoResponse> updateElasticResourcePoolQueueInfoInvoker(
        UpdateElasticResourcePoolQueueInfoRequest request) {
        return new SyncInvoker<UpdateElasticResourcePoolQueueInfoRequest, UpdateElasticResourcePoolQueueInfoResponse>(
            request, DliMeta.updateElasticResourcePoolQueueInfo, hcClient);
    }

    /**
     * 修改DLI全局变量
     *
     * 修改全局变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGlobalValueRequest 请求对象
     * @return UpdateGlobalValueResponse
     */
    public UpdateGlobalValueResponse updateGlobalValue(UpdateGlobalValueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateGlobalValue);
    }

    /**
     * 修改DLI全局变量
     *
     * 修改全局变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGlobalValueRequest 请求对象
     * @return SyncInvoker<UpdateGlobalValueRequest, UpdateGlobalValueResponse>
     */
    public SyncInvoker<UpdateGlobalValueRequest, UpdateGlobalValueResponse> updateGlobalValueInvoker(
        UpdateGlobalValueRequest request) {
        return new SyncInvoker<UpdateGlobalValueRequest, UpdateGlobalValueResponse>(request, DliMeta.updateGlobalValue,
            hcClient);
    }

    /**
     * 修改组或者资源包拥有者
     *
     * 用于修改程序包的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGroupOrResourceOwnerRequest 请求对象
     * @return UpdateGroupOrResourceOwnerResponse
     */
    public UpdateGroupOrResourceOwnerResponse updateGroupOrResourceOwner(UpdateGroupOrResourceOwnerRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateGroupOrResourceOwner);
    }

    /**
     * 修改组或者资源包拥有者
     *
     * 用于修改程序包的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGroupOrResourceOwnerRequest 请求对象
     * @return SyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse>
     */
    public SyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> updateGroupOrResourceOwnerInvoker(
        UpdateGroupOrResourceOwnerRequest request) {
        return new SyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse>(request,
            DliMeta.updateGroupOrResourceOwner, hcClient);
    }

    /**
     * 修改增强型跨源主机信息
     *
     * 该API用于在跨源中修改数据源主机信息，仅支持全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHostMassageRequest 请求对象
     * @return UpdateHostMassageResponse
     */
    public UpdateHostMassageResponse updateHostMassage(UpdateHostMassageRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateHostMassage);
    }

    /**
     * 修改增强型跨源主机信息
     *
     * 该API用于在跨源中修改数据源主机信息，仅支持全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHostMassageRequest 请求对象
     * @return SyncInvoker<UpdateHostMassageRequest, UpdateHostMassageResponse>
     */
    public SyncInvoker<UpdateHostMassageRequest, UpdateHostMassageResponse> updateHostMassageInvoker(
        UpdateHostMassageRequest request) {
        return new SyncInvoker<UpdateHostMassageRequest, UpdateHostMassageResponse>(request, DliMeta.updateHostMassage,
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
     * @return UpdateQueueCidrResponse
     */
    public UpdateQueueCidrResponse updateQueueCidr(UpdateQueueCidrRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateQueueCidr);
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
     * @return SyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse>
     */
    public SyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse> updateQueueCidrInvoker(
        UpdateQueueCidrRequest request) {
        return new SyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse>(request, DliMeta.updateQueueCidr,
            hcClient);
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
     * @return UploadFilesResponse
     */
    public UploadFilesResponse uploadFiles(UploadFilesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.uploadFiles);
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
     * @return SyncInvoker<UploadFilesRequest, UploadFilesResponse>
     */
    public SyncInvoker<UploadFilesRequest, UploadFilesResponse> uploadFilesInvoker(UploadFilesRequest request) {
        return new SyncInvoker<UploadFilesRequest, UploadFilesResponse>(request, DliMeta.uploadFiles, hcClient);
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
     * @return UploadJarsResponse
     */
    public UploadJarsResponse uploadJars(UploadJarsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.uploadJars);
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
     * @return SyncInvoker<UploadJarsRequest, UploadJarsResponse>
     */
    public SyncInvoker<UploadJarsRequest, UploadJarsResponse> uploadJarsInvoker(UploadJarsRequest request) {
        return new SyncInvoker<UploadJarsRequest, UploadJarsResponse>(request, DliMeta.uploadJars, hcClient);
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
     * @return UploadPythonFilesResponse
     */
    public UploadPythonFilesResponse uploadPythonFiles(UploadPythonFilesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.uploadPythonFiles);
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
     * @return SyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse>
     */
    public SyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse> uploadPythonFilesInvoker(
        UploadPythonFilesRequest request) {
        return new SyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse>(request, DliMeta.uploadPythonFiles,
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
     * @return UploadResourcesResponse
     */
    public UploadResourcesResponse uploadResources(UploadResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.uploadResources);
    }

    /**
     * 上传分组资源
     *
     * 该API用于上传分组资源到某个project下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadResourcesRequest 请求对象
     * @return SyncInvoker<UploadResourcesRequest, UploadResourcesResponse>
     */
    public SyncInvoker<UploadResourcesRequest, UploadResourcesResponse> uploadResourcesInvoker(
        UploadResourcesRequest request) {
        return new SyncInvoker<UploadResourcesRequest, UploadResourcesResponse>(request, DliMeta.uploadResources,
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
     * @return BatchDeleteFlinkJobsResponse
     */
    public BatchDeleteFlinkJobsResponse batchDeleteFlinkJobs(BatchDeleteFlinkJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.batchDeleteFlinkJobs);
    }

    /**
     * 批量删除Flink作业
     *
     * 批量删除任何状态的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteFlinkJobsRequest 请求对象
     * @return SyncInvoker<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse>
     */
    public SyncInvoker<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse> batchDeleteFlinkJobsInvoker(
        BatchDeleteFlinkJobsRequest request) {
        return new SyncInvoker<BatchDeleteFlinkJobsRequest, BatchDeleteFlinkJobsResponse>(request,
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
     * @return BatchRunFlinkJobsResponse
     */
    public BatchRunFlinkJobsResponse batchRunFlinkJobs(BatchRunFlinkJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.batchRunFlinkJobs);
    }

    /**
     * 批量运行Flink作业
     *
     * 触发批量运行Flink作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRunFlinkJobsRequest 请求对象
     * @return SyncInvoker<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse>
     */
    public SyncInvoker<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse> batchRunFlinkJobsInvoker(
        BatchRunFlinkJobsRequest request) {
        return new SyncInvoker<BatchRunFlinkJobsRequest, BatchRunFlinkJobsResponse>(request, DliMeta.batchRunFlinkJobs,
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
     * @return ChangeFlinkJobStatusReportResponse
     */
    public ChangeFlinkJobStatusReportResponse changeFlinkJobStatusReport(ChangeFlinkJobStatusReportRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.changeFlinkJobStatusReport);
    }

    /**
     * 边缘Flink作业状态信息上报
     *
     * 该API用于处理边缘Flink作业状态上报信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeFlinkJobStatusReportRequest 请求对象
     * @return SyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse>
     */
    public SyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> changeFlinkJobStatusReportInvoker(
        ChangeFlinkJobStatusReportRequest request) {
        return new SyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse>(request,
            DliMeta.changeFlinkJobStatusReport, hcClient);
    }

    /**
     * 新建Flink Jar作业
     *
     * 用户自定义作业目前支持jar格式，运行在独享集群中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkJarRequest 请求对象
     * @return CreateFlinkJarResponse
     */
    public CreateFlinkJarResponse createFlinkJar(CreateFlinkJarRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createFlinkJar);
    }

    /**
     * 新建Flink Jar作业
     *
     * 用户自定义作业目前支持jar格式，运行在独享集群中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkJarRequest 请求对象
     * @return SyncInvoker<CreateFlinkJarRequest, CreateFlinkJarResponse>
     */
    public SyncInvoker<CreateFlinkJarRequest, CreateFlinkJarResponse> createFlinkJarInvoker(
        CreateFlinkJarRequest request) {
        return new SyncInvoker<CreateFlinkJarRequest, CreateFlinkJarResponse>(request, DliMeta.createFlinkJar,
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
     * @return CreateFlinkSqlJobResponse
     */
    public CreateFlinkSqlJobResponse createFlinkSqlJob(CreateFlinkSqlJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createFlinkSqlJob);
    }

    /**
     * 新建Flink SQL作业
     *
     * 通过POST方式，提交流式SQL作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkSqlJobRequest 请求对象
     * @return SyncInvoker<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse>
     */
    public SyncInvoker<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse> createFlinkSqlJobInvoker(
        CreateFlinkSqlJobRequest request) {
        return new SyncInvoker<CreateFlinkSqlJobRequest, CreateFlinkSqlJobResponse>(request, DliMeta.createFlinkSqlJob,
            hcClient);
    }

    /**
     * 新建Flink作业模板
     *
     * 在DLI服务中新建一个Flink作业模板，最多100个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkTemplateRequest 请求对象
     * @return CreateFlinkTemplateResponse
     */
    public CreateFlinkTemplateResponse createFlinkTemplate(CreateFlinkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createFlinkTemplate);
    }

    /**
     * 新建Flink作业模板
     *
     * 在DLI服务中新建一个Flink作业模板，最多100个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlinkTemplateRequest 请求对象
     * @return SyncInvoker<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse>
     */
    public SyncInvoker<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse> createFlinkTemplateInvoker(
        CreateFlinkTemplateRequest request) {
        return new SyncInvoker<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse>(request,
            DliMeta.createFlinkTemplate, hcClient);
    }

    /**
     * 创建IEF消息通道
     *
     * 该API用于创建IEF消息通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIefMessageChannelRequest 请求对象
     * @return CreateIefMessageChannelResponse
     */
    public CreateIefMessageChannelResponse createIefMessageChannel(CreateIefMessageChannelRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createIefMessageChannel);
    }

    /**
     * 创建IEF消息通道
     *
     * 该API用于创建IEF消息通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIefMessageChannelRequest 请求对象
     * @return SyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse>
     */
    public SyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> createIefMessageChannelInvoker(
        CreateIefMessageChannelRequest request) {
        return new SyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse>(request,
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
     * @return CreateIefSystemEventsResponse
     */
    public CreateIefSystemEventsResponse createIefSystemEvents(CreateIefSystemEventsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createIefSystemEvents);
    }

    /**
     * IEF系统事件上报
     *
     * 该API用于处理IEF系统事件上报
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIefSystemEventsRequest 请求对象
     * @return SyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse>
     */
    public SyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> createIefSystemEventsInvoker(
        CreateIefSystemEventsRequest request) {
        return new SyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse>(request,
            DliMeta.createIefSystemEvents, hcClient);
    }

    /**
     * 生成flink SQL作业的静态流图
     *
     * 生成flink SQL作业的静态流图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamGraphRequest 请求对象
     * @return CreateStreamGraphResponse
     */
    public CreateStreamGraphResponse createStreamGraph(CreateStreamGraphRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createStreamGraph);
    }

    /**
     * 生成flink SQL作业的静态流图
     *
     * 生成flink SQL作业的静态流图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamGraphRequest 请求对象
     * @return SyncInvoker<CreateStreamGraphRequest, CreateStreamGraphResponse>
     */
    public SyncInvoker<CreateStreamGraphRequest, CreateStreamGraphResponse> createStreamGraphInvoker(
        CreateStreamGraphRequest request) {
        return new SyncInvoker<CreateStreamGraphRequest, CreateStreamGraphResponse>(request, DliMeta.createStreamGraph,
            hcClient);
    }

    /**
     * 删除作业
     *
     * 删除任何状态的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlinkJobRequest 请求对象
     * @return DeleteFlinkJobResponse
     */
    public DeleteFlinkJobResponse deleteFlinkJob(DeleteFlinkJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteFlinkJob);
    }

    /**
     * 删除作业
     *
     * 删除任何状态的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlinkJobRequest 请求对象
     * @return SyncInvoker<DeleteFlinkJobRequest, DeleteFlinkJobResponse>
     */
    public SyncInvoker<DeleteFlinkJobRequest, DeleteFlinkJobResponse> deleteFlinkJobInvoker(
        DeleteFlinkJobRequest request) {
        return new SyncInvoker<DeleteFlinkJobRequest, DeleteFlinkJobResponse>(request, DliMeta.deleteFlinkJob,
            hcClient);
    }

    /**
     * 删除Flink作业模板
     *
     * 删除一个Flink作业模板，即使当前模板正在被作业使用，也允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlinkTemplateRequest 请求对象
     * @return DeleteFlinkTemplateResponse
     */
    public DeleteFlinkTemplateResponse deleteFlinkTemplate(DeleteFlinkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteFlinkTemplate);
    }

    /**
     * 删除Flink作业模板
     *
     * 删除一个Flink作业模板，即使当前模板正在被作业使用，也允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlinkTemplateRequest 请求对象
     * @return SyncInvoker<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse>
     */
    public SyncInvoker<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse> deleteFlinkTemplateInvoker(
        DeleteFlinkTemplateRequest request) {
        return new SyncInvoker<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse>(request,
            DliMeta.deleteFlinkTemplate, hcClient);
    }

    /**
     * flink作业导出
     *
     * 通过POST方式，导出flink作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportFlinkJobRequest 请求对象
     * @return ExportFlinkJobResponse
     */
    public ExportFlinkJobResponse exportFlinkJob(ExportFlinkJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.exportFlinkJob);
    }

    /**
     * flink作业导出
     *
     * 通过POST方式，导出flink作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportFlinkJobRequest 请求对象
     * @return SyncInvoker<ExportFlinkJobRequest, ExportFlinkJobResponse>
     */
    public SyncInvoker<ExportFlinkJobRequest, ExportFlinkJobResponse> exportFlinkJobInvoker(
        ExportFlinkJobRequest request) {
        return new SyncInvoker<ExportFlinkJobRequest, ExportFlinkJobResponse>(request, DliMeta.exportFlinkJob,
            hcClient);
    }

    /**
     * flink作业导入
     *
     * 通过POST方式，导入flink作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportFlinkJobRequest 请求对象
     * @return ImportFlinkJobResponse
     */
    public ImportFlinkJobResponse importFlinkJob(ImportFlinkJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.importFlinkJob);
    }

    /**
     * flink作业导入
     *
     * 通过POST方式，导入flink作业，请求体为JSON格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportFlinkJobRequest 请求对象
     * @return SyncInvoker<ImportFlinkJobRequest, ImportFlinkJobResponse>
     */
    public SyncInvoker<ImportFlinkJobRequest, ImportFlinkJobResponse> importFlinkJobInvoker(
        ImportFlinkJobRequest request) {
        return new SyncInvoker<ImportFlinkJobRequest, ImportFlinkJobResponse>(request, DliMeta.importFlinkJob,
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
     * @return ListFlinkJobsResponse
     */
    public ListFlinkJobsResponse listFlinkJobs(ListFlinkJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listFlinkJobs);
    }

    /**
     * 查询Flink作业列表
     *
     * 查询当前用户的作业列表，可以根据作业ID作为ID，查询大于ID或小于ID的限定条数的作业，默认查询全部状态的作业，也可以设定运行中或其他状态条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlinkJobsRequest 请求对象
     * @return SyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse>
     */
    public SyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobsInvoker(ListFlinkJobsRequest request) {
        return new SyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse>(request, DliMeta.listFlinkJobs, hcClient);
    }

    /**
     * 查询Flink作业模板列表
     *
     * 查询Flink作业模板列表。当前只支持查询用户自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlinkTemplatesRequest 请求对象
     * @return ListFlinkTemplatesResponse
     */
    public ListFlinkTemplatesResponse listFlinkTemplates(ListFlinkTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listFlinkTemplates);
    }

    /**
     * 查询Flink作业模板列表
     *
     * 查询Flink作业模板列表。当前只支持查询用户自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlinkTemplatesRequest 请求对象
     * @return SyncInvoker<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse>
     */
    public SyncInvoker<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse> listFlinkTemplatesInvoker(
        ListFlinkTemplatesRequest request) {
        return new SyncInvoker<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse>(request,
            DliMeta.listFlinkTemplates, hcClient);
    }

    /**
     * OBS授权给DLI服务
     *
     * 用户主动授权OBS桶的操作权限给DLI服务, 用于保存用户作业的checkpoint、作业的运行日志等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterBucketRequest 请求对象
     * @return RegisterBucketResponse
     */
    public RegisterBucketResponse registerBucket(RegisterBucketRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.registerBucket);
    }

    /**
     * OBS授权给DLI服务
     *
     * 用户主动授权OBS桶的操作权限给DLI服务, 用于保存用户作业的checkpoint、作业的运行日志等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterBucketRequest 请求对象
     * @return SyncInvoker<RegisterBucketRequest, RegisterBucketResponse>
     */
    public SyncInvoker<RegisterBucketRequest, RegisterBucketResponse> registerBucketInvoker(
        RegisterBucketRequest request) {
        return new SyncInvoker<RegisterBucketRequest, RegisterBucketResponse>(request, DliMeta.registerBucket,
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
     * @return RunIefJobActionCallBackResponse
     */
    public RunIefJobActionCallBackResponse runIefJobActionCallBack(RunIefJobActionCallBackRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.runIefJobActionCallBack);
    }

    /**
     * 边缘Flink作业Action状态回调
     *
     * 该API用于处理IEF Flink作业action回调信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunIefJobActionCallBackRequest 请求对象
     * @return SyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse>
     */
    public SyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> runIefJobActionCallBackInvoker(
        RunIefJobActionCallBackRequest request) {
        return new SyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse>(request,
            DliMeta.runIefJobActionCallBack, hcClient);
    }

    /**
     * 查询Flink作业执行计划
     *
     * 查询Flink作业执行计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkExecuteGraphRequest 请求对象
     * @return ShowFlinkExecuteGraphResponse
     */
    public ShowFlinkExecuteGraphResponse showFlinkExecuteGraph(ShowFlinkExecuteGraphRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showFlinkExecuteGraph);
    }

    /**
     * 查询Flink作业执行计划
     *
     * 查询Flink作业执行计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkExecuteGraphRequest 请求对象
     * @return SyncInvoker<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse>
     */
    public SyncInvoker<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse> showFlinkExecuteGraphInvoker(
        ShowFlinkExecuteGraphRequest request) {
        return new SyncInvoker<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse>(request,
            DliMeta.showFlinkExecuteGraph, hcClient);
    }

    /**
     * 查询Flink作业详情
     *
     * 查看一个Flink作业的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkJobRequest 请求对象
     * @return ShowFlinkJobResponse
     */
    public ShowFlinkJobResponse showFlinkJob(ShowFlinkJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showFlinkJob);
    }

    /**
     * 查询Flink作业详情
     *
     * 查看一个Flink作业的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkJobRequest 请求对象
     * @return SyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse>
     */
    public SyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJobInvoker(ShowFlinkJobRequest request) {
        return new SyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse>(request, DliMeta.showFlinkJob, hcClient);
    }

    /**
     * 查询Flink作业监控信息
     *
     * 查询Flink作业监控信息, 支持同时查询多个Flink作业的监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkMetricRequest 请求对象
     * @return ShowFlinkMetricResponse
     */
    public ShowFlinkMetricResponse showFlinkMetric(ShowFlinkMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showFlinkMetric);
    }

    /**
     * 查询Flink作业监控信息
     *
     * 查询Flink作业监控信息, 支持同时查询多个Flink作业的监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlinkMetricRequest 请求对象
     * @return SyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse>
     */
    public SyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse> showFlinkMetricInvoker(
        ShowFlinkMetricRequest request) {
        return new SyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse>(request, DliMeta.showFlinkMetric,
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
     * @return StopFlinkJobsResponse
     */
    public StopFlinkJobsResponse stopFlinkJobs(StopFlinkJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.stopFlinkJobs);
    }

    /**
     * 批量停止Flink作业
     *
     * 批量停止正在运行的Flink作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopFlinkJobsRequest 请求对象
     * @return SyncInvoker<StopFlinkJobsRequest, StopFlinkJobsResponse>
     */
    public SyncInvoker<StopFlinkJobsRequest, StopFlinkJobsResponse> stopFlinkJobsInvoker(StopFlinkJobsRequest request) {
        return new SyncInvoker<StopFlinkJobsRequest, StopFlinkJobsResponse>(request, DliMeta.stopFlinkJobs, hcClient);
    }

    /**
     * 更新Flink Jar作业
     *
     * 更新用户自定义作业，目前支持jar格式，运行在独享集群中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkJarRequest 请求对象
     * @return UpdateFlinkJarResponse
     */
    public UpdateFlinkJarResponse updateFlinkJar(UpdateFlinkJarRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateFlinkJar);
    }

    /**
     * 更新Flink Jar作业
     *
     * 更新用户自定义作业，目前支持jar格式，运行在独享集群中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkJarRequest 请求对象
     * @return SyncInvoker<UpdateFlinkJarRequest, UpdateFlinkJarResponse>
     */
    public SyncInvoker<UpdateFlinkJarRequest, UpdateFlinkJarResponse> updateFlinkJarInvoker(
        UpdateFlinkJarRequest request) {
        return new SyncInvoker<UpdateFlinkJarRequest, UpdateFlinkJarResponse>(request, DliMeta.updateFlinkJar,
            hcClient);
    }

    /**
     * 更新Flink SQL作业
     *
     * Stream SQL的语法扩展了Apache Flink SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkSqlRequest 请求对象
     * @return UpdateFlinkSqlResponse
     */
    public UpdateFlinkSqlResponse updateFlinkSql(UpdateFlinkSqlRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateFlinkSql);
    }

    /**
     * 更新Flink SQL作业
     *
     * Stream SQL的语法扩展了Apache Flink SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkSqlRequest 请求对象
     * @return SyncInvoker<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse>
     */
    public SyncInvoker<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse> updateFlinkSqlInvoker(
        UpdateFlinkSqlRequest request) {
        return new SyncInvoker<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse>(request, DliMeta.updateFlinkSql,
            hcClient);
    }

    /**
     * 更新Flink作业模板
     *
     * 对DLI服务中已有的Flink作业模板进行更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkTemplateRequest 请求对象
     * @return UpdateFlinkTemplateResponse
     */
    public UpdateFlinkTemplateResponse updateFlinkTemplate(UpdateFlinkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateFlinkTemplate);
    }

    /**
     * 更新Flink作业模板
     *
     * 对DLI服务中已有的Flink作业模板进行更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlinkTemplateRequest 请求对象
     * @return SyncInvoker<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse>
     */
    public SyncInvoker<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse> updateFlinkTemplateInvoker(
        UpdateFlinkTemplateRequest request) {
        return new SyncInvoker<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse>(request,
            DliMeta.updateFlinkTemplate, hcClient);
    }

    /**
     * 取消批处理作业
     *
     * 该API用于取消批处理作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelBatchJobRequest 请求对象
     * @return CancelBatchJobResponse
     */
    public CancelBatchJobResponse cancelBatchJob(CancelBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.cancelBatchJob);
    }

    /**
     * 取消批处理作业
     *
     * 该API用于取消批处理作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelBatchJobRequest 请求对象
     * @return SyncInvoker<CancelBatchJobRequest, CancelBatchJobResponse>
     */
    public SyncInvoker<CancelBatchJobRequest, CancelBatchJobResponse> cancelBatchJobInvoker(
        CancelBatchJobRequest request) {
        return new SyncInvoker<CancelBatchJobRequest, CancelBatchJobResponse>(request, DliMeta.cancelBatchJob,
            hcClient);
    }

    /**
     * 创建批处理作业
     *
     * 该API用于在某个队列上创建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return CreateBatchJobResponse
     */
    public CreateBatchJobResponse createBatchJob(CreateBatchJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createBatchJob);
    }

    /**
     * 创建批处理作业
     *
     * 该API用于在某个队列上创建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return SyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>
     */
    public SyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJobInvoker(
        CreateBatchJobRequest request) {
        return new SyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>(request, DliMeta.createBatchJob,
            hcClient);
    }

    /**
     * 查询批处理作业列表
     *
     * 该API用于查询Project下某队列批处理作业的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchesRequest 请求对象
     * @return ListBatchesResponse
     */
    public ListBatchesResponse listBatches(ListBatchesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listBatches);
    }

    /**
     * 查询批处理作业列表
     *
     * 该API用于查询Project下某队列批处理作业的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBatchesRequest 请求对象
     * @return SyncInvoker<ListBatchesRequest, ListBatchesResponse>
     */
    public SyncInvoker<ListBatchesRequest, ListBatchesResponse> listBatchesInvoker(ListBatchesRequest request) {
        return new SyncInvoker<ListBatchesRequest, ListBatchesResponse>(request, DliMeta.listBatches, hcClient);
    }

    /**
     * 查询批处理作业详情
     *
     * 该API用于根据批处理作业的id查询作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchInfoRequest 请求对象
     * @return ShowBatchInfoResponse
     */
    public ShowBatchInfoResponse showBatchInfo(ShowBatchInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showBatchInfo);
    }

    /**
     * 查询批处理作业详情
     *
     * 该API用于根据批处理作业的id查询作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchInfoRequest 请求对象
     * @return SyncInvoker<ShowBatchInfoRequest, ShowBatchInfoResponse>
     */
    public SyncInvoker<ShowBatchInfoRequest, ShowBatchInfoResponse> showBatchInfoInvoker(ShowBatchInfoRequest request) {
        return new SyncInvoker<ShowBatchInfoRequest, ShowBatchInfoResponse>(request, DliMeta.showBatchInfo, hcClient);
    }

    /**
     * 查询批处理作业日志
     *
     * 该API用于查询批处理作业的后台日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchLogRequest 请求对象
     * @return ShowBatchLogResponse
     */
    public ShowBatchLogResponse showBatchLog(ShowBatchLogRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showBatchLog);
    }

    /**
     * 查询批处理作业日志
     *
     * 该API用于查询批处理作业的后台日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchLogRequest 请求对象
     * @return SyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse>
     */
    public SyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse> showBatchLogInvoker(ShowBatchLogRequest request) {
        return new SyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse>(request, DliMeta.showBatchLog, hcClient);
    }

    /**
     * 查询批处理作业状态
     *
     * 该API用于查询批处理作业的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchStateRequest 请求对象
     * @return ShowBatchStateResponse
     */
    public ShowBatchStateResponse showBatchState(ShowBatchStateRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showBatchState);
    }

    /**
     * 查询批处理作业状态
     *
     * 该API用于查询批处理作业的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBatchStateRequest 请求对象
     * @return SyncInvoker<ShowBatchStateRequest, ShowBatchStateResponse>
     */
    public SyncInvoker<ShowBatchStateRequest, ShowBatchStateResponse> showBatchStateInvoker(
        ShowBatchStateRequest request) {
        return new SyncInvoker<ShowBatchStateRequest, ShowBatchStateResponse>(request, DliMeta.showBatchState,
            hcClient);
    }

    /**
     * 取消作业
     *
     * 该API用于取消已经提交的作业，若作业已经执行结束或失败则无法取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelSqlJobRequest 请求对象
     * @return CancelSqlJobResponse
     */
    public CancelSqlJobResponse cancelSqlJob(CancelSqlJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.cancelSqlJob);
    }

    /**
     * 取消作业
     *
     * 该API用于取消已经提交的作业，若作业已经执行结束或失败则无法取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelSqlJobRequest 请求对象
     * @return SyncInvoker<CancelSqlJobRequest, CancelSqlJobResponse>
     */
    public SyncInvoker<CancelSqlJobRequest, CancelSqlJobResponse> cancelSqlJobInvoker(CancelSqlJobRequest request) {
        return new SyncInvoker<CancelSqlJobRequest, CancelSqlJobResponse>(request, DliMeta.cancelSqlJob, hcClient);
    }

    /**
     * 检查SQL语法
     *
     * 该API用于检查SQL语法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckSqlRequest 请求对象
     * @return CheckSqlResponse
     */
    public CheckSqlResponse checkSql(CheckSqlRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.checkSql);
    }

    /**
     * 检查SQL语法
     *
     * 该API用于检查SQL语法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckSqlRequest 请求对象
     * @return SyncInvoker<CheckSqlRequest, CheckSqlResponse>
     */
    public SyncInvoker<CheckSqlRequest, CheckSqlResponse> checkSqlInvoker(CheckSqlRequest request) {
        return new SyncInvoker<CheckSqlRequest, CheckSqlResponse>(request, DliMeta.checkSql, hcClient);
    }

    /**
     * 创建数据库
     *
     * 该API用于新增数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 该API用于新增数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, DliMeta.createDatabase,
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
     * @return CreateSqlJobResponse
     */
    public CreateSqlJobResponse createSqlJob(CreateSqlJobRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createSqlJob);
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
     * @return SyncInvoker<CreateSqlJobRequest, CreateSqlJobResponse>
     */
    public SyncInvoker<CreateSqlJobRequest, CreateSqlJobResponse> createSqlJobInvoker(CreateSqlJobRequest request) {
        return new SyncInvoker<CreateSqlJobRequest, CreateSqlJobResponse>(request, DliMeta.createSqlJob, hcClient);
    }

    /**
     * 创建表
     *
     * 该API用于创建新的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createTable);
    }

    /**
     * 创建表
     *
     * 该API用于创建新的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return SyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public SyncInvoker<CreateTableRequest, CreateTableResponse> createTableInvoker(CreateTableRequest request) {
        return new SyncInvoker<CreateTableRequest, CreateTableResponse>(request, DliMeta.createTable, hcClient);
    }

    /**
     * 删除数据库
     *
     * 该API用于删除空数据库，若待删除的数据库中存在表，则需先删除其中的所有表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 该API用于删除空数据库，若待删除的数据库中存在表，则需先删除其中的所有表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, DliMeta.deleteDatabase,
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
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(DeleteTableRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 该API用于删除指定的表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return SyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public SyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableInvoker(DeleteTableRequest request) {
        return new SyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, DliMeta.deleteTable, hcClient);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportSqlJobResultRequest 请求对象
     * @return ExportSqlJobResultResponse
     */
    public ExportSqlJobResultResponse exportSqlJobResult(ExportSqlJobResultRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.exportSqlJobResult);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportSqlJobResultRequest 请求对象
     * @return SyncInvoker<ExportSqlJobResultRequest, ExportSqlJobResultResponse>
     */
    public SyncInvoker<ExportSqlJobResultRequest, ExportSqlJobResultResponse> exportSqlJobResultInvoker(
        ExportSqlJobResultRequest request) {
        return new SyncInvoker<ExportSqlJobResultRequest, ExportSqlJobResultResponse>(request,
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
     * @return ExportTableResponse
     */
    public ExportTableResponse exportTable(ExportTableRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.exportTable);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportTableRequest 请求对象
     * @return SyncInvoker<ExportTableRequest, ExportTableResponse>
     */
    public SyncInvoker<ExportTableRequest, ExportTableResponse> exportTableInvoker(ExportTableRequest request) {
        return new SyncInvoker<ExportTableRequest, ExportTableResponse>(request, DliMeta.exportTable, hcClient);
    }

    /**
     * 导入数据
     *
     * 该API用于将数据从文件导入DLI或OBS表，目前仅支持将OBS上的数据导入DLI或OBS中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTableRequest 请求对象
     * @return ImportTableResponse
     */
    public ImportTableResponse importTable(ImportTableRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.importTable);
    }

    /**
     * 导入数据
     *
     * 该API用于将数据从文件导入DLI或OBS表，目前仅支持将OBS上的数据导入DLI或OBS中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTableRequest 请求对象
     * @return SyncInvoker<ImportTableRequest, ImportTableResponse>
     */
    public SyncInvoker<ImportTableRequest, ImportTableResponse> importTableInvoker(ImportTableRequest request) {
        return new SyncInvoker<ImportTableRequest, ImportTableResponse>(request, DliMeta.importTable, hcClient);
    }

    /**
     * 查询所有表
     *
     * 该API用于查询指定数据库下符合过滤条件的或所有的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllTablesRequest 请求对象
     * @return ListAllTablesResponse
     */
    public ListAllTablesResponse listAllTables(ListAllTablesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listAllTables);
    }

    /**
     * 查询所有表
     *
     * 该API用于查询指定数据库下符合过滤条件的或所有的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllTablesRequest 请求对象
     * @return SyncInvoker<ListAllTablesRequest, ListAllTablesResponse>
     */
    public SyncInvoker<ListAllTablesRequest, ListAllTablesResponse> listAllTablesInvoker(ListAllTablesRequest request) {
        return new SyncInvoker<ListAllTablesRequest, ListAllTablesResponse>(request, DliMeta.listAllTables, hcClient);
    }

    /**
     * 查询所有数据库
     *
     * 该API用于查询出所有的数据库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listDatabases);
    }

    /**
     * 查询所有数据库
     *
     * 该API用于查询出所有的数据库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, DliMeta.listDatabases, hcClient);
    }

    /**
     * 查询所有作业
     *
     * 该API用于查询当前工程下面的所有作业的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlJobsRequest 请求对象
     * @return ListSqlJobsResponse
     */
    public ListSqlJobsResponse listSqlJobs(ListSqlJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listSqlJobs);
    }

    /**
     * 查询所有作业
     *
     * 该API用于查询当前工程下面的所有作业的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSqlJobsRequest 请求对象
     * @return SyncInvoker<ListSqlJobsRequest, ListSqlJobsResponse>
     */
    public SyncInvoker<ListSqlJobsRequest, ListSqlJobsResponse> listSqlJobsInvoker(ListSqlJobsRequest request) {
        return new SyncInvoker<ListSqlJobsRequest, ListSqlJobsResponse>(request, DliMeta.listSqlJobs, hcClient);
    }

    /**
     * 预览SQL作业查询结果
     *
     * 该API用于在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。
     * 该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PreviewJobResultRequest 请求对象
     * @return PreviewJobResultResponse
     */
    public PreviewJobResultResponse previewJobResult(PreviewJobResultRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.previewJobResult);
    }

    /**
     * 预览SQL作业查询结果
     *
     * 该API用于在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。
     * 该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PreviewJobResultRequest 请求对象
     * @return SyncInvoker<PreviewJobResultRequest, PreviewJobResultResponse>
     */
    public SyncInvoker<PreviewJobResultRequest, PreviewJobResultResponse> previewJobResultInvoker(
        PreviewJobResultRequest request) {
        return new SyncInvoker<PreviewJobResultRequest, PreviewJobResultResponse>(request, DliMeta.previewJobResult,
            hcClient);
    }

    /**
     * 描述表信息
     *
     * 该API用于描述指定表的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDescribeTableRequest 请求对象
     * @return ShowDescribeTableResponse
     */
    public ShowDescribeTableResponse showDescribeTable(ShowDescribeTableRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showDescribeTable);
    }

    /**
     * 描述表信息
     *
     * 该API用于描述指定表的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDescribeTableRequest 请求对象
     * @return SyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse>
     */
    public SyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse> showDescribeTableInvoker(
        ShowDescribeTableRequest request) {
        return new SyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse>(request, DliMeta.showDescribeTable,
            hcClient);
    }

    /**
     * 查询作业执行进度信息
     *
     * 该API用于获取作业执行进度信息，如果作业正在执行，可以获取到子作业的信息，如果作业刚开始或者已经结束，不可以获取到子作业信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobProgressRequest 请求对象
     * @return ShowJobProgressResponse
     */
    public ShowJobProgressResponse showJobProgress(ShowJobProgressRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showJobProgress);
    }

    /**
     * 查询作业执行进度信息
     *
     * 该API用于获取作业执行进度信息，如果作业正在执行，可以获取到子作业的信息，如果作业刚开始或者已经结束，不可以获取到子作业信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobProgressRequest 请求对象
     * @return SyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse>
     */
    public SyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse> showJobProgressInvoker(
        ShowJobProgressRequest request) {
        return new SyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse>(request, DliMeta.showJobProgress,
            hcClient);
    }

    /**
     * 获取分区信息列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionsRequest 请求对象
     * @return ShowPartitionsResponse
     */
    public ShowPartitionsResponse showPartitions(ShowPartitionsRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showPartitions);
    }

    /**
     * 获取分区信息列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionsRequest 请求对象
     * @return SyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse>
     */
    public SyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse> showPartitionsInvoker(
        ShowPartitionsRequest request) {
        return new SyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse>(request, DliMeta.showPartitions,
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
     * @return ShowSqlJobDetailResponse
     */
    public ShowSqlJobDetailResponse showSqlJobDetail(ShowSqlJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showSqlJobDetail);
    }

    /**
     * 查询作业详细信息
     *
     * 该API用于查询作业的详细信息，如作业的databasename、tablename、file size和export mode等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobDetailRequest 请求对象
     * @return SyncInvoker<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse>
     */
    public SyncInvoker<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse> showSqlJobDetailInvoker(
        ShowSqlJobDetailRequest request) {
        return new SyncInvoker<ShowSqlJobDetailRequest, ShowSqlJobDetailResponse>(request, DliMeta.showSqlJobDetail,
            hcClient);
    }

    /**
     * 查询作业状态
     *
     * 该API用于在作业提交后查询作业状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobStatusRequest 请求对象
     * @return ShowSqlJobStatusResponse
     */
    public ShowSqlJobStatusResponse showSqlJobStatus(ShowSqlJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showSqlJobStatus);
    }

    /**
     * 查询作业状态
     *
     * 该API用于在作业提交后查询作业状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlJobStatusRequest 请求对象
     * @return SyncInvoker<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse>
     */
    public SyncInvoker<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse> showSqlJobStatusInvoker(
        ShowSqlJobStatusRequest request) {
        return new SyncInvoker<ShowSqlJobStatusRequest, ShowSqlJobStatusResponse>(request, DliMeta.showSqlJobStatus,
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
     * @return ShowTableContentResponse
     */
    public ShowTableContentResponse showTableContent(ShowTableContentRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.showTableContent);
    }

    /**
     * 预览表内容
     *
     * 该API用于用于预览表中前10行的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableContentRequest 请求对象
     * @return SyncInvoker<ShowTableContentRequest, ShowTableContentResponse>
     */
    public SyncInvoker<ShowTableContentRequest, ShowTableContentResponse> showTableContentInvoker(
        ShowTableContentRequest request) {
        return new SyncInvoker<ShowTableContentRequest, ShowTableContentResponse>(request, DliMeta.showTableContent,
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
     * @return UpdateDatabaseOwnerResponse
     */
    public UpdateDatabaseOwnerResponse updateDatabaseOwner(UpdateDatabaseOwnerRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateDatabaseOwner);
    }

    /**
     * 修改数据库用户
     *
     * 用于修改数据库的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseOwnerRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse>
     */
    public SyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> updateDatabaseOwnerInvoker(
        UpdateDatabaseOwnerRequest request) {
        return new SyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse>(request,
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
     * @return UpdateTableOwnerResponse
     */
    public UpdateTableOwnerResponse updateTableOwner(UpdateTableOwnerRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.updateTableOwner);
    }

    /**
     * 修改表用户
     *
     * 用于修改表的owner。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableOwnerRequest 请求对象
     * @return SyncInvoker<UpdateTableOwnerRequest, UpdateTableOwnerResponse>
     */
    public SyncInvoker<UpdateTableOwnerRequest, UpdateTableOwnerResponse> updateTableOwnerInvoker(
        UpdateTableOwnerRequest request) {
        return new SyncInvoker<UpdateTableOwnerRequest, UpdateTableOwnerResponse>(request, DliMeta.updateTableOwner,
            hcClient);
    }

}
