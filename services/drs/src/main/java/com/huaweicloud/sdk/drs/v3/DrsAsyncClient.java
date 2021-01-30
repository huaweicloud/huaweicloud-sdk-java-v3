package com.huaweicloud.sdk.drs.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.drs.v3.model.*;

public class DrsAsyncClient {
    protected HcClient hcClient;

    public DrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DrsAsyncClient::new);
    }


    /**
     * 批量数据加工
     * 数据复制服务支持对同步的对象进行加工，即可以为选择的对象添加规则。
     *
     * @param BatchChangeDataRequest 请求对象
     * @return CompletableFuture<BatchChangeDataResponse>
     */
    public CompletableFuture<BatchChangeDataResponse> batchChangeDataAsync(BatchChangeDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchChangeData);
    }

    /**
     * 批量数据加工
     * 数据复制服务支持对同步的对象进行加工，即可以为选择的对象添加规则。
     *
     * @param BatchChangeDataRequest 请求对象
     * @return AsyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse>
     */
    public AsyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse> batchChangeDataAsyncInvoker(BatchChangeDataRequest request) {
        return new AsyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse>(request, DrsMeta.batchChangeData, hcClient);
    }

    /**
     * 批量预检查
     * 批量预检查，校验是否可进行迁移。
     *
     * @param BatchCheckJobsRequest 请求对象
     * @return CompletableFuture<BatchCheckJobsResponse>
     */
    public CompletableFuture<BatchCheckJobsResponse> batchCheckJobsAsync(BatchCheckJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCheckJobs);
    }

    /**
     * 批量预检查
     * 批量预检查，校验是否可进行迁移。
     *
     * @param BatchCheckJobsRequest 请求对象
     * @return AsyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse>
     */
    public AsyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse> batchCheckJobsAsyncInvoker(BatchCheckJobsRequest request) {
        return new AsyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse>(request, DrsMeta.batchCheckJobs, hcClient);
    }

    /**
     * 批量查询预检查结果
     * 批量查询任务的预检查结果。
     *
     * @param BatchCheckResultsRequest 请求对象
     * @return CompletableFuture<BatchCheckResultsResponse>
     */
    public CompletableFuture<BatchCheckResultsResponse> batchCheckResultsAsync(BatchCheckResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCheckResults);
    }

    /**
     * 批量查询预检查结果
     * 批量查询任务的预检查结果。
     *
     * @param BatchCheckResultsRequest 请求对象
     * @return AsyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse>
     */
    public AsyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse> batchCheckResultsAsyncInvoker(BatchCheckResultsRequest request) {
        return new AsyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse>(request, DrsMeta.batchCheckResults, hcClient);
    }

    /**
     * 批量创建对比任务
     * 批量创建对比任务。
     *
     * @param BatchCreateCompareTaskRequest 请求对象
     * @return CompletableFuture<BatchCreateCompareTaskResponse>
     */
    public CompletableFuture<BatchCreateCompareTaskResponse> batchCreateCompareTaskAsync(BatchCreateCompareTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCreateCompareTask);
    }

    /**
     * 批量创建对比任务
     * 批量创建对比任务。
     *
     * @param BatchCreateCompareTaskRequest 请求对象
     * @return AsyncInvoker<BatchCreateCompareTaskRequest, BatchCreateCompareTaskResponse>
     */
    public AsyncInvoker<BatchCreateCompareTaskRequest, BatchCreateCompareTaskResponse> batchCreateCompareTaskAsyncInvoker(BatchCreateCompareTaskRequest request) {
        return new AsyncInvoker<BatchCreateCompareTaskRequest, BatchCreateCompareTaskResponse>(request, DrsMeta.batchCreateCompareTask, hcClient);
    }

    /**
     * 批量创建任务
     * 根据请求参数不同，可以批量创建实时迁移、实时同步、实时灾备任务。
     *
     * @param BatchCreateJobsRequest 请求对象
     * @return CompletableFuture<BatchCreateJobsResponse>
     */
    public CompletableFuture<BatchCreateJobsResponse> batchCreateJobsAsync(BatchCreateJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCreateJobs);
    }

    /**
     * 批量创建任务
     * 根据请求参数不同，可以批量创建实时迁移、实时同步、实时灾备任务。
     *
     * @param BatchCreateJobsRequest 请求对象
     * @return AsyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse>
     */
    public AsyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse> batchCreateJobsAsyncInvoker(BatchCreateJobsRequest request) {
        return new AsyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse>(request, DrsMeta.batchCreateJobs, hcClient);
    }

    /**
     * 批量结束任务或删除任务
     * 批量结束任务或删除实时迁移、实时同步、实时灾备任务。
     *
     * @param BatchDeleteJobsRequest 请求对象
     * @return CompletableFuture<BatchDeleteJobsResponse>
     */
    public CompletableFuture<BatchDeleteJobsResponse> batchDeleteJobsAsync(BatchDeleteJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchDeleteJobs);
    }

    /**
     * 批量结束任务或删除任务
     * 批量结束任务或删除实时迁移、实时同步、实时灾备任务。
     *
     * @param BatchDeleteJobsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>
     */
    public AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsAsyncInvoker(BatchDeleteJobsRequest request) {
        return new AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>(request, DrsMeta.batchDeleteJobs, hcClient);
    }

    /**
     * 批量查询对比结果
     * 批量查询对比结果。
     *
     * @param BatchListCompareResultRequest 请求对象
     * @return CompletableFuture<BatchListCompareResultResponse>
     */
    public CompletableFuture<BatchListCompareResultResponse> batchListCompareResultAsync(BatchListCompareResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListCompareResult);
    }

    /**
     * 批量查询对比结果
     * 批量查询对比结果。
     *
     * @param BatchListCompareResultRequest 请求对象
     * @return AsyncInvoker<BatchListCompareResultRequest, BatchListCompareResultResponse>
     */
    public AsyncInvoker<BatchListCompareResultRequest, BatchListCompareResultResponse> batchListCompareResultAsyncInvoker(BatchListCompareResultRequest request) {
        return new AsyncInvoker<BatchListCompareResultRequest, BatchListCompareResultResponse>(request, DrsMeta.batchListCompareResult, hcClient);
    }

    /**
     * 批量查询任务详情
     * 根据任务ID批量查询任务详情。
     *
     * @param BatchListJobDetailsRequest 请求对象
     * @return CompletableFuture<BatchListJobDetailsResponse>
     */
    public CompletableFuture<BatchListJobDetailsResponse> batchListJobDetailsAsync(BatchListJobDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListJobDetails);
    }

    /**
     * 批量查询任务详情
     * 根据任务ID批量查询任务详情。
     *
     * @param BatchListJobDetailsRequest 请求对象
     * @return AsyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse>
     */
    public AsyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse> batchListJobDetailsAsyncInvoker(BatchListJobDetailsRequest request) {
        return new AsyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse>(request, DrsMeta.batchListJobDetails, hcClient);
    }

    /**
     * 批量查询任务状态
     * 根据任务ID批量查询任务状态。
     *
     * @param BatchListJobStatusRequest 请求对象
     * @return CompletableFuture<BatchListJobStatusResponse>
     */
    public CompletableFuture<BatchListJobStatusResponse> batchListJobStatusAsync(BatchListJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListJobStatus);
    }

    /**
     * 批量查询任务状态
     * 根据任务ID批量查询任务状态。
     *
     * @param BatchListJobStatusRequest 请求对象
     * @return AsyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse>
     */
    public AsyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse> batchListJobStatusAsyncInvoker(BatchListJobStatusRequest request) {
        return new AsyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse>(request, DrsMeta.batchListJobStatus, hcClient);
    }

    /**
     * 批量查询任务进度
     * 根据任务ID批量查询全量进度、增量时延信息。
     *
     * @param BatchListProgressesRequest 请求对象
     * @return CompletableFuture<BatchListProgressesResponse>
     */
    public CompletableFuture<BatchListProgressesResponse> batchListProgressesAsync(BatchListProgressesRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListProgresses);
    }

    /**
     * 批量查询任务进度
     * 根据任务ID批量查询全量进度、增量时延信息。
     *
     * @param BatchListProgressesRequest 请求对象
     * @return AsyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse>
     */
    public AsyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse> batchListProgressesAsyncInvoker(BatchListProgressesRequest request) {
        return new AsyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse>(request, DrsMeta.batchListProgresses, hcClient);
    }

    /**
     * 批量查询RPO和RTO
     * 批量查询RPO和RTO。
     *
     * @param BatchListRposAndRtosRequest 请求对象
     * @return CompletableFuture<BatchListRposAndRtosResponse>
     */
    public CompletableFuture<BatchListRposAndRtosResponse> batchListRposAndRtosAsync(BatchListRposAndRtosRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListRposAndRtos);
    }

    /**
     * 批量查询RPO和RTO
     * 批量查询RPO和RTO。
     *
     * @param BatchListRposAndRtosRequest 请求对象
     * @return AsyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse>
     */
    public AsyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> batchListRposAndRtosAsyncInvoker(BatchListRposAndRtosRequest request) {
        return new AsyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse>(request, DrsMeta.batchListRposAndRtos, hcClient);
    }

    /**
     * 批量查询灾备初始化对象详情
     * 根据任务ID批量查询灾备初始化对象详情。
     *
     * @param BatchListStructDetailRequest 请求对象
     * @return CompletableFuture<BatchListStructDetailResponse>
     */
    public CompletableFuture<BatchListStructDetailResponse> batchListStructDetailAsync(BatchListStructDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListStructDetail);
    }

    /**
     * 批量查询灾备初始化对象详情
     * 根据任务ID批量查询灾备初始化对象详情。
     *
     * @param BatchListStructDetailRequest 请求对象
     * @return AsyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse>
     */
    public AsyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse> batchListStructDetailAsyncInvoker(BatchListStructDetailRequest request) {
        return new AsyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse>(request, DrsMeta.batchListStructDetail, hcClient);
    }

    /**
     * 批量查询灾备初始化进度
     * 根据任务ID批量查询灾备初始化进度，虚拟id不支持查询。
     *
     * @param BatchListStructProcessRequest 请求对象
     * @return CompletableFuture<BatchListStructProcessResponse>
     */
    public CompletableFuture<BatchListStructProcessResponse> batchListStructProcessAsync(BatchListStructProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchListStructProcess);
    }

    /**
     * 批量查询灾备初始化进度
     * 根据任务ID批量查询灾备初始化进度，虚拟id不支持查询。
     *
     * @param BatchListStructProcessRequest 请求对象
     * @return AsyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse>
     */
    public AsyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse> batchListStructProcessAsyncInvoker(BatchListStructProcessRequest request) {
        return new AsyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse>(request, DrsMeta.batchListStructProcess, hcClient);
    }

    /**
     * 批量修改源库/目标库密码
     * 任务启动之后需要修改源库/目标库密码时调用此接口。
     *
     * @param BatchResetPasswordRequest 请求对象
     * @return CompletableFuture<BatchResetPasswordResponse>
     */
    public CompletableFuture<BatchResetPasswordResponse> batchResetPasswordAsync(BatchResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchResetPassword);
    }

    /**
     * 批量修改源库/目标库密码
     * 任务启动之后需要修改源库/目标库密码时调用此接口。
     *
     * @param BatchResetPasswordRequest 请求对象
     * @return AsyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse>
     */
    public AsyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse> batchResetPasswordAsyncInvoker(BatchResetPasswordRequest request) {
        return new AsyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse>(request, DrsMeta.batchResetPassword, hcClient);
    }

    /**
     * 批量续传/重试
     * 在迁移过程中由于不确定因素导致迁移任务失败，可通过重试功能，重新提交迁移任务。批量续传/重试任务
     *
     * @param BatchRestoreTaskRequest 请求对象
     * @return CompletableFuture<BatchRestoreTaskResponse>
     */
    public CompletableFuture<BatchRestoreTaskResponse> batchRestoreTaskAsync(BatchRestoreTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchRestoreTask);
    }

    /**
     * 批量续传/重试
     * 在迁移过程中由于不确定因素导致迁移任务失败，可通过重试功能，重新提交迁移任务。批量续传/重试任务
     *
     * @param BatchRestoreTaskRequest 请求对象
     * @return AsyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse>
     */
    public AsyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse> batchRestoreTaskAsyncInvoker(BatchRestoreTaskRequest request) {
        return new AsyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse>(request, DrsMeta.batchRestoreTask, hcClient);
    }

    /**
     * 批量设置definer
     * 批量设置Definer迁移是否迁移到到该用户下。 - 选择是：迁移后，所有源数据库对象的Definer都会迁移至该用户下，其他用户需要授权后才具有数据库对象权限。 - 选择否：迁移后，将保持源数据库对象Definer定义不变，选择此选项，需要配合下一步用户权限迁移功能，将源数据库的用户全部迁移，这样才能保持源数据库的权限体系完全不变。
     *
     * @param BatchSetDefinerRequest 请求对象
     * @return CompletableFuture<BatchSetDefinerResponse>
     */
    public CompletableFuture<BatchSetDefinerResponse> batchSetDefinerAsync(BatchSetDefinerRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSetDefiner);
    }

    /**
     * 批量设置definer
     * 批量设置Definer迁移是否迁移到到该用户下。 - 选择是：迁移后，所有源数据库对象的Definer都会迁移至该用户下，其他用户需要授权后才具有数据库对象权限。 - 选择否：迁移后，将保持源数据库对象Definer定义不变，选择此选项，需要配合下一步用户权限迁移功能，将源数据库的用户全部迁移，这样才能保持源数据库的权限体系完全不变。
     *
     * @param BatchSetDefinerRequest 请求对象
     * @return AsyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse>
     */
    public AsyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse> batchSetDefinerAsyncInvoker(BatchSetDefinerRequest request) {
        return new AsyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse>(request, DrsMeta.batchSetDefiner, hcClient);
    }

    /**
     * 批量数据库对象选择
     * 迁移之前，选择需要迁移的数据库或者表。
     *
     * @param BatchSetObjectsRequest 请求对象
     * @return CompletableFuture<BatchSetObjectsResponse>
     */
    public CompletableFuture<BatchSetObjectsResponse> batchSetObjectsAsync(BatchSetObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSetObjects);
    }

    /**
     * 批量数据库对象选择
     * 迁移之前，选择需要迁移的数据库或者表。
     *
     * @param BatchSetObjectsRequest 请求对象
     * @return AsyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse>
     */
    public AsyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse> batchSetObjectsAsyncInvoker(BatchSetObjectsRequest request) {
        return new AsyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse>(request, DrsMeta.batchSetObjects, hcClient);
    }

    /**
     * 批量设置任务限速
     * 批量设置任务限速，任务创建成功后默认不限速。 - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。 - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     *
     * @param BatchSetSpeedRequest 请求对象
     * @return CompletableFuture<BatchSetSpeedResponse>
     */
    public CompletableFuture<BatchSetSpeedResponse> batchSetSpeedAsync(BatchSetSpeedRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSetSpeed);
    }

    /**
     * 批量设置任务限速
     * 批量设置任务限速，任务创建成功后默认不限速。 - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。 - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     *
     * @param BatchSetSpeedRequest 请求对象
     * @return AsyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse>
     */
    public AsyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse> batchSetSpeedAsyncInvoker(BatchSetSpeedRequest request) {
        return new AsyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse>(request, DrsMeta.batchSetSpeed, hcClient);
    }

    /**
     * 批量获取数据库参数
     * 在进行数据库迁移时，为了确保迁移成功后业务应用的使用不受影响，数据复制服务提供了参数对比功能帮助您进行源库和目标库参数一致性对比，此接口可以获取源库和目标库的数据库参数。
     *
     * @param BatchShowParamsRequest 请求对象
     * @return CompletableFuture<BatchShowParamsResponse>
     */
    public CompletableFuture<BatchShowParamsResponse> batchShowParamsAsync(BatchShowParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchShowParams);
    }

    /**
     * 批量获取数据库参数
     * 在进行数据库迁移时，为了确保迁移成功后业务应用的使用不受影响，数据复制服务提供了参数对比功能帮助您进行源库和目标库参数一致性对比，此接口可以获取源库和目标库的数据库参数。
     *
     * @param BatchShowParamsRequest 请求对象
     * @return AsyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse>
     */
    public AsyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse> batchShowParamsAsyncInvoker(BatchShowParamsRequest request) {
        return new AsyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse>(request, DrsMeta.batchShowParams, hcClient);
    }

    /**
     * 批量启动任务
     * 批量启动实时迁移、同步、灾备任务。
     *
     * @param BatchStartJobsRequest 请求对象
     * @return CompletableFuture<BatchStartJobsResponse>
     */
    public CompletableFuture<BatchStartJobsResponse> batchStartJobsAsync(BatchStartJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchStartJobs);
    }

    /**
     * 批量启动任务
     * 批量启动实时迁移、同步、灾备任务。
     *
     * @param BatchStartJobsRequest 请求对象
     * @return AsyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse>
     */
    public AsyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse> batchStartJobsAsyncInvoker(BatchStartJobsRequest request) {
        return new AsyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse>(request, DrsMeta.batchStartJobs, hcClient);
    }

    /**
     * 批量暂停任务
     * 批量暂停任务。
     *
     * @param BatchStopJobsRequest 请求对象
     * @return CompletableFuture<BatchStopJobsResponse>
     */
    public CompletableFuture<BatchStopJobsResponse> batchStopJobsAsync(BatchStopJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchStopJobs);
    }

    /**
     * 批量暂停任务
     * 批量暂停任务。
     *
     * @param BatchStopJobsRequest 请求对象
     * @return AsyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse>
     */
    public AsyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse> batchStopJobsAsyncInvoker(BatchStopJobsRequest request) {
        return new AsyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse>(request, DrsMeta.batchStopJobs, hcClient);
    }

    /**
     * 批量主备倒换
     * 批量主备倒换。
     *
     * @param BatchSwitchoverRequest 请求对象
     * @return CompletableFuture<BatchSwitchoverResponse>
     */
    public CompletableFuture<BatchSwitchoverResponse> batchSwitchoverAsync(BatchSwitchoverRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchSwitchover);
    }

    /**
     * 批量主备倒换
     * 批量主备倒换。
     *
     * @param BatchSwitchoverRequest 请求对象
     * @return AsyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse>
     */
    public AsyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse> batchSwitchoverAsyncInvoker(BatchSwitchoverRequest request) {
        return new AsyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse>(request, DrsMeta.batchSwitchover, hcClient);
    }

    /**
     * 批量修改任务
     * 批量修改任务名称或描述，设置异常通知信息。
     *
     * @param BatchUpdateJobRequest 请求对象
     * @return CompletableFuture<BatchUpdateJobResponse>
     */
    public CompletableFuture<BatchUpdateJobResponse> batchUpdateJobAsync(BatchUpdateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchUpdateJob);
    }

    /**
     * 批量修改任务
     * 批量修改任务名称或描述，设置异常通知信息。
     *
     * @param BatchUpdateJobRequest 请求对象
     * @return AsyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse>
     */
    public AsyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse> batchUpdateJobAsyncInvoker(BatchUpdateJobRequest request) {
        return new AsyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse>(request, DrsMeta.batchUpdateJob, hcClient);
    }

    /**
     * 批量更新迁移用户信息
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以批量设置需要迁移的用户和角色。
     *
     * @param BatchUpdateUserRequest 请求对象
     * @return CompletableFuture<BatchUpdateUserResponse>
     */
    public CompletableFuture<BatchUpdateUserResponse> batchUpdateUserAsync(BatchUpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchUpdateUser);
    }

    /**
     * 批量更新迁移用户信息
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以批量设置需要迁移的用户和角色。
     *
     * @param BatchUpdateUserRequest 请求对象
     * @return AsyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse>
     */
    public AsyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse> batchUpdateUserAsyncInvoker(BatchUpdateUserRequest request) {
        return new AsyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse>(request, DrsMeta.batchUpdateUser, hcClient);
    }

    /**
     * 批量测试连接-集群模式
     * 批量测试连接（集群模式）。
     *
     * @param BatchValidateClustersConnectionsRequest 请求对象
     * @return CompletableFuture<BatchValidateClustersConnectionsResponse>
     */
    public CompletableFuture<BatchValidateClustersConnectionsResponse> batchValidateClustersConnectionsAsync(BatchValidateClustersConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchValidateClustersConnections);
    }

    /**
     * 批量测试连接-集群模式
     * 批量测试连接（集群模式）。
     *
     * @param BatchValidateClustersConnectionsRequest 请求对象
     * @return AsyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse>
     */
    public AsyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> batchValidateClustersConnectionsAsyncInvoker(BatchValidateClustersConnectionsRequest request) {
        return new AsyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse>(request, DrsMeta.batchValidateClustersConnections, hcClient);
    }

    /**
     * 批量测试连接
     * 批量测试连接。
     *
     * @param BatchValidateConnectionsRequest 请求对象
     * @return CompletableFuture<BatchValidateConnectionsResponse>
     */
    public CompletableFuture<BatchValidateConnectionsResponse> batchValidateConnectionsAsync(BatchValidateConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchValidateConnections);
    }

    /**
     * 批量测试连接
     * 批量测试连接。
     *
     * @param BatchValidateConnectionsRequest 请求对象
     * @return AsyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse>
     */
    public AsyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> batchValidateConnectionsAsyncInvoker(BatchValidateConnectionsRequest request) {
        return new AsyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse>(request, DrsMeta.batchValidateConnections, hcClient);
    }

    /**
     * 查询租户任务列表
     * 查询租户任务列表，可以根据引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     *
     * @param ShowJobListRequest 请求对象
     * @return CompletableFuture<ShowJobListResponse>
     */
    public CompletableFuture<ShowJobListResponse> showJobListAsync(ShowJobListRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showJobList);
    }

    /**
     * 查询租户任务列表
     * 查询租户任务列表，可以根据引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     *
     * @param ShowJobListRequest 请求对象
     * @return AsyncInvoker<ShowJobListRequest, ShowJobListResponse>
     */
    public AsyncInvoker<ShowJobListRequest, ShowJobListResponse> showJobListAsyncInvoker(ShowJobListRequest request) {
        return new AsyncInvoker<ShowJobListRequest, ShowJobListResponse>(request, DrsMeta.showJobList, hcClient);
    }

    /**
     * 查询容灾监控数据
     * 根据任务ID查询容灾监控数据。
     *
     * @param ShowMonitoringDataRequest 请求对象
     * @return CompletableFuture<ShowMonitoringDataResponse>
     */
    public CompletableFuture<ShowMonitoringDataResponse> showMonitoringDataAsync(ShowMonitoringDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showMonitoringData);
    }

    /**
     * 查询容灾监控数据
     * 根据任务ID查询容灾监控数据。
     *
     * @param ShowMonitoringDataRequest 请求对象
     * @return AsyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse>
     */
    public AsyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse> showMonitoringDataAsyncInvoker(ShowMonitoringDataRequest request) {
        return new AsyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse>(request, DrsMeta.showMonitoringData, hcClient);
    }

    /**
     * 修改数据库参数
     * 修改数据库参数。
     *
     * @param UpdateParamsRequest 请求对象
     * @return CompletableFuture<UpdateParamsResponse>
     */
    public CompletableFuture<UpdateParamsResponse> updateParamsAsync(UpdateParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateParams);
    }

    /**
     * 修改数据库参数
     * 修改数据库参数。
     *
     * @param UpdateParamsRequest 请求对象
     * @return AsyncInvoker<UpdateParamsRequest, UpdateParamsResponse>
     */
    public AsyncInvoker<UpdateParamsRequest, UpdateParamsResponse> updateParamsAsyncInvoker(UpdateParamsRequest request) {
        return new AsyncInvoker<UpdateParamsRequest, UpdateParamsResponse>(request, DrsMeta.updateParams, hcClient);
    }

}