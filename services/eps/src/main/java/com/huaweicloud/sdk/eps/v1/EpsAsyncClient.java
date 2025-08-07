package com.huaweicloud.sdk.eps.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eps.v1.model.CreateEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.CreateEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.DeleteEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.DeleteEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.DisableEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.DisableEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.EnableEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.EnableEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.eps.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.eps.v1.model.ListEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ListEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.ListMigrationRecordRequest;
import com.huaweicloud.sdk.eps.v1.model.ListMigrationRecordResponse;
import com.huaweicloud.sdk.eps.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.eps.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.eps.v1.model.ListResourceMappingRequest;
import com.huaweicloud.sdk.eps.v1.model.ListResourceMappingResponse;
import com.huaweicloud.sdk.eps.v1.model.MigrateResourceRequest;
import com.huaweicloud.sdk.eps.v1.model.MigrateResourceResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowAssociatedResourcesRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowAssociatedResourcesResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectQuotaRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectQuotaResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowEpConfigsRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowEpConfigsResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowResourceBindEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowResourceBindEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.UpdateEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.UpdateEnterpriseProjectResponse;

import java.util.concurrent.CompletableFuture;

public class EpsAsyncClient {

    protected HcClient hcClient;

    public EpsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EpsAsyncClient> newBuilder() {
        ClientBuilder<EpsAsyncClient> clientBuilder = new ClientBuilder<>(EpsAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 创建企业项目
     *
     * 创建企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseProjectResponse>
     */
    public CompletableFuture<CreateEnterpriseProjectResponse> createEnterpriseProjectAsync(
        CreateEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.createEnterpriseProject);
    }

    /**
     * 创建企业项目
     *
     * 创建企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse>
     */
    public AsyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> createEnterpriseProjectAsyncInvoker(
        CreateEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.createEnterpriseProject, hcClient);
    }

    /**
     * 删除企业项目
     *
     * 删除企业项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<DeleteEnterpriseProjectResponse>
     */
    public CompletableFuture<DeleteEnterpriseProjectResponse> deleteEnterpriseProjectAsync(
        DeleteEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.deleteEnterpriseProject);
    }

    /**
     * 删除企业项目
     *
     * 删除企业项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<DeleteEnterpriseProjectRequest, DeleteEnterpriseProjectResponse>
     */
    public AsyncInvoker<DeleteEnterpriseProjectRequest, DeleteEnterpriseProjectResponse> deleteEnterpriseProjectAsyncInvoker(
        DeleteEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.deleteEnterpriseProject, hcClient);
    }

    /**
     * 停用企业项目
     *
     * 停用企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<DisableEnterpriseProjectResponse>
     */
    public CompletableFuture<DisableEnterpriseProjectResponse> disableEnterpriseProjectAsync(
        DisableEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.disableEnterpriseProject);
    }

    /**
     * 停用企业项目
     *
     * 停用企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse>
     */
    public AsyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> disableEnterpriseProjectAsyncInvoker(
        DisableEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.disableEnterpriseProject, hcClient);
    }

    /**
     * 启用企业项目
     *
     * 启用企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<EnableEnterpriseProjectResponse>
     */
    public CompletableFuture<EnableEnterpriseProjectResponse> enableEnterpriseProjectAsync(
        EnableEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.enableEnterpriseProject);
    }

    /**
     * 启用企业项目
     *
     * 启用企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse>
     */
    public AsyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> enableEnterpriseProjectAsyncInvoker(
        EnableEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.enableEnterpriseProject, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询企业项目的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询企业项目的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ListEnterpriseProjectResponse>
     */
    public CompletableFuture<ListEnterpriseProjectResponse> listEnterpriseProjectAsync(
        ListEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listEnterpriseProject);
    }

    /**
     * 查询企业项目列表
     *
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse>
     */
    public AsyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> listEnterpriseProjectAsyncInvoker(
        ListEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.listEnterpriseProject, hcClient);
    }

    /**
     * 查询资源迁移记录
     *
     * 查询资源迁移记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationRecordRequest 请求对象
     * @return CompletableFuture<ListMigrationRecordResponse>
     */
    public CompletableFuture<ListMigrationRecordResponse> listMigrationRecordAsync(ListMigrationRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listMigrationRecord);
    }

    /**
     * 查询资源迁移记录
     *
     * 查询资源迁移记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationRecordRequest 请求对象
     * @return AsyncInvoker<ListMigrationRecordRequest, ListMigrationRecordResponse>
     */
    public AsyncInvoker<ListMigrationRecordRequest, ListMigrationRecordResponse> listMigrationRecordAsyncInvoker(
        ListMigrationRecordRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.listMigrationRecord, hcClient);
    }

    /**
     * 查询企业项目支持的服务
     *
     * 查询企业项目支持的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return CompletableFuture<ListProvidersResponse>
     */
    public CompletableFuture<ListProvidersResponse> listProvidersAsync(ListProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listProviders);
    }

    /**
     * 查询企业项目支持的服务
     *
     * 查询企业项目支持的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return AsyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public AsyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersAsyncInvoker(
        ListProvidersRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.listProviders, hcClient);
    }

    /**
     * 查询资源类型映射
     *
     * 查询资源类型映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceMappingRequest 请求对象
     * @return CompletableFuture<ListResourceMappingResponse>
     */
    public CompletableFuture<ListResourceMappingResponse> listResourceMappingAsync(ListResourceMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listResourceMapping);
    }

    /**
     * 查询资源类型映射
     *
     * 查询资源类型映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceMappingRequest 请求对象
     * @return AsyncInvoker<ListResourceMappingRequest, ListResourceMappingResponse>
     */
    public AsyncInvoker<ListResourceMappingRequest, ListResourceMappingResponse> listResourceMappingAsyncInvoker(
        ListResourceMappingRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.listResourceMapping, hcClient);
    }

    /**
     * 迁移资源
     *
     * 迁移资源到目标企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateResourceRequest 请求对象
     * @return CompletableFuture<MigrateResourceResponse>
     */
    public CompletableFuture<MigrateResourceResponse> migrateResourceAsync(MigrateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.migrateResource);
    }

    /**
     * 迁移资源
     *
     * 迁移资源到目标企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateResourceRequest 请求对象
     * @return AsyncInvoker<MigrateResourceRequest, MigrateResourceResponse>
     */
    public AsyncInvoker<MigrateResourceRequest, MigrateResourceResponse> migrateResourceAsyncInvoker(
        MigrateResourceRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.migrateResource, hcClient);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的企业项目API版本号详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showApiVersion);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的企业项目API版本号详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.showApiVersion, hcClient);
    }

    /**
     * 查询关联资源
     *
     * 查询关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociatedResourcesRequest 请求对象
     * @return CompletableFuture<ShowAssociatedResourcesResponse>
     */
    public CompletableFuture<ShowAssociatedResourcesResponse> showAssociatedResourcesAsync(
        ShowAssociatedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showAssociatedResources);
    }

    /**
     * 查询关联资源
     *
     * 查询关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociatedResourcesRequest 请求对象
     * @return AsyncInvoker<ShowAssociatedResourcesRequest, ShowAssociatedResourcesResponse>
     */
    public AsyncInvoker<ShowAssociatedResourcesRequest, ShowAssociatedResourcesResponse> showAssociatedResourcesAsyncInvoker(
        ShowAssociatedResourcesRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.showAssociatedResources, hcClient);
    }

    /**
     * 查询企业项目详情
     *
     * 查询企业项目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ShowEnterpriseProjectResponse>
     */
    public CompletableFuture<ShowEnterpriseProjectResponse> showEnterpriseProjectAsync(
        ShowEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEnterpriseProject);
    }

    /**
     * 查询企业项目详情
     *
     * 查询企业项目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>
     */
    public AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProjectAsyncInvoker(
        ShowEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.showEnterpriseProject, hcClient);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectQuotaRequest 请求对象
     * @return CompletableFuture<ShowEnterpriseProjectQuotaResponse>
     */
    public CompletableFuture<ShowEnterpriseProjectQuotaResponse> showEnterpriseProjectQuotaAsync(
        ShowEnterpriseProjectQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEnterpriseProjectQuota);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectQuotaRequest 请求对象
     * @return AsyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse>
     */
    public AsyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> showEnterpriseProjectQuotaAsyncInvoker(
        ShowEnterpriseProjectQuotaRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.showEnterpriseProjectQuota, hcClient);
    }

    /**
     * 查询服务配置
     *
     * 查询服务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpConfigsRequest 请求对象
     * @return CompletableFuture<ShowEpConfigsResponse>
     */
    public CompletableFuture<ShowEpConfigsResponse> showEpConfigsAsync(ShowEpConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEpConfigs);
    }

    /**
     * 查询服务配置
     *
     * 查询服务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpConfigsRequest 请求对象
     * @return AsyncInvoker<ShowEpConfigsRequest, ShowEpConfigsResponse>
     */
    public AsyncInvoker<ShowEpConfigsRequest, ShowEpConfigsResponse> showEpConfigsAsyncInvoker(
        ShowEpConfigsRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.showEpConfigs, hcClient);
    }

    /**
     * 查询企业项目绑定的资源列表
     *
     * 查询企业项目下绑定的资源详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceBindEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ShowResourceBindEnterpriseProjectResponse>
     */
    public CompletableFuture<ShowResourceBindEnterpriseProjectResponse> showResourceBindEnterpriseProjectAsync(
        ShowResourceBindEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showResourceBindEnterpriseProject);
    }

    /**
     * 查询企业项目绑定的资源列表
     *
     * 查询企业项目下绑定的资源详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceBindEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse>
     */
    public AsyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> showResourceBindEnterpriseProjectAsyncInvoker(
        ShowResourceBindEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.showResourceBindEnterpriseProject, hcClient);
    }

    /**
     * 修改企业项目
     *
     * 修改企业项目。当前仅支持修改名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<UpdateEnterpriseProjectResponse>
     */
    public CompletableFuture<UpdateEnterpriseProjectResponse> updateEnterpriseProjectAsync(
        UpdateEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.updateEnterpriseProject);
    }

    /**
     * 修改企业项目
     *
     * 修改企业项目。当前仅支持修改名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse>
     */
    public AsyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> updateEnterpriseProjectAsyncInvoker(
        UpdateEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, EpsMeta.updateEnterpriseProject, hcClient);
    }

}
