package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdb.v3.model.*;

public class GaussDBAsyncClient {
    protected HcClient hcClient;

    public GaussDBAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBAsyncClient> newBuilder() {
        return new ClientBuilder<>(GaussDBAsyncClient::new);
    }


    /**
     * 变更实例规格
     * 变更数据库实例的规格。
     *
     * @param ChangeMysqlInstanceSpecificationRequest 请求对象
     * @return CompletableFuture<ChangeMysqlInstanceSpecificationResponse>
     */
    public CompletableFuture<ChangeMysqlInstanceSpecificationResponse> changeMysqlInstanceSpecificationAsync(ChangeMysqlInstanceSpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.changeMysqlInstanceSpecification);
    }

    /**
     * 变更实例规格
     * 变更数据库实例的规格。
     *
     * @param ChangeMysqlInstanceSpecificationRequest 请求对象
     * @return AsyncInvoker<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse>
     */
    public AsyncInvoker<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse> changeMysqlInstanceSpecificationAsyncInvoker(ChangeMysqlInstanceSpecificationRequest request) {
        return new AsyncInvoker<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse>(request, GaussDBMeta.changeMysqlInstanceSpecification, hcClient);
    }

    /**
     * 创建手动备份
     * 创建手动备份
     *
     * @param CreateMysqlBackupRequest 请求对象
     * @return CompletableFuture<CreateMysqlBackupResponse>
     */
    public CompletableFuture<CreateMysqlBackupResponse> createMysqlBackupAsync(CreateMysqlBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createMysqlBackup);
    }

    /**
     * 创建手动备份
     * 创建手动备份
     *
     * @param CreateMysqlBackupRequest 请求对象
     * @return AsyncInvoker<CreateMysqlBackupRequest, CreateMysqlBackupResponse>
     */
    public AsyncInvoker<CreateMysqlBackupRequest, CreateMysqlBackupResponse> createMysqlBackupAsyncInvoker(CreateMysqlBackupRequest request) {
        return new AsyncInvoker<CreateMysqlBackupRequest, CreateMysqlBackupResponse>(request, GaussDBMeta.createMysqlBackup, hcClient);
    }

    /**
     * 创建数据库实例
     * 创建云数据库 GaussDB(for MySQL)实例。
     *
     * @param CreateMysqlInstanceRequest 请求对象
     * @return CompletableFuture<CreateMysqlInstanceResponse>
     */
    public CompletableFuture<CreateMysqlInstanceResponse> createMysqlInstanceAsync(CreateMysqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createMysqlInstance);
    }

    /**
     * 创建数据库实例
     * 创建云数据库 GaussDB(for MySQL)实例。
     *
     * @param CreateMysqlInstanceRequest 请求对象
     * @return AsyncInvoker<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse>
     */
    public AsyncInvoker<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse> createMysqlInstanceAsyncInvoker(CreateMysqlInstanceRequest request) {
        return new AsyncInvoker<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse>(request, GaussDBMeta.createMysqlInstance, hcClient);
    }

    /**
     * 开启数据库代理
     * 开启数据库代理，只支持ELB模式。
     *
     * @param CreateMysqlProxyRequest 请求对象
     * @return CompletableFuture<CreateMysqlProxyResponse>
     */
    public CompletableFuture<CreateMysqlProxyResponse> createMysqlProxyAsync(CreateMysqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createMysqlProxy);
    }

    /**
     * 开启数据库代理
     * 开启数据库代理，只支持ELB模式。
     *
     * @param CreateMysqlProxyRequest 请求对象
     * @return AsyncInvoker<CreateMysqlProxyRequest, CreateMysqlProxyResponse>
     */
    public AsyncInvoker<CreateMysqlProxyRequest, CreateMysqlProxyResponse> createMysqlProxyAsyncInvoker(CreateMysqlProxyRequest request) {
        return new AsyncInvoker<CreateMysqlProxyRequest, CreateMysqlProxyResponse>(request, GaussDBMeta.createMysqlProxy, hcClient);
    }

    /**
     * 创建只读节点
     * 创建只读节点。
     *
     * @param CreateMysqlReadonlyNodeRequest 请求对象
     * @return CompletableFuture<CreateMysqlReadonlyNodeResponse>
     */
    public CompletableFuture<CreateMysqlReadonlyNodeResponse> createMysqlReadonlyNodeAsync(CreateMysqlReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createMysqlReadonlyNode);
    }

    /**
     * 创建只读节点
     * 创建只读节点。
     *
     * @param CreateMysqlReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse>
     */
    public AsyncInvoker<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse> createMysqlReadonlyNodeAsyncInvoker(CreateMysqlReadonlyNodeRequest request) {
        return new AsyncInvoker<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse>(request, GaussDBMeta.createMysqlReadonlyNode, hcClient);
    }

    /**
     * 删除实例
     * 删除数据库实例，不支持删除包周期实例。
     *
     * @param DeleteMysqlInstanceRequest 请求对象
     * @return CompletableFuture<DeleteMysqlInstanceResponse>
     */
    public CompletableFuture<DeleteMysqlInstanceResponse> deleteMysqlInstanceAsync(DeleteMysqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteMysqlInstance);
    }

    /**
     * 删除实例
     * 删除数据库实例，不支持删除包周期实例。
     *
     * @param DeleteMysqlInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse>
     */
    public AsyncInvoker<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse> deleteMysqlInstanceAsyncInvoker(DeleteMysqlInstanceRequest request) {
        return new AsyncInvoker<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse>(request, GaussDBMeta.deleteMysqlInstance, hcClient);
    }

    /**
     * 关闭数据库代理
     * 关闭数据库代理。
     *
     * @param DeleteMysqlProxyRequest 请求对象
     * @return CompletableFuture<DeleteMysqlProxyResponse>
     */
    public CompletableFuture<DeleteMysqlProxyResponse> deleteMysqlProxyAsync(DeleteMysqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteMysqlProxy);
    }

    /**
     * 关闭数据库代理
     * 关闭数据库代理。
     *
     * @param DeleteMysqlProxyRequest 请求对象
     * @return AsyncInvoker<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse>
     */
    public AsyncInvoker<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse> deleteMysqlProxyAsyncInvoker(DeleteMysqlProxyRequest request) {
        return new AsyncInvoker<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse>(request, GaussDBMeta.deleteMysqlProxy, hcClient);
    }

    /**
     * 删除只读节点
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     *
     * @param DeleteMysqlReadonlyNodeRequest 请求对象
     * @return CompletableFuture<DeleteMysqlReadonlyNodeResponse>
     */
    public CompletableFuture<DeleteMysqlReadonlyNodeResponse> deleteMysqlReadonlyNodeAsync(DeleteMysqlReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteMysqlReadonlyNode);
    }

    /**
     * 删除只读节点
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     *
     * @param DeleteMysqlReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse>
     */
    public AsyncInvoker<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse> deleteMysqlReadonlyNodeAsyncInvoker(DeleteMysqlReadonlyNodeRequest request) {
        return new AsyncInvoker<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse>(request, GaussDBMeta.deleteMysqlReadonlyNode, hcClient);
    }

    /**
     * 包周期存储扩容
     * 包周期存储扩容
     *
     * @param ExpandMysqlInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ExpandMysqlInstanceVolumeResponse>
     */
    public CompletableFuture<ExpandMysqlInstanceVolumeResponse> expandMysqlInstanceVolumeAsync(ExpandMysqlInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.expandMysqlInstanceVolume);
    }

    /**
     * 包周期存储扩容
     * 包周期存储扩容
     *
     * @param ExpandMysqlInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse>
     */
    public AsyncInvoker<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse> expandMysqlInstanceVolumeAsyncInvoker(ExpandMysqlInstanceVolumeRequest request) {
        return new AsyncInvoker<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse>(request, GaussDBMeta.expandMysqlInstanceVolume, hcClient);
    }

    /**
     * 扩容数据库代理节点的数量
     * 扩容数据库代理节点的数量。 DeC专属云账号暂不支持数据库代理。
     *
     * @param ExpandMysqlProxyRequest 请求对象
     * @return CompletableFuture<ExpandMysqlProxyResponse>
     */
    public CompletableFuture<ExpandMysqlProxyResponse> expandMysqlProxyAsync(ExpandMysqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.expandMysqlProxy);
    }

    /**
     * 扩容数据库代理节点的数量
     * 扩容数据库代理节点的数量。 DeC专属云账号暂不支持数据库代理。
     *
     * @param ExpandMysqlProxyRequest 请求对象
     * @return AsyncInvoker<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse>
     */
    public AsyncInvoker<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse> expandMysqlProxyAsyncInvoker(ExpandMysqlProxyRequest request) {
        return new AsyncInvoker<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse>(request, GaussDBMeta.expandMysqlProxy, hcClient);
    }

    /**
     * 查询专属资源池列表
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return CompletableFuture<ListDedicatedResourcesResponse>
     */
    public CompletableFuture<ListDedicatedResourcesResponse> listDedicatedResourcesAsync(ListDedicatedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listDedicatedResources);
    }

    /**
     * 查询专属资源池列表
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>
     */
    public AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResourcesAsyncInvoker(ListDedicatedResourcesRequest request) {
        return new AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>(request, GaussDBMeta.listDedicatedResources, hcClient);
    }

    /**
     * 查询参数模板
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListMysqlConfigurationsRequest 请求对象
     * @return CompletableFuture<ListMysqlConfigurationsResponse>
     */
    public CompletableFuture<ListMysqlConfigurationsResponse> listMysqlConfigurationsAsync(ListMysqlConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listMysqlConfigurations);
    }

    /**
     * 查询参数模板
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListMysqlConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse>
     */
    public AsyncInvoker<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse> listMysqlConfigurationsAsyncInvoker(ListMysqlConfigurationsRequest request) {
        return new AsyncInvoker<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse>(request, GaussDBMeta.listMysqlConfigurations, hcClient);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListMysqlErrorLogRequest 请求对象
     * @return CompletableFuture<ListMysqlErrorLogResponse>
     */
    public CompletableFuture<ListMysqlErrorLogResponse> listMysqlErrorLogAsync(ListMysqlErrorLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listMysqlErrorLog);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListMysqlErrorLogRequest 请求对象
     * @return AsyncInvoker<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse>
     */
    public AsyncInvoker<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse> listMysqlErrorLogAsyncInvoker(ListMysqlErrorLogRequest request) {
        return new AsyncInvoker<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse>(request, GaussDBMeta.listMysqlErrorLog, hcClient);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志
     *
     * @param ListMysqlSlowLogRequest 请求对象
     * @return CompletableFuture<ListMysqlSlowLogResponse>
     */
    public CompletableFuture<ListMysqlSlowLogResponse> listMysqlSlowLogAsync(ListMysqlSlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listMysqlSlowLog);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志
     *
     * @param ListMysqlSlowLogRequest 请求对象
     * @return AsyncInvoker<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse>
     */
    public AsyncInvoker<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse> listMysqlSlowLogAsyncInvoker(ListMysqlSlowLogRequest request) {
        return new AsyncInvoker<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse>(request, GaussDBMeta.listMysqlSlowLog, hcClient);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码
     *
     * @param ResetMysqlPasswordRequest 请求对象
     * @return CompletableFuture<ResetMysqlPasswordResponse>
     */
    public CompletableFuture<ResetMysqlPasswordResponse> resetMysqlPasswordAsync(ResetMysqlPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resetMysqlPassword);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码
     *
     * @param ResetMysqlPasswordRequest 请求对象
     * @return AsyncInvoker<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse>
     */
    public AsyncInvoker<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse> resetMysqlPasswordAsyncInvoker(ResetMysqlPasswordRequest request) {
        return new AsyncInvoker<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse>(request, GaussDBMeta.resetMysqlPassword, hcClient);
    }

    /**
     * 设置租户基于企业项目的资源配额
     * 设置指定企业项目的资源配额。
     *
     * @param SetMysqlQuotasRequest 请求对象
     * @return CompletableFuture<SetMysqlQuotasResponse>
     */
    public CompletableFuture<SetMysqlQuotasResponse> setMysqlQuotasAsync(SetMysqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setMysqlQuotas);
    }

    /**
     * 设置租户基于企业项目的资源配额
     * 设置指定企业项目的资源配额。
     *
     * @param SetMysqlQuotasRequest 请求对象
     * @return AsyncInvoker<SetMysqlQuotasRequest, SetMysqlQuotasResponse>
     */
    public AsyncInvoker<SetMysqlQuotasRequest, SetMysqlQuotasResponse> setMysqlQuotasAsyncInvoker(SetMysqlQuotasRequest request) {
        return new AsyncInvoker<SetMysqlQuotasRequest, SetMysqlQuotasResponse>(request, GaussDBMeta.setMysqlQuotas, hcClient);
    }

    /**
     * 查询备份列表
     * 查询备份列表
     *
     * @param ShowMysqlBackupListRequest 请求对象
     * @return CompletableFuture<ShowMysqlBackupListResponse>
     */
    public CompletableFuture<ShowMysqlBackupListResponse> showMysqlBackupListAsync(ShowMysqlBackupListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlBackupList);
    }

    /**
     * 查询备份列表
     * 查询备份列表
     *
     * @param ShowMysqlBackupListRequest 请求对象
     * @return AsyncInvoker<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse>
     */
    public AsyncInvoker<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse> showMysqlBackupListAsyncInvoker(ShowMysqlBackupListRequest request) {
        return new AsyncInvoker<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse>(request, GaussDBMeta.showMysqlBackupList, hcClient);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowMysqlBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowMysqlBackupPolicyResponse>
     */
    public CompletableFuture<ShowMysqlBackupPolicyResponse> showMysqlBackupPolicyAsync(ShowMysqlBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlBackupPolicy);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowMysqlBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse>
     */
    public AsyncInvoker<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse> showMysqlBackupPolicyAsyncInvoker(ShowMysqlBackupPolicyRequest request) {
        return new AsyncInvoker<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse>(request, GaussDBMeta.showMysqlBackupPolicy, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     * 获取指定数据库引擎对应的数据库版本信息。
     *
     * @param ShowMysqlEngineVersionRequest 请求对象
     * @return CompletableFuture<ShowMysqlEngineVersionResponse>
     */
    public CompletableFuture<ShowMysqlEngineVersionResponse> showMysqlEngineVersionAsync(ShowMysqlEngineVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlEngineVersion);
    }

    /**
     * 查询数据库引擎的版本
     * 获取指定数据库引擎对应的数据库版本信息。
     *
     * @param ShowMysqlEngineVersionRequest 请求对象
     * @return AsyncInvoker<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse>
     */
    public AsyncInvoker<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse> showMysqlEngineVersionAsyncInvoker(ShowMysqlEngineVersionRequest request) {
        return new AsyncInvoker<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse>(request, GaussDBMeta.showMysqlEngineVersion, hcClient);
    }

    /**
     * 查询数据库规格
     * 获取指定数据库引擎版本对应的规格信息。
     *
     * @param ShowMysqlFlavorsRequest 请求对象
     * @return CompletableFuture<ShowMysqlFlavorsResponse>
     */
    public CompletableFuture<ShowMysqlFlavorsResponse> showMysqlFlavorsAsync(ShowMysqlFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlFlavors);
    }

    /**
     * 查询数据库规格
     * 获取指定数据库引擎版本对应的规格信息。
     *
     * @param ShowMysqlFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse>
     */
    public AsyncInvoker<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse> showMysqlFlavorsAsyncInvoker(ShowMysqlFlavorsRequest request) {
        return new AsyncInvoker<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse>(request, GaussDBMeta.showMysqlFlavors, hcClient);
    }

    /**
     * 查询实例详情信息
     * 查询实例详情信息
     *
     * @param ShowMysqlInstanceInfoRequest 请求对象
     * @return CompletableFuture<ShowMysqlInstanceInfoResponse>
     */
    public CompletableFuture<ShowMysqlInstanceInfoResponse> showMysqlInstanceInfoAsync(ShowMysqlInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlInstanceInfo);
    }

    /**
     * 查询实例详情信息
     * 查询实例详情信息
     *
     * @param ShowMysqlInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse>
     */
    public AsyncInvoker<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse> showMysqlInstanceInfoAsyncInvoker(ShowMysqlInstanceInfoRequest request) {
        return new AsyncInvoker<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse>(request, GaussDBMeta.showMysqlInstanceInfo, hcClient);
    }

    /**
     * 查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ShowMysqlInstanceListRequest 请求对象
     * @return CompletableFuture<ShowMysqlInstanceListResponse>
     */
    public CompletableFuture<ShowMysqlInstanceListResponse> showMysqlInstanceListAsync(ShowMysqlInstanceListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlInstanceList);
    }

    /**
     * 查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ShowMysqlInstanceListRequest 请求对象
     * @return AsyncInvoker<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse>
     */
    public AsyncInvoker<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse> showMysqlInstanceListAsyncInvoker(ShowMysqlInstanceListRequest request) {
        return new AsyncInvoker<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse>(request, GaussDBMeta.showMysqlInstanceList, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     * 获取指定ID的任务信息。
     *
     * @param ShowMysqlJobInfoRequest 请求对象
     * @return CompletableFuture<ShowMysqlJobInfoResponse>
     */
    public CompletableFuture<ShowMysqlJobInfoResponse> showMysqlJobInfoAsync(ShowMysqlJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     * 获取指定ID的任务信息。
     *
     * @param ShowMysqlJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse>
     */
    public AsyncInvoker<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse> showMysqlJobInfoAsyncInvoker(ShowMysqlJobInfoRequest request) {
        return new AsyncInvoker<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse>(request, GaussDBMeta.showMysqlJobInfo, hcClient);
    }

    /**
     * 查询租户的实例配额
     * 获取指定租户的资源配额。
     *
     * @param ShowMysqlProjectQuotasRequest 请求对象
     * @return CompletableFuture<ShowMysqlProjectQuotasResponse>
     */
    public CompletableFuture<ShowMysqlProjectQuotasResponse> showMysqlProjectQuotasAsync(ShowMysqlProjectQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     * 获取指定租户的资源配额。
     *
     * @param ShowMysqlProjectQuotasRequest 请求对象
     * @return AsyncInvoker<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse>
     */
    public AsyncInvoker<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse> showMysqlProjectQuotasAsyncInvoker(ShowMysqlProjectQuotasRequest request) {
        return new AsyncInvoker<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse>(request, GaussDBMeta.showMysqlProjectQuotas, hcClient);
    }

    /**
     * 查询数据库代理信息
     * 查询数据库代理信息。
     *
     * @param ShowMysqlProxyRequest 请求对象
     * @return CompletableFuture<ShowMysqlProxyResponse>
     */
    public CompletableFuture<ShowMysqlProxyResponse> showMysqlProxyAsync(ShowMysqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlProxy);
    }

    /**
     * 查询数据库代理信息
     * 查询数据库代理信息。
     *
     * @param ShowMysqlProxyRequest 请求对象
     * @return AsyncInvoker<ShowMysqlProxyRequest, ShowMysqlProxyResponse>
     */
    public AsyncInvoker<ShowMysqlProxyRequest, ShowMysqlProxyResponse> showMysqlProxyAsyncInvoker(ShowMysqlProxyRequest request) {
        return new AsyncInvoker<ShowMysqlProxyRequest, ShowMysqlProxyResponse>(request, GaussDBMeta.showMysqlProxy, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     * 查询数据库代理规格信息。
     *
     * @param ShowMysqlProxyFlavorsRequest 请求对象
     * @return CompletableFuture<ShowMysqlProxyFlavorsResponse>
     */
    public CompletableFuture<ShowMysqlProxyFlavorsResponse> showMysqlProxyFlavorsAsync(ShowMysqlProxyFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     * 查询数据库代理规格信息。
     *
     * @param ShowMysqlProxyFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse>
     */
    public AsyncInvoker<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse> showMysqlProxyFlavorsAsyncInvoker(ShowMysqlProxyFlavorsRequest request) {
        return new AsyncInvoker<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse>(request, GaussDBMeta.showMysqlProxyFlavors, hcClient);
    }

    /**
     * 查询租户基于企业项目的资源配额
     * 获取指定企业项目的资源配额。
     *
     * @param ShowMysqlQuotasRequest 请求对象
     * @return CompletableFuture<ShowMysqlQuotasResponse>
     */
    public CompletableFuture<ShowMysqlQuotasResponse> showMysqlQuotasAsync(ShowMysqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showMysqlQuotas);
    }

    /**
     * 查询租户基于企业项目的资源配额
     * 获取指定企业项目的资源配额。
     *
     * @param ShowMysqlQuotasRequest 请求对象
     * @return AsyncInvoker<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse>
     */
    public AsyncInvoker<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse> showMysqlQuotasAsyncInvoker(ShowMysqlQuotasRequest request) {
        return new AsyncInvoker<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse>(request, GaussDBMeta.showMysqlQuotas, hcClient);
    }

    /**
     * 修改备份策略
     * 修改备份策略
     *
     * @param UpdateMysqlBackupPolicyRequest 请求对象
     * @return CompletableFuture<UpdateMysqlBackupPolicyResponse>
     */
    public CompletableFuture<UpdateMysqlBackupPolicyResponse> updateMysqlBackupPolicyAsync(UpdateMysqlBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateMysqlBackupPolicy);
    }

    /**
     * 修改备份策略
     * 修改备份策略
     *
     * @param UpdateMysqlBackupPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse>
     */
    public AsyncInvoker<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse> updateMysqlBackupPolicyAsyncInvoker(UpdateMysqlBackupPolicyRequest request) {
        return new AsyncInvoker<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse>(request, GaussDBMeta.updateMysqlBackupPolicy, hcClient);
    }

    /**
     * 修改实例名称
     * 修改实例名称
     *
     * @param UpdateMysqlInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateMysqlInstanceNameResponse>
     */
    public CompletableFuture<UpdateMysqlInstanceNameResponse> updateMysqlInstanceNameAsync(UpdateMysqlInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateMysqlInstanceName);
    }

    /**
     * 修改实例名称
     * 修改实例名称
     *
     * @param UpdateMysqlInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse>
     */
    public AsyncInvoker<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse> updateMysqlInstanceNameAsyncInvoker(UpdateMysqlInstanceNameRequest request) {
        return new AsyncInvoker<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse>(request, GaussDBMeta.updateMysqlInstanceName, hcClient);
    }

    /**
     * 修改租户基于企业项目的资源配额
     * 修改指定企业项目的资源配额。
     *
     * @param UpdateMysqlQuotasRequest 请求对象
     * @return CompletableFuture<UpdateMysqlQuotasResponse>
     */
    public CompletableFuture<UpdateMysqlQuotasResponse> updateMysqlQuotasAsync(UpdateMysqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateMysqlQuotas);
    }

    /**
     * 修改租户基于企业项目的资源配额
     * 修改指定企业项目的资源配额。
     *
     * @param UpdateMysqlQuotasRequest 请求对象
     * @return AsyncInvoker<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse>
     */
    public AsyncInvoker<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse> updateMysqlQuotasAsyncInvoker(UpdateMysqlQuotasRequest request) {
        return new AsyncInvoker<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse>(request, GaussDBMeta.updateMysqlQuotas, hcClient);
    }

}