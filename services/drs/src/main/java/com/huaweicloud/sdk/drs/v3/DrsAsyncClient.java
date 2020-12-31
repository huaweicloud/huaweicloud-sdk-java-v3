package com.huaweicloud.sdk.drs.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

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
     * 修改数据库参数
     * 修改数据库参数。
     *
     * @param UpdateParamsRequest 请求对象
     * @return CompletableFuture<UpdateParamsResponse>
     */
    public CompletableFuture<UpdateParamsResponse> updateParamsAsync(UpdateParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateParams);
    }

}