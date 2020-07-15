package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.tms.v1.model.*;

public class TmsClient {
    protected HcClient hcClient;

    public TmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TmsClient> newBuilder() {
        return new ClientBuilder<>(TmsClient::new);
    }

    public CreatePredefineTagsResponse createPredefineTags(CreatePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.createPredefineTags);
    }

    public DeletePredefineTagsResponse deletePredefineTags(DeletePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.deletePredefineTags);
    }

    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listApiVersions);
    }

    public ListPredefineTagsResponse listPredefineTags(ListPredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listPredefineTags);
    }

    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showApiVersion);
    }

    public UpdatePredefineTagsResponse updatePredefineTags(UpdatePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.updatePredefineTags);
    }

}