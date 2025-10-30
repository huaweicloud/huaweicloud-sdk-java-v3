package com.huaweicloud.sdk.drs.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.drs.v3.model.ModifyGroupAndStreamRequest;
import com.huaweicloud.sdk.drs.v3.model.ModifyGroupAndStreamResponse;
import com.huaweicloud.sdk.drs.v3.model.QueryTuningParamsRequest;
import com.huaweicloud.sdk.drs.v3.model.QueryTuningParamsResponse;
import com.huaweicloud.sdk.drs.v3.model.SelectGroupAndStreamRequest;
import com.huaweicloud.sdk.drs.v3.model.SelectGroupAndStreamResponse;
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

import java.util.concurrent.CompletableFuture;

public class DrsAsyncClient {

    protected HcClient hcClient;

    public DrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsAsyncClient> newBuilder() {
        ClientBuilder<DrsAsyncClient> clientBuilder = new ClientBuilder<>(DrsAsyncClient::new);
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
     * @return CompletableFuture<BatchChangeDataResponse>
     */
    public CompletableFuture<BatchChangeDataResponse> batchChangeDataAsync(BatchChangeDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchChangeData);
    }

    /**
     * 批量数据加工
     *
     * 数据复制服务支持对同步的对象进行加工，即可以为选择的对象添加规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeDataRequest 请求对象
     * @return AsyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse>
     */
    public AsyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse> batchChangeDataAsyncInvoker(
        BatchChangeDataRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchChangeData, hcClient);
    }

    /**
     * 批量预检查
     *
     * 批量预检查，校验是否可进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckJobsRequest 请求对象
     * @return CompletableFuture<BatchCheckJobsResponse>
     */
    public CompletableFuture<BatchCheckJobsResponse> batchCheckJobsAsync(BatchCheckJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCheckJobs);
    }

    /**
     * 批量预检查
     *
     * 批量预检查，校验是否可进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckJobsRequest 请求对象
     * @return AsyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse>
     */
    public AsyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse> batchCheckJobsAsyncInvoker(
        BatchCheckJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchCheckJobs, hcClient);
    }

    /**
     * 批量查询预检查结果
     *
     * 批量查询任务的预检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckResultsRequest 请求对象
     * @return CompletableFuture<BatchCheckResultsResponse>
     */
    public CompletableFuture<BatchCheckResultsResponse> batchCheckResultsAsync(BatchCheckResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCheckResults);
    }

    /**
     * 批量查询预检查结果
     *
     * 批量查询任务的预检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckResultsRequest 请求对象
     * @return AsyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse>
     */
    public AsyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse> batchCheckResultsAsyncInvoker(
        BatchCheckResultsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchCheckResults, hcClient);
    }

    /**
     * 批量创建任务
     *
     * 根据请求参数不同，可以批量创建实时迁移、实时同步、实时灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateJobsRequest 请求对象
     * @return CompletableFuture<BatchCreateJobsResponse>
     */
    public CompletableFuture<BatchCreateJobsResponse> batchCreateJobsAsync(BatchCreateJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCreateJobs);
    }

    /**
     * 批量创建任务
     *
     * 根据请求参数不同，可以批量创建实时迁移、实时同步、实时灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateJobsRequest 请求对象
     * @return AsyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse>
     */
    public AsyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse> batchCreateJobsAsyncInvoker(
        BatchCreateJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchCreateJobs, hcClient);
    }

    /**
     * 批量结束任务或删除任务
     *
     * 批量结束任务或删除实时迁移、实时同步、实时灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return CompletableFuture<BatchDeleteJobsResponse>
     */
    public CompletableFuture<BatchDeleteJobsResponse> batchDeleteJobsAsync(BatchDeleteJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchDeleteJobs);
    }

    /**
     * 批量结束任务或删除任务
     *
     * 批量结束任务或删除实时迁移、实时同步、实时灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>
     */
    public AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsAsyncInvoker(
        BatchDeleteJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchDeleteJobs, hcClient);
    }

    /**
     * 批量查询任务详情
     *
     * 根据任务ID批量查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListJobDetailsRequest 请求对象
     * @return CompletableFuture<BatchListJobDetailsResponse>
     */
    public CompletableFuture<BatchListJobDetailsResponse> batchListJobDetailsAsync(BatchListJobDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListJobDetails);
    }

    /**
     * 批量查询任务详情
     *
     * 根据任务ID批量查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListJobDetailsRequest 请求对象
     * @return AsyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse>
     */
    public AsyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse> batchListJobDetailsAsyncInvoker(
        BatchListJobDetailsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchListJobDetails, hcClient);
    }

    /**
     * 批量查询任务状态
     *
     * 根据任务ID批量查询任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListJobStatusRequest 请求对象
     * @return CompletableFuture<BatchListJobStatusResponse>
     */
    public CompletableFuture<BatchListJobStatusResponse> batchListJobStatusAsync(BatchListJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListJobStatus);
    }

    /**
     * 批量查询任务状态
     *
     * 根据任务ID批量查询任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListJobStatusRequest 请求对象
     * @return AsyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse>
     */
    public AsyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse> batchListJobStatusAsyncInvoker(
        BatchListJobStatusRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchListJobStatus, hcClient);
    }

    /**
     * 批量查询任务进度
     *
     * 根据任务ID批量查询全量进度、增量时延信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListProgressesRequest 请求对象
     * @return CompletableFuture<BatchListProgressesResponse>
     */
    public CompletableFuture<BatchListProgressesResponse> batchListProgressesAsync(BatchListProgressesRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListProgresses);
    }

    /**
     * 批量查询任务进度
     *
     * 根据任务ID批量查询全量进度、增量时延信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListProgressesRequest 请求对象
     * @return AsyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse>
     */
    public AsyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse> batchListProgressesAsyncInvoker(
        BatchListProgressesRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchListProgresses, hcClient);
    }

    /**
     * 批量查询RPO和RTO
     *
     * 批量查询RPO和RTO。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListRposAndRtosRequest 请求对象
     * @return CompletableFuture<BatchListRposAndRtosResponse>
     */
    public CompletableFuture<BatchListRposAndRtosResponse> batchListRposAndRtosAsync(
        BatchListRposAndRtosRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListRposAndRtos);
    }

    /**
     * 批量查询RPO和RTO
     *
     * 批量查询RPO和RTO。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListRposAndRtosRequest 请求对象
     * @return AsyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse>
     */
    public AsyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> batchListRposAndRtosAsyncInvoker(
        BatchListRposAndRtosRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchListRposAndRtos, hcClient);
    }

    /**
     * 批量查询灾备初始化对象详情
     *
     * 根据任务ID批量查询灾备初始化对象详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListStructDetailRequest 请求对象
     * @return CompletableFuture<BatchListStructDetailResponse>
     */
    public CompletableFuture<BatchListStructDetailResponse> batchListStructDetailAsync(
        BatchListStructDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListStructDetail);
    }

    /**
     * 批量查询灾备初始化对象详情
     *
     * 根据任务ID批量查询灾备初始化对象详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListStructDetailRequest 请求对象
     * @return AsyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse>
     */
    public AsyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse> batchListStructDetailAsyncInvoker(
        BatchListStructDetailRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchListStructDetail, hcClient);
    }

    /**
     * 批量查询灾备初始化进度
     *
     * 根据任务ID批量查询灾备初始化进度，虚拟id不支持查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListStructProcessRequest 请求对象
     * @return CompletableFuture<BatchListStructProcessResponse>
     */
    public CompletableFuture<BatchListStructProcessResponse> batchListStructProcessAsync(
        BatchListStructProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListStructProcess);
    }

    /**
     * 批量查询灾备初始化进度
     *
     * 根据任务ID批量查询灾备初始化进度，虚拟id不支持查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListStructProcessRequest 请求对象
     * @return AsyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse>
     */
    public AsyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse> batchListStructProcessAsyncInvoker(
        BatchListStructProcessRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchListStructProcess, hcClient);
    }

    /**
     * 批量修改源库/目标库密码
     *
     * 任务启动之后需要修改源库/目标库密码时调用此接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetPasswordRequest 请求对象
     * @return CompletableFuture<BatchResetPasswordResponse>
     */
    public CompletableFuture<BatchResetPasswordResponse> batchResetPasswordAsync(BatchResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchResetPassword);
    }

    /**
     * 批量修改源库/目标库密码
     *
     * 任务启动之后需要修改源库/目标库密码时调用此接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetPasswordRequest 请求对象
     * @return AsyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse>
     */
    public AsyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse> batchResetPasswordAsyncInvoker(
        BatchResetPasswordRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchResetPassword, hcClient);
    }

    /**
     * 批量续传/重试
     *
     * 在迁移过程中由于不确定因素导致迁移任务失败，可通过重试功能，重新提交迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreTaskRequest 请求对象
     * @return CompletableFuture<BatchRestoreTaskResponse>
     */
    public CompletableFuture<BatchRestoreTaskResponse> batchRestoreTaskAsync(BatchRestoreTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchRestoreTask);
    }

    /**
     * 批量续传/重试
     *
     * 在迁移过程中由于不确定因素导致迁移任务失败，可通过重试功能，重新提交迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreTaskRequest 请求对象
     * @return AsyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse>
     */
    public AsyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse> batchRestoreTaskAsyncInvoker(
        BatchRestoreTaskRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchRestoreTask, hcClient);
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
     * @return CompletableFuture<BatchSetDefinerResponse>
     */
    public CompletableFuture<BatchSetDefinerResponse> batchSetDefinerAsync(BatchSetDefinerRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSetDefiner);
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
     * @return AsyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse>
     */
    public AsyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse> batchSetDefinerAsyncInvoker(
        BatchSetDefinerRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchSetDefiner, hcClient);
    }

    /**
     * 批量数据库对象选择
     *
     * 迁移之前，选择需要迁移的数据库或者表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetObjectsRequest 请求对象
     * @return CompletableFuture<BatchSetObjectsResponse>
     */
    public CompletableFuture<BatchSetObjectsResponse> batchSetObjectsAsync(BatchSetObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSetObjects);
    }

    /**
     * 批量数据库对象选择
     *
     * 迁移之前，选择需要迁移的数据库或者表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetObjectsRequest 请求对象
     * @return AsyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse>
     */
    public AsyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse> batchSetObjectsAsyncInvoker(
        BatchSetObjectsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchSetObjects, hcClient);
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
     * @return CompletableFuture<BatchSetPolicyResponse>
     */
    public CompletableFuture<BatchSetPolicyResponse> batchSetPolicyAsync(BatchSetPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSetPolicy);
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
     * @return AsyncInvoker<BatchSetPolicyRequest, BatchSetPolicyResponse>
     */
    public AsyncInvoker<BatchSetPolicyRequest, BatchSetPolicyResponse> batchSetPolicyAsyncInvoker(
        BatchSetPolicyRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchSetPolicy, hcClient);
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
     * @return CompletableFuture<BatchSetSmnResponse>
     */
    public CompletableFuture<BatchSetSmnResponse> batchSetSmnAsync(BatchSetSmnRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSetSmn);
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
     * @return AsyncInvoker<BatchSetSmnRequest, BatchSetSmnResponse>
     */
    public AsyncInvoker<BatchSetSmnRequest, BatchSetSmnResponse> batchSetSmnAsyncInvoker(BatchSetSmnRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchSetSmn, hcClient);
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
     * @return CompletableFuture<BatchSetSpeedResponse>
     */
    public CompletableFuture<BatchSetSpeedResponse> batchSetSpeedAsync(BatchSetSpeedRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSetSpeed);
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
     * @return AsyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse>
     */
    public AsyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse> batchSetSpeedAsyncInvoker(
        BatchSetSpeedRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchSetSpeed, hcClient);
    }

    /**
     * 批量获取数据库参数
     *
     * 在进行数据库迁移时，为了确保迁移成功后业务应用的使用不受影响，数据复制服务提供了参数对比功能帮助您进行源库和目标库参数一致性对比，此接口可以获取源库和目标库的数据库参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowParamsRequest 请求对象
     * @return CompletableFuture<BatchShowParamsResponse>
     */
    public CompletableFuture<BatchShowParamsResponse> batchShowParamsAsync(BatchShowParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchShowParams);
    }

    /**
     * 批量获取数据库参数
     *
     * 在进行数据库迁移时，为了确保迁移成功后业务应用的使用不受影响，数据复制服务提供了参数对比功能帮助您进行源库和目标库参数一致性对比，此接口可以获取源库和目标库的数据库参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowParamsRequest 请求对象
     * @return AsyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse>
     */
    public AsyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse> batchShowParamsAsyncInvoker(
        BatchShowParamsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchShowParams, hcClient);
    }

    /**
     * 批量启动任务
     *
     * 批量启动实时迁移、同步、灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartJobsRequest 请求对象
     * @return CompletableFuture<BatchStartJobsResponse>
     */
    public CompletableFuture<BatchStartJobsResponse> batchStartJobsAsync(BatchStartJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchStartJobs);
    }

    /**
     * 批量启动任务
     *
     * 批量启动实时迁移、同步、灾备任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartJobsRequest 请求对象
     * @return AsyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse>
     */
    public AsyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse> batchStartJobsAsyncInvoker(
        BatchStartJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchStartJobs, hcClient);
    }

    /**
     * 批量暂停任务
     *
     * 批量暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopJobsRequest 请求对象
     * @return CompletableFuture<BatchStopJobsResponse>
     */
    public CompletableFuture<BatchStopJobsResponse> batchStopJobsAsync(BatchStopJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchStopJobs);
    }

    /**
     * 批量暂停任务
     *
     * 批量暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopJobsRequest 请求对象
     * @return AsyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse>
     */
    public AsyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse> batchStopJobsAsyncInvoker(
        BatchStopJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchStopJobs, hcClient);
    }

    /**
     * 批量主备倒换
     *
     * 批量主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSwitchoverRequest 请求对象
     * @return CompletableFuture<BatchSwitchoverResponse>
     */
    public CompletableFuture<BatchSwitchoverResponse> batchSwitchoverAsync(BatchSwitchoverRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSwitchover);
    }

    /**
     * 批量主备倒换
     *
     * 批量主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSwitchoverRequest 请求对象
     * @return AsyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse>
     */
    public AsyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse> batchSwitchoverAsyncInvoker(
        BatchSwitchoverRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchSwitchover, hcClient);
    }

    /**
     * 批量修改任务
     *
     * 批量修改任务名称或描述，设置异常通知信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateJobRequest 请求对象
     * @return CompletableFuture<BatchUpdateJobResponse>
     */
    public CompletableFuture<BatchUpdateJobResponse> batchUpdateJobAsync(BatchUpdateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchUpdateJob);
    }

    /**
     * 批量修改任务
     *
     * 批量修改任务名称或描述，设置异常通知信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateJobRequest 请求对象
     * @return AsyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse>
     */
    public AsyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse> batchUpdateJobAsyncInvoker(
        BatchUpdateJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchUpdateJob, hcClient);
    }

    /**
     * 批量更新迁移用户信息
     *
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以批量设置需要迁移的用户和角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUserRequest 请求对象
     * @return CompletableFuture<BatchUpdateUserResponse>
     */
    public CompletableFuture<BatchUpdateUserResponse> batchUpdateUserAsync(BatchUpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchUpdateUser);
    }

    /**
     * 批量更新迁移用户信息
     *
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以批量设置需要迁移的用户和角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUserRequest 请求对象
     * @return AsyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse>
     */
    public AsyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse> batchUpdateUserAsyncInvoker(
        BatchUpdateUserRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchUpdateUser, hcClient);
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
     * @return CompletableFuture<BatchValidateClustersConnectionsResponse>
     */
    public CompletableFuture<BatchValidateClustersConnectionsResponse> batchValidateClustersConnectionsAsync(
        BatchValidateClustersConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchValidateClustersConnections);
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
     * @return AsyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse>
     */
    public AsyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> batchValidateClustersConnectionsAsyncInvoker(
        BatchValidateClustersConnectionsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchValidateClustersConnections, hcClient);
    }

    /**
     * 批量测试连接
     *
     * 批量测试连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateConnectionsRequest 请求对象
     * @return CompletableFuture<BatchValidateConnectionsResponse>
     */
    public CompletableFuture<BatchValidateConnectionsResponse> batchValidateConnectionsAsync(
        BatchValidateConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchValidateConnections);
    }

    /**
     * 批量测试连接
     *
     * 批量测试连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateConnectionsRequest 请求对象
     * @return AsyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse>
     */
    public AsyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> batchValidateConnectionsAsyncInvoker(
        BatchValidateConnectionsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchValidateConnections, hcClient);
    }

    /**
     * 导出对比任务结果文件
     *
     * 导出对比任务结果文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCompareResultFileRequest 请求对象
     * @return CompletableFuture<CreateCompareResultFileResponse>
     */
    public CompletableFuture<CreateCompareResultFileResponse> createCompareResultFileAsync(
        CreateCompareResultFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.createCompareResultFile);
    }

    /**
     * 导出对比任务结果文件
     *
     * 导出对比任务结果文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCompareResultFileRequest 请求对象
     * @return AsyncInvoker<CreateCompareResultFileRequest, CreateCompareResultFileResponse>
     */
    public AsyncInvoker<CreateCompareResultFileRequest, CreateCompareResultFileResponse> createCompareResultFileAsyncInvoker(
        CreateCompareResultFileRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.createCompareResultFile, hcClient);
    }

    /**
     * 创建对比任务
     *
     * 创建对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCompareTaskRequest 请求对象
     * @return CompletableFuture<CreateCompareTaskResponse>
     */
    public CompletableFuture<CreateCompareTaskResponse> createCompareTaskAsync(CreateCompareTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.createCompareTask);
    }

    /**
     * 创建对比任务
     *
     * 创建对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCompareTaskRequest 请求对象
     * @return AsyncInvoker<CreateCompareTaskRequest, CreateCompareTaskResponse>
     */
    public AsyncInvoker<CreateCompareTaskRequest, CreateCompareTaskResponse> createCompareTaskAsyncInvoker(
        CreateCompareTaskRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.createCompareTask, hcClient);
    }

    /**
     * 创建数据级表对比任务
     *
     * 创建数据级表对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataLevelTableCompareJobRequest 请求对象
     * @return CompletableFuture<CreateDataLevelTableCompareJobResponse>
     */
    public CompletableFuture<CreateDataLevelTableCompareJobResponse> createDataLevelTableCompareJobAsync(
        CreateDataLevelTableCompareJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.createDataLevelTableCompareJob);
    }

    /**
     * 创建数据级表对比任务
     *
     * 创建数据级表对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataLevelTableCompareJobRequest 请求对象
     * @return AsyncInvoker<CreateDataLevelTableCompareJobRequest, CreateDataLevelTableCompareJobResponse>
     */
    public AsyncInvoker<CreateDataLevelTableCompareJobRequest, CreateDataLevelTableCompareJobResponse> createDataLevelTableCompareJobAsyncInvoker(
        CreateDataLevelTableCompareJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.createDataLevelTableCompareJob, hcClient);
    }

    /**
     * 创建对象级对比任务
     *
     * 创建对象级对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateObjectLevelCompareJobRequest 请求对象
     * @return CompletableFuture<CreateObjectLevelCompareJobResponse>
     */
    public CompletableFuture<CreateObjectLevelCompareJobResponse> createObjectLevelCompareJobAsync(
        CreateObjectLevelCompareJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.createObjectLevelCompareJob);
    }

    /**
     * 创建对象级对比任务
     *
     * 创建对象级对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateObjectLevelCompareJobRequest 请求对象
     * @return AsyncInvoker<CreateObjectLevelCompareJobRequest, CreateObjectLevelCompareJobResponse>
     */
    public AsyncInvoker<CreateObjectLevelCompareJobRequest, CreateObjectLevelCompareJobResponse> createObjectLevelCompareJobAsyncInvoker(
        CreateObjectLevelCompareJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.createObjectLevelCompareJob, hcClient);
    }

    /**
     * 取消对比任务
     *
     * 取消对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCompareJobRequest 请求对象
     * @return CompletableFuture<DeleteCompareJobResponse>
     */
    public CompletableFuture<DeleteCompareJobResponse> deleteCompareJobAsync(DeleteCompareJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.deleteCompareJob);
    }

    /**
     * 取消对比任务
     *
     * 取消对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCompareJobRequest 请求对象
     * @return AsyncInvoker<DeleteCompareJobRequest, DeleteCompareJobResponse>
     */
    public AsyncInvoker<DeleteCompareJobRequest, DeleteCompareJobResponse> deleteCompareJobAsyncInvoker(
        DeleteCompareJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.deleteCompareJob, hcClient);
    }

    /**
     * 下载对比任务结果文件
     *
     * 下载对比任务结果文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCompareResultFileRequest 请求对象
     * @return CompletableFuture<DownloadCompareResultFileResponse>
     */
    public CompletableFuture<DownloadCompareResultFileResponse> downloadCompareResultFileAsync(
        DownloadCompareResultFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.downloadCompareResultFile);
    }

    /**
     * 下载对比任务结果文件
     *
     * 下载对比任务结果文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCompareResultFileRequest 请求对象
     * @return AsyncInvoker<DownloadCompareResultFileRequest, DownloadCompareResultFileResponse>
     */
    public AsyncInvoker<DownloadCompareResultFileRequest, DownloadCompareResultFileResponse> downloadCompareResultFileAsyncInvoker(
        DownloadCompareResultFileRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.downloadCompareResultFile, hcClient);
    }

    /**
     * 查询可用的Node规格
     *
     * 查询可用的Node规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableNodeTypesRequest 请求对象
     * @return CompletableFuture<ListAvailableNodeTypesResponse>
     */
    public CompletableFuture<ListAvailableNodeTypesResponse> listAvailableNodeTypesAsync(
        ListAvailableNodeTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listAvailableNodeTypes);
    }

    /**
     * 查询可用的Node规格
     *
     * 查询可用的Node规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableNodeTypesRequest 请求对象
     * @return AsyncInvoker<ListAvailableNodeTypesRequest, ListAvailableNodeTypesResponse>
     */
    public AsyncInvoker<ListAvailableNodeTypesRequest, ListAvailableNodeTypesResponse> listAvailableNodeTypesAsyncInvoker(
        ListAvailableNodeTypesRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listAvailableNodeTypes, hcClient);
    }

    /**
     * 查询规格未售罄的可用区
     *
     * 查询规格未售罄的可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZoneRequest 请求对象
     * @return CompletableFuture<ListAvailableZoneResponse>
     */
    public CompletableFuture<ListAvailableZoneResponse> listAvailableZoneAsync(ListAvailableZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listAvailableZone);
    }

    /**
     * 查询规格未售罄的可用区
     *
     * 查询规格未售罄的可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZoneRequest 请求对象
     * @return AsyncInvoker<ListAvailableZoneRequest, ListAvailableZoneResponse>
     */
    public AsyncInvoker<ListAvailableZoneRequest, ListAvailableZoneResponse> listAvailableZoneAsyncInvoker(
        ListAvailableZoneRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listAvailableZone, hcClient);
    }

    /**
     * 查询对比结果
     *
     * 查询对比结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompareResultRequest 请求对象
     * @return CompletableFuture<ListCompareResultResponse>
     */
    public CompletableFuture<ListCompareResultResponse> listCompareResultAsync(ListCompareResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listCompareResult);
    }

    /**
     * 查询对比结果
     *
     * 查询对比结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompareResultRequest 请求对象
     * @return AsyncInvoker<ListCompareResultRequest, ListCompareResultResponse>
     */
    public AsyncInvoker<ListCompareResultRequest, ListCompareResultResponse> listCompareResultAsyncInvoker(
        ListCompareResultRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listCompareResult, hcClient);
    }

    /**
     * 查询内容对比详情
     *
     * 查询内容对比详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareDetailRequest 请求对象
     * @return CompletableFuture<ListContentCompareDetailResponse>
     */
    public CompletableFuture<ListContentCompareDetailResponse> listContentCompareDetailAsync(
        ListContentCompareDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listContentCompareDetail);
    }

    /**
     * 查询内容对比详情
     *
     * 查询内容对比详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareDetailRequest 请求对象
     * @return AsyncInvoker<ListContentCompareDetailRequest, ListContentCompareDetailResponse>
     */
    public AsyncInvoker<ListContentCompareDetailRequest, ListContentCompareDetailResponse> listContentCompareDetailAsyncInvoker(
        ListContentCompareDetailRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listContentCompareDetail, hcClient);
    }

    /**
     * 查询内容对比差异
     *
     * 查询内容对比差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareDifferenceRequest 请求对象
     * @return CompletableFuture<ListContentCompareDifferenceResponse>
     */
    public CompletableFuture<ListContentCompareDifferenceResponse> listContentCompareDifferenceAsync(
        ListContentCompareDifferenceRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listContentCompareDifference);
    }

    /**
     * 查询内容对比差异
     *
     * 查询内容对比差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareDifferenceRequest 请求对象
     * @return AsyncInvoker<ListContentCompareDifferenceRequest, ListContentCompareDifferenceResponse>
     */
    public AsyncInvoker<ListContentCompareDifferenceRequest, ListContentCompareDifferenceResponse> listContentCompareDifferenceAsyncInvoker(
        ListContentCompareDifferenceRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listContentCompareDifference, hcClient);
    }

    /**
     * 查询内容对比总览
     *
     * 查询内容对比总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareOverviewRequest 请求对象
     * @return CompletableFuture<ListContentCompareOverviewResponse>
     */
    public CompletableFuture<ListContentCompareOverviewResponse> listContentCompareOverviewAsync(
        ListContentCompareOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listContentCompareOverview);
    }

    /**
     * 查询内容对比总览
     *
     * 查询内容对比总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContentCompareOverviewRequest 请求对象
     * @return AsyncInvoker<ListContentCompareOverviewRequest, ListContentCompareOverviewResponse>
     */
    public AsyncInvoker<ListContentCompareOverviewRequest, ListContentCompareOverviewResponse> listContentCompareOverviewAsyncInvoker(
        ListContentCompareOverviewRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listContentCompareOverview, hcClient);
    }

    /**
     * 查询行数对比详情
     *
     * 查询行数对比详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataCompareDetailRequest 请求对象
     * @return CompletableFuture<ListDataCompareDetailResponse>
     */
    public CompletableFuture<ListDataCompareDetailResponse> listDataCompareDetailAsync(
        ListDataCompareDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listDataCompareDetail);
    }

    /**
     * 查询行数对比详情
     *
     * 查询行数对比详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataCompareDetailRequest 请求对象
     * @return AsyncInvoker<ListDataCompareDetailRequest, ListDataCompareDetailResponse>
     */
    public AsyncInvoker<ListDataCompareDetailRequest, ListDataCompareDetailResponse> listDataCompareDetailAsyncInvoker(
        ListDataCompareDetailRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listDataCompareDetail, hcClient);
    }

    /**
     * 查询行数对比总览
     *
     * 查询行数对比总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataCompareOverviewRequest 请求对象
     * @return CompletableFuture<ListDataCompareOverviewResponse>
     */
    public CompletableFuture<ListDataCompareOverviewResponse> listDataCompareOverviewAsync(
        ListDataCompareOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listDataCompareOverview);
    }

    /**
     * 查询行数对比总览
     *
     * 查询行数对比总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataCompareOverviewRequest 请求对象
     * @return AsyncInvoker<ListDataCompareOverviewRequest, ListDataCompareOverviewResponse>
     */
    public AsyncInvoker<ListDataCompareOverviewRequest, ListDataCompareOverviewResponse> listDataCompareOverviewAsyncInvoker(
        ListDataCompareOverviewRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listDataCompareOverview, hcClient);
    }

    /**
     * 查询数据级表对比任务列表
     *
     * 查询数据级表对比任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataLevelTableCompareJobsRequest 请求对象
     * @return CompletableFuture<ListDataLevelTableCompareJobsResponse>
     */
    public CompletableFuture<ListDataLevelTableCompareJobsResponse> listDataLevelTableCompareJobsAsync(
        ListDataLevelTableCompareJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listDataLevelTableCompareJobs);
    }

    /**
     * 查询数据级表对比任务列表
     *
     * 查询数据级表对比任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataLevelTableCompareJobsRequest 请求对象
     * @return AsyncInvoker<ListDataLevelTableCompareJobsRequest, ListDataLevelTableCompareJobsResponse>
     */
    public AsyncInvoker<ListDataLevelTableCompareJobsRequest, ListDataLevelTableCompareJobsResponse> listDataLevelTableCompareJobsAsyncInvoker(
        ListDataLevelTableCompareJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listDataLevelTableCompareJobs, hcClient);
    }

    /**
     * 查询对象对比任务详情
     *
     * 查询对象对比任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObejectLevelCompareDetailRequest 请求对象
     * @return CompletableFuture<ListObejectLevelCompareDetailResponse>
     */
    public CompletableFuture<ListObejectLevelCompareDetailResponse> listObejectLevelCompareDetailAsync(
        ListObejectLevelCompareDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listObejectLevelCompareDetail);
    }

    /**
     * 查询对象对比任务详情
     *
     * 查询对象对比任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObejectLevelCompareDetailRequest 请求对象
     * @return AsyncInvoker<ListObejectLevelCompareDetailRequest, ListObejectLevelCompareDetailResponse>
     */
    public AsyncInvoker<ListObejectLevelCompareDetailRequest, ListObejectLevelCompareDetailResponse> listObejectLevelCompareDetailAsyncInvoker(
        ListObejectLevelCompareDetailRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listObejectLevelCompareDetail, hcClient);
    }

    /**
     * 查询对象对比任务概览
     *
     * 查询对象对比任务概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObejectLevelCompareOverviewRequest 请求对象
     * @return CompletableFuture<ListObejectLevelCompareOverviewResponse>
     */
    public CompletableFuture<ListObejectLevelCompareOverviewResponse> listObejectLevelCompareOverviewAsync(
        ListObejectLevelCompareOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listObejectLevelCompareOverview);
    }

    /**
     * 查询对象对比任务概览
     *
     * 查询对象对比任务概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObejectLevelCompareOverviewRequest 请求对象
     * @return AsyncInvoker<ListObejectLevelCompareOverviewRequest, ListObejectLevelCompareOverviewResponse>
     */
    public AsyncInvoker<ListObejectLevelCompareOverviewRequest, ListObejectLevelCompareOverviewResponse> listObejectLevelCompareOverviewAsyncInvoker(
        ListObejectLevelCompareOverviewRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listObejectLevelCompareOverview, hcClient);
    }

    /**
     * 获取源库迁移用户列表
     *
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以查询源库的用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listUsers);
    }

    /**
     * 获取源库迁移用户列表
     *
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以查询源库的用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listUsers, hcClient);
    }

    /**
     * 更新LTS配置
     *
     * 更新任务的LTS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGroupAndStreamRequest 请求对象
     * @return CompletableFuture<ModifyGroupAndStreamResponse>
     */
    public CompletableFuture<ModifyGroupAndStreamResponse> modifyGroupAndStreamAsync(
        ModifyGroupAndStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.modifyGroupAndStream);
    }

    /**
     * 更新LTS配置
     *
     * 更新任务的LTS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGroupAndStreamRequest 请求对象
     * @return AsyncInvoker<ModifyGroupAndStreamRequest, ModifyGroupAndStreamResponse>
     */
    public AsyncInvoker<ModifyGroupAndStreamRequest, ModifyGroupAndStreamResponse> modifyGroupAndStreamAsyncInvoker(
        ModifyGroupAndStreamRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.modifyGroupAndStream, hcClient);
    }

    /**
     * 查询高级设置参数
     *
     * 查询高级设置参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QueryTuningParamsRequest 请求对象
     * @return CompletableFuture<QueryTuningParamsResponse>
     */
    public CompletableFuture<QueryTuningParamsResponse> queryTuningParamsAsync(QueryTuningParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.queryTuningParams);
    }

    /**
     * 查询高级设置参数
     *
     * 查询高级设置参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QueryTuningParamsRequest 请求对象
     * @return AsyncInvoker<QueryTuningParamsRequest, QueryTuningParamsResponse>
     */
    public AsyncInvoker<QueryTuningParamsRequest, QueryTuningParamsResponse> queryTuningParamsAsyncInvoker(
        QueryTuningParamsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.queryTuningParams, hcClient);
    }

    /**
     * 查询LTS配置
     *
     * 查询任务的LTS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SelectGroupAndStreamRequest 请求对象
     * @return CompletableFuture<SelectGroupAndStreamResponse>
     */
    public CompletableFuture<SelectGroupAndStreamResponse> selectGroupAndStreamAsync(
        SelectGroupAndStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.selectGroupAndStream);
    }

    /**
     * 查询LTS配置
     *
     * 查询任务的LTS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SelectGroupAndStreamRequest 请求对象
     * @return AsyncInvoker<SelectGroupAndStreamRequest, SelectGroupAndStreamResponse>
     */
    public AsyncInvoker<SelectGroupAndStreamRequest, SelectGroupAndStreamResponse> selectGroupAndStreamAsyncInvoker(
        SelectGroupAndStreamRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.selectGroupAndStream, hcClient);
    }

    /**
     * 查询租户任务列表
     *
     * 查询租户任务列表，可以根据引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobListRequest 请求对象
     * @return CompletableFuture<ShowJobListResponse>
     */
    public CompletableFuture<ShowJobListResponse> showJobListAsync(ShowJobListRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showJobList);
    }

    /**
     * 查询租户任务列表
     *
     * 查询租户任务列表，可以根据引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobListRequest 请求对象
     * @return AsyncInvoker<ShowJobListRequest, ShowJobListResponse>
     */
    public AsyncInvoker<ShowJobListRequest, ShowJobListResponse> showJobListAsyncInvoker(ShowJobListRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showJobList, hcClient);
    }

    /**
     * 查询容灾监控数据
     *
     * 根据任务ID查询容灾监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitoringDataRequest 请求对象
     * @return CompletableFuture<ShowMonitoringDataResponse>
     */
    public CompletableFuture<ShowMonitoringDataResponse> showMonitoringDataAsync(ShowMonitoringDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showMonitoringData);
    }

    /**
     * 查询容灾监控数据
     *
     * 根据任务ID查询容灾监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitoringDataRequest 请求对象
     * @return AsyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse>
     */
    public AsyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse> showMonitoringDataAsyncInvoker(
        ShowMonitoringDataRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showMonitoringData, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在某一项目下DRS服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在某一项目下DRS服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showQuotas, hcClient);
    }

    /**
     * 立即启动数据级表对比任务
     *
     * 立即启动数据级表对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPromptlyDataLevelTableCompareJobRequest 请求对象
     * @return CompletableFuture<StartPromptlyDataLevelTableCompareJobResponse>
     */
    public CompletableFuture<StartPromptlyDataLevelTableCompareJobResponse> startPromptlyDataLevelTableCompareJobAsync(
        StartPromptlyDataLevelTableCompareJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.startPromptlyDataLevelTableCompareJob);
    }

    /**
     * 立即启动数据级表对比任务
     *
     * 立即启动数据级表对比任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPromptlyDataLevelTableCompareJobRequest 请求对象
     * @return AsyncInvoker<StartPromptlyDataLevelTableCompareJobRequest, StartPromptlyDataLevelTableCompareJobResponse>
     */
    public AsyncInvoker<StartPromptlyDataLevelTableCompareJobRequest, StartPromptlyDataLevelTableCompareJobResponse> startPromptlyDataLevelTableCompareJobAsyncInvoker(
        StartPromptlyDataLevelTableCompareJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.startPromptlyDataLevelTableCompareJob, hcClient);
    }

    /**
     * 修改数据库参数
     *
     * 修改数据库参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateParamsRequest 请求对象
     * @return CompletableFuture<UpdateParamsResponse>
     */
    public CompletableFuture<UpdateParamsResponse> updateParamsAsync(UpdateParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateParams);
    }

    /**
     * 修改数据库参数
     *
     * 修改数据库参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateParamsRequest 请求对象
     * @return AsyncInvoker<UpdateParamsRequest, UpdateParamsResponse>
     */
    public AsyncInvoker<UpdateParamsRequest, UpdateParamsResponse> updateParamsAsyncInvoker(
        UpdateParamsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateParams, hcClient);
    }

    /**
     * 高级设置
     *
     * 修改调优参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTuningParamsRequest 请求对象
     * @return CompletableFuture<UpdateTuningParamsResponse>
     */
    public CompletableFuture<UpdateTuningParamsResponse> updateTuningParamsAsync(UpdateTuningParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateTuningParams);
    }

    /**
     * 高级设置
     *
     * 修改调优参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTuningParamsRequest 请求对象
     * @return AsyncInvoker<UpdateTuningParamsRequest, UpdateTuningParamsResponse>
     */
    public AsyncInvoker<UpdateTuningParamsRequest, UpdateTuningParamsResponse> updateTuningParamsAsyncInvoker(
        UpdateTuningParamsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateTuningParams, hcClient);
    }

}
