package com.huaweicloud.sdk.cbr.v1;

import com.huaweicloud.sdk.cbr.v1.model.AddAgentPathRequest;
import com.huaweicloud.sdk.cbr.v1.model.AddAgentPathResponse;
import com.huaweicloud.sdk.cbr.v1.model.AddMemberRequest;
import com.huaweicloud.sdk.cbr.v1.model.AddMemberResponse;
import com.huaweicloud.sdk.cbr.v1.model.AddMembersReq;
import com.huaweicloud.sdk.cbr.v1.model.AddVaultResourceRequest;
import com.huaweicloud.sdk.cbr.v1.model.AddVaultResourceResponse;
import com.huaweicloud.sdk.cbr.v1.model.AgentAddPathReq;
import com.huaweicloud.sdk.cbr.v1.model.AgentRegisterReq;
import com.huaweicloud.sdk.cbr.v1.model.AgentRemovePathReq;
import com.huaweicloud.sdk.cbr.v1.model.AgentUpdateReq;
import com.huaweicloud.sdk.cbr.v1.model.AssociateVaultPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.AssociateVaultPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.BackupReplicateReq;
import com.huaweicloud.sdk.cbr.v1.model.BackupRestoreReq;
import com.huaweicloud.sdk.cbr.v1.model.BackupSyncReq;
import com.huaweicloud.sdk.cbr.v1.model.BackupUpdateReq;
import com.huaweicloud.sdk.cbr.v1.model.BatchCreateAndDeleteVaultTagsRequest;
import com.huaweicloud.sdk.cbr.v1.model.BatchCreateAndDeleteVaultTagsResponse;
import com.huaweicloud.sdk.cbr.v1.model.BatchUpdateVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.BatchUpdateVaultRequestBody;
import com.huaweicloud.sdk.cbr.v1.model.BatchUpdateVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.BulkCreateAndDeleteVaultTagsReq;
import com.huaweicloud.sdk.cbr.v1.model.CbcUpdate;
import com.huaweicloud.sdk.cbr.v1.model.CheckAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.CheckAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.CheckpointReplicateReq;
import com.huaweicloud.sdk.cbr.v1.model.CopyBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.CopyBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.CopyCheckpointRequest;
import com.huaweicloud.sdk.cbr.v1.model.CopyCheckpointResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreateCheckpointRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreateCheckpointResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreatePostPaidVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreatePostPaidVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreateVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreateVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreateVaultTagsRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreateVaultTagsResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteMemberRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteMemberResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteVaultTagRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteVaultTagResponse;
import com.huaweicloud.sdk.cbr.v1.model.DisassociateVaultPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.DisassociateVaultPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.DomainMigrate;
import com.huaweicloud.sdk.cbr.v1.model.ImportBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.ImportBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.ImportCheckpointRequest;
import com.huaweicloud.sdk.cbr.v1.model.ImportCheckpointResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListBackupsRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListBackupsResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListDomainProjectsRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListDomainProjectsResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListExternalVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListExternalVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListOpLogsRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListOpLogsResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListPoliciesRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListPoliciesResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListProjectsRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListProjectsResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListProtectableRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListProtectableResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.MigrateDomainRequest;
import com.huaweicloud.sdk.cbr.v1.model.MigrateDomainResponse;
import com.huaweicloud.sdk.cbr.v1.model.MigrateVaultResourceRequest;
import com.huaweicloud.sdk.cbr.v1.model.MigrateVaultResourceResponse;
import com.huaweicloud.sdk.cbr.v1.model.PolicyCreateReq;
import com.huaweicloud.sdk.cbr.v1.model.PolicyUpdateReq;
import com.huaweicloud.sdk.cbr.v1.model.ProtectableAgentReq;
import com.huaweicloud.sdk.cbr.v1.model.RegisterAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.RegisterAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.RemoveAgentPathRequest;
import com.huaweicloud.sdk.cbr.v1.model.RemoveAgentPathResponse;
import com.huaweicloud.sdk.cbr.v1.model.RemoveVaultResourceRequest;
import com.huaweicloud.sdk.cbr.v1.model.RemoveVaultResourceResponse;
import com.huaweicloud.sdk.cbr.v1.model.RestoreBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.RestoreBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.SetVaultResourceRequest;
import com.huaweicloud.sdk.cbr.v1.model.SetVaultResourceResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowCheckpointRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowCheckpointResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowDomainRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowDomainResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowMemberDetailRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowMemberDetailResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowMembersDetailRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowMembersDetailResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowMetadataRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowMetadataResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowMigrateStatusRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowMigrateStatusResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowOpLogRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowOpLogResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowProtectableRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowProtectableResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowReplicationCapabilitiesRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowReplicationCapabilitiesResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowStorageUsageRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowStorageUsageResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowSummaryRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowSummaryResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultProjectTagRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultProjectTagResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultResourceInstancesRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultResourceInstancesResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultTagRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultTagResponse;
import com.huaweicloud.sdk.cbr.v1.model.SyncReq;
import com.huaweicloud.sdk.cbr.v1.model.UnregisterAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.UnregisterAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateMember;
import com.huaweicloud.sdk.cbr.v1.model.UpdateMemberStatusRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateMemberStatusResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateOrderRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateOrderResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.VaultAddResourceReq;
import com.huaweicloud.sdk.cbr.v1.model.VaultAssociate;
import com.huaweicloud.sdk.cbr.v1.model.VaultBackupReq;
import com.huaweicloud.sdk.cbr.v1.model.VaultCreateReq;
import com.huaweicloud.sdk.cbr.v1.model.VaultDissociate;
import com.huaweicloud.sdk.cbr.v1.model.VaultMigrateResourceReq;
import com.huaweicloud.sdk.cbr.v1.model.VaultOrderCreateReqs;
import com.huaweicloud.sdk.cbr.v1.model.VaultRemoveResourceReq;
import com.huaweicloud.sdk.cbr.v1.model.VaultResourceInstancesReq;
import com.huaweicloud.sdk.cbr.v1.model.VaultSetResourceReq;
import com.huaweicloud.sdk.cbr.v1.model.VaultTagsCreateReq;
import com.huaweicloud.sdk.cbr.v1.model.VaultUpdateReq;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class CbrMeta {

    public static final HttpRequestDef<AddAgentPathRequest, AddAgentPathResponse> addAgentPath = genForAddAgentPath();

    private static HttpRequestDef<AddAgentPathRequest, AddAgentPathResponse> genForAddAgentPath() {
        // basic
        HttpRequestDef.Builder<AddAgentPathRequest, AddAgentPathResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAgentPathRequest.class, AddAgentPathResponse.class)
                .withName("AddAgentPath")
                .withUri("/v3/{project_id}/agents/{agent_id}/add-path")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAgentPathRequest::getAgentId, AddAgentPathRequest::setAgentId));
        builder.<AgentAddPathReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentAddPathReq.class),
            f -> f.withMarshaller(AddAgentPathRequest::getBody, AddAgentPathRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMemberRequest, AddMemberResponse> addMember = genForAddMember();

    private static HttpRequestDef<AddMemberRequest, AddMemberResponse> genForAddMember() {
        // basic
        HttpRequestDef.Builder<AddMemberRequest, AddMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddMemberRequest.class, AddMemberResponse.class)
                .withName("AddMember")
                .withUri("/v3/{project_id}/backups/{backup_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddMemberRequest::getBackupId, AddMemberRequest::setBackupId));
        builder.<AddMembersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddMembersReq.class),
            f -> f.withMarshaller(AddMemberRequest::getBody, AddMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVaultResourceRequest, AddVaultResourceResponse> addVaultResource =
        genForAddVaultResource();

    private static HttpRequestDef<AddVaultResourceRequest, AddVaultResourceResponse> genForAddVaultResource() {
        // basic
        HttpRequestDef.Builder<AddVaultResourceRequest, AddVaultResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVaultResourceRequest.class, AddVaultResourceResponse.class)
                .withName("AddVaultResource")
                .withUri("/v3/{project_id}/vaults/{vault_id}/addresources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddVaultResourceRequest::getVaultId, AddVaultResourceRequest::setVaultId));
        builder.<VaultAddResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultAddResourceReq.class),
            f -> f.withMarshaller(AddVaultResourceRequest::getBody, AddVaultResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> associateVaultPolicy =
        genForAssociateVaultPolicy();

    private static HttpRequestDef<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> genForAssociateVaultPolicy() {
        // basic
        HttpRequestDef.Builder<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateVaultPolicyRequest.class, AssociateVaultPolicyResponse.class)
            .withName("AssociateVaultPolicy")
            .withUri("/v3/{project_id}/vaults/{vault_id}/associatepolicy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateVaultPolicyRequest::getVaultId, AssociateVaultPolicyRequest::setVaultId));
        builder.<VaultAssociate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultAssociate.class),
            f -> f.withMarshaller(AssociateVaultPolicyRequest::getBody, AssociateVaultPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTags =
        genForBatchCreateAndDeleteVaultTags();

    private static HttpRequestDef<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> genForBatchCreateAndDeleteVaultTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateAndDeleteVaultTagsRequest.class,
                    BatchCreateAndDeleteVaultTagsResponse.class)
                .withName("BatchCreateAndDeleteVaultTags")
                .withUri("/v3/{project_id}/vault/{vault_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateAndDeleteVaultTagsRequest::getVaultId,
                BatchCreateAndDeleteVaultTagsRequest::setVaultId));
        builder.<BulkCreateAndDeleteVaultTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BulkCreateAndDeleteVaultTagsReq.class),
            f -> f.withMarshaller(BatchCreateAndDeleteVaultTagsRequest::getBody,
                BatchCreateAndDeleteVaultTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateVaultRequest, BatchUpdateVaultResponse> batchUpdateVault =
        genForBatchUpdateVault();

    private static HttpRequestDef<BatchUpdateVaultRequest, BatchUpdateVaultResponse> genForBatchUpdateVault() {
        // basic
        HttpRequestDef.Builder<BatchUpdateVaultRequest, BatchUpdateVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateVaultRequest.class, BatchUpdateVaultResponse.class)
                .withName("BatchUpdateVault")
                .withUri("/v3/{project_id}/vaults/batch-update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchUpdateVaultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateVaultRequestBody.class),
            f -> f.withMarshaller(BatchUpdateVaultRequest::getBody, BatchUpdateVaultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAgentRequest, CheckAgentResponse> checkAgent = genForCheckAgent();

    private static HttpRequestDef<CheckAgentRequest, CheckAgentResponse> genForCheckAgent() {
        // basic
        HttpRequestDef.Builder<CheckAgentRequest, CheckAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckAgentRequest.class, CheckAgentResponse.class)
                .withName("CheckAgent")
                .withUri("/v3/{project_id}/agent/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ProtectableAgentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectableAgentReq.class),
            f -> f.withMarshaller(CheckAgentRequest::getBody, CheckAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyBackupRequest, CopyBackupResponse> copyBackup = genForCopyBackup();

    private static HttpRequestDef<CopyBackupRequest, CopyBackupResponse> genForCopyBackup() {
        // basic
        HttpRequestDef.Builder<CopyBackupRequest, CopyBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyBackupRequest.class, CopyBackupResponse.class)
                .withName("CopyBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}/replicate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyBackupRequest::getBackupId, CopyBackupRequest::setBackupId));
        builder.<BackupReplicateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BackupReplicateReq.class),
            f -> f.withMarshaller(CopyBackupRequest::getBody, CopyBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyCheckpointRequest, CopyCheckpointResponse> copyCheckpoint =
        genForCopyCheckpoint();

    private static HttpRequestDef<CopyCheckpointRequest, CopyCheckpointResponse> genForCopyCheckpoint() {
        // basic
        HttpRequestDef.Builder<CopyCheckpointRequest, CopyCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyCheckpointRequest.class, CopyCheckpointResponse.class)
                .withName("CopyCheckpoint")
                .withUri("/v3/{project_id}/checkpoints/replicate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CheckpointReplicateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckpointReplicateReq.class),
            f -> f.withMarshaller(CopyCheckpointRequest::getBody, CopyCheckpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCheckpointRequest, CreateCheckpointResponse> createCheckpoint =
        genForCreateCheckpoint();

    private static HttpRequestDef<CreateCheckpointRequest, CreateCheckpointResponse> genForCreateCheckpoint() {
        // basic
        HttpRequestDef.Builder<CreateCheckpointRequest, CreateCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCheckpointRequest.class, CreateCheckpointResponse.class)
                .withName("CreateCheckpoint")
                .withUri("/v3/{project_id}/checkpoints")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VaultBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultBackupReq.class),
            f -> f.withMarshaller(CreateCheckpointRequest::getBody, CreateCheckpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForCreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v3/{project_id}/policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PolicyCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyCreateReq.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, CreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidVaultRequest, CreatePostPaidVaultResponse> createPostPaidVault =
        genForCreatePostPaidVault();

    private static HttpRequestDef<CreatePostPaidVaultRequest, CreatePostPaidVaultResponse> genForCreatePostPaidVault() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidVaultRequest, CreatePostPaidVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostPaidVaultRequest.class, CreatePostPaidVaultResponse.class)
                .withName("CreatePostPaidVault")
                .withUri("/v3/{project_id}/vaults/order")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VaultOrderCreateReqs>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultOrderCreateReqs.class),
            f -> f.withMarshaller(CreatePostPaidVaultRequest::getBody, CreatePostPaidVaultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVaultRequest, CreateVaultResponse> createVault = genForCreateVault();

    private static HttpRequestDef<CreateVaultRequest, CreateVaultResponse> genForCreateVault() {
        // basic
        HttpRequestDef.Builder<CreateVaultRequest, CreateVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVaultRequest.class, CreateVaultResponse.class)
                .withName("CreateVault")
                .withUri("/v3/{project_id}/vaults")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VaultCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultCreateReq.class),
            f -> f.withMarshaller(CreateVaultRequest::getBody, CreateVaultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVaultTagsRequest, CreateVaultTagsResponse> createVaultTags =
        genForCreateVaultTags();

    private static HttpRequestDef<CreateVaultTagsRequest, CreateVaultTagsResponse> genForCreateVaultTags() {
        // basic
        HttpRequestDef.Builder<CreateVaultTagsRequest, CreateVaultTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVaultTagsRequest.class, CreateVaultTagsResponse.class)
                .withName("CreateVaultTags")
                .withUri("/v3/{project_id}/vault/{vault_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVaultTagsRequest::getVaultId, CreateVaultTagsRequest::setVaultId));
        builder.<VaultTagsCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(VaultTagsCreateReq.class),
            f -> f.withMarshaller(CreateVaultTagsRequest::getBody, CreateVaultTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genForDeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genForDeleteBackup() {
        // basic
        HttpRequestDef.Builder<DeleteBackupRequest, DeleteBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupRequest.class, DeleteBackupResponse.class)
                .withName("DeleteBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, DeleteBackupRequest::setBackupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genForDeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genForDeleteMember() {
        // basic
        HttpRequestDef.Builder<DeleteMemberRequest, DeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberRequest.class, DeleteMemberResponse.class)
                .withName("DeleteMember")
                .withUri("/v3/{project_id}/backups/{backup_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getBackupId, DeleteMemberRequest::setBackupId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getMemberId, DeleteMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v3/{project_id}/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVaultRequest, DeleteVaultResponse> deleteVault = genForDeleteVault();

    private static HttpRequestDef<DeleteVaultRequest, DeleteVaultResponse> genForDeleteVault() {
        // basic
        HttpRequestDef.Builder<DeleteVaultRequest, DeleteVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVaultRequest.class, DeleteVaultResponse.class)
                .withName("DeleteVault")
                .withUri("/v3/{project_id}/vaults/{vault_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVaultRequest::getVaultId, DeleteVaultRequest::setVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVaultTagRequest, DeleteVaultTagResponse> deleteVaultTag =
        genForDeleteVaultTag();

    private static HttpRequestDef<DeleteVaultTagRequest, DeleteVaultTagResponse> genForDeleteVaultTag() {
        // basic
        HttpRequestDef.Builder<DeleteVaultTagRequest, DeleteVaultTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVaultTagRequest.class, DeleteVaultTagResponse.class)
                .withName("DeleteVaultTag")
                .withUri("/v3/{project_id}/vault/{vault_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVaultTagRequest::getKey, DeleteVaultTagRequest::setKey));
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVaultTagRequest::getVaultId, DeleteVaultTagRequest::setVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> disassociateVaultPolicy =
        genForDisassociateVaultPolicy();

    private static HttpRequestDef<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> genForDisassociateVaultPolicy() {
        // basic
        HttpRequestDef.Builder<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisassociateVaultPolicyRequest.class, DisassociateVaultPolicyResponse.class)
            .withName("DisassociateVaultPolicy")
            .withUri("/v3/{project_id}/vaults/{vault_id}/dissociatepolicy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateVaultPolicyRequest::getVaultId,
                DisassociateVaultPolicyRequest::setVaultId));
        builder.<VaultDissociate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultDissociate.class),
            f -> f.withMarshaller(DisassociateVaultPolicyRequest::getBody, DisassociateVaultPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportBackupRequest, ImportBackupResponse> importBackup = genForImportBackup();

    private static HttpRequestDef<ImportBackupRequest, ImportBackupResponse> genForImportBackup() {
        // basic
        HttpRequestDef.Builder<ImportBackupRequest, ImportBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportBackupRequest.class, ImportBackupResponse.class)
                .withName("ImportBackup")
                .withUri("/v3/{project_id}/backups/sync")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BackupSyncReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BackupSyncReq.class),
            f -> f.withMarshaller(ImportBackupRequest::getBody, ImportBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportCheckpointRequest, ImportCheckpointResponse> importCheckpoint =
        genForImportCheckpoint();

    private static HttpRequestDef<ImportCheckpointRequest, ImportCheckpointResponse> genForImportCheckpoint() {
        // basic
        HttpRequestDef.Builder<ImportCheckpointRequest, ImportCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportCheckpointRequest.class, ImportCheckpointResponse.class)
                .withName("ImportCheckpoint")
                .withUri("/v3/{project_id}/checkpoints/sync")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<SyncReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SyncReq.class),
            f -> f.withMarshaller(ImportCheckpointRequest::getBody, ImportCheckpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgentRequest, ListAgentResponse> listAgent = genForListAgent();

    private static HttpRequestDef<ListAgentRequest, ListAgentResponse> genForListAgent() {
        // basic
        HttpRequestDef.Builder<ListAgentRequest, ListAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgentRequest.class, ListAgentResponse.class)
                .withName("ListAgent")
                .withUri("/v3/{project_id}/agents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentRequest::getLimit, ListAgentRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentRequest::getOffset, ListAgentRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentRequest::getStatus, ListAgentRequest::setStatus));
        builder.<List<String>>withRequestField("agent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAgentRequest::getAgentId, ListAgentRequest::setAgentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForListBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForListBackups() {
        // basic
        HttpRequestDef.Builder<ListBackupsRequest, ListBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupsRequest.class, ListBackupsResponse.class)
                .withName("ListBackups")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("checkpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getCheckpointId, ListBackupsRequest::setCheckpointId));
        builder.<Boolean>withRequestField("dec",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBackupsRequest::getDec, ListBackupsRequest::setDec));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getEndTime, ListBackupsRequest::setEndTime));
        builder.<ListBackupsRequest.ImageTypeEnum>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.ImageTypeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getImageType, ListBackupsRequest::setImageType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getLimit, ListBackupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getMarker, ListBackupsRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getName, ListBackupsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getOffset, ListBackupsRequest::setOffset));
        builder.<String>withRequestField("resource_az",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getResourceAz, ListBackupsRequest::setResourceAz));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getResourceId, ListBackupsRequest::setResourceId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getResourceName, ListBackupsRequest::setResourceName));
        builder.<ListBackupsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getResourceType, ListBackupsRequest::setResourceType));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getSort, ListBackupsRequest::setSort));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getStartTime, ListBackupsRequest::setStartTime));
        builder.<ListBackupsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getStatus, ListBackupsRequest::setStatus));
        builder.<String>withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getVaultId, ListBackupsRequest::setVaultId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getEnterpriseProjectId,
                ListBackupsRequest::setEnterpriseProjectId));
        builder.<ListBackupsRequest.OwnTypeEnum>withRequestField("own_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.OwnTypeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getOwnType, ListBackupsRequest::setOwnType));
        builder.<ListBackupsRequest.MemberStatusEnum>withRequestField("member_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.MemberStatusEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getMemberStatus, ListBackupsRequest::setMemberStatus));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getParentId, ListBackupsRequest::setParentId));
        builder.<String>withRequestField("used_percent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getUsedPercent, ListBackupsRequest::setUsedPercent));
        builder.<Boolean>withRequestField("show_replication",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBackupsRequest::getShowReplication, ListBackupsRequest::setShowReplication));
        builder.<Boolean>withRequestField("incremental",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBackupsRequest::getIncremental, ListBackupsRequest::setIncremental));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainProjectsRequest, ListDomainProjectsResponse> listDomainProjects =
        genForListDomainProjects();

    private static HttpRequestDef<ListDomainProjectsRequest, ListDomainProjectsResponse> genForListDomainProjects() {
        // basic
        HttpRequestDef.Builder<ListDomainProjectsRequest, ListDomainProjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainProjectsRequest.class, ListDomainProjectsResponse.class)
                .withName("ListDomainProjects")
                .withUri("/v3/domain/{domain_name}/projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainProjectsRequest::getDomainName, ListDomainProjectsRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExternalVaultRequest, ListExternalVaultResponse> listExternalVault =
        genForListExternalVault();

    private static HttpRequestDef<ListExternalVaultRequest, ListExternalVaultResponse> genForListExternalVault() {
        // basic
        HttpRequestDef.Builder<ListExternalVaultRequest, ListExternalVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExternalVaultRequest.class, ListExternalVaultResponse.class)
                .withName("ListExternalVault")
                .withUri("/v3/{project_id}/vaults/external")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("external_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalVaultRequest::getExternalProjectId,
                ListExternalVaultRequest::setExternalProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExternalVaultRequest::getLimit, ListExternalVaultRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExternalVaultRequest::getOffset, ListExternalVaultRequest::setOffset));
        builder.<ListExternalVaultRequest.ProtectTypeEnum>withRequestField("protect_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListExternalVaultRequest.ProtectTypeEnum.class),
            f -> f.withMarshaller(ListExternalVaultRequest::getProtectType, ListExternalVaultRequest::setProtectType));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalVaultRequest::getRegionId, ListExternalVaultRequest::setRegionId));
        builder.<String>withRequestField("objcet_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalVaultRequest::getObjcetType, ListExternalVaultRequest::setObjcetType));
        builder.<String>withRequestField("cloud_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalVaultRequest::getCloudType, ListExternalVaultRequest::setCloudType));
        builder.<String>withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalVaultRequest::getVaultId, ListExternalVaultRequest::setVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOpLogsRequest, ListOpLogsResponse> listOpLogs = genForListOpLogs();

    private static HttpRequestDef<ListOpLogsRequest, ListOpLogsResponse> genForListOpLogs() {
        // basic
        HttpRequestDef.Builder<ListOpLogsRequest, ListOpLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOpLogsRequest.class, ListOpLogsResponse.class)
                .withName("ListOpLogs")
                .withUri("/v3/{project_id}/operation-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpLogsRequest::getEndTime, ListOpLogsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOpLogsRequest::getLimit, ListOpLogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOpLogsRequest::getOffset, ListOpLogsRequest::setOffset));
        builder.<ListOpLogsRequest.OperationTypeEnum>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOpLogsRequest.OperationTypeEnum.class),
            f -> f.withMarshaller(ListOpLogsRequest::getOperationType, ListOpLogsRequest::setOperationType));
        builder.<String>withRequestField("provider_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpLogsRequest::getProviderId, ListOpLogsRequest::setProviderId));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpLogsRequest::getResourceId, ListOpLogsRequest::setResourceId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpLogsRequest::getResourceName, ListOpLogsRequest::setResourceName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpLogsRequest::getStartTime, ListOpLogsRequest::setStartTime));
        builder.<ListOpLogsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOpLogsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListOpLogsRequest::getStatus, ListOpLogsRequest::setStatus));
        builder.<String>withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpLogsRequest::getVaultId, ListOpLogsRequest::setVaultId));
        builder.<String>withRequestField("vault_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpLogsRequest::getVaultName, ListOpLogsRequest::setVaultName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOpLogsRequest::getEnterpriseProjectId,
                ListOpLogsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> listPolicies = genForListPolicies();

    private static HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> genForListPolicies() {
        // basic
        HttpRequestDef.Builder<ListPoliciesRequest, ListPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoliciesRequest.class, ListPoliciesResponse.class)
                .withName("ListPolicies")
                .withUri("/v3/{project_id}/policies")
                .withContentType("application/json");

        // requests
        builder.<ListPoliciesRequest.OperationTypeEnum>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPoliciesRequest.OperationTypeEnum.class),
            f -> f.withMarshaller(ListPoliciesRequest::getOperationType, ListPoliciesRequest::setOperationType));
        builder.<String>withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getVaultId, ListPoliciesRequest::setVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsRequest, ListProjectsResponse> listProjects = genForListProjects();

    private static HttpRequestDef<ListProjectsRequest, ListProjectsResponse> genForListProjects() {
        // basic
        HttpRequestDef.Builder<ListProjectsRequest, ListProjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectsRequest.class, ListProjectsResponse.class)
                .withName("ListProjects")
                .withUri("/v3/region-projects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectableRequest, ListProtectableResponse> listProtectable =
        genForListProtectable();

    private static HttpRequestDef<ListProtectableRequest, ListProtectableResponse> genForListProtectable() {
        // basic
        HttpRequestDef.Builder<ListProtectableRequest, ListProtectableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProtectableRequest.class, ListProtectableResponse.class)
                .withName("ListProtectable")
                .withUri("/v3/{project_id}/protectables/{protectable_type}/instances")
                .withContentType("application/json");

        // requests
        builder.<ListProtectableRequest.ProtectableTypeEnum>withRequestField("protectable_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProtectableRequest.ProtectableTypeEnum.class),
            f -> f.withMarshaller(ListProtectableRequest::getProtectableType,
                ListProtectableRequest::setProtectableType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectableRequest::getLimit, ListProtectableRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectableRequest::getMarker, ListProtectableRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectableRequest::getName, ListProtectableRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectableRequest::getOffset, ListProtectableRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectableRequest::getStatus, ListProtectableRequest::setStatus));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectableRequest::getId, ListProtectableRequest::setId));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectableRequest::getServerId, ListProtectableRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVaultRequest, ListVaultResponse> listVault = genForListVault();

    private static HttpRequestDef<ListVaultRequest, ListVaultResponse> genForListVault() {
        // basic
        HttpRequestDef.Builder<ListVaultRequest, ListVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVaultRequest.class, ListVaultResponse.class)
                .withName("ListVault")
                .withUri("/v3/{project_id}/vaults")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVaultRequest::getLimit, ListVaultRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getName, ListVaultRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVaultRequest::getOffset, ListVaultRequest::setOffset));
        builder.<ListVaultRequest.CloudTypeEnum>withRequestField("cloud_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVaultRequest.CloudTypeEnum.class),
            f -> f.withMarshaller(ListVaultRequest::getCloudType, ListVaultRequest::setCloudType));
        builder.<ListVaultRequest.ProtectTypeEnum>withRequestField("protect_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVaultRequest.ProtectTypeEnum.class),
            f -> f.withMarshaller(ListVaultRequest::getProtectType, ListVaultRequest::setProtectType));
        builder.<String>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getObjectType, ListVaultRequest::setObjectType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getEnterpriseProjectId, ListVaultRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVaultRequest::getId, ListVaultRequest::setId));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getPolicyId, ListVaultRequest::setPolicyId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getStatus, ListVaultRequest::setStatus));
        builder.<String>withRequestField("resource_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVaultRequest::getResourceIds, ListVaultRequest::setResourceIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateDomainRequest, MigrateDomainResponse> migrateDomain =
        genForMigrateDomain();

    private static HttpRequestDef<MigrateDomainRequest, MigrateDomainResponse> genForMigrateDomain() {
        // basic
        HttpRequestDef.Builder<MigrateDomainRequest, MigrateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateDomainRequest.class, MigrateDomainResponse.class)
                .withName("MigrateDomain")
                .withUri("/v3/migrates")
                .withContentType("application/json");

        // requests
        builder.<DomainMigrate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainMigrate.class),
            f -> f.withMarshaller(MigrateDomainRequest::getBody, MigrateDomainRequest::setBody));

        // response
        builder.<Map<String, String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(MigrateDomainResponse::getBody, MigrateDomainResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<MigrateVaultResourceRequest, MigrateVaultResourceResponse> migrateVaultResource =
        genForMigrateVaultResource();

    private static HttpRequestDef<MigrateVaultResourceRequest, MigrateVaultResourceResponse> genForMigrateVaultResource() {
        // basic
        HttpRequestDef.Builder<MigrateVaultResourceRequest, MigrateVaultResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, MigrateVaultResourceRequest.class, MigrateVaultResourceResponse.class)
            .withName("MigrateVaultResource")
            .withUri("/v3/{project_id}/vaults/{vault_id}/migrateresources")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateVaultResourceRequest::getVaultId, MigrateVaultResourceRequest::setVaultId));
        builder.<VaultMigrateResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultMigrateResourceReq.class),
            f -> f.withMarshaller(MigrateVaultResourceRequest::getBody, MigrateVaultResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterAgentRequest, RegisterAgentResponse> registerAgent =
        genForRegisterAgent();

    private static HttpRequestDef<RegisterAgentRequest, RegisterAgentResponse> genForRegisterAgent() {
        // basic
        HttpRequestDef.Builder<RegisterAgentRequest, RegisterAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterAgentRequest.class, RegisterAgentResponse.class)
                .withName("RegisterAgent")
                .withUri("/v3/{project_id}/agents")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AgentRegisterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentRegisterReq.class),
            f -> f.withMarshaller(RegisterAgentRequest::getBody, RegisterAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveAgentPathRequest, RemoveAgentPathResponse> removeAgentPath =
        genForRemoveAgentPath();

    private static HttpRequestDef<RemoveAgentPathRequest, RemoveAgentPathResponse> genForRemoveAgentPath() {
        // basic
        HttpRequestDef.Builder<RemoveAgentPathRequest, RemoveAgentPathResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveAgentPathRequest.class, RemoveAgentPathResponse.class)
                .withName("RemoveAgentPath")
                .withUri("/v3/{project_id}/agents/{agent_id}/remove-path")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAgentPathRequest::getAgentId, RemoveAgentPathRequest::setAgentId));
        builder.<AgentRemovePathReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentRemovePathReq.class),
            f -> f.withMarshaller(RemoveAgentPathRequest::getBody, RemoveAgentPathRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveVaultResourceRequest, RemoveVaultResourceResponse> removeVaultResource =
        genForRemoveVaultResource();

    private static HttpRequestDef<RemoveVaultResourceRequest, RemoveVaultResourceResponse> genForRemoveVaultResource() {
        // basic
        HttpRequestDef.Builder<RemoveVaultResourceRequest, RemoveVaultResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveVaultResourceRequest.class, RemoveVaultResourceResponse.class)
                .withName("RemoveVaultResource")
                .withUri("/v3/{project_id}/vaults/{vault_id}/removeresources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveVaultResourceRequest::getVaultId, RemoveVaultResourceRequest::setVaultId));
        builder.<VaultRemoveResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultRemoveResourceReq.class),
            f -> f.withMarshaller(RemoveVaultResourceRequest::getBody, RemoveVaultResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> restoreBackup =
        genForRestoreBackup();

    private static HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> genForRestoreBackup() {
        // basic
        HttpRequestDef.Builder<RestoreBackupRequest, RestoreBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreBackupRequest.class, RestoreBackupResponse.class)
                .withName("RestoreBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}/restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBackupRequest::getBackupId, RestoreBackupRequest::setBackupId));
        builder.<BackupRestoreReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BackupRestoreReq.class),
            f -> f.withMarshaller(RestoreBackupRequest::getBody, RestoreBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetVaultResourceRequest, SetVaultResourceResponse> setVaultResource =
        genForSetVaultResource();

    private static HttpRequestDef<SetVaultResourceRequest, SetVaultResourceResponse> genForSetVaultResource() {
        // basic
        HttpRequestDef.Builder<SetVaultResourceRequest, SetVaultResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetVaultResourceRequest.class, SetVaultResourceResponse.class)
                .withName("SetVaultResource")
                .withUri("/v3/{project_id}/vaults/{vault_id}/set-resources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetVaultResourceRequest::getVaultId, SetVaultResourceRequest::setVaultId));
        builder.<VaultSetResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultSetResourceReq.class),
            f -> f.withMarshaller(SetVaultResourceRequest::getBody, SetVaultResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentRequest, ShowAgentResponse> showAgent = genForShowAgent();

    private static HttpRequestDef<ShowAgentRequest, ShowAgentResponse> genForShowAgent() {
        // basic
        HttpRequestDef.Builder<ShowAgentRequest, ShowAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgentRequest.class, ShowAgentResponse.class)
                .withName("ShowAgent")
                .withUri("/v3/{project_id}/agents/{agent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAgentRequest::getAgentId, ShowAgentRequest::setAgentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupRequest, ShowBackupResponse> showBackup = genForShowBackup();

    private static HttpRequestDef<ShowBackupRequest, ShowBackupResponse> genForShowBackup() {
        // basic
        HttpRequestDef.Builder<ShowBackupRequest, ShowBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupRequest.class, ShowBackupResponse.class)
                .withName("ShowBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRequest::getBackupId, ShowBackupRequest::setBackupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpoint =
        genForShowCheckpoint();

    private static HttpRequestDef<ShowCheckpointRequest, ShowCheckpointResponse> genForShowCheckpoint() {
        // basic
        HttpRequestDef.Builder<ShowCheckpointRequest, ShowCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCheckpointRequest.class, ShowCheckpointResponse.class)
                .withName("ShowCheckpoint")
                .withUri("/v3/{project_id}/checkpoints/{checkpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("checkpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckpointRequest::getCheckpointId, ShowCheckpointRequest::setCheckpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainRequest, ShowDomainResponse> showDomain = genForShowDomain();

    private static HttpRequestDef<ShowDomainRequest, ShowDomainResponse> genForShowDomain() {
        // basic
        HttpRequestDef.Builder<ShowDomainRequest, ShowDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainRequest.class, ShowDomainResponse.class)
                .withName("ShowDomain")
                .withUri("/v3/domain/{source_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRequest::getSourceProjectId, ShowDomainRequest::setSourceProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberDetailRequest, ShowMemberDetailResponse> showMemberDetail =
        genForShowMemberDetail();

    private static HttpRequestDef<ShowMemberDetailRequest, ShowMemberDetailResponse> genForShowMemberDetail() {
        // basic
        HttpRequestDef.Builder<ShowMemberDetailRequest, ShowMemberDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMemberDetailRequest.class, ShowMemberDetailResponse.class)
                .withName("ShowMemberDetail")
                .withUri("/v3/{project_id}/backups/{backup_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberDetailRequest::getBackupId, ShowMemberDetailRequest::setBackupId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberDetailRequest::getMemberId, ShowMemberDetailRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMembersDetailRequest, ShowMembersDetailResponse> showMembersDetail =
        genForShowMembersDetail();

    private static HttpRequestDef<ShowMembersDetailRequest, ShowMembersDetailResponse> genForShowMembersDetail() {
        // basic
        HttpRequestDef.Builder<ShowMembersDetailRequest, ShowMembersDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMembersDetailRequest.class, ShowMembersDetailResponse.class)
                .withName("ShowMembersDetail")
                .withUri("/v3/{project_id}/backups/{backup_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getBackupId, ShowMembersDetailRequest::setBackupId));
        builder.<String>withRequestField("dest_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getDestProjectId,
                ShowMembersDetailRequest::setDestProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getImageId, ShowMembersDetailRequest::setImageId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getStatus, ShowMembersDetailRequest::setStatus));
        builder.<String>withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getVaultId, ShowMembersDetailRequest::setVaultId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getLimit, ShowMembersDetailRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getMarker, ShowMembersDetailRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getOffset, ShowMembersDetailRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMembersDetailRequest::getSort, ShowMembersDetailRequest::setSort));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetadataRequest, ShowMetadataResponse> showMetadata = genForShowMetadata();

    private static HttpRequestDef<ShowMetadataRequest, ShowMetadataResponse> genForShowMetadata() {
        // basic
        HttpRequestDef.Builder<ShowMetadataRequest, ShowMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetadataRequest.class, ShowMetadataResponse.class)
                .withName("ShowMetadata")
                .withUri("/v3/{project_id}/backups/{backup_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetadataRequest::getBackupId, ShowMetadataRequest::setBackupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrateStatusRequest, ShowMigrateStatusResponse> showMigrateStatus =
        genForShowMigrateStatus();

    private static HttpRequestDef<ShowMigrateStatusRequest, ShowMigrateStatusResponse> genForShowMigrateStatus() {
        // basic
        HttpRequestDef.Builder<ShowMigrateStatusRequest, ShowMigrateStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMigrateStatusRequest.class, ShowMigrateStatusResponse.class)
                .withName("ShowMigrateStatus")
                .withUri("/v3/migrates")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("all_regions",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowMigrateStatusRequest::getAllRegions, ShowMigrateStatusRequest::setAllRegions));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOpLogRequest, ShowOpLogResponse> showOpLog = genForShowOpLog();

    private static HttpRequestDef<ShowOpLogRequest, ShowOpLogResponse> genForShowOpLog() {
        // basic
        HttpRequestDef.Builder<ShowOpLogRequest, ShowOpLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOpLogRequest.class, ShowOpLogResponse.class)
                .withName("ShowOpLog")
                .withUri("/v3/{project_id}/operation-logs/{operation_log_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("operation_log_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpLogRequest::getOperationLogId, ShowOpLogRequest::setOperationLogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForShowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForShowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v3/{project_id}/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, ShowPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProtectableRequest, ShowProtectableResponse> showProtectable =
        genForShowProtectable();

    private static HttpRequestDef<ShowProtectableRequest, ShowProtectableResponse> genForShowProtectable() {
        // basic
        HttpRequestDef.Builder<ShowProtectableRequest, ShowProtectableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProtectableRequest.class, ShowProtectableResponse.class)
                .withName("ShowProtectable")
                .withUri("/v3/{project_id}/protectables/{protectable_type}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProtectableRequest::getInstanceId, ShowProtectableRequest::setInstanceId));
        builder.<ShowProtectableRequest.ProtectableTypeEnum>withRequestField("protectable_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowProtectableRequest.ProtectableTypeEnum.class),
            f -> f.withMarshaller(ShowProtectableRequest::getProtectableType,
                ShowProtectableRequest::setProtectableType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> showReplicationCapabilities =
        genForShowReplicationCapabilities();

    private static HttpRequestDef<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> genForShowReplicationCapabilities() {
        // basic
        HttpRequestDef.Builder<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowReplicationCapabilitiesRequest.class,
                    ShowReplicationCapabilitiesResponse.class)
                .withName("ShowReplicationCapabilities")
                .withUri("/v3/{project_id}/replication-capabilities")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStorageUsageRequest, ShowStorageUsageResponse> showStorageUsage =
        genForShowStorageUsage();

    private static HttpRequestDef<ShowStorageUsageRequest, ShowStorageUsageResponse> genForShowStorageUsage() {
        // basic
        HttpRequestDef.Builder<ShowStorageUsageRequest, ShowStorageUsageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStorageUsageRequest.class, ShowStorageUsageResponse.class)
                .withName("ShowStorageUsage")
                .withUri("/v3/{project_id}/storage_usage")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStorageUsageRequest::getLimit, ShowStorageUsageRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStorageUsageRequest::getOffset, ShowStorageUsageRequest::setOffset));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStorageUsageRequest::getResourceId, ShowStorageUsageRequest::setResourceId));
        builder.<ShowStorageUsageRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowStorageUsageRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowStorageUsageRequest::getResourceType, ShowStorageUsageRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSummaryRequest, ShowSummaryResponse> showSummary = genForShowSummary();

    private static HttpRequestDef<ShowSummaryRequest, ShowSummaryResponse> genForShowSummary() {
        // basic
        HttpRequestDef.Builder<ShowSummaryRequest, ShowSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSummaryRequest.class, ShowSummaryResponse.class)
                .withName("ShowSummary")
                .withUri("/v3/{project_id}/vaults/summary")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultRequest, ShowVaultResponse> showVault = genForShowVault();

    private static HttpRequestDef<ShowVaultRequest, ShowVaultResponse> genForShowVault() {
        // basic
        HttpRequestDef.Builder<ShowVaultRequest, ShowVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVaultRequest.class, ShowVaultResponse.class)
                .withName("ShowVault")
                .withUri("/v3/{project_id}/vaults/{vault_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultRequest::getVaultId, ShowVaultRequest::setVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> showVaultProjectTag =
        genForShowVaultProjectTag();

    private static HttpRequestDef<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> genForShowVaultProjectTag() {
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

    public static final HttpRequestDef<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> showVaultResourceInstances =
        genForShowVaultResourceInstances();

    private static HttpRequestDef<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> genForShowVaultResourceInstances() {
        // basic
        HttpRequestDef.Builder<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowVaultResourceInstancesRequest.class,
                    ShowVaultResourceInstancesResponse.class)
                .withName("ShowVaultResourceInstances")
                .withUri("/v3/{project_id}/vault/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VaultResourceInstancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultResourceInstancesReq.class),
            f -> f.withMarshaller(ShowVaultResourceInstancesRequest::getBody,
                ShowVaultResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVaultTagRequest, ShowVaultTagResponse> showVaultTag = genForShowVaultTag();

    private static HttpRequestDef<ShowVaultTagRequest, ShowVaultTagResponse> genForShowVaultTag() {
        // basic
        HttpRequestDef.Builder<ShowVaultTagRequest, ShowVaultTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVaultTagRequest.class, ShowVaultTagResponse.class)
                .withName("ShowVaultTag")
                .withUri("/v3/{project_id}/vault/{vault_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVaultTagRequest::getVaultId, ShowVaultTagRequest::setVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnregisterAgentRequest, UnregisterAgentResponse> unregisterAgent =
        genForUnregisterAgent();

    private static HttpRequestDef<UnregisterAgentRequest, UnregisterAgentResponse> genForUnregisterAgent() {
        // basic
        HttpRequestDef.Builder<UnregisterAgentRequest, UnregisterAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, UnregisterAgentRequest.class, UnregisterAgentResponse.class)
                .withName("UnregisterAgent")
                .withUri("/v3/{project_id}/agents/{agent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnregisterAgentRequest::getAgentId, UnregisterAgentRequest::setAgentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgentRequest, UpdateAgentResponse> updateAgent = genForUpdateAgent();

    private static HttpRequestDef<UpdateAgentRequest, UpdateAgentResponse> genForUpdateAgent() {
        // basic
        HttpRequestDef.Builder<UpdateAgentRequest, UpdateAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAgentRequest.class, UpdateAgentResponse.class)
                .withName("UpdateAgent")
                .withUri("/v3/{project_id}/agents/{agent_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgentRequest::getAgentId, UpdateAgentRequest::setAgentId));
        builder.<AgentUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentUpdateReq.class),
            f -> f.withMarshaller(UpdateAgentRequest::getBody, UpdateAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBackupRequest, UpdateBackupResponse> updateBackup = genForUpdateBackup();

    private static HttpRequestDef<UpdateBackupRequest, UpdateBackupResponse> genForUpdateBackup() {
        // basic
        HttpRequestDef.Builder<UpdateBackupRequest, UpdateBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBackupRequest.class, UpdateBackupResponse.class)
                .withName("UpdateBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupRequest::getBackupId, UpdateBackupRequest::setBackupId));
        builder.<BackupUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BackupUpdateReq.class),
            f -> f.withMarshaller(UpdateBackupRequest::getBody, UpdateBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberStatusRequest, UpdateMemberStatusResponse> updateMemberStatus =
        genForUpdateMemberStatus();

    private static HttpRequestDef<UpdateMemberStatusRequest, UpdateMemberStatusResponse> genForUpdateMemberStatus() {
        // basic
        HttpRequestDef.Builder<UpdateMemberStatusRequest, UpdateMemberStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberStatusRequest.class, UpdateMemberStatusResponse.class)
                .withName("UpdateMemberStatus")
                .withUri("/v3/{project_id}/backups/{backup_id}/members/{member_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberStatusRequest::getMemberId, UpdateMemberStatusRequest::setMemberId));
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberStatusRequest::getBackupId, UpdateMemberStatusRequest::setBackupId));
        builder.<UpdateMember>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateMember.class),
            f -> f.withMarshaller(UpdateMemberStatusRequest::getBody, UpdateMemberStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOrderRequest, UpdateOrderResponse> updateOrder = genForUpdateOrder();

    private static HttpRequestDef<UpdateOrderRequest, UpdateOrderResponse> genForUpdateOrder() {
        // basic
        HttpRequestDef.Builder<UpdateOrderRequest, UpdateOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateOrderRequest.class, UpdateOrderResponse.class)
                .withName("UpdateOrder")
                .withUri("/v3/{project_id}/orders/{order_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("order_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOrderRequest::getOrderId, UpdateOrderRequest::setOrderId));
        builder.<CbcUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CbcUpdate.class),
            f -> f.withMarshaller(UpdateOrderRequest::getBody, UpdateOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForUpdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForUpdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v3/{project_id}/policies/{policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, UpdatePolicyRequest::setPolicyId));
        builder.<PolicyUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyUpdateReq.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, UpdatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVaultRequest, UpdateVaultResponse> updateVault = genForUpdateVault();

    private static HttpRequestDef<UpdateVaultRequest, UpdateVaultResponse> genForUpdateVault() {
        // basic
        HttpRequestDef.Builder<UpdateVaultRequest, UpdateVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVaultRequest.class, UpdateVaultResponse.class)
                .withName("UpdateVault")
                .withUri("/v3/{project_id}/vaults/{vault_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVaultRequest::getVaultId, UpdateVaultRequest::setVaultId));
        builder.<VaultUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VaultUpdateReq.class),
            f -> f.withMarshaller(UpdateVaultRequest::getBody, UpdateVaultRequest::setBody));

        // response

        return builder.build();
    }

}
