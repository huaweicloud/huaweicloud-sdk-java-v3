package com.huaweicloud.sdk.eps.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eps.v1.model.CreateEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.CreateEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.DisableEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.DisableEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.EnableEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.EnableEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.eps.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.eps.v1.model.ListEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ListEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.eps.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.eps.v1.model.MigrateResourceRequest;
import com.huaweicloud.sdk.eps.v1.model.MigrateResourceResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectQuotaRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectQuotaResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.ShowResourceBindEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.ShowResourceBindEnterpriseProjectResponse;
import com.huaweicloud.sdk.eps.v1.model.UpdateEnterpriseProjectRequest;
import com.huaweicloud.sdk.eps.v1.model.UpdateEnterpriseProjectResponse;

public class EpsClient {

    protected HcClient hcClient;

    public EpsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EpsClient> newBuilder() {
        ClientBuilder<EpsClient> clientBuilder = new ClientBuilder<>(EpsClient::new, "GlobalCredentials");
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
     * @return CreateEnterpriseProjectResponse
     */
    public CreateEnterpriseProjectResponse createEnterpriseProject(CreateEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.createEnterpriseProject);
    }

    /**
     * 创建企业项目
     *
     * 创建企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse>
     */
    public SyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> createEnterpriseProjectInvoker(
        CreateEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, EpsMeta.createEnterpriseProject, hcClient);
    }

    /**
     * 停用企业项目
     *
     * 停用企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableEnterpriseProjectRequest 请求对象
     * @return DisableEnterpriseProjectResponse
     */
    public DisableEnterpriseProjectResponse disableEnterpriseProject(DisableEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.disableEnterpriseProject);
    }

    /**
     * 停用企业项目
     *
     * 停用企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse>
     */
    public SyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> disableEnterpriseProjectInvoker(
        DisableEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, EpsMeta.disableEnterpriseProject, hcClient);
    }

    /**
     * 启用企业项目
     *
     * 启用企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableEnterpriseProjectRequest 请求对象
     * @return EnableEnterpriseProjectResponse
     */
    public EnableEnterpriseProjectResponse enableEnterpriseProject(EnableEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.enableEnterpriseProject);
    }

    /**
     * 启用企业项目
     *
     * 启用企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse>
     */
    public SyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> enableEnterpriseProjectInvoker(
        EnableEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, EpsMeta.enableEnterpriseProject, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询企业项目的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询企业项目的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, EpsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectRequest 请求对象
     * @return ListEnterpriseProjectResponse
     */
    public ListEnterpriseProjectResponse listEnterpriseProject(ListEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.listEnterpriseProject);
    }

    /**
     * 查询企业项目列表
     *
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse>
     */
    public SyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> listEnterpriseProjectInvoker(
        ListEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, EpsMeta.listEnterpriseProject, hcClient);
    }

    /**
     * 查询企业项目支持的服务
     *
     * 查询企业项目支持的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return ListProvidersResponse
     */
    public ListProvidersResponse listProviders(ListProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.listProviders);
    }

    /**
     * 查询企业项目支持的服务
     *
     * 查询企业项目支持的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return SyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public SyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersInvoker(ListProvidersRequest request) {
        return new SyncInvoker<>(request, EpsMeta.listProviders, hcClient);
    }

    /**
     * 迁移资源
     *
     * 迁移资源到目标企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateResourceRequest 请求对象
     * @return MigrateResourceResponse
     */
    public MigrateResourceResponse migrateResource(MigrateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.migrateResource);
    }

    /**
     * 迁移资源
     *
     * 迁移资源到目标企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateResourceRequest 请求对象
     * @return SyncInvoker<MigrateResourceRequest, MigrateResourceResponse>
     */
    public SyncInvoker<MigrateResourceRequest, MigrateResourceResponse> migrateResourceInvoker(
        MigrateResourceRequest request) {
        return new SyncInvoker<>(request, EpsMeta.migrateResource, hcClient);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的企业项目API版本号详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showApiVersion);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的企业项目API版本号详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<>(request, EpsMeta.showApiVersion, hcClient);
    }

    /**
     * 查询企业项目详情
     *
     * 查询企业项目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectRequest 请求对象
     * @return ShowEnterpriseProjectResponse
     */
    public ShowEnterpriseProjectResponse showEnterpriseProject(ShowEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showEnterpriseProject);
    }

    /**
     * 查询企业项目详情
     *
     * 查询企业项目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>
     */
    public SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProjectInvoker(
        ShowEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, EpsMeta.showEnterpriseProject, hcClient);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectQuotaRequest 请求对象
     * @return ShowEnterpriseProjectQuotaResponse
     */
    public ShowEnterpriseProjectQuotaResponse showEnterpriseProjectQuota(ShowEnterpriseProjectQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showEnterpriseProjectQuota);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectQuotaRequest 请求对象
     * @return SyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse>
     */
    public SyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> showEnterpriseProjectQuotaInvoker(
        ShowEnterpriseProjectQuotaRequest request) {
        return new SyncInvoker<>(request, EpsMeta.showEnterpriseProjectQuota, hcClient);
    }

    /**
     * 查询企业项目绑定的资源列表
     *
     * 查询企业项目下绑定的资源详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceBindEnterpriseProjectRequest 请求对象
     * @return ShowResourceBindEnterpriseProjectResponse
     */
    public ShowResourceBindEnterpriseProjectResponse showResourceBindEnterpriseProject(
        ShowResourceBindEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showResourceBindEnterpriseProject);
    }

    /**
     * 查询企业项目绑定的资源列表
     *
     * 查询企业项目下绑定的资源详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceBindEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse>
     */
    public SyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> showResourceBindEnterpriseProjectInvoker(
        ShowResourceBindEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, EpsMeta.showResourceBindEnterpriseProject, hcClient);
    }

    /**
     * 修改企业项目
     *
     * 修改企业项目。当前仅支持修改名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseProjectRequest 请求对象
     * @return UpdateEnterpriseProjectResponse
     */
    public UpdateEnterpriseProjectResponse updateEnterpriseProject(UpdateEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.updateEnterpriseProject);
    }

    /**
     * 修改企业项目
     *
     * 修改企业项目。当前仅支持修改名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse>
     */
    public SyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> updateEnterpriseProjectInvoker(
        UpdateEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, EpsMeta.updateEnterpriseProject, hcClient);
    }

}
