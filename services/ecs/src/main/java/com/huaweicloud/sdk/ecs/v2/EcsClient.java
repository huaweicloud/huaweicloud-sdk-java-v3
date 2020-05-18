package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.ecs.v2.model.*;

public class EcsClient {
    protected HcClient hcClient;

    public EcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcsClient> newBuilder() {
        return new ClientBuilder<>(EcsClient::new);
    }

    public AttachServerVolumeResponse attachServerVolume(AttachServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.attachServerVolume);
    }

    public BatchAddServerNicsResponse batchAddServerNics(BatchAddServerNicsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchAddServerNics);
    }

    public BatchCreateServerTagsResponse batchCreateServerTags(BatchCreateServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchCreateServerTags);
    }

    public BatchDeleteServerNicsResponse batchDeleteServerNics(BatchDeleteServerNicsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchDeleteServerNics);
    }

    public BatchDeleteServerTagsResponse batchDeleteServerTags(BatchDeleteServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchDeleteServerTags);
    }

    public BatchRebootServersResponse batchRebootServers(BatchRebootServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchRebootServers);
    }

    public BatchStartServersResponse batchStartServers(BatchStartServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchStartServers);
    }

    public BatchStopServersResponse batchStopServers(BatchStopServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.batchStopServers);
    }

    public CreatePostPaidServersResponse createPostPaidServers(CreatePostPaidServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.createPostPaidServers);
    }

    public DeleteServersResponse deleteServers(DeleteServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.deleteServers);
    }

    public DetachServerVolumeResponse detachServerVolume(DetachServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.detachServerVolume);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listFlavors);
    }

    public ListServerBlockDevicesResponse listServerBlockDevices(ListServerBlockDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    public ListServerInterfacesResponse listServerInterfaces(ListServerInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServerInterfaces);
    }

    public ListServersDetailsResponse listServersDetails(ListServersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.listServersDetails);
    }

    public NovaCreateServersResponse novaCreateServers(NovaCreateServersRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaCreateServers);
    }

    public NovaDeleteServerResponse novaDeleteServer(NovaDeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaDeleteServer);
    }

    public NovaListServersDetailsResponse novaListServersDetails(NovaListServersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaListServersDetails);
    }

    public NovaShowServerResponse novaShowServer(NovaShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.novaShowServer);
    }

    public ResizePostPaidServerResponse resizePostPaidServer(ResizePostPaidServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.resizePostPaidServer);
    }

    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServer);
    }

    public ShowServerTagsResponse showServerTags(ShowServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showServerTags);
    }

    public UpdateServerResponse updateServer(UpdateServerRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.updateServer);
    }

    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EcsMeta.showJob);
    }

}