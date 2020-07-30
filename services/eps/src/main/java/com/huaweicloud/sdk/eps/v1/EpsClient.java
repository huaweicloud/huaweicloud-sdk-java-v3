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

    public CreateEPResponse createEP(CreateEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.createEP);
    }

    public DisableEPResponse disableEP(DisableEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.disableEP);
    }

    public EnableEPResponse enableEP(EnableEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.enableEP);
    }

    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.listApiVersions);
    }

    public ListEPResponse listEP(ListEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.listEP);
    }

    public MigrateResourceResponse migrateResource(MigrateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.migrateResource);
    }

    public ModifyEPResponse modifyEP(ModifyEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.modifyEP);
    }

    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showApiVersion);
    }

    public ShowEPResponse showEP(ShowEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showEP);
    }

    public ShowEPQuotaResponse showEPQuota(ShowEPQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showEPQuota);
    }

    public ShowResourceBindEPResponse showResourceBindEP(ShowResourceBindEPRequest request) {
        return hcClient.syncInvokeHttp(request, EpsMeta.showResourceBindEP);
    }

}