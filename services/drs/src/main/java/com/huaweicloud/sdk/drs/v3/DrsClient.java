package com.huaweicloud.sdk.drs.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.drs.v3.model.*;

public class DrsClient {
    protected HcClient hcClient;

    public DrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsClient> newBuilder() {
        return new ClientBuilder<>(DrsClient::new);
    }


    /**
     * 批量数据加工
     * 数据复制服务支持对同步的对象进行加工，即可以为选择的对象添加规则。
     *
     * @param BatchChangeDataRequest 请求对象
     * @return BatchChangeDataResponse
     */
    public BatchChangeDataResponse batchChangeData(BatchChangeDataRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchChangeData);
    }

    /**
     * 批量数据加工
     * 数据复制服务支持对同步的对象进行加工，即可以为选择的对象添加规则。
     *
     * @param BatchChangeDataRequest 请求对象
     * @return SyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse>
     */
    public SyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse> batchChangeDataInvoker(BatchChangeDataRequest request) {
        return new SyncInvoker<BatchChangeDataRequest, BatchChangeDataResponse>(request, DrsMeta.batchChangeData, hcClient);
    }

    /**
     * 批量预检查
     * 批量预检查，校验是否可进行迁移。
     *
     * @param BatchCheckJobsRequest 请求对象
     * @return BatchCheckJobsResponse
     */
    public BatchCheckJobsResponse batchCheckJobs(BatchCheckJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchCheckJobs);
    }

    /**
     * 批量预检查
     * 批量预检查，校验是否可进行迁移。
     *
     * @param BatchCheckJobsRequest 请求对象
     * @return SyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse>
     */
    public SyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse> batchCheckJobsInvoker(BatchCheckJobsRequest request) {
        return new SyncInvoker<BatchCheckJobsRequest, BatchCheckJobsResponse>(request, DrsMeta.batchCheckJobs, hcClient);
    }

    /**
     * 批量查询预检查结果
     * 批量查询任务的预检查结果。
     *
     * @param BatchCheckResultsRequest 请求对象
     * @return BatchCheckResultsResponse
     */
    public BatchCheckResultsResponse batchCheckResults(BatchCheckResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchCheckResults);
    }

    /**
     * 批量查询预检查结果
     * 批量查询任务的预检查结果。
     *
     * @param BatchCheckResultsRequest 请求对象
     * @return SyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse>
     */
    public SyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse> batchCheckResultsInvoker(BatchCheckResultsRequest request) {
        return new SyncInvoker<BatchCheckResultsRequest, BatchCheckResultsResponse>(request, DrsMeta.batchCheckResults, hcClient);
    }

    /**
     * 批量创建任务
     * 根据请求参数不同，可以批量创建实时迁移、实时同步、实时灾备任务。
     *
     * @param BatchCreateJobsRequest 请求对象
     * @return BatchCreateJobsResponse
     */
    public BatchCreateJobsResponse batchCreateJobs(BatchCreateJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchCreateJobs);
    }

    /**
     * 批量创建任务
     * 根据请求参数不同，可以批量创建实时迁移、实时同步、实时灾备任务。
     *
     * @param BatchCreateJobsRequest 请求对象
     * @return SyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse>
     */
    public SyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse> batchCreateJobsInvoker(BatchCreateJobsRequest request) {
        return new SyncInvoker<BatchCreateJobsRequest, BatchCreateJobsResponse>(request, DrsMeta.batchCreateJobs, hcClient);
    }

    /**
     * 批量结束任务或删除任务
     * 批量结束任务或删除实时迁移、实时同步、实时灾备任务。
     *
     * @param BatchDeleteJobsRequest 请求对象
     * @return BatchDeleteJobsResponse
     */
    public BatchDeleteJobsResponse batchDeleteJobs(BatchDeleteJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchDeleteJobs);
    }

    /**
     * 批量结束任务或删除任务
     * 批量结束任务或删除实时迁移、实时同步、实时灾备任务。
     *
     * @param BatchDeleteJobsRequest 请求对象
     * @return SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>
     */
    public SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsInvoker(BatchDeleteJobsRequest request) {
        return new SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>(request, DrsMeta.batchDeleteJobs, hcClient);
    }

    /**
     * 批量查询任务详情
     * 根据任务ID批量查询任务详情。
     *
     * @param BatchListJobDetailsRequest 请求对象
     * @return BatchListJobDetailsResponse
     */
    public BatchListJobDetailsResponse batchListJobDetails(BatchListJobDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListJobDetails);
    }

    /**
     * 批量查询任务详情
     * 根据任务ID批量查询任务详情。
     *
     * @param BatchListJobDetailsRequest 请求对象
     * @return SyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse>
     */
    public SyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse> batchListJobDetailsInvoker(BatchListJobDetailsRequest request) {
        return new SyncInvoker<BatchListJobDetailsRequest, BatchListJobDetailsResponse>(request, DrsMeta.batchListJobDetails, hcClient);
    }

    /**
     * 批量查询任务状态
     * 根据任务ID批量查询任务状态。
     *
     * @param BatchListJobStatusRequest 请求对象
     * @return BatchListJobStatusResponse
     */
    public BatchListJobStatusResponse batchListJobStatus(BatchListJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListJobStatus);
    }

    /**
     * 批量查询任务状态
     * 根据任务ID批量查询任务状态。
     *
     * @param BatchListJobStatusRequest 请求对象
     * @return SyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse>
     */
    public SyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse> batchListJobStatusInvoker(BatchListJobStatusRequest request) {
        return new SyncInvoker<BatchListJobStatusRequest, BatchListJobStatusResponse>(request, DrsMeta.batchListJobStatus, hcClient);
    }

    /**
     * 批量查询任务进度
     * 根据任务ID批量查询全量进度、增量时延信息。
     *
     * @param BatchListProgressesRequest 请求对象
     * @return BatchListProgressesResponse
     */
    public BatchListProgressesResponse batchListProgresses(BatchListProgressesRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListProgresses);
    }

    /**
     * 批量查询任务进度
     * 根据任务ID批量查询全量进度、增量时延信息。
     *
     * @param BatchListProgressesRequest 请求对象
     * @return SyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse>
     */
    public SyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse> batchListProgressesInvoker(BatchListProgressesRequest request) {
        return new SyncInvoker<BatchListProgressesRequest, BatchListProgressesResponse>(request, DrsMeta.batchListProgresses, hcClient);
    }

    /**
     * 批量查询RPO和RTO
     * 批量查询RPO和RTO。
     *
     * @param BatchListRposAndRtosRequest 请求对象
     * @return BatchListRposAndRtosResponse
     */
    public BatchListRposAndRtosResponse batchListRposAndRtos(BatchListRposAndRtosRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListRposAndRtos);
    }

    /**
     * 批量查询RPO和RTO
     * 批量查询RPO和RTO。
     *
     * @param BatchListRposAndRtosRequest 请求对象
     * @return SyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse>
     */
    public SyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> batchListRposAndRtosInvoker(BatchListRposAndRtosRequest request) {
        return new SyncInvoker<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse>(request, DrsMeta.batchListRposAndRtos, hcClient);
    }

    /**
     * 批量查询灾备初始化对象详情
     * 根据任务ID批量查询灾备初始化对象详情。
     *
     * @param BatchListStructDetailRequest 请求对象
     * @return BatchListStructDetailResponse
     */
    public BatchListStructDetailResponse batchListStructDetail(BatchListStructDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListStructDetail);
    }

    /**
     * 批量查询灾备初始化对象详情
     * 根据任务ID批量查询灾备初始化对象详情。
     *
     * @param BatchListStructDetailRequest 请求对象
     * @return SyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse>
     */
    public SyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse> batchListStructDetailInvoker(BatchListStructDetailRequest request) {
        return new SyncInvoker<BatchListStructDetailRequest, BatchListStructDetailResponse>(request, DrsMeta.batchListStructDetail, hcClient);
    }

    /**
     * 批量查询灾备初始化进度
     * 根据任务ID批量查询灾备初始化进度，虚拟id不支持查询。
     *
     * @param BatchListStructProcessRequest 请求对象
     * @return BatchListStructProcessResponse
     */
    public BatchListStructProcessResponse batchListStructProcess(BatchListStructProcessRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchListStructProcess);
    }

    /**
     * 批量查询灾备初始化进度
     * 根据任务ID批量查询灾备初始化进度，虚拟id不支持查询。
     *
     * @param BatchListStructProcessRequest 请求对象
     * @return SyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse>
     */
    public SyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse> batchListStructProcessInvoker(BatchListStructProcessRequest request) {
        return new SyncInvoker<BatchListStructProcessRequest, BatchListStructProcessResponse>(request, DrsMeta.batchListStructProcess, hcClient);
    }

    /**
     * 批量修改源库/目标库密码
     * 任务启动之后需要修改源库/目标库密码时调用此接口。
     *
     * @param BatchResetPasswordRequest 请求对象
     * @return BatchResetPasswordResponse
     */
    public BatchResetPasswordResponse batchResetPassword(BatchResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchResetPassword);
    }

    /**
     * 批量修改源库/目标库密码
     * 任务启动之后需要修改源库/目标库密码时调用此接口。
     *
     * @param BatchResetPasswordRequest 请求对象
     * @return SyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse>
     */
    public SyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse> batchResetPasswordInvoker(BatchResetPasswordRequest request) {
        return new SyncInvoker<BatchResetPasswordRequest, BatchResetPasswordResponse>(request, DrsMeta.batchResetPassword, hcClient);
    }

    /**
     * 批量续传/重试
     * 在迁移过程中由于不确定因素导致迁移任务失败，可通过重试功能，重新提交迁移任务。
     *
     * @param BatchRestoreTaskRequest 请求对象
     * @return BatchRestoreTaskResponse
     */
    public BatchRestoreTaskResponse batchRestoreTask(BatchRestoreTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchRestoreTask);
    }

    /**
     * 批量续传/重试
     * 在迁移过程中由于不确定因素导致迁移任务失败，可通过重试功能，重新提交迁移任务。
     *
     * @param BatchRestoreTaskRequest 请求对象
     * @return SyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse>
     */
    public SyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse> batchRestoreTaskInvoker(BatchRestoreTaskRequest request) {
        return new SyncInvoker<BatchRestoreTaskRequest, BatchRestoreTaskResponse>(request, DrsMeta.batchRestoreTask, hcClient);
    }

    /**
     * 批量设置definer
     * 批量设置Definer迁移是否迁移到到该用户下。 - 选择是：迁移后，所有源数据库对象的Definer都会迁移至该用户下，其他用户需要授权后才具有数据库对象权限。 - 选择否：迁移后，将保持源数据库对象Definer定义不变，选择此选项，需要配合下一步用户权限迁移功能，将源数据库的用户全部迁移，这样才能保持源数据库的权限体系完全不变。
     *
     * @param BatchSetDefinerRequest 请求对象
     * @return BatchSetDefinerResponse
     */
    public BatchSetDefinerResponse batchSetDefiner(BatchSetDefinerRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSetDefiner);
    }

    /**
     * 批量设置definer
     * 批量设置Definer迁移是否迁移到到该用户下。 - 选择是：迁移后，所有源数据库对象的Definer都会迁移至该用户下，其他用户需要授权后才具有数据库对象权限。 - 选择否：迁移后，将保持源数据库对象Definer定义不变，选择此选项，需要配合下一步用户权限迁移功能，将源数据库的用户全部迁移，这样才能保持源数据库的权限体系完全不变。
     *
     * @param BatchSetDefinerRequest 请求对象
     * @return SyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse>
     */
    public SyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse> batchSetDefinerInvoker(BatchSetDefinerRequest request) {
        return new SyncInvoker<BatchSetDefinerRequest, BatchSetDefinerResponse>(request, DrsMeta.batchSetDefiner, hcClient);
    }

    /**
     * 批量数据库对象选择
     * 迁移之前，选择需要迁移的数据库或者表。
     *
     * @param BatchSetObjectsRequest 请求对象
     * @return BatchSetObjectsResponse
     */
    public BatchSetObjectsResponse batchSetObjects(BatchSetObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSetObjects);
    }

    /**
     * 批量数据库对象选择
     * 迁移之前，选择需要迁移的数据库或者表。
     *
     * @param BatchSetObjectsRequest 请求对象
     * @return SyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse>
     */
    public SyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse> batchSetObjectsInvoker(BatchSetObjectsRequest request) {
        return new SyncInvoker<BatchSetObjectsRequest, BatchSetObjectsResponse>(request, DrsMeta.batchSetObjects, hcClient);
    }

    /**
     * 批量设置任务限速
     * 批量设置任务限速，任务创建成功后默认不限速。 - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。 - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     *
     * @param BatchSetSpeedRequest 请求对象
     * @return BatchSetSpeedResponse
     */
    public BatchSetSpeedResponse batchSetSpeed(BatchSetSpeedRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSetSpeed);
    }

    /**
     * 批量设置任务限速
     * 批量设置任务限速，任务创建成功后默认不限速。 - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。 - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     *
     * @param BatchSetSpeedRequest 请求对象
     * @return SyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse>
     */
    public SyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse> batchSetSpeedInvoker(BatchSetSpeedRequest request) {
        return new SyncInvoker<BatchSetSpeedRequest, BatchSetSpeedResponse>(request, DrsMeta.batchSetSpeed, hcClient);
    }

    /**
     * 批量获取数据库参数
     * 在进行数据库迁移时，为了确保迁移成功后业务应用的使用不受影响，数据复制服务提供了参数对比功能帮助您进行源库和目标库参数一致性对比，此接口可以获取源库和目标库的数据库参数。
     *
     * @param BatchShowParamsRequest 请求对象
     * @return BatchShowParamsResponse
     */
    public BatchShowParamsResponse batchShowParams(BatchShowParamsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchShowParams);
    }

    /**
     * 批量获取数据库参数
     * 在进行数据库迁移时，为了确保迁移成功后业务应用的使用不受影响，数据复制服务提供了参数对比功能帮助您进行源库和目标库参数一致性对比，此接口可以获取源库和目标库的数据库参数。
     *
     * @param BatchShowParamsRequest 请求对象
     * @return SyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse>
     */
    public SyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse> batchShowParamsInvoker(BatchShowParamsRequest request) {
        return new SyncInvoker<BatchShowParamsRequest, BatchShowParamsResponse>(request, DrsMeta.batchShowParams, hcClient);
    }

    /**
     * 批量启动任务
     * 批量启动实时迁移、同步、灾备任务。
     *
     * @param BatchStartJobsRequest 请求对象
     * @return BatchStartJobsResponse
     */
    public BatchStartJobsResponse batchStartJobs(BatchStartJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchStartJobs);
    }

    /**
     * 批量启动任务
     * 批量启动实时迁移、同步、灾备任务。
     *
     * @param BatchStartJobsRequest 请求对象
     * @return SyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse>
     */
    public SyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse> batchStartJobsInvoker(BatchStartJobsRequest request) {
        return new SyncInvoker<BatchStartJobsRequest, BatchStartJobsResponse>(request, DrsMeta.batchStartJobs, hcClient);
    }

    /**
     * 批量暂停任务
     * 批量暂停任务。
     *
     * @param BatchStopJobsRequest 请求对象
     * @return BatchStopJobsResponse
     */
    public BatchStopJobsResponse batchStopJobs(BatchStopJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchStopJobs);
    }

    /**
     * 批量暂停任务
     * 批量暂停任务。
     *
     * @param BatchStopJobsRequest 请求对象
     * @return SyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse>
     */
    public SyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse> batchStopJobsInvoker(BatchStopJobsRequest request) {
        return new SyncInvoker<BatchStopJobsRequest, BatchStopJobsResponse>(request, DrsMeta.batchStopJobs, hcClient);
    }

    /**
     * 批量主备倒换
     * 批量主备倒换。
     *
     * @param BatchSwitchoverRequest 请求对象
     * @return BatchSwitchoverResponse
     */
    public BatchSwitchoverResponse batchSwitchover(BatchSwitchoverRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchSwitchover);
    }

    /**
     * 批量主备倒换
     * 批量主备倒换。
     *
     * @param BatchSwitchoverRequest 请求对象
     * @return SyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse>
     */
    public SyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse> batchSwitchoverInvoker(BatchSwitchoverRequest request) {
        return new SyncInvoker<BatchSwitchoverRequest, BatchSwitchoverResponse>(request, DrsMeta.batchSwitchover, hcClient);
    }

    /**
     * 批量修改任务
     * 批量修改任务名称或描述，设置异常通知信息。
     *
     * @param BatchUpdateJobRequest 请求对象
     * @return BatchUpdateJobResponse
     */
    public BatchUpdateJobResponse batchUpdateJob(BatchUpdateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchUpdateJob);
    }

    /**
     * 批量修改任务
     * 批量修改任务名称或描述，设置异常通知信息。
     *
     * @param BatchUpdateJobRequest 请求对象
     * @return SyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse>
     */
    public SyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse> batchUpdateJobInvoker(BatchUpdateJobRequest request) {
        return new SyncInvoker<BatchUpdateJobRequest, BatchUpdateJobResponse>(request, DrsMeta.batchUpdateJob, hcClient);
    }

    /**
     * 批量更新迁移用户信息
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以批量设置需要迁移的用户和角色。
     *
     * @param BatchUpdateUserRequest 请求对象
     * @return BatchUpdateUserResponse
     */
    public BatchUpdateUserResponse batchUpdateUser(BatchUpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchUpdateUser);
    }

    /**
     * 批量更新迁移用户信息
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以批量设置需要迁移的用户和角色。
     *
     * @param BatchUpdateUserRequest 请求对象
     * @return SyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse>
     */
    public SyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse> batchUpdateUserInvoker(BatchUpdateUserRequest request) {
        return new SyncInvoker<BatchUpdateUserRequest, BatchUpdateUserResponse>(request, DrsMeta.batchUpdateUser, hcClient);
    }

    /**
     * 批量测试连接-集群模式
     * 批量测试连接（集群模式）。
     *
     * @param BatchValidateClustersConnectionsRequest 请求对象
     * @return BatchValidateClustersConnectionsResponse
     */
    public BatchValidateClustersConnectionsResponse batchValidateClustersConnections(BatchValidateClustersConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchValidateClustersConnections);
    }

    /**
     * 批量测试连接-集群模式
     * 批量测试连接（集群模式）。
     *
     * @param BatchValidateClustersConnectionsRequest 请求对象
     * @return SyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse>
     */
    public SyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> batchValidateClustersConnectionsInvoker(BatchValidateClustersConnectionsRequest request) {
        return new SyncInvoker<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse>(request, DrsMeta.batchValidateClustersConnections, hcClient);
    }

    /**
     * 批量测试连接
     * 批量测试连接。
     *
     * @param BatchValidateConnectionsRequest 请求对象
     * @return BatchValidateConnectionsResponse
     */
    public BatchValidateConnectionsResponse batchValidateConnections(BatchValidateConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchValidateConnections);
    }

    /**
     * 批量测试连接
     * 批量测试连接。
     *
     * @param BatchValidateConnectionsRequest 请求对象
     * @return SyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse>
     */
    public SyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> batchValidateConnectionsInvoker(BatchValidateConnectionsRequest request) {
        return new SyncInvoker<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse>(request, DrsMeta.batchValidateConnections, hcClient);
    }

    /**
     * 创建对比任务
     * 创建对比任务。
     *
     * @param CreateCompareTaskRequest 请求对象
     * @return CreateCompareTaskResponse
     */
    public CreateCompareTaskResponse createCompareTask(CreateCompareTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.createCompareTask);
    }

    /**
     * 创建对比任务
     * 创建对比任务。
     *
     * @param CreateCompareTaskRequest 请求对象
     * @return SyncInvoker<CreateCompareTaskRequest, CreateCompareTaskResponse>
     */
    public SyncInvoker<CreateCompareTaskRequest, CreateCompareTaskResponse> createCompareTaskInvoker(CreateCompareTaskRequest request) {
        return new SyncInvoker<CreateCompareTaskRequest, CreateCompareTaskResponse>(request, DrsMeta.createCompareTask, hcClient);
    }

    /**
     * 查询对比结果
     * 查询对比结果。
     *
     * @param ListCompareResultRequest 请求对象
     * @return ListCompareResultResponse
     */
    public ListCompareResultResponse listCompareResult(ListCompareResultRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listCompareResult);
    }

    /**
     * 查询对比结果
     * 查询对比结果。
     *
     * @param ListCompareResultRequest 请求对象
     * @return SyncInvoker<ListCompareResultRequest, ListCompareResultResponse>
     */
    public SyncInvoker<ListCompareResultRequest, ListCompareResultResponse> listCompareResultInvoker(ListCompareResultRequest request) {
        return new SyncInvoker<ListCompareResultRequest, ListCompareResultResponse>(request, DrsMeta.listCompareResult, hcClient);
    }

    /**
     * 获取源库迁移用户列表
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以查询源库的用户信息。
     *
     * @param ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listUsers);
    }

    /**
     * 获取源库迁移用户列表
     * 数据库的迁移过程中，迁移用户需要进行单独处理，该接口可以查询源库的用户信息。
     *
     * @param ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<ListUsersRequest, ListUsersResponse>(request, DrsMeta.listUsers, hcClient);
    }

    /**
     * 查询租户任务列表
     * 查询租户任务列表，可以根据引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     *
     * @param ShowJobListRequest 请求对象
     * @return ShowJobListResponse
     */
    public ShowJobListResponse showJobList(ShowJobListRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showJobList);
    }

    /**
     * 查询租户任务列表
     * 查询租户任务列表，可以根据引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     *
     * @param ShowJobListRequest 请求对象
     * @return SyncInvoker<ShowJobListRequest, ShowJobListResponse>
     */
    public SyncInvoker<ShowJobListRequest, ShowJobListResponse> showJobListInvoker(ShowJobListRequest request) {
        return new SyncInvoker<ShowJobListRequest, ShowJobListResponse>(request, DrsMeta.showJobList, hcClient);
    }

    /**
     * 查询容灾监控数据
     * 根据任务ID查询容灾监控数据。
     *
     * @param ShowMonitoringDataRequest 请求对象
     * @return ShowMonitoringDataResponse
     */
    public ShowMonitoringDataResponse showMonitoringData(ShowMonitoringDataRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showMonitoringData);
    }

    /**
     * 查询容灾监控数据
     * 根据任务ID查询容灾监控数据。
     *
     * @param ShowMonitoringDataRequest 请求对象
     * @return SyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse>
     */
    public SyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse> showMonitoringDataInvoker(ShowMonitoringDataRequest request) {
        return new SyncInvoker<ShowMonitoringDataRequest, ShowMonitoringDataResponse>(request, DrsMeta.showMonitoringData, hcClient);
    }

    /**
     * 查询配额
     * 查询单租户在DRS服务下的配额信息。
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showQuotas);
    }

    /**
     * 查询配额
     * 查询单租户在DRS服务下的配额信息。
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, DrsMeta.showQuotas, hcClient);
    }

    /**
     * 修改数据库参数
     * 修改数据库参数。
     *
     * @param UpdateParamsRequest 请求对象
     * @return UpdateParamsResponse
     */
    public UpdateParamsResponse updateParams(UpdateParamsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.updateParams);
    }

    /**
     * 修改数据库参数
     * 修改数据库参数。
     *
     * @param UpdateParamsRequest 请求对象
     * @return SyncInvoker<UpdateParamsRequest, UpdateParamsResponse>
     */
    public SyncInvoker<UpdateParamsRequest, UpdateParamsResponse> updateParamsInvoker(UpdateParamsRequest request) {
        return new SyncInvoker<UpdateParamsRequest, UpdateParamsResponse>(request, DrsMeta.updateParams, hcClient);
    }

}