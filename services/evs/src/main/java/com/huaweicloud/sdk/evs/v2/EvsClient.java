package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.evs.v2.model.*;

public class EvsClient {
    protected HcClient hcClient;

    public EvsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EvsClient> newBuilder() {
        return new ClientBuilder<>(EvsClient::new);
    }

    public BatchCreateVolumeTagsResponse batchCreateVolumeTags(BatchCreateVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchCreateVolumeTags);
    }

    public BatchDeleteVolumeTagsResponse batchDeleteVolumeTags(BatchDeleteVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchDeleteVolumeTags);
    }

    public CinderExportToImageResponse cinderExportToImage(CinderExportToImageRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderExportToImage);
    }

    public CinderListAvailabilityZonesResponse cinderListAvailabilityZones(CinderListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListAvailabilityZones);
    }

    public CinderListQuotasResponse cinderListQuotas(CinderListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListQuotas);
    }

    public CinderListVolumeTypesResponse cinderListVolumeTypes(CinderListVolumeTypesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListVolumeTypes);
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createSnapshot);
    }

    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createVolume);
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteSnapshot);
    }

    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteVolume);
    }

    public ListSnapshotsDetailsResponse listSnapshotsDetails(ListSnapshotsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshotsDetails);
    }

    public ListVolumeTagsResponse listVolumeTags(ListVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumeTags);
    }

    public ListVolumesByTagsResponse listVolumesByTags(ListVolumesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumesByTags);
    }

    public ListVolumesDetailsResponse listVolumesDetails(ListVolumesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumesDetails);
    }

    public ResizeVolumeResponse resizeVolume(ResizeVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.resizeVolume);
    }

    public RollbackSnapshotResponse rollbackSnapshot(RollbackSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.rollbackSnapshot);
    }

    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showJob);
    }

    public ShowSnapshotResponse showSnapshot(ShowSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showSnapshot);
    }

    public ShowVolumeResponse showVolume(ShowVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolume);
    }

    public ShowVolumeTagsResponse showVolumeTags(ShowVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolumeTags);
    }

    public UpdateSnapshotResponse updateSnapshot(UpdateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateSnapshot);
    }

    public UpdateVolumeResponse updateVolume(UpdateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateVolume);
    }

}