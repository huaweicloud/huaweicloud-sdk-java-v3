package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.gaussdb.v3.model.*;

public class GaussDBClient {
    protected HcClient hcClient;

    public GaussDBClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBClient> newBuilder() {
        return new ClientBuilder<>(GaussDBClient::new);
    }


    /**
     * 变更实例规格
     * 变更数据库实例的规格。
     *
     * @param ChangeMysqlInstanceSpecificationRequest 请求对象
     * @return ChangeMysqlInstanceSpecificationResponse
     */
    public ChangeMysqlInstanceSpecificationResponse changeMysqlInstanceSpecification(ChangeMysqlInstanceSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.changeMysqlInstanceSpecification);
    }

    /**
     * 变更实例规格
     * 变更数据库实例的规格。
     *
     * @param ChangeMysqlInstanceSpecificationRequest 请求对象
     * @return SyncInvoker<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse>
     */
    public SyncInvoker<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse> changeMysqlInstanceSpecificationInvoker(ChangeMysqlInstanceSpecificationRequest request) {
        return new SyncInvoker<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse>(request, GaussDBMeta.changeMysqlInstanceSpecification, hcClient);
    }

    /**
     * 创建手动备份
     * 创建手动备份
     *
     * @param CreateMysqlBackupRequest 请求对象
     * @return CreateMysqlBackupResponse
     */
    public CreateMysqlBackupResponse createMysqlBackup(CreateMysqlBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createMysqlBackup);
    }

    /**
     * 创建手动备份
     * 创建手动备份
     *
     * @param CreateMysqlBackupRequest 请求对象
     * @return SyncInvoker<CreateMysqlBackupRequest, CreateMysqlBackupResponse>
     */
    public SyncInvoker<CreateMysqlBackupRequest, CreateMysqlBackupResponse> createMysqlBackupInvoker(CreateMysqlBackupRequest request) {
        return new SyncInvoker<CreateMysqlBackupRequest, CreateMysqlBackupResponse>(request, GaussDBMeta.createMysqlBackup, hcClient);
    }

    /**
     * 创建数据库实例
     * 创建云数据库 GaussDB(for MySQL)实例。
     *
     * @param CreateMysqlInstanceRequest 请求对象
     * @return CreateMysqlInstanceResponse
     */
    public CreateMysqlInstanceResponse createMysqlInstance(CreateMysqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createMysqlInstance);
    }

    /**
     * 创建数据库实例
     * 创建云数据库 GaussDB(for MySQL)实例。
     *
     * @param CreateMysqlInstanceRequest 请求对象
     * @return SyncInvoker<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse>
     */
    public SyncInvoker<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse> createMysqlInstanceInvoker(CreateMysqlInstanceRequest request) {
        return new SyncInvoker<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse>(request, GaussDBMeta.createMysqlInstance, hcClient);
    }

    /**
     * 开启数据库代理
     * 开启数据库代理，只支持ELB模式。
     *
     * @param CreateMysqlProxyRequest 请求对象
     * @return CreateMysqlProxyResponse
     */
    public CreateMysqlProxyResponse createMysqlProxy(CreateMysqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createMysqlProxy);
    }

    /**
     * 开启数据库代理
     * 开启数据库代理，只支持ELB模式。
     *
     * @param CreateMysqlProxyRequest 请求对象
     * @return SyncInvoker<CreateMysqlProxyRequest, CreateMysqlProxyResponse>
     */
    public SyncInvoker<CreateMysqlProxyRequest, CreateMysqlProxyResponse> createMysqlProxyInvoker(CreateMysqlProxyRequest request) {
        return new SyncInvoker<CreateMysqlProxyRequest, CreateMysqlProxyResponse>(request, GaussDBMeta.createMysqlProxy, hcClient);
    }

    /**
     * 创建只读节点
     * 创建只读节点。
     *
     * @param CreateMysqlReadonlyNodeRequest 请求对象
     * @return CreateMysqlReadonlyNodeResponse
     */
    public CreateMysqlReadonlyNodeResponse createMysqlReadonlyNode(CreateMysqlReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createMysqlReadonlyNode);
    }

    /**
     * 创建只读节点
     * 创建只读节点。
     *
     * @param CreateMysqlReadonlyNodeRequest 请求对象
     * @return SyncInvoker<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse>
     */
    public SyncInvoker<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse> createMysqlReadonlyNodeInvoker(CreateMysqlReadonlyNodeRequest request) {
        return new SyncInvoker<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse>(request, GaussDBMeta.createMysqlReadonlyNode, hcClient);
    }

    /**
     * 删除实例
     * 删除数据库实例，不支持删除包周期实例。
     *
     * @param DeleteMysqlInstanceRequest 请求对象
     * @return DeleteMysqlInstanceResponse
     */
    public DeleteMysqlInstanceResponse deleteMysqlInstance(DeleteMysqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteMysqlInstance);
    }

    /**
     * 删除实例
     * 删除数据库实例，不支持删除包周期实例。
     *
     * @param DeleteMysqlInstanceRequest 请求对象
     * @return SyncInvoker<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse>
     */
    public SyncInvoker<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse> deleteMysqlInstanceInvoker(DeleteMysqlInstanceRequest request) {
        return new SyncInvoker<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse>(request, GaussDBMeta.deleteMysqlInstance, hcClient);
    }

    /**
     * 关闭数据库代理
     * 关闭数据库代理。
     *
     * @param DeleteMysqlProxyRequest 请求对象
     * @return DeleteMysqlProxyResponse
     */
    public DeleteMysqlProxyResponse deleteMysqlProxy(DeleteMysqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteMysqlProxy);
    }

    /**
     * 关闭数据库代理
     * 关闭数据库代理。
     *
     * @param DeleteMysqlProxyRequest 请求对象
     * @return SyncInvoker<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse>
     */
    public SyncInvoker<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse> deleteMysqlProxyInvoker(DeleteMysqlProxyRequest request) {
        return new SyncInvoker<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse>(request, GaussDBMeta.deleteMysqlProxy, hcClient);
    }

    /**
     * 删除只读节点
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     *
     * @param DeleteMysqlReadonlyNodeRequest 请求对象
     * @return DeleteMysqlReadonlyNodeResponse
     */
    public DeleteMysqlReadonlyNodeResponse deleteMysqlReadonlyNode(DeleteMysqlReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteMysqlReadonlyNode);
    }

    /**
     * 删除只读节点
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     *
     * @param DeleteMysqlReadonlyNodeRequest 请求对象
     * @return SyncInvoker<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse>
     */
    public SyncInvoker<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse> deleteMysqlReadonlyNodeInvoker(DeleteMysqlReadonlyNodeRequest request) {
        return new SyncInvoker<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse>(request, GaussDBMeta.deleteMysqlReadonlyNode, hcClient);
    }

    /**
     * 包周期存储扩容
     * 包周期存储扩容
     *
     * @param ExpandMysqlInstanceVolumeRequest 请求对象
     * @return ExpandMysqlInstanceVolumeResponse
     */
    public ExpandMysqlInstanceVolumeResponse expandMysqlInstanceVolume(ExpandMysqlInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.expandMysqlInstanceVolume);
    }

    /**
     * 包周期存储扩容
     * 包周期存储扩容
     *
     * @param ExpandMysqlInstanceVolumeRequest 请求对象
     * @return SyncInvoker<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse>
     */
    public SyncInvoker<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse> expandMysqlInstanceVolumeInvoker(ExpandMysqlInstanceVolumeRequest request) {
        return new SyncInvoker<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse>(request, GaussDBMeta.expandMysqlInstanceVolume, hcClient);
    }

    /**
     * 扩容数据库代理节点的数量
     * 扩容数据库代理节点的数量。 DeC专属云账号暂不支持数据库代理。
     *
     * @param ExpandMysqlProxyRequest 请求对象
     * @return ExpandMysqlProxyResponse
     */
    public ExpandMysqlProxyResponse expandMysqlProxy(ExpandMysqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.expandMysqlProxy);
    }

    /**
     * 扩容数据库代理节点的数量
     * 扩容数据库代理节点的数量。 DeC专属云账号暂不支持数据库代理。
     *
     * @param ExpandMysqlProxyRequest 请求对象
     * @return SyncInvoker<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse>
     */
    public SyncInvoker<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse> expandMysqlProxyInvoker(ExpandMysqlProxyRequest request) {
        return new SyncInvoker<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse>(request, GaussDBMeta.expandMysqlProxy, hcClient);
    }

    /**
     * 查询专属资源池列表
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return ListDedicatedResourcesResponse
     */
    public ListDedicatedResourcesResponse listDedicatedResources(ListDedicatedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listDedicatedResources);
    }

    /**
     * 查询专属资源池列表
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return SyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>
     */
    public SyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResourcesInvoker(ListDedicatedResourcesRequest request) {
        return new SyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>(request, GaussDBMeta.listDedicatedResources, hcClient);
    }

    /**
     * 查询参数模板
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListMysqlConfigurationsRequest 请求对象
     * @return ListMysqlConfigurationsResponse
     */
    public ListMysqlConfigurationsResponse listMysqlConfigurations(ListMysqlConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listMysqlConfigurations);
    }

    /**
     * 查询参数模板
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListMysqlConfigurationsRequest 请求对象
     * @return SyncInvoker<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse>
     */
    public SyncInvoker<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse> listMysqlConfigurationsInvoker(ListMysqlConfigurationsRequest request) {
        return new SyncInvoker<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse>(request, GaussDBMeta.listMysqlConfigurations, hcClient);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListMysqlErrorLogRequest 请求对象
     * @return ListMysqlErrorLogResponse
     */
    public ListMysqlErrorLogResponse listMysqlErrorLog(ListMysqlErrorLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listMysqlErrorLog);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListMysqlErrorLogRequest 请求对象
     * @return SyncInvoker<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse>
     */
    public SyncInvoker<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse> listMysqlErrorLogInvoker(ListMysqlErrorLogRequest request) {
        return new SyncInvoker<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse>(request, GaussDBMeta.listMysqlErrorLog, hcClient);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志
     *
     * @param ListMysqlSlowLogRequest 请求对象
     * @return ListMysqlSlowLogResponse
     */
    public ListMysqlSlowLogResponse listMysqlSlowLog(ListMysqlSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listMysqlSlowLog);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志
     *
     * @param ListMysqlSlowLogRequest 请求对象
     * @return SyncInvoker<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse>
     */
    public SyncInvoker<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse> listMysqlSlowLogInvoker(ListMysqlSlowLogRequest request) {
        return new SyncInvoker<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse>(request, GaussDBMeta.listMysqlSlowLog, hcClient);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码
     *
     * @param ResetMysqlPasswordRequest 请求对象
     * @return ResetMysqlPasswordResponse
     */
    public ResetMysqlPasswordResponse resetMysqlPassword(ResetMysqlPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.resetMysqlPassword);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码
     *
     * @param ResetMysqlPasswordRequest 请求对象
     * @return SyncInvoker<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse>
     */
    public SyncInvoker<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse> resetMysqlPasswordInvoker(ResetMysqlPasswordRequest request) {
        return new SyncInvoker<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse>(request, GaussDBMeta.resetMysqlPassword, hcClient);
    }

    /**
     * 设置租户基于企业项目的资源配额
     * 设置指定企业项目的资源配额。
     *
     * @param SetMysqlQuotasRequest 请求对象
     * @return SetMysqlQuotasResponse
     */
    public SetMysqlQuotasResponse setMysqlQuotas(SetMysqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.setMysqlQuotas);
    }

    /**
     * 设置租户基于企业项目的资源配额
     * 设置指定企业项目的资源配额。
     *
     * @param SetMysqlQuotasRequest 请求对象
     * @return SyncInvoker<SetMysqlQuotasRequest, SetMysqlQuotasResponse>
     */
    public SyncInvoker<SetMysqlQuotasRequest, SetMysqlQuotasResponse> setMysqlQuotasInvoker(SetMysqlQuotasRequest request) {
        return new SyncInvoker<SetMysqlQuotasRequest, SetMysqlQuotasResponse>(request, GaussDBMeta.setMysqlQuotas, hcClient);
    }

    /**
     * 查询备份列表
     * 查询备份列表
     *
     * @param ShowMysqlBackupListRequest 请求对象
     * @return ShowMysqlBackupListResponse
     */
    public ShowMysqlBackupListResponse showMysqlBackupList(ShowMysqlBackupListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlBackupList);
    }

    /**
     * 查询备份列表
     * 查询备份列表
     *
     * @param ShowMysqlBackupListRequest 请求对象
     * @return SyncInvoker<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse>
     */
    public SyncInvoker<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse> showMysqlBackupListInvoker(ShowMysqlBackupListRequest request) {
        return new SyncInvoker<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse>(request, GaussDBMeta.showMysqlBackupList, hcClient);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowMysqlBackupPolicyRequest 请求对象
     * @return ShowMysqlBackupPolicyResponse
     */
    public ShowMysqlBackupPolicyResponse showMysqlBackupPolicy(ShowMysqlBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlBackupPolicy);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowMysqlBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse>
     */
    public SyncInvoker<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse> showMysqlBackupPolicyInvoker(ShowMysqlBackupPolicyRequest request) {
        return new SyncInvoker<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse>(request, GaussDBMeta.showMysqlBackupPolicy, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     * 获取指定数据库引擎对应的数据库版本信息。
     *
     * @param ShowMysqlEngineVersionRequest 请求对象
     * @return ShowMysqlEngineVersionResponse
     */
    public ShowMysqlEngineVersionResponse showMysqlEngineVersion(ShowMysqlEngineVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlEngineVersion);
    }

    /**
     * 查询数据库引擎的版本
     * 获取指定数据库引擎对应的数据库版本信息。
     *
     * @param ShowMysqlEngineVersionRequest 请求对象
     * @return SyncInvoker<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse>
     */
    public SyncInvoker<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse> showMysqlEngineVersionInvoker(ShowMysqlEngineVersionRequest request) {
        return new SyncInvoker<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse>(request, GaussDBMeta.showMysqlEngineVersion, hcClient);
    }

    /**
     * 查询数据库规格
     * 获取指定数据库引擎版本对应的规格信息。
     *
     * @param ShowMysqlFlavorsRequest 请求对象
     * @return ShowMysqlFlavorsResponse
     */
    public ShowMysqlFlavorsResponse showMysqlFlavors(ShowMysqlFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlFlavors);
    }

    /**
     * 查询数据库规格
     * 获取指定数据库引擎版本对应的规格信息。
     *
     * @param ShowMysqlFlavorsRequest 请求对象
     * @return SyncInvoker<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse>
     */
    public SyncInvoker<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse> showMysqlFlavorsInvoker(ShowMysqlFlavorsRequest request) {
        return new SyncInvoker<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse>(request, GaussDBMeta.showMysqlFlavors, hcClient);
    }

    /**
     * 查询实例详情信息
     * 查询实例详情信息
     *
     * @param ShowMysqlInstanceInfoRequest 请求对象
     * @return ShowMysqlInstanceInfoResponse
     */
    public ShowMysqlInstanceInfoResponse showMysqlInstanceInfo(ShowMysqlInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlInstanceInfo);
    }

    /**
     * 查询实例详情信息
     * 查询实例详情信息
     *
     * @param ShowMysqlInstanceInfoRequest 请求对象
     * @return SyncInvoker<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse>
     */
    public SyncInvoker<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse> showMysqlInstanceInfoInvoker(ShowMysqlInstanceInfoRequest request) {
        return new SyncInvoker<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse>(request, GaussDBMeta.showMysqlInstanceInfo, hcClient);
    }

    /**
     * 查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ShowMysqlInstanceListRequest 请求对象
     * @return ShowMysqlInstanceListResponse
     */
    public ShowMysqlInstanceListResponse showMysqlInstanceList(ShowMysqlInstanceListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlInstanceList);
    }

    /**
     * 查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ShowMysqlInstanceListRequest 请求对象
     * @return SyncInvoker<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse>
     */
    public SyncInvoker<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse> showMysqlInstanceListInvoker(ShowMysqlInstanceListRequest request) {
        return new SyncInvoker<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse>(request, GaussDBMeta.showMysqlInstanceList, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     * 获取指定ID的任务信息。
     *
     * @param ShowMysqlJobInfoRequest 请求对象
     * @return ShowMysqlJobInfoResponse
     */
    public ShowMysqlJobInfoResponse showMysqlJobInfo(ShowMysqlJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     * 获取指定ID的任务信息。
     *
     * @param ShowMysqlJobInfoRequest 请求对象
     * @return SyncInvoker<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse>
     */
    public SyncInvoker<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse> showMysqlJobInfoInvoker(ShowMysqlJobInfoRequest request) {
        return new SyncInvoker<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse>(request, GaussDBMeta.showMysqlJobInfo, hcClient);
    }

    /**
     * 查询租户的实例配额
     * 获取指定租户的资源配额。
     *
     * @param ShowMysqlProjectQuotasRequest 请求对象
     * @return ShowMysqlProjectQuotasResponse
     */
    public ShowMysqlProjectQuotasResponse showMysqlProjectQuotas(ShowMysqlProjectQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     * 获取指定租户的资源配额。
     *
     * @param ShowMysqlProjectQuotasRequest 请求对象
     * @return SyncInvoker<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse>
     */
    public SyncInvoker<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse> showMysqlProjectQuotasInvoker(ShowMysqlProjectQuotasRequest request) {
        return new SyncInvoker<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse>(request, GaussDBMeta.showMysqlProjectQuotas, hcClient);
    }

    /**
     * 查询数据库代理信息
     * 查询数据库代理信息。
     *
     * @param ShowMysqlProxyRequest 请求对象
     * @return ShowMysqlProxyResponse
     */
    public ShowMysqlProxyResponse showMysqlProxy(ShowMysqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlProxy);
    }

    /**
     * 查询数据库代理信息
     * 查询数据库代理信息。
     *
     * @param ShowMysqlProxyRequest 请求对象
     * @return SyncInvoker<ShowMysqlProxyRequest, ShowMysqlProxyResponse>
     */
    public SyncInvoker<ShowMysqlProxyRequest, ShowMysqlProxyResponse> showMysqlProxyInvoker(ShowMysqlProxyRequest request) {
        return new SyncInvoker<ShowMysqlProxyRequest, ShowMysqlProxyResponse>(request, GaussDBMeta.showMysqlProxy, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     * 查询数据库代理规格信息。
     *
     * @param ShowMysqlProxyFlavorsRequest 请求对象
     * @return ShowMysqlProxyFlavorsResponse
     */
    public ShowMysqlProxyFlavorsResponse showMysqlProxyFlavors(ShowMysqlProxyFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     * 查询数据库代理规格信息。
     *
     * @param ShowMysqlProxyFlavorsRequest 请求对象
     * @return SyncInvoker<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse>
     */
    public SyncInvoker<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse> showMysqlProxyFlavorsInvoker(ShowMysqlProxyFlavorsRequest request) {
        return new SyncInvoker<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse>(request, GaussDBMeta.showMysqlProxyFlavors, hcClient);
    }

    /**
     * 查询租户基于企业项目的资源配额
     * 获取指定企业项目的资源配额。
     *
     * @param ShowMysqlQuotasRequest 请求对象
     * @return ShowMysqlQuotasResponse
     */
    public ShowMysqlQuotasResponse showMysqlQuotas(ShowMysqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showMysqlQuotas);
    }

    /**
     * 查询租户基于企业项目的资源配额
     * 获取指定企业项目的资源配额。
     *
     * @param ShowMysqlQuotasRequest 请求对象
     * @return SyncInvoker<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse>
     */
    public SyncInvoker<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse> showMysqlQuotasInvoker(ShowMysqlQuotasRequest request) {
        return new SyncInvoker<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse>(request, GaussDBMeta.showMysqlQuotas, hcClient);
    }

    /**
     * 修改备份策略
     * 修改备份策略
     *
     * @param UpdateMysqlBackupPolicyRequest 请求对象
     * @return UpdateMysqlBackupPolicyResponse
     */
    public UpdateMysqlBackupPolicyResponse updateMysqlBackupPolicy(UpdateMysqlBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateMysqlBackupPolicy);
    }

    /**
     * 修改备份策略
     * 修改备份策略
     *
     * @param UpdateMysqlBackupPolicyRequest 请求对象
     * @return SyncInvoker<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse>
     */
    public SyncInvoker<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse> updateMysqlBackupPolicyInvoker(UpdateMysqlBackupPolicyRequest request) {
        return new SyncInvoker<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse>(request, GaussDBMeta.updateMysqlBackupPolicy, hcClient);
    }

    /**
     * 修改实例名称
     * 修改实例名称
     *
     * @param UpdateMysqlInstanceNameRequest 请求对象
     * @return UpdateMysqlInstanceNameResponse
     */
    public UpdateMysqlInstanceNameResponse updateMysqlInstanceName(UpdateMysqlInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateMysqlInstanceName);
    }

    /**
     * 修改实例名称
     * 修改实例名称
     *
     * @param UpdateMysqlInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse>
     */
    public SyncInvoker<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse> updateMysqlInstanceNameInvoker(UpdateMysqlInstanceNameRequest request) {
        return new SyncInvoker<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse>(request, GaussDBMeta.updateMysqlInstanceName, hcClient);
    }

    /**
     * 修改租户基于企业项目的资源配额
     * 修改指定企业项目的资源配额。
     *
     * @param UpdateMysqlQuotasRequest 请求对象
     * @return UpdateMysqlQuotasResponse
     */
    public UpdateMysqlQuotasResponse updateMysqlQuotas(UpdateMysqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateMysqlQuotas);
    }

    /**
     * 修改租户基于企业项目的资源配额
     * 修改指定企业项目的资源配额。
     *
     * @param UpdateMysqlQuotasRequest 请求对象
     * @return SyncInvoker<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse>
     */
    public SyncInvoker<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse> updateMysqlQuotasInvoker(UpdateMysqlQuotasRequest request) {
        return new SyncInvoker<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse>(request, GaussDBMeta.updateMysqlQuotas, hcClient);
    }

}