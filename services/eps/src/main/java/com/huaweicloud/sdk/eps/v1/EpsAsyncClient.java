package com.huaweicloud.sdk.eps.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

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
     * @param CreateEPRequest 请求对象
     * @return CompletableFuture<CreateEPResponse>
     */
    public CompletableFuture<CreateEPResponse> createEPAsync(CreateEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.createEP);
    }

    /**
     * 停用企业项目
     * 停用企业项目。
     *
     * @param DisableEPRequest 请求对象
     * @return CompletableFuture<DisableEPResponse>
     */
    public CompletableFuture<DisableEPResponse> disableEPAsync(DisableEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.disableEP);
    }

    /**
     * 启用企业项目
     * 启用企业项目。
     *
     * @param EnableEPRequest 请求对象
     * @return CompletableFuture<EnableEPResponse>
     */
    public CompletableFuture<EnableEPResponse> enableEPAsync(EnableEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.enableEP);
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
     * 查询企业项目列表
     * 查询当前用户已授权的企业项目列表，用户可以使用企业项目绑定资源。
     *
     * @param ListEPRequest 请求对象
     * @return CompletableFuture<ListEPResponse>
     */
    public CompletableFuture<ListEPResponse> listEPAsync(ListEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listEP);
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
     * 修改企业项目
     * 修改企业项目。当前仅支持修改名称和描述。
     *
     * @param ModifyEPRequest 请求对象
     * @return CompletableFuture<ModifyEPResponse>
     */
    public CompletableFuture<ModifyEPResponse> modifyEPAsync(ModifyEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.modifyEP);
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
     * 查询企业项目详情
     * 查询企业项目详情。
     *
     * @param ShowEPRequest 请求对象
     * @return CompletableFuture<ShowEPResponse>
     */
    public CompletableFuture<ShowEPResponse> showEPAsync(ShowEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEP);
    }

    /**
     * 查询企业项目配额
     * 查询企业项目的配额信息。
     *
     * @param ShowEPQuotaRequest 请求对象
     * @return CompletableFuture<ShowEPQuotaResponse>
     */
    public CompletableFuture<ShowEPQuotaResponse> showEPQuotaAsync(ShowEPQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEPQuota);
    }

    /**
     * 查询企业项目绑定的资源列表
     * 查询企业项目下绑定的资源详情。
     *
     * @param ShowResourceBindEPRequest 请求对象
     * @return CompletableFuture<ShowResourceBindEPResponse>
     */
    public CompletableFuture<ShowResourceBindEPResponse> showResourceBindEPAsync(ShowResourceBindEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showResourceBindEP);
    }

}