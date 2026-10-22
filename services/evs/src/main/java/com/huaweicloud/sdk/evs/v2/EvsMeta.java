package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.evs.v2.model.AssociateAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.AssociateAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateResourceTagsRequestBody;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateSnapshotGroupTagRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateSnapshotGroupTagResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateSnapshotTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateSnapshotTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsRequestBody;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteResourceTagsRequestBody;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteSnapshotGroupTagRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteSnapshotGroupTagResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteSnapshotTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteSnapshotTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsRequestBody;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchResizeVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.BatchResizeVolumesRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchResizeVolumesResponse;
import com.huaweicloud.sdk.evs.v2.model.ChangeVolumeChargeModeRequest;
import com.huaweicloud.sdk.evs.v2.model.ChangeVolumeChargeModeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ChangeVolumeChargeModeResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderAcceptVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderAcceptVolumeTransferRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CinderAcceptVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderCreateVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderCreateVolumeTransferRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CinderCreateVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderDeleteVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderDeleteVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListAvailabilityZonesRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListAvailabilityZonesResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListQuotasRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListQuotasResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTransfersRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTransfersResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTypesRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTypesResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderShowVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderShowVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CountAutoSnapshotPoliciesRequest;
import com.huaweicloud.sdk.evs.v2.model.CountAutoSnapshotPoliciesResponse;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotChainsRequest;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotChainsResponse;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotsGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotsGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotsRequest;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotsResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotGroupRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotPolicyRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateStandardSnapshotRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CreateStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeInRecycleRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeInRecycleResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.DisassociateAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.DisassociateAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.ListAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.ListAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotChainsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotChainsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotGroupTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotGroupTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsDetailsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsDetailsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVersionsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVersionsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesInRecycleRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesInRecycleResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesResponse;
import com.huaweicloud.sdk.evs.v2.model.ModifyRecycleBinPolicyRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSRequest;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSResponse;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.RevertVolumeInRecycleRequest;
import com.huaweicloud.sdk.evs.v2.model.RevertVolumeInRecycleResponse;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotRequestBody;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotRequestBodyV5;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.RollbackStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.RollbackStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeInRecycleRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeInRecycleResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribePostpaidVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribePostpaidVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribeVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateRecyclePolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateRecyclePolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotGroupRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotPolicyRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequestBodyV5;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class EvsMeta {

    public static final HttpRequestDef<AssociateAutoSnapshotPolicyRequest, AssociateAutoSnapshotPolicyResponse> associateAutoSnapshotPolicy =
        genForAssociateAutoSnapshotPolicy();

    private static HttpRequestDef<AssociateAutoSnapshotPolicyRequest, AssociateAutoSnapshotPolicyResponse> genForAssociateAutoSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<AssociateAutoSnapshotPolicyRequest, AssociateAutoSnapshotPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateAutoSnapshotPolicyRequest.class,
                    AssociateAutoSnapshotPolicyResponse.class)
                .withName("AssociateAutoSnapshotPolicy")
                .withUri("/v5/{project_id}/snapshot-policies/{snapshot_policy_id}/associate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAutoSnapshotPolicyRequest::getSnapshotPolicyId,
                AssociateAutoSnapshotPolicyRequest::setSnapshotPolicyId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(AssociateAutoSnapshotPolicyRequest::getBody,
                    AssociateAutoSnapshotPolicyRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSnapshotGroupTagRequest, BatchCreateSnapshotGroupTagResponse> batchCreateSnapshotGroupTag =
        genForBatchCreateSnapshotGroupTag();

    private static HttpRequestDef<BatchCreateSnapshotGroupTagRequest, BatchCreateSnapshotGroupTagResponse> genForBatchCreateSnapshotGroupTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateSnapshotGroupTagRequest, BatchCreateSnapshotGroupTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateSnapshotGroupTagRequest.class,
                    BatchCreateSnapshotGroupTagResponse.class)
                .withName("BatchCreateSnapshotGroupTag")
                .withUri("/v5/{project_id}/snapshot-groups/{snapshot_group_id}/tags/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateSnapshotGroupTagRequest::getSnapshotGroupId,
                BatchCreateSnapshotGroupTagRequest::setSnapshotGroupId));
        builder.<BatchCreateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateSnapshotGroupTagRequest::getBody,
                BatchCreateSnapshotGroupTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSnapshotTagsRequest, BatchCreateSnapshotTagsResponse> batchCreateSnapshotTags =
        genForBatchCreateSnapshotTags();

    private static HttpRequestDef<BatchCreateSnapshotTagsRequest, BatchCreateSnapshotTagsResponse> genForBatchCreateSnapshotTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateSnapshotTagsRequest, BatchCreateSnapshotTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateSnapshotTagsRequest.class, BatchCreateSnapshotTagsResponse.class)
            .withName("BatchCreateSnapshotTags")
            .withUri("/v5/{project_id}/snapshots/{snapshot_id}/tags/create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateSnapshotTagsRequest::getSnapshotId,
                BatchCreateSnapshotTagsRequest::setSnapshotId));
        builder.<BatchCreateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateSnapshotTagsRequest::getBody, BatchCreateSnapshotTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTags =
        genForBatchCreateVolumeTags();

    private static HttpRequestDef<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> genForBatchCreateVolumeTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateVolumeTagsRequest.class, BatchCreateVolumeTagsResponse.class)
            .withName("BatchCreateVolumeTags")
            .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateVolumeTagsRequest::getVolumeId,
                BatchCreateVolumeTagsRequest::setVolumeId));
        builder.<BatchCreateVolumeTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateVolumeTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateVolumeTagsRequest::getBody, BatchCreateVolumeTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSnapshotGroupTagRequest, BatchDeleteSnapshotGroupTagResponse> batchDeleteSnapshotGroupTag =
        genForBatchDeleteSnapshotGroupTag();

    private static HttpRequestDef<BatchDeleteSnapshotGroupTagRequest, BatchDeleteSnapshotGroupTagResponse> genForBatchDeleteSnapshotGroupTag() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSnapshotGroupTagRequest, BatchDeleteSnapshotGroupTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteSnapshotGroupTagRequest.class,
                    BatchDeleteSnapshotGroupTagResponse.class)
                .withName("BatchDeleteSnapshotGroupTag")
                .withUri("/v5/{project_id}/snapshot-groups/{snapshot_group_id}/tags/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSnapshotGroupTagRequest::getSnapshotGroupId,
                BatchDeleteSnapshotGroupTagRequest::setSnapshotGroupId));
        builder.<BatchDeleteResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteSnapshotGroupTagRequest::getBody,
                BatchDeleteSnapshotGroupTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSnapshotTagsRequest, BatchDeleteSnapshotTagsResponse> batchDeleteSnapshotTags =
        genForBatchDeleteSnapshotTags();

    private static HttpRequestDef<BatchDeleteSnapshotTagsRequest, BatchDeleteSnapshotTagsResponse> genForBatchDeleteSnapshotTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSnapshotTagsRequest, BatchDeleteSnapshotTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteSnapshotTagsRequest.class, BatchDeleteSnapshotTagsResponse.class)
            .withName("BatchDeleteSnapshotTags")
            .withUri("/v5/{project_id}/snapshots/{snapshot_id}/tags/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSnapshotTagsRequest::getSnapshotId,
                BatchDeleteSnapshotTagsRequest::setSnapshotId));
        builder.<BatchDeleteResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteSnapshotTagsRequest::getBody, BatchDeleteSnapshotTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTags =
        genForBatchDeleteVolumeTags();

    private static HttpRequestDef<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> genForBatchDeleteVolumeTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteVolumeTagsRequest.class, BatchDeleteVolumeTagsResponse.class)
            .withName("BatchDeleteVolumeTags")
            .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteVolumeTagsRequest::getVolumeId,
                BatchDeleteVolumeTagsRequest::setVolumeId));
        builder.<BatchDeleteVolumeTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteVolumeTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteVolumeTagsRequest::getBody, BatchDeleteVolumeTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResizeVolumesRequest, BatchResizeVolumesResponse> batchResizeVolumes =
        genForBatchResizeVolumes();

    private static HttpRequestDef<BatchResizeVolumesRequest, BatchResizeVolumesResponse> genForBatchResizeVolumes() {
        // basic
        HttpRequestDef.Builder<BatchResizeVolumesRequest, BatchResizeVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchResizeVolumesRequest.class, BatchResizeVolumesResponse.class)
                .withName("BatchResizeVolumes")
                .withUri("/v5/{project_id}/volumes/batch-extend")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchResizeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchResizeVolumeRequestBody.class),
            f -> f.withMarshaller(BatchResizeVolumesRequest::getBody, BatchResizeVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeVolumeChargeModeRequest, ChangeVolumeChargeModeResponse> changeVolumeChargeMode =
        genForChangeVolumeChargeMode();

    private static HttpRequestDef<ChangeVolumeChargeModeRequest, ChangeVolumeChargeModeResponse> genForChangeVolumeChargeMode() {
        // basic
        HttpRequestDef.Builder<ChangeVolumeChargeModeRequest, ChangeVolumeChargeModeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeVolumeChargeModeRequest.class, ChangeVolumeChargeModeResponse.class)
            .withName("ChangeVolumeChargeMode")
            .withUri("/v2/{project_id}/cloudvolumes/change-charge-mode")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeVolumeChargeModeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeVolumeChargeModeRequestBody.class),
            f -> f.withMarshaller(ChangeVolumeChargeModeRequest::getBody, ChangeVolumeChargeModeRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeVolumeChargeModeResponse::getBody, ChangeVolumeChargeModeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransfer =
        genForCinderAcceptVolumeTransfer();

    private static HttpRequestDef<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> genForCinderAcceptVolumeTransfer() {
        // basic
        HttpRequestDef.Builder<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CinderAcceptVolumeTransferRequest.class,
                    CinderAcceptVolumeTransferResponse.class)
                .withName("CinderAcceptVolumeTransfer")
                .withUri("/v2/{project_id}/os-volume-transfer/{transfer_id}/accept")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("transfer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CinderAcceptVolumeTransferRequest::getTransferId,
                CinderAcceptVolumeTransferRequest::setTransferId));
        builder.<CinderAcceptVolumeTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CinderAcceptVolumeTransferRequestBody.class),
            f -> f.withMarshaller(CinderAcceptVolumeTransferRequest::getBody,
                CinderAcceptVolumeTransferRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> cinderCreateVolumeTransfer =
        genForCinderCreateVolumeTransfer();

    private static HttpRequestDef<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> genForCinderCreateVolumeTransfer() {
        // basic
        HttpRequestDef.Builder<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CinderCreateVolumeTransferRequest.class,
                    CinderCreateVolumeTransferResponse.class)
                .withName("CinderCreateVolumeTransfer")
                .withUri("/v2/{project_id}/os-volume-transfer")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CinderCreateVolumeTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CinderCreateVolumeTransferRequestBody.class),
            f -> f.withMarshaller(CinderCreateVolumeTransferRequest::getBody,
                CinderCreateVolumeTransferRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransfer =
        genForCinderDeleteVolumeTransfer();

    private static HttpRequestDef<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> genForCinderDeleteVolumeTransfer() {
        // basic
        HttpRequestDef.Builder<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    CinderDeleteVolumeTransferRequest.class,
                    CinderDeleteVolumeTransferResponse.class)
                .withName("CinderDeleteVolumeTransfer")
                .withUri("/v2/{project_id}/os-volume-transfer/{transfer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("transfer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CinderDeleteVolumeTransferRequest::getTransferId,
                CinderDeleteVolumeTransferRequest::setTransferId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZones =
        genForCinderListAvailabilityZones();

    private static HttpRequestDef<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> genForCinderListAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CinderListAvailabilityZonesRequest.class,
                    CinderListAvailabilityZonesResponse.class)
                .withName("CinderListAvailabilityZones")
                .withUri("/v2/{project_id}/os-availability-zone")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotas =
        genForCinderListQuotas();

    private static HttpRequestDef<CinderListQuotasRequest, CinderListQuotasResponse> genForCinderListQuotas() {
        // basic
        HttpRequestDef.Builder<CinderListQuotasRequest, CinderListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CinderListQuotasRequest.class, CinderListQuotasResponse.class)
                .withName("CinderListQuotas")
                .withUri("/v2/{project_id}/os-quota-sets/{target_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("target_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CinderListQuotasRequest::getTargetProjectId,
                CinderListQuotasRequest::setTargetProjectId));
        builder.<CinderListQuotasRequest.UsageEnum>withRequestField("usage",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CinderListQuotasRequest.UsageEnum.class),
            f -> f.withMarshaller(CinderListQuotasRequest::getUsage, CinderListQuotasRequest::setUsage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> cinderListVolumeTransfers =
        genForCinderListVolumeTransfers();

    private static HttpRequestDef<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> genForCinderListVolumeTransfers() {
        // basic
        HttpRequestDef.Builder<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CinderListVolumeTransfersRequest.class,
                    CinderListVolumeTransfersResponse.class)
                .withName("CinderListVolumeTransfers")
                .withUri("/v2/{project_id}/os-volume-transfer")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CinderListVolumeTransfersRequest::getLimit,
                CinderListVolumeTransfersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CinderListVolumeTransfersRequest::getOffset,
                CinderListVolumeTransfersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypes =
        genForCinderListVolumeTypes();

    private static HttpRequestDef<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> genForCinderListVolumeTypes() {
        // basic
        HttpRequestDef.Builder<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CinderListVolumeTypesRequest.class, CinderListVolumeTypesResponse.class)
            .withName("CinderListVolumeTypes")
            .withUri("/v2/{project_id}/types")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> cinderShowVolumeTransfer =
        genForCinderShowVolumeTransfer();

    private static HttpRequestDef<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> genForCinderShowVolumeTransfer() {
        // basic
        HttpRequestDef.Builder<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, CinderShowVolumeTransferRequest.class, CinderShowVolumeTransferResponse.class)
                .withName("CinderShowVolumeTransfer")
                .withUri("/v2/{project_id}/os-volume-transfer/{transfer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("transfer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CinderShowVolumeTransferRequest::getTransferId,
                CinderShowVolumeTransferRequest::setTransferId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountAutoSnapshotPoliciesRequest, CountAutoSnapshotPoliciesResponse> countAutoSnapshotPolicies =
        genForCountAutoSnapshotPolicies();

    private static HttpRequestDef<CountAutoSnapshotPoliciesRequest, CountAutoSnapshotPoliciesResponse> genForCountAutoSnapshotPolicies() {
        // basic
        HttpRequestDef.Builder<CountAutoSnapshotPoliciesRequest, CountAutoSnapshotPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CountAutoSnapshotPoliciesRequest.class,
                    CountAutoSnapshotPoliciesResponse.class)
                .withName("CountAutoSnapshotPolicies")
                .withUri("/v5/{project_id}/snapshot-policies/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAutoSnapshotPoliciesRequest::getId, CountAutoSnapshotPoliciesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAutoSnapshotPoliciesRequest::getName,
                CountAutoSnapshotPoliciesRequest::setName));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAutoSnapshotPoliciesRequest::getTagKey,
                CountAutoSnapshotPoliciesRequest::setTagKey));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAutoSnapshotPoliciesRequest::getTags,
                CountAutoSnapshotPoliciesRequest::setTags));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAutoSnapshotPoliciesRequest::getEnterpriseProjectId,
                CountAutoSnapshotPoliciesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountSnapshotChainsRequest, CountSnapshotChainsResponse> countSnapshotChains =
        genForCountSnapshotChains();

    private static HttpRequestDef<CountSnapshotChainsRequest, CountSnapshotChainsResponse> genForCountSnapshotChains() {
        // basic
        HttpRequestDef.Builder<CountSnapshotChainsRequest, CountSnapshotChainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountSnapshotChainsRequest.class, CountSnapshotChainsResponse.class)
                .withName("CountSnapshotChains")
                .withUri("/v5/{project_id}/snapshot-chains/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotChainsRequest::getVolumeId, CountSnapshotChainsRequest::setVolumeId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotChainsRequest::getAvailabilityZone,
                CountSnapshotChainsRequest::setAvailabilityZone));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotChainsRequest::getCategory, CountSnapshotChainsRequest::setCategory));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotChainsRequest::getId, CountSnapshotChainsRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountSnapshotsRequest, CountSnapshotsResponse> countSnapshots =
        genForCountSnapshots();

    private static HttpRequestDef<CountSnapshotsRequest, CountSnapshotsResponse> genForCountSnapshots() {
        // basic
        HttpRequestDef.Builder<CountSnapshotsRequest, CountSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountSnapshotsRequest.class, CountSnapshotsResponse.class)
                .withName("CountSnapshots")
                .withUri("/v5/{project_id}/snapshots/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getVolumeId, CountSnapshotsRequest::setVolumeId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getAvailabilityZone,
                CountSnapshotsRequest::setAvailabilityZone));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getName, CountSnapshotsRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getStatus, CountSnapshotsRequest::setStatus));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getId, CountSnapshotsRequest::setId));
        builder.<String>withRequestField("snapshot_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getSnapshotType, CountSnapshotsRequest::setSnapshotType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getEnterpriseProjectId,
                CountSnapshotsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getTagKey, CountSnapshotsRequest::setTagKey));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getTags, CountSnapshotsRequest::setTags));
        builder.<String>withRequestField("snapshot_chain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsRequest::getSnapshotChainId,
                CountSnapshotsRequest::setSnapshotChainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountSnapshotsGroupRequest, CountSnapshotsGroupResponse> countSnapshotsGroup =
        genForCountSnapshotsGroup();

    private static HttpRequestDef<CountSnapshotsGroupRequest, CountSnapshotsGroupResponse> genForCountSnapshotsGroup() {
        // basic
        HttpRequestDef.Builder<CountSnapshotsGroupRequest, CountSnapshotsGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountSnapshotsGroupRequest.class, CountSnapshotsGroupResponse.class)
                .withName("CountSnapshotsGroup")
                .withUri("/v5/{project_id}/snapshot-groups/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsGroupRequest::getName, CountSnapshotsGroupRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsGroupRequest::getStatus, CountSnapshotsGroupRequest::setStatus));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsGroupRequest::getId, CountSnapshotsGroupRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsGroupRequest::getEnterpriseProjectId,
                CountSnapshotsGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsGroupRequest::getTagKey, CountSnapshotsGroupRequest::setTagKey));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSnapshotsGroupRequest::getTags, CountSnapshotsGroupRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoSnapshotPolicyRequest, CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy =
        genForCreateAutoSnapshotPolicy();

    private static HttpRequestDef<CreateAutoSnapshotPolicyRequest, CreateAutoSnapshotPolicyResponse> genForCreateAutoSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAutoSnapshotPolicyRequest, CreateAutoSnapshotPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAutoSnapshotPolicyRequest.class, CreateAutoSnapshotPolicyResponse.class)
                .withName("CreateAutoSnapshotPolicy")
                .withUri("/v5/{project_id}/snapshot-policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSnapshotPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSnapshotPolicyRequestBody.class),
            f -> f.withMarshaller(CreateAutoSnapshotPolicyRequest::getBody, CreateAutoSnapshotPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot =
        genForCreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForCreateSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotRequest, CreateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotRequest.class, CreateSnapshotResponse.class)
                .withName("CreateSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSnapshotRequestBody.class),
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, CreateSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotGroupRequest, CreateSnapshotGroupResponse> createSnapshotGroup =
        genForCreateSnapshotGroup();

    private static HttpRequestDef<CreateSnapshotGroupRequest, CreateSnapshotGroupResponse> genForCreateSnapshotGroup() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotGroupRequest, CreateSnapshotGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotGroupRequest.class, CreateSnapshotGroupResponse.class)
                .withName("CreateSnapshotGroup")
                .withUri("/v5/{project_id}/snapshot-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSnapshotGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSnapshotGroupRequestBody.class),
            f -> f.withMarshaller(CreateSnapshotGroupRequest::getBody, CreateSnapshotGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStandardSnapshotRequest, CreateStandardSnapshotResponse> createStandardSnapshot =
        genForCreateStandardSnapshot();

    private static HttpRequestDef<CreateStandardSnapshotRequest, CreateStandardSnapshotResponse> genForCreateStandardSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateStandardSnapshotRequest, CreateStandardSnapshotResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateStandardSnapshotRequest.class, CreateStandardSnapshotResponse.class)
            .withName("CreateStandardSnapshot")
            .withUri("/v5/{project_id}/snapshots")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateStandardSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateStandardSnapshotRequestBody.class),
            f -> f.withMarshaller(CreateStandardSnapshotRequest::getBody, CreateStandardSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> createVolume = genForCreateVolume();

    private static HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> genForCreateVolume() {
        // basic
        HttpRequestDef.Builder<CreateVolumeRequest, CreateVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVolumeRequest.class, CreateVolumeResponse.class)
                .withName("CreateVolume")
                .withUri("/v2.1/{project_id}/cloudvolumes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVolumeRequest::getXClientToken, CreateVolumeRequest::setXClientToken));
        builder.<CreateVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVolumeRequestBody.class),
            f -> f.withMarshaller(CreateVolumeRequest::getBody, CreateVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoSnapshotPolicyRequest, DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy =
        genForDeleteAutoSnapshotPolicy();

    private static HttpRequestDef<DeleteAutoSnapshotPolicyRequest, DeleteAutoSnapshotPolicyResponse> genForDeleteAutoSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteAutoSnapshotPolicyRequest, DeleteAutoSnapshotPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAutoSnapshotPolicyRequest.class,
                    DeleteAutoSnapshotPolicyResponse.class)
                .withName("DeleteAutoSnapshotPolicy")
                .withUri("/v5/{project_id}/snapshot-policies/{snapshot_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoSnapshotPolicyRequest::getSnapshotPolicyId,
                DeleteAutoSnapshotPolicyRequest::setSnapshotPolicyId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAutoSnapshotPolicyResponse::getBody,
                DeleteAutoSnapshotPolicyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot =
        genForDeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genForDeleteSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotRequest, DeleteSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSnapshotRequest.class, DeleteSnapshotResponse.class)
                .withName("DeleteSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, DeleteSnapshotRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotGroupRequest, DeleteSnapshotGroupResponse> deleteSnapshotGroup =
        genForDeleteSnapshotGroup();

    private static HttpRequestDef<DeleteSnapshotGroupRequest, DeleteSnapshotGroupResponse> genForDeleteSnapshotGroup() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotGroupRequest, DeleteSnapshotGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSnapshotGroupRequest.class, DeleteSnapshotGroupResponse.class)
            .withName("DeleteSnapshotGroup")
            .withUri("/v5/{project_id}/snapshot-groups/{snapshot_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotGroupRequest::getSnapshotGroupId,
                DeleteSnapshotGroupRequest::setSnapshotGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStandardSnapshotRequest, DeleteStandardSnapshotResponse> deleteStandardSnapshot =
        genForDeleteStandardSnapshot();

    private static HttpRequestDef<DeleteStandardSnapshotRequest, DeleteStandardSnapshotResponse> genForDeleteStandardSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteStandardSnapshotRequest, DeleteStandardSnapshotResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStandardSnapshotRequest.class, DeleteStandardSnapshotResponse.class)
            .withName("DeleteStandardSnapshot")
            .withUri("/v5/{project_id}/snapshots/{snapshot_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStandardSnapshotRequest::getSnapshotId,
                DeleteStandardSnapshotRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolume = genForDeleteVolume();

    private static HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> genForDeleteVolume() {
        // basic
        HttpRequestDef.Builder<DeleteVolumeRequest, DeleteVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVolumeRequest.class, DeleteVolumeResponse.class)
                .withName("DeleteVolume")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getVolumeId, DeleteVolumeRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVolumeInRecycleRequest, DeleteVolumeInRecycleResponse> deleteVolumeInRecycle =
        genForDeleteVolumeInRecycle();

    private static HttpRequestDef<DeleteVolumeInRecycleRequest, DeleteVolumeInRecycleResponse> genForDeleteVolumeInRecycle() {
        // basic
        HttpRequestDef.Builder<DeleteVolumeInRecycleRequest, DeleteVolumeInRecycleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVolumeInRecycleRequest.class, DeleteVolumeInRecycleResponse.class)
            .withName("DeleteVolumeInRecycle")
            .withUri("/v3/{project_id}/recycle-bin-volumes/{volume_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeInRecycleRequest::getVolumeId,
                DeleteVolumeInRecycleRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateAutoSnapshotPolicyRequest, DisassociateAutoSnapshotPolicyResponse> disassociateAutoSnapshotPolicy =
        genForDisassociateAutoSnapshotPolicy();

    private static HttpRequestDef<DisassociateAutoSnapshotPolicyRequest, DisassociateAutoSnapshotPolicyResponse> genForDisassociateAutoSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<DisassociateAutoSnapshotPolicyRequest, DisassociateAutoSnapshotPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateAutoSnapshotPolicyRequest.class,
                    DisassociateAutoSnapshotPolicyResponse.class)
                .withName("DisassociateAutoSnapshotPolicy")
                .withUri("/v5/{project_id}/snapshot-policies/{snapshot_policy_id}/disassociate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateAutoSnapshotPolicyRequest::getSnapshotPolicyId,
                DisassociateAutoSnapshotPolicyRequest::setSnapshotPolicyId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(DisassociateAutoSnapshotPolicyRequest::getBody,
                    DisassociateAutoSnapshotPolicyRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoSnapshotPolicyRequest, ListAutoSnapshotPolicyResponse> listAutoSnapshotPolicy =
        genForListAutoSnapshotPolicy();

    private static HttpRequestDef<ListAutoSnapshotPolicyRequest, ListAutoSnapshotPolicyResponse> genForListAutoSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<ListAutoSnapshotPolicyRequest, ListAutoSnapshotPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAutoSnapshotPolicyRequest.class, ListAutoSnapshotPolicyResponse.class)
            .withName("ListAutoSnapshotPolicy")
            .withUri("/v5/{project_id}/snapshot-policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getId, ListAutoSnapshotPolicyRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getName, ListAutoSnapshotPolicyRequest::setName));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getTags, ListAutoSnapshotPolicyRequest::setTags));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getTagKey, ListAutoSnapshotPolicyRequest::setTagKey));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getEnterpriseProjectId,
                ListAutoSnapshotPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getLimit, ListAutoSnapshotPolicyRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getOffset, ListAutoSnapshotPolicyRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getSortKey,
                ListAutoSnapshotPolicyRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoSnapshotPolicyRequest::getSortDir,
                ListAutoSnapshotPolicyRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotChainsRequest, ListSnapshotChainsResponse> listSnapshotChains =
        genForListSnapshotChains();

    private static HttpRequestDef<ListSnapshotChainsRequest, ListSnapshotChainsResponse> genForListSnapshotChains() {
        // basic
        HttpRequestDef.Builder<ListSnapshotChainsRequest, ListSnapshotChainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotChainsRequest.class, ListSnapshotChainsResponse.class)
                .withName("ListSnapshotChains")
                .withUri("/v5/{project_id}/snapshot-chains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotChainsRequest::getMarker, ListSnapshotChainsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotChainsRequest::getLimit, ListSnapshotChainsRequest::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotChainsRequest::getId, ListSnapshotChainsRequest::setId));
        builder.<String>withRequestField("volume_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotChainsRequest::getVolumeId, ListSnapshotChainsRequest::setVolumeId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotChainsRequest::getCategory, ListSnapshotChainsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotGroupRequest, ListSnapshotGroupResponse> listSnapshotGroup =
        genForListSnapshotGroup();

    private static HttpRequestDef<ListSnapshotGroupRequest, ListSnapshotGroupResponse> genForListSnapshotGroup() {
        // basic
        HttpRequestDef.Builder<ListSnapshotGroupRequest, ListSnapshotGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotGroupRequest.class, ListSnapshotGroupResponse.class)
                .withName("ListSnapshotGroup")
                .withUri("/v5/{project_id}/snapshot-groups/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getId, ListSnapshotGroupRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getName, ListSnapshotGroupRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getStatus, ListSnapshotGroupRequest::setStatus));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getTagKey, ListSnapshotGroupRequest::setTagKey));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getTags, ListSnapshotGroupRequest::setTags));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getEnterpriseProjectId,
                ListSnapshotGroupRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getLimit, ListSnapshotGroupRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getOffset, ListSnapshotGroupRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getSortKey, ListSnapshotGroupRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getSortDir, ListSnapshotGroupRequest::setSortDir));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotGroupRequest::getServerId, ListSnapshotGroupRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotGroupTagsRequest, ListSnapshotGroupTagsResponse> listSnapshotGroupTags =
        genForListSnapshotGroupTags();

    private static HttpRequestDef<ListSnapshotGroupTagsRequest, ListSnapshotGroupTagsResponse> genForListSnapshotGroupTags() {
        // basic
        HttpRequestDef.Builder<ListSnapshotGroupTagsRequest, ListSnapshotGroupTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSnapshotGroupTagsRequest.class, ListSnapshotGroupTagsResponse.class)
            .withName("ListSnapshotGroupTags")
            .withUri("/v5/{project_id}/snapshot-groups/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotTagsRequest, ListSnapshotTagsResponse> listSnapshotTags =
        genForListSnapshotTags();

    private static HttpRequestDef<ListSnapshotTagsRequest, ListSnapshotTagsResponse> genForListSnapshotTags() {
        // basic
        HttpRequestDef.Builder<ListSnapshotTagsRequest, ListSnapshotTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotTagsRequest.class, ListSnapshotTagsResponse.class)
                .withName("ListSnapshotTags")
                .withUri("/v5/{project_id}/snapshots/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots =
        genForListSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForListSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withName("ListSnapshots")
                .withUri("/v2/{project_id}/cloudsnapshots/detail")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getOffset, ListSnapshotsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getLimit, ListSnapshotsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getName, ListSnapshotsRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getStatus, ListSnapshotsRequest::setStatus));
        builder.<String>withRequestField("volume_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getVolumeId, ListSnapshotsRequest::setVolumeId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getAvailabilityZone,
                ListSnapshotsRequest::setAvailabilityZone));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getId, ListSnapshotsRequest::setId));
        builder.<String>withRequestField("dedicated_storage_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getDedicatedStorageName,
                ListSnapshotsRequest::setDedicatedStorageName));
        builder.<String>withRequestField("dedicated_storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getDedicatedStorageId,
                ListSnapshotsRequest::setDedicatedStorageId));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getServiceType, ListSnapshotsRequest::setServiceType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getEnterpriseProjectId,
                ListSnapshotsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsDetailsRequest, ListSnapshotsDetailsResponse> listSnapshotsDetails =
        genForListSnapshotsDetails();

    private static HttpRequestDef<ListSnapshotsDetailsRequest, ListSnapshotsDetailsResponse> genForListSnapshotsDetails() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsDetailsRequest, ListSnapshotsDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSnapshotsDetailsRequest.class, ListSnapshotsDetailsResponse.class)
            .withName("ListSnapshotsDetails")
            .withUri("/v5/{project_id}/snapshots/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getMarker, ListSnapshotsDetailsRequest::setMarker));
        builder.<String>withRequestField("volume_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getVolumeId, ListSnapshotsDetailsRequest::setVolumeId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getAvailabilityZone,
                ListSnapshotsDetailsRequest::setAvailabilityZone));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getLimit, ListSnapshotsDetailsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getName, ListSnapshotsDetailsRequest::setName));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getOffset, ListSnapshotsDetailsRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getStatus, ListSnapshotsDetailsRequest::setStatus));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getSortKey, ListSnapshotsDetailsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getSortDir, ListSnapshotsDetailsRequest::setSortDir));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getId, ListSnapshotsDetailsRequest::setId));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getIds, ListSnapshotsDetailsRequest::setIds));
        builder.<String>withRequestField("snapshot_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getSnapshotType,
                ListSnapshotsDetailsRequest::setSnapshotType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getEnterpriseProjectId,
                ListSnapshotsDetailsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getTagKey, ListSnapshotsDetailsRequest::setTagKey));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getTags, ListSnapshotsDetailsRequest::setTags));
        builder.<String>withRequestField("snapshot_chain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getSnapshotChainId,
                ListSnapshotsDetailsRequest::setSnapshotChainId));
        builder.<String>withRequestField("snapshot_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsDetailsRequest::getSnapshotGroupId,
                ListSnapshotsDetailsRequest::setSnapshotGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTags =
        genForListVolumeTags();

    private static HttpRequestDef<ListVolumeTagsRequest, ListVolumeTagsResponse> genForListVolumeTags() {
        // basic
        HttpRequestDef.Builder<ListVolumeTagsRequest, ListVolumeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVolumeTagsRequest.class, ListVolumeTagsResponse.class)
                .withName("ListVolumeTags")
                .withUri("/v2/{project_id}/cloudvolumes/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesRequest, ListVolumesResponse> listVolumes = genForListVolumes();

    private static HttpRequestDef<ListVolumesRequest, ListVolumesResponse> genForListVolumes() {
        // basic
        HttpRequestDef.Builder<ListVolumesRequest, ListVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVolumesRequest.class, ListVolumesResponse.class)
                .withName("ListVolumes")
                .withUri("/v2/{project_id}/cloudvolumes/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getMarker, ListVolumesRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getName, ListVolumesRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumesRequest::getLimit, ListVolumesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getSortKey, ListVolumesRequest::setSortKey));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumesRequest::getOffset, ListVolumesRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getSortDir, ListVolumesRequest::setSortDir));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getStatus, ListVolumesRequest::setStatus));
        builder.<String>withRequestField("metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getMetadata, ListVolumesRequest::setMetadata));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getAvailabilityZone, ListVolumesRequest::setAvailabilityZone));
        builder.<Boolean>withRequestField("multiattach",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVolumesRequest::getMultiattach, ListVolumesRequest::setMultiattach));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getServiceType, ListVolumesRequest::setServiceType));
        builder.<String>withRequestField("dedicated_storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getDedicatedStorageId,
                ListVolumesRequest::setDedicatedStorageId));
        builder.<String>withRequestField("dedicated_storage_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getDedicatedStorageName,
                ListVolumesRequest::setDedicatedStorageName));
        builder.<String>withRequestField("volume_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getVolumeTypeId, ListVolumesRequest::setVolumeTypeId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getId, ListVolumesRequest::setId));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getIds, ListVolumesRequest::setIds));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getEnterpriseProjectId,
                ListVolumesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getServerId, ListVolumesRequest::setServerId));
        builder.<ListVolumesRequest.NotMetadataEnum>withRequestField("not_metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVolumesRequest.NotMetadataEnum.class),
            f -> f.withMarshaller(ListVolumesRequest::getNotMetadata, ListVolumesRequest::setNotMetadata));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTags =
        genForListVolumesByTags();

    private static HttpRequestDef<ListVolumesByTagsRequest, ListVolumesByTagsResponse> genForListVolumesByTags() {
        // basic
        HttpRequestDef.Builder<ListVolumesByTagsRequest, ListVolumesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListVolumesByTagsRequest.class, ListVolumesByTagsResponse.class)
                .withName("ListVolumesByTags")
                .withUri("/v2/{project_id}/cloudvolumes/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListVolumesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListVolumesByTagsRequestBody.class),
            f -> f.withMarshaller(ListVolumesByTagsRequest::getBody, ListVolumesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesInRecycleRequest, ListVolumesInRecycleResponse> listVolumesInRecycle =
        genForListVolumesInRecycle();

    private static HttpRequestDef<ListVolumesInRecycleRequest, ListVolumesInRecycleResponse> genForListVolumesInRecycle() {
        // basic
        HttpRequestDef.Builder<ListVolumesInRecycleRequest, ListVolumesInRecycleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVolumesInRecycleRequest.class, ListVolumesInRecycleResponse.class)
            .withName("ListVolumesInRecycle")
            .withUri("/v3/{project_id}/recycle-bin-volumes/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesInRecycleRequest::getName, ListVolumesInRecycleRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesInRecycleRequest::getStatus, ListVolumesInRecycleRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumesInRecycleRequest::getLimit, ListVolumesInRecycleRequest::setLimit));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesInRecycleRequest::getAvailabilityZone,
                ListVolumesInRecycleRequest::setAvailabilityZone));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesInRecycleRequest::getServiceType,
                ListVolumesInRecycleRequest::setServiceType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumesInRecycleRequest::getOffset, ListVolumesInRecycleRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> modifyVolumeQoS =
        genForModifyVolumeQoS();

    private static HttpRequestDef<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> genForModifyVolumeQoS() {
        // basic
        HttpRequestDef.Builder<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyVolumeQoSRequest.class, ModifyVolumeQoSResponse.class)
                .withName("ModifyVolumeQoS")
                .withUri("/v5/{project_id}/cloudvolumes/{volume_id}/qos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyVolumeQoSRequest::getVolumeId, ModifyVolumeQoSRequest::setVolumeId));
        builder.<ModifyVolumeQoSRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyVolumeQoSRequestBody.class),
            f -> f.withMarshaller(ModifyVolumeQoSRequest::getBody, ModifyVolumeQoSRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolume = genForResizeVolume();

    private static HttpRequestDef<ResizeVolumeRequest, ResizeVolumeResponse> genForResizeVolume() {
        // basic
        HttpRequestDef.Builder<ResizeVolumeRequest, ResizeVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeVolumeRequest.class, ResizeVolumeResponse.class)
                .withName("ResizeVolume")
                .withUri("/v2.1/{project_id}/cloudvolumes/{volume_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeVolumeRequest::getVolumeId, ResizeVolumeRequest::setVolumeId));
        builder.<ResizeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeVolumeRequestBody.class),
            f -> f.withMarshaller(ResizeVolumeRequest::getBody, ResizeVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetypeVolumeRequest, RetypeVolumeResponse> retypeVolume = genForRetypeVolume();

    private static HttpRequestDef<RetypeVolumeRequest, RetypeVolumeResponse> genForRetypeVolume() {
        // basic
        HttpRequestDef.Builder<RetypeVolumeRequest, RetypeVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetypeVolumeRequest.class, RetypeVolumeResponse.class)
                .withName("RetypeVolume")
                .withUri("/v2/{project_id}/volumes/{volume_id}/retype")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetypeVolumeRequest::getVolumeId, RetypeVolumeRequest::setVolumeId));
        builder.<RetypeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RetypeVolumeRequestBody.class),
            f -> f.withMarshaller(RetypeVolumeRequest::getBody, RetypeVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevertVolumeInRecycleRequest, RevertVolumeInRecycleResponse> revertVolumeInRecycle =
        genForRevertVolumeInRecycle();

    private static HttpRequestDef<RevertVolumeInRecycleRequest, RevertVolumeInRecycleResponse> genForRevertVolumeInRecycle() {
        // basic
        HttpRequestDef.Builder<RevertVolumeInRecycleRequest, RevertVolumeInRecycleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RevertVolumeInRecycleRequest.class, RevertVolumeInRecycleResponse.class)
            .withName("RevertVolumeInRecycle")
            .withUri("/v3/{project_id}/recycle-bin-volumes/{volume_id}/revert")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevertVolumeInRecycleRequest::getVolumeId,
                RevertVolumeInRecycleRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshot =
        genForRollbackSnapshot();

    private static HttpRequestDef<RollbackSnapshotRequest, RollbackSnapshotResponse> genForRollbackSnapshot() {
        // basic
        HttpRequestDef.Builder<RollbackSnapshotRequest, RollbackSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RollbackSnapshotRequest.class, RollbackSnapshotResponse.class)
                .withName("RollbackSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}/rollback")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackSnapshotRequest::getSnapshotId, RollbackSnapshotRequest::setSnapshotId));
        builder.<RollbackSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RollbackSnapshotRequestBody.class),
            f -> f.withMarshaller(RollbackSnapshotRequest::getBody, RollbackSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackStandardSnapshotRequest, RollbackStandardSnapshotResponse> rollbackStandardSnapshot =
        genForRollbackStandardSnapshot();

    private static HttpRequestDef<RollbackStandardSnapshotRequest, RollbackStandardSnapshotResponse> genForRollbackStandardSnapshot() {
        // basic
        HttpRequestDef.Builder<RollbackStandardSnapshotRequest, RollbackStandardSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RollbackStandardSnapshotRequest.class, RollbackStandardSnapshotResponse.class)
                .withName("RollbackStandardSnapshot")
                .withUri("/v5/{project_id}/snapshots/{snapshot_id}/rollback")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackStandardSnapshotRequest::getSnapshotId,
                RollbackStandardSnapshotRequest::setSnapshotId));
        builder.<RollbackSnapshotRequestBodyV5>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RollbackSnapshotRequestBodyV5.class),
            f -> f.withMarshaller(RollbackStandardSnapshotRequest::getBody, RollbackStandardSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoSnapshotPolicyRequest, ShowAutoSnapshotPolicyResponse> showAutoSnapshotPolicy =
        genForShowAutoSnapshotPolicy();

    private static HttpRequestDef<ShowAutoSnapshotPolicyRequest, ShowAutoSnapshotPolicyResponse> genForShowAutoSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoSnapshotPolicyRequest, ShowAutoSnapshotPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoSnapshotPolicyRequest.class, ShowAutoSnapshotPolicyResponse.class)
            .withName("ShowAutoSnapshotPolicy")
            .withUri("/v5/{project_id}/snapshot-policies/{snapshot_policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoSnapshotPolicyRequest::getSnapshotPolicyId,
                ShowAutoSnapshotPolicyRequest::setSnapshotPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicy =
        genForShowRecyclePolicy();

    private static HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> genForShowRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecyclePolicyRequest.class, ShowRecyclePolicyResponse.class)
                .withName("ShowRecyclePolicy")
                .withUri("/v3/{project_id}/recycle-bin-volumes/policy")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshot = genForShowSnapshot();

    private static HttpRequestDef<ShowSnapshotRequest, ShowSnapshotResponse> genForShowSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowSnapshotRequest, ShowSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSnapshotRequest.class, ShowSnapshotResponse.class)
                .withName("ShowSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSnapshotRequest::getSnapshotId, ShowSnapshotRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSnapshotGroupRequest, ShowSnapshotGroupResponse> showSnapshotGroup =
        genForShowSnapshotGroup();

    private static HttpRequestDef<ShowSnapshotGroupRequest, ShowSnapshotGroupResponse> genForShowSnapshotGroup() {
        // basic
        HttpRequestDef.Builder<ShowSnapshotGroupRequest, ShowSnapshotGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSnapshotGroupRequest.class, ShowSnapshotGroupResponse.class)
                .withName("ShowSnapshotGroup")
                .withUri("/v5/{project_id}/snapshot-groups/{snapshot_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSnapshotGroupRequest::getSnapshotGroupId,
                ShowSnapshotGroupRequest::setSnapshotGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStandardSnapshotRequest, ShowStandardSnapshotResponse> showStandardSnapshot =
        genForShowStandardSnapshot();

    private static HttpRequestDef<ShowStandardSnapshotRequest, ShowStandardSnapshotResponse> genForShowStandardSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowStandardSnapshotRequest, ShowStandardSnapshotResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowStandardSnapshotRequest.class, ShowStandardSnapshotResponse.class)
            .withName("ShowStandardSnapshot")
            .withUri("/v5/{project_id}/snapshots/{snapshot_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStandardSnapshotRequest::getSnapshotId,
                ShowStandardSnapshotRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> showVolume = genForShowVolume();

    private static HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> genForShowVolume() {
        // basic
        HttpRequestDef.Builder<ShowVolumeRequest, ShowVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeRequest.class, ShowVolumeResponse.class)
                .withName("ShowVolume")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVolumeRequest::getVolumeId, ShowVolumeRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeInRecycleRequest, ShowVolumeInRecycleResponse> showVolumeInRecycle =
        genForShowVolumeInRecycle();

    private static HttpRequestDef<ShowVolumeInRecycleRequest, ShowVolumeInRecycleResponse> genForShowVolumeInRecycle() {
        // basic
        HttpRequestDef.Builder<ShowVolumeInRecycleRequest, ShowVolumeInRecycleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeInRecycleRequest.class, ShowVolumeInRecycleResponse.class)
                .withName("ShowVolumeInRecycle")
                .withUri("/v3/{project_id}/recycle-bin-volumes/{volume_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVolumeInRecycleRequest::getVolumeId, ShowVolumeInRecycleRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTags =
        genForShowVolumeTags();

    private static HttpRequestDef<ShowVolumeTagsRequest, ShowVolumeTagsResponse> genForShowVolumeTags() {
        // basic
        HttpRequestDef.Builder<ShowVolumeTagsRequest, ShowVolumeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeTagsRequest.class, ShowVolumeTagsResponse.class)
                .withName("ShowVolumeTags")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVolumeTagsRequest::getVolumeId, ShowVolumeTagsRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse> unsubscribePostpaidVolume =
        genForUnsubscribePostpaidVolume();

    private static HttpRequestDef<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse> genForUnsubscribePostpaidVolume() {
        // basic
        HttpRequestDef.Builder<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UnsubscribePostpaidVolumeRequest.class,
                    UnsubscribePostpaidVolumeResponse.class)
                .withName("UnsubscribePostpaidVolume")
                .withUri("/v2/{project_id}/cloudvolumes/unsubscribe")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UnsubscribeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnsubscribeVolumeRequestBody.class),
            f -> f.withMarshaller(UnsubscribePostpaidVolumeRequest::getBody,
                UnsubscribePostpaidVolumeRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UnsubscribePostpaidVolumeResponse::getBody,
                UnsubscribePostpaidVolumeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoSnapshotPolicyRequest, UpdateAutoSnapshotPolicyResponse> updateAutoSnapshotPolicy =
        genForUpdateAutoSnapshotPolicy();

    private static HttpRequestDef<UpdateAutoSnapshotPolicyRequest, UpdateAutoSnapshotPolicyResponse> genForUpdateAutoSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateAutoSnapshotPolicyRequest, UpdateAutoSnapshotPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateAutoSnapshotPolicyRequest.class, UpdateAutoSnapshotPolicyResponse.class)
                .withName("UpdateAutoSnapshotPolicy")
                .withUri("/v5/{project_id}/snapshot-policies/{snapshot_policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoSnapshotPolicyRequest::getSnapshotPolicyId,
                UpdateAutoSnapshotPolicyRequest::setSnapshotPolicyId));
        builder.<UpdateSnapshotPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSnapshotPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateAutoSnapshotPolicyRequest::getBody, UpdateAutoSnapshotPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecyclePolicyRequest, UpdateRecyclePolicyResponse> updateRecyclePolicy =
        genForUpdateRecyclePolicy();

    private static HttpRequestDef<UpdateRecyclePolicyRequest, UpdateRecyclePolicyResponse> genForUpdateRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<UpdateRecyclePolicyRequest, UpdateRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecyclePolicyRequest.class, UpdateRecyclePolicyResponse.class)
                .withName("UpdateRecyclePolicy")
                .withUri("/v3/{project_id}/recycle-bin-volumes/policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ModifyRecycleBinPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyRecycleBinPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateRecyclePolicyRequest::getBody, UpdateRecyclePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshot =
        genForUpdateSnapshot();

    private static HttpRequestDef<UpdateSnapshotRequest, UpdateSnapshotResponse> genForUpdateSnapshot() {
        // basic
        HttpRequestDef.Builder<UpdateSnapshotRequest, UpdateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSnapshotRequest.class, UpdateSnapshotResponse.class)
                .withName("UpdateSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSnapshotRequest::getSnapshotId, UpdateSnapshotRequest::setSnapshotId));
        builder.<UpdateSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSnapshotRequestBody.class),
            f -> f.withMarshaller(UpdateSnapshotRequest::getBody, UpdateSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotGroupRequest, UpdateSnapshotGroupResponse> updateSnapshotGroup =
        genForUpdateSnapshotGroup();

    private static HttpRequestDef<UpdateSnapshotGroupRequest, UpdateSnapshotGroupResponse> genForUpdateSnapshotGroup() {
        // basic
        HttpRequestDef.Builder<UpdateSnapshotGroupRequest, UpdateSnapshotGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSnapshotGroupRequest.class, UpdateSnapshotGroupResponse.class)
                .withName("UpdateSnapshotGroup")
                .withUri("/v5/{project_id}/snapshot-groups/{snapshot_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSnapshotGroupRequest::getSnapshotGroupId,
                UpdateSnapshotGroupRequest::setSnapshotGroupId));
        builder.<UpdateSnapshotGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSnapshotGroupRequestBody.class),
            f -> f.withMarshaller(UpdateSnapshotGroupRequest::getBody, UpdateSnapshotGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStandardSnapshotRequest, UpdateStandardSnapshotResponse> updateStandardSnapshot =
        genForUpdateStandardSnapshot();

    private static HttpRequestDef<UpdateStandardSnapshotRequest, UpdateStandardSnapshotResponse> genForUpdateStandardSnapshot() {
        // basic
        HttpRequestDef.Builder<UpdateStandardSnapshotRequest, UpdateStandardSnapshotResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStandardSnapshotRequest.class, UpdateStandardSnapshotResponse.class)
            .withName("UpdateStandardSnapshot")
            .withUri("/v5/{project_id}/snapshots/{snapshot_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStandardSnapshotRequest::getSnapshotId,
                UpdateStandardSnapshotRequest::setSnapshotId));
        builder.<UpdateSnapshotRequestBodyV5>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSnapshotRequestBodyV5.class),
            f -> f.withMarshaller(UpdateStandardSnapshotRequest::getBody, UpdateStandardSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVolumeRequest, UpdateVolumeResponse> updateVolume = genForUpdateVolume();

    private static HttpRequestDef<UpdateVolumeRequest, UpdateVolumeResponse> genForUpdateVolume() {
        // basic
        HttpRequestDef.Builder<UpdateVolumeRequest, UpdateVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVolumeRequest.class, UpdateVolumeResponse.class)
                .withName("UpdateVolume")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVolumeRequest::getVolumeId, UpdateVolumeRequest::setVolumeId));
        builder.<UpdateVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVolumeRequestBody.class),
            f -> f.withMarshaller(UpdateVolumeRequest::getBody, UpdateVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionsRequest, ListVersionsResponse> listVersions = genForListVersions();

    private static HttpRequestDef<ListVersionsRequest, ListVersionsResponse> genForListVersions() {
        // basic
        HttpRequestDef.Builder<ListVersionsRequest, ListVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionsRequest.class, ListVersionsResponse.class)
                .withName("ListVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForShowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForShowVersion() {
        // basic
        HttpRequestDef.Builder<ShowVersionRequest, ShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionRequest.class, ShowVersionResponse.class)
                .withName("ShowVersion")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<ShowVersionRequest.VersionEnum>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowVersionRequest.VersionEnum.class),
            f -> f.withMarshaller(ShowVersionRequest::getVersion, ShowVersionRequest::setVersion));

        // response

        return builder.build();
    }

}
