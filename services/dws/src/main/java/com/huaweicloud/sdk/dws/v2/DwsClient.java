package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dws.v2.model.*;

public class DwsClient {

    protected HcClient hcClient;

    public DwsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwsClient> newBuilder() {
        return new ClientBuilder<>(DwsClient::new);
    }

    /**
     * 添加工作负载队列
     *
     * 添加工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddWorkloadQueueRequest 请求对象
     * @return AddWorkloadQueueResponse
     */
    public AddWorkloadQueueResponse addWorkloadQueue(AddWorkloadQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.addWorkloadQueue);
    }

    /**
     * 添加工作负载队列
     *
     * 添加工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddWorkloadQueueRequest 请求对象
     * @return SyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse>
     */
    public SyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse> addWorkloadQueueInvoker(
        AddWorkloadQueueRequest request) {
        return new SyncInvoker<AddWorkloadQueueRequest, AddWorkloadQueueResponse>(request, DwsMeta.addWorkloadQueue,
            hcClient);
    }

    /**
     * 集群绑定EIP
     *
     * 集群绑定Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateEipRequest 请求对象
     * @return AssociateEipResponse
     */
    public AssociateEipResponse associateEip(AssociateEipRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.associateEip);
    }

    /**
     * 集群绑定EIP
     *
     * 集群绑定Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateEipRequest 请求对象
     * @return SyncInvoker<AssociateEipRequest, AssociateEipResponse>
     */
    public SyncInvoker<AssociateEipRequest, AssociateEipResponse> associateEipInvoker(AssociateEipRequest request) {
        return new SyncInvoker<AssociateEipRequest, AssociateEipResponse>(request, DwsMeta.associateEip, hcClient);
    }

    /**
     * 集群绑定ELB
     *
     * 集群绑定Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateElbRequest 请求对象
     * @return AssociateElbResponse
     */
    public AssociateElbResponse associateElb(AssociateElbRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.associateElb);
    }

    /**
     * 集群绑定ELB
     *
     * 集群绑定Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateElbRequest 请求对象
     * @return SyncInvoker<AssociateElbRequest, AssociateElbResponse>
     */
    public SyncInvoker<AssociateElbRequest, AssociateElbResponse> associateElbInvoker(AssociateElbRequest request) {
        return new SyncInvoker<AssociateElbRequest, AssociateElbResponse>(request, DwsMeta.associateElb, hcClient);
    }

    /**
     * 批量增加CN节点
     *
     * 当用户集群创建后，实际需要的CN数量会随着业务需求而发生变化，因此管理CN节点功能的实现使用户可以根据实际需求动态调整集群CN数量。
     * - 增删CN节点过程中不允许执行其他运维操作。
     * - 增删CN节点过程中需要停止业务操作，建议在业务低峰期或业务中断情况下进行操作。
     * - 增删CN节点时发生故障且回滚失败，需要用户登录后台进行处理，处理方案请参见《故障排除》中的“集群使用&gt;增删CN回滚失败”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateClusterCnRequest 请求对象
     * @return BatchCreateClusterCnResponse
     */
    public BatchCreateClusterCnResponse batchCreateClusterCn(BatchCreateClusterCnRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.batchCreateClusterCn);
    }

    /**
     * 批量增加CN节点
     *
     * 当用户集群创建后，实际需要的CN数量会随着业务需求而发生变化，因此管理CN节点功能的实现使用户可以根据实际需求动态调整集群CN数量。
     * - 增删CN节点过程中不允许执行其他运维操作。
     * - 增删CN节点过程中需要停止业务操作，建议在业务低峰期或业务中断情况下进行操作。
     * - 增删CN节点时发生故障且回滚失败，需要用户登录后台进行处理，处理方案请参见《故障排除》中的“集群使用&gt;增删CN回滚失败”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateClusterCnRequest 请求对象
     * @return SyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse>
     */
    public SyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> batchCreateClusterCnInvoker(
        BatchCreateClusterCnRequest request) {
        return new SyncInvoker<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse>(request,
            DwsMeta.batchCreateClusterCn, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 为指定集群批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourceTagRequest 请求对象
     * @return BatchCreateResourceTagResponse
     */
    public BatchCreateResourceTagResponse batchCreateResourceTag(BatchCreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.batchCreateResourceTag);
    }

    /**
     * 批量添加标签
     *
     * 为指定集群批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourceTagRequest 请求对象
     * @return SyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse>
     */
    public SyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> batchCreateResourceTagInvoker(
        BatchCreateResourceTagRequest request) {
        return new SyncInvoker<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse>(request,
            DwsMeta.batchCreateResourceTag, hcClient);
    }

    /**
     * 批量删除CN节点
     *
     * 当用户集群创建后，实际需要的CN数量会随着业务需求而发生变化，因此管理CN节点功能的实现使用户可以根据实际需求动态调整集群CN数量。
     * - 增删CN节点过程中不允许执行其他运维操作。
     * - 增删CN节点过程中需要停止业务操作，建议在业务低峰期或业务中断情况下进行操作。
     * - 增删CN节点时发生故障且回滚失败，需要用户登录后台进行处理，处理方案请参见《故障排除》中的“集群使用&gt;增删CN回滚失败”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteClusterCnRequest 请求对象
     * @return BatchDeleteClusterCnResponse
     */
    public BatchDeleteClusterCnResponse batchDeleteClusterCn(BatchDeleteClusterCnRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.batchDeleteClusterCn);
    }

    /**
     * 批量删除CN节点
     *
     * 当用户集群创建后，实际需要的CN数量会随着业务需求而发生变化，因此管理CN节点功能的实现使用户可以根据实际需求动态调整集群CN数量。
     * - 增删CN节点过程中不允许执行其他运维操作。
     * - 增删CN节点过程中需要停止业务操作，建议在业务低峰期或业务中断情况下进行操作。
     * - 增删CN节点时发生故障且回滚失败，需要用户登录后台进行处理，处理方案请参见《故障排除》中的“集群使用&gt;增删CN回滚失败”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteClusterCnRequest 请求对象
     * @return SyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse>
     */
    public SyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> batchDeleteClusterCnInvoker(
        BatchDeleteClusterCnRequest request) {
        return new SyncInvoker<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse>(request,
            DwsMeta.batchDeleteClusterCn, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 为指定集群批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceTagRequest 请求对象
     * @return BatchDeleteResourceTagResponse
     */
    public BatchDeleteResourceTagResponse batchDeleteResourceTag(BatchDeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.batchDeleteResourceTag);
    }

    /**
     * 批量删除标签
     *
     * 为指定集群批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceTagRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagInvoker(
        BatchDeleteResourceTagRequest request) {
        return new SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>(request,
            DwsMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 解除只读
     *
     * 当集群进入只读状态时，无法进行数据库相关操作，用户可以在管理控制台解除集群的只读状态。触发只读状态可能是由于磁盘使用率过高，因此需要对集群数据进行清理或扩容。
     * - 解除只读支持1.7.2及以上版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelReadonlyClusterRequest 请求对象
     * @return CancelReadonlyClusterResponse
     */
    public CancelReadonlyClusterResponse cancelReadonlyCluster(CancelReadonlyClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.cancelReadonlyCluster);
    }

    /**
     * 解除只读
     *
     * 当集群进入只读状态时，无法进行数据库相关操作，用户可以在管理控制台解除集群的只读状态。触发只读状态可能是由于磁盘使用率过高，因此需要对集群数据进行清理或扩容。
     * - 解除只读支持1.7.2及以上版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelReadonlyClusterRequest 请求对象
     * @return SyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse>
     */
    public SyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> cancelReadonlyClusterInvoker(
        CancelReadonlyClusterRequest request) {
        return new SyncInvoker<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse>(request,
            DwsMeta.cancelReadonlyCluster, hcClient);
    }

    /**
     * 创建集群前检查
     *
     * 创建集群前预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckClusterRequest 请求对象
     * @return CheckClusterResponse
     */
    public CheckClusterResponse checkCluster(CheckClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.checkCluster);
    }

    /**
     * 创建集群前检查
     *
     * 创建集群前预检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckClusterRequest 请求对象
     * @return SyncInvoker<CheckClusterRequest, CheckClusterResponse>
     */
    public SyncInvoker<CheckClusterRequest, CheckClusterResponse> checkClusterInvoker(CheckClusterRequest request) {
        return new SyncInvoker<CheckClusterRequest, CheckClusterResponse>(request, DwsMeta.checkCluster, hcClient);
    }

    /**
     * 复制快照
     *
     * 该接口用于复制一个自动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopySnapshotRequest 请求对象
     * @return CopySnapshotResponse
     */
    public CopySnapshotResponse copySnapshot(CopySnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.copySnapshot);
    }

    /**
     * 复制快照
     *
     * 该接口用于复制一个自动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopySnapshotRequest 请求对象
     * @return SyncInvoker<CopySnapshotRequest, CopySnapshotResponse>
     */
    public SyncInvoker<CopySnapshotRequest, CopySnapshotResponse> copySnapshotInvoker(CopySnapshotRequest request) {
        return new SyncInvoker<CopySnapshotRequest, CopySnapshotResponse>(request, DwsMeta.copySnapshot, hcClient);
    }

    /**
     * 创建告警订阅
     *
     * 创建告警订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlarmSubRequest 请求对象
     * @return CreateAlarmSubResponse
     */
    public CreateAlarmSubResponse createAlarmSub(CreateAlarmSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createAlarmSub);
    }

    /**
     * 创建告警订阅
     *
     * 创建告警订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlarmSubRequest 请求对象
     * @return SyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse>
     */
    public SyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse> createAlarmSubInvoker(
        CreateAlarmSubRequest request) {
        return new SyncInvoker<CreateAlarmSubRequest, CreateAlarmSubResponse>(request, DwsMeta.createAlarmSub,
            hcClient);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 集群必须要运行在VPC之内，创建集群前，您需要先创建VPC，并获取VPC和子网的id。
     * 该接口为异步接口，创建集群需要10～15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 集群必须要运行在VPC之内，创建集群前，您需要先创建VPC，并获取VPC和子网的id。
     * 该接口为异步接口，创建集群需要10～15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, DwsMeta.createCluster, hcClient);
    }

    /**
     * 申请域名
     *
     * 为指定集群申请域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterDnsRequest 请求对象
     * @return CreateClusterDnsResponse
     */
    public CreateClusterDnsResponse createClusterDns(CreateClusterDnsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createClusterDns);
    }

    /**
     * 申请域名
     *
     * 为指定集群申请域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterDnsRequest 请求对象
     * @return SyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse>
     */
    public SyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse> createClusterDnsInvoker(
        CreateClusterDnsRequest request) {
        return new SyncInvoker<CreateClusterDnsRequest, CreateClusterDnsResponse>(request, DwsMeta.createClusterDns,
            hcClient);
    }

    /**
     * 设置资源管理
     *
     * 设置资源管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterWorkloadRequest 请求对象
     * @return CreateClusterWorkloadResponse
     */
    public CreateClusterWorkloadResponse createClusterWorkload(CreateClusterWorkloadRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createClusterWorkload);
    }

    /**
     * 设置资源管理
     *
     * 设置资源管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterWorkloadRequest 请求对象
     * @return SyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse>
     */
    public SyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> createClusterWorkloadInvoker(
        CreateClusterWorkloadRequest request) {
        return new SyncInvoker<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse>(request,
            DwsMeta.createClusterWorkload, hcClient);
    }

    /**
     * 创建数据源
     *
     * 该接口用于创建一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataSourceRequest 请求对象
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createDataSource);
    }

    /**
     * 创建数据源
     *
     * 该接口用于创建一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataSourceRequest 请求对象
     * @return SyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse>
     */
    public SyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse> createDataSourceInvoker(
        CreateDataSourceRequest request) {
        return new SyncInvoker<CreateDataSourceRequest, CreateDataSourceResponse>(request, DwsMeta.createDataSource,
            hcClient);
    }

    /**
     * 创建容灾
     *
     * 创建容灾
     *
     * @param CreateDisasterRecoveryRequest 请求对象
     * @return CreateDisasterRecoveryResponse
     */
    public CreateDisasterRecoveryResponse createDisasterRecovery(CreateDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createDisasterRecovery);
    }

    /**
     * 创建容灾
     *
     * 创建容灾
     *
     * @param CreateDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>
     */
    public SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecoveryInvoker(
        CreateDisasterRecoveryRequest request) {
        return new SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>(request,
            DwsMeta.createDisasterRecovery, hcClient);
    }

    /**
     * 创建订阅事件
     *
     * 添加订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSubRequest 请求对象
     * @return CreateEventSubResponse
     */
    public CreateEventSubResponse createEventSub(CreateEventSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createEventSub);
    }

    /**
     * 创建订阅事件
     *
     * 添加订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSubRequest 请求对象
     * @return SyncInvoker<CreateEventSubRequest, CreateEventSubResponse>
     */
    public SyncInvoker<CreateEventSubRequest, CreateEventSubResponse> createEventSubInvoker(
        CreateEventSubRequest request) {
        return new SyncInvoker<CreateEventSubRequest, CreateEventSubResponse>(request, DwsMeta.createEventSub,
            hcClient);
    }

    /**
     * 创建快照
     *
     * 该接口用于为指定集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotRequest 请求对象
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createSnapshot);
    }

    /**
     * 创建快照
     *
     * 该接口用于为指定集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotRequest 请求对象
     * @return SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotInvoker(
        CreateSnapshotRequest request) {
        return new SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, DwsMeta.createSnapshot,
            hcClient);
    }

    /**
     * 添加快照策略
     *
     * 该接口用于设置快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotPolicyRequest 请求对象
     * @return CreateSnapshotPolicyResponse
     */
    public CreateSnapshotPolicyResponse createSnapshotPolicy(CreateSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createSnapshotPolicy);
    }

    /**
     * 添加快照策略
     *
     * 该接口用于设置快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse>
     */
    public SyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> createSnapshotPolicyInvoker(
        CreateSnapshotPolicyRequest request) {
        return new SyncInvoker<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse>(request,
            DwsMeta.createSnapshotPolicy, hcClient);
    }

    /**
     * 添加工作负载计划
     *
     * 添加工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkloadPlanRequest 请求对象
     * @return CreateWorkloadPlanResponse
     */
    public CreateWorkloadPlanResponse createWorkloadPlan(CreateWorkloadPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createWorkloadPlan);
    }

    /**
     * 添加工作负载计划
     *
     * 添加工作负载计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkloadPlanRequest 请求对象
     * @return SyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse>
     */
    public SyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> createWorkloadPlanInvoker(
        CreateWorkloadPlanRequest request) {
        return new SyncInvoker<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse>(request,
            DwsMeta.createWorkloadPlan, hcClient);
    }

    /**
     * 删除告警订阅
     *
     * 删除订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlarmSubRequest 请求对象
     * @return DeleteAlarmSubResponse
     */
    public DeleteAlarmSubResponse deleteAlarmSub(DeleteAlarmSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteAlarmSub);
    }

    /**
     * 删除告警订阅
     *
     * 删除订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlarmSubRequest 请求对象
     * @return SyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse>
     */
    public SyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse> deleteAlarmSubInvoker(
        DeleteAlarmSubRequest request) {
        return new SyncInvoker<DeleteAlarmSubRequest, DeleteAlarmSubResponse>(request, DwsMeta.deleteAlarmSub,
            hcClient);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除后将释放此集群的所有资源，包括客户数据。为了安全起见，请在删除集群前为这个集群创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, DwsMeta.deleteCluster, hcClient);
    }

    /**
     * 删除集群域名
     *
     * 删除指定集群域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterDnsRequest 请求对象
     * @return DeleteClusterDnsResponse
     */
    public DeleteClusterDnsResponse deleteClusterDns(DeleteClusterDnsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteClusterDns);
    }

    /**
     * 删除集群域名
     *
     * 删除指定集群域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterDnsRequest 请求对象
     * @return SyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse>
     */
    public SyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse> deleteClusterDnsInvoker(
        DeleteClusterDnsRequest request) {
        return new SyncInvoker<DeleteClusterDnsRequest, DeleteClusterDnsResponse>(request, DwsMeta.deleteClusterDns,
            hcClient);
    }

    /**
     * 删除容灾
     *
     * 删除容灾。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryRequest 请求对象
     * @return DeleteDisasterRecoveryResponse
     */
    public DeleteDisasterRecoveryResponse deleteDisasterRecovery(DeleteDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteDisasterRecovery);
    }

    /**
     * 删除容灾
     *
     * 删除容灾。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>
     */
    public SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecoveryInvoker(
        DeleteDisasterRecoveryRequest request) {
        return new SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>(request,
            DwsMeta.deleteDisasterRecovery, hcClient);
    }

    /**
     * 删除订阅事件
     *
     * 删除订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSubRequest 请求对象
     * @return DeleteEventSubResponse
     */
    public DeleteEventSubResponse deleteEventSub(DeleteEventSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteEventSub);
    }

    /**
     * 删除订阅事件
     *
     * 删除订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSubRequest 请求对象
     * @return SyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse>
     */
    public SyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse> deleteEventSubInvoker(
        DeleteEventSubRequest request) {
        return new SyncInvoker<DeleteEventSubRequest, DeleteEventSubResponse>(request, DwsMeta.deleteEventSub,
            hcClient);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除一个指定手动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteSnapshot);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除一个指定手动快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotInvoker(
        DeleteSnapshotRequest request) {
        return new SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, DwsMeta.deleteSnapshot,
            hcClient);
    }

    /**
     * 删除快照策略
     *
     * 该接口用于删除一个快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotPolicyRequest 请求对象
     * @return DeleteSnapshotPolicyResponse
     */
    public DeleteSnapshotPolicyResponse deleteSnapshotPolicy(DeleteSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteSnapshotPolicy);
    }

    /**
     * 删除快照策略
     *
     * 该接口用于删除一个快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse>
     */
    public SyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> deleteSnapshotPolicyInvoker(
        DeleteSnapshotPolicyRequest request) {
        return new SyncInvoker<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse>(request,
            DwsMeta.deleteSnapshotPolicy, hcClient);
    }

    /**
     * 删除工作负载队列
     *
     * 该接口用于删除工作负载队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkloadQueueRequest 请求对象
     * @return DeleteWorkloadQueueResponse
     */
    public DeleteWorkloadQueueResponse deleteWorkloadQueue(DeleteWorkloadQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.deleteWorkloadQueue);
    }

    /**
     * 删除工作负载队列
     *
     * 该接口用于删除工作负载队列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkloadQueueRequest 请求对象
     * @return SyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse>
     */
    public SyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> deleteWorkloadQueueInvoker(
        DeleteWorkloadQueueRequest request) {
        return new SyncInvoker<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse>(request,
            DwsMeta.deleteWorkloadQueue, hcClient);
    }

    /**
     * 集群解绑EIP
     *
     * 集群解绑Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateEipRequest 请求对象
     * @return DisassociateEipResponse
     */
    public DisassociateEipResponse disassociateEip(DisassociateEipRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.disassociateEip);
    }

    /**
     * 集群解绑EIP
     *
     * 集群解绑Eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateEipRequest 请求对象
     * @return SyncInvoker<DisassociateEipRequest, DisassociateEipResponse>
     */
    public SyncInvoker<DisassociateEipRequest, DisassociateEipResponse> disassociateEipInvoker(
        DisassociateEipRequest request) {
        return new SyncInvoker<DisassociateEipRequest, DisassociateEipResponse>(request, DwsMeta.disassociateEip,
            hcClient);
    }

    /**
     * 集群解绑ELB
     *
     * 集群解绑Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateElbRequest 请求对象
     * @return DisassociateElbResponse
     */
    public DisassociateElbResponse disassociateElb(DisassociateElbRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.disassociateElb);
    }

    /**
     * 集群解绑ELB
     *
     * 集群解绑Elb接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateElbRequest 请求对象
     * @return SyncInvoker<DisassociateElbRequest, DisassociateElbResponse>
     */
    public SyncInvoker<DisassociateElbRequest, DisassociateElbResponse> disassociateElbInvoker(
        DisassociateElbRequest request) {
        return new SyncInvoker<DisassociateElbRequest, DisassociateElbResponse>(request, DwsMeta.disassociateElb,
            hcClient);
    }

    /**
     * 下发重分布
     *
     * 下发重分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteRedistributionClusterRequest 请求对象
     * @return ExecuteRedistributionClusterResponse
     */
    public ExecuteRedistributionClusterResponse executeRedistributionCluster(
        ExecuteRedistributionClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.executeRedistributionCluster);
    }

    /**
     * 下发重分布
     *
     * 下发重分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteRedistributionClusterRequest 请求对象
     * @return SyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse>
     */
    public SyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> executeRedistributionClusterInvoker(
        ExecuteRedistributionClusterRequest request) {
        return new SyncInvoker<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse>(request,
            DwsMeta.executeRedistributionCluster, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmConfigsRequest 请求对象
     * @return ListAlarmConfigsResponse
     */
    public ListAlarmConfigsResponse listAlarmConfigs(ListAlarmConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAlarmConfigs);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmConfigsRequest 请求对象
     * @return SyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse>
     */
    public SyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse> listAlarmConfigsInvoker(
        ListAlarmConfigsRequest request) {
        return new SyncInvoker<ListAlarmConfigsRequest, ListAlarmConfigsResponse>(request, DwsMeta.listAlarmConfigs,
            hcClient);
    }

    /**
     * 查询告警详情列表
     *
     * 查询告警详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmDetailRequest 请求对象
     * @return ListAlarmDetailResponse
     */
    public ListAlarmDetailResponse listAlarmDetail(ListAlarmDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAlarmDetail);
    }

    /**
     * 查询告警详情列表
     *
     * 查询告警详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmDetailRequest 请求对象
     * @return SyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse>
     */
    public SyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse> listAlarmDetailInvoker(
        ListAlarmDetailRequest request) {
        return new SyncInvoker<ListAlarmDetailRequest, ListAlarmDetailResponse>(request, DwsMeta.listAlarmDetail,
            hcClient);
    }

    /**
     * 查询告警统计列表
     *
     * 查询告警统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmStatisticRequest 请求对象
     * @return ListAlarmStatisticResponse
     */
    public ListAlarmStatisticResponse listAlarmStatistic(ListAlarmStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAlarmStatistic);
    }

    /**
     * 查询告警统计列表
     *
     * 查询告警统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmStatisticRequest 请求对象
     * @return SyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse>
     */
    public SyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse> listAlarmStatisticInvoker(
        ListAlarmStatisticRequest request) {
        return new SyncInvoker<ListAlarmStatisticRequest, ListAlarmStatisticResponse>(request,
            DwsMeta.listAlarmStatistic, hcClient);
    }

    /**
     * 查询告警订阅列表
     *
     * 查询订阅告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmSubsRequest 请求对象
     * @return ListAlarmSubsResponse
     */
    public ListAlarmSubsResponse listAlarmSubs(ListAlarmSubsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAlarmSubs);
    }

    /**
     * 查询告警订阅列表
     *
     * 查询订阅告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmSubsRequest 请求对象
     * @return SyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse>
     */
    public SyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse> listAlarmSubsInvoker(ListAlarmSubsRequest request) {
        return new SyncInvoker<ListAlarmSubsRequest, ListAlarmSubsResponse>(request, DwsMeta.listAlarmSubs, hcClient);
    }

    /**
     * 查询日志记录
     *
     * 查询审计日志记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditLogRequest 请求对象
     * @return ListAuditLogResponse
     */
    public ListAuditLogResponse listAuditLog(ListAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAuditLog);
    }

    /**
     * 查询日志记录
     *
     * 查询审计日志记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditLogRequest 请求对象
     * @return SyncInvoker<ListAuditLogRequest, ListAuditLogResponse>
     */
    public SyncInvoker<ListAuditLogRequest, ListAuditLogResponse> listAuditLogInvoker(ListAuditLogRequest request) {
        return new SyncInvoker<ListAuditLogRequest, ListAuditLogResponse>(request, DwsMeta.listAuditLog, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listAvailabilityZones);
    }

    /**
     * 查询可用区列表
     *
     * 在创建实例时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            DwsMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询集群CN节点
     *
     * 查询集群的CN节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterCnRequest 请求对象
     * @return ListClusterCnResponse
     */
    public ListClusterCnResponse listClusterCn(ListClusterCnRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterCn);
    }

    /**
     * 查询集群CN节点
     *
     * 查询集群的CN节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterCnRequest 请求对象
     * @return SyncInvoker<ListClusterCnRequest, ListClusterCnResponse>
     */
    public SyncInvoker<ListClusterCnRequest, ListClusterCnResponse> listClusterCnInvoker(ListClusterCnRequest request) {
        return new SyncInvoker<ListClusterCnRequest, ListClusterCnResponse>(request, DwsMeta.listClusterCn, hcClient);
    }

    /**
     * 查询集群参数组
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterConfigurationsRequest 请求对象
     * @return ListClusterConfigurationsResponse
     */
    public ListClusterConfigurationsResponse listClusterConfigurations(ListClusterConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterConfigurations);
    }

    /**
     * 查询集群参数组
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterConfigurationsRequest 请求对象
     * @return SyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse>
     */
    public SyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> listClusterConfigurationsInvoker(
        ListClusterConfigurationsRequest request) {
        return new SyncInvoker<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse>(request,
            DwsMeta.listClusterConfigurations, hcClient);
    }

    /**
     * 查询集群参数配置
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterConfigurationsParameterRequest 请求对象
     * @return ListClusterConfigurationsParameterResponse
     */
    public ListClusterConfigurationsParameterResponse listClusterConfigurationsParameter(
        ListClusterConfigurationsParameterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterConfigurationsParameter);
    }

    /**
     * 查询集群参数配置
     *
     * 查询集群所关联的参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterConfigurationsParameterRequest 请求对象
     * @return SyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse>
     */
    public SyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> listClusterConfigurationsParameterInvoker(
        ListClusterConfigurationsParameterRequest request) {
        return new SyncInvoker<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse>(
            request, DwsMeta.listClusterConfigurationsParameter, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterDetailsRequest 请求对象
     * @return ListClusterDetailsResponse
     */
    public ListClusterDetailsResponse listClusterDetails(ListClusterDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterDetails);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterDetailsRequest 请求对象
     * @return SyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>
     */
    public SyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetailsInvoker(
        ListClusterDetailsRequest request) {
        return new SyncInvoker<ListClusterDetailsRequest, ListClusterDetailsResponse>(request,
            DwsMeta.listClusterDetails, hcClient);
    }

    /**
     * 查询合适的缩容数
     *
     * 查询合适的缩容数
     *
     * @param ListClusterScaleInNumbersRequest 请求对象
     * @return ListClusterScaleInNumbersResponse
     */
    public ListClusterScaleInNumbersResponse listClusterScaleInNumbers(ListClusterScaleInNumbersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterScaleInNumbers);
    }

    /**
     * 查询合适的缩容数
     *
     * 查询合适的缩容数
     *
     * @param ListClusterScaleInNumbersRequest 请求对象
     * @return SyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse>
     */
    public SyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> listClusterScaleInNumbersInvoker(
        ListClusterScaleInNumbersRequest request) {
        return new SyncInvoker<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse>(request,
            DwsMeta.listClusterScaleInNumbers, hcClient);
    }

    /**
     * 查询集群快照列表
     *
     * 该接口用于查询集群快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterSnapshotsRequest 请求对象
     * @return ListClusterSnapshotsResponse
     */
    public ListClusterSnapshotsResponse listClusterSnapshots(ListClusterSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterSnapshots);
    }

    /**
     * 查询集群快照列表
     *
     * 该接口用于查询集群快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterSnapshotsRequest 请求对象
     * @return SyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse>
     */
    public SyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> listClusterSnapshotsInvoker(
        ListClusterSnapshotsRequest request) {
        return new SyncInvoker<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse>(request,
            DwsMeta.listClusterSnapshots, hcClient);
    }

    /**
     * 查询集群标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterTagsRequest 请求对象
     * @return ListClusterTagsResponse
     */
    public ListClusterTagsResponse listClusterTags(ListClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterTags);
    }

    /**
     * 查询集群标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterTagsRequest 请求对象
     * @return SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>
     */
    public SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTagsInvoker(
        ListClusterTagsRequest request) {
        return new SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>(request, DwsMeta.listClusterTags,
            hcClient);
    }

    /**
     * 查询资源管理
     *
     * 查询资管管理开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterWorkloadRequest 请求对象
     * @return ListClusterWorkloadResponse
     */
    public ListClusterWorkloadResponse listClusterWorkload(ListClusterWorkloadRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusterWorkload);
    }

    /**
     * 查询资源管理
     *
     * 查询资管管理开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterWorkloadRequest 请求对象
     * @return SyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse>
     */
    public SyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse> listClusterWorkloadInvoker(
        ListClusterWorkloadRequest request) {
        return new SyncInvoker<ListClusterWorkloadRequest, ListClusterWorkloadResponse>(request,
            DwsMeta.listClusterWorkload, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusters);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, DwsMeta.listClusters, hcClient);
    }

    /**
     * 查询数据源
     *
     * 该接口用于查询数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataSourceRequest 请求对象
     * @return ListDataSourceResponse
     */
    public ListDataSourceResponse listDataSource(ListDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDataSource);
    }

    /**
     * 查询数据源
     *
     * 该接口用于查询数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataSourceRequest 请求对象
     * @return SyncInvoker<ListDataSourceRequest, ListDataSourceResponse>
     */
    public SyncInvoker<ListDataSourceRequest, ListDataSourceResponse> listDataSourceInvoker(
        ListDataSourceRequest request) {
        return new SyncInvoker<ListDataSourceRequest, ListDataSourceResponse>(request, DwsMeta.listDataSource,
            hcClient);
    }

    /**
     * 查询容灾列表
     *
     * 查询容灾列表
     *
     * @param ListDisasterRecoverRequest 请求对象
     * @return ListDisasterRecoverResponse
     */
    public ListDisasterRecoverResponse listDisasterRecover(ListDisasterRecoverRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDisasterRecover);
    }

    /**
     * 查询容灾列表
     *
     * 查询容灾列表
     *
     * @param ListDisasterRecoverRequest 请求对象
     * @return SyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse>
     */
    public SyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse> listDisasterRecoverInvoker(
        ListDisasterRecoverRequest request) {
        return new SyncInvoker<ListDisasterRecoverRequest, ListDisasterRecoverResponse>(request,
            DwsMeta.listDisasterRecover, hcClient);
    }

    /**
     * 查询专属分布式存储池列表
     *
     * 获取专属分布式存储池列表，只包括用户开通的SSD专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDssPoolsRequest 请求对象
     * @return ListDssPoolsResponse
     */
    public ListDssPoolsResponse listDssPools(ListDssPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listDssPools);
    }

    /**
     * 查询专属分布式存储池列表
     *
     * 获取专属分布式存储池列表，只包括用户开通的SSD专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDssPoolsRequest 请求对象
     * @return SyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse>
     */
    public SyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse> listDssPoolsInvoker(ListDssPoolsRequest request) {
        return new SyncInvoker<ListDssPoolsRequest, ListDssPoolsResponse>(request, DwsMeta.listDssPools, hcClient);
    }

    /**
     * 获取集群可绑定的ELB列表
     *
     * 查询集群可以关联的Elb列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElbsRequest 请求对象
     * @return ListElbsResponse
     */
    public ListElbsResponse listElbs(ListElbsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listElbs);
    }

    /**
     * 获取集群可绑定的ELB列表
     *
     * 查询集群可以关联的Elb列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListElbsRequest 请求对象
     * @return SyncInvoker<ListElbsRequest, ListElbsResponse>
     */
    public SyncInvoker<ListElbsRequest, ListElbsResponse> listElbsInvoker(ListElbsRequest request) {
        return new SyncInvoker<ListElbsRequest, ListElbsResponse>(request, DwsMeta.listElbs, hcClient);
    }

    /**
     * 查询事件配置
     *
     * 查询事件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSpecsRequest 请求对象
     * @return ListEventSpecsResponse
     */
    public ListEventSpecsResponse listEventSpecs(ListEventSpecsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listEventSpecs);
    }

    /**
     * 查询事件配置
     *
     * 查询事件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSpecsRequest 请求对象
     * @return SyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse>
     */
    public SyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse> listEventSpecsInvoker(
        ListEventSpecsRequest request) {
        return new SyncInvoker<ListEventSpecsRequest, ListEventSpecsResponse>(request, DwsMeta.listEventSpecs,
            hcClient);
    }

    /**
     * 查询订阅事件
     *
     * 查询订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSubsRequest 请求对象
     * @return ListEventSubsResponse
     */
    public ListEventSubsResponse listEventSubs(ListEventSubsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listEventSubs);
    }

    /**
     * 查询订阅事件
     *
     * 查询订阅的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSubsRequest 请求对象
     * @return SyncInvoker<ListEventSubsRequest, ListEventSubsResponse>
     */
    public SyncInvoker<ListEventSubsRequest, ListEventSubsResponse> listEventSubsInvoker(ListEventSubsRequest request) {
        return new SyncInvoker<ListEventSubsRequest, ListEventSubsResponse>(request, DwsMeta.listEventSubs, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listEvents);
    }

    /**
     * 查询事件列表
     *
     * 查询事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<ListEventsRequest, ListEventsResponse>(request, DwsMeta.listEvents, hcClient);
    }

    /**
     * openApi查询磁盘信息
     *
     * openApi查询磁盘信息
     *
     * @param ListHostDiskRequest 请求对象
     * @return ListHostDiskResponse
     */
    public ListHostDiskResponse listHostDisk(ListHostDiskRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listHostDisk);
    }

    /**
     * openApi查询磁盘信息
     *
     * openApi查询磁盘信息
     *
     * @param ListHostDiskRequest 请求对象
     * @return SyncInvoker<ListHostDiskRequest, ListHostDiskResponse>
     */
    public SyncInvoker<ListHostDiskRequest, ListHostDiskResponse> listHostDiskInvoker(ListHostDiskRequest request) {
        return new SyncInvoker<ListHostDiskRequest, ListHostDiskResponse>(request, DwsMeta.listHostDisk, hcClient);
    }

    /**
     * openapi获取网卡状态
     *
     * openapi获取网卡状态
     *
     * @param ListHostNetRequest 请求对象
     * @return ListHostNetResponse
     */
    public ListHostNetResponse listHostNet(ListHostNetRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listHostNet);
    }

    /**
     * openapi获取网卡状态
     *
     * openapi获取网卡状态
     *
     * @param ListHostNetRequest 请求对象
     * @return SyncInvoker<ListHostNetRequest, ListHostNetResponse>
     */
    public SyncInvoker<ListHostNetRequest, ListHostNetResponse> listHostNetInvoker(ListHostNetRequest request) {
        return new SyncInvoker<ListHostNetRequest, ListHostNetResponse>(request, DwsMeta.listHostNet, hcClient);
    }

    /**
     * openApi查询主机概览
     *
     * openApi查询主机概览
     *
     * @param ListHostOverviewRequest 请求对象
     * @return ListHostOverviewResponse
     */
    public ListHostOverviewResponse listHostOverview(ListHostOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listHostOverview);
    }

    /**
     * openApi查询主机概览
     *
     * openApi查询主机概览
     *
     * @param ListHostOverviewRequest 请求对象
     * @return SyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse>
     */
    public SyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse> listHostOverviewInvoker(
        ListHostOverviewRequest request) {
        return new SyncInvoker<ListHostOverviewRequest, ListHostOverviewResponse>(request, DwsMeta.listHostOverview,
            hcClient);
    }

    /**
     * 查询job进度
     *
     * 查询job进度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobDetailsRequest 请求对象
     * @return ListJobDetailsResponse
     */
    public ListJobDetailsResponse listJobDetails(ListJobDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listJobDetails);
    }

    /**
     * 查询job进度
     *
     * 查询job进度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobDetailsRequest 请求对象
     * @return SyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse>
     */
    public SyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse> listJobDetailsInvoker(
        ListJobDetailsRequest request) {
        return new SyncInvoker<ListJobDetailsRequest, ListJobDetailsResponse>(request, DwsMeta.listJobDetails,
            hcClient);
    }

    /**
     * 查询节点类型
     *
     * 该接口用于查询所有GaussDB(DWS)服务支持的节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodeTypesRequest 请求对象
     * @return ListNodeTypesResponse
     */
    public ListNodeTypesResponse listNodeTypes(ListNodeTypesRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listNodeTypes);
    }

    /**
     * 查询节点类型
     *
     * 该接口用于查询所有GaussDB(DWS)服务支持的节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodeTypesRequest 请求对象
     * @return SyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>
     */
    public SyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypesInvoker(ListNodeTypesRequest request) {
        return new SyncInvoker<ListNodeTypesRequest, ListNodeTypesResponse>(request, DwsMeta.listNodeTypes, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDB(DWS)服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDB(DWS)服务下的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, DwsMeta.listQuotas, hcClient);
    }

    /**
     * 查询快照详情
     *
     * 该接口用于使用快照ID查询快照详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotDetailsRequest 请求对象
     * @return ListSnapshotDetailsResponse
     */
    public ListSnapshotDetailsResponse listSnapshotDetails(ListSnapshotDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotDetails);
    }

    /**
     * 查询快照详情
     *
     * 该接口用于使用快照ID查询快照详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotDetailsRequest 请求对象
     * @return SyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>
     */
    public SyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetailsInvoker(
        ListSnapshotDetailsRequest request) {
        return new SyncInvoker<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse>(request,
            DwsMeta.listSnapshotDetails, hcClient);
    }

    /**
     * 查询快照策略
     *
     * 查询快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotPolicyRequest 请求对象
     * @return ListSnapshotPolicyResponse
     */
    public ListSnapshotPolicyResponse listSnapshotPolicy(ListSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotPolicy);
    }

    /**
     * 查询快照策略
     *
     * 查询快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse>
     */
    public SyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> listSnapshotPolicyInvoker(
        ListSnapshotPolicyRequest request) {
        return new SyncInvoker<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse>(request,
            DwsMeta.listSnapshotPolicy, hcClient);
    }

    /**
     * 快照统计信息
     *
     * 快照统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotStatisticsRequest 请求对象
     * @return ListSnapshotStatisticsResponse
     */
    public ListSnapshotStatisticsResponse listSnapshotStatistics(ListSnapshotStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshotStatistics);
    }

    /**
     * 快照统计信息
     *
     * 快照统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotStatisticsRequest 请求对象
     * @return SyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse>
     */
    public SyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> listSnapshotStatisticsInvoker(
        ListSnapshotStatisticsRequest request) {
        return new SyncInvoker<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse>(request,
            DwsMeta.listSnapshotStatistics, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotsRequest 请求对象
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, DwsMeta.listSnapshots, hcClient);
    }

    /**
     * 查询资源统计信息列表
     *
     * 查询当前可用资源数量，其中包括“可用集群和总集群（个）”、“可用节点和总节点（个）”、“总容量（GB）”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return ListStatisticsResponse
     */
    public ListStatisticsResponse listStatistics(ListStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listStatistics);
    }

    /**
     * 查询资源统计信息列表
     *
     * 查询当前可用资源数量，其中包括“可用集群和总集群（个）”、“可用节点和总节点（个）”、“总容量（GB）”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public SyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsInvoker(
        ListStatisticsRequest request) {
        return new SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request, DwsMeta.listStatistics,
            hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<ListTagsRequest, ListTagsResponse>(request, DwsMeta.listTags, hcClient);
    }

    /**
     * 查询工作负载队列
     *
     * 查询工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkloadQueueRequest 请求对象
     * @return ListWorkloadQueueResponse
     */
    public ListWorkloadQueueResponse listWorkloadQueue(ListWorkloadQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listWorkloadQueue);
    }

    /**
     * 查询工作负载队列
     *
     * 查询工作负载队列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkloadQueueRequest 请求对象
     * @return SyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse>
     */
    public SyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse> listWorkloadQueueInvoker(
        ListWorkloadQueueRequest request) {
        return new SyncInvoker<ListWorkloadQueueRequest, ListWorkloadQueueResponse>(request, DwsMeta.listWorkloadQueue,
            hcClient);
    }

    /**
     * 停止容灾
     *
     * 停止容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseDisasterRecoveryRequest 请求对象
     * @return PauseDisasterRecoveryResponse
     */
    public PauseDisasterRecoveryResponse pauseDisasterRecovery(PauseDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.pauseDisasterRecovery);
    }

    /**
     * 停止容灾
     *
     * 停止容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse>
     */
    public SyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> pauseDisasterRecoveryInvoker(
        PauseDisasterRecoveryRequest request) {
        return new SyncInvoker<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse>(request,
            DwsMeta.pauseDisasterRecovery, hcClient);
    }

    /**
     * 重置密码
     *
     * 此接口用于重置集群管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 此接口用于重置集群管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, DwsMeta.resetPassword, hcClient);
    }

    /**
     * 扩容集群调整集群大小
     *
     * 此接口用于扩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
     * @return ResizeClusterResponse
     */
    public ResizeClusterResponse resizeCluster(ResizeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.resizeCluster);
    }

    /**
     * 扩容集群调整集群大小
     *
     * 此接口用于扩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
     * @return SyncInvoker<ResizeClusterRequest, ResizeClusterResponse>
     */
    public SyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterInvoker(ResizeClusterRequest request) {
        return new SyncInvoker<ResizeClusterRequest, ResizeClusterResponse>(request, DwsMeta.resizeCluster, hcClient);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return RestartClusterResponse
     */
    public RestartClusterResponse restartCluster(RestartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return SyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public SyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterInvoker(
        RestartClusterRequest request) {
        return new SyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, DwsMeta.restartCluster,
            hcClient);
    }

    /**
     * 恢复集群
     *
     * 该接口用于使用快照恢复集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreClusterRequest 请求对象
     * @return RestoreClusterResponse
     */
    public RestoreClusterResponse restoreCluster(RestoreClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restoreCluster);
    }

    /**
     * 恢复集群
     *
     * 该接口用于使用快照恢复集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreClusterRequest 请求对象
     * @return SyncInvoker<RestoreClusterRequest, RestoreClusterResponse>
     */
    public SyncInvoker<RestoreClusterRequest, RestoreClusterResponse> restoreClusterInvoker(
        RestoreClusterRequest request) {
        return new SyncInvoker<RestoreClusterRequest, RestoreClusterResponse>(request, DwsMeta.restoreCluster,
            hcClient);
    }

    /**
     * 恢复容灾
     *
     * 恢复容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreDisasterRequest 请求对象
     * @return RestoreDisasterResponse
     */
    public RestoreDisasterResponse restoreDisaster(RestoreDisasterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.restoreDisaster);
    }

    /**
     * 恢复容灾
     *
     * 恢复容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreDisasterRequest 请求对象
     * @return SyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse>
     */
    public SyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse> restoreDisasterInvoker(
        RestoreDisasterRequest request) {
        return new SyncInvoker<RestoreDisasterRequest, RestoreDisasterResponse>(request, DwsMeta.restoreDisaster,
            hcClient);
    }

    /**
     * 集群缩容
     *
     * 该接口用于缩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkClusterRequest 请求对象
     * @return ShrinkClusterResponse
     */
    public ShrinkClusterResponse shrinkCluster(ShrinkClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.shrinkCluster);
    }

    /**
     * 集群缩容
     *
     * 该接口用于缩容集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkClusterRequest 请求对象
     * @return SyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>
     */
    public SyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse> shrinkClusterInvoker(ShrinkClusterRequest request) {
        return new SyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>(request, DwsMeta.shrinkCluster, hcClient);
    }

    /**
     * 启动容灾
     *
     * 启动容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDisasterRecoveryRequest 请求对象
     * @return StartDisasterRecoveryResponse
     */
    public StartDisasterRecoveryResponse startDisasterRecovery(StartDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.startDisasterRecovery);
    }

    /**
     * 启动容灾
     *
     * 启动容灾
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse>
     */
    public SyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> startDisasterRecoveryInvoker(
        StartDisasterRecoveryRequest request) {
        return new SyncInvoker<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse>(request,
            DwsMeta.startDisasterRecovery, hcClient);
    }

    /**
     * 容灾异常切换
     *
     * 容灾-异常切换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchFailoverDisasterRequest 请求对象
     * @return SwitchFailoverDisasterResponse
     */
    public SwitchFailoverDisasterResponse switchFailoverDisaster(SwitchFailoverDisasterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.switchFailoverDisaster);
    }

    /**
     * 容灾异常切换
     *
     * 容灾-异常切换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchFailoverDisasterRequest 请求对象
     * @return SyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse>
     */
    public SyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> switchFailoverDisasterInvoker(
        SwitchFailoverDisasterRequest request) {
        return new SyncInvoker<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse>(request,
            DwsMeta.switchFailoverDisaster, hcClient);
    }

    /**
     * 主备恢复
     *
     * 当集群状态为“非均衡”时会出现某些节点主实例增多，从而负载压力较大。这种情况下集群状态是正常的，但整体性能要低于均衡状态。可进行集群主备恢复操作将集群状态切换为“可用“状态。
     * - 集群主备恢复仅8.1.1.202及以上版本支持。
     * - 集群主备恢复将会短暂中断业务，中断时间根据用户自身业务量所决定，建议用户在业务低峰期执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchOverClusterRequest 请求对象
     * @return SwitchOverClusterResponse
     */
    public SwitchOverClusterResponse switchOverCluster(SwitchOverClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.switchOverCluster);
    }

    /**
     * 主备恢复
     *
     * 当集群状态为“非均衡”时会出现某些节点主实例增多，从而负载压力较大。这种情况下集群状态是正常的，但整体性能要低于均衡状态。可进行集群主备恢复操作将集群状态切换为“可用“状态。
     * - 集群主备恢复仅8.1.1.202及以上版本支持。
     * - 集群主备恢复将会短暂中断业务，中断时间根据用户自身业务量所决定，建议用户在业务低峰期执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchOverClusterRequest 请求对象
     * @return SyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse>
     */
    public SyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse> switchOverClusterInvoker(
        SwitchOverClusterRequest request) {
        return new SyncInvoker<SwitchOverClusterRequest, SwitchOverClusterResponse>(request, DwsMeta.switchOverCluster,
            hcClient);
    }

    /**
     * 灾备切换
     *
     * 容灾-灾备切换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchoverDisasterRecoveryRequest 请求对象
     * @return SwitchoverDisasterRecoveryResponse
     */
    public SwitchoverDisasterRecoveryResponse switchoverDisasterRecovery(SwitchoverDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.switchoverDisasterRecovery);
    }

    /**
     * 灾备切换
     *
     * 容灾-灾备切换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchoverDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse>
     */
    public SyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> switchoverDisasterRecoveryInvoker(
        SwitchoverDisasterRecoveryRequest request) {
        return new SyncInvoker<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse>(request,
            DwsMeta.switchoverDisasterRecovery, hcClient);
    }

    /**
     * 更新告警订阅
     *
     * 更新订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmSubRequest 请求对象
     * @return UpdateAlarmSubResponse
     */
    public UpdateAlarmSubResponse updateAlarmSub(UpdateAlarmSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateAlarmSub);
    }

    /**
     * 更新告警订阅
     *
     * 更新订阅的告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmSubRequest 请求对象
     * @return SyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse>
     */
    public SyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse> updateAlarmSubInvoker(
        UpdateAlarmSubRequest request) {
        return new SyncInvoker<UpdateAlarmSubRequest, UpdateAlarmSubResponse>(request, DwsMeta.updateAlarmSub,
            hcClient);
    }

    /**
     * 修改集群域名
     *
     * 为指定集群修改域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterDnsRequest 请求对象
     * @return UpdateClusterDnsResponse
     */
    public UpdateClusterDnsResponse updateClusterDns(UpdateClusterDnsRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateClusterDns);
    }

    /**
     * 修改集群域名
     *
     * 为指定集群修改域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterDnsRequest 请求对象
     * @return SyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse>
     */
    public SyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse> updateClusterDnsInvoker(
        UpdateClusterDnsRequest request) {
        return new SyncInvoker<UpdateClusterDnsRequest, UpdateClusterDnsResponse>(request, DwsMeta.updateClusterDns,
            hcClient);
    }

    /**
     * 修改集群参数配置
     *
     * 修改集群使用的参数配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return UpdateConfigurationResponse
     */
    public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateConfiguration);
    }

    /**
     * 修改集群参数配置
     *
     * 修改集群使用的参数配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationInvoker(
        UpdateConfigurationRequest request) {
        return new SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            DwsMeta.updateConfiguration, hcClient);
    }

    /**
     * 更新数据源
     *
     * 该接口用于更新一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataSourceRequest 请求对象
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateDataSource);
    }

    /**
     * 更新数据源
     *
     * 该接口用于更新一个数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataSourceRequest 请求对象
     * @return SyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>
     */
    public SyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSourceInvoker(
        UpdateDataSourceRequest request) {
        return new SyncInvoker<UpdateDataSourceRequest, UpdateDataSourceResponse>(request, DwsMeta.updateDataSource,
            hcClient);
    }

    /**
     * 更新订阅事件
     *
     * 更新订阅事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSubRequest 请求对象
     * @return UpdateEventSubResponse
     */
    public UpdateEventSubResponse updateEventSub(UpdateEventSubRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateEventSub);
    }

    /**
     * 更新订阅事件
     *
     * 更新订阅事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSubRequest 请求对象
     * @return SyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse>
     */
    public SyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse> updateEventSubInvoker(
        UpdateEventSubRequest request) {
        return new SyncInvoker<UpdateEventSubRequest, UpdateEventSubResponse>(request, DwsMeta.updateEventSub,
            hcClient);
    }

    /**
     * 修改运维时间窗
     *
     * 您可以根据业务需求，设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMaintenanceWindowRequest 请求对象
     * @return UpdateMaintenanceWindowResponse
     */
    public UpdateMaintenanceWindowResponse updateMaintenanceWindow(UpdateMaintenanceWindowRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.updateMaintenanceWindow);
    }

    /**
     * 修改运维时间窗
     *
     * 您可以根据业务需求，设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMaintenanceWindowRequest 请求对象
     * @return SyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>
     */
    public SyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> updateMaintenanceWindowInvoker(
        UpdateMaintenanceWindowRequest request) {
        return new SyncInvoker<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>(request,
            DwsMeta.updateMaintenanceWindow, hcClient);
    }

}
