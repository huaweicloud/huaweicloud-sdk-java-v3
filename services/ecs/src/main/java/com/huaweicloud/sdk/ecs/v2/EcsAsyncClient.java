package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.ecs.v2.model.*;

public class EcsAsyncClient {
    protected HcClient hcClient;

    public EcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcsAsyncClient> newBuilder() {
        return new ClientBuilder<>(EcsAsyncClient::new);
    }


    public CompletableFuture<AddServerGroupMemberResponse> addServerGroupMemberAsync(AddServerGroupMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.addServerGroupMember);
    }

    public CompletableFuture<AttachServerVolumeResponse> attachServerVolumeAsync(AttachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.attachServerVolume);
    }

    public CompletableFuture<BatchAddServerNicsResponse> batchAddServerNicsAsync(BatchAddServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchAddServerNics);
    }

    public CompletableFuture<BatchCreateServerTagsResponse> batchCreateServerTagsAsync(BatchCreateServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchCreateServerTags);
    }

    public CompletableFuture<BatchDeleteServerNicsResponse> batchDeleteServerNicsAsync(BatchDeleteServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerNics);
    }

    public CompletableFuture<BatchDeleteServerTagsResponse> batchDeleteServerTagsAsync(BatchDeleteServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerTags);
    }

    public CompletableFuture<BatchRebootServersResponse> batchRebootServersAsync(BatchRebootServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchRebootServers);
    }

    public CompletableFuture<BatchStartServersResponse> batchStartServersAsync(BatchStartServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStartServers);
    }

    public CompletableFuture<BatchStopServersResponse> batchStopServersAsync(BatchStopServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStopServers);
    }

    public CompletableFuture<ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitAsync(ChangeServerOsWithCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeServerOsWithCloudInit);
    }

    public CompletableFuture<CreatePostPaidServersResponse> createPostPaidServersAsync(CreatePostPaidServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createPostPaidServers);
    }

    public CompletableFuture<CreateServerGroupResponse> createServerGroupAsync(CreateServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createServerGroup);
    }

    public CompletableFuture<CreateServersResponse> createServersAsync(CreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createServers);
    }

    public CompletableFuture<DeleteServerGroupResponse> deleteServerGroupAsync(DeleteServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerGroup);
    }

    public CompletableFuture<DeleteServerGroupMemberResponse> deleteServerGroupMemberAsync(DeleteServerGroupMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerGroupMember);
    }

    public CompletableFuture<DeleteServerMetadataResponse> deleteServerMetadataAsync(DeleteServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerMetadata);
    }

    public CompletableFuture<DeleteServersResponse> deleteServersAsync(DeleteServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServers);
    }

    public CompletableFuture<DetachServerVolumeResponse> detachServerVolumeAsync(DetachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.detachServerVolume);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listFlavors);
    }

    public CompletableFuture<ListResizeFlavorsResponse> listResizeFlavorsAsync(ListResizeFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listResizeFlavors);
    }

    public CompletableFuture<ListServerBlockDevicesResponse> listServerBlockDevicesAsync(ListServerBlockDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    public CompletableFuture<ListServerInterfacesResponse> listServerInterfacesAsync(ListServerInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerInterfaces);
    }

    public CompletableFuture<ListServersDetailsResponse> listServersDetailsAsync(ListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServersDetails);
    }

    public CompletableFuture<NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupAsync(NovaAssociateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaAssociateSecurityGroup);
    }

    public CompletableFuture<NovaCreateKeypairResponse> novaCreateKeypairAsync(NovaCreateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateKeypair);
    }

    public CompletableFuture<NovaCreateServersResponse> novaCreateServersAsync(NovaCreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateServers);
    }

    public CompletableFuture<NovaDeleteKeypairResponse> novaDeleteKeypairAsync(NovaDeleteKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteKeypair);
    }

    public CompletableFuture<NovaDeleteServerResponse> novaDeleteServerAsync(NovaDeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteServer);
    }

    public CompletableFuture<NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupAsync(NovaDisassociateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDisassociateSecurityGroup);
    }

    public CompletableFuture<NovaListAvailabilityZonesResponse> novaListAvailabilityZonesAsync(NovaListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListAvailabilityZones);
    }

    public CompletableFuture<NovaListKeypairsResponse> novaListKeypairsAsync(NovaListKeypairsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListKeypairs);
    }

    public CompletableFuture<NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsAsync(NovaListServerSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServerSecurityGroups);
    }

    public CompletableFuture<NovaListServersDetailsResponse> novaListServersDetailsAsync(NovaListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServersDetails);
    }

    public CompletableFuture<NovaShowServerResponse> novaShowServerAsync(NovaShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowServer);
    }

    public CompletableFuture<ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitAsync(ReinstallServerWithCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.reinstallServerWithCloudInit);
    }

    public CompletableFuture<ResetServerPasswordResponse> resetServerPasswordAsync(ResetServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resetServerPassword);
    }

    public CompletableFuture<ResizePostPaidServerResponse> resizePostPaidServerAsync(ResizePostPaidServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizePostPaidServer);
    }

    public CompletableFuture<ResizeServerResponse> resizeServerAsync(ResizeServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizeServer);
    }

    public CompletableFuture<ShowResetPasswordFlagResponse> showResetPasswordFlagAsync(ShowResetPasswordFlagRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showResetPasswordFlag);
    }

    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServer);
    }

    public CompletableFuture<ShowServerLimitsResponse> showServerLimitsAsync(ShowServerLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerLimits);
    }

    public CompletableFuture<ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsync(ShowServerRemoteConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerRemoteConsole);
    }

    public CompletableFuture<ShowServerTagsResponse> showServerTagsAsync(ShowServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerTags);
    }

    public CompletableFuture<UpdateServerResponse> updateServerAsync(UpdateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServer);
    }

    public CompletableFuture<UpdateServerMetadataResponse> updateServerMetadataAsync(UpdateServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerMetadata);
    }

    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showJob);
    }

}