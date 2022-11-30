package com.huaweicloud.sdk.sdrs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sdrs.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class SdrsAsyncClient {

    protected HcClient hcClient;

    public SdrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SdrsAsyncClient> newBuilder() {
        return new ClientBuilder<>(SdrsAsyncClient::new);
    }

    /**
     * 保护实例添加网卡
     *
     * 给指定的保护实例添加网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddProtectedInstanceNicRequest 请求对象
     * @return CompletableFuture<AddProtectedInstanceNicResponse>
     */
    public CompletableFuture<AddProtectedInstanceNicResponse> addProtectedInstanceNicAsync(
        AddProtectedInstanceNicRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.addProtectedInstanceNic);
    }

    /**
     * 保护实例添加网卡
     *
     * 给指定的保护实例添加网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddProtectedInstanceNicRequest 请求对象
     * @return AsyncInvoker<AddProtectedInstanceNicRequest, AddProtectedInstanceNicResponse>
     */
    public AsyncInvoker<AddProtectedInstanceNicRequest, AddProtectedInstanceNicResponse> addProtectedInstanceNicAsyncInvoker(
        AddProtectedInstanceNicRequest request) {
        return new AsyncInvoker<AddProtectedInstanceNicRequest, AddProtectedInstanceNicResponse>(request,
            SdrsMeta.addProtectedInstanceNic, hcClient);
    }

    /**
     * 添加保护实例标签
     *
     * 一个保护实例上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddProtectedInstanceTagsRequest 请求对象
     * @return CompletableFuture<AddProtectedInstanceTagsResponse>
     */
    public CompletableFuture<AddProtectedInstanceTagsResponse> addProtectedInstanceTagsAsync(
        AddProtectedInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.addProtectedInstanceTags);
    }

    /**
     * 添加保护实例标签
     *
     * 一个保护实例上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddProtectedInstanceTagsRequest 请求对象
     * @return AsyncInvoker<AddProtectedInstanceTagsRequest, AddProtectedInstanceTagsResponse>
     */
    public AsyncInvoker<AddProtectedInstanceTagsRequest, AddProtectedInstanceTagsResponse> addProtectedInstanceTagsAsyncInvoker(
        AddProtectedInstanceTagsRequest request) {
        return new AsyncInvoker<AddProtectedInstanceTagsRequest, AddProtectedInstanceTagsResponse>(request,
            SdrsMeta.addProtectedInstanceTags, hcClient);
    }

    /**
     * 保护实例挂载复制对
     *
     * 将指定的复制对挂载到指定的保护实例上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachProtectedInstanceReplicationRequest 请求对象
     * @return CompletableFuture<AttachProtectedInstanceReplicationResponse>
     */
    public CompletableFuture<AttachProtectedInstanceReplicationResponse> attachProtectedInstanceReplicationAsync(
        AttachProtectedInstanceReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.attachProtectedInstanceReplication);
    }

    /**
     * 保护实例挂载复制对
     *
     * 将指定的复制对挂载到指定的保护实例上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachProtectedInstanceReplicationRequest 请求对象
     * @return AsyncInvoker<AttachProtectedInstanceReplicationRequest, AttachProtectedInstanceReplicationResponse>
     */
    public AsyncInvoker<AttachProtectedInstanceReplicationRequest, AttachProtectedInstanceReplicationResponse> attachProtectedInstanceReplicationAsyncInvoker(
        AttachProtectedInstanceReplicationRequest request) {
        return new AsyncInvoker<AttachProtectedInstanceReplicationRequest, AttachProtectedInstanceReplicationResponse>(
            request, SdrsMeta.attachProtectedInstanceReplication, hcClient);
    }

    /**
     * 批量添加保护实例标签
     *
     * 为指定保护实例批量添加或删除标签。一个资源上最多有10个标签。
     * 此接口为幂等接口：
     * 创建时如果请求体中存在重复key则报错。
     * 创建时，不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddTagsRequest 请求对象
     * @return CompletableFuture<BatchAddTagsResponse>
     */
    public CompletableFuture<BatchAddTagsResponse> batchAddTagsAsync(BatchAddTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.batchAddTags);
    }

    /**
     * 批量添加保护实例标签
     *
     * 为指定保护实例批量添加或删除标签。一个资源上最多有10个标签。
     * 此接口为幂等接口：
     * 创建时如果请求体中存在重复key则报错。
     * 创建时，不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddTagsRequest 请求对象
     * @return AsyncInvoker<BatchAddTagsRequest, BatchAddTagsResponse>
     */
    public AsyncInvoker<BatchAddTagsRequest, BatchAddTagsResponse> batchAddTagsAsyncInvoker(
        BatchAddTagsRequest request) {
        return new AsyncInvoker<BatchAddTagsRequest, BatchAddTagsResponse>(request, SdrsMeta.batchAddTags, hcClient);
    }

    /**
     * 批量创建保护实例
     *
     * 典型场景：没有特殊操作场景
     * 接口功能：批量创建保护实例。保护实例创建完成后，系统默认容灾站点云服务器名称与生产站点云服务器名称相同，但ID不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateProtectedInstancesRequest 请求对象
     * @return CompletableFuture<BatchCreateProtectedInstancesResponse>
     */
    public CompletableFuture<BatchCreateProtectedInstancesResponse> batchCreateProtectedInstancesAsync(
        BatchCreateProtectedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.batchCreateProtectedInstances);
    }

    /**
     * 批量创建保护实例
     *
     * 典型场景：没有特殊操作场景
     * 接口功能：批量创建保护实例。保护实例创建完成后，系统默认容灾站点云服务器名称与生产站点云服务器名称相同，但ID不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateProtectedInstancesRequest 请求对象
     * @return AsyncInvoker<BatchCreateProtectedInstancesRequest, BatchCreateProtectedInstancesResponse>
     */
    public AsyncInvoker<BatchCreateProtectedInstancesRequest, BatchCreateProtectedInstancesResponse> batchCreateProtectedInstancesAsyncInvoker(
        BatchCreateProtectedInstancesRequest request) {
        return new AsyncInvoker<BatchCreateProtectedInstancesRequest, BatchCreateProtectedInstancesResponse>(request,
            SdrsMeta.batchCreateProtectedInstances, hcClient);
    }

    /**
     * 批量删除保护实例
     *
     * 典型场景：没有特殊操作场景
     * 接口功能：批量删除保护实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteProtectedInstancesRequest 请求对象
     * @return CompletableFuture<BatchDeleteProtectedInstancesResponse>
     */
    public CompletableFuture<BatchDeleteProtectedInstancesResponse> batchDeleteProtectedInstancesAsync(
        BatchDeleteProtectedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.batchDeleteProtectedInstances);
    }

    /**
     * 批量删除保护实例
     *
     * 典型场景：没有特殊操作场景
     * 接口功能：批量删除保护实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteProtectedInstancesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteProtectedInstancesRequest, BatchDeleteProtectedInstancesResponse>
     */
    public AsyncInvoker<BatchDeleteProtectedInstancesRequest, BatchDeleteProtectedInstancesResponse> batchDeleteProtectedInstancesAsyncInvoker(
        BatchDeleteProtectedInstancesRequest request) {
        return new AsyncInvoker<BatchDeleteProtectedInstancesRequest, BatchDeleteProtectedInstancesResponse>(request,
            SdrsMeta.batchDeleteProtectedInstances, hcClient);
    }

    /**
     * 批量删除保护实例标签
     *
     * 为指定保护实例批量删除标签。一个资源上最多有10个标签。
     * 此接口为幂等接口：
     * 删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.batchDeleteTags);
    }

    /**
     * 批量删除保护实例标签
     *
     * 为指定保护实例批量删除标签。一个资源上最多有10个标签。
     * 此接口为幂等接口：
     * 删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>(request, SdrsMeta.batchDeleteTags,
            hcClient);
    }

    /**
     * 创建容灾演练
     *
     * 创建容灾演练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDisasterRecoveryDrillRequest 请求对象
     * @return CompletableFuture<CreateDisasterRecoveryDrillResponse>
     */
    public CompletableFuture<CreateDisasterRecoveryDrillResponse> createDisasterRecoveryDrillAsync(
        CreateDisasterRecoveryDrillRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.createDisasterRecoveryDrill);
    }

    /**
     * 创建容灾演练
     *
     * 创建容灾演练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDisasterRecoveryDrillRequest 请求对象
     * @return AsyncInvoker<CreateDisasterRecoveryDrillRequest, CreateDisasterRecoveryDrillResponse>
     */
    public AsyncInvoker<CreateDisasterRecoveryDrillRequest, CreateDisasterRecoveryDrillResponse> createDisasterRecoveryDrillAsyncInvoker(
        CreateDisasterRecoveryDrillRequest request) {
        return new AsyncInvoker<CreateDisasterRecoveryDrillRequest, CreateDisasterRecoveryDrillResponse>(request,
            SdrsMeta.createDisasterRecoveryDrill, hcClient);
    }

    /**
     * 创建保护实例
     *
     * 创建保护实例。保护实例创建完成后，系统默认容灾站点云服务器名称与生产站点云服务器名称相同，但ID不同。如果需要修改云服务器名称，请在保护实例详情页面单击云服务器名称，进入云服务器详情页面进行修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProtectedInstanceRequest 请求对象
     * @return CompletableFuture<CreateProtectedInstanceResponse>
     */
    public CompletableFuture<CreateProtectedInstanceResponse> createProtectedInstanceAsync(
        CreateProtectedInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.createProtectedInstance);
    }

    /**
     * 创建保护实例
     *
     * 创建保护实例。保护实例创建完成后，系统默认容灾站点云服务器名称与生产站点云服务器名称相同，但ID不同。如果需要修改云服务器名称，请在保护实例详情页面单击云服务器名称，进入云服务器详情页面进行修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProtectedInstanceRequest 请求对象
     * @return AsyncInvoker<CreateProtectedInstanceRequest, CreateProtectedInstanceResponse>
     */
    public AsyncInvoker<CreateProtectedInstanceRequest, CreateProtectedInstanceResponse> createProtectedInstanceAsyncInvoker(
        CreateProtectedInstanceRequest request) {
        return new AsyncInvoker<CreateProtectedInstanceRequest, CreateProtectedInstanceResponse>(request,
            SdrsMeta.createProtectedInstance, hcClient);
    }

    /**
     * 创建保护组
     *
     * 创建保护组。
     * 说明：
     * 本接口为异步接口，调用成功只是表示请求下发，创建结果需要通过“查询job状态”接口获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProtectionGroupRequest 请求对象
     * @return CompletableFuture<CreateProtectionGroupResponse>
     */
    public CompletableFuture<CreateProtectionGroupResponse> createProtectionGroupAsync(
        CreateProtectionGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.createProtectionGroup);
    }

    /**
     * 创建保护组
     *
     * 创建保护组。
     * 说明：
     * 本接口为异步接口，调用成功只是表示请求下发，创建结果需要通过“查询job状态”接口获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProtectionGroupRequest 请求对象
     * @return AsyncInvoker<CreateProtectionGroupRequest, CreateProtectionGroupResponse>
     */
    public AsyncInvoker<CreateProtectionGroupRequest, CreateProtectionGroupResponse> createProtectionGroupAsyncInvoker(
        CreateProtectionGroupRequest request) {
        return new AsyncInvoker<CreateProtectionGroupRequest, CreateProtectionGroupResponse>(request,
            SdrsMeta.createProtectionGroup, hcClient);
    }

    /**
     * 创建复制对
     *
     * 创建复制对，并将其添加到指定的保护组中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReplicationRequest 请求对象
     * @return CompletableFuture<CreateReplicationResponse>
     */
    public CompletableFuture<CreateReplicationResponse> createReplicationAsync(CreateReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.createReplication);
    }

    /**
     * 创建复制对
     *
     * 创建复制对，并将其添加到指定的保护组中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReplicationRequest 请求对象
     * @return AsyncInvoker<CreateReplicationRequest, CreateReplicationResponse>
     */
    public AsyncInvoker<CreateReplicationRequest, CreateReplicationResponse> createReplicationAsyncInvoker(
        CreateReplicationRequest request) {
        return new AsyncInvoker<CreateReplicationRequest, CreateReplicationResponse>(request,
            SdrsMeta.createReplication, hcClient);
    }

    /**
     * 删除所有保护组失败任务
     *
     * 删除所有保护组层级的失败任务，创建、删除保护组失败等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllServerGroupFailureJobsRequest 请求对象
     * @return CompletableFuture<DeleteAllServerGroupFailureJobsResponse>
     */
    public CompletableFuture<DeleteAllServerGroupFailureJobsResponse> deleteAllServerGroupFailureJobsAsync(
        DeleteAllServerGroupFailureJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteAllServerGroupFailureJobs);
    }

    /**
     * 删除所有保护组失败任务
     *
     * 删除所有保护组层级的失败任务，创建、删除保护组失败等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllServerGroupFailureJobsRequest 请求对象
     * @return AsyncInvoker<DeleteAllServerGroupFailureJobsRequest, DeleteAllServerGroupFailureJobsResponse>
     */
    public AsyncInvoker<DeleteAllServerGroupFailureJobsRequest, DeleteAllServerGroupFailureJobsResponse> deleteAllServerGroupFailureJobsAsyncInvoker(
        DeleteAllServerGroupFailureJobsRequest request) {
        return new AsyncInvoker<DeleteAllServerGroupFailureJobsRequest, DeleteAllServerGroupFailureJobsResponse>(
            request, SdrsMeta.deleteAllServerGroupFailureJobs, hcClient);
    }

    /**
     * 删除容灾演练
     *
     * 删除指定的容灾演练。删除后：
     * 容灾演练服务器、容灾演练服务器上挂载的磁盘和网卡将被一并删除。
     * 演练VPC、演练VPC的子网不会被删除。您可以继续使用该VPC创建其他云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryDrillRequest 请求对象
     * @return CompletableFuture<DeleteDisasterRecoveryDrillResponse>
     */
    public CompletableFuture<DeleteDisasterRecoveryDrillResponse> deleteDisasterRecoveryDrillAsync(
        DeleteDisasterRecoveryDrillRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteDisasterRecoveryDrill);
    }

    /**
     * 删除容灾演练
     *
     * 删除指定的容灾演练。删除后：
     * 容灾演练服务器、容灾演练服务器上挂载的磁盘和网卡将被一并删除。
     * 演练VPC、演练VPC的子网不会被删除。您可以继续使用该VPC创建其他云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryDrillRequest 请求对象
     * @return AsyncInvoker<DeleteDisasterRecoveryDrillRequest, DeleteDisasterRecoveryDrillResponse>
     */
    public AsyncInvoker<DeleteDisasterRecoveryDrillRequest, DeleteDisasterRecoveryDrillResponse> deleteDisasterRecoveryDrillAsyncInvoker(
        DeleteDisasterRecoveryDrillRequest request) {
        return new AsyncInvoker<DeleteDisasterRecoveryDrillRequest, DeleteDisasterRecoveryDrillResponse>(request,
            SdrsMeta.deleteDisasterRecoveryDrill, hcClient);
    }

    /**
     * 删除单个失败任务
     *
     * 删除单个失败任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFailureJobRequest 请求对象
     * @return CompletableFuture<DeleteFailureJobResponse>
     */
    public CompletableFuture<DeleteFailureJobResponse> deleteFailureJobAsync(DeleteFailureJobRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteFailureJob);
    }

    /**
     * 删除单个失败任务
     *
     * 删除单个失败任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFailureJobRequest 请求对象
     * @return AsyncInvoker<DeleteFailureJobRequest, DeleteFailureJobResponse>
     */
    public AsyncInvoker<DeleteFailureJobRequest, DeleteFailureJobResponse> deleteFailureJobAsyncInvoker(
        DeleteFailureJobRequest request) {
        return new AsyncInvoker<DeleteFailureJobRequest, DeleteFailureJobResponse>(request, SdrsMeta.deleteFailureJob,
            hcClient);
    }

    /**
     * 删除保护实例
     *
     * 删除指定的保护实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProtectedInstanceRequest 请求对象
     * @return CompletableFuture<DeleteProtectedInstanceResponse>
     */
    public CompletableFuture<DeleteProtectedInstanceResponse> deleteProtectedInstanceAsync(
        DeleteProtectedInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteProtectedInstance);
    }

    /**
     * 删除保护实例
     *
     * 删除指定的保护实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProtectedInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteProtectedInstanceRequest, DeleteProtectedInstanceResponse>
     */
    public AsyncInvoker<DeleteProtectedInstanceRequest, DeleteProtectedInstanceResponse> deleteProtectedInstanceAsyncInvoker(
        DeleteProtectedInstanceRequest request) {
        return new AsyncInvoker<DeleteProtectedInstanceRequest, DeleteProtectedInstanceResponse>(request,
            SdrsMeta.deleteProtectedInstance, hcClient);
    }

    /**
     * 保护实例删除网卡
     *
     * 删除指定保护实例的指定网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProtectedInstanceNicRequest 请求对象
     * @return CompletableFuture<DeleteProtectedInstanceNicResponse>
     */
    public CompletableFuture<DeleteProtectedInstanceNicResponse> deleteProtectedInstanceNicAsync(
        DeleteProtectedInstanceNicRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteProtectedInstanceNic);
    }

    /**
     * 保护实例删除网卡
     *
     * 删除指定保护实例的指定网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProtectedInstanceNicRequest 请求对象
     * @return AsyncInvoker<DeleteProtectedInstanceNicRequest, DeleteProtectedInstanceNicResponse>
     */
    public AsyncInvoker<DeleteProtectedInstanceNicRequest, DeleteProtectedInstanceNicResponse> deleteProtectedInstanceNicAsyncInvoker(
        DeleteProtectedInstanceNicRequest request) {
        return new AsyncInvoker<DeleteProtectedInstanceNicRequest, DeleteProtectedInstanceNicResponse>(request,
            SdrsMeta.deleteProtectedInstanceNic, hcClient);
    }

    /**
     * 删除保护实例标签
     *
     * 幂等接口：删除时，不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口URI做decodeURI。
     *  说明:请自行选择工具执行URI编码。
     * 删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProtectedInstanceTagRequest 请求对象
     * @return CompletableFuture<DeleteProtectedInstanceTagResponse>
     */
    public CompletableFuture<DeleteProtectedInstanceTagResponse> deleteProtectedInstanceTagAsync(
        DeleteProtectedInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteProtectedInstanceTag);
    }

    /**
     * 删除保护实例标签
     *
     * 幂等接口：删除时，不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口URI做decodeURI。
     *  说明:请自行选择工具执行URI编码。
     * 删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProtectedInstanceTagRequest 请求对象
     * @return AsyncInvoker<DeleteProtectedInstanceTagRequest, DeleteProtectedInstanceTagResponse>
     */
    public AsyncInvoker<DeleteProtectedInstanceTagRequest, DeleteProtectedInstanceTagResponse> deleteProtectedInstanceTagAsyncInvoker(
        DeleteProtectedInstanceTagRequest request) {
        return new AsyncInvoker<DeleteProtectedInstanceTagRequest, DeleteProtectedInstanceTagResponse>(request,
            SdrsMeta.deleteProtectedInstanceTag, hcClient);
    }

    /**
     * 删除保护组
     *
     * 删除指定的保护组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProtectionGroupRequest 请求对象
     * @return CompletableFuture<DeleteProtectionGroupResponse>
     */
    public CompletableFuture<DeleteProtectionGroupResponse> deleteProtectionGroupAsync(
        DeleteProtectionGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteProtectionGroup);
    }

    /**
     * 删除保护组
     *
     * 删除指定的保护组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProtectionGroupRequest 请求对象
     * @return AsyncInvoker<DeleteProtectionGroupRequest, DeleteProtectionGroupResponse>
     */
    public AsyncInvoker<DeleteProtectionGroupRequest, DeleteProtectionGroupResponse> deleteProtectionGroupAsyncInvoker(
        DeleteProtectionGroupRequest request) {
        return new AsyncInvoker<DeleteProtectionGroupRequest, DeleteProtectionGroupResponse>(request,
            SdrsMeta.deleteProtectionGroup, hcClient);
    }

    /**
     * 删除复制对
     *
     * 删除指定的复制对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReplicationRequest 请求对象
     * @return CompletableFuture<DeleteReplicationResponse>
     */
    public CompletableFuture<DeleteReplicationResponse> deleteReplicationAsync(DeleteReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteReplication);
    }

    /**
     * 删除复制对
     *
     * 删除指定的复制对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReplicationRequest 请求对象
     * @return AsyncInvoker<DeleteReplicationRequest, DeleteReplicationResponse>
     */
    public AsyncInvoker<DeleteReplicationRequest, DeleteReplicationResponse> deleteReplicationAsyncInvoker(
        DeleteReplicationRequest request) {
        return new AsyncInvoker<DeleteReplicationRequest, DeleteReplicationResponse>(request,
            SdrsMeta.deleteReplication, hcClient);
    }

    /**
     * 删除指定保护组内的所有失败任务
     *
     * 删除指定保护组内的所有失败任务，创建保护实例失败、创建复制对失败、删除保护实例失败、删除复制对失败等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupFailureJobsRequest 请求对象
     * @return CompletableFuture<DeleteServerGroupFailureJobsResponse>
     */
    public CompletableFuture<DeleteServerGroupFailureJobsResponse> deleteServerGroupFailureJobsAsync(
        DeleteServerGroupFailureJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.deleteServerGroupFailureJobs);
    }

    /**
     * 删除指定保护组内的所有失败任务
     *
     * 删除指定保护组内的所有失败任务，创建保护实例失败、创建复制对失败、删除保护实例失败、删除复制对失败等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupFailureJobsRequest 请求对象
     * @return AsyncInvoker<DeleteServerGroupFailureJobsRequest, DeleteServerGroupFailureJobsResponse>
     */
    public AsyncInvoker<DeleteServerGroupFailureJobsRequest, DeleteServerGroupFailureJobsResponse> deleteServerGroupFailureJobsAsyncInvoker(
        DeleteServerGroupFailureJobsRequest request) {
        return new AsyncInvoker<DeleteServerGroupFailureJobsRequest, DeleteServerGroupFailureJobsResponse>(request,
            SdrsMeta.deleteServerGroupFailureJobs, hcClient);
    }

    /**
     * 保护实例卸载复制对
     *
     * 将指定的复制对从指定的保护实例上卸载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachProtectedInstanceReplicationRequest 请求对象
     * @return CompletableFuture<DetachProtectedInstanceReplicationResponse>
     */
    public CompletableFuture<DetachProtectedInstanceReplicationResponse> detachProtectedInstanceReplicationAsync(
        DetachProtectedInstanceReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.detachProtectedInstanceReplication);
    }

    /**
     * 保护实例卸载复制对
     *
     * 将指定的复制对从指定的保护实例上卸载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachProtectedInstanceReplicationRequest 请求对象
     * @return AsyncInvoker<DetachProtectedInstanceReplicationRequest, DetachProtectedInstanceReplicationResponse>
     */
    public AsyncInvoker<DetachProtectedInstanceReplicationRequest, DetachProtectedInstanceReplicationResponse> detachProtectedInstanceReplicationAsyncInvoker(
        DetachProtectedInstanceReplicationRequest request) {
        return new AsyncInvoker<DetachProtectedInstanceReplicationRequest, DetachProtectedInstanceReplicationResponse>(
            request, SdrsMeta.detachProtectedInstanceReplication, hcClient);
    }

    /**
     * 复制对扩容
     *
     * 对复制对包含的两个磁盘进行扩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandReplicationRequest 请求对象
     * @return CompletableFuture<ExpandReplicationResponse>
     */
    public CompletableFuture<ExpandReplicationResponse> expandReplicationAsync(ExpandReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.expandReplication);
    }

    /**
     * 复制对扩容
     *
     * 对复制对包含的两个磁盘进行扩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandReplicationRequest 请求对象
     * @return AsyncInvoker<ExpandReplicationRequest, ExpandReplicationResponse>
     */
    public AsyncInvoker<ExpandReplicationRequest, ExpandReplicationResponse> expandReplicationAsyncInvoker(
        ExpandReplicationRequest request) {
        return new AsyncInvoker<ExpandReplicationRequest, ExpandReplicationResponse>(request,
            SdrsMeta.expandReplication, hcClient);
    }

    /**
     * 查询双活域
     *
     * 查询双活域。双活域由本端存储设备、远端存储设备组成，通过双活域，应用服务器可以实现跨站点的数据访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActiveActiveDomainsRequest 请求对象
     * @return CompletableFuture<ListActiveActiveDomainsResponse>
     */
    public CompletableFuture<ListActiveActiveDomainsResponse> listActiveActiveDomainsAsync(
        ListActiveActiveDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listActiveActiveDomains);
    }

    /**
     * 查询双活域
     *
     * 查询双活域。双活域由本端存储设备、远端存储设备组成，通过双活域，应用服务器可以实现跨站点的数据访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActiveActiveDomainsRequest 请求对象
     * @return AsyncInvoker<ListActiveActiveDomainsRequest, ListActiveActiveDomainsResponse>
     */
    public AsyncInvoker<ListActiveActiveDomainsRequest, ListActiveActiveDomainsResponse> listActiveActiveDomainsAsyncInvoker(
        ListActiveActiveDomainsRequest request) {
        return new AsyncInvoker<ListActiveActiveDomainsRequest, ListActiveActiveDomainsResponse>(request,
            SdrsMeta.listActiveActiveDomains, hcClient);
    }

    /**
     * 查询容灾演练列表
     *
     * 查询指定保护组下的所有容灾演练列表，当未指定保护组时查询当前租户下的所有容灾演练列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDisasterRecoveryDrillsRequest 请求对象
     * @return CompletableFuture<ListDisasterRecoveryDrillsResponse>
     */
    public CompletableFuture<ListDisasterRecoveryDrillsResponse> listDisasterRecoveryDrillsAsync(
        ListDisasterRecoveryDrillsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listDisasterRecoveryDrills);
    }

    /**
     * 查询容灾演练列表
     *
     * 查询指定保护组下的所有容灾演练列表，当未指定保护组时查询当前租户下的所有容灾演练列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDisasterRecoveryDrillsRequest 请求对象
     * @return AsyncInvoker<ListDisasterRecoveryDrillsRequest, ListDisasterRecoveryDrillsResponse>
     */
    public AsyncInvoker<ListDisasterRecoveryDrillsRequest, ListDisasterRecoveryDrillsResponse> listDisasterRecoveryDrillsAsyncInvoker(
        ListDisasterRecoveryDrillsRequest request) {
        return new AsyncInvoker<ListDisasterRecoveryDrillsRequest, ListDisasterRecoveryDrillsResponse>(request,
            SdrsMeta.listDisasterRecoveryDrills, hcClient);
    }

    /**
     * 查询失败任务列表
     *
     * 查询所有保护组失败任务列表或者指定保护组下的所有失败任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFailureJobsRequest 请求对象
     * @return CompletableFuture<ListFailureJobsResponse>
     */
    public CompletableFuture<ListFailureJobsResponse> listFailureJobsAsync(ListFailureJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listFailureJobs);
    }

    /**
     * 查询失败任务列表
     *
     * 查询所有保护组失败任务列表或者指定保护组下的所有失败任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFailureJobsRequest 请求对象
     * @return AsyncInvoker<ListFailureJobsRequest, ListFailureJobsResponse>
     */
    public AsyncInvoker<ListFailureJobsRequest, ListFailureJobsResponse> listFailureJobsAsyncInvoker(
        ListFailureJobsRequest request) {
        return new AsyncInvoker<ListFailureJobsRequest, ListFailureJobsResponse>(request, SdrsMeta.listFailureJobs,
            hcClient);
    }

    /**
     * 查询保护实例标签
     *
     * 查询指定保护实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListProtectedInstanceTagsResponse>
     */
    public CompletableFuture<ListProtectedInstanceTagsResponse> listProtectedInstanceTagsAsync(
        ListProtectedInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listProtectedInstanceTags);
    }

    /**
     * 查询保护实例标签
     *
     * 查询指定保护实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListProtectedInstanceTagsRequest, ListProtectedInstanceTagsResponse>
     */
    public AsyncInvoker<ListProtectedInstanceTagsRequest, ListProtectedInstanceTagsResponse> listProtectedInstanceTagsAsyncInvoker(
        ListProtectedInstanceTagsRequest request) {
        return new AsyncInvoker<ListProtectedInstanceTagsRequest, ListProtectedInstanceTagsResponse>(request,
            SdrsMeta.listProtectedInstanceTags, hcClient);
    }

    /**
     * 查询保护实例列表
     *
     * 查询当前租户下的所有保护实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedInstancesRequest 请求对象
     * @return CompletableFuture<ListProtectedInstancesResponse>
     */
    public CompletableFuture<ListProtectedInstancesResponse> listProtectedInstancesAsync(
        ListProtectedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listProtectedInstances);
    }

    /**
     * 查询保护实例列表
     *
     * 查询当前租户下的所有保护实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedInstancesRequest 请求对象
     * @return AsyncInvoker<ListProtectedInstancesRequest, ListProtectedInstancesResponse>
     */
    public AsyncInvoker<ListProtectedInstancesRequest, ListProtectedInstancesResponse> listProtectedInstancesAsyncInvoker(
        ListProtectedInstancesRequest request) {
        return new AsyncInvoker<ListProtectedInstancesRequest, ListProtectedInstancesResponse>(request,
            SdrsMeta.listProtectedInstances, hcClient);
    }

    /**
     * 通过标签查询保护实例
     *
     * 使用标签过滤保护实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListProtectedInstancesByTagsResponse>
     */
    public CompletableFuture<ListProtectedInstancesByTagsResponse> listProtectedInstancesByTagsAsync(
        ListProtectedInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listProtectedInstancesByTags);
    }

    /**
     * 通过标签查询保护实例
     *
     * 使用标签过滤保护实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedInstancesByTagsRequest 请求对象
     * @return AsyncInvoker<ListProtectedInstancesByTagsRequest, ListProtectedInstancesByTagsResponse>
     */
    public AsyncInvoker<ListProtectedInstancesByTagsRequest, ListProtectedInstancesByTagsResponse> listProtectedInstancesByTagsAsyncInvoker(
        ListProtectedInstancesByTagsRequest request) {
        return new AsyncInvoker<ListProtectedInstancesByTagsRequest, ListProtectedInstancesByTagsResponse>(request,
            SdrsMeta.listProtectedInstancesByTags, hcClient);
    }

    /**
     * 查询保护实例项目标签
     *
     * 查询租户在指定Project中保护实例的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedInstancesProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProtectedInstancesProjectTagsResponse>
     */
    public CompletableFuture<ListProtectedInstancesProjectTagsResponse> listProtectedInstancesProjectTagsAsync(
        ListProtectedInstancesProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listProtectedInstancesProjectTags);
    }

    /**
     * 查询保护实例项目标签
     *
     * 查询租户在指定Project中保护实例的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedInstancesProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProtectedInstancesProjectTagsRequest, ListProtectedInstancesProjectTagsResponse>
     */
    public AsyncInvoker<ListProtectedInstancesProjectTagsRequest, ListProtectedInstancesProjectTagsResponse> listProtectedInstancesProjectTagsAsyncInvoker(
        ListProtectedInstancesProjectTagsRequest request) {
        return new AsyncInvoker<ListProtectedInstancesProjectTagsRequest, ListProtectedInstancesProjectTagsResponse>(
            request, SdrsMeta.listProtectedInstancesProjectTags, hcClient);
    }

    /**
     * 查询保护组列表
     *
     * 查询当前租户所有的保护组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectionGroupsRequest 请求对象
     * @return CompletableFuture<ListProtectionGroupsResponse>
     */
    public CompletableFuture<ListProtectionGroupsResponse> listProtectionGroupsAsync(
        ListProtectionGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listProtectionGroups);
    }

    /**
     * 查询保护组列表
     *
     * 查询当前租户所有的保护组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectionGroupsRequest 请求对象
     * @return AsyncInvoker<ListProtectionGroupsRequest, ListProtectionGroupsResponse>
     */
    public AsyncInvoker<ListProtectionGroupsRequest, ListProtectionGroupsResponse> listProtectionGroupsAsyncInvoker(
        ListProtectionGroupsRequest request) {
        return new AsyncInvoker<ListProtectionGroupsRequest, ListProtectionGroupsResponse>(request,
            SdrsMeta.listProtectionGroups, hcClient);
    }

    /**
     * 查询复制对列表
     *
     * 查询指定保护组下的所有复制对列表，如果不给定指定保护组则查询当前租户下的所有复制对列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReplicationsRequest 请求对象
     * @return CompletableFuture<ListReplicationsResponse>
     */
    public CompletableFuture<ListReplicationsResponse> listReplicationsAsync(ListReplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listReplications);
    }

    /**
     * 查询复制对列表
     *
     * 查询指定保护组下的所有复制对列表，如果不给定指定保护组则查询当前租户下的所有复制对列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReplicationsRequest 请求对象
     * @return AsyncInvoker<ListReplicationsRequest, ListReplicationsResponse>
     */
    public AsyncInvoker<ListReplicationsRequest, ListReplicationsResponse> listReplicationsAsyncInvoker(
        ListReplicationsRequest request) {
        return new AsyncInvoker<ListReplicationsRequest, ListReplicationsResponse>(request, SdrsMeta.listReplications,
            hcClient);
    }

    /**
     * 查询资源的RPO超标趋势记录列表
     *
     * 查询当前租户大屏显示中，资源的RPO超标趋势记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRpoStatisticsRequest 请求对象
     * @return CompletableFuture<ListRpoStatisticsResponse>
     */
    public CompletableFuture<ListRpoStatisticsResponse> listRpoStatisticsAsync(ListRpoStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listRpoStatistics);
    }

    /**
     * 查询资源的RPO超标趋势记录列表
     *
     * 查询当前租户大屏显示中，资源的RPO超标趋势记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRpoStatisticsRequest 请求对象
     * @return AsyncInvoker<ListRpoStatisticsRequest, ListRpoStatisticsResponse>
     */
    public AsyncInvoker<ListRpoStatisticsRequest, ListRpoStatisticsResponse> listRpoStatisticsAsyncInvoker(
        ListRpoStatisticsRequest request) {
        return new AsyncInvoker<ListRpoStatisticsRequest, ListRpoStatisticsResponse>(request,
            SdrsMeta.listRpoStatistics, hcClient);
    }

    /**
     * 保护实例变更规格
     *
     * 变更指定保护实例中弹性云服务器的规格，包括：同时变更生产站点云服务器和容灾站点云服务器的规格。
     * 仅变更生产站点云服务器的规格，容灾站点云服务器规格不变。
     * 生产站点云服务器规格不变，仅变更容灾站点云服务器的规格。
     * 当且仅当待变更规格的云服务器处于关机状态时，才能执行此操作。
     *  说明：不同规格的云服务器在性能上存在差异，可能会对云服务器上运行的应用产生影响。
     * 为保证切换/故障切换后云服务器的性能，建议容灾站点服务器的规格（CPU、内存）不低于生产站点云服务器的规格（CPU、内存）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeProtectedInstanceRequest 请求对象
     * @return CompletableFuture<ResizeProtectedInstanceResponse>
     */
    public CompletableFuture<ResizeProtectedInstanceResponse> resizeProtectedInstanceAsync(
        ResizeProtectedInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.resizeProtectedInstance);
    }

    /**
     * 保护实例变更规格
     *
     * 变更指定保护实例中弹性云服务器的规格，包括：同时变更生产站点云服务器和容灾站点云服务器的规格。
     * 仅变更生产站点云服务器的规格，容灾站点云服务器规格不变。
     * 生产站点云服务器规格不变，仅变更容灾站点云服务器的规格。
     * 当且仅当待变更规格的云服务器处于关机状态时，才能执行此操作。
     *  说明：不同规格的云服务器在性能上存在差异，可能会对云服务器上运行的应用产生影响。
     * 为保证切换/故障切换后云服务器的性能，建议容灾站点服务器的规格（CPU、内存）不低于生产站点云服务器的规格（CPU、内存）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeProtectedInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeProtectedInstanceRequest, ResizeProtectedInstanceResponse>
     */
    public AsyncInvoker<ResizeProtectedInstanceRequest, ResizeProtectedInstanceResponse> resizeProtectedInstanceAsyncInvoker(
        ResizeProtectedInstanceRequest request) {
        return new AsyncInvoker<ResizeProtectedInstanceRequest, ResizeProtectedInstanceResponse>(request,
            SdrsMeta.resizeProtectedInstance, hcClient);
    }

    /**
     * 查询单个容灾演练详情
     *
     * 查询单个容灾演练的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDisasterRecoveryDrillRequest 请求对象
     * @return CompletableFuture<ShowDisasterRecoveryDrillResponse>
     */
    public CompletableFuture<ShowDisasterRecoveryDrillResponse> showDisasterRecoveryDrillAsync(
        ShowDisasterRecoveryDrillRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.showDisasterRecoveryDrill);
    }

    /**
     * 查询单个容灾演练详情
     *
     * 查询单个容灾演练的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDisasterRecoveryDrillRequest 请求对象
     * @return AsyncInvoker<ShowDisasterRecoveryDrillRequest, ShowDisasterRecoveryDrillResponse>
     */
    public AsyncInvoker<ShowDisasterRecoveryDrillRequest, ShowDisasterRecoveryDrillResponse> showDisasterRecoveryDrillAsyncInvoker(
        ShowDisasterRecoveryDrillRequest request) {
        return new AsyncInvoker<ShowDisasterRecoveryDrillRequest, ShowDisasterRecoveryDrillResponse>(request,
            SdrsMeta.showDisasterRecoveryDrill, hcClient);
    }

    /**
     * 查询单个保护实例详情
     *
     * 查询单个保护实例的详细信息，如名称、ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProtectedInstanceRequest 请求对象
     * @return CompletableFuture<ShowProtectedInstanceResponse>
     */
    public CompletableFuture<ShowProtectedInstanceResponse> showProtectedInstanceAsync(
        ShowProtectedInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.showProtectedInstance);
    }

    /**
     * 查询单个保护实例详情
     *
     * 查询单个保护实例的详细信息，如名称、ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProtectedInstanceRequest 请求对象
     * @return AsyncInvoker<ShowProtectedInstanceRequest, ShowProtectedInstanceResponse>
     */
    public AsyncInvoker<ShowProtectedInstanceRequest, ShowProtectedInstanceResponse> showProtectedInstanceAsyncInvoker(
        ShowProtectedInstanceRequest request) {
        return new AsyncInvoker<ShowProtectedInstanceRequest, ShowProtectedInstanceResponse>(request,
            SdrsMeta.showProtectedInstance, hcClient);
    }

    /**
     * 查询保护组详情
     *
     * 查询单个保护组的详细信息，如ID、名称等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProtectionGroupRequest 请求对象
     * @return CompletableFuture<ShowProtectionGroupResponse>
     */
    public CompletableFuture<ShowProtectionGroupResponse> showProtectionGroupAsync(ShowProtectionGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.showProtectionGroup);
    }

    /**
     * 查询保护组详情
     *
     * 查询单个保护组的详细信息，如ID、名称等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProtectionGroupRequest 请求对象
     * @return AsyncInvoker<ShowProtectionGroupRequest, ShowProtectionGroupResponse>
     */
    public AsyncInvoker<ShowProtectionGroupRequest, ShowProtectionGroupResponse> showProtectionGroupAsyncInvoker(
        ShowProtectionGroupRequest request) {
        return new AsyncInvoker<ShowProtectionGroupRequest, ShowProtectionGroupResponse>(request,
            SdrsMeta.showProtectionGroup, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询资源的配额相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.showQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询资源的配额相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, SdrsMeta.showQuota, hcClient);
    }

    /**
     * 查询单个复制对详情
     *
     * 查询单个复制对的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplicationRequest 请求对象
     * @return CompletableFuture<ShowReplicationResponse>
     */
    public CompletableFuture<ShowReplicationResponse> showReplicationAsync(ShowReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.showReplication);
    }

    /**
     * 查询单个复制对详情
     *
     * 查询单个复制对的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplicationRequest 请求对象
     * @return AsyncInvoker<ShowReplicationRequest, ShowReplicationResponse>
     */
    public AsyncInvoker<ShowReplicationRequest, ShowReplicationResponse> showReplicationAsyncInvoker(
        ShowReplicationRequest request) {
        return new AsyncInvoker<ShowReplicationRequest, ShowReplicationResponse>(request, SdrsMeta.showReplication,
            hcClient);
    }

    /**
     * 保护组故障切换
     *
     * 当保护组的生产站点发生故障时，将保护组的生产站点切到当前的容灾站点，即另一端AZ，启用当前容灾站点的云硬盘以及云服务器等资源。
     * 故障切换完成之后，保护组的当前生产站点变成故障切换发生之前的容灾站点，且生产站点和容灾站点之间的数据已停止保护，必须调用5.4.6-保护组开启保护/重保护接口成功后，两端的数据才会重新被保护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartFailoverProtectionGroupRequest 请求对象
     * @return CompletableFuture<StartFailoverProtectionGroupResponse>
     */
    public CompletableFuture<StartFailoverProtectionGroupResponse> startFailoverProtectionGroupAsync(
        StartFailoverProtectionGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.startFailoverProtectionGroup);
    }

    /**
     * 保护组故障切换
     *
     * 当保护组的生产站点发生故障时，将保护组的生产站点切到当前的容灾站点，即另一端AZ，启用当前容灾站点的云硬盘以及云服务器等资源。
     * 故障切换完成之后，保护组的当前生产站点变成故障切换发生之前的容灾站点，且生产站点和容灾站点之间的数据已停止保护，必须调用5.4.6-保护组开启保护/重保护接口成功后，两端的数据才会重新被保护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartFailoverProtectionGroupRequest 请求对象
     * @return AsyncInvoker<StartFailoverProtectionGroupRequest, StartFailoverProtectionGroupResponse>
     */
    public AsyncInvoker<StartFailoverProtectionGroupRequest, StartFailoverProtectionGroupResponse> startFailoverProtectionGroupAsyncInvoker(
        StartFailoverProtectionGroupRequest request) {
        return new AsyncInvoker<StartFailoverProtectionGroupRequest, StartFailoverProtectionGroupResponse>(request,
            SdrsMeta.startFailoverProtectionGroup, hcClient);
    }

    /**
     * 保护组开启保护/重保护
     *
     * 对某一个保护组的“开启保护”或“重保护”操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartProtectionGroupRequest 请求对象
     * @return CompletableFuture<StartProtectionGroupResponse>
     */
    public CompletableFuture<StartProtectionGroupResponse> startProtectionGroupAsync(
        StartProtectionGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.startProtectionGroup);
    }

    /**
     * 保护组开启保护/重保护
     *
     * 对某一个保护组的“开启保护”或“重保护”操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartProtectionGroupRequest 请求对象
     * @return AsyncInvoker<StartProtectionGroupRequest, StartProtectionGroupResponse>
     */
    public AsyncInvoker<StartProtectionGroupRequest, StartProtectionGroupResponse> startProtectionGroupAsyncInvoker(
        StartProtectionGroupRequest request) {
        return new AsyncInvoker<StartProtectionGroupRequest, StartProtectionGroupResponse>(request,
            SdrsMeta.startProtectionGroup, hcClient);
    }

    /**
     * 保护组切换
     *
     * 对保护组进行切换操作，可以将保护组的当前生产站点，从创建保护组时指定的生产站点切换到创建保护组时指定的容灾站点，也可以从创建保护组时指定的容灾站点切换到创建保护组时指定的生产站点。切换后，生产站点和容灾站点的数据仍然处于被保护状态，只是复制方向与操作之前相反。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartReverseProtectionGroupRequest 请求对象
     * @return CompletableFuture<StartReverseProtectionGroupResponse>
     */
    public CompletableFuture<StartReverseProtectionGroupResponse> startReverseProtectionGroupAsync(
        StartReverseProtectionGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.startReverseProtectionGroup);
    }

    /**
     * 保护组切换
     *
     * 对保护组进行切换操作，可以将保护组的当前生产站点，从创建保护组时指定的生产站点切换到创建保护组时指定的容灾站点，也可以从创建保护组时指定的容灾站点切换到创建保护组时指定的生产站点。切换后，生产站点和容灾站点的数据仍然处于被保护状态，只是复制方向与操作之前相反。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartReverseProtectionGroupRequest 请求对象
     * @return AsyncInvoker<StartReverseProtectionGroupRequest, StartReverseProtectionGroupResponse>
     */
    public AsyncInvoker<StartReverseProtectionGroupRequest, StartReverseProtectionGroupResponse> startReverseProtectionGroupAsyncInvoker(
        StartReverseProtectionGroupRequest request) {
        return new AsyncInvoker<StartReverseProtectionGroupRequest, StartReverseProtectionGroupResponse>(request,
            SdrsMeta.startReverseProtectionGroup, hcClient);
    }

    /**
     * 保护组停止保护
     *
     * 对某一个保护组的停止保护操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopProtectionGroupRequest 请求对象
     * @return CompletableFuture<StopProtectionGroupResponse>
     */
    public CompletableFuture<StopProtectionGroupResponse> stopProtectionGroupAsync(StopProtectionGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.stopProtectionGroup);
    }

    /**
     * 保护组停止保护
     *
     * 对某一个保护组的停止保护操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopProtectionGroupRequest 请求对象
     * @return AsyncInvoker<StopProtectionGroupRequest, StopProtectionGroupResponse>
     */
    public AsyncInvoker<StopProtectionGroupRequest, StopProtectionGroupResponse> stopProtectionGroupAsyncInvoker(
        StopProtectionGroupRequest request) {
        return new AsyncInvoker<StopProtectionGroupRequest, StopProtectionGroupResponse>(request,
            SdrsMeta.stopProtectionGroup, hcClient);
    }

    /**
     * 更新容灾演练名称
     *
     * 更新容灾演练的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDisasterRecoveryDrillNameRequest 请求对象
     * @return CompletableFuture<UpdateDisasterRecoveryDrillNameResponse>
     */
    public CompletableFuture<UpdateDisasterRecoveryDrillNameResponse> updateDisasterRecoveryDrillNameAsync(
        UpdateDisasterRecoveryDrillNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.updateDisasterRecoveryDrillName);
    }

    /**
     * 更新容灾演练名称
     *
     * 更新容灾演练的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDisasterRecoveryDrillNameRequest 请求对象
     * @return AsyncInvoker<UpdateDisasterRecoveryDrillNameRequest, UpdateDisasterRecoveryDrillNameResponse>
     */
    public AsyncInvoker<UpdateDisasterRecoveryDrillNameRequest, UpdateDisasterRecoveryDrillNameResponse> updateDisasterRecoveryDrillNameAsyncInvoker(
        UpdateDisasterRecoveryDrillNameRequest request) {
        return new AsyncInvoker<UpdateDisasterRecoveryDrillNameRequest, UpdateDisasterRecoveryDrillNameResponse>(
            request, SdrsMeta.updateDisasterRecoveryDrillName, hcClient);
    }

    /**
     * 更新保护实例名称
     *
     * 更新某一个保护实例的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProtectedInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateProtectedInstanceNameResponse>
     */
    public CompletableFuture<UpdateProtectedInstanceNameResponse> updateProtectedInstanceNameAsync(
        UpdateProtectedInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.updateProtectedInstanceName);
    }

    /**
     * 更新保护实例名称
     *
     * 更新某一个保护实例的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProtectedInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateProtectedInstanceNameRequest, UpdateProtectedInstanceNameResponse>
     */
    public AsyncInvoker<UpdateProtectedInstanceNameRequest, UpdateProtectedInstanceNameResponse> updateProtectedInstanceNameAsyncInvoker(
        UpdateProtectedInstanceNameRequest request) {
        return new AsyncInvoker<UpdateProtectedInstanceNameRequest, UpdateProtectedInstanceNameResponse>(request,
            SdrsMeta.updateProtectedInstanceName, hcClient);
    }

    /**
     * 更新保护组名称
     *
     * 更新某一个保护组的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProtectionGroupNameRequest 请求对象
     * @return CompletableFuture<UpdateProtectionGroupNameResponse>
     */
    public CompletableFuture<UpdateProtectionGroupNameResponse> updateProtectionGroupNameAsync(
        UpdateProtectionGroupNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.updateProtectionGroupName);
    }

    /**
     * 更新保护组名称
     *
     * 更新某一个保护组的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProtectionGroupNameRequest 请求对象
     * @return AsyncInvoker<UpdateProtectionGroupNameRequest, UpdateProtectionGroupNameResponse>
     */
    public AsyncInvoker<UpdateProtectionGroupNameRequest, UpdateProtectionGroupNameResponse> updateProtectionGroupNameAsyncInvoker(
        UpdateProtectionGroupNameRequest request) {
        return new AsyncInvoker<UpdateProtectionGroupNameRequest, UpdateProtectionGroupNameResponse>(request,
            SdrsMeta.updateProtectionGroupName, hcClient);
    }

    /**
     * 更新复制对名称
     *
     * 更新复制对名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReplicationNameRequest 请求对象
     * @return CompletableFuture<UpdateReplicationNameResponse>
     */
    public CompletableFuture<UpdateReplicationNameResponse> updateReplicationNameAsync(
        UpdateReplicationNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.updateReplicationName);
    }

    /**
     * 更新复制对名称
     *
     * 更新复制对名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReplicationNameRequest 请求对象
     * @return AsyncInvoker<UpdateReplicationNameRequest, UpdateReplicationNameResponse>
     */
    public AsyncInvoker<UpdateReplicationNameRequest, UpdateReplicationNameResponse> updateReplicationNameAsyncInvoker(
        UpdateReplicationNameRequest request) {
        return new AsyncInvoker<UpdateReplicationNameRequest, UpdateReplicationNameResponse>(request,
            SdrsMeta.updateReplicationName, hcClient);
    }

    /**
     * 查询API版本信息
     *
     * 查询存储容灾当前所有可用的版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.listApiVersions);
    }

    /**
     * 查询API版本信息
     *
     * 查询存储容灾当前所有可用的版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, SdrsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询存储容灾指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpecifiedApiVersionRequest 请求对象
     * @return CompletableFuture<ShowSpecifiedApiVersionResponse>
     */
    public CompletableFuture<ShowSpecifiedApiVersionResponse> showSpecifiedApiVersionAsync(
        ShowSpecifiedApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.showSpecifiedApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询存储容灾指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpecifiedApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowSpecifiedApiVersionRequest, ShowSpecifiedApiVersionResponse>
     */
    public AsyncInvoker<ShowSpecifiedApiVersionRequest, ShowSpecifiedApiVersionResponse> showSpecifiedApiVersionAsyncInvoker(
        ShowSpecifiedApiVersionRequest request) {
        return new AsyncInvoker<ShowSpecifiedApiVersionRequest, ShowSpecifiedApiVersionResponse>(request,
            SdrsMeta.showSpecifiedApiVersion, hcClient);
    }

    /**
     * 查询job状态
     *
     * 查询job的执行状态。
     * 对于创建保护组、删除保护组、创建保护实例、删除保护实例、创建复制对、删除复制对等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStatusResponse>
     */
    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, SdrsMeta.showJobStatus);
    }

    /**
     * 查询job状态
     *
     * 查询job的执行状态。
     * 对于创建保护组、删除保护组、创建保护实例、删除保护实例、创建复制对、删除复制对等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(
        ShowJobStatusRequest request) {
        return new AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, SdrsMeta.showJobStatus, hcClient);
    }

}
