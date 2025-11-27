package com.huaweicloud.sdk.ucs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.ucs.v1.model.DisableClusterPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableClusterPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableClustergroupPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableClustergroupPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableFederationRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableFederationResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableGitOpsRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableGitOpsResponse;
import com.huaweicloud.sdk.ucs.v1.model.DownloadFederationKubeconfigRequest;
import com.huaweicloud.sdk.ucs.v1.model.DownloadFederationKubeconfigResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableClusterPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableClusterPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableClustergroupPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableClustergroupPolicyResponse;
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

import java.util.concurrent.CompletableFuture;

public class UcsAsyncClient {

    protected HcClient hcClient;

    public UcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<UcsAsyncClient> newBuilder() {
        ClientBuilder<UcsAsyncClient> clientBuilder = new ClientBuilder<>(UcsAsyncClient::new, "GlobalCredentials");
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
     * @return CompletableFuture<CreateAddonInstanceResponse>
     */
    public CompletableFuture<CreateAddonInstanceResponse> createAddonInstanceAsync(CreateAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createAddonInstance);
    }

    /**
     * 安装插件实例
     *
     * 安装插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddonInstanceRequest 请求对象
     * @return AsyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>
     */
    public AsyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstanceAsyncInvoker(
        CreateAddonInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createAddonInstance, hcClient);
    }

    /**
     * 创建舰队策略实例
     *
     * 创建舰队策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterGroupPolicyInstanceRequest 请求对象
     * @return CompletableFuture<CreateClusterGroupPolicyInstanceResponse>
     */
    public CompletableFuture<CreateClusterGroupPolicyInstanceResponse> createClusterGroupPolicyInstanceAsync(
        CreateClusterGroupPolicyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createClusterGroupPolicyInstance);
    }

    /**
     * 创建舰队策略实例
     *
     * 创建舰队策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterGroupPolicyInstanceRequest 请求对象
     * @return AsyncInvoker<CreateClusterGroupPolicyInstanceRequest, CreateClusterGroupPolicyInstanceResponse>
     */
    public AsyncInvoker<CreateClusterGroupPolicyInstanceRequest, CreateClusterGroupPolicyInstanceResponse> createClusterGroupPolicyInstanceAsyncInvoker(
        CreateClusterGroupPolicyInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createClusterGroupPolicyInstance, hcClient);
    }

    /**
     * 创建配置集合
     *
     * 创建配置集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigSetRequest 请求对象
     * @return CompletableFuture<CreateConfigSetResponse>
     */
    public CompletableFuture<CreateConfigSetResponse> createConfigSetAsync(CreateConfigSetRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createConfigSet);
    }

    /**
     * 创建配置集合
     *
     * 创建配置集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigSetRequest 请求对象
     * @return AsyncInvoker<CreateConfigSetRequest, CreateConfigSetResponse>
     */
    public AsyncInvoker<CreateConfigSetRequest, CreateConfigSetResponse> createConfigSetAsyncInvoker(
        CreateConfigSetRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createConfigSet, hcClient);
    }

    /**
     * 创建联邦网络连接并下载联邦kubeconfig
     *
     * 舰队开通联邦后，调用此接口，创建vpcep终端节点，连接到联邦apiserver，并下载联邦apiserver的kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationCertRequest 请求对象
     * @return CompletableFuture<CreateFederationCertResponse>
     */
    public CompletableFuture<CreateFederationCertResponse> createFederationCertAsync(
        CreateFederationCertRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createFederationCert);
    }

    /**
     * 创建联邦网络连接并下载联邦kubeconfig
     *
     * 舰队开通联邦后，调用此接口，创建vpcep终端节点，连接到联邦apiserver，并下载联邦apiserver的kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationCertRequest 请求对象
     * @return AsyncInvoker<CreateFederationCertRequest, CreateFederationCertResponse>
     */
    public AsyncInvoker<CreateFederationCertRequest, CreateFederationCertResponse> createFederationCertAsyncInvoker(
        CreateFederationCertRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createFederationCert, hcClient);
    }

    /**
     * 创建联邦网络连接
     *
     * 舰队开通联邦后，创建vpcep终端节点连接到联邦apiserver
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationConnectionRequest 请求对象
     * @return CompletableFuture<CreateFederationConnectionResponse>
     */
    public CompletableFuture<CreateFederationConnectionResponse> createFederationConnectionAsync(
        CreateFederationConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createFederationConnection);
    }

    /**
     * 创建联邦网络连接
     *
     * 舰队开通联邦后，创建vpcep终端节点连接到联邦apiserver
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFederationConnectionRequest 请求对象
     * @return AsyncInvoker<CreateFederationConnectionRequest, CreateFederationConnectionResponse>
     */
    public AsyncInvoker<CreateFederationConnectionRequest, CreateFederationConnectionResponse> createFederationConnectionAsyncInvoker(
        CreateFederationConnectionRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createFederationConnection, hcClient);
    }

    /**
     * 创建联邦工作负载
     *
     * 创建联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProxyUnitedWorkloadRequest 请求对象
     * @return CompletableFuture<CreateProxyUnitedWorkloadResponse>
     */
    public CompletableFuture<CreateProxyUnitedWorkloadResponse> createProxyUnitedWorkloadAsync(
        CreateProxyUnitedWorkloadRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createProxyUnitedWorkload);
    }

    /**
     * 创建联邦工作负载
     *
     * 创建联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProxyUnitedWorkloadRequest 请求对象
     * @return AsyncInvoker<CreateProxyUnitedWorkloadRequest, CreateProxyUnitedWorkloadResponse>
     */
    public AsyncInvoker<CreateProxyUnitedWorkloadRequest, CreateProxyUnitedWorkloadResponse> createProxyUnitedWorkloadAsyncInvoker(
        CreateProxyUnitedWorkloadRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createProxyUnitedWorkload, hcClient);
    }

    /**
     * 创建域名解析记录集
     *
     * 创建域名解析记录集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetRequest 请求对象
     * @return CompletableFuture<CreateRecordSetResponse>
     */
    public CompletableFuture<CreateRecordSetResponse> createRecordSetAsync(CreateRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createRecordSet);
    }

    /**
     * 创建域名解析记录集
     *
     * 创建域名解析记录集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>
     */
    public AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSetAsyncInvoker(
        CreateRecordSetRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createRecordSet, hcClient);
    }

    /**
     * 创建仓库源
     *
     * 创建仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return CompletableFuture<CreateRepoResponse>
     */
    public CompletableFuture<CreateRepoResponse> createRepoAsync(CreateRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createRepo);
    }

    /**
     * 创建仓库源
     *
     * 创建仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return AsyncInvoker<CreateRepoRequest, CreateRepoResponse>
     */
    public AsyncInvoker<CreateRepoRequest, CreateRepoResponse> createRepoAsyncInvoker(CreateRepoRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createRepo, hcClient);
    }

    /**
     * 创建权限策略
     *
     * 创建权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return CompletableFuture<CreateRuleResponse>
     */
    public CompletableFuture<CreateRuleResponse> createRuleAsync(CreateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createRule);
    }

    /**
     * 创建权限策略
     *
     * 创建权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return AsyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public AsyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleAsyncInvoker(CreateRuleRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createRule, hcClient);
    }

    /**
     * 卸载插件实例
     *
     * 卸载插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddonInstanceRequest 请求对象
     * @return CompletableFuture<DeleteAddonInstanceResponse>
     */
    public CompletableFuture<DeleteAddonInstanceResponse> deleteAddonInstanceAsync(DeleteAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.deleteAddonInstance);
    }

    /**
     * 卸载插件实例
     *
     * 卸载插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddonInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>
     */
    public AsyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstanceAsyncInvoker(
        DeleteAddonInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.deleteAddonInstance, hcClient);
    }

    /**
     * 删除容器舰队
     *
     * 容器舰队删除接口，只有在容器舰队为空时才可以删除该容器舰队，若需删除请先将集群移出容器舰队；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的操作权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterGroupRequest 请求对象
     * @return CompletableFuture<DeleteClusterGroupResponse>
     */
    public CompletableFuture<DeleteClusterGroupResponse> deleteClusterGroupAsync(DeleteClusterGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.deleteClusterGroup);
    }

    /**
     * 删除容器舰队
     *
     * 容器舰队删除接口，只有在容器舰队为空时才可以删除该容器舰队，若需删除请先将集群移出容器舰队；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的操作权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterGroupRequest 请求对象
     * @return AsyncInvoker<DeleteClusterGroupRequest, DeleteClusterGroupResponse>
     */
    public AsyncInvoker<DeleteClusterGroupRequest, DeleteClusterGroupResponse> deleteClusterGroupAsyncInvoker(
        DeleteClusterGroupRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.deleteClusterGroup, hcClient);
    }

    /**
     * 删除配置集合
     *
     * 仅删除配置集合，不删除仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigSetRequest 请求对象
     * @return CompletableFuture<DeleteConfigSetResponse>
     */
    public CompletableFuture<DeleteConfigSetResponse> deleteConfigSetAsync(DeleteConfigSetRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.deleteConfigSet);
    }

    /**
     * 删除配置集合
     *
     * 仅删除配置集合，不删除仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigSetRequest 请求对象
     * @return AsyncInvoker<DeleteConfigSetRequest, DeleteConfigSetResponse>
     */
    public AsyncInvoker<DeleteConfigSetRequest, DeleteConfigSetResponse> deleteConfigSetAsyncInvoker(
        DeleteConfigSetRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.deleteConfigSet, hcClient);
    }

    /**
     * 删除指定策略实例
     *
     * 删除指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyInstanceRequest 请求对象
     * @return CompletableFuture<DeletePolicyInstanceResponse>
     */
    public CompletableFuture<DeletePolicyInstanceResponse> deletePolicyInstanceAsync(
        DeletePolicyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.deletePolicyInstance);
    }

    /**
     * 删除指定策略实例
     *
     * 删除指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyInstanceRequest 请求对象
     * @return AsyncInvoker<DeletePolicyInstanceRequest, DeletePolicyInstanceResponse>
     */
    public AsyncInvoker<DeletePolicyInstanceRequest, DeletePolicyInstanceResponse> deletePolicyInstanceAsyncInvoker(
        DeletePolicyInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.deletePolicyInstance, hcClient);
    }

    /**
     * 删除联邦工作负载
     *
     * 删除联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProxyUnitedWorkloadRequest 请求对象
     * @return CompletableFuture<DeleteProxyUnitedWorkloadResponse>
     */
    public CompletableFuture<DeleteProxyUnitedWorkloadResponse> deleteProxyUnitedWorkloadAsync(
        DeleteProxyUnitedWorkloadRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.deleteProxyUnitedWorkload);
    }

    /**
     * 删除联邦工作负载
     *
     * 删除联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProxyUnitedWorkloadRequest 请求对象
     * @return AsyncInvoker<DeleteProxyUnitedWorkloadRequest, DeleteProxyUnitedWorkloadResponse>
     */
    public AsyncInvoker<DeleteProxyUnitedWorkloadRequest, DeleteProxyUnitedWorkloadResponse> deleteProxyUnitedWorkloadAsyncInvoker(
        DeleteProxyUnitedWorkloadRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.deleteProxyUnitedWorkload, hcClient);
    }

    /**
     * 删除仓库源
     *
     * 删除仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return CompletableFuture<DeleteRepoResponse>
     */
    public CompletableFuture<DeleteRepoResponse> deleteRepoAsync(DeleteRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.deleteRepo);
    }

    /**
     * 删除仓库源
     *
     * 删除仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return AsyncInvoker<DeleteRepoRequest, DeleteRepoResponse>
     */
    public AsyncInvoker<DeleteRepoRequest, DeleteRepoResponse> deleteRepoAsyncInvoker(DeleteRepoRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.deleteRepo, hcClient);
    }

    /**
     * 删除权限策略
     *
     * 删除权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return CompletableFuture<DeleteRuleResponse>
     */
    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.deleteRule);
    }

    /**
     * 删除权限策略
     *
     * 删除权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleAsyncInvoker(DeleteRuleRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.deleteRule, hcClient);
    }

    /**
     * 舰队关闭策略中心
     *
     * 舰队关闭策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableClustergroupPolicyRequest 请求对象
     * @return CompletableFuture<DisableClustergroupPolicyResponse>
     */
    public CompletableFuture<DisableClustergroupPolicyResponse> disableClustergroupPolicyAsync(
        DisableClustergroupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.disableClustergroupPolicy);
    }

    /**
     * 舰队关闭策略中心
     *
     * 舰队关闭策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableClustergroupPolicyRequest 请求对象
     * @return AsyncInvoker<DisableClustergroupPolicyRequest, DisableClustergroupPolicyResponse>
     */
    public AsyncInvoker<DisableClustergroupPolicyRequest, DisableClustergroupPolicyResponse> disableClustergroupPolicyAsyncInvoker(
        DisableClustergroupPolicyRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.disableClustergroupPolicy, hcClient);
    }

    /**
     * 关闭容器集群联邦
     *
     * 关闭容器舰队联邦
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableFederationRequest 请求对象
     * @return CompletableFuture<DisableFederationResponse>
     */
    public CompletableFuture<DisableFederationResponse> disableFederationAsync(DisableFederationRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.disableFederation);
    }

    /**
     * 关闭容器集群联邦
     *
     * 关闭容器舰队联邦
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableFederationRequest 请求对象
     * @return AsyncInvoker<DisableFederationRequest, DisableFederationResponse>
     */
    public AsyncInvoker<DisableFederationRequest, DisableFederationResponse> disableFederationAsyncInvoker(
        DisableFederationRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.disableFederation, hcClient);
    }

    /**
     * 下载联邦kubeconfig
     *
     * 舰队开通联邦并且创建网络连接之后，可以使用此接口下载联邦的kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadFederationKubeconfigRequest 请求对象
     * @return CompletableFuture<DownloadFederationKubeconfigResponse>
     */
    public CompletableFuture<DownloadFederationKubeconfigResponse> downloadFederationKubeconfigAsync(
        DownloadFederationKubeconfigRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.downloadFederationKubeconfig);
    }

    /**
     * 下载联邦kubeconfig
     *
     * 舰队开通联邦并且创建网络连接之后，可以使用此接口下载联邦的kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadFederationKubeconfigRequest 请求对象
     * @return AsyncInvoker<DownloadFederationKubeconfigRequest, DownloadFederationKubeconfigResponse>
     */
    public AsyncInvoker<DownloadFederationKubeconfigRequest, DownloadFederationKubeconfigResponse> downloadFederationKubeconfigAsyncInvoker(
        DownloadFederationKubeconfigRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.downloadFederationKubeconfig, hcClient);
    }

    /**
     * 舰队启用策略中心
     *
     * 舰队启用策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableClustergroupPolicyRequest 请求对象
     * @return CompletableFuture<EnableClustergroupPolicyResponse>
     */
    public CompletableFuture<EnableClustergroupPolicyResponse> enableClustergroupPolicyAsync(
        EnableClustergroupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.enableClustergroupPolicy);
    }

    /**
     * 舰队启用策略中心
     *
     * 舰队启用策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableClustergroupPolicyRequest 请求对象
     * @return AsyncInvoker<EnableClustergroupPolicyRequest, EnableClustergroupPolicyResponse>
     */
    public AsyncInvoker<EnableClustergroupPolicyRequest, EnableClustergroupPolicyResponse> enableClustergroupPolicyAsyncInvoker(
        EnableClustergroupPolicyRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.enableClustergroupPolicy, hcClient);
    }

    /**
     * 启用容器舰队联邦
     *
     * 启用容器舰队联邦
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableFederationRequest 请求对象
     * @return CompletableFuture<EnableFederationResponse>
     */
    public CompletableFuture<EnableFederationResponse> enableFederationAsync(EnableFederationRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.enableFederation);
    }

    /**
     * 启用容器舰队联邦
     *
     * 启用容器舰队联邦
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableFederationRequest 请求对象
     * @return AsyncInvoker<EnableFederationRequest, EnableFederationResponse>
     */
    public AsyncInvoker<EnableFederationRequest, EnableFederationResponse> enableFederationAsyncInvoker(
        EnableFederationRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.enableFederation, hcClient);
    }

    /**
     * 集群加入容器舰队
     *
     * 集群加入容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request JoinGroupRequest 请求对象
     * @return CompletableFuture<JoinGroupResponse>
     */
    public CompletableFuture<JoinGroupResponse> joinGroupAsync(JoinGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.joinGroup);
    }

    /**
     * 集群加入容器舰队
     *
     * 集群加入容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request JoinGroupRequest 请求对象
     * @return AsyncInvoker<JoinGroupRequest, JoinGroupResponse>
     */
    public AsyncInvoker<JoinGroupRequest, JoinGroupResponse> joinGroupAsyncInvoker(JoinGroupRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.joinGroup, hcClient);
    }

    /**
     * 集群移出容器舰队
     *
     * 集群退出容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LeaveGroupRequest 请求对象
     * @return CompletableFuture<LeaveGroupResponse>
     */
    public CompletableFuture<LeaveGroupResponse> leaveGroupAsync(LeaveGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.leaveGroup);
    }

    /**
     * 集群移出容器舰队
     *
     * 集群退出容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LeaveGroupRequest 请求对象
     * @return AsyncInvoker<LeaveGroupRequest, LeaveGroupResponse>
     */
    public AsyncInvoker<LeaveGroupRequest, LeaveGroupResponse> leaveGroupAsyncInvoker(LeaveGroupRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.leaveGroup, hcClient);
    }

    /**
     * 获取插件实例列表
     *
     * 获取插件实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddonInstancesRequest 请求对象
     * @return CompletableFuture<ListAddonInstancesResponse>
     */
    public CompletableFuture<ListAddonInstancesResponse> listAddonInstancesAsync(ListAddonInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listAddonInstances);
    }

    /**
     * 获取插件实例列表
     *
     * 获取插件实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddonInstancesRequest 请求对象
     * @return AsyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>
     */
    public AsyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstancesAsyncInvoker(
        ListAddonInstancesRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listAddonInstances, hcClient);
    }

    /**
     * 获取插件模板列表
     *
     * 获取插件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddonTemplatesRequest 请求对象
     * @return CompletableFuture<ListAddonTemplatesResponse>
     */
    public CompletableFuture<ListAddonTemplatesResponse> listAddonTemplatesAsync(ListAddonTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listAddonTemplates);
    }

    /**
     * 获取插件模板列表
     *
     * 获取插件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddonTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>
     */
    public AsyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplatesAsyncInvoker(
        ListAddonTemplatesRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listAddonTemplates, hcClient);
    }

    /**
     * 获取容器舰队列表
     *
     * 获取所有容器舰队信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterGroupRequest 请求对象
     * @return CompletableFuture<ListClusterGroupResponse>
     */
    public CompletableFuture<ListClusterGroupResponse> listClusterGroupAsync(ListClusterGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listClusterGroup);
    }

    /**
     * 获取容器舰队列表
     *
     * 获取所有容器舰队信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterGroupRequest 请求对象
     * @return AsyncInvoker<ListClusterGroupRequest, ListClusterGroupResponse>
     */
    public AsyncInvoker<ListClusterGroupRequest, ListClusterGroupResponse> listClusterGroupAsyncInvoker(
        ListClusterGroupRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listClusterGroup, hcClient);
    }

    /**
     * 获取所有配置集合信息
     *
     * 获取所有配置集合信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigSetsRequest 请求对象
     * @return CompletableFuture<ListConfigSetsResponse>
     */
    public CompletableFuture<ListConfigSetsResponse> listConfigSetsAsync(ListConfigSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listConfigSets);
    }

    /**
     * 获取所有配置集合信息
     *
     * 获取所有配置集合信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigSetsRequest 请求对象
     * @return AsyncInvoker<ListConfigSetsRequest, ListConfigSetsResponse>
     */
    public AsyncInvoker<ListConfigSetsRequest, ListConfigSetsResponse> listConfigSetsAsyncInvoker(
        ListConfigSetsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listConfigSets, hcClient);
    }

    /**
     * 获取策略定义列表
     *
     * 获取策略定义列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyDefinitionsRequest 请求对象
     * @return CompletableFuture<ListPolicyDefinitionsResponse>
     */
    public CompletableFuture<ListPolicyDefinitionsResponse> listPolicyDefinitionsAsync(
        ListPolicyDefinitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listPolicyDefinitions);
    }

    /**
     * 获取策略定义列表
     *
     * 获取策略定义列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyDefinitionsRequest 请求对象
     * @return AsyncInvoker<ListPolicyDefinitionsRequest, ListPolicyDefinitionsResponse>
     */
    public AsyncInvoker<ListPolicyDefinitionsRequest, ListPolicyDefinitionsResponse> listPolicyDefinitionsAsyncInvoker(
        ListPolicyDefinitionsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listPolicyDefinitions, hcClient);
    }

    /**
     * 获取策略实例列表
     *
     * 获取策略实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyInstancesRequest 请求对象
     * @return CompletableFuture<ListPolicyInstancesResponse>
     */
    public CompletableFuture<ListPolicyInstancesResponse> listPolicyInstancesAsync(ListPolicyInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listPolicyInstances);
    }

    /**
     * 获取策略实例列表
     *
     * 获取策略实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyInstancesRequest 请求对象
     * @return AsyncInvoker<ListPolicyInstancesRequest, ListPolicyInstancesResponse>
     */
    public AsyncInvoker<ListPolicyInstancesRequest, ListPolicyInstancesResponse> listPolicyInstancesAsyncInvoker(
        ListPolicyInstancesRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listPolicyInstances, hcClient);
    }

    /**
     * 获取策略实例任务列表
     *
     * 获取策略实例任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyJobsRequest 请求对象
     * @return CompletableFuture<ListPolicyJobsResponse>
     */
    public CompletableFuture<ListPolicyJobsResponse> listPolicyJobsAsync(ListPolicyJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listPolicyJobs);
    }

    /**
     * 获取策略实例任务列表
     *
     * 获取策略实例任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyJobsRequest 请求对象
     * @return AsyncInvoker<ListPolicyJobsRequest, ListPolicyJobsResponse>
     */
    public AsyncInvoker<ListPolicyJobsRequest, ListPolicyJobsResponse> listPolicyJobsAsyncInvoker(
        ListPolicyJobsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listPolicyJobs, hcClient);
    }

    /**
     * 查询域名解析记录集列表
     *
     * 查询域名解析记录集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsRequest 请求对象
     * @return CompletableFuture<ListRecordSetsResponse>
     */
    public CompletableFuture<ListRecordSetsResponse> listRecordSetsAsync(ListRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listRecordSets);
    }

    /**
     * 查询域名解析记录集列表
     *
     * 查询域名解析记录集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>
     */
    public AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSetsAsyncInvoker(
        ListRecordSetsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listRecordSets, hcClient);
    }

    /**
     * 获取仓库源列表
     *
     * 获取仓库源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposRequest 请求对象
     * @return CompletableFuture<ListReposResponse>
     */
    public CompletableFuture<ListReposResponse> listReposAsync(ListReposRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listRepos);
    }

    /**
     * 获取仓库源列表
     *
     * 获取仓库源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposRequest 请求对象
     * @return AsyncInvoker<ListReposRequest, ListReposResponse>
     */
    public AsyncInvoker<ListReposRequest, ListReposResponse> listReposAsyncInvoker(ListReposRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listRepos, hcClient);
    }

    /**
     * 获取权限策略列表
     *
     * 获取权限策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleRequest 请求对象
     * @return CompletableFuture<ListRuleResponse>
     */
    public CompletableFuture<ListRuleResponse> listRuleAsync(ListRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listRule);
    }

    /**
     * 获取权限策略列表
     *
     * 获取权限策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleRequest 请求对象
     * @return AsyncInvoker<ListRuleRequest, ListRuleResponse>
     */
    public AsyncInvoker<ListRuleRequest, ListRuleResponse> listRuleAsyncInvoker(ListRuleRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listRule, hcClient);
    }

    /**
     * 查询服务配置信息
     *
     * 获取各个类型集群的全局配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerConfigsRequest 请求对象
     * @return CompletableFuture<ListServerConfigsResponse>
     */
    public CompletableFuture<ListServerConfigsResponse> listServerConfigsAsync(ListServerConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listServerConfigs);
    }

    /**
     * 查询服务配置信息
     *
     * 获取各个类型集群的全局配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerConfigsRequest 请求对象
     * @return AsyncInvoker<ListServerConfigsRequest, ListServerConfigsResponse>
     */
    public AsyncInvoker<ListServerConfigsRequest, ListServerConfigsResponse> listServerConfigsAsyncInvoker(
        ListServerConfigsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listServerConfigs, hcClient);
    }

    /**
     * 注册容器舰队
     *
     * 容器舰队创建API，生成容器舰队时可以选择关联的集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClusterGroupRequest 请求对象
     * @return CompletableFuture<RegisterClusterGroupResponse>
     */
    public CompletableFuture<RegisterClusterGroupResponse> registerClusterGroupAsync(
        RegisterClusterGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.registerClusterGroup);
    }

    /**
     * 注册容器舰队
     *
     * 容器舰队创建API，生成容器舰队时可以选择关联的集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClusterGroupRequest 请求对象
     * @return AsyncInvoker<RegisterClusterGroupRequest, RegisterClusterGroupResponse>
     */
    public AsyncInvoker<RegisterClusterGroupRequest, RegisterClusterGroupResponse> registerClusterGroupAsyncInvoker(
        RegisterClusterGroupRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.registerClusterGroup, hcClient);
    }

    /**
     * 获取插件实例
     *
     * 获取插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddonInstanceRequest 请求对象
     * @return CompletableFuture<ShowAddonInstanceResponse>
     */
    public CompletableFuture<ShowAddonInstanceResponse> showAddonInstanceAsync(ShowAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showAddonInstance);
    }

    /**
     * 获取插件实例
     *
     * 获取插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddonInstanceRequest 请求对象
     * @return AsyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>
     */
    public AsyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstanceAsyncInvoker(
        ShowAddonInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showAddonInstance, hcClient);
    }

    /**
     * 获取单个容器舰队
     *
     * 获取单个容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterGroupRequest 请求对象
     * @return CompletableFuture<ShowClusterGroupResponse>
     */
    public CompletableFuture<ShowClusterGroupResponse> showClusterGroupAsync(ShowClusterGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showClusterGroup);
    }

    /**
     * 获取单个容器舰队
     *
     * 获取单个容器舰队
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterGroupRequest 请求对象
     * @return AsyncInvoker<ShowClusterGroupRequest, ShowClusterGroupResponse>
     */
    public AsyncInvoker<ShowClusterGroupRequest, ShowClusterGroupResponse> showClusterGroupAsyncInvoker(
        ShowClusterGroupRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showClusterGroup, hcClient);
    }

    /**
     * 获取配置集合详细信息
     *
     * 获取配置集合详细信息，包含仓库源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigSetRequest 请求对象
     * @return CompletableFuture<ShowConfigSetResponse>
     */
    public CompletableFuture<ShowConfigSetResponse> showConfigSetAsync(ShowConfigSetRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showConfigSet);
    }

    /**
     * 获取配置集合详细信息
     *
     * 获取配置集合详细信息，包含仓库源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigSetRequest 请求对象
     * @return AsyncInvoker<ShowConfigSetRequest, ShowConfigSetResponse>
     */
    public AsyncInvoker<ShowConfigSetRequest, ShowConfigSetResponse> showConfigSetAsyncInvoker(
        ShowConfigSetRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showConfigSet, hcClient);
    }

    /**
     * 查询联邦开启进度
     *
     * 查询联邦开启进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFederationProgressRequest 请求对象
     * @return CompletableFuture<ShowFederationProgressResponse>
     */
    public CompletableFuture<ShowFederationProgressResponse> showFederationProgressAsync(
        ShowFederationProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showFederationProgress);
    }

    /**
     * 查询联邦开启进度
     *
     * 查询联邦开启进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFederationProgressRequest 请求对象
     * @return AsyncInvoker<ShowFederationProgressRequest, ShowFederationProgressResponse>
     */
    public AsyncInvoker<ShowFederationProgressRequest, ShowFederationProgressResponse> showFederationProgressAsyncInvoker(
        ShowFederationProgressRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showFederationProgress, hcClient);
    }

    /**
     * 统计某个用户所有配置集合的运行状态
     *
     * 统计某个用户所有配置集合的运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGitopsStatisticsRequest 请求对象
     * @return CompletableFuture<ShowGitopsStatisticsResponse>
     */
    public CompletableFuture<ShowGitopsStatisticsResponse> showGitopsStatisticsAsync(
        ShowGitopsStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showGitopsStatistics);
    }

    /**
     * 统计某个用户所有配置集合的运行状态
     *
     * 统计某个用户所有配置集合的运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGitopsStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowGitopsStatisticsRequest, ShowGitopsStatisticsResponse>
     */
    public AsyncInvoker<ShowGitopsStatisticsRequest, ShowGitopsStatisticsResponse> showGitopsStatisticsAsyncInvoker(
        ShowGitopsStatisticsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showGitopsStatistics, hcClient);
    }

    /**
     * 获取策略定义
     *
     * 获取策略定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyDefinitionRequest 请求对象
     * @return CompletableFuture<ShowPolicyDefinitionResponse>
     */
    public CompletableFuture<ShowPolicyDefinitionResponse> showPolicyDefinitionAsync(
        ShowPolicyDefinitionRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showPolicyDefinition);
    }

    /**
     * 获取策略定义
     *
     * 获取策略定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyDefinitionRequest 请求对象
     * @return AsyncInvoker<ShowPolicyDefinitionRequest, ShowPolicyDefinitionResponse>
     */
    public AsyncInvoker<ShowPolicyDefinitionRequest, ShowPolicyDefinitionResponse> showPolicyDefinitionAsyncInvoker(
        ShowPolicyDefinitionRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showPolicyDefinition, hcClient);
    }

    /**
     * 获取指定策略实例
     *
     * 获取指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyInstanceRequest 请求对象
     * @return CompletableFuture<ShowPolicyInstanceResponse>
     */
    public CompletableFuture<ShowPolicyInstanceResponse> showPolicyInstanceAsync(ShowPolicyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showPolicyInstance);
    }

    /**
     * 获取指定策略实例
     *
     * 获取指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyInstanceRequest 请求对象
     * @return AsyncInvoker<ShowPolicyInstanceRequest, ShowPolicyInstanceResponse>
     */
    public AsyncInvoker<ShowPolicyInstanceRequest, ShowPolicyInstanceResponse> showPolicyInstanceAsyncInvoker(
        ShowPolicyInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showPolicyInstance, hcClient);
    }

    /**
     * 获取指定策略实例相关任务
     *
     * 获取指定策略实例相关任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyJobRequest 请求对象
     * @return CompletableFuture<ShowPolicyJobResponse>
     */
    public CompletableFuture<ShowPolicyJobResponse> showPolicyJobAsync(ShowPolicyJobRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showPolicyJob);
    }

    /**
     * 获取指定策略实例相关任务
     *
     * 获取指定策略实例相关任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyJobRequest 请求对象
     * @return AsyncInvoker<ShowPolicyJobRequest, ShowPolicyJobResponse>
     */
    public AsyncInvoker<ShowPolicyJobRequest, ShowPolicyJobResponse> showPolicyJobAsyncInvoker(
        ShowPolicyJobRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showPolicyJob, hcClient);
    }

    /**
     * 查询联邦工作负载
     *
     * 查询联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyUnitedWorkloadRequest 请求对象
     * @return CompletableFuture<ShowProxyUnitedWorkloadResponse>
     */
    public CompletableFuture<ShowProxyUnitedWorkloadResponse> showProxyUnitedWorkloadAsync(
        ShowProxyUnitedWorkloadRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showProxyUnitedWorkload);
    }

    /**
     * 查询联邦工作负载
     *
     * 查询联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyUnitedWorkloadRequest 请求对象
     * @return AsyncInvoker<ShowProxyUnitedWorkloadRequest, ShowProxyUnitedWorkloadResponse>
     */
    public AsyncInvoker<ShowProxyUnitedWorkloadRequest, ShowProxyUnitedWorkloadResponse> showProxyUnitedWorkloadAsyncInvoker(
        ShowProxyUnitedWorkloadRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showProxyUnitedWorkload, hcClient);
    }

    /**
     * 获取配额信息
     *
     * 获取UCS配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showQuota);
    }

    /**
     * 获取配额信息
     *
     * 获取UCS配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showQuota, hcClient);
    }

    /**
     * 更新插件实例
     *
     * 更新插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddonInstanceRequest 请求对象
     * @return CompletableFuture<UpdateAddonInstanceResponse>
     */
    public CompletableFuture<UpdateAddonInstanceResponse> updateAddonInstanceAsync(UpdateAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateAddonInstance);
    }

    /**
     * 更新插件实例
     *
     * 更新插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddonInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>
     */
    public AsyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstanceAsyncInvoker(
        UpdateAddonInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateAddonInstance, hcClient);
    }

    /**
     * 更新容器舰队描述信息
     *
     * 更新集群所属的容器舰队description信息；需要用户对相应容器舰队有更新权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupRequest 请求对象
     * @return CompletableFuture<UpdateClusterGroupResponse>
     */
    public CompletableFuture<UpdateClusterGroupResponse> updateClusterGroupAsync(UpdateClusterGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateClusterGroup);
    }

    /**
     * 更新容器舰队描述信息
     *
     * 更新集群所属的容器舰队description信息；需要用户对相应容器舰队有更新权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupRequest 请求对象
     * @return AsyncInvoker<UpdateClusterGroupRequest, UpdateClusterGroupResponse>
     */
    public AsyncInvoker<UpdateClusterGroupRequest, UpdateClusterGroupResponse> updateClusterGroupAsyncInvoker(
        UpdateClusterGroupRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateClusterGroup, hcClient);
    }

    /**
     * 向容器舰队中添加集群
     *
     * 向容器舰队中添加集群，同批次可以添加一个或多个集群，该接口无法清空或减少管理的集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedClustersRequest 请求对象
     * @return CompletableFuture<UpdateClusterGroupAssociatedClustersResponse>
     */
    public CompletableFuture<UpdateClusterGroupAssociatedClustersResponse> updateClusterGroupAssociatedClustersAsync(
        UpdateClusterGroupAssociatedClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateClusterGroupAssociatedClusters);
    }

    /**
     * 向容器舰队中添加集群
     *
     * 向容器舰队中添加集群，同批次可以添加一个或多个集群，该接口无法清空或减少管理的集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedClustersRequest 请求对象
     * @return AsyncInvoker<UpdateClusterGroupAssociatedClustersRequest, UpdateClusterGroupAssociatedClustersResponse>
     */
    public AsyncInvoker<UpdateClusterGroupAssociatedClustersRequest, UpdateClusterGroupAssociatedClustersResponse> updateClusterGroupAssociatedClustersAsyncInvoker(
        UpdateClusterGroupAssociatedClustersRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateClusterGroupAssociatedClusters, hcClient);
    }

    /**
     * 更新容器舰队关联权限策略
     *
     * 更新容器舰队关联权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedRulesRequest 请求对象
     * @return CompletableFuture<UpdateClusterGroupAssociatedRulesResponse>
     */
    public CompletableFuture<UpdateClusterGroupAssociatedRulesResponse> updateClusterGroupAssociatedRulesAsync(
        UpdateClusterGroupAssociatedRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateClusterGroupAssociatedRules);
    }

    /**
     * 更新容器舰队关联权限策略
     *
     * 更新容器舰队关联权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedRulesRequest 请求对象
     * @return AsyncInvoker<UpdateClusterGroupAssociatedRulesRequest, UpdateClusterGroupAssociatedRulesResponse>
     */
    public AsyncInvoker<UpdateClusterGroupAssociatedRulesRequest, UpdateClusterGroupAssociatedRulesResponse> updateClusterGroupAssociatedRulesAsyncInvoker(
        UpdateClusterGroupAssociatedRulesRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateClusterGroupAssociatedRules, hcClient);
    }

    /**
     * 更新容器舰队的联邦对应的zone
     *
     * 更新容器舰队的集群联邦关联的zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedZonesRequest 请求对象
     * @return CompletableFuture<UpdateClusterGroupAssociatedZonesResponse>
     */
    public CompletableFuture<UpdateClusterGroupAssociatedZonesResponse> updateClusterGroupAssociatedZonesAsync(
        UpdateClusterGroupAssociatedZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateClusterGroupAssociatedZones);
    }

    /**
     * 更新容器舰队的联邦对应的zone
     *
     * 更新容器舰队的集群联邦关联的zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterGroupAssociatedZonesRequest 请求对象
     * @return AsyncInvoker<UpdateClusterGroupAssociatedZonesRequest, UpdateClusterGroupAssociatedZonesResponse>
     */
    public AsyncInvoker<UpdateClusterGroupAssociatedZonesRequest, UpdateClusterGroupAssociatedZonesResponse> updateClusterGroupAssociatedZonesAsyncInvoker(
        UpdateClusterGroupAssociatedZonesRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateClusterGroupAssociatedZones, hcClient);
    }

    /**
     * 更新配置集合信息
     *
     * 仅更新配置集合，不更新仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigSetRequest 请求对象
     * @return CompletableFuture<UpdateConfigSetResponse>
     */
    public CompletableFuture<UpdateConfigSetResponse> updateConfigSetAsync(UpdateConfigSetRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateConfigSet);
    }

    /**
     * 更新配置集合信息
     *
     * 仅更新配置集合，不更新仓库源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigSetRequest 请求对象
     * @return AsyncInvoker<UpdateConfigSetRequest, UpdateConfigSetResponse>
     */
    public AsyncInvoker<UpdateConfigSetRequest, UpdateConfigSetResponse> updateConfigSetAsyncInvoker(
        UpdateConfigSetRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateConfigSet, hcClient);
    }

    /**
     * 更新策略定义
     *
     * 更新策略定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyDefinationRequest 请求对象
     * @return CompletableFuture<UpdatePolicyDefinationResponse>
     */
    public CompletableFuture<UpdatePolicyDefinationResponse> updatePolicyDefinationAsync(
        UpdatePolicyDefinationRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updatePolicyDefination);
    }

    /**
     * 更新策略定义
     *
     * 更新策略定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyDefinationRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyDefinationRequest, UpdatePolicyDefinationResponse>
     */
    public AsyncInvoker<UpdatePolicyDefinationRequest, UpdatePolicyDefinationResponse> updatePolicyDefinationAsyncInvoker(
        UpdatePolicyDefinationRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updatePolicyDefination, hcClient);
    }

    /**
     * 更新指定策略实例
     *
     * 更新指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyInstanceRequest 请求对象
     * @return CompletableFuture<UpdatePolicyInstanceResponse>
     */
    public CompletableFuture<UpdatePolicyInstanceResponse> updatePolicyInstanceAsync(
        UpdatePolicyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updatePolicyInstance);
    }

    /**
     * 更新指定策略实例
     *
     * 更新指定策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyInstanceRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyInstanceRequest, UpdatePolicyInstanceResponse>
     */
    public AsyncInvoker<UpdatePolicyInstanceRequest, UpdatePolicyInstanceResponse> updatePolicyInstanceAsyncInvoker(
        UpdatePolicyInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updatePolicyInstance, hcClient);
    }

    /**
     * 更新联邦工作负载
     *
     * 更新联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyUnitedWorkloadRequest 请求对象
     * @return CompletableFuture<UpdateProxyUnitedWorkloadResponse>
     */
    public CompletableFuture<UpdateProxyUnitedWorkloadResponse> updateProxyUnitedWorkloadAsync(
        UpdateProxyUnitedWorkloadRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateProxyUnitedWorkload);
    }

    /**
     * 更新联邦工作负载
     *
     * 更新联邦工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyUnitedWorkloadRequest 请求对象
     * @return AsyncInvoker<UpdateProxyUnitedWorkloadRequest, UpdateProxyUnitedWorkloadResponse>
     */
    public AsyncInvoker<UpdateProxyUnitedWorkloadRequest, UpdateProxyUnitedWorkloadResponse> updateProxyUnitedWorkloadAsyncInvoker(
        UpdateProxyUnitedWorkloadRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateProxyUnitedWorkload, hcClient);
    }

    /**
     * 更新仓库源信息
     *
     * 更新仓库源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return CompletableFuture<UpdateRepoResponse>
     */
    public CompletableFuture<UpdateRepoResponse> updateRepoAsync(UpdateRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateRepo);
    }

    /**
     * 更新仓库源信息
     *
     * 更新仓库源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return AsyncInvoker<UpdateRepoRequest, UpdateRepoResponse>
     */
    public AsyncInvoker<UpdateRepoRequest, UpdateRepoResponse> updateRepoAsyncInvoker(UpdateRepoRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateRepo, hcClient);
    }

    /**
     * 更新权限策略
     *
     * 更新权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleRequest 请求对象
     * @return CompletableFuture<UpdateRuleResponse>
     */
    public CompletableFuture<UpdateRuleResponse> updateRuleAsync(UpdateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateRule);
    }

    /**
     * 更新权限策略
     *
     * 更新权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleAsyncInvoker(UpdateRuleRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateRule, hcClient);
    }

    /**
     * 升级容器舰队联邦
     *
     * 容器舰队联邦版本升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeFederationRequest 请求对象
     * @return CompletableFuture<UpgradeFederationResponse>
     */
    public CompletableFuture<UpgradeFederationResponse> upgradeFederationAsync(UpgradeFederationRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.upgradeFederation);
    }

    /**
     * 升级容器舰队联邦
     *
     * 容器舰队联邦版本升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeFederationRequest 请求对象
     * @return AsyncInvoker<UpgradeFederationRequest, UpgradeFederationResponse>
     */
    public AsyncInvoker<UpgradeFederationRequest, UpgradeFederationResponse> upgradeFederationAsyncInvoker(
        UpgradeFederationRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.upgradeFederation, hcClient);
    }

    /**
     * 获取集群安装时所需的配置信息
     *
     * 获取集群安装时所需的配置信息，当前仅本地集群使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterConfRequest 请求对象
     * @return CompletableFuture<CreateClusterConfResponse>
     */
    public CompletableFuture<CreateClusterConfResponse> createClusterConfAsync(CreateClusterConfRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createClusterConf);
    }

    /**
     * 获取集群安装时所需的配置信息
     *
     * 获取集群安装时所需的配置信息，当前仅本地集群使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterConfRequest 请求对象
     * @return AsyncInvoker<CreateClusterConfRequest, CreateClusterConfResponse>
     */
    public AsyncInvoker<CreateClusterConfRequest, CreateClusterConfResponse> createClusterConfAsyncInvoker(
        CreateClusterConfRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createClusterConf, hcClient);
    }

    /**
     * 获取集群kubeconfig
     *
     * 获取集群kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterKubeconfigRequest 请求对象
     * @return CompletableFuture<CreateClusterKubeconfigResponse>
     */
    public CompletableFuture<CreateClusterKubeconfigResponse> createClusterKubeconfigAsync(
        CreateClusterKubeconfigRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createClusterKubeconfig);
    }

    /**
     * 获取集群kubeconfig
     *
     * 获取集群kubeconfig
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterKubeconfigRequest 请求对象
     * @return AsyncInvoker<CreateClusterKubeconfigRequest, CreateClusterKubeconfigResponse>
     */
    public AsyncInvoker<CreateClusterKubeconfigRequest, CreateClusterKubeconfigResponse> createClusterKubeconfigAsyncInvoker(
        CreateClusterKubeconfigRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createClusterKubeconfig, hcClient);
    }

    /**
     * 创建集群建策略实例
     *
     * 创建集群建策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterPolicyInstanceRequest 请求对象
     * @return CompletableFuture<CreateClusterPolicyInstanceResponse>
     */
    public CompletableFuture<CreateClusterPolicyInstanceResponse> createClusterPolicyInstanceAsync(
        CreateClusterPolicyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.createClusterPolicyInstance);
    }

    /**
     * 创建集群建策略实例
     *
     * 创建集群建策略实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterPolicyInstanceRequest 请求对象
     * @return AsyncInvoker<CreateClusterPolicyInstanceRequest, CreateClusterPolicyInstanceResponse>
     */
    public AsyncInvoker<CreateClusterPolicyInstanceRequest, CreateClusterPolicyInstanceResponse> createClusterPolicyInstanceAsyncInvoker(
        CreateClusterPolicyInstanceRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.createClusterPolicyInstance, hcClient);
    }

    /**
     * 删除集群
     *
     * 用于集群解除注册；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的操作权限，否则会鉴权失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 用于集群解除注册；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的操作权限，否则会鉴权失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.deleteCluster, hcClient);
    }

    /**
     * 集群关闭策略中心
     *
     * 集群关闭策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableClusterPolicyRequest 请求对象
     * @return CompletableFuture<DisableClusterPolicyResponse>
     */
    public CompletableFuture<DisableClusterPolicyResponse> disableClusterPolicyAsync(
        DisableClusterPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.disableClusterPolicy);
    }

    /**
     * 集群关闭策略中心
     *
     * 集群关闭策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableClusterPolicyRequest 请求对象
     * @return AsyncInvoker<DisableClusterPolicyRequest, DisableClusterPolicyResponse>
     */
    public AsyncInvoker<DisableClusterPolicyRequest, DisableClusterPolicyResponse> disableClusterPolicyAsyncInvoker(
        DisableClusterPolicyRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.disableClusterPolicy, hcClient);
    }

    /**
     * 卸载集群gitops插件
     *
     * 卸载集群gitops插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableGitOpsRequest 请求对象
     * @return CompletableFuture<DisableGitOpsResponse>
     */
    public CompletableFuture<DisableGitOpsResponse> disableGitOpsAsync(DisableGitOpsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.disableGitOps);
    }

    /**
     * 卸载集群gitops插件
     *
     * 卸载集群gitops插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableGitOpsRequest 请求对象
     * @return AsyncInvoker<DisableGitOpsRequest, DisableGitOpsResponse>
     */
    public AsyncInvoker<DisableGitOpsRequest, DisableGitOpsResponse> disableGitOpsAsyncInvoker(
        DisableGitOpsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.disableGitOps, hcClient);
    }

    /**
     * 集群启用策略中心
     *
     * 集群启用策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableClusterPolicyRequest 请求对象
     * @return CompletableFuture<EnableClusterPolicyResponse>
     */
    public CompletableFuture<EnableClusterPolicyResponse> enableClusterPolicyAsync(EnableClusterPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.enableClusterPolicy);
    }

    /**
     * 集群启用策略中心
     *
     * 集群启用策略中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableClusterPolicyRequest 请求对象
     * @return AsyncInvoker<EnableClusterPolicyRequest, EnableClusterPolicyResponse>
     */
    public AsyncInvoker<EnableClusterPolicyRequest, EnableClusterPolicyResponse> enableClusterPolicyAsyncInvoker(
        EnableClusterPolicyRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.enableClusterPolicy, hcClient);
    }

    /**
     * 启用Gitops插件
     *
     * 启用Gitops插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableGitOpsRequest 请求对象
     * @return CompletableFuture<EnableGitOpsResponse>
     */
    public CompletableFuture<EnableGitOpsResponse> enableGitOpsAsync(EnableGitOpsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.enableGitOps);
    }

    /**
     * 启用Gitops插件
     *
     * 启用Gitops插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableGitOpsRequest 请求对象
     * @return AsyncInvoker<EnableGitOpsRequest, EnableGitOpsResponse>
     */
    public AsyncInvoker<EnableGitOpsRequest, EnableGitOpsResponse> enableGitOpsAsyncInvoker(
        EnableGitOpsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.enableGitOps, hcClient);
    }

    /**
     * 获取租户的CCE集群列表
     *
     * 获取当前租户的CCE集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedClustersRequest 请求对象
     * @return CompletableFuture<ListManagedClustersResponse>
     */
    public CompletableFuture<ListManagedClustersResponse> listManagedClustersAsync(ListManagedClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listManagedClusters);
    }

    /**
     * 获取租户的CCE集群列表
     *
     * 获取当前租户的CCE集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedClustersRequest 请求对象
     * @return AsyncInvoker<ListManagedClustersRequest, ListManagedClustersResponse>
     */
    public AsyncInvoker<ListManagedClustersRequest, ListManagedClustersResponse> listManagedClustersAsyncInvoker(
        ListManagedClustersRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listManagedClusters, hcClient);
    }

    /**
     * 查询支持接入UCS的集群版本列表
     *
     * 查询支持接入UCS的集群版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegisteredClusterVersionsRequest 请求对象
     * @return CompletableFuture<ListRegisteredClusterVersionsResponse>
     */
    public CompletableFuture<ListRegisteredClusterVersionsResponse> listRegisteredClusterVersionsAsync(
        ListRegisteredClusterVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.listRegisteredClusterVersions);
    }

    /**
     * 查询支持接入UCS的集群版本列表
     *
     * 查询支持接入UCS的集群版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegisteredClusterVersionsRequest 请求对象
     * @return AsyncInvoker<ListRegisteredClusterVersionsRequest, ListRegisteredClusterVersionsResponse>
     */
    public AsyncInvoker<ListRegisteredClusterVersionsRequest, ListRegisteredClusterVersionsResponse> listRegisteredClusterVersionsAsyncInvoker(
        ListRegisteredClusterVersionsRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.listRegisteredClusterVersions, hcClient);
    }

    /**
     * 注册集群
     *
     * 集群注册接口。支持三方集群的注册和CCE导入集群的注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClusterRequest 请求对象
     * @return CompletableFuture<RegisterClusterResponse>
     */
    public CompletableFuture<RegisterClusterResponse> registerClusterAsync(RegisterClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.registerCluster);
    }

    /**
     * 注册集群
     *
     * 集群注册接口。支持三方集群的注册和CCE导入集群的注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClusterRequest 请求对象
     * @return AsyncInvoker<RegisterClusterRequest, RegisterClusterResponse>
     */
    public AsyncInvoker<RegisterClusterRequest, RegisterClusterResponse> registerClusterAsyncInvoker(
        RegisterClusterRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.registerCluster, hcClient);
    }

    /**
     * 激活集群
     *
     * 激活集群接口；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的更新权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryClusterActivationRequest 请求对象
     * @return CompletableFuture<RetryClusterActivationResponse>
     */
    public CompletableFuture<RetryClusterActivationResponse> retryClusterActivationAsync(
        RetryClusterActivationRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.retryClusterActivation);
    }

    /**
     * 激活集群
     *
     * 激活集群接口；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的更新权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryClusterActivationRequest 请求对象
     * @return AsyncInvoker<RetryClusterActivationRequest, RetryClusterActivationResponse>
     */
    public AsyncInvoker<RetryClusterActivationRequest, RetryClusterActivationResponse> retryClusterActivationAsyncInvoker(
        RetryClusterActivationRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.retryClusterActivation, hcClient);
    }

    /**
     * 获取单个集群
     *
     * 获取集群信息。传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的获取权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return CompletableFuture<ShowClusterResponse>
     */
    public CompletableFuture<ShowClusterResponse> showClusterAsync(ShowClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showCluster);
    }

    /**
     * 获取单个集群
     *
     * 获取集群信息。传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群的获取权限，否则会鉴权失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return AsyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public AsyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterAsyncInvoker(ShowClusterRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showCluster, hcClient);
    }

    /**
     * 获取集群接入信息
     *
     * 该API接口用于获取集群接入信息；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群证书的获取权限，否则会鉴权失败；agent证书只可以下载一次。仅用于获取三方集群的集群接入信息，CCE集群不从该接口获取，如果传入CCE集群ID，返回码为400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAccessInfoRequest 请求对象
     * @return CompletableFuture<ShowClusterAccessInfoResponse>
     */
    public CompletableFuture<ShowClusterAccessInfoResponse> showClusterAccessInfoAsync(
        ShowClusterAccessInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showClusterAccessInfo);
    }

    /**
     * 获取集群接入信息
     *
     * 该API接口用于获取集群接入信息；传入的cluster ID必须符合k8s UUID的格式规则；同时需要用户有对应集群证书的获取权限，否则会鉴权失败；agent证书只可以下载一次。仅用于获取三方集群的集群接入信息，CCE集群不从该接口获取，如果传入CCE集群ID，返回码为400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAccessInfoRequest 请求对象
     * @return AsyncInvoker<ShowClusterAccessInfoRequest, ShowClusterAccessInfoResponse>
     */
    public AsyncInvoker<ShowClusterAccessInfoRequest, ShowClusterAccessInfoResponse> showClusterAccessInfoAsyncInvoker(
        ShowClusterAccessInfoRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showClusterAccessInfo, hcClient);
    }

    /**
     * 获取集群列表
     *
     * 获取集群信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterListRequest 请求对象
     * @return CompletableFuture<ShowClusterListResponse>
     */
    public CompletableFuture<ShowClusterListResponse> showClusterListAsync(ShowClusterListRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showClusterList);
    }

    /**
     * 获取集群列表
     *
     * 获取集群信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterListRequest 请求对象
     * @return AsyncInvoker<ShowClusterListRequest, ShowClusterListResponse>
     */
    public AsyncInvoker<ShowClusterListRequest, ShowClusterListResponse> showClusterListAsyncInvoker(
        ShowClusterListRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showClusterList, hcClient);
    }

    /**
     * 获取gitops启用进展
     *
     * 获取gitops启用进展
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGitOpsStatusRequest 请求对象
     * @return CompletableFuture<ShowGitOpsStatusResponse>
     */
    public CompletableFuture<ShowGitOpsStatusResponse> showGitOpsStatusAsync(ShowGitOpsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.showGitOpsStatus);
    }

    /**
     * 获取gitops启用进展
     *
     * 获取gitops启用进展
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGitOpsStatusRequest 请求对象
     * @return AsyncInvoker<ShowGitOpsStatusRequest, ShowGitOpsStatusResponse>
     */
    public AsyncInvoker<ShowGitOpsStatusRequest, ShowGitOpsStatusResponse> showGitOpsStatusAsyncInvoker(
        ShowGitOpsStatusRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.showGitOpsStatus, hcClient);
    }

    /**
     * 更新集群
     *
     * 更新集群。当前仅允许更新附着集群和本地集群的国家/城市，允许更新多云集群的工作节点个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterRequest 请求对象
     * @return CompletableFuture<UpdateClusterResponse>
     */
    public CompletableFuture<UpdateClusterResponse> updateClusterAsync(UpdateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateCluster);
    }

    /**
     * 更新集群
     *
     * 更新集群。当前仅允许更新附着集群和本地集群的国家/城市，允许更新多云集群的工作节点个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterRequest 请求对象
     * @return AsyncInvoker<UpdateClusterRequest, UpdateClusterResponse>
     */
    public AsyncInvoker<UpdateClusterRequest, UpdateClusterResponse> updateClusterAsyncInvoker(
        UpdateClusterRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateCluster, hcClient);
    }

    /**
     * 集群关联权限策略
     *
     * 集群关联权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterRulesRequest 请求对象
     * @return CompletableFuture<UpdateClusterRulesResponse>
     */
    public CompletableFuture<UpdateClusterRulesResponse> updateClusterRulesAsync(UpdateClusterRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, UcsMeta.updateClusterRules);
    }

    /**
     * 集群关联权限策略
     *
     * 集群关联权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterRulesRequest 请求对象
     * @return AsyncInvoker<UpdateClusterRulesRequest, UpdateClusterRulesResponse>
     */
    public AsyncInvoker<UpdateClusterRulesRequest, UpdateClusterRulesResponse> updateClusterRulesAsyncInvoker(
        UpdateClusterRulesRequest request) {
        return new AsyncInvoker<>(request, UcsMeta.updateClusterRules, hcClient);
    }

}
