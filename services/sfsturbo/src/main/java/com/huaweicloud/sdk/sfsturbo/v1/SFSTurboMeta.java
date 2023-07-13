package com.huaweicloud.sdk.sfsturbo.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sfsturbo.v1.model.BatchAddSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.BatchAddSharedTagsRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.BatchAddSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeSecurityGroupRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeSecurityGroupResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeShareNameReq;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeShareNameRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeShareNameResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteSharedTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteSharedTagResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaResponse;

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

    public static final HttpRequestDef<ChangeShareNameRequest, ChangeShareNameResponse> changeShareName =
        genForchangeShareName();

    private static HttpRequestDef<ChangeShareNameRequest, ChangeShareNameResponse> genForchangeShareName() {
        // basic
        HttpRequestDef.Builder<ChangeShareNameRequest, ChangeShareNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeShareNameRequest.class, ChangeShareNameResponse.class)
                .withName("ChangeShareName")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeShareNameRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<ChangeShareNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeShareNameReq.class),
            f -> f.withMarshaller(ChangeShareNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFsDirRequest, CreateFsDirResponse> createFsDir = genForcreateFsDir();

    private static HttpRequestDef<CreateFsDirRequest, CreateFsDirResponse> genForcreateFsDir() {
        // basic
        HttpRequestDef.Builder<CreateFsDirRequest, CreateFsDirResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFsDirRequest.class, CreateFsDirResponse.class)
                .withName("CreateFsDir")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/dir")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFsDirRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<CreateFsDirRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFsDirRequestBody.class),
            f -> f.withMarshaller(CreateFsDirRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> createFsDirQuota =
        genForcreateFsDirQuota();

    private static HttpRequestDef<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> genForcreateFsDirQuota() {
        // basic
        HttpRequestDef.Builder<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFsDirQuotaRequest.class, CreateFsDirQuotaResponse.class)
                .withName("CreateFsDirQuota")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/dir-quota")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFsDirQuotaRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<CreateFsDirQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFsDirQuotaRequestBody.class),
            f -> f.withMarshaller(CreateFsDirQuotaRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<DeleteFsDirRequest, DeleteFsDirResponse> deleteFsDir = genFordeleteFsDir();

    private static HttpRequestDef<DeleteFsDirRequest, DeleteFsDirResponse> genFordeleteFsDir() {
        // basic
        HttpRequestDef.Builder<DeleteFsDirRequest, DeleteFsDirResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFsDirRequest.class, DeleteFsDirResponse.class)
                .withName("DeleteFsDir")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/dir")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFsDirRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<DeleteFsDirRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFsDirRequestBody.class),
            f -> f.withMarshaller(DeleteFsDirRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> deleteFsDirQuota =
        genFordeleteFsDirQuota();

    private static HttpRequestDef<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> genFordeleteFsDirQuota() {
        // basic
        HttpRequestDef.Builder<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFsDirQuotaRequest.class, DeleteFsDirQuotaResponse.class)
                .withName("DeleteFsDirQuota")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/dir-quota")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFsDirQuotaRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<DeleteFsDirQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFsDirQuotaRequestBody.class),
            f -> f.withMarshaller(DeleteFsDirQuotaRequest::getBody, (req, v) -> {
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
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSharesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSharesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFsDirRequest, ShowFsDirResponse> showFsDir = genForshowFsDir();

    private static HttpRequestDef<ShowFsDirRequest, ShowFsDirResponse> genForshowFsDir() {
        // basic
        HttpRequestDef.Builder<ShowFsDirRequest, ShowFsDirResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFsDirRequest.class, ShowFsDirResponse.class)
                .withName("ShowFsDir")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/dir")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> showFsDirQuota =
        genForshowFsDirQuota();

    private static HttpRequestDef<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> genForshowFsDirQuota() {
        // basic
        HttpRequestDef.Builder<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFsDirQuotaRequest.class, ShowFsDirQuotaResponse.class)
                .withName("ShowFsDirQuota")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/dir-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirQuotaRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirQuotaRequest::getPath, (req, v) -> {
                req.setPath(v);
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

    public static final HttpRequestDef<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> updateFsDirQuota =
        genForupdateFsDirQuota();

    private static HttpRequestDef<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> genForupdateFsDirQuota() {
        // basic
        HttpRequestDef.Builder<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFsDirQuotaRequest.class, UpdateFsDirQuotaResponse.class)
                .withName("UpdateFsDirQuota")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/dir-quota")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFsDirQuotaRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<UpdateFsDirQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFsDirQuotaRequestBody.class),
            f -> f.withMarshaller(UpdateFsDirQuotaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
