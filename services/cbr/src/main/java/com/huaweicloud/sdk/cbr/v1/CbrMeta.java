package com.huaweicloud.sdk.cbr.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cbr.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CbrMeta {

    public static final HttpRequestDef<AddMemberRequest, AddMemberResponse> addMember = genForaddMember();

    private static HttpRequestDef<AddMemberRequest, AddMemberResponse> genForaddMember() {
        // basic
        HttpRequestDef.Builder<AddMemberRequest, AddMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddMemberRequest.class, AddMemberResponse.class)
                .withName("AddMember")
                .withUri("/v3/{project_id}/backups/{backup_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddMemberRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddMembersReq.class,
            f -> f.withMarshaller(AddMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddVaultResourceRequest, AddVaultResourceResponse> addVaultResource = genForaddVaultResource();

    private static HttpRequestDef<AddVaultResourceRequest, AddVaultResourceResponse> genForaddVaultResource() {
        // basic
        HttpRequestDef.Builder<AddVaultResourceRequest, AddVaultResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVaultResourceRequest.class, AddVaultResourceResponse.class)
                .withName("AddVaultResource")
                .withUri("/v3/{project_id}/vaults/{vault_id}/addresources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddVaultResourceRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VaultAddResourceReq.class,
            f -> f.withMarshaller(AddVaultResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> associateVaultPolicy = genForassociateVaultPolicy();

    private static HttpRequestDef<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> genForassociateVaultPolicy() {
        // basic
        HttpRequestDef.Builder<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateVaultPolicyRequest.class, AssociateVaultPolicyResponse.class)
                .withName("AssociateVaultPolicy")
                .withUri("/v3/{project_id}/vaults/{vault_id}/associatepolicy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateVaultPolicyRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VaultAssociate.class,
            f -> f.withMarshaller(AssociateVaultPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTags = genForbatchCreateAndDeleteVaultTags();

    private static HttpRequestDef<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> genForbatchCreateAndDeleteVaultTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateAndDeleteVaultTagsRequest.class, BatchCreateAndDeleteVaultTagsResponse.class)
                .withName("BatchCreateAndDeleteVaultTags")
                .withUri("/v3/{project_id}/vault/{vault_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateAndDeleteVaultTagsRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            BulkCreateAndDeleteVaultTagsReq.class,
            f -> f.withMarshaller(BatchCreateAndDeleteVaultTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CopyBackupRequest, CopyBackupResponse> copyBackup = genForcopyBackup();

    private static HttpRequestDef<CopyBackupRequest, CopyBackupResponse> genForcopyBackup() {
        // basic
        HttpRequestDef.Builder<CopyBackupRequest, CopyBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyBackupRequest.class, CopyBackupResponse.class)
                .withName("CopyBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}/replicate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CopyBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BackupReplicateReq.class,
            f -> f.withMarshaller(CopyBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CopyCheckpointRequest, CopyCheckpointResponse> copyCheckpoint = genForcopyCheckpoint();

    private static HttpRequestDef<CopyCheckpointRequest, CopyCheckpointResponse> genForcopyCheckpoint() {
        // basic
        HttpRequestDef.Builder<CopyCheckpointRequest, CopyCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyCheckpointRequest.class, CopyCheckpointResponse.class)
                .withName("CopyCheckpoint")
                .withUri("/v3/{project_id}/checkpoints/replicate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CheckpointReplicateReq.class,
            f -> f.withMarshaller(CopyCheckpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateCheckpointRequest, CreateCheckpointResponse> createCheckpoint = genForcreateCheckpoint();

    private static HttpRequestDef<CreateCheckpointRequest, CreateCheckpointResponse> genForcreateCheckpoint() {
        // basic
        HttpRequestDef.Builder<CreateCheckpointRequest, CreateCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCheckpointRequest.class, CreateCheckpointResponse.class)
                .withName("CreateCheckpoint")
                .withUri("/v3/{project_id}/checkpoints")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VaultBackupReq.class,
            f -> f.withMarshaller(CreateCheckpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForcreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForcreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v3/{project_id}/policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PolicyCreateReq.class,
            f -> f.withMarshaller(CreatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateVaultRequest, CreateVaultResponse> createVault = genForcreateVault();

    private static HttpRequestDef<CreateVaultRequest, CreateVaultResponse> genForcreateVault() {
        // basic
        HttpRequestDef.Builder<CreateVaultRequest, CreateVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVaultRequest.class, CreateVaultResponse.class)
                .withName("CreateVault")
                .withUri("/v3/{project_id}/vaults")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VaultCreateReq.class,
            f -> f.withMarshaller(CreateVaultRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateVaultTagsRequest, CreateVaultTagsResponse> createVaultTags = genForcreateVaultTags();

    private static HttpRequestDef<CreateVaultTagsRequest, CreateVaultTagsResponse> genForcreateVaultTags() {
        // basic
        HttpRequestDef.Builder<CreateVaultTagsRequest, CreateVaultTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVaultTagsRequest.class, CreateVaultTagsResponse.class)
                .withName("CreateVaultTags")
                .withUri("/v3/{project_id}/vault/{vault_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateVaultTagsRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            VaultTagsCreateReq.class,
            f -> f.withMarshaller(CreateVaultTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genFordeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genFordeleteBackup() {
        // basic
        HttpRequestDef.Builder<DeleteBackupRequest, DeleteBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupRequest.class, DeleteBackupResponse.class)
                .withName("DeleteBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genFordeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genFordeleteMember() {
        // basic
        HttpRequestDef.Builder<DeleteMemberRequest, DeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberRequest.class, DeleteMemberResponse.class)
                .withName("DeleteMember")
                .withUri("/v3/{project_id}/backups/{backup_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMemberRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genFordeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genFordeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v3/{project_id}/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteVaultRequest, DeleteVaultResponse> deleteVault = genFordeleteVault();

    private static HttpRequestDef<DeleteVaultRequest, DeleteVaultResponse> genFordeleteVault() {
        // basic
        HttpRequestDef.Builder<DeleteVaultRequest, DeleteVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVaultRequest.class, DeleteVaultResponse.class)
                .withName("DeleteVault")
                .withUri("/v3/{project_id}/vaults/{vault_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVaultRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteVaultTagRequest, DeleteVaultTagResponse> deleteVaultTag = genFordeleteVaultTag();

    private static HttpRequestDef<DeleteVaultTagRequest, DeleteVaultTagResponse> genFordeleteVaultTag() {
        // basic
        HttpRequestDef.Builder<DeleteVaultTagRequest, DeleteVaultTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVaultTagRequest.class, DeleteVaultTagResponse.class)
                .withName("DeleteVaultTag")
                .withUri("/v3/{project_id}/vault/{vault_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVaultTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVaultTagRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> disassociateVaultPolicy = genFordisassociateVaultPolicy();

    private static HttpRequestDef<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> genFordisassociateVaultPolicy() {
        // basic
        HttpRequestDef.Builder<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateVaultPolicyRequest.class, DisassociateVaultPolicyResponse.class)
                .withName("DisassociateVaultPolicy")
                .withUri("/v3/{project_id}/vaults/{vault_id}/dissociatepolicy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateVaultPolicyRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VaultDissociate.class,
            f -> f.withMarshaller(DisassociateVaultPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ImportBackupRequest, ImportBackupResponse> importBackup = genForimportBackup();

    private static HttpRequestDef<ImportBackupRequest, ImportBackupResponse> genForimportBackup() {
        // basic
        HttpRequestDef.Builder<ImportBackupRequest, ImportBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportBackupRequest.class, ImportBackupResponse.class)
                .withName("ImportBackup")
                .withUri("/v3/{project_id}/backups/sync")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BackupSyncReq.class,
            f -> f.withMarshaller(ImportBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForlistBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForlistBackups() {
        // basic
        HttpRequestDef.Builder<ListBackupsRequest, ListBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupsRequest.class, ListBackupsResponse.class)
                .withName("ListBackups")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("checkpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getCheckpointId, (req, v) -> {
                req.setCheckpointId(v);
            })
        );
        builder.withRequestField("dec",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListBackupsRequest::getDec, (req, v) -> {
                req.setDec(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBackupsRequest.ImageTypeEnum.class,
            f -> f.withMarshaller(ListBackupsRequest::getImageType, (req, v) -> {
                req.setImageType(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("resource_az",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getResourceAz, (req, v) -> {
                req.setResourceAz(v);
            })
        );
        builder.withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );
        builder.withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            })
        );
        builder.withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBackupsRequest.ResourceTypeEnum.class,
            f -> f.withMarshaller(ListBackupsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            })
        );
        builder.withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getSort, (req, v) -> {
                req.setSort(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBackupsRequest.StatusEnum.class,
            f -> f.withMarshaller(ListBackupsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("own_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBackupsRequest.OwnTypeEnum.class,
            f -> f.withMarshaller(ListBackupsRequest::getOwnType, (req, v) -> {
                req.setOwnType(v);
            })
        );
        builder.withRequestField("member_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBackupsRequest.MemberStatusEnum.class,
            f -> f.withMarshaller(ListBackupsRequest::getMemberStatus, (req, v) -> {
                req.setMemberStatus(v);
            })
        );
        builder.withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            })
        );
        builder.withRequestField("used_percent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getUsedPercent, (req, v) -> {
                req.setUsedPercent(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListOpLogsRequest, ListOpLogsResponse> listOpLogs = genForlistOpLogs();

    private static HttpRequestDef<ListOpLogsRequest, ListOpLogsResponse> genForlistOpLogs() {
        // basic
        HttpRequestDef.Builder<ListOpLogsRequest, ListOpLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOpLogsRequest.class, ListOpLogsResponse.class)
                .withName("ListOpLogs")
                .withUri("/v3/{project_id}/operation-logs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOpLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListOpLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListOpLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListOpLogsRequest.OperationTypeEnum.class,
            f -> f.withMarshaller(ListOpLogsRequest::getOperationType, (req, v) -> {
                req.setOperationType(v);
            })
        );
        builder.withRequestField("provider_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOpLogsRequest::getProviderId, (req, v) -> {
                req.setProviderId(v);
            })
        );
        builder.withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOpLogsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );
        builder.withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOpLogsRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOpLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListOpLogsRequest.StatusEnum.class,
            f -> f.withMarshaller(ListOpLogsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOpLogsRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("vault_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOpLogsRequest::getVaultName, (req, v) -> {
                req.setVaultName(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOpLogsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> listPolicies = genForlistPolicies();

    private static HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> genForlistPolicies() {
        // basic
        HttpRequestDef.Builder<ListPoliciesRequest, ListPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoliciesRequest.class, ListPoliciesResponse.class)
                .withName("ListPolicies")
                .withUri("/v3/{project_id}/policies")
                .withContentType("application/json");

        // requests
        builder.withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListPoliciesRequest.OperationTypeEnum.class,
            f -> f.withMarshaller(ListPoliciesRequest::getOperationType, (req, v) -> {
                req.setOperationType(v);
            })
        );
        builder.withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoliciesRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListProtectableRequest, ListProtectableResponse> listProtectable = genForlistProtectable();

    private static HttpRequestDef<ListProtectableRequest, ListProtectableResponse> genForlistProtectable() {
        // basic
        HttpRequestDef.Builder<ListProtectableRequest, ListProtectableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProtectableRequest.class, ListProtectableResponse.class)
                .withName("ListProtectable")
                .withUri("/v3/{project_id}/protectables/{protectable_type}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("protectable_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListProtectableRequest.ProtectableTypeEnum.class,
            f -> f.withMarshaller(ListProtectableRequest::getProtectableType, (req, v) -> {
                req.setProtectableType(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProtectableRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProtectableRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProtectableRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProtectableRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProtectableRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProtectableRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProtectableRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListVaultRequest, ListVaultResponse> listVault = genForlistVault();

    private static HttpRequestDef<ListVaultRequest, ListVaultResponse> genForlistVault() {
        // basic
        HttpRequestDef.Builder<ListVaultRequest, ListVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVaultRequest.class, ListVaultResponse.class)
                .withName("ListVault")
                .withUri("/v3/{project_id}/vaults")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVaultRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVaultRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVaultRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("cloud_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListVaultRequest.CloudTypeEnum.class,
            f -> f.withMarshaller(ListVaultRequest::getCloudType, (req, v) -> {
                req.setCloudType(v);
            })
        );
        builder.withRequestField("protect_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListVaultRequest.ProtectTypeEnum.class,
            f -> f.withMarshaller(ListVaultRequest::getProtectType, (req, v) -> {
                req.setProtectType(v);
            })
        );
        builder.withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVaultRequest::getObjectType, (req, v) -> {
                req.setObjectType(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVaultRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVaultRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVaultRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVaultRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("resource_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVaultRequest::getResourceIds, (req, v) -> {
                req.setResourceIds(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<MigrateVaultResourceRequest, MigrateVaultResourceResponse> migrateVaultResource = genFormigrateVaultResource();

    private static HttpRequestDef<MigrateVaultResourceRequest, MigrateVaultResourceResponse> genFormigrateVaultResource() {
        // basic
        HttpRequestDef.Builder<MigrateVaultResourceRequest, MigrateVaultResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateVaultResourceRequest.class, MigrateVaultResourceResponse.class)
                .withName("MigrateVaultResource")
                .withUri("/v3/{project_id}/vaults/{vault_id}/migrateresources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MigrateVaultResourceRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VaultMigrateResourceReq.class,
            f -> f.withMarshaller(MigrateVaultResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RemoveVaultResourceRequest, RemoveVaultResourceResponse> removeVaultResource = genForremoveVaultResource();

    private static HttpRequestDef<RemoveVaultResourceRequest, RemoveVaultResourceResponse> genForremoveVaultResource() {
        // basic
        HttpRequestDef.Builder<RemoveVaultResourceRequest, RemoveVaultResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveVaultResourceRequest.class, RemoveVaultResourceResponse.class)
                .withName("RemoveVaultResource")
                .withUri("/v3/{project_id}/vaults/{vault_id}/removeresources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemoveVaultResourceRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VaultRemoveResourceReq.class,
            f -> f.withMarshaller(RemoveVaultResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> restoreBackup = genForrestoreBackup();

    private static HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> genForrestoreBackup() {
        // basic
        HttpRequestDef.Builder<RestoreBackupRequest, RestoreBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreBackupRequest.class, RestoreBackupResponse.class)
                .withName("RestoreBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}/restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestoreBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BackupRestoreReq.class,
            f -> f.withMarshaller(RestoreBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupRequest, ShowBackupResponse> showBackup = genForshowBackup();

    private static HttpRequestDef<ShowBackupRequest, ShowBackupResponse> genForshowBackup() {
        // basic
        HttpRequestDef.Builder<ShowBackupRequest, ShowBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupRequest.class, ShowBackupResponse.class)
                .withName("ShowBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpoint = genForshowCheckpoint();

    private static HttpRequestDef<ShowCheckpointRequest, ShowCheckpointResponse> genForshowCheckpoint() {
        // basic
        HttpRequestDef.Builder<ShowCheckpointRequest, ShowCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCheckpointRequest.class, ShowCheckpointResponse.class)
                .withName("ShowCheckpoint")
                .withUri("/v3/{project_id}/checkpoints/{checkpoint_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("checkpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCheckpointRequest::getCheckpointId, (req, v) -> {
                req.setCheckpointId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberDetailRequest, ShowMemberDetailResponse> showMemberDetail = genForshowMemberDetail();

    private static HttpRequestDef<ShowMemberDetailRequest, ShowMemberDetailResponse> genForshowMemberDetail() {
        // basic
        HttpRequestDef.Builder<ShowMemberDetailRequest, ShowMemberDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMemberDetailRequest.class, ShowMemberDetailResponse.class)
                .withName("ShowMemberDetail")
                .withUri("/v3/{project_id}/backups/{backup_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMemberDetailRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMemberDetailRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMembersDetailRequest, ShowMembersDetailResponse> showMembersDetail = genForshowMembersDetail();

    private static HttpRequestDef<ShowMembersDetailRequest, ShowMembersDetailResponse> genForshowMembersDetail() {
        // basic
        HttpRequestDef.Builder<ShowMembersDetailRequest, ShowMembersDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMembersDetailRequest.class, ShowMembersDetailResponse.class)
                .withName("ShowMembersDetail")
                .withUri("/v3/{project_id}/backups/{backup_id}/members")
                .withContentType("application/json");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("dest_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getDestProjectId, (req, v) -> {
                req.setDestProjectId(v);
            })
        );
        builder.withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMembersDetailRequest::getSort, (req, v) -> {
                req.setSort(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowOpLogRequest, ShowOpLogResponse> showOpLog = genForshowOpLog();

    private static HttpRequestDef<ShowOpLogRequest, ShowOpLogResponse> genForshowOpLog() {
        // basic
        HttpRequestDef.Builder<ShowOpLogRequest, ShowOpLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOpLogRequest.class, ShowOpLogResponse.class)
                .withName("ShowOpLog")
                .withUri("/v3/{project_id}/operation-logs/{operation_log_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("operation_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowOpLogRequest::getOperationLogId, (req, v) -> {
                req.setOperationLogId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForshowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForshowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v3/{project_id}/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowProtectableRequest, ShowProtectableResponse> showProtectable = genForshowProtectable();

    private static HttpRequestDef<ShowProtectableRequest, ShowProtectableResponse> genForshowProtectable() {
        // basic
        HttpRequestDef.Builder<ShowProtectableRequest, ShowProtectableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProtectableRequest.class, ShowProtectableResponse.class)
                .withName("ShowProtectable")
                .withUri("/v3/{project_id}/protectables/{protectable_type}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProtectableRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("protectable_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShowProtectableRequest.ProtectableTypeEnum.class,
            f -> f.withMarshaller(ShowProtectableRequest::getProtectableType, (req, v) -> {
                req.setProtectableType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> showReplicationCapabilities = genForshowReplicationCapabilities();

    private static HttpRequestDef<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> genForshowReplicationCapabilities() {
        // basic
        HttpRequestDef.Builder<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReplicationCapabilitiesRequest.class, ShowReplicationCapabilitiesResponse.class)
                .withName("ShowReplicationCapabilities")
                .withUri("/v3/{project_id}/replication-capabilities")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultRequest, ShowVaultResponse> showVault = genForshowVault();

    private static HttpRequestDef<ShowVaultRequest, ShowVaultResponse> genForshowVault() {
        // basic
        HttpRequestDef.Builder<ShowVaultRequest, ShowVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVaultRequest.class, ShowVaultResponse.class)
                .withName("ShowVault")
                .withUri("/v3/{project_id}/vaults/{vault_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVaultRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> showVaultProjectTag = genForshowVaultProjectTag();

    private static HttpRequestDef<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> genForshowVaultProjectTag() {
        // basic
        HttpRequestDef.Builder<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVaultProjectTagRequest.class, ShowVaultProjectTagResponse.class)
                .withName("ShowVaultProjectTag")
                .withUri("/v3/{project_id}/vault/tags")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> showVaultResourceInstances = genForshowVaultResourceInstances();

    private static HttpRequestDef<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> genForshowVaultResourceInstances() {
        // basic
        HttpRequestDef.Builder<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowVaultResourceInstancesRequest.class, ShowVaultResourceInstancesResponse.class)
                .withName("ShowVaultResourceInstances")
                .withUri("/v3/{project_id}/vault/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            VaultResourceInstancesReq.class,
            f -> f.withMarshaller(ShowVaultResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultTagRequest, ShowVaultTagResponse> showVaultTag = genForshowVaultTag();

    private static HttpRequestDef<ShowVaultTagRequest, ShowVaultTagResponse> genForshowVaultTag() {
        // basic
        HttpRequestDef.Builder<ShowVaultTagRequest, ShowVaultTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVaultTagRequest.class, ShowVaultTagResponse.class)
                .withName("ShowVaultTag")
                .withUri("/v3/{project_id}/vault/{vault_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVaultTagRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberStatusRequest, UpdateMemberStatusResponse> updateMemberStatus = genForupdateMemberStatus();

    private static HttpRequestDef<UpdateMemberStatusRequest, UpdateMemberStatusResponse> genForupdateMemberStatus() {
        // basic
        HttpRequestDef.Builder<UpdateMemberStatusRequest, UpdateMemberStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberStatusRequest.class, UpdateMemberStatusResponse.class)
                .withName("UpdateMemberStatus")
                .withUri("/v3/{project_id}/backups/{backup_id}/members/{member_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMemberStatusRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMemberStatusRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateMember.class,
            f -> f.withMarshaller(UpdateMemberStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForupdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForupdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v3/{project_id}/policies/{policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PolicyUpdateReq.class,
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateVaultRequest, UpdateVaultResponse> updateVault = genForupdateVault();

    private static HttpRequestDef<UpdateVaultRequest, UpdateVaultResponse> genForupdateVault() {
        // basic
        HttpRequestDef.Builder<UpdateVaultRequest, UpdateVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVaultRequest.class, UpdateVaultResponse.class)
                .withName("UpdateVault")
                .withUri("/v3/{project_id}/vaults/{vault_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateVaultRequest::getVaultId, (req, v) -> {
                req.setVaultId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VaultUpdateReq.class,
            f -> f.withMarshaller(UpdateVaultRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
