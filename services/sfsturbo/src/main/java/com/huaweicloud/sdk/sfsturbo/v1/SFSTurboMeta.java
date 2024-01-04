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
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateBackendTargetRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateBackendTargetRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateBackendTargetResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateHpcCacheTaskReq;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateHpcCacheTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateHpcCacheTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateLdapConfigRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateLdapConfigRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateLdapConfigResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreatePermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreatePermRuleResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreatePermRulesRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteBackendTargetRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteBackendTargetResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteLdapConfigRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteLdapConfigResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeletePermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeletePermRuleResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteSharedTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteSharedTagResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.FsDirReq;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListBackendTargetsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListBackendTargetsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListFsTasksRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListFsTasksResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListHpcCacheTasksRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListHpcCacheTasksResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListPermRulesRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListPermRulesResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.OnePermRuleRequestInfo;
import com.huaweicloud.sdk.sfsturbo.v1.model.ReqConfigHpcCacheBackend;
import com.huaweicloud.sdk.sfsturbo.v1.model.SetHpcCacheBackendRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.SetHpcCacheBackendResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowBackendTargetInfoRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowBackendTargetInfoResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirUsageRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirUsageResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowHpcCacheTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowHpcCacheTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowLdapConfigRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowLdapConfigResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowPermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowPermRuleResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateHpcShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateHpcShareRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateHpcShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateLdapConfigRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateLdapConfigRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateLdapConfigResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdatePermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdatePermRuleResponse;

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

    public static final HttpRequestDef<CreateBackendTargetRequest, CreateBackendTargetResponse> createBackendTarget =
        genForcreateBackendTarget();

    private static HttpRequestDef<CreateBackendTargetRequest, CreateBackendTargetResponse> genForcreateBackendTarget() {
        // basic
        HttpRequestDef.Builder<CreateBackendTargetRequest, CreateBackendTargetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBackendTargetRequest.class, CreateBackendTargetResponse.class)
                .withName("CreateBackendTarget")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/targets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBackendTargetRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<CreateBackendTargetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBackendTargetRequestBody.class),
            f -> f.withMarshaller(CreateBackendTargetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBackendTargetResponse::getXRequestId,
                CreateBackendTargetResponse::setXRequestId));
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

    public static final HttpRequestDef<CreateFsTaskRequest, CreateFsTaskResponse> createFsTask = genForcreateFsTask();

    private static HttpRequestDef<CreateFsTaskRequest, CreateFsTaskResponse> genForcreateFsTask() {
        // basic
        HttpRequestDef.Builder<CreateFsTaskRequest, CreateFsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFsTaskRequest.class, CreateFsTaskResponse.class)
                .withName("CreateFsTask")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/{feature}/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFsTaskRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFsTaskRequest::getFeature, (req, v) -> {
                req.setFeature(v);
            }));
        builder.<FsDirReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FsDirReq.class),
            f -> f.withMarshaller(CreateFsTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse> createHpcCacheTask =
        genForcreateHpcCacheTask();

    private static HttpRequestDef<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse> genForcreateHpcCacheTask() {
        // basic
        HttpRequestDef.Builder<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHpcCacheTaskRequest.class, CreateHpcCacheTaskResponse.class)
                .withName("CreateHpcCacheTask")
                .withUri("/v1/{project_id}/sfs-turbo/{share_id}/hpc-cache/task")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHpcCacheTaskRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<CreateHpcCacheTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHpcCacheTaskReq.class),
            f -> f.withMarshaller(CreateHpcCacheTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateHpcCacheTaskResponse::getXRequestId,
                CreateHpcCacheTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateLdapConfigRequest, CreateLdapConfigResponse> createLdapConfig =
        genForcreateLdapConfig();

    private static HttpRequestDef<CreateLdapConfigRequest, CreateLdapConfigResponse> genForcreateLdapConfig() {
        // basic
        HttpRequestDef.Builder<CreateLdapConfigRequest, CreateLdapConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLdapConfigRequest.class, CreateLdapConfigResponse.class)
                .withName("CreateLdapConfig")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/ldap")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLdapConfigRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<CreateLdapConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLdapConfigRequestBody.class),
            f -> f.withMarshaller(CreateLdapConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePermRuleRequest, CreatePermRuleResponse> createPermRule =
        genForcreatePermRule();

    private static HttpRequestDef<CreatePermRuleRequest, CreatePermRuleResponse> genForcreatePermRule() {
        // basic
        HttpRequestDef.Builder<CreatePermRuleRequest, CreatePermRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePermRuleRequest.class, CreatePermRuleResponse.class)
                .withName("CreatePermRule")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/perm-rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePermRuleRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<CreatePermRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePermRulesRequestBody.class),
            f -> f.withMarshaller(CreatePermRuleRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<DeleteBackendTargetRequest, DeleteBackendTargetResponse> deleteBackendTarget =
        genFordeleteBackendTarget();

    private static HttpRequestDef<DeleteBackendTargetRequest, DeleteBackendTargetResponse> genFordeleteBackendTarget() {
        // basic
        HttpRequestDef.Builder<DeleteBackendTargetRequest, DeleteBackendTargetResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBackendTargetRequest.class, DeleteBackendTargetResponse.class)
            .withName("DeleteBackendTarget")
            .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/targets/{target_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendTargetRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendTargetRequest::getTargetId, (req, v) -> {
                req.setTargetId(v);
            }));
        builder.<Boolean>withRequestField("delete_data_in_file_system",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBackendTargetRequest::getDeleteDataInFileSystem, (req, v) -> {
                req.setDeleteDataInFileSystem(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBackendTargetResponse::getXRequestId,
                DeleteBackendTargetResponse::setXRequestId));
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

    public static final HttpRequestDef<DeleteFsTaskRequest, DeleteFsTaskResponse> deleteFsTask = genFordeleteFsTask();

    private static HttpRequestDef<DeleteFsTaskRequest, DeleteFsTaskResponse> genFordeleteFsTask() {
        // basic
        HttpRequestDef.Builder<DeleteFsTaskRequest, DeleteFsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFsTaskRequest.class, DeleteFsTaskResponse.class)
                .withName("DeleteFsTask")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/{feature}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFsTaskRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFsTaskRequest::getFeature, (req, v) -> {
                req.setFeature(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLdapConfigRequest, DeleteLdapConfigResponse> deleteLdapConfig =
        genFordeleteLdapConfig();

    private static HttpRequestDef<DeleteLdapConfigRequest, DeleteLdapConfigResponse> genFordeleteLdapConfig() {
        // basic
        HttpRequestDef.Builder<DeleteLdapConfigRequest, DeleteLdapConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLdapConfigRequest.class, DeleteLdapConfigResponse.class)
                .withName("DeleteLdapConfig")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/ldap")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLdapConfigRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePermRuleRequest, DeletePermRuleResponse> deletePermRule =
        genFordeletePermRule();

    private static HttpRequestDef<DeletePermRuleRequest, DeletePermRuleResponse> genFordeletePermRule() {
        // basic
        HttpRequestDef.Builder<DeletePermRuleRequest, DeletePermRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePermRuleRequest.class, DeletePermRuleResponse.class)
                .withName("DeletePermRule")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/perm-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermRuleRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
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

    public static final HttpRequestDef<ListBackendTargetsRequest, ListBackendTargetsResponse> listBackendTargets =
        genForlistBackendTargets();

    private static HttpRequestDef<ListBackendTargetsRequest, ListBackendTargetsResponse> genForlistBackendTargets() {
        // basic
        HttpRequestDef.Builder<ListBackendTargetsRequest, ListBackendTargetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackendTargetsRequest.class, ListBackendTargetsResponse.class)
                .withName("ListBackendTargets")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/targets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendTargetsRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackendTargetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendTargetsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackendTargetsResponse::getXRequestId,
                ListBackendTargetsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFsTasksRequest, ListFsTasksResponse> listFsTasks = genForlistFsTasks();

    private static HttpRequestDef<ListFsTasksRequest, ListFsTasksResponse> genForlistFsTasks() {
        // basic
        HttpRequestDef.Builder<ListFsTasksRequest, ListFsTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFsTasksRequest.class, ListFsTasksResponse.class)
                .withName("ListFsTasks")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/{feature}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFsTasksRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFsTasksRequest::getFeature, (req, v) -> {
                req.setFeature(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFsTasksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFsTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse> listHpcCacheTasks =
        genForlistHpcCacheTasks();

    private static HttpRequestDef<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse> genForlistHpcCacheTasks() {
        // basic
        HttpRequestDef.Builder<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHpcCacheTasksRequest.class, ListHpcCacheTasksResponse.class)
                .withName("ListHpcCacheTasks")
                .withUri("/v1/{project_id}/sfs-turbo/{share_id}/hpc-cache/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHpcCacheTasksResponse::getXRequestId, ListHpcCacheTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPermRulesRequest, ListPermRulesResponse> listPermRules =
        genForlistPermRules();

    private static HttpRequestDef<ListPermRulesRequest, ListPermRulesResponse> genForlistPermRules() {
        // basic
        HttpRequestDef.Builder<ListPermRulesRequest, ListPermRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermRulesRequest.class, ListPermRulesResponse.class)
                .withName("ListPermRules")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/perm-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermRulesRequest::getShareId, (req, v) -> {
                req.setShareId(v);
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

    public static final HttpRequestDef<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse> setHpcCacheBackend =
        genForsetHpcCacheBackend();

    private static HttpRequestDef<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse> genForsetHpcCacheBackend() {
        // basic
        HttpRequestDef.Builder<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetHpcCacheBackendRequest.class, SetHpcCacheBackendResponse.class)
                .withName("SetHpcCacheBackend")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetHpcCacheBackendRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<ReqConfigHpcCacheBackend>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqConfigHpcCacheBackend.class),
            f -> f.withMarshaller(SetHpcCacheBackendRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetHpcCacheBackendResponse::getXRequestId,
                SetHpcCacheBackendResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowBackendTargetInfoRequest, ShowBackendTargetInfoResponse> showBackendTargetInfo =
        genForshowBackendTargetInfo();

    private static HttpRequestDef<ShowBackendTargetInfoRequest, ShowBackendTargetInfoResponse> genForshowBackendTargetInfo() {
        // basic
        HttpRequestDef.Builder<ShowBackendTargetInfoRequest, ShowBackendTargetInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBackendTargetInfoRequest.class, ShowBackendTargetInfoResponse.class)
            .withName("ShowBackendTargetInfo")
            .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/targets/{target_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackendTargetInfoRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackendTargetInfoRequest::getTargetId, (req, v) -> {
                req.setTargetId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBackendTargetInfoResponse::getXRequestId,
                ShowBackendTargetInfoResponse::setXRequestId));
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

    public static final HttpRequestDef<ShowFsDirUsageRequest, ShowFsDirUsageResponse> showFsDirUsage =
        genForshowFsDirUsage();

    private static HttpRequestDef<ShowFsDirUsageRequest, ShowFsDirUsageResponse> genForshowFsDirUsage() {
        // basic
        HttpRequestDef.Builder<ShowFsDirUsageRequest, ShowFsDirUsageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFsDirUsageRequest.class, ShowFsDirUsageResponse.class)
                .withName("ShowFsDirUsage")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/dir-usage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirUsageRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirUsageRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowFsDirUsageResponse::getXRequestId, ShowFsDirUsageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowFsTaskRequest, ShowFsTaskResponse> showFsTask = genForshowFsTask();

    private static HttpRequestDef<ShowFsTaskRequest, ShowFsTaskResponse> genForshowFsTask() {
        // basic
        HttpRequestDef.Builder<ShowFsTaskRequest, ShowFsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFsTaskRequest.class, ShowFsTaskResponse.class)
                .withName("ShowFsTask")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/{feature}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsTaskRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsTaskRequest::getFeature, (req, v) -> {
                req.setFeature(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse> showHpcCacheTask =
        genForshowHpcCacheTask();

    private static HttpRequestDef<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse> genForshowHpcCacheTask() {
        // basic
        HttpRequestDef.Builder<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHpcCacheTaskRequest.class, ShowHpcCacheTaskResponse.class)
                .withName("ShowHpcCacheTask")
                .withUri("/v1/{project_id}/sfs-turbo/{share_id}/hpc-cache/task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHpcCacheTaskRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHpcCacheTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHpcCacheTaskResponse::getXRequestId, ShowHpcCacheTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForshowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForshowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v1/{project_id}/sfs-turbo/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowJobDetailResponse::getXRequestId, ShowJobDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLdapConfigRequest, ShowLdapConfigResponse> showLdapConfig =
        genForshowLdapConfig();

    private static HttpRequestDef<ShowLdapConfigRequest, ShowLdapConfigResponse> genForshowLdapConfig() {
        // basic
        HttpRequestDef.Builder<ShowLdapConfigRequest, ShowLdapConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLdapConfigRequest.class, ShowLdapConfigResponse.class)
                .withName("ShowLdapConfig")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/ldap")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLdapConfigRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPermRuleRequest, ShowPermRuleResponse> showPermRule = genForshowPermRule();

    private static HttpRequestDef<ShowPermRuleRequest, ShowPermRuleResponse> genForshowPermRule() {
        // basic
        HttpRequestDef.Builder<ShowPermRuleRequest, ShowPermRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPermRuleRequest.class, ShowPermRuleResponse.class)
                .withName("ShowPermRule")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/perm-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPermRuleRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPermRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
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

    public static final HttpRequestDef<UpdateHpcShareRequest, UpdateHpcShareResponse> updateHpcShare =
        genForupdateHpcShare();

    private static HttpRequestDef<UpdateHpcShareRequest, UpdateHpcShareResponse> genForupdateHpcShare() {
        // basic
        HttpRequestDef.Builder<UpdateHpcShareRequest, UpdateHpcShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHpcShareRequest.class, UpdateHpcShareResponse.class)
                .withName("UpdateHpcShare")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHpcShareRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<UpdateHpcShareRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHpcShareRequestBody.class),
            f -> f.withMarshaller(UpdateHpcShareRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateHpcShareResponse::getXRequestId, UpdateHpcShareResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateLdapConfigRequest, UpdateLdapConfigResponse> updateLdapConfig =
        genForupdateLdapConfig();

    private static HttpRequestDef<UpdateLdapConfigRequest, UpdateLdapConfigResponse> genForupdateLdapConfig() {
        // basic
        HttpRequestDef.Builder<UpdateLdapConfigRequest, UpdateLdapConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLdapConfigRequest.class, UpdateLdapConfigResponse.class)
                .withName("UpdateLdapConfig")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/ldap")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLdapConfigRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<UpdateLdapConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLdapConfigRequestBody.class),
            f -> f.withMarshaller(UpdateLdapConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePermRuleRequest, UpdatePermRuleResponse> updatePermRule =
        genForupdatePermRule();

    private static HttpRequestDef<UpdatePermRuleRequest, UpdatePermRuleResponse> genForupdatePermRule() {
        // basic
        HttpRequestDef.Builder<UpdatePermRuleRequest, UpdatePermRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePermRuleRequest.class, UpdatePermRuleResponse.class)
                .withName("UpdatePermRule")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/fs/perm-rules/{rule_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermRuleRequest::getShareId, (req, v) -> {
                req.setShareId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<OnePermRuleRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OnePermRuleRequestInfo.class),
            f -> f.withMarshaller(UpdatePermRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
