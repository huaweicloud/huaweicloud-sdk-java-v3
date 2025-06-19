package com.huaweicloud.sdk.rocketmq.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisReportRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteDiagnosisReportResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateDiagnosisTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListDiagnosisReportsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyInstanceSslConfigRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyInstanceSslConfigResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisReportResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowDiagnosisStackResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceNodesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceNodesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageResponse;

public class RocketMQClient {

    protected HcClient hcClient;

    public RocketMQClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RocketMQClient> newBuilder() {
        ClientBuilder<RocketMQClient> clientBuilder = new ClientBuilder<>(RocketMQClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteRocketmqTagRequest 请求对象
     * @return BatchCreateOrDeleteRocketmqTagResponse
     */
    public BatchCreateOrDeleteRocketmqTagResponse batchCreateOrDeleteRocketmqTag(
        BatchCreateOrDeleteRocketmqTagRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchCreateOrDeleteRocketmqTag);
    }

    /**
     * 批量添加或删除实例标签
     *
     * 批量添加或删除实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteRocketmqTagRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> batchCreateOrDeleteRocketmqTagInvoker(
        BatchCreateOrDeleteRocketmqTagRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchCreateOrDeleteRocketmqTag, hcClient);
    }

    /**
     * 批量删除实例诊断记录
     *
     * 批量删除实例诊断记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisReportRequest 请求对象
     * @return BatchDeleteDiagnosisReportResponse
     */
    public BatchDeleteDiagnosisReportResponse batchDeleteDiagnosisReport(BatchDeleteDiagnosisReportRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchDeleteDiagnosisReport);
    }

    /**
     * 批量删除实例诊断记录
     *
     * 批量删除实例诊断记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDiagnosisReportRequest 请求对象
     * @return SyncInvoker<BatchDeleteDiagnosisReportRequest, BatchDeleteDiagnosisReportResponse>
     */
    public SyncInvoker<BatchDeleteDiagnosisReportRequest, BatchDeleteDiagnosisReportResponse> batchDeleteDiagnosisReportInvoker(
        BatchDeleteDiagnosisReportRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchDeleteDiagnosisReport, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。**实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return BatchDeleteInstancesResponse
     */
    public BatchDeleteInstancesResponse batchDeleteInstances(BatchDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchDeleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 批量删除实例。**实例删除后，实例中原有的数据将被删除，且没有备份，请谨慎操作。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>
     */
    public SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstancesInvoker(
        BatchDeleteInstancesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchDeleteInstances, hcClient);
    }

    /**
     * 批量修改消费组
     *
     * 批量修改消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateConsumerGroupRequest 请求对象
     * @return BatchUpdateConsumerGroupResponse
     */
    public BatchUpdateConsumerGroupResponse batchUpdateConsumerGroup(BatchUpdateConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.batchUpdateConsumerGroup);
    }

    /**
     * 批量修改消费组
     *
     * 批量修改消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateConsumerGroupRequest 请求对象
     * @return SyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse>
     */
    public SyncInvoker<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> batchUpdateConsumerGroupInvoker(
        BatchUpdateConsumerGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.batchUpdateConsumerGroup, hcClient);
    }

    /**
     * 创建消费组或批量删除消费组
     *
     * 创建消费组或批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConsumerGroupOrBatchDeleteConsumerGroupRequest 请求对象
     * @return CreateConsumerGroupOrBatchDeleteConsumerGroupResponse
     */
    public CreateConsumerGroupOrBatchDeleteConsumerGroupResponse createConsumerGroupOrBatchDeleteConsumerGroup(
        CreateConsumerGroupOrBatchDeleteConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createConsumerGroupOrBatchDeleteConsumerGroup);
    }

    /**
     * 创建消费组或批量删除消费组
     *
     * 创建消费组或批量删除消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConsumerGroupOrBatchDeleteConsumerGroupRequest 请求对象
     * @return SyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse>
     */
    public SyncInvoker<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> createConsumerGroupOrBatchDeleteConsumerGroupInvoker(
        CreateConsumerGroupOrBatchDeleteConsumerGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createConsumerGroupOrBatchDeleteConsumerGroup, hcClient);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return CreateDiagnosisTaskResponse
     */
    public CreateDiagnosisTaskResponse createDiagnosisTask(CreateDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createDiagnosisTask);
    }

    /**
     * 创建实例诊断任务
     *
     * 创建实例诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>
     */
    public SyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTaskInvoker(
        CreateDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createDiagnosisTask, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceByEngineRequest 请求对象
     * @return CreateInstanceByEngineResponse
     */
    public CreateInstanceByEngineResponse createInstanceByEngine(CreateInstanceByEngineRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createInstanceByEngine);
    }

    /**
     * 创建实例
     *
     * 创建实例[，该接口支持创建按需和包周期两种计费方式的实例](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceByEngineRequest 请求对象
     * @return SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse>
     */
    public SyncInvoker<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngineInvoker(
        CreateInstanceByEngineRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createInstanceByEngine, hcClient);
    }

    /**
     * 创建实例（按需）
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return CreatePostPaidInstanceResponse
     */
    public CreatePostPaidInstanceResponse createPostPaidInstance(CreatePostPaidInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createPostPaidInstance);
    }

    /**
     * 创建实例（按需）
     *
     * 创建实例，该接口创建的实例为按需计费的方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidInstanceRequest 请求对象
     * @return SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse>
     */
    public SyncInvoker<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstanceInvoker(
        CreatePostPaidInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createPostPaidInstance, hcClient);
    }

    /**
     * 新建元数据迁移任务
     *
     * 新建元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRocketMqMigrationTaskRequest 请求对象
     * @return CreateRocketMqMigrationTaskResponse
     */
    public CreateRocketMqMigrationTaskResponse createRocketMqMigrationTask(CreateRocketMqMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createRocketMqMigrationTask);
    }

    /**
     * 新建元数据迁移任务
     *
     * 新建元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRocketMqMigrationTaskRequest 请求对象
     * @return SyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse>
     */
    public SyncInvoker<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> createRocketMqMigrationTaskInvoker(
        CreateRocketMqMigrationTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createRocketMqMigrationTask, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createUser, hcClient);
    }

    /**
     * 删除后台任务管理中的指定记录
     *
     * 删除后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return DeleteBackgroundTaskResponse
     */
    public DeleteBackgroundTaskResponse deleteBackgroundTask(DeleteBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteBackgroundTask);
    }

    /**
     * 删除后台任务管理中的指定记录
     *
     * 删除后台任务管理中的指定记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>
     */
    public SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskInvoker(
        DeleteBackgroundTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupRequest 请求对象
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteConsumerGroup);
    }

    /**
     * 删除指定消费组
     *
     * 删除指定消费组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConsumerGroupRequest 请求对象
     * @return SyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse>
     */
    public SyncInvoker<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroupInvoker(
        DeleteConsumerGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteConsumerGroup, hcClient);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteInstance);
    }

    /**
     * 删除指定的实例
     *
     * 删除指定的实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteInstance, hcClient);
    }

    /**
     * 删除元数据迁移任务
     *
     * 删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRocketMqMigrationTaskRequest 请求对象
     * @return DeleteRocketMqMigrationTaskResponse
     */
    public DeleteRocketMqMigrationTaskResponse deleteRocketMqMigrationTask(DeleteRocketMqMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteRocketMqMigrationTask);
    }

    /**
     * 删除元数据迁移任务
     *
     * 删除元数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRocketMqMigrationTaskRequest 请求对象
     * @return SyncInvoker<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse>
     */
    public SyncInvoker<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse> deleteRocketMqMigrationTaskInvoker(
        DeleteRocketMqMigrationTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteRocketMqMigrationTask, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteUser, hcClient);
    }

    /**
     * 开启RocketMQ实例域名访问能力
     *
     * 开启RocketMQ实例域名访问能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return EnableDnsResponse
     */
    public EnableDnsResponse enableDns(EnableDnsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.enableDns);
    }

    /**
     * 开启RocketMQ实例域名访问能力
     *
     * 开启RocketMQ实例域名访问能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnsRequest 请求对象
     * @return SyncInvoker<EnableDnsRequest, EnableDnsResponse>
     */
    public SyncInvoker<EnableDnsRequest, EnableDnsResponse> enableDnsInvoker(EnableDnsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.enableDns, hcClient);
    }

    /**
     * 导出死信消息
     *
     * 导出死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDlqMessageRequest 请求对象
     * @return ExportDlqMessageResponse
     */
    public ExportDlqMessageResponse exportDlqMessage(ExportDlqMessageRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.exportDlqMessage);
    }

    /**
     * 导出死信消息
     *
     * 导出死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDlqMessageRequest 请求对象
     * @return SyncInvoker<ExportDlqMessageRequest, ExportDlqMessageResponse>
     */
    public SyncInvoker<ExportDlqMessageRequest, ExportDlqMessageResponse> exportDlqMessageInvoker(
        ExportDlqMessageRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.exportDlqMessage, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesInvoker(
        ListAvailableZonesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询实例的后台任务列表
     *
     * 查询实例的后台任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTasksRequest 请求对象
     * @return ListBackgroundTasksResponse
     */
    public ListBackgroundTasksResponse listBackgroundTasks(ListBackgroundTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listBackgroundTasks);
    }

    /**
     * 查询实例的后台任务列表
     *
     * 查询实例的后台任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTasksRequest 请求对象
     * @return SyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse>
     */
    public SyncInvoker<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasksInvoker(
        ListBackgroundTasksRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listBackgroundTasks, hcClient);
    }

    /**
     * 查询代理列表
     *
     * 查询代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBrokersRequest 请求对象
     * @return ListBrokersResponse
     */
    public ListBrokersResponse listBrokers(ListBrokersRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listBrokers);
    }

    /**
     * 查询代理列表
     *
     * 查询代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBrokersRequest 请求对象
     * @return SyncInvoker<ListBrokersRequest, ListBrokersResponse>
     */
    public SyncInvoker<ListBrokersRequest, ListBrokersResponse> listBrokersInvoker(ListBrokersRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listBrokers, hcClient);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyRequest 请求对象
     * @return ListConsumeGroupAccessPolicyResponse
     */
    public ListConsumeGroupAccessPolicyResponse listConsumeGroupAccessPolicy(
        ListConsumeGroupAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listConsumeGroupAccessPolicy);
    }

    /**
     * 查询消费组的授权用户列表
     *
     * 查询消费组的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumeGroupAccessPolicyRequest 请求对象
     * @return SyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse>
     */
    public SyncInvoker<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> listConsumeGroupAccessPolicyInvoker(
        ListConsumeGroupAccessPolicyRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listConsumeGroupAccessPolicy, hcClient);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsRequest 请求对象
     * @return ListDiagnosisReportsResponse
     */
    public ListDiagnosisReportsResponse listDiagnosisReports(ListDiagnosisReportsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listDiagnosisReports);
    }

    /**
     * 查询实例诊断报告列表
     *
     * 查询实例诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisReportsRequest 请求对象
     * @return SyncInvoker<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse>
     */
    public SyncInvoker<ListDiagnosisReportsRequest, ListDiagnosisReportsResponse> listDiagnosisReportsInvoker(
        ListDiagnosisReportsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listDiagnosisReports, hcClient);
    }

    /**
     * 查询产品规格列表
     *
     * 查询相应引擎的产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return ListEngineProductsResponse
     */
    public ListEngineProductsResponse listEngineProducts(ListEngineProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listEngineProducts);
    }

    /**
     * 查询产品规格列表
     *
     * 查询相应引擎的产品规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineProductsRequest 请求对象
     * @return SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse>
     */
    public SyncInvoker<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProductsInvoker(
        ListEngineProductsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listEngineProducts, hcClient);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return ListInstanceConsumerGroupsResponse
     */
    public ListInstanceConsumerGroupsResponse listInstanceConsumerGroups(ListInstanceConsumerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listInstanceConsumerGroups);
    }

    /**
     * 查询消费组列表
     *
     * 查询消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConsumerGroupsRequest 请求对象
     * @return SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse>
     */
    public SyncInvoker<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroupsInvoker(
        ListInstanceConsumerGroupsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listInstanceConsumerGroups, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listInstances);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listInstances, hcClient);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceRequest 请求对象
     * @return ListMessageTraceResponse
     */
    public ListMessageTraceResponse listMessageTrace(ListMessageTraceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listMessageTrace);
    }

    /**
     * 查询消息轨迹
     *
     * 查询消息轨迹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTraceRequest 请求对象
     * @return SyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse>
     */
    public SyncInvoker<ListMessageTraceRequest, ListMessageTraceResponse> listMessageTraceInvoker(
        ListMessageTraceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listMessageTrace, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessages(ListMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listMessages);
    }

    /**
     * 查询消息
     *
     * 查询消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return SyncInvoker<ListMessagesRequest, ListMessagesResponse>
     */
    public SyncInvoker<ListMessagesRequest, ListMessagesResponse> listMessagesInvoker(ListMessagesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listMessages, hcClient);
    }

    /**
     * 查询实例下所有迁移任务或查询指定迁移任务信息
     *
     * 1. 查询实例下所有迁移任务
     * 2. 查询指定迁移任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketMqMigrationTaskRequest 请求对象
     * @return ListRocketMqMigrationTaskResponse
     */
    public ListRocketMqMigrationTaskResponse listRocketMqMigrationTask(ListRocketMqMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listRocketMqMigrationTask);
    }

    /**
     * 查询实例下所有迁移任务或查询指定迁移任务信息
     *
     * 1. 查询实例下所有迁移任务
     * 2. 查询指定迁移任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketMqMigrationTaskRequest 请求对象
     * @return SyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse>
     */
    public SyncInvoker<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> listRocketMqMigrationTaskInvoker(
        ListRocketMqMigrationTaskRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listRocketMqMigrationTask, hcClient);
    }

    /**
     * 查询主题的授权用户列表
     *
     * 查询主题的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAccessPolicyRequest 请求对象
     * @return ListTopicAccessPolicyResponse
     */
    public ListTopicAccessPolicyResponse listTopicAccessPolicy(ListTopicAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listTopicAccessPolicy);
    }

    /**
     * 查询主题的授权用户列表
     *
     * 查询主题的授权用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAccessPolicyRequest 请求对象
     * @return SyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse>
     */
    public SyncInvoker<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> listTopicAccessPolicyInvoker(
        ListTopicAccessPolicyRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listTopicAccessPolicy, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return ListUserResponse
     */
    public ListUserResponse listUser(ListUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listUser);
    }

    /**
     * 查询用户列表
     *
     * 查询用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserRequest 请求对象
     * @return SyncInvoker<ListUserRequest, ListUserResponse>
     */
    public SyncInvoker<ListUserRequest, ListUserResponse> listUserInvoker(ListUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listUser, hcClient);
    }

    /**
     * 修改实例ssl相关配置
     *
     * 修改实例ssl相关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceSslConfigRequest 请求对象
     * @return ModifyInstanceSslConfigResponse
     */
    public ModifyInstanceSslConfigResponse modifyInstanceSslConfig(ModifyInstanceSslConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.modifyInstanceSslConfig);
    }

    /**
     * 修改实例ssl相关配置
     *
     * 修改实例ssl相关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceSslConfigRequest 请求对象
     * @return SyncInvoker<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse>
     */
    public SyncInvoker<ModifyInstanceSslConfigRequest, ModifyInstanceSslConfigResponse> modifyInstanceSslConfigInvoker(
        ModifyInstanceSslConfigRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.modifyInstanceSslConfig, hcClient);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetRequest 请求对象
     * @return ResetConsumeOffsetResponse
     */
    public ResetConsumeOffsetResponse resetConsumeOffset(ResetConsumeOffsetRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.resetConsumeOffset);
    }

    /**
     * 重置消费进度
     *
     * 重置消费进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConsumeOffsetRequest 请求对象
     * @return SyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse>
     */
    public SyncInvoker<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> resetConsumeOffsetInvoker(
        ResetConsumeOffsetRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.resetConsumeOffset, hcClient);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.resizeInstance);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * [**当前通过调用API，只支持按需实例进行实例规格变更。**](tag:hws,hws_hk,ctc)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.resizeInstance, hcClient);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageRequest 请求对象
     * @return SendDlqMessageResponse
     */
    public SendDlqMessageResponse sendDlqMessage(SendDlqMessageRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.sendDlqMessage);
    }

    /**
     * 重发死信消息
     *
     * 重发死信消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDlqMessageRequest 请求对象
     * @return SyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse>
     */
    public SyncInvoker<SendDlqMessageRequest, SendDlqMessageResponse> sendDlqMessageInvoker(
        SendDlqMessageRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.sendDlqMessage, hcClient);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageRequest 请求对象
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessage(SendMessageRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.sendMessage);
    }

    /**
     * 发送消息
     *
     * 发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendMessageRequest 请求对象
     * @return SyncInvoker<SendMessageRequest, SendMessageResponse>
     */
    public SyncInvoker<SendMessageRequest, SendMessageResponse> sendMessageInvoker(SendMessageRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.sendMessage, hcClient);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsRequest 请求对象
     * @return ShowConsumerConnectionsResponse
     */
    public ShowConsumerConnectionsResponse showConsumerConnections(ShowConsumerConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showConsumerConnections);
    }

    /**
     * 查询消费者列表
     *
     * 查询消费组内消费者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerConnectionsRequest 请求对象
     * @return SyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse>
     */
    public SyncInvoker<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> showConsumerConnectionsInvoker(
        ShowConsumerConnectionsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showConsumerConnections, hcClient);
    }

    /**
     * 查询消费列表或详情
     *
     * 查询消费列表或详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerListOrDetailsRequest 请求对象
     * @return ShowConsumerListOrDetailsResponse
     */
    public ShowConsumerListOrDetailsResponse showConsumerListOrDetails(ShowConsumerListOrDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showConsumerListOrDetails);
    }

    /**
     * 查询消费列表或详情
     *
     * 查询消费列表或详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsumerListOrDetailsRequest 请求对象
     * @return SyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse>
     */
    public SyncInvoker<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> showConsumerListOrDetailsInvoker(
        ShowConsumerListOrDetailsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showConsumerListOrDetails, hcClient);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportRequest 请求对象
     * @return ShowDiagnosisReportResponse
     */
    public ShowDiagnosisReportResponse showDiagnosisReport(ShowDiagnosisReportRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showDiagnosisReport);
    }

    /**
     * 查询实例诊断报告
     *
     * 查询实例诊断报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisReportRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse>
     */
    public SyncInvoker<ShowDiagnosisReportRequest, ShowDiagnosisReportResponse> showDiagnosisReportInvoker(
        ShowDiagnosisReportRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showDiagnosisReport, hcClient);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackRequest 请求对象
     * @return ShowDiagnosisStackResponse
     */
    public ShowDiagnosisStackResponse showDiagnosisStack(ShowDiagnosisStackRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showDiagnosisStack);
    }

    /**
     * 查询stack信息
     *
     * 查询stack信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisStackRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse>
     */
    public SyncInvoker<ShowDiagnosisStackRequest, ShowDiagnosisStackResponse> showDiagnosisStackInvoker(
        ShowDiagnosisStackRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showDiagnosisStack, hcClient);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return ShowEngineInstanceExtendProductInfoResponse
     */
    public ShowEngineInstanceExtendProductInfoResponse showEngineInstanceExtendProductInfo(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showEngineInstanceExtendProductInfo);
    }

    /**
     * 查询实例的扩容规格列表
     *
     * 查询实例的扩容规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineInstanceExtendProductInfoRequest 请求对象
     * @return SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse>
     */
    public SyncInvoker<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfoInvoker(
        ShowEngineInstanceExtendProductInfoRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showEngineInstanceExtendProductInfo, hcClient);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return ShowGroupResponse
     */
    public ShowGroupResponse showGroup(ShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showGroup);
    }

    /**
     * 查询指定消费组
     *
     * 查询指定消费组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return SyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public SyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupInvoker(ShowGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showGroup, hcClient);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showInstance);
    }

    /**
     * 查询指定实例
     *
     * 查询指定实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showInstance, hcClient);
    }

    /**
     * 查询实例节点
     *
     * 查询实例节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesRequest 请求对象
     * @return ShowInstanceNodesResponse
     */
    public ShowInstanceNodesResponse showInstanceNodes(ShowInstanceNodesRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showInstanceNodes);
    }

    /**
     * 查询实例节点
     *
     * 查询实例节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesRequest 请求对象
     * @return SyncInvoker<ShowInstanceNodesRequest, ShowInstanceNodesResponse>
     */
    public SyncInvoker<ShowInstanceNodesRequest, ShowInstanceNodesResponse> showInstanceNodesInvoker(
        ShowInstanceNodesRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showInstanceNodes, hcClient);
    }

    /**
     * 查看租户配额
     *
     * 查询租户最大可以创建的实例个数和已创建的实例个数，以及每个实例最大可以创建标签的个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showQuotas);
    }

    /**
     * 查看租户配额
     *
     * 查询租户最大可以创建的实例个数和已创建的实例个数，以及每个实例最大可以创建标签的个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showQuotas, hcClient);
    }

    /**
     * 查询RocketMQ配置
     *
     * 该接口用于查询RocketMQ配置，若成功则返回配置的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqConfigsRequest 请求对象
     * @return ShowRocketMqConfigsResponse
     */
    public ShowRocketMqConfigsResponse showRocketMqConfigs(ShowRocketMqConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRocketMqConfigs);
    }

    /**
     * 查询RocketMQ配置
     *
     * 该接口用于查询RocketMQ配置，若成功则返回配置的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketMqConfigsRequest 请求对象
     * @return SyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse>
     */
    public SyncInvoker<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> showRocketMqConfigsInvoker(
        ShowRocketMqConfigsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRocketMqConfigs, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqProjectTagsRequest 请求对象
     * @return ShowRocketmqProjectTagsResponse
     */
    public ShowRocketmqProjectTagsResponse showRocketmqProjectTags(ShowRocketmqProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRocketmqProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqProjectTagsRequest 请求对象
     * @return SyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse>
     */
    public SyncInvoker<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> showRocketmqProjectTagsInvoker(
        ShowRocketmqProjectTagsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRocketmqProjectTags, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqTagsRequest 请求对象
     * @return ShowRocketmqTagsResponse
     */
    public ShowRocketmqTagsResponse showRocketmqTags(ShowRocketmqTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showRocketmqTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRocketmqTagsRequest 请求对象
     * @return SyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse>
     */
    public SyncInvoker<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> showRocketmqTagsInvoker(
        ShowRocketmqTagsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showRocketmqTags, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 查询用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return ShowUserResponse
     */
    public ShowUserResponse showUser(ShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showUser);
    }

    /**
     * 查询用户详情
     *
     * 查询用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return SyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public SyncInvoker<ShowUserRequest, ShowUserResponse> showUserInvoker(ShowUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showUser, hcClient);
    }

    /**
     * 修改消费组
     *
     * 修改指定消费组参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConsumerGroupRequest 请求对象
     * @return UpdateConsumerGroupResponse
     */
    public UpdateConsumerGroupResponse updateConsumerGroup(UpdateConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateConsumerGroup);
    }

    /**
     * 修改消费组
     *
     * 修改指定消费组参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConsumerGroupRequest 请求对象
     * @return SyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse>
     */
    public SyncInvoker<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> updateConsumerGroupInvoker(
        UpdateConsumerGroupRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateConsumerGroup, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改实例的名称和描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateInstance, hcClient);
    }

    /**
     * 修改RocketMQ配置
     *
     * 该接口用于修改RocketMQ配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRocketMqConfigsRequest 请求对象
     * @return UpdateRocketMqConfigsResponse
     */
    public UpdateRocketMqConfigsResponse updateRocketMqConfigs(UpdateRocketMqConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateRocketMqConfigs);
    }

    /**
     * 修改RocketMQ配置
     *
     * 该接口用于修改RocketMQ配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRocketMqConfigsRequest 请求对象
     * @return SyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse>
     */
    public SyncInvoker<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> updateRocketMqConfigsInvoker(
        UpdateRocketMqConfigsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateRocketMqConfigs, hcClient);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateUser);
    }

    /**
     * 修改用户参数
     *
     * 修改用户参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateUser, hcClient);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageRequest 请求对象
     * @return ValidateConsumedMessageResponse
     */
    public ValidateConsumedMessageResponse validateConsumedMessage(ValidateConsumedMessageRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.validateConsumedMessage);
    }

    /**
     * 消费验证
     *
     * 消费验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConsumedMessageRequest 请求对象
     * @return SyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse>
     */
    public SyncInvoker<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> validateConsumedMessageInvoker(
        ValidateConsumedMessageRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.validateConsumedMessage, hcClient);
    }

    /**
     * 创建主题或批量删除主题
     *
     * 创建主题或批量删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTopicOrBatchDeleteTopicRequest 请求对象
     * @return CreateTopicOrBatchDeleteTopicResponse
     */
    public CreateTopicOrBatchDeleteTopicResponse createTopicOrBatchDeleteTopic(
        CreateTopicOrBatchDeleteTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.createTopicOrBatchDeleteTopic);
    }

    /**
     * 创建主题或批量删除主题
     *
     * 创建主题或批量删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTopicOrBatchDeleteTopicRequest 请求对象
     * @return SyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse>
     */
    public SyncInvoker<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> createTopicOrBatchDeleteTopicInvoker(
        CreateTopicOrBatchDeleteTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.createTopicOrBatchDeleteTopic, hcClient);
    }

    /**
     * 删除指定主题
     *
     * 删除指定主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.deleteTopic);
    }

    /**
     * 删除指定主题
     *
     * 删除指定主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return SyncInvoker<DeleteTopicRequest, DeleteTopicResponse>
     */
    public SyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicInvoker(DeleteTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.deleteTopic, hcClient);
    }

    /**
     * 查询主题消费组列表
     *
     * 查询主题消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumerGroupOfTopicRequest 请求对象
     * @return ListConsumerGroupOfTopicResponse
     */
    public ListConsumerGroupOfTopicResponse listConsumerGroupOfTopic(ListConsumerGroupOfTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listConsumerGroupOfTopic);
    }

    /**
     * 查询主题消费组列表
     *
     * 查询主题消费组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConsumerGroupOfTopicRequest 请求对象
     * @return SyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse>
     */
    public SyncInvoker<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> listConsumerGroupOfTopicInvoker(
        ListConsumerGroupOfTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listConsumerGroupOfTopic, hcClient);
    }

    /**
     * 查询主题列表
     *
     * 该接口用于查询指定RocketMQ实例的Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketInstanceTopicsRequest 请求对象
     * @return ListRocketInstanceTopicsResponse
     */
    public ListRocketInstanceTopicsResponse listRocketInstanceTopics(ListRocketInstanceTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.listRocketInstanceTopics);
    }

    /**
     * 查询主题列表
     *
     * 该接口用于查询指定RocketMQ实例的Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRocketInstanceTopicsRequest 请求对象
     * @return SyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse>
     */
    public SyncInvoker<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> listRocketInstanceTopicsInvoker(
        ListRocketInstanceTopicsRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.listRocketInstanceTopics, hcClient);
    }

    /**
     * 查询单个主题
     *
     * 查询单个主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOneTopicRequest 请求对象
     * @return ShowOneTopicResponse
     */
    public ShowOneTopicResponse showOneTopic(ShowOneTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showOneTopic);
    }

    /**
     * 查询单个主题
     *
     * 查询单个主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOneTopicRequest 请求对象
     * @return SyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse>
     */
    public SyncInvoker<ShowOneTopicRequest, ShowOneTopicResponse> showOneTopicInvoker(ShowOneTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showOneTopic, hcClient);
    }

    /**
     * 查询主题的消息数
     *
     * 查询主题的消息数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicStatusRequest 请求对象
     * @return ShowTopicStatusResponse
     */
    public ShowTopicStatusResponse showTopicStatus(ShowTopicStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.showTopicStatus);
    }

    /**
     * 查询主题的消息数
     *
     * 查询主题的消息数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopicStatusRequest 请求对象
     * @return SyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse>
     */
    public SyncInvoker<ShowTopicStatusRequest, ShowTopicStatusResponse> showTopicStatusInvoker(
        ShowTopicStatusRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.showTopicStatus, hcClient);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return UpdateTopicResponse
     */
    public UpdateTopicResponse updateTopic(UpdateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RocketMQMeta.updateTopic);
    }

    /**
     * 修改主题
     *
     * 修改主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return SyncInvoker<UpdateTopicRequest, UpdateTopicResponse>
     */
    public SyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicInvoker(UpdateTopicRequest request) {
        return new SyncInvoker<>(request, RocketMQMeta.updateTopic, hcClient);
    }

}
