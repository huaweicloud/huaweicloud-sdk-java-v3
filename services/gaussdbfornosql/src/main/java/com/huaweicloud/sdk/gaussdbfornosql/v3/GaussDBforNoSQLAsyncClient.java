package com.huaweicloud.sdk.gaussdbfornosql.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class GaussDBforNoSQLAsyncClient {

    protected HcClient hcClient;

    public GaussDBforNoSQLAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforNoSQLAsyncClient> newBuilder() {
        return new ClientBuilder<>(GaussDBforNoSQLAsyncClient::new);
    }

    /** 应用参数模板 将参数模板应用到实例，可以指定一个或多个实例。
     *
     * @param ApplyConfigurationRequest 请求对象
     * @return CompletableFuture<ApplyConfigurationResponse> */
    public CompletableFuture<ApplyConfigurationResponse> applyConfigurationAsync(ApplyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.applyConfiguration);
    }

    /** 应用参数模板 将参数模板应用到实例，可以指定一个或多个实例。
     *
     * @param ApplyConfigurationRequest 请求对象
     * @return AsyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse> */
    public AsyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse> applyConfigurationAsyncInvoker(
        ApplyConfigurationRequest request) {
        return new AsyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse>(request,
            GaussDBforNoSQLMeta.applyConfiguration, hcClient);
    }

    /** 批量添加或删除资源标签 批量添加或删除指定数据库实例的标签。
     *
     * @param BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse> */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.batchTagAction);
    }

    /** 批量添加或删除资源标签 批量添加或删除指定数据库实例的标签。
     *
     * @param BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request,
            GaussDBforNoSQLMeta.batchTagAction, hcClient);
    }

    /** 创建参数模板 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse> */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createConfiguration);
    }

    /** 创建参数模板 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> */
    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(
        CreateConfigurationRequest request) {
        return new AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            GaussDBforNoSQLMeta.createConfiguration, hcClient);
    }

    /** 创建实例 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse> */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createInstance);
    }

    /** 创建实例 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request,
            GaussDBforNoSQLMeta.createInstance, hcClient);
    }

    /** 删除参数模板 删除指定参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse> */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteConfiguration);
    }

    /** 删除参数模板 删除指定参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            GaussDBforNoSQLMeta.deleteConfiguration, hcClient);
    }

    /** 删除实例 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse> */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteInstance);
    }

    /** 删除实例 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request,
            GaussDBforNoSQLMeta.deleteInstance, hcClient);
    }

    /** 扩容指定集群实例的节点数量 扩容指定集群实例的节点数量。
     *
     * @param ExpandInstanceNodeRequest 请求对象
     * @return CompletableFuture<ExpandInstanceNodeResponse> */
    public CompletableFuture<ExpandInstanceNodeResponse> expandInstanceNodeAsync(ExpandInstanceNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.expandInstanceNode);
    }

    /** 扩容指定集群实例的节点数量 扩容指定集群实例的节点数量。
     *
     * @param ExpandInstanceNodeRequest 请求对象
     * @return AsyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> */
    public AsyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNodeAsyncInvoker(
        ExpandInstanceNodeRequest request) {
        return new AsyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse>(request,
            GaussDBforNoSQLMeta.expandInstanceNode, hcClient);
    }

    /** 获取参数模板列表 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationTemplatesRequest 请求对象
     * @return CompletableFuture<ListConfigurationTemplatesResponse> */
    public CompletableFuture<ListConfigurationTemplatesResponse> listConfigurationTemplatesAsync(
        ListConfigurationTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationTemplates);
    }

    /** 获取参数模板列表 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationTemplatesRequest 请求对象
     * @return AsyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> */
    public AsyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> listConfigurationTemplatesAsyncInvoker(
        ListConfigurationTemplatesRequest request) {
        return new AsyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse>(request,
            GaussDBforNoSQLMeta.listConfigurationTemplates, hcClient);
    }

    /** 获取参数模板列表 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse> */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurations);
    }

    /** 获取参数模板列表 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            GaussDBforNoSQLMeta.listConfigurations, hcClient);
    }

    /** 查询指定实例类型的数据库版本信息 查询指定实例类型的数据库版本信息。
     *
     * @param ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse> */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDatastores);
    }

    /** 查询指定实例类型的数据库版本信息 查询指定实例类型的数据库版本信息。
     *
     * @param ListDatastoresRequest 请求对象
     * @return AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> */
    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(
        ListDatastoresRequest request) {
        return new AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request,
            GaussDBforNoSQLMeta.listDatastores, hcClient);
    }

    /** 查询专属资源列表 查询专属资源列表。
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return CompletableFuture<ListDedicatedResourcesResponse> */
    public CompletableFuture<ListDedicatedResourcesResponse> listDedicatedResourcesAsync(
        ListDedicatedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDedicatedResources);
    }

    /** 查询专属资源列表 查询专属资源列表。
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> */
    public AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResourcesAsyncInvoker(
        ListDedicatedResourcesRequest request) {
        return new AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>(request,
            GaussDBforNoSQLMeta.listDedicatedResources, hcClient);
    }

    /** 查询数据库规格 查询指定条件下的实例规格信息。
     *
     * @param ListFlavorInfosRequest 请求对象
     * @return CompletableFuture<ListFlavorInfosResponse> */
    public CompletableFuture<ListFlavorInfosResponse> listFlavorInfosAsync(ListFlavorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavorInfos);
    }

    /** 查询数据库规格 查询指定条件下的实例规格信息。
     *
     * @param ListFlavorInfosRequest 请求对象
     * @return AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> */
    public AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosAsyncInvoker(
        ListFlavorInfosRequest request) {
        return new AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>(request,
            GaussDBforNoSQLMeta.listFlavorInfos, hcClient);
    }

    /** 查询指定条件下的所有实例规格信息 查询指定条件下的所有实例规格信息。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse> */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavors);
    }

    /** 查询指定条件下的所有实例规格信息 查询指定条件下的所有实例规格信息。
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, GaussDBforNoSQLMeta.listFlavors,
            hcClient);
    }

    /** 查询资源标签 查询指定实例的标签信息。
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse> */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceTags);
    }

    /** 查询资源标签 查询指定实例的标签信息。
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstanceTags, hcClient);
    }

    /** 查询实例列表 根据指定条件查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse> */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstances);
    }

    /** 查询实例列表 根据指定条件查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse> */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, GaussDBforNoSQLMeta.listInstances,
            hcClient);
    }

    /** 查询资源实例 根据标签查询指定的数据库实例。
     *
     * @param ListInstancesByResourceTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByResourceTagsResponse> */
    public CompletableFuture<ListInstancesByResourceTagsResponse> listInstancesByResourceTagsAsync(
        ListInstancesByResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByResourceTags);
    }

    /** 查询资源实例 根据标签查询指定的数据库实例。
     *
     * @param ListInstancesByResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> */
    public AsyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> listInstancesByResourceTagsAsyncInvoker(
        ListInstancesByResourceTagsRequest request) {
        return new AsyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstancesByResourceTags, hcClient);
    }

    /** 查询资源实例 根据标签查询指定的数据库实例。
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagsResponse> */
    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByTags);
    }

    /** 查询资源实例 根据标签查询指定的数据库实例。
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> */
    public AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsAsyncInvoker(
        ListInstancesByTagsRequest request) {
        return new AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstancesByTags, hcClient);
    }

    /** 查询数据库慢日志 查询数据库慢日志信息。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse> */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listSlowLogs);
    }

    /** 查询数据库慢日志 查询数据库慢日志信息。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(
        ListSlowLogsRequest request) {
        return new AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, GaussDBforNoSQLMeta.listSlowLogs,
            hcClient);
    }

    /** 修改实例的管理员密码 修改实例的管理员密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse> */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resetPassword);
    }

    /** 修改实例的管理员密码 修改实例的管理员密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, GaussDBforNoSQLMeta.resetPassword,
            hcClient);
    }

    /** 变更实例规格 变更实例的规格。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse> */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstance);
    }

    /** 变更实例规格 变更实例的规格。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request,
            GaussDBforNoSQLMeta.resizeInstance, hcClient);
    }

    /** 扩容实例存储容量 扩容实例的存储容量大小。
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ResizeInstanceVolumeResponse> */
    public CompletableFuture<ResizeInstanceVolumeResponse> resizeInstanceVolumeAsync(
        ResizeInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstanceVolume);
    }

    /** 扩容实例存储容量 扩容实例的存储容量大小。
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> */
    public AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeAsyncInvoker(
        ResizeInstanceVolumeRequest request) {
        return new AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>(request,
            GaussDBforNoSQLMeta.resizeInstanceVolume, hcClient);
    }

    /** 设置自动备份策略 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse> */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.setBackupPolicy);
    }

    /** 设置自动备份策略 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(
        SetBackupPolicyRequest request) {
        return new AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request,
            GaussDBforNoSQLMeta.setBackupPolicy, hcClient);
    }

    /** 查询自动备份策略 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse> */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showBackupPolicy);
    }

    /** 查询自动备份策略 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(
        ShowBackupPolicyRequest request) {
        return new AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request,
            GaussDBforNoSQLMeta.showBackupPolicy, hcClient);
    }

    /** 获取指定参数模板的参数 获取指定参数模板的详细信息。
     *
     * @param ShowConfigurationDetailRequest 请求对象
     * @return CompletableFuture<ShowConfigurationDetailResponse> */
    public CompletableFuture<ShowConfigurationDetailResponse> showConfigurationDetailAsync(
        ShowConfigurationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showConfigurationDetail);
    }

    /** 获取指定参数模板的参数 获取指定参数模板的详细信息。
     *
     * @param ShowConfigurationDetailRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> */
    public AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailAsyncInvoker(
        ShowConfigurationDetailRequest request) {
        return new AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>(request,
            GaussDBforNoSQLMeta.showConfigurationDetail, hcClient);
    }

    /** 获取指定实例的参数模板 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse> */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(
        ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceConfiguration);
    }

    /** 获取指定实例的参数模板 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> */
    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(
        ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request,
            GaussDBforNoSQLMeta.showInstanceConfiguration, hcClient);
    }

    /** 查询配额 查询单租户在GaussDBforNoSQL服务下的资源配额。
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse> */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showQuotas);
    }

    /** 查询配额 查询单租户在GaussDBforNoSQL服务下的资源配额。
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, GaussDBforNoSQLMeta.showQuotas,
            hcClient);
    }

    /** 缩容指定集群实例的节点数量 缩容指定集群实例的节点数量。
     *
     * @param ShrinkInstanceNodeRequest 请求对象
     * @return CompletableFuture<ShrinkInstanceNodeResponse> */
    public CompletableFuture<ShrinkInstanceNodeResponse> shrinkInstanceNodeAsync(ShrinkInstanceNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.shrinkInstanceNode);
    }

    /** 缩容指定集群实例的节点数量 缩容指定集群实例的节点数量。
     *
     * @param ShrinkInstanceNodeRequest 请求对象
     * @return AsyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> */
    public AsyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNodeAsyncInvoker(
        ShrinkInstanceNodeRequest request) {
        return new AsyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse>(request,
            GaussDBforNoSQLMeta.shrinkInstanceNode, hcClient);
    }

    /** 修改参数模板参数 修改参数模板参数。
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationResponse> */
    public CompletableFuture<UpdateConfigurationResponse> updateConfigurationAsync(UpdateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateConfiguration);
    }

    /** 修改参数模板参数 修改参数模板参数。
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> */
    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(
        UpdateConfigurationRequest request) {
        return new AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            GaussDBforNoSQLMeta.updateConfiguration, hcClient);
    }

    /** 修改指定实例的参数 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationResponse> */
    public CompletableFuture<UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceConfiguration);
    }

    /** 修改指定实例的参数 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> */
    public AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request,
            GaussDBforNoSQLMeta.updateInstanceConfiguration, hcClient);
    }

    /** 修改实例名称 修改实例名称
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse> */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceName);
    }

    /** 修改实例名称 修改实例名称
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            GaussDBforNoSQLMeta.updateInstanceName, hcClient);
    }

    /** 变更实例安全组 变更实例关联的安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse> */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateSecurityGroup);
    }

    /** 变更实例安全组 变更实例关联的安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> */
    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(
        UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            GaussDBforNoSQLMeta.updateSecurityGroup, hcClient);
    }

    /** 查询当前支持的API版本信息列表 查询当前支持的API版本信息列表。
     *
     * @param ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse> */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listApiVersion);
    }

    /** 查询当前支持的API版本信息列表 查询当前支持的API版本信息列表。
     *
     * @param ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request,
            GaussDBforNoSQLMeta.listApiVersion, hcClient);
    }

    /** 查询指定API版本信息 查询指定API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse> */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showApiVersion);
    }

    /** 查询指定API版本信息 查询指定API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request,
            GaussDBforNoSQLMeta.showApiVersion, hcClient);
    }

}
