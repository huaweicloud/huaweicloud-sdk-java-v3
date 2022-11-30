package com.huaweicloud.sdk.iec.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iec.v1.model.*;

public class IecClient {

    protected HcClient hcClient;

    public IecClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IecClient> newBuilder() {
        return new ClientBuilder<>(IecClient::new, "GlobalCredentials");
    }

    /**
     * 添加网卡
     *
     * 添加网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddNicsRequest 请求对象
     * @return AddNicsResponse
     */
    public AddNicsResponse addNics(AddNicsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.addNics);
    }

    /**
     * 添加网卡
     *
     * 添加网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddNicsRequest 请求对象
     * @return SyncInvoker<AddNicsRequest, AddNicsResponse>
     */
    public SyncInvoker<AddNicsRequest, AddNicsResponse> addNicsInvoker(AddNicsRequest request) {
        return new SyncInvoker<AddNicsRequest, AddNicsResponse>(request, IecMeta.addNics, hcClient);
    }

    /**
     * 路由表关联子网
     *
     * 路由表关联子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSubnetRequest 请求对象
     * @return AssociateSubnetResponse
     */
    public AssociateSubnetResponse associateSubnet(AssociateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.associateSubnet);
    }

    /**
     * 路由表关联子网
     *
     * 路由表关联子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSubnetRequest 请求对象
     * @return SyncInvoker<AssociateSubnetRequest, AssociateSubnetResponse>
     */
    public SyncInvoker<AssociateSubnetRequest, AssociateSubnetResponse> associateSubnetInvoker(
        AssociateSubnetRequest request) {
        return new SyncInvoker<AssociateSubnetRequest, AssociateSubnetResponse>(request, IecMeta.associateSubnet,
            hcClient);
    }

    /**
     * 批量重启边缘实例
     *
     * 批量重启边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootInstanceRequest 请求对象
     * @return BatchRebootInstanceResponse
     */
    public BatchRebootInstanceResponse batchRebootInstance(BatchRebootInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.batchRebootInstance);
    }

    /**
     * 批量重启边缘实例
     *
     * 批量重启边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootInstanceRequest 请求对象
     * @return SyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse>
     */
    public SyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse> batchRebootInstanceInvoker(
        BatchRebootInstanceRequest request) {
        return new SyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse>(request,
            IecMeta.batchRebootInstance, hcClient);
    }

    /**
     * 批量启动边缘实例
     *
     * 批量操作启动边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartInstanceRequest 请求对象
     * @return BatchStartInstanceResponse
     */
    public BatchStartInstanceResponse batchStartInstance(BatchStartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.batchStartInstance);
    }

    /**
     * 批量启动边缘实例
     *
     * 批量操作启动边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartInstanceRequest 请求对象
     * @return SyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse>
     */
    public SyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse> batchStartInstanceInvoker(
        BatchStartInstanceRequest request) {
        return new SyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse>(request,
            IecMeta.batchStartInstance, hcClient);
    }

    /**
     * 批量关机边缘实例
     *
     * 批量关闭边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopInstanceRequest 请求对象
     * @return BatchStopInstanceResponse
     */
    public BatchStopInstanceResponse batchStopInstance(BatchStopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.batchStopInstance);
    }

    /**
     * 批量关机边缘实例
     *
     * 批量关闭边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopInstanceRequest 请求对象
     * @return SyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse>
     */
    public SyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse> batchStopInstanceInvoker(
        BatchStopInstanceRequest request) {
        return new SyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse>(request, IecMeta.batchStopInstance,
            hcClient);
    }

    /**
     * 切换操作系统
     *
     * 切换边缘实例操作系统，支持边缘实例创建成功后，保持ip、数据盘不变的情况下重装操作系统。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至实例，实现切换操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOsRequest 请求对象
     * @return ChangeOsResponse
     */
    public ChangeOsResponse changeOs(ChangeOsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.changeOs);
    }

    /**
     * 切换操作系统
     *
     * 切换边缘实例操作系统，支持边缘实例创建成功后，保持ip、数据盘不变的情况下重装操作系统。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至实例，实现切换操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOsRequest 请求对象
     * @return SyncInvoker<ChangeOsRequest, ChangeOsResponse>
     */
    public SyncInvoker<ChangeOsRequest, ChangeOsResponse> changeOsInvoker(ChangeOsRequest request) {
        return new SyncInvoker<ChangeOsRequest, ChangeOsResponse>(request, IecMeta.changeOs, hcClient);
    }

    /**
     * 创建部署计划
     *
     * 为方便您的统一管理，以及跨边缘站点管理资源，IEC基于业务场景角度，定义了边缘业务。
     * 边缘业务即为逻辑层面的一套资源管理集合。这里的资源主要是指计算实例，包含实例规格、镜像、硬盘、网络等方面。通过指定计算实例的数量、调度策略以及区域分布等形成一套管理集合。[了解更多](https://support.huaweicloud.com/usermanual-iec/iec_02_0301.html)
     * 
     * 创建一个部署计划并执行，即可创建一个边缘业务。
     * 
     * - 边缘业务下实例分布取决于部署计划的实例分布与调度策略。
     * - 边缘业务下实例名称、规格、镜像等参数取决于部署计划配置计算实例字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentRequest 请求对象
     * @return CreateDeploymentResponse
     */
    public CreateDeploymentResponse createDeployment(CreateDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createDeployment);
    }

    /**
     * 创建部署计划
     *
     * 为方便您的统一管理，以及跨边缘站点管理资源，IEC基于业务场景角度，定义了边缘业务。
     * 边缘业务即为逻辑层面的一套资源管理集合。这里的资源主要是指计算实例，包含实例规格、镜像、硬盘、网络等方面。通过指定计算实例的数量、调度策略以及区域分布等形成一套管理集合。[了解更多](https://support.huaweicloud.com/usermanual-iec/iec_02_0301.html)
     * 
     * 创建一个部署计划并执行，即可创建一个边缘业务。
     * 
     * - 边缘业务下实例分布取决于部署计划的实例分布与调度策略。
     * - 边缘业务下实例名称、规格、镜像等参数取决于部署计划配置计算实例字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentRequest 请求对象
     * @return SyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>
     */
    public SyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse> createDeploymentInvoker(
        CreateDeploymentRequest request) {
        return new SyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>(request, IecMeta.createDeployment,
            hcClient);
    }

    /**
     * 创建和导入密钥
     *
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。
     * 
     * 创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录边缘实例。为保证边缘实例安全，私钥数据只能读取一次，请妥善保管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKeypairRequest 请求对象
     * @return CreateKeypairResponse
     */
    public CreateKeypairResponse createKeypair(CreateKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createKeypair);
    }

    /**
     * 创建和导入密钥
     *
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。
     * 
     * 创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录边缘实例。为保证边缘实例安全，私钥数据只能读取一次，请妥善保管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKeypairRequest 请求对象
     * @return SyncInvoker<CreateKeypairRequest, CreateKeypairResponse>
     */
    public SyncInvoker<CreateKeypairRequest, CreateKeypairResponse> createKeypairInvoker(CreateKeypairRequest request) {
        return new SyncInvoker<CreateKeypairRequest, CreateKeypairResponse>(request, IecMeta.createKeypair, hcClient);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePortRequest 请求对象
     * @return CreatePortResponse
     */
    public CreatePortResponse createPort(CreatePortRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createPort);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePortRequest 请求对象
     * @return SyncInvoker<CreatePortRequest, CreatePortResponse>
     */
    public SyncInvoker<CreatePortRequest, CreatePortResponse> createPortInvoker(CreatePortRequest request) {
        return new SyncInvoker<CreatePortRequest, CreatePortResponse>(request, IecMeta.createPort, hcClient);
    }

    /**
     * 创建路由
     *
     * 创建路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutesRequest 请求对象
     * @return CreateRoutesResponse
     */
    public CreateRoutesResponse createRoutes(CreateRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createRoutes);
    }

    /**
     * 创建路由
     *
     * 创建路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutesRequest 请求对象
     * @return SyncInvoker<CreateRoutesRequest, CreateRoutesResponse>
     */
    public SyncInvoker<CreateRoutesRequest, CreateRoutesResponse> createRoutesInvoker(CreateRoutesRequest request) {
        return new SyncInvoker<CreateRoutesRequest, CreateRoutesResponse>(request, IecMeta.createRoutes, hcClient);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutetableRequest 请求对象
     * @return CreateRoutetableResponse
     */
    public CreateRoutetableResponse createRoutetable(CreateRoutetableRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createRoutetable);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoutetableRequest 请求对象
     * @return SyncInvoker<CreateRoutetableRequest, CreateRoutetableResponse>
     */
    public SyncInvoker<CreateRoutetableRequest, CreateRoutetableResponse> createRoutetableInvoker(
        CreateRoutetableRequest request) {
        return new SyncInvoker<CreateRoutetableRequest, CreateRoutetableResponse>(request, IecMeta.createRoutetable,
            hcClient);
    }

    /**
     * 创建边缘安全组
     *
     * 根据用户的请求内容，创建对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createSecurityGroup);
    }

    /**
     * 创建边缘安全组
     *
     * 根据用户的请求内容，创建对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupInvoker(
        CreateSecurityGroupRequest request) {
        return new SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            IecMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 根据用户的请求内容，创建安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CreateSecurityGroupRuleResponse
     */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 根据用户的请求内容，创建安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            IecMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建虚拟私有云
     *
     * 根据用户的请求内容，创建虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return CreateVpcResponse
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createVpc);
    }

    /**
     * 创建虚拟私有云
     *
     * 根据用户的请求内容，创建虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return SyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public SyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcInvoker(CreateVpcRequest request) {
        return new SyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, IecMeta.createVpc, hcClient);
    }

    /**
     * 删除部署计划
     *
     * 删除部署计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return DeleteDeploymentResponse
     */
    public DeleteDeploymentResponse deleteDeployment(DeleteDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteDeployment);
    }

    /**
     * 删除部署计划
     *
     * 删除部署计划。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>
     */
    public SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeploymentInvoker(
        DeleteDeploymentRequest request) {
        return new SyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>(request, IecMeta.deleteDeployment,
            hcClient);
    }

    /**
     * 删除边缘业务
     *
     * 删除边缘业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeCloudRequest 请求对象
     * @return DeleteEdgeCloudResponse
     */
    public DeleteEdgeCloudResponse deleteEdgeCloud(DeleteEdgeCloudRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteEdgeCloud);
    }

    /**
     * 删除边缘业务
     *
     * 删除边缘业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeCloudRequest 请求对象
     * @return SyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse>
     */
    public SyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> deleteEdgeCloudInvoker(
        DeleteEdgeCloudRequest request) {
        return new SyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse>(request, IecMeta.deleteEdgeCloud,
            hcClient);
    }

    /**
     * 批量删除边缘实例
     *
     * 批量删除边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstancesRequest 请求对象
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteInstances);
    }

    /**
     * 批量删除边缘实例
     *
     * 批量删除边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstancesRequest 请求对象
     * @return SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>
     */
    public SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstancesInvoker(
        DeleteInstancesRequest request) {
        return new SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>(request, IecMeta.deleteInstances,
            hcClient);
    }

    /**
     * 删除密钥
     *
     * 删除密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKeypairRequest 请求对象
     * @return DeleteKeypairResponse
     */
    public DeleteKeypairResponse deleteKeypair(DeleteKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteKeypair);
    }

    /**
     * 删除密钥
     *
     * 删除密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKeypairRequest 请求对象
     * @return SyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>
     */
    public SyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypairInvoker(DeleteKeypairRequest request) {
        return new SyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>(request, IecMeta.deleteKeypair, hcClient);
    }

    /**
     * 删除网卡
     *
     * 删除网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNicsRequest 请求对象
     * @return DeleteNicsResponse
     */
    public DeleteNicsResponse deleteNics(DeleteNicsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteNics);
    }

    /**
     * 删除网卡
     *
     * 删除网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNicsRequest 请求对象
     * @return SyncInvoker<DeleteNicsRequest, DeleteNicsResponse>
     */
    public SyncInvoker<DeleteNicsRequest, DeleteNicsResponse> deleteNicsInvoker(DeleteNicsRequest request) {
        return new SyncInvoker<DeleteNicsRequest, DeleteNicsResponse>(request, IecMeta.deleteNics, hcClient);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortRequest 请求对象
     * @return DeletePortResponse
     */
    public DeletePortResponse deletePort(DeletePortRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deletePort);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortRequest 请求对象
     * @return SyncInvoker<DeletePortRequest, DeletePortResponse>
     */
    public SyncInvoker<DeletePortRequest, DeletePortResponse> deletePortInvoker(DeletePortRequest request) {
        return new SyncInvoker<DeletePortRequest, DeletePortResponse>(request, IecMeta.deletePort, hcClient);
    }

    /**
     * 删除路由
     *
     * 删除路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutesRequest 请求对象
     * @return DeleteRoutesResponse
     */
    public DeleteRoutesResponse deleteRoutes(DeleteRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteRoutes);
    }

    /**
     * 删除路由
     *
     * 删除路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutesRequest 请求对象
     * @return SyncInvoker<DeleteRoutesRequest, DeleteRoutesResponse>
     */
    public SyncInvoker<DeleteRoutesRequest, DeleteRoutesResponse> deleteRoutesInvoker(DeleteRoutesRequest request) {
        return new SyncInvoker<DeleteRoutesRequest, DeleteRoutesResponse>(request, IecMeta.deleteRoutes, hcClient);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutetableRequest 请求对象
     * @return DeleteRoutetableResponse
     */
    public DeleteRoutetableResponse deleteRoutetable(DeleteRoutetableRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteRoutetable);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoutetableRequest 请求对象
     * @return SyncInvoker<DeleteRoutetableRequest, DeleteRoutetableResponse>
     */
    public SyncInvoker<DeleteRoutetableRequest, DeleteRoutetableResponse> deleteRoutetableInvoker(
        DeleteRoutetableRequest request) {
        return new SyncInvoker<DeleteRoutetableRequest, DeleteRoutetableResponse>(request, IecMeta.deleteRoutetable,
            hcClient);
    }

    /**
     * 删除安全组
     *
     * 根据安全组的ID，删除对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 根据安全组的ID，删除对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupInvoker(
        DeleteSecurityGroupRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            IecMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 根据安全组的ID，删除对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return DeleteSecurityGroupRuleResponse
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 根据安全组的ID，删除对应的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            IecMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除子网
     *
     * 根据子网的ID，删除子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubnetRequest 请求对象
     * @return DeleteSubnetResponse
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteSubnet);
    }

    /**
     * 删除子网
     *
     * 根据子网的ID，删除子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubnetRequest 请求对象
     * @return SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>
     */
    public SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetInvoker(DeleteSubnetRequest request) {
        return new SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, IecMeta.deleteSubnet, hcClient);
    }

    /**
     * 删除虚拟私有云
     *
     * 根据虚拟机私有云的ID，删除对应的虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return DeleteVpcResponse
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteVpc);
    }

    /**
     * 删除虚拟私有云
     *
     * 根据虚拟机私有云的ID，删除对应的虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public SyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcInvoker(DeleteVpcRequest request) {
        return new SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, IecMeta.deleteVpc, hcClient);
    }

    /**
     * 路由表解关联子网
     *
     * 路由表解关联子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateSubnetRequest 请求对象
     * @return DisassociateSubnetResponse
     */
    public DisassociateSubnetResponse disassociateSubnet(DisassociateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.disassociateSubnet);
    }

    /**
     * 路由表解关联子网
     *
     * 路由表解关联子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateSubnetRequest 请求对象
     * @return SyncInvoker<DisassociateSubnetRequest, DisassociateSubnetResponse>
     */
    public SyncInvoker<DisassociateSubnetRequest, DisassociateSubnetResponse> disassociateSubnetInvoker(
        DisassociateSubnetRequest request) {
        return new SyncInvoker<DisassociateSubnetRequest, DisassociateSubnetResponse>(request,
            IecMeta.disassociateSubnet, hcClient);
    }

    /**
     * 执行部署计划
     *
     * 执行部署计划，创建一个边缘业务。单租户默认可创建10个边缘业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteDeploymentRequest 请求对象
     * @return ExecuteDeploymentResponse
     */
    public ExecuteDeploymentResponse executeDeployment(ExecuteDeploymentRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.executeDeployment);
    }

    /**
     * 执行部署计划
     *
     * 执行部署计划，创建一个边缘业务。单租户默认可创建10个边缘业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteDeploymentRequest 请求对象
     * @return SyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse>
     */
    public SyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse> executeDeploymentInvoker(
        ExecuteDeploymentRequest request) {
        return new SyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse>(request, IecMeta.executeDeployment,
            hcClient);
    }

    /**
     * 扩容边缘业务
     *
     * 执行部署计划，对边缘业务进行扩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandEdgecloudRequest 请求对象
     * @return ExpandEdgecloudResponse
     */
    public ExpandEdgecloudResponse expandEdgecloud(ExpandEdgecloudRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.expandEdgecloud);
    }

    /**
     * 扩容边缘业务
     *
     * 执行部署计划，对边缘业务进行扩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandEdgecloudRequest 请求对象
     * @return SyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse>
     */
    public SyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse> expandEdgecloudInvoker(
        ExpandEdgecloudRequest request) {
        return new SyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse>(request, IecMeta.expandEdgecloud,
            hcClient);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthsRequest 请求对象
     * @return ListBandwidthsResponse
     */
    public ListBandwidthsResponse listBandwidths(ListBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listBandwidths);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthsRequest 请求对象
     * @return SyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>
     */
    public SyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidthsInvoker(
        ListBandwidthsRequest request) {
        return new SyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>(request, IecMeta.listBandwidths,
            hcClient);
    }

    /**
     * 查询部署计划列表
     *
     * 查询部署计划列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeploymentsRequest 请求对象
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listDeployments);
    }

    /**
     * 查询部署计划列表
     *
     * 查询部署计划列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeploymentsRequest 请求对象
     * @return SyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>
     */
    public SyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse> listDeploymentsInvoker(
        ListDeploymentsRequest request) {
        return new SyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>(request, IecMeta.listDeployments,
            hcClient);
    }

    /**
     * 查询边缘业务列表
     *
     * 查询边缘业务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeCloudRequest 请求对象
     * @return ListEdgeCloudResponse
     */
    public ListEdgeCloudResponse listEdgeCloud(ListEdgeCloudRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listEdgeCloud);
    }

    /**
     * 查询边缘业务列表
     *
     * 查询边缘业务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeCloudRequest 请求对象
     * @return SyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse>
     */
    public SyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse> listEdgeCloudInvoker(ListEdgeCloudRequest request) {
        return new SyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse>(request, IecMeta.listEdgeCloud, hcClient);
    }

    /**
     * 查询边缘规格列表
     *
     * 查询边缘规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listFlavors);
    }

    /**
     * 查询边缘规格列表
     *
     * 查询边缘规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, IecMeta.listFlavors, hcClient);
    }

    /**
     * 查询镜像列表
     *
     * 根据不同条件查询镜像列表，例:
     * 
     * -  查询已注册的私有镜像列表: visibility&#x3D;private
     * - 公共镜像: visibility&#x3D;public
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listImages);
    }

    /**
     * 查询镜像列表
     *
     * 根据不同条件查询镜像列表，例:
     * 
     * -  查询已注册的私有镜像列表: visibility&#x3D;private
     * - 公共镜像: visibility&#x3D;public
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return SyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public SyncInvoker<ListImagesRequest, ListImagesResponse> listImagesInvoker(ListImagesRequest request) {
        return new SyncInvoker<ListImagesRequest, ListImagesResponse>(request, IecMeta.listImages, hcClient);
    }

    /**
     * 查询边缘实例列表
     *
     * 查询边缘实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listInstances);
    }

    /**
     * 查询边缘实例列表
     *
     * 查询边缘实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, IecMeta.listInstances, hcClient);
    }

    /**
     * 查询密钥列表
     *
     * 查询密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairsRequest 请求对象
     * @return ListKeypairsResponse
     */
    public ListKeypairsResponse listKeypairs(ListKeypairsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listKeypairs);
    }

    /**
     * 查询密钥列表
     *
     * 查询密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairsRequest 请求对象
     * @return SyncInvoker<ListKeypairsRequest, ListKeypairsResponse>
     */
    public SyncInvoker<ListKeypairsRequest, ListKeypairsResponse> listKeypairsInvoker(ListKeypairsRequest request) {
        return new SyncInvoker<ListKeypairsRequest, ListKeypairsResponse>(request, IecMeta.listKeypairs, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询端口的列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return ListPortsResponse
     */
    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询端口的列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return SyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<ListPortsRequest, ListPortsResponse>(request, IecMeta.listPorts, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询租户资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuota(ListQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listQuota);
    }

    /**
     * 查询配额
     *
     * 查询租户资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return SyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public SyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaInvoker(ListQuotaRequest request) {
        return new SyncInvoker<ListQuotaRequest, ListQuotaResponse>(request, IecMeta.listQuota, hcClient);
    }

    /**
     * 查询子网关联的路由表
     *
     * 查询子网关联的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelatedRoutetablesRequest 请求对象
     * @return ListRelatedRoutetablesResponse
     */
    public ListRelatedRoutetablesResponse listRelatedRoutetables(ListRelatedRoutetablesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listRelatedRoutetables);
    }

    /**
     * 查询子网关联的路由表
     *
     * 查询子网关联的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRelatedRoutetablesRequest 请求对象
     * @return SyncInvoker<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse>
     */
    public SyncInvoker<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse> listRelatedRoutetablesInvoker(
        ListRelatedRoutetablesRequest request) {
        return new SyncInvoker<ListRelatedRoutetablesRequest, ListRelatedRoutetablesResponse>(request,
            IecMeta.listRelatedRoutetables, hcClient);
    }

    /**
     * 查询路由列表
     *
     * 查询路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutesRequest 请求对象
     * @return ListRoutesResponse
     */
    public ListRoutesResponse listRoutes(ListRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listRoutes);
    }

    /**
     * 查询路由列表
     *
     * 查询路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutesRequest 请求对象
     * @return SyncInvoker<ListRoutesRequest, ListRoutesResponse>
     */
    public SyncInvoker<ListRoutesRequest, ListRoutesResponse> listRoutesInvoker(ListRoutesRequest request) {
        return new SyncInvoker<ListRoutesRequest, ListRoutesResponse>(request, IecMeta.listRoutes, hcClient);
    }

    /**
     * 查询路由表列表
     *
     * 查询路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutetablesRequest 请求对象
     * @return ListRoutetablesResponse
     */
    public ListRoutetablesResponse listRoutetables(ListRoutetablesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listRoutetables);
    }

    /**
     * 查询路由表列表
     *
     * 查询路由列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoutetablesRequest 请求对象
     * @return SyncInvoker<ListRoutetablesRequest, ListRoutetablesResponse>
     */
    public SyncInvoker<ListRoutetablesRequest, ListRoutetablesResponse> listRoutetablesInvoker(
        ListRoutetablesRequest request) {
        return new SyncInvoker<ListRoutetablesRequest, ListRoutetablesResponse>(request, IecMeta.listRoutetables,
            hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 根据用户的查询条件，获取安全组规则的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return ListSecurityGroupRulesResponse
     */
    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 根据用户的查询条件，获取安全组规则的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesInvoker(
        ListSecurityGroupRulesRequest request) {
        return new SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            IecMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 根据特定查询条件，获取安全组的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 根据特定查询条件，获取安全组的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            IecMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询边缘站点列表
     *
     * 查询边缘站点列表。
     * 
     * - 边缘站点：靠近终端应用的位置，基于一个或多个运营商建立的一个城市级站点。边缘站点提供物理隔离的资源池，提供多元算力、存储和网络的能力。用户可以将业务灵活就近部署在边缘站点上，以降低网络时延和成本。
     * - 边缘区域：为依据边缘站点的物理位置划分的区域，一个边缘区域包含多个相靠近的边缘站点的集合。IEC当前提供城市级、省级和大区级三个分布层级的边缘区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSitesRequest 请求对象
     * @return ListSitesResponse
     */
    public ListSitesResponse listSites(ListSitesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listSites);
    }

    /**
     * 查询边缘站点列表
     *
     * 查询边缘站点列表。
     * 
     * - 边缘站点：靠近终端应用的位置，基于一个或多个运营商建立的一个城市级站点。边缘站点提供物理隔离的资源池，提供多元算力、存储和网络的能力。用户可以将业务灵活就近部署在边缘站点上，以降低网络时延和成本。
     * - 边缘区域：为依据边缘站点的物理位置划分的区域，一个边缘区域包含多个相靠近的边缘站点的集合。IEC当前提供城市级、省级和大区级三个分布层级的边缘区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSitesRequest 请求对象
     * @return SyncInvoker<ListSitesRequest, ListSitesResponse>
     */
    public SyncInvoker<ListSitesRequest, ListSitesResponse> listSitesInvoker(ListSitesRequest request) {
        return new SyncInvoker<ListSitesRequest, ListSitesResponse>(request, IecMeta.listSites, hcClient);
    }

    /**
     * 查询子网列表
     *
     * 根据查询条件获取子网的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetsRequest 请求对象
     * @return ListSubnetsResponse
     */
    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listSubnets);
    }

    /**
     * 查询子网列表
     *
     * 根据查询条件获取子网的列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetsRequest 请求对象
     * @return SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public SyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsInvoker(ListSubnetsRequest request) {
        return new SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, IecMeta.listSubnets, hcClient);
    }

    /**
     * 查询虚拟私有云列表
     *
     * 获取虚拟私有云的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return ListVpcsResponse
     */
    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listVpcs);
    }

    /**
     * 查询虚拟私有云列表
     *
     * 获取虚拟私有云的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return SyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public SyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsInvoker(ListVpcsRequest request) {
        return new SyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, IecMeta.listVpcs, hcClient);
    }

    /**
     * 查询带宽详情
     *
     * 查询带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthRequest 请求对象
     * @return ShowBandwidthResponse
     */
    public ShowBandwidthResponse showBandwidth(ShowBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showBandwidth);
    }

    /**
     * 查询带宽详情
     *
     * 查询带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthRequest 请求对象
     * @return SyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>
     */
    public SyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidthInvoker(ShowBandwidthRequest request) {
        return new SyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>(request, IecMeta.showBandwidth, hcClient);
    }

    /**
     * 查询边缘业务详情
     *
     * 查询边缘业务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeCloudRequest 请求对象
     * @return ShowEdgeCloudResponse
     */
    public ShowEdgeCloudResponse showEdgeCloud(ShowEdgeCloudRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showEdgeCloud);
    }

    /**
     * 查询边缘业务详情
     *
     * 查询边缘业务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeCloudRequest 请求对象
     * @return SyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse>
     */
    public SyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse> showEdgeCloudInvoker(ShowEdgeCloudRequest request) {
        return new SyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse>(request, IecMeta.showEdgeCloud, hcClient);
    }

    /**
     * 查询镜像详情
     *
     * 查询镜像详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageRequest 请求对象
     * @return ShowImageResponse
     */
    public ShowImageResponse showImage(ShowImageRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showImage);
    }

    /**
     * 查询镜像详情
     *
     * 查询镜像详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageRequest 请求对象
     * @return SyncInvoker<ShowImageRequest, ShowImageResponse>
     */
    public SyncInvoker<ShowImageRequest, ShowImageResponse> showImageInvoker(ShowImageRequest request) {
        return new SyncInvoker<ShowImageRequest, ShowImageResponse>(request, IecMeta.showImage, hcClient);
    }

    /**
     * 查询边缘实例详情
     *
     * 查询边缘实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showInstance);
    }

    /**
     * 查询边缘实例详情
     *
     * 查询边缘实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, IecMeta.showInstance, hcClient);
    }

    /**
     * 查询密钥详情
     *
     * 查询密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowKeypairRequest 请求对象
     * @return ShowKeypairResponse
     */
    public ShowKeypairResponse showKeypair(ShowKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showKeypair);
    }

    /**
     * 查询密钥详情
     *
     * 查询密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowKeypairRequest 请求对象
     * @return SyncInvoker<ShowKeypairRequest, ShowKeypairResponse>
     */
    public SyncInvoker<ShowKeypairRequest, ShowKeypairResponse> showKeypairInvoker(ShowKeypairRequest request) {
        return new SyncInvoker<ShowKeypairRequest, ShowKeypairResponse>(request, IecMeta.showKeypair, hcClient);
    }

    /**
     * 查询端口详情
     *
     * 根据端口的ID，获取端口的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPortRequest 请求对象
     * @return ShowPortResponse
     */
    public ShowPortResponse showPort(ShowPortRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showPort);
    }

    /**
     * 查询端口详情
     *
     * 根据端口的ID，获取端口的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPortRequest 请求对象
     * @return SyncInvoker<ShowPortRequest, ShowPortResponse>
     */
    public SyncInvoker<ShowPortRequest, ShowPortResponse> showPortInvoker(ShowPortRequest request) {
        return new SyncInvoker<ShowPortRequest, ShowPortResponse>(request, IecMeta.showPort, hcClient);
    }

    /**
     * 查询路由表详情
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoutetableRequest 请求对象
     * @return ShowRoutetableResponse
     */
    public ShowRoutetableResponse showRoutetable(ShowRoutetableRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showRoutetable);
    }

    /**
     * 查询路由表详情
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoutetableRequest 请求对象
     * @return SyncInvoker<ShowRoutetableRequest, ShowRoutetableResponse>
     */
    public SyncInvoker<ShowRoutetableRequest, ShowRoutetableResponse> showRoutetableInvoker(
        ShowRoutetableRequest request) {
        return new SyncInvoker<ShowRoutetableRequest, ShowRoutetableResponse>(request, IecMeta.showRoutetable,
            hcClient);
    }

    /**
     * 查询安全组详情
     *
     * 根据安全组的ID，获取特定安全组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return ShowSecurityGroupResponse
     */
    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showSecurityGroup);
    }

    /**
     * 查询安全组详情
     *
     * 根据安全组的ID，获取特定安全组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupInvoker(
        ShowSecurityGroupRequest request) {
        return new SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, IecMeta.showSecurityGroup,
            hcClient);
    }

    /**
     * 查询安全组规则详情
     *
     * 根据安全组规则的ID，获取安全组规则的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return ShowSecurityGroupRuleResponse
     */
    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则详情
     *
     * 根据安全组规则的ID，获取安全组规则的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            IecMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询子网详情
     *
     * 根据子网的ID，获取子网的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubnetRequest 请求对象
     * @return ShowSubnetResponse
     */
    public ShowSubnetResponse showSubnet(ShowSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showSubnet);
    }

    /**
     * 查询子网详情
     *
     * 根据子网的ID，获取子网的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubnetRequest 请求对象
     * @return SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>
     */
    public SyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetInvoker(ShowSubnetRequest request) {
        return new SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, IecMeta.showSubnet, hcClient);
    }

    /**
     * 查询硬盘详情
     *
     * 查询硬盘详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVolumeRequest 请求对象
     * @return ShowVolumeResponse
     */
    public ShowVolumeResponse showVolume(ShowVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showVolume);
    }

    /**
     * 查询硬盘详情
     *
     * 查询硬盘详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVolumeRequest 请求对象
     * @return SyncInvoker<ShowVolumeRequest, ShowVolumeResponse>
     */
    public SyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeInvoker(ShowVolumeRequest request) {
        return new SyncInvoker<ShowVolumeRequest, ShowVolumeResponse>(request, IecMeta.showVolume, hcClient);
    }

    /**
     * 查询虚拟私有云详情
     *
     * 根据虚拟私有云ID，获取虚拟私有云的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return ShowVpcResponse
     */
    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showVpc);
    }

    /**
     * 查询虚拟私有云详情
     *
     * 根据虚拟私有云ID，获取虚拟私有云的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return SyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public SyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcInvoker(ShowVpcRequest request) {
        return new SyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, IecMeta.showVpc, hcClient);
    }

    /**
     * 修改边缘实例
     *
     * 修改边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updateInstance);
    }

    /**
     * 修改边缘实例
     *
     * 修改边缘实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, IecMeta.updateInstance,
            hcClient);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return UpdatePortResponse
     */
    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updatePort);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return SyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, IecMeta.updatePort, hcClient);
    }

    /**
     * 更新路由
     *
     * 更新路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutesRequest 请求对象
     * @return UpdateRoutesResponse
     */
    public UpdateRoutesResponse updateRoutes(UpdateRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updateRoutes);
    }

    /**
     * 更新路由
     *
     * 更新路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutesRequest 请求对象
     * @return SyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>
     */
    public SyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutesInvoker(UpdateRoutesRequest request) {
        return new SyncInvoker<UpdateRoutesRequest, UpdateRoutesResponse>(request, IecMeta.updateRoutes, hcClient);
    }

    /**
     * 更新路由表
     *
     * 更新路由表基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutetableRequest 请求对象
     * @return UpdateRoutetableResponse
     */
    public UpdateRoutetableResponse updateRoutetable(UpdateRoutetableRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updateRoutetable);
    }

    /**
     * 更新路由表
     *
     * 更新路由表基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoutetableRequest 请求对象
     * @return SyncInvoker<UpdateRoutetableRequest, UpdateRoutetableResponse>
     */
    public SyncInvoker<UpdateRoutetableRequest, UpdateRoutetableResponse> updateRoutetableInvoker(
        UpdateRoutetableRequest request) {
        return new SyncInvoker<UpdateRoutetableRequest, UpdateRoutetableResponse>(request, IecMeta.updateRoutetable,
            hcClient);
    }

    /**
     * 更新子网
     *
     * 更新子网的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubnetRequest 请求对象
     * @return UpdateSubnetResponse
     */
    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updateSubnet);
    }

    /**
     * 更新子网
     *
     * 更新子网的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubnetRequest 请求对象
     * @return SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>
     */
    public SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetInvoker(UpdateSubnetRequest request) {
        return new SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, IecMeta.updateSubnet, hcClient);
    }

    /**
     * 更新虚拟私有云
     *
     * 更新虚拟私有云的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return UpdateVpcResponse
     */
    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updateVpc);
    }

    /**
     * 更新虚拟私有云
     *
     * 更新虚拟私有云的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public SyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcInvoker(UpdateVpcRequest request) {
        return new SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, IecMeta.updateVpc, hcClient);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFirewallRequest 请求对象
     * @return CreateFirewallResponse
     */
    public CreateFirewallResponse createFirewall(CreateFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createFirewall);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFirewallRequest 请求对象
     * @return SyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public SyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallInvoker(
        CreateFirewallRequest request) {
        return new SyncInvoker<CreateFirewallRequest, CreateFirewallResponse>(request, IecMeta.createFirewall,
            hcClient);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFirewallRequest 请求对象
     * @return DeleteFirewallResponse
     */
    public DeleteFirewallResponse deleteFirewall(DeleteFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deleteFirewall);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFirewallRequest 请求对象
     * @return SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallInvoker(
        DeleteFirewallRequest request) {
        return new SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>(request, IecMeta.deleteFirewall,
            hcClient);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallsRequest 请求对象
     * @return ListFirewallsResponse
     */
    public ListFirewallsResponse listFirewalls(ListFirewallsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listFirewalls);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallsRequest 请求对象
     * @return SyncInvoker<ListFirewallsRequest, ListFirewallsResponse>
     */
    public SyncInvoker<ListFirewallsRequest, ListFirewallsResponse> listFirewallsInvoker(ListFirewallsRequest request) {
        return new SyncInvoker<ListFirewallsRequest, ListFirewallsResponse>(request, IecMeta.listFirewalls, hcClient);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFirewallRequest 请求对象
     * @return ShowFirewallResponse
     */
    public ShowFirewallResponse showFirewall(ShowFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showFirewall);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFirewallRequest 请求对象
     * @return SyncInvoker<ShowFirewallRequest, ShowFirewallResponse>
     */
    public SyncInvoker<ShowFirewallRequest, ShowFirewallResponse> showFirewallInvoker(ShowFirewallRequest request) {
        return new SyncInvoker<ShowFirewallRequest, ShowFirewallResponse>(request, IecMeta.showFirewall, hcClient);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRequest 请求对象
     * @return UpdateFirewallResponse
     */
    public UpdateFirewallResponse updateFirewall(UpdateFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updateFirewall);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRequest 请求对象
     * @return SyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>
     */
    public SyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewallInvoker(
        UpdateFirewallRequest request) {
        return new SyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>(request, IecMeta.updateFirewall,
            hcClient);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRuleRequest 请求对象
     * @return UpdateFirewallRuleResponse
     */
    public UpdateFirewallRuleResponse updateFirewallRule(UpdateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updateFirewallRule);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRuleRequest 请求对象
     * @return SyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse>
     */
    public SyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> updateFirewallRuleInvoker(
        UpdateFirewallRuleRequest request) {
        return new SyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse>(request,
            IecMeta.updateFirewallRule, hcClient);
    }

    /**
     * 创建弹性公网IP
     *
     * 根据用户的请求内容，创建弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicIpRequest 请求对象
     * @return CreatePublicIpResponse
     */
    public CreatePublicIpResponse createPublicIp(CreatePublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.createPublicIp);
    }

    /**
     * 创建弹性公网IP
     *
     * 根据用户的请求内容，创建弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicIpRequest 请求对象
     * @return SyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse>
     */
    public SyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse> createPublicIpInvoker(
        CreatePublicIpRequest request) {
        return new SyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse>(request, IecMeta.createPublicIp,
            hcClient);
    }

    /**
     * 删除弹性公网IP
     *
     * 根据弹性公网IP的ID，删除对应的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicIpRequest 请求对象
     * @return DeletePublicIpResponse
     */
    public DeletePublicIpResponse deletePublicIp(DeletePublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.deletePublicIp);
    }

    /**
     * 删除弹性公网IP
     *
     * 根据弹性公网IP的ID，删除对应的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicIpRequest 请求对象
     * @return SyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse>
     */
    public SyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse> deletePublicIpInvoker(
        DeletePublicIpRequest request) {
        return new SyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse>(request, IecMeta.deletePublicIp,
            hcClient);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 获取弹性公网IP列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicIpsRequest 请求对象
     * @return ListPublicIpsResponse
     */
    public ListPublicIpsResponse listPublicIps(ListPublicIpsRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.listPublicIps);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 获取弹性公网IP列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicIpsRequest 请求对象
     * @return SyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse>
     */
    public SyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse> listPublicIpsInvoker(ListPublicIpsRequest request) {
        return new SyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse>(request, IecMeta.listPublicIps, hcClient);
    }

    /**
     * 查询弹性公网IP
     *
     * 获取弹性公网IP的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicIpRequest 请求对象
     * @return ShowPublicIpResponse
     */
    public ShowPublicIpResponse showPublicIp(ShowPublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.showPublicIp);
    }

    /**
     * 查询弹性公网IP
     *
     * 获取弹性公网IP的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicIpRequest 请求对象
     * @return SyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse>
     */
    public SyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse> showPublicIpInvoker(ShowPublicIpRequest request) {
        return new SyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse>(request, IecMeta.showPublicIp, hcClient);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP的信息，主要用于解绑和绑定EIP和VIP之间的关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicIpRequest 请求对象
     * @return UpdatePublicIpResponse
     */
    public UpdatePublicIpResponse updatePublicIp(UpdatePublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, IecMeta.updatePublicIp);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP的信息，主要用于解绑和绑定EIP和VIP之间的关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicIpRequest 请求对象
     * @return SyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse>
     */
    public SyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse> updatePublicIpInvoker(
        UpdatePublicIpRequest request) {
        return new SyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse>(request, IecMeta.updatePublicIp,
            hcClient);
    }

}
