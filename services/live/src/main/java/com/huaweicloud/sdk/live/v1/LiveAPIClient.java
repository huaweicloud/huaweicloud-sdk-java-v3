package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.live.v1.model.*;

public class LiveAPIClient {
    protected HcClient hcClient;

    public LiveAPIClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveAPIClient> newBuilder() {
        return new ClientBuilder<>(LiveAPIClient::new);
    }

    public CreateRecordConfigResponse createRecordConfig(CreateRecordConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.createRecordConfig);
    }

    public CreateStreamForbiddenResponse createStreamForbidden(CreateStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.createStreamForbidden);
    }

    public CreateTranscodingsTemplateResponse createTranscodingsTemplate(CreateTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.createTranscodingsTemplate);
    }

    public DeleteRecordConfigResponse deleteRecordConfig(DeleteRecordConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.deleteRecordConfig);
    }

    public DeleteStreamForbiddenResponse deleteStreamForbidden(DeleteStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.deleteStreamForbidden);
    }

    public DeleteTranscodingsTemplateResponse deleteTranscodingsTemplate(DeleteTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.deleteTranscodingsTemplate);
    }

    public ListRecordConfigsResponse listRecordConfigs(ListRecordConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listRecordConfigs);
    }

    public ListStreamForbiddenResponse listStreamForbidden(ListStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listStreamForbidden);
    }

    public ShowBandwidthResponse showBandwidth(ShowBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.showBandwidth);
    }

    public ShowOnlineUsersResponse showOnlineUsers(ShowOnlineUsersRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.showOnlineUsers);
    }

    public ShowTrafficResponse showTraffic(ShowTrafficRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.showTraffic);
    }

    public ShowTranscodingsTemplateResponse showTranscodingsTemplate(ShowTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.showTranscodingsTemplate);
    }

    public UpdateStreamForbiddenResponse updateStreamForbidden(UpdateStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.updateStreamForbidden);
    }

    public UpdateTranscodingsTemplateResponse updateTranscodingsTemplate(UpdateTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.updateTranscodingsTemplate);
    }

}