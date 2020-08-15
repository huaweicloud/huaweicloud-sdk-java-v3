package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.cloudide.v2.model.*;

public class CloudideClient {
    protected HcClient hcClient;

    public CloudideClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudideClient> newBuilder() {
        return new ClientBuilder<>(CloudideClient::new);
    }

    public ListProjectTemplatesResponse listProjectTemplates(ListProjectTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.listProjectTemplates);
    }

    public ListStacksByTagResponse listStacksByTag(ListStacksByTagRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.listStacksByTag);
    }

    public ShowPriceResponse showPrice(ShowPriceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.showPrice);
    }

    public CheckNameResponse checkName(CheckNameRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.checkName);
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.createInstance);
    }

    public CreateInstanceBy3rdResponse createInstanceBy3rd(CreateInstanceBy3rdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.createInstanceBy3rd);
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.deleteInstance);
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.listInstances);
    }

    public ListOrgInstancesResponse listOrgInstances(ListOrgInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.listOrgInstances);
    }

    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.showInstance);
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.startInstance);
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.stopInstance);
    }

    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.updateInstance);
    }

}