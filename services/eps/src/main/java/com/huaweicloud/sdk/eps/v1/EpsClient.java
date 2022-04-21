package com.huaweicloud.sdk.eps.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eps.v1.model.*;

public class EpsClient {

    protected HcClient hcClient;

    public EpsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EpsClient> newBuilder() {
        return new ClientBuilder<>(EpsClient::new, "GlobalCredentials");
    }

    /**
     * 创建企业项目
     *
     * 创建企业项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEnterpriseProjectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse>
     */
    public SyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse> createEnterpriseProjectInvoker(
        CreateEnterpriseProjectRequest request) {
        return new SyncInvoker<CreateEnterpriseProjectRequest, CreateEnterpriseProjectResponse>(request,
            EpsMeta.createEnterpriseProject, hcClient);
    }

    /**
     * 停用企业项目
     *
     * 停用企业项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableEnterpriseProjectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse>
     */
    public SyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse> disableEnterpriseProjectInvoker(
        DisableEnterpriseProjectRequest request) {
        return new SyncInvoker<DisableEnterpriseProjectRequest, DisableEnterpriseProjectResponse>(request,
            EpsMeta.disableEnterpriseProject, hcClient);
    }

    /**
     * 启用企业项目
     *
     * 启用企业项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableEnterpriseProjectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse>
     */
    public SyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse> enableEnterpriseProjectInvoker(
        EnableEnterpriseProjectRequest request) {
        return new SyncInvoker<EnableEnterpriseProjectRequest, EnableEnterpriseProjectResponse>(request,
            EpsMeta.enableEnterpriseProject, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询企业项目的API版本列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, EpsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnterpriseProjectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse>
     */
    public SyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse> listEnterpriseProjectInvoker(
        ListEnterpriseProjectRequest request) {
        return new SyncInvoker<ListEnterpriseProjectRequest, ListEnterpriseProjectResponse>(request,
            EpsMeta.listEnterpriseProject, hcClient);
    }

    /**
     * 迁移资源
     *
     * 迁移资源到目标企业项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param MigrateResourceRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param MigrateResourceRequest 请求对象
     * @return SyncInvoker<MigrateResourceRequest, MigrateResourceResponse>
     */
    public SyncInvoker<MigrateResourceRequest, MigrateResourceResponse> migrateResourceInvoker(
        MigrateResourceRequest request) {
        return new SyncInvoker<MigrateResourceRequest, MigrateResourceResponse>(request, EpsMeta.migrateResource,
            hcClient);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的企业项目API版本号详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, EpsMeta.showApiVersion,
            hcClient);
    }

    /**
     * 查询企业项目详情
     *
     * 查询企业项目详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnterpriseProjectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>
     */
    public SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProjectInvoker(
        ShowEnterpriseProjectRequest request) {
        return new SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>(request,
            EpsMeta.showEnterpriseProject, hcClient);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目的配额信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnterpriseProjectQuotaRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnterpriseProjectQuotaRequest 请求对象
     * @return SyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse>
     */
    public SyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse> showEnterpriseProjectQuotaInvoker(
        ShowEnterpriseProjectQuotaRequest request) {
        return new SyncInvoker<ShowEnterpriseProjectQuotaRequest, ShowEnterpriseProjectQuotaResponse>(request,
            EpsMeta.showEnterpriseProjectQuota, hcClient);
    }

    /**
     * 查询企业项目绑定的资源列表
     *
     * 查询企业项目下绑定的资源详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceBindEnterpriseProjectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceBindEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse>
     */
    public SyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse> showResourceBindEnterpriseProjectInvoker(
        ShowResourceBindEnterpriseProjectRequest request) {
        return new SyncInvoker<ShowResourceBindEnterpriseProjectRequest, ShowResourceBindEnterpriseProjectResponse>(
            request, EpsMeta.showResourceBindEnterpriseProject, hcClient);
    }

    /**
     * 修改企业项目
     *
     * 修改企业项目。当前仅支持修改名称和描述。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateEnterpriseProjectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse>
     */
    public SyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse> updateEnterpriseProjectInvoker(
        UpdateEnterpriseProjectRequest request) {
        return new SyncInvoker<UpdateEnterpriseProjectRequest, UpdateEnterpriseProjectResponse>(request,
            EpsMeta.updateEnterpriseProject, hcClient);
    }

}
