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
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteHpcCacheTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteHpcCacheTaskResponse;
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
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetAttributesRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetAttributesRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetAttributesResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetPolicyRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetPolicyRequestBody;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetPolicyResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdatePermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdatePermRuleResponse;

@SuppressWarnings("unchecked")
public class SFSTurboMeta {

    public static final HttpRequestDef<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> batchAddSharedTags =
        genForBatchAddSharedTags();

    private static HttpRequestDef<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> genForBatchAddSharedTags() {
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
            f -> f.withMarshaller(BatchAddSharedTagsRequest::getShareId, BatchAddSharedTagsRequest::setShareId));
        builder.<BatchAddSharedTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddSharedTagsRequestBody.class),
            f -> f.withMarshaller(BatchAddSharedTagsRequest::getBody, BatchAddSharedTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroup =
        genForChangeSecurityGroup();

    private static HttpRequestDef<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> genForChangeSecurityGroup() {
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
            f -> f.withMarshaller(ChangeSecurityGroupRequest::getShareId, ChangeSecurityGroupRequest::setShareId));
        builder.<ChangeSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSecurityGroupRequestBody.class),
            f -> f.withMarshaller(ChangeSecurityGroupRequest::getBody, ChangeSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeShareNameRequest, ChangeShareNameResponse> changeShareName =
        genForChangeShareName();

    private static HttpRequestDef<ChangeShareNameRequest, ChangeShareNameResponse> genForChangeShareName() {
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
            f -> f.withMarshaller(ChangeShareNameRequest::getShareId, ChangeShareNameRequest::setShareId));
        builder.<ChangeShareNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeShareNameReq.class),
            f -> f.withMarshaller(ChangeShareNameRequest::getBody, ChangeShareNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackendTargetRequest, CreateBackendTargetResponse> createBackendTarget =
        genForCreateBackendTarget();

    private static HttpRequestDef<CreateBackendTargetRequest, CreateBackendTargetResponse> genForCreateBackendTarget() {
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
            f -> f.withMarshaller(CreateBackendTargetRequest::getShareId, CreateBackendTargetRequest::setShareId));
        builder.<CreateBackendTargetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBackendTargetRequestBody.class),
            f -> f.withMarshaller(CreateBackendTargetRequest::getBody, CreateBackendTargetRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBackendTargetResponse::getXRequestId,
                CreateBackendTargetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateFsDirRequest, CreateFsDirResponse> createFsDir = genForCreateFsDir();

    private static HttpRequestDef<CreateFsDirRequest, CreateFsDirResponse> genForCreateFsDir() {
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
            f -> f.withMarshaller(CreateFsDirRequest::getShareId, CreateFsDirRequest::setShareId));
        builder.<CreateFsDirRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFsDirRequestBody.class),
            f -> f.withMarshaller(CreateFsDirRequest::getBody, CreateFsDirRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> createFsDirQuota =
        genForCreateFsDirQuota();

    private static HttpRequestDef<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> genForCreateFsDirQuota() {
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
            f -> f.withMarshaller(CreateFsDirQuotaRequest::getShareId, CreateFsDirQuotaRequest::setShareId));
        builder.<CreateFsDirQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFsDirQuotaRequestBody.class),
            f -> f.withMarshaller(CreateFsDirQuotaRequest::getBody, CreateFsDirQuotaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFsTaskRequest, CreateFsTaskResponse> createFsTask = genForCreateFsTask();

    private static HttpRequestDef<CreateFsTaskRequest, CreateFsTaskResponse> genForCreateFsTask() {
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
            f -> f.withMarshaller(CreateFsTaskRequest::getShareId, CreateFsTaskRequest::setShareId));
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFsTaskRequest::getFeature, CreateFsTaskRequest::setFeature));
        builder.<FsDirReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FsDirReq.class),
            f -> f.withMarshaller(CreateFsTaskRequest::getBody, CreateFsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse> createHpcCacheTask =
        genForCreateHpcCacheTask();

    private static HttpRequestDef<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse> genForCreateHpcCacheTask() {
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
            f -> f.withMarshaller(CreateHpcCacheTaskRequest::getShareId, CreateHpcCacheTaskRequest::setShareId));
        builder.<CreateHpcCacheTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHpcCacheTaskReq.class),
            f -> f.withMarshaller(CreateHpcCacheTaskRequest::getBody, CreateHpcCacheTaskRequest::setBody));

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
        genForCreateLdapConfig();

    private static HttpRequestDef<CreateLdapConfigRequest, CreateLdapConfigResponse> genForCreateLdapConfig() {
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
            f -> f.withMarshaller(CreateLdapConfigRequest::getShareId, CreateLdapConfigRequest::setShareId));
        builder.<CreateLdapConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLdapConfigRequestBody.class),
            f -> f.withMarshaller(CreateLdapConfigRequest::getBody, CreateLdapConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePermRuleRequest, CreatePermRuleResponse> createPermRule =
        genForCreatePermRule();

    private static HttpRequestDef<CreatePermRuleRequest, CreatePermRuleResponse> genForCreatePermRule() {
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
            f -> f.withMarshaller(CreatePermRuleRequest::getShareId, CreatePermRuleRequest::setShareId));
        builder.<CreatePermRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePermRulesRequestBody.class),
            f -> f.withMarshaller(CreatePermRuleRequest::getBody, CreatePermRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShareRequest, CreateShareResponse> createShare = genForCreateShare();

    private static HttpRequestDef<CreateShareRequest, CreateShareResponse> genForCreateShare() {
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
            f -> f.withMarshaller(CreateShareRequest::getBody, CreateShareRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSharedTagRequest, CreateSharedTagResponse> createSharedTag =
        genForCreateSharedTag();

    private static HttpRequestDef<CreateSharedTagRequest, CreateSharedTagResponse> genForCreateSharedTag() {
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
            f -> f.withMarshaller(CreateSharedTagRequest::getShareId, CreateSharedTagRequest::setShareId));
        builder.<CreateSharedTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSharedTagRequestBody.class),
            f -> f.withMarshaller(CreateSharedTagRequest::getBody, CreateSharedTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackendTargetRequest, DeleteBackendTargetResponse> deleteBackendTarget =
        genForDeleteBackendTarget();

    private static HttpRequestDef<DeleteBackendTargetRequest, DeleteBackendTargetResponse> genForDeleteBackendTarget() {
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
            f -> f.withMarshaller(DeleteBackendTargetRequest::getShareId, DeleteBackendTargetRequest::setShareId));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendTargetRequest::getTargetId, DeleteBackendTargetRequest::setTargetId));
        builder.<Boolean>withRequestField("delete_data_in_file_system",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteBackendTargetRequest::getDeleteDataInFileSystem,
                DeleteBackendTargetRequest::setDeleteDataInFileSystem));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBackendTargetResponse::getXRequestId,
                DeleteBackendTargetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteFsDirRequest, DeleteFsDirResponse> deleteFsDir = genForDeleteFsDir();

    private static HttpRequestDef<DeleteFsDirRequest, DeleteFsDirResponse> genForDeleteFsDir() {
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
            f -> f.withMarshaller(DeleteFsDirRequest::getShareId, DeleteFsDirRequest::setShareId));
        builder.<DeleteFsDirRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFsDirRequestBody.class),
            f -> f.withMarshaller(DeleteFsDirRequest::getBody, DeleteFsDirRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> deleteFsDirQuota =
        genForDeleteFsDirQuota();

    private static HttpRequestDef<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> genForDeleteFsDirQuota() {
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
            f -> f.withMarshaller(DeleteFsDirQuotaRequest::getShareId, DeleteFsDirQuotaRequest::setShareId));
        builder.<DeleteFsDirQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFsDirQuotaRequestBody.class),
            f -> f.withMarshaller(DeleteFsDirQuotaRequest::getBody, DeleteFsDirQuotaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFsTaskRequest, DeleteFsTaskResponse> deleteFsTask = genForDeleteFsTask();

    private static HttpRequestDef<DeleteFsTaskRequest, DeleteFsTaskResponse> genForDeleteFsTask() {
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
            f -> f.withMarshaller(DeleteFsTaskRequest::getShareId, DeleteFsTaskRequest::setShareId));
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFsTaskRequest::getFeature, DeleteFsTaskRequest::setFeature));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFsTaskRequest::getTaskId, DeleteFsTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHpcCacheTaskRequest, DeleteHpcCacheTaskResponse> deleteHpcCacheTask =
        genForDeleteHpcCacheTask();

    private static HttpRequestDef<DeleteHpcCacheTaskRequest, DeleteHpcCacheTaskResponse> genForDeleteHpcCacheTask() {
        // basic
        HttpRequestDef.Builder<DeleteHpcCacheTaskRequest, DeleteHpcCacheTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHpcCacheTaskRequest.class, DeleteHpcCacheTaskResponse.class)
                .withName("DeleteHpcCacheTask")
                .withUri("/v1/{project_id}/sfs-turbo/{share_id}/hpc-cache/task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHpcCacheTaskRequest::getShareId, DeleteHpcCacheTaskRequest::setShareId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHpcCacheTaskRequest::getTaskId, DeleteHpcCacheTaskRequest::setTaskId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteHpcCacheTaskResponse::getXRequestId,
                DeleteHpcCacheTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteLdapConfigRequest, DeleteLdapConfigResponse> deleteLdapConfig =
        genForDeleteLdapConfig();

    private static HttpRequestDef<DeleteLdapConfigRequest, DeleteLdapConfigResponse> genForDeleteLdapConfig() {
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
            f -> f.withMarshaller(DeleteLdapConfigRequest::getShareId, DeleteLdapConfigRequest::setShareId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePermRuleRequest, DeletePermRuleResponse> deletePermRule =
        genForDeletePermRule();

    private static HttpRequestDef<DeletePermRuleRequest, DeletePermRuleResponse> genForDeletePermRule() {
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
            f -> f.withMarshaller(DeletePermRuleRequest::getShareId, DeletePermRuleRequest::setShareId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermRuleRequest::getRuleId, DeletePermRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteShareRequest, DeleteShareResponse> deleteShare = genForDeleteShare();

    private static HttpRequestDef<DeleteShareRequest, DeleteShareResponse> genForDeleteShare() {
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
            f -> f.withMarshaller(DeleteShareRequest::getShareId, DeleteShareRequest::setShareId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSharedTagRequest, DeleteSharedTagResponse> deleteSharedTag =
        genForDeleteSharedTag();

    private static HttpRequestDef<DeleteSharedTagRequest, DeleteSharedTagResponse> genForDeleteSharedTag() {
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
            f -> f.withMarshaller(DeleteSharedTagRequest::getShareId, DeleteSharedTagRequest::setShareId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSharedTagRequest::getKey, DeleteSharedTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandShareRequest, ExpandShareResponse> expandShare = genForExpandShare();

    private static HttpRequestDef<ExpandShareRequest, ExpandShareResponse> genForExpandShare() {
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
            f -> f.withMarshaller(ExpandShareRequest::getShareId, ExpandShareRequest::setShareId));
        builder.<ExpandShareRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandShareRequestBody.class),
            f -> f.withMarshaller(ExpandShareRequest::getBody, ExpandShareRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackendTargetsRequest, ListBackendTargetsResponse> listBackendTargets =
        genForListBackendTargets();

    private static HttpRequestDef<ListBackendTargetsRequest, ListBackendTargetsResponse> genForListBackendTargets() {
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
            f -> f.withMarshaller(ListBackendTargetsRequest::getShareId, ListBackendTargetsRequest::setShareId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackendTargetsRequest::getLimit, ListBackendTargetsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendTargetsRequest::getMarker, ListBackendTargetsRequest::setMarker));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackendTargetsResponse::getXRequestId,
                ListBackendTargetsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFsTasksRequest, ListFsTasksResponse> listFsTasks = genForListFsTasks();

    private static HttpRequestDef<ListFsTasksRequest, ListFsTasksResponse> genForListFsTasks() {
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
            f -> f.withMarshaller(ListFsTasksRequest::getShareId, ListFsTasksRequest::setShareId));
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFsTasksRequest::getFeature, ListFsTasksRequest::setFeature));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFsTasksRequest::getMarker, ListFsTasksRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFsTasksRequest::getLimit, ListFsTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse> listHpcCacheTasks =
        genForListHpcCacheTasks();

    private static HttpRequestDef<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse> genForListHpcCacheTasks() {
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
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getShareId, ListHpcCacheTasksRequest::setShareId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getType, ListHpcCacheTasksRequest::setType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getStatus, ListHpcCacheTasksRequest::setStatus));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getOffset, ListHpcCacheTasksRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getLimit, ListHpcCacheTasksRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getStartTime, ListHpcCacheTasksRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHpcCacheTasksRequest::getEndTime, ListHpcCacheTasksRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHpcCacheTasksResponse::getXRequestId, ListHpcCacheTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPermRulesRequest, ListPermRulesResponse> listPermRules =
        genForListPermRules();

    private static HttpRequestDef<ListPermRulesRequest, ListPermRulesResponse> genForListPermRules() {
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
            f -> f.withMarshaller(ListPermRulesRequest::getShareId, ListPermRulesRequest::setShareId));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPermRulesRequest::getLimit, ListPermRulesRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPermRulesRequest::getOffset, ListPermRulesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSharedTagsRequest, ListSharedTagsResponse> listSharedTags =
        genForListSharedTags();

    private static HttpRequestDef<ListSharedTagsRequest, ListSharedTagsResponse> genForListSharedTags() {
        // basic
        HttpRequestDef.Builder<ListSharedTagsRequest, ListSharedTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSharedTagsRequest.class, ListSharedTagsResponse.class)
                .withName("ListSharedTags")
                .withUri("/v1/{project_id}/sfs-turbo/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSharedTagsRequest::getLimit, ListSharedTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSharedTagsRequest::getOffset, ListSharedTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSharesRequest, ListSharesResponse> listShares = genForListShares();

    private static HttpRequestDef<ListSharesRequest, ListSharesResponse> genForListShares() {
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
            f -> f.withMarshaller(ListSharesRequest::getLimit, ListSharesRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSharesRequest::getOffset, ListSharesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse> setHpcCacheBackend =
        genForSetHpcCacheBackend();

    private static HttpRequestDef<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse> genForSetHpcCacheBackend() {
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
            f -> f.withMarshaller(SetHpcCacheBackendRequest::getShareId, SetHpcCacheBackendRequest::setShareId));
        builder.<ReqConfigHpcCacheBackend>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqConfigHpcCacheBackend.class),
            f -> f.withMarshaller(SetHpcCacheBackendRequest::getBody, SetHpcCacheBackendRequest::setBody));

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
        genForShowBackendTargetInfo();

    private static HttpRequestDef<ShowBackendTargetInfoRequest, ShowBackendTargetInfoResponse> genForShowBackendTargetInfo() {
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
            f -> f.withMarshaller(ShowBackendTargetInfoRequest::getShareId, ShowBackendTargetInfoRequest::setShareId));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackendTargetInfoRequest::getTargetId,
                ShowBackendTargetInfoRequest::setTargetId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBackendTargetInfoResponse::getXRequestId,
                ShowBackendTargetInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowFsDirRequest, ShowFsDirResponse> showFsDir = genForShowFsDir();

    private static HttpRequestDef<ShowFsDirRequest, ShowFsDirResponse> genForShowFsDir() {
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
            f -> f.withMarshaller(ShowFsDirRequest::getShareId, ShowFsDirRequest::setShareId));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirRequest::getPath, ShowFsDirRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> showFsDirQuota =
        genForShowFsDirQuota();

    private static HttpRequestDef<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> genForShowFsDirQuota() {
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
            f -> f.withMarshaller(ShowFsDirQuotaRequest::getShareId, ShowFsDirQuotaRequest::setShareId));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirQuotaRequest::getPath, ShowFsDirQuotaRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFsDirUsageRequest, ShowFsDirUsageResponse> showFsDirUsage =
        genForShowFsDirUsage();

    private static HttpRequestDef<ShowFsDirUsageRequest, ShowFsDirUsageResponse> genForShowFsDirUsage() {
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
            f -> f.withMarshaller(ShowFsDirUsageRequest::getShareId, ShowFsDirUsageRequest::setShareId));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsDirUsageRequest::getPath, ShowFsDirUsageRequest::setPath));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowFsDirUsageResponse::getXRequestId, ShowFsDirUsageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowFsTaskRequest, ShowFsTaskResponse> showFsTask = genForShowFsTask();

    private static HttpRequestDef<ShowFsTaskRequest, ShowFsTaskResponse> genForShowFsTask() {
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
            f -> f.withMarshaller(ShowFsTaskRequest::getShareId, ShowFsTaskRequest::setShareId));
        builder.<String>withRequestField("feature",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsTaskRequest::getFeature, ShowFsTaskRequest::setFeature));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFsTaskRequest::getTaskId, ShowFsTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse> showHpcCacheTask =
        genForShowHpcCacheTask();

    private static HttpRequestDef<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse> genForShowHpcCacheTask() {
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
            f -> f.withMarshaller(ShowHpcCacheTaskRequest::getShareId, ShowHpcCacheTaskRequest::setShareId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHpcCacheTaskRequest::getTaskId, ShowHpcCacheTaskRequest::setTaskId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHpcCacheTaskResponse::getXRequestId, ShowHpcCacheTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForShowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForShowJobDetail() {
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
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, ShowJobDetailRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowJobDetailResponse::getXRequestId, ShowJobDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLdapConfigRequest, ShowLdapConfigResponse> showLdapConfig =
        genForShowLdapConfig();

    private static HttpRequestDef<ShowLdapConfigRequest, ShowLdapConfigResponse> genForShowLdapConfig() {
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
            f -> f.withMarshaller(ShowLdapConfigRequest::getShareId, ShowLdapConfigRequest::setShareId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPermRuleRequest, ShowPermRuleResponse> showPermRule = genForShowPermRule();

    private static HttpRequestDef<ShowPermRuleRequest, ShowPermRuleResponse> genForShowPermRule() {
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
            f -> f.withMarshaller(ShowPermRuleRequest::getShareId, ShowPermRuleRequest::setShareId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPermRuleRequest::getRuleId, ShowPermRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShareRequest, ShowShareResponse> showShare = genForShowShare();

    private static HttpRequestDef<ShowShareRequest, ShowShareResponse> genForShowShare() {
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
            f -> f.withMarshaller(ShowShareRequest::getShareId, ShowShareRequest::setShareId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSharedTagsRequest, ShowSharedTagsResponse> showSharedTags =
        genForShowSharedTags();

    private static HttpRequestDef<ShowSharedTagsRequest, ShowSharedTagsResponse> genForShowSharedTags() {
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
            f -> f.withMarshaller(ShowSharedTagsRequest::getShareId, ShowSharedTagsRequest::setShareId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> updateFsDirQuota =
        genForUpdateFsDirQuota();

    private static HttpRequestDef<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> genForUpdateFsDirQuota() {
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
            f -> f.withMarshaller(UpdateFsDirQuotaRequest::getShareId, UpdateFsDirQuotaRequest::setShareId));
        builder.<UpdateFsDirQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFsDirQuotaRequestBody.class),
            f -> f.withMarshaller(UpdateFsDirQuotaRequest::getBody, UpdateFsDirQuotaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHpcShareRequest, UpdateHpcShareResponse> updateHpcShare =
        genForUpdateHpcShare();

    private static HttpRequestDef<UpdateHpcShareRequest, UpdateHpcShareResponse> genForUpdateHpcShare() {
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
            f -> f.withMarshaller(UpdateHpcShareRequest::getShareId, UpdateHpcShareRequest::setShareId));
        builder.<UpdateHpcShareRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHpcShareRequestBody.class),
            f -> f.withMarshaller(UpdateHpcShareRequest::getBody, UpdateHpcShareRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateHpcShareResponse::getXRequestId, UpdateHpcShareResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateLdapConfigRequest, UpdateLdapConfigResponse> updateLdapConfig =
        genForUpdateLdapConfig();

    private static HttpRequestDef<UpdateLdapConfigRequest, UpdateLdapConfigResponse> genForUpdateLdapConfig() {
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
            f -> f.withMarshaller(UpdateLdapConfigRequest::getShareId, UpdateLdapConfigRequest::setShareId));
        builder.<UpdateLdapConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLdapConfigRequestBody.class),
            f -> f.withMarshaller(UpdateLdapConfigRequest::getBody, UpdateLdapConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateObsTargetAttributesRequest, UpdateObsTargetAttributesResponse> updateObsTargetAttributes =
        genForUpdateObsTargetAttributes();

    private static HttpRequestDef<UpdateObsTargetAttributesRequest, UpdateObsTargetAttributesResponse> genForUpdateObsTargetAttributes() {
        // basic
        HttpRequestDef.Builder<UpdateObsTargetAttributesRequest, UpdateObsTargetAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateObsTargetAttributesRequest.class,
                    UpdateObsTargetAttributesResponse.class)
                .withName("UpdateObsTargetAttributes")
                .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/targets/{target_id}/attributes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateObsTargetAttributesRequest::getShareId,
                UpdateObsTargetAttributesRequest::setShareId));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateObsTargetAttributesRequest::getTargetId,
                UpdateObsTargetAttributesRequest::setTargetId));
        builder.<UpdateObsTargetAttributesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateObsTargetAttributesRequestBody.class),
            f -> f.withMarshaller(UpdateObsTargetAttributesRequest::getBody,
                UpdateObsTargetAttributesRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateObsTargetAttributesResponse::getXRequestId,
                UpdateObsTargetAttributesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateObsTargetPolicyRequest, UpdateObsTargetPolicyResponse> updateObsTargetPolicy =
        genForUpdateObsTargetPolicy();

    private static HttpRequestDef<UpdateObsTargetPolicyRequest, UpdateObsTargetPolicyResponse> genForUpdateObsTargetPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateObsTargetPolicyRequest, UpdateObsTargetPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateObsTargetPolicyRequest.class, UpdateObsTargetPolicyResponse.class)
            .withName("UpdateObsTargetPolicy")
            .withUri("/v1/{project_id}/sfs-turbo/shares/{share_id}/targets/{target_id}/policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("share_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateObsTargetPolicyRequest::getShareId, UpdateObsTargetPolicyRequest::setShareId));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateObsTargetPolicyRequest::getTargetId,
                UpdateObsTargetPolicyRequest::setTargetId));
        builder.<UpdateObsTargetPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateObsTargetPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateObsTargetPolicyRequest::getBody, UpdateObsTargetPolicyRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateObsTargetPolicyResponse::getXRequestId,
                UpdateObsTargetPolicyResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePermRuleRequest, UpdatePermRuleResponse> updatePermRule =
        genForUpdatePermRule();

    private static HttpRequestDef<UpdatePermRuleRequest, UpdatePermRuleResponse> genForUpdatePermRule() {
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
            f -> f.withMarshaller(UpdatePermRuleRequest::getShareId, UpdatePermRuleRequest::setShareId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermRuleRequest::getRuleId, UpdatePermRuleRequest::setRuleId));
        builder.<OnePermRuleRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OnePermRuleRequestInfo.class),
            f -> f.withMarshaller(UpdatePermRuleRequest::getBody, UpdatePermRuleRequest::setBody));

        // response

        return builder.build();
    }

}
