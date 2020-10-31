package com.huaweicloud.sdk.eps.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * 创建企业项目。
     *
     * @param CreateEnterpriseProjectRequest 请求对象
     * @return CreateEnterpriseProjectResponse
     */
    public CreateEnterpriseProjectResponse createEnterpriseProject(CreateEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.createEnterpriseProject);
    }

    /**
     * 停用企业项目
     * 停用企业项目。
     *
     * @param DisableEnterpriseProjectRequest 请求对象
     * @return DisableEnterpriseProjectResponse
     */
    public DisableEnterpriseProjectResponse disableEnterpriseProject(DisableEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.disableEnterpriseProject);
    }

    /**
     * 启用企业项目
     * 启用企业项目。
     *
     * @param EnableEnterpriseProjectRequest 请求对象
     * @return EnableEnterpriseProjectResponse
     */
    public EnableEnterpriseProjectResponse enableEnterpriseProject(EnableEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.enableEnterpriseProject);
    }

    /**
     * 查询API版本列表
     * 查询企业项目的API版本列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.listApiVersions);
    }

    /**
     * 查询企业项目列表
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     *
     * @param ListEnterpriseProjectRequest 请求对象
     * @return ListEnterpriseProjectResponse
     */
    public ListEnterpriseProjectResponse listEnterpriseProject(ListEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.listEnterpriseProject);
    }

    /**
     * 迁移资源
     * 迁移资源到目标企业项目。
     *
     * @param MigrateResourceRequest 请求对象
     * @return MigrateResourceResponse
     */
    public MigrateResourceResponse migrateResource(MigrateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.migrateResource);
    }

    /**
     * 修改企业项目
     * 修改企业项目。当前仅支持修改名称和描述。
     *
     * @param ModifyEnterpriseProjectRequest 请求对象
     * @return ModifyEnterpriseProjectResponse
     */
    public ModifyEnterpriseProjectResponse modifyEnterpriseProject(ModifyEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.modifyEnterpriseProject);
    }

    /**
     * 查询API版本号详情
     * 查询指定的企业项目API版本号详情
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showApiVersion);
    }

    /**
     * 查询企业项目详情
     * 查询企业项目详情。
     *
     * @param ShowEnterpriseProjectRequest 请求对象
     * @return ShowEnterpriseProjectResponse
     */
    public ShowEnterpriseProjectResponse showEnterpriseProject(ShowEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showEnterpriseProject);
    }

    /**
     * 查询企业项目配额
     * 查询企业项目的配额信息。
     *
     * @param ShowEnterpriseProjectQuotaRequest 请求对象
     * @return ShowEnterpriseProjectQuotaResponse
     */
    public ShowEnterpriseProjectQuotaResponse showEnterpriseProjectQuota(ShowEnterpriseProjectQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showEnterpriseProjectQuota);
    }

    /**
     * 查询企业项目绑定的资源列表
     * 查询企业项目下绑定的资源详情。
     *
     * @param ShowResourceBindEnterpriseProjectRequest 请求对象
     * @return ShowResourceBindEnterpriseProjectResponse
     */
    public ShowResourceBindEnterpriseProjectResponse showResourceBindEnterpriseProject(ShowResourceBindEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showResourceBindEnterpriseProject);
    }

}