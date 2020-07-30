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


    public CompletableFuture<CreateEPResponse> createEPAsync(CreateEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.createEP);
    }

    public CompletableFuture<DisableEPResponse> disableEPAsync(DisableEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.disableEP);
    }

    public CompletableFuture<EnableEPResponse> enableEPAsync(EnableEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.enableEP);
    }

    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listApiVersions);
    }

    public CompletableFuture<ListEPResponse> listEPAsync(ListEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.listEP);
    }

    public CompletableFuture<MigrateResourceResponse> migrateResourceAsync(MigrateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.migrateResource);
    }

    public CompletableFuture<ModifyEPResponse> modifyEPAsync(ModifyEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.modifyEP);
    }

    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showApiVersion);
    }

    public CompletableFuture<ShowEPResponse> showEPAsync(ShowEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEP);
    }

    public CompletableFuture<ShowEPQuotaResponse> showEPQuotaAsync(ShowEPQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showEPQuota);
    }

    public CompletableFuture<ShowResourceBindEPResponse> showResourceBindEPAsync(ShowResourceBindEPRequest request) {
        return hcClient.asyncInvokeHttp(request, EpsMeta.showResourceBindEP);
    }

}