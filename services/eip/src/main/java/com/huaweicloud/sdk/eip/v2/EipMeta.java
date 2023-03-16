package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eip.v2.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class EipMeta {

    public static final HttpRequestDef<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidth =
        genForaddPublicipsIntoSharedBandwidth();

    private static HttpRequestDef<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> genForaddPublicipsIntoSharedBandwidth() {
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
            f -> f.withMarshaller(AddPublicipsIntoSharedBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));
        builder.<AddPublicipsIntoSharedBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddPublicipsIntoSharedBandwidthRequestBody.class),
            f -> f.withMarshaller(AddPublicipsIntoSharedBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidths =
        genForbatchCreateSharedBandwidths();

    private static HttpRequestDef<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> genForbatchCreateSharedBandwidths() {
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
            f -> f.withMarshaller(BatchCreateSharedBandwidthsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse> changeBandwidthToPeriod =
        genForchangeBandwidthToPeriod();

    private static HttpRequestDef<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse> genForchangeBandwidthToPeriod() {
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
            f -> f.withMarshaller(ChangeBandwidthToPeriodRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> createSharedBandwidth =
        genForcreateSharedBandwidth();

    private static HttpRequestDef<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> genForcreateSharedBandwidth() {
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
            f -> f.withMarshaller(CreateSharedBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> deleteSharedBandwidth =
        genFordeleteSharedBandwidth();

    private static HttpRequestDef<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> genFordeleteSharedBandwidth() {
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
            f -> f.withMarshaller(DeleteSharedBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthPkgRequest, ListBandwidthPkgResponse> listBandwidthPkg =
        genForlistBandwidthPkg();

    private static HttpRequestDef<ListBandwidthPkgRequest, ListBandwidthPkgResponse> genForlistBandwidthPkg() {
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
            f -> f.withMarshaller(ListBandwidthPkgRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthPkgRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthPkgRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidths =
        genForlistBandwidths();

    private static HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> genForlistBandwidths() {
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
            f -> f.withMarshaller(ListBandwidthsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<ListBandwidthsRequest.ShareTypeEnum>withRequestField("share_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBandwidthsRequest.ShareTypeEnum.class),
            f -> f.withMarshaller(ListBandwidthsRequest::getShareType, (req, v) -> {
                req.setShareType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForlistQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForlistQuotas() {
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
            f -> f.withMarshaller(ListQuotasRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidth =
        genForremovePublicipsFromSharedBandwidth();

    private static HttpRequestDef<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> genForremovePublicipsFromSharedBandwidth() {
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
            f -> f.withMarshaller(RemovePublicipsFromSharedBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));
        builder.<RemovePublicipsFromSharedBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemovePublicipsFromSharedBandwidthRequestBody.class),
            f -> f.withMarshaller(RemovePublicipsFromSharedBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidth =
        genForshowBandwidth();

    private static HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> genForshowBandwidth() {
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
            f -> f.withMarshaller(ShowBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidth =
        genForupdateBandwidth();

    private static HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> genForupdateBandwidth() {
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
            f -> f.withMarshaller(UpdateBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));
        builder.<UpdateBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> updatePrePaidBandwidth =
        genForupdatePrePaidBandwidth();

    private static HttpRequestDef<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> genForupdatePrePaidBandwidth() {
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
            f -> f.withMarshaller(UpdatePrePaidBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            }));
        builder.<UpdatePrePaidBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrePaidBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdatePrePaidBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> batchCreatePublicipTags =
        genForbatchCreatePublicipTags();

    private static HttpRequestDef<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> genForbatchCreatePublicipTags() {
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
            f -> f.withMarshaller(BatchCreatePublicipTagsRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<BatchCreatePublicipTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreatePublicipTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreatePublicipTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse> batchCreatePublicips =
        genForbatchCreatePublicips();

    private static HttpRequestDef<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse> genForbatchCreatePublicips() {
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
            f -> f.withMarshaller(BatchCreatePublicipsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse> batchDeletePublicIp =
        genForbatchDeletePublicIp();

    private static HttpRequestDef<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse> genForbatchDeletePublicIp() {
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
            f -> f.withMarshaller(BatchDeletePublicIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> batchDeletePublicipTags =
        genForbatchDeletePublicipTags();

    private static HttpRequestDef<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> genForbatchDeletePublicipTags() {
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
            f -> f.withMarshaller(BatchDeletePublicipTagsRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<BatchDeletePublicipTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeletePublicipTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeletePublicipTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse> batchDisassociatePublicips =
        genForbatchDisassociatePublicips();

    private static HttpRequestDef<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse> genForbatchDisassociatePublicips() {
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
            f -> f.withMarshaller(BatchDisassociatePublicipsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse> changePublicipToPeriod =
        genForchangePublicipToPeriod();

    private static HttpRequestDef<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse> genForchangePublicipToPeriod() {
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
            f -> f.withMarshaller(ChangePublicipToPeriodRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountPublicIpRequest, CountPublicIpResponse> countPublicIp =
        genForcountPublicIp();

    private static HttpRequestDef<CountPublicIpRequest, CountPublicIpResponse> genForcountPublicIp() {
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
        genForcountPublicIpInstance();

    private static HttpRequestDef<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse> genForcountPublicIpInstance() {
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
            f -> f.withMarshaller(CountPublicIpInstanceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> createPrePaidPublicip =
        genForcreatePrePaidPublicip();

    private static HttpRequestDef<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> genForcreatePrePaidPublicip() {
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
            f -> f.withMarshaller(CreatePrePaidPublicipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicipRequest, CreatePublicipResponse> createPublicip =
        genForcreatePublicip();

    private static HttpRequestDef<CreatePublicipRequest, CreatePublicipResponse> genForcreatePublicip() {
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
            f -> f.withMarshaller(CreatePublicipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicipTagRequest, CreatePublicipTagResponse> createPublicipTag =
        genForcreatePublicipTag();

    private static HttpRequestDef<CreatePublicipTagRequest, CreatePublicipTagResponse> genForcreatePublicipTag() {
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
            f -> f.withMarshaller(CreatePublicipTagRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<CreatePublicipTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicipTagRequestBody.class),
            f -> f.withMarshaller(CreatePublicipTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicipRequest, DeletePublicipResponse> deletePublicip =
        genFordeletePublicip();

    private static HttpRequestDef<DeletePublicipRequest, DeletePublicipResponse> genFordeletePublicip() {
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
            f -> f.withMarshaller(DeletePublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicipTagRequest, DeletePublicipTagResponse> deletePublicipTag =
        genFordeletePublicipTag();

    private static HttpRequestDef<DeletePublicipTagRequest, DeletePublicipTagResponse> genFordeletePublicipTag() {
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
            f -> f.withMarshaller(DeletePublicipTagRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublicipTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipTagsRequest, ListPublicipTagsResponse> listPublicipTags =
        genForlistPublicipTags();

    private static HttpRequestDef<ListPublicipTagsRequest, ListPublicipTagsResponse> genForlistPublicipTags() {
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
        genForlistPublicips();

    private static HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> genForlistPublicips() {
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
            f -> f.withMarshaller(ListPublicipsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicipsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListPublicipsRequest.IpVersionEnum>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicipsRequest.IpVersionEnum.class),
            f -> f.withMarshaller(ListPublicipsRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicipsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));
        builder.<List<String>>withRequestField("public_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpAddress, (req, v) -> {
                req.setPublicIpAddress(v);
            }));
        builder.<List<String>>withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getPrivateIpAddress, (req, v) -> {
                req.setPrivateIpAddress(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("allow_share_bandwidth_type_any",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPublicipsRequest::getAllowShareBandwidthTypeAny, (req, v) -> {
                req.setAllowShareBandwidthTypeAny(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> listPublicipsByTags =
        genForlistPublicipsByTags();

    private static HttpRequestDef<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> genForlistPublicipsByTags() {
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
            f -> f.withMarshaller(ListPublicipsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse> showPublicIpType =
        genForshowPublicIpType();

    private static HttpRequestDef<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse> genForshowPublicIpType() {
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
            f -> f.withMarshaller(ShowPublicIpTypeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipRequest, ShowPublicipResponse> showPublicip = genForshowPublicip();

    private static HttpRequestDef<ShowPublicipRequest, ShowPublicipResponse> genForshowPublicip() {
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
            f -> f.withMarshaller(ShowPublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipTagsRequest, ShowPublicipTagsResponse> showPublicipTags =
        genForshowPublicipTags();

    private static HttpRequestDef<ShowPublicipTagsRequest, ShowPublicipTagsResponse> genForshowPublicipTags() {
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
            f -> f.withMarshaller(ShowPublicipTagsRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicip =
        genForupdatePublicip();

    private static HttpRequestDef<UpdatePublicipRequest, UpdatePublicipResponse> genForupdatePublicip() {
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
            f -> f.withMarshaller(UpdatePublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            }));
        builder.<UpdatePublicipsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicipsRequestBody.class),
            f -> f.withMarshaller(UpdatePublicipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse> showResourcesJobDetail =
        genForshowResourcesJobDetail();

    private static HttpRequestDef<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse> genForshowResourcesJobDetail() {
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
            f -> f.withMarshaller(ShowResourcesJobDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> neutronCreateFloatingIp =
        genForneutronCreateFloatingIp();

    private static HttpRequestDef<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> genForneutronCreateFloatingIp() {
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
            f -> f.withMarshaller(NeutronCreateFloatingIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIp =
        genForneutronDeleteFloatingIp();

    private static HttpRequestDef<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> genForneutronDeleteFloatingIp() {
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
            f -> f.withMarshaller(NeutronDeleteFloatingIpRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> neutronListFloatingIps =
        genForneutronListFloatingIps();

    private static HttpRequestDef<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> genForneutronListFloatingIps() {
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
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("floating_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFloatingIpAddress, (req, v) -> {
                req.setFloatingIpAddress(v);
            }));
        builder.<String>withRequestField("router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getRouterId, (req, v) -> {
                req.setRouterId(v);
            }));
        builder.<String>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));
        builder.<String>withRequestField("fixed_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFixedIpAddress, (req, v) -> {
                req.setFixedIpAddress(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("floating_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFloatingNetworkId, (req, v) -> {
                req.setFloatingNetworkId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> neutronShowFloatingIp =
        genForneutronShowFloatingIp();

    private static HttpRequestDef<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> genForneutronShowFloatingIp() {
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
            f -> f.withMarshaller(NeutronShowFloatingIpRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIp =
        genForneutronUpdateFloatingIp();

    private static HttpRequestDef<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> genForneutronUpdateFloatingIp() {
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
            f -> f.withMarshaller(NeutronUpdateFloatingIpRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            }));
        builder.<NeutronUpdateFloatingIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateFloatingIpRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateFloatingIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
