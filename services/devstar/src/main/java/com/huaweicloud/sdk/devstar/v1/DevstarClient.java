package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.devstar.v1.model.*;

public class DevstarClient {
    protected HcClient hcClient;

    public DevstarClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevstarClient> newBuilder() {
        return new ClientBuilder<>(DevstarClient::new);
    }

    public RunTemplateJobV2Response runTemplateJobV2(RunTemplateJobV2Request request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.runTemplateJobV2);
    }

    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.showJobDetail);
    }

    public ListPublishedTemplatesResponse listPublishedTemplates(ListPublishedTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.listPublishedTemplates);
    }

    public ShowTemplateDetailResponse showTemplateDetail(ShowTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.showTemplateDetail);
    }

}