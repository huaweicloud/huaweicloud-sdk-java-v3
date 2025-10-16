package com.huaweicloud.sdk.cpcs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class CpcsClient {

    protected HcClient hcClient;

    public CpcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CpcsClient> newBuilder() {
        ClientBuilder<CpcsClient> clientBuilder = new ClientBuilder<>(CpcsClient::new);
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
     * @return AddClusterPortResponse
     */
    public AddClusterPortResponse addClusterPort(AddClusterPortRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.addClusterPort);
    }

    /**
     * 创建集群模式端口
     *
     * 创建集群模式端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddClusterPortRequest 请求对象
     * @return SyncInvoker<AddClusterPortRequest, AddClusterPortResponse>
     */
    public SyncInvoker<AddClusterPortRequest, AddClusterPortResponse> addClusterPortInvoker(
        AddClusterPortRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.addClusterPort, hcClient);
    }

    /**
     * 创建密码服务集群与应用绑定关系
     *
     * 创建密码服务集群与应用绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsRequest 请求对象
     * @return AssociateAppsResponse
     */
    public AssociateAppsResponse associateApps(AssociateAppsRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.associateApps);
    }

    /**
     * 创建密码服务集群与应用绑定关系
     *
     * 创建密码服务集群与应用绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsRequest 请求对象
     * @return SyncInvoker<AssociateAppsRequest, AssociateAppsResponse>
     */
    public SyncInvoker<AssociateAppsRequest, AssociateAppsResponse> associateAppsInvoker(AssociateAppsRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.associateApps, hcClient);
    }

    /**
     * 密码服务集群授予应用访问密钥的访问权限
     *
     * 密码服务集群授予应用访问密钥的访问权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeAccessKeysRequest 请求对象
     * @return AuthorizeAccessKeysResponse
     */
    public AuthorizeAccessKeysResponse authorizeAccessKeys(AuthorizeAccessKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.authorizeAccessKeys);
    }

    /**
     * 密码服务集群授予应用访问密钥的访问权限
     *
     * 密码服务集群授予应用访问密钥的访问权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeAccessKeysRequest 请求对象
     * @return SyncInvoker<AuthorizeAccessKeysRequest, AuthorizeAccessKeysResponse>
     */
    public SyncInvoker<AuthorizeAccessKeysRequest, AuthorizeAccessKeysResponse> authorizeAccessKeysInvoker(
        AuthorizeAccessKeysRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.authorizeAccessKeys, hcClient);
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
     * @return BatchDisableAccessKeysResponse
     */
    public BatchDisableAccessKeysResponse batchDisableAccessKeys(BatchDisableAccessKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.batchDisableAccessKeys);
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
     * @return SyncInvoker<BatchDisableAccessKeysRequest, BatchDisableAccessKeysResponse>
     */
    public SyncInvoker<BatchDisableAccessKeysRequest, BatchDisableAccessKeysResponse> batchDisableAccessKeysInvoker(
        BatchDisableAccessKeysRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.batchDisableAccessKeys, hcClient);
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
     * @return BatchEnableAccessKeysResponse
     */
    public BatchEnableAccessKeysResponse batchEnableAccessKeys(BatchEnableAccessKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.batchEnableAccessKeys);
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
     * @return SyncInvoker<BatchEnableAccessKeysRequest, BatchEnableAccessKeysResponse>
     */
    public SyncInvoker<BatchEnableAccessKeysRequest, BatchEnableAccessKeysResponse> batchEnableAccessKeysInvoker(
        BatchEnableAccessKeysRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.batchEnableAccessKeys, hcClient);
    }

    /**
     * 密码服务集群解除对访问密钥的授权
     *
     * 密码服务集群解除对访问密钥的授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuthorizeAccessKeysRequest 请求对象
     * @return CancelAuthorizeAccessKeysResponse
     */
    public CancelAuthorizeAccessKeysResponse cancelAuthorizeAccessKeys(CancelAuthorizeAccessKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.cancelAuthorizeAccessKeys);
    }

    /**
     * 密码服务集群解除对访问密钥的授权
     *
     * 密码服务集群解除对访问密钥的授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAuthorizeAccessKeysRequest 请求对象
     * @return SyncInvoker<CancelAuthorizeAccessKeysRequest, CancelAuthorizeAccessKeysResponse>
     */
    public SyncInvoker<CancelAuthorizeAccessKeysRequest, CancelAuthorizeAccessKeysResponse> cancelAuthorizeAccessKeysInvoker(
        CancelAuthorizeAccessKeysRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.cancelAuthorizeAccessKeys, hcClient);
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
     * @return CheckClusterPortResponse
     */
    public CheckClusterPortResponse checkClusterPort(CheckClusterPortRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.checkClusterPort);
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
     * @return SyncInvoker<CheckClusterPortRequest, CheckClusterPortResponse>
     */
    public SyncInvoker<CheckClusterPortRequest, CheckClusterPortResponse> checkClusterPortInvoker(
        CheckClusterPortRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.checkClusterPort, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.createApp, hcClient);
    }

    /**
     * 创建访问密钥
     *
     * 创建访问密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppAccessKeyRequest 请求对象
     * @return CreateAppAccessKeyResponse
     */
    public CreateAppAccessKeyResponse createAppAccessKey(CreateAppAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.createAppAccessKey);
    }

    /**
     * 创建访问密钥
     *
     * 创建访问密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppAccessKeyRequest 请求对象
     * @return SyncInvoker<CreateAppAccessKeyRequest, CreateAppAccessKeyResponse>
     */
    public SyncInvoker<CreateAppAccessKeyRequest, CreateAppAccessKeyResponse> createAppAccessKeyInvoker(
        CreateAppAccessKeyRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.createAppAccessKey, hcClient);
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
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.createCluster);
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
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.createCluster, hcClient);
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
     * @return DeleteAccessKeyResponse
     */
    public DeleteAccessKeyResponse deleteAccessKey(DeleteAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.deleteAccessKey);
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
     * @return SyncInvoker<DeleteAccessKeyRequest, DeleteAccessKeyResponse>
     */
    public SyncInvoker<DeleteAccessKeyRequest, DeleteAccessKeyResponse> deleteAccessKeyInvoker(
        DeleteAccessKeyRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.deleteAccessKey, hcClient);
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
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.deleteApp);
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
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.deleteApp, hcClient);
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
     * @return DeleteCcspClusterResponse
     */
    public DeleteCcspClusterResponse deleteCcspCluster(DeleteCcspClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.deleteCcspCluster);
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
     * @return SyncInvoker<DeleteCcspClusterRequest, DeleteCcspClusterResponse>
     */
    public SyncInvoker<DeleteCcspClusterRequest, DeleteCcspClusterResponse> deleteCcspClusterInvoker(
        DeleteCcspClusterRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.deleteCcspCluster, hcClient);
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
     * @return DeleteClusterPortResponse
     */
    public DeleteClusterPortResponse deleteClusterPort(DeleteClusterPortRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.deleteClusterPort);
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
     * @return SyncInvoker<DeleteClusterPortRequest, DeleteClusterPortResponse>
     */
    public SyncInvoker<DeleteClusterPortRequest, DeleteClusterPortResponse> deleteClusterPortInvoker(
        DeleteClusterPortRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.deleteClusterPort, hcClient);
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
     * @return DisableCcspInstanceResponse
     */
    public DisableCcspInstanceResponse disableCcspInstance(DisableCcspInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.disableCcspInstance);
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
     * @return SyncInvoker<DisableCcspInstanceRequest, DisableCcspInstanceResponse>
     */
    public SyncInvoker<DisableCcspInstanceRequest, DisableCcspInstanceResponse> disableCcspInstanceInvoker(
        DisableCcspInstanceRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.disableCcspInstance, hcClient);
    }

    /**
     * 解除密码服务集群与应用绑定关系
     *
     * 解除密码服务集群与应用绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppsRequest 请求对象
     * @return DisassociateAppsResponse
     */
    public DisassociateAppsResponse disassociateApps(DisassociateAppsRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.disassociateApps);
    }

    /**
     * 解除密码服务集群与应用绑定关系
     *
     * 解除密码服务集群与应用绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppsRequest 请求对象
     * @return SyncInvoker<DisassociateAppsRequest, DisassociateAppsResponse>
     */
    public SyncInvoker<DisassociateAppsRequest, DisassociateAppsResponse> disassociateAppsInvoker(
        DisassociateAppsRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.disassociateApps, hcClient);
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
     * @return EnableCcspInstanceResponse
     */
    public EnableCcspInstanceResponse enableCcspInstance(EnableCcspInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.enableCcspInstance);
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
     * @return SyncInvoker<EnableCcspInstanceRequest, EnableCcspInstanceResponse>
     */
    public SyncInvoker<EnableCcspInstanceRequest, EnableCcspInstanceResponse> enableCcspInstanceInvoker(
        EnableCcspInstanceRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.enableCcspInstance, hcClient);
    }

    /**
     * 查询密码服务的镜像
     *
     * 查询密码服务的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcspTenantImagesRequest 请求对象
     * @return ListCcspTenantImagesResponse
     */
    public ListCcspTenantImagesResponse listCcspTenantImages(ListCcspTenantImagesRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.listCcspTenantImages);
    }

    /**
     * 查询密码服务的镜像
     *
     * 查询密码服务的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcspTenantImagesRequest 请求对象
     * @return SyncInvoker<ListCcspTenantImagesRequest, ListCcspTenantImagesResponse>
     */
    public SyncInvoker<ListCcspTenantImagesRequest, ListCcspTenantImagesResponse> listCcspTenantImagesInvoker(
        ListCcspTenantImagesRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.listCcspTenantImages, hcClient);
    }

    /**
     * 查询集群模式端口列表
     *
     * 列出当前集群下的所有集群模式端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterPortRequest 请求对象
     * @return ListClusterPortResponse
     */
    public ListClusterPortResponse listClusterPort(ListClusterPortRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.listClusterPort);
    }

    /**
     * 查询集群模式端口列表
     *
     * 列出当前集群下的所有集群模式端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterPortRequest 请求对象
     * @return SyncInvoker<ListClusterPortRequest, ListClusterPortResponse>
     */
    public SyncInvoker<ListClusterPortRequest, ListClusterPortResponse> listClusterPortInvoker(
        ListClusterPortRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.listClusterPort, hcClient);
    }

    /**
     * 下载访问密钥
     *
     * 下载访问密钥且只能下载一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessKeyRequest 请求对象
     * @return ShowAccessKeyResponse
     */
    public ShowAccessKeyResponse showAccessKey(ShowAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showAccessKey);
    }

    /**
     * 下载访问密钥
     *
     * 下载访问密钥且只能下载一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessKeyRequest 请求对象
     * @return SyncInvoker<ShowAccessKeyRequest, ShowAccessKeyResponse>
     */
    public SyncInvoker<ShowAccessKeyRequest, ShowAccessKeyResponse> showAccessKeyInvoker(ShowAccessKeyRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showAccessKey, hcClient);
    }

    /**
     * 查询应用的访问密钥列表
     *
     * 查询应用的访问密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppAccessKeyListRequest 请求对象
     * @return ShowAppAccessKeyListResponse
     */
    public ShowAppAccessKeyListResponse showAppAccessKeyList(ShowAppAccessKeyListRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showAppAccessKeyList);
    }

    /**
     * 查询应用的访问密钥列表
     *
     * 查询应用的访问密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppAccessKeyListRequest 请求对象
     * @return SyncInvoker<ShowAppAccessKeyListRequest, ShowAppAccessKeyListResponse>
     */
    public SyncInvoker<ShowAppAccessKeyListRequest, ShowAppAccessKeyListResponse> showAppAccessKeyListInvoker(
        ShowAppAccessKeyListRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showAppAccessKeyList, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppListRequest 请求对象
     * @return ShowAppListResponse
     */
    public ShowAppListResponse showAppList(ShowAppListRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showAppList);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppListRequest 请求对象
     * @return SyncInvoker<ShowAppListRequest, ShowAppListResponse>
     */
    public SyncInvoker<ShowAppListRequest, ShowAppListResponse> showAppListInvoker(ShowAppListRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showAppList, hcClient);
    }

    /**
     * 查询密码服务集群与应用的绑定关系列表
     *
     * 查询密码服务集群与应用的绑定关系列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociationListRequest 请求对象
     * @return ShowAssociationListResponse
     */
    public ShowAssociationListResponse showAssociationList(ShowAssociationListRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showAssociationList);
    }

    /**
     * 查询密码服务集群与应用的绑定关系列表
     *
     * 查询密码服务集群与应用的绑定关系列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociationListRequest 请求对象
     * @return SyncInvoker<ShowAssociationListRequest, ShowAssociationListResponse>
     */
    public SyncInvoker<ShowAssociationListRequest, ShowAssociationListResponse> showAssociationListInvoker(
        ShowAssociationListRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showAssociationList, hcClient);
    }

    /**
     * 查询平台审计日志
     *
     * 查询平台审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return ShowAuditLogResponse
     */
    public ShowAuditLogResponse showAuditLog(ShowAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showAuditLog);
    }

    /**
     * 查询平台审计日志
     *
     * 查询平台审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogInvoker(ShowAuditLogRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showAuditLog, hcClient);
    }

    /**
     * 查询可创建密码服务集群的可用区列表
     *
     * 查询可创建密码服务集群的可用区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableAzRequest 请求对象
     * @return ShowAvailableAzResponse
     */
    public ShowAvailableAzResponse showAvailableAz(ShowAvailableAzRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showAvailableAz);
    }

    /**
     * 查询可创建密码服务集群的可用区列表
     *
     * 查询可创建密码服务集群的可用区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableAzRequest 请求对象
     * @return SyncInvoker<ShowAvailableAzRequest, ShowAvailableAzResponse>
     */
    public SyncInvoker<ShowAvailableAzRequest, ShowAvailableAzResponse> showAvailableAzInvoker(
        ShowAvailableAzRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showAvailableAz, hcClient);
    }

    /**
     * 查询密码服务集群详情
     *
     * 查询密码服务集群信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspClusterRequest 请求对象
     * @return ShowCcspClusterResponse
     */
    public ShowCcspClusterResponse showCcspCluster(ShowCcspClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showCcspCluster);
    }

    /**
     * 查询密码服务集群详情
     *
     * 查询密码服务集群信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspClusterRequest 请求对象
     * @return SyncInvoker<ShowCcspClusterRequest, ShowCcspClusterResponse>
     */
    public SyncInvoker<ShowCcspClusterRequest, ShowCcspClusterResponse> showCcspClusterInvoker(
        ShowCcspClusterRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showCcspCluster, hcClient);
    }

    /**
     * 查询密码服务集群列表
     *
     * 查询密码服务集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspClusterListRequest 请求对象
     * @return ShowCcspClusterListResponse
     */
    public ShowCcspClusterListResponse showCcspClusterList(ShowCcspClusterListRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showCcspClusterList);
    }

    /**
     * 查询密码服务集群列表
     *
     * 查询密码服务集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspClusterListRequest 请求对象
     * @return SyncInvoker<ShowCcspClusterListRequest, ShowCcspClusterListResponse>
     */
    public SyncInvoker<ShowCcspClusterListRequest, ShowCcspClusterListResponse> showCcspClusterListInvoker(
        ShowCcspClusterListRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showCcspClusterList, hcClient);
    }

    /**
     * 查询密码服务实例列表
     *
     * 查询密码服务实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspInstanceInfoRequest 请求对象
     * @return ShowCcspInstanceInfoResponse
     */
    public ShowCcspInstanceInfoResponse showCcspInstanceInfo(ShowCcspInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showCcspInstanceInfo);
    }

    /**
     * 查询密码服务实例列表
     *
     * 查询密码服务实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcspInstanceInfoRequest 请求对象
     * @return SyncInvoker<ShowCcspInstanceInfoRequest, ShowCcspInstanceInfoResponse>
     */
    public SyncInvoker<ShowCcspInstanceInfoRequest, ShowCcspInstanceInfoResponse> showCcspInstanceInfoInvoker(
        ShowCcspInstanceInfoRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showCcspInstanceInfo, hcClient);
    }

    /**
     * 查询密码服务集群已授权的访问密钥列表
     *
     * 查询密码服务集群已授权的访问密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAccessKeyListRequest 请求对象
     * @return ShowClusterAccessKeyListResponse
     */
    public ShowClusterAccessKeyListResponse showClusterAccessKeyList(ShowClusterAccessKeyListRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showClusterAccessKeyList);
    }

    /**
     * 查询密码服务集群已授权的访问密钥列表
     *
     * 查询密码服务集群已授权的访问密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAccessKeyListRequest 请求对象
     * @return SyncInvoker<ShowClusterAccessKeyListRequest, ShowClusterAccessKeyListResponse>
     */
    public SyncInvoker<ShowClusterAccessKeyListRequest, ShowClusterAccessKeyListResponse> showClusterAccessKeyListInvoker(
        ShowClusterAccessKeyListRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showClusterAccessKeyList, hcClient);
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
     * @return ShowClusterUriResponse
     */
    public ShowClusterUriResponse showClusterUri(ShowClusterUriRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showClusterUri);
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
     * @return SyncInvoker<ShowClusterUriRequest, ShowClusterUriResponse>
     */
    public SyncInvoker<ShowClusterUriRequest, ShowClusterUriResponse> showClusterUriInvoker(
        ShowClusterUriRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showClusterUri, hcClient);
    }

    /**
     * 获取AK详情
     *
     * 获取所监控或者统计的AK详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailAccessKeyRequest 请求对象
     * @return ShowResourceDetailAccessKeyResponse
     */
    public ShowResourceDetailAccessKeyResponse showResourceDetailAccessKey(ShowResourceDetailAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showResourceDetailAccessKey);
    }

    /**
     * 获取AK详情
     *
     * 获取所监控或者统计的AK详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailAccessKeyRequest 请求对象
     * @return SyncInvoker<ShowResourceDetailAccessKeyRequest, ShowResourceDetailAccessKeyResponse>
     */
    public SyncInvoker<ShowResourceDetailAccessKeyRequest, ShowResourceDetailAccessKeyResponse> showResourceDetailAccessKeyInvoker(
        ShowResourceDetailAccessKeyRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showResourceDetailAccessKey, hcClient);
    }

    /**
     * 获取证书详情
     *
     * 获取所监控或者统计的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailCertificateRequest 请求对象
     * @return ShowResourceDetailCertificateResponse
     */
    public ShowResourceDetailCertificateResponse showResourceDetailCertificate(
        ShowResourceDetailCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showResourceDetailCertificate);
    }

    /**
     * 获取证书详情
     *
     * 获取所监控或者统计的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailCertificateRequest 请求对象
     * @return SyncInvoker<ShowResourceDetailCertificateRequest, ShowResourceDetailCertificateResponse>
     */
    public SyncInvoker<ShowResourceDetailCertificateRequest, ShowResourceDetailCertificateResponse> showResourceDetailCertificateInvoker(
        ShowResourceDetailCertificateRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showResourceDetailCertificate, hcClient);
    }

    /**
     * 查询租户的资源分布信息
     *
     * 查询租户的资源分布信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceInfoRequest 请求对象
     * @return ShowResourceInfoResponse
     */
    public ShowResourceInfoResponse showResourceInfo(ShowResourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showResourceInfo);
    }

    /**
     * 查询租户的资源分布信息
     *
     * 查询租户的资源分布信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceInfoRequest 请求对象
     * @return SyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse>
     */
    public SyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse> showResourceInfoInvoker(
        ShowResourceInfoRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showResourceInfo, hcClient);
    }

    /**
     * 获取证书分布统计信息
     *
     * 获取CPCS中证书分布统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCertificateRequest 请求对象
     * @return ShowStatisticCertificateResponse
     */
    public ShowStatisticCertificateResponse showStatisticCertificate(ShowStatisticCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showStatisticCertificate);
    }

    /**
     * 获取证书分布统计信息
     *
     * 获取CPCS中证书分布统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCertificateRequest 请求对象
     * @return SyncInvoker<ShowStatisticCertificateRequest, ShowStatisticCertificateResponse>
     */
    public SyncInvoker<ShowStatisticCertificateRequest, ShowStatisticCertificateResponse> showStatisticCertificateInvoker(
        ShowStatisticCertificateRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showStatisticCertificate, hcClient);
    }

    /**
     * 获取接口调用统计信息
     *
     * 获取CPCS中接口调用统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticInterfaceRequest 请求对象
     * @return ShowStatisticInterfaceResponse
     */
    public ShowStatisticInterfaceResponse showStatisticInterface(ShowStatisticInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showStatisticInterface);
    }

    /**
     * 获取接口调用统计信息
     *
     * 获取CPCS中接口调用统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticInterfaceRequest 请求对象
     * @return SyncInvoker<ShowStatisticInterfaceRequest, ShowStatisticInterfaceResponse>
     */
    public SyncInvoker<ShowStatisticInterfaceRequest, ShowStatisticInterfaceResponse> showStatisticInterfaceInvoker(
        ShowStatisticInterfaceRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showStatisticInterface, hcClient);
    }

    /**
     * 获取资源总量统计信息
     *
     * 获取CPCS中\\资源总量统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticResourceRequest 请求对象
     * @return ShowStatisticResourceResponse
     */
    public ShowStatisticResourceResponse showStatisticResource(ShowStatisticResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showStatisticResource);
    }

    /**
     * 获取资源总量统计信息
     *
     * 获取CPCS中\\资源总量统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticResourceRequest 请求对象
     * @return SyncInvoker<ShowStatisticResourceRequest, ShowStatisticResourceResponse>
     */
    public SyncInvoker<ShowStatisticResourceRequest, ShowStatisticResourceResponse> showStatisticResourceInvoker(
        ShowStatisticResourceRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showStatisticResource, hcClient);
    }

    /**
     * 获取密钥分布统计信息
     *
     * 获取CPCS中密钥分布统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticSecretKeyRequest 请求对象
     * @return ShowStatisticSecretKeyResponse
     */
    public ShowStatisticSecretKeyResponse showStatisticSecretKey(ShowStatisticSecretKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showStatisticSecretKey);
    }

    /**
     * 获取密钥分布统计信息
     *
     * 获取CPCS中密钥分布统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticSecretKeyRequest 请求对象
     * @return SyncInvoker<ShowStatisticSecretKeyRequest, ShowStatisticSecretKeyResponse>
     */
    public SyncInvoker<ShowStatisticSecretKeyRequest, ShowStatisticSecretKeyResponse> showStatisticSecretKeyInvoker(
        ShowStatisticSecretKeyRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showStatisticSecretKey, hcClient);
    }

    /**
     * 获取应用状态监控
     *
     * CPCS服务创建的应用状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusAppRequest 请求对象
     * @return ShowStatusAppResponse
     */
    public ShowStatusAppResponse showStatusApp(ShowStatusAppRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showStatusApp);
    }

    /**
     * 获取应用状态监控
     *
     * CPCS服务创建的应用状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusAppRequest 请求对象
     * @return SyncInvoker<ShowStatusAppRequest, ShowStatusAppResponse>
     */
    public SyncInvoker<ShowStatusAppRequest, ShowStatusAppResponse> showStatusAppInvoker(ShowStatusAppRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showStatusApp, hcClient);
    }

    /**
     * 获取集群监控信息
     *
     * CPCS服务创建的集群的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusClusterRequest 请求对象
     * @return ShowStatusClusterResponse
     */
    public ShowStatusClusterResponse showStatusCluster(ShowStatusClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showStatusCluster);
    }

    /**
     * 获取集群监控信息
     *
     * CPCS服务创建的集群的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusClusterRequest 请求对象
     * @return SyncInvoker<ShowStatusClusterRequest, ShowStatusClusterResponse>
     */
    public SyncInvoker<ShowStatusClusterRequest, ShowStatusClusterResponse> showStatusClusterInvoker(
        ShowStatusClusterRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showStatusCluster, hcClient);
    }

    /**
     * 获取实例监控信息
     *
     * CPCS服务创建的密码服务实例的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusInstanceRequest 请求对象
     * @return ShowStatusInstanceResponse
     */
    public ShowStatusInstanceResponse showStatusInstance(ShowStatusInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showStatusInstance);
    }

    /**
     * 获取实例监控信息
     *
     * CPCS服务创建的密码服务实例的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusInstanceRequest 请求对象
     * @return SyncInvoker<ShowStatusInstanceRequest, ShowStatusInstanceResponse>
     */
    public SyncInvoker<ShowStatusInstanceRequest, ShowStatusInstanceResponse> showStatusInstanceInvoker(
        ShowStatusInstanceRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showStatusInstance, hcClient);
    }

    /**
     * 获取服务监控信息
     *
     * CPCS服务的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusServiceRequest 请求对象
     * @return ShowStatusServiceResponse
     */
    public ShowStatusServiceResponse showStatusService(ShowStatusServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showStatusService);
    }

    /**
     * 获取服务监控信息
     *
     * CPCS服务的状态监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatusServiceRequest 请求对象
     * @return SyncInvoker<ShowStatusServiceRequest, ShowStatusServiceResponse>
     */
    public SyncInvoker<ShowStatusServiceRequest, ShowStatusServiceResponse> showStatusServiceInvoker(
        ShowStatusServiceRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showStatusService, hcClient);
    }

    /**
     * 密码资源指标监控
     *
     * 获取密码服务实例与虚拟密码机实例的指标（cpu使用率，内存使用率等指标）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVmMonitorRequest 请求对象
     * @return ShowVmMonitorResponse
     */
    public ShowVmMonitorResponse showVmMonitor(ShowVmMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.showVmMonitor);
    }

    /**
     * 密码资源指标监控
     *
     * 获取密码服务实例与虚拟密码机实例的指标（cpu使用率，内存使用率等指标）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVmMonitorRequest 请求对象
     * @return SyncInvoker<ShowVmMonitorRequest, ShowVmMonitorResponse>
     */
    public SyncInvoker<ShowVmMonitorRequest, ShowVmMonitorResponse> showVmMonitorInvoker(ShowVmMonitorRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.showVmMonitor, hcClient);
    }

    /**
     * AK/SK 换取Cpcs token
     *
     * 使用aksk换取cpcs token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchCpcsTokenRequest 请求对象
     * @return SwitchCpcsTokenResponse
     */
    public SwitchCpcsTokenResponse switchCpcsToken(SwitchCpcsTokenRequest request) {
        return hcClient.syncInvokeHttp(request, CpcsMeta.switchCpcsToken);
    }

    /**
     * AK/SK 换取Cpcs token
     *
     * 使用aksk换取cpcs token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchCpcsTokenRequest 请求对象
     * @return SyncInvoker<SwitchCpcsTokenRequest, SwitchCpcsTokenResponse>
     */
    public SyncInvoker<SwitchCpcsTokenRequest, SwitchCpcsTokenResponse> switchCpcsTokenInvoker(
        SwitchCpcsTokenRequest request) {
        return new SyncInvoker<>(request, CpcsMeta.switchCpcsToken, hcClient);
    }

}
