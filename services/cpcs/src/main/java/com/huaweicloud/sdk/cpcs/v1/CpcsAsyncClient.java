package com.huaweicloud.sdk.cpcs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cpcs.v1.model.AddClusterPortRequest;
import com.huaweicloud.sdk.cpcs.v1.model.AddClusterPortResponse;
import com.huaweicloud.sdk.cpcs.v1.model.AssociateAppsRequest;
import com.huaweicloud.sdk.cpcs.v1.model.AssociateAppsResponse;
import com.huaweicloud.sdk.cpcs.v1.model.AuthorizeAccessKeysRequest;
import com.huaweicloud.sdk.cpcs.v1.model.AuthorizeAccessKeysResponse;
import com.huaweicloud.sdk.cpcs.v1.model.BatchDisableAccessKeysRequest;
import com.huaweicloud.sdk.cpcs.v1.model.BatchDisableAccessKeysResponse;
import com.huaweicloud.sdk.cpcs.v1.model.BatchEnableAccessKeysRequest;
import com.huaweicloud.sdk.cpcs.v1.model.BatchEnableAccessKeysResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CancelAuthorizeAccessKeysRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CancelAuthorizeAccessKeysResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CheckClusterPortRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CheckClusterPortResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppAccessKeyRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppAccessKeyResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.cpcs.v1.model.CreateClusterRequest;
import com.huaweicloud.sdk.cpcs.v1.model.CreateClusterResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteAccessKeyRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteAccessKeyResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteCcspClusterRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteCcspClusterResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteClusterPortRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DeleteClusterPortResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DisableCcspInstanceRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DisableCcspInstanceResponse;
import com.huaweicloud.sdk.cpcs.v1.model.DisassociateAppsRequest;
import com.huaweicloud.sdk.cpcs.v1.model.DisassociateAppsResponse;
import com.huaweicloud.sdk.cpcs.v1.model.EnableCcspInstanceRequest;
import com.huaweicloud.sdk.cpcs.v1.model.EnableCcspInstanceResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ListCcspTenantImagesRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ListCcspTenantImagesResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ListClusterPortRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ListClusterPortResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAccessKeyRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAccessKeyResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAppAccessKeyListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAppAccessKeyListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAppListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAppListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAssociationListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAssociationListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAuditLogRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAuditLogResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAvailableAzRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowAvailableAzResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspClusterListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspClusterListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspClusterRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspClusterResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspInstanceInfoRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowCcspInstanceInfoResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowClusterAccessKeyListRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowClusterAccessKeyListResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowClusterUriRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowClusterUriResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowResourceDetailAccessKeyRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowResourceDetailAccessKeyResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowResourceDetailCertificateRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowResourceDetailCertificateResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowResourceInfoRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowResourceInfoResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatisticCertificateRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatisticCertificateResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatisticInterfaceRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatisticInterfaceResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatisticResourceRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatisticResourceResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatisticSecretKeyRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatisticSecretKeyResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatusAppRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatusAppResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatusClusterRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatusClusterResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatusInstanceRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatusInstanceResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatusServiceRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowStatusServiceResponse;
import com.huaweicloud.sdk.cpcs.v1.model.ShowVmMonitorRequest;
import com.huaweicloud.sdk.cpcs.v1.model.ShowVmMonitorResponse;
import com.huaweicloud.sdk.cpcs.v1.model.SwitchCpcsTokenRequest;
import com.huaweicloud.sdk.cpcs.v1.model.SwitchCpcsTokenResponse;

import java.util.concurrent.CompletableFuture;

public class CpcsAsyncClient {

    protected HcClient hcClient;

    public CpcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CpcsAsyncClient> newBuilder() {
        ClientBuilder<CpcsAsyncClient> clientBuilder = new ClientBuilder<>(CpcsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建集群模式端口
     *
     * 创建集群模式端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddClusterPortRequest 请求对象
     * @return CompletableFuture<AddClusterPortResponse>
     */
    public CompletableFuture<AddClusterPortResponse> addClusterPortAsync(AddClusterPortRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.addClusterPort);
    }

    /**
     * 创建集群模式端口
     *
     * 创建集群模式端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddClusterPortRequest 请求对象
     * @return AsyncInvoker<AddClusterPortRequest, AddClusterPortResponse>
     */
    public AsyncInvoker<AddClusterPortRequest, AddClusterPortResponse> addClusterPortAsyncInvoker(
        AddClusterPortRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.addClusterPort, hcClient);
    }

    /**
     * 创建密码服务集群与应用绑定关系
     *
     * 创建密码服务集群与应用绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsRequest 请求对象
     * @return CompletableFuture<AssociateAppsResponse>
     */
    public CompletableFuture<AssociateAppsResponse> associateAppsAsync(AssociateAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.associateApps);
    }

    /**
     * 创建密码服务集群与应用绑定关系
     *
     * 创建密码服务集群与应用绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsRequest 请求对象
     * @return AsyncInvoker<AssociateAppsRequest, AssociateAppsResponse>
     */
    public AsyncInvoker<AssociateAppsRequest, AssociateAppsResponse> associateAppsAsyncInvoker(
        AssociateAppsRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.associateApps, hcClient);
    }

    /**
     * 密码服务集群授予应用访问密钥的访问权限
     *
     * 密码服务集群授予应用访问密钥的访问权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeAccessKeysRequest 请求对象
     * @return CompletableFuture<AuthorizeAccessKeysResponse>
     */
    public CompletableFuture<AuthorizeAccessKeysResponse> authorizeAccessKeysAsync(AuthorizeAccessKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.authorizeAccessKeys);
    }

    /**
     * 密码服务集群授予应用访问密钥的访问权限
     *
     * 密码服务集群授予应用访问密钥的访问权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeAccessKeysRequest 请求对象
     * @return AsyncInvoker<AuthorizeAccessKeysRequest, AuthorizeAccessKeysResponse>
     */
    public AsyncInvoker<AuthorizeAccessKeysRequest, AuthorizeAccessKeysResponse> authorizeAccessKeysAsyncInvoker(
        AuthorizeAccessKeysRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.authorizeAccessKeys, hcClient);
    }

    /**
     * 停用应用的访问密钥
     *
     * 停用应用的访问密钥
     * &gt; 只有当访问密钥处于“启用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAccessKeysRequest 请求对象
     * @return CompletableFuture<BatchDisableAccessKeysResponse>
     */
    public CompletableFuture<BatchDisableAccessKeysResponse> batchDisableAccessKeysAsync(
        BatchDisableAccessKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.batchDisableAccessKeys);
    }

    /**
     * 停用应用的访问密钥
     *
     * 停用应用的访问密钥
     * &gt; 只有当访问密钥处于“启用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAccessKeysRequest 请求对象
     * @return AsyncInvoker<BatchDisableAccessKeysRequest, BatchDisableAccessKeysResponse>
     */
    public AsyncInvoker<BatchDisableAccessKeysRequest, BatchDisableAccessKeysResponse> batchDisableAccessKeysAsyncInvoker(
        BatchDisableAccessKeysRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.batchDisableAccessKeys, hcClient);
    }

    /**
     * 启用应用的访问密钥
     *
     * 启用应用的访问密钥
     * &gt; 只有当访问密钥处于“停用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAccessKeysRequest 请求对象
     * @return CompletableFuture<BatchEnableAccessKeysResponse>
     */
    public CompletableFuture<BatchEnableAccessKeysResponse> batchEnableAccessKeysAsync(
        BatchEnableAccessKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.batchEnableAccessKeys);
    }

    /**
     * 启用应用的访问密钥
     *
     * 启用应用的访问密钥
     * &gt; 只有当访问密钥处于“停用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAccessKeysRequest 请求对象
     * @return AsyncInvoker<BatchEnableAccessKeysRequest, BatchEnableAccessKeysResponse>
     */
    public AsyncInvoker<BatchEnableAccessKeysRequest, BatchEnableAccessKeysResponse> batchEnableAccessKeysAsyncInvoker(
        BatchEnableAccessKeysRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.batchEnableAccessKeys, hcClient);
    }

    /**
     * 密码服务集群解除对访问密钥的授权
     *
     * 密码服务集群解除对访问密钥的授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuthorizeAccessKeysRequest 请求对象
     * @return CompletableFuture<CancelAuthorizeAccessKeysResponse>
     */
    public CompletableFuture<CancelAuthorizeAccessKeysResponse> cancelAuthorizeAccessKeysAsync(
        CancelAuthorizeAccessKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.cancelAuthorizeAccessKeys);
    }

    /**
     * 密码服务集群解除对访问密钥的授权
     *
     * 密码服务集群解除对访问密钥的授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuthorizeAccessKeysRequest 请求对象
     * @return AsyncInvoker<CancelAuthorizeAccessKeysRequest, CancelAuthorizeAccessKeysResponse>
     */
    public AsyncInvoker<CancelAuthorizeAccessKeysRequest, CancelAuthorizeAccessKeysResponse> cancelAuthorizeAccessKeysAsyncInvoker(
        CancelAuthorizeAccessKeysRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.cancelAuthorizeAccessKeys, hcClient);
    }

    /**
     * 检测集群模式端口是否正常
     *
     * 检测该端口关联的监听器、后端服务器组是否正确无误。
     * &gt; 该接口调用后会根据实际情况，更新检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClusterPortRequest 请求对象
     * @return CompletableFuture<CheckClusterPortResponse>
     */
    public CompletableFuture<CheckClusterPortResponse> checkClusterPortAsync(CheckClusterPortRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.checkClusterPort);
    }

    /**
     * 检测集群模式端口是否正常
     *
     * 检测该端口关联的监听器、后端服务器组是否正确无误。
     * &gt; 该接口调用后会根据实际情况，更新检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClusterPortRequest 请求对象
     * @return AsyncInvoker<CheckClusterPortRequest, CheckClusterPortResponse>
     */
    public AsyncInvoker<CheckClusterPortRequest, CheckClusterPortResponse> checkClusterPortAsyncInvoker(
        CheckClusterPortRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.checkClusterPort, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.createApp, hcClient);
    }

    /**
     * 创建访问密钥
     *
     * 创建访问密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppAccessKeyRequest 请求对象
     * @return CompletableFuture<CreateAppAccessKeyResponse>
     */
    public CompletableFuture<CreateAppAccessKeyResponse> createAppAccessKeyAsync(CreateAppAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.createAppAccessKey);
    }

    /**
     * 创建访问密钥
     *
     * 创建访问密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppAccessKeyRequest 请求对象
     * @return AsyncInvoker<CreateAppAccessKeyRequest, CreateAppAccessKeyResponse>
     */
    public AsyncInvoker<CreateAppAccessKeyRequest, CreateAppAccessKeyResponse> createAppAccessKeyAsyncInvoker(
        CreateAppAccessKeyRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.createAppAccessKey, hcClient);
    }

    /**
     * 创建密码服务集群
     *
     * 创建密码服务集群
     * &gt; 调用接口之后返回订单ID，需要到“待支付订单里面”支付成功之后才能创建密码服务集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.createCluster);
    }

    /**
     * 创建密码服务集群
     *
     * 创建密码服务集群
     * &gt; 调用接口之后返回订单ID，需要到“待支付订单里面”支付成功之后才能创建密码服务集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.createCluster, hcClient);
    }

    /**
     * 删除应用的访问密钥
     *
     * 删除应用的访问密钥
     * &gt; 只有当访问密钥处于“停用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessKeyRequest 请求对象
     * @return CompletableFuture<DeleteAccessKeyResponse>
     */
    public CompletableFuture<DeleteAccessKeyResponse> deleteAccessKeyAsync(DeleteAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.deleteAccessKey);
    }

    /**
     * 删除应用的访问密钥
     *
     * 删除应用的访问密钥
     * &gt; 只有当访问密钥处于“停用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessKeyRequest 请求对象
     * @return AsyncInvoker<DeleteAccessKeyRequest, DeleteAccessKeyResponse>
     */
    public AsyncInvoker<DeleteAccessKeyRequest, DeleteAccessKeyResponse> deleteAccessKeyAsyncInvoker(
        DeleteAccessKeyRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.deleteAccessKey, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * &gt; 只有当应用与任何其它服务没有绑定关系的情况下，方可进行集群删除操作该操作不可恢复，请谨慎执行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * &gt; 只有当应用与任何其它服务没有绑定关系的情况下，方可进行集群删除操作该操作不可恢复，请谨慎执行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.deleteApp, hcClient);
    }

    /**
     * 删除密码服务集群
     *
     * 删除密码服务集群，即释放密码服务集群所有服务实例以及对应的VSM集群实例，并删除集群相关信息
     * &gt; 只有当集群与任何应用都没有绑定关系的情况下，且处于“运行中”状态，且退订了集群中所有实例，方可进行集群删除操作，该操作不可恢复，请谨慎执行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCcspClusterRequest 请求对象
     * @return CompletableFuture<DeleteCcspClusterResponse>
     */
    public CompletableFuture<DeleteCcspClusterResponse> deleteCcspClusterAsync(DeleteCcspClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.deleteCcspCluster);
    }

    /**
     * 删除密码服务集群
     *
     * 删除密码服务集群，即释放密码服务集群所有服务实例以及对应的VSM集群实例，并删除集群相关信息
     * &gt; 只有当集群与任何应用都没有绑定关系的情况下，且处于“运行中”状态，且退订了集群中所有实例，方可进行集群删除操作，该操作不可恢复，请谨慎执行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCcspClusterRequest 请求对象
     * @return AsyncInvoker<DeleteCcspClusterRequest, DeleteCcspClusterResponse>
     */
    public AsyncInvoker<DeleteCcspClusterRequest, DeleteCcspClusterResponse> deleteCcspClusterAsyncInvoker(
        DeleteCcspClusterRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.deleteCcspCluster, hcClient);
    }

    /**
     * 删除集群模式端口
     *
     * 删除集群模式端口。
     * &gt; 由于端口可能被租户二次修改过，并用于其他业务,所以删除会有几个不同选项，具体查看参数说明。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterPortRequest 请求对象
     * @return CompletableFuture<DeleteClusterPortResponse>
     */
    public CompletableFuture<DeleteClusterPortResponse> deleteClusterPortAsync(DeleteClusterPortRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.deleteClusterPort);
    }

    /**
     * 删除集群模式端口
     *
     * 删除集群模式端口。
     * &gt; 由于端口可能被租户二次修改过，并用于其他业务,所以删除会有几个不同选项，具体查看参数说明。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterPortRequest 请求对象
     * @return AsyncInvoker<DeleteClusterPortRequest, DeleteClusterPortResponse>
     */
    public AsyncInvoker<DeleteClusterPortRequest, DeleteClusterPortResponse> deleteClusterPortAsyncInvoker(
        DeleteClusterPortRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.deleteClusterPort, hcClient);
    }

    /**
     * 停用密码服务实例的业务功能
     *
     * 停用密码服务实例的业务功能
     * &gt; 只有当密码服务实例处于“启用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableCcspInstanceRequest 请求对象
     * @return CompletableFuture<DisableCcspInstanceResponse>
     */
    public CompletableFuture<DisableCcspInstanceResponse> disableCcspInstanceAsync(DisableCcspInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.disableCcspInstance);
    }

    /**
     * 停用密码服务实例的业务功能
     *
     * 停用密码服务实例的业务功能
     * &gt; 只有当密码服务实例处于“启用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableCcspInstanceRequest 请求对象
     * @return AsyncInvoker<DisableCcspInstanceRequest, DisableCcspInstanceResponse>
     */
    public AsyncInvoker<DisableCcspInstanceRequest, DisableCcspInstanceResponse> disableCcspInstanceAsyncInvoker(
        DisableCcspInstanceRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.disableCcspInstance, hcClient);
    }

    /**
     * 解除密码服务集群与应用绑定关系
     *
     * 解除密码服务集群与应用绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppsRequest 请求对象
     * @return CompletableFuture<DisassociateAppsResponse>
     */
    public CompletableFuture<DisassociateAppsResponse> disassociateAppsAsync(DisassociateAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.disassociateApps);
    }

    /**
     * 解除密码服务集群与应用绑定关系
     *
     * 解除密码服务集群与应用绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppsRequest 请求对象
     * @return AsyncInvoker<DisassociateAppsRequest, DisassociateAppsResponse>
     */
    public AsyncInvoker<DisassociateAppsRequest, DisassociateAppsResponse> disassociateAppsAsyncInvoker(
        DisassociateAppsRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.disassociateApps, hcClient);
    }

    /**
     * 启用密码服务实例的业务功能
     *
     * 启用密码服务实例的业务功能
     * &gt; 只有当密码服务实例处于“停用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableCcspInstanceRequest 请求对象
     * @return CompletableFuture<EnableCcspInstanceResponse>
     */
    public CompletableFuture<EnableCcspInstanceResponse> enableCcspInstanceAsync(EnableCcspInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.enableCcspInstance);
    }

    /**
     * 启用密码服务实例的业务功能
     *
     * 启用密码服务实例的业务功能
     * &gt; 只有当密码服务实例处于“停用”状态时，方可调用此接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableCcspInstanceRequest 请求对象
     * @return AsyncInvoker<EnableCcspInstanceRequest, EnableCcspInstanceResponse>
     */
    public AsyncInvoker<EnableCcspInstanceRequest, EnableCcspInstanceResponse> enableCcspInstanceAsyncInvoker(
        EnableCcspInstanceRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.enableCcspInstance, hcClient);
    }

    /**
     * 查询密码服务的镜像
     *
     * 查询密码服务的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcspTenantImagesRequest 请求对象
     * @return CompletableFuture<ListCcspTenantImagesResponse>
     */
    public CompletableFuture<ListCcspTenantImagesResponse> listCcspTenantImagesAsync(
        ListCcspTenantImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.listCcspTenantImages);
    }

    /**
     * 查询密码服务的镜像
     *
     * 查询密码服务的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcspTenantImagesRequest 请求对象
     * @return AsyncInvoker<ListCcspTenantImagesRequest, ListCcspTenantImagesResponse>
     */
    public AsyncInvoker<ListCcspTenantImagesRequest, ListCcspTenantImagesResponse> listCcspTenantImagesAsyncInvoker(
        ListCcspTenantImagesRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.listCcspTenantImages, hcClient);
    }

    /**
     * 查询集群模式端口列表
     *
     * 列出当前集群下的所有集群模式端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterPortRequest 请求对象
     * @return CompletableFuture<ListClusterPortResponse>
     */
    public CompletableFuture<ListClusterPortResponse> listClusterPortAsync(ListClusterPortRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.listClusterPort);
    }

    /**
     * 查询集群模式端口列表
     *
     * 列出当前集群下的所有集群模式端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterPortRequest 请求对象
     * @return AsyncInvoker<ListClusterPortRequest, ListClusterPortResponse>
     */
    public AsyncInvoker<ListClusterPortRequest, ListClusterPortResponse> listClusterPortAsyncInvoker(
        ListClusterPortRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.listClusterPort, hcClient);
    }

    /**
     * 下载访问密钥
     *
     * 下载访问密钥且只能下载一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessKeyRequest 请求对象
     * @return CompletableFuture<ShowAccessKeyResponse>
     */
    public CompletableFuture<ShowAccessKeyResponse> showAccessKeyAsync(ShowAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showAccessKey);
    }

    /**
     * 下载访问密钥
     *
     * 下载访问密钥且只能下载一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessKeyRequest 请求对象
     * @return AsyncInvoker<ShowAccessKeyRequest, ShowAccessKeyResponse>
     */
    public AsyncInvoker<ShowAccessKeyRequest, ShowAccessKeyResponse> showAccessKeyAsyncInvoker(
        ShowAccessKeyRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showAccessKey, hcClient);
    }

    /**
     * 查询应用的访问密钥列表
     *
     * 查询应用的访问密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppAccessKeyListRequest 请求对象
     * @return CompletableFuture<ShowAppAccessKeyListResponse>
     */
    public CompletableFuture<ShowAppAccessKeyListResponse> showAppAccessKeyListAsync(
        ShowAppAccessKeyListRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showAppAccessKeyList);
    }

    /**
     * 查询应用的访问密钥列表
     *
     * 查询应用的访问密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppAccessKeyListRequest 请求对象
     * @return AsyncInvoker<ShowAppAccessKeyListRequest, ShowAppAccessKeyListResponse>
     */
    public AsyncInvoker<ShowAppAccessKeyListRequest, ShowAppAccessKeyListResponse> showAppAccessKeyListAsyncInvoker(
        ShowAppAccessKeyListRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showAppAccessKeyList, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppListRequest 请求对象
     * @return CompletableFuture<ShowAppListResponse>
     */
    public CompletableFuture<ShowAppListResponse> showAppListAsync(ShowAppListRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showAppList);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppListRequest 请求对象
     * @return AsyncInvoker<ShowAppListRequest, ShowAppListResponse>
     */
    public AsyncInvoker<ShowAppListRequest, ShowAppListResponse> showAppListAsyncInvoker(ShowAppListRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showAppList, hcClient);
    }

    /**
     * 查询密码服务集群与应用的绑定关系列表
     *
     * 查询密码服务集群与应用的绑定关系列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociationListRequest 请求对象
     * @return CompletableFuture<ShowAssociationListResponse>
     */
    public CompletableFuture<ShowAssociationListResponse> showAssociationListAsync(ShowAssociationListRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showAssociationList);
    }

    /**
     * 查询密码服务集群与应用的绑定关系列表
     *
     * 查询密码服务集群与应用的绑定关系列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociationListRequest 请求对象
     * @return AsyncInvoker<ShowAssociationListRequest, ShowAssociationListResponse>
     */
    public AsyncInvoker<ShowAssociationListRequest, ShowAssociationListResponse> showAssociationListAsyncInvoker(
        ShowAssociationListRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showAssociationList, hcClient);
    }

    /**
     * 查询平台审计日志
     *
     * 查询平台审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return CompletableFuture<ShowAuditLogResponse>
     */
    public CompletableFuture<ShowAuditLogResponse> showAuditLogAsync(ShowAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showAuditLog);
    }

    /**
     * 查询平台审计日志
     *
     * 查询平台审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogAsyncInvoker(
        ShowAuditLogRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showAuditLog, hcClient);
    }

    /**
     * 查询可创建密码服务集群的可用区列表
     *
     * 查询可创建密码服务集群的可用区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableAzRequest 请求对象
     * @return CompletableFuture<ShowAvailableAzResponse>
     */
    public CompletableFuture<ShowAvailableAzResponse> showAvailableAzAsync(ShowAvailableAzRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showAvailableAz);
    }

    /**
     * 查询可创建密码服务集群的可用区列表
     *
     * 查询可创建密码服务集群的可用区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableAzRequest 请求对象
     * @return AsyncInvoker<ShowAvailableAzRequest, ShowAvailableAzResponse>
     */
    public AsyncInvoker<ShowAvailableAzRequest, ShowAvailableAzResponse> showAvailableAzAsyncInvoker(
        ShowAvailableAzRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showAvailableAz, hcClient);
    }

    /**
     * 查询密码服务集群详情
     *
     * 查询密码服务集群信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspClusterRequest 请求对象
     * @return CompletableFuture<ShowCcspClusterResponse>
     */
    public CompletableFuture<ShowCcspClusterResponse> showCcspClusterAsync(ShowCcspClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showCcspCluster);
    }

    /**
     * 查询密码服务集群详情
     *
     * 查询密码服务集群信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspClusterRequest 请求对象
     * @return AsyncInvoker<ShowCcspClusterRequest, ShowCcspClusterResponse>
     */
    public AsyncInvoker<ShowCcspClusterRequest, ShowCcspClusterResponse> showCcspClusterAsyncInvoker(
        ShowCcspClusterRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showCcspCluster, hcClient);
    }

    /**
     * 查询密码服务集群列表
     *
     * 查询密码服务集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspClusterListRequest 请求对象
     * @return CompletableFuture<ShowCcspClusterListResponse>
     */
    public CompletableFuture<ShowCcspClusterListResponse> showCcspClusterListAsync(ShowCcspClusterListRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showCcspClusterList);
    }

    /**
     * 查询密码服务集群列表
     *
     * 查询密码服务集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspClusterListRequest 请求对象
     * @return AsyncInvoker<ShowCcspClusterListRequest, ShowCcspClusterListResponse>
     */
    public AsyncInvoker<ShowCcspClusterListRequest, ShowCcspClusterListResponse> showCcspClusterListAsyncInvoker(
        ShowCcspClusterListRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showCcspClusterList, hcClient);
    }

    /**
     * 查询密码服务实例列表
     *
     * 查询密码服务实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspInstanceInfoRequest 请求对象
     * @return CompletableFuture<ShowCcspInstanceInfoResponse>
     */
    public CompletableFuture<ShowCcspInstanceInfoResponse> showCcspInstanceInfoAsync(
        ShowCcspInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showCcspInstanceInfo);
    }

    /**
     * 查询密码服务实例列表
     *
     * 查询密码服务实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ShowCcspInstanceInfoRequest, ShowCcspInstanceInfoResponse>
     */
    public AsyncInvoker<ShowCcspInstanceInfoRequest, ShowCcspInstanceInfoResponse> showCcspInstanceInfoAsyncInvoker(
        ShowCcspInstanceInfoRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showCcspInstanceInfo, hcClient);
    }

    /**
     * 查询密码服务集群已授权的访问密钥列表
     *
     * 查询密码服务集群已授权的访问密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAccessKeyListRequest 请求对象
     * @return CompletableFuture<ShowClusterAccessKeyListResponse>
     */
    public CompletableFuture<ShowClusterAccessKeyListResponse> showClusterAccessKeyListAsync(
        ShowClusterAccessKeyListRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showClusterAccessKeyList);
    }

    /**
     * 查询密码服务集群已授权的访问密钥列表
     *
     * 查询密码服务集群已授权的访问密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAccessKeyListRequest 请求对象
     * @return AsyncInvoker<ShowClusterAccessKeyListRequest, ShowClusterAccessKeyListResponse>
     */
    public AsyncInvoker<ShowClusterAccessKeyListRequest, ShowClusterAccessKeyListResponse> showClusterAccessKeyListAsyncInvoker(
        ShowClusterAccessKeyListRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showClusterAccessKeyList, hcClient);
    }

    /**
     * 获取密码服务管理界面URL
     *
     * 获取密码服务管理界面URL
     * &gt; URL存在有效期，URL失效后无法跳转管理界面，需要重新获取URL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterUriRequest 请求对象
     * @return CompletableFuture<ShowClusterUriResponse>
     */
    public CompletableFuture<ShowClusterUriResponse> showClusterUriAsync(ShowClusterUriRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showClusterUri);
    }

    /**
     * 获取密码服务管理界面URL
     *
     * 获取密码服务管理界面URL
     * &gt; URL存在有效期，URL失效后无法跳转管理界面，需要重新获取URL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterUriRequest 请求对象
     * @return AsyncInvoker<ShowClusterUriRequest, ShowClusterUriResponse>
     */
    public AsyncInvoker<ShowClusterUriRequest, ShowClusterUriResponse> showClusterUriAsyncInvoker(
        ShowClusterUriRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showClusterUri, hcClient);
    }

    /**
     * 获取AK详情
     *
     * 获取所监控或者统计的AK详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailAccessKeyRequest 请求对象
     * @return CompletableFuture<ShowResourceDetailAccessKeyResponse>
     */
    public CompletableFuture<ShowResourceDetailAccessKeyResponse> showResourceDetailAccessKeyAsync(
        ShowResourceDetailAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showResourceDetailAccessKey);
    }

    /**
     * 获取AK详情
     *
     * 获取所监控或者统计的AK详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailAccessKeyRequest 请求对象
     * @return AsyncInvoker<ShowResourceDetailAccessKeyRequest, ShowResourceDetailAccessKeyResponse>
     */
    public AsyncInvoker<ShowResourceDetailAccessKeyRequest, ShowResourceDetailAccessKeyResponse> showResourceDetailAccessKeyAsyncInvoker(
        ShowResourceDetailAccessKeyRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showResourceDetailAccessKey, hcClient);
    }

    /**
     * 获取证书详情
     *
     * 获取所监控或者统计的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailCertificateRequest 请求对象
     * @return CompletableFuture<ShowResourceDetailCertificateResponse>
     */
    public CompletableFuture<ShowResourceDetailCertificateResponse> showResourceDetailCertificateAsync(
        ShowResourceDetailCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showResourceDetailCertificate);
    }

    /**
     * 获取证书详情
     *
     * 获取所监控或者统计的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailCertificateRequest 请求对象
     * @return AsyncInvoker<ShowResourceDetailCertificateRequest, ShowResourceDetailCertificateResponse>
     */
    public AsyncInvoker<ShowResourceDetailCertificateRequest, ShowResourceDetailCertificateResponse> showResourceDetailCertificateAsyncInvoker(
        ShowResourceDetailCertificateRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showResourceDetailCertificate, hcClient);
    }

    /**
     * 查询租户的资源分布信息
     *
     * 查询租户的资源分布信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceInfoRequest 请求对象
     * @return CompletableFuture<ShowResourceInfoResponse>
     */
    public CompletableFuture<ShowResourceInfoResponse> showResourceInfoAsync(ShowResourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showResourceInfo);
    }

    /**
     * 查询租户的资源分布信息
     *
     * 查询租户的资源分布信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceInfoRequest 请求对象
     * @return AsyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse>
     */
    public AsyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse> showResourceInfoAsyncInvoker(
        ShowResourceInfoRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showResourceInfo, hcClient);
    }

    /**
     * 获取证书分布统计信息
     *
     * 获取CPCS中证书分布统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCertificateRequest 请求对象
     * @return CompletableFuture<ShowStatisticCertificateResponse>
     */
    public CompletableFuture<ShowStatisticCertificateResponse> showStatisticCertificateAsync(
        ShowStatisticCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showStatisticCertificate);
    }

    /**
     * 获取证书分布统计信息
     *
     * 获取CPCS中证书分布统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCertificateRequest 请求对象
     * @return AsyncInvoker<ShowStatisticCertificateRequest, ShowStatisticCertificateResponse>
     */
    public AsyncInvoker<ShowStatisticCertificateRequest, ShowStatisticCertificateResponse> showStatisticCertificateAsyncInvoker(
        ShowStatisticCertificateRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showStatisticCertificate, hcClient);
    }

    /**
     * 获取接口调用统计信息
     *
     * 获取CPCS中接口调用统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticInterfaceRequest 请求对象
     * @return CompletableFuture<ShowStatisticInterfaceResponse>
     */
    public CompletableFuture<ShowStatisticInterfaceResponse> showStatisticInterfaceAsync(
        ShowStatisticInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showStatisticInterface);
    }

    /**
     * 获取接口调用统计信息
     *
     * 获取CPCS中接口调用统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticInterfaceRequest 请求对象
     * @return AsyncInvoker<ShowStatisticInterfaceRequest, ShowStatisticInterfaceResponse>
     */
    public AsyncInvoker<ShowStatisticInterfaceRequest, ShowStatisticInterfaceResponse> showStatisticInterfaceAsyncInvoker(
        ShowStatisticInterfaceRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showStatisticInterface, hcClient);
    }

    /**
     * 获取资源总量统计信息
     *
     * 获取CPCS中\\资源总量统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticResourceRequest 请求对象
     * @return CompletableFuture<ShowStatisticResourceResponse>
     */
    public CompletableFuture<ShowStatisticResourceResponse> showStatisticResourceAsync(
        ShowStatisticResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showStatisticResource);
    }

    /**
     * 获取资源总量统计信息
     *
     * 获取CPCS中\\资源总量统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticResourceRequest 请求对象
     * @return AsyncInvoker<ShowStatisticResourceRequest, ShowStatisticResourceResponse>
     */
    public AsyncInvoker<ShowStatisticResourceRequest, ShowStatisticResourceResponse> showStatisticResourceAsyncInvoker(
        ShowStatisticResourceRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showStatisticResource, hcClient);
    }

    /**
     * 获取密钥分布统计信息
     *
     * 获取CPCS中密钥分布统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticSecretKeyRequest 请求对象
     * @return CompletableFuture<ShowStatisticSecretKeyResponse>
     */
    public CompletableFuture<ShowStatisticSecretKeyResponse> showStatisticSecretKeyAsync(
        ShowStatisticSecretKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showStatisticSecretKey);
    }

    /**
     * 获取密钥分布统计信息
     *
     * 获取CPCS中密钥分布统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticSecretKeyRequest 请求对象
     * @return AsyncInvoker<ShowStatisticSecretKeyRequest, ShowStatisticSecretKeyResponse>
     */
    public AsyncInvoker<ShowStatisticSecretKeyRequest, ShowStatisticSecretKeyResponse> showStatisticSecretKeyAsyncInvoker(
        ShowStatisticSecretKeyRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showStatisticSecretKey, hcClient);
    }

    /**
     * 获取应用状态监控
     *
     * CPCS服务创建的应用状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusAppRequest 请求对象
     * @return CompletableFuture<ShowStatusAppResponse>
     */
    public CompletableFuture<ShowStatusAppResponse> showStatusAppAsync(ShowStatusAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showStatusApp);
    }

    /**
     * 获取应用状态监控
     *
     * CPCS服务创建的应用状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusAppRequest 请求对象
     * @return AsyncInvoker<ShowStatusAppRequest, ShowStatusAppResponse>
     */
    public AsyncInvoker<ShowStatusAppRequest, ShowStatusAppResponse> showStatusAppAsyncInvoker(
        ShowStatusAppRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showStatusApp, hcClient);
    }

    /**
     * 获取集群监控信息
     *
     * CPCS服务创建的集群的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusClusterRequest 请求对象
     * @return CompletableFuture<ShowStatusClusterResponse>
     */
    public CompletableFuture<ShowStatusClusterResponse> showStatusClusterAsync(ShowStatusClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showStatusCluster);
    }

    /**
     * 获取集群监控信息
     *
     * CPCS服务创建的集群的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusClusterRequest 请求对象
     * @return AsyncInvoker<ShowStatusClusterRequest, ShowStatusClusterResponse>
     */
    public AsyncInvoker<ShowStatusClusterRequest, ShowStatusClusterResponse> showStatusClusterAsyncInvoker(
        ShowStatusClusterRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showStatusCluster, hcClient);
    }

    /**
     * 获取实例监控信息
     *
     * CPCS服务创建的密码服务实例的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusInstanceRequest 请求对象
     * @return CompletableFuture<ShowStatusInstanceResponse>
     */
    public CompletableFuture<ShowStatusInstanceResponse> showStatusInstanceAsync(ShowStatusInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showStatusInstance);
    }

    /**
     * 获取实例监控信息
     *
     * CPCS服务创建的密码服务实例的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusInstanceRequest 请求对象
     * @return AsyncInvoker<ShowStatusInstanceRequest, ShowStatusInstanceResponse>
     */
    public AsyncInvoker<ShowStatusInstanceRequest, ShowStatusInstanceResponse> showStatusInstanceAsyncInvoker(
        ShowStatusInstanceRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showStatusInstance, hcClient);
    }

    /**
     * 获取服务监控信息
     *
     * CPCS服务的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusServiceRequest 请求对象
     * @return CompletableFuture<ShowStatusServiceResponse>
     */
    public CompletableFuture<ShowStatusServiceResponse> showStatusServiceAsync(ShowStatusServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showStatusService);
    }

    /**
     * 获取服务监控信息
     *
     * CPCS服务的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusServiceRequest 请求对象
     * @return AsyncInvoker<ShowStatusServiceRequest, ShowStatusServiceResponse>
     */
    public AsyncInvoker<ShowStatusServiceRequest, ShowStatusServiceResponse> showStatusServiceAsyncInvoker(
        ShowStatusServiceRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showStatusService, hcClient);
    }

    /**
     * 密码资源指标监控
     *
     * 获取密码服务实例与虚拟密码机实例的指标（cpu使用率，内存使用率等指标）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVmMonitorRequest 请求对象
     * @return CompletableFuture<ShowVmMonitorResponse>
     */
    public CompletableFuture<ShowVmMonitorResponse> showVmMonitorAsync(ShowVmMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.showVmMonitor);
    }

    /**
     * 密码资源指标监控
     *
     * 获取密码服务实例与虚拟密码机实例的指标（cpu使用率，内存使用率等指标）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVmMonitorRequest 请求对象
     * @return AsyncInvoker<ShowVmMonitorRequest, ShowVmMonitorResponse>
     */
    public AsyncInvoker<ShowVmMonitorRequest, ShowVmMonitorResponse> showVmMonitorAsyncInvoker(
        ShowVmMonitorRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.showVmMonitor, hcClient);
    }

    /**
     * AK/SK 换取Cpcs token
     *
     * 使用aksk换取cpcs token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchCpcsTokenRequest 请求对象
     * @return CompletableFuture<SwitchCpcsTokenResponse>
     */
    public CompletableFuture<SwitchCpcsTokenResponse> switchCpcsTokenAsync(SwitchCpcsTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, CpcsMeta.switchCpcsToken);
    }

    /**
     * AK/SK 换取Cpcs token
     *
     * 使用aksk换取cpcs token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchCpcsTokenRequest 请求对象
     * @return AsyncInvoker<SwitchCpcsTokenRequest, SwitchCpcsTokenResponse>
     */
    public AsyncInvoker<SwitchCpcsTokenRequest, SwitchCpcsTokenResponse> switchCpcsTokenAsyncInvoker(
        SwitchCpcsTokenRequest request) {
        return new AsyncInvoker<>(request, CpcsMeta.switchCpcsToken, hcClient);
    }

}
