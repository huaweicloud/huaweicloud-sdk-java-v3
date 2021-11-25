package com.huaweicloud.sdk.sfsturbo.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sfsturbo.v1.model.*;

@SuppressWarnings("unchecked")
public class SFSTurboMeta {

    public static final HttpRequestDef<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> batchAddSharedTags =
        genForbatchAddSharedTags();

    private static HttpRequestDef<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> genForbatchAddSharedTags() {
        // basic
        HttpRequestDef.Builder<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddSharedTagsRequest.class, BatchAddSharedTagsResponse.class)
                .withName("BatchAddSharedTags")
                .withUri("/v1/{project_id}/sfs-turbo/{share_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddSharedTagsRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<BatchAddSharedTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddSharedTagsRequestBody.class),
            f -> f.withMarshaller(BatchAddSharedTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroup =
        genForchangeSecurityGroup();

    private static HttpRequestDef<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> genForchangeSecurityGroup() {
        // basic
        HttpRequestDef.Builder<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeSecurityGroupRequest.class, ChangeSecurityGroupResponse.class)
                .withName("ChangeSecurityGroup")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeSecurityGroupRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<ChangeSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSecurityGroupRequestBody.class),
            f -> f.withMarshaller(ChangeSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShareRequest, CreateShareResponse> createShare = genForcreateShare();

    private static HttpRequestDef<CreateShareRequest, CreateShareResponse> genForcreateShare() {
        // basic
        HttpRequestDef.Builder<CreateShareRequest, CreateShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateShareRequest.class, CreateShareResponse.class)
                .withName("CreateShare")
                .withUri("/v1/{project_id}/sfs-turbo/shares")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateShareRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateShareRequestBody.class),
            f -> f.withMarshaller(CreateShareRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSharedTagRequest, CreateSharedTagResponse> createSharedTag =
        genForcreateSharedTag();

    private static HttpRequestDef<CreateSharedTagRequest, CreateSharedTagResponse> genForcreateSharedTag() {
        // basic
        HttpRequestDef.Builder<CreateSharedTagRequest, CreateSharedTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSharedTagRequest.class, CreateSharedTagResponse.class)
                .withName("CreateSharedTag")
                .withUri("/v1/{project_id}/sfs-turbo/{share_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSharedTagRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<CreateSharedTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSharedTagRequestBody.class),
            f -> f.withMarshaller(CreateSharedTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteShareRequest, DeleteShareResponse> deleteShare = genFordeleteShare();

    private static HttpRequestDef<DeleteShareRequest, DeleteShareResponse> genFordeleteShare() {
        // basic
        HttpRequestDef.Builder<DeleteShareRequest, DeleteShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteShareRequest.class, DeleteShareResponse.class)
                .withName("DeleteShare")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteShareRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSharedTagRequest, DeleteSharedTagResponse> deleteSharedTag =
        genFordeleteSharedTag();

    private static HttpRequestDef<DeleteSharedTagRequest, DeleteSharedTagResponse> genFordeleteSharedTag() {
        // basic
        HttpRequestDef.Builder<DeleteSharedTagRequest, DeleteSharedTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSharedTagRequest.class, DeleteSharedTagResponse.class)
                .withName("DeleteSharedTag")
                .withUri("/v1/{project_id}/sfs-turbo/{share_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSharedTagRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSharedTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandShareRequest, ExpandShareResponse> expandShare = genForexpandShare();

    private static HttpRequestDef<ExpandShareRequest, ExpandShareResponse> genForexpandShare() {
        // basic
        HttpRequestDef.Builder<ExpandShareRequest, ExpandShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandShareRequest.class, ExpandShareResponse.class)
                .withName("ExpandShare")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandShareRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<ExpandShareRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandShareRequestBody.class),
            f -> f.withMarshaller(ExpandShareRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSharedTagsRequest, ListSharedTagsResponse> listSharedTags =
        genForlistSharedTags();

    private static HttpRequestDef<ListSharedTagsRequest, ListSharedTagsResponse> genForlistSharedTags() {
        // basic
        HttpRequestDef.Builder<ListSharedTagsRequest, ListSharedTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSharedTagsRequest.class, ListSharedTagsResponse.class)
                .withName("ListSharedTags")
                .withUri("/v1/{project_id}/sfs-turbo/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSharesRequest, ListSharesResponse> listShares = genForlistShares();

    private static HttpRequestDef<ListSharesRequest, ListSharesResponse> genForlistShares() {
        // basic
        HttpRequestDef.Builder<ListSharesRequest, ListSharesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSharesRequest.class, ListSharesResponse.class)
                .withName("ListShares")
                .withUri("/v1/{project_id}/sfs-turbo/shares/detail")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSharesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSharesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShareRequest, ShowShareResponse> showShare = genForshowShare();

    private static HttpRequestDef<ShowShareRequest, ShowShareResponse> genForshowShare() {
        // basic
        HttpRequestDef.Builder<ShowShareRequest, ShowShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowShareRequest.class, ShowShareResponse.class)
                .withName("ShowShare")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShareRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSharedTagsRequest, ShowSharedTagsResponse> showSharedTags =
        genForshowSharedTags();

    private static HttpRequestDef<ShowSharedTagsRequest, ShowSharedTagsResponse> genForshowSharedTags() {
        // basic
        HttpRequestDef.Builder<ShowSharedTagsRequest, ShowSharedTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSharedTagsRequest.class, ShowSharedTagsResponse.class)
                .withName("ShowSharedTags")
                .withUri("/v1/{project_id}/sfs-turbo/{share_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSharedTagsRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));

        // response

        return builder.build();
    }

}
