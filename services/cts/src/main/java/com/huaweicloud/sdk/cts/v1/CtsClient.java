package com.huaweicloud.sdk.cts.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.cts.v1.model.*;

public class CtsClient {
    protected HcClient hcClient;

    public CtsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CtsClient> newBuilder() {
        return new ClientBuilder<>(CtsClient::new);
    }

    public CreateTrackerResponse createTracker(CreateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.createTracker);
    }

    public DeleteTrackerResponse deleteTracker(DeleteTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.deleteTracker);
    }

    public ListTracesV2Response listTracesV2(ListTracesV2Request request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTracesV2);
    }

    public ListTrackerResponse listTracker(ListTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTracker);
    }

    public UpdateTrackerResponse updateTracker(UpdateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.updateTracker);
    }

}