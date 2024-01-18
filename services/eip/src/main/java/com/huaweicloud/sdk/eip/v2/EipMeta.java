package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eip.v2.model.AddPublicipsIntoSharedBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.AddPublicipsIntoSharedBandwidthRequestBody;
import com.huaweicloud.sdk.eip.v2.model.AddPublicipsIntoSharedBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchCreateBandwidthRequestBody;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipTagsRequestBody;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipsV2RequestBody;
import com.huaweicloud.sdk.eip.v2.model.BatchCreateSharedBandwidthsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchCreateSharedBandwidthsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicIpRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicIpRequestBody;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicIpResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicipTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicipTagsRequestBody;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicipTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchDisassociatePublicipsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchDisassociatePublicipsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchModifyBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchModifyBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.BwChangeToPeriodReq;
import com.huaweicloud.sdk.eip.v2.model.ChangeBandwidthToPeriodRequest;
import com.huaweicloud.sdk.eip.v2.model.ChangeBandwidthToPeriodResponse;
import com.huaweicloud.sdk.eip.v2.model.ChangePublicipToPeriodRequest;
import com.huaweicloud.sdk.eip.v2.model.ChangePublicipToPeriodResponse;
import com.huaweicloud.sdk.eip.v2.model.ChangeToPeriodReq;
import com.huaweicloud.sdk.eip.v2.model.CountPublicIpInstanceRequest;
import com.huaweicloud.sdk.eip.v2.model.CountPublicIpInstanceResponse;
import com.huaweicloud.sdk.eip.v2.model.CountPublicIpRequest;
import com.huaweicloud.sdk.eip.v2.model.CountPublicIpResponse;
import com.huaweicloud.sdk.eip.v2.model.CreatePrePaidPublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.CreatePrePaidPublicipRequestBody;
import com.huaweicloud.sdk.eip.v2.model.CreatePrePaidPublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipRequestBody;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipTagRequest;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipTagRequestBody;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipTagResponse;
import com.huaweicloud.sdk.eip.v2.model.CreateSharedBandwidhRequestBody;
import com.huaweicloud.sdk.eip.v2.model.CreateSharedBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.CreateSharedBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.DeletePublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.DeletePublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.DeletePublicipTagRequest;
import com.huaweicloud.sdk.eip.v2.model.DeletePublicipTagResponse;
import com.huaweicloud.sdk.eip.v2.model.DeleteSharedBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.DeleteSharedBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.ListBandwidthPkgRequest;
import com.huaweicloud.sdk.eip.v2.model.ListBandwidthPkgResponse;
import com.huaweicloud.sdk.eip.v2.model.ListBandwidthsRequest;
import com.huaweicloud.sdk.eip.v2.model.ListBandwidthsResponse;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsByTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsByTagsRequestBody;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsByTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsRequest;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsResponse;
import com.huaweicloud.sdk.eip.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.eip.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.eip.v2.model.ModifyBandwidthRequestBody;
import com.huaweicloud.sdk.eip.v2.model.NeutronCreateFloatingIpRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronCreateFloatingIpRequestBody;
import com.huaweicloud.sdk.eip.v2.model.NeutronCreateFloatingIpResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronDeleteFloatingIpRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronDeleteFloatingIpResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronListFloatingIpsRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronListFloatingIpsResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronShowFloatingIpRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronShowFloatingIpResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronUpdateFloatingIpRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronUpdateFloatingIpRequestBody;
import com.huaweicloud.sdk.eip.v2.model.NeutronUpdateFloatingIpResponse;
import com.huaweicloud.sdk.eip.v2.model.RemovePublicipsFromSharedBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.RemovePublicipsFromSharedBandwidthRequestBody;
import com.huaweicloud.sdk.eip.v2.model.RemovePublicipsFromSharedBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicIpTypeRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicIpTypeResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicipTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicipTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowResourcesJobDetailRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowResourcesJobDetailResponse;
import com.huaweicloud.sdk.eip.v2.model.UpdateBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.UpdateBandwidthRequestBody;
import com.huaweicloud.sdk.eip.v2.model.UpdateBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.UpdatePrePaidBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.UpdatePrePaidBandwidthRequestBody;
import com.huaweicloud.sdk.eip.v2.model.UpdatePrePaidBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.UpdatePublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.UpdatePublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.UpdatePublicipsRequestBody;

import java.util.List;

@SuppressWarnings("unchecked")
public class EipMeta {

    public static final HttpRequestDef<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidth =
        genForAddPublicipsIntoSharedBandwidth();

    private static HttpRequestDef<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> genForAddPublicipsIntoSharedBandwidth() {
        // basic
        HttpRequestDef.Builder<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddPublicipsIntoSharedBandwidthRequest.class,
                    AddPublicipsIntoSharedBandwidthResponse.class)
                .withName("AddPublicipsIntoSharedBandwidth")
                .withUri("/v2.0/{project_id}/bandwidths/{bandwidth_id}/insert")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPublicipsIntoSharedBandwidthRequest::getBandwidthId,
                AddPublicipsIntoSharedBandwidthRequest::setBandwidthId));
        builder.<AddPublicipsIntoSharedBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddPublicipsIntoSharedBandwidthRequestBody.class),
            f -> f.withMarshaller(AddPublicipsIntoSharedBandwidthRequest::getBody,
                AddPublicipsIntoSharedBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidths =
        genForBatchCreateSharedBandwidths();

    private static HttpRequestDef<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> genForBatchCreateSharedBandwidths() {
        // basic
        HttpRequestDef.Builder<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateSharedBandwidthsRequest.class,
                    BatchCreateSharedBandwidthsResponse.class)
                .withName("BatchCreateSharedBandwidths")
                .withUri("/v2.0/{project_id}/batch-bandwidths")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchCreateBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateBandwidthRequestBody.class),
            f -> f.withMarshaller(BatchCreateSharedBandwidthsRequest::getBody,
                BatchCreateSharedBandwidthsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchModifyBandwidthRequest, BatchModifyBandwidthResponse> batchModifyBandwidth =
        genForBatchModifyBandwidth();

    private static HttpRequestDef<BatchModifyBandwidthRequest, BatchModifyBandwidthResponse> genForBatchModifyBandwidth() {
        // basic
        HttpRequestDef.Builder<BatchModifyBandwidthRequest, BatchModifyBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, BatchModifyBandwidthRequest.class, BatchModifyBandwidthResponse.class)
            .withName("BatchModifyBandwidth")
            .withUri("/v2/{project_id}/batch-bandwidths/modify")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ModifyBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyBandwidthRequestBody.class),
            f -> f.withMarshaller(BatchModifyBandwidthRequest::getBody, BatchModifyBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse> changeBandwidthToPeriod =
        genForChangeBandwidthToPeriod();

    private static HttpRequestDef<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse> genForChangeBandwidthToPeriod() {
        // basic
        HttpRequestDef.Builder<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeBandwidthToPeriodRequest.class, ChangeBandwidthToPeriodResponse.class)
            .withName("ChangeBandwidthToPeriod")
            .withUri("/v2.0/{project_id}/bandwidths/change-to-period")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BwChangeToPeriodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BwChangeToPeriodReq.class),
            f -> f.withMarshaller(ChangeBandwidthToPeriodRequest::getBody, ChangeBandwidthToPeriodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> createSharedBandwidth =
        genForCreateSharedBandwidth();

    private static HttpRequestDef<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> genForCreateSharedBandwidth() {
        // basic
        HttpRequestDef.Builder<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSharedBandwidthRequest.class, CreateSharedBandwidthResponse.class)
            .withName("CreateSharedBandwidth")
            .withUri("/v2.0/{project_id}/bandwidths")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSharedBandwidhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSharedBandwidhRequestBody.class),
            f -> f.withMarshaller(CreateSharedBandwidthRequest::getBody, CreateSharedBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> deleteSharedBandwidth =
        genForDeleteSharedBandwidth();

    private static HttpRequestDef<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> genForDeleteSharedBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSharedBandwidthRequest.class, DeleteSharedBandwidthResponse.class)
            .withName("DeleteSharedBandwidth")
            .withUri("/v2.0/{project_id}/bandwidths/{bandwidth_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSharedBandwidthRequest::getBandwidthId,
                DeleteSharedBandwidthRequest::setBandwidthId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPkgRequest, ListBandwidthPkgResponse> listBandwidthPkg =
        genForListBandwidthPkg();

    private static HttpRequestDef<ListBandwidthPkgRequest, ListBandwidthPkgResponse> genForListBandwidthPkg() {
        // basic
        HttpRequestDef.Builder<ListBandwidthPkgRequest, ListBandwidthPkgResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthPkgRequest.class, ListBandwidthPkgResponse.class)
                .withName("ListBandwidthPkg")
                .withUri("/v2/{project_id}/bandwidthpkgs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthPkgRequest::getLimit, ListBandwidthPkgRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPkgRequest::getMarker, ListBandwidthPkgRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthPkgRequest::getOffset, ListBandwidthPkgRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidths =
        genForListBandwidths();

    private static HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> genForListBandwidths() {
        // basic
        HttpRequestDef.Builder<ListBandwidthsRequest, ListBandwidthsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthsRequest.class, ListBandwidthsResponse.class)
                .withName("ListBandwidths")
                .withUri("/v1/{project_id}/bandwidths")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getMarker, ListBandwidthsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getLimit, ListBandwidthsRequest::setLimit));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getEnterpriseProjectId,
                ListBandwidthsRequest::setEnterpriseProjectId));
        builder.<ListBandwidthsRequest.ShareTypeEnum>withRequestField("share_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBandwidthsRequest.ShareTypeEnum.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getShareType, ListBandwidthsRequest::setShareType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasRequest::getType, ListQuotasRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidth =
        genForRemovePublicipsFromSharedBandwidth();

    private static HttpRequestDef<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> genForRemovePublicipsFromSharedBandwidth() {
        // basic
        HttpRequestDef.Builder<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RemovePublicipsFromSharedBandwidthRequest.class,
                    RemovePublicipsFromSharedBandwidthResponse.class)
                .withName("RemovePublicipsFromSharedBandwidth")
                .withUri("/v2.0/{project_id}/bandwidths/{bandwidth_id}/remove")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemovePublicipsFromSharedBandwidthRequest::getBandwidthId,
                RemovePublicipsFromSharedBandwidthRequest::setBandwidthId));
        builder.<RemovePublicipsFromSharedBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemovePublicipsFromSharedBandwidthRequestBody.class),
            f -> f.withMarshaller(RemovePublicipsFromSharedBandwidthRequest::getBody,
                RemovePublicipsFromSharedBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidth =
        genForShowBandwidth();

    private static HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> genForShowBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthRequest, ShowBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthRequest.class, ShowBandwidthResponse.class)
                .withName("ShowBandwidth")
                .withUri("/v1/{project_id}/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthRequest::getBandwidthId, ShowBandwidthRequest::setBandwidthId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidth =
        genForUpdateBandwidth();

    private static HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> genForUpdateBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthRequest, UpdateBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBandwidthRequest.class, UpdateBandwidthResponse.class)
                .withName("UpdateBandwidth")
                .withUri("/v1/{project_id}/bandwidths/{bandwidth_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBandwidthId, UpdateBandwidthRequest::setBandwidthId));
        builder.<UpdateBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBody, UpdateBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> updatePrePaidBandwidth =
        genForUpdatePrePaidBandwidth();

    private static HttpRequestDef<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> genForUpdatePrePaidBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePrePaidBandwidthRequest.class, UpdatePrePaidBandwidthResponse.class)
            .withName("UpdatePrePaidBandwidth")
            .withUri("/v2.0/{project_id}/bandwidths/{bandwidth_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrePaidBandwidthRequest::getBandwidthId,
                UpdatePrePaidBandwidthRequest::setBandwidthId));
        builder.<UpdatePrePaidBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrePaidBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdatePrePaidBandwidthRequest::getBody, UpdatePrePaidBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> batchCreatePublicipTags =
        genForBatchCreatePublicipTags();

    private static HttpRequestDef<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> genForBatchCreatePublicipTags() {
        // basic
        HttpRequestDef.Builder<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreatePublicipTagsRequest.class, BatchCreatePublicipTagsResponse.class)
            .withName("BatchCreatePublicipTags")
            .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreatePublicipTagsRequest::getPublicipId,
                BatchCreatePublicipTagsRequest::setPublicipId));
        builder.<BatchCreatePublicipTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreatePublicipTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreatePublicipTagsRequest::getBody, BatchCreatePublicipTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse> batchCreatePublicips =
        genForBatchCreatePublicips();

    private static HttpRequestDef<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse> genForBatchCreatePublicips() {
        // basic
        HttpRequestDef.Builder<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreatePublicipsRequest.class, BatchCreatePublicipsResponse.class)
            .withName("BatchCreatePublicips")
            .withUri("/v2/{project_id}/batchpublicips")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchCreatePublicipsV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreatePublicipsV2RequestBody.class),
            f -> f.withMarshaller(BatchCreatePublicipsRequest::getBody, BatchCreatePublicipsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse> batchDeletePublicIp =
        genForBatchDeletePublicIp();

    private static HttpRequestDef<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse> genForBatchDeletePublicIp() {
        // basic
        HttpRequestDef.Builder<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeletePublicIpRequest.class, BatchDeletePublicIpResponse.class)
            .withName("BatchDeletePublicIp")
            .withUri("/v2/{project_id}/batchpublicips")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeletePublicIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeletePublicIpRequestBody.class),
            f -> f.withMarshaller(BatchDeletePublicIpRequest::getBody, BatchDeletePublicIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> batchDeletePublicipTags =
        genForBatchDeletePublicipTags();

    private static HttpRequestDef<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> genForBatchDeletePublicipTags() {
        // basic
        HttpRequestDef.Builder<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeletePublicipTagsRequest.class, BatchDeletePublicipTagsResponse.class)
            .withName("BatchDeletePublicipTags")
            .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePublicipTagsRequest::getPublicipId,
                BatchDeletePublicipTagsRequest::setPublicipId));
        builder.<BatchDeletePublicipTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeletePublicipTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeletePublicipTagsRequest::getBody, BatchDeletePublicipTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse> batchDisassociatePublicips =
        genForBatchDisassociatePublicips();

    private static HttpRequestDef<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse> genForBatchDisassociatePublicips() {
        // basic
        HttpRequestDef.Builder<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    BatchDisassociatePublicipsRequest.class,
                    BatchDisassociatePublicipsResponse.class)
                .withName("BatchDisassociatePublicips")
                .withUri("/v2/{project_id}/batchpublicips")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeletePublicIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeletePublicIpRequestBody.class),
            f -> f.withMarshaller(BatchDisassociatePublicipsRequest::getBody,
                BatchDisassociatePublicipsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse> changePublicipToPeriod =
        genForChangePublicipToPeriod();

    private static HttpRequestDef<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse> genForChangePublicipToPeriod() {
        // basic
        HttpRequestDef.Builder<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangePublicipToPeriodRequest.class, ChangePublicipToPeriodResponse.class)
            .withName("ChangePublicipToPeriod")
            .withUri("/v2.0/{project_id}/publicips/change-to-period")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeToPeriodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeToPeriodReq.class),
            f -> f.withMarshaller(ChangePublicipToPeriodRequest::getBody, ChangePublicipToPeriodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountPublicIpRequest, CountPublicIpResponse> countPublicIp =
        genForCountPublicIp();

    private static HttpRequestDef<CountPublicIpRequest, CountPublicIpResponse> genForCountPublicIp() {
        // basic
        HttpRequestDef.Builder<CountPublicIpRequest, CountPublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountPublicIpRequest.class, CountPublicIpResponse.class)
                .withName("CountPublicIp")
                .withUri("/v2/{project_id}/elasticips")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse> countPublicIpInstance =
        genForCountPublicIpInstance();

    private static HttpRequestDef<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse> genForCountPublicIpInstance() {
        // basic
        HttpRequestDef.Builder<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CountPublicIpInstanceRequest.class, CountPublicIpInstanceResponse.class)
            .withName("CountPublicIpInstance")
            .withUri("/v2/{project_id}/publicip/instances")
            .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountPublicIpInstanceResponse::getBody, CountPublicIpInstanceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> createPrePaidPublicip =
        genForCreatePrePaidPublicip();

    private static HttpRequestDef<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> genForCreatePrePaidPublicip() {
        // basic
        HttpRequestDef.Builder<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePrePaidPublicipRequest.class, CreatePrePaidPublicipResponse.class)
            .withName("CreatePrePaidPublicip")
            .withUri("/v2.0/{project_id}/publicips")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatePrePaidPublicipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrePaidPublicipRequestBody.class),
            f -> f.withMarshaller(CreatePrePaidPublicipRequest::getBody, CreatePrePaidPublicipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicipRequest, CreatePublicipResponse> createPublicip =
        genForCreatePublicip();

    private static HttpRequestDef<CreatePublicipRequest, CreatePublicipResponse> genForCreatePublicip() {
        // basic
        HttpRequestDef.Builder<CreatePublicipRequest, CreatePublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublicipRequest.class, CreatePublicipResponse.class)
                .withName("CreatePublicip")
                .withUri("/v1/{project_id}/publicips")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatePublicipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicipRequestBody.class),
            f -> f.withMarshaller(CreatePublicipRequest::getBody, CreatePublicipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicipTagRequest, CreatePublicipTagResponse> createPublicipTag =
        genForCreatePublicipTag();

    private static HttpRequestDef<CreatePublicipTagRequest, CreatePublicipTagResponse> genForCreatePublicipTag() {
        // basic
        HttpRequestDef.Builder<CreatePublicipTagRequest, CreatePublicipTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublicipTagRequest.class, CreatePublicipTagResponse.class)
                .withName("CreatePublicipTag")
                .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePublicipTagRequest::getPublicipId, CreatePublicipTagRequest::setPublicipId));
        builder.<CreatePublicipTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicipTagRequestBody.class),
            f -> f.withMarshaller(CreatePublicipTagRequest::getBody, CreatePublicipTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicipRequest, DeletePublicipResponse> deletePublicip =
        genForDeletePublicip();

    private static HttpRequestDef<DeletePublicipRequest, DeletePublicipResponse> genForDeletePublicip() {
        // basic
        HttpRequestDef.Builder<DeletePublicipRequest, DeletePublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublicipRequest.class, DeletePublicipResponse.class)
                .withName("DeletePublicip")
                .withUri("/v1/{project_id}/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublicipRequest::getPublicipId, DeletePublicipRequest::setPublicipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicipTagRequest, DeletePublicipTagResponse> deletePublicipTag =
        genForDeletePublicipTag();

    private static HttpRequestDef<DeletePublicipTagRequest, DeletePublicipTagResponse> genForDeletePublicipTag() {
        // basic
        HttpRequestDef.Builder<DeletePublicipTagRequest, DeletePublicipTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublicipTagRequest.class, DeletePublicipTagResponse.class)
                .withName("DeletePublicipTag")
                .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublicipTagRequest::getPublicipId, DeletePublicipTagRequest::setPublicipId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublicipTagRequest::getKey, DeletePublicipTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipTagsRequest, ListPublicipTagsResponse> listPublicipTags =
        genForListPublicipTags();

    private static HttpRequestDef<ListPublicipTagsRequest, ListPublicipTagsResponse> genForListPublicipTags() {
        // basic
        HttpRequestDef.Builder<ListPublicipTagsRequest, ListPublicipTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicipTagsRequest.class, ListPublicipTagsResponse.class)
                .withName("ListPublicipTags")
                .withUri("/v2.0/{project_id}/publicips/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> listPublicips =
        genForListPublicips();

    private static HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> genForListPublicips() {
        // basic
        HttpRequestDef.Builder<ListPublicipsRequest, ListPublicipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicipsRequest.class, ListPublicipsResponse.class)
                .withName("ListPublicips")
                .withUri("/v1/{project_id}/publicips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getMarker, ListPublicipsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipsRequest::getLimit, ListPublicipsRequest::setLimit));
        builder.<ListPublicipsRequest.IpVersionEnum>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicipsRequest.IpVersionEnum.class),
            f -> f.withMarshaller(ListPublicipsRequest::getIpVersion, ListPublicipsRequest::setIpVersion));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getEnterpriseProjectId,
                ListPublicipsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPortId, ListPublicipsRequest::setPortId));
        builder.<List<String>>withRequestField("public_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpAddress, ListPublicipsRequest::setPublicIpAddress));
        builder.<List<String>>withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPrivateIpAddress,
                ListPublicipsRequest::setPrivateIpAddress));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getId, ListPublicipsRequest::setId));
        builder.<List<String>>withRequestField("allow_share_bandwidth_type_any",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAllowShareBandwidthTypeAny,
                ListPublicipsRequest::setAllowShareBandwidthTypeAny));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> listPublicipsByTags =
        genForListPublicipsByTags();

    private static HttpRequestDef<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> genForListPublicipsByTags() {
        // basic
        HttpRequestDef.Builder<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListPublicipsByTagsRequest.class, ListPublicipsByTagsResponse.class)
                .withName("ListPublicipsByTags")
                .withUri("/v2.0/{project_id}/publicips/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListPublicipsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListPublicipsByTagsRequestBody.class),
            f -> f.withMarshaller(ListPublicipsByTagsRequest::getBody, ListPublicipsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse> showPublicIpType =
        genForShowPublicIpType();

    private static HttpRequestDef<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse> genForShowPublicIpType() {
        // basic
        HttpRequestDef.Builder<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicIpTypeRequest.class, ShowPublicIpTypeResponse.class)
                .withName("ShowPublicIpType")
                .withUri("/v2/{project_id}/publicip_types")
                .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPublicIpTypeResponse::getBody, ShowPublicIpTypeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipRequest, ShowPublicipResponse> showPublicip = genForShowPublicip();

    private static HttpRequestDef<ShowPublicipRequest, ShowPublicipResponse> genForShowPublicip() {
        // basic
        HttpRequestDef.Builder<ShowPublicipRequest, ShowPublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicipRequest.class, ShowPublicipResponse.class)
                .withName("ShowPublicip")
                .withUri("/v1/{project_id}/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipRequest::getPublicipId, ShowPublicipRequest::setPublicipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipTagsRequest, ShowPublicipTagsResponse> showPublicipTags =
        genForShowPublicipTags();

    private static HttpRequestDef<ShowPublicipTagsRequest, ShowPublicipTagsResponse> genForShowPublicipTags() {
        // basic
        HttpRequestDef.Builder<ShowPublicipTagsRequest, ShowPublicipTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicipTagsRequest.class, ShowPublicipTagsResponse.class)
                .withName("ShowPublicipTags")
                .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicipTagsRequest::getPublicipId, ShowPublicipTagsRequest::setPublicipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicip =
        genForUpdatePublicip();

    private static HttpRequestDef<UpdatePublicipRequest, UpdatePublicipResponse> genForUpdatePublicip() {
        // basic
        HttpRequestDef.Builder<UpdatePublicipRequest, UpdatePublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePublicipRequest.class, UpdatePublicipResponse.class)
                .withName("UpdatePublicip")
                .withUri("/v1/{project_id}/publicips/{publicip_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicipRequest::getPublicipId, UpdatePublicipRequest::setPublicipId));
        builder.<UpdatePublicipsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicipsRequestBody.class),
            f -> f.withMarshaller(UpdatePublicipRequest::getBody, UpdatePublicipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse> showResourcesJobDetail =
        genForShowResourcesJobDetail();

    private static HttpRequestDef<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse> genForShowResourcesJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourcesJobDetailRequest.class, ShowResourcesJobDetailResponse.class)
            .withName("ShowResourcesJobDetail")
            .withUri("/v1/{project_id}/jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourcesJobDetailRequest::getJobId, ShowResourcesJobDetailRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> neutronCreateFloatingIp =
        genForNeutronCreateFloatingIp();

    private static HttpRequestDef<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> genForNeutronCreateFloatingIp() {
        // basic
        HttpRequestDef.Builder<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, NeutronCreateFloatingIpRequest.class, NeutronCreateFloatingIpResponse.class)
            .withName("NeutronCreateFloatingIp")
            .withUri("/v2.0/floatingips")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateFloatingIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateFloatingIpRequestBody.class),
            f -> f.withMarshaller(NeutronCreateFloatingIpRequest::getBody, NeutronCreateFloatingIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIp =
        genForNeutronDeleteFloatingIp();

    private static HttpRequestDef<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> genForNeutronDeleteFloatingIp() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, NeutronDeleteFloatingIpRequest.class, NeutronDeleteFloatingIpResponse.class)
            .withName("NeutronDeleteFloatingIp")
            .withUri("/v2.0/floatingips/{floatingip_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteFloatingIpRequest::getFloatingipId,
                NeutronDeleteFloatingIpRequest::setFloatingipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> neutronListFloatingIps =
        genForNeutronListFloatingIps();

    private static HttpRequestDef<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> genForNeutronListFloatingIps() {
        // basic
        HttpRequestDef.Builder<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, NeutronListFloatingIpsRequest.class, NeutronListFloatingIpsResponse.class)
            .withName("NeutronListFloatingIps")
            .withUri("/v2.0/floatingips")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getLimit, NeutronListFloatingIpsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getMarker, NeutronListFloatingIpsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getPageReverse,
                NeutronListFloatingIpsRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getId, NeutronListFloatingIpsRequest::setId));
        builder.<String>withRequestField("floating_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFloatingIpAddress,
                NeutronListFloatingIpsRequest::setFloatingIpAddress));
        builder.<String>withRequestField("router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getRouterId,
                NeutronListFloatingIpsRequest::setRouterId));
        builder.<String>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getPortId, NeutronListFloatingIpsRequest::setPortId));
        builder.<String>withRequestField("fixed_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFixedIpAddress,
                NeutronListFloatingIpsRequest::setFixedIpAddress));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getTenantId,
                NeutronListFloatingIpsRequest::setTenantId));
        builder.<String>withRequestField("floating_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFloatingNetworkId,
                NeutronListFloatingIpsRequest::setFloatingNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> neutronShowFloatingIp =
        genForNeutronShowFloatingIp();

    private static HttpRequestDef<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> genForNeutronShowFloatingIp() {
        // basic
        HttpRequestDef.Builder<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, NeutronShowFloatingIpRequest.class, NeutronShowFloatingIpResponse.class)
            .withName("NeutronShowFloatingIp")
            .withUri("/v2.0/floatingips/{floatingip_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowFloatingIpRequest::getFloatingipId,
                NeutronShowFloatingIpRequest::setFloatingipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIp =
        genForNeutronUpdateFloatingIp();

    private static HttpRequestDef<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> genForNeutronUpdateFloatingIp() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, NeutronUpdateFloatingIpRequest.class, NeutronUpdateFloatingIpResponse.class)
            .withName("NeutronUpdateFloatingIp")
            .withUri("/v2.0/floatingips/{floatingip_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdateFloatingIpRequest::getFloatingipId,
                NeutronUpdateFloatingIpRequest::setFloatingipId));
        builder.<NeutronUpdateFloatingIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateFloatingIpRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateFloatingIpRequest::getBody, NeutronUpdateFloatingIpRequest::setBody));

        // response

        return builder.build();
    }

}
