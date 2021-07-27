package com.huaweicloud.sdk.iec.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iec.v1.model.*;

public class IecAsyncClient {
    protected HcClient hcClient;

    public IecAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IecAsyncClient> newBuilder() {
        return new ClientBuilder<>(IecAsyncClient::new, "GlobalCredentials");
    }


    /**
     * 添加网卡
     * 添加网卡。
     *
     * @param AddNicsRequest 请求对象
     * @return CompletableFuture<AddNicsResponse>
     */
    public CompletableFuture<AddNicsResponse> addNicsAsync(AddNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.addNics);
    }

    /**
     * 添加网卡
     * 添加网卡。
     *
     * @param AddNicsRequest 请求对象
     * @return AsyncInvoker<AddNicsRequest, AddNicsResponse>
     */
    public AsyncInvoker<AddNicsRequest, AddNicsResponse> addNicsAsyncInvoker(AddNicsRequest request) {
        return new AsyncInvoker<AddNicsRequest, AddNicsResponse>(request, IecMeta.addNics, hcClient);
    }

    /**
     * 批量重启边缘实例
     * 批量重启边缘实例。
     *
     * @param BatchRebootInstanceRequest 请求对象
     * @return CompletableFuture<BatchRebootInstanceResponse>
     */
    public CompletableFuture<BatchRebootInstanceResponse> batchRebootInstanceAsync(BatchRebootInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.batchRebootInstance);
    }

    /**
     * 批量重启边缘实例
     * 批量重启边缘实例。
     *
     * @param BatchRebootInstanceRequest 请求对象
     * @return AsyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse>
     */
    public AsyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse> batchRebootInstanceAsyncInvoker(BatchRebootInstanceRequest request) {
        return new AsyncInvoker<BatchRebootInstanceRequest, BatchRebootInstanceResponse>(request, IecMeta.batchRebootInstance, hcClient);
    }

    /**
     * 批量启动边缘实例
     * 批量操作启动边缘实例。
     *
     * @param BatchStartInstanceRequest 请求对象
     * @return CompletableFuture<BatchStartInstanceResponse>
     */
    public CompletableFuture<BatchStartInstanceResponse> batchStartInstanceAsync(BatchStartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.batchStartInstance);
    }

    /**
     * 批量启动边缘实例
     * 批量操作启动边缘实例。
     *
     * @param BatchStartInstanceRequest 请求对象
     * @return AsyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse>
     */
    public AsyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse> batchStartInstanceAsyncInvoker(BatchStartInstanceRequest request) {
        return new AsyncInvoker<BatchStartInstanceRequest, BatchStartInstanceResponse>(request, IecMeta.batchStartInstance, hcClient);
    }

    /**
     * 批量关机边缘实例
     * 批量关闭边缘实例。
     *
     * @param BatchStopInstanceRequest 请求对象
     * @return CompletableFuture<BatchStopInstanceResponse>
     */
    public CompletableFuture<BatchStopInstanceResponse> batchStopInstanceAsync(BatchStopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.batchStopInstance);
    }

    /**
     * 批量关机边缘实例
     * 批量关闭边缘实例。
     *
     * @param BatchStopInstanceRequest 请求对象
     * @return AsyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse>
     */
    public AsyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse> batchStopInstanceAsyncInvoker(BatchStopInstanceRequest request) {
        return new AsyncInvoker<BatchStopInstanceRequest, BatchStopInstanceResponse>(request, IecMeta.batchStopInstance, hcClient);
    }

    /**
     * 切换操作系统
     * 切换边缘实例操作系统，支持边缘实例创建成功后，保持ip、数据盘不变的情况下重装操作系统。  调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至实例，实现切换操作系统功能。
     *
     * @param ChangeOsRequest 请求对象
     * @return CompletableFuture<ChangeOsResponse>
     */
    public CompletableFuture<ChangeOsResponse> changeOsAsync(ChangeOsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.changeOs);
    }

    /**
     * 切换操作系统
     * 切换边缘实例操作系统，支持边缘实例创建成功后，保持ip、数据盘不变的情况下重装操作系统。  调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至实例，实现切换操作系统功能。
     *
     * @param ChangeOsRequest 请求对象
     * @return AsyncInvoker<ChangeOsRequest, ChangeOsResponse>
     */
    public AsyncInvoker<ChangeOsRequest, ChangeOsResponse> changeOsAsyncInvoker(ChangeOsRequest request) {
        return new AsyncInvoker<ChangeOsRequest, ChangeOsResponse>(request, IecMeta.changeOs, hcClient);
    }

    /**
     * 创建部署计划
     * 为方便您的统一管理，以及跨边缘站点管理资源，IEC基于业务场景角度，定义了边缘业务。 边缘业务即为逻辑层面的一套资源管理集合。这里的资源主要是指计算实例，包含实例规格、镜像、硬盘、网络等方面。通过指定计算实例的数量、调度策略以及区域分布等形成一套管理集合。[了解更多](https://support.huaweicloud.com/usermanual-iec/iec_02_0301.html)  创建一个部署计划并执行，即可创建一个边缘业务。  - 边缘业务下实例分布取决于部署计划的实例分布与调度策略。 - 边缘业务下实例名称、规格、镜像等参数取决于部署计划配置计算实例字段。
     *
     * @param CreateDeploymentRequest 请求对象
     * @return CompletableFuture<CreateDeploymentResponse>
     */
    public CompletableFuture<CreateDeploymentResponse> createDeploymentAsync(CreateDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createDeployment);
    }

    /**
     * 创建部署计划
     * 为方便您的统一管理，以及跨边缘站点管理资源，IEC基于业务场景角度，定义了边缘业务。 边缘业务即为逻辑层面的一套资源管理集合。这里的资源主要是指计算实例，包含实例规格、镜像、硬盘、网络等方面。通过指定计算实例的数量、调度策略以及区域分布等形成一套管理集合。[了解更多](https://support.huaweicloud.com/usermanual-iec/iec_02_0301.html)  创建一个部署计划并执行，即可创建一个边缘业务。  - 边缘业务下实例分布取决于部署计划的实例分布与调度策略。 - 边缘业务下实例名称、规格、镜像等参数取决于部署计划配置计算实例字段。
     *
     * @param CreateDeploymentRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>
     */
    public AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse> createDeploymentAsyncInvoker(CreateDeploymentRequest request) {
        return new AsyncInvoker<CreateDeploymentRequest, CreateDeploymentResponse>(request, IecMeta.createDeployment, hcClient);
    }

    /**
     * 创建和导入密钥
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。  创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录边缘实例。为保证边缘实例安全，私钥数据只能读取一次，请妥善保管。
     *
     * @param CreateKeypairRequest 请求对象
     * @return CompletableFuture<CreateKeypairResponse>
     */
    public CompletableFuture<CreateKeypairResponse> createKeypairAsync(CreateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createKeypair);
    }

    /**
     * 创建和导入密钥
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。  创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录边缘实例。为保证边缘实例安全，私钥数据只能读取一次，请妥善保管。
     *
     * @param CreateKeypairRequest 请求对象
     * @return AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse>
     */
    public AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse> createKeypairAsyncInvoker(CreateKeypairRequest request) {
        return new AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse>(request, IecMeta.createKeypair, hcClient);
    }

    /**
     * 创建端口
     * 创建端口。
     *
     * @param CreatePortRequest 请求对象
     * @return CompletableFuture<CreatePortResponse>
     */
    public CompletableFuture<CreatePortResponse> createPortAsync(CreatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createPort);
    }

    /**
     * 创建端口
     * 创建端口。
     *
     * @param CreatePortRequest 请求对象
     * @return AsyncInvoker<CreatePortRequest, CreatePortResponse>
     */
    public AsyncInvoker<CreatePortRequest, CreatePortResponse> createPortAsyncInvoker(CreatePortRequest request) {
        return new AsyncInvoker<CreatePortRequest, CreatePortResponse>(request, IecMeta.createPort, hcClient);
    }

    /**
     * 创建边缘安全组
     * 根据用户的请求内容，创建对应的安全组。
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupResponse>
     */
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createSecurityGroup);
    }

    /**
     * 创建边缘安全组
     * 根据用户的请求内容，创建对应的安全组。
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupAsyncInvoker(CreateSecurityGroupRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request, IecMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     * 根据用户的请求内容，创建安全组规则。
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupRuleResponse>
     */
    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     * 根据用户的请求内容，创建安全组规则。
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsyncInvoker(CreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request, IecMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建虚拟私有云
     * 根据用户的请求内容，创建虚拟私有云。
     *
     * @param CreateVpcRequest 请求对象
     * @return CompletableFuture<CreateVpcResponse>
     */
    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createVpc);
    }

    /**
     * 创建虚拟私有云
     * 根据用户的请求内容，创建虚拟私有云。
     *
     * @param CreateVpcRequest 请求对象
     * @return AsyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public AsyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcAsyncInvoker(CreateVpcRequest request) {
        return new AsyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, IecMeta.createVpc, hcClient);
    }

    /**
     * 删除部署计划
     * 删除部署计划。
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentResponse>
     */
    public CompletableFuture<DeleteDeploymentResponse> deleteDeploymentAsync(DeleteDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteDeployment);
    }

    /**
     * 删除部署计划
     * 删除部署计划。
     *
     * @param DeleteDeploymentRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>
     */
    public AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeploymentAsyncInvoker(DeleteDeploymentRequest request) {
        return new AsyncInvoker<DeleteDeploymentRequest, DeleteDeploymentResponse>(request, IecMeta.deleteDeployment, hcClient);
    }

    /**
     * 删除边缘业务
     * 删除边缘业务以及其下边缘实例。
     *
     * @param DeleteEdgeCloudRequest 请求对象
     * @return CompletableFuture<DeleteEdgeCloudResponse>
     */
    public CompletableFuture<DeleteEdgeCloudResponse> deleteEdgeCloudAsync(DeleteEdgeCloudRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteEdgeCloud);
    }

    /**
     * 删除边缘业务
     * 删除边缘业务以及其下边缘实例。
     *
     * @param DeleteEdgeCloudRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse>
     */
    public AsyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse> deleteEdgeCloudAsyncInvoker(DeleteEdgeCloudRequest request) {
        return new AsyncInvoker<DeleteEdgeCloudRequest, DeleteEdgeCloudResponse>(request, IecMeta.deleteEdgeCloud, hcClient);
    }

    /**
     * 批量删除边缘实例
     * 批量删除边缘实例。
     *
     * @param DeleteInstancesRequest 请求对象
     * @return CompletableFuture<DeleteInstancesResponse>
     */
    public CompletableFuture<DeleteInstancesResponse> deleteInstancesAsync(DeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteInstances);
    }

    /**
     * 批量删除边缘实例
     * 批量删除边缘实例。
     *
     * @param DeleteInstancesRequest 请求对象
     * @return AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>
     */
    public AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstancesAsyncInvoker(DeleteInstancesRequest request) {
        return new AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>(request, IecMeta.deleteInstances, hcClient);
    }

    /**
     * 删除密钥
     * 删除密钥。
     *
     * @param DeleteKeypairRequest 请求对象
     * @return CompletableFuture<DeleteKeypairResponse>
     */
    public CompletableFuture<DeleteKeypairResponse> deleteKeypairAsync(DeleteKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteKeypair);
    }

    /**
     * 删除密钥
     * 删除密钥。
     *
     * @param DeleteKeypairRequest 请求对象
     * @return AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>
     */
    public AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypairAsyncInvoker(DeleteKeypairRequest request) {
        return new AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>(request, IecMeta.deleteKeypair, hcClient);
    }

    /**
     * 删除网卡
     * 删除网卡。
     *
     * @param DeleteNicsRequest 请求对象
     * @return CompletableFuture<DeleteNicsResponse>
     */
    public CompletableFuture<DeleteNicsResponse> deleteNicsAsync(DeleteNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteNics);
    }

    /**
     * 删除网卡
     * 删除网卡。
     *
     * @param DeleteNicsRequest 请求对象
     * @return AsyncInvoker<DeleteNicsRequest, DeleteNicsResponse>
     */
    public AsyncInvoker<DeleteNicsRequest, DeleteNicsResponse> deleteNicsAsyncInvoker(DeleteNicsRequest request) {
        return new AsyncInvoker<DeleteNicsRequest, DeleteNicsResponse>(request, IecMeta.deleteNics, hcClient);
    }

    /**
     * 删除端口
     * 删除端口。
     *
     * @param DeletePortRequest 请求对象
     * @return CompletableFuture<DeletePortResponse>
     */
    public CompletableFuture<DeletePortResponse> deletePortAsync(DeletePortRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deletePort);
    }

    /**
     * 删除端口
     * 删除端口。
     *
     * @param DeletePortRequest 请求对象
     * @return AsyncInvoker<DeletePortRequest, DeletePortResponse>
     */
    public AsyncInvoker<DeletePortRequest, DeletePortResponse> deletePortAsyncInvoker(DeletePortRequest request) {
        return new AsyncInvoker<DeletePortRequest, DeletePortResponse>(request, IecMeta.deletePort, hcClient);
    }

    /**
     * 删除安全组
     * 根据安全组的ID，删除对应的安全组。
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupResponse>
     */
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     * 根据安全组的ID，删除对应的安全组。
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupAsyncInvoker(DeleteSecurityGroupRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request, IecMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     * 根据安全组的ID，删除对应的安全组。
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupRuleResponse>
     */
    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     * 根据安全组的ID，删除对应的安全组。
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsyncInvoker(DeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request, IecMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除子网
     * 根据子网的ID，删除子网。
     *
     * @param DeleteSubnetRequest 请求对象
     * @return CompletableFuture<DeleteSubnetResponse>
     */
    public CompletableFuture<DeleteSubnetResponse> deleteSubnetAsync(DeleteSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteSubnet);
    }

    /**
     * 删除子网
     * 根据子网的ID，删除子网。
     *
     * @param DeleteSubnetRequest 请求对象
     * @return AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>
     */
    public AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetAsyncInvoker(DeleteSubnetRequest request) {
        return new AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, IecMeta.deleteSubnet, hcClient);
    }

    /**
     * 删除虚拟私有云
     * 根据虚拟机私有云的ID，删除对应的虚拟私有云。
     *
     * @param DeleteVpcRequest 请求对象
     * @return CompletableFuture<DeleteVpcResponse>
     */
    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteVpc);
    }

    /**
     * 删除虚拟私有云
     * 根据虚拟机私有云的ID，删除对应的虚拟私有云。
     *
     * @param DeleteVpcRequest 请求对象
     * @return AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcAsyncInvoker(DeleteVpcRequest request) {
        return new AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, IecMeta.deleteVpc, hcClient);
    }

    /**
     * 执行部署计划
     * 执行部署计划，创建一个边缘业务。单租户默认可创建10个边缘业务。
     *
     * @param ExecuteDeploymentRequest 请求对象
     * @return CompletableFuture<ExecuteDeploymentResponse>
     */
    public CompletableFuture<ExecuteDeploymentResponse> executeDeploymentAsync(ExecuteDeploymentRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.executeDeployment);
    }

    /**
     * 执行部署计划
     * 执行部署计划，创建一个边缘业务。单租户默认可创建10个边缘业务。
     *
     * @param ExecuteDeploymentRequest 请求对象
     * @return AsyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse>
     */
    public AsyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse> executeDeploymentAsyncInvoker(ExecuteDeploymentRequest request) {
        return new AsyncInvoker<ExecuteDeploymentRequest, ExecuteDeploymentResponse>(request, IecMeta.executeDeployment, hcClient);
    }

    /**
     * 扩容边缘业务
     * 执行部署计划，对边缘业务进行扩容操作。
     *
     * @param ExpandEdgecloudRequest 请求对象
     * @return CompletableFuture<ExpandEdgecloudResponse>
     */
    public CompletableFuture<ExpandEdgecloudResponse> expandEdgecloudAsync(ExpandEdgecloudRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.expandEdgecloud);
    }

    /**
     * 扩容边缘业务
     * 执行部署计划，对边缘业务进行扩容操作。
     *
     * @param ExpandEdgecloudRequest 请求对象
     * @return AsyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse>
     */
    public AsyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse> expandEdgecloudAsyncInvoker(ExpandEdgecloudRequest request) {
        return new AsyncInvoker<ExpandEdgecloudRequest, ExpandEdgecloudResponse>(request, IecMeta.expandEdgecloud, hcClient);
    }

    /**
     * 查询带宽列表
     * 查询带宽列表。
     *
     * @param ListBandwidthsRequest 请求对象
     * @return CompletableFuture<ListBandwidthsResponse>
     */
    public CompletableFuture<ListBandwidthsResponse> listBandwidthsAsync(ListBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listBandwidths);
    }

    /**
     * 查询带宽列表
     * 查询带宽列表。
     *
     * @param ListBandwidthsRequest 请求对象
     * @return AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>
     */
    public AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidthsAsyncInvoker(ListBandwidthsRequest request) {
        return new AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>(request, IecMeta.listBandwidths, hcClient);
    }

    /**
     * 查询部署计划列表
     * 查询部署计划列表。
     *
     * @param ListDeploymentsRequest 请求对象
     * @return CompletableFuture<ListDeploymentsResponse>
     */
    public CompletableFuture<ListDeploymentsResponse> listDeploymentsAsync(ListDeploymentsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listDeployments);
    }

    /**
     * 查询部署计划列表
     * 查询部署计划列表。
     *
     * @param ListDeploymentsRequest 请求对象
     * @return AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>
     */
    public AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse> listDeploymentsAsyncInvoker(ListDeploymentsRequest request) {
        return new AsyncInvoker<ListDeploymentsRequest, ListDeploymentsResponse>(request, IecMeta.listDeployments, hcClient);
    }

    /**
     * 查询边缘业务列表
     * 查询边缘业务列表。
     *
     * @param ListEdgeCloudRequest 请求对象
     * @return CompletableFuture<ListEdgeCloudResponse>
     */
    public CompletableFuture<ListEdgeCloudResponse> listEdgeCloudAsync(ListEdgeCloudRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listEdgeCloud);
    }

    /**
     * 查询边缘业务列表
     * 查询边缘业务列表。
     *
     * @param ListEdgeCloudRequest 请求对象
     * @return AsyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse>
     */
    public AsyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse> listEdgeCloudAsyncInvoker(ListEdgeCloudRequest request) {
        return new AsyncInvoker<ListEdgeCloudRequest, ListEdgeCloudResponse>(request, IecMeta.listEdgeCloud, hcClient);
    }

    /**
     * 查询边缘规格列表
     * 查询边缘规格列表。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listFlavors);
    }

    /**
     * 查询边缘规格列表
     * 查询边缘规格列表。
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, IecMeta.listFlavors, hcClient);
    }

    /**
     * 查询镜像列表
     * 根据不同条件查询镜像列表，例:  -  查询已注册的私有镜像列表: visibility&#x3D;private - 公共镜像: visibility&#x3D;public
     *
     * @param ListImagesRequest 请求对象
     * @return CompletableFuture<ListImagesResponse>
     */
    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listImages);
    }

    /**
     * 查询镜像列表
     * 根据不同条件查询镜像列表，例:  -  查询已注册的私有镜像列表: visibility&#x3D;private - 公共镜像: visibility&#x3D;public
     *
     * @param ListImagesRequest 请求对象
     * @return AsyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<ListImagesRequest, ListImagesResponse>(request, IecMeta.listImages, hcClient);
    }

    /**
     * 查询边缘实例列表
     * 查询边缘实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listInstances);
    }

    /**
     * 查询边缘实例列表
     * 查询边缘实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, IecMeta.listInstances, hcClient);
    }

    /**
     * 查询密钥列表
     * 查询密钥信息列表。
     *
     * @param ListKeypairsRequest 请求对象
     * @return CompletableFuture<ListKeypairsResponse>
     */
    public CompletableFuture<ListKeypairsResponse> listKeypairsAsync(ListKeypairsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listKeypairs);
    }

    /**
     * 查询密钥列表
     * 查询密钥信息列表。
     *
     * @param ListKeypairsRequest 请求对象
     * @return AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse>
     */
    public AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse> listKeypairsAsyncInvoker(ListKeypairsRequest request) {
        return new AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse>(request, IecMeta.listKeypairs, hcClient);
    }

    /**
     * 查询端口列表
     * 查询端口的列表信息
     *
     * @param ListPortsRequest 请求对象
     * @return CompletableFuture<ListPortsResponse>
     */
    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listPorts);
    }

    /**
     * 查询端口列表
     * 查询端口的列表信息
     *
     * @param ListPortsRequest 请求对象
     * @return AsyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public AsyncInvoker<ListPortsRequest, ListPortsResponse> listPortsAsyncInvoker(ListPortsRequest request) {
        return new AsyncInvoker<ListPortsRequest, ListPortsResponse>(request, IecMeta.listPorts, hcClient);
    }

    /**
     * 查询配额
     * 查询租户资源配额。
     *
     * @param ListQuotaRequest 请求对象
     * @return CompletableFuture<ListQuotaResponse>
     */
    public CompletableFuture<ListQuotaResponse> listQuotaAsync(ListQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listQuota);
    }

    /**
     * 查询配额
     * 查询租户资源配额。
     *
     * @param ListQuotaRequest 请求对象
     * @return AsyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public AsyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaAsyncInvoker(ListQuotaRequest request) {
        return new AsyncInvoker<ListQuotaRequest, ListQuotaResponse>(request, IecMeta.listQuota, hcClient);
    }

    /**
     * 查询安全组规则列表
     * 根据用户的查询条件，获取安全组规则的列表信息。
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupRulesResponse>
     */
    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     * 根据用户的查询条件，获取安全组规则的列表信息。
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesAsyncInvoker(ListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request, IecMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     * 根据特定查询条件，获取安全组的列表信息。
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     * 根据特定查询条件，获取安全组的列表信息。
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(ListSecurityGroupsRequest request) {
        return new AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request, IecMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询边缘站点列表
     * 查询边缘站点列表。  - 边缘站点：靠近终端应用的位置，基于一个或多个运营商建立的一个城市级站点。边缘站点提供物理隔离的资源池，提供多元算力、存储和网络的能力。用户可以将业务灵活就近部署在边缘站点上，以降低网络时延和成本。 - 边缘区域：为依据边缘站点的物理位置划分的区域，一个边缘区域包含多个相靠近的边缘站点的集合。IEC当前提供城市级、省级和大区级三个分布层级的边缘区域。
     *
     * @param ListSitesRequest 请求对象
     * @return CompletableFuture<ListSitesResponse>
     */
    public CompletableFuture<ListSitesResponse> listSitesAsync(ListSitesRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listSites);
    }

    /**
     * 查询边缘站点列表
     * 查询边缘站点列表。  - 边缘站点：靠近终端应用的位置，基于一个或多个运营商建立的一个城市级站点。边缘站点提供物理隔离的资源池，提供多元算力、存储和网络的能力。用户可以将业务灵活就近部署在边缘站点上，以降低网络时延和成本。 - 边缘区域：为依据边缘站点的物理位置划分的区域，一个边缘区域包含多个相靠近的边缘站点的集合。IEC当前提供城市级、省级和大区级三个分布层级的边缘区域。
     *
     * @param ListSitesRequest 请求对象
     * @return AsyncInvoker<ListSitesRequest, ListSitesResponse>
     */
    public AsyncInvoker<ListSitesRequest, ListSitesResponse> listSitesAsyncInvoker(ListSitesRequest request) {
        return new AsyncInvoker<ListSitesRequest, ListSitesResponse>(request, IecMeta.listSites, hcClient);
    }

    /**
     * 查询子网列表
     * 根据查询条件获取子网的列表信息。
     *
     * @param ListSubnetsRequest 请求对象
     * @return CompletableFuture<ListSubnetsResponse>
     */
    public CompletableFuture<ListSubnetsResponse> listSubnetsAsync(ListSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listSubnets);
    }

    /**
     * 查询子网列表
     * 根据查询条件获取子网的列表信息。
     *
     * @param ListSubnetsRequest 请求对象
     * @return AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsAsyncInvoker(ListSubnetsRequest request) {
        return new AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, IecMeta.listSubnets, hcClient);
    }

    /**
     * 查询虚拟私有云列表
     * 获取虚拟私有云的列表。
     *
     * @param ListVpcsRequest 请求对象
     * @return CompletableFuture<ListVpcsResponse>
     */
    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listVpcs);
    }

    /**
     * 查询虚拟私有云列表
     * 获取虚拟私有云的列表。
     *
     * @param ListVpcsRequest 请求对象
     * @return AsyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public AsyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsAsyncInvoker(ListVpcsRequest request) {
        return new AsyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, IecMeta.listVpcs, hcClient);
    }

    /**
     * 查询带宽详情
     * 查询带宽详情。
     *
     * @param ShowBandwidthRequest 请求对象
     * @return CompletableFuture<ShowBandwidthResponse>
     */
    public CompletableFuture<ShowBandwidthResponse> showBandwidthAsync(ShowBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showBandwidth);
    }

    /**
     * 查询带宽详情
     * 查询带宽详情。
     *
     * @param ShowBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>
     */
    public AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidthAsyncInvoker(ShowBandwidthRequest request) {
        return new AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>(request, IecMeta.showBandwidth, hcClient);
    }

    /**
     * 查询边缘业务详情
     * 查询边缘业务详情。
     *
     * @param ShowEdgeCloudRequest 请求对象
     * @return CompletableFuture<ShowEdgeCloudResponse>
     */
    public CompletableFuture<ShowEdgeCloudResponse> showEdgeCloudAsync(ShowEdgeCloudRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showEdgeCloud);
    }

    /**
     * 查询边缘业务详情
     * 查询边缘业务详情。
     *
     * @param ShowEdgeCloudRequest 请求对象
     * @return AsyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse>
     */
    public AsyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse> showEdgeCloudAsyncInvoker(ShowEdgeCloudRequest request) {
        return new AsyncInvoker<ShowEdgeCloudRequest, ShowEdgeCloudResponse>(request, IecMeta.showEdgeCloud, hcClient);
    }

    /**
     * 查询镜像详情
     * 查询镜像详情。
     *
     * @param ShowImageRequest 请求对象
     * @return CompletableFuture<ShowImageResponse>
     */
    public CompletableFuture<ShowImageResponse> showImageAsync(ShowImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showImage);
    }

    /**
     * 查询镜像详情
     * 查询镜像详情。
     *
     * @param ShowImageRequest 请求对象
     * @return AsyncInvoker<ShowImageRequest, ShowImageResponse>
     */
    public AsyncInvoker<ShowImageRequest, ShowImageResponse> showImageAsyncInvoker(ShowImageRequest request) {
        return new AsyncInvoker<ShowImageRequest, ShowImageResponse>(request, IecMeta.showImage, hcClient);
    }

    /**
     * 查询边缘实例详情
     * 查询边缘实例详情。
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showInstance);
    }

    /**
     * 查询边缘实例详情
     * 查询边缘实例详情。
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, IecMeta.showInstance, hcClient);
    }

    /**
     * 查询密钥详情
     * 查询密钥信息列表。
     *
     * @param ShowKeypairRequest 请求对象
     * @return CompletableFuture<ShowKeypairResponse>
     */
    public CompletableFuture<ShowKeypairResponse> showKeypairAsync(ShowKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showKeypair);
    }

    /**
     * 查询密钥详情
     * 查询密钥信息列表。
     *
     * @param ShowKeypairRequest 请求对象
     * @return AsyncInvoker<ShowKeypairRequest, ShowKeypairResponse>
     */
    public AsyncInvoker<ShowKeypairRequest, ShowKeypairResponse> showKeypairAsyncInvoker(ShowKeypairRequest request) {
        return new AsyncInvoker<ShowKeypairRequest, ShowKeypairResponse>(request, IecMeta.showKeypair, hcClient);
    }

    /**
     * 查询端口详情
     * 根据端口的ID，获取端口的详细信息。
     *
     * @param ShowPortRequest 请求对象
     * @return CompletableFuture<ShowPortResponse>
     */
    public CompletableFuture<ShowPortResponse> showPortAsync(ShowPortRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showPort);
    }

    /**
     * 查询端口详情
     * 根据端口的ID，获取端口的详细信息。
     *
     * @param ShowPortRequest 请求对象
     * @return AsyncInvoker<ShowPortRequest, ShowPortResponse>
     */
    public AsyncInvoker<ShowPortRequest, ShowPortResponse> showPortAsyncInvoker(ShowPortRequest request) {
        return new AsyncInvoker<ShowPortRequest, ShowPortResponse>(request, IecMeta.showPort, hcClient);
    }

    /**
     * 查询安全组详情
     * 根据安全组的ID，获取特定安全组的详细信息。
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupResponse>
     */
    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showSecurityGroup);
    }

    /**
     * 查询安全组详情
     * 根据安全组的ID，获取特定安全组的详细信息。
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupAsyncInvoker(ShowSecurityGroupRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, IecMeta.showSecurityGroup, hcClient);
    }

    /**
     * 查询安全组规则详情
     * 根据安全组规则的ID，获取安全组规则的详细信息。
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupRuleResponse>
     */
    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则详情
     * 根据安全组规则的ID，获取安全组规则的详细信息。
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsyncInvoker(ShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request, IecMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询子网详情
     * 根据子网的ID，获取子网的详细信息。
     *
     * @param ShowSubnetRequest 请求对象
     * @return CompletableFuture<ShowSubnetResponse>
     */
    public CompletableFuture<ShowSubnetResponse> showSubnetAsync(ShowSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showSubnet);
    }

    /**
     * 查询子网详情
     * 根据子网的ID，获取子网的详细信息。
     *
     * @param ShowSubnetRequest 请求对象
     * @return AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse>
     */
    public AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetAsyncInvoker(ShowSubnetRequest request) {
        return new AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, IecMeta.showSubnet, hcClient);
    }

    /**
     * 查询硬盘详情
     * 查询硬盘详情。
     *
     * @param ShowVolumeRequest 请求对象
     * @return CompletableFuture<ShowVolumeResponse>
     */
    public CompletableFuture<ShowVolumeResponse> showVolumeAsync(ShowVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showVolume);
    }

    /**
     * 查询硬盘详情
     * 查询硬盘详情。
     *
     * @param ShowVolumeRequest 请求对象
     * @return AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>
     */
    public AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeAsyncInvoker(ShowVolumeRequest request) {
        return new AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>(request, IecMeta.showVolume, hcClient);
    }

    /**
     * 查询虚拟私有云详情
     * 根据虚拟私有云ID，获取虚拟私有云的详情。
     *
     * @param ShowVpcRequest 请求对象
     * @return CompletableFuture<ShowVpcResponse>
     */
    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showVpc);
    }

    /**
     * 查询虚拟私有云详情
     * 根据虚拟私有云ID，获取虚拟私有云的详情。
     *
     * @param ShowVpcRequest 请求对象
     * @return AsyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public AsyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcAsyncInvoker(ShowVpcRequest request) {
        return new AsyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, IecMeta.showVpc, hcClient);
    }

    /**
     * 修改边缘实例
     * 修改边缘实例。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateInstance);
    }

    /**
     * 修改边缘实例
     * 修改边缘实例。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, IecMeta.updateInstance, hcClient);
    }

    /**
     * 更新端口
     * 更新端口。
     *
     * @param UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse>
     */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updatePort);
    }

    /**
     * 更新端口
     * 更新端口。
     *
     * @param UpdatePortRequest 请求对象
     * @return AsyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, IecMeta.updatePort, hcClient);
    }

    /**
     * 更新子网
     * 更新子网的基本信息。
     *
     * @param UpdateSubnetRequest 请求对象
     * @return CompletableFuture<UpdateSubnetResponse>
     */
    public CompletableFuture<UpdateSubnetResponse> updateSubnetAsync(UpdateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateSubnet);
    }

    /**
     * 更新子网
     * 更新子网的基本信息。
     *
     * @param UpdateSubnetRequest 请求对象
     * @return AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>
     */
    public AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetAsyncInvoker(UpdateSubnetRequest request) {
        return new AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, IecMeta.updateSubnet, hcClient);
    }

    /**
     * 更新虚拟私有云
     * 更新虚拟私有云的信息
     *
     * @param UpdateVpcRequest 请求对象
     * @return CompletableFuture<UpdateVpcResponse>
     */
    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateVpc);
    }

    /**
     * 更新虚拟私有云
     * 更新虚拟私有云的信息
     *
     * @param UpdateVpcRequest 请求对象
     * @return AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcAsyncInvoker(UpdateVpcRequest request) {
        return new AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, IecMeta.updateVpc, hcClient);
    }

    /**
     * 创建网络ACL
     * 创建网络ACL。
     *
     * @param CreateFirewallRequest 请求对象
     * @return CompletableFuture<CreateFirewallResponse>
     */
    public CompletableFuture<CreateFirewallResponse> createFirewallAsync(CreateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createFirewall);
    }

    /**
     * 创建网络ACL
     * 创建网络ACL。
     *
     * @param CreateFirewallRequest 请求对象
     * @return AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallAsyncInvoker(CreateFirewallRequest request) {
        return new AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>(request, IecMeta.createFirewall, hcClient);
    }

    /**
     * 删除网络ACL
     * 删除网络ACL。
     *
     * @param DeleteFirewallRequest 请求对象
     * @return CompletableFuture<DeleteFirewallResponse>
     */
    public CompletableFuture<DeleteFirewallResponse> deleteFirewallAsync(DeleteFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deleteFirewall);
    }

    /**
     * 删除网络ACL
     * 删除网络ACL。
     *
     * @param DeleteFirewallRequest 请求对象
     * @return AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallAsyncInvoker(DeleteFirewallRequest request) {
        return new AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>(request, IecMeta.deleteFirewall, hcClient);
    }

    /**
     * 查询网络ACL列表
     * 查询网络ACL列表。
     *
     * @param ListFirewallsRequest 请求对象
     * @return CompletableFuture<ListFirewallsResponse>
     */
    public CompletableFuture<ListFirewallsResponse> listFirewallsAsync(ListFirewallsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listFirewalls);
    }

    /**
     * 查询网络ACL列表
     * 查询网络ACL列表。
     *
     * @param ListFirewallsRequest 请求对象
     * @return AsyncInvoker<ListFirewallsRequest, ListFirewallsResponse>
     */
    public AsyncInvoker<ListFirewallsRequest, ListFirewallsResponse> listFirewallsAsyncInvoker(ListFirewallsRequest request) {
        return new AsyncInvoker<ListFirewallsRequest, ListFirewallsResponse>(request, IecMeta.listFirewalls, hcClient);
    }

    /**
     * 查询网络ACL详情
     * 查询网络ACL详情。
     *
     * @param ShowFirewallRequest 请求对象
     * @return CompletableFuture<ShowFirewallResponse>
     */
    public CompletableFuture<ShowFirewallResponse> showFirewallAsync(ShowFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showFirewall);
    }

    /**
     * 查询网络ACL详情
     * 查询网络ACL详情。
     *
     * @param ShowFirewallRequest 请求对象
     * @return AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse>
     */
    public AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse> showFirewallAsyncInvoker(ShowFirewallRequest request) {
        return new AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse>(request, IecMeta.showFirewall, hcClient);
    }

    /**
     * 更新网络ACL
     * 更新网络ACL。
     *
     * @param UpdateFirewallRequest 请求对象
     * @return CompletableFuture<UpdateFirewallResponse>
     */
    public CompletableFuture<UpdateFirewallResponse> updateFirewallAsync(UpdateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateFirewall);
    }

    /**
     * 更新网络ACL
     * 更新网络ACL。
     *
     * @param UpdateFirewallRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>
     */
    public AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewallAsyncInvoker(UpdateFirewallRequest request) {
        return new AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>(request, IecMeta.updateFirewall, hcClient);
    }

    /**
     * 更新网络ACL规则
     * 更新网络ACL规则。
     *
     * @param UpdateFirewallRuleRequest 请求对象
     * @return CompletableFuture<UpdateFirewallRuleResponse>
     */
    public CompletableFuture<UpdateFirewallRuleResponse> updateFirewallRuleAsync(UpdateFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updateFirewallRule);
    }

    /**
     * 更新网络ACL规则
     * 更新网络ACL规则。
     *
     * @param UpdateFirewallRuleRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse>
     */
    public AsyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse> updateFirewallRuleAsyncInvoker(UpdateFirewallRuleRequest request) {
        return new AsyncInvoker<UpdateFirewallRuleRequest, UpdateFirewallRuleResponse>(request, IecMeta.updateFirewallRule, hcClient);
    }

    /**
     * 创建弹性公网IP
     * 根据用户的请求内容，创建弹性公网IP
     *
     * @param CreatePublicIpRequest 请求对象
     * @return CompletableFuture<CreatePublicIpResponse>
     */
    public CompletableFuture<CreatePublicIpResponse> createPublicIpAsync(CreatePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.createPublicIp);
    }

    /**
     * 创建弹性公网IP
     * 根据用户的请求内容，创建弹性公网IP
     *
     * @param CreatePublicIpRequest 请求对象
     * @return AsyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse>
     */
    public AsyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse> createPublicIpAsyncInvoker(CreatePublicIpRequest request) {
        return new AsyncInvoker<CreatePublicIpRequest, CreatePublicIpResponse>(request, IecMeta.createPublicIp, hcClient);
    }

    /**
     * 删除弹性公网IP
     * 根据弹性公网IP的ID，删除对应的弹性公网IP。
     *
     * @param DeletePublicIpRequest 请求对象
     * @return CompletableFuture<DeletePublicIpResponse>
     */
    public CompletableFuture<DeletePublicIpResponse> deletePublicIpAsync(DeletePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.deletePublicIp);
    }

    /**
     * 删除弹性公网IP
     * 根据弹性公网IP的ID，删除对应的弹性公网IP。
     *
     * @param DeletePublicIpRequest 请求对象
     * @return AsyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse>
     */
    public AsyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse> deletePublicIpAsyncInvoker(DeletePublicIpRequest request) {
        return new AsyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse>(request, IecMeta.deletePublicIp, hcClient);
    }

    /**
     * 查询弹性公网IP列表
     * 获取弹性公网IP列表信息。
     *
     * @param ListPublicIpsRequest 请求对象
     * @return CompletableFuture<ListPublicIpsResponse>
     */
    public CompletableFuture<ListPublicIpsResponse> listPublicIpsAsync(ListPublicIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.listPublicIps);
    }

    /**
     * 查询弹性公网IP列表
     * 获取弹性公网IP列表信息。
     *
     * @param ListPublicIpsRequest 请求对象
     * @return AsyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse>
     */
    public AsyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse> listPublicIpsAsyncInvoker(ListPublicIpsRequest request) {
        return new AsyncInvoker<ListPublicIpsRequest, ListPublicIpsResponse>(request, IecMeta.listPublicIps, hcClient);
    }

    /**
     * 查询弹性公网IP
     * 获取弹性公网IP的详情信息。
     *
     * @param ShowPublicIpRequest 请求对象
     * @return CompletableFuture<ShowPublicIpResponse>
     */
    public CompletableFuture<ShowPublicIpResponse> showPublicIpAsync(ShowPublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.showPublicIp);
    }

    /**
     * 查询弹性公网IP
     * 获取弹性公网IP的详情信息。
     *
     * @param ShowPublicIpRequest 请求对象
     * @return AsyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse>
     */
    public AsyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse> showPublicIpAsyncInvoker(ShowPublicIpRequest request) {
        return new AsyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse>(request, IecMeta.showPublicIp, hcClient);
    }

    /**
     * 更新弹性公网IP
     * 更新弹性公网IP的信息，主要用于解绑和绑定EIP和VIP之间的关系。
     *
     * @param UpdatePublicIpRequest 请求对象
     * @return CompletableFuture<UpdatePublicIpResponse>
     */
    public CompletableFuture<UpdatePublicIpResponse> updatePublicIpAsync(UpdatePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, IecMeta.updatePublicIp);
    }

    /**
     * 更新弹性公网IP
     * 更新弹性公网IP的信息，主要用于解绑和绑定EIP和VIP之间的关系。
     *
     * @param UpdatePublicIpRequest 请求对象
     * @return AsyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse>
     */
    public AsyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse> updatePublicIpAsyncInvoker(UpdatePublicIpRequest request) {
        return new AsyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse>(request, IecMeta.updatePublicIp, hcClient);
    }

}