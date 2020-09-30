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
     * @param CreateEPRequest 请求对象
     * @return CreateEPResponse
     */
    public CreateEPResponse createEP(CreateEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.createEP);
    }

    /**
     * 停用企业项目
     * 停用企业项目。
     *
     * @param DisableEPRequest 请求对象
     * @return DisableEPResponse
     */
    public DisableEPResponse disableEP(DisableEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.disableEP);
    }

    /**
     * 启用企业项目
     * 启用企业项目。
     *
     * @param EnableEPRequest 请求对象
     * @return EnableEPResponse
     */
    public EnableEPResponse enableEP(EnableEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.enableEP);
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
     * @param ListEPRequest 请求对象
     * @return ListEPResponse
     */
    public ListEPResponse listEP(ListEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.listEP);
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
     * @param ModifyEPRequest 请求对象
     * @return ModifyEPResponse
     */
    public ModifyEPResponse modifyEP(ModifyEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.modifyEP);
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
     * @param ShowEPRequest 请求对象
     * @return ShowEPResponse
     */
    public ShowEPResponse showEP(ShowEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showEP);
    }

    /**
     * 查询企业项目配额
     * 查询企业项目的配额信息。
     *
     * @param ShowEPQuotaRequest 请求对象
     * @return ShowEPQuotaResponse
     */
    public ShowEPQuotaResponse showEPQuota(ShowEPQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showEPQuota);
    }

    /**
     * 查询企业项目绑定的资源列表
     * 查询企业项目下绑定的资源详情。
     *
     * @param ShowResourceBindEPRequest 请求对象
     * @return ShowResourceBindEPResponse
     */
    public ShowResourceBindEPResponse showResourceBindEP(ShowResourceBindEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showResourceBindEP);
    }

}