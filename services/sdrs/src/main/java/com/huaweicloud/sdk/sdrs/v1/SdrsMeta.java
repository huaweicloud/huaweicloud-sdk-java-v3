package com.huaweicloud.sdk.sdrs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sdrs.v1.model.*;

@SuppressWarnings("unchecked")
public class SdrsMeta {

    public static final HttpRequestDef<AddProtectedInstanceNicRequest, AddProtectedInstanceNicResponse> addProtectedInstanceNic =
        genForaddProtectedInstanceNic();

    private static HttpRequestDef<AddProtectedInstanceNicRequest, AddProtectedInstanceNicResponse> genForaddProtectedInstanceNic() {
        // basic
        HttpRequestDef.Builder<AddProtectedInstanceNicRequest, AddProtectedInstanceNicResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddProtectedInstanceNicRequest.class, AddProtectedInstanceNicResponse.class)
            .withName("AddProtectedInstanceNic")
            .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/nic")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProtectedInstanceNicRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<ProtectedInstanceAddNicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectedInstanceAddNicRequestBody.class),
            f -> f.withMarshaller(AddProtectedInstanceNicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddProtectedInstanceTagsRequest, AddProtectedInstanceTagsResponse> addProtectedInstanceTags =
        genForaddProtectedInstanceTags();

    private static HttpRequestDef<AddProtectedInstanceTagsRequest, AddProtectedInstanceTagsResponse> genForaddProtectedInstanceTags() {
        // basic
        HttpRequestDef.Builder<AddProtectedInstanceTagsRequest, AddProtectedInstanceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AddProtectedInstanceTagsRequest.class, AddProtectedInstanceTagsResponse.class)
                .withName("AddProtectedInstanceTags")
                .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProtectedInstanceTagsRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<ProtectedInstanceAddTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectedInstanceAddTagsRequestBody.class),
            f -> f.withMarshaller(AddProtectedInstanceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachProtectedInstanceReplicationRequest, AttachProtectedInstanceReplicationResponse> attachProtectedInstanceReplication =
        genForattachProtectedInstanceReplication();

    private static HttpRequestDef<AttachProtectedInstanceReplicationRequest, AttachProtectedInstanceReplicationResponse> genForattachProtectedInstanceReplication() {
        // basic
        HttpRequestDef.Builder<AttachProtectedInstanceReplicationRequest, AttachProtectedInstanceReplicationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachProtectedInstanceReplicationRequest.class,
                    AttachProtectedInstanceReplicationResponse.class)
                .withName("AttachProtectedInstanceReplication")
                .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/attachreplication")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachProtectedInstanceReplicationRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<ProtectedInstanceAttachReplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectedInstanceAttachReplicationRequestBody.class),
            f -> f.withMarshaller(AttachProtectedInstanceReplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddTagsRequest, BatchAddTagsResponse> batchAddTags = genForbatchAddTags();

    private static HttpRequestDef<BatchAddTagsRequest, BatchAddTagsResponse> genForbatchAddTags() {
        // basic
        HttpRequestDef.Builder<BatchAddTagsRequest, BatchAddTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddTagsRequest.class, BatchAddTagsResponse.class)
                .withName("BatchAddTags")
                .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddTagsRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<BatchAddTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddTagsRequestBody.class),
            f -> f.withMarshaller(BatchAddTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateProtectedInstancesRequest, BatchCreateProtectedInstancesResponse> batchCreateProtectedInstances =
        genForbatchCreateProtectedInstances();

    private static HttpRequestDef<BatchCreateProtectedInstancesRequest, BatchCreateProtectedInstancesResponse> genForbatchCreateProtectedInstances() {
        // basic
        HttpRequestDef.Builder<BatchCreateProtectedInstancesRequest, BatchCreateProtectedInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateProtectedInstancesRequest.class,
                    BatchCreateProtectedInstancesResponse.class)
                .withName("BatchCreateProtectedInstances")
                .withUri("/v1/{project_id}/protected-instances/batch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchCreateProtectedInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateProtectedInstancesRequestBody.class),
            f -> f.withMarshaller(BatchCreateProtectedInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteProtectedInstancesRequest, BatchDeleteProtectedInstancesResponse> batchDeleteProtectedInstances =
        genForbatchDeleteProtectedInstances();

    private static HttpRequestDef<BatchDeleteProtectedInstancesRequest, BatchDeleteProtectedInstancesResponse> genForbatchDeleteProtectedInstances() {
        // basic
        HttpRequestDef.Builder<BatchDeleteProtectedInstancesRequest, BatchDeleteProtectedInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteProtectedInstancesRequest.class,
                    BatchDeleteProtectedInstancesResponse.class)
                .withName("BatchDeleteProtectedInstances")
                .withUri("/v1/{project_id}/protected-instances/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeleteProtectedInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteProtectedInstancesRequestBody.class),
            f -> f.withMarshaller(BatchDeleteProtectedInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForbatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForbatchDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagsRequest, BatchDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagsRequest.class, BatchDeleteTagsResponse.class)
                .withName("BatchDeleteTags")
                .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<BatchDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDisasterRecoveryDrillRequest, CreateDisasterRecoveryDrillResponse> createDisasterRecoveryDrill =
        genForcreateDisasterRecoveryDrill();

    private static HttpRequestDef<CreateDisasterRecoveryDrillRequest, CreateDisasterRecoveryDrillResponse> genForcreateDisasterRecoveryDrill() {
        // basic
        HttpRequestDef.Builder<CreateDisasterRecoveryDrillRequest, CreateDisasterRecoveryDrillResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDisasterRecoveryDrillRequest.class,
                    CreateDisasterRecoveryDrillResponse.class)
                .withName("CreateDisasterRecoveryDrill")
                .withUri("/v1/{project_id}/disaster-recovery-drills")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDisasterRecoveryDrillRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDisasterRecoveryDrillRequestBody.class),
            f -> f.withMarshaller(CreateDisasterRecoveryDrillRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProtectedInstanceRequest, CreateProtectedInstanceResponse> createProtectedInstance =
        genForcreateProtectedInstance();

    private static HttpRequestDef<CreateProtectedInstanceRequest, CreateProtectedInstanceResponse> genForcreateProtectedInstance() {
        // basic
        HttpRequestDef.Builder<CreateProtectedInstanceRequest, CreateProtectedInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateProtectedInstanceRequest.class, CreateProtectedInstanceResponse.class)
            .withName("CreateProtectedInstance")
            .withUri("/v1/{project_id}/protected-instances")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateProtectedInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProtectedInstanceRequestBody.class),
            f -> f.withMarshaller(CreateProtectedInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProtectionGroupRequest, CreateProtectionGroupResponse> createProtectionGroup =
        genForcreateProtectionGroup();

    private static HttpRequestDef<CreateProtectionGroupRequest, CreateProtectionGroupResponse> genForcreateProtectionGroup() {
        // basic
        HttpRequestDef.Builder<CreateProtectionGroupRequest, CreateProtectionGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateProtectionGroupRequest.class, CreateProtectionGroupResponse.class)
            .withName("CreateProtectionGroup")
            .withUri("/v1/{project_id}/server-groups")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateProtectionGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProtectionGroupRequestBody.class),
            f -> f.withMarshaller(CreateProtectionGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReplicationRequest, CreateReplicationResponse> createReplication =
        genForcreateReplication();

    private static HttpRequestDef<CreateReplicationRequest, CreateReplicationResponse> genForcreateReplication() {
        // basic
        HttpRequestDef.Builder<CreateReplicationRequest, CreateReplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReplicationRequest.class, CreateReplicationResponse.class)
                .withName("CreateReplication")
                .withUri("/v1/{project_id}/replications")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateReplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReplicationRequestBody.class),
            f -> f.withMarshaller(CreateReplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAllServerGroupFailureJobsRequest, DeleteAllServerGroupFailureJobsResponse> deleteAllServerGroupFailureJobs =
        genFordeleteAllServerGroupFailureJobs();

    private static HttpRequestDef<DeleteAllServerGroupFailureJobsRequest, DeleteAllServerGroupFailureJobsResponse> genFordeleteAllServerGroupFailureJobs() {
        // basic
        HttpRequestDef.Builder<DeleteAllServerGroupFailureJobsRequest, DeleteAllServerGroupFailureJobsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAllServerGroupFailureJobsRequest.class,
                    DeleteAllServerGroupFailureJobsResponse.class)
                .withName("DeleteAllServerGroupFailureJobs")
                .withUri("/v1/{project_id}/task-center/failure-jobs/batch")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDisasterRecoveryDrillRequest, DeleteDisasterRecoveryDrillResponse> deleteDisasterRecoveryDrill =
        genFordeleteDisasterRecoveryDrill();

    private static HttpRequestDef<DeleteDisasterRecoveryDrillRequest, DeleteDisasterRecoveryDrillResponse> genFordeleteDisasterRecoveryDrill() {
        // basic
        HttpRequestDef.Builder<DeleteDisasterRecoveryDrillRequest, DeleteDisasterRecoveryDrillResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDisasterRecoveryDrillRequest.class,
                    DeleteDisasterRecoveryDrillResponse.class)
                .withName("DeleteDisasterRecoveryDrill")
                .withUri("/v1/{project_id}/disaster-recovery-drills/{disaster_recovery_drill_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_drill_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDisasterRecoveryDrillRequest::getDisasterRecoveryDrillId, (req, v) -> {
                req.setDisasterRecoveryDrillId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFailureJobRequest, DeleteFailureJobResponse> deleteFailureJob =
        genFordeleteFailureJob();

    private static HttpRequestDef<DeleteFailureJobRequest, DeleteFailureJobResponse> genFordeleteFailureJob() {
        // basic
        HttpRequestDef.Builder<DeleteFailureJobRequest, DeleteFailureJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFailureJobRequest.class, DeleteFailureJobResponse.class)
                .withName("DeleteFailureJob")
                .withUri("/v1/{project_id}/task-center/failure-jobs/{failure_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("failure_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFailureJobRequest::getFailureJobId, (req, v) -> {
                req.setFailureJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProtectedInstanceRequest, DeleteProtectedInstanceResponse> deleteProtectedInstance =
        genFordeleteProtectedInstance();

    private static HttpRequestDef<DeleteProtectedInstanceRequest, DeleteProtectedInstanceResponse> genFordeleteProtectedInstance() {
        // basic
        HttpRequestDef.Builder<DeleteProtectedInstanceRequest, DeleteProtectedInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteProtectedInstanceRequest.class, DeleteProtectedInstanceResponse.class)
            .withName("DeleteProtectedInstance")
            .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectedInstanceRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<DeleteProtectedInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteProtectedInstanceRequestBody.class),
            f -> f.withMarshaller(DeleteProtectedInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProtectedInstanceNicRequest, DeleteProtectedInstanceNicResponse> deleteProtectedInstanceNic =
        genFordeleteProtectedInstanceNic();

    private static HttpRequestDef<DeleteProtectedInstanceNicRequest, DeleteProtectedInstanceNicResponse> genFordeleteProtectedInstanceNic() {
        // basic
        HttpRequestDef.Builder<DeleteProtectedInstanceNicRequest, DeleteProtectedInstanceNicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteProtectedInstanceNicRequest.class,
                    DeleteProtectedInstanceNicResponse.class)
                .withName("DeleteProtectedInstanceNic")
                .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/nic/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectedInstanceNicRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<ProtectedInstanceDeleteNicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectedInstanceDeleteNicRequestBody.class),
            f -> f.withMarshaller(DeleteProtectedInstanceNicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProtectedInstanceTagRequest, DeleteProtectedInstanceTagResponse> deleteProtectedInstanceTag =
        genFordeleteProtectedInstanceTag();

    private static HttpRequestDef<DeleteProtectedInstanceTagRequest, DeleteProtectedInstanceTagResponse> genFordeleteProtectedInstanceTag() {
        // basic
        HttpRequestDef.Builder<DeleteProtectedInstanceTagRequest, DeleteProtectedInstanceTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteProtectedInstanceTagRequest.class,
                    DeleteProtectedInstanceTagResponse.class)
                .withName("DeleteProtectedInstanceTag")
                .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectedInstanceTagRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectedInstanceTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProtectionGroupRequest, DeleteProtectionGroupResponse> deleteProtectionGroup =
        genFordeleteProtectionGroup();

    private static HttpRequestDef<DeleteProtectionGroupRequest, DeleteProtectionGroupResponse> genFordeleteProtectionGroup() {
        // basic
        HttpRequestDef.Builder<DeleteProtectionGroupRequest, DeleteProtectionGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteProtectionGroupRequest.class, DeleteProtectionGroupResponse.class)
            .withName("DeleteProtectionGroup")
            .withUri("/v1/{project_id}/server-groups/{server_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectionGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReplicationRequest, DeleteReplicationResponse> deleteReplication =
        genFordeleteReplication();

    private static HttpRequestDef<DeleteReplicationRequest, DeleteReplicationResponse> genFordeleteReplication() {
        // basic
        HttpRequestDef.Builder<DeleteReplicationRequest, DeleteReplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteReplicationRequest.class, DeleteReplicationResponse.class)
                .withName("DeleteReplication")
                .withUri("/v1/{project_id}/replications/{replication_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("replication_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReplicationRequest::getReplicationId, (req, v) -> {
                req.setReplicationId(v);
            }));
        builder.<DeleteReplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteReplicationRequestBody.class),
            f -> f.withMarshaller(DeleteReplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupFailureJobsRequest, DeleteServerGroupFailureJobsResponse> deleteServerGroupFailureJobs =
        genFordeleteServerGroupFailureJobs();

    private static HttpRequestDef<DeleteServerGroupFailureJobsRequest, DeleteServerGroupFailureJobsResponse> genFordeleteServerGroupFailureJobs() {
        // basic
        HttpRequestDef.Builder<DeleteServerGroupFailureJobsRequest, DeleteServerGroupFailureJobsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteServerGroupFailureJobsRequest.class,
                    DeleteServerGroupFailureJobsResponse.class)
                .withName("DeleteServerGroupFailureJobs")
                .withUri("/v1/{project_id}/task-center/{server_group_id}/failure-jobs/batch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerGroupFailureJobsRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachProtectedInstanceReplicationRequest, DetachProtectedInstanceReplicationResponse> detachProtectedInstanceReplication =
        genFordetachProtectedInstanceReplication();

    private static HttpRequestDef<DetachProtectedInstanceReplicationRequest, DetachProtectedInstanceReplicationResponse> genFordetachProtectedInstanceReplication() {
        // basic
        HttpRequestDef.Builder<DetachProtectedInstanceReplicationRequest, DetachProtectedInstanceReplicationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DetachProtectedInstanceReplicationRequest.class,
                    DetachProtectedInstanceReplicationResponse.class)
                .withName("DetachProtectedInstanceReplication")
                .withUri(
                    "/v1/{project_id}/protected-instances/{protected_instance_id}/detachreplication/{replication_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachProtectedInstanceReplicationRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<String>withRequestField("replication_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachProtectedInstanceReplicationRequest::getReplicationId, (req, v) -> {
                req.setReplicationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandReplicationRequest, ExpandReplicationResponse> expandReplication =
        genForexpandReplication();

    private static HttpRequestDef<ExpandReplicationRequest, ExpandReplicationResponse> genForexpandReplication() {
        // basic
        HttpRequestDef.Builder<ExpandReplicationRequest, ExpandReplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandReplicationRequest.class, ExpandReplicationResponse.class)
                .withName("ExpandReplication")
                .withUri("/v1/{project_id}/replications/{replication_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("replication_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandReplicationRequest::getReplicationId, (req, v) -> {
                req.setReplicationId(v);
            }));
        builder.<ExtendReplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtendReplicationRequestBody.class),
            f -> f.withMarshaller(ExpandReplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActiveActiveDomainsRequest, ListActiveActiveDomainsResponse> listActiveActiveDomains =
        genForlistActiveActiveDomains();

    private static HttpRequestDef<ListActiveActiveDomainsRequest, ListActiveActiveDomainsResponse> genForlistActiveActiveDomains() {
        // basic
        HttpRequestDef.Builder<ListActiveActiveDomainsRequest, ListActiveActiveDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListActiveActiveDomainsRequest.class, ListActiveActiveDomainsResponse.class)
            .withName("ListActiveActiveDomains")
            .withUri("/v1/{project_id}/active-domains")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDisasterRecoveryDrillsRequest, ListDisasterRecoveryDrillsResponse> listDisasterRecoveryDrills =
        genForlistDisasterRecoveryDrills();

    private static HttpRequestDef<ListDisasterRecoveryDrillsRequest, ListDisasterRecoveryDrillsResponse> genForlistDisasterRecoveryDrills() {
        // basic
        HttpRequestDef.Builder<ListDisasterRecoveryDrillsRequest, ListDisasterRecoveryDrillsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDisasterRecoveryDrillsRequest.class,
                    ListDisasterRecoveryDrillsResponse.class)
                .withName("ListDisasterRecoveryDrills")
                .withUri("/v1/{project_id}/disaster-recovery-drills")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDisasterRecoveryDrillsRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDisasterRecoveryDrillsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDisasterRecoveryDrillsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("drill_vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDisasterRecoveryDrillsRequest::getDrillVpcId, (req, v) -> {
                req.setDrillVpcId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDisasterRecoveryDrillsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDisasterRecoveryDrillsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFailureJobsRequest, ListFailureJobsResponse> listFailureJobs =
        genForlistFailureJobs();

    private static HttpRequestDef<ListFailureJobsRequest, ListFailureJobsResponse> genForlistFailureJobs() {
        // basic
        HttpRequestDef.Builder<ListFailureJobsRequest, ListFailureJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFailureJobsRequest.class, ListFailureJobsResponse.class)
                .withName("ListFailureJobs")
                .withUri("/v1/{project_id}/task-center/failure-jobs")
                .withContentType("application/json");

        // requests
        builder.<ListFailureJobsRequest.FailureStatusEnum>withRequestField("failure_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFailureJobsRequest.FailureStatusEnum.class),
            f -> f.withMarshaller(ListFailureJobsRequest::getFailureStatus, (req, v) -> {
                req.setFailureStatus(v);
            }));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFailureJobsRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFailureJobsRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<ListFailureJobsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFailureJobsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListFailureJobsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFailureJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFailureJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedInstanceTagsRequest, ListProtectedInstanceTagsResponse> listProtectedInstanceTags =
        genForlistProtectedInstanceTags();

    private static HttpRequestDef<ListProtectedInstanceTagsRequest, ListProtectedInstanceTagsResponse> genForlistProtectedInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListProtectedInstanceTagsRequest, ListProtectedInstanceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProtectedInstanceTagsRequest.class,
                    ListProtectedInstanceTagsResponse.class)
                .withName("ListProtectedInstanceTags")
                .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedInstanceTagsRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedInstancesRequest, ListProtectedInstancesResponse> listProtectedInstances =
        genForlistProtectedInstances();

    private static HttpRequestDef<ListProtectedInstancesRequest, ListProtectedInstancesResponse> genForlistProtectedInstances() {
        // basic
        HttpRequestDef.Builder<ListProtectedInstancesRequest, ListProtectedInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProtectedInstancesRequest.class, ListProtectedInstancesResponse.class)
            .withName("ListProtectedInstances")
            .withUri("/v1/{project_id}/protected-instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<String>withRequestField("server_group_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getServerGroupIds, (req, v) -> {
                req.setServerGroupIds(v);
            }));
        builder.<String>withRequestField("protected_instance_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getProtectedInstanceIds, (req, v) -> {
                req.setProtectedInstanceIds(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListProtectedInstancesRequest.QueryTypeEnum>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProtectedInstancesRequest.QueryTypeEnum.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedInstancesRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedInstancesByTagsRequest, ListProtectedInstancesByTagsResponse> listProtectedInstancesByTags =
        genForlistProtectedInstancesByTags();

    private static HttpRequestDef<ListProtectedInstancesByTagsRequest, ListProtectedInstancesByTagsResponse> genForlistProtectedInstancesByTags() {
        // basic
        HttpRequestDef.Builder<ListProtectedInstancesByTagsRequest, ListProtectedInstancesByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListProtectedInstancesByTagsRequest.class,
                    ListProtectedInstancesByTagsResponse.class)
                .withName("ListProtectedInstancesByTags")
                .withUri("/v1/{project_id}/protected-instances/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListProtectedInstancesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProtectedInstancesByTagsRequestBody.class),
            f -> f.withMarshaller(ListProtectedInstancesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedInstancesProjectTagsRequest, ListProtectedInstancesProjectTagsResponse> listProtectedInstancesProjectTags =
        genForlistProtectedInstancesProjectTags();

    private static HttpRequestDef<ListProtectedInstancesProjectTagsRequest, ListProtectedInstancesProjectTagsResponse> genForlistProtectedInstancesProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProtectedInstancesProjectTagsRequest, ListProtectedInstancesProjectTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProtectedInstancesProjectTagsRequest.class,
                    ListProtectedInstancesProjectTagsResponse.class)
                .withName("ListProtectedInstancesProjectTags")
                .withUri("/v1/{project_id}/protected-instances/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectionGroupsRequest, ListProtectionGroupsResponse> listProtectionGroups =
        genForlistProtectionGroups();

    private static HttpRequestDef<ListProtectionGroupsRequest, ListProtectionGroupsResponse> genForlistProtectionGroups() {
        // basic
        HttpRequestDef.Builder<ListProtectionGroupsRequest, ListProtectionGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProtectionGroupsRequest.class, ListProtectionGroupsResponse.class)
            .withName("ListProtectionGroups")
            .withUri("/v1/{project_id}/server-groups")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionGroupsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListProtectionGroupsRequest.QueryTypeEnum>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProtectionGroupsRequest.QueryTypeEnum.class),
            f -> f.withMarshaller(ListProtectionGroupsRequest::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionGroupsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReplicationsRequest, ListReplicationsResponse> listReplications =
        genForlistReplications();

    private static HttpRequestDef<ListReplicationsRequest, ListReplicationsResponse> genForlistReplications() {
        // basic
        HttpRequestDef.Builder<ListReplicationsRequest, ListReplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReplicationsRequest.class, ListReplicationsResponse.class)
                .withName("ListReplications")
                .withUri("/v1/{project_id}/replications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationsRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<String>withRequestField("server_group_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationsRequest::getServerGroupIds, (req, v) -> {
                req.setServerGroupIds(v);
            }));
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationsRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<String>withRequestField("protected_instance_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationsRequest::getProtectedInstanceIds, (req, v) -> {
                req.setProtectedInstanceIds(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReplicationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReplicationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListReplicationsRequest.QueryTypeEnum>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListReplicationsRequest.QueryTypeEnum.class),
            f -> f.withMarshaller(ListReplicationsRequest::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReplicationsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRpoStatisticsRequest, ListRpoStatisticsResponse> listRpoStatistics =
        genForlistRpoStatistics();

    private static HttpRequestDef<ListRpoStatisticsRequest, ListRpoStatisticsResponse> genForlistRpoStatistics() {
        // basic
        HttpRequestDef.Builder<ListRpoStatisticsRequest, ListRpoStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRpoStatisticsRequest.class, ListRpoStatisticsResponse.class)
                .withName("ListRpoStatistics")
                .withUri("/v1/{project_id}/resource/rpo-statistics")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRpoStatisticsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRpoStatisticsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRpoStatisticsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRpoStatisticsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRpoStatisticsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeProtectedInstanceRequest, ResizeProtectedInstanceResponse> resizeProtectedInstance =
        genForresizeProtectedInstance();

    private static HttpRequestDef<ResizeProtectedInstanceRequest, ResizeProtectedInstanceResponse> genForresizeProtectedInstance() {
        // basic
        HttpRequestDef.Builder<ResizeProtectedInstanceRequest, ResizeProtectedInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResizeProtectedInstanceRequest.class, ResizeProtectedInstanceResponse.class)
            .withName("ResizeProtectedInstance")
            .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}/resize")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeProtectedInstanceRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<ResizeProtectedInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeProtectedInstanceRequestBody.class),
            f -> f.withMarshaller(ResizeProtectedInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDisasterRecoveryDrillRequest, ShowDisasterRecoveryDrillResponse> showDisasterRecoveryDrill =
        genForshowDisasterRecoveryDrill();

    private static HttpRequestDef<ShowDisasterRecoveryDrillRequest, ShowDisasterRecoveryDrillResponse> genForshowDisasterRecoveryDrill() {
        // basic
        HttpRequestDef.Builder<ShowDisasterRecoveryDrillRequest, ShowDisasterRecoveryDrillResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDisasterRecoveryDrillRequest.class,
                    ShowDisasterRecoveryDrillResponse.class)
                .withName("ShowDisasterRecoveryDrill")
                .withUri("/v1/{project_id}/disaster-recovery-drills/{disaster_recovery_drill_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_drill_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDisasterRecoveryDrillRequest::getDisasterRecoveryDrillId, (req, v) -> {
                req.setDisasterRecoveryDrillId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProtectedInstanceRequest, ShowProtectedInstanceResponse> showProtectedInstance =
        genForshowProtectedInstance();

    private static HttpRequestDef<ShowProtectedInstanceRequest, ShowProtectedInstanceResponse> genForshowProtectedInstance() {
        // basic
        HttpRequestDef.Builder<ShowProtectedInstanceRequest, ShowProtectedInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProtectedInstanceRequest.class, ShowProtectedInstanceResponse.class)
            .withName("ShowProtectedInstance")
            .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProtectedInstanceRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProtectionGroupRequest, ShowProtectionGroupResponse> showProtectionGroup =
        genForshowProtectionGroup();

    private static HttpRequestDef<ShowProtectionGroupRequest, ShowProtectionGroupResponse> genForshowProtectionGroup() {
        // basic
        HttpRequestDef.Builder<ShowProtectionGroupRequest, ShowProtectionGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProtectionGroupRequest.class, ShowProtectionGroupResponse.class)
                .withName("ShowProtectionGroup")
                .withUri("/v1/{project_id}/server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProtectionGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForshowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForshowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v1/{project_id}/sdrs/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReplicationRequest, ShowReplicationResponse> showReplication =
        genForshowReplication();

    private static HttpRequestDef<ShowReplicationRequest, ShowReplicationResponse> genForshowReplication() {
        // basic
        HttpRequestDef.Builder<ShowReplicationRequest, ShowReplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReplicationRequest.class, ShowReplicationResponse.class)
                .withName("ShowReplication")
                .withUri("/v1/{project_id}/replications/{replication_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("replication_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationRequest::getReplicationId, (req, v) -> {
                req.setReplicationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartFailoverProtectionGroupRequest, StartFailoverProtectionGroupResponse> startFailoverProtectionGroup =
        genForstartFailoverProtectionGroup();

    private static HttpRequestDef<StartFailoverProtectionGroupRequest, StartFailoverProtectionGroupResponse> genForstartFailoverProtectionGroup() {
        // basic
        HttpRequestDef.Builder<StartFailoverProtectionGroupRequest, StartFailoverProtectionGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartFailoverProtectionGroupRequest.class,
                    StartFailoverProtectionGroupResponse.class)
                .withName("StartFailoverProtectionGroup")
                .withUri("/v1/{project_id}/server-groups/{server_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartFailoverProtectionGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<FailoverProtectionGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FailoverProtectionGroupRequestBody.class),
            f -> f.withMarshaller(StartFailoverProtectionGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartProtectionGroupRequest, StartProtectionGroupResponse> startProtectionGroup =
        genForstartProtectionGroup();

    private static HttpRequestDef<StartProtectionGroupRequest, StartProtectionGroupResponse> genForstartProtectionGroup() {
        // basic
        HttpRequestDef.Builder<StartProtectionGroupRequest, StartProtectionGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartProtectionGroupRequest.class, StartProtectionGroupResponse.class)
            .withName("StartProtectionGroup")
            .withUri("/v1/{project_id}/server-groups/{server_group_id}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartProtectionGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<StartProtectionGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartProtectionGroupRequestBody.class),
            f -> f.withMarshaller(StartProtectionGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartReverseProtectionGroupRequest, StartReverseProtectionGroupResponse> startReverseProtectionGroup =
        genForstartReverseProtectionGroup();

    private static HttpRequestDef<StartReverseProtectionGroupRequest, StartReverseProtectionGroupResponse> genForstartReverseProtectionGroup() {
        // basic
        HttpRequestDef.Builder<StartReverseProtectionGroupRequest, StartReverseProtectionGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartReverseProtectionGroupRequest.class,
                    StartReverseProtectionGroupResponse.class)
                .withName("StartReverseProtectionGroup")
                .withUri("/v1/{project_id}/server-groups/{server_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartReverseProtectionGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<ReverseProtectionGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReverseProtectionGroupRequestBody.class),
            f -> f.withMarshaller(StartReverseProtectionGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopProtectionGroupRequest, StopProtectionGroupResponse> stopProtectionGroup =
        genForstopProtectionGroup();

    private static HttpRequestDef<StopProtectionGroupRequest, StopProtectionGroupResponse> genForstopProtectionGroup() {
        // basic
        HttpRequestDef.Builder<StopProtectionGroupRequest, StopProtectionGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopProtectionGroupRequest.class, StopProtectionGroupResponse.class)
                .withName("StopProtectionGroup")
                .withUri("/v1/{project_id}/server-groups/{server_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopProtectionGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<StopProtectionGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopProtectionGroupRequestBody.class),
            f -> f.withMarshaller(StopProtectionGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDisasterRecoveryDrillNameRequest, UpdateDisasterRecoveryDrillNameResponse> updateDisasterRecoveryDrillName =
        genForupdateDisasterRecoveryDrillName();

    private static HttpRequestDef<UpdateDisasterRecoveryDrillNameRequest, UpdateDisasterRecoveryDrillNameResponse> genForupdateDisasterRecoveryDrillName() {
        // basic
        HttpRequestDef.Builder<UpdateDisasterRecoveryDrillNameRequest, UpdateDisasterRecoveryDrillNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDisasterRecoveryDrillNameRequest.class,
                    UpdateDisasterRecoveryDrillNameResponse.class)
                .withName("UpdateDisasterRecoveryDrillName")
                .withUri("/v1/{project_id}/disaster-recovery-drills/{disaster_recovery_drill_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("disaster_recovery_drill_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDisasterRecoveryDrillNameRequest::getDisasterRecoveryDrillId, (req, v) -> {
                req.setDisasterRecoveryDrillId(v);
            }));
        builder.<UpdateDisasterRecoveryDrillNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDisasterRecoveryDrillNameRequestBody.class),
            f -> f.withMarshaller(UpdateDisasterRecoveryDrillNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProtectedInstanceNameRequest, UpdateProtectedInstanceNameResponse> updateProtectedInstanceName =
        genForupdateProtectedInstanceName();

    private static HttpRequestDef<UpdateProtectedInstanceNameRequest, UpdateProtectedInstanceNameResponse> genForupdateProtectedInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateProtectedInstanceNameRequest, UpdateProtectedInstanceNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProtectedInstanceNameRequest.class,
                    UpdateProtectedInstanceNameResponse.class)
                .withName("UpdateProtectedInstanceName")
                .withUri("/v1/{project_id}/protected-instances/{protected_instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("protected_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectedInstanceNameRequest::getProtectedInstanceId, (req, v) -> {
                req.setProtectedInstanceId(v);
            }));
        builder.<UpdateProtectedInstanceNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProtectedInstanceNameRequestBody.class),
            f -> f.withMarshaller(UpdateProtectedInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProtectionGroupNameRequest, UpdateProtectionGroupNameResponse> updateProtectionGroupName =
        genForupdateProtectionGroupName();

    private static HttpRequestDef<UpdateProtectionGroupNameRequest, UpdateProtectionGroupNameResponse> genForupdateProtectionGroupName() {
        // basic
        HttpRequestDef.Builder<UpdateProtectionGroupNameRequest, UpdateProtectionGroupNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProtectionGroupNameRequest.class,
                    UpdateProtectionGroupNameResponse.class)
                .withName("UpdateProtectionGroupName")
                .withUri("/v1/{project_id}/server-groups/{server_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectionGroupNameRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<UpdateProtectionGroupNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProtectionGroupNameRequestBody.class),
            f -> f.withMarshaller(UpdateProtectionGroupNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReplicationNameRequest, UpdateReplicationNameResponse> updateReplicationName =
        genForupdateReplicationName();

    private static HttpRequestDef<UpdateReplicationNameRequest, UpdateReplicationNameResponse> genForupdateReplicationName() {
        // basic
        HttpRequestDef.Builder<UpdateReplicationNameRequest, UpdateReplicationNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateReplicationNameRequest.class, UpdateReplicationNameResponse.class)
            .withName("UpdateReplicationName")
            .withUri("/v1/{project_id}/replications/{replication_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("replication_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReplicationNameRequest::getReplicationId, (req, v) -> {
                req.setReplicationId(v);
            }));
        builder.<UpdateReplicationNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReplicationNameRequestBody.class),
            f -> f.withMarshaller(UpdateReplicationNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpecifiedApiVersionRequest, ShowSpecifiedApiVersionResponse> showSpecifiedApiVersion =
        genForshowSpecifiedApiVersion();

    private static HttpRequestDef<ShowSpecifiedApiVersionRequest, ShowSpecifiedApiVersionResponse> genForshowSpecifiedApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowSpecifiedApiVersionRequest, ShowSpecifiedApiVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSpecifiedApiVersionRequest.class, ShowSpecifiedApiVersionResponse.class)
            .withName("ShowSpecifiedApiVersion")
            .withUri("/{api_version}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSpecifiedApiVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForshowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForshowJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStatusRequest, ShowJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatusRequest.class, ShowJobStatusResponse.class)
                .withName("ShowJobStatus")
                .withUri("/v1/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

}
