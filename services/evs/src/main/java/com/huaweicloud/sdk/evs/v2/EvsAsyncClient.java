package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.evs.v2.model.*;

public class EvsAsyncClient {
    protected HcClient hcClient;

    public EvsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EvsAsyncClient> newBuilder() {
        return new ClientBuilder<>(EvsAsyncClient::new);
    }


    public CompletableFuture<BatchCreateVolumeTagsResponse> batchCreateVolumeTagsAsync(BatchCreateVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchCreateVolumeTags);
    }

    public CompletableFuture<BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsAsync(BatchDeleteVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchDeleteVolumeTags);
    }

    public CompletableFuture<CinderExportToImageResponse> cinderExportToImageAsync(CinderExportToImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderExportToImage);
    }

    public CompletableFuture<CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesAsync(CinderListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListAvailabilityZones);
    }

    public CompletableFuture<CinderListQuotasResponse> cinderListQuotasAsync(CinderListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListQuotas);
    }

    public CompletableFuture<CinderListVolumeTypesResponse> cinderListVolumeTypesAsync(CinderListVolumeTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListVolumeTypes);
    }

    public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createSnapshot);
    }

    public CompletableFuture<CreateVolumeResponse> createVolumeAsync(CreateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createVolume);
    }

    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshotAsync(DeleteSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteSnapshot);
    }

    public CompletableFuture<DeleteVolumeResponse> deleteVolumeAsync(DeleteVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteVolume);
    }

    public CompletableFuture<ListSnapshotsDetailsResponse> listSnapshotsDetailsAsync(ListSnapshotsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshotsDetails);
    }

    public CompletableFuture<ListVolumeTagsResponse> listVolumeTagsAsync(ListVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumeTags);
    }

    public CompletableFuture<ListVolumesByTagsResponse> listVolumesByTagsAsync(ListVolumesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumesByTags);
    }

    public CompletableFuture<ListVolumesDetailsResponse> listVolumesDetailsAsync(ListVolumesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumesDetails);
    }

    public CompletableFuture<ResizeVolumeResponse> resizeVolumeAsync(ResizeVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.resizeVolume);
    }

    public CompletableFuture<RollbackSnapshotResponse> rollbackSnapshotAsync(RollbackSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.rollbackSnapshot);
    }

    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showJob);
    }

    public CompletableFuture<ShowSnapshotResponse> showSnapshotAsync(ShowSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showSnapshot);
    }

    public CompletableFuture<ShowVolumeResponse> showVolumeAsync(ShowVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolume);
    }

    public CompletableFuture<ShowVolumeTagsResponse> showVolumeTagsAsync(ShowVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolumeTags);
    }

    public CompletableFuture<UpdateSnapshotResponse> updateSnapshotAsync(UpdateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateSnapshot);
    }

    public CompletableFuture<UpdateVolumeResponse> updateVolumeAsync(UpdateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateVolume);
    }

}