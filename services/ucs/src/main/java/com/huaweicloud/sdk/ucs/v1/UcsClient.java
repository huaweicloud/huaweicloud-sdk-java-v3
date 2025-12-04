package com.huaweicloud.sdk.ucs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ucs.v1.model.CreateAddonInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateAddonInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterConfRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterConfResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterGroupPolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterGroupPolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterKubeconfigRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterKubeconfigResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterPolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterPolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateConfigSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateConfigSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationCertRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationCertResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationConnectionRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationConnectionResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateProxyUnitedWorkloadRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateProxyUnitedWorkloadResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateRecordSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateRecordSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateRepoRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateRepoResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateRuleRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateRuleResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteAddonInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteAddonInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteClusterRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteClusterResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteConfigSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteConfigSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeletePolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeletePolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteProxyUnitedWorkloadRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteProxyUnitedWorkloadResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteRepoRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteRepoResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteRuleRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteRuleResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableClusterGroupPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableClusterGroupPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableClusterPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableClusterPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableFederationRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableFederationResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableGitOpsRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableGitOpsResponse;
import com.huaweicloud.sdk.ucs.v1.model.DownloadFederationKubeconfigRequest;
import com.huaweicloud.sdk.ucs.v1.model.DownloadFederationKubeconfigResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableClusterGroupPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableClusterGroupPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableClusterPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableClusterPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableFederationRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableFederationResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableGitOpsRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableGitOpsResponse;
import com.huaweicloud.sdk.ucs.v1.model.JoinGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.JoinGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.LeaveGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.LeaveGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListAddonInstancesRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListAddonInstancesResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListAddonTemplatesRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListAddonTemplatesResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListConfigSetsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListConfigSetsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListManagedClustersRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListManagedClustersResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyDefinitionsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyDefinitionsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyInstancesRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyInstancesResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyJobsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyJobsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListRecordSetsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListRecordSetsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListRegisteredClusterVersionsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListRegisteredClusterVersionsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListReposRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListReposResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListRuleRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListRuleResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListServerConfigsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListServerConfigsResponse;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterRequest;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterResponse;
import com.huaweicloud.sdk.ucs.v1.model.RetryClusterActivationRequest;
import com.huaweicloud.sdk.ucs.v1.model.RetryClusterActivationResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowAddonInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowAddonInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterAccessInfoRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterAccessInfoResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterListRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterListResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowConfigSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowConfigSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowFederationProgressRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowFederationProgressResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowGitOpsStatusRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowGitOpsStatusResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowGitopsStatisticsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowGitopsStatisticsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyDefinitionRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyDefinitionResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyJobRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyJobResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowProxyUnitedWorkloadRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowProxyUnitedWorkloadResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateAddonInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateAddonInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedClustersRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedClustersResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedRulesRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedRulesResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedZonesRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedZonesResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterRulesRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterRulesResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateConfigSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateConfigSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdatePolicyDefinationRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdatePolicyDefinationResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdatePolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdatePolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateProxyUnitedWorkloadRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateProxyUnitedWorkloadResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRepoRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRepoResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRuleRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRuleResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpgradeFederationRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpgradeFederationResponse;

public class UcsClient {

    protected HcClient hcClient;

    public UcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<UcsClient> newBuilder() {
        ClientBuilder<UcsClient> clientBuilder = new ClientBuilder<>(UcsClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 安装插件实例
     *
     * 安装插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddonInstanceRequest 请求对象
     * @return CreateAddonInstanceResponse
     */
    public CreateAddonInstanceResponse createAddonInstance(CreateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createAddonInstance);
    }

    /**
     * 安装插件实例
     *
     * 安装插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddonInstanceRequest 请求对象
     * @return SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>
     */
    public SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstanceInvoker(
        CreateAddonInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createAddonInstance, hcClient);
    }

    /**
     * 创建舰队策略实例
     *
     * 创建舰队策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterGroupPolicyInstanceRequest 请求对象
     * @return CreateClusterGroupPolicyInstanceResponse
     */
    public CreateClusterGroupPolicyInstanceResponse createClusterGroupPolicyInstance(
        CreateClusterGroupPolicyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createClusterGroupPolicyInstance);
    }

    /**
     * 创建舰队策略实例
     *
     * 创建舰队策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterGroupPolicyInstanceRequest 请求对象
     * @return SyncInvoker<CreateClusterGroupPolicyInstanceRequest, CreateClusterGroupPolicyInstanceResponse>
     */
    public SyncInvoker<CreateClusterGroupPolicyInstanceRequest, CreateClusterGroupPolicyInstanceResponse> createClusterGroupPolicyInstanceInvoker(
        CreateClusterGroupPolicyInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createClusterGroupPolicyInstance, hcClient);
    }

    /**
     * 创建配置集合
     *
     * 创建配置集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigSetRequest 请求对象
     * @return CreateConfigSetResponse
     */
    public CreateConfigSetResponse createConfigSet(CreateConfigSetRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createConfigSet);
    }

    /**
     * 创建配置集合
     *
     * 创建配置集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigSetRequest 请求对象
     * @return SyncInvoker<CreateConfigSetRequest, CreateConfigSetResponse>
     */
    public SyncInvoker<CreateConfigSetRequest, CreateConfigSetResponse> createConfigSetInvoker(
        CreateConfigSetRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createConfigSet, hcClient);
    }

    /**
     * 创建联邦网络连接并下载联邦kubeconfig
     *
     * 舰队开通联邦后，调用此接口，创建vpcep终端节点，连接到联邦apiserver，并下载联邦apiserver的kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationCertRequest 请求对象
     * @return CreateFederationCertResponse
     */
    public CreateFederationCertResponse createFederationCert(CreateFederationCertRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createFederationCert);
    }

    /**
     * 创建联邦网络连接并下载联邦kubeconfig
     *
     * 舰队开通联邦后，调用此接口，创建vpcep终端节点，连接到联邦apiserver，并下载联邦apiserver的kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationCertRequest 请求对象
     * @return SyncInvoker<CreateFederationCertRequest, CreateFederationCertResponse>
     */
    public SyncInvoker<CreateFederationCertRequest, CreateFederationCertResponse> createFederationCertInvoker(
        CreateFederationCertRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createFederationCert, hcClient);
    }

    /**
     * 创建联邦网络连接
     *
     * 舰队开通联邦后，创建vpcep终端节点连接到联邦apiserver
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationConnectionRequest 请求对象
     * @return CreateFederationConnectionResponse
     */
    public CreateFederationConnectionResponse createFederationConnection(CreateFederationConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createFederationConnection);
    }

    /**
     * 创建联邦网络连接
     *
     * 舰队开通联邦后，创建vpcep终端节点连接到联邦apiserver
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationConnectionRequest 请求对象
     * @return SyncInvoker<CreateFederationConnectionRequest, CreateFederationConnectionResponse>
     */
    public SyncInvoker<CreateFederationConnectionRequest, CreateFederationConnectionResponse> createFederationConnectionInvoker(
        CreateFederationConnectionRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createFederationConnection, hcClient);
    }

    /**
     * 创建联邦工作负载
     *
     * 创建联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProxyUnitedWorkloadRequest 请求对象
     * @return CreateProxyUnitedWorkloadResponse
     */
    public CreateProxyUnitedWorkloadResponse createProxyUnitedWorkload(CreateProxyUnitedWorkloadRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createProxyUnitedWorkload);
    }

    /**
     * 创建联邦工作负载
     *
     * 创建联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProxyUnitedWorkloadRequest 请求对象
     * @return SyncInvoker<CreateProxyUnitedWorkloadRequest, CreateProxyUnitedWorkloadResponse>
     */
    public SyncInvoker<CreateProxyUnitedWorkloadRequest, CreateProxyUnitedWorkloadResponse> createProxyUnitedWorkloadInvoker(
        CreateProxyUnitedWorkloadRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createProxyUnitedWorkload, hcClient);
    }

    /**
     * 创建域名解析记录集
     *
     * 创建域名解析记录集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetRequest 请求对象
     * @return CreateRecordSetResponse
     */
    public CreateRecordSetResponse createRecordSet(CreateRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createRecordSet);
    }

    /**
     * 创建域名解析记录集
     *
     * 创建域名解析记录集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetRequest 请求对象
     * @return SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>
     */
    public SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSetInvoker(
        CreateRecordSetRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createRecordSet, hcClient);
    }

    /**
     * 创建仓库源
     *
     * 创建仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return CreateRepoResponse
     */
    public CreateRepoResponse createRepo(CreateRepoRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createRepo);
    }

    /**
     * 创建仓库源
     *
     * 创建仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return SyncInvoker<CreateRepoRequest, CreateRepoResponse>
     */
    public SyncInvoker<CreateRepoRequest, CreateRepoResponse> createRepoInvoker(CreateRepoRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createRepo, hcClient);
    }

    /**
     * 创建权限策略
     *
     * 创建权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createRule);
    }

    /**
     * 创建权限策略
     *
     * 创建权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return SyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public SyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleInvoker(CreateRuleRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createRule, hcClient);
    }

    /**
     * 卸载插件实例
     *
     * 卸载插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddonInstanceRequest 请求对象
     * @return DeleteAddonInstanceResponse
     */
    public DeleteAddonInstanceResponse deleteAddonInstance(DeleteAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.deleteAddonInstance);
    }

    /**
     * 卸载插件实例
     *
     * 卸载插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddonInstanceRequest 请求对象
     * @return SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>
     */
    public SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstanceInvoker(
        DeleteAddonInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.deleteAddonInstance, hcClient);
    }

    /**
     * 删除容器舰队
     *
     * 容器舰队删除接口，只有在容器舰队为空时才可以删除该容器舰队，若需删除请先将集群移出容器舰队；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的操作权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterGroupRequest 请求对象
     * @return DeleteClusterGroupResponse
     */
    public DeleteClusterGroupResponse deleteClusterGroup(DeleteClusterGroupRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.deleteClusterGroup);
    }

    /**
     * 删除容器舰队
     *
     * 容器舰队删除接口，只有在容器舰队为空时才可以删除该容器舰队，若需删除请先将集群移出容器舰队；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的操作权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterGroupRequest 请求对象
     * @return SyncInvoker<DeleteClusterGroupRequest, DeleteClusterGroupResponse>
     */
    public SyncInvoker<DeleteClusterGroupRequest, DeleteClusterGroupResponse> deleteClusterGroupInvoker(
        DeleteClusterGroupRequest request) {
        return new SyncInvoker<>(request, UcsMeta.deleteClusterGroup, hcClient);
    }

    /**
     * 删除配置集合
     *
     * 仅删除配置集合，不删除仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigSetRequest 请求对象
     * @return DeleteConfigSetResponse
     */
    public DeleteConfigSetResponse deleteConfigSet(DeleteConfigSetRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.deleteConfigSet);
    }

    /**
     * 删除配置集合
     *
     * 仅删除配置集合，不删除仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigSetRequest 请求对象
     * @return SyncInvoker<DeleteConfigSetRequest, DeleteConfigSetResponse>
     */
    public SyncInvoker<DeleteConfigSetRequest, DeleteConfigSetResponse> deleteConfigSetInvoker(
        DeleteConfigSetRequest request) {
        return new SyncInvoker<>(request, UcsMeta.deleteConfigSet, hcClient);
    }

    /**
     * 删除指定策略实例
     *
     * 删除指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyInstanceRequest 请求对象
     * @return DeletePolicyInstanceResponse
     */
    public DeletePolicyInstanceResponse deletePolicyInstance(DeletePolicyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.deletePolicyInstance);
    }

    /**
     * 删除指定策略实例
     *
     * 删除指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyInstanceRequest 请求对象
     * @return SyncInvoker<DeletePolicyInstanceRequest, DeletePolicyInstanceResponse>
     */
    public SyncInvoker<DeletePolicyInstanceRequest, DeletePolicyInstanceResponse> deletePolicyInstanceInvoker(
        DeletePolicyInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.deletePolicyInstance, hcClient);
    }

    /**
     * 删除联邦工作负载
     *
     * 删除联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProxyUnitedWorkloadRequest 请求对象
     * @return DeleteProxyUnitedWorkloadResponse
     */
    public DeleteProxyUnitedWorkloadResponse deleteProxyUnitedWorkload(DeleteProxyUnitedWorkloadRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.deleteProxyUnitedWorkload);
    }

    /**
     * 删除联邦工作负载
     *
     * 删除联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProxyUnitedWorkloadRequest 请求对象
     * @return SyncInvoker<DeleteProxyUnitedWorkloadRequest, DeleteProxyUnitedWorkloadResponse>
     */
    public SyncInvoker<DeleteProxyUnitedWorkloadRequest, DeleteProxyUnitedWorkloadResponse> deleteProxyUnitedWorkloadInvoker(
        DeleteProxyUnitedWorkloadRequest request) {
        return new SyncInvoker<>(request, UcsMeta.deleteProxyUnitedWorkload, hcClient);
    }

    /**
     * 删除仓库源
     *
     * 删除仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return DeleteRepoResponse
     */
    public DeleteRepoResponse deleteRepo(DeleteRepoRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.deleteRepo);
    }

    /**
     * 删除仓库源
     *
     * 删除仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return SyncInvoker<DeleteRepoRequest, DeleteRepoResponse>
     */
    public SyncInvoker<DeleteRepoRequest, DeleteRepoResponse> deleteRepoInvoker(DeleteRepoRequest request) {
        return new SyncInvoker<>(request, UcsMeta.deleteRepo, hcClient);
    }

    /**
     * 删除权限策略
     *
     * 删除权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.deleteRule);
    }

    /**
     * 删除权限策略
     *
     * 删除权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<>(request, UcsMeta.deleteRule, hcClient);
    }

    /**
     * 舰队关闭策略中心
     *
     * 舰队关闭策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableClusterGroupPolicyRequest 请求对象
     * @return DisableClusterGroupPolicyResponse
     */
    public DisableClusterGroupPolicyResponse disableClusterGroupPolicy(DisableClusterGroupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.disableClusterGroupPolicy);
    }

    /**
     * 舰队关闭策略中心
     *
     * 舰队关闭策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableClusterGroupPolicyRequest 请求对象
     * @return SyncInvoker<DisableClusterGroupPolicyRequest, DisableClusterGroupPolicyResponse>
     */
    public SyncInvoker<DisableClusterGroupPolicyRequest, DisableClusterGroupPolicyResponse> disableClusterGroupPolicyInvoker(
        DisableClusterGroupPolicyRequest request) {
        return new SyncInvoker<>(request, UcsMeta.disableClusterGroupPolicy, hcClient);
    }

    /**
     * 关闭容器集群联邦
     *
     * 关闭容器舰队联邦
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableFederationRequest 请求对象
     * @return DisableFederationResponse
     */
    public DisableFederationResponse disableFederation(DisableFederationRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.disableFederation);
    }

    /**
     * 关闭容器集群联邦
     *
     * 关闭容器舰队联邦
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableFederationRequest 请求对象
     * @return SyncInvoker<DisableFederationRequest, DisableFederationResponse>
     */
    public SyncInvoker<DisableFederationRequest, DisableFederationResponse> disableFederationInvoker(
        DisableFederationRequest request) {
        return new SyncInvoker<>(request, UcsMeta.disableFederation, hcClient);
    }

    /**
     * 下载联邦kubeconfig
     *
     * 舰队开通联邦并且创建网络连接之后，可以使用此接口下载联邦的kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadFederationKubeconfigRequest 请求对象
     * @return DownloadFederationKubeconfigResponse
     */
    public DownloadFederationKubeconfigResponse downloadFederationKubeconfig(
        DownloadFederationKubeconfigRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.downloadFederationKubeconfig);
    }

    /**
     * 下载联邦kubeconfig
     *
     * 舰队开通联邦并且创建网络连接之后，可以使用此接口下载联邦的kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadFederationKubeconfigRequest 请求对象
     * @return SyncInvoker<DownloadFederationKubeconfigRequest, DownloadFederationKubeconfigResponse>
     */
    public SyncInvoker<DownloadFederationKubeconfigRequest, DownloadFederationKubeconfigResponse> downloadFederationKubeconfigInvoker(
        DownloadFederationKubeconfigRequest request) {
        return new SyncInvoker<>(request, UcsMeta.downloadFederationKubeconfig, hcClient);
    }

    /**
     * 舰队启用策略中心
     *
     * 舰队启用策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableClusterGroupPolicyRequest 请求对象
     * @return EnableClusterGroupPolicyResponse
     */
    public EnableClusterGroupPolicyResponse enableClusterGroupPolicy(EnableClusterGroupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.enableClusterGroupPolicy);
    }

    /**
     * 舰队启用策略中心
     *
     * 舰队启用策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableClusterGroupPolicyRequest 请求对象
     * @return SyncInvoker<EnableClusterGroupPolicyRequest, EnableClusterGroupPolicyResponse>
     */
    public SyncInvoker<EnableClusterGroupPolicyRequest, EnableClusterGroupPolicyResponse> enableClusterGroupPolicyInvoker(
        EnableClusterGroupPolicyRequest request) {
        return new SyncInvoker<>(request, UcsMeta.enableClusterGroupPolicy, hcClient);
    }

    /**
     * 启用容器舰队联邦
     *
     * 启用容器舰队联邦
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableFederationRequest 请求对象
     * @return EnableFederationResponse
     */
    public EnableFederationResponse enableFederation(EnableFederationRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.enableFederation);
    }

    /**
     * 启用容器舰队联邦
     *
     * 启用容器舰队联邦
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableFederationRequest 请求对象
     * @return SyncInvoker<EnableFederationRequest, EnableFederationResponse>
     */
    public SyncInvoker<EnableFederationRequest, EnableFederationResponse> enableFederationInvoker(
        EnableFederationRequest request) {
        return new SyncInvoker<>(request, UcsMeta.enableFederation, hcClient);
    }

    /**
     * 集群加入容器舰队
     *
     * 集群加入容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request JoinGroupRequest 请求对象
     * @return JoinGroupResponse
     */
    public JoinGroupResponse joinGroup(JoinGroupRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.joinGroup);
    }

    /**
     * 集群加入容器舰队
     *
     * 集群加入容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request JoinGroupRequest 请求对象
     * @return SyncInvoker<JoinGroupRequest, JoinGroupResponse>
     */
    public SyncInvoker<JoinGroupRequest, JoinGroupResponse> joinGroupInvoker(JoinGroupRequest request) {
        return new SyncInvoker<>(request, UcsMeta.joinGroup, hcClient);
    }

    /**
     * 集群移出容器舰队
     *
     * 集群退出容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LeaveGroupRequest 请求对象
     * @return LeaveGroupResponse
     */
    public LeaveGroupResponse leaveGroup(LeaveGroupRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.leaveGroup);
    }

    /**
     * 集群移出容器舰队
     *
     * 集群退出容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LeaveGroupRequest 请求对象
     * @return SyncInvoker<LeaveGroupRequest, LeaveGroupResponse>
     */
    public SyncInvoker<LeaveGroupRequest, LeaveGroupResponse> leaveGroupInvoker(LeaveGroupRequest request) {
        return new SyncInvoker<>(request, UcsMeta.leaveGroup, hcClient);
    }

    /**
     * 获取插件实例列表
     *
     * 获取插件实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddonInstancesRequest 请求对象
     * @return ListAddonInstancesResponse
     */
    public ListAddonInstancesResponse listAddonInstances(ListAddonInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listAddonInstances);
    }

    /**
     * 获取插件实例列表
     *
     * 获取插件实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddonInstancesRequest 请求对象
     * @return SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>
     */
    public SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstancesInvoker(
        ListAddonInstancesRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listAddonInstances, hcClient);
    }

    /**
     * 获取插件模板列表
     *
     * 获取插件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddonTemplatesRequest 请求对象
     * @return ListAddonTemplatesResponse
     */
    public ListAddonTemplatesResponse listAddonTemplates(ListAddonTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listAddonTemplates);
    }

    /**
     * 获取插件模板列表
     *
     * 获取插件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddonTemplatesRequest 请求对象
     * @return SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>
     */
    public SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplatesInvoker(
        ListAddonTemplatesRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listAddonTemplates, hcClient);
    }

    /**
     * 获取容器舰队列表
     *
     * 获取所有容器舰队信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterGroupRequest 请求对象
     * @return ListClusterGroupResponse
     */
    public ListClusterGroupResponse listClusterGroup(ListClusterGroupRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listClusterGroup);
    }

    /**
     * 获取容器舰队列表
     *
     * 获取所有容器舰队信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterGroupRequest 请求对象
     * @return SyncInvoker<ListClusterGroupRequest, ListClusterGroupResponse>
     */
    public SyncInvoker<ListClusterGroupRequest, ListClusterGroupResponse> listClusterGroupInvoker(
        ListClusterGroupRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listClusterGroup, hcClient);
    }

    /**
     * 获取所有配置集合信息
     *
     * 获取所有配置集合信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigSetsRequest 请求对象
     * @return ListConfigSetsResponse
     */
    public ListConfigSetsResponse listConfigSets(ListConfigSetsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listConfigSets);
    }

    /**
     * 获取所有配置集合信息
     *
     * 获取所有配置集合信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigSetsRequest 请求对象
     * @return SyncInvoker<ListConfigSetsRequest, ListConfigSetsResponse>
     */
    public SyncInvoker<ListConfigSetsRequest, ListConfigSetsResponse> listConfigSetsInvoker(
        ListConfigSetsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listConfigSets, hcClient);
    }

    /**
     * 获取策略定义列表
     *
     * 获取策略定义列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyDefinitionsRequest 请求对象
     * @return ListPolicyDefinitionsResponse
     */
    public ListPolicyDefinitionsResponse listPolicyDefinitions(ListPolicyDefinitionsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listPolicyDefinitions);
    }

    /**
     * 获取策略定义列表
     *
     * 获取策略定义列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyDefinitionsRequest 请求对象
     * @return SyncInvoker<ListPolicyDefinitionsRequest, ListPolicyDefinitionsResponse>
     */
    public SyncInvoker<ListPolicyDefinitionsRequest, ListPolicyDefinitionsResponse> listPolicyDefinitionsInvoker(
        ListPolicyDefinitionsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listPolicyDefinitions, hcClient);
    }

    /**
     * 获取策略实例列表
     *
     * 获取策略实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyInstancesRequest 请求对象
     * @return ListPolicyInstancesResponse
     */
    public ListPolicyInstancesResponse listPolicyInstances(ListPolicyInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listPolicyInstances);
    }

    /**
     * 获取策略实例列表
     *
     * 获取策略实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyInstancesRequest 请求对象
     * @return SyncInvoker<ListPolicyInstancesRequest, ListPolicyInstancesResponse>
     */
    public SyncInvoker<ListPolicyInstancesRequest, ListPolicyInstancesResponse> listPolicyInstancesInvoker(
        ListPolicyInstancesRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listPolicyInstances, hcClient);
    }

    /**
     * 获取策略实例任务列表
     *
     * 获取策略实例任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyJobsRequest 请求对象
     * @return ListPolicyJobsResponse
     */
    public ListPolicyJobsResponse listPolicyJobs(ListPolicyJobsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listPolicyJobs);
    }

    /**
     * 获取策略实例任务列表
     *
     * 获取策略实例任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyJobsRequest 请求对象
     * @return SyncInvoker<ListPolicyJobsRequest, ListPolicyJobsResponse>
     */
    public SyncInvoker<ListPolicyJobsRequest, ListPolicyJobsResponse> listPolicyJobsInvoker(
        ListPolicyJobsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listPolicyJobs, hcClient);
    }

    /**
     * 查询域名解析记录集列表
     *
     * 查询域名解析记录集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsRequest 请求对象
     * @return ListRecordSetsResponse
     */
    public ListRecordSetsResponse listRecordSets(ListRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listRecordSets);
    }

    /**
     * 查询域名解析记录集列表
     *
     * 查询域名解析记录集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsRequest 请求对象
     * @return SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>
     */
    public SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSetsInvoker(
        ListRecordSetsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listRecordSets, hcClient);
    }

    /**
     * 获取仓库源列表
     *
     * 获取仓库源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposRequest 请求对象
     * @return ListReposResponse
     */
    public ListReposResponse listRepos(ListReposRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listRepos);
    }

    /**
     * 获取仓库源列表
     *
     * 获取仓库源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposRequest 请求对象
     * @return SyncInvoker<ListReposRequest, ListReposResponse>
     */
    public SyncInvoker<ListReposRequest, ListReposResponse> listReposInvoker(ListReposRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listRepos, hcClient);
    }

    /**
     * 获取权限策略列表
     *
     * 获取权限策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleRequest 请求对象
     * @return ListRuleResponse
     */
    public ListRuleResponse listRule(ListRuleRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listRule);
    }

    /**
     * 获取权限策略列表
     *
     * 获取权限策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleRequest 请求对象
     * @return SyncInvoker<ListRuleRequest, ListRuleResponse>
     */
    public SyncInvoker<ListRuleRequest, ListRuleResponse> listRuleInvoker(ListRuleRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listRule, hcClient);
    }

    /**
     * 查询服务配置信息
     *
     * 获取各个类型集群的全局配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerConfigsRequest 请求对象
     * @return ListServerConfigsResponse
     */
    public ListServerConfigsResponse listServerConfigs(ListServerConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listServerConfigs);
    }

    /**
     * 查询服务配置信息
     *
     * 获取各个类型集群的全局配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerConfigsRequest 请求对象
     * @return SyncInvoker<ListServerConfigsRequest, ListServerConfigsResponse>
     */
    public SyncInvoker<ListServerConfigsRequest, ListServerConfigsResponse> listServerConfigsInvoker(
        ListServerConfigsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listServerConfigs, hcClient);
    }

    /**
     * 注册容器舰队
     *
     * 容器舰队创建API，生成容器舰队时可以选择关联的集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClusterGroupRequest 请求对象
     * @return RegisterClusterGroupResponse
     */
    public RegisterClusterGroupResponse registerClusterGroup(RegisterClusterGroupRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.registerClusterGroup);
    }

    /**
     * 注册容器舰队
     *
     * 容器舰队创建API，生成容器舰队时可以选择关联的集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClusterGroupRequest 请求对象
     * @return SyncInvoker<RegisterClusterGroupRequest, RegisterClusterGroupResponse>
     */
    public SyncInvoker<RegisterClusterGroupRequest, RegisterClusterGroupResponse> registerClusterGroupInvoker(
        RegisterClusterGroupRequest request) {
        return new SyncInvoker<>(request, UcsMeta.registerClusterGroup, hcClient);
    }

    /**
     * 获取插件实例
     *
     * 获取插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddonInstanceRequest 请求对象
     * @return ShowAddonInstanceResponse
     */
    public ShowAddonInstanceResponse showAddonInstance(ShowAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showAddonInstance);
    }

    /**
     * 获取插件实例
     *
     * 获取插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddonInstanceRequest 请求对象
     * @return SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>
     */
    public SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstanceInvoker(
        ShowAddonInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showAddonInstance, hcClient);
    }

    /**
     * 获取单个容器舰队
     *
     * 获取单个容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterGroupRequest 请求对象
     * @return ShowClusterGroupResponse
     */
    public ShowClusterGroupResponse showClusterGroup(ShowClusterGroupRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showClusterGroup);
    }

    /**
     * 获取单个容器舰队
     *
     * 获取单个容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterGroupRequest 请求对象
     * @return SyncInvoker<ShowClusterGroupRequest, ShowClusterGroupResponse>
     */
    public SyncInvoker<ShowClusterGroupRequest, ShowClusterGroupResponse> showClusterGroupInvoker(
        ShowClusterGroupRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showClusterGroup, hcClient);
    }

    /**
     * 获取配置集合详细信息
     *
     * 获取配置集合详细信息，包含仓库源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigSetRequest 请求对象
     * @return ShowConfigSetResponse
     */
    public ShowConfigSetResponse showConfigSet(ShowConfigSetRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showConfigSet);
    }

    /**
     * 获取配置集合详细信息
     *
     * 获取配置集合详细信息，包含仓库源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigSetRequest 请求对象
     * @return SyncInvoker<ShowConfigSetRequest, ShowConfigSetResponse>
     */
    public SyncInvoker<ShowConfigSetRequest, ShowConfigSetResponse> showConfigSetInvoker(ShowConfigSetRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showConfigSet, hcClient);
    }

    /**
     * 查询联邦开启进度
     *
     * 查询联邦开启进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFederationProgressRequest 请求对象
     * @return ShowFederationProgressResponse
     */
    public ShowFederationProgressResponse showFederationProgress(ShowFederationProgressRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showFederationProgress);
    }

    /**
     * 查询联邦开启进度
     *
     * 查询联邦开启进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFederationProgressRequest 请求对象
     * @return SyncInvoker<ShowFederationProgressRequest, ShowFederationProgressResponse>
     */
    public SyncInvoker<ShowFederationProgressRequest, ShowFederationProgressResponse> showFederationProgressInvoker(
        ShowFederationProgressRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showFederationProgress, hcClient);
    }

    /**
     * 统计某个用户所有配置集合的运行状态
     *
     * 统计某个用户所有配置集合的运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGitopsStatisticsRequest 请求对象
     * @return ShowGitopsStatisticsResponse
     */
    public ShowGitopsStatisticsResponse showGitopsStatistics(ShowGitopsStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showGitopsStatistics);
    }

    /**
     * 统计某个用户所有配置集合的运行状态
     *
     * 统计某个用户所有配置集合的运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGitopsStatisticsRequest 请求对象
     * @return SyncInvoker<ShowGitopsStatisticsRequest, ShowGitopsStatisticsResponse>
     */
    public SyncInvoker<ShowGitopsStatisticsRequest, ShowGitopsStatisticsResponse> showGitopsStatisticsInvoker(
        ShowGitopsStatisticsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showGitopsStatistics, hcClient);
    }

    /**
     * 获取策略定义
     *
     * 获取策略定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyDefinitionRequest 请求对象
     * @return ShowPolicyDefinitionResponse
     */
    public ShowPolicyDefinitionResponse showPolicyDefinition(ShowPolicyDefinitionRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showPolicyDefinition);
    }

    /**
     * 获取策略定义
     *
     * 获取策略定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyDefinitionRequest 请求对象
     * @return SyncInvoker<ShowPolicyDefinitionRequest, ShowPolicyDefinitionResponse>
     */
    public SyncInvoker<ShowPolicyDefinitionRequest, ShowPolicyDefinitionResponse> showPolicyDefinitionInvoker(
        ShowPolicyDefinitionRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showPolicyDefinition, hcClient);
    }

    /**
     * 获取指定策略实例
     *
     * 获取指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyInstanceRequest 请求对象
     * @return ShowPolicyInstanceResponse
     */
    public ShowPolicyInstanceResponse showPolicyInstance(ShowPolicyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showPolicyInstance);
    }

    /**
     * 获取指定策略实例
     *
     * 获取指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyInstanceRequest 请求对象
     * @return SyncInvoker<ShowPolicyInstanceRequest, ShowPolicyInstanceResponse>
     */
    public SyncInvoker<ShowPolicyInstanceRequest, ShowPolicyInstanceResponse> showPolicyInstanceInvoker(
        ShowPolicyInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showPolicyInstance, hcClient);
    }

    /**
     * 获取指定策略实例相关任务
     *
     * 获取指定策略实例相关任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyJobRequest 请求对象
     * @return ShowPolicyJobResponse
     */
    public ShowPolicyJobResponse showPolicyJob(ShowPolicyJobRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showPolicyJob);
    }

    /**
     * 获取指定策略实例相关任务
     *
     * 获取指定策略实例相关任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyJobRequest 请求对象
     * @return SyncInvoker<ShowPolicyJobRequest, ShowPolicyJobResponse>
     */
    public SyncInvoker<ShowPolicyJobRequest, ShowPolicyJobResponse> showPolicyJobInvoker(ShowPolicyJobRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showPolicyJob, hcClient);
    }

    /**
     * 查询联邦工作负载
     *
     * 查询联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyUnitedWorkloadRequest 请求对象
     * @return ShowProxyUnitedWorkloadResponse
     */
    public ShowProxyUnitedWorkloadResponse showProxyUnitedWorkload(ShowProxyUnitedWorkloadRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showProxyUnitedWorkload);
    }

    /**
     * 查询联邦工作负载
     *
     * 查询联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyUnitedWorkloadRequest 请求对象
     * @return SyncInvoker<ShowProxyUnitedWorkloadRequest, ShowProxyUnitedWorkloadResponse>
     */
    public SyncInvoker<ShowProxyUnitedWorkloadRequest, ShowProxyUnitedWorkloadResponse> showProxyUnitedWorkloadInvoker(
        ShowProxyUnitedWorkloadRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showProxyUnitedWorkload, hcClient);
    }

    /**
     * 获取配额信息
     *
     * 获取UCS配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showQuota);
    }

    /**
     * 获取配额信息
     *
     * 获取UCS配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showQuota, hcClient);
    }

    /**
     * 更新插件实例
     *
     * 更新插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddonInstanceRequest 请求对象
     * @return UpdateAddonInstanceResponse
     */
    public UpdateAddonInstanceResponse updateAddonInstance(UpdateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateAddonInstance);
    }

    /**
     * 更新插件实例
     *
     * 更新插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddonInstanceRequest 请求对象
     * @return SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>
     */
    public SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstanceInvoker(
        UpdateAddonInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateAddonInstance, hcClient);
    }

    /**
     * 更新容器舰队描述信息
     *
     * 更新集群所属的容器舰队description信息；需要用户对相应容器舰队有更新权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupRequest 请求对象
     * @return UpdateClusterGroupResponse
     */
    public UpdateClusterGroupResponse updateClusterGroup(UpdateClusterGroupRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateClusterGroup);
    }

    /**
     * 更新容器舰队描述信息
     *
     * 更新集群所属的容器舰队description信息；需要用户对相应容器舰队有更新权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupRequest 请求对象
     * @return SyncInvoker<UpdateClusterGroupRequest, UpdateClusterGroupResponse>
     */
    public SyncInvoker<UpdateClusterGroupRequest, UpdateClusterGroupResponse> updateClusterGroupInvoker(
        UpdateClusterGroupRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateClusterGroup, hcClient);
    }

    /**
     * 向容器舰队中添加集群
     *
     * 向容器舰队中添加集群，同批次可以添加一个或多个集群，该接口无法清空或减少管理的集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedClustersRequest 请求对象
     * @return UpdateClusterGroupAssociatedClustersResponse
     */
    public UpdateClusterGroupAssociatedClustersResponse updateClusterGroupAssociatedClusters(
        UpdateClusterGroupAssociatedClustersRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateClusterGroupAssociatedClusters);
    }

    /**
     * 向容器舰队中添加集群
     *
     * 向容器舰队中添加集群，同批次可以添加一个或多个集群，该接口无法清空或减少管理的集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedClustersRequest 请求对象
     * @return SyncInvoker<UpdateClusterGroupAssociatedClustersRequest, UpdateClusterGroupAssociatedClustersResponse>
     */
    public SyncInvoker<UpdateClusterGroupAssociatedClustersRequest, UpdateClusterGroupAssociatedClustersResponse> updateClusterGroupAssociatedClustersInvoker(
        UpdateClusterGroupAssociatedClustersRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateClusterGroupAssociatedClusters, hcClient);
    }

    /**
     * 更新容器舰队关联权限策略
     *
     * 更新容器舰队关联权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedRulesRequest 请求对象
     * @return UpdateClusterGroupAssociatedRulesResponse
     */
    public UpdateClusterGroupAssociatedRulesResponse updateClusterGroupAssociatedRules(
        UpdateClusterGroupAssociatedRulesRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateClusterGroupAssociatedRules);
    }

    /**
     * 更新容器舰队关联权限策略
     *
     * 更新容器舰队关联权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedRulesRequest 请求对象
     * @return SyncInvoker<UpdateClusterGroupAssociatedRulesRequest, UpdateClusterGroupAssociatedRulesResponse>
     */
    public SyncInvoker<UpdateClusterGroupAssociatedRulesRequest, UpdateClusterGroupAssociatedRulesResponse> updateClusterGroupAssociatedRulesInvoker(
        UpdateClusterGroupAssociatedRulesRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateClusterGroupAssociatedRules, hcClient);
    }

    /**
     * 更新容器舰队的联邦对应的zone
     *
     * 更新容器舰队的集群联邦关联的zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedZonesRequest 请求对象
     * @return UpdateClusterGroupAssociatedZonesResponse
     */
    public UpdateClusterGroupAssociatedZonesResponse updateClusterGroupAssociatedZones(
        UpdateClusterGroupAssociatedZonesRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateClusterGroupAssociatedZones);
    }

    /**
     * 更新容器舰队的联邦对应的zone
     *
     * 更新容器舰队的集群联邦关联的zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedZonesRequest 请求对象
     * @return SyncInvoker<UpdateClusterGroupAssociatedZonesRequest, UpdateClusterGroupAssociatedZonesResponse>
     */
    public SyncInvoker<UpdateClusterGroupAssociatedZonesRequest, UpdateClusterGroupAssociatedZonesResponse> updateClusterGroupAssociatedZonesInvoker(
        UpdateClusterGroupAssociatedZonesRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateClusterGroupAssociatedZones, hcClient);
    }

    /**
     * 更新配置集合信息
     *
     * 仅更新配置集合，不更新仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigSetRequest 请求对象
     * @return UpdateConfigSetResponse
     */
    public UpdateConfigSetResponse updateConfigSet(UpdateConfigSetRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateConfigSet);
    }

    /**
     * 更新配置集合信息
     *
     * 仅更新配置集合，不更新仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigSetRequest 请求对象
     * @return SyncInvoker<UpdateConfigSetRequest, UpdateConfigSetResponse>
     */
    public SyncInvoker<UpdateConfigSetRequest, UpdateConfigSetResponse> updateConfigSetInvoker(
        UpdateConfigSetRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateConfigSet, hcClient);
    }

    /**
     * 更新策略定义
     *
     * 更新策略定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyDefinationRequest 请求对象
     * @return UpdatePolicyDefinationResponse
     */
    public UpdatePolicyDefinationResponse updatePolicyDefination(UpdatePolicyDefinationRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updatePolicyDefination);
    }

    /**
     * 更新策略定义
     *
     * 更新策略定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyDefinationRequest 请求对象
     * @return SyncInvoker<UpdatePolicyDefinationRequest, UpdatePolicyDefinationResponse>
     */
    public SyncInvoker<UpdatePolicyDefinationRequest, UpdatePolicyDefinationResponse> updatePolicyDefinationInvoker(
        UpdatePolicyDefinationRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updatePolicyDefination, hcClient);
    }

    /**
     * 更新指定策略实例
     *
     * 更新指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyInstanceRequest 请求对象
     * @return UpdatePolicyInstanceResponse
     */
    public UpdatePolicyInstanceResponse updatePolicyInstance(UpdatePolicyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updatePolicyInstance);
    }

    /**
     * 更新指定策略实例
     *
     * 更新指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyInstanceRequest 请求对象
     * @return SyncInvoker<UpdatePolicyInstanceRequest, UpdatePolicyInstanceResponse>
     */
    public SyncInvoker<UpdatePolicyInstanceRequest, UpdatePolicyInstanceResponse> updatePolicyInstanceInvoker(
        UpdatePolicyInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updatePolicyInstance, hcClient);
    }

    /**
     * 更新联邦工作负载
     *
     * 更新联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyUnitedWorkloadRequest 请求对象
     * @return UpdateProxyUnitedWorkloadResponse
     */
    public UpdateProxyUnitedWorkloadResponse updateProxyUnitedWorkload(UpdateProxyUnitedWorkloadRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateProxyUnitedWorkload);
    }

    /**
     * 更新联邦工作负载
     *
     * 更新联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyUnitedWorkloadRequest 请求对象
     * @return SyncInvoker<UpdateProxyUnitedWorkloadRequest, UpdateProxyUnitedWorkloadResponse>
     */
    public SyncInvoker<UpdateProxyUnitedWorkloadRequest, UpdateProxyUnitedWorkloadResponse> updateProxyUnitedWorkloadInvoker(
        UpdateProxyUnitedWorkloadRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateProxyUnitedWorkload, hcClient);
    }

    /**
     * 更新仓库源信息
     *
     * 更新仓库源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return UpdateRepoResponse
     */
    public UpdateRepoResponse updateRepo(UpdateRepoRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateRepo);
    }

    /**
     * 更新仓库源信息
     *
     * 更新仓库源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return SyncInvoker<UpdateRepoRequest, UpdateRepoResponse>
     */
    public SyncInvoker<UpdateRepoRequest, UpdateRepoResponse> updateRepoInvoker(UpdateRepoRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateRepo, hcClient);
    }

    /**
     * 更新权限策略
     *
     * 更新权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleRequest 请求对象
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateRule);
    }

    /**
     * 更新权限策略
     *
     * 更新权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleRequest 请求对象
     * @return SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public SyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleInvoker(UpdateRuleRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateRule, hcClient);
    }

    /**
     * 升级容器舰队联邦
     *
     * 容器舰队联邦版本升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeFederationRequest 请求对象
     * @return UpgradeFederationResponse
     */
    public UpgradeFederationResponse upgradeFederation(UpgradeFederationRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.upgradeFederation);
    }

    /**
     * 升级容器舰队联邦
     *
     * 容器舰队联邦版本升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeFederationRequest 请求对象
     * @return SyncInvoker<UpgradeFederationRequest, UpgradeFederationResponse>
     */
    public SyncInvoker<UpgradeFederationRequest, UpgradeFederationResponse> upgradeFederationInvoker(
        UpgradeFederationRequest request) {
        return new SyncInvoker<>(request, UcsMeta.upgradeFederation, hcClient);
    }

    /**
     * 获取集群安装时所需的配置信息
     *
     * 获取集群安装时所需的配置信息，当前仅本地集群使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterConfRequest 请求对象
     * @return CreateClusterConfResponse
     */
    public CreateClusterConfResponse createClusterConf(CreateClusterConfRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createClusterConf);
    }

    /**
     * 获取集群安装时所需的配置信息
     *
     * 获取集群安装时所需的配置信息，当前仅本地集群使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterConfRequest 请求对象
     * @return SyncInvoker<CreateClusterConfRequest, CreateClusterConfResponse>
     */
    public SyncInvoker<CreateClusterConfRequest, CreateClusterConfResponse> createClusterConfInvoker(
        CreateClusterConfRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createClusterConf, hcClient);
    }

    /**
     * 获取集群kubeconfig
     *
     * 获取集群kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterKubeconfigRequest 请求对象
     * @return CreateClusterKubeconfigResponse
     */
    public CreateClusterKubeconfigResponse createClusterKubeconfig(CreateClusterKubeconfigRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createClusterKubeconfig);
    }

    /**
     * 获取集群kubeconfig
     *
     * 获取集群kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterKubeconfigRequest 请求对象
     * @return SyncInvoker<CreateClusterKubeconfigRequest, CreateClusterKubeconfigResponse>
     */
    public SyncInvoker<CreateClusterKubeconfigRequest, CreateClusterKubeconfigResponse> createClusterKubeconfigInvoker(
        CreateClusterKubeconfigRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createClusterKubeconfig, hcClient);
    }

    /**
     * 创建集群策略实例
     *
     * 创建集群策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterPolicyInstanceRequest 请求对象
     * @return CreateClusterPolicyInstanceResponse
     */
    public CreateClusterPolicyInstanceResponse createClusterPolicyInstance(CreateClusterPolicyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.createClusterPolicyInstance);
    }

    /**
     * 创建集群策略实例
     *
     * 创建集群策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterPolicyInstanceRequest 请求对象
     * @return SyncInvoker<CreateClusterPolicyInstanceRequest, CreateClusterPolicyInstanceResponse>
     */
    public SyncInvoker<CreateClusterPolicyInstanceRequest, CreateClusterPolicyInstanceResponse> createClusterPolicyInstanceInvoker(
        CreateClusterPolicyInstanceRequest request) {
        return new SyncInvoker<>(request, UcsMeta.createClusterPolicyInstance, hcClient);
    }

    /**
     * 删除集群
     *
     * 用于集群解除注册；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的操作权限，否则会鉴权失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 用于集群解除注册；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的操作权限，否则会鉴权失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<>(request, UcsMeta.deleteCluster, hcClient);
    }

    /**
     * 集群关闭策略中心
     *
     * 集群关闭策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableClusterPolicyRequest 请求对象
     * @return DisableClusterPolicyResponse
     */
    public DisableClusterPolicyResponse disableClusterPolicy(DisableClusterPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.disableClusterPolicy);
    }

    /**
     * 集群关闭策略中心
     *
     * 集群关闭策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableClusterPolicyRequest 请求对象
     * @return SyncInvoker<DisableClusterPolicyRequest, DisableClusterPolicyResponse>
     */
    public SyncInvoker<DisableClusterPolicyRequest, DisableClusterPolicyResponse> disableClusterPolicyInvoker(
        DisableClusterPolicyRequest request) {
        return new SyncInvoker<>(request, UcsMeta.disableClusterPolicy, hcClient);
    }

    /**
     * 卸载集群gitops插件
     *
     * 卸载集群gitops插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableGitOpsRequest 请求对象
     * @return DisableGitOpsResponse
     */
    public DisableGitOpsResponse disableGitOps(DisableGitOpsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.disableGitOps);
    }

    /**
     * 卸载集群gitops插件
     *
     * 卸载集群gitops插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableGitOpsRequest 请求对象
     * @return SyncInvoker<DisableGitOpsRequest, DisableGitOpsResponse>
     */
    public SyncInvoker<DisableGitOpsRequest, DisableGitOpsResponse> disableGitOpsInvoker(DisableGitOpsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.disableGitOps, hcClient);
    }

    /**
     * 集群启用策略中心
     *
     * 集群启用策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableClusterPolicyRequest 请求对象
     * @return EnableClusterPolicyResponse
     */
    public EnableClusterPolicyResponse enableClusterPolicy(EnableClusterPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.enableClusterPolicy);
    }

    /**
     * 集群启用策略中心
     *
     * 集群启用策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableClusterPolicyRequest 请求对象
     * @return SyncInvoker<EnableClusterPolicyRequest, EnableClusterPolicyResponse>
     */
    public SyncInvoker<EnableClusterPolicyRequest, EnableClusterPolicyResponse> enableClusterPolicyInvoker(
        EnableClusterPolicyRequest request) {
        return new SyncInvoker<>(request, UcsMeta.enableClusterPolicy, hcClient);
    }

    /**
     * 启用Gitops插件
     *
     * 启用Gitops插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableGitOpsRequest 请求对象
     * @return EnableGitOpsResponse
     */
    public EnableGitOpsResponse enableGitOps(EnableGitOpsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.enableGitOps);
    }

    /**
     * 启用Gitops插件
     *
     * 启用Gitops插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableGitOpsRequest 请求对象
     * @return SyncInvoker<EnableGitOpsRequest, EnableGitOpsResponse>
     */
    public SyncInvoker<EnableGitOpsRequest, EnableGitOpsResponse> enableGitOpsInvoker(EnableGitOpsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.enableGitOps, hcClient);
    }

    /**
     * 获取租户的CCE集群列表
     *
     * 获取当前租户的CCE集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedClustersRequest 请求对象
     * @return ListManagedClustersResponse
     */
    public ListManagedClustersResponse listManagedClusters(ListManagedClustersRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listManagedClusters);
    }

    /**
     * 获取租户的CCE集群列表
     *
     * 获取当前租户的CCE集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedClustersRequest 请求对象
     * @return SyncInvoker<ListManagedClustersRequest, ListManagedClustersResponse>
     */
    public SyncInvoker<ListManagedClustersRequest, ListManagedClustersResponse> listManagedClustersInvoker(
        ListManagedClustersRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listManagedClusters, hcClient);
    }

    /**
     * 查询支持接入UCS的集群版本列表
     *
     * 查询支持接入UCS的集群版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegisteredClusterVersionsRequest 请求对象
     * @return ListRegisteredClusterVersionsResponse
     */
    public ListRegisteredClusterVersionsResponse listRegisteredClusterVersions(
        ListRegisteredClusterVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.listRegisteredClusterVersions);
    }

    /**
     * 查询支持接入UCS的集群版本列表
     *
     * 查询支持接入UCS的集群版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegisteredClusterVersionsRequest 请求对象
     * @return SyncInvoker<ListRegisteredClusterVersionsRequest, ListRegisteredClusterVersionsResponse>
     */
    public SyncInvoker<ListRegisteredClusterVersionsRequest, ListRegisteredClusterVersionsResponse> listRegisteredClusterVersionsInvoker(
        ListRegisteredClusterVersionsRequest request) {
        return new SyncInvoker<>(request, UcsMeta.listRegisteredClusterVersions, hcClient);
    }

    /**
     * 注册集群
     *
     * 集群注册接口。支持三方集群的注册和CCE导入集群的注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClusterRequest 请求对象
     * @return RegisterClusterResponse
     */
    public RegisterClusterResponse registerCluster(RegisterClusterRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.registerCluster);
    }

    /**
     * 注册集群
     *
     * 集群注册接口。支持三方集群的注册和CCE导入集群的注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClusterRequest 请求对象
     * @return SyncInvoker<RegisterClusterRequest, RegisterClusterResponse>
     */
    public SyncInvoker<RegisterClusterRequest, RegisterClusterResponse> registerClusterInvoker(
        RegisterClusterRequest request) {
        return new SyncInvoker<>(request, UcsMeta.registerCluster, hcClient);
    }

    /**
     * 激活集群
     *
     * 激活集群接口；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的更新权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryClusterActivationRequest 请求对象
     * @return RetryClusterActivationResponse
     */
    public RetryClusterActivationResponse retryClusterActivation(RetryClusterActivationRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.retryClusterActivation);
    }

    /**
     * 激活集群
     *
     * 激活集群接口；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的更新权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryClusterActivationRequest 请求对象
     * @return SyncInvoker<RetryClusterActivationRequest, RetryClusterActivationResponse>
     */
    public SyncInvoker<RetryClusterActivationRequest, RetryClusterActivationResponse> retryClusterActivationInvoker(
        RetryClusterActivationRequest request) {
        return new SyncInvoker<>(request, UcsMeta.retryClusterActivation, hcClient);
    }

    /**
     * 获取单个集群
     *
     * 获取集群信息。传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的获取权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return ShowClusterResponse
     */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showCluster);
    }

    /**
     * 获取单个集群
     *
     * 获取集群信息。传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的获取权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showCluster, hcClient);
    }

    /**
     * 获取集群接入信息
     *
     * 该API接口用于获取集群接入信息；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群证书的获取权限，否则会鉴权失败；agent证书只可以下载一次。仅用于获取三方集群的集群接入信息，CCE集群不从该接口获取，如果传入CCE集群ID，返回码为400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAccessInfoRequest 请求对象
     * @return ShowClusterAccessInfoResponse
     */
    public ShowClusterAccessInfoResponse showClusterAccessInfo(ShowClusterAccessInfoRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showClusterAccessInfo);
    }

    /**
     * 获取集群接入信息
     *
     * 该API接口用于获取集群接入信息；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群证书的获取权限，否则会鉴权失败；agent证书只可以下载一次。仅用于获取三方集群的集群接入信息，CCE集群不从该接口获取，如果传入CCE集群ID，返回码为400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAccessInfoRequest 请求对象
     * @return SyncInvoker<ShowClusterAccessInfoRequest, ShowClusterAccessInfoResponse>
     */
    public SyncInvoker<ShowClusterAccessInfoRequest, ShowClusterAccessInfoResponse> showClusterAccessInfoInvoker(
        ShowClusterAccessInfoRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showClusterAccessInfo, hcClient);
    }

    /**
     * 获取集群列表
     *
     * 获取集群信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterListRequest 请求对象
     * @return ShowClusterListResponse
     */
    public ShowClusterListResponse showClusterList(ShowClusterListRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showClusterList);
    }

    /**
     * 获取集群列表
     *
     * 获取集群信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterListRequest 请求对象
     * @return SyncInvoker<ShowClusterListRequest, ShowClusterListResponse>
     */
    public SyncInvoker<ShowClusterListRequest, ShowClusterListResponse> showClusterListInvoker(
        ShowClusterListRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showClusterList, hcClient);
    }

    /**
     * 获取gitops启用进展
     *
     * 获取gitops启用进展
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGitOpsStatusRequest 请求对象
     * @return ShowGitOpsStatusResponse
     */
    public ShowGitOpsStatusResponse showGitOpsStatus(ShowGitOpsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.showGitOpsStatus);
    }

    /**
     * 获取gitops启用进展
     *
     * 获取gitops启用进展
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGitOpsStatusRequest 请求对象
     * @return SyncInvoker<ShowGitOpsStatusRequest, ShowGitOpsStatusResponse>
     */
    public SyncInvoker<ShowGitOpsStatusRequest, ShowGitOpsStatusResponse> showGitOpsStatusInvoker(
        ShowGitOpsStatusRequest request) {
        return new SyncInvoker<>(request, UcsMeta.showGitOpsStatus, hcClient);
    }

    /**
     * 更新集群
     *
     * 更新集群。当前仅允许更新附着集群和本地集群的国家/城市，允许更新多云集群的工作节点个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterRequest 请求对象
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateCluster);
    }

    /**
     * 更新集群
     *
     * 更新集群。当前仅允许更新附着集群和本地集群的国家/城市，允许更新多云集群的工作节点个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterRequest 请求对象
     * @return SyncInvoker<UpdateClusterRequest, UpdateClusterResponse>
     */
    public SyncInvoker<UpdateClusterRequest, UpdateClusterResponse> updateClusterInvoker(UpdateClusterRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateCluster, hcClient);
    }

    /**
     * 集群关联权限策略
     *
     * 集群关联权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterRulesRequest 请求对象
     * @return UpdateClusterRulesResponse
     */
    public UpdateClusterRulesResponse updateClusterRules(UpdateClusterRulesRequest request) {
        return hcClient.syncInvokeHttp(request, UcsMeta.updateClusterRules);
    }

    /**
     * 集群关联权限策略
     *
     * 集群关联权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterRulesRequest 请求对象
     * @return SyncInvoker<UpdateClusterRulesRequest, UpdateClusterRulesResponse>
     */
    public SyncInvoker<UpdateClusterRulesRequest, UpdateClusterRulesResponse> updateClusterRulesInvoker(
        UpdateClusterRulesRequest request) {
        return new SyncInvoker<>(request, UcsMeta.updateClusterRules, hcClient);
    }

}
