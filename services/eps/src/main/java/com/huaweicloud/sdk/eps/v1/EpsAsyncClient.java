package com.huaweicloud.sdk.eps.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eps.v1.model.*;

public class EpsAsyncClient {
    protected HcClient hcClient;

    public EpsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EpsAsyncClient> newBuilder() {
        return new ClientBuilder<>(EpsAsyncClient::new, "GlobalCredentials");
    }


    /**
     * 创建企业项目
     * 创建企业项目。
     *
     * @param CreateEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseProjectResponse>
     */
    public CompletableFuture<CreateEnterpriseProjectResponse> createEnterpriseProjectAsync(CreateEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.createEnterpriseProject);
    }

    /**
     * 创建企业项目
     * 创建企业项目。
     *
     * @param CreateEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse>
     */
    public AsyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> createEnterpriseProjectAsyncInvoker(CreateEnterpriseProjectRequest request) {
        return new AsyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse>(request, EpsMeta.createEnterpriseProject, hcClient);
    }

    /**
     * 停用企业项目
     * 停用企业项目。
     *
     * @param DisableEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<DisableEnterpriseProjectResponse>
     */
    public CompletableFuture<DisableEnterpriseProjectResponse> disableEnterpriseProjectAsync(DisableEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.disableEnterpriseProject);
    }

    /**
     * 停用企业项目
     * 停用企业项目。
     *
     * @param DisableEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse>
     */
    public AsyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> disableEnterpriseProjectAsyncInvoker(DisableEnterpriseProjectRequest request) {
        return new AsyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse>(request, EpsMeta.disableEnterpriseProject, hcClient);
    }

    /**
     * 启用企业项目
     * 启用企业项目。
     *
     * @param EnableEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<EnableEnterpriseProjectResponse>
     */
    public CompletableFuture<EnableEnterpriseProjectResponse> enableEnterpriseProjectAsync(EnableEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.enableEnterpriseProject);
    }

    /**
     * 启用企业项目
     * 启用企业项目。
     *
     * @param EnableEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse>
     */
    public AsyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> enableEnterpriseProjectAsyncInvoker(EnableEnterpriseProjectRequest request) {
        return new AsyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse>(request, EpsMeta.enableEnterpriseProject, hcClient);
    }

    /**
     * 查询API版本列表
     * 查询企业项目的API版本列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     * 查询企业项目的API版本列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, EpsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询企业项目列表
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     *
     * @param ListEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ListEnterpriseProjectResponse>
     */
    public CompletableFuture<ListEnterpriseProjectResponse> listEnterpriseProjectAsync(ListEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listEnterpriseProject);
    }

    /**
     * 查询企业项目列表
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     *
     * @param ListEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse>
     */
    public AsyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> listEnterpriseProjectAsyncInvoker(ListEnterpriseProjectRequest request) {
        return new AsyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse>(request, EpsMeta.listEnterpriseProject, hcClient);
    }

    /**
     * 迁移资源
     * 迁移资源到目标企业项目。
     *
     * @param MigrateResourceRequest 请求对象
     * @return CompletableFuture<MigrateResourceResponse>
     */
    public CompletableFuture<MigrateResourceResponse> migrateResourceAsync(MigrateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.migrateResource);
    }

    /**
     * 迁移资源
     * 迁移资源到目标企业项目。
     *
     * @param MigrateResourceRequest 请求对象
     * @return AsyncInvoker<MigrateResourceRequest, MigrateResourceResponse>
     */
    public AsyncInvoker<MigrateResourceRequest, MigrateResourceResponse> migrateResourceAsyncInvoker(MigrateResourceRequest request) {
        return new AsyncInvoker<MigrateResourceRequest, MigrateResourceResponse>(request, EpsMeta.migrateResource, hcClient);
    }

    /**
     * 查询API版本号详情
     * 查询指定的企业项目API版本号详情
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showApiVersion);
    }

    /**
     * 查询API版本号详情
     * 查询指定的企业项目API版本号详情
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, EpsMeta.showApiVersion, hcClient);
    }

    /**
     * 查询企业项目详情
     * 查询企业项目详情。
     *
     * @param ShowEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ShowEnterpriseProjectResponse>
     */
    public CompletableFuture<ShowEnterpriseProjectResponse> showEnterpriseProjectAsync(ShowEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEnterpriseProject);
    }

    /**
     * 查询企业项目详情
     * 查询企业项目详情。
     *
     * @param ShowEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>
     */
    public AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProjectAsyncInvoker(ShowEnterpriseProjectRequest request) {
        return new AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>(request, EpsMeta.showEnterpriseProject, hcClient);
    }

    /**
     * 查询企业项目配额
     * 查询企业项目的配额信息。
     *
     * @param ShowEnterpriseProjectQuotaRequest 请求对象
     * @return CompletableFuture<ShowEnterpriseProjectQuotaResponse>
     */
    public CompletableFuture<ShowEnterpriseProjectQuotaResponse> showEnterpriseProjectQuotaAsync(ShowEnterpriseProjectQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEnterpriseProjectQuota);
    }

    /**
     * 查询企业项目配额
     * 查询企业项目的配额信息。
     *
     * @param ShowEnterpriseProjectQuotaRequest 请求对象
     * @return AsyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse>
     */
    public AsyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> showEnterpriseProjectQuotaAsyncInvoker(ShowEnterpriseProjectQuotaRequest request) {
        return new AsyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse>(request, EpsMeta.showEnterpriseProjectQuota, hcClient);
    }

    /**
     * 查询企业项目绑定的资源列表
     * 查询企业项目下绑定的资源详情。
     *
     * @param ShowResourceBindEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ShowResourceBindEnterpriseProjectResponse>
     */
    public CompletableFuture<ShowResourceBindEnterpriseProjectResponse> showResourceBindEnterpriseProjectAsync(ShowResourceBindEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showResourceBindEnterpriseProject);
    }

    /**
     * 查询企业项目绑定的资源列表
     * 查询企业项目下绑定的资源详情。
     *
     * @param ShowResourceBindEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse>
     */
    public AsyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> showResourceBindEnterpriseProjectAsyncInvoker(ShowResourceBindEnterpriseProjectRequest request) {
        return new AsyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse>(request, EpsMeta.showResourceBindEnterpriseProject, hcClient);
    }

    /**
     * 修改企业项目
     * 修改企业项目。当前仅支持修改名称和描述。
     *
     * @param UpdateEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<UpdateEnterpriseProjectResponse>
     */
    public CompletableFuture<UpdateEnterpriseProjectResponse> updateEnterpriseProjectAsync(UpdateEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.updateEnterpriseProject);
    }

    /**
     * 修改企业项目
     * 修改企业项目。当前仅支持修改名称和描述。
     *
     * @param UpdateEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse>
     */
    public AsyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> updateEnterpriseProjectAsyncInvoker(UpdateEnterpriseProjectRequest request) {
        return new AsyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse>(request, EpsMeta.updateEnterpriseProject, hcClient);
    }

}