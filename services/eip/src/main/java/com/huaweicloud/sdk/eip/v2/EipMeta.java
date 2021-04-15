package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eip.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class EipMeta {

    public static final HttpRequestDef<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidth = genForaddPublicipsIntoSharedBandwidth();

    private static HttpRequestDef<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> genForaddPublicipsIntoSharedBandwidth() {
        // basic
        HttpRequestDef.Builder<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddPublicipsIntoSharedBandwidthRequest.class, AddPublicipsIntoSharedBandwidthResponse.class)
                .withName("AddPublicipsIntoSharedBandwidth")
                .withUri("/v2.0/{project_id}/bandwidths/{bandwidth_id}/insert")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddPublicipsIntoSharedBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddPublicipsIntoSharedBandwidthRequestBody.class,
            f -> f.withMarshaller(AddPublicipsIntoSharedBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidths = genForbatchCreateSharedBandwidths();

    private static HttpRequestDef<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> genForbatchCreateSharedBandwidths() {
        // basic
        HttpRequestDef.Builder<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateSharedBandwidthsRequest.class, BatchCreateSharedBandwidthsResponse.class)
                .withName("BatchCreateSharedBandwidths")
                .withUri("/v2.0/{project_id}/batch-bandwidths")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateBandwidthRequestBody.class,
            f -> f.withMarshaller(BatchCreateSharedBandwidthsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> createSharedBandwidth = genForcreateSharedBandwidth();

    private static HttpRequestDef<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> genForcreateSharedBandwidth() {
        // basic
        HttpRequestDef.Builder<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSharedBandwidthRequest.class, CreateSharedBandwidthResponse.class)
                .withName("CreateSharedBandwidth")
                .withUri("/v2.0/{project_id}/bandwidths")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSharedBandwidhRequestBody.class,
            f -> f.withMarshaller(CreateSharedBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> deleteSharedBandwidth = genFordeleteSharedBandwidth();

    private static HttpRequestDef<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> genFordeleteSharedBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSharedBandwidthRequest.class, DeleteSharedBandwidthResponse.class)
                .withName("DeleteSharedBandwidth")
                .withUri("/v2.0/{project_id}/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSharedBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidths = genForlistBandwidths();

    private static HttpRequestDef<ListBandwidthsRequest, ListBandwidthsResponse> genForlistBandwidths() {
        // basic
        HttpRequestDef.Builder<ListBandwidthsRequest, ListBandwidthsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthsRequest.class, ListBandwidthsResponse.class)
                .withName("ListBandwidths")
                .withUri("/v1/{project_id}/bandwidths")
                .withContentType("application/json");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBandwidthsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("share_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBandwidthsRequest.ShareTypeEnum.class,
            f -> f.withMarshaller(ListBandwidthsRequest::getShareType, (req, v) -> {
                req.setShareType(v);
            })
        );

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
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQuotasRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidth = genForremovePublicipsFromSharedBandwidth();

    private static HttpRequestDef<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> genForremovePublicipsFromSharedBandwidth() {
        // basic
        HttpRequestDef.Builder<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemovePublicipsFromSharedBandwidthRequest.class, RemovePublicipsFromSharedBandwidthResponse.class)
                .withName("RemovePublicipsFromSharedBandwidth")
                .withUri("/v2.0/{project_id}/bandwidths/{bandwidth_id}/remove")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemovePublicipsFromSharedBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RemovePublicipsFromSharedBandwidthRequestBody.class,
            f -> f.withMarshaller(RemovePublicipsFromSharedBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidth = genForshowBandwidth();

    private static HttpRequestDef<ShowBandwidthRequest, ShowBandwidthResponse> genForshowBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthRequest, ShowBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthRequest.class, ShowBandwidthResponse.class)
                .withName("ShowBandwidth")
                .withUri("/v1/{project_id}/bandwidths/{bandwidth_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidth = genForupdateBandwidth();

    private static HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> genForupdateBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthRequest, UpdateBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBandwidthRequest.class, UpdateBandwidthResponse.class)
                .withName("UpdateBandwidth")
                .withUri("/v1/{project_id}/bandwidths/{bandwidth_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateBandwidthRequestBody.class,
            f -> f.withMarshaller(UpdateBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> updatePrePaidBandwidth = genForupdatePrePaidBandwidth();

    private static HttpRequestDef<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> genForupdatePrePaidBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrePaidBandwidthRequest.class, UpdatePrePaidBandwidthResponse.class)
                .withName("UpdatePrePaidBandwidth")
                .withUri("/v2.0/{project_id}/bandwidths/{bandwidth_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePrePaidBandwidthRequest::getBandwidthId, (req, v) -> {
                req.setBandwidthId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePrePaidBandwidthRequestBody.class,
            f -> f.withMarshaller(UpdatePrePaidBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> batchCreatePublicipTags = genForbatchCreatePublicipTags();

    private static HttpRequestDef<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> genForbatchCreatePublicipTags() {
        // basic
        HttpRequestDef.Builder<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreatePublicipTagsRequest.class, BatchCreatePublicipTagsResponse.class)
                .withName("BatchCreatePublicipTags")
                .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreatePublicipTagsRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreatePublicipTagsRequestBody.class,
            f -> f.withMarshaller(BatchCreatePublicipTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> batchDeletePublicipTags = genForbatchDeletePublicipTags();

    private static HttpRequestDef<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> genForbatchDeletePublicipTags() {
        // basic
        HttpRequestDef.Builder<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeletePublicipTagsRequest.class, BatchDeletePublicipTagsResponse.class)
                .withName("BatchDeletePublicipTags")
                .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeletePublicipTagsRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeletePublicipTagsRequestBody.class,
            f -> f.withMarshaller(BatchDeletePublicipTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> createPrePaidPublicip = genForcreatePrePaidPublicip();

    private static HttpRequestDef<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> genForcreatePrePaidPublicip() {
        // basic
        HttpRequestDef.Builder<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrePaidPublicipRequest.class, CreatePrePaidPublicipResponse.class)
                .withName("CreatePrePaidPublicip")
                .withUri("/v2.0/{project_id}/publicips")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePrePaidPublicipRequestBody.class,
            f -> f.withMarshaller(CreatePrePaidPublicipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicipRequest, CreatePublicipResponse> createPublicip = genForcreatePublicip();

    private static HttpRequestDef<CreatePublicipRequest, CreatePublicipResponse> genForcreatePublicip() {
        // basic
        HttpRequestDef.Builder<CreatePublicipRequest, CreatePublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublicipRequest.class, CreatePublicipResponse.class)
                .withName("CreatePublicip")
                .withUri("/v1/{project_id}/publicips")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePublicipRequestBody.class,
            f -> f.withMarshaller(CreatePublicipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicipTagRequest, CreatePublicipTagResponse> createPublicipTag = genForcreatePublicipTag();

    private static HttpRequestDef<CreatePublicipTagRequest, CreatePublicipTagResponse> genForcreatePublicipTag() {
        // basic
        HttpRequestDef.Builder<CreatePublicipTagRequest, CreatePublicipTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublicipTagRequest.class, CreatePublicipTagResponse.class)
                .withName("CreatePublicipTag")
                .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreatePublicipTagRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePublicipTagRequestBody.class,
            f -> f.withMarshaller(CreatePublicipTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicipRequest, DeletePublicipResponse> deletePublicip = genFordeletePublicip();

    private static HttpRequestDef<DeletePublicipRequest, DeletePublicipResponse> genFordeletePublicip() {
        // basic
        HttpRequestDef.Builder<DeletePublicipRequest, DeletePublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublicipRequest.class, DeletePublicipResponse.class)
                .withName("DeletePublicip")
                .withUri("/v1/{project_id}/publicips/{publicip_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicipTagRequest, DeletePublicipTagResponse> deletePublicipTag = genFordeletePublicipTag();

    private static HttpRequestDef<DeletePublicipTagRequest, DeletePublicipTagResponse> genFordeletePublicipTag() {
        // basic
        HttpRequestDef.Builder<DeletePublicipTagRequest, DeletePublicipTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublicipTagRequest.class, DeletePublicipTagResponse.class)
                .withName("DeletePublicipTag")
                .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePublicipTagRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            })
        );
        builder.withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePublicipTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipTagsRequest, ListPublicipTagsResponse> listPublicipTags = genForlistPublicipTags();

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

    public static final HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> listPublicips = genForlistPublicips();

    private static HttpRequestDef<ListPublicipsRequest, ListPublicipsResponse> genForlistPublicips() {
        // basic
        HttpRequestDef.Builder<ListPublicipsRequest, ListPublicipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicipsRequest.class, ListPublicipsResponse.class)
                .withName("ListPublicips")
                .withUri("/v1/{project_id}/publicips")
                .withContentType("application/json");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPublicipsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPublicipsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListPublicipsRequest.IpVersionEnum.class,
            f -> f.withMarshaller(ListPublicipsRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPublicipsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListPublicipsRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            })
        );
        builder.withRequestField("public_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListPublicipsRequest::getPublicIpAddress, (req, v) -> {
                req.setPublicIpAddress(v);
            })
        );
        builder.withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListPublicipsRequest::getPrivateIpAddress, (req, v) -> {
                req.setPrivateIpAddress(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListPublicipsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> listPublicipsByTags = genForlistPublicipsByTags();

    private static HttpRequestDef<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> genForlistPublicipsByTags() {
        // basic
        HttpRequestDef.Builder<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListPublicipsByTagsRequest.class, ListPublicipsByTagsResponse.class)
                .withName("ListPublicipsByTags")
                .withUri("/v2.0/{project_id}/publicips/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListPublicipsByTagsRequestBody.class,
            f -> f.withMarshaller(ListPublicipsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


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
        builder.withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicipTagsRequest, ShowPublicipTagsResponse> showPublicipTags = genForshowPublicipTags();

    private static HttpRequestDef<ShowPublicipTagsRequest, ShowPublicipTagsResponse> genForshowPublicipTags() {
        // basic
        HttpRequestDef.Builder<ShowPublicipTagsRequest, ShowPublicipTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicipTagsRequest.class, ShowPublicipTagsResponse.class)
                .withName("ShowPublicipTags")
                .withUri("/v2.0/{project_id}/publicips/{publicip_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPublicipTagsRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicip = genForupdatePublicip();

    private static HttpRequestDef<UpdatePublicipRequest, UpdatePublicipResponse> genForupdatePublicip() {
        // basic
        HttpRequestDef.Builder<UpdatePublicipRequest, UpdatePublicipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePublicipRequest.class, UpdatePublicipResponse.class)
                .withName("UpdatePublicip")
                .withUri("/v1/{project_id}/publicips/{publicip_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("publicip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePublicipRequest::getPublicipId, (req, v) -> {
                req.setPublicipId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePublicipsRequestBody.class,
            f -> f.withMarshaller(UpdatePublicipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> neutronCreateFloatingIp = genForneutronCreateFloatingIp();

    private static HttpRequestDef<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> genForneutronCreateFloatingIp() {
        // basic
        HttpRequestDef.Builder<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NeutronCreateFloatingIpRequest.class, NeutronCreateFloatingIpResponse.class)
                .withName("NeutronCreateFloatingIp")
                .withUri("/v2.0/floatingips")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronCreateFloatingIpRequestBody.class,
            f -> f.withMarshaller(NeutronCreateFloatingIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIp = genForneutronDeleteFloatingIp();

    private static HttpRequestDef<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> genForneutronDeleteFloatingIp() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NeutronDeleteFloatingIpRequest.class, NeutronDeleteFloatingIpResponse.class)
                .withName("NeutronDeleteFloatingIp")
                .withUri("/v2.0/floatingips/{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronDeleteFloatingIpRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> neutronListFloatingIps = genForneutronListFloatingIps();

    private static HttpRequestDef<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> genForneutronListFloatingIps() {
        // basic
        HttpRequestDef.Builder<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronListFloatingIpsRequest.class, NeutronListFloatingIpsResponse.class)
                .withName("NeutronListFloatingIps")
                .withUri("/v2.0/floatingips")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("floating_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFloatingIpAddress, (req, v) -> {
                req.setFloatingIpAddress(v);
            })
        );
        builder.withRequestField("router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getRouterId, (req, v) -> {
                req.setRouterId(v);
            })
        );
        builder.withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            })
        );
        builder.withRequestField("fixed_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFixedIpAddress, (req, v) -> {
                req.setFixedIpAddress(v);
            })
        );
        builder.withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            })
        );
        builder.withRequestField("floating_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFloatingIpsRequest::getFloatingNetworkId, (req, v) -> {
                req.setFloatingNetworkId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> neutronShowFloatingIp = genForneutronShowFloatingIp();

    private static HttpRequestDef<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> genForneutronShowFloatingIp() {
        // basic
        HttpRequestDef.Builder<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronShowFloatingIpRequest.class, NeutronShowFloatingIpResponse.class)
                .withName("NeutronShowFloatingIp")
                .withUri("/v2.0/floatingips/{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronShowFloatingIpRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIp = genForneutronUpdateFloatingIp();

    private static HttpRequestDef<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> genForneutronUpdateFloatingIp() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronUpdateFloatingIpRequest.class, NeutronUpdateFloatingIpResponse.class)
                .withName("NeutronUpdateFloatingIp")
                .withUri("/v2.0/floatingips/{floatingip_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronUpdateFloatingIpRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronUpdateFloatingIpRequestBody.class,
            f -> f.withMarshaller(NeutronUpdateFloatingIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
