package com.huaweicloud.sdk.drs.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.drs.v3.model.BatchChangeDataRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchChangeDataResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchCheckJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchCheckJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchCheckResultsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchCheckResultsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchCreateJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchCreateJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchDeleteJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchDeleteJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListJobDetailsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListJobDetailsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListJobStatusRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListJobStatusResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListProgressesRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListProgressesResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListRposAndRtosRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListRposAndRtosResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListStructDetailRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListStructDetailResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchListStructProcessRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchListStructProcessResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchResetPasswordRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchResetPasswordResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchRestoreTaskRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchRestoreTaskResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetDefinerRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetDefinerResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetObjectsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetObjectsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetPolicyRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetPolicyResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetSmnRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetSmnResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSetSpeedRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSetSpeedResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchShowParamsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchShowParamsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchStartJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchStartJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchStopJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchStopJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchSwitchoverRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchSwitchoverResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateJobRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateJobResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateUserRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchUpdateUserResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchValidateClustersConnectionsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchValidateClustersConnectionsResponse;
import com.huaweicloud.sdk.drs.v3.model.BatchValidateConnectionsRequest;
import com.huaweicloud.sdk.drs.v3.model.BatchValidateConnectionsResponse;
import com.huaweicloud.sdk.drs.v3.model.CreateCompareResultFileRequest;
import com.huaweicloud.sdk.drs.v3.model.CreateCompareResultFileResponse;
import com.huaweicloud.sdk.drs.v3.model.CreateCompareTaskRequest;
import com.huaweicloud.sdk.drs.v3.model.CreateCompareTaskResponse;
import com.huaweicloud.sdk.drs.v3.model.CreateDataLevelTableCompareJobRequest;
import com.huaweicloud.sdk.drs.v3.model.CreateDataLevelTableCompareJobResponse;
import com.huaweicloud.sdk.drs.v3.model.CreateObjectLevelCompareJobRequest;
import com.huaweicloud.sdk.drs.v3.model.CreateObjectLevelCompareJobResponse;
import com.huaweicloud.sdk.drs.v3.model.DeleteCompareJobRequest;
import com.huaweicloud.sdk.drs.v3.model.DeleteCompareJobResponse;
import com.huaweicloud.sdk.drs.v3.model.DownloadCompareResultFileRequest;
import com.huaweicloud.sdk.drs.v3.model.DownloadCompareResultFileResponse;
import com.huaweicloud.sdk.drs.v3.model.ListAvailableNodeTypesRequest;
import com.huaweicloud.sdk.drs.v3.model.ListAvailableNodeTypesResponse;
import com.huaweicloud.sdk.drs.v3.model.ListAvailableZoneRequest;
import com.huaweicloud.sdk.drs.v3.model.ListAvailableZoneResponse;
import com.huaweicloud.sdk.drs.v3.model.ListCompareResultRequest;
import com.huaweicloud.sdk.drs.v3.model.ListCompareResultResponse;
import com.huaweicloud.sdk.drs.v3.model.ListContentCompareDetailRequest;
import com.huaweicloud.sdk.drs.v3.model.ListContentCompareDetailResponse;
import com.huaweicloud.sdk.drs.v3.model.ListContentCompareDifferenceRequest;
import com.huaweicloud.sdk.drs.v3.model.ListContentCompareDifferenceResponse;
import com.huaweicloud.sdk.drs.v3.model.ListContentCompareOverviewRequest;
import com.huaweicloud.sdk.drs.v3.model.ListContentCompareOverviewResponse;
import com.huaweicloud.sdk.drs.v3.model.ListDataCompareDetailRequest;
import com.huaweicloud.sdk.drs.v3.model.ListDataCompareDetailResponse;
import com.huaweicloud.sdk.drs.v3.model.ListDataCompareOverviewRequest;
import com.huaweicloud.sdk.drs.v3.model.ListDataCompareOverviewResponse;
import com.huaweicloud.sdk.drs.v3.model.ListDataLevelTableCompareJobsRequest;
import com.huaweicloud.sdk.drs.v3.model.ListDataLevelTableCompareJobsResponse;
import com.huaweicloud.sdk.drs.v3.model.ListObejectLevelCompareDetailRequest;
import com.huaweicloud.sdk.drs.v3.model.ListObejectLevelCompareDetailResponse;
import com.huaweicloud.sdk.drs.v3.model.ListObejectLevelCompareOverviewRequest;
import com.huaweicloud.sdk.drs.v3.model.ListObejectLevelCompareOverviewResponse;
import com.huaweicloud.sdk.drs.v3.model.ListUsersRequest;
import com.huaweicloud.sdk.drs.v3.model.ListUsersResponse;
import com.huaweicloud.sdk.drs.v3.model.ShowJobListRequest;
import com.huaweicloud.sdk.drs.v3.model.ShowJobListResponse;
import com.huaweicloud.sdk.drs.v3.model.ShowMonitoringDataRequest;
import com.huaweicloud.sdk.drs.v3.model.ShowMonitoringDataResponse;
import com.huaweicloud.sdk.drs.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.drs.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.drs.v3.model.StartPromptlyDataLevelTableCompareJobRequest;
import com.huaweicloud.sdk.drs.v3.model.StartPromptlyDataLevelTableCompareJobResponse;
import com.huaweicloud.sdk.drs.v3.model.UpdateParamsRequest;
import com.huaweicloud.sdk.drs.v3.model.UpdateParamsResponse;
import com.huaweicloud.sdk.drs.v3.model.UpdateTuningParamsRequest;
import com.huaweicloud.sdk.drs.v3.model.UpdateTuningParamsResponse;

public class DrsClient {

    protected HcClient hcClient;

    public DrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsClient> newBuilder() {
        ClientBuilder<DrsClient> clientBuilder = new ClientBuilder<>(DrsClient::new);
        return clientBuilder;
    }

    /**
     * 批量数据加工
     *
     * 数据复制服务支持对同步的对象进行加工，即可以为选择的对象添加规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeDataRequest 请求对象
     * @return BatchChangeDataResponse
     */
    public BatchChangeDataResponse batchChangeData(BatchChangeDataRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchChangeData);
    }

    /**
     * 批量数据加工
     *
     * 数据复制服务支持对同步的对象进行加工，即可以为选择的对象添加规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeDataRequest 请求对象
     * @return SyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse>
     */
    public SyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse> batchChangeDataInvoker(
        BatchChangeDataRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchChangeData, hcClient);
    }

    /**
     * 批量预检查
     *
     * 批量预检查，校验是否可进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckJobsRequest 请求对象
     * @return BatchCheckJobsResponse
     */
    public BatchCheckJobsResponse batchCheckJobs(BatchCheckJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchCheckJobs);
    }

    /**
     * 批量预检查
     *
     * 批量预检查，校验是否可进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckJobsRequest 请求对象
     * @return SyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse>
     */
    public SyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse> batchCheckJobsInvoker(
        BatchCheckJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchCheckJobs, hcClient);
    }

    /**
     * 批量查询预检查结果
     *
     * 批量查询任务的预检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckResultsRequest 请求对象
     * @return BatchCheckResultsResponse
     */
    public BatchCheckResultsResponse batchCheckResults(BatchCheckResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchCheckResults);
    }

    /**
     * 批量查询预检查结果
     *
     * 批量查询任务的预检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckResultsRequest 请求对象
     * @return SyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse>
     */
    public SyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse> batchCheckResultsInvoker(
        BatchCheckResultsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchCheckResults, hcClient);
    }

    /**
     * 批量创建任务
     *
     * 根据请求参数不同，可以批量创建实时迁移、实时同步、实时灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateJobsRequest 请求对象
     * @return BatchCreateJobsResponse
     */
    public BatchCreateJobsResponse batchCreateJobs(BatchCreateJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchCreateJobs);
    }

    /**
     * 批量创建任务
     *
     * 根据请求参数不同，可以批量创建实时迁移、实时同步、实时灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateJobsRequest 请求对象
     * @return SyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse>
     */
    public SyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse> batchCreateJobsInvoker(
        BatchCreateJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchCreateJobs, hcClient);
    }

    /**
     * 批量结束任务或删除任务
     *
     * 批量结束任务或删除实时迁移、实时同步、实时灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return BatchDeleteJobsResponse
     */
    public BatchDeleteJobsResponse batchDeleteJobs(BatchDeleteJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchDeleteJobs);
    }

    /**
     * 批量结束任务或删除任务
     *
     * 批量结束任务或删除实时迁移、实时同步、实时灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>
     */
    public SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsInvoker(
        BatchDeleteJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchDeleteJobs, hcClient);
    }

    /**
     * 批量查询任务详情
     *
     * 根据任务ID批量查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListJobDetailsRequest 请求对象
     * @return BatchListJobDetailsResponse
     */
    public BatchListJobDetailsResponse batchListJobDetails(BatchListJobDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListJobDetails);
    }

    /**
     * 批量查询任务详情
     *
     * 根据任务ID批量查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListJobDetailsRequest 请求对象
     * @return SyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse>
     */
    public SyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse> batchListJobDetailsInvoker(
        BatchListJobDetailsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchListJobDetails, hcClient);
    }

    /**
     * 批量查询任务状态
     *
     * 根据任务ID批量查询任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListJobStatusRequest 请求对象
     * @return BatchListJobStatusResponse
     */
    public BatchListJobStatusResponse batchListJobStatus(BatchListJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListJobStatus);
    }

    /**
     * 批量查询任务状态
     *
     * 根据任务ID批量查询任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListJobStatusRequest 请求对象
     * @return SyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse>
     */
    public SyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse> batchListJobStatusInvoker(
        BatchListJobStatusRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchListJobStatus, hcClient);
    }

    /**
     * 批量查询任务进度
     *
     * 根据任务ID批量查询全量进度、增量时延信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListProgressesRequest 请求对象
     * @return BatchListProgressesResponse
     */
    public BatchListProgressesResponse batchListProgresses(BatchListProgressesRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListProgresses);
    }

    /**
     * 批量查询任务进度
     *
     * 根据任务ID批量查询全量进度、增量时延信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListProgressesRequest 请求对象
     * @return SyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse>
     */
    public SyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse> batchListProgressesInvoker(
        BatchListProgressesRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchListProgresses, hcClient);
    }

    /**
     * 批量查询RPO和RTO
     *
     * 批量查询RPO和RTO。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListRposAndRtosRequest 请求对象
     * @return BatchListRposAndRtosResponse
     */
    public BatchListRposAndRtosResponse batchListRposAndRtos(BatchListRposAndRtosRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListRposAndRtos);
    }

    /**
     * 批量查询RPO和RTO
     *
     * 批量查询RPO和RTO。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListRposAndRtosRequest 请求对象
     * @return SyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse>
     */
    public SyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> batchListRposAndRtosInvoker(
        BatchListRposAndRtosRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchListRposAndRtos, hcClient);
    }

    /**
     * 批量查询灾备初始化对象详情
     *
     * 根据任务ID批量查询灾备初始化对象详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListStructDetailRequest 请求对象
     * @return BatchListStructDetailResponse
     */
    public BatchListStructDetailResponse batchListStructDetail(BatchListStructDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListStructDetail);
    }

    /**
     * 批量查询灾备初始化对象详情
     *
     * 根据任务ID批量查询灾备初始化对象详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListStructDetailRequest 请求对象
     * @return SyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse>
     */
    public SyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse> batchListStructDetailInvoker(
        BatchListStructDetailRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchListStructDetail, hcClient);
    }

    /**
     * 批量查询灾备初始化进度
     *
     * 根据任务ID批量查询灾备初始化进度，虚拟id不支持查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListStructProcessRequest 请求对象
     * @return BatchListStructProcessResponse
     */
    public BatchListStructProcessResponse batchListStructProcess(BatchListStructProcessRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListStructProcess);
    }

    /**
     * 批量查询灾备初始化进度
     *
     * 根据任务ID批量查询灾备初始化进度，虚拟id不支持查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListStructProcessRequest 请求对象
     * @return SyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse>
     */
    public SyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse> batchListStructProcessInvoker(
        BatchListStructProcessRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchListStructProcess, hcClient);
    }

    /**
     * 批量修改源库/目标库密码
     *
     * 任务启动之后需要修改源库/目标库密码时调用此接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetPasswordRequest 请求对象
     * @return BatchResetPasswordResponse
     */
    public BatchResetPasswordResponse batchResetPassword(BatchResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchResetPassword);
    }

    /**
     * 批量修改源库/目标库密码
     *
     * 任务启动之后需要修改源库/目标库密码时调用此接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetPasswordRequest 请求对象
     * @return SyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse>
     */
    public SyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse> batchResetPasswordInvoker(
        BatchResetPasswordRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchResetPassword, hcClient);
    }

    /**
     * 批量续传/重试
     *
     * 在迁移过程中由于不确定因素导致迁移任务失败，可通过重试功能，重新提交迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreTaskRequest 请求对象
     * @return BatchRestoreTaskResponse
     */
    public BatchRestoreTaskResponse batchRestoreTask(BatchRestoreTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchRestoreTask);
    }

    /**
     * 批量续传/重试
     *
     * 在迁移过程中由于不确定因素导致迁移任务失败，可通过重试功能，重新提交迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreTaskRequest 请求对象
     * @return SyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse>
     */
    public SyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse> batchRestoreTaskInvoker(
        BatchRestoreTaskRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchRestoreTask, hcClient);
    }

    /**
     * 批量设置definer
     *
     * 批量设置Definer迁移是否迁移到到该用户下。
     * - 选择是：迁移后，所有源数据库对象的Definer都会迁移至该用户下，其他用户需要授权后才具有数据库对象权限。
     * - 选择否：迁移后，将保持源数据库对象Definer定义不变，选择此选项，需要配合下一步用户权限迁移功能，将源数据库的用户全部迁移，这样才能保持源数据库的权限体系完全不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetDefinerRequest 请求对象
     * @return BatchSetDefinerResponse
     */
    public BatchSetDefinerResponse batchSetDefiner(BatchSetDefinerRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSetDefiner);
    }

    /**
     * 批量设置definer
     *
     * 批量设置Definer迁移是否迁移到到该用户下。
     * - 选择是：迁移后，所有源数据库对象的Definer都会迁移至该用户下，其他用户需要授权后才具有数据库对象权限。
     * - 选择否：迁移后，将保持源数据库对象Definer定义不变，选择此选项，需要配合下一步用户权限迁移功能，将源数据库的用户全部迁移，这样才能保持源数据库的权限体系完全不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetDefinerRequest 请求对象
     * @return SyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse>
     */
    public SyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse> batchSetDefinerInvoker(
        BatchSetDefinerRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchSetDefiner, hcClient);
    }

    /**
     * 批量数据库对象选择
     *
     * 迁移之前，选择需要迁移的数据库或者表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetObjectsRequest 请求对象
     * @return BatchSetObjectsResponse
     */
    public BatchSetObjectsResponse batchSetObjects(BatchSetObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSetObjects);
    }

    /**
     * 批量数据库对象选择
     *
     * 迁移之前，选择需要迁移的数据库或者表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetObjectsRequest 请求对象
     * @return SyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse>
     */
    public SyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse> batchSetObjectsInvoker(
        BatchSetObjectsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchSetObjects, hcClient);
    }

    /**
     * 批量设置同步策略
     *
     * - 批量设置同步策略，包括冲突策略、过滤DROP Datase、对象同步范围。
     * - 设置kafka同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetPolicyRequest 请求对象
     * @return BatchSetPolicyResponse
     */
    public BatchSetPolicyResponse batchSetPolicy(BatchSetPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSetPolicy);
    }

    /**
     * 批量设置同步策略
     *
     * - 批量设置同步策略，包括冲突策略、过滤DROP Datase、对象同步范围。
     * - 设置kafka同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetPolicyRequest 请求对象
     * @return SyncInvoker<BatchSetPolicyRequest, BatchSetPolicyResponse>
     */
    public SyncInvoker<BatchSetPolicyRequest, BatchSetPolicyResponse> batchSetPolicyInvoker(
        BatchSetPolicyRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchSetPolicy, hcClient);
    }

    /**
     * 批量配置异常通知
     *
     * 批量设置异常通知，已结束的任务不支持设置。
     * - 支持选择已有的SMN主题和手动输入手机号、邮箱两种方式，具体根据自己使用情况选择
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetSmnRequest 请求对象
     * @return BatchSetSmnResponse
     */
    public BatchSetSmnResponse batchSetSmn(BatchSetSmnRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSetSmn);
    }

    /**
     * 批量配置异常通知
     *
     * 批量设置异常通知，已结束的任务不支持设置。
     * - 支持选择已有的SMN主题和手动输入手机号、邮箱两种方式，具体根据自己使用情况选择
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetSmnRequest 请求对象
     * @return SyncInvoker<BatchSetSmnRequest, BatchSetSmnResponse>
     */
    public SyncInvoker<BatchSetSmnRequest, BatchSetSmnResponse> batchSetSmnInvoker(BatchSetSmnRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchSetSmn, hcClient);
    }

    /**
     * 批量设置任务限速
     *
     * 批量设置任务限速，任务创建成功后默认不限速。
     * - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。
     * - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetSpeedRequest 请求对象
     * @return BatchSetSpeedResponse
     */
    public BatchSetSpeedResponse batchSetSpeed(BatchSetSpeedRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSetSpeed);
    }

    /**
     * 批量设置任务限速
     *
     * 批量设置任务限速，任务创建成功后默认不限速。
     * - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。
     * - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetSpeedRequest 请求对象
     * @return SyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse>
     */
    public SyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse> batchSetSpeedInvoker(BatchSetSpeedRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchSetSpeed, hcClient);
    }

    /**
     * 批量获取数据库参数
     *
     * 在进行数据库迁移时，为了确保迁移成功后业务应用的使用不受影响，数据复制服务提供了参数对比功能帮助您进行源库和目标库参数一致性对比，此接口可以获取源库和目标库的数据库参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowParamsRequest 请求对象
     * @return BatchShowParamsResponse
     */
    public BatchShowParamsResponse batchShowParams(BatchShowParamsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchShowParams);
    }

    /**
     * 批量获取数据库参数
     *
     * 在进行数据库迁移时，为了确保迁移成功后业务应用的使用不受影响，数据复制服务提供了参数对比功能帮助您进行源库和目标库参数一致性对比，此接口可以获取源库和目标库的数据库参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowParamsRequest 请求对象
     * @return SyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse>
     */
    public SyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse> batchShowParamsInvoker(
        BatchShowParamsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchShowParams, hcClient);
    }

    /**
     * 批量启动任务
     *
     * 批量启动实时迁移、同步、灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartJobsRequest 请求对象
     * @return BatchStartJobsResponse
     */
    public BatchStartJobsResponse batchStartJobs(BatchStartJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchStartJobs);
    }

    /**
     * 批量启动任务
     *
     * 批量启动实时迁移、同步、灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartJobsRequest 请求对象
     * @return SyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse>
     */
    public SyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse> batchStartJobsInvoker(
        BatchStartJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchStartJobs, hcClient);
    }

    /**
     * 批量暂停任务
     *
     * 批量暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopJobsRequest 请求对象
     * @return BatchStopJobsResponse
     */
    public BatchStopJobsResponse batchStopJobs(BatchStopJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchStopJobs);
    }

    /**
     * 批量暂停任务
     *
     * 批量暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopJobsRequest 请求对象
     * @return SyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse>
     */
    public SyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse> batchStopJobsInvoker(BatchStopJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchStopJobs, hcClient);
    }

    /**
     * 批量主备倒换
     *
     * 批量主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSwitchoverRequest 请求对象
     * @return BatchSwitchoverResponse
     */
    public BatchSwitchoverResponse batchSwitchover(BatchSwitchoverRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSwitchover);
    }

    /**
     * 批量主备倒换
     *
     * 批量主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSwitchoverRequest 请求对象
     * @return SyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse>
     */
    public SyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse> batchSwitchoverInvoker(
        BatchSwitchoverRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchSwitchover, hcClient);
    }

    /**
     * 批量修改任务
     *
     * 批量修改任务名称或描述，设置异常通知信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateJobRequest 请求对象
     * @return BatchUpdateJobResponse
     */
    public BatchUpdateJobResponse batchUpdateJob(BatchUpdateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchUpdateJob);
    }

    /**
     * 批量修改任务
     *
     * 批量修改任务名称或描述，设置异常通知信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateJobRequest 请求对象
     * @return SyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse>
     */
    public SyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse> batchUpdateJobInvoker(
        BatchUpdateJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchUpdateJob, hcClient);
    }

    /**
     * 批量更新迁移用户信息
     *
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以批量设置需要迁移的用户和角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUserRequest 请求对象
     * @return BatchUpdateUserResponse
     */
    public BatchUpdateUserResponse batchUpdateUser(BatchUpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchUpdateUser);
    }

    /**
     * 批量更新迁移用户信息
     *
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以批量设置需要迁移的用户和角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUserRequest 请求对象
     * @return SyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse>
     */
    public SyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse> batchUpdateUserInvoker(
        BatchUpdateUserRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchUpdateUser, hcClient);
    }

    /**
     * 批量测试连接-集群模式
     *
     * - 批量测试连接（集群模式）。
     * - 主备任务测试连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateClustersConnectionsRequest 请求对象
     * @return BatchValidateClustersConnectionsResponse
     */
    public BatchValidateClustersConnectionsResponse batchValidateClustersConnections(
        BatchValidateClustersConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchValidateClustersConnections);
    }

    /**
     * 批量测试连接-集群模式
     *
     * - 批量测试连接（集群模式）。
     * - 主备任务测试连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateClustersConnectionsRequest 请求对象
     * @return SyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse>
     */
    public SyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> batchValidateClustersConnectionsInvoker(
        BatchValidateClustersConnectionsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchValidateClustersConnections, hcClient);
    }

    /**
     * 批量测试连接
     *
     * 批量测试连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateConnectionsRequest 请求对象
     * @return BatchValidateConnectionsResponse
     */
    public BatchValidateConnectionsResponse batchValidateConnections(BatchValidateConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchValidateConnections);
    }

    /**
     * 批量测试连接
     *
     * 批量测试连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateConnectionsRequest 请求对象
     * @return SyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse>
     */
    public SyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> batchValidateConnectionsInvoker(
        BatchValidateConnectionsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchValidateConnections, hcClient);
    }

    /**
     * 导出对比任务结果文件
     *
     * 导出对比任务结果文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCompareResultFileRequest 请求对象
     * @return CreateCompareResultFileResponse
     */
    public CreateCompareResultFileResponse createCompareResultFile(CreateCompareResultFileRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.createCompareResultFile);
    }

    /**
     * 导出对比任务结果文件
     *
     * 导出对比任务结果文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCompareResultFileRequest 请求对象
     * @return SyncInvoker<CreateCompareResultFileRequest, CreateCompareResultFileResponse>
     */
    public SyncInvoker<CreateCompareResultFileRequest, CreateCompareResultFileResponse> createCompareResultFileInvoker(
        CreateCompareResultFileRequest request) {
        return new SyncInvoker<>(request, DrsMeta.createCompareResultFile, hcClient);
    }

    /**
     * 创建对比任务
     *
     * 创建对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCompareTaskRequest 请求对象
     * @return CreateCompareTaskResponse
     */
    public CreateCompareTaskResponse createCompareTask(CreateCompareTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.createCompareTask);
    }

    /**
     * 创建对比任务
     *
     * 创建对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCompareTaskRequest 请求对象
     * @return SyncInvoker<CreateCompareTaskRequest, CreateCompareTaskResponse>
     */
    public SyncInvoker<CreateCompareTaskRequest, CreateCompareTaskResponse> createCompareTaskInvoker(
        CreateCompareTaskRequest request) {
        return new SyncInvoker<>(request, DrsMeta.createCompareTask, hcClient);
    }

    /**
     * 创建数据级表对比任务
     *
     * 创建数据级表对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataLevelTableCompareJobRequest 请求对象
     * @return CreateDataLevelTableCompareJobResponse
     */
    public CreateDataLevelTableCompareJobResponse createDataLevelTableCompareJob(
        CreateDataLevelTableCompareJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.createDataLevelTableCompareJob);
    }

    /**
     * 创建数据级表对比任务
     *
     * 创建数据级表对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataLevelTableCompareJobRequest 请求对象
     * @return SyncInvoker<CreateDataLevelTableCompareJobRequest, CreateDataLevelTableCompareJobResponse>
     */
    public SyncInvoker<CreateDataLevelTableCompareJobRequest, CreateDataLevelTableCompareJobResponse> createDataLevelTableCompareJobInvoker(
        CreateDataLevelTableCompareJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.createDataLevelTableCompareJob, hcClient);
    }

    /**
     * 创建对象级对比任务
     *
     * 创建对象级对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateObjectLevelCompareJobRequest 请求对象
     * @return CreateObjectLevelCompareJobResponse
     */
    public CreateObjectLevelCompareJobResponse createObjectLevelCompareJob(CreateObjectLevelCompareJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.createObjectLevelCompareJob);
    }

    /**
     * 创建对象级对比任务
     *
     * 创建对象级对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateObjectLevelCompareJobRequest 请求对象
     * @return SyncInvoker<CreateObjectLevelCompareJobRequest, CreateObjectLevelCompareJobResponse>
     */
    public SyncInvoker<CreateObjectLevelCompareJobRequest, CreateObjectLevelCompareJobResponse> createObjectLevelCompareJobInvoker(
        CreateObjectLevelCompareJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.createObjectLevelCompareJob, hcClient);
    }

    /**
     * 取消对比任务
     *
     * 取消对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCompareJobRequest 请求对象
     * @return DeleteCompareJobResponse
     */
    public DeleteCompareJobResponse deleteCompareJob(DeleteCompareJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.deleteCompareJob);
    }

    /**
     * 取消对比任务
     *
     * 取消对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCompareJobRequest 请求对象
     * @return SyncInvoker<DeleteCompareJobRequest, DeleteCompareJobResponse>
     */
    public SyncInvoker<DeleteCompareJobRequest, DeleteCompareJobResponse> deleteCompareJobInvoker(
        DeleteCompareJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.deleteCompareJob, hcClient);
    }

    /**
     * 下载对比任务结果文件
     *
     * 下载对比任务结果文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCompareResultFileRequest 请求对象
     * @return DownloadCompareResultFileResponse
     */
    public DownloadCompareResultFileResponse downloadCompareResultFile(DownloadCompareResultFileRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.downloadCompareResultFile);
    }

    /**
     * 下载对比任务结果文件
     *
     * 下载对比任务结果文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCompareResultFileRequest 请求对象
     * @return SyncInvoker<DownloadCompareResultFileRequest, DownloadCompareResultFileResponse>
     */
    public SyncInvoker<DownloadCompareResultFileRequest, DownloadCompareResultFileResponse> downloadCompareResultFileInvoker(
        DownloadCompareResultFileRequest request) {
        return new SyncInvoker<>(request, DrsMeta.downloadCompareResultFile, hcClient);
    }

    /**
     * 查询可用的Node规格
     *
     * 查询可用的Node规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableNodeTypesRequest 请求对象
     * @return ListAvailableNodeTypesResponse
     */
    public ListAvailableNodeTypesResponse listAvailableNodeTypes(ListAvailableNodeTypesRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listAvailableNodeTypes);
    }

    /**
     * 查询可用的Node规格
     *
     * 查询可用的Node规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableNodeTypesRequest 请求对象
     * @return SyncInvoker<ListAvailableNodeTypesRequest, ListAvailableNodeTypesResponse>
     */
    public SyncInvoker<ListAvailableNodeTypesRequest, ListAvailableNodeTypesResponse> listAvailableNodeTypesInvoker(
        ListAvailableNodeTypesRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listAvailableNodeTypes, hcClient);
    }

    /**
     * 查询规格未售罄的可用区
     *
     * 查询规格未售罄的可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZoneRequest 请求对象
     * @return ListAvailableZoneResponse
     */
    public ListAvailableZoneResponse listAvailableZone(ListAvailableZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listAvailableZone);
    }

    /**
     * 查询规格未售罄的可用区
     *
     * 查询规格未售罄的可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZoneRequest 请求对象
     * @return SyncInvoker<ListAvailableZoneRequest, ListAvailableZoneResponse>
     */
    public SyncInvoker<ListAvailableZoneRequest, ListAvailableZoneResponse> listAvailableZoneInvoker(
        ListAvailableZoneRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listAvailableZone, hcClient);
    }

    /**
     * 查询对比结果
     *
     * 查询对比结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompareResultRequest 请求对象
     * @return ListCompareResultResponse
     */
    public ListCompareResultResponse listCompareResult(ListCompareResultRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listCompareResult);
    }

    /**
     * 查询对比结果
     *
     * 查询对比结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompareResultRequest 请求对象
     * @return SyncInvoker<ListCompareResultRequest, ListCompareResultResponse>
     */
    public SyncInvoker<ListCompareResultRequest, ListCompareResultResponse> listCompareResultInvoker(
        ListCompareResultRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listCompareResult, hcClient);
    }

    /**
     * 查询内容对比详情
     *
     * 查询内容对比详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareDetailRequest 请求对象
     * @return ListContentCompareDetailResponse
     */
    public ListContentCompareDetailResponse listContentCompareDetail(ListContentCompareDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listContentCompareDetail);
    }

    /**
     * 查询内容对比详情
     *
     * 查询内容对比详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareDetailRequest 请求对象
     * @return SyncInvoker<ListContentCompareDetailRequest, ListContentCompareDetailResponse>
     */
    public SyncInvoker<ListContentCompareDetailRequest, ListContentCompareDetailResponse> listContentCompareDetailInvoker(
        ListContentCompareDetailRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listContentCompareDetail, hcClient);
    }

    /**
     * 查询内容对比差异
     *
     * 查询内容对比差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareDifferenceRequest 请求对象
     * @return ListContentCompareDifferenceResponse
     */
    public ListContentCompareDifferenceResponse listContentCompareDifference(
        ListContentCompareDifferenceRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listContentCompareDifference);
    }

    /**
     * 查询内容对比差异
     *
     * 查询内容对比差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareDifferenceRequest 请求对象
     * @return SyncInvoker<ListContentCompareDifferenceRequest, ListContentCompareDifferenceResponse>
     */
    public SyncInvoker<ListContentCompareDifferenceRequest, ListContentCompareDifferenceResponse> listContentCompareDifferenceInvoker(
        ListContentCompareDifferenceRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listContentCompareDifference, hcClient);
    }

    /**
     * 查询内容对比总览
     *
     * 查询内容对比总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareOverviewRequest 请求对象
     * @return ListContentCompareOverviewResponse
     */
    public ListContentCompareOverviewResponse listContentCompareOverview(ListContentCompareOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listContentCompareOverview);
    }

    /**
     * 查询内容对比总览
     *
     * 查询内容对比总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareOverviewRequest 请求对象
     * @return SyncInvoker<ListContentCompareOverviewRequest, ListContentCompareOverviewResponse>
     */
    public SyncInvoker<ListContentCompareOverviewRequest, ListContentCompareOverviewResponse> listContentCompareOverviewInvoker(
        ListContentCompareOverviewRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listContentCompareOverview, hcClient);
    }

    /**
     * 查询行数对比详情
     *
     * 查询行数对比详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataCompareDetailRequest 请求对象
     * @return ListDataCompareDetailResponse
     */
    public ListDataCompareDetailResponse listDataCompareDetail(ListDataCompareDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listDataCompareDetail);
    }

    /**
     * 查询行数对比详情
     *
     * 查询行数对比详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataCompareDetailRequest 请求对象
     * @return SyncInvoker<ListDataCompareDetailRequest, ListDataCompareDetailResponse>
     */
    public SyncInvoker<ListDataCompareDetailRequest, ListDataCompareDetailResponse> listDataCompareDetailInvoker(
        ListDataCompareDetailRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listDataCompareDetail, hcClient);
    }

    /**
     * 查询行数对比总览
     *
     * 查询行数对比总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataCompareOverviewRequest 请求对象
     * @return ListDataCompareOverviewResponse
     */
    public ListDataCompareOverviewResponse listDataCompareOverview(ListDataCompareOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listDataCompareOverview);
    }

    /**
     * 查询行数对比总览
     *
     * 查询行数对比总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataCompareOverviewRequest 请求对象
     * @return SyncInvoker<ListDataCompareOverviewRequest, ListDataCompareOverviewResponse>
     */
    public SyncInvoker<ListDataCompareOverviewRequest, ListDataCompareOverviewResponse> listDataCompareOverviewInvoker(
        ListDataCompareOverviewRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listDataCompareOverview, hcClient);
    }

    /**
     * 查询数据级表对比任务列表
     *
     * 查询数据级表对比任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataLevelTableCompareJobsRequest 请求对象
     * @return ListDataLevelTableCompareJobsResponse
     */
    public ListDataLevelTableCompareJobsResponse listDataLevelTableCompareJobs(
        ListDataLevelTableCompareJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listDataLevelTableCompareJobs);
    }

    /**
     * 查询数据级表对比任务列表
     *
     * 查询数据级表对比任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataLevelTableCompareJobsRequest 请求对象
     * @return SyncInvoker<ListDataLevelTableCompareJobsRequest, ListDataLevelTableCompareJobsResponse>
     */
    public SyncInvoker<ListDataLevelTableCompareJobsRequest, ListDataLevelTableCompareJobsResponse> listDataLevelTableCompareJobsInvoker(
        ListDataLevelTableCompareJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listDataLevelTableCompareJobs, hcClient);
    }

    /**
     * 查询对象对比任务详情
     *
     * 查询对象对比任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObejectLevelCompareDetailRequest 请求对象
     * @return ListObejectLevelCompareDetailResponse
     */
    public ListObejectLevelCompareDetailResponse listObejectLevelCompareDetail(
        ListObejectLevelCompareDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listObejectLevelCompareDetail);
    }

    /**
     * 查询对象对比任务详情
     *
     * 查询对象对比任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObejectLevelCompareDetailRequest 请求对象
     * @return SyncInvoker<ListObejectLevelCompareDetailRequest, ListObejectLevelCompareDetailResponse>
     */
    public SyncInvoker<ListObejectLevelCompareDetailRequest, ListObejectLevelCompareDetailResponse> listObejectLevelCompareDetailInvoker(
        ListObejectLevelCompareDetailRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listObejectLevelCompareDetail, hcClient);
    }

    /**
     * 查询对象对比任务概览
     *
     * 查询对象对比任务概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObejectLevelCompareOverviewRequest 请求对象
     * @return ListObejectLevelCompareOverviewResponse
     */
    public ListObejectLevelCompareOverviewResponse listObejectLevelCompareOverview(
        ListObejectLevelCompareOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listObejectLevelCompareOverview);
    }

    /**
     * 查询对象对比任务概览
     *
     * 查询对象对比任务概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObejectLevelCompareOverviewRequest 请求对象
     * @return SyncInvoker<ListObejectLevelCompareOverviewRequest, ListObejectLevelCompareOverviewResponse>
     */
    public SyncInvoker<ListObejectLevelCompareOverviewRequest, ListObejectLevelCompareOverviewResponse> listObejectLevelCompareOverviewInvoker(
        ListObejectLevelCompareOverviewRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listObejectLevelCompareOverview, hcClient);
    }

    /**
     * 获取源库迁移用户列表
     *
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以查询源库的用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listUsers);
    }

    /**
     * 获取源库迁移用户列表
     *
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以查询源库的用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listUsers, hcClient);
    }

    /**
     * 查询租户任务列表
     *
     * 查询租户任务列表，可以根据引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobListRequest 请求对象
     * @return ShowJobListResponse
     */
    public ShowJobListResponse showJobList(ShowJobListRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showJobList);
    }

    /**
     * 查询租户任务列表
     *
     * 查询租户任务列表，可以根据引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobListRequest 请求对象
     * @return SyncInvoker<ShowJobListRequest, ShowJobListResponse>
     */
    public SyncInvoker<ShowJobListRequest, ShowJobListResponse> showJobListInvoker(ShowJobListRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showJobList, hcClient);
    }

    /**
     * 查询容灾监控数据
     *
     * 根据任务ID查询容灾监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitoringDataRequest 请求对象
     * @return ShowMonitoringDataResponse
     */
    public ShowMonitoringDataResponse showMonitoringData(ShowMonitoringDataRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showMonitoringData);
    }

    /**
     * 查询容灾监控数据
     *
     * 根据任务ID查询容灾监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitoringDataRequest 请求对象
     * @return SyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse>
     */
    public SyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse> showMonitoringDataInvoker(
        ShowMonitoringDataRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showMonitoringData, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在某一项目下DRS服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在某一项目下DRS服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showQuotas, hcClient);
    }

    /**
     * 立即启动数据级表对比任务
     *
     * 立即启动数据级表对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPromptlyDataLevelTableCompareJobRequest 请求对象
     * @return StartPromptlyDataLevelTableCompareJobResponse
     */
    public StartPromptlyDataLevelTableCompareJobResponse startPromptlyDataLevelTableCompareJob(
        StartPromptlyDataLevelTableCompareJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.startPromptlyDataLevelTableCompareJob);
    }

    /**
     * 立即启动数据级表对比任务
     *
     * 立即启动数据级表对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPromptlyDataLevelTableCompareJobRequest 请求对象
     * @return SyncInvoker<StartPromptlyDataLevelTableCompareJobRequest, StartPromptlyDataLevelTableCompareJobResponse>
     */
    public SyncInvoker<StartPromptlyDataLevelTableCompareJobRequest, StartPromptlyDataLevelTableCompareJobResponse> startPromptlyDataLevelTableCompareJobInvoker(
        StartPromptlyDataLevelTableCompareJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.startPromptlyDataLevelTableCompareJob, hcClient);
    }

    /**
     * 修改数据库参数
     *
     * 修改数据库参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateParamsRequest 请求对象
     * @return UpdateParamsResponse
     */
    public UpdateParamsResponse updateParams(UpdateParamsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.updateParams);
    }

    /**
     * 修改数据库参数
     *
     * 修改数据库参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateParamsRequest 请求对象
     * @return SyncInvoker<UpdateParamsRequest, UpdateParamsResponse>
     */
    public SyncInvoker<UpdateParamsRequest, UpdateParamsResponse> updateParamsInvoker(UpdateParamsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.updateParams, hcClient);
    }

    /**
     * 高级设置
     *
     * 修改调优参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTuningParamsRequest 请求对象
     * @return UpdateTuningParamsResponse
     */
    public UpdateTuningParamsResponse updateTuningParams(UpdateTuningParamsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.updateTuningParams);
    }

    /**
     * 高级设置
     *
     * 修改调优参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTuningParamsRequest 请求对象
     * @return SyncInvoker<UpdateTuningParamsRequest, UpdateTuningParamsResponse>
     */
    public SyncInvoker<UpdateTuningParamsRequest, UpdateTuningParamsResponse> updateTuningParamsInvoker(
        UpdateTuningParamsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.updateTuningParams, hcClient);
    }

}
