package com.huaweicloud.sdk.sdrs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sdrs.v1.model.AddProtectedInstanceNicRequest;
import com.huaweicloud.sdk.sdrs.v1.model.AddProtectedInstanceNicResponse;
import com.huaweicloud.sdk.sdrs.v1.model.AddProtectedInstanceTagsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.AddProtectedInstanceTagsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.AttachProtectedInstanceReplicationRequest;
import com.huaweicloud.sdk.sdrs.v1.model.AttachProtectedInstanceReplicationResponse;
import com.huaweicloud.sdk.sdrs.v1.model.BatchAddTagsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.BatchAddTagsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.BatchCreateProtectedInstancesRequest;
import com.huaweicloud.sdk.sdrs.v1.model.BatchCreateProtectedInstancesResponse;
import com.huaweicloud.sdk.sdrs.v1.model.BatchDeleteProtectedInstancesRequest;
import com.huaweicloud.sdk.sdrs.v1.model.BatchDeleteProtectedInstancesResponse;
import com.huaweicloud.sdk.sdrs.v1.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.CreateDisasterRecoveryDrillRequest;
import com.huaweicloud.sdk.sdrs.v1.model.CreateDisasterRecoveryDrillResponse;
import com.huaweicloud.sdk.sdrs.v1.model.CreateProtectedInstanceRequest;
import com.huaweicloud.sdk.sdrs.v1.model.CreateProtectedInstanceResponse;
import com.huaweicloud.sdk.sdrs.v1.model.CreateProtectionGroupRequest;
import com.huaweicloud.sdk.sdrs.v1.model.CreateProtectionGroupResponse;
import com.huaweicloud.sdk.sdrs.v1.model.CreateReplicationRequest;
import com.huaweicloud.sdk.sdrs.v1.model.CreateReplicationResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteAllServerGroupFailureJobsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteAllServerGroupFailureJobsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteDisasterRecoveryDrillRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteDisasterRecoveryDrillResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteFailureJobRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteFailureJobResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteProtectedInstanceNicRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteProtectedInstanceNicResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteProtectedInstanceRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteProtectedInstanceResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteProtectedInstanceTagRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteProtectedInstanceTagResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteProtectionGroupRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteProtectionGroupResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteReplicationRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteReplicationResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteServerGroupFailureJobsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DeleteServerGroupFailureJobsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.DetachProtectedInstanceReplicationRequest;
import com.huaweicloud.sdk.sdrs.v1.model.DetachProtectedInstanceReplicationResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ExpandReplicationRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ExpandReplicationResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListActiveActiveDomainsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListActiveActiveDomainsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListDisasterRecoveryDrillsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListDisasterRecoveryDrillsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListFailureJobsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListFailureJobsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectedInstanceTagsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectedInstanceTagsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectedInstancesByTagsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectedInstancesByTagsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectedInstancesProjectTagsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectedInstancesProjectTagsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectedInstancesRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectedInstancesResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectionGroupsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListProtectionGroupsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListReplicationsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListReplicationsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ListRpoStatisticsRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ListRpoStatisticsResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ResizeProtectedInstanceRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ResizeProtectedInstanceResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ShowDisasterRecoveryDrillRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ShowDisasterRecoveryDrillResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ShowProtectedInstanceRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ShowProtectedInstanceResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ShowProtectionGroupRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ShowProtectionGroupResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ShowReplicationRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ShowReplicationResponse;
import com.huaweicloud.sdk.sdrs.v1.model.ShowSpecifiedApiVersionRequest;
import com.huaweicloud.sdk.sdrs.v1.model.ShowSpecifiedApiVersionResponse;
import com.huaweicloud.sdk.sdrs.v1.model.StartFailoverProtectionGroupRequest;
import com.huaweicloud.sdk.sdrs.v1.model.StartFailoverProtectionGroupResponse;
import com.huaweicloud.sdk.sdrs.v1.model.StartProtectionGroupRequest;
import com.huaweicloud.sdk.sdrs.v1.model.StartProtectionGroupResponse;
import com.huaweicloud.sdk.sdrs.v1.model.StartReverseProtectionGroupRequest;
import com.huaweicloud.sdk.sdrs.v1.model.StartReverseProtectionGroupResponse;
import com.huaweicloud.sdk.sdrs.v1.model.StopProtectionGroupRequest;
import com.huaweicloud.sdk.sdrs.v1.model.StopProtectionGroupResponse;
import com.huaweicloud.sdk.sdrs.v1.model.UpdateDisasterRecoveryDrillNameRequest;
import com.huaweicloud.sdk.sdrs.v1.model.UpdateDisasterRecoveryDrillNameResponse;
import com.huaweicloud.sdk.sdrs.v1.model.UpdateProtectedInstanceNameRequest;
import com.huaweicloud.sdk.sdrs.v1.model.UpdateProtectedInstanceNameResponse;
import com.huaweicloud.sdk.sdrs.v1.model.UpdateProtectionGroupNameRequest;
import com.huaweicloud.sdk.sdrs.v1.model.UpdateProtectionGroupNameResponse;
import com.huaweicloud.sdk.sdrs.v1.model.UpdateReplicationNameRequest;
import com.huaweicloud.sdk.sdrs.v1.model.UpdateReplicationNameResponse;

public class SdrsClient {

    protected HcClient hcClient;

    public SdrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SdrsClient> newBuilder() {
        ClientBuilder<SdrsClient> clientBuilder = new ClientBuilder<>(SdrsClient::new);
        return clientBuilder;
    }

    /**
     * 保护实例添加网卡
     *
     * 给指定的保护实例添加网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectedInstanceNicRequest 请求对象
     * @return AddProtectedInstanceNicResponse
     */
    public AddProtectedInstanceNicResponse addProtectedInstanceNic(AddProtectedInstanceNicRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.addProtectedInstanceNic);
    }

    /**
     * 保护实例添加网卡
     *
     * 给指定的保护实例添加网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectedInstanceNicRequest 请求对象
     * @return SyncInvoker<AddProtectedInstanceNicRequest, AddProtectedInstanceNicResponse>
     */
    public SyncInvoker<AddProtectedInstanceNicRequest, AddProtectedInstanceNicResponse> addProtectedInstanceNicInvoker(
        AddProtectedInstanceNicRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.addProtectedInstanceNic, hcClient);
    }

    /**
     * 添加保护实例标签
     *
     * 一个保护实例上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectedInstanceTagsRequest 请求对象
     * @return AddProtectedInstanceTagsResponse
     */
    public AddProtectedInstanceTagsResponse addProtectedInstanceTags(AddProtectedInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.addProtectedInstanceTags);
    }

    /**
     * 添加保护实例标签
     *
     * 一个保护实例上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectedInstanceTagsRequest 请求对象
     * @return SyncInvoker<AddProtectedInstanceTagsRequest, AddProtectedInstanceTagsResponse>
     */
    public SyncInvoker<AddProtectedInstanceTagsRequest, AddProtectedInstanceTagsResponse> addProtectedInstanceTagsInvoker(
        AddProtectedInstanceTagsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.addProtectedInstanceTags, hcClient);
    }

    /**
     * 保护实例挂载复制对
     *
     * 将指定的复制对挂载到指定的保护实例上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachProtectedInstanceReplicationRequest 请求对象
     * @return AttachProtectedInstanceReplicationResponse
     */
    public AttachProtectedInstanceReplicationResponse attachProtectedInstanceReplication(
        AttachProtectedInstanceReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.attachProtectedInstanceReplication);
    }

    /**
     * 保护实例挂载复制对
     *
     * 将指定的复制对挂载到指定的保护实例上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachProtectedInstanceReplicationRequest 请求对象
     * @return SyncInvoker<AttachProtectedInstanceReplicationRequest, AttachProtectedInstanceReplicationResponse>
     */
    public SyncInvoker<AttachProtectedInstanceReplicationRequest, AttachProtectedInstanceReplicationResponse> attachProtectedInstanceReplicationInvoker(
        AttachProtectedInstanceReplicationRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.attachProtectedInstanceReplication, hcClient);
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
     * @param request BatchAddTagsRequest 请求对象
     * @return BatchAddTagsResponse
     */
    public BatchAddTagsResponse batchAddTags(BatchAddTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.batchAddTags);
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
     * @param request BatchAddTagsRequest 请求对象
     * @return SyncInvoker<BatchAddTagsRequest, BatchAddTagsResponse>
     */
    public SyncInvoker<BatchAddTagsRequest, BatchAddTagsResponse> batchAddTagsInvoker(BatchAddTagsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.batchAddTags, hcClient);
    }

    /**
     * 批量创建保护实例
     *
     * 典型场景：没有特殊操作场景
     * 接口功能：批量创建保护实例。保护实例创建完成后，系统默认容灾站点云服务器名称与生产站点云服务器名称相同，但ID不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedInstancesRequest 请求对象
     * @return BatchCreateProtectedInstancesResponse
     */
    public BatchCreateProtectedInstancesResponse batchCreateProtectedInstances(
        BatchCreateProtectedInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.batchCreateProtectedInstances);
    }

    /**
     * 批量创建保护实例
     *
     * 典型场景：没有特殊操作场景
     * 接口功能：批量创建保护实例。保护实例创建完成后，系统默认容灾站点云服务器名称与生产站点云服务器名称相同，但ID不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedInstancesRequest 请求对象
     * @return SyncInvoker<BatchCreateProtectedInstancesRequest, BatchCreateProtectedInstancesResponse>
     */
    public SyncInvoker<BatchCreateProtectedInstancesRequest, BatchCreateProtectedInstancesResponse> batchCreateProtectedInstancesInvoker(
        BatchCreateProtectedInstancesRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.batchCreateProtectedInstances, hcClient);
    }

    /**
     * 批量删除保护实例
     *
     * 典型场景：没有特殊操作场景
     * 接口功能：批量删除保护实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedInstancesRequest 请求对象
     * @return BatchDeleteProtectedInstancesResponse
     */
    public BatchDeleteProtectedInstancesResponse batchDeleteProtectedInstances(
        BatchDeleteProtectedInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.batchDeleteProtectedInstances);
    }

    /**
     * 批量删除保护实例
     *
     * 典型场景：没有特殊操作场景
     * 接口功能：批量删除保护实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedInstancesRequest 请求对象
     * @return SyncInvoker<BatchDeleteProtectedInstancesRequest, BatchDeleteProtectedInstancesResponse>
     */
    public SyncInvoker<BatchDeleteProtectedInstancesRequest, BatchDeleteProtectedInstancesResponse> batchDeleteProtectedInstancesInvoker(
        BatchDeleteProtectedInstancesRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.batchDeleteProtectedInstances, hcClient);
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
     * @param request BatchDeleteTagsRequest 请求对象
     * @return BatchDeleteTagsResponse
     */
    public BatchDeleteTagsResponse batchDeleteTags(BatchDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.batchDeleteTags);
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
     * @param request BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.batchDeleteTags, hcClient);
    }

    /**
     * 创建容灾演练
     *
     * 创建容灾演练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDisasterRecoveryDrillRequest 请求对象
     * @return CreateDisasterRecoveryDrillResponse
     */
    public CreateDisasterRecoveryDrillResponse createDisasterRecoveryDrill(CreateDisasterRecoveryDrillRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.createDisasterRecoveryDrill);
    }

    /**
     * 创建容灾演练
     *
     * 创建容灾演练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDisasterRecoveryDrillRequest 请求对象
     * @return SyncInvoker<CreateDisasterRecoveryDrillRequest, CreateDisasterRecoveryDrillResponse>
     */
    public SyncInvoker<CreateDisasterRecoveryDrillRequest, CreateDisasterRecoveryDrillResponse> createDisasterRecoveryDrillInvoker(
        CreateDisasterRecoveryDrillRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.createDisasterRecoveryDrill, hcClient);
    }

    /**
     * 创建保护实例
     *
     * 创建保护实例。保护实例创建完成后，系统默认容灾站点云服务器名称与生产站点云服务器名称相同，但ID不同。如果需要修改云服务器名称，请在保护实例详情页面单击云服务器名称，进入云服务器详情页面进行修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProtectedInstanceRequest 请求对象
     * @return CreateProtectedInstanceResponse
     */
    public CreateProtectedInstanceResponse createProtectedInstance(CreateProtectedInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.createProtectedInstance);
    }

    /**
     * 创建保护实例
     *
     * 创建保护实例。保护实例创建完成后，系统默认容灾站点云服务器名称与生产站点云服务器名称相同，但ID不同。如果需要修改云服务器名称，请在保护实例详情页面单击云服务器名称，进入云服务器详情页面进行修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProtectedInstanceRequest 请求对象
     * @return SyncInvoker<CreateProtectedInstanceRequest, CreateProtectedInstanceResponse>
     */
    public SyncInvoker<CreateProtectedInstanceRequest, CreateProtectedInstanceResponse> createProtectedInstanceInvoker(
        CreateProtectedInstanceRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.createProtectedInstance, hcClient);
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
     * @param request CreateProtectionGroupRequest 请求对象
     * @return CreateProtectionGroupResponse
     */
    public CreateProtectionGroupResponse createProtectionGroup(CreateProtectionGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.createProtectionGroup);
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
     * @param request CreateProtectionGroupRequest 请求对象
     * @return SyncInvoker<CreateProtectionGroupRequest, CreateProtectionGroupResponse>
     */
    public SyncInvoker<CreateProtectionGroupRequest, CreateProtectionGroupResponse> createProtectionGroupInvoker(
        CreateProtectionGroupRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.createProtectionGroup, hcClient);
    }

    /**
     * 创建复制对
     *
     * 创建复制对，并将其添加到指定的保护组中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReplicationRequest 请求对象
     * @return CreateReplicationResponse
     */
    public CreateReplicationResponse createReplication(CreateReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.createReplication);
    }

    /**
     * 创建复制对
     *
     * 创建复制对，并将其添加到指定的保护组中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReplicationRequest 请求对象
     * @return SyncInvoker<CreateReplicationRequest, CreateReplicationResponse>
     */
    public SyncInvoker<CreateReplicationRequest, CreateReplicationResponse> createReplicationInvoker(
        CreateReplicationRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.createReplication, hcClient);
    }

    /**
     * 删除所有保护组失败任务
     *
     * 删除所有保护组层级的失败任务，创建、删除保护组失败等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAllServerGroupFailureJobsRequest 请求对象
     * @return DeleteAllServerGroupFailureJobsResponse
     */
    public DeleteAllServerGroupFailureJobsResponse deleteAllServerGroupFailureJobs(
        DeleteAllServerGroupFailureJobsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteAllServerGroupFailureJobs);
    }

    /**
     * 删除所有保护组失败任务
     *
     * 删除所有保护组层级的失败任务，创建、删除保护组失败等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAllServerGroupFailureJobsRequest 请求对象
     * @return SyncInvoker<DeleteAllServerGroupFailureJobsRequest, DeleteAllServerGroupFailureJobsResponse>
     */
    public SyncInvoker<DeleteAllServerGroupFailureJobsRequest, DeleteAllServerGroupFailureJobsResponse> deleteAllServerGroupFailureJobsInvoker(
        DeleteAllServerGroupFailureJobsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteAllServerGroupFailureJobs, hcClient);
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
     * @param request DeleteDisasterRecoveryDrillRequest 请求对象
     * @return DeleteDisasterRecoveryDrillResponse
     */
    public DeleteDisasterRecoveryDrillResponse deleteDisasterRecoveryDrill(DeleteDisasterRecoveryDrillRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteDisasterRecoveryDrill);
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
     * @param request DeleteDisasterRecoveryDrillRequest 请求对象
     * @return SyncInvoker<DeleteDisasterRecoveryDrillRequest, DeleteDisasterRecoveryDrillResponse>
     */
    public SyncInvoker<DeleteDisasterRecoveryDrillRequest, DeleteDisasterRecoveryDrillResponse> deleteDisasterRecoveryDrillInvoker(
        DeleteDisasterRecoveryDrillRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteDisasterRecoveryDrill, hcClient);
    }

    /**
     * 删除单个失败任务
     *
     * 删除单个失败任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFailureJobRequest 请求对象
     * @return DeleteFailureJobResponse
     */
    public DeleteFailureJobResponse deleteFailureJob(DeleteFailureJobRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteFailureJob);
    }

    /**
     * 删除单个失败任务
     *
     * 删除单个失败任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFailureJobRequest 请求对象
     * @return SyncInvoker<DeleteFailureJobRequest, DeleteFailureJobResponse>
     */
    public SyncInvoker<DeleteFailureJobRequest, DeleteFailureJobResponse> deleteFailureJobInvoker(
        DeleteFailureJobRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteFailureJob, hcClient);
    }

    /**
     * 删除保护实例
     *
     * 删除指定的保护实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedInstanceRequest 请求对象
     * @return DeleteProtectedInstanceResponse
     */
    public DeleteProtectedInstanceResponse deleteProtectedInstance(DeleteProtectedInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteProtectedInstance);
    }

    /**
     * 删除保护实例
     *
     * 删除指定的保护实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedInstanceRequest 请求对象
     * @return SyncInvoker<DeleteProtectedInstanceRequest, DeleteProtectedInstanceResponse>
     */
    public SyncInvoker<DeleteProtectedInstanceRequest, DeleteProtectedInstanceResponse> deleteProtectedInstanceInvoker(
        DeleteProtectedInstanceRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteProtectedInstance, hcClient);
    }

    /**
     * 保护实例删除网卡
     *
     * 删除指定保护实例的指定网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedInstanceNicRequest 请求对象
     * @return DeleteProtectedInstanceNicResponse
     */
    public DeleteProtectedInstanceNicResponse deleteProtectedInstanceNic(DeleteProtectedInstanceNicRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteProtectedInstanceNic);
    }

    /**
     * 保护实例删除网卡
     *
     * 删除指定保护实例的指定网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedInstanceNicRequest 请求对象
     * @return SyncInvoker<DeleteProtectedInstanceNicRequest, DeleteProtectedInstanceNicResponse>
     */
    public SyncInvoker<DeleteProtectedInstanceNicRequest, DeleteProtectedInstanceNicResponse> deleteProtectedInstanceNicInvoker(
        DeleteProtectedInstanceNicRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteProtectedInstanceNic, hcClient);
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
     * @param request DeleteProtectedInstanceTagRequest 请求对象
     * @return DeleteProtectedInstanceTagResponse
     */
    public DeleteProtectedInstanceTagResponse deleteProtectedInstanceTag(DeleteProtectedInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteProtectedInstanceTag);
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
     * @param request DeleteProtectedInstanceTagRequest 请求对象
     * @return SyncInvoker<DeleteProtectedInstanceTagRequest, DeleteProtectedInstanceTagResponse>
     */
    public SyncInvoker<DeleteProtectedInstanceTagRequest, DeleteProtectedInstanceTagResponse> deleteProtectedInstanceTagInvoker(
        DeleteProtectedInstanceTagRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteProtectedInstanceTag, hcClient);
    }

    /**
     * 删除保护组
     *
     * 删除指定的保护组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectionGroupRequest 请求对象
     * @return DeleteProtectionGroupResponse
     */
    public DeleteProtectionGroupResponse deleteProtectionGroup(DeleteProtectionGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteProtectionGroup);
    }

    /**
     * 删除保护组
     *
     * 删除指定的保护组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectionGroupRequest 请求对象
     * @return SyncInvoker<DeleteProtectionGroupRequest, DeleteProtectionGroupResponse>
     */
    public SyncInvoker<DeleteProtectionGroupRequest, DeleteProtectionGroupResponse> deleteProtectionGroupInvoker(
        DeleteProtectionGroupRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteProtectionGroup, hcClient);
    }

    /**
     * 删除复制对
     *
     * 删除指定的复制对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReplicationRequest 请求对象
     * @return DeleteReplicationResponse
     */
    public DeleteReplicationResponse deleteReplication(DeleteReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteReplication);
    }

    /**
     * 删除复制对
     *
     * 删除指定的复制对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReplicationRequest 请求对象
     * @return SyncInvoker<DeleteReplicationRequest, DeleteReplicationResponse>
     */
    public SyncInvoker<DeleteReplicationRequest, DeleteReplicationResponse> deleteReplicationInvoker(
        DeleteReplicationRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteReplication, hcClient);
    }

    /**
     * 删除指定保护组内的所有失败任务
     *
     * 删除指定保护组内的所有失败任务，创建保护实例失败、创建复制对失败、删除保护实例失败、删除复制对失败等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupFailureJobsRequest 请求对象
     * @return DeleteServerGroupFailureJobsResponse
     */
    public DeleteServerGroupFailureJobsResponse deleteServerGroupFailureJobs(
        DeleteServerGroupFailureJobsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.deleteServerGroupFailureJobs);
    }

    /**
     * 删除指定保护组内的所有失败任务
     *
     * 删除指定保护组内的所有失败任务，创建保护实例失败、创建复制对失败、删除保护实例失败、删除复制对失败等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupFailureJobsRequest 请求对象
     * @return SyncInvoker<DeleteServerGroupFailureJobsRequest, DeleteServerGroupFailureJobsResponse>
     */
    public SyncInvoker<DeleteServerGroupFailureJobsRequest, DeleteServerGroupFailureJobsResponse> deleteServerGroupFailureJobsInvoker(
        DeleteServerGroupFailureJobsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.deleteServerGroupFailureJobs, hcClient);
    }

    /**
     * 保护实例卸载复制对
     *
     * 将指定的复制对从指定的保护实例上卸载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachProtectedInstanceReplicationRequest 请求对象
     * @return DetachProtectedInstanceReplicationResponse
     */
    public DetachProtectedInstanceReplicationResponse detachProtectedInstanceReplication(
        DetachProtectedInstanceReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.detachProtectedInstanceReplication);
    }

    /**
     * 保护实例卸载复制对
     *
     * 将指定的复制对从指定的保护实例上卸载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachProtectedInstanceReplicationRequest 请求对象
     * @return SyncInvoker<DetachProtectedInstanceReplicationRequest, DetachProtectedInstanceReplicationResponse>
     */
    public SyncInvoker<DetachProtectedInstanceReplicationRequest, DetachProtectedInstanceReplicationResponse> detachProtectedInstanceReplicationInvoker(
        DetachProtectedInstanceReplicationRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.detachProtectedInstanceReplication, hcClient);
    }

    /**
     * 复制对扩容
     *
     * 对复制对包含的两个磁盘进行扩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandReplicationRequest 请求对象
     * @return ExpandReplicationResponse
     */
    public ExpandReplicationResponse expandReplication(ExpandReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.expandReplication);
    }

    /**
     * 复制对扩容
     *
     * 对复制对包含的两个磁盘进行扩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandReplicationRequest 请求对象
     * @return SyncInvoker<ExpandReplicationRequest, ExpandReplicationResponse>
     */
    public SyncInvoker<ExpandReplicationRequest, ExpandReplicationResponse> expandReplicationInvoker(
        ExpandReplicationRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.expandReplication, hcClient);
    }

    /**
     * 查询双活域
     *
     * 查询双活域。双活域由本端存储设备、远端存储设备组成，通过双活域，应用服务器可以实现跨站点的数据访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveActiveDomainsRequest 请求对象
     * @return ListActiveActiveDomainsResponse
     */
    public ListActiveActiveDomainsResponse listActiveActiveDomains(ListActiveActiveDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listActiveActiveDomains);
    }

    /**
     * 查询双活域
     *
     * 查询双活域。双活域由本端存储设备、远端存储设备组成，通过双活域，应用服务器可以实现跨站点的数据访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveActiveDomainsRequest 请求对象
     * @return SyncInvoker<ListActiveActiveDomainsRequest, ListActiveActiveDomainsResponse>
     */
    public SyncInvoker<ListActiveActiveDomainsRequest, ListActiveActiveDomainsResponse> listActiveActiveDomainsInvoker(
        ListActiveActiveDomainsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listActiveActiveDomains, hcClient);
    }

    /**
     * 查询容灾演练列表
     *
     * 查询指定保护组下的所有容灾演练列表，当未指定保护组时查询当前租户下的所有容灾演练列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDisasterRecoveryDrillsRequest 请求对象
     * @return ListDisasterRecoveryDrillsResponse
     */
    public ListDisasterRecoveryDrillsResponse listDisasterRecoveryDrills(ListDisasterRecoveryDrillsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listDisasterRecoveryDrills);
    }

    /**
     * 查询容灾演练列表
     *
     * 查询指定保护组下的所有容灾演练列表，当未指定保护组时查询当前租户下的所有容灾演练列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDisasterRecoveryDrillsRequest 请求对象
     * @return SyncInvoker<ListDisasterRecoveryDrillsRequest, ListDisasterRecoveryDrillsResponse>
     */
    public SyncInvoker<ListDisasterRecoveryDrillsRequest, ListDisasterRecoveryDrillsResponse> listDisasterRecoveryDrillsInvoker(
        ListDisasterRecoveryDrillsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listDisasterRecoveryDrills, hcClient);
    }

    /**
     * 查询失败任务列表
     *
     * 查询所有保护组失败任务列表或者指定保护组下的所有失败任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFailureJobsRequest 请求对象
     * @return ListFailureJobsResponse
     */
    public ListFailureJobsResponse listFailureJobs(ListFailureJobsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listFailureJobs);
    }

    /**
     * 查询失败任务列表
     *
     * 查询所有保护组失败任务列表或者指定保护组下的所有失败任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFailureJobsRequest 请求对象
     * @return SyncInvoker<ListFailureJobsRequest, ListFailureJobsResponse>
     */
    public SyncInvoker<ListFailureJobsRequest, ListFailureJobsResponse> listFailureJobsInvoker(
        ListFailureJobsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listFailureJobs, hcClient);
    }

    /**
     * 查询保护实例标签
     *
     * 查询指定保护实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedInstanceTagsRequest 请求对象
     * @return ListProtectedInstanceTagsResponse
     */
    public ListProtectedInstanceTagsResponse listProtectedInstanceTags(ListProtectedInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listProtectedInstanceTags);
    }

    /**
     * 查询保护实例标签
     *
     * 查询指定保护实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListProtectedInstanceTagsRequest, ListProtectedInstanceTagsResponse>
     */
    public SyncInvoker<ListProtectedInstanceTagsRequest, ListProtectedInstanceTagsResponse> listProtectedInstanceTagsInvoker(
        ListProtectedInstanceTagsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listProtectedInstanceTags, hcClient);
    }

    /**
     * 查询保护实例列表
     *
     * 查询当前租户下的所有保护实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedInstancesRequest 请求对象
     * @return ListProtectedInstancesResponse
     */
    public ListProtectedInstancesResponse listProtectedInstances(ListProtectedInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listProtectedInstances);
    }

    /**
     * 查询保护实例列表
     *
     * 查询当前租户下的所有保护实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedInstancesRequest 请求对象
     * @return SyncInvoker<ListProtectedInstancesRequest, ListProtectedInstancesResponse>
     */
    public SyncInvoker<ListProtectedInstancesRequest, ListProtectedInstancesResponse> listProtectedInstancesInvoker(
        ListProtectedInstancesRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listProtectedInstances, hcClient);
    }

    /**
     * 通过标签查询保护实例
     *
     * 使用标签过滤保护实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedInstancesByTagsRequest 请求对象
     * @return ListProtectedInstancesByTagsResponse
     */
    public ListProtectedInstancesByTagsResponse listProtectedInstancesByTags(
        ListProtectedInstancesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listProtectedInstancesByTags);
    }

    /**
     * 通过标签查询保护实例
     *
     * 使用标签过滤保护实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedInstancesByTagsRequest 请求对象
     * @return SyncInvoker<ListProtectedInstancesByTagsRequest, ListProtectedInstancesByTagsResponse>
     */
    public SyncInvoker<ListProtectedInstancesByTagsRequest, ListProtectedInstancesByTagsResponse> listProtectedInstancesByTagsInvoker(
        ListProtectedInstancesByTagsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listProtectedInstancesByTags, hcClient);
    }

    /**
     * 查询保护实例项目标签
     *
     * 查询租户在指定Project中保护实例的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedInstancesProjectTagsRequest 请求对象
     * @return ListProtectedInstancesProjectTagsResponse
     */
    public ListProtectedInstancesProjectTagsResponse listProtectedInstancesProjectTags(
        ListProtectedInstancesProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listProtectedInstancesProjectTags);
    }

    /**
     * 查询保护实例项目标签
     *
     * 查询租户在指定Project中保护实例的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedInstancesProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProtectedInstancesProjectTagsRequest, ListProtectedInstancesProjectTagsResponse>
     */
    public SyncInvoker<ListProtectedInstancesProjectTagsRequest, ListProtectedInstancesProjectTagsResponse> listProtectedInstancesProjectTagsInvoker(
        ListProtectedInstancesProjectTagsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listProtectedInstancesProjectTags, hcClient);
    }

    /**
     * 查询保护组列表
     *
     * 查询当前租户所有的保护组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionGroupsRequest 请求对象
     * @return ListProtectionGroupsResponse
     */
    public ListProtectionGroupsResponse listProtectionGroups(ListProtectionGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listProtectionGroups);
    }

    /**
     * 查询保护组列表
     *
     * 查询当前租户所有的保护组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionGroupsRequest 请求对象
     * @return SyncInvoker<ListProtectionGroupsRequest, ListProtectionGroupsResponse>
     */
    public SyncInvoker<ListProtectionGroupsRequest, ListProtectionGroupsResponse> listProtectionGroupsInvoker(
        ListProtectionGroupsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listProtectionGroups, hcClient);
    }

    /**
     * 查询复制对列表
     *
     * 查询指定保护组下的所有复制对列表，如果不给定指定保护组则查询当前租户下的所有复制对列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReplicationsRequest 请求对象
     * @return ListReplicationsResponse
     */
    public ListReplicationsResponse listReplications(ListReplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listReplications);
    }

    /**
     * 查询复制对列表
     *
     * 查询指定保护组下的所有复制对列表，如果不给定指定保护组则查询当前租户下的所有复制对列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReplicationsRequest 请求对象
     * @return SyncInvoker<ListReplicationsRequest, ListReplicationsResponse>
     */
    public SyncInvoker<ListReplicationsRequest, ListReplicationsResponse> listReplicationsInvoker(
        ListReplicationsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listReplications, hcClient);
    }

    /**
     * 查询资源的RPO超标趋势记录列表
     *
     * 查询当前租户大屏显示中，资源的RPO超标趋势记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRpoStatisticsRequest 请求对象
     * @return ListRpoStatisticsResponse
     */
    public ListRpoStatisticsResponse listRpoStatistics(ListRpoStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listRpoStatistics);
    }

    /**
     * 查询资源的RPO超标趋势记录列表
     *
     * 查询当前租户大屏显示中，资源的RPO超标趋势记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRpoStatisticsRequest 请求对象
     * @return SyncInvoker<ListRpoStatisticsRequest, ListRpoStatisticsResponse>
     */
    public SyncInvoker<ListRpoStatisticsRequest, ListRpoStatisticsResponse> listRpoStatisticsInvoker(
        ListRpoStatisticsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listRpoStatistics, hcClient);
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
     * @param request ResizeProtectedInstanceRequest 请求对象
     * @return ResizeProtectedInstanceResponse
     */
    public ResizeProtectedInstanceResponse resizeProtectedInstance(ResizeProtectedInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.resizeProtectedInstance);
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
     * @param request ResizeProtectedInstanceRequest 请求对象
     * @return SyncInvoker<ResizeProtectedInstanceRequest, ResizeProtectedInstanceResponse>
     */
    public SyncInvoker<ResizeProtectedInstanceRequest, ResizeProtectedInstanceResponse> resizeProtectedInstanceInvoker(
        ResizeProtectedInstanceRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.resizeProtectedInstance, hcClient);
    }

    /**
     * 查询单个容灾演练详情
     *
     * 查询单个容灾演练的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterRecoveryDrillRequest 请求对象
     * @return ShowDisasterRecoveryDrillResponse
     */
    public ShowDisasterRecoveryDrillResponse showDisasterRecoveryDrill(ShowDisasterRecoveryDrillRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.showDisasterRecoveryDrill);
    }

    /**
     * 查询单个容灾演练详情
     *
     * 查询单个容灾演练的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterRecoveryDrillRequest 请求对象
     * @return SyncInvoker<ShowDisasterRecoveryDrillRequest, ShowDisasterRecoveryDrillResponse>
     */
    public SyncInvoker<ShowDisasterRecoveryDrillRequest, ShowDisasterRecoveryDrillResponse> showDisasterRecoveryDrillInvoker(
        ShowDisasterRecoveryDrillRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.showDisasterRecoveryDrill, hcClient);
    }

    /**
     * 查询单个保护实例详情
     *
     * 查询单个保护实例的详细信息，如名称、ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedInstanceRequest 请求对象
     * @return ShowProtectedInstanceResponse
     */
    public ShowProtectedInstanceResponse showProtectedInstance(ShowProtectedInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.showProtectedInstance);
    }

    /**
     * 查询单个保护实例详情
     *
     * 查询单个保护实例的详细信息，如名称、ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedInstanceRequest 请求对象
     * @return SyncInvoker<ShowProtectedInstanceRequest, ShowProtectedInstanceResponse>
     */
    public SyncInvoker<ShowProtectedInstanceRequest, ShowProtectedInstanceResponse> showProtectedInstanceInvoker(
        ShowProtectedInstanceRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.showProtectedInstance, hcClient);
    }

    /**
     * 查询保护组详情
     *
     * 查询单个保护组的详细信息，如ID、名称等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectionGroupRequest 请求对象
     * @return ShowProtectionGroupResponse
     */
    public ShowProtectionGroupResponse showProtectionGroup(ShowProtectionGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.showProtectionGroup);
    }

    /**
     * 查询保护组详情
     *
     * 查询单个保护组的详细信息，如ID、名称等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectionGroupRequest 请求对象
     * @return SyncInvoker<ShowProtectionGroupRequest, ShowProtectionGroupResponse>
     */
    public SyncInvoker<ShowProtectionGroupRequest, ShowProtectionGroupResponse> showProtectionGroupInvoker(
        ShowProtectionGroupRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.showProtectionGroup, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询资源的配额相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.showQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询资源的配额相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.showQuota, hcClient);
    }

    /**
     * 查询单个复制对详情
     *
     * 查询单个复制对的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationRequest 请求对象
     * @return ShowReplicationResponse
     */
    public ShowReplicationResponse showReplication(ShowReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.showReplication);
    }

    /**
     * 查询单个复制对详情
     *
     * 查询单个复制对的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationRequest 请求对象
     * @return SyncInvoker<ShowReplicationRequest, ShowReplicationResponse>
     */
    public SyncInvoker<ShowReplicationRequest, ShowReplicationResponse> showReplicationInvoker(
        ShowReplicationRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.showReplication, hcClient);
    }

    /**
     * 保护组故障切换
     *
     * 当保护组的生产站点发生故障时，将保护组的生产站点切到当前的容灾站点，即另一端AZ，启用当前容灾站点的云硬盘以及云服务器等资源。
     * 故障切换完成之后，保护组的当前生产站点变成故障切换发生之前的容灾站点，且生产站点和容灾站点之间的数据已停止保护，必须调用5.4.6-保护组开启保护/重保护接口成功后，两端的数据才会重新被保护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartFailoverProtectionGroupRequest 请求对象
     * @return StartFailoverProtectionGroupResponse
     */
    public StartFailoverProtectionGroupResponse startFailoverProtectionGroup(
        StartFailoverProtectionGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.startFailoverProtectionGroup);
    }

    /**
     * 保护组故障切换
     *
     * 当保护组的生产站点发生故障时，将保护组的生产站点切到当前的容灾站点，即另一端AZ，启用当前容灾站点的云硬盘以及云服务器等资源。
     * 故障切换完成之后，保护组的当前生产站点变成故障切换发生之前的容灾站点，且生产站点和容灾站点之间的数据已停止保护，必须调用5.4.6-保护组开启保护/重保护接口成功后，两端的数据才会重新被保护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartFailoverProtectionGroupRequest 请求对象
     * @return SyncInvoker<StartFailoverProtectionGroupRequest, StartFailoverProtectionGroupResponse>
     */
    public SyncInvoker<StartFailoverProtectionGroupRequest, StartFailoverProtectionGroupResponse> startFailoverProtectionGroupInvoker(
        StartFailoverProtectionGroupRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.startFailoverProtectionGroup, hcClient);
    }

    /**
     * 保护组开启保护/重保护
     *
     * 对某一个保护组的“开启保护”或“重保护”操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartProtectionGroupRequest 请求对象
     * @return StartProtectionGroupResponse
     */
    public StartProtectionGroupResponse startProtectionGroup(StartProtectionGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.startProtectionGroup);
    }

    /**
     * 保护组开启保护/重保护
     *
     * 对某一个保护组的“开启保护”或“重保护”操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartProtectionGroupRequest 请求对象
     * @return SyncInvoker<StartProtectionGroupRequest, StartProtectionGroupResponse>
     */
    public SyncInvoker<StartProtectionGroupRequest, StartProtectionGroupResponse> startProtectionGroupInvoker(
        StartProtectionGroupRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.startProtectionGroup, hcClient);
    }

    /**
     * 保护组切换
     *
     * 对保护组进行切换操作，可以将保护组的当前生产站点，从创建保护组时指定的生产站点切换到创建保护组时指定的容灾站点，也可以从创建保护组时指定的容灾站点切换到创建保护组时指定的生产站点。切换后，生产站点和容灾站点的数据仍然处于被保护状态，只是复制方向与操作之前相反。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartReverseProtectionGroupRequest 请求对象
     * @return StartReverseProtectionGroupResponse
     */
    public StartReverseProtectionGroupResponse startReverseProtectionGroup(StartReverseProtectionGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.startReverseProtectionGroup);
    }

    /**
     * 保护组切换
     *
     * 对保护组进行切换操作，可以将保护组的当前生产站点，从创建保护组时指定的生产站点切换到创建保护组时指定的容灾站点，也可以从创建保护组时指定的容灾站点切换到创建保护组时指定的生产站点。切换后，生产站点和容灾站点的数据仍然处于被保护状态，只是复制方向与操作之前相反。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartReverseProtectionGroupRequest 请求对象
     * @return SyncInvoker<StartReverseProtectionGroupRequest, StartReverseProtectionGroupResponse>
     */
    public SyncInvoker<StartReverseProtectionGroupRequest, StartReverseProtectionGroupResponse> startReverseProtectionGroupInvoker(
        StartReverseProtectionGroupRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.startReverseProtectionGroup, hcClient);
    }

    /**
     * 保护组停止保护
     *
     * 对某一个保护组的停止保护操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopProtectionGroupRequest 请求对象
     * @return StopProtectionGroupResponse
     */
    public StopProtectionGroupResponse stopProtectionGroup(StopProtectionGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.stopProtectionGroup);
    }

    /**
     * 保护组停止保护
     *
     * 对某一个保护组的停止保护操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopProtectionGroupRequest 请求对象
     * @return SyncInvoker<StopProtectionGroupRequest, StopProtectionGroupResponse>
     */
    public SyncInvoker<StopProtectionGroupRequest, StopProtectionGroupResponse> stopProtectionGroupInvoker(
        StopProtectionGroupRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.stopProtectionGroup, hcClient);
    }

    /**
     * 更新容灾演练名称
     *
     * 更新容灾演练的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDisasterRecoveryDrillNameRequest 请求对象
     * @return UpdateDisasterRecoveryDrillNameResponse
     */
    public UpdateDisasterRecoveryDrillNameResponse updateDisasterRecoveryDrillName(
        UpdateDisasterRecoveryDrillNameRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.updateDisasterRecoveryDrillName);
    }

    /**
     * 更新容灾演练名称
     *
     * 更新容灾演练的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDisasterRecoveryDrillNameRequest 请求对象
     * @return SyncInvoker<UpdateDisasterRecoveryDrillNameRequest, UpdateDisasterRecoveryDrillNameResponse>
     */
    public SyncInvoker<UpdateDisasterRecoveryDrillNameRequest, UpdateDisasterRecoveryDrillNameResponse> updateDisasterRecoveryDrillNameInvoker(
        UpdateDisasterRecoveryDrillNameRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.updateDisasterRecoveryDrillName, hcClient);
    }

    /**
     * 更新保护实例名称
     *
     * 更新某一个保护实例的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedInstanceNameRequest 请求对象
     * @return UpdateProtectedInstanceNameResponse
     */
    public UpdateProtectedInstanceNameResponse updateProtectedInstanceName(UpdateProtectedInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.updateProtectedInstanceName);
    }

    /**
     * 更新保护实例名称
     *
     * 更新某一个保护实例的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateProtectedInstanceNameRequest, UpdateProtectedInstanceNameResponse>
     */
    public SyncInvoker<UpdateProtectedInstanceNameRequest, UpdateProtectedInstanceNameResponse> updateProtectedInstanceNameInvoker(
        UpdateProtectedInstanceNameRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.updateProtectedInstanceName, hcClient);
    }

    /**
     * 更新保护组名称
     *
     * 更新某一个保护组的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectionGroupNameRequest 请求对象
     * @return UpdateProtectionGroupNameResponse
     */
    public UpdateProtectionGroupNameResponse updateProtectionGroupName(UpdateProtectionGroupNameRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.updateProtectionGroupName);
    }

    /**
     * 更新保护组名称
     *
     * 更新某一个保护组的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectionGroupNameRequest 请求对象
     * @return SyncInvoker<UpdateProtectionGroupNameRequest, UpdateProtectionGroupNameResponse>
     */
    public SyncInvoker<UpdateProtectionGroupNameRequest, UpdateProtectionGroupNameResponse> updateProtectionGroupNameInvoker(
        UpdateProtectionGroupNameRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.updateProtectionGroupName, hcClient);
    }

    /**
     * 更新复制对名称
     *
     * 更新复制对名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReplicationNameRequest 请求对象
     * @return UpdateReplicationNameResponse
     */
    public UpdateReplicationNameResponse updateReplicationName(UpdateReplicationNameRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.updateReplicationName);
    }

    /**
     * 更新复制对名称
     *
     * 更新复制对名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReplicationNameRequest 请求对象
     * @return SyncInvoker<UpdateReplicationNameRequest, UpdateReplicationNameResponse>
     */
    public SyncInvoker<UpdateReplicationNameRequest, UpdateReplicationNameResponse> updateReplicationNameInvoker(
        UpdateReplicationNameRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.updateReplicationName, hcClient);
    }

    /**
     * 查询API版本信息
     *
     * 查询存储容灾当前所有可用的版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.listApiVersions);
    }

    /**
     * 查询API版本信息
     *
     * 查询存储容灾当前所有可用的版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询存储容灾指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecifiedApiVersionRequest 请求对象
     * @return ShowSpecifiedApiVersionResponse
     */
    public ShowSpecifiedApiVersionResponse showSpecifiedApiVersion(ShowSpecifiedApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.showSpecifiedApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询存储容灾指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecifiedApiVersionRequest 请求对象
     * @return SyncInvoker<ShowSpecifiedApiVersionRequest, ShowSpecifiedApiVersionResponse>
     */
    public SyncInvoker<ShowSpecifiedApiVersionRequest, ShowSpecifiedApiVersionResponse> showSpecifiedApiVersionInvoker(
        ShowSpecifiedApiVersionRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.showSpecifiedApiVersion, hcClient);
    }

    /**
     * 查询job状态
     *
     * 查询job的执行状态。
     * 对于创建保护组、删除保护组、创建保护实例、删除保护实例、创建复制对、删除复制对等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return ShowJobStatusResponse
     */
    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, SdrsMeta.showJobStatus);
    }

    /**
     * 查询job状态
     *
     * 查询job的执行状态。
     * 对于创建保护组、删除保护组、创建保护实例、删除保护实例、创建复制对、删除复制对等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusInvoker(ShowJobStatusRequest request) {
        return new SyncInvoker<>(request, SdrsMeta.showJobStatus, hcClient);
    }

}
