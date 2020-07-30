package com.huaweicloud.sdk.cloudbuild.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.cloudbuild.v3.model.*;

public class CloudBuildClient {
    protected HcClient hcClient;

    public CloudBuildClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudBuildClient> newBuilder() {
        return new ClientBuilder<>(CloudBuildClient::new);
    }

    public RunJobResponse runJob(RunJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.runJob);
    }

    public ShowJobListByProjectIdResponse showJobListByProjectId(ShowJobListByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.showJobListByProjectId);
    }

    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudBuildMeta.showJobStatus);
    }

}