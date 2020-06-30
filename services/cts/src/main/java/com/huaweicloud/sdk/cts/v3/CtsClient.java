package com.huaweicloud.sdk.cts.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.cts.v3.model.*;

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

    public ListTracesResponse listTraces(ListTracesRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTraces);
    }

    public ListTrackersResponse listTrackers(ListTrackersRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTrackers);
    }

    public UpdateTrackerResponse updateTracker(UpdateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.updateTracker);
    }

}